package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1021: recover mode
internal fun PlayerActivity.showV1021RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1021recover
    FeaturePrefsStore.batch1021.v1021recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1021: recycle mode
internal fun PlayerActivity.showV1021RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1021recycle
    FeaturePrefsStore.batch1021.v1021recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1021: redirect mode
internal fun PlayerActivity.showV1021RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1021redirect
    FeaturePrefsStore.batch1021.v1021redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1021: reduce mode
internal fun PlayerActivity.showV1021ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1021reduce
    FeaturePrefsStore.batch1021.v1021reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1021: ref mode
internal fun PlayerActivity.showV1021RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1021ref
    FeaturePrefsStore.batch1021.v1021ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1021: reference level
internal fun PlayerActivity.showV1021ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1021reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1021reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1021: refresh level
internal fun PlayerActivity.showV1021RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1021refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1021refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1021: register level
internal fun PlayerActivity.showV1021RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1021register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1021register = value
        AppToast.show(this, "register: $value")
    }
}

// v1021: regular level
internal fun PlayerActivity.showV1021RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1021regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1021regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1021: reject level
internal fun PlayerActivity.showV1021RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1021reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1021reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1021: relate mode
internal fun PlayerActivity.showV1021RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1021relate
    FeaturePrefsStore.batch1021.v1021relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1021: release mode
internal fun PlayerActivity.showV1021ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1021release
    FeaturePrefsStore.batch1021.v1021release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1021: remote mode
internal fun PlayerActivity.showV1021RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1021remote
    FeaturePrefsStore.batch1021.v1021remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1021: remove mode
internal fun PlayerActivity.showV1021RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1021remove
    FeaturePrefsStore.batch1021.v1021remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1021: rename mode
internal fun PlayerActivity.showV1021RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1021rename
    FeaturePrefsStore.batch1021.v1021rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1022: recover mode
internal fun PlayerActivity.showV1022RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1022recover
    FeaturePrefsStore.batch1021.v1022recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1022: recycle mode
internal fun PlayerActivity.showV1022RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1022recycle
    FeaturePrefsStore.batch1021.v1022recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1022: redirect mode
internal fun PlayerActivity.showV1022RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1022redirect
    FeaturePrefsStore.batch1021.v1022redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1022: reduce mode
internal fun PlayerActivity.showV1022ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1022reduce
    FeaturePrefsStore.batch1021.v1022reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1022: ref mode
internal fun PlayerActivity.showV1022RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1022ref
    FeaturePrefsStore.batch1021.v1022ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1022: reference level
internal fun PlayerActivity.showV1022ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1022reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1022reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1022: refresh level
internal fun PlayerActivity.showV1022RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1022refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1022refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1022: register level
internal fun PlayerActivity.showV1022RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1022register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1022register = value
        AppToast.show(this, "register: $value")
    }
}

// v1022: regular level
internal fun PlayerActivity.showV1022RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1022regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1022regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1022: reject level
internal fun PlayerActivity.showV1022RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1022reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1022reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1022: relate mode
internal fun PlayerActivity.showV1022RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1022relate
    FeaturePrefsStore.batch1021.v1022relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1022: release mode
internal fun PlayerActivity.showV1022ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1022release
    FeaturePrefsStore.batch1021.v1022release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1022: remote mode
internal fun PlayerActivity.showV1022RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1022remote
    FeaturePrefsStore.batch1021.v1022remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1022: remove mode
internal fun PlayerActivity.showV1022RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1022remove
    FeaturePrefsStore.batch1021.v1022remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1022: rename mode
internal fun PlayerActivity.showV1022RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1022rename
    FeaturePrefsStore.batch1021.v1022rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1023: recover mode
internal fun PlayerActivity.showV1023RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1023recover
    FeaturePrefsStore.batch1021.v1023recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1023: recycle mode
internal fun PlayerActivity.showV1023RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1023recycle
    FeaturePrefsStore.batch1021.v1023recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1023: redirect mode
internal fun PlayerActivity.showV1023RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1023redirect
    FeaturePrefsStore.batch1021.v1023redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1023: reduce mode
internal fun PlayerActivity.showV1023ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1023reduce
    FeaturePrefsStore.batch1021.v1023reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1023: ref mode
internal fun PlayerActivity.showV1023RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1023ref
    FeaturePrefsStore.batch1021.v1023ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1023: reference level
internal fun PlayerActivity.showV1023ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1023reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1023reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1023: refresh level
internal fun PlayerActivity.showV1023RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1023refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1023refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1023: register level
internal fun PlayerActivity.showV1023RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1023register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1023register = value
        AppToast.show(this, "register: $value")
    }
}

// v1023: regular level
internal fun PlayerActivity.showV1023RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1023regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1023regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1023: reject level
internal fun PlayerActivity.showV1023RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1023reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1023reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1023: relate mode
internal fun PlayerActivity.showV1023RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1023relate
    FeaturePrefsStore.batch1021.v1023relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1023: release mode
internal fun PlayerActivity.showV1023ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1023release
    FeaturePrefsStore.batch1021.v1023release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1023: remote mode
internal fun PlayerActivity.showV1023RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1023remote
    FeaturePrefsStore.batch1021.v1023remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1023: remove mode
internal fun PlayerActivity.showV1023RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1023remove
    FeaturePrefsStore.batch1021.v1023remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1023: rename mode
internal fun PlayerActivity.showV1023RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1023rename
    FeaturePrefsStore.batch1021.v1023rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1024: recover mode
internal fun PlayerActivity.showV1024RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1024recover
    FeaturePrefsStore.batch1021.v1024recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1024: recycle mode
internal fun PlayerActivity.showV1024RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1024recycle
    FeaturePrefsStore.batch1021.v1024recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1024: redirect mode
internal fun PlayerActivity.showV1024RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1024redirect
    FeaturePrefsStore.batch1021.v1024redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1024: reduce mode
internal fun PlayerActivity.showV1024ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1024reduce
    FeaturePrefsStore.batch1021.v1024reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1024: ref mode
internal fun PlayerActivity.showV1024RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1024ref
    FeaturePrefsStore.batch1021.v1024ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1024: reference level
internal fun PlayerActivity.showV1024ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1024reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1024reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1024: refresh level
internal fun PlayerActivity.showV1024RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1024refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1024refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1024: register level
internal fun PlayerActivity.showV1024RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1024register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1024register = value
        AppToast.show(this, "register: $value")
    }
}

// v1024: regular level
internal fun PlayerActivity.showV1024RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1024regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1024regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1024: reject level
internal fun PlayerActivity.showV1024RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1024reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1024reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1024: relate mode
internal fun PlayerActivity.showV1024RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1024relate
    FeaturePrefsStore.batch1021.v1024relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1024: release mode
internal fun PlayerActivity.showV1024ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1024release
    FeaturePrefsStore.batch1021.v1024release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1024: remote mode
internal fun PlayerActivity.showV1024RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1024remote
    FeaturePrefsStore.batch1021.v1024remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1024: remove mode
internal fun PlayerActivity.showV1024RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1024remove
    FeaturePrefsStore.batch1021.v1024remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1024: rename mode
internal fun PlayerActivity.showV1024RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1024rename
    FeaturePrefsStore.batch1021.v1024rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1025: recover mode
internal fun PlayerActivity.showV1025RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1025recover
    FeaturePrefsStore.batch1021.v1025recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1025: recycle mode
internal fun PlayerActivity.showV1025RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1025recycle
    FeaturePrefsStore.batch1021.v1025recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1025: redirect mode
internal fun PlayerActivity.showV1025RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1025redirect
    FeaturePrefsStore.batch1021.v1025redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1025: reduce mode
internal fun PlayerActivity.showV1025ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1025reduce
    FeaturePrefsStore.batch1021.v1025reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1025: ref mode
internal fun PlayerActivity.showV1025RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1025ref
    FeaturePrefsStore.batch1021.v1025ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1025: reference level
internal fun PlayerActivity.showV1025ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1025reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1025reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1025: refresh level
internal fun PlayerActivity.showV1025RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1025refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1025refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1025: register level
internal fun PlayerActivity.showV1025RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1025register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1025register = value
        AppToast.show(this, "register: $value")
    }
}

// v1025: regular level
internal fun PlayerActivity.showV1025RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1025regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1025regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1025: reject level
internal fun PlayerActivity.showV1025RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1025reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1025reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1025: relate mode
internal fun PlayerActivity.showV1025RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1025relate
    FeaturePrefsStore.batch1021.v1025relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1025: release mode
internal fun PlayerActivity.showV1025ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1025release
    FeaturePrefsStore.batch1021.v1025release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1025: remote mode
internal fun PlayerActivity.showV1025RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1025remote
    FeaturePrefsStore.batch1021.v1025remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1025: remove mode
internal fun PlayerActivity.showV1025RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1025remove
    FeaturePrefsStore.batch1021.v1025remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1025: rename mode
internal fun PlayerActivity.showV1025RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1025rename
    FeaturePrefsStore.batch1021.v1025rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1026: recover mode
internal fun PlayerActivity.showV1026RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1026recover
    FeaturePrefsStore.batch1021.v1026recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1026: recycle mode
internal fun PlayerActivity.showV1026RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1026recycle
    FeaturePrefsStore.batch1021.v1026recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1026: redirect mode
internal fun PlayerActivity.showV1026RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1026redirect
    FeaturePrefsStore.batch1021.v1026redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1026: reduce mode
internal fun PlayerActivity.showV1026ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1026reduce
    FeaturePrefsStore.batch1021.v1026reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1026: ref mode
internal fun PlayerActivity.showV1026RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1026ref
    FeaturePrefsStore.batch1021.v1026ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1026: reference level
internal fun PlayerActivity.showV1026ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1026reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1026reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1026: refresh level
internal fun PlayerActivity.showV1026RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1026refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1026refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1026: register level
internal fun PlayerActivity.showV1026RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1026register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1026register = value
        AppToast.show(this, "register: $value")
    }
}

// v1026: regular level
internal fun PlayerActivity.showV1026RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1026regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1026regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1026: reject level
internal fun PlayerActivity.showV1026RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1026reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1026reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1026: relate mode
internal fun PlayerActivity.showV1026RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1026relate
    FeaturePrefsStore.batch1021.v1026relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1026: release mode
internal fun PlayerActivity.showV1026ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1026release
    FeaturePrefsStore.batch1021.v1026release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1026: remote mode
internal fun PlayerActivity.showV1026RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1026remote
    FeaturePrefsStore.batch1021.v1026remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1026: remove mode
internal fun PlayerActivity.showV1026RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1026remove
    FeaturePrefsStore.batch1021.v1026remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1026: rename mode
internal fun PlayerActivity.showV1026RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1026rename
    FeaturePrefsStore.batch1021.v1026rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1027: recover mode
internal fun PlayerActivity.showV1027RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1027recover
    FeaturePrefsStore.batch1021.v1027recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1027: recycle mode
internal fun PlayerActivity.showV1027RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1027recycle
    FeaturePrefsStore.batch1021.v1027recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1027: redirect mode
internal fun PlayerActivity.showV1027RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1027redirect
    FeaturePrefsStore.batch1021.v1027redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1027: reduce mode
internal fun PlayerActivity.showV1027ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1027reduce
    FeaturePrefsStore.batch1021.v1027reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1027: ref mode
internal fun PlayerActivity.showV1027RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1027ref
    FeaturePrefsStore.batch1021.v1027ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1027: reference level
internal fun PlayerActivity.showV1027ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1027reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1027reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1027: refresh level
internal fun PlayerActivity.showV1027RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1027refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1027refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1027: register level
internal fun PlayerActivity.showV1027RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1027register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1027register = value
        AppToast.show(this, "register: $value")
    }
}

// v1027: regular level
internal fun PlayerActivity.showV1027RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1027regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1027regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1027: reject level
internal fun PlayerActivity.showV1027RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1027reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1027reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1027: relate mode
internal fun PlayerActivity.showV1027RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1027relate
    FeaturePrefsStore.batch1021.v1027relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1027: release mode
internal fun PlayerActivity.showV1027ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1027release
    FeaturePrefsStore.batch1021.v1027release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1027: remote mode
internal fun PlayerActivity.showV1027RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1027remote
    FeaturePrefsStore.batch1021.v1027remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1027: remove mode
internal fun PlayerActivity.showV1027RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1027remove
    FeaturePrefsStore.batch1021.v1027remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1027: rename mode
internal fun PlayerActivity.showV1027RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1027rename
    FeaturePrefsStore.batch1021.v1027rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1028: recover mode
internal fun PlayerActivity.showV1028RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1028recover
    FeaturePrefsStore.batch1021.v1028recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1028: recycle mode
internal fun PlayerActivity.showV1028RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1028recycle
    FeaturePrefsStore.batch1021.v1028recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1028: redirect mode
internal fun PlayerActivity.showV1028RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1028redirect
    FeaturePrefsStore.batch1021.v1028redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1028: reduce mode
internal fun PlayerActivity.showV1028ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1028reduce
    FeaturePrefsStore.batch1021.v1028reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1028: ref mode
internal fun PlayerActivity.showV1028RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1028ref
    FeaturePrefsStore.batch1021.v1028ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1028: reference level
internal fun PlayerActivity.showV1028ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1028reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1028reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1028: refresh level
internal fun PlayerActivity.showV1028RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1028refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1028refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1028: register level
internal fun PlayerActivity.showV1028RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1028register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1028register = value
        AppToast.show(this, "register: $value")
    }
}

// v1028: regular level
internal fun PlayerActivity.showV1028RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1028regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1028regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1028: reject level
internal fun PlayerActivity.showV1028RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1028reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1028reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1028: relate mode
internal fun PlayerActivity.showV1028RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1028relate
    FeaturePrefsStore.batch1021.v1028relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1028: release mode
internal fun PlayerActivity.showV1028ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1028release
    FeaturePrefsStore.batch1021.v1028release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1028: remote mode
internal fun PlayerActivity.showV1028RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1028remote
    FeaturePrefsStore.batch1021.v1028remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1028: remove mode
internal fun PlayerActivity.showV1028RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1028remove
    FeaturePrefsStore.batch1021.v1028remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1028: rename mode
internal fun PlayerActivity.showV1028RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1028rename
    FeaturePrefsStore.batch1021.v1028rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1029: recover mode
internal fun PlayerActivity.showV1029RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1029recover
    FeaturePrefsStore.batch1021.v1029recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1029: recycle mode
internal fun PlayerActivity.showV1029RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1029recycle
    FeaturePrefsStore.batch1021.v1029recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1029: redirect mode
internal fun PlayerActivity.showV1029RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1029redirect
    FeaturePrefsStore.batch1021.v1029redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1029: reduce mode
internal fun PlayerActivity.showV1029ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1029reduce
    FeaturePrefsStore.batch1021.v1029reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1029: ref mode
internal fun PlayerActivity.showV1029RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1029ref
    FeaturePrefsStore.batch1021.v1029ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1029: reference level
internal fun PlayerActivity.showV1029ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1029reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1029reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1029: refresh level
internal fun PlayerActivity.showV1029RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1029refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1029refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1029: register level
internal fun PlayerActivity.showV1029RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1029register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1029register = value
        AppToast.show(this, "register: $value")
    }
}

// v1029: regular level
internal fun PlayerActivity.showV1029RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1029regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1029regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1029: reject level
internal fun PlayerActivity.showV1029RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1029reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1029reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1029: relate mode
internal fun PlayerActivity.showV1029RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1029relate
    FeaturePrefsStore.batch1021.v1029relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1029: release mode
internal fun PlayerActivity.showV1029ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1029release
    FeaturePrefsStore.batch1021.v1029release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1029: remote mode
internal fun PlayerActivity.showV1029RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1029remote
    FeaturePrefsStore.batch1021.v1029remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1029: remove mode
internal fun PlayerActivity.showV1029RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1029remove
    FeaturePrefsStore.batch1021.v1029remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1029: rename mode
internal fun PlayerActivity.showV1029RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1029rename
    FeaturePrefsStore.batch1021.v1029rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

// v1030: recover mode
internal fun PlayerActivity.showV1030RecoverToggle() {
    val current = FeaturePrefsStore.batch1021.v1030recover
    FeaturePrefsStore.batch1021.v1030recover = !current
    AppToast.show(this, "recover: ${if (!current) "ON" else "OFF"}")
}

// v1030: recycle mode
internal fun PlayerActivity.showV1030RecycleToggle() {
    val current = FeaturePrefsStore.batch1021.v1030recycle
    FeaturePrefsStore.batch1021.v1030recycle = !current
    AppToast.show(this, "recycle: ${if (!current) "ON" else "OFF"}")
}

// v1030: redirect mode
internal fun PlayerActivity.showV1030RedirectToggle() {
    val current = FeaturePrefsStore.batch1021.v1030redirect
    FeaturePrefsStore.batch1021.v1030redirect = !current
    AppToast.show(this, "redirect: ${if (!current) "ON" else "OFF"}")
}

// v1030: reduce mode
internal fun PlayerActivity.showV1030ReduceToggle() {
    val current = FeaturePrefsStore.batch1021.v1030reduce
    FeaturePrefsStore.batch1021.v1030reduce = !current
    AppToast.show(this, "reduce: ${if (!current) "ON" else "OFF"}")
}

// v1030: ref mode
internal fun PlayerActivity.showV1030RefToggle() {
    val current = FeaturePrefsStore.batch1021.v1030ref
    FeaturePrefsStore.batch1021.v1030ref = !current
    AppToast.show(this, "ref: ${if (!current) "ON" else "OFF"}")
}

// v1030: reference level
internal fun PlayerActivity.showV1030ReferenceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1030reference).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reference level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1030reference = value
        AppToast.show(this, "reference: $value")
    }
}

// v1030: refresh level
internal fun PlayerActivity.showV1030RefreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1030refresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "refresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1030refresh = value
        AppToast.show(this, "refresh: $value")
    }
}

// v1030: register level
internal fun PlayerActivity.showV1030RegisterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1030register).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "register level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1030register = value
        AppToast.show(this, "register: $value")
    }
}

// v1030: regular level
internal fun PlayerActivity.showV1030RegularDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1030regular).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "regular level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1030regular = value
        AppToast.show(this, "regular: $value")
    }
}

// v1030: reject level
internal fun PlayerActivity.showV1030RejectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1021.v1030reject).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reject level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1021.v1030reject = value
        AppToast.show(this, "reject: $value")
    }
}

// v1030: relate mode
internal fun PlayerActivity.showV1030RelateToggle() {
    val current = FeaturePrefsStore.batch1021.v1030relate
    FeaturePrefsStore.batch1021.v1030relate = !current
    AppToast.show(this, "relate: ${if (!current) "ON" else "OFF"}")
}

// v1030: release mode
internal fun PlayerActivity.showV1030ReleaseToggle() {
    val current = FeaturePrefsStore.batch1021.v1030release
    FeaturePrefsStore.batch1021.v1030release = !current
    AppToast.show(this, "release: ${if (!current) "ON" else "OFF"}")
}

// v1030: remote mode
internal fun PlayerActivity.showV1030RemoteToggle() {
    val current = FeaturePrefsStore.batch1021.v1030remote
    FeaturePrefsStore.batch1021.v1030remote = !current
    AppToast.show(this, "remote: ${if (!current) "ON" else "OFF"}")
}

// v1030: remove mode
internal fun PlayerActivity.showV1030RemoveToggle() {
    val current = FeaturePrefsStore.batch1021.v1030remove
    FeaturePrefsStore.batch1021.v1030remove = !current
    AppToast.show(this, "remove: ${if (!current) "ON" else "OFF"}")
}

// v1030: rename mode
internal fun PlayerActivity.showV1030RenameToggle() {
    val current = FeaturePrefsStore.batch1021.v1030rename
    FeaturePrefsStore.batch1021.v1030rename = !current
    AppToast.show(this, "rename: ${if (!current) "ON" else "OFF"}")
}

