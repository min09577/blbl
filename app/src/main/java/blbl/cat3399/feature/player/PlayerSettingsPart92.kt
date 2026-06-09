package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1101: string mode
internal fun PlayerActivity.showV1101StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1101string
    FeaturePrefsStore.batch1101.v1101string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1101: strip mode
internal fun PlayerActivity.showV1101StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1101strip
    FeaturePrefsStore.batch1101.v1101strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1101: stroke mode
internal fun PlayerActivity.showV1101StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1101stroke
    FeaturePrefsStore.batch1101.v1101stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1101: structure mode
internal fun PlayerActivity.showV1101StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1101structure
    FeaturePrefsStore.batch1101.v1101structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1101: style mode
internal fun PlayerActivity.showV1101StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1101style
    FeaturePrefsStore.batch1101.v1101style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1101: sub level
internal fun PlayerActivity.showV1101SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1101: submit level
internal fun PlayerActivity.showV1101SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1101: subscribe level
internal fun PlayerActivity.showV1101SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1101: success level
internal fun PlayerActivity.showV1101SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101success = value
        AppToast.show(this, "success: $value")
    }
}

// v1101: suffix level
internal fun PlayerActivity.showV1101SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1101suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1101suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1101: sum mode
internal fun PlayerActivity.showV1101SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1101sum
    FeaturePrefsStore.batch1101.v1101sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1101: summary mode
internal fun PlayerActivity.showV1101SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1101summary
    FeaturePrefsStore.batch1101.v1101summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1101: support mode
internal fun PlayerActivity.showV1101SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1101support
    FeaturePrefsStore.batch1101.v1101support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1101: swap mode
internal fun PlayerActivity.showV1101SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1101swap
    FeaturePrefsStore.batch1101.v1101swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1101: switch mode
internal fun PlayerActivity.showV1101SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1101switch
    FeaturePrefsStore.batch1101.v1101switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1102: string mode
internal fun PlayerActivity.showV1102StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1102string
    FeaturePrefsStore.batch1101.v1102string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1102: strip mode
internal fun PlayerActivity.showV1102StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1102strip
    FeaturePrefsStore.batch1101.v1102strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1102: stroke mode
internal fun PlayerActivity.showV1102StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1102stroke
    FeaturePrefsStore.batch1101.v1102stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1102: structure mode
internal fun PlayerActivity.showV1102StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1102structure
    FeaturePrefsStore.batch1101.v1102structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1102: style mode
internal fun PlayerActivity.showV1102StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1102style
    FeaturePrefsStore.batch1101.v1102style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1102: sub level
internal fun PlayerActivity.showV1102SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1102: submit level
internal fun PlayerActivity.showV1102SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1102: subscribe level
internal fun PlayerActivity.showV1102SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1102: success level
internal fun PlayerActivity.showV1102SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102success = value
        AppToast.show(this, "success: $value")
    }
}

// v1102: suffix level
internal fun PlayerActivity.showV1102SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1102suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1102suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1102: sum mode
internal fun PlayerActivity.showV1102SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1102sum
    FeaturePrefsStore.batch1101.v1102sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1102: summary mode
internal fun PlayerActivity.showV1102SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1102summary
    FeaturePrefsStore.batch1101.v1102summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1102: support mode
internal fun PlayerActivity.showV1102SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1102support
    FeaturePrefsStore.batch1101.v1102support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1102: swap mode
internal fun PlayerActivity.showV1102SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1102swap
    FeaturePrefsStore.batch1101.v1102swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1102: switch mode
internal fun PlayerActivity.showV1102SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1102switch
    FeaturePrefsStore.batch1101.v1102switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1103: string mode
internal fun PlayerActivity.showV1103StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1103string
    FeaturePrefsStore.batch1101.v1103string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1103: strip mode
internal fun PlayerActivity.showV1103StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1103strip
    FeaturePrefsStore.batch1101.v1103strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1103: stroke mode
internal fun PlayerActivity.showV1103StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1103stroke
    FeaturePrefsStore.batch1101.v1103stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1103: structure mode
internal fun PlayerActivity.showV1103StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1103structure
    FeaturePrefsStore.batch1101.v1103structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1103: style mode
internal fun PlayerActivity.showV1103StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1103style
    FeaturePrefsStore.batch1101.v1103style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1103: sub level
internal fun PlayerActivity.showV1103SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1103: submit level
internal fun PlayerActivity.showV1103SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1103: subscribe level
internal fun PlayerActivity.showV1103SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1103: success level
internal fun PlayerActivity.showV1103SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103success = value
        AppToast.show(this, "success: $value")
    }
}

// v1103: suffix level
internal fun PlayerActivity.showV1103SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1103suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1103suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1103: sum mode
internal fun PlayerActivity.showV1103SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1103sum
    FeaturePrefsStore.batch1101.v1103sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1103: summary mode
internal fun PlayerActivity.showV1103SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1103summary
    FeaturePrefsStore.batch1101.v1103summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1103: support mode
internal fun PlayerActivity.showV1103SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1103support
    FeaturePrefsStore.batch1101.v1103support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1103: swap mode
internal fun PlayerActivity.showV1103SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1103swap
    FeaturePrefsStore.batch1101.v1103swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1103: switch mode
internal fun PlayerActivity.showV1103SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1103switch
    FeaturePrefsStore.batch1101.v1103switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1104: string mode
internal fun PlayerActivity.showV1104StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1104string
    FeaturePrefsStore.batch1101.v1104string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1104: strip mode
internal fun PlayerActivity.showV1104StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1104strip
    FeaturePrefsStore.batch1101.v1104strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1104: stroke mode
internal fun PlayerActivity.showV1104StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1104stroke
    FeaturePrefsStore.batch1101.v1104stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1104: structure mode
internal fun PlayerActivity.showV1104StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1104structure
    FeaturePrefsStore.batch1101.v1104structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1104: style mode
internal fun PlayerActivity.showV1104StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1104style
    FeaturePrefsStore.batch1101.v1104style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1104: sub level
internal fun PlayerActivity.showV1104SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1104: submit level
internal fun PlayerActivity.showV1104SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1104: subscribe level
internal fun PlayerActivity.showV1104SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1104: success level
internal fun PlayerActivity.showV1104SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104success = value
        AppToast.show(this, "success: $value")
    }
}

// v1104: suffix level
internal fun PlayerActivity.showV1104SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1104suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1104suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1104: sum mode
internal fun PlayerActivity.showV1104SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1104sum
    FeaturePrefsStore.batch1101.v1104sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1104: summary mode
internal fun PlayerActivity.showV1104SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1104summary
    FeaturePrefsStore.batch1101.v1104summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1104: support mode
internal fun PlayerActivity.showV1104SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1104support
    FeaturePrefsStore.batch1101.v1104support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1104: swap mode
internal fun PlayerActivity.showV1104SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1104swap
    FeaturePrefsStore.batch1101.v1104swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1104: switch mode
internal fun PlayerActivity.showV1104SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1104switch
    FeaturePrefsStore.batch1101.v1104switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1105: string mode
internal fun PlayerActivity.showV1105StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1105string
    FeaturePrefsStore.batch1101.v1105string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1105: strip mode
internal fun PlayerActivity.showV1105StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1105strip
    FeaturePrefsStore.batch1101.v1105strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1105: stroke mode
internal fun PlayerActivity.showV1105StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1105stroke
    FeaturePrefsStore.batch1101.v1105stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1105: structure mode
internal fun PlayerActivity.showV1105StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1105structure
    FeaturePrefsStore.batch1101.v1105structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1105: style mode
internal fun PlayerActivity.showV1105StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1105style
    FeaturePrefsStore.batch1101.v1105style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1105: sub level
internal fun PlayerActivity.showV1105SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1105: submit level
internal fun PlayerActivity.showV1105SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1105: subscribe level
internal fun PlayerActivity.showV1105SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1105: success level
internal fun PlayerActivity.showV1105SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105success = value
        AppToast.show(this, "success: $value")
    }
}

// v1105: suffix level
internal fun PlayerActivity.showV1105SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1105suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1105suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1105: sum mode
internal fun PlayerActivity.showV1105SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1105sum
    FeaturePrefsStore.batch1101.v1105sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1105: summary mode
internal fun PlayerActivity.showV1105SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1105summary
    FeaturePrefsStore.batch1101.v1105summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1105: support mode
internal fun PlayerActivity.showV1105SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1105support
    FeaturePrefsStore.batch1101.v1105support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1105: swap mode
internal fun PlayerActivity.showV1105SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1105swap
    FeaturePrefsStore.batch1101.v1105swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1105: switch mode
internal fun PlayerActivity.showV1105SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1105switch
    FeaturePrefsStore.batch1101.v1105switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1106: string mode
internal fun PlayerActivity.showV1106StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1106string
    FeaturePrefsStore.batch1101.v1106string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1106: strip mode
internal fun PlayerActivity.showV1106StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1106strip
    FeaturePrefsStore.batch1101.v1106strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1106: stroke mode
internal fun PlayerActivity.showV1106StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1106stroke
    FeaturePrefsStore.batch1101.v1106stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1106: structure mode
internal fun PlayerActivity.showV1106StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1106structure
    FeaturePrefsStore.batch1101.v1106structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1106: style mode
internal fun PlayerActivity.showV1106StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1106style
    FeaturePrefsStore.batch1101.v1106style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1106: sub level
internal fun PlayerActivity.showV1106SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1106: submit level
internal fun PlayerActivity.showV1106SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1106: subscribe level
internal fun PlayerActivity.showV1106SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1106: success level
internal fun PlayerActivity.showV1106SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106success = value
        AppToast.show(this, "success: $value")
    }
}

// v1106: suffix level
internal fun PlayerActivity.showV1106SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1106suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1106suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1106: sum mode
internal fun PlayerActivity.showV1106SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1106sum
    FeaturePrefsStore.batch1101.v1106sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1106: summary mode
internal fun PlayerActivity.showV1106SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1106summary
    FeaturePrefsStore.batch1101.v1106summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1106: support mode
internal fun PlayerActivity.showV1106SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1106support
    FeaturePrefsStore.batch1101.v1106support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1106: swap mode
internal fun PlayerActivity.showV1106SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1106swap
    FeaturePrefsStore.batch1101.v1106swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1106: switch mode
internal fun PlayerActivity.showV1106SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1106switch
    FeaturePrefsStore.batch1101.v1106switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1107: string mode
internal fun PlayerActivity.showV1107StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1107string
    FeaturePrefsStore.batch1101.v1107string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1107: strip mode
internal fun PlayerActivity.showV1107StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1107strip
    FeaturePrefsStore.batch1101.v1107strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1107: stroke mode
internal fun PlayerActivity.showV1107StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1107stroke
    FeaturePrefsStore.batch1101.v1107stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1107: structure mode
internal fun PlayerActivity.showV1107StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1107structure
    FeaturePrefsStore.batch1101.v1107structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1107: style mode
internal fun PlayerActivity.showV1107StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1107style
    FeaturePrefsStore.batch1101.v1107style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1107: sub level
internal fun PlayerActivity.showV1107SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1107: submit level
internal fun PlayerActivity.showV1107SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1107: subscribe level
internal fun PlayerActivity.showV1107SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1107: success level
internal fun PlayerActivity.showV1107SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107success = value
        AppToast.show(this, "success: $value")
    }
}

// v1107: suffix level
internal fun PlayerActivity.showV1107SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1107suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1107suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1107: sum mode
internal fun PlayerActivity.showV1107SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1107sum
    FeaturePrefsStore.batch1101.v1107sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1107: summary mode
internal fun PlayerActivity.showV1107SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1107summary
    FeaturePrefsStore.batch1101.v1107summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1107: support mode
internal fun PlayerActivity.showV1107SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1107support
    FeaturePrefsStore.batch1101.v1107support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1107: swap mode
internal fun PlayerActivity.showV1107SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1107swap
    FeaturePrefsStore.batch1101.v1107swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1107: switch mode
internal fun PlayerActivity.showV1107SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1107switch
    FeaturePrefsStore.batch1101.v1107switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1108: string mode
internal fun PlayerActivity.showV1108StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1108string
    FeaturePrefsStore.batch1101.v1108string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1108: strip mode
internal fun PlayerActivity.showV1108StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1108strip
    FeaturePrefsStore.batch1101.v1108strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1108: stroke mode
internal fun PlayerActivity.showV1108StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1108stroke
    FeaturePrefsStore.batch1101.v1108stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1108: structure mode
internal fun PlayerActivity.showV1108StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1108structure
    FeaturePrefsStore.batch1101.v1108structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1108: style mode
internal fun PlayerActivity.showV1108StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1108style
    FeaturePrefsStore.batch1101.v1108style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1108: sub level
internal fun PlayerActivity.showV1108SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1108: submit level
internal fun PlayerActivity.showV1108SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1108: subscribe level
internal fun PlayerActivity.showV1108SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1108: success level
internal fun PlayerActivity.showV1108SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108success = value
        AppToast.show(this, "success: $value")
    }
}

// v1108: suffix level
internal fun PlayerActivity.showV1108SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1108suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1108suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1108: sum mode
internal fun PlayerActivity.showV1108SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1108sum
    FeaturePrefsStore.batch1101.v1108sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1108: summary mode
internal fun PlayerActivity.showV1108SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1108summary
    FeaturePrefsStore.batch1101.v1108summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1108: support mode
internal fun PlayerActivity.showV1108SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1108support
    FeaturePrefsStore.batch1101.v1108support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1108: swap mode
internal fun PlayerActivity.showV1108SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1108swap
    FeaturePrefsStore.batch1101.v1108swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1108: switch mode
internal fun PlayerActivity.showV1108SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1108switch
    FeaturePrefsStore.batch1101.v1108switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1109: string mode
internal fun PlayerActivity.showV1109StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1109string
    FeaturePrefsStore.batch1101.v1109string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1109: strip mode
internal fun PlayerActivity.showV1109StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1109strip
    FeaturePrefsStore.batch1101.v1109strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1109: stroke mode
internal fun PlayerActivity.showV1109StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1109stroke
    FeaturePrefsStore.batch1101.v1109stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1109: structure mode
internal fun PlayerActivity.showV1109StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1109structure
    FeaturePrefsStore.batch1101.v1109structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1109: style mode
internal fun PlayerActivity.showV1109StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1109style
    FeaturePrefsStore.batch1101.v1109style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1109: sub level
internal fun PlayerActivity.showV1109SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1109: submit level
internal fun PlayerActivity.showV1109SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1109: subscribe level
internal fun PlayerActivity.showV1109SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1109: success level
internal fun PlayerActivity.showV1109SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109success = value
        AppToast.show(this, "success: $value")
    }
}

// v1109: suffix level
internal fun PlayerActivity.showV1109SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1109suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1109suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1109: sum mode
internal fun PlayerActivity.showV1109SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1109sum
    FeaturePrefsStore.batch1101.v1109sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1109: summary mode
internal fun PlayerActivity.showV1109SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1109summary
    FeaturePrefsStore.batch1101.v1109summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1109: support mode
internal fun PlayerActivity.showV1109SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1109support
    FeaturePrefsStore.batch1101.v1109support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1109: swap mode
internal fun PlayerActivity.showV1109SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1109swap
    FeaturePrefsStore.batch1101.v1109swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1109: switch mode
internal fun PlayerActivity.showV1109SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1109switch
    FeaturePrefsStore.batch1101.v1109switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

// v1110: string mode
internal fun PlayerActivity.showV1110StringToggle() {
    val current = FeaturePrefsStore.batch1101.v1110string
    FeaturePrefsStore.batch1101.v1110string = !current
    AppToast.show(this, "string: ${if (!current) "ON" else "OFF"}")
}

// v1110: strip mode
internal fun PlayerActivity.showV1110StripToggle() {
    val current = FeaturePrefsStore.batch1101.v1110strip
    FeaturePrefsStore.batch1101.v1110strip = !current
    AppToast.show(this, "strip: ${if (!current) "ON" else "OFF"}")
}

// v1110: stroke mode
internal fun PlayerActivity.showV1110StrokeToggle() {
    val current = FeaturePrefsStore.batch1101.v1110stroke
    FeaturePrefsStore.batch1101.v1110stroke = !current
    AppToast.show(this, "stroke: ${if (!current) "ON" else "OFF"}")
}

// v1110: structure mode
internal fun PlayerActivity.showV1110StructureToggle() {
    val current = FeaturePrefsStore.batch1101.v1110structure
    FeaturePrefsStore.batch1101.v1110structure = !current
    AppToast.show(this, "structure: ${if (!current) "ON" else "OFF"}")
}

// v1110: style mode
internal fun PlayerActivity.showV1110StyleToggle() {
    val current = FeaturePrefsStore.batch1101.v1110style
    FeaturePrefsStore.batch1101.v1110style = !current
    AppToast.show(this, "style: ${if (!current) "ON" else "OFF"}")
}

// v1110: sub level
internal fun PlayerActivity.showV1110SubDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110sub).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sub level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110sub = value
        AppToast.show(this, "sub: $value")
    }
}

// v1110: submit level
internal fun PlayerActivity.showV1110SubmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110submit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "submit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110submit = value
        AppToast.show(this, "submit: $value")
    }
}

// v1110: subscribe level
internal fun PlayerActivity.showV1110SubscribeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110subscribe).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "subscribe level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110subscribe = value
        AppToast.show(this, "subscribe: $value")
    }
}

// v1110: success level
internal fun PlayerActivity.showV1110SuccessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110success).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "success level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110success = value
        AppToast.show(this, "success: $value")
    }
}

// v1110: suffix level
internal fun PlayerActivity.showV1110SuffixDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1101.v1110suffix).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "suffix level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1101.v1110suffix = value
        AppToast.show(this, "suffix: $value")
    }
}

// v1110: sum mode
internal fun PlayerActivity.showV1110SumToggle() {
    val current = FeaturePrefsStore.batch1101.v1110sum
    FeaturePrefsStore.batch1101.v1110sum = !current
    AppToast.show(this, "sum: ${if (!current) "ON" else "OFF"}")
}

// v1110: summary mode
internal fun PlayerActivity.showV1110SummaryToggle() {
    val current = FeaturePrefsStore.batch1101.v1110summary
    FeaturePrefsStore.batch1101.v1110summary = !current
    AppToast.show(this, "summary: ${if (!current) "ON" else "OFF"}")
}

// v1110: support mode
internal fun PlayerActivity.showV1110SupportToggle() {
    val current = FeaturePrefsStore.batch1101.v1110support
    FeaturePrefsStore.batch1101.v1110support = !current
    AppToast.show(this, "support: ${if (!current) "ON" else "OFF"}")
}

// v1110: swap mode
internal fun PlayerActivity.showV1110SwapToggle() {
    val current = FeaturePrefsStore.batch1101.v1110swap
    FeaturePrefsStore.batch1101.v1110swap = !current
    AppToast.show(this, "swap: ${if (!current) "ON" else "OFF"}")
}

// v1110: switch mode
internal fun PlayerActivity.showV1110SwitchToggle() {
    val current = FeaturePrefsStore.batch1101.v1110switch
    FeaturePrefsStore.batch1101.v1110switch = !current
    AppToast.show(this, "switch: ${if (!current) "ON" else "OFF"}")
}

