package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1691: price mode
internal fun PlayerActivity.showV1691PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1691price
    FeaturePrefsStore.batch1691.v1691price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1691: pride mode
internal fun PlayerActivity.showV1691PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pride
    FeaturePrefsStore.batch1691.v1691pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1691: prison mode
internal fun PlayerActivity.showV1691PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1691prison
    FeaturePrefsStore.batch1691.v1691prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1691: private mode
internal fun PlayerActivity.showV1691PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1691private
    FeaturePrefsStore.batch1691.v1691private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1691: prize mode
internal fun PlayerActivity.showV1691PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1691prize
    FeaturePrefsStore.batch1691.v1691prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1691: problem level
internal fun PlayerActivity.showV1691ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1691: profit level
internal fun PlayerActivity.showV1691ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1691: promote level
internal fun PlayerActivity.showV1691PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1691: proof level
internal fun PlayerActivity.showV1691ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1691: prosper level
internal fun PlayerActivity.showV1691ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1691prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1691prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1691: proud mode
internal fun PlayerActivity.showV1691ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1691proud
    FeaturePrefsStore.batch1691.v1691proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1691: public mode
internal fun PlayerActivity.showV1691PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1691public
    FeaturePrefsStore.batch1691.v1691public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1691: pudding mode
internal fun PlayerActivity.showV1691PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pudding
    FeaturePrefsStore.batch1691.v1691pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1691: pulp mode
internal fun PlayerActivity.showV1691PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pulp
    FeaturePrefsStore.batch1691.v1691pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1691: pulse mode
internal fun PlayerActivity.showV1691PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1691pulse
    FeaturePrefsStore.batch1691.v1691pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1692: price mode
internal fun PlayerActivity.showV1692PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1692price
    FeaturePrefsStore.batch1691.v1692price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1692: pride mode
internal fun PlayerActivity.showV1692PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pride
    FeaturePrefsStore.batch1691.v1692pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1692: prison mode
internal fun PlayerActivity.showV1692PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1692prison
    FeaturePrefsStore.batch1691.v1692prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1692: private mode
internal fun PlayerActivity.showV1692PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1692private
    FeaturePrefsStore.batch1691.v1692private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1692: prize mode
internal fun PlayerActivity.showV1692PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1692prize
    FeaturePrefsStore.batch1691.v1692prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1692: problem level
internal fun PlayerActivity.showV1692ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1692: profit level
internal fun PlayerActivity.showV1692ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1692: promote level
internal fun PlayerActivity.showV1692PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1692: proof level
internal fun PlayerActivity.showV1692ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1692: prosper level
internal fun PlayerActivity.showV1692ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1692prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1692prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1692: proud mode
internal fun PlayerActivity.showV1692ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1692proud
    FeaturePrefsStore.batch1691.v1692proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1692: public mode
internal fun PlayerActivity.showV1692PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1692public
    FeaturePrefsStore.batch1691.v1692public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1692: pudding mode
internal fun PlayerActivity.showV1692PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pudding
    FeaturePrefsStore.batch1691.v1692pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1692: pulp mode
internal fun PlayerActivity.showV1692PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pulp
    FeaturePrefsStore.batch1691.v1692pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1692: pulse mode
internal fun PlayerActivity.showV1692PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1692pulse
    FeaturePrefsStore.batch1691.v1692pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1693: price mode
internal fun PlayerActivity.showV1693PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1693price
    FeaturePrefsStore.batch1691.v1693price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1693: pride mode
internal fun PlayerActivity.showV1693PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pride
    FeaturePrefsStore.batch1691.v1693pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1693: prison mode
internal fun PlayerActivity.showV1693PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1693prison
    FeaturePrefsStore.batch1691.v1693prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1693: private mode
internal fun PlayerActivity.showV1693PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1693private
    FeaturePrefsStore.batch1691.v1693private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1693: prize mode
internal fun PlayerActivity.showV1693PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1693prize
    FeaturePrefsStore.batch1691.v1693prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1693: problem level
internal fun PlayerActivity.showV1693ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1693: profit level
internal fun PlayerActivity.showV1693ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1693: promote level
internal fun PlayerActivity.showV1693PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1693: proof level
internal fun PlayerActivity.showV1693ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1693: prosper level
internal fun PlayerActivity.showV1693ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1693prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1693prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1693: proud mode
internal fun PlayerActivity.showV1693ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1693proud
    FeaturePrefsStore.batch1691.v1693proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1693: public mode
internal fun PlayerActivity.showV1693PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1693public
    FeaturePrefsStore.batch1691.v1693public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1693: pudding mode
internal fun PlayerActivity.showV1693PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pudding
    FeaturePrefsStore.batch1691.v1693pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1693: pulp mode
internal fun PlayerActivity.showV1693PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pulp
    FeaturePrefsStore.batch1691.v1693pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1693: pulse mode
internal fun PlayerActivity.showV1693PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1693pulse
    FeaturePrefsStore.batch1691.v1693pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1694: price mode
internal fun PlayerActivity.showV1694PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1694price
    FeaturePrefsStore.batch1691.v1694price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1694: pride mode
internal fun PlayerActivity.showV1694PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pride
    FeaturePrefsStore.batch1691.v1694pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1694: prison mode
internal fun PlayerActivity.showV1694PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1694prison
    FeaturePrefsStore.batch1691.v1694prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1694: private mode
internal fun PlayerActivity.showV1694PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1694private
    FeaturePrefsStore.batch1691.v1694private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1694: prize mode
internal fun PlayerActivity.showV1694PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1694prize
    FeaturePrefsStore.batch1691.v1694prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1694: problem level
internal fun PlayerActivity.showV1694ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1694: profit level
internal fun PlayerActivity.showV1694ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1694: promote level
internal fun PlayerActivity.showV1694PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1694: proof level
internal fun PlayerActivity.showV1694ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1694: prosper level
internal fun PlayerActivity.showV1694ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1694prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1694prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1694: proud mode
internal fun PlayerActivity.showV1694ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1694proud
    FeaturePrefsStore.batch1691.v1694proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1694: public mode
internal fun PlayerActivity.showV1694PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1694public
    FeaturePrefsStore.batch1691.v1694public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1694: pudding mode
internal fun PlayerActivity.showV1694PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pudding
    FeaturePrefsStore.batch1691.v1694pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1694: pulp mode
internal fun PlayerActivity.showV1694PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pulp
    FeaturePrefsStore.batch1691.v1694pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1694: pulse mode
internal fun PlayerActivity.showV1694PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1694pulse
    FeaturePrefsStore.batch1691.v1694pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1695: price mode
internal fun PlayerActivity.showV1695PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1695price
    FeaturePrefsStore.batch1691.v1695price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1695: pride mode
internal fun PlayerActivity.showV1695PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pride
    FeaturePrefsStore.batch1691.v1695pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1695: prison mode
internal fun PlayerActivity.showV1695PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1695prison
    FeaturePrefsStore.batch1691.v1695prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1695: private mode
internal fun PlayerActivity.showV1695PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1695private
    FeaturePrefsStore.batch1691.v1695private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1695: prize mode
internal fun PlayerActivity.showV1695PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1695prize
    FeaturePrefsStore.batch1691.v1695prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1695: problem level
internal fun PlayerActivity.showV1695ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1695: profit level
internal fun PlayerActivity.showV1695ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1695: promote level
internal fun PlayerActivity.showV1695PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1695: proof level
internal fun PlayerActivity.showV1695ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1695: prosper level
internal fun PlayerActivity.showV1695ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1695prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1695prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1695: proud mode
internal fun PlayerActivity.showV1695ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1695proud
    FeaturePrefsStore.batch1691.v1695proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1695: public mode
internal fun PlayerActivity.showV1695PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1695public
    FeaturePrefsStore.batch1691.v1695public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1695: pudding mode
internal fun PlayerActivity.showV1695PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pudding
    FeaturePrefsStore.batch1691.v1695pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1695: pulp mode
internal fun PlayerActivity.showV1695PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pulp
    FeaturePrefsStore.batch1691.v1695pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1695: pulse mode
internal fun PlayerActivity.showV1695PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1695pulse
    FeaturePrefsStore.batch1691.v1695pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1696: price mode
internal fun PlayerActivity.showV1696PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1696price
    FeaturePrefsStore.batch1691.v1696price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1696: pride mode
internal fun PlayerActivity.showV1696PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pride
    FeaturePrefsStore.batch1691.v1696pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1696: prison mode
internal fun PlayerActivity.showV1696PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1696prison
    FeaturePrefsStore.batch1691.v1696prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1696: private mode
internal fun PlayerActivity.showV1696PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1696private
    FeaturePrefsStore.batch1691.v1696private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1696: prize mode
internal fun PlayerActivity.showV1696PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1696prize
    FeaturePrefsStore.batch1691.v1696prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1696: problem level
internal fun PlayerActivity.showV1696ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1696: profit level
internal fun PlayerActivity.showV1696ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1696: promote level
internal fun PlayerActivity.showV1696PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1696: proof level
internal fun PlayerActivity.showV1696ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1696: prosper level
internal fun PlayerActivity.showV1696ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1696prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1696prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1696: proud mode
internal fun PlayerActivity.showV1696ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1696proud
    FeaturePrefsStore.batch1691.v1696proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1696: public mode
internal fun PlayerActivity.showV1696PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1696public
    FeaturePrefsStore.batch1691.v1696public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1696: pudding mode
internal fun PlayerActivity.showV1696PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pudding
    FeaturePrefsStore.batch1691.v1696pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1696: pulp mode
internal fun PlayerActivity.showV1696PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pulp
    FeaturePrefsStore.batch1691.v1696pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1696: pulse mode
internal fun PlayerActivity.showV1696PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1696pulse
    FeaturePrefsStore.batch1691.v1696pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1697: price mode
internal fun PlayerActivity.showV1697PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1697price
    FeaturePrefsStore.batch1691.v1697price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1697: pride mode
internal fun PlayerActivity.showV1697PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pride
    FeaturePrefsStore.batch1691.v1697pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1697: prison mode
internal fun PlayerActivity.showV1697PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1697prison
    FeaturePrefsStore.batch1691.v1697prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1697: private mode
internal fun PlayerActivity.showV1697PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1697private
    FeaturePrefsStore.batch1691.v1697private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1697: prize mode
internal fun PlayerActivity.showV1697PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1697prize
    FeaturePrefsStore.batch1691.v1697prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1697: problem level
internal fun PlayerActivity.showV1697ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1697: profit level
internal fun PlayerActivity.showV1697ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1697: promote level
internal fun PlayerActivity.showV1697PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1697: proof level
internal fun PlayerActivity.showV1697ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1697: prosper level
internal fun PlayerActivity.showV1697ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1697prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1697prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1697: proud mode
internal fun PlayerActivity.showV1697ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1697proud
    FeaturePrefsStore.batch1691.v1697proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1697: public mode
internal fun PlayerActivity.showV1697PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1697public
    FeaturePrefsStore.batch1691.v1697public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1697: pudding mode
internal fun PlayerActivity.showV1697PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pudding
    FeaturePrefsStore.batch1691.v1697pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1697: pulp mode
internal fun PlayerActivity.showV1697PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pulp
    FeaturePrefsStore.batch1691.v1697pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1697: pulse mode
internal fun PlayerActivity.showV1697PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1697pulse
    FeaturePrefsStore.batch1691.v1697pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1698: price mode
internal fun PlayerActivity.showV1698PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1698price
    FeaturePrefsStore.batch1691.v1698price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1698: pride mode
internal fun PlayerActivity.showV1698PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pride
    FeaturePrefsStore.batch1691.v1698pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1698: prison mode
internal fun PlayerActivity.showV1698PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1698prison
    FeaturePrefsStore.batch1691.v1698prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1698: private mode
internal fun PlayerActivity.showV1698PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1698private
    FeaturePrefsStore.batch1691.v1698private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1698: prize mode
internal fun PlayerActivity.showV1698PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1698prize
    FeaturePrefsStore.batch1691.v1698prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1698: problem level
internal fun PlayerActivity.showV1698ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1698: profit level
internal fun PlayerActivity.showV1698ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1698: promote level
internal fun PlayerActivity.showV1698PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1698: proof level
internal fun PlayerActivity.showV1698ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1698: prosper level
internal fun PlayerActivity.showV1698ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1698prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1698prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1698: proud mode
internal fun PlayerActivity.showV1698ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1698proud
    FeaturePrefsStore.batch1691.v1698proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1698: public mode
internal fun PlayerActivity.showV1698PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1698public
    FeaturePrefsStore.batch1691.v1698public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1698: pudding mode
internal fun PlayerActivity.showV1698PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pudding
    FeaturePrefsStore.batch1691.v1698pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1698: pulp mode
internal fun PlayerActivity.showV1698PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pulp
    FeaturePrefsStore.batch1691.v1698pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1698: pulse mode
internal fun PlayerActivity.showV1698PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1698pulse
    FeaturePrefsStore.batch1691.v1698pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1699: price mode
internal fun PlayerActivity.showV1699PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1699price
    FeaturePrefsStore.batch1691.v1699price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1699: pride mode
internal fun PlayerActivity.showV1699PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pride
    FeaturePrefsStore.batch1691.v1699pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1699: prison mode
internal fun PlayerActivity.showV1699PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1699prison
    FeaturePrefsStore.batch1691.v1699prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1699: private mode
internal fun PlayerActivity.showV1699PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1699private
    FeaturePrefsStore.batch1691.v1699private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1699: prize mode
internal fun PlayerActivity.showV1699PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1699prize
    FeaturePrefsStore.batch1691.v1699prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1699: problem level
internal fun PlayerActivity.showV1699ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1699: profit level
internal fun PlayerActivity.showV1699ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1699: promote level
internal fun PlayerActivity.showV1699PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1699: proof level
internal fun PlayerActivity.showV1699ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1699: prosper level
internal fun PlayerActivity.showV1699ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1699prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1699prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1699: proud mode
internal fun PlayerActivity.showV1699ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1699proud
    FeaturePrefsStore.batch1691.v1699proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1699: public mode
internal fun PlayerActivity.showV1699PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1699public
    FeaturePrefsStore.batch1691.v1699public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1699: pudding mode
internal fun PlayerActivity.showV1699PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pudding
    FeaturePrefsStore.batch1691.v1699pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1699: pulp mode
internal fun PlayerActivity.showV1699PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pulp
    FeaturePrefsStore.batch1691.v1699pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1699: pulse mode
internal fun PlayerActivity.showV1699PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1699pulse
    FeaturePrefsStore.batch1691.v1699pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

// v1700: price mode
internal fun PlayerActivity.showV1700PriceToggle() {
    val current = FeaturePrefsStore.batch1691.v1700price
    FeaturePrefsStore.batch1691.v1700price = !current
    AppToast.show(this, "price: ${if (!current) "ON" else "OFF"}")
}

// v1700: pride mode
internal fun PlayerActivity.showV1700PrideToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pride
    FeaturePrefsStore.batch1691.v1700pride = !current
    AppToast.show(this, "pride: ${if (!current) "ON" else "OFF"}")
}

// v1700: prison mode
internal fun PlayerActivity.showV1700PrisonToggle() {
    val current = FeaturePrefsStore.batch1691.v1700prison
    FeaturePrefsStore.batch1691.v1700prison = !current
    AppToast.show(this, "prison: ${if (!current) "ON" else "OFF"}")
}

// v1700: private mode
internal fun PlayerActivity.showV1700PrivateToggle() {
    val current = FeaturePrefsStore.batch1691.v1700private
    FeaturePrefsStore.batch1691.v1700private = !current
    AppToast.show(this, "private: ${if (!current) "ON" else "OFF"}")
}

// v1700: prize mode
internal fun PlayerActivity.showV1700PrizeToggle() {
    val current = FeaturePrefsStore.batch1691.v1700prize
    FeaturePrefsStore.batch1691.v1700prize = !current
    AppToast.show(this, "prize: ${if (!current) "ON" else "OFF"}")
}

// v1700: problem level
internal fun PlayerActivity.showV1700ProblemDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700problem).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "problem level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700problem = value
        AppToast.show(this, "problem: $value")
    }
}

// v1700: profit level
internal fun PlayerActivity.showV1700ProfitDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700profit).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "profit level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700profit = value
        AppToast.show(this, "profit: $value")
    }
}

// v1700: promote level
internal fun PlayerActivity.showV1700PromoteDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700promote).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "promote level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700promote = value
        AppToast.show(this, "promote: $value")
    }
}

// v1700: proof level
internal fun PlayerActivity.showV1700ProofDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700proof).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "proof level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700proof = value
        AppToast.show(this, "proof: $value")
    }
}

// v1700: prosper level
internal fun PlayerActivity.showV1700ProsperDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1691.v1700prosper).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "prosper level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1691.v1700prosper = value
        AppToast.show(this, "prosper: $value")
    }
}

// v1700: proud mode
internal fun PlayerActivity.showV1700ProudToggle() {
    val current = FeaturePrefsStore.batch1691.v1700proud
    FeaturePrefsStore.batch1691.v1700proud = !current
    AppToast.show(this, "proud: ${if (!current) "ON" else "OFF"}")
}

// v1700: public mode
internal fun PlayerActivity.showV1700PublicToggle() {
    val current = FeaturePrefsStore.batch1691.v1700public
    FeaturePrefsStore.batch1691.v1700public = !current
    AppToast.show(this, "public: ${if (!current) "ON" else "OFF"}")
}

// v1700: pudding mode
internal fun PlayerActivity.showV1700PuddingToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pudding
    FeaturePrefsStore.batch1691.v1700pudding = !current
    AppToast.show(this, "pudding: ${if (!current) "ON" else "OFF"}")
}

// v1700: pulp mode
internal fun PlayerActivity.showV1700PulpToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pulp
    FeaturePrefsStore.batch1691.v1700pulp = !current
    AppToast.show(this, "pulp: ${if (!current) "ON" else "OFF"}")
}

// v1700: pulse mode
internal fun PlayerActivity.showV1700PulseToggle() {
    val current = FeaturePrefsStore.batch1691.v1700pulse
    FeaturePrefsStore.batch1691.v1700pulse = !current
    AppToast.show(this, "pulse: ${if (!current) "ON" else "OFF"}")
}

