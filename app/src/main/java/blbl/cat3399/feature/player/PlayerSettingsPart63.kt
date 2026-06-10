package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v821: exclude mode
internal fun PlayerActivity.showV821ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v821exclude
    FeaturePrefsStore.batch821.v821exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v821: execute mode
internal fun PlayerActivity.showV821ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v821execute
    FeaturePrefsStore.batch821.v821execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v821: exit mode
internal fun PlayerActivity.showV821ExitToggle() {
    val current = FeaturePrefsStore.batch821.v821exit
    FeaturePrefsStore.batch821.v821exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v821: expand mode
internal fun PlayerActivity.showV821ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v821expand
    FeaturePrefsStore.batch821.v821expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v821: expect mode
internal fun PlayerActivity.showV821ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v821expect
    FeaturePrefsStore.batch821.v821expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v821: export level
internal fun PlayerActivity.showV821ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v821export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v821export = value
        AppToast.show(this, "export: $value")
    }
}

// v821: extend level
internal fun PlayerActivity.showV821ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v821extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v821extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v821: external level
internal fun PlayerActivity.showV821ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v821external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v821external = value
        AppToast.show(this, "external: $value")
    }
}

// v821: extract level
internal fun PlayerActivity.showV821ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v821extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v821extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v821: face level
internal fun PlayerActivity.showV821FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v821face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v821face = value
        AppToast.show(this, "face: $value")
    }
}

// v821: factor mode
internal fun PlayerActivity.showV821FactorToggle() {
    val current = FeaturePrefsStore.batch821.v821factor
    FeaturePrefsStore.batch821.v821factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v821: fail mode
internal fun PlayerActivity.showV821FailToggle() {
    val current = FeaturePrefsStore.batch821.v821fail
    FeaturePrefsStore.batch821.v821fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v821: fallback mode
internal fun PlayerActivity.showV821FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v821fallback
    FeaturePrefsStore.batch821.v821fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v821: family mode
internal fun PlayerActivity.showV821FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v821family
    FeaturePrefsStore.batch821.v821family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v821: feature mode
internal fun PlayerActivity.showV821FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v821feature
    FeaturePrefsStore.batch821.v821feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v822: exclude mode
internal fun PlayerActivity.showV822ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v822exclude
    FeaturePrefsStore.batch821.v822exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v822: execute mode
internal fun PlayerActivity.showV822ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v822execute
    FeaturePrefsStore.batch821.v822execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v822: exit mode
internal fun PlayerActivity.showV822ExitToggle() {
    val current = FeaturePrefsStore.batch821.v822exit
    FeaturePrefsStore.batch821.v822exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v822: expand mode
internal fun PlayerActivity.showV822ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v822expand
    FeaturePrefsStore.batch821.v822expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v822: expect mode
internal fun PlayerActivity.showV822ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v822expect
    FeaturePrefsStore.batch821.v822expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v822: export level
internal fun PlayerActivity.showV822ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v822export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v822export = value
        AppToast.show(this, "export: $value")
    }
}

// v822: extend level
internal fun PlayerActivity.showV822ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v822extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v822extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v822: external level
internal fun PlayerActivity.showV822ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v822external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v822external = value
        AppToast.show(this, "external: $value")
    }
}

// v822: extract level
internal fun PlayerActivity.showV822ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v822extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v822extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v822: face level
internal fun PlayerActivity.showV822FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v822face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v822face = value
        AppToast.show(this, "face: $value")
    }
}

// v822: factor mode
internal fun PlayerActivity.showV822FactorToggle() {
    val current = FeaturePrefsStore.batch821.v822factor
    FeaturePrefsStore.batch821.v822factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v822: fail mode
internal fun PlayerActivity.showV822FailToggle() {
    val current = FeaturePrefsStore.batch821.v822fail
    FeaturePrefsStore.batch821.v822fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v822: fallback mode
internal fun PlayerActivity.showV822FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v822fallback
    FeaturePrefsStore.batch821.v822fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v822: family mode
internal fun PlayerActivity.showV822FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v822family
    FeaturePrefsStore.batch821.v822family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v822: feature mode
internal fun PlayerActivity.showV822FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v822feature
    FeaturePrefsStore.batch821.v822feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v823: exclude mode
internal fun PlayerActivity.showV823ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v823exclude
    FeaturePrefsStore.batch821.v823exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v823: execute mode
internal fun PlayerActivity.showV823ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v823execute
    FeaturePrefsStore.batch821.v823execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v823: exit mode
internal fun PlayerActivity.showV823ExitToggle() {
    val current = FeaturePrefsStore.batch821.v823exit
    FeaturePrefsStore.batch821.v823exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v823: expand mode
internal fun PlayerActivity.showV823ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v823expand
    FeaturePrefsStore.batch821.v823expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v823: expect mode
internal fun PlayerActivity.showV823ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v823expect
    FeaturePrefsStore.batch821.v823expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v823: export level
internal fun PlayerActivity.showV823ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v823export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v823export = value
        AppToast.show(this, "export: $value")
    }
}

// v823: extend level
internal fun PlayerActivity.showV823ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v823extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v823extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v823: external level
internal fun PlayerActivity.showV823ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v823external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v823external = value
        AppToast.show(this, "external: $value")
    }
}

// v823: extract level
internal fun PlayerActivity.showV823ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v823extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v823extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v823: face level
internal fun PlayerActivity.showV823FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v823face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v823face = value
        AppToast.show(this, "face: $value")
    }
}

// v823: factor mode
internal fun PlayerActivity.showV823FactorToggle() {
    val current = FeaturePrefsStore.batch821.v823factor
    FeaturePrefsStore.batch821.v823factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v823: fail mode
internal fun PlayerActivity.showV823FailToggle() {
    val current = FeaturePrefsStore.batch821.v823fail
    FeaturePrefsStore.batch821.v823fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v823: fallback mode
internal fun PlayerActivity.showV823FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v823fallback
    FeaturePrefsStore.batch821.v823fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v823: family mode
internal fun PlayerActivity.showV823FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v823family
    FeaturePrefsStore.batch821.v823family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v823: feature mode
internal fun PlayerActivity.showV823FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v823feature
    FeaturePrefsStore.batch821.v823feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v824: exclude mode
internal fun PlayerActivity.showV824ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v824exclude
    FeaturePrefsStore.batch821.v824exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v824: execute mode
internal fun PlayerActivity.showV824ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v824execute
    FeaturePrefsStore.batch821.v824execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v824: exit mode
internal fun PlayerActivity.showV824ExitToggle() {
    val current = FeaturePrefsStore.batch821.v824exit
    FeaturePrefsStore.batch821.v824exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v824: expand mode
internal fun PlayerActivity.showV824ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v824expand
    FeaturePrefsStore.batch821.v824expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v824: expect mode
internal fun PlayerActivity.showV824ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v824expect
    FeaturePrefsStore.batch821.v824expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v824: export level
internal fun PlayerActivity.showV824ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v824export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v824export = value
        AppToast.show(this, "export: $value")
    }
}

// v824: extend level
internal fun PlayerActivity.showV824ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v824extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v824extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v824: external level
internal fun PlayerActivity.showV824ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v824external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v824external = value
        AppToast.show(this, "external: $value")
    }
}

// v824: extract level
internal fun PlayerActivity.showV824ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v824extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v824extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v824: face level
internal fun PlayerActivity.showV824FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v824face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v824face = value
        AppToast.show(this, "face: $value")
    }
}

// v824: factor mode
internal fun PlayerActivity.showV824FactorToggle() {
    val current = FeaturePrefsStore.batch821.v824factor
    FeaturePrefsStore.batch821.v824factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v824: fail mode
internal fun PlayerActivity.showV824FailToggle() {
    val current = FeaturePrefsStore.batch821.v824fail
    FeaturePrefsStore.batch821.v824fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v824: fallback mode
internal fun PlayerActivity.showV824FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v824fallback
    FeaturePrefsStore.batch821.v824fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v824: family mode
internal fun PlayerActivity.showV824FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v824family
    FeaturePrefsStore.batch821.v824family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v824: feature mode
internal fun PlayerActivity.showV824FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v824feature
    FeaturePrefsStore.batch821.v824feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v825: exclude mode
internal fun PlayerActivity.showV825ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v825exclude
    FeaturePrefsStore.batch821.v825exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v825: execute mode
internal fun PlayerActivity.showV825ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v825execute
    FeaturePrefsStore.batch821.v825execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v825: exit mode
internal fun PlayerActivity.showV825ExitToggle() {
    val current = FeaturePrefsStore.batch821.v825exit
    FeaturePrefsStore.batch821.v825exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v825: expand mode
internal fun PlayerActivity.showV825ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v825expand
    FeaturePrefsStore.batch821.v825expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v825: expect mode
internal fun PlayerActivity.showV825ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v825expect
    FeaturePrefsStore.batch821.v825expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v825: export level
internal fun PlayerActivity.showV825ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v825export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v825export = value
        AppToast.show(this, "export: $value")
    }
}

// v825: extend level
internal fun PlayerActivity.showV825ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v825extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v825extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v825: external level
internal fun PlayerActivity.showV825ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v825external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v825external = value
        AppToast.show(this, "external: $value")
    }
}

// v825: extract level
internal fun PlayerActivity.showV825ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v825extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v825extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v825: face level
internal fun PlayerActivity.showV825FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v825face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v825face = value
        AppToast.show(this, "face: $value")
    }
}

// v825: factor mode
internal fun PlayerActivity.showV825FactorToggle() {
    val current = FeaturePrefsStore.batch821.v825factor
    FeaturePrefsStore.batch821.v825factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v825: fail mode
internal fun PlayerActivity.showV825FailToggle() {
    val current = FeaturePrefsStore.batch821.v825fail
    FeaturePrefsStore.batch821.v825fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v825: fallback mode
internal fun PlayerActivity.showV825FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v825fallback
    FeaturePrefsStore.batch821.v825fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v825: family mode
internal fun PlayerActivity.showV825FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v825family
    FeaturePrefsStore.batch821.v825family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v825: feature mode
internal fun PlayerActivity.showV825FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v825feature
    FeaturePrefsStore.batch821.v825feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v826: exclude mode
internal fun PlayerActivity.showV826ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v826exclude
    FeaturePrefsStore.batch821.v826exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v826: execute mode
internal fun PlayerActivity.showV826ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v826execute
    FeaturePrefsStore.batch821.v826execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v826: exit mode
internal fun PlayerActivity.showV826ExitToggle() {
    val current = FeaturePrefsStore.batch821.v826exit
    FeaturePrefsStore.batch821.v826exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v826: expand mode
internal fun PlayerActivity.showV826ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v826expand
    FeaturePrefsStore.batch821.v826expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v826: expect mode
internal fun PlayerActivity.showV826ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v826expect
    FeaturePrefsStore.batch821.v826expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v826: export level
internal fun PlayerActivity.showV826ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v826export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v826export = value
        AppToast.show(this, "export: $value")
    }
}

// v826: extend level
internal fun PlayerActivity.showV826ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v826extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v826extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v826: external level
internal fun PlayerActivity.showV826ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v826external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v826external = value
        AppToast.show(this, "external: $value")
    }
}

// v826: extract level
internal fun PlayerActivity.showV826ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v826extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v826extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v826: face level
internal fun PlayerActivity.showV826FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v826face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v826face = value
        AppToast.show(this, "face: $value")
    }
}

// v826: factor mode
internal fun PlayerActivity.showV826FactorToggle() {
    val current = FeaturePrefsStore.batch821.v826factor
    FeaturePrefsStore.batch821.v826factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v826: fail mode
internal fun PlayerActivity.showV826FailToggle() {
    val current = FeaturePrefsStore.batch821.v826fail
    FeaturePrefsStore.batch821.v826fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v826: fallback mode
internal fun PlayerActivity.showV826FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v826fallback
    FeaturePrefsStore.batch821.v826fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v826: family mode
internal fun PlayerActivity.showV826FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v826family
    FeaturePrefsStore.batch821.v826family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v826: feature mode
internal fun PlayerActivity.showV826FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v826feature
    FeaturePrefsStore.batch821.v826feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v827: exclude mode
internal fun PlayerActivity.showV827ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v827exclude
    FeaturePrefsStore.batch821.v827exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v827: execute mode
internal fun PlayerActivity.showV827ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v827execute
    FeaturePrefsStore.batch821.v827execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v827: exit mode
internal fun PlayerActivity.showV827ExitToggle() {
    val current = FeaturePrefsStore.batch821.v827exit
    FeaturePrefsStore.batch821.v827exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v827: expand mode
internal fun PlayerActivity.showV827ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v827expand
    FeaturePrefsStore.batch821.v827expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v827: expect mode
internal fun PlayerActivity.showV827ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v827expect
    FeaturePrefsStore.batch821.v827expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v827: export level
internal fun PlayerActivity.showV827ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v827export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v827export = value
        AppToast.show(this, "export: $value")
    }
}

// v827: extend level
internal fun PlayerActivity.showV827ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v827extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v827extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v827: external level
internal fun PlayerActivity.showV827ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v827external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v827external = value
        AppToast.show(this, "external: $value")
    }
}

// v827: extract level
internal fun PlayerActivity.showV827ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v827extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v827extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v827: face level
internal fun PlayerActivity.showV827FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v827face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v827face = value
        AppToast.show(this, "face: $value")
    }
}

// v827: factor mode
internal fun PlayerActivity.showV827FactorToggle() {
    val current = FeaturePrefsStore.batch821.v827factor
    FeaturePrefsStore.batch821.v827factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v827: fail mode
internal fun PlayerActivity.showV827FailToggle() {
    val current = FeaturePrefsStore.batch821.v827fail
    FeaturePrefsStore.batch821.v827fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v827: fallback mode
internal fun PlayerActivity.showV827FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v827fallback
    FeaturePrefsStore.batch821.v827fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v827: family mode
internal fun PlayerActivity.showV827FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v827family
    FeaturePrefsStore.batch821.v827family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v827: feature mode
internal fun PlayerActivity.showV827FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v827feature
    FeaturePrefsStore.batch821.v827feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v828: exclude mode
internal fun PlayerActivity.showV828ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v828exclude
    FeaturePrefsStore.batch821.v828exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v828: execute mode
internal fun PlayerActivity.showV828ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v828execute
    FeaturePrefsStore.batch821.v828execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v828: exit mode
internal fun PlayerActivity.showV828ExitToggle() {
    val current = FeaturePrefsStore.batch821.v828exit
    FeaturePrefsStore.batch821.v828exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v828: expand mode
internal fun PlayerActivity.showV828ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v828expand
    FeaturePrefsStore.batch821.v828expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v828: expect mode
internal fun PlayerActivity.showV828ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v828expect
    FeaturePrefsStore.batch821.v828expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v828: export level
internal fun PlayerActivity.showV828ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v828export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v828export = value
        AppToast.show(this, "export: $value")
    }
}

// v828: extend level
internal fun PlayerActivity.showV828ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v828extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v828extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v828: external level
internal fun PlayerActivity.showV828ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v828external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v828external = value
        AppToast.show(this, "external: $value")
    }
}

// v828: extract level
internal fun PlayerActivity.showV828ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v828extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v828extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v828: face level
internal fun PlayerActivity.showV828FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v828face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v828face = value
        AppToast.show(this, "face: $value")
    }
}

// v828: factor mode
internal fun PlayerActivity.showV828FactorToggle() {
    val current = FeaturePrefsStore.batch821.v828factor
    FeaturePrefsStore.batch821.v828factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v828: fail mode
internal fun PlayerActivity.showV828FailToggle() {
    val current = FeaturePrefsStore.batch821.v828fail
    FeaturePrefsStore.batch821.v828fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v828: fallback mode
internal fun PlayerActivity.showV828FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v828fallback
    FeaturePrefsStore.batch821.v828fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v828: family mode
internal fun PlayerActivity.showV828FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v828family
    FeaturePrefsStore.batch821.v828family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v828: feature mode
internal fun PlayerActivity.showV828FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v828feature
    FeaturePrefsStore.batch821.v828feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v829: exclude mode
internal fun PlayerActivity.showV829ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v829exclude
    FeaturePrefsStore.batch821.v829exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v829: execute mode
internal fun PlayerActivity.showV829ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v829execute
    FeaturePrefsStore.batch821.v829execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v829: exit mode
internal fun PlayerActivity.showV829ExitToggle() {
    val current = FeaturePrefsStore.batch821.v829exit
    FeaturePrefsStore.batch821.v829exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v829: expand mode
internal fun PlayerActivity.showV829ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v829expand
    FeaturePrefsStore.batch821.v829expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v829: expect mode
internal fun PlayerActivity.showV829ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v829expect
    FeaturePrefsStore.batch821.v829expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v829: export level
internal fun PlayerActivity.showV829ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v829export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v829export = value
        AppToast.show(this, "export: $value")
    }
}

// v829: extend level
internal fun PlayerActivity.showV829ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v829extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v829extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v829: external level
internal fun PlayerActivity.showV829ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v829external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v829external = value
        AppToast.show(this, "external: $value")
    }
}

// v829: extract level
internal fun PlayerActivity.showV829ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v829extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v829extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v829: face level
internal fun PlayerActivity.showV829FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v829face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v829face = value
        AppToast.show(this, "face: $value")
    }
}

// v829: factor mode
internal fun PlayerActivity.showV829FactorToggle() {
    val current = FeaturePrefsStore.batch821.v829factor
    FeaturePrefsStore.batch821.v829factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v829: fail mode
internal fun PlayerActivity.showV829FailToggle() {
    val current = FeaturePrefsStore.batch821.v829fail
    FeaturePrefsStore.batch821.v829fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v829: fallback mode
internal fun PlayerActivity.showV829FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v829fallback
    FeaturePrefsStore.batch821.v829fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v829: family mode
internal fun PlayerActivity.showV829FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v829family
    FeaturePrefsStore.batch821.v829family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v829: feature mode
internal fun PlayerActivity.showV829FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v829feature
    FeaturePrefsStore.batch821.v829feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

// v830: exclude mode
internal fun PlayerActivity.showV830ExcludeToggle() {
    val current = FeaturePrefsStore.batch821.v830exclude
    FeaturePrefsStore.batch821.v830exclude = !current
    AppToast.show(this, "exclude: ${if (!current) "ON" else "OFF"}")
}

// v830: execute mode
internal fun PlayerActivity.showV830ExecuteToggle() {
    val current = FeaturePrefsStore.batch821.v830execute
    FeaturePrefsStore.batch821.v830execute = !current
    AppToast.show(this, "execute: ${if (!current) "ON" else "OFF"}")
}

// v830: exit mode
internal fun PlayerActivity.showV830ExitToggle() {
    val current = FeaturePrefsStore.batch821.v830exit
    FeaturePrefsStore.batch821.v830exit = !current
    AppToast.show(this, "exit: ${if (!current) "ON" else "OFF"}")
}

// v830: expand mode
internal fun PlayerActivity.showV830ExpandToggle() {
    val current = FeaturePrefsStore.batch821.v830expand
    FeaturePrefsStore.batch821.v830expand = !current
    AppToast.show(this, "expand: ${if (!current) "ON" else "OFF"}")
}

// v830: expect mode
internal fun PlayerActivity.showV830ExpectToggle() {
    val current = FeaturePrefsStore.batch821.v830expect
    FeaturePrefsStore.batch821.v830expect = !current
    AppToast.show(this, "expect: ${if (!current) "ON" else "OFF"}")
}

// v830: export level
internal fun PlayerActivity.showV830ExportDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v830export).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "export level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v830export = value
        AppToast.show(this, "export: $value")
    }
}

// v830: extend level
internal fun PlayerActivity.showV830ExtendDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v830extend).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extend level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v830extend = value
        AppToast.show(this, "extend: $value")
    }
}

// v830: external level
internal fun PlayerActivity.showV830ExternalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v830external).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "external level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v830external = value
        AppToast.show(this, "external: $value")
    }
}

// v830: extract level
internal fun PlayerActivity.showV830ExtractDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v830extract).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "extract level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v830extract = value
        AppToast.show(this, "extract: $value")
    }
}

// v830: face level
internal fun PlayerActivity.showV830FaceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch821.v830face).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "face level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch821.v830face = value
        AppToast.show(this, "face: $value")
    }
}

// v830: factor mode
internal fun PlayerActivity.showV830FactorToggle() {
    val current = FeaturePrefsStore.batch821.v830factor
    FeaturePrefsStore.batch821.v830factor = !current
    AppToast.show(this, "factor: ${if (!current) "ON" else "OFF"}")
}

// v830: fail mode
internal fun PlayerActivity.showV830FailToggle() {
    val current = FeaturePrefsStore.batch821.v830fail
    FeaturePrefsStore.batch821.v830fail = !current
    AppToast.show(this, "fail: ${if (!current) "ON" else "OFF"}")
}

// v830: fallback mode
internal fun PlayerActivity.showV830FallbackToggle() {
    val current = FeaturePrefsStore.batch821.v830fallback
    FeaturePrefsStore.batch821.v830fallback = !current
    AppToast.show(this, "fallback: ${if (!current) "ON" else "OFF"}")
}

// v830: family mode
internal fun PlayerActivity.showV830FamilyToggle() {
    val current = FeaturePrefsStore.batch821.v830family
    FeaturePrefsStore.batch821.v830family = !current
    AppToast.show(this, "family: ${if (!current) "ON" else "OFF"}")
}

// v830: feature mode
internal fun PlayerActivity.showV830FeatureToggle() {
    val current = FeaturePrefsStore.batch821.v830feature
    FeaturePrefsStore.batch821.v830feature = !current
    AppToast.show(this, "feature: ${if (!current) "ON" else "OFF"}")
}

