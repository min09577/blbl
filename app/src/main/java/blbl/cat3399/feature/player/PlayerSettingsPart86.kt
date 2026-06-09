package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1041: return mode
internal fun PlayerActivity.showV1041ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1041return
    FeaturePrefsStore.batch1041.v1041return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1041: reverse mode
internal fun PlayerActivity.showV1041ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1041reverse
    FeaturePrefsStore.batch1041.v1041reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1041: revert mode
internal fun PlayerActivity.showV1041RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1041revert
    FeaturePrefsStore.batch1041.v1041revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1041: right mode
internal fun PlayerActivity.showV1041RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1041right
    FeaturePrefsStore.batch1041.v1041right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1041: role mode
internal fun PlayerActivity.showV1041RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1041role
    FeaturePrefsStore.batch1041.v1041role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1041: root level
internal fun PlayerActivity.showV1041RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041root = value
        AppToast.show(this, "root: $value")
    }
}

// v1041: rotate level
internal fun PlayerActivity.showV1041RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1041: round level
internal fun PlayerActivity.showV1041RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041round = value
        AppToast.show(this, "round: $value")
    }
}

// v1041: route level
internal fun PlayerActivity.showV1041RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041route = value
        AppToast.show(this, "route: $value")
    }
}

// v1041: row level
internal fun PlayerActivity.showV1041RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1041row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1041row = value
        AppToast.show(this, "row: $value")
    }
}

// v1041: rule mode
internal fun PlayerActivity.showV1041RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1041rule
    FeaturePrefsStore.batch1041.v1041rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1041: run mode
internal fun PlayerActivity.showV1041RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1041run
    FeaturePrefsStore.batch1041.v1041run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1041: runtime mode
internal fun PlayerActivity.showV1041RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1041runtime
    FeaturePrefsStore.batch1041.v1041runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1041: safe mode
internal fun PlayerActivity.showV1041SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1041safe
    FeaturePrefsStore.batch1041.v1041safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1041: sample mode
internal fun PlayerActivity.showV1041SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1041sample
    FeaturePrefsStore.batch1041.v1041sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1042: return mode
internal fun PlayerActivity.showV1042ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1042return
    FeaturePrefsStore.batch1041.v1042return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1042: reverse mode
internal fun PlayerActivity.showV1042ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1042reverse
    FeaturePrefsStore.batch1041.v1042reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1042: revert mode
internal fun PlayerActivity.showV1042RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1042revert
    FeaturePrefsStore.batch1041.v1042revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1042: right mode
internal fun PlayerActivity.showV1042RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1042right
    FeaturePrefsStore.batch1041.v1042right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1042: role mode
internal fun PlayerActivity.showV1042RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1042role
    FeaturePrefsStore.batch1041.v1042role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1042: root level
internal fun PlayerActivity.showV1042RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042root = value
        AppToast.show(this, "root: $value")
    }
}

// v1042: rotate level
internal fun PlayerActivity.showV1042RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1042: round level
internal fun PlayerActivity.showV1042RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042round = value
        AppToast.show(this, "round: $value")
    }
}

// v1042: route level
internal fun PlayerActivity.showV1042RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042route = value
        AppToast.show(this, "route: $value")
    }
}

// v1042: row level
internal fun PlayerActivity.showV1042RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1042row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1042row = value
        AppToast.show(this, "row: $value")
    }
}

// v1042: rule mode
internal fun PlayerActivity.showV1042RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1042rule
    FeaturePrefsStore.batch1041.v1042rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1042: run mode
internal fun PlayerActivity.showV1042RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1042run
    FeaturePrefsStore.batch1041.v1042run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1042: runtime mode
internal fun PlayerActivity.showV1042RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1042runtime
    FeaturePrefsStore.batch1041.v1042runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1042: safe mode
internal fun PlayerActivity.showV1042SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1042safe
    FeaturePrefsStore.batch1041.v1042safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1042: sample mode
internal fun PlayerActivity.showV1042SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1042sample
    FeaturePrefsStore.batch1041.v1042sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1043: return mode
internal fun PlayerActivity.showV1043ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1043return
    FeaturePrefsStore.batch1041.v1043return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1043: reverse mode
internal fun PlayerActivity.showV1043ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1043reverse
    FeaturePrefsStore.batch1041.v1043reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1043: revert mode
internal fun PlayerActivity.showV1043RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1043revert
    FeaturePrefsStore.batch1041.v1043revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1043: right mode
internal fun PlayerActivity.showV1043RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1043right
    FeaturePrefsStore.batch1041.v1043right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1043: role mode
internal fun PlayerActivity.showV1043RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1043role
    FeaturePrefsStore.batch1041.v1043role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1043: root level
internal fun PlayerActivity.showV1043RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043root = value
        AppToast.show(this, "root: $value")
    }
}

// v1043: rotate level
internal fun PlayerActivity.showV1043RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1043: round level
internal fun PlayerActivity.showV1043RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043round = value
        AppToast.show(this, "round: $value")
    }
}

// v1043: route level
internal fun PlayerActivity.showV1043RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043route = value
        AppToast.show(this, "route: $value")
    }
}

// v1043: row level
internal fun PlayerActivity.showV1043RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1043row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1043row = value
        AppToast.show(this, "row: $value")
    }
}

// v1043: rule mode
internal fun PlayerActivity.showV1043RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1043rule
    FeaturePrefsStore.batch1041.v1043rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1043: run mode
internal fun PlayerActivity.showV1043RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1043run
    FeaturePrefsStore.batch1041.v1043run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1043: runtime mode
internal fun PlayerActivity.showV1043RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1043runtime
    FeaturePrefsStore.batch1041.v1043runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1043: safe mode
internal fun PlayerActivity.showV1043SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1043safe
    FeaturePrefsStore.batch1041.v1043safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1043: sample mode
internal fun PlayerActivity.showV1043SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1043sample
    FeaturePrefsStore.batch1041.v1043sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1044: return mode
internal fun PlayerActivity.showV1044ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1044return
    FeaturePrefsStore.batch1041.v1044return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1044: reverse mode
internal fun PlayerActivity.showV1044ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1044reverse
    FeaturePrefsStore.batch1041.v1044reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1044: revert mode
internal fun PlayerActivity.showV1044RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1044revert
    FeaturePrefsStore.batch1041.v1044revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1044: right mode
internal fun PlayerActivity.showV1044RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1044right
    FeaturePrefsStore.batch1041.v1044right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1044: role mode
internal fun PlayerActivity.showV1044RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1044role
    FeaturePrefsStore.batch1041.v1044role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1044: root level
internal fun PlayerActivity.showV1044RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044root = value
        AppToast.show(this, "root: $value")
    }
}

// v1044: rotate level
internal fun PlayerActivity.showV1044RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1044: round level
internal fun PlayerActivity.showV1044RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044round = value
        AppToast.show(this, "round: $value")
    }
}

// v1044: route level
internal fun PlayerActivity.showV1044RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044route = value
        AppToast.show(this, "route: $value")
    }
}

// v1044: row level
internal fun PlayerActivity.showV1044RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1044row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1044row = value
        AppToast.show(this, "row: $value")
    }
}

// v1044: rule mode
internal fun PlayerActivity.showV1044RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1044rule
    FeaturePrefsStore.batch1041.v1044rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1044: run mode
internal fun PlayerActivity.showV1044RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1044run
    FeaturePrefsStore.batch1041.v1044run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1044: runtime mode
internal fun PlayerActivity.showV1044RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1044runtime
    FeaturePrefsStore.batch1041.v1044runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1044: safe mode
internal fun PlayerActivity.showV1044SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1044safe
    FeaturePrefsStore.batch1041.v1044safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1044: sample mode
internal fun PlayerActivity.showV1044SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1044sample
    FeaturePrefsStore.batch1041.v1044sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1045: return mode
internal fun PlayerActivity.showV1045ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1045return
    FeaturePrefsStore.batch1041.v1045return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1045: reverse mode
internal fun PlayerActivity.showV1045ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1045reverse
    FeaturePrefsStore.batch1041.v1045reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1045: revert mode
internal fun PlayerActivity.showV1045RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1045revert
    FeaturePrefsStore.batch1041.v1045revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1045: right mode
internal fun PlayerActivity.showV1045RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1045right
    FeaturePrefsStore.batch1041.v1045right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1045: role mode
internal fun PlayerActivity.showV1045RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1045role
    FeaturePrefsStore.batch1041.v1045role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1045: root level
internal fun PlayerActivity.showV1045RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045root = value
        AppToast.show(this, "root: $value")
    }
}

// v1045: rotate level
internal fun PlayerActivity.showV1045RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1045: round level
internal fun PlayerActivity.showV1045RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045round = value
        AppToast.show(this, "round: $value")
    }
}

// v1045: route level
internal fun PlayerActivity.showV1045RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045route = value
        AppToast.show(this, "route: $value")
    }
}

// v1045: row level
internal fun PlayerActivity.showV1045RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1045row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1045row = value
        AppToast.show(this, "row: $value")
    }
}

// v1045: rule mode
internal fun PlayerActivity.showV1045RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1045rule
    FeaturePrefsStore.batch1041.v1045rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1045: run mode
internal fun PlayerActivity.showV1045RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1045run
    FeaturePrefsStore.batch1041.v1045run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1045: runtime mode
internal fun PlayerActivity.showV1045RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1045runtime
    FeaturePrefsStore.batch1041.v1045runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1045: safe mode
internal fun PlayerActivity.showV1045SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1045safe
    FeaturePrefsStore.batch1041.v1045safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1045: sample mode
internal fun PlayerActivity.showV1045SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1045sample
    FeaturePrefsStore.batch1041.v1045sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1046: return mode
internal fun PlayerActivity.showV1046ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1046return
    FeaturePrefsStore.batch1041.v1046return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1046: reverse mode
internal fun PlayerActivity.showV1046ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1046reverse
    FeaturePrefsStore.batch1041.v1046reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1046: revert mode
internal fun PlayerActivity.showV1046RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1046revert
    FeaturePrefsStore.batch1041.v1046revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1046: right mode
internal fun PlayerActivity.showV1046RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1046right
    FeaturePrefsStore.batch1041.v1046right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1046: role mode
internal fun PlayerActivity.showV1046RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1046role
    FeaturePrefsStore.batch1041.v1046role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1046: root level
internal fun PlayerActivity.showV1046RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046root = value
        AppToast.show(this, "root: $value")
    }
}

// v1046: rotate level
internal fun PlayerActivity.showV1046RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1046: round level
internal fun PlayerActivity.showV1046RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046round = value
        AppToast.show(this, "round: $value")
    }
}

// v1046: route level
internal fun PlayerActivity.showV1046RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046route = value
        AppToast.show(this, "route: $value")
    }
}

// v1046: row level
internal fun PlayerActivity.showV1046RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1046row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1046row = value
        AppToast.show(this, "row: $value")
    }
}

// v1046: rule mode
internal fun PlayerActivity.showV1046RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1046rule
    FeaturePrefsStore.batch1041.v1046rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1046: run mode
internal fun PlayerActivity.showV1046RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1046run
    FeaturePrefsStore.batch1041.v1046run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1046: runtime mode
internal fun PlayerActivity.showV1046RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1046runtime
    FeaturePrefsStore.batch1041.v1046runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1046: safe mode
internal fun PlayerActivity.showV1046SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1046safe
    FeaturePrefsStore.batch1041.v1046safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1046: sample mode
internal fun PlayerActivity.showV1046SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1046sample
    FeaturePrefsStore.batch1041.v1046sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1047: return mode
internal fun PlayerActivity.showV1047ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1047return
    FeaturePrefsStore.batch1041.v1047return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1047: reverse mode
internal fun PlayerActivity.showV1047ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1047reverse
    FeaturePrefsStore.batch1041.v1047reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1047: revert mode
internal fun PlayerActivity.showV1047RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1047revert
    FeaturePrefsStore.batch1041.v1047revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1047: right mode
internal fun PlayerActivity.showV1047RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1047right
    FeaturePrefsStore.batch1041.v1047right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1047: role mode
internal fun PlayerActivity.showV1047RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1047role
    FeaturePrefsStore.batch1041.v1047role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1047: root level
internal fun PlayerActivity.showV1047RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047root = value
        AppToast.show(this, "root: $value")
    }
}

// v1047: rotate level
internal fun PlayerActivity.showV1047RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1047: round level
internal fun PlayerActivity.showV1047RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047round = value
        AppToast.show(this, "round: $value")
    }
}

// v1047: route level
internal fun PlayerActivity.showV1047RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047route = value
        AppToast.show(this, "route: $value")
    }
}

// v1047: row level
internal fun PlayerActivity.showV1047RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1047row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1047row = value
        AppToast.show(this, "row: $value")
    }
}

// v1047: rule mode
internal fun PlayerActivity.showV1047RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1047rule
    FeaturePrefsStore.batch1041.v1047rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1047: run mode
internal fun PlayerActivity.showV1047RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1047run
    FeaturePrefsStore.batch1041.v1047run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1047: runtime mode
internal fun PlayerActivity.showV1047RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1047runtime
    FeaturePrefsStore.batch1041.v1047runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1047: safe mode
internal fun PlayerActivity.showV1047SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1047safe
    FeaturePrefsStore.batch1041.v1047safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1047: sample mode
internal fun PlayerActivity.showV1047SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1047sample
    FeaturePrefsStore.batch1041.v1047sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1048: return mode
internal fun PlayerActivity.showV1048ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1048return
    FeaturePrefsStore.batch1041.v1048return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1048: reverse mode
internal fun PlayerActivity.showV1048ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1048reverse
    FeaturePrefsStore.batch1041.v1048reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1048: revert mode
internal fun PlayerActivity.showV1048RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1048revert
    FeaturePrefsStore.batch1041.v1048revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1048: right mode
internal fun PlayerActivity.showV1048RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1048right
    FeaturePrefsStore.batch1041.v1048right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1048: role mode
internal fun PlayerActivity.showV1048RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1048role
    FeaturePrefsStore.batch1041.v1048role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1048: root level
internal fun PlayerActivity.showV1048RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048root = value
        AppToast.show(this, "root: $value")
    }
}

// v1048: rotate level
internal fun PlayerActivity.showV1048RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1048: round level
internal fun PlayerActivity.showV1048RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048round = value
        AppToast.show(this, "round: $value")
    }
}

// v1048: route level
internal fun PlayerActivity.showV1048RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048route = value
        AppToast.show(this, "route: $value")
    }
}

// v1048: row level
internal fun PlayerActivity.showV1048RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1048row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1048row = value
        AppToast.show(this, "row: $value")
    }
}

// v1048: rule mode
internal fun PlayerActivity.showV1048RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1048rule
    FeaturePrefsStore.batch1041.v1048rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1048: run mode
internal fun PlayerActivity.showV1048RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1048run
    FeaturePrefsStore.batch1041.v1048run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1048: runtime mode
internal fun PlayerActivity.showV1048RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1048runtime
    FeaturePrefsStore.batch1041.v1048runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1048: safe mode
internal fun PlayerActivity.showV1048SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1048safe
    FeaturePrefsStore.batch1041.v1048safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1048: sample mode
internal fun PlayerActivity.showV1048SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1048sample
    FeaturePrefsStore.batch1041.v1048sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1049: return mode
internal fun PlayerActivity.showV1049ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1049return
    FeaturePrefsStore.batch1041.v1049return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1049: reverse mode
internal fun PlayerActivity.showV1049ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1049reverse
    FeaturePrefsStore.batch1041.v1049reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1049: revert mode
internal fun PlayerActivity.showV1049RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1049revert
    FeaturePrefsStore.batch1041.v1049revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1049: right mode
internal fun PlayerActivity.showV1049RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1049right
    FeaturePrefsStore.batch1041.v1049right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1049: role mode
internal fun PlayerActivity.showV1049RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1049role
    FeaturePrefsStore.batch1041.v1049role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1049: root level
internal fun PlayerActivity.showV1049RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049root = value
        AppToast.show(this, "root: $value")
    }
}

// v1049: rotate level
internal fun PlayerActivity.showV1049RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1049: round level
internal fun PlayerActivity.showV1049RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049round = value
        AppToast.show(this, "round: $value")
    }
}

// v1049: route level
internal fun PlayerActivity.showV1049RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049route = value
        AppToast.show(this, "route: $value")
    }
}

// v1049: row level
internal fun PlayerActivity.showV1049RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1049row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1049row = value
        AppToast.show(this, "row: $value")
    }
}

// v1049: rule mode
internal fun PlayerActivity.showV1049RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1049rule
    FeaturePrefsStore.batch1041.v1049rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1049: run mode
internal fun PlayerActivity.showV1049RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1049run
    FeaturePrefsStore.batch1041.v1049run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1049: runtime mode
internal fun PlayerActivity.showV1049RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1049runtime
    FeaturePrefsStore.batch1041.v1049runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1049: safe mode
internal fun PlayerActivity.showV1049SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1049safe
    FeaturePrefsStore.batch1041.v1049safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1049: sample mode
internal fun PlayerActivity.showV1049SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1049sample
    FeaturePrefsStore.batch1041.v1049sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

// v1050: return mode
internal fun PlayerActivity.showV1050ReturnToggle() {
    val current = FeaturePrefsStore.batch1041.v1050return
    FeaturePrefsStore.batch1041.v1050return = !current
    AppToast.show(this, "return: ${if (!current) "ON" else "OFF"}")
}

// v1050: reverse mode
internal fun PlayerActivity.showV1050ReverseToggle() {
    val current = FeaturePrefsStore.batch1041.v1050reverse
    FeaturePrefsStore.batch1041.v1050reverse = !current
    AppToast.show(this, "reverse: ${if (!current) "ON" else "OFF"}")
}

// v1050: revert mode
internal fun PlayerActivity.showV1050RevertToggle() {
    val current = FeaturePrefsStore.batch1041.v1050revert
    FeaturePrefsStore.batch1041.v1050revert = !current
    AppToast.show(this, "revert: ${if (!current) "ON" else "OFF"}")
}

// v1050: right mode
internal fun PlayerActivity.showV1050RightToggle() {
    val current = FeaturePrefsStore.batch1041.v1050right
    FeaturePrefsStore.batch1041.v1050right = !current
    AppToast.show(this, "right: ${if (!current) "ON" else "OFF"}")
}

// v1050: role mode
internal fun PlayerActivity.showV1050RoleToggle() {
    val current = FeaturePrefsStore.batch1041.v1050role
    FeaturePrefsStore.batch1041.v1050role = !current
    AppToast.show(this, "role: ${if (!current) "ON" else "OFF"}")
}

// v1050: root level
internal fun PlayerActivity.showV1050RootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050root).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "root level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050root = value
        AppToast.show(this, "root: $value")
    }
}

// v1050: rotate level
internal fun PlayerActivity.showV1050RotateDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050rotate).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "rotate level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050rotate = value
        AppToast.show(this, "rotate: $value")
    }
}

// v1050: round level
internal fun PlayerActivity.showV1050RoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050round).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "round level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050round = value
        AppToast.show(this, "round: $value")
    }
}

// v1050: route level
internal fun PlayerActivity.showV1050RouteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050route).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "route level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050route = value
        AppToast.show(this, "route: $value")
    }
}

// v1050: row level
internal fun PlayerActivity.showV1050RowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1041.v1050row).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "row level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1041.v1050row = value
        AppToast.show(this, "row: $value")
    }
}

// v1050: rule mode
internal fun PlayerActivity.showV1050RuleToggle() {
    val current = FeaturePrefsStore.batch1041.v1050rule
    FeaturePrefsStore.batch1041.v1050rule = !current
    AppToast.show(this, "rule: ${if (!current) "ON" else "OFF"}")
}

// v1050: run mode
internal fun PlayerActivity.showV1050RunToggle() {
    val current = FeaturePrefsStore.batch1041.v1050run
    FeaturePrefsStore.batch1041.v1050run = !current
    AppToast.show(this, "run: ${if (!current) "ON" else "OFF"}")
}

// v1050: runtime mode
internal fun PlayerActivity.showV1050RuntimeToggle() {
    val current = FeaturePrefsStore.batch1041.v1050runtime
    FeaturePrefsStore.batch1041.v1050runtime = !current
    AppToast.show(this, "runtime: ${if (!current) "ON" else "OFF"}")
}

// v1050: safe mode
internal fun PlayerActivity.showV1050SafeToggle() {
    val current = FeaturePrefsStore.batch1041.v1050safe
    FeaturePrefsStore.batch1041.v1050safe = !current
    AppToast.show(this, "safe: ${if (!current) "ON" else "OFF"}")
}

// v1050: sample mode
internal fun PlayerActivity.showV1050SampleToggle() {
    val current = FeaturePrefsStore.batch1041.v1050sample
    FeaturePrefsStore.batch1041.v1050sample = !current
    AppToast.show(this, "sample: ${if (!current) "ON" else "OFF"}")
}

