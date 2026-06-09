package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1271: bomb mode
internal fun PlayerActivity.showV1271BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bomb
    FeaturePrefsStore.batch1271.v1271bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1271: bond mode
internal fun PlayerActivity.showV1271BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bond
    FeaturePrefsStore.batch1271.v1271bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1271: bone mode
internal fun PlayerActivity.showV1271BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bone
    FeaturePrefsStore.batch1271.v1271bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1271: book mode
internal fun PlayerActivity.showV1271BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1271book
    FeaturePrefsStore.batch1271.v1271book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1271: boom mode
internal fun PlayerActivity.showV1271BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1271boom
    FeaturePrefsStore.batch1271.v1271boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1271: boot level
internal fun PlayerActivity.showV1271BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1271: born level
internal fun PlayerActivity.showV1271BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271born = value
        AppToast.show(this, "born: $value")
    }
}

// v1271: boss level
internal fun PlayerActivity.showV1271BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1271: both level
internal fun PlayerActivity.showV1271BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271both = value
        AppToast.show(this, "both: $value")
    }
}

// v1271: bound level
internal fun PlayerActivity.showV1271BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1271bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1271bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1271: bowl mode
internal fun PlayerActivity.showV1271BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1271bowl
    FeaturePrefsStore.batch1271.v1271bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1271: brain mode
internal fun PlayerActivity.showV1271BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brain
    FeaturePrefsStore.batch1271.v1271brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1271: brake mode
internal fun PlayerActivity.showV1271BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brake
    FeaturePrefsStore.batch1271.v1271brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1271: brass mode
internal fun PlayerActivity.showV1271BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brass
    FeaturePrefsStore.batch1271.v1271brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1271: brave mode
internal fun PlayerActivity.showV1271BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1271brave
    FeaturePrefsStore.batch1271.v1271brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1272: bomb mode
internal fun PlayerActivity.showV1272BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bomb
    FeaturePrefsStore.batch1271.v1272bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1272: bond mode
internal fun PlayerActivity.showV1272BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bond
    FeaturePrefsStore.batch1271.v1272bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1272: bone mode
internal fun PlayerActivity.showV1272BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bone
    FeaturePrefsStore.batch1271.v1272bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1272: book mode
internal fun PlayerActivity.showV1272BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1272book
    FeaturePrefsStore.batch1271.v1272book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1272: boom mode
internal fun PlayerActivity.showV1272BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1272boom
    FeaturePrefsStore.batch1271.v1272boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1272: boot level
internal fun PlayerActivity.showV1272BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1272: born level
internal fun PlayerActivity.showV1272BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272born = value
        AppToast.show(this, "born: $value")
    }
}

// v1272: boss level
internal fun PlayerActivity.showV1272BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1272: both level
internal fun PlayerActivity.showV1272BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272both = value
        AppToast.show(this, "both: $value")
    }
}

// v1272: bound level
internal fun PlayerActivity.showV1272BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1272bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1272bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1272: bowl mode
internal fun PlayerActivity.showV1272BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1272bowl
    FeaturePrefsStore.batch1271.v1272bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1272: brain mode
internal fun PlayerActivity.showV1272BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brain
    FeaturePrefsStore.batch1271.v1272brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1272: brake mode
internal fun PlayerActivity.showV1272BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brake
    FeaturePrefsStore.batch1271.v1272brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1272: brass mode
internal fun PlayerActivity.showV1272BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brass
    FeaturePrefsStore.batch1271.v1272brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1272: brave mode
internal fun PlayerActivity.showV1272BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1272brave
    FeaturePrefsStore.batch1271.v1272brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1273: bomb mode
internal fun PlayerActivity.showV1273BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bomb
    FeaturePrefsStore.batch1271.v1273bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1273: bond mode
internal fun PlayerActivity.showV1273BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bond
    FeaturePrefsStore.batch1271.v1273bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1273: bone mode
internal fun PlayerActivity.showV1273BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bone
    FeaturePrefsStore.batch1271.v1273bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1273: book mode
internal fun PlayerActivity.showV1273BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1273book
    FeaturePrefsStore.batch1271.v1273book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1273: boom mode
internal fun PlayerActivity.showV1273BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1273boom
    FeaturePrefsStore.batch1271.v1273boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1273: boot level
internal fun PlayerActivity.showV1273BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1273: born level
internal fun PlayerActivity.showV1273BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273born = value
        AppToast.show(this, "born: $value")
    }
}

// v1273: boss level
internal fun PlayerActivity.showV1273BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1273: both level
internal fun PlayerActivity.showV1273BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273both = value
        AppToast.show(this, "both: $value")
    }
}

// v1273: bound level
internal fun PlayerActivity.showV1273BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1273bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1273bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1273: bowl mode
internal fun PlayerActivity.showV1273BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1273bowl
    FeaturePrefsStore.batch1271.v1273bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1273: brain mode
internal fun PlayerActivity.showV1273BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brain
    FeaturePrefsStore.batch1271.v1273brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1273: brake mode
internal fun PlayerActivity.showV1273BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brake
    FeaturePrefsStore.batch1271.v1273brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1273: brass mode
internal fun PlayerActivity.showV1273BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brass
    FeaturePrefsStore.batch1271.v1273brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1273: brave mode
internal fun PlayerActivity.showV1273BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1273brave
    FeaturePrefsStore.batch1271.v1273brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1274: bomb mode
internal fun PlayerActivity.showV1274BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bomb
    FeaturePrefsStore.batch1271.v1274bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1274: bond mode
internal fun PlayerActivity.showV1274BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bond
    FeaturePrefsStore.batch1271.v1274bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1274: bone mode
internal fun PlayerActivity.showV1274BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bone
    FeaturePrefsStore.batch1271.v1274bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1274: book mode
internal fun PlayerActivity.showV1274BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1274book
    FeaturePrefsStore.batch1271.v1274book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1274: boom mode
internal fun PlayerActivity.showV1274BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1274boom
    FeaturePrefsStore.batch1271.v1274boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1274: boot level
internal fun PlayerActivity.showV1274BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1274: born level
internal fun PlayerActivity.showV1274BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274born = value
        AppToast.show(this, "born: $value")
    }
}

// v1274: boss level
internal fun PlayerActivity.showV1274BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1274: both level
internal fun PlayerActivity.showV1274BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274both = value
        AppToast.show(this, "both: $value")
    }
}

// v1274: bound level
internal fun PlayerActivity.showV1274BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1274bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1274bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1274: bowl mode
internal fun PlayerActivity.showV1274BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1274bowl
    FeaturePrefsStore.batch1271.v1274bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1274: brain mode
internal fun PlayerActivity.showV1274BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brain
    FeaturePrefsStore.batch1271.v1274brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1274: brake mode
internal fun PlayerActivity.showV1274BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brake
    FeaturePrefsStore.batch1271.v1274brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1274: brass mode
internal fun PlayerActivity.showV1274BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brass
    FeaturePrefsStore.batch1271.v1274brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1274: brave mode
internal fun PlayerActivity.showV1274BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1274brave
    FeaturePrefsStore.batch1271.v1274brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1275: bomb mode
internal fun PlayerActivity.showV1275BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bomb
    FeaturePrefsStore.batch1271.v1275bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1275: bond mode
internal fun PlayerActivity.showV1275BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bond
    FeaturePrefsStore.batch1271.v1275bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1275: bone mode
internal fun PlayerActivity.showV1275BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bone
    FeaturePrefsStore.batch1271.v1275bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1275: book mode
internal fun PlayerActivity.showV1275BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1275book
    FeaturePrefsStore.batch1271.v1275book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1275: boom mode
internal fun PlayerActivity.showV1275BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1275boom
    FeaturePrefsStore.batch1271.v1275boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1275: boot level
internal fun PlayerActivity.showV1275BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1275: born level
internal fun PlayerActivity.showV1275BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275born = value
        AppToast.show(this, "born: $value")
    }
}

// v1275: boss level
internal fun PlayerActivity.showV1275BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1275: both level
internal fun PlayerActivity.showV1275BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275both = value
        AppToast.show(this, "both: $value")
    }
}

// v1275: bound level
internal fun PlayerActivity.showV1275BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1275bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1275bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1275: bowl mode
internal fun PlayerActivity.showV1275BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1275bowl
    FeaturePrefsStore.batch1271.v1275bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1275: brain mode
internal fun PlayerActivity.showV1275BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brain
    FeaturePrefsStore.batch1271.v1275brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1275: brake mode
internal fun PlayerActivity.showV1275BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brake
    FeaturePrefsStore.batch1271.v1275brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1275: brass mode
internal fun PlayerActivity.showV1275BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brass
    FeaturePrefsStore.batch1271.v1275brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1275: brave mode
internal fun PlayerActivity.showV1275BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1275brave
    FeaturePrefsStore.batch1271.v1275brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1276: bomb mode
internal fun PlayerActivity.showV1276BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bomb
    FeaturePrefsStore.batch1271.v1276bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1276: bond mode
internal fun PlayerActivity.showV1276BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bond
    FeaturePrefsStore.batch1271.v1276bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1276: bone mode
internal fun PlayerActivity.showV1276BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bone
    FeaturePrefsStore.batch1271.v1276bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1276: book mode
internal fun PlayerActivity.showV1276BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1276book
    FeaturePrefsStore.batch1271.v1276book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1276: boom mode
internal fun PlayerActivity.showV1276BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1276boom
    FeaturePrefsStore.batch1271.v1276boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1276: boot level
internal fun PlayerActivity.showV1276BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1276: born level
internal fun PlayerActivity.showV1276BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276born = value
        AppToast.show(this, "born: $value")
    }
}

// v1276: boss level
internal fun PlayerActivity.showV1276BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1276: both level
internal fun PlayerActivity.showV1276BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276both = value
        AppToast.show(this, "both: $value")
    }
}

// v1276: bound level
internal fun PlayerActivity.showV1276BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1276bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1276bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1276: bowl mode
internal fun PlayerActivity.showV1276BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1276bowl
    FeaturePrefsStore.batch1271.v1276bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1276: brain mode
internal fun PlayerActivity.showV1276BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brain
    FeaturePrefsStore.batch1271.v1276brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1276: brake mode
internal fun PlayerActivity.showV1276BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brake
    FeaturePrefsStore.batch1271.v1276brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1276: brass mode
internal fun PlayerActivity.showV1276BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brass
    FeaturePrefsStore.batch1271.v1276brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1276: brave mode
internal fun PlayerActivity.showV1276BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1276brave
    FeaturePrefsStore.batch1271.v1276brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1277: bomb mode
internal fun PlayerActivity.showV1277BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bomb
    FeaturePrefsStore.batch1271.v1277bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1277: bond mode
internal fun PlayerActivity.showV1277BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bond
    FeaturePrefsStore.batch1271.v1277bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1277: bone mode
internal fun PlayerActivity.showV1277BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bone
    FeaturePrefsStore.batch1271.v1277bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1277: book mode
internal fun PlayerActivity.showV1277BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1277book
    FeaturePrefsStore.batch1271.v1277book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1277: boom mode
internal fun PlayerActivity.showV1277BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1277boom
    FeaturePrefsStore.batch1271.v1277boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1277: boot level
internal fun PlayerActivity.showV1277BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1277: born level
internal fun PlayerActivity.showV1277BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277born = value
        AppToast.show(this, "born: $value")
    }
}

// v1277: boss level
internal fun PlayerActivity.showV1277BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1277: both level
internal fun PlayerActivity.showV1277BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277both = value
        AppToast.show(this, "both: $value")
    }
}

// v1277: bound level
internal fun PlayerActivity.showV1277BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1277bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1277bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1277: bowl mode
internal fun PlayerActivity.showV1277BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1277bowl
    FeaturePrefsStore.batch1271.v1277bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1277: brain mode
internal fun PlayerActivity.showV1277BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brain
    FeaturePrefsStore.batch1271.v1277brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1277: brake mode
internal fun PlayerActivity.showV1277BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brake
    FeaturePrefsStore.batch1271.v1277brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1277: brass mode
internal fun PlayerActivity.showV1277BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brass
    FeaturePrefsStore.batch1271.v1277brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1277: brave mode
internal fun PlayerActivity.showV1277BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1277brave
    FeaturePrefsStore.batch1271.v1277brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1278: bomb mode
internal fun PlayerActivity.showV1278BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bomb
    FeaturePrefsStore.batch1271.v1278bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1278: bond mode
internal fun PlayerActivity.showV1278BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bond
    FeaturePrefsStore.batch1271.v1278bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1278: bone mode
internal fun PlayerActivity.showV1278BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bone
    FeaturePrefsStore.batch1271.v1278bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1278: book mode
internal fun PlayerActivity.showV1278BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1278book
    FeaturePrefsStore.batch1271.v1278book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1278: boom mode
internal fun PlayerActivity.showV1278BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1278boom
    FeaturePrefsStore.batch1271.v1278boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1278: boot level
internal fun PlayerActivity.showV1278BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1278: born level
internal fun PlayerActivity.showV1278BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278born = value
        AppToast.show(this, "born: $value")
    }
}

// v1278: boss level
internal fun PlayerActivity.showV1278BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1278: both level
internal fun PlayerActivity.showV1278BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278both = value
        AppToast.show(this, "both: $value")
    }
}

// v1278: bound level
internal fun PlayerActivity.showV1278BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1278bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1278bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1278: bowl mode
internal fun PlayerActivity.showV1278BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1278bowl
    FeaturePrefsStore.batch1271.v1278bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1278: brain mode
internal fun PlayerActivity.showV1278BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brain
    FeaturePrefsStore.batch1271.v1278brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1278: brake mode
internal fun PlayerActivity.showV1278BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brake
    FeaturePrefsStore.batch1271.v1278brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1278: brass mode
internal fun PlayerActivity.showV1278BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brass
    FeaturePrefsStore.batch1271.v1278brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1278: brave mode
internal fun PlayerActivity.showV1278BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1278brave
    FeaturePrefsStore.batch1271.v1278brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1279: bomb mode
internal fun PlayerActivity.showV1279BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bomb
    FeaturePrefsStore.batch1271.v1279bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1279: bond mode
internal fun PlayerActivity.showV1279BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bond
    FeaturePrefsStore.batch1271.v1279bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1279: bone mode
internal fun PlayerActivity.showV1279BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bone
    FeaturePrefsStore.batch1271.v1279bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1279: book mode
internal fun PlayerActivity.showV1279BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1279book
    FeaturePrefsStore.batch1271.v1279book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1279: boom mode
internal fun PlayerActivity.showV1279BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1279boom
    FeaturePrefsStore.batch1271.v1279boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1279: boot level
internal fun PlayerActivity.showV1279BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1279: born level
internal fun PlayerActivity.showV1279BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279born = value
        AppToast.show(this, "born: $value")
    }
}

// v1279: boss level
internal fun PlayerActivity.showV1279BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1279: both level
internal fun PlayerActivity.showV1279BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279both = value
        AppToast.show(this, "both: $value")
    }
}

// v1279: bound level
internal fun PlayerActivity.showV1279BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1279bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1279bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1279: bowl mode
internal fun PlayerActivity.showV1279BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1279bowl
    FeaturePrefsStore.batch1271.v1279bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1279: brain mode
internal fun PlayerActivity.showV1279BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brain
    FeaturePrefsStore.batch1271.v1279brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1279: brake mode
internal fun PlayerActivity.showV1279BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brake
    FeaturePrefsStore.batch1271.v1279brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1279: brass mode
internal fun PlayerActivity.showV1279BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brass
    FeaturePrefsStore.batch1271.v1279brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1279: brave mode
internal fun PlayerActivity.showV1279BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1279brave
    FeaturePrefsStore.batch1271.v1279brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

// v1280: bomb mode
internal fun PlayerActivity.showV1280BombToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bomb
    FeaturePrefsStore.batch1271.v1280bomb = !current
    AppToast.show(this, "bomb: ${if (!current) "ON" else "OFF"}")
}

// v1280: bond mode
internal fun PlayerActivity.showV1280BondToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bond
    FeaturePrefsStore.batch1271.v1280bond = !current
    AppToast.show(this, "bond: ${if (!current) "ON" else "OFF"}")
}

// v1280: bone mode
internal fun PlayerActivity.showV1280BoneToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bone
    FeaturePrefsStore.batch1271.v1280bone = !current
    AppToast.show(this, "bone: ${if (!current) "ON" else "OFF"}")
}

// v1280: book mode
internal fun PlayerActivity.showV1280BookToggle() {
    val current = FeaturePrefsStore.batch1271.v1280book
    FeaturePrefsStore.batch1271.v1280book = !current
    AppToast.show(this, "book: ${if (!current) "ON" else "OFF"}")
}

// v1280: boom mode
internal fun PlayerActivity.showV1280BoomToggle() {
    val current = FeaturePrefsStore.batch1271.v1280boom
    FeaturePrefsStore.batch1271.v1280boom = !current
    AppToast.show(this, "boom: ${if (!current) "ON" else "OFF"}")
}

// v1280: boot level
internal fun PlayerActivity.showV1280BootDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280boot).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boot level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280boot = value
        AppToast.show(this, "boot: $value")
    }
}

// v1280: born level
internal fun PlayerActivity.showV1280BornDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280born).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "born level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280born = value
        AppToast.show(this, "born: $value")
    }
}

// v1280: boss level
internal fun PlayerActivity.showV1280BossDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280boss).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "boss level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280boss = value
        AppToast.show(this, "boss: $value")
    }
}

// v1280: both level
internal fun PlayerActivity.showV1280BothDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280both).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "both level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280both = value
        AppToast.show(this, "both: $value")
    }
}

// v1280: bound level
internal fun PlayerActivity.showV1280BoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1271.v1280bound).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bound level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1271.v1280bound = value
        AppToast.show(this, "bound: $value")
    }
}

// v1280: bowl mode
internal fun PlayerActivity.showV1280BowlToggle() {
    val current = FeaturePrefsStore.batch1271.v1280bowl
    FeaturePrefsStore.batch1271.v1280bowl = !current
    AppToast.show(this, "bowl: ${if (!current) "ON" else "OFF"}")
}

// v1280: brain mode
internal fun PlayerActivity.showV1280BrainToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brain
    FeaturePrefsStore.batch1271.v1280brain = !current
    AppToast.show(this, "brain: ${if (!current) "ON" else "OFF"}")
}

// v1280: brake mode
internal fun PlayerActivity.showV1280BrakeToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brake
    FeaturePrefsStore.batch1271.v1280brake = !current
    AppToast.show(this, "brake: ${if (!current) "ON" else "OFF"}")
}

// v1280: brass mode
internal fun PlayerActivity.showV1280BrassToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brass
    FeaturePrefsStore.batch1271.v1280brass = !current
    AppToast.show(this, "brass: ${if (!current) "ON" else "OFF"}")
}

// v1280: brave mode
internal fun PlayerActivity.showV1280BraveToggle() {
    val current = FeaturePrefsStore.batch1271.v1280brave
    FeaturePrefsStore.batch1271.v1280brave = !current
    AppToast.show(this, "brave: ${if (!current) "ON" else "OFF"}")
}

