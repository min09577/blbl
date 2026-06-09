package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1161: walk mode
internal fun PlayerActivity.showV1161WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1161walk
    FeaturePrefsStore.batch1161.v1161walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1161: warm mode
internal fun PlayerActivity.showV1161WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1161warm
    FeaturePrefsStore.batch1161.v1161warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1161: warn mode
internal fun PlayerActivity.showV1161WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1161warn
    FeaturePrefsStore.batch1161.v1161warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1161: warning mode
internal fun PlayerActivity.showV1161WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1161warning
    FeaturePrefsStore.batch1161.v1161warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1161: watch mode
internal fun PlayerActivity.showV1161WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1161watch
    FeaturePrefsStore.batch1161.v1161watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1161: weak level
internal fun PlayerActivity.showV1161WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1161: web level
internal fun PlayerActivity.showV1161WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161web = value
        AppToast.show(this, "web: $value")
    }
}

// v1161: weight level
internal fun PlayerActivity.showV1161WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1161: where level
internal fun PlayerActivity.showV1161WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161where = value
        AppToast.show(this, "where: $value")
    }
}

// v1161: widget level
internal fun PlayerActivity.showV1161WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1161widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1161widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1161: width mode
internal fun PlayerActivity.showV1161WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1161width
    FeaturePrefsStore.batch1161.v1161width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1161: wildcard mode
internal fun PlayerActivity.showV1161WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1161wildcard
    FeaturePrefsStore.batch1161.v1161wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1161: window mode
internal fun PlayerActivity.showV1161WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1161window
    FeaturePrefsStore.batch1161.v1161window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1161: wire mode
internal fun PlayerActivity.showV1161WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1161wire
    FeaturePrefsStore.batch1161.v1161wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1161: word mode
internal fun PlayerActivity.showV1161WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1161word
    FeaturePrefsStore.batch1161.v1161word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1162: walk mode
internal fun PlayerActivity.showV1162WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1162walk
    FeaturePrefsStore.batch1161.v1162walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1162: warm mode
internal fun PlayerActivity.showV1162WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1162warm
    FeaturePrefsStore.batch1161.v1162warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1162: warn mode
internal fun PlayerActivity.showV1162WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1162warn
    FeaturePrefsStore.batch1161.v1162warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1162: warning mode
internal fun PlayerActivity.showV1162WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1162warning
    FeaturePrefsStore.batch1161.v1162warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1162: watch mode
internal fun PlayerActivity.showV1162WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1162watch
    FeaturePrefsStore.batch1161.v1162watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1162: weak level
internal fun PlayerActivity.showV1162WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1162: web level
internal fun PlayerActivity.showV1162WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162web = value
        AppToast.show(this, "web: $value")
    }
}

// v1162: weight level
internal fun PlayerActivity.showV1162WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1162: where level
internal fun PlayerActivity.showV1162WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162where = value
        AppToast.show(this, "where: $value")
    }
}

// v1162: widget level
internal fun PlayerActivity.showV1162WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1162widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1162widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1162: width mode
internal fun PlayerActivity.showV1162WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1162width
    FeaturePrefsStore.batch1161.v1162width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1162: wildcard mode
internal fun PlayerActivity.showV1162WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1162wildcard
    FeaturePrefsStore.batch1161.v1162wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1162: window mode
internal fun PlayerActivity.showV1162WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1162window
    FeaturePrefsStore.batch1161.v1162window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1162: wire mode
internal fun PlayerActivity.showV1162WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1162wire
    FeaturePrefsStore.batch1161.v1162wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1162: word mode
internal fun PlayerActivity.showV1162WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1162word
    FeaturePrefsStore.batch1161.v1162word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1163: walk mode
internal fun PlayerActivity.showV1163WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1163walk
    FeaturePrefsStore.batch1161.v1163walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1163: warm mode
internal fun PlayerActivity.showV1163WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1163warm
    FeaturePrefsStore.batch1161.v1163warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1163: warn mode
internal fun PlayerActivity.showV1163WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1163warn
    FeaturePrefsStore.batch1161.v1163warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1163: warning mode
internal fun PlayerActivity.showV1163WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1163warning
    FeaturePrefsStore.batch1161.v1163warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1163: watch mode
internal fun PlayerActivity.showV1163WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1163watch
    FeaturePrefsStore.batch1161.v1163watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1163: weak level
internal fun PlayerActivity.showV1163WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1163: web level
internal fun PlayerActivity.showV1163WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163web = value
        AppToast.show(this, "web: $value")
    }
}

// v1163: weight level
internal fun PlayerActivity.showV1163WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1163: where level
internal fun PlayerActivity.showV1163WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163where = value
        AppToast.show(this, "where: $value")
    }
}

// v1163: widget level
internal fun PlayerActivity.showV1163WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1163widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1163widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1163: width mode
internal fun PlayerActivity.showV1163WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1163width
    FeaturePrefsStore.batch1161.v1163width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1163: wildcard mode
internal fun PlayerActivity.showV1163WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1163wildcard
    FeaturePrefsStore.batch1161.v1163wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1163: window mode
internal fun PlayerActivity.showV1163WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1163window
    FeaturePrefsStore.batch1161.v1163window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1163: wire mode
internal fun PlayerActivity.showV1163WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1163wire
    FeaturePrefsStore.batch1161.v1163wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1163: word mode
internal fun PlayerActivity.showV1163WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1163word
    FeaturePrefsStore.batch1161.v1163word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1164: walk mode
internal fun PlayerActivity.showV1164WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1164walk
    FeaturePrefsStore.batch1161.v1164walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1164: warm mode
internal fun PlayerActivity.showV1164WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1164warm
    FeaturePrefsStore.batch1161.v1164warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1164: warn mode
internal fun PlayerActivity.showV1164WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1164warn
    FeaturePrefsStore.batch1161.v1164warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1164: warning mode
internal fun PlayerActivity.showV1164WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1164warning
    FeaturePrefsStore.batch1161.v1164warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1164: watch mode
internal fun PlayerActivity.showV1164WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1164watch
    FeaturePrefsStore.batch1161.v1164watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1164: weak level
internal fun PlayerActivity.showV1164WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1164: web level
internal fun PlayerActivity.showV1164WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164web = value
        AppToast.show(this, "web: $value")
    }
}

// v1164: weight level
internal fun PlayerActivity.showV1164WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1164: where level
internal fun PlayerActivity.showV1164WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164where = value
        AppToast.show(this, "where: $value")
    }
}

// v1164: widget level
internal fun PlayerActivity.showV1164WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1164widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1164widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1164: width mode
internal fun PlayerActivity.showV1164WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1164width
    FeaturePrefsStore.batch1161.v1164width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1164: wildcard mode
internal fun PlayerActivity.showV1164WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1164wildcard
    FeaturePrefsStore.batch1161.v1164wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1164: window mode
internal fun PlayerActivity.showV1164WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1164window
    FeaturePrefsStore.batch1161.v1164window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1164: wire mode
internal fun PlayerActivity.showV1164WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1164wire
    FeaturePrefsStore.batch1161.v1164wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1164: word mode
internal fun PlayerActivity.showV1164WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1164word
    FeaturePrefsStore.batch1161.v1164word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1165: walk mode
internal fun PlayerActivity.showV1165WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1165walk
    FeaturePrefsStore.batch1161.v1165walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1165: warm mode
internal fun PlayerActivity.showV1165WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1165warm
    FeaturePrefsStore.batch1161.v1165warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1165: warn mode
internal fun PlayerActivity.showV1165WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1165warn
    FeaturePrefsStore.batch1161.v1165warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1165: warning mode
internal fun PlayerActivity.showV1165WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1165warning
    FeaturePrefsStore.batch1161.v1165warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1165: watch mode
internal fun PlayerActivity.showV1165WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1165watch
    FeaturePrefsStore.batch1161.v1165watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1165: weak level
internal fun PlayerActivity.showV1165WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1165: web level
internal fun PlayerActivity.showV1165WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165web = value
        AppToast.show(this, "web: $value")
    }
}

// v1165: weight level
internal fun PlayerActivity.showV1165WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1165: where level
internal fun PlayerActivity.showV1165WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165where = value
        AppToast.show(this, "where: $value")
    }
}

// v1165: widget level
internal fun PlayerActivity.showV1165WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1165widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1165widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1165: width mode
internal fun PlayerActivity.showV1165WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1165width
    FeaturePrefsStore.batch1161.v1165width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1165: wildcard mode
internal fun PlayerActivity.showV1165WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1165wildcard
    FeaturePrefsStore.batch1161.v1165wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1165: window mode
internal fun PlayerActivity.showV1165WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1165window
    FeaturePrefsStore.batch1161.v1165window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1165: wire mode
internal fun PlayerActivity.showV1165WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1165wire
    FeaturePrefsStore.batch1161.v1165wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1165: word mode
internal fun PlayerActivity.showV1165WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1165word
    FeaturePrefsStore.batch1161.v1165word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1166: walk mode
internal fun PlayerActivity.showV1166WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1166walk
    FeaturePrefsStore.batch1161.v1166walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1166: warm mode
internal fun PlayerActivity.showV1166WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1166warm
    FeaturePrefsStore.batch1161.v1166warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1166: warn mode
internal fun PlayerActivity.showV1166WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1166warn
    FeaturePrefsStore.batch1161.v1166warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1166: warning mode
internal fun PlayerActivity.showV1166WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1166warning
    FeaturePrefsStore.batch1161.v1166warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1166: watch mode
internal fun PlayerActivity.showV1166WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1166watch
    FeaturePrefsStore.batch1161.v1166watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1166: weak level
internal fun PlayerActivity.showV1166WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1166: web level
internal fun PlayerActivity.showV1166WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166web = value
        AppToast.show(this, "web: $value")
    }
}

// v1166: weight level
internal fun PlayerActivity.showV1166WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1166: where level
internal fun PlayerActivity.showV1166WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166where = value
        AppToast.show(this, "where: $value")
    }
}

// v1166: widget level
internal fun PlayerActivity.showV1166WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1166widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1166widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1166: width mode
internal fun PlayerActivity.showV1166WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1166width
    FeaturePrefsStore.batch1161.v1166width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1166: wildcard mode
internal fun PlayerActivity.showV1166WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1166wildcard
    FeaturePrefsStore.batch1161.v1166wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1166: window mode
internal fun PlayerActivity.showV1166WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1166window
    FeaturePrefsStore.batch1161.v1166window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1166: wire mode
internal fun PlayerActivity.showV1166WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1166wire
    FeaturePrefsStore.batch1161.v1166wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1166: word mode
internal fun PlayerActivity.showV1166WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1166word
    FeaturePrefsStore.batch1161.v1166word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1167: walk mode
internal fun PlayerActivity.showV1167WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1167walk
    FeaturePrefsStore.batch1161.v1167walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1167: warm mode
internal fun PlayerActivity.showV1167WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1167warm
    FeaturePrefsStore.batch1161.v1167warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1167: warn mode
internal fun PlayerActivity.showV1167WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1167warn
    FeaturePrefsStore.batch1161.v1167warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1167: warning mode
internal fun PlayerActivity.showV1167WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1167warning
    FeaturePrefsStore.batch1161.v1167warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1167: watch mode
internal fun PlayerActivity.showV1167WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1167watch
    FeaturePrefsStore.batch1161.v1167watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1167: weak level
internal fun PlayerActivity.showV1167WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1167: web level
internal fun PlayerActivity.showV1167WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167web = value
        AppToast.show(this, "web: $value")
    }
}

// v1167: weight level
internal fun PlayerActivity.showV1167WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1167: where level
internal fun PlayerActivity.showV1167WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167where = value
        AppToast.show(this, "where: $value")
    }
}

// v1167: widget level
internal fun PlayerActivity.showV1167WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1167widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1167widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1167: width mode
internal fun PlayerActivity.showV1167WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1167width
    FeaturePrefsStore.batch1161.v1167width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1167: wildcard mode
internal fun PlayerActivity.showV1167WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1167wildcard
    FeaturePrefsStore.batch1161.v1167wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1167: window mode
internal fun PlayerActivity.showV1167WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1167window
    FeaturePrefsStore.batch1161.v1167window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1167: wire mode
internal fun PlayerActivity.showV1167WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1167wire
    FeaturePrefsStore.batch1161.v1167wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1167: word mode
internal fun PlayerActivity.showV1167WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1167word
    FeaturePrefsStore.batch1161.v1167word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1168: walk mode
internal fun PlayerActivity.showV1168WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1168walk
    FeaturePrefsStore.batch1161.v1168walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1168: warm mode
internal fun PlayerActivity.showV1168WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1168warm
    FeaturePrefsStore.batch1161.v1168warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1168: warn mode
internal fun PlayerActivity.showV1168WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1168warn
    FeaturePrefsStore.batch1161.v1168warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1168: warning mode
internal fun PlayerActivity.showV1168WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1168warning
    FeaturePrefsStore.batch1161.v1168warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1168: watch mode
internal fun PlayerActivity.showV1168WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1168watch
    FeaturePrefsStore.batch1161.v1168watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1168: weak level
internal fun PlayerActivity.showV1168WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1168: web level
internal fun PlayerActivity.showV1168WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168web = value
        AppToast.show(this, "web: $value")
    }
}

// v1168: weight level
internal fun PlayerActivity.showV1168WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1168: where level
internal fun PlayerActivity.showV1168WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168where = value
        AppToast.show(this, "where: $value")
    }
}

// v1168: widget level
internal fun PlayerActivity.showV1168WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1168widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1168widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1168: width mode
internal fun PlayerActivity.showV1168WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1168width
    FeaturePrefsStore.batch1161.v1168width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1168: wildcard mode
internal fun PlayerActivity.showV1168WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1168wildcard
    FeaturePrefsStore.batch1161.v1168wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1168: window mode
internal fun PlayerActivity.showV1168WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1168window
    FeaturePrefsStore.batch1161.v1168window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1168: wire mode
internal fun PlayerActivity.showV1168WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1168wire
    FeaturePrefsStore.batch1161.v1168wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1168: word mode
internal fun PlayerActivity.showV1168WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1168word
    FeaturePrefsStore.batch1161.v1168word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1169: walk mode
internal fun PlayerActivity.showV1169WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1169walk
    FeaturePrefsStore.batch1161.v1169walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1169: warm mode
internal fun PlayerActivity.showV1169WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1169warm
    FeaturePrefsStore.batch1161.v1169warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1169: warn mode
internal fun PlayerActivity.showV1169WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1169warn
    FeaturePrefsStore.batch1161.v1169warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1169: warning mode
internal fun PlayerActivity.showV1169WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1169warning
    FeaturePrefsStore.batch1161.v1169warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1169: watch mode
internal fun PlayerActivity.showV1169WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1169watch
    FeaturePrefsStore.batch1161.v1169watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1169: weak level
internal fun PlayerActivity.showV1169WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1169: web level
internal fun PlayerActivity.showV1169WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169web = value
        AppToast.show(this, "web: $value")
    }
}

// v1169: weight level
internal fun PlayerActivity.showV1169WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1169: where level
internal fun PlayerActivity.showV1169WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169where = value
        AppToast.show(this, "where: $value")
    }
}

// v1169: widget level
internal fun PlayerActivity.showV1169WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1169widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1169widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1169: width mode
internal fun PlayerActivity.showV1169WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1169width
    FeaturePrefsStore.batch1161.v1169width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1169: wildcard mode
internal fun PlayerActivity.showV1169WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1169wildcard
    FeaturePrefsStore.batch1161.v1169wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1169: window mode
internal fun PlayerActivity.showV1169WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1169window
    FeaturePrefsStore.batch1161.v1169window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1169: wire mode
internal fun PlayerActivity.showV1169WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1169wire
    FeaturePrefsStore.batch1161.v1169wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1169: word mode
internal fun PlayerActivity.showV1169WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1169word
    FeaturePrefsStore.batch1161.v1169word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

// v1170: walk mode
internal fun PlayerActivity.showV1170WalkToggle() {
    val current = FeaturePrefsStore.batch1161.v1170walk
    FeaturePrefsStore.batch1161.v1170walk = !current
    AppToast.show(this, "walk: ${if (!current) "ON" else "OFF"}")
}

// v1170: warm mode
internal fun PlayerActivity.showV1170WarmToggle() {
    val current = FeaturePrefsStore.batch1161.v1170warm
    FeaturePrefsStore.batch1161.v1170warm = !current
    AppToast.show(this, "warm: ${if (!current) "ON" else "OFF"}")
}

// v1170: warn mode
internal fun PlayerActivity.showV1170WarnToggle() {
    val current = FeaturePrefsStore.batch1161.v1170warn
    FeaturePrefsStore.batch1161.v1170warn = !current
    AppToast.show(this, "warn: ${if (!current) "ON" else "OFF"}")
}

// v1170: warning mode
internal fun PlayerActivity.showV1170WarningToggle() {
    val current = FeaturePrefsStore.batch1161.v1170warning
    FeaturePrefsStore.batch1161.v1170warning = !current
    AppToast.show(this, "warning: ${if (!current) "ON" else "OFF"}")
}

// v1170: watch mode
internal fun PlayerActivity.showV1170WatchToggle() {
    val current = FeaturePrefsStore.batch1161.v1170watch
    FeaturePrefsStore.batch1161.v1170watch = !current
    AppToast.show(this, "watch: ${if (!current) "ON" else "OFF"}")
}

// v1170: weak level
internal fun PlayerActivity.showV1170WeakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170weak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170weak = value
        AppToast.show(this, "weak: $value")
    }
}

// v1170: web level
internal fun PlayerActivity.showV1170WebDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170web).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "web level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170web = value
        AppToast.show(this, "web: $value")
    }
}

// v1170: weight level
internal fun PlayerActivity.showV1170WeightDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170weight).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "weight level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170weight = value
        AppToast.show(this, "weight: $value")
    }
}

// v1170: where level
internal fun PlayerActivity.showV1170WhereDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170where).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "where level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170where = value
        AppToast.show(this, "where: $value")
    }
}

// v1170: widget level
internal fun PlayerActivity.showV1170WidgetDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1161.v1170widget).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "widget level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1161.v1170widget = value
        AppToast.show(this, "widget: $value")
    }
}

// v1170: width mode
internal fun PlayerActivity.showV1170WidthToggle() {
    val current = FeaturePrefsStore.batch1161.v1170width
    FeaturePrefsStore.batch1161.v1170width = !current
    AppToast.show(this, "width: ${if (!current) "ON" else "OFF"}")
}

// v1170: wildcard mode
internal fun PlayerActivity.showV1170WildcardToggle() {
    val current = FeaturePrefsStore.batch1161.v1170wildcard
    FeaturePrefsStore.batch1161.v1170wildcard = !current
    AppToast.show(this, "wildcard: ${if (!current) "ON" else "OFF"}")
}

// v1170: window mode
internal fun PlayerActivity.showV1170WindowToggle() {
    val current = FeaturePrefsStore.batch1161.v1170window
    FeaturePrefsStore.batch1161.v1170window = !current
    AppToast.show(this, "window: ${if (!current) "ON" else "OFF"}")
}

// v1170: wire mode
internal fun PlayerActivity.showV1170WireToggle() {
    val current = FeaturePrefsStore.batch1161.v1170wire
    FeaturePrefsStore.batch1161.v1170wire = !current
    AppToast.show(this, "wire: ${if (!current) "ON" else "OFF"}")
}

// v1170: word mode
internal fun PlayerActivity.showV1170WordToggle() {
    val current = FeaturePrefsStore.batch1161.v1170word
    FeaturePrefsStore.batch1161.v1170word = !current
    AppToast.show(this, "word: ${if (!current) "ON" else "OFF"}")
}

