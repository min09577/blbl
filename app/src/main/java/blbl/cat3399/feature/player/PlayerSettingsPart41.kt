package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind


import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind

internal fun PlayerActivity.showV561TagAutoExtract561Toggle() {
    val current = BiliClient.prefs.v561tagAutoExtract561
    BiliClient.prefs.v561tagAutoExtract561 = !current
    AppToast.show(this, "Tag Auto Extract561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561TargetAutoLock561Toggle() {
    val current = BiliClient.prefs.v561targetAutoLock561
    BiliClient.prefs.v561targetAutoLock561 = !current
    AppToast.show(this, "Target Auto Lock561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561TemplateAutoFill561Toggle() {
    val current = BiliClient.prefs.v561templateAutoFill561
    BiliClient.prefs.v561templateAutoFill561 = !current
    AppToast.show(this, "Template Auto Fill561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV561TestAutoRun561Toggle() {
    val current = BiliClient.prefs.v561testAutoRun561
    BiliClient.prefs.v561testAutoRun561 = !current
    AppToast.show(this, "Test Auto Run561: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562StaticIpAutoDetect562Toggle() {
    val current = BiliClient.prefs.v562staticIpAutoDetect562
    BiliClient.prefs.v562staticIpAutoDetect562 = !current
    AppToast.show(this, "Static IP Auto Detect562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562StepAutoIncrement562Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v562stepAutoIncrement562).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment562",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v562stepAutoIncrement562 = value
        AppToast.show(this, "Step Auto Increment562: $value")
    }
}

internal fun PlayerActivity.showV562StopAutoConfirm562Toggle() {
    val current = BiliClient.prefs.v562stopAutoConfirm562
    BiliClient.prefs.v562stopAutoConfirm562 = !current
    AppToast.show(this, "Stop Auto Confirm562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562StoreAutoSync562Toggle() {
    val current = BiliClient.prefs.v562storeAutoSync562
    BiliClient.prefs.v562storeAutoSync562 = !current
    AppToast.show(this, "Store Auto Sync562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562StyleAutoTheme562Toggle() {
    val current = BiliClient.prefs.v562styleAutoTheme562
    BiliClient.prefs.v562styleAutoTheme562 = !current
    AppToast.show(this, "Style Auto Theme562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562SubmitAutoValidate562Toggle() {
    val current = BiliClient.prefs.v562submitAutoValidate562
    BiliClient.prefs.v562submitAutoValidate562 = !current
    AppToast.show(this, "Submit Auto Validate562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562SuffixAutoAppend562Toggle() {
    val current = BiliClient.prefs.v562suffixAutoAppend562
    BiliClient.prefs.v562suffixAutoAppend562 = !current
    AppToast.show(this, "Suffix Auto Append562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562SummaryAutoGenerate562Toggle() {
    val current = BiliClient.prefs.v562summaryAutoGenerate562
    BiliClient.prefs.v562summaryAutoGenerate562 = !current
    AppToast.show(this, "Summary Auto Generate562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562SwapAutoChannel562Toggle() {
    val current = BiliClient.prefs.v562swapAutoChannel562
    BiliClient.prefs.v562swapAutoChannel562 = !current
    AppToast.show(this, "Swap Auto Channel562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562SwitchAutoProfile562Toggle() {
    val current = BiliClient.prefs.v562switchAutoProfile562
    BiliClient.prefs.v562switchAutoProfile562 = !current
    AppToast.show(this, "Switch Auto Profile562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562TabAutoRestore562Toggle() {
    val current = BiliClient.prefs.v562tabAutoRestore562
    BiliClient.prefs.v562tabAutoRestore562 = !current
    AppToast.show(this, "Tab Auto Restore562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562TagAutoExtract562Toggle() {
    val current = BiliClient.prefs.v562tagAutoExtract562
    BiliClient.prefs.v562tagAutoExtract562 = !current
    AppToast.show(this, "Tag Auto Extract562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562TargetAutoLock562Toggle() {
    val current = BiliClient.prefs.v562targetAutoLock562
    BiliClient.prefs.v562targetAutoLock562 = !current
    AppToast.show(this, "Target Auto Lock562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562TemplateAutoFill562Toggle() {
    val current = BiliClient.prefs.v562templateAutoFill562
    BiliClient.prefs.v562templateAutoFill562 = !current
    AppToast.show(this, "Template Auto Fill562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV562TestAutoRun562Toggle() {
    val current = BiliClient.prefs.v562testAutoRun562
    BiliClient.prefs.v562testAutoRun562 = !current
    AppToast.show(this, "Test Auto Run562: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563StaticIpAutoDetect563Toggle() {
    val current = BiliClient.prefs.v563staticIpAutoDetect563
    BiliClient.prefs.v563staticIpAutoDetect563 = !current
    AppToast.show(this, "Static IP Auto Detect563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563StepAutoIncrement563Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v563stepAutoIncrement563).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment563",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v563stepAutoIncrement563 = value
        AppToast.show(this, "Step Auto Increment563: $value")
    }
}

internal fun PlayerActivity.showV563StopAutoConfirm563Toggle() {
    val current = BiliClient.prefs.v563stopAutoConfirm563
    BiliClient.prefs.v563stopAutoConfirm563 = !current
    AppToast.show(this, "Stop Auto Confirm563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563StoreAutoSync563Toggle() {
    val current = BiliClient.prefs.v563storeAutoSync563
    BiliClient.prefs.v563storeAutoSync563 = !current
    AppToast.show(this, "Store Auto Sync563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563StyleAutoTheme563Toggle() {
    val current = BiliClient.prefs.v563styleAutoTheme563
    BiliClient.prefs.v563styleAutoTheme563 = !current
    AppToast.show(this, "Style Auto Theme563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563SubmitAutoValidate563Toggle() {
    val current = BiliClient.prefs.v563submitAutoValidate563
    BiliClient.prefs.v563submitAutoValidate563 = !current
    AppToast.show(this, "Submit Auto Validate563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563SuffixAutoAppend563Toggle() {
    val current = BiliClient.prefs.v563suffixAutoAppend563
    BiliClient.prefs.v563suffixAutoAppend563 = !current
    AppToast.show(this, "Suffix Auto Append563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563SummaryAutoGenerate563Toggle() {
    val current = BiliClient.prefs.v563summaryAutoGenerate563
    BiliClient.prefs.v563summaryAutoGenerate563 = !current
    AppToast.show(this, "Summary Auto Generate563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563SwapAutoChannel563Toggle() {
    val current = BiliClient.prefs.v563swapAutoChannel563
    BiliClient.prefs.v563swapAutoChannel563 = !current
    AppToast.show(this, "Swap Auto Channel563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563SwitchAutoProfile563Toggle() {
    val current = BiliClient.prefs.v563switchAutoProfile563
    BiliClient.prefs.v563switchAutoProfile563 = !current
    AppToast.show(this, "Switch Auto Profile563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563TabAutoRestore563Toggle() {
    val current = BiliClient.prefs.v563tabAutoRestore563
    BiliClient.prefs.v563tabAutoRestore563 = !current
    AppToast.show(this, "Tab Auto Restore563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563TagAutoExtract563Toggle() {
    val current = BiliClient.prefs.v563tagAutoExtract563
    BiliClient.prefs.v563tagAutoExtract563 = !current
    AppToast.show(this, "Tag Auto Extract563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563TargetAutoLock563Toggle() {
    val current = BiliClient.prefs.v563targetAutoLock563
    BiliClient.prefs.v563targetAutoLock563 = !current
    AppToast.show(this, "Target Auto Lock563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563TemplateAutoFill563Toggle() {
    val current = BiliClient.prefs.v563templateAutoFill563
    BiliClient.prefs.v563templateAutoFill563 = !current
    AppToast.show(this, "Template Auto Fill563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV563TestAutoRun563Toggle() {
    val current = BiliClient.prefs.v563testAutoRun563
    BiliClient.prefs.v563testAutoRun563 = !current
    AppToast.show(this, "Test Auto Run563: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564StaticIpAutoDetect564Toggle() {
    val current = BiliClient.prefs.v564staticIpAutoDetect564
    BiliClient.prefs.v564staticIpAutoDetect564 = !current
    AppToast.show(this, "Static IP Auto Detect564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564StepAutoIncrement564Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v564stepAutoIncrement564).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment564",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v564stepAutoIncrement564 = value
        AppToast.show(this, "Step Auto Increment564: $value")
    }
}

internal fun PlayerActivity.showV564StopAutoConfirm564Toggle() {
    val current = BiliClient.prefs.v564stopAutoConfirm564
    BiliClient.prefs.v564stopAutoConfirm564 = !current
    AppToast.show(this, "Stop Auto Confirm564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564StoreAutoSync564Toggle() {
    val current = BiliClient.prefs.v564storeAutoSync564
    BiliClient.prefs.v564storeAutoSync564 = !current
    AppToast.show(this, "Store Auto Sync564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564StyleAutoTheme564Toggle() {
    val current = BiliClient.prefs.v564styleAutoTheme564
    BiliClient.prefs.v564styleAutoTheme564 = !current
    AppToast.show(this, "Style Auto Theme564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564SubmitAutoValidate564Toggle() {
    val current = BiliClient.prefs.v564submitAutoValidate564
    BiliClient.prefs.v564submitAutoValidate564 = !current
    AppToast.show(this, "Submit Auto Validate564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564SuffixAutoAppend564Toggle() {
    val current = BiliClient.prefs.v564suffixAutoAppend564
    BiliClient.prefs.v564suffixAutoAppend564 = !current
    AppToast.show(this, "Suffix Auto Append564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564SummaryAutoGenerate564Toggle() {
    val current = BiliClient.prefs.v564summaryAutoGenerate564
    BiliClient.prefs.v564summaryAutoGenerate564 = !current
    AppToast.show(this, "Summary Auto Generate564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564SwapAutoChannel564Toggle() {
    val current = BiliClient.prefs.v564swapAutoChannel564
    BiliClient.prefs.v564swapAutoChannel564 = !current
    AppToast.show(this, "Swap Auto Channel564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564SwitchAutoProfile564Toggle() {
    val current = BiliClient.prefs.v564switchAutoProfile564
    BiliClient.prefs.v564switchAutoProfile564 = !current
    AppToast.show(this, "Switch Auto Profile564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564TabAutoRestore564Toggle() {
    val current = BiliClient.prefs.v564tabAutoRestore564
    BiliClient.prefs.v564tabAutoRestore564 = !current
    AppToast.show(this, "Tab Auto Restore564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564TagAutoExtract564Toggle() {
    val current = BiliClient.prefs.v564tagAutoExtract564
    BiliClient.prefs.v564tagAutoExtract564 = !current
    AppToast.show(this, "Tag Auto Extract564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564TargetAutoLock564Toggle() {
    val current = BiliClient.prefs.v564targetAutoLock564
    BiliClient.prefs.v564targetAutoLock564 = !current
    AppToast.show(this, "Target Auto Lock564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564TemplateAutoFill564Toggle() {
    val current = BiliClient.prefs.v564templateAutoFill564
    BiliClient.prefs.v564templateAutoFill564 = !current
    AppToast.show(this, "Template Auto Fill564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV564TestAutoRun564Toggle() {
    val current = BiliClient.prefs.v564testAutoRun564
    BiliClient.prefs.v564testAutoRun564 = !current
    AppToast.show(this, "Test Auto Run564: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565StaticIpAutoDetect565Toggle() {
    val current = BiliClient.prefs.v565staticIpAutoDetect565
    BiliClient.prefs.v565staticIpAutoDetect565 = !current
    AppToast.show(this, "Static IP Auto Detect565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565StepAutoIncrement565Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v565stepAutoIncrement565).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment565",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v565stepAutoIncrement565 = value
        AppToast.show(this, "Step Auto Increment565: $value")
    }
}

internal fun PlayerActivity.showV565StopAutoConfirm565Toggle() {
    val current = BiliClient.prefs.v565stopAutoConfirm565
    BiliClient.prefs.v565stopAutoConfirm565 = !current
    AppToast.show(this, "Stop Auto Confirm565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565StoreAutoSync565Toggle() {
    val current = BiliClient.prefs.v565storeAutoSync565
    BiliClient.prefs.v565storeAutoSync565 = !current
    AppToast.show(this, "Store Auto Sync565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565StyleAutoTheme565Toggle() {
    val current = BiliClient.prefs.v565styleAutoTheme565
    BiliClient.prefs.v565styleAutoTheme565 = !current
    AppToast.show(this, "Style Auto Theme565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565SubmitAutoValidate565Toggle() {
    val current = BiliClient.prefs.v565submitAutoValidate565
    BiliClient.prefs.v565submitAutoValidate565 = !current
    AppToast.show(this, "Submit Auto Validate565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565SuffixAutoAppend565Toggle() {
    val current = BiliClient.prefs.v565suffixAutoAppend565
    BiliClient.prefs.v565suffixAutoAppend565 = !current
    AppToast.show(this, "Suffix Auto Append565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565SummaryAutoGenerate565Toggle() {
    val current = BiliClient.prefs.v565summaryAutoGenerate565
    BiliClient.prefs.v565summaryAutoGenerate565 = !current
    AppToast.show(this, "Summary Auto Generate565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565SwapAutoChannel565Toggle() {
    val current = BiliClient.prefs.v565swapAutoChannel565
    BiliClient.prefs.v565swapAutoChannel565 = !current
    AppToast.show(this, "Swap Auto Channel565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565SwitchAutoProfile565Toggle() {
    val current = BiliClient.prefs.v565switchAutoProfile565
    BiliClient.prefs.v565switchAutoProfile565 = !current
    AppToast.show(this, "Switch Auto Profile565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565TabAutoRestore565Toggle() {
    val current = BiliClient.prefs.v565tabAutoRestore565
    BiliClient.prefs.v565tabAutoRestore565 = !current
    AppToast.show(this, "Tab Auto Restore565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565TagAutoExtract565Toggle() {
    val current = BiliClient.prefs.v565tagAutoExtract565
    BiliClient.prefs.v565tagAutoExtract565 = !current
    AppToast.show(this, "Tag Auto Extract565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565TargetAutoLock565Toggle() {
    val current = BiliClient.prefs.v565targetAutoLock565
    BiliClient.prefs.v565targetAutoLock565 = !current
    AppToast.show(this, "Target Auto Lock565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565TemplateAutoFill565Toggle() {
    val current = BiliClient.prefs.v565templateAutoFill565
    BiliClient.prefs.v565templateAutoFill565 = !current
    AppToast.show(this, "Template Auto Fill565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV565TestAutoRun565Toggle() {
    val current = BiliClient.prefs.v565testAutoRun565
    BiliClient.prefs.v565testAutoRun565 = !current
    AppToast.show(this, "Test Auto Run565: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566StaticIpAutoDetect566Toggle() {
    val current = BiliClient.prefs.v566staticIpAutoDetect566
    BiliClient.prefs.v566staticIpAutoDetect566 = !current
    AppToast.show(this, "Static IP Auto Detect566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566StepAutoIncrement566Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v566stepAutoIncrement566).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment566",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v566stepAutoIncrement566 = value
        AppToast.show(this, "Step Auto Increment566: $value")
    }
}

internal fun PlayerActivity.showV566StopAutoConfirm566Toggle() {
    val current = BiliClient.prefs.v566stopAutoConfirm566
    BiliClient.prefs.v566stopAutoConfirm566 = !current
    AppToast.show(this, "Stop Auto Confirm566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566StoreAutoSync566Toggle() {
    val current = BiliClient.prefs.v566storeAutoSync566
    BiliClient.prefs.v566storeAutoSync566 = !current
    AppToast.show(this, "Store Auto Sync566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566StyleAutoTheme566Toggle() {
    val current = BiliClient.prefs.v566styleAutoTheme566
    BiliClient.prefs.v566styleAutoTheme566 = !current
    AppToast.show(this, "Style Auto Theme566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566SubmitAutoValidate566Toggle() {
    val current = BiliClient.prefs.v566submitAutoValidate566
    BiliClient.prefs.v566submitAutoValidate566 = !current
    AppToast.show(this, "Submit Auto Validate566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566SuffixAutoAppend566Toggle() {
    val current = BiliClient.prefs.v566suffixAutoAppend566
    BiliClient.prefs.v566suffixAutoAppend566 = !current
    AppToast.show(this, "Suffix Auto Append566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566SummaryAutoGenerate566Toggle() {
    val current = BiliClient.prefs.v566summaryAutoGenerate566
    BiliClient.prefs.v566summaryAutoGenerate566 = !current
    AppToast.show(this, "Summary Auto Generate566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566SwapAutoChannel566Toggle() {
    val current = BiliClient.prefs.v566swapAutoChannel566
    BiliClient.prefs.v566swapAutoChannel566 = !current
    AppToast.show(this, "Swap Auto Channel566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566SwitchAutoProfile566Toggle() {
    val current = BiliClient.prefs.v566switchAutoProfile566
    BiliClient.prefs.v566switchAutoProfile566 = !current
    AppToast.show(this, "Switch Auto Profile566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566TabAutoRestore566Toggle() {
    val current = BiliClient.prefs.v566tabAutoRestore566
    BiliClient.prefs.v566tabAutoRestore566 = !current
    AppToast.show(this, "Tab Auto Restore566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566TagAutoExtract566Toggle() {
    val current = BiliClient.prefs.v566tagAutoExtract566
    BiliClient.prefs.v566tagAutoExtract566 = !current
    AppToast.show(this, "Tag Auto Extract566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566TargetAutoLock566Toggle() {
    val current = BiliClient.prefs.v566targetAutoLock566
    BiliClient.prefs.v566targetAutoLock566 = !current
    AppToast.show(this, "Target Auto Lock566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566TemplateAutoFill566Toggle() {
    val current = BiliClient.prefs.v566templateAutoFill566
    BiliClient.prefs.v566templateAutoFill566 = !current
    AppToast.show(this, "Template Auto Fill566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV566TestAutoRun566Toggle() {
    val current = BiliClient.prefs.v566testAutoRun566
    BiliClient.prefs.v566testAutoRun566 = !current
    AppToast.show(this, "Test Auto Run566: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567StaticIpAutoDetect567Toggle() {
    val current = BiliClient.prefs.v567staticIpAutoDetect567
    BiliClient.prefs.v567staticIpAutoDetect567 = !current
    AppToast.show(this, "Static IP Auto Detect567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567StepAutoIncrement567Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v567stepAutoIncrement567).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment567",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v567stepAutoIncrement567 = value
        AppToast.show(this, "Step Auto Increment567: $value")
    }
}

internal fun PlayerActivity.showV567StopAutoConfirm567Toggle() {
    val current = BiliClient.prefs.v567stopAutoConfirm567
    BiliClient.prefs.v567stopAutoConfirm567 = !current
    AppToast.show(this, "Stop Auto Confirm567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567StoreAutoSync567Toggle() {
    val current = BiliClient.prefs.v567storeAutoSync567
    BiliClient.prefs.v567storeAutoSync567 = !current
    AppToast.show(this, "Store Auto Sync567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567StyleAutoTheme567Toggle() {
    val current = BiliClient.prefs.v567styleAutoTheme567
    BiliClient.prefs.v567styleAutoTheme567 = !current
    AppToast.show(this, "Style Auto Theme567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567SubmitAutoValidate567Toggle() {
    val current = BiliClient.prefs.v567submitAutoValidate567
    BiliClient.prefs.v567submitAutoValidate567 = !current
    AppToast.show(this, "Submit Auto Validate567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567SuffixAutoAppend567Toggle() {
    val current = BiliClient.prefs.v567suffixAutoAppend567
    BiliClient.prefs.v567suffixAutoAppend567 = !current
    AppToast.show(this, "Suffix Auto Append567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567SummaryAutoGenerate567Toggle() {
    val current = BiliClient.prefs.v567summaryAutoGenerate567
    BiliClient.prefs.v567summaryAutoGenerate567 = !current
    AppToast.show(this, "Summary Auto Generate567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567SwapAutoChannel567Toggle() {
    val current = BiliClient.prefs.v567swapAutoChannel567
    BiliClient.prefs.v567swapAutoChannel567 = !current
    AppToast.show(this, "Swap Auto Channel567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567SwitchAutoProfile567Toggle() {
    val current = BiliClient.prefs.v567switchAutoProfile567
    BiliClient.prefs.v567switchAutoProfile567 = !current
    AppToast.show(this, "Switch Auto Profile567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567TabAutoRestore567Toggle() {
    val current = BiliClient.prefs.v567tabAutoRestore567
    BiliClient.prefs.v567tabAutoRestore567 = !current
    AppToast.show(this, "Tab Auto Restore567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567TagAutoExtract567Toggle() {
    val current = BiliClient.prefs.v567tagAutoExtract567
    BiliClient.prefs.v567tagAutoExtract567 = !current
    AppToast.show(this, "Tag Auto Extract567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567TargetAutoLock567Toggle() {
    val current = BiliClient.prefs.v567targetAutoLock567
    BiliClient.prefs.v567targetAutoLock567 = !current
    AppToast.show(this, "Target Auto Lock567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567TemplateAutoFill567Toggle() {
    val current = BiliClient.prefs.v567templateAutoFill567
    BiliClient.prefs.v567templateAutoFill567 = !current
    AppToast.show(this, "Template Auto Fill567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV567TestAutoRun567Toggle() {
    val current = BiliClient.prefs.v567testAutoRun567
    BiliClient.prefs.v567testAutoRun567 = !current
    AppToast.show(this, "Test Auto Run567: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568StaticIpAutoDetect568Toggle() {
    val current = BiliClient.prefs.v568staticIpAutoDetect568
    BiliClient.prefs.v568staticIpAutoDetect568 = !current
    AppToast.show(this, "Static IP Auto Detect568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568StepAutoIncrement568Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v568stepAutoIncrement568).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment568",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v568stepAutoIncrement568 = value
        AppToast.show(this, "Step Auto Increment568: $value")
    }
}

internal fun PlayerActivity.showV568StopAutoConfirm568Toggle() {
    val current = BiliClient.prefs.v568stopAutoConfirm568
    BiliClient.prefs.v568stopAutoConfirm568 = !current
    AppToast.show(this, "Stop Auto Confirm568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568StoreAutoSync568Toggle() {
    val current = BiliClient.prefs.v568storeAutoSync568
    BiliClient.prefs.v568storeAutoSync568 = !current
    AppToast.show(this, "Store Auto Sync568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568StyleAutoTheme568Toggle() {
    val current = BiliClient.prefs.v568styleAutoTheme568
    BiliClient.prefs.v568styleAutoTheme568 = !current
    AppToast.show(this, "Style Auto Theme568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568SubmitAutoValidate568Toggle() {
    val current = BiliClient.prefs.v568submitAutoValidate568
    BiliClient.prefs.v568submitAutoValidate568 = !current
    AppToast.show(this, "Submit Auto Validate568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568SuffixAutoAppend568Toggle() {
    val current = BiliClient.prefs.v568suffixAutoAppend568
    BiliClient.prefs.v568suffixAutoAppend568 = !current
    AppToast.show(this, "Suffix Auto Append568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568SummaryAutoGenerate568Toggle() {
    val current = BiliClient.prefs.v568summaryAutoGenerate568
    BiliClient.prefs.v568summaryAutoGenerate568 = !current
    AppToast.show(this, "Summary Auto Generate568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568SwapAutoChannel568Toggle() {
    val current = BiliClient.prefs.v568swapAutoChannel568
    BiliClient.prefs.v568swapAutoChannel568 = !current
    AppToast.show(this, "Swap Auto Channel568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568SwitchAutoProfile568Toggle() {
    val current = BiliClient.prefs.v568switchAutoProfile568
    BiliClient.prefs.v568switchAutoProfile568 = !current
    AppToast.show(this, "Switch Auto Profile568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568TabAutoRestore568Toggle() {
    val current = BiliClient.prefs.v568tabAutoRestore568
    BiliClient.prefs.v568tabAutoRestore568 = !current
    AppToast.show(this, "Tab Auto Restore568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568TagAutoExtract568Toggle() {
    val current = BiliClient.prefs.v568tagAutoExtract568
    BiliClient.prefs.v568tagAutoExtract568 = !current
    AppToast.show(this, "Tag Auto Extract568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568TargetAutoLock568Toggle() {
    val current = BiliClient.prefs.v568targetAutoLock568
    BiliClient.prefs.v568targetAutoLock568 = !current
    AppToast.show(this, "Target Auto Lock568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568TemplateAutoFill568Toggle() {
    val current = BiliClient.prefs.v568templateAutoFill568
    BiliClient.prefs.v568templateAutoFill568 = !current
    AppToast.show(this, "Template Auto Fill568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV568TestAutoRun568Toggle() {
    val current = BiliClient.prefs.v568testAutoRun568
    BiliClient.prefs.v568testAutoRun568 = !current
    AppToast.show(this, "Test Auto Run568: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569StaticIpAutoDetect569Toggle() {
    val current = BiliClient.prefs.v569staticIpAutoDetect569
    BiliClient.prefs.v569staticIpAutoDetect569 = !current
    AppToast.show(this, "Static IP Auto Detect569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569StepAutoIncrement569Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v569stepAutoIncrement569).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment569",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v569stepAutoIncrement569 = value
        AppToast.show(this, "Step Auto Increment569: $value")
    }
}

internal fun PlayerActivity.showV569StopAutoConfirm569Toggle() {
    val current = BiliClient.prefs.v569stopAutoConfirm569
    BiliClient.prefs.v569stopAutoConfirm569 = !current
    AppToast.show(this, "Stop Auto Confirm569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569StoreAutoSync569Toggle() {
    val current = BiliClient.prefs.v569storeAutoSync569
    BiliClient.prefs.v569storeAutoSync569 = !current
    AppToast.show(this, "Store Auto Sync569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569StyleAutoTheme569Toggle() {
    val current = BiliClient.prefs.v569styleAutoTheme569
    BiliClient.prefs.v569styleAutoTheme569 = !current
    AppToast.show(this, "Style Auto Theme569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569SubmitAutoValidate569Toggle() {
    val current = BiliClient.prefs.v569submitAutoValidate569
    BiliClient.prefs.v569submitAutoValidate569 = !current
    AppToast.show(this, "Submit Auto Validate569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569SuffixAutoAppend569Toggle() {
    val current = BiliClient.prefs.v569suffixAutoAppend569
    BiliClient.prefs.v569suffixAutoAppend569 = !current
    AppToast.show(this, "Suffix Auto Append569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569SummaryAutoGenerate569Toggle() {
    val current = BiliClient.prefs.v569summaryAutoGenerate569
    BiliClient.prefs.v569summaryAutoGenerate569 = !current
    AppToast.show(this, "Summary Auto Generate569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569SwapAutoChannel569Toggle() {
    val current = BiliClient.prefs.v569swapAutoChannel569
    BiliClient.prefs.v569swapAutoChannel569 = !current
    AppToast.show(this, "Swap Auto Channel569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569SwitchAutoProfile569Toggle() {
    val current = BiliClient.prefs.v569switchAutoProfile569
    BiliClient.prefs.v569switchAutoProfile569 = !current
    AppToast.show(this, "Switch Auto Profile569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569TabAutoRestore569Toggle() {
    val current = BiliClient.prefs.v569tabAutoRestore569
    BiliClient.prefs.v569tabAutoRestore569 = !current
    AppToast.show(this, "Tab Auto Restore569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569TagAutoExtract569Toggle() {
    val current = BiliClient.prefs.v569tagAutoExtract569
    BiliClient.prefs.v569tagAutoExtract569 = !current
    AppToast.show(this, "Tag Auto Extract569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569TargetAutoLock569Toggle() {
    val current = BiliClient.prefs.v569targetAutoLock569
    BiliClient.prefs.v569targetAutoLock569 = !current
    AppToast.show(this, "Target Auto Lock569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569TemplateAutoFill569Toggle() {
    val current = BiliClient.prefs.v569templateAutoFill569
    BiliClient.prefs.v569templateAutoFill569 = !current
    AppToast.show(this, "Template Auto Fill569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV569TestAutoRun569Toggle() {
    val current = BiliClient.prefs.v569testAutoRun569
    BiliClient.prefs.v569testAutoRun569 = !current
    AppToast.show(this, "Test Auto Run569: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570StaticIpAutoDetect570Toggle() {
    val current = BiliClient.prefs.v570staticIpAutoDetect570
    BiliClient.prefs.v570staticIpAutoDetect570 = !current
    AppToast.show(this, "Static IP Auto Detect570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570StepAutoIncrement570Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v570stepAutoIncrement570).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Step Auto Increment570",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v570stepAutoIncrement570 = value
        AppToast.show(this, "Step Auto Increment570: $value")
    }
}

internal fun PlayerActivity.showV570StopAutoConfirm570Toggle() {
    val current = BiliClient.prefs.v570stopAutoConfirm570
    BiliClient.prefs.v570stopAutoConfirm570 = !current
    AppToast.show(this, "Stop Auto Confirm570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570StoreAutoSync570Toggle() {
    val current = BiliClient.prefs.v570storeAutoSync570
    BiliClient.prefs.v570storeAutoSync570 = !current
    AppToast.show(this, "Store Auto Sync570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570StyleAutoTheme570Toggle() {
    val current = BiliClient.prefs.v570styleAutoTheme570
    BiliClient.prefs.v570styleAutoTheme570 = !current
    AppToast.show(this, "Style Auto Theme570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570SubmitAutoValidate570Toggle() {
    val current = BiliClient.prefs.v570submitAutoValidate570
    BiliClient.prefs.v570submitAutoValidate570 = !current
    AppToast.show(this, "Submit Auto Validate570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570SuffixAutoAppend570Toggle() {
    val current = BiliClient.prefs.v570suffixAutoAppend570
    BiliClient.prefs.v570suffixAutoAppend570 = !current
    AppToast.show(this, "Suffix Auto Append570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570SummaryAutoGenerate570Toggle() {
    val current = BiliClient.prefs.v570summaryAutoGenerate570
    BiliClient.prefs.v570summaryAutoGenerate570 = !current
    AppToast.show(this, "Summary Auto Generate570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570SwapAutoChannel570Toggle() {
    val current = BiliClient.prefs.v570swapAutoChannel570
    BiliClient.prefs.v570swapAutoChannel570 = !current
    AppToast.show(this, "Swap Auto Channel570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570SwitchAutoProfile570Toggle() {
    val current = BiliClient.prefs.v570switchAutoProfile570
    BiliClient.prefs.v570switchAutoProfile570 = !current
    AppToast.show(this, "Switch Auto Profile570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570TabAutoRestore570Toggle() {
    val current = BiliClient.prefs.v570tabAutoRestore570
    BiliClient.prefs.v570tabAutoRestore570 = !current
    AppToast.show(this, "Tab Auto Restore570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570TagAutoExtract570Toggle() {
    val current = BiliClient.prefs.v570tagAutoExtract570
    BiliClient.prefs.v570tagAutoExtract570 = !current
    AppToast.show(this, "Tag Auto Extract570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570TargetAutoLock570Toggle() {
    val current = BiliClient.prefs.v570targetAutoLock570
    BiliClient.prefs.v570targetAutoLock570 = !current
    AppToast.show(this, "Target Auto Lock570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570TemplateAutoFill570Toggle() {
    val current = BiliClient.prefs.v570templateAutoFill570
    BiliClient.prefs.v570templateAutoFill570 = !current
    AppToast.show(this, "Template Auto Fill570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV570TestAutoRun570Toggle() {
    val current = BiliClient.prefs.v570testAutoRun570
    BiliClient.prefs.v570testAutoRun570 = !current
    AppToast.show(this, "Test Auto Run570: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TextAutoDetect571Toggle() {
    val current = BiliClient.prefs.v571textAutoDetect571
    BiliClient.prefs.v571textAutoDetect571 = !current
    AppToast.show(this, "Text Auto Detect571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571ThemeAutoSwitch571Toggle() {
    val current = BiliClient.prefs.v571themeAutoSwitch571
    BiliClient.prefs.v571themeAutoSwitch571 = !current
    AppToast.show(this, "Theme Auto Switch571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571ThresholdAutoSet571Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v571thresholdAutoSet571).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set571",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v571thresholdAutoSet571 = value
        AppToast.show(this, "Threshold Auto Set571: $value")
    }
}

internal fun PlayerActivity.showV571TileAutoLayout571Toggle() {
    val current = BiliClient.prefs.v571tileAutoLayout571
    BiliClient.prefs.v571tileAutoLayout571 = !current
    AppToast.show(this, "Tile Auto Layout571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TipAutoShow571Toggle() {
    val current = BiliClient.prefs.v571tipAutoShow571
    BiliClient.prefs.v571tipAutoShow571 = !current
    AppToast.show(this, "Tip Auto Show571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TokenAutoRefresh571Toggle() {
    val current = BiliClient.prefs.v571tokenAutoRefresh571
    BiliClient.prefs.v571tokenAutoRefresh571 = !current
    AppToast.show(this, "Token Auto Refresh571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TopAutoRank571Toggle() {
    val current = BiliClient.prefs.v571topAutoRank571
    BiliClient.prefs.v571topAutoRank571 = !current
    AppToast.show(this, "Top Auto Rank571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TraceAutoLog571Toggle() {
    val current = BiliClient.prefs.v571traceAutoLog571
    BiliClient.prefs.v571traceAutoLog571 = !current
    AppToast.show(this, "Trace Auto Log571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TransferAutoResume571Toggle() {
    val current = BiliClient.prefs.v571transferAutoResume571
    BiliClient.prefs.v571transferAutoResume571 = !current
    AppToast.show(this, "Transfer Auto Resume571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TransformAutoCrop571Toggle() {
    val current = BiliClient.prefs.v571transformAutoCrop571
    BiliClient.prefs.v571transformAutoCrop571 = !current
    AppToast.show(this, "Transform Auto Crop571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TranslateAutoDetect571Toggle() {
    val current = BiliClient.prefs.v571translateAutoDetect571
    BiliClient.prefs.v571translateAutoDetect571 = !current
    AppToast.show(this, "Translate Auto Detect571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TriggerAutoFire571Toggle() {
    val current = BiliClient.prefs.v571triggerAutoFire571
    BiliClient.prefs.v571triggerAutoFire571 = !current
    AppToast.show(this, "Trigger Auto Fire571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TrimAutoClean571Toggle() {
    val current = BiliClient.prefs.v571trimAutoClean571
    BiliClient.prefs.v571trimAutoClean571 = !current
    AppToast.show(this, "Trim Auto Clean571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TuneAutoEqualizer571Toggle() {
    val current = BiliClient.prefs.v571tuneAutoEqualizer571
    BiliClient.prefs.v571tuneAutoEqualizer571 = !current
    AppToast.show(this, "Tune Auto Equalizer571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV571TypeAutoInfer571Toggle() {
    val current = BiliClient.prefs.v571typeAutoInfer571
    BiliClient.prefs.v571typeAutoInfer571 = !current
    AppToast.show(this, "Type Auto Infer571: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TextAutoDetect572Toggle() {
    val current = BiliClient.prefs.v572textAutoDetect572
    BiliClient.prefs.v572textAutoDetect572 = !current
    AppToast.show(this, "Text Auto Detect572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572ThemeAutoSwitch572Toggle() {
    val current = BiliClient.prefs.v572themeAutoSwitch572
    BiliClient.prefs.v572themeAutoSwitch572 = !current
    AppToast.show(this, "Theme Auto Switch572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572ThresholdAutoSet572Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v572thresholdAutoSet572).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set572",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v572thresholdAutoSet572 = value
        AppToast.show(this, "Threshold Auto Set572: $value")
    }
}

internal fun PlayerActivity.showV572TileAutoLayout572Toggle() {
    val current = BiliClient.prefs.v572tileAutoLayout572
    BiliClient.prefs.v572tileAutoLayout572 = !current
    AppToast.show(this, "Tile Auto Layout572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TipAutoShow572Toggle() {
    val current = BiliClient.prefs.v572tipAutoShow572
    BiliClient.prefs.v572tipAutoShow572 = !current
    AppToast.show(this, "Tip Auto Show572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TokenAutoRefresh572Toggle() {
    val current = BiliClient.prefs.v572tokenAutoRefresh572
    BiliClient.prefs.v572tokenAutoRefresh572 = !current
    AppToast.show(this, "Token Auto Refresh572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TopAutoRank572Toggle() {
    val current = BiliClient.prefs.v572topAutoRank572
    BiliClient.prefs.v572topAutoRank572 = !current
    AppToast.show(this, "Top Auto Rank572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TraceAutoLog572Toggle() {
    val current = BiliClient.prefs.v572traceAutoLog572
    BiliClient.prefs.v572traceAutoLog572 = !current
    AppToast.show(this, "Trace Auto Log572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TransferAutoResume572Toggle() {
    val current = BiliClient.prefs.v572transferAutoResume572
    BiliClient.prefs.v572transferAutoResume572 = !current
    AppToast.show(this, "Transfer Auto Resume572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TransformAutoCrop572Toggle() {
    val current = BiliClient.prefs.v572transformAutoCrop572
    BiliClient.prefs.v572transformAutoCrop572 = !current
    AppToast.show(this, "Transform Auto Crop572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TranslateAutoDetect572Toggle() {
    val current = BiliClient.prefs.v572translateAutoDetect572
    BiliClient.prefs.v572translateAutoDetect572 = !current
    AppToast.show(this, "Translate Auto Detect572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TriggerAutoFire572Toggle() {
    val current = BiliClient.prefs.v572triggerAutoFire572
    BiliClient.prefs.v572triggerAutoFire572 = !current
    AppToast.show(this, "Trigger Auto Fire572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TrimAutoClean572Toggle() {
    val current = BiliClient.prefs.v572trimAutoClean572
    BiliClient.prefs.v572trimAutoClean572 = !current
    AppToast.show(this, "Trim Auto Clean572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TuneAutoEqualizer572Toggle() {
    val current = BiliClient.prefs.v572tuneAutoEqualizer572
    BiliClient.prefs.v572tuneAutoEqualizer572 = !current
    AppToast.show(this, "Tune Auto Equalizer572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV572TypeAutoInfer572Toggle() {
    val current = BiliClient.prefs.v572typeAutoInfer572
    BiliClient.prefs.v572typeAutoInfer572 = !current
    AppToast.show(this, "Type Auto Infer572: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TextAutoDetect573Toggle() {
    val current = BiliClient.prefs.v573textAutoDetect573
    BiliClient.prefs.v573textAutoDetect573 = !current
    AppToast.show(this, "Text Auto Detect573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573ThemeAutoSwitch573Toggle() {
    val current = BiliClient.prefs.v573themeAutoSwitch573
    BiliClient.prefs.v573themeAutoSwitch573 = !current
    AppToast.show(this, "Theme Auto Switch573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573ThresholdAutoSet573Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v573thresholdAutoSet573).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set573",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v573thresholdAutoSet573 = value
        AppToast.show(this, "Threshold Auto Set573: $value")
    }
}

internal fun PlayerActivity.showV573TileAutoLayout573Toggle() {
    val current = BiliClient.prefs.v573tileAutoLayout573
    BiliClient.prefs.v573tileAutoLayout573 = !current
    AppToast.show(this, "Tile Auto Layout573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TipAutoShow573Toggle() {
    val current = BiliClient.prefs.v573tipAutoShow573
    BiliClient.prefs.v573tipAutoShow573 = !current
    AppToast.show(this, "Tip Auto Show573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TokenAutoRefresh573Toggle() {
    val current = BiliClient.prefs.v573tokenAutoRefresh573
    BiliClient.prefs.v573tokenAutoRefresh573 = !current
    AppToast.show(this, "Token Auto Refresh573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TopAutoRank573Toggle() {
    val current = BiliClient.prefs.v573topAutoRank573
    BiliClient.prefs.v573topAutoRank573 = !current
    AppToast.show(this, "Top Auto Rank573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TraceAutoLog573Toggle() {
    val current = BiliClient.prefs.v573traceAutoLog573
    BiliClient.prefs.v573traceAutoLog573 = !current
    AppToast.show(this, "Trace Auto Log573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TransferAutoResume573Toggle() {
    val current = BiliClient.prefs.v573transferAutoResume573
    BiliClient.prefs.v573transferAutoResume573 = !current
    AppToast.show(this, "Transfer Auto Resume573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TransformAutoCrop573Toggle() {
    val current = BiliClient.prefs.v573transformAutoCrop573
    BiliClient.prefs.v573transformAutoCrop573 = !current
    AppToast.show(this, "Transform Auto Crop573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TranslateAutoDetect573Toggle() {
    val current = BiliClient.prefs.v573translateAutoDetect573
    BiliClient.prefs.v573translateAutoDetect573 = !current
    AppToast.show(this, "Translate Auto Detect573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TriggerAutoFire573Toggle() {
    val current = BiliClient.prefs.v573triggerAutoFire573
    BiliClient.prefs.v573triggerAutoFire573 = !current
    AppToast.show(this, "Trigger Auto Fire573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TrimAutoClean573Toggle() {
    val current = BiliClient.prefs.v573trimAutoClean573
    BiliClient.prefs.v573trimAutoClean573 = !current
    AppToast.show(this, "Trim Auto Clean573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TuneAutoEqualizer573Toggle() {
    val current = BiliClient.prefs.v573tuneAutoEqualizer573
    BiliClient.prefs.v573tuneAutoEqualizer573 = !current
    AppToast.show(this, "Tune Auto Equalizer573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV573TypeAutoInfer573Toggle() {
    val current = BiliClient.prefs.v573typeAutoInfer573
    BiliClient.prefs.v573typeAutoInfer573 = !current
    AppToast.show(this, "Type Auto Infer573: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TextAutoDetect574Toggle() {
    val current = BiliClient.prefs.v574textAutoDetect574
    BiliClient.prefs.v574textAutoDetect574 = !current
    AppToast.show(this, "Text Auto Detect574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574ThemeAutoSwitch574Toggle() {
    val current = BiliClient.prefs.v574themeAutoSwitch574
    BiliClient.prefs.v574themeAutoSwitch574 = !current
    AppToast.show(this, "Theme Auto Switch574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574ThresholdAutoSet574Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v574thresholdAutoSet574).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Threshold Auto Set574",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v574thresholdAutoSet574 = value
        AppToast.show(this, "Threshold Auto Set574: $value")
    }
}

internal fun PlayerActivity.showV574TileAutoLayout574Toggle() {
    val current = BiliClient.prefs.v574tileAutoLayout574
    BiliClient.prefs.v574tileAutoLayout574 = !current
    AppToast.show(this, "Tile Auto Layout574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TipAutoShow574Toggle() {
    val current = BiliClient.prefs.v574tipAutoShow574
    BiliClient.prefs.v574tipAutoShow574 = !current
    AppToast.show(this, "Tip Auto Show574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TokenAutoRefresh574Toggle() {
    val current = BiliClient.prefs.v574tokenAutoRefresh574
    BiliClient.prefs.v574tokenAutoRefresh574 = !current
    AppToast.show(this, "Token Auto Refresh574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TopAutoRank574Toggle() {
    val current = BiliClient.prefs.v574topAutoRank574
    BiliClient.prefs.v574topAutoRank574 = !current
    AppToast.show(this, "Top Auto Rank574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TraceAutoLog574Toggle() {
    val current = BiliClient.prefs.v574traceAutoLog574
    BiliClient.prefs.v574traceAutoLog574 = !current
    AppToast.show(this, "Trace Auto Log574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TransferAutoResume574Toggle() {
    val current = BiliClient.prefs.v574transferAutoResume574
    BiliClient.prefs.v574transferAutoResume574 = !current
    AppToast.show(this, "Transfer Auto Resume574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TransformAutoCrop574Toggle() {
    val current = BiliClient.prefs.v574transformAutoCrop574
    BiliClient.prefs.v574transformAutoCrop574 = !current
    AppToast.show(this, "Transform Auto Crop574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TranslateAutoDetect574Toggle() {
    val current = BiliClient.prefs.v574translateAutoDetect574
    BiliClient.prefs.v574translateAutoDetect574 = !current
    AppToast.show(this, "Translate Auto Detect574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TriggerAutoFire574Toggle() {
    val current = BiliClient.prefs.v574triggerAutoFire574
    BiliClient.prefs.v574triggerAutoFire574 = !current
    AppToast.show(this, "Trigger Auto Fire574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TrimAutoClean574Toggle() {
    val current = BiliClient.prefs.v574trimAutoClean574
    BiliClient.prefs.v574trimAutoClean574 = !current
    AppToast.show(this, "Trim Auto Clean574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TuneAutoEqualizer574Toggle() {
    val current = BiliClient.prefs.v574tuneAutoEqualizer574
    BiliClient.prefs.v574tuneAutoEqualizer574 = !current
    AppToast.show(this, "Tune Auto Equalizer574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV574TypeAutoInfer574Toggle() {
    val current = BiliClient.prefs.v574typeAutoInfer574
    BiliClient.prefs.v574typeAutoInfer574 = !current
    AppToast.show(this, "Type Auto Infer574: ${if (!current) "ON" else "OFF"}")
}

internal fun PlayerActivity.showV575TextAutoDetect575Toggle() {
    val current = BiliClient.prefs.v575textAutoDetect575
    BiliClient.prefs.v575textAutoDetect575 = !current
    AppToast.show(this, "Text Auto Detect575: ${if (!current) "ON" else "OFF"}")
}

