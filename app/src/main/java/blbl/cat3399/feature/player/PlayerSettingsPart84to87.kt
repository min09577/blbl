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

// v1031: render mode
internal fun PlayerActivity.showV1031RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1031render
    FeaturePrefsStore.batch1031.v1031render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1031: repeat mode
internal fun PlayerActivity.showV1031RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1031repeat
    FeaturePrefsStore.batch1031.v1031repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1031: replace mode
internal fun PlayerActivity.showV1031ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1031replace
    FeaturePrefsStore.batch1031.v1031replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1031: report mode
internal fun PlayerActivity.showV1031ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1031report
    FeaturePrefsStore.batch1031.v1031report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1031: request mode
internal fun PlayerActivity.showV1031RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1031request
    FeaturePrefsStore.batch1031.v1031request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1031: require level
internal fun PlayerActivity.showV1031RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1031require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1031require = value
        AppToast.show(this, "require: $value")
    }
}

// v1031: reset level
internal fun PlayerActivity.showV1031ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1031reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1031reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1031: resize level
internal fun PlayerActivity.showV1031ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1031resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1031resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1031: resolve level
internal fun PlayerActivity.showV1031ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1031resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1031resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1031: resource level
internal fun PlayerActivity.showV1031ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1031resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1031resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1031: response mode
internal fun PlayerActivity.showV1031ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1031response
    FeaturePrefsStore.batch1031.v1031response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1031: restart mode
internal fun PlayerActivity.showV1031RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1031restart
    FeaturePrefsStore.batch1031.v1031restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1031: restore mode
internal fun PlayerActivity.showV1031RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1031restore
    FeaturePrefsStore.batch1031.v1031restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1031: result mode
internal fun PlayerActivity.showV1031ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1031result
    FeaturePrefsStore.batch1031.v1031result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1031: retry mode
internal fun PlayerActivity.showV1031RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1031retry
    FeaturePrefsStore.batch1031.v1031retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1032: render mode
internal fun PlayerActivity.showV1032RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1032render
    FeaturePrefsStore.batch1031.v1032render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1032: repeat mode
internal fun PlayerActivity.showV1032RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1032repeat
    FeaturePrefsStore.batch1031.v1032repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1032: replace mode
internal fun PlayerActivity.showV1032ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1032replace
    FeaturePrefsStore.batch1031.v1032replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1032: report mode
internal fun PlayerActivity.showV1032ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1032report
    FeaturePrefsStore.batch1031.v1032report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1032: request mode
internal fun PlayerActivity.showV1032RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1032request
    FeaturePrefsStore.batch1031.v1032request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1032: require level
internal fun PlayerActivity.showV1032RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1032require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1032require = value
        AppToast.show(this, "require: $value")
    }
}

// v1032: reset level
internal fun PlayerActivity.showV1032ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1032reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1032reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1032: resize level
internal fun PlayerActivity.showV1032ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1032resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1032resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1032: resolve level
internal fun PlayerActivity.showV1032ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1032resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1032resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1032: resource level
internal fun PlayerActivity.showV1032ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1032resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1032resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1032: response mode
internal fun PlayerActivity.showV1032ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1032response
    FeaturePrefsStore.batch1031.v1032response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1032: restart mode
internal fun PlayerActivity.showV1032RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1032restart
    FeaturePrefsStore.batch1031.v1032restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1032: restore mode
internal fun PlayerActivity.showV1032RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1032restore
    FeaturePrefsStore.batch1031.v1032restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1032: result mode
internal fun PlayerActivity.showV1032ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1032result
    FeaturePrefsStore.batch1031.v1032result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1032: retry mode
internal fun PlayerActivity.showV1032RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1032retry
    FeaturePrefsStore.batch1031.v1032retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1033: render mode
internal fun PlayerActivity.showV1033RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1033render
    FeaturePrefsStore.batch1031.v1033render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1033: repeat mode
internal fun PlayerActivity.showV1033RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1033repeat
    FeaturePrefsStore.batch1031.v1033repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1033: replace mode
internal fun PlayerActivity.showV1033ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1033replace
    FeaturePrefsStore.batch1031.v1033replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1033: report mode
internal fun PlayerActivity.showV1033ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1033report
    FeaturePrefsStore.batch1031.v1033report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1033: request mode
internal fun PlayerActivity.showV1033RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1033request
    FeaturePrefsStore.batch1031.v1033request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1033: require level
internal fun PlayerActivity.showV1033RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1033require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1033require = value
        AppToast.show(this, "require: $value")
    }
}

// v1033: reset level
internal fun PlayerActivity.showV1033ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1033reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1033reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1033: resize level
internal fun PlayerActivity.showV1033ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1033resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1033resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1033: resolve level
internal fun PlayerActivity.showV1033ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1033resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1033resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1033: resource level
internal fun PlayerActivity.showV1033ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1033resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1033resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1033: response mode
internal fun PlayerActivity.showV1033ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1033response
    FeaturePrefsStore.batch1031.v1033response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1033: restart mode
internal fun PlayerActivity.showV1033RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1033restart
    FeaturePrefsStore.batch1031.v1033restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1033: restore mode
internal fun PlayerActivity.showV1033RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1033restore
    FeaturePrefsStore.batch1031.v1033restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1033: result mode
internal fun PlayerActivity.showV1033ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1033result
    FeaturePrefsStore.batch1031.v1033result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1033: retry mode
internal fun PlayerActivity.showV1033RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1033retry
    FeaturePrefsStore.batch1031.v1033retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1034: render mode
internal fun PlayerActivity.showV1034RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1034render
    FeaturePrefsStore.batch1031.v1034render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1034: repeat mode
internal fun PlayerActivity.showV1034RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1034repeat
    FeaturePrefsStore.batch1031.v1034repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1034: replace mode
internal fun PlayerActivity.showV1034ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1034replace
    FeaturePrefsStore.batch1031.v1034replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1034: report mode
internal fun PlayerActivity.showV1034ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1034report
    FeaturePrefsStore.batch1031.v1034report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1034: request mode
internal fun PlayerActivity.showV1034RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1034request
    FeaturePrefsStore.batch1031.v1034request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1034: require level
internal fun PlayerActivity.showV1034RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1034require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1034require = value
        AppToast.show(this, "require: $value")
    }
}

// v1034: reset level
internal fun PlayerActivity.showV1034ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1034reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1034reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1034: resize level
internal fun PlayerActivity.showV1034ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1034resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1034resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1034: resolve level
internal fun PlayerActivity.showV1034ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1034resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1034resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1034: resource level
internal fun PlayerActivity.showV1034ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1034resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1034resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1034: response mode
internal fun PlayerActivity.showV1034ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1034response
    FeaturePrefsStore.batch1031.v1034response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1034: restart mode
internal fun PlayerActivity.showV1034RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1034restart
    FeaturePrefsStore.batch1031.v1034restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1034: restore mode
internal fun PlayerActivity.showV1034RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1034restore
    FeaturePrefsStore.batch1031.v1034restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1034: result mode
internal fun PlayerActivity.showV1034ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1034result
    FeaturePrefsStore.batch1031.v1034result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1034: retry mode
internal fun PlayerActivity.showV1034RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1034retry
    FeaturePrefsStore.batch1031.v1034retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1035: render mode
internal fun PlayerActivity.showV1035RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1035render
    FeaturePrefsStore.batch1031.v1035render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1035: repeat mode
internal fun PlayerActivity.showV1035RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1035repeat
    FeaturePrefsStore.batch1031.v1035repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1035: replace mode
internal fun PlayerActivity.showV1035ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1035replace
    FeaturePrefsStore.batch1031.v1035replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1035: report mode
internal fun PlayerActivity.showV1035ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1035report
    FeaturePrefsStore.batch1031.v1035report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1035: request mode
internal fun PlayerActivity.showV1035RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1035request
    FeaturePrefsStore.batch1031.v1035request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1035: require level
internal fun PlayerActivity.showV1035RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1035require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1035require = value
        AppToast.show(this, "require: $value")
    }
}

// v1035: reset level
internal fun PlayerActivity.showV1035ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1035reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1035reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1035: resize level
internal fun PlayerActivity.showV1035ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1035resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1035resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1035: resolve level
internal fun PlayerActivity.showV1035ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1035resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1035resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1035: resource level
internal fun PlayerActivity.showV1035ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1035resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1035resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1035: response mode
internal fun PlayerActivity.showV1035ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1035response
    FeaturePrefsStore.batch1031.v1035response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1035: restart mode
internal fun PlayerActivity.showV1035RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1035restart
    FeaturePrefsStore.batch1031.v1035restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1035: restore mode
internal fun PlayerActivity.showV1035RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1035restore
    FeaturePrefsStore.batch1031.v1035restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1035: result mode
internal fun PlayerActivity.showV1035ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1035result
    FeaturePrefsStore.batch1031.v1035result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1035: retry mode
internal fun PlayerActivity.showV1035RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1035retry
    FeaturePrefsStore.batch1031.v1035retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1036: render mode
internal fun PlayerActivity.showV1036RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1036render
    FeaturePrefsStore.batch1031.v1036render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1036: repeat mode
internal fun PlayerActivity.showV1036RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1036repeat
    FeaturePrefsStore.batch1031.v1036repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1036: replace mode
internal fun PlayerActivity.showV1036ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1036replace
    FeaturePrefsStore.batch1031.v1036replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1036: report mode
internal fun PlayerActivity.showV1036ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1036report
    FeaturePrefsStore.batch1031.v1036report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1036: request mode
internal fun PlayerActivity.showV1036RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1036request
    FeaturePrefsStore.batch1031.v1036request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1036: require level
internal fun PlayerActivity.showV1036RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1036require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1036require = value
        AppToast.show(this, "require: $value")
    }
}

// v1036: reset level
internal fun PlayerActivity.showV1036ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1036reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1036reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1036: resize level
internal fun PlayerActivity.showV1036ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1036resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1036resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1036: resolve level
internal fun PlayerActivity.showV1036ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1036resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1036resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1036: resource level
internal fun PlayerActivity.showV1036ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1036resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1036resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1036: response mode
internal fun PlayerActivity.showV1036ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1036response
    FeaturePrefsStore.batch1031.v1036response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1036: restart mode
internal fun PlayerActivity.showV1036RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1036restart
    FeaturePrefsStore.batch1031.v1036restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1036: restore mode
internal fun PlayerActivity.showV1036RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1036restore
    FeaturePrefsStore.batch1031.v1036restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1036: result mode
internal fun PlayerActivity.showV1036ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1036result
    FeaturePrefsStore.batch1031.v1036result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1036: retry mode
internal fun PlayerActivity.showV1036RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1036retry
    FeaturePrefsStore.batch1031.v1036retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1037: render mode
internal fun PlayerActivity.showV1037RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1037render
    FeaturePrefsStore.batch1031.v1037render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1037: repeat mode
internal fun PlayerActivity.showV1037RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1037repeat
    FeaturePrefsStore.batch1031.v1037repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1037: replace mode
internal fun PlayerActivity.showV1037ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1037replace
    FeaturePrefsStore.batch1031.v1037replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1037: report mode
internal fun PlayerActivity.showV1037ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1037report
    FeaturePrefsStore.batch1031.v1037report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1037: request mode
internal fun PlayerActivity.showV1037RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1037request
    FeaturePrefsStore.batch1031.v1037request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1037: require level
internal fun PlayerActivity.showV1037RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1037require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1037require = value
        AppToast.show(this, "require: $value")
    }
}

// v1037: reset level
internal fun PlayerActivity.showV1037ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1037reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1037reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1037: resize level
internal fun PlayerActivity.showV1037ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1037resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1037resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1037: resolve level
internal fun PlayerActivity.showV1037ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1037resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1037resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1037: resource level
internal fun PlayerActivity.showV1037ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1037resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1037resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1037: response mode
internal fun PlayerActivity.showV1037ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1037response
    FeaturePrefsStore.batch1031.v1037response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1037: restart mode
internal fun PlayerActivity.showV1037RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1037restart
    FeaturePrefsStore.batch1031.v1037restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1037: restore mode
internal fun PlayerActivity.showV1037RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1037restore
    FeaturePrefsStore.batch1031.v1037restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1037: result mode
internal fun PlayerActivity.showV1037ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1037result
    FeaturePrefsStore.batch1031.v1037result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1037: retry mode
internal fun PlayerActivity.showV1037RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1037retry
    FeaturePrefsStore.batch1031.v1037retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1038: render mode
internal fun PlayerActivity.showV1038RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1038render
    FeaturePrefsStore.batch1031.v1038render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1038: repeat mode
internal fun PlayerActivity.showV1038RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1038repeat
    FeaturePrefsStore.batch1031.v1038repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1038: replace mode
internal fun PlayerActivity.showV1038ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1038replace
    FeaturePrefsStore.batch1031.v1038replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1038: report mode
internal fun PlayerActivity.showV1038ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1038report
    FeaturePrefsStore.batch1031.v1038report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1038: request mode
internal fun PlayerActivity.showV1038RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1038request
    FeaturePrefsStore.batch1031.v1038request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1038: require level
internal fun PlayerActivity.showV1038RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1038require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1038require = value
        AppToast.show(this, "require: $value")
    }
}

// v1038: reset level
internal fun PlayerActivity.showV1038ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1038reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1038reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1038: resize level
internal fun PlayerActivity.showV1038ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1038resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1038resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1038: resolve level
internal fun PlayerActivity.showV1038ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1038resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1038resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1038: resource level
internal fun PlayerActivity.showV1038ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1038resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1038resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1038: response mode
internal fun PlayerActivity.showV1038ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1038response
    FeaturePrefsStore.batch1031.v1038response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1038: restart mode
internal fun PlayerActivity.showV1038RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1038restart
    FeaturePrefsStore.batch1031.v1038restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1038: restore mode
internal fun PlayerActivity.showV1038RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1038restore
    FeaturePrefsStore.batch1031.v1038restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1038: result mode
internal fun PlayerActivity.showV1038ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1038result
    FeaturePrefsStore.batch1031.v1038result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1038: retry mode
internal fun PlayerActivity.showV1038RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1038retry
    FeaturePrefsStore.batch1031.v1038retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1039: render mode
internal fun PlayerActivity.showV1039RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1039render
    FeaturePrefsStore.batch1031.v1039render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1039: repeat mode
internal fun PlayerActivity.showV1039RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1039repeat
    FeaturePrefsStore.batch1031.v1039repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1039: replace mode
internal fun PlayerActivity.showV1039ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1039replace
    FeaturePrefsStore.batch1031.v1039replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1039: report mode
internal fun PlayerActivity.showV1039ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1039report
    FeaturePrefsStore.batch1031.v1039report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1039: request mode
internal fun PlayerActivity.showV1039RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1039request
    FeaturePrefsStore.batch1031.v1039request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1039: require level
internal fun PlayerActivity.showV1039RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1039require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1039require = value
        AppToast.show(this, "require: $value")
    }
}

// v1039: reset level
internal fun PlayerActivity.showV1039ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1039reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1039reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1039: resize level
internal fun PlayerActivity.showV1039ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1039resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1039resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1039: resolve level
internal fun PlayerActivity.showV1039ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1039resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1039resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1039: resource level
internal fun PlayerActivity.showV1039ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1039resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1039resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1039: response mode
internal fun PlayerActivity.showV1039ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1039response
    FeaturePrefsStore.batch1031.v1039response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1039: restart mode
internal fun PlayerActivity.showV1039RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1039restart
    FeaturePrefsStore.batch1031.v1039restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1039: restore mode
internal fun PlayerActivity.showV1039RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1039restore
    FeaturePrefsStore.batch1031.v1039restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1039: result mode
internal fun PlayerActivity.showV1039ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1039result
    FeaturePrefsStore.batch1031.v1039result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1039: retry mode
internal fun PlayerActivity.showV1039RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1039retry
    FeaturePrefsStore.batch1031.v1039retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1040: render mode
internal fun PlayerActivity.showV1040RenderToggle() {
    val current = FeaturePrefsStore.batch1031.v1040render
    FeaturePrefsStore.batch1031.v1040render = !current
    AppToast.show(this, "render: ${if (!current) "ON" else "OFF"}")
}

// v1040: repeat mode
internal fun PlayerActivity.showV1040RepeatToggle() {
    val current = FeaturePrefsStore.batch1031.v1040repeat
    FeaturePrefsStore.batch1031.v1040repeat = !current
    AppToast.show(this, "repeat: ${if (!current) "ON" else "OFF"}")
}

// v1040: replace mode
internal fun PlayerActivity.showV1040ReplaceToggle() {
    val current = FeaturePrefsStore.batch1031.v1040replace
    FeaturePrefsStore.batch1031.v1040replace = !current
    AppToast.show(this, "replace: ${if (!current) "ON" else "OFF"}")
}

// v1040: report mode
internal fun PlayerActivity.showV1040ReportToggle() {
    val current = FeaturePrefsStore.batch1031.v1040report
    FeaturePrefsStore.batch1031.v1040report = !current
    AppToast.show(this, "report: ${if (!current) "ON" else "OFF"}")
}

// v1040: request mode
internal fun PlayerActivity.showV1040RequestToggle() {
    val current = FeaturePrefsStore.batch1031.v1040request
    FeaturePrefsStore.batch1031.v1040request = !current
    AppToast.show(this, "request: ${if (!current) "ON" else "OFF"}")
}

// v1040: require level
internal fun PlayerActivity.showV1040RequireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1040require).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "require level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1040require = value
        AppToast.show(this, "require: $value")
    }
}

// v1040: reset level
internal fun PlayerActivity.showV1040ResetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1040reset).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "reset level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1040reset = value
        AppToast.show(this, "reset: $value")
    }
}

// v1040: resize level
internal fun PlayerActivity.showV1040ResizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1040resize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resize level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1040resize = value
        AppToast.show(this, "resize: $value")
    }
}

// v1040: resolve level
internal fun PlayerActivity.showV1040ResolveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1040resolve).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resolve level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1040resolve = value
        AppToast.show(this, "resolve: $value")
    }
}

// v1040: resource level
internal fun PlayerActivity.showV1040ResourceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1031.v1040resource).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "resource level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1031.v1040resource = value
        AppToast.show(this, "resource: $value")
    }
}

// v1040: response mode
internal fun PlayerActivity.showV1040ResponseToggle() {
    val current = FeaturePrefsStore.batch1031.v1040response
    FeaturePrefsStore.batch1031.v1040response = !current
    AppToast.show(this, "response: ${if (!current) "ON" else "OFF"}")
}

// v1040: restart mode
internal fun PlayerActivity.showV1040RestartToggle() {
    val current = FeaturePrefsStore.batch1031.v1040restart
    FeaturePrefsStore.batch1031.v1040restart = !current
    AppToast.show(this, "restart: ${if (!current) "ON" else "OFF"}")
}

// v1040: restore mode
internal fun PlayerActivity.showV1040RestoreToggle() {
    val current = FeaturePrefsStore.batch1031.v1040restore
    FeaturePrefsStore.batch1031.v1040restore = !current
    AppToast.show(this, "restore: ${if (!current) "ON" else "OFF"}")
}

// v1040: result mode
internal fun PlayerActivity.showV1040ResultToggle() {
    val current = FeaturePrefsStore.batch1031.v1040result
    FeaturePrefsStore.batch1031.v1040result = !current
    AppToast.show(this, "result: ${if (!current) "ON" else "OFF"}")
}

// v1040: retry mode
internal fun PlayerActivity.showV1040RetryToggle() {
    val current = FeaturePrefsStore.batch1031.v1040retry
    FeaturePrefsStore.batch1031.v1040retry = !current
    AppToast.show(this, "retry: ${if (!current) "ON" else "OFF"}")
}

// v1041: return mode
internal fun PlayerActivity.showV1041ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1041return
    FeaturePrefsStore.batch1041.v1041return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1041: reverse mode
internal fun PlayerActivity.showV1041ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1041reverse
    FeaturePrefsStore.batch1041.v1041reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1041: revert mode
internal fun PlayerActivity.showV1041RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1041revert
    FeaturePrefsStore.batch1041.v1041revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1041: right mode
internal fun PlayerActivity.showV1041RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1041right
    FeaturePrefsStore.batch1041.v1041right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1041: role mode
internal fun PlayerActivity.showV1041RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1041role
    FeaturePrefsStore.batch1041.v1041role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1041: root level
internal fun PlayerActivity.showV1041RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041root = value
        AppToast.show(this, "root: $value")
    }
}

// v1041: rotate level
internal fun PlayerActivity.showV1041RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1041: round level
internal fun PlayerActivity.showV1041RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041round = value
        AppToast.show(this, "round: $value")
    }
}

// v1041: route level
internal fun PlayerActivity.showV1041RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041route = value
        AppToast.show(this, "route: $value")
    }
}

// v1041: row level
internal fun PlayerActivity.showV1041RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041row = value
        AppToast.show(this, "row: $value")
    }
}

// v1041: rule mode
internal fun PlayerActivity.showV1041RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1041rule
    FeaturePrefsStore.batch1041.v1041rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1041: run mode
internal fun PlayerActivity.showV1041RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1041run
    FeaturePrefsStore.batch1041.v1041run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1041: runtime mode
internal fun PlayerActivity.showV1041RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1041runtime
    FeaturePrefsStore.batch1041.v1041runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1041: safe mode
internal fun PlayerActivity.showV1041SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1041safe
    FeaturePrefsStore.batch1041.v1041safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1041: sample mode
internal fun PlayerActivity.showV1041SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1041sample
    FeaturePrefsStore.batch1041.v1041sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1042: return mode
internal fun PlayerActivity.showV1042ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1042return
    FeaturePrefsStore.batch1041.v1042return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1042: reverse mode
internal fun PlayerActivity.showV1042ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1042reverse
    FeaturePrefsStore.batch1041.v1042reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1042: revert mode
internal fun PlayerActivity.showV1042RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1042revert
    FeaturePrefsStore.batch1041.v1042revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1042: right mode
internal fun PlayerActivity.showV1042RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1042right
    FeaturePrefsStore.batch1041.v1042right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1042: role mode
internal fun PlayerActivity.showV1042RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1042role
    FeaturePrefsStore.batch1041.v1042role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1042: root level
internal fun PlayerActivity.showV1042RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042root = value
        AppToast.show(this, "root: $value")
    }
}

// v1042: rotate level
internal fun PlayerActivity.showV1042RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1042: round level
internal fun PlayerActivity.showV1042RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042round = value
        AppToast.show(this, "round: $value")
    }
}

// v1042: route level
internal fun PlayerActivity.showV1042RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042route = value
        AppToast.show(this, "route: $value")
    }
}

// v1042: row level
internal fun PlayerActivity.showV1042RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042row = value
        AppToast.show(this, "row: $value")
    }
}

// v1042: rule mode
internal fun PlayerActivity.showV1042RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1042rule
    FeaturePrefsStore.batch1041.v1042rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1042: run mode
internal fun PlayerActivity.showV1042RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1042run
    FeaturePrefsStore.batch1041.v1042run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1042: runtime mode
internal fun PlayerActivity.showV1042RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1042runtime
    FeaturePrefsStore.batch1041.v1042runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1042: safe mode
internal fun PlayerActivity.showV1042SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1042safe
    FeaturePrefsStore.batch1041.v1042safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1042: sample mode
internal fun PlayerActivity.showV1042SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1042sample
    FeaturePrefsStore.batch1041.v1042sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1043: return mode
internal fun PlayerActivity.showV1043ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1043return
    FeaturePrefsStore.batch1041.v1043return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1043: reverse mode
internal fun PlayerActivity.showV1043ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1043reverse
    FeaturePrefsStore.batch1041.v1043reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1043: revert mode
internal fun PlayerActivity.showV1043RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1043revert
    FeaturePrefsStore.batch1041.v1043revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1043: right mode
internal fun PlayerActivity.showV1043RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1043right
    FeaturePrefsStore.batch1041.v1043right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1043: role mode
internal fun PlayerActivity.showV1043RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1043role
    FeaturePrefsStore.batch1041.v1043role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1043: root level
internal fun PlayerActivity.showV1043RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043root = value
        AppToast.show(this, "root: $value")
    }
}

// v1043: rotate level
internal fun PlayerActivity.showV1043RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1043: round level
internal fun PlayerActivity.showV1043RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043round = value
        AppToast.show(this, "round: $value")
    }
}

// v1043: route level
internal fun PlayerActivity.showV1043RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043route = value
        AppToast.show(this, "route: $value")
    }
}

// v1043: row level
internal fun PlayerActivity.showV1043RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043row = value
        AppToast.show(this, "row: $value")
    }
}

// v1043: rule mode
internal fun PlayerActivity.showV1043RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1043rule
    FeaturePrefsStore.batch1041.v1043rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1043: run mode
internal fun PlayerActivity.showV1043RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1043run
    FeaturePrefsStore.batch1041.v1043run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1043: runtime mode
internal fun PlayerActivity.showV1043RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1043runtime
    FeaturePrefsStore.batch1041.v1043runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1043: safe mode
internal fun PlayerActivity.showV1043SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1043safe
    FeaturePrefsStore.batch1041.v1043safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1043: sample mode
internal fun PlayerActivity.showV1043SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1043sample
    FeaturePrefsStore.batch1041.v1043sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1044: return mode
internal fun PlayerActivity.showV1044ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1044return
    FeaturePrefsStore.batch1041.v1044return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1044: reverse mode
internal fun PlayerActivity.showV1044ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1044reverse
    FeaturePrefsStore.batch1041.v1044reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1044: revert mode
internal fun PlayerActivity.showV1044RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1044revert
    FeaturePrefsStore.batch1041.v1044revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1044: right mode
internal fun PlayerActivity.showV1044RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1044right
    FeaturePrefsStore.batch1041.v1044right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1044: role mode
internal fun PlayerActivity.showV1044RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1044role
    FeaturePrefsStore.batch1041.v1044role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1044: root level
internal fun PlayerActivity.showV1044RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044root = value
        AppToast.show(this, "root: $value")
    }
}

// v1044: rotate level
internal fun PlayerActivity.showV1044RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1044: round level
internal fun PlayerActivity.showV1044RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044round = value
        AppToast.show(this, "round: $value")
    }
}

// v1044: route level
internal fun PlayerActivity.showV1044RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044route = value
        AppToast.show(this, "route: $value")
    }
}

// v1044: row level
internal fun PlayerActivity.showV1044RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044row = value
        AppToast.show(this, "row: $value")
    }
}

// v1044: rule mode
internal fun PlayerActivity.showV1044RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1044rule
    FeaturePrefsStore.batch1041.v1044rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1044: run mode
internal fun PlayerActivity.showV1044RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1044run
    FeaturePrefsStore.batch1041.v1044run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1044: runtime mode
internal fun PlayerActivity.showV1044RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1044runtime
    FeaturePrefsStore.batch1041.v1044runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1044: safe mode
internal fun PlayerActivity.showV1044SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1044safe
    FeaturePrefsStore.batch1041.v1044safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1044: sample mode
internal fun PlayerActivity.showV1044SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1044sample
    FeaturePrefsStore.batch1041.v1044sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1045: return mode
internal fun PlayerActivity.showV1045ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1045return
    FeaturePrefsStore.batch1041.v1045return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1045: reverse mode
internal fun PlayerActivity.showV1045ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1045reverse
    FeaturePrefsStore.batch1041.v1045reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1045: revert mode
internal fun PlayerActivity.showV1045RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1045revert
    FeaturePrefsStore.batch1041.v1045revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1045: right mode
internal fun PlayerActivity.showV1045RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1045right
    FeaturePrefsStore.batch1041.v1045right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1045: role mode
internal fun PlayerActivity.showV1045RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1045role
    FeaturePrefsStore.batch1041.v1045role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1045: root level
internal fun PlayerActivity.showV1045RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045root = value
        AppToast.show(this, "root: $value")
    }
}

// v1045: rotate level
internal fun PlayerActivity.showV1045RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1045: round level
internal fun PlayerActivity.showV1045RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045round = value
        AppToast.show(this, "round: $value")
    }
}

// v1045: route level
internal fun PlayerActivity.showV1045RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045route = value
        AppToast.show(this, "route: $value")
    }
}

// v1045: row level
internal fun PlayerActivity.showV1045RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045row = value
        AppToast.show(this, "row: $value")
    }
}

// v1045: rule mode
internal fun PlayerActivity.showV1045RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1045rule
    FeaturePrefsStore.batch1041.v1045rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1045: run mode
internal fun PlayerActivity.showV1045RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1045run
    FeaturePrefsStore.batch1041.v1045run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1045: runtime mode
internal fun PlayerActivity.showV1045RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1045runtime
    FeaturePrefsStore.batch1041.v1045runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1045: safe mode
internal fun PlayerActivity.showV1045SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1045safe
    FeaturePrefsStore.batch1041.v1045safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1045: sample mode
internal fun PlayerActivity.showV1045SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1045sample
    FeaturePrefsStore.batch1041.v1045sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1046: return mode
internal fun PlayerActivity.showV1046ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1046return
    FeaturePrefsStore.batch1041.v1046return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1046: reverse mode
internal fun PlayerActivity.showV1046ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1046reverse
    FeaturePrefsStore.batch1041.v1046reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1046: revert mode
internal fun PlayerActivity.showV1046RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1046revert
    FeaturePrefsStore.batch1041.v1046revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1046: right mode
internal fun PlayerActivity.showV1046RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1046right
    FeaturePrefsStore.batch1041.v1046right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1046: role mode
internal fun PlayerActivity.showV1046RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1046role
    FeaturePrefsStore.batch1041.v1046role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1046: root level
internal fun PlayerActivity.showV1046RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046root = value
        AppToast.show(this, "root: $value")
    }
}

// v1046: rotate level
internal fun PlayerActivity.showV1046RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1046: round level
internal fun PlayerActivity.showV1046RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046round = value
        AppToast.show(this, "round: $value")
    }
}

// v1046: route level
internal fun PlayerActivity.showV1046RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046route = value
        AppToast.show(this, "route: $value")
    }
}

// v1046: row level
internal fun PlayerActivity.showV1046RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046row = value
        AppToast.show(this, "row: $value")
    }
}

// v1046: rule mode
internal fun PlayerActivity.showV1046RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1046rule
    FeaturePrefsStore.batch1041.v1046rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1046: run mode
internal fun PlayerActivity.showV1046RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1046run
    FeaturePrefsStore.batch1041.v1046run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1046: runtime mode
internal fun PlayerActivity.showV1046RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1046runtime
    FeaturePrefsStore.batch1041.v1046runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1046: safe mode
internal fun PlayerActivity.showV1046SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1046safe
    FeaturePrefsStore.batch1041.v1046safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1046: sample mode
internal fun PlayerActivity.showV1046SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1046sample
    FeaturePrefsStore.batch1041.v1046sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1047: return mode
internal fun PlayerActivity.showV1047ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1047return
    FeaturePrefsStore.batch1041.v1047return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1047: reverse mode
internal fun PlayerActivity.showV1047ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1047reverse
    FeaturePrefsStore.batch1041.v1047reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1047: revert mode
internal fun PlayerActivity.showV1047RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1047revert
    FeaturePrefsStore.batch1041.v1047revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1047: right mode
internal fun PlayerActivity.showV1047RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1047right
    FeaturePrefsStore.batch1041.v1047right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1047: role mode
internal fun PlayerActivity.showV1047RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1047role
    FeaturePrefsStore.batch1041.v1047role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1047: root level
internal fun PlayerActivity.showV1047RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047root = value
        AppToast.show(this, "root: $value")
    }
}

// v1047: rotate level
internal fun PlayerActivity.showV1047RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1047: round level
internal fun PlayerActivity.showV1047RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047round = value
        AppToast.show(this, "round: $value")
    }
}

// v1047: route level
internal fun PlayerActivity.showV1047RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047route = value
        AppToast.show(this, "route: $value")
    }
}

// v1047: row level
internal fun PlayerActivity.showV1047RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047row = value
        AppToast.show(this, "row: $value")
    }
}

// v1047: rule mode
internal fun PlayerActivity.showV1047RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1047rule
    FeaturePrefsStore.batch1041.v1047rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1047: run mode
internal fun PlayerActivity.showV1047RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1047run
    FeaturePrefsStore.batch1041.v1047run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1047: runtime mode
internal fun PlayerActivity.showV1047RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1047runtime
    FeaturePrefsStore.batch1041.v1047runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1047: safe mode
internal fun PlayerActivity.showV1047SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1047safe
    FeaturePrefsStore.batch1041.v1047safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1047: sample mode
internal fun PlayerActivity.showV1047SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1047sample
    FeaturePrefsStore.batch1041.v1047sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1048: return mode
internal fun PlayerActivity.showV1048ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1048return
    FeaturePrefsStore.batch1041.v1048return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1048: reverse mode
internal fun PlayerActivity.showV1048ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1048reverse
    FeaturePrefsStore.batch1041.v1048reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1048: revert mode
internal fun PlayerActivity.showV1048RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1048revert
    FeaturePrefsStore.batch1041.v1048revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1048: right mode
internal fun PlayerActivity.showV1048RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1048right
    FeaturePrefsStore.batch1041.v1048right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1048: role mode
internal fun PlayerActivity.showV1048RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1048role
    FeaturePrefsStore.batch1041.v1048role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1048: root level
internal fun PlayerActivity.showV1048RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048root = value
        AppToast.show(this, "root: $value")
    }
}

// v1048: rotate level
internal fun PlayerActivity.showV1048RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1048: round level
internal fun PlayerActivity.showV1048RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048round = value
        AppToast.show(this, "round: $value")
    }
}

// v1048: route level
internal fun PlayerActivity.showV1048RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048route = value
        AppToast.show(this, "route: $value")
    }
}

// v1048: row level
internal fun PlayerActivity.showV1048RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048row = value
        AppToast.show(this, "row: $value")
    }
}

// v1048: rule mode
internal fun PlayerActivity.showV1048RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1048rule
    FeaturePrefsStore.batch1041.v1048rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1048: run mode
internal fun PlayerActivity.showV1048RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1048run
    FeaturePrefsStore.batch1041.v1048run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1048: runtime mode
internal fun PlayerActivity.showV1048RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1048runtime
    FeaturePrefsStore.batch1041.v1048runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1048: safe mode
internal fun PlayerActivity.showV1048SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1048safe
    FeaturePrefsStore.batch1041.v1048safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1048: sample mode
internal fun PlayerActivity.showV1048SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1048sample
    FeaturePrefsStore.batch1041.v1048sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1049: return mode
internal fun PlayerActivity.showV1049ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1049return
    FeaturePrefsStore.batch1041.v1049return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1049: reverse mode
internal fun PlayerActivity.showV1049ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1049reverse
    FeaturePrefsStore.batch1041.v1049reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1049: revert mode
internal fun PlayerActivity.showV1049RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1049revert
    FeaturePrefsStore.batch1041.v1049revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1049: right mode
internal fun PlayerActivity.showV1049RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1049right
    FeaturePrefsStore.batch1041.v1049right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1049: role mode
internal fun PlayerActivity.showV1049RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1049role
    FeaturePrefsStore.batch1041.v1049role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1049: root level
internal fun PlayerActivity.showV1049RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049root = value
        AppToast.show(this, "root: $value")
    }
}

// v1049: rotate level
internal fun PlayerActivity.showV1049RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1049: round level
internal fun PlayerActivity.showV1049RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049round = value
        AppToast.show(this, "round: $value")
    }
}

// v1049: route level
internal fun PlayerActivity.showV1049RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049route = value
        AppToast.show(this, "route: $value")
    }
}

// v1049: row level
internal fun PlayerActivity.showV1049RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049row = value
        AppToast.show(this, "row: $value")
    }
}

// v1049: rule mode
internal fun PlayerActivity.showV1049RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1049rule
    FeaturePrefsStore.batch1041.v1049rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1049: run mode
internal fun PlayerActivity.showV1049RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1049run
    FeaturePrefsStore.batch1041.v1049run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1049: runtime mode
internal fun PlayerActivity.showV1049RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1049runtime
    FeaturePrefsStore.batch1041.v1049runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1049: safe mode
internal fun PlayerActivity.showV1049SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1049safe
    FeaturePrefsStore.batch1041.v1049safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1049: sample mode
internal fun PlayerActivity.showV1049SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1049sample
    FeaturePrefsStore.batch1041.v1049sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1050: return mode
internal fun PlayerActivity.showV1050ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1050return
    FeaturePrefsStore.batch1041.v1050return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1050: reverse mode
internal fun PlayerActivity.showV1050ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1050reverse
    FeaturePrefsStore.batch1041.v1050reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1050: revert mode
internal fun PlayerActivity.showV1050RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1050revert
    FeaturePrefsStore.batch1041.v1050revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1050: right mode
internal fun PlayerActivity.showV1050RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1050right
    FeaturePrefsStore.batch1041.v1050right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1050: role mode
internal fun PlayerActivity.showV1050RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1050role
    FeaturePrefsStore.batch1041.v1050role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1050: root level
internal fun PlayerActivity.showV1050RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050root = value
        AppToast.show(this, "root: $value")
    }
}

// v1050: rotate level
internal fun PlayerActivity.showV1050RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1050: round level
internal fun PlayerActivity.showV1050RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050round = value
        AppToast.show(this, "round: $value")
    }
}

// v1050: route level
internal fun PlayerActivity.showV1050RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050route = value
        AppToast.show(this, "route: $value")
    }
}

// v1050: row level
internal fun PlayerActivity.showV1050RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050row = value
        AppToast.show(this, "row: $value")
    }
}

// v1050: rule mode
internal fun PlayerActivity.showV1050RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1050rule
    FeaturePrefsStore.batch1041.v1050rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1050: run mode
internal fun PlayerActivity.showV1050RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1050run
    FeaturePrefsStore.batch1041.v1050run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1050: runtime mode
internal fun PlayerActivity.showV1050RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1050runtime
    FeaturePrefsStore.batch1041.v1050runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1050: safe mode
internal fun PlayerActivity.showV1050SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1050safe
    FeaturePrefsStore.batch1041.v1050safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1050: sample mode
internal fun PlayerActivity.showV1050SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1050sample
    FeaturePrefsStore.batch1041.v1050sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1051: save mode
internal fun PlayerActivity.showV1051SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1051save
    FeaturePrefsStore.batch1051.v1051save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1051: scale mode
internal fun PlayerActivity.showV1051ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scale
    FeaturePrefsStore.batch1051.v1051scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1051: scan mode
internal fun PlayerActivity.showV1051ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scan
    FeaturePrefsStore.batch1051.v1051scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1051: scene mode
internal fun PlayerActivity.showV1051SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scene
    FeaturePrefsStore.batch1051.v1051scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1051: scheme mode
internal fun PlayerActivity.showV1051SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scheme
    FeaturePrefsStore.batch1051.v1051scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1051: scope level
internal fun PlayerActivity.showV1051ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1051: score level
internal fun PlayerActivity.showV1051ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051score = value
        AppToast.show(this, "score: $value")
    }
}

// v1051: screen level
internal fun PlayerActivity.showV1051ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1051: scroll level
internal fun PlayerActivity.showV1051ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1051: search level
internal fun PlayerActivity.showV1051SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051search = value
        AppToast.show(this, "search: $value")
    }
}

// v1051: section mode
internal fun PlayerActivity.showV1051SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1051section
    FeaturePrefsStore.batch1051.v1051section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1051: secure mode
internal fun PlayerActivity.showV1051SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1051secure
    FeaturePrefsStore.batch1051.v1051secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1051: seek mode
internal fun PlayerActivity.showV1051SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1051seek
    FeaturePrefsStore.batch1051.v1051seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1051: segment mode
internal fun PlayerActivity.showV1051SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1051segment
    FeaturePrefsStore.batch1051.v1051segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1051: select mode
internal fun PlayerActivity.showV1051SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1051select
    FeaturePrefsStore.batch1051.v1051select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1052: save mode
internal fun PlayerActivity.showV1052SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1052save
    FeaturePrefsStore.batch1051.v1052save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1052: scale mode
internal fun PlayerActivity.showV1052ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scale
    FeaturePrefsStore.batch1051.v1052scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1052: scan mode
internal fun PlayerActivity.showV1052ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scan
    FeaturePrefsStore.batch1051.v1052scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1052: scene mode
internal fun PlayerActivity.showV1052SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scene
    FeaturePrefsStore.batch1051.v1052scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1052: scheme mode
internal fun PlayerActivity.showV1052SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scheme
    FeaturePrefsStore.batch1051.v1052scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1052: scope level
internal fun PlayerActivity.showV1052ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1052: score level
internal fun PlayerActivity.showV1052ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052score = value
        AppToast.show(this, "score: $value")
    }
}

// v1052: screen level
internal fun PlayerActivity.showV1052ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1052: scroll level
internal fun PlayerActivity.showV1052ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1052: search level
internal fun PlayerActivity.showV1052SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052search = value
        AppToast.show(this, "search: $value")
    }
}

// v1052: section mode
internal fun PlayerActivity.showV1052SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1052section
    FeaturePrefsStore.batch1051.v1052section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1052: secure mode
internal fun PlayerActivity.showV1052SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1052secure
    FeaturePrefsStore.batch1051.v1052secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1052: seek mode
internal fun PlayerActivity.showV1052SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1052seek
    FeaturePrefsStore.batch1051.v1052seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1052: segment mode
internal fun PlayerActivity.showV1052SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1052segment
    FeaturePrefsStore.batch1051.v1052segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1052: select mode
internal fun PlayerActivity.showV1052SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1052select
    FeaturePrefsStore.batch1051.v1052select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1053: save mode
internal fun PlayerActivity.showV1053SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1053save
    FeaturePrefsStore.batch1051.v1053save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1053: scale mode
internal fun PlayerActivity.showV1053ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scale
    FeaturePrefsStore.batch1051.v1053scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1053: scan mode
internal fun PlayerActivity.showV1053ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scan
    FeaturePrefsStore.batch1051.v1053scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1053: scene mode
internal fun PlayerActivity.showV1053SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scene
    FeaturePrefsStore.batch1051.v1053scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1053: scheme mode
internal fun PlayerActivity.showV1053SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scheme
    FeaturePrefsStore.batch1051.v1053scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1053: scope level
internal fun PlayerActivity.showV1053ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1053: score level
internal fun PlayerActivity.showV1053ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053score = value
        AppToast.show(this, "score: $value")
    }
}

// v1053: screen level
internal fun PlayerActivity.showV1053ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1053: scroll level
internal fun PlayerActivity.showV1053ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1053: search level
internal fun PlayerActivity.showV1053SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053search = value
        AppToast.show(this, "search: $value")
    }
}

// v1053: section mode
internal fun PlayerActivity.showV1053SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1053section
    FeaturePrefsStore.batch1051.v1053section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1053: secure mode
internal fun PlayerActivity.showV1053SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1053secure
    FeaturePrefsStore.batch1051.v1053secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1053: seek mode
internal fun PlayerActivity.showV1053SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1053seek
    FeaturePrefsStore.batch1051.v1053seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1053: segment mode
internal fun PlayerActivity.showV1053SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1053segment
    FeaturePrefsStore.batch1051.v1053segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1053: select mode
internal fun PlayerActivity.showV1053SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1053select
    FeaturePrefsStore.batch1051.v1053select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1054: save mode
internal fun PlayerActivity.showV1054SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1054save
    FeaturePrefsStore.batch1051.v1054save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1054: scale mode
internal fun PlayerActivity.showV1054ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scale
    FeaturePrefsStore.batch1051.v1054scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1054: scan mode
internal fun PlayerActivity.showV1054ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scan
    FeaturePrefsStore.batch1051.v1054scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1054: scene mode
internal fun PlayerActivity.showV1054SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scene
    FeaturePrefsStore.batch1051.v1054scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1054: scheme mode
internal fun PlayerActivity.showV1054SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scheme
    FeaturePrefsStore.batch1051.v1054scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1054: scope level
internal fun PlayerActivity.showV1054ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1054: score level
internal fun PlayerActivity.showV1054ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054score = value
        AppToast.show(this, "score: $value")
    }
}

// v1054: screen level
internal fun PlayerActivity.showV1054ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1054: scroll level
internal fun PlayerActivity.showV1054ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1054: search level
internal fun PlayerActivity.showV1054SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054search = value
        AppToast.show(this, "search: $value")
    }
}

// v1054: section mode
internal fun PlayerActivity.showV1054SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1054section
    FeaturePrefsStore.batch1051.v1054section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1054: secure mode
internal fun PlayerActivity.showV1054SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1054secure
    FeaturePrefsStore.batch1051.v1054secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1054: seek mode
internal fun PlayerActivity.showV1054SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1054seek
    FeaturePrefsStore.batch1051.v1054seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1054: segment mode
internal fun PlayerActivity.showV1054SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1054segment
    FeaturePrefsStore.batch1051.v1054segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1054: select mode
internal fun PlayerActivity.showV1054SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1054select
    FeaturePrefsStore.batch1051.v1054select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1055: save mode
internal fun PlayerActivity.showV1055SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1055save
    FeaturePrefsStore.batch1051.v1055save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1055: scale mode
internal fun PlayerActivity.showV1055ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scale
    FeaturePrefsStore.batch1051.v1055scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1055: scan mode
internal fun PlayerActivity.showV1055ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scan
    FeaturePrefsStore.batch1051.v1055scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1055: scene mode
internal fun PlayerActivity.showV1055SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scene
    FeaturePrefsStore.batch1051.v1055scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1055: scheme mode
internal fun PlayerActivity.showV1055SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scheme
    FeaturePrefsStore.batch1051.v1055scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1055: scope level
internal fun PlayerActivity.showV1055ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1055: score level
internal fun PlayerActivity.showV1055ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055score = value
        AppToast.show(this, "score: $value")
    }
}

// v1055: screen level
internal fun PlayerActivity.showV1055ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1055: scroll level
internal fun PlayerActivity.showV1055ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1055: search level
internal fun PlayerActivity.showV1055SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055search = value
        AppToast.show(this, "search: $value")
    }
}

// v1055: section mode
internal fun PlayerActivity.showV1055SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1055section
    FeaturePrefsStore.batch1051.v1055section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1055: secure mode
internal fun PlayerActivity.showV1055SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1055secure
    FeaturePrefsStore.batch1051.v1055secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1055: seek mode
internal fun PlayerActivity.showV1055SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1055seek
    FeaturePrefsStore.batch1051.v1055seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1055: segment mode
internal fun PlayerActivity.showV1055SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1055segment
    FeaturePrefsStore.batch1051.v1055segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1055: select mode
internal fun PlayerActivity.showV1055SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1055select
    FeaturePrefsStore.batch1051.v1055select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1056: save mode
internal fun PlayerActivity.showV1056SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1056save
    FeaturePrefsStore.batch1051.v1056save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1056: scale mode
internal fun PlayerActivity.showV1056ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scale
    FeaturePrefsStore.batch1051.v1056scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1056: scan mode
internal fun PlayerActivity.showV1056ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scan
    FeaturePrefsStore.batch1051.v1056scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1056: scene mode
internal fun PlayerActivity.showV1056SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scene
    FeaturePrefsStore.batch1051.v1056scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1056: scheme mode
internal fun PlayerActivity.showV1056SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scheme
    FeaturePrefsStore.batch1051.v1056scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1056: scope level
internal fun PlayerActivity.showV1056ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1056: score level
internal fun PlayerActivity.showV1056ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056score = value
        AppToast.show(this, "score: $value")
    }
}

// v1056: screen level
internal fun PlayerActivity.showV1056ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1056: scroll level
internal fun PlayerActivity.showV1056ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1056: search level
internal fun PlayerActivity.showV1056SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056search = value
        AppToast.show(this, "search: $value")
    }
}

// v1056: section mode
internal fun PlayerActivity.showV1056SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1056section
    FeaturePrefsStore.batch1051.v1056section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1056: secure mode
internal fun PlayerActivity.showV1056SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1056secure
    FeaturePrefsStore.batch1051.v1056secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1056: seek mode
internal fun PlayerActivity.showV1056SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1056seek
    FeaturePrefsStore.batch1051.v1056seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1056: segment mode
internal fun PlayerActivity.showV1056SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1056segment
    FeaturePrefsStore.batch1051.v1056segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1056: select mode
internal fun PlayerActivity.showV1056SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1056select
    FeaturePrefsStore.batch1051.v1056select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1057: save mode
internal fun PlayerActivity.showV1057SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1057save
    FeaturePrefsStore.batch1051.v1057save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1057: scale mode
internal fun PlayerActivity.showV1057ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scale
    FeaturePrefsStore.batch1051.v1057scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1057: scan mode
internal fun PlayerActivity.showV1057ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scan
    FeaturePrefsStore.batch1051.v1057scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1057: scene mode
internal fun PlayerActivity.showV1057SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scene
    FeaturePrefsStore.batch1051.v1057scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1057: scheme mode
internal fun PlayerActivity.showV1057SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scheme
    FeaturePrefsStore.batch1051.v1057scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1057: scope level
internal fun PlayerActivity.showV1057ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1057: score level
internal fun PlayerActivity.showV1057ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057score = value
        AppToast.show(this, "score: $value")
    }
}

// v1057: screen level
internal fun PlayerActivity.showV1057ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1057: scroll level
internal fun PlayerActivity.showV1057ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1057: search level
internal fun PlayerActivity.showV1057SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057search = value
        AppToast.show(this, "search: $value")
    }
}

// v1057: section mode
internal fun PlayerActivity.showV1057SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1057section
    FeaturePrefsStore.batch1051.v1057section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1057: secure mode
internal fun PlayerActivity.showV1057SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1057secure
    FeaturePrefsStore.batch1051.v1057secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1057: seek mode
internal fun PlayerActivity.showV1057SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1057seek
    FeaturePrefsStore.batch1051.v1057seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1057: segment mode
internal fun PlayerActivity.showV1057SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1057segment
    FeaturePrefsStore.batch1051.v1057segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1057: select mode
internal fun PlayerActivity.showV1057SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1057select
    FeaturePrefsStore.batch1051.v1057select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1058: save mode
internal fun PlayerActivity.showV1058SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1058save
    FeaturePrefsStore.batch1051.v1058save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1058: scale mode
internal fun PlayerActivity.showV1058ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scale
    FeaturePrefsStore.batch1051.v1058scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1058: scan mode
internal fun PlayerActivity.showV1058ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scan
    FeaturePrefsStore.batch1051.v1058scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1058: scene mode
internal fun PlayerActivity.showV1058SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scene
    FeaturePrefsStore.batch1051.v1058scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1058: scheme mode
internal fun PlayerActivity.showV1058SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scheme
    FeaturePrefsStore.batch1051.v1058scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1058: scope level
internal fun PlayerActivity.showV1058ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1058: score level
internal fun PlayerActivity.showV1058ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058score = value
        AppToast.show(this, "score: $value")
    }
}

// v1058: screen level
internal fun PlayerActivity.showV1058ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1058: scroll level
internal fun PlayerActivity.showV1058ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1058: search level
internal fun PlayerActivity.showV1058SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058search = value
        AppToast.show(this, "search: $value")
    }
}

// v1058: section mode
internal fun PlayerActivity.showV1058SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1058section
    FeaturePrefsStore.batch1051.v1058section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1058: secure mode
internal fun PlayerActivity.showV1058SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1058secure
    FeaturePrefsStore.batch1051.v1058secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1058: seek mode
internal fun PlayerActivity.showV1058SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1058seek
    FeaturePrefsStore.batch1051.v1058seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1058: segment mode
internal fun PlayerActivity.showV1058SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1058segment
    FeaturePrefsStore.batch1051.v1058segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1058: select mode
internal fun PlayerActivity.showV1058SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1058select
    FeaturePrefsStore.batch1051.v1058select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1059: save mode
internal fun PlayerActivity.showV1059SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1059save
    FeaturePrefsStore.batch1051.v1059save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1059: scale mode
internal fun PlayerActivity.showV1059ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scale
    FeaturePrefsStore.batch1051.v1059scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1059: scan mode
internal fun PlayerActivity.showV1059ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scan
    FeaturePrefsStore.batch1051.v1059scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1059: scene mode
internal fun PlayerActivity.showV1059SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scene
    FeaturePrefsStore.batch1051.v1059scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1059: scheme mode
internal fun PlayerActivity.showV1059SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scheme
    FeaturePrefsStore.batch1051.v1059scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1059: scope level
internal fun PlayerActivity.showV1059ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1059: score level
internal fun PlayerActivity.showV1059ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059score = value
        AppToast.show(this, "score: $value")
    }
}

// v1059: screen level
internal fun PlayerActivity.showV1059ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1059: scroll level
internal fun PlayerActivity.showV1059ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1059: search level
internal fun PlayerActivity.showV1059SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059search = value
        AppToast.show(this, "search: $value")
    }
}

// v1059: section mode
internal fun PlayerActivity.showV1059SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1059section
    FeaturePrefsStore.batch1051.v1059section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1059: secure mode
internal fun PlayerActivity.showV1059SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1059secure
    FeaturePrefsStore.batch1051.v1059secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1059: seek mode
internal fun PlayerActivity.showV1059SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1059seek
    FeaturePrefsStore.batch1051.v1059seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1059: segment mode
internal fun PlayerActivity.showV1059SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1059segment
    FeaturePrefsStore.batch1051.v1059segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1059: select mode
internal fun PlayerActivity.showV1059SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1059select
    FeaturePrefsStore.batch1051.v1059select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1060: save mode
internal fun PlayerActivity.showV1060SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1060save
    FeaturePrefsStore.batch1051.v1060save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1060: scale mode
internal fun PlayerActivity.showV1060ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scale
    FeaturePrefsStore.batch1051.v1060scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1060: scan mode
internal fun PlayerActivity.showV1060ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scan
    FeaturePrefsStore.batch1051.v1060scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1060: scene mode
internal fun PlayerActivity.showV1060SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scene
    FeaturePrefsStore.batch1051.v1060scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1060: scheme mode
internal fun PlayerActivity.showV1060SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scheme
    FeaturePrefsStore.batch1051.v1060scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1060: scope level
internal fun PlayerActivity.showV1060ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1060: score level
internal fun PlayerActivity.showV1060ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060score = value
        AppToast.show(this, "score: $value")
    }
}

// v1060: screen level
internal fun PlayerActivity.showV1060ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1060: scroll level
internal fun PlayerActivity.showV1060ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1060: search level
internal fun PlayerActivity.showV1060SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060search = value
        AppToast.show(this, "search: $value")
    }
}

// v1060: section mode
internal fun PlayerActivity.showV1060SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1060section
    FeaturePrefsStore.batch1051.v1060section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1060: secure mode
internal fun PlayerActivity.showV1060SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1060secure
    FeaturePrefsStore.batch1051.v1060secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1060: seek mode
internal fun PlayerActivity.showV1060SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1060seek
    FeaturePrefsStore.batch1051.v1060seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1060: segment mode
internal fun PlayerActivity.showV1060SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1060segment
    FeaturePrefsStore.batch1051.v1060segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1060: select mode
internal fun PlayerActivity.showV1060SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1060select
    FeaturePrefsStore.batch1051.v1060select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}
