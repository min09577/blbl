package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1281: bread mode
internal fun PlayerActivity.showV1281BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bread
    FeaturePrefsStore.batch1281.v1281bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1281: breed mode
internal fun PlayerActivity.showV1281BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1281breed
    FeaturePrefsStore.batch1281.v1281breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1281: brick mode
internal fun PlayerActivity.showV1281BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1281brick
    FeaturePrefsStore.batch1281.v1281brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1281: bride mode
internal fun PlayerActivity.showV1281BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bride
    FeaturePrefsStore.batch1281.v1281bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1281: brief mode
internal fun PlayerActivity.showV1281BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1281brief
    FeaturePrefsStore.batch1281.v1281brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1281: bring level
internal fun PlayerActivity.showV1281BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1281: broad level
internal fun PlayerActivity.showV1281BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1281: broken level
internal fun PlayerActivity.showV1281BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1281: bronze level
internal fun PlayerActivity.showV1281BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1281: brook level
internal fun PlayerActivity.showV1281BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1281brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1281brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1281: brush mode
internal fun PlayerActivity.showV1281BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1281brush
    FeaturePrefsStore.batch1281.v1281brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1281: bubble mode
internal fun PlayerActivity.showV1281BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bubble
    FeaturePrefsStore.batch1281.v1281bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1281: bucket mode
internal fun PlayerActivity.showV1281BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1281bucket
    FeaturePrefsStore.batch1281.v1281bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1281: budget mode
internal fun PlayerActivity.showV1281BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1281budget
    FeaturePrefsStore.batch1281.v1281budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1281: buff mode
internal fun PlayerActivity.showV1281BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1281buff
    FeaturePrefsStore.batch1281.v1281buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1282: bread mode
internal fun PlayerActivity.showV1282BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bread
    FeaturePrefsStore.batch1281.v1282bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1282: breed mode
internal fun PlayerActivity.showV1282BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1282breed
    FeaturePrefsStore.batch1281.v1282breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1282: brick mode
internal fun PlayerActivity.showV1282BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1282brick
    FeaturePrefsStore.batch1281.v1282brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1282: bride mode
internal fun PlayerActivity.showV1282BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bride
    FeaturePrefsStore.batch1281.v1282bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1282: brief mode
internal fun PlayerActivity.showV1282BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1282brief
    FeaturePrefsStore.batch1281.v1282brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1282: bring level
internal fun PlayerActivity.showV1282BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1282: broad level
internal fun PlayerActivity.showV1282BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1282: broken level
internal fun PlayerActivity.showV1282BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1282: bronze level
internal fun PlayerActivity.showV1282BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1282: brook level
internal fun PlayerActivity.showV1282BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1282brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1282brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1282: brush mode
internal fun PlayerActivity.showV1282BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1282brush
    FeaturePrefsStore.batch1281.v1282brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1282: bubble mode
internal fun PlayerActivity.showV1282BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bubble
    FeaturePrefsStore.batch1281.v1282bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1282: bucket mode
internal fun PlayerActivity.showV1282BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1282bucket
    FeaturePrefsStore.batch1281.v1282bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1282: budget mode
internal fun PlayerActivity.showV1282BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1282budget
    FeaturePrefsStore.batch1281.v1282budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1282: buff mode
internal fun PlayerActivity.showV1282BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1282buff
    FeaturePrefsStore.batch1281.v1282buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1283: bread mode
internal fun PlayerActivity.showV1283BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bread
    FeaturePrefsStore.batch1281.v1283bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1283: breed mode
internal fun PlayerActivity.showV1283BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1283breed
    FeaturePrefsStore.batch1281.v1283breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1283: brick mode
internal fun PlayerActivity.showV1283BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1283brick
    FeaturePrefsStore.batch1281.v1283brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1283: bride mode
internal fun PlayerActivity.showV1283BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bride
    FeaturePrefsStore.batch1281.v1283bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1283: brief mode
internal fun PlayerActivity.showV1283BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1283brief
    FeaturePrefsStore.batch1281.v1283brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1283: bring level
internal fun PlayerActivity.showV1283BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1283: broad level
internal fun PlayerActivity.showV1283BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1283: broken level
internal fun PlayerActivity.showV1283BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1283: bronze level
internal fun PlayerActivity.showV1283BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1283: brook level
internal fun PlayerActivity.showV1283BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1283brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1283brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1283: brush mode
internal fun PlayerActivity.showV1283BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1283brush
    FeaturePrefsStore.batch1281.v1283brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1283: bubble mode
internal fun PlayerActivity.showV1283BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bubble
    FeaturePrefsStore.batch1281.v1283bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1283: bucket mode
internal fun PlayerActivity.showV1283BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1283bucket
    FeaturePrefsStore.batch1281.v1283bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1283: budget mode
internal fun PlayerActivity.showV1283BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1283budget
    FeaturePrefsStore.batch1281.v1283budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1283: buff mode
internal fun PlayerActivity.showV1283BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1283buff
    FeaturePrefsStore.batch1281.v1283buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1284: bread mode
internal fun PlayerActivity.showV1284BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bread
    FeaturePrefsStore.batch1281.v1284bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1284: breed mode
internal fun PlayerActivity.showV1284BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1284breed
    FeaturePrefsStore.batch1281.v1284breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1284: brick mode
internal fun PlayerActivity.showV1284BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1284brick
    FeaturePrefsStore.batch1281.v1284brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1284: bride mode
internal fun PlayerActivity.showV1284BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bride
    FeaturePrefsStore.batch1281.v1284bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1284: brief mode
internal fun PlayerActivity.showV1284BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1284brief
    FeaturePrefsStore.batch1281.v1284brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1284: bring level
internal fun PlayerActivity.showV1284BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1284: broad level
internal fun PlayerActivity.showV1284BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1284: broken level
internal fun PlayerActivity.showV1284BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1284: bronze level
internal fun PlayerActivity.showV1284BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1284: brook level
internal fun PlayerActivity.showV1284BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1284brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1284brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1284: brush mode
internal fun PlayerActivity.showV1284BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1284brush
    FeaturePrefsStore.batch1281.v1284brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1284: bubble mode
internal fun PlayerActivity.showV1284BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bubble
    FeaturePrefsStore.batch1281.v1284bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1284: bucket mode
internal fun PlayerActivity.showV1284BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1284bucket
    FeaturePrefsStore.batch1281.v1284bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1284: budget mode
internal fun PlayerActivity.showV1284BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1284budget
    FeaturePrefsStore.batch1281.v1284budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1284: buff mode
internal fun PlayerActivity.showV1284BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1284buff
    FeaturePrefsStore.batch1281.v1284buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1285: bread mode
internal fun PlayerActivity.showV1285BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bread
    FeaturePrefsStore.batch1281.v1285bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1285: breed mode
internal fun PlayerActivity.showV1285BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1285breed
    FeaturePrefsStore.batch1281.v1285breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1285: brick mode
internal fun PlayerActivity.showV1285BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1285brick
    FeaturePrefsStore.batch1281.v1285brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1285: bride mode
internal fun PlayerActivity.showV1285BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bride
    FeaturePrefsStore.batch1281.v1285bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1285: brief mode
internal fun PlayerActivity.showV1285BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1285brief
    FeaturePrefsStore.batch1281.v1285brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1285: bring level
internal fun PlayerActivity.showV1285BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1285: broad level
internal fun PlayerActivity.showV1285BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1285: broken level
internal fun PlayerActivity.showV1285BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1285: bronze level
internal fun PlayerActivity.showV1285BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1285: brook level
internal fun PlayerActivity.showV1285BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1285brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1285brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1285: brush mode
internal fun PlayerActivity.showV1285BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1285brush
    FeaturePrefsStore.batch1281.v1285brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1285: bubble mode
internal fun PlayerActivity.showV1285BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bubble
    FeaturePrefsStore.batch1281.v1285bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1285: bucket mode
internal fun PlayerActivity.showV1285BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1285bucket
    FeaturePrefsStore.batch1281.v1285bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1285: budget mode
internal fun PlayerActivity.showV1285BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1285budget
    FeaturePrefsStore.batch1281.v1285budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1285: buff mode
internal fun PlayerActivity.showV1285BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1285buff
    FeaturePrefsStore.batch1281.v1285buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1286: bread mode
internal fun PlayerActivity.showV1286BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bread
    FeaturePrefsStore.batch1281.v1286bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1286: breed mode
internal fun PlayerActivity.showV1286BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1286breed
    FeaturePrefsStore.batch1281.v1286breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1286: brick mode
internal fun PlayerActivity.showV1286BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1286brick
    FeaturePrefsStore.batch1281.v1286brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1286: bride mode
internal fun PlayerActivity.showV1286BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bride
    FeaturePrefsStore.batch1281.v1286bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1286: brief mode
internal fun PlayerActivity.showV1286BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1286brief
    FeaturePrefsStore.batch1281.v1286brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1286: bring level
internal fun PlayerActivity.showV1286BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1286: broad level
internal fun PlayerActivity.showV1286BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1286: broken level
internal fun PlayerActivity.showV1286BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1286: bronze level
internal fun PlayerActivity.showV1286BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1286: brook level
internal fun PlayerActivity.showV1286BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1286brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1286brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1286: brush mode
internal fun PlayerActivity.showV1286BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1286brush
    FeaturePrefsStore.batch1281.v1286brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1286: bubble mode
internal fun PlayerActivity.showV1286BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bubble
    FeaturePrefsStore.batch1281.v1286bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1286: bucket mode
internal fun PlayerActivity.showV1286BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1286bucket
    FeaturePrefsStore.batch1281.v1286bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1286: budget mode
internal fun PlayerActivity.showV1286BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1286budget
    FeaturePrefsStore.batch1281.v1286budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1286: buff mode
internal fun PlayerActivity.showV1286BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1286buff
    FeaturePrefsStore.batch1281.v1286buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1287: bread mode
internal fun PlayerActivity.showV1287BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bread
    FeaturePrefsStore.batch1281.v1287bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1287: breed mode
internal fun PlayerActivity.showV1287BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1287breed
    FeaturePrefsStore.batch1281.v1287breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1287: brick mode
internal fun PlayerActivity.showV1287BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1287brick
    FeaturePrefsStore.batch1281.v1287brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1287: bride mode
internal fun PlayerActivity.showV1287BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bride
    FeaturePrefsStore.batch1281.v1287bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1287: brief mode
internal fun PlayerActivity.showV1287BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1287brief
    FeaturePrefsStore.batch1281.v1287brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1287: bring level
internal fun PlayerActivity.showV1287BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1287: broad level
internal fun PlayerActivity.showV1287BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1287: broken level
internal fun PlayerActivity.showV1287BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1287: bronze level
internal fun PlayerActivity.showV1287BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1287: brook level
internal fun PlayerActivity.showV1287BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1287brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1287brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1287: brush mode
internal fun PlayerActivity.showV1287BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1287brush
    FeaturePrefsStore.batch1281.v1287brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1287: bubble mode
internal fun PlayerActivity.showV1287BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bubble
    FeaturePrefsStore.batch1281.v1287bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1287: bucket mode
internal fun PlayerActivity.showV1287BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1287bucket
    FeaturePrefsStore.batch1281.v1287bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1287: budget mode
internal fun PlayerActivity.showV1287BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1287budget
    FeaturePrefsStore.batch1281.v1287budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1287: buff mode
internal fun PlayerActivity.showV1287BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1287buff
    FeaturePrefsStore.batch1281.v1287buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1288: bread mode
internal fun PlayerActivity.showV1288BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bread
    FeaturePrefsStore.batch1281.v1288bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1288: breed mode
internal fun PlayerActivity.showV1288BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1288breed
    FeaturePrefsStore.batch1281.v1288breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1288: brick mode
internal fun PlayerActivity.showV1288BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1288brick
    FeaturePrefsStore.batch1281.v1288brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1288: bride mode
internal fun PlayerActivity.showV1288BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bride
    FeaturePrefsStore.batch1281.v1288bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1288: brief mode
internal fun PlayerActivity.showV1288BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1288brief
    FeaturePrefsStore.batch1281.v1288brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1288: bring level
internal fun PlayerActivity.showV1288BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1288: broad level
internal fun PlayerActivity.showV1288BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1288: broken level
internal fun PlayerActivity.showV1288BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1288: bronze level
internal fun PlayerActivity.showV1288BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1288: brook level
internal fun PlayerActivity.showV1288BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1288brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1288brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1288: brush mode
internal fun PlayerActivity.showV1288BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1288brush
    FeaturePrefsStore.batch1281.v1288brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1288: bubble mode
internal fun PlayerActivity.showV1288BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bubble
    FeaturePrefsStore.batch1281.v1288bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1288: bucket mode
internal fun PlayerActivity.showV1288BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1288bucket
    FeaturePrefsStore.batch1281.v1288bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1288: budget mode
internal fun PlayerActivity.showV1288BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1288budget
    FeaturePrefsStore.batch1281.v1288budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1288: buff mode
internal fun PlayerActivity.showV1288BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1288buff
    FeaturePrefsStore.batch1281.v1288buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1289: bread mode
internal fun PlayerActivity.showV1289BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bread
    FeaturePrefsStore.batch1281.v1289bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1289: breed mode
internal fun PlayerActivity.showV1289BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1289breed
    FeaturePrefsStore.batch1281.v1289breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1289: brick mode
internal fun PlayerActivity.showV1289BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1289brick
    FeaturePrefsStore.batch1281.v1289brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1289: bride mode
internal fun PlayerActivity.showV1289BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bride
    FeaturePrefsStore.batch1281.v1289bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1289: brief mode
internal fun PlayerActivity.showV1289BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1289brief
    FeaturePrefsStore.batch1281.v1289brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1289: bring level
internal fun PlayerActivity.showV1289BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1289: broad level
internal fun PlayerActivity.showV1289BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1289: broken level
internal fun PlayerActivity.showV1289BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1289: bronze level
internal fun PlayerActivity.showV1289BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1289: brook level
internal fun PlayerActivity.showV1289BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1289brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1289brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1289: brush mode
internal fun PlayerActivity.showV1289BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1289brush
    FeaturePrefsStore.batch1281.v1289brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1289: bubble mode
internal fun PlayerActivity.showV1289BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bubble
    FeaturePrefsStore.batch1281.v1289bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1289: bucket mode
internal fun PlayerActivity.showV1289BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1289bucket
    FeaturePrefsStore.batch1281.v1289bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1289: budget mode
internal fun PlayerActivity.showV1289BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1289budget
    FeaturePrefsStore.batch1281.v1289budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1289: buff mode
internal fun PlayerActivity.showV1289BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1289buff
    FeaturePrefsStore.batch1281.v1289buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

// v1290: bread mode
internal fun PlayerActivity.showV1290BreadToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bread
    FeaturePrefsStore.batch1281.v1290bread = !current
    AppToast.show(this, "bread: ${if (!current) "ON" else "OFF"}")
}

// v1290: breed mode
internal fun PlayerActivity.showV1290BreedToggle() {
    val current = FeaturePrefsStore.batch1281.v1290breed
    FeaturePrefsStore.batch1281.v1290breed = !current
    AppToast.show(this, "breed: ${if (!current) "ON" else "OFF"}")
}

// v1290: brick mode
internal fun PlayerActivity.showV1290BrickToggle() {
    val current = FeaturePrefsStore.batch1281.v1290brick
    FeaturePrefsStore.batch1281.v1290brick = !current
    AppToast.show(this, "brick: ${if (!current) "ON" else "OFF"}")
}

// v1290: bride mode
internal fun PlayerActivity.showV1290BrideToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bride
    FeaturePrefsStore.batch1281.v1290bride = !current
    AppToast.show(this, "bride: ${if (!current) "ON" else "OFF"}")
}

// v1290: brief mode
internal fun PlayerActivity.showV1290BriefToggle() {
    val current = FeaturePrefsStore.batch1281.v1290brief
    FeaturePrefsStore.batch1281.v1290brief = !current
    AppToast.show(this, "brief: ${if (!current) "ON" else "OFF"}")
}

// v1290: bring level
internal fun PlayerActivity.showV1290BringDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290bring).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bring level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290bring = value
        AppToast.show(this, "bring: $value")
    }
}

// v1290: broad level
internal fun PlayerActivity.showV1290BroadDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290broad).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broad level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290broad = value
        AppToast.show(this, "broad: $value")
    }
}

// v1290: broken level
internal fun PlayerActivity.showV1290BrokenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290broken).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "broken level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290broken = value
        AppToast.show(this, "broken: $value")
    }
}

// v1290: bronze level
internal fun PlayerActivity.showV1290BronzeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290bronze).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bronze level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290bronze = value
        AppToast.show(this, "bronze: $value")
    }
}

// v1290: brook level
internal fun PlayerActivity.showV1290BrookDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1281.v1290brook).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "brook level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1281.v1290brook = value
        AppToast.show(this, "brook: $value")
    }
}

// v1290: brush mode
internal fun PlayerActivity.showV1290BrushToggle() {
    val current = FeaturePrefsStore.batch1281.v1290brush
    FeaturePrefsStore.batch1281.v1290brush = !current
    AppToast.show(this, "brush: ${if (!current) "ON" else "OFF"}")
}

// v1290: bubble mode
internal fun PlayerActivity.showV1290BubbleToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bubble
    FeaturePrefsStore.batch1281.v1290bubble = !current
    AppToast.show(this, "bubble: ${if (!current) "ON" else "OFF"}")
}

// v1290: bucket mode
internal fun PlayerActivity.showV1290BucketToggle() {
    val current = FeaturePrefsStore.batch1281.v1290bucket
    FeaturePrefsStore.batch1281.v1290bucket = !current
    AppToast.show(this, "bucket: ${if (!current) "ON" else "OFF"}")
}

// v1290: budget mode
internal fun PlayerActivity.showV1290BudgetToggle() {
    val current = FeaturePrefsStore.batch1281.v1290budget
    FeaturePrefsStore.batch1281.v1290budget = !current
    AppToast.show(this, "budget: ${if (!current) "ON" else "OFF"}")
}

// v1290: buff mode
internal fun PlayerActivity.showV1290BuffToggle() {
    val current = FeaturePrefsStore.batch1281.v1290buff
    FeaturePrefsStore.batch1281.v1290buff = !current
    AppToast.show(this, "buff: ${if (!current) "ON" else "OFF"}")
}

