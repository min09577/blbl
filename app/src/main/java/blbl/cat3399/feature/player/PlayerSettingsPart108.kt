package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1261: blast mode
internal fun PlayerActivity.showV1261BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1261blast
    FeaturePrefsStore.batch1261.v1261blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1261: blaze mode
internal fun PlayerActivity.showV1261BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1261blaze
    FeaturePrefsStore.batch1261.v1261blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1261: bleed mode
internal fun PlayerActivity.showV1261BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bleed
    FeaturePrefsStore.batch1261.v1261bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1261: bless mode
internal fun PlayerActivity.showV1261BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bless
    FeaturePrefsStore.batch1261.v1261bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1261: blind mode
internal fun PlayerActivity.showV1261BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1261blind
    FeaturePrefsStore.batch1261.v1261blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1261: blood level
internal fun PlayerActivity.showV1261BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1261: bloom level
internal fun PlayerActivity.showV1261BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1261: blow level
internal fun PlayerActivity.showV1261BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1261: blue level
internal fun PlayerActivity.showV1261BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1261: blur level
internal fun PlayerActivity.showV1261BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1261blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1261blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1261: board mode
internal fun PlayerActivity.showV1261BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1261board
    FeaturePrefsStore.batch1261.v1261board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1261: boat mode
internal fun PlayerActivity.showV1261BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1261boat
    FeaturePrefsStore.batch1261.v1261boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1261: body mode
internal fun PlayerActivity.showV1261BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1261body
    FeaturePrefsStore.batch1261.v1261body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1261: bold mode
internal fun PlayerActivity.showV1261BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bold
    FeaturePrefsStore.batch1261.v1261bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1261: bolt mode
internal fun PlayerActivity.showV1261BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1261bolt
    FeaturePrefsStore.batch1261.v1261bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1262: blast mode
internal fun PlayerActivity.showV1262BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1262blast
    FeaturePrefsStore.batch1261.v1262blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1262: blaze mode
internal fun PlayerActivity.showV1262BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1262blaze
    FeaturePrefsStore.batch1261.v1262blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1262: bleed mode
internal fun PlayerActivity.showV1262BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bleed
    FeaturePrefsStore.batch1261.v1262bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1262: bless mode
internal fun PlayerActivity.showV1262BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bless
    FeaturePrefsStore.batch1261.v1262bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1262: blind mode
internal fun PlayerActivity.showV1262BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1262blind
    FeaturePrefsStore.batch1261.v1262blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1262: blood level
internal fun PlayerActivity.showV1262BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1262: bloom level
internal fun PlayerActivity.showV1262BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1262: blow level
internal fun PlayerActivity.showV1262BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1262: blue level
internal fun PlayerActivity.showV1262BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1262: blur level
internal fun PlayerActivity.showV1262BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1262blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1262blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1262: board mode
internal fun PlayerActivity.showV1262BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1262board
    FeaturePrefsStore.batch1261.v1262board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1262: boat mode
internal fun PlayerActivity.showV1262BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1262boat
    FeaturePrefsStore.batch1261.v1262boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1262: body mode
internal fun PlayerActivity.showV1262BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1262body
    FeaturePrefsStore.batch1261.v1262body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1262: bold mode
internal fun PlayerActivity.showV1262BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bold
    FeaturePrefsStore.batch1261.v1262bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1262: bolt mode
internal fun PlayerActivity.showV1262BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1262bolt
    FeaturePrefsStore.batch1261.v1262bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1263: blast mode
internal fun PlayerActivity.showV1263BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1263blast
    FeaturePrefsStore.batch1261.v1263blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1263: blaze mode
internal fun PlayerActivity.showV1263BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1263blaze
    FeaturePrefsStore.batch1261.v1263blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1263: bleed mode
internal fun PlayerActivity.showV1263BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bleed
    FeaturePrefsStore.batch1261.v1263bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1263: bless mode
internal fun PlayerActivity.showV1263BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bless
    FeaturePrefsStore.batch1261.v1263bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1263: blind mode
internal fun PlayerActivity.showV1263BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1263blind
    FeaturePrefsStore.batch1261.v1263blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1263: blood level
internal fun PlayerActivity.showV1263BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1263: bloom level
internal fun PlayerActivity.showV1263BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1263: blow level
internal fun PlayerActivity.showV1263BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1263: blue level
internal fun PlayerActivity.showV1263BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1263: blur level
internal fun PlayerActivity.showV1263BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1263blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1263blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1263: board mode
internal fun PlayerActivity.showV1263BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1263board
    FeaturePrefsStore.batch1261.v1263board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1263: boat mode
internal fun PlayerActivity.showV1263BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1263boat
    FeaturePrefsStore.batch1261.v1263boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1263: body mode
internal fun PlayerActivity.showV1263BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1263body
    FeaturePrefsStore.batch1261.v1263body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1263: bold mode
internal fun PlayerActivity.showV1263BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bold
    FeaturePrefsStore.batch1261.v1263bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1263: bolt mode
internal fun PlayerActivity.showV1263BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1263bolt
    FeaturePrefsStore.batch1261.v1263bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1264: blast mode
internal fun PlayerActivity.showV1264BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1264blast
    FeaturePrefsStore.batch1261.v1264blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1264: blaze mode
internal fun PlayerActivity.showV1264BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1264blaze
    FeaturePrefsStore.batch1261.v1264blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1264: bleed mode
internal fun PlayerActivity.showV1264BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bleed
    FeaturePrefsStore.batch1261.v1264bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1264: bless mode
internal fun PlayerActivity.showV1264BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bless
    FeaturePrefsStore.batch1261.v1264bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1264: blind mode
internal fun PlayerActivity.showV1264BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1264blind
    FeaturePrefsStore.batch1261.v1264blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1264: blood level
internal fun PlayerActivity.showV1264BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1264: bloom level
internal fun PlayerActivity.showV1264BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1264: blow level
internal fun PlayerActivity.showV1264BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1264: blue level
internal fun PlayerActivity.showV1264BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1264: blur level
internal fun PlayerActivity.showV1264BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1264blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1264blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1264: board mode
internal fun PlayerActivity.showV1264BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1264board
    FeaturePrefsStore.batch1261.v1264board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1264: boat mode
internal fun PlayerActivity.showV1264BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1264boat
    FeaturePrefsStore.batch1261.v1264boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1264: body mode
internal fun PlayerActivity.showV1264BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1264body
    FeaturePrefsStore.batch1261.v1264body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1264: bold mode
internal fun PlayerActivity.showV1264BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bold
    FeaturePrefsStore.batch1261.v1264bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1264: bolt mode
internal fun PlayerActivity.showV1264BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1264bolt
    FeaturePrefsStore.batch1261.v1264bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1265: blast mode
internal fun PlayerActivity.showV1265BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1265blast
    FeaturePrefsStore.batch1261.v1265blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1265: blaze mode
internal fun PlayerActivity.showV1265BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1265blaze
    FeaturePrefsStore.batch1261.v1265blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1265: bleed mode
internal fun PlayerActivity.showV1265BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bleed
    FeaturePrefsStore.batch1261.v1265bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1265: bless mode
internal fun PlayerActivity.showV1265BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bless
    FeaturePrefsStore.batch1261.v1265bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1265: blind mode
internal fun PlayerActivity.showV1265BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1265blind
    FeaturePrefsStore.batch1261.v1265blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1265: blood level
internal fun PlayerActivity.showV1265BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1265: bloom level
internal fun PlayerActivity.showV1265BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1265: blow level
internal fun PlayerActivity.showV1265BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1265: blue level
internal fun PlayerActivity.showV1265BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1265: blur level
internal fun PlayerActivity.showV1265BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1265blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1265blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1265: board mode
internal fun PlayerActivity.showV1265BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1265board
    FeaturePrefsStore.batch1261.v1265board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1265: boat mode
internal fun PlayerActivity.showV1265BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1265boat
    FeaturePrefsStore.batch1261.v1265boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1265: body mode
internal fun PlayerActivity.showV1265BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1265body
    FeaturePrefsStore.batch1261.v1265body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1265: bold mode
internal fun PlayerActivity.showV1265BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bold
    FeaturePrefsStore.batch1261.v1265bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1265: bolt mode
internal fun PlayerActivity.showV1265BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1265bolt
    FeaturePrefsStore.batch1261.v1265bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1266: blast mode
internal fun PlayerActivity.showV1266BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1266blast
    FeaturePrefsStore.batch1261.v1266blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1266: blaze mode
internal fun PlayerActivity.showV1266BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1266blaze
    FeaturePrefsStore.batch1261.v1266blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1266: bleed mode
internal fun PlayerActivity.showV1266BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bleed
    FeaturePrefsStore.batch1261.v1266bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1266: bless mode
internal fun PlayerActivity.showV1266BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bless
    FeaturePrefsStore.batch1261.v1266bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1266: blind mode
internal fun PlayerActivity.showV1266BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1266blind
    FeaturePrefsStore.batch1261.v1266blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1266: blood level
internal fun PlayerActivity.showV1266BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1266: bloom level
internal fun PlayerActivity.showV1266BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1266: blow level
internal fun PlayerActivity.showV1266BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1266: blue level
internal fun PlayerActivity.showV1266BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1266: blur level
internal fun PlayerActivity.showV1266BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1266blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1266blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1266: board mode
internal fun PlayerActivity.showV1266BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1266board
    FeaturePrefsStore.batch1261.v1266board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1266: boat mode
internal fun PlayerActivity.showV1266BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1266boat
    FeaturePrefsStore.batch1261.v1266boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1266: body mode
internal fun PlayerActivity.showV1266BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1266body
    FeaturePrefsStore.batch1261.v1266body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1266: bold mode
internal fun PlayerActivity.showV1266BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bold
    FeaturePrefsStore.batch1261.v1266bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1266: bolt mode
internal fun PlayerActivity.showV1266BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1266bolt
    FeaturePrefsStore.batch1261.v1266bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1267: blast mode
internal fun PlayerActivity.showV1267BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1267blast
    FeaturePrefsStore.batch1261.v1267blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1267: blaze mode
internal fun PlayerActivity.showV1267BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1267blaze
    FeaturePrefsStore.batch1261.v1267blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1267: bleed mode
internal fun PlayerActivity.showV1267BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bleed
    FeaturePrefsStore.batch1261.v1267bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1267: bless mode
internal fun PlayerActivity.showV1267BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bless
    FeaturePrefsStore.batch1261.v1267bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1267: blind mode
internal fun PlayerActivity.showV1267BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1267blind
    FeaturePrefsStore.batch1261.v1267blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1267: blood level
internal fun PlayerActivity.showV1267BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1267: bloom level
internal fun PlayerActivity.showV1267BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1267: blow level
internal fun PlayerActivity.showV1267BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1267: blue level
internal fun PlayerActivity.showV1267BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1267: blur level
internal fun PlayerActivity.showV1267BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1267blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1267blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1267: board mode
internal fun PlayerActivity.showV1267BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1267board
    FeaturePrefsStore.batch1261.v1267board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1267: boat mode
internal fun PlayerActivity.showV1267BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1267boat
    FeaturePrefsStore.batch1261.v1267boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1267: body mode
internal fun PlayerActivity.showV1267BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1267body
    FeaturePrefsStore.batch1261.v1267body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1267: bold mode
internal fun PlayerActivity.showV1267BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bold
    FeaturePrefsStore.batch1261.v1267bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1267: bolt mode
internal fun PlayerActivity.showV1267BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1267bolt
    FeaturePrefsStore.batch1261.v1267bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1268: blast mode
internal fun PlayerActivity.showV1268BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1268blast
    FeaturePrefsStore.batch1261.v1268blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1268: blaze mode
internal fun PlayerActivity.showV1268BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1268blaze
    FeaturePrefsStore.batch1261.v1268blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1268: bleed mode
internal fun PlayerActivity.showV1268BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bleed
    FeaturePrefsStore.batch1261.v1268bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1268: bless mode
internal fun PlayerActivity.showV1268BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bless
    FeaturePrefsStore.batch1261.v1268bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1268: blind mode
internal fun PlayerActivity.showV1268BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1268blind
    FeaturePrefsStore.batch1261.v1268blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1268: blood level
internal fun PlayerActivity.showV1268BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1268: bloom level
internal fun PlayerActivity.showV1268BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1268: blow level
internal fun PlayerActivity.showV1268BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1268: blue level
internal fun PlayerActivity.showV1268BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1268: blur level
internal fun PlayerActivity.showV1268BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1268blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1268blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1268: board mode
internal fun PlayerActivity.showV1268BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1268board
    FeaturePrefsStore.batch1261.v1268board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1268: boat mode
internal fun PlayerActivity.showV1268BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1268boat
    FeaturePrefsStore.batch1261.v1268boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1268: body mode
internal fun PlayerActivity.showV1268BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1268body
    FeaturePrefsStore.batch1261.v1268body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1268: bold mode
internal fun PlayerActivity.showV1268BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bold
    FeaturePrefsStore.batch1261.v1268bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1268: bolt mode
internal fun PlayerActivity.showV1268BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1268bolt
    FeaturePrefsStore.batch1261.v1268bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1269: blast mode
internal fun PlayerActivity.showV1269BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1269blast
    FeaturePrefsStore.batch1261.v1269blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1269: blaze mode
internal fun PlayerActivity.showV1269BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1269blaze
    FeaturePrefsStore.batch1261.v1269blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1269: bleed mode
internal fun PlayerActivity.showV1269BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bleed
    FeaturePrefsStore.batch1261.v1269bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1269: bless mode
internal fun PlayerActivity.showV1269BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bless
    FeaturePrefsStore.batch1261.v1269bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1269: blind mode
internal fun PlayerActivity.showV1269BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1269blind
    FeaturePrefsStore.batch1261.v1269blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1269: blood level
internal fun PlayerActivity.showV1269BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1269: bloom level
internal fun PlayerActivity.showV1269BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1269: blow level
internal fun PlayerActivity.showV1269BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1269: blue level
internal fun PlayerActivity.showV1269BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1269: blur level
internal fun PlayerActivity.showV1269BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1269blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1269blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1269: board mode
internal fun PlayerActivity.showV1269BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1269board
    FeaturePrefsStore.batch1261.v1269board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1269: boat mode
internal fun PlayerActivity.showV1269BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1269boat
    FeaturePrefsStore.batch1261.v1269boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1269: body mode
internal fun PlayerActivity.showV1269BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1269body
    FeaturePrefsStore.batch1261.v1269body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1269: bold mode
internal fun PlayerActivity.showV1269BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bold
    FeaturePrefsStore.batch1261.v1269bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1269: bolt mode
internal fun PlayerActivity.showV1269BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1269bolt
    FeaturePrefsStore.batch1261.v1269bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

// v1270: blast mode
internal fun PlayerActivity.showV1270BlastToggle() {
    val current = FeaturePrefsStore.batch1261.v1270blast
    FeaturePrefsStore.batch1261.v1270blast = !current
    AppToast.show(this, "blast: ${if (!current) "ON" else "OFF"}")
}

// v1270: blaze mode
internal fun PlayerActivity.showV1270BlazeToggle() {
    val current = FeaturePrefsStore.batch1261.v1270blaze
    FeaturePrefsStore.batch1261.v1270blaze = !current
    AppToast.show(this, "blaze: ${if (!current) "ON" else "OFF"}")
}

// v1270: bleed mode
internal fun PlayerActivity.showV1270BleedToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bleed
    FeaturePrefsStore.batch1261.v1270bleed = !current
    AppToast.show(this, "bleed: ${if (!current) "ON" else "OFF"}")
}

// v1270: bless mode
internal fun PlayerActivity.showV1270BlessToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bless
    FeaturePrefsStore.batch1261.v1270bless = !current
    AppToast.show(this, "bless: ${if (!current) "ON" else "OFF"}")
}

// v1270: blind mode
internal fun PlayerActivity.showV1270BlindToggle() {
    val current = FeaturePrefsStore.batch1261.v1270blind
    FeaturePrefsStore.batch1261.v1270blind = !current
    AppToast.show(this, "blind: ${if (!current) "ON" else "OFF"}")
}

// v1270: blood level
internal fun PlayerActivity.showV1270BloodDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blood).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blood level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blood = value
        AppToast.show(this, "blood: $value")
    }
}

// v1270: bloom level
internal fun PlayerActivity.showV1270BloomDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270bloom).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bloom level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270bloom = value
        AppToast.show(this, "bloom: $value")
    }
}

// v1270: blow level
internal fun PlayerActivity.showV1270BlowDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blow).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blow level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blow = value
        AppToast.show(this, "blow: $value")
    }
}

// v1270: blue level
internal fun PlayerActivity.showV1270BlueDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blue).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blue level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blue = value
        AppToast.show(this, "blue: $value")
    }
}

// v1270: blur level
internal fun PlayerActivity.showV1270BlurDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1261.v1270blur).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "blur level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1261.v1270blur = value
        AppToast.show(this, "blur: $value")
    }
}

// v1270: board mode
internal fun PlayerActivity.showV1270BoardToggle() {
    val current = FeaturePrefsStore.batch1261.v1270board
    FeaturePrefsStore.batch1261.v1270board = !current
    AppToast.show(this, "board: ${if (!current) "ON" else "OFF"}")
}

// v1270: boat mode
internal fun PlayerActivity.showV1270BoatToggle() {
    val current = FeaturePrefsStore.batch1261.v1270boat
    FeaturePrefsStore.batch1261.v1270boat = !current
    AppToast.show(this, "boat: ${if (!current) "ON" else "OFF"}")
}

// v1270: body mode
internal fun PlayerActivity.showV1270BodyToggle() {
    val current = FeaturePrefsStore.batch1261.v1270body
    FeaturePrefsStore.batch1261.v1270body = !current
    AppToast.show(this, "body: ${if (!current) "ON" else "OFF"}")
}

// v1270: bold mode
internal fun PlayerActivity.showV1270BoldToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bold
    FeaturePrefsStore.batch1261.v1270bold = !current
    AppToast.show(this, "bold: ${if (!current) "ON" else "OFF"}")
}

// v1270: bolt mode
internal fun PlayerActivity.showV1270BoltToggle() {
    val current = FeaturePrefsStore.batch1261.v1270bolt
    FeaturePrefsStore.batch1261.v1270bolt = !current
    AppToast.show(this, "bolt: ${if (!current) "ON" else "OFF"}")
}

