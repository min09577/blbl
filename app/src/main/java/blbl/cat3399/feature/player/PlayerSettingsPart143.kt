package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v1611: nothing mode
internal fun PlayerActivity.showV1611NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1611nothing
    FeaturePrefsStore.batch1611.v1611nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1611: notice mode
internal fun PlayerActivity.showV1611NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1611notice
    FeaturePrefsStore.batch1611.v1611notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1611: novel mode
internal fun PlayerActivity.showV1611NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1611novel
    FeaturePrefsStore.batch1611.v1611novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1611: nuclear mode
internal fun PlayerActivity.showV1611NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1611nuclear
    FeaturePrefsStore.batch1611.v1611nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1611: nurse mode
internal fun PlayerActivity.showV1611NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1611nurse
    FeaturePrefsStore.batch1611.v1611nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1611: nylon level
internal fun PlayerActivity.showV1611NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1611: oak level
internal fun PlayerActivity.showV1611OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1611: obey level
internal fun PlayerActivity.showV1611ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1611: oblige level
internal fun PlayerActivity.showV1611ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1611: obscure level
internal fun PlayerActivity.showV1611ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1611obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1611obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1611: obtain mode
internal fun PlayerActivity.showV1611ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1611obtain
    FeaturePrefsStore.batch1611.v1611obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1611: obvious mode
internal fun PlayerActivity.showV1611ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1611obvious
    FeaturePrefsStore.batch1611.v1611obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1611: occur mode
internal fun PlayerActivity.showV1611OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1611occur
    FeaturePrefsStore.batch1611.v1611occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1611: ocean mode
internal fun PlayerActivity.showV1611OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1611ocean
    FeaturePrefsStore.batch1611.v1611ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1611: october mode
internal fun PlayerActivity.showV1611OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1611october
    FeaturePrefsStore.batch1611.v1611october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1612: nothing mode
internal fun PlayerActivity.showV1612NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1612nothing
    FeaturePrefsStore.batch1611.v1612nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1612: notice mode
internal fun PlayerActivity.showV1612NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1612notice
    FeaturePrefsStore.batch1611.v1612notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1612: novel mode
internal fun PlayerActivity.showV1612NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1612novel
    FeaturePrefsStore.batch1611.v1612novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1612: nuclear mode
internal fun PlayerActivity.showV1612NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1612nuclear
    FeaturePrefsStore.batch1611.v1612nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1612: nurse mode
internal fun PlayerActivity.showV1612NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1612nurse
    FeaturePrefsStore.batch1611.v1612nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1612: nylon level
internal fun PlayerActivity.showV1612NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1612: oak level
internal fun PlayerActivity.showV1612OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1612: obey level
internal fun PlayerActivity.showV1612ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1612: oblige level
internal fun PlayerActivity.showV1612ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1612: obscure level
internal fun PlayerActivity.showV1612ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1612obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1612obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1612: obtain mode
internal fun PlayerActivity.showV1612ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1612obtain
    FeaturePrefsStore.batch1611.v1612obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1612: obvious mode
internal fun PlayerActivity.showV1612ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1612obvious
    FeaturePrefsStore.batch1611.v1612obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1612: occur mode
internal fun PlayerActivity.showV1612OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1612occur
    FeaturePrefsStore.batch1611.v1612occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1612: ocean mode
internal fun PlayerActivity.showV1612OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1612ocean
    FeaturePrefsStore.batch1611.v1612ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1612: october mode
internal fun PlayerActivity.showV1612OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1612october
    FeaturePrefsStore.batch1611.v1612october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1613: nothing mode
internal fun PlayerActivity.showV1613NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1613nothing
    FeaturePrefsStore.batch1611.v1613nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1613: notice mode
internal fun PlayerActivity.showV1613NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1613notice
    FeaturePrefsStore.batch1611.v1613notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1613: novel mode
internal fun PlayerActivity.showV1613NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1613novel
    FeaturePrefsStore.batch1611.v1613novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1613: nuclear mode
internal fun PlayerActivity.showV1613NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1613nuclear
    FeaturePrefsStore.batch1611.v1613nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1613: nurse mode
internal fun PlayerActivity.showV1613NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1613nurse
    FeaturePrefsStore.batch1611.v1613nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1613: nylon level
internal fun PlayerActivity.showV1613NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1613: oak level
internal fun PlayerActivity.showV1613OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1613: obey level
internal fun PlayerActivity.showV1613ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1613: oblige level
internal fun PlayerActivity.showV1613ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1613: obscure level
internal fun PlayerActivity.showV1613ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1613obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1613obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1613: obtain mode
internal fun PlayerActivity.showV1613ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1613obtain
    FeaturePrefsStore.batch1611.v1613obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1613: obvious mode
internal fun PlayerActivity.showV1613ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1613obvious
    FeaturePrefsStore.batch1611.v1613obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1613: occur mode
internal fun PlayerActivity.showV1613OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1613occur
    FeaturePrefsStore.batch1611.v1613occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1613: ocean mode
internal fun PlayerActivity.showV1613OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1613ocean
    FeaturePrefsStore.batch1611.v1613ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1613: october mode
internal fun PlayerActivity.showV1613OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1613october
    FeaturePrefsStore.batch1611.v1613october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1614: nothing mode
internal fun PlayerActivity.showV1614NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1614nothing
    FeaturePrefsStore.batch1611.v1614nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1614: notice mode
internal fun PlayerActivity.showV1614NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1614notice
    FeaturePrefsStore.batch1611.v1614notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1614: novel mode
internal fun PlayerActivity.showV1614NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1614novel
    FeaturePrefsStore.batch1611.v1614novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1614: nuclear mode
internal fun PlayerActivity.showV1614NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1614nuclear
    FeaturePrefsStore.batch1611.v1614nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1614: nurse mode
internal fun PlayerActivity.showV1614NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1614nurse
    FeaturePrefsStore.batch1611.v1614nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1614: nylon level
internal fun PlayerActivity.showV1614NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1614: oak level
internal fun PlayerActivity.showV1614OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1614: obey level
internal fun PlayerActivity.showV1614ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1614: oblige level
internal fun PlayerActivity.showV1614ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1614: obscure level
internal fun PlayerActivity.showV1614ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1614obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1614obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1614: obtain mode
internal fun PlayerActivity.showV1614ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1614obtain
    FeaturePrefsStore.batch1611.v1614obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1614: obvious mode
internal fun PlayerActivity.showV1614ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1614obvious
    FeaturePrefsStore.batch1611.v1614obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1614: occur mode
internal fun PlayerActivity.showV1614OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1614occur
    FeaturePrefsStore.batch1611.v1614occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1614: ocean mode
internal fun PlayerActivity.showV1614OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1614ocean
    FeaturePrefsStore.batch1611.v1614ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1614: october mode
internal fun PlayerActivity.showV1614OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1614october
    FeaturePrefsStore.batch1611.v1614october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1615: nothing mode
internal fun PlayerActivity.showV1615NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1615nothing
    FeaturePrefsStore.batch1611.v1615nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1615: notice mode
internal fun PlayerActivity.showV1615NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1615notice
    FeaturePrefsStore.batch1611.v1615notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1615: novel mode
internal fun PlayerActivity.showV1615NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1615novel
    FeaturePrefsStore.batch1611.v1615novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1615: nuclear mode
internal fun PlayerActivity.showV1615NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1615nuclear
    FeaturePrefsStore.batch1611.v1615nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1615: nurse mode
internal fun PlayerActivity.showV1615NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1615nurse
    FeaturePrefsStore.batch1611.v1615nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1615: nylon level
internal fun PlayerActivity.showV1615NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1615: oak level
internal fun PlayerActivity.showV1615OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1615: obey level
internal fun PlayerActivity.showV1615ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1615: oblige level
internal fun PlayerActivity.showV1615ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1615: obscure level
internal fun PlayerActivity.showV1615ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1615obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1615obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1615: obtain mode
internal fun PlayerActivity.showV1615ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1615obtain
    FeaturePrefsStore.batch1611.v1615obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1615: obvious mode
internal fun PlayerActivity.showV1615ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1615obvious
    FeaturePrefsStore.batch1611.v1615obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1615: occur mode
internal fun PlayerActivity.showV1615OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1615occur
    FeaturePrefsStore.batch1611.v1615occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1615: ocean mode
internal fun PlayerActivity.showV1615OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1615ocean
    FeaturePrefsStore.batch1611.v1615ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1615: october mode
internal fun PlayerActivity.showV1615OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1615october
    FeaturePrefsStore.batch1611.v1615october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1616: nothing mode
internal fun PlayerActivity.showV1616NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1616nothing
    FeaturePrefsStore.batch1611.v1616nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1616: notice mode
internal fun PlayerActivity.showV1616NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1616notice
    FeaturePrefsStore.batch1611.v1616notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1616: novel mode
internal fun PlayerActivity.showV1616NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1616novel
    FeaturePrefsStore.batch1611.v1616novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1616: nuclear mode
internal fun PlayerActivity.showV1616NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1616nuclear
    FeaturePrefsStore.batch1611.v1616nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1616: nurse mode
internal fun PlayerActivity.showV1616NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1616nurse
    FeaturePrefsStore.batch1611.v1616nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1616: nylon level
internal fun PlayerActivity.showV1616NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1616: oak level
internal fun PlayerActivity.showV1616OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1616: obey level
internal fun PlayerActivity.showV1616ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1616: oblige level
internal fun PlayerActivity.showV1616ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1616: obscure level
internal fun PlayerActivity.showV1616ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1616obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1616obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1616: obtain mode
internal fun PlayerActivity.showV1616ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1616obtain
    FeaturePrefsStore.batch1611.v1616obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1616: obvious mode
internal fun PlayerActivity.showV1616ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1616obvious
    FeaturePrefsStore.batch1611.v1616obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1616: occur mode
internal fun PlayerActivity.showV1616OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1616occur
    FeaturePrefsStore.batch1611.v1616occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1616: ocean mode
internal fun PlayerActivity.showV1616OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1616ocean
    FeaturePrefsStore.batch1611.v1616ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1616: october mode
internal fun PlayerActivity.showV1616OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1616october
    FeaturePrefsStore.batch1611.v1616october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1617: nothing mode
internal fun PlayerActivity.showV1617NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1617nothing
    FeaturePrefsStore.batch1611.v1617nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1617: notice mode
internal fun PlayerActivity.showV1617NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1617notice
    FeaturePrefsStore.batch1611.v1617notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1617: novel mode
internal fun PlayerActivity.showV1617NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1617novel
    FeaturePrefsStore.batch1611.v1617novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1617: nuclear mode
internal fun PlayerActivity.showV1617NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1617nuclear
    FeaturePrefsStore.batch1611.v1617nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1617: nurse mode
internal fun PlayerActivity.showV1617NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1617nurse
    FeaturePrefsStore.batch1611.v1617nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1617: nylon level
internal fun PlayerActivity.showV1617NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1617: oak level
internal fun PlayerActivity.showV1617OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1617: obey level
internal fun PlayerActivity.showV1617ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1617: oblige level
internal fun PlayerActivity.showV1617ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1617: obscure level
internal fun PlayerActivity.showV1617ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1617obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1617obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1617: obtain mode
internal fun PlayerActivity.showV1617ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1617obtain
    FeaturePrefsStore.batch1611.v1617obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1617: obvious mode
internal fun PlayerActivity.showV1617ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1617obvious
    FeaturePrefsStore.batch1611.v1617obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1617: occur mode
internal fun PlayerActivity.showV1617OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1617occur
    FeaturePrefsStore.batch1611.v1617occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1617: ocean mode
internal fun PlayerActivity.showV1617OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1617ocean
    FeaturePrefsStore.batch1611.v1617ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1617: october mode
internal fun PlayerActivity.showV1617OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1617october
    FeaturePrefsStore.batch1611.v1617october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1618: nothing mode
internal fun PlayerActivity.showV1618NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1618nothing
    FeaturePrefsStore.batch1611.v1618nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1618: notice mode
internal fun PlayerActivity.showV1618NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1618notice
    FeaturePrefsStore.batch1611.v1618notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1618: novel mode
internal fun PlayerActivity.showV1618NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1618novel
    FeaturePrefsStore.batch1611.v1618novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1618: nuclear mode
internal fun PlayerActivity.showV1618NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1618nuclear
    FeaturePrefsStore.batch1611.v1618nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1618: nurse mode
internal fun PlayerActivity.showV1618NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1618nurse
    FeaturePrefsStore.batch1611.v1618nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1618: nylon level
internal fun PlayerActivity.showV1618NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1618: oak level
internal fun PlayerActivity.showV1618OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1618: obey level
internal fun PlayerActivity.showV1618ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1618: oblige level
internal fun PlayerActivity.showV1618ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1618: obscure level
internal fun PlayerActivity.showV1618ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1618obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1618obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1618: obtain mode
internal fun PlayerActivity.showV1618ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1618obtain
    FeaturePrefsStore.batch1611.v1618obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1618: obvious mode
internal fun PlayerActivity.showV1618ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1618obvious
    FeaturePrefsStore.batch1611.v1618obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1618: occur mode
internal fun PlayerActivity.showV1618OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1618occur
    FeaturePrefsStore.batch1611.v1618occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1618: ocean mode
internal fun PlayerActivity.showV1618OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1618ocean
    FeaturePrefsStore.batch1611.v1618ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1618: october mode
internal fun PlayerActivity.showV1618OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1618october
    FeaturePrefsStore.batch1611.v1618october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1619: nothing mode
internal fun PlayerActivity.showV1619NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1619nothing
    FeaturePrefsStore.batch1611.v1619nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1619: notice mode
internal fun PlayerActivity.showV1619NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1619notice
    FeaturePrefsStore.batch1611.v1619notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1619: novel mode
internal fun PlayerActivity.showV1619NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1619novel
    FeaturePrefsStore.batch1611.v1619novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1619: nuclear mode
internal fun PlayerActivity.showV1619NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1619nuclear
    FeaturePrefsStore.batch1611.v1619nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1619: nurse mode
internal fun PlayerActivity.showV1619NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1619nurse
    FeaturePrefsStore.batch1611.v1619nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1619: nylon level
internal fun PlayerActivity.showV1619NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1619: oak level
internal fun PlayerActivity.showV1619OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1619: obey level
internal fun PlayerActivity.showV1619ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1619: oblige level
internal fun PlayerActivity.showV1619ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1619: obscure level
internal fun PlayerActivity.showV1619ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1619obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1619obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1619: obtain mode
internal fun PlayerActivity.showV1619ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1619obtain
    FeaturePrefsStore.batch1611.v1619obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1619: obvious mode
internal fun PlayerActivity.showV1619ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1619obvious
    FeaturePrefsStore.batch1611.v1619obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1619: occur mode
internal fun PlayerActivity.showV1619OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1619occur
    FeaturePrefsStore.batch1611.v1619occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1619: ocean mode
internal fun PlayerActivity.showV1619OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1619ocean
    FeaturePrefsStore.batch1611.v1619ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1619: october mode
internal fun PlayerActivity.showV1619OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1619october
    FeaturePrefsStore.batch1611.v1619october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

// v1620: nothing mode
internal fun PlayerActivity.showV1620NothingToggle() {
    val current = FeaturePrefsStore.batch1611.v1620nothing
    FeaturePrefsStore.batch1611.v1620nothing = !current
    AppToast.show(this, "nothing: ${if (!current) "ON" else "OFF"}")
}

// v1620: notice mode
internal fun PlayerActivity.showV1620NoticeToggle() {
    val current = FeaturePrefsStore.batch1611.v1620notice
    FeaturePrefsStore.batch1611.v1620notice = !current
    AppToast.show(this, "notice: ${if (!current) "ON" else "OFF"}")
}

// v1620: novel mode
internal fun PlayerActivity.showV1620NovelToggle() {
    val current = FeaturePrefsStore.batch1611.v1620novel
    FeaturePrefsStore.batch1611.v1620novel = !current
    AppToast.show(this, "novel: ${if (!current) "ON" else "OFF"}")
}

// v1620: nuclear mode
internal fun PlayerActivity.showV1620NuclearToggle() {
    val current = FeaturePrefsStore.batch1611.v1620nuclear
    FeaturePrefsStore.batch1611.v1620nuclear = !current
    AppToast.show(this, "nuclear: ${if (!current) "ON" else "OFF"}")
}

// v1620: nurse mode
internal fun PlayerActivity.showV1620NurseToggle() {
    val current = FeaturePrefsStore.batch1611.v1620nurse
    FeaturePrefsStore.batch1611.v1620nurse = !current
    AppToast.show(this, "nurse: ${if (!current) "ON" else "OFF"}")
}

// v1620: nylon level
internal fun PlayerActivity.showV1620NylonDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620nylon).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "nylon level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620nylon = value
        AppToast.show(this, "nylon: $value")
    }
}

// v1620: oak level
internal fun PlayerActivity.showV1620OakDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620oak).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oak level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620oak = value
        AppToast.show(this, "oak: $value")
    }
}

// v1620: obey level
internal fun PlayerActivity.showV1620ObeyDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620obey).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obey level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620obey = value
        AppToast.show(this, "obey: $value")
    }
}

// v1620: oblige level
internal fun PlayerActivity.showV1620ObligeDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620oblige).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "oblige level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620oblige = value
        AppToast.show(this, "oblige: $value")
    }
}

// v1620: obscure level
internal fun PlayerActivity.showV1620ObscureDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch1611.v1620obscure).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "obscure level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch1611.v1620obscure = value
        AppToast.show(this, "obscure: $value")
    }
}

// v1620: obtain mode
internal fun PlayerActivity.showV1620ObtainToggle() {
    val current = FeaturePrefsStore.batch1611.v1620obtain
    FeaturePrefsStore.batch1611.v1620obtain = !current
    AppToast.show(this, "obtain: ${if (!current) "ON" else "OFF"}")
}

// v1620: obvious mode
internal fun PlayerActivity.showV1620ObviousToggle() {
    val current = FeaturePrefsStore.batch1611.v1620obvious
    FeaturePrefsStore.batch1611.v1620obvious = !current
    AppToast.show(this, "obvious: ${if (!current) "ON" else "OFF"}")
}

// v1620: occur mode
internal fun PlayerActivity.showV1620OccurToggle() {
    val current = FeaturePrefsStore.batch1611.v1620occur
    FeaturePrefsStore.batch1611.v1620occur = !current
    AppToast.show(this, "occur: ${if (!current) "ON" else "OFF"}")
}

// v1620: ocean mode
internal fun PlayerActivity.showV1620OceanToggle() {
    val current = FeaturePrefsStore.batch1611.v1620ocean
    FeaturePrefsStore.batch1611.v1620ocean = !current
    AppToast.show(this, "ocean: ${if (!current) "ON" else "OFF"}")
}

// v1620: october mode
internal fun PlayerActivity.showV1620OctoberToggle() {
    val current = FeaturePrefsStore.batch1611.v1620october
    FeaturePrefsStore.batch1611.v1620october = !current
    AppToast.show(this, "october: ${if (!current) "ON" else "OFF"}")
}

