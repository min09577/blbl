package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1001: produce mode
internal fun PlayerActivity.showV1001ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1001produce
    FeaturePrefsStore.batch1001.v1001produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1001: profile mode
internal fun PlayerActivity.showV1001ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1001profile
    FeaturePrefsStore.batch1001.v1001profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1001: program mode
internal fun PlayerActivity.showV1001ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1001program
    FeaturePrefsStore.batch1001.v1001program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1001: project mode
internal fun PlayerActivity.showV1001ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1001project
    FeaturePrefsStore.batch1001.v1001project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1001: promise mode
internal fun PlayerActivity.showV1001PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1001promise
    FeaturePrefsStore.batch1001.v1001promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1001: prompt level
internal fun PlayerActivity.showV1001PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1001: prop level
internal fun PlayerActivity.showV1001PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1001: property level
internal fun PlayerActivity.showV1001PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001property = value
        AppToast.show(this, "property: $value")
    }
}

// v1001: protect level
internal fun PlayerActivity.showV1001ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1001: protocol level
internal fun PlayerActivity.showV1001ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1001protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1001protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1001: provide mode
internal fun PlayerActivity.showV1001ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1001provide
    FeaturePrefsStore.batch1001.v1001provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1001: proxy mode
internal fun PlayerActivity.showV1001ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1001proxy
    FeaturePrefsStore.batch1001.v1001proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1001: pull mode
internal fun PlayerActivity.showV1001PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1001pull
    FeaturePrefsStore.batch1001.v1001pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1001: pure mode
internal fun PlayerActivity.showV1001PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1001pure
    FeaturePrefsStore.batch1001.v1001pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1001: push mode
internal fun PlayerActivity.showV1001PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1001push
    FeaturePrefsStore.batch1001.v1001push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1002: produce mode
internal fun PlayerActivity.showV1002ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1002produce
    FeaturePrefsStore.batch1001.v1002produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1002: profile mode
internal fun PlayerActivity.showV1002ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1002profile
    FeaturePrefsStore.batch1001.v1002profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1002: program mode
internal fun PlayerActivity.showV1002ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1002program
    FeaturePrefsStore.batch1001.v1002program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1002: project mode
internal fun PlayerActivity.showV1002ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1002project
    FeaturePrefsStore.batch1001.v1002project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1002: promise mode
internal fun PlayerActivity.showV1002PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1002promise
    FeaturePrefsStore.batch1001.v1002promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1002: prompt level
internal fun PlayerActivity.showV1002PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1002: prop level
internal fun PlayerActivity.showV1002PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1002: property level
internal fun PlayerActivity.showV1002PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002property = value
        AppToast.show(this, "property: $value")
    }
}

// v1002: protect level
internal fun PlayerActivity.showV1002ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1002: protocol level
internal fun PlayerActivity.showV1002ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1002protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1002protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1002: provide mode
internal fun PlayerActivity.showV1002ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1002provide
    FeaturePrefsStore.batch1001.v1002provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1002: proxy mode
internal fun PlayerActivity.showV1002ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1002proxy
    FeaturePrefsStore.batch1001.v1002proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1002: pull mode
internal fun PlayerActivity.showV1002PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1002pull
    FeaturePrefsStore.batch1001.v1002pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1002: pure mode
internal fun PlayerActivity.showV1002PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1002pure
    FeaturePrefsStore.batch1001.v1002pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1002: push mode
internal fun PlayerActivity.showV1002PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1002push
    FeaturePrefsStore.batch1001.v1002push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1003: produce mode
internal fun PlayerActivity.showV1003ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1003produce
    FeaturePrefsStore.batch1001.v1003produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1003: profile mode
internal fun PlayerActivity.showV1003ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1003profile
    FeaturePrefsStore.batch1001.v1003profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1003: program mode
internal fun PlayerActivity.showV1003ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1003program
    FeaturePrefsStore.batch1001.v1003program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1003: project mode
internal fun PlayerActivity.showV1003ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1003project
    FeaturePrefsStore.batch1001.v1003project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1003: promise mode
internal fun PlayerActivity.showV1003PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1003promise
    FeaturePrefsStore.batch1001.v1003promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1003: prompt level
internal fun PlayerActivity.showV1003PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1003: prop level
internal fun PlayerActivity.showV1003PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1003: property level
internal fun PlayerActivity.showV1003PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003property = value
        AppToast.show(this, "property: $value")
    }
}

// v1003: protect level
internal fun PlayerActivity.showV1003ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1003: protocol level
internal fun PlayerActivity.showV1003ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1003protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1003protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1003: provide mode
internal fun PlayerActivity.showV1003ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1003provide
    FeaturePrefsStore.batch1001.v1003provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1003: proxy mode
internal fun PlayerActivity.showV1003ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1003proxy
    FeaturePrefsStore.batch1001.v1003proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1003: pull mode
internal fun PlayerActivity.showV1003PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1003pull
    FeaturePrefsStore.batch1001.v1003pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1003: pure mode
internal fun PlayerActivity.showV1003PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1003pure
    FeaturePrefsStore.batch1001.v1003pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1003: push mode
internal fun PlayerActivity.showV1003PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1003push
    FeaturePrefsStore.batch1001.v1003push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1004: produce mode
internal fun PlayerActivity.showV1004ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1004produce
    FeaturePrefsStore.batch1001.v1004produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1004: profile mode
internal fun PlayerActivity.showV1004ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1004profile
    FeaturePrefsStore.batch1001.v1004profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1004: program mode
internal fun PlayerActivity.showV1004ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1004program
    FeaturePrefsStore.batch1001.v1004program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1004: project mode
internal fun PlayerActivity.showV1004ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1004project
    FeaturePrefsStore.batch1001.v1004project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1004: promise mode
internal fun PlayerActivity.showV1004PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1004promise
    FeaturePrefsStore.batch1001.v1004promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1004: prompt level
internal fun PlayerActivity.showV1004PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1004: prop level
internal fun PlayerActivity.showV1004PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1004: property level
internal fun PlayerActivity.showV1004PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004property = value
        AppToast.show(this, "property: $value")
    }
}

// v1004: protect level
internal fun PlayerActivity.showV1004ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1004: protocol level
internal fun PlayerActivity.showV1004ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1004protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1004protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1004: provide mode
internal fun PlayerActivity.showV1004ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1004provide
    FeaturePrefsStore.batch1001.v1004provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1004: proxy mode
internal fun PlayerActivity.showV1004ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1004proxy
    FeaturePrefsStore.batch1001.v1004proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1004: pull mode
internal fun PlayerActivity.showV1004PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1004pull
    FeaturePrefsStore.batch1001.v1004pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1004: pure mode
internal fun PlayerActivity.showV1004PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1004pure
    FeaturePrefsStore.batch1001.v1004pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1004: push mode
internal fun PlayerActivity.showV1004PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1004push
    FeaturePrefsStore.batch1001.v1004push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1005: produce mode
internal fun PlayerActivity.showV1005ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1005produce
    FeaturePrefsStore.batch1001.v1005produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1005: profile mode
internal fun PlayerActivity.showV1005ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1005profile
    FeaturePrefsStore.batch1001.v1005profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1005: program mode
internal fun PlayerActivity.showV1005ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1005program
    FeaturePrefsStore.batch1001.v1005program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1005: project mode
internal fun PlayerActivity.showV1005ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1005project
    FeaturePrefsStore.batch1001.v1005project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1005: promise mode
internal fun PlayerActivity.showV1005PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1005promise
    FeaturePrefsStore.batch1001.v1005promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1005: prompt level
internal fun PlayerActivity.showV1005PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1005: prop level
internal fun PlayerActivity.showV1005PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1005: property level
internal fun PlayerActivity.showV1005PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005property = value
        AppToast.show(this, "property: $value")
    }
}

// v1005: protect level
internal fun PlayerActivity.showV1005ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1005: protocol level
internal fun PlayerActivity.showV1005ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1005protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1005protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1005: provide mode
internal fun PlayerActivity.showV1005ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1005provide
    FeaturePrefsStore.batch1001.v1005provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1005: proxy mode
internal fun PlayerActivity.showV1005ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1005proxy
    FeaturePrefsStore.batch1001.v1005proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1005: pull mode
internal fun PlayerActivity.showV1005PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1005pull
    FeaturePrefsStore.batch1001.v1005pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1005: pure mode
internal fun PlayerActivity.showV1005PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1005pure
    FeaturePrefsStore.batch1001.v1005pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1005: push mode
internal fun PlayerActivity.showV1005PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1005push
    FeaturePrefsStore.batch1001.v1005push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1006: produce mode
internal fun PlayerActivity.showV1006ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1006produce
    FeaturePrefsStore.batch1001.v1006produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1006: profile mode
internal fun PlayerActivity.showV1006ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1006profile
    FeaturePrefsStore.batch1001.v1006profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1006: program mode
internal fun PlayerActivity.showV1006ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1006program
    FeaturePrefsStore.batch1001.v1006program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1006: project mode
internal fun PlayerActivity.showV1006ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1006project
    FeaturePrefsStore.batch1001.v1006project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1006: promise mode
internal fun PlayerActivity.showV1006PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1006promise
    FeaturePrefsStore.batch1001.v1006promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1006: prompt level
internal fun PlayerActivity.showV1006PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1006: prop level
internal fun PlayerActivity.showV1006PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1006: property level
internal fun PlayerActivity.showV1006PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006property = value
        AppToast.show(this, "property: $value")
    }
}

// v1006: protect level
internal fun PlayerActivity.showV1006ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1006: protocol level
internal fun PlayerActivity.showV1006ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1006protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1006protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1006: provide mode
internal fun PlayerActivity.showV1006ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1006provide
    FeaturePrefsStore.batch1001.v1006provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1006: proxy mode
internal fun PlayerActivity.showV1006ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1006proxy
    FeaturePrefsStore.batch1001.v1006proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1006: pull mode
internal fun PlayerActivity.showV1006PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1006pull
    FeaturePrefsStore.batch1001.v1006pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1006: pure mode
internal fun PlayerActivity.showV1006PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1006pure
    FeaturePrefsStore.batch1001.v1006pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1006: push mode
internal fun PlayerActivity.showV1006PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1006push
    FeaturePrefsStore.batch1001.v1006push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1007: produce mode
internal fun PlayerActivity.showV1007ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1007produce
    FeaturePrefsStore.batch1001.v1007produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1007: profile mode
internal fun PlayerActivity.showV1007ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1007profile
    FeaturePrefsStore.batch1001.v1007profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1007: program mode
internal fun PlayerActivity.showV1007ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1007program
    FeaturePrefsStore.batch1001.v1007program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1007: project mode
internal fun PlayerActivity.showV1007ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1007project
    FeaturePrefsStore.batch1001.v1007project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1007: promise mode
internal fun PlayerActivity.showV1007PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1007promise
    FeaturePrefsStore.batch1001.v1007promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1007: prompt level
internal fun PlayerActivity.showV1007PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1007: prop level
internal fun PlayerActivity.showV1007PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1007: property level
internal fun PlayerActivity.showV1007PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007property = value
        AppToast.show(this, "property: $value")
    }
}

// v1007: protect level
internal fun PlayerActivity.showV1007ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1007: protocol level
internal fun PlayerActivity.showV1007ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1007protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1007protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1007: provide mode
internal fun PlayerActivity.showV1007ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1007provide
    FeaturePrefsStore.batch1001.v1007provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1007: proxy mode
internal fun PlayerActivity.showV1007ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1007proxy
    FeaturePrefsStore.batch1001.v1007proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1007: pull mode
internal fun PlayerActivity.showV1007PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1007pull
    FeaturePrefsStore.batch1001.v1007pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1007: pure mode
internal fun PlayerActivity.showV1007PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1007pure
    FeaturePrefsStore.batch1001.v1007pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1007: push mode
internal fun PlayerActivity.showV1007PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1007push
    FeaturePrefsStore.batch1001.v1007push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1008: produce mode
internal fun PlayerActivity.showV1008ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1008produce
    FeaturePrefsStore.batch1001.v1008produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1008: profile mode
internal fun PlayerActivity.showV1008ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1008profile
    FeaturePrefsStore.batch1001.v1008profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1008: program mode
internal fun PlayerActivity.showV1008ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1008program
    FeaturePrefsStore.batch1001.v1008program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1008: project mode
internal fun PlayerActivity.showV1008ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1008project
    FeaturePrefsStore.batch1001.v1008project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1008: promise mode
internal fun PlayerActivity.showV1008PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1008promise
    FeaturePrefsStore.batch1001.v1008promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1008: prompt level
internal fun PlayerActivity.showV1008PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1008: prop level
internal fun PlayerActivity.showV1008PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1008: property level
internal fun PlayerActivity.showV1008PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008property = value
        AppToast.show(this, "property: $value")
    }
}

// v1008: protect level
internal fun PlayerActivity.showV1008ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1008: protocol level
internal fun PlayerActivity.showV1008ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1008protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1008protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1008: provide mode
internal fun PlayerActivity.showV1008ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1008provide
    FeaturePrefsStore.batch1001.v1008provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1008: proxy mode
internal fun PlayerActivity.showV1008ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1008proxy
    FeaturePrefsStore.batch1001.v1008proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1008: pull mode
internal fun PlayerActivity.showV1008PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1008pull
    FeaturePrefsStore.batch1001.v1008pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1008: pure mode
internal fun PlayerActivity.showV1008PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1008pure
    FeaturePrefsStore.batch1001.v1008pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1008: push mode
internal fun PlayerActivity.showV1008PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1008push
    FeaturePrefsStore.batch1001.v1008push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1009: produce mode
internal fun PlayerActivity.showV1009ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1009produce
    FeaturePrefsStore.batch1001.v1009produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1009: profile mode
internal fun PlayerActivity.showV1009ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1009profile
    FeaturePrefsStore.batch1001.v1009profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1009: program mode
internal fun PlayerActivity.showV1009ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1009program
    FeaturePrefsStore.batch1001.v1009program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1009: project mode
internal fun PlayerActivity.showV1009ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1009project
    FeaturePrefsStore.batch1001.v1009project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1009: promise mode
internal fun PlayerActivity.showV1009PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1009promise
    FeaturePrefsStore.batch1001.v1009promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1009: prompt level
internal fun PlayerActivity.showV1009PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1009: prop level
internal fun PlayerActivity.showV1009PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1009: property level
internal fun PlayerActivity.showV1009PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009property = value
        AppToast.show(this, "property: $value")
    }
}

// v1009: protect level
internal fun PlayerActivity.showV1009ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1009: protocol level
internal fun PlayerActivity.showV1009ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1009protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1009protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1009: provide mode
internal fun PlayerActivity.showV1009ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1009provide
    FeaturePrefsStore.batch1001.v1009provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1009: proxy mode
internal fun PlayerActivity.showV1009ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1009proxy
    FeaturePrefsStore.batch1001.v1009proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1009: pull mode
internal fun PlayerActivity.showV1009PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1009pull
    FeaturePrefsStore.batch1001.v1009pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1009: pure mode
internal fun PlayerActivity.showV1009PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1009pure
    FeaturePrefsStore.batch1001.v1009pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1009: push mode
internal fun PlayerActivity.showV1009PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1009push
    FeaturePrefsStore.batch1001.v1009push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

// v1010: produce mode
internal fun PlayerActivity.showV1010ProduceToggle() {
    val current = FeaturePrefsStore.batch1001.v1010produce
    FeaturePrefsStore.batch1001.v1010produce = !current
    AppToast.show(this, "produce: ${if (!current) "ON" else "OFF"}")
}

// v1010: profile mode
internal fun PlayerActivity.showV1010ProfileToggle() {
    val current = FeaturePrefsStore.batch1001.v1010profile
    FeaturePrefsStore.batch1001.v1010profile = !current
    AppToast.show(this, "profile: ${if (!current) "ON" else "OFF"}")
}

// v1010: program mode
internal fun PlayerActivity.showV1010ProgramToggle() {
    val current = FeaturePrefsStore.batch1001.v1010program
    FeaturePrefsStore.batch1001.v1010program = !current
    AppToast.show(this, "program: ${if (!current) "ON" else "OFF"}")
}

// v1010: project mode
internal fun PlayerActivity.showV1010ProjectToggle() {
    val current = FeaturePrefsStore.batch1001.v1010project
    FeaturePrefsStore.batch1001.v1010project = !current
    AppToast.show(this, "project: ${if (!current) "ON" else "OFF"}")
}

// v1010: promise mode
internal fun PlayerActivity.showV1010PromiseToggle() {
    val current = FeaturePrefsStore.batch1001.v1010promise
    FeaturePrefsStore.batch1001.v1010promise = !current
    AppToast.show(this, "promise: ${if (!current) "ON" else "OFF"}")
}

// v1010: prompt level
internal fun PlayerActivity.showV1010PromptDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010prompt).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prompt level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010prompt = value
        AppToast.show(this, "prompt: $value")
    }
}

// v1010: prop level
internal fun PlayerActivity.showV1010PropDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010prop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010prop = value
        AppToast.show(this, "prop: $value")
    }
}

// v1010: property level
internal fun PlayerActivity.showV1010PropertyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010property).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "property level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010property = value
        AppToast.show(this, "property: $value")
    }
}

// v1010: protect level
internal fun PlayerActivity.showV1010ProtectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010protect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010protect = value
        AppToast.show(this, "protect: $value")
    }
}

// v1010: protocol level
internal fun PlayerActivity.showV1010ProtocolDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1001.v1010protocol).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "protocol level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1001.v1010protocol = value
        AppToast.show(this, "protocol: $value")
    }
}

// v1010: provide mode
internal fun PlayerActivity.showV1010ProvideToggle() {
    val current = FeaturePrefsStore.batch1001.v1010provide
    FeaturePrefsStore.batch1001.v1010provide = !current
    AppToast.show(this, "provide: ${if (!current) "ON" else "OFF"}")
}

// v1010: proxy mode
internal fun PlayerActivity.showV1010ProxyToggle() {
    val current = FeaturePrefsStore.batch1001.v1010proxy
    FeaturePrefsStore.batch1001.v1010proxy = !current
    AppToast.show(this, "proxy: ${if (!current) "ON" else "OFF"}")
}

// v1010: pull mode
internal fun PlayerActivity.showV1010PullToggle() {
    val current = FeaturePrefsStore.batch1001.v1010pull
    FeaturePrefsStore.batch1001.v1010pull = !current
    AppToast.show(this, "pull: ${if (!current) "ON" else "OFF"}")
}

// v1010: pure mode
internal fun PlayerActivity.showV1010PureToggle() {
    val current = FeaturePrefsStore.batch1001.v1010pure
    FeaturePrefsStore.batch1001.v1010pure = !current
    AppToast.show(this, "pure: ${if (!current) "ON" else "OFF"}")
}

// v1010: push mode
internal fun PlayerActivity.showV1010PushToggle() {
    val current = FeaturePrefsStore.batch1001.v1010push
    FeaturePrefsStore.batch1001.v1010push = !current
    AppToast.show(this, "push: ${if (!current) "ON" else "OFF"}")
}

