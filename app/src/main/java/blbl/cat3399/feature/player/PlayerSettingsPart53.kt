package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v721: border mode
internal fun PlayerActivity.showV721BorderToggle() {
    val current = FeaturePrefsStore.batch721.v721border
    FeaturePrefsStore.batch721.v721border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v721: bounce mode
internal fun PlayerActivity.showV721BounceToggle() {
    val current = FeaturePrefsStore.batch721.v721bounce
    FeaturePrefsStore.batch721.v721bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v721: box mode
internal fun PlayerActivity.showV721BoxToggle() {
    val current = FeaturePrefsStore.batch721.v721box
    FeaturePrefsStore.batch721.v721box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v721: branch mode
internal fun PlayerActivity.showV721BranchToggle() {
    val current = FeaturePrefsStore.batch721.v721branch
    FeaturePrefsStore.batch721.v721branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v721: brand mode
internal fun PlayerActivity.showV721BrandToggle() {
    val current = FeaturePrefsStore.batch721.v721brand
    FeaturePrefsStore.batch721.v721brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v721: break level
internal fun PlayerActivity.showV721BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721break = value
        AppToast.show(this, "break: $value")
    }
}

// v721: bridge level
internal fun PlayerActivity.showV721BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v721: browse level
internal fun PlayerActivity.showV721BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v721: buffer level
internal fun PlayerActivity.showV721BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v721: build level
internal fun PlayerActivity.showV721BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v721build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v721build = value
        AppToast.show(this, "build: $value")
    }
}

// v721: bulk mode
internal fun PlayerActivity.showV721BulkToggle() {
    val current = FeaturePrefsStore.batch721.v721bulk
    FeaturePrefsStore.batch721.v721bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v721: burst mode
internal fun PlayerActivity.showV721BurstToggle() {
    val current = FeaturePrefsStore.batch721.v721burst
    FeaturePrefsStore.batch721.v721burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v721: byte mode
internal fun PlayerActivity.showV721ByteToggle() {
    val current = FeaturePrefsStore.batch721.v721byte
    FeaturePrefsStore.batch721.v721byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v721: cache mode
internal fun PlayerActivity.showV721CacheToggle() {
    val current = FeaturePrefsStore.batch721.v721cache
    FeaturePrefsStore.batch721.v721cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v721: calibrate mode
internal fun PlayerActivity.showV721CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v721calibrate
    FeaturePrefsStore.batch721.v721calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v722: border mode
internal fun PlayerActivity.showV722BorderToggle() {
    val current = FeaturePrefsStore.batch721.v722border
    FeaturePrefsStore.batch721.v722border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v722: bounce mode
internal fun PlayerActivity.showV722BounceToggle() {
    val current = FeaturePrefsStore.batch721.v722bounce
    FeaturePrefsStore.batch721.v722bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v722: box mode
internal fun PlayerActivity.showV722BoxToggle() {
    val current = FeaturePrefsStore.batch721.v722box
    FeaturePrefsStore.batch721.v722box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v722: branch mode
internal fun PlayerActivity.showV722BranchToggle() {
    val current = FeaturePrefsStore.batch721.v722branch
    FeaturePrefsStore.batch721.v722branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v722: brand mode
internal fun PlayerActivity.showV722BrandToggle() {
    val current = FeaturePrefsStore.batch721.v722brand
    FeaturePrefsStore.batch721.v722brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v722: break level
internal fun PlayerActivity.showV722BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722break = value
        AppToast.show(this, "break: $value")
    }
}

// v722: bridge level
internal fun PlayerActivity.showV722BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v722: browse level
internal fun PlayerActivity.showV722BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v722: buffer level
internal fun PlayerActivity.showV722BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v722: build level
internal fun PlayerActivity.showV722BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v722build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v722build = value
        AppToast.show(this, "build: $value")
    }
}

// v722: bulk mode
internal fun PlayerActivity.showV722BulkToggle() {
    val current = FeaturePrefsStore.batch721.v722bulk
    FeaturePrefsStore.batch721.v722bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v722: burst mode
internal fun PlayerActivity.showV722BurstToggle() {
    val current = FeaturePrefsStore.batch721.v722burst
    FeaturePrefsStore.batch721.v722burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v722: byte mode
internal fun PlayerActivity.showV722ByteToggle() {
    val current = FeaturePrefsStore.batch721.v722byte
    FeaturePrefsStore.batch721.v722byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v722: cache mode
internal fun PlayerActivity.showV722CacheToggle() {
    val current = FeaturePrefsStore.batch721.v722cache
    FeaturePrefsStore.batch721.v722cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v722: calibrate mode
internal fun PlayerActivity.showV722CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v722calibrate
    FeaturePrefsStore.batch721.v722calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v723: border mode
internal fun PlayerActivity.showV723BorderToggle() {
    val current = FeaturePrefsStore.batch721.v723border
    FeaturePrefsStore.batch721.v723border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v723: bounce mode
internal fun PlayerActivity.showV723BounceToggle() {
    val current = FeaturePrefsStore.batch721.v723bounce
    FeaturePrefsStore.batch721.v723bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v723: box mode
internal fun PlayerActivity.showV723BoxToggle() {
    val current = FeaturePrefsStore.batch721.v723box
    FeaturePrefsStore.batch721.v723box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v723: branch mode
internal fun PlayerActivity.showV723BranchToggle() {
    val current = FeaturePrefsStore.batch721.v723branch
    FeaturePrefsStore.batch721.v723branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v723: brand mode
internal fun PlayerActivity.showV723BrandToggle() {
    val current = FeaturePrefsStore.batch721.v723brand
    FeaturePrefsStore.batch721.v723brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v723: break level
internal fun PlayerActivity.showV723BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723break = value
        AppToast.show(this, "break: $value")
    }
}

// v723: bridge level
internal fun PlayerActivity.showV723BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v723: browse level
internal fun PlayerActivity.showV723BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v723: buffer level
internal fun PlayerActivity.showV723BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v723: build level
internal fun PlayerActivity.showV723BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v723build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v723build = value
        AppToast.show(this, "build: $value")
    }
}

// v723: bulk mode
internal fun PlayerActivity.showV723BulkToggle() {
    val current = FeaturePrefsStore.batch721.v723bulk
    FeaturePrefsStore.batch721.v723bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v723: burst mode
internal fun PlayerActivity.showV723BurstToggle() {
    val current = FeaturePrefsStore.batch721.v723burst
    FeaturePrefsStore.batch721.v723burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v723: byte mode
internal fun PlayerActivity.showV723ByteToggle() {
    val current = FeaturePrefsStore.batch721.v723byte
    FeaturePrefsStore.batch721.v723byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v723: cache mode
internal fun PlayerActivity.showV723CacheToggle() {
    val current = FeaturePrefsStore.batch721.v723cache
    FeaturePrefsStore.batch721.v723cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v723: calibrate mode
internal fun PlayerActivity.showV723CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v723calibrate
    FeaturePrefsStore.batch721.v723calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v724: border mode
internal fun PlayerActivity.showV724BorderToggle() {
    val current = FeaturePrefsStore.batch721.v724border
    FeaturePrefsStore.batch721.v724border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v724: bounce mode
internal fun PlayerActivity.showV724BounceToggle() {
    val current = FeaturePrefsStore.batch721.v724bounce
    FeaturePrefsStore.batch721.v724bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v724: box mode
internal fun PlayerActivity.showV724BoxToggle() {
    val current = FeaturePrefsStore.batch721.v724box
    FeaturePrefsStore.batch721.v724box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v724: branch mode
internal fun PlayerActivity.showV724BranchToggle() {
    val current = FeaturePrefsStore.batch721.v724branch
    FeaturePrefsStore.batch721.v724branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v724: brand mode
internal fun PlayerActivity.showV724BrandToggle() {
    val current = FeaturePrefsStore.batch721.v724brand
    FeaturePrefsStore.batch721.v724brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v724: break level
internal fun PlayerActivity.showV724BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724break = value
        AppToast.show(this, "break: $value")
    }
}

// v724: bridge level
internal fun PlayerActivity.showV724BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v724: browse level
internal fun PlayerActivity.showV724BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v724: buffer level
internal fun PlayerActivity.showV724BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v724: build level
internal fun PlayerActivity.showV724BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v724build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v724build = value
        AppToast.show(this, "build: $value")
    }
}

// v724: bulk mode
internal fun PlayerActivity.showV724BulkToggle() {
    val current = FeaturePrefsStore.batch721.v724bulk
    FeaturePrefsStore.batch721.v724bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v724: burst mode
internal fun PlayerActivity.showV724BurstToggle() {
    val current = FeaturePrefsStore.batch721.v724burst
    FeaturePrefsStore.batch721.v724burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v724: byte mode
internal fun PlayerActivity.showV724ByteToggle() {
    val current = FeaturePrefsStore.batch721.v724byte
    FeaturePrefsStore.batch721.v724byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v724: cache mode
internal fun PlayerActivity.showV724CacheToggle() {
    val current = FeaturePrefsStore.batch721.v724cache
    FeaturePrefsStore.batch721.v724cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v724: calibrate mode
internal fun PlayerActivity.showV724CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v724calibrate
    FeaturePrefsStore.batch721.v724calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v725: border mode
internal fun PlayerActivity.showV725BorderToggle() {
    val current = FeaturePrefsStore.batch721.v725border
    FeaturePrefsStore.batch721.v725border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v725: bounce mode
internal fun PlayerActivity.showV725BounceToggle() {
    val current = FeaturePrefsStore.batch721.v725bounce
    FeaturePrefsStore.batch721.v725bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v725: box mode
internal fun PlayerActivity.showV725BoxToggle() {
    val current = FeaturePrefsStore.batch721.v725box
    FeaturePrefsStore.batch721.v725box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v725: branch mode
internal fun PlayerActivity.showV725BranchToggle() {
    val current = FeaturePrefsStore.batch721.v725branch
    FeaturePrefsStore.batch721.v725branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v725: brand mode
internal fun PlayerActivity.showV725BrandToggle() {
    val current = FeaturePrefsStore.batch721.v725brand
    FeaturePrefsStore.batch721.v725brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v725: break level
internal fun PlayerActivity.showV725BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725break = value
        AppToast.show(this, "break: $value")
    }
}

// v725: bridge level
internal fun PlayerActivity.showV725BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v725: browse level
internal fun PlayerActivity.showV725BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v725: buffer level
internal fun PlayerActivity.showV725BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v725: build level
internal fun PlayerActivity.showV725BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v725build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v725build = value
        AppToast.show(this, "build: $value")
    }
}

// v725: bulk mode
internal fun PlayerActivity.showV725BulkToggle() {
    val current = FeaturePrefsStore.batch721.v725bulk
    FeaturePrefsStore.batch721.v725bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v725: burst mode
internal fun PlayerActivity.showV725BurstToggle() {
    val current = FeaturePrefsStore.batch721.v725burst
    FeaturePrefsStore.batch721.v725burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v725: byte mode
internal fun PlayerActivity.showV725ByteToggle() {
    val current = FeaturePrefsStore.batch721.v725byte
    FeaturePrefsStore.batch721.v725byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v725: cache mode
internal fun PlayerActivity.showV725CacheToggle() {
    val current = FeaturePrefsStore.batch721.v725cache
    FeaturePrefsStore.batch721.v725cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v725: calibrate mode
internal fun PlayerActivity.showV725CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v725calibrate
    FeaturePrefsStore.batch721.v725calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v726: border mode
internal fun PlayerActivity.showV726BorderToggle() {
    val current = FeaturePrefsStore.batch721.v726border
    FeaturePrefsStore.batch721.v726border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v726: bounce mode
internal fun PlayerActivity.showV726BounceToggle() {
    val current = FeaturePrefsStore.batch721.v726bounce
    FeaturePrefsStore.batch721.v726bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v726: box mode
internal fun PlayerActivity.showV726BoxToggle() {
    val current = FeaturePrefsStore.batch721.v726box
    FeaturePrefsStore.batch721.v726box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v726: branch mode
internal fun PlayerActivity.showV726BranchToggle() {
    val current = FeaturePrefsStore.batch721.v726branch
    FeaturePrefsStore.batch721.v726branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v726: brand mode
internal fun PlayerActivity.showV726BrandToggle() {
    val current = FeaturePrefsStore.batch721.v726brand
    FeaturePrefsStore.batch721.v726brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v726: break level
internal fun PlayerActivity.showV726BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726break = value
        AppToast.show(this, "break: $value")
    }
}

// v726: bridge level
internal fun PlayerActivity.showV726BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v726: browse level
internal fun PlayerActivity.showV726BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v726: buffer level
internal fun PlayerActivity.showV726BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v726: build level
internal fun PlayerActivity.showV726BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v726build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v726build = value
        AppToast.show(this, "build: $value")
    }
}

// v726: bulk mode
internal fun PlayerActivity.showV726BulkToggle() {
    val current = FeaturePrefsStore.batch721.v726bulk
    FeaturePrefsStore.batch721.v726bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v726: burst mode
internal fun PlayerActivity.showV726BurstToggle() {
    val current = FeaturePrefsStore.batch721.v726burst
    FeaturePrefsStore.batch721.v726burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v726: byte mode
internal fun PlayerActivity.showV726ByteToggle() {
    val current = FeaturePrefsStore.batch721.v726byte
    FeaturePrefsStore.batch721.v726byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v726: cache mode
internal fun PlayerActivity.showV726CacheToggle() {
    val current = FeaturePrefsStore.batch721.v726cache
    FeaturePrefsStore.batch721.v726cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v726: calibrate mode
internal fun PlayerActivity.showV726CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v726calibrate
    FeaturePrefsStore.batch721.v726calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v727: border mode
internal fun PlayerActivity.showV727BorderToggle() {
    val current = FeaturePrefsStore.batch721.v727border
    FeaturePrefsStore.batch721.v727border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v727: bounce mode
internal fun PlayerActivity.showV727BounceToggle() {
    val current = FeaturePrefsStore.batch721.v727bounce
    FeaturePrefsStore.batch721.v727bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v727: box mode
internal fun PlayerActivity.showV727BoxToggle() {
    val current = FeaturePrefsStore.batch721.v727box
    FeaturePrefsStore.batch721.v727box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v727: branch mode
internal fun PlayerActivity.showV727BranchToggle() {
    val current = FeaturePrefsStore.batch721.v727branch
    FeaturePrefsStore.batch721.v727branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v727: brand mode
internal fun PlayerActivity.showV727BrandToggle() {
    val current = FeaturePrefsStore.batch721.v727brand
    FeaturePrefsStore.batch721.v727brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v727: break level
internal fun PlayerActivity.showV727BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727break = value
        AppToast.show(this, "break: $value")
    }
}

// v727: bridge level
internal fun PlayerActivity.showV727BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v727: browse level
internal fun PlayerActivity.showV727BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v727: buffer level
internal fun PlayerActivity.showV727BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v727: build level
internal fun PlayerActivity.showV727BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v727build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v727build = value
        AppToast.show(this, "build: $value")
    }
}

// v727: bulk mode
internal fun PlayerActivity.showV727BulkToggle() {
    val current = FeaturePrefsStore.batch721.v727bulk
    FeaturePrefsStore.batch721.v727bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v727: burst mode
internal fun PlayerActivity.showV727BurstToggle() {
    val current = FeaturePrefsStore.batch721.v727burst
    FeaturePrefsStore.batch721.v727burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v727: byte mode
internal fun PlayerActivity.showV727ByteToggle() {
    val current = FeaturePrefsStore.batch721.v727byte
    FeaturePrefsStore.batch721.v727byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v727: cache mode
internal fun PlayerActivity.showV727CacheToggle() {
    val current = FeaturePrefsStore.batch721.v727cache
    FeaturePrefsStore.batch721.v727cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v727: calibrate mode
internal fun PlayerActivity.showV727CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v727calibrate
    FeaturePrefsStore.batch721.v727calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v728: border mode
internal fun PlayerActivity.showV728BorderToggle() {
    val current = FeaturePrefsStore.batch721.v728border
    FeaturePrefsStore.batch721.v728border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v728: bounce mode
internal fun PlayerActivity.showV728BounceToggle() {
    val current = FeaturePrefsStore.batch721.v728bounce
    FeaturePrefsStore.batch721.v728bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v728: box mode
internal fun PlayerActivity.showV728BoxToggle() {
    val current = FeaturePrefsStore.batch721.v728box
    FeaturePrefsStore.batch721.v728box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v728: branch mode
internal fun PlayerActivity.showV728BranchToggle() {
    val current = FeaturePrefsStore.batch721.v728branch
    FeaturePrefsStore.batch721.v728branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v728: brand mode
internal fun PlayerActivity.showV728BrandToggle() {
    val current = FeaturePrefsStore.batch721.v728brand
    FeaturePrefsStore.batch721.v728brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v728: break level
internal fun PlayerActivity.showV728BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728break = value
        AppToast.show(this, "break: $value")
    }
}

// v728: bridge level
internal fun PlayerActivity.showV728BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v728: browse level
internal fun PlayerActivity.showV728BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v728: buffer level
internal fun PlayerActivity.showV728BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v728: build level
internal fun PlayerActivity.showV728BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v728build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v728build = value
        AppToast.show(this, "build: $value")
    }
}

// v728: bulk mode
internal fun PlayerActivity.showV728BulkToggle() {
    val current = FeaturePrefsStore.batch721.v728bulk
    FeaturePrefsStore.batch721.v728bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v728: burst mode
internal fun PlayerActivity.showV728BurstToggle() {
    val current = FeaturePrefsStore.batch721.v728burst
    FeaturePrefsStore.batch721.v728burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v728: byte mode
internal fun PlayerActivity.showV728ByteToggle() {
    val current = FeaturePrefsStore.batch721.v728byte
    FeaturePrefsStore.batch721.v728byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v728: cache mode
internal fun PlayerActivity.showV728CacheToggle() {
    val current = FeaturePrefsStore.batch721.v728cache
    FeaturePrefsStore.batch721.v728cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v728: calibrate mode
internal fun PlayerActivity.showV728CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v728calibrate
    FeaturePrefsStore.batch721.v728calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v729: border mode
internal fun PlayerActivity.showV729BorderToggle() {
    val current = FeaturePrefsStore.batch721.v729border
    FeaturePrefsStore.batch721.v729border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v729: bounce mode
internal fun PlayerActivity.showV729BounceToggle() {
    val current = FeaturePrefsStore.batch721.v729bounce
    FeaturePrefsStore.batch721.v729bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v729: box mode
internal fun PlayerActivity.showV729BoxToggle() {
    val current = FeaturePrefsStore.batch721.v729box
    FeaturePrefsStore.batch721.v729box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v729: branch mode
internal fun PlayerActivity.showV729BranchToggle() {
    val current = FeaturePrefsStore.batch721.v729branch
    FeaturePrefsStore.batch721.v729branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v729: brand mode
internal fun PlayerActivity.showV729BrandToggle() {
    val current = FeaturePrefsStore.batch721.v729brand
    FeaturePrefsStore.batch721.v729brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v729: break level
internal fun PlayerActivity.showV729BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729break = value
        AppToast.show(this, "break: $value")
    }
}

// v729: bridge level
internal fun PlayerActivity.showV729BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v729: browse level
internal fun PlayerActivity.showV729BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v729: buffer level
internal fun PlayerActivity.showV729BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v729: build level
internal fun PlayerActivity.showV729BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v729build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v729build = value
        AppToast.show(this, "build: $value")
    }
}

// v729: bulk mode
internal fun PlayerActivity.showV729BulkToggle() {
    val current = FeaturePrefsStore.batch721.v729bulk
    FeaturePrefsStore.batch721.v729bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v729: burst mode
internal fun PlayerActivity.showV729BurstToggle() {
    val current = FeaturePrefsStore.batch721.v729burst
    FeaturePrefsStore.batch721.v729burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v729: byte mode
internal fun PlayerActivity.showV729ByteToggle() {
    val current = FeaturePrefsStore.batch721.v729byte
    FeaturePrefsStore.batch721.v729byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v729: cache mode
internal fun PlayerActivity.showV729CacheToggle() {
    val current = FeaturePrefsStore.batch721.v729cache
    FeaturePrefsStore.batch721.v729cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v729: calibrate mode
internal fun PlayerActivity.showV729CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v729calibrate
    FeaturePrefsStore.batch721.v729calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

// v730: border mode
internal fun PlayerActivity.showV730BorderToggle() {
    val current = FeaturePrefsStore.batch721.v730border
    FeaturePrefsStore.batch721.v730border = !current
    AppToast.show(this, "border: ${if (!current) "ON" else "OFF"}")
}

// v730: bounce mode
internal fun PlayerActivity.showV730BounceToggle() {
    val current = FeaturePrefsStore.batch721.v730bounce
    FeaturePrefsStore.batch721.v730bounce = !current
    AppToast.show(this, "bounce: ${if (!current) "ON" else "OFF"}")
}

// v730: box mode
internal fun PlayerActivity.showV730BoxToggle() {
    val current = FeaturePrefsStore.batch721.v730box
    FeaturePrefsStore.batch721.v730box = !current
    AppToast.show(this, "box: ${if (!current) "ON" else "OFF"}")
}

// v730: branch mode
internal fun PlayerActivity.showV730BranchToggle() {
    val current = FeaturePrefsStore.batch721.v730branch
    FeaturePrefsStore.batch721.v730branch = !current
    AppToast.show(this, "branch: ${if (!current) "ON" else "OFF"}")
}

// v730: brand mode
internal fun PlayerActivity.showV730BrandToggle() {
    val current = FeaturePrefsStore.batch721.v730brand
    FeaturePrefsStore.batch721.v730brand = !current
    AppToast.show(this, "brand: ${if (!current) "ON" else "OFF"}")
}

// v730: break level
internal fun PlayerActivity.showV730BreakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730break).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "break level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730break = value
        AppToast.show(this, "break: $value")
    }
}

// v730: bridge level
internal fun PlayerActivity.showV730BridgeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730bridge).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "bridge level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730bridge = value
        AppToast.show(this, "bridge: $value")
    }
}

// v730: browse level
internal fun PlayerActivity.showV730BrowseDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730browse).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "browse level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730browse = value
        AppToast.show(this, "browse: $value")
    }
}

// v730: buffer level
internal fun PlayerActivity.showV730BufferDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730buffer).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "buffer level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730buffer = value
        AppToast.show(this, "buffer: $value")
    }
}

// v730: build level
internal fun PlayerActivity.showV730BuildDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch721.v730build).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "build level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch721.v730build = value
        AppToast.show(this, "build: $value")
    }
}

// v730: bulk mode
internal fun PlayerActivity.showV730BulkToggle() {
    val current = FeaturePrefsStore.batch721.v730bulk
    FeaturePrefsStore.batch721.v730bulk = !current
    AppToast.show(this, "bulk: ${if (!current) "ON" else "OFF"}")
}

// v730: burst mode
internal fun PlayerActivity.showV730BurstToggle() {
    val current = FeaturePrefsStore.batch721.v730burst
    FeaturePrefsStore.batch721.v730burst = !current
    AppToast.show(this, "burst: ${if (!current) "ON" else "OFF"}")
}

// v730: byte mode
internal fun PlayerActivity.showV730ByteToggle() {
    val current = FeaturePrefsStore.batch721.v730byte
    FeaturePrefsStore.batch721.v730byte = !current
    AppToast.show(this, "byte: ${if (!current) "ON" else "OFF"}")
}

// v730: cache mode
internal fun PlayerActivity.showV730CacheToggle() {
    val current = FeaturePrefsStore.batch721.v730cache
    FeaturePrefsStore.batch721.v730cache = !current
    AppToast.show(this, "cache: ${if (!current) "ON" else "OFF"}")
}

// v730: calibrate mode
internal fun PlayerActivity.showV730CalibrateToggle() {
    val current = FeaturePrefsStore.batch721.v730calibrate
    FeaturePrefsStore.batch721.v730calibrate = !current
    AppToast.show(this, "calibrate: ${if (!current) "ON" else "OFF"}")
}

