package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1761: rude mode
internal fun PlayerActivity.showV1761RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1761rude
    FeaturePrefsStore.batch1761.v1761rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1761: rug mode
internal fun PlayerActivity.showV1761RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1761rug
    FeaturePrefsStore.batch1761.v1761rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1761: runway mode
internal fun PlayerActivity.showV1761RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1761runway
    FeaturePrefsStore.batch1761.v1761runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1761: rural mode
internal fun PlayerActivity.showV1761RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1761rural
    FeaturePrefsStore.batch1761.v1761rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1761: sad mode
internal fun PlayerActivity.showV1761SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1761sad
    FeaturePrefsStore.batch1761.v1761sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1761: saddle level
internal fun PlayerActivity.showV1761SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1761: sadness level
internal fun PlayerActivity.showV1761SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1761: sail level
internal fun PlayerActivity.showV1761SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1761: salad level
internal fun PlayerActivity.showV1761SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1761: salmon level
internal fun PlayerActivity.showV1761SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1761salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1761salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1761: salon mode
internal fun PlayerActivity.showV1761SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1761salon
    FeaturePrefsStore.batch1761.v1761salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1761: salt mode
internal fun PlayerActivity.showV1761SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1761salt
    FeaturePrefsStore.batch1761.v1761salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1761: salute mode
internal fun PlayerActivity.showV1761SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1761salute
    FeaturePrefsStore.batch1761.v1761salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1761: same mode
internal fun PlayerActivity.showV1761SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1761same
    FeaturePrefsStore.batch1761.v1761same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1761: sand mode
internal fun PlayerActivity.showV1761SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1761sand
    FeaturePrefsStore.batch1761.v1761sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1762: rude mode
internal fun PlayerActivity.showV1762RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1762rude
    FeaturePrefsStore.batch1761.v1762rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1762: rug mode
internal fun PlayerActivity.showV1762RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1762rug
    FeaturePrefsStore.batch1761.v1762rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1762: runway mode
internal fun PlayerActivity.showV1762RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1762runway
    FeaturePrefsStore.batch1761.v1762runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1762: rural mode
internal fun PlayerActivity.showV1762RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1762rural
    FeaturePrefsStore.batch1761.v1762rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1762: sad mode
internal fun PlayerActivity.showV1762SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1762sad
    FeaturePrefsStore.batch1761.v1762sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1762: saddle level
internal fun PlayerActivity.showV1762SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1762: sadness level
internal fun PlayerActivity.showV1762SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1762: sail level
internal fun PlayerActivity.showV1762SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1762: salad level
internal fun PlayerActivity.showV1762SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1762: salmon level
internal fun PlayerActivity.showV1762SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1762salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1762salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1762: salon mode
internal fun PlayerActivity.showV1762SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1762salon
    FeaturePrefsStore.batch1761.v1762salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1762: salt mode
internal fun PlayerActivity.showV1762SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1762salt
    FeaturePrefsStore.batch1761.v1762salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1762: salute mode
internal fun PlayerActivity.showV1762SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1762salute
    FeaturePrefsStore.batch1761.v1762salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1762: same mode
internal fun PlayerActivity.showV1762SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1762same
    FeaturePrefsStore.batch1761.v1762same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1762: sand mode
internal fun PlayerActivity.showV1762SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1762sand
    FeaturePrefsStore.batch1761.v1762sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1763: rude mode
internal fun PlayerActivity.showV1763RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1763rude
    FeaturePrefsStore.batch1761.v1763rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1763: rug mode
internal fun PlayerActivity.showV1763RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1763rug
    FeaturePrefsStore.batch1761.v1763rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1763: runway mode
internal fun PlayerActivity.showV1763RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1763runway
    FeaturePrefsStore.batch1761.v1763runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1763: rural mode
internal fun PlayerActivity.showV1763RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1763rural
    FeaturePrefsStore.batch1761.v1763rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1763: sad mode
internal fun PlayerActivity.showV1763SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1763sad
    FeaturePrefsStore.batch1761.v1763sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1763: saddle level
internal fun PlayerActivity.showV1763SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1763: sadness level
internal fun PlayerActivity.showV1763SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1763: sail level
internal fun PlayerActivity.showV1763SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1763: salad level
internal fun PlayerActivity.showV1763SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1763: salmon level
internal fun PlayerActivity.showV1763SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1763salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1763salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1763: salon mode
internal fun PlayerActivity.showV1763SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1763salon
    FeaturePrefsStore.batch1761.v1763salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1763: salt mode
internal fun PlayerActivity.showV1763SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1763salt
    FeaturePrefsStore.batch1761.v1763salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1763: salute mode
internal fun PlayerActivity.showV1763SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1763salute
    FeaturePrefsStore.batch1761.v1763salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1763: same mode
internal fun PlayerActivity.showV1763SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1763same
    FeaturePrefsStore.batch1761.v1763same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1763: sand mode
internal fun PlayerActivity.showV1763SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1763sand
    FeaturePrefsStore.batch1761.v1763sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1764: rude mode
internal fun PlayerActivity.showV1764RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1764rude
    FeaturePrefsStore.batch1761.v1764rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1764: rug mode
internal fun PlayerActivity.showV1764RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1764rug
    FeaturePrefsStore.batch1761.v1764rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1764: runway mode
internal fun PlayerActivity.showV1764RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1764runway
    FeaturePrefsStore.batch1761.v1764runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1764: rural mode
internal fun PlayerActivity.showV1764RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1764rural
    FeaturePrefsStore.batch1761.v1764rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1764: sad mode
internal fun PlayerActivity.showV1764SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1764sad
    FeaturePrefsStore.batch1761.v1764sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1764: saddle level
internal fun PlayerActivity.showV1764SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1764: sadness level
internal fun PlayerActivity.showV1764SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1764: sail level
internal fun PlayerActivity.showV1764SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1764: salad level
internal fun PlayerActivity.showV1764SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1764: salmon level
internal fun PlayerActivity.showV1764SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1764salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1764salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1764: salon mode
internal fun PlayerActivity.showV1764SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1764salon
    FeaturePrefsStore.batch1761.v1764salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1764: salt mode
internal fun PlayerActivity.showV1764SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1764salt
    FeaturePrefsStore.batch1761.v1764salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1764: salute mode
internal fun PlayerActivity.showV1764SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1764salute
    FeaturePrefsStore.batch1761.v1764salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1764: same mode
internal fun PlayerActivity.showV1764SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1764same
    FeaturePrefsStore.batch1761.v1764same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1764: sand mode
internal fun PlayerActivity.showV1764SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1764sand
    FeaturePrefsStore.batch1761.v1764sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1765: rude mode
internal fun PlayerActivity.showV1765RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1765rude
    FeaturePrefsStore.batch1761.v1765rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1765: rug mode
internal fun PlayerActivity.showV1765RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1765rug
    FeaturePrefsStore.batch1761.v1765rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1765: runway mode
internal fun PlayerActivity.showV1765RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1765runway
    FeaturePrefsStore.batch1761.v1765runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1765: rural mode
internal fun PlayerActivity.showV1765RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1765rural
    FeaturePrefsStore.batch1761.v1765rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1765: sad mode
internal fun PlayerActivity.showV1765SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1765sad
    FeaturePrefsStore.batch1761.v1765sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1765: saddle level
internal fun PlayerActivity.showV1765SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1765: sadness level
internal fun PlayerActivity.showV1765SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1765: sail level
internal fun PlayerActivity.showV1765SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1765: salad level
internal fun PlayerActivity.showV1765SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1765: salmon level
internal fun PlayerActivity.showV1765SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1765salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1765salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1765: salon mode
internal fun PlayerActivity.showV1765SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1765salon
    FeaturePrefsStore.batch1761.v1765salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1765: salt mode
internal fun PlayerActivity.showV1765SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1765salt
    FeaturePrefsStore.batch1761.v1765salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1765: salute mode
internal fun PlayerActivity.showV1765SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1765salute
    FeaturePrefsStore.batch1761.v1765salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1765: same mode
internal fun PlayerActivity.showV1765SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1765same
    FeaturePrefsStore.batch1761.v1765same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1765: sand mode
internal fun PlayerActivity.showV1765SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1765sand
    FeaturePrefsStore.batch1761.v1765sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1766: rude mode
internal fun PlayerActivity.showV1766RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1766rude
    FeaturePrefsStore.batch1761.v1766rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1766: rug mode
internal fun PlayerActivity.showV1766RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1766rug
    FeaturePrefsStore.batch1761.v1766rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1766: runway mode
internal fun PlayerActivity.showV1766RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1766runway
    FeaturePrefsStore.batch1761.v1766runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1766: rural mode
internal fun PlayerActivity.showV1766RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1766rural
    FeaturePrefsStore.batch1761.v1766rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1766: sad mode
internal fun PlayerActivity.showV1766SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1766sad
    FeaturePrefsStore.batch1761.v1766sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1766: saddle level
internal fun PlayerActivity.showV1766SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1766: sadness level
internal fun PlayerActivity.showV1766SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1766: sail level
internal fun PlayerActivity.showV1766SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1766: salad level
internal fun PlayerActivity.showV1766SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1766: salmon level
internal fun PlayerActivity.showV1766SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1766salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1766salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1766: salon mode
internal fun PlayerActivity.showV1766SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1766salon
    FeaturePrefsStore.batch1761.v1766salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1766: salt mode
internal fun PlayerActivity.showV1766SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1766salt
    FeaturePrefsStore.batch1761.v1766salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1766: salute mode
internal fun PlayerActivity.showV1766SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1766salute
    FeaturePrefsStore.batch1761.v1766salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1766: same mode
internal fun PlayerActivity.showV1766SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1766same
    FeaturePrefsStore.batch1761.v1766same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1766: sand mode
internal fun PlayerActivity.showV1766SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1766sand
    FeaturePrefsStore.batch1761.v1766sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1767: rude mode
internal fun PlayerActivity.showV1767RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1767rude
    FeaturePrefsStore.batch1761.v1767rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1767: rug mode
internal fun PlayerActivity.showV1767RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1767rug
    FeaturePrefsStore.batch1761.v1767rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1767: runway mode
internal fun PlayerActivity.showV1767RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1767runway
    FeaturePrefsStore.batch1761.v1767runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1767: rural mode
internal fun PlayerActivity.showV1767RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1767rural
    FeaturePrefsStore.batch1761.v1767rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1767: sad mode
internal fun PlayerActivity.showV1767SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1767sad
    FeaturePrefsStore.batch1761.v1767sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1767: saddle level
internal fun PlayerActivity.showV1767SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1767: sadness level
internal fun PlayerActivity.showV1767SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1767: sail level
internal fun PlayerActivity.showV1767SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1767: salad level
internal fun PlayerActivity.showV1767SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1767: salmon level
internal fun PlayerActivity.showV1767SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1767salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1767salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1767: salon mode
internal fun PlayerActivity.showV1767SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1767salon
    FeaturePrefsStore.batch1761.v1767salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1767: salt mode
internal fun PlayerActivity.showV1767SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1767salt
    FeaturePrefsStore.batch1761.v1767salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1767: salute mode
internal fun PlayerActivity.showV1767SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1767salute
    FeaturePrefsStore.batch1761.v1767salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1767: same mode
internal fun PlayerActivity.showV1767SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1767same
    FeaturePrefsStore.batch1761.v1767same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1767: sand mode
internal fun PlayerActivity.showV1767SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1767sand
    FeaturePrefsStore.batch1761.v1767sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1768: rude mode
internal fun PlayerActivity.showV1768RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1768rude
    FeaturePrefsStore.batch1761.v1768rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1768: rug mode
internal fun PlayerActivity.showV1768RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1768rug
    FeaturePrefsStore.batch1761.v1768rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1768: runway mode
internal fun PlayerActivity.showV1768RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1768runway
    FeaturePrefsStore.batch1761.v1768runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1768: rural mode
internal fun PlayerActivity.showV1768RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1768rural
    FeaturePrefsStore.batch1761.v1768rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1768: sad mode
internal fun PlayerActivity.showV1768SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1768sad
    FeaturePrefsStore.batch1761.v1768sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1768: saddle level
internal fun PlayerActivity.showV1768SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1768: sadness level
internal fun PlayerActivity.showV1768SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1768: sail level
internal fun PlayerActivity.showV1768SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1768: salad level
internal fun PlayerActivity.showV1768SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1768: salmon level
internal fun PlayerActivity.showV1768SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1768salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1768salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1768: salon mode
internal fun PlayerActivity.showV1768SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1768salon
    FeaturePrefsStore.batch1761.v1768salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1768: salt mode
internal fun PlayerActivity.showV1768SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1768salt
    FeaturePrefsStore.batch1761.v1768salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1768: salute mode
internal fun PlayerActivity.showV1768SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1768salute
    FeaturePrefsStore.batch1761.v1768salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1768: same mode
internal fun PlayerActivity.showV1768SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1768same
    FeaturePrefsStore.batch1761.v1768same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1768: sand mode
internal fun PlayerActivity.showV1768SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1768sand
    FeaturePrefsStore.batch1761.v1768sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1769: rude mode
internal fun PlayerActivity.showV1769RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1769rude
    FeaturePrefsStore.batch1761.v1769rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1769: rug mode
internal fun PlayerActivity.showV1769RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1769rug
    FeaturePrefsStore.batch1761.v1769rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1769: runway mode
internal fun PlayerActivity.showV1769RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1769runway
    FeaturePrefsStore.batch1761.v1769runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1769: rural mode
internal fun PlayerActivity.showV1769RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1769rural
    FeaturePrefsStore.batch1761.v1769rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1769: sad mode
internal fun PlayerActivity.showV1769SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1769sad
    FeaturePrefsStore.batch1761.v1769sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1769: saddle level
internal fun PlayerActivity.showV1769SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1769: sadness level
internal fun PlayerActivity.showV1769SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1769: sail level
internal fun PlayerActivity.showV1769SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1769: salad level
internal fun PlayerActivity.showV1769SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1769: salmon level
internal fun PlayerActivity.showV1769SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1769salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1769salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1769: salon mode
internal fun PlayerActivity.showV1769SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1769salon
    FeaturePrefsStore.batch1761.v1769salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1769: salt mode
internal fun PlayerActivity.showV1769SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1769salt
    FeaturePrefsStore.batch1761.v1769salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1769: salute mode
internal fun PlayerActivity.showV1769SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1769salute
    FeaturePrefsStore.batch1761.v1769salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1769: same mode
internal fun PlayerActivity.showV1769SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1769same
    FeaturePrefsStore.batch1761.v1769same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1769: sand mode
internal fun PlayerActivity.showV1769SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1769sand
    FeaturePrefsStore.batch1761.v1769sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

// v1770: rude mode
internal fun PlayerActivity.showV1770RudeToggle() {
    val current = FeaturePrefsStore.batch1761.v1770rude
    FeaturePrefsStore.batch1761.v1770rude = !current
    AppToast.show(this, "rude: ${if (!current) "ON" else "OFF"}")
}

// v1770: rug mode
internal fun PlayerActivity.showV1770RugToggle() {
    val current = FeaturePrefsStore.batch1761.v1770rug
    FeaturePrefsStore.batch1761.v1770rug = !current
    AppToast.show(this, "rug: ${if (!current) "ON" else "OFF"}")
}

// v1770: runway mode
internal fun PlayerActivity.showV1770RunwayToggle() {
    val current = FeaturePrefsStore.batch1761.v1770runway
    FeaturePrefsStore.batch1761.v1770runway = !current
    AppToast.show(this, "runway: ${if (!current) "ON" else "OFF"}")
}

// v1770: rural mode
internal fun PlayerActivity.showV1770RuralToggle() {
    val current = FeaturePrefsStore.batch1761.v1770rural
    FeaturePrefsStore.batch1761.v1770rural = !current
    AppToast.show(this, "rural: ${if (!current) "ON" else "OFF"}")
}

// v1770: sad mode
internal fun PlayerActivity.showV1770SadToggle() {
    val current = FeaturePrefsStore.batch1761.v1770sad
    FeaturePrefsStore.batch1761.v1770sad = !current
    AppToast.show(this, "sad: ${if (!current) "ON" else "OFF"}")
}

// v1770: saddle level
internal fun PlayerActivity.showV1770SaddleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770saddle).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "saddle level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770saddle = value
        AppToast.show(this, "saddle: $value")
    }
}

// v1770: sadness level
internal fun PlayerActivity.showV1770SadnessDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770sadness).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sadness level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770sadness = value
        AppToast.show(this, "sadness: $value")
    }
}

// v1770: sail level
internal fun PlayerActivity.showV1770SailDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770sail).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "sail level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770sail = value
        AppToast.show(this, "sail: $value")
    }
}

// v1770: salad level
internal fun PlayerActivity.showV1770SaladDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770salad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770salad = value
        AppToast.show(this, "salad: $value")
    }
}

// v1770: salmon level
internal fun PlayerActivity.showV1770SalmonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1761.v1770salmon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "salmon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1761.v1770salmon = value
        AppToast.show(this, "salmon: $value")
    }
}

// v1770: salon mode
internal fun PlayerActivity.showV1770SalonToggle() {
    val current = FeaturePrefsStore.batch1761.v1770salon
    FeaturePrefsStore.batch1761.v1770salon = !current
    AppToast.show(this, "salon: ${if (!current) "ON" else "OFF"}")
}

// v1770: salt mode
internal fun PlayerActivity.showV1770SaltToggle() {
    val current = FeaturePrefsStore.batch1761.v1770salt
    FeaturePrefsStore.batch1761.v1770salt = !current
    AppToast.show(this, "salt: ${if (!current) "ON" else "OFF"}")
}

// v1770: salute mode
internal fun PlayerActivity.showV1770SaluteToggle() {
    val current = FeaturePrefsStore.batch1761.v1770salute
    FeaturePrefsStore.batch1761.v1770salute = !current
    AppToast.show(this, "salute: ${if (!current) "ON" else "OFF"}")
}

// v1770: same mode
internal fun PlayerActivity.showV1770SameToggle() {
    val current = FeaturePrefsStore.batch1761.v1770same
    FeaturePrefsStore.batch1761.v1770same = !current
    AppToast.show(this, "same: ${if (!current) "ON" else "OFF"}")
}

// v1770: sand mode
internal fun PlayerActivity.showV1770SandToggle() {
    val current = FeaturePrefsStore.batch1761.v1770sand
    FeaturePrefsStore.batch1761.v1770sand = !current
    AppToast.show(this, "sand: ${if (!current) "ON" else "OFF"}")
}

