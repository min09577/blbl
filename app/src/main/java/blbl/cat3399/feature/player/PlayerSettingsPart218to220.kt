package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2361: compatible mode
internal fun PlayerActivity.showV2361CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2361compatible
    FeaturePrefsStore.batch2361.v2361compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2361: competent mode
internal fun PlayerActivity.showV2361CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2361competent
    FeaturePrefsStore.batch2361.v2361competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2361: complex mode
internal fun PlayerActivity.showV2361ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2361complex
    FeaturePrefsStore.batch2361.v2361complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2361: comprehensive mode
internal fun PlayerActivity.showV2361ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2361comprehensive
    FeaturePrefsStore.batch2361.v2361comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2361: concrete mode
internal fun PlayerActivity.showV2361ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2361concrete
    FeaturePrefsStore.batch2361.v2361concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2361: confident level
internal fun PlayerActivity.showV2361ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2361confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2361confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2361: conscious level
internal fun PlayerActivity.showV2361ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2361conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2361conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2361: consistent level
internal fun PlayerActivity.showV2361ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2361consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2361consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2361: contemporary level
internal fun PlayerActivity.showV2361ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2361contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2361contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2361: continuous level
internal fun PlayerActivity.showV2361ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2361continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2361continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2361: convenient mode
internal fun PlayerActivity.showV2361ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2361convenient
    FeaturePrefsStore.batch2361.v2361convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2361: convincing mode
internal fun PlayerActivity.showV2361ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2361convincing
    FeaturePrefsStore.batch2361.v2361convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2361: cooperative mode
internal fun PlayerActivity.showV2361CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2361cooperative
    FeaturePrefsStore.batch2361.v2361cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2361: creative mode
internal fun PlayerActivity.showV2361CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2361creative
    FeaturePrefsStore.batch2361.v2361creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2361: credible mode
internal fun PlayerActivity.showV2361CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2361credible
    FeaturePrefsStore.batch2361.v2361credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2362: compatible mode
internal fun PlayerActivity.showV2362CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2362compatible
    FeaturePrefsStore.batch2361.v2362compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2362: competent mode
internal fun PlayerActivity.showV2362CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2362competent
    FeaturePrefsStore.batch2361.v2362competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2362: complex mode
internal fun PlayerActivity.showV2362ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2362complex
    FeaturePrefsStore.batch2361.v2362complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2362: comprehensive mode
internal fun PlayerActivity.showV2362ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2362comprehensive
    FeaturePrefsStore.batch2361.v2362comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2362: concrete mode
internal fun PlayerActivity.showV2362ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2362concrete
    FeaturePrefsStore.batch2361.v2362concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2362: confident level
internal fun PlayerActivity.showV2362ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2362confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2362confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2362: conscious level
internal fun PlayerActivity.showV2362ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2362conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2362conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2362: consistent level
internal fun PlayerActivity.showV2362ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2362consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2362consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2362: contemporary level
internal fun PlayerActivity.showV2362ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2362contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2362contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2362: continuous level
internal fun PlayerActivity.showV2362ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2362continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2362continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2362: convenient mode
internal fun PlayerActivity.showV2362ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2362convenient
    FeaturePrefsStore.batch2361.v2362convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2362: convincing mode
internal fun PlayerActivity.showV2362ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2362convincing
    FeaturePrefsStore.batch2361.v2362convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2362: cooperative mode
internal fun PlayerActivity.showV2362CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2362cooperative
    FeaturePrefsStore.batch2361.v2362cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2362: creative mode
internal fun PlayerActivity.showV2362CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2362creative
    FeaturePrefsStore.batch2361.v2362creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2362: credible mode
internal fun PlayerActivity.showV2362CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2362credible
    FeaturePrefsStore.batch2361.v2362credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2363: compatible mode
internal fun PlayerActivity.showV2363CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2363compatible
    FeaturePrefsStore.batch2361.v2363compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2363: competent mode
internal fun PlayerActivity.showV2363CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2363competent
    FeaturePrefsStore.batch2361.v2363competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2363: complex mode
internal fun PlayerActivity.showV2363ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2363complex
    FeaturePrefsStore.batch2361.v2363complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2363: comprehensive mode
internal fun PlayerActivity.showV2363ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2363comprehensive
    FeaturePrefsStore.batch2361.v2363comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2363: concrete mode
internal fun PlayerActivity.showV2363ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2363concrete
    FeaturePrefsStore.batch2361.v2363concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2363: confident level
internal fun PlayerActivity.showV2363ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2363confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2363confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2363: conscious level
internal fun PlayerActivity.showV2363ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2363conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2363conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2363: consistent level
internal fun PlayerActivity.showV2363ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2363consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2363consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2363: contemporary level
internal fun PlayerActivity.showV2363ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2363contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2363contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2363: continuous level
internal fun PlayerActivity.showV2363ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2363continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2363continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2363: convenient mode
internal fun PlayerActivity.showV2363ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2363convenient
    FeaturePrefsStore.batch2361.v2363convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2363: convincing mode
internal fun PlayerActivity.showV2363ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2363convincing
    FeaturePrefsStore.batch2361.v2363convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2363: cooperative mode
internal fun PlayerActivity.showV2363CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2363cooperative
    FeaturePrefsStore.batch2361.v2363cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2363: creative mode
internal fun PlayerActivity.showV2363CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2363creative
    FeaturePrefsStore.batch2361.v2363creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2363: credible mode
internal fun PlayerActivity.showV2363CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2363credible
    FeaturePrefsStore.batch2361.v2363credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2364: compatible mode
internal fun PlayerActivity.showV2364CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2364compatible
    FeaturePrefsStore.batch2361.v2364compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2364: competent mode
internal fun PlayerActivity.showV2364CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2364competent
    FeaturePrefsStore.batch2361.v2364competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2364: complex mode
internal fun PlayerActivity.showV2364ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2364complex
    FeaturePrefsStore.batch2361.v2364complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2364: comprehensive mode
internal fun PlayerActivity.showV2364ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2364comprehensive
    FeaturePrefsStore.batch2361.v2364comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2364: concrete mode
internal fun PlayerActivity.showV2364ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2364concrete
    FeaturePrefsStore.batch2361.v2364concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2364: confident level
internal fun PlayerActivity.showV2364ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2364confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2364confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2364: conscious level
internal fun PlayerActivity.showV2364ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2364conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2364conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2364: consistent level
internal fun PlayerActivity.showV2364ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2364consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2364consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2364: contemporary level
internal fun PlayerActivity.showV2364ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2364contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2364contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2364: continuous level
internal fun PlayerActivity.showV2364ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2364continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2364continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2364: convenient mode
internal fun PlayerActivity.showV2364ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2364convenient
    FeaturePrefsStore.batch2361.v2364convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2364: convincing mode
internal fun PlayerActivity.showV2364ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2364convincing
    FeaturePrefsStore.batch2361.v2364convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2364: cooperative mode
internal fun PlayerActivity.showV2364CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2364cooperative
    FeaturePrefsStore.batch2361.v2364cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2364: creative mode
internal fun PlayerActivity.showV2364CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2364creative
    FeaturePrefsStore.batch2361.v2364creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2364: credible mode
internal fun PlayerActivity.showV2364CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2364credible
    FeaturePrefsStore.batch2361.v2364credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2365: compatible mode
internal fun PlayerActivity.showV2365CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2365compatible
    FeaturePrefsStore.batch2361.v2365compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2365: competent mode
internal fun PlayerActivity.showV2365CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2365competent
    FeaturePrefsStore.batch2361.v2365competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2365: complex mode
internal fun PlayerActivity.showV2365ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2365complex
    FeaturePrefsStore.batch2361.v2365complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2365: comprehensive mode
internal fun PlayerActivity.showV2365ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2365comprehensive
    FeaturePrefsStore.batch2361.v2365comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2365: concrete mode
internal fun PlayerActivity.showV2365ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2365concrete
    FeaturePrefsStore.batch2361.v2365concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2365: confident level
internal fun PlayerActivity.showV2365ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2365confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2365confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2365: conscious level
internal fun PlayerActivity.showV2365ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2365conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2365conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2365: consistent level
internal fun PlayerActivity.showV2365ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2365consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2365consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2365: contemporary level
internal fun PlayerActivity.showV2365ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2365contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2365contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2365: continuous level
internal fun PlayerActivity.showV2365ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2365continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2365continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2365: convenient mode
internal fun PlayerActivity.showV2365ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2365convenient
    FeaturePrefsStore.batch2361.v2365convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2365: convincing mode
internal fun PlayerActivity.showV2365ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2365convincing
    FeaturePrefsStore.batch2361.v2365convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2365: cooperative mode
internal fun PlayerActivity.showV2365CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2365cooperative
    FeaturePrefsStore.batch2361.v2365cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2365: creative mode
internal fun PlayerActivity.showV2365CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2365creative
    FeaturePrefsStore.batch2361.v2365creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2365: credible mode
internal fun PlayerActivity.showV2365CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2365credible
    FeaturePrefsStore.batch2361.v2365credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2366: compatible mode
internal fun PlayerActivity.showV2366CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2366compatible
    FeaturePrefsStore.batch2361.v2366compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2366: competent mode
internal fun PlayerActivity.showV2366CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2366competent
    FeaturePrefsStore.batch2361.v2366competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2366: complex mode
internal fun PlayerActivity.showV2366ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2366complex
    FeaturePrefsStore.batch2361.v2366complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2366: comprehensive mode
internal fun PlayerActivity.showV2366ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2366comprehensive
    FeaturePrefsStore.batch2361.v2366comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2366: concrete mode
internal fun PlayerActivity.showV2366ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2366concrete
    FeaturePrefsStore.batch2361.v2366concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2366: confident level
internal fun PlayerActivity.showV2366ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2366confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2366confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2366: conscious level
internal fun PlayerActivity.showV2366ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2366conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2366conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2366: consistent level
internal fun PlayerActivity.showV2366ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2366consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2366consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2366: contemporary level
internal fun PlayerActivity.showV2366ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2366contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2366contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2366: continuous level
internal fun PlayerActivity.showV2366ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2366continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2366continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2366: convenient mode
internal fun PlayerActivity.showV2366ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2366convenient
    FeaturePrefsStore.batch2361.v2366convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2366: convincing mode
internal fun PlayerActivity.showV2366ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2366convincing
    FeaturePrefsStore.batch2361.v2366convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2366: cooperative mode
internal fun PlayerActivity.showV2366CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2366cooperative
    FeaturePrefsStore.batch2361.v2366cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2366: creative mode
internal fun PlayerActivity.showV2366CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2366creative
    FeaturePrefsStore.batch2361.v2366creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2366: credible mode
internal fun PlayerActivity.showV2366CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2366credible
    FeaturePrefsStore.batch2361.v2366credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2367: compatible mode
internal fun PlayerActivity.showV2367CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2367compatible
    FeaturePrefsStore.batch2361.v2367compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2367: competent mode
internal fun PlayerActivity.showV2367CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2367competent
    FeaturePrefsStore.batch2361.v2367competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2367: complex mode
internal fun PlayerActivity.showV2367ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2367complex
    FeaturePrefsStore.batch2361.v2367complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2367: comprehensive mode
internal fun PlayerActivity.showV2367ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2367comprehensive
    FeaturePrefsStore.batch2361.v2367comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2367: concrete mode
internal fun PlayerActivity.showV2367ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2367concrete
    FeaturePrefsStore.batch2361.v2367concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2367: confident level
internal fun PlayerActivity.showV2367ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2367confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2367confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2367: conscious level
internal fun PlayerActivity.showV2367ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2367conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2367conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2367: consistent level
internal fun PlayerActivity.showV2367ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2367consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2367consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2367: contemporary level
internal fun PlayerActivity.showV2367ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2367contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2367contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2367: continuous level
internal fun PlayerActivity.showV2367ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2367continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2367continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2367: convenient mode
internal fun PlayerActivity.showV2367ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2367convenient
    FeaturePrefsStore.batch2361.v2367convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2367: convincing mode
internal fun PlayerActivity.showV2367ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2367convincing
    FeaturePrefsStore.batch2361.v2367convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2367: cooperative mode
internal fun PlayerActivity.showV2367CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2367cooperative
    FeaturePrefsStore.batch2361.v2367cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2367: creative mode
internal fun PlayerActivity.showV2367CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2367creative
    FeaturePrefsStore.batch2361.v2367creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2367: credible mode
internal fun PlayerActivity.showV2367CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2367credible
    FeaturePrefsStore.batch2361.v2367credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2368: compatible mode
internal fun PlayerActivity.showV2368CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2368compatible
    FeaturePrefsStore.batch2361.v2368compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2368: competent mode
internal fun PlayerActivity.showV2368CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2368competent
    FeaturePrefsStore.batch2361.v2368competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2368: complex mode
internal fun PlayerActivity.showV2368ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2368complex
    FeaturePrefsStore.batch2361.v2368complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2368: comprehensive mode
internal fun PlayerActivity.showV2368ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2368comprehensive
    FeaturePrefsStore.batch2361.v2368comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2368: concrete mode
internal fun PlayerActivity.showV2368ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2368concrete
    FeaturePrefsStore.batch2361.v2368concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2368: confident level
internal fun PlayerActivity.showV2368ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2368confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2368confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2368: conscious level
internal fun PlayerActivity.showV2368ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2368conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2368conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2368: consistent level
internal fun PlayerActivity.showV2368ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2368consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2368consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2368: contemporary level
internal fun PlayerActivity.showV2368ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2368contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2368contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2368: continuous level
internal fun PlayerActivity.showV2368ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2368continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2368continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2368: convenient mode
internal fun PlayerActivity.showV2368ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2368convenient
    FeaturePrefsStore.batch2361.v2368convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2368: convincing mode
internal fun PlayerActivity.showV2368ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2368convincing
    FeaturePrefsStore.batch2361.v2368convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2368: cooperative mode
internal fun PlayerActivity.showV2368CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2368cooperative
    FeaturePrefsStore.batch2361.v2368cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2368: creative mode
internal fun PlayerActivity.showV2368CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2368creative
    FeaturePrefsStore.batch2361.v2368creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2368: credible mode
internal fun PlayerActivity.showV2368CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2368credible
    FeaturePrefsStore.batch2361.v2368credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2369: compatible mode
internal fun PlayerActivity.showV2369CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2369compatible
    FeaturePrefsStore.batch2361.v2369compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2369: competent mode
internal fun PlayerActivity.showV2369CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2369competent
    FeaturePrefsStore.batch2361.v2369competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2369: complex mode
internal fun PlayerActivity.showV2369ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2369complex
    FeaturePrefsStore.batch2361.v2369complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2369: comprehensive mode
internal fun PlayerActivity.showV2369ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2369comprehensive
    FeaturePrefsStore.batch2361.v2369comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2369: concrete mode
internal fun PlayerActivity.showV2369ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2369concrete
    FeaturePrefsStore.batch2361.v2369concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2369: confident level
internal fun PlayerActivity.showV2369ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2369confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2369confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2369: conscious level
internal fun PlayerActivity.showV2369ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2369conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2369conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2369: consistent level
internal fun PlayerActivity.showV2369ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2369consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2369consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2369: contemporary level
internal fun PlayerActivity.showV2369ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2369contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2369contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2369: continuous level
internal fun PlayerActivity.showV2369ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2369continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2369continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2369: convenient mode
internal fun PlayerActivity.showV2369ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2369convenient
    FeaturePrefsStore.batch2361.v2369convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2369: convincing mode
internal fun PlayerActivity.showV2369ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2369convincing
    FeaturePrefsStore.batch2361.v2369convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2369: cooperative mode
internal fun PlayerActivity.showV2369CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2369cooperative
    FeaturePrefsStore.batch2361.v2369cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2369: creative mode
internal fun PlayerActivity.showV2369CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2369creative
    FeaturePrefsStore.batch2361.v2369creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2369: credible mode
internal fun PlayerActivity.showV2369CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2369credible
    FeaturePrefsStore.batch2361.v2369credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2370: compatible mode
internal fun PlayerActivity.showV2370CompatibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2370compatible
    FeaturePrefsStore.batch2361.v2370compatible = !current
    AppToast.show(this, "compatible: ${if (!current) "ON" else "OFF"}")
}

// v2370: competent mode
internal fun PlayerActivity.showV2370CompetentToggle() {
    val current = FeaturePrefsStore.batch2361.v2370competent
    FeaturePrefsStore.batch2361.v2370competent = !current
    AppToast.show(this, "competent: ${if (!current) "ON" else "OFF"}")
}

// v2370: complex mode
internal fun PlayerActivity.showV2370ComplexToggle() {
    val current = FeaturePrefsStore.batch2361.v2370complex
    FeaturePrefsStore.batch2361.v2370complex = !current
    AppToast.show(this, "complex: ${if (!current) "ON" else "OFF"}")
}

// v2370: comprehensive mode
internal fun PlayerActivity.showV2370ComprehensiveToggle() {
    val current = FeaturePrefsStore.batch2361.v2370comprehensive
    FeaturePrefsStore.batch2361.v2370comprehensive = !current
    AppToast.show(this, "comprehensive: ${if (!current) "ON" else "OFF"}")
}

// v2370: concrete mode
internal fun PlayerActivity.showV2370ConcreteToggle() {
    val current = FeaturePrefsStore.batch2361.v2370concrete
    FeaturePrefsStore.batch2361.v2370concrete = !current
    AppToast.show(this, "concrete: ${if (!current) "ON" else "OFF"}")
}

// v2370: confident level
internal fun PlayerActivity.showV2370ConfidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2370confident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2370confident = value
        AppToast.show(this, "confident: $value")
    }
}

// v2370: conscious level
internal fun PlayerActivity.showV2370ConsciousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2370conscious).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "conscious level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2370conscious = value
        AppToast.show(this, "conscious: $value")
    }
}

// v2370: consistent level
internal fun PlayerActivity.showV2370ConsistentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2370consistent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "consistent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2370consistent = value
        AppToast.show(this, "consistent: $value")
    }
}

// v2370: contemporary level
internal fun PlayerActivity.showV2370ContemporaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2370contemporary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "contemporary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2370contemporary = value
        AppToast.show(this, "contemporary: $value")
    }
}

// v2370: continuous level
internal fun PlayerActivity.showV2370ContinuousDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2361.v2370continuous).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "continuous level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2361.v2370continuous = value
        AppToast.show(this, "continuous: $value")
    }
}

// v2370: convenient mode
internal fun PlayerActivity.showV2370ConvenientToggle() {
    val current = FeaturePrefsStore.batch2361.v2370convenient
    FeaturePrefsStore.batch2361.v2370convenient = !current
    AppToast.show(this, "convenient: ${if (!current) "ON" else "OFF"}")
}

// v2370: convincing mode
internal fun PlayerActivity.showV2370ConvincingToggle() {
    val current = FeaturePrefsStore.batch2361.v2370convincing
    FeaturePrefsStore.batch2361.v2370convincing = !current
    AppToast.show(this, "convincing: ${if (!current) "ON" else "OFF"}")
}

// v2370: cooperative mode
internal fun PlayerActivity.showV2370CooperativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2370cooperative
    FeaturePrefsStore.batch2361.v2370cooperative = !current
    AppToast.show(this, "cooperative: ${if (!current) "ON" else "OFF"}")
}

// v2370: creative mode
internal fun PlayerActivity.showV2370CreativeToggle() {
    val current = FeaturePrefsStore.batch2361.v2370creative
    FeaturePrefsStore.batch2361.v2370creative = !current
    AppToast.show(this, "creative: ${if (!current) "ON" else "OFF"}")
}

// v2370: credible mode
internal fun PlayerActivity.showV2370CredibleToggle() {
    val current = FeaturePrefsStore.batch2361.v2370credible
    FeaturePrefsStore.batch2361.v2370credible = !current
    AppToast.show(this, "credible: ${if (!current) "ON" else "OFF"}")
}

// v2371: critical mode
internal fun PlayerActivity.showV2371CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2371critical
    FeaturePrefsStore.batch2371.v2371critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2371: crucial mode
internal fun PlayerActivity.showV2371CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2371crucial
    FeaturePrefsStore.batch2371.v2371crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2371: curious mode
internal fun PlayerActivity.showV2371CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2371curious
    FeaturePrefsStore.batch2371.v2371curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2371: decisive mode
internal fun PlayerActivity.showV2371DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2371decisive
    FeaturePrefsStore.batch2371.v2371decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2371: delicate mode
internal fun PlayerActivity.showV2371DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2371delicate
    FeaturePrefsStore.batch2371.v2371delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2371: delightful level
internal fun PlayerActivity.showV2371DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2371: dependent level
internal fun PlayerActivity.showV2371DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2371: desperate level
internal fun PlayerActivity.showV2371DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2371: detailed level
internal fun PlayerActivity.showV2371DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2371: devoted level
internal fun PlayerActivity.showV2371DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2371devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2371devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2371: different mode
internal fun PlayerActivity.showV2371DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2371different
    FeaturePrefsStore.batch2371.v2371different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2371: difficult mode
internal fun PlayerActivity.showV2371DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2371difficult
    FeaturePrefsStore.batch2371.v2371difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2371: diligent mode
internal fun PlayerActivity.showV2371DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2371diligent
    FeaturePrefsStore.batch2371.v2371diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2371: distinct mode
internal fun PlayerActivity.showV2371DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2371distinct
    FeaturePrefsStore.batch2371.v2371distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2371: diverse mode
internal fun PlayerActivity.showV2371DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2371diverse
    FeaturePrefsStore.batch2371.v2371diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2372: critical mode
internal fun PlayerActivity.showV2372CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2372critical
    FeaturePrefsStore.batch2371.v2372critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2372: crucial mode
internal fun PlayerActivity.showV2372CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2372crucial
    FeaturePrefsStore.batch2371.v2372crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2372: curious mode
internal fun PlayerActivity.showV2372CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2372curious
    FeaturePrefsStore.batch2371.v2372curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2372: decisive mode
internal fun PlayerActivity.showV2372DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2372decisive
    FeaturePrefsStore.batch2371.v2372decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2372: delicate mode
internal fun PlayerActivity.showV2372DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2372delicate
    FeaturePrefsStore.batch2371.v2372delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2372: delightful level
internal fun PlayerActivity.showV2372DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2372: dependent level
internal fun PlayerActivity.showV2372DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2372: desperate level
internal fun PlayerActivity.showV2372DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2372: detailed level
internal fun PlayerActivity.showV2372DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2372: devoted level
internal fun PlayerActivity.showV2372DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2372devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2372devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2372: different mode
internal fun PlayerActivity.showV2372DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2372different
    FeaturePrefsStore.batch2371.v2372different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2372: difficult mode
internal fun PlayerActivity.showV2372DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2372difficult
    FeaturePrefsStore.batch2371.v2372difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2372: diligent mode
internal fun PlayerActivity.showV2372DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2372diligent
    FeaturePrefsStore.batch2371.v2372diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2372: distinct mode
internal fun PlayerActivity.showV2372DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2372distinct
    FeaturePrefsStore.batch2371.v2372distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2372: diverse mode
internal fun PlayerActivity.showV2372DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2372diverse
    FeaturePrefsStore.batch2371.v2372diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2373: critical mode
internal fun PlayerActivity.showV2373CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2373critical
    FeaturePrefsStore.batch2371.v2373critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2373: crucial mode
internal fun PlayerActivity.showV2373CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2373crucial
    FeaturePrefsStore.batch2371.v2373crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2373: curious mode
internal fun PlayerActivity.showV2373CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2373curious
    FeaturePrefsStore.batch2371.v2373curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2373: decisive mode
internal fun PlayerActivity.showV2373DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2373decisive
    FeaturePrefsStore.batch2371.v2373decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2373: delicate mode
internal fun PlayerActivity.showV2373DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2373delicate
    FeaturePrefsStore.batch2371.v2373delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2373: delightful level
internal fun PlayerActivity.showV2373DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2373: dependent level
internal fun PlayerActivity.showV2373DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2373: desperate level
internal fun PlayerActivity.showV2373DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2373: detailed level
internal fun PlayerActivity.showV2373DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2373: devoted level
internal fun PlayerActivity.showV2373DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2373devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2373devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2373: different mode
internal fun PlayerActivity.showV2373DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2373different
    FeaturePrefsStore.batch2371.v2373different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2373: difficult mode
internal fun PlayerActivity.showV2373DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2373difficult
    FeaturePrefsStore.batch2371.v2373difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2373: diligent mode
internal fun PlayerActivity.showV2373DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2373diligent
    FeaturePrefsStore.batch2371.v2373diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2373: distinct mode
internal fun PlayerActivity.showV2373DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2373distinct
    FeaturePrefsStore.batch2371.v2373distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2373: diverse mode
internal fun PlayerActivity.showV2373DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2373diverse
    FeaturePrefsStore.batch2371.v2373diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2374: critical mode
internal fun PlayerActivity.showV2374CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2374critical
    FeaturePrefsStore.batch2371.v2374critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2374: crucial mode
internal fun PlayerActivity.showV2374CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2374crucial
    FeaturePrefsStore.batch2371.v2374crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2374: curious mode
internal fun PlayerActivity.showV2374CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2374curious
    FeaturePrefsStore.batch2371.v2374curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2374: decisive mode
internal fun PlayerActivity.showV2374DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2374decisive
    FeaturePrefsStore.batch2371.v2374decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2374: delicate mode
internal fun PlayerActivity.showV2374DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2374delicate
    FeaturePrefsStore.batch2371.v2374delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2374: delightful level
internal fun PlayerActivity.showV2374DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2374: dependent level
internal fun PlayerActivity.showV2374DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2374: desperate level
internal fun PlayerActivity.showV2374DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2374: detailed level
internal fun PlayerActivity.showV2374DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2374: devoted level
internal fun PlayerActivity.showV2374DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2374devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2374devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2374: different mode
internal fun PlayerActivity.showV2374DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2374different
    FeaturePrefsStore.batch2371.v2374different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2374: difficult mode
internal fun PlayerActivity.showV2374DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2374difficult
    FeaturePrefsStore.batch2371.v2374difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2374: diligent mode
internal fun PlayerActivity.showV2374DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2374diligent
    FeaturePrefsStore.batch2371.v2374diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2374: distinct mode
internal fun PlayerActivity.showV2374DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2374distinct
    FeaturePrefsStore.batch2371.v2374distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2374: diverse mode
internal fun PlayerActivity.showV2374DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2374diverse
    FeaturePrefsStore.batch2371.v2374diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2375: critical mode
internal fun PlayerActivity.showV2375CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2375critical
    FeaturePrefsStore.batch2371.v2375critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2375: crucial mode
internal fun PlayerActivity.showV2375CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2375crucial
    FeaturePrefsStore.batch2371.v2375crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2375: curious mode
internal fun PlayerActivity.showV2375CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2375curious
    FeaturePrefsStore.batch2371.v2375curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2375: decisive mode
internal fun PlayerActivity.showV2375DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2375decisive
    FeaturePrefsStore.batch2371.v2375decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2375: delicate mode
internal fun PlayerActivity.showV2375DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2375delicate
    FeaturePrefsStore.batch2371.v2375delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2375: delightful level
internal fun PlayerActivity.showV2375DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2375: dependent level
internal fun PlayerActivity.showV2375DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2375: desperate level
internal fun PlayerActivity.showV2375DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2375: detailed level
internal fun PlayerActivity.showV2375DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2375: devoted level
internal fun PlayerActivity.showV2375DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2375devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2375devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2375: different mode
internal fun PlayerActivity.showV2375DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2375different
    FeaturePrefsStore.batch2371.v2375different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2375: difficult mode
internal fun PlayerActivity.showV2375DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2375difficult
    FeaturePrefsStore.batch2371.v2375difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2375: diligent mode
internal fun PlayerActivity.showV2375DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2375diligent
    FeaturePrefsStore.batch2371.v2375diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2375: distinct mode
internal fun PlayerActivity.showV2375DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2375distinct
    FeaturePrefsStore.batch2371.v2375distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2375: diverse mode
internal fun PlayerActivity.showV2375DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2375diverse
    FeaturePrefsStore.batch2371.v2375diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2376: critical mode
internal fun PlayerActivity.showV2376CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2376critical
    FeaturePrefsStore.batch2371.v2376critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2376: crucial mode
internal fun PlayerActivity.showV2376CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2376crucial
    FeaturePrefsStore.batch2371.v2376crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2376: curious mode
internal fun PlayerActivity.showV2376CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2376curious
    FeaturePrefsStore.batch2371.v2376curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2376: decisive mode
internal fun PlayerActivity.showV2376DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2376decisive
    FeaturePrefsStore.batch2371.v2376decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2376: delicate mode
internal fun PlayerActivity.showV2376DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2376delicate
    FeaturePrefsStore.batch2371.v2376delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2376: delightful level
internal fun PlayerActivity.showV2376DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2376: dependent level
internal fun PlayerActivity.showV2376DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2376: desperate level
internal fun PlayerActivity.showV2376DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2376: detailed level
internal fun PlayerActivity.showV2376DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2376: devoted level
internal fun PlayerActivity.showV2376DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2376devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2376devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2376: different mode
internal fun PlayerActivity.showV2376DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2376different
    FeaturePrefsStore.batch2371.v2376different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2376: difficult mode
internal fun PlayerActivity.showV2376DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2376difficult
    FeaturePrefsStore.batch2371.v2376difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2376: diligent mode
internal fun PlayerActivity.showV2376DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2376diligent
    FeaturePrefsStore.batch2371.v2376diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2376: distinct mode
internal fun PlayerActivity.showV2376DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2376distinct
    FeaturePrefsStore.batch2371.v2376distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2376: diverse mode
internal fun PlayerActivity.showV2376DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2376diverse
    FeaturePrefsStore.batch2371.v2376diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2377: critical mode
internal fun PlayerActivity.showV2377CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2377critical
    FeaturePrefsStore.batch2371.v2377critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2377: crucial mode
internal fun PlayerActivity.showV2377CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2377crucial
    FeaturePrefsStore.batch2371.v2377crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2377: curious mode
internal fun PlayerActivity.showV2377CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2377curious
    FeaturePrefsStore.batch2371.v2377curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2377: decisive mode
internal fun PlayerActivity.showV2377DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2377decisive
    FeaturePrefsStore.batch2371.v2377decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2377: delicate mode
internal fun PlayerActivity.showV2377DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2377delicate
    FeaturePrefsStore.batch2371.v2377delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2377: delightful level
internal fun PlayerActivity.showV2377DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2377: dependent level
internal fun PlayerActivity.showV2377DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2377: desperate level
internal fun PlayerActivity.showV2377DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2377: detailed level
internal fun PlayerActivity.showV2377DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2377: devoted level
internal fun PlayerActivity.showV2377DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2377devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2377devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2377: different mode
internal fun PlayerActivity.showV2377DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2377different
    FeaturePrefsStore.batch2371.v2377different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2377: difficult mode
internal fun PlayerActivity.showV2377DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2377difficult
    FeaturePrefsStore.batch2371.v2377difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2377: diligent mode
internal fun PlayerActivity.showV2377DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2377diligent
    FeaturePrefsStore.batch2371.v2377diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2377: distinct mode
internal fun PlayerActivity.showV2377DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2377distinct
    FeaturePrefsStore.batch2371.v2377distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2377: diverse mode
internal fun PlayerActivity.showV2377DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2377diverse
    FeaturePrefsStore.batch2371.v2377diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2378: critical mode
internal fun PlayerActivity.showV2378CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2378critical
    FeaturePrefsStore.batch2371.v2378critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2378: crucial mode
internal fun PlayerActivity.showV2378CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2378crucial
    FeaturePrefsStore.batch2371.v2378crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2378: curious mode
internal fun PlayerActivity.showV2378CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2378curious
    FeaturePrefsStore.batch2371.v2378curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2378: decisive mode
internal fun PlayerActivity.showV2378DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2378decisive
    FeaturePrefsStore.batch2371.v2378decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2378: delicate mode
internal fun PlayerActivity.showV2378DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2378delicate
    FeaturePrefsStore.batch2371.v2378delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2378: delightful level
internal fun PlayerActivity.showV2378DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2378: dependent level
internal fun PlayerActivity.showV2378DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2378: desperate level
internal fun PlayerActivity.showV2378DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2378: detailed level
internal fun PlayerActivity.showV2378DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2378: devoted level
internal fun PlayerActivity.showV2378DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2378devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2378devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2378: different mode
internal fun PlayerActivity.showV2378DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2378different
    FeaturePrefsStore.batch2371.v2378different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2378: difficult mode
internal fun PlayerActivity.showV2378DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2378difficult
    FeaturePrefsStore.batch2371.v2378difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2378: diligent mode
internal fun PlayerActivity.showV2378DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2378diligent
    FeaturePrefsStore.batch2371.v2378diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2378: distinct mode
internal fun PlayerActivity.showV2378DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2378distinct
    FeaturePrefsStore.batch2371.v2378distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2378: diverse mode
internal fun PlayerActivity.showV2378DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2378diverse
    FeaturePrefsStore.batch2371.v2378diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2379: critical mode
internal fun PlayerActivity.showV2379CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2379critical
    FeaturePrefsStore.batch2371.v2379critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2379: crucial mode
internal fun PlayerActivity.showV2379CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2379crucial
    FeaturePrefsStore.batch2371.v2379crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2379: curious mode
internal fun PlayerActivity.showV2379CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2379curious
    FeaturePrefsStore.batch2371.v2379curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2379: decisive mode
internal fun PlayerActivity.showV2379DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2379decisive
    FeaturePrefsStore.batch2371.v2379decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2379: delicate mode
internal fun PlayerActivity.showV2379DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2379delicate
    FeaturePrefsStore.batch2371.v2379delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2379: delightful level
internal fun PlayerActivity.showV2379DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2379: dependent level
internal fun PlayerActivity.showV2379DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2379: desperate level
internal fun PlayerActivity.showV2379DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2379: detailed level
internal fun PlayerActivity.showV2379DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2379: devoted level
internal fun PlayerActivity.showV2379DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2379devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2379devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2379: different mode
internal fun PlayerActivity.showV2379DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2379different
    FeaturePrefsStore.batch2371.v2379different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2379: difficult mode
internal fun PlayerActivity.showV2379DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2379difficult
    FeaturePrefsStore.batch2371.v2379difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2379: diligent mode
internal fun PlayerActivity.showV2379DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2379diligent
    FeaturePrefsStore.batch2371.v2379diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2379: distinct mode
internal fun PlayerActivity.showV2379DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2379distinct
    FeaturePrefsStore.batch2371.v2379distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2379: diverse mode
internal fun PlayerActivity.showV2379DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2379diverse
    FeaturePrefsStore.batch2371.v2379diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v2380: critical mode
internal fun PlayerActivity.showV2380CriticalToggle() {
    val current = FeaturePrefsStore.batch2371.v2380critical
    FeaturePrefsStore.batch2371.v2380critical = !current
    AppToast.show(this, "critical: ${if (!current) "ON" else "OFF"}")
}

// v2380: crucial mode
internal fun PlayerActivity.showV2380CrucialToggle() {
    val current = FeaturePrefsStore.batch2371.v2380crucial
    FeaturePrefsStore.batch2371.v2380crucial = !current
    AppToast.show(this, "crucial: ${if (!current) "ON" else "OFF"}")
}

// v2380: curious mode
internal fun PlayerActivity.showV2380CuriousToggle() {
    val current = FeaturePrefsStore.batch2371.v2380curious
    FeaturePrefsStore.batch2371.v2380curious = !current
    AppToast.show(this, "curious: ${if (!current) "ON" else "OFF"}")
}

// v2380: decisive mode
internal fun PlayerActivity.showV2380DecisiveToggle() {
    val current = FeaturePrefsStore.batch2371.v2380decisive
    FeaturePrefsStore.batch2371.v2380decisive = !current
    AppToast.show(this, "decisive: ${if (!current) "ON" else "OFF"}")
}

// v2380: delicate mode
internal fun PlayerActivity.showV2380DelicateToggle() {
    val current = FeaturePrefsStore.batch2371.v2380delicate
    FeaturePrefsStore.batch2371.v2380delicate = !current
    AppToast.show(this, "delicate: ${if (!current) "ON" else "OFF"}")
}

// v2380: delightful level
internal fun PlayerActivity.showV2380DelightfulDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380delightful).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "delightful level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380delightful = value
        AppToast.show(this, "delightful: $value")
    }
}

// v2380: dependent level
internal fun PlayerActivity.showV2380DependentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380dependent).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dependent level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380dependent = value
        AppToast.show(this, "dependent: $value")
    }
}

// v2380: desperate level
internal fun PlayerActivity.showV2380DesperateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380desperate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desperate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380desperate = value
        AppToast.show(this, "desperate: $value")
    }
}

// v2380: detailed level
internal fun PlayerActivity.showV2380DetailedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380detailed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detailed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380detailed = value
        AppToast.show(this, "detailed: $value")
    }
}

// v2380: devoted level
internal fun PlayerActivity.showV2380DevotedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2371.v2380devoted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "devoted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2371.v2380devoted = value
        AppToast.show(this, "devoted: $value")
    }
}

// v2380: different mode
internal fun PlayerActivity.showV2380DifferentToggle() {
    val current = FeaturePrefsStore.batch2371.v2380different
    FeaturePrefsStore.batch2371.v2380different = !current
    AppToast.show(this, "different: ${if (!current) "ON" else "OFF"}")
}

// v2380: difficult mode
internal fun PlayerActivity.showV2380DifficultToggle() {
    val current = FeaturePrefsStore.batch2371.v2380difficult
    FeaturePrefsStore.batch2371.v2380difficult = !current
    AppToast.show(this, "difficult: ${if (!current) "ON" else "OFF"}")
}

// v2380: diligent mode
internal fun PlayerActivity.showV2380DiligentToggle() {
    val current = FeaturePrefsStore.batch2371.v2380diligent
    FeaturePrefsStore.batch2371.v2380diligent = !current
    AppToast.show(this, "diligent: ${if (!current) "ON" else "OFF"}")
}

// v2380: distinct mode
internal fun PlayerActivity.showV2380DistinctToggle() {
    val current = FeaturePrefsStore.batch2371.v2380distinct
    FeaturePrefsStore.batch2371.v2380distinct = !current
    AppToast.show(this, "distinct: ${if (!current) "ON" else "OFF"}")
}

// v2380: diverse mode
internal fun PlayerActivity.showV2380DiverseToggle() {
    val current = FeaturePrefsStore.batch2371.v2380diverse
    FeaturePrefsStore.batch2371.v2380diverse = !current
    AppToast.show(this, "diverse: ${if (!current) "ON" else "OFF"}")
}

// v303: Gesture Shake Action303
internal fun PlayerActivity.showV303GestureShakeAction303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303gestureShakeAction303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303gestureShakeAction303 = value
        AppToast.show(this, "Gesture Shake Action303: $value")
    }
}

// v303: Cast Audio Volume303
internal fun PlayerActivity.showV303CastAudioVolume303Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v303castAudioVolume303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303castAudioVolume303 = value
        AppToast.show(this, "Cast Audio Volume303: $value")
    }
}

// v303: Playlist Auto Skip Outro303
internal fun PlayerActivity.showV303PlaylistAutoSkipOutro303Toggle() {
    val current = BiliClient.prefs.v303playlistAutoSkipOutro303
    BiliClient.prefs.v303playlistAutoSkipOutro303 = !current
    AppToast.show(this, "Playlist Auto Skip Outro303: ${if (!current) "ON" else "OFF"}")
}

// v303: Cache Download Speed304
internal fun PlayerActivity.showV303CacheDownloadSpeed304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303cacheDownloadSpeed304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303cacheDownloadSpeed304 = value
        AppToast.show(this, "Cache Download Speed304: $value")
    }
}

// v303: Progress Bar Thumb Border303
internal fun PlayerActivity.showV303ProgressBarThumbBorder303Toggle() {
    val current = BiliClient.prefs.v303progressBarThumbBorder303
    BiliClient.prefs.v303progressBarThumbBorder303 = !current
    AppToast.show(this, "Progress Bar Thumb Border303: ${if (!current) "ON" else "OFF"}")
}

// v303: Volume Boost Peak303
internal fun PlayerActivity.showV303VolumeBoostPeak303Toggle() {
    val current = BiliClient.prefs.v303volumeBoostPeak303
    BiliClient.prefs.v303volumeBoostPeak303 = !current
    AppToast.show(this, "Volume Boost Peak303: ${if (!current) "ON" else "OFF"}")
}

// v303: History Bookmark Export303
internal fun PlayerActivity.showV303HistoryBookmarkExport303Toggle() {
    val current = BiliClient.prefs.v303historyBookmarkExport303
    BiliClient.prefs.v303historyBookmarkExport303 = !current
    AppToast.show(this, "History Bookmark Export303: ${if (!current) "ON" else "OFF"}")
}

// v303: Playback Chapter Sync303
internal fun PlayerActivity.showV303PlaybackChapterSync303Toggle() {
    val current = BiliClient.prefs.v303playbackChapterSync303
    BiliClient.prefs.v303playbackChapterSync303 = !current
    AppToast.show(this, "Playback Chapter Sync303: ${if (!current) "ON" else "OFF"}")
}

// v303: Screenshot Save Path303
internal fun PlayerActivity.showV303ScreenshotSavePath303Toggle() {
    val current = BiliClient.prefs.v303screenshotSavePath303
    BiliClient.prefs.v303screenshotSavePath303 = !current
    AppToast.show(this, "Screenshot Save Path303: ${if (!current) "ON" else "OFF"}")
}

// v303: Video Color Space303
internal fun PlayerActivity.showV303VideoColorSpace303Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303videoColorSpace303).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space303",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303videoColorSpace303 = value
        AppToast.show(this, "Video Color Space303: $value")
    }
}

// v303: Danmaku Bottom Max Count414
internal fun PlayerActivity.showV303DanmakuBottomMaxCount414Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v303danmakuBottomMaxCount414).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count414",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v303danmakuBottomMaxCount414 = value
        AppToast.show(this, "Danmaku Bottom Max Count414: $value")
    }
}

// v303: Subtitle Bg Border421
internal fun PlayerActivity.showV303SubtitleBgBorder421Toggle() {
    val current = BiliClient.prefs.v303subtitleBgBorder421
    BiliClient.prefs.v303subtitleBgBorder421 = !current
    AppToast.show(this, "Subtitle Bg Border421: ${if (!current) "ON" else "OFF"}")
}

// v304: Audio EQ Custom304
internal fun PlayerActivity.showV304AudioEQCustom304Toggle() {
    val current = BiliClient.prefs.v304audioEQCustom304
    BiliClient.prefs.v304audioEQCustom304 = !current
    AppToast.show(this, "Audio EQ Custom304: ${if (!current) "ON" else "OFF"}")
}

// v304: Danmaku Bottom Max Count415
internal fun PlayerActivity.showV304DanmakuBottomMaxCount415Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304danmakuBottomMaxCount415).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count415",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304danmakuBottomMaxCount415 = value
        AppToast.show(this, "Danmaku Bottom Max Count415: $value")
    }
}

// v304: Subtitle Bg Border422
internal fun PlayerActivity.showV304SubtitleBgBorder422Toggle() {
    val current = BiliClient.prefs.v304subtitleBgBorder422
    BiliClient.prefs.v304subtitleBgBorder422 = !current
    AppToast.show(this, "Subtitle Bg Border422: ${if (!current) "ON" else "OFF"}")
}

// v304: Gesture Shake Action304
internal fun PlayerActivity.showV304GestureShakeAction304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304gestureShakeAction304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304gestureShakeAction304 = value
        AppToast.show(this, "Gesture Shake Action304: $value")
    }
}

// v304: Cast Audio Volume304
internal fun PlayerActivity.showV304CastAudioVolume304Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v304castAudioVolume304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304castAudioVolume304 = value
        AppToast.show(this, "Cast Audio Volume304: $value")
    }
}

// v304: Playlist Auto Skip Outro304
internal fun PlayerActivity.showV304PlaylistAutoSkipOutro304Toggle() {
    val current = BiliClient.prefs.v304playlistAutoSkipOutro304
    BiliClient.prefs.v304playlistAutoSkipOutro304 = !current
    AppToast.show(this, "Playlist Auto Skip Outro304: ${if (!current) "ON" else "OFF"}")
}

// v304: Cache Download Speed305
internal fun PlayerActivity.showV304CacheDownloadSpeed305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304cacheDownloadSpeed305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304cacheDownloadSpeed305 = value
        AppToast.show(this, "Cache Download Speed305: $value")
    }
}

// v304: Progress Bar Thumb Border304
internal fun PlayerActivity.showV304ProgressBarThumbBorder304Toggle() {
    val current = BiliClient.prefs.v304progressBarThumbBorder304
    BiliClient.prefs.v304progressBarThumbBorder304 = !current
    AppToast.show(this, "Progress Bar Thumb Border304: ${if (!current) "ON" else "OFF"}")
}

// v304: Volume Boost Peak304
internal fun PlayerActivity.showV304VolumeBoostPeak304Toggle() {
    val current = BiliClient.prefs.v304volumeBoostPeak304
    BiliClient.prefs.v304volumeBoostPeak304 = !current
    AppToast.show(this, "Volume Boost Peak304: ${if (!current) "ON" else "OFF"}")
}

// v304: History Bookmark Export304
internal fun PlayerActivity.showV304HistoryBookmarkExport304Toggle() {
    val current = BiliClient.prefs.v304historyBookmarkExport304
    BiliClient.prefs.v304historyBookmarkExport304 = !current
    AppToast.show(this, "History Bookmark Export304: ${if (!current) "ON" else "OFF"}")
}

// v304: Playback Chapter Sync304
internal fun PlayerActivity.showV304PlaybackChapterSync304Toggle() {
    val current = BiliClient.prefs.v304playbackChapterSync304
    BiliClient.prefs.v304playbackChapterSync304 = !current
    AppToast.show(this, "Playback Chapter Sync304: ${if (!current) "ON" else "OFF"}")
}

// v304: Screenshot Save Path304
internal fun PlayerActivity.showV304ScreenshotSavePath304Toggle() {
    val current = BiliClient.prefs.v304screenshotSavePath304
    BiliClient.prefs.v304screenshotSavePath304 = !current
    AppToast.show(this, "Screenshot Save Path304: ${if (!current) "ON" else "OFF"}")
}

// v304: Video Color Space304
internal fun PlayerActivity.showV304VideoColorSpace304Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304videoColorSpace304).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space304",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304videoColorSpace304 = value
        AppToast.show(this, "Video Color Space304: $value")
    }
}

// v304: Danmaku Bottom Max Count416
internal fun PlayerActivity.showV304DanmakuBottomMaxCount416Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v304danmakuBottomMaxCount416).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count416",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v304danmakuBottomMaxCount416 = value
        AppToast.show(this, "Danmaku Bottom Max Count416: $value")
    }
}

// v304: Subtitle Bg Border423
internal fun PlayerActivity.showV304SubtitleBgBorder423Toggle() {
    val current = BiliClient.prefs.v304subtitleBgBorder423
    BiliClient.prefs.v304subtitleBgBorder423 = !current
    AppToast.show(this, "Subtitle Bg Border423: ${if (!current) "ON" else "OFF"}")
}

// v305: Audio EQ Custom305
internal fun PlayerActivity.showV305AudioEQCustom305Toggle() {
    val current = BiliClient.prefs.v305audioEQCustom305
    BiliClient.prefs.v305audioEQCustom305 = !current
    AppToast.show(this, "Audio EQ Custom305: ${if (!current) "ON" else "OFF"}")
}

// v305: Danmaku Bottom Max Count417
internal fun PlayerActivity.showV305DanmakuBottomMaxCount417Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305danmakuBottomMaxCount417).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count417",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305danmakuBottomMaxCount417 = value
        AppToast.show(this, "Danmaku Bottom Max Count417: $value")
    }
}

// v305: Subtitle Bg Border424
internal fun PlayerActivity.showV305SubtitleBgBorder424Toggle() {
    val current = BiliClient.prefs.v305subtitleBgBorder424
    BiliClient.prefs.v305subtitleBgBorder424 = !current
    AppToast.show(this, "Subtitle Bg Border424: ${if (!current) "ON" else "OFF"}")
}

// v305: Gesture Shake Action305
internal fun PlayerActivity.showV305GestureShakeAction305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305gestureShakeAction305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305gestureShakeAction305 = value
        AppToast.show(this, "Gesture Shake Action305: $value")
    }
}

// v305: Cast Audio Volume305
internal fun PlayerActivity.showV305CastAudioVolume305Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v305castAudioVolume305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305castAudioVolume305 = value
        AppToast.show(this, "Cast Audio Volume305: $value")
    }
}

// v305: Playlist Auto Skip Outro305
internal fun PlayerActivity.showV305PlaylistAutoSkipOutro305Toggle() {
    val current = BiliClient.prefs.v305playlistAutoSkipOutro305
    BiliClient.prefs.v305playlistAutoSkipOutro305 = !current
    AppToast.show(this, "Playlist Auto Skip Outro305: ${if (!current) "ON" else "OFF"}")
}

// v305: Cache Download Speed306
internal fun PlayerActivity.showV305CacheDownloadSpeed306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305cacheDownloadSpeed306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305cacheDownloadSpeed306 = value
        AppToast.show(this, "Cache Download Speed306: $value")
    }
}

// v305: Progress Bar Thumb Border305
internal fun PlayerActivity.showV305ProgressBarThumbBorder305Toggle() {
    val current = BiliClient.prefs.v305progressBarThumbBorder305
    BiliClient.prefs.v305progressBarThumbBorder305 = !current
    AppToast.show(this, "Progress Bar Thumb Border305: ${if (!current) "ON" else "OFF"}")
}

// v305: Volume Boost Peak305
internal fun PlayerActivity.showV305VolumeBoostPeak305Toggle() {
    val current = BiliClient.prefs.v305volumeBoostPeak305
    BiliClient.prefs.v305volumeBoostPeak305 = !current
    AppToast.show(this, "Volume Boost Peak305: ${if (!current) "ON" else "OFF"}")
}

// v305: History Bookmark Export305
internal fun PlayerActivity.showV305HistoryBookmarkExport305Toggle() {
    val current = BiliClient.prefs.v305historyBookmarkExport305
    BiliClient.prefs.v305historyBookmarkExport305 = !current
    AppToast.show(this, "History Bookmark Export305: ${if (!current) "ON" else "OFF"}")
}

// v305: Playback Chapter Sync305
internal fun PlayerActivity.showV305PlaybackChapterSync305Toggle() {
    val current = BiliClient.prefs.v305playbackChapterSync305
    BiliClient.prefs.v305playbackChapterSync305 = !current
    AppToast.show(this, "Playback Chapter Sync305: ${if (!current) "ON" else "OFF"}")
}

// v305: Screenshot Save Path305
internal fun PlayerActivity.showV305ScreenshotSavePath305Toggle() {
    val current = BiliClient.prefs.v305screenshotSavePath305
    BiliClient.prefs.v305screenshotSavePath305 = !current
    AppToast.show(this, "Screenshot Save Path305: ${if (!current) "ON" else "OFF"}")
}

// v305: Video Color Space305
internal fun PlayerActivity.showV305VideoColorSpace305Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305videoColorSpace305).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space305",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305videoColorSpace305 = value
        AppToast.show(this, "Video Color Space305: $value")
    }
}

// v305: Danmaku Bottom Max Count418
internal fun PlayerActivity.showV305DanmakuBottomMaxCount418Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v305danmakuBottomMaxCount418).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count418",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v305danmakuBottomMaxCount418 = value
        AppToast.show(this, "Danmaku Bottom Max Count418: $value")
    }
}

// v305: Subtitle Bg Border425
internal fun PlayerActivity.showV305SubtitleBgBorder425Toggle() {
    val current = BiliClient.prefs.v305subtitleBgBorder425
    BiliClient.prefs.v305subtitleBgBorder425 = !current
    AppToast.show(this, "Subtitle Bg Border425: ${if (!current) "ON" else "OFF"}")
}

// v306: Audio EQ Custom306
internal fun PlayerActivity.showV306AudioEQCustom306Toggle() {
    val current = BiliClient.prefs.v306audioEQCustom306
    BiliClient.prefs.v306audioEQCustom306 = !current
    AppToast.show(this, "Audio EQ Custom306: ${if (!current) "ON" else "OFF"}")
}

// v306: Danmaku Bottom Max Count419
internal fun PlayerActivity.showV306DanmakuBottomMaxCount419Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306danmakuBottomMaxCount419).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count419",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306danmakuBottomMaxCount419 = value
        AppToast.show(this, "Danmaku Bottom Max Count419: $value")
    }
}

// v306: Subtitle Bg Border426
internal fun PlayerActivity.showV306SubtitleBgBorder426Toggle() {
    val current = BiliClient.prefs.v306subtitleBgBorder426
    BiliClient.prefs.v306subtitleBgBorder426 = !current
    AppToast.show(this, "Subtitle Bg Border426: ${if (!current) "ON" else "OFF"}")
}

// v306: Gesture Shake Action306
internal fun PlayerActivity.showV306GestureShakeAction306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306gestureShakeAction306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306gestureShakeAction306 = value
        AppToast.show(this, "Gesture Shake Action306: $value")
    }
}

// v306: Cast Audio Volume306
internal fun PlayerActivity.showV306CastAudioVolume306Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v306castAudioVolume306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306castAudioVolume306 = value
        AppToast.show(this, "Cast Audio Volume306: $value")
    }
}

// v306: Playlist Auto Skip Outro306
internal fun PlayerActivity.showV306PlaylistAutoSkipOutro306Toggle() {
    val current = BiliClient.prefs.v306playlistAutoSkipOutro306
    BiliClient.prefs.v306playlistAutoSkipOutro306 = !current
    AppToast.show(this, "Playlist Auto Skip Outro306: ${if (!current) "ON" else "OFF"}")
}

// v306: Cache Download Speed307
internal fun PlayerActivity.showV306CacheDownloadSpeed307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306cacheDownloadSpeed307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306cacheDownloadSpeed307 = value
        AppToast.show(this, "Cache Download Speed307: $value")
    }
}

// v306: Progress Bar Thumb Border306
internal fun PlayerActivity.showV306ProgressBarThumbBorder306Toggle() {
    val current = BiliClient.prefs.v306progressBarThumbBorder306
    BiliClient.prefs.v306progressBarThumbBorder306 = !current
    AppToast.show(this, "Progress Bar Thumb Border306: ${if (!current) "ON" else "OFF"}")
}

// v306: Volume Boost Peak306
internal fun PlayerActivity.showV306VolumeBoostPeak306Toggle() {
    val current = BiliClient.prefs.v306volumeBoostPeak306
    BiliClient.prefs.v306volumeBoostPeak306 = !current
    AppToast.show(this, "Volume Boost Peak306: ${if (!current) "ON" else "OFF"}")
}

// v306: History Bookmark Export306
internal fun PlayerActivity.showV306HistoryBookmarkExport306Toggle() {
    val current = BiliClient.prefs.v306historyBookmarkExport306
    BiliClient.prefs.v306historyBookmarkExport306 = !current
    AppToast.show(this, "History Bookmark Export306: ${if (!current) "ON" else "OFF"}")
}

// v306: Playback Chapter Sync306
internal fun PlayerActivity.showV306PlaybackChapterSync306Toggle() {
    val current = BiliClient.prefs.v306playbackChapterSync306
    BiliClient.prefs.v306playbackChapterSync306 = !current
    AppToast.show(this, "Playback Chapter Sync306: ${if (!current) "ON" else "OFF"}")
}

// v306: Screenshot Save Path306
internal fun PlayerActivity.showV306ScreenshotSavePath306Toggle() {
    val current = BiliClient.prefs.v306screenshotSavePath306
    BiliClient.prefs.v306screenshotSavePath306 = !current
    AppToast.show(this, "Screenshot Save Path306: ${if (!current) "ON" else "OFF"}")
}

// v306: Video Color Space306
internal fun PlayerActivity.showV306VideoColorSpace306Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306videoColorSpace306).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space306",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306videoColorSpace306 = value
        AppToast.show(this, "Video Color Space306: $value")
    }
}

// v306: Danmaku Bottom Max Count420
internal fun PlayerActivity.showV306DanmakuBottomMaxCount420Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v306danmakuBottomMaxCount420).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count420",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v306danmakuBottomMaxCount420 = value
        AppToast.show(this, "Danmaku Bottom Max Count420: $value")
    }
}

// v306: Subtitle Bg Border427
internal fun PlayerActivity.showV306SubtitleBgBorder427Toggle() {
    val current = BiliClient.prefs.v306subtitleBgBorder427
    BiliClient.prefs.v306subtitleBgBorder427 = !current
    AppToast.show(this, "Subtitle Bg Border427: ${if (!current) "ON" else "OFF"}")
}

// v307: Audio EQ Custom307
internal fun PlayerActivity.showV307AudioEQCustom307Toggle() {
    val current = BiliClient.prefs.v307audioEQCustom307
    BiliClient.prefs.v307audioEQCustom307 = !current
    AppToast.show(this, "Audio EQ Custom307: ${if (!current) "ON" else "OFF"}")
}

// v307: Danmaku Bottom Max Count421
internal fun PlayerActivity.showV307DanmakuBottomMaxCount421Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307danmakuBottomMaxCount421).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count421",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307danmakuBottomMaxCount421 = value
        AppToast.show(this, "Danmaku Bottom Max Count421: $value")
    }
}

// v307: Subtitle Bg Border428
internal fun PlayerActivity.showV307SubtitleBgBorder428Toggle() {
    val current = BiliClient.prefs.v307subtitleBgBorder428
    BiliClient.prefs.v307subtitleBgBorder428 = !current
    AppToast.show(this, "Subtitle Bg Border428: ${if (!current) "ON" else "OFF"}")
}

// v307: Gesture Shake Action307
internal fun PlayerActivity.showV307GestureShakeAction307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307gestureShakeAction307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307gestureShakeAction307 = value
        AppToast.show(this, "Gesture Shake Action307: $value")
    }
}

// v307: Cast Audio Volume307
internal fun PlayerActivity.showV307CastAudioVolume307Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v307castAudioVolume307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307castAudioVolume307 = value
        AppToast.show(this, "Cast Audio Volume307: $value")
    }
}

// v307: Playlist Auto Skip Outro307
internal fun PlayerActivity.showV307PlaylistAutoSkipOutro307Toggle() {
    val current = BiliClient.prefs.v307playlistAutoSkipOutro307
    BiliClient.prefs.v307playlistAutoSkipOutro307 = !current
    AppToast.show(this, "Playlist Auto Skip Outro307: ${if (!current) "ON" else "OFF"}")
}

// v307: Cache Download Speed308
internal fun PlayerActivity.showV307CacheDownloadSpeed308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307cacheDownloadSpeed308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307cacheDownloadSpeed308 = value
        AppToast.show(this, "Cache Download Speed308: $value")
    }
}

// v307: Progress Bar Thumb Border307
internal fun PlayerActivity.showV307ProgressBarThumbBorder307Toggle() {
    val current = BiliClient.prefs.v307progressBarThumbBorder307
    BiliClient.prefs.v307progressBarThumbBorder307 = !current
    AppToast.show(this, "Progress Bar Thumb Border307: ${if (!current) "ON" else "OFF"}")
}

// v307: Volume Boost Peak307
internal fun PlayerActivity.showV307VolumeBoostPeak307Toggle() {
    val current = BiliClient.prefs.v307volumeBoostPeak307
    BiliClient.prefs.v307volumeBoostPeak307 = !current
    AppToast.show(this, "Volume Boost Peak307: ${if (!current) "ON" else "OFF"}")
}

// v307: History Bookmark Export307
internal fun PlayerActivity.showV307HistoryBookmarkExport307Toggle() {
    val current = BiliClient.prefs.v307historyBookmarkExport307
    BiliClient.prefs.v307historyBookmarkExport307 = !current
    AppToast.show(this, "History Bookmark Export307: ${if (!current) "ON" else "OFF"}")
}

// v307: Playback Chapter Sync307
internal fun PlayerActivity.showV307PlaybackChapterSync307Toggle() {
    val current = BiliClient.prefs.v307playbackChapterSync307
    BiliClient.prefs.v307playbackChapterSync307 = !current
    AppToast.show(this, "Playback Chapter Sync307: ${if (!current) "ON" else "OFF"}")
}

// v307: Screenshot Save Path307
internal fun PlayerActivity.showV307ScreenshotSavePath307Toggle() {
    val current = BiliClient.prefs.v307screenshotSavePath307
    BiliClient.prefs.v307screenshotSavePath307 = !current
    AppToast.show(this, "Screenshot Save Path307: ${if (!current) "ON" else "OFF"}")
}

// v307: Video Color Space307
internal fun PlayerActivity.showV307VideoColorSpace307Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307videoColorSpace307).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space307",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307videoColorSpace307 = value
        AppToast.show(this, "Video Color Space307: $value")
    }
}

// v307: Danmaku Bottom Max Count422
internal fun PlayerActivity.showV307DanmakuBottomMaxCount422Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v307danmakuBottomMaxCount422).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count422",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v307danmakuBottomMaxCount422 = value
        AppToast.show(this, "Danmaku Bottom Max Count422: $value")
    }
}

// v307: Subtitle Bg Border429
internal fun PlayerActivity.showV307SubtitleBgBorder429Toggle() {
    val current = BiliClient.prefs.v307subtitleBgBorder429
    BiliClient.prefs.v307subtitleBgBorder429 = !current
    AppToast.show(this, "Subtitle Bg Border429: ${if (!current) "ON" else "OFF"}")
}

// v308: Audio EQ Custom308
internal fun PlayerActivity.showV308AudioEQCustom308Toggle() {
    val current = BiliClient.prefs.v308audioEQCustom308
    BiliClient.prefs.v308audioEQCustom308 = !current
    AppToast.show(this, "Audio EQ Custom308: ${if (!current) "ON" else "OFF"}")
}

// v308: Danmaku Bottom Max Count423
internal fun PlayerActivity.showV308DanmakuBottomMaxCount423Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308danmakuBottomMaxCount423).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count423",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308danmakuBottomMaxCount423 = value
        AppToast.show(this, "Danmaku Bottom Max Count423: $value")
    }
}

// v308: Subtitle Bg Border430
internal fun PlayerActivity.showV308SubtitleBgBorder430Toggle() {
    val current = BiliClient.prefs.v308subtitleBgBorder430
    BiliClient.prefs.v308subtitleBgBorder430 = !current
    AppToast.show(this, "Subtitle Bg Border430: ${if (!current) "ON" else "OFF"}")
}

// v308: Gesture Shake Action308
internal fun PlayerActivity.showV308GestureShakeAction308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308gestureShakeAction308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308gestureShakeAction308 = value
        AppToast.show(this, "Gesture Shake Action308: $value")
    }
}

// v308: Cast Audio Volume308
internal fun PlayerActivity.showV308CastAudioVolume308Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v308castAudioVolume308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308castAudioVolume308 = value
        AppToast.show(this, "Cast Audio Volume308: $value")
    }
}

// v308: Playlist Auto Skip Outro308
internal fun PlayerActivity.showV308PlaylistAutoSkipOutro308Toggle() {
    val current = BiliClient.prefs.v308playlistAutoSkipOutro308
    BiliClient.prefs.v308playlistAutoSkipOutro308 = !current
    AppToast.show(this, "Playlist Auto Skip Outro308: ${if (!current) "ON" else "OFF"}")
}

// v308: Cache Download Speed309
internal fun PlayerActivity.showV308CacheDownloadSpeed309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308cacheDownloadSpeed309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308cacheDownloadSpeed309 = value
        AppToast.show(this, "Cache Download Speed309: $value")
    }
}

// v308: Progress Bar Thumb Border308
internal fun PlayerActivity.showV308ProgressBarThumbBorder308Toggle() {
    val current = BiliClient.prefs.v308progressBarThumbBorder308
    BiliClient.prefs.v308progressBarThumbBorder308 = !current
    AppToast.show(this, "Progress Bar Thumb Border308: ${if (!current) "ON" else "OFF"}")
}

// v308: Volume Boost Peak308
internal fun PlayerActivity.showV308VolumeBoostPeak308Toggle() {
    val current = BiliClient.prefs.v308volumeBoostPeak308
    BiliClient.prefs.v308volumeBoostPeak308 = !current
    AppToast.show(this, "Volume Boost Peak308: ${if (!current) "ON" else "OFF"}")
}

// v308: History Bookmark Export308
internal fun PlayerActivity.showV308HistoryBookmarkExport308Toggle() {
    val current = BiliClient.prefs.v308historyBookmarkExport308
    BiliClient.prefs.v308historyBookmarkExport308 = !current
    AppToast.show(this, "History Bookmark Export308: ${if (!current) "ON" else "OFF"}")
}

// v308: Playback Chapter Sync308
internal fun PlayerActivity.showV308PlaybackChapterSync308Toggle() {
    val current = BiliClient.prefs.v308playbackChapterSync308
    BiliClient.prefs.v308playbackChapterSync308 = !current
    AppToast.show(this, "Playback Chapter Sync308: ${if (!current) "ON" else "OFF"}")
}

// v308: Screenshot Save Path308
internal fun PlayerActivity.showV308ScreenshotSavePath308Toggle() {
    val current = BiliClient.prefs.v308screenshotSavePath308
    BiliClient.prefs.v308screenshotSavePath308 = !current
    AppToast.show(this, "Screenshot Save Path308: ${if (!current) "ON" else "OFF"}")
}

// v308: Video Color Space308
internal fun PlayerActivity.showV308VideoColorSpace308Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308videoColorSpace308).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space308",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308videoColorSpace308 = value
        AppToast.show(this, "Video Color Space308: $value")
    }
}

// v308: Danmaku Bottom Max Count424
internal fun PlayerActivity.showV308DanmakuBottomMaxCount424Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v308danmakuBottomMaxCount424).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count424",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v308danmakuBottomMaxCount424 = value
        AppToast.show(this, "Danmaku Bottom Max Count424: $value")
    }
}

// v308: Subtitle Bg Border431
internal fun PlayerActivity.showV308SubtitleBgBorder431Toggle() {
    val current = BiliClient.prefs.v308subtitleBgBorder431
    BiliClient.prefs.v308subtitleBgBorder431 = !current
    AppToast.show(this, "Subtitle Bg Border431: ${if (!current) "ON" else "OFF"}")
}

// v309: Audio EQ Custom309
internal fun PlayerActivity.showV309AudioEQCustom309Toggle() {
    val current = BiliClient.prefs.v309audioEQCustom309
    BiliClient.prefs.v309audioEQCustom309 = !current
    AppToast.show(this, "Audio EQ Custom309: ${if (!current) "ON" else "OFF"}")
}

// v309: Danmaku Bottom Max Count425
internal fun PlayerActivity.showV309DanmakuBottomMaxCount425Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309danmakuBottomMaxCount425).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count425",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309danmakuBottomMaxCount425 = value
        AppToast.show(this, "Danmaku Bottom Max Count425: $value")
    }
}

// v309: Subtitle Bg Border432
internal fun PlayerActivity.showV309SubtitleBgBorder432Toggle() {
    val current = BiliClient.prefs.v309subtitleBgBorder432
    BiliClient.prefs.v309subtitleBgBorder432 = !current
    AppToast.show(this, "Subtitle Bg Border432: ${if (!current) "ON" else "OFF"}")
}

// v309: Gesture Shake Action309
internal fun PlayerActivity.showV309GestureShakeAction309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309gestureShakeAction309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309gestureShakeAction309 = value
        AppToast.show(this, "Gesture Shake Action309: $value")
    }
}

// v309: Cast Audio Volume309
internal fun PlayerActivity.showV309CastAudioVolume309Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v309castAudioVolume309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309castAudioVolume309 = value
        AppToast.show(this, "Cast Audio Volume309: $value")
    }
}

// v309: Playlist Auto Skip Outro309
internal fun PlayerActivity.showV309PlaylistAutoSkipOutro309Toggle() {
    val current = BiliClient.prefs.v309playlistAutoSkipOutro309
    BiliClient.prefs.v309playlistAutoSkipOutro309 = !current
    AppToast.show(this, "Playlist Auto Skip Outro309: ${if (!current) "ON" else "OFF"}")
}

// v309: Cache Download Speed310
internal fun PlayerActivity.showV309CacheDownloadSpeed310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309cacheDownloadSpeed310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309cacheDownloadSpeed310 = value
        AppToast.show(this, "Cache Download Speed310: $value")
    }
}

// v309: Progress Bar Thumb Border309
internal fun PlayerActivity.showV309ProgressBarThumbBorder309Toggle() {
    val current = BiliClient.prefs.v309progressBarThumbBorder309
    BiliClient.prefs.v309progressBarThumbBorder309 = !current
    AppToast.show(this, "Progress Bar Thumb Border309: ${if (!current) "ON" else "OFF"}")
}

// v309: Volume Boost Peak309
internal fun PlayerActivity.showV309VolumeBoostPeak309Toggle() {
    val current = BiliClient.prefs.v309volumeBoostPeak309
    BiliClient.prefs.v309volumeBoostPeak309 = !current
    AppToast.show(this, "Volume Boost Peak309: ${if (!current) "ON" else "OFF"}")
}

// v309: History Bookmark Export309
internal fun PlayerActivity.showV309HistoryBookmarkExport309Toggle() {
    val current = BiliClient.prefs.v309historyBookmarkExport309
    BiliClient.prefs.v309historyBookmarkExport309 = !current
    AppToast.show(this, "History Bookmark Export309: ${if (!current) "ON" else "OFF"}")
}

// v309: Playback Chapter Sync309
internal fun PlayerActivity.showV309PlaybackChapterSync309Toggle() {
    val current = BiliClient.prefs.v309playbackChapterSync309
    BiliClient.prefs.v309playbackChapterSync309 = !current
    AppToast.show(this, "Playback Chapter Sync309: ${if (!current) "ON" else "OFF"}")
}

// v309: Screenshot Save Path309
internal fun PlayerActivity.showV309ScreenshotSavePath309Toggle() {
    val current = BiliClient.prefs.v309screenshotSavePath309
    BiliClient.prefs.v309screenshotSavePath309 = !current
    AppToast.show(this, "Screenshot Save Path309: ${if (!current) "ON" else "OFF"}")
}

// v309: Video Color Space309
internal fun PlayerActivity.showV309VideoColorSpace309Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309videoColorSpace309).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space309",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309videoColorSpace309 = value
        AppToast.show(this, "Video Color Space309: $value")
    }
}

// v309: Danmaku Bottom Max Count426
internal fun PlayerActivity.showV309DanmakuBottomMaxCount426Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v309danmakuBottomMaxCount426).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count426",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v309danmakuBottomMaxCount426 = value
        AppToast.show(this, "Danmaku Bottom Max Count426: $value")
    }
}

// v309: Subtitle Bg Border433
internal fun PlayerActivity.showV309SubtitleBgBorder433Toggle() {
    val current = BiliClient.prefs.v309subtitleBgBorder433
    BiliClient.prefs.v309subtitleBgBorder433 = !current
    AppToast.show(this, "Subtitle Bg Border433: ${if (!current) "ON" else "OFF"}")
}

// v310: Audio EQ Custom310
internal fun PlayerActivity.showV310AudioEQCustom310Toggle() {
    val current = BiliClient.prefs.v310audioEQCustom310
    BiliClient.prefs.v310audioEQCustom310 = !current
    AppToast.show(this, "Audio EQ Custom310: ${if (!current) "ON" else "OFF"}")
}

// v310: Danmaku Bottom Max Count427
internal fun PlayerActivity.showV310DanmakuBottomMaxCount427Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310danmakuBottomMaxCount427).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count427",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310danmakuBottomMaxCount427 = value
        AppToast.show(this, "Danmaku Bottom Max Count427: $value")
    }
}

// v310: Subtitle Bg Border434
internal fun PlayerActivity.showV310SubtitleBgBorder434Toggle() {
    val current = BiliClient.prefs.v310subtitleBgBorder434
    BiliClient.prefs.v310subtitleBgBorder434 = !current
    AppToast.show(this, "Subtitle Bg Border434: ${if (!current) "ON" else "OFF"}")
}

// v310: Gesture Shake Action310
internal fun PlayerActivity.showV310GestureShakeAction310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310gestureShakeAction310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Action310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310gestureShakeAction310 = value
        AppToast.show(this, "Gesture Shake Action310: $value")
    }
}

// v310: Cast Audio Volume310
internal fun PlayerActivity.showV310CastAudioVolume310Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v310castAudioVolume310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Volume310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310castAudioVolume310 = value
        AppToast.show(this, "Cast Audio Volume310: $value")
    }
}

// v310: Playlist Auto Skip Outro310
internal fun PlayerActivity.showV310PlaylistAutoSkipOutro310Toggle() {
    val current = BiliClient.prefs.v310playlistAutoSkipOutro310
    BiliClient.prefs.v310playlistAutoSkipOutro310 = !current
    AppToast.show(this, "Playlist Auto Skip Outro310: ${if (!current) "ON" else "OFF"}")
}

// v310: Cache Download Speed311
internal fun PlayerActivity.showV310CacheDownloadSpeed311Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310cacheDownloadSpeed311).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed311",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310cacheDownloadSpeed311 = value
        AppToast.show(this, "Cache Download Speed311: $value")
    }
}

// v310: Progress Bar Thumb Border310
internal fun PlayerActivity.showV310ProgressBarThumbBorder310Toggle() {
    val current = BiliClient.prefs.v310progressBarThumbBorder310
    BiliClient.prefs.v310progressBarThumbBorder310 = !current
    AppToast.show(this, "Progress Bar Thumb Border310: ${if (!current) "ON" else "OFF"}")
}

// v310: Volume Boost Peak310
internal fun PlayerActivity.showV310VolumeBoostPeak310Toggle() {
    val current = BiliClient.prefs.v310volumeBoostPeak310
    BiliClient.prefs.v310volumeBoostPeak310 = !current
    AppToast.show(this, "Volume Boost Peak310: ${if (!current) "ON" else "OFF"}")
}

// v310: History Bookmark Export310
internal fun PlayerActivity.showV310HistoryBookmarkExport310Toggle() {
    val current = BiliClient.prefs.v310historyBookmarkExport310
    BiliClient.prefs.v310historyBookmarkExport310 = !current
    AppToast.show(this, "History Bookmark Export310: ${if (!current) "ON" else "OFF"}")
}

// v310: Playback Chapter Sync310
internal fun PlayerActivity.showV310PlaybackChapterSync310Toggle() {
    val current = BiliClient.prefs.v310playbackChapterSync310
    BiliClient.prefs.v310playbackChapterSync310 = !current
    AppToast.show(this, "Playback Chapter Sync310: ${if (!current) "ON" else "OFF"}")
}

// v310: Screenshot Save Path310
internal fun PlayerActivity.showV310ScreenshotSavePath310Toggle() {
    val current = BiliClient.prefs.v310screenshotSavePath310
    BiliClient.prefs.v310screenshotSavePath310 = !current
    AppToast.show(this, "Screenshot Save Path310: ${if (!current) "ON" else "OFF"}")
}

// v310: Video Color Space310
internal fun PlayerActivity.showV310VideoColorSpace310Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310videoColorSpace310).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Space310",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310videoColorSpace310 = value
        AppToast.show(this, "Video Color Space310: $value")
    }
}

// v310: Danmaku Bottom Max Count428
internal fun PlayerActivity.showV310DanmakuBottomMaxCount428Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v310danmakuBottomMaxCount428).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count428",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v310danmakuBottomMaxCount428 = value
        AppToast.show(this, "Danmaku Bottom Max Count428: $value")
    }
}

// v310: Subtitle Bg Border435
internal fun PlayerActivity.showV310SubtitleBgBorder435Toggle() {
    val current = BiliClient.prefs.v310subtitleBgBorder435
    BiliClient.prefs.v310subtitleBgBorder435 = !current
    AppToast.show(this, "Subtitle Bg Border435: ${if (!current) "ON" else "OFF"}")
}

// v311: Audio Compressor Ratio293
internal fun PlayerActivity.showV311AudioCompressorRatio293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311audioCompressorRatio293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311audioCompressorRatio293 = value
        AppToast.show(this, "Audio Compressor Ratio293: $value")
    }
}

// v311: Danmaku Bottom Max Count429
internal fun PlayerActivity.showV311DanmakuBottomMaxCount429Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311danmakuBottomMaxCount429).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count429",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311danmakuBottomMaxCount429 = value
        AppToast.show(this, "Danmaku Bottom Max Count429: $value")
    }
}

// v311: Subtitle Fade In293
internal fun PlayerActivity.showV311SubtitleFadeIn293Toggle() {
    val current = BiliClient.prefs.v311subtitleFadeIn293
    BiliClient.prefs.v311subtitleFadeIn293 = !current
    AppToast.show(this, "Subtitle Fade In293: ${if (!current) "ON" else "OFF"}")
}

// v311: Gesture Shake Sensitivity293
internal fun PlayerActivity.showV311GestureShakeSensitivity293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311gestureShakeSensitivity293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311gestureShakeSensitivity293 = value
        AppToast.show(this, "Gesture Shake Sensitivity293: $value")
    }
}

// v311: Cast Bitrate293
internal fun PlayerActivity.showV311CastBitrate293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311castBitrate293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311castBitrate293 = value
        AppToast.show(this, "Cast Bitrate293: $value")
    }
}

// v311: Playlist Auto Next293
internal fun PlayerActivity.showV311PlaylistAutoNext293Toggle() {
    val current = BiliClient.prefs.v311playlistAutoNext293
    BiliClient.prefs.v311playlistAutoNext293 = !current
    AppToast.show(this, "Playlist Auto Next293: ${if (!current) "ON" else "OFF"}")
}

// v311: Cache Preload Size294
internal fun PlayerActivity.showV311CachePreloadSize294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311cachePreloadSize294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311cachePreloadSize294 = value
        AppToast.show(this, "Cache Preload Size294: $value")
    }
}

// v311: Progress Bar Style293
internal fun PlayerActivity.showV311ProgressBarStyle293Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311progressBarStyle293).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style293",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311progressBarStyle293 = value
        AppToast.show(this, "Progress Bar Style293: $value")
    }
}

// v311: Volume Normalize Mode293
internal fun PlayerActivity.showV311VolumeNormalizeMode293Toggle() {
    val current = BiliClient.prefs.v311volumeNormalizeMode293
    BiliClient.prefs.v311volumeNormalizeMode293 = !current
    AppToast.show(this, "Volume Normalize Mode293: ${if (!current) "ON" else "OFF"}")
}

// v311: History Auto Clean293
internal fun PlayerActivity.showV311HistoryAutoClean293Toggle() {
    val current = BiliClient.prefs.v311historyAutoClean293
    BiliClient.prefs.v311historyAutoClean293 = !current
    AppToast.show(this, "History Auto Clean293: ${if (!current) "ON" else "OFF"}")
}

// v311: Playback Resume From Background293
internal fun PlayerActivity.showV311PlaybackResumeFromBackground293Toggle() {
    val current = BiliClient.prefs.v311playbackResumeFromBackground293
    BiliClient.prefs.v311playbackResumeFromBackground293 = !current
    AppToast.show(this, "Playback Resume From Background293: ${if (!current) "ON" else "OFF"}")
}

// v311: Screenshot Enhance293
internal fun PlayerActivity.showV311ScreenshotEnhance293Toggle() {
    val current = BiliClient.prefs.v311screenshotEnhance293
    BiliClient.prefs.v311screenshotEnhance293 = !current
    AppToast.show(this, "Screenshot Enhance293: ${if (!current) "ON" else "OFF"}")
}

// v311: Video HDR293
internal fun PlayerActivity.showV311VideoHDR293Toggle() {
    val current = BiliClient.prefs.v311videoHDR293
    BiliClient.prefs.v311videoHDR293 = !current
    AppToast.show(this, "Video HDR293: ${if (!current) "ON" else "OFF"}")
}

// v311: Danmaku Bottom Max Count430
internal fun PlayerActivity.showV311DanmakuBottomMaxCount430Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v311danmakuBottomMaxCount430).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count430",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v311danmakuBottomMaxCount430 = value
        AppToast.show(this, "Danmaku Bottom Max Count430: $value")
    }
}

// v311: Subtitle Fade In294
internal fun PlayerActivity.showV311SubtitleFadeIn294Toggle() {
    val current = BiliClient.prefs.v311subtitleFadeIn294
    BiliClient.prefs.v311subtitleFadeIn294 = !current
    AppToast.show(this, "Subtitle Fade In294: ${if (!current) "ON" else "OFF"}")
}

// v312: Audio Compressor Ratio294
internal fun PlayerActivity.showV312AudioCompressorRatio294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312audioCompressorRatio294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312audioCompressorRatio294 = value
        AppToast.show(this, "Audio Compressor Ratio294: $value")
    }
}

// v312: Danmaku Bottom Max Count431
internal fun PlayerActivity.showV312DanmakuBottomMaxCount431Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312danmakuBottomMaxCount431).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count431",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312danmakuBottomMaxCount431 = value
        AppToast.show(this, "Danmaku Bottom Max Count431: $value")
    }
}

// v312: Subtitle Fade In295
internal fun PlayerActivity.showV312SubtitleFadeIn295Toggle() {
    val current = BiliClient.prefs.v312subtitleFadeIn295
    BiliClient.prefs.v312subtitleFadeIn295 = !current
    AppToast.show(this, "Subtitle Fade In295: ${if (!current) "ON" else "OFF"}")
}

// v312: Gesture Shake Sensitivity294
internal fun PlayerActivity.showV312GestureShakeSensitivity294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312gestureShakeSensitivity294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312gestureShakeSensitivity294 = value
        AppToast.show(this, "Gesture Shake Sensitivity294: $value")
    }
}

// v312: Cast Bitrate294
internal fun PlayerActivity.showV312CastBitrate294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312castBitrate294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312castBitrate294 = value
        AppToast.show(this, "Cast Bitrate294: $value")
    }
}

// v312: Playlist Auto Next294
internal fun PlayerActivity.showV312PlaylistAutoNext294Toggle() {
    val current = BiliClient.prefs.v312playlistAutoNext294
    BiliClient.prefs.v312playlistAutoNext294 = !current
    AppToast.show(this, "Playlist Auto Next294: ${if (!current) "ON" else "OFF"}")
}

// v312: Cache Preload Size295
internal fun PlayerActivity.showV312CachePreloadSize295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312cachePreloadSize295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312cachePreloadSize295 = value
        AppToast.show(this, "Cache Preload Size295: $value")
    }
}

// v312: Progress Bar Style294
internal fun PlayerActivity.showV312ProgressBarStyle294Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312progressBarStyle294).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style294",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312progressBarStyle294 = value
        AppToast.show(this, "Progress Bar Style294: $value")
    }
}

// v312: Volume Normalize Mode294
internal fun PlayerActivity.showV312VolumeNormalizeMode294Toggle() {
    val current = BiliClient.prefs.v312volumeNormalizeMode294
    BiliClient.prefs.v312volumeNormalizeMode294 = !current
    AppToast.show(this, "Volume Normalize Mode294: ${if (!current) "ON" else "OFF"}")
}

// v312: History Auto Clean294
internal fun PlayerActivity.showV312HistoryAutoClean294Toggle() {
    val current = BiliClient.prefs.v312historyAutoClean294
    BiliClient.prefs.v312historyAutoClean294 = !current
    AppToast.show(this, "History Auto Clean294: ${if (!current) "ON" else "OFF"}")
}

// v312: Playback Resume From Background294
internal fun PlayerActivity.showV312PlaybackResumeFromBackground294Toggle() {
    val current = BiliClient.prefs.v312playbackResumeFromBackground294
    BiliClient.prefs.v312playbackResumeFromBackground294 = !current
    AppToast.show(this, "Playback Resume From Background294: ${if (!current) "ON" else "OFF"}")
}

// v312: Screenshot Enhance294
internal fun PlayerActivity.showV312ScreenshotEnhance294Toggle() {
    val current = BiliClient.prefs.v312screenshotEnhance294
    BiliClient.prefs.v312screenshotEnhance294 = !current
    AppToast.show(this, "Screenshot Enhance294: ${if (!current) "ON" else "OFF"}")
}

// v312: Video HDR294
internal fun PlayerActivity.showV312VideoHDR294Toggle() {
    val current = BiliClient.prefs.v312videoHDR294
    BiliClient.prefs.v312videoHDR294 = !current
    AppToast.show(this, "Video HDR294: ${if (!current) "ON" else "OFF"}")
}

// v312: Danmaku Bottom Max Count432
internal fun PlayerActivity.showV312DanmakuBottomMaxCount432Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v312danmakuBottomMaxCount432).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count432",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v312danmakuBottomMaxCount432 = value
        AppToast.show(this, "Danmaku Bottom Max Count432: $value")
    }
}

// v312: Subtitle Fade In296
internal fun PlayerActivity.showV312SubtitleFadeIn296Toggle() {
    val current = BiliClient.prefs.v312subtitleFadeIn296
    BiliClient.prefs.v312subtitleFadeIn296 = !current
    AppToast.show(this, "Subtitle Fade In296: ${if (!current) "ON" else "OFF"}")
}

// v313: Audio Compressor Ratio295
internal fun PlayerActivity.showV313AudioCompressorRatio295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313audioCompressorRatio295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313audioCompressorRatio295 = value
        AppToast.show(this, "Audio Compressor Ratio295: $value")
    }
}

// v313: Danmaku Bottom Max Count433
internal fun PlayerActivity.showV313DanmakuBottomMaxCount433Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313danmakuBottomMaxCount433).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count433",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313danmakuBottomMaxCount433 = value
        AppToast.show(this, "Danmaku Bottom Max Count433: $value")
    }
}

// v313: Subtitle Fade In297
internal fun PlayerActivity.showV313SubtitleFadeIn297Toggle() {
    val current = BiliClient.prefs.v313subtitleFadeIn297
    BiliClient.prefs.v313subtitleFadeIn297 = !current
    AppToast.show(this, "Subtitle Fade In297: ${if (!current) "ON" else "OFF"}")
}

// v313: Gesture Shake Sensitivity295
internal fun PlayerActivity.showV313GestureShakeSensitivity295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313gestureShakeSensitivity295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313gestureShakeSensitivity295 = value
        AppToast.show(this, "Gesture Shake Sensitivity295: $value")
    }
}

// v313: Cast Bitrate295
internal fun PlayerActivity.showV313CastBitrate295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313castBitrate295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313castBitrate295 = value
        AppToast.show(this, "Cast Bitrate295: $value")
    }
}

// v313: Playlist Auto Next295
internal fun PlayerActivity.showV313PlaylistAutoNext295Toggle() {
    val current = BiliClient.prefs.v313playlistAutoNext295
    BiliClient.prefs.v313playlistAutoNext295 = !current
    AppToast.show(this, "Playlist Auto Next295: ${if (!current) "ON" else "OFF"}")
}

// v313: Cache Preload Size296
internal fun PlayerActivity.showV313CachePreloadSize296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313cachePreloadSize296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313cachePreloadSize296 = value
        AppToast.show(this, "Cache Preload Size296: $value")
    }
}

// v313: Progress Bar Style295
internal fun PlayerActivity.showV313ProgressBarStyle295Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313progressBarStyle295).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style295",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313progressBarStyle295 = value
        AppToast.show(this, "Progress Bar Style295: $value")
    }
}

// v313: Volume Normalize Mode295
internal fun PlayerActivity.showV313VolumeNormalizeMode295Toggle() {
    val current = BiliClient.prefs.v313volumeNormalizeMode295
    BiliClient.prefs.v313volumeNormalizeMode295 = !current
    AppToast.show(this, "Volume Normalize Mode295: ${if (!current) "ON" else "OFF"}")
}

// v313: History Auto Clean295
internal fun PlayerActivity.showV313HistoryAutoClean295Toggle() {
    val current = BiliClient.prefs.v313historyAutoClean295
    BiliClient.prefs.v313historyAutoClean295 = !current
    AppToast.show(this, "History Auto Clean295: ${if (!current) "ON" else "OFF"}")
}

// v313: Playback Resume From Background295
internal fun PlayerActivity.showV313PlaybackResumeFromBackground295Toggle() {
    val current = BiliClient.prefs.v313playbackResumeFromBackground295
    BiliClient.prefs.v313playbackResumeFromBackground295 = !current
    AppToast.show(this, "Playback Resume From Background295: ${if (!current) "ON" else "OFF"}")
}

// v313: Screenshot Enhance295
internal fun PlayerActivity.showV313ScreenshotEnhance295Toggle() {
    val current = BiliClient.prefs.v313screenshotEnhance295
    BiliClient.prefs.v313screenshotEnhance295 = !current
    AppToast.show(this, "Screenshot Enhance295: ${if (!current) "ON" else "OFF"}")
}

// v313: Video HDR295
internal fun PlayerActivity.showV313VideoHDR295Toggle() {
    val current = BiliClient.prefs.v313videoHDR295
    BiliClient.prefs.v313videoHDR295 = !current
    AppToast.show(this, "Video HDR295: ${if (!current) "ON" else "OFF"}")
}

// v313: Danmaku Bottom Max Count434
internal fun PlayerActivity.showV313DanmakuBottomMaxCount434Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v313danmakuBottomMaxCount434).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count434",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v313danmakuBottomMaxCount434 = value
        AppToast.show(this, "Danmaku Bottom Max Count434: $value")
    }
}

// v313: Subtitle Fade In298
internal fun PlayerActivity.showV313SubtitleFadeIn298Toggle() {
    val current = BiliClient.prefs.v313subtitleFadeIn298
    BiliClient.prefs.v313subtitleFadeIn298 = !current
    AppToast.show(this, "Subtitle Fade In298: ${if (!current) "ON" else "OFF"}")
}

// v314: Audio Compressor Ratio296
internal fun PlayerActivity.showV314AudioCompressorRatio296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314audioCompressorRatio296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314audioCompressorRatio296 = value
        AppToast.show(this, "Audio Compressor Ratio296: $value")
    }
}

// v314: Danmaku Bottom Max Count435
internal fun PlayerActivity.showV314DanmakuBottomMaxCount435Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314danmakuBottomMaxCount435).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count435",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314danmakuBottomMaxCount435 = value
        AppToast.show(this, "Danmaku Bottom Max Count435: $value")
    }
}

// v314: Subtitle Fade In299
internal fun PlayerActivity.showV314SubtitleFadeIn299Toggle() {
    val current = BiliClient.prefs.v314subtitleFadeIn299
    BiliClient.prefs.v314subtitleFadeIn299 = !current
    AppToast.show(this, "Subtitle Fade In299: ${if (!current) "ON" else "OFF"}")
}

// v314: Gesture Shake Sensitivity296
internal fun PlayerActivity.showV314GestureShakeSensitivity296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314gestureShakeSensitivity296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314gestureShakeSensitivity296 = value
        AppToast.show(this, "Gesture Shake Sensitivity296: $value")
    }
}

// v314: Cast Bitrate296
internal fun PlayerActivity.showV314CastBitrate296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314castBitrate296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314castBitrate296 = value
        AppToast.show(this, "Cast Bitrate296: $value")
    }
}

// v314: Playlist Auto Next296
internal fun PlayerActivity.showV314PlaylistAutoNext296Toggle() {
    val current = BiliClient.prefs.v314playlistAutoNext296
    BiliClient.prefs.v314playlistAutoNext296 = !current
    AppToast.show(this, "Playlist Auto Next296: ${if (!current) "ON" else "OFF"}")
}

// v314: Cache Preload Size297
internal fun PlayerActivity.showV314CachePreloadSize297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314cachePreloadSize297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314cachePreloadSize297 = value
        AppToast.show(this, "Cache Preload Size297: $value")
    }
}

// v314: Progress Bar Style296
internal fun PlayerActivity.showV314ProgressBarStyle296Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314progressBarStyle296).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style296",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314progressBarStyle296 = value
        AppToast.show(this, "Progress Bar Style296: $value")
    }
}

// v314: Volume Normalize Mode296
internal fun PlayerActivity.showV314VolumeNormalizeMode296Toggle() {
    val current = BiliClient.prefs.v314volumeNormalizeMode296
    BiliClient.prefs.v314volumeNormalizeMode296 = !current
    AppToast.show(this, "Volume Normalize Mode296: ${if (!current) "ON" else "OFF"}")
}

// v314: History Auto Clean296
internal fun PlayerActivity.showV314HistoryAutoClean296Toggle() {
    val current = BiliClient.prefs.v314historyAutoClean296
    BiliClient.prefs.v314historyAutoClean296 = !current
    AppToast.show(this, "History Auto Clean296: ${if (!current) "ON" else "OFF"}")
}

// v314: Playback Resume From Background296
internal fun PlayerActivity.showV314PlaybackResumeFromBackground296Toggle() {
    val current = BiliClient.prefs.v314playbackResumeFromBackground296
    BiliClient.prefs.v314playbackResumeFromBackground296 = !current
    AppToast.show(this, "Playback Resume From Background296: ${if (!current) "ON" else "OFF"}")
}

// v314: Screenshot Enhance296
internal fun PlayerActivity.showV314ScreenshotEnhance296Toggle() {
    val current = BiliClient.prefs.v314screenshotEnhance296
    BiliClient.prefs.v314screenshotEnhance296 = !current
    AppToast.show(this, "Screenshot Enhance296: ${if (!current) "ON" else "OFF"}")
}

// v314: Video HDR296
internal fun PlayerActivity.showV314VideoHDR296Toggle() {
    val current = BiliClient.prefs.v314videoHDR296
    BiliClient.prefs.v314videoHDR296 = !current
    AppToast.show(this, "Video HDR296: ${if (!current) "ON" else "OFF"}")
}

// v314: Danmaku Bottom Max Count436
internal fun PlayerActivity.showV314DanmakuBottomMaxCount436Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v314danmakuBottomMaxCount436).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count436",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v314danmakuBottomMaxCount436 = value
        AppToast.show(this, "Danmaku Bottom Max Count436: $value")
    }
}

// v314: Subtitle Fade In300
internal fun PlayerActivity.showV314SubtitleFadeIn300Toggle() {
    val current = BiliClient.prefs.v314subtitleFadeIn300
    BiliClient.prefs.v314subtitleFadeIn300 = !current
    AppToast.show(this, "Subtitle Fade In300: ${if (!current) "ON" else "OFF"}")
}

// v315: Audio Compressor Ratio297
internal fun PlayerActivity.showV315AudioCompressorRatio297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315audioCompressorRatio297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315audioCompressorRatio297 = value
        AppToast.show(this, "Audio Compressor Ratio297: $value")
    }
}

// v315: Danmaku Bottom Max Count437
internal fun PlayerActivity.showV315DanmakuBottomMaxCount437Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315danmakuBottomMaxCount437).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count437",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315danmakuBottomMaxCount437 = value
        AppToast.show(this, "Danmaku Bottom Max Count437: $value")
    }
}

// v315: Subtitle Fade In301
internal fun PlayerActivity.showV315SubtitleFadeIn301Toggle() {
    val current = BiliClient.prefs.v315subtitleFadeIn301
    BiliClient.prefs.v315subtitleFadeIn301 = !current
    AppToast.show(this, "Subtitle Fade In301: ${if (!current) "ON" else "OFF"}")
}

// v315: Gesture Shake Sensitivity297
internal fun PlayerActivity.showV315GestureShakeSensitivity297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315gestureShakeSensitivity297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315gestureShakeSensitivity297 = value
        AppToast.show(this, "Gesture Shake Sensitivity297: $value")
    }
}

// v315: Cast Bitrate297
internal fun PlayerActivity.showV315CastBitrate297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315castBitrate297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315castBitrate297 = value
        AppToast.show(this, "Cast Bitrate297: $value")
    }
}

// v315: Playlist Auto Next297
internal fun PlayerActivity.showV315PlaylistAutoNext297Toggle() {
    val current = BiliClient.prefs.v315playlistAutoNext297
    BiliClient.prefs.v315playlistAutoNext297 = !current
    AppToast.show(this, "Playlist Auto Next297: ${if (!current) "ON" else "OFF"}")
}

// v315: Cache Preload Size298
internal fun PlayerActivity.showV315CachePreloadSize298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315cachePreloadSize298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315cachePreloadSize298 = value
        AppToast.show(this, "Cache Preload Size298: $value")
    }
}

// v315: Progress Bar Style297
internal fun PlayerActivity.showV315ProgressBarStyle297Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315progressBarStyle297).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style297",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315progressBarStyle297 = value
        AppToast.show(this, "Progress Bar Style297: $value")
    }
}

// v315: Volume Normalize Mode297
internal fun PlayerActivity.showV315VolumeNormalizeMode297Toggle() {
    val current = BiliClient.prefs.v315volumeNormalizeMode297
    BiliClient.prefs.v315volumeNormalizeMode297 = !current
    AppToast.show(this, "Volume Normalize Mode297: ${if (!current) "ON" else "OFF"}")
}

// v315: History Auto Clean297
internal fun PlayerActivity.showV315HistoryAutoClean297Toggle() {
    val current = BiliClient.prefs.v315historyAutoClean297
    BiliClient.prefs.v315historyAutoClean297 = !current
    AppToast.show(this, "History Auto Clean297: ${if (!current) "ON" else "OFF"}")
}

// v315: Playback Resume From Background297
internal fun PlayerActivity.showV315PlaybackResumeFromBackground297Toggle() {
    val current = BiliClient.prefs.v315playbackResumeFromBackground297
    BiliClient.prefs.v315playbackResumeFromBackground297 = !current
    AppToast.show(this, "Playback Resume From Background297: ${if (!current) "ON" else "OFF"}")
}

// v315: Screenshot Enhance297
internal fun PlayerActivity.showV315ScreenshotEnhance297Toggle() {
    val current = BiliClient.prefs.v315screenshotEnhance297
    BiliClient.prefs.v315screenshotEnhance297 = !current
    AppToast.show(this, "Screenshot Enhance297: ${if (!current) "ON" else "OFF"}")
}

// v315: Video HDR297
internal fun PlayerActivity.showV315VideoHDR297Toggle() {
    val current = BiliClient.prefs.v315videoHDR297
    BiliClient.prefs.v315videoHDR297 = !current
    AppToast.show(this, "Video HDR297: ${if (!current) "ON" else "OFF"}")
}

// v315: Danmaku Bottom Max Count438
internal fun PlayerActivity.showV315DanmakuBottomMaxCount438Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v315danmakuBottomMaxCount438).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count438",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v315danmakuBottomMaxCount438 = value
        AppToast.show(this, "Danmaku Bottom Max Count438: $value")
    }
}

// v315: Subtitle Fade In302
internal fun PlayerActivity.showV315SubtitleFadeIn302Toggle() {
    val current = BiliClient.prefs.v315subtitleFadeIn302
    BiliClient.prefs.v315subtitleFadeIn302 = !current
    AppToast.show(this, "Subtitle Fade In302: ${if (!current) "ON" else "OFF"}")
}

// v316: Audio Compressor Ratio298
internal fun PlayerActivity.showV316AudioCompressorRatio298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316audioCompressorRatio298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Compressor Ratio298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316audioCompressorRatio298 = value
        AppToast.show(this, "Audio Compressor Ratio298: $value")
    }
}

// v316: Danmaku Bottom Max Count439
internal fun PlayerActivity.showV316DanmakuBottomMaxCount439Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316danmakuBottomMaxCount439).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Bottom Max Count439",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316danmakuBottomMaxCount439 = value
        AppToast.show(this, "Danmaku Bottom Max Count439: $value")
    }
}

// v316: Subtitle Fade In303
internal fun PlayerActivity.showV316SubtitleFadeIn303Toggle() {
    val current = BiliClient.prefs.v316subtitleFadeIn303
    BiliClient.prefs.v316subtitleFadeIn303 = !current
    AppToast.show(this, "Subtitle Fade In303: ${if (!current) "ON" else "OFF"}")
}

// v316: Gesture Shake Sensitivity298
internal fun PlayerActivity.showV316GestureShakeSensitivity298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316gestureShakeSensitivity298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Shake Sensitivity298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316gestureShakeSensitivity298 = value
        AppToast.show(this, "Gesture Shake Sensitivity298: $value")
    }
}

// v316: Cast Bitrate298
internal fun PlayerActivity.showV316CastBitrate298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316castBitrate298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Bitrate298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316castBitrate298 = value
        AppToast.show(this, "Cast Bitrate298: $value")
    }
}

// v316: Playlist Auto Next298
internal fun PlayerActivity.showV316PlaylistAutoNext298Toggle() {
    val current = BiliClient.prefs.v316playlistAutoNext298
    BiliClient.prefs.v316playlistAutoNext298 = !current
    AppToast.show(this, "Playlist Auto Next298: ${if (!current) "ON" else "OFF"}")
}

// v316: Cache Preload Size299
internal fun PlayerActivity.showV316CachePreloadSize299Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316cachePreloadSize299).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Size299",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316cachePreloadSize299 = value
        AppToast.show(this, "Cache Preload Size299: $value")
    }
}

// v316: Progress Bar Style298
internal fun PlayerActivity.showV316ProgressBarStyle298Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v316progressBarStyle298).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Style298",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v316progressBarStyle298 = value
        AppToast.show(this, "Progress Bar Style298: $value")
    }
}

// v2381: dominant mode
internal fun PlayerActivity.showV2381DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2381dominant
    FeaturePrefsStore.batch2381.v2381dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2381: dramatic mode
internal fun PlayerActivity.showV2381DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2381dramatic
    FeaturePrefsStore.batch2381.v2381dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2381: efficient mode
internal fun PlayerActivity.showV2381EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2381efficient
    FeaturePrefsStore.batch2381.v2381efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2381: eloquent mode
internal fun PlayerActivity.showV2381EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2381eloquent
    FeaturePrefsStore.batch2381.v2381eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2381: emotional mode
internal fun PlayerActivity.showV2381EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2381emotional
    FeaturePrefsStore.batch2381.v2381emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2381: empathetic level
internal fun PlayerActivity.showV2381EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2381: essential level
internal fun PlayerActivity.showV2381EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2381: evident level
internal fun PlayerActivity.showV2381EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2381: evolutionary level
internal fun PlayerActivity.showV2381EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2381: exceptional level
internal fun PlayerActivity.showV2381ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2381exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2381exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2381: exclusive mode
internal fun PlayerActivity.showV2381ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2381exclusive
    FeaturePrefsStore.batch2381.v2381exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2381: exotic mode
internal fun PlayerActivity.showV2381ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2381exotic
    FeaturePrefsStore.batch2381.v2381exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2381: experienced mode
internal fun PlayerActivity.showV2381ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2381experienced
    FeaturePrefsStore.batch2381.v2381experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2381: experimental mode
internal fun PlayerActivity.showV2381ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2381experimental
    FeaturePrefsStore.batch2381.v2381experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2381: explicit mode
internal fun PlayerActivity.showV2381ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2381explicit
    FeaturePrefsStore.batch2381.v2381explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2382: dominant mode
internal fun PlayerActivity.showV2382DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2382dominant
    FeaturePrefsStore.batch2381.v2382dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2382: dramatic mode
internal fun PlayerActivity.showV2382DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2382dramatic
    FeaturePrefsStore.batch2381.v2382dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2382: efficient mode
internal fun PlayerActivity.showV2382EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2382efficient
    FeaturePrefsStore.batch2381.v2382efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2382: eloquent mode
internal fun PlayerActivity.showV2382EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2382eloquent
    FeaturePrefsStore.batch2381.v2382eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2382: emotional mode
internal fun PlayerActivity.showV2382EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2382emotional
    FeaturePrefsStore.batch2381.v2382emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2382: empathetic level
internal fun PlayerActivity.showV2382EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2382: essential level
internal fun PlayerActivity.showV2382EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2382: evident level
internal fun PlayerActivity.showV2382EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2382: evolutionary level
internal fun PlayerActivity.showV2382EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2382: exceptional level
internal fun PlayerActivity.showV2382ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2382exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2382exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2382: exclusive mode
internal fun PlayerActivity.showV2382ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2382exclusive
    FeaturePrefsStore.batch2381.v2382exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2382: exotic mode
internal fun PlayerActivity.showV2382ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2382exotic
    FeaturePrefsStore.batch2381.v2382exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2382: experienced mode
internal fun PlayerActivity.showV2382ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2382experienced
    FeaturePrefsStore.batch2381.v2382experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2382: experimental mode
internal fun PlayerActivity.showV2382ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2382experimental
    FeaturePrefsStore.batch2381.v2382experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2382: explicit mode
internal fun PlayerActivity.showV2382ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2382explicit
    FeaturePrefsStore.batch2381.v2382explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2383: dominant mode
internal fun PlayerActivity.showV2383DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2383dominant
    FeaturePrefsStore.batch2381.v2383dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2383: dramatic mode
internal fun PlayerActivity.showV2383DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2383dramatic
    FeaturePrefsStore.batch2381.v2383dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2383: efficient mode
internal fun PlayerActivity.showV2383EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2383efficient
    FeaturePrefsStore.batch2381.v2383efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2383: eloquent mode
internal fun PlayerActivity.showV2383EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2383eloquent
    FeaturePrefsStore.batch2381.v2383eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2383: emotional mode
internal fun PlayerActivity.showV2383EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2383emotional
    FeaturePrefsStore.batch2381.v2383emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2383: empathetic level
internal fun PlayerActivity.showV2383EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2383: essential level
internal fun PlayerActivity.showV2383EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2383: evident level
internal fun PlayerActivity.showV2383EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2383: evolutionary level
internal fun PlayerActivity.showV2383EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2383: exceptional level
internal fun PlayerActivity.showV2383ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2383exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2383exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2383: exclusive mode
internal fun PlayerActivity.showV2383ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2383exclusive
    FeaturePrefsStore.batch2381.v2383exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2383: exotic mode
internal fun PlayerActivity.showV2383ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2383exotic
    FeaturePrefsStore.batch2381.v2383exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2383: experienced mode
internal fun PlayerActivity.showV2383ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2383experienced
    FeaturePrefsStore.batch2381.v2383experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2383: experimental mode
internal fun PlayerActivity.showV2383ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2383experimental
    FeaturePrefsStore.batch2381.v2383experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2383: explicit mode
internal fun PlayerActivity.showV2383ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2383explicit
    FeaturePrefsStore.batch2381.v2383explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2384: dominant mode
internal fun PlayerActivity.showV2384DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2384dominant
    FeaturePrefsStore.batch2381.v2384dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2384: dramatic mode
internal fun PlayerActivity.showV2384DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2384dramatic
    FeaturePrefsStore.batch2381.v2384dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2384: efficient mode
internal fun PlayerActivity.showV2384EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2384efficient
    FeaturePrefsStore.batch2381.v2384efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2384: eloquent mode
internal fun PlayerActivity.showV2384EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2384eloquent
    FeaturePrefsStore.batch2381.v2384eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2384: emotional mode
internal fun PlayerActivity.showV2384EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2384emotional
    FeaturePrefsStore.batch2381.v2384emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2384: empathetic level
internal fun PlayerActivity.showV2384EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2384: essential level
internal fun PlayerActivity.showV2384EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2384: evident level
internal fun PlayerActivity.showV2384EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2384: evolutionary level
internal fun PlayerActivity.showV2384EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2384: exceptional level
internal fun PlayerActivity.showV2384ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2384exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2384exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2384: exclusive mode
internal fun PlayerActivity.showV2384ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2384exclusive
    FeaturePrefsStore.batch2381.v2384exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2384: exotic mode
internal fun PlayerActivity.showV2384ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2384exotic
    FeaturePrefsStore.batch2381.v2384exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2384: experienced mode
internal fun PlayerActivity.showV2384ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2384experienced
    FeaturePrefsStore.batch2381.v2384experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2384: experimental mode
internal fun PlayerActivity.showV2384ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2384experimental
    FeaturePrefsStore.batch2381.v2384experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2384: explicit mode
internal fun PlayerActivity.showV2384ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2384explicit
    FeaturePrefsStore.batch2381.v2384explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2385: dominant mode
internal fun PlayerActivity.showV2385DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2385dominant
    FeaturePrefsStore.batch2381.v2385dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2385: dramatic mode
internal fun PlayerActivity.showV2385DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2385dramatic
    FeaturePrefsStore.batch2381.v2385dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2385: efficient mode
internal fun PlayerActivity.showV2385EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2385efficient
    FeaturePrefsStore.batch2381.v2385efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2385: eloquent mode
internal fun PlayerActivity.showV2385EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2385eloquent
    FeaturePrefsStore.batch2381.v2385eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2385: emotional mode
internal fun PlayerActivity.showV2385EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2385emotional
    FeaturePrefsStore.batch2381.v2385emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2385: empathetic level
internal fun PlayerActivity.showV2385EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2385: essential level
internal fun PlayerActivity.showV2385EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2385: evident level
internal fun PlayerActivity.showV2385EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2385: evolutionary level
internal fun PlayerActivity.showV2385EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2385: exceptional level
internal fun PlayerActivity.showV2385ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2385exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2385exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2385: exclusive mode
internal fun PlayerActivity.showV2385ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2385exclusive
    FeaturePrefsStore.batch2381.v2385exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2385: exotic mode
internal fun PlayerActivity.showV2385ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2385exotic
    FeaturePrefsStore.batch2381.v2385exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2385: experienced mode
internal fun PlayerActivity.showV2385ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2385experienced
    FeaturePrefsStore.batch2381.v2385experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2385: experimental mode
internal fun PlayerActivity.showV2385ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2385experimental
    FeaturePrefsStore.batch2381.v2385experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2385: explicit mode
internal fun PlayerActivity.showV2385ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2385explicit
    FeaturePrefsStore.batch2381.v2385explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2386: dominant mode
internal fun PlayerActivity.showV2386DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2386dominant
    FeaturePrefsStore.batch2381.v2386dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2386: dramatic mode
internal fun PlayerActivity.showV2386DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2386dramatic
    FeaturePrefsStore.batch2381.v2386dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2386: efficient mode
internal fun PlayerActivity.showV2386EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2386efficient
    FeaturePrefsStore.batch2381.v2386efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2386: eloquent mode
internal fun PlayerActivity.showV2386EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2386eloquent
    FeaturePrefsStore.batch2381.v2386eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2386: emotional mode
internal fun PlayerActivity.showV2386EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2386emotional
    FeaturePrefsStore.batch2381.v2386emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2386: empathetic level
internal fun PlayerActivity.showV2386EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2386: essential level
internal fun PlayerActivity.showV2386EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2386: evident level
internal fun PlayerActivity.showV2386EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2386: evolutionary level
internal fun PlayerActivity.showV2386EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2386: exceptional level
internal fun PlayerActivity.showV2386ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2386exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2386exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2386: exclusive mode
internal fun PlayerActivity.showV2386ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2386exclusive
    FeaturePrefsStore.batch2381.v2386exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2386: exotic mode
internal fun PlayerActivity.showV2386ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2386exotic
    FeaturePrefsStore.batch2381.v2386exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2386: experienced mode
internal fun PlayerActivity.showV2386ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2386experienced
    FeaturePrefsStore.batch2381.v2386experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2386: experimental mode
internal fun PlayerActivity.showV2386ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2386experimental
    FeaturePrefsStore.batch2381.v2386experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2386: explicit mode
internal fun PlayerActivity.showV2386ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2386explicit
    FeaturePrefsStore.batch2381.v2386explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2387: dominant mode
internal fun PlayerActivity.showV2387DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2387dominant
    FeaturePrefsStore.batch2381.v2387dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2387: dramatic mode
internal fun PlayerActivity.showV2387DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2387dramatic
    FeaturePrefsStore.batch2381.v2387dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2387: efficient mode
internal fun PlayerActivity.showV2387EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2387efficient
    FeaturePrefsStore.batch2381.v2387efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2387: eloquent mode
internal fun PlayerActivity.showV2387EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2387eloquent
    FeaturePrefsStore.batch2381.v2387eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2387: emotional mode
internal fun PlayerActivity.showV2387EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2387emotional
    FeaturePrefsStore.batch2381.v2387emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2387: empathetic level
internal fun PlayerActivity.showV2387EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2387: essential level
internal fun PlayerActivity.showV2387EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2387: evident level
internal fun PlayerActivity.showV2387EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2387: evolutionary level
internal fun PlayerActivity.showV2387EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2387: exceptional level
internal fun PlayerActivity.showV2387ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2387exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2387exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2387: exclusive mode
internal fun PlayerActivity.showV2387ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2387exclusive
    FeaturePrefsStore.batch2381.v2387exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2387: exotic mode
internal fun PlayerActivity.showV2387ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2387exotic
    FeaturePrefsStore.batch2381.v2387exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2387: experienced mode
internal fun PlayerActivity.showV2387ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2387experienced
    FeaturePrefsStore.batch2381.v2387experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2387: experimental mode
internal fun PlayerActivity.showV2387ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2387experimental
    FeaturePrefsStore.batch2381.v2387experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2387: explicit mode
internal fun PlayerActivity.showV2387ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2387explicit
    FeaturePrefsStore.batch2381.v2387explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2388: dominant mode
internal fun PlayerActivity.showV2388DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2388dominant
    FeaturePrefsStore.batch2381.v2388dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2388: dramatic mode
internal fun PlayerActivity.showV2388DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2388dramatic
    FeaturePrefsStore.batch2381.v2388dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2388: efficient mode
internal fun PlayerActivity.showV2388EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2388efficient
    FeaturePrefsStore.batch2381.v2388efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2388: eloquent mode
internal fun PlayerActivity.showV2388EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2388eloquent
    FeaturePrefsStore.batch2381.v2388eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2388: emotional mode
internal fun PlayerActivity.showV2388EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2388emotional
    FeaturePrefsStore.batch2381.v2388emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2388: empathetic level
internal fun PlayerActivity.showV2388EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2388: essential level
internal fun PlayerActivity.showV2388EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2388: evident level
internal fun PlayerActivity.showV2388EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2388: evolutionary level
internal fun PlayerActivity.showV2388EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2388: exceptional level
internal fun PlayerActivity.showV2388ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2388exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2388exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2388: exclusive mode
internal fun PlayerActivity.showV2388ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2388exclusive
    FeaturePrefsStore.batch2381.v2388exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2388: exotic mode
internal fun PlayerActivity.showV2388ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2388exotic
    FeaturePrefsStore.batch2381.v2388exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2388: experienced mode
internal fun PlayerActivity.showV2388ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2388experienced
    FeaturePrefsStore.batch2381.v2388experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2388: experimental mode
internal fun PlayerActivity.showV2388ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2388experimental
    FeaturePrefsStore.batch2381.v2388experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2388: explicit mode
internal fun PlayerActivity.showV2388ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2388explicit
    FeaturePrefsStore.batch2381.v2388explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2389: dominant mode
internal fun PlayerActivity.showV2389DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2389dominant
    FeaturePrefsStore.batch2381.v2389dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2389: dramatic mode
internal fun PlayerActivity.showV2389DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2389dramatic
    FeaturePrefsStore.batch2381.v2389dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2389: efficient mode
internal fun PlayerActivity.showV2389EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2389efficient
    FeaturePrefsStore.batch2381.v2389efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2389: eloquent mode
internal fun PlayerActivity.showV2389EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2389eloquent
    FeaturePrefsStore.batch2381.v2389eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2389: emotional mode
internal fun PlayerActivity.showV2389EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2389emotional
    FeaturePrefsStore.batch2381.v2389emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2389: empathetic level
internal fun PlayerActivity.showV2389EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2389: essential level
internal fun PlayerActivity.showV2389EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2389: evident level
internal fun PlayerActivity.showV2389EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2389: evolutionary level
internal fun PlayerActivity.showV2389EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2389: exceptional level
internal fun PlayerActivity.showV2389ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2389exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2389exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2389: exclusive mode
internal fun PlayerActivity.showV2389ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2389exclusive
    FeaturePrefsStore.batch2381.v2389exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2389: exotic mode
internal fun PlayerActivity.showV2389ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2389exotic
    FeaturePrefsStore.batch2381.v2389exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2389: experienced mode
internal fun PlayerActivity.showV2389ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2389experienced
    FeaturePrefsStore.batch2381.v2389experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2389: experimental mode
internal fun PlayerActivity.showV2389ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2389experimental
    FeaturePrefsStore.batch2381.v2389experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2389: explicit mode
internal fun PlayerActivity.showV2389ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2389explicit
    FeaturePrefsStore.batch2381.v2389explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}

// v2390: dominant mode
internal fun PlayerActivity.showV2390DominantToggle() {
    val current = FeaturePrefsStore.batch2381.v2390dominant
    FeaturePrefsStore.batch2381.v2390dominant = !current
    AppToast.show(this, "dominant: ${if (!current) "ON" else "OFF"}")
}

// v2390: dramatic mode
internal fun PlayerActivity.showV2390DramaticToggle() {
    val current = FeaturePrefsStore.batch2381.v2390dramatic
    FeaturePrefsStore.batch2381.v2390dramatic = !current
    AppToast.show(this, "dramatic: ${if (!current) "ON" else "OFF"}")
}

// v2390: efficient mode
internal fun PlayerActivity.showV2390EfficientToggle() {
    val current = FeaturePrefsStore.batch2381.v2390efficient
    FeaturePrefsStore.batch2381.v2390efficient = !current
    AppToast.show(this, "efficient: ${if (!current) "ON" else "OFF"}")
}

// v2390: eloquent mode
internal fun PlayerActivity.showV2390EloquentToggle() {
    val current = FeaturePrefsStore.batch2381.v2390eloquent
    FeaturePrefsStore.batch2381.v2390eloquent = !current
    AppToast.show(this, "eloquent: ${if (!current) "ON" else "OFF"}")
}

// v2390: emotional mode
internal fun PlayerActivity.showV2390EmotionalToggle() {
    val current = FeaturePrefsStore.batch2381.v2390emotional
    FeaturePrefsStore.batch2381.v2390emotional = !current
    AppToast.show(this, "emotional: ${if (!current) "ON" else "OFF"}")
}

// v2390: empathetic level
internal fun PlayerActivity.showV2390EmpatheticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390empathetic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "empathetic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390empathetic = value
        AppToast.show(this, "empathetic: $value")
    }
}

// v2390: essential level
internal fun PlayerActivity.showV2390EssentialDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390essential).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "essential level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390essential = value
        AppToast.show(this, "essential: $value")
    }
}

// v2390: evident level
internal fun PlayerActivity.showV2390EvidentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390evident).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evident level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390evident = value
        AppToast.show(this, "evident: $value")
    }
}

// v2390: evolutionary level
internal fun PlayerActivity.showV2390EvolutionaryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390evolutionary).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "evolutionary level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390evolutionary = value
        AppToast.show(this, "evolutionary: $value")
    }
}

// v2390: exceptional level
internal fun PlayerActivity.showV2390ExceptionalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2381.v2390exceptional).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "exceptional level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2381.v2390exceptional = value
        AppToast.show(this, "exceptional: $value")
    }
}

// v2390: exclusive mode
internal fun PlayerActivity.showV2390ExclusiveToggle() {
    val current = FeaturePrefsStore.batch2381.v2390exclusive
    FeaturePrefsStore.batch2381.v2390exclusive = !current
    AppToast.show(this, "exclusive: ${if (!current) "ON" else "OFF"}")
}

// v2390: exotic mode
internal fun PlayerActivity.showV2390ExoticToggle() {
    val current = FeaturePrefsStore.batch2381.v2390exotic
    FeaturePrefsStore.batch2381.v2390exotic = !current
    AppToast.show(this, "exotic: ${if (!current) "ON" else "OFF"}")
}

// v2390: experienced mode
internal fun PlayerActivity.showV2390ExperiencedToggle() {
    val current = FeaturePrefsStore.batch2381.v2390experienced
    FeaturePrefsStore.batch2381.v2390experienced = !current
    AppToast.show(this, "experienced: ${if (!current) "ON" else "OFF"}")
}

// v2390: experimental mode
internal fun PlayerActivity.showV2390ExperimentalToggle() {
    val current = FeaturePrefsStore.batch2381.v2390experimental
    FeaturePrefsStore.batch2381.v2390experimental = !current
    AppToast.show(this, "experimental: ${if (!current) "ON" else "OFF"}")
}

// v2390: explicit mode
internal fun PlayerActivity.showV2390ExplicitToggle() {
    val current = FeaturePrefsStore.batch2381.v2390explicit
    FeaturePrefsStore.batch2381.v2390explicit = !current
    AppToast.show(this, "explicit: ${if (!current) "ON" else "OFF"}")
}
