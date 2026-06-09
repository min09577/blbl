package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1621: odor mode
internal fun PlayerActivity.showV1621OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1621odor
    FeaturePrefsStore.batch1621.v1621odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1621: off mode
internal fun PlayerActivity.showV1621OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1621off
    FeaturePrefsStore.batch1621.v1621off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1621: offer mode
internal fun PlayerActivity.showV1621OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1621offer
    FeaturePrefsStore.batch1621.v1621offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1621: office mode
internal fun PlayerActivity.showV1621OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1621office
    FeaturePrefsStore.batch1621.v1621office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1621: often mode
internal fun PlayerActivity.showV1621OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1621often
    FeaturePrefsStore.batch1621.v1621often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1621: oil level
internal fun PlayerActivity.showV1621OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1621: okay level
internal fun PlayerActivity.showV1621OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1621: olive level
internal fun PlayerActivity.showV1621OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1621: omit level
internal fun PlayerActivity.showV1621OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1621: once level
internal fun PlayerActivity.showV1621OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1621once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1621once = value
        AppToast.show(this, "once: $value")
    }
}

// v1621: one mode
internal fun PlayerActivity.showV1621OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1621one
    FeaturePrefsStore.batch1621.v1621one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1621: onion mode
internal fun PlayerActivity.showV1621OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1621onion
    FeaturePrefsStore.batch1621.v1621onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1621: online mode
internal fun PlayerActivity.showV1621OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1621online
    FeaturePrefsStore.batch1621.v1621online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1621: only mode
internal fun PlayerActivity.showV1621OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1621only
    FeaturePrefsStore.batch1621.v1621only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1621: onto mode
internal fun PlayerActivity.showV1621OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1621onto
    FeaturePrefsStore.batch1621.v1621onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1622: odor mode
internal fun PlayerActivity.showV1622OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1622odor
    FeaturePrefsStore.batch1621.v1622odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1622: off mode
internal fun PlayerActivity.showV1622OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1622off
    FeaturePrefsStore.batch1621.v1622off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1622: offer mode
internal fun PlayerActivity.showV1622OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1622offer
    FeaturePrefsStore.batch1621.v1622offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1622: office mode
internal fun PlayerActivity.showV1622OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1622office
    FeaturePrefsStore.batch1621.v1622office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1622: often mode
internal fun PlayerActivity.showV1622OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1622often
    FeaturePrefsStore.batch1621.v1622often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1622: oil level
internal fun PlayerActivity.showV1622OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1622: okay level
internal fun PlayerActivity.showV1622OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1622: olive level
internal fun PlayerActivity.showV1622OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1622: omit level
internal fun PlayerActivity.showV1622OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1622: once level
internal fun PlayerActivity.showV1622OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1622once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1622once = value
        AppToast.show(this, "once: $value")
    }
}

// v1622: one mode
internal fun PlayerActivity.showV1622OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1622one
    FeaturePrefsStore.batch1621.v1622one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1622: onion mode
internal fun PlayerActivity.showV1622OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1622onion
    FeaturePrefsStore.batch1621.v1622onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1622: online mode
internal fun PlayerActivity.showV1622OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1622online
    FeaturePrefsStore.batch1621.v1622online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1622: only mode
internal fun PlayerActivity.showV1622OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1622only
    FeaturePrefsStore.batch1621.v1622only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1622: onto mode
internal fun PlayerActivity.showV1622OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1622onto
    FeaturePrefsStore.batch1621.v1622onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1623: odor mode
internal fun PlayerActivity.showV1623OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1623odor
    FeaturePrefsStore.batch1621.v1623odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1623: off mode
internal fun PlayerActivity.showV1623OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1623off
    FeaturePrefsStore.batch1621.v1623off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1623: offer mode
internal fun PlayerActivity.showV1623OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1623offer
    FeaturePrefsStore.batch1621.v1623offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1623: office mode
internal fun PlayerActivity.showV1623OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1623office
    FeaturePrefsStore.batch1621.v1623office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1623: often mode
internal fun PlayerActivity.showV1623OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1623often
    FeaturePrefsStore.batch1621.v1623often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1623: oil level
internal fun PlayerActivity.showV1623OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1623: okay level
internal fun PlayerActivity.showV1623OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1623: olive level
internal fun PlayerActivity.showV1623OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1623: omit level
internal fun PlayerActivity.showV1623OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1623: once level
internal fun PlayerActivity.showV1623OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1623once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1623once = value
        AppToast.show(this, "once: $value")
    }
}

// v1623: one mode
internal fun PlayerActivity.showV1623OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1623one
    FeaturePrefsStore.batch1621.v1623one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1623: onion mode
internal fun PlayerActivity.showV1623OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1623onion
    FeaturePrefsStore.batch1621.v1623onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1623: online mode
internal fun PlayerActivity.showV1623OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1623online
    FeaturePrefsStore.batch1621.v1623online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1623: only mode
internal fun PlayerActivity.showV1623OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1623only
    FeaturePrefsStore.batch1621.v1623only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1623: onto mode
internal fun PlayerActivity.showV1623OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1623onto
    FeaturePrefsStore.batch1621.v1623onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1624: odor mode
internal fun PlayerActivity.showV1624OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1624odor
    FeaturePrefsStore.batch1621.v1624odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1624: off mode
internal fun PlayerActivity.showV1624OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1624off
    FeaturePrefsStore.batch1621.v1624off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1624: offer mode
internal fun PlayerActivity.showV1624OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1624offer
    FeaturePrefsStore.batch1621.v1624offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1624: office mode
internal fun PlayerActivity.showV1624OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1624office
    FeaturePrefsStore.batch1621.v1624office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1624: often mode
internal fun PlayerActivity.showV1624OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1624often
    FeaturePrefsStore.batch1621.v1624often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1624: oil level
internal fun PlayerActivity.showV1624OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1624: okay level
internal fun PlayerActivity.showV1624OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1624: olive level
internal fun PlayerActivity.showV1624OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1624: omit level
internal fun PlayerActivity.showV1624OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1624: once level
internal fun PlayerActivity.showV1624OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1624once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1624once = value
        AppToast.show(this, "once: $value")
    }
}

// v1624: one mode
internal fun PlayerActivity.showV1624OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1624one
    FeaturePrefsStore.batch1621.v1624one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1624: onion mode
internal fun PlayerActivity.showV1624OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1624onion
    FeaturePrefsStore.batch1621.v1624onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1624: online mode
internal fun PlayerActivity.showV1624OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1624online
    FeaturePrefsStore.batch1621.v1624online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1624: only mode
internal fun PlayerActivity.showV1624OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1624only
    FeaturePrefsStore.batch1621.v1624only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1624: onto mode
internal fun PlayerActivity.showV1624OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1624onto
    FeaturePrefsStore.batch1621.v1624onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1625: odor mode
internal fun PlayerActivity.showV1625OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1625odor
    FeaturePrefsStore.batch1621.v1625odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1625: off mode
internal fun PlayerActivity.showV1625OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1625off
    FeaturePrefsStore.batch1621.v1625off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1625: offer mode
internal fun PlayerActivity.showV1625OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1625offer
    FeaturePrefsStore.batch1621.v1625offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1625: office mode
internal fun PlayerActivity.showV1625OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1625office
    FeaturePrefsStore.batch1621.v1625office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1625: often mode
internal fun PlayerActivity.showV1625OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1625often
    FeaturePrefsStore.batch1621.v1625often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1625: oil level
internal fun PlayerActivity.showV1625OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1625: okay level
internal fun PlayerActivity.showV1625OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1625: olive level
internal fun PlayerActivity.showV1625OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1625: omit level
internal fun PlayerActivity.showV1625OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1625: once level
internal fun PlayerActivity.showV1625OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1625once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1625once = value
        AppToast.show(this, "once: $value")
    }
}

// v1625: one mode
internal fun PlayerActivity.showV1625OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1625one
    FeaturePrefsStore.batch1621.v1625one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1625: onion mode
internal fun PlayerActivity.showV1625OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1625onion
    FeaturePrefsStore.batch1621.v1625onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1625: online mode
internal fun PlayerActivity.showV1625OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1625online
    FeaturePrefsStore.batch1621.v1625online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1625: only mode
internal fun PlayerActivity.showV1625OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1625only
    FeaturePrefsStore.batch1621.v1625only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1625: onto mode
internal fun PlayerActivity.showV1625OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1625onto
    FeaturePrefsStore.batch1621.v1625onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1626: odor mode
internal fun PlayerActivity.showV1626OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1626odor
    FeaturePrefsStore.batch1621.v1626odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1626: off mode
internal fun PlayerActivity.showV1626OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1626off
    FeaturePrefsStore.batch1621.v1626off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1626: offer mode
internal fun PlayerActivity.showV1626OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1626offer
    FeaturePrefsStore.batch1621.v1626offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1626: office mode
internal fun PlayerActivity.showV1626OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1626office
    FeaturePrefsStore.batch1621.v1626office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1626: often mode
internal fun PlayerActivity.showV1626OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1626often
    FeaturePrefsStore.batch1621.v1626often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1626: oil level
internal fun PlayerActivity.showV1626OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1626: okay level
internal fun PlayerActivity.showV1626OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1626: olive level
internal fun PlayerActivity.showV1626OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1626: omit level
internal fun PlayerActivity.showV1626OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1626: once level
internal fun PlayerActivity.showV1626OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1626once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1626once = value
        AppToast.show(this, "once: $value")
    }
}

// v1626: one mode
internal fun PlayerActivity.showV1626OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1626one
    FeaturePrefsStore.batch1621.v1626one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1626: onion mode
internal fun PlayerActivity.showV1626OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1626onion
    FeaturePrefsStore.batch1621.v1626onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1626: online mode
internal fun PlayerActivity.showV1626OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1626online
    FeaturePrefsStore.batch1621.v1626online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1626: only mode
internal fun PlayerActivity.showV1626OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1626only
    FeaturePrefsStore.batch1621.v1626only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1626: onto mode
internal fun PlayerActivity.showV1626OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1626onto
    FeaturePrefsStore.batch1621.v1626onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1627: odor mode
internal fun PlayerActivity.showV1627OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1627odor
    FeaturePrefsStore.batch1621.v1627odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1627: off mode
internal fun PlayerActivity.showV1627OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1627off
    FeaturePrefsStore.batch1621.v1627off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1627: offer mode
internal fun PlayerActivity.showV1627OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1627offer
    FeaturePrefsStore.batch1621.v1627offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1627: office mode
internal fun PlayerActivity.showV1627OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1627office
    FeaturePrefsStore.batch1621.v1627office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1627: often mode
internal fun PlayerActivity.showV1627OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1627often
    FeaturePrefsStore.batch1621.v1627often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1627: oil level
internal fun PlayerActivity.showV1627OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1627: okay level
internal fun PlayerActivity.showV1627OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1627: olive level
internal fun PlayerActivity.showV1627OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1627: omit level
internal fun PlayerActivity.showV1627OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1627: once level
internal fun PlayerActivity.showV1627OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1627once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1627once = value
        AppToast.show(this, "once: $value")
    }
}

// v1627: one mode
internal fun PlayerActivity.showV1627OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1627one
    FeaturePrefsStore.batch1621.v1627one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1627: onion mode
internal fun PlayerActivity.showV1627OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1627onion
    FeaturePrefsStore.batch1621.v1627onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1627: online mode
internal fun PlayerActivity.showV1627OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1627online
    FeaturePrefsStore.batch1621.v1627online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1627: only mode
internal fun PlayerActivity.showV1627OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1627only
    FeaturePrefsStore.batch1621.v1627only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1627: onto mode
internal fun PlayerActivity.showV1627OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1627onto
    FeaturePrefsStore.batch1621.v1627onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1628: odor mode
internal fun PlayerActivity.showV1628OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1628odor
    FeaturePrefsStore.batch1621.v1628odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1628: off mode
internal fun PlayerActivity.showV1628OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1628off
    FeaturePrefsStore.batch1621.v1628off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1628: offer mode
internal fun PlayerActivity.showV1628OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1628offer
    FeaturePrefsStore.batch1621.v1628offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1628: office mode
internal fun PlayerActivity.showV1628OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1628office
    FeaturePrefsStore.batch1621.v1628office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1628: often mode
internal fun PlayerActivity.showV1628OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1628often
    FeaturePrefsStore.batch1621.v1628often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1628: oil level
internal fun PlayerActivity.showV1628OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1628: okay level
internal fun PlayerActivity.showV1628OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1628: olive level
internal fun PlayerActivity.showV1628OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1628: omit level
internal fun PlayerActivity.showV1628OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1628: once level
internal fun PlayerActivity.showV1628OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1628once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1628once = value
        AppToast.show(this, "once: $value")
    }
}

// v1628: one mode
internal fun PlayerActivity.showV1628OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1628one
    FeaturePrefsStore.batch1621.v1628one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1628: onion mode
internal fun PlayerActivity.showV1628OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1628onion
    FeaturePrefsStore.batch1621.v1628onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1628: online mode
internal fun PlayerActivity.showV1628OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1628online
    FeaturePrefsStore.batch1621.v1628online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1628: only mode
internal fun PlayerActivity.showV1628OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1628only
    FeaturePrefsStore.batch1621.v1628only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1628: onto mode
internal fun PlayerActivity.showV1628OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1628onto
    FeaturePrefsStore.batch1621.v1628onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1629: odor mode
internal fun PlayerActivity.showV1629OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1629odor
    FeaturePrefsStore.batch1621.v1629odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1629: off mode
internal fun PlayerActivity.showV1629OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1629off
    FeaturePrefsStore.batch1621.v1629off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1629: offer mode
internal fun PlayerActivity.showV1629OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1629offer
    FeaturePrefsStore.batch1621.v1629offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1629: office mode
internal fun PlayerActivity.showV1629OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1629office
    FeaturePrefsStore.batch1621.v1629office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1629: often mode
internal fun PlayerActivity.showV1629OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1629often
    FeaturePrefsStore.batch1621.v1629often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1629: oil level
internal fun PlayerActivity.showV1629OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1629: okay level
internal fun PlayerActivity.showV1629OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1629: olive level
internal fun PlayerActivity.showV1629OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1629: omit level
internal fun PlayerActivity.showV1629OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1629: once level
internal fun PlayerActivity.showV1629OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1629once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1629once = value
        AppToast.show(this, "once: $value")
    }
}

// v1629: one mode
internal fun PlayerActivity.showV1629OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1629one
    FeaturePrefsStore.batch1621.v1629one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1629: onion mode
internal fun PlayerActivity.showV1629OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1629onion
    FeaturePrefsStore.batch1621.v1629onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1629: online mode
internal fun PlayerActivity.showV1629OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1629online
    FeaturePrefsStore.batch1621.v1629online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1629: only mode
internal fun PlayerActivity.showV1629OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1629only
    FeaturePrefsStore.batch1621.v1629only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1629: onto mode
internal fun PlayerActivity.showV1629OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1629onto
    FeaturePrefsStore.batch1621.v1629onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

// v1630: odor mode
internal fun PlayerActivity.showV1630OdorToggle() {
    val current = FeaturePrefsStore.batch1621.v1630odor
    FeaturePrefsStore.batch1621.v1630odor = !current
    AppToast.show(this, "odor: ${if (!current) "ON" else "OFF"}")
}

// v1630: off mode
internal fun PlayerActivity.showV1630OffToggle() {
    val current = FeaturePrefsStore.batch1621.v1630off
    FeaturePrefsStore.batch1621.v1630off = !current
    AppToast.show(this, "off: ${if (!current) "ON" else "OFF"}")
}

// v1630: offer mode
internal fun PlayerActivity.showV1630OfferToggle() {
    val current = FeaturePrefsStore.batch1621.v1630offer
    FeaturePrefsStore.batch1621.v1630offer = !current
    AppToast.show(this, "offer: ${if (!current) "ON" else "OFF"}")
}

// v1630: office mode
internal fun PlayerActivity.showV1630OfficeToggle() {
    val current = FeaturePrefsStore.batch1621.v1630office
    FeaturePrefsStore.batch1621.v1630office = !current
    AppToast.show(this, "office: ${if (!current) "ON" else "OFF"}")
}

// v1630: often mode
internal fun PlayerActivity.showV1630OftenToggle() {
    val current = FeaturePrefsStore.batch1621.v1630often
    FeaturePrefsStore.batch1621.v1630often = !current
    AppToast.show(this, "often: ${if (!current) "ON" else "OFF"}")
}

// v1630: oil level
internal fun PlayerActivity.showV1630OilDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630oil).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oil level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630oil = value
        AppToast.show(this, "oil: $value")
    }
}

// v1630: okay level
internal fun PlayerActivity.showV1630OkayDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630okay).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "okay level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630okay = value
        AppToast.show(this, "okay: $value")
    }
}

// v1630: olive level
internal fun PlayerActivity.showV1630OliveDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630olive).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "olive level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630olive = value
        AppToast.show(this, "olive: $value")
    }
}

// v1630: omit level
internal fun PlayerActivity.showV1630OmitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630omit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "omit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630omit = value
        AppToast.show(this, "omit: $value")
    }
}

// v1630: once level
internal fun PlayerActivity.showV1630OnceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1621.v1630once).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "once level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1621.v1630once = value
        AppToast.show(this, "once: $value")
    }
}

// v1630: one mode
internal fun PlayerActivity.showV1630OneToggle() {
    val current = FeaturePrefsStore.batch1621.v1630one
    FeaturePrefsStore.batch1621.v1630one = !current
    AppToast.show(this, "one: ${if (!current) "ON" else "OFF"}")
}

// v1630: onion mode
internal fun PlayerActivity.showV1630OnionToggle() {
    val current = FeaturePrefsStore.batch1621.v1630onion
    FeaturePrefsStore.batch1621.v1630onion = !current
    AppToast.show(this, "onion: ${if (!current) "ON" else "OFF"}")
}

// v1630: online mode
internal fun PlayerActivity.showV1630OnlineToggle() {
    val current = FeaturePrefsStore.batch1621.v1630online
    FeaturePrefsStore.batch1621.v1630online = !current
    AppToast.show(this, "online: ${if (!current) "ON" else "OFF"}")
}

// v1630: only mode
internal fun PlayerActivity.showV1630OnlyToggle() {
    val current = FeaturePrefsStore.batch1621.v1630only
    FeaturePrefsStore.batch1621.v1630only = !current
    AppToast.show(this, "only: ${if (!current) "ON" else "OFF"}")
}

// v1630: onto mode
internal fun PlayerActivity.showV1630OntoToggle() {
    val current = FeaturePrefsStore.batch1621.v1630onto
    FeaturePrefsStore.batch1621.v1630onto = !current
    AppToast.show(this, "onto: ${if (!current) "ON" else "OFF"}")
}

