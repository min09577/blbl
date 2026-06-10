package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v971: pending mode
internal fun PlayerActivity.showV971PendingToggle() {
    val current = FeaturePrefsStore.batch971.v971pending
    FeaturePrefsStore.batch971.v971pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v971: percent mode
internal fun PlayerActivity.showV971PercentToggle() {
    val current = FeaturePrefsStore.batch971.v971percent
    FeaturePrefsStore.batch971.v971percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v971: perform mode
internal fun PlayerActivity.showV971PerformToggle() {
    val current = FeaturePrefsStore.batch971.v971perform
    FeaturePrefsStore.batch971.v971perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v971: permission mode
internal fun PlayerActivity.showV971PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v971permission
    FeaturePrefsStore.batch971.v971permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v971: persist mode
internal fun PlayerActivity.showV971PersistToggle() {
    val current = FeaturePrefsStore.batch971.v971persist
    FeaturePrefsStore.batch971.v971persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v971: phase level
internal fun PlayerActivity.showV971PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v971: phone level
internal fun PlayerActivity.showV971PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v971: photo level
internal fun PlayerActivity.showV971PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v971: phrase level
internal fun PlayerActivity.showV971PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v971: pick level
internal fun PlayerActivity.showV971PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v971pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v971pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v971: picture mode
internal fun PlayerActivity.showV971PictureToggle() {
    val current = FeaturePrefsStore.batch971.v971picture
    FeaturePrefsStore.batch971.v971picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v971: pin mode
internal fun PlayerActivity.showV971PinToggle() {
    val current = FeaturePrefsStore.batch971.v971pin
    FeaturePrefsStore.batch971.v971pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v971: pipe mode
internal fun PlayerActivity.showV971PipeToggle() {
    val current = FeaturePrefsStore.batch971.v971pipe
    FeaturePrefsStore.batch971.v971pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v971: pitch mode
internal fun PlayerActivity.showV971PitchToggle() {
    val current = FeaturePrefsStore.batch971.v971pitch
    FeaturePrefsStore.batch971.v971pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v971: pixel mode
internal fun PlayerActivity.showV971PixelToggle() {
    val current = FeaturePrefsStore.batch971.v971pixel
    FeaturePrefsStore.batch971.v971pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v972: pending mode
internal fun PlayerActivity.showV972PendingToggle() {
    val current = FeaturePrefsStore.batch971.v972pending
    FeaturePrefsStore.batch971.v972pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v972: percent mode
internal fun PlayerActivity.showV972PercentToggle() {
    val current = FeaturePrefsStore.batch971.v972percent
    FeaturePrefsStore.batch971.v972percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v972: perform mode
internal fun PlayerActivity.showV972PerformToggle() {
    val current = FeaturePrefsStore.batch971.v972perform
    FeaturePrefsStore.batch971.v972perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v972: permission mode
internal fun PlayerActivity.showV972PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v972permission
    FeaturePrefsStore.batch971.v972permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v972: persist mode
internal fun PlayerActivity.showV972PersistToggle() {
    val current = FeaturePrefsStore.batch971.v972persist
    FeaturePrefsStore.batch971.v972persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v972: phase level
internal fun PlayerActivity.showV972PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v972: phone level
internal fun PlayerActivity.showV972PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v972: photo level
internal fun PlayerActivity.showV972PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v972: phrase level
internal fun PlayerActivity.showV972PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v972: pick level
internal fun PlayerActivity.showV972PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v972pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v972pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v972: picture mode
internal fun PlayerActivity.showV972PictureToggle() {
    val current = FeaturePrefsStore.batch971.v972picture
    FeaturePrefsStore.batch971.v972picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v972: pin mode
internal fun PlayerActivity.showV972PinToggle() {
    val current = FeaturePrefsStore.batch971.v972pin
    FeaturePrefsStore.batch971.v972pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v972: pipe mode
internal fun PlayerActivity.showV972PipeToggle() {
    val current = FeaturePrefsStore.batch971.v972pipe
    FeaturePrefsStore.batch971.v972pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v972: pitch mode
internal fun PlayerActivity.showV972PitchToggle() {
    val current = FeaturePrefsStore.batch971.v972pitch
    FeaturePrefsStore.batch971.v972pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v972: pixel mode
internal fun PlayerActivity.showV972PixelToggle() {
    val current = FeaturePrefsStore.batch971.v972pixel
    FeaturePrefsStore.batch971.v972pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v973: pending mode
internal fun PlayerActivity.showV973PendingToggle() {
    val current = FeaturePrefsStore.batch971.v973pending
    FeaturePrefsStore.batch971.v973pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v973: percent mode
internal fun PlayerActivity.showV973PercentToggle() {
    val current = FeaturePrefsStore.batch971.v973percent
    FeaturePrefsStore.batch971.v973percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v973: perform mode
internal fun PlayerActivity.showV973PerformToggle() {
    val current = FeaturePrefsStore.batch971.v973perform
    FeaturePrefsStore.batch971.v973perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v973: permission mode
internal fun PlayerActivity.showV973PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v973permission
    FeaturePrefsStore.batch971.v973permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v973: persist mode
internal fun PlayerActivity.showV973PersistToggle() {
    val current = FeaturePrefsStore.batch971.v973persist
    FeaturePrefsStore.batch971.v973persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v973: phase level
internal fun PlayerActivity.showV973PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v973: phone level
internal fun PlayerActivity.showV973PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v973: photo level
internal fun PlayerActivity.showV973PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v973: phrase level
internal fun PlayerActivity.showV973PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v973: pick level
internal fun PlayerActivity.showV973PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v973pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v973pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v973: picture mode
internal fun PlayerActivity.showV973PictureToggle() {
    val current = FeaturePrefsStore.batch971.v973picture
    FeaturePrefsStore.batch971.v973picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v973: pin mode
internal fun PlayerActivity.showV973PinToggle() {
    val current = FeaturePrefsStore.batch971.v973pin
    FeaturePrefsStore.batch971.v973pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v973: pipe mode
internal fun PlayerActivity.showV973PipeToggle() {
    val current = FeaturePrefsStore.batch971.v973pipe
    FeaturePrefsStore.batch971.v973pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v973: pitch mode
internal fun PlayerActivity.showV973PitchToggle() {
    val current = FeaturePrefsStore.batch971.v973pitch
    FeaturePrefsStore.batch971.v973pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v973: pixel mode
internal fun PlayerActivity.showV973PixelToggle() {
    val current = FeaturePrefsStore.batch971.v973pixel
    FeaturePrefsStore.batch971.v973pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v974: pending mode
internal fun PlayerActivity.showV974PendingToggle() {
    val current = FeaturePrefsStore.batch971.v974pending
    FeaturePrefsStore.batch971.v974pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v974: percent mode
internal fun PlayerActivity.showV974PercentToggle() {
    val current = FeaturePrefsStore.batch971.v974percent
    FeaturePrefsStore.batch971.v974percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v974: perform mode
internal fun PlayerActivity.showV974PerformToggle() {
    val current = FeaturePrefsStore.batch971.v974perform
    FeaturePrefsStore.batch971.v974perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v974: permission mode
internal fun PlayerActivity.showV974PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v974permission
    FeaturePrefsStore.batch971.v974permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v974: persist mode
internal fun PlayerActivity.showV974PersistToggle() {
    val current = FeaturePrefsStore.batch971.v974persist
    FeaturePrefsStore.batch971.v974persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v974: phase level
internal fun PlayerActivity.showV974PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v974: phone level
internal fun PlayerActivity.showV974PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v974: photo level
internal fun PlayerActivity.showV974PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v974: phrase level
internal fun PlayerActivity.showV974PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v974: pick level
internal fun PlayerActivity.showV974PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v974pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v974pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v974: picture mode
internal fun PlayerActivity.showV974PictureToggle() {
    val current = FeaturePrefsStore.batch971.v974picture
    FeaturePrefsStore.batch971.v974picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v974: pin mode
internal fun PlayerActivity.showV974PinToggle() {
    val current = FeaturePrefsStore.batch971.v974pin
    FeaturePrefsStore.batch971.v974pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v974: pipe mode
internal fun PlayerActivity.showV974PipeToggle() {
    val current = FeaturePrefsStore.batch971.v974pipe
    FeaturePrefsStore.batch971.v974pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v974: pitch mode
internal fun PlayerActivity.showV974PitchToggle() {
    val current = FeaturePrefsStore.batch971.v974pitch
    FeaturePrefsStore.batch971.v974pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v974: pixel mode
internal fun PlayerActivity.showV974PixelToggle() {
    val current = FeaturePrefsStore.batch971.v974pixel
    FeaturePrefsStore.batch971.v974pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v975: pending mode
internal fun PlayerActivity.showV975PendingToggle() {
    val current = FeaturePrefsStore.batch971.v975pending
    FeaturePrefsStore.batch971.v975pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v975: percent mode
internal fun PlayerActivity.showV975PercentToggle() {
    val current = FeaturePrefsStore.batch971.v975percent
    FeaturePrefsStore.batch971.v975percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v975: perform mode
internal fun PlayerActivity.showV975PerformToggle() {
    val current = FeaturePrefsStore.batch971.v975perform
    FeaturePrefsStore.batch971.v975perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v975: permission mode
internal fun PlayerActivity.showV975PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v975permission
    FeaturePrefsStore.batch971.v975permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v975: persist mode
internal fun PlayerActivity.showV975PersistToggle() {
    val current = FeaturePrefsStore.batch971.v975persist
    FeaturePrefsStore.batch971.v975persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v975: phase level
internal fun PlayerActivity.showV975PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v975: phone level
internal fun PlayerActivity.showV975PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v975: photo level
internal fun PlayerActivity.showV975PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v975: phrase level
internal fun PlayerActivity.showV975PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v975: pick level
internal fun PlayerActivity.showV975PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v975pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v975pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v975: picture mode
internal fun PlayerActivity.showV975PictureToggle() {
    val current = FeaturePrefsStore.batch971.v975picture
    FeaturePrefsStore.batch971.v975picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v975: pin mode
internal fun PlayerActivity.showV975PinToggle() {
    val current = FeaturePrefsStore.batch971.v975pin
    FeaturePrefsStore.batch971.v975pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v975: pipe mode
internal fun PlayerActivity.showV975PipeToggle() {
    val current = FeaturePrefsStore.batch971.v975pipe
    FeaturePrefsStore.batch971.v975pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v975: pitch mode
internal fun PlayerActivity.showV975PitchToggle() {
    val current = FeaturePrefsStore.batch971.v975pitch
    FeaturePrefsStore.batch971.v975pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v975: pixel mode
internal fun PlayerActivity.showV975PixelToggle() {
    val current = FeaturePrefsStore.batch971.v975pixel
    FeaturePrefsStore.batch971.v975pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v976: pending mode
internal fun PlayerActivity.showV976PendingToggle() {
    val current = FeaturePrefsStore.batch971.v976pending
    FeaturePrefsStore.batch971.v976pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v976: percent mode
internal fun PlayerActivity.showV976PercentToggle() {
    val current = FeaturePrefsStore.batch971.v976percent
    FeaturePrefsStore.batch971.v976percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v976: perform mode
internal fun PlayerActivity.showV976PerformToggle() {
    val current = FeaturePrefsStore.batch971.v976perform
    FeaturePrefsStore.batch971.v976perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v976: permission mode
internal fun PlayerActivity.showV976PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v976permission
    FeaturePrefsStore.batch971.v976permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v976: persist mode
internal fun PlayerActivity.showV976PersistToggle() {
    val current = FeaturePrefsStore.batch971.v976persist
    FeaturePrefsStore.batch971.v976persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v976: phase level
internal fun PlayerActivity.showV976PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v976: phone level
internal fun PlayerActivity.showV976PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v976: photo level
internal fun PlayerActivity.showV976PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v976: phrase level
internal fun PlayerActivity.showV976PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v976: pick level
internal fun PlayerActivity.showV976PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v976pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v976pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v976: picture mode
internal fun PlayerActivity.showV976PictureToggle() {
    val current = FeaturePrefsStore.batch971.v976picture
    FeaturePrefsStore.batch971.v976picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v976: pin mode
internal fun PlayerActivity.showV976PinToggle() {
    val current = FeaturePrefsStore.batch971.v976pin
    FeaturePrefsStore.batch971.v976pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v976: pipe mode
internal fun PlayerActivity.showV976PipeToggle() {
    val current = FeaturePrefsStore.batch971.v976pipe
    FeaturePrefsStore.batch971.v976pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v976: pitch mode
internal fun PlayerActivity.showV976PitchToggle() {
    val current = FeaturePrefsStore.batch971.v976pitch
    FeaturePrefsStore.batch971.v976pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v976: pixel mode
internal fun PlayerActivity.showV976PixelToggle() {
    val current = FeaturePrefsStore.batch971.v976pixel
    FeaturePrefsStore.batch971.v976pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v977: pending mode
internal fun PlayerActivity.showV977PendingToggle() {
    val current = FeaturePrefsStore.batch971.v977pending
    FeaturePrefsStore.batch971.v977pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v977: percent mode
internal fun PlayerActivity.showV977PercentToggle() {
    val current = FeaturePrefsStore.batch971.v977percent
    FeaturePrefsStore.batch971.v977percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v977: perform mode
internal fun PlayerActivity.showV977PerformToggle() {
    val current = FeaturePrefsStore.batch971.v977perform
    FeaturePrefsStore.batch971.v977perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v977: permission mode
internal fun PlayerActivity.showV977PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v977permission
    FeaturePrefsStore.batch971.v977permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v977: persist mode
internal fun PlayerActivity.showV977PersistToggle() {
    val current = FeaturePrefsStore.batch971.v977persist
    FeaturePrefsStore.batch971.v977persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v977: phase level
internal fun PlayerActivity.showV977PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v977: phone level
internal fun PlayerActivity.showV977PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v977: photo level
internal fun PlayerActivity.showV977PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v977: phrase level
internal fun PlayerActivity.showV977PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v977: pick level
internal fun PlayerActivity.showV977PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v977pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v977pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v977: picture mode
internal fun PlayerActivity.showV977PictureToggle() {
    val current = FeaturePrefsStore.batch971.v977picture
    FeaturePrefsStore.batch971.v977picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v977: pin mode
internal fun PlayerActivity.showV977PinToggle() {
    val current = FeaturePrefsStore.batch971.v977pin
    FeaturePrefsStore.batch971.v977pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v977: pipe mode
internal fun PlayerActivity.showV977PipeToggle() {
    val current = FeaturePrefsStore.batch971.v977pipe
    FeaturePrefsStore.batch971.v977pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v977: pitch mode
internal fun PlayerActivity.showV977PitchToggle() {
    val current = FeaturePrefsStore.batch971.v977pitch
    FeaturePrefsStore.batch971.v977pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v977: pixel mode
internal fun PlayerActivity.showV977PixelToggle() {
    val current = FeaturePrefsStore.batch971.v977pixel
    FeaturePrefsStore.batch971.v977pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v978: pending mode
internal fun PlayerActivity.showV978PendingToggle() {
    val current = FeaturePrefsStore.batch971.v978pending
    FeaturePrefsStore.batch971.v978pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v978: percent mode
internal fun PlayerActivity.showV978PercentToggle() {
    val current = FeaturePrefsStore.batch971.v978percent
    FeaturePrefsStore.batch971.v978percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v978: perform mode
internal fun PlayerActivity.showV978PerformToggle() {
    val current = FeaturePrefsStore.batch971.v978perform
    FeaturePrefsStore.batch971.v978perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v978: permission mode
internal fun PlayerActivity.showV978PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v978permission
    FeaturePrefsStore.batch971.v978permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v978: persist mode
internal fun PlayerActivity.showV978PersistToggle() {
    val current = FeaturePrefsStore.batch971.v978persist
    FeaturePrefsStore.batch971.v978persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v978: phase level
internal fun PlayerActivity.showV978PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v978: phone level
internal fun PlayerActivity.showV978PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v978: photo level
internal fun PlayerActivity.showV978PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v978: phrase level
internal fun PlayerActivity.showV978PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v978: pick level
internal fun PlayerActivity.showV978PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v978pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v978pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v978: picture mode
internal fun PlayerActivity.showV978PictureToggle() {
    val current = FeaturePrefsStore.batch971.v978picture
    FeaturePrefsStore.batch971.v978picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v978: pin mode
internal fun PlayerActivity.showV978PinToggle() {
    val current = FeaturePrefsStore.batch971.v978pin
    FeaturePrefsStore.batch971.v978pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v978: pipe mode
internal fun PlayerActivity.showV978PipeToggle() {
    val current = FeaturePrefsStore.batch971.v978pipe
    FeaturePrefsStore.batch971.v978pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v978: pitch mode
internal fun PlayerActivity.showV978PitchToggle() {
    val current = FeaturePrefsStore.batch971.v978pitch
    FeaturePrefsStore.batch971.v978pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v978: pixel mode
internal fun PlayerActivity.showV978PixelToggle() {
    val current = FeaturePrefsStore.batch971.v978pixel
    FeaturePrefsStore.batch971.v978pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v979: pending mode
internal fun PlayerActivity.showV979PendingToggle() {
    val current = FeaturePrefsStore.batch971.v979pending
    FeaturePrefsStore.batch971.v979pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v979: percent mode
internal fun PlayerActivity.showV979PercentToggle() {
    val current = FeaturePrefsStore.batch971.v979percent
    FeaturePrefsStore.batch971.v979percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v979: perform mode
internal fun PlayerActivity.showV979PerformToggle() {
    val current = FeaturePrefsStore.batch971.v979perform
    FeaturePrefsStore.batch971.v979perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v979: permission mode
internal fun PlayerActivity.showV979PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v979permission
    FeaturePrefsStore.batch971.v979permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v979: persist mode
internal fun PlayerActivity.showV979PersistToggle() {
    val current = FeaturePrefsStore.batch971.v979persist
    FeaturePrefsStore.batch971.v979persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v979: phase level
internal fun PlayerActivity.showV979PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v979: phone level
internal fun PlayerActivity.showV979PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v979: photo level
internal fun PlayerActivity.showV979PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v979: phrase level
internal fun PlayerActivity.showV979PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v979: pick level
internal fun PlayerActivity.showV979PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v979pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v979pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v979: picture mode
internal fun PlayerActivity.showV979PictureToggle() {
    val current = FeaturePrefsStore.batch971.v979picture
    FeaturePrefsStore.batch971.v979picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v979: pin mode
internal fun PlayerActivity.showV979PinToggle() {
    val current = FeaturePrefsStore.batch971.v979pin
    FeaturePrefsStore.batch971.v979pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v979: pipe mode
internal fun PlayerActivity.showV979PipeToggle() {
    val current = FeaturePrefsStore.batch971.v979pipe
    FeaturePrefsStore.batch971.v979pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v979: pitch mode
internal fun PlayerActivity.showV979PitchToggle() {
    val current = FeaturePrefsStore.batch971.v979pitch
    FeaturePrefsStore.batch971.v979pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v979: pixel mode
internal fun PlayerActivity.showV979PixelToggle() {
    val current = FeaturePrefsStore.batch971.v979pixel
    FeaturePrefsStore.batch971.v979pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v980: pending mode
internal fun PlayerActivity.showV980PendingToggle() {
    val current = FeaturePrefsStore.batch971.v980pending
    FeaturePrefsStore.batch971.v980pending = !current
    AppToast.show(this, "pending: ${if (!current) "ON" else "OFF"}")
}

// v980: percent mode
internal fun PlayerActivity.showV980PercentToggle() {
    val current = FeaturePrefsStore.batch971.v980percent
    FeaturePrefsStore.batch971.v980percent = !current
    AppToast.show(this, "percent: ${if (!current) "ON" else "OFF"}")
}

// v980: perform mode
internal fun PlayerActivity.showV980PerformToggle() {
    val current = FeaturePrefsStore.batch971.v980perform
    FeaturePrefsStore.batch971.v980perform = !current
    AppToast.show(this, "perform: ${if (!current) "ON" else "OFF"}")
}

// v980: permission mode
internal fun PlayerActivity.showV980PermissionToggle() {
    val current = FeaturePrefsStore.batch971.v980permission
    FeaturePrefsStore.batch971.v980permission = !current
    AppToast.show(this, "permission: ${if (!current) "ON" else "OFF"}")
}

// v980: persist mode
internal fun PlayerActivity.showV980PersistToggle() {
    val current = FeaturePrefsStore.batch971.v980persist
    FeaturePrefsStore.batch971.v980persist = !current
    AppToast.show(this, "persist: ${if (!current) "ON" else "OFF"}")
}

// v980: phase level
internal fun PlayerActivity.showV980PhaseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980phase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980phase = value
        AppToast.show(this, "phase: $value")
    }
}

// v980: phone level
internal fun PlayerActivity.showV980PhoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980phone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980phone = value
        AppToast.show(this, "phone: $value")
    }
}

// v980: photo level
internal fun PlayerActivity.showV980PhotoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980photo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "photo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980photo = value
        AppToast.show(this, "photo: $value")
    }
}

// v980: phrase level
internal fun PlayerActivity.showV980PhraseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980phrase).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "phrase level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980phrase = value
        AppToast.show(this, "phrase: $value")
    }
}

// v980: pick level
internal fun PlayerActivity.showV980PickDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch971.v980pick).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pick level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch971.v980pick = value
        AppToast.show(this, "pick: $value")
    }
}

// v980: picture mode
internal fun PlayerActivity.showV980PictureToggle() {
    val current = FeaturePrefsStore.batch971.v980picture
    FeaturePrefsStore.batch971.v980picture = !current
    AppToast.show(this, "picture: ${if (!current) "ON" else "OFF"}")
}

// v980: pin mode
internal fun PlayerActivity.showV980PinToggle() {
    val current = FeaturePrefsStore.batch971.v980pin
    FeaturePrefsStore.batch971.v980pin = !current
    AppToast.show(this, "pin: ${if (!current) "ON" else "OFF"}")
}

// v980: pipe mode
internal fun PlayerActivity.showV980PipeToggle() {
    val current = FeaturePrefsStore.batch971.v980pipe
    FeaturePrefsStore.batch971.v980pipe = !current
    AppToast.show(this, "pipe: ${if (!current) "ON" else "OFF"}")
}

// v980: pitch mode
internal fun PlayerActivity.showV980PitchToggle() {
    val current = FeaturePrefsStore.batch971.v980pitch
    FeaturePrefsStore.batch971.v980pitch = !current
    AppToast.show(this, "pitch: ${if (!current) "ON" else "OFF"}")
}

// v980: pixel mode
internal fun PlayerActivity.showV980PixelToggle() {
    val current = FeaturePrefsStore.batch971.v980pixel
    FeaturePrefsStore.batch971.v980pixel = !current
    AppToast.show(this, "pixel: ${if (!current) "ON" else "OFF"}")
}

// v981: place mode
internal fun PlayerActivity.showV981PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v981place
    FeaturePrefsStore.batch981.v981place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v981: plain mode
internal fun PlayerActivity.showV981PlainToggle() {
    val current = FeaturePrefsStore.batch981.v981plain
    FeaturePrefsStore.batch981.v981plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v981: plan mode
internal fun PlayerActivity.showV981PlanToggle() {
    val current = FeaturePrefsStore.batch981.v981plan
    FeaturePrefsStore.batch981.v981plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v981: platform mode
internal fun PlayerActivity.showV981PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v981platform
    FeaturePrefsStore.batch981.v981platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v981: play mode
internal fun PlayerActivity.showV981PlayToggle() {
    val current = FeaturePrefsStore.batch981.v981play
    FeaturePrefsStore.batch981.v981play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v981: player level
internal fun PlayerActivity.showV981PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981player = value
        AppToast.show(this, "player: $value")
    }
}

// v981: pointer level
internal fun PlayerActivity.showV981PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v981: poll level
internal fun PlayerActivity.showV981PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v981: pool level
internal fun PlayerActivity.showV981PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v981: pop level
internal fun PlayerActivity.showV981PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v981pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v981pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v981: port mode
internal fun PlayerActivity.showV981PortToggle() {
    val current = FeaturePrefsStore.batch981.v981port
    FeaturePrefsStore.batch981.v981port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v981: position mode
internal fun PlayerActivity.showV981PositionToggle() {
    val current = FeaturePrefsStore.batch981.v981position
    FeaturePrefsStore.batch981.v981position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v981: post mode
internal fun PlayerActivity.showV981PostToggle() {
    val current = FeaturePrefsStore.batch981.v981post
    FeaturePrefsStore.batch981.v981post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v981: power mode
internal fun PlayerActivity.showV981PowerToggle() {
    val current = FeaturePrefsStore.batch981.v981power
    FeaturePrefsStore.batch981.v981power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v981: pre mode
internal fun PlayerActivity.showV981PreToggle() {
    val current = FeaturePrefsStore.batch981.v981pre
    FeaturePrefsStore.batch981.v981pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v982: place mode
internal fun PlayerActivity.showV982PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v982place
    FeaturePrefsStore.batch981.v982place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v982: plain mode
internal fun PlayerActivity.showV982PlainToggle() {
    val current = FeaturePrefsStore.batch981.v982plain
    FeaturePrefsStore.batch981.v982plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v982: plan mode
internal fun PlayerActivity.showV982PlanToggle() {
    val current = FeaturePrefsStore.batch981.v982plan
    FeaturePrefsStore.batch981.v982plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v982: platform mode
internal fun PlayerActivity.showV982PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v982platform
    FeaturePrefsStore.batch981.v982platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v982: play mode
internal fun PlayerActivity.showV982PlayToggle() {
    val current = FeaturePrefsStore.batch981.v982play
    FeaturePrefsStore.batch981.v982play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v982: player level
internal fun PlayerActivity.showV982PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982player = value
        AppToast.show(this, "player: $value")
    }
}

// v982: pointer level
internal fun PlayerActivity.showV982PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v982: poll level
internal fun PlayerActivity.showV982PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v982: pool level
internal fun PlayerActivity.showV982PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v982: pop level
internal fun PlayerActivity.showV982PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v982pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v982pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v982: port mode
internal fun PlayerActivity.showV982PortToggle() {
    val current = FeaturePrefsStore.batch981.v982port
    FeaturePrefsStore.batch981.v982port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v982: position mode
internal fun PlayerActivity.showV982PositionToggle() {
    val current = FeaturePrefsStore.batch981.v982position
    FeaturePrefsStore.batch981.v982position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v982: post mode
internal fun PlayerActivity.showV982PostToggle() {
    val current = FeaturePrefsStore.batch981.v982post
    FeaturePrefsStore.batch981.v982post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v982: power mode
internal fun PlayerActivity.showV982PowerToggle() {
    val current = FeaturePrefsStore.batch981.v982power
    FeaturePrefsStore.batch981.v982power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v982: pre mode
internal fun PlayerActivity.showV982PreToggle() {
    val current = FeaturePrefsStore.batch981.v982pre
    FeaturePrefsStore.batch981.v982pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v983: place mode
internal fun PlayerActivity.showV983PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v983place
    FeaturePrefsStore.batch981.v983place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v983: plain mode
internal fun PlayerActivity.showV983PlainToggle() {
    val current = FeaturePrefsStore.batch981.v983plain
    FeaturePrefsStore.batch981.v983plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v983: plan mode
internal fun PlayerActivity.showV983PlanToggle() {
    val current = FeaturePrefsStore.batch981.v983plan
    FeaturePrefsStore.batch981.v983plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v983: platform mode
internal fun PlayerActivity.showV983PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v983platform
    FeaturePrefsStore.batch981.v983platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v983: play mode
internal fun PlayerActivity.showV983PlayToggle() {
    val current = FeaturePrefsStore.batch981.v983play
    FeaturePrefsStore.batch981.v983play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v983: player level
internal fun PlayerActivity.showV983PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983player = value
        AppToast.show(this, "player: $value")
    }
}

// v983: pointer level
internal fun PlayerActivity.showV983PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v983: poll level
internal fun PlayerActivity.showV983PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v983: pool level
internal fun PlayerActivity.showV983PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v983: pop level
internal fun PlayerActivity.showV983PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v983pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v983pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v983: port mode
internal fun PlayerActivity.showV983PortToggle() {
    val current = FeaturePrefsStore.batch981.v983port
    FeaturePrefsStore.batch981.v983port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v983: position mode
internal fun PlayerActivity.showV983PositionToggle() {
    val current = FeaturePrefsStore.batch981.v983position
    FeaturePrefsStore.batch981.v983position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v983: post mode
internal fun PlayerActivity.showV983PostToggle() {
    val current = FeaturePrefsStore.batch981.v983post
    FeaturePrefsStore.batch981.v983post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v983: power mode
internal fun PlayerActivity.showV983PowerToggle() {
    val current = FeaturePrefsStore.batch981.v983power
    FeaturePrefsStore.batch981.v983power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v983: pre mode
internal fun PlayerActivity.showV983PreToggle() {
    val current = FeaturePrefsStore.batch981.v983pre
    FeaturePrefsStore.batch981.v983pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v984: place mode
internal fun PlayerActivity.showV984PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v984place
    FeaturePrefsStore.batch981.v984place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v984: plain mode
internal fun PlayerActivity.showV984PlainToggle() {
    val current = FeaturePrefsStore.batch981.v984plain
    FeaturePrefsStore.batch981.v984plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v984: plan mode
internal fun PlayerActivity.showV984PlanToggle() {
    val current = FeaturePrefsStore.batch981.v984plan
    FeaturePrefsStore.batch981.v984plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v984: platform mode
internal fun PlayerActivity.showV984PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v984platform
    FeaturePrefsStore.batch981.v984platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v984: play mode
internal fun PlayerActivity.showV984PlayToggle() {
    val current = FeaturePrefsStore.batch981.v984play
    FeaturePrefsStore.batch981.v984play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v984: player level
internal fun PlayerActivity.showV984PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984player = value
        AppToast.show(this, "player: $value")
    }
}

// v984: pointer level
internal fun PlayerActivity.showV984PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v984: poll level
internal fun PlayerActivity.showV984PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v984: pool level
internal fun PlayerActivity.showV984PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v984: pop level
internal fun PlayerActivity.showV984PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v984pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v984pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v984: port mode
internal fun PlayerActivity.showV984PortToggle() {
    val current = FeaturePrefsStore.batch981.v984port
    FeaturePrefsStore.batch981.v984port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v984: position mode
internal fun PlayerActivity.showV984PositionToggle() {
    val current = FeaturePrefsStore.batch981.v984position
    FeaturePrefsStore.batch981.v984position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v984: post mode
internal fun PlayerActivity.showV984PostToggle() {
    val current = FeaturePrefsStore.batch981.v984post
    FeaturePrefsStore.batch981.v984post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v984: power mode
internal fun PlayerActivity.showV984PowerToggle() {
    val current = FeaturePrefsStore.batch981.v984power
    FeaturePrefsStore.batch981.v984power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v984: pre mode
internal fun PlayerActivity.showV984PreToggle() {
    val current = FeaturePrefsStore.batch981.v984pre
    FeaturePrefsStore.batch981.v984pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v985: place mode
internal fun PlayerActivity.showV985PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v985place
    FeaturePrefsStore.batch981.v985place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v985: plain mode
internal fun PlayerActivity.showV985PlainToggle() {
    val current = FeaturePrefsStore.batch981.v985plain
    FeaturePrefsStore.batch981.v985plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v985: plan mode
internal fun PlayerActivity.showV985PlanToggle() {
    val current = FeaturePrefsStore.batch981.v985plan
    FeaturePrefsStore.batch981.v985plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v985: platform mode
internal fun PlayerActivity.showV985PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v985platform
    FeaturePrefsStore.batch981.v985platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v985: play mode
internal fun PlayerActivity.showV985PlayToggle() {
    val current = FeaturePrefsStore.batch981.v985play
    FeaturePrefsStore.batch981.v985play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v985: player level
internal fun PlayerActivity.showV985PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985player = value
        AppToast.show(this, "player: $value")
    }
}

// v985: pointer level
internal fun PlayerActivity.showV985PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v985: poll level
internal fun PlayerActivity.showV985PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v985: pool level
internal fun PlayerActivity.showV985PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v985: pop level
internal fun PlayerActivity.showV985PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v985pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v985pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v985: port mode
internal fun PlayerActivity.showV985PortToggle() {
    val current = FeaturePrefsStore.batch981.v985port
    FeaturePrefsStore.batch981.v985port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v985: position mode
internal fun PlayerActivity.showV985PositionToggle() {
    val current = FeaturePrefsStore.batch981.v985position
    FeaturePrefsStore.batch981.v985position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v985: post mode
internal fun PlayerActivity.showV985PostToggle() {
    val current = FeaturePrefsStore.batch981.v985post
    FeaturePrefsStore.batch981.v985post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v985: power mode
internal fun PlayerActivity.showV985PowerToggle() {
    val current = FeaturePrefsStore.batch981.v985power
    FeaturePrefsStore.batch981.v985power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v985: pre mode
internal fun PlayerActivity.showV985PreToggle() {
    val current = FeaturePrefsStore.batch981.v985pre
    FeaturePrefsStore.batch981.v985pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v986: place mode
internal fun PlayerActivity.showV986PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v986place
    FeaturePrefsStore.batch981.v986place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v986: plain mode
internal fun PlayerActivity.showV986PlainToggle() {
    val current = FeaturePrefsStore.batch981.v986plain
    FeaturePrefsStore.batch981.v986plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v986: plan mode
internal fun PlayerActivity.showV986PlanToggle() {
    val current = FeaturePrefsStore.batch981.v986plan
    FeaturePrefsStore.batch981.v986plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v986: platform mode
internal fun PlayerActivity.showV986PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v986platform
    FeaturePrefsStore.batch981.v986platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v986: play mode
internal fun PlayerActivity.showV986PlayToggle() {
    val current = FeaturePrefsStore.batch981.v986play
    FeaturePrefsStore.batch981.v986play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v986: player level
internal fun PlayerActivity.showV986PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986player = value
        AppToast.show(this, "player: $value")
    }
}

// v986: pointer level
internal fun PlayerActivity.showV986PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v986: poll level
internal fun PlayerActivity.showV986PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v986: pool level
internal fun PlayerActivity.showV986PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v986: pop level
internal fun PlayerActivity.showV986PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v986pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v986pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v986: port mode
internal fun PlayerActivity.showV986PortToggle() {
    val current = FeaturePrefsStore.batch981.v986port
    FeaturePrefsStore.batch981.v986port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v986: position mode
internal fun PlayerActivity.showV986PositionToggle() {
    val current = FeaturePrefsStore.batch981.v986position
    FeaturePrefsStore.batch981.v986position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v986: post mode
internal fun PlayerActivity.showV986PostToggle() {
    val current = FeaturePrefsStore.batch981.v986post
    FeaturePrefsStore.batch981.v986post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v986: power mode
internal fun PlayerActivity.showV986PowerToggle() {
    val current = FeaturePrefsStore.batch981.v986power
    FeaturePrefsStore.batch981.v986power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v986: pre mode
internal fun PlayerActivity.showV986PreToggle() {
    val current = FeaturePrefsStore.batch981.v986pre
    FeaturePrefsStore.batch981.v986pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v987: place mode
internal fun PlayerActivity.showV987PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v987place
    FeaturePrefsStore.batch981.v987place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v987: plain mode
internal fun PlayerActivity.showV987PlainToggle() {
    val current = FeaturePrefsStore.batch981.v987plain
    FeaturePrefsStore.batch981.v987plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v987: plan mode
internal fun PlayerActivity.showV987PlanToggle() {
    val current = FeaturePrefsStore.batch981.v987plan
    FeaturePrefsStore.batch981.v987plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v987: platform mode
internal fun PlayerActivity.showV987PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v987platform
    FeaturePrefsStore.batch981.v987platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v987: play mode
internal fun PlayerActivity.showV987PlayToggle() {
    val current = FeaturePrefsStore.batch981.v987play
    FeaturePrefsStore.batch981.v987play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v987: player level
internal fun PlayerActivity.showV987PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987player = value
        AppToast.show(this, "player: $value")
    }
}

// v987: pointer level
internal fun PlayerActivity.showV987PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v987: poll level
internal fun PlayerActivity.showV987PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v987: pool level
internal fun PlayerActivity.showV987PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v987: pop level
internal fun PlayerActivity.showV987PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v987pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v987pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v987: port mode
internal fun PlayerActivity.showV987PortToggle() {
    val current = FeaturePrefsStore.batch981.v987port
    FeaturePrefsStore.batch981.v987port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v987: position mode
internal fun PlayerActivity.showV987PositionToggle() {
    val current = FeaturePrefsStore.batch981.v987position
    FeaturePrefsStore.batch981.v987position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v987: post mode
internal fun PlayerActivity.showV987PostToggle() {
    val current = FeaturePrefsStore.batch981.v987post
    FeaturePrefsStore.batch981.v987post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v987: power mode
internal fun PlayerActivity.showV987PowerToggle() {
    val current = FeaturePrefsStore.batch981.v987power
    FeaturePrefsStore.batch981.v987power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v987: pre mode
internal fun PlayerActivity.showV987PreToggle() {
    val current = FeaturePrefsStore.batch981.v987pre
    FeaturePrefsStore.batch981.v987pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v988: place mode
internal fun PlayerActivity.showV988PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v988place
    FeaturePrefsStore.batch981.v988place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v988: plain mode
internal fun PlayerActivity.showV988PlainToggle() {
    val current = FeaturePrefsStore.batch981.v988plain
    FeaturePrefsStore.batch981.v988plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v988: plan mode
internal fun PlayerActivity.showV988PlanToggle() {
    val current = FeaturePrefsStore.batch981.v988plan
    FeaturePrefsStore.batch981.v988plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v988: platform mode
internal fun PlayerActivity.showV988PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v988platform
    FeaturePrefsStore.batch981.v988platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v988: play mode
internal fun PlayerActivity.showV988PlayToggle() {
    val current = FeaturePrefsStore.batch981.v988play
    FeaturePrefsStore.batch981.v988play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v988: player level
internal fun PlayerActivity.showV988PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988player = value
        AppToast.show(this, "player: $value")
    }
}

// v988: pointer level
internal fun PlayerActivity.showV988PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v988: poll level
internal fun PlayerActivity.showV988PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v988: pool level
internal fun PlayerActivity.showV988PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v988: pop level
internal fun PlayerActivity.showV988PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v988pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v988pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v988: port mode
internal fun PlayerActivity.showV988PortToggle() {
    val current = FeaturePrefsStore.batch981.v988port
    FeaturePrefsStore.batch981.v988port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v988: position mode
internal fun PlayerActivity.showV988PositionToggle() {
    val current = FeaturePrefsStore.batch981.v988position
    FeaturePrefsStore.batch981.v988position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v988: post mode
internal fun PlayerActivity.showV988PostToggle() {
    val current = FeaturePrefsStore.batch981.v988post
    FeaturePrefsStore.batch981.v988post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v988: power mode
internal fun PlayerActivity.showV988PowerToggle() {
    val current = FeaturePrefsStore.batch981.v988power
    FeaturePrefsStore.batch981.v988power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v988: pre mode
internal fun PlayerActivity.showV988PreToggle() {
    val current = FeaturePrefsStore.batch981.v988pre
    FeaturePrefsStore.batch981.v988pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v989: place mode
internal fun PlayerActivity.showV989PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v989place
    FeaturePrefsStore.batch981.v989place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v989: plain mode
internal fun PlayerActivity.showV989PlainToggle() {
    val current = FeaturePrefsStore.batch981.v989plain
    FeaturePrefsStore.batch981.v989plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v989: plan mode
internal fun PlayerActivity.showV989PlanToggle() {
    val current = FeaturePrefsStore.batch981.v989plan
    FeaturePrefsStore.batch981.v989plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v989: platform mode
internal fun PlayerActivity.showV989PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v989platform
    FeaturePrefsStore.batch981.v989platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v989: play mode
internal fun PlayerActivity.showV989PlayToggle() {
    val current = FeaturePrefsStore.batch981.v989play
    FeaturePrefsStore.batch981.v989play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v989: player level
internal fun PlayerActivity.showV989PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989player = value
        AppToast.show(this, "player: $value")
    }
}

// v989: pointer level
internal fun PlayerActivity.showV989PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v989: poll level
internal fun PlayerActivity.showV989PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v989: pool level
internal fun PlayerActivity.showV989PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v989: pop level
internal fun PlayerActivity.showV989PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v989pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v989pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v989: port mode
internal fun PlayerActivity.showV989PortToggle() {
    val current = FeaturePrefsStore.batch981.v989port
    FeaturePrefsStore.batch981.v989port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v989: position mode
internal fun PlayerActivity.showV989PositionToggle() {
    val current = FeaturePrefsStore.batch981.v989position
    FeaturePrefsStore.batch981.v989position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v989: post mode
internal fun PlayerActivity.showV989PostToggle() {
    val current = FeaturePrefsStore.batch981.v989post
    FeaturePrefsStore.batch981.v989post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v989: power mode
internal fun PlayerActivity.showV989PowerToggle() {
    val current = FeaturePrefsStore.batch981.v989power
    FeaturePrefsStore.batch981.v989power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v989: pre mode
internal fun PlayerActivity.showV989PreToggle() {
    val current = FeaturePrefsStore.batch981.v989pre
    FeaturePrefsStore.batch981.v989pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v990: place mode
internal fun PlayerActivity.showV990PlaceToggle() {
    val current = FeaturePrefsStore.batch981.v990place
    FeaturePrefsStore.batch981.v990place = !current
    AppToast.show(this, "place: ${if (!current) "ON" else "OFF"}")
}

// v990: plain mode
internal fun PlayerActivity.showV990PlainToggle() {
    val current = FeaturePrefsStore.batch981.v990plain
    FeaturePrefsStore.batch981.v990plain = !current
    AppToast.show(this, "plain: ${if (!current) "ON" else "OFF"}")
}

// v990: plan mode
internal fun PlayerActivity.showV990PlanToggle() {
    val current = FeaturePrefsStore.batch981.v990plan
    FeaturePrefsStore.batch981.v990plan = !current
    AppToast.show(this, "plan: ${if (!current) "ON" else "OFF"}")
}

// v990: platform mode
internal fun PlayerActivity.showV990PlatformToggle() {
    val current = FeaturePrefsStore.batch981.v990platform
    FeaturePrefsStore.batch981.v990platform = !current
    AppToast.show(this, "platform: ${if (!current) "ON" else "OFF"}")
}

// v990: play mode
internal fun PlayerActivity.showV990PlayToggle() {
    val current = FeaturePrefsStore.batch981.v990play
    FeaturePrefsStore.batch981.v990play = !current
    AppToast.show(this, "play: ${if (!current) "ON" else "OFF"}")
}

// v990: player level
internal fun PlayerActivity.showV990PlayerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990player).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "player level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990player = value
        AppToast.show(this, "player: $value")
    }
}

// v990: pointer level
internal fun PlayerActivity.showV990PointerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990pointer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pointer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990pointer = value
        AppToast.show(this, "pointer: $value")
    }
}

// v990: poll level
internal fun PlayerActivity.showV990PollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990poll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "poll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990poll = value
        AppToast.show(this, "poll: $value")
    }
}

// v990: pool level
internal fun PlayerActivity.showV990PoolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990pool).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pool level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990pool = value
        AppToast.show(this, "pool: $value")
    }
}

// v990: pop level
internal fun PlayerActivity.showV990PopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch981.v990pop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch981.v990pop = value
        AppToast.show(this, "pop: $value")
    }
}

// v990: port mode
internal fun PlayerActivity.showV990PortToggle() {
    val current = FeaturePrefsStore.batch981.v990port
    FeaturePrefsStore.batch981.v990port = !current
    AppToast.show(this, "port: ${if (!current) "ON" else "OFF"}")
}

// v990: position mode
internal fun PlayerActivity.showV990PositionToggle() {
    val current = FeaturePrefsStore.batch981.v990position
    FeaturePrefsStore.batch981.v990position = !current
    AppToast.show(this, "position: ${if (!current) "ON" else "OFF"}")
}

// v990: post mode
internal fun PlayerActivity.showV990PostToggle() {
    val current = FeaturePrefsStore.batch981.v990post
    FeaturePrefsStore.batch981.v990post = !current
    AppToast.show(this, "post: ${if (!current) "ON" else "OFF"}")
}

// v990: power mode
internal fun PlayerActivity.showV990PowerToggle() {
    val current = FeaturePrefsStore.batch981.v990power
    FeaturePrefsStore.batch981.v990power = !current
    AppToast.show(this, "power: ${if (!current) "ON" else "OFF"}")
}

// v990: pre mode
internal fun PlayerActivity.showV990PreToggle() {
    val current = FeaturePrefsStore.batch981.v990pre
    FeaturePrefsStore.batch981.v990pre = !current
    AppToast.show(this, "pre: ${if (!current) "ON" else "OFF"}")
}

// v116.84: Volume Fade Duration Custom
internal fun PlayerActivity.showV116VolumeFadeDurationCustomDialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v116volumeFadeDurationCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Fade Duration Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116volumeFadeDurationCustom = value
        AppToast.show(this, "Volume Fade Duration Custom: $value")
    }
}

// v116.85: History Search Scope Custom
internal fun PlayerActivity.showV116HistorySearchScopeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116historySearchScopeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116historySearchScopeCustom = value
        AppToast.show(this, "History Search Scope Custom: $value")
    }
}

// v116.86: Playback Speed Auto Adjust Max
internal fun PlayerActivity.showV116PlaybackSpeedAutoAdjustMaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116playbackSpeedAutoAdjustMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Auto Adjust Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116playbackSpeedAutoAdjustMax = value
        AppToast.show(this, "Playback Speed Auto Adjust Max: $value")
    }
}

// v116.87: Screenshot Auto Share WhatsApp
internal fun PlayerActivity.showV116ScreenshotAutoShareWhatsAppToggle() {
    val enabled = !BiliClient.prefs.v116screenshotAutoShareWhatsApp
    BiliClient.prefs.v116screenshotAutoShareWhatsApp = enabled
    AppToast.show(this, "Screenshot Auto Share WhatsApp: ${if (enabled) "ON" else "OFF"}")
}

// v116.88: Video PIP Mode Custom
internal fun PlayerActivity.showV116VideoPIPModeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116videoPIPModeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Mode Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116videoPIPModeCustom = value
        AppToast.show(this, "Video PIP Mode Custom: $value")
    }
}

// v116.89: Danmaku Font BG Border Radius115
internal fun PlayerActivity.showV116DanmakuFontBgBorderRadius115Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v116danmakuFontBgBorderRadius115).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Radius115",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116danmakuFontBgBorderRadius115 = value
        AppToast.show(this, "Danmaku Font BG Border Radius115: $value")
    }
}

// v116.90: Subtitle Animation Type116
internal fun PlayerActivity.showV116SubtitleAnimationType116Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v116subtitleAnimationType116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v116subtitleAnimationType116 = value
        AppToast.show(this, "Subtitle Animation Type116: $value")
    }
}

// v117.91: Audio Dynamic EQ Toggle117
internal fun PlayerActivity.showV117AudioDynamicEQToggle117Toggle() {
    val enabled = !BiliClient.prefs.v117audioDynamicEQToggle117
    BiliClient.prefs.v117audioDynamicEQToggle117 = enabled
    AppToast.show(this, "Audio Dynamic EQ Toggle117: ${if (enabled) "ON" else "OFF"}")
}

// v117.92: Danmaku Font BG Border Radius116
internal fun PlayerActivity.showV117DanmakuFontBgBorderRadius116Dialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v117danmakuFontBgBorderRadius116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Radius116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117danmakuFontBgBorderRadius116 = value
        AppToast.show(this, "Danmaku Font BG Border Radius116: $value")
    }
}

// v117.93: Subtitle Animation Duration117
internal fun PlayerActivity.showV117SubtitleAnimationDuration117Dialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v117subtitleAnimationDuration117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117subtitleAnimationDuration117 = value
        AppToast.show(this, "Subtitle Animation Duration117: $value")
    }
}

// v117.94: Gesture Tap Quadruple Action
internal fun PlayerActivity.showV117GestureTapQuadrupleActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v117gestureTapQuadrupleAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Quadruple Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117gestureTapQuadrupleAction = value
        AppToast.show(this, "Gesture Tap Quadruple Action: $value")
    }
}

// v117.95: Cast Video Negative Custom
internal fun PlayerActivity.showV117CastVideoNegativeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v117castVideoNegativeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Negative Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117castVideoNegativeCustom = value
        AppToast.show(this, "Cast Video Negative Custom: $value")
    }
}

// v117.96: Playlist Auto Skip On Low Battery
internal fun PlayerActivity.showV117PlaylistAutoSkipOnLowBatteryToggle() {
    val enabled = !BiliClient.prefs.v117playlistAutoSkipOnLowBattery
    BiliClient.prefs.v117playlistAutoSkipOnLowBattery = enabled
    AppToast.show(this, "Playlist Auto Skip On Low Battery: ${if (enabled) "ON" else "OFF"}")
}

// v117.97: Cache Preload On Wifi Toggle
internal fun PlayerActivity.showV117CachePreloadOnWifiToggleToggle() {
    val enabled = !BiliClient.prefs.v117cachePreloadOnWifiToggle
    BiliClient.prefs.v117cachePreloadOnWifiToggle = enabled
    AppToast.show(this, "Cache Preload On Wifi Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v117.98: Progress Bar Custom Live Edge Opacity
internal fun PlayerActivity.showV117ProgressBarCustomLiveEdgeOpacityDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v117progressBarCustomLiveEdgeOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Edge Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117progressBarCustomLiveEdgeOpacity = value
        AppToast.show(this, "Progress Bar Custom Live Edge Opacity: $value")
    }
}

// v117.99: Volume Smooth Fade Toggle
internal fun PlayerActivity.showV117VolumeSmoothFadeToggleToggle() {
    val enabled = !BiliClient.prefs.v117volumeSmoothFadeToggle
    BiliClient.prefs.v117volumeSmoothFadeToggle = enabled
    AppToast.show(this, "Volume Smooth Fade Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v117.100: History Search Regex Toggle
internal fun PlayerActivity.showV117HistorySearchRegexToggleToggle() {
    val enabled = !BiliClient.prefs.v117historySearchRegexToggle
    BiliClient.prefs.v117historySearchRegexToggle = enabled
    AppToast.show(this, "History Search Regex Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v117.101: Playback Speed Auto Adjust Active
internal fun PlayerActivity.showV117PlaybackSpeedAutoAdjustActiveToggle() {
    val enabled = !BiliClient.prefs.v117playbackSpeedAutoAdjustActive
    BiliClient.prefs.v117playbackSpeedAutoAdjustActive = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Active: ${if (enabled) "ON" else "OFF"}")
}

// v117.102: Screenshot Auto Share Telegram
internal fun PlayerActivity.showV117ScreenshotAutoShareTelegramToggle() {
    val enabled = !BiliClient.prefs.v117screenshotAutoShareTelegram
    BiliClient.prefs.v117screenshotAutoShareTelegram = enabled
    AppToast.show(this, "Screenshot Auto Share Telegram: ${if (enabled) "ON" else "OFF"}")
}

// v117.103: Video PIP Size Custom
internal fun PlayerActivity.showV117VideoPIPSizeCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v117videoPIPSizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Size Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117videoPIPSizeCustom = value
        AppToast.show(this, "Video PIP Size Custom: $value")
    }
}

// v117.104: Danmaku Font BG Border Opacity116
internal fun PlayerActivity.showV117DanmakuFontBgBorderOpacity116Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v117danmakuFontBgBorderOpacity116).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Opacity116",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117danmakuFontBgBorderOpacity116 = value
        AppToast.show(this, "Danmaku Font BG Border Opacity116: $value")
    }
}

// v117.105: Subtitle Animation Speed117
internal fun PlayerActivity.showV117SubtitleAnimationSpeed117Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v117subtitleAnimationSpeed117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v117subtitleAnimationSpeed117 = value
        AppToast.show(this, "Subtitle Animation Speed117: $value")
    }
}

// v118.106: Audio Dynamic Range Expand
internal fun PlayerActivity.showV118AudioDynamicRangeExpandDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v118audioDynamicRangeExpand).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Range Expand",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118audioDynamicRangeExpand = value
        AppToast.show(this, "Audio Dynamic Range Expand: $value")
    }
}

// v118.107: Danmaku Font BG Border Opacity117
internal fun PlayerActivity.showV118DanmakuFontBgBorderOpacity117Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v118danmakuFontBgBorderOpacity117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Border Opacity117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118danmakuFontBgBorderOpacity117 = value
        AppToast.show(this, "Danmaku Font BG Border Opacity117: $value")
    }
}

// v118.108: Subtitle Animation Speed118
internal fun PlayerActivity.showV118SubtitleAnimationSpeed118Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v118subtitleAnimationSpeed118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118subtitleAnimationSpeed118 = value
        AppToast.show(this, "Subtitle Animation Speed118: $value")
    }
}

// v118.109: Gesture Tap Hold Action
internal fun PlayerActivity.showV118GestureTapHoldActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118gestureTapHoldAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Hold Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118gestureTapHoldAction = value
        AppToast.show(this, "Gesture Tap Hold Action: $value")
    }
}

// v118.110: Cast Video Posterize Custom
internal fun PlayerActivity.showV118CastVideoPosterizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v118castVideoPosterizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Posterize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118castVideoPosterizeCustom = value
        AppToast.show(this, "Cast Video Posterize Custom: $value")
    }
}

// v118.111: Playlist Auto Load Metadata
internal fun PlayerActivity.showV118PlaylistAutoLoadMetadataToggle() {
    val enabled = !BiliClient.prefs.v118playlistAutoLoadMetadata
    BiliClient.prefs.v118playlistAutoLoadMetadata = enabled
    AppToast.show(this, "Playlist Auto Load Metadata: ${if (enabled) "ON" else "OFF"}")
}

// v118.112: Cache Smart Eviction Toggle
internal fun PlayerActivity.showV118CacheSmartEvictionToggleToggle() {
    val enabled = !BiliClient.prefs.v118cacheSmartEvictionToggle
    BiliClient.prefs.v118cacheSmartEvictionToggle = enabled
    AppToast.show(this, "Cache Smart Eviction Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v118.113: Progress Bar Custom Scale Type
internal fun PlayerActivity.showV118ProgressBarCustomScaleTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118progressBarCustomScaleType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118progressBarCustomScaleType = value
        AppToast.show(this, "Progress Bar Custom Scale Type: $value")
    }
}

// v118.114: Volume Spatial Audio Mode
internal fun PlayerActivity.showV118VolumeSpatialAudioModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118volumeSpatialAudioMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Audio Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118volumeSpatialAudioMode = value
        AppToast.show(this, "Volume Spatial Audio Mode: $value")
    }
}

// v118.115: History Search Fuzzy Match
internal fun PlayerActivity.showV118HistorySearchFuzzyMatchToggle() {
    val enabled = !BiliClient.prefs.v118historySearchFuzzyMatch
    BiliClient.prefs.v118historySearchFuzzyMatch = enabled
    AppToast.show(this, "History Search Fuzzy Match: ${if (enabled) "ON" else "OFF"}")
}

// v118.116: Playback Speed Auto Adjust Buffer
internal fun PlayerActivity.showV118PlaybackSpeedAutoAdjustBufferToggle() {
    val enabled = !BiliClient.prefs.v118playbackSpeedAutoAdjustBuffer
    BiliClient.prefs.v118playbackSpeedAutoAdjustBuffer = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Buffer: ${if (enabled) "ON" else "OFF"}")
}

// v118.117: Screenshot Auto Share Discord
internal fun PlayerActivity.showV118ScreenshotAutoShareDiscordToggle() {
    val enabled = !BiliClient.prefs.v118screenshotAutoShareDiscord
    BiliClient.prefs.v118screenshotAutoShareDiscord = enabled
    AppToast.show(this, "Screenshot Auto Share Discord: ${if (enabled) "ON" else "OFF"}")
}

// v118.118: Video PIP Position Custom
internal fun PlayerActivity.showV118VideoPIPPositionCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118videoPIPPositionCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Position Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118videoPIPPositionCustom = value
        AppToast.show(this, "Video PIP Position Custom: $value")
    }
}

// v118.119: Danmaku Font BG Fill Mode117
internal fun PlayerActivity.showV118DanmakuFontBgFillMode117Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118danmakuFontBgFillMode117).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mode117",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118danmakuFontBgFillMode117 = value
        AppToast.show(this, "Danmaku Font BG Fill Mode117: $value")
    }
}

// v118.120: Subtitle Animation Easing118
internal fun PlayerActivity.showV118SubtitleAnimationEasing118Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v118subtitleAnimationEasing118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v118subtitleAnimationEasing118 = value
        AppToast.show(this, "Subtitle Animation Easing118: $value")
    }
}

// v119.121: Audio Dynamic Stereo Width
internal fun PlayerActivity.showV119AudioDynamicStereoWidthDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v119audioDynamicStereoWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Dynamic Stereo Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119audioDynamicStereoWidth = value
        AppToast.show(this, "Audio Dynamic Stereo Width: $value")
    }
}

// v119.122: Danmaku Font BG Fill Mode118
internal fun PlayerActivity.showV119DanmakuFontBgFillMode118Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119danmakuFontBgFillMode118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Mode118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119danmakuFontBgFillMode118 = value
        AppToast.show(this, "Danmaku Font BG Fill Mode118: $value")
    }
}

// v119.123: Subtitle Animation Easing119
internal fun PlayerActivity.showV119SubtitleAnimationEasing119Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119subtitleAnimationEasing119).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing119",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119subtitleAnimationEasing119 = value
        AppToast.show(this, "Subtitle Animation Easing119: $value")
    }
}

// v119.124: Gesture Tap Release Action
internal fun PlayerActivity.showV119GestureTapReleaseActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119gestureTapReleaseAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Release Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119gestureTapReleaseAction = value
        AppToast.show(this, "Gesture Tap Release Action: $value")
    }
}

// v119.125: Cast Video Solarize Custom
internal fun PlayerActivity.showV119CastVideoSolarizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v119castVideoSolarizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Solarize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119castVideoSolarizeCustom = value
        AppToast.show(this, "Cast Video Solarize Custom: $value")
    }
}

// v119.126: Playlist Auto Save Position
internal fun PlayerActivity.showV119PlaylistAutoSavePositionToggle() {
    val enabled = !BiliClient.prefs.v119playlistAutoSavePosition
    BiliClient.prefs.v119playlistAutoSavePosition = enabled
    AppToast.show(this, "Playlist Auto Save Position: ${if (enabled) "ON" else "OFF"}")
}

// v119.127: Cache Verify Integrity Toggle
internal fun PlayerActivity.showV119CacheVerifyIntegrityToggleToggle() {
    val enabled = !BiliClient.prefs.v119cacheVerifyIntegrityToggle
    BiliClient.prefs.v119cacheVerifyIntegrityToggle = enabled
    AppToast.show(this, "Cache Verify Integrity Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v119.128: Progress Bar Custom Scale Min
internal fun PlayerActivity.showV119ProgressBarCustomScaleMinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119progressBarCustomScaleMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119progressBarCustomScaleMin = value
        AppToast.show(this, "Progress Bar Custom Scale Min: $value")
    }
}

// v119.129: Volume Stereo Pan Custom
internal fun PlayerActivity.showV119VolumeStereoPanCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119volumeStereoPanCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Stereo Pan Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119volumeStereoPanCustom = value
        AppToast.show(this, "Volume Stereo Pan Custom: $value")
    }
}

// v119.130: History Search Match Case
internal fun PlayerActivity.showV119HistorySearchMatchCaseToggle() {
    val enabled = !BiliClient.prefs.v119historySearchMatchCase
    BiliClient.prefs.v119historySearchMatchCase = enabled
    AppToast.show(this, "History Search Match Case: ${if (enabled) "ON" else "OFF"}")
}

// v119.131: Playback Speed Auto Adjust Network
internal fun PlayerActivity.showV119PlaybackSpeedAutoAdjustNetworkToggle() {
    val enabled = !BiliClient.prefs.v119playbackSpeedAutoAdjustNetwork
    BiliClient.prefs.v119playbackSpeedAutoAdjustNetwork = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Network: ${if (enabled) "ON" else "OFF"}")
}

// v119.132: Screenshot Auto Share Line
internal fun PlayerActivity.showV119ScreenshotAutoShareLineToggle() {
    val enabled = !BiliClient.prefs.v119screenshotAutoShareLine
    BiliClient.prefs.v119screenshotAutoShareLine = enabled
    AppToast.show(this, "Screenshot Auto Share Line: ${if (enabled) "ON" else "OFF"}")
}

// v119.133: Video PIP Corner Radius
internal fun PlayerActivity.showV119VideoPIPCornerRadiusDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v119videoPIPCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Corner Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119videoPIPCornerRadius = value
        AppToast.show(this, "Video PIP Corner Radius: $value")
    }
}

// v119.134: Danmaku Font BG Fill Opacity118
internal fun PlayerActivity.showV119DanmakuFontBgFillOpacity118Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v119danmakuFontBgFillOpacity118).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity118",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v119danmakuFontBgFillOpacity118 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity118: $value")
    }
}

// v119.135: Subtitle Animation Loop119
internal fun PlayerActivity.showV119SubtitleAnimationLoop119Toggle() {
    val enabled = !BiliClient.prefs.v119subtitleAnimationLoop119
    BiliClient.prefs.v119subtitleAnimationLoop119 = enabled
    AppToast.show(this, "Subtitle Animation Loop119: ${if (enabled) "ON" else "OFF"}")
}

// v120.136: Audio Dynamic Mono Fold
internal fun PlayerActivity.showV120AudioDynamicMonoFoldToggle() {
    val enabled = !BiliClient.prefs.v120audioDynamicMonoFold
    BiliClient.prefs.v120audioDynamicMonoFold = enabled
    AppToast.show(this, "Audio Dynamic Mono Fold: ${if (enabled) "ON" else "OFF"}")
}

// v120.137: Danmaku Font BG Fill Opacity119
internal fun PlayerActivity.showV120DanmakuFontBgFillOpacity119Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v120danmakuFontBgFillOpacity119).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity119",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120danmakuFontBgFillOpacity119 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity119: $value")
    }
}

// v120.138: Subtitle Animation Loop120
internal fun PlayerActivity.showV120SubtitleAnimationLoop120Toggle() {
    val enabled = !BiliClient.prefs.v120subtitleAnimationLoop120
    BiliClient.prefs.v120subtitleAnimationLoop120 = enabled
    AppToast.show(this, "Subtitle Animation Loop120: ${if (enabled) "ON" else "OFF"}")
}

// v120.139: Gesture Tap Custom Action
internal fun PlayerActivity.showV120GestureTapCustomActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v120gestureTapCustomAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Custom Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120gestureTapCustomAction = value
        AppToast.show(this, "Gesture Tap Custom Action: $value")
    }
}

// v120.140: Cast Video Duotone Custom
internal fun PlayerActivity.showV120CastVideoDuotoneCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v120castVideoDuotoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Duotone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120castVideoDuotoneCustom = value
        AppToast.show(this, "Cast Video Duotone Custom: $value")
    }
}

// v120.141: Playlist Auto Save Position Toggle
internal fun PlayerActivity.showV120PlaylistAutoSavePositionToggleToggle() {
    val enabled = !BiliClient.prefs.v120playlistAutoSavePositionToggle
    BiliClient.prefs.v120playlistAutoSavePositionToggle = enabled
    AppToast.show(this, "Playlist Auto Save Position Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v120.142: Cache Verify Integrity On Start
internal fun PlayerActivity.showV120CacheVerifyIntegrityOnStartToggle() {
    val enabled = !BiliClient.prefs.v120cacheVerifyIntegrityOnStart
    BiliClient.prefs.v120cacheVerifyIntegrityOnStart = enabled
    AppToast.show(this, "Cache Verify Integrity On Start: ${if (enabled) "ON" else "OFF"}")
}

// v120.143: Progress Bar Custom Scale Max
internal fun PlayerActivity.showV120ProgressBarCustomScaleMaxDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v120progressBarCustomScaleMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Scale Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120progressBarCustomScaleMax = value
        AppToast.show(this, "Progress Bar Custom Scale Max: $value")
    }
}

// v120.144: Volume Stereo Width Custom
internal fun PlayerActivity.showV120VolumeStereoWidthCustomDialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v120volumeStereoWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Stereo Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120volumeStereoWidthCustom = value
        AppToast.show(this, "Volume Stereo Width Custom: $value")
    }
}

// v120.145: History Search Whole Word
internal fun PlayerActivity.showV120HistorySearchWholeWordToggle() {
    val enabled = !BiliClient.prefs.v120historySearchWholeWord
    BiliClient.prefs.v120historySearchWholeWord = enabled
    AppToast.show(this, "History Search Whole Word: ${if (enabled) "ON" else "OFF"}")
}

// v120.146: Playback Speed Auto Adjust Quality
internal fun PlayerActivity.showV120PlaybackSpeedAutoAdjustQualityToggle() {
    val enabled = !BiliClient.prefs.v120playbackSpeedAutoAdjustQuality
    BiliClient.prefs.v120playbackSpeedAutoAdjustQuality = enabled
    AppToast.show(this, "Playback Speed Auto Adjust Quality: ${if (enabled) "ON" else "OFF"}")
}

// v120.147: Screenshot Auto Share KakaoTalk
internal fun PlayerActivity.showV120ScreenshotAutoShareKakaoTalkToggle() {
    val enabled = !BiliClient.prefs.v120screenshotAutoShareKakaoTalk
    BiliClient.prefs.v120screenshotAutoShareKakaoTalk = enabled
    AppToast.show(this, "Screenshot Auto Share KakaoTalk: ${if (enabled) "ON" else "OFF"}")
}

// v120.148: Video PIP Opacity Custom
internal fun PlayerActivity.showV120VideoPIPOpacityCustomDialog() {
    val options = listOf(50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v120videoPIPOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120videoPIPOpacityCustom = value
        AppToast.show(this, "Video PIP Opacity Custom: $value")
    }
}

// v120.149: Danmaku Font BG Fill Angle119
internal fun PlayerActivity.showV120DanmakuFontBgFillAngle119Dialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v120danmakuFontBgFillAngle119).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Angle119",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120danmakuFontBgFillAngle119 = value
        AppToast.show(this, "Danmaku Font BG Fill Angle119: $value")
    }
}

// v120.150: Subtitle Animation Delay120
internal fun PlayerActivity.showV120SubtitleAnimationDelay120Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v120subtitleAnimationDelay120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v120subtitleAnimationDelay120 = value
        AppToast.show(this, "Subtitle Animation Delay120: $value")
    }
}

// v121.1: Audio Ducking Ratio Custom
internal fun PlayerActivity.showV121AudioDuckingRatioCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121audioDuckingRatioCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Ducking Ratio Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121audioDuckingRatioCustom = value
        AppToast.show(this, "Audio Ducking Ratio Custom: $value")
    }
}

// v121.2: Danmaku Font BG Fill Angle120
internal fun PlayerActivity.showV121DanmakuFontBgFillAngle120Dialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v121danmakuFontBgFillAngle120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Angle120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121danmakuFontBgFillAngle120 = value
        AppToast.show(this, "Danmaku Font BG Fill Angle120: $value")
    }
}

// v121.3: Subtitle Animation Delay121
internal fun PlayerActivity.showV121SubtitleAnimationDelay121Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v121subtitleAnimationDelay121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121subtitleAnimationDelay121 = value
        AppToast.show(this, "Subtitle Animation Delay121: $value")
    }
}

// v121.4: Gesture Tap Shift Action
internal fun PlayerActivity.showV121GestureTapShiftActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121gestureTapShiftAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121gestureTapShiftAction = value
        AppToast.show(this, "Gesture Tap Shift Action: $value")
    }
}

// v121.5: Cast Video Flip Horizontal
internal fun PlayerActivity.showV121CastVideoFlipHorizontalToggle() {
    val enabled = !BiliClient.prefs.v121castVideoFlipHorizontal
    BiliClient.prefs.v121castVideoFlipHorizontal = enabled
    AppToast.show(this, "Cast Video Flip Horizontal: ${if (enabled) "ON" else "OFF"}")
}

// v121.6: Playlist Auto Resume Queue
internal fun PlayerActivity.showV121PlaylistAutoResumeQueueToggle() {
    val enabled = !BiliClient.prefs.v121playlistAutoResumeQueue
    BiliClient.prefs.v121playlistAutoResumeQueue = enabled
    AppToast.show(this, "Playlist Auto Resume Queue: ${if (enabled) "ON" else "OFF"}")
}

// v121.7: Cache Smart Pinning Toggle
internal fun PlayerActivity.showV121CacheSmartPinningToggleToggle() {
    val enabled = !BiliClient.prefs.v121cacheSmartPinningToggle
    BiliClient.prefs.v121cacheSmartPinningToggle = enabled
    AppToast.show(this, "Cache Smart Pinning Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v121.8: Progress Bar Custom Live Color
internal fun PlayerActivity.showV121ProgressBarCustomLiveColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121progressBarCustomLiveColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121progressBarCustomLiveColor = value
        AppToast.show(this, "Progress Bar Custom Live Color: $value")
    }
}

// v121.9: Volume Mono Downmix Toggle
internal fun PlayerActivity.showV121VolumeMonoDownmixToggleToggle() {
    val enabled = !BiliClient.prefs.v121volumeMonoDownmixToggle
    BiliClient.prefs.v121volumeMonoDownmixToggle = enabled
    AppToast.show(this, "Volume Mono Downmix Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v121.10: History Search Scope121
internal fun PlayerActivity.showV121HistorySearchScope121Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121historySearchScope121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121historySearchScope121 = value
        AppToast.show(this, "History Search Scope121: $value")
    }
}

// v121.11: Playback Speed Presets Custom
internal fun PlayerActivity.showV121PlaybackSpeedPresetsCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121playbackSpeedPresetsCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121playbackSpeedPresetsCustom = value
        AppToast.show(this, "Playback Speed Presets Custom: $value")
    }
}

// v121.12: Screenshot Auto Share QQ
internal fun PlayerActivity.showV121ScreenshotAutoShareQQToggle() {
    val enabled = !BiliClient.prefs.v121screenshotAutoShareQQ
    BiliClient.prefs.v121screenshotAutoShareQQ = enabled
    AppToast.show(this, "Screenshot Auto Share QQ: ${if (enabled) "ON" else "OFF"}")
}

// v121.13: Video PIP Swipe Dismiss
internal fun PlayerActivity.showV121VideoPIPSwipeDismissToggle() {
    val enabled = !BiliClient.prefs.v121videoPIPSwipeDismiss
    BiliClient.prefs.v121videoPIPSwipeDismiss = enabled
    AppToast.show(this, "Video PIP Swipe Dismiss: ${if (enabled) "ON" else "OFF"}")
}

// v121.14: Danmaku Font BG Fill Start Color
internal fun PlayerActivity.showV121DanmakuFontBgFillStartColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v121danmakuFontBgFillStartColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Start Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121danmakuFontBgFillStartColor = value
        AppToast.show(this, "Danmaku Font BG Fill Start Color: $value")
    }
}

// v121.15: Subtitle Animation Fade In121
internal fun PlayerActivity.showV121SubtitleAnimationFadeIn121Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v121subtitleAnimationFadeIn121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v121subtitleAnimationFadeIn121 = value
        AppToast.show(this, "Subtitle Animation Fade In121: $value")
    }
}

// v122.16: Audio Fade In Duration122
internal fun PlayerActivity.showV122AudioFadeInDuration122Dialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v122audioFadeInDuration122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Fade In Duration122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122audioFadeInDuration122 = value
        AppToast.show(this, "Audio Fade In Duration122: $value")
    }
}

// v122.17: Danmaku Font BG Fill End Color
internal fun PlayerActivity.showV122DanmakuFontBgFillEndColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122danmakuFontBgFillEndColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill End Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122danmakuFontBgFillEndColor = value
        AppToast.show(this, "Danmaku Font BG Fill End Color: $value")
    }
}

// v122.18: Subtitle Animation Fade Out122
internal fun PlayerActivity.showV122SubtitleAnimationFadeOut122Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v122subtitleAnimationFadeOut122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122subtitleAnimationFadeOut122 = value
        AppToast.show(this, "Subtitle Animation Fade Out122: $value")
    }
}

// v122.19: Gesture Tap Ctrl Action
internal fun PlayerActivity.showV122GestureTapCtrlActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122gestureTapCtrlAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Ctrl Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122gestureTapCtrlAction = value
        AppToast.show(this, "Gesture Tap Ctrl Action: $value")
    }
}

// v122.20: Cast Video Flip Vertical
internal fun PlayerActivity.showV122CastVideoFlipVerticalToggle() {
    val enabled = !BiliClient.prefs.v122castVideoFlipVertical
    BiliClient.prefs.v122castVideoFlipVertical = enabled
    AppToast.show(this, "Cast Video Flip Vertical: ${if (enabled) "ON" else "OFF"}")
}

// v122.21: Playlist Auto Resume Last Position
internal fun PlayerActivity.showV122PlaylistAutoResumeLastPositionToggle() {
    val enabled = !BiliClient.prefs.v122playlistAutoResumeLastPosition
    BiliClient.prefs.v122playlistAutoResumeLastPosition = enabled
    AppToast.show(this, "Playlist Auto Resume Last Position: ${if (enabled) "ON" else "OFF"}")
}

// v122.22: Cache Smart Pinning Max Size
internal fun PlayerActivity.showV122CacheSmartPinningMaxSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122cacheSmartPinningMaxSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Max Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122cacheSmartPinningMaxSize = value
        AppToast.show(this, "Cache Smart Pinning Max Size: $value")
    }
}

// v122.23: Progress Bar Custom Live Width
internal fun PlayerActivity.showV122ProgressBarCustomLiveWidthDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v122progressBarCustomLiveWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122progressBarCustomLiveWidth = value
        AppToast.show(this, "Progress Bar Custom Live Width: $value")
    }
}

// v122.24: Volume Mono Downmix Balance
internal fun PlayerActivity.showV122VolumeMonoDownmixBalanceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v122volumeMonoDownmixBalance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Mono Downmix Balance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122volumeMonoDownmixBalance = value
        AppToast.show(this, "Volume Mono Downmix Balance: $value")
    }
}

// v122.25: History Search Scope122
internal fun PlayerActivity.showV122HistorySearchScope122Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122historySearchScope122).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Search Scope122",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122historySearchScope122 = value
        AppToast.show(this, "History Search Scope122: $value")
    }
}

// v122.26: Playback Speed Presets List
internal fun PlayerActivity.showV122PlaybackSpeedPresetsListDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v122playbackSpeedPresetsList).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets List",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122playbackSpeedPresetsList = value
        AppToast.show(this, "Playback Speed Presets List: $value")
    }
}

// v122.27: Screenshot Auto Share WeChat
internal fun PlayerActivity.showV122ScreenshotAutoShareWeChatToggle() {
    val enabled = !BiliClient.prefs.v122screenshotAutoShareWeChat
    BiliClient.prefs.v122screenshotAutoShareWeChat = enabled
    AppToast.show(this, "Screenshot Auto Share WeChat: ${if (enabled) "ON" else "OFF"}")
}

// v122.28: Video PIP Always On Top
internal fun PlayerActivity.showV122VideoPIPAlwaysOnTopToggle() {
    val enabled = !BiliClient.prefs.v122videoPIPAlwaysOnTop
    BiliClient.prefs.v122videoPIPAlwaysOnTop = enabled
    AppToast.show(this, "Video PIP Always On Top: ${if (enabled) "ON" else "OFF"}")
}

// v122.29: Danmaku Font BG Fill Radius
internal fun PlayerActivity.showV122DanmakuFontBgFillRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v122danmakuFontBgFillRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122danmakuFontBgFillRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Radius: $value")
    }
}

// v122.30: Subtitle Animation Fade Out121
internal fun PlayerActivity.showV122SubtitleAnimationFadeOut121Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v122subtitleAnimationFadeOut121).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out121",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v122subtitleAnimationFadeOut121 = value
        AppToast.show(this, "Subtitle Animation Fade Out121: $value")
    }
}

// v123.31: Audio Fade Out Duration123
internal fun PlayerActivity.showV123AudioFadeOutDuration123Dialog() {
    val options = listOf(100, 200, 300, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v123audioFadeOutDuration123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Fade Out Duration123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123audioFadeOutDuration123 = value
        AppToast.show(this, "Audio Fade Out Duration123: $value")
    }
}

// v123.32: Danmaku Font BG Fill Opacity120
internal fun PlayerActivity.showV123DanmakuFontBgFillOpacity120Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v123danmakuFontBgFillOpacity120).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Opacity120",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123danmakuFontBgFillOpacity120 = value
        AppToast.show(this, "Danmaku Font BG Fill Opacity120: $value")
    }
}

// v123.33: Subtitle Animation Fade In123
internal fun PlayerActivity.showV123SubtitleAnimationFadeIn123Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v123subtitleAnimationFadeIn123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade In123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123subtitleAnimationFadeIn123 = value
        AppToast.show(this, "Subtitle Animation Fade In123: $value")
    }
}

// v123.34: Gesture Tap Alt Action
internal fun PlayerActivity.showV123GestureTapAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123gestureTapAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123gestureTapAltAction = value
        AppToast.show(this, "Gesture Tap Alt Action: $value")
    }
}

// v123.35: Cast Video Rotate Custom
internal fun PlayerActivity.showV123CastVideoRotateCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123castVideoRotateCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Rotate Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123castVideoRotateCustom = value
        AppToast.show(this, "Cast Video Rotate Custom: $value")
    }
}

// v123.36: Playlist Auto Sort By Length
internal fun PlayerActivity.showV123PlaylistAutoSortByLengthToggle() {
    val enabled = !BiliClient.prefs.v123playlistAutoSortByLength
    BiliClient.prefs.v123playlistAutoSortByLength = enabled
    AppToast.show(this, "Playlist Auto Sort By Length: ${if (enabled) "ON" else "OFF"}")
}

// v123.37: Cache Smart Pinning Expire
internal fun PlayerActivity.showV123CacheSmartPinningExpireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123cacheSmartPinningExpire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Expire",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123cacheSmartPinningExpire = value
        AppToast.show(this, "Cache Smart Pinning Expire: $value")
    }
}

// v123.38: Progress Bar Custom Live Height
internal fun PlayerActivity.showV123ProgressBarCustomLiveHeightDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v123progressBarCustomLiveHeight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Live Height",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123progressBarCustomLiveHeight = value
        AppToast.show(this, "Progress Bar Custom Live Height: $value")
    }
}

// v123.39: Volume Headroom Custom
internal fun PlayerActivity.showV123VolumeHeadroomCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123volumeHeadroomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Headroom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123volumeHeadroomCustom = value
        AppToast.show(this, "Volume Headroom Custom: $value")
    }
}

// v123.40: History Auto Clean123
internal fun PlayerActivity.showV123HistoryAutoClean123Toggle() {
    val enabled = !BiliClient.prefs.v123historyAutoClean123
    BiliClient.prefs.v123historyAutoClean123 = enabled
    AppToast.show(this, "History Auto Clean123: ${if (enabled) "ON" else "OFF"}")
}

// v123.41: Playback Speed Presets Custom123
internal fun PlayerActivity.showV123PlaybackSpeedPresetsCustom123Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v123playbackSpeedPresetsCustom123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Custom123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123playbackSpeedPresetsCustom123 = value
        AppToast.show(this, "Playback Speed Presets Custom123: $value")
    }
}

// v123.42: Screenshot Auto Share Douyin
internal fun PlayerActivity.showV123ScreenshotAutoShareDouyinToggle() {
    val enabled = !BiliClient.prefs.v123screenshotAutoShareDouyin
    BiliClient.prefs.v123screenshotAutoShareDouyin = enabled
    AppToast.show(this, "Screenshot Auto Share Douyin: ${if (enabled) "ON" else "OFF"}")
}

// v123.43: Video PIP Resize Handle
internal fun PlayerActivity.showV123VideoPIPResizeHandleToggle() {
    val enabled = !BiliClient.prefs.v123videoPIPResizeHandle
    BiliClient.prefs.v123videoPIPResizeHandle = enabled
    AppToast.show(this, "Video PIP Resize Handle: ${if (enabled) "ON" else "OFF"}")
}

// v123.44: Danmaku Font BG Fill Border Toggle
internal fun PlayerActivity.showV123DanmakuFontBgFillBorderToggleToggle() {
    val enabled = !BiliClient.prefs.v123danmakuFontBgFillBorderToggle
    BiliClient.prefs.v123danmakuFontBgFillBorderToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Border Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v123.45: Subtitle Animation Fade Out123
internal fun PlayerActivity.showV123SubtitleAnimationFadeOut123Dialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v123subtitleAnimationFadeOut123).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Out123",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v123subtitleAnimationFadeOut123 = value
        AppToast.show(this, "Subtitle Animation Fade Out123: $value")
    }
}

// v124.46: Audio Reverb Preset Custom
internal fun PlayerActivity.showV124AudioReverbPresetCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124audioReverbPresetCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Preset Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124audioReverbPresetCustom = value
        AppToast.show(this, "Audio Reverb Preset Custom: $value")
    }
}

// v124.47: Danmaku Font BG Fill Border Width
internal fun PlayerActivity.showV124DanmakuFontBgFillBorderWidthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124danmakuFontBgFillBorderWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124danmakuFontBgFillBorderWidth = value
        AppToast.show(this, "Danmaku Font BG Fill Border Width: $value")
    }
}

// v124.48: Subtitle Animation Scale124
internal fun PlayerActivity.showV124SubtitleAnimationScale124Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v124subtitleAnimationScale124).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale124",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124subtitleAnimationScale124 = value
        AppToast.show(this, "Subtitle Animation Scale124: $value")
    }
}

// v124.49: Gesture Tap Shift Ctrl Action
internal fun PlayerActivity.showV124GestureTapShiftCtrlActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124gestureTapShiftCtrlAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Ctrl Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124gestureTapShiftCtrlAction = value
        AppToast.show(this, "Gesture Tap Shift Ctrl Action: $value")
    }
}

// v124.50: Cast Video Crop Custom
internal fun PlayerActivity.showV124CastVideoCropCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124castVideoCropCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Crop Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124castVideoCropCustom = value
        AppToast.show(this, "Cast Video Crop Custom: $value")
    }
}

// v124.51: Playlist Auto Sort By Title
internal fun PlayerActivity.showV124PlaylistAutoSortByTitleToggle() {
    val enabled = !BiliClient.prefs.v124playlistAutoSortByTitle
    BiliClient.prefs.v124playlistAutoSortByTitle = enabled
    AppToast.show(this, "Playlist Auto Sort By Title: ${if (enabled) "ON" else "OFF"}")
}

// v124.52: Cache Smart Pinning Priority
internal fun PlayerActivity.showV124CacheSmartPinningPriorityDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124cacheSmartPinningPriority).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Smart Pinning Priority",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124cacheSmartPinningPriority = value
        AppToast.show(this, "Cache Smart Pinning Priority: $value")
    }
}

// v124.53: Progress Bar Custom Thumb Color124
internal fun PlayerActivity.showV124ProgressBarCustomThumbColor124Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124progressBarCustomThumbColor124).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Color124",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124progressBarCustomThumbColor124 = value
        AppToast.show(this, "Progress Bar Custom Thumb Color124: $value")
    }
}

// v124.54: Volume Replay Gain Album
internal fun PlayerActivity.showV124VolumeReplayGainAlbumToggle() {
    val enabled = !BiliClient.prefs.v124volumeReplayGainAlbum
    BiliClient.prefs.v124volumeReplayGainAlbum = enabled
    AppToast.show(this, "Volume Replay Gain Album: ${if (enabled) "ON" else "OFF"}")
}

// v124.55: History Auto Clean124
internal fun PlayerActivity.showV124HistoryAutoClean124Toggle() {
    val enabled = !BiliClient.prefs.v124historyAutoClean124
    BiliClient.prefs.v124historyAutoClean124 = enabled
    AppToast.show(this, "History Auto Clean124: ${if (enabled) "ON" else "OFF"}")
}

// v124.56: Playback Speed Presets Toggle
internal fun PlayerActivity.showV124PlaybackSpeedPresetsToggleToggle() {
    val enabled = !BiliClient.prefs.v124playbackSpeedPresetsToggle
    BiliClient.prefs.v124playbackSpeedPresetsToggle = enabled
    AppToast.show(this, "Playback Speed Presets Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v124.57: Screenshot Auto Share TikTok
internal fun PlayerActivity.showV124ScreenshotAutoShareTikTokToggle() {
    val enabled = !BiliClient.prefs.v124screenshotAutoShareTikTok
    BiliClient.prefs.v124screenshotAutoShareTikTok = enabled
    AppToast.show(this, "Screenshot Auto Share TikTok: ${if (enabled) "ON" else "OFF"}")
}

// v124.58: Video PIP Keyboard Control
internal fun PlayerActivity.showV124VideoPIPKeyboardControlToggle() {
    val enabled = !BiliClient.prefs.v124videoPIPKeyboardControl
    BiliClient.prefs.v124videoPIPKeyboardControl = enabled
    AppToast.show(this, "Video PIP Keyboard Control: ${if (enabled) "ON" else "OFF"}")
}

// v124.59: Danmaku Font BG Fill Border Color
internal fun PlayerActivity.showV124DanmakuFontBgFillBorderColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v124danmakuFontBgFillBorderColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124danmakuFontBgFillBorderColor = value
        AppToast.show(this, "Danmaku Font BG Fill Border Color: $value")
    }
}

// v124.60: Subtitle Animation Scale125
internal fun PlayerActivity.showV124SubtitleAnimationScale125Dialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v124subtitleAnimationScale125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Scale125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v124subtitleAnimationScale125 = value
        AppToast.show(this, "Subtitle Animation Scale125: $value")
    }
}

// v125.61: Audio Reverb Room Size
internal fun PlayerActivity.showV125AudioReverbRoomSizeDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v125audioReverbRoomSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Room Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125audioReverbRoomSize = value
        AppToast.show(this, "Audio Reverb Room Size: $value")
    }
}

// v125.62: Danmaku Font BG Fill Border Radius
internal fun PlayerActivity.showV125DanmakuFontBgFillBorderRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v125danmakuFontBgFillBorderRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125danmakuFontBgFillBorderRadius = value
        AppToast.show(this, "Danmaku Font BG Fill Border Radius: $value")
    }
}

// v125.63: Subtitle Animation Translate125
internal fun PlayerActivity.showV125SubtitleAnimationTranslate125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125subtitleAnimationTranslate125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125subtitleAnimationTranslate125 = value
        AppToast.show(this, "Subtitle Animation Translate125: $value")
    }
}

// v125.64: Gesture Tap Shift Alt Action
internal fun PlayerActivity.showV125GestureTapShiftAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125gestureTapShiftAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Shift Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125gestureTapShiftAltAction = value
        AppToast.show(this, "Gesture Tap Shift Alt Action: $value")
    }
}

// v125.65: Cast Video Scale Custom
internal fun PlayerActivity.showV125CastVideoScaleCustomDialog() {
    val options = listOf(75, 100, 125, 150, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v125castVideoScaleCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Scale Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125castVideoScaleCustom = value
        AppToast.show(this, "Cast Video Scale Custom: $value")
    }
}

// v125.66: Playlist Auto Sort By Upload Date
internal fun PlayerActivity.showV125PlaylistAutoSortByUploadDateToggle() {
    val enabled = !BiliClient.prefs.v125playlistAutoSortByUploadDate
    BiliClient.prefs.v125playlistAutoSortByUploadDate = enabled
    AppToast.show(this, "Playlist Auto Sort By Upload Date: ${if (enabled) "ON" else "OFF"}")
}

// v125.67: Cache Smart Pinning Refresh
internal fun PlayerActivity.showV125CacheSmartPinningRefreshToggle() {
    val enabled = !BiliClient.prefs.v125cacheSmartPinningRefresh
    BiliClient.prefs.v125cacheSmartPinningRefresh = enabled
    AppToast.show(this, "Cache Smart Pinning Refresh: ${if (enabled) "ON" else "OFF"}")
}

// v125.68: Progress Bar Custom Thumb Shape125
internal fun PlayerActivity.showV125ProgressBarCustomThumbShape125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125progressBarCustomThumbShape125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Custom Thumb Shape125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125progressBarCustomThumbShape125 = value
        AppToast.show(this, "Progress Bar Custom Thumb Shape125: $value")
    }
}

// v125.69: Volume Replay Gain Track
internal fun PlayerActivity.showV125VolumeReplayGainTrackToggle() {
    val enabled = !BiliClient.prefs.v125volumeReplayGainTrack
    BiliClient.prefs.v125volumeReplayGainTrack = enabled
    AppToast.show(this, "Volume Replay Gain Track: ${if (enabled) "ON" else "OFF"}")
}

// v125.70: History Auto Clean125
internal fun PlayerActivity.showV125HistoryAutoClean125Toggle() {
    val enabled = !BiliClient.prefs.v125historyAutoClean125
    BiliClient.prefs.v125historyAutoClean125 = enabled
    AppToast.show(this, "History Auto Clean125: ${if (enabled) "ON" else "OFF"}")
}

// v125.71: Playback Speed Presets Range
internal fun PlayerActivity.showV125PlaybackSpeedPresetsRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125playbackSpeedPresetsRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125playbackSpeedPresetsRange = value
        AppToast.show(this, "Playback Speed Presets Range: $value")
    }
}

// v125.72: Screenshot Auto Share Snapchat
internal fun PlayerActivity.showV125ScreenshotAutoShareSnapchatToggle() {
    val enabled = !BiliClient.prefs.v125screenshotAutoShareSnapchat
    BiliClient.prefs.v125screenshotAutoShareSnapchat = enabled
    AppToast.show(this, "Screenshot Auto Share Snapchat: ${if (enabled) "ON" else "OFF"}")
}

// v125.73: Video PIP Auto Hide Delay
internal fun PlayerActivity.showV125VideoPIPAutoHideDelayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125videoPIPAutoHideDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Auto Hide Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125videoPIPAutoHideDelay = value
        AppToast.show(this, "Video PIP Auto Hide Delay: $value")
    }
}

// v125.74: Danmaku Font BG Fill Border Opacity
internal fun PlayerActivity.showV125DanmakuFontBgFillBorderOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v125danmakuFontBgFillBorderOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125danmakuFontBgFillBorderOpacity = value
        AppToast.show(this, "Danmaku Font BG Fill Border Opacity: $value")
    }
}

// v125.75: Subtitle Animation Rotate125
internal fun PlayerActivity.showV125SubtitleAnimationRotate125Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v125subtitleAnimationRotate125).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate125",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v125subtitleAnimationRotate125 = value
        AppToast.show(this, "Subtitle Animation Rotate125: $value")
    }
}

// v126.76: Audio Reverb Damping
internal fun PlayerActivity.showV126AudioReverbDampingDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v126audioReverbDamping).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Damping",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126audioReverbDamping = value
        AppToast.show(this, "Audio Reverb Damping: $value")
    }
}

// v126.77: Danmaku Font BG Fill Border Dash Toggle
internal fun PlayerActivity.showV126DanmakuFontBgFillBorderDashToggleToggle() {
    val enabled = !BiliClient.prefs.v126danmakuFontBgFillBorderDashToggle
    BiliClient.prefs.v126danmakuFontBgFillBorderDashToggle = enabled
    AppToast.show(this, "Danmaku Font BG Fill Border Dash Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v126.78: Subtitle Animation Rotate126
internal fun PlayerActivity.showV126SubtitleAnimationRotate126Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126subtitleAnimationRotate126).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Rotate126",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126subtitleAnimationRotate126 = value
        AppToast.show(this, "Subtitle Animation Rotate126: $value")
    }
}

// v126.79: Gesture Tap Ctrl Alt Action
internal fun PlayerActivity.showV126GestureTapCtrlAltActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126gestureTapCtrlAltAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Ctrl Alt Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126gestureTapCtrlAltAction = value
        AppToast.show(this, "Gesture Tap Ctrl Alt Action: $value")
    }
}

// v126.80: Cast Video Mirror Flip
internal fun PlayerActivity.showV126CastVideoMirrorFlipDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126castVideoMirrorFlip).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Mirror Flip",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126castVideoMirrorFlip = value
        AppToast.show(this, "Cast Video Mirror Flip: $value")
    }
}

// v126.81: Playlist Auto Sort By Random
internal fun PlayerActivity.showV126PlaylistAutoSortByRandomToggle() {
    val enabled = !BiliClient.prefs.v126playlistAutoSortByRandom
    BiliClient.prefs.v126playlistAutoSortByRandom = enabled
    AppToast.show(this, "Playlist Auto Sort By Random: ${if (enabled) "ON" else "OFF"}")
}

// v126.82: Cache Smart Pinning On Low Space
internal fun PlayerActivity.showV126CacheSmartPinningOnLowSpaceToggle() {
    val enabled = !BiliClient.prefs.v126cacheSmartPinningOnLowSpace
    BiliClient.prefs.v126cacheSmartPinningOnLowSpace = enabled
    AppToast.show(this, "Cache Smart Pinning On Low Space: ${if (enabled) "ON" else "OFF"}")
}

// v126.83: Progress Bar Custom Thumb Glow126
internal fun PlayerActivity.showV126ProgressBarCustomThumbGlow126Toggle() {
    val enabled = !BiliClient.prefs.v126progressBarCustomThumbGlow126
    BiliClient.prefs.v126progressBarCustomThumbGlow126 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Glow126: ${if (enabled) "ON" else "OFF"}")
}

// v126.84: Volume Replay Gain Preamp
internal fun PlayerActivity.showV126VolumeReplayGainPreampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126volumeReplayGainPreamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Replay Gain Preamp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126volumeReplayGainPreamp = value
        AppToast.show(this, "Volume Replay Gain Preamp: $value")
    }
}

// v126.85: History Auto Clean126
internal fun PlayerActivity.showV126HistoryAutoClean126Toggle() {
    val enabled = !BiliClient.prefs.v126historyAutoClean126
    BiliClient.prefs.v126historyAutoClean126 = enabled
    AppToast.show(this, "History Auto Clean126: ${if (enabled) "ON" else "OFF"}")
}

// v126.86: Playback Speed Presets Label
internal fun PlayerActivity.showV126PlaybackSpeedPresetsLabelDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126playbackSpeedPresetsLabel).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Label",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126playbackSpeedPresetsLabel = value
        AppToast.show(this, "Playback Speed Presets Label: $value")
    }
}

// v126.87: Screenshot Auto Share Reddit
internal fun PlayerActivity.showV126ScreenshotAutoShareRedditToggle() {
    val enabled = !BiliClient.prefs.v126screenshotAutoShareReddit
    BiliClient.prefs.v126screenshotAutoShareReddit = enabled
    AppToast.show(this, "Screenshot Auto Share Reddit: ${if (enabled) "ON" else "OFF"}")
}

// v126.88: Video PIP Follow Scroll
internal fun PlayerActivity.showV126VideoPIPFollowScrollToggle() {
    val enabled = !BiliClient.prefs.v126videoPIPFollowScroll
    BiliClient.prefs.v126videoPIPFollowScroll = enabled
    AppToast.show(this, "Video PIP Follow Scroll: ${if (enabled) "ON" else "OFF"}")
}

// v126.89: Danmaku Font BG Fill Border Dash Width
internal fun PlayerActivity.showV126DanmakuFontBgFillBorderDashWidthDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v126danmakuFontBgFillBorderDashWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Dash Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126danmakuFontBgFillBorderDashWidth = value
        AppToast.show(this, "Danmaku Font BG Fill Border Dash Width: $value")
    }
}

// v126.90: Subtitle Animation Translate126
internal fun PlayerActivity.showV126SubtitleAnimationTranslate126Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v126subtitleAnimationTranslate126).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate126",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v126subtitleAnimationTranslate126 = value
        AppToast.show(this, "Subtitle Animation Translate126: $value")
    }
}

// v127.91: Audio Reverb Wet Dry Mix
internal fun PlayerActivity.showV127AudioReverbWetDryMixDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127audioReverbWetDryMix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Wet Dry Mix",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127audioReverbWetDryMix = value
        AppToast.show(this, "Audio Reverb Wet Dry Mix: $value")
    }
}

// v127.92: Danmaku Font BG Fill Border Dash Gap
internal fun PlayerActivity.showV127DanmakuFontBgFillBorderDashGapDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v127danmakuFontBgFillBorderDashGap).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Dash Gap",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127danmakuFontBgFillBorderDashGap = value
        AppToast.show(this, "Danmaku Font BG Fill Border Dash Gap: $value")
    }
}

// v127.93: Subtitle Animation Blur127
internal fun PlayerActivity.showV127SubtitleAnimationBlur127Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127subtitleAnimationBlur127).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur127",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127subtitleAnimationBlur127 = value
        AppToast.show(this, "Subtitle Animation Blur127: $value")
    }
}

// v127.94: Gesture Tap Multi Finger Action
internal fun PlayerActivity.showV127GestureTapMultiFingerActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v127gestureTapMultiFingerAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Multi Finger Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127gestureTapMultiFingerAction = value
        AppToast.show(this, "Gesture Tap Multi Finger Action: $value")
    }
}

// v127.95: Cast Video Zoom Custom
internal fun PlayerActivity.showV127CastVideoZoomCustomDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v127castVideoZoomCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Zoom Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127castVideoZoomCustom = value
        AppToast.show(this, "Cast Video Zoom Custom: $value")
    }
}

// v127.96: Playlist Auto Group By Similarity
internal fun PlayerActivity.showV127PlaylistAutoGroupBySimilarityToggle() {
    val enabled = !BiliClient.prefs.v127playlistAutoGroupBySimilarity
    BiliClient.prefs.v127playlistAutoGroupBySimilarity = enabled
    AppToast.show(this, "Playlist Auto Group By Similarity: ${if (enabled) "ON" else "OFF"}")
}

// v127.97: Cache Smart Pinning Alert
internal fun PlayerActivity.showV127CacheSmartPinningAlertToggle() {
    val enabled = !BiliClient.prefs.v127cacheSmartPinningAlert
    BiliClient.prefs.v127cacheSmartPinningAlert = enabled
    AppToast.show(this, "Cache Smart Pinning Alert: ${if (enabled) "ON" else "OFF"}")
}

// v127.98: Progress Bar Custom Thumb Shadow127
internal fun PlayerActivity.showV127ProgressBarCustomThumbShadow127Toggle() {
    val enabled = !BiliClient.prefs.v127progressBarCustomThumbShadow127
    BiliClient.prefs.v127progressBarCustomThumbShadow127 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Shadow127: ${if (enabled) "ON" else "OFF"}")
}

// v127.99: Volume Replay Gain Clip Protect
internal fun PlayerActivity.showV127VolumeReplayGainClipProtectToggle() {
    val enabled = !BiliClient.prefs.v127volumeReplayGainClipProtect
    BiliClient.prefs.v127volumeReplayGainClipProtect = enabled
    AppToast.show(this, "Volume Replay Gain Clip Protect: ${if (enabled) "ON" else "OFF"}")
}

// v127.100: History Auto Clean127
internal fun PlayerActivity.showV127HistoryAutoClean127Toggle() {
    val enabled = !BiliClient.prefs.v127historyAutoClean127
    BiliClient.prefs.v127historyAutoClean127 = enabled
    AppToast.show(this, "History Auto Clean127: ${if (enabled) "ON" else "OFF"}")
}

// v127.101: Playback Speed Presets Adaptive
internal fun PlayerActivity.showV127PlaybackSpeedPresetsAdaptiveToggle() {
    val enabled = !BiliClient.prefs.v127playbackSpeedPresetsAdaptive
    BiliClient.prefs.v127playbackSpeedPresetsAdaptive = enabled
    AppToast.show(this, "Playback Speed Presets Adaptive: ${if (enabled) "ON" else "OFF"}")
}

// v127.102: Screenshot Auto Share VK
internal fun PlayerActivity.showV127ScreenshotAutoShareVKToggle() {
    val enabled = !BiliClient.prefs.v127screenshotAutoShareVK
    BiliClient.prefs.v127screenshotAutoShareVK = enabled
    AppToast.show(this, "Screenshot Auto Share VK: ${if (enabled) "ON" else "OFF"}")
}

// v127.103: Video PIP Snap To Edge
internal fun PlayerActivity.showV127VideoPIPSnapToEdgeToggle() {
    val enabled = !BiliClient.prefs.v127videoPIPSnapToEdge
    BiliClient.prefs.v127videoPIPSnapToEdge = enabled
    AppToast.show(this, "Video PIP Snap To Edge: ${if (enabled) "ON" else "OFF"}")
}

// v127.104: Danmaku Font BG Fill Border Type
internal fun PlayerActivity.showV127DanmakuFontBgFillBorderTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v127danmakuFontBgFillBorderType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127danmakuFontBgFillBorderType = value
        AppToast.show(this, "Danmaku Font BG Fill Border Type: $value")
    }
}

// v127.105: Subtitle Animation Blur128
internal fun PlayerActivity.showV127SubtitleAnimationBlur128Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v127subtitleAnimationBlur128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v127subtitleAnimationBlur128 = value
        AppToast.show(this, "Subtitle Animation Blur128: $value")
    }
}

// v128.106: Audio Reverb Pre Delay
internal fun PlayerActivity.showV128AudioReverbPreDelayDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v128audioReverbPreDelay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Reverb Pre Delay",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128audioReverbPreDelay = value
        AppToast.show(this, "Audio Reverb Pre Delay: $value")
    }
}

// v128.107: Danmaku Font BG Fill Border Type127
internal fun PlayerActivity.showV128DanmakuFontBgFillBorderType127Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128danmakuFontBgFillBorderType127).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Type127",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128danmakuFontBgFillBorderType127 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Type127: $value")
    }
}

// v128.108: Subtitle Animation Blur129
internal fun PlayerActivity.showV128SubtitleAnimationBlur129Dialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v128subtitleAnimationBlur129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Blur129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128subtitleAnimationBlur129 = value
        AppToast.show(this, "Subtitle Animation Blur129: $value")
    }
}

// v128.109: Gesture Tap Finger Count
internal fun PlayerActivity.showV128GestureTapFingerCountDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v128gestureTapFingerCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Finger Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128gestureTapFingerCount = value
        AppToast.show(this, "Gesture Tap Finger Count: $value")
    }
}

// v128.110: Cast Video PIP Mode
internal fun PlayerActivity.showV128CastVideoPIPModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128castVideoPIPMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128castVideoPIPMode = value
        AppToast.show(this, "Cast Video PIP Mode: $value")
    }
}

// v128.111: Playlist Auto Group By Topic
internal fun PlayerActivity.showV128PlaylistAutoGroupByTopicToggle() {
    val enabled = !BiliClient.prefs.v128playlistAutoGroupByTopic
    BiliClient.prefs.v128playlistAutoGroupByTopic = enabled
    AppToast.show(this, "Playlist Auto Group By Topic: ${if (enabled) "ON" else "OFF"}")
}

// v128.112: Cache Smart Pinning On Wifi
internal fun PlayerActivity.showV128CacheSmartPinningOnWifiToggle() {
    val enabled = !BiliClient.prefs.v128cacheSmartPinningOnWifi
    BiliClient.prefs.v128cacheSmartPinningOnWifi = enabled
    AppToast.show(this, "Cache Smart Pinning On Wifi: ${if (enabled) "ON" else "OFF"}")
}

// v128.113: Progress Bar Custom Thumb Border128
internal fun PlayerActivity.showV128ProgressBarCustomThumbBorder128Toggle() {
    val enabled = !BiliClient.prefs.v128progressBarCustomThumbBorder128
    BiliClient.prefs.v128progressBarCustomThumbBorder128 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Border128: ${if (enabled) "ON" else "OFF"}")
}

// v128.114: Volume Normalize Per Track
internal fun PlayerActivity.showV128VolumeNormalizePerTrackToggle() {
    val enabled = !BiliClient.prefs.v128volumeNormalizePerTrack
    BiliClient.prefs.v128volumeNormalizePerTrack = enabled
    AppToast.show(this, "Volume Normalize Per Track: ${if (enabled) "ON" else "OFF"}")
}

// v128.115: History Auto Clean128
internal fun PlayerActivity.showV128HistoryAutoClean128Toggle() {
    val enabled = !BiliClient.prefs.v128historyAutoClean128
    BiliClient.prefs.v128historyAutoClean128 = enabled
    AppToast.show(this, "History Auto Clean128: ${if (enabled) "ON" else "OFF"}")
}

// v128.116: Playback Speed Presets Display
internal fun PlayerActivity.showV128PlaybackSpeedPresetsDisplayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128playbackSpeedPresetsDisplay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Speed Presets Display",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128playbackSpeedPresetsDisplay = value
        AppToast.show(this, "Playback Speed Presets Display: $value")
    }
}

// v128.117: Screenshot Auto Share Telegram Channel
internal fun PlayerActivity.showV128ScreenshotAutoShareTelegramChannelToggle() {
    val enabled = !BiliClient.prefs.v128screenshotAutoShareTelegramChannel
    BiliClient.prefs.v128screenshotAutoShareTelegramChannel = enabled
    AppToast.show(this, "Screenshot Auto Share Telegram Channel: ${if (enabled) "ON" else "OFF"}")
}

// v128.118: Video PIP Minimize To Notification
internal fun PlayerActivity.showV128VideoPIPMinimizeToNotificationToggle() {
    val enabled = !BiliClient.prefs.v128videoPIPMinimizeToNotification
    BiliClient.prefs.v128videoPIPMinimizeToNotification = enabled
    AppToast.show(this, "Video PIP Minimize To Notification: ${if (enabled) "ON" else "OFF"}")
}

// v128.119: Danmaku Font BG Fill Border Join
internal fun PlayerActivity.showV128DanmakuFontBgFillBorderJoinDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128danmakuFontBgFillBorderJoin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Join",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128danmakuFontBgFillBorderJoin = value
        AppToast.show(this, "Danmaku Font BG Fill Border Join: $value")
    }
}

// v128.120: Subtitle Animation Translate128
internal fun PlayerActivity.showV128SubtitleAnimationTranslate128Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v128subtitleAnimationTranslate128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v128subtitleAnimationTranslate128 = value
        AppToast.show(this, "Subtitle Animation Translate128: $value")
    }
}

// v129.121: Audio Chorus Toggle129
internal fun PlayerActivity.showV129AudioChorusToggle129Toggle() {
    val enabled = !BiliClient.prefs.v129audioChorusToggle129
    BiliClient.prefs.v129audioChorusToggle129 = enabled
    AppToast.show(this, "Audio Chorus Toggle129: ${if (enabled) "ON" else "OFF"}")
}

// v129.122: Danmaku Font BG Fill Border Join128
internal fun PlayerActivity.showV129DanmakuFontBgFillBorderJoin128Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129danmakuFontBgFillBorderJoin128).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font BG Fill Border Join128",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129danmakuFontBgFillBorderJoin128 = value
        AppToast.show(this, "Danmaku Font BG Fill Border Join128: $value")
    }
}

// v129.123: Subtitle Animation Translate129
internal fun PlayerActivity.showV129SubtitleAnimationTranslate129Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129subtitleAnimationTranslate129).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Translate129",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129subtitleAnimationTranslate129 = value
        AppToast.show(this, "Subtitle Animation Translate129: $value")
    }
}

// v129.124: Gesture Tap Zone Custom
internal fun PlayerActivity.showV129GestureTapZoneCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129gestureTapZoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Tap Zone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129gestureTapZoneCustom = value
        AppToast.show(this, "Gesture Tap Zone Custom: $value")
    }
}

// v129.125: Cast Video PIP Size
internal fun PlayerActivity.showV129CastVideoPIPSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129castVideoPIPSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video PIP Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129castVideoPIPSize = value
        AppToast.show(this, "Cast Video PIP Size: $value")
    }
}

// v129.126: Playlist Auto Group By Mood
internal fun PlayerActivity.showV129PlaylistAutoGroupByMoodToggle() {
    val enabled = !BiliClient.prefs.v129playlistAutoGroupByMood
    BiliClient.prefs.v129playlistAutoGroupByMood = enabled
    AppToast.show(this, "Playlist Auto Group By Mood: ${if (enabled) "ON" else "OFF"}")
}

// v129.127: Cache Smart Pinning On Charging
internal fun PlayerActivity.showV129CacheSmartPinningOnChargingToggle() {
    val enabled = !BiliClient.prefs.v129cacheSmartPinningOnCharging
    BiliClient.prefs.v129cacheSmartPinningOnCharging = enabled
    AppToast.show(this, "Cache Smart Pinning On Charging: ${if (enabled) "ON" else "OFF"}")
}

// v129.128: Progress Bar Custom Thumb Border129
internal fun PlayerActivity.showV129ProgressBarCustomThumbBorder129Toggle() {
    val enabled = !BiliClient.prefs.v129progressBarCustomThumbBorder129
    BiliClient.prefs.v129progressBarCustomThumbBorder129 = enabled
    AppToast.show(this, "Progress Bar Custom Thumb Border129: ${if (enabled) "ON" else "OFF"}")
}

// v129.129: Volume Normalize Album
internal fun PlayerActivity.showV129VolumeNormalizeAlbumToggle() {
    val enabled = !BiliClient.prefs.v129volumeNormalizeAlbum
    BiliClient.prefs.v129volumeNormalizeAlbum = enabled
    AppToast.show(this, "Volume Normalize Album: ${if (enabled) "ON" else "OFF"}")
}

// v129.130: History Auto Clean129
internal fun PlayerActivity.showV129HistoryAutoClean129Toggle() {
    val enabled = !BiliClient.prefs.v129historyAutoClean129
    BiliClient.prefs.v129historyAutoClean129 = enabled
    AppToast.show(this, "History Auto Clean129: ${if (enabled) "ON" else "OFF"}")
}

// v129.131: Playback Speed Presets Notification
internal fun PlayerActivity.showV129PlaybackSpeedPresetsNotificationToggle() {
    val enabled = !BiliClient.prefs.v129playbackSpeedPresetsNotification
    BiliClient.prefs.v129playbackSpeedPresetsNotification = enabled
    AppToast.show(this, "Playback Speed Presets Notification: ${if (enabled) "ON" else "OFF"}")
}

// v129.132: Screenshot Auto Share Slack
internal fun PlayerActivity.showV129ScreenshotAutoShareSlackToggle() {
    val enabled = !BiliClient.prefs.v129screenshotAutoShareSlack
    BiliClient.prefs.v129screenshotAutoShareSlack = enabled
    AppToast.show(this, "Screenshot Auto Share Slack: ${if (enabled) "ON" else "OFF"}")
}

// v129.133: Video PIP Transition Animation
internal fun PlayerActivity.showV129VideoPIPTransitionAnimationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v129videoPIPTransitionAnimation).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video PIP Transition Animation",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v129videoPIPTransitionAnimation = value
        AppToast.show(this, "Video PIP Transition Animation: $value")
    }
}
