package blbl.cat3399.feature.player

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

