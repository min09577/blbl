package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v921: mark mode
internal fun PlayerActivity.showV921MarkToggle() {
    val current = FeaturePrefsStore.batch921.v921mark
    FeaturePrefsStore.batch921.v921mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v921: mask mode
internal fun PlayerActivity.showV921MaskToggle() {
    val current = FeaturePrefsStore.batch921.v921mask
    FeaturePrefsStore.batch921.v921mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v921: master mode
internal fun PlayerActivity.showV921MasterToggle() {
    val current = FeaturePrefsStore.batch921.v921master
    FeaturePrefsStore.batch921.v921master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v921: match mode
internal fun PlayerActivity.showV921MatchToggle() {
    val current = FeaturePrefsStore.batch921.v921match
    FeaturePrefsStore.batch921.v921match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v921: math mode
internal fun PlayerActivity.showV921MathToggle() {
    val current = FeaturePrefsStore.batch921.v921math
    FeaturePrefsStore.batch921.v921math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v921: max level
internal fun PlayerActivity.showV921MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v921max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v921max = value
        AppToast.show(this, "max: $value")
    }
}

// v921: measure level
internal fun PlayerActivity.showV921MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v921measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v921measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v921: media level
internal fun PlayerActivity.showV921MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v921media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v921media = value
        AppToast.show(this, "media: $value")
    }
}

// v921: memory level
internal fun PlayerActivity.showV921MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v921memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v921memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v921: menu level
internal fun PlayerActivity.showV921MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v921menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v921menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v921: merge mode
internal fun PlayerActivity.showV921MergeToggle() {
    val current = FeaturePrefsStore.batch921.v921merge
    FeaturePrefsStore.batch921.v921merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v921: message mode
internal fun PlayerActivity.showV921MessageToggle() {
    val current = FeaturePrefsStore.batch921.v921message
    FeaturePrefsStore.batch921.v921message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v921: meta mode
internal fun PlayerActivity.showV921MetaToggle() {
    val current = FeaturePrefsStore.batch921.v921meta
    FeaturePrefsStore.batch921.v921meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v921: method mode
internal fun PlayerActivity.showV921MethodToggle() {
    val current = FeaturePrefsStore.batch921.v921method
    FeaturePrefsStore.batch921.v921method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v921: middle mode
internal fun PlayerActivity.showV921MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v921middle
    FeaturePrefsStore.batch921.v921middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v922: mark mode
internal fun PlayerActivity.showV922MarkToggle() {
    val current = FeaturePrefsStore.batch921.v922mark
    FeaturePrefsStore.batch921.v922mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v922: mask mode
internal fun PlayerActivity.showV922MaskToggle() {
    val current = FeaturePrefsStore.batch921.v922mask
    FeaturePrefsStore.batch921.v922mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v922: master mode
internal fun PlayerActivity.showV922MasterToggle() {
    val current = FeaturePrefsStore.batch921.v922master
    FeaturePrefsStore.batch921.v922master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v922: match mode
internal fun PlayerActivity.showV922MatchToggle() {
    val current = FeaturePrefsStore.batch921.v922match
    FeaturePrefsStore.batch921.v922match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v922: math mode
internal fun PlayerActivity.showV922MathToggle() {
    val current = FeaturePrefsStore.batch921.v922math
    FeaturePrefsStore.batch921.v922math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v922: max level
internal fun PlayerActivity.showV922MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v922max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v922max = value
        AppToast.show(this, "max: $value")
    }
}

// v922: measure level
internal fun PlayerActivity.showV922MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v922measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v922measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v922: media level
internal fun PlayerActivity.showV922MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v922media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v922media = value
        AppToast.show(this, "media: $value")
    }
}

// v922: memory level
internal fun PlayerActivity.showV922MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v922memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v922memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v922: menu level
internal fun PlayerActivity.showV922MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v922menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v922menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v922: merge mode
internal fun PlayerActivity.showV922MergeToggle() {
    val current = FeaturePrefsStore.batch921.v922merge
    FeaturePrefsStore.batch921.v922merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v922: message mode
internal fun PlayerActivity.showV922MessageToggle() {
    val current = FeaturePrefsStore.batch921.v922message
    FeaturePrefsStore.batch921.v922message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v922: meta mode
internal fun PlayerActivity.showV922MetaToggle() {
    val current = FeaturePrefsStore.batch921.v922meta
    FeaturePrefsStore.batch921.v922meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v922: method mode
internal fun PlayerActivity.showV922MethodToggle() {
    val current = FeaturePrefsStore.batch921.v922method
    FeaturePrefsStore.batch921.v922method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v922: middle mode
internal fun PlayerActivity.showV922MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v922middle
    FeaturePrefsStore.batch921.v922middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v923: mark mode
internal fun PlayerActivity.showV923MarkToggle() {
    val current = FeaturePrefsStore.batch921.v923mark
    FeaturePrefsStore.batch921.v923mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v923: mask mode
internal fun PlayerActivity.showV923MaskToggle() {
    val current = FeaturePrefsStore.batch921.v923mask
    FeaturePrefsStore.batch921.v923mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v923: master mode
internal fun PlayerActivity.showV923MasterToggle() {
    val current = FeaturePrefsStore.batch921.v923master
    FeaturePrefsStore.batch921.v923master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v923: match mode
internal fun PlayerActivity.showV923MatchToggle() {
    val current = FeaturePrefsStore.batch921.v923match
    FeaturePrefsStore.batch921.v923match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v923: math mode
internal fun PlayerActivity.showV923MathToggle() {
    val current = FeaturePrefsStore.batch921.v923math
    FeaturePrefsStore.batch921.v923math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v923: max level
internal fun PlayerActivity.showV923MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v923max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v923max = value
        AppToast.show(this, "max: $value")
    }
}

// v923: measure level
internal fun PlayerActivity.showV923MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v923measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v923measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v923: media level
internal fun PlayerActivity.showV923MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v923media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v923media = value
        AppToast.show(this, "media: $value")
    }
}

// v923: memory level
internal fun PlayerActivity.showV923MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v923memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v923memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v923: menu level
internal fun PlayerActivity.showV923MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v923menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v923menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v923: merge mode
internal fun PlayerActivity.showV923MergeToggle() {
    val current = FeaturePrefsStore.batch921.v923merge
    FeaturePrefsStore.batch921.v923merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v923: message mode
internal fun PlayerActivity.showV923MessageToggle() {
    val current = FeaturePrefsStore.batch921.v923message
    FeaturePrefsStore.batch921.v923message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v923: meta mode
internal fun PlayerActivity.showV923MetaToggle() {
    val current = FeaturePrefsStore.batch921.v923meta
    FeaturePrefsStore.batch921.v923meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v923: method mode
internal fun PlayerActivity.showV923MethodToggle() {
    val current = FeaturePrefsStore.batch921.v923method
    FeaturePrefsStore.batch921.v923method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v923: middle mode
internal fun PlayerActivity.showV923MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v923middle
    FeaturePrefsStore.batch921.v923middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v924: mark mode
internal fun PlayerActivity.showV924MarkToggle() {
    val current = FeaturePrefsStore.batch921.v924mark
    FeaturePrefsStore.batch921.v924mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v924: mask mode
internal fun PlayerActivity.showV924MaskToggle() {
    val current = FeaturePrefsStore.batch921.v924mask
    FeaturePrefsStore.batch921.v924mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v924: master mode
internal fun PlayerActivity.showV924MasterToggle() {
    val current = FeaturePrefsStore.batch921.v924master
    FeaturePrefsStore.batch921.v924master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v924: match mode
internal fun PlayerActivity.showV924MatchToggle() {
    val current = FeaturePrefsStore.batch921.v924match
    FeaturePrefsStore.batch921.v924match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v924: math mode
internal fun PlayerActivity.showV924MathToggle() {
    val current = FeaturePrefsStore.batch921.v924math
    FeaturePrefsStore.batch921.v924math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v924: max level
internal fun PlayerActivity.showV924MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v924max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v924max = value
        AppToast.show(this, "max: $value")
    }
}

// v924: measure level
internal fun PlayerActivity.showV924MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v924measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v924measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v924: media level
internal fun PlayerActivity.showV924MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v924media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v924media = value
        AppToast.show(this, "media: $value")
    }
}

// v924: memory level
internal fun PlayerActivity.showV924MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v924memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v924memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v924: menu level
internal fun PlayerActivity.showV924MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v924menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v924menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v924: merge mode
internal fun PlayerActivity.showV924MergeToggle() {
    val current = FeaturePrefsStore.batch921.v924merge
    FeaturePrefsStore.batch921.v924merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v924: message mode
internal fun PlayerActivity.showV924MessageToggle() {
    val current = FeaturePrefsStore.batch921.v924message
    FeaturePrefsStore.batch921.v924message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v924: meta mode
internal fun PlayerActivity.showV924MetaToggle() {
    val current = FeaturePrefsStore.batch921.v924meta
    FeaturePrefsStore.batch921.v924meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v924: method mode
internal fun PlayerActivity.showV924MethodToggle() {
    val current = FeaturePrefsStore.batch921.v924method
    FeaturePrefsStore.batch921.v924method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v924: middle mode
internal fun PlayerActivity.showV924MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v924middle
    FeaturePrefsStore.batch921.v924middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v925: mark mode
internal fun PlayerActivity.showV925MarkToggle() {
    val current = FeaturePrefsStore.batch921.v925mark
    FeaturePrefsStore.batch921.v925mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v925: mask mode
internal fun PlayerActivity.showV925MaskToggle() {
    val current = FeaturePrefsStore.batch921.v925mask
    FeaturePrefsStore.batch921.v925mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v925: master mode
internal fun PlayerActivity.showV925MasterToggle() {
    val current = FeaturePrefsStore.batch921.v925master
    FeaturePrefsStore.batch921.v925master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v925: match mode
internal fun PlayerActivity.showV925MatchToggle() {
    val current = FeaturePrefsStore.batch921.v925match
    FeaturePrefsStore.batch921.v925match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v925: math mode
internal fun PlayerActivity.showV925MathToggle() {
    val current = FeaturePrefsStore.batch921.v925math
    FeaturePrefsStore.batch921.v925math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v925: max level
internal fun PlayerActivity.showV925MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v925max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v925max = value
        AppToast.show(this, "max: $value")
    }
}

// v925: measure level
internal fun PlayerActivity.showV925MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v925measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v925measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v925: media level
internal fun PlayerActivity.showV925MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v925media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v925media = value
        AppToast.show(this, "media: $value")
    }
}

// v925: memory level
internal fun PlayerActivity.showV925MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v925memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v925memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v925: menu level
internal fun PlayerActivity.showV925MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v925menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v925menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v925: merge mode
internal fun PlayerActivity.showV925MergeToggle() {
    val current = FeaturePrefsStore.batch921.v925merge
    FeaturePrefsStore.batch921.v925merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v925: message mode
internal fun PlayerActivity.showV925MessageToggle() {
    val current = FeaturePrefsStore.batch921.v925message
    FeaturePrefsStore.batch921.v925message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v925: meta mode
internal fun PlayerActivity.showV925MetaToggle() {
    val current = FeaturePrefsStore.batch921.v925meta
    FeaturePrefsStore.batch921.v925meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v925: method mode
internal fun PlayerActivity.showV925MethodToggle() {
    val current = FeaturePrefsStore.batch921.v925method
    FeaturePrefsStore.batch921.v925method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v925: middle mode
internal fun PlayerActivity.showV925MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v925middle
    FeaturePrefsStore.batch921.v925middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v926: mark mode
internal fun PlayerActivity.showV926MarkToggle() {
    val current = FeaturePrefsStore.batch921.v926mark
    FeaturePrefsStore.batch921.v926mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v926: mask mode
internal fun PlayerActivity.showV926MaskToggle() {
    val current = FeaturePrefsStore.batch921.v926mask
    FeaturePrefsStore.batch921.v926mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v926: master mode
internal fun PlayerActivity.showV926MasterToggle() {
    val current = FeaturePrefsStore.batch921.v926master
    FeaturePrefsStore.batch921.v926master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v926: match mode
internal fun PlayerActivity.showV926MatchToggle() {
    val current = FeaturePrefsStore.batch921.v926match
    FeaturePrefsStore.batch921.v926match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v926: math mode
internal fun PlayerActivity.showV926MathToggle() {
    val current = FeaturePrefsStore.batch921.v926math
    FeaturePrefsStore.batch921.v926math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v926: max level
internal fun PlayerActivity.showV926MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v926max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v926max = value
        AppToast.show(this, "max: $value")
    }
}

// v926: measure level
internal fun PlayerActivity.showV926MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v926measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v926measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v926: media level
internal fun PlayerActivity.showV926MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v926media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v926media = value
        AppToast.show(this, "media: $value")
    }
}

// v926: memory level
internal fun PlayerActivity.showV926MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v926memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v926memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v926: menu level
internal fun PlayerActivity.showV926MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v926menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v926menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v926: merge mode
internal fun PlayerActivity.showV926MergeToggle() {
    val current = FeaturePrefsStore.batch921.v926merge
    FeaturePrefsStore.batch921.v926merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v926: message mode
internal fun PlayerActivity.showV926MessageToggle() {
    val current = FeaturePrefsStore.batch921.v926message
    FeaturePrefsStore.batch921.v926message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v926: meta mode
internal fun PlayerActivity.showV926MetaToggle() {
    val current = FeaturePrefsStore.batch921.v926meta
    FeaturePrefsStore.batch921.v926meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v926: method mode
internal fun PlayerActivity.showV926MethodToggle() {
    val current = FeaturePrefsStore.batch921.v926method
    FeaturePrefsStore.batch921.v926method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v926: middle mode
internal fun PlayerActivity.showV926MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v926middle
    FeaturePrefsStore.batch921.v926middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v927: mark mode
internal fun PlayerActivity.showV927MarkToggle() {
    val current = FeaturePrefsStore.batch921.v927mark
    FeaturePrefsStore.batch921.v927mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v927: mask mode
internal fun PlayerActivity.showV927MaskToggle() {
    val current = FeaturePrefsStore.batch921.v927mask
    FeaturePrefsStore.batch921.v927mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v927: master mode
internal fun PlayerActivity.showV927MasterToggle() {
    val current = FeaturePrefsStore.batch921.v927master
    FeaturePrefsStore.batch921.v927master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v927: match mode
internal fun PlayerActivity.showV927MatchToggle() {
    val current = FeaturePrefsStore.batch921.v927match
    FeaturePrefsStore.batch921.v927match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v927: math mode
internal fun PlayerActivity.showV927MathToggle() {
    val current = FeaturePrefsStore.batch921.v927math
    FeaturePrefsStore.batch921.v927math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v927: max level
internal fun PlayerActivity.showV927MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v927max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v927max = value
        AppToast.show(this, "max: $value")
    }
}

// v927: measure level
internal fun PlayerActivity.showV927MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v927measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v927measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v927: media level
internal fun PlayerActivity.showV927MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v927media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v927media = value
        AppToast.show(this, "media: $value")
    }
}

// v927: memory level
internal fun PlayerActivity.showV927MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v927memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v927memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v927: menu level
internal fun PlayerActivity.showV927MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v927menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v927menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v927: merge mode
internal fun PlayerActivity.showV927MergeToggle() {
    val current = FeaturePrefsStore.batch921.v927merge
    FeaturePrefsStore.batch921.v927merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v927: message mode
internal fun PlayerActivity.showV927MessageToggle() {
    val current = FeaturePrefsStore.batch921.v927message
    FeaturePrefsStore.batch921.v927message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v927: meta mode
internal fun PlayerActivity.showV927MetaToggle() {
    val current = FeaturePrefsStore.batch921.v927meta
    FeaturePrefsStore.batch921.v927meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v927: method mode
internal fun PlayerActivity.showV927MethodToggle() {
    val current = FeaturePrefsStore.batch921.v927method
    FeaturePrefsStore.batch921.v927method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v927: middle mode
internal fun PlayerActivity.showV927MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v927middle
    FeaturePrefsStore.batch921.v927middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v928: mark mode
internal fun PlayerActivity.showV928MarkToggle() {
    val current = FeaturePrefsStore.batch921.v928mark
    FeaturePrefsStore.batch921.v928mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v928: mask mode
internal fun PlayerActivity.showV928MaskToggle() {
    val current = FeaturePrefsStore.batch921.v928mask
    FeaturePrefsStore.batch921.v928mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v928: master mode
internal fun PlayerActivity.showV928MasterToggle() {
    val current = FeaturePrefsStore.batch921.v928master
    FeaturePrefsStore.batch921.v928master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v928: match mode
internal fun PlayerActivity.showV928MatchToggle() {
    val current = FeaturePrefsStore.batch921.v928match
    FeaturePrefsStore.batch921.v928match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v928: math mode
internal fun PlayerActivity.showV928MathToggle() {
    val current = FeaturePrefsStore.batch921.v928math
    FeaturePrefsStore.batch921.v928math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v928: max level
internal fun PlayerActivity.showV928MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v928max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v928max = value
        AppToast.show(this, "max: $value")
    }
}

// v928: measure level
internal fun PlayerActivity.showV928MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v928measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v928measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v928: media level
internal fun PlayerActivity.showV928MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v928media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v928media = value
        AppToast.show(this, "media: $value")
    }
}

// v928: memory level
internal fun PlayerActivity.showV928MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v928memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v928memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v928: menu level
internal fun PlayerActivity.showV928MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v928menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v928menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v928: merge mode
internal fun PlayerActivity.showV928MergeToggle() {
    val current = FeaturePrefsStore.batch921.v928merge
    FeaturePrefsStore.batch921.v928merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v928: message mode
internal fun PlayerActivity.showV928MessageToggle() {
    val current = FeaturePrefsStore.batch921.v928message
    FeaturePrefsStore.batch921.v928message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v928: meta mode
internal fun PlayerActivity.showV928MetaToggle() {
    val current = FeaturePrefsStore.batch921.v928meta
    FeaturePrefsStore.batch921.v928meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v928: method mode
internal fun PlayerActivity.showV928MethodToggle() {
    val current = FeaturePrefsStore.batch921.v928method
    FeaturePrefsStore.batch921.v928method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v928: middle mode
internal fun PlayerActivity.showV928MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v928middle
    FeaturePrefsStore.batch921.v928middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v929: mark mode
internal fun PlayerActivity.showV929MarkToggle() {
    val current = FeaturePrefsStore.batch921.v929mark
    FeaturePrefsStore.batch921.v929mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v929: mask mode
internal fun PlayerActivity.showV929MaskToggle() {
    val current = FeaturePrefsStore.batch921.v929mask
    FeaturePrefsStore.batch921.v929mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v929: master mode
internal fun PlayerActivity.showV929MasterToggle() {
    val current = FeaturePrefsStore.batch921.v929master
    FeaturePrefsStore.batch921.v929master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v929: match mode
internal fun PlayerActivity.showV929MatchToggle() {
    val current = FeaturePrefsStore.batch921.v929match
    FeaturePrefsStore.batch921.v929match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v929: math mode
internal fun PlayerActivity.showV929MathToggle() {
    val current = FeaturePrefsStore.batch921.v929math
    FeaturePrefsStore.batch921.v929math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v929: max level
internal fun PlayerActivity.showV929MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v929max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v929max = value
        AppToast.show(this, "max: $value")
    }
}

// v929: measure level
internal fun PlayerActivity.showV929MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v929measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v929measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v929: media level
internal fun PlayerActivity.showV929MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v929media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v929media = value
        AppToast.show(this, "media: $value")
    }
}

// v929: memory level
internal fun PlayerActivity.showV929MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v929memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v929memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v929: menu level
internal fun PlayerActivity.showV929MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v929menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v929menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v929: merge mode
internal fun PlayerActivity.showV929MergeToggle() {
    val current = FeaturePrefsStore.batch921.v929merge
    FeaturePrefsStore.batch921.v929merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v929: message mode
internal fun PlayerActivity.showV929MessageToggle() {
    val current = FeaturePrefsStore.batch921.v929message
    FeaturePrefsStore.batch921.v929message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v929: meta mode
internal fun PlayerActivity.showV929MetaToggle() {
    val current = FeaturePrefsStore.batch921.v929meta
    FeaturePrefsStore.batch921.v929meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v929: method mode
internal fun PlayerActivity.showV929MethodToggle() {
    val current = FeaturePrefsStore.batch921.v929method
    FeaturePrefsStore.batch921.v929method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v929: middle mode
internal fun PlayerActivity.showV929MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v929middle
    FeaturePrefsStore.batch921.v929middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

// v930: mark mode
internal fun PlayerActivity.showV930MarkToggle() {
    val current = FeaturePrefsStore.batch921.v930mark
    FeaturePrefsStore.batch921.v930mark = !current
    AppToast.show(this, "mark: ${if (!current) "ON" else "OFF"}")
}

// v930: mask mode
internal fun PlayerActivity.showV930MaskToggle() {
    val current = FeaturePrefsStore.batch921.v930mask
    FeaturePrefsStore.batch921.v930mask = !current
    AppToast.show(this, "mask: ${if (!current) "ON" else "OFF"}")
}

// v930: master mode
internal fun PlayerActivity.showV930MasterToggle() {
    val current = FeaturePrefsStore.batch921.v930master
    FeaturePrefsStore.batch921.v930master = !current
    AppToast.show(this, "master: ${if (!current) "ON" else "OFF"}")
}

// v930: match mode
internal fun PlayerActivity.showV930MatchToggle() {
    val current = FeaturePrefsStore.batch921.v930match
    FeaturePrefsStore.batch921.v930match = !current
    AppToast.show(this, "match: ${if (!current) "ON" else "OFF"}")
}

// v930: math mode
internal fun PlayerActivity.showV930MathToggle() {
    val current = FeaturePrefsStore.batch921.v930math
    FeaturePrefsStore.batch921.v930math = !current
    AppToast.show(this, "math: ${if (!current) "ON" else "OFF"}")
}

// v930: max level
internal fun PlayerActivity.showV930MaxDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v930max).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "max level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v930max = value
        AppToast.show(this, "max: $value")
    }
}

// v930: measure level
internal fun PlayerActivity.showV930MeasureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v930measure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "measure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v930measure = value
        AppToast.show(this, "measure: $value")
    }
}

// v930: media level
internal fun PlayerActivity.showV930MediaDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v930media).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "media level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v930media = value
        AppToast.show(this, "media: $value")
    }
}

// v930: memory level
internal fun PlayerActivity.showV930MemoryDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v930memory).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "memory level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v930memory = value
        AppToast.show(this, "memory: $value")
    }
}

// v930: menu level
internal fun PlayerActivity.showV930MenuDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch921.v930menu).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "menu level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch921.v930menu = value
        AppToast.show(this, "menu: $value")
    }
}

// v930: merge mode
internal fun PlayerActivity.showV930MergeToggle() {
    val current = FeaturePrefsStore.batch921.v930merge
    FeaturePrefsStore.batch921.v930merge = !current
    AppToast.show(this, "merge: ${if (!current) "ON" else "OFF"}")
}

// v930: message mode
internal fun PlayerActivity.showV930MessageToggle() {
    val current = FeaturePrefsStore.batch921.v930message
    FeaturePrefsStore.batch921.v930message = !current
    AppToast.show(this, "message: ${if (!current) "ON" else "OFF"}")
}

// v930: meta mode
internal fun PlayerActivity.showV930MetaToggle() {
    val current = FeaturePrefsStore.batch921.v930meta
    FeaturePrefsStore.batch921.v930meta = !current
    AppToast.show(this, "meta: ${if (!current) "ON" else "OFF"}")
}

// v930: method mode
internal fun PlayerActivity.showV930MethodToggle() {
    val current = FeaturePrefsStore.batch921.v930method
    FeaturePrefsStore.batch921.v930method = !current
    AppToast.show(this, "method: ${if (!current) "ON" else "OFF"}")
}

// v930: middle mode
internal fun PlayerActivity.showV930MiddleToggle() {
    val current = FeaturePrefsStore.batch921.v930middle
    FeaturePrefsStore.batch921.v930middle = !current
    AppToast.show(this, "middle: ${if (!current) "ON" else "OFF"}")
}

