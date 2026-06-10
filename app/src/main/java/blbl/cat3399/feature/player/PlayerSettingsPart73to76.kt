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

// v941: near mode
internal fun PlayerActivity.showV941NearToggle() {
    val current = FeaturePrefsStore.batch941.v941near
    FeaturePrefsStore.batch941.v941near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v941: net mode
internal fun PlayerActivity.showV941NetToggle() {
    val current = FeaturePrefsStore.batch941.v941net
    FeaturePrefsStore.batch941.v941net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v941: network mode
internal fun PlayerActivity.showV941NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v941network
    FeaturePrefsStore.batch941.v941network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v941: new mode
internal fun PlayerActivity.showV941NewToggle() {
    val current = FeaturePrefsStore.batch941.v941new
    FeaturePrefsStore.batch941.v941new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v941: next mode
internal fun PlayerActivity.showV941NextToggle() {
    val current = FeaturePrefsStore.batch941.v941next
    FeaturePrefsStore.batch941.v941next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v941: node level
internal fun PlayerActivity.showV941NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941node = value
        AppToast.show(this, "node: $value")
    }
}

// v941: none level
internal fun PlayerActivity.showV941NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941none = value
        AppToast.show(this, "none: $value")
    }
}

// v941: normal level
internal fun PlayerActivity.showV941NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v941: notify level
internal fun PlayerActivity.showV941NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v941: null level
internal fun PlayerActivity.showV941NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v941null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v941null = value
        AppToast.show(this, "null: $value")
    }
}

// v941: number mode
internal fun PlayerActivity.showV941NumberToggle() {
    val current = FeaturePrefsStore.batch941.v941number
    FeaturePrefsStore.batch941.v941number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v941: object mode
internal fun PlayerActivity.showV941ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v941object
    FeaturePrefsStore.batch941.v941object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v941: observe mode
internal fun PlayerActivity.showV941ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v941observe
    FeaturePrefsStore.batch941.v941observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v941: offset mode
internal fun PlayerActivity.showV941OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v941offset
    FeaturePrefsStore.batch941.v941offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v941: old mode
internal fun PlayerActivity.showV941OldToggle() {
    val current = FeaturePrefsStore.batch941.v941old
    FeaturePrefsStore.batch941.v941old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v942: near mode
internal fun PlayerActivity.showV942NearToggle() {
    val current = FeaturePrefsStore.batch941.v942near
    FeaturePrefsStore.batch941.v942near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v942: net mode
internal fun PlayerActivity.showV942NetToggle() {
    val current = FeaturePrefsStore.batch941.v942net
    FeaturePrefsStore.batch941.v942net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v942: network mode
internal fun PlayerActivity.showV942NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v942network
    FeaturePrefsStore.batch941.v942network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v942: new mode
internal fun PlayerActivity.showV942NewToggle() {
    val current = FeaturePrefsStore.batch941.v942new
    FeaturePrefsStore.batch941.v942new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v942: next mode
internal fun PlayerActivity.showV942NextToggle() {
    val current = FeaturePrefsStore.batch941.v942next
    FeaturePrefsStore.batch941.v942next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v942: node level
internal fun PlayerActivity.showV942NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942node = value
        AppToast.show(this, "node: $value")
    }
}

// v942: none level
internal fun PlayerActivity.showV942NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942none = value
        AppToast.show(this, "none: $value")
    }
}

// v942: normal level
internal fun PlayerActivity.showV942NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v942: notify level
internal fun PlayerActivity.showV942NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v942: null level
internal fun PlayerActivity.showV942NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v942null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v942null = value
        AppToast.show(this, "null: $value")
    }
}

// v942: number mode
internal fun PlayerActivity.showV942NumberToggle() {
    val current = FeaturePrefsStore.batch941.v942number
    FeaturePrefsStore.batch941.v942number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v942: object mode
internal fun PlayerActivity.showV942ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v942object
    FeaturePrefsStore.batch941.v942object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v942: observe mode
internal fun PlayerActivity.showV942ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v942observe
    FeaturePrefsStore.batch941.v942observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v942: offset mode
internal fun PlayerActivity.showV942OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v942offset
    FeaturePrefsStore.batch941.v942offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v942: old mode
internal fun PlayerActivity.showV942OldToggle() {
    val current = FeaturePrefsStore.batch941.v942old
    FeaturePrefsStore.batch941.v942old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v943: near mode
internal fun PlayerActivity.showV943NearToggle() {
    val current = FeaturePrefsStore.batch941.v943near
    FeaturePrefsStore.batch941.v943near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v943: net mode
internal fun PlayerActivity.showV943NetToggle() {
    val current = FeaturePrefsStore.batch941.v943net
    FeaturePrefsStore.batch941.v943net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v943: network mode
internal fun PlayerActivity.showV943NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v943network
    FeaturePrefsStore.batch941.v943network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v943: new mode
internal fun PlayerActivity.showV943NewToggle() {
    val current = FeaturePrefsStore.batch941.v943new
    FeaturePrefsStore.batch941.v943new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v943: next mode
internal fun PlayerActivity.showV943NextToggle() {
    val current = FeaturePrefsStore.batch941.v943next
    FeaturePrefsStore.batch941.v943next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v943: node level
internal fun PlayerActivity.showV943NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943node = value
        AppToast.show(this, "node: $value")
    }
}

// v943: none level
internal fun PlayerActivity.showV943NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943none = value
        AppToast.show(this, "none: $value")
    }
}

// v943: normal level
internal fun PlayerActivity.showV943NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v943: notify level
internal fun PlayerActivity.showV943NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v943: null level
internal fun PlayerActivity.showV943NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v943null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v943null = value
        AppToast.show(this, "null: $value")
    }
}

// v943: number mode
internal fun PlayerActivity.showV943NumberToggle() {
    val current = FeaturePrefsStore.batch941.v943number
    FeaturePrefsStore.batch941.v943number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v943: object mode
internal fun PlayerActivity.showV943ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v943object
    FeaturePrefsStore.batch941.v943object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v943: observe mode
internal fun PlayerActivity.showV943ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v943observe
    FeaturePrefsStore.batch941.v943observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v943: offset mode
internal fun PlayerActivity.showV943OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v943offset
    FeaturePrefsStore.batch941.v943offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v943: old mode
internal fun PlayerActivity.showV943OldToggle() {
    val current = FeaturePrefsStore.batch941.v943old
    FeaturePrefsStore.batch941.v943old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v944: near mode
internal fun PlayerActivity.showV944NearToggle() {
    val current = FeaturePrefsStore.batch941.v944near
    FeaturePrefsStore.batch941.v944near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v944: net mode
internal fun PlayerActivity.showV944NetToggle() {
    val current = FeaturePrefsStore.batch941.v944net
    FeaturePrefsStore.batch941.v944net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v944: network mode
internal fun PlayerActivity.showV944NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v944network
    FeaturePrefsStore.batch941.v944network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v944: new mode
internal fun PlayerActivity.showV944NewToggle() {
    val current = FeaturePrefsStore.batch941.v944new
    FeaturePrefsStore.batch941.v944new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v944: next mode
internal fun PlayerActivity.showV944NextToggle() {
    val current = FeaturePrefsStore.batch941.v944next
    FeaturePrefsStore.batch941.v944next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v944: node level
internal fun PlayerActivity.showV944NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944node = value
        AppToast.show(this, "node: $value")
    }
}

// v944: none level
internal fun PlayerActivity.showV944NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944none = value
        AppToast.show(this, "none: $value")
    }
}

// v944: normal level
internal fun PlayerActivity.showV944NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v944: notify level
internal fun PlayerActivity.showV944NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v944: null level
internal fun PlayerActivity.showV944NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v944null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v944null = value
        AppToast.show(this, "null: $value")
    }
}

// v944: number mode
internal fun PlayerActivity.showV944NumberToggle() {
    val current = FeaturePrefsStore.batch941.v944number
    FeaturePrefsStore.batch941.v944number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v944: object mode
internal fun PlayerActivity.showV944ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v944object
    FeaturePrefsStore.batch941.v944object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v944: observe mode
internal fun PlayerActivity.showV944ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v944observe
    FeaturePrefsStore.batch941.v944observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v944: offset mode
internal fun PlayerActivity.showV944OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v944offset
    FeaturePrefsStore.batch941.v944offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v944: old mode
internal fun PlayerActivity.showV944OldToggle() {
    val current = FeaturePrefsStore.batch941.v944old
    FeaturePrefsStore.batch941.v944old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v945: near mode
internal fun PlayerActivity.showV945NearToggle() {
    val current = FeaturePrefsStore.batch941.v945near
    FeaturePrefsStore.batch941.v945near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v945: net mode
internal fun PlayerActivity.showV945NetToggle() {
    val current = FeaturePrefsStore.batch941.v945net
    FeaturePrefsStore.batch941.v945net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v945: network mode
internal fun PlayerActivity.showV945NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v945network
    FeaturePrefsStore.batch941.v945network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v945: new mode
internal fun PlayerActivity.showV945NewToggle() {
    val current = FeaturePrefsStore.batch941.v945new
    FeaturePrefsStore.batch941.v945new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v945: next mode
internal fun PlayerActivity.showV945NextToggle() {
    val current = FeaturePrefsStore.batch941.v945next
    FeaturePrefsStore.batch941.v945next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v945: node level
internal fun PlayerActivity.showV945NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945node = value
        AppToast.show(this, "node: $value")
    }
}

// v945: none level
internal fun PlayerActivity.showV945NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945none = value
        AppToast.show(this, "none: $value")
    }
}

// v945: normal level
internal fun PlayerActivity.showV945NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v945: notify level
internal fun PlayerActivity.showV945NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v945: null level
internal fun PlayerActivity.showV945NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v945null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v945null = value
        AppToast.show(this, "null: $value")
    }
}

// v945: number mode
internal fun PlayerActivity.showV945NumberToggle() {
    val current = FeaturePrefsStore.batch941.v945number
    FeaturePrefsStore.batch941.v945number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v945: object mode
internal fun PlayerActivity.showV945ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v945object
    FeaturePrefsStore.batch941.v945object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v945: observe mode
internal fun PlayerActivity.showV945ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v945observe
    FeaturePrefsStore.batch941.v945observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v945: offset mode
internal fun PlayerActivity.showV945OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v945offset
    FeaturePrefsStore.batch941.v945offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v945: old mode
internal fun PlayerActivity.showV945OldToggle() {
    val current = FeaturePrefsStore.batch941.v945old
    FeaturePrefsStore.batch941.v945old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v946: near mode
internal fun PlayerActivity.showV946NearToggle() {
    val current = FeaturePrefsStore.batch941.v946near
    FeaturePrefsStore.batch941.v946near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v946: net mode
internal fun PlayerActivity.showV946NetToggle() {
    val current = FeaturePrefsStore.batch941.v946net
    FeaturePrefsStore.batch941.v946net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v946: network mode
internal fun PlayerActivity.showV946NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v946network
    FeaturePrefsStore.batch941.v946network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v946: new mode
internal fun PlayerActivity.showV946NewToggle() {
    val current = FeaturePrefsStore.batch941.v946new
    FeaturePrefsStore.batch941.v946new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v946: next mode
internal fun PlayerActivity.showV946NextToggle() {
    val current = FeaturePrefsStore.batch941.v946next
    FeaturePrefsStore.batch941.v946next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v946: node level
internal fun PlayerActivity.showV946NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946node = value
        AppToast.show(this, "node: $value")
    }
}

// v946: none level
internal fun PlayerActivity.showV946NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946none = value
        AppToast.show(this, "none: $value")
    }
}

// v946: normal level
internal fun PlayerActivity.showV946NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v946: notify level
internal fun PlayerActivity.showV946NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v946: null level
internal fun PlayerActivity.showV946NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v946null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v946null = value
        AppToast.show(this, "null: $value")
    }
}

// v946: number mode
internal fun PlayerActivity.showV946NumberToggle() {
    val current = FeaturePrefsStore.batch941.v946number
    FeaturePrefsStore.batch941.v946number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v946: object mode
internal fun PlayerActivity.showV946ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v946object
    FeaturePrefsStore.batch941.v946object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v946: observe mode
internal fun PlayerActivity.showV946ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v946observe
    FeaturePrefsStore.batch941.v946observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v946: offset mode
internal fun PlayerActivity.showV946OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v946offset
    FeaturePrefsStore.batch941.v946offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v946: old mode
internal fun PlayerActivity.showV946OldToggle() {
    val current = FeaturePrefsStore.batch941.v946old
    FeaturePrefsStore.batch941.v946old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v947: near mode
internal fun PlayerActivity.showV947NearToggle() {
    val current = FeaturePrefsStore.batch941.v947near
    FeaturePrefsStore.batch941.v947near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v947: net mode
internal fun PlayerActivity.showV947NetToggle() {
    val current = FeaturePrefsStore.batch941.v947net
    FeaturePrefsStore.batch941.v947net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v947: network mode
internal fun PlayerActivity.showV947NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v947network
    FeaturePrefsStore.batch941.v947network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v947: new mode
internal fun PlayerActivity.showV947NewToggle() {
    val current = FeaturePrefsStore.batch941.v947new
    FeaturePrefsStore.batch941.v947new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v947: next mode
internal fun PlayerActivity.showV947NextToggle() {
    val current = FeaturePrefsStore.batch941.v947next
    FeaturePrefsStore.batch941.v947next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v947: node level
internal fun PlayerActivity.showV947NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947node = value
        AppToast.show(this, "node: $value")
    }
}

// v947: none level
internal fun PlayerActivity.showV947NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947none = value
        AppToast.show(this, "none: $value")
    }
}

// v947: normal level
internal fun PlayerActivity.showV947NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v947: notify level
internal fun PlayerActivity.showV947NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v947: null level
internal fun PlayerActivity.showV947NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v947null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v947null = value
        AppToast.show(this, "null: $value")
    }
}

// v947: number mode
internal fun PlayerActivity.showV947NumberToggle() {
    val current = FeaturePrefsStore.batch941.v947number
    FeaturePrefsStore.batch941.v947number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v947: object mode
internal fun PlayerActivity.showV947ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v947object
    FeaturePrefsStore.batch941.v947object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v947: observe mode
internal fun PlayerActivity.showV947ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v947observe
    FeaturePrefsStore.batch941.v947observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v947: offset mode
internal fun PlayerActivity.showV947OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v947offset
    FeaturePrefsStore.batch941.v947offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v947: old mode
internal fun PlayerActivity.showV947OldToggle() {
    val current = FeaturePrefsStore.batch941.v947old
    FeaturePrefsStore.batch941.v947old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v948: near mode
internal fun PlayerActivity.showV948NearToggle() {
    val current = FeaturePrefsStore.batch941.v948near
    FeaturePrefsStore.batch941.v948near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v948: net mode
internal fun PlayerActivity.showV948NetToggle() {
    val current = FeaturePrefsStore.batch941.v948net
    FeaturePrefsStore.batch941.v948net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v948: network mode
internal fun PlayerActivity.showV948NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v948network
    FeaturePrefsStore.batch941.v948network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v948: new mode
internal fun PlayerActivity.showV948NewToggle() {
    val current = FeaturePrefsStore.batch941.v948new
    FeaturePrefsStore.batch941.v948new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v948: next mode
internal fun PlayerActivity.showV948NextToggle() {
    val current = FeaturePrefsStore.batch941.v948next
    FeaturePrefsStore.batch941.v948next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v948: node level
internal fun PlayerActivity.showV948NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948node = value
        AppToast.show(this, "node: $value")
    }
}

// v948: none level
internal fun PlayerActivity.showV948NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948none = value
        AppToast.show(this, "none: $value")
    }
}

// v948: normal level
internal fun PlayerActivity.showV948NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v948: notify level
internal fun PlayerActivity.showV948NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v948: null level
internal fun PlayerActivity.showV948NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v948null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v948null = value
        AppToast.show(this, "null: $value")
    }
}

// v948: number mode
internal fun PlayerActivity.showV948NumberToggle() {
    val current = FeaturePrefsStore.batch941.v948number
    FeaturePrefsStore.batch941.v948number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v948: object mode
internal fun PlayerActivity.showV948ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v948object
    FeaturePrefsStore.batch941.v948object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v948: observe mode
internal fun PlayerActivity.showV948ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v948observe
    FeaturePrefsStore.batch941.v948observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v948: offset mode
internal fun PlayerActivity.showV948OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v948offset
    FeaturePrefsStore.batch941.v948offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v948: old mode
internal fun PlayerActivity.showV948OldToggle() {
    val current = FeaturePrefsStore.batch941.v948old
    FeaturePrefsStore.batch941.v948old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v949: near mode
internal fun PlayerActivity.showV949NearToggle() {
    val current = FeaturePrefsStore.batch941.v949near
    FeaturePrefsStore.batch941.v949near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v949: net mode
internal fun PlayerActivity.showV949NetToggle() {
    val current = FeaturePrefsStore.batch941.v949net
    FeaturePrefsStore.batch941.v949net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v949: network mode
internal fun PlayerActivity.showV949NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v949network
    FeaturePrefsStore.batch941.v949network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v949: new mode
internal fun PlayerActivity.showV949NewToggle() {
    val current = FeaturePrefsStore.batch941.v949new
    FeaturePrefsStore.batch941.v949new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v949: next mode
internal fun PlayerActivity.showV949NextToggle() {
    val current = FeaturePrefsStore.batch941.v949next
    FeaturePrefsStore.batch941.v949next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v949: node level
internal fun PlayerActivity.showV949NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949node = value
        AppToast.show(this, "node: $value")
    }
}

// v949: none level
internal fun PlayerActivity.showV949NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949none = value
        AppToast.show(this, "none: $value")
    }
}

// v949: normal level
internal fun PlayerActivity.showV949NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v949: notify level
internal fun PlayerActivity.showV949NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v949: null level
internal fun PlayerActivity.showV949NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v949null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v949null = value
        AppToast.show(this, "null: $value")
    }
}

// v949: number mode
internal fun PlayerActivity.showV949NumberToggle() {
    val current = FeaturePrefsStore.batch941.v949number
    FeaturePrefsStore.batch941.v949number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v949: object mode
internal fun PlayerActivity.showV949ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v949object
    FeaturePrefsStore.batch941.v949object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v949: observe mode
internal fun PlayerActivity.showV949ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v949observe
    FeaturePrefsStore.batch941.v949observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v949: offset mode
internal fun PlayerActivity.showV949OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v949offset
    FeaturePrefsStore.batch941.v949offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v949: old mode
internal fun PlayerActivity.showV949OldToggle() {
    val current = FeaturePrefsStore.batch941.v949old
    FeaturePrefsStore.batch941.v949old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v950: near mode
internal fun PlayerActivity.showV950NearToggle() {
    val current = FeaturePrefsStore.batch941.v950near
    FeaturePrefsStore.batch941.v950near = !current
    AppToast.show(this, "near: ${if (!current) "ON" else "OFF"}")
}

// v950: net mode
internal fun PlayerActivity.showV950NetToggle() {
    val current = FeaturePrefsStore.batch941.v950net
    FeaturePrefsStore.batch941.v950net = !current
    AppToast.show(this, "net: ${if (!current) "ON" else "OFF"}")
}

// v950: network mode
internal fun PlayerActivity.showV950NetworkToggle() {
    val current = FeaturePrefsStore.batch941.v950network
    FeaturePrefsStore.batch941.v950network = !current
    AppToast.show(this, "network: ${if (!current) "ON" else "OFF"}")
}

// v950: new mode
internal fun PlayerActivity.showV950NewToggle() {
    val current = FeaturePrefsStore.batch941.v950new
    FeaturePrefsStore.batch941.v950new = !current
    AppToast.show(this, "new: ${if (!current) "ON" else "OFF"}")
}

// v950: next mode
internal fun PlayerActivity.showV950NextToggle() {
    val current = FeaturePrefsStore.batch941.v950next
    FeaturePrefsStore.batch941.v950next = !current
    AppToast.show(this, "next: ${if (!current) "ON" else "OFF"}")
}

// v950: node level
internal fun PlayerActivity.showV950NodeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950node).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "node level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950node = value
        AppToast.show(this, "node: $value")
    }
}

// v950: none level
internal fun PlayerActivity.showV950NoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950none).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "none level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950none = value
        AppToast.show(this, "none: $value")
    }
}

// v950: normal level
internal fun PlayerActivity.showV950NormalDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950normal).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "normal level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950normal = value
        AppToast.show(this, "normal: $value")
    }
}

// v950: notify level
internal fun PlayerActivity.showV950NotifyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950notify).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "notify level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950notify = value
        AppToast.show(this, "notify: $value")
    }
}

// v950: null level
internal fun PlayerActivity.showV950NullDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch941.v950null).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "null level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch941.v950null = value
        AppToast.show(this, "null: $value")
    }
}

// v950: number mode
internal fun PlayerActivity.showV950NumberToggle() {
    val current = FeaturePrefsStore.batch941.v950number
    FeaturePrefsStore.batch941.v950number = !current
    AppToast.show(this, "number: ${if (!current) "ON" else "OFF"}")
}

// v950: object mode
internal fun PlayerActivity.showV950ObjectToggle() {
    val current = FeaturePrefsStore.batch941.v950object
    FeaturePrefsStore.batch941.v950object = !current
    AppToast.show(this, "object: ${if (!current) "ON" else "OFF"}")
}

// v950: observe mode
internal fun PlayerActivity.showV950ObserveToggle() {
    val current = FeaturePrefsStore.batch941.v950observe
    FeaturePrefsStore.batch941.v950observe = !current
    AppToast.show(this, "observe: ${if (!current) "ON" else "OFF"}")
}

// v950: offset mode
internal fun PlayerActivity.showV950OffsetToggle() {
    val current = FeaturePrefsStore.batch941.v950offset
    FeaturePrefsStore.batch941.v950offset = !current
    AppToast.show(this, "offset: ${if (!current) "ON" else "OFF"}")
}

// v950: old mode
internal fun PlayerActivity.showV950OldToggle() {
    val current = FeaturePrefsStore.batch941.v950old
    FeaturePrefsStore.batch941.v950old = !current
    AppToast.show(this, "old: ${if (!current) "ON" else "OFF"}")
}

// v951: open mode
internal fun PlayerActivity.showV951OpenToggle() {
    val current = FeaturePrefsStore.batch951.v951open
    FeaturePrefsStore.batch951.v951open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v951: operate mode
internal fun PlayerActivity.showV951OperateToggle() {
    val current = FeaturePrefsStore.batch951.v951operate
    FeaturePrefsStore.batch951.v951operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v951: option mode
internal fun PlayerActivity.showV951OptionToggle() {
    val current = FeaturePrefsStore.batch951.v951option
    FeaturePrefsStore.batch951.v951option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v951: orbit mode
internal fun PlayerActivity.showV951OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v951orbit
    FeaturePrefsStore.batch951.v951orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v951: order mode
internal fun PlayerActivity.showV951OrderToggle() {
    val current = FeaturePrefsStore.batch951.v951order
    FeaturePrefsStore.batch951.v951order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v951: origin level
internal fun PlayerActivity.showV951OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v951: out level
internal fun PlayerActivity.showV951OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951out = value
        AppToast.show(this, "out: $value")
    }
}

// v951: output level
internal fun PlayerActivity.showV951OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951output = value
        AppToast.show(this, "output: $value")
    }
}

// v951: overlay level
internal fun PlayerActivity.showV951OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v951: owner level
internal fun PlayerActivity.showV951OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v951owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v951owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v951: pack mode
internal fun PlayerActivity.showV951PackToggle() {
    val current = FeaturePrefsStore.batch951.v951pack
    FeaturePrefsStore.batch951.v951pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v951: package mode
internal fun PlayerActivity.showV951PackageToggle() {
    val current = FeaturePrefsStore.batch951.v951package
    FeaturePrefsStore.batch951.v951package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v951: page mode
internal fun PlayerActivity.showV951PageToggle() {
    val current = FeaturePrefsStore.batch951.v951page
    FeaturePrefsStore.batch951.v951page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v951: paint mode
internal fun PlayerActivity.showV951PaintToggle() {
    val current = FeaturePrefsStore.batch951.v951paint
    FeaturePrefsStore.batch951.v951paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v951: pair mode
internal fun PlayerActivity.showV951PairToggle() {
    val current = FeaturePrefsStore.batch951.v951pair
    FeaturePrefsStore.batch951.v951pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v952: open mode
internal fun PlayerActivity.showV952OpenToggle() {
    val current = FeaturePrefsStore.batch951.v952open
    FeaturePrefsStore.batch951.v952open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v952: operate mode
internal fun PlayerActivity.showV952OperateToggle() {
    val current = FeaturePrefsStore.batch951.v952operate
    FeaturePrefsStore.batch951.v952operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v952: option mode
internal fun PlayerActivity.showV952OptionToggle() {
    val current = FeaturePrefsStore.batch951.v952option
    FeaturePrefsStore.batch951.v952option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v952: orbit mode
internal fun PlayerActivity.showV952OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v952orbit
    FeaturePrefsStore.batch951.v952orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v952: order mode
internal fun PlayerActivity.showV952OrderToggle() {
    val current = FeaturePrefsStore.batch951.v952order
    FeaturePrefsStore.batch951.v952order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v952: origin level
internal fun PlayerActivity.showV952OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v952: out level
internal fun PlayerActivity.showV952OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952out = value
        AppToast.show(this, "out: $value")
    }
}

// v952: output level
internal fun PlayerActivity.showV952OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952output = value
        AppToast.show(this, "output: $value")
    }
}

// v952: overlay level
internal fun PlayerActivity.showV952OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v952: owner level
internal fun PlayerActivity.showV952OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v952owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v952owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v952: pack mode
internal fun PlayerActivity.showV952PackToggle() {
    val current = FeaturePrefsStore.batch951.v952pack
    FeaturePrefsStore.batch951.v952pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v952: package mode
internal fun PlayerActivity.showV952PackageToggle() {
    val current = FeaturePrefsStore.batch951.v952package
    FeaturePrefsStore.batch951.v952package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v952: page mode
internal fun PlayerActivity.showV952PageToggle() {
    val current = FeaturePrefsStore.batch951.v952page
    FeaturePrefsStore.batch951.v952page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v952: paint mode
internal fun PlayerActivity.showV952PaintToggle() {
    val current = FeaturePrefsStore.batch951.v952paint
    FeaturePrefsStore.batch951.v952paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v952: pair mode
internal fun PlayerActivity.showV952PairToggle() {
    val current = FeaturePrefsStore.batch951.v952pair
    FeaturePrefsStore.batch951.v952pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v953: open mode
internal fun PlayerActivity.showV953OpenToggle() {
    val current = FeaturePrefsStore.batch951.v953open
    FeaturePrefsStore.batch951.v953open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v953: operate mode
internal fun PlayerActivity.showV953OperateToggle() {
    val current = FeaturePrefsStore.batch951.v953operate
    FeaturePrefsStore.batch951.v953operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v953: option mode
internal fun PlayerActivity.showV953OptionToggle() {
    val current = FeaturePrefsStore.batch951.v953option
    FeaturePrefsStore.batch951.v953option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v953: orbit mode
internal fun PlayerActivity.showV953OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v953orbit
    FeaturePrefsStore.batch951.v953orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v953: order mode
internal fun PlayerActivity.showV953OrderToggle() {
    val current = FeaturePrefsStore.batch951.v953order
    FeaturePrefsStore.batch951.v953order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v953: origin level
internal fun PlayerActivity.showV953OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v953: out level
internal fun PlayerActivity.showV953OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953out = value
        AppToast.show(this, "out: $value")
    }
}

// v953: output level
internal fun PlayerActivity.showV953OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953output = value
        AppToast.show(this, "output: $value")
    }
}

// v953: overlay level
internal fun PlayerActivity.showV953OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v953: owner level
internal fun PlayerActivity.showV953OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v953owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v953owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v953: pack mode
internal fun PlayerActivity.showV953PackToggle() {
    val current = FeaturePrefsStore.batch951.v953pack
    FeaturePrefsStore.batch951.v953pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v953: package mode
internal fun PlayerActivity.showV953PackageToggle() {
    val current = FeaturePrefsStore.batch951.v953package
    FeaturePrefsStore.batch951.v953package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v953: page mode
internal fun PlayerActivity.showV953PageToggle() {
    val current = FeaturePrefsStore.batch951.v953page
    FeaturePrefsStore.batch951.v953page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v953: paint mode
internal fun PlayerActivity.showV953PaintToggle() {
    val current = FeaturePrefsStore.batch951.v953paint
    FeaturePrefsStore.batch951.v953paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v953: pair mode
internal fun PlayerActivity.showV953PairToggle() {
    val current = FeaturePrefsStore.batch951.v953pair
    FeaturePrefsStore.batch951.v953pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v954: open mode
internal fun PlayerActivity.showV954OpenToggle() {
    val current = FeaturePrefsStore.batch951.v954open
    FeaturePrefsStore.batch951.v954open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v954: operate mode
internal fun PlayerActivity.showV954OperateToggle() {
    val current = FeaturePrefsStore.batch951.v954operate
    FeaturePrefsStore.batch951.v954operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v954: option mode
internal fun PlayerActivity.showV954OptionToggle() {
    val current = FeaturePrefsStore.batch951.v954option
    FeaturePrefsStore.batch951.v954option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v954: orbit mode
internal fun PlayerActivity.showV954OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v954orbit
    FeaturePrefsStore.batch951.v954orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v954: order mode
internal fun PlayerActivity.showV954OrderToggle() {
    val current = FeaturePrefsStore.batch951.v954order
    FeaturePrefsStore.batch951.v954order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v954: origin level
internal fun PlayerActivity.showV954OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v954: out level
internal fun PlayerActivity.showV954OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954out = value
        AppToast.show(this, "out: $value")
    }
}

// v954: output level
internal fun PlayerActivity.showV954OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954output = value
        AppToast.show(this, "output: $value")
    }
}

// v954: overlay level
internal fun PlayerActivity.showV954OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v954: owner level
internal fun PlayerActivity.showV954OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v954owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v954owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v954: pack mode
internal fun PlayerActivity.showV954PackToggle() {
    val current = FeaturePrefsStore.batch951.v954pack
    FeaturePrefsStore.batch951.v954pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v954: package mode
internal fun PlayerActivity.showV954PackageToggle() {
    val current = FeaturePrefsStore.batch951.v954package
    FeaturePrefsStore.batch951.v954package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v954: page mode
internal fun PlayerActivity.showV954PageToggle() {
    val current = FeaturePrefsStore.batch951.v954page
    FeaturePrefsStore.batch951.v954page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v954: paint mode
internal fun PlayerActivity.showV954PaintToggle() {
    val current = FeaturePrefsStore.batch951.v954paint
    FeaturePrefsStore.batch951.v954paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v954: pair mode
internal fun PlayerActivity.showV954PairToggle() {
    val current = FeaturePrefsStore.batch951.v954pair
    FeaturePrefsStore.batch951.v954pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v955: open mode
internal fun PlayerActivity.showV955OpenToggle() {
    val current = FeaturePrefsStore.batch951.v955open
    FeaturePrefsStore.batch951.v955open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v955: operate mode
internal fun PlayerActivity.showV955OperateToggle() {
    val current = FeaturePrefsStore.batch951.v955operate
    FeaturePrefsStore.batch951.v955operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v955: option mode
internal fun PlayerActivity.showV955OptionToggle() {
    val current = FeaturePrefsStore.batch951.v955option
    FeaturePrefsStore.batch951.v955option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v955: orbit mode
internal fun PlayerActivity.showV955OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v955orbit
    FeaturePrefsStore.batch951.v955orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v955: order mode
internal fun PlayerActivity.showV955OrderToggle() {
    val current = FeaturePrefsStore.batch951.v955order
    FeaturePrefsStore.batch951.v955order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v955: origin level
internal fun PlayerActivity.showV955OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v955: out level
internal fun PlayerActivity.showV955OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955out = value
        AppToast.show(this, "out: $value")
    }
}

// v955: output level
internal fun PlayerActivity.showV955OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955output = value
        AppToast.show(this, "output: $value")
    }
}

// v955: overlay level
internal fun PlayerActivity.showV955OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v955: owner level
internal fun PlayerActivity.showV955OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v955owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v955owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v955: pack mode
internal fun PlayerActivity.showV955PackToggle() {
    val current = FeaturePrefsStore.batch951.v955pack
    FeaturePrefsStore.batch951.v955pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v955: package mode
internal fun PlayerActivity.showV955PackageToggle() {
    val current = FeaturePrefsStore.batch951.v955package
    FeaturePrefsStore.batch951.v955package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v955: page mode
internal fun PlayerActivity.showV955PageToggle() {
    val current = FeaturePrefsStore.batch951.v955page
    FeaturePrefsStore.batch951.v955page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v955: paint mode
internal fun PlayerActivity.showV955PaintToggle() {
    val current = FeaturePrefsStore.batch951.v955paint
    FeaturePrefsStore.batch951.v955paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v955: pair mode
internal fun PlayerActivity.showV955PairToggle() {
    val current = FeaturePrefsStore.batch951.v955pair
    FeaturePrefsStore.batch951.v955pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v956: open mode
internal fun PlayerActivity.showV956OpenToggle() {
    val current = FeaturePrefsStore.batch951.v956open
    FeaturePrefsStore.batch951.v956open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v956: operate mode
internal fun PlayerActivity.showV956OperateToggle() {
    val current = FeaturePrefsStore.batch951.v956operate
    FeaturePrefsStore.batch951.v956operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v956: option mode
internal fun PlayerActivity.showV956OptionToggle() {
    val current = FeaturePrefsStore.batch951.v956option
    FeaturePrefsStore.batch951.v956option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v956: orbit mode
internal fun PlayerActivity.showV956OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v956orbit
    FeaturePrefsStore.batch951.v956orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v956: order mode
internal fun PlayerActivity.showV956OrderToggle() {
    val current = FeaturePrefsStore.batch951.v956order
    FeaturePrefsStore.batch951.v956order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v956: origin level
internal fun PlayerActivity.showV956OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v956: out level
internal fun PlayerActivity.showV956OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956out = value
        AppToast.show(this, "out: $value")
    }
}

// v956: output level
internal fun PlayerActivity.showV956OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956output = value
        AppToast.show(this, "output: $value")
    }
}

// v956: overlay level
internal fun PlayerActivity.showV956OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v956: owner level
internal fun PlayerActivity.showV956OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v956owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v956owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v956: pack mode
internal fun PlayerActivity.showV956PackToggle() {
    val current = FeaturePrefsStore.batch951.v956pack
    FeaturePrefsStore.batch951.v956pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v956: package mode
internal fun PlayerActivity.showV956PackageToggle() {
    val current = FeaturePrefsStore.batch951.v956package
    FeaturePrefsStore.batch951.v956package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v956: page mode
internal fun PlayerActivity.showV956PageToggle() {
    val current = FeaturePrefsStore.batch951.v956page
    FeaturePrefsStore.batch951.v956page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v956: paint mode
internal fun PlayerActivity.showV956PaintToggle() {
    val current = FeaturePrefsStore.batch951.v956paint
    FeaturePrefsStore.batch951.v956paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v956: pair mode
internal fun PlayerActivity.showV956PairToggle() {
    val current = FeaturePrefsStore.batch951.v956pair
    FeaturePrefsStore.batch951.v956pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v957: open mode
internal fun PlayerActivity.showV957OpenToggle() {
    val current = FeaturePrefsStore.batch951.v957open
    FeaturePrefsStore.batch951.v957open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v957: operate mode
internal fun PlayerActivity.showV957OperateToggle() {
    val current = FeaturePrefsStore.batch951.v957operate
    FeaturePrefsStore.batch951.v957operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v957: option mode
internal fun PlayerActivity.showV957OptionToggle() {
    val current = FeaturePrefsStore.batch951.v957option
    FeaturePrefsStore.batch951.v957option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v957: orbit mode
internal fun PlayerActivity.showV957OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v957orbit
    FeaturePrefsStore.batch951.v957orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v957: order mode
internal fun PlayerActivity.showV957OrderToggle() {
    val current = FeaturePrefsStore.batch951.v957order
    FeaturePrefsStore.batch951.v957order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v957: origin level
internal fun PlayerActivity.showV957OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v957: out level
internal fun PlayerActivity.showV957OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957out = value
        AppToast.show(this, "out: $value")
    }
}

// v957: output level
internal fun PlayerActivity.showV957OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957output = value
        AppToast.show(this, "output: $value")
    }
}

// v957: overlay level
internal fun PlayerActivity.showV957OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v957: owner level
internal fun PlayerActivity.showV957OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v957owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v957owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v957: pack mode
internal fun PlayerActivity.showV957PackToggle() {
    val current = FeaturePrefsStore.batch951.v957pack
    FeaturePrefsStore.batch951.v957pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v957: package mode
internal fun PlayerActivity.showV957PackageToggle() {
    val current = FeaturePrefsStore.batch951.v957package
    FeaturePrefsStore.batch951.v957package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v957: page mode
internal fun PlayerActivity.showV957PageToggle() {
    val current = FeaturePrefsStore.batch951.v957page
    FeaturePrefsStore.batch951.v957page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v957: paint mode
internal fun PlayerActivity.showV957PaintToggle() {
    val current = FeaturePrefsStore.batch951.v957paint
    FeaturePrefsStore.batch951.v957paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v957: pair mode
internal fun PlayerActivity.showV957PairToggle() {
    val current = FeaturePrefsStore.batch951.v957pair
    FeaturePrefsStore.batch951.v957pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v958: open mode
internal fun PlayerActivity.showV958OpenToggle() {
    val current = FeaturePrefsStore.batch951.v958open
    FeaturePrefsStore.batch951.v958open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v958: operate mode
internal fun PlayerActivity.showV958OperateToggle() {
    val current = FeaturePrefsStore.batch951.v958operate
    FeaturePrefsStore.batch951.v958operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v958: option mode
internal fun PlayerActivity.showV958OptionToggle() {
    val current = FeaturePrefsStore.batch951.v958option
    FeaturePrefsStore.batch951.v958option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v958: orbit mode
internal fun PlayerActivity.showV958OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v958orbit
    FeaturePrefsStore.batch951.v958orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v958: order mode
internal fun PlayerActivity.showV958OrderToggle() {
    val current = FeaturePrefsStore.batch951.v958order
    FeaturePrefsStore.batch951.v958order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v958: origin level
internal fun PlayerActivity.showV958OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v958: out level
internal fun PlayerActivity.showV958OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958out = value
        AppToast.show(this, "out: $value")
    }
}

// v958: output level
internal fun PlayerActivity.showV958OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958output = value
        AppToast.show(this, "output: $value")
    }
}

// v958: overlay level
internal fun PlayerActivity.showV958OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v958: owner level
internal fun PlayerActivity.showV958OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v958owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v958owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v958: pack mode
internal fun PlayerActivity.showV958PackToggle() {
    val current = FeaturePrefsStore.batch951.v958pack
    FeaturePrefsStore.batch951.v958pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v958: package mode
internal fun PlayerActivity.showV958PackageToggle() {
    val current = FeaturePrefsStore.batch951.v958package
    FeaturePrefsStore.batch951.v958package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v958: page mode
internal fun PlayerActivity.showV958PageToggle() {
    val current = FeaturePrefsStore.batch951.v958page
    FeaturePrefsStore.batch951.v958page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v958: paint mode
internal fun PlayerActivity.showV958PaintToggle() {
    val current = FeaturePrefsStore.batch951.v958paint
    FeaturePrefsStore.batch951.v958paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v958: pair mode
internal fun PlayerActivity.showV958PairToggle() {
    val current = FeaturePrefsStore.batch951.v958pair
    FeaturePrefsStore.batch951.v958pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v959: open mode
internal fun PlayerActivity.showV959OpenToggle() {
    val current = FeaturePrefsStore.batch951.v959open
    FeaturePrefsStore.batch951.v959open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v959: operate mode
internal fun PlayerActivity.showV959OperateToggle() {
    val current = FeaturePrefsStore.batch951.v959operate
    FeaturePrefsStore.batch951.v959operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v959: option mode
internal fun PlayerActivity.showV959OptionToggle() {
    val current = FeaturePrefsStore.batch951.v959option
    FeaturePrefsStore.batch951.v959option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v959: orbit mode
internal fun PlayerActivity.showV959OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v959orbit
    FeaturePrefsStore.batch951.v959orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v959: order mode
internal fun PlayerActivity.showV959OrderToggle() {
    val current = FeaturePrefsStore.batch951.v959order
    FeaturePrefsStore.batch951.v959order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v959: origin level
internal fun PlayerActivity.showV959OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v959: out level
internal fun PlayerActivity.showV959OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959out = value
        AppToast.show(this, "out: $value")
    }
}

// v959: output level
internal fun PlayerActivity.showV959OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959output = value
        AppToast.show(this, "output: $value")
    }
}

// v959: overlay level
internal fun PlayerActivity.showV959OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v959: owner level
internal fun PlayerActivity.showV959OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v959owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v959owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v959: pack mode
internal fun PlayerActivity.showV959PackToggle() {
    val current = FeaturePrefsStore.batch951.v959pack
    FeaturePrefsStore.batch951.v959pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v959: package mode
internal fun PlayerActivity.showV959PackageToggle() {
    val current = FeaturePrefsStore.batch951.v959package
    FeaturePrefsStore.batch951.v959package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v959: page mode
internal fun PlayerActivity.showV959PageToggle() {
    val current = FeaturePrefsStore.batch951.v959page
    FeaturePrefsStore.batch951.v959page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v959: paint mode
internal fun PlayerActivity.showV959PaintToggle() {
    val current = FeaturePrefsStore.batch951.v959paint
    FeaturePrefsStore.batch951.v959paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v959: pair mode
internal fun PlayerActivity.showV959PairToggle() {
    val current = FeaturePrefsStore.batch951.v959pair
    FeaturePrefsStore.batch951.v959pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}

// v960: open mode
internal fun PlayerActivity.showV960OpenToggle() {
    val current = FeaturePrefsStore.batch951.v960open
    FeaturePrefsStore.batch951.v960open = !current
    AppToast.show(this, "open: ${if (!current) "ON" else "OFF"}")
}

// v960: operate mode
internal fun PlayerActivity.showV960OperateToggle() {
    val current = FeaturePrefsStore.batch951.v960operate
    FeaturePrefsStore.batch951.v960operate = !current
    AppToast.show(this, "operate: ${if (!current) "ON" else "OFF"}")
}

// v960: option mode
internal fun PlayerActivity.showV960OptionToggle() {
    val current = FeaturePrefsStore.batch951.v960option
    FeaturePrefsStore.batch951.v960option = !current
    AppToast.show(this, "option: ${if (!current) "ON" else "OFF"}")
}

// v960: orbit mode
internal fun PlayerActivity.showV960OrbitToggle() {
    val current = FeaturePrefsStore.batch951.v960orbit
    FeaturePrefsStore.batch951.v960orbit = !current
    AppToast.show(this, "orbit: ${if (!current) "ON" else "OFF"}")
}

// v960: order mode
internal fun PlayerActivity.showV960OrderToggle() {
    val current = FeaturePrefsStore.batch951.v960order
    FeaturePrefsStore.batch951.v960order = !current
    AppToast.show(this, "order: ${if (!current) "ON" else "OFF"}")
}

// v960: origin level
internal fun PlayerActivity.showV960OriginDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960origin).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "origin level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960origin = value
        AppToast.show(this, "origin: $value")
    }
}

// v960: out level
internal fun PlayerActivity.showV960OutDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960out).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "out level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960out = value
        AppToast.show(this, "out: $value")
    }
}

// v960: output level
internal fun PlayerActivity.showV960OutputDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960output).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "output level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960output = value
        AppToast.show(this, "output: $value")
    }
}

// v960: overlay level
internal fun PlayerActivity.showV960OverlayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960overlay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "overlay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960overlay = value
        AppToast.show(this, "overlay: $value")
    }
}

// v960: owner level
internal fun PlayerActivity.showV960OwnerDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch951.v960owner).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "owner level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch951.v960owner = value
        AppToast.show(this, "owner: $value")
    }
}

// v960: pack mode
internal fun PlayerActivity.showV960PackToggle() {
    val current = FeaturePrefsStore.batch951.v960pack
    FeaturePrefsStore.batch951.v960pack = !current
    AppToast.show(this, "pack: ${if (!current) "ON" else "OFF"}")
}

// v960: package mode
internal fun PlayerActivity.showV960PackageToggle() {
    val current = FeaturePrefsStore.batch951.v960package
    FeaturePrefsStore.batch951.v960package = !current
    AppToast.show(this, "package: ${if (!current) "ON" else "OFF"}")
}

// v960: page mode
internal fun PlayerActivity.showV960PageToggle() {
    val current = FeaturePrefsStore.batch951.v960page
    FeaturePrefsStore.batch951.v960page = !current
    AppToast.show(this, "page: ${if (!current) "ON" else "OFF"}")
}

// v960: paint mode
internal fun PlayerActivity.showV960PaintToggle() {
    val current = FeaturePrefsStore.batch951.v960paint
    FeaturePrefsStore.batch951.v960paint = !current
    AppToast.show(this, "paint: ${if (!current) "ON" else "OFF"}")
}

// v960: pair mode
internal fun PlayerActivity.showV960PairToggle() {
    val current = FeaturePrefsStore.batch951.v960pair
    FeaturePrefsStore.batch951.v960pair = !current
    AppToast.show(this, "pair: ${if (!current) "ON" else "OFF"}")
}
