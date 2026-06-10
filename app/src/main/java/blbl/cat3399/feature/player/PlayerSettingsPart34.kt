package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v463: Lazy Load Enabled463
internal fun PlayerActivity.showV463LazyLoadEnabled463Toggle() {
    val current = BiliClient.prefs.v463lazyLoadEnabled463
    BiliClient.prefs.v463lazyLoadEnabled463 = !current
    AppToast.show(this, "Lazy Load Enabled463: ${if (!current) "ON" else "OFF"}")
}

// v463: Lead In Auto Skip463
internal fun PlayerActivity.showV463LeadInAutoSkip463Toggle() {
    val current = BiliClient.prefs.v463leadInAutoSkip463
    BiliClient.prefs.v463leadInAutoSkip463 = !current
    AppToast.show(this, "Lead In Auto Skip463: ${if (!current) "ON" else "OFF"}")
}

// v463: Lens Correction463
internal fun PlayerActivity.showV463LensCorrection463Toggle() {
    val current = BiliClient.prefs.v463lensCorrection463
    BiliClient.prefs.v463lensCorrection463 = !current
    AppToast.show(this, "Lens Correction463: ${if (!current) "ON" else "OFF"}")
}

// v463: Level Auto Adjust463
internal fun PlayerActivity.showV463LevelAutoAdjust463Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v463levelAutoAdjust463).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust463",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v463levelAutoAdjust463 = value
        AppToast.show(this, "Level Auto Adjust463: $value")
    }
}

// v463: Light Adaptive463
internal fun PlayerActivity.showV463LightAdaptive463Toggle() {
    val current = BiliClient.prefs.v463lightAdaptive463
    BiliClient.prefs.v463lightAdaptive463 = !current
    AppToast.show(this, "Light Adaptive463: ${if (!current) "ON" else "OFF"}")
}

// v463: Limit Bandwidth Auto463
internal fun PlayerActivity.showV463LimitBandwidthAuto463Toggle() {
    val current = BiliClient.prefs.v463limitBandwidthAuto463
    BiliClient.prefs.v463limitBandwidthAuto463 = !current
    AppToast.show(this, "Limit Bandwidth Auto463: ${if (!current) "ON" else "OFF"}")
}

// v463: Line Spacing Adjust463
internal fun PlayerActivity.showV463LineSpacingAdjust463Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v463lineSpacingAdjust463).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust463",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v463lineSpacingAdjust463 = value
        AppToast.show(this, "Line Spacing Adjust463: $value")
    }
}

// v463: Link Preview Auto463
internal fun PlayerActivity.showV463LinkPreviewAuto463Toggle() {
    val current = BiliClient.prefs.v463linkPreviewAuto463
    BiliClient.prefs.v463linkPreviewAuto463 = !current
    AppToast.show(this, "Link Preview Auto463: ${if (!current) "ON" else "OFF"}")
}

// v463: List Animation463
internal fun PlayerActivity.showV463ListAnimation463Toggle() {
    val current = BiliClient.prefs.v463listAnimation463
    BiliClient.prefs.v463listAnimation463 = !current
    AppToast.show(this, "List Animation463: ${if (!current) "ON" else "OFF"}")
}

// v463: Load Priority High463
internal fun PlayerActivity.showV463LoadPriorityHigh463Toggle() {
    val current = BiliClient.prefs.v463loadPriorityHigh463
    BiliClient.prefs.v463loadPriorityHigh463 = !current
    AppToast.show(this, "Load Priority High463: ${if (!current) "ON" else "OFF"}")
}

// v463: Local Cache Enabled463
internal fun PlayerActivity.showV463LocalCacheEnabled463Toggle() {
    val current = BiliClient.prefs.v463localCacheEnabled463
    BiliClient.prefs.v463localCacheEnabled463 = !current
    AppToast.show(this, "Local Cache Enabled463: ${if (!current) "ON" else "OFF"}")
}

// v463: Location Based Rec463
internal fun PlayerActivity.showV463LocationBasedRec463Toggle() {
    val current = BiliClient.prefs.v463locationBasedRec463
    BiliClient.prefs.v463locationBasedRec463 = !current
    AppToast.show(this, "Location Based Rec463: ${if (!current) "ON" else "OFF"}")
}

// v464: Key Mapping Custom464
internal fun PlayerActivity.showV464KeyMappingCustom464Toggle() {
    val current = BiliClient.prefs.v464keyMappingCustom464
    BiliClient.prefs.v464keyMappingCustom464 = !current
    AppToast.show(this, "Key Mapping Custom464: ${if (!current) "ON" else "OFF"}")
}

// v464: Label Auto Generate464
internal fun PlayerActivity.showV464LabelAutoGenerate464Toggle() {
    val current = BiliClient.prefs.v464labelAutoGenerate464
    BiliClient.prefs.v464labelAutoGenerate464 = !current
    AppToast.show(this, "Label Auto Generate464: ${if (!current) "ON" else "OFF"}")
}

// v464: Layer Auto Composite464
internal fun PlayerActivity.showV464LayerAutoComposite464Toggle() {
    val current = BiliClient.prefs.v464layerAutoComposite464
    BiliClient.prefs.v464layerAutoComposite464 = !current
    AppToast.show(this, "Layer Auto Composite464: ${if (!current) "ON" else "OFF"}")
}

// v464: Lazy Load Enabled464
internal fun PlayerActivity.showV464LazyLoadEnabled464Toggle() {
    val current = BiliClient.prefs.v464lazyLoadEnabled464
    BiliClient.prefs.v464lazyLoadEnabled464 = !current
    AppToast.show(this, "Lazy Load Enabled464: ${if (!current) "ON" else "OFF"}")
}

// v464: Lead In Auto Skip464
internal fun PlayerActivity.showV464LeadInAutoSkip464Toggle() {
    val current = BiliClient.prefs.v464leadInAutoSkip464
    BiliClient.prefs.v464leadInAutoSkip464 = !current
    AppToast.show(this, "Lead In Auto Skip464: ${if (!current) "ON" else "OFF"}")
}

// v464: Lens Correction464
internal fun PlayerActivity.showV464LensCorrection464Toggle() {
    val current = BiliClient.prefs.v464lensCorrection464
    BiliClient.prefs.v464lensCorrection464 = !current
    AppToast.show(this, "Lens Correction464: ${if (!current) "ON" else "OFF"}")
}

// v464: Level Auto Adjust464
internal fun PlayerActivity.showV464LevelAutoAdjust464Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v464levelAutoAdjust464).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust464",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v464levelAutoAdjust464 = value
        AppToast.show(this, "Level Auto Adjust464: $value")
    }
}

// v464: Light Adaptive464
internal fun PlayerActivity.showV464LightAdaptive464Toggle() {
    val current = BiliClient.prefs.v464lightAdaptive464
    BiliClient.prefs.v464lightAdaptive464 = !current
    AppToast.show(this, "Light Adaptive464: ${if (!current) "ON" else "OFF"}")
}

// v464: Limit Bandwidth Auto464
internal fun PlayerActivity.showV464LimitBandwidthAuto464Toggle() {
    val current = BiliClient.prefs.v464limitBandwidthAuto464
    BiliClient.prefs.v464limitBandwidthAuto464 = !current
    AppToast.show(this, "Limit Bandwidth Auto464: ${if (!current) "ON" else "OFF"}")
}

// v464: Line Spacing Adjust464
internal fun PlayerActivity.showV464LineSpacingAdjust464Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v464lineSpacingAdjust464).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust464",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v464lineSpacingAdjust464 = value
        AppToast.show(this, "Line Spacing Adjust464: $value")
    }
}

// v464: Link Preview Auto464
internal fun PlayerActivity.showV464LinkPreviewAuto464Toggle() {
    val current = BiliClient.prefs.v464linkPreviewAuto464
    BiliClient.prefs.v464linkPreviewAuto464 = !current
    AppToast.show(this, "Link Preview Auto464: ${if (!current) "ON" else "OFF"}")
}

// v464: List Animation464
internal fun PlayerActivity.showV464ListAnimation464Toggle() {
    val current = BiliClient.prefs.v464listAnimation464
    BiliClient.prefs.v464listAnimation464 = !current
    AppToast.show(this, "List Animation464: ${if (!current) "ON" else "OFF"}")
}

// v464: Load Priority High464
internal fun PlayerActivity.showV464LoadPriorityHigh464Toggle() {
    val current = BiliClient.prefs.v464loadPriorityHigh464
    BiliClient.prefs.v464loadPriorityHigh464 = !current
    AppToast.show(this, "Load Priority High464: ${if (!current) "ON" else "OFF"}")
}

// v464: Local Cache Enabled464
internal fun PlayerActivity.showV464LocalCacheEnabled464Toggle() {
    val current = BiliClient.prefs.v464localCacheEnabled464
    BiliClient.prefs.v464localCacheEnabled464 = !current
    AppToast.show(this, "Local Cache Enabled464: ${if (!current) "ON" else "OFF"}")
}

// v464: Location Based Rec464
internal fun PlayerActivity.showV464LocationBasedRec464Toggle() {
    val current = BiliClient.prefs.v464locationBasedRec464
    BiliClient.prefs.v464locationBasedRec464 = !current
    AppToast.show(this, "Location Based Rec464: ${if (!current) "ON" else "OFF"}")
}

// v465: Key Mapping Custom465
internal fun PlayerActivity.showV465KeyMappingCustom465Toggle() {
    val current = BiliClient.prefs.v465keyMappingCustom465
    BiliClient.prefs.v465keyMappingCustom465 = !current
    AppToast.show(this, "Key Mapping Custom465: ${if (!current) "ON" else "OFF"}")
}

// v465: Label Auto Generate465
internal fun PlayerActivity.showV465LabelAutoGenerate465Toggle() {
    val current = BiliClient.prefs.v465labelAutoGenerate465
    BiliClient.prefs.v465labelAutoGenerate465 = !current
    AppToast.show(this, "Label Auto Generate465: ${if (!current) "ON" else "OFF"}")
}

// v465: Layer Auto Composite465
internal fun PlayerActivity.showV465LayerAutoComposite465Toggle() {
    val current = BiliClient.prefs.v465layerAutoComposite465
    BiliClient.prefs.v465layerAutoComposite465 = !current
    AppToast.show(this, "Layer Auto Composite465: ${if (!current) "ON" else "OFF"}")
}

// v465: Lazy Load Enabled465
internal fun PlayerActivity.showV465LazyLoadEnabled465Toggle() {
    val current = BiliClient.prefs.v465lazyLoadEnabled465
    BiliClient.prefs.v465lazyLoadEnabled465 = !current
    AppToast.show(this, "Lazy Load Enabled465: ${if (!current) "ON" else "OFF"}")
}

// v465: Lead In Auto Skip465
internal fun PlayerActivity.showV465LeadInAutoSkip465Toggle() {
    val current = BiliClient.prefs.v465leadInAutoSkip465
    BiliClient.prefs.v465leadInAutoSkip465 = !current
    AppToast.show(this, "Lead In Auto Skip465: ${if (!current) "ON" else "OFF"}")
}

// v465: Lens Correction465
internal fun PlayerActivity.showV465LensCorrection465Toggle() {
    val current = BiliClient.prefs.v465lensCorrection465
    BiliClient.prefs.v465lensCorrection465 = !current
    AppToast.show(this, "Lens Correction465: ${if (!current) "ON" else "OFF"}")
}

// v465: Level Auto Adjust465
internal fun PlayerActivity.showV465LevelAutoAdjust465Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v465levelAutoAdjust465).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust465",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v465levelAutoAdjust465 = value
        AppToast.show(this, "Level Auto Adjust465: $value")
    }
}

// v465: Light Adaptive465
internal fun PlayerActivity.showV465LightAdaptive465Toggle() {
    val current = BiliClient.prefs.v465lightAdaptive465
    BiliClient.prefs.v465lightAdaptive465 = !current
    AppToast.show(this, "Light Adaptive465: ${if (!current) "ON" else "OFF"}")
}

// v465: Limit Bandwidth Auto465
internal fun PlayerActivity.showV465LimitBandwidthAuto465Toggle() {
    val current = BiliClient.prefs.v465limitBandwidthAuto465
    BiliClient.prefs.v465limitBandwidthAuto465 = !current
    AppToast.show(this, "Limit Bandwidth Auto465: ${if (!current) "ON" else "OFF"}")
}

// v465: Line Spacing Adjust465
internal fun PlayerActivity.showV465LineSpacingAdjust465Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v465lineSpacingAdjust465).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust465",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v465lineSpacingAdjust465 = value
        AppToast.show(this, "Line Spacing Adjust465: $value")
    }
}

// v465: Link Preview Auto465
internal fun PlayerActivity.showV465LinkPreviewAuto465Toggle() {
    val current = BiliClient.prefs.v465linkPreviewAuto465
    BiliClient.prefs.v465linkPreviewAuto465 = !current
    AppToast.show(this, "Link Preview Auto465: ${if (!current) "ON" else "OFF"}")
}

// v465: List Animation465
internal fun PlayerActivity.showV465ListAnimation465Toggle() {
    val current = BiliClient.prefs.v465listAnimation465
    BiliClient.prefs.v465listAnimation465 = !current
    AppToast.show(this, "List Animation465: ${if (!current) "ON" else "OFF"}")
}

// v465: Load Priority High465
internal fun PlayerActivity.showV465LoadPriorityHigh465Toggle() {
    val current = BiliClient.prefs.v465loadPriorityHigh465
    BiliClient.prefs.v465loadPriorityHigh465 = !current
    AppToast.show(this, "Load Priority High465: ${if (!current) "ON" else "OFF"}")
}

// v465: Local Cache Enabled465
internal fun PlayerActivity.showV465LocalCacheEnabled465Toggle() {
    val current = BiliClient.prefs.v465localCacheEnabled465
    BiliClient.prefs.v465localCacheEnabled465 = !current
    AppToast.show(this, "Local Cache Enabled465: ${if (!current) "ON" else "OFF"}")
}

// v465: Location Based Rec465
internal fun PlayerActivity.showV465LocationBasedRec465Toggle() {
    val current = BiliClient.prefs.v465locationBasedRec465
    BiliClient.prefs.v465locationBasedRec465 = !current
    AppToast.show(this, "Location Based Rec465: ${if (!current) "ON" else "OFF"}")
}

// v466: Key Mapping Custom466
internal fun PlayerActivity.showV466KeyMappingCustom466Toggle() {
    val current = BiliClient.prefs.v466keyMappingCustom466
    BiliClient.prefs.v466keyMappingCustom466 = !current
    AppToast.show(this, "Key Mapping Custom466: ${if (!current) "ON" else "OFF"}")
}

// v466: Label Auto Generate466
internal fun PlayerActivity.showV466LabelAutoGenerate466Toggle() {
    val current = BiliClient.prefs.v466labelAutoGenerate466
    BiliClient.prefs.v466labelAutoGenerate466 = !current
    AppToast.show(this, "Label Auto Generate466: ${if (!current) "ON" else "OFF"}")
}

// v466: Layer Auto Composite466
internal fun PlayerActivity.showV466LayerAutoComposite466Toggle() {
    val current = BiliClient.prefs.v466layerAutoComposite466
    BiliClient.prefs.v466layerAutoComposite466 = !current
    AppToast.show(this, "Layer Auto Composite466: ${if (!current) "ON" else "OFF"}")
}

// v466: Lazy Load Enabled466
internal fun PlayerActivity.showV466LazyLoadEnabled466Toggle() {
    val current = BiliClient.prefs.v466lazyLoadEnabled466
    BiliClient.prefs.v466lazyLoadEnabled466 = !current
    AppToast.show(this, "Lazy Load Enabled466: ${if (!current) "ON" else "OFF"}")
}

// v466: Lead In Auto Skip466
internal fun PlayerActivity.showV466LeadInAutoSkip466Toggle() {
    val current = BiliClient.prefs.v466leadInAutoSkip466
    BiliClient.prefs.v466leadInAutoSkip466 = !current
    AppToast.show(this, "Lead In Auto Skip466: ${if (!current) "ON" else "OFF"}")
}

// v466: Lens Correction466
internal fun PlayerActivity.showV466LensCorrection466Toggle() {
    val current = BiliClient.prefs.v466lensCorrection466
    BiliClient.prefs.v466lensCorrection466 = !current
    AppToast.show(this, "Lens Correction466: ${if (!current) "ON" else "OFF"}")
}

// v466: Level Auto Adjust466
internal fun PlayerActivity.showV466LevelAutoAdjust466Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v466levelAutoAdjust466).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust466",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v466levelAutoAdjust466 = value
        AppToast.show(this, "Level Auto Adjust466: $value")
    }
}

// v466: Light Adaptive466
internal fun PlayerActivity.showV466LightAdaptive466Toggle() {
    val current = BiliClient.prefs.v466lightAdaptive466
    BiliClient.prefs.v466lightAdaptive466 = !current
    AppToast.show(this, "Light Adaptive466: ${if (!current) "ON" else "OFF"}")
}

// v466: Limit Bandwidth Auto466
internal fun PlayerActivity.showV466LimitBandwidthAuto466Toggle() {
    val current = BiliClient.prefs.v466limitBandwidthAuto466
    BiliClient.prefs.v466limitBandwidthAuto466 = !current
    AppToast.show(this, "Limit Bandwidth Auto466: ${if (!current) "ON" else "OFF"}")
}

// v466: Line Spacing Adjust466
internal fun PlayerActivity.showV466LineSpacingAdjust466Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v466lineSpacingAdjust466).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust466",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v466lineSpacingAdjust466 = value
        AppToast.show(this, "Line Spacing Adjust466: $value")
    }
}

// v466: Link Preview Auto466
internal fun PlayerActivity.showV466LinkPreviewAuto466Toggle() {
    val current = BiliClient.prefs.v466linkPreviewAuto466
    BiliClient.prefs.v466linkPreviewAuto466 = !current
    AppToast.show(this, "Link Preview Auto466: ${if (!current) "ON" else "OFF"}")
}

// v466: List Animation466
internal fun PlayerActivity.showV466ListAnimation466Toggle() {
    val current = BiliClient.prefs.v466listAnimation466
    BiliClient.prefs.v466listAnimation466 = !current
    AppToast.show(this, "List Animation466: ${if (!current) "ON" else "OFF"}")
}

// v466: Load Priority High466
internal fun PlayerActivity.showV466LoadPriorityHigh466Toggle() {
    val current = BiliClient.prefs.v466loadPriorityHigh466
    BiliClient.prefs.v466loadPriorityHigh466 = !current
    AppToast.show(this, "Load Priority High466: ${if (!current) "ON" else "OFF"}")
}

// v466: Local Cache Enabled466
internal fun PlayerActivity.showV466LocalCacheEnabled466Toggle() {
    val current = BiliClient.prefs.v466localCacheEnabled466
    BiliClient.prefs.v466localCacheEnabled466 = !current
    AppToast.show(this, "Local Cache Enabled466: ${if (!current) "ON" else "OFF"}")
}

// v466: Location Based Rec466
internal fun PlayerActivity.showV466LocationBasedRec466Toggle() {
    val current = BiliClient.prefs.v466locationBasedRec466
    BiliClient.prefs.v466locationBasedRec466 = !current
    AppToast.show(this, "Location Based Rec466: ${if (!current) "ON" else "OFF"}")
}

// v467: Key Mapping Custom467
internal fun PlayerActivity.showV467KeyMappingCustom467Toggle() {
    val current = BiliClient.prefs.v467keyMappingCustom467
    BiliClient.prefs.v467keyMappingCustom467 = !current
    AppToast.show(this, "Key Mapping Custom467: ${if (!current) "ON" else "OFF"}")
}

// v467: Label Auto Generate467
internal fun PlayerActivity.showV467LabelAutoGenerate467Toggle() {
    val current = BiliClient.prefs.v467labelAutoGenerate467
    BiliClient.prefs.v467labelAutoGenerate467 = !current
    AppToast.show(this, "Label Auto Generate467: ${if (!current) "ON" else "OFF"}")
}

// v467: Layer Auto Composite467
internal fun PlayerActivity.showV467LayerAutoComposite467Toggle() {
    val current = BiliClient.prefs.v467layerAutoComposite467
    BiliClient.prefs.v467layerAutoComposite467 = !current
    AppToast.show(this, "Layer Auto Composite467: ${if (!current) "ON" else "OFF"}")
}

// v467: Lazy Load Enabled467
internal fun PlayerActivity.showV467LazyLoadEnabled467Toggle() {
    val current = BiliClient.prefs.v467lazyLoadEnabled467
    BiliClient.prefs.v467lazyLoadEnabled467 = !current
    AppToast.show(this, "Lazy Load Enabled467: ${if (!current) "ON" else "OFF"}")
}

// v467: Lead In Auto Skip467
internal fun PlayerActivity.showV467LeadInAutoSkip467Toggle() {
    val current = BiliClient.prefs.v467leadInAutoSkip467
    BiliClient.prefs.v467leadInAutoSkip467 = !current
    AppToast.show(this, "Lead In Auto Skip467: ${if (!current) "ON" else "OFF"}")
}

// v467: Lens Correction467
internal fun PlayerActivity.showV467LensCorrection467Toggle() {
    val current = BiliClient.prefs.v467lensCorrection467
    BiliClient.prefs.v467lensCorrection467 = !current
    AppToast.show(this, "Lens Correction467: ${if (!current) "ON" else "OFF"}")
}

// v467: Level Auto Adjust467
internal fun PlayerActivity.showV467LevelAutoAdjust467Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v467levelAutoAdjust467).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust467",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v467levelAutoAdjust467 = value
        AppToast.show(this, "Level Auto Adjust467: $value")
    }
}

// v467: Light Adaptive467
internal fun PlayerActivity.showV467LightAdaptive467Toggle() {
    val current = BiliClient.prefs.v467lightAdaptive467
    BiliClient.prefs.v467lightAdaptive467 = !current
    AppToast.show(this, "Light Adaptive467: ${if (!current) "ON" else "OFF"}")
}

// v467: Limit Bandwidth Auto467
internal fun PlayerActivity.showV467LimitBandwidthAuto467Toggle() {
    val current = BiliClient.prefs.v467limitBandwidthAuto467
    BiliClient.prefs.v467limitBandwidthAuto467 = !current
    AppToast.show(this, "Limit Bandwidth Auto467: ${if (!current) "ON" else "OFF"}")
}

// v467: Line Spacing Adjust467
internal fun PlayerActivity.showV467LineSpacingAdjust467Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v467lineSpacingAdjust467).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust467",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v467lineSpacingAdjust467 = value
        AppToast.show(this, "Line Spacing Adjust467: $value")
    }
}

// v467: Link Preview Auto467
internal fun PlayerActivity.showV467LinkPreviewAuto467Toggle() {
    val current = BiliClient.prefs.v467linkPreviewAuto467
    BiliClient.prefs.v467linkPreviewAuto467 = !current
    AppToast.show(this, "Link Preview Auto467: ${if (!current) "ON" else "OFF"}")
}

// v467: List Animation467
internal fun PlayerActivity.showV467ListAnimation467Toggle() {
    val current = BiliClient.prefs.v467listAnimation467
    BiliClient.prefs.v467listAnimation467 = !current
    AppToast.show(this, "List Animation467: ${if (!current) "ON" else "OFF"}")
}

// v467: Load Priority High467
internal fun PlayerActivity.showV467LoadPriorityHigh467Toggle() {
    val current = BiliClient.prefs.v467loadPriorityHigh467
    BiliClient.prefs.v467loadPriorityHigh467 = !current
    AppToast.show(this, "Load Priority High467: ${if (!current) "ON" else "OFF"}")
}

// v467: Local Cache Enabled467
internal fun PlayerActivity.showV467LocalCacheEnabled467Toggle() {
    val current = BiliClient.prefs.v467localCacheEnabled467
    BiliClient.prefs.v467localCacheEnabled467 = !current
    AppToast.show(this, "Local Cache Enabled467: ${if (!current) "ON" else "OFF"}")
}

// v467: Location Based Rec467
internal fun PlayerActivity.showV467LocationBasedRec467Toggle() {
    val current = BiliClient.prefs.v467locationBasedRec467
    BiliClient.prefs.v467locationBasedRec467 = !current
    AppToast.show(this, "Location Based Rec467: ${if (!current) "ON" else "OFF"}")
}

// v468: Key Mapping Custom468
internal fun PlayerActivity.showV468KeyMappingCustom468Toggle() {
    val current = BiliClient.prefs.v468keyMappingCustom468
    BiliClient.prefs.v468keyMappingCustom468 = !current
    AppToast.show(this, "Key Mapping Custom468: ${if (!current) "ON" else "OFF"}")
}

// v468: Label Auto Generate468
internal fun PlayerActivity.showV468LabelAutoGenerate468Toggle() {
    val current = BiliClient.prefs.v468labelAutoGenerate468
    BiliClient.prefs.v468labelAutoGenerate468 = !current
    AppToast.show(this, "Label Auto Generate468: ${if (!current) "ON" else "OFF"}")
}

// v468: Layer Auto Composite468
internal fun PlayerActivity.showV468LayerAutoComposite468Toggle() {
    val current = BiliClient.prefs.v468layerAutoComposite468
    BiliClient.prefs.v468layerAutoComposite468 = !current
    AppToast.show(this, "Layer Auto Composite468: ${if (!current) "ON" else "OFF"}")
}

// v468: Lazy Load Enabled468
internal fun PlayerActivity.showV468LazyLoadEnabled468Toggle() {
    val current = BiliClient.prefs.v468lazyLoadEnabled468
    BiliClient.prefs.v468lazyLoadEnabled468 = !current
    AppToast.show(this, "Lazy Load Enabled468: ${if (!current) "ON" else "OFF"}")
}

// v468: Lead In Auto Skip468
internal fun PlayerActivity.showV468LeadInAutoSkip468Toggle() {
    val current = BiliClient.prefs.v468leadInAutoSkip468
    BiliClient.prefs.v468leadInAutoSkip468 = !current
    AppToast.show(this, "Lead In Auto Skip468: ${if (!current) "ON" else "OFF"}")
}

// v468: Lens Correction468
internal fun PlayerActivity.showV468LensCorrection468Toggle() {
    val current = BiliClient.prefs.v468lensCorrection468
    BiliClient.prefs.v468lensCorrection468 = !current
    AppToast.show(this, "Lens Correction468: ${if (!current) "ON" else "OFF"}")
}

// v468: Level Auto Adjust468
internal fun PlayerActivity.showV468LevelAutoAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468levelAutoAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468levelAutoAdjust468 = value
        AppToast.show(this, "Level Auto Adjust468: $value")
    }
}

// v468: Light Adaptive468
internal fun PlayerActivity.showV468LightAdaptive468Toggle() {
    val current = BiliClient.prefs.v468lightAdaptive468
    BiliClient.prefs.v468lightAdaptive468 = !current
    AppToast.show(this, "Light Adaptive468: ${if (!current) "ON" else "OFF"}")
}

// v468: Limit Bandwidth Auto468
internal fun PlayerActivity.showV468LimitBandwidthAuto468Toggle() {
    val current = BiliClient.prefs.v468limitBandwidthAuto468
    BiliClient.prefs.v468limitBandwidthAuto468 = !current
    AppToast.show(this, "Limit Bandwidth Auto468: ${if (!current) "ON" else "OFF"}")
}

// v468: Line Spacing Adjust468
internal fun PlayerActivity.showV468LineSpacingAdjust468Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v468lineSpacingAdjust468).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust468",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v468lineSpacingAdjust468 = value
        AppToast.show(this, "Line Spacing Adjust468: $value")
    }
}

// v468: Link Preview Auto468
internal fun PlayerActivity.showV468LinkPreviewAuto468Toggle() {
    val current = BiliClient.prefs.v468linkPreviewAuto468
    BiliClient.prefs.v468linkPreviewAuto468 = !current
    AppToast.show(this, "Link Preview Auto468: ${if (!current) "ON" else "OFF"}")
}

// v468: List Animation468
internal fun PlayerActivity.showV468ListAnimation468Toggle() {
    val current = BiliClient.prefs.v468listAnimation468
    BiliClient.prefs.v468listAnimation468 = !current
    AppToast.show(this, "List Animation468: ${if (!current) "ON" else "OFF"}")
}

// v468: Load Priority High468
internal fun PlayerActivity.showV468LoadPriorityHigh468Toggle() {
    val current = BiliClient.prefs.v468loadPriorityHigh468
    BiliClient.prefs.v468loadPriorityHigh468 = !current
    AppToast.show(this, "Load Priority High468: ${if (!current) "ON" else "OFF"}")
}

// v468: Local Cache Enabled468
internal fun PlayerActivity.showV468LocalCacheEnabled468Toggle() {
    val current = BiliClient.prefs.v468localCacheEnabled468
    BiliClient.prefs.v468localCacheEnabled468 = !current
    AppToast.show(this, "Local Cache Enabled468: ${if (!current) "ON" else "OFF"}")
}

// v468: Location Based Rec468
internal fun PlayerActivity.showV468LocationBasedRec468Toggle() {
    val current = BiliClient.prefs.v468locationBasedRec468
    BiliClient.prefs.v468locationBasedRec468 = !current
    AppToast.show(this, "Location Based Rec468: ${if (!current) "ON" else "OFF"}")
}

// v469: Key Mapping Custom469
internal fun PlayerActivity.showV469KeyMappingCustom469Toggle() {
    val current = BiliClient.prefs.v469keyMappingCustom469
    BiliClient.prefs.v469keyMappingCustom469 = !current
    AppToast.show(this, "Key Mapping Custom469: ${if (!current) "ON" else "OFF"}")
}

// v469: Label Auto Generate469
internal fun PlayerActivity.showV469LabelAutoGenerate469Toggle() {
    val current = BiliClient.prefs.v469labelAutoGenerate469
    BiliClient.prefs.v469labelAutoGenerate469 = !current
    AppToast.show(this, "Label Auto Generate469: ${if (!current) "ON" else "OFF"}")
}

// v469: Layer Auto Composite469
internal fun PlayerActivity.showV469LayerAutoComposite469Toggle() {
    val current = BiliClient.prefs.v469layerAutoComposite469
    BiliClient.prefs.v469layerAutoComposite469 = !current
    AppToast.show(this, "Layer Auto Composite469: ${if (!current) "ON" else "OFF"}")
}

// v469: Lazy Load Enabled469
internal fun PlayerActivity.showV469LazyLoadEnabled469Toggle() {
    val current = BiliClient.prefs.v469lazyLoadEnabled469
    BiliClient.prefs.v469lazyLoadEnabled469 = !current
    AppToast.show(this, "Lazy Load Enabled469: ${if (!current) "ON" else "OFF"}")
}

// v469: Lead In Auto Skip469
internal fun PlayerActivity.showV469LeadInAutoSkip469Toggle() {
    val current = BiliClient.prefs.v469leadInAutoSkip469
    BiliClient.prefs.v469leadInAutoSkip469 = !current
    AppToast.show(this, "Lead In Auto Skip469: ${if (!current) "ON" else "OFF"}")
}

// v469: Lens Correction469
internal fun PlayerActivity.showV469LensCorrection469Toggle() {
    val current = BiliClient.prefs.v469lensCorrection469
    BiliClient.prefs.v469lensCorrection469 = !current
    AppToast.show(this, "Lens Correction469: ${if (!current) "ON" else "OFF"}")
}

// v469: Level Auto Adjust469
internal fun PlayerActivity.showV469LevelAutoAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469levelAutoAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469levelAutoAdjust469 = value
        AppToast.show(this, "Level Auto Adjust469: $value")
    }
}

// v469: Light Adaptive469
internal fun PlayerActivity.showV469LightAdaptive469Toggle() {
    val current = BiliClient.prefs.v469lightAdaptive469
    BiliClient.prefs.v469lightAdaptive469 = !current
    AppToast.show(this, "Light Adaptive469: ${if (!current) "ON" else "OFF"}")
}

// v469: Limit Bandwidth Auto469
internal fun PlayerActivity.showV469LimitBandwidthAuto469Toggle() {
    val current = BiliClient.prefs.v469limitBandwidthAuto469
    BiliClient.prefs.v469limitBandwidthAuto469 = !current
    AppToast.show(this, "Limit Bandwidth Auto469: ${if (!current) "ON" else "OFF"}")
}

// v469: Line Spacing Adjust469
internal fun PlayerActivity.showV469LineSpacingAdjust469Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v469lineSpacingAdjust469).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust469",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v469lineSpacingAdjust469 = value
        AppToast.show(this, "Line Spacing Adjust469: $value")
    }
}

// v469: Link Preview Auto469
internal fun PlayerActivity.showV469LinkPreviewAuto469Toggle() {
    val current = BiliClient.prefs.v469linkPreviewAuto469
    BiliClient.prefs.v469linkPreviewAuto469 = !current
    AppToast.show(this, "Link Preview Auto469: ${if (!current) "ON" else "OFF"}")
}

// v469: List Animation469
internal fun PlayerActivity.showV469ListAnimation469Toggle() {
    val current = BiliClient.prefs.v469listAnimation469
    BiliClient.prefs.v469listAnimation469 = !current
    AppToast.show(this, "List Animation469: ${if (!current) "ON" else "OFF"}")
}

// v469: Load Priority High469
internal fun PlayerActivity.showV469LoadPriorityHigh469Toggle() {
    val current = BiliClient.prefs.v469loadPriorityHigh469
    BiliClient.prefs.v469loadPriorityHigh469 = !current
    AppToast.show(this, "Load Priority High469: ${if (!current) "ON" else "OFF"}")
}

// v469: Local Cache Enabled469
internal fun PlayerActivity.showV469LocalCacheEnabled469Toggle() {
    val current = BiliClient.prefs.v469localCacheEnabled469
    BiliClient.prefs.v469localCacheEnabled469 = !current
    AppToast.show(this, "Local Cache Enabled469: ${if (!current) "ON" else "OFF"}")
}

// v469: Location Based Rec469
internal fun PlayerActivity.showV469LocationBasedRec469Toggle() {
    val current = BiliClient.prefs.v469locationBasedRec469
    BiliClient.prefs.v469locationBasedRec469 = !current
    AppToast.show(this, "Location Based Rec469: ${if (!current) "ON" else "OFF"}")
}

// v470: Key Mapping Custom470
internal fun PlayerActivity.showV470KeyMappingCustom470Toggle() {
    val current = BiliClient.prefs.v470keyMappingCustom470
    BiliClient.prefs.v470keyMappingCustom470 = !current
    AppToast.show(this, "Key Mapping Custom470: ${if (!current) "ON" else "OFF"}")
}

// v470: Label Auto Generate470
internal fun PlayerActivity.showV470LabelAutoGenerate470Toggle() {
    val current = BiliClient.prefs.v470labelAutoGenerate470
    BiliClient.prefs.v470labelAutoGenerate470 = !current
    AppToast.show(this, "Label Auto Generate470: ${if (!current) "ON" else "OFF"}")
}

// v470: Layer Auto Composite470
internal fun PlayerActivity.showV470LayerAutoComposite470Toggle() {
    val current = BiliClient.prefs.v470layerAutoComposite470
    BiliClient.prefs.v470layerAutoComposite470 = !current
    AppToast.show(this, "Layer Auto Composite470: ${if (!current) "ON" else "OFF"}")
}

// v470: Lazy Load Enabled470
internal fun PlayerActivity.showV470LazyLoadEnabled470Toggle() {
    val current = BiliClient.prefs.v470lazyLoadEnabled470
    BiliClient.prefs.v470lazyLoadEnabled470 = !current
    AppToast.show(this, "Lazy Load Enabled470: ${if (!current) "ON" else "OFF"}")
}

// v470: Lead In Auto Skip470
internal fun PlayerActivity.showV470LeadInAutoSkip470Toggle() {
    val current = BiliClient.prefs.v470leadInAutoSkip470
    BiliClient.prefs.v470leadInAutoSkip470 = !current
    AppToast.show(this, "Lead In Auto Skip470: ${if (!current) "ON" else "OFF"}")
}

// v470: Lens Correction470
internal fun PlayerActivity.showV470LensCorrection470Toggle() {
    val current = BiliClient.prefs.v470lensCorrection470
    BiliClient.prefs.v470lensCorrection470 = !current
    AppToast.show(this, "Lens Correction470: ${if (!current) "ON" else "OFF"}")
}

// v470: Level Auto Adjust470
internal fun PlayerActivity.showV470LevelAutoAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470levelAutoAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Level Auto Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470levelAutoAdjust470 = value
        AppToast.show(this, "Level Auto Adjust470: $value")
    }
}

// v470: Light Adaptive470
internal fun PlayerActivity.showV470LightAdaptive470Toggle() {
    val current = BiliClient.prefs.v470lightAdaptive470
    BiliClient.prefs.v470lightAdaptive470 = !current
    AppToast.show(this, "Light Adaptive470: ${if (!current) "ON" else "OFF"}")
}

// v470: Limit Bandwidth Auto470
internal fun PlayerActivity.showV470LimitBandwidthAuto470Toggle() {
    val current = BiliClient.prefs.v470limitBandwidthAuto470
    BiliClient.prefs.v470limitBandwidthAuto470 = !current
    AppToast.show(this, "Limit Bandwidth Auto470: ${if (!current) "ON" else "OFF"}")
}

// v470: Line Spacing Adjust470
internal fun PlayerActivity.showV470LineSpacingAdjust470Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v470lineSpacingAdjust470).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Line Spacing Adjust470",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v470lineSpacingAdjust470 = value
        AppToast.show(this, "Line Spacing Adjust470: $value")
    }
}

// v470: Link Preview Auto470
internal fun PlayerActivity.showV470LinkPreviewAuto470Toggle() {
    val current = BiliClient.prefs.v470linkPreviewAuto470
    BiliClient.prefs.v470linkPreviewAuto470 = !current
    AppToast.show(this, "Link Preview Auto470: ${if (!current) "ON" else "OFF"}")
}

// v470: List Animation470
internal fun PlayerActivity.showV470ListAnimation470Toggle() {
    val current = BiliClient.prefs.v470listAnimation470
    BiliClient.prefs.v470listAnimation470 = !current
    AppToast.show(this, "List Animation470: ${if (!current) "ON" else "OFF"}")
}

// v470: Load Priority High470
internal fun PlayerActivity.showV470LoadPriorityHigh470Toggle() {
    val current = BiliClient.prefs.v470loadPriorityHigh470
    BiliClient.prefs.v470loadPriorityHigh470 = !current
    AppToast.show(this, "Load Priority High470: ${if (!current) "ON" else "OFF"}")
}

// v470: Local Cache Enabled470
internal fun PlayerActivity.showV470LocalCacheEnabled470Toggle() {
    val current = BiliClient.prefs.v470localCacheEnabled470
    BiliClient.prefs.v470localCacheEnabled470 = !current
    AppToast.show(this, "Local Cache Enabled470: ${if (!current) "ON" else "OFF"}")
}

// v470: Location Based Rec470
internal fun PlayerActivity.showV470LocationBasedRec470Toggle() {
    val current = BiliClient.prefs.v470locationBasedRec470
    BiliClient.prefs.v470locationBasedRec470 = !current
    AppToast.show(this, "Location Based Rec470: ${if (!current) "ON" else "OFF"}")
}

// v471: Mark Auto Highlight471
internal fun PlayerActivity.showV471MarkAutoHighlight471Toggle() {
    val current = BiliClient.prefs.v471markAutoHighlight471
    BiliClient.prefs.v471markAutoHighlight471 = !current
    AppToast.show(this, "Mark Auto Highlight471: ${if (!current) "ON" else "OFF"}")
}

// v471: Mask Auto Apply471
internal fun PlayerActivity.showV471MaskAutoApply471Toggle() {
    val current = BiliClient.prefs.v471maskAutoApply471
    BiliClient.prefs.v471maskAutoApply471 = !current
    AppToast.show(this, "Mask Auto Apply471: ${if (!current) "ON" else "OFF"}")
}

// v471: Match Auto Start471
internal fun PlayerActivity.showV471MatchAutoStart471Toggle() {
    val current = BiliClient.prefs.v471matchAutoStart471
    BiliClient.prefs.v471matchAutoStart471 = !current
    AppToast.show(this, "Match Auto Start471: ${if (!current) "ON" else "OFF"}")
}

// v471: Matrix Transform471
internal fun PlayerActivity.showV471MatrixTransform471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471matrixTransform471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471matrixTransform471 = value
        AppToast.show(this, "Matrix Transform471: $value")
    }
}

// v471: Max Concurrent Load471
internal fun PlayerActivity.showV471MaxConcurrentLoad471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471maxConcurrentLoad471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471maxConcurrentLoad471 = value
        AppToast.show(this, "Max Concurrent Load471: $value")
    }
}

// v471: Measure Auto Calibrate471
internal fun PlayerActivity.showV471MeasureAutoCalibrate471Toggle() {
    val current = BiliClient.prefs.v471measureAutoCalibrate471
    BiliClient.prefs.v471measureAutoCalibrate471 = !current
    AppToast.show(this, "Measure Auto Calibrate471: ${if (!current) "ON" else "OFF"}")
}

// v471: Media Auto Detect471
internal fun PlayerActivity.showV471MediaAutoDetect471Toggle() {
    val current = BiliClient.prefs.v471mediaAutoDetect471
    BiliClient.prefs.v471mediaAutoDetect471 = !current
    AppToast.show(this, "Media Auto Detect471: ${if (!current) "ON" else "OFF"}")
}

// v471: Memory Optimize Auto471
internal fun PlayerActivity.showV471MemoryOptimizeAuto471Toggle() {
    val current = BiliClient.prefs.v471memoryOptimizeAuto471
    BiliClient.prefs.v471memoryOptimizeAuto471 = !current
    AppToast.show(this, "Memory Optimize Auto471: ${if (!current) "ON" else "OFF"}")
}

// v471: Merge Auto Resolve471
internal fun PlayerActivity.showV471MergeAutoResolve471Toggle() {
    val current = BiliClient.prefs.v471mergeAutoResolve471
    BiliClient.prefs.v471mergeAutoResolve471 = !current
    AppToast.show(this, "Merge Auto Resolve471: ${if (!current) "ON" else "OFF"}")
}

// v471: Message Auto Reply471
internal fun PlayerActivity.showV471MessageAutoReply471Toggle() {
    val current = BiliClient.prefs.v471messageAutoReply471
    BiliClient.prefs.v471messageAutoReply471 = !current
    AppToast.show(this, "Message Auto Reply471: ${if (!current) "ON" else "OFF"}")
}

// v471: Method Auto Invoke471
internal fun PlayerActivity.showV471MethodAutoInvoke471Toggle() {
    val current = BiliClient.prefs.v471methodAutoInvoke471
    BiliClient.prefs.v471methodAutoInvoke471 = !current
    AppToast.show(this, "Method Auto Invoke471: ${if (!current) "ON" else "OFF"}")
}

// v471: Mic Auto Mute471
internal fun PlayerActivity.showV471MicAutoMute471Toggle() {
    val current = BiliClient.prefs.v471micAutoMute471
    BiliClient.prefs.v471micAutoMute471 = !current
    AppToast.show(this, "Mic Auto Mute471: ${if (!current) "ON" else "OFF"}")
}

// v471: Min Bitrate Auto471
internal fun PlayerActivity.showV471MinBitrateAuto471Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v471minBitrateAuto471).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto471",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v471minBitrateAuto471 = value
        AppToast.show(this, "Min Bitrate Auto471: $value")
    }
}

// v471: Mode Auto Switch471
internal fun PlayerActivity.showV471ModeAutoSwitch471Toggle() {
    val current = BiliClient.prefs.v471modeAutoSwitch471
    BiliClient.prefs.v471modeAutoSwitch471 = !current
    AppToast.show(this, "Mode Auto Switch471: ${if (!current) "ON" else "OFF"}")
}

// v471: Model Auto Load471
internal fun PlayerActivity.showV471ModelAutoLoad471Toggle() {
    val current = BiliClient.prefs.v471modelAutoLoad471
    BiliClient.prefs.v471modelAutoLoad471 = !current
    AppToast.show(this, "Model Auto Load471: ${if (!current) "ON" else "OFF"}")
}

// v472: Mark Auto Highlight472
internal fun PlayerActivity.showV472MarkAutoHighlight472Toggle() {
    val current = BiliClient.prefs.v472markAutoHighlight472
    BiliClient.prefs.v472markAutoHighlight472 = !current
    AppToast.show(this, "Mark Auto Highlight472: ${if (!current) "ON" else "OFF"}")
}

// v472: Mask Auto Apply472
internal fun PlayerActivity.showV472MaskAutoApply472Toggle() {
    val current = BiliClient.prefs.v472maskAutoApply472
    BiliClient.prefs.v472maskAutoApply472 = !current
    AppToast.show(this, "Mask Auto Apply472: ${if (!current) "ON" else "OFF"}")
}

// v472: Match Auto Start472
internal fun PlayerActivity.showV472MatchAutoStart472Toggle() {
    val current = BiliClient.prefs.v472matchAutoStart472
    BiliClient.prefs.v472matchAutoStart472 = !current
    AppToast.show(this, "Match Auto Start472: ${if (!current) "ON" else "OFF"}")
}

// v472: Matrix Transform472
internal fun PlayerActivity.showV472MatrixTransform472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472matrixTransform472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472matrixTransform472 = value
        AppToast.show(this, "Matrix Transform472: $value")
    }
}

// v472: Max Concurrent Load472
internal fun PlayerActivity.showV472MaxConcurrentLoad472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472maxConcurrentLoad472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472maxConcurrentLoad472 = value
        AppToast.show(this, "Max Concurrent Load472: $value")
    }
}

// v472: Measure Auto Calibrate472
internal fun PlayerActivity.showV472MeasureAutoCalibrate472Toggle() {
    val current = BiliClient.prefs.v472measureAutoCalibrate472
    BiliClient.prefs.v472measureAutoCalibrate472 = !current
    AppToast.show(this, "Measure Auto Calibrate472: ${if (!current) "ON" else "OFF"}")
}

// v472: Media Auto Detect472
internal fun PlayerActivity.showV472MediaAutoDetect472Toggle() {
    val current = BiliClient.prefs.v472mediaAutoDetect472
    BiliClient.prefs.v472mediaAutoDetect472 = !current
    AppToast.show(this, "Media Auto Detect472: ${if (!current) "ON" else "OFF"}")
}

// v472: Memory Optimize Auto472
internal fun PlayerActivity.showV472MemoryOptimizeAuto472Toggle() {
    val current = BiliClient.prefs.v472memoryOptimizeAuto472
    BiliClient.prefs.v472memoryOptimizeAuto472 = !current
    AppToast.show(this, "Memory Optimize Auto472: ${if (!current) "ON" else "OFF"}")
}

// v472: Merge Auto Resolve472
internal fun PlayerActivity.showV472MergeAutoResolve472Toggle() {
    val current = BiliClient.prefs.v472mergeAutoResolve472
    BiliClient.prefs.v472mergeAutoResolve472 = !current
    AppToast.show(this, "Merge Auto Resolve472: ${if (!current) "ON" else "OFF"}")
}

// v472: Message Auto Reply472
internal fun PlayerActivity.showV472MessageAutoReply472Toggle() {
    val current = BiliClient.prefs.v472messageAutoReply472
    BiliClient.prefs.v472messageAutoReply472 = !current
    AppToast.show(this, "Message Auto Reply472: ${if (!current) "ON" else "OFF"}")
}

// v472: Method Auto Invoke472
internal fun PlayerActivity.showV472MethodAutoInvoke472Toggle() {
    val current = BiliClient.prefs.v472methodAutoInvoke472
    BiliClient.prefs.v472methodAutoInvoke472 = !current
    AppToast.show(this, "Method Auto Invoke472: ${if (!current) "ON" else "OFF"}")
}

// v472: Mic Auto Mute472
internal fun PlayerActivity.showV472MicAutoMute472Toggle() {
    val current = BiliClient.prefs.v472micAutoMute472
    BiliClient.prefs.v472micAutoMute472 = !current
    AppToast.show(this, "Mic Auto Mute472: ${if (!current) "ON" else "OFF"}")
}

// v472: Min Bitrate Auto472
internal fun PlayerActivity.showV472MinBitrateAuto472Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v472minBitrateAuto472).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto472",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v472minBitrateAuto472 = value
        AppToast.show(this, "Min Bitrate Auto472: $value")
    }
}

// v472: Mode Auto Switch472
internal fun PlayerActivity.showV472ModeAutoSwitch472Toggle() {
    val current = BiliClient.prefs.v472modeAutoSwitch472
    BiliClient.prefs.v472modeAutoSwitch472 = !current
    AppToast.show(this, "Mode Auto Switch472: ${if (!current) "ON" else "OFF"}")
}

// v472: Model Auto Load472
internal fun PlayerActivity.showV472ModelAutoLoad472Toggle() {
    val current = BiliClient.prefs.v472modelAutoLoad472
    BiliClient.prefs.v472modelAutoLoad472 = !current
    AppToast.show(this, "Model Auto Load472: ${if (!current) "ON" else "OFF"}")
}

// v473: Mark Auto Highlight473
internal fun PlayerActivity.showV473MarkAutoHighlight473Toggle() {
    val current = BiliClient.prefs.v473markAutoHighlight473
    BiliClient.prefs.v473markAutoHighlight473 = !current
    AppToast.show(this, "Mark Auto Highlight473: ${if (!current) "ON" else "OFF"}")
}

// v473: Mask Auto Apply473
internal fun PlayerActivity.showV473MaskAutoApply473Toggle() {
    val current = BiliClient.prefs.v473maskAutoApply473
    BiliClient.prefs.v473maskAutoApply473 = !current
    AppToast.show(this, "Mask Auto Apply473: ${if (!current) "ON" else "OFF"}")
}

// v473: Match Auto Start473
internal fun PlayerActivity.showV473MatchAutoStart473Toggle() {
    val current = BiliClient.prefs.v473matchAutoStart473
    BiliClient.prefs.v473matchAutoStart473 = !current
    AppToast.show(this, "Match Auto Start473: ${if (!current) "ON" else "OFF"}")
}

// v473: Matrix Transform473
internal fun PlayerActivity.showV473MatrixTransform473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473matrixTransform473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473matrixTransform473 = value
        AppToast.show(this, "Matrix Transform473: $value")
    }
}

// v473: Max Concurrent Load473
internal fun PlayerActivity.showV473MaxConcurrentLoad473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473maxConcurrentLoad473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473maxConcurrentLoad473 = value
        AppToast.show(this, "Max Concurrent Load473: $value")
    }
}

// v473: Measure Auto Calibrate473
internal fun PlayerActivity.showV473MeasureAutoCalibrate473Toggle() {
    val current = BiliClient.prefs.v473measureAutoCalibrate473
    BiliClient.prefs.v473measureAutoCalibrate473 = !current
    AppToast.show(this, "Measure Auto Calibrate473: ${if (!current) "ON" else "OFF"}")
}

// v473: Media Auto Detect473
internal fun PlayerActivity.showV473MediaAutoDetect473Toggle() {
    val current = BiliClient.prefs.v473mediaAutoDetect473
    BiliClient.prefs.v473mediaAutoDetect473 = !current
    AppToast.show(this, "Media Auto Detect473: ${if (!current) "ON" else "OFF"}")
}

// v473: Memory Optimize Auto473
internal fun PlayerActivity.showV473MemoryOptimizeAuto473Toggle() {
    val current = BiliClient.prefs.v473memoryOptimizeAuto473
    BiliClient.prefs.v473memoryOptimizeAuto473 = !current
    AppToast.show(this, "Memory Optimize Auto473: ${if (!current) "ON" else "OFF"}")
}

// v473: Merge Auto Resolve473
internal fun PlayerActivity.showV473MergeAutoResolve473Toggle() {
    val current = BiliClient.prefs.v473mergeAutoResolve473
    BiliClient.prefs.v473mergeAutoResolve473 = !current
    AppToast.show(this, "Merge Auto Resolve473: ${if (!current) "ON" else "OFF"}")
}

// v473: Message Auto Reply473
internal fun PlayerActivity.showV473MessageAutoReply473Toggle() {
    val current = BiliClient.prefs.v473messageAutoReply473
    BiliClient.prefs.v473messageAutoReply473 = !current
    AppToast.show(this, "Message Auto Reply473: ${if (!current) "ON" else "OFF"}")
}

// v473: Method Auto Invoke473
internal fun PlayerActivity.showV473MethodAutoInvoke473Toggle() {
    val current = BiliClient.prefs.v473methodAutoInvoke473
    BiliClient.prefs.v473methodAutoInvoke473 = !current
    AppToast.show(this, "Method Auto Invoke473: ${if (!current) "ON" else "OFF"}")
}

// v473: Mic Auto Mute473
internal fun PlayerActivity.showV473MicAutoMute473Toggle() {
    val current = BiliClient.prefs.v473micAutoMute473
    BiliClient.prefs.v473micAutoMute473 = !current
    AppToast.show(this, "Mic Auto Mute473: ${if (!current) "ON" else "OFF"}")
}

// v473: Min Bitrate Auto473
internal fun PlayerActivity.showV473MinBitrateAuto473Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v473minBitrateAuto473).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto473",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v473minBitrateAuto473 = value
        AppToast.show(this, "Min Bitrate Auto473: $value")
    }
}

// v473: Mode Auto Switch473
internal fun PlayerActivity.showV473ModeAutoSwitch473Toggle() {
    val current = BiliClient.prefs.v473modeAutoSwitch473
    BiliClient.prefs.v473modeAutoSwitch473 = !current
    AppToast.show(this, "Mode Auto Switch473: ${if (!current) "ON" else "OFF"}")
}

// v473: Model Auto Load473
internal fun PlayerActivity.showV473ModelAutoLoad473Toggle() {
    val current = BiliClient.prefs.v473modelAutoLoad473
    BiliClient.prefs.v473modelAutoLoad473 = !current
    AppToast.show(this, "Model Auto Load473: ${if (!current) "ON" else "OFF"}")
}

// v474: Mark Auto Highlight474
internal fun PlayerActivity.showV474MarkAutoHighlight474Toggle() {
    val current = BiliClient.prefs.v474markAutoHighlight474
    BiliClient.prefs.v474markAutoHighlight474 = !current
    AppToast.show(this, "Mark Auto Highlight474: ${if (!current) "ON" else "OFF"}")
}

// v474: Mask Auto Apply474
internal fun PlayerActivity.showV474MaskAutoApply474Toggle() {
    val current = BiliClient.prefs.v474maskAutoApply474
    BiliClient.prefs.v474maskAutoApply474 = !current
    AppToast.show(this, "Mask Auto Apply474: ${if (!current) "ON" else "OFF"}")
}

// v474: Match Auto Start474
internal fun PlayerActivity.showV474MatchAutoStart474Toggle() {
    val current = BiliClient.prefs.v474matchAutoStart474
    BiliClient.prefs.v474matchAutoStart474 = !current
    AppToast.show(this, "Match Auto Start474: ${if (!current) "ON" else "OFF"}")
}

// v474: Matrix Transform474
internal fun PlayerActivity.showV474MatrixTransform474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474matrixTransform474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474matrixTransform474 = value
        AppToast.show(this, "Matrix Transform474: $value")
    }
}

// v474: Max Concurrent Load474
internal fun PlayerActivity.showV474MaxConcurrentLoad474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474maxConcurrentLoad474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474maxConcurrentLoad474 = value
        AppToast.show(this, "Max Concurrent Load474: $value")
    }
}

// v474: Measure Auto Calibrate474
internal fun PlayerActivity.showV474MeasureAutoCalibrate474Toggle() {
    val current = BiliClient.prefs.v474measureAutoCalibrate474
    BiliClient.prefs.v474measureAutoCalibrate474 = !current
    AppToast.show(this, "Measure Auto Calibrate474: ${if (!current) "ON" else "OFF"}")
}

// v474: Media Auto Detect474
internal fun PlayerActivity.showV474MediaAutoDetect474Toggle() {
    val current = BiliClient.prefs.v474mediaAutoDetect474
    BiliClient.prefs.v474mediaAutoDetect474 = !current
    AppToast.show(this, "Media Auto Detect474: ${if (!current) "ON" else "OFF"}")
}

// v474: Memory Optimize Auto474
internal fun PlayerActivity.showV474MemoryOptimizeAuto474Toggle() {
    val current = BiliClient.prefs.v474memoryOptimizeAuto474
    BiliClient.prefs.v474memoryOptimizeAuto474 = !current
    AppToast.show(this, "Memory Optimize Auto474: ${if (!current) "ON" else "OFF"}")
}

// v474: Merge Auto Resolve474
internal fun PlayerActivity.showV474MergeAutoResolve474Toggle() {
    val current = BiliClient.prefs.v474mergeAutoResolve474
    BiliClient.prefs.v474mergeAutoResolve474 = !current
    AppToast.show(this, "Merge Auto Resolve474: ${if (!current) "ON" else "OFF"}")
}

// v474: Message Auto Reply474
internal fun PlayerActivity.showV474MessageAutoReply474Toggle() {
    val current = BiliClient.prefs.v474messageAutoReply474
    BiliClient.prefs.v474messageAutoReply474 = !current
    AppToast.show(this, "Message Auto Reply474: ${if (!current) "ON" else "OFF"}")
}

// v474: Method Auto Invoke474
internal fun PlayerActivity.showV474MethodAutoInvoke474Toggle() {
    val current = BiliClient.prefs.v474methodAutoInvoke474
    BiliClient.prefs.v474methodAutoInvoke474 = !current
    AppToast.show(this, "Method Auto Invoke474: ${if (!current) "ON" else "OFF"}")
}

// v474: Mic Auto Mute474
internal fun PlayerActivity.showV474MicAutoMute474Toggle() {
    val current = BiliClient.prefs.v474micAutoMute474
    BiliClient.prefs.v474micAutoMute474 = !current
    AppToast.show(this, "Mic Auto Mute474: ${if (!current) "ON" else "OFF"}")
}

// v474: Min Bitrate Auto474
internal fun PlayerActivity.showV474MinBitrateAuto474Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v474minBitrateAuto474).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto474",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v474minBitrateAuto474 = value
        AppToast.show(this, "Min Bitrate Auto474: $value")
    }
}

// v474: Mode Auto Switch474
internal fun PlayerActivity.showV474ModeAutoSwitch474Toggle() {
    val current = BiliClient.prefs.v474modeAutoSwitch474
    BiliClient.prefs.v474modeAutoSwitch474 = !current
    AppToast.show(this, "Mode Auto Switch474: ${if (!current) "ON" else "OFF"}")
}

// v474: Model Auto Load474
internal fun PlayerActivity.showV474ModelAutoLoad474Toggle() {
    val current = BiliClient.prefs.v474modelAutoLoad474
    BiliClient.prefs.v474modelAutoLoad474 = !current
    AppToast.show(this, "Model Auto Load474: ${if (!current) "ON" else "OFF"}")
}

// v475: Mark Auto Highlight475
internal fun PlayerActivity.showV475MarkAutoHighlight475Toggle() {
    val current = BiliClient.prefs.v475markAutoHighlight475
    BiliClient.prefs.v475markAutoHighlight475 = !current
    AppToast.show(this, "Mark Auto Highlight475: ${if (!current) "ON" else "OFF"}")
}

// v475: Mask Auto Apply475
internal fun PlayerActivity.showV475MaskAutoApply475Toggle() {
    val current = BiliClient.prefs.v475maskAutoApply475
    BiliClient.prefs.v475maskAutoApply475 = !current
    AppToast.show(this, "Mask Auto Apply475: ${if (!current) "ON" else "OFF"}")
}

// v475: Match Auto Start475
internal fun PlayerActivity.showV475MatchAutoStart475Toggle() {
    val current = BiliClient.prefs.v475matchAutoStart475
    BiliClient.prefs.v475matchAutoStart475 = !current
    AppToast.show(this, "Match Auto Start475: ${if (!current) "ON" else "OFF"}")
}

// v475: Matrix Transform475
internal fun PlayerActivity.showV475MatrixTransform475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475matrixTransform475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475matrixTransform475 = value
        AppToast.show(this, "Matrix Transform475: $value")
    }
}

// v475: Max Concurrent Load475
internal fun PlayerActivity.showV475MaxConcurrentLoad475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475maxConcurrentLoad475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475maxConcurrentLoad475 = value
        AppToast.show(this, "Max Concurrent Load475: $value")
    }
}

// v475: Measure Auto Calibrate475
internal fun PlayerActivity.showV475MeasureAutoCalibrate475Toggle() {
    val current = BiliClient.prefs.v475measureAutoCalibrate475
    BiliClient.prefs.v475measureAutoCalibrate475 = !current
    AppToast.show(this, "Measure Auto Calibrate475: ${if (!current) "ON" else "OFF"}")
}

// v475: Media Auto Detect475
internal fun PlayerActivity.showV475MediaAutoDetect475Toggle() {
    val current = BiliClient.prefs.v475mediaAutoDetect475
    BiliClient.prefs.v475mediaAutoDetect475 = !current
    AppToast.show(this, "Media Auto Detect475: ${if (!current) "ON" else "OFF"}")
}

// v475: Memory Optimize Auto475
internal fun PlayerActivity.showV475MemoryOptimizeAuto475Toggle() {
    val current = BiliClient.prefs.v475memoryOptimizeAuto475
    BiliClient.prefs.v475memoryOptimizeAuto475 = !current
    AppToast.show(this, "Memory Optimize Auto475: ${if (!current) "ON" else "OFF"}")
}

// v475: Merge Auto Resolve475
internal fun PlayerActivity.showV475MergeAutoResolve475Toggle() {
    val current = BiliClient.prefs.v475mergeAutoResolve475
    BiliClient.prefs.v475mergeAutoResolve475 = !current
    AppToast.show(this, "Merge Auto Resolve475: ${if (!current) "ON" else "OFF"}")
}

// v475: Message Auto Reply475
internal fun PlayerActivity.showV475MessageAutoReply475Toggle() {
    val current = BiliClient.prefs.v475messageAutoReply475
    BiliClient.prefs.v475messageAutoReply475 = !current
    AppToast.show(this, "Message Auto Reply475: ${if (!current) "ON" else "OFF"}")
}

// v475: Method Auto Invoke475
internal fun PlayerActivity.showV475MethodAutoInvoke475Toggle() {
    val current = BiliClient.prefs.v475methodAutoInvoke475
    BiliClient.prefs.v475methodAutoInvoke475 = !current
    AppToast.show(this, "Method Auto Invoke475: ${if (!current) "ON" else "OFF"}")
}

// v475: Mic Auto Mute475
internal fun PlayerActivity.showV475MicAutoMute475Toggle() {
    val current = BiliClient.prefs.v475micAutoMute475
    BiliClient.prefs.v475micAutoMute475 = !current
    AppToast.show(this, "Mic Auto Mute475: ${if (!current) "ON" else "OFF"}")
}

// v475: Min Bitrate Auto475
internal fun PlayerActivity.showV475MinBitrateAuto475Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v475minBitrateAuto475).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Min Bitrate Auto475",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v475minBitrateAuto475 = value
        AppToast.show(this, "Min Bitrate Auto475: $value")
    }
}

// v475: Mode Auto Switch475
internal fun PlayerActivity.showV475ModeAutoSwitch475Toggle() {
    val current = BiliClient.prefs.v475modeAutoSwitch475
    BiliClient.prefs.v475modeAutoSwitch475 = !current
    AppToast.show(this, "Mode Auto Switch475: ${if (!current) "ON" else "OFF"}")
}

// v475: Model Auto Load475
internal fun PlayerActivity.showV475ModelAutoLoad475Toggle() {
    val current = BiliClient.prefs.v475modelAutoLoad475
    BiliClient.prefs.v475modelAutoLoad475 = !current
    AppToast.show(this, "Model Auto Load475: ${if (!current) "ON" else "OFF"}")
}

// v476: Mark Auto Highlight476
internal fun PlayerActivity.showV476MarkAutoHighlight476Toggle() {
    val current = BiliClient.prefs.v476markAutoHighlight476
    BiliClient.prefs.v476markAutoHighlight476 = !current
    AppToast.show(this, "Mark Auto Highlight476: ${if (!current) "ON" else "OFF"}")
}

// v476: Mask Auto Apply476
internal fun PlayerActivity.showV476MaskAutoApply476Toggle() {
    val current = BiliClient.prefs.v476maskAutoApply476
    BiliClient.prefs.v476maskAutoApply476 = !current
    AppToast.show(this, "Mask Auto Apply476: ${if (!current) "ON" else "OFF"}")
}

// v476: Match Auto Start476
internal fun PlayerActivity.showV476MatchAutoStart476Toggle() {
    val current = BiliClient.prefs.v476matchAutoStart476
    BiliClient.prefs.v476matchAutoStart476 = !current
    AppToast.show(this, "Match Auto Start476: ${if (!current) "ON" else "OFF"}")
}

// v476: Matrix Transform476
internal fun PlayerActivity.showV476MatrixTransform476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476matrixTransform476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Matrix Transform476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476matrixTransform476 = value
        AppToast.show(this, "Matrix Transform476: $value")
    }
}

// v476: Max Concurrent Load476
internal fun PlayerActivity.showV476MaxConcurrentLoad476Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v476maxConcurrentLoad476).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Max Concurrent Load476",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v476maxConcurrentLoad476 = value
        AppToast.show(this, "Max Concurrent Load476: $value")
    }
}

// v476: Measure Auto Calibrate476
internal fun PlayerActivity.showV476MeasureAutoCalibrate476Toggle() {
    val current = BiliClient.prefs.v476measureAutoCalibrate476
    BiliClient.prefs.v476measureAutoCalibrate476 = !current
    AppToast.show(this, "Measure Auto Calibrate476: ${if (!current) "ON" else "OFF"}")
}

// v476: Media Auto Detect476
internal fun PlayerActivity.showV476MediaAutoDetect476Toggle() {
    val current = BiliClient.prefs.v476mediaAutoDetect476
    BiliClient.prefs.v476mediaAutoDetect476 = !current
    AppToast.show(this, "Media Auto Detect476: ${if (!current) "ON" else "OFF"}")
}

// v476: Memory Optimize Auto476
internal fun PlayerActivity.showV476MemoryOptimizeAuto476Toggle() {
    val current = BiliClient.prefs.v476memoryOptimizeAuto476
    BiliClient.prefs.v476memoryOptimizeAuto476 = !current
    AppToast.show(this, "Memory Optimize Auto476: ${if (!current) "ON" else "OFF"}")
}

