package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v961: panel mode
internal fun PlayerActivity.showV961PanelToggle() {
    val current = FeaturePrefsStore.batch961.v961panel
    FeaturePrefsStore.batch961.v961panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v961: parallel mode
internal fun PlayerActivity.showV961ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v961parallel
    FeaturePrefsStore.batch961.v961parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v961: param mode
internal fun PlayerActivity.showV961ParamToggle() {
    val current = FeaturePrefsStore.batch961.v961param
    FeaturePrefsStore.batch961.v961param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v961: parent mode
internal fun PlayerActivity.showV961ParentToggle() {
    val current = FeaturePrefsStore.batch961.v961parent
    FeaturePrefsStore.batch961.v961parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v961: parse mode
internal fun PlayerActivity.showV961ParseToggle() {
    val current = FeaturePrefsStore.batch961.v961parse
    FeaturePrefsStore.batch961.v961parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v961: partial level
internal fun PlayerActivity.showV961PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v961partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v961partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v961: pass level
internal fun PlayerActivity.showV961PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v961pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v961pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v961: password level
internal fun PlayerActivity.showV961PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v961password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v961password = value
        AppToast.show(this, "password: $value")
    }
}

// v961: paste level
internal fun PlayerActivity.showV961PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v961paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v961paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v961: patch level
internal fun PlayerActivity.showV961PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v961patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v961patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v961: path mode
internal fun PlayerActivity.showV961PathToggle() {
    val current = FeaturePrefsStore.batch961.v961path
    FeaturePrefsStore.batch961.v961path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v961: pattern mode
internal fun PlayerActivity.showV961PatternToggle() {
    val current = FeaturePrefsStore.batch961.v961pattern
    FeaturePrefsStore.batch961.v961pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v961: pause mode
internal fun PlayerActivity.showV961PauseToggle() {
    val current = FeaturePrefsStore.batch961.v961pause
    FeaturePrefsStore.batch961.v961pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v961: payload mode
internal fun PlayerActivity.showV961PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v961payload
    FeaturePrefsStore.batch961.v961payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v961: peak mode
internal fun PlayerActivity.showV961PeakToggle() {
    val current = FeaturePrefsStore.batch961.v961peak
    FeaturePrefsStore.batch961.v961peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v962: panel mode
internal fun PlayerActivity.showV962PanelToggle() {
    val current = FeaturePrefsStore.batch961.v962panel
    FeaturePrefsStore.batch961.v962panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v962: parallel mode
internal fun PlayerActivity.showV962ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v962parallel
    FeaturePrefsStore.batch961.v962parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v962: param mode
internal fun PlayerActivity.showV962ParamToggle() {
    val current = FeaturePrefsStore.batch961.v962param
    FeaturePrefsStore.batch961.v962param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v962: parent mode
internal fun PlayerActivity.showV962ParentToggle() {
    val current = FeaturePrefsStore.batch961.v962parent
    FeaturePrefsStore.batch961.v962parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v962: parse mode
internal fun PlayerActivity.showV962ParseToggle() {
    val current = FeaturePrefsStore.batch961.v962parse
    FeaturePrefsStore.batch961.v962parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v962: partial level
internal fun PlayerActivity.showV962PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v962partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v962partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v962: pass level
internal fun PlayerActivity.showV962PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v962pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v962pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v962: password level
internal fun PlayerActivity.showV962PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v962password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v962password = value
        AppToast.show(this, "password: $value")
    }
}

// v962: paste level
internal fun PlayerActivity.showV962PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v962paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v962paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v962: patch level
internal fun PlayerActivity.showV962PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v962patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v962patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v962: path mode
internal fun PlayerActivity.showV962PathToggle() {
    val current = FeaturePrefsStore.batch961.v962path
    FeaturePrefsStore.batch961.v962path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v962: pattern mode
internal fun PlayerActivity.showV962PatternToggle() {
    val current = FeaturePrefsStore.batch961.v962pattern
    FeaturePrefsStore.batch961.v962pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v962: pause mode
internal fun PlayerActivity.showV962PauseToggle() {
    val current = FeaturePrefsStore.batch961.v962pause
    FeaturePrefsStore.batch961.v962pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v962: payload mode
internal fun PlayerActivity.showV962PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v962payload
    FeaturePrefsStore.batch961.v962payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v962: peak mode
internal fun PlayerActivity.showV962PeakToggle() {
    val current = FeaturePrefsStore.batch961.v962peak
    FeaturePrefsStore.batch961.v962peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v963: panel mode
internal fun PlayerActivity.showV963PanelToggle() {
    val current = FeaturePrefsStore.batch961.v963panel
    FeaturePrefsStore.batch961.v963panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v963: parallel mode
internal fun PlayerActivity.showV963ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v963parallel
    FeaturePrefsStore.batch961.v963parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v963: param mode
internal fun PlayerActivity.showV963ParamToggle() {
    val current = FeaturePrefsStore.batch961.v963param
    FeaturePrefsStore.batch961.v963param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v963: parent mode
internal fun PlayerActivity.showV963ParentToggle() {
    val current = FeaturePrefsStore.batch961.v963parent
    FeaturePrefsStore.batch961.v963parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v963: parse mode
internal fun PlayerActivity.showV963ParseToggle() {
    val current = FeaturePrefsStore.batch961.v963parse
    FeaturePrefsStore.batch961.v963parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v963: partial level
internal fun PlayerActivity.showV963PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v963partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v963partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v963: pass level
internal fun PlayerActivity.showV963PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v963pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v963pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v963: password level
internal fun PlayerActivity.showV963PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v963password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v963password = value
        AppToast.show(this, "password: $value")
    }
}

// v963: paste level
internal fun PlayerActivity.showV963PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v963paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v963paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v963: patch level
internal fun PlayerActivity.showV963PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v963patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v963patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v963: path mode
internal fun PlayerActivity.showV963PathToggle() {
    val current = FeaturePrefsStore.batch961.v963path
    FeaturePrefsStore.batch961.v963path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v963: pattern mode
internal fun PlayerActivity.showV963PatternToggle() {
    val current = FeaturePrefsStore.batch961.v963pattern
    FeaturePrefsStore.batch961.v963pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v963: pause mode
internal fun PlayerActivity.showV963PauseToggle() {
    val current = FeaturePrefsStore.batch961.v963pause
    FeaturePrefsStore.batch961.v963pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v963: payload mode
internal fun PlayerActivity.showV963PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v963payload
    FeaturePrefsStore.batch961.v963payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v963: peak mode
internal fun PlayerActivity.showV963PeakToggle() {
    val current = FeaturePrefsStore.batch961.v963peak
    FeaturePrefsStore.batch961.v963peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v964: panel mode
internal fun PlayerActivity.showV964PanelToggle() {
    val current = FeaturePrefsStore.batch961.v964panel
    FeaturePrefsStore.batch961.v964panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v964: parallel mode
internal fun PlayerActivity.showV964ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v964parallel
    FeaturePrefsStore.batch961.v964parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v964: param mode
internal fun PlayerActivity.showV964ParamToggle() {
    val current = FeaturePrefsStore.batch961.v964param
    FeaturePrefsStore.batch961.v964param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v964: parent mode
internal fun PlayerActivity.showV964ParentToggle() {
    val current = FeaturePrefsStore.batch961.v964parent
    FeaturePrefsStore.batch961.v964parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v964: parse mode
internal fun PlayerActivity.showV964ParseToggle() {
    val current = FeaturePrefsStore.batch961.v964parse
    FeaturePrefsStore.batch961.v964parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v964: partial level
internal fun PlayerActivity.showV964PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v964partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v964partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v964: pass level
internal fun PlayerActivity.showV964PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v964pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v964pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v964: password level
internal fun PlayerActivity.showV964PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v964password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v964password = value
        AppToast.show(this, "password: $value")
    }
}

// v964: paste level
internal fun PlayerActivity.showV964PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v964paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v964paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v964: patch level
internal fun PlayerActivity.showV964PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v964patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v964patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v964: path mode
internal fun PlayerActivity.showV964PathToggle() {
    val current = FeaturePrefsStore.batch961.v964path
    FeaturePrefsStore.batch961.v964path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v964: pattern mode
internal fun PlayerActivity.showV964PatternToggle() {
    val current = FeaturePrefsStore.batch961.v964pattern
    FeaturePrefsStore.batch961.v964pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v964: pause mode
internal fun PlayerActivity.showV964PauseToggle() {
    val current = FeaturePrefsStore.batch961.v964pause
    FeaturePrefsStore.batch961.v964pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v964: payload mode
internal fun PlayerActivity.showV964PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v964payload
    FeaturePrefsStore.batch961.v964payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v964: peak mode
internal fun PlayerActivity.showV964PeakToggle() {
    val current = FeaturePrefsStore.batch961.v964peak
    FeaturePrefsStore.batch961.v964peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v965: panel mode
internal fun PlayerActivity.showV965PanelToggle() {
    val current = FeaturePrefsStore.batch961.v965panel
    FeaturePrefsStore.batch961.v965panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v965: parallel mode
internal fun PlayerActivity.showV965ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v965parallel
    FeaturePrefsStore.batch961.v965parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v965: param mode
internal fun PlayerActivity.showV965ParamToggle() {
    val current = FeaturePrefsStore.batch961.v965param
    FeaturePrefsStore.batch961.v965param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v965: parent mode
internal fun PlayerActivity.showV965ParentToggle() {
    val current = FeaturePrefsStore.batch961.v965parent
    FeaturePrefsStore.batch961.v965parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v965: parse mode
internal fun PlayerActivity.showV965ParseToggle() {
    val current = FeaturePrefsStore.batch961.v965parse
    FeaturePrefsStore.batch961.v965parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v965: partial level
internal fun PlayerActivity.showV965PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v965partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v965partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v965: pass level
internal fun PlayerActivity.showV965PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v965pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v965pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v965: password level
internal fun PlayerActivity.showV965PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v965password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v965password = value
        AppToast.show(this, "password: $value")
    }
}

// v965: paste level
internal fun PlayerActivity.showV965PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v965paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v965paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v965: patch level
internal fun PlayerActivity.showV965PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v965patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v965patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v965: path mode
internal fun PlayerActivity.showV965PathToggle() {
    val current = FeaturePrefsStore.batch961.v965path
    FeaturePrefsStore.batch961.v965path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v965: pattern mode
internal fun PlayerActivity.showV965PatternToggle() {
    val current = FeaturePrefsStore.batch961.v965pattern
    FeaturePrefsStore.batch961.v965pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v965: pause mode
internal fun PlayerActivity.showV965PauseToggle() {
    val current = FeaturePrefsStore.batch961.v965pause
    FeaturePrefsStore.batch961.v965pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v965: payload mode
internal fun PlayerActivity.showV965PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v965payload
    FeaturePrefsStore.batch961.v965payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v965: peak mode
internal fun PlayerActivity.showV965PeakToggle() {
    val current = FeaturePrefsStore.batch961.v965peak
    FeaturePrefsStore.batch961.v965peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v966: panel mode
internal fun PlayerActivity.showV966PanelToggle() {
    val current = FeaturePrefsStore.batch961.v966panel
    FeaturePrefsStore.batch961.v966panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v966: parallel mode
internal fun PlayerActivity.showV966ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v966parallel
    FeaturePrefsStore.batch961.v966parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v966: param mode
internal fun PlayerActivity.showV966ParamToggle() {
    val current = FeaturePrefsStore.batch961.v966param
    FeaturePrefsStore.batch961.v966param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v966: parent mode
internal fun PlayerActivity.showV966ParentToggle() {
    val current = FeaturePrefsStore.batch961.v966parent
    FeaturePrefsStore.batch961.v966parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v966: parse mode
internal fun PlayerActivity.showV966ParseToggle() {
    val current = FeaturePrefsStore.batch961.v966parse
    FeaturePrefsStore.batch961.v966parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v966: partial level
internal fun PlayerActivity.showV966PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v966partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v966partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v966: pass level
internal fun PlayerActivity.showV966PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v966pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v966pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v966: password level
internal fun PlayerActivity.showV966PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v966password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v966password = value
        AppToast.show(this, "password: $value")
    }
}

// v966: paste level
internal fun PlayerActivity.showV966PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v966paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v966paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v966: patch level
internal fun PlayerActivity.showV966PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v966patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v966patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v966: path mode
internal fun PlayerActivity.showV966PathToggle() {
    val current = FeaturePrefsStore.batch961.v966path
    FeaturePrefsStore.batch961.v966path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v966: pattern mode
internal fun PlayerActivity.showV966PatternToggle() {
    val current = FeaturePrefsStore.batch961.v966pattern
    FeaturePrefsStore.batch961.v966pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v966: pause mode
internal fun PlayerActivity.showV966PauseToggle() {
    val current = FeaturePrefsStore.batch961.v966pause
    FeaturePrefsStore.batch961.v966pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v966: payload mode
internal fun PlayerActivity.showV966PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v966payload
    FeaturePrefsStore.batch961.v966payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v966: peak mode
internal fun PlayerActivity.showV966PeakToggle() {
    val current = FeaturePrefsStore.batch961.v966peak
    FeaturePrefsStore.batch961.v966peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v967: panel mode
internal fun PlayerActivity.showV967PanelToggle() {
    val current = FeaturePrefsStore.batch961.v967panel
    FeaturePrefsStore.batch961.v967panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v967: parallel mode
internal fun PlayerActivity.showV967ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v967parallel
    FeaturePrefsStore.batch961.v967parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v967: param mode
internal fun PlayerActivity.showV967ParamToggle() {
    val current = FeaturePrefsStore.batch961.v967param
    FeaturePrefsStore.batch961.v967param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v967: parent mode
internal fun PlayerActivity.showV967ParentToggle() {
    val current = FeaturePrefsStore.batch961.v967parent
    FeaturePrefsStore.batch961.v967parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v967: parse mode
internal fun PlayerActivity.showV967ParseToggle() {
    val current = FeaturePrefsStore.batch961.v967parse
    FeaturePrefsStore.batch961.v967parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v967: partial level
internal fun PlayerActivity.showV967PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v967partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v967partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v967: pass level
internal fun PlayerActivity.showV967PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v967pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v967pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v967: password level
internal fun PlayerActivity.showV967PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v967password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v967password = value
        AppToast.show(this, "password: $value")
    }
}

// v967: paste level
internal fun PlayerActivity.showV967PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v967paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v967paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v967: patch level
internal fun PlayerActivity.showV967PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v967patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v967patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v967: path mode
internal fun PlayerActivity.showV967PathToggle() {
    val current = FeaturePrefsStore.batch961.v967path
    FeaturePrefsStore.batch961.v967path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v967: pattern mode
internal fun PlayerActivity.showV967PatternToggle() {
    val current = FeaturePrefsStore.batch961.v967pattern
    FeaturePrefsStore.batch961.v967pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v967: pause mode
internal fun PlayerActivity.showV967PauseToggle() {
    val current = FeaturePrefsStore.batch961.v967pause
    FeaturePrefsStore.batch961.v967pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v967: payload mode
internal fun PlayerActivity.showV967PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v967payload
    FeaturePrefsStore.batch961.v967payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v967: peak mode
internal fun PlayerActivity.showV967PeakToggle() {
    val current = FeaturePrefsStore.batch961.v967peak
    FeaturePrefsStore.batch961.v967peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v968: panel mode
internal fun PlayerActivity.showV968PanelToggle() {
    val current = FeaturePrefsStore.batch961.v968panel
    FeaturePrefsStore.batch961.v968panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v968: parallel mode
internal fun PlayerActivity.showV968ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v968parallel
    FeaturePrefsStore.batch961.v968parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v968: param mode
internal fun PlayerActivity.showV968ParamToggle() {
    val current = FeaturePrefsStore.batch961.v968param
    FeaturePrefsStore.batch961.v968param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v968: parent mode
internal fun PlayerActivity.showV968ParentToggle() {
    val current = FeaturePrefsStore.batch961.v968parent
    FeaturePrefsStore.batch961.v968parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v968: parse mode
internal fun PlayerActivity.showV968ParseToggle() {
    val current = FeaturePrefsStore.batch961.v968parse
    FeaturePrefsStore.batch961.v968parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v968: partial level
internal fun PlayerActivity.showV968PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v968partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v968partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v968: pass level
internal fun PlayerActivity.showV968PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v968pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v968pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v968: password level
internal fun PlayerActivity.showV968PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v968password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v968password = value
        AppToast.show(this, "password: $value")
    }
}

// v968: paste level
internal fun PlayerActivity.showV968PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v968paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v968paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v968: patch level
internal fun PlayerActivity.showV968PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v968patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v968patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v968: path mode
internal fun PlayerActivity.showV968PathToggle() {
    val current = FeaturePrefsStore.batch961.v968path
    FeaturePrefsStore.batch961.v968path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v968: pattern mode
internal fun PlayerActivity.showV968PatternToggle() {
    val current = FeaturePrefsStore.batch961.v968pattern
    FeaturePrefsStore.batch961.v968pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v968: pause mode
internal fun PlayerActivity.showV968PauseToggle() {
    val current = FeaturePrefsStore.batch961.v968pause
    FeaturePrefsStore.batch961.v968pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v968: payload mode
internal fun PlayerActivity.showV968PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v968payload
    FeaturePrefsStore.batch961.v968payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v968: peak mode
internal fun PlayerActivity.showV968PeakToggle() {
    val current = FeaturePrefsStore.batch961.v968peak
    FeaturePrefsStore.batch961.v968peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v969: panel mode
internal fun PlayerActivity.showV969PanelToggle() {
    val current = FeaturePrefsStore.batch961.v969panel
    FeaturePrefsStore.batch961.v969panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v969: parallel mode
internal fun PlayerActivity.showV969ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v969parallel
    FeaturePrefsStore.batch961.v969parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v969: param mode
internal fun PlayerActivity.showV969ParamToggle() {
    val current = FeaturePrefsStore.batch961.v969param
    FeaturePrefsStore.batch961.v969param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v969: parent mode
internal fun PlayerActivity.showV969ParentToggle() {
    val current = FeaturePrefsStore.batch961.v969parent
    FeaturePrefsStore.batch961.v969parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v969: parse mode
internal fun PlayerActivity.showV969ParseToggle() {
    val current = FeaturePrefsStore.batch961.v969parse
    FeaturePrefsStore.batch961.v969parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v969: partial level
internal fun PlayerActivity.showV969PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v969partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v969partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v969: pass level
internal fun PlayerActivity.showV969PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v969pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v969pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v969: password level
internal fun PlayerActivity.showV969PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v969password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v969password = value
        AppToast.show(this, "password: $value")
    }
}

// v969: paste level
internal fun PlayerActivity.showV969PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v969paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v969paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v969: patch level
internal fun PlayerActivity.showV969PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v969patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v969patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v969: path mode
internal fun PlayerActivity.showV969PathToggle() {
    val current = FeaturePrefsStore.batch961.v969path
    FeaturePrefsStore.batch961.v969path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v969: pattern mode
internal fun PlayerActivity.showV969PatternToggle() {
    val current = FeaturePrefsStore.batch961.v969pattern
    FeaturePrefsStore.batch961.v969pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v969: pause mode
internal fun PlayerActivity.showV969PauseToggle() {
    val current = FeaturePrefsStore.batch961.v969pause
    FeaturePrefsStore.batch961.v969pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v969: payload mode
internal fun PlayerActivity.showV969PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v969payload
    FeaturePrefsStore.batch961.v969payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v969: peak mode
internal fun PlayerActivity.showV969PeakToggle() {
    val current = FeaturePrefsStore.batch961.v969peak
    FeaturePrefsStore.batch961.v969peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

// v970: panel mode
internal fun PlayerActivity.showV970PanelToggle() {
    val current = FeaturePrefsStore.batch961.v970panel
    FeaturePrefsStore.batch961.v970panel = !current
    AppToast.show(this, "panel: ${if (!current) "ON" else "OFF"}")
}

// v970: parallel mode
internal fun PlayerActivity.showV970ParallelToggle() {
    val current = FeaturePrefsStore.batch961.v970parallel
    FeaturePrefsStore.batch961.v970parallel = !current
    AppToast.show(this, "parallel: ${if (!current) "ON" else "OFF"}")
}

// v970: param mode
internal fun PlayerActivity.showV970ParamToggle() {
    val current = FeaturePrefsStore.batch961.v970param
    FeaturePrefsStore.batch961.v970param = !current
    AppToast.show(this, "param: ${if (!current) "ON" else "OFF"}")
}

// v970: parent mode
internal fun PlayerActivity.showV970ParentToggle() {
    val current = FeaturePrefsStore.batch961.v970parent
    FeaturePrefsStore.batch961.v970parent = !current
    AppToast.show(this, "parent: ${if (!current) "ON" else "OFF"}")
}

// v970: parse mode
internal fun PlayerActivity.showV970ParseToggle() {
    val current = FeaturePrefsStore.batch961.v970parse
    FeaturePrefsStore.batch961.v970parse = !current
    AppToast.show(this, "parse: ${if (!current) "ON" else "OFF"}")
}

// v970: partial level
internal fun PlayerActivity.showV970PartialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v970partial).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "partial level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v970partial = value
        AppToast.show(this, "partial: $value")
    }
}

// v970: pass level
internal fun PlayerActivity.showV970PassDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v970pass).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pass level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v970pass = value
        AppToast.show(this, "pass: $value")
    }
}

// v970: password level
internal fun PlayerActivity.showV970PasswordDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v970password).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "password level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v970password = value
        AppToast.show(this, "password: $value")
    }
}

// v970: paste level
internal fun PlayerActivity.showV970PasteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v970paste).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "paste level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v970paste = value
        AppToast.show(this, "paste: $value")
    }
}

// v970: patch level
internal fun PlayerActivity.showV970PatchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch961.v970patch).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "patch level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch961.v970patch = value
        AppToast.show(this, "patch: $value")
    }
}

// v970: path mode
internal fun PlayerActivity.showV970PathToggle() {
    val current = FeaturePrefsStore.batch961.v970path
    FeaturePrefsStore.batch961.v970path = !current
    AppToast.show(this, "path: ${if (!current) "ON" else "OFF"}")
}

// v970: pattern mode
internal fun PlayerActivity.showV970PatternToggle() {
    val current = FeaturePrefsStore.batch961.v970pattern
    FeaturePrefsStore.batch961.v970pattern = !current
    AppToast.show(this, "pattern: ${if (!current) "ON" else "OFF"}")
}

// v970: pause mode
internal fun PlayerActivity.showV970PauseToggle() {
    val current = FeaturePrefsStore.batch961.v970pause
    FeaturePrefsStore.batch961.v970pause = !current
    AppToast.show(this, "pause: ${if (!current) "ON" else "OFF"}")
}

// v970: payload mode
internal fun PlayerActivity.showV970PayloadToggle() {
    val current = FeaturePrefsStore.batch961.v970payload
    FeaturePrefsStore.batch961.v970payload = !current
    AppToast.show(this, "payload: ${if (!current) "ON" else "OFF"}")
}

// v970: peak mode
internal fun PlayerActivity.showV970PeakToggle() {
    val current = FeaturePrefsStore.batch961.v970peak
    FeaturePrefsStore.batch961.v970peak = !current
    AppToast.show(this, "peak: ${if (!current) "ON" else "OFF"}")
}

