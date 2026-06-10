package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



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

