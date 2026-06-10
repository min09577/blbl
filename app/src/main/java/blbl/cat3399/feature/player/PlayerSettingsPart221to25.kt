package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v316: Volume Normalize Mode298
internal fun PlayerActivity.showV316VolumeNormalizeMode298Toggle() {
    val current = BiliClient.prefs.v316volumeNormalizeMode298
    BiliClient.prefs.v316volumeNormalizeMode298 = !current
    AppToast.show(this, "Volume Normalize Mode298: ${if (!current) "ON" else "OFF"}")
}

// v316: History Auto Clean298
internal fun PlayerActivity.showV316HistoryAutoClean298Toggle() {
    val current = BiliClient.prefs.v316historyAutoClean298
    BiliClient.prefs.v316historyAutoClean298 = !current
    AppToast.show(this, "History Auto Clean298: ${if (!current) "ON" else "OFF"}")
}

// v316: Playback Resume From Background298
internal fun PlayerActivity.showV316PlaybackResumeFromBackground298Toggle() {
    val current = BiliClient.prefs.v316playbackResumeFromBackground298
    BiliClient.prefs.v316playbackResumeFromBackground298 = !current
    AppToast.show(this, "Playback Resume From Background298: ${if (!current) "ON" else "OFF"}")
}

// v316: Screenshot Enhance298
internal fun PlayerActivity.showV316ScreenshotEnhance298Toggle() {
    val current = BiliClient.prefs.v316screenshotEnhance298
    BiliClient.prefs.v316screenshotEnhance298 = !current
    AppToast.show(this, "Screenshot Enhance298: ${if (!current) "ON" else "OFF"}")
}

// v316: Video HDR298
internal fun PlayerActivity.showV316VideoHDR298Toggle() {
    val current = BiliClient.prefs.v316videoHDR298
    BiliClient.prefs.v316videoHDR298 = !current
    AppToast.show(this, "Video HDR298: ${if (!current) "ON" else "OFF"}")
}

// v316: Danmaku Bottom Max Count440
internal fun PlayerActivity.showV316DanmakuBottomMaxCount440Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316danmakuBottomMaxCount440).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count440",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316danmakuBottomMaxCount440 = value
        AppToast.show(this, "Danmaku Bottom Max Count440: $value")
    }
}

// v316: Subtitle Fade In304
internal fun PlayerActivity.showV316SubtitleFadeIn304Toggle() {
    val current = BiliClient.prefs.v316subtitleFadeIn304
    BiliClient.prefs.v316subtitleFadeIn304 = !current
    AppToast.show(this, "Subtitle Fade In304: ${if (!current) "ON" else "OFF"}")
}

// v317: Audio Compressor Ratio299
internal fun PlayerActivity.showV317AudioCompressorRatio299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317audioCompressorRatio299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317audioCompressorRatio299 = value
        AppToast.show(this, "Audio Compressor Ratio299: $value")
    }
}

// v317: Danmaku Bottom Max Count441
internal fun PlayerActivity.showV317DanmakuBottomMaxCount441Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317danmakuBottomMaxCount441).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count441",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317danmakuBottomMaxCount441 = value
        AppToast.show(this, "Danmaku Bottom Max Count441: $value")
    }
}

// v317: Subtitle Fade In305
internal fun PlayerActivity.showV317SubtitleFadeIn305Toggle() {
    val current = BiliClient.prefs.v317subtitleFadeIn305
    BiliClient.prefs.v317subtitleFadeIn305 = !current
    AppToast.show(this, "Subtitle Fade In305: ${if (!current) "ON" else "OFF"}")
}

// v317: Gesture Shake Sensitivity299
internal fun PlayerActivity.showV317GestureShakeSensitivity299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317gestureShakeSensitivity299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317gestureShakeSensitivity299 = value
        AppToast.show(this, "Gesture Shake Sensitivity299: $value")
    }
}

// v317: Cast Bitrate299
internal fun PlayerActivity.showV317CastBitrate299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317castBitrate299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317castBitrate299 = value
        AppToast.show(this, "Cast Bitrate299: $value")
    }
}

// v317: Playlist Auto Next299
internal fun PlayerActivity.showV317PlaylistAutoNext299Toggle() {
    val current = BiliClient.prefs.v317playlistAutoNext299
    BiliClient.prefs.v317playlistAutoNext299 = !current
    AppToast.show(this, "Playlist Auto Next299: ${if (!current) "ON" else "OFF"}")
}

// v317: Cache Preload Size300
internal fun PlayerActivity.showV317CachePreloadSize300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317cachePreloadSize300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317cachePreloadSize300 = value
        AppToast.show(this, "Cache Preload Size300: $value")
    }
}

// v317: Progress Bar Style299
internal fun PlayerActivity.showV317ProgressBarStyle299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317progressBarStyle299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317progressBarStyle299 = value
        AppToast.show(this, "Progress Bar Style299: $value")
    }
}

// v317: Volume Normalize Mode299
internal fun PlayerActivity.showV317VolumeNormalizeMode299Toggle() {
    val current = BiliClient.prefs.v317volumeNormalizeMode299
    BiliClient.prefs.v317volumeNormalizeMode299 = !current
    AppToast.show(this, "Volume Normalize Mode299: ${if (!current) "ON" else "OFF"}")
}

// v317: History Auto Clean299
internal fun PlayerActivity.showV317HistoryAutoClean299Toggle() {
    val current = BiliClient.prefs.v317historyAutoClean299
    BiliClient.prefs.v317historyAutoClean299 = !current
    AppToast.show(this, "History Auto Clean299: ${if (!current) "ON" else "OFF"}")
}

// v317: Playback Resume From Background299
internal fun PlayerActivity.showV317PlaybackResumeFromBackground299Toggle() {
    val current = BiliClient.prefs.v317playbackResumeFromBackground299
    BiliClient.prefs.v317playbackResumeFromBackground299 = !current
    AppToast.show(this, "Playback Resume From Background299: ${if (!current) "ON" else "OFF"}")
}

// v317: Screenshot Enhance299
internal fun PlayerActivity.showV317ScreenshotEnhance299Toggle() {
    val current = BiliClient.prefs.v317screenshotEnhance299
    BiliClient.prefs.v317screenshotEnhance299 = !current
    AppToast.show(this, "Screenshot Enhance299: ${if (!current) "ON" else "OFF"}")
}

// v317: Video HDR299
internal fun PlayerActivity.showV317VideoHDR299Toggle() {
    val current = BiliClient.prefs.v317videoHDR299
    BiliClient.prefs.v317videoHDR299 = !current
    AppToast.show(this, "Video HDR299: ${if (!current) "ON" else "OFF"}")
}

// v317: Danmaku Bottom Max Count442
internal fun PlayerActivity.showV317DanmakuBottomMaxCount442Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v317danmakuBottomMaxCount442).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count442",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v317danmakuBottomMaxCount442 = value
        AppToast.show(this, "Danmaku Bottom Max Count442: $value")
    }
}

// v317: Subtitle Fade In306
internal fun PlayerActivity.showV317SubtitleFadeIn306Toggle() {
    val current = BiliClient.prefs.v317subtitleFadeIn306
    BiliClient.prefs.v317subtitleFadeIn306 = !current
    AppToast.show(this, "Subtitle Fade In306: ${if (!current) "ON" else "OFF"}")
}

// v318: Audio Compressor Ratio300
internal fun PlayerActivity.showV318AudioCompressorRatio300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318audioCompressorRatio300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318audioCompressorRatio300 = value
        AppToast.show(this, "Audio Compressor Ratio300: $value")
    }
}

// v318: Danmaku Bottom Max Count443
internal fun PlayerActivity.showV318DanmakuBottomMaxCount443Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318danmakuBottomMaxCount443).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count443",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318danmakuBottomMaxCount443 = value
        AppToast.show(this, "Danmaku Bottom Max Count443: $value")
    }
}

// v318: Subtitle Fade In307
internal fun PlayerActivity.showV318SubtitleFadeIn307Toggle() {
    val current = BiliClient.prefs.v318subtitleFadeIn307
    BiliClient.prefs.v318subtitleFadeIn307 = !current
    AppToast.show(this, "Subtitle Fade In307: ${if (!current) "ON" else "OFF"}")
}

// v318: Gesture Shake Sensitivity300
internal fun PlayerActivity.showV318GestureShakeSensitivity300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318gestureShakeSensitivity300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318gestureShakeSensitivity300 = value
        AppToast.show(this, "Gesture Shake Sensitivity300: $value")
    }
}

// v318: Cast Bitrate300
internal fun PlayerActivity.showV318CastBitrate300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318castBitrate300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318castBitrate300 = value
        AppToast.show(this, "Cast Bitrate300: $value")
    }
}

// v318: Playlist Auto Next300
internal fun PlayerActivity.showV318PlaylistAutoNext300Toggle() {
    val current = BiliClient.prefs.v318playlistAutoNext300
    BiliClient.prefs.v318playlistAutoNext300 = !current
    AppToast.show(this, "Playlist Auto Next300: ${if (!current) "ON" else "OFF"}")
}

// v318: Cache Preload Size301
internal fun PlayerActivity.showV318CachePreloadSize301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318cachePreloadSize301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318cachePreloadSize301 = value
        AppToast.show(this, "Cache Preload Size301: $value")
    }
}

// v318: Progress Bar Style300
internal fun PlayerActivity.showV318ProgressBarStyle300Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318progressBarStyle300).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style300",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318progressBarStyle300 = value
        AppToast.show(this, "Progress Bar Style300: $value")
    }
}

// v318: Volume Normalize Mode300
internal fun PlayerActivity.showV318VolumeNormalizeMode300Toggle() {
    val current = BiliClient.prefs.v318volumeNormalizeMode300
    BiliClient.prefs.v318volumeNormalizeMode300 = !current
    AppToast.show(this, "Volume Normalize Mode300: ${if (!current) "ON" else "OFF"}")
}

// v318: History Auto Clean300
internal fun PlayerActivity.showV318HistoryAutoClean300Toggle() {
    val current = BiliClient.prefs.v318historyAutoClean300
    BiliClient.prefs.v318historyAutoClean300 = !current
    AppToast.show(this, "History Auto Clean300: ${if (!current) "ON" else "OFF"}")
}

// v318: Playback Resume From Background300
internal fun PlayerActivity.showV318PlaybackResumeFromBackground300Toggle() {
    val current = BiliClient.prefs.v318playbackResumeFromBackground300
    BiliClient.prefs.v318playbackResumeFromBackground300 = !current
    AppToast.show(this, "Playback Resume From Background300: ${if (!current) "ON" else "OFF"}")
}

// v318: Screenshot Enhance300
internal fun PlayerActivity.showV318ScreenshotEnhance300Toggle() {
    val current = BiliClient.prefs.v318screenshotEnhance300
    BiliClient.prefs.v318screenshotEnhance300 = !current
    AppToast.show(this, "Screenshot Enhance300: ${if (!current) "ON" else "OFF"}")
}

// v318: Video HDR300
internal fun PlayerActivity.showV318VideoHDR300Toggle() {
    val current = BiliClient.prefs.v318videoHDR300
    BiliClient.prefs.v318videoHDR300 = !current
    AppToast.show(this, "Video HDR300: ${if (!current) "ON" else "OFF"}")
}

// v318: Danmaku Bottom Max Count444
internal fun PlayerActivity.showV318DanmakuBottomMaxCount444Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v318danmakuBottomMaxCount444).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count444",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v318danmakuBottomMaxCount444 = value
        AppToast.show(this, "Danmaku Bottom Max Count444: $value")
    }
}

// v318: Subtitle Fade In308
internal fun PlayerActivity.showV318SubtitleFadeIn308Toggle() {
    val current = BiliClient.prefs.v318subtitleFadeIn308
    BiliClient.prefs.v318subtitleFadeIn308 = !current
    AppToast.show(this, "Subtitle Fade In308: ${if (!current) "ON" else "OFF"}")
}

// v319: Audio Compressor Ratio301
internal fun PlayerActivity.showV319AudioCompressorRatio301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319audioCompressorRatio301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319audioCompressorRatio301 = value
        AppToast.show(this, "Audio Compressor Ratio301: $value")
    }
}

// v319: Danmaku Bottom Max Count445
internal fun PlayerActivity.showV319DanmakuBottomMaxCount445Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319danmakuBottomMaxCount445).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count445",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319danmakuBottomMaxCount445 = value
        AppToast.show(this, "Danmaku Bottom Max Count445: $value")
    }
}

// v319: Subtitle Fade In309
internal fun PlayerActivity.showV319SubtitleFadeIn309Toggle() {
    val current = BiliClient.prefs.v319subtitleFadeIn309
    BiliClient.prefs.v319subtitleFadeIn309 = !current
    AppToast.show(this, "Subtitle Fade In309: ${if (!current) "ON" else "OFF"}")
}

// v319: Gesture Shake Sensitivity301
internal fun PlayerActivity.showV319GestureShakeSensitivity301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319gestureShakeSensitivity301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319gestureShakeSensitivity301 = value
        AppToast.show(this, "Gesture Shake Sensitivity301: $value")
    }
}

// v319: Cast Bitrate301
internal fun PlayerActivity.showV319CastBitrate301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319castBitrate301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319castBitrate301 = value
        AppToast.show(this, "Cast Bitrate301: $value")
    }
}

// v319: Playlist Auto Next301
internal fun PlayerActivity.showV319PlaylistAutoNext301Toggle() {
    val current = BiliClient.prefs.v319playlistAutoNext301
    BiliClient.prefs.v319playlistAutoNext301 = !current
    AppToast.show(this, "Playlist Auto Next301: ${if (!current) "ON" else "OFF"}")
}

// v319: Cache Preload Size302
internal fun PlayerActivity.showV319CachePreloadSize302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319cachePreloadSize302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319cachePreloadSize302 = value
        AppToast.show(this, "Cache Preload Size302: $value")
    }
}

// v319: Progress Bar Style301
internal fun PlayerActivity.showV319ProgressBarStyle301Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319progressBarStyle301).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style301",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319progressBarStyle301 = value
        AppToast.show(this, "Progress Bar Style301: $value")
    }
}

// v319: Volume Normalize Mode301
internal fun PlayerActivity.showV319VolumeNormalizeMode301Toggle() {
    val current = BiliClient.prefs.v319volumeNormalizeMode301
    BiliClient.prefs.v319volumeNormalizeMode301 = !current
    AppToast.show(this, "Volume Normalize Mode301: ${if (!current) "ON" else "OFF"}")
}

// v319: History Auto Clean301
internal fun PlayerActivity.showV319HistoryAutoClean301Toggle() {
    val current = BiliClient.prefs.v319historyAutoClean301
    BiliClient.prefs.v319historyAutoClean301 = !current
    AppToast.show(this, "History Auto Clean301: ${if (!current) "ON" else "OFF"}")
}

// v319: Playback Resume From Background301
internal fun PlayerActivity.showV319PlaybackResumeFromBackground301Toggle() {
    val current = BiliClient.prefs.v319playbackResumeFromBackground301
    BiliClient.prefs.v319playbackResumeFromBackground301 = !current
    AppToast.show(this, "Playback Resume From Background301: ${if (!current) "ON" else "OFF"}")
}

// v319: Screenshot Enhance301
internal fun PlayerActivity.showV319ScreenshotEnhance301Toggle() {
    val current = BiliClient.prefs.v319screenshotEnhance301
    BiliClient.prefs.v319screenshotEnhance301 = !current
    AppToast.show(this, "Screenshot Enhance301: ${if (!current) "ON" else "OFF"}")
}

// v319: Video HDR301
internal fun PlayerActivity.showV319VideoHDR301Toggle() {
    val current = BiliClient.prefs.v319videoHDR301
    BiliClient.prefs.v319videoHDR301 = !current
    AppToast.show(this, "Video HDR301: ${if (!current) "ON" else "OFF"}")
}

// v319: Danmaku Bottom Max Count446
internal fun PlayerActivity.showV319DanmakuBottomMaxCount446Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v319danmakuBottomMaxCount446).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count446",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v319danmakuBottomMaxCount446 = value
        AppToast.show(this, "Danmaku Bottom Max Count446: $value")
    }
}

// v319: Subtitle Fade In310
internal fun PlayerActivity.showV319SubtitleFadeIn310Toggle() {
    val current = BiliClient.prefs.v319subtitleFadeIn310
    BiliClient.prefs.v319subtitleFadeIn310 = !current
    AppToast.show(this, "Subtitle Fade In310: ${if (!current) "ON" else "OFF"}")
}

// v320: Audio Compressor Ratio302
internal fun PlayerActivity.showV320AudioCompressorRatio302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320audioCompressorRatio302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320audioCompressorRatio302 = value
        AppToast.show(this, "Audio Compressor Ratio302: $value")
    }
}

// v320: Danmaku Bottom Max Count447
internal fun PlayerActivity.showV320DanmakuBottomMaxCount447Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320danmakuBottomMaxCount447).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count447",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320danmakuBottomMaxCount447 = value
        AppToast.show(this, "Danmaku Bottom Max Count447: $value")
    }
}

// v320: Subtitle Fade In311
internal fun PlayerActivity.showV320SubtitleFadeIn311Toggle() {
    val current = BiliClient.prefs.v320subtitleFadeIn311
    BiliClient.prefs.v320subtitleFadeIn311 = !current
    AppToast.show(this, "Subtitle Fade In311: ${if (!current) "ON" else "OFF"}")
}

// v320: Gesture Shake Sensitivity302
internal fun PlayerActivity.showV320GestureShakeSensitivity302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320gestureShakeSensitivity302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320gestureShakeSensitivity302 = value
        AppToast.show(this, "Gesture Shake Sensitivity302: $value")
    }
}

// v320: Cast Bitrate302
internal fun PlayerActivity.showV320CastBitrate302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320castBitrate302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320castBitrate302 = value
        AppToast.show(this, "Cast Bitrate302: $value")
    }
}

// v320: Playlist Auto Next302
internal fun PlayerActivity.showV320PlaylistAutoNext302Toggle() {
    val current = BiliClient.prefs.v320playlistAutoNext302
    BiliClient.prefs.v320playlistAutoNext302 = !current
    AppToast.show(this, "Playlist Auto Next302: ${if (!current) "ON" else "OFF"}")
}

// v320: Cache Preload Size303
internal fun PlayerActivity.showV320CachePreloadSize303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320cachePreloadSize303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320cachePreloadSize303 = value
        AppToast.show(this, "Cache Preload Size303: $value")
    }
}

// v320: Progress Bar Style302
internal fun PlayerActivity.showV320ProgressBarStyle302Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320progressBarStyle302).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style302",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320progressBarStyle302 = value
        AppToast.show(this, "Progress Bar Style302: $value")
    }
}

// v320: Volume Normalize Mode302
internal fun PlayerActivity.showV320VolumeNormalizeMode302Toggle() {
    val current = BiliClient.prefs.v320volumeNormalizeMode302
    BiliClient.prefs.v320volumeNormalizeMode302 = !current
    AppToast.show(this, "Volume Normalize Mode302: ${if (!current) "ON" else "OFF"}")
}

// v320: History Auto Clean302
internal fun PlayerActivity.showV320HistoryAutoClean302Toggle() {
    val current = BiliClient.prefs.v320historyAutoClean302
    BiliClient.prefs.v320historyAutoClean302 = !current
    AppToast.show(this, "History Auto Clean302: ${if (!current) "ON" else "OFF"}")
}

// v320: Playback Resume From Background302
internal fun PlayerActivity.showV320PlaybackResumeFromBackground302Toggle() {
    val current = BiliClient.prefs.v320playbackResumeFromBackground302
    BiliClient.prefs.v320playbackResumeFromBackground302 = !current
    AppToast.show(this, "Playback Resume From Background302: ${if (!current) "ON" else "OFF"}")
}

// v320: Screenshot Enhance302
internal fun PlayerActivity.showV320ScreenshotEnhance302Toggle() {
    val current = BiliClient.prefs.v320screenshotEnhance302
    BiliClient.prefs.v320screenshotEnhance302 = !current
    AppToast.show(this, "Screenshot Enhance302: ${if (!current) "ON" else "OFF"}")
}

// v320: Video HDR302
internal fun PlayerActivity.showV320VideoHDR302Toggle() {
    val current = BiliClient.prefs.v320videoHDR302
    BiliClient.prefs.v320videoHDR302 = !current
    AppToast.show(this, "Video HDR302: ${if (!current) "ON" else "OFF"}")
}

// v320: Danmaku Bottom Max Count448
internal fun PlayerActivity.showV320DanmakuBottomMaxCount448Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v320danmakuBottomMaxCount448).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count448",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v320danmakuBottomMaxCount448 = value
        AppToast.show(this, "Danmaku Bottom Max Count448: $value")
    }
}

// v320: Subtitle Fade In312
internal fun PlayerActivity.showV320SubtitleFadeIn312Toggle() {
    val current = BiliClient.prefs.v320subtitleFadeIn312
    BiliClient.prefs.v320subtitleFadeIn312 = !current
    AppToast.show(this, "Subtitle Fade In312: ${if (!current) "ON" else "OFF"}")
}

// v321: Audio Dynamic Range303
internal fun PlayerActivity.showV321AudioDynamicRange303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321audioDynamicRange303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321audioDynamicRange303 = value
        AppToast.show(this, "Audio Dynamic Range303: $value")
    }
}

// v321: Danmaku Top Count Max303
internal fun PlayerActivity.showV321DanmakuTopCountMax303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax303 = value
        AppToast.show(this, "Danmaku Top Count Max303: $value")
    }
}

// v321: Subtitle Stroke Width303
internal fun PlayerActivity.showV321SubtitleStrokeWidth303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth303 = value
        AppToast.show(this, "Subtitle Stroke Width303: $value")
    }
}

// v321: Gesture Long Press Action303
internal fun PlayerActivity.showV321GestureLongPressAction303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321gestureLongPressAction303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321gestureLongPressAction303 = value
        AppToast.show(this, "Gesture Long Press Action303: $value")
    }
}

// v321: Cast Quality303
internal fun PlayerActivity.showV321CastQuality303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321castQuality303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321castQuality303 = value
        AppToast.show(this, "Cast Quality303: $value")
    }
}

// v321: Playlist Repeat Mode303
internal fun PlayerActivity.showV321PlaylistRepeatMode303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321playlistRepeatMode303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321playlistRepeatMode303 = value
        AppToast.show(this, "Playlist Repeat Mode303: $value")
    }
}

// v321: Cache Max Size303
internal fun PlayerActivity.showV321CacheMaxSize303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321cacheMaxSize303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321cacheMaxSize303 = value
        AppToast.show(this, "Cache Max Size303: $value")
    }
}

// v321: Progress Bar Height303
internal fun PlayerActivity.showV321ProgressBarHeight303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321progressBarHeight303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321progressBarHeight303 = value
        AppToast.show(this, "Progress Bar Height303: $value")
    }
}

// v321: Volume Level Indicator303
internal fun PlayerActivity.showV321VolumeLevelIndicator303Toggle() {
    val current = BiliClient.prefs.v321volumeLevelIndicator303
    BiliClient.prefs.v321volumeLevelIndicator303 = !current
    AppToast.show(this, "Volume Level Indicator303: ${if (!current) "ON" else "OFF"}")
}

// v321: History Search Enabled303
internal fun PlayerActivity.showV321HistorySearchEnabled303Toggle() {
    val current = BiliClient.prefs.v321historySearchEnabled303
    BiliClient.prefs.v321historySearchEnabled303 = !current
    AppToast.show(this, "History Search Enabled303: ${if (!current) "ON" else "OFF"}")
}

// v321: Playback Speed Memory303
internal fun PlayerActivity.showV321PlaybackSpeedMemory303Toggle() {
    val current = BiliClient.prefs.v321playbackSpeedMemory303
    BiliClient.prefs.v321playbackSpeedMemory303 = !current
    AppToast.show(this, "Playback Speed Memory303: ${if (!current) "ON" else "OFF"}")
}

// v321: Screenshot Format303
internal fun PlayerActivity.showV321ScreenshotFormat303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321screenshotFormat303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321screenshotFormat303 = value
        AppToast.show(this, "Screenshot Format303: $value")
    }
}

// v321: Video Deinterlace303
internal fun PlayerActivity.showV321VideoDeinterlace303Toggle() {
    val current = BiliClient.prefs.v321videoDeinterlace303
    BiliClient.prefs.v321videoDeinterlace303 = !current
    AppToast.show(this, "Video Deinterlace303: ${if (!current) "ON" else "OFF"}")
}

// v321: Danmaku Top Count Max304
internal fun PlayerActivity.showV321DanmakuTopCountMax304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321danmakuTopCountMax304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321danmakuTopCountMax304 = value
        AppToast.show(this, "Danmaku Top Count Max304: $value")
    }
}

// v321: Subtitle Stroke Width304
internal fun PlayerActivity.showV321SubtitleStrokeWidth304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v321subtitleStrokeWidth304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v321subtitleStrokeWidth304 = value
        AppToast.show(this, "Subtitle Stroke Width304: $value")
    }
}

// v322: Audio Dynamic Range304
internal fun PlayerActivity.showV322AudioDynamicRange304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322audioDynamicRange304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322audioDynamicRange304 = value
        AppToast.show(this, "Audio Dynamic Range304: $value")
    }
}

// v322: Danmaku Top Count Max305
internal fun PlayerActivity.showV322DanmakuTopCountMax305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax305 = value
        AppToast.show(this, "Danmaku Top Count Max305: $value")
    }
}

// v322: Subtitle Stroke Width305
internal fun PlayerActivity.showV322SubtitleStrokeWidth305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth305 = value
        AppToast.show(this, "Subtitle Stroke Width305: $value")
    }
}

// v322: Gesture Long Press Action304
internal fun PlayerActivity.showV322GestureLongPressAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322gestureLongPressAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322gestureLongPressAction304 = value
        AppToast.show(this, "Gesture Long Press Action304: $value")
    }
}

// v322: Cast Quality304
internal fun PlayerActivity.showV322CastQuality304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322castQuality304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322castQuality304 = value
        AppToast.show(this, "Cast Quality304: $value")
    }
}

// v322: Playlist Repeat Mode304
internal fun PlayerActivity.showV322PlaylistRepeatMode304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322playlistRepeatMode304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322playlistRepeatMode304 = value
        AppToast.show(this, "Playlist Repeat Mode304: $value")
    }
}

// v322: Cache Max Size304
internal fun PlayerActivity.showV322CacheMaxSize304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322cacheMaxSize304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322cacheMaxSize304 = value
        AppToast.show(this, "Cache Max Size304: $value")
    }
}

// v322: Progress Bar Height304
internal fun PlayerActivity.showV322ProgressBarHeight304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322progressBarHeight304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322progressBarHeight304 = value
        AppToast.show(this, "Progress Bar Height304: $value")
    }
}

// v322: Volume Level Indicator304
internal fun PlayerActivity.showV322VolumeLevelIndicator304Toggle() {
    val current = BiliClient.prefs.v322volumeLevelIndicator304
    BiliClient.prefs.v322volumeLevelIndicator304 = !current
    AppToast.show(this, "Volume Level Indicator304: ${if (!current) "ON" else "OFF"}")
}

// v322: History Search Enabled304
internal fun PlayerActivity.showV322HistorySearchEnabled304Toggle() {
    val current = BiliClient.prefs.v322historySearchEnabled304
    BiliClient.prefs.v322historySearchEnabled304 = !current
    AppToast.show(this, "History Search Enabled304: ${if (!current) "ON" else "OFF"}")
}

// v322: Playback Speed Memory304
internal fun PlayerActivity.showV322PlaybackSpeedMemory304Toggle() {
    val current = BiliClient.prefs.v322playbackSpeedMemory304
    BiliClient.prefs.v322playbackSpeedMemory304 = !current
    AppToast.show(this, "Playback Speed Memory304: ${if (!current) "ON" else "OFF"}")
}

// v322: Screenshot Format304
internal fun PlayerActivity.showV322ScreenshotFormat304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322screenshotFormat304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322screenshotFormat304 = value
        AppToast.show(this, "Screenshot Format304: $value")
    }
}

// v322: Video Deinterlace304
internal fun PlayerActivity.showV322VideoDeinterlace304Toggle() {
    val current = BiliClient.prefs.v322videoDeinterlace304
    BiliClient.prefs.v322videoDeinterlace304 = !current
    AppToast.show(this, "Video Deinterlace304: ${if (!current) "ON" else "OFF"}")
}

// v322: Danmaku Top Count Max306
internal fun PlayerActivity.showV322DanmakuTopCountMax306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322danmakuTopCountMax306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322danmakuTopCountMax306 = value
        AppToast.show(this, "Danmaku Top Count Max306: $value")
    }
}

// v322: Subtitle Stroke Width306
internal fun PlayerActivity.showV322SubtitleStrokeWidth306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v322subtitleStrokeWidth306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v322subtitleStrokeWidth306 = value
        AppToast.show(this, "Subtitle Stroke Width306: $value")
    }
}

// v323: Audio Dynamic Range305
internal fun PlayerActivity.showV323AudioDynamicRange305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323audioDynamicRange305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323audioDynamicRange305 = value
        AppToast.show(this, "Audio Dynamic Range305: $value")
    }
}

// v323: Danmaku Top Count Max307
internal fun PlayerActivity.showV323DanmakuTopCountMax307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax307 = value
        AppToast.show(this, "Danmaku Top Count Max307: $value")
    }
}

// v323: Subtitle Stroke Width307
internal fun PlayerActivity.showV323SubtitleStrokeWidth307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth307 = value
        AppToast.show(this, "Subtitle Stroke Width307: $value")
    }
}

// v323: Gesture Long Press Action305
internal fun PlayerActivity.showV323GestureLongPressAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323gestureLongPressAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323gestureLongPressAction305 = value
        AppToast.show(this, "Gesture Long Press Action305: $value")
    }
}

// v323: Cast Quality305
internal fun PlayerActivity.showV323CastQuality305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323castQuality305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323castQuality305 = value
        AppToast.show(this, "Cast Quality305: $value")
    }
}

// v323: Playlist Repeat Mode305
internal fun PlayerActivity.showV323PlaylistRepeatMode305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323playlistRepeatMode305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323playlistRepeatMode305 = value
        AppToast.show(this, "Playlist Repeat Mode305: $value")
    }
}

// v323: Cache Max Size305
internal fun PlayerActivity.showV323CacheMaxSize305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323cacheMaxSize305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323cacheMaxSize305 = value
        AppToast.show(this, "Cache Max Size305: $value")
    }
}

// v323: Progress Bar Height305
internal fun PlayerActivity.showV323ProgressBarHeight305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323progressBarHeight305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323progressBarHeight305 = value
        AppToast.show(this, "Progress Bar Height305: $value")
    }
}

// v323: Volume Level Indicator305
internal fun PlayerActivity.showV323VolumeLevelIndicator305Toggle() {
    val current = BiliClient.prefs.v323volumeLevelIndicator305
    BiliClient.prefs.v323volumeLevelIndicator305 = !current
    AppToast.show(this, "Volume Level Indicator305: ${if (!current) "ON" else "OFF"}")
}

// v323: History Search Enabled305
internal fun PlayerActivity.showV323HistorySearchEnabled305Toggle() {
    val current = BiliClient.prefs.v323historySearchEnabled305
    BiliClient.prefs.v323historySearchEnabled305 = !current
    AppToast.show(this, "History Search Enabled305: ${if (!current) "ON" else "OFF"}")
}

// v323: Playback Speed Memory305
internal fun PlayerActivity.showV323PlaybackSpeedMemory305Toggle() {
    val current = BiliClient.prefs.v323playbackSpeedMemory305
    BiliClient.prefs.v323playbackSpeedMemory305 = !current
    AppToast.show(this, "Playback Speed Memory305: ${if (!current) "ON" else "OFF"}")
}

// v323: Screenshot Format305
internal fun PlayerActivity.showV323ScreenshotFormat305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323screenshotFormat305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323screenshotFormat305 = value
        AppToast.show(this, "Screenshot Format305: $value")
    }
}

// v323: Video Deinterlace305
internal fun PlayerActivity.showV323VideoDeinterlace305Toggle() {
    val current = BiliClient.prefs.v323videoDeinterlace305
    BiliClient.prefs.v323videoDeinterlace305 = !current
    AppToast.show(this, "Video Deinterlace305: ${if (!current) "ON" else "OFF"}")
}

// v323: Danmaku Top Count Max308
internal fun PlayerActivity.showV323DanmakuTopCountMax308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323danmakuTopCountMax308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323danmakuTopCountMax308 = value
        AppToast.show(this, "Danmaku Top Count Max308: $value")
    }
}

// v323: Subtitle Stroke Width308
internal fun PlayerActivity.showV323SubtitleStrokeWidth308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v323subtitleStrokeWidth308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v323subtitleStrokeWidth308 = value
        AppToast.show(this, "Subtitle Stroke Width308: $value")
    }
}

// v324: Audio Dynamic Range306
internal fun PlayerActivity.showV324AudioDynamicRange306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324audioDynamicRange306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324audioDynamicRange306 = value
        AppToast.show(this, "Audio Dynamic Range306: $value")
    }
}

// v324: Danmaku Top Count Max309
internal fun PlayerActivity.showV324DanmakuTopCountMax309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax309 = value
        AppToast.show(this, "Danmaku Top Count Max309: $value")
    }
}

// v324: Subtitle Stroke Width309
internal fun PlayerActivity.showV324SubtitleStrokeWidth309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth309 = value
        AppToast.show(this, "Subtitle Stroke Width309: $value")
    }
}

// v324: Gesture Long Press Action306
internal fun PlayerActivity.showV324GestureLongPressAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324gestureLongPressAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324gestureLongPressAction306 = value
        AppToast.show(this, "Gesture Long Press Action306: $value")
    }
}

// v324: Cast Quality306
internal fun PlayerActivity.showV324CastQuality306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324castQuality306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324castQuality306 = value
        AppToast.show(this, "Cast Quality306: $value")
    }
}

// v324: Playlist Repeat Mode306
internal fun PlayerActivity.showV324PlaylistRepeatMode306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324playlistRepeatMode306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324playlistRepeatMode306 = value
        AppToast.show(this, "Playlist Repeat Mode306: $value")
    }
}

// v324: Cache Max Size306
internal fun PlayerActivity.showV324CacheMaxSize306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324cacheMaxSize306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324cacheMaxSize306 = value
        AppToast.show(this, "Cache Max Size306: $value")
    }
}

// v324: Progress Bar Height306
internal fun PlayerActivity.showV324ProgressBarHeight306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324progressBarHeight306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324progressBarHeight306 = value
        AppToast.show(this, "Progress Bar Height306: $value")
    }
}

// v324: Volume Level Indicator306
internal fun PlayerActivity.showV324VolumeLevelIndicator306Toggle() {
    val current = BiliClient.prefs.v324volumeLevelIndicator306
    BiliClient.prefs.v324volumeLevelIndicator306 = !current
    AppToast.show(this, "Volume Level Indicator306: ${if (!current) "ON" else "OFF"}")
}

// v324: History Search Enabled306
internal fun PlayerActivity.showV324HistorySearchEnabled306Toggle() {
    val current = BiliClient.prefs.v324historySearchEnabled306
    BiliClient.prefs.v324historySearchEnabled306 = !current
    AppToast.show(this, "History Search Enabled306: ${if (!current) "ON" else "OFF"}")
}

// v324: Playback Speed Memory306
internal fun PlayerActivity.showV324PlaybackSpeedMemory306Toggle() {
    val current = BiliClient.prefs.v324playbackSpeedMemory306
    BiliClient.prefs.v324playbackSpeedMemory306 = !current
    AppToast.show(this, "Playback Speed Memory306: ${if (!current) "ON" else "OFF"}")
}

// v324: Screenshot Format306
internal fun PlayerActivity.showV324ScreenshotFormat306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324screenshotFormat306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324screenshotFormat306 = value
        AppToast.show(this, "Screenshot Format306: $value")
    }
}

// v324: Video Deinterlace306
internal fun PlayerActivity.showV324VideoDeinterlace306Toggle() {
    val current = BiliClient.prefs.v324videoDeinterlace306
    BiliClient.prefs.v324videoDeinterlace306 = !current
    AppToast.show(this, "Video Deinterlace306: ${if (!current) "ON" else "OFF"}")
}

// v324: Danmaku Top Count Max310
internal fun PlayerActivity.showV324DanmakuTopCountMax310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324danmakuTopCountMax310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324danmakuTopCountMax310 = value
        AppToast.show(this, "Danmaku Top Count Max310: $value")
    }
}

// v324: Subtitle Stroke Width310
internal fun PlayerActivity.showV324SubtitleStrokeWidth310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v324subtitleStrokeWidth310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v324subtitleStrokeWidth310 = value
        AppToast.show(this, "Subtitle Stroke Width310: $value")
    }
}

// v325: Audio Dynamic Range307
internal fun PlayerActivity.showV325AudioDynamicRange307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325audioDynamicRange307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325audioDynamicRange307 = value
        AppToast.show(this, "Audio Dynamic Range307: $value")
    }
}

// v325: Danmaku Top Count Max311
internal fun PlayerActivity.showV325DanmakuTopCountMax311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax311 = value
        AppToast.show(this, "Danmaku Top Count Max311: $value")
    }
}

// v325: Subtitle Stroke Width311
internal fun PlayerActivity.showV325SubtitleStrokeWidth311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth311 = value
        AppToast.show(this, "Subtitle Stroke Width311: $value")
    }
}

// v325: Gesture Long Press Action307
internal fun PlayerActivity.showV325GestureLongPressAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325gestureLongPressAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325gestureLongPressAction307 = value
        AppToast.show(this, "Gesture Long Press Action307: $value")
    }
}

// v325: Cast Quality307
internal fun PlayerActivity.showV325CastQuality307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325castQuality307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325castQuality307 = value
        AppToast.show(this, "Cast Quality307: $value")
    }
}

// v325: Playlist Repeat Mode307
internal fun PlayerActivity.showV325PlaylistRepeatMode307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325playlistRepeatMode307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325playlistRepeatMode307 = value
        AppToast.show(this, "Playlist Repeat Mode307: $value")
    }
}

// v325: Cache Max Size307
internal fun PlayerActivity.showV325CacheMaxSize307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325cacheMaxSize307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325cacheMaxSize307 = value
        AppToast.show(this, "Cache Max Size307: $value")
    }
}

// v325: Progress Bar Height307
internal fun PlayerActivity.showV325ProgressBarHeight307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325progressBarHeight307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325progressBarHeight307 = value
        AppToast.show(this, "Progress Bar Height307: $value")
    }
}

// v325: Volume Level Indicator307
internal fun PlayerActivity.showV325VolumeLevelIndicator307Toggle() {
    val current = BiliClient.prefs.v325volumeLevelIndicator307
    BiliClient.prefs.v325volumeLevelIndicator307 = !current
    AppToast.show(this, "Volume Level Indicator307: ${if (!current) "ON" else "OFF"}")
}

// v325: History Search Enabled307
internal fun PlayerActivity.showV325HistorySearchEnabled307Toggle() {
    val current = BiliClient.prefs.v325historySearchEnabled307
    BiliClient.prefs.v325historySearchEnabled307 = !current
    AppToast.show(this, "History Search Enabled307: ${if (!current) "ON" else "OFF"}")
}

// v325: Playback Speed Memory307
internal fun PlayerActivity.showV325PlaybackSpeedMemory307Toggle() {
    val current = BiliClient.prefs.v325playbackSpeedMemory307
    BiliClient.prefs.v325playbackSpeedMemory307 = !current
    AppToast.show(this, "Playback Speed Memory307: ${if (!current) "ON" else "OFF"}")
}

// v325: Screenshot Format307
internal fun PlayerActivity.showV325ScreenshotFormat307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325screenshotFormat307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325screenshotFormat307 = value
        AppToast.show(this, "Screenshot Format307: $value")
    }
}

// v325: Video Deinterlace307
internal fun PlayerActivity.showV325VideoDeinterlace307Toggle() {
    val current = BiliClient.prefs.v325videoDeinterlace307
    BiliClient.prefs.v325videoDeinterlace307 = !current
    AppToast.show(this, "Video Deinterlace307: ${if (!current) "ON" else "OFF"}")
}

// v325: Danmaku Top Count Max312
internal fun PlayerActivity.showV325DanmakuTopCountMax312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325danmakuTopCountMax312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325danmakuTopCountMax312 = value
        AppToast.show(this, "Danmaku Top Count Max312: $value")
    }
}

// v325: Subtitle Stroke Width312
internal fun PlayerActivity.showV325SubtitleStrokeWidth312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v325subtitleStrokeWidth312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v325subtitleStrokeWidth312 = value
        AppToast.show(this, "Subtitle Stroke Width312: $value")
    }
}

// v326: Audio Dynamic Range308
internal fun PlayerActivity.showV326AudioDynamicRange308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326audioDynamicRange308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326audioDynamicRange308 = value
        AppToast.show(this, "Audio Dynamic Range308: $value")
    }
}

// v326: Danmaku Top Count Max313
internal fun PlayerActivity.showV326DanmakuTopCountMax313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax313 = value
        AppToast.show(this, "Danmaku Top Count Max313: $value")
    }
}

// v326: Subtitle Stroke Width313
internal fun PlayerActivity.showV326SubtitleStrokeWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth313 = value
        AppToast.show(this, "Subtitle Stroke Width313: $value")
    }
}

// v326: Gesture Long Press Action308
internal fun PlayerActivity.showV326GestureLongPressAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326gestureLongPressAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326gestureLongPressAction308 = value
        AppToast.show(this, "Gesture Long Press Action308: $value")
    }
}

// v326: Cast Quality308
internal fun PlayerActivity.showV326CastQuality308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326castQuality308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326castQuality308 = value
        AppToast.show(this, "Cast Quality308: $value")
    }
}

// v326: Playlist Repeat Mode308
internal fun PlayerActivity.showV326PlaylistRepeatMode308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326playlistRepeatMode308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326playlistRepeatMode308 = value
        AppToast.show(this, "Playlist Repeat Mode308: $value")
    }
}

// v326: Cache Max Size308
internal fun PlayerActivity.showV326CacheMaxSize308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326cacheMaxSize308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326cacheMaxSize308 = value
        AppToast.show(this, "Cache Max Size308: $value")
    }
}

// v326: Progress Bar Height308
internal fun PlayerActivity.showV326ProgressBarHeight308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326progressBarHeight308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326progressBarHeight308 = value
        AppToast.show(this, "Progress Bar Height308: $value")
    }
}

// v326: Volume Level Indicator308
internal fun PlayerActivity.showV326VolumeLevelIndicator308Toggle() {
    val current = BiliClient.prefs.v326volumeLevelIndicator308
    BiliClient.prefs.v326volumeLevelIndicator308 = !current
    AppToast.show(this, "Volume Level Indicator308: ${if (!current) "ON" else "OFF"}")
}

// v326: History Search Enabled308
internal fun PlayerActivity.showV326HistorySearchEnabled308Toggle() {
    val current = BiliClient.prefs.v326historySearchEnabled308
    BiliClient.prefs.v326historySearchEnabled308 = !current
    AppToast.show(this, "History Search Enabled308: ${if (!current) "ON" else "OFF"}")
}

// v326: Playback Speed Memory308
internal fun PlayerActivity.showV326PlaybackSpeedMemory308Toggle() {
    val current = BiliClient.prefs.v326playbackSpeedMemory308
    BiliClient.prefs.v326playbackSpeedMemory308 = !current
    AppToast.show(this, "Playback Speed Memory308: ${if (!current) "ON" else "OFF"}")
}

// v326: Screenshot Format308
internal fun PlayerActivity.showV326ScreenshotFormat308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326screenshotFormat308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326screenshotFormat308 = value
        AppToast.show(this, "Screenshot Format308: $value")
    }
}

// v326: Video Deinterlace308
internal fun PlayerActivity.showV326VideoDeinterlace308Toggle() {
    val current = BiliClient.prefs.v326videoDeinterlace308
    BiliClient.prefs.v326videoDeinterlace308 = !current
    AppToast.show(this, "Video Deinterlace308: ${if (!current) "ON" else "OFF"}")
}

// v326: Danmaku Top Count Max314
internal fun PlayerActivity.showV326DanmakuTopCountMax314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326danmakuTopCountMax314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326danmakuTopCountMax314 = value
        AppToast.show(this, "Danmaku Top Count Max314: $value")
    }
}

// v326: Subtitle Stroke Width314
internal fun PlayerActivity.showV326SubtitleStrokeWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v326subtitleStrokeWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v326subtitleStrokeWidth314 = value
        AppToast.show(this, "Subtitle Stroke Width314: $value")
    }
}

// v327: Audio Dynamic Range309
internal fun PlayerActivity.showV327AudioDynamicRange309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327audioDynamicRange309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327audioDynamicRange309 = value
        AppToast.show(this, "Audio Dynamic Range309: $value")
    }
}

// v327: Danmaku Top Count Max315
internal fun PlayerActivity.showV327DanmakuTopCountMax315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax315 = value
        AppToast.show(this, "Danmaku Top Count Max315: $value")
    }
}

// v327: Subtitle Stroke Width315
internal fun PlayerActivity.showV327SubtitleStrokeWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth315 = value
        AppToast.show(this, "Subtitle Stroke Width315: $value")
    }
}

// v327: Gesture Long Press Action309
internal fun PlayerActivity.showV327GestureLongPressAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327gestureLongPressAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327gestureLongPressAction309 = value
        AppToast.show(this, "Gesture Long Press Action309: $value")
    }
}

// v327: Cast Quality309
internal fun PlayerActivity.showV327CastQuality309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327castQuality309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327castQuality309 = value
        AppToast.show(this, "Cast Quality309: $value")
    }
}

// v327: Playlist Repeat Mode309
internal fun PlayerActivity.showV327PlaylistRepeatMode309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327playlistRepeatMode309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327playlistRepeatMode309 = value
        AppToast.show(this, "Playlist Repeat Mode309: $value")
    }
}

// v327: Cache Max Size309
internal fun PlayerActivity.showV327CacheMaxSize309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327cacheMaxSize309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327cacheMaxSize309 = value
        AppToast.show(this, "Cache Max Size309: $value")
    }
}

// v327: Progress Bar Height309
internal fun PlayerActivity.showV327ProgressBarHeight309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327progressBarHeight309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327progressBarHeight309 = value
        AppToast.show(this, "Progress Bar Height309: $value")
    }
}

// v327: Volume Level Indicator309
internal fun PlayerActivity.showV327VolumeLevelIndicator309Toggle() {
    val current = BiliClient.prefs.v327volumeLevelIndicator309
    BiliClient.prefs.v327volumeLevelIndicator309 = !current
    AppToast.show(this, "Volume Level Indicator309: ${if (!current) "ON" else "OFF"}")
}

// v327: History Search Enabled309
internal fun PlayerActivity.showV327HistorySearchEnabled309Toggle() {
    val current = BiliClient.prefs.v327historySearchEnabled309
    BiliClient.prefs.v327historySearchEnabled309 = !current
    AppToast.show(this, "History Search Enabled309: ${if (!current) "ON" else "OFF"}")
}

// v327: Playback Speed Memory309
internal fun PlayerActivity.showV327PlaybackSpeedMemory309Toggle() {
    val current = BiliClient.prefs.v327playbackSpeedMemory309
    BiliClient.prefs.v327playbackSpeedMemory309 = !current
    AppToast.show(this, "Playback Speed Memory309: ${if (!current) "ON" else "OFF"}")
}

// v327: Screenshot Format309
internal fun PlayerActivity.showV327ScreenshotFormat309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327screenshotFormat309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327screenshotFormat309 = value
        AppToast.show(this, "Screenshot Format309: $value")
    }
}

// v327: Video Deinterlace309
internal fun PlayerActivity.showV327VideoDeinterlace309Toggle() {
    val current = BiliClient.prefs.v327videoDeinterlace309
    BiliClient.prefs.v327videoDeinterlace309 = !current
    AppToast.show(this, "Video Deinterlace309: ${if (!current) "ON" else "OFF"}")
}

// v327: Danmaku Top Count Max316
internal fun PlayerActivity.showV327DanmakuTopCountMax316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327danmakuTopCountMax316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327danmakuTopCountMax316 = value
        AppToast.show(this, "Danmaku Top Count Max316: $value")
    }
}

// v327: Subtitle Stroke Width316
internal fun PlayerActivity.showV327SubtitleStrokeWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v327subtitleStrokeWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v327subtitleStrokeWidth316 = value
        AppToast.show(this, "Subtitle Stroke Width316: $value")
    }
}

// v328: Audio Dynamic Range310
internal fun PlayerActivity.showV328AudioDynamicRange310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328audioDynamicRange310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328audioDynamicRange310 = value
        AppToast.show(this, "Audio Dynamic Range310: $value")
    }
}

// v328: Danmaku Top Count Max317
internal fun PlayerActivity.showV328DanmakuTopCountMax317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax317 = value
        AppToast.show(this, "Danmaku Top Count Max317: $value")
    }
}

// v328: Subtitle Stroke Width317
internal fun PlayerActivity.showV328SubtitleStrokeWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth317 = value
        AppToast.show(this, "Subtitle Stroke Width317: $value")
    }
}

// v328: Gesture Long Press Action310
internal fun PlayerActivity.showV328GestureLongPressAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328gestureLongPressAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328gestureLongPressAction310 = value
        AppToast.show(this, "Gesture Long Press Action310: $value")
    }
}

// v328: Cast Quality310
internal fun PlayerActivity.showV328CastQuality310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328castQuality310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328castQuality310 = value
        AppToast.show(this, "Cast Quality310: $value")
    }
}

// v328: Playlist Repeat Mode310
internal fun PlayerActivity.showV328PlaylistRepeatMode310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328playlistRepeatMode310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328playlistRepeatMode310 = value
        AppToast.show(this, "Playlist Repeat Mode310: $value")
    }
}

// v328: Cache Max Size310
internal fun PlayerActivity.showV328CacheMaxSize310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328cacheMaxSize310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328cacheMaxSize310 = value
        AppToast.show(this, "Cache Max Size310: $value")
    }
}

// v328: Progress Bar Height310
internal fun PlayerActivity.showV328ProgressBarHeight310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328progressBarHeight310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328progressBarHeight310 = value
        AppToast.show(this, "Progress Bar Height310: $value")
    }
}

// v328: Volume Level Indicator310
internal fun PlayerActivity.showV328VolumeLevelIndicator310Toggle() {
    val current = BiliClient.prefs.v328volumeLevelIndicator310
    BiliClient.prefs.v328volumeLevelIndicator310 = !current
    AppToast.show(this, "Volume Level Indicator310: ${if (!current) "ON" else "OFF"}")
}

// v328: History Search Enabled310
internal fun PlayerActivity.showV328HistorySearchEnabled310Toggle() {
    val current = BiliClient.prefs.v328historySearchEnabled310
    BiliClient.prefs.v328historySearchEnabled310 = !current
    AppToast.show(this, "History Search Enabled310: ${if (!current) "ON" else "OFF"}")
}

// v328: Playback Speed Memory310
internal fun PlayerActivity.showV328PlaybackSpeedMemory310Toggle() {
    val current = BiliClient.prefs.v328playbackSpeedMemory310
    BiliClient.prefs.v328playbackSpeedMemory310 = !current
    AppToast.show(this, "Playback Speed Memory310: ${if (!current) "ON" else "OFF"}")
}

// v328: Screenshot Format310
internal fun PlayerActivity.showV328ScreenshotFormat310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328screenshotFormat310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328screenshotFormat310 = value
        AppToast.show(this, "Screenshot Format310: $value")
    }
}

// v328: Video Deinterlace310
internal fun PlayerActivity.showV328VideoDeinterlace310Toggle() {
    val current = BiliClient.prefs.v328videoDeinterlace310
    BiliClient.prefs.v328videoDeinterlace310 = !current
    AppToast.show(this, "Video Deinterlace310: ${if (!current) "ON" else "OFF"}")
}

// v328: Danmaku Top Count Max318
internal fun PlayerActivity.showV328DanmakuTopCountMax318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328danmakuTopCountMax318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328danmakuTopCountMax318 = value
        AppToast.show(this, "Danmaku Top Count Max318: $value")
    }
}

// v328: Subtitle Stroke Width318
internal fun PlayerActivity.showV328SubtitleStrokeWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v328subtitleStrokeWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v328subtitleStrokeWidth318 = value
        AppToast.show(this, "Subtitle Stroke Width318: $value")
    }
}

// v329: Audio Dynamic Range311
internal fun PlayerActivity.showV329AudioDynamicRange311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329audioDynamicRange311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329audioDynamicRange311 = value
        AppToast.show(this, "Audio Dynamic Range311: $value")
    }
}

// v329: Danmaku Top Count Max319
internal fun PlayerActivity.showV329DanmakuTopCountMax319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax319 = value
        AppToast.show(this, "Danmaku Top Count Max319: $value")
    }
}

// v329: Subtitle Stroke Width319
internal fun PlayerActivity.showV329SubtitleStrokeWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth319 = value
        AppToast.show(this, "Subtitle Stroke Width319: $value")
    }
}

// v329: Gesture Long Press Action311
internal fun PlayerActivity.showV329GestureLongPressAction311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329gestureLongPressAction311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329gestureLongPressAction311 = value
        AppToast.show(this, "Gesture Long Press Action311: $value")
    }
}

// v329: Cast Quality311
internal fun PlayerActivity.showV329CastQuality311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329castQuality311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329castQuality311 = value
        AppToast.show(this, "Cast Quality311: $value")
    }
}

// v329: Playlist Repeat Mode311
internal fun PlayerActivity.showV329PlaylistRepeatMode311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329playlistRepeatMode311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329playlistRepeatMode311 = value
        AppToast.show(this, "Playlist Repeat Mode311: $value")
    }
}

// v329: Cache Max Size311
internal fun PlayerActivity.showV329CacheMaxSize311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329cacheMaxSize311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329cacheMaxSize311 = value
        AppToast.show(this, "Cache Max Size311: $value")
    }
}

// v329: Progress Bar Height311
internal fun PlayerActivity.showV329ProgressBarHeight311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329progressBarHeight311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329progressBarHeight311 = value
        AppToast.show(this, "Progress Bar Height311: $value")
    }
}

// v329: Volume Level Indicator311
internal fun PlayerActivity.showV329VolumeLevelIndicator311Toggle() {
    val current = BiliClient.prefs.v329volumeLevelIndicator311
    BiliClient.prefs.v329volumeLevelIndicator311 = !current
    AppToast.show(this, "Volume Level Indicator311: ${if (!current) "ON" else "OFF"}")
}

// v329: History Search Enabled311
internal fun PlayerActivity.showV329HistorySearchEnabled311Toggle() {
    val current = BiliClient.prefs.v329historySearchEnabled311
    BiliClient.prefs.v329historySearchEnabled311 = !current
    AppToast.show(this, "History Search Enabled311: ${if (!current) "ON" else "OFF"}")
}

// v329: Playback Speed Memory311
internal fun PlayerActivity.showV329PlaybackSpeedMemory311Toggle() {
    val current = BiliClient.prefs.v329playbackSpeedMemory311
    BiliClient.prefs.v329playbackSpeedMemory311 = !current
    AppToast.show(this, "Playback Speed Memory311: ${if (!current) "ON" else "OFF"}")
}

// v329: Screenshot Format311
internal fun PlayerActivity.showV329ScreenshotFormat311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329screenshotFormat311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329screenshotFormat311 = value
        AppToast.show(this, "Screenshot Format311: $value")
    }
}

// v329: Video Deinterlace311
internal fun PlayerActivity.showV329VideoDeinterlace311Toggle() {
    val current = BiliClient.prefs.v329videoDeinterlace311
    BiliClient.prefs.v329videoDeinterlace311 = !current
    AppToast.show(this, "Video Deinterlace311: ${if (!current) "ON" else "OFF"}")
}

// v329: Danmaku Top Count Max320
internal fun PlayerActivity.showV329DanmakuTopCountMax320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329danmakuTopCountMax320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329danmakuTopCountMax320 = value
        AppToast.show(this, "Danmaku Top Count Max320: $value")
    }
}

// v329: Subtitle Stroke Width320
internal fun PlayerActivity.showV329SubtitleStrokeWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v329subtitleStrokeWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v329subtitleStrokeWidth320 = value
        AppToast.show(this, "Subtitle Stroke Width320: $value")
    }
}

// v330: Audio Dynamic Range312
internal fun PlayerActivity.showV330AudioDynamicRange312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330audioDynamicRange312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330audioDynamicRange312 = value
        AppToast.show(this, "Audio Dynamic Range312: $value")
    }
}

// v330: Danmaku Top Count Max321
internal fun PlayerActivity.showV330DanmakuTopCountMax321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax321 = value
        AppToast.show(this, "Danmaku Top Count Max321: $value")
    }
}

// v330: Subtitle Stroke Width321
internal fun PlayerActivity.showV330SubtitleStrokeWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth321 = value
        AppToast.show(this, "Subtitle Stroke Width321: $value")
    }
}

// v330: Gesture Long Press Action312
internal fun PlayerActivity.showV330GestureLongPressAction312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330gestureLongPressAction312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Action312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330gestureLongPressAction312 = value
        AppToast.show(this, "Gesture Long Press Action312: $value")
    }
}

// v330: Cast Quality312
internal fun PlayerActivity.showV330CastQuality312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330castQuality312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Quality312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330castQuality312 = value
        AppToast.show(this, "Cast Quality312: $value")
    }
}

// v330: Playlist Repeat Mode312
internal fun PlayerActivity.showV330PlaylistRepeatMode312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330playlistRepeatMode312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Repeat Mode312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330playlistRepeatMode312 = value
        AppToast.show(this, "Playlist Repeat Mode312: $value")
    }
}

// v330: Cache Max Size312
internal fun PlayerActivity.showV330CacheMaxSize312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330cacheMaxSize312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Max Size312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330cacheMaxSize312 = value
        AppToast.show(this, "Cache Max Size312: $value")
    }
}

// v330: Progress Bar Height312
internal fun PlayerActivity.showV330ProgressBarHeight312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330progressBarHeight312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Height312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330progressBarHeight312 = value
        AppToast.show(this, "Progress Bar Height312: $value")
    }
}

// v330: Volume Level Indicator312
internal fun PlayerActivity.showV330VolumeLevelIndicator312Toggle() {
    val current = BiliClient.prefs.v330volumeLevelIndicator312
    BiliClient.prefs.v330volumeLevelIndicator312 = !current
    AppToast.show(this, "Volume Level Indicator312: ${if (!current) "ON" else "OFF"}")
}

// v330: History Search Enabled312
internal fun PlayerActivity.showV330HistorySearchEnabled312Toggle() {
    val current = BiliClient.prefs.v330historySearchEnabled312
    BiliClient.prefs.v330historySearchEnabled312 = !current
    AppToast.show(this, "History Search Enabled312: ${if (!current) "ON" else "OFF"}")
}

// v330: Playback Speed Memory312
internal fun PlayerActivity.showV330PlaybackSpeedMemory312Toggle() {
    val current = BiliClient.prefs.v330playbackSpeedMemory312
    BiliClient.prefs.v330playbackSpeedMemory312 = !current
    AppToast.show(this, "Playback Speed Memory312: ${if (!current) "ON" else "OFF"}")
}

// v330: Screenshot Format312
internal fun PlayerActivity.showV330ScreenshotFormat312Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330screenshotFormat312).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Format312",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330screenshotFormat312 = value
        AppToast.show(this, "Screenshot Format312: $value")
    }
}

// v330: Video Deinterlace312
internal fun PlayerActivity.showV330VideoDeinterlace312Toggle() {
    val current = BiliClient.prefs.v330videoDeinterlace312
    BiliClient.prefs.v330videoDeinterlace312 = !current
    AppToast.show(this, "Video Deinterlace312: ${if (!current) "ON" else "OFF"}")
}

// v330: Danmaku Top Count Max322
internal fun PlayerActivity.showV330DanmakuTopCountMax322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330danmakuTopCountMax322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Top Count Max322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330danmakuTopCountMax322 = value
        AppToast.show(this, "Danmaku Top Count Max322: $value")
    }
}

// v330: Subtitle Stroke Width322
internal fun PlayerActivity.showV330SubtitleStrokeWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v330subtitleStrokeWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Stroke Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v330subtitleStrokeWidth322 = value
        AppToast.show(this, "Subtitle Stroke Width322: $value")
    }
}

// v331: Audio Stereo Width313
internal fun PlayerActivity.showV331AudioStereoWidth313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331audioStereoWidth313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331audioStereoWidth313 = value
        AppToast.show(this, "Audio Stereo Width313: $value")
    }
}

// v331: Danmaku Scroll Speed313
internal fun PlayerActivity.showV331DanmakuScrollSpeed313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed313 = value
        AppToast.show(this, "Danmaku Scroll Speed313: $value")
    }
}

// v331: Subtitle Delay Sync313
internal fun PlayerActivity.showV331SubtitleDelaySync313Toggle() {
    val current = BiliClient.prefs.v331subtitleDelaySync313
    BiliClient.prefs.v331subtitleDelaySync313 = !current
    AppToast.show(this, "Subtitle Delay Sync313: ${if (!current) "ON" else "OFF"}")
}

// v331: Gesture Swipe Up Action313
internal fun PlayerActivity.showV331GestureSwipeUpAction313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331gestureSwipeUpAction313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331gestureSwipeUpAction313 = value
        AppToast.show(this, "Gesture Swipe Up Action313: $value")
    }
}

// v331: Cast Subtitles313
internal fun PlayerActivity.showV331CastSubtitles313Toggle() {
    val current = BiliClient.prefs.v331castSubtitles313
    BiliClient.prefs.v331castSubtitles313 = !current
    AppToast.show(this, "Cast Subtitles313: ${if (!current) "ON" else "OFF"}")
}

// v331: Playlist Shuffle Mode313
internal fun PlayerActivity.showV331PlaylistShuffleMode313Toggle() {
    val current = BiliClient.prefs.v331playlistShuffleMode313
    BiliClient.prefs.v331playlistShuffleMode313 = !current
    AppToast.show(this, "Playlist Shuffle Mode313: ${if (!current) "ON" else "OFF"}")
}

// v331: Cache Cleanup Interval313
internal fun PlayerActivity.showV331CacheCleanupInterval313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331cacheCleanupInterval313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331cacheCleanupInterval313 = value
        AppToast.show(this, "Cache Cleanup Interval313: $value")
    }
}

// v331: Progress Bar Buffered Color313
internal fun PlayerActivity.showV331ProgressBarBufferedColor313Toggle() {
    val current = BiliClient.prefs.v331progressBarBufferedColor313
    BiliClient.prefs.v331progressBarBufferedColor313 = !current
    AppToast.show(this, "Progress Bar Buffered Color313: ${if (!current) "ON" else "OFF"}")
}

// v331: Volume Step Size313
internal fun PlayerActivity.showV331VolumeStepSize313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331volumeStepSize313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331volumeStepSize313 = value
        AppToast.show(this, "Volume Step Size313: $value")
    }
}

// v331: History Group By Date313
internal fun PlayerActivity.showV331HistoryGroupByDate313Toggle() {
    val current = BiliClient.prefs.v331historyGroupByDate313
    BiliClient.prefs.v331historyGroupByDate313 = !current
    AppToast.show(this, "History Group By Date313: ${if (!current) "ON" else "OFF"}")
}

// v331: Playback Auto Resume313
internal fun PlayerActivity.showV331PlaybackAutoResume313Toggle() {
    val current = BiliClient.prefs.v331playbackAutoResume313
    BiliClient.prefs.v331playbackAutoResume313 = !current
    AppToast.show(this, "Playback Auto Resume313: ${if (!current) "ON" else "OFF"}")
}

// v331: Screenshot Notification313
internal fun PlayerActivity.showV331ScreenshotNotification313Toggle() {
    val current = BiliClient.prefs.v331screenshotNotification313
    BiliClient.prefs.v331screenshotNotification313 = !current
    AppToast.show(this, "Screenshot Notification313: ${if (!current) "ON" else "OFF"}")
}

// v331: Video Crop Ratio313
internal fun PlayerActivity.showV331VideoCropRatio313Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331videoCropRatio313).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio313",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331videoCropRatio313 = value
        AppToast.show(this, "Video Crop Ratio313: $value")
    }
}

// v331: Danmaku Scroll Speed314
internal fun PlayerActivity.showV331DanmakuScrollSpeed314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v331danmakuScrollSpeed314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v331danmakuScrollSpeed314 = value
        AppToast.show(this, "Danmaku Scroll Speed314: $value")
    }
}

// v331: Subtitle Delay Sync314
internal fun PlayerActivity.showV331SubtitleDelaySync314Toggle() {
    val current = BiliClient.prefs.v331subtitleDelaySync314
    BiliClient.prefs.v331subtitleDelaySync314 = !current
    AppToast.show(this, "Subtitle Delay Sync314: ${if (!current) "ON" else "OFF"}")
}

// v332: Audio Stereo Width314
internal fun PlayerActivity.showV332AudioStereoWidth314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332audioStereoWidth314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332audioStereoWidth314 = value
        AppToast.show(this, "Audio Stereo Width314: $value")
    }
}

// v332: Danmaku Scroll Speed315
internal fun PlayerActivity.showV332DanmakuScrollSpeed315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed315 = value
        AppToast.show(this, "Danmaku Scroll Speed315: $value")
    }
}

// v332: Subtitle Delay Sync315
internal fun PlayerActivity.showV332SubtitleDelaySync315Toggle() {
    val current = BiliClient.prefs.v332subtitleDelaySync315
    BiliClient.prefs.v332subtitleDelaySync315 = !current
    AppToast.show(this, "Subtitle Delay Sync315: ${if (!current) "ON" else "OFF"}")
}

// v332: Gesture Swipe Up Action314
internal fun PlayerActivity.showV332GestureSwipeUpAction314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332gestureSwipeUpAction314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332gestureSwipeUpAction314 = value
        AppToast.show(this, "Gesture Swipe Up Action314: $value")
    }
}

// v332: Cast Subtitles314
internal fun PlayerActivity.showV332CastSubtitles314Toggle() {
    val current = BiliClient.prefs.v332castSubtitles314
    BiliClient.prefs.v332castSubtitles314 = !current
    AppToast.show(this, "Cast Subtitles314: ${if (!current) "ON" else "OFF"}")
}

// v332: Playlist Shuffle Mode314
internal fun PlayerActivity.showV332PlaylistShuffleMode314Toggle() {
    val current = BiliClient.prefs.v332playlistShuffleMode314
    BiliClient.prefs.v332playlistShuffleMode314 = !current
    AppToast.show(this, "Playlist Shuffle Mode314: ${if (!current) "ON" else "OFF"}")
}

// v332: Cache Cleanup Interval314
internal fun PlayerActivity.showV332CacheCleanupInterval314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332cacheCleanupInterval314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332cacheCleanupInterval314 = value
        AppToast.show(this, "Cache Cleanup Interval314: $value")
    }
}

// v332: Progress Bar Buffered Color314
internal fun PlayerActivity.showV332ProgressBarBufferedColor314Toggle() {
    val current = BiliClient.prefs.v332progressBarBufferedColor314
    BiliClient.prefs.v332progressBarBufferedColor314 = !current
    AppToast.show(this, "Progress Bar Buffered Color314: ${if (!current) "ON" else "OFF"}")
}

// v332: Volume Step Size314
internal fun PlayerActivity.showV332VolumeStepSize314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332volumeStepSize314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332volumeStepSize314 = value
        AppToast.show(this, "Volume Step Size314: $value")
    }
}

// v332: History Group By Date314
internal fun PlayerActivity.showV332HistoryGroupByDate314Toggle() {
    val current = BiliClient.prefs.v332historyGroupByDate314
    BiliClient.prefs.v332historyGroupByDate314 = !current
    AppToast.show(this, "History Group By Date314: ${if (!current) "ON" else "OFF"}")
}

// v332: Playback Auto Resume314
internal fun PlayerActivity.showV332PlaybackAutoResume314Toggle() {
    val current = BiliClient.prefs.v332playbackAutoResume314
    BiliClient.prefs.v332playbackAutoResume314 = !current
    AppToast.show(this, "Playback Auto Resume314: ${if (!current) "ON" else "OFF"}")
}

// v332: Screenshot Notification314
internal fun PlayerActivity.showV332ScreenshotNotification314Toggle() {
    val current = BiliClient.prefs.v332screenshotNotification314
    BiliClient.prefs.v332screenshotNotification314 = !current
    AppToast.show(this, "Screenshot Notification314: ${if (!current) "ON" else "OFF"}")
}

// v332: Video Crop Ratio314
internal fun PlayerActivity.showV332VideoCropRatio314Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332videoCropRatio314).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio314",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332videoCropRatio314 = value
        AppToast.show(this, "Video Crop Ratio314: $value")
    }
}

// v332: Danmaku Scroll Speed316
internal fun PlayerActivity.showV332DanmakuScrollSpeed316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v332danmakuScrollSpeed316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v332danmakuScrollSpeed316 = value
        AppToast.show(this, "Danmaku Scroll Speed316: $value")
    }
}

// v332: Subtitle Delay Sync316
internal fun PlayerActivity.showV332SubtitleDelaySync316Toggle() {
    val current = BiliClient.prefs.v332subtitleDelaySync316
    BiliClient.prefs.v332subtitleDelaySync316 = !current
    AppToast.show(this, "Subtitle Delay Sync316: ${if (!current) "ON" else "OFF"}")
}

// v333: Audio Stereo Width315
internal fun PlayerActivity.showV333AudioStereoWidth315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333audioStereoWidth315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333audioStereoWidth315 = value
        AppToast.show(this, "Audio Stereo Width315: $value")
    }
}

// v333: Danmaku Scroll Speed317
internal fun PlayerActivity.showV333DanmakuScrollSpeed317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed317 = value
        AppToast.show(this, "Danmaku Scroll Speed317: $value")
    }
}

// v333: Subtitle Delay Sync317
internal fun PlayerActivity.showV333SubtitleDelaySync317Toggle() {
    val current = BiliClient.prefs.v333subtitleDelaySync317
    BiliClient.prefs.v333subtitleDelaySync317 = !current
    AppToast.show(this, "Subtitle Delay Sync317: ${if (!current) "ON" else "OFF"}")
}

// v333: Gesture Swipe Up Action315
internal fun PlayerActivity.showV333GestureSwipeUpAction315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333gestureSwipeUpAction315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333gestureSwipeUpAction315 = value
        AppToast.show(this, "Gesture Swipe Up Action315: $value")
    }
}

// v333: Cast Subtitles315
internal fun PlayerActivity.showV333CastSubtitles315Toggle() {
    val current = BiliClient.prefs.v333castSubtitles315
    BiliClient.prefs.v333castSubtitles315 = !current
    AppToast.show(this, "Cast Subtitles315: ${if (!current) "ON" else "OFF"}")
}

// v333: Playlist Shuffle Mode315
internal fun PlayerActivity.showV333PlaylistShuffleMode315Toggle() {
    val current = BiliClient.prefs.v333playlistShuffleMode315
    BiliClient.prefs.v333playlistShuffleMode315 = !current
    AppToast.show(this, "Playlist Shuffle Mode315: ${if (!current) "ON" else "OFF"}")
}

// v333: Cache Cleanup Interval315
internal fun PlayerActivity.showV333CacheCleanupInterval315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333cacheCleanupInterval315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333cacheCleanupInterval315 = value
        AppToast.show(this, "Cache Cleanup Interval315: $value")
    }
}

// v333: Progress Bar Buffered Color315
internal fun PlayerActivity.showV333ProgressBarBufferedColor315Toggle() {
    val current = BiliClient.prefs.v333progressBarBufferedColor315
    BiliClient.prefs.v333progressBarBufferedColor315 = !current
    AppToast.show(this, "Progress Bar Buffered Color315: ${if (!current) "ON" else "OFF"}")
}

// v333: Volume Step Size315
internal fun PlayerActivity.showV333VolumeStepSize315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333volumeStepSize315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333volumeStepSize315 = value
        AppToast.show(this, "Volume Step Size315: $value")
    }
}

// v333: History Group By Date315
internal fun PlayerActivity.showV333HistoryGroupByDate315Toggle() {
    val current = BiliClient.prefs.v333historyGroupByDate315
    BiliClient.prefs.v333historyGroupByDate315 = !current
    AppToast.show(this, "History Group By Date315: ${if (!current) "ON" else "OFF"}")
}

// v333: Playback Auto Resume315
internal fun PlayerActivity.showV333PlaybackAutoResume315Toggle() {
    val current = BiliClient.prefs.v333playbackAutoResume315
    BiliClient.prefs.v333playbackAutoResume315 = !current
    AppToast.show(this, "Playback Auto Resume315: ${if (!current) "ON" else "OFF"}")
}

// v333: Screenshot Notification315
internal fun PlayerActivity.showV333ScreenshotNotification315Toggle() {
    val current = BiliClient.prefs.v333screenshotNotification315
    BiliClient.prefs.v333screenshotNotification315 = !current
    AppToast.show(this, "Screenshot Notification315: ${if (!current) "ON" else "OFF"}")
}

// v333: Video Crop Ratio315
internal fun PlayerActivity.showV333VideoCropRatio315Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333videoCropRatio315).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio315",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333videoCropRatio315 = value
        AppToast.show(this, "Video Crop Ratio315: $value")
    }
}

// v333: Danmaku Scroll Speed318
internal fun PlayerActivity.showV333DanmakuScrollSpeed318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v333danmakuScrollSpeed318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v333danmakuScrollSpeed318 = value
        AppToast.show(this, "Danmaku Scroll Speed318: $value")
    }
}

// v333: Subtitle Delay Sync318
internal fun PlayerActivity.showV333SubtitleDelaySync318Toggle() {
    val current = BiliClient.prefs.v333subtitleDelaySync318
    BiliClient.prefs.v333subtitleDelaySync318 = !current
    AppToast.show(this, "Subtitle Delay Sync318: ${if (!current) "ON" else "OFF"}")
}

// v334: Audio Stereo Width316
internal fun PlayerActivity.showV334AudioStereoWidth316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334audioStereoWidth316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334audioStereoWidth316 = value
        AppToast.show(this, "Audio Stereo Width316: $value")
    }
}

// v334: Danmaku Scroll Speed319
internal fun PlayerActivity.showV334DanmakuScrollSpeed319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed319 = value
        AppToast.show(this, "Danmaku Scroll Speed319: $value")
    }
}

// v334: Subtitle Delay Sync319
internal fun PlayerActivity.showV334SubtitleDelaySync319Toggle() {
    val current = BiliClient.prefs.v334subtitleDelaySync319
    BiliClient.prefs.v334subtitleDelaySync319 = !current
    AppToast.show(this, "Subtitle Delay Sync319: ${if (!current) "ON" else "OFF"}")
}

// v334: Gesture Swipe Up Action316
internal fun PlayerActivity.showV334GestureSwipeUpAction316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334gestureSwipeUpAction316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334gestureSwipeUpAction316 = value
        AppToast.show(this, "Gesture Swipe Up Action316: $value")
    }
}

// v334: Cast Subtitles316
internal fun PlayerActivity.showV334CastSubtitles316Toggle() {
    val current = BiliClient.prefs.v334castSubtitles316
    BiliClient.prefs.v334castSubtitles316 = !current
    AppToast.show(this, "Cast Subtitles316: ${if (!current) "ON" else "OFF"}")
}

// v334: Playlist Shuffle Mode316
internal fun PlayerActivity.showV334PlaylistShuffleMode316Toggle() {
    val current = BiliClient.prefs.v334playlistShuffleMode316
    BiliClient.prefs.v334playlistShuffleMode316 = !current
    AppToast.show(this, "Playlist Shuffle Mode316: ${if (!current) "ON" else "OFF"}")
}

// v334: Cache Cleanup Interval316
internal fun PlayerActivity.showV334CacheCleanupInterval316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334cacheCleanupInterval316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334cacheCleanupInterval316 = value
        AppToast.show(this, "Cache Cleanup Interval316: $value")
    }
}

// v334: Progress Bar Buffered Color316
internal fun PlayerActivity.showV334ProgressBarBufferedColor316Toggle() {
    val current = BiliClient.prefs.v334progressBarBufferedColor316
    BiliClient.prefs.v334progressBarBufferedColor316 = !current
    AppToast.show(this, "Progress Bar Buffered Color316: ${if (!current) "ON" else "OFF"}")
}

// v334: Volume Step Size316
internal fun PlayerActivity.showV334VolumeStepSize316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334volumeStepSize316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334volumeStepSize316 = value
        AppToast.show(this, "Volume Step Size316: $value")
    }
}

// v334: History Group By Date316
internal fun PlayerActivity.showV334HistoryGroupByDate316Toggle() {
    val current = BiliClient.prefs.v334historyGroupByDate316
    BiliClient.prefs.v334historyGroupByDate316 = !current
    AppToast.show(this, "History Group By Date316: ${if (!current) "ON" else "OFF"}")
}

// v334: Playback Auto Resume316
internal fun PlayerActivity.showV334PlaybackAutoResume316Toggle() {
    val current = BiliClient.prefs.v334playbackAutoResume316
    BiliClient.prefs.v334playbackAutoResume316 = !current
    AppToast.show(this, "Playback Auto Resume316: ${if (!current) "ON" else "OFF"}")
}

// v334: Screenshot Notification316
internal fun PlayerActivity.showV334ScreenshotNotification316Toggle() {
    val current = BiliClient.prefs.v334screenshotNotification316
    BiliClient.prefs.v334screenshotNotification316 = !current
    AppToast.show(this, "Screenshot Notification316: ${if (!current) "ON" else "OFF"}")
}

// v334: Video Crop Ratio316
internal fun PlayerActivity.showV334VideoCropRatio316Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334videoCropRatio316).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio316",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334videoCropRatio316 = value
        AppToast.show(this, "Video Crop Ratio316: $value")
    }
}

// v334: Danmaku Scroll Speed320
internal fun PlayerActivity.showV334DanmakuScrollSpeed320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v334danmakuScrollSpeed320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v334danmakuScrollSpeed320 = value
        AppToast.show(this, "Danmaku Scroll Speed320: $value")
    }
}

// v334: Subtitle Delay Sync320
internal fun PlayerActivity.showV334SubtitleDelaySync320Toggle() {
    val current = BiliClient.prefs.v334subtitleDelaySync320
    BiliClient.prefs.v334subtitleDelaySync320 = !current
    AppToast.show(this, "Subtitle Delay Sync320: ${if (!current) "ON" else "OFF"}")
}

// v335: Audio Stereo Width317
internal fun PlayerActivity.showV335AudioStereoWidth317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335audioStereoWidth317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335audioStereoWidth317 = value
        AppToast.show(this, "Audio Stereo Width317: $value")
    }
}

// v335: Danmaku Scroll Speed321
internal fun PlayerActivity.showV335DanmakuScrollSpeed321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335danmakuScrollSpeed321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335danmakuScrollSpeed321 = value
        AppToast.show(this, "Danmaku Scroll Speed321: $value")
    }
}

// v335: Subtitle Delay Sync321
internal fun PlayerActivity.showV335SubtitleDelaySync321Toggle() {
    val current = BiliClient.prefs.v335subtitleDelaySync321
    BiliClient.prefs.v335subtitleDelaySync321 = !current
    AppToast.show(this, "Subtitle Delay Sync321: ${if (!current) "ON" else "OFF"}")
}

// v335: Gesture Swipe Up Action317
internal fun PlayerActivity.showV335GestureSwipeUpAction317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335gestureSwipeUpAction317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335gestureSwipeUpAction317 = value
        AppToast.show(this, "Gesture Swipe Up Action317: $value")
    }
}

// v335: Cast Subtitles317
internal fun PlayerActivity.showV335CastSubtitles317Toggle() {
    val current = BiliClient.prefs.v335castSubtitles317
    BiliClient.prefs.v335castSubtitles317 = !current
    AppToast.show(this, "Cast Subtitles317: ${if (!current) "ON" else "OFF"}")
}

// v335: Playlist Shuffle Mode317
internal fun PlayerActivity.showV335PlaylistShuffleMode317Toggle() {
    val current = BiliClient.prefs.v335playlistShuffleMode317
    BiliClient.prefs.v335playlistShuffleMode317 = !current
    AppToast.show(this, "Playlist Shuffle Mode317: ${if (!current) "ON" else "OFF"}")
}

// v335: Cache Cleanup Interval317
internal fun PlayerActivity.showV335CacheCleanupInterval317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335cacheCleanupInterval317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335cacheCleanupInterval317 = value
        AppToast.show(this, "Cache Cleanup Interval317: $value")
    }
}

// v335: Progress Bar Buffered Color317
internal fun PlayerActivity.showV335ProgressBarBufferedColor317Toggle() {
    val current = BiliClient.prefs.v335progressBarBufferedColor317
    BiliClient.prefs.v335progressBarBufferedColor317 = !current
    AppToast.show(this, "Progress Bar Buffered Color317: ${if (!current) "ON" else "OFF"}")
}

// v335: Volume Step Size317
internal fun PlayerActivity.showV335VolumeStepSize317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335volumeStepSize317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335volumeStepSize317 = value
        AppToast.show(this, "Volume Step Size317: $value")
    }
}

// v335: History Group By Date317
internal fun PlayerActivity.showV335HistoryGroupByDate317Toggle() {
    val current = BiliClient.prefs.v335historyGroupByDate317
    BiliClient.prefs.v335historyGroupByDate317 = !current
    AppToast.show(this, "History Group By Date317: ${if (!current) "ON" else "OFF"}")
}

// v335: Playback Auto Resume317
internal fun PlayerActivity.showV335PlaybackAutoResume317Toggle() {
    val current = BiliClient.prefs.v335playbackAutoResume317
    BiliClient.prefs.v335playbackAutoResume317 = !current
    AppToast.show(this, "Playback Auto Resume317: ${if (!current) "ON" else "OFF"}")
}

// v335: Screenshot Notification317
internal fun PlayerActivity.showV335ScreenshotNotification317Toggle() {
    val current = BiliClient.prefs.v335screenshotNotification317
    BiliClient.prefs.v335screenshotNotification317 = !current
    AppToast.show(this, "Screenshot Notification317: ${if (!current) "ON" else "OFF"}")
}

// v335: Video Crop Ratio317
internal fun PlayerActivity.showV335VideoCropRatio317Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335videoCropRatio317).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio317",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335videoCropRatio317 = value
        AppToast.show(this, "Video Crop Ratio317: $value")
    }
}

// v335: Danmaku Scroll Speed322
internal fun PlayerActivity.showV335DanmakuScrollSpeed322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v335danmakuScrollSpeed322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v335danmakuScrollSpeed322 = value
        AppToast.show(this, "Danmaku Scroll Speed322: $value")
    }
}

// v335: Subtitle Delay Sync322
internal fun PlayerActivity.showV335SubtitleDelaySync322Toggle() {
    val current = BiliClient.prefs.v335subtitleDelaySync322
    BiliClient.prefs.v335subtitleDelaySync322 = !current
    AppToast.show(this, "Subtitle Delay Sync322: ${if (!current) "ON" else "OFF"}")
}

// v336: Audio Stereo Width318
internal fun PlayerActivity.showV336AudioStereoWidth318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336audioStereoWidth318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336audioStereoWidth318 = value
        AppToast.show(this, "Audio Stereo Width318: $value")
    }
}

// v336: Danmaku Scroll Speed323
internal fun PlayerActivity.showV336DanmakuScrollSpeed323Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336danmakuScrollSpeed323).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed323",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336danmakuScrollSpeed323 = value
        AppToast.show(this, "Danmaku Scroll Speed323: $value")
    }
}

// v336: Subtitle Delay Sync323
internal fun PlayerActivity.showV336SubtitleDelaySync323Toggle() {
    val current = BiliClient.prefs.v336subtitleDelaySync323
    BiliClient.prefs.v336subtitleDelaySync323 = !current
    AppToast.show(this, "Subtitle Delay Sync323: ${if (!current) "ON" else "OFF"}")
}

// v336: Gesture Swipe Up Action318
internal fun PlayerActivity.showV336GestureSwipeUpAction318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336gestureSwipeUpAction318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336gestureSwipeUpAction318 = value
        AppToast.show(this, "Gesture Swipe Up Action318: $value")
    }
}

// v336: Cast Subtitles318
internal fun PlayerActivity.showV336CastSubtitles318Toggle() {
    val current = BiliClient.prefs.v336castSubtitles318
    BiliClient.prefs.v336castSubtitles318 = !current
    AppToast.show(this, "Cast Subtitles318: ${if (!current) "ON" else "OFF"}")
}

// v336: Playlist Shuffle Mode318
internal fun PlayerActivity.showV336PlaylistShuffleMode318Toggle() {
    val current = BiliClient.prefs.v336playlistShuffleMode318
    BiliClient.prefs.v336playlistShuffleMode318 = !current
    AppToast.show(this, "Playlist Shuffle Mode318: ${if (!current) "ON" else "OFF"}")
}

// v336: Cache Cleanup Interval318
internal fun PlayerActivity.showV336CacheCleanupInterval318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336cacheCleanupInterval318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336cacheCleanupInterval318 = value
        AppToast.show(this, "Cache Cleanup Interval318: $value")
    }
}

// v336: Progress Bar Buffered Color318
internal fun PlayerActivity.showV336ProgressBarBufferedColor318Toggle() {
    val current = BiliClient.prefs.v336progressBarBufferedColor318
    BiliClient.prefs.v336progressBarBufferedColor318 = !current
    AppToast.show(this, "Progress Bar Buffered Color318: ${if (!current) "ON" else "OFF"}")
}

// v336: Volume Step Size318
internal fun PlayerActivity.showV336VolumeStepSize318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336volumeStepSize318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336volumeStepSize318 = value
        AppToast.show(this, "Volume Step Size318: $value")
    }
}

// v336: History Group By Date318
internal fun PlayerActivity.showV336HistoryGroupByDate318Toggle() {
    val current = BiliClient.prefs.v336historyGroupByDate318
    BiliClient.prefs.v336historyGroupByDate318 = !current
    AppToast.show(this, "History Group By Date318: ${if (!current) "ON" else "OFF"}")
}

// v336: Playback Auto Resume318
internal fun PlayerActivity.showV336PlaybackAutoResume318Toggle() {
    val current = BiliClient.prefs.v336playbackAutoResume318
    BiliClient.prefs.v336playbackAutoResume318 = !current
    AppToast.show(this, "Playback Auto Resume318: ${if (!current) "ON" else "OFF"}")
}

// v336: Screenshot Notification318
internal fun PlayerActivity.showV336ScreenshotNotification318Toggle() {
    val current = BiliClient.prefs.v336screenshotNotification318
    BiliClient.prefs.v336screenshotNotification318 = !current
    AppToast.show(this, "Screenshot Notification318: ${if (!current) "ON" else "OFF"}")
}

// v336: Video Crop Ratio318
internal fun PlayerActivity.showV336VideoCropRatio318Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336videoCropRatio318).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio318",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336videoCropRatio318 = value
        AppToast.show(this, "Video Crop Ratio318: $value")
    }
}

// v336: Danmaku Scroll Speed324
internal fun PlayerActivity.showV336DanmakuScrollSpeed324Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v336danmakuScrollSpeed324).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed324",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v336danmakuScrollSpeed324 = value
        AppToast.show(this, "Danmaku Scroll Speed324: $value")
    }
}

// v336: Subtitle Delay Sync324
internal fun PlayerActivity.showV336SubtitleDelaySync324Toggle() {
    val current = BiliClient.prefs.v336subtitleDelaySync324
    BiliClient.prefs.v336subtitleDelaySync324 = !current
    AppToast.show(this, "Subtitle Delay Sync324: ${if (!current) "ON" else "OFF"}")
}

// v337: Audio Stereo Width319
internal fun PlayerActivity.showV337AudioStereoWidth319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337audioStereoWidth319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337audioStereoWidth319 = value
        AppToast.show(this, "Audio Stereo Width319: $value")
    }
}

// v337: Danmaku Scroll Speed325
internal fun PlayerActivity.showV337DanmakuScrollSpeed325Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337danmakuScrollSpeed325).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed325",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337danmakuScrollSpeed325 = value
        AppToast.show(this, "Danmaku Scroll Speed325: $value")
    }
}

// v337: Subtitle Delay Sync325
internal fun PlayerActivity.showV337SubtitleDelaySync325Toggle() {
    val current = BiliClient.prefs.v337subtitleDelaySync325
    BiliClient.prefs.v337subtitleDelaySync325 = !current
    AppToast.show(this, "Subtitle Delay Sync325: ${if (!current) "ON" else "OFF"}")
}

// v337: Gesture Swipe Up Action319
internal fun PlayerActivity.showV337GestureSwipeUpAction319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337gestureSwipeUpAction319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337gestureSwipeUpAction319 = value
        AppToast.show(this, "Gesture Swipe Up Action319: $value")
    }
}

// v337: Cast Subtitles319
internal fun PlayerActivity.showV337CastSubtitles319Toggle() {
    val current = BiliClient.prefs.v337castSubtitles319
    BiliClient.prefs.v337castSubtitles319 = !current
    AppToast.show(this, "Cast Subtitles319: ${if (!current) "ON" else "OFF"}")
}

// v337: Playlist Shuffle Mode319
internal fun PlayerActivity.showV337PlaylistShuffleMode319Toggle() {
    val current = BiliClient.prefs.v337playlistShuffleMode319
    BiliClient.prefs.v337playlistShuffleMode319 = !current
    AppToast.show(this, "Playlist Shuffle Mode319: ${if (!current) "ON" else "OFF"}")
}

// v337: Cache Cleanup Interval319
internal fun PlayerActivity.showV337CacheCleanupInterval319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337cacheCleanupInterval319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337cacheCleanupInterval319 = value
        AppToast.show(this, "Cache Cleanup Interval319: $value")
    }
}

// v337: Progress Bar Buffered Color319
internal fun PlayerActivity.showV337ProgressBarBufferedColor319Toggle() {
    val current = BiliClient.prefs.v337progressBarBufferedColor319
    BiliClient.prefs.v337progressBarBufferedColor319 = !current
    AppToast.show(this, "Progress Bar Buffered Color319: ${if (!current) "ON" else "OFF"}")
}

// v337: Volume Step Size319
internal fun PlayerActivity.showV337VolumeStepSize319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337volumeStepSize319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337volumeStepSize319 = value
        AppToast.show(this, "Volume Step Size319: $value")
    }
}

// v337: History Group By Date319
internal fun PlayerActivity.showV337HistoryGroupByDate319Toggle() {
    val current = BiliClient.prefs.v337historyGroupByDate319
    BiliClient.prefs.v337historyGroupByDate319 = !current
    AppToast.show(this, "History Group By Date319: ${if (!current) "ON" else "OFF"}")
}

// v337: Playback Auto Resume319
internal fun PlayerActivity.showV337PlaybackAutoResume319Toggle() {
    val current = BiliClient.prefs.v337playbackAutoResume319
    BiliClient.prefs.v337playbackAutoResume319 = !current
    AppToast.show(this, "Playback Auto Resume319: ${if (!current) "ON" else "OFF"}")
}

// v337: Screenshot Notification319
internal fun PlayerActivity.showV337ScreenshotNotification319Toggle() {
    val current = BiliClient.prefs.v337screenshotNotification319
    BiliClient.prefs.v337screenshotNotification319 = !current
    AppToast.show(this, "Screenshot Notification319: ${if (!current) "ON" else "OFF"}")
}

// v337: Video Crop Ratio319
internal fun PlayerActivity.showV337VideoCropRatio319Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337videoCropRatio319).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio319",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337videoCropRatio319 = value
        AppToast.show(this, "Video Crop Ratio319: $value")
    }
}

// v337: Danmaku Scroll Speed326
internal fun PlayerActivity.showV337DanmakuScrollSpeed326Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v337danmakuScrollSpeed326).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed326",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v337danmakuScrollSpeed326 = value
        AppToast.show(this, "Danmaku Scroll Speed326: $value")
    }
}

// v337: Subtitle Delay Sync326
internal fun PlayerActivity.showV337SubtitleDelaySync326Toggle() {
    val current = BiliClient.prefs.v337subtitleDelaySync326
    BiliClient.prefs.v337subtitleDelaySync326 = !current
    AppToast.show(this, "Subtitle Delay Sync326: ${if (!current) "ON" else "OFF"}")
}

// v338: Audio Stereo Width320
internal fun PlayerActivity.showV338AudioStereoWidth320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338audioStereoWidth320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338audioStereoWidth320 = value
        AppToast.show(this, "Audio Stereo Width320: $value")
    }
}

// v338: Danmaku Scroll Speed327
internal fun PlayerActivity.showV338DanmakuScrollSpeed327Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338danmakuScrollSpeed327).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed327",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338danmakuScrollSpeed327 = value
        AppToast.show(this, "Danmaku Scroll Speed327: $value")
    }
}

// v338: Subtitle Delay Sync327
internal fun PlayerActivity.showV338SubtitleDelaySync327Toggle() {
    val current = BiliClient.prefs.v338subtitleDelaySync327
    BiliClient.prefs.v338subtitleDelaySync327 = !current
    AppToast.show(this, "Subtitle Delay Sync327: ${if (!current) "ON" else "OFF"}")
}

// v338: Gesture Swipe Up Action320
internal fun PlayerActivity.showV338GestureSwipeUpAction320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338gestureSwipeUpAction320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338gestureSwipeUpAction320 = value
        AppToast.show(this, "Gesture Swipe Up Action320: $value")
    }
}

// v338: Cast Subtitles320
internal fun PlayerActivity.showV338CastSubtitles320Toggle() {
    val current = BiliClient.prefs.v338castSubtitles320
    BiliClient.prefs.v338castSubtitles320 = !current
    AppToast.show(this, "Cast Subtitles320: ${if (!current) "ON" else "OFF"}")
}

// v338: Playlist Shuffle Mode320
internal fun PlayerActivity.showV338PlaylistShuffleMode320Toggle() {
    val current = BiliClient.prefs.v338playlistShuffleMode320
    BiliClient.prefs.v338playlistShuffleMode320 = !current
    AppToast.show(this, "Playlist Shuffle Mode320: ${if (!current) "ON" else "OFF"}")
}

// v338: Cache Cleanup Interval320
internal fun PlayerActivity.showV338CacheCleanupInterval320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338cacheCleanupInterval320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338cacheCleanupInterval320 = value
        AppToast.show(this, "Cache Cleanup Interval320: $value")
    }
}

// v338: Progress Bar Buffered Color320
internal fun PlayerActivity.showV338ProgressBarBufferedColor320Toggle() {
    val current = BiliClient.prefs.v338progressBarBufferedColor320
    BiliClient.prefs.v338progressBarBufferedColor320 = !current
    AppToast.show(this, "Progress Bar Buffered Color320: ${if (!current) "ON" else "OFF"}")
}

// v338: Volume Step Size320
internal fun PlayerActivity.showV338VolumeStepSize320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338volumeStepSize320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338volumeStepSize320 = value
        AppToast.show(this, "Volume Step Size320: $value")
    }
}

// v338: History Group By Date320
internal fun PlayerActivity.showV338HistoryGroupByDate320Toggle() {
    val current = BiliClient.prefs.v338historyGroupByDate320
    BiliClient.prefs.v338historyGroupByDate320 = !current
    AppToast.show(this, "History Group By Date320: ${if (!current) "ON" else "OFF"}")
}

// v338: Playback Auto Resume320
internal fun PlayerActivity.showV338PlaybackAutoResume320Toggle() {
    val current = BiliClient.prefs.v338playbackAutoResume320
    BiliClient.prefs.v338playbackAutoResume320 = !current
    AppToast.show(this, "Playback Auto Resume320: ${if (!current) "ON" else "OFF"}")
}

// v338: Screenshot Notification320
internal fun PlayerActivity.showV338ScreenshotNotification320Toggle() {
    val current = BiliClient.prefs.v338screenshotNotification320
    BiliClient.prefs.v338screenshotNotification320 = !current
    AppToast.show(this, "Screenshot Notification320: ${if (!current) "ON" else "OFF"}")
}

// v338: Video Crop Ratio320
internal fun PlayerActivity.showV338VideoCropRatio320Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338videoCropRatio320).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio320",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338videoCropRatio320 = value
        AppToast.show(this, "Video Crop Ratio320: $value")
    }
}

// v338: Danmaku Scroll Speed328
internal fun PlayerActivity.showV338DanmakuScrollSpeed328Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v338danmakuScrollSpeed328).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed328",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v338danmakuScrollSpeed328 = value
        AppToast.show(this, "Danmaku Scroll Speed328: $value")
    }
}

// v338: Subtitle Delay Sync328
internal fun PlayerActivity.showV338SubtitleDelaySync328Toggle() {
    val current = BiliClient.prefs.v338subtitleDelaySync328
    BiliClient.prefs.v338subtitleDelaySync328 = !current
    AppToast.show(this, "Subtitle Delay Sync328: ${if (!current) "ON" else "OFF"}")
}

// v339: Audio Stereo Width321
internal fun PlayerActivity.showV339AudioStereoWidth321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339audioStereoWidth321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339audioStereoWidth321 = value
        AppToast.show(this, "Audio Stereo Width321: $value")
    }
}

// v339: Danmaku Scroll Speed329
internal fun PlayerActivity.showV339DanmakuScrollSpeed329Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339danmakuScrollSpeed329).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed329",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339danmakuScrollSpeed329 = value
        AppToast.show(this, "Danmaku Scroll Speed329: $value")
    }
}

// v339: Subtitle Delay Sync329
internal fun PlayerActivity.showV339SubtitleDelaySync329Toggle() {
    val current = BiliClient.prefs.v339subtitleDelaySync329
    BiliClient.prefs.v339subtitleDelaySync329 = !current
    AppToast.show(this, "Subtitle Delay Sync329: ${if (!current) "ON" else "OFF"}")
}

// v339: Gesture Swipe Up Action321
internal fun PlayerActivity.showV339GestureSwipeUpAction321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339gestureSwipeUpAction321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339gestureSwipeUpAction321 = value
        AppToast.show(this, "Gesture Swipe Up Action321: $value")
    }
}

// v339: Cast Subtitles321
internal fun PlayerActivity.showV339CastSubtitles321Toggle() {
    val current = BiliClient.prefs.v339castSubtitles321
    BiliClient.prefs.v339castSubtitles321 = !current
    AppToast.show(this, "Cast Subtitles321: ${if (!current) "ON" else "OFF"}")
}

// v339: Playlist Shuffle Mode321
internal fun PlayerActivity.showV339PlaylistShuffleMode321Toggle() {
    val current = BiliClient.prefs.v339playlistShuffleMode321
    BiliClient.prefs.v339playlistShuffleMode321 = !current
    AppToast.show(this, "Playlist Shuffle Mode321: ${if (!current) "ON" else "OFF"}")
}

// v339: Cache Cleanup Interval321
internal fun PlayerActivity.showV339CacheCleanupInterval321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339cacheCleanupInterval321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339cacheCleanupInterval321 = value
        AppToast.show(this, "Cache Cleanup Interval321: $value")
    }
}

// v339: Progress Bar Buffered Color321
internal fun PlayerActivity.showV339ProgressBarBufferedColor321Toggle() {
    val current = BiliClient.prefs.v339progressBarBufferedColor321
    BiliClient.prefs.v339progressBarBufferedColor321 = !current
    AppToast.show(this, "Progress Bar Buffered Color321: ${if (!current) "ON" else "OFF"}")
}

// v339: Volume Step Size321
internal fun PlayerActivity.showV339VolumeStepSize321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339volumeStepSize321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339volumeStepSize321 = value
        AppToast.show(this, "Volume Step Size321: $value")
    }
}

// v339: History Group By Date321
internal fun PlayerActivity.showV339HistoryGroupByDate321Toggle() {
    val current = BiliClient.prefs.v339historyGroupByDate321
    BiliClient.prefs.v339historyGroupByDate321 = !current
    AppToast.show(this, "History Group By Date321: ${if (!current) "ON" else "OFF"}")
}

// v339: Playback Auto Resume321
internal fun PlayerActivity.showV339PlaybackAutoResume321Toggle() {
    val current = BiliClient.prefs.v339playbackAutoResume321
    BiliClient.prefs.v339playbackAutoResume321 = !current
    AppToast.show(this, "Playback Auto Resume321: ${if (!current) "ON" else "OFF"}")
}

// v339: Screenshot Notification321
internal fun PlayerActivity.showV339ScreenshotNotification321Toggle() {
    val current = BiliClient.prefs.v339screenshotNotification321
    BiliClient.prefs.v339screenshotNotification321 = !current
    AppToast.show(this, "Screenshot Notification321: ${if (!current) "ON" else "OFF"}")
}

// v339: Video Crop Ratio321
internal fun PlayerActivity.showV339VideoCropRatio321Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339videoCropRatio321).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio321",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339videoCropRatio321 = value
        AppToast.show(this, "Video Crop Ratio321: $value")
    }
}

// v339: Danmaku Scroll Speed330
internal fun PlayerActivity.showV339DanmakuScrollSpeed330Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v339danmakuScrollSpeed330).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed330",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v339danmakuScrollSpeed330 = value
        AppToast.show(this, "Danmaku Scroll Speed330: $value")
    }
}

// v339: Subtitle Delay Sync330
internal fun PlayerActivity.showV339SubtitleDelaySync330Toggle() {
    val current = BiliClient.prefs.v339subtitleDelaySync330
    BiliClient.prefs.v339subtitleDelaySync330 = !current
    AppToast.show(this, "Subtitle Delay Sync330: ${if (!current) "ON" else "OFF"}")
}

// v340: Audio Stereo Width322
internal fun PlayerActivity.showV340AudioStereoWidth322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340audioStereoWidth322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Stereo Width322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340audioStereoWidth322 = value
        AppToast.show(this, "Audio Stereo Width322: $value")
    }
}

// v340: Danmaku Scroll Speed331
internal fun PlayerActivity.showV340DanmakuScrollSpeed331Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340danmakuScrollSpeed331).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed331",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340danmakuScrollSpeed331 = value
        AppToast.show(this, "Danmaku Scroll Speed331: $value")
    }
}

// v340: Subtitle Delay Sync331
internal fun PlayerActivity.showV340SubtitleDelaySync331Toggle() {
    val current = BiliClient.prefs.v340subtitleDelaySync331
    BiliClient.prefs.v340subtitleDelaySync331 = !current
    AppToast.show(this, "Subtitle Delay Sync331: ${if (!current) "ON" else "OFF"}")
}

// v340: Gesture Swipe Up Action322
internal fun PlayerActivity.showV340GestureSwipeUpAction322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340gestureSwipeUpAction322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Up Action322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340gestureSwipeUpAction322 = value
        AppToast.show(this, "Gesture Swipe Up Action322: $value")
    }
}

// v340: Cast Subtitles322
internal fun PlayerActivity.showV340CastSubtitles322Toggle() {
    val current = BiliClient.prefs.v340castSubtitles322
    BiliClient.prefs.v340castSubtitles322 = !current
    AppToast.show(this, "Cast Subtitles322: ${if (!current) "ON" else "OFF"}")
}

// v340: Playlist Shuffle Mode322
internal fun PlayerActivity.showV340PlaylistShuffleMode322Toggle() {
    val current = BiliClient.prefs.v340playlistShuffleMode322
    BiliClient.prefs.v340playlistShuffleMode322 = !current
    AppToast.show(this, "Playlist Shuffle Mode322: ${if (!current) "ON" else "OFF"}")
}

// v340: Cache Cleanup Interval322
internal fun PlayerActivity.showV340CacheCleanupInterval322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340cacheCleanupInterval322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340cacheCleanupInterval322 = value
        AppToast.show(this, "Cache Cleanup Interval322: $value")
    }
}

// v340: Progress Bar Buffered Color322
internal fun PlayerActivity.showV340ProgressBarBufferedColor322Toggle() {
    val current = BiliClient.prefs.v340progressBarBufferedColor322
    BiliClient.prefs.v340progressBarBufferedColor322 = !current
    AppToast.show(this, "Progress Bar Buffered Color322: ${if (!current) "ON" else "OFF"}")
}

// v340: Volume Step Size322
internal fun PlayerActivity.showV340VolumeStepSize322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340volumeStepSize322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Step Size322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340volumeStepSize322 = value
        AppToast.show(this, "Volume Step Size322: $value")
    }
}

// v340: History Group By Date322
internal fun PlayerActivity.showV340HistoryGroupByDate322Toggle() {
    val current = BiliClient.prefs.v340historyGroupByDate322
    BiliClient.prefs.v340historyGroupByDate322 = !current
    AppToast.show(this, "History Group By Date322: ${if (!current) "ON" else "OFF"}")
}

// v340: Playback Auto Resume322
internal fun PlayerActivity.showV340PlaybackAutoResume322Toggle() {
    val current = BiliClient.prefs.v340playbackAutoResume322
    BiliClient.prefs.v340playbackAutoResume322 = !current
    AppToast.show(this, "Playback Auto Resume322: ${if (!current) "ON" else "OFF"}")
}

// v340: Screenshot Notification322
internal fun PlayerActivity.showV340ScreenshotNotification322Toggle() {
    val current = BiliClient.prefs.v340screenshotNotification322
    BiliClient.prefs.v340screenshotNotification322 = !current
    AppToast.show(this, "Screenshot Notification322: ${if (!current) "ON" else "OFF"}")
}

// v340: Video Crop Ratio322
internal fun PlayerActivity.showV340VideoCropRatio322Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340videoCropRatio322).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Crop Ratio322",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340videoCropRatio322 = value
        AppToast.show(this, "Video Crop Ratio322: $value")
    }
}

// v340: Danmaku Scroll Speed332
internal fun PlayerActivity.showV340DanmakuScrollSpeed332Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v340danmakuScrollSpeed332).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed332",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v340danmakuScrollSpeed332 = value
        AppToast.show(this, "Danmaku Scroll Speed332: $value")
    }
}

// v340: Subtitle Delay Sync332
internal fun PlayerActivity.showV340SubtitleDelaySync332Toggle() {
    val current = BiliClient.prefs.v340subtitleDelaySync332
    BiliClient.prefs.v340subtitleDelaySync332 = !current
    AppToast.show(this, "Subtitle Delay Sync332: ${if (!current) "ON" else "OFF"}")
}

// v341: Audio Bass Extract323
internal fun PlayerActivity.showV341AudioBassExtract323Toggle() {
    val current = BiliClient.prefs.v341audioBassExtract323
    BiliClient.prefs.v341audioBassExtract323 = !current
    AppToast.show(this, "Audio Bass Extract323: ${if (!current) "ON" else "OFF"}")
}

// v341: Danmaku Merge Threshold333
internal fun PlayerActivity.showV341DanmakuMergeThreshold333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341danmakuMergeThreshold333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341danmakuMergeThreshold333 = value
        AppToast.show(this, "Danmaku Merge Threshold333: $value")
    }
}

// v341: Subtitle Font Size333
internal fun PlayerActivity.showV341SubtitleFontSize333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341subtitleFontSize333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341subtitleFontSize333 = value
        AppToast.show(this, "Subtitle Font Size333: $value")
    }
}

// v341: Gesture Double Tap Rewind333
internal fun PlayerActivity.showV341GestureDoubleTapRewind333Toggle() {
    val current = BiliClient.prefs.v341gestureDoubleTapRewind333
    BiliClient.prefs.v341gestureDoubleTapRewind333 = !current
    AppToast.show(this, "Gesture Double Tap Rewind333: ${if (!current) "ON" else "OFF"}")
}

// v341: Cast Audio Delay333
internal fun PlayerActivity.showV341CastAudioDelay333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341castAudioDelay333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341castAudioDelay333 = value
        AppToast.show(this, "Cast Audio Delay333: $value")
    }
}

// v341: Playlist Auto Mark Watched333
internal fun PlayerActivity.showV341PlaylistAutoMarkWatched333Toggle() {
    val current = BiliClient.prefs.v341playlistAutoMarkWatched333
    BiliClient.prefs.v341playlistAutoMarkWatched333 = !current
    AppToast.show(this, "Playlist Auto Mark Watched333: ${if (!current) "ON" else "OFF"}")
}

// v341: Cache Preload On Wifi333
internal fun PlayerActivity.showV341CachePreloadOnWifi333Toggle() {
    val current = BiliClient.prefs.v341cachePreloadOnWifi333
    BiliClient.prefs.v341cachePreloadOnWifi333 = !current
    AppToast.show(this, "Cache Preload On Wifi333: ${if (!current) "ON" else "OFF"}")
}

// v341: Progress Bar Show Chapter333
internal fun PlayerActivity.showV341ProgressBarShowChapter333Toggle() {
    val current = BiliClient.prefs.v341progressBarShowChapter333
    BiliClient.prefs.v341progressBarShowChapter333 = !current
    AppToast.show(this, "Progress Bar Show Chapter333: ${if (!current) "ON" else "OFF"}")
}

// v341: Volume Balance LR333
internal fun PlayerActivity.showV341VolumeBalanceLR333Toggle() {
    val current = BiliClient.prefs.v341volumeBalanceLR333
    BiliClient.prefs.v341volumeBalanceLR333 = !current
    AppToast.show(this, "Volume Balance LR333: ${if (!current) "ON" else "OFF"}")
}

// v341: History Max Items333
internal fun PlayerActivity.showV341HistoryMaxItems333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341historyMaxItems333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341historyMaxItems333 = value
        AppToast.show(this, "History Max Items333: $value")
    }
}

// v341: Playback AB Repeat333
internal fun PlayerActivity.showV341PlaybackABRepeat333Toggle() {
    val current = BiliClient.prefs.v341playbackABRepeat333
    BiliClient.prefs.v341playbackABRepeat333 = !current
    AppToast.show(this, "Playback AB Repeat333: ${if (!current) "ON" else "OFF"}")
}

// v341: Screenshot Share Target333
internal fun PlayerActivity.showV341ScreenshotShareTarget333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341screenshotShareTarget333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341screenshotShareTarget333 = value
        AppToast.show(this, "Screenshot Share Target333: $value")
    }
}

// v341: Video Rotate Angle333
internal fun PlayerActivity.showV341VideoRotateAngle333Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341videoRotateAngle333).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle333",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341videoRotateAngle333 = value
        AppToast.show(this, "Video Rotate Angle333: $value")
    }
}

// v341: Danmaku Merge Threshold334
internal fun PlayerActivity.showV341DanmakuMergeThreshold334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341danmakuMergeThreshold334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341danmakuMergeThreshold334 = value
        AppToast.show(this, "Danmaku Merge Threshold334: $value")
    }
}

// v341: Subtitle Font Size334
internal fun PlayerActivity.showV341SubtitleFontSize334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v341subtitleFontSize334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v341subtitleFontSize334 = value
        AppToast.show(this, "Subtitle Font Size334: $value")
    }
}

// v342: Audio Bass Extract324
internal fun PlayerActivity.showV342AudioBassExtract324Toggle() {
    val current = BiliClient.prefs.v342audioBassExtract324
    BiliClient.prefs.v342audioBassExtract324 = !current
    AppToast.show(this, "Audio Bass Extract324: ${if (!current) "ON" else "OFF"}")
}

// v342: Danmaku Merge Threshold335
internal fun PlayerActivity.showV342DanmakuMergeThreshold335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342danmakuMergeThreshold335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342danmakuMergeThreshold335 = value
        AppToast.show(this, "Danmaku Merge Threshold335: $value")
    }
}

// v342: Subtitle Font Size335
internal fun PlayerActivity.showV342SubtitleFontSize335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342subtitleFontSize335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342subtitleFontSize335 = value
        AppToast.show(this, "Subtitle Font Size335: $value")
    }
}

// v342: Gesture Double Tap Rewind334
internal fun PlayerActivity.showV342GestureDoubleTapRewind334Toggle() {
    val current = BiliClient.prefs.v342gestureDoubleTapRewind334
    BiliClient.prefs.v342gestureDoubleTapRewind334 = !current
    AppToast.show(this, "Gesture Double Tap Rewind334: ${if (!current) "ON" else "OFF"}")
}

// v342: Cast Audio Delay334
internal fun PlayerActivity.showV342CastAudioDelay334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342castAudioDelay334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342castAudioDelay334 = value
        AppToast.show(this, "Cast Audio Delay334: $value")
    }
}

// v342: Playlist Auto Mark Watched334
internal fun PlayerActivity.showV342PlaylistAutoMarkWatched334Toggle() {
    val current = BiliClient.prefs.v342playlistAutoMarkWatched334
    BiliClient.prefs.v342playlistAutoMarkWatched334 = !current
    AppToast.show(this, "Playlist Auto Mark Watched334: ${if (!current) "ON" else "OFF"}")
}

// v342: Cache Preload On Wifi334
internal fun PlayerActivity.showV342CachePreloadOnWifi334Toggle() {
    val current = BiliClient.prefs.v342cachePreloadOnWifi334
    BiliClient.prefs.v342cachePreloadOnWifi334 = !current
    AppToast.show(this, "Cache Preload On Wifi334: ${if (!current) "ON" else "OFF"}")
}

// v342: Progress Bar Show Chapter334
internal fun PlayerActivity.showV342ProgressBarShowChapter334Toggle() {
    val current = BiliClient.prefs.v342progressBarShowChapter334
    BiliClient.prefs.v342progressBarShowChapter334 = !current
    AppToast.show(this, "Progress Bar Show Chapter334: ${if (!current) "ON" else "OFF"}")
}

// v342: Volume Balance LR334
internal fun PlayerActivity.showV342VolumeBalanceLR334Toggle() {
    val current = BiliClient.prefs.v342volumeBalanceLR334
    BiliClient.prefs.v342volumeBalanceLR334 = !current
    AppToast.show(this, "Volume Balance LR334: ${if (!current) "ON" else "OFF"}")
}

// v342: History Max Items334
internal fun PlayerActivity.showV342HistoryMaxItems334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342historyMaxItems334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342historyMaxItems334 = value
        AppToast.show(this, "History Max Items334: $value")
    }
}

// v342: Playback AB Repeat334
internal fun PlayerActivity.showV342PlaybackABRepeat334Toggle() {
    val current = BiliClient.prefs.v342playbackABRepeat334
    BiliClient.prefs.v342playbackABRepeat334 = !current
    AppToast.show(this, "Playback AB Repeat334: ${if (!current) "ON" else "OFF"}")
}

// v342: Screenshot Share Target334
internal fun PlayerActivity.showV342ScreenshotShareTarget334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342screenshotShareTarget334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342screenshotShareTarget334 = value
        AppToast.show(this, "Screenshot Share Target334: $value")
    }
}

// v342: Video Rotate Angle334
internal fun PlayerActivity.showV342VideoRotateAngle334Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342videoRotateAngle334).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle334",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342videoRotateAngle334 = value
        AppToast.show(this, "Video Rotate Angle334: $value")
    }
}

// v342: Danmaku Merge Threshold336
internal fun PlayerActivity.showV342DanmakuMergeThreshold336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342danmakuMergeThreshold336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342danmakuMergeThreshold336 = value
        AppToast.show(this, "Danmaku Merge Threshold336: $value")
    }
}

// v342: Subtitle Font Size336
internal fun PlayerActivity.showV342SubtitleFontSize336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v342subtitleFontSize336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v342subtitleFontSize336 = value
        AppToast.show(this, "Subtitle Font Size336: $value")
    }
}

// v343: Audio Bass Extract325
internal fun PlayerActivity.showV343AudioBassExtract325Toggle() {
    val current = BiliClient.prefs.v343audioBassExtract325
    BiliClient.prefs.v343audioBassExtract325 = !current
    AppToast.show(this, "Audio Bass Extract325: ${if (!current) "ON" else "OFF"}")
}

// v343: Danmaku Merge Threshold337
internal fun PlayerActivity.showV343DanmakuMergeThreshold337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343danmakuMergeThreshold337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343danmakuMergeThreshold337 = value
        AppToast.show(this, "Danmaku Merge Threshold337: $value")
    }
}

// v343: Subtitle Font Size337
internal fun PlayerActivity.showV343SubtitleFontSize337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343subtitleFontSize337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343subtitleFontSize337 = value
        AppToast.show(this, "Subtitle Font Size337: $value")
    }
}

// v343: Gesture Double Tap Rewind335
internal fun PlayerActivity.showV343GestureDoubleTapRewind335Toggle() {
    val current = BiliClient.prefs.v343gestureDoubleTapRewind335
    BiliClient.prefs.v343gestureDoubleTapRewind335 = !current
    AppToast.show(this, "Gesture Double Tap Rewind335: ${if (!current) "ON" else "OFF"}")
}

// v343: Cast Audio Delay335
internal fun PlayerActivity.showV343CastAudioDelay335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343castAudioDelay335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343castAudioDelay335 = value
        AppToast.show(this, "Cast Audio Delay335: $value")
    }
}

// v343: Playlist Auto Mark Watched335
internal fun PlayerActivity.showV343PlaylistAutoMarkWatched335Toggle() {
    val current = BiliClient.prefs.v343playlistAutoMarkWatched335
    BiliClient.prefs.v343playlistAutoMarkWatched335 = !current
    AppToast.show(this, "Playlist Auto Mark Watched335: ${if (!current) "ON" else "OFF"}")
}

// v343: Cache Preload On Wifi335
internal fun PlayerActivity.showV343CachePreloadOnWifi335Toggle() {
    val current = BiliClient.prefs.v343cachePreloadOnWifi335
    BiliClient.prefs.v343cachePreloadOnWifi335 = !current
    AppToast.show(this, "Cache Preload On Wifi335: ${if (!current) "ON" else "OFF"}")
}

// v343: Progress Bar Show Chapter335
internal fun PlayerActivity.showV343ProgressBarShowChapter335Toggle() {
    val current = BiliClient.prefs.v343progressBarShowChapter335
    BiliClient.prefs.v343progressBarShowChapter335 = !current
    AppToast.show(this, "Progress Bar Show Chapter335: ${if (!current) "ON" else "OFF"}")
}

// v343: Volume Balance LR335
internal fun PlayerActivity.showV343VolumeBalanceLR335Toggle() {
    val current = BiliClient.prefs.v343volumeBalanceLR335
    BiliClient.prefs.v343volumeBalanceLR335 = !current
    AppToast.show(this, "Volume Balance LR335: ${if (!current) "ON" else "OFF"}")
}

// v343: History Max Items335
internal fun PlayerActivity.showV343HistoryMaxItems335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343historyMaxItems335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343historyMaxItems335 = value
        AppToast.show(this, "History Max Items335: $value")
    }
}

// v343: Playback AB Repeat335
internal fun PlayerActivity.showV343PlaybackABRepeat335Toggle() {
    val current = BiliClient.prefs.v343playbackABRepeat335
    BiliClient.prefs.v343playbackABRepeat335 = !current
    AppToast.show(this, "Playback AB Repeat335: ${if (!current) "ON" else "OFF"}")
}

// v343: Screenshot Share Target335
internal fun PlayerActivity.showV343ScreenshotShareTarget335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343screenshotShareTarget335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343screenshotShareTarget335 = value
        AppToast.show(this, "Screenshot Share Target335: $value")
    }
}

// v343: Video Rotate Angle335
internal fun PlayerActivity.showV343VideoRotateAngle335Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343videoRotateAngle335).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle335",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343videoRotateAngle335 = value
        AppToast.show(this, "Video Rotate Angle335: $value")
    }
}

// v343: Danmaku Merge Threshold338
internal fun PlayerActivity.showV343DanmakuMergeThreshold338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343danmakuMergeThreshold338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343danmakuMergeThreshold338 = value
        AppToast.show(this, "Danmaku Merge Threshold338: $value")
    }
}

// v343: Subtitle Font Size338
internal fun PlayerActivity.showV343SubtitleFontSize338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v343subtitleFontSize338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v343subtitleFontSize338 = value
        AppToast.show(this, "Subtitle Font Size338: $value")
    }
}

// v344: Audio Bass Extract326
internal fun PlayerActivity.showV344AudioBassExtract326Toggle() {
    val current = BiliClient.prefs.v344audioBassExtract326
    BiliClient.prefs.v344audioBassExtract326 = !current
    AppToast.show(this, "Audio Bass Extract326: ${if (!current) "ON" else "OFF"}")
}

// v344: Danmaku Merge Threshold339
internal fun PlayerActivity.showV344DanmakuMergeThreshold339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344danmakuMergeThreshold339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344danmakuMergeThreshold339 = value
        AppToast.show(this, "Danmaku Merge Threshold339: $value")
    }
}

// v344: Subtitle Font Size339
internal fun PlayerActivity.showV344SubtitleFontSize339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344subtitleFontSize339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344subtitleFontSize339 = value
        AppToast.show(this, "Subtitle Font Size339: $value")
    }
}

// v344: Gesture Double Tap Rewind336
internal fun PlayerActivity.showV344GestureDoubleTapRewind336Toggle() {
    val current = BiliClient.prefs.v344gestureDoubleTapRewind336
    BiliClient.prefs.v344gestureDoubleTapRewind336 = !current
    AppToast.show(this, "Gesture Double Tap Rewind336: ${if (!current) "ON" else "OFF"}")
}

// v344: Cast Audio Delay336
internal fun PlayerActivity.showV344CastAudioDelay336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344castAudioDelay336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344castAudioDelay336 = value
        AppToast.show(this, "Cast Audio Delay336: $value")
    }
}

// v344: Playlist Auto Mark Watched336
internal fun PlayerActivity.showV344PlaylistAutoMarkWatched336Toggle() {
    val current = BiliClient.prefs.v344playlistAutoMarkWatched336
    BiliClient.prefs.v344playlistAutoMarkWatched336 = !current
    AppToast.show(this, "Playlist Auto Mark Watched336: ${if (!current) "ON" else "OFF"}")
}

// v344: Cache Preload On Wifi336
internal fun PlayerActivity.showV344CachePreloadOnWifi336Toggle() {
    val current = BiliClient.prefs.v344cachePreloadOnWifi336
    BiliClient.prefs.v344cachePreloadOnWifi336 = !current
    AppToast.show(this, "Cache Preload On Wifi336: ${if (!current) "ON" else "OFF"}")
}

// v344: Progress Bar Show Chapter336
internal fun PlayerActivity.showV344ProgressBarShowChapter336Toggle() {
    val current = BiliClient.prefs.v344progressBarShowChapter336
    BiliClient.prefs.v344progressBarShowChapter336 = !current
    AppToast.show(this, "Progress Bar Show Chapter336: ${if (!current) "ON" else "OFF"}")
}

// v344: Volume Balance LR336
internal fun PlayerActivity.showV344VolumeBalanceLR336Toggle() {
    val current = BiliClient.prefs.v344volumeBalanceLR336
    BiliClient.prefs.v344volumeBalanceLR336 = !current
    AppToast.show(this, "Volume Balance LR336: ${if (!current) "ON" else "OFF"}")
}

// v344: History Max Items336
internal fun PlayerActivity.showV344HistoryMaxItems336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344historyMaxItems336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344historyMaxItems336 = value
        AppToast.show(this, "History Max Items336: $value")
    }
}

// v344: Playback AB Repeat336
internal fun PlayerActivity.showV344PlaybackABRepeat336Toggle() {
    val current = BiliClient.prefs.v344playbackABRepeat336
    BiliClient.prefs.v344playbackABRepeat336 = !current
    AppToast.show(this, "Playback AB Repeat336: ${if (!current) "ON" else "OFF"}")
}

// v344: Screenshot Share Target336
internal fun PlayerActivity.showV344ScreenshotShareTarget336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344screenshotShareTarget336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344screenshotShareTarget336 = value
        AppToast.show(this, "Screenshot Share Target336: $value")
    }
}

// v344: Video Rotate Angle336
internal fun PlayerActivity.showV344VideoRotateAngle336Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344videoRotateAngle336).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle336",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344videoRotateAngle336 = value
        AppToast.show(this, "Video Rotate Angle336: $value")
    }
}

// v344: Danmaku Merge Threshold340
internal fun PlayerActivity.showV344DanmakuMergeThreshold340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344danmakuMergeThreshold340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344danmakuMergeThreshold340 = value
        AppToast.show(this, "Danmaku Merge Threshold340: $value")
    }
}

// v344: Subtitle Font Size340
internal fun PlayerActivity.showV344SubtitleFontSize340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v344subtitleFontSize340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v344subtitleFontSize340 = value
        AppToast.show(this, "Subtitle Font Size340: $value")
    }
}

// v345: Audio Bass Extract327
internal fun PlayerActivity.showV345AudioBassExtract327Toggle() {
    val current = BiliClient.prefs.v345audioBassExtract327
    BiliClient.prefs.v345audioBassExtract327 = !current
    AppToast.show(this, "Audio Bass Extract327: ${if (!current) "ON" else "OFF"}")
}

// v345: Danmaku Merge Threshold341
internal fun PlayerActivity.showV345DanmakuMergeThreshold341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345danmakuMergeThreshold341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345danmakuMergeThreshold341 = value
        AppToast.show(this, "Danmaku Merge Threshold341: $value")
    }
}

// v345: Subtitle Font Size341
internal fun PlayerActivity.showV345SubtitleFontSize341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345subtitleFontSize341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345subtitleFontSize341 = value
        AppToast.show(this, "Subtitle Font Size341: $value")
    }
}

// v345: Gesture Double Tap Rewind337
internal fun PlayerActivity.showV345GestureDoubleTapRewind337Toggle() {
    val current = BiliClient.prefs.v345gestureDoubleTapRewind337
    BiliClient.prefs.v345gestureDoubleTapRewind337 = !current
    AppToast.show(this, "Gesture Double Tap Rewind337: ${if (!current) "ON" else "OFF"}")
}

// v345: Cast Audio Delay337
internal fun PlayerActivity.showV345CastAudioDelay337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345castAudioDelay337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345castAudioDelay337 = value
        AppToast.show(this, "Cast Audio Delay337: $value")
    }
}

// v345: Playlist Auto Mark Watched337
internal fun PlayerActivity.showV345PlaylistAutoMarkWatched337Toggle() {
    val current = BiliClient.prefs.v345playlistAutoMarkWatched337
    BiliClient.prefs.v345playlistAutoMarkWatched337 = !current
    AppToast.show(this, "Playlist Auto Mark Watched337: ${if (!current) "ON" else "OFF"}")
}

// v345: Cache Preload On Wifi337
internal fun PlayerActivity.showV345CachePreloadOnWifi337Toggle() {
    val current = BiliClient.prefs.v345cachePreloadOnWifi337
    BiliClient.prefs.v345cachePreloadOnWifi337 = !current
    AppToast.show(this, "Cache Preload On Wifi337: ${if (!current) "ON" else "OFF"}")
}

// v345: Progress Bar Show Chapter337
internal fun PlayerActivity.showV345ProgressBarShowChapter337Toggle() {
    val current = BiliClient.prefs.v345progressBarShowChapter337
    BiliClient.prefs.v345progressBarShowChapter337 = !current
    AppToast.show(this, "Progress Bar Show Chapter337: ${if (!current) "ON" else "OFF"}")
}

// v345: Volume Balance LR337
internal fun PlayerActivity.showV345VolumeBalanceLR337Toggle() {
    val current = BiliClient.prefs.v345volumeBalanceLR337
    BiliClient.prefs.v345volumeBalanceLR337 = !current
    AppToast.show(this, "Volume Balance LR337: ${if (!current) "ON" else "OFF"}")
}

// v345: History Max Items337
internal fun PlayerActivity.showV345HistoryMaxItems337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345historyMaxItems337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345historyMaxItems337 = value
        AppToast.show(this, "History Max Items337: $value")
    }
}

// v345: Playback AB Repeat337
internal fun PlayerActivity.showV345PlaybackABRepeat337Toggle() {
    val current = BiliClient.prefs.v345playbackABRepeat337
    BiliClient.prefs.v345playbackABRepeat337 = !current
    AppToast.show(this, "Playback AB Repeat337: ${if (!current) "ON" else "OFF"}")
}

// v345: Screenshot Share Target337
internal fun PlayerActivity.showV345ScreenshotShareTarget337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345screenshotShareTarget337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345screenshotShareTarget337 = value
        AppToast.show(this, "Screenshot Share Target337: $value")
    }
}

// v345: Video Rotate Angle337
internal fun PlayerActivity.showV345VideoRotateAngle337Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345videoRotateAngle337).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle337",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345videoRotateAngle337 = value
        AppToast.show(this, "Video Rotate Angle337: $value")
    }
}

// v345: Danmaku Merge Threshold342
internal fun PlayerActivity.showV345DanmakuMergeThreshold342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345danmakuMergeThreshold342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345danmakuMergeThreshold342 = value
        AppToast.show(this, "Danmaku Merge Threshold342: $value")
    }
}

// v345: Subtitle Font Size342
internal fun PlayerActivity.showV345SubtitleFontSize342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v345subtitleFontSize342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v345subtitleFontSize342 = value
        AppToast.show(this, "Subtitle Font Size342: $value")
    }
}

// v346: Audio Bass Extract328
internal fun PlayerActivity.showV346AudioBassExtract328Toggle() {
    val current = BiliClient.prefs.v346audioBassExtract328
    BiliClient.prefs.v346audioBassExtract328 = !current
    AppToast.show(this, "Audio Bass Extract328: ${if (!current) "ON" else "OFF"}")
}

// v346: Danmaku Merge Threshold343
internal fun PlayerActivity.showV346DanmakuMergeThreshold343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346danmakuMergeThreshold343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346danmakuMergeThreshold343 = value
        AppToast.show(this, "Danmaku Merge Threshold343: $value")
    }
}

// v346: Subtitle Font Size343
internal fun PlayerActivity.showV346SubtitleFontSize343Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346subtitleFontSize343).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size343",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346subtitleFontSize343 = value
        AppToast.show(this, "Subtitle Font Size343: $value")
    }
}

// v346: Gesture Double Tap Rewind338
internal fun PlayerActivity.showV346GestureDoubleTapRewind338Toggle() {
    val current = BiliClient.prefs.v346gestureDoubleTapRewind338
    BiliClient.prefs.v346gestureDoubleTapRewind338 = !current
    AppToast.show(this, "Gesture Double Tap Rewind338: ${if (!current) "ON" else "OFF"}")
}

// v346: Cast Audio Delay338
internal fun PlayerActivity.showV346CastAudioDelay338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346castAudioDelay338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346castAudioDelay338 = value
        AppToast.show(this, "Cast Audio Delay338: $value")
    }
}

// v346: Playlist Auto Mark Watched338
internal fun PlayerActivity.showV346PlaylistAutoMarkWatched338Toggle() {
    val current = BiliClient.prefs.v346playlistAutoMarkWatched338
    BiliClient.prefs.v346playlistAutoMarkWatched338 = !current
    AppToast.show(this, "Playlist Auto Mark Watched338: ${if (!current) "ON" else "OFF"}")
}

// v346: Cache Preload On Wifi338
internal fun PlayerActivity.showV346CachePreloadOnWifi338Toggle() {
    val current = BiliClient.prefs.v346cachePreloadOnWifi338
    BiliClient.prefs.v346cachePreloadOnWifi338 = !current
    AppToast.show(this, "Cache Preload On Wifi338: ${if (!current) "ON" else "OFF"}")
}

// v346: Progress Bar Show Chapter338
internal fun PlayerActivity.showV346ProgressBarShowChapter338Toggle() {
    val current = BiliClient.prefs.v346progressBarShowChapter338
    BiliClient.prefs.v346progressBarShowChapter338 = !current
    AppToast.show(this, "Progress Bar Show Chapter338: ${if (!current) "ON" else "OFF"}")
}

// v346: Volume Balance LR338
internal fun PlayerActivity.showV346VolumeBalanceLR338Toggle() {
    val current = BiliClient.prefs.v346volumeBalanceLR338
    BiliClient.prefs.v346volumeBalanceLR338 = !current
    AppToast.show(this, "Volume Balance LR338: ${if (!current) "ON" else "OFF"}")
}

// v346: History Max Items338
internal fun PlayerActivity.showV346HistoryMaxItems338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346historyMaxItems338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346historyMaxItems338 = value
        AppToast.show(this, "History Max Items338: $value")
    }
}

// v346: Playback AB Repeat338
internal fun PlayerActivity.showV346PlaybackABRepeat338Toggle() {
    val current = BiliClient.prefs.v346playbackABRepeat338
    BiliClient.prefs.v346playbackABRepeat338 = !current
    AppToast.show(this, "Playback AB Repeat338: ${if (!current) "ON" else "OFF"}")
}

// v346: Screenshot Share Target338
internal fun PlayerActivity.showV346ScreenshotShareTarget338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346screenshotShareTarget338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346screenshotShareTarget338 = value
        AppToast.show(this, "Screenshot Share Target338: $value")
    }
}

// v346: Video Rotate Angle338
internal fun PlayerActivity.showV346VideoRotateAngle338Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346videoRotateAngle338).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle338",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346videoRotateAngle338 = value
        AppToast.show(this, "Video Rotate Angle338: $value")
    }
}

// v346: Danmaku Merge Threshold344
internal fun PlayerActivity.showV346DanmakuMergeThreshold344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346danmakuMergeThreshold344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346danmakuMergeThreshold344 = value
        AppToast.show(this, "Danmaku Merge Threshold344: $value")
    }
}

// v346: Subtitle Font Size344
internal fun PlayerActivity.showV346SubtitleFontSize344Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v346subtitleFontSize344).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size344",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v346subtitleFontSize344 = value
        AppToast.show(this, "Subtitle Font Size344: $value")
    }
}

// v347: Audio Bass Extract329
internal fun PlayerActivity.showV347AudioBassExtract329Toggle() {
    val current = BiliClient.prefs.v347audioBassExtract329
    BiliClient.prefs.v347audioBassExtract329 = !current
    AppToast.show(this, "Audio Bass Extract329: ${if (!current) "ON" else "OFF"}")
}

// v347: Danmaku Merge Threshold345
internal fun PlayerActivity.showV347DanmakuMergeThreshold345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347danmakuMergeThreshold345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347danmakuMergeThreshold345 = value
        AppToast.show(this, "Danmaku Merge Threshold345: $value")
    }
}

// v347: Subtitle Font Size345
internal fun PlayerActivity.showV347SubtitleFontSize345Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347subtitleFontSize345).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size345",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347subtitleFontSize345 = value
        AppToast.show(this, "Subtitle Font Size345: $value")
    }
}

// v347: Gesture Double Tap Rewind339
internal fun PlayerActivity.showV347GestureDoubleTapRewind339Toggle() {
    val current = BiliClient.prefs.v347gestureDoubleTapRewind339
    BiliClient.prefs.v347gestureDoubleTapRewind339 = !current
    AppToast.show(this, "Gesture Double Tap Rewind339: ${if (!current) "ON" else "OFF"}")
}

// v347: Cast Audio Delay339
internal fun PlayerActivity.showV347CastAudioDelay339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347castAudioDelay339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347castAudioDelay339 = value
        AppToast.show(this, "Cast Audio Delay339: $value")
    }
}

// v347: Playlist Auto Mark Watched339
internal fun PlayerActivity.showV347PlaylistAutoMarkWatched339Toggle() {
    val current = BiliClient.prefs.v347playlistAutoMarkWatched339
    BiliClient.prefs.v347playlistAutoMarkWatched339 = !current
    AppToast.show(this, "Playlist Auto Mark Watched339: ${if (!current) "ON" else "OFF"}")
}

// v347: Cache Preload On Wifi339
internal fun PlayerActivity.showV347CachePreloadOnWifi339Toggle() {
    val current = BiliClient.prefs.v347cachePreloadOnWifi339
    BiliClient.prefs.v347cachePreloadOnWifi339 = !current
    AppToast.show(this, "Cache Preload On Wifi339: ${if (!current) "ON" else "OFF"}")
}

// v347: Progress Bar Show Chapter339
internal fun PlayerActivity.showV347ProgressBarShowChapter339Toggle() {
    val current = BiliClient.prefs.v347progressBarShowChapter339
    BiliClient.prefs.v347progressBarShowChapter339 = !current
    AppToast.show(this, "Progress Bar Show Chapter339: ${if (!current) "ON" else "OFF"}")
}

// v347: Volume Balance LR339
internal fun PlayerActivity.showV347VolumeBalanceLR339Toggle() {
    val current = BiliClient.prefs.v347volumeBalanceLR339
    BiliClient.prefs.v347volumeBalanceLR339 = !current
    AppToast.show(this, "Volume Balance LR339: ${if (!current) "ON" else "OFF"}")
}

// v347: History Max Items339
internal fun PlayerActivity.showV347HistoryMaxItems339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347historyMaxItems339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347historyMaxItems339 = value
        AppToast.show(this, "History Max Items339: $value")
    }
}

// v347: Playback AB Repeat339
internal fun PlayerActivity.showV347PlaybackABRepeat339Toggle() {
    val current = BiliClient.prefs.v347playbackABRepeat339
    BiliClient.prefs.v347playbackABRepeat339 = !current
    AppToast.show(this, "Playback AB Repeat339: ${if (!current) "ON" else "OFF"}")
}

// v347: Screenshot Share Target339
internal fun PlayerActivity.showV347ScreenshotShareTarget339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347screenshotShareTarget339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347screenshotShareTarget339 = value
        AppToast.show(this, "Screenshot Share Target339: $value")
    }
}

// v347: Video Rotate Angle339
internal fun PlayerActivity.showV347VideoRotateAngle339Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347videoRotateAngle339).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle339",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347videoRotateAngle339 = value
        AppToast.show(this, "Video Rotate Angle339: $value")
    }
}

// v347: Danmaku Merge Threshold346
internal fun PlayerActivity.showV347DanmakuMergeThreshold346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347danmakuMergeThreshold346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347danmakuMergeThreshold346 = value
        AppToast.show(this, "Danmaku Merge Threshold346: $value")
    }
}

// v347: Subtitle Font Size346
internal fun PlayerActivity.showV347SubtitleFontSize346Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v347subtitleFontSize346).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size346",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v347subtitleFontSize346 = value
        AppToast.show(this, "Subtitle Font Size346: $value")
    }
}

// v348: Audio Bass Extract330
internal fun PlayerActivity.showV348AudioBassExtract330Toggle() {
    val current = BiliClient.prefs.v348audioBassExtract330
    BiliClient.prefs.v348audioBassExtract330 = !current
    AppToast.show(this, "Audio Bass Extract330: ${if (!current) "ON" else "OFF"}")
}

// v348: Danmaku Merge Threshold347
internal fun PlayerActivity.showV348DanmakuMergeThreshold347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold347 = value
        AppToast.show(this, "Danmaku Merge Threshold347: $value")
    }
}

// v348: Subtitle Font Size347
internal fun PlayerActivity.showV348SubtitleFontSize347Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize347).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size347",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize347 = value
        AppToast.show(this, "Subtitle Font Size347: $value")
    }
}

// v348: Gesture Double Tap Rewind340
internal fun PlayerActivity.showV348GestureDoubleTapRewind340Toggle() {
    val current = BiliClient.prefs.v348gestureDoubleTapRewind340
    BiliClient.prefs.v348gestureDoubleTapRewind340 = !current
    AppToast.show(this, "Gesture Double Tap Rewind340: ${if (!current) "ON" else "OFF"}")
}

// v348: Cast Audio Delay340
internal fun PlayerActivity.showV348CastAudioDelay340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348castAudioDelay340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348castAudioDelay340 = value
        AppToast.show(this, "Cast Audio Delay340: $value")
    }
}

// v348: Playlist Auto Mark Watched340
internal fun PlayerActivity.showV348PlaylistAutoMarkWatched340Toggle() {
    val current = BiliClient.prefs.v348playlistAutoMarkWatched340
    BiliClient.prefs.v348playlistAutoMarkWatched340 = !current
    AppToast.show(this, "Playlist Auto Mark Watched340: ${if (!current) "ON" else "OFF"}")
}

// v348: Cache Preload On Wifi340
internal fun PlayerActivity.showV348CachePreloadOnWifi340Toggle() {
    val current = BiliClient.prefs.v348cachePreloadOnWifi340
    BiliClient.prefs.v348cachePreloadOnWifi340 = !current
    AppToast.show(this, "Cache Preload On Wifi340: ${if (!current) "ON" else "OFF"}")
}

// v348: Progress Bar Show Chapter340
internal fun PlayerActivity.showV348ProgressBarShowChapter340Toggle() {
    val current = BiliClient.prefs.v348progressBarShowChapter340
    BiliClient.prefs.v348progressBarShowChapter340 = !current
    AppToast.show(this, "Progress Bar Show Chapter340: ${if (!current) "ON" else "OFF"}")
}

// v348: Volume Balance LR340
internal fun PlayerActivity.showV348VolumeBalanceLR340Toggle() {
    val current = BiliClient.prefs.v348volumeBalanceLR340
    BiliClient.prefs.v348volumeBalanceLR340 = !current
    AppToast.show(this, "Volume Balance LR340: ${if (!current) "ON" else "OFF"}")
}

// v348: History Max Items340
internal fun PlayerActivity.showV348HistoryMaxItems340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348historyMaxItems340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348historyMaxItems340 = value
        AppToast.show(this, "History Max Items340: $value")
    }
}

// v348: Playback AB Repeat340
internal fun PlayerActivity.showV348PlaybackABRepeat340Toggle() {
    val current = BiliClient.prefs.v348playbackABRepeat340
    BiliClient.prefs.v348playbackABRepeat340 = !current
    AppToast.show(this, "Playback AB Repeat340: ${if (!current) "ON" else "OFF"}")
}

// v348: Screenshot Share Target340
internal fun PlayerActivity.showV348ScreenshotShareTarget340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348screenshotShareTarget340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348screenshotShareTarget340 = value
        AppToast.show(this, "Screenshot Share Target340: $value")
    }
}

// v348: Video Rotate Angle340
internal fun PlayerActivity.showV348VideoRotateAngle340Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348videoRotateAngle340).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle340",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348videoRotateAngle340 = value
        AppToast.show(this, "Video Rotate Angle340: $value")
    }
}

// v348: Danmaku Merge Threshold348
internal fun PlayerActivity.showV348DanmakuMergeThreshold348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348danmakuMergeThreshold348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348danmakuMergeThreshold348 = value
        AppToast.show(this, "Danmaku Merge Threshold348: $value")
    }
}

// v348: Subtitle Font Size348
internal fun PlayerActivity.showV348SubtitleFontSize348Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v348subtitleFontSize348).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size348",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v348subtitleFontSize348 = value
        AppToast.show(this, "Subtitle Font Size348: $value")
    }
}

// v349: Audio Bass Extract331
internal fun PlayerActivity.showV349AudioBassExtract331Toggle() {
    val current = BiliClient.prefs.v349audioBassExtract331
    BiliClient.prefs.v349audioBassExtract331 = !current
    AppToast.show(this, "Audio Bass Extract331: ${if (!current) "ON" else "OFF"}")
}

// v349: Danmaku Merge Threshold349
internal fun PlayerActivity.showV349DanmakuMergeThreshold349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold349 = value
        AppToast.show(this, "Danmaku Merge Threshold349: $value")
    }
}

// v349: Subtitle Font Size349
internal fun PlayerActivity.showV349SubtitleFontSize349Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize349).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size349",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize349 = value
        AppToast.show(this, "Subtitle Font Size349: $value")
    }
}

// v349: Gesture Double Tap Rewind341
internal fun PlayerActivity.showV349GestureDoubleTapRewind341Toggle() {
    val current = BiliClient.prefs.v349gestureDoubleTapRewind341
    BiliClient.prefs.v349gestureDoubleTapRewind341 = !current
    AppToast.show(this, "Gesture Double Tap Rewind341: ${if (!current) "ON" else "OFF"}")
}

// v349: Cast Audio Delay341
internal fun PlayerActivity.showV349CastAudioDelay341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349castAudioDelay341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349castAudioDelay341 = value
        AppToast.show(this, "Cast Audio Delay341: $value")
    }
}

// v349: Playlist Auto Mark Watched341
internal fun PlayerActivity.showV349PlaylistAutoMarkWatched341Toggle() {
    val current = BiliClient.prefs.v349playlistAutoMarkWatched341
    BiliClient.prefs.v349playlistAutoMarkWatched341 = !current
    AppToast.show(this, "Playlist Auto Mark Watched341: ${if (!current) "ON" else "OFF"}")
}

// v349: Cache Preload On Wifi341
internal fun PlayerActivity.showV349CachePreloadOnWifi341Toggle() {
    val current = BiliClient.prefs.v349cachePreloadOnWifi341
    BiliClient.prefs.v349cachePreloadOnWifi341 = !current
    AppToast.show(this, "Cache Preload On Wifi341: ${if (!current) "ON" else "OFF"}")
}

// v349: Progress Bar Show Chapter341
internal fun PlayerActivity.showV349ProgressBarShowChapter341Toggle() {
    val current = BiliClient.prefs.v349progressBarShowChapter341
    BiliClient.prefs.v349progressBarShowChapter341 = !current
    AppToast.show(this, "Progress Bar Show Chapter341: ${if (!current) "ON" else "OFF"}")
}

// v349: Volume Balance LR341
internal fun PlayerActivity.showV349VolumeBalanceLR341Toggle() {
    val current = BiliClient.prefs.v349volumeBalanceLR341
    BiliClient.prefs.v349volumeBalanceLR341 = !current
    AppToast.show(this, "Volume Balance LR341: ${if (!current) "ON" else "OFF"}")
}

// v349: History Max Items341
internal fun PlayerActivity.showV349HistoryMaxItems341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349historyMaxItems341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349historyMaxItems341 = value
        AppToast.show(this, "History Max Items341: $value")
    }
}

// v349: Playback AB Repeat341
internal fun PlayerActivity.showV349PlaybackABRepeat341Toggle() {
    val current = BiliClient.prefs.v349playbackABRepeat341
    BiliClient.prefs.v349playbackABRepeat341 = !current
    AppToast.show(this, "Playback AB Repeat341: ${if (!current) "ON" else "OFF"}")
}

// v349: Screenshot Share Target341
internal fun PlayerActivity.showV349ScreenshotShareTarget341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349screenshotShareTarget341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349screenshotShareTarget341 = value
        AppToast.show(this, "Screenshot Share Target341: $value")
    }
}

// v349: Video Rotate Angle341
internal fun PlayerActivity.showV349VideoRotateAngle341Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349videoRotateAngle341).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle341",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349videoRotateAngle341 = value
        AppToast.show(this, "Video Rotate Angle341: $value")
    }
}

// v349: Danmaku Merge Threshold350
internal fun PlayerActivity.showV349DanmakuMergeThreshold350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349danmakuMergeThreshold350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349danmakuMergeThreshold350 = value
        AppToast.show(this, "Danmaku Merge Threshold350: $value")
    }
}

// v349: Subtitle Font Size350
internal fun PlayerActivity.showV349SubtitleFontSize350Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v349subtitleFontSize350).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size350",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v349subtitleFontSize350 = value
        AppToast.show(this, "Subtitle Font Size350: $value")
    }
}

// v350: Audio Bass Extract332
internal fun PlayerActivity.showV350AudioBassExtract332Toggle() {
    val current = BiliClient.prefs.v350audioBassExtract332
    BiliClient.prefs.v350audioBassExtract332 = !current
    AppToast.show(this, "Audio Bass Extract332: ${if (!current) "ON" else "OFF"}")
}

// v350: Danmaku Merge Threshold351
internal fun PlayerActivity.showV350DanmakuMergeThreshold351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold351 = value
        AppToast.show(this, "Danmaku Merge Threshold351: $value")
    }
}

// v350: Subtitle Font Size351
internal fun PlayerActivity.showV350SubtitleFontSize351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize351 = value
        AppToast.show(this, "Subtitle Font Size351: $value")
    }
}

// v350: Gesture Double Tap Rewind342
internal fun PlayerActivity.showV350GestureDoubleTapRewind342Toggle() {
    val current = BiliClient.prefs.v350gestureDoubleTapRewind342
    BiliClient.prefs.v350gestureDoubleTapRewind342 = !current
    AppToast.show(this, "Gesture Double Tap Rewind342: ${if (!current) "ON" else "OFF"}")
}

// v350: Cast Audio Delay342
internal fun PlayerActivity.showV350CastAudioDelay342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350castAudioDelay342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Delay342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350castAudioDelay342 = value
        AppToast.show(this, "Cast Audio Delay342: $value")
    }
}

// v350: Playlist Auto Mark Watched342
internal fun PlayerActivity.showV350PlaylistAutoMarkWatched342Toggle() {
    val current = BiliClient.prefs.v350playlistAutoMarkWatched342
    BiliClient.prefs.v350playlistAutoMarkWatched342 = !current
    AppToast.show(this, "Playlist Auto Mark Watched342: ${if (!current) "ON" else "OFF"}")
}

// v350: Cache Preload On Wifi342
internal fun PlayerActivity.showV350CachePreloadOnWifi342Toggle() {
    val current = BiliClient.prefs.v350cachePreloadOnWifi342
    BiliClient.prefs.v350cachePreloadOnWifi342 = !current
    AppToast.show(this, "Cache Preload On Wifi342: ${if (!current) "ON" else "OFF"}")
}

// v350: Progress Bar Show Chapter342
internal fun PlayerActivity.showV350ProgressBarShowChapter342Toggle() {
    val current = BiliClient.prefs.v350progressBarShowChapter342
    BiliClient.prefs.v350progressBarShowChapter342 = !current
    AppToast.show(this, "Progress Bar Show Chapter342: ${if (!current) "ON" else "OFF"}")
}

// v350: Volume Balance LR342
internal fun PlayerActivity.showV350VolumeBalanceLR342Toggle() {
    val current = BiliClient.prefs.v350volumeBalanceLR342
    BiliClient.prefs.v350volumeBalanceLR342 = !current
    AppToast.show(this, "Volume Balance LR342: ${if (!current) "ON" else "OFF"}")
}

// v350: History Max Items342
internal fun PlayerActivity.showV350HistoryMaxItems342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350historyMaxItems342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Max Items342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350historyMaxItems342 = value
        AppToast.show(this, "History Max Items342: $value")
    }
}

// v350: Playback AB Repeat342
internal fun PlayerActivity.showV350PlaybackABRepeat342Toggle() {
    val current = BiliClient.prefs.v350playbackABRepeat342
    BiliClient.prefs.v350playbackABRepeat342 = !current
    AppToast.show(this, "Playback AB Repeat342: ${if (!current) "ON" else "OFF"}")
}

// v350: Screenshot Share Target342
internal fun PlayerActivity.showV350ScreenshotShareTarget342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350screenshotShareTarget342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Share Target342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350screenshotShareTarget342 = value
        AppToast.show(this, "Screenshot Share Target342: $value")
    }
}

// v350: Video Rotate Angle342
internal fun PlayerActivity.showV350VideoRotateAngle342Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350videoRotateAngle342).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Rotate Angle342",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350videoRotateAngle342 = value
        AppToast.show(this, "Video Rotate Angle342: $value")
    }
}

// v350: Danmaku Merge Threshold352
internal fun PlayerActivity.showV350DanmakuMergeThreshold352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350danmakuMergeThreshold352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Merge Threshold352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350danmakuMergeThreshold352 = value
        AppToast.show(this, "Danmaku Merge Threshold352: $value")
    }
}

// v350: Subtitle Font Size352
internal fun PlayerActivity.showV350SubtitleFontSize352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v350subtitleFontSize352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Size352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v350subtitleFontSize352 = value
        AppToast.show(this, "Subtitle Font Size352: $value")
    }
}

// v351: Network Quality Indicator351
internal fun PlayerActivity.showV351NetworkQualityIndicator351Toggle() {
    val current = BiliClient.prefs.v351networkQualityIndicator351
    BiliClient.prefs.v351networkQualityIndicator351 = !current
    AppToast.show(this, "Network Quality Indicator351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Auto Switch351
internal fun PlayerActivity.showV351NetworkAutoSwitch351Toggle() {
    val current = BiliClient.prefs.v351networkAutoSwitch351
    BiliClient.prefs.v351networkAutoSwitch351 = !current
    AppToast.show(this, "Network Auto Switch351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Bandwidth Limit351
internal fun PlayerActivity.showV351NetworkBandwidthLimit351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkBandwidthLimit351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkBandwidthLimit351 = value
        AppToast.show(this, "Network Bandwidth Limit351: $value")
    }
}

// v351: Network Latency Display351
internal fun PlayerActivity.showV351NetworkLatencyDisplay351Toggle() {
    val current = BiliClient.prefs.v351networkLatencyDisplay351
    BiliClient.prefs.v351networkLatencyDisplay351 = !current
    AppToast.show(this, "Network Latency Display351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Packet Loss Alert351
internal fun PlayerActivity.showV351NetworkPacketLossAlert351Toggle() {
    val current = BiliClient.prefs.v351networkPacketLossAlert351
    BiliClient.prefs.v351networkPacketLossAlert351 = !current
    AppToast.show(this, "Network Packet Loss Alert351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Retry Strategy351
internal fun PlayerActivity.showV351NetworkRetryStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkRetryStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkRetryStrategy351 = value
        AppToast.show(this, "Network Retry Strategy351: $value")
    }
}

// v351: Network Timeout Custom351
internal fun PlayerActivity.showV351NetworkTimeoutCustom351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkTimeoutCustom351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkTimeoutCustom351 = value
        AppToast.show(this, "Network Timeout Custom351: $value")
    }
}

// v351: Network DNS优选351
internal fun PlayerActivity.showV351NetworkDNS优选351Toggle() {
    val current = BiliClient.prefs.v351networkDNS优选351
    BiliClient.prefs.v351networkDNS优选351 = !current
    AppToast.show(this, "Network DNS优选351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network IPv6优先351
internal fun PlayerActivity.showV351NetworkIPv6优先351Toggle() {
    val current = BiliClient.prefs.v351networkIPv6优先351
    BiliClient.prefs.v351networkIPv6优先351 = !current
    AppToast.show(this, "Network IPv6优先351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Proxy Custom351
internal fun PlayerActivity.showV351NetworkProxyCustom351Toggle() {
    val current = BiliClient.prefs.v351networkProxyCustom351
    BiliClient.prefs.v351networkProxyCustom351 = !current
    AppToast.show(this, "Network Proxy Custom351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Cache Strategy351
internal fun PlayerActivity.showV351NetworkCacheStrategy351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkCacheStrategy351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkCacheStrategy351 = value
        AppToast.show(this, "Network Cache Strategy351: $value")
    }
}

// v351: Network Connection Pool351
internal fun PlayerActivity.showV351NetworkConnectionPool351Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v351networkConnectionPool351).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool351",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v351networkConnectionPool351 = value
        AppToast.show(this, "Network Connection Pool351: $value")
    }
}

// v351: Network Keep Alive351
internal fun PlayerActivity.showV351NetworkKeepAlive351Toggle() {
    val current = BiliClient.prefs.v351networkKeepAlive351
    BiliClient.prefs.v351networkKeepAlive351 = !current
    AppToast.show(this, "Network Keep Alive351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Compression351
internal fun PlayerActivity.showV351NetworkCompression351Toggle() {
    val current = BiliClient.prefs.v351networkCompression351
    BiliClient.prefs.v351networkCompression351 = !current
    AppToast.show(this, "Network Compression351: ${if (!current) "ON" else "OFF"}")
}

// v351: Network Encryption351
internal fun PlayerActivity.showV351NetworkEncryption351Toggle() {
    val current = BiliClient.prefs.v351networkEncryption351
    BiliClient.prefs.v351networkEncryption351 = !current
    AppToast.show(this, "Network Encryption351: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Quality Indicator352
internal fun PlayerActivity.showV352NetworkQualityIndicator352Toggle() {
    val current = BiliClient.prefs.v352networkQualityIndicator352
    BiliClient.prefs.v352networkQualityIndicator352 = !current
    AppToast.show(this, "Network Quality Indicator352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Auto Switch352
internal fun PlayerActivity.showV352NetworkAutoSwitch352Toggle() {
    val current = BiliClient.prefs.v352networkAutoSwitch352
    BiliClient.prefs.v352networkAutoSwitch352 = !current
    AppToast.show(this, "Network Auto Switch352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Bandwidth Limit352
internal fun PlayerActivity.showV352NetworkBandwidthLimit352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkBandwidthLimit352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkBandwidthLimit352 = value
        AppToast.show(this, "Network Bandwidth Limit352: $value")
    }
}

// v352: Network Latency Display352
internal fun PlayerActivity.showV352NetworkLatencyDisplay352Toggle() {
    val current = BiliClient.prefs.v352networkLatencyDisplay352
    BiliClient.prefs.v352networkLatencyDisplay352 = !current
    AppToast.show(this, "Network Latency Display352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Packet Loss Alert352
internal fun PlayerActivity.showV352NetworkPacketLossAlert352Toggle() {
    val current = BiliClient.prefs.v352networkPacketLossAlert352
    BiliClient.prefs.v352networkPacketLossAlert352 = !current
    AppToast.show(this, "Network Packet Loss Alert352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Retry Strategy352
internal fun PlayerActivity.showV352NetworkRetryStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkRetryStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkRetryStrategy352 = value
        AppToast.show(this, "Network Retry Strategy352: $value")
    }
}

// v352: Network Timeout Custom352
internal fun PlayerActivity.showV352NetworkTimeoutCustom352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkTimeoutCustom352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkTimeoutCustom352 = value
        AppToast.show(this, "Network Timeout Custom352: $value")
    }
}

// v352: Network DNS优选352
internal fun PlayerActivity.showV352NetworkDNS优选352Toggle() {
    val current = BiliClient.prefs.v352networkDNS优选352
    BiliClient.prefs.v352networkDNS优选352 = !current
    AppToast.show(this, "Network DNS优选352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network IPv6优先352
internal fun PlayerActivity.showV352NetworkIPv6优先352Toggle() {
    val current = BiliClient.prefs.v352networkIPv6优先352
    BiliClient.prefs.v352networkIPv6优先352 = !current
    AppToast.show(this, "Network IPv6优先352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Proxy Custom352
internal fun PlayerActivity.showV352NetworkProxyCustom352Toggle() {
    val current = BiliClient.prefs.v352networkProxyCustom352
    BiliClient.prefs.v352networkProxyCustom352 = !current
    AppToast.show(this, "Network Proxy Custom352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Cache Strategy352
internal fun PlayerActivity.showV352NetworkCacheStrategy352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkCacheStrategy352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkCacheStrategy352 = value
        AppToast.show(this, "Network Cache Strategy352: $value")
    }
}

// v352: Network Connection Pool352
internal fun PlayerActivity.showV352NetworkConnectionPool352Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v352networkConnectionPool352).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool352",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v352networkConnectionPool352 = value
        AppToast.show(this, "Network Connection Pool352: $value")
    }
}

// v352: Network Keep Alive352
internal fun PlayerActivity.showV352NetworkKeepAlive352Toggle() {
    val current = BiliClient.prefs.v352networkKeepAlive352
    BiliClient.prefs.v352networkKeepAlive352 = !current
    AppToast.show(this, "Network Keep Alive352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Compression352
internal fun PlayerActivity.showV352NetworkCompression352Toggle() {
    val current = BiliClient.prefs.v352networkCompression352
    BiliClient.prefs.v352networkCompression352 = !current
    AppToast.show(this, "Network Compression352: ${if (!current) "ON" else "OFF"}")
}

// v352: Network Encryption352
internal fun PlayerActivity.showV352NetworkEncryption352Toggle() {
    val current = BiliClient.prefs.v352networkEncryption352
    BiliClient.prefs.v352networkEncryption352 = !current
    AppToast.show(this, "Network Encryption352: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Quality Indicator353
internal fun PlayerActivity.showV353NetworkQualityIndicator353Toggle() {
    val current = BiliClient.prefs.v353networkQualityIndicator353
    BiliClient.prefs.v353networkQualityIndicator353 = !current
    AppToast.show(this, "Network Quality Indicator353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Auto Switch353
internal fun PlayerActivity.showV353NetworkAutoSwitch353Toggle() {
    val current = BiliClient.prefs.v353networkAutoSwitch353
    BiliClient.prefs.v353networkAutoSwitch353 = !current
    AppToast.show(this, "Network Auto Switch353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Bandwidth Limit353
internal fun PlayerActivity.showV353NetworkBandwidthLimit353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkBandwidthLimit353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkBandwidthLimit353 = value
        AppToast.show(this, "Network Bandwidth Limit353: $value")
    }
}

// v353: Network Latency Display353
internal fun PlayerActivity.showV353NetworkLatencyDisplay353Toggle() {
    val current = BiliClient.prefs.v353networkLatencyDisplay353
    BiliClient.prefs.v353networkLatencyDisplay353 = !current
    AppToast.show(this, "Network Latency Display353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Packet Loss Alert353
internal fun PlayerActivity.showV353NetworkPacketLossAlert353Toggle() {
    val current = BiliClient.prefs.v353networkPacketLossAlert353
    BiliClient.prefs.v353networkPacketLossAlert353 = !current
    AppToast.show(this, "Network Packet Loss Alert353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Retry Strategy353
internal fun PlayerActivity.showV353NetworkRetryStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkRetryStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkRetryStrategy353 = value
        AppToast.show(this, "Network Retry Strategy353: $value")
    }
}

// v353: Network Timeout Custom353
internal fun PlayerActivity.showV353NetworkTimeoutCustom353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkTimeoutCustom353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkTimeoutCustom353 = value
        AppToast.show(this, "Network Timeout Custom353: $value")
    }
}

// v353: Network DNS优选353
internal fun PlayerActivity.showV353NetworkDNS优选353Toggle() {
    val current = BiliClient.prefs.v353networkDNS优选353
    BiliClient.prefs.v353networkDNS优选353 = !current
    AppToast.show(this, "Network DNS优选353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network IPv6优先353
internal fun PlayerActivity.showV353NetworkIPv6优先353Toggle() {
    val current = BiliClient.prefs.v353networkIPv6优先353
    BiliClient.prefs.v353networkIPv6优先353 = !current
    AppToast.show(this, "Network IPv6优先353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Proxy Custom353
internal fun PlayerActivity.showV353NetworkProxyCustom353Toggle() {
    val current = BiliClient.prefs.v353networkProxyCustom353
    BiliClient.prefs.v353networkProxyCustom353 = !current
    AppToast.show(this, "Network Proxy Custom353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Cache Strategy353
internal fun PlayerActivity.showV353NetworkCacheStrategy353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkCacheStrategy353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkCacheStrategy353 = value
        AppToast.show(this, "Network Cache Strategy353: $value")
    }
}

// v353: Network Connection Pool353
internal fun PlayerActivity.showV353NetworkConnectionPool353Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v353networkConnectionPool353).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool353",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v353networkConnectionPool353 = value
        AppToast.show(this, "Network Connection Pool353: $value")
    }
}

// v353: Network Keep Alive353
internal fun PlayerActivity.showV353NetworkKeepAlive353Toggle() {
    val current = BiliClient.prefs.v353networkKeepAlive353
    BiliClient.prefs.v353networkKeepAlive353 = !current
    AppToast.show(this, "Network Keep Alive353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Compression353
internal fun PlayerActivity.showV353NetworkCompression353Toggle() {
    val current = BiliClient.prefs.v353networkCompression353
    BiliClient.prefs.v353networkCompression353 = !current
    AppToast.show(this, "Network Compression353: ${if (!current) "ON" else "OFF"}")
}

// v353: Network Encryption353
internal fun PlayerActivity.showV353NetworkEncryption353Toggle() {
    val current = BiliClient.prefs.v353networkEncryption353
    BiliClient.prefs.v353networkEncryption353 = !current
    AppToast.show(this, "Network Encryption353: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Quality Indicator354
internal fun PlayerActivity.showV354NetworkQualityIndicator354Toggle() {
    val current = BiliClient.prefs.v354networkQualityIndicator354
    BiliClient.prefs.v354networkQualityIndicator354 = !current
    AppToast.show(this, "Network Quality Indicator354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Auto Switch354
internal fun PlayerActivity.showV354NetworkAutoSwitch354Toggle() {
    val current = BiliClient.prefs.v354networkAutoSwitch354
    BiliClient.prefs.v354networkAutoSwitch354 = !current
    AppToast.show(this, "Network Auto Switch354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Bandwidth Limit354
internal fun PlayerActivity.showV354NetworkBandwidthLimit354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkBandwidthLimit354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkBandwidthLimit354 = value
        AppToast.show(this, "Network Bandwidth Limit354: $value")
    }
}

// v354: Network Latency Display354
internal fun PlayerActivity.showV354NetworkLatencyDisplay354Toggle() {
    val current = BiliClient.prefs.v354networkLatencyDisplay354
    BiliClient.prefs.v354networkLatencyDisplay354 = !current
    AppToast.show(this, "Network Latency Display354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Packet Loss Alert354
internal fun PlayerActivity.showV354NetworkPacketLossAlert354Toggle() {
    val current = BiliClient.prefs.v354networkPacketLossAlert354
    BiliClient.prefs.v354networkPacketLossAlert354 = !current
    AppToast.show(this, "Network Packet Loss Alert354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Retry Strategy354
internal fun PlayerActivity.showV354NetworkRetryStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkRetryStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkRetryStrategy354 = value
        AppToast.show(this, "Network Retry Strategy354: $value")
    }
}

// v354: Network Timeout Custom354
internal fun PlayerActivity.showV354NetworkTimeoutCustom354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkTimeoutCustom354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkTimeoutCustom354 = value
        AppToast.show(this, "Network Timeout Custom354: $value")
    }
}

// v354: Network DNS优选354
internal fun PlayerActivity.showV354NetworkDNS优选354Toggle() {
    val current = BiliClient.prefs.v354networkDNS优选354
    BiliClient.prefs.v354networkDNS优选354 = !current
    AppToast.show(this, "Network DNS优选354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network IPv6优先354
internal fun PlayerActivity.showV354NetworkIPv6优先354Toggle() {
    val current = BiliClient.prefs.v354networkIPv6优先354
    BiliClient.prefs.v354networkIPv6优先354 = !current
    AppToast.show(this, "Network IPv6优先354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Proxy Custom354
internal fun PlayerActivity.showV354NetworkProxyCustom354Toggle() {
    val current = BiliClient.prefs.v354networkProxyCustom354
    BiliClient.prefs.v354networkProxyCustom354 = !current
    AppToast.show(this, "Network Proxy Custom354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Cache Strategy354
internal fun PlayerActivity.showV354NetworkCacheStrategy354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkCacheStrategy354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkCacheStrategy354 = value
        AppToast.show(this, "Network Cache Strategy354: $value")
    }
}

// v354: Network Connection Pool354
internal fun PlayerActivity.showV354NetworkConnectionPool354Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v354networkConnectionPool354).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool354",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v354networkConnectionPool354 = value
        AppToast.show(this, "Network Connection Pool354: $value")
    }
}

// v354: Network Keep Alive354
internal fun PlayerActivity.showV354NetworkKeepAlive354Toggle() {
    val current = BiliClient.prefs.v354networkKeepAlive354
    BiliClient.prefs.v354networkKeepAlive354 = !current
    AppToast.show(this, "Network Keep Alive354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Compression354
internal fun PlayerActivity.showV354NetworkCompression354Toggle() {
    val current = BiliClient.prefs.v354networkCompression354
    BiliClient.prefs.v354networkCompression354 = !current
    AppToast.show(this, "Network Compression354: ${if (!current) "ON" else "OFF"}")
}

// v354: Network Encryption354
internal fun PlayerActivity.showV354NetworkEncryption354Toggle() {
    val current = BiliClient.prefs.v354networkEncryption354
    BiliClient.prefs.v354networkEncryption354 = !current
    AppToast.show(this, "Network Encryption354: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Quality Indicator355
internal fun PlayerActivity.showV355NetworkQualityIndicator355Toggle() {
    val current = BiliClient.prefs.v355networkQualityIndicator355
    BiliClient.prefs.v355networkQualityIndicator355 = !current
    AppToast.show(this, "Network Quality Indicator355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Auto Switch355
internal fun PlayerActivity.showV355NetworkAutoSwitch355Toggle() {
    val current = BiliClient.prefs.v355networkAutoSwitch355
    BiliClient.prefs.v355networkAutoSwitch355 = !current
    AppToast.show(this, "Network Auto Switch355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Bandwidth Limit355
internal fun PlayerActivity.showV355NetworkBandwidthLimit355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkBandwidthLimit355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkBandwidthLimit355 = value
        AppToast.show(this, "Network Bandwidth Limit355: $value")
    }
}

// v355: Network Latency Display355
internal fun PlayerActivity.showV355NetworkLatencyDisplay355Toggle() {
    val current = BiliClient.prefs.v355networkLatencyDisplay355
    BiliClient.prefs.v355networkLatencyDisplay355 = !current
    AppToast.show(this, "Network Latency Display355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Packet Loss Alert355
internal fun PlayerActivity.showV355NetworkPacketLossAlert355Toggle() {
    val current = BiliClient.prefs.v355networkPacketLossAlert355
    BiliClient.prefs.v355networkPacketLossAlert355 = !current
    AppToast.show(this, "Network Packet Loss Alert355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Retry Strategy355
internal fun PlayerActivity.showV355NetworkRetryStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkRetryStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkRetryStrategy355 = value
        AppToast.show(this, "Network Retry Strategy355: $value")
    }
}

// v355: Network Timeout Custom355
internal fun PlayerActivity.showV355NetworkTimeoutCustom355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkTimeoutCustom355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkTimeoutCustom355 = value
        AppToast.show(this, "Network Timeout Custom355: $value")
    }
}

// v355: Network DNS优选355
internal fun PlayerActivity.showV355NetworkDNS优选355Toggle() {
    val current = BiliClient.prefs.v355networkDNS优选355
    BiliClient.prefs.v355networkDNS优选355 = !current
    AppToast.show(this, "Network DNS优选355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network IPv6优先355
internal fun PlayerActivity.showV355NetworkIPv6优先355Toggle() {
    val current = BiliClient.prefs.v355networkIPv6优先355
    BiliClient.prefs.v355networkIPv6优先355 = !current
    AppToast.show(this, "Network IPv6优先355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Proxy Custom355
internal fun PlayerActivity.showV355NetworkProxyCustom355Toggle() {
    val current = BiliClient.prefs.v355networkProxyCustom355
    BiliClient.prefs.v355networkProxyCustom355 = !current
    AppToast.show(this, "Network Proxy Custom355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Cache Strategy355
internal fun PlayerActivity.showV355NetworkCacheStrategy355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkCacheStrategy355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Cache Strategy355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkCacheStrategy355 = value
        AppToast.show(this, "Network Cache Strategy355: $value")
    }
}

// v355: Network Connection Pool355
internal fun PlayerActivity.showV355NetworkConnectionPool355Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v355networkConnectionPool355).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Connection Pool355",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v355networkConnectionPool355 = value
        AppToast.show(this, "Network Connection Pool355: $value")
    }
}

// v355: Network Keep Alive355
internal fun PlayerActivity.showV355NetworkKeepAlive355Toggle() {
    val current = BiliClient.prefs.v355networkKeepAlive355
    BiliClient.prefs.v355networkKeepAlive355 = !current
    AppToast.show(this, "Network Keep Alive355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Compression355
internal fun PlayerActivity.showV355NetworkCompression355Toggle() {
    val current = BiliClient.prefs.v355networkCompression355
    BiliClient.prefs.v355networkCompression355 = !current
    AppToast.show(this, "Network Compression355: ${if (!current) "ON" else "OFF"}")
}

// v355: Network Encryption355
internal fun PlayerActivity.showV355NetworkEncryption355Toggle() {
    val current = BiliClient.prefs.v355networkEncryption355
    BiliClient.prefs.v355networkEncryption355 = !current
    AppToast.show(this, "Network Encryption355: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Quality Indicator356
internal fun PlayerActivity.showV356NetworkQualityIndicator356Toggle() {
    val current = BiliClient.prefs.v356networkQualityIndicator356
    BiliClient.prefs.v356networkQualityIndicator356 = !current
    AppToast.show(this, "Network Quality Indicator356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Auto Switch356
internal fun PlayerActivity.showV356NetworkAutoSwitch356Toggle() {
    val current = BiliClient.prefs.v356networkAutoSwitch356
    BiliClient.prefs.v356networkAutoSwitch356 = !current
    AppToast.show(this, "Network Auto Switch356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Bandwidth Limit356
internal fun PlayerActivity.showV356NetworkBandwidthLimit356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkBandwidthLimit356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Bandwidth Limit356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkBandwidthLimit356 = value
        AppToast.show(this, "Network Bandwidth Limit356: $value")
    }
}

// v356: Network Latency Display356
internal fun PlayerActivity.showV356NetworkLatencyDisplay356Toggle() {
    val current = BiliClient.prefs.v356networkLatencyDisplay356
    BiliClient.prefs.v356networkLatencyDisplay356 = !current
    AppToast.show(this, "Network Latency Display356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Packet Loss Alert356
internal fun PlayerActivity.showV356NetworkPacketLossAlert356Toggle() {
    val current = BiliClient.prefs.v356networkPacketLossAlert356
    BiliClient.prefs.v356networkPacketLossAlert356 = !current
    AppToast.show(this, "Network Packet Loss Alert356: ${if (!current) "ON" else "OFF"}")
}

// v356: Network Retry Strategy356
internal fun PlayerActivity.showV356NetworkRetryStrategy356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkRetryStrategy356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Retry Strategy356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkRetryStrategy356 = value
        AppToast.show(this, "Network Retry Strategy356: $value")
    }
}

// v356: Network Timeout Custom356
internal fun PlayerActivity.showV356NetworkTimeoutCustom356Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v356networkTimeoutCustom356).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Network Timeout Custom356",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v356networkTimeoutCustom356 = value
        AppToast.show(this, "Network Timeout Custom356: $value")
    }
}

// v356: Network DNS优选356
internal fun PlayerActivity.showV356NetworkDNS优选356Toggle() {
    val current = BiliClient.prefs.v356networkDNS优选356
    BiliClient.prefs.v356networkDNS优选356 = !current
    AppToast.show(this, "Network DNS优选356: ${if (!current) "ON" else "OFF"}")
}
