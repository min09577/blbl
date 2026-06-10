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

