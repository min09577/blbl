package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v931: min mode
internal fun PlayerActivity.showV931MinToggle() {
    val current = FeaturePrefsStore.batch931.v931min
    FeaturePrefsStore.batch931.v931min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v931: mode mode
internal fun PlayerActivity.showV931ModeToggle() {
    val current = FeaturePrefsStore.batch931.v931mode
    FeaturePrefsStore.batch931.v931mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v931: model mode
internal fun PlayerActivity.showV931ModelToggle() {
    val current = FeaturePrefsStore.batch931.v931model
    FeaturePrefsStore.batch931.v931model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v931: modify mode
internal fun PlayerActivity.showV931ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v931modify
    FeaturePrefsStore.batch931.v931modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v931: module mode
internal fun PlayerActivity.showV931ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v931module
    FeaturePrefsStore.batch931.v931module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v931: moment level
internal fun PlayerActivity.showV931MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v931moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v931moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v931: monitor level
internal fun PlayerActivity.showV931MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v931monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v931monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v931: motion level
internal fun PlayerActivity.showV931MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v931motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v931motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v931: mount level
internal fun PlayerActivity.showV931MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v931mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v931mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v931: mouse level
internal fun PlayerActivity.showV931MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v931mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v931mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v931: move mode
internal fun PlayerActivity.showV931MoveToggle() {
    val current = FeaturePrefsStore.batch931.v931move
    FeaturePrefsStore.batch931.v931move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v931: multi mode
internal fun PlayerActivity.showV931MultiToggle() {
    val current = FeaturePrefsStore.batch931.v931multi
    FeaturePrefsStore.batch931.v931multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v931: name mode
internal fun PlayerActivity.showV931NameToggle() {
    val current = FeaturePrefsStore.batch931.v931name
    FeaturePrefsStore.batch931.v931name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v931: native mode
internal fun PlayerActivity.showV931NativeToggle() {
    val current = FeaturePrefsStore.batch931.v931native
    FeaturePrefsStore.batch931.v931native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v931: navigate mode
internal fun PlayerActivity.showV931NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v931navigate
    FeaturePrefsStore.batch931.v931navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v932: min mode
internal fun PlayerActivity.showV932MinToggle() {
    val current = FeaturePrefsStore.batch931.v932min
    FeaturePrefsStore.batch931.v932min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v932: mode mode
internal fun PlayerActivity.showV932ModeToggle() {
    val current = FeaturePrefsStore.batch931.v932mode
    FeaturePrefsStore.batch931.v932mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v932: model mode
internal fun PlayerActivity.showV932ModelToggle() {
    val current = FeaturePrefsStore.batch931.v932model
    FeaturePrefsStore.batch931.v932model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v932: modify mode
internal fun PlayerActivity.showV932ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v932modify
    FeaturePrefsStore.batch931.v932modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v932: module mode
internal fun PlayerActivity.showV932ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v932module
    FeaturePrefsStore.batch931.v932module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v932: moment level
internal fun PlayerActivity.showV932MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v932moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v932moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v932: monitor level
internal fun PlayerActivity.showV932MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v932monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v932monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v932: motion level
internal fun PlayerActivity.showV932MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v932motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v932motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v932: mount level
internal fun PlayerActivity.showV932MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v932mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v932mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v932: mouse level
internal fun PlayerActivity.showV932MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v932mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v932mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v932: move mode
internal fun PlayerActivity.showV932MoveToggle() {
    val current = FeaturePrefsStore.batch931.v932move
    FeaturePrefsStore.batch931.v932move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v932: multi mode
internal fun PlayerActivity.showV932MultiToggle() {
    val current = FeaturePrefsStore.batch931.v932multi
    FeaturePrefsStore.batch931.v932multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v932: name mode
internal fun PlayerActivity.showV932NameToggle() {
    val current = FeaturePrefsStore.batch931.v932name
    FeaturePrefsStore.batch931.v932name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v932: native mode
internal fun PlayerActivity.showV932NativeToggle() {
    val current = FeaturePrefsStore.batch931.v932native
    FeaturePrefsStore.batch931.v932native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v932: navigate mode
internal fun PlayerActivity.showV932NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v932navigate
    FeaturePrefsStore.batch931.v932navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v933: min mode
internal fun PlayerActivity.showV933MinToggle() {
    val current = FeaturePrefsStore.batch931.v933min
    FeaturePrefsStore.batch931.v933min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v933: mode mode
internal fun PlayerActivity.showV933ModeToggle() {
    val current = FeaturePrefsStore.batch931.v933mode
    FeaturePrefsStore.batch931.v933mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v933: model mode
internal fun PlayerActivity.showV933ModelToggle() {
    val current = FeaturePrefsStore.batch931.v933model
    FeaturePrefsStore.batch931.v933model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v933: modify mode
internal fun PlayerActivity.showV933ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v933modify
    FeaturePrefsStore.batch931.v933modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v933: module mode
internal fun PlayerActivity.showV933ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v933module
    FeaturePrefsStore.batch931.v933module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v933: moment level
internal fun PlayerActivity.showV933MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v933moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v933moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v933: monitor level
internal fun PlayerActivity.showV933MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v933monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v933monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v933: motion level
internal fun PlayerActivity.showV933MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v933motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v933motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v933: mount level
internal fun PlayerActivity.showV933MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v933mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v933mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v933: mouse level
internal fun PlayerActivity.showV933MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v933mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v933mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v933: move mode
internal fun PlayerActivity.showV933MoveToggle() {
    val current = FeaturePrefsStore.batch931.v933move
    FeaturePrefsStore.batch931.v933move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v933: multi mode
internal fun PlayerActivity.showV933MultiToggle() {
    val current = FeaturePrefsStore.batch931.v933multi
    FeaturePrefsStore.batch931.v933multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v933: name mode
internal fun PlayerActivity.showV933NameToggle() {
    val current = FeaturePrefsStore.batch931.v933name
    FeaturePrefsStore.batch931.v933name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v933: native mode
internal fun PlayerActivity.showV933NativeToggle() {
    val current = FeaturePrefsStore.batch931.v933native
    FeaturePrefsStore.batch931.v933native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v933: navigate mode
internal fun PlayerActivity.showV933NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v933navigate
    FeaturePrefsStore.batch931.v933navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v934: min mode
internal fun PlayerActivity.showV934MinToggle() {
    val current = FeaturePrefsStore.batch931.v934min
    FeaturePrefsStore.batch931.v934min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v934: mode mode
internal fun PlayerActivity.showV934ModeToggle() {
    val current = FeaturePrefsStore.batch931.v934mode
    FeaturePrefsStore.batch931.v934mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v934: model mode
internal fun PlayerActivity.showV934ModelToggle() {
    val current = FeaturePrefsStore.batch931.v934model
    FeaturePrefsStore.batch931.v934model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v934: modify mode
internal fun PlayerActivity.showV934ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v934modify
    FeaturePrefsStore.batch931.v934modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v934: module mode
internal fun PlayerActivity.showV934ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v934module
    FeaturePrefsStore.batch931.v934module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v934: moment level
internal fun PlayerActivity.showV934MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v934moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v934moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v934: monitor level
internal fun PlayerActivity.showV934MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v934monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v934monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v934: motion level
internal fun PlayerActivity.showV934MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v934motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v934motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v934: mount level
internal fun PlayerActivity.showV934MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v934mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v934mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v934: mouse level
internal fun PlayerActivity.showV934MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v934mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v934mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v934: move mode
internal fun PlayerActivity.showV934MoveToggle() {
    val current = FeaturePrefsStore.batch931.v934move
    FeaturePrefsStore.batch931.v934move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v934: multi mode
internal fun PlayerActivity.showV934MultiToggle() {
    val current = FeaturePrefsStore.batch931.v934multi
    FeaturePrefsStore.batch931.v934multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v934: name mode
internal fun PlayerActivity.showV934NameToggle() {
    val current = FeaturePrefsStore.batch931.v934name
    FeaturePrefsStore.batch931.v934name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v934: native mode
internal fun PlayerActivity.showV934NativeToggle() {
    val current = FeaturePrefsStore.batch931.v934native
    FeaturePrefsStore.batch931.v934native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v934: navigate mode
internal fun PlayerActivity.showV934NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v934navigate
    FeaturePrefsStore.batch931.v934navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v935: min mode
internal fun PlayerActivity.showV935MinToggle() {
    val current = FeaturePrefsStore.batch931.v935min
    FeaturePrefsStore.batch931.v935min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v935: mode mode
internal fun PlayerActivity.showV935ModeToggle() {
    val current = FeaturePrefsStore.batch931.v935mode
    FeaturePrefsStore.batch931.v935mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v935: model mode
internal fun PlayerActivity.showV935ModelToggle() {
    val current = FeaturePrefsStore.batch931.v935model
    FeaturePrefsStore.batch931.v935model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v935: modify mode
internal fun PlayerActivity.showV935ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v935modify
    FeaturePrefsStore.batch931.v935modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v935: module mode
internal fun PlayerActivity.showV935ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v935module
    FeaturePrefsStore.batch931.v935module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v935: moment level
internal fun PlayerActivity.showV935MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v935moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v935moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v935: monitor level
internal fun PlayerActivity.showV935MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v935monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v935monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v935: motion level
internal fun PlayerActivity.showV935MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v935motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v935motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v935: mount level
internal fun PlayerActivity.showV935MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v935mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v935mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v935: mouse level
internal fun PlayerActivity.showV935MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v935mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v935mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v935: move mode
internal fun PlayerActivity.showV935MoveToggle() {
    val current = FeaturePrefsStore.batch931.v935move
    FeaturePrefsStore.batch931.v935move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v935: multi mode
internal fun PlayerActivity.showV935MultiToggle() {
    val current = FeaturePrefsStore.batch931.v935multi
    FeaturePrefsStore.batch931.v935multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v935: name mode
internal fun PlayerActivity.showV935NameToggle() {
    val current = FeaturePrefsStore.batch931.v935name
    FeaturePrefsStore.batch931.v935name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v935: native mode
internal fun PlayerActivity.showV935NativeToggle() {
    val current = FeaturePrefsStore.batch931.v935native
    FeaturePrefsStore.batch931.v935native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v935: navigate mode
internal fun PlayerActivity.showV935NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v935navigate
    FeaturePrefsStore.batch931.v935navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v936: min mode
internal fun PlayerActivity.showV936MinToggle() {
    val current = FeaturePrefsStore.batch931.v936min
    FeaturePrefsStore.batch931.v936min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v936: mode mode
internal fun PlayerActivity.showV936ModeToggle() {
    val current = FeaturePrefsStore.batch931.v936mode
    FeaturePrefsStore.batch931.v936mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v936: model mode
internal fun PlayerActivity.showV936ModelToggle() {
    val current = FeaturePrefsStore.batch931.v936model
    FeaturePrefsStore.batch931.v936model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v936: modify mode
internal fun PlayerActivity.showV936ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v936modify
    FeaturePrefsStore.batch931.v936modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v936: module mode
internal fun PlayerActivity.showV936ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v936module
    FeaturePrefsStore.batch931.v936module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v936: moment level
internal fun PlayerActivity.showV936MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v936moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v936moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v936: monitor level
internal fun PlayerActivity.showV936MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v936monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v936monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v936: motion level
internal fun PlayerActivity.showV936MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v936motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v936motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v936: mount level
internal fun PlayerActivity.showV936MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v936mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v936mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v936: mouse level
internal fun PlayerActivity.showV936MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v936mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v936mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v936: move mode
internal fun PlayerActivity.showV936MoveToggle() {
    val current = FeaturePrefsStore.batch931.v936move
    FeaturePrefsStore.batch931.v936move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v936: multi mode
internal fun PlayerActivity.showV936MultiToggle() {
    val current = FeaturePrefsStore.batch931.v936multi
    FeaturePrefsStore.batch931.v936multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v936: name mode
internal fun PlayerActivity.showV936NameToggle() {
    val current = FeaturePrefsStore.batch931.v936name
    FeaturePrefsStore.batch931.v936name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v936: native mode
internal fun PlayerActivity.showV936NativeToggle() {
    val current = FeaturePrefsStore.batch931.v936native
    FeaturePrefsStore.batch931.v936native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v936: navigate mode
internal fun PlayerActivity.showV936NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v936navigate
    FeaturePrefsStore.batch931.v936navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v937: min mode
internal fun PlayerActivity.showV937MinToggle() {
    val current = FeaturePrefsStore.batch931.v937min
    FeaturePrefsStore.batch931.v937min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v937: mode mode
internal fun PlayerActivity.showV937ModeToggle() {
    val current = FeaturePrefsStore.batch931.v937mode
    FeaturePrefsStore.batch931.v937mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v937: model mode
internal fun PlayerActivity.showV937ModelToggle() {
    val current = FeaturePrefsStore.batch931.v937model
    FeaturePrefsStore.batch931.v937model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v937: modify mode
internal fun PlayerActivity.showV937ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v937modify
    FeaturePrefsStore.batch931.v937modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v937: module mode
internal fun PlayerActivity.showV937ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v937module
    FeaturePrefsStore.batch931.v937module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v937: moment level
internal fun PlayerActivity.showV937MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v937moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v937moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v937: monitor level
internal fun PlayerActivity.showV937MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v937monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v937monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v937: motion level
internal fun PlayerActivity.showV937MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v937motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v937motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v937: mount level
internal fun PlayerActivity.showV937MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v937mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v937mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v937: mouse level
internal fun PlayerActivity.showV937MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v937mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v937mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v937: move mode
internal fun PlayerActivity.showV937MoveToggle() {
    val current = FeaturePrefsStore.batch931.v937move
    FeaturePrefsStore.batch931.v937move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v937: multi mode
internal fun PlayerActivity.showV937MultiToggle() {
    val current = FeaturePrefsStore.batch931.v937multi
    FeaturePrefsStore.batch931.v937multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v937: name mode
internal fun PlayerActivity.showV937NameToggle() {
    val current = FeaturePrefsStore.batch931.v937name
    FeaturePrefsStore.batch931.v937name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v937: native mode
internal fun PlayerActivity.showV937NativeToggle() {
    val current = FeaturePrefsStore.batch931.v937native
    FeaturePrefsStore.batch931.v937native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v937: navigate mode
internal fun PlayerActivity.showV937NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v937navigate
    FeaturePrefsStore.batch931.v937navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v938: min mode
internal fun PlayerActivity.showV938MinToggle() {
    val current = FeaturePrefsStore.batch931.v938min
    FeaturePrefsStore.batch931.v938min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v938: mode mode
internal fun PlayerActivity.showV938ModeToggle() {
    val current = FeaturePrefsStore.batch931.v938mode
    FeaturePrefsStore.batch931.v938mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v938: model mode
internal fun PlayerActivity.showV938ModelToggle() {
    val current = FeaturePrefsStore.batch931.v938model
    FeaturePrefsStore.batch931.v938model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v938: modify mode
internal fun PlayerActivity.showV938ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v938modify
    FeaturePrefsStore.batch931.v938modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v938: module mode
internal fun PlayerActivity.showV938ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v938module
    FeaturePrefsStore.batch931.v938module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v938: moment level
internal fun PlayerActivity.showV938MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v938moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v938moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v938: monitor level
internal fun PlayerActivity.showV938MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v938monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v938monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v938: motion level
internal fun PlayerActivity.showV938MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v938motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v938motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v938: mount level
internal fun PlayerActivity.showV938MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v938mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v938mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v938: mouse level
internal fun PlayerActivity.showV938MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v938mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v938mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v938: move mode
internal fun PlayerActivity.showV938MoveToggle() {
    val current = FeaturePrefsStore.batch931.v938move
    FeaturePrefsStore.batch931.v938move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v938: multi mode
internal fun PlayerActivity.showV938MultiToggle() {
    val current = FeaturePrefsStore.batch931.v938multi
    FeaturePrefsStore.batch931.v938multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v938: name mode
internal fun PlayerActivity.showV938NameToggle() {
    val current = FeaturePrefsStore.batch931.v938name
    FeaturePrefsStore.batch931.v938name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v938: native mode
internal fun PlayerActivity.showV938NativeToggle() {
    val current = FeaturePrefsStore.batch931.v938native
    FeaturePrefsStore.batch931.v938native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v938: navigate mode
internal fun PlayerActivity.showV938NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v938navigate
    FeaturePrefsStore.batch931.v938navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v939: min mode
internal fun PlayerActivity.showV939MinToggle() {
    val current = FeaturePrefsStore.batch931.v939min
    FeaturePrefsStore.batch931.v939min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v939: mode mode
internal fun PlayerActivity.showV939ModeToggle() {
    val current = FeaturePrefsStore.batch931.v939mode
    FeaturePrefsStore.batch931.v939mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v939: model mode
internal fun PlayerActivity.showV939ModelToggle() {
    val current = FeaturePrefsStore.batch931.v939model
    FeaturePrefsStore.batch931.v939model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v939: modify mode
internal fun PlayerActivity.showV939ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v939modify
    FeaturePrefsStore.batch931.v939modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v939: module mode
internal fun PlayerActivity.showV939ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v939module
    FeaturePrefsStore.batch931.v939module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v939: moment level
internal fun PlayerActivity.showV939MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v939moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v939moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v939: monitor level
internal fun PlayerActivity.showV939MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v939monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v939monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v939: motion level
internal fun PlayerActivity.showV939MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v939motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v939motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v939: mount level
internal fun PlayerActivity.showV939MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v939mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v939mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v939: mouse level
internal fun PlayerActivity.showV939MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v939mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v939mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v939: move mode
internal fun PlayerActivity.showV939MoveToggle() {
    val current = FeaturePrefsStore.batch931.v939move
    FeaturePrefsStore.batch931.v939move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v939: multi mode
internal fun PlayerActivity.showV939MultiToggle() {
    val current = FeaturePrefsStore.batch931.v939multi
    FeaturePrefsStore.batch931.v939multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v939: name mode
internal fun PlayerActivity.showV939NameToggle() {
    val current = FeaturePrefsStore.batch931.v939name
    FeaturePrefsStore.batch931.v939name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v939: native mode
internal fun PlayerActivity.showV939NativeToggle() {
    val current = FeaturePrefsStore.batch931.v939native
    FeaturePrefsStore.batch931.v939native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v939: navigate mode
internal fun PlayerActivity.showV939NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v939navigate
    FeaturePrefsStore.batch931.v939navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

// v940: min mode
internal fun PlayerActivity.showV940MinToggle() {
    val current = FeaturePrefsStore.batch931.v940min
    FeaturePrefsStore.batch931.v940min = !current
    AppToast.show(this, "min: ${if (!current) "ON" else "OFF"}")
}

// v940: mode mode
internal fun PlayerActivity.showV940ModeToggle() {
    val current = FeaturePrefsStore.batch931.v940mode
    FeaturePrefsStore.batch931.v940mode = !current
    AppToast.show(this, "mode: ${if (!current) "ON" else "OFF"}")
}

// v940: model mode
internal fun PlayerActivity.showV940ModelToggle() {
    val current = FeaturePrefsStore.batch931.v940model
    FeaturePrefsStore.batch931.v940model = !current
    AppToast.show(this, "model: ${if (!current) "ON" else "OFF"}")
}

// v940: modify mode
internal fun PlayerActivity.showV940ModifyToggle() {
    val current = FeaturePrefsStore.batch931.v940modify
    FeaturePrefsStore.batch931.v940modify = !current
    AppToast.show(this, "modify: ${if (!current) "ON" else "OFF"}")
}

// v940: module mode
internal fun PlayerActivity.showV940ModuleToggle() {
    val current = FeaturePrefsStore.batch931.v940module
    FeaturePrefsStore.batch931.v940module = !current
    AppToast.show(this, "module: ${if (!current) "ON" else "OFF"}")
}

// v940: moment level
internal fun PlayerActivity.showV940MomentDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v940moment).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "moment level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v940moment = value
        AppToast.show(this, "moment: $value")
    }
}

// v940: monitor level
internal fun PlayerActivity.showV940MonitorDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v940monitor).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "monitor level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v940monitor = value
        AppToast.show(this, "monitor: $value")
    }
}

// v940: motion level
internal fun PlayerActivity.showV940MotionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v940motion).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "motion level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v940motion = value
        AppToast.show(this, "motion: $value")
    }
}

// v940: mount level
internal fun PlayerActivity.showV940MountDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v940mount).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mount level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v940mount = value
        AppToast.show(this, "mount: $value")
    }
}

// v940: mouse level
internal fun PlayerActivity.showV940MouseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch931.v940mouse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "mouse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch931.v940mouse = value
        AppToast.show(this, "mouse: $value")
    }
}

// v940: move mode
internal fun PlayerActivity.showV940MoveToggle() {
    val current = FeaturePrefsStore.batch931.v940move
    FeaturePrefsStore.batch931.v940move = !current
    AppToast.show(this, "move: ${if (!current) "ON" else "OFF"}")
}

// v940: multi mode
internal fun PlayerActivity.showV940MultiToggle() {
    val current = FeaturePrefsStore.batch931.v940multi
    FeaturePrefsStore.batch931.v940multi = !current
    AppToast.show(this, "multi: ${if (!current) "ON" else "OFF"}")
}

// v940: name mode
internal fun PlayerActivity.showV940NameToggle() {
    val current = FeaturePrefsStore.batch931.v940name
    FeaturePrefsStore.batch931.v940name = !current
    AppToast.show(this, "name: ${if (!current) "ON" else "OFF"}")
}

// v940: native mode
internal fun PlayerActivity.showV940NativeToggle() {
    val current = FeaturePrefsStore.batch931.v940native
    FeaturePrefsStore.batch931.v940native = !current
    AppToast.show(this, "native: ${if (!current) "ON" else "OFF"}")
}

// v940: navigate mode
internal fun PlayerActivity.showV940NavigateToggle() {
    val current = FeaturePrefsStore.batch931.v940navigate
    FeaturePrefsStore.batch931.v940navigate = !current
    AppToast.show(this, "navigate: ${if (!current) "ON" else "OFF"}")
}

