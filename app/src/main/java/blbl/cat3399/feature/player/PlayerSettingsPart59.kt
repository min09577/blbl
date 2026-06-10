package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v781: demo mode
internal fun PlayerActivity.showV781DemoToggle() {
    val current = FeaturePrefsStore.batch781.v781demo
    FeaturePrefsStore.batch781.v781demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v781: deploy mode
internal fun PlayerActivity.showV781DeployToggle() {
    val current = FeaturePrefsStore.batch781.v781deploy
    FeaturePrefsStore.batch781.v781deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v781: depth mode
internal fun PlayerActivity.showV781DepthToggle() {
    val current = FeaturePrefsStore.batch781.v781depth
    FeaturePrefsStore.batch781.v781depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v781: derive mode
internal fun PlayerActivity.showV781DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v781derive
    FeaturePrefsStore.batch781.v781derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v781: describe mode
internal fun PlayerActivity.showV781DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v781describe
    FeaturePrefsStore.batch781.v781describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v781: design level
internal fun PlayerActivity.showV781DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v781design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v781design = value
        AppToast.show(this, "design: $value")
    }
}

// v781: desktop level
internal fun PlayerActivity.showV781DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v781desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v781desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v781: detect level
internal fun PlayerActivity.showV781DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v781detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v781detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v781: device level
internal fun PlayerActivity.showV781DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v781device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v781device = value
        AppToast.show(this, "device: $value")
    }
}

// v781: diagnostic level
internal fun PlayerActivity.showV781DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v781diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v781diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v781: diff mode
internal fun PlayerActivity.showV781DiffToggle() {
    val current = FeaturePrefsStore.batch781.v781diff
    FeaturePrefsStore.batch781.v781diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v781: digest mode
internal fun PlayerActivity.showV781DigestToggle() {
    val current = FeaturePrefsStore.batch781.v781digest
    FeaturePrefsStore.batch781.v781digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v781: digital mode
internal fun PlayerActivity.showV781DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v781digital
    FeaturePrefsStore.batch781.v781digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v781: direct mode
internal fun PlayerActivity.showV781DirectToggle() {
    val current = FeaturePrefsStore.batch781.v781direct
    FeaturePrefsStore.batch781.v781direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v781: dirty mode
internal fun PlayerActivity.showV781DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v781dirty
    FeaturePrefsStore.batch781.v781dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v782: demo mode
internal fun PlayerActivity.showV782DemoToggle() {
    val current = FeaturePrefsStore.batch781.v782demo
    FeaturePrefsStore.batch781.v782demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v782: deploy mode
internal fun PlayerActivity.showV782DeployToggle() {
    val current = FeaturePrefsStore.batch781.v782deploy
    FeaturePrefsStore.batch781.v782deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v782: depth mode
internal fun PlayerActivity.showV782DepthToggle() {
    val current = FeaturePrefsStore.batch781.v782depth
    FeaturePrefsStore.batch781.v782depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v782: derive mode
internal fun PlayerActivity.showV782DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v782derive
    FeaturePrefsStore.batch781.v782derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v782: describe mode
internal fun PlayerActivity.showV782DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v782describe
    FeaturePrefsStore.batch781.v782describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v782: design level
internal fun PlayerActivity.showV782DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v782design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v782design = value
        AppToast.show(this, "design: $value")
    }
}

// v782: desktop level
internal fun PlayerActivity.showV782DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v782desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v782desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v782: detect level
internal fun PlayerActivity.showV782DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v782detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v782detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v782: device level
internal fun PlayerActivity.showV782DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v782device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v782device = value
        AppToast.show(this, "device: $value")
    }
}

// v782: diagnostic level
internal fun PlayerActivity.showV782DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v782diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v782diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v782: diff mode
internal fun PlayerActivity.showV782DiffToggle() {
    val current = FeaturePrefsStore.batch781.v782diff
    FeaturePrefsStore.batch781.v782diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v782: digest mode
internal fun PlayerActivity.showV782DigestToggle() {
    val current = FeaturePrefsStore.batch781.v782digest
    FeaturePrefsStore.batch781.v782digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v782: digital mode
internal fun PlayerActivity.showV782DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v782digital
    FeaturePrefsStore.batch781.v782digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v782: direct mode
internal fun PlayerActivity.showV782DirectToggle() {
    val current = FeaturePrefsStore.batch781.v782direct
    FeaturePrefsStore.batch781.v782direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v782: dirty mode
internal fun PlayerActivity.showV782DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v782dirty
    FeaturePrefsStore.batch781.v782dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v783: demo mode
internal fun PlayerActivity.showV783DemoToggle() {
    val current = FeaturePrefsStore.batch781.v783demo
    FeaturePrefsStore.batch781.v783demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v783: deploy mode
internal fun PlayerActivity.showV783DeployToggle() {
    val current = FeaturePrefsStore.batch781.v783deploy
    FeaturePrefsStore.batch781.v783deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v783: depth mode
internal fun PlayerActivity.showV783DepthToggle() {
    val current = FeaturePrefsStore.batch781.v783depth
    FeaturePrefsStore.batch781.v783depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v783: derive mode
internal fun PlayerActivity.showV783DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v783derive
    FeaturePrefsStore.batch781.v783derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v783: describe mode
internal fun PlayerActivity.showV783DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v783describe
    FeaturePrefsStore.batch781.v783describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v783: design level
internal fun PlayerActivity.showV783DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v783design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v783design = value
        AppToast.show(this, "design: $value")
    }
}

// v783: desktop level
internal fun PlayerActivity.showV783DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v783desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v783desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v783: detect level
internal fun PlayerActivity.showV783DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v783detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v783detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v783: device level
internal fun PlayerActivity.showV783DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v783device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v783device = value
        AppToast.show(this, "device: $value")
    }
}

// v783: diagnostic level
internal fun PlayerActivity.showV783DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v783diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v783diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v783: diff mode
internal fun PlayerActivity.showV783DiffToggle() {
    val current = FeaturePrefsStore.batch781.v783diff
    FeaturePrefsStore.batch781.v783diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v783: digest mode
internal fun PlayerActivity.showV783DigestToggle() {
    val current = FeaturePrefsStore.batch781.v783digest
    FeaturePrefsStore.batch781.v783digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v783: digital mode
internal fun PlayerActivity.showV783DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v783digital
    FeaturePrefsStore.batch781.v783digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v783: direct mode
internal fun PlayerActivity.showV783DirectToggle() {
    val current = FeaturePrefsStore.batch781.v783direct
    FeaturePrefsStore.batch781.v783direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v783: dirty mode
internal fun PlayerActivity.showV783DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v783dirty
    FeaturePrefsStore.batch781.v783dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v784: demo mode
internal fun PlayerActivity.showV784DemoToggle() {
    val current = FeaturePrefsStore.batch781.v784demo
    FeaturePrefsStore.batch781.v784demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v784: deploy mode
internal fun PlayerActivity.showV784DeployToggle() {
    val current = FeaturePrefsStore.batch781.v784deploy
    FeaturePrefsStore.batch781.v784deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v784: depth mode
internal fun PlayerActivity.showV784DepthToggle() {
    val current = FeaturePrefsStore.batch781.v784depth
    FeaturePrefsStore.batch781.v784depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v784: derive mode
internal fun PlayerActivity.showV784DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v784derive
    FeaturePrefsStore.batch781.v784derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v784: describe mode
internal fun PlayerActivity.showV784DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v784describe
    FeaturePrefsStore.batch781.v784describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v784: design level
internal fun PlayerActivity.showV784DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v784design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v784design = value
        AppToast.show(this, "design: $value")
    }
}

// v784: desktop level
internal fun PlayerActivity.showV784DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v784desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v784desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v784: detect level
internal fun PlayerActivity.showV784DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v784detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v784detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v784: device level
internal fun PlayerActivity.showV784DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v784device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v784device = value
        AppToast.show(this, "device: $value")
    }
}

// v784: diagnostic level
internal fun PlayerActivity.showV784DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v784diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v784diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v784: diff mode
internal fun PlayerActivity.showV784DiffToggle() {
    val current = FeaturePrefsStore.batch781.v784diff
    FeaturePrefsStore.batch781.v784diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v784: digest mode
internal fun PlayerActivity.showV784DigestToggle() {
    val current = FeaturePrefsStore.batch781.v784digest
    FeaturePrefsStore.batch781.v784digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v784: digital mode
internal fun PlayerActivity.showV784DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v784digital
    FeaturePrefsStore.batch781.v784digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v784: direct mode
internal fun PlayerActivity.showV784DirectToggle() {
    val current = FeaturePrefsStore.batch781.v784direct
    FeaturePrefsStore.batch781.v784direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v784: dirty mode
internal fun PlayerActivity.showV784DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v784dirty
    FeaturePrefsStore.batch781.v784dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v785: demo mode
internal fun PlayerActivity.showV785DemoToggle() {
    val current = FeaturePrefsStore.batch781.v785demo
    FeaturePrefsStore.batch781.v785demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v785: deploy mode
internal fun PlayerActivity.showV785DeployToggle() {
    val current = FeaturePrefsStore.batch781.v785deploy
    FeaturePrefsStore.batch781.v785deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v785: depth mode
internal fun PlayerActivity.showV785DepthToggle() {
    val current = FeaturePrefsStore.batch781.v785depth
    FeaturePrefsStore.batch781.v785depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v785: derive mode
internal fun PlayerActivity.showV785DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v785derive
    FeaturePrefsStore.batch781.v785derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v785: describe mode
internal fun PlayerActivity.showV785DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v785describe
    FeaturePrefsStore.batch781.v785describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v785: design level
internal fun PlayerActivity.showV785DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v785design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v785design = value
        AppToast.show(this, "design: $value")
    }
}

// v785: desktop level
internal fun PlayerActivity.showV785DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v785desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v785desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v785: detect level
internal fun PlayerActivity.showV785DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v785detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v785detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v785: device level
internal fun PlayerActivity.showV785DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v785device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v785device = value
        AppToast.show(this, "device: $value")
    }
}

// v785: diagnostic level
internal fun PlayerActivity.showV785DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v785diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v785diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v785: diff mode
internal fun PlayerActivity.showV785DiffToggle() {
    val current = FeaturePrefsStore.batch781.v785diff
    FeaturePrefsStore.batch781.v785diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v785: digest mode
internal fun PlayerActivity.showV785DigestToggle() {
    val current = FeaturePrefsStore.batch781.v785digest
    FeaturePrefsStore.batch781.v785digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v785: digital mode
internal fun PlayerActivity.showV785DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v785digital
    FeaturePrefsStore.batch781.v785digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v785: direct mode
internal fun PlayerActivity.showV785DirectToggle() {
    val current = FeaturePrefsStore.batch781.v785direct
    FeaturePrefsStore.batch781.v785direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v785: dirty mode
internal fun PlayerActivity.showV785DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v785dirty
    FeaturePrefsStore.batch781.v785dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v786: demo mode
internal fun PlayerActivity.showV786DemoToggle() {
    val current = FeaturePrefsStore.batch781.v786demo
    FeaturePrefsStore.batch781.v786demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v786: deploy mode
internal fun PlayerActivity.showV786DeployToggle() {
    val current = FeaturePrefsStore.batch781.v786deploy
    FeaturePrefsStore.batch781.v786deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v786: depth mode
internal fun PlayerActivity.showV786DepthToggle() {
    val current = FeaturePrefsStore.batch781.v786depth
    FeaturePrefsStore.batch781.v786depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v786: derive mode
internal fun PlayerActivity.showV786DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v786derive
    FeaturePrefsStore.batch781.v786derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v786: describe mode
internal fun PlayerActivity.showV786DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v786describe
    FeaturePrefsStore.batch781.v786describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v786: design level
internal fun PlayerActivity.showV786DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v786design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v786design = value
        AppToast.show(this, "design: $value")
    }
}

// v786: desktop level
internal fun PlayerActivity.showV786DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v786desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v786desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v786: detect level
internal fun PlayerActivity.showV786DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v786detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v786detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v786: device level
internal fun PlayerActivity.showV786DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v786device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v786device = value
        AppToast.show(this, "device: $value")
    }
}

// v786: diagnostic level
internal fun PlayerActivity.showV786DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v786diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v786diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v786: diff mode
internal fun PlayerActivity.showV786DiffToggle() {
    val current = FeaturePrefsStore.batch781.v786diff
    FeaturePrefsStore.batch781.v786diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v786: digest mode
internal fun PlayerActivity.showV786DigestToggle() {
    val current = FeaturePrefsStore.batch781.v786digest
    FeaturePrefsStore.batch781.v786digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v786: digital mode
internal fun PlayerActivity.showV786DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v786digital
    FeaturePrefsStore.batch781.v786digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v786: direct mode
internal fun PlayerActivity.showV786DirectToggle() {
    val current = FeaturePrefsStore.batch781.v786direct
    FeaturePrefsStore.batch781.v786direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v786: dirty mode
internal fun PlayerActivity.showV786DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v786dirty
    FeaturePrefsStore.batch781.v786dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v787: demo mode
internal fun PlayerActivity.showV787DemoToggle() {
    val current = FeaturePrefsStore.batch781.v787demo
    FeaturePrefsStore.batch781.v787demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v787: deploy mode
internal fun PlayerActivity.showV787DeployToggle() {
    val current = FeaturePrefsStore.batch781.v787deploy
    FeaturePrefsStore.batch781.v787deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v787: depth mode
internal fun PlayerActivity.showV787DepthToggle() {
    val current = FeaturePrefsStore.batch781.v787depth
    FeaturePrefsStore.batch781.v787depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v787: derive mode
internal fun PlayerActivity.showV787DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v787derive
    FeaturePrefsStore.batch781.v787derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v787: describe mode
internal fun PlayerActivity.showV787DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v787describe
    FeaturePrefsStore.batch781.v787describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v787: design level
internal fun PlayerActivity.showV787DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v787design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v787design = value
        AppToast.show(this, "design: $value")
    }
}

// v787: desktop level
internal fun PlayerActivity.showV787DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v787desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v787desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v787: detect level
internal fun PlayerActivity.showV787DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v787detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v787detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v787: device level
internal fun PlayerActivity.showV787DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v787device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v787device = value
        AppToast.show(this, "device: $value")
    }
}

// v787: diagnostic level
internal fun PlayerActivity.showV787DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v787diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v787diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v787: diff mode
internal fun PlayerActivity.showV787DiffToggle() {
    val current = FeaturePrefsStore.batch781.v787diff
    FeaturePrefsStore.batch781.v787diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v787: digest mode
internal fun PlayerActivity.showV787DigestToggle() {
    val current = FeaturePrefsStore.batch781.v787digest
    FeaturePrefsStore.batch781.v787digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v787: digital mode
internal fun PlayerActivity.showV787DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v787digital
    FeaturePrefsStore.batch781.v787digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v787: direct mode
internal fun PlayerActivity.showV787DirectToggle() {
    val current = FeaturePrefsStore.batch781.v787direct
    FeaturePrefsStore.batch781.v787direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v787: dirty mode
internal fun PlayerActivity.showV787DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v787dirty
    FeaturePrefsStore.batch781.v787dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v788: demo mode
internal fun PlayerActivity.showV788DemoToggle() {
    val current = FeaturePrefsStore.batch781.v788demo
    FeaturePrefsStore.batch781.v788demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v788: deploy mode
internal fun PlayerActivity.showV788DeployToggle() {
    val current = FeaturePrefsStore.batch781.v788deploy
    FeaturePrefsStore.batch781.v788deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v788: depth mode
internal fun PlayerActivity.showV788DepthToggle() {
    val current = FeaturePrefsStore.batch781.v788depth
    FeaturePrefsStore.batch781.v788depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v788: derive mode
internal fun PlayerActivity.showV788DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v788derive
    FeaturePrefsStore.batch781.v788derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v788: describe mode
internal fun PlayerActivity.showV788DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v788describe
    FeaturePrefsStore.batch781.v788describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v788: design level
internal fun PlayerActivity.showV788DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v788design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v788design = value
        AppToast.show(this, "design: $value")
    }
}

// v788: desktop level
internal fun PlayerActivity.showV788DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v788desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v788desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v788: detect level
internal fun PlayerActivity.showV788DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v788detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v788detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v788: device level
internal fun PlayerActivity.showV788DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v788device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v788device = value
        AppToast.show(this, "device: $value")
    }
}

// v788: diagnostic level
internal fun PlayerActivity.showV788DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v788diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v788diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v788: diff mode
internal fun PlayerActivity.showV788DiffToggle() {
    val current = FeaturePrefsStore.batch781.v788diff
    FeaturePrefsStore.batch781.v788diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v788: digest mode
internal fun PlayerActivity.showV788DigestToggle() {
    val current = FeaturePrefsStore.batch781.v788digest
    FeaturePrefsStore.batch781.v788digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v788: digital mode
internal fun PlayerActivity.showV788DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v788digital
    FeaturePrefsStore.batch781.v788digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v788: direct mode
internal fun PlayerActivity.showV788DirectToggle() {
    val current = FeaturePrefsStore.batch781.v788direct
    FeaturePrefsStore.batch781.v788direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v788: dirty mode
internal fun PlayerActivity.showV788DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v788dirty
    FeaturePrefsStore.batch781.v788dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v789: demo mode
internal fun PlayerActivity.showV789DemoToggle() {
    val current = FeaturePrefsStore.batch781.v789demo
    FeaturePrefsStore.batch781.v789demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v789: deploy mode
internal fun PlayerActivity.showV789DeployToggle() {
    val current = FeaturePrefsStore.batch781.v789deploy
    FeaturePrefsStore.batch781.v789deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v789: depth mode
internal fun PlayerActivity.showV789DepthToggle() {
    val current = FeaturePrefsStore.batch781.v789depth
    FeaturePrefsStore.batch781.v789depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v789: derive mode
internal fun PlayerActivity.showV789DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v789derive
    FeaturePrefsStore.batch781.v789derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v789: describe mode
internal fun PlayerActivity.showV789DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v789describe
    FeaturePrefsStore.batch781.v789describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v789: design level
internal fun PlayerActivity.showV789DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v789design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v789design = value
        AppToast.show(this, "design: $value")
    }
}

// v789: desktop level
internal fun PlayerActivity.showV789DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v789desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v789desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v789: detect level
internal fun PlayerActivity.showV789DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v789detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v789detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v789: device level
internal fun PlayerActivity.showV789DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v789device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v789device = value
        AppToast.show(this, "device: $value")
    }
}

// v789: diagnostic level
internal fun PlayerActivity.showV789DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v789diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v789diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v789: diff mode
internal fun PlayerActivity.showV789DiffToggle() {
    val current = FeaturePrefsStore.batch781.v789diff
    FeaturePrefsStore.batch781.v789diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v789: digest mode
internal fun PlayerActivity.showV789DigestToggle() {
    val current = FeaturePrefsStore.batch781.v789digest
    FeaturePrefsStore.batch781.v789digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v789: digital mode
internal fun PlayerActivity.showV789DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v789digital
    FeaturePrefsStore.batch781.v789digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v789: direct mode
internal fun PlayerActivity.showV789DirectToggle() {
    val current = FeaturePrefsStore.batch781.v789direct
    FeaturePrefsStore.batch781.v789direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v789: dirty mode
internal fun PlayerActivity.showV789DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v789dirty
    FeaturePrefsStore.batch781.v789dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

// v790: demo mode
internal fun PlayerActivity.showV790DemoToggle() {
    val current = FeaturePrefsStore.batch781.v790demo
    FeaturePrefsStore.batch781.v790demo = !current
    AppToast.show(this, "demo: ${if (!current) "ON" else "OFF"}")
}

// v790: deploy mode
internal fun PlayerActivity.showV790DeployToggle() {
    val current = FeaturePrefsStore.batch781.v790deploy
    FeaturePrefsStore.batch781.v790deploy = !current
    AppToast.show(this, "deploy: ${if (!current) "ON" else "OFF"}")
}

// v790: depth mode
internal fun PlayerActivity.showV790DepthToggle() {
    val current = FeaturePrefsStore.batch781.v790depth
    FeaturePrefsStore.batch781.v790depth = !current
    AppToast.show(this, "depth: ${if (!current) "ON" else "OFF"}")
}

// v790: derive mode
internal fun PlayerActivity.showV790DeriveToggle() {
    val current = FeaturePrefsStore.batch781.v790derive
    FeaturePrefsStore.batch781.v790derive = !current
    AppToast.show(this, "derive: ${if (!current) "ON" else "OFF"}")
}

// v790: describe mode
internal fun PlayerActivity.showV790DescribeToggle() {
    val current = FeaturePrefsStore.batch781.v790describe
    FeaturePrefsStore.batch781.v790describe = !current
    AppToast.show(this, "describe: ${if (!current) "ON" else "OFF"}")
}

// v790: design level
internal fun PlayerActivity.showV790DesignDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v790design).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "design level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v790design = value
        AppToast.show(this, "design: $value")
    }
}

// v790: desktop level
internal fun PlayerActivity.showV790DesktopDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v790desktop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "desktop level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v790desktop = value
        AppToast.show(this, "desktop: $value")
    }
}

// v790: detect level
internal fun PlayerActivity.showV790DetectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v790detect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "detect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v790detect = value
        AppToast.show(this, "detect: $value")
    }
}

// v790: device level
internal fun PlayerActivity.showV790DeviceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v790device).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "device level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v790device = value
        AppToast.show(this, "device: $value")
    }
}

// v790: diagnostic level
internal fun PlayerActivity.showV790DiagnosticDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch781.v790diagnostic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "diagnostic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch781.v790diagnostic = value
        AppToast.show(this, "diagnostic: $value")
    }
}

// v790: diff mode
internal fun PlayerActivity.showV790DiffToggle() {
    val current = FeaturePrefsStore.batch781.v790diff
    FeaturePrefsStore.batch781.v790diff = !current
    AppToast.show(this, "diff: ${if (!current) "ON" else "OFF"}")
}

// v790: digest mode
internal fun PlayerActivity.showV790DigestToggle() {
    val current = FeaturePrefsStore.batch781.v790digest
    FeaturePrefsStore.batch781.v790digest = !current
    AppToast.show(this, "digest: ${if (!current) "ON" else "OFF"}")
}

// v790: digital mode
internal fun PlayerActivity.showV790DigitalToggle() {
    val current = FeaturePrefsStore.batch781.v790digital
    FeaturePrefsStore.batch781.v790digital = !current
    AppToast.show(this, "digital: ${if (!current) "ON" else "OFF"}")
}

// v790: direct mode
internal fun PlayerActivity.showV790DirectToggle() {
    val current = FeaturePrefsStore.batch781.v790direct
    FeaturePrefsStore.batch781.v790direct = !current
    AppToast.show(this, "direct: ${if (!current) "ON" else "OFF"}")
}

// v790: dirty mode
internal fun PlayerActivity.showV790DirtyToggle() {
    val current = FeaturePrefsStore.batch781.v790dirty
    FeaturePrefsStore.batch781.v790dirty = !current
    AppToast.show(this, "dirty: ${if (!current) "ON" else "OFF"}")
}

