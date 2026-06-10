package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v811: enable mode
internal fun PlayerActivity.showV811EnableToggle() {
    val current = FeaturePrefsStore.batch811.v811enable
    FeaturePrefsStore.batch811.v811enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v811: encode mode
internal fun PlayerActivity.showV811EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v811encode
    FeaturePrefsStore.batch811.v811encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v811: encrypt mode
internal fun PlayerActivity.showV811EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v811encrypt
    FeaturePrefsStore.batch811.v811encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v811: end mode
internal fun PlayerActivity.showV811EndToggle() {
    val current = FeaturePrefsStore.batch811.v811end
    FeaturePrefsStore.batch811.v811end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v811: endpoint mode
internal fun PlayerActivity.showV811EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v811endpoint
    FeaturePrefsStore.batch811.v811endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v811: enter level
internal fun PlayerActivity.showV811EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v811enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v811enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v811: entry level
internal fun PlayerActivity.showV811EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v811entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v811entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v811: enum level
internal fun PlayerActivity.showV811EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v811enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v811enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v811: environment level
internal fun PlayerActivity.showV811EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v811environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v811environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v811: equal level
internal fun PlayerActivity.showV811EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v811equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v811equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v811: escape mode
internal fun PlayerActivity.showV811EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v811escape
    FeaturePrefsStore.batch811.v811escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v811: estimate mode
internal fun PlayerActivity.showV811EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v811estimate
    FeaturePrefsStore.batch811.v811estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v811: evaluate mode
internal fun PlayerActivity.showV811EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v811evaluate
    FeaturePrefsStore.batch811.v811evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v811: examine mode
internal fun PlayerActivity.showV811ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v811examine
    FeaturePrefsStore.batch811.v811examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v811: exchange mode
internal fun PlayerActivity.showV811ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v811exchange
    FeaturePrefsStore.batch811.v811exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v812: enable mode
internal fun PlayerActivity.showV812EnableToggle() {
    val current = FeaturePrefsStore.batch811.v812enable
    FeaturePrefsStore.batch811.v812enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v812: encode mode
internal fun PlayerActivity.showV812EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v812encode
    FeaturePrefsStore.batch811.v812encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v812: encrypt mode
internal fun PlayerActivity.showV812EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v812encrypt
    FeaturePrefsStore.batch811.v812encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v812: end mode
internal fun PlayerActivity.showV812EndToggle() {
    val current = FeaturePrefsStore.batch811.v812end
    FeaturePrefsStore.batch811.v812end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v812: endpoint mode
internal fun PlayerActivity.showV812EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v812endpoint
    FeaturePrefsStore.batch811.v812endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v812: enter level
internal fun PlayerActivity.showV812EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v812enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v812enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v812: entry level
internal fun PlayerActivity.showV812EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v812entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v812entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v812: enum level
internal fun PlayerActivity.showV812EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v812enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v812enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v812: environment level
internal fun PlayerActivity.showV812EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v812environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v812environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v812: equal level
internal fun PlayerActivity.showV812EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v812equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v812equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v812: escape mode
internal fun PlayerActivity.showV812EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v812escape
    FeaturePrefsStore.batch811.v812escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v812: estimate mode
internal fun PlayerActivity.showV812EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v812estimate
    FeaturePrefsStore.batch811.v812estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v812: evaluate mode
internal fun PlayerActivity.showV812EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v812evaluate
    FeaturePrefsStore.batch811.v812evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v812: examine mode
internal fun PlayerActivity.showV812ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v812examine
    FeaturePrefsStore.batch811.v812examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v812: exchange mode
internal fun PlayerActivity.showV812ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v812exchange
    FeaturePrefsStore.batch811.v812exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v813: enable mode
internal fun PlayerActivity.showV813EnableToggle() {
    val current = FeaturePrefsStore.batch811.v813enable
    FeaturePrefsStore.batch811.v813enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v813: encode mode
internal fun PlayerActivity.showV813EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v813encode
    FeaturePrefsStore.batch811.v813encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v813: encrypt mode
internal fun PlayerActivity.showV813EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v813encrypt
    FeaturePrefsStore.batch811.v813encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v813: end mode
internal fun PlayerActivity.showV813EndToggle() {
    val current = FeaturePrefsStore.batch811.v813end
    FeaturePrefsStore.batch811.v813end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v813: endpoint mode
internal fun PlayerActivity.showV813EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v813endpoint
    FeaturePrefsStore.batch811.v813endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v813: enter level
internal fun PlayerActivity.showV813EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v813enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v813enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v813: entry level
internal fun PlayerActivity.showV813EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v813entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v813entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v813: enum level
internal fun PlayerActivity.showV813EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v813enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v813enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v813: environment level
internal fun PlayerActivity.showV813EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v813environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v813environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v813: equal level
internal fun PlayerActivity.showV813EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v813equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v813equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v813: escape mode
internal fun PlayerActivity.showV813EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v813escape
    FeaturePrefsStore.batch811.v813escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v813: estimate mode
internal fun PlayerActivity.showV813EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v813estimate
    FeaturePrefsStore.batch811.v813estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v813: evaluate mode
internal fun PlayerActivity.showV813EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v813evaluate
    FeaturePrefsStore.batch811.v813evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v813: examine mode
internal fun PlayerActivity.showV813ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v813examine
    FeaturePrefsStore.batch811.v813examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v813: exchange mode
internal fun PlayerActivity.showV813ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v813exchange
    FeaturePrefsStore.batch811.v813exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v814: enable mode
internal fun PlayerActivity.showV814EnableToggle() {
    val current = FeaturePrefsStore.batch811.v814enable
    FeaturePrefsStore.batch811.v814enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v814: encode mode
internal fun PlayerActivity.showV814EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v814encode
    FeaturePrefsStore.batch811.v814encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v814: encrypt mode
internal fun PlayerActivity.showV814EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v814encrypt
    FeaturePrefsStore.batch811.v814encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v814: end mode
internal fun PlayerActivity.showV814EndToggle() {
    val current = FeaturePrefsStore.batch811.v814end
    FeaturePrefsStore.batch811.v814end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v814: endpoint mode
internal fun PlayerActivity.showV814EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v814endpoint
    FeaturePrefsStore.batch811.v814endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v814: enter level
internal fun PlayerActivity.showV814EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v814enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v814enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v814: entry level
internal fun PlayerActivity.showV814EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v814entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v814entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v814: enum level
internal fun PlayerActivity.showV814EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v814enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v814enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v814: environment level
internal fun PlayerActivity.showV814EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v814environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v814environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v814: equal level
internal fun PlayerActivity.showV814EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v814equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v814equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v814: escape mode
internal fun PlayerActivity.showV814EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v814escape
    FeaturePrefsStore.batch811.v814escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v814: estimate mode
internal fun PlayerActivity.showV814EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v814estimate
    FeaturePrefsStore.batch811.v814estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v814: evaluate mode
internal fun PlayerActivity.showV814EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v814evaluate
    FeaturePrefsStore.batch811.v814evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v814: examine mode
internal fun PlayerActivity.showV814ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v814examine
    FeaturePrefsStore.batch811.v814examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v814: exchange mode
internal fun PlayerActivity.showV814ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v814exchange
    FeaturePrefsStore.batch811.v814exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v815: enable mode
internal fun PlayerActivity.showV815EnableToggle() {
    val current = FeaturePrefsStore.batch811.v815enable
    FeaturePrefsStore.batch811.v815enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v815: encode mode
internal fun PlayerActivity.showV815EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v815encode
    FeaturePrefsStore.batch811.v815encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v815: encrypt mode
internal fun PlayerActivity.showV815EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v815encrypt
    FeaturePrefsStore.batch811.v815encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v815: end mode
internal fun PlayerActivity.showV815EndToggle() {
    val current = FeaturePrefsStore.batch811.v815end
    FeaturePrefsStore.batch811.v815end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v815: endpoint mode
internal fun PlayerActivity.showV815EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v815endpoint
    FeaturePrefsStore.batch811.v815endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v815: enter level
internal fun PlayerActivity.showV815EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v815enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v815enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v815: entry level
internal fun PlayerActivity.showV815EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v815entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v815entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v815: enum level
internal fun PlayerActivity.showV815EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v815enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v815enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v815: environment level
internal fun PlayerActivity.showV815EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v815environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v815environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v815: equal level
internal fun PlayerActivity.showV815EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v815equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v815equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v815: escape mode
internal fun PlayerActivity.showV815EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v815escape
    FeaturePrefsStore.batch811.v815escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v815: estimate mode
internal fun PlayerActivity.showV815EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v815estimate
    FeaturePrefsStore.batch811.v815estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v815: evaluate mode
internal fun PlayerActivity.showV815EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v815evaluate
    FeaturePrefsStore.batch811.v815evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v815: examine mode
internal fun PlayerActivity.showV815ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v815examine
    FeaturePrefsStore.batch811.v815examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v815: exchange mode
internal fun PlayerActivity.showV815ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v815exchange
    FeaturePrefsStore.batch811.v815exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v816: enable mode
internal fun PlayerActivity.showV816EnableToggle() {
    val current = FeaturePrefsStore.batch811.v816enable
    FeaturePrefsStore.batch811.v816enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v816: encode mode
internal fun PlayerActivity.showV816EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v816encode
    FeaturePrefsStore.batch811.v816encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v816: encrypt mode
internal fun PlayerActivity.showV816EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v816encrypt
    FeaturePrefsStore.batch811.v816encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v816: end mode
internal fun PlayerActivity.showV816EndToggle() {
    val current = FeaturePrefsStore.batch811.v816end
    FeaturePrefsStore.batch811.v816end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v816: endpoint mode
internal fun PlayerActivity.showV816EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v816endpoint
    FeaturePrefsStore.batch811.v816endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v816: enter level
internal fun PlayerActivity.showV816EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v816enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v816enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v816: entry level
internal fun PlayerActivity.showV816EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v816entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v816entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v816: enum level
internal fun PlayerActivity.showV816EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v816enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v816enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v816: environment level
internal fun PlayerActivity.showV816EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v816environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v816environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v816: equal level
internal fun PlayerActivity.showV816EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v816equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v816equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v816: escape mode
internal fun PlayerActivity.showV816EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v816escape
    FeaturePrefsStore.batch811.v816escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v816: estimate mode
internal fun PlayerActivity.showV816EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v816estimate
    FeaturePrefsStore.batch811.v816estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v816: evaluate mode
internal fun PlayerActivity.showV816EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v816evaluate
    FeaturePrefsStore.batch811.v816evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v816: examine mode
internal fun PlayerActivity.showV816ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v816examine
    FeaturePrefsStore.batch811.v816examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v816: exchange mode
internal fun PlayerActivity.showV816ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v816exchange
    FeaturePrefsStore.batch811.v816exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v817: enable mode
internal fun PlayerActivity.showV817EnableToggle() {
    val current = FeaturePrefsStore.batch811.v817enable
    FeaturePrefsStore.batch811.v817enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v817: encode mode
internal fun PlayerActivity.showV817EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v817encode
    FeaturePrefsStore.batch811.v817encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v817: encrypt mode
internal fun PlayerActivity.showV817EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v817encrypt
    FeaturePrefsStore.batch811.v817encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v817: end mode
internal fun PlayerActivity.showV817EndToggle() {
    val current = FeaturePrefsStore.batch811.v817end
    FeaturePrefsStore.batch811.v817end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v817: endpoint mode
internal fun PlayerActivity.showV817EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v817endpoint
    FeaturePrefsStore.batch811.v817endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v817: enter level
internal fun PlayerActivity.showV817EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v817enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v817enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v817: entry level
internal fun PlayerActivity.showV817EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v817entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v817entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v817: enum level
internal fun PlayerActivity.showV817EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v817enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v817enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v817: environment level
internal fun PlayerActivity.showV817EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v817environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v817environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v817: equal level
internal fun PlayerActivity.showV817EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v817equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v817equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v817: escape mode
internal fun PlayerActivity.showV817EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v817escape
    FeaturePrefsStore.batch811.v817escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v817: estimate mode
internal fun PlayerActivity.showV817EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v817estimate
    FeaturePrefsStore.batch811.v817estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v817: evaluate mode
internal fun PlayerActivity.showV817EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v817evaluate
    FeaturePrefsStore.batch811.v817evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v817: examine mode
internal fun PlayerActivity.showV817ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v817examine
    FeaturePrefsStore.batch811.v817examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v817: exchange mode
internal fun PlayerActivity.showV817ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v817exchange
    FeaturePrefsStore.batch811.v817exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v818: enable mode
internal fun PlayerActivity.showV818EnableToggle() {
    val current = FeaturePrefsStore.batch811.v818enable
    FeaturePrefsStore.batch811.v818enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v818: encode mode
internal fun PlayerActivity.showV818EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v818encode
    FeaturePrefsStore.batch811.v818encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v818: encrypt mode
internal fun PlayerActivity.showV818EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v818encrypt
    FeaturePrefsStore.batch811.v818encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v818: end mode
internal fun PlayerActivity.showV818EndToggle() {
    val current = FeaturePrefsStore.batch811.v818end
    FeaturePrefsStore.batch811.v818end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v818: endpoint mode
internal fun PlayerActivity.showV818EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v818endpoint
    FeaturePrefsStore.batch811.v818endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v818: enter level
internal fun PlayerActivity.showV818EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v818enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v818enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v818: entry level
internal fun PlayerActivity.showV818EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v818entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v818entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v818: enum level
internal fun PlayerActivity.showV818EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v818enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v818enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v818: environment level
internal fun PlayerActivity.showV818EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v818environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v818environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v818: equal level
internal fun PlayerActivity.showV818EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v818equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v818equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v818: escape mode
internal fun PlayerActivity.showV818EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v818escape
    FeaturePrefsStore.batch811.v818escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v818: estimate mode
internal fun PlayerActivity.showV818EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v818estimate
    FeaturePrefsStore.batch811.v818estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v818: evaluate mode
internal fun PlayerActivity.showV818EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v818evaluate
    FeaturePrefsStore.batch811.v818evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v818: examine mode
internal fun PlayerActivity.showV818ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v818examine
    FeaturePrefsStore.batch811.v818examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v818: exchange mode
internal fun PlayerActivity.showV818ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v818exchange
    FeaturePrefsStore.batch811.v818exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v819: enable mode
internal fun PlayerActivity.showV819EnableToggle() {
    val current = FeaturePrefsStore.batch811.v819enable
    FeaturePrefsStore.batch811.v819enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v819: encode mode
internal fun PlayerActivity.showV819EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v819encode
    FeaturePrefsStore.batch811.v819encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v819: encrypt mode
internal fun PlayerActivity.showV819EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v819encrypt
    FeaturePrefsStore.batch811.v819encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v819: end mode
internal fun PlayerActivity.showV819EndToggle() {
    val current = FeaturePrefsStore.batch811.v819end
    FeaturePrefsStore.batch811.v819end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v819: endpoint mode
internal fun PlayerActivity.showV819EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v819endpoint
    FeaturePrefsStore.batch811.v819endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v819: enter level
internal fun PlayerActivity.showV819EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v819enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v819enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v819: entry level
internal fun PlayerActivity.showV819EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v819entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v819entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v819: enum level
internal fun PlayerActivity.showV819EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v819enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v819enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v819: environment level
internal fun PlayerActivity.showV819EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v819environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v819environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v819: equal level
internal fun PlayerActivity.showV819EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v819equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v819equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v819: escape mode
internal fun PlayerActivity.showV819EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v819escape
    FeaturePrefsStore.batch811.v819escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v819: estimate mode
internal fun PlayerActivity.showV819EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v819estimate
    FeaturePrefsStore.batch811.v819estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v819: evaluate mode
internal fun PlayerActivity.showV819EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v819evaluate
    FeaturePrefsStore.batch811.v819evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v819: examine mode
internal fun PlayerActivity.showV819ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v819examine
    FeaturePrefsStore.batch811.v819examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v819: exchange mode
internal fun PlayerActivity.showV819ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v819exchange
    FeaturePrefsStore.batch811.v819exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

// v820: enable mode
internal fun PlayerActivity.showV820EnableToggle() {
    val current = FeaturePrefsStore.batch811.v820enable
    FeaturePrefsStore.batch811.v820enable = !current
    AppToast.show(this, "enable: ${if (!current) "ON" else "OFF"}")
}

// v820: encode mode
internal fun PlayerActivity.showV820EncodeToggle() {
    val current = FeaturePrefsStore.batch811.v820encode
    FeaturePrefsStore.batch811.v820encode = !current
    AppToast.show(this, "encode: ${if (!current) "ON" else "OFF"}")
}

// v820: encrypt mode
internal fun PlayerActivity.showV820EncryptToggle() {
    val current = FeaturePrefsStore.batch811.v820encrypt
    FeaturePrefsStore.batch811.v820encrypt = !current
    AppToast.show(this, "encrypt: ${if (!current) "ON" else "OFF"}")
}

// v820: end mode
internal fun PlayerActivity.showV820EndToggle() {
    val current = FeaturePrefsStore.batch811.v820end
    FeaturePrefsStore.batch811.v820end = !current
    AppToast.show(this, "end: ${if (!current) "ON" else "OFF"}")
}

// v820: endpoint mode
internal fun PlayerActivity.showV820EndpointToggle() {
    val current = FeaturePrefsStore.batch811.v820endpoint
    FeaturePrefsStore.batch811.v820endpoint = !current
    AppToast.show(this, "endpoint: ${if (!current) "ON" else "OFF"}")
}

// v820: enter level
internal fun PlayerActivity.showV820EnterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v820enter).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enter level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v820enter = value
        AppToast.show(this, "enter: $value")
    }
}

// v820: entry level
internal fun PlayerActivity.showV820EntryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v820entry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "entry level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v820entry = value
        AppToast.show(this, "entry: $value")
    }
}

// v820: enum level
internal fun PlayerActivity.showV820EnumDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v820enum).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "enum level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v820enum = value
        AppToast.show(this, "enum: $value")
    }
}

// v820: environment level
internal fun PlayerActivity.showV820EnvironmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v820environment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "environment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v820environment = value
        AppToast.show(this, "environment: $value")
    }
}

// v820: equal level
internal fun PlayerActivity.showV820EqualDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch811.v820equal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "equal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch811.v820equal = value
        AppToast.show(this, "equal: $value")
    }
}

// v820: escape mode
internal fun PlayerActivity.showV820EscapeToggle() {
    val current = FeaturePrefsStore.batch811.v820escape
    FeaturePrefsStore.batch811.v820escape = !current
    AppToast.show(this, "escape: ${if (!current) "ON" else "OFF"}")
}

// v820: estimate mode
internal fun PlayerActivity.showV820EstimateToggle() {
    val current = FeaturePrefsStore.batch811.v820estimate
    FeaturePrefsStore.batch811.v820estimate = !current
    AppToast.show(this, "estimate: ${if (!current) "ON" else "OFF"}")
}

// v820: evaluate mode
internal fun PlayerActivity.showV820EvaluateToggle() {
    val current = FeaturePrefsStore.batch811.v820evaluate
    FeaturePrefsStore.batch811.v820evaluate = !current
    AppToast.show(this, "evaluate: ${if (!current) "ON" else "OFF"}")
}

// v820: examine mode
internal fun PlayerActivity.showV820ExamineToggle() {
    val current = FeaturePrefsStore.batch811.v820examine
    FeaturePrefsStore.batch811.v820examine = !current
    AppToast.show(this, "examine: ${if (!current) "ON" else "OFF"}")
}

// v820: exchange mode
internal fun PlayerActivity.showV820ExchangeToggle() {
    val current = FeaturePrefsStore.batch811.v820exchange
    FeaturePrefsStore.batch811.v820exchange = !current
    AppToast.show(this, "exchange: ${if (!current) "ON" else "OFF"}")
}

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

// v831: fetch mode
internal fun PlayerActivity.showV831FetchToggle() {
    val current = FeaturePrefsStore.batch831.v831fetch
    FeaturePrefsStore.batch831.v831fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v831: field mode
internal fun PlayerActivity.showV831FieldToggle() {
    val current = FeaturePrefsStore.batch831.v831field
    FeaturePrefsStore.batch831.v831field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v831: file mode
internal fun PlayerActivity.showV831FileToggle() {
    val current = FeaturePrefsStore.batch831.v831file
    FeaturePrefsStore.batch831.v831file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v831: fill mode
internal fun PlayerActivity.showV831FillToggle() {
    val current = FeaturePrefsStore.batch831.v831fill
    FeaturePrefsStore.batch831.v831fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v831: filter mode
internal fun PlayerActivity.showV831FilterToggle() {
    val current = FeaturePrefsStore.batch831.v831filter
    FeaturePrefsStore.batch831.v831filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v831: final level
internal fun PlayerActivity.showV831FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831final = value
        AppToast.show(this, "final: $value")
    }
}

// v831: find level
internal fun PlayerActivity.showV831FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831find = value
        AppToast.show(this, "find: $value")
    }
}

// v831: finger level
internal fun PlayerActivity.showV831FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v831: finish level
internal fun PlayerActivity.showV831FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v831: fire level
internal fun PlayerActivity.showV831FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v831fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v831fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v831: firmware mode
internal fun PlayerActivity.showV831FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v831firmware
    FeaturePrefsStore.batch831.v831firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v831: flag mode
internal fun PlayerActivity.showV831FlagToggle() {
    val current = FeaturePrefsStore.batch831.v831flag
    FeaturePrefsStore.batch831.v831flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v831: flash mode
internal fun PlayerActivity.showV831FlashToggle() {
    val current = FeaturePrefsStore.batch831.v831flash
    FeaturePrefsStore.batch831.v831flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v831: flat mode
internal fun PlayerActivity.showV831FlatToggle() {
    val current = FeaturePrefsStore.batch831.v831flat
    FeaturePrefsStore.batch831.v831flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v831: flip mode
internal fun PlayerActivity.showV831FlipToggle() {
    val current = FeaturePrefsStore.batch831.v831flip
    FeaturePrefsStore.batch831.v831flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v832: fetch mode
internal fun PlayerActivity.showV832FetchToggle() {
    val current = FeaturePrefsStore.batch831.v832fetch
    FeaturePrefsStore.batch831.v832fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v832: field mode
internal fun PlayerActivity.showV832FieldToggle() {
    val current = FeaturePrefsStore.batch831.v832field
    FeaturePrefsStore.batch831.v832field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v832: file mode
internal fun PlayerActivity.showV832FileToggle() {
    val current = FeaturePrefsStore.batch831.v832file
    FeaturePrefsStore.batch831.v832file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v832: fill mode
internal fun PlayerActivity.showV832FillToggle() {
    val current = FeaturePrefsStore.batch831.v832fill
    FeaturePrefsStore.batch831.v832fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v832: filter mode
internal fun PlayerActivity.showV832FilterToggle() {
    val current = FeaturePrefsStore.batch831.v832filter
    FeaturePrefsStore.batch831.v832filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v832: final level
internal fun PlayerActivity.showV832FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832final = value
        AppToast.show(this, "final: $value")
    }
}

// v832: find level
internal fun PlayerActivity.showV832FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832find = value
        AppToast.show(this, "find: $value")
    }
}

// v832: finger level
internal fun PlayerActivity.showV832FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v832: finish level
internal fun PlayerActivity.showV832FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v832: fire level
internal fun PlayerActivity.showV832FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v832fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v832fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v832: firmware mode
internal fun PlayerActivity.showV832FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v832firmware
    FeaturePrefsStore.batch831.v832firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v832: flag mode
internal fun PlayerActivity.showV832FlagToggle() {
    val current = FeaturePrefsStore.batch831.v832flag
    FeaturePrefsStore.batch831.v832flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v832: flash mode
internal fun PlayerActivity.showV832FlashToggle() {
    val current = FeaturePrefsStore.batch831.v832flash
    FeaturePrefsStore.batch831.v832flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v832: flat mode
internal fun PlayerActivity.showV832FlatToggle() {
    val current = FeaturePrefsStore.batch831.v832flat
    FeaturePrefsStore.batch831.v832flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v832: flip mode
internal fun PlayerActivity.showV832FlipToggle() {
    val current = FeaturePrefsStore.batch831.v832flip
    FeaturePrefsStore.batch831.v832flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v833: fetch mode
internal fun PlayerActivity.showV833FetchToggle() {
    val current = FeaturePrefsStore.batch831.v833fetch
    FeaturePrefsStore.batch831.v833fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v833: field mode
internal fun PlayerActivity.showV833FieldToggle() {
    val current = FeaturePrefsStore.batch831.v833field
    FeaturePrefsStore.batch831.v833field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v833: file mode
internal fun PlayerActivity.showV833FileToggle() {
    val current = FeaturePrefsStore.batch831.v833file
    FeaturePrefsStore.batch831.v833file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v833: fill mode
internal fun PlayerActivity.showV833FillToggle() {
    val current = FeaturePrefsStore.batch831.v833fill
    FeaturePrefsStore.batch831.v833fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v833: filter mode
internal fun PlayerActivity.showV833FilterToggle() {
    val current = FeaturePrefsStore.batch831.v833filter
    FeaturePrefsStore.batch831.v833filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v833: final level
internal fun PlayerActivity.showV833FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833final = value
        AppToast.show(this, "final: $value")
    }
}

// v833: find level
internal fun PlayerActivity.showV833FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833find = value
        AppToast.show(this, "find: $value")
    }
}

// v833: finger level
internal fun PlayerActivity.showV833FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v833: finish level
internal fun PlayerActivity.showV833FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v833: fire level
internal fun PlayerActivity.showV833FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v833fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v833fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v833: firmware mode
internal fun PlayerActivity.showV833FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v833firmware
    FeaturePrefsStore.batch831.v833firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v833: flag mode
internal fun PlayerActivity.showV833FlagToggle() {
    val current = FeaturePrefsStore.batch831.v833flag
    FeaturePrefsStore.batch831.v833flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v833: flash mode
internal fun PlayerActivity.showV833FlashToggle() {
    val current = FeaturePrefsStore.batch831.v833flash
    FeaturePrefsStore.batch831.v833flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v833: flat mode
internal fun PlayerActivity.showV833FlatToggle() {
    val current = FeaturePrefsStore.batch831.v833flat
    FeaturePrefsStore.batch831.v833flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v833: flip mode
internal fun PlayerActivity.showV833FlipToggle() {
    val current = FeaturePrefsStore.batch831.v833flip
    FeaturePrefsStore.batch831.v833flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v834: fetch mode
internal fun PlayerActivity.showV834FetchToggle() {
    val current = FeaturePrefsStore.batch831.v834fetch
    FeaturePrefsStore.batch831.v834fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v834: field mode
internal fun PlayerActivity.showV834FieldToggle() {
    val current = FeaturePrefsStore.batch831.v834field
    FeaturePrefsStore.batch831.v834field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v834: file mode
internal fun PlayerActivity.showV834FileToggle() {
    val current = FeaturePrefsStore.batch831.v834file
    FeaturePrefsStore.batch831.v834file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v834: fill mode
internal fun PlayerActivity.showV834FillToggle() {
    val current = FeaturePrefsStore.batch831.v834fill
    FeaturePrefsStore.batch831.v834fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v834: filter mode
internal fun PlayerActivity.showV834FilterToggle() {
    val current = FeaturePrefsStore.batch831.v834filter
    FeaturePrefsStore.batch831.v834filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v834: final level
internal fun PlayerActivity.showV834FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834final = value
        AppToast.show(this, "final: $value")
    }
}

// v834: find level
internal fun PlayerActivity.showV834FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834find = value
        AppToast.show(this, "find: $value")
    }
}

// v834: finger level
internal fun PlayerActivity.showV834FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v834: finish level
internal fun PlayerActivity.showV834FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v834: fire level
internal fun PlayerActivity.showV834FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v834fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v834fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v834: firmware mode
internal fun PlayerActivity.showV834FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v834firmware
    FeaturePrefsStore.batch831.v834firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v834: flag mode
internal fun PlayerActivity.showV834FlagToggle() {
    val current = FeaturePrefsStore.batch831.v834flag
    FeaturePrefsStore.batch831.v834flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v834: flash mode
internal fun PlayerActivity.showV834FlashToggle() {
    val current = FeaturePrefsStore.batch831.v834flash
    FeaturePrefsStore.batch831.v834flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v834: flat mode
internal fun PlayerActivity.showV834FlatToggle() {
    val current = FeaturePrefsStore.batch831.v834flat
    FeaturePrefsStore.batch831.v834flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v834: flip mode
internal fun PlayerActivity.showV834FlipToggle() {
    val current = FeaturePrefsStore.batch831.v834flip
    FeaturePrefsStore.batch831.v834flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v835: fetch mode
internal fun PlayerActivity.showV835FetchToggle() {
    val current = FeaturePrefsStore.batch831.v835fetch
    FeaturePrefsStore.batch831.v835fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v835: field mode
internal fun PlayerActivity.showV835FieldToggle() {
    val current = FeaturePrefsStore.batch831.v835field
    FeaturePrefsStore.batch831.v835field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v835: file mode
internal fun PlayerActivity.showV835FileToggle() {
    val current = FeaturePrefsStore.batch831.v835file
    FeaturePrefsStore.batch831.v835file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v835: fill mode
internal fun PlayerActivity.showV835FillToggle() {
    val current = FeaturePrefsStore.batch831.v835fill
    FeaturePrefsStore.batch831.v835fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v835: filter mode
internal fun PlayerActivity.showV835FilterToggle() {
    val current = FeaturePrefsStore.batch831.v835filter
    FeaturePrefsStore.batch831.v835filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v835: final level
internal fun PlayerActivity.showV835FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835final = value
        AppToast.show(this, "final: $value")
    }
}

// v835: find level
internal fun PlayerActivity.showV835FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835find = value
        AppToast.show(this, "find: $value")
    }
}

// v835: finger level
internal fun PlayerActivity.showV835FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v835: finish level
internal fun PlayerActivity.showV835FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v835: fire level
internal fun PlayerActivity.showV835FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v835fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v835fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v835: firmware mode
internal fun PlayerActivity.showV835FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v835firmware
    FeaturePrefsStore.batch831.v835firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v835: flag mode
internal fun PlayerActivity.showV835FlagToggle() {
    val current = FeaturePrefsStore.batch831.v835flag
    FeaturePrefsStore.batch831.v835flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v835: flash mode
internal fun PlayerActivity.showV835FlashToggle() {
    val current = FeaturePrefsStore.batch831.v835flash
    FeaturePrefsStore.batch831.v835flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v835: flat mode
internal fun PlayerActivity.showV835FlatToggle() {
    val current = FeaturePrefsStore.batch831.v835flat
    FeaturePrefsStore.batch831.v835flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v835: flip mode
internal fun PlayerActivity.showV835FlipToggle() {
    val current = FeaturePrefsStore.batch831.v835flip
    FeaturePrefsStore.batch831.v835flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v836: fetch mode
internal fun PlayerActivity.showV836FetchToggle() {
    val current = FeaturePrefsStore.batch831.v836fetch
    FeaturePrefsStore.batch831.v836fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v836: field mode
internal fun PlayerActivity.showV836FieldToggle() {
    val current = FeaturePrefsStore.batch831.v836field
    FeaturePrefsStore.batch831.v836field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v836: file mode
internal fun PlayerActivity.showV836FileToggle() {
    val current = FeaturePrefsStore.batch831.v836file
    FeaturePrefsStore.batch831.v836file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v836: fill mode
internal fun PlayerActivity.showV836FillToggle() {
    val current = FeaturePrefsStore.batch831.v836fill
    FeaturePrefsStore.batch831.v836fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v836: filter mode
internal fun PlayerActivity.showV836FilterToggle() {
    val current = FeaturePrefsStore.batch831.v836filter
    FeaturePrefsStore.batch831.v836filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v836: final level
internal fun PlayerActivity.showV836FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836final = value
        AppToast.show(this, "final: $value")
    }
}

// v836: find level
internal fun PlayerActivity.showV836FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836find = value
        AppToast.show(this, "find: $value")
    }
}

// v836: finger level
internal fun PlayerActivity.showV836FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v836: finish level
internal fun PlayerActivity.showV836FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v836: fire level
internal fun PlayerActivity.showV836FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v836fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v836fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v836: firmware mode
internal fun PlayerActivity.showV836FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v836firmware
    FeaturePrefsStore.batch831.v836firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v836: flag mode
internal fun PlayerActivity.showV836FlagToggle() {
    val current = FeaturePrefsStore.batch831.v836flag
    FeaturePrefsStore.batch831.v836flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v836: flash mode
internal fun PlayerActivity.showV836FlashToggle() {
    val current = FeaturePrefsStore.batch831.v836flash
    FeaturePrefsStore.batch831.v836flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v836: flat mode
internal fun PlayerActivity.showV836FlatToggle() {
    val current = FeaturePrefsStore.batch831.v836flat
    FeaturePrefsStore.batch831.v836flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v836: flip mode
internal fun PlayerActivity.showV836FlipToggle() {
    val current = FeaturePrefsStore.batch831.v836flip
    FeaturePrefsStore.batch831.v836flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v837: fetch mode
internal fun PlayerActivity.showV837FetchToggle() {
    val current = FeaturePrefsStore.batch831.v837fetch
    FeaturePrefsStore.batch831.v837fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v837: field mode
internal fun PlayerActivity.showV837FieldToggle() {
    val current = FeaturePrefsStore.batch831.v837field
    FeaturePrefsStore.batch831.v837field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v837: file mode
internal fun PlayerActivity.showV837FileToggle() {
    val current = FeaturePrefsStore.batch831.v837file
    FeaturePrefsStore.batch831.v837file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v837: fill mode
internal fun PlayerActivity.showV837FillToggle() {
    val current = FeaturePrefsStore.batch831.v837fill
    FeaturePrefsStore.batch831.v837fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v837: filter mode
internal fun PlayerActivity.showV837FilterToggle() {
    val current = FeaturePrefsStore.batch831.v837filter
    FeaturePrefsStore.batch831.v837filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v837: final level
internal fun PlayerActivity.showV837FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837final = value
        AppToast.show(this, "final: $value")
    }
}

// v837: find level
internal fun PlayerActivity.showV837FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837find = value
        AppToast.show(this, "find: $value")
    }
}

// v837: finger level
internal fun PlayerActivity.showV837FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v837: finish level
internal fun PlayerActivity.showV837FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v837: fire level
internal fun PlayerActivity.showV837FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v837fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v837fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v837: firmware mode
internal fun PlayerActivity.showV837FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v837firmware
    FeaturePrefsStore.batch831.v837firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v837: flag mode
internal fun PlayerActivity.showV837FlagToggle() {
    val current = FeaturePrefsStore.batch831.v837flag
    FeaturePrefsStore.batch831.v837flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v837: flash mode
internal fun PlayerActivity.showV837FlashToggle() {
    val current = FeaturePrefsStore.batch831.v837flash
    FeaturePrefsStore.batch831.v837flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v837: flat mode
internal fun PlayerActivity.showV837FlatToggle() {
    val current = FeaturePrefsStore.batch831.v837flat
    FeaturePrefsStore.batch831.v837flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v837: flip mode
internal fun PlayerActivity.showV837FlipToggle() {
    val current = FeaturePrefsStore.batch831.v837flip
    FeaturePrefsStore.batch831.v837flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v838: fetch mode
internal fun PlayerActivity.showV838FetchToggle() {
    val current = FeaturePrefsStore.batch831.v838fetch
    FeaturePrefsStore.batch831.v838fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v838: field mode
internal fun PlayerActivity.showV838FieldToggle() {
    val current = FeaturePrefsStore.batch831.v838field
    FeaturePrefsStore.batch831.v838field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v838: file mode
internal fun PlayerActivity.showV838FileToggle() {
    val current = FeaturePrefsStore.batch831.v838file
    FeaturePrefsStore.batch831.v838file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v838: fill mode
internal fun PlayerActivity.showV838FillToggle() {
    val current = FeaturePrefsStore.batch831.v838fill
    FeaturePrefsStore.batch831.v838fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v838: filter mode
internal fun PlayerActivity.showV838FilterToggle() {
    val current = FeaturePrefsStore.batch831.v838filter
    FeaturePrefsStore.batch831.v838filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v838: final level
internal fun PlayerActivity.showV838FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838final = value
        AppToast.show(this, "final: $value")
    }
}

// v838: find level
internal fun PlayerActivity.showV838FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838find = value
        AppToast.show(this, "find: $value")
    }
}

// v838: finger level
internal fun PlayerActivity.showV838FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v838: finish level
internal fun PlayerActivity.showV838FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v838: fire level
internal fun PlayerActivity.showV838FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v838fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v838fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v838: firmware mode
internal fun PlayerActivity.showV838FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v838firmware
    FeaturePrefsStore.batch831.v838firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v838: flag mode
internal fun PlayerActivity.showV838FlagToggle() {
    val current = FeaturePrefsStore.batch831.v838flag
    FeaturePrefsStore.batch831.v838flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v838: flash mode
internal fun PlayerActivity.showV838FlashToggle() {
    val current = FeaturePrefsStore.batch831.v838flash
    FeaturePrefsStore.batch831.v838flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v838: flat mode
internal fun PlayerActivity.showV838FlatToggle() {
    val current = FeaturePrefsStore.batch831.v838flat
    FeaturePrefsStore.batch831.v838flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v838: flip mode
internal fun PlayerActivity.showV838FlipToggle() {
    val current = FeaturePrefsStore.batch831.v838flip
    FeaturePrefsStore.batch831.v838flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v839: fetch mode
internal fun PlayerActivity.showV839FetchToggle() {
    val current = FeaturePrefsStore.batch831.v839fetch
    FeaturePrefsStore.batch831.v839fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v839: field mode
internal fun PlayerActivity.showV839FieldToggle() {
    val current = FeaturePrefsStore.batch831.v839field
    FeaturePrefsStore.batch831.v839field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v839: file mode
internal fun PlayerActivity.showV839FileToggle() {
    val current = FeaturePrefsStore.batch831.v839file
    FeaturePrefsStore.batch831.v839file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v839: fill mode
internal fun PlayerActivity.showV839FillToggle() {
    val current = FeaturePrefsStore.batch831.v839fill
    FeaturePrefsStore.batch831.v839fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v839: filter mode
internal fun PlayerActivity.showV839FilterToggle() {
    val current = FeaturePrefsStore.batch831.v839filter
    FeaturePrefsStore.batch831.v839filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v839: final level
internal fun PlayerActivity.showV839FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839final = value
        AppToast.show(this, "final: $value")
    }
}

// v839: find level
internal fun PlayerActivity.showV839FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839find = value
        AppToast.show(this, "find: $value")
    }
}

// v839: finger level
internal fun PlayerActivity.showV839FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v839: finish level
internal fun PlayerActivity.showV839FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v839: fire level
internal fun PlayerActivity.showV839FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v839fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v839fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v839: firmware mode
internal fun PlayerActivity.showV839FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v839firmware
    FeaturePrefsStore.batch831.v839firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v839: flag mode
internal fun PlayerActivity.showV839FlagToggle() {
    val current = FeaturePrefsStore.batch831.v839flag
    FeaturePrefsStore.batch831.v839flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v839: flash mode
internal fun PlayerActivity.showV839FlashToggle() {
    val current = FeaturePrefsStore.batch831.v839flash
    FeaturePrefsStore.batch831.v839flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v839: flat mode
internal fun PlayerActivity.showV839FlatToggle() {
    val current = FeaturePrefsStore.batch831.v839flat
    FeaturePrefsStore.batch831.v839flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v839: flip mode
internal fun PlayerActivity.showV839FlipToggle() {
    val current = FeaturePrefsStore.batch831.v839flip
    FeaturePrefsStore.batch831.v839flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v840: fetch mode
internal fun PlayerActivity.showV840FetchToggle() {
    val current = FeaturePrefsStore.batch831.v840fetch
    FeaturePrefsStore.batch831.v840fetch = !current
    AppToast.show(this, "fetch: ${if (!current) "ON" else "OFF"}")
}

// v840: field mode
internal fun PlayerActivity.showV840FieldToggle() {
    val current = FeaturePrefsStore.batch831.v840field
    FeaturePrefsStore.batch831.v840field = !current
    AppToast.show(this, "field: ${if (!current) "ON" else "OFF"}")
}

// v840: file mode
internal fun PlayerActivity.showV840FileToggle() {
    val current = FeaturePrefsStore.batch831.v840file
    FeaturePrefsStore.batch831.v840file = !current
    AppToast.show(this, "file: ${if (!current) "ON" else "OFF"}")
}

// v840: fill mode
internal fun PlayerActivity.showV840FillToggle() {
    val current = FeaturePrefsStore.batch831.v840fill
    FeaturePrefsStore.batch831.v840fill = !current
    AppToast.show(this, "fill: ${if (!current) "ON" else "OFF"}")
}

// v840: filter mode
internal fun PlayerActivity.showV840FilterToggle() {
    val current = FeaturePrefsStore.batch831.v840filter
    FeaturePrefsStore.batch831.v840filter = !current
    AppToast.show(this, "filter: ${if (!current) "ON" else "OFF"}")
}

// v840: final level
internal fun PlayerActivity.showV840FinalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840final).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "final level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840final = value
        AppToast.show(this, "final: $value")
    }
}

// v840: find level
internal fun PlayerActivity.showV840FindDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840find).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "find level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840find = value
        AppToast.show(this, "find: $value")
    }
}

// v840: finger level
internal fun PlayerActivity.showV840FingerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840finger).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finger level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840finger = value
        AppToast.show(this, "finger: $value")
    }
}

// v840: finish level
internal fun PlayerActivity.showV840FinishDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840finish).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "finish level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840finish = value
        AppToast.show(this, "finish: $value")
    }
}

// v840: fire level
internal fun PlayerActivity.showV840FireDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch831.v840fire).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fire level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch831.v840fire = value
        AppToast.show(this, "fire: $value")
    }
}

// v840: firmware mode
internal fun PlayerActivity.showV840FirmwareToggle() {
    val current = FeaturePrefsStore.batch831.v840firmware
    FeaturePrefsStore.batch831.v840firmware = !current
    AppToast.show(this, "firmware: ${if (!current) "ON" else "OFF"}")
}

// v840: flag mode
internal fun PlayerActivity.showV840FlagToggle() {
    val current = FeaturePrefsStore.batch831.v840flag
    FeaturePrefsStore.batch831.v840flag = !current
    AppToast.show(this, "flag: ${if (!current) "ON" else "OFF"}")
}

// v840: flash mode
internal fun PlayerActivity.showV840FlashToggle() {
    val current = FeaturePrefsStore.batch831.v840flash
    FeaturePrefsStore.batch831.v840flash = !current
    AppToast.show(this, "flash: ${if (!current) "ON" else "OFF"}")
}

// v840: flat mode
internal fun PlayerActivity.showV840FlatToggle() {
    val current = FeaturePrefsStore.batch831.v840flat
    FeaturePrefsStore.batch831.v840flat = !current
    AppToast.show(this, "flat: ${if (!current) "ON" else "OFF"}")
}

// v840: flip mode
internal fun PlayerActivity.showV840FlipToggle() {
    val current = FeaturePrefsStore.batch831.v840flip
    FeaturePrefsStore.batch831.v840flip = !current
    AppToast.show(this, "flip: ${if (!current) "ON" else "OFF"}")
}

// v841: float mode
internal fun PlayerActivity.showV841FloatToggle() {
    val current = FeaturePrefsStore.batch841.v841float
    FeaturePrefsStore.batch841.v841float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v841: flush mode
internal fun PlayerActivity.showV841FlushToggle() {
    val current = FeaturePrefsStore.batch841.v841flush
    FeaturePrefsStore.batch841.v841flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v841: focus mode
internal fun PlayerActivity.showV841FocusToggle() {
    val current = FeaturePrefsStore.batch841.v841focus
    FeaturePrefsStore.batch841.v841focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v841: fold mode
internal fun PlayerActivity.showV841FoldToggle() {
    val current = FeaturePrefsStore.batch841.v841fold
    FeaturePrefsStore.batch841.v841fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v841: follow mode
internal fun PlayerActivity.showV841FollowToggle() {
    val current = FeaturePrefsStore.batch841.v841follow
    FeaturePrefsStore.batch841.v841follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v841: font level
internal fun PlayerActivity.showV841FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v841font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v841font = value
        AppToast.show(this, "font: $value")
    }
}

// v841: footer level
internal fun PlayerActivity.showV841FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v841footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v841footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v841: force level
internal fun PlayerActivity.showV841ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v841force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v841force = value
        AppToast.show(this, "force: $value")
    }
}

// v841: format level
internal fun PlayerActivity.showV841FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v841format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v841format = value
        AppToast.show(this, "format: $value")
    }
}

// v841: fragment level
internal fun PlayerActivity.showV841FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v841fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v841fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v841: frame mode
internal fun PlayerActivity.showV841FrameToggle() {
    val current = FeaturePrefsStore.batch841.v841frame
    FeaturePrefsStore.batch841.v841frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v841: free mode
internal fun PlayerActivity.showV841FreeToggle() {
    val current = FeaturePrefsStore.batch841.v841free
    FeaturePrefsStore.batch841.v841free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v841: frequency mode
internal fun PlayerActivity.showV841FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v841frequency
    FeaturePrefsStore.batch841.v841frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v841: front mode
internal fun PlayerActivity.showV841FrontToggle() {
    val current = FeaturePrefsStore.batch841.v841front
    FeaturePrefsStore.batch841.v841front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v841: full mode
internal fun PlayerActivity.showV841FullToggle() {
    val current = FeaturePrefsStore.batch841.v841full
    FeaturePrefsStore.batch841.v841full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v842: float mode
internal fun PlayerActivity.showV842FloatToggle() {
    val current = FeaturePrefsStore.batch841.v842float
    FeaturePrefsStore.batch841.v842float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v842: flush mode
internal fun PlayerActivity.showV842FlushToggle() {
    val current = FeaturePrefsStore.batch841.v842flush
    FeaturePrefsStore.batch841.v842flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v842: focus mode
internal fun PlayerActivity.showV842FocusToggle() {
    val current = FeaturePrefsStore.batch841.v842focus
    FeaturePrefsStore.batch841.v842focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v842: fold mode
internal fun PlayerActivity.showV842FoldToggle() {
    val current = FeaturePrefsStore.batch841.v842fold
    FeaturePrefsStore.batch841.v842fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v842: follow mode
internal fun PlayerActivity.showV842FollowToggle() {
    val current = FeaturePrefsStore.batch841.v842follow
    FeaturePrefsStore.batch841.v842follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v842: font level
internal fun PlayerActivity.showV842FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v842font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v842font = value
        AppToast.show(this, "font: $value")
    }
}

// v842: footer level
internal fun PlayerActivity.showV842FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v842footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v842footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v842: force level
internal fun PlayerActivity.showV842ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v842force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v842force = value
        AppToast.show(this, "force: $value")
    }
}

// v842: format level
internal fun PlayerActivity.showV842FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v842format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v842format = value
        AppToast.show(this, "format: $value")
    }
}

// v842: fragment level
internal fun PlayerActivity.showV842FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v842fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v842fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v842: frame mode
internal fun PlayerActivity.showV842FrameToggle() {
    val current = FeaturePrefsStore.batch841.v842frame
    FeaturePrefsStore.batch841.v842frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v842: free mode
internal fun PlayerActivity.showV842FreeToggle() {
    val current = FeaturePrefsStore.batch841.v842free
    FeaturePrefsStore.batch841.v842free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v842: frequency mode
internal fun PlayerActivity.showV842FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v842frequency
    FeaturePrefsStore.batch841.v842frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v842: front mode
internal fun PlayerActivity.showV842FrontToggle() {
    val current = FeaturePrefsStore.batch841.v842front
    FeaturePrefsStore.batch841.v842front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v842: full mode
internal fun PlayerActivity.showV842FullToggle() {
    val current = FeaturePrefsStore.batch841.v842full
    FeaturePrefsStore.batch841.v842full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v843: float mode
internal fun PlayerActivity.showV843FloatToggle() {
    val current = FeaturePrefsStore.batch841.v843float
    FeaturePrefsStore.batch841.v843float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v843: flush mode
internal fun PlayerActivity.showV843FlushToggle() {
    val current = FeaturePrefsStore.batch841.v843flush
    FeaturePrefsStore.batch841.v843flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v843: focus mode
internal fun PlayerActivity.showV843FocusToggle() {
    val current = FeaturePrefsStore.batch841.v843focus
    FeaturePrefsStore.batch841.v843focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v843: fold mode
internal fun PlayerActivity.showV843FoldToggle() {
    val current = FeaturePrefsStore.batch841.v843fold
    FeaturePrefsStore.batch841.v843fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v843: follow mode
internal fun PlayerActivity.showV843FollowToggle() {
    val current = FeaturePrefsStore.batch841.v843follow
    FeaturePrefsStore.batch841.v843follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v843: font level
internal fun PlayerActivity.showV843FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v843font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v843font = value
        AppToast.show(this, "font: $value")
    }
}

// v843: footer level
internal fun PlayerActivity.showV843FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v843footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v843footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v843: force level
internal fun PlayerActivity.showV843ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v843force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v843force = value
        AppToast.show(this, "force: $value")
    }
}

// v843: format level
internal fun PlayerActivity.showV843FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v843format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v843format = value
        AppToast.show(this, "format: $value")
    }
}

// v843: fragment level
internal fun PlayerActivity.showV843FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v843fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v843fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v843: frame mode
internal fun PlayerActivity.showV843FrameToggle() {
    val current = FeaturePrefsStore.batch841.v843frame
    FeaturePrefsStore.batch841.v843frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v843: free mode
internal fun PlayerActivity.showV843FreeToggle() {
    val current = FeaturePrefsStore.batch841.v843free
    FeaturePrefsStore.batch841.v843free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v843: frequency mode
internal fun PlayerActivity.showV843FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v843frequency
    FeaturePrefsStore.batch841.v843frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v843: front mode
internal fun PlayerActivity.showV843FrontToggle() {
    val current = FeaturePrefsStore.batch841.v843front
    FeaturePrefsStore.batch841.v843front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v843: full mode
internal fun PlayerActivity.showV843FullToggle() {
    val current = FeaturePrefsStore.batch841.v843full
    FeaturePrefsStore.batch841.v843full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v844: float mode
internal fun PlayerActivity.showV844FloatToggle() {
    val current = FeaturePrefsStore.batch841.v844float
    FeaturePrefsStore.batch841.v844float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v844: flush mode
internal fun PlayerActivity.showV844FlushToggle() {
    val current = FeaturePrefsStore.batch841.v844flush
    FeaturePrefsStore.batch841.v844flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v844: focus mode
internal fun PlayerActivity.showV844FocusToggle() {
    val current = FeaturePrefsStore.batch841.v844focus
    FeaturePrefsStore.batch841.v844focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v844: fold mode
internal fun PlayerActivity.showV844FoldToggle() {
    val current = FeaturePrefsStore.batch841.v844fold
    FeaturePrefsStore.batch841.v844fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v844: follow mode
internal fun PlayerActivity.showV844FollowToggle() {
    val current = FeaturePrefsStore.batch841.v844follow
    FeaturePrefsStore.batch841.v844follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v844: font level
internal fun PlayerActivity.showV844FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v844font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v844font = value
        AppToast.show(this, "font: $value")
    }
}

// v844: footer level
internal fun PlayerActivity.showV844FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v844footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v844footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v844: force level
internal fun PlayerActivity.showV844ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v844force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v844force = value
        AppToast.show(this, "force: $value")
    }
}

// v844: format level
internal fun PlayerActivity.showV844FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v844format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v844format = value
        AppToast.show(this, "format: $value")
    }
}

// v844: fragment level
internal fun PlayerActivity.showV844FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v844fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v844fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v844: frame mode
internal fun PlayerActivity.showV844FrameToggle() {
    val current = FeaturePrefsStore.batch841.v844frame
    FeaturePrefsStore.batch841.v844frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v844: free mode
internal fun PlayerActivity.showV844FreeToggle() {
    val current = FeaturePrefsStore.batch841.v844free
    FeaturePrefsStore.batch841.v844free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v844: frequency mode
internal fun PlayerActivity.showV844FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v844frequency
    FeaturePrefsStore.batch841.v844frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v844: front mode
internal fun PlayerActivity.showV844FrontToggle() {
    val current = FeaturePrefsStore.batch841.v844front
    FeaturePrefsStore.batch841.v844front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v844: full mode
internal fun PlayerActivity.showV844FullToggle() {
    val current = FeaturePrefsStore.batch841.v844full
    FeaturePrefsStore.batch841.v844full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v845: float mode
internal fun PlayerActivity.showV845FloatToggle() {
    val current = FeaturePrefsStore.batch841.v845float
    FeaturePrefsStore.batch841.v845float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v845: flush mode
internal fun PlayerActivity.showV845FlushToggle() {
    val current = FeaturePrefsStore.batch841.v845flush
    FeaturePrefsStore.batch841.v845flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v845: focus mode
internal fun PlayerActivity.showV845FocusToggle() {
    val current = FeaturePrefsStore.batch841.v845focus
    FeaturePrefsStore.batch841.v845focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v845: fold mode
internal fun PlayerActivity.showV845FoldToggle() {
    val current = FeaturePrefsStore.batch841.v845fold
    FeaturePrefsStore.batch841.v845fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v845: follow mode
internal fun PlayerActivity.showV845FollowToggle() {
    val current = FeaturePrefsStore.batch841.v845follow
    FeaturePrefsStore.batch841.v845follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v845: font level
internal fun PlayerActivity.showV845FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v845font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v845font = value
        AppToast.show(this, "font: $value")
    }
}

// v845: footer level
internal fun PlayerActivity.showV845FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v845footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v845footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v845: force level
internal fun PlayerActivity.showV845ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v845force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v845force = value
        AppToast.show(this, "force: $value")
    }
}

// v845: format level
internal fun PlayerActivity.showV845FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v845format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v845format = value
        AppToast.show(this, "format: $value")
    }
}

// v845: fragment level
internal fun PlayerActivity.showV845FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v845fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v845fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v845: frame mode
internal fun PlayerActivity.showV845FrameToggle() {
    val current = FeaturePrefsStore.batch841.v845frame
    FeaturePrefsStore.batch841.v845frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v845: free mode
internal fun PlayerActivity.showV845FreeToggle() {
    val current = FeaturePrefsStore.batch841.v845free
    FeaturePrefsStore.batch841.v845free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v845: frequency mode
internal fun PlayerActivity.showV845FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v845frequency
    FeaturePrefsStore.batch841.v845frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v845: front mode
internal fun PlayerActivity.showV845FrontToggle() {
    val current = FeaturePrefsStore.batch841.v845front
    FeaturePrefsStore.batch841.v845front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v845: full mode
internal fun PlayerActivity.showV845FullToggle() {
    val current = FeaturePrefsStore.batch841.v845full
    FeaturePrefsStore.batch841.v845full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v846: float mode
internal fun PlayerActivity.showV846FloatToggle() {
    val current = FeaturePrefsStore.batch841.v846float
    FeaturePrefsStore.batch841.v846float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v846: flush mode
internal fun PlayerActivity.showV846FlushToggle() {
    val current = FeaturePrefsStore.batch841.v846flush
    FeaturePrefsStore.batch841.v846flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v846: focus mode
internal fun PlayerActivity.showV846FocusToggle() {
    val current = FeaturePrefsStore.batch841.v846focus
    FeaturePrefsStore.batch841.v846focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v846: fold mode
internal fun PlayerActivity.showV846FoldToggle() {
    val current = FeaturePrefsStore.batch841.v846fold
    FeaturePrefsStore.batch841.v846fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v846: follow mode
internal fun PlayerActivity.showV846FollowToggle() {
    val current = FeaturePrefsStore.batch841.v846follow
    FeaturePrefsStore.batch841.v846follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v846: font level
internal fun PlayerActivity.showV846FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v846font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v846font = value
        AppToast.show(this, "font: $value")
    }
}

// v846: footer level
internal fun PlayerActivity.showV846FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v846footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v846footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v846: force level
internal fun PlayerActivity.showV846ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v846force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v846force = value
        AppToast.show(this, "force: $value")
    }
}

// v846: format level
internal fun PlayerActivity.showV846FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v846format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v846format = value
        AppToast.show(this, "format: $value")
    }
}

// v846: fragment level
internal fun PlayerActivity.showV846FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v846fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v846fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v846: frame mode
internal fun PlayerActivity.showV846FrameToggle() {
    val current = FeaturePrefsStore.batch841.v846frame
    FeaturePrefsStore.batch841.v846frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v846: free mode
internal fun PlayerActivity.showV846FreeToggle() {
    val current = FeaturePrefsStore.batch841.v846free
    FeaturePrefsStore.batch841.v846free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v846: frequency mode
internal fun PlayerActivity.showV846FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v846frequency
    FeaturePrefsStore.batch841.v846frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v846: front mode
internal fun PlayerActivity.showV846FrontToggle() {
    val current = FeaturePrefsStore.batch841.v846front
    FeaturePrefsStore.batch841.v846front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v846: full mode
internal fun PlayerActivity.showV846FullToggle() {
    val current = FeaturePrefsStore.batch841.v846full
    FeaturePrefsStore.batch841.v846full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v847: float mode
internal fun PlayerActivity.showV847FloatToggle() {
    val current = FeaturePrefsStore.batch841.v847float
    FeaturePrefsStore.batch841.v847float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v847: flush mode
internal fun PlayerActivity.showV847FlushToggle() {
    val current = FeaturePrefsStore.batch841.v847flush
    FeaturePrefsStore.batch841.v847flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v847: focus mode
internal fun PlayerActivity.showV847FocusToggle() {
    val current = FeaturePrefsStore.batch841.v847focus
    FeaturePrefsStore.batch841.v847focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v847: fold mode
internal fun PlayerActivity.showV847FoldToggle() {
    val current = FeaturePrefsStore.batch841.v847fold
    FeaturePrefsStore.batch841.v847fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v847: follow mode
internal fun PlayerActivity.showV847FollowToggle() {
    val current = FeaturePrefsStore.batch841.v847follow
    FeaturePrefsStore.batch841.v847follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v847: font level
internal fun PlayerActivity.showV847FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v847font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v847font = value
        AppToast.show(this, "font: $value")
    }
}

// v847: footer level
internal fun PlayerActivity.showV847FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v847footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v847footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v847: force level
internal fun PlayerActivity.showV847ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v847force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v847force = value
        AppToast.show(this, "force: $value")
    }
}

// v847: format level
internal fun PlayerActivity.showV847FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v847format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v847format = value
        AppToast.show(this, "format: $value")
    }
}

// v847: fragment level
internal fun PlayerActivity.showV847FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v847fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v847fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v847: frame mode
internal fun PlayerActivity.showV847FrameToggle() {
    val current = FeaturePrefsStore.batch841.v847frame
    FeaturePrefsStore.batch841.v847frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v847: free mode
internal fun PlayerActivity.showV847FreeToggle() {
    val current = FeaturePrefsStore.batch841.v847free
    FeaturePrefsStore.batch841.v847free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v847: frequency mode
internal fun PlayerActivity.showV847FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v847frequency
    FeaturePrefsStore.batch841.v847frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v847: front mode
internal fun PlayerActivity.showV847FrontToggle() {
    val current = FeaturePrefsStore.batch841.v847front
    FeaturePrefsStore.batch841.v847front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v847: full mode
internal fun PlayerActivity.showV847FullToggle() {
    val current = FeaturePrefsStore.batch841.v847full
    FeaturePrefsStore.batch841.v847full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v848: float mode
internal fun PlayerActivity.showV848FloatToggle() {
    val current = FeaturePrefsStore.batch841.v848float
    FeaturePrefsStore.batch841.v848float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v848: flush mode
internal fun PlayerActivity.showV848FlushToggle() {
    val current = FeaturePrefsStore.batch841.v848flush
    FeaturePrefsStore.batch841.v848flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v848: focus mode
internal fun PlayerActivity.showV848FocusToggle() {
    val current = FeaturePrefsStore.batch841.v848focus
    FeaturePrefsStore.batch841.v848focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v848: fold mode
internal fun PlayerActivity.showV848FoldToggle() {
    val current = FeaturePrefsStore.batch841.v848fold
    FeaturePrefsStore.batch841.v848fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v848: follow mode
internal fun PlayerActivity.showV848FollowToggle() {
    val current = FeaturePrefsStore.batch841.v848follow
    FeaturePrefsStore.batch841.v848follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v848: font level
internal fun PlayerActivity.showV848FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v848font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v848font = value
        AppToast.show(this, "font: $value")
    }
}

// v848: footer level
internal fun PlayerActivity.showV848FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v848footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v848footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v848: force level
internal fun PlayerActivity.showV848ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v848force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v848force = value
        AppToast.show(this, "force: $value")
    }
}

// v848: format level
internal fun PlayerActivity.showV848FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v848format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v848format = value
        AppToast.show(this, "format: $value")
    }
}

// v848: fragment level
internal fun PlayerActivity.showV848FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v848fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v848fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v848: frame mode
internal fun PlayerActivity.showV848FrameToggle() {
    val current = FeaturePrefsStore.batch841.v848frame
    FeaturePrefsStore.batch841.v848frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v848: free mode
internal fun PlayerActivity.showV848FreeToggle() {
    val current = FeaturePrefsStore.batch841.v848free
    FeaturePrefsStore.batch841.v848free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v848: frequency mode
internal fun PlayerActivity.showV848FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v848frequency
    FeaturePrefsStore.batch841.v848frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v848: front mode
internal fun PlayerActivity.showV848FrontToggle() {
    val current = FeaturePrefsStore.batch841.v848front
    FeaturePrefsStore.batch841.v848front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v848: full mode
internal fun PlayerActivity.showV848FullToggle() {
    val current = FeaturePrefsStore.batch841.v848full
    FeaturePrefsStore.batch841.v848full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v849: float mode
internal fun PlayerActivity.showV849FloatToggle() {
    val current = FeaturePrefsStore.batch841.v849float
    FeaturePrefsStore.batch841.v849float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v849: flush mode
internal fun PlayerActivity.showV849FlushToggle() {
    val current = FeaturePrefsStore.batch841.v849flush
    FeaturePrefsStore.batch841.v849flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v849: focus mode
internal fun PlayerActivity.showV849FocusToggle() {
    val current = FeaturePrefsStore.batch841.v849focus
    FeaturePrefsStore.batch841.v849focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v849: fold mode
internal fun PlayerActivity.showV849FoldToggle() {
    val current = FeaturePrefsStore.batch841.v849fold
    FeaturePrefsStore.batch841.v849fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v849: follow mode
internal fun PlayerActivity.showV849FollowToggle() {
    val current = FeaturePrefsStore.batch841.v849follow
    FeaturePrefsStore.batch841.v849follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v849: font level
internal fun PlayerActivity.showV849FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v849font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v849font = value
        AppToast.show(this, "font: $value")
    }
}

// v849: footer level
internal fun PlayerActivity.showV849FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v849footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v849footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v849: force level
internal fun PlayerActivity.showV849ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v849force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v849force = value
        AppToast.show(this, "force: $value")
    }
}

// v849: format level
internal fun PlayerActivity.showV849FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v849format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v849format = value
        AppToast.show(this, "format: $value")
    }
}

// v849: fragment level
internal fun PlayerActivity.showV849FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v849fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v849fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v849: frame mode
internal fun PlayerActivity.showV849FrameToggle() {
    val current = FeaturePrefsStore.batch841.v849frame
    FeaturePrefsStore.batch841.v849frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v849: free mode
internal fun PlayerActivity.showV849FreeToggle() {
    val current = FeaturePrefsStore.batch841.v849free
    FeaturePrefsStore.batch841.v849free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v849: frequency mode
internal fun PlayerActivity.showV849FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v849frequency
    FeaturePrefsStore.batch841.v849frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v849: front mode
internal fun PlayerActivity.showV849FrontToggle() {
    val current = FeaturePrefsStore.batch841.v849front
    FeaturePrefsStore.batch841.v849front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v849: full mode
internal fun PlayerActivity.showV849FullToggle() {
    val current = FeaturePrefsStore.batch841.v849full
    FeaturePrefsStore.batch841.v849full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}

// v850: float mode
internal fun PlayerActivity.showV850FloatToggle() {
    val current = FeaturePrefsStore.batch841.v850float
    FeaturePrefsStore.batch841.v850float = !current
    AppToast.show(this, "float: ${if (!current) "ON" else "OFF"}")
}

// v850: flush mode
internal fun PlayerActivity.showV850FlushToggle() {
    val current = FeaturePrefsStore.batch841.v850flush
    FeaturePrefsStore.batch841.v850flush = !current
    AppToast.show(this, "flush: ${if (!current) "ON" else "OFF"}")
}

// v850: focus mode
internal fun PlayerActivity.showV850FocusToggle() {
    val current = FeaturePrefsStore.batch841.v850focus
    FeaturePrefsStore.batch841.v850focus = !current
    AppToast.show(this, "focus: ${if (!current) "ON" else "OFF"}")
}

// v850: fold mode
internal fun PlayerActivity.showV850FoldToggle() {
    val current = FeaturePrefsStore.batch841.v850fold
    FeaturePrefsStore.batch841.v850fold = !current
    AppToast.show(this, "fold: ${if (!current) "ON" else "OFF"}")
}

// v850: follow mode
internal fun PlayerActivity.showV850FollowToggle() {
    val current = FeaturePrefsStore.batch841.v850follow
    FeaturePrefsStore.batch841.v850follow = !current
    AppToast.show(this, "follow: ${if (!current) "ON" else "OFF"}")
}

// v850: font level
internal fun PlayerActivity.showV850FontDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v850font).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "font level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v850font = value
        AppToast.show(this, "font: $value")
    }
}

// v850: footer level
internal fun PlayerActivity.showV850FooterDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v850footer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "footer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v850footer = value
        AppToast.show(this, "footer: $value")
    }
}

// v850: force level
internal fun PlayerActivity.showV850ForceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v850force).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "force level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v850force = value
        AppToast.show(this, "force: $value")
    }
}

// v850: format level
internal fun PlayerActivity.showV850FormatDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v850format).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "format level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v850format = value
        AppToast.show(this, "format: $value")
    }
}

// v850: fragment level
internal fun PlayerActivity.showV850FragmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch841.v850fragment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fragment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch841.v850fragment = value
        AppToast.show(this, "fragment: $value")
    }
}

// v850: frame mode
internal fun PlayerActivity.showV850FrameToggle() {
    val current = FeaturePrefsStore.batch841.v850frame
    FeaturePrefsStore.batch841.v850frame = !current
    AppToast.show(this, "frame: ${if (!current) "ON" else "OFF"}")
}

// v850: free mode
internal fun PlayerActivity.showV850FreeToggle() {
    val current = FeaturePrefsStore.batch841.v850free
    FeaturePrefsStore.batch841.v850free = !current
    AppToast.show(this, "free: ${if (!current) "ON" else "OFF"}")
}

// v850: frequency mode
internal fun PlayerActivity.showV850FrequencyToggle() {
    val current = FeaturePrefsStore.batch841.v850frequency
    FeaturePrefsStore.batch841.v850frequency = !current
    AppToast.show(this, "frequency: ${if (!current) "ON" else "OFF"}")
}

// v850: front mode
internal fun PlayerActivity.showV850FrontToggle() {
    val current = FeaturePrefsStore.batch841.v850front
    FeaturePrefsStore.batch841.v850front = !current
    AppToast.show(this, "front: ${if (!current) "ON" else "OFF"}")
}

// v850: full mode
internal fun PlayerActivity.showV850FullToggle() {
    val current = FeaturePrefsStore.batch841.v850full
    FeaturePrefsStore.batch841.v850full = !current
    AppToast.show(this, "full: ${if (!current) "ON" else "OFF"}")
}
