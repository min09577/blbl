package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast



// v1871: clicked mode
internal fun PlayerActivity.showV1871ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871clicked
    FeaturePrefsStore.batch1871.v1871clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1871: climbed mode
internal fun PlayerActivity.showV1871ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871climbed
    FeaturePrefsStore.batch1871.v1871climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1871: cloned mode
internal fun PlayerActivity.showV1871ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871cloned
    FeaturePrefsStore.batch1871.v1871cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1871: closed mode
internal fun PlayerActivity.showV1871ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871closed
    FeaturePrefsStore.batch1871.v1871closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1871: coated mode
internal fun PlayerActivity.showV1871CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871coated
    FeaturePrefsStore.batch1871.v1871coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1871: coded level
internal fun PlayerActivity.showV1871CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1871: collapsed level
internal fun PlayerActivity.showV1871CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1871: collected level
internal fun PlayerActivity.showV1871CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1871: combined level
internal fun PlayerActivity.showV1871CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1871: comforted level
internal fun PlayerActivity.showV1871ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1871comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1871comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1871: commanded mode
internal fun PlayerActivity.showV1871CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871commanded
    FeaturePrefsStore.batch1871.v1871commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1871: commented mode
internal fun PlayerActivity.showV1871CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871commented
    FeaturePrefsStore.batch1871.v1871commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1871: committed mode
internal fun PlayerActivity.showV1871CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871committed
    FeaturePrefsStore.batch1871.v1871committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1871: communicated mode
internal fun PlayerActivity.showV1871CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871communicated
    FeaturePrefsStore.batch1871.v1871communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1871: compared mode
internal fun PlayerActivity.showV1871ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1871compared
    FeaturePrefsStore.batch1871.v1871compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1872: clicked mode
internal fun PlayerActivity.showV1872ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872clicked
    FeaturePrefsStore.batch1871.v1872clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1872: climbed mode
internal fun PlayerActivity.showV1872ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872climbed
    FeaturePrefsStore.batch1871.v1872climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1872: cloned mode
internal fun PlayerActivity.showV1872ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872cloned
    FeaturePrefsStore.batch1871.v1872cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1872: closed mode
internal fun PlayerActivity.showV1872ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872closed
    FeaturePrefsStore.batch1871.v1872closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1872: coated mode
internal fun PlayerActivity.showV1872CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872coated
    FeaturePrefsStore.batch1871.v1872coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1872: coded level
internal fun PlayerActivity.showV1872CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1872: collapsed level
internal fun PlayerActivity.showV1872CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1872: collected level
internal fun PlayerActivity.showV1872CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1872: combined level
internal fun PlayerActivity.showV1872CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1872: comforted level
internal fun PlayerActivity.showV1872ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1872comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1872comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1872: commanded mode
internal fun PlayerActivity.showV1872CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872commanded
    FeaturePrefsStore.batch1871.v1872commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1872: commented mode
internal fun PlayerActivity.showV1872CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872commented
    FeaturePrefsStore.batch1871.v1872commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1872: committed mode
internal fun PlayerActivity.showV1872CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872committed
    FeaturePrefsStore.batch1871.v1872committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1872: communicated mode
internal fun PlayerActivity.showV1872CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872communicated
    FeaturePrefsStore.batch1871.v1872communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1872: compared mode
internal fun PlayerActivity.showV1872ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1872compared
    FeaturePrefsStore.batch1871.v1872compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1873: clicked mode
internal fun PlayerActivity.showV1873ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873clicked
    FeaturePrefsStore.batch1871.v1873clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1873: climbed mode
internal fun PlayerActivity.showV1873ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873climbed
    FeaturePrefsStore.batch1871.v1873climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1873: cloned mode
internal fun PlayerActivity.showV1873ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873cloned
    FeaturePrefsStore.batch1871.v1873cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1873: closed mode
internal fun PlayerActivity.showV1873ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873closed
    FeaturePrefsStore.batch1871.v1873closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1873: coated mode
internal fun PlayerActivity.showV1873CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873coated
    FeaturePrefsStore.batch1871.v1873coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1873: coded level
internal fun PlayerActivity.showV1873CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1873: collapsed level
internal fun PlayerActivity.showV1873CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1873: collected level
internal fun PlayerActivity.showV1873CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1873: combined level
internal fun PlayerActivity.showV1873CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1873: comforted level
internal fun PlayerActivity.showV1873ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1873comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1873comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1873: commanded mode
internal fun PlayerActivity.showV1873CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873commanded
    FeaturePrefsStore.batch1871.v1873commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1873: commented mode
internal fun PlayerActivity.showV1873CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873commented
    FeaturePrefsStore.batch1871.v1873commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1873: committed mode
internal fun PlayerActivity.showV1873CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873committed
    FeaturePrefsStore.batch1871.v1873committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1873: communicated mode
internal fun PlayerActivity.showV1873CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873communicated
    FeaturePrefsStore.batch1871.v1873communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1873: compared mode
internal fun PlayerActivity.showV1873ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1873compared
    FeaturePrefsStore.batch1871.v1873compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1874: clicked mode
internal fun PlayerActivity.showV1874ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874clicked
    FeaturePrefsStore.batch1871.v1874clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1874: climbed mode
internal fun PlayerActivity.showV1874ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874climbed
    FeaturePrefsStore.batch1871.v1874climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1874: cloned mode
internal fun PlayerActivity.showV1874ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874cloned
    FeaturePrefsStore.batch1871.v1874cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1874: closed mode
internal fun PlayerActivity.showV1874ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874closed
    FeaturePrefsStore.batch1871.v1874closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1874: coated mode
internal fun PlayerActivity.showV1874CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874coated
    FeaturePrefsStore.batch1871.v1874coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1874: coded level
internal fun PlayerActivity.showV1874CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1874: collapsed level
internal fun PlayerActivity.showV1874CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1874: collected level
internal fun PlayerActivity.showV1874CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1874: combined level
internal fun PlayerActivity.showV1874CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1874: comforted level
internal fun PlayerActivity.showV1874ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1874comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1874comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1874: commanded mode
internal fun PlayerActivity.showV1874CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874commanded
    FeaturePrefsStore.batch1871.v1874commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1874: commented mode
internal fun PlayerActivity.showV1874CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874commented
    FeaturePrefsStore.batch1871.v1874commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1874: committed mode
internal fun PlayerActivity.showV1874CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874committed
    FeaturePrefsStore.batch1871.v1874committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1874: communicated mode
internal fun PlayerActivity.showV1874CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874communicated
    FeaturePrefsStore.batch1871.v1874communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1874: compared mode
internal fun PlayerActivity.showV1874ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1874compared
    FeaturePrefsStore.batch1871.v1874compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1875: clicked mode
internal fun PlayerActivity.showV1875ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875clicked
    FeaturePrefsStore.batch1871.v1875clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1875: climbed mode
internal fun PlayerActivity.showV1875ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875climbed
    FeaturePrefsStore.batch1871.v1875climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1875: cloned mode
internal fun PlayerActivity.showV1875ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875cloned
    FeaturePrefsStore.batch1871.v1875cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1875: closed mode
internal fun PlayerActivity.showV1875ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875closed
    FeaturePrefsStore.batch1871.v1875closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1875: coated mode
internal fun PlayerActivity.showV1875CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875coated
    FeaturePrefsStore.batch1871.v1875coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1875: coded level
internal fun PlayerActivity.showV1875CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1875: collapsed level
internal fun PlayerActivity.showV1875CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1875: collected level
internal fun PlayerActivity.showV1875CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1875: combined level
internal fun PlayerActivity.showV1875CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1875: comforted level
internal fun PlayerActivity.showV1875ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1875comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1875comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1875: commanded mode
internal fun PlayerActivity.showV1875CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875commanded
    FeaturePrefsStore.batch1871.v1875commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1875: commented mode
internal fun PlayerActivity.showV1875CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875commented
    FeaturePrefsStore.batch1871.v1875commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1875: committed mode
internal fun PlayerActivity.showV1875CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875committed
    FeaturePrefsStore.batch1871.v1875committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1875: communicated mode
internal fun PlayerActivity.showV1875CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875communicated
    FeaturePrefsStore.batch1871.v1875communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1875: compared mode
internal fun PlayerActivity.showV1875ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1875compared
    FeaturePrefsStore.batch1871.v1875compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1876: clicked mode
internal fun PlayerActivity.showV1876ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876clicked
    FeaturePrefsStore.batch1871.v1876clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1876: climbed mode
internal fun PlayerActivity.showV1876ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876climbed
    FeaturePrefsStore.batch1871.v1876climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1876: cloned mode
internal fun PlayerActivity.showV1876ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876cloned
    FeaturePrefsStore.batch1871.v1876cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1876: closed mode
internal fun PlayerActivity.showV1876ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876closed
    FeaturePrefsStore.batch1871.v1876closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1876: coated mode
internal fun PlayerActivity.showV1876CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876coated
    FeaturePrefsStore.batch1871.v1876coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1876: coded level
internal fun PlayerActivity.showV1876CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1876: collapsed level
internal fun PlayerActivity.showV1876CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1876: collected level
internal fun PlayerActivity.showV1876CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1876: combined level
internal fun PlayerActivity.showV1876CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1876: comforted level
internal fun PlayerActivity.showV1876ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1876comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1876comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1876: commanded mode
internal fun PlayerActivity.showV1876CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876commanded
    FeaturePrefsStore.batch1871.v1876commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1876: commented mode
internal fun PlayerActivity.showV1876CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876commented
    FeaturePrefsStore.batch1871.v1876commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1876: committed mode
internal fun PlayerActivity.showV1876CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876committed
    FeaturePrefsStore.batch1871.v1876committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1876: communicated mode
internal fun PlayerActivity.showV1876CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876communicated
    FeaturePrefsStore.batch1871.v1876communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1876: compared mode
internal fun PlayerActivity.showV1876ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1876compared
    FeaturePrefsStore.batch1871.v1876compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1877: clicked mode
internal fun PlayerActivity.showV1877ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877clicked
    FeaturePrefsStore.batch1871.v1877clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1877: climbed mode
internal fun PlayerActivity.showV1877ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877climbed
    FeaturePrefsStore.batch1871.v1877climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1877: cloned mode
internal fun PlayerActivity.showV1877ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877cloned
    FeaturePrefsStore.batch1871.v1877cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1877: closed mode
internal fun PlayerActivity.showV1877ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877closed
    FeaturePrefsStore.batch1871.v1877closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1877: coated mode
internal fun PlayerActivity.showV1877CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877coated
    FeaturePrefsStore.batch1871.v1877coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1877: coded level
internal fun PlayerActivity.showV1877CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1877: collapsed level
internal fun PlayerActivity.showV1877CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1877: collected level
internal fun PlayerActivity.showV1877CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1877: combined level
internal fun PlayerActivity.showV1877CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1877: comforted level
internal fun PlayerActivity.showV1877ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1877comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1877comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1877: commanded mode
internal fun PlayerActivity.showV1877CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877commanded
    FeaturePrefsStore.batch1871.v1877commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1877: commented mode
internal fun PlayerActivity.showV1877CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877commented
    FeaturePrefsStore.batch1871.v1877commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1877: committed mode
internal fun PlayerActivity.showV1877CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877committed
    FeaturePrefsStore.batch1871.v1877committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1877: communicated mode
internal fun PlayerActivity.showV1877CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877communicated
    FeaturePrefsStore.batch1871.v1877communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1877: compared mode
internal fun PlayerActivity.showV1877ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1877compared
    FeaturePrefsStore.batch1871.v1877compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1878: clicked mode
internal fun PlayerActivity.showV1878ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878clicked
    FeaturePrefsStore.batch1871.v1878clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1878: climbed mode
internal fun PlayerActivity.showV1878ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878climbed
    FeaturePrefsStore.batch1871.v1878climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1878: cloned mode
internal fun PlayerActivity.showV1878ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878cloned
    FeaturePrefsStore.batch1871.v1878cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1878: closed mode
internal fun PlayerActivity.showV1878ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878closed
    FeaturePrefsStore.batch1871.v1878closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1878: coated mode
internal fun PlayerActivity.showV1878CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878coated
    FeaturePrefsStore.batch1871.v1878coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1878: coded level
internal fun PlayerActivity.showV1878CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1878: collapsed level
internal fun PlayerActivity.showV1878CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1878: collected level
internal fun PlayerActivity.showV1878CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1878: combined level
internal fun PlayerActivity.showV1878CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1878: comforted level
internal fun PlayerActivity.showV1878ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1878comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1878comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1878: commanded mode
internal fun PlayerActivity.showV1878CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878commanded
    FeaturePrefsStore.batch1871.v1878commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1878: commented mode
internal fun PlayerActivity.showV1878CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878commented
    FeaturePrefsStore.batch1871.v1878commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1878: committed mode
internal fun PlayerActivity.showV1878CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878committed
    FeaturePrefsStore.batch1871.v1878committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1878: communicated mode
internal fun PlayerActivity.showV1878CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878communicated
    FeaturePrefsStore.batch1871.v1878communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1878: compared mode
internal fun PlayerActivity.showV1878ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1878compared
    FeaturePrefsStore.batch1871.v1878compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1879: clicked mode
internal fun PlayerActivity.showV1879ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879clicked
    FeaturePrefsStore.batch1871.v1879clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1879: climbed mode
internal fun PlayerActivity.showV1879ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879climbed
    FeaturePrefsStore.batch1871.v1879climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1879: cloned mode
internal fun PlayerActivity.showV1879ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879cloned
    FeaturePrefsStore.batch1871.v1879cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1879: closed mode
internal fun PlayerActivity.showV1879ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879closed
    FeaturePrefsStore.batch1871.v1879closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1879: coated mode
internal fun PlayerActivity.showV1879CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879coated
    FeaturePrefsStore.batch1871.v1879coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1879: coded level
internal fun PlayerActivity.showV1879CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1879: collapsed level
internal fun PlayerActivity.showV1879CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1879: collected level
internal fun PlayerActivity.showV1879CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1879: combined level
internal fun PlayerActivity.showV1879CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1879: comforted level
internal fun PlayerActivity.showV1879ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1879comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1879comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1879: commanded mode
internal fun PlayerActivity.showV1879CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879commanded
    FeaturePrefsStore.batch1871.v1879commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1879: commented mode
internal fun PlayerActivity.showV1879CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879commented
    FeaturePrefsStore.batch1871.v1879commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1879: committed mode
internal fun PlayerActivity.showV1879CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879committed
    FeaturePrefsStore.batch1871.v1879committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1879: communicated mode
internal fun PlayerActivity.showV1879CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879communicated
    FeaturePrefsStore.batch1871.v1879communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1879: compared mode
internal fun PlayerActivity.showV1879ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1879compared
    FeaturePrefsStore.batch1871.v1879compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

// v1880: clicked mode
internal fun PlayerActivity.showV1880ClickedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880clicked
    FeaturePrefsStore.batch1871.v1880clicked = !current
    AppToast.show(this, "clicked: ${if (!current) "ON" else "OFF"}")
}

// v1880: climbed mode
internal fun PlayerActivity.showV1880ClimbedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880climbed
    FeaturePrefsStore.batch1871.v1880climbed = !current
    AppToast.show(this, "climbed: ${if (!current) "ON" else "OFF"}")
}

// v1880: cloned mode
internal fun PlayerActivity.showV1880ClonedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880cloned
    FeaturePrefsStore.batch1871.v1880cloned = !current
    AppToast.show(this, "cloned: ${if (!current) "ON" else "OFF"}")
}

// v1880: closed mode
internal fun PlayerActivity.showV1880ClosedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880closed
    FeaturePrefsStore.batch1871.v1880closed = !current
    AppToast.show(this, "closed: ${if (!current) "ON" else "OFF"}")
}

// v1880: coated mode
internal fun PlayerActivity.showV1880CoatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880coated
    FeaturePrefsStore.batch1871.v1880coated = !current
    AppToast.show(this, "coated: ${if (!current) "ON" else "OFF"}")
}

// v1880: coded level
internal fun PlayerActivity.showV1880CodedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880coded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "coded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880coded = value
        AppToast.show(this, "coded: $value")
    }
}

// v1880: collapsed level
internal fun PlayerActivity.showV1880CollapsedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880collapsed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collapsed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880collapsed = value
        AppToast.show(this, "collapsed: $value")
    }
}

// v1880: collected level
internal fun PlayerActivity.showV1880CollectedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880collected).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "collected level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880collected = value
        AppToast.show(this, "collected: $value")
    }
}

// v1880: combined level
internal fun PlayerActivity.showV1880CombinedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880combined).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "combined level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880combined = value
        AppToast.show(this, "combined: $value")
    }
}

// v1880: comforted level
internal fun PlayerActivity.showV1880ComfortedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1871.v1880comforted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "comforted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1871.v1880comforted = value
        AppToast.show(this, "comforted: $value")
    }
}

// v1880: commanded mode
internal fun PlayerActivity.showV1880CommandedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880commanded
    FeaturePrefsStore.batch1871.v1880commanded = !current
    AppToast.show(this, "commanded: ${if (!current) "ON" else "OFF"}")
}

// v1880: commented mode
internal fun PlayerActivity.showV1880CommentedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880commented
    FeaturePrefsStore.batch1871.v1880commented = !current
    AppToast.show(this, "commented: ${if (!current) "ON" else "OFF"}")
}

// v1880: committed mode
internal fun PlayerActivity.showV1880CommittedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880committed
    FeaturePrefsStore.batch1871.v1880committed = !current
    AppToast.show(this, "committed: ${if (!current) "ON" else "OFF"}")
}

// v1880: communicated mode
internal fun PlayerActivity.showV1880CommunicatedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880communicated
    FeaturePrefsStore.batch1871.v1880communicated = !current
    AppToast.show(this, "communicated: ${if (!current) "ON" else "OFF"}")
}

// v1880: compared mode
internal fun PlayerActivity.showV1880ComparedToggle() {
    val current = FeaturePrefsStore.batch1871.v1880compared
    FeaturePrefsStore.batch1871.v1880compared = !current
    AppToast.show(this, "compared: ${if (!current) "ON" else "OFF"}")
}

