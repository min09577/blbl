package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
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

// v89.14: Danmaku Scroll Speed Min
internal fun PlayerActivity.showV89DanmakuScrollSpeedMinDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v89DanmakuScrollSpeedMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89DanmakuScrollSpeedMin = value
        AppToast.show(this, "Danmaku Scroll Speed Min: $value")
    }
}

// v89.15: Subtitle Position Y Custom
internal fun PlayerActivity.showV89SubtitlePositionYCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v89SubtitlePositionYCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position Y Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v89SubtitlePositionYCustom = value
        AppToast.show(this, "Subtitle Position Y Custom: $value")
    }
}

// v90.1: Video Midtone Custom
internal fun PlayerActivity.showV90VideoMidtoneCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VideoMidtoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Midtone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VideoMidtoneCustom = value
        AppToast.show(this, "Video Midtone Custom: $value")
    }
}

// v90.2: Danmaku Scroll Speed Max
internal fun PlayerActivity.showV90DanmakuScrollSpeedMaxDialog() {
    val options = listOf(100, 125, 150, 175, 200)
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuScrollSpeedMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Speed Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90DanmakuScrollSpeedMax = value
        AppToast.show(this, "Danmaku Scroll Speed Max: $value")
    }
}

// v90.3: Subtitle Position X Custom
internal fun PlayerActivity.showV90SubtitlePositionXCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90SubtitlePositionXCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Position X Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90SubtitlePositionXCustom = value
        AppToast.show(this, "Subtitle Position X Custom: $value")
    }
}

// v90.4: Gesture Rotation Action
internal fun PlayerActivity.showV90GestureRotationActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90GestureRotationAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Rotation Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90GestureRotationAction = value
        AppToast.show(this, "Gesture Rotation Action: $value")
    }
}

// v90.5: Cast Video Codec Custom
internal fun PlayerActivity.showV90CastVideoCodecCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90CastVideoCodecCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Codec Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90CastVideoCodecCustom = value
        AppToast.show(this, "Cast Video Codec Custom: $value")
    }
}

// v90.6: Playlist Auto Skip Watched
internal fun PlayerActivity.showV90PlaylistAutoSkipWatchedToggle() {
    val enabled = !BiliClient.prefs.v90PlaylistAutoSkipWatched
    BiliClient.prefs.v90PlaylistAutoSkipWatched = enabled
    AppToast.show(this, "Playlist Auto Skip Watched: ${if (enabled) "ON" else "OFF"}")
}

// v90.7: Cache Background Cleanup
internal fun PlayerActivity.showV90CacheBackgroundCleanupToggle() {
    val enabled = !BiliClient.prefs.v90CacheBackgroundCleanup
    BiliClient.prefs.v90CacheBackgroundCleanup = enabled
    AppToast.show(this, "Cache Background Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v90.8: Progress Bar Estimated Time
internal fun PlayerActivity.showV90ProgressBarEstimatedTimeToggle() {
    val enabled = !BiliClient.prefs.v90ProgressBarEstimatedTime
    BiliClient.prefs.v90ProgressBarEstimatedTime = enabled
    AppToast.show(this, "Progress Bar Estimated Time: ${if (enabled) "ON" else "OFF"}")
}

// v90.9: Volume Spatial Width
internal fun PlayerActivity.showV90VolumeSpatialWidthDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VolumeSpatialWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume Spatial Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VolumeSpatialWidth = value
        AppToast.show(this, "Volume Spatial Width: $value")
    }
}

// v90.10: History Auto Sync Cloud
internal fun PlayerActivity.showV90HistoryAutoSyncCloudToggle() {
    val enabled = !BiliClient.prefs.v90HistoryAutoSyncCloud
    BiliClient.prefs.v90HistoryAutoSyncCloud = enabled
    AppToast.show(this, "History Auto Sync Cloud: ${if (enabled) "ON" else "OFF"}")
}

// v90.11: Playback Auto Next On Buffer
internal fun PlayerActivity.showV90PlaybackAutoNextOnBufferToggle() {
    val enabled = !BiliClient.prefs.v90PlaybackAutoNextOnBuffer
    BiliClient.prefs.v90PlaybackAutoNextOnBuffer = enabled
    AppToast.show(this, "Playback Auto Next On Buffer: ${if (enabled) "ON" else "OFF"}")
}

// v90.12: Screenshot Auto Delete Old
internal fun PlayerActivity.showV90ScreenshotAutoDeleteOldToggle() {
    val enabled = !BiliClient.prefs.v90ScreenshotAutoDeleteOld
    BiliClient.prefs.v90ScreenshotAutoDeleteOld = enabled
    AppToast.show(this, "Screenshot Auto Delete Old: ${if (enabled) "ON" else "OFF"}")
}

// v90.13: Video Highlight Custom
internal fun PlayerActivity.showV90VideoHighlightCustomDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v90VideoHighlightCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Highlight Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90VideoHighlightCustom = value
        AppToast.show(this, "Video Highlight Custom: $value")
    }
}

// v90.14: Danmaku Send Max Length
internal fun PlayerActivity.showV90DanmakuSendMaxLengthDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v90DanmakuSendMaxLength).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90DanmakuSendMaxLength = value
        AppToast.show(this, "Danmaku Send Max Length: $value")
    }
}

// v90.15: Subtitle Animation Delay Custom
internal fun PlayerActivity.showV90SubtitleAnimationDelayCustomDialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v90SubtitleAnimationDelayCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v90SubtitleAnimationDelayCustom = value
        AppToast.show(this, "Subtitle Animation Delay Custom: $value")
    }
}

// v91.1: Video Dithering Mode
internal fun PlayerActivity.showV91VideoDitheringModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91videoDitheringMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dithering Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91videoDitheringMode = value
        AppToast.show(this, "Video Dithering Mode: $value")
    }
}

// v91.2: Danmaku Font Shadow Toggle
internal fun PlayerActivity.showV91DanmakuFontShadowToggleToggle() {
    val enabled = !BiliClient.prefs.v91danmakuFontShadowToggle
    BiliClient.prefs.v91danmakuFontShadowToggle = enabled
    AppToast.show(this, "Danmaku Font Shadow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v91.3: Subtitle Fade In Out Custom
internal fun PlayerActivity.showV91SubtitleFadeInOutCustomDialog() {
    val options = listOf(0, 200, 400, 600, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v91subtitleFadeInOutCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Fade In Out Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91subtitleFadeInOutCustom = value
        AppToast.show(this, "Subtitle Fade In Out Custom: $value")
    }
}

// v91.4: Gesture Edge Dead Zone
internal fun PlayerActivity.showV91GestureEdgeDeadZoneDialog() {
    val options = listOf(5, 10, 15, 20, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v91gestureEdgeDeadZone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Edge Dead Zone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91gestureEdgeDeadZone = value
        AppToast.show(this, "Gesture Edge Dead Zone: $value")
    }
}

// v91.5: Cast Video Latency Mode
internal fun PlayerActivity.showV91CastVideoLatencyModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91castVideoLatencyMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Latency Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91castVideoLatencyMode = value
        AppToast.show(this, "Cast Video Latency Mode: $value")
    }
}

// v91.6: Playlist Auto Resume Last
internal fun PlayerActivity.showV91PlaylistAutoResumeLastToggle() {
    val enabled = !BiliClient.prefs.v91playlistAutoResumeLast
    BiliClient.prefs.v91playlistAutoResumeLast = enabled
    AppToast.show(this, "Playlist Auto Resume Last: ${if (enabled) "ON" else "OFF"}")
}

// v91.7: Cache Segment Size
internal fun PlayerActivity.showV91CacheSegmentSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v91cacheSegmentSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Segment Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91cacheSegmentSize = value
        AppToast.show(this, "Cache Segment Size: $value")
    }
}

// v91.8: Progress Bar Chapter Label
internal fun PlayerActivity.showV91ProgressBarChapterLabelToggle() {
    val enabled = !BiliClient.prefs.v91progressBarChapterLabel
    BiliClient.prefs.v91progressBarChapterLabel = enabled
    AppToast.show(this, "Progress Bar Chapter Label: ${if (enabled) "ON" else "OFF"}")
}

// v91.9: Volume Auto Ducking
internal fun PlayerActivity.showV91VolumeAutoDuckingToggle() {
    val enabled = !BiliClient.prefs.v91volumeAutoDucking
    BiliClient.prefs.v91volumeAutoDucking = enabled
    AppToast.show(this, "Volume Auto Ducking: ${if (enabled) "ON" else "OFF"}")
}

// v91.10: History Group By Series
internal fun PlayerActivity.showV91HistoryGroupBySeriesToggle() {
    val enabled = !BiliClient.prefs.v91historyGroupBySeries
    BiliClient.prefs.v91historyGroupBySeries = enabled
    AppToast.show(this, "History Group By Series: ${if (enabled) "ON" else "OFF"}")
}

// v91.11: Playback Auto Skip Next Countdown
internal fun PlayerActivity.showV91PlaybackAutoSkipNextCountdownDialog() {
    val options = listOf(3, 5, 10, 15, 30)
    val currentIndex = options.indexOf(BiliClient.prefs.v91playbackAutoSkipNextCountdown).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Auto Skip Next Countdown",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91playbackAutoSkipNextCountdown = value
        AppToast.show(this, "Playback Auto Skip Next Countdown: $value")
    }
}

// v91.12: Screenshot Region Capture
internal fun PlayerActivity.showV91ScreenshotRegionCaptureToggle() {
    val enabled = !BiliClient.prefs.v91screenshotRegionCapture
    BiliClient.prefs.v91screenshotRegionCapture = enabled
    AppToast.show(this, "Screenshot Region Capture: ${if (enabled) "ON" else "OFF"}")
}

// v91.13: Video Film Grain Custom
internal fun PlayerActivity.showV91VideoFilmGrainCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v91videoFilmGrainCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Film Grain Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91videoFilmGrainCustom = value
        AppToast.show(this, "Video Film Grain Custom: $value")
    }
}

// v91.14: Danmaku BG Corner Radius
internal fun PlayerActivity.showV91DanmakuBgCornerRadiusDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v91danmakuBgCornerRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Corner Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91danmakuBgCornerRadius = value
        AppToast.show(this, "Danmaku BG Corner Radius: $value")
    }
}

// v91.15: Subtitle BG Margin Bottom
internal fun PlayerActivity.showV91SubtitleBgMarginBottomDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v91subtitleBgMarginBottom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Margin Bottom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v91subtitleBgMarginBottom = value
        AppToast.show(this, "Subtitle BG Margin Bottom: $value")
    }
}

// v92.16: Video Vignette Custom
internal fun PlayerActivity.showV92VideoVignetteCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92videoVignetteCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Vignette Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92videoVignetteCustom = value
        AppToast.show(this, "Video Vignette Custom: $value")
    }
}

// v92.17: Danmaku Font Underline Toggle
internal fun PlayerActivity.showV92DanmakuFontUnderlineToggleToggle() {
    val enabled = !BiliClient.prefs.v92danmakuFontUnderlineToggle
    BiliClient.prefs.v92danmakuFontUnderlineToggle = enabled
    AppToast.show(this, "Danmaku Font Underline Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v92.18: Subtitle BG Padding Custom
internal fun PlayerActivity.showV92SubtitleBgPaddingCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v92subtitleBgPaddingCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Padding Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92subtitleBgPaddingCustom = value
        AppToast.show(this, "Subtitle BG Padding Custom: $value")
    }
}

// v92.19: Gesture Swipe Back Action
internal fun PlayerActivity.showV92GestureSwipeBackActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92gestureSwipeBackAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Back Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92gestureSwipeBackAction = value
        AppToast.show(this, "Gesture Swipe Back Action: $value")
    }
}

// v92.20: Cast Video Drop Frame
internal fun PlayerActivity.showV92CastVideoDropFrameToggle() {
    val enabled = !BiliClient.prefs.v92castVideoDropFrame
    BiliClient.prefs.v92castVideoDropFrame = enabled
    AppToast.show(this, "Cast Video Drop Frame: ${if (enabled) "ON" else "OFF"}")
}

// v92.21: Playlist Auto Skip Short
internal fun PlayerActivity.showV92PlaylistAutoSkipShortDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92playlistAutoSkipShort).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Skip Short",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92playlistAutoSkipShort = value
        AppToast.show(this, "Playlist Auto Skip Short: $value")
    }
}

// v92.22: Cache Download Policy
internal fun PlayerActivity.showV92CacheDownloadPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92cacheDownloadPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92cacheDownloadPolicy = value
        AppToast.show(this, "Cache Download Policy: $value")
    }
}

// v92.23: Progress Bar Thumb Shape
internal fun PlayerActivity.showV92ProgressBarThumbShapeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v92progressBarThumbShape).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Shape",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92progressBarThumbShape = value
        AppToast.show(this, "Progress Bar Thumb Shape: $value")
    }
}

// v92.24: Volume Auto Balance
internal fun PlayerActivity.showV92VolumeAutoBalanceToggle() {
    val enabled = !BiliClient.prefs.v92volumeAutoBalance
    BiliClient.prefs.v92volumeAutoBalance = enabled
    AppToast.show(this, "Volume Auto Balance: ${if (enabled) "ON" else "OFF"}")
}

// v92.25: History Auto Clean Expired
internal fun PlayerActivity.showV92HistoryAutoCleanExpiredToggle() {
    val enabled = !BiliClient.prefs.v92historyAutoCleanExpired
    BiliClient.prefs.v92historyAutoCleanExpired = enabled
    AppToast.show(this, "History Auto Clean Expired: ${if (enabled) "ON" else "OFF"}")
}

// v92.26: Playback Auto Skip Same Title
internal fun PlayerActivity.showV92PlaybackAutoSkipSameTitleToggle() {
    val enabled = !BiliClient.prefs.v92playbackAutoSkipSameTitle
    BiliClient.prefs.v92playbackAutoSkipSameTitle = enabled
    AppToast.show(this, "Playback Auto Skip Same Title: ${if (enabled) "ON" else "OFF"}")
}

// v92.27: Screenshot Auto Delete Days
internal fun PlayerActivity.showV92ScreenshotAutoDeleteDaysDialog() {
    val options = listOf(7, 14, 30, 60, 90)
    val currentIndex = options.indexOf(BiliClient.prefs.v92screenshotAutoDeleteDays).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Delete Days",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92screenshotAutoDeleteDays = value
        AppToast.show(this, "Screenshot Auto Delete Days: $value")
    }
}

// v92.28: Video Color Fringe Custom
internal fun PlayerActivity.showV92VideoColorFringeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92videoColorFringeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Color Fringe Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92videoColorFringeCustom = value
        AppToast.show(this, "Video Color Fringe Custom: $value")
    }
}

// v92.29: Danmaku BG Opacity Custom
internal fun PlayerActivity.showV92DanmakuBgOpacityCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v92danmakuBgOpacityCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku BG Opacity Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92danmakuBgOpacityCustom = value
        AppToast.show(this, "Danmaku BG Opacity Custom: $value")
    }
}

// v92.30: Subtitle BG Margin Top
internal fun PlayerActivity.showV92SubtitleBgMarginTopDialog() {
    val options = listOf(0, 5, 10, 15, 20)
    val currentIndex = options.indexOf(BiliClient.prefs.v92subtitleBgMarginTop).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Margin Top",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v92subtitleBgMarginTop = value
        AppToast.show(this, "Subtitle BG Margin Top: $value")
    }
}

// v93.31: Video Scanline Effect
internal fun PlayerActivity.showV93VideoScanlineEffectToggle() {
    val enabled = !BiliClient.prefs.v93videoScanlineEffect
    BiliClient.prefs.v93videoScanlineEffect = enabled
    AppToast.show(this, "Video Scanline Effect: ${if (enabled) "ON" else "OFF"}")
}

// v93.32: Danmaku Send Max Length Custom
internal fun PlayerActivity.showV93DanmakuSendMaxLengthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93danmakuSendMaxLengthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Send Max Length Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93danmakuSendMaxLengthCustom = value
        AppToast.show(this, "Danmaku Send Max Length Custom: $value")
    }
}

// v93.33: Subtitle BG Border Color Custom
internal fun PlayerActivity.showV93SubtitleBgBorderColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93subtitleBgBorderColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93subtitleBgBorderColorCustom = value
        AppToast.show(this, "Subtitle BG Border Color Custom: $value")
    }
}

// v93.34: Gesture Swipe Forward Action
internal fun PlayerActivity.showV93GestureSwipeForwardActionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93gestureSwipeForwardAction).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Forward Action",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93gestureSwipeForwardAction = value
        AppToast.show(this, "Gesture Swipe Forward Action: $value")
    }
}

// v93.35: Cast Audio Dynamic Range
internal fun PlayerActivity.showV93CastAudioDynamicRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93castAudioDynamicRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Dynamic Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93castAudioDynamicRange = value
        AppToast.show(this, "Cast Audio Dynamic Range: $value")
    }
}

// v93.36: Playlist Auto Skip Long
internal fun PlayerActivity.showV93PlaylistAutoSkipLongDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93playlistAutoSkipLong).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playlist Auto Skip Long",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93playlistAutoSkipLong = value
        AppToast.show(this, "Playlist Auto Skip Long: $value")
    }
}

// v93.37: Cache Network Policy
internal fun PlayerActivity.showV93CacheNetworkPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93cacheNetworkPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Network Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93cacheNetworkPolicy = value
        AppToast.show(this, "Cache Network Policy: $value")
    }
}

// v93.38: Progress Bar Buffer Color Custom
internal fun PlayerActivity.showV93ProgressBarBufferColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93progressBarBufferColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Buffer Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93progressBarBufferColorCustom = value
        AppToast.show(this, "Progress Bar Buffer Color Custom: $value")
    }
}

// v93.39: Volume Auto Gain Control
internal fun PlayerActivity.showV93VolumeAutoGainControlToggle() {
    val enabled = !BiliClient.prefs.v93volumeAutoGainControl
    BiliClient.prefs.v93volumeAutoGainControl = enabled
    AppToast.show(this, "Volume Auto Gain Control: ${if (enabled) "ON" else "OFF"}")
}

// v93.40: History Auto Sync Device
internal fun PlayerActivity.showV93HistoryAutoSyncDeviceToggle() {
    val enabled = !BiliClient.prefs.v93historyAutoSyncDevice
    BiliClient.prefs.v93historyAutoSyncDevice = enabled
    AppToast.show(this, "History Auto Sync Device: ${if (enabled) "ON" else "OFF"}")
}

// v93.41: Playback Auto Skip Recap93
internal fun PlayerActivity.showV93PlaybackAutoSkipRecap93Toggle() {
    val enabled = !BiliClient.prefs.v93playbackAutoSkipRecap93
    BiliClient.prefs.v93playbackAutoSkipRecap93 = enabled
    AppToast.show(this, "Playback Auto Skip Recap93: ${if (enabled) "ON" else "OFF"}")
}

// v93.42: Screenshot Naming Template
internal fun PlayerActivity.showV93ScreenshotNamingTemplateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93screenshotNamingTemplate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Naming Template",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93screenshotNamingTemplate = value
        AppToast.show(this, "Screenshot Naming Template: $value")
    }
}

// v93.43: Video CRT Filter Custom
internal fun PlayerActivity.showV93VideoCRTFilterCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v93videoCRTFilterCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video CRT Filter Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93videoCRTFilterCustom = value
        AppToast.show(this, "Video CRT Filter Custom: $value")
    }
}

// v93.44: Danmaku Send Confirm Toggle
internal fun PlayerActivity.showV93DanmakuSendConfirmToggleToggle() {
    val enabled = !BiliClient.prefs.v93danmakuSendConfirmToggle
    BiliClient.prefs.v93danmakuSendConfirmToggle = enabled
    AppToast.show(this, "Danmaku Send Confirm Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v93.45: Subtitle BG Border Width Custom
internal fun PlayerActivity.showV93SubtitleBgBorderWidthCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v93subtitleBgBorderWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v93subtitleBgBorderWidthCustom = value
        AppToast.show(this, "Subtitle BG Border Width Custom: $value")
    }
}

// v94.46: Video Pixel Art Mode
internal fun PlayerActivity.showV94VideoPixelArtModeToggle() {
    val enabled = !BiliClient.prefs.v94videoPixelArtMode
    BiliClient.prefs.v94videoPixelArtMode = enabled
    AppToast.show(this, "Video Pixel Art Mode: ${if (enabled) "ON" else "OFF"}")
}

// v94.47: Danmaku Font Monospace Toggle
internal fun PlayerActivity.showV94DanmakuFontMonospaceToggleToggle() {
    val enabled = !BiliClient.prefs.v94danmakuFontMonospaceToggle
    BiliClient.prefs.v94danmakuFontMonospaceToggle = enabled
    AppToast.show(this, "Danmaku Font Monospace Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v94.48: Subtitle BG Border Radius Custom
internal fun PlayerActivity.showV94SubtitleBgBorderRadiusCustomDialog() {
    val options = listOf(0, 2, 4, 6, 8)
    val currentIndex = options.indexOf(BiliClient.prefs.v94subtitleBgBorderRadiusCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Border Radius Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94subtitleBgBorderRadiusCustom = value
        AppToast.show(this, "Subtitle BG Border Radius Custom: $value")
    }
}

// v94.49: Gesture Long Press Timeout
internal fun PlayerActivity.showV94GestureLongPressTimeoutDialog() {
    val options = listOf(300, 400, 500, 700, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v94gestureLongPressTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Long Press Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94gestureLongPressTimeout = value
        AppToast.show(this, "Gesture Long Press Timeout: $value")
    }
}

// v94.50: Cast Video Buffer Size
internal fun PlayerActivity.showV94CastVideoBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v94castVideoBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94castVideoBufferSize = value
        AppToast.show(this, "Cast Video Buffer Size: $value")
    }
}

// v94.51: Playlist Auto Group By Up
internal fun PlayerActivity.showV94PlaylistAutoGroupByUpToggle() {
    val enabled = !BiliClient.prefs.v94playlistAutoGroupByUp
    BiliClient.prefs.v94playlistAutoGroupByUp = enabled
    AppToast.show(this, "Playlist Auto Group By Up: ${if (enabled) "ON" else "OFF"}")
}

// v94.52: Cache Smart Cleanup
internal fun PlayerActivity.showV94CacheSmartCleanupToggle() {
    val enabled = !BiliClient.prefs.v94cacheSmartCleanup
    BiliClient.prefs.v94cacheSmartCleanup = enabled
    AppToast.show(this, "Cache Smart Cleanup: ${if (enabled) "ON" else "OFF"}")
}

// v94.53: Progress Bar Live Indicator
internal fun PlayerActivity.showV94ProgressBarLiveIndicatorToggle() {
    val enabled = !BiliClient.prefs.v94progressBarLiveIndicator
    BiliClient.prefs.v94progressBarLiveIndicator = enabled
    AppToast.show(this, "Progress Bar Live Indicator: ${if (enabled) "ON" else "OFF"}")
}

// v94.54: Volume Auto Pan
internal fun PlayerActivity.showV94VolumeAutoPanToggle() {
    val enabled = !BiliClient.prefs.v94volumeAutoPan
    BiliClient.prefs.v94volumeAutoPan = enabled
    AppToast.show(this, "Volume Auto Pan: ${if (enabled) "ON" else "OFF"}")
}

// v94.55: History Export Auto
internal fun PlayerActivity.showV94HistoryExportAutoToggle() {
    val enabled = !BiliClient.prefs.v94historyExportAuto
    BiliClient.prefs.v94historyExportAuto = enabled
    AppToast.show(this, "History Export Auto: ${if (enabled) "ON" else "OFF"}")
}

// v94.56: Playback Auto Skip Title
internal fun PlayerActivity.showV94PlaybackAutoSkipTitleToggle() {
    val enabled = !BiliClient.prefs.v94playbackAutoSkipTitle
    BiliClient.prefs.v94playbackAutoSkipTitle = enabled
    AppToast.show(this, "Playback Auto Skip Title: ${if (enabled) "ON" else "OFF"}")
}

// v94.57: Screenshot Auto Copy Path
internal fun PlayerActivity.showV94ScreenshotAutoCopyPathToggle() {
    val enabled = !BiliClient.prefs.v94screenshotAutoCopyPath
    BiliClient.prefs.v94screenshotAutoCopyPath = enabled
    AppToast.show(this, "Screenshot Auto Copy Path: ${if (enabled) "ON" else "OFF"}")
}

// v94.58: Video Ascii Art Mode
internal fun PlayerActivity.showV94VideoAsciiArtModeToggle() {
    val enabled = !BiliClient.prefs.v94videoAsciiArtMode
    BiliClient.prefs.v94videoAsciiArtMode = enabled
    AppToast.show(this, "Video Ascii Art Mode: ${if (enabled) "ON" else "OFF"}")
}

// v94.59: Danmaku Font Size Step
internal fun PlayerActivity.showV94DanmakuFontSizeStepDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v94danmakuFontSizeStep).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Step",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94danmakuFontSizeStep = value
        AppToast.show(this, "Danmaku Font Size Step: $value")
    }
}

// v94.60: Subtitle Animation Fade Time
internal fun PlayerActivity.showV94SubtitleAnimationFadeTimeDialog() {
    val options = listOf(100, 200, 300, 500, 800)
    val currentIndex = options.indexOf(BiliClient.prefs.v94subtitleAnimationFadeTime).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Fade Time",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v94subtitleAnimationFadeTime = value
        AppToast.show(this, "Subtitle Animation Fade Time: $value")
    }
}

// v95.61: Video Glitch Effect Custom
internal fun PlayerActivity.showV95VideoGlitchEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95videoGlitchEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Glitch Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95videoGlitchEffectCustom = value
        AppToast.show(this, "Video Glitch Effect Custom: $value")
    }
}

// v95.62: Danmaku Scroll Easing
internal fun PlayerActivity.showV95DanmakuScrollEasingDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95danmakuScrollEasing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Easing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95danmakuScrollEasing = value
        AppToast.show(this, "Danmaku Scroll Easing: $value")
    }
}

// v95.63: Subtitle BG Gradient Angle
internal fun PlayerActivity.showV95SubtitleBgGradientAngleDialog() {
    val options = listOf(0, 90, 180, 270)
    val currentIndex = options.indexOf(BiliClient.prefs.v95subtitleBgGradientAngle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Angle",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95subtitleBgGradientAngle = value
        AppToast.show(this, "Subtitle BG Gradient Angle: $value")
    }
}

// v95.64: Gesture Double Tap Timeout
internal fun PlayerActivity.showV95GestureDoubleTapTimeoutDialog() {
    val options = listOf(200, 250, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v95gestureDoubleTapTimeout).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Double Tap Timeout",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95gestureDoubleTapTimeout = value
        AppToast.show(this, "Gesture Double Tap Timeout: $value")
    }
}

// v95.65: Cast Audio Buffer Size
internal fun PlayerActivity.showV95CastAudioBufferSizeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95castAudioBufferSize).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Audio Buffer Size",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95castAudioBufferSize = value
        AppToast.show(this, "Cast Audio Buffer Size: $value")
    }
}

// v95.66: Playlist Auto Group By Date
internal fun PlayerActivity.showV95PlaylistAutoGroupByDateToggle() {
    val enabled = !BiliClient.prefs.v95playlistAutoGroupByDate
    BiliClient.prefs.v95playlistAutoGroupByDate = enabled
    AppToast.show(this, "Playlist Auto Group By Date: ${if (enabled) "ON" else "OFF"}")
}

// v95.67: Cache Storage Limit
internal fun PlayerActivity.showV95CacheStorageLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95cacheStorageLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Storage Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95cacheStorageLimit = value
        AppToast.show(this, "Cache Storage Limit: $value")
    }
}

// v95.68: Progress Bar Chapter Color
internal fun PlayerActivity.showV95ProgressBarChapterColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v95progressBarChapterColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Chapter Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95progressBarChapterColor = value
        AppToast.show(this, "Progress Bar Chapter Color: $value")
    }
}

// v95.69: Volume Auto Crossfade
internal fun PlayerActivity.showV95VolumeAutoCrossfadeToggle() {
    val enabled = !BiliClient.prefs.v95volumeAutoCrossfade
    BiliClient.prefs.v95volumeAutoCrossfade = enabled
    AppToast.show(this, "Volume Auto Crossfade: ${if (enabled) "ON" else "OFF"}")
}

// v95.70: History Import Auto
internal fun PlayerActivity.showV95HistoryImportAutoToggle() {
    val enabled = !BiliClient.prefs.v95historyImportAuto
    BiliClient.prefs.v95historyImportAuto = enabled
    AppToast.show(this, "History Import Auto: ${if (enabled) "ON" else "OFF"}")
}

// v95.71: Playback Auto Skip Ending95
internal fun PlayerActivity.showV95PlaybackAutoSkipEnding95Toggle() {
    val enabled = !BiliClient.prefs.v95playbackAutoSkipEnding95
    BiliClient.prefs.v95playbackAutoSkipEnding95 = enabled
    AppToast.show(this, "Playback Auto Skip Ending95: ${if (enabled) "ON" else "OFF"}")
}

// v95.72: Screenshot Auto Open After
internal fun PlayerActivity.showV95ScreenshotAutoOpenAfterToggle() {
    val enabled = !BiliClient.prefs.v95screenshotAutoOpenAfter
    BiliClient.prefs.v95screenshotAutoOpenAfter = enabled
    AppToast.show(this, "Screenshot Auto Open After: ${if (enabled) "ON" else "OFF"}")
}

// v95.73: Video VHS Effect Custom
internal fun PlayerActivity.showV95VideoVHSEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95videoVHSEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video VHS Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95videoVHSEffectCustom = value
        AppToast.show(this, "Video VHS Effect Custom: $value")
    }
}

// v95.74: Danmaku Scroll Acceleration
internal fun PlayerActivity.showV95DanmakuScrollAccelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95danmakuScrollAcceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Acceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95danmakuScrollAcceleration = value
        AppToast.show(this, "Danmaku Scroll Acceleration: $value")
    }
}

// v95.75: Subtitle BG Gradient Opacity
internal fun PlayerActivity.showV95SubtitleBgGradientOpacityDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v95subtitleBgGradientOpacity).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Opacity",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v95subtitleBgGradientOpacity = value
        AppToast.show(this, "Subtitle BG Gradient Opacity: $value")
    }
}

// v96.76: Video Neon Glow Custom
internal fun PlayerActivity.showV96VideoNeonGlowCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96videoNeonGlowCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Neon Glow Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96videoNeonGlowCustom = value
        AppToast.show(this, "Video Neon Glow Custom: $value")
    }
}

// v96.77: Danmaku Font Letter Spacing
internal fun PlayerActivity.showV96DanmakuFontLetterSpacingDialog() {
    val options = listOf(-2, -1, 0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v96danmakuFontLetterSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Letter Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96danmakuFontLetterSpacing = value
        AppToast.show(this, "Danmaku Font Letter Spacing: $value")
    }
}

// v96.78: Subtitle BG Gradient Type
internal fun PlayerActivity.showV96SubtitleBgGradientTypeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96subtitleBgGradientType).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Type",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96subtitleBgGradientType = value
        AppToast.show(this, "Subtitle BG Gradient Type: $value")
    }
}

// v96.79: Gesture Swipe Min Distance
internal fun PlayerActivity.showV96GestureSwipeMinDistanceDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96gestureSwipeMinDistance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Min Distance",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96gestureSwipeMinDistance = value
        AppToast.show(this, "Gesture Swipe Min Distance: $value")
    }
}

// v96.80: Cast Video Decode Threads
internal fun PlayerActivity.showV96CastVideoDecodeThreadsDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96castVideoDecodeThreads).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video Decode Threads",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96castVideoDecodeThreads = value
        AppToast.show(this, "Cast Video Decode Threads: $value")
    }
}

// v96.81: Playlist Auto Group By Type
internal fun PlayerActivity.showV96PlaylistAutoGroupByTypeToggle() {
    val enabled = !BiliClient.prefs.v96playlistAutoGroupByType
    BiliClient.prefs.v96playlistAutoGroupByType = enabled
    AppToast.show(this, "Playlist Auto Group By Type: ${if (enabled) "ON" else "OFF"}")
}

// v96.82: Cache Cleanup Interval
internal fun PlayerActivity.showV96CacheCleanupIntervalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96cacheCleanupInterval).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Cleanup Interval",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96cacheCleanupInterval = value
        AppToast.show(this, "Cache Cleanup Interval: $value")
    }
}

// v96.83: Progress Bar Thumb Shadow
internal fun PlayerActivity.showV96ProgressBarThumbShadowToggle() {
    val enabled = !BiliClient.prefs.v96progressBarThumbShadow
    BiliClient.prefs.v96progressBarThumbShadow = enabled
    AppToast.show(this, "Progress Bar Thumb Shadow: ${if (enabled) "ON" else "OFF"}")
}

// v96.84: Volume Auto Replay Gain
internal fun PlayerActivity.showV96VolumeAutoReplayGainToggle() {
    val enabled = !BiliClient.prefs.v96volumeAutoReplayGain
    BiliClient.prefs.v96volumeAutoReplayGain = enabled
    AppToast.show(this, "Volume Auto Replay Gain: ${if (enabled) "ON" else "OFF"}")
}

// v96.85: History Auto Clean Max Days
internal fun PlayerActivity.showV96HistoryAutoCleanMaxDaysDialog() {
    val options = listOf(30, 60, 90, 180, 365)
    val currentIndex = options.indexOf(BiliClient.prefs.v96historyAutoCleanMaxDays).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Clean Max Days",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96historyAutoCleanMaxDays = value
        AppToast.show(this, "History Auto Clean Max Days: $value")
    }
}

// v96.86: Playback Auto Skip Credits
internal fun PlayerActivity.showV96PlaybackAutoSkipCreditsToggle() {
    val enabled = !BiliClient.prefs.v96playbackAutoSkipCredits
    BiliClient.prefs.v96playbackAutoSkipCredits = enabled
    AppToast.show(this, "Playback Auto Skip Credits: ${if (enabled) "ON" else "OFF"}")
}

// v96.87: Screenshot Auto Share Target
internal fun PlayerActivity.showV96ScreenshotAutoShareTargetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96screenshotAutoShareTarget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Share Target",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96screenshotAutoShareTarget = value
        AppToast.show(this, "Screenshot Auto Share Target: $value")
    }
}

// v96.88: Video Dreamy Effect Custom
internal fun PlayerActivity.showV96VideoDreamyEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96videoDreamyEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Dreamy Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96videoDreamyEffectCustom = value
        AppToast.show(this, "Video Dreamy Effect Custom: $value")
    }
}

// v96.89: Danmaku Scroll Deceleration
internal fun PlayerActivity.showV96DanmakuScrollDecelerationDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v96danmakuScrollDeceleration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Scroll Deceleration",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96danmakuScrollDeceleration = value
        AppToast.show(this, "Danmaku Scroll Deceleration: $value")
    }
}

// v96.90: Subtitle BG Gradient Start
internal fun PlayerActivity.showV96SubtitleBgGradientStartDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v96subtitleBgGradientStart).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient Start",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v96subtitleBgGradientStart = value
        AppToast.show(this, "Subtitle BG Gradient Start: $value")
    }
}

// v97.91: Video Sepia Custom
internal fun PlayerActivity.showV97VideoSepiaCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v97videoSepiaCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Sepia Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97videoSepiaCustom = value
        AppToast.show(this, "Video Sepia Custom: $value")
    }
}

// v97.92: Danmaku Font Weight Range
internal fun PlayerActivity.showV97DanmakuFontWeightRangeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97danmakuFontWeightRange).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight Range",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97danmakuFontWeightRange = value
        AppToast.show(this, "Danmaku Font Weight Range: $value")
    }
}

// v97.93: Subtitle BG Gradient End
internal fun PlayerActivity.showV97SubtitleBgGradientEndDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97subtitleBgGradientEnd).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle BG Gradient End",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97subtitleBgGradientEnd = value
        AppToast.show(this, "Subtitle BG Gradient End: $value")
    }
}

// v97.94: Gesture Swipe Angle Threshold
internal fun PlayerActivity.showV97GestureSwipeAngleThresholdDialog() {
    val options = listOf(15, 20, 30, 45, 60)
    val currentIndex = options.indexOf(BiliClient.prefs.v97gestureSwipeAngleThreshold).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Swipe Angle Threshold",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97gestureSwipeAngleThreshold = value
        AppToast.show(this, "Gesture Swipe Angle Threshold: $value")
    }
}

// v97.95: Cast Video Post Processing
internal fun PlayerActivity.showV97CastVideoPostProcessingToggle() {
    val enabled = !BiliClient.prefs.v97castVideoPostProcessing
    BiliClient.prefs.v97castVideoPostProcessing = enabled
    AppToast.show(this, "Cast Video Post Processing: ${if (enabled) "ON" else "OFF"}")
}

// v97.96: Playlist Auto Group By Season
internal fun PlayerActivity.showV97PlaylistAutoGroupBySeasonToggle() {
    val enabled = !BiliClient.prefs.v97playlistAutoGroupBySeason
    BiliClient.prefs.v97playlistAutoGroupBySeason = enabled
    AppToast.show(this, "Playlist Auto Group By Season: ${if (enabled) "ON" else "OFF"}")
}

// v97.97: Cache Preload Policy
internal fun PlayerActivity.showV97CachePreloadPolicyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97cachePreloadPolicy).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Preload Policy",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97cachePreloadPolicy = value
        AppToast.show(this, "Cache Preload Policy: $value")
    }
}

// v97.98: Progress Bar Thumb Glow
internal fun PlayerActivity.showV97ProgressBarThumbGlowToggle() {
    val enabled = !BiliClient.prefs.v97progressBarThumbGlow
    BiliClient.prefs.v97progressBarThumbGlow = enabled
    AppToast.show(this, "Progress Bar Thumb Glow: ${if (enabled) "ON" else "OFF"}")
}

// v97.99: Volume Auto Peak Limit
internal fun PlayerActivity.showV97VolumeAutoPeakLimitToggle() {
    val enabled = !BiliClient.prefs.v97volumeAutoPeakLimit
    BiliClient.prefs.v97volumeAutoPeakLimit = enabled
    AppToast.show(this, "Volume Auto Peak Limit: ${if (enabled) "ON" else "OFF"}")
}

// v97.100: History Auto Clean Min Items
internal fun PlayerActivity.showV97HistoryAutoCleanMinItemsDialog() {
    val options = listOf(50, 100, 200, 500, 1000)
    val currentIndex = options.indexOf(BiliClient.prefs.v97historyAutoCleanMinItems).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "History Auto Clean Min Items",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97historyAutoCleanMinItems = value
        AppToast.show(this, "History Auto Clean Min Items: $value")
    }
}

// v97.101: Playback Auto Skip Recap97
internal fun PlayerActivity.showV97PlaybackAutoSkipRecap97Toggle() {
    val enabled = !BiliClient.prefs.v97playbackAutoSkipRecap97
    BiliClient.prefs.v97playbackAutoSkipRecap97 = enabled
    AppToast.show(this, "Playback Auto Skip Recap97: ${if (enabled) "ON" else "OFF"}")
}

// v97.102: Screenshot Auto Annotate Text
internal fun PlayerActivity.showV97ScreenshotAutoAnnotateTextToggle() {
    val enabled = !BiliClient.prefs.v97screenshotAutoAnnotateText
    BiliClient.prefs.v97screenshotAutoAnnotateText = enabled
    AppToast.show(this, "Screenshot Auto Annotate Text: ${if (enabled) "ON" else "OFF"}")
}

// v97.103: Video Polaroid Custom
internal fun PlayerActivity.showV97VideoPolaroidCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v97videoPolaroidCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Polaroid Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97videoPolaroidCustom = value
        AppToast.show(this, "Video Polaroid Custom: $value")
    }
}

// v97.104: Danmaku Font Size Min
internal fun PlayerActivity.showV97DanmakuFontSizeMinDialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v97danmakuFontSizeMin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Min",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97danmakuFontSizeMin = value
        AppToast.show(this, "Danmaku Font Size Min: $value")
    }
}

// v97.105: Subtitle Animation Type97
internal fun PlayerActivity.showV97SubtitleAnimationType97Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v97subtitleAnimationType97).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type97",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v97subtitleAnimationType97 = value
        AppToast.show(this, "Subtitle Animation Type97: $value")
    }
}

// v98.106: Video Negative Custom
internal fun PlayerActivity.showV98VideoNegativeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v98videoNegativeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Negative Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98videoNegativeCustom = value
        AppToast.show(this, "Video Negative Custom: $value")
    }
}

// v98.107: Danmaku Font Size Max
internal fun PlayerActivity.showV98DanmakuFontSizeMaxDialog() {
    val options = listOf(24, 32, 40, 48, 64)
    val currentIndex = options.indexOf(BiliClient.prefs.v98danmakuFontSizeMax).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Size Max",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98danmakuFontSizeMax = value
        AppToast.show(this, "Danmaku Font Size Max: $value")
    }
}

// v98.108: Subtitle Animation Speed98
internal fun PlayerActivity.showV98SubtitleAnimationSpeed98Dialog() {
    val options = listOf(50, 75, 100, 125, 150)
    val currentIndex = options.indexOf(BiliClient.prefs.v98subtitleAnimationSpeed98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Speed98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98subtitleAnimationSpeed98 = value
        AppToast.show(this, "Subtitle Animation Speed98: $value")
    }
}

// v98.109: Gesture Pinch Min Scale
internal fun PlayerActivity.showV98GesturePinchMinScaleDialog() {
    val options = listOf(25, 30, 50, 70, 80)
    val currentIndex = options.indexOf(BiliClient.prefs.v98gesturePinchMinScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Min Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98gesturePinchMinScale = value
        AppToast.show(this, "Gesture Pinch Min Scale: $value")
    }
}

// v98.110: Cast Audio Post Processing
internal fun PlayerActivity.showV98CastAudioPostProcessingToggle() {
    val enabled = !BiliClient.prefs.v98castAudioPostProcessing
    BiliClient.prefs.v98castAudioPostProcessing = enabled
    AppToast.show(this, "Cast Audio Post Processing: ${if (enabled) "ON" else "OFF"}")
}

// v98.111: Playlist Auto Group By Genre
internal fun PlayerActivity.showV98PlaylistAutoGroupByGenreToggle() {
    val enabled = !BiliClient.prefs.v98playlistAutoGroupByGenre
    BiliClient.prefs.v98playlistAutoGroupByGenre = enabled
    AppToast.show(this, "Playlist Auto Group By Genre: ${if (enabled) "ON" else "OFF"}")
}

// v98.112: Cache Download On Wifi
internal fun PlayerActivity.showV98CacheDownloadOnWifiToggle() {
    val enabled = !BiliClient.prefs.v98cacheDownloadOnWifi
    BiliClient.prefs.v98cacheDownloadOnWifi = enabled
    AppToast.show(this, "Cache Download On Wifi: ${if (enabled) "ON" else "OFF"}")
}

// v98.113: Progress Bar Thumb Border
internal fun PlayerActivity.showV98ProgressBarThumbBorderToggle() {
    val enabled = !BiliClient.prefs.v98progressBarThumbBorder
    BiliClient.prefs.v98progressBarThumbBorder = enabled
    AppToast.show(this, "Progress Bar Thumb Border: ${if (enabled) "ON" else "OFF"}")
}

// v98.114: Volume Auto RMS Level
internal fun PlayerActivity.showV98VolumeAutoRMSLevelToggle() {
    val enabled = !BiliClient.prefs.v98volumeAutoRMSLevel
    BiliClient.prefs.v98volumeAutoRMSLevel = enabled
    AppToast.show(this, "Volume Auto RMS Level: ${if (enabled) "ON" else "OFF"}")
}

// v98.115: History Auto Clean On Start
internal fun PlayerActivity.showV98HistoryAutoCleanOnStartToggle() {
    val enabled = !BiliClient.prefs.v98historyAutoCleanOnStart
    BiliClient.prefs.v98historyAutoCleanOnStart = enabled
    AppToast.show(this, "History Auto Clean On Start: ${if (enabled) "ON" else "OFF"}")
}

// v98.116: Playback Auto Skip Filler98
internal fun PlayerActivity.showV98PlaybackAutoSkipFiller98Toggle() {
    val enabled = !BiliClient.prefs.v98playbackAutoSkipFiller98
    BiliClient.prefs.v98playbackAutoSkipFiller98 = enabled
    AppToast.show(this, "Playback Auto Skip Filler98: ${if (enabled) "ON" else "OFF"}")
}

// v98.117: Screenshot Auto Upload Cloud
internal fun PlayerActivity.showV98ScreenshotAutoUploadCloudToggle() {
    val enabled = !BiliClient.prefs.v98screenshotAutoUploadCloud
    BiliClient.prefs.v98screenshotAutoUploadCloud = enabled
    AppToast.show(this, "Screenshot Auto Upload Cloud: ${if (enabled) "ON" else "OFF"}")
}

// v98.118: Video Monochrome Custom
internal fun PlayerActivity.showV98VideoMonochromeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v98videoMonochromeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Monochrome Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98videoMonochromeCustom = value
        AppToast.show(this, "Video Monochrome Custom: $value")
    }
}

// v98.119: Danmaku Font Style Custom98
internal fun PlayerActivity.showV98DanmakuFontStyleCustom98Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v98danmakuFontStyleCustom98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Style Custom98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98danmakuFontStyleCustom98 = value
        AppToast.show(this, "Danmaku Font Style Custom98: $value")
    }
}

// v98.120: Subtitle Animation Easing98
internal fun PlayerActivity.showV98SubtitleAnimationEasing98Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v98subtitleAnimationEasing98).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Easing98",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v98subtitleAnimationEasing98 = value
        AppToast.show(this, "Subtitle Animation Easing98: $value")
    }
}

// v99.121: Video Posterize Custom
internal fun PlayerActivity.showV99VideoPosterizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v99videoPosterizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Posterize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99videoPosterizeCustom = value
        AppToast.show(this, "Video Posterize Custom: $value")
    }
}

// v99.122: Danmaku Font Outline Toggle
internal fun PlayerActivity.showV99DanmakuFontOutlineToggleToggle() {
    val enabled = !BiliClient.prefs.v99danmakuFontOutlineToggle
    BiliClient.prefs.v99danmakuFontOutlineToggle = enabled
    AppToast.show(this, "Danmaku Font Outline Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v99.123: Subtitle Animation Duration99
internal fun PlayerActivity.showV99SubtitleAnimationDuration99Dialog() {
    val options = listOf(100, 200, 300, 400, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v99subtitleAnimationDuration99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Duration99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99subtitleAnimationDuration99 = value
        AppToast.show(this, "Subtitle Animation Duration99: $value")
    }
}

// v99.124: Gesture Pinch Max Scale
internal fun PlayerActivity.showV99GesturePinchMaxScaleDialog() {
    val options = listOf(150, 200, 250, 300, 400)
    val currentIndex = options.indexOf(BiliClient.prefs.v99gesturePinchMaxScale).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Max Scale",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99gesturePinchMaxScale = value
        AppToast.show(this, "Gesture Pinch Max Scale: $value")
    }
}

// v99.125: Cast Video Auto Quality
internal fun PlayerActivity.showV99CastVideoAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v99castVideoAutoQuality
    BiliClient.prefs.v99castVideoAutoQuality = enabled
    AppToast.show(this, "Cast Video Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

// v99.126: Playlist Auto Group By Channel
internal fun PlayerActivity.showV99PlaylistAutoGroupByChannelToggle() {
    val enabled = !BiliClient.prefs.v99playlistAutoGroupByChannel
    BiliClient.prefs.v99playlistAutoGroupByChannel = enabled
    AppToast.show(this, "Playlist Auto Group By Channel: ${if (enabled) "ON" else "OFF"}")
}

// v99.127: Cache Download Speed Limit
internal fun PlayerActivity.showV99CacheDownloadSpeedLimitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v99cacheDownloadSpeedLimit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Speed Limit",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99cacheDownloadSpeedLimit = value
        AppToast.show(this, "Cache Download Speed Limit: $value")
    }
}

// v99.128: Progress Bar Thumb Size99
internal fun PlayerActivity.showV99ProgressBarThumbSize99Dialog() {
    val options = listOf(8, 10, 12, 14, 16)
    val currentIndex = options.indexOf(BiliClient.prefs.v99progressBarThumbSize99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Size99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99progressBarThumbSize99 = value
        AppToast.show(this, "Progress Bar Thumb Size99: $value")
    }
}

// v99.129: Volume Auto Loudness99
internal fun PlayerActivity.showV99VolumeAutoLoudness99Toggle() {
    val enabled = !BiliClient.prefs.v99volumeAutoLoudness99
    BiliClient.prefs.v99volumeAutoLoudness99 = enabled
    AppToast.show(this, "Volume Auto Loudness99: ${if (enabled) "ON" else "OFF"}")
}

// v99.130: History Auto Clean On Exit
internal fun PlayerActivity.showV99HistoryAutoCleanOnExitToggle() {
    val enabled = !BiliClient.prefs.v99historyAutoCleanOnExit
    BiliClient.prefs.v99historyAutoCleanOnExit = enabled
    AppToast.show(this, "History Auto Clean On Exit: ${if (enabled) "ON" else "OFF"}")
}

// v99.131: Playback Auto Skip Intro99
internal fun PlayerActivity.showV99PlaybackAutoSkipIntro99Toggle() {
    val enabled = !BiliClient.prefs.v99playbackAutoSkipIntro99
    BiliClient.prefs.v99playbackAutoSkipIntro99 = enabled
    AppToast.show(this, "Playback Auto Skip Intro99: ${if (enabled) "ON" else "OFF"}")
}

// v99.132: Screenshot Auto Share99
internal fun PlayerActivity.showV99ScreenshotAutoShare99Toggle() {
    val enabled = !BiliClient.prefs.v99screenshotAutoShare99
    BiliClient.prefs.v99screenshotAutoShare99 = enabled
    AppToast.show(this, "Screenshot Auto Share99: ${if (enabled) "ON" else "OFF"}")
}

// v99.133: Video Solarize Custom
internal fun PlayerActivity.showV99VideoSolarizeCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v99videoSolarizeCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Solarize Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99videoSolarizeCustom = value
        AppToast.show(this, "Video Solarize Custom: $value")
    }
}

// v99.134: Danmaku Font Color Custom
internal fun PlayerActivity.showV99DanmakuFontColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v99danmakuFontColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v99danmakuFontColorCustom = value
        AppToast.show(this, "Danmaku Font Color Custom: $value")
    }
}

// v99.135: Subtitle Animation Loop99
internal fun PlayerActivity.showV99SubtitleAnimationLoop99Toggle() {
    val enabled = !BiliClient.prefs.v99subtitleAnimationLoop99
    BiliClient.prefs.v99subtitleAnimationLoop99 = enabled
    AppToast.show(this, "Subtitle Animation Loop99: ${if (enabled) "ON" else "OFF"}")
}

// v100.136: Video Duotone Custom
internal fun PlayerActivity.showV100VideoDuotoneCustomDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v100videoDuotoneCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Duotone Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100videoDuotoneCustom = value
        AppToast.show(this, "Video Duotone Custom: $value")
    }
}

// v100.137: Danmaku Font BG Toggle
internal fun PlayerActivity.showV100DanmakuFontBgToggleToggle() {
    val enabled = !BiliClient.prefs.v100danmakuFontBgToggle
    BiliClient.prefs.v100danmakuFontBgToggle = enabled
    AppToast.show(this, "Danmaku Font BG Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v100.138: Subtitle Animation Delay99
internal fun PlayerActivity.showV100SubtitleAnimationDelay99Dialog() {
    val options = listOf(0, 100, 200, 300, 500)
    val currentIndex = options.indexOf(BiliClient.prefs.v100subtitleAnimationDelay99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Delay99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100subtitleAnimationDelay99 = value
        AppToast.show(this, "Subtitle Animation Delay99: $value")
    }
}

// v100.139: Gesture Pinch Speed99
internal fun PlayerActivity.showV100GesturePinchSpeed99Dialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v100gesturePinchSpeed99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Gesture Pinch Speed99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100gesturePinchSpeed99 = value
        AppToast.show(this, "Gesture Pinch Speed99: $value")
    }
}

// v100.140: Cast Audio Auto Quality
internal fun PlayerActivity.showV100CastAudioAutoQualityToggle() {
    val enabled = !BiliClient.prefs.v100castAudioAutoQuality
    BiliClient.prefs.v100castAudioAutoQuality = enabled
    AppToast.show(this, "Cast Audio Auto Quality: ${if (enabled) "ON" else "OFF"}")
}

// v100.141: Playlist Auto Group All
internal fun PlayerActivity.showV100PlaylistAutoGroupAllToggle() {
    val enabled = !BiliClient.prefs.v100playlistAutoGroupAll
    BiliClient.prefs.v100playlistAutoGroupAll = enabled
    AppToast.show(this, "Playlist Auto Group All: ${if (enabled) "ON" else "OFF"}")
}

// v100.142: Cache Download Retry
internal fun PlayerActivity.showV100CacheDownloadRetryDialog() {
    val options = listOf(1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v100cacheDownloadRetry).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cache Download Retry",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100cacheDownloadRetry = value
        AppToast.show(this, "Cache Download Retry: $value")
    }
}

// v100.143: Progress Bar Thumb Color99
internal fun PlayerActivity.showV100ProgressBarThumbColor99Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v100progressBarThumbColor99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Progress Bar Thumb Color99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100progressBarThumbColor99 = value
        AppToast.show(this, "Progress Bar Thumb Color99: $value")
    }
}

// v100.144: Volume Auto Normalize99
internal fun PlayerActivity.showV100VolumeAutoNormalize99Toggle() {
    val enabled = !BiliClient.prefs.v100volumeAutoNormalize99
    BiliClient.prefs.v100volumeAutoNormalize99 = enabled
    AppToast.show(this, "Volume Auto Normalize99: ${if (enabled) "ON" else "OFF"}")
}

// v100.145: History Auto Sync99
internal fun PlayerActivity.showV100HistoryAutoSync99Toggle() {
    val enabled = !BiliClient.prefs.v100historyAutoSync99
    BiliClient.prefs.v100historyAutoSync99 = enabled
    AppToast.show(this, "History Auto Sync99: ${if (enabled) "ON" else "OFF"}")
}

// v100.146: Playback Auto Skip Outro99
internal fun PlayerActivity.showV100PlaybackAutoSkipOutro99Toggle() {
    val enabled = !BiliClient.prefs.v100playbackAutoSkipOutro99
    BiliClient.prefs.v100playbackAutoSkipOutro99 = enabled
    AppToast.show(this, "Playback Auto Skip Outro99: ${if (enabled) "ON" else "OFF"}")
}

// v100.147: Screenshot Auto Format99
internal fun PlayerActivity.showV100ScreenshotAutoFormat99Dialog() {
    val options = listOf(0, 1, 2)
    val currentIndex = options.indexOf(BiliClient.prefs.v100screenshotAutoFormat99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Screenshot Auto Format99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100screenshotAutoFormat99 = value
        AppToast.show(this, "Screenshot Auto Format99: $value")
    }
}

// v100.148: Video Tint Duotone
internal fun PlayerActivity.showV100VideoTintDuotoneDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v100videoTintDuotone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Tint Duotone",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100videoTintDuotone = value
        AppToast.show(this, "Video Tint Duotone: $value")
    }
}

// v100.149: Danmaku Font Weight99
internal fun PlayerActivity.showV100DanmakuFontWeight99Dialog() {
    val options = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900)
    val currentIndex = options.indexOf(BiliClient.prefs.v100danmakuFontWeight99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Weight99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100danmakuFontWeight99 = value
        AppToast.show(this, "Danmaku Font Weight99: $value")
    }
}

// v100.150: Subtitle Animation Type99
internal fun PlayerActivity.showV100SubtitleAnimationType99Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v100subtitleAnimationType99).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Animation Type99",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v100subtitleAnimationType99 = value
        AppToast.show(this, "Subtitle Animation Type99: $value")
    }
}

// v101.1: Audio Spatial Width Custom
internal fun PlayerActivity.showV101AudioSpatialWidthCustomDialog() {
    val options = listOf(25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v101audioSpatialWidthCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Spatial Width Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101audioSpatialWidthCustom = value
        AppToast.show(this, "Audio Spatial Width Custom: $value")
    }
}

// v101.2: Danmaku Font Stretch Toggle
internal fun PlayerActivity.showV101DanmakuFontStretchToggleToggle() {
    val enabled = !BiliClient.prefs.v101danmakuFontStretchToggle
    BiliClient.prefs.v101danmakuFontStretchToggle = enabled
    AppToast.show(this, "Danmaku Font Stretch Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v101.3: Subtitle Shadow Color Custom
internal fun PlayerActivity.showV101SubtitleShadowColorCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101subtitleShadowColorCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Shadow Color Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101subtitleShadowColorCustom = value
        AppToast.show(this, "Subtitle Shadow Color Custom: $value")
    }
}

// v101.4: Gesture Swipe Lock Horizontal
internal fun PlayerActivity.showV101GestureSwipeLockHorizontalToggle() {
    val enabled = !BiliClient.prefs.v101gestureSwipeLockHorizontal
    BiliClient.prefs.v101gestureSwipeLockHorizontal = enabled
    AppToast.show(this, "Gesture Swipe Lock Horizontal: ${if (enabled) "ON" else "OFF"}")
}

// v101.5: Cast Video HDR Mode
internal fun PlayerActivity.showV101CastVideoHDRModeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101castVideoHDRMode).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video HDR Mode",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101castVideoHDRMode = value
        AppToast.show(this, "Cast Video HDR Mode: $value")
    }
}

// v101.6: Playlist Auto Remove Watched
internal fun PlayerActivity.showV101PlaylistAutoRemoveWatchedToggle() {
    val enabled = !BiliClient.prefs.v101playlistAutoRemoveWatched
    BiliClient.prefs.v101playlistAutoRemoveWatched = enabled
    AppToast.show(this, "Playlist Auto Remove Watched: ${if (enabled) "ON" else "OFF"}")
}

// v101.7: Cache Encrypt Toggle
internal fun PlayerActivity.showV101CacheEncryptToggleToggle() {
    val enabled = !BiliClient.prefs.v101cacheEncryptToggle
    BiliClient.prefs.v101cacheEncryptToggle = enabled
    AppToast.show(this, "Cache Encrypt Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v101.8: Progress Bar Chapter Snap
internal fun PlayerActivity.showV101ProgressBarChapterSnapToggle() {
    val enabled = !BiliClient.prefs.v101progressBarChapterSnap
    BiliClient.prefs.v101progressBarChapterSnap = enabled
    AppToast.show(this, "Progress Bar Chapter Snap: ${if (enabled) "ON" else "OFF"}")
}

// v101.9: Volume EQ Preset Custom
internal fun PlayerActivity.showV101VolumeEQPresetCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v101volumeEQPresetCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume EQ Preset Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101volumeEQPresetCustom = value
        AppToast.show(this, "Volume EQ Preset Custom: $value")
    }
}

// v101.10: History Search Highlight
internal fun PlayerActivity.showV101HistorySearchHighlightToggle() {
    val enabled = !BiliClient.prefs.v101historySearchHighlight
    BiliClient.prefs.v101historySearchHighlight = enabled
    AppToast.show(this, "History Search Highlight: ${if (enabled) "ON" else "OFF"}")
}

// v101.11: Playback Loop Segment AB
internal fun PlayerActivity.showV101PlaybackLoopSegmentABToggle() {
    val enabled = !BiliClient.prefs.v101playbackLoopSegmentAB
    BiliClient.prefs.v101playbackLoopSegmentAB = enabled
    AppToast.show(this, "Playback Loop Segment AB: ${if (enabled) "ON" else "OFF"}")
}

// v101.12: Screenshot Auto Crop
internal fun PlayerActivity.showV101ScreenshotAutoCropToggle() {
    val enabled = !BiliClient.prefs.v101screenshotAutoCrop
    BiliClient.prefs.v101screenshotAutoCrop = enabled
    AppToast.show(this, "Screenshot Auto Crop: ${if (enabled) "ON" else "OFF"}")
}

// v101.13: Video Edge Enhance Custom
internal fun PlayerActivity.showV101VideoEdgeEnhanceCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v101videoEdgeEnhanceCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Edge Enhance Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101videoEdgeEnhanceCustom = value
        AppToast.show(this, "Video Edge Enhance Custom: $value")
    }
}

// v101.14: Danmaku Font Glow Toggle
internal fun PlayerActivity.showV101DanmakuFontGlowToggleToggle() {
    val enabled = !BiliClient.prefs.v101danmakuFontGlowToggle
    BiliClient.prefs.v101danmakuFontGlowToggle = enabled
    AppToast.show(this, "Danmaku Font Glow Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v101.15: Subtitle Line Spacing
internal fun PlayerActivity.showV101SubtitleLineSpacingDialog() {
    val options = listOf(80, 100, 120, 140, 160)
    val currentIndex = options.indexOf(BiliClient.prefs.v101subtitleLineSpacing).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Line Spacing",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v101subtitleLineSpacing = value
        AppToast.show(this, "Subtitle Line Spacing: $value")
    }
}

// v102.16: Audio Bass Boost Custom
internal fun PlayerActivity.showV102AudioBassBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v102audioBassBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Bass Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102audioBassBoostCustom = value
        AppToast.show(this, "Audio Bass Boost Custom: $value")
    }
}

// v102.17: Danmaku Font Stroke Width
internal fun PlayerActivity.showV102DanmakuFontStrokeWidthDialog() {
    val options = listOf(0, 1, 2, 3, 4)
    val currentIndex = options.indexOf(BiliClient.prefs.v102danmakuFontStrokeWidth).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Stroke Width",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102danmakuFontStrokeWidth = value
        AppToast.show(this, "Danmaku Font Stroke Width: $value")
    }
}

// v102.18: Subtitle Text Alignment
internal fun PlayerActivity.showV102SubtitleTextAlignmentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102subtitleTextAlignment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Text Alignment",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102subtitleTextAlignment = value
        AppToast.show(this, "Subtitle Text Alignment: $value")
    }
}

// v102.19: Gesture Swipe Lock Vertical
internal fun PlayerActivity.showV102GestureSwipeLockVerticalToggle() {
    val enabled = !BiliClient.prefs.v102gestureSwipeLockVertical
    BiliClient.prefs.v102gestureSwipeLockVertical = enabled
    AppToast.show(this, "Gesture Swipe Lock Vertical: ${if (enabled) "ON" else "OFF"}")
}

// v102.20: Cast Video AV Sync
internal fun PlayerActivity.showV102CastVideoAVSyncDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102castVideoAVSync).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Cast Video AV Sync",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102castVideoAVSync = value
        AppToast.show(this, "Cast Video AV Sync: $value")
    }
}

// v102.21: Playlist Auto Reverse Order
internal fun PlayerActivity.showV102PlaylistAutoReverseOrderToggle() {
    val enabled = !BiliClient.prefs.v102playlistAutoReverseOrder
    BiliClient.prefs.v102playlistAutoReverseOrder = enabled
    AppToast.show(this, "Playlist Auto Reverse Order: ${if (enabled) "ON" else "OFF"}")
}

// v102.22: Cache Auto Clear On Full
internal fun PlayerActivity.showV102CacheAutoClearOnFullToggle() {
    val enabled = !BiliClient.prefs.v102cacheAutoClearOnFull
    BiliClient.prefs.v102cacheAutoClearOnFull = enabled
    AppToast.show(this, "Cache Auto Clear On Full: ${if (enabled) "ON" else "OFF"}")
}

// v102.23: Progress Bar Buffer Show
internal fun PlayerActivity.showV102ProgressBarBufferShowToggle() {
    val enabled = !BiliClient.prefs.v102progressBarBufferShow
    BiliClient.prefs.v102progressBarBufferShow = enabled
    AppToast.show(this, "Progress Bar Buffer Show: ${if (enabled) "ON" else "OFF"}")
}

// v102.24: Volume EQ Gain Preamp
internal fun PlayerActivity.showV102VolumeEQGainPreampDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102volumeEQGainPreamp).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Volume EQ Gain Preamp",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102volumeEQGainPreamp = value
        AppToast.show(this, "Volume EQ Gain Preamp: $value")
    }
}

// v102.25: History Pin Record Toggle
internal fun PlayerActivity.showV102HistoryPinRecordToggleToggle() {
    val enabled = !BiliClient.prefs.v102historyPinRecordToggle
    BiliClient.prefs.v102historyPinRecordToggle = enabled
    AppToast.show(this, "History Pin Record Toggle: ${if (enabled) "ON" else "OFF"}")
}

// v102.26: Playback Loop Segment Count
internal fun PlayerActivity.showV102PlaybackLoopSegmentCountDialog() {
    val options = listOf(1, 2, 3, 5, 10)
    val currentIndex = options.indexOf(BiliClient.prefs.v102playbackLoopSegmentCount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Playback Loop Segment Count",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102playbackLoopSegmentCount = value
        AppToast.show(this, "Playback Loop Segment Count: $value")
    }
}

// v102.27: Screenshot Auto Rotate
internal fun PlayerActivity.showV102ScreenshotAutoRotateToggle() {
    val enabled = !BiliClient.prefs.v102screenshotAutoRotate
    BiliClient.prefs.v102screenshotAutoRotate = enabled
    AppToast.show(this, "Screenshot Auto Rotate: ${if (enabled) "ON" else "OFF"}")
}

// v102.28: Video Mosaic Effect Custom
internal fun PlayerActivity.showV102VideoMosaicEffectCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v102videoMosaicEffectCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Video Mosaic Effect Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102videoMosaicEffectCustom = value
        AppToast.show(this, "Video Mosaic Effect Custom: $value")
    }
}

// v102.29: Danmaku Font Glow Color
internal fun PlayerActivity.showV102DanmakuFontGlowColorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102danmakuFontGlowColor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Color",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102danmakuFontGlowColor = value
        AppToast.show(this, "Danmaku Font Glow Color: $value")
    }
}

// v102.30: Subtitle Text Transform Custom
internal fun PlayerActivity.showV102SubtitleTextTransformCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v102subtitleTextTransformCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Text Transform Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v102subtitleTextTransformCustom = value
        AppToast.show(this, "Subtitle Text Transform Custom: $value")
    }
}

// v103.31: Audio Treble Boost Custom
internal fun PlayerActivity.showV103AudioTrebleBoostCustomDialog() {
    val options = listOf(0, 25, 50, 75, 100)
    val currentIndex = options.indexOf(BiliClient.prefs.v103audioTrebleBoostCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Audio Treble Boost Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103audioTrebleBoostCustom = value
        AppToast.show(this, "Audio Treble Boost Custom: $value")
    }
}

// v103.32: Danmaku Font Glow Radius
internal fun PlayerActivity.showV103DanmakuFontGlowRadiusDialog() {
    val options = listOf(1, 2, 3, 4, 5)
    val currentIndex = options.indexOf(BiliClient.prefs.v103danmakuFontGlowRadius).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Danmaku Font Glow Radius",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103danmakuFontGlowRadius = value
        AppToast.show(this, "Danmaku Font Glow Radius: $value")
    }
}

// v103.33: Subtitle Font Variant Custom
internal fun PlayerActivity.showV103SubtitleFontVariantCustomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v103subtitleFontVariantCustom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Subtitle Font Variant Custom",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v103subtitleFontVariantCustom = value
        AppToast.show(this, "Subtitle Font Variant Custom: $value")
    }
}

// v791: disable mode
internal fun PlayerActivity.showV791DisableToggle() {
    val current = FeaturePrefsStore.batch791.v791disable
    FeaturePrefsStore.batch791.v791disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v791: discard mode
internal fun PlayerActivity.showV791DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v791discard
    FeaturePrefsStore.batch791.v791discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v791: discover mode
internal fun PlayerActivity.showV791DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v791discover
    FeaturePrefsStore.batch791.v791discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v791: dispatch mode
internal fun PlayerActivity.showV791DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v791dispatch
    FeaturePrefsStore.batch791.v791dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v791: display mode
internal fun PlayerActivity.showV791DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v791display
    FeaturePrefsStore.batch791.v791display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v791: dispose level
internal fun PlayerActivity.showV791DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v791: distance level
internal fun PlayerActivity.showV791DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v791: distribute level
internal fun PlayerActivity.showV791DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v791: divide level
internal fun PlayerActivity.showV791DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v791: document level
internal fun PlayerActivity.showV791DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v791document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v791document = value
        AppToast.show(this, "document: $value")
    }
}

// v791: domain mode
internal fun PlayerActivity.showV791DomainToggle() {
    val current = FeaturePrefsStore.batch791.v791domain
    FeaturePrefsStore.batch791.v791domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v791: download mode
internal fun PlayerActivity.showV791DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v791download
    FeaturePrefsStore.batch791.v791download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v791: draft mode
internal fun PlayerActivity.showV791DraftToggle() {
    val current = FeaturePrefsStore.batch791.v791draft
    FeaturePrefsStore.batch791.v791draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v791: drag mode
internal fun PlayerActivity.showV791DragToggle() {
    val current = FeaturePrefsStore.batch791.v791drag
    FeaturePrefsStore.batch791.v791drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v791: draw mode
internal fun PlayerActivity.showV791DrawToggle() {
    val current = FeaturePrefsStore.batch791.v791draw
    FeaturePrefsStore.batch791.v791draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v792: disable mode
internal fun PlayerActivity.showV792DisableToggle() {
    val current = FeaturePrefsStore.batch791.v792disable
    FeaturePrefsStore.batch791.v792disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v792: discard mode
internal fun PlayerActivity.showV792DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v792discard
    FeaturePrefsStore.batch791.v792discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v792: discover mode
internal fun PlayerActivity.showV792DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v792discover
    FeaturePrefsStore.batch791.v792discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v792: dispatch mode
internal fun PlayerActivity.showV792DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v792dispatch
    FeaturePrefsStore.batch791.v792dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v792: display mode
internal fun PlayerActivity.showV792DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v792display
    FeaturePrefsStore.batch791.v792display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v792: dispose level
internal fun PlayerActivity.showV792DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v792: distance level
internal fun PlayerActivity.showV792DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v792: distribute level
internal fun PlayerActivity.showV792DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v792: divide level
internal fun PlayerActivity.showV792DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v792: document level
internal fun PlayerActivity.showV792DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v792document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v792document = value
        AppToast.show(this, "document: $value")
    }
}

// v792: domain mode
internal fun PlayerActivity.showV792DomainToggle() {
    val current = FeaturePrefsStore.batch791.v792domain
    FeaturePrefsStore.batch791.v792domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v792: download mode
internal fun PlayerActivity.showV792DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v792download
    FeaturePrefsStore.batch791.v792download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v792: draft mode
internal fun PlayerActivity.showV792DraftToggle() {
    val current = FeaturePrefsStore.batch791.v792draft
    FeaturePrefsStore.batch791.v792draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v792: drag mode
internal fun PlayerActivity.showV792DragToggle() {
    val current = FeaturePrefsStore.batch791.v792drag
    FeaturePrefsStore.batch791.v792drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v792: draw mode
internal fun PlayerActivity.showV792DrawToggle() {
    val current = FeaturePrefsStore.batch791.v792draw
    FeaturePrefsStore.batch791.v792draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v793: disable mode
internal fun PlayerActivity.showV793DisableToggle() {
    val current = FeaturePrefsStore.batch791.v793disable
    FeaturePrefsStore.batch791.v793disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v793: discard mode
internal fun PlayerActivity.showV793DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v793discard
    FeaturePrefsStore.batch791.v793discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v793: discover mode
internal fun PlayerActivity.showV793DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v793discover
    FeaturePrefsStore.batch791.v793discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v793: dispatch mode
internal fun PlayerActivity.showV793DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v793dispatch
    FeaturePrefsStore.batch791.v793dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v793: display mode
internal fun PlayerActivity.showV793DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v793display
    FeaturePrefsStore.batch791.v793display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v793: dispose level
internal fun PlayerActivity.showV793DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v793: distance level
internal fun PlayerActivity.showV793DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v793: distribute level
internal fun PlayerActivity.showV793DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v793: divide level
internal fun PlayerActivity.showV793DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v793: document level
internal fun PlayerActivity.showV793DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v793document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v793document = value
        AppToast.show(this, "document: $value")
    }
}

// v793: domain mode
internal fun PlayerActivity.showV793DomainToggle() {
    val current = FeaturePrefsStore.batch791.v793domain
    FeaturePrefsStore.batch791.v793domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v793: download mode
internal fun PlayerActivity.showV793DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v793download
    FeaturePrefsStore.batch791.v793download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v793: draft mode
internal fun PlayerActivity.showV793DraftToggle() {
    val current = FeaturePrefsStore.batch791.v793draft
    FeaturePrefsStore.batch791.v793draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v793: drag mode
internal fun PlayerActivity.showV793DragToggle() {
    val current = FeaturePrefsStore.batch791.v793drag
    FeaturePrefsStore.batch791.v793drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v793: draw mode
internal fun PlayerActivity.showV793DrawToggle() {
    val current = FeaturePrefsStore.batch791.v793draw
    FeaturePrefsStore.batch791.v793draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v794: disable mode
internal fun PlayerActivity.showV794DisableToggle() {
    val current = FeaturePrefsStore.batch791.v794disable
    FeaturePrefsStore.batch791.v794disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v794: discard mode
internal fun PlayerActivity.showV794DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v794discard
    FeaturePrefsStore.batch791.v794discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v794: discover mode
internal fun PlayerActivity.showV794DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v794discover
    FeaturePrefsStore.batch791.v794discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v794: dispatch mode
internal fun PlayerActivity.showV794DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v794dispatch
    FeaturePrefsStore.batch791.v794dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v794: display mode
internal fun PlayerActivity.showV794DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v794display
    FeaturePrefsStore.batch791.v794display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v794: dispose level
internal fun PlayerActivity.showV794DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v794: distance level
internal fun PlayerActivity.showV794DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v794: distribute level
internal fun PlayerActivity.showV794DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v794: divide level
internal fun PlayerActivity.showV794DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v794: document level
internal fun PlayerActivity.showV794DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v794document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v794document = value
        AppToast.show(this, "document: $value")
    }
}

// v794: domain mode
internal fun PlayerActivity.showV794DomainToggle() {
    val current = FeaturePrefsStore.batch791.v794domain
    FeaturePrefsStore.batch791.v794domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v794: download mode
internal fun PlayerActivity.showV794DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v794download
    FeaturePrefsStore.batch791.v794download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v794: draft mode
internal fun PlayerActivity.showV794DraftToggle() {
    val current = FeaturePrefsStore.batch791.v794draft
    FeaturePrefsStore.batch791.v794draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v794: drag mode
internal fun PlayerActivity.showV794DragToggle() {
    val current = FeaturePrefsStore.batch791.v794drag
    FeaturePrefsStore.batch791.v794drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v794: draw mode
internal fun PlayerActivity.showV794DrawToggle() {
    val current = FeaturePrefsStore.batch791.v794draw
    FeaturePrefsStore.batch791.v794draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v795: disable mode
internal fun PlayerActivity.showV795DisableToggle() {
    val current = FeaturePrefsStore.batch791.v795disable
    FeaturePrefsStore.batch791.v795disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v795: discard mode
internal fun PlayerActivity.showV795DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v795discard
    FeaturePrefsStore.batch791.v795discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v795: discover mode
internal fun PlayerActivity.showV795DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v795discover
    FeaturePrefsStore.batch791.v795discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v795: dispatch mode
internal fun PlayerActivity.showV795DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v795dispatch
    FeaturePrefsStore.batch791.v795dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v795: display mode
internal fun PlayerActivity.showV795DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v795display
    FeaturePrefsStore.batch791.v795display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v795: dispose level
internal fun PlayerActivity.showV795DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v795: distance level
internal fun PlayerActivity.showV795DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v795: distribute level
internal fun PlayerActivity.showV795DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v795: divide level
internal fun PlayerActivity.showV795DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v795: document level
internal fun PlayerActivity.showV795DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v795document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v795document = value
        AppToast.show(this, "document: $value")
    }
}

// v795: domain mode
internal fun PlayerActivity.showV795DomainToggle() {
    val current = FeaturePrefsStore.batch791.v795domain
    FeaturePrefsStore.batch791.v795domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v795: download mode
internal fun PlayerActivity.showV795DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v795download
    FeaturePrefsStore.batch791.v795download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v795: draft mode
internal fun PlayerActivity.showV795DraftToggle() {
    val current = FeaturePrefsStore.batch791.v795draft
    FeaturePrefsStore.batch791.v795draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v795: drag mode
internal fun PlayerActivity.showV795DragToggle() {
    val current = FeaturePrefsStore.batch791.v795drag
    FeaturePrefsStore.batch791.v795drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v795: draw mode
internal fun PlayerActivity.showV795DrawToggle() {
    val current = FeaturePrefsStore.batch791.v795draw
    FeaturePrefsStore.batch791.v795draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v796: disable mode
internal fun PlayerActivity.showV796DisableToggle() {
    val current = FeaturePrefsStore.batch791.v796disable
    FeaturePrefsStore.batch791.v796disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v796: discard mode
internal fun PlayerActivity.showV796DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v796discard
    FeaturePrefsStore.batch791.v796discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v796: discover mode
internal fun PlayerActivity.showV796DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v796discover
    FeaturePrefsStore.batch791.v796discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v796: dispatch mode
internal fun PlayerActivity.showV796DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v796dispatch
    FeaturePrefsStore.batch791.v796dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v796: display mode
internal fun PlayerActivity.showV796DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v796display
    FeaturePrefsStore.batch791.v796display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v796: dispose level
internal fun PlayerActivity.showV796DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v796: distance level
internal fun PlayerActivity.showV796DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v796: distribute level
internal fun PlayerActivity.showV796DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v796: divide level
internal fun PlayerActivity.showV796DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v796: document level
internal fun PlayerActivity.showV796DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v796document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v796document = value
        AppToast.show(this, "document: $value")
    }
}

// v796: domain mode
internal fun PlayerActivity.showV796DomainToggle() {
    val current = FeaturePrefsStore.batch791.v796domain
    FeaturePrefsStore.batch791.v796domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v796: download mode
internal fun PlayerActivity.showV796DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v796download
    FeaturePrefsStore.batch791.v796download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v796: draft mode
internal fun PlayerActivity.showV796DraftToggle() {
    val current = FeaturePrefsStore.batch791.v796draft
    FeaturePrefsStore.batch791.v796draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v796: drag mode
internal fun PlayerActivity.showV796DragToggle() {
    val current = FeaturePrefsStore.batch791.v796drag
    FeaturePrefsStore.batch791.v796drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v796: draw mode
internal fun PlayerActivity.showV796DrawToggle() {
    val current = FeaturePrefsStore.batch791.v796draw
    FeaturePrefsStore.batch791.v796draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v797: disable mode
internal fun PlayerActivity.showV797DisableToggle() {
    val current = FeaturePrefsStore.batch791.v797disable
    FeaturePrefsStore.batch791.v797disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v797: discard mode
internal fun PlayerActivity.showV797DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v797discard
    FeaturePrefsStore.batch791.v797discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v797: discover mode
internal fun PlayerActivity.showV797DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v797discover
    FeaturePrefsStore.batch791.v797discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v797: dispatch mode
internal fun PlayerActivity.showV797DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v797dispatch
    FeaturePrefsStore.batch791.v797dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v797: display mode
internal fun PlayerActivity.showV797DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v797display
    FeaturePrefsStore.batch791.v797display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v797: dispose level
internal fun PlayerActivity.showV797DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v797: distance level
internal fun PlayerActivity.showV797DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v797: distribute level
internal fun PlayerActivity.showV797DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v797: divide level
internal fun PlayerActivity.showV797DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v797: document level
internal fun PlayerActivity.showV797DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v797document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v797document = value
        AppToast.show(this, "document: $value")
    }
}

// v797: domain mode
internal fun PlayerActivity.showV797DomainToggle() {
    val current = FeaturePrefsStore.batch791.v797domain
    FeaturePrefsStore.batch791.v797domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v797: download mode
internal fun PlayerActivity.showV797DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v797download
    FeaturePrefsStore.batch791.v797download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v797: draft mode
internal fun PlayerActivity.showV797DraftToggle() {
    val current = FeaturePrefsStore.batch791.v797draft
    FeaturePrefsStore.batch791.v797draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v797: drag mode
internal fun PlayerActivity.showV797DragToggle() {
    val current = FeaturePrefsStore.batch791.v797drag
    FeaturePrefsStore.batch791.v797drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v797: draw mode
internal fun PlayerActivity.showV797DrawToggle() {
    val current = FeaturePrefsStore.batch791.v797draw
    FeaturePrefsStore.batch791.v797draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v798: disable mode
internal fun PlayerActivity.showV798DisableToggle() {
    val current = FeaturePrefsStore.batch791.v798disable
    FeaturePrefsStore.batch791.v798disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v798: discard mode
internal fun PlayerActivity.showV798DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v798discard
    FeaturePrefsStore.batch791.v798discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v798: discover mode
internal fun PlayerActivity.showV798DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v798discover
    FeaturePrefsStore.batch791.v798discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v798: dispatch mode
internal fun PlayerActivity.showV798DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v798dispatch
    FeaturePrefsStore.batch791.v798dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v798: display mode
internal fun PlayerActivity.showV798DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v798display
    FeaturePrefsStore.batch791.v798display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v798: dispose level
internal fun PlayerActivity.showV798DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v798: distance level
internal fun PlayerActivity.showV798DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v798: distribute level
internal fun PlayerActivity.showV798DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v798: divide level
internal fun PlayerActivity.showV798DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v798: document level
internal fun PlayerActivity.showV798DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v798document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v798document = value
        AppToast.show(this, "document: $value")
    }
}

// v798: domain mode
internal fun PlayerActivity.showV798DomainToggle() {
    val current = FeaturePrefsStore.batch791.v798domain
    FeaturePrefsStore.batch791.v798domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v798: download mode
internal fun PlayerActivity.showV798DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v798download
    FeaturePrefsStore.batch791.v798download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v798: draft mode
internal fun PlayerActivity.showV798DraftToggle() {
    val current = FeaturePrefsStore.batch791.v798draft
    FeaturePrefsStore.batch791.v798draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v798: drag mode
internal fun PlayerActivity.showV798DragToggle() {
    val current = FeaturePrefsStore.batch791.v798drag
    FeaturePrefsStore.batch791.v798drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v798: draw mode
internal fun PlayerActivity.showV798DrawToggle() {
    val current = FeaturePrefsStore.batch791.v798draw
    FeaturePrefsStore.batch791.v798draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v799: disable mode
internal fun PlayerActivity.showV799DisableToggle() {
    val current = FeaturePrefsStore.batch791.v799disable
    FeaturePrefsStore.batch791.v799disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v799: discard mode
internal fun PlayerActivity.showV799DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v799discard
    FeaturePrefsStore.batch791.v799discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v799: discover mode
internal fun PlayerActivity.showV799DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v799discover
    FeaturePrefsStore.batch791.v799discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v799: dispatch mode
internal fun PlayerActivity.showV799DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v799dispatch
    FeaturePrefsStore.batch791.v799dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v799: display mode
internal fun PlayerActivity.showV799DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v799display
    FeaturePrefsStore.batch791.v799display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v799: dispose level
internal fun PlayerActivity.showV799DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v799: distance level
internal fun PlayerActivity.showV799DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v799: distribute level
internal fun PlayerActivity.showV799DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v799: divide level
internal fun PlayerActivity.showV799DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v799: document level
internal fun PlayerActivity.showV799DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v799document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v799document = value
        AppToast.show(this, "document: $value")
    }
}

// v799: domain mode
internal fun PlayerActivity.showV799DomainToggle() {
    val current = FeaturePrefsStore.batch791.v799domain
    FeaturePrefsStore.batch791.v799domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v799: download mode
internal fun PlayerActivity.showV799DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v799download
    FeaturePrefsStore.batch791.v799download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v799: draft mode
internal fun PlayerActivity.showV799DraftToggle() {
    val current = FeaturePrefsStore.batch791.v799draft
    FeaturePrefsStore.batch791.v799draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v799: drag mode
internal fun PlayerActivity.showV799DragToggle() {
    val current = FeaturePrefsStore.batch791.v799drag
    FeaturePrefsStore.batch791.v799drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v799: draw mode
internal fun PlayerActivity.showV799DrawToggle() {
    val current = FeaturePrefsStore.batch791.v799draw
    FeaturePrefsStore.batch791.v799draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v800: disable mode
internal fun PlayerActivity.showV800DisableToggle() {
    val current = FeaturePrefsStore.batch791.v800disable
    FeaturePrefsStore.batch791.v800disable = !current
    AppToast.show(this, "disable: ${if (!current) "ON" else "OFF"}")
}

// v800: discard mode
internal fun PlayerActivity.showV800DiscardToggle() {
    val current = FeaturePrefsStore.batch791.v800discard
    FeaturePrefsStore.batch791.v800discard = !current
    AppToast.show(this, "discard: ${if (!current) "ON" else "OFF"}")
}

// v800: discover mode
internal fun PlayerActivity.showV800DiscoverToggle() {
    val current = FeaturePrefsStore.batch791.v800discover
    FeaturePrefsStore.batch791.v800discover = !current
    AppToast.show(this, "discover: ${if (!current) "ON" else "OFF"}")
}

// v800: dispatch mode
internal fun PlayerActivity.showV800DispatchToggle() {
    val current = FeaturePrefsStore.batch791.v800dispatch
    FeaturePrefsStore.batch791.v800dispatch = !current
    AppToast.show(this, "dispatch: ${if (!current) "ON" else "OFF"}")
}

// v800: display mode
internal fun PlayerActivity.showV800DisplayToggle() {
    val current = FeaturePrefsStore.batch791.v800display
    FeaturePrefsStore.batch791.v800display = !current
    AppToast.show(this, "display: ${if (!current) "ON" else "OFF"}")
}

// v800: dispose level
internal fun PlayerActivity.showV800DisposeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800dispose).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dispose level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800dispose = value
        AppToast.show(this, "dispose: $value")
    }
}

// v800: distance level
internal fun PlayerActivity.showV800DistanceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800distance).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distance level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800distance = value
        AppToast.show(this, "distance: $value")
    }
}

// v800: distribute level
internal fun PlayerActivity.showV800DistributeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800distribute).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "distribute level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800distribute = value
        AppToast.show(this, "distribute: $value")
    }
}

// v800: divide level
internal fun PlayerActivity.showV800DivideDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800divide).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "divide level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800divide = value
        AppToast.show(this, "divide: $value")
    }
}

// v800: document level
internal fun PlayerActivity.showV800DocumentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch791.v800document).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "document level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch791.v800document = value
        AppToast.show(this, "document: $value")
    }
}

// v800: domain mode
internal fun PlayerActivity.showV800DomainToggle() {
    val current = FeaturePrefsStore.batch791.v800domain
    FeaturePrefsStore.batch791.v800domain = !current
    AppToast.show(this, "domain: ${if (!current) "ON" else "OFF"}")
}

// v800: download mode
internal fun PlayerActivity.showV800DownloadToggle() {
    val current = FeaturePrefsStore.batch791.v800download
    FeaturePrefsStore.batch791.v800download = !current
    AppToast.show(this, "download: ${if (!current) "ON" else "OFF"}")
}

// v800: draft mode
internal fun PlayerActivity.showV800DraftToggle() {
    val current = FeaturePrefsStore.batch791.v800draft
    FeaturePrefsStore.batch791.v800draft = !current
    AppToast.show(this, "draft: ${if (!current) "ON" else "OFF"}")
}

// v800: drag mode
internal fun PlayerActivity.showV800DragToggle() {
    val current = FeaturePrefsStore.batch791.v800drag
    FeaturePrefsStore.batch791.v800drag = !current
    AppToast.show(this, "drag: ${if (!current) "ON" else "OFF"}")
}

// v800: draw mode
internal fun PlayerActivity.showV800DrawToggle() {
    val current = FeaturePrefsStore.batch791.v800draw
    FeaturePrefsStore.batch791.v800draw = !current
    AppToast.show(this, "draw: ${if (!current) "ON" else "OFF"}")
}

// v801: driver mode
internal fun PlayerActivity.showV801DriverToggle() {
    val current = FeaturePrefsStore.batch801.v801driver
    FeaturePrefsStore.batch801.v801driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v801: drop mode
internal fun PlayerActivity.showV801DropToggle() {
    val current = FeaturePrefsStore.batch801.v801drop
    FeaturePrefsStore.batch801.v801drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v801: dry mode
internal fun PlayerActivity.showV801DryToggle() {
    val current = FeaturePrefsStore.batch801.v801dry
    FeaturePrefsStore.batch801.v801dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v801: dump mode
internal fun PlayerActivity.showV801DumpToggle() {
    val current = FeaturePrefsStore.batch801.v801dump
    FeaturePrefsStore.batch801.v801dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v801: duplicate mode
internal fun PlayerActivity.showV801DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v801duplicate
    FeaturePrefsStore.batch801.v801duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v801: duration level
internal fun PlayerActivity.showV801DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v801: dynamic level
internal fun PlayerActivity.showV801DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v801: echo level
internal fun PlayerActivity.showV801EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v801: edge level
internal fun PlayerActivity.showV801EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v801: edit level
internal fun PlayerActivity.showV801EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v801edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v801edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v801: effect mode
internal fun PlayerActivity.showV801EffectToggle() {
    val current = FeaturePrefsStore.batch801.v801effect
    FeaturePrefsStore.batch801.v801effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v801: element mode
internal fun PlayerActivity.showV801ElementToggle() {
    val current = FeaturePrefsStore.batch801.v801element
    FeaturePrefsStore.batch801.v801element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v801: embed mode
internal fun PlayerActivity.showV801EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v801embed
    FeaturePrefsStore.batch801.v801embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v801: emit mode
internal fun PlayerActivity.showV801EmitToggle() {
    val current = FeaturePrefsStore.batch801.v801emit
    FeaturePrefsStore.batch801.v801emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v801: empty mode
internal fun PlayerActivity.showV801EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v801empty
    FeaturePrefsStore.batch801.v801empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v802: driver mode
internal fun PlayerActivity.showV802DriverToggle() {
    val current = FeaturePrefsStore.batch801.v802driver
    FeaturePrefsStore.batch801.v802driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v802: drop mode
internal fun PlayerActivity.showV802DropToggle() {
    val current = FeaturePrefsStore.batch801.v802drop
    FeaturePrefsStore.batch801.v802drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v802: dry mode
internal fun PlayerActivity.showV802DryToggle() {
    val current = FeaturePrefsStore.batch801.v802dry
    FeaturePrefsStore.batch801.v802dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v802: dump mode
internal fun PlayerActivity.showV802DumpToggle() {
    val current = FeaturePrefsStore.batch801.v802dump
    FeaturePrefsStore.batch801.v802dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v802: duplicate mode
internal fun PlayerActivity.showV802DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v802duplicate
    FeaturePrefsStore.batch801.v802duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v802: duration level
internal fun PlayerActivity.showV802DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v802: dynamic level
internal fun PlayerActivity.showV802DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v802: echo level
internal fun PlayerActivity.showV802EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v802: edge level
internal fun PlayerActivity.showV802EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v802: edit level
internal fun PlayerActivity.showV802EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v802edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v802edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v802: effect mode
internal fun PlayerActivity.showV802EffectToggle() {
    val current = FeaturePrefsStore.batch801.v802effect
    FeaturePrefsStore.batch801.v802effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v802: element mode
internal fun PlayerActivity.showV802ElementToggle() {
    val current = FeaturePrefsStore.batch801.v802element
    FeaturePrefsStore.batch801.v802element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v802: embed mode
internal fun PlayerActivity.showV802EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v802embed
    FeaturePrefsStore.batch801.v802embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v802: emit mode
internal fun PlayerActivity.showV802EmitToggle() {
    val current = FeaturePrefsStore.batch801.v802emit
    FeaturePrefsStore.batch801.v802emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v802: empty mode
internal fun PlayerActivity.showV802EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v802empty
    FeaturePrefsStore.batch801.v802empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v803: driver mode
internal fun PlayerActivity.showV803DriverToggle() {
    val current = FeaturePrefsStore.batch801.v803driver
    FeaturePrefsStore.batch801.v803driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v803: drop mode
internal fun PlayerActivity.showV803DropToggle() {
    val current = FeaturePrefsStore.batch801.v803drop
    FeaturePrefsStore.batch801.v803drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v803: dry mode
internal fun PlayerActivity.showV803DryToggle() {
    val current = FeaturePrefsStore.batch801.v803dry
    FeaturePrefsStore.batch801.v803dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v803: dump mode
internal fun PlayerActivity.showV803DumpToggle() {
    val current = FeaturePrefsStore.batch801.v803dump
    FeaturePrefsStore.batch801.v803dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v803: duplicate mode
internal fun PlayerActivity.showV803DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v803duplicate
    FeaturePrefsStore.batch801.v803duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v803: duration level
internal fun PlayerActivity.showV803DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v803: dynamic level
internal fun PlayerActivity.showV803DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v803: echo level
internal fun PlayerActivity.showV803EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v803: edge level
internal fun PlayerActivity.showV803EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v803: edit level
internal fun PlayerActivity.showV803EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v803edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v803edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v803: effect mode
internal fun PlayerActivity.showV803EffectToggle() {
    val current = FeaturePrefsStore.batch801.v803effect
    FeaturePrefsStore.batch801.v803effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v803: element mode
internal fun PlayerActivity.showV803ElementToggle() {
    val current = FeaturePrefsStore.batch801.v803element
    FeaturePrefsStore.batch801.v803element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v803: embed mode
internal fun PlayerActivity.showV803EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v803embed
    FeaturePrefsStore.batch801.v803embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v803: emit mode
internal fun PlayerActivity.showV803EmitToggle() {
    val current = FeaturePrefsStore.batch801.v803emit
    FeaturePrefsStore.batch801.v803emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v803: empty mode
internal fun PlayerActivity.showV803EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v803empty
    FeaturePrefsStore.batch801.v803empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v804: driver mode
internal fun PlayerActivity.showV804DriverToggle() {
    val current = FeaturePrefsStore.batch801.v804driver
    FeaturePrefsStore.batch801.v804driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v804: drop mode
internal fun PlayerActivity.showV804DropToggle() {
    val current = FeaturePrefsStore.batch801.v804drop
    FeaturePrefsStore.batch801.v804drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v804: dry mode
internal fun PlayerActivity.showV804DryToggle() {
    val current = FeaturePrefsStore.batch801.v804dry
    FeaturePrefsStore.batch801.v804dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v804: dump mode
internal fun PlayerActivity.showV804DumpToggle() {
    val current = FeaturePrefsStore.batch801.v804dump
    FeaturePrefsStore.batch801.v804dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v804: duplicate mode
internal fun PlayerActivity.showV804DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v804duplicate
    FeaturePrefsStore.batch801.v804duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v804: duration level
internal fun PlayerActivity.showV804DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v804: dynamic level
internal fun PlayerActivity.showV804DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v804: echo level
internal fun PlayerActivity.showV804EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v804: edge level
internal fun PlayerActivity.showV804EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v804: edit level
internal fun PlayerActivity.showV804EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v804edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v804edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v804: effect mode
internal fun PlayerActivity.showV804EffectToggle() {
    val current = FeaturePrefsStore.batch801.v804effect
    FeaturePrefsStore.batch801.v804effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v804: element mode
internal fun PlayerActivity.showV804ElementToggle() {
    val current = FeaturePrefsStore.batch801.v804element
    FeaturePrefsStore.batch801.v804element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v804: embed mode
internal fun PlayerActivity.showV804EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v804embed
    FeaturePrefsStore.batch801.v804embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v804: emit mode
internal fun PlayerActivity.showV804EmitToggle() {
    val current = FeaturePrefsStore.batch801.v804emit
    FeaturePrefsStore.batch801.v804emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v804: empty mode
internal fun PlayerActivity.showV804EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v804empty
    FeaturePrefsStore.batch801.v804empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v805: driver mode
internal fun PlayerActivity.showV805DriverToggle() {
    val current = FeaturePrefsStore.batch801.v805driver
    FeaturePrefsStore.batch801.v805driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v805: drop mode
internal fun PlayerActivity.showV805DropToggle() {
    val current = FeaturePrefsStore.batch801.v805drop
    FeaturePrefsStore.batch801.v805drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v805: dry mode
internal fun PlayerActivity.showV805DryToggle() {
    val current = FeaturePrefsStore.batch801.v805dry
    FeaturePrefsStore.batch801.v805dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v805: dump mode
internal fun PlayerActivity.showV805DumpToggle() {
    val current = FeaturePrefsStore.batch801.v805dump
    FeaturePrefsStore.batch801.v805dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v805: duplicate mode
internal fun PlayerActivity.showV805DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v805duplicate
    FeaturePrefsStore.batch801.v805duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v805: duration level
internal fun PlayerActivity.showV805DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v805: dynamic level
internal fun PlayerActivity.showV805DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v805: echo level
internal fun PlayerActivity.showV805EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v805: edge level
internal fun PlayerActivity.showV805EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v805: edit level
internal fun PlayerActivity.showV805EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v805edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v805edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v805: effect mode
internal fun PlayerActivity.showV805EffectToggle() {
    val current = FeaturePrefsStore.batch801.v805effect
    FeaturePrefsStore.batch801.v805effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v805: element mode
internal fun PlayerActivity.showV805ElementToggle() {
    val current = FeaturePrefsStore.batch801.v805element
    FeaturePrefsStore.batch801.v805element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v805: embed mode
internal fun PlayerActivity.showV805EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v805embed
    FeaturePrefsStore.batch801.v805embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v805: emit mode
internal fun PlayerActivity.showV805EmitToggle() {
    val current = FeaturePrefsStore.batch801.v805emit
    FeaturePrefsStore.batch801.v805emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v805: empty mode
internal fun PlayerActivity.showV805EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v805empty
    FeaturePrefsStore.batch801.v805empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v806: driver mode
internal fun PlayerActivity.showV806DriverToggle() {
    val current = FeaturePrefsStore.batch801.v806driver
    FeaturePrefsStore.batch801.v806driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v806: drop mode
internal fun PlayerActivity.showV806DropToggle() {
    val current = FeaturePrefsStore.batch801.v806drop
    FeaturePrefsStore.batch801.v806drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v806: dry mode
internal fun PlayerActivity.showV806DryToggle() {
    val current = FeaturePrefsStore.batch801.v806dry
    FeaturePrefsStore.batch801.v806dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v806: dump mode
internal fun PlayerActivity.showV806DumpToggle() {
    val current = FeaturePrefsStore.batch801.v806dump
    FeaturePrefsStore.batch801.v806dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v806: duplicate mode
internal fun PlayerActivity.showV806DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v806duplicate
    FeaturePrefsStore.batch801.v806duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v806: duration level
internal fun PlayerActivity.showV806DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v806: dynamic level
internal fun PlayerActivity.showV806DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v806: echo level
internal fun PlayerActivity.showV806EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v806: edge level
internal fun PlayerActivity.showV806EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v806: edit level
internal fun PlayerActivity.showV806EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v806edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v806edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v806: effect mode
internal fun PlayerActivity.showV806EffectToggle() {
    val current = FeaturePrefsStore.batch801.v806effect
    FeaturePrefsStore.batch801.v806effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v806: element mode
internal fun PlayerActivity.showV806ElementToggle() {
    val current = FeaturePrefsStore.batch801.v806element
    FeaturePrefsStore.batch801.v806element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v806: embed mode
internal fun PlayerActivity.showV806EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v806embed
    FeaturePrefsStore.batch801.v806embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v806: emit mode
internal fun PlayerActivity.showV806EmitToggle() {
    val current = FeaturePrefsStore.batch801.v806emit
    FeaturePrefsStore.batch801.v806emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v806: empty mode
internal fun PlayerActivity.showV806EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v806empty
    FeaturePrefsStore.batch801.v806empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v807: driver mode
internal fun PlayerActivity.showV807DriverToggle() {
    val current = FeaturePrefsStore.batch801.v807driver
    FeaturePrefsStore.batch801.v807driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v807: drop mode
internal fun PlayerActivity.showV807DropToggle() {
    val current = FeaturePrefsStore.batch801.v807drop
    FeaturePrefsStore.batch801.v807drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v807: dry mode
internal fun PlayerActivity.showV807DryToggle() {
    val current = FeaturePrefsStore.batch801.v807dry
    FeaturePrefsStore.batch801.v807dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v807: dump mode
internal fun PlayerActivity.showV807DumpToggle() {
    val current = FeaturePrefsStore.batch801.v807dump
    FeaturePrefsStore.batch801.v807dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v807: duplicate mode
internal fun PlayerActivity.showV807DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v807duplicate
    FeaturePrefsStore.batch801.v807duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v807: duration level
internal fun PlayerActivity.showV807DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v807: dynamic level
internal fun PlayerActivity.showV807DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v807: echo level
internal fun PlayerActivity.showV807EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v807: edge level
internal fun PlayerActivity.showV807EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v807: edit level
internal fun PlayerActivity.showV807EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v807edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v807edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v807: effect mode
internal fun PlayerActivity.showV807EffectToggle() {
    val current = FeaturePrefsStore.batch801.v807effect
    FeaturePrefsStore.batch801.v807effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v807: element mode
internal fun PlayerActivity.showV807ElementToggle() {
    val current = FeaturePrefsStore.batch801.v807element
    FeaturePrefsStore.batch801.v807element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v807: embed mode
internal fun PlayerActivity.showV807EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v807embed
    FeaturePrefsStore.batch801.v807embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v807: emit mode
internal fun PlayerActivity.showV807EmitToggle() {
    val current = FeaturePrefsStore.batch801.v807emit
    FeaturePrefsStore.batch801.v807emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v807: empty mode
internal fun PlayerActivity.showV807EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v807empty
    FeaturePrefsStore.batch801.v807empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v808: driver mode
internal fun PlayerActivity.showV808DriverToggle() {
    val current = FeaturePrefsStore.batch801.v808driver
    FeaturePrefsStore.batch801.v808driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v808: drop mode
internal fun PlayerActivity.showV808DropToggle() {
    val current = FeaturePrefsStore.batch801.v808drop
    FeaturePrefsStore.batch801.v808drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v808: dry mode
internal fun PlayerActivity.showV808DryToggle() {
    val current = FeaturePrefsStore.batch801.v808dry
    FeaturePrefsStore.batch801.v808dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v808: dump mode
internal fun PlayerActivity.showV808DumpToggle() {
    val current = FeaturePrefsStore.batch801.v808dump
    FeaturePrefsStore.batch801.v808dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v808: duplicate mode
internal fun PlayerActivity.showV808DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v808duplicate
    FeaturePrefsStore.batch801.v808duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v808: duration level
internal fun PlayerActivity.showV808DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v808: dynamic level
internal fun PlayerActivity.showV808DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v808: echo level
internal fun PlayerActivity.showV808EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v808: edge level
internal fun PlayerActivity.showV808EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v808: edit level
internal fun PlayerActivity.showV808EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v808edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v808edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v808: effect mode
internal fun PlayerActivity.showV808EffectToggle() {
    val current = FeaturePrefsStore.batch801.v808effect
    FeaturePrefsStore.batch801.v808effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v808: element mode
internal fun PlayerActivity.showV808ElementToggle() {
    val current = FeaturePrefsStore.batch801.v808element
    FeaturePrefsStore.batch801.v808element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v808: embed mode
internal fun PlayerActivity.showV808EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v808embed
    FeaturePrefsStore.batch801.v808embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v808: emit mode
internal fun PlayerActivity.showV808EmitToggle() {
    val current = FeaturePrefsStore.batch801.v808emit
    FeaturePrefsStore.batch801.v808emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v808: empty mode
internal fun PlayerActivity.showV808EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v808empty
    FeaturePrefsStore.batch801.v808empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v809: driver mode
internal fun PlayerActivity.showV809DriverToggle() {
    val current = FeaturePrefsStore.batch801.v809driver
    FeaturePrefsStore.batch801.v809driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v809: drop mode
internal fun PlayerActivity.showV809DropToggle() {
    val current = FeaturePrefsStore.batch801.v809drop
    FeaturePrefsStore.batch801.v809drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v809: dry mode
internal fun PlayerActivity.showV809DryToggle() {
    val current = FeaturePrefsStore.batch801.v809dry
    FeaturePrefsStore.batch801.v809dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v809: dump mode
internal fun PlayerActivity.showV809DumpToggle() {
    val current = FeaturePrefsStore.batch801.v809dump
    FeaturePrefsStore.batch801.v809dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v809: duplicate mode
internal fun PlayerActivity.showV809DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v809duplicate
    FeaturePrefsStore.batch801.v809duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v809: duration level
internal fun PlayerActivity.showV809DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v809: dynamic level
internal fun PlayerActivity.showV809DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v809: echo level
internal fun PlayerActivity.showV809EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v809: edge level
internal fun PlayerActivity.showV809EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v809: edit level
internal fun PlayerActivity.showV809EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v809edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v809edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v809: effect mode
internal fun PlayerActivity.showV809EffectToggle() {
    val current = FeaturePrefsStore.batch801.v809effect
    FeaturePrefsStore.batch801.v809effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v809: element mode
internal fun PlayerActivity.showV809ElementToggle() {
    val current = FeaturePrefsStore.batch801.v809element
    FeaturePrefsStore.batch801.v809element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v809: embed mode
internal fun PlayerActivity.showV809EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v809embed
    FeaturePrefsStore.batch801.v809embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v809: emit mode
internal fun PlayerActivity.showV809EmitToggle() {
    val current = FeaturePrefsStore.batch801.v809emit
    FeaturePrefsStore.batch801.v809emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v809: empty mode
internal fun PlayerActivity.showV809EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v809empty
    FeaturePrefsStore.batch801.v809empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}

// v810: driver mode
internal fun PlayerActivity.showV810DriverToggle() {
    val current = FeaturePrefsStore.batch801.v810driver
    FeaturePrefsStore.batch801.v810driver = !current
    AppToast.show(this, "driver: ${if (!current) "ON" else "OFF"}")
}

// v810: drop mode
internal fun PlayerActivity.showV810DropToggle() {
    val current = FeaturePrefsStore.batch801.v810drop
    FeaturePrefsStore.batch801.v810drop = !current
    AppToast.show(this, "drop: ${if (!current) "ON" else "OFF"}")
}

// v810: dry mode
internal fun PlayerActivity.showV810DryToggle() {
    val current = FeaturePrefsStore.batch801.v810dry
    FeaturePrefsStore.batch801.v810dry = !current
    AppToast.show(this, "dry: ${if (!current) "ON" else "OFF"}")
}

// v810: dump mode
internal fun PlayerActivity.showV810DumpToggle() {
    val current = FeaturePrefsStore.batch801.v810dump
    FeaturePrefsStore.batch801.v810dump = !current
    AppToast.show(this, "dump: ${if (!current) "ON" else "OFF"}")
}

// v810: duplicate mode
internal fun PlayerActivity.showV810DuplicateToggle() {
    val current = FeaturePrefsStore.batch801.v810duplicate
    FeaturePrefsStore.batch801.v810duplicate = !current
    AppToast.show(this, "duplicate: ${if (!current) "ON" else "OFF"}")
}

// v810: duration level
internal fun PlayerActivity.showV810DurationDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810duration).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "duration level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810duration = value
        AppToast.show(this, "duration: $value")
    }
}

// v810: dynamic level
internal fun PlayerActivity.showV810DynamicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810dynamic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "dynamic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810dynamic = value
        AppToast.show(this, "dynamic: $value")
    }
}

// v810: echo level
internal fun PlayerActivity.showV810EchoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810echo).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "echo level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810echo = value
        AppToast.show(this, "echo: $value")
    }
}

// v810: edge level
internal fun PlayerActivity.showV810EdgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810edge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810edge = value
        AppToast.show(this, "edge: $value")
    }
}

// v810: edit level
internal fun PlayerActivity.showV810EditDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch801.v810edit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "edit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch801.v810edit = value
        AppToast.show(this, "edit: $value")
    }
}

// v810: effect mode
internal fun PlayerActivity.showV810EffectToggle() {
    val current = FeaturePrefsStore.batch801.v810effect
    FeaturePrefsStore.batch801.v810effect = !current
    AppToast.show(this, "effect: ${if (!current) "ON" else "OFF"}")
}

// v810: element mode
internal fun PlayerActivity.showV810ElementToggle() {
    val current = FeaturePrefsStore.batch801.v810element
    FeaturePrefsStore.batch801.v810element = !current
    AppToast.show(this, "element: ${if (!current) "ON" else "OFF"}")
}

// v810: embed mode
internal fun PlayerActivity.showV810EmbedToggle() {
    val current = FeaturePrefsStore.batch801.v810embed
    FeaturePrefsStore.batch801.v810embed = !current
    AppToast.show(this, "embed: ${if (!current) "ON" else "OFF"}")
}

// v810: emit mode
internal fun PlayerActivity.showV810EmitToggle() {
    val current = FeaturePrefsStore.batch801.v810emit
    FeaturePrefsStore.batch801.v810emit = !current
    AppToast.show(this, "emit: ${if (!current) "ON" else "OFF"}")
}

// v810: empty mode
internal fun PlayerActivity.showV810EmptyToggle() {
    val current = FeaturePrefsStore.batch801.v810empty
    FeaturePrefsStore.batch801.v810empty = !current
    AppToast.show(this, "empty: ${if (!current) "ON" else "OFF"}")
}
