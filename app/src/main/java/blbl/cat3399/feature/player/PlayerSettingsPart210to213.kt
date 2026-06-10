package blbl.cat3399.feature.player

import blbl.cat3399.core.prefs.FeaturePrefsStore
import blbl.cat3399.core.ui.AppToast

// v2281: survived mode
internal fun PlayerActivity.showV2281SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281survived
    FeaturePrefsStore.batch2281.v2281survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2281: suspected mode
internal fun PlayerActivity.showV2281SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281suspected
    FeaturePrefsStore.batch2281.v2281suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2281: suspended mode
internal fun PlayerActivity.showV2281SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281suspended
    FeaturePrefsStore.batch2281.v2281suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2281: sustained mode
internal fun PlayerActivity.showV2281SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281sustained
    FeaturePrefsStore.batch2281.v2281sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2281: swapped mode
internal fun PlayerActivity.showV2281SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281swapped
    FeaturePrefsStore.batch2281.v2281swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2281: switched level
internal fun PlayerActivity.showV2281SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2281switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2281switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2281: symbolized level
internal fun PlayerActivity.showV2281SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2281symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2281symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2281: synchronized level
internal fun PlayerActivity.showV2281SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2281synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2281synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2281: synthesized level
internal fun PlayerActivity.showV2281SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2281synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2281synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2281: systematized level
internal fun PlayerActivity.showV2281SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2281systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2281systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2281: tackled mode
internal fun PlayerActivity.showV2281TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2281tackled
    FeaturePrefsStore.batch2281.v2281tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2281: tailored mode
internal fun PlayerActivity.showV2281TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2281tailored
    FeaturePrefsStore.batch2281.v2281tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2281: targeted mode
internal fun PlayerActivity.showV2281TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281targeted
    FeaturePrefsStore.batch2281.v2281targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2281: tasked mode
internal fun PlayerActivity.showV2281TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281tasked
    FeaturePrefsStore.batch2281.v2281tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2281: terminated mode
internal fun PlayerActivity.showV2281TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2281terminated
    FeaturePrefsStore.batch2281.v2281terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2282: survived mode
internal fun PlayerActivity.showV2282SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282survived
    FeaturePrefsStore.batch2281.v2282survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2282: suspected mode
internal fun PlayerActivity.showV2282SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282suspected
    FeaturePrefsStore.batch2281.v2282suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2282: suspended mode
internal fun PlayerActivity.showV2282SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282suspended
    FeaturePrefsStore.batch2281.v2282suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2282: sustained mode
internal fun PlayerActivity.showV2282SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282sustained
    FeaturePrefsStore.batch2281.v2282sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2282: swapped mode
internal fun PlayerActivity.showV2282SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282swapped
    FeaturePrefsStore.batch2281.v2282swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2282: switched level
internal fun PlayerActivity.showV2282SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2282switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2282switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2282: symbolized level
internal fun PlayerActivity.showV2282SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2282symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2282symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2282: synchronized level
internal fun PlayerActivity.showV2282SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2282synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2282synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2282: synthesized level
internal fun PlayerActivity.showV2282SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2282synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2282synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2282: systematized level
internal fun PlayerActivity.showV2282SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2282systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2282systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2282: tackled mode
internal fun PlayerActivity.showV2282TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2282tackled
    FeaturePrefsStore.batch2281.v2282tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2282: tailored mode
internal fun PlayerActivity.showV2282TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2282tailored
    FeaturePrefsStore.batch2281.v2282tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2282: targeted mode
internal fun PlayerActivity.showV2282TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282targeted
    FeaturePrefsStore.batch2281.v2282targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2282: tasked mode
internal fun PlayerActivity.showV2282TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282tasked
    FeaturePrefsStore.batch2281.v2282tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2282: terminated mode
internal fun PlayerActivity.showV2282TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2282terminated
    FeaturePrefsStore.batch2281.v2282terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2283: survived mode
internal fun PlayerActivity.showV2283SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283survived
    FeaturePrefsStore.batch2281.v2283survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2283: suspected mode
internal fun PlayerActivity.showV2283SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283suspected
    FeaturePrefsStore.batch2281.v2283suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2283: suspended mode
internal fun PlayerActivity.showV2283SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283suspended
    FeaturePrefsStore.batch2281.v2283suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2283: sustained mode
internal fun PlayerActivity.showV2283SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283sustained
    FeaturePrefsStore.batch2281.v2283sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2283: swapped mode
internal fun PlayerActivity.showV2283SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283swapped
    FeaturePrefsStore.batch2281.v2283swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2283: switched level
internal fun PlayerActivity.showV2283SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2283switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2283switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2283: symbolized level
internal fun PlayerActivity.showV2283SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2283symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2283symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2283: synchronized level
internal fun PlayerActivity.showV2283SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2283synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2283synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2283: synthesized level
internal fun PlayerActivity.showV2283SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2283synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2283synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2283: systematized level
internal fun PlayerActivity.showV2283SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2283systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2283systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2283: tackled mode
internal fun PlayerActivity.showV2283TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2283tackled
    FeaturePrefsStore.batch2281.v2283tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2283: tailored mode
internal fun PlayerActivity.showV2283TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2283tailored
    FeaturePrefsStore.batch2281.v2283tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2283: targeted mode
internal fun PlayerActivity.showV2283TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283targeted
    FeaturePrefsStore.batch2281.v2283targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2283: tasked mode
internal fun PlayerActivity.showV2283TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283tasked
    FeaturePrefsStore.batch2281.v2283tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2283: terminated mode
internal fun PlayerActivity.showV2283TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2283terminated
    FeaturePrefsStore.batch2281.v2283terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2284: survived mode
internal fun PlayerActivity.showV2284SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284survived
    FeaturePrefsStore.batch2281.v2284survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2284: suspected mode
internal fun PlayerActivity.showV2284SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284suspected
    FeaturePrefsStore.batch2281.v2284suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2284: suspended mode
internal fun PlayerActivity.showV2284SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284suspended
    FeaturePrefsStore.batch2281.v2284suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2284: sustained mode
internal fun PlayerActivity.showV2284SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284sustained
    FeaturePrefsStore.batch2281.v2284sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2284: swapped mode
internal fun PlayerActivity.showV2284SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284swapped
    FeaturePrefsStore.batch2281.v2284swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2284: switched level
internal fun PlayerActivity.showV2284SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2284switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2284switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2284: symbolized level
internal fun PlayerActivity.showV2284SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2284symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2284symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2284: synchronized level
internal fun PlayerActivity.showV2284SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2284synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2284synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2284: synthesized level
internal fun PlayerActivity.showV2284SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2284synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2284synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2284: systematized level
internal fun PlayerActivity.showV2284SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2284systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2284systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2284: tackled mode
internal fun PlayerActivity.showV2284TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2284tackled
    FeaturePrefsStore.batch2281.v2284tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2284: tailored mode
internal fun PlayerActivity.showV2284TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2284tailored
    FeaturePrefsStore.batch2281.v2284tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2284: targeted mode
internal fun PlayerActivity.showV2284TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284targeted
    FeaturePrefsStore.batch2281.v2284targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2284: tasked mode
internal fun PlayerActivity.showV2284TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284tasked
    FeaturePrefsStore.batch2281.v2284tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2284: terminated mode
internal fun PlayerActivity.showV2284TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2284terminated
    FeaturePrefsStore.batch2281.v2284terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2285: survived mode
internal fun PlayerActivity.showV2285SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285survived
    FeaturePrefsStore.batch2281.v2285survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2285: suspected mode
internal fun PlayerActivity.showV2285SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285suspected
    FeaturePrefsStore.batch2281.v2285suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2285: suspended mode
internal fun PlayerActivity.showV2285SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285suspended
    FeaturePrefsStore.batch2281.v2285suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2285: sustained mode
internal fun PlayerActivity.showV2285SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285sustained
    FeaturePrefsStore.batch2281.v2285sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2285: swapped mode
internal fun PlayerActivity.showV2285SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285swapped
    FeaturePrefsStore.batch2281.v2285swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2285: switched level
internal fun PlayerActivity.showV2285SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2285switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2285switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2285: symbolized level
internal fun PlayerActivity.showV2285SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2285symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2285symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2285: synchronized level
internal fun PlayerActivity.showV2285SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2285synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2285synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2285: synthesized level
internal fun PlayerActivity.showV2285SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2285synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2285synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2285: systematized level
internal fun PlayerActivity.showV2285SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2285systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2285systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2285: tackled mode
internal fun PlayerActivity.showV2285TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2285tackled
    FeaturePrefsStore.batch2281.v2285tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2285: tailored mode
internal fun PlayerActivity.showV2285TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2285tailored
    FeaturePrefsStore.batch2281.v2285tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2285: targeted mode
internal fun PlayerActivity.showV2285TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285targeted
    FeaturePrefsStore.batch2281.v2285targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2285: tasked mode
internal fun PlayerActivity.showV2285TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285tasked
    FeaturePrefsStore.batch2281.v2285tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2285: terminated mode
internal fun PlayerActivity.showV2285TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2285terminated
    FeaturePrefsStore.batch2281.v2285terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2286: survived mode
internal fun PlayerActivity.showV2286SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286survived
    FeaturePrefsStore.batch2281.v2286survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2286: suspected mode
internal fun PlayerActivity.showV2286SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286suspected
    FeaturePrefsStore.batch2281.v2286suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2286: suspended mode
internal fun PlayerActivity.showV2286SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286suspended
    FeaturePrefsStore.batch2281.v2286suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2286: sustained mode
internal fun PlayerActivity.showV2286SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286sustained
    FeaturePrefsStore.batch2281.v2286sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2286: swapped mode
internal fun PlayerActivity.showV2286SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286swapped
    FeaturePrefsStore.batch2281.v2286swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2286: switched level
internal fun PlayerActivity.showV2286SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2286switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2286switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2286: symbolized level
internal fun PlayerActivity.showV2286SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2286symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2286symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2286: synchronized level
internal fun PlayerActivity.showV2286SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2286synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2286synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2286: synthesized level
internal fun PlayerActivity.showV2286SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2286synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2286synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2286: systematized level
internal fun PlayerActivity.showV2286SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2286systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2286systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2286: tackled mode
internal fun PlayerActivity.showV2286TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2286tackled
    FeaturePrefsStore.batch2281.v2286tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2286: tailored mode
internal fun PlayerActivity.showV2286TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2286tailored
    FeaturePrefsStore.batch2281.v2286tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2286: targeted mode
internal fun PlayerActivity.showV2286TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286targeted
    FeaturePrefsStore.batch2281.v2286targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2286: tasked mode
internal fun PlayerActivity.showV2286TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286tasked
    FeaturePrefsStore.batch2281.v2286tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2286: terminated mode
internal fun PlayerActivity.showV2286TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2286terminated
    FeaturePrefsStore.batch2281.v2286terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2287: survived mode
internal fun PlayerActivity.showV2287SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287survived
    FeaturePrefsStore.batch2281.v2287survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2287: suspected mode
internal fun PlayerActivity.showV2287SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287suspected
    FeaturePrefsStore.batch2281.v2287suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2287: suspended mode
internal fun PlayerActivity.showV2287SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287suspended
    FeaturePrefsStore.batch2281.v2287suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2287: sustained mode
internal fun PlayerActivity.showV2287SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287sustained
    FeaturePrefsStore.batch2281.v2287sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2287: swapped mode
internal fun PlayerActivity.showV2287SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287swapped
    FeaturePrefsStore.batch2281.v2287swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2287: switched level
internal fun PlayerActivity.showV2287SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2287switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2287switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2287: symbolized level
internal fun PlayerActivity.showV2287SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2287symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2287symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2287: synchronized level
internal fun PlayerActivity.showV2287SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2287synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2287synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2287: synthesized level
internal fun PlayerActivity.showV2287SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2287synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2287synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2287: systematized level
internal fun PlayerActivity.showV2287SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2287systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2287systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2287: tackled mode
internal fun PlayerActivity.showV2287TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2287tackled
    FeaturePrefsStore.batch2281.v2287tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2287: tailored mode
internal fun PlayerActivity.showV2287TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2287tailored
    FeaturePrefsStore.batch2281.v2287tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2287: targeted mode
internal fun PlayerActivity.showV2287TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287targeted
    FeaturePrefsStore.batch2281.v2287targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2287: tasked mode
internal fun PlayerActivity.showV2287TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287tasked
    FeaturePrefsStore.batch2281.v2287tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2287: terminated mode
internal fun PlayerActivity.showV2287TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2287terminated
    FeaturePrefsStore.batch2281.v2287terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2288: survived mode
internal fun PlayerActivity.showV2288SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288survived
    FeaturePrefsStore.batch2281.v2288survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2288: suspected mode
internal fun PlayerActivity.showV2288SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288suspected
    FeaturePrefsStore.batch2281.v2288suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2288: suspended mode
internal fun PlayerActivity.showV2288SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288suspended
    FeaturePrefsStore.batch2281.v2288suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2288: sustained mode
internal fun PlayerActivity.showV2288SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288sustained
    FeaturePrefsStore.batch2281.v2288sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2288: swapped mode
internal fun PlayerActivity.showV2288SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288swapped
    FeaturePrefsStore.batch2281.v2288swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2288: switched level
internal fun PlayerActivity.showV2288SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2288switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2288switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2288: symbolized level
internal fun PlayerActivity.showV2288SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2288symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2288symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2288: synchronized level
internal fun PlayerActivity.showV2288SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2288synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2288synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2288: synthesized level
internal fun PlayerActivity.showV2288SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2288synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2288synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2288: systematized level
internal fun PlayerActivity.showV2288SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2288systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2288systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2288: tackled mode
internal fun PlayerActivity.showV2288TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2288tackled
    FeaturePrefsStore.batch2281.v2288tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2288: tailored mode
internal fun PlayerActivity.showV2288TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2288tailored
    FeaturePrefsStore.batch2281.v2288tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2288: targeted mode
internal fun PlayerActivity.showV2288TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288targeted
    FeaturePrefsStore.batch2281.v2288targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2288: tasked mode
internal fun PlayerActivity.showV2288TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288tasked
    FeaturePrefsStore.batch2281.v2288tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2288: terminated mode
internal fun PlayerActivity.showV2288TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2288terminated
    FeaturePrefsStore.batch2281.v2288terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2289: survived mode
internal fun PlayerActivity.showV2289SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289survived
    FeaturePrefsStore.batch2281.v2289survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2289: suspected mode
internal fun PlayerActivity.showV2289SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289suspected
    FeaturePrefsStore.batch2281.v2289suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2289: suspended mode
internal fun PlayerActivity.showV2289SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289suspended
    FeaturePrefsStore.batch2281.v2289suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2289: sustained mode
internal fun PlayerActivity.showV2289SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289sustained
    FeaturePrefsStore.batch2281.v2289sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2289: swapped mode
internal fun PlayerActivity.showV2289SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289swapped
    FeaturePrefsStore.batch2281.v2289swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2289: switched level
internal fun PlayerActivity.showV2289SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2289switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2289switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2289: symbolized level
internal fun PlayerActivity.showV2289SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2289symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2289symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2289: synchronized level
internal fun PlayerActivity.showV2289SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2289synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2289synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2289: synthesized level
internal fun PlayerActivity.showV2289SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2289synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2289synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2289: systematized level
internal fun PlayerActivity.showV2289SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2289systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2289systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2289: tackled mode
internal fun PlayerActivity.showV2289TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2289tackled
    FeaturePrefsStore.batch2281.v2289tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2289: tailored mode
internal fun PlayerActivity.showV2289TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2289tailored
    FeaturePrefsStore.batch2281.v2289tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2289: targeted mode
internal fun PlayerActivity.showV2289TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289targeted
    FeaturePrefsStore.batch2281.v2289targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2289: tasked mode
internal fun PlayerActivity.showV2289TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289tasked
    FeaturePrefsStore.batch2281.v2289tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2289: terminated mode
internal fun PlayerActivity.showV2289TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2289terminated
    FeaturePrefsStore.batch2281.v2289terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2290: survived mode
internal fun PlayerActivity.showV2290SurvivedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290survived
    FeaturePrefsStore.batch2281.v2290survived = !current
    AppToast.show(this, "survived: ${if (!current) "ON" else "OFF"}")
}

// v2290: suspected mode
internal fun PlayerActivity.showV2290SuspectedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290suspected
    FeaturePrefsStore.batch2281.v2290suspected = !current
    AppToast.show(this, "suspected: ${if (!current) "ON" else "OFF"}")
}

// v2290: suspended mode
internal fun PlayerActivity.showV2290SuspendedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290suspended
    FeaturePrefsStore.batch2281.v2290suspended = !current
    AppToast.show(this, "suspended: ${if (!current) "ON" else "OFF"}")
}

// v2290: sustained mode
internal fun PlayerActivity.showV2290SustainedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290sustained
    FeaturePrefsStore.batch2281.v2290sustained = !current
    AppToast.show(this, "sustained: ${if (!current) "ON" else "OFF"}")
}

// v2290: swapped mode
internal fun PlayerActivity.showV2290SwappedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290swapped
    FeaturePrefsStore.batch2281.v2290swapped = !current
    AppToast.show(this, "swapped: ${if (!current) "ON" else "OFF"}")
}

// v2290: switched level
internal fun PlayerActivity.showV2290SwitchedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2290switched).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "switched level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2290switched = value
        AppToast.show(this, "switched: $value")
    }
}

// v2290: symbolized level
internal fun PlayerActivity.showV2290SymbolizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2290symbolized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "symbolized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2290symbolized = value
        AppToast.show(this, "symbolized: $value")
    }
}

// v2290: synchronized level
internal fun PlayerActivity.showV2290SynchronizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2290synchronized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synchronized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2290synchronized = value
        AppToast.show(this, "synchronized: $value")
    }
}

// v2290: synthesized level
internal fun PlayerActivity.showV2290SynthesizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2290synthesized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "synthesized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2290synthesized = value
        AppToast.show(this, "synthesized: $value")
    }
}

// v2290: systematized level
internal fun PlayerActivity.showV2290SystematizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2281.v2290systematized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "systematized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2281.v2290systematized = value
        AppToast.show(this, "systematized: $value")
    }
}

// v2290: tackled mode
internal fun PlayerActivity.showV2290TackledToggle() {
    val current = FeaturePrefsStore.batch2281.v2290tackled
    FeaturePrefsStore.batch2281.v2290tackled = !current
    AppToast.show(this, "tackled: ${if (!current) "ON" else "OFF"}")
}

// v2290: tailored mode
internal fun PlayerActivity.showV2290TailoredToggle() {
    val current = FeaturePrefsStore.batch2281.v2290tailored
    FeaturePrefsStore.batch2281.v2290tailored = !current
    AppToast.show(this, "tailored: ${if (!current) "ON" else "OFF"}")
}

// v2290: targeted mode
internal fun PlayerActivity.showV2290TargetedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290targeted
    FeaturePrefsStore.batch2281.v2290targeted = !current
    AppToast.show(this, "targeted: ${if (!current) "ON" else "OFF"}")
}

// v2290: tasked mode
internal fun PlayerActivity.showV2290TaskedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290tasked
    FeaturePrefsStore.batch2281.v2290tasked = !current
    AppToast.show(this, "tasked: ${if (!current) "ON" else "OFF"}")
}

// v2290: terminated mode
internal fun PlayerActivity.showV2290TerminatedToggle() {
    val current = FeaturePrefsStore.batch2281.v2290terminated
    FeaturePrefsStore.batch2281.v2290terminated = !current
    AppToast.show(this, "terminated: ${if (!current) "ON" else "OFF"}")
}

// v2291: tested mode
internal fun PlayerActivity.showV2291TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291tested
    FeaturePrefsStore.batch2291.v2291tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2291: threatened mode
internal fun PlayerActivity.showV2291ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291threatened
    FeaturePrefsStore.batch2291.v2291threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2291: tightened mode
internal fun PlayerActivity.showV2291TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291tightened
    FeaturePrefsStore.batch2291.v2291tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2291: tolerated mode
internal fun PlayerActivity.showV2291ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291tolerated
    FeaturePrefsStore.batch2291.v2291tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2291: traced mode
internal fun PlayerActivity.showV2291TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291traced
    FeaturePrefsStore.batch2291.v2291traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2291: tracked level
internal fun PlayerActivity.showV2291TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2291: traded level
internal fun PlayerActivity.showV2291TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2291: trained level
internal fun PlayerActivity.showV2291TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2291: transferred level
internal fun PlayerActivity.showV2291TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2291: transformed level
internal fun PlayerActivity.showV2291TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2291transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2291transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2291: translated mode
internal fun PlayerActivity.showV2291TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291translated
    FeaturePrefsStore.batch2291.v2291translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2291: transmitted mode
internal fun PlayerActivity.showV2291TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291transmitted
    FeaturePrefsStore.batch2291.v2291transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2291: transported mode
internal fun PlayerActivity.showV2291TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291transported
    FeaturePrefsStore.batch2291.v2291transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2291: trapped mode
internal fun PlayerActivity.showV2291TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2291trapped
    FeaturePrefsStore.batch2291.v2291trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2291: traveled mode
internal fun PlayerActivity.showV2291TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2291traveled
    FeaturePrefsStore.batch2291.v2291traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2292: tested mode
internal fun PlayerActivity.showV2292TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292tested
    FeaturePrefsStore.batch2291.v2292tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2292: threatened mode
internal fun PlayerActivity.showV2292ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292threatened
    FeaturePrefsStore.batch2291.v2292threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2292: tightened mode
internal fun PlayerActivity.showV2292TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292tightened
    FeaturePrefsStore.batch2291.v2292tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2292: tolerated mode
internal fun PlayerActivity.showV2292ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292tolerated
    FeaturePrefsStore.batch2291.v2292tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2292: traced mode
internal fun PlayerActivity.showV2292TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292traced
    FeaturePrefsStore.batch2291.v2292traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2292: tracked level
internal fun PlayerActivity.showV2292TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2292: traded level
internal fun PlayerActivity.showV2292TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2292: trained level
internal fun PlayerActivity.showV2292TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2292: transferred level
internal fun PlayerActivity.showV2292TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2292: transformed level
internal fun PlayerActivity.showV2292TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2292transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2292transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2292: translated mode
internal fun PlayerActivity.showV2292TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292translated
    FeaturePrefsStore.batch2291.v2292translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2292: transmitted mode
internal fun PlayerActivity.showV2292TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292transmitted
    FeaturePrefsStore.batch2291.v2292transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2292: transported mode
internal fun PlayerActivity.showV2292TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292transported
    FeaturePrefsStore.batch2291.v2292transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2292: trapped mode
internal fun PlayerActivity.showV2292TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2292trapped
    FeaturePrefsStore.batch2291.v2292trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2292: traveled mode
internal fun PlayerActivity.showV2292TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2292traveled
    FeaturePrefsStore.batch2291.v2292traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2293: tested mode
internal fun PlayerActivity.showV2293TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293tested
    FeaturePrefsStore.batch2291.v2293tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2293: threatened mode
internal fun PlayerActivity.showV2293ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293threatened
    FeaturePrefsStore.batch2291.v2293threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2293: tightened mode
internal fun PlayerActivity.showV2293TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293tightened
    FeaturePrefsStore.batch2291.v2293tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2293: tolerated mode
internal fun PlayerActivity.showV2293ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293tolerated
    FeaturePrefsStore.batch2291.v2293tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2293: traced mode
internal fun PlayerActivity.showV2293TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293traced
    FeaturePrefsStore.batch2291.v2293traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2293: tracked level
internal fun PlayerActivity.showV2293TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2293: traded level
internal fun PlayerActivity.showV2293TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2293: trained level
internal fun PlayerActivity.showV2293TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2293: transferred level
internal fun PlayerActivity.showV2293TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2293: transformed level
internal fun PlayerActivity.showV2293TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2293transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2293transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2293: translated mode
internal fun PlayerActivity.showV2293TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293translated
    FeaturePrefsStore.batch2291.v2293translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2293: transmitted mode
internal fun PlayerActivity.showV2293TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293transmitted
    FeaturePrefsStore.batch2291.v2293transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2293: transported mode
internal fun PlayerActivity.showV2293TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293transported
    FeaturePrefsStore.batch2291.v2293transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2293: trapped mode
internal fun PlayerActivity.showV2293TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2293trapped
    FeaturePrefsStore.batch2291.v2293trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2293: traveled mode
internal fun PlayerActivity.showV2293TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2293traveled
    FeaturePrefsStore.batch2291.v2293traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2294: tested mode
internal fun PlayerActivity.showV2294TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294tested
    FeaturePrefsStore.batch2291.v2294tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2294: threatened mode
internal fun PlayerActivity.showV2294ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294threatened
    FeaturePrefsStore.batch2291.v2294threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2294: tightened mode
internal fun PlayerActivity.showV2294TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294tightened
    FeaturePrefsStore.batch2291.v2294tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2294: tolerated mode
internal fun PlayerActivity.showV2294ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294tolerated
    FeaturePrefsStore.batch2291.v2294tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2294: traced mode
internal fun PlayerActivity.showV2294TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294traced
    FeaturePrefsStore.batch2291.v2294traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2294: tracked level
internal fun PlayerActivity.showV2294TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2294: traded level
internal fun PlayerActivity.showV2294TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2294: trained level
internal fun PlayerActivity.showV2294TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2294: transferred level
internal fun PlayerActivity.showV2294TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2294: transformed level
internal fun PlayerActivity.showV2294TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2294transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2294transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2294: translated mode
internal fun PlayerActivity.showV2294TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294translated
    FeaturePrefsStore.batch2291.v2294translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2294: transmitted mode
internal fun PlayerActivity.showV2294TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294transmitted
    FeaturePrefsStore.batch2291.v2294transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2294: transported mode
internal fun PlayerActivity.showV2294TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294transported
    FeaturePrefsStore.batch2291.v2294transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2294: trapped mode
internal fun PlayerActivity.showV2294TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2294trapped
    FeaturePrefsStore.batch2291.v2294trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2294: traveled mode
internal fun PlayerActivity.showV2294TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2294traveled
    FeaturePrefsStore.batch2291.v2294traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2295: tested mode
internal fun PlayerActivity.showV2295TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295tested
    FeaturePrefsStore.batch2291.v2295tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2295: threatened mode
internal fun PlayerActivity.showV2295ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295threatened
    FeaturePrefsStore.batch2291.v2295threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2295: tightened mode
internal fun PlayerActivity.showV2295TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295tightened
    FeaturePrefsStore.batch2291.v2295tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2295: tolerated mode
internal fun PlayerActivity.showV2295ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295tolerated
    FeaturePrefsStore.batch2291.v2295tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2295: traced mode
internal fun PlayerActivity.showV2295TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295traced
    FeaturePrefsStore.batch2291.v2295traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2295: tracked level
internal fun PlayerActivity.showV2295TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2295: traded level
internal fun PlayerActivity.showV2295TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2295: trained level
internal fun PlayerActivity.showV2295TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2295: transferred level
internal fun PlayerActivity.showV2295TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2295: transformed level
internal fun PlayerActivity.showV2295TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2295transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2295transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2295: translated mode
internal fun PlayerActivity.showV2295TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295translated
    FeaturePrefsStore.batch2291.v2295translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2295: transmitted mode
internal fun PlayerActivity.showV2295TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295transmitted
    FeaturePrefsStore.batch2291.v2295transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2295: transported mode
internal fun PlayerActivity.showV2295TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295transported
    FeaturePrefsStore.batch2291.v2295transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2295: trapped mode
internal fun PlayerActivity.showV2295TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2295trapped
    FeaturePrefsStore.batch2291.v2295trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2295: traveled mode
internal fun PlayerActivity.showV2295TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2295traveled
    FeaturePrefsStore.batch2291.v2295traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2296: tested mode
internal fun PlayerActivity.showV2296TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296tested
    FeaturePrefsStore.batch2291.v2296tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2296: threatened mode
internal fun PlayerActivity.showV2296ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296threatened
    FeaturePrefsStore.batch2291.v2296threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2296: tightened mode
internal fun PlayerActivity.showV2296TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296tightened
    FeaturePrefsStore.batch2291.v2296tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2296: tolerated mode
internal fun PlayerActivity.showV2296ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296tolerated
    FeaturePrefsStore.batch2291.v2296tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2296: traced mode
internal fun PlayerActivity.showV2296TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296traced
    FeaturePrefsStore.batch2291.v2296traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2296: tracked level
internal fun PlayerActivity.showV2296TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2296: traded level
internal fun PlayerActivity.showV2296TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2296: trained level
internal fun PlayerActivity.showV2296TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2296: transferred level
internal fun PlayerActivity.showV2296TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2296: transformed level
internal fun PlayerActivity.showV2296TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2296transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2296transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2296: translated mode
internal fun PlayerActivity.showV2296TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296translated
    FeaturePrefsStore.batch2291.v2296translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2296: transmitted mode
internal fun PlayerActivity.showV2296TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296transmitted
    FeaturePrefsStore.batch2291.v2296transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2296: transported mode
internal fun PlayerActivity.showV2296TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296transported
    FeaturePrefsStore.batch2291.v2296transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2296: trapped mode
internal fun PlayerActivity.showV2296TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2296trapped
    FeaturePrefsStore.batch2291.v2296trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2296: traveled mode
internal fun PlayerActivity.showV2296TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2296traveled
    FeaturePrefsStore.batch2291.v2296traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2297: tested mode
internal fun PlayerActivity.showV2297TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297tested
    FeaturePrefsStore.batch2291.v2297tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2297: threatened mode
internal fun PlayerActivity.showV2297ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297threatened
    FeaturePrefsStore.batch2291.v2297threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2297: tightened mode
internal fun PlayerActivity.showV2297TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297tightened
    FeaturePrefsStore.batch2291.v2297tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2297: tolerated mode
internal fun PlayerActivity.showV2297ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297tolerated
    FeaturePrefsStore.batch2291.v2297tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2297: traced mode
internal fun PlayerActivity.showV2297TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297traced
    FeaturePrefsStore.batch2291.v2297traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2297: tracked level
internal fun PlayerActivity.showV2297TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2297: traded level
internal fun PlayerActivity.showV2297TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2297: trained level
internal fun PlayerActivity.showV2297TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2297: transferred level
internal fun PlayerActivity.showV2297TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2297: transformed level
internal fun PlayerActivity.showV2297TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2297transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2297transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2297: translated mode
internal fun PlayerActivity.showV2297TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297translated
    FeaturePrefsStore.batch2291.v2297translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2297: transmitted mode
internal fun PlayerActivity.showV2297TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297transmitted
    FeaturePrefsStore.batch2291.v2297transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2297: transported mode
internal fun PlayerActivity.showV2297TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297transported
    FeaturePrefsStore.batch2291.v2297transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2297: trapped mode
internal fun PlayerActivity.showV2297TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2297trapped
    FeaturePrefsStore.batch2291.v2297trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2297: traveled mode
internal fun PlayerActivity.showV2297TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2297traveled
    FeaturePrefsStore.batch2291.v2297traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2298: tested mode
internal fun PlayerActivity.showV2298TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298tested
    FeaturePrefsStore.batch2291.v2298tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2298: threatened mode
internal fun PlayerActivity.showV2298ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298threatened
    FeaturePrefsStore.batch2291.v2298threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2298: tightened mode
internal fun PlayerActivity.showV2298TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298tightened
    FeaturePrefsStore.batch2291.v2298tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2298: tolerated mode
internal fun PlayerActivity.showV2298ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298tolerated
    FeaturePrefsStore.batch2291.v2298tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2298: traced mode
internal fun PlayerActivity.showV2298TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298traced
    FeaturePrefsStore.batch2291.v2298traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2298: tracked level
internal fun PlayerActivity.showV2298TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2298: traded level
internal fun PlayerActivity.showV2298TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2298: trained level
internal fun PlayerActivity.showV2298TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2298: transferred level
internal fun PlayerActivity.showV2298TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2298: transformed level
internal fun PlayerActivity.showV2298TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2298transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2298transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2298: translated mode
internal fun PlayerActivity.showV2298TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298translated
    FeaturePrefsStore.batch2291.v2298translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2298: transmitted mode
internal fun PlayerActivity.showV2298TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298transmitted
    FeaturePrefsStore.batch2291.v2298transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2298: transported mode
internal fun PlayerActivity.showV2298TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298transported
    FeaturePrefsStore.batch2291.v2298transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2298: trapped mode
internal fun PlayerActivity.showV2298TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2298trapped
    FeaturePrefsStore.batch2291.v2298trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2298: traveled mode
internal fun PlayerActivity.showV2298TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2298traveled
    FeaturePrefsStore.batch2291.v2298traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2299: tested mode
internal fun PlayerActivity.showV2299TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299tested
    FeaturePrefsStore.batch2291.v2299tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2299: threatened mode
internal fun PlayerActivity.showV2299ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299threatened
    FeaturePrefsStore.batch2291.v2299threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2299: tightened mode
internal fun PlayerActivity.showV2299TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299tightened
    FeaturePrefsStore.batch2291.v2299tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2299: tolerated mode
internal fun PlayerActivity.showV2299ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299tolerated
    FeaturePrefsStore.batch2291.v2299tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2299: traced mode
internal fun PlayerActivity.showV2299TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299traced
    FeaturePrefsStore.batch2291.v2299traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2299: tracked level
internal fun PlayerActivity.showV2299TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2299: traded level
internal fun PlayerActivity.showV2299TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2299: trained level
internal fun PlayerActivity.showV2299TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2299: transferred level
internal fun PlayerActivity.showV2299TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2299: transformed level
internal fun PlayerActivity.showV2299TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2299transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2299transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2299: translated mode
internal fun PlayerActivity.showV2299TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299translated
    FeaturePrefsStore.batch2291.v2299translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2299: transmitted mode
internal fun PlayerActivity.showV2299TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299transmitted
    FeaturePrefsStore.batch2291.v2299transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2299: transported mode
internal fun PlayerActivity.showV2299TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299transported
    FeaturePrefsStore.batch2291.v2299transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2299: trapped mode
internal fun PlayerActivity.showV2299TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2299trapped
    FeaturePrefsStore.batch2291.v2299trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2299: traveled mode
internal fun PlayerActivity.showV2299TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2299traveled
    FeaturePrefsStore.batch2291.v2299traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2300: tested mode
internal fun PlayerActivity.showV2300TestedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300tested
    FeaturePrefsStore.batch2291.v2300tested = !current
    AppToast.show(this, "tested: ${if (!current) "ON" else "OFF"}")
}

// v2300: threatened mode
internal fun PlayerActivity.showV2300ThreatenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300threatened
    FeaturePrefsStore.batch2291.v2300threatened = !current
    AppToast.show(this, "threatened: ${if (!current) "ON" else "OFF"}")
}

// v2300: tightened mode
internal fun PlayerActivity.showV2300TightenedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300tightened
    FeaturePrefsStore.batch2291.v2300tightened = !current
    AppToast.show(this, "tightened: ${if (!current) "ON" else "OFF"}")
}

// v2300: tolerated mode
internal fun PlayerActivity.showV2300ToleratedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300tolerated
    FeaturePrefsStore.batch2291.v2300tolerated = !current
    AppToast.show(this, "tolerated: ${if (!current) "ON" else "OFF"}")
}

// v2300: traced mode
internal fun PlayerActivity.showV2300TracedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300traced
    FeaturePrefsStore.batch2291.v2300traced = !current
    AppToast.show(this, "traced: ${if (!current) "ON" else "OFF"}")
}

// v2300: tracked level
internal fun PlayerActivity.showV2300TrackedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300tracked).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tracked level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300tracked = value
        AppToast.show(this, "tracked: $value")
    }
}

// v2300: traded level
internal fun PlayerActivity.showV2300TradedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300traded).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "traded level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300traded = value
        AppToast.show(this, "traded: $value")
    }
}

// v2300: trained level
internal fun PlayerActivity.showV2300TrainedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300trained).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "trained level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300trained = value
        AppToast.show(this, "trained: $value")
    }
}

// v2300: transferred level
internal fun PlayerActivity.showV2300TransferredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300transferred).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transferred level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300transferred = value
        AppToast.show(this, "transferred: $value")
    }
}

// v2300: transformed level
internal fun PlayerActivity.showV2300TransformedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2291.v2300transformed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "transformed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2291.v2300transformed = value
        AppToast.show(this, "transformed: $value")
    }
}

// v2300: translated mode
internal fun PlayerActivity.showV2300TranslatedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300translated
    FeaturePrefsStore.batch2291.v2300translated = !current
    AppToast.show(this, "translated: ${if (!current) "ON" else "OFF"}")
}

// v2300: transmitted mode
internal fun PlayerActivity.showV2300TransmittedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300transmitted
    FeaturePrefsStore.batch2291.v2300transmitted = !current
    AppToast.show(this, "transmitted: ${if (!current) "ON" else "OFF"}")
}

// v2300: transported mode
internal fun PlayerActivity.showV2300TransportedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300transported
    FeaturePrefsStore.batch2291.v2300transported = !current
    AppToast.show(this, "transported: ${if (!current) "ON" else "OFF"}")
}

// v2300: trapped mode
internal fun PlayerActivity.showV2300TrappedToggle() {
    val current = FeaturePrefsStore.batch2291.v2300trapped
    FeaturePrefsStore.batch2291.v2300trapped = !current
    AppToast.show(this, "trapped: ${if (!current) "ON" else "OFF"}")
}

// v2300: traveled mode
internal fun PlayerActivity.showV2300TraveledToggle() {
    val current = FeaturePrefsStore.batch2291.v2300traveled
    FeaturePrefsStore.batch2291.v2300traveled = !current
    AppToast.show(this, "traveled: ${if (!current) "ON" else "OFF"}")
}

// v2301: treated mode
internal fun PlayerActivity.showV2301TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301treated
    FeaturePrefsStore.batch2301.v2301treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2301: triggered mode
internal fun PlayerActivity.showV2301TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2301triggered
    FeaturePrefsStore.batch2301.v2301triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2301: trimmed mode
internal fun PlayerActivity.showV2301TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301trimmed
    FeaturePrefsStore.batch2301.v2301trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2301: troubleshooted mode
internal fun PlayerActivity.showV2301TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301troubleshooted
    FeaturePrefsStore.batch2301.v2301troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2301: trusted mode
internal fun PlayerActivity.showV2301TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301trusted
    FeaturePrefsStore.batch2301.v2301trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2301: tuned level
internal fun PlayerActivity.showV2301TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2301: turned level
internal fun PlayerActivity.showV2301TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2301: twisted level
internal fun PlayerActivity.showV2301TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2301: uncovered level
internal fun PlayerActivity.showV2301UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2301: undergone level
internal fun PlayerActivity.showV2301UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2301undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2301undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2301: underlined mode
internal fun PlayerActivity.showV2301UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301underlined
    FeaturePrefsStore.batch2301.v2301underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2301: understood mode
internal fun PlayerActivity.showV2301UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2301understood
    FeaturePrefsStore.batch2301.v2301understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2301: undertaken mode
internal fun PlayerActivity.showV2301UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2301undertaken
    FeaturePrefsStore.batch2301.v2301undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2301: unified mode
internal fun PlayerActivity.showV2301UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301unified
    FeaturePrefsStore.batch2301.v2301unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2301: updated mode
internal fun PlayerActivity.showV2301UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2301updated
    FeaturePrefsStore.batch2301.v2301updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2302: treated mode
internal fun PlayerActivity.showV2302TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302treated
    FeaturePrefsStore.batch2301.v2302treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2302: triggered mode
internal fun PlayerActivity.showV2302TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2302triggered
    FeaturePrefsStore.batch2301.v2302triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2302: trimmed mode
internal fun PlayerActivity.showV2302TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302trimmed
    FeaturePrefsStore.batch2301.v2302trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2302: troubleshooted mode
internal fun PlayerActivity.showV2302TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302troubleshooted
    FeaturePrefsStore.batch2301.v2302troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2302: trusted mode
internal fun PlayerActivity.showV2302TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302trusted
    FeaturePrefsStore.batch2301.v2302trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2302: tuned level
internal fun PlayerActivity.showV2302TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2302: turned level
internal fun PlayerActivity.showV2302TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2302: twisted level
internal fun PlayerActivity.showV2302TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2302: uncovered level
internal fun PlayerActivity.showV2302UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2302: undergone level
internal fun PlayerActivity.showV2302UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2302undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2302undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2302: underlined mode
internal fun PlayerActivity.showV2302UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302underlined
    FeaturePrefsStore.batch2301.v2302underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2302: understood mode
internal fun PlayerActivity.showV2302UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2302understood
    FeaturePrefsStore.batch2301.v2302understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2302: undertaken mode
internal fun PlayerActivity.showV2302UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2302undertaken
    FeaturePrefsStore.batch2301.v2302undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2302: unified mode
internal fun PlayerActivity.showV2302UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302unified
    FeaturePrefsStore.batch2301.v2302unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2302: updated mode
internal fun PlayerActivity.showV2302UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2302updated
    FeaturePrefsStore.batch2301.v2302updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2303: treated mode
internal fun PlayerActivity.showV2303TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303treated
    FeaturePrefsStore.batch2301.v2303treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2303: triggered mode
internal fun PlayerActivity.showV2303TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2303triggered
    FeaturePrefsStore.batch2301.v2303triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2303: trimmed mode
internal fun PlayerActivity.showV2303TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303trimmed
    FeaturePrefsStore.batch2301.v2303trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2303: troubleshooted mode
internal fun PlayerActivity.showV2303TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303troubleshooted
    FeaturePrefsStore.batch2301.v2303troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2303: trusted mode
internal fun PlayerActivity.showV2303TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303trusted
    FeaturePrefsStore.batch2301.v2303trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2303: tuned level
internal fun PlayerActivity.showV2303TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2303: turned level
internal fun PlayerActivity.showV2303TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2303: twisted level
internal fun PlayerActivity.showV2303TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2303: uncovered level
internal fun PlayerActivity.showV2303UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2303: undergone level
internal fun PlayerActivity.showV2303UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2303undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2303undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2303: underlined mode
internal fun PlayerActivity.showV2303UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303underlined
    FeaturePrefsStore.batch2301.v2303underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2303: understood mode
internal fun PlayerActivity.showV2303UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2303understood
    FeaturePrefsStore.batch2301.v2303understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2303: undertaken mode
internal fun PlayerActivity.showV2303UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2303undertaken
    FeaturePrefsStore.batch2301.v2303undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2303: unified mode
internal fun PlayerActivity.showV2303UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303unified
    FeaturePrefsStore.batch2301.v2303unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2303: updated mode
internal fun PlayerActivity.showV2303UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2303updated
    FeaturePrefsStore.batch2301.v2303updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2304: treated mode
internal fun PlayerActivity.showV2304TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304treated
    FeaturePrefsStore.batch2301.v2304treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2304: triggered mode
internal fun PlayerActivity.showV2304TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2304triggered
    FeaturePrefsStore.batch2301.v2304triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2304: trimmed mode
internal fun PlayerActivity.showV2304TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304trimmed
    FeaturePrefsStore.batch2301.v2304trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2304: troubleshooted mode
internal fun PlayerActivity.showV2304TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304troubleshooted
    FeaturePrefsStore.batch2301.v2304troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2304: trusted mode
internal fun PlayerActivity.showV2304TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304trusted
    FeaturePrefsStore.batch2301.v2304trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2304: tuned level
internal fun PlayerActivity.showV2304TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2304: turned level
internal fun PlayerActivity.showV2304TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2304: twisted level
internal fun PlayerActivity.showV2304TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2304: uncovered level
internal fun PlayerActivity.showV2304UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2304: undergone level
internal fun PlayerActivity.showV2304UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2304undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2304undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2304: underlined mode
internal fun PlayerActivity.showV2304UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304underlined
    FeaturePrefsStore.batch2301.v2304underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2304: understood mode
internal fun PlayerActivity.showV2304UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2304understood
    FeaturePrefsStore.batch2301.v2304understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2304: undertaken mode
internal fun PlayerActivity.showV2304UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2304undertaken
    FeaturePrefsStore.batch2301.v2304undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2304: unified mode
internal fun PlayerActivity.showV2304UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304unified
    FeaturePrefsStore.batch2301.v2304unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2304: updated mode
internal fun PlayerActivity.showV2304UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2304updated
    FeaturePrefsStore.batch2301.v2304updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2305: treated mode
internal fun PlayerActivity.showV2305TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305treated
    FeaturePrefsStore.batch2301.v2305treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2305: triggered mode
internal fun PlayerActivity.showV2305TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2305triggered
    FeaturePrefsStore.batch2301.v2305triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2305: trimmed mode
internal fun PlayerActivity.showV2305TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305trimmed
    FeaturePrefsStore.batch2301.v2305trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2305: troubleshooted mode
internal fun PlayerActivity.showV2305TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305troubleshooted
    FeaturePrefsStore.batch2301.v2305troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2305: trusted mode
internal fun PlayerActivity.showV2305TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305trusted
    FeaturePrefsStore.batch2301.v2305trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2305: tuned level
internal fun PlayerActivity.showV2305TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2305: turned level
internal fun PlayerActivity.showV2305TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2305: twisted level
internal fun PlayerActivity.showV2305TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2305: uncovered level
internal fun PlayerActivity.showV2305UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2305: undergone level
internal fun PlayerActivity.showV2305UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2305undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2305undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2305: underlined mode
internal fun PlayerActivity.showV2305UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305underlined
    FeaturePrefsStore.batch2301.v2305underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2305: understood mode
internal fun PlayerActivity.showV2305UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2305understood
    FeaturePrefsStore.batch2301.v2305understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2305: undertaken mode
internal fun PlayerActivity.showV2305UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2305undertaken
    FeaturePrefsStore.batch2301.v2305undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2305: unified mode
internal fun PlayerActivity.showV2305UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305unified
    FeaturePrefsStore.batch2301.v2305unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2305: updated mode
internal fun PlayerActivity.showV2305UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2305updated
    FeaturePrefsStore.batch2301.v2305updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2306: treated mode
internal fun PlayerActivity.showV2306TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306treated
    FeaturePrefsStore.batch2301.v2306treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2306: triggered mode
internal fun PlayerActivity.showV2306TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2306triggered
    FeaturePrefsStore.batch2301.v2306triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2306: trimmed mode
internal fun PlayerActivity.showV2306TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306trimmed
    FeaturePrefsStore.batch2301.v2306trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2306: troubleshooted mode
internal fun PlayerActivity.showV2306TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306troubleshooted
    FeaturePrefsStore.batch2301.v2306troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2306: trusted mode
internal fun PlayerActivity.showV2306TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306trusted
    FeaturePrefsStore.batch2301.v2306trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2306: tuned level
internal fun PlayerActivity.showV2306TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2306: turned level
internal fun PlayerActivity.showV2306TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2306: twisted level
internal fun PlayerActivity.showV2306TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2306: uncovered level
internal fun PlayerActivity.showV2306UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2306: undergone level
internal fun PlayerActivity.showV2306UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2306undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2306undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2306: underlined mode
internal fun PlayerActivity.showV2306UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306underlined
    FeaturePrefsStore.batch2301.v2306underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2306: understood mode
internal fun PlayerActivity.showV2306UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2306understood
    FeaturePrefsStore.batch2301.v2306understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2306: undertaken mode
internal fun PlayerActivity.showV2306UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2306undertaken
    FeaturePrefsStore.batch2301.v2306undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2306: unified mode
internal fun PlayerActivity.showV2306UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306unified
    FeaturePrefsStore.batch2301.v2306unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2306: updated mode
internal fun PlayerActivity.showV2306UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2306updated
    FeaturePrefsStore.batch2301.v2306updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2307: treated mode
internal fun PlayerActivity.showV2307TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307treated
    FeaturePrefsStore.batch2301.v2307treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2307: triggered mode
internal fun PlayerActivity.showV2307TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2307triggered
    FeaturePrefsStore.batch2301.v2307triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2307: trimmed mode
internal fun PlayerActivity.showV2307TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307trimmed
    FeaturePrefsStore.batch2301.v2307trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2307: troubleshooted mode
internal fun PlayerActivity.showV2307TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307troubleshooted
    FeaturePrefsStore.batch2301.v2307troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2307: trusted mode
internal fun PlayerActivity.showV2307TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307trusted
    FeaturePrefsStore.batch2301.v2307trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2307: tuned level
internal fun PlayerActivity.showV2307TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2307: turned level
internal fun PlayerActivity.showV2307TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2307: twisted level
internal fun PlayerActivity.showV2307TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2307: uncovered level
internal fun PlayerActivity.showV2307UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2307: undergone level
internal fun PlayerActivity.showV2307UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2307undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2307undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2307: underlined mode
internal fun PlayerActivity.showV2307UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307underlined
    FeaturePrefsStore.batch2301.v2307underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2307: understood mode
internal fun PlayerActivity.showV2307UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2307understood
    FeaturePrefsStore.batch2301.v2307understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2307: undertaken mode
internal fun PlayerActivity.showV2307UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2307undertaken
    FeaturePrefsStore.batch2301.v2307undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2307: unified mode
internal fun PlayerActivity.showV2307UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307unified
    FeaturePrefsStore.batch2301.v2307unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2307: updated mode
internal fun PlayerActivity.showV2307UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2307updated
    FeaturePrefsStore.batch2301.v2307updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2308: treated mode
internal fun PlayerActivity.showV2308TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308treated
    FeaturePrefsStore.batch2301.v2308treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2308: triggered mode
internal fun PlayerActivity.showV2308TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2308triggered
    FeaturePrefsStore.batch2301.v2308triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2308: trimmed mode
internal fun PlayerActivity.showV2308TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308trimmed
    FeaturePrefsStore.batch2301.v2308trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2308: troubleshooted mode
internal fun PlayerActivity.showV2308TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308troubleshooted
    FeaturePrefsStore.batch2301.v2308troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2308: trusted mode
internal fun PlayerActivity.showV2308TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308trusted
    FeaturePrefsStore.batch2301.v2308trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2308: tuned level
internal fun PlayerActivity.showV2308TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2308: turned level
internal fun PlayerActivity.showV2308TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2308: twisted level
internal fun PlayerActivity.showV2308TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2308: uncovered level
internal fun PlayerActivity.showV2308UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2308: undergone level
internal fun PlayerActivity.showV2308UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2308undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2308undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2308: underlined mode
internal fun PlayerActivity.showV2308UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308underlined
    FeaturePrefsStore.batch2301.v2308underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2308: understood mode
internal fun PlayerActivity.showV2308UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2308understood
    FeaturePrefsStore.batch2301.v2308understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2308: undertaken mode
internal fun PlayerActivity.showV2308UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2308undertaken
    FeaturePrefsStore.batch2301.v2308undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2308: unified mode
internal fun PlayerActivity.showV2308UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308unified
    FeaturePrefsStore.batch2301.v2308unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2308: updated mode
internal fun PlayerActivity.showV2308UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2308updated
    FeaturePrefsStore.batch2301.v2308updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2309: treated mode
internal fun PlayerActivity.showV2309TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309treated
    FeaturePrefsStore.batch2301.v2309treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2309: triggered mode
internal fun PlayerActivity.showV2309TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2309triggered
    FeaturePrefsStore.batch2301.v2309triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2309: trimmed mode
internal fun PlayerActivity.showV2309TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309trimmed
    FeaturePrefsStore.batch2301.v2309trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2309: troubleshooted mode
internal fun PlayerActivity.showV2309TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309troubleshooted
    FeaturePrefsStore.batch2301.v2309troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2309: trusted mode
internal fun PlayerActivity.showV2309TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309trusted
    FeaturePrefsStore.batch2301.v2309trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2309: tuned level
internal fun PlayerActivity.showV2309TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2309: turned level
internal fun PlayerActivity.showV2309TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2309: twisted level
internal fun PlayerActivity.showV2309TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2309: uncovered level
internal fun PlayerActivity.showV2309UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2309: undergone level
internal fun PlayerActivity.showV2309UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2309undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2309undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2309: underlined mode
internal fun PlayerActivity.showV2309UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309underlined
    FeaturePrefsStore.batch2301.v2309underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2309: understood mode
internal fun PlayerActivity.showV2309UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2309understood
    FeaturePrefsStore.batch2301.v2309understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2309: undertaken mode
internal fun PlayerActivity.showV2309UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2309undertaken
    FeaturePrefsStore.batch2301.v2309undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2309: unified mode
internal fun PlayerActivity.showV2309UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309unified
    FeaturePrefsStore.batch2301.v2309unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2309: updated mode
internal fun PlayerActivity.showV2309UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2309updated
    FeaturePrefsStore.batch2301.v2309updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2310: treated mode
internal fun PlayerActivity.showV2310TreatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310treated
    FeaturePrefsStore.batch2301.v2310treated = !current
    AppToast.show(this, "treated: ${if (!current) "ON" else "OFF"}")
}

// v2310: triggered mode
internal fun PlayerActivity.showV2310TriggeredToggle() {
    val current = FeaturePrefsStore.batch2301.v2310triggered
    FeaturePrefsStore.batch2301.v2310triggered = !current
    AppToast.show(this, "triggered: ${if (!current) "ON" else "OFF"}")
}

// v2310: trimmed mode
internal fun PlayerActivity.showV2310TrimmedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310trimmed
    FeaturePrefsStore.batch2301.v2310trimmed = !current
    AppToast.show(this, "trimmed: ${if (!current) "ON" else "OFF"}")
}

// v2310: troubleshooted mode
internal fun PlayerActivity.showV2310TroubleshootedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310troubleshooted
    FeaturePrefsStore.batch2301.v2310troubleshooted = !current
    AppToast.show(this, "troubleshooted: ${if (!current) "ON" else "OFF"}")
}

// v2310: trusted mode
internal fun PlayerActivity.showV2310TrustedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310trusted
    FeaturePrefsStore.batch2301.v2310trusted = !current
    AppToast.show(this, "trusted: ${if (!current) "ON" else "OFF"}")
}

// v2310: tuned level
internal fun PlayerActivity.showV2310TunedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310tuned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "tuned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310tuned = value
        AppToast.show(this, "tuned: $value")
    }
}

// v2310: turned level
internal fun PlayerActivity.showV2310TurnedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310turned).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "turned level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310turned = value
        AppToast.show(this, "turned: $value")
    }
}

// v2310: twisted level
internal fun PlayerActivity.showV2310TwistedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310twisted).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "twisted level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310twisted = value
        AppToast.show(this, "twisted: $value")
    }
}

// v2310: uncovered level
internal fun PlayerActivity.showV2310UncoveredDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310uncovered).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "uncovered level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310uncovered = value
        AppToast.show(this, "uncovered: $value")
    }
}

// v2310: undergone level
internal fun PlayerActivity.showV2310UndergoneDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2301.v2310undergone).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "undergone level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2301.v2310undergone = value
        AppToast.show(this, "undergone: $value")
    }
}

// v2310: underlined mode
internal fun PlayerActivity.showV2310UnderlinedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310underlined
    FeaturePrefsStore.batch2301.v2310underlined = !current
    AppToast.show(this, "underlined: ${if (!current) "ON" else "OFF"}")
}

// v2310: understood mode
internal fun PlayerActivity.showV2310UnderstoodToggle() {
    val current = FeaturePrefsStore.batch2301.v2310understood
    FeaturePrefsStore.batch2301.v2310understood = !current
    AppToast.show(this, "understood: ${if (!current) "ON" else "OFF"}")
}

// v2310: undertaken mode
internal fun PlayerActivity.showV2310UndertakenToggle() {
    val current = FeaturePrefsStore.batch2301.v2310undertaken
    FeaturePrefsStore.batch2301.v2310undertaken = !current
    AppToast.show(this, "undertaken: ${if (!current) "ON" else "OFF"}")
}

// v2310: unified mode
internal fun PlayerActivity.showV2310UnifiedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310unified
    FeaturePrefsStore.batch2301.v2310unified = !current
    AppToast.show(this, "unified: ${if (!current) "ON" else "OFF"}")
}

// v2310: updated mode
internal fun PlayerActivity.showV2310UpdatedToggle() {
    val current = FeaturePrefsStore.batch2301.v2310updated
    FeaturePrefsStore.batch2301.v2310updated = !current
    AppToast.show(this, "updated: ${if (!current) "ON" else "OFF"}")
}

// v2311: upgraded mode
internal fun PlayerActivity.showV2311UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311upgraded
    FeaturePrefsStore.batch2311.v2311upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2311: utilized mode
internal fun PlayerActivity.showV2311UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311utilized
    FeaturePrefsStore.batch2311.v2311utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2311: validated mode
internal fun PlayerActivity.showV2311ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311validated
    FeaturePrefsStore.batch2311.v2311validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2311: valued mode
internal fun PlayerActivity.showV2311ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311valued
    FeaturePrefsStore.batch2311.v2311valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2311: varied mode
internal fun PlayerActivity.showV2311VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311varied
    FeaturePrefsStore.batch2311.v2311varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2311: verified level
internal fun PlayerActivity.showV2311VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2311: viewed level
internal fun PlayerActivity.showV2311ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2311: violated level
internal fun PlayerActivity.showV2311ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2311: visited level
internal fun PlayerActivity.showV2311VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2311: visualized level
internal fun PlayerActivity.showV2311VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2311visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2311visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2311: voiced mode
internal fun PlayerActivity.showV2311VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311voiced
    FeaturePrefsStore.batch2311.v2311voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2311: volunteered mode
internal fun PlayerActivity.showV2311VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2311volunteered
    FeaturePrefsStore.batch2311.v2311volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2311: wandered mode
internal fun PlayerActivity.showV2311WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311wandered
    FeaturePrefsStore.batch2311.v2311wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2311: warmed mode
internal fun PlayerActivity.showV2311WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311warmed
    FeaturePrefsStore.batch2311.v2311warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2311: warned mode
internal fun PlayerActivity.showV2311WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2311warned
    FeaturePrefsStore.batch2311.v2311warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2312: upgraded mode
internal fun PlayerActivity.showV2312UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312upgraded
    FeaturePrefsStore.batch2311.v2312upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2312: utilized mode
internal fun PlayerActivity.showV2312UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312utilized
    FeaturePrefsStore.batch2311.v2312utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2312: validated mode
internal fun PlayerActivity.showV2312ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312validated
    FeaturePrefsStore.batch2311.v2312validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2312: valued mode
internal fun PlayerActivity.showV2312ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312valued
    FeaturePrefsStore.batch2311.v2312valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2312: varied mode
internal fun PlayerActivity.showV2312VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312varied
    FeaturePrefsStore.batch2311.v2312varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2312: verified level
internal fun PlayerActivity.showV2312VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2312: viewed level
internal fun PlayerActivity.showV2312ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2312: violated level
internal fun PlayerActivity.showV2312ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2312: visited level
internal fun PlayerActivity.showV2312VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2312: visualized level
internal fun PlayerActivity.showV2312VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2312visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2312visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2312: voiced mode
internal fun PlayerActivity.showV2312VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312voiced
    FeaturePrefsStore.batch2311.v2312voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2312: volunteered mode
internal fun PlayerActivity.showV2312VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2312volunteered
    FeaturePrefsStore.batch2311.v2312volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2312: wandered mode
internal fun PlayerActivity.showV2312WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312wandered
    FeaturePrefsStore.batch2311.v2312wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2312: warmed mode
internal fun PlayerActivity.showV2312WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312warmed
    FeaturePrefsStore.batch2311.v2312warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2312: warned mode
internal fun PlayerActivity.showV2312WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2312warned
    FeaturePrefsStore.batch2311.v2312warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2313: upgraded mode
internal fun PlayerActivity.showV2313UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313upgraded
    FeaturePrefsStore.batch2311.v2313upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2313: utilized mode
internal fun PlayerActivity.showV2313UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313utilized
    FeaturePrefsStore.batch2311.v2313utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2313: validated mode
internal fun PlayerActivity.showV2313ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313validated
    FeaturePrefsStore.batch2311.v2313validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2313: valued mode
internal fun PlayerActivity.showV2313ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313valued
    FeaturePrefsStore.batch2311.v2313valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2313: varied mode
internal fun PlayerActivity.showV2313VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313varied
    FeaturePrefsStore.batch2311.v2313varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2313: verified level
internal fun PlayerActivity.showV2313VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2313: viewed level
internal fun PlayerActivity.showV2313ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2313: violated level
internal fun PlayerActivity.showV2313ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2313: visited level
internal fun PlayerActivity.showV2313VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2313: visualized level
internal fun PlayerActivity.showV2313VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2313visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2313visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2313: voiced mode
internal fun PlayerActivity.showV2313VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313voiced
    FeaturePrefsStore.batch2311.v2313voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2313: volunteered mode
internal fun PlayerActivity.showV2313VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2313volunteered
    FeaturePrefsStore.batch2311.v2313volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2313: wandered mode
internal fun PlayerActivity.showV2313WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313wandered
    FeaturePrefsStore.batch2311.v2313wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2313: warmed mode
internal fun PlayerActivity.showV2313WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313warmed
    FeaturePrefsStore.batch2311.v2313warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2313: warned mode
internal fun PlayerActivity.showV2313WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2313warned
    FeaturePrefsStore.batch2311.v2313warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2314: upgraded mode
internal fun PlayerActivity.showV2314UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314upgraded
    FeaturePrefsStore.batch2311.v2314upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2314: utilized mode
internal fun PlayerActivity.showV2314UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314utilized
    FeaturePrefsStore.batch2311.v2314utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2314: validated mode
internal fun PlayerActivity.showV2314ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314validated
    FeaturePrefsStore.batch2311.v2314validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2314: valued mode
internal fun PlayerActivity.showV2314ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314valued
    FeaturePrefsStore.batch2311.v2314valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2314: varied mode
internal fun PlayerActivity.showV2314VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314varied
    FeaturePrefsStore.batch2311.v2314varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2314: verified level
internal fun PlayerActivity.showV2314VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2314: viewed level
internal fun PlayerActivity.showV2314ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2314: violated level
internal fun PlayerActivity.showV2314ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2314: visited level
internal fun PlayerActivity.showV2314VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2314: visualized level
internal fun PlayerActivity.showV2314VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2314visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2314visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2314: voiced mode
internal fun PlayerActivity.showV2314VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314voiced
    FeaturePrefsStore.batch2311.v2314voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2314: volunteered mode
internal fun PlayerActivity.showV2314VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2314volunteered
    FeaturePrefsStore.batch2311.v2314volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2314: wandered mode
internal fun PlayerActivity.showV2314WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314wandered
    FeaturePrefsStore.batch2311.v2314wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2314: warmed mode
internal fun PlayerActivity.showV2314WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314warmed
    FeaturePrefsStore.batch2311.v2314warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2314: warned mode
internal fun PlayerActivity.showV2314WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2314warned
    FeaturePrefsStore.batch2311.v2314warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2315: upgraded mode
internal fun PlayerActivity.showV2315UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315upgraded
    FeaturePrefsStore.batch2311.v2315upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2315: utilized mode
internal fun PlayerActivity.showV2315UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315utilized
    FeaturePrefsStore.batch2311.v2315utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2315: validated mode
internal fun PlayerActivity.showV2315ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315validated
    FeaturePrefsStore.batch2311.v2315validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2315: valued mode
internal fun PlayerActivity.showV2315ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315valued
    FeaturePrefsStore.batch2311.v2315valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2315: varied mode
internal fun PlayerActivity.showV2315VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315varied
    FeaturePrefsStore.batch2311.v2315varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2315: verified level
internal fun PlayerActivity.showV2315VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2315: viewed level
internal fun PlayerActivity.showV2315ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2315: violated level
internal fun PlayerActivity.showV2315ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2315: visited level
internal fun PlayerActivity.showV2315VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2315: visualized level
internal fun PlayerActivity.showV2315VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2315visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2315visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2315: voiced mode
internal fun PlayerActivity.showV2315VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315voiced
    FeaturePrefsStore.batch2311.v2315voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2315: volunteered mode
internal fun PlayerActivity.showV2315VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2315volunteered
    FeaturePrefsStore.batch2311.v2315volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2315: wandered mode
internal fun PlayerActivity.showV2315WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315wandered
    FeaturePrefsStore.batch2311.v2315wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2315: warmed mode
internal fun PlayerActivity.showV2315WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315warmed
    FeaturePrefsStore.batch2311.v2315warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2315: warned mode
internal fun PlayerActivity.showV2315WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2315warned
    FeaturePrefsStore.batch2311.v2315warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2316: upgraded mode
internal fun PlayerActivity.showV2316UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316upgraded
    FeaturePrefsStore.batch2311.v2316upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2316: utilized mode
internal fun PlayerActivity.showV2316UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316utilized
    FeaturePrefsStore.batch2311.v2316utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2316: validated mode
internal fun PlayerActivity.showV2316ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316validated
    FeaturePrefsStore.batch2311.v2316validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2316: valued mode
internal fun PlayerActivity.showV2316ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316valued
    FeaturePrefsStore.batch2311.v2316valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2316: varied mode
internal fun PlayerActivity.showV2316VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316varied
    FeaturePrefsStore.batch2311.v2316varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2316: verified level
internal fun PlayerActivity.showV2316VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2316: viewed level
internal fun PlayerActivity.showV2316ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2316: violated level
internal fun PlayerActivity.showV2316ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2316: visited level
internal fun PlayerActivity.showV2316VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2316: visualized level
internal fun PlayerActivity.showV2316VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2316visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2316visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2316: voiced mode
internal fun PlayerActivity.showV2316VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316voiced
    FeaturePrefsStore.batch2311.v2316voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2316: volunteered mode
internal fun PlayerActivity.showV2316VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2316volunteered
    FeaturePrefsStore.batch2311.v2316volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2316: wandered mode
internal fun PlayerActivity.showV2316WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316wandered
    FeaturePrefsStore.batch2311.v2316wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2316: warmed mode
internal fun PlayerActivity.showV2316WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316warmed
    FeaturePrefsStore.batch2311.v2316warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2316: warned mode
internal fun PlayerActivity.showV2316WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2316warned
    FeaturePrefsStore.batch2311.v2316warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2317: upgraded mode
internal fun PlayerActivity.showV2317UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317upgraded
    FeaturePrefsStore.batch2311.v2317upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2317: utilized mode
internal fun PlayerActivity.showV2317UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317utilized
    FeaturePrefsStore.batch2311.v2317utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2317: validated mode
internal fun PlayerActivity.showV2317ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317validated
    FeaturePrefsStore.batch2311.v2317validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2317: valued mode
internal fun PlayerActivity.showV2317ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317valued
    FeaturePrefsStore.batch2311.v2317valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2317: varied mode
internal fun PlayerActivity.showV2317VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317varied
    FeaturePrefsStore.batch2311.v2317varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2317: verified level
internal fun PlayerActivity.showV2317VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2317: viewed level
internal fun PlayerActivity.showV2317ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2317: violated level
internal fun PlayerActivity.showV2317ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2317: visited level
internal fun PlayerActivity.showV2317VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2317: visualized level
internal fun PlayerActivity.showV2317VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2317visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2317visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2317: voiced mode
internal fun PlayerActivity.showV2317VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317voiced
    FeaturePrefsStore.batch2311.v2317voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2317: volunteered mode
internal fun PlayerActivity.showV2317VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2317volunteered
    FeaturePrefsStore.batch2311.v2317volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2317: wandered mode
internal fun PlayerActivity.showV2317WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317wandered
    FeaturePrefsStore.batch2311.v2317wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2317: warmed mode
internal fun PlayerActivity.showV2317WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317warmed
    FeaturePrefsStore.batch2311.v2317warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2317: warned mode
internal fun PlayerActivity.showV2317WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2317warned
    FeaturePrefsStore.batch2311.v2317warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2318: upgraded mode
internal fun PlayerActivity.showV2318UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318upgraded
    FeaturePrefsStore.batch2311.v2318upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2318: utilized mode
internal fun PlayerActivity.showV2318UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318utilized
    FeaturePrefsStore.batch2311.v2318utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2318: validated mode
internal fun PlayerActivity.showV2318ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318validated
    FeaturePrefsStore.batch2311.v2318validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2318: valued mode
internal fun PlayerActivity.showV2318ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318valued
    FeaturePrefsStore.batch2311.v2318valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2318: varied mode
internal fun PlayerActivity.showV2318VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318varied
    FeaturePrefsStore.batch2311.v2318varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2318: verified level
internal fun PlayerActivity.showV2318VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2318: viewed level
internal fun PlayerActivity.showV2318ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2318: violated level
internal fun PlayerActivity.showV2318ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2318: visited level
internal fun PlayerActivity.showV2318VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2318: visualized level
internal fun PlayerActivity.showV2318VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2318visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2318visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2318: voiced mode
internal fun PlayerActivity.showV2318VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318voiced
    FeaturePrefsStore.batch2311.v2318voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2318: volunteered mode
internal fun PlayerActivity.showV2318VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2318volunteered
    FeaturePrefsStore.batch2311.v2318volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2318: wandered mode
internal fun PlayerActivity.showV2318WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318wandered
    FeaturePrefsStore.batch2311.v2318wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2318: warmed mode
internal fun PlayerActivity.showV2318WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318warmed
    FeaturePrefsStore.batch2311.v2318warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2318: warned mode
internal fun PlayerActivity.showV2318WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2318warned
    FeaturePrefsStore.batch2311.v2318warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2319: upgraded mode
internal fun PlayerActivity.showV2319UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319upgraded
    FeaturePrefsStore.batch2311.v2319upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2319: utilized mode
internal fun PlayerActivity.showV2319UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319utilized
    FeaturePrefsStore.batch2311.v2319utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2319: validated mode
internal fun PlayerActivity.showV2319ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319validated
    FeaturePrefsStore.batch2311.v2319validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2319: valued mode
internal fun PlayerActivity.showV2319ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319valued
    FeaturePrefsStore.batch2311.v2319valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2319: varied mode
internal fun PlayerActivity.showV2319VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319varied
    FeaturePrefsStore.batch2311.v2319varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2319: verified level
internal fun PlayerActivity.showV2319VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2319: viewed level
internal fun PlayerActivity.showV2319ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2319: violated level
internal fun PlayerActivity.showV2319ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2319: visited level
internal fun PlayerActivity.showV2319VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2319: visualized level
internal fun PlayerActivity.showV2319VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2319visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2319visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2319: voiced mode
internal fun PlayerActivity.showV2319VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319voiced
    FeaturePrefsStore.batch2311.v2319voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2319: volunteered mode
internal fun PlayerActivity.showV2319VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2319volunteered
    FeaturePrefsStore.batch2311.v2319volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2319: wandered mode
internal fun PlayerActivity.showV2319WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319wandered
    FeaturePrefsStore.batch2311.v2319wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2319: warmed mode
internal fun PlayerActivity.showV2319WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319warmed
    FeaturePrefsStore.batch2311.v2319warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2319: warned mode
internal fun PlayerActivity.showV2319WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2319warned
    FeaturePrefsStore.batch2311.v2319warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}

// v2320: upgraded mode
internal fun PlayerActivity.showV2320UpgradedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320upgraded
    FeaturePrefsStore.batch2311.v2320upgraded = !current
    AppToast.show(this, "upgraded: ${if (!current) "ON" else "OFF"}")
}

// v2320: utilized mode
internal fun PlayerActivity.showV2320UtilizedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320utilized
    FeaturePrefsStore.batch2311.v2320utilized = !current
    AppToast.show(this, "utilized: ${if (!current) "ON" else "OFF"}")
}

// v2320: validated mode
internal fun PlayerActivity.showV2320ValidatedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320validated
    FeaturePrefsStore.batch2311.v2320validated = !current
    AppToast.show(this, "validated: ${if (!current) "ON" else "OFF"}")
}

// v2320: valued mode
internal fun PlayerActivity.showV2320ValuedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320valued
    FeaturePrefsStore.batch2311.v2320valued = !current
    AppToast.show(this, "valued: ${if (!current) "ON" else "OFF"}")
}

// v2320: varied mode
internal fun PlayerActivity.showV2320VariedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320varied
    FeaturePrefsStore.batch2311.v2320varied = !current
    AppToast.show(this, "varied: ${if (!current) "ON" else "OFF"}")
}

// v2320: verified level
internal fun PlayerActivity.showV2320VerifiedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320verified).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "verified level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320verified = value
        AppToast.show(this, "verified: $value")
    }
}

// v2320: viewed level
internal fun PlayerActivity.showV2320ViewedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320viewed).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "viewed level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320viewed = value
        AppToast.show(this, "viewed: $value")
    }
}

// v2320: violated level
internal fun PlayerActivity.showV2320ViolatedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320violated).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "violated level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320violated = value
        AppToast.show(this, "violated: $value")
    }
}

// v2320: visited level
internal fun PlayerActivity.showV2320VisitedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320visited).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visited level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320visited = value
        AppToast.show(this, "visited: $value")
    }
}

// v2320: visualized level
internal fun PlayerActivity.showV2320VisualizedDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2311.v2320visualized).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "visualized level",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        FeaturePrefsStore.batch2311.v2320visualized = value
        AppToast.show(this, "visualized: $value")
    }
}

// v2320: voiced mode
internal fun PlayerActivity.showV2320VoicedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320voiced
    FeaturePrefsStore.batch2311.v2320voiced = !current
    AppToast.show(this, "voiced: ${if (!current) "ON" else "OFF"}")
}

// v2320: volunteered mode
internal fun PlayerActivity.showV2320VolunteeredToggle() {
    val current = FeaturePrefsStore.batch2311.v2320volunteered
    FeaturePrefsStore.batch2311.v2320volunteered = !current
    AppToast.show(this, "volunteered: ${if (!current) "ON" else "OFF"}")
}

// v2320: wandered mode
internal fun PlayerActivity.showV2320WanderedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320wandered
    FeaturePrefsStore.batch2311.v2320wandered = !current
    AppToast.show(this, "wandered: ${if (!current) "ON" else "OFF"}")
}

// v2320: warmed mode
internal fun PlayerActivity.showV2320WarmedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320warmed
    FeaturePrefsStore.batch2311.v2320warmed = !current
    AppToast.show(this, "warmed: ${if (!current) "ON" else "OFF"}")
}

// v2320: warned mode
internal fun PlayerActivity.showV2320WarnedToggle() {
    val current = FeaturePrefsStore.batch2311.v2320warned
    FeaturePrefsStore.batch2311.v2320warned = !current
    AppToast.show(this, "warned: ${if (!current) "ON" else "OFF"}")
}
