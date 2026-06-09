package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1051: save mode
internal fun PlayerActivity.showV1051SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1051save
    FeaturePrefsStore.batch1051.v1051save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1051: scale mode
internal fun PlayerActivity.showV1051ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scale
    FeaturePrefsStore.batch1051.v1051scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1051: scan mode
internal fun PlayerActivity.showV1051ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scan
    FeaturePrefsStore.batch1051.v1051scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1051: scene mode
internal fun PlayerActivity.showV1051SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scene
    FeaturePrefsStore.batch1051.v1051scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1051: scheme mode
internal fun PlayerActivity.showV1051SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1051scheme
    FeaturePrefsStore.batch1051.v1051scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1051: scope level
internal fun PlayerActivity.showV1051ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1051: score level
internal fun PlayerActivity.showV1051ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051score = value
        AppToast.show(this, "score: $value")
    }
}

// v1051: screen level
internal fun PlayerActivity.showV1051ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1051: scroll level
internal fun PlayerActivity.showV1051ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1051: search level
internal fun PlayerActivity.showV1051SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1051search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1051search = value
        AppToast.show(this, "search: $value")
    }
}

// v1051: section mode
internal fun PlayerActivity.showV1051SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1051section
    FeaturePrefsStore.batch1051.v1051section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1051: secure mode
internal fun PlayerActivity.showV1051SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1051secure
    FeaturePrefsStore.batch1051.v1051secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1051: seek mode
internal fun PlayerActivity.showV1051SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1051seek
    FeaturePrefsStore.batch1051.v1051seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1051: segment mode
internal fun PlayerActivity.showV1051SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1051segment
    FeaturePrefsStore.batch1051.v1051segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1051: select mode
internal fun PlayerActivity.showV1051SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1051select
    FeaturePrefsStore.batch1051.v1051select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1052: save mode
internal fun PlayerActivity.showV1052SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1052save
    FeaturePrefsStore.batch1051.v1052save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1052: scale mode
internal fun PlayerActivity.showV1052ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scale
    FeaturePrefsStore.batch1051.v1052scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1052: scan mode
internal fun PlayerActivity.showV1052ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scan
    FeaturePrefsStore.batch1051.v1052scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1052: scene mode
internal fun PlayerActivity.showV1052SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scene
    FeaturePrefsStore.batch1051.v1052scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1052: scheme mode
internal fun PlayerActivity.showV1052SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1052scheme
    FeaturePrefsStore.batch1051.v1052scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1052: scope level
internal fun PlayerActivity.showV1052ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1052: score level
internal fun PlayerActivity.showV1052ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052score = value
        AppToast.show(this, "score: $value")
    }
}

// v1052: screen level
internal fun PlayerActivity.showV1052ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1052: scroll level
internal fun PlayerActivity.showV1052ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1052: search level
internal fun PlayerActivity.showV1052SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1052search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1052search = value
        AppToast.show(this, "search: $value")
    }
}

// v1052: section mode
internal fun PlayerActivity.showV1052SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1052section
    FeaturePrefsStore.batch1051.v1052section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1052: secure mode
internal fun PlayerActivity.showV1052SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1052secure
    FeaturePrefsStore.batch1051.v1052secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1052: seek mode
internal fun PlayerActivity.showV1052SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1052seek
    FeaturePrefsStore.batch1051.v1052seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1052: segment mode
internal fun PlayerActivity.showV1052SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1052segment
    FeaturePrefsStore.batch1051.v1052segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1052: select mode
internal fun PlayerActivity.showV1052SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1052select
    FeaturePrefsStore.batch1051.v1052select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1053: save mode
internal fun PlayerActivity.showV1053SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1053save
    FeaturePrefsStore.batch1051.v1053save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1053: scale mode
internal fun PlayerActivity.showV1053ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scale
    FeaturePrefsStore.batch1051.v1053scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1053: scan mode
internal fun PlayerActivity.showV1053ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scan
    FeaturePrefsStore.batch1051.v1053scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1053: scene mode
internal fun PlayerActivity.showV1053SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scene
    FeaturePrefsStore.batch1051.v1053scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1053: scheme mode
internal fun PlayerActivity.showV1053SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1053scheme
    FeaturePrefsStore.batch1051.v1053scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1053: scope level
internal fun PlayerActivity.showV1053ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1053: score level
internal fun PlayerActivity.showV1053ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053score = value
        AppToast.show(this, "score: $value")
    }
}

// v1053: screen level
internal fun PlayerActivity.showV1053ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1053: scroll level
internal fun PlayerActivity.showV1053ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1053: search level
internal fun PlayerActivity.showV1053SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1053search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1053search = value
        AppToast.show(this, "search: $value")
    }
}

// v1053: section mode
internal fun PlayerActivity.showV1053SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1053section
    FeaturePrefsStore.batch1051.v1053section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1053: secure mode
internal fun PlayerActivity.showV1053SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1053secure
    FeaturePrefsStore.batch1051.v1053secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1053: seek mode
internal fun PlayerActivity.showV1053SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1053seek
    FeaturePrefsStore.batch1051.v1053seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1053: segment mode
internal fun PlayerActivity.showV1053SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1053segment
    FeaturePrefsStore.batch1051.v1053segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1053: select mode
internal fun PlayerActivity.showV1053SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1053select
    FeaturePrefsStore.batch1051.v1053select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1054: save mode
internal fun PlayerActivity.showV1054SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1054save
    FeaturePrefsStore.batch1051.v1054save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1054: scale mode
internal fun PlayerActivity.showV1054ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scale
    FeaturePrefsStore.batch1051.v1054scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1054: scan mode
internal fun PlayerActivity.showV1054ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scan
    FeaturePrefsStore.batch1051.v1054scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1054: scene mode
internal fun PlayerActivity.showV1054SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scene
    FeaturePrefsStore.batch1051.v1054scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1054: scheme mode
internal fun PlayerActivity.showV1054SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1054scheme
    FeaturePrefsStore.batch1051.v1054scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1054: scope level
internal fun PlayerActivity.showV1054ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1054: score level
internal fun PlayerActivity.showV1054ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054score = value
        AppToast.show(this, "score: $value")
    }
}

// v1054: screen level
internal fun PlayerActivity.showV1054ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1054: scroll level
internal fun PlayerActivity.showV1054ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1054: search level
internal fun PlayerActivity.showV1054SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1054search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1054search = value
        AppToast.show(this, "search: $value")
    }
}

// v1054: section mode
internal fun PlayerActivity.showV1054SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1054section
    FeaturePrefsStore.batch1051.v1054section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1054: secure mode
internal fun PlayerActivity.showV1054SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1054secure
    FeaturePrefsStore.batch1051.v1054secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1054: seek mode
internal fun PlayerActivity.showV1054SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1054seek
    FeaturePrefsStore.batch1051.v1054seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1054: segment mode
internal fun PlayerActivity.showV1054SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1054segment
    FeaturePrefsStore.batch1051.v1054segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1054: select mode
internal fun PlayerActivity.showV1054SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1054select
    FeaturePrefsStore.batch1051.v1054select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1055: save mode
internal fun PlayerActivity.showV1055SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1055save
    FeaturePrefsStore.batch1051.v1055save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1055: scale mode
internal fun PlayerActivity.showV1055ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scale
    FeaturePrefsStore.batch1051.v1055scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1055: scan mode
internal fun PlayerActivity.showV1055ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scan
    FeaturePrefsStore.batch1051.v1055scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1055: scene mode
internal fun PlayerActivity.showV1055SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scene
    FeaturePrefsStore.batch1051.v1055scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1055: scheme mode
internal fun PlayerActivity.showV1055SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1055scheme
    FeaturePrefsStore.batch1051.v1055scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1055: scope level
internal fun PlayerActivity.showV1055ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1055: score level
internal fun PlayerActivity.showV1055ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055score = value
        AppToast.show(this, "score: $value")
    }
}

// v1055: screen level
internal fun PlayerActivity.showV1055ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1055: scroll level
internal fun PlayerActivity.showV1055ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1055: search level
internal fun PlayerActivity.showV1055SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1055search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1055search = value
        AppToast.show(this, "search: $value")
    }
}

// v1055: section mode
internal fun PlayerActivity.showV1055SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1055section
    FeaturePrefsStore.batch1051.v1055section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1055: secure mode
internal fun PlayerActivity.showV1055SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1055secure
    FeaturePrefsStore.batch1051.v1055secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1055: seek mode
internal fun PlayerActivity.showV1055SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1055seek
    FeaturePrefsStore.batch1051.v1055seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1055: segment mode
internal fun PlayerActivity.showV1055SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1055segment
    FeaturePrefsStore.batch1051.v1055segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1055: select mode
internal fun PlayerActivity.showV1055SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1055select
    FeaturePrefsStore.batch1051.v1055select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1056: save mode
internal fun PlayerActivity.showV1056SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1056save
    FeaturePrefsStore.batch1051.v1056save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1056: scale mode
internal fun PlayerActivity.showV1056ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scale
    FeaturePrefsStore.batch1051.v1056scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1056: scan mode
internal fun PlayerActivity.showV1056ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scan
    FeaturePrefsStore.batch1051.v1056scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1056: scene mode
internal fun PlayerActivity.showV1056SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scene
    FeaturePrefsStore.batch1051.v1056scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1056: scheme mode
internal fun PlayerActivity.showV1056SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1056scheme
    FeaturePrefsStore.batch1051.v1056scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1056: scope level
internal fun PlayerActivity.showV1056ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1056: score level
internal fun PlayerActivity.showV1056ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056score = value
        AppToast.show(this, "score: $value")
    }
}

// v1056: screen level
internal fun PlayerActivity.showV1056ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1056: scroll level
internal fun PlayerActivity.showV1056ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1056: search level
internal fun PlayerActivity.showV1056SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1056search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1056search = value
        AppToast.show(this, "search: $value")
    }
}

// v1056: section mode
internal fun PlayerActivity.showV1056SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1056section
    FeaturePrefsStore.batch1051.v1056section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1056: secure mode
internal fun PlayerActivity.showV1056SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1056secure
    FeaturePrefsStore.batch1051.v1056secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1056: seek mode
internal fun PlayerActivity.showV1056SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1056seek
    FeaturePrefsStore.batch1051.v1056seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1056: segment mode
internal fun PlayerActivity.showV1056SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1056segment
    FeaturePrefsStore.batch1051.v1056segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1056: select mode
internal fun PlayerActivity.showV1056SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1056select
    FeaturePrefsStore.batch1051.v1056select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1057: save mode
internal fun PlayerActivity.showV1057SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1057save
    FeaturePrefsStore.batch1051.v1057save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1057: scale mode
internal fun PlayerActivity.showV1057ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scale
    FeaturePrefsStore.batch1051.v1057scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1057: scan mode
internal fun PlayerActivity.showV1057ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scan
    FeaturePrefsStore.batch1051.v1057scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1057: scene mode
internal fun PlayerActivity.showV1057SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scene
    FeaturePrefsStore.batch1051.v1057scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1057: scheme mode
internal fun PlayerActivity.showV1057SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1057scheme
    FeaturePrefsStore.batch1051.v1057scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1057: scope level
internal fun PlayerActivity.showV1057ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1057: score level
internal fun PlayerActivity.showV1057ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057score = value
        AppToast.show(this, "score: $value")
    }
}

// v1057: screen level
internal fun PlayerActivity.showV1057ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1057: scroll level
internal fun PlayerActivity.showV1057ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1057: search level
internal fun PlayerActivity.showV1057SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1057search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1057search = value
        AppToast.show(this, "search: $value")
    }
}

// v1057: section mode
internal fun PlayerActivity.showV1057SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1057section
    FeaturePrefsStore.batch1051.v1057section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1057: secure mode
internal fun PlayerActivity.showV1057SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1057secure
    FeaturePrefsStore.batch1051.v1057secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1057: seek mode
internal fun PlayerActivity.showV1057SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1057seek
    FeaturePrefsStore.batch1051.v1057seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1057: segment mode
internal fun PlayerActivity.showV1057SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1057segment
    FeaturePrefsStore.batch1051.v1057segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1057: select mode
internal fun PlayerActivity.showV1057SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1057select
    FeaturePrefsStore.batch1051.v1057select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1058: save mode
internal fun PlayerActivity.showV1058SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1058save
    FeaturePrefsStore.batch1051.v1058save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1058: scale mode
internal fun PlayerActivity.showV1058ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scale
    FeaturePrefsStore.batch1051.v1058scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1058: scan mode
internal fun PlayerActivity.showV1058ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scan
    FeaturePrefsStore.batch1051.v1058scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1058: scene mode
internal fun PlayerActivity.showV1058SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scene
    FeaturePrefsStore.batch1051.v1058scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1058: scheme mode
internal fun PlayerActivity.showV1058SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1058scheme
    FeaturePrefsStore.batch1051.v1058scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1058: scope level
internal fun PlayerActivity.showV1058ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1058: score level
internal fun PlayerActivity.showV1058ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058score = value
        AppToast.show(this, "score: $value")
    }
}

// v1058: screen level
internal fun PlayerActivity.showV1058ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1058: scroll level
internal fun PlayerActivity.showV1058ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1058: search level
internal fun PlayerActivity.showV1058SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1058search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1058search = value
        AppToast.show(this, "search: $value")
    }
}

// v1058: section mode
internal fun PlayerActivity.showV1058SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1058section
    FeaturePrefsStore.batch1051.v1058section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1058: secure mode
internal fun PlayerActivity.showV1058SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1058secure
    FeaturePrefsStore.batch1051.v1058secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1058: seek mode
internal fun PlayerActivity.showV1058SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1058seek
    FeaturePrefsStore.batch1051.v1058seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1058: segment mode
internal fun PlayerActivity.showV1058SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1058segment
    FeaturePrefsStore.batch1051.v1058segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1058: select mode
internal fun PlayerActivity.showV1058SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1058select
    FeaturePrefsStore.batch1051.v1058select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1059: save mode
internal fun PlayerActivity.showV1059SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1059save
    FeaturePrefsStore.batch1051.v1059save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1059: scale mode
internal fun PlayerActivity.showV1059ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scale
    FeaturePrefsStore.batch1051.v1059scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1059: scan mode
internal fun PlayerActivity.showV1059ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scan
    FeaturePrefsStore.batch1051.v1059scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1059: scene mode
internal fun PlayerActivity.showV1059SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scene
    FeaturePrefsStore.batch1051.v1059scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1059: scheme mode
internal fun PlayerActivity.showV1059SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1059scheme
    FeaturePrefsStore.batch1051.v1059scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1059: scope level
internal fun PlayerActivity.showV1059ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1059: score level
internal fun PlayerActivity.showV1059ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059score = value
        AppToast.show(this, "score: $value")
    }
}

// v1059: screen level
internal fun PlayerActivity.showV1059ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1059: scroll level
internal fun PlayerActivity.showV1059ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1059: search level
internal fun PlayerActivity.showV1059SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1059search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1059search = value
        AppToast.show(this, "search: $value")
    }
}

// v1059: section mode
internal fun PlayerActivity.showV1059SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1059section
    FeaturePrefsStore.batch1051.v1059section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1059: secure mode
internal fun PlayerActivity.showV1059SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1059secure
    FeaturePrefsStore.batch1051.v1059secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1059: seek mode
internal fun PlayerActivity.showV1059SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1059seek
    FeaturePrefsStore.batch1051.v1059seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1059: segment mode
internal fun PlayerActivity.showV1059SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1059segment
    FeaturePrefsStore.batch1051.v1059segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1059: select mode
internal fun PlayerActivity.showV1059SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1059select
    FeaturePrefsStore.batch1051.v1059select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

// v1060: save mode
internal fun PlayerActivity.showV1060SaveToggle() {
    val current = FeaturePrefsStore.batch1051.v1060save
    FeaturePrefsStore.batch1051.v1060save = !current
    AppToast.show(this, "save: ${if (!current) "ON" else "OFF"}")
}

// v1060: scale mode
internal fun PlayerActivity.showV1060ScaleToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scale
    FeaturePrefsStore.batch1051.v1060scale = !current
    AppToast.show(this, "scale: ${if (!current) "ON" else "OFF"}")
}

// v1060: scan mode
internal fun PlayerActivity.showV1060ScanToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scan
    FeaturePrefsStore.batch1051.v1060scan = !current
    AppToast.show(this, "scan: ${if (!current) "ON" else "OFF"}")
}

// v1060: scene mode
internal fun PlayerActivity.showV1060SceneToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scene
    FeaturePrefsStore.batch1051.v1060scene = !current
    AppToast.show(this, "scene: ${if (!current) "ON" else "OFF"}")
}

// v1060: scheme mode
internal fun PlayerActivity.showV1060SchemeToggle() {
    val current = FeaturePrefsStore.batch1051.v1060scheme
    FeaturePrefsStore.batch1051.v1060scheme = !current
    AppToast.show(this, "scheme: ${if (!current) "ON" else "OFF"}")
}

// v1060: scope level
internal fun PlayerActivity.showV1060ScopeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060scope).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scope level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060scope = value
        AppToast.show(this, "scope: $value")
    }
}

// v1060: score level
internal fun PlayerActivity.showV1060ScoreDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060score).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "score level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060score = value
        AppToast.show(this, "score: $value")
    }
}

// v1060: screen level
internal fun PlayerActivity.showV1060ScreenDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060screen).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "screen level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060screen = value
        AppToast.show(this, "screen: $value")
    }
}

// v1060: scroll level
internal fun PlayerActivity.showV1060ScrollDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060scroll).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "scroll level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060scroll = value
        AppToast.show(this, "scroll: $value")
    }
}

// v1060: search level
internal fun PlayerActivity.showV1060SearchDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1051.v1060search).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "search level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1051.v1060search = value
        AppToast.show(this, "search: $value")
    }
}

// v1060: section mode
internal fun PlayerActivity.showV1060SectionToggle() {
    val current = FeaturePrefsStore.batch1051.v1060section
    FeaturePrefsStore.batch1051.v1060section = !current
    AppToast.show(this, "section: ${if (!current) "ON" else "OFF"}")
}

// v1060: secure mode
internal fun PlayerActivity.showV1060SecureToggle() {
    val current = FeaturePrefsStore.batch1051.v1060secure
    FeaturePrefsStore.batch1051.v1060secure = !current
    AppToast.show(this, "secure: ${if (!current) "ON" else "OFF"}")
}

// v1060: seek mode
internal fun PlayerActivity.showV1060SeekToggle() {
    val current = FeaturePrefsStore.batch1051.v1060seek
    FeaturePrefsStore.batch1051.v1060seek = !current
    AppToast.show(this, "seek: ${if (!current) "ON" else "OFF"}")
}

// v1060: segment mode
internal fun PlayerActivity.showV1060SegmentToggle() {
    val current = FeaturePrefsStore.batch1051.v1060segment
    FeaturePrefsStore.batch1051.v1060segment = !current
    AppToast.show(this, "segment: ${if (!current) "ON" else "OFF"}")
}

// v1060: select mode
internal fun PlayerActivity.showV1060SelectToggle() {
    val current = FeaturePrefsStore.batch1051.v1060select
    FeaturePrefsStore.batch1051.v1060select = !current
    AppToast.show(this, "select: ${if (!current) "ON" else "OFF"}")
}

