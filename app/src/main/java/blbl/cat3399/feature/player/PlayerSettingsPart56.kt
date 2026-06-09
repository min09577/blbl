package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v751: complete mode
internal fun PlayerActivity.showV751CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v751complete
    FeaturePrefsStore.batch751.v751complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v751: compress mode
internal fun PlayerActivity.showV751CompressToggle() {
    val current = FeaturePrefsStore.batch751.v751compress
    FeaturePrefsStore.batch751.v751compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v751: compute mode
internal fun PlayerActivity.showV751ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v751compute
    FeaturePrefsStore.batch751.v751compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v751: concat mode
internal fun PlayerActivity.showV751ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v751concat
    FeaturePrefsStore.batch751.v751concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v751: concurrent mode
internal fun PlayerActivity.showV751ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v751concurrent
    FeaturePrefsStore.batch751.v751concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v751: condition level
internal fun PlayerActivity.showV751ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v751: configure level
internal fun PlayerActivity.showV751ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v751: confirm level
internal fun PlayerActivity.showV751ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v751: connect level
internal fun PlayerActivity.showV751ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v751: console level
internal fun PlayerActivity.showV751ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v751console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v751console = value
        AppToast.show(this, "console: $value")
    }
}

// v751: constant mode
internal fun PlayerActivity.showV751ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v751constant
    FeaturePrefsStore.batch751.v751constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v751: constraint mode
internal fun PlayerActivity.showV751ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v751constraint
    FeaturePrefsStore.batch751.v751constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v751: consume mode
internal fun PlayerActivity.showV751ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v751consume
    FeaturePrefsStore.batch751.v751consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v751: content mode
internal fun PlayerActivity.showV751ContentToggle() {
    val current = FeaturePrefsStore.batch751.v751content
    FeaturePrefsStore.batch751.v751content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v751: context mode
internal fun PlayerActivity.showV751ContextToggle() {
    val current = FeaturePrefsStore.batch751.v751context
    FeaturePrefsStore.batch751.v751context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v752: complete mode
internal fun PlayerActivity.showV752CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v752complete
    FeaturePrefsStore.batch751.v752complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v752: compress mode
internal fun PlayerActivity.showV752CompressToggle() {
    val current = FeaturePrefsStore.batch751.v752compress
    FeaturePrefsStore.batch751.v752compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v752: compute mode
internal fun PlayerActivity.showV752ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v752compute
    FeaturePrefsStore.batch751.v752compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v752: concat mode
internal fun PlayerActivity.showV752ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v752concat
    FeaturePrefsStore.batch751.v752concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v752: concurrent mode
internal fun PlayerActivity.showV752ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v752concurrent
    FeaturePrefsStore.batch751.v752concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v752: condition level
internal fun PlayerActivity.showV752ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v752: configure level
internal fun PlayerActivity.showV752ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v752: confirm level
internal fun PlayerActivity.showV752ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v752: connect level
internal fun PlayerActivity.showV752ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v752: console level
internal fun PlayerActivity.showV752ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v752console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v752console = value
        AppToast.show(this, "console: $value")
    }
}

// v752: constant mode
internal fun PlayerActivity.showV752ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v752constant
    FeaturePrefsStore.batch751.v752constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v752: constraint mode
internal fun PlayerActivity.showV752ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v752constraint
    FeaturePrefsStore.batch751.v752constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v752: consume mode
internal fun PlayerActivity.showV752ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v752consume
    FeaturePrefsStore.batch751.v752consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v752: content mode
internal fun PlayerActivity.showV752ContentToggle() {
    val current = FeaturePrefsStore.batch751.v752content
    FeaturePrefsStore.batch751.v752content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v752: context mode
internal fun PlayerActivity.showV752ContextToggle() {
    val current = FeaturePrefsStore.batch751.v752context
    FeaturePrefsStore.batch751.v752context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v753: complete mode
internal fun PlayerActivity.showV753CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v753complete
    FeaturePrefsStore.batch751.v753complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v753: compress mode
internal fun PlayerActivity.showV753CompressToggle() {
    val current = FeaturePrefsStore.batch751.v753compress
    FeaturePrefsStore.batch751.v753compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v753: compute mode
internal fun PlayerActivity.showV753ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v753compute
    FeaturePrefsStore.batch751.v753compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v753: concat mode
internal fun PlayerActivity.showV753ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v753concat
    FeaturePrefsStore.batch751.v753concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v753: concurrent mode
internal fun PlayerActivity.showV753ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v753concurrent
    FeaturePrefsStore.batch751.v753concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v753: condition level
internal fun PlayerActivity.showV753ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v753: configure level
internal fun PlayerActivity.showV753ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v753: confirm level
internal fun PlayerActivity.showV753ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v753: connect level
internal fun PlayerActivity.showV753ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v753: console level
internal fun PlayerActivity.showV753ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v753console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v753console = value
        AppToast.show(this, "console: $value")
    }
}

// v753: constant mode
internal fun PlayerActivity.showV753ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v753constant
    FeaturePrefsStore.batch751.v753constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v753: constraint mode
internal fun PlayerActivity.showV753ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v753constraint
    FeaturePrefsStore.batch751.v753constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v753: consume mode
internal fun PlayerActivity.showV753ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v753consume
    FeaturePrefsStore.batch751.v753consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v753: content mode
internal fun PlayerActivity.showV753ContentToggle() {
    val current = FeaturePrefsStore.batch751.v753content
    FeaturePrefsStore.batch751.v753content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v753: context mode
internal fun PlayerActivity.showV753ContextToggle() {
    val current = FeaturePrefsStore.batch751.v753context
    FeaturePrefsStore.batch751.v753context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v754: complete mode
internal fun PlayerActivity.showV754CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v754complete
    FeaturePrefsStore.batch751.v754complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v754: compress mode
internal fun PlayerActivity.showV754CompressToggle() {
    val current = FeaturePrefsStore.batch751.v754compress
    FeaturePrefsStore.batch751.v754compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v754: compute mode
internal fun PlayerActivity.showV754ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v754compute
    FeaturePrefsStore.batch751.v754compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v754: concat mode
internal fun PlayerActivity.showV754ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v754concat
    FeaturePrefsStore.batch751.v754concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v754: concurrent mode
internal fun PlayerActivity.showV754ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v754concurrent
    FeaturePrefsStore.batch751.v754concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v754: condition level
internal fun PlayerActivity.showV754ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v754: configure level
internal fun PlayerActivity.showV754ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v754: confirm level
internal fun PlayerActivity.showV754ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v754: connect level
internal fun PlayerActivity.showV754ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v754: console level
internal fun PlayerActivity.showV754ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v754console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v754console = value
        AppToast.show(this, "console: $value")
    }
}

// v754: constant mode
internal fun PlayerActivity.showV754ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v754constant
    FeaturePrefsStore.batch751.v754constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v754: constraint mode
internal fun PlayerActivity.showV754ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v754constraint
    FeaturePrefsStore.batch751.v754constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v754: consume mode
internal fun PlayerActivity.showV754ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v754consume
    FeaturePrefsStore.batch751.v754consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v754: content mode
internal fun PlayerActivity.showV754ContentToggle() {
    val current = FeaturePrefsStore.batch751.v754content
    FeaturePrefsStore.batch751.v754content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v754: context mode
internal fun PlayerActivity.showV754ContextToggle() {
    val current = FeaturePrefsStore.batch751.v754context
    FeaturePrefsStore.batch751.v754context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v755: complete mode
internal fun PlayerActivity.showV755CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v755complete
    FeaturePrefsStore.batch751.v755complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v755: compress mode
internal fun PlayerActivity.showV755CompressToggle() {
    val current = FeaturePrefsStore.batch751.v755compress
    FeaturePrefsStore.batch751.v755compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v755: compute mode
internal fun PlayerActivity.showV755ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v755compute
    FeaturePrefsStore.batch751.v755compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v755: concat mode
internal fun PlayerActivity.showV755ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v755concat
    FeaturePrefsStore.batch751.v755concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v755: concurrent mode
internal fun PlayerActivity.showV755ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v755concurrent
    FeaturePrefsStore.batch751.v755concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v755: condition level
internal fun PlayerActivity.showV755ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v755: configure level
internal fun PlayerActivity.showV755ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v755: confirm level
internal fun PlayerActivity.showV755ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v755: connect level
internal fun PlayerActivity.showV755ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v755: console level
internal fun PlayerActivity.showV755ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v755console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v755console = value
        AppToast.show(this, "console: $value")
    }
}

// v755: constant mode
internal fun PlayerActivity.showV755ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v755constant
    FeaturePrefsStore.batch751.v755constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v755: constraint mode
internal fun PlayerActivity.showV755ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v755constraint
    FeaturePrefsStore.batch751.v755constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v755: consume mode
internal fun PlayerActivity.showV755ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v755consume
    FeaturePrefsStore.batch751.v755consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v755: content mode
internal fun PlayerActivity.showV755ContentToggle() {
    val current = FeaturePrefsStore.batch751.v755content
    FeaturePrefsStore.batch751.v755content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v755: context mode
internal fun PlayerActivity.showV755ContextToggle() {
    val current = FeaturePrefsStore.batch751.v755context
    FeaturePrefsStore.batch751.v755context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v756: complete mode
internal fun PlayerActivity.showV756CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v756complete
    FeaturePrefsStore.batch751.v756complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v756: compress mode
internal fun PlayerActivity.showV756CompressToggle() {
    val current = FeaturePrefsStore.batch751.v756compress
    FeaturePrefsStore.batch751.v756compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v756: compute mode
internal fun PlayerActivity.showV756ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v756compute
    FeaturePrefsStore.batch751.v756compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v756: concat mode
internal fun PlayerActivity.showV756ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v756concat
    FeaturePrefsStore.batch751.v756concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v756: concurrent mode
internal fun PlayerActivity.showV756ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v756concurrent
    FeaturePrefsStore.batch751.v756concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v756: condition level
internal fun PlayerActivity.showV756ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v756: configure level
internal fun PlayerActivity.showV756ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v756: confirm level
internal fun PlayerActivity.showV756ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v756: connect level
internal fun PlayerActivity.showV756ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v756: console level
internal fun PlayerActivity.showV756ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v756console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v756console = value
        AppToast.show(this, "console: $value")
    }
}

// v756: constant mode
internal fun PlayerActivity.showV756ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v756constant
    FeaturePrefsStore.batch751.v756constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v756: constraint mode
internal fun PlayerActivity.showV756ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v756constraint
    FeaturePrefsStore.batch751.v756constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v756: consume mode
internal fun PlayerActivity.showV756ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v756consume
    FeaturePrefsStore.batch751.v756consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v756: content mode
internal fun PlayerActivity.showV756ContentToggle() {
    val current = FeaturePrefsStore.batch751.v756content
    FeaturePrefsStore.batch751.v756content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v756: context mode
internal fun PlayerActivity.showV756ContextToggle() {
    val current = FeaturePrefsStore.batch751.v756context
    FeaturePrefsStore.batch751.v756context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v757: complete mode
internal fun PlayerActivity.showV757CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v757complete
    FeaturePrefsStore.batch751.v757complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v757: compress mode
internal fun PlayerActivity.showV757CompressToggle() {
    val current = FeaturePrefsStore.batch751.v757compress
    FeaturePrefsStore.batch751.v757compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v757: compute mode
internal fun PlayerActivity.showV757ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v757compute
    FeaturePrefsStore.batch751.v757compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v757: concat mode
internal fun PlayerActivity.showV757ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v757concat
    FeaturePrefsStore.batch751.v757concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v757: concurrent mode
internal fun PlayerActivity.showV757ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v757concurrent
    FeaturePrefsStore.batch751.v757concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v757: condition level
internal fun PlayerActivity.showV757ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v757: configure level
internal fun PlayerActivity.showV757ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v757: confirm level
internal fun PlayerActivity.showV757ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v757: connect level
internal fun PlayerActivity.showV757ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v757: console level
internal fun PlayerActivity.showV757ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v757console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v757console = value
        AppToast.show(this, "console: $value")
    }
}

// v757: constant mode
internal fun PlayerActivity.showV757ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v757constant
    FeaturePrefsStore.batch751.v757constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v757: constraint mode
internal fun PlayerActivity.showV757ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v757constraint
    FeaturePrefsStore.batch751.v757constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v757: consume mode
internal fun PlayerActivity.showV757ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v757consume
    FeaturePrefsStore.batch751.v757consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v757: content mode
internal fun PlayerActivity.showV757ContentToggle() {
    val current = FeaturePrefsStore.batch751.v757content
    FeaturePrefsStore.batch751.v757content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v757: context mode
internal fun PlayerActivity.showV757ContextToggle() {
    val current = FeaturePrefsStore.batch751.v757context
    FeaturePrefsStore.batch751.v757context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v758: complete mode
internal fun PlayerActivity.showV758CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v758complete
    FeaturePrefsStore.batch751.v758complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v758: compress mode
internal fun PlayerActivity.showV758CompressToggle() {
    val current = FeaturePrefsStore.batch751.v758compress
    FeaturePrefsStore.batch751.v758compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v758: compute mode
internal fun PlayerActivity.showV758ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v758compute
    FeaturePrefsStore.batch751.v758compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v758: concat mode
internal fun PlayerActivity.showV758ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v758concat
    FeaturePrefsStore.batch751.v758concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v758: concurrent mode
internal fun PlayerActivity.showV758ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v758concurrent
    FeaturePrefsStore.batch751.v758concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v758: condition level
internal fun PlayerActivity.showV758ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v758: configure level
internal fun PlayerActivity.showV758ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v758: confirm level
internal fun PlayerActivity.showV758ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v758: connect level
internal fun PlayerActivity.showV758ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v758: console level
internal fun PlayerActivity.showV758ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v758console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v758console = value
        AppToast.show(this, "console: $value")
    }
}

// v758: constant mode
internal fun PlayerActivity.showV758ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v758constant
    FeaturePrefsStore.batch751.v758constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v758: constraint mode
internal fun PlayerActivity.showV758ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v758constraint
    FeaturePrefsStore.batch751.v758constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v758: consume mode
internal fun PlayerActivity.showV758ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v758consume
    FeaturePrefsStore.batch751.v758consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v758: content mode
internal fun PlayerActivity.showV758ContentToggle() {
    val current = FeaturePrefsStore.batch751.v758content
    FeaturePrefsStore.batch751.v758content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v758: context mode
internal fun PlayerActivity.showV758ContextToggle() {
    val current = FeaturePrefsStore.batch751.v758context
    FeaturePrefsStore.batch751.v758context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v759: complete mode
internal fun PlayerActivity.showV759CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v759complete
    FeaturePrefsStore.batch751.v759complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v759: compress mode
internal fun PlayerActivity.showV759CompressToggle() {
    val current = FeaturePrefsStore.batch751.v759compress
    FeaturePrefsStore.batch751.v759compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v759: compute mode
internal fun PlayerActivity.showV759ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v759compute
    FeaturePrefsStore.batch751.v759compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v759: concat mode
internal fun PlayerActivity.showV759ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v759concat
    FeaturePrefsStore.batch751.v759concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v759: concurrent mode
internal fun PlayerActivity.showV759ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v759concurrent
    FeaturePrefsStore.batch751.v759concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v759: condition level
internal fun PlayerActivity.showV759ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v759: configure level
internal fun PlayerActivity.showV759ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v759: confirm level
internal fun PlayerActivity.showV759ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v759: connect level
internal fun PlayerActivity.showV759ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v759: console level
internal fun PlayerActivity.showV759ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v759console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v759console = value
        AppToast.show(this, "console: $value")
    }
}

// v759: constant mode
internal fun PlayerActivity.showV759ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v759constant
    FeaturePrefsStore.batch751.v759constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v759: constraint mode
internal fun PlayerActivity.showV759ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v759constraint
    FeaturePrefsStore.batch751.v759constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v759: consume mode
internal fun PlayerActivity.showV759ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v759consume
    FeaturePrefsStore.batch751.v759consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v759: content mode
internal fun PlayerActivity.showV759ContentToggle() {
    val current = FeaturePrefsStore.batch751.v759content
    FeaturePrefsStore.batch751.v759content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v759: context mode
internal fun PlayerActivity.showV759ContextToggle() {
    val current = FeaturePrefsStore.batch751.v759context
    FeaturePrefsStore.batch751.v759context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

// v760: complete mode
internal fun PlayerActivity.showV760CompleteToggle() {
    val current = FeaturePrefsStore.batch751.v760complete
    FeaturePrefsStore.batch751.v760complete = !current
    AppToast.show(this, "complete: ${if (!current) "ON" else "OFF"}")
}

// v760: compress mode
internal fun PlayerActivity.showV760CompressToggle() {
    val current = FeaturePrefsStore.batch751.v760compress
    FeaturePrefsStore.batch751.v760compress = !current
    AppToast.show(this, "compress: ${if (!current) "ON" else "OFF"}")
}

// v760: compute mode
internal fun PlayerActivity.showV760ComputeToggle() {
    val current = FeaturePrefsStore.batch751.v760compute
    FeaturePrefsStore.batch751.v760compute = !current
    AppToast.show(this, "compute: ${if (!current) "ON" else "OFF"}")
}

// v760: concat mode
internal fun PlayerActivity.showV760ConcatToggle() {
    val current = FeaturePrefsStore.batch751.v760concat
    FeaturePrefsStore.batch751.v760concat = !current
    AppToast.show(this, "concat: ${if (!current) "ON" else "OFF"}")
}

// v760: concurrent mode
internal fun PlayerActivity.showV760ConcurrentToggle() {
    val current = FeaturePrefsStore.batch751.v760concurrent
    FeaturePrefsStore.batch751.v760concurrent = !current
    AppToast.show(this, "concurrent: ${if (!current) "ON" else "OFF"}")
}

// v760: condition level
internal fun PlayerActivity.showV760ConditionDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760condition).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "condition level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760condition = value
        AppToast.show(this, "condition: $value")
    }
}

// v760: configure level
internal fun PlayerActivity.showV760ConfigureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760configure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "configure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760configure = value
        AppToast.show(this, "configure: $value")
    }
}

// v760: confirm level
internal fun PlayerActivity.showV760ConfirmDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760confirm).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "confirm level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760confirm = value
        AppToast.show(this, "confirm: $value")
    }
}

// v760: connect level
internal fun PlayerActivity.showV760ConnectDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760connect).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "connect level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760connect = value
        AppToast.show(this, "connect: $value")
    }
}

// v760: console level
internal fun PlayerActivity.showV760ConsoleDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch751.v760console).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "console level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch751.v760console = value
        AppToast.show(this, "console: $value")
    }
}

// v760: constant mode
internal fun PlayerActivity.showV760ConstantToggle() {
    val current = FeaturePrefsStore.batch751.v760constant
    FeaturePrefsStore.batch751.v760constant = !current
    AppToast.show(this, "constant: ${if (!current) "ON" else "OFF"}")
}

// v760: constraint mode
internal fun PlayerActivity.showV760ConstraintToggle() {
    val current = FeaturePrefsStore.batch751.v760constraint
    FeaturePrefsStore.batch751.v760constraint = !current
    AppToast.show(this, "constraint: ${if (!current) "ON" else "OFF"}")
}

// v760: consume mode
internal fun PlayerActivity.showV760ConsumeToggle() {
    val current = FeaturePrefsStore.batch751.v760consume
    FeaturePrefsStore.batch751.v760consume = !current
    AppToast.show(this, "consume: ${if (!current) "ON" else "OFF"}")
}

// v760: content mode
internal fun PlayerActivity.showV760ContentToggle() {
    val current = FeaturePrefsStore.batch751.v760content
    FeaturePrefsStore.batch751.v760content = !current
    AppToast.show(this, "content: ${if (!current) "ON" else "OFF"}")
}

// v760: context mode
internal fun PlayerActivity.showV760ContextToggle() {
    val current = FeaturePrefsStore.batch751.v760context
    FeaturePrefsStore.batch751.v760context = !current
    AppToast.show(this, "context: ${if (!current) "ON" else "OFF"}")
}

