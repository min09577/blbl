package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v731: border mode
internal fun PlayerActivity.showV731BorderToggle() {
    val current = FeaturePrefsStore.batch731.v731border
    FeaturePrefsStore.batch731.v731border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v731: bounce mode
internal fun PlayerActivity.showV731BounceToggle() {
    val current = FeaturePrefsStore.batch731.v731bounce
    FeaturePrefsStore.batch731.v731bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v731: box mode
internal fun PlayerActivity.showV731BoxToggle() {
    val current = FeaturePrefsStore.batch731.v731box
    FeaturePrefsStore.batch731.v731box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v731: branch mode
internal fun PlayerActivity.showV731BranchToggle() {
    val current = FeaturePrefsStore.batch731.v731branch
    FeaturePrefsStore.batch731.v731branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v731: brand mode
internal fun PlayerActivity.showV731BrandToggle() {
    val current = FeaturePrefsStore.batch731.v731brand
    FeaturePrefsStore.batch731.v731brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v731: break level
internal fun PlayerActivity.showV731BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731break = value
        AppToast.show(this, "break: $value")
    }
}

// v731: bridge level
internal fun PlayerActivity.showV731BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v731: browse level
internal fun PlayerActivity.showV731BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v731: buffer level
internal fun PlayerActivity.showV731BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v731: build level
internal fun PlayerActivity.showV731BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v731build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v731build = value
        AppToast.show(this, "build: $value")
    }
}

// v731: bulk mode
internal fun PlayerActivity.showV731BulkToggle() {
    val current = FeaturePrefsStore.batch731.v731bulk
    FeaturePrefsStore.batch731.v731bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v731: burst mode
internal fun PlayerActivity.showV731BurstToggle() {
    val current = FeaturePrefsStore.batch731.v731burst
    FeaturePrefsStore.batch731.v731burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v731: byte mode
internal fun PlayerActivity.showV731ByteToggle() {
    val current = FeaturePrefsStore.batch731.v731byte
    FeaturePrefsStore.batch731.v731byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v731: cache mode
internal fun PlayerActivity.showV731CacheToggle() {
    val current = FeaturePrefsStore.batch731.v731cache
    FeaturePrefsStore.batch731.v731cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v731: calibrate mode
internal fun PlayerActivity.showV731CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v731calibrate
    FeaturePrefsStore.batch731.v731calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v732: border mode
internal fun PlayerActivity.showV732BorderToggle() {
    val current = FeaturePrefsStore.batch731.v732border
    FeaturePrefsStore.batch731.v732border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v732: bounce mode
internal fun PlayerActivity.showV732BounceToggle() {
    val current = FeaturePrefsStore.batch731.v732bounce
    FeaturePrefsStore.batch731.v732bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v732: box mode
internal fun PlayerActivity.showV732BoxToggle() {
    val current = FeaturePrefsStore.batch731.v732box
    FeaturePrefsStore.batch731.v732box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v732: branch mode
internal fun PlayerActivity.showV732BranchToggle() {
    val current = FeaturePrefsStore.batch731.v732branch
    FeaturePrefsStore.batch731.v732branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v732: brand mode
internal fun PlayerActivity.showV732BrandToggle() {
    val current = FeaturePrefsStore.batch731.v732brand
    FeaturePrefsStore.batch731.v732brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v732: break level
internal fun PlayerActivity.showV732BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732break = value
        AppToast.show(this, "break: $value")
    }
}

// v732: bridge level
internal fun PlayerActivity.showV732BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v732: browse level
internal fun PlayerActivity.showV732BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v732: buffer level
internal fun PlayerActivity.showV732BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v732: build level
internal fun PlayerActivity.showV732BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v732build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v732build = value
        AppToast.show(this, "build: $value")
    }
}

// v732: bulk mode
internal fun PlayerActivity.showV732BulkToggle() {
    val current = FeaturePrefsStore.batch731.v732bulk
    FeaturePrefsStore.batch731.v732bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v732: burst mode
internal fun PlayerActivity.showV732BurstToggle() {
    val current = FeaturePrefsStore.batch731.v732burst
    FeaturePrefsStore.batch731.v732burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v732: byte mode
internal fun PlayerActivity.showV732ByteToggle() {
    val current = FeaturePrefsStore.batch731.v732byte
    FeaturePrefsStore.batch731.v732byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v732: cache mode
internal fun PlayerActivity.showV732CacheToggle() {
    val current = FeaturePrefsStore.batch731.v732cache
    FeaturePrefsStore.batch731.v732cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v732: calibrate mode
internal fun PlayerActivity.showV732CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v732calibrate
    FeaturePrefsStore.batch731.v732calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v733: border mode
internal fun PlayerActivity.showV733BorderToggle() {
    val current = FeaturePrefsStore.batch731.v733border
    FeaturePrefsStore.batch731.v733border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v733: bounce mode
internal fun PlayerActivity.showV733BounceToggle() {
    val current = FeaturePrefsStore.batch731.v733bounce
    FeaturePrefsStore.batch731.v733bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v733: box mode
internal fun PlayerActivity.showV733BoxToggle() {
    val current = FeaturePrefsStore.batch731.v733box
    FeaturePrefsStore.batch731.v733box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v733: branch mode
internal fun PlayerActivity.showV733BranchToggle() {
    val current = FeaturePrefsStore.batch731.v733branch
    FeaturePrefsStore.batch731.v733branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v733: brand mode
internal fun PlayerActivity.showV733BrandToggle() {
    val current = FeaturePrefsStore.batch731.v733brand
    FeaturePrefsStore.batch731.v733brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v733: break level
internal fun PlayerActivity.showV733BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733break = value
        AppToast.show(this, "break: $value")
    }
}

// v733: bridge level
internal fun PlayerActivity.showV733BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v733: browse level
internal fun PlayerActivity.showV733BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v733: buffer level
internal fun PlayerActivity.showV733BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v733: build level
internal fun PlayerActivity.showV733BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v733build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v733build = value
        AppToast.show(this, "build: $value")
    }
}

// v733: bulk mode
internal fun PlayerActivity.showV733BulkToggle() {
    val current = FeaturePrefsStore.batch731.v733bulk
    FeaturePrefsStore.batch731.v733bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v733: burst mode
internal fun PlayerActivity.showV733BurstToggle() {
    val current = FeaturePrefsStore.batch731.v733burst
    FeaturePrefsStore.batch731.v733burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v733: byte mode
internal fun PlayerActivity.showV733ByteToggle() {
    val current = FeaturePrefsStore.batch731.v733byte
    FeaturePrefsStore.batch731.v733byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v733: cache mode
internal fun PlayerActivity.showV733CacheToggle() {
    val current = FeaturePrefsStore.batch731.v733cache
    FeaturePrefsStore.batch731.v733cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v733: calibrate mode
internal fun PlayerActivity.showV733CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v733calibrate
    FeaturePrefsStore.batch731.v733calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v734: border mode
internal fun PlayerActivity.showV734BorderToggle() {
    val current = FeaturePrefsStore.batch731.v734border
    FeaturePrefsStore.batch731.v734border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v734: bounce mode
internal fun PlayerActivity.showV734BounceToggle() {
    val current = FeaturePrefsStore.batch731.v734bounce
    FeaturePrefsStore.batch731.v734bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v734: box mode
internal fun PlayerActivity.showV734BoxToggle() {
    val current = FeaturePrefsStore.batch731.v734box
    FeaturePrefsStore.batch731.v734box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v734: branch mode
internal fun PlayerActivity.showV734BranchToggle() {
    val current = FeaturePrefsStore.batch731.v734branch
    FeaturePrefsStore.batch731.v734branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v734: brand mode
internal fun PlayerActivity.showV734BrandToggle() {
    val current = FeaturePrefsStore.batch731.v734brand
    FeaturePrefsStore.batch731.v734brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v734: break level
internal fun PlayerActivity.showV734BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734break = value
        AppToast.show(this, "break: $value")
    }
}

// v734: bridge level
internal fun PlayerActivity.showV734BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v734: browse level
internal fun PlayerActivity.showV734BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v734: buffer level
internal fun PlayerActivity.showV734BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v734: build level
internal fun PlayerActivity.showV734BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v734build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v734build = value
        AppToast.show(this, "build: $value")
    }
}

// v734: bulk mode
internal fun PlayerActivity.showV734BulkToggle() {
    val current = FeaturePrefsStore.batch731.v734bulk
    FeaturePrefsStore.batch731.v734bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v734: burst mode
internal fun PlayerActivity.showV734BurstToggle() {
    val current = FeaturePrefsStore.batch731.v734burst
    FeaturePrefsStore.batch731.v734burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v734: byte mode
internal fun PlayerActivity.showV734ByteToggle() {
    val current = FeaturePrefsStore.batch731.v734byte
    FeaturePrefsStore.batch731.v734byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v734: cache mode
internal fun PlayerActivity.showV734CacheToggle() {
    val current = FeaturePrefsStore.batch731.v734cache
    FeaturePrefsStore.batch731.v734cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v734: calibrate mode
internal fun PlayerActivity.showV734CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v734calibrate
    FeaturePrefsStore.batch731.v734calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v735: border mode
internal fun PlayerActivity.showV735BorderToggle() {
    val current = FeaturePrefsStore.batch731.v735border
    FeaturePrefsStore.batch731.v735border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v735: bounce mode
internal fun PlayerActivity.showV735BounceToggle() {
    val current = FeaturePrefsStore.batch731.v735bounce
    FeaturePrefsStore.batch731.v735bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v735: box mode
internal fun PlayerActivity.showV735BoxToggle() {
    val current = FeaturePrefsStore.batch731.v735box
    FeaturePrefsStore.batch731.v735box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v735: branch mode
internal fun PlayerActivity.showV735BranchToggle() {
    val current = FeaturePrefsStore.batch731.v735branch
    FeaturePrefsStore.batch731.v735branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v735: brand mode
internal fun PlayerActivity.showV735BrandToggle() {
    val current = FeaturePrefsStore.batch731.v735brand
    FeaturePrefsStore.batch731.v735brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v735: break level
internal fun PlayerActivity.showV735BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735break = value
        AppToast.show(this, "break: $value")
    }
}

// v735: bridge level
internal fun PlayerActivity.showV735BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v735: browse level
internal fun PlayerActivity.showV735BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v735: buffer level
internal fun PlayerActivity.showV735BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v735: build level
internal fun PlayerActivity.showV735BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v735build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v735build = value
        AppToast.show(this, "build: $value")
    }
}

// v735: bulk mode
internal fun PlayerActivity.showV735BulkToggle() {
    val current = FeaturePrefsStore.batch731.v735bulk
    FeaturePrefsStore.batch731.v735bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v735: burst mode
internal fun PlayerActivity.showV735BurstToggle() {
    val current = FeaturePrefsStore.batch731.v735burst
    FeaturePrefsStore.batch731.v735burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v735: byte mode
internal fun PlayerActivity.showV735ByteToggle() {
    val current = FeaturePrefsStore.batch731.v735byte
    FeaturePrefsStore.batch731.v735byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v735: cache mode
internal fun PlayerActivity.showV735CacheToggle() {
    val current = FeaturePrefsStore.batch731.v735cache
    FeaturePrefsStore.batch731.v735cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v735: calibrate mode
internal fun PlayerActivity.showV735CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v735calibrate
    FeaturePrefsStore.batch731.v735calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v736: border mode
internal fun PlayerActivity.showV736BorderToggle() {
    val current = FeaturePrefsStore.batch731.v736border
    FeaturePrefsStore.batch731.v736border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v736: bounce mode
internal fun PlayerActivity.showV736BounceToggle() {
    val current = FeaturePrefsStore.batch731.v736bounce
    FeaturePrefsStore.batch731.v736bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v736: box mode
internal fun PlayerActivity.showV736BoxToggle() {
    val current = FeaturePrefsStore.batch731.v736box
    FeaturePrefsStore.batch731.v736box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v736: branch mode
internal fun PlayerActivity.showV736BranchToggle() {
    val current = FeaturePrefsStore.batch731.v736branch
    FeaturePrefsStore.batch731.v736branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v736: brand mode
internal fun PlayerActivity.showV736BrandToggle() {
    val current = FeaturePrefsStore.batch731.v736brand
    FeaturePrefsStore.batch731.v736brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v736: break level
internal fun PlayerActivity.showV736BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736break = value
        AppToast.show(this, "break: $value")
    }
}

// v736: bridge level
internal fun PlayerActivity.showV736BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v736: browse level
internal fun PlayerActivity.showV736BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v736: buffer level
internal fun PlayerActivity.showV736BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v736: build level
internal fun PlayerActivity.showV736BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v736build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v736build = value
        AppToast.show(this, "build: $value")
    }
}

// v736: bulk mode
internal fun PlayerActivity.showV736BulkToggle() {
    val current = FeaturePrefsStore.batch731.v736bulk
    FeaturePrefsStore.batch731.v736bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v736: burst mode
internal fun PlayerActivity.showV736BurstToggle() {
    val current = FeaturePrefsStore.batch731.v736burst
    FeaturePrefsStore.batch731.v736burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v736: byte mode
internal fun PlayerActivity.showV736ByteToggle() {
    val current = FeaturePrefsStore.batch731.v736byte
    FeaturePrefsStore.batch731.v736byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v736: cache mode
internal fun PlayerActivity.showV736CacheToggle() {
    val current = FeaturePrefsStore.batch731.v736cache
    FeaturePrefsStore.batch731.v736cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v736: calibrate mode
internal fun PlayerActivity.showV736CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v736calibrate
    FeaturePrefsStore.batch731.v736calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v737: border mode
internal fun PlayerActivity.showV737BorderToggle() {
    val current = FeaturePrefsStore.batch731.v737border
    FeaturePrefsStore.batch731.v737border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v737: bounce mode
internal fun PlayerActivity.showV737BounceToggle() {
    val current = FeaturePrefsStore.batch731.v737bounce
    FeaturePrefsStore.batch731.v737bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v737: box mode
internal fun PlayerActivity.showV737BoxToggle() {
    val current = FeaturePrefsStore.batch731.v737box
    FeaturePrefsStore.batch731.v737box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v737: branch mode
internal fun PlayerActivity.showV737BranchToggle() {
    val current = FeaturePrefsStore.batch731.v737branch
    FeaturePrefsStore.batch731.v737branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v737: brand mode
internal fun PlayerActivity.showV737BrandToggle() {
    val current = FeaturePrefsStore.batch731.v737brand
    FeaturePrefsStore.batch731.v737brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v737: break level
internal fun PlayerActivity.showV737BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737break = value
        AppToast.show(this, "break: $value")
    }
}

// v737: bridge level
internal fun PlayerActivity.showV737BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v737: browse level
internal fun PlayerActivity.showV737BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v737: buffer level
internal fun PlayerActivity.showV737BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v737: build level
internal fun PlayerActivity.showV737BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v737build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v737build = value
        AppToast.show(this, "build: $value")
    }
}

// v737: bulk mode
internal fun PlayerActivity.showV737BulkToggle() {
    val current = FeaturePrefsStore.batch731.v737bulk
    FeaturePrefsStore.batch731.v737bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v737: burst mode
internal fun PlayerActivity.showV737BurstToggle() {
    val current = FeaturePrefsStore.batch731.v737burst
    FeaturePrefsStore.batch731.v737burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v737: byte mode
internal fun PlayerActivity.showV737ByteToggle() {
    val current = FeaturePrefsStore.batch731.v737byte
    FeaturePrefsStore.batch731.v737byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v737: cache mode
internal fun PlayerActivity.showV737CacheToggle() {
    val current = FeaturePrefsStore.batch731.v737cache
    FeaturePrefsStore.batch731.v737cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v737: calibrate mode
internal fun PlayerActivity.showV737CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v737calibrate
    FeaturePrefsStore.batch731.v737calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v738: border mode
internal fun PlayerActivity.showV738BorderToggle() {
    val current = FeaturePrefsStore.batch731.v738border
    FeaturePrefsStore.batch731.v738border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v738: bounce mode
internal fun PlayerActivity.showV738BounceToggle() {
    val current = FeaturePrefsStore.batch731.v738bounce
    FeaturePrefsStore.batch731.v738bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v738: box mode
internal fun PlayerActivity.showV738BoxToggle() {
    val current = FeaturePrefsStore.batch731.v738box
    FeaturePrefsStore.batch731.v738box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v738: branch mode
internal fun PlayerActivity.showV738BranchToggle() {
    val current = FeaturePrefsStore.batch731.v738branch
    FeaturePrefsStore.batch731.v738branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v738: brand mode
internal fun PlayerActivity.showV738BrandToggle() {
    val current = FeaturePrefsStore.batch731.v738brand
    FeaturePrefsStore.batch731.v738brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v738: break level
internal fun PlayerActivity.showV738BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738break = value
        AppToast.show(this, "break: $value")
    }
}

// v738: bridge level
internal fun PlayerActivity.showV738BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v738: browse level
internal fun PlayerActivity.showV738BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v738: buffer level
internal fun PlayerActivity.showV738BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v738: build level
internal fun PlayerActivity.showV738BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v738build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v738build = value
        AppToast.show(this, "build: $value")
    }
}

// v738: bulk mode
internal fun PlayerActivity.showV738BulkToggle() {
    val current = FeaturePrefsStore.batch731.v738bulk
    FeaturePrefsStore.batch731.v738bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v738: burst mode
internal fun PlayerActivity.showV738BurstToggle() {
    val current = FeaturePrefsStore.batch731.v738burst
    FeaturePrefsStore.batch731.v738burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v738: byte mode
internal fun PlayerActivity.showV738ByteToggle() {
    val current = FeaturePrefsStore.batch731.v738byte
    FeaturePrefsStore.batch731.v738byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v738: cache mode
internal fun PlayerActivity.showV738CacheToggle() {
    val current = FeaturePrefsStore.batch731.v738cache
    FeaturePrefsStore.batch731.v738cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v738: calibrate mode
internal fun PlayerActivity.showV738CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v738calibrate
    FeaturePrefsStore.batch731.v738calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v739: border mode
internal fun PlayerActivity.showV739BorderToggle() {
    val current = FeaturePrefsStore.batch731.v739border
    FeaturePrefsStore.batch731.v739border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v739: bounce mode
internal fun PlayerActivity.showV739BounceToggle() {
    val current = FeaturePrefsStore.batch731.v739bounce
    FeaturePrefsStore.batch731.v739bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v739: box mode
internal fun PlayerActivity.showV739BoxToggle() {
    val current = FeaturePrefsStore.batch731.v739box
    FeaturePrefsStore.batch731.v739box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v739: branch mode
internal fun PlayerActivity.showV739BranchToggle() {
    val current = FeaturePrefsStore.batch731.v739branch
    FeaturePrefsStore.batch731.v739branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v739: brand mode
internal fun PlayerActivity.showV739BrandToggle() {
    val current = FeaturePrefsStore.batch731.v739brand
    FeaturePrefsStore.batch731.v739brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v739: break level
internal fun PlayerActivity.showV739BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739break = value
        AppToast.show(this, "break: $value")
    }
}

// v739: bridge level
internal fun PlayerActivity.showV739BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v739: browse level
internal fun PlayerActivity.showV739BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v739: buffer level
internal fun PlayerActivity.showV739BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v739: build level
internal fun PlayerActivity.showV739BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v739build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v739build = value
        AppToast.show(this, "build: $value")
    }
}

// v739: bulk mode
internal fun PlayerActivity.showV739BulkToggle() {
    val current = FeaturePrefsStore.batch731.v739bulk
    FeaturePrefsStore.batch731.v739bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v739: burst mode
internal fun PlayerActivity.showV739BurstToggle() {
    val current = FeaturePrefsStore.batch731.v739burst
    FeaturePrefsStore.batch731.v739burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v739: byte mode
internal fun PlayerActivity.showV739ByteToggle() {
    val current = FeaturePrefsStore.batch731.v739byte
    FeaturePrefsStore.batch731.v739byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v739: cache mode
internal fun PlayerActivity.showV739CacheToggle() {
    val current = FeaturePrefsStore.batch731.v739cache
    FeaturePrefsStore.batch731.v739cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v739: calibrate mode
internal fun PlayerActivity.showV739CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v739calibrate
    FeaturePrefsStore.batch731.v739calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v740: border mode
internal fun PlayerActivity.showV740BorderToggle() {
    val current = FeaturePrefsStore.batch731.v740border
    FeaturePrefsStore.batch731.v740border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v740: bounce mode
internal fun PlayerActivity.showV740BounceToggle() {
    val current = FeaturePrefsStore.batch731.v740bounce
    FeaturePrefsStore.batch731.v740bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v740: box mode
internal fun PlayerActivity.showV740BoxToggle() {
    val current = FeaturePrefsStore.batch731.v740box
    FeaturePrefsStore.batch731.v740box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v740: branch mode
internal fun PlayerActivity.showV740BranchToggle() {
    val current = FeaturePrefsStore.batch731.v740branch
    FeaturePrefsStore.batch731.v740branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v740: brand mode
internal fun PlayerActivity.showV740BrandToggle() {
    val current = FeaturePrefsStore.batch731.v740brand
    FeaturePrefsStore.batch731.v740brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v740: break level
internal fun PlayerActivity.showV740BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740break = value
        AppToast.show(this, "break: $value")
    }
}

// v740: bridge level
internal fun PlayerActivity.showV740BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v740: browse level
internal fun PlayerActivity.showV740BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v740: buffer level
internal fun PlayerActivity.showV740BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v740: build level
internal fun PlayerActivity.showV740BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch731.v740build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch731.v740build = value
        AppToast.show(this, "build: $value")
    }
}

// v740: bulk mode
internal fun PlayerActivity.showV740BulkToggle() {
    val current = FeaturePrefsStore.batch731.v740bulk
    FeaturePrefsStore.batch731.v740bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v740: burst mode
internal fun PlayerActivity.showV740BurstToggle() {
    val current = FeaturePrefsStore.batch731.v740burst
    FeaturePrefsStore.batch731.v740burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v740: byte mode
internal fun PlayerActivity.showV740ByteToggle() {
    val current = FeaturePrefsStore.batch731.v740byte
    FeaturePrefsStore.batch731.v740byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v740: cache mode
internal fun PlayerActivity.showV740CacheToggle() {
    val current = FeaturePrefsStore.batch731.v740cache
    FeaturePrefsStore.batch731.v740cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v740: calibrate mode
internal fun PlayerActivity.showV740CalibrateToggle() {
    val current = FeaturePrefsStore.batch731.v740calibrate
    FeaturePrefsStore.batch731.v740calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

