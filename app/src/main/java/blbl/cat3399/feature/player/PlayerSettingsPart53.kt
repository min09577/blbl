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

// v711: Encode Auto Base64711
internal fun PlayerActivity.showV711EncodeAutoBase64711Toggle() {
    val current = BiliClient.prefs.v711encodeAutoBase64711
    BiliClient.prefs.v711encodeAutoBase64711 = !current
    AppToast.show(this, "Encode Auto Base64711: ${if (!current) "ON" else "OFF"}")
}

// v711: Encrypt Auto Aes711
internal fun PlayerActivity.showV711EncryptAutoAes711Toggle() {
    val current = BiliClient.prefs.v711encryptAutoAes711
    BiliClient.prefs.v711encryptAutoAes711 = !current
    AppToast.show(this, "Encrypt Auto Aes711: ${if (!current) "ON" else "OFF"}")
}

// v711: End Auto Cleanup711
internal fun PlayerActivity.showV711EndAutoCleanup711Toggle() {
    val current = BiliClient.prefs.v711endAutoCleanup711
    BiliClient.prefs.v711endAutoCleanup711 = !current
    AppToast.show(this, "End Auto Cleanup711: ${if (!current) "ON" else "OFF"}")
}

// v711: Engine Auto Switch711
internal fun PlayerActivity.showV711EngineAutoSwitch711Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v711engineAutoSwitch711).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch711",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v711engineAutoSwitch711 = value
        AppToast.show(this, "Engine Auto Switch711: $value")
    }
}

// v711: Enter Auto Fullscreen711
internal fun PlayerActivity.showV711EnterAutoFullscreen711Toggle() {
    val current = BiliClient.prefs.v711enterAutoFullscreen711
    BiliClient.prefs.v711enterAutoFullscreen711 = !current
    AppToast.show(this, "Enter Auto Fullscreen711: ${if (!current) "ON" else "OFF"}")
}

// v711: Entry Auto Validate711
internal fun PlayerActivity.showV711EntryAutoValidate711Toggle() {
    val current = BiliClient.prefs.v711entryAutoValidate711
    BiliClient.prefs.v711entryAutoValidate711 = !current
    AppToast.show(this, "Entry Auto Validate711: ${if (!current) "ON" else "OFF"}")
}

// v711: Env Auto Detect711
internal fun PlayerActivity.showV711EnvAutoDetect711Toggle() {
    val current = BiliClient.prefs.v711envAutoDetect711
    BiliClient.prefs.v711envAutoDetect711 = !current
    AppToast.show(this, "Env Auto Detect711: ${if (!current) "ON" else "OFF"}")
}

// v711: Equal Auto Balance711
internal fun PlayerActivity.showV711EqualAutoBalance711Toggle() {
    val current = BiliClient.prefs.v711equalAutoBalance711
    BiliClient.prefs.v711equalAutoBalance711 = !current
    AppToast.show(this, "Equal Auto Balance711: ${if (!current) "ON" else "OFF"}")
}

// v711: Error Auto Retry711
internal fun PlayerActivity.showV711ErrorAutoRetry711Toggle() {
    val current = BiliClient.prefs.v711errorAutoRetry711
    BiliClient.prefs.v711errorAutoRetry711 = !current
    AppToast.show(this, "Error Auto Retry711: ${if (!current) "ON" else "OFF"}")
}

// v711: Escape Auto Sanitize711
internal fun PlayerActivity.showV711EscapeAutoSanitize711Toggle() {
    val current = BiliClient.prefs.v711escapeAutoSanitize711
    BiliClient.prefs.v711escapeAutoSanitize711 = !current
    AppToast.show(this, "Escape Auto Sanitize711: ${if (!current) "ON" else "OFF"}")
}

// v711: Event Auto Dispatch711
internal fun PlayerActivity.showV711EventAutoDispatch711Toggle() {
    val current = BiliClient.prefs.v711eventAutoDispatch711
    BiliClient.prefs.v711eventAutoDispatch711 = !current
    AppToast.show(this, "Event Auto Dispatch711: ${if (!current) "ON" else "OFF"}")
}

// v711: Execute Auto Task711
internal fun PlayerActivity.showV711ExecuteAutoTask711Toggle() {
    val current = BiliClient.prefs.v711executeAutoTask711
    BiliClient.prefs.v711executeAutoTask711 = !current
    AppToast.show(this, "Execute Auto Task711: ${if (!current) "ON" else "OFF"}")
}

// v711: Exit Auto Confirm711
internal fun PlayerActivity.showV711ExitAutoConfirm711Toggle() {
    val current = BiliClient.prefs.v711exitAutoConfirm711
    BiliClient.prefs.v711exitAutoConfirm711 = !current
    AppToast.show(this, "Exit Auto Confirm711: ${if (!current) "ON" else "OFF"}")
}

// v711: Expand Auto Panel711
internal fun PlayerActivity.showV711ExpandAutoPanel711Toggle() {
    val current = BiliClient.prefs.v711expandAutoPanel711
    BiliClient.prefs.v711expandAutoPanel711 = !current
    AppToast.show(this, "Expand Auto Panel711: ${if (!current) "ON" else "OFF"}")
}

// v711: Expect Auto Timeout711
internal fun PlayerActivity.showV711ExpectAutoTimeout711Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v711expectAutoTimeout711).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout711",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v711expectAutoTimeout711 = value
        AppToast.show(this, "Expect Auto Timeout711: $value")
    }
}

// v712: Encode Auto Base64712
internal fun PlayerActivity.showV712EncodeAutoBase64712Toggle() {
    val current = BiliClient.prefs.v712encodeAutoBase64712
    BiliClient.prefs.v712encodeAutoBase64712 = !current
    AppToast.show(this, "Encode Auto Base64712: ${if (!current) "ON" else "OFF"}")
}

// v712: Encrypt Auto Aes712
internal fun PlayerActivity.showV712EncryptAutoAes712Toggle() {
    val current = BiliClient.prefs.v712encryptAutoAes712
    BiliClient.prefs.v712encryptAutoAes712 = !current
    AppToast.show(this, "Encrypt Auto Aes712: ${if (!current) "ON" else "OFF"}")
}

// v712: End Auto Cleanup712
internal fun PlayerActivity.showV712EndAutoCleanup712Toggle() {
    val current = BiliClient.prefs.v712endAutoCleanup712
    BiliClient.prefs.v712endAutoCleanup712 = !current
    AppToast.show(this, "End Auto Cleanup712: ${if (!current) "ON" else "OFF"}")
}

// v712: Engine Auto Switch712
internal fun PlayerActivity.showV712EngineAutoSwitch712Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v712engineAutoSwitch712).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch712",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v712engineAutoSwitch712 = value
        AppToast.show(this, "Engine Auto Switch712: $value")
    }
}

// v712: Enter Auto Fullscreen712
internal fun PlayerActivity.showV712EnterAutoFullscreen712Toggle() {
    val current = BiliClient.prefs.v712enterAutoFullscreen712
    BiliClient.prefs.v712enterAutoFullscreen712 = !current
    AppToast.show(this, "Enter Auto Fullscreen712: ${if (!current) "ON" else "OFF"}")
}

// v712: Entry Auto Validate712
internal fun PlayerActivity.showV712EntryAutoValidate712Toggle() {
    val current = BiliClient.prefs.v712entryAutoValidate712
    BiliClient.prefs.v712entryAutoValidate712 = !current
    AppToast.show(this, "Entry Auto Validate712: ${if (!current) "ON" else "OFF"}")
}

// v712: Env Auto Detect712
internal fun PlayerActivity.showV712EnvAutoDetect712Toggle() {
    val current = BiliClient.prefs.v712envAutoDetect712
    BiliClient.prefs.v712envAutoDetect712 = !current
    AppToast.show(this, "Env Auto Detect712: ${if (!current) "ON" else "OFF"}")
}

// v712: Equal Auto Balance712
internal fun PlayerActivity.showV712EqualAutoBalance712Toggle() {
    val current = BiliClient.prefs.v712equalAutoBalance712
    BiliClient.prefs.v712equalAutoBalance712 = !current
    AppToast.show(this, "Equal Auto Balance712: ${if (!current) "ON" else "OFF"}")
}

// v712: Error Auto Retry712
internal fun PlayerActivity.showV712ErrorAutoRetry712Toggle() {
    val current = BiliClient.prefs.v712errorAutoRetry712
    BiliClient.prefs.v712errorAutoRetry712 = !current
    AppToast.show(this, "Error Auto Retry712: ${if (!current) "ON" else "OFF"}")
}

// v712: Escape Auto Sanitize712
internal fun PlayerActivity.showV712EscapeAutoSanitize712Toggle() {
    val current = BiliClient.prefs.v712escapeAutoSanitize712
    BiliClient.prefs.v712escapeAutoSanitize712 = !current
    AppToast.show(this, "Escape Auto Sanitize712: ${if (!current) "ON" else "OFF"}")
}

// v712: Event Auto Dispatch712
internal fun PlayerActivity.showV712EventAutoDispatch712Toggle() {
    val current = BiliClient.prefs.v712eventAutoDispatch712
    BiliClient.prefs.v712eventAutoDispatch712 = !current
    AppToast.show(this, "Event Auto Dispatch712: ${if (!current) "ON" else "OFF"}")
}

// v712: Execute Auto Task712
internal fun PlayerActivity.showV712ExecuteAutoTask712Toggle() {
    val current = BiliClient.prefs.v712executeAutoTask712
    BiliClient.prefs.v712executeAutoTask712 = !current
    AppToast.show(this, "Execute Auto Task712: ${if (!current) "ON" else "OFF"}")
}

// v712: Exit Auto Confirm712
internal fun PlayerActivity.showV712ExitAutoConfirm712Toggle() {
    val current = BiliClient.prefs.v712exitAutoConfirm712
    BiliClient.prefs.v712exitAutoConfirm712 = !current
    AppToast.show(this, "Exit Auto Confirm712: ${if (!current) "ON" else "OFF"}")
}

// v712: Expand Auto Panel712
internal fun PlayerActivity.showV712ExpandAutoPanel712Toggle() {
    val current = BiliClient.prefs.v712expandAutoPanel712
    BiliClient.prefs.v712expandAutoPanel712 = !current
    AppToast.show(this, "Expand Auto Panel712: ${if (!current) "ON" else "OFF"}")
}

// v712: Expect Auto Timeout712
internal fun PlayerActivity.showV712ExpectAutoTimeout712Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v712expectAutoTimeout712).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout712",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v712expectAutoTimeout712 = value
        AppToast.show(this, "Expect Auto Timeout712: $value")
    }
}

// v713: Encode Auto Base64713
internal fun PlayerActivity.showV713EncodeAutoBase64713Toggle() {
    val current = BiliClient.prefs.v713encodeAutoBase64713
    BiliClient.prefs.v713encodeAutoBase64713 = !current
    AppToast.show(this, "Encode Auto Base64713: ${if (!current) "ON" else "OFF"}")
}

// v713: Encrypt Auto Aes713
internal fun PlayerActivity.showV713EncryptAutoAes713Toggle() {
    val current = BiliClient.prefs.v713encryptAutoAes713
    BiliClient.prefs.v713encryptAutoAes713 = !current
    AppToast.show(this, "Encrypt Auto Aes713: ${if (!current) "ON" else "OFF"}")
}

// v713: End Auto Cleanup713
internal fun PlayerActivity.showV713EndAutoCleanup713Toggle() {
    val current = BiliClient.prefs.v713endAutoCleanup713
    BiliClient.prefs.v713endAutoCleanup713 = !current
    AppToast.show(this, "End Auto Cleanup713: ${if (!current) "ON" else "OFF"}")
}

// v713: Engine Auto Switch713
internal fun PlayerActivity.showV713EngineAutoSwitch713Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v713engineAutoSwitch713).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch713",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v713engineAutoSwitch713 = value
        AppToast.show(this, "Engine Auto Switch713: $value")
    }
}

// v713: Enter Auto Fullscreen713
internal fun PlayerActivity.showV713EnterAutoFullscreen713Toggle() {
    val current = BiliClient.prefs.v713enterAutoFullscreen713
    BiliClient.prefs.v713enterAutoFullscreen713 = !current
    AppToast.show(this, "Enter Auto Fullscreen713: ${if (!current) "ON" else "OFF"}")
}

// v713: Entry Auto Validate713
internal fun PlayerActivity.showV713EntryAutoValidate713Toggle() {
    val current = BiliClient.prefs.v713entryAutoValidate713
    BiliClient.prefs.v713entryAutoValidate713 = !current
    AppToast.show(this, "Entry Auto Validate713: ${if (!current) "ON" else "OFF"}")
}

// v713: Env Auto Detect713
internal fun PlayerActivity.showV713EnvAutoDetect713Toggle() {
    val current = BiliClient.prefs.v713envAutoDetect713
    BiliClient.prefs.v713envAutoDetect713 = !current
    AppToast.show(this, "Env Auto Detect713: ${if (!current) "ON" else "OFF"}")
}

// v713: Equal Auto Balance713
internal fun PlayerActivity.showV713EqualAutoBalance713Toggle() {
    val current = BiliClient.prefs.v713equalAutoBalance713
    BiliClient.prefs.v713equalAutoBalance713 = !current
    AppToast.show(this, "Equal Auto Balance713: ${if (!current) "ON" else "OFF"}")
}

// v713: Error Auto Retry713
internal fun PlayerActivity.showV713ErrorAutoRetry713Toggle() {
    val current = BiliClient.prefs.v713errorAutoRetry713
    BiliClient.prefs.v713errorAutoRetry713 = !current
    AppToast.show(this, "Error Auto Retry713: ${if (!current) "ON" else "OFF"}")
}

// v713: Escape Auto Sanitize713
internal fun PlayerActivity.showV713EscapeAutoSanitize713Toggle() {
    val current = BiliClient.prefs.v713escapeAutoSanitize713
    BiliClient.prefs.v713escapeAutoSanitize713 = !current
    AppToast.show(this, "Escape Auto Sanitize713: ${if (!current) "ON" else "OFF"}")
}

// v713: Event Auto Dispatch713
internal fun PlayerActivity.showV713EventAutoDispatch713Toggle() {
    val current = BiliClient.prefs.v713eventAutoDispatch713
    BiliClient.prefs.v713eventAutoDispatch713 = !current
    AppToast.show(this, "Event Auto Dispatch713: ${if (!current) "ON" else "OFF"}")
}

// v713: Execute Auto Task713
internal fun PlayerActivity.showV713ExecuteAutoTask713Toggle() {
    val current = BiliClient.prefs.v713executeAutoTask713
    BiliClient.prefs.v713executeAutoTask713 = !current
    AppToast.show(this, "Execute Auto Task713: ${if (!current) "ON" else "OFF"}")
}

// v713: Exit Auto Confirm713
internal fun PlayerActivity.showV713ExitAutoConfirm713Toggle() {
    val current = BiliClient.prefs.v713exitAutoConfirm713
    BiliClient.prefs.v713exitAutoConfirm713 = !current
    AppToast.show(this, "Exit Auto Confirm713: ${if (!current) "ON" else "OFF"}")
}

// v713: Expand Auto Panel713
internal fun PlayerActivity.showV713ExpandAutoPanel713Toggle() {
    val current = BiliClient.prefs.v713expandAutoPanel713
    BiliClient.prefs.v713expandAutoPanel713 = !current
    AppToast.show(this, "Expand Auto Panel713: ${if (!current) "ON" else "OFF"}")
}

// v713: Expect Auto Timeout713
internal fun PlayerActivity.showV713ExpectAutoTimeout713Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v713expectAutoTimeout713).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout713",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v713expectAutoTimeout713 = value
        AppToast.show(this, "Expect Auto Timeout713: $value")
    }
}

// v714: Encode Auto Base64714
internal fun PlayerActivity.showV714EncodeAutoBase64714Toggle() {
    val current = BiliClient.prefs.v714encodeAutoBase64714
    BiliClient.prefs.v714encodeAutoBase64714 = !current
    AppToast.show(this, "Encode Auto Base64714: ${if (!current) "ON" else "OFF"}")
}

// v714: Encrypt Auto Aes714
internal fun PlayerActivity.showV714EncryptAutoAes714Toggle() {
    val current = BiliClient.prefs.v714encryptAutoAes714
    BiliClient.prefs.v714encryptAutoAes714 = !current
    AppToast.show(this, "Encrypt Auto Aes714: ${if (!current) "ON" else "OFF"}")
}

// v714: End Auto Cleanup714
internal fun PlayerActivity.showV714EndAutoCleanup714Toggle() {
    val current = BiliClient.prefs.v714endAutoCleanup714
    BiliClient.prefs.v714endAutoCleanup714 = !current
    AppToast.show(this, "End Auto Cleanup714: ${if (!current) "ON" else "OFF"}")
}

// v714: Engine Auto Switch714
internal fun PlayerActivity.showV714EngineAutoSwitch714Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v714engineAutoSwitch714).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch714",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v714engineAutoSwitch714 = value
        AppToast.show(this, "Engine Auto Switch714: $value")
    }
}

// v714: Enter Auto Fullscreen714
internal fun PlayerActivity.showV714EnterAutoFullscreen714Toggle() {
    val current = BiliClient.prefs.v714enterAutoFullscreen714
    BiliClient.prefs.v714enterAutoFullscreen714 = !current
    AppToast.show(this, "Enter Auto Fullscreen714: ${if (!current) "ON" else "OFF"}")
}

// v714: Entry Auto Validate714
internal fun PlayerActivity.showV714EntryAutoValidate714Toggle() {
    val current = BiliClient.prefs.v714entryAutoValidate714
    BiliClient.prefs.v714entryAutoValidate714 = !current
    AppToast.show(this, "Entry Auto Validate714: ${if (!current) "ON" else "OFF"}")
}

// v714: Env Auto Detect714
internal fun PlayerActivity.showV714EnvAutoDetect714Toggle() {
    val current = BiliClient.prefs.v714envAutoDetect714
    BiliClient.prefs.v714envAutoDetect714 = !current
    AppToast.show(this, "Env Auto Detect714: ${if (!current) "ON" else "OFF"}")
}

// v714: Equal Auto Balance714
internal fun PlayerActivity.showV714EqualAutoBalance714Toggle() {
    val current = BiliClient.prefs.v714equalAutoBalance714
    BiliClient.prefs.v714equalAutoBalance714 = !current
    AppToast.show(this, "Equal Auto Balance714: ${if (!current) "ON" else "OFF"}")
}

// v714: Error Auto Retry714
internal fun PlayerActivity.showV714ErrorAutoRetry714Toggle() {
    val current = BiliClient.prefs.v714errorAutoRetry714
    BiliClient.prefs.v714errorAutoRetry714 = !current
    AppToast.show(this, "Error Auto Retry714: ${if (!current) "ON" else "OFF"}")
}

// v714: Escape Auto Sanitize714
internal fun PlayerActivity.showV714EscapeAutoSanitize714Toggle() {
    val current = BiliClient.prefs.v714escapeAutoSanitize714
    BiliClient.prefs.v714escapeAutoSanitize714 = !current
    AppToast.show(this, "Escape Auto Sanitize714: ${if (!current) "ON" else "OFF"}")
}

// v714: Event Auto Dispatch714
internal fun PlayerActivity.showV714EventAutoDispatch714Toggle() {
    val current = BiliClient.prefs.v714eventAutoDispatch714
    BiliClient.prefs.v714eventAutoDispatch714 = !current
    AppToast.show(this, "Event Auto Dispatch714: ${if (!current) "ON" else "OFF"}")
}

// v714: Execute Auto Task714
internal fun PlayerActivity.showV714ExecuteAutoTask714Toggle() {
    val current = BiliClient.prefs.v714executeAutoTask714
    BiliClient.prefs.v714executeAutoTask714 = !current
    AppToast.show(this, "Execute Auto Task714: ${if (!current) "ON" else "OFF"}")
}

// v714: Exit Auto Confirm714
internal fun PlayerActivity.showV714ExitAutoConfirm714Toggle() {
    val current = BiliClient.prefs.v714exitAutoConfirm714
    BiliClient.prefs.v714exitAutoConfirm714 = !current
    AppToast.show(this, "Exit Auto Confirm714: ${if (!current) "ON" else "OFF"}")
}

// v714: Expand Auto Panel714
internal fun PlayerActivity.showV714ExpandAutoPanel714Toggle() {
    val current = BiliClient.prefs.v714expandAutoPanel714
    BiliClient.prefs.v714expandAutoPanel714 = !current
    AppToast.show(this, "Expand Auto Panel714: ${if (!current) "ON" else "OFF"}")
}

// v714: Expect Auto Timeout714
internal fun PlayerActivity.showV714ExpectAutoTimeout714Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v714expectAutoTimeout714).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout714",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v714expectAutoTimeout714 = value
        AppToast.show(this, "Expect Auto Timeout714: $value")
    }
}

// v715: Encode Auto Base64715
internal fun PlayerActivity.showV715EncodeAutoBase64715Toggle() {
    val current = BiliClient.prefs.v715encodeAutoBase64715
    BiliClient.prefs.v715encodeAutoBase64715 = !current
    AppToast.show(this, "Encode Auto Base64715: ${if (!current) "ON" else "OFF"}")
}

// v715: Encrypt Auto Aes715
internal fun PlayerActivity.showV715EncryptAutoAes715Toggle() {
    val current = BiliClient.prefs.v715encryptAutoAes715
    BiliClient.prefs.v715encryptAutoAes715 = !current
    AppToast.show(this, "Encrypt Auto Aes715: ${if (!current) "ON" else "OFF"}")
}

// v715: End Auto Cleanup715
internal fun PlayerActivity.showV715EndAutoCleanup715Toggle() {
    val current = BiliClient.prefs.v715endAutoCleanup715
    BiliClient.prefs.v715endAutoCleanup715 = !current
    AppToast.show(this, "End Auto Cleanup715: ${if (!current) "ON" else "OFF"}")
}

// v715: Engine Auto Switch715
internal fun PlayerActivity.showV715EngineAutoSwitch715Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v715engineAutoSwitch715).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch715",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v715engineAutoSwitch715 = value
        AppToast.show(this, "Engine Auto Switch715: $value")
    }
}

// v715: Enter Auto Fullscreen715
internal fun PlayerActivity.showV715EnterAutoFullscreen715Toggle() {
    val current = BiliClient.prefs.v715enterAutoFullscreen715
    BiliClient.prefs.v715enterAutoFullscreen715 = !current
    AppToast.show(this, "Enter Auto Fullscreen715: ${if (!current) "ON" else "OFF"}")
}

// v715: Entry Auto Validate715
internal fun PlayerActivity.showV715EntryAutoValidate715Toggle() {
    val current = BiliClient.prefs.v715entryAutoValidate715
    BiliClient.prefs.v715entryAutoValidate715 = !current
    AppToast.show(this, "Entry Auto Validate715: ${if (!current) "ON" else "OFF"}")
}

// v715: Env Auto Detect715
internal fun PlayerActivity.showV715EnvAutoDetect715Toggle() {
    val current = BiliClient.prefs.v715envAutoDetect715
    BiliClient.prefs.v715envAutoDetect715 = !current
    AppToast.show(this, "Env Auto Detect715: ${if (!current) "ON" else "OFF"}")
}

// v715: Equal Auto Balance715
internal fun PlayerActivity.showV715EqualAutoBalance715Toggle() {
    val current = BiliClient.prefs.v715equalAutoBalance715
    BiliClient.prefs.v715equalAutoBalance715 = !current
    AppToast.show(this, "Equal Auto Balance715: ${if (!current) "ON" else "OFF"}")
}

// v715: Error Auto Retry715
internal fun PlayerActivity.showV715ErrorAutoRetry715Toggle() {
    val current = BiliClient.prefs.v715errorAutoRetry715
    BiliClient.prefs.v715errorAutoRetry715 = !current
    AppToast.show(this, "Error Auto Retry715: ${if (!current) "ON" else "OFF"}")
}

// v715: Escape Auto Sanitize715
internal fun PlayerActivity.showV715EscapeAutoSanitize715Toggle() {
    val current = BiliClient.prefs.v715escapeAutoSanitize715
    BiliClient.prefs.v715escapeAutoSanitize715 = !current
    AppToast.show(this, "Escape Auto Sanitize715: ${if (!current) "ON" else "OFF"}")
}

// v715: Event Auto Dispatch715
internal fun PlayerActivity.showV715EventAutoDispatch715Toggle() {
    val current = BiliClient.prefs.v715eventAutoDispatch715
    BiliClient.prefs.v715eventAutoDispatch715 = !current
    AppToast.show(this, "Event Auto Dispatch715: ${if (!current) "ON" else "OFF"}")
}

// v715: Execute Auto Task715
internal fun PlayerActivity.showV715ExecuteAutoTask715Toggle() {
    val current = BiliClient.prefs.v715executeAutoTask715
    BiliClient.prefs.v715executeAutoTask715 = !current
    AppToast.show(this, "Execute Auto Task715: ${if (!current) "ON" else "OFF"}")
}

// v715: Exit Auto Confirm715
internal fun PlayerActivity.showV715ExitAutoConfirm715Toggle() {
    val current = BiliClient.prefs.v715exitAutoConfirm715
    BiliClient.prefs.v715exitAutoConfirm715 = !current
    AppToast.show(this, "Exit Auto Confirm715: ${if (!current) "ON" else "OFF"}")
}

// v715: Expand Auto Panel715
internal fun PlayerActivity.showV715ExpandAutoPanel715Toggle() {
    val current = BiliClient.prefs.v715expandAutoPanel715
    BiliClient.prefs.v715expandAutoPanel715 = !current
    AppToast.show(this, "Expand Auto Panel715: ${if (!current) "ON" else "OFF"}")
}

// v715: Expect Auto Timeout715
internal fun PlayerActivity.showV715ExpectAutoTimeout715Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v715expectAutoTimeout715).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout715",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v715expectAutoTimeout715 = value
        AppToast.show(this, "Expect Auto Timeout715: $value")
    }
}

// v716: Encode Auto Base64716
internal fun PlayerActivity.showV716EncodeAutoBase64716Toggle() {
    val current = BiliClient.prefs.v716encodeAutoBase64716
    BiliClient.prefs.v716encodeAutoBase64716 = !current
    AppToast.show(this, "Encode Auto Base64716: ${if (!current) "ON" else "OFF"}")
}

// v716: Encrypt Auto Aes716
internal fun PlayerActivity.showV716EncryptAutoAes716Toggle() {
    val current = BiliClient.prefs.v716encryptAutoAes716
    BiliClient.prefs.v716encryptAutoAes716 = !current
    AppToast.show(this, "Encrypt Auto Aes716: ${if (!current) "ON" else "OFF"}")
}

// v716: End Auto Cleanup716
internal fun PlayerActivity.showV716EndAutoCleanup716Toggle() {
    val current = BiliClient.prefs.v716endAutoCleanup716
    BiliClient.prefs.v716endAutoCleanup716 = !current
    AppToast.show(this, "End Auto Cleanup716: ${if (!current) "ON" else "OFF"}")
}

// v716: Engine Auto Switch716
internal fun PlayerActivity.showV716EngineAutoSwitch716Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v716engineAutoSwitch716).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch716",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v716engineAutoSwitch716 = value
        AppToast.show(this, "Engine Auto Switch716: $value")
    }
}

// v716: Enter Auto Fullscreen716
internal fun PlayerActivity.showV716EnterAutoFullscreen716Toggle() {
    val current = BiliClient.prefs.v716enterAutoFullscreen716
    BiliClient.prefs.v716enterAutoFullscreen716 = !current
    AppToast.show(this, "Enter Auto Fullscreen716: ${if (!current) "ON" else "OFF"}")
}

// v716: Entry Auto Validate716
internal fun PlayerActivity.showV716EntryAutoValidate716Toggle() {
    val current = BiliClient.prefs.v716entryAutoValidate716
    BiliClient.prefs.v716entryAutoValidate716 = !current
    AppToast.show(this, "Entry Auto Validate716: ${if (!current) "ON" else "OFF"}")
}

// v716: Env Auto Detect716
internal fun PlayerActivity.showV716EnvAutoDetect716Toggle() {
    val current = BiliClient.prefs.v716envAutoDetect716
    BiliClient.prefs.v716envAutoDetect716 = !current
    AppToast.show(this, "Env Auto Detect716: ${if (!current) "ON" else "OFF"}")
}

// v716: Equal Auto Balance716
internal fun PlayerActivity.showV716EqualAutoBalance716Toggle() {
    val current = BiliClient.prefs.v716equalAutoBalance716
    BiliClient.prefs.v716equalAutoBalance716 = !current
    AppToast.show(this, "Equal Auto Balance716: ${if (!current) "ON" else "OFF"}")
}

// v716: Error Auto Retry716
internal fun PlayerActivity.showV716ErrorAutoRetry716Toggle() {
    val current = BiliClient.prefs.v716errorAutoRetry716
    BiliClient.prefs.v716errorAutoRetry716 = !current
    AppToast.show(this, "Error Auto Retry716: ${if (!current) "ON" else "OFF"}")
}

// v716: Escape Auto Sanitize716
internal fun PlayerActivity.showV716EscapeAutoSanitize716Toggle() {
    val current = BiliClient.prefs.v716escapeAutoSanitize716
    BiliClient.prefs.v716escapeAutoSanitize716 = !current
    AppToast.show(this, "Escape Auto Sanitize716: ${if (!current) "ON" else "OFF"}")
}

// v716: Event Auto Dispatch716
internal fun PlayerActivity.showV716EventAutoDispatch716Toggle() {
    val current = BiliClient.prefs.v716eventAutoDispatch716
    BiliClient.prefs.v716eventAutoDispatch716 = !current
    AppToast.show(this, "Event Auto Dispatch716: ${if (!current) "ON" else "OFF"}")
}

// v716: Execute Auto Task716
internal fun PlayerActivity.showV716ExecuteAutoTask716Toggle() {
    val current = BiliClient.prefs.v716executeAutoTask716
    BiliClient.prefs.v716executeAutoTask716 = !current
    AppToast.show(this, "Execute Auto Task716: ${if (!current) "ON" else "OFF"}")
}

// v716: Exit Auto Confirm716
internal fun PlayerActivity.showV716ExitAutoConfirm716Toggle() {
    val current = BiliClient.prefs.v716exitAutoConfirm716
    BiliClient.prefs.v716exitAutoConfirm716 = !current
    AppToast.show(this, "Exit Auto Confirm716: ${if (!current) "ON" else "OFF"}")
}

// v716: Expand Auto Panel716
internal fun PlayerActivity.showV716ExpandAutoPanel716Toggle() {
    val current = BiliClient.prefs.v716expandAutoPanel716
    BiliClient.prefs.v716expandAutoPanel716 = !current
    AppToast.show(this, "Expand Auto Panel716: ${if (!current) "ON" else "OFF"}")
}

// v716: Expect Auto Timeout716
internal fun PlayerActivity.showV716ExpectAutoTimeout716Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v716expectAutoTimeout716).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout716",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v716expectAutoTimeout716 = value
        AppToast.show(this, "Expect Auto Timeout716: $value")
    }
}

// v717: Encode Auto Base64717
internal fun PlayerActivity.showV717EncodeAutoBase64717Toggle() {
    val current = BiliClient.prefs.v717encodeAutoBase64717
    BiliClient.prefs.v717encodeAutoBase64717 = !current
    AppToast.show(this, "Encode Auto Base64717: ${if (!current) "ON" else "OFF"}")
}

// v717: Encrypt Auto Aes717
internal fun PlayerActivity.showV717EncryptAutoAes717Toggle() {
    val current = BiliClient.prefs.v717encryptAutoAes717
    BiliClient.prefs.v717encryptAutoAes717 = !current
    AppToast.show(this, "Encrypt Auto Aes717: ${if (!current) "ON" else "OFF"}")
}

// v717: End Auto Cleanup717
internal fun PlayerActivity.showV717EndAutoCleanup717Toggle() {
    val current = BiliClient.prefs.v717endAutoCleanup717
    BiliClient.prefs.v717endAutoCleanup717 = !current
    AppToast.show(this, "End Auto Cleanup717: ${if (!current) "ON" else "OFF"}")
}

// v717: Engine Auto Switch717
internal fun PlayerActivity.showV717EngineAutoSwitch717Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v717engineAutoSwitch717).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch717",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v717engineAutoSwitch717 = value
        AppToast.show(this, "Engine Auto Switch717: $value")
    }
}

// v717: Enter Auto Fullscreen717
internal fun PlayerActivity.showV717EnterAutoFullscreen717Toggle() {
    val current = BiliClient.prefs.v717enterAutoFullscreen717
    BiliClient.prefs.v717enterAutoFullscreen717 = !current
    AppToast.show(this, "Enter Auto Fullscreen717: ${if (!current) "ON" else "OFF"}")
}

// v717: Entry Auto Validate717
internal fun PlayerActivity.showV717EntryAutoValidate717Toggle() {
    val current = BiliClient.prefs.v717entryAutoValidate717
    BiliClient.prefs.v717entryAutoValidate717 = !current
    AppToast.show(this, "Entry Auto Validate717: ${if (!current) "ON" else "OFF"}")
}

// v717: Env Auto Detect717
internal fun PlayerActivity.showV717EnvAutoDetect717Toggle() {
    val current = BiliClient.prefs.v717envAutoDetect717
    BiliClient.prefs.v717envAutoDetect717 = !current
    AppToast.show(this, "Env Auto Detect717: ${if (!current) "ON" else "OFF"}")
}

// v717: Equal Auto Balance717
internal fun PlayerActivity.showV717EqualAutoBalance717Toggle() {
    val current = BiliClient.prefs.v717equalAutoBalance717
    BiliClient.prefs.v717equalAutoBalance717 = !current
    AppToast.show(this, "Equal Auto Balance717: ${if (!current) "ON" else "OFF"}")
}

// v717: Error Auto Retry717
internal fun PlayerActivity.showV717ErrorAutoRetry717Toggle() {
    val current = BiliClient.prefs.v717errorAutoRetry717
    BiliClient.prefs.v717errorAutoRetry717 = !current
    AppToast.show(this, "Error Auto Retry717: ${if (!current) "ON" else "OFF"}")
}

// v717: Escape Auto Sanitize717
internal fun PlayerActivity.showV717EscapeAutoSanitize717Toggle() {
    val current = BiliClient.prefs.v717escapeAutoSanitize717
    BiliClient.prefs.v717escapeAutoSanitize717 = !current
    AppToast.show(this, "Escape Auto Sanitize717: ${if (!current) "ON" else "OFF"}")
}

// v717: Event Auto Dispatch717
internal fun PlayerActivity.showV717EventAutoDispatch717Toggle() {
    val current = BiliClient.prefs.v717eventAutoDispatch717
    BiliClient.prefs.v717eventAutoDispatch717 = !current
    AppToast.show(this, "Event Auto Dispatch717: ${if (!current) "ON" else "OFF"}")
}

// v717: Execute Auto Task717
internal fun PlayerActivity.showV717ExecuteAutoTask717Toggle() {
    val current = BiliClient.prefs.v717executeAutoTask717
    BiliClient.prefs.v717executeAutoTask717 = !current
    AppToast.show(this, "Execute Auto Task717: ${if (!current) "ON" else "OFF"}")
}

// v717: Exit Auto Confirm717
internal fun PlayerActivity.showV717ExitAutoConfirm717Toggle() {
    val current = BiliClient.prefs.v717exitAutoConfirm717
    BiliClient.prefs.v717exitAutoConfirm717 = !current
    AppToast.show(this, "Exit Auto Confirm717: ${if (!current) "ON" else "OFF"}")
}

// v717: Expand Auto Panel717
internal fun PlayerActivity.showV717ExpandAutoPanel717Toggle() {
    val current = BiliClient.prefs.v717expandAutoPanel717
    BiliClient.prefs.v717expandAutoPanel717 = !current
    AppToast.show(this, "Expand Auto Panel717: ${if (!current) "ON" else "OFF"}")
}

// v717: Expect Auto Timeout717
internal fun PlayerActivity.showV717ExpectAutoTimeout717Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v717expectAutoTimeout717).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout717",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v717expectAutoTimeout717 = value
        AppToast.show(this, "Expect Auto Timeout717: $value")
    }
}

// v718: Encode Auto Base64718
internal fun PlayerActivity.showV718EncodeAutoBase64718Toggle() {
    val current = BiliClient.prefs.v718encodeAutoBase64718
    BiliClient.prefs.v718encodeAutoBase64718 = !current
    AppToast.show(this, "Encode Auto Base64718: ${if (!current) "ON" else "OFF"}")
}

// v718: Encrypt Auto Aes718
internal fun PlayerActivity.showV718EncryptAutoAes718Toggle() {
    val current = BiliClient.prefs.v718encryptAutoAes718
    BiliClient.prefs.v718encryptAutoAes718 = !current
    AppToast.show(this, "Encrypt Auto Aes718: ${if (!current) "ON" else "OFF"}")
}

// v718: End Auto Cleanup718
internal fun PlayerActivity.showV718EndAutoCleanup718Toggle() {
    val current = BiliClient.prefs.v718endAutoCleanup718
    BiliClient.prefs.v718endAutoCleanup718 = !current
    AppToast.show(this, "End Auto Cleanup718: ${if (!current) "ON" else "OFF"}")
}

// v718: Engine Auto Switch718
internal fun PlayerActivity.showV718EngineAutoSwitch718Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v718engineAutoSwitch718).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch718",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v718engineAutoSwitch718 = value
        AppToast.show(this, "Engine Auto Switch718: $value")
    }
}

// v718: Enter Auto Fullscreen718
internal fun PlayerActivity.showV718EnterAutoFullscreen718Toggle() {
    val current = BiliClient.prefs.v718enterAutoFullscreen718
    BiliClient.prefs.v718enterAutoFullscreen718 = !current
    AppToast.show(this, "Enter Auto Fullscreen718: ${if (!current) "ON" else "OFF"}")
}

// v718: Entry Auto Validate718
internal fun PlayerActivity.showV718EntryAutoValidate718Toggle() {
    val current = BiliClient.prefs.v718entryAutoValidate718
    BiliClient.prefs.v718entryAutoValidate718 = !current
    AppToast.show(this, "Entry Auto Validate718: ${if (!current) "ON" else "OFF"}")
}

// v718: Env Auto Detect718
internal fun PlayerActivity.showV718EnvAutoDetect718Toggle() {
    val current = BiliClient.prefs.v718envAutoDetect718
    BiliClient.prefs.v718envAutoDetect718 = !current
    AppToast.show(this, "Env Auto Detect718: ${if (!current) "ON" else "OFF"}")
}

// v718: Equal Auto Balance718
internal fun PlayerActivity.showV718EqualAutoBalance718Toggle() {
    val current = BiliClient.prefs.v718equalAutoBalance718
    BiliClient.prefs.v718equalAutoBalance718 = !current
    AppToast.show(this, "Equal Auto Balance718: ${if (!current) "ON" else "OFF"}")
}

// v718: Error Auto Retry718
internal fun PlayerActivity.showV718ErrorAutoRetry718Toggle() {
    val current = BiliClient.prefs.v718errorAutoRetry718
    BiliClient.prefs.v718errorAutoRetry718 = !current
    AppToast.show(this, "Error Auto Retry718: ${if (!current) "ON" else "OFF"}")
}

// v718: Escape Auto Sanitize718
internal fun PlayerActivity.showV718EscapeAutoSanitize718Toggle() {
    val current = BiliClient.prefs.v718escapeAutoSanitize718
    BiliClient.prefs.v718escapeAutoSanitize718 = !current
    AppToast.show(this, "Escape Auto Sanitize718: ${if (!current) "ON" else "OFF"}")
}

// v718: Event Auto Dispatch718
internal fun PlayerActivity.showV718EventAutoDispatch718Toggle() {
    val current = BiliClient.prefs.v718eventAutoDispatch718
    BiliClient.prefs.v718eventAutoDispatch718 = !current
    AppToast.show(this, "Event Auto Dispatch718: ${if (!current) "ON" else "OFF"}")
}

// v718: Execute Auto Task718
internal fun PlayerActivity.showV718ExecuteAutoTask718Toggle() {
    val current = BiliClient.prefs.v718executeAutoTask718
    BiliClient.prefs.v718executeAutoTask718 = !current
    AppToast.show(this, "Execute Auto Task718: ${if (!current) "ON" else "OFF"}")
}

// v718: Exit Auto Confirm718
internal fun PlayerActivity.showV718ExitAutoConfirm718Toggle() {
    val current = BiliClient.prefs.v718exitAutoConfirm718
    BiliClient.prefs.v718exitAutoConfirm718 = !current
    AppToast.show(this, "Exit Auto Confirm718: ${if (!current) "ON" else "OFF"}")
}

// v718: Expand Auto Panel718
internal fun PlayerActivity.showV718ExpandAutoPanel718Toggle() {
    val current = BiliClient.prefs.v718expandAutoPanel718
    BiliClient.prefs.v718expandAutoPanel718 = !current
    AppToast.show(this, "Expand Auto Panel718: ${if (!current) "ON" else "OFF"}")
}

// v718: Expect Auto Timeout718
internal fun PlayerActivity.showV718ExpectAutoTimeout718Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v718expectAutoTimeout718).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout718",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v718expectAutoTimeout718 = value
        AppToast.show(this, "Expect Auto Timeout718: $value")
    }
}

// v719: Encode Auto Base64719
internal fun PlayerActivity.showV719EncodeAutoBase64719Toggle() {
    val current = BiliClient.prefs.v719encodeAutoBase64719
    BiliClient.prefs.v719encodeAutoBase64719 = !current
    AppToast.show(this, "Encode Auto Base64719: ${if (!current) "ON" else "OFF"}")
}

// v719: Encrypt Auto Aes719
internal fun PlayerActivity.showV719EncryptAutoAes719Toggle() {
    val current = BiliClient.prefs.v719encryptAutoAes719
    BiliClient.prefs.v719encryptAutoAes719 = !current
    AppToast.show(this, "Encrypt Auto Aes719: ${if (!current) "ON" else "OFF"}")
}

// v719: End Auto Cleanup719
internal fun PlayerActivity.showV719EndAutoCleanup719Toggle() {
    val current = BiliClient.prefs.v719endAutoCleanup719
    BiliClient.prefs.v719endAutoCleanup719 = !current
    AppToast.show(this, "End Auto Cleanup719: ${if (!current) "ON" else "OFF"}")
}

// v719: Engine Auto Switch719
internal fun PlayerActivity.showV719EngineAutoSwitch719Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v719engineAutoSwitch719).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch719",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v719engineAutoSwitch719 = value
        AppToast.show(this, "Engine Auto Switch719: $value")
    }
}

// v719: Enter Auto Fullscreen719
internal fun PlayerActivity.showV719EnterAutoFullscreen719Toggle() {
    val current = BiliClient.prefs.v719enterAutoFullscreen719
    BiliClient.prefs.v719enterAutoFullscreen719 = !current
    AppToast.show(this, "Enter Auto Fullscreen719: ${if (!current) "ON" else "OFF"}")
}

// v719: Entry Auto Validate719
internal fun PlayerActivity.showV719EntryAutoValidate719Toggle() {
    val current = BiliClient.prefs.v719entryAutoValidate719
    BiliClient.prefs.v719entryAutoValidate719 = !current
    AppToast.show(this, "Entry Auto Validate719: ${if (!current) "ON" else "OFF"}")
}

// v719: Env Auto Detect719
internal fun PlayerActivity.showV719EnvAutoDetect719Toggle() {
    val current = BiliClient.prefs.v719envAutoDetect719
    BiliClient.prefs.v719envAutoDetect719 = !current
    AppToast.show(this, "Env Auto Detect719: ${if (!current) "ON" else "OFF"}")
}

// v719: Equal Auto Balance719
internal fun PlayerActivity.showV719EqualAutoBalance719Toggle() {
    val current = BiliClient.prefs.v719equalAutoBalance719
    BiliClient.prefs.v719equalAutoBalance719 = !current
    AppToast.show(this, "Equal Auto Balance719: ${if (!current) "ON" else "OFF"}")
}

// v719: Error Auto Retry719
internal fun PlayerActivity.showV719ErrorAutoRetry719Toggle() {
    val current = BiliClient.prefs.v719errorAutoRetry719
    BiliClient.prefs.v719errorAutoRetry719 = !current
    AppToast.show(this, "Error Auto Retry719: ${if (!current) "ON" else "OFF"}")
}

// v719: Escape Auto Sanitize719
internal fun PlayerActivity.showV719EscapeAutoSanitize719Toggle() {
    val current = BiliClient.prefs.v719escapeAutoSanitize719
    BiliClient.prefs.v719escapeAutoSanitize719 = !current
    AppToast.show(this, "Escape Auto Sanitize719: ${if (!current) "ON" else "OFF"}")
}

// v719: Event Auto Dispatch719
internal fun PlayerActivity.showV719EventAutoDispatch719Toggle() {
    val current = BiliClient.prefs.v719eventAutoDispatch719
    BiliClient.prefs.v719eventAutoDispatch719 = !current
    AppToast.show(this, "Event Auto Dispatch719: ${if (!current) "ON" else "OFF"}")
}

// v719: Execute Auto Task719
internal fun PlayerActivity.showV719ExecuteAutoTask719Toggle() {
    val current = BiliClient.prefs.v719executeAutoTask719
    BiliClient.prefs.v719executeAutoTask719 = !current
    AppToast.show(this, "Execute Auto Task719: ${if (!current) "ON" else "OFF"}")
}

// v719: Exit Auto Confirm719
internal fun PlayerActivity.showV719ExitAutoConfirm719Toggle() {
    val current = BiliClient.prefs.v719exitAutoConfirm719
    BiliClient.prefs.v719exitAutoConfirm719 = !current
    AppToast.show(this, "Exit Auto Confirm719: ${if (!current) "ON" else "OFF"}")
}

// v719: Expand Auto Panel719
internal fun PlayerActivity.showV719ExpandAutoPanel719Toggle() {
    val current = BiliClient.prefs.v719expandAutoPanel719
    BiliClient.prefs.v719expandAutoPanel719 = !current
    AppToast.show(this, "Expand Auto Panel719: ${if (!current) "ON" else "OFF"}")
}

// v719: Expect Auto Timeout719
internal fun PlayerActivity.showV719ExpectAutoTimeout719Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v719expectAutoTimeout719).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout719",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v719expectAutoTimeout719 = value
        AppToast.show(this, "Expect Auto Timeout719: $value")
    }
}

// v720: Encode Auto Base64720
internal fun PlayerActivity.showV720EncodeAutoBase64720Toggle() {
    val current = BiliClient.prefs.v720encodeAutoBase64720
    BiliClient.prefs.v720encodeAutoBase64720 = !current
    AppToast.show(this, "Encode Auto Base64720: ${if (!current) "ON" else "OFF"}")
}

// v720: Encrypt Auto Aes720
internal fun PlayerActivity.showV720EncryptAutoAes720Toggle() {
    val current = BiliClient.prefs.v720encryptAutoAes720
    BiliClient.prefs.v720encryptAutoAes720 = !current
    AppToast.show(this, "Encrypt Auto Aes720: ${if (!current) "ON" else "OFF"}")
}

// v720: End Auto Cleanup720
internal fun PlayerActivity.showV720EndAutoCleanup720Toggle() {
    val current = BiliClient.prefs.v720endAutoCleanup720
    BiliClient.prefs.v720endAutoCleanup720 = !current
    AppToast.show(this, "End Auto Cleanup720: ${if (!current) "ON" else "OFF"}")
}

// v720: Engine Auto Switch720
internal fun PlayerActivity.showV720EngineAutoSwitch720Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v720engineAutoSwitch720).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Engine Auto Switch720",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v720engineAutoSwitch720 = value
        AppToast.show(this, "Engine Auto Switch720: $value")
    }
}

// v720: Enter Auto Fullscreen720
internal fun PlayerActivity.showV720EnterAutoFullscreen720Toggle() {
    val current = BiliClient.prefs.v720enterAutoFullscreen720
    BiliClient.prefs.v720enterAutoFullscreen720 = !current
    AppToast.show(this, "Enter Auto Fullscreen720: ${if (!current) "ON" else "OFF"}")
}

// v720: Entry Auto Validate720
internal fun PlayerActivity.showV720EntryAutoValidate720Toggle() {
    val current = BiliClient.prefs.v720entryAutoValidate720
    BiliClient.prefs.v720entryAutoValidate720 = !current
    AppToast.show(this, "Entry Auto Validate720: ${if (!current) "ON" else "OFF"}")
}

// v720: Env Auto Detect720
internal fun PlayerActivity.showV720EnvAutoDetect720Toggle() {
    val current = BiliClient.prefs.v720envAutoDetect720
    BiliClient.prefs.v720envAutoDetect720 = !current
    AppToast.show(this, "Env Auto Detect720: ${if (!current) "ON" else "OFF"}")
}

// v720: Equal Auto Balance720
internal fun PlayerActivity.showV720EqualAutoBalance720Toggle() {
    val current = BiliClient.prefs.v720equalAutoBalance720
    BiliClient.prefs.v720equalAutoBalance720 = !current
    AppToast.show(this, "Equal Auto Balance720: ${if (!current) "ON" else "OFF"}")
}

// v720: Error Auto Retry720
internal fun PlayerActivity.showV720ErrorAutoRetry720Toggle() {
    val current = BiliClient.prefs.v720errorAutoRetry720
    BiliClient.prefs.v720errorAutoRetry720 = !current
    AppToast.show(this, "Error Auto Retry720: ${if (!current) "ON" else "OFF"}")
}

// v720: Escape Auto Sanitize720
internal fun PlayerActivity.showV720EscapeAutoSanitize720Toggle() {
    val current = BiliClient.prefs.v720escapeAutoSanitize720
    BiliClient.prefs.v720escapeAutoSanitize720 = !current
    AppToast.show(this, "Escape Auto Sanitize720: ${if (!current) "ON" else "OFF"}")
}

// v720: Event Auto Dispatch720
internal fun PlayerActivity.showV720EventAutoDispatch720Toggle() {
    val current = BiliClient.prefs.v720eventAutoDispatch720
    BiliClient.prefs.v720eventAutoDispatch720 = !current
    AppToast.show(this, "Event Auto Dispatch720: ${if (!current) "ON" else "OFF"}")
}

// v720: Execute Auto Task720
internal fun PlayerActivity.showV720ExecuteAutoTask720Toggle() {
    val current = BiliClient.prefs.v720executeAutoTask720
    BiliClient.prefs.v720executeAutoTask720 = !current
    AppToast.show(this, "Execute Auto Task720: ${if (!current) "ON" else "OFF"}")
}

// v720: Exit Auto Confirm720
internal fun PlayerActivity.showV720ExitAutoConfirm720Toggle() {
    val current = BiliClient.prefs.v720exitAutoConfirm720
    BiliClient.prefs.v720exitAutoConfirm720 = !current
    AppToast.show(this, "Exit Auto Confirm720: ${if (!current) "ON" else "OFF"}")
}

// v720: Expand Auto Panel720
internal fun PlayerActivity.showV720ExpandAutoPanel720Toggle() {
    val current = BiliClient.prefs.v720expandAutoPanel720
    BiliClient.prefs.v720expandAutoPanel720 = !current
    AppToast.show(this, "Expand Auto Panel720: ${if (!current) "ON" else "OFF"}")
}

// v720: Expect Auto Timeout720
internal fun PlayerActivity.showV720ExpectAutoTimeout720Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v720expectAutoTimeout720).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Expect Auto Timeout720",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v720expectAutoTimeout720 = value
        AppToast.show(this, "Expect Auto Timeout720: $value")
    }
}

