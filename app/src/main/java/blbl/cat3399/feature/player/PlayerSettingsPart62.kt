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

