package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

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

