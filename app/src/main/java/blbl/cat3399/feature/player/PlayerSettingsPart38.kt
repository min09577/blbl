package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.AppToast


// v516: Ready State Auto516
internal fun PlayerActivity.showV516ReadyStateAuto516Toggle() {
    val current = BiliClient.prefs.v516readyStateAuto516
    BiliClient.prefs.v516readyStateAuto516 = !current
    AppToast.show(this, "Ready State Auto516: ${if (!current) "ON" else "OFF"}")
}

// v516: Real Time Sync516
internal fun PlayerActivity.showV516RealTimeSync516Toggle() {
    val current = BiliClient.prefs.v516realTimeSync516
    BiliClient.prefs.v516realTimeSync516 = !current
    AppToast.show(this, "Real Time Sync516: ${if (!current) "ON" else "OFF"}")
}

// v516: Rebuild Auto Index516
internal fun PlayerActivity.showV516RebuildAutoIndex516Toggle() {
    val current = BiliClient.prefs.v516rebuildAutoIndex516
    BiliClient.prefs.v516rebuildAutoIndex516 = !current
    AppToast.show(this, "Rebuild Auto Index516: ${if (!current) "ON" else "OFF"}")
}

// v516: Recent Auto Clean516
internal fun PlayerActivity.showV516RecentAutoClean516Toggle() {
    val current = BiliClient.prefs.v516recentAutoClean516
    BiliClient.prefs.v516recentAutoClean516 = !current
    AppToast.show(this, "Recent Auto Clean516: ${if (!current) "ON" else "OFF"}")
}

// v516: Recover Auto Backup516
internal fun PlayerActivity.showV516RecoverAutoBackup516Toggle() {
    val current = BiliClient.prefs.v516recoverAutoBackup516
    BiliClient.prefs.v516recoverAutoBackup516 = !current
    AppToast.show(this, "Recover Auto Backup516: ${if (!current) "ON" else "OFF"}")
}

// v516: Region Auto Select516
internal fun PlayerActivity.showV516RegionAutoSelect516Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v516regionAutoSelect516).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select516",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v516regionAutoSelect516 = value
        AppToast.show(this, "Region Auto Select516: $value")
    }
}

// v516: Remote Auto Connect516
internal fun PlayerActivity.showV516RemoteAutoConnect516Toggle() {
    val current = BiliClient.prefs.v516remoteAutoConnect516
    BiliClient.prefs.v516remoteAutoConnect516 = !current
    AppToast.show(this, "Remote Auto Connect516: ${if (!current) "ON" else "OFF"}")
}

// v517: Progress Auto Save517
internal fun PlayerActivity.showV517ProgressAutoSave517Toggle() {
    val current = BiliClient.prefs.v517progressAutoSave517
    BiliClient.prefs.v517progressAutoSave517 = !current
    AppToast.show(this, "Progress Auto Save517: ${if (!current) "ON" else "OFF"}")
}

// v517: Project Auto Sync517
internal fun PlayerActivity.showV517ProjectAutoSync517Toggle() {
    val current = BiliClient.prefs.v517projectAutoSync517
    BiliClient.prefs.v517projectAutoSync517 = !current
    AppToast.show(this, "Project Auto Sync517: ${if (!current) "ON" else "OFF"}")
}

// v517: Prompt Auto Show517
internal fun PlayerActivity.showV517PromptAutoShow517Toggle() {
    val current = BiliClient.prefs.v517promptAutoShow517
    BiliClient.prefs.v517promptAutoShow517 = !current
    AppToast.show(this, "Prompt Auto Show517: ${if (!current) "ON" else "OFF"}")
}

// v517: Push Notification Auto517
internal fun PlayerActivity.showV517PushNotificationAuto517Toggle() {
    val current = BiliClient.prefs.v517pushNotificationAuto517
    BiliClient.prefs.v517pushNotificationAuto517 = !current
    AppToast.show(this, "Push Notification Auto517: ${if (!current) "ON" else "OFF"}")
}

// v517: Range Auto Detect517
internal fun PlayerActivity.showV517RangeAutoDetect517Toggle() {
    val current = BiliClient.prefs.v517rangeAutoDetect517
    BiliClient.prefs.v517rangeAutoDetect517 = !current
    AppToast.show(this, "Range Auto Detect517: ${if (!current) "ON" else "OFF"}")
}

// v517: Rate Auto Adjust517
internal fun PlayerActivity.showV517RateAutoAdjust517Toggle() {
    val current = BiliClient.prefs.v517rateAutoAdjust517
    BiliClient.prefs.v517rateAutoAdjust517 = !current
    AppToast.show(this, "Rate Auto Adjust517: ${if (!current) "ON" else "OFF"}")
}

// v517: Raw Format Enabled517
internal fun PlayerActivity.showV517RawFormatEnabled517Toggle() {
    val current = BiliClient.prefs.v517rawFormatEnabled517
    BiliClient.prefs.v517rawFormatEnabled517 = !current
    AppToast.show(this, "Raw Format Enabled517: ${if (!current) "ON" else "OFF"}")
}

// v517: Read Auto Scroll517
internal fun PlayerActivity.showV517ReadAutoScroll517Toggle() {
    val current = BiliClient.prefs.v517readAutoScroll517
    BiliClient.prefs.v517readAutoScroll517 = !current
    AppToast.show(this, "Read Auto Scroll517: ${if (!current) "ON" else "OFF"}")
}

// v517: Ready State Auto517
internal fun PlayerActivity.showV517ReadyStateAuto517Toggle() {
    val current = BiliClient.prefs.v517readyStateAuto517
    BiliClient.prefs.v517readyStateAuto517 = !current
    AppToast.show(this, "Ready State Auto517: ${if (!current) "ON" else "OFF"}")
}

// v517: Real Time Sync517
internal fun PlayerActivity.showV517RealTimeSync517Toggle() {
    val current = BiliClient.prefs.v517realTimeSync517
    BiliClient.prefs.v517realTimeSync517 = !current
    AppToast.show(this, "Real Time Sync517: ${if (!current) "ON" else "OFF"}")
}

// v517: Rebuild Auto Index517
internal fun PlayerActivity.showV517RebuildAutoIndex517Toggle() {
    val current = BiliClient.prefs.v517rebuildAutoIndex517
    BiliClient.prefs.v517rebuildAutoIndex517 = !current
    AppToast.show(this, "Rebuild Auto Index517: ${if (!current) "ON" else "OFF"}")
}

// v517: Recent Auto Clean517
internal fun PlayerActivity.showV517RecentAutoClean517Toggle() {
    val current = BiliClient.prefs.v517recentAutoClean517
    BiliClient.prefs.v517recentAutoClean517 = !current
    AppToast.show(this, "Recent Auto Clean517: ${if (!current) "ON" else "OFF"}")
}

// v517: Recover Auto Backup517
internal fun PlayerActivity.showV517RecoverAutoBackup517Toggle() {
    val current = BiliClient.prefs.v517recoverAutoBackup517
    BiliClient.prefs.v517recoverAutoBackup517 = !current
    AppToast.show(this, "Recover Auto Backup517: ${if (!current) "ON" else "OFF"}")
}

// v517: Region Auto Select517
internal fun PlayerActivity.showV517RegionAutoSelect517Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v517regionAutoSelect517).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select517",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v517regionAutoSelect517 = value
        AppToast.show(this, "Region Auto Select517: $value")
    }
}

// v517: Remote Auto Connect517
internal fun PlayerActivity.showV517RemoteAutoConnect517Toggle() {
    val current = BiliClient.prefs.v517remoteAutoConnect517
    BiliClient.prefs.v517remoteAutoConnect517 = !current
    AppToast.show(this, "Remote Auto Connect517: ${if (!current) "ON" else "OFF"}")
}

// v518: Progress Auto Save518
internal fun PlayerActivity.showV518ProgressAutoSave518Toggle() {
    val current = BiliClient.prefs.v518progressAutoSave518
    BiliClient.prefs.v518progressAutoSave518 = !current
    AppToast.show(this, "Progress Auto Save518: ${if (!current) "ON" else "OFF"}")
}

// v518: Project Auto Sync518
internal fun PlayerActivity.showV518ProjectAutoSync518Toggle() {
    val current = BiliClient.prefs.v518projectAutoSync518
    BiliClient.prefs.v518projectAutoSync518 = !current
    AppToast.show(this, "Project Auto Sync518: ${if (!current) "ON" else "OFF"}")
}

// v518: Prompt Auto Show518
internal fun PlayerActivity.showV518PromptAutoShow518Toggle() {
    val current = BiliClient.prefs.v518promptAutoShow518
    BiliClient.prefs.v518promptAutoShow518 = !current
    AppToast.show(this, "Prompt Auto Show518: ${if (!current) "ON" else "OFF"}")
}

// v518: Push Notification Auto518
internal fun PlayerActivity.showV518PushNotificationAuto518Toggle() {
    val current = BiliClient.prefs.v518pushNotificationAuto518
    BiliClient.prefs.v518pushNotificationAuto518 = !current
    AppToast.show(this, "Push Notification Auto518: ${if (!current) "ON" else "OFF"}")
}

// v518: Range Auto Detect518
internal fun PlayerActivity.showV518RangeAutoDetect518Toggle() {
    val current = BiliClient.prefs.v518rangeAutoDetect518
    BiliClient.prefs.v518rangeAutoDetect518 = !current
    AppToast.show(this, "Range Auto Detect518: ${if (!current) "ON" else "OFF"}")
}

// v518: Rate Auto Adjust518
internal fun PlayerActivity.showV518RateAutoAdjust518Toggle() {
    val current = BiliClient.prefs.v518rateAutoAdjust518
    BiliClient.prefs.v518rateAutoAdjust518 = !current
    AppToast.show(this, "Rate Auto Adjust518: ${if (!current) "ON" else "OFF"}")
}

// v518: Raw Format Enabled518
internal fun PlayerActivity.showV518RawFormatEnabled518Toggle() {
    val current = BiliClient.prefs.v518rawFormatEnabled518
    BiliClient.prefs.v518rawFormatEnabled518 = !current
    AppToast.show(this, "Raw Format Enabled518: ${if (!current) "ON" else "OFF"}")
}

// v518: Read Auto Scroll518
internal fun PlayerActivity.showV518ReadAutoScroll518Toggle() {
    val current = BiliClient.prefs.v518readAutoScroll518
    BiliClient.prefs.v518readAutoScroll518 = !current
    AppToast.show(this, "Read Auto Scroll518: ${if (!current) "ON" else "OFF"}")
}

// v518: Ready State Auto518
internal fun PlayerActivity.showV518ReadyStateAuto518Toggle() {
    val current = BiliClient.prefs.v518readyStateAuto518
    BiliClient.prefs.v518readyStateAuto518 = !current
    AppToast.show(this, "Ready State Auto518: ${if (!current) "ON" else "OFF"}")
}

// v518: Real Time Sync518
internal fun PlayerActivity.showV518RealTimeSync518Toggle() {
    val current = BiliClient.prefs.v518realTimeSync518
    BiliClient.prefs.v518realTimeSync518 = !current
    AppToast.show(this, "Real Time Sync518: ${if (!current) "ON" else "OFF"}")
}

// v518: Rebuild Auto Index518
internal fun PlayerActivity.showV518RebuildAutoIndex518Toggle() {
    val current = BiliClient.prefs.v518rebuildAutoIndex518
    BiliClient.prefs.v518rebuildAutoIndex518 = !current
    AppToast.show(this, "Rebuild Auto Index518: ${if (!current) "ON" else "OFF"}")
}

// v518: Recent Auto Clean518
internal fun PlayerActivity.showV518RecentAutoClean518Toggle() {
    val current = BiliClient.prefs.v518recentAutoClean518
    BiliClient.prefs.v518recentAutoClean518 = !current
    AppToast.show(this, "Recent Auto Clean518: ${if (!current) "ON" else "OFF"}")
}

// v518: Recover Auto Backup518
internal fun PlayerActivity.showV518RecoverAutoBackup518Toggle() {
    val current = BiliClient.prefs.v518recoverAutoBackup518
    BiliClient.prefs.v518recoverAutoBackup518 = !current
    AppToast.show(this, "Recover Auto Backup518: ${if (!current) "ON" else "OFF"}")
}

// v518: Region Auto Select518
internal fun PlayerActivity.showV518RegionAutoSelect518Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v518regionAutoSelect518).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select518",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v518regionAutoSelect518 = value
        AppToast.show(this, "Region Auto Select518: $value")
    }
}

// v518: Remote Auto Connect518
internal fun PlayerActivity.showV518RemoteAutoConnect518Toggle() {
    val current = BiliClient.prefs.v518remoteAutoConnect518
    BiliClient.prefs.v518remoteAutoConnect518 = !current
    AppToast.show(this, "Remote Auto Connect518: ${if (!current) "ON" else "OFF"}")
}

// v519: Progress Auto Save519
internal fun PlayerActivity.showV519ProgressAutoSave519Toggle() {
    val current = BiliClient.prefs.v519progressAutoSave519
    BiliClient.prefs.v519progressAutoSave519 = !current
    AppToast.show(this, "Progress Auto Save519: ${if (!current) "ON" else "OFF"}")
}

// v519: Project Auto Sync519
internal fun PlayerActivity.showV519ProjectAutoSync519Toggle() {
    val current = BiliClient.prefs.v519projectAutoSync519
    BiliClient.prefs.v519projectAutoSync519 = !current
    AppToast.show(this, "Project Auto Sync519: ${if (!current) "ON" else "OFF"}")
}

// v519: Prompt Auto Show519
internal fun PlayerActivity.showV519PromptAutoShow519Toggle() {
    val current = BiliClient.prefs.v519promptAutoShow519
    BiliClient.prefs.v519promptAutoShow519 = !current
    AppToast.show(this, "Prompt Auto Show519: ${if (!current) "ON" else "OFF"}")
}

// v519: Push Notification Auto519
internal fun PlayerActivity.showV519PushNotificationAuto519Toggle() {
    val current = BiliClient.prefs.v519pushNotificationAuto519
    BiliClient.prefs.v519pushNotificationAuto519 = !current
    AppToast.show(this, "Push Notification Auto519: ${if (!current) "ON" else "OFF"}")
}

// v519: Range Auto Detect519
internal fun PlayerActivity.showV519RangeAutoDetect519Toggle() {
    val current = BiliClient.prefs.v519rangeAutoDetect519
    BiliClient.prefs.v519rangeAutoDetect519 = !current
    AppToast.show(this, "Range Auto Detect519: ${if (!current) "ON" else "OFF"}")
}

// v519: Rate Auto Adjust519
internal fun PlayerActivity.showV519RateAutoAdjust519Toggle() {
    val current = BiliClient.prefs.v519rateAutoAdjust519
    BiliClient.prefs.v519rateAutoAdjust519 = !current
    AppToast.show(this, "Rate Auto Adjust519: ${if (!current) "ON" else "OFF"}")
}

// v519: Raw Format Enabled519
internal fun PlayerActivity.showV519RawFormatEnabled519Toggle() {
    val current = BiliClient.prefs.v519rawFormatEnabled519
    BiliClient.prefs.v519rawFormatEnabled519 = !current
    AppToast.show(this, "Raw Format Enabled519: ${if (!current) "ON" else "OFF"}")
}

// v519: Read Auto Scroll519
internal fun PlayerActivity.showV519ReadAutoScroll519Toggle() {
    val current = BiliClient.prefs.v519readAutoScroll519
    BiliClient.prefs.v519readAutoScroll519 = !current
    AppToast.show(this, "Read Auto Scroll519: ${if (!current) "ON" else "OFF"}")
}

// v519: Ready State Auto519
internal fun PlayerActivity.showV519ReadyStateAuto519Toggle() {
    val current = BiliClient.prefs.v519readyStateAuto519
    BiliClient.prefs.v519readyStateAuto519 = !current
    AppToast.show(this, "Ready State Auto519: ${if (!current) "ON" else "OFF"}")
}

// v519: Real Time Sync519
internal fun PlayerActivity.showV519RealTimeSync519Toggle() {
    val current = BiliClient.prefs.v519realTimeSync519
    BiliClient.prefs.v519realTimeSync519 = !current
    AppToast.show(this, "Real Time Sync519: ${if (!current) "ON" else "OFF"}")
}

// v519: Rebuild Auto Index519
internal fun PlayerActivity.showV519RebuildAutoIndex519Toggle() {
    val current = BiliClient.prefs.v519rebuildAutoIndex519
    BiliClient.prefs.v519rebuildAutoIndex519 = !current
    AppToast.show(this, "Rebuild Auto Index519: ${if (!current) "ON" else "OFF"}")
}

// v519: Recent Auto Clean519
internal fun PlayerActivity.showV519RecentAutoClean519Toggle() {
    val current = BiliClient.prefs.v519recentAutoClean519
    BiliClient.prefs.v519recentAutoClean519 = !current
    AppToast.show(this, "Recent Auto Clean519: ${if (!current) "ON" else "OFF"}")
}

// v519: Recover Auto Backup519
internal fun PlayerActivity.showV519RecoverAutoBackup519Toggle() {
    val current = BiliClient.prefs.v519recoverAutoBackup519
    BiliClient.prefs.v519recoverAutoBackup519 = !current
    AppToast.show(this, "Recover Auto Backup519: ${if (!current) "ON" else "OFF"}")
}

// v519: Region Auto Select519
internal fun PlayerActivity.showV519RegionAutoSelect519Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v519regionAutoSelect519).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select519",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v519regionAutoSelect519 = value
        AppToast.show(this, "Region Auto Select519: $value")
    }
}

// v519: Remote Auto Connect519
internal fun PlayerActivity.showV519RemoteAutoConnect519Toggle() {
    val current = BiliClient.prefs.v519remoteAutoConnect519
    BiliClient.prefs.v519remoteAutoConnect519 = !current
    AppToast.show(this, "Remote Auto Connect519: ${if (!current) "ON" else "OFF"}")
}

// v520: Progress Auto Save520
internal fun PlayerActivity.showV520ProgressAutoSave520Toggle() {
    val current = BiliClient.prefs.v520progressAutoSave520
    BiliClient.prefs.v520progressAutoSave520 = !current
    AppToast.show(this, "Progress Auto Save520: ${if (!current) "ON" else "OFF"}")
}

// v520: Project Auto Sync520
internal fun PlayerActivity.showV520ProjectAutoSync520Toggle() {
    val current = BiliClient.prefs.v520projectAutoSync520
    BiliClient.prefs.v520projectAutoSync520 = !current
    AppToast.show(this, "Project Auto Sync520: ${if (!current) "ON" else "OFF"}")
}

// v520: Prompt Auto Show520
internal fun PlayerActivity.showV520PromptAutoShow520Toggle() {
    val current = BiliClient.prefs.v520promptAutoShow520
    BiliClient.prefs.v520promptAutoShow520 = !current
    AppToast.show(this, "Prompt Auto Show520: ${if (!current) "ON" else "OFF"}")
}

// v520: Push Notification Auto520
internal fun PlayerActivity.showV520PushNotificationAuto520Toggle() {
    val current = BiliClient.prefs.v520pushNotificationAuto520
    BiliClient.prefs.v520pushNotificationAuto520 = !current
    AppToast.show(this, "Push Notification Auto520: ${if (!current) "ON" else "OFF"}")
}

// v520: Range Auto Detect520
internal fun PlayerActivity.showV520RangeAutoDetect520Toggle() {
    val current = BiliClient.prefs.v520rangeAutoDetect520
    BiliClient.prefs.v520rangeAutoDetect520 = !current
    AppToast.show(this, "Range Auto Detect520: ${if (!current) "ON" else "OFF"}")
}

// v520: Rate Auto Adjust520
internal fun PlayerActivity.showV520RateAutoAdjust520Toggle() {
    val current = BiliClient.prefs.v520rateAutoAdjust520
    BiliClient.prefs.v520rateAutoAdjust520 = !current
    AppToast.show(this, "Rate Auto Adjust520: ${if (!current) "ON" else "OFF"}")
}

// v520: Raw Format Enabled520
internal fun PlayerActivity.showV520RawFormatEnabled520Toggle() {
    val current = BiliClient.prefs.v520rawFormatEnabled520
    BiliClient.prefs.v520rawFormatEnabled520 = !current
    AppToast.show(this, "Raw Format Enabled520: ${if (!current) "ON" else "OFF"}")
}

// v520: Read Auto Scroll520
internal fun PlayerActivity.showV520ReadAutoScroll520Toggle() {
    val current = BiliClient.prefs.v520readAutoScroll520
    BiliClient.prefs.v520readAutoScroll520 = !current
    AppToast.show(this, "Read Auto Scroll520: ${if (!current) "ON" else "OFF"}")
}

// v520: Ready State Auto520
internal fun PlayerActivity.showV520ReadyStateAuto520Toggle() {
    val current = BiliClient.prefs.v520readyStateAuto520
    BiliClient.prefs.v520readyStateAuto520 = !current
    AppToast.show(this, "Ready State Auto520: ${if (!current) "ON" else "OFF"}")
}

// v520: Real Time Sync520
internal fun PlayerActivity.showV520RealTimeSync520Toggle() {
    val current = BiliClient.prefs.v520realTimeSync520
    BiliClient.prefs.v520realTimeSync520 = !current
    AppToast.show(this, "Real Time Sync520: ${if (!current) "ON" else "OFF"}")
}

// v520: Rebuild Auto Index520
internal fun PlayerActivity.showV520RebuildAutoIndex520Toggle() {
    val current = BiliClient.prefs.v520rebuildAutoIndex520
    BiliClient.prefs.v520rebuildAutoIndex520 = !current
    AppToast.show(this, "Rebuild Auto Index520: ${if (!current) "ON" else "OFF"}")
}

// v520: Recent Auto Clean520
internal fun PlayerActivity.showV520RecentAutoClean520Toggle() {
    val current = BiliClient.prefs.v520recentAutoClean520
    BiliClient.prefs.v520recentAutoClean520 = !current
    AppToast.show(this, "Recent Auto Clean520: ${if (!current) "ON" else "OFF"}")
}

// v520: Recover Auto Backup520
internal fun PlayerActivity.showV520RecoverAutoBackup520Toggle() {
    val current = BiliClient.prefs.v520recoverAutoBackup520
    BiliClient.prefs.v520recoverAutoBackup520 = !current
    AppToast.show(this, "Recover Auto Backup520: ${if (!current) "ON" else "OFF"}")
}

// v520: Region Auto Select520
internal fun PlayerActivity.showV520RegionAutoSelect520Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v520regionAutoSelect520).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Region Auto Select520",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v520regionAutoSelect520 = value
        AppToast.show(this, "Region Auto Select520: $value")
    }
}

// v520: Remote Auto Connect520
internal fun PlayerActivity.showV520RemoteAutoConnect520Toggle() {
    val current = BiliClient.prefs.v520remoteAutoConnect520
    BiliClient.prefs.v520remoteAutoConnect520 = !current
    AppToast.show(this, "Remote Auto Connect520: ${if (!current) "ON" else "OFF"}")
}

// v521: Remove Auto Confirm521
internal fun PlayerActivity.showV521RemoveAutoConfirm521Toggle() {
    val current = BiliClient.prefs.v521removeAutoConfirm521
    BiliClient.prefs.v521removeAutoConfirm521 = !current
    AppToast.show(this, "Remove Auto Confirm521: ${if (!current) "ON" else "OFF"}")
}

// v521: Render Auto Quality521
internal fun PlayerActivity.showV521RenderAutoQuality521Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v521renderAutoQuality521).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality521",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v521renderAutoQuality521 = value
        AppToast.show(this, "Render Auto Quality521: $value")
    }
}

// v521: Request Auto Retry521
internal fun PlayerActivity.showV521RequestAutoRetry521Toggle() {
    val current = BiliClient.prefs.v521requestAutoRetry521
    BiliClient.prefs.v521requestAutoRetry521 = !current
    AppToast.show(this, "Request Auto Retry521: ${if (!current) "ON" else "OFF"}")
}

// v521: Reset Auto Default521
internal fun PlayerActivity.showV521ResetAutoDefault521Toggle() {
    val current = BiliClient.prefs.v521resetAutoDefault521
    BiliClient.prefs.v521resetAutoDefault521 = !current
    AppToast.show(this, "Reset Auto Default521: ${if (!current) "ON" else "OFF"}")
}

// v521: Resize Auto Scale521
internal fun PlayerActivity.showV521ResizeAutoScale521Toggle() {
    val current = BiliClient.prefs.v521resizeAutoScale521
    BiliClient.prefs.v521resizeAutoScale521 = !current
    AppToast.show(this, "Resize Auto Scale521: ${if (!current) "ON" else "OFF"}")
}

// v521: Response Auto Cache521
internal fun PlayerActivity.showV521ResponseAutoCache521Toggle() {
    val current = BiliClient.prefs.v521responseAutoCache521
    BiliClient.prefs.v521responseAutoCache521 = !current
    AppToast.show(this, "Response Auto Cache521: ${if (!current) "ON" else "OFF"}")
}

// v521: Restore Auto State521
internal fun PlayerActivity.showV521RestoreAutoState521Toggle() {
    val current = BiliClient.prefs.v521restoreAutoState521
    BiliClient.prefs.v521restoreAutoState521 = !current
    AppToast.show(this, "Restore Auto State521: ${if (!current) "ON" else "OFF"}")
}

// v521: Result Auto Sort521
internal fun PlayerActivity.showV521ResultAutoSort521Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v521resultAutoSort521).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort521",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v521resultAutoSort521 = value
        AppToast.show(this, "Result Auto Sort521: $value")
    }
}

// v521: Return To Top521
internal fun PlayerActivity.showV521ReturnToTop521Toggle() {
    val current = BiliClient.prefs.v521returnToTop521
    BiliClient.prefs.v521returnToTop521 = !current
    AppToast.show(this, "Return To Top521: ${if (!current) "ON" else "OFF"}")
}

// v521: Rich Text Enabled521
internal fun PlayerActivity.showV521RichTextEnabled521Toggle() {
    val current = BiliClient.prefs.v521richTextEnabled521
    BiliClient.prefs.v521richTextEnabled521 = !current
    AppToast.show(this, "Rich Text Enabled521: ${if (!current) "ON" else "OFF"}")
}

// v521: Ring Auto Vibrate521
internal fun PlayerActivity.showV521RingAutoVibrate521Toggle() {
    val current = BiliClient.prefs.v521ringAutoVibrate521
    BiliClient.prefs.v521ringAutoVibrate521 = !current
    AppToast.show(this, "Ring Auto Vibrate521: ${if (!current) "ON" else "OFF"}")
}

// v521: Root Auto Detect521
internal fun PlayerActivity.showV521RootAutoDetect521Toggle() {
    val current = BiliClient.prefs.v521rootAutoDetect521
    BiliClient.prefs.v521rootAutoDetect521 = !current
    AppToast.show(this, "Root Auto Detect521: ${if (!current) "ON" else "OFF"}")
}

// v521: Round Corner Enabled521
internal fun PlayerActivity.showV521RoundCornerEnabled521Toggle() {
    val current = BiliClient.prefs.v521roundCornerEnabled521
    BiliClient.prefs.v521roundCornerEnabled521 = !current
    AppToast.show(this, "Round Corner Enabled521: ${if (!current) "ON" else "OFF"}")
}

// v521: Row Auto Expand521
internal fun PlayerActivity.showV521RowAutoExpand521Toggle() {
    val current = BiliClient.prefs.v521rowAutoExpand521
    BiliClient.prefs.v521rowAutoExpand521 = !current
    AppToast.show(this, "Row Auto Expand521: ${if (!current) "ON" else "OFF"}")
}

// v521: Rule Auto Apply521
internal fun PlayerActivity.showV521RuleAutoApply521Toggle() {
    val current = BiliClient.prefs.v521ruleAutoApply521
    BiliClient.prefs.v521ruleAutoApply521 = !current
    AppToast.show(this, "Rule Auto Apply521: ${if (!current) "ON" else "OFF"}")
}

// v522: Remove Auto Confirm522
internal fun PlayerActivity.showV522RemoveAutoConfirm522Toggle() {
    val current = BiliClient.prefs.v522removeAutoConfirm522
    BiliClient.prefs.v522removeAutoConfirm522 = !current
    AppToast.show(this, "Remove Auto Confirm522: ${if (!current) "ON" else "OFF"}")
}

// v522: Render Auto Quality522
internal fun PlayerActivity.showV522RenderAutoQuality522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522renderAutoQuality522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522renderAutoQuality522 = value
        AppToast.show(this, "Render Auto Quality522: $value")
    }
}

// v522: Request Auto Retry522
internal fun PlayerActivity.showV522RequestAutoRetry522Toggle() {
    val current = BiliClient.prefs.v522requestAutoRetry522
    BiliClient.prefs.v522requestAutoRetry522 = !current
    AppToast.show(this, "Request Auto Retry522: ${if (!current) "ON" else "OFF"}")
}

// v522: Reset Auto Default522
internal fun PlayerActivity.showV522ResetAutoDefault522Toggle() {
    val current = BiliClient.prefs.v522resetAutoDefault522
    BiliClient.prefs.v522resetAutoDefault522 = !current
    AppToast.show(this, "Reset Auto Default522: ${if (!current) "ON" else "OFF"}")
}

// v522: Resize Auto Scale522
internal fun PlayerActivity.showV522ResizeAutoScale522Toggle() {
    val current = BiliClient.prefs.v522resizeAutoScale522
    BiliClient.prefs.v522resizeAutoScale522 = !current
    AppToast.show(this, "Resize Auto Scale522: ${if (!current) "ON" else "OFF"}")
}

// v522: Response Auto Cache522
internal fun PlayerActivity.showV522ResponseAutoCache522Toggle() {
    val current = BiliClient.prefs.v522responseAutoCache522
    BiliClient.prefs.v522responseAutoCache522 = !current
    AppToast.show(this, "Response Auto Cache522: ${if (!current) "ON" else "OFF"}")
}

// v522: Restore Auto State522
internal fun PlayerActivity.showV522RestoreAutoState522Toggle() {
    val current = BiliClient.prefs.v522restoreAutoState522
    BiliClient.prefs.v522restoreAutoState522 = !current
    AppToast.show(this, "Restore Auto State522: ${if (!current) "ON" else "OFF"}")
}

// v522: Result Auto Sort522
internal fun PlayerActivity.showV522ResultAutoSort522Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v522resultAutoSort522).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort522",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v522resultAutoSort522 = value
        AppToast.show(this, "Result Auto Sort522: $value")
    }
}

// v522: Return To Top522
internal fun PlayerActivity.showV522ReturnToTop522Toggle() {
    val current = BiliClient.prefs.v522returnToTop522
    BiliClient.prefs.v522returnToTop522 = !current
    AppToast.show(this, "Return To Top522: ${if (!current) "ON" else "OFF"}")
}

// v522: Rich Text Enabled522
internal fun PlayerActivity.showV522RichTextEnabled522Toggle() {
    val current = BiliClient.prefs.v522richTextEnabled522
    BiliClient.prefs.v522richTextEnabled522 = !current
    AppToast.show(this, "Rich Text Enabled522: ${if (!current) "ON" else "OFF"}")
}

// v522: Ring Auto Vibrate522
internal fun PlayerActivity.showV522RingAutoVibrate522Toggle() {
    val current = BiliClient.prefs.v522ringAutoVibrate522
    BiliClient.prefs.v522ringAutoVibrate522 = !current
    AppToast.show(this, "Ring Auto Vibrate522: ${if (!current) "ON" else "OFF"}")
}

// v522: Root Auto Detect522
internal fun PlayerActivity.showV522RootAutoDetect522Toggle() {
    val current = BiliClient.prefs.v522rootAutoDetect522
    BiliClient.prefs.v522rootAutoDetect522 = !current
    AppToast.show(this, "Root Auto Detect522: ${if (!current) "ON" else "OFF"}")
}

// v522: Round Corner Enabled522
internal fun PlayerActivity.showV522RoundCornerEnabled522Toggle() {
    val current = BiliClient.prefs.v522roundCornerEnabled522
    BiliClient.prefs.v522roundCornerEnabled522 = !current
    AppToast.show(this, "Round Corner Enabled522: ${if (!current) "ON" else "OFF"}")
}

// v522: Row Auto Expand522
internal fun PlayerActivity.showV522RowAutoExpand522Toggle() {
    val current = BiliClient.prefs.v522rowAutoExpand522
    BiliClient.prefs.v522rowAutoExpand522 = !current
    AppToast.show(this, "Row Auto Expand522: ${if (!current) "ON" else "OFF"}")
}

// v522: Rule Auto Apply522
internal fun PlayerActivity.showV522RuleAutoApply522Toggle() {
    val current = BiliClient.prefs.v522ruleAutoApply522
    BiliClient.prefs.v522ruleAutoApply522 = !current
    AppToast.show(this, "Rule Auto Apply522: ${if (!current) "ON" else "OFF"}")
}

// v523: Remove Auto Confirm523
internal fun PlayerActivity.showV523RemoveAutoConfirm523Toggle() {
    val current = BiliClient.prefs.v523removeAutoConfirm523
    BiliClient.prefs.v523removeAutoConfirm523 = !current
    AppToast.show(this, "Remove Auto Confirm523: ${if (!current) "ON" else "OFF"}")
}

// v523: Render Auto Quality523
internal fun PlayerActivity.showV523RenderAutoQuality523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523renderAutoQuality523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523renderAutoQuality523 = value
        AppToast.show(this, "Render Auto Quality523: $value")
    }
}

// v523: Request Auto Retry523
internal fun PlayerActivity.showV523RequestAutoRetry523Toggle() {
    val current = BiliClient.prefs.v523requestAutoRetry523
    BiliClient.prefs.v523requestAutoRetry523 = !current
    AppToast.show(this, "Request Auto Retry523: ${if (!current) "ON" else "OFF"}")
}

// v523: Reset Auto Default523
internal fun PlayerActivity.showV523ResetAutoDefault523Toggle() {
    val current = BiliClient.prefs.v523resetAutoDefault523
    BiliClient.prefs.v523resetAutoDefault523 = !current
    AppToast.show(this, "Reset Auto Default523: ${if (!current) "ON" else "OFF"}")
}

// v523: Resize Auto Scale523
internal fun PlayerActivity.showV523ResizeAutoScale523Toggle() {
    val current = BiliClient.prefs.v523resizeAutoScale523
    BiliClient.prefs.v523resizeAutoScale523 = !current
    AppToast.show(this, "Resize Auto Scale523: ${if (!current) "ON" else "OFF"}")
}

// v523: Response Auto Cache523
internal fun PlayerActivity.showV523ResponseAutoCache523Toggle() {
    val current = BiliClient.prefs.v523responseAutoCache523
    BiliClient.prefs.v523responseAutoCache523 = !current
    AppToast.show(this, "Response Auto Cache523: ${if (!current) "ON" else "OFF"}")
}

// v523: Restore Auto State523
internal fun PlayerActivity.showV523RestoreAutoState523Toggle() {
    val current = BiliClient.prefs.v523restoreAutoState523
    BiliClient.prefs.v523restoreAutoState523 = !current
    AppToast.show(this, "Restore Auto State523: ${if (!current) "ON" else "OFF"}")
}

// v523: Result Auto Sort523
internal fun PlayerActivity.showV523ResultAutoSort523Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v523resultAutoSort523).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort523",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v523resultAutoSort523 = value
        AppToast.show(this, "Result Auto Sort523: $value")
    }
}

// v523: Return To Top523
internal fun PlayerActivity.showV523ReturnToTop523Toggle() {
    val current = BiliClient.prefs.v523returnToTop523
    BiliClient.prefs.v523returnToTop523 = !current
    AppToast.show(this, "Return To Top523: ${if (!current) "ON" else "OFF"}")
}

// v523: Rich Text Enabled523
internal fun PlayerActivity.showV523RichTextEnabled523Toggle() {
    val current = BiliClient.prefs.v523richTextEnabled523
    BiliClient.prefs.v523richTextEnabled523 = !current
    AppToast.show(this, "Rich Text Enabled523: ${if (!current) "ON" else "OFF"}")
}

// v523: Ring Auto Vibrate523
internal fun PlayerActivity.showV523RingAutoVibrate523Toggle() {
    val current = BiliClient.prefs.v523ringAutoVibrate523
    BiliClient.prefs.v523ringAutoVibrate523 = !current
    AppToast.show(this, "Ring Auto Vibrate523: ${if (!current) "ON" else "OFF"}")
}

// v523: Root Auto Detect523
internal fun PlayerActivity.showV523RootAutoDetect523Toggle() {
    val current = BiliClient.prefs.v523rootAutoDetect523
    BiliClient.prefs.v523rootAutoDetect523 = !current
    AppToast.show(this, "Root Auto Detect523: ${if (!current) "ON" else "OFF"}")
}

// v523: Round Corner Enabled523
internal fun PlayerActivity.showV523RoundCornerEnabled523Toggle() {
    val current = BiliClient.prefs.v523roundCornerEnabled523
    BiliClient.prefs.v523roundCornerEnabled523 = !current
    AppToast.show(this, "Round Corner Enabled523: ${if (!current) "ON" else "OFF"}")
}

// v523: Row Auto Expand523
internal fun PlayerActivity.showV523RowAutoExpand523Toggle() {
    val current = BiliClient.prefs.v523rowAutoExpand523
    BiliClient.prefs.v523rowAutoExpand523 = !current
    AppToast.show(this, "Row Auto Expand523: ${if (!current) "ON" else "OFF"}")
}

// v523: Rule Auto Apply523
internal fun PlayerActivity.showV523RuleAutoApply523Toggle() {
    val current = BiliClient.prefs.v523ruleAutoApply523
    BiliClient.prefs.v523ruleAutoApply523 = !current
    AppToast.show(this, "Rule Auto Apply523: ${if (!current) "ON" else "OFF"}")
}

// v524: Remove Auto Confirm524
internal fun PlayerActivity.showV524RemoveAutoConfirm524Toggle() {
    val current = BiliClient.prefs.v524removeAutoConfirm524
    BiliClient.prefs.v524removeAutoConfirm524 = !current
    AppToast.show(this, "Remove Auto Confirm524: ${if (!current) "ON" else "OFF"}")
}

// v524: Render Auto Quality524
internal fun PlayerActivity.showV524RenderAutoQuality524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524renderAutoQuality524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524renderAutoQuality524 = value
        AppToast.show(this, "Render Auto Quality524: $value")
    }
}

// v524: Request Auto Retry524
internal fun PlayerActivity.showV524RequestAutoRetry524Toggle() {
    val current = BiliClient.prefs.v524requestAutoRetry524
    BiliClient.prefs.v524requestAutoRetry524 = !current
    AppToast.show(this, "Request Auto Retry524: ${if (!current) "ON" else "OFF"}")
}

// v524: Reset Auto Default524
internal fun PlayerActivity.showV524ResetAutoDefault524Toggle() {
    val current = BiliClient.prefs.v524resetAutoDefault524
    BiliClient.prefs.v524resetAutoDefault524 = !current
    AppToast.show(this, "Reset Auto Default524: ${if (!current) "ON" else "OFF"}")
}

// v524: Resize Auto Scale524
internal fun PlayerActivity.showV524ResizeAutoScale524Toggle() {
    val current = BiliClient.prefs.v524resizeAutoScale524
    BiliClient.prefs.v524resizeAutoScale524 = !current
    AppToast.show(this, "Resize Auto Scale524: ${if (!current) "ON" else "OFF"}")
}

// v524: Response Auto Cache524
internal fun PlayerActivity.showV524ResponseAutoCache524Toggle() {
    val current = BiliClient.prefs.v524responseAutoCache524
    BiliClient.prefs.v524responseAutoCache524 = !current
    AppToast.show(this, "Response Auto Cache524: ${if (!current) "ON" else "OFF"}")
}

// v524: Restore Auto State524
internal fun PlayerActivity.showV524RestoreAutoState524Toggle() {
    val current = BiliClient.prefs.v524restoreAutoState524
    BiliClient.prefs.v524restoreAutoState524 = !current
    AppToast.show(this, "Restore Auto State524: ${if (!current) "ON" else "OFF"}")
}

// v524: Result Auto Sort524
internal fun PlayerActivity.showV524ResultAutoSort524Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v524resultAutoSort524).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort524",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v524resultAutoSort524 = value
        AppToast.show(this, "Result Auto Sort524: $value")
    }
}

// v524: Return To Top524
internal fun PlayerActivity.showV524ReturnToTop524Toggle() {
    val current = BiliClient.prefs.v524returnToTop524
    BiliClient.prefs.v524returnToTop524 = !current
    AppToast.show(this, "Return To Top524: ${if (!current) "ON" else "OFF"}")
}

// v524: Rich Text Enabled524
internal fun PlayerActivity.showV524RichTextEnabled524Toggle() {
    val current = BiliClient.prefs.v524richTextEnabled524
    BiliClient.prefs.v524richTextEnabled524 = !current
    AppToast.show(this, "Rich Text Enabled524: ${if (!current) "ON" else "OFF"}")
}

// v524: Ring Auto Vibrate524
internal fun PlayerActivity.showV524RingAutoVibrate524Toggle() {
    val current = BiliClient.prefs.v524ringAutoVibrate524
    BiliClient.prefs.v524ringAutoVibrate524 = !current
    AppToast.show(this, "Ring Auto Vibrate524: ${if (!current) "ON" else "OFF"}")
}

// v524: Root Auto Detect524
internal fun PlayerActivity.showV524RootAutoDetect524Toggle() {
    val current = BiliClient.prefs.v524rootAutoDetect524
    BiliClient.prefs.v524rootAutoDetect524 = !current
    AppToast.show(this, "Root Auto Detect524: ${if (!current) "ON" else "OFF"}")
}

// v524: Round Corner Enabled524
internal fun PlayerActivity.showV524RoundCornerEnabled524Toggle() {
    val current = BiliClient.prefs.v524roundCornerEnabled524
    BiliClient.prefs.v524roundCornerEnabled524 = !current
    AppToast.show(this, "Round Corner Enabled524: ${if (!current) "ON" else "OFF"}")
}

// v524: Row Auto Expand524
internal fun PlayerActivity.showV524RowAutoExpand524Toggle() {
    val current = BiliClient.prefs.v524rowAutoExpand524
    BiliClient.prefs.v524rowAutoExpand524 = !current
    AppToast.show(this, "Row Auto Expand524: ${if (!current) "ON" else "OFF"}")
}

// v524: Rule Auto Apply524
internal fun PlayerActivity.showV524RuleAutoApply524Toggle() {
    val current = BiliClient.prefs.v524ruleAutoApply524
    BiliClient.prefs.v524ruleAutoApply524 = !current
    AppToast.show(this, "Rule Auto Apply524: ${if (!current) "ON" else "OFF"}")
}

// v525: Remove Auto Confirm525
internal fun PlayerActivity.showV525RemoveAutoConfirm525Toggle() {
    val current = BiliClient.prefs.v525removeAutoConfirm525
    BiliClient.prefs.v525removeAutoConfirm525 = !current
    AppToast.show(this, "Remove Auto Confirm525: ${if (!current) "ON" else "OFF"}")
}

// v525: Render Auto Quality525
internal fun PlayerActivity.showV525RenderAutoQuality525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525renderAutoQuality525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525renderAutoQuality525 = value
        AppToast.show(this, "Render Auto Quality525: $value")
    }
}

// v525: Request Auto Retry525
internal fun PlayerActivity.showV525RequestAutoRetry525Toggle() {
    val current = BiliClient.prefs.v525requestAutoRetry525
    BiliClient.prefs.v525requestAutoRetry525 = !current
    AppToast.show(this, "Request Auto Retry525: ${if (!current) "ON" else "OFF"}")
}

// v525: Reset Auto Default525
internal fun PlayerActivity.showV525ResetAutoDefault525Toggle() {
    val current = BiliClient.prefs.v525resetAutoDefault525
    BiliClient.prefs.v525resetAutoDefault525 = !current
    AppToast.show(this, "Reset Auto Default525: ${if (!current) "ON" else "OFF"}")
}

// v525: Resize Auto Scale525
internal fun PlayerActivity.showV525ResizeAutoScale525Toggle() {
    val current = BiliClient.prefs.v525resizeAutoScale525
    BiliClient.prefs.v525resizeAutoScale525 = !current
    AppToast.show(this, "Resize Auto Scale525: ${if (!current) "ON" else "OFF"}")
}

// v525: Response Auto Cache525
internal fun PlayerActivity.showV525ResponseAutoCache525Toggle() {
    val current = BiliClient.prefs.v525responseAutoCache525
    BiliClient.prefs.v525responseAutoCache525 = !current
    AppToast.show(this, "Response Auto Cache525: ${if (!current) "ON" else "OFF"}")
}

// v525: Restore Auto State525
internal fun PlayerActivity.showV525RestoreAutoState525Toggle() {
    val current = BiliClient.prefs.v525restoreAutoState525
    BiliClient.prefs.v525restoreAutoState525 = !current
    AppToast.show(this, "Restore Auto State525: ${if (!current) "ON" else "OFF"}")
}

// v525: Result Auto Sort525
internal fun PlayerActivity.showV525ResultAutoSort525Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v525resultAutoSort525).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort525",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v525resultAutoSort525 = value
        AppToast.show(this, "Result Auto Sort525: $value")
    }
}

// v525: Return To Top525
internal fun PlayerActivity.showV525ReturnToTop525Toggle() {
    val current = BiliClient.prefs.v525returnToTop525
    BiliClient.prefs.v525returnToTop525 = !current
    AppToast.show(this, "Return To Top525: ${if (!current) "ON" else "OFF"}")
}

// v525: Rich Text Enabled525
internal fun PlayerActivity.showV525RichTextEnabled525Toggle() {
    val current = BiliClient.prefs.v525richTextEnabled525
    BiliClient.prefs.v525richTextEnabled525 = !current
    AppToast.show(this, "Rich Text Enabled525: ${if (!current) "ON" else "OFF"}")
}

// v525: Ring Auto Vibrate525
internal fun PlayerActivity.showV525RingAutoVibrate525Toggle() {
    val current = BiliClient.prefs.v525ringAutoVibrate525
    BiliClient.prefs.v525ringAutoVibrate525 = !current
    AppToast.show(this, "Ring Auto Vibrate525: ${if (!current) "ON" else "OFF"}")
}

// v525: Root Auto Detect525
internal fun PlayerActivity.showV525RootAutoDetect525Toggle() {
    val current = BiliClient.prefs.v525rootAutoDetect525
    BiliClient.prefs.v525rootAutoDetect525 = !current
    AppToast.show(this, "Root Auto Detect525: ${if (!current) "ON" else "OFF"}")
}

// v525: Round Corner Enabled525
internal fun PlayerActivity.showV525RoundCornerEnabled525Toggle() {
    val current = BiliClient.prefs.v525roundCornerEnabled525
    BiliClient.prefs.v525roundCornerEnabled525 = !current
    AppToast.show(this, "Round Corner Enabled525: ${if (!current) "ON" else "OFF"}")
}

// v525: Row Auto Expand525
internal fun PlayerActivity.showV525RowAutoExpand525Toggle() {
    val current = BiliClient.prefs.v525rowAutoExpand525
    BiliClient.prefs.v525rowAutoExpand525 = !current
    AppToast.show(this, "Row Auto Expand525: ${if (!current) "ON" else "OFF"}")
}

// v525: Rule Auto Apply525
internal fun PlayerActivity.showV525RuleAutoApply525Toggle() {
    val current = BiliClient.prefs.v525ruleAutoApply525
    BiliClient.prefs.v525ruleAutoApply525 = !current
    AppToast.show(this, "Rule Auto Apply525: ${if (!current) "ON" else "OFF"}")
}

// v526: Remove Auto Confirm526
internal fun PlayerActivity.showV526RemoveAutoConfirm526Toggle() {
    val current = BiliClient.prefs.v526removeAutoConfirm526
    BiliClient.prefs.v526removeAutoConfirm526 = !current
    AppToast.show(this, "Remove Auto Confirm526: ${if (!current) "ON" else "OFF"}")
}

// v526: Render Auto Quality526
internal fun PlayerActivity.showV526RenderAutoQuality526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526renderAutoQuality526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526renderAutoQuality526 = value
        AppToast.show(this, "Render Auto Quality526: $value")
    }
}

// v526: Request Auto Retry526
internal fun PlayerActivity.showV526RequestAutoRetry526Toggle() {
    val current = BiliClient.prefs.v526requestAutoRetry526
    BiliClient.prefs.v526requestAutoRetry526 = !current
    AppToast.show(this, "Request Auto Retry526: ${if (!current) "ON" else "OFF"}")
}

// v526: Reset Auto Default526
internal fun PlayerActivity.showV526ResetAutoDefault526Toggle() {
    val current = BiliClient.prefs.v526resetAutoDefault526
    BiliClient.prefs.v526resetAutoDefault526 = !current
    AppToast.show(this, "Reset Auto Default526: ${if (!current) "ON" else "OFF"}")
}

// v526: Resize Auto Scale526
internal fun PlayerActivity.showV526ResizeAutoScale526Toggle() {
    val current = BiliClient.prefs.v526resizeAutoScale526
    BiliClient.prefs.v526resizeAutoScale526 = !current
    AppToast.show(this, "Resize Auto Scale526: ${if (!current) "ON" else "OFF"}")
}

// v526: Response Auto Cache526
internal fun PlayerActivity.showV526ResponseAutoCache526Toggle() {
    val current = BiliClient.prefs.v526responseAutoCache526
    BiliClient.prefs.v526responseAutoCache526 = !current
    AppToast.show(this, "Response Auto Cache526: ${if (!current) "ON" else "OFF"}")
}

// v526: Restore Auto State526
internal fun PlayerActivity.showV526RestoreAutoState526Toggle() {
    val current = BiliClient.prefs.v526restoreAutoState526
    BiliClient.prefs.v526restoreAutoState526 = !current
    AppToast.show(this, "Restore Auto State526: ${if (!current) "ON" else "OFF"}")
}

// v526: Result Auto Sort526
internal fun PlayerActivity.showV526ResultAutoSort526Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v526resultAutoSort526).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort526",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v526resultAutoSort526 = value
        AppToast.show(this, "Result Auto Sort526: $value")
    }
}

// v526: Return To Top526
internal fun PlayerActivity.showV526ReturnToTop526Toggle() {
    val current = BiliClient.prefs.v526returnToTop526
    BiliClient.prefs.v526returnToTop526 = !current
    AppToast.show(this, "Return To Top526: ${if (!current) "ON" else "OFF"}")
}

// v526: Rich Text Enabled526
internal fun PlayerActivity.showV526RichTextEnabled526Toggle() {
    val current = BiliClient.prefs.v526richTextEnabled526
    BiliClient.prefs.v526richTextEnabled526 = !current
    AppToast.show(this, "Rich Text Enabled526: ${if (!current) "ON" else "OFF"}")
}

// v526: Ring Auto Vibrate526
internal fun PlayerActivity.showV526RingAutoVibrate526Toggle() {
    val current = BiliClient.prefs.v526ringAutoVibrate526
    BiliClient.prefs.v526ringAutoVibrate526 = !current
    AppToast.show(this, "Ring Auto Vibrate526: ${if (!current) "ON" else "OFF"}")
}

// v526: Root Auto Detect526
internal fun PlayerActivity.showV526RootAutoDetect526Toggle() {
    val current = BiliClient.prefs.v526rootAutoDetect526
    BiliClient.prefs.v526rootAutoDetect526 = !current
    AppToast.show(this, "Root Auto Detect526: ${if (!current) "ON" else "OFF"}")
}

// v526: Round Corner Enabled526
internal fun PlayerActivity.showV526RoundCornerEnabled526Toggle() {
    val current = BiliClient.prefs.v526roundCornerEnabled526
    BiliClient.prefs.v526roundCornerEnabled526 = !current
    AppToast.show(this, "Round Corner Enabled526: ${if (!current) "ON" else "OFF"}")
}

// v526: Row Auto Expand526
internal fun PlayerActivity.showV526RowAutoExpand526Toggle() {
    val current = BiliClient.prefs.v526rowAutoExpand526
    BiliClient.prefs.v526rowAutoExpand526 = !current
    AppToast.show(this, "Row Auto Expand526: ${if (!current) "ON" else "OFF"}")
}

// v526: Rule Auto Apply526
internal fun PlayerActivity.showV526RuleAutoApply526Toggle() {
    val current = BiliClient.prefs.v526ruleAutoApply526
    BiliClient.prefs.v526ruleAutoApply526 = !current
    AppToast.show(this, "Rule Auto Apply526: ${if (!current) "ON" else "OFF"}")
}

// v527: Remove Auto Confirm527
internal fun PlayerActivity.showV527RemoveAutoConfirm527Toggle() {
    val current = BiliClient.prefs.v527removeAutoConfirm527
    BiliClient.prefs.v527removeAutoConfirm527 = !current
    AppToast.show(this, "Remove Auto Confirm527: ${if (!current) "ON" else "OFF"}")
}

// v527: Render Auto Quality527
internal fun PlayerActivity.showV527RenderAutoQuality527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527renderAutoQuality527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527renderAutoQuality527 = value
        AppToast.show(this, "Render Auto Quality527: $value")
    }
}

// v527: Request Auto Retry527
internal fun PlayerActivity.showV527RequestAutoRetry527Toggle() {
    val current = BiliClient.prefs.v527requestAutoRetry527
    BiliClient.prefs.v527requestAutoRetry527 = !current
    AppToast.show(this, "Request Auto Retry527: ${if (!current) "ON" else "OFF"}")
}

// v527: Reset Auto Default527
internal fun PlayerActivity.showV527ResetAutoDefault527Toggle() {
    val current = BiliClient.prefs.v527resetAutoDefault527
    BiliClient.prefs.v527resetAutoDefault527 = !current
    AppToast.show(this, "Reset Auto Default527: ${if (!current) "ON" else "OFF"}")
}

// v527: Resize Auto Scale527
internal fun PlayerActivity.showV527ResizeAutoScale527Toggle() {
    val current = BiliClient.prefs.v527resizeAutoScale527
    BiliClient.prefs.v527resizeAutoScale527 = !current
    AppToast.show(this, "Resize Auto Scale527: ${if (!current) "ON" else "OFF"}")
}

// v527: Response Auto Cache527
internal fun PlayerActivity.showV527ResponseAutoCache527Toggle() {
    val current = BiliClient.prefs.v527responseAutoCache527
    BiliClient.prefs.v527responseAutoCache527 = !current
    AppToast.show(this, "Response Auto Cache527: ${if (!current) "ON" else "OFF"}")
}

// v527: Restore Auto State527
internal fun PlayerActivity.showV527RestoreAutoState527Toggle() {
    val current = BiliClient.prefs.v527restoreAutoState527
    BiliClient.prefs.v527restoreAutoState527 = !current
    AppToast.show(this, "Restore Auto State527: ${if (!current) "ON" else "OFF"}")
}

// v527: Result Auto Sort527
internal fun PlayerActivity.showV527ResultAutoSort527Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v527resultAutoSort527).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort527",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v527resultAutoSort527 = value
        AppToast.show(this, "Result Auto Sort527: $value")
    }
}

// v527: Return To Top527
internal fun PlayerActivity.showV527ReturnToTop527Toggle() {
    val current = BiliClient.prefs.v527returnToTop527
    BiliClient.prefs.v527returnToTop527 = !current
    AppToast.show(this, "Return To Top527: ${if (!current) "ON" else "OFF"}")
}

// v527: Rich Text Enabled527
internal fun PlayerActivity.showV527RichTextEnabled527Toggle() {
    val current = BiliClient.prefs.v527richTextEnabled527
    BiliClient.prefs.v527richTextEnabled527 = !current
    AppToast.show(this, "Rich Text Enabled527: ${if (!current) "ON" else "OFF"}")
}

// v527: Ring Auto Vibrate527
internal fun PlayerActivity.showV527RingAutoVibrate527Toggle() {
    val current = BiliClient.prefs.v527ringAutoVibrate527
    BiliClient.prefs.v527ringAutoVibrate527 = !current
    AppToast.show(this, "Ring Auto Vibrate527: ${if (!current) "ON" else "OFF"}")
}

// v527: Root Auto Detect527
internal fun PlayerActivity.showV527RootAutoDetect527Toggle() {
    val current = BiliClient.prefs.v527rootAutoDetect527
    BiliClient.prefs.v527rootAutoDetect527 = !current
    AppToast.show(this, "Root Auto Detect527: ${if (!current) "ON" else "OFF"}")
}

// v527: Round Corner Enabled527
internal fun PlayerActivity.showV527RoundCornerEnabled527Toggle() {
    val current = BiliClient.prefs.v527roundCornerEnabled527
    BiliClient.prefs.v527roundCornerEnabled527 = !current
    AppToast.show(this, "Round Corner Enabled527: ${if (!current) "ON" else "OFF"}")
}

// v527: Row Auto Expand527
internal fun PlayerActivity.showV527RowAutoExpand527Toggle() {
    val current = BiliClient.prefs.v527rowAutoExpand527
    BiliClient.prefs.v527rowAutoExpand527 = !current
    AppToast.show(this, "Row Auto Expand527: ${if (!current) "ON" else "OFF"}")
}

// v527: Rule Auto Apply527
internal fun PlayerActivity.showV527RuleAutoApply527Toggle() {
    val current = BiliClient.prefs.v527ruleAutoApply527
    BiliClient.prefs.v527ruleAutoApply527 = !current
    AppToast.show(this, "Rule Auto Apply527: ${if (!current) "ON" else "OFF"}")
}

// v528: Remove Auto Confirm528
internal fun PlayerActivity.showV528RemoveAutoConfirm528Toggle() {
    val current = BiliClient.prefs.v528removeAutoConfirm528
    BiliClient.prefs.v528removeAutoConfirm528 = !current
    AppToast.show(this, "Remove Auto Confirm528: ${if (!current) "ON" else "OFF"}")
}

// v528: Render Auto Quality528
internal fun PlayerActivity.showV528RenderAutoQuality528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528renderAutoQuality528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528renderAutoQuality528 = value
        AppToast.show(this, "Render Auto Quality528: $value")
    }
}

// v528: Request Auto Retry528
internal fun PlayerActivity.showV528RequestAutoRetry528Toggle() {
    val current = BiliClient.prefs.v528requestAutoRetry528
    BiliClient.prefs.v528requestAutoRetry528 = !current
    AppToast.show(this, "Request Auto Retry528: ${if (!current) "ON" else "OFF"}")
}

// v528: Reset Auto Default528
internal fun PlayerActivity.showV528ResetAutoDefault528Toggle() {
    val current = BiliClient.prefs.v528resetAutoDefault528
    BiliClient.prefs.v528resetAutoDefault528 = !current
    AppToast.show(this, "Reset Auto Default528: ${if (!current) "ON" else "OFF"}")
}

// v528: Resize Auto Scale528
internal fun PlayerActivity.showV528ResizeAutoScale528Toggle() {
    val current = BiliClient.prefs.v528resizeAutoScale528
    BiliClient.prefs.v528resizeAutoScale528 = !current
    AppToast.show(this, "Resize Auto Scale528: ${if (!current) "ON" else "OFF"}")
}

// v528: Response Auto Cache528
internal fun PlayerActivity.showV528ResponseAutoCache528Toggle() {
    val current = BiliClient.prefs.v528responseAutoCache528
    BiliClient.prefs.v528responseAutoCache528 = !current
    AppToast.show(this, "Response Auto Cache528: ${if (!current) "ON" else "OFF"}")
}

// v528: Restore Auto State528
internal fun PlayerActivity.showV528RestoreAutoState528Toggle() {
    val current = BiliClient.prefs.v528restoreAutoState528
    BiliClient.prefs.v528restoreAutoState528 = !current
    AppToast.show(this, "Restore Auto State528: ${if (!current) "ON" else "OFF"}")
}

// v528: Result Auto Sort528
internal fun PlayerActivity.showV528ResultAutoSort528Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v528resultAutoSort528).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort528",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v528resultAutoSort528 = value
        AppToast.show(this, "Result Auto Sort528: $value")
    }
}

// v528: Return To Top528
internal fun PlayerActivity.showV528ReturnToTop528Toggle() {
    val current = BiliClient.prefs.v528returnToTop528
    BiliClient.prefs.v528returnToTop528 = !current
    AppToast.show(this, "Return To Top528: ${if (!current) "ON" else "OFF"}")
}

// v528: Rich Text Enabled528
internal fun PlayerActivity.showV528RichTextEnabled528Toggle() {
    val current = BiliClient.prefs.v528richTextEnabled528
    BiliClient.prefs.v528richTextEnabled528 = !current
    AppToast.show(this, "Rich Text Enabled528: ${if (!current) "ON" else "OFF"}")
}

// v528: Ring Auto Vibrate528
internal fun PlayerActivity.showV528RingAutoVibrate528Toggle() {
    val current = BiliClient.prefs.v528ringAutoVibrate528
    BiliClient.prefs.v528ringAutoVibrate528 = !current
    AppToast.show(this, "Ring Auto Vibrate528: ${if (!current) "ON" else "OFF"}")
}

// v528: Root Auto Detect528
internal fun PlayerActivity.showV528RootAutoDetect528Toggle() {
    val current = BiliClient.prefs.v528rootAutoDetect528
    BiliClient.prefs.v528rootAutoDetect528 = !current
    AppToast.show(this, "Root Auto Detect528: ${if (!current) "ON" else "OFF"}")
}

// v528: Round Corner Enabled528
internal fun PlayerActivity.showV528RoundCornerEnabled528Toggle() {
    val current = BiliClient.prefs.v528roundCornerEnabled528
    BiliClient.prefs.v528roundCornerEnabled528 = !current
    AppToast.show(this, "Round Corner Enabled528: ${if (!current) "ON" else "OFF"}")
}

// v528: Row Auto Expand528
internal fun PlayerActivity.showV528RowAutoExpand528Toggle() {
    val current = BiliClient.prefs.v528rowAutoExpand528
    BiliClient.prefs.v528rowAutoExpand528 = !current
    AppToast.show(this, "Row Auto Expand528: ${if (!current) "ON" else "OFF"}")
}

// v528: Rule Auto Apply528
internal fun PlayerActivity.showV528RuleAutoApply528Toggle() {
    val current = BiliClient.prefs.v528ruleAutoApply528
    BiliClient.prefs.v528ruleAutoApply528 = !current
    AppToast.show(this, "Rule Auto Apply528: ${if (!current) "ON" else "OFF"}")
}

// v529: Remove Auto Confirm529
internal fun PlayerActivity.showV529RemoveAutoConfirm529Toggle() {
    val current = BiliClient.prefs.v529removeAutoConfirm529
    BiliClient.prefs.v529removeAutoConfirm529 = !current
    AppToast.show(this, "Remove Auto Confirm529: ${if (!current) "ON" else "OFF"}")
}

// v529: Render Auto Quality529
internal fun PlayerActivity.showV529RenderAutoQuality529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529renderAutoQuality529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Render Auto Quality529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529renderAutoQuality529 = value
        AppToast.show(this, "Render Auto Quality529: $value")
    }
}

// v529: Request Auto Retry529
internal fun PlayerActivity.showV529RequestAutoRetry529Toggle() {
    val current = BiliClient.prefs.v529requestAutoRetry529
    BiliClient.prefs.v529requestAutoRetry529 = !current
    AppToast.show(this, "Request Auto Retry529: ${if (!current) "ON" else "OFF"}")
}

// v529: Reset Auto Default529
internal fun PlayerActivity.showV529ResetAutoDefault529Toggle() {
    val current = BiliClient.prefs.v529resetAutoDefault529
    BiliClient.prefs.v529resetAutoDefault529 = !current
    AppToast.show(this, "Reset Auto Default529: ${if (!current) "ON" else "OFF"}")
}

// v529: Resize Auto Scale529
internal fun PlayerActivity.showV529ResizeAutoScale529Toggle() {
    val current = BiliClient.prefs.v529resizeAutoScale529
    BiliClient.prefs.v529resizeAutoScale529 = !current
    AppToast.show(this, "Resize Auto Scale529: ${if (!current) "ON" else "OFF"}")
}

// v529: Response Auto Cache529
internal fun PlayerActivity.showV529ResponseAutoCache529Toggle() {
    val current = BiliClient.prefs.v529responseAutoCache529
    BiliClient.prefs.v529responseAutoCache529 = !current
    AppToast.show(this, "Response Auto Cache529: ${if (!current) "ON" else "OFF"}")
}

// v529: Restore Auto State529
internal fun PlayerActivity.showV529RestoreAutoState529Toggle() {
    val current = BiliClient.prefs.v529restoreAutoState529
    BiliClient.prefs.v529restoreAutoState529 = !current
    AppToast.show(this, "Restore Auto State529: ${if (!current) "ON" else "OFF"}")
}

// v529: Result Auto Sort529
internal fun PlayerActivity.showV529ResultAutoSort529Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v529resultAutoSort529).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Result Auto Sort529",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v529resultAutoSort529 = value
        AppToast.show(this, "Result Auto Sort529: $value")
    }
}

// v529: Return To Top529
internal fun PlayerActivity.showV529ReturnToTop529Toggle() {
    val current = BiliClient.prefs.v529returnToTop529
    BiliClient.prefs.v529returnToTop529 = !current
    AppToast.show(this, "Return To Top529: ${if (!current) "ON" else "OFF"}")
}

// v529: Rich Text Enabled529
internal fun PlayerActivity.showV529RichTextEnabled529Toggle() {
    val current = BiliClient.prefs.v529richTextEnabled529
    BiliClient.prefs.v529richTextEnabled529 = !current
    AppToast.show(this, "Rich Text Enabled529: ${if (!current) "ON" else "OFF"}")
}

// v529: Ring Auto Vibrate529
internal fun PlayerActivity.showV529RingAutoVibrate529Toggle() {
    val current = BiliClient.prefs.v529ringAutoVibrate529
    BiliClient.prefs.v529ringAutoVibrate529 = !current
    AppToast.show(this, "Ring Auto Vibrate529: ${if (!current) "ON" else "OFF"}")
}

// v529: Root Auto Detect529
internal fun PlayerActivity.showV529RootAutoDetect529Toggle() {
    val current = BiliClient.prefs.v529rootAutoDetect529
    BiliClient.prefs.v529rootAutoDetect529 = !current
    AppToast.show(this, "Root Auto Detect529: ${if (!current) "ON" else "OFF"}")
}

// v529: Round Corner Enabled529
internal fun PlayerActivity.showV529RoundCornerEnabled529Toggle() {
    val current = BiliClient.prefs.v529roundCornerEnabled529
    BiliClient.prefs.v529roundCornerEnabled529 = !current
    AppToast.show(this, "Round Corner Enabled529: ${if (!current) "ON" else "OFF"}")
}

