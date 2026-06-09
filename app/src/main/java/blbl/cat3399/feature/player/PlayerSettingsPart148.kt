package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1661: pepper mode
internal fun PlayerActivity.showV1661PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pepper
    FeaturePrefsStore.batch1661.v1661pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1661: perfect mode
internal fun PlayerActivity.showV1661PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1661perfect
    FeaturePrefsStore.batch1661.v1661perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1661: permit mode
internal fun PlayerActivity.showV1661PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1661permit
    FeaturePrefsStore.batch1661.v1661permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1661: person mode
internal fun PlayerActivity.showV1661PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1661person
    FeaturePrefsStore.batch1661.v1661person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1661: pet mode
internal fun PlayerActivity.showV1661PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pet
    FeaturePrefsStore.batch1661.v1661pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1661: physical level
internal fun PlayerActivity.showV1661PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1661: piano level
internal fun PlayerActivity.showV1661PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1661: picnic level
internal fun PlayerActivity.showV1661PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1661: piece level
internal fun PlayerActivity.showV1661PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1661: pig level
internal fun PlayerActivity.showV1661PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1661pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1661pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1661: pigeon mode
internal fun PlayerActivity.showV1661PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pigeon
    FeaturePrefsStore.batch1661.v1661pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1661: pill mode
internal fun PlayerActivity.showV1661PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pill
    FeaturePrefsStore.batch1661.v1661pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1661: pilot mode
internal fun PlayerActivity.showV1661PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pilot
    FeaturePrefsStore.batch1661.v1661pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1661: pink mode
internal fun PlayerActivity.showV1661PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pink
    FeaturePrefsStore.batch1661.v1661pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1661: pioneer mode
internal fun PlayerActivity.showV1661PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1661pioneer
    FeaturePrefsStore.batch1661.v1661pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1662: pepper mode
internal fun PlayerActivity.showV1662PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pepper
    FeaturePrefsStore.batch1661.v1662pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1662: perfect mode
internal fun PlayerActivity.showV1662PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1662perfect
    FeaturePrefsStore.batch1661.v1662perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1662: permit mode
internal fun PlayerActivity.showV1662PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1662permit
    FeaturePrefsStore.batch1661.v1662permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1662: person mode
internal fun PlayerActivity.showV1662PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1662person
    FeaturePrefsStore.batch1661.v1662person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1662: pet mode
internal fun PlayerActivity.showV1662PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pet
    FeaturePrefsStore.batch1661.v1662pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1662: physical level
internal fun PlayerActivity.showV1662PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1662: piano level
internal fun PlayerActivity.showV1662PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1662: picnic level
internal fun PlayerActivity.showV1662PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1662: piece level
internal fun PlayerActivity.showV1662PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1662: pig level
internal fun PlayerActivity.showV1662PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1662pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1662pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1662: pigeon mode
internal fun PlayerActivity.showV1662PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pigeon
    FeaturePrefsStore.batch1661.v1662pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1662: pill mode
internal fun PlayerActivity.showV1662PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pill
    FeaturePrefsStore.batch1661.v1662pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1662: pilot mode
internal fun PlayerActivity.showV1662PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pilot
    FeaturePrefsStore.batch1661.v1662pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1662: pink mode
internal fun PlayerActivity.showV1662PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pink
    FeaturePrefsStore.batch1661.v1662pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1662: pioneer mode
internal fun PlayerActivity.showV1662PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1662pioneer
    FeaturePrefsStore.batch1661.v1662pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1663: pepper mode
internal fun PlayerActivity.showV1663PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pepper
    FeaturePrefsStore.batch1661.v1663pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1663: perfect mode
internal fun PlayerActivity.showV1663PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1663perfect
    FeaturePrefsStore.batch1661.v1663perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1663: permit mode
internal fun PlayerActivity.showV1663PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1663permit
    FeaturePrefsStore.batch1661.v1663permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1663: person mode
internal fun PlayerActivity.showV1663PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1663person
    FeaturePrefsStore.batch1661.v1663person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1663: pet mode
internal fun PlayerActivity.showV1663PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pet
    FeaturePrefsStore.batch1661.v1663pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1663: physical level
internal fun PlayerActivity.showV1663PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1663: piano level
internal fun PlayerActivity.showV1663PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1663: picnic level
internal fun PlayerActivity.showV1663PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1663: piece level
internal fun PlayerActivity.showV1663PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1663: pig level
internal fun PlayerActivity.showV1663PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1663pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1663pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1663: pigeon mode
internal fun PlayerActivity.showV1663PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pigeon
    FeaturePrefsStore.batch1661.v1663pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1663: pill mode
internal fun PlayerActivity.showV1663PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pill
    FeaturePrefsStore.batch1661.v1663pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1663: pilot mode
internal fun PlayerActivity.showV1663PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pilot
    FeaturePrefsStore.batch1661.v1663pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1663: pink mode
internal fun PlayerActivity.showV1663PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pink
    FeaturePrefsStore.batch1661.v1663pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1663: pioneer mode
internal fun PlayerActivity.showV1663PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1663pioneer
    FeaturePrefsStore.batch1661.v1663pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1664: pepper mode
internal fun PlayerActivity.showV1664PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pepper
    FeaturePrefsStore.batch1661.v1664pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1664: perfect mode
internal fun PlayerActivity.showV1664PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1664perfect
    FeaturePrefsStore.batch1661.v1664perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1664: permit mode
internal fun PlayerActivity.showV1664PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1664permit
    FeaturePrefsStore.batch1661.v1664permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1664: person mode
internal fun PlayerActivity.showV1664PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1664person
    FeaturePrefsStore.batch1661.v1664person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1664: pet mode
internal fun PlayerActivity.showV1664PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pet
    FeaturePrefsStore.batch1661.v1664pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1664: physical level
internal fun PlayerActivity.showV1664PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1664: piano level
internal fun PlayerActivity.showV1664PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1664: picnic level
internal fun PlayerActivity.showV1664PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1664: piece level
internal fun PlayerActivity.showV1664PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1664: pig level
internal fun PlayerActivity.showV1664PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1664pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1664pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1664: pigeon mode
internal fun PlayerActivity.showV1664PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pigeon
    FeaturePrefsStore.batch1661.v1664pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1664: pill mode
internal fun PlayerActivity.showV1664PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pill
    FeaturePrefsStore.batch1661.v1664pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1664: pilot mode
internal fun PlayerActivity.showV1664PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pilot
    FeaturePrefsStore.batch1661.v1664pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1664: pink mode
internal fun PlayerActivity.showV1664PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pink
    FeaturePrefsStore.batch1661.v1664pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1664: pioneer mode
internal fun PlayerActivity.showV1664PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1664pioneer
    FeaturePrefsStore.batch1661.v1664pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1665: pepper mode
internal fun PlayerActivity.showV1665PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pepper
    FeaturePrefsStore.batch1661.v1665pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1665: perfect mode
internal fun PlayerActivity.showV1665PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1665perfect
    FeaturePrefsStore.batch1661.v1665perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1665: permit mode
internal fun PlayerActivity.showV1665PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1665permit
    FeaturePrefsStore.batch1661.v1665permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1665: person mode
internal fun PlayerActivity.showV1665PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1665person
    FeaturePrefsStore.batch1661.v1665person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1665: pet mode
internal fun PlayerActivity.showV1665PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pet
    FeaturePrefsStore.batch1661.v1665pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1665: physical level
internal fun PlayerActivity.showV1665PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1665: piano level
internal fun PlayerActivity.showV1665PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1665: picnic level
internal fun PlayerActivity.showV1665PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1665: piece level
internal fun PlayerActivity.showV1665PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1665: pig level
internal fun PlayerActivity.showV1665PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1665pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1665pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1665: pigeon mode
internal fun PlayerActivity.showV1665PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pigeon
    FeaturePrefsStore.batch1661.v1665pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1665: pill mode
internal fun PlayerActivity.showV1665PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pill
    FeaturePrefsStore.batch1661.v1665pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1665: pilot mode
internal fun PlayerActivity.showV1665PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pilot
    FeaturePrefsStore.batch1661.v1665pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1665: pink mode
internal fun PlayerActivity.showV1665PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pink
    FeaturePrefsStore.batch1661.v1665pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1665: pioneer mode
internal fun PlayerActivity.showV1665PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1665pioneer
    FeaturePrefsStore.batch1661.v1665pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1666: pepper mode
internal fun PlayerActivity.showV1666PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pepper
    FeaturePrefsStore.batch1661.v1666pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1666: perfect mode
internal fun PlayerActivity.showV1666PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1666perfect
    FeaturePrefsStore.batch1661.v1666perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1666: permit mode
internal fun PlayerActivity.showV1666PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1666permit
    FeaturePrefsStore.batch1661.v1666permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1666: person mode
internal fun PlayerActivity.showV1666PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1666person
    FeaturePrefsStore.batch1661.v1666person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1666: pet mode
internal fun PlayerActivity.showV1666PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pet
    FeaturePrefsStore.batch1661.v1666pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1666: physical level
internal fun PlayerActivity.showV1666PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1666: piano level
internal fun PlayerActivity.showV1666PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1666: picnic level
internal fun PlayerActivity.showV1666PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1666: piece level
internal fun PlayerActivity.showV1666PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1666: pig level
internal fun PlayerActivity.showV1666PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1666pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1666pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1666: pigeon mode
internal fun PlayerActivity.showV1666PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pigeon
    FeaturePrefsStore.batch1661.v1666pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1666: pill mode
internal fun PlayerActivity.showV1666PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pill
    FeaturePrefsStore.batch1661.v1666pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1666: pilot mode
internal fun PlayerActivity.showV1666PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pilot
    FeaturePrefsStore.batch1661.v1666pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1666: pink mode
internal fun PlayerActivity.showV1666PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pink
    FeaturePrefsStore.batch1661.v1666pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1666: pioneer mode
internal fun PlayerActivity.showV1666PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1666pioneer
    FeaturePrefsStore.batch1661.v1666pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1667: pepper mode
internal fun PlayerActivity.showV1667PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pepper
    FeaturePrefsStore.batch1661.v1667pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1667: perfect mode
internal fun PlayerActivity.showV1667PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1667perfect
    FeaturePrefsStore.batch1661.v1667perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1667: permit mode
internal fun PlayerActivity.showV1667PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1667permit
    FeaturePrefsStore.batch1661.v1667permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1667: person mode
internal fun PlayerActivity.showV1667PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1667person
    FeaturePrefsStore.batch1661.v1667person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1667: pet mode
internal fun PlayerActivity.showV1667PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pet
    FeaturePrefsStore.batch1661.v1667pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1667: physical level
internal fun PlayerActivity.showV1667PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1667: piano level
internal fun PlayerActivity.showV1667PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1667: picnic level
internal fun PlayerActivity.showV1667PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1667: piece level
internal fun PlayerActivity.showV1667PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1667: pig level
internal fun PlayerActivity.showV1667PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1667pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1667pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1667: pigeon mode
internal fun PlayerActivity.showV1667PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pigeon
    FeaturePrefsStore.batch1661.v1667pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1667: pill mode
internal fun PlayerActivity.showV1667PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pill
    FeaturePrefsStore.batch1661.v1667pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1667: pilot mode
internal fun PlayerActivity.showV1667PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pilot
    FeaturePrefsStore.batch1661.v1667pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1667: pink mode
internal fun PlayerActivity.showV1667PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pink
    FeaturePrefsStore.batch1661.v1667pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1667: pioneer mode
internal fun PlayerActivity.showV1667PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1667pioneer
    FeaturePrefsStore.batch1661.v1667pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1668: pepper mode
internal fun PlayerActivity.showV1668PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pepper
    FeaturePrefsStore.batch1661.v1668pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1668: perfect mode
internal fun PlayerActivity.showV1668PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1668perfect
    FeaturePrefsStore.batch1661.v1668perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1668: permit mode
internal fun PlayerActivity.showV1668PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1668permit
    FeaturePrefsStore.batch1661.v1668permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1668: person mode
internal fun PlayerActivity.showV1668PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1668person
    FeaturePrefsStore.batch1661.v1668person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1668: pet mode
internal fun PlayerActivity.showV1668PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pet
    FeaturePrefsStore.batch1661.v1668pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1668: physical level
internal fun PlayerActivity.showV1668PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1668: piano level
internal fun PlayerActivity.showV1668PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1668: picnic level
internal fun PlayerActivity.showV1668PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1668: piece level
internal fun PlayerActivity.showV1668PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1668: pig level
internal fun PlayerActivity.showV1668PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1668pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1668pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1668: pigeon mode
internal fun PlayerActivity.showV1668PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pigeon
    FeaturePrefsStore.batch1661.v1668pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1668: pill mode
internal fun PlayerActivity.showV1668PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pill
    FeaturePrefsStore.batch1661.v1668pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1668: pilot mode
internal fun PlayerActivity.showV1668PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pilot
    FeaturePrefsStore.batch1661.v1668pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1668: pink mode
internal fun PlayerActivity.showV1668PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pink
    FeaturePrefsStore.batch1661.v1668pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1668: pioneer mode
internal fun PlayerActivity.showV1668PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1668pioneer
    FeaturePrefsStore.batch1661.v1668pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1669: pepper mode
internal fun PlayerActivity.showV1669PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pepper
    FeaturePrefsStore.batch1661.v1669pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1669: perfect mode
internal fun PlayerActivity.showV1669PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1669perfect
    FeaturePrefsStore.batch1661.v1669perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1669: permit mode
internal fun PlayerActivity.showV1669PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1669permit
    FeaturePrefsStore.batch1661.v1669permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1669: person mode
internal fun PlayerActivity.showV1669PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1669person
    FeaturePrefsStore.batch1661.v1669person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1669: pet mode
internal fun PlayerActivity.showV1669PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pet
    FeaturePrefsStore.batch1661.v1669pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1669: physical level
internal fun PlayerActivity.showV1669PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1669: piano level
internal fun PlayerActivity.showV1669PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1669: picnic level
internal fun PlayerActivity.showV1669PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1669: piece level
internal fun PlayerActivity.showV1669PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1669: pig level
internal fun PlayerActivity.showV1669PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1669pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1669pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1669: pigeon mode
internal fun PlayerActivity.showV1669PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pigeon
    FeaturePrefsStore.batch1661.v1669pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1669: pill mode
internal fun PlayerActivity.showV1669PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pill
    FeaturePrefsStore.batch1661.v1669pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1669: pilot mode
internal fun PlayerActivity.showV1669PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pilot
    FeaturePrefsStore.batch1661.v1669pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1669: pink mode
internal fun PlayerActivity.showV1669PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pink
    FeaturePrefsStore.batch1661.v1669pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1669: pioneer mode
internal fun PlayerActivity.showV1669PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1669pioneer
    FeaturePrefsStore.batch1661.v1669pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

// v1670: pepper mode
internal fun PlayerActivity.showV1670PepperToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pepper
    FeaturePrefsStore.batch1661.v1670pepper = !current
    AppToast.show(this, "pepper: ${if (!current) "ON" else "OFF"}")
}

// v1670: perfect mode
internal fun PlayerActivity.showV1670PerfectToggle() {
    val current = FeaturePrefsStore.batch1661.v1670perfect
    FeaturePrefsStore.batch1661.v1670perfect = !current
    AppToast.show(this, "perfect: ${if (!current) "ON" else "OFF"}")
}

// v1670: permit mode
internal fun PlayerActivity.showV1670PermitToggle() {
    val current = FeaturePrefsStore.batch1661.v1670permit
    FeaturePrefsStore.batch1661.v1670permit = !current
    AppToast.show(this, "permit: ${if (!current) "ON" else "OFF"}")
}

// v1670: person mode
internal fun PlayerActivity.showV1670PersonToggle() {
    val current = FeaturePrefsStore.batch1661.v1670person
    FeaturePrefsStore.batch1661.v1670person = !current
    AppToast.show(this, "person: ${if (!current) "ON" else "OFF"}")
}

// v1670: pet mode
internal fun PlayerActivity.showV1670PetToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pet
    FeaturePrefsStore.batch1661.v1670pet = !current
    AppToast.show(this, "pet: ${if (!current) "ON" else "OFF"}")
}

// v1670: physical level
internal fun PlayerActivity.showV1670PhysicalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670physical).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "physical level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670physical = value
        AppToast.show(this, "physical: $value")
    }
}

// v1670: piano level
internal fun PlayerActivity.showV1670PianoDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670piano).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piano level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670piano = value
        AppToast.show(this, "piano: $value")
    }
}

// v1670: picnic level
internal fun PlayerActivity.showV1670PicnicDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670picnic).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "picnic level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670picnic = value
        AppToast.show(this, "picnic: $value")
    }
}

// v1670: piece level
internal fun PlayerActivity.showV1670PieceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670piece).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "piece level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670piece = value
        AppToast.show(this, "piece: $value")
    }
}

// v1670: pig level
internal fun PlayerActivity.showV1670PigDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1661.v1670pig).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "pig level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1661.v1670pig = value
        AppToast.show(this, "pig: $value")
    }
}

// v1670: pigeon mode
internal fun PlayerActivity.showV1670PigeonToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pigeon
    FeaturePrefsStore.batch1661.v1670pigeon = !current
    AppToast.show(this, "pigeon: ${if (!current) "ON" else "OFF"}")
}

// v1670: pill mode
internal fun PlayerActivity.showV1670PillToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pill
    FeaturePrefsStore.batch1661.v1670pill = !current
    AppToast.show(this, "pill: ${if (!current) "ON" else "OFF"}")
}

// v1670: pilot mode
internal fun PlayerActivity.showV1670PilotToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pilot
    FeaturePrefsStore.batch1661.v1670pilot = !current
    AppToast.show(this, "pilot: ${if (!current) "ON" else "OFF"}")
}

// v1670: pink mode
internal fun PlayerActivity.showV1670PinkToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pink
    FeaturePrefsStore.batch1661.v1670pink = !current
    AppToast.show(this, "pink: ${if (!current) "ON" else "OFF"}")
}

// v1670: pioneer mode
internal fun PlayerActivity.showV1670PioneerToggle() {
    val current = FeaturePrefsStore.batch1661.v1670pioneer
    FeaturePrefsStore.batch1661.v1670pioneer = !current
    AppToast.show(this, "pioneer: ${if (!current) "ON" else "OFF"}")
}

