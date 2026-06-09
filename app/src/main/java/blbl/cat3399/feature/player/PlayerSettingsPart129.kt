package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1471: fork mode
internal fun PlayerActivity.showV1471ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fork
    FeaturePrefsStore.batch1471.v1471fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1471: formal mode
internal fun PlayerActivity.showV1471FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1471formal
    FeaturePrefsStore.batch1471.v1471formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1471: fortune mode
internal fun PlayerActivity.showV1471FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fortune
    FeaturePrefsStore.batch1471.v1471fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1471: forum mode
internal fun PlayerActivity.showV1471ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1471forum
    FeaturePrefsStore.batch1471.v1471forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1471: forward mode
internal fun PlayerActivity.showV1471ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1471forward
    FeaturePrefsStore.batch1471.v1471forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1471: fossil level
internal fun PlayerActivity.showV1471FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1471: found level
internal fun PlayerActivity.showV1471FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471found = value
        AppToast.show(this, "found: $value")
    }
}

// v1471: frank level
internal fun PlayerActivity.showV1471FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1471: fraud level
internal fun PlayerActivity.showV1471FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1471: fresh level
internal fun PlayerActivity.showV1471FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1471fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1471fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1471: frost mode
internal fun PlayerActivity.showV1471FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1471frost
    FeaturePrefsStore.batch1471.v1471frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1471: frozen mode
internal fun PlayerActivity.showV1471FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1471frozen
    FeaturePrefsStore.batch1471.v1471frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1471: fruit mode
internal fun PlayerActivity.showV1471FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fruit
    FeaturePrefsStore.batch1471.v1471fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1471: fuel mode
internal fun PlayerActivity.showV1471FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fuel
    FeaturePrefsStore.batch1471.v1471fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1471: fun mode
internal fun PlayerActivity.showV1471FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1471fun
    FeaturePrefsStore.batch1471.v1471fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1472: fork mode
internal fun PlayerActivity.showV1472ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fork
    FeaturePrefsStore.batch1471.v1472fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1472: formal mode
internal fun PlayerActivity.showV1472FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1472formal
    FeaturePrefsStore.batch1471.v1472formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1472: fortune mode
internal fun PlayerActivity.showV1472FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fortune
    FeaturePrefsStore.batch1471.v1472fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1472: forum mode
internal fun PlayerActivity.showV1472ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1472forum
    FeaturePrefsStore.batch1471.v1472forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1472: forward mode
internal fun PlayerActivity.showV1472ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1472forward
    FeaturePrefsStore.batch1471.v1472forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1472: fossil level
internal fun PlayerActivity.showV1472FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1472: found level
internal fun PlayerActivity.showV1472FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472found = value
        AppToast.show(this, "found: $value")
    }
}

// v1472: frank level
internal fun PlayerActivity.showV1472FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1472: fraud level
internal fun PlayerActivity.showV1472FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1472: fresh level
internal fun PlayerActivity.showV1472FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1472fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1472fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1472: frost mode
internal fun PlayerActivity.showV1472FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1472frost
    FeaturePrefsStore.batch1471.v1472frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1472: frozen mode
internal fun PlayerActivity.showV1472FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1472frozen
    FeaturePrefsStore.batch1471.v1472frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1472: fruit mode
internal fun PlayerActivity.showV1472FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fruit
    FeaturePrefsStore.batch1471.v1472fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1472: fuel mode
internal fun PlayerActivity.showV1472FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fuel
    FeaturePrefsStore.batch1471.v1472fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1472: fun mode
internal fun PlayerActivity.showV1472FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1472fun
    FeaturePrefsStore.batch1471.v1472fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1473: fork mode
internal fun PlayerActivity.showV1473ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fork
    FeaturePrefsStore.batch1471.v1473fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1473: formal mode
internal fun PlayerActivity.showV1473FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1473formal
    FeaturePrefsStore.batch1471.v1473formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1473: fortune mode
internal fun PlayerActivity.showV1473FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fortune
    FeaturePrefsStore.batch1471.v1473fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1473: forum mode
internal fun PlayerActivity.showV1473ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1473forum
    FeaturePrefsStore.batch1471.v1473forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1473: forward mode
internal fun PlayerActivity.showV1473ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1473forward
    FeaturePrefsStore.batch1471.v1473forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1473: fossil level
internal fun PlayerActivity.showV1473FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1473: found level
internal fun PlayerActivity.showV1473FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473found = value
        AppToast.show(this, "found: $value")
    }
}

// v1473: frank level
internal fun PlayerActivity.showV1473FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1473: fraud level
internal fun PlayerActivity.showV1473FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1473: fresh level
internal fun PlayerActivity.showV1473FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1473fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1473fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1473: frost mode
internal fun PlayerActivity.showV1473FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1473frost
    FeaturePrefsStore.batch1471.v1473frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1473: frozen mode
internal fun PlayerActivity.showV1473FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1473frozen
    FeaturePrefsStore.batch1471.v1473frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1473: fruit mode
internal fun PlayerActivity.showV1473FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fruit
    FeaturePrefsStore.batch1471.v1473fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1473: fuel mode
internal fun PlayerActivity.showV1473FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fuel
    FeaturePrefsStore.batch1471.v1473fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1473: fun mode
internal fun PlayerActivity.showV1473FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1473fun
    FeaturePrefsStore.batch1471.v1473fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1474: fork mode
internal fun PlayerActivity.showV1474ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fork
    FeaturePrefsStore.batch1471.v1474fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1474: formal mode
internal fun PlayerActivity.showV1474FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1474formal
    FeaturePrefsStore.batch1471.v1474formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1474: fortune mode
internal fun PlayerActivity.showV1474FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fortune
    FeaturePrefsStore.batch1471.v1474fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1474: forum mode
internal fun PlayerActivity.showV1474ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1474forum
    FeaturePrefsStore.batch1471.v1474forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1474: forward mode
internal fun PlayerActivity.showV1474ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1474forward
    FeaturePrefsStore.batch1471.v1474forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1474: fossil level
internal fun PlayerActivity.showV1474FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1474: found level
internal fun PlayerActivity.showV1474FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474found = value
        AppToast.show(this, "found: $value")
    }
}

// v1474: frank level
internal fun PlayerActivity.showV1474FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1474: fraud level
internal fun PlayerActivity.showV1474FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1474: fresh level
internal fun PlayerActivity.showV1474FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1474fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1474fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1474: frost mode
internal fun PlayerActivity.showV1474FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1474frost
    FeaturePrefsStore.batch1471.v1474frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1474: frozen mode
internal fun PlayerActivity.showV1474FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1474frozen
    FeaturePrefsStore.batch1471.v1474frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1474: fruit mode
internal fun PlayerActivity.showV1474FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fruit
    FeaturePrefsStore.batch1471.v1474fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1474: fuel mode
internal fun PlayerActivity.showV1474FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fuel
    FeaturePrefsStore.batch1471.v1474fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1474: fun mode
internal fun PlayerActivity.showV1474FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1474fun
    FeaturePrefsStore.batch1471.v1474fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1475: fork mode
internal fun PlayerActivity.showV1475ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fork
    FeaturePrefsStore.batch1471.v1475fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1475: formal mode
internal fun PlayerActivity.showV1475FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1475formal
    FeaturePrefsStore.batch1471.v1475formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1475: fortune mode
internal fun PlayerActivity.showV1475FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fortune
    FeaturePrefsStore.batch1471.v1475fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1475: forum mode
internal fun PlayerActivity.showV1475ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1475forum
    FeaturePrefsStore.batch1471.v1475forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1475: forward mode
internal fun PlayerActivity.showV1475ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1475forward
    FeaturePrefsStore.batch1471.v1475forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1475: fossil level
internal fun PlayerActivity.showV1475FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1475: found level
internal fun PlayerActivity.showV1475FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475found = value
        AppToast.show(this, "found: $value")
    }
}

// v1475: frank level
internal fun PlayerActivity.showV1475FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1475: fraud level
internal fun PlayerActivity.showV1475FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1475: fresh level
internal fun PlayerActivity.showV1475FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1475fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1475fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1475: frost mode
internal fun PlayerActivity.showV1475FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1475frost
    FeaturePrefsStore.batch1471.v1475frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1475: frozen mode
internal fun PlayerActivity.showV1475FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1475frozen
    FeaturePrefsStore.batch1471.v1475frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1475: fruit mode
internal fun PlayerActivity.showV1475FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fruit
    FeaturePrefsStore.batch1471.v1475fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1475: fuel mode
internal fun PlayerActivity.showV1475FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fuel
    FeaturePrefsStore.batch1471.v1475fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1475: fun mode
internal fun PlayerActivity.showV1475FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1475fun
    FeaturePrefsStore.batch1471.v1475fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1476: fork mode
internal fun PlayerActivity.showV1476ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fork
    FeaturePrefsStore.batch1471.v1476fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1476: formal mode
internal fun PlayerActivity.showV1476FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1476formal
    FeaturePrefsStore.batch1471.v1476formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1476: fortune mode
internal fun PlayerActivity.showV1476FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fortune
    FeaturePrefsStore.batch1471.v1476fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1476: forum mode
internal fun PlayerActivity.showV1476ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1476forum
    FeaturePrefsStore.batch1471.v1476forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1476: forward mode
internal fun PlayerActivity.showV1476ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1476forward
    FeaturePrefsStore.batch1471.v1476forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1476: fossil level
internal fun PlayerActivity.showV1476FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1476: found level
internal fun PlayerActivity.showV1476FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476found = value
        AppToast.show(this, "found: $value")
    }
}

// v1476: frank level
internal fun PlayerActivity.showV1476FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1476: fraud level
internal fun PlayerActivity.showV1476FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1476: fresh level
internal fun PlayerActivity.showV1476FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1476fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1476fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1476: frost mode
internal fun PlayerActivity.showV1476FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1476frost
    FeaturePrefsStore.batch1471.v1476frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1476: frozen mode
internal fun PlayerActivity.showV1476FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1476frozen
    FeaturePrefsStore.batch1471.v1476frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1476: fruit mode
internal fun PlayerActivity.showV1476FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fruit
    FeaturePrefsStore.batch1471.v1476fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1476: fuel mode
internal fun PlayerActivity.showV1476FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fuel
    FeaturePrefsStore.batch1471.v1476fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1476: fun mode
internal fun PlayerActivity.showV1476FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1476fun
    FeaturePrefsStore.batch1471.v1476fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1477: fork mode
internal fun PlayerActivity.showV1477ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fork
    FeaturePrefsStore.batch1471.v1477fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1477: formal mode
internal fun PlayerActivity.showV1477FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1477formal
    FeaturePrefsStore.batch1471.v1477formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1477: fortune mode
internal fun PlayerActivity.showV1477FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fortune
    FeaturePrefsStore.batch1471.v1477fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1477: forum mode
internal fun PlayerActivity.showV1477ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1477forum
    FeaturePrefsStore.batch1471.v1477forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1477: forward mode
internal fun PlayerActivity.showV1477ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1477forward
    FeaturePrefsStore.batch1471.v1477forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1477: fossil level
internal fun PlayerActivity.showV1477FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1477: found level
internal fun PlayerActivity.showV1477FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477found = value
        AppToast.show(this, "found: $value")
    }
}

// v1477: frank level
internal fun PlayerActivity.showV1477FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1477: fraud level
internal fun PlayerActivity.showV1477FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1477: fresh level
internal fun PlayerActivity.showV1477FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1477fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1477fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1477: frost mode
internal fun PlayerActivity.showV1477FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1477frost
    FeaturePrefsStore.batch1471.v1477frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1477: frozen mode
internal fun PlayerActivity.showV1477FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1477frozen
    FeaturePrefsStore.batch1471.v1477frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1477: fruit mode
internal fun PlayerActivity.showV1477FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fruit
    FeaturePrefsStore.batch1471.v1477fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1477: fuel mode
internal fun PlayerActivity.showV1477FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fuel
    FeaturePrefsStore.batch1471.v1477fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1477: fun mode
internal fun PlayerActivity.showV1477FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1477fun
    FeaturePrefsStore.batch1471.v1477fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1478: fork mode
internal fun PlayerActivity.showV1478ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fork
    FeaturePrefsStore.batch1471.v1478fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1478: formal mode
internal fun PlayerActivity.showV1478FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1478formal
    FeaturePrefsStore.batch1471.v1478formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1478: fortune mode
internal fun PlayerActivity.showV1478FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fortune
    FeaturePrefsStore.batch1471.v1478fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1478: forum mode
internal fun PlayerActivity.showV1478ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1478forum
    FeaturePrefsStore.batch1471.v1478forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1478: forward mode
internal fun PlayerActivity.showV1478ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1478forward
    FeaturePrefsStore.batch1471.v1478forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1478: fossil level
internal fun PlayerActivity.showV1478FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1478: found level
internal fun PlayerActivity.showV1478FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478found = value
        AppToast.show(this, "found: $value")
    }
}

// v1478: frank level
internal fun PlayerActivity.showV1478FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1478: fraud level
internal fun PlayerActivity.showV1478FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1478: fresh level
internal fun PlayerActivity.showV1478FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1478fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1478fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1478: frost mode
internal fun PlayerActivity.showV1478FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1478frost
    FeaturePrefsStore.batch1471.v1478frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1478: frozen mode
internal fun PlayerActivity.showV1478FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1478frozen
    FeaturePrefsStore.batch1471.v1478frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1478: fruit mode
internal fun PlayerActivity.showV1478FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fruit
    FeaturePrefsStore.batch1471.v1478fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1478: fuel mode
internal fun PlayerActivity.showV1478FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fuel
    FeaturePrefsStore.batch1471.v1478fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1478: fun mode
internal fun PlayerActivity.showV1478FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1478fun
    FeaturePrefsStore.batch1471.v1478fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1479: fork mode
internal fun PlayerActivity.showV1479ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fork
    FeaturePrefsStore.batch1471.v1479fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1479: formal mode
internal fun PlayerActivity.showV1479FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1479formal
    FeaturePrefsStore.batch1471.v1479formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1479: fortune mode
internal fun PlayerActivity.showV1479FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fortune
    FeaturePrefsStore.batch1471.v1479fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1479: forum mode
internal fun PlayerActivity.showV1479ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1479forum
    FeaturePrefsStore.batch1471.v1479forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1479: forward mode
internal fun PlayerActivity.showV1479ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1479forward
    FeaturePrefsStore.batch1471.v1479forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1479: fossil level
internal fun PlayerActivity.showV1479FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1479: found level
internal fun PlayerActivity.showV1479FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479found = value
        AppToast.show(this, "found: $value")
    }
}

// v1479: frank level
internal fun PlayerActivity.showV1479FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1479: fraud level
internal fun PlayerActivity.showV1479FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1479: fresh level
internal fun PlayerActivity.showV1479FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1479fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1479fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1479: frost mode
internal fun PlayerActivity.showV1479FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1479frost
    FeaturePrefsStore.batch1471.v1479frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1479: frozen mode
internal fun PlayerActivity.showV1479FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1479frozen
    FeaturePrefsStore.batch1471.v1479frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1479: fruit mode
internal fun PlayerActivity.showV1479FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fruit
    FeaturePrefsStore.batch1471.v1479fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1479: fuel mode
internal fun PlayerActivity.showV1479FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fuel
    FeaturePrefsStore.batch1471.v1479fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1479: fun mode
internal fun PlayerActivity.showV1479FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1479fun
    FeaturePrefsStore.batch1471.v1479fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

// v1480: fork mode
internal fun PlayerActivity.showV1480ForkToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fork
    FeaturePrefsStore.batch1471.v1480fork = !current
    AppToast.show(this, "fork: ${if (!current) "ON" else "OFF"}")
}

// v1480: formal mode
internal fun PlayerActivity.showV1480FormalToggle() {
    val current = FeaturePrefsStore.batch1471.v1480formal
    FeaturePrefsStore.batch1471.v1480formal = !current
    AppToast.show(this, "formal: ${if (!current) "ON" else "OFF"}")
}

// v1480: fortune mode
internal fun PlayerActivity.showV1480FortuneToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fortune
    FeaturePrefsStore.batch1471.v1480fortune = !current
    AppToast.show(this, "fortune: ${if (!current) "ON" else "OFF"}")
}

// v1480: forum mode
internal fun PlayerActivity.showV1480ForumToggle() {
    val current = FeaturePrefsStore.batch1471.v1480forum
    FeaturePrefsStore.batch1471.v1480forum = !current
    AppToast.show(this, "forum: ${if (!current) "ON" else "OFF"}")
}

// v1480: forward mode
internal fun PlayerActivity.showV1480ForwardToggle() {
    val current = FeaturePrefsStore.batch1471.v1480forward
    FeaturePrefsStore.batch1471.v1480forward = !current
    AppToast.show(this, "forward: ${if (!current) "ON" else "OFF"}")
}

// v1480: fossil level
internal fun PlayerActivity.showV1480FossilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480fossil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fossil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480fossil = value
        AppToast.show(this, "fossil: $value")
    }
}

// v1480: found level
internal fun PlayerActivity.showV1480FoundDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480found).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "found level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480found = value
        AppToast.show(this, "found: $value")
    }
}

// v1480: frank level
internal fun PlayerActivity.showV1480FrankDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480frank).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "frank level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480frank = value
        AppToast.show(this, "frank: $value")
    }
}

// v1480: fraud level
internal fun PlayerActivity.showV1480FraudDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480fraud).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fraud level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480fraud = value
        AppToast.show(this, "fraud: $value")
    }
}

// v1480: fresh level
internal fun PlayerActivity.showV1480FreshDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1471.v1480fresh).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "fresh level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1471.v1480fresh = value
        AppToast.show(this, "fresh: $value")
    }
}

// v1480: frost mode
internal fun PlayerActivity.showV1480FrostToggle() {
    val current = FeaturePrefsStore.batch1471.v1480frost
    FeaturePrefsStore.batch1471.v1480frost = !current
    AppToast.show(this, "frost: ${if (!current) "ON" else "OFF"}")
}

// v1480: frozen mode
internal fun PlayerActivity.showV1480FrozenToggle() {
    val current = FeaturePrefsStore.batch1471.v1480frozen
    FeaturePrefsStore.batch1471.v1480frozen = !current
    AppToast.show(this, "frozen: ${if (!current) "ON" else "OFF"}")
}

// v1480: fruit mode
internal fun PlayerActivity.showV1480FruitToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fruit
    FeaturePrefsStore.batch1471.v1480fruit = !current
    AppToast.show(this, "fruit: ${if (!current) "ON" else "OFF"}")
}

// v1480: fuel mode
internal fun PlayerActivity.showV1480FuelToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fuel
    FeaturePrefsStore.batch1471.v1480fuel = !current
    AppToast.show(this, "fuel: ${if (!current) "ON" else "OFF"}")
}

// v1480: fun mode
internal fun PlayerActivity.showV1480FunToggle() {
    val current = FeaturePrefsStore.batch1471.v1480fun
    FeaturePrefsStore.batch1471.v1480fun = !current
    AppToast.show(this, "fun: ${if (!current) "ON" else "OFF"}")
}

