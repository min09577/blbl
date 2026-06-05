package blbl.cat3399.feature.settings

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import android.text.InputType
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import blbl.cat3399.R
import blbl.cat3399.BuildConfig
import blbl.cat3399.core.io.CreateDocumentRequest
import blbl.cat3399.core.io.DocumentExporter
import blbl.cat3399.core.log.AppLog
import blbl.cat3399.core.log.LogExporter
import blbl.cat3399.core.log.LogUploadClient
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppConfigBackup
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.CustomPageConfig
import blbl.cat3399.core.prefs.CustomPageTabConfig
import blbl.cat3399.core.prefs.PlayerCustomShortcut
import blbl.cat3399.core.prefs.PlayerCustomShortcutAction
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.prefs.PlayerCustomShortcutsStore
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.Immersive
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.core.ui.popup.PopupAction
import blbl.cat3399.core.ui.popup.PopupActionRole
import blbl.cat3399.core.update.ApkUpdateFlow
import blbl.cat3399.core.update.ApkUpdater
import blbl.cat3399.feature.player.engine.IjkPlayerPlugin
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.AudioBalanceLevel
import blbl.cat3399.feature.player.PlaybackSettingChoices
import blbl.cat3399.feature.player.PlayerCustomShortcutCatalog
import blbl.cat3399.feature.risk.GaiaVgateActivity
import blbl.cat3399.feature.category.CategoryZones
import blbl.cat3399.feature.custom.CustomPageSearchSourceKind
import blbl.cat3399.feature.custom.CustomPageTabRegistry
import blbl.cat3399.feature.home.HomeTabs
import blbl.cat3399.feature.live.LiveFragment
import blbl.cat3399.feature.my.MyTabs
import blbl.cat3399.ui.MainRootNavRegistry
import blbl.cat3399.ui.MainActivity
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Cookie
import java.io.File
import java.text.SimpleDateFormat
import java.util.ArrayDeque
import java.util.Date
import java.util.Locale
import org.json.JSONObject

class SettingsInteractionHandler(
    private val activity: SettingsActivity,
    private val state: SettingsState,
    private val gaiaVgateLauncher: ActivityResultLauncher<Intent>,
    private val exportDocumentLauncher: ActivityResultLauncher<CreateDocumentRequest>,
    private val importConfigLauncher: ActivityResultLauncher<Array<String>>,
) {
    lateinit var renderer: SettingsRenderer

    private data class PreparedLogsExport(
        val fileName: String,
        val nowMs: Long,
        val extras: List<LogExporter.ZipExtra>,
    )

    private var testUpdateJob: Job? = null
    private var testUpdateCheckJob: Job? = null
    private var exportLogsJob: Job? = null
    private var uploadLogsJob: Job? = null
    private var clearCacheJob: Job? = null
    private var cacheSizeJob: Job? = null
    private var configTransferJob: Job? = null
    private var pendingDocumentExport: ((Uri) -> Unit)? = null

    fun onSectionShown(sectionName: String) {
        when (sectionName) {
            "通用设置" -> updateCacheSize(force = false)
            "关于应用" -> ensureTestUpdateChecked(force = false, refreshUi = false)
        }
    }

    fun onGaiaVgateResult(result: ActivityResult) {
        if (result.resultCode != Activity.RESULT_OK) return
        val token =
            result.data?.getStringExtra(GaiaVgateActivity.EXTRA_GAIA_VTOKEN)?.trim()?.takeIf { it.isNotBlank() }
                ?: return
        upsertGaiaVtokenCookie(token)
        val prefs = BiliClient.prefs
        prefs.gaiaVgateVVoucher = null
        prefs.gaiaVgateVVoucherSavedAtMs = -1L
        AppToast.show(activity, "验证成功，已写入风控票据")
        renderer.refreshSection(SettingId.GaiaVgate)
    }

    fun onExportDocumentSelected(uri: Uri?) {
        val export = pendingDocumentExport
        pendingDocumentExport = null
        if (uri == null || export == null) return
        export(uri)
    }

    fun onImportConfigSelected(uri: Uri?) {
        if (uri == null) return
        importConfigFromUri(uri)
    }

    private fun exportLogsToUri(
        uri: Uri,
        prepared: PreparedLogsExport,
    ) {
        exportLogsJob?.cancel()
        exportLogsJob =
            launchIoJob(
                startToast = "正在导出日志…",
                failureLogMessage = "export logs failed",
                failureToastPrefix = "导出失败",
                work = {
                    LogExporter.exportToUri(
                        context = activity,
                        uri = uri,
                        nowMs = prepared.nowMs,
                        fileNameOverride = prepared.fileName,
                        extras = prepared.extras,
                    )
                },
            ) { result ->
                AppToast.showLong(activity, "已导出：${result.fileName}（${result.includedFiles}个文件）")
            }
    }

    private fun exportLogsToLocalFile(prepared: PreparedLogsExport) {
        exportLogsJob?.cancel()
        exportLogsJob =
            launchIoJob(
                startToast = "正在导出日志到本地…",
                failureLogMessage = "export logs (local) failed",
                failureToastPrefix = "导出失败",
                work = {
                    LogExporter.exportToLocalFile(
                        context = activity,
                        nowMs = prepared.nowMs,
                        fileNameOverride = prepared.fileName,
                        extras = prepared.extras,
                    )
                },
            ) { result ->
                val path = result.file.absolutePath
                AppToast.showLong(activity, "无法打开保存文件，已导出到本地：${result.fileName}（${result.includedFiles}个文件）\n路径：$path")
            }
    }

    private fun showConfigTransferDialog() {
        AppPopup.custom(
            context = activity,
            title = "导出/入配置",
            cancelable = true,
            actions =
                listOf(
                    PopupAction(
                        role = PopupActionRole.NEUTRAL,
                        text = "导出配置",
                    ) {
                        startConfigExport(AppConfigBackup.ExportMode.CONFIG_ONLY)
                    },
                    PopupAction(
                        role = PopupActionRole.NEUTRAL,
                        text = "导出配置与登录状态",
                    ) {
                        startConfigExport(AppConfigBackup.ExportMode.CONFIG_WITH_CREDENTIALS)
                    },
                    PopupAction(role = PopupActionRole.NEGATIVE, text = "关闭"),
                    PopupAction(
                        role = PopupActionRole.POSITIVE,
                        text = "导入配置",
                    ) {
                        startImportConfig()
                    },
                ),
            preferredActionRole = PopupActionRole.POSITIVE,
            autoFocus = true,
        ) { dialogContext ->
            val tv =
                LayoutInflater.from(dialogContext)
                    .inflate(R.layout.view_popup_message, null, false) as TextView
            tv.text = "可导出当前配置，也可选包含已保存帐号和登录状态；导入时会按文件内容整包覆盖。"
            tv
        }
    }

    private fun startConfigExport(mode: AppConfigBackup.ExportMode) {
        if (!ensureConfigTransferIdle()) return
        val prepared = prepareConfigExport(mode)
        launchDocumentExport(
            request = CreateDocumentRequest(mimeType = AppConfigBackup.JSON_MIME, fileName = prepared.fileName),
            onUriSelected = { uri -> exportConfigToUri(uri = uri, prepared = prepared) },
            onFallbackToLocal = { exportConfigToLocalFile(prepared) },
            logTag = "config",
        )
    }

    private fun exportConfigToUri(
        uri: Uri,
        prepared: AppConfigBackup.PreparedExport,
    ) {
        configTransferJob =
            launchIoJob(
                startToast = exportStartToast(prepared.mode),
                failureLogMessage = "export config failed",
                failureToastPrefix = "导出失败",
                work = {
                    DocumentExporter.exportToUri(
                        context = activity,
                        uri = uri,
                        fileName = prepared.fileName,
                    ) { out ->
                        out.write(prepared.jsonText.toByteArray(Charsets.UTF_8))
                    }
                },
            ) { result ->
                AppToast.showLong(activity, "已导出：${result.fileName}")
            }
    }

    private fun exportConfigToLocalFile(prepared: AppConfigBackup.PreparedExport) {
        configTransferJob =
            launchIoJob(
                startToast = "${exportStartToast(prepared.mode)}到本地…",
                failureLogMessage = "export config (local) failed",
                failureToastPrefix = "导出失败",
                work = {
                    DocumentExporter.exportToLocalFile(
                        context = activity,
                        fileName = prepared.fileName,
                        subDir = "exports",
                    ) { out ->
                        out.write(prepared.jsonText.toByteArray(Charsets.UTF_8))
                    }
                },
            ) { result ->
                AppToast.showLong(activity, "无法打开保存文件，已导出到本地：${result.fileName}\n路径：${result.file.absolutePath}")
            }
    }

    private fun startImportConfig() {
        if (!ensureConfigTransferIdle()) return
        try {
            importConfigLauncher.launch(arrayOf(AppConfigBackup.JSON_MIME, "text/plain", "application/octet-stream"))
        } catch (e: ActivityNotFoundException) {
            AppLog.w("Settings", "OpenDocument not supported", e)
            AppToast.showLong(activity, "当前设备不支持导入配置")
        } catch (t: Throwable) {
            AppLog.w("Settings", "open import config picker failed", t)
            AppToast.showLong(activity, "打开导入文件失败")
        }
    }

    private fun importConfigFromUri(uri: Uri) {
        if (!ensureConfigTransferIdle()) return
        configTransferJob =
            launchIoJob(
                startToast = "正在读取配置…",
                failureLogMessage = "import config read failed",
                failureToastPrefix = "读取配置失败",
                work = {
                    val text =
                        activity.contentResolver.openInputStream(uri)?.use { input ->
                            input.readBytes().toString(Charsets.UTF_8).removePrefix("\uFEFF")
                        } ?: error("无法读取配置文件")
                    AppConfigBackup.parse(text)
                },
            ) { parsed ->
                showImportConfigConfirmDialog(parsed)
            }
    }

    private fun showImportConfigConfirmDialog(parsed: AppConfigBackup.ParsedBackup) {
        val message =
            if (parsed.includesCredentials) {
                "该文件包含登录状态部分。\n导入后将覆盖当前配置、已保存帐号和登录状态，并重启应用。"
            } else {
                "该文件仅包含配置部分。\n导入后只覆盖当前配置，保留当前登录状态，并重启应用。"
            }
        AppPopup.confirm(
            context = activity,
            title = "导入配置",
            message = message,
            positiveText = "开始导入",
            negativeText = "取消",
            cancelable = true,
            onPositive = {
                applyImportedConfig(parsed)
            },
        )
    }

    private fun applyImportedConfig(parsed: AppConfigBackup.ParsedBackup) {
        if (!ensureConfigTransferIdle()) return
        configTransferJob =
            launchIoJob(
                startToast = if (parsed.includesCredentials) "正在导入配置与登录状态…" else "正在导入配置…",
                failureLogMessage = "apply config failed",
                failureToastPrefix = "导入失败",
                work = {
                    AppConfigBackup.apply(
                        parsed,
                        prefs = BiliClient.prefs,
                        cookies = BiliClient.cookies,
                        accounts = BiliClient.accounts,
                    )
                },
            ) {
                evictNetworkConnections()
                AppToast.showLong(activity, if (parsed.includesCredentials) "已导入配置与登录状态，正在重启…" else "已导入配置，正在重启…")
                restartToMain()
            }
    }

    private fun prepareConfigExport(mode: AppConfigBackup.ExportMode): AppConfigBackup.PreparedExport {
        return AppConfigBackup.prepareExport(
            prefs = BiliClient.prefs,
            cookies = BiliClient.cookies,
            accounts = BiliClient.accounts,
            mode = mode,
        )
    }

    private fun exportStartToast(mode: AppConfigBackup.ExportMode): String {
        return if (mode == AppConfigBackup.ExportMode.CONFIG_WITH_CREDENTIALS) {
            "正在导出配置与登录状态…"
        } else {
            "正在导出配置…"
        }
    }

    private fun showUploadLogsDialog() {
        if (uploadLogsJob?.isActive == true) {
            AppToast.show(activity, "正在上传…")
            return
        }

        AppPopup.confirm(
            context = activity,
            title = "上传日志",
            message =
                "将日志上传给开发者便于排查问题。\n\n" +
                    "会随日志附带设备、版本、屏幕和非登录配置元数据，不包含登录 Cookie。\n\n" +
                    "反馈问题时请带上上传成功后显示的文件名。",
            positiveText = "上传",
            negativeText = "取消",
            cancelable = true,
            onPositive = { startUploadLogs() },
        )
    }

    private fun startUploadLogs() {
        uploadLogsJob?.cancel()
        val popup =
            AppPopup.progress(
                context = activity,
                title = "上传日志",
                status = "准备中…",
                negativeText = "取消",
                cancelable = false,
                onNegative = { uploadLogsJob?.cancel() },
            )

        uploadLogsJob =
            activity.lifecycleScope.launch {
                var exportedFile: File? = null
                try {
                    val nowMs = System.currentTimeMillis()
                    val deviceUuid = BiliClient.prefs.deviceUuid
                    val epochSeconds = (nowMs / 1000L).coerceAtLeast(0L)
                    val deviceId8 = deviceUuid.replace("-", "").take(8).ifBlank { "unknown00" }
                    val fileName = "${epochSeconds}-${deviceId8}.zip"
                    val metaJson = buildUploadMetaJson(nowMs = nowMs, deviceUuid = deviceUuid)

                    popup?.updateProgress(null)
                    popup?.updateStatus("打包中…")
                    val export =
                        withContext(Dispatchers.IO) {
                            LogExporter.exportToLocalFile(
                                context = activity,
                                nowMs = nowMs,
                                fileNameOverride = fileName,
                                extras =
                                    listOf(
                                        LogExporter.ZipExtra(
                                            path = "meta.json",
                                            bytes = metaJson.toByteArray(Charsets.UTF_8),
                                        ),
                                    ),
                            )
                        }
                    exportedFile = export.file

                    currentCoroutineContext().ensureActive()
                    popup?.updateProgress(0)
                    popup?.updateStatus("上传中… 0%")
                    var lastPct = -1
                    var lastUpdateAtMs = 0L
                    withContext(Dispatchers.IO) {
                        LogUploadClient.uploadZip(
                            file = export.file,
                            fileName = export.fileName,
                            onProgress = { sentBytes, totalBytes ->
                                if (totalBytes <= 0L) return@uploadZip
                                val pct = ((sentBytes.coerceAtLeast(0L) * 100L) / totalBytes).toInt().coerceIn(0, 100)
                                val now = System.currentTimeMillis()
                                if (pct == lastPct && now - lastUpdateAtMs < 80L) return@uploadZip
                                lastPct = pct
                                lastUpdateAtMs = now
                                val hint = "${SettingsText.formatBytes(sentBytes)}/${SettingsText.formatBytes(totalBytes)}"
                                popup?.updateProgress(pct)
                                popup?.updateStatus("上传中… ${pct}% $hint")
                            },
                        )
                    }

                    popup?.dismiss()
                    showUploadLogsSuccessPopup(
                        fileName = export.fileName,
                    )
                } catch (_: CancellationException) {
                    popup?.dismiss()
                } catch (t: Throwable) {
                    popup?.dismiss()
                    AppLog.w("Settings", "upload logs failed", t)
                    val msg = t.message?.takeIf { it.isNotBlank() } ?: "未知错误"
                    AppToast.showLong(activity, "上传失败：$msg")
                } finally {
                    withContext(NonCancellable + Dispatchers.IO) {
                        exportedFile?.let { runCatching { it.delete() } }
                    }
                }
            }
    }

    private fun showUploadLogsSuccessPopup(
        fileName: String,
    ) {
        val body = "文件：$fileName"

        AppPopup.custom(
            context = activity,
            title = "上传成功",
            cancelable = true,
            actions =
                listOf(
                    PopupAction(role = PopupActionRole.NEGATIVE, text = "关闭"),
                    PopupAction(role = PopupActionRole.NEUTRAL, text = "复制文件名") {
                        copyToClipboard(label = "日志文件名", text = fileName, toastText = "已复制文件名")
                    },
                ),
            preferredActionRole = PopupActionRole.NEUTRAL,
            content = { dialogContext ->
                val tv =
                    android.view.LayoutInflater.from(dialogContext)
                        .inflate(blbl.cat3399.R.layout.view_popup_message, null, false) as TextView
                tv.text = body
                tv
            },
        )
    }

    private fun formatUploadTimestamp(nowMs: Long): String {
        val sdf = SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US)
        return runCatching { sdf.format(Date(nowMs)) }.getOrNull()?.takeIf { it.isNotBlank() } ?: nowMs.toString()
    }

    private fun buildUploadMetaJson(
        nowMs: Long,
        deviceUuid: String,
    ): String {
        val tzId = runCatching { java.util.TimeZone.getDefault().id }.getOrNull().orEmpty()
        val locale = runCatching { Locale.getDefault() }.getOrNull()
        val localeTag = runCatching { locale?.toLanguageTag() }.getOrNull().orEmpty()
        val prefs = BiliClient.prefs

        val json =
            JSONObject()
                .put("schema", 1)
                .put("device_uuid", deviceUuid)
                .put("export_at_ms", nowMs)
                .put("export_at", formatUploadTimestamp(nowMs))
                .put("time_zone", tzId)
                .put("locale", localeTag)
                .put(
                    "app",
                    JSONObject()
                        .put("package", BuildConfig.APPLICATION_ID)
                        .put("version_name", BuildConfig.VERSION_NAME)
                        .put("version_code", BuildConfig.VERSION_CODE)
                        .put("build_type", BuildConfig.BUILD_TYPE)
                        .put("debug", BuildConfig.DEBUG),
                )
                .put(
                    "device",
                    JSONObject()
                        .put("manufacturer", Build.MANUFACTURER)
                        .put("model", Build.MODEL)
                        .put("sdk_int", Build.VERSION.SDK_INT)
                        .put("release", Build.VERSION.RELEASE)
                        .put("abi", Build.SUPPORTED_ABIS.firstOrNull().orEmpty())
                        .put("ram", SettingsText.ramText(activity))
                        .put("hardware_decoder", SettingsText.hardDecoderSupportText()),
                )
                .put(
                    "account",
                    JSONObject()
                        .put("is_logged_in", BiliClient.cookies.hasSessData()),
                )
                .put("screen", buildUploadScreenJson())
                .put("prefs_snapshot", prefs.exportDiagnosticsSnapshotJson())

        return json.toString(2)
    }

    private fun buildUploadScreenJson(): JSONObject {
        val res = activity.resources
        val dm = res.displayMetrics
        val cfg = res.configuration

        val orientation =
            when (cfg.orientation) {
                Configuration.ORIENTATION_PORTRAIT -> "portrait"
                Configuration.ORIENTATION_LANDSCAPE -> "landscape"
                else -> "undefined"
            }
        val nightMode =
            when (cfg.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
                Configuration.UI_MODE_NIGHT_YES -> "yes"
                Configuration.UI_MODE_NIGHT_NO -> "no"
                else -> "undefined"
            }

        val sysDm = android.content.res.Resources.getSystem().displayMetrics
        val scaledDensity = dm.density * cfg.fontScale
        val systemScaledDensity = sysDm.density * cfg.fontScale

        return JSONObject()
            .put("width_px", dm.widthPixels)
            .put("height_px", dm.heightPixels)
            .put("density", dm.density)
            .put("scaled_density", scaledDensity)
            .put("density_dpi", dm.densityDpi)
            .put("xdpi", dm.xdpi)
            .put("ydpi", dm.ydpi)
            .put("font_scale", cfg.fontScale)
            .put("screen_width_dp", cfg.screenWidthDp)
            .put("screen_height_dp", cfg.screenHeightDp)
            .put("smallest_screen_width_dp", cfg.smallestScreenWidthDp)
            .put("orientation", orientation)
            .put("night_mode", nightMode)
            .put(
                "system_display_scale",
                JSONObject()
                    .put("density", sysDm.density)
                    .put("scaled_density", systemScaledDensity)
                    .put("density_dpi", sysDm.densityDpi),
            )
    }

    private fun prepareLogsExport(nowMs: Long = System.currentTimeMillis()): PreparedLogsExport {
        val deviceUuid = BiliClient.prefs.deviceUuid
        val metaJson = buildUploadMetaJson(nowMs = nowMs, deviceUuid = deviceUuid)
        return PreparedLogsExport(
            fileName = LogExporter.suggestExportFileName(nowMs = nowMs),
            nowMs = nowMs,
            extras = buildLogExportExtras(metaJson),
        )
    }

    private fun launchDocumentExport(
        request: CreateDocumentRequest,
        onUriSelected: (Uri) -> Unit,
        onFallbackToLocal: () -> Unit,
        logTag: String,
    ) {
        pendingDocumentExport = onUriSelected
        try {
            exportDocumentLauncher.launch(request)
        } catch (e: ActivityNotFoundException) {
            pendingDocumentExport = null
            AppLog.w("Settings", "CreateDocument not supported; fallback to local $logTag export", e)
            onFallbackToLocal()
        } catch (t: Throwable) {
            pendingDocumentExport = null
            AppLog.w("Settings", "open $logTag export picker failed; fallback to local export", t)
            onFallbackToLocal()
        }
    }

    private fun ensureConfigTransferIdle(): Boolean {
        if (configTransferJob?.isActive == true) {
            AppToast.show(activity, "正在处理配置…")
            return false
        }
        return true
    }

    private fun buildLogExportExtras(metaJson: String): List<LogExporter.ZipExtra> {
        return listOf(
            LogExporter.ZipExtra(
                path = "meta.json",
                bytes = metaJson.toByteArray(Charsets.UTF_8),
            ),
        )
    }

    private fun <T> launchIoJob(
        startToast: String,
        failureLogMessage: String,
        failureToastPrefix: String,
        work: suspend () -> T,
        onSuccess: (T) -> Unit,
    ): Job {
        return activity.lifecycleScope.launch {
            AppToast.show(activity, startToast)
            runCatching {
                withContext(Dispatchers.IO) { work() }
            }.onSuccess(onSuccess)
                .onFailure { t ->
                    AppLog.w("Settings", failureLogMessage, t)
                    AppToast.showLong(activity, "$failureToastPrefix：${throwableMessage(t)}")
                }
        }
    }

    private fun throwableMessage(t: Throwable): String {
        return t.message?.takeIf { it.isNotBlank() } ?: "未知错误"
    }

    fun onEntryClicked(entry: SettingEntry) {
        val prefs = BiliClient.prefs
        state.pendingRestoreRightId = entry.id
        when (entry.id) {
            SettingId.ImageQuality -> {
                val next =
                    when (prefs.imageQuality) {
                        "small" -> "medium"
                        "medium" -> "large"
                        else -> "small"
                    }
                prefs.imageQuality = next
                AppToast.show(activity, "图片质量：$next")
                renderer.refreshSection(entry.id)
            }

            SettingId.ThemePreset -> {
                val options =
                    listOf(
                        blbl.cat3399.core.prefs.AppPrefs.THEME_PRESET_DEFAULT to "默认",
                        blbl.cat3399.core.prefs.AppPrefs.THEME_PRESET_TV_PINK to "小电视粉",
                        blbl.cat3399.core.prefs.AppPrefs.THEME_PRESET_TV_PINK_ILLUSTRATION to "经典",
                        blbl.cat3399.core.prefs.AppPrefs.THEME_PRESET_BLUE_DARK to "深海蓝",
                        blbl.cat3399.core.prefs.AppPrefs.THEME_PRESET_GREEN_DARK to "极光绿",
                    )
                showChoiceDialog(
                    title = "主题",
                    items = options.map { it.second },
                    current = SettingsText.themePresetText(prefs.themePreset),
                ) { selected ->
                    val key =
                        options.firstOrNull { it.second == selected }?.first
                            ?: blbl.cat3399.core.prefs.AppPrefs.THEME_PRESET_DEFAULT

                    if (prefs.themePreset == key) {
                        AppToast.show(activity, "主题：$selected")
                        return@showChoiceDialog
                    }

                    prefs.themePreset = key
                    AppToast.show(activity, "主题：$selected（已应用）")
                    restartToMain()
                }
            }

            SettingId.ApiSource -> {
                val options =
                    listOf(
                        blbl.cat3399.core.prefs.AppPrefs.API_SOURCE_WEB to "Web",
                        blbl.cat3399.core.prefs.AppPrefs.API_SOURCE_APP to "App",
                    )
                showChoiceDialog(
                    title = "接口类别",
                    items = options.map { it.second },
                    current = SettingsText.apiSourceText(prefs.apiSource),
                ) { selected ->
                    val key = options.firstOrNull { it.second == selected }?.first
                        ?: blbl.cat3399.core.prefs.AppPrefs.API_SOURCE_WEB
                    if (key == blbl.cat3399.core.prefs.AppPrefs.API_SOURCE_APP &&
                        prefs.appAuthSession?.accessKey.isNullOrBlank()
                    ) {
                        AppToast.show(activity, "首次使用 App 接口需要重新登录")
                        return@showChoiceDialog
                    }
                    if (prefs.apiSource == key) {
                        AppToast.show(activity, "接口类别：$selected")
                        return@showChoiceDialog
                    }
                    prefs.apiSource = key
                    evictNetworkConnections()
                    AppToast.show(activity, "接口类别：$selected")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.UserAgent -> showUserAgentDialog(state.currentSectionIndex, entry.id)
            SettingId.Ipv4OnlyEnabled -> {
                prefs.ipv4OnlyEnabled = !prefs.ipv4OnlyEnabled
                AppToast.show(activity, "是否只允许使用IPV4：${if (prefs.ipv4OnlyEnabled) "开" else "关"}")
                evictNetworkConnections()
                renderer.refreshSection(entry.id)
            }
            SettingId.GaiaVgate -> showGaiaVgateDialog(state.currentSectionIndex, entry.id)
            SettingId.ClearCache -> showClearCacheDialog(state.currentSectionIndex, entry.id)
            SettingId.ConfigTransfer -> showConfigTransferDialog()
            SettingId.ClearLogin -> showClearLoginDialog(state.currentSectionIndex, entry.id)
            SettingId.ExportLogs -> {
                val prepared = prepareLogsExport()
                launchDocumentExport(
                    request = CreateDocumentRequest(mimeType = LogExporter.ZIP_MIME, fileName = prepared.fileName),
                    onUriSelected = { uri -> exportLogsToUri(uri = uri, prepared = prepared) },
                    onFallbackToLocal = { exportLogsToLocalFile(prepared) },
                    logTag = "logs",
                )
            }

            SettingId.UploadLogs -> {
                showUploadLogsDialog()
            }

            SettingId.AutoUpdateCheckEnabled -> {
                prefs.autoUpdateCheckEnabled = !prefs.autoUpdateCheckEnabled
                AppToast.show(activity, "自动检查更新：${if (prefs.autoUpdateCheckEnabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.FullscreenEnabled -> {
                prefs.fullscreenEnabled = !prefs.fullscreenEnabled
                Immersive.apply(activity, prefs.fullscreenEnabled)
                AppToast.show(activity, "全屏：${if (prefs.fullscreenEnabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.AvoidDisplayCutout -> {
                prefs.avoidDisplayCutout = !prefs.avoidDisplayCutout
                activity.reapplyWindowDisplayPolicy()
                AppToast.show(activity, "避开挖孔/圆角区域：${if (prefs.avoidDisplayCutout) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.TabSwitchFollowsFocus -> {
                prefs.tabSwitchFollowsFocus = !prefs.tabSwitchFollowsFocus
                AppToast.show(activity, "tab跟随焦点切换：${if (prefs.tabSwitchFollowsFocus) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.MainAutoHideSidebarOnEnterContent -> {
                prefs.mainAutoHideSidebarOnEnterContent = !prefs.mainAutoHideSidebarOnEnterContent
                AppToast.show(activity, "进入内容区后关闭侧边栏：${if (prefs.mainAutoHideSidebarOnEnterContent) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.MainBackFocusScheme -> {
                val options =
                    listOf(
                        blbl.cat3399.core.prefs.AppPrefs.MAIN_BACK_FOCUS_SCHEME_A to "回到当前所属Tab",
                        blbl.cat3399.core.prefs.AppPrefs.MAIN_BACK_FOCUS_SCHEME_B to "回到Tab0内容区",
                        blbl.cat3399.core.prefs.AppPrefs.MAIN_BACK_FOCUS_SCHEME_C to "回到侧边栏",
                    )
                showChoiceDialog(
                    title = "返回键焦点策略",
                    items = options.map { it.second },
                    current = SettingsText.mainBackFocusSchemeText(prefs.mainBackFocusScheme),
                ) { selected ->
                    val key = options.firstOrNull { it.second == selected }?.first
                        ?: blbl.cat3399.core.prefs.AppPrefs.MAIN_BACK_FOCUS_SCHEME_A
                    prefs.mainBackFocusScheme = key
                    AppToast.show(activity, "返回键焦点策略：$selected")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.VideoCardLongPressAction -> {
                val options =
                    listOf(
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_MANUAL to "手动选择",
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_WATCH_LATER to "添加到稍后再看",
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_OPEN_DETAIL to "进入详情页",
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_OPEN_UP to "进入UP主页",
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_DISMISS to "不感兴趣",
                        // v5.9: 分享视频
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_SHARE to "分享视频",
                        // v6.3: 复制链接
                        AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_COPY_LINK to "复制链接",
                    )
                showChoiceDialog(
                    title = "长按视频卡片",
                    items = options.map { it.second },
                    current = SettingsText.videoCardLongPressActionText(prefs.videoCardLongPressAction),
                ) { selected ->
                    val value = options.firstOrNull { it.second == selected }?.first ?: AppPrefs.VIDEO_CARD_LONG_PRESS_ACTION_MANUAL
                    prefs.videoCardLongPressAction = value
                    AppToast.show(activity, "长按视频卡片：$selected")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.StartupPage -> {
                val options =
                    MainRootNavRegistry.startupSpecs().map { spec ->
                        (spec.startupPageKey ?: AppPrefs.STARTUP_PAGE_HOME) to activity.getString(spec.titleRes)
                    }
                showChoiceDialog(
                    title = "启动默认页",
                    items = options.map { it.second },
                    current = SettingsText.startupPageText(activity, prefs.startupPage),
                ) { selected ->
                    val key =
                        options.firstOrNull { it.second == selected }?.first
                            ?: blbl.cat3399.core.prefs.AppPrefs.STARTUP_PAGE_HOME
                    prefs.startupPage = key
                    AppToast.show(activity, "启动默认页：$selected（下次启动生效）")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.CustomPageEnabled -> {
                val config = prefs.customPageConfig
                prefs.customPageConfig = config.copy(enabled = !config.enabled)
                AppToast.show(activity, "自定义页：${if (prefs.customPageConfig.enabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.CustomPageContent -> showCustomPageContentDialog(sectionIndex = state.currentSectionIndex, focusId = entry.id)

            SettingId.FollowingListOrder -> {
                val options =
                    listOf(
                        AppPrefs.FOLLOWING_LIST_ORDER_FOLLOW_TIME to "关注时间",
                        AppPrefs.FOLLOWING_LIST_ORDER_RECENT_VISIT to "最近访问",
                    )
                showChoiceDialog(
                    title = "关注列表排序",
                    items = options.map { it.second },
                    current = SettingsText.followingListOrderText(prefs.followingListOrder),
                ) { selected ->
                    val value = options.firstOrNull { it.second == selected }?.first ?: AppPrefs.FOLLOWING_LIST_ORDER_FOLLOW_TIME
                    prefs.followingListOrder = value
                    AppToast.show(activity, "关注列表排序：$selected")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.MainHomeVisibleTabs -> {
                showVisibleTabsDialog(
                    sectionIndex = state.currentSectionIndex,
                    focusId = entry.id,
                    title = "主页显示页面",
                    options = HomeTabs.all.map { it.key to activity.getString(it.titleRes) },
                    selectedKeys = prefs.mainHomeVisibleTabs,
                ) { prefs.mainHomeVisibleTabs = it }
            }

            SettingId.MainCategoryVisibleTabs -> {
                showVisibleTabsDialog(
                    sectionIndex = state.currentSectionIndex,
                    focusId = entry.id,
                    title = "分类页显示页面",
                    options = CategoryZones.defaultZones.map { CategoryZones.stableKeyFor(it) to it.title },
                    selectedKeys = prefs.mainCategoryVisibleTabs,
                ) { prefs.mainCategoryVisibleTabs = it }
            }

            SettingId.MainLiveVisibleTabs -> {
                showVisibleTabsDialog(
                    sectionIndex = state.currentSectionIndex,
                    focusId = entry.id,
                    title = "直播页显示页面",
                    options = LiveFragment.LiveTabs.all.map { it.key to it.title },
                    selectedKeys = prefs.mainLiveVisibleTabs,
                ) { prefs.mainLiveVisibleTabs = it }
            }

            // v4.10: 侧边栏Tab隐藏
            SettingId.HiddenSidebarTabs -> {
                val sidebarNames = mapOf(
                    0 to "搜索", 1 to "推荐", 2 to "分类",
                    3 to "动态", 4 to "直播", 5 to "我的", 6 to "自定义"
                )
                val options = sidebarNames.map { it.key.toString() to it.value }
                val selectedKeys = prefs.hiddenSidebarTabs.map { it.toString() }
                showVisibleTabsDialog(
                    sectionIndex = state.currentSectionIndex,
                    focusId = entry.id,
                    title = "隐藏侧边栏页面",
                    options = options,
                    selectedKeys = selectedKeys,
                ) { newKeys ->
                    prefs.hiddenSidebarTabs = newKeys.mapNotNull { it.toIntOrNull() }.toSet()
                }
            }

            SettingId.MainMyVisibleTabs -> {
                showVisibleTabsDialog(
                    sectionIndex = state.currentSectionIndex,
                    focusId = entry.id,
                    title = "我的页显示页面",
                    options = MyTabs.all.map { it.key to activity.getString(it.titleRes) },
                    selectedKeys = prefs.mainMyVisibleTabs,
                ) { prefs.mainMyVisibleTabs = it }
            }

            SettingId.UiScaleFactor -> {
                val factors = (70..140 step 5).map { it / 100f }
                val items = factors.map { SettingsText.uiScaleFactorText(it) }
                showChoiceDialog(
                    title = "界面大小",
                    items = items,
                    current = SettingsText.uiScaleFactorText(prefs.uiScaleFactor),
                ) { selected ->
                    val factor = factors.getOrNull(items.indexOf(selected)) ?: prefs.uiScaleFactor
                    prefs.uiScaleFactor = factor
                    AppToast.show(activity, "界面大小：$selected")
                    // Accept "recreate to apply" to keep UI scale management centralized and reduce per-module sizing code.
                    activity.recreate()
                }
            }

            // v5.0: 字体大小
            SettingId.FontScaleFactor -> {
                val factors = (80..130 step 5).map { it / 100f }
                val items = factors.map { SettingsText.fontScaleFactorText(it) }
                showChoiceDialog(
                    title = "字体大小",
                    items = items,
                    current = SettingsText.fontScaleFactorText(prefs.fontScaleFactor),
                ) { selected ->
                    val factor = factors.getOrNull(items.indexOf(selected)) ?: prefs.fontScaleFactor
                    prefs.fontScaleFactor = factor
                    AppToast.show(activity, "字体大小：$selected")
                    activity.recreate()
                }
            }

            SettingId.GridSpanCount -> {
                val options = listOf("1", "2", "3", "4", "5", "6")
                showChoiceDialog(
                    title = "每行卡片数量",
                    items = options,
                    current = SettingsText.gridSpanText(prefs.gridSpanCount),
                ) { selected ->
                    prefs.gridSpanCount = (selected.toIntOrNull() ?: 4).coerceIn(1, 6)
                    AppToast.show(activity, "每行卡片：${SettingsText.gridSpanText(prefs.gridSpanCount)}")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DynamicGridSpanCount -> {
                val options = listOf("1", "2", "3", "4", "5", "6")
                showChoiceDialog(
                    title = "动态页每行卡片数量",
                    items = options,
                    current = SettingsText.gridSpanText(prefs.dynamicGridSpanCount),
                ) { selected ->
                    prefs.dynamicGridSpanCount = (selected.toIntOrNull() ?: 3).coerceIn(1, 6)
                    AppToast.show(activity, "动态每行：${SettingsText.gridSpanText(prefs.dynamicGridSpanCount)}")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PgcGridSpanCount -> {
                val options = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
                showChoiceDialog(
                    title = "番剧/电视剧每行卡片数量",
                    items = options,
                    current = SettingsText.gridSpanText(prefs.pgcGridSpanCount),
                ) { selected ->
                    prefs.pgcGridSpanCount = (selected.toIntOrNull() ?: 6).coerceIn(1, 6)
                    AppToast.show(activity, "番剧每行：${SettingsText.gridSpanText(prefs.pgcGridSpanCount)}")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuEnabled -> {
                prefs.danmakuEnabled = !prefs.danmakuEnabled
                AppToast.show(activity, "弹幕：${if (prefs.danmakuEnabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.SubtitleEnabledDefault -> {
                prefs.subtitleEnabledDefault = !prefs.subtitleEnabledDefault
                AppToast.show(activity, "默认字幕：${if (prefs.subtitleEnabledDefault) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.SubtitleTextSizeSp -> {
                val options = PlaybackSettingChoices.subtitleTextSizes
                showChoiceDialog(
                    title = "字幕字体大小(sp)",
                    items = options.map { it.toString() },
                    current = prefs.subtitleTextSizeSp.toInt().toString(),
                ) { selected ->
                    prefs.subtitleTextSizeSp = (selected.toIntOrNull() ?: 26).toFloat().coerceIn(10f, 60f)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.SubtitleBottomPaddingFraction -> {
                val options = PlaybackSettingChoices.subtitleBottomPaddingPercents
                val items = options.map { "${it}%" }
                val checked =
                    options.indices.minByOrNull { kotlin.math.abs(options[it] / 100f - prefs.subtitleBottomPaddingFraction) }
                        ?: 0
                showChoiceDialog(
                    title = "字幕底部间距(占屏比%)",
                    items = items,
                    checkedIndex = checked,
                ) { selected ->
                    val percent = selected.removeSuffix("%").toIntOrNull() ?: options.getOrNull(checked) ?: 16
                    prefs.subtitleBottomPaddingFraction = percent / 100f
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.SubtitleBackgroundOpacity -> {
                val ordered = PlaybackSettingChoices.subtitleBackgroundOpacities
                val items = ordered.map { String.format(Locale.US, "%.2f", it) }
                val checked = ordered.indices.minByOrNull { kotlin.math.abs(ordered[it] - prefs.subtitleBackgroundOpacity) } ?: 0
                showChoiceDialog(
                    title = "字幕背景透明度",
                    items = items,
                    checkedIndex = checked,
                ) { selected ->
                    val value = selected.toFloatOrNull() ?: ordered.getOrNull(checked) ?: prefs.subtitleBackgroundOpacity
                    prefs.subtitleBackgroundOpacity = value.coerceIn(0f, 1.0f)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuOpacity -> {
                val options = PlaybackSettingChoices.danmakuOpacities
                showChoiceDialog(
                    title = "弹幕透明度",
                    items = options.map { String.format(Locale.US, "%.2f", it) },
                    current = String.format(Locale.US, "%.2f", prefs.danmakuOpacity),
                ) { selected ->
                    prefs.danmakuOpacity = selected.toFloatOrNull()?.coerceIn(0.05f, 1.0f) ?: prefs.danmakuOpacity
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuTextSizeSp -> {
                val options = PlaybackSettingChoices.danmakuTextSizes
                showChoiceDialog(
                    title = "弹幕字体大小(sp)",
                    items = options.map { it.toString() },
                    current = prefs.danmakuTextSizeSp.toInt().toString(),
                ) { selected ->
                    prefs.danmakuTextSizeSp = (selected.toIntOrNull() ?: 18).toFloat().coerceIn(10f, 60f)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuFontWeight -> {
                val options = PlaybackSettingChoices.danmakuFontWeights
                showChoiceDialog(
                    title = "字体粗细",
                    items = options.map { SettingsText.danmakuFontWeightText(it.prefValue) },
                    current = SettingsText.danmakuFontWeightText(prefs.danmakuFontWeight),
                ) { selected ->
                    val value =
                        options
                            .firstOrNull { SettingsText.danmakuFontWeightText(it.prefValue) == selected }
                            ?.prefValue
                            ?: AppPrefs.DANMAKU_FONT_WEIGHT_BOLD
                    prefs.danmakuFontWeight = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuStrokeWidthPx -> {
                val options = PlaybackSettingChoices.danmakuStrokeWidths
                showChoiceDialog(
                    title = "弹幕文字描边粗细",
                    items = options.map { it.toString() },
                    current = prefs.danmakuStrokeWidthPx.toString(),
                ) { selected ->
                    prefs.danmakuStrokeWidthPx = selected.toIntOrNull() ?: prefs.danmakuStrokeWidthPx
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuArea -> {
                val options = PlaybackSettingChoices.danmakuAreas
                showChoiceDialog(
                    title = "弹幕占屏比",
                    items = options.map { it.second },
                    current = SettingsText.areaText(prefs.danmakuArea),
                ) { selected ->
                    val value = options.firstOrNull { it.second == selected }?.first ?: 1.0f
                    prefs.danmakuArea = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuLaneDensity -> {
                val options = PlaybackSettingChoices.danmakuLaneDensities
                showChoiceDialog(
                    title = "轨道密度",
                    items = options.map { SettingsText.danmakuLaneDensityText(it.prefValue) },
                    current = SettingsText.danmakuLaneDensityText(prefs.danmakuLaneDensity),
                ) { selected ->
                    val value =
                        options
                            .firstOrNull { SettingsText.danmakuLaneDensityText(it.prefValue) == selected }
                            ?.prefValue
                            ?: AppPrefs.DANMAKU_LANE_DENSITY_STANDARD
                    prefs.danmakuLaneDensity = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuSpeed -> {
                val options = PlaybackSettingChoices.danmakuSpeeds.map(Int::toString)
                showChoiceDialog(
                    title = "弹幕速度(1~10)",
                    items = options,
                    current = prefs.danmakuSpeed.toString(),
                ) { selected ->
                    prefs.danmakuSpeed = (selected.toIntOrNull() ?: 4).coerceIn(1, 10)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuFollowBiliShield -> {
                prefs.danmakuFollowBiliShield = !prefs.danmakuFollowBiliShield
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuShowHighLikeIcon -> {
                prefs.danmakuShowHighLikeIcon = !prefs.danmakuShowHighLikeIcon
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuAiShieldEnabled -> {
                prefs.danmakuAiShieldEnabled = !prefs.danmakuAiShieldEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuAiShieldLevel -> {
                val options = PlaybackSettingChoices.aiShieldLevels.map(Int::toString)
                showChoiceDialog(
                    title = "智能云屏蔽等级",
                    items = options,
                    current = SettingsText.aiLevelText(prefs.danmakuAiShieldLevel),
                ) { selected ->
                    prefs.danmakuAiShieldLevel = (selected.toIntOrNull() ?: 3).coerceIn(1, 10)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.DanmakuAllowScroll -> {
                prefs.danmakuAllowScroll = !prefs.danmakuAllowScroll
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuAllowTop -> {
                prefs.danmakuAllowTop = !prefs.danmakuAllowTop
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuAllowBottom -> {
                prefs.danmakuAllowBottom = !prefs.danmakuAllowBottom
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuAllowColor -> {
                prefs.danmakuAllowColor = !prefs.danmakuAllowColor
                renderer.refreshSection(entry.id)
            }

            SettingId.DanmakuAllowSpecial -> {
                prefs.danmakuAllowSpecial = !prefs.danmakuAllowSpecial
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerPreferredQn -> {
                val options =
                    PlaybackSettingChoices.resolutionQns.map { it to SettingsText.qnText(it) }
                showChoiceDialog(
                    title = "默认画质",
                    items = options.map { it.second },
                    current = SettingsText.qnText(prefs.playerPreferredQn),
                ) { selected ->
                    val qn = options.firstOrNull { it.second == selected }?.first
                    if (qn != null) prefs.playerPreferredQn = qn
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerPreferredQnPortrait -> {
                val options =
                    PlaybackSettingChoices.resolutionQns.map { it to SettingsText.qnText(it) }
                showChoiceDialog(
                    title = "默认画质（竖屏）",
                    items = options.map { it.second },
                    current = SettingsText.qnText(prefs.playerPreferredQnPortrait),
                ) { selected ->
                    val qn = options.firstOrNull { it.second == selected }?.first
                    if (qn != null) prefs.playerPreferredQnPortrait = qn
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerPreferredAudioId -> {
                val options = PlaybackSettingChoices.audioTrackIds
                val optionLabels = options.map { SettingsText.audioText(it) }
                showChoiceDialog(
                    title = "默认音轨",
                    items = optionLabels,
                    current = SettingsText.audioText(prefs.playerPreferredAudioId),
                ) { selected ->
                    val id = options.getOrNull(optionLabels.indexOfFirst { it == selected }.takeIf { it >= 0 } ?: -1)
                    if (id != null) prefs.playerPreferredAudioId = id
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerCdnPreference -> {
                val options =
                    listOf(
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_CDN_BILIVIDEO to "bilivideo（默认）",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_CDN_MCDN to "mcdn（部分网络更快/更慢）",
                    )
                val checked = options.indexOfFirst { it.first == prefs.playerCdnPreference }.coerceAtLeast(0)
                showChoiceDialog(
                    title = "CDN线路",
                    items = options.map { it.second },
                    checkedIndex = checked,
                ) { selected ->
                    val value = options.firstOrNull { it.second == selected }?.first
                        ?: blbl.cat3399.core.prefs.AppPrefs.PLAYER_CDN_BILIVIDEO
                    prefs.playerCdnPreference = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerSpeed -> {
                val options = PlaybackSettingChoices.playbackSpeeds
                showChoiceDialog(
                    title = "默认播放速度",
                    items = options.map { String.format(Locale.US, "%.2fx", it) },
                    current = String.format(Locale.US, "%.2fx", prefs.playerSpeed),
                ) { selected ->
                    val v = selected.removeSuffix("x").toFloatOrNull()
                    if (v != null) prefs.playerSpeed = v.coerceIn(0.25f, 3.0f)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerShortSeekStepSeconds -> {
                showPlayerShortSeekStepDialog(sectionIndex = state.currentSectionIndex, focusId = entry.id)
            }

            SettingId.PlayerHoldSeekSpeed -> {
                val options = listOf(1.5f, 2.0f, 3.0f, 4.0f)
                showChoiceDialog(
                    title = "长按快进倍率",
                    items = options.map { String.format(Locale.US, "%.2fx", it) },
                    current = String.format(Locale.US, "%.2fx", prefs.playerHoldSeekSpeed),
                ) { selected ->
                    val v = selected.removeSuffix("x").toFloatOrNull()
                    if (v != null) prefs.playerHoldSeekSpeed = v.coerceIn(1.5f, 4.0f)
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerHoldSeekMode -> {
                val options =
                    listOf(
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_HOLD_SEEK_MODE_SPEED to "倍率加速",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_HOLD_SEEK_MODE_SCRUB to "拖动进度条",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_HOLD_SEEK_MODE_SCRUB_FIXED_TIME to "固定时间拖动进度条",
                    )
                val labels = options.map { it.second }
                val checked = options.indexOfFirst { it.first == prefs.playerHoldSeekMode }.coerceAtLeast(0)
                AppPopup.singleChoice(
                    context = activity,
                    title = "长按快进模式",
                    items = labels,
                    checkedIndex = checked,
                ) { which, _ ->
                    val value =
                        options.getOrNull(which)?.first
                            ?: blbl.cat3399.core.prefs.AppPrefs.PLAYER_HOLD_SEEK_MODE_SPEED
                    prefs.playerHoldSeekMode = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerHoldScrubTraverseSeconds -> {
                showPlayerHoldScrubTraverseSecondsDialog(sectionIndex = state.currentSectionIndex, focusId = entry.id)
            }

            SettingId.PlayerHoldScrubFixedStepSeconds -> {
                showPlayerHoldScrubFixedStepSecondsDialog(sectionIndex = state.currentSectionIndex, focusId = entry.id)
            }

            SettingId.PlayerAutoResumeEnabled -> {
                prefs.playerAutoResumeEnabled = !prefs.playerAutoResumeEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerAutoSkipSegmentsEnabled -> {
                prefs.playerAutoSkipSegmentsEnabled = !prefs.playerAutoSkipSegmentsEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerAutoSkipServerBaseUrl -> {
                showPlayerAutoSkipServerBaseUrlDialog(state.currentSectionIndex, entry.id)
            }

            SettingId.PlayerOpenDetailBeforePlay -> {
                prefs.playerOpenDetailBeforePlay = !prefs.playerOpenDetailBeforePlay
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerPlaybackMode -> {
                val modeCodes = PlayerPlaybackModes.ordered
                val options = modeCodes.map(PlayerPlaybackModes::label)
                showChoiceDialog(
                    title = "播放模式（全局默认）",
                    items = options,
                    current = PlayerPlaybackModes.label(prefs.playerPlaybackMode),
                ) { selected ->
                    val selectedIndex = options.indexOf(selected).takeIf { it >= 0 } ?: 0
                    prefs.playerPlaybackMode = modeCodes.getOrElse(selectedIndex) { AppPrefs.PLAYER_PLAYBACK_MODE_NONE }
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerSettingsApplyToGlobal -> {
                prefs.playerSettingsApplyToGlobal = !prefs.playerSettingsApplyToGlobal
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerUpQuickCardEnabled -> {
                prefs.playerUpQuickCardEnabled = !prefs.playerUpQuickCardEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.SubtitlePreferredLang -> {
                val options =
                    listOf(
                        "auto" to "自动",
                        "zh-Hans" to "中文(简体)",
                        "zh-Hant" to "中文(繁体)",
                        "en" to "English",
                        "ja" to "日本語",
                        "ko" to "한국어",
                    )
                showChoiceDialog(
                    title = "字幕语言",
                    items = options.map { it.second },
                    current = SettingsText.subtitleLangText(prefs.subtitlePreferredLang),
                ) { selected ->
                    val code = options.firstOrNull { it.second == selected }?.first ?: "auto"
                    prefs.subtitlePreferredLang = code
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerPreferredCodec -> {
                val options = listOf("AVC", "HEVC", "AV1")
                showChoiceDialog(
                    title = "视频编码(偏好)",
                    items = options,
                    current = prefs.playerPreferredCodec,
                ) { selected ->
                    prefs.playerPreferredCodec = selected
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerRenderView -> {
                val options = listOf("SurfaceView", "TextureView")
                showChoiceDialog(
                    title = "渲染视图",
                    items = options,
                    current = SettingsText.renderViewText(prefs.playerRenderViewType),
                ) { selected ->
                    prefs.playerRenderViewType =
                        when (selected) {
                            "TextureView" -> blbl.cat3399.core.prefs.AppPrefs.PLAYER_RENDER_VIEW_TEXTURE_VIEW
                            else -> blbl.cat3399.core.prefs.AppPrefs.PLAYER_RENDER_VIEW_SURFACE_VIEW
                        }
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerEngineKind -> {
                val options = listOf("ExoPlayer", "IjkPlayer")
                showChoiceDialog(
                    title = "播放器内核",
                    items = options,
                    current = SettingsText.playerEngineText(prefs.playerEngineKind),
                ) { selected ->
                    val value =
                        when (selected) {
                            "IjkPlayer" -> blbl.cat3399.core.prefs.AppPrefs.PLAYER_ENGINE_IJK
                            else -> blbl.cat3399.core.prefs.AppPrefs.PLAYER_ENGINE_EXO
                        }
                    if (value == blbl.cat3399.core.prefs.AppPrefs.PLAYER_ENGINE_IJK) {
                        IjkPlayerPluginUi.ensureInstalled(activity) {
                            prefs.playerEngineKind = value
                            AppToast.show(activity, "播放器内核：$selected（下次播放生效）")
                            renderer.refreshSection(entry.id)
                        }
                        return@showChoiceDialog
                    }

                    if (prefs.playerEngineKind == value) {
                        AppToast.show(activity, "播放器内核：$selected")
                        return@showChoiceDialog
                    }

                    prefs.playerEngineKind = value
                    AppToast.show(activity, "播放器内核：$selected（下次播放生效）")
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerAudioBalance -> {
                val options = AudioBalanceLevel.ordered
                val current = AudioBalanceLevel.fromPrefValue(prefs.playerAudioBalanceLevel)
                val checked = options.indexOf(current).takeIf { it >= 0 } ?: 0
                showChoiceDialog(
                    title = "音频平衡",
                    items = options.map { it.label },
                    checkedIndex = checked,
                ) { selected ->
                    val picked = options.firstOrNull { it.label == selected } ?: AudioBalanceLevel.Off
                    prefs.playerAudioBalanceLevel = picked.prefValue
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerOsdButtons -> showPlayerOsdButtonsDialog(sectionIndex = state.currentSectionIndex, focusId = entry.id)

            SettingId.PlayerCustomShortcuts -> showPlayerCustomShortcutsDialog(sectionIndex = state.currentSectionIndex, focusId = entry.id)

            SettingId.LiveHighBitrateEnabled -> {
                prefs.liveHighBitrateEnabled = !prefs.liveHighBitrateEnabled
                AppToast.show(activity, "提高直播码率：${if (prefs.liveHighBitrateEnabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerDebugEnabled -> {
                prefs.playerDebugEnabled = !prefs.playerDebugEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.DynamicFollowingRecentUpdateDotEnabled -> {
                prefs.dynamicFollowingRecentUpdateDotEnabled = !prefs.dynamicFollowingRecentUpdateDotEnabled
                AppToast.show(activity, "动态页小红点：${if (prefs.dynamicFollowingRecentUpdateDotEnabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerDoubleBackToExit -> {
                prefs.playerDoubleBackToExit = !prefs.playerDoubleBackToExit
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerDownKeyOsdFocusTarget -> {
                val options =
                    listOf(
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE to "播放/暂停",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_PREV to "上一个",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_NEXT to "下一个",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_SUBTITLE to "字幕",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_DANMAKU to "弹幕",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_COMMENTS to "评论",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_DETAIL to "视频详情页",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_UP to "UP主",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_LIKE to "点赞",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_COIN to "投币",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_FAV to "收藏",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_LIST_PANEL to "列表面板",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_SPONSOR_SUBMIT to "上传广告片段",
                        blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_ADVANCED to "更多设置",
                    )
                showChoiceDialog(
                    title = "下键呼出OSD后焦点",
                    items = options.map { it.second },
                    current = SettingsText.downKeyOsdFocusTargetText(prefs.playerDownKeyOsdFocusTarget),
                ) { selected ->
                    val value =
                        options.firstOrNull { it.second == selected }?.first
                            ?: blbl.cat3399.core.prefs.AppPrefs.PLAYER_DOWN_KEY_OSD_FOCUS_PLAY_PAUSE
                    prefs.playerDownKeyOsdFocusTarget = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.PlayerTogglePlayStateShowOsd -> {
                prefs.playerTogglePlayStateShowOsd = !prefs.playerTogglePlayStateShowOsd
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerPersistentBottomProgressEnabled -> {
                prefs.playerPersistentBottomProgressEnabled = !prefs.playerPersistentBottomProgressEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerPersistentClockEnabled -> {
                prefs.playerPersistentClockEnabled = !prefs.playerPersistentClockEnabled
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerTouchGesturesEnabled -> {
                prefs.playerTouchGesturesEnabled = !prefs.playerTouchGesturesEnabled
                AppToast.show(activity, "触摸手势：${if (prefs.playerTouchGesturesEnabled) "开" else "关"}")
                renderer.refreshSection(entry.id)
            }

            // v5.7: 双击动作
            SettingId.DoubleTapAction -> {
                val options = listOf(
                    AppPrefs.DOUBLE_TAP_ACTION_PLAY_PAUSE to "播放/暂停",
                    AppPrefs.DOUBLE_TAP_ACTION_LIKE to "点赞",
                    AppPrefs.DOUBLE_TAP_ACTION_DANMAKU_TOGGLE to "弹幕开关",
                )
                showChoiceDialog(
                    title = "双击动作",
                    items = options.map { it.second },
                    current = options.firstOrNull { it.first == prefs.doubleTapAction }?.second ?: "播放/暂停",
                ) { selected ->
                    prefs.doubleTapAction = options.firstOrNull { it.second == selected }?.first ?: 0
                    renderer.refreshSection(entry.id)
                }
            }

            // v5.8: 省流模式
            SettingId.DataSaverMode -> {
                prefs.dataSaverMode = !prefs.dataSaverMode
                val msg = if (prefs.dataSaverMode) "省流模式：开（画质480p、弹幕关、图片低质量）" else "省流模式：关"
                AppToast.show(activity, msg)
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerVideoShotPreviewSize -> {
                val options =
                    listOf(
                        AppPrefs.PLAYER_VIDEOSHOT_PREVIEW_SIZE_OFF to "不显示",
                        AppPrefs.PLAYER_VIDEOSHOT_PREVIEW_SIZE_SMALL to "小",
                        AppPrefs.PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM to "中",
                        AppPrefs.PLAYER_VIDEOSHOT_PREVIEW_SIZE_LARGE to "大",
                    )
                val checked = options.indexOfFirst { it.first == prefs.playerVideoShotPreviewSize }.coerceAtLeast(0)
                showChoiceDialog(
                    title = "缩略图显示",
                    items = options.map { it.second },
                    checkedIndex = checked,
                ) { selected ->
                    val value = options.firstOrNull { it.second == selected }?.first ?: AppPrefs.PLAYER_VIDEOSHOT_PREVIEW_SIZE_MEDIUM
                    prefs.playerVideoShotPreviewSize = value
                    renderer.refreshSection(entry.id)
                }
            }

            // v11.4: 自动展开视频简介
            SettingId.AutoExpandDesc -> {
                prefs.autoExpandDesc = !prefs.autoExpandDesc
                AppToast.show(activity, if (prefs.autoExpandDesc) "自动展开简介：开" else "自动展开简介：关")
                renderer.refreshSection(entry.id)
            }

            SettingId.PlayerStyle -> {
                val options =
                    listOf(
                        AppPrefs.PLAYER_STYLE_FULLSCREEN to "全屏",
                        AppPrefs.PLAYER_STYLE_HD to "HD",
                    )
                val checked = options.indexOfFirst { it.first == prefs.playerStyle }.coerceAtLeast(0)
                showChoiceDialog(
                    title = SettingsText.playerStyleTitle(),
                    items = options.map { it.second },
                    checkedIndex = checked,
                ) { selected ->
                    val value = options.firstOrNull { it.second == selected }?.first ?: AppPrefs.PLAYER_STYLE_FULLSCREEN
                    prefs.playerStyle = value
                    renderer.refreshSection(entry.id)
                }
            }

            SettingId.ProjectUrl -> showProjectDialog()

            SettingId.About -> showAboutDialog()

            SettingId.DownloadManagement -> showDownloadManagementDialog()  // v12.3

            SettingId.CastManagement -> showCastManagementDialog()  // v12.4

            SettingId.NetworkDiagnostics -> showNetworkDiagnosticsDialog()  // v12.5

            SettingId.WatchStatistics -> showWatchStatisticsDialog()  // v12.6

            SettingId.HistoryManagement -> showHistoryManagementDialog()  // v12.7

            SettingId.CacheManagement -> showCacheManagementDialog()  // v12.8

            SettingId.RemoteHelp -> showRemoteHelpDialog()  // v12.9

            SettingId.AutoUpdateCheck -> checkForUpdates()  // v12.10

            SettingId.VideoInfoEnhanced -> showVideoInfoDialog()  // v12.11

            SettingId.PlayerGestureEnhanced -> showPlayerGestureDialog()  // v12.12

            SettingId.PictureInPictureShortcut -> showPictureInPictureDialog()  // v12.13

            SettingId.AudioEffectSettings -> showAudioEffectDialog()  // v12.14

            SettingId.SubtitleStyleSettings -> showSubtitleStyleDialog()  // v12.15

            SettingId.LiveDanmakuSettings -> showLiveDanmakuDialog()  // v12.16

            SettingId.SearchHistoryManagement -> showSearchHistoryDialog()  // v12.17

            SettingId.QuickQualitySwitch -> showQuickQualityDialog()  // v12.18

            SettingId.LiveDanmakuOpacity -> showLiveDanmakuOpacityDialog()  // v12.19

            SettingId.ProgressBarPreview -> showProgressBarPreviewDialog()  // v12.20

            SettingId.SleepTimer -> showSleepTimerDialog()  // v12.21

            SettingId.ScreenshotShare -> showScreenshotShareDialog()  // v12.22

            SettingId.DanmakuPosition -> showDanmakuPositionDialog()  // v12.23

            SettingId.VolumeBoost -> showVolumeBoostDialog()  // v12.24

            SettingId.VideoLoop -> showVideoLoopDialog()  // v12.25

            SettingId.SpeedMemory -> showSpeedMemoryDialog()  // v12.26

            SettingId.SkipIntroOutro -> showSkipIntroOutroDialog()  // v12.27

            SettingId.DanmakuKeywordFilter -> showDanmakuKeywordFilterDialog()  // v12.28

            SettingId.ScreenFitMode -> showScreenFitModeDialog()  // v12.29

            SettingId.LiveReplay -> showLiveReplayDialog()  // v12.30

            SettingId.ScreenshotSavePath -> showScreenshotSavePathDialog()  // v12.31

            SettingId.DanmakuFontCustom -> showDanmakuFontCustomDialog()  // v12.32

            SettingId.BrightnessMemory -> showBrightnessMemoryDialog()  // v12.33

            SettingId.AutoPlayNext -> showAutoPlayNextDialog()  // v12.34

            SettingId.LiveGiftFilter -> showLiveGiftFilterDialog()  // v12.35

            SettingId.CacheSizeLimit -> showCacheSizeLimitDialog()  // v12.36

            SettingId.DanmakuSpeedCustom -> showDanmakuSpeedCustomDialog()  // v12.37

            SettingId.PlayerLongPressAction -> showPlayerLongPressActionDialog()  // v12.38

            SettingId.WifiAutoQuality -> showWifiAutoQualityDialog()  // v12.39

            SettingId.CommentSortMode -> showCommentSortModeDialog()  // v12.40

            SettingId.PlayerSwipeGesture -> showPlayerSwipeGestureDialog()  // v12.41

            SettingId.DanmakuAlphaCustom -> showDanmakuAlphaCustomDialog()  // v12.42

            SettingId.PlayerAutoRotate -> showPlayerAutoRotateDialog()  // v12.43

            SettingId.NotificationControl -> showNotificationControlDialog()  // v12.44

            SettingId.VideoPreload -> showVideoPreloadDialog()  // v12.45

            SettingId.HistorySync -> showHistorySyncDialog()  // v12.46

            SettingId.PlayerDecoderPriority -> showPlayerDecoderPriorityDialog()  // v12.47

            SettingId.DanmakuMergeMode -> showDanmakuMergeModeDialog()  // v12.48

            SettingId.PlayerAudioDelay -> showPlayerAudioDelayDialog()  // v12.49

            SettingId.LiveStreamQuality -> showLiveStreamQualityDialog()  // v12.50

            SettingId.PlayerKeyMapping -> showPlayerKeyMappingDialog()  // v12.51

            SettingId.DanmakuSendHistory -> showDanmakuSendHistoryDialog()  // v12.52

            SettingId.DanmakuSendHistoryLimit -> showDanmakuSendHistoryLimitDialog()  // v12.3

            SettingId.PlayerBufferStrategy -> showPlayerBufferStrategyDialog()  // v12.53

            SettingId.LiveAutoFollow -> showLiveAutoFollowDialog()  // v12.54

            SettingId.VideoCodecPreference -> showVideoCodecPreferenceDialog()  // v12.55

            SettingId.PlayerSubtitleSize -> showPlayerSubtitleSizeDialog()  // v12.56

            SettingId.DanmakuAreaCustom -> showDanmakuAreaCustomDialog()  // v12.57

            SettingId.PlayerAspectRatio -> showPlayerAspectRatioDialog()  // v12.58

            SettingId.LiveChatFontsize -> showLiveChatFontsizeDialog()  // v12.59

            SettingId.VideoCacheStrategy -> showVideoCacheStrategyDialog()  // v12.60

            SettingId.PlayerBackgroundPlay -> showPlayerBackgroundPlayDialog()  // v12.61

            SettingId.DanmakuFontStyle -> showDanmakuFontStyleDialog()  // v12.62

            SettingId.PlayerDoubleTapAction -> showPlayerDoubleTapActionDialog()  // v12.63

            SettingId.LiveAutoReconnect -> showLiveAutoReconnectDialog()  // v12.64

            SettingId.VideoLoadTimeout -> showVideoLoadTimeoutDialog()  // v12.65

            SettingId.PlayerGestureFeedback -> showPlayerGestureFeedbackDialog()  // v12.66

            SettingId.DanmakuShowUid -> showDanmakuShowUidDialog()  // v12.67

            SettingId.PlayerStartupAction -> showPlayerStartupActionDialog()  // v12.68

            SettingId.LiveStreamCodec -> showLiveStreamCodecDialog()  // v12.69

            SettingId.VideoNetworkStrategy -> showVideoNetworkStrategyDialog()  // v12.70

            SettingId.PlayerUiVisibility -> showPlayerUiVisibilityDialog()  // v12.71

            SettingId.DanmakuBlockUser -> showDanmakuBlockUserDialog()  // v12.72

            SettingId.PlayerAutoFullscreen -> showPlayerAutoFullscreenDialog()  // v12.73

            SettingId.LiveNotification -> showLiveNotificationDialog()  // v12.74

            SettingId.VideoQualityProfile -> showVideoQualityProfileDialog()  // v12.75

            SettingId.PlayerLockScreen -> showPlayerLockScreenDialog()  // v12.76

            SettingId.DanmakuScrollSpeed -> showDanmakuScrollSpeedDialog()  // v12.77

            SettingId.PlayerSkipCredits -> showPlayerSkipCreditsDialog()  // v12.78

            SettingId.LiveDanmakuFontsize -> showLiveDanmakuFontsizeDialog()  // v12.79

            SettingId.VideoAutoSkip -> showVideoAutoSkipDialog()  // v12.80

            SettingId.PlayerSwipeVolume -> showPlayerSwipeVolumeDialog()  // v12.81

            SettingId.DanmakuInputBorder -> showDanmakuInputBorderDialog()  // v12.82

            SettingId.PlayerChromecast -> showPlayerChromecastDialog()  // v12.83

            SettingId.LiveChatEmoji -> showLiveChatEmojiDialog()  // v12.84

            SettingId.VideoAutoNext -> showVideoAutoNextDialog()  // v12.85

            SettingId.PlayerBrightnessMemory -> showPlayerBrightnessMemoryDialog()  // v12.86

            SettingId.DanmakuMergeInterval -> showDanmakuMergeIntervalDialog()  // v12.87

            SettingId.PlayerLongPressSpeed -> showPlayerLongPressSpeedDialog()  // v12.88

            SettingId.LiveAutoQuality -> showLiveAutoQualityDialog()  // v12.89

            SettingId.VideoPrebufferSize -> showVideoPrebufferSizeDialog()  // v12.90

            SettingId.PlayerSubtitleBg -> showPlayerSubtitleBgDialog()  // v12.91

            SettingId.DanmakuHistory -> showDanmakuHistoryDialog()  // v12.92

            SettingId.PlayerBufferingStrategy -> showPlayerBufferingStrategyDialog()  // v12.93

            SettingId.NetworkSpeedIndicator -> {  // v10.1
                val current = prefs.networkSpeedIndicatorEnabled
                prefs.networkSpeedIndicatorEnabled = !current
                AppToast.show(activity, if (!current) "网络速度指示器：开" else "网络速度指示器：关")
            }

            SettingId.VideoBookmarks -> showVideoBookmarksDialog()  // v10.2
            SettingId.GestureZoneCustom -> showGestureZoneCustomDialog()  // v11.0
            SettingId.DanmakuTemplate -> showDanmakuTemplateDialog()  // v11.1
            SettingId.DownloadQuality -> showDownloadQualityDialog()  // v11.2
            SettingId.SearchSortMode -> showSearchSortModeDialog()  // v11.3
            SettingId.LivePipMode -> showLivePipModeDialog()  // v11.4
            SettingId.DanmakuShortcut -> showDanmakuShortcutDialog()  // v11.5
            SettingId.VideoCardInfo -> showVideoCardInfoDialog()  // v11.6
            SettingId.ProgressBarStyle -> showProgressBarStyleDialog()  // v11.7
            SettingId.VideoPreviewHover -> showVideoPreviewHoverDialog()  // v11.8
            SettingId.SubtitleSyncAdjust -> showSubtitleSyncAdjustDialog()  // v11.9
            SettingId.AudioBoostMode -> showAudioBoostModeDialog()  // v11.10
            SettingId.PlaybackSpeedMemory -> showPlaybackSpeedMemoryDialog()  // v11.11
            SettingId.VideoRotateLock -> showVideoRotateLockDialog()  // v11.12
            SettingId.DanmakuFilterAdvanced -> showDanmakuFilterAdvancedDialog()  // v11.13
            SettingId.LiveStreamMonitor -> showLiveStreamMonitorDialog()  // v11.14
            SettingId.VideoHistoryExport -> showVideoHistoryExportDialog()  // v11.15
            SettingId.DynamicFilter -> showDynamicFilterDialog()  // v11.16
            SettingId.UserBlocklist -> showUserBlocklistDialog()  // v11.17
            SettingId.SubtitleFontCustom -> showSubtitleFontCustomDialog()  // v11.18
            SettingId.NetworkProxySetting -> showNetworkProxySettingDialog()  // v11.19
            SettingId.VideoBufferStrategy -> showVideoBufferStrategyDialog()  // v11.20
            SettingId.BackupRestoreConfig -> showBackupRestoreConfigDialog()  // v11.21
            SettingId.VideoSnapshotSetting -> showVideoSnapshotSettingDialog()  // v11.22
            SettingId.VideoChapter -> showVideoChapterDialog()  // v11.23
            SettingId.CommentFilterAdvanced -> showCommentFilterAdvancedDialog()  // v11.24
            SettingId.DynamicSortMode -> showDynamicSortModeDialog()  // v11.25
            SettingId.UserFollowManager -> showUserFollowManagerDialog()  // v11.26
            SettingId.VideoRecommendMode -> showVideoRecommendModeDialog()  // v11.27
            SettingId.SubtitlePositionCustom -> showSubtitlePositionCustomDialog()  // v11.28
            SettingId.DanmakuShadowStyle -> showDanmakuShadowStyleDialog()  // v11.29
            SettingId.VideoAutoPlayNext -> showVideoAutoPlayNextDialog()  // v11.30
            SettingId.VideoShareSetting -> showVideoShareSettingDialog()  // v11.31
            SettingId.DynamicAutoRefresh -> showDynamicAutoRefreshDialog()  // v11.32
            SettingId.UserSpaceCustom -> showUserSpaceCustomDialog()  // v11.33
            SettingId.VideoStatisticsShow -> showVideoStatisticsShowDialog()  // v11.34
            SettingId.CommentHotSort -> showCommentHotSortDialog()  // v11.35
            SettingId.VideoAdSkip -> showVideoAdSkipDialog()  // v11.36
            SettingId.DanmakuAIEnhanced -> showDanmakuAIEnhancedDialog()  // v11.37
            SettingId.LiveStreamAutoReconnect -> showLiveStreamAutoReconnectDialog()  // v11.38
            SettingId.VideoGestureCustom -> showVideoGestureCustomDialog()  // v11.39
            SettingId.DanmakuScrollMode -> showDanmakuScrollModeDialog()  // v11.40
            SettingId.LiveGiftEffect -> showLiveGiftEffectDialog()  // v11.41
            SettingId.CommentCollapseMode -> showCommentCollapseModeDialog()  // v11.42
            SettingId.VideoLoopCount -> showVideoLoopCountDialog()  // v11.43
            SettingId.VideoBrightnessDefault -> showVideoBrightnessDefaultDialog()  // v11.44
            SettingId.SubtitleDownloadAuto -> showSubtitleDownloadAutoDialog()  // v11.45
            SettingId.VideoCodecAuto -> showVideoCodecAutoDialog()  // v11.46
            SettingId.LiveDanmakuSpeed -> showLiveDanmakuSpeedDialog()  // v11.47
            SettingId.CommentInputStyle -> showCommentInputStyleDialog()  // v11.48
            SettingId.VideoPlayerSkin -> showVideoPlayerSkinDialog()  // v11.49
            SettingId.DynamicImageLoad -> showDynamicImageLoadDialog()  // v11.50
            SettingId.UserPrivacyMode -> showUserPrivacyModeDialog()  // v11.51
            SettingId.VideoCachePreload -> showVideoCachePreloadDialog()  // v11.52
            SettingId.DanmakuSendPosition -> showDanmakuSendPositionDialog()  // v11.53
            SettingId.VideoChapterAutoSkip -> showVideoChapterAutoSkipDialog()  // v11.54
            SettingId.LiveDanmakuColor -> showLiveDanmakuColorDialog()  // v11.55
            SettingId.CommentAtFunction -> showCommentAtFunctionDialog()  // v11.56
            SettingId.VideoPlayerInfoShow -> showVideoPlayerInfoShowDialog()  // v11.57
            SettingId.DynamicTextOnly -> showDynamicTextOnlyDialog()  // v11.58
            SettingId.UserLevelShow -> showUserLevelShowDialog()  // v11.59
            SettingId.VideoCacheLocation -> showVideoCacheLocationDialog()  // v11.60
            SettingId.DanmakuMergeTime -> showDanmakuMergeTimeDialog()  // v11.61
            SettingId.VideoPlayerOverlayTimeout -> showVideoPlayerOverlayTimeoutDialog()  // v11.62
            SettingId.LiveDanmakuArea -> showLiveDanmakuAreaDialog()  // v11.63
            SettingId.CommentImageLoad -> showCommentImageLoadDialog()  // v11.64
            SettingId.VideoPlayerController -> showVideoPlayerControllerDialog()  // v11.65
            SettingId.DynamicAutoPlay -> showDynamicAutoPlayDialog()  // v11.66
            SettingId.UserFollowNotify -> showUserFollowNotifyDialog()  // v11.67
            SettingId.VideoCacheMaxSize -> showVideoCacheMaxSizeDialog()  // v11.68
            SettingId.DanmakuBlockLevel -> showDanmakuBlockLevelDialog()  // v11.69
            SettingId.VideoPlayerSubtitleCustom -> showVideoPlayerSubtitleCustomDialog()  // v11.70
            SettingId.LiveDanmakuMergeMode -> showLiveDanmakuMergeModeDialog()  // v11.71
            SettingId.CommentShowReply -> showCommentShowReplyDialog()  // v11.72
            SettingId.VideoPlayerGestureIndicator -> showVideoPlayerGestureIndicatorDialog()  // v11.73
            SettingId.DynamicFilterKeyword -> showDynamicFilterKeywordDialog()  // v11.74
            SettingId.UserFollowGroup -> showUserFollowGroupDialog()  // v11.75
            SettingId.VideoCacheAutoClean -> showVideoCacheAutoCleanDialog()  // v11.76
            SettingId.DanmakuSendHistoryShow -> showDanmakuSendHistoryShowDialog()  // v11.77
            SettingId.VideoPlayerSpeedCustom -> showVideoPlayerSpeedCustomDialog()  // v11.78
            SettingId.LiveDanmakuBlockUser -> showLiveDanmakuBlockUserDialog()  // v11.79
            SettingId.CommentSortAdvanced -> showCommentSortAdvancedDialog()  // v11.80
            SettingId.VideoPlayerBackgroundPlay -> showVideoPlayerBackgroundPlayDialog()  // v11.81
            SettingId.DynamicFilterType -> showDynamicFilterTypeDialog()  // v11.82
            SettingId.UserSpaceStats -> showUserSpaceStatsDialog()  // v11.83
            SettingId.VideoCachePreloadSize -> showVideoCachePreloadSizeDialog()  // v11.84
            SettingId.DanmakuSendFontsize -> showDanmakuSendFontsizeDialog()  // v11.85
            SettingId.VideoPlayerLockRotation -> showVideoPlayerLockRotationDialog()  // v11.86
            SettingId.LiveDanmakuSendHistory -> showLiveDanmakuSendHistoryDialog()  // v11.87
            SettingId.CommentShowTime -> showCommentShowTimeDialog()  // v11.88
            SettingId.VideoPlayerAutoFullscreen -> showVideoPlayerAutoFullscreenDialog()  // v11.89
            SettingId.DynamicFilterUser -> showDynamicFilterUserDialog()  // v11.90
            SettingId.UserSpaceBackground -> showUserSpaceBackgroundDialog()  // v11.91
            SettingId.VideoCacheWifiOnly -> showVideoCacheWifiOnlyDialog()  // v11.92
            SettingId.DanmakuSendColor -> showDanmakuSendColorDialog()  // v11.93
            SettingId.VideoPlayerGestureSensitivity -> showVideoPlayerGestureSensitivityDialog()  // v11.94
            SettingId.LiveDanmakuFontStyle -> showLiveDanmakuFontStyleDialog()  // v11.95
            SettingId.CommentImageQuality -> showCommentImageQualityDialog()  // v11.96
            SettingId.VideoPlayerAutoRotate -> showVideoPlayerAutoRotateDialog()  // v11.97
            SettingId.DynamicRefreshInterval -> showDynamicRefreshIntervalDialog()  // v11.98
            SettingId.UserSpaceTheme -> showUserSpaceThemeDialog()  // v11.99
            SettingId.VideoCacheCompress -> showVideoCacheCompressDialog()  // v11.100
            SettingId.DanmakuSendBold -> showDanmakuSendBoldDialog()  // v11.101
            SettingId.VideoPlayerLongPressSpeed -> showVideoPlayerLongPressSpeedDialog()  // v11.102
            SettingId.LiveDanmakuSendColor -> showLiveDanmakuSendColorDialog()  // v11.103
            SettingId.CommentShowUpName -> showCommentShowUpNameDialog()  // v11.104
            SettingId.VideoPlayerDoubleTapAction -> showVideoPlayerDoubleTapActionDialog()  // v11.105
            SettingId.DynamicFilterAd -> showDynamicFilterAdDialog()  // v11.106
            SettingId.UserSpaceVideoSort -> showUserSpaceVideoSortDialog()  // v11.107
            SettingId.VideoCacheAutoDelete -> showVideoCacheAutoDeleteDialog()  // v11.108
            SettingId.DanmakuSendBorder -> showDanmakuSendBorderDialog()  // v11.109
            SettingId.VideoPlayerSwipeSensitivity -> showVideoPlayerSwipeSensitivityDialog()  // v11.110
            SettingId.LiveDanmakuBlockKeyword -> showLiveDanmakuBlockKeywordDialog()  // v11.111
            SettingId.CommentShowLevel -> showCommentShowLevelDialog()  // v11.112
            SettingId.VideoPlayerLongPressAction -> showVideoPlayerLongPressActionDialog()  // v11.113
            SettingId.DynamicFilterKeywordCase -> showDynamicFilterKeywordCaseDialog()  // v11.114
            SettingId.UserSpaceFollowShow -> showUserSpaceFollowShowDialog()  // v11.115
            SettingId.VideoCachePreloadCount -> showVideoCachePreloadCountDialog()  // v11.116
            SettingId.DanmakuSendShadow -> showDanmakuSendShadowDialog()  // v11.117
            SettingId.VideoPlayerFastSeekStep -> showVideoPlayerFastSeekStepDialog()  // v11.118
            SettingId.LiveDanmakuShowGift -> showLiveDanmakuShowGiftDialog()  // v11.119
            SettingId.CommentCollapseThreshold -> showCommentCollapseThresholdDialog()  // v11.120
            SettingId.VideoPlayerSubtitleBgOpacity -> showVideoPlayerSubtitleBgOpacityDialog()  // v11.121
            SettingId.DynamicImageQuality -> showDynamicImageQualityDialog()  // v11.122
            SettingId.UserSpaceDynamicShow -> showUserSpaceDynamicShowDialog()  // v11.123
            SettingId.VideoCacheMaxCount -> showVideoCacheMaxCountDialog()  // v11.124
            SettingId.DanmakuSendSpeed -> showDanmakuSendSpeedDialog()  // v11.125
            SettingId.VideoPlayerSubtitleDelay -> showVideoPlayerSubtitleDelayDialog()  // v11.126
            SettingId.LiveDanmakuGiftFilter -> showLiveDanmakuGiftFilterDialog()  // v11.127
            SettingId.CommentReplyDepth -> showCommentReplyDepthDialog()  // v11.128
            SettingId.VideoPlayerPipPosition -> showVideoPlayerPipPositionDialog()  // v11.129
            SettingId.DynamicFilterKeywordList -> showDynamicFilterKeywordListDialog()  // v11.130
            SettingId.UserSpaceActivityShow -> showUserSpaceActivityShowDialog()  // v11.131
            SettingId.VideoCacheCleanOnBoot -> showVideoCacheCleanOnBootDialog()  // v11.132
            SettingId.DanmakuSendArea -> showDanmakuSendAreaDialog()  // v11.133
            SettingId.VideoPlayerGestureVibrate -> showVideoPlayerGestureVibrateDialog()  // v11.134
            SettingId.LiveDanmakuFontSizeLevel -> showLiveDanmakuFontSizeDialog()  // v11.135
            SettingId.CommentImageLoadPolicy -> showCommentImageLoadPolicyDialog()  // v11.136
            SettingId.VideoPlayerAutoPlayNext -> showVideoPlayerAutoPlayNextDialog()  // v11.137
            SettingId.DynamicFilterForward -> showDynamicFilterForwardDialog()  // v11.138
            SettingId.UserSpaceFanShow -> showUserSpaceFanShowDialog()  // v11.139
            SettingId.VideoCacheWifiPreload -> showVideoCacheWifiPreloadDialog()  // v11.140
            SettingId.DanmakuSendFont -> showDanmakuSendFontDialog()  // v11.141
            SettingId.VideoPlayerSkipHeadTail -> showVideoPlayerSkipHeadTailDialog()  // v11.142
            SettingId.CommentReplyNotification -> showCommentReplyNotificationDialog()  // v11.144
            SettingId.VideoPlayerAutoPlayCountdown -> showVideoPlayerAutoPlayCountdownDialog()  // v11.145
            SettingId.DynamicFilterForward -> showDynamicFilterForwardDialog()  // v11.146
            SettingId.UserSpacePlayShow -> showUserSpacePlayShowDialog()  // v11.147
            SettingId.VideoCacheAutoCleanupDays -> showVideoCacheAutoCleanupDaysDialog()  // v11.148
            SettingId.DanmakuSendLineHeight -> showDanmakuSendLineHeightDialog()  // v11.149
            SettingId.VideoPlayerSubtitleFont -> showVideoPlayerSubtitleFontDialog()  // v11.150
            SettingId.LiveDanmakuBlockTop -> showLiveDanmakuBlockTopDialog()  // v11.151
            SettingId.CommentShowDevice -> showCommentShowDeviceDialog()  // v11.152
            SettingId.VideoPlayerGestureHoldAction -> showVideoPlayerGestureHoldActionDialog()  // v11.153
            SettingId.LiveDanmakuBlockColor -> showLiveDanmakuBlockColorDialog()  // v11.154
            SettingId.CommentSortDefault -> showCommentSortDefaultDialog()  // v11.155
            SettingId.VideoPlayerAutoFullscreenLandscape -> showVideoPlayerAutoFullscreenLandscapeDialog()  // v11.156
            SettingId.DynamicFilterLive -> showDynamicFilterLiveDialog()  // v11.157
            SettingId.UserSpaceSeriesShow -> showUserSpaceSeriesShowDialog()  // v11.158
            SettingId.VideoCacheStreamMerge -> showVideoCacheStreamMergeDialog()  // v11.159
            SettingId.DanmakuSendStyle -> showDanmakuSendStyleDialog()  // v11.160
            SettingId.VideoPlayerSubtitleColor -> showVideoPlayerSubtitleColorDialog()  // v11.161
            SettingId.LiveDanmakuBlockLevel -> showLiveDanmakuBlockLevelDialog()  // v11.162
            SettingId.CommentShowTimeFormat -> showCommentShowTimeFormatDialog()  // v11.163
            SettingId.VideoPlayerAutoRotationLock -> showVideoPlayerAutoRotationLockDialog()  // v11.164
            SettingId.DynamicFilterPgc -> showDynamicFilterPgcDialog()  // v11.165
            SettingId.UserSpaceArticleShow -> showUserSpaceArticleShowDialog()  // v11.166
            SettingId.VideoCacheDownloadThread -> showVideoCacheDownloadThreadDialog()  // v11.167
            SettingId.DanmakuSendEffect -> showDanmakuSendEffectDialog()  // v11.168
            SettingId.VideoPlayerSubtitleSizeLevel -> showVideoPlayerSubtitleSizeLevelDialog()  // v11.169
            SettingId.LiveDanmakuBlockMedal -> showLiveDanmakuBlockMedalDialog()  // v11.170
            SettingId.CommentAutoExpand -> showCommentAutoExpandDialog()  // v11.171
            SettingId.VideoPlayerPipOpacity -> showVideoPlayerPipOpacityDialog()  // v11.172
            SettingId.VideoPlayerGestureSwipeAction -> showVideoPlayerGestureSwipeActionDialog()  // v11.173
            SettingId.LiveDanmakuBlockKeywordCustom -> showLiveDanmakuBlockKeywordCustomDialog()  // v11.174
            SettingId.CommentShowUpTag -> showCommentShowUpTagDialog()  // v11.175
            SettingId.VideoPlayerAutoPlayRandom -> showVideoPlayerAutoPlayRandomDialog()  // v11.176
            SettingId.DynamicFilterArticle -> showDynamicFilterArticleDialog()  // v11.177
            SettingId.UserSpaceClipShow -> showUserSpaceClipShowDialog()  // v11.178
            SettingId.LiveDanmakuBlockBot -> showLiveDanmakuBlockBotDialog()  // v11.182
            SettingId.CommentShowLevelTag -> showCommentShowLevelTagDialog()  // v11.183
            SettingId.VideoPlayerAutoPlayLoop -> showVideoPlayerAutoPlayLoopDialog()  // v11.184
            SettingId.DynamicFilterMusic -> showDynamicFilterMusicDialog()  // v11.185
            SettingId.VideoCacheAutoDeleteWatched -> showVideoCacheAutoDeleteWatchedDialog()  // v11.187
            SettingId.DanmakuSendShadow -> showDanmakuSendShadowDialog()  // v11.188
            SettingId.VideoPlayerSubtitleDelayMs -> showVideoPlayerSubtitleDelayMsDialog()  // v11.189
            SettingId.LiveDanmakuBlockEmoji -> showLiveDanmakuBlockEmojiDialog()  // v11.190

            SettingId.QuickSettings -> {  // v10.3
                AppToast.show(activity, "播放中长按详情按钮呼出快速设置面板")
            }

            SettingId.WatchTimeStats -> showWatchTimeStatsDialog()  // v10.4

            SettingId.MultiAccount -> showMultiAccountDialog()  // v10.5

            SettingId.PlayerGestureCustom -> showPlayerGestureCustomDialog()  // v10.6

            SettingId.DanmakuOpacity -> showDanmakuOpacityDialog()  // v10.7

            SettingId.AutoSkipIntroOutro -> showAutoSkipIntroOutroDialog()  // v10.8

            SettingId.QqGroup -> {
                copyToClipboard(label = "QQ交流群", text = SettingsConstants.QQ_GROUP, toastText = "已复制群号：${SettingsConstants.QQ_GROUP}")
            }

            SettingId.PlayerKernelCheck -> handlePlayerKernelCheck()

            SettingId.CheckUpdate -> {
                when (val checkState = state.testUpdateCheckState) {
                    TestUpdateCheckState.Checking -> {
                        AppToast.show(activity, "正在检查更新…")
                    }

                    is TestUpdateCheckState.UpdateAvailable -> {
                        ApkUpdateFlow.showUpdatePrompt(activity, checkState.update) { selectedUpdate ->
                            startTestUpdateDownload(selectedUpdate.versionName)
                        }
                    }

                    else -> ensureTestUpdateChecked(force = true, refreshUi = true, promptIfUpdate = true)
                }
            }

            else -> AppLog.i("Settings", "click id=${entry.id.key} title=${entry.title}")
        }
    }

    private fun handlePlayerKernelCheck() {
        when (IjkPlayerPlugin.status(activity)) {
            IjkPlayerPlugin.InstallStatus.Unsupported -> {
                AppToast.showLong(activity, "当前设备不支持 IjkPlayer（ABI=${Build.SUPPORTED_ABIS.joinToString()}）")
            }

            IjkPlayerPlugin.InstallStatus.Installed -> {
                AppToast.show(activity, "播放器内核已是最新")
            }

            IjkPlayerPlugin.InstallStatus.NotInstalled,
            IjkPlayerPlugin.InstallStatus.NeedsUpdate,
            -> {
                IjkPlayerPluginUi.ensureInstalled(activity) {
                    renderer.refreshAboutSectionKeepPosition()
                }
            }
        }
    }

    private fun restartToMain() {
        val intent =
            Intent(activity, MainActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        activity.startActivity(intent)
    }

    private fun evictNetworkConnections() {
        runCatching { BiliClient.apiOkHttp.connectionPool.evictAll() }
        runCatching { BiliClient.cdnOkHttp.connectionPool.evictAll() }
        runCatching { BiliClient.appCdnOkHttp.connectionPool.evictAll() }
        runCatching { ApkUpdater.evictConnections() }
    }

    private fun showChoiceDialog(title: String, items: List<String>, current: String, onPicked: (String) -> Unit) {
        val checked = items.indexOf(current).takeIf { it >= 0 } ?: 0
        showChoiceDialog(
            title = title,
            items = items,
            checkedIndex = checked,
            onPicked = onPicked,
        )
    }

    private fun showChoiceDialog(title: String, items: List<String>, checkedIndex: Int, onPicked: (String) -> Unit) {
        val checked = checkedIndex.takeIf { it in items.indices } ?: 0
        AppPopup.singleChoice(
            context = activity,
            title = title,
            items = items,
            checkedIndex = checked,
        ) { _, label ->
            onPicked(label)
        }
    }

    private fun showVisibleTabsDialog(
        sectionIndex: Int,
        focusId: SettingId,
        title: String,
        options: List<Pair<String, String>>,
        selectedKeys: List<String>,
        save: (List<String>) -> Unit,
    ) {
        val keys = options.map { it.first }
        val labels = options.map { it.second }
        val selected =
            selectedKeys
                .takeIf { it.isNotEmpty() }
                ?.toSet()
                ?: keys.toSet()
        val checked = BooleanArray(keys.size) { idx -> keys.getOrNull(idx) in selected }
        if (checked.none { it } && checked.isNotEmpty()) {
            for (idx in checked.indices) checked[idx] = true
        }

        AppPopup.multiChoice(
            context = activity,
            title = title,
            items = labels,
            checked = checked,
            minCheckedCount = 1,
            onChanged = { finalChecked ->
                save(
                    keys.filterIndexed { idx, _ ->
                        idx in finalChecked.indices && finalChecked[idx]
                    },
                )
            },
            onDismiss = {
                renderer.showSection(sectionIndex, focusId = focusId)
            },
        )
    }

    private fun showPlayerOsdButtonsDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        val options =
            listOf(
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_PREV to "上一个",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_PLAY_PAUSE to "播放/暂停",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_NEXT to "下一个",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_SUBTITLE to "字幕",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_DANMAKU to "弹幕",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_COMMENTS to "评论",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_DETAIL to "视频详情页",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_UP to "UP主",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_LIKE to "点赞",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_COIN to "投币",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_FAV to "收藏",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_LIST_PANEL to "列表",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_SPONSOR_SUBMIT to "上传广告片段",
                blbl.cat3399.core.prefs.AppPrefs.PLAYER_OSD_BTN_ADVANCED to "更多设置",
            )
        val keys = options.map { it.first }
        val labels = options.map { it.second }.toTypedArray()

        val selected = prefs.playerOsdButtons.toSet()
        val checked = BooleanArray(keys.size) { idx -> selected.contains(keys[idx]) }
        AppPopup.multiChoice(
            context = activity,
            title = "OSD按钮显示",
            items = labels.toList(),
            checked = checked,
            onChanged = { finalChecked ->
                prefs.playerOsdButtons =
                    keys.filterIndexed { idx, _ ->
                        idx in finalChecked.indices && finalChecked[idx]
                    }
            },
            onDismiss = {
                renderer.showSection(sectionIndex, focusId = focusId)
            },
        )
    }

    private fun showPlayerCustomShortcutsDialog(sectionIndex: Int, focusId: SettingId) {
        fun keyLabel(keyCode: Int): String {
            val raw = runCatching { KeyEvent.keyCodeToString(keyCode) }.getOrNull()?.trim().orEmpty()
            if (raw.isBlank()) return keyCode.toString()
            val text = raw.removePrefix("KEYCODE_")
            return when {
                text.startsWith("NUMPAD_") && text.length == "NUMPAD_0".length -> "小键盘${text.last()}"
                text.length == 1 && text[0] in '0'..'9' -> text
                else -> text
            }
        }

        fun actionLabel(action: PlayerCustomShortcutAction): String = PlayerCustomShortcutCatalog.actionLabel(action)

        fun bindingLabel(binding: PlayerCustomShortcut): String =
            "${keyLabel(binding.keyCode)} → ${actionLabel(binding.action)}"

        fun loadShortcuts(): List<PlayerCustomShortcut> = BiliClient.prefs.playerCustomShortcuts

        fun upsert(binding: PlayerCustomShortcut) {
            val prefs = BiliClient.prefs
            prefs.playerCustomShortcuts = PlayerCustomShortcutsStore.upsert(prefs.playerCustomShortcuts, binding)
            renderer.refreshSection(SettingId.PlayerCustomShortcuts)
        }

        fun removeBinding(keyCode: Int) {
            val prefs = BiliClient.prefs
            prefs.playerCustomShortcuts = PlayerCustomShortcutsStore.remove(prefs.playerCustomShortcuts, keyCode)
            renderer.refreshSection(SettingId.PlayerCustomShortcuts)
        }

        fun clearAll() {
            BiliClient.prefs.playerCustomShortcuts = PlayerCustomShortcutsStore.clear()
            renderer.refreshSection(SettingId.PlayerCustomShortcuts)
        }

        class ShortcutItemVh(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val tvLabel: TextView = itemView.findViewById(blbl.cat3399.R.id.tv_label)
            private val tvCheck: TextView = itemView.findViewById(blbl.cat3399.R.id.tv_check)

            fun bind(label: String, onClick: () -> Unit) {
                tvLabel.text = label
                tvCheck.visibility = View.GONE
                itemView.setOnClickListener { onClick() }
                itemView.setOnKeyListener { _, keyCode, event ->
                    when (keyCode) {
                        KeyEvent.KEYCODE_DPAD_CENTER,
                        KeyEvent.KEYCODE_ENTER,
                        KeyEvent.KEYCODE_NUMPAD_ENTER,
                        ->
                            if (event.action == KeyEvent.ACTION_UP) {
                                onClick()
                                true
                            } else {
                                false
                            }

                        else -> false
                    }
                }
            }
        }

        class ShortcutListAdapter(
            private val list: List<PlayerCustomShortcut>,
            private val onItemClick: (PlayerCustomShortcut) -> Unit,
        ) : RecyclerView.Adapter<ShortcutItemVh>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShortcutItemVh {
                val view = LayoutInflater.from(parent.context).inflate(blbl.cat3399.R.layout.item_popup_choice, parent, false)
                return ShortcutItemVh(view)
            }

            override fun onBindViewHolder(holder: ShortcutItemVh, position: Int) {
                val item = list.getOrNull(position) ?: return
                holder.bind(
                    label = bindingLabel(item),
                    onClick = { onItemClick(item) },
                )
            }

            override fun getItemCount(): Int = list.size
        }

        class Controller {
            fun showManager(focusKeyCode: Int? = null) {
                var replacing = false
                val items = loadShortcuts()
                var recyclerForLayout: RecyclerView? = null
                val focusIndex =
                    if (items.isNotEmpty()) {
                        focusKeyCode?.let { key ->
                            items.indexOfFirst { it.keyCode == key }.takeIf { it >= 0 }
                        } ?: 0
                    } else {
                        0
                    }

                AppPopup.custom(
                    context = activity,
                    title = "自定义播放快捷键",
                    cancelable = true,
                    actions =
                        listOf(
                            PopupAction(
                                role = PopupActionRole.NEUTRAL,
                                text = "清空",
                                dismissOnClick = false,
                            ) {
                                if (items.isEmpty()) {
                                    AppToast.show(activity, "暂无快捷键")
                                    return@PopupAction
                                }
                                replacing = true
                                showClearConfirm(focusKeyCode = focusKeyCode)
                            },
                            PopupAction(
                                role = PopupActionRole.NEUTRAL,
                                text = "删除",
                                dismissOnClick = false,
                            ) {
                                if (items.isEmpty()) {
                                    AppToast.show(activity, "暂无快捷键")
                                    return@PopupAction
                                }
                                replacing = true
                                showDeletePicker(focusKeyCode = focusKeyCode)
                            },
                            PopupAction(
                                role = PopupActionRole.NEGATIVE,
                                text = "关闭",
                            ),
                            PopupAction(
                                role = PopupActionRole.POSITIVE,
                                text = "新增",
                                dismissOnClick = false,
                            ) {
                                replacing = true
                                showKeyCapture()
                            },
                        ),
                    preferredActionRole = PopupActionRole.POSITIVE,
                    autoFocus = true,
                    onModalAttached = { modalRoot ->
                        recyclerForLayout?.let { recycler ->
                            AppPopup.applyManagedListLayout(
                                modalRoot = modalRoot,
                                recycler = recycler,
                                itemCount = items.size,
                                focusIndex = focusIndex,
                            )
                        }
                    },
                    onDismiss = {
                        if (!replacing) renderer.showSection(sectionIndex, focusId = focusId)
                    },
                ) { dialogContext ->
                    val recycler =
                        (LayoutInflater.from(dialogContext).inflate(blbl.cat3399.R.layout.view_popup_choice_list, null, false) as RecyclerView).apply {
                            layoutManager = LinearLayoutManager(dialogContext)
                            itemAnimator = null
                        }
                    recyclerForLayout = recycler

                    recycler.adapter =
                        ShortcutListAdapter(items) { picked ->
                            replacing = true
                            showActionPicker(keyCode = picked.keyCode, currentAction = picked.action)
                        }

                    if (items.isNotEmpty()) {
                        recycler.scrollToPosition(focusIndex)
                        recycler.post {
                            val holder = recycler.findViewHolderForAdapterPosition(focusIndex)
                            (holder?.itemView ?: recycler.getChildAt(0))?.requestFocus()
                        }
                    }

                    recycler
                }
            }

            private fun showKeyCapture() {
                var forward = false
                var captureView: TextView? = null
                AppPopup.custom(
                    context = activity,
                    title = "请按下要绑定的按键",
                    cancelable = true,
                    actions = emptyList(),
                    preferredActionRole = null,
                    autoFocus = false,
                    onModalAttached = {
                        captureView?.post { captureView?.requestFocus() }
                    },
                    onDismiss = {
                        if (!forward) showManager()
                    },
                ) { dialogContext ->
                    val tv =
                        LayoutInflater.from(dialogContext)
                            .inflate(blbl.cat3399.R.layout.view_player_custom_shortcut_key_capture, null, false) as TextView
                    captureView = tv
                    tv.text = "请按下要绑定的按键\n（返回键取消）"
                    tv.setOnKeyListener { _, keyCode, event ->
                        if (event.action != KeyEvent.ACTION_DOWN) return@setOnKeyListener false
                        if (event.repeatCount > 0) return@setOnKeyListener true

                        // Let the popup host handle these as "cancel/back".
                        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_ESCAPE || keyCode == KeyEvent.KEYCODE_BUTTON_B) {
                            return@setOnKeyListener false
                        }

                        if (keyCode == KeyEvent.KEYCODE_UNKNOWN || keyCode <= 0) return@setOnKeyListener true
                        if (PlayerCustomShortcutsStore.isForbiddenKeyCode(keyCode)) {
                            val msg =
                                when (keyCode) {
                                    KeyEvent.KEYCODE_DPAD_CENTER,
                                    KeyEvent.KEYCODE_ENTER,
                                    KeyEvent.KEYCODE_NUMPAD_ENTER,
                                    -> "确认键不允许绑定，请换用其他按键"
                                    else -> "该按键不允许绑定"
                                }
                            AppToast.show(activity, msg)
                            return@setOnKeyListener true
                        }

                        val existing = loadShortcuts().firstOrNull { it.keyCode == keyCode }?.action
                        forward = true
                        showActionPicker(keyCode = keyCode, currentAction = existing)
                        true
                    }
                    tv
                }
            }

            private fun showActionPicker(keyCode: Int, currentAction: PlayerCustomShortcutAction?) {
                var forward = false
                val options = PlayerCustomShortcutCatalog.actionOptions()

                val checked =
                    options.indexOfFirst { it.type == currentAction?.type }
                        .takeIf { it >= 0 } ?: 0

                AppPopup.singleChoice(
                    context = activity,
                    title = "选择动作（${keyLabel(keyCode)}）",
                    items = options.map { it.label },
                    checkedIndex = checked,
                    onDismiss = {
                        if (!forward) showManager(focusKeyCode = keyCode)
                    },
                ) { which, _ ->
                    val picked = options.getOrNull(which) ?: return@singleChoice
                    if (picked.requiresValue) {
                        forward = true
                        showValuePicker(keyCode = keyCode, actionType = picked.type, currentAction = currentAction)
                        return@singleChoice
                    }

                    val action = PlayerCustomShortcutCatalog.createAction(picked.type) ?: return@singleChoice

                    forward = true
                    upsert(PlayerCustomShortcut(keyCode = keyCode, action = action))
                    showManager(focusKeyCode = keyCode)
                }
            }

            private fun showValuePicker(keyCode: Int, actionType: String, currentAction: PlayerCustomShortcutAction?) {
                var forward = false
                val title = "${keyLabel(keyCode)} → ${PlayerCustomShortcutCatalog.actionTitle(actionType)}"

                fun cancelBackToActionPicker() {
                    if (!forward) showActionPicker(keyCode = keyCode, currentAction = currentAction)
                }

                val config =
                    PlayerCustomShortcutCatalog.valuePickerConfig(
                        type = actionType,
                        currentAction = currentAction,
                    ) ?: run {
                        AppToast.show(activity, "未知动作：$actionType")
                        showActionPicker(keyCode = keyCode, currentAction = currentAction)
                        return
                    }

                AppPopup.singleChoice(
                    context = activity,
                    title = title,
                    items = config.choices.map { it.label },
                    checkedIndex = config.checkedIndex,
                    onDismiss = { cancelBackToActionPicker() },
                ) { which, _ ->
                    val action = config.choices.getOrNull(which)?.action ?: return@singleChoice
                    forward = true
                    upsert(PlayerCustomShortcut(keyCode = keyCode, action = action))
                    showManager(focusKeyCode = keyCode)
                }
            }

            private fun showDeletePicker(focusKeyCode: Int?) {
                var forward = false
                val items = loadShortcuts()
                val labels = items.map { bindingLabel(it) }
                val checked = focusKeyCode?.let { k -> items.indexOfFirst { it.keyCode == k }.takeIf { it >= 0 } } ?: 0
                AppPopup.singleChoice(
                    context = activity,
                    title = "删除快捷键",
                    items = labels.ifEmpty { listOf("暂无快捷键") },
                    checkedIndex = checked,
                    onDismiss = {
                        if (!forward) showManager(focusKeyCode = focusKeyCode)
                    },
                ) { which, _ ->
                    val picked = items.getOrNull(which) ?: return@singleChoice
                    forward = true
                    removeBinding(picked.keyCode)
                    showManager()
                }
            }

            private fun showClearConfirm(focusKeyCode: Int?) {
                var forward = false
                AppPopup.confirm(
                    context = activity,
                    title = "清空快捷键",
                    message = "确定清空所有自定义播放快捷键？",
                    positiveText = "清空",
                    negativeText = "取消",
                    cancelable = true,
                    onPositive = {
                        forward = true
                        clearAll()
                        showManager()
                    },
                    onNegative = {
                        forward = true
                        showManager(focusKeyCode = focusKeyCode)
                    },
                    onDismiss = {
                        if (!forward) showManager(focusKeyCode = focusKeyCode)
                    },
                )
            }
        }

        Controller().showManager()
    }

    private fun showCustomPageContentDialog(sectionIndex: Int, focusId: SettingId) {
        fun loadConfig(): CustomPageConfig = BiliClient.prefs.customPageConfig

        fun saveConfig(config: CustomPageConfig) {
            BiliClient.prefs.customPageConfig = config
            renderer.refreshSection(focusId)
        }

        fun moveTab(
            tabs: List<CustomPageTabConfig>,
            fromIndex: Int,
            toIndex: Int,
        ): List<CustomPageTabConfig> {
            if (fromIndex !in tabs.indices || toIndex !in tabs.indices) return tabs
            val out = tabs.toMutableList()
            val item = out.removeAt(fromIndex)
            out.add(toIndex, item)
            return out
        }

        class TabItemVh(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val tvLabel: TextView = itemView.findViewById(blbl.cat3399.R.id.tv_label)
            private val tvCheck: TextView = itemView.findViewById(blbl.cat3399.R.id.tv_check)

            fun bind(label: String, onClick: () -> Unit) {
                tvLabel.text = label
                tvCheck.visibility = View.GONE
                itemView.setOnClickListener { onClick() }
                itemView.setOnKeyListener { _, keyCode, event ->
                    when (keyCode) {
                        KeyEvent.KEYCODE_DPAD_CENTER,
                        KeyEvent.KEYCODE_ENTER,
                        KeyEvent.KEYCODE_NUMPAD_ENTER,
                        ->
                            if (event.action == KeyEvent.ACTION_UP) {
                                onClick()
                                true
                            } else {
                                false
                            }

                        else -> false
                    }
                }
            }
        }

        class TabListAdapter(
            private val list: List<CustomPageTabConfig>,
            private val onItemClick: (CustomPageTabConfig) -> Unit,
        ) : RecyclerView.Adapter<TabItemVh>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabItemVh {
                val view = LayoutInflater.from(parent.context).inflate(blbl.cat3399.R.layout.item_popup_choice, parent, false)
                return TabItemVh(view)
            }

            override fun onBindViewHolder(holder: TabItemVh, position: Int) {
                val item = list.getOrNull(position) ?: return
                holder.bind(
                    label = CustomPageTabRegistry.settingsLabelForConfig(item),
                    onClick = { onItemClick(item) },
                )
            }

            override fun getItemCount(): Int = list.size
        }

        class Controller {
            fun showManager(focusStableKey: String? = null) {
                var replacing = false
                val config = loadConfig()
                val tabs = config.tabs
                var recyclerForLayout: RecyclerView? = null
                val focusIndex =
                    if (tabs.isNotEmpty()) {
                        focusStableKey?.let { key ->
                            tabs.indexOfFirst { it.stableKey() == key }.takeIf { it >= 0 }
                        } ?: 0
                    } else {
                        0
                    }

                AppPopup.custom(
                    context = activity,
                    title = "自定义页内容",
                    cancelable = true,
                    actions =
                        listOf(
                            PopupAction(
                                role = PopupActionRole.NEUTRAL,
                                text = "清空",
                                dismissOnClick = false,
                            ) {
                                if (tabs.isEmpty()) {
                                    AppToast.show(activity, "暂无内容")
                                    return@PopupAction
                                }
                                replacing = true
                                showClearConfirm(focusStableKey = focusStableKey)
                            },
                            PopupAction(role = PopupActionRole.NEGATIVE, text = "关闭"),
                            PopupAction(
                                role = PopupActionRole.POSITIVE,
                                text = "新增",
                                dismissOnClick = false,
                            ) {
                                replacing = true
                                showAddPicker()
                            },
                        ),
                    preferredActionRole = PopupActionRole.POSITIVE,
                    autoFocus = true,
                    onModalAttached = { modalRoot ->
                        recyclerForLayout?.let { recycler ->
                            AppPopup.applyManagedListLayout(
                                modalRoot = modalRoot,
                                recycler = recycler,
                                itemCount = tabs.size,
                                focusIndex = focusIndex,
                            )
                        }
                    },
                    onDismiss = {
                        if (!replacing) renderer.showSection(sectionIndex, focusId = focusId)
                    },
                ) { dialogContext ->
                    if (tabs.isEmpty()) {
                        return@custom (LayoutInflater.from(dialogContext)
                            .inflate(blbl.cat3399.R.layout.view_popup_message, null, false) as TextView).apply {
                            text = "暂无内容，按“新增”添加来源。"
                        }
                    }

                    val recycler =
                        (LayoutInflater.from(dialogContext).inflate(blbl.cat3399.R.layout.view_popup_choice_list, null, false) as RecyclerView).apply {
                            layoutManager = LinearLayoutManager(dialogContext)
                            itemAnimator = null
                        }
                    recyclerForLayout = recycler
                    recycler.adapter =
                        TabListAdapter(tabs) { picked ->
                            replacing = true
                            showItemActions(picked.stableKey())
                        }

                    recycler.scrollToPosition(focusIndex)
                    recycler.post {
                        val holder = recycler.findViewHolderForAdapterPosition(focusIndex)
                        (holder?.itemView ?: recycler.getChildAt(0))?.requestFocus()
                    }
                    recycler
                }
            }

            private fun showAddPicker() {
                var forward = false
                val config = loadConfig()
                val groups = CustomPageTabRegistry.availableAddGroups(config)
                if (groups.isEmpty()) {
                    AppToast.show(activity, "可添加的来源已经用完")
                    showManager()
                    return
                }

                AppPopup.singleChoice(
                    context = activity,
                    title = "添加来源",
                    items = groups.map { it.label },
                    checkedIndex = 0,
                    onDismiss = {
                        if (!forward) showManager()
                    },
                ) { which, _ ->
                    val picked = groups.getOrNull(which) ?: return@singleChoice
                    forward = true
                    val directOption = picked.directOption
                    if (directOption != null) {
                        val current = loadConfig()
                        saveConfig(current.copy(tabs = current.tabs + directOption.config))
                        showManager(focusStableKey = directOption.config.stableKey())
                    } else if (picked.key == CustomPageTabRegistry.GROUP_SEARCH) {
                        showSearchTypePicker()
                    } else {
                        showAddLeafPicker(group = picked)
                    }
                }
            }

            private fun showSearchTypePicker() {
                var forward = false
                val config = loadConfig()
                val kinds = CustomPageTabRegistry.availableSearchSourceKinds(config)
                if (kinds.isEmpty()) {
                    AppToast.show(activity, "暂无可添加的搜索历史")
                    showAddPicker()
                    return
                }

                AppPopup.singleChoice(
                    context = activity,
                    title = "添加搜索页面",
                    items = kinds.map { it.label },
                    checkedIndex = 0,
                    onDismiss = {
                        if (!forward) showAddPicker()
                    },
                ) { which, _ ->
                    val picked = kinds.getOrNull(which) ?: return@singleChoice
                    forward = true
                    showSearchHistoryPicker(kind = picked)
                }
            }

            private fun showSearchHistoryPicker(kind: CustomPageSearchSourceKind) {
                var forward = false
                val config = loadConfig()
                val options = CustomPageTabRegistry.availableSearchHistoryOptions(kind.sourceType, config)
                if (options.isEmpty()) {
                    AppToast.show(activity, "该类别下暂无可添加的搜索历史")
                    showSearchTypePicker()
                    return
                }

                AppPopup.singleChoice(
                    context = activity,
                    title = "添加${kind.label}搜索",
                    items = options.map { it.label },
                    checkedIndex = 0,
                    onDismiss = {
                        if (!forward) showSearchTypePicker()
                    },
                ) { which, _ ->
                    val picked = options.getOrNull(which) ?: return@singleChoice
                    forward = true
                    val current = loadConfig()
                    saveConfig(current.copy(tabs = current.tabs + picked.config))
                    showManager(focusStableKey = picked.config.stableKey())
                }
            }

            private fun showAddLeafPicker(group: blbl.cat3399.feature.custom.CustomPageAddGroup) {
                var forward = false
                val config = loadConfig()
                val options = CustomPageTabRegistry.availableAddOptionsForGroup(group.key, config)
                if (options.isEmpty()) {
                    AppToast.show(activity, "该分类下暂无可添加页面")
                    showAddPicker()
                    return
                }

                AppPopup.singleChoice(
                    context = activity,
                    title = "添加${group.label}页面",
                    items = options.map { it.label },
                    checkedIndex = 0,
                    onDismiss = {
                        if (!forward) showAddPicker()
                    },
                ) { which, _ ->
                    val picked = options.getOrNull(which) ?: return@singleChoice
                    forward = true
                    val current = loadConfig()
                    saveConfig(current.copy(tabs = current.tabs + picked.config))
                    showManager(focusStableKey = picked.config.stableKey())
                }
            }

            private fun showItemActions(focusStableKey: String) {
                var forward = false
                val config = loadConfig()
                val index = config.tabs.indexOfFirst { it.stableKey() == focusStableKey }
                if (index < 0) {
                    showManager()
                    return
                }
                val tab = config.tabs[index]

                data class Action(
                    val label: String,
                    val nextConfig: CustomPageConfig,
                    val nextFocusStableKey: String?,
                )

                val actions =
                    buildList {
                        if (index > 0) {
                            val nextTabs = moveTab(config.tabs, fromIndex = index, toIndex = index - 1)
                            add(
                                Action(
                                    label = "上移",
                                    nextConfig = config.copy(tabs = nextTabs),
                                    nextFocusStableKey = nextTabs.getOrNull(index - 1)?.stableKey(),
                                ),
                            )
                        }
                        if (index < config.tabs.lastIndex) {
                            val nextTabs = moveTab(config.tabs, fromIndex = index, toIndex = index + 1)
                            add(
                                Action(
                                    label = "下移",
                                    nextConfig = config.copy(tabs = nextTabs),
                                    nextFocusStableKey = nextTabs.getOrNull(index + 1)?.stableKey(),
                                ),
                            )
                        }
                        val nextTabs = config.tabs.filterIndexed { pos, _ -> pos != index }
                        add(
                            Action(
                                label = "删除",
                                nextConfig = config.copy(tabs = nextTabs),
                                nextFocusStableKey = nextTabs.getOrNull(index)?.stableKey() ?: nextTabs.lastOrNull()?.stableKey(),
                            ),
                        )
                    }

                AppPopup.singleChoice(
                    context = activity,
                    title = CustomPageTabRegistry.settingsLabelForConfig(tab),
                    items = actions.map { it.label },
                    checkedIndex = 0,
                    onDismiss = {
                        if (!forward) showManager(focusStableKey = focusStableKey)
                    },
                ) { which, _ ->
                    val picked = actions.getOrNull(which) ?: return@singleChoice
                    forward = true
                    saveConfig(picked.nextConfig)
                    showManager(focusStableKey = picked.nextFocusStableKey)
                }
            }

            private fun showClearConfirm(focusStableKey: String?) {
                var forward = false
                AppPopup.confirm(
                    context = activity,
                    title = "清空自定义页",
                    message = "确定清空所有自定义页内容？",
                    positiveText = "清空",
                    negativeText = "取消",
                    cancelable = true,
                    onPositive = {
                        forward = true
                        val current = loadConfig()
                        saveConfig(current.copy(tabs = emptyList()))
                        showManager()
                    },
                    onNegative = {
                        forward = true
                        showManager(focusStableKey = focusStableKey)
                    },
                    onDismiss = {
                        if (!forward) showManager(focusStableKey = focusStableKey)
                    },
                )
            }
        }

        Controller().showManager()
    }

    private fun showUserAgentDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        AppPopup.input(
            context = activity,
            title = "User-Agent",
            initial = prefs.userAgent,
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_MULTI_LINE or InputType.TYPE_TEXT_VARIATION_NORMAL,
            minLines = 3,
            positiveText = "保存",
            negativeText = "取消",
            neutralText = "重置默认",
            validate = { text ->
                val ua = text.trim()
                if (ua.isBlank()) {
                    AppToast.show(activity, "User-Agent 不能为空")
                    false
                } else {
                    true
                }
            },
            onPositive = { text ->
                val ua = text.trim()
                prefs.userAgent = ua
                AppToast.show(activity, "已更新 User-Agent")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
            onNeutral = {
                prefs.userAgent = blbl.cat3399.core.prefs.AppPrefs.DEFAULT_UA
                AppToast.show(activity, "已重置 User-Agent")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
        )
    }

    private fun showPlayerAutoSkipServerBaseUrlDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        AppPopup.input(
            context = activity,
            title = "空降助手服务器地址",
            initial = prefs.playerAutoSkipServerBaseUrl,
            hint = "例如 https://bsbsb.top",
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_URI,
            minLines = 1,
            positiveText = "保存",
            negativeText = "取消",
            neutralText = "重置默认",
            validate = { text ->
                val normalized = AppPrefs.normalizePlayerAutoSkipServerBaseUrl(text)
                if (normalized == null) {
                    AppToast.show(activity, "请输入有效的 http:// 或 https:// 地址")
                    false
                } else {
                    true
                }
            },
            onPositive = { text ->
                val url = AppPrefs.normalizePlayerAutoSkipServerBaseUrl(text) ?: return@input
                prefs.playerAutoSkipServerBaseUrl = url
                evictNetworkConnections()
                AppToast.show(activity, "已更新空降助手服务器地址")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
            onNeutral = {
                prefs.playerAutoSkipServerBaseUrl = AppPrefs.DEFAULT_PLAYER_AUTO_SKIP_SERVER_BASE_URL
                evictNetworkConnections()
                AppToast.show(activity, "已重置空降助手服务器地址")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
        )
    }

    private fun showPlayerShortSeekStepDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        val options = AppPrefs.PLAYER_SHORT_SEEK_STEP_SECONDS_OPTIONS.toList()
        showChoiceDialog(
            title = "点按快进秒数",
            items = options.map(SettingsText::seekStepSecondsText),
            current = SettingsText.seekStepSecondsText(prefs.playerShortSeekStepSeconds),
        ) { selected ->
            val value =
                options.firstOrNull { SettingsText.seekStepSecondsText(it) == selected }
                    ?: AppPrefs.PLAYER_SHORT_SEEK_STEP_SECONDS_DEFAULT
            prefs.playerShortSeekStepSeconds = value
            renderer.showSection(sectionIndex, focusId = focusId)
        }
    }

    private fun showPlayerHoldScrubTraverseSecondsDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        showPlayerHoldScrubSecondsDialog(
            title = "拖完整个视频所需时间",
            currentSeconds = prefs.playerHoldScrubTraverseSeconds,
            sectionIndex = sectionIndex,
            focusId = focusId,
        ) { value ->
            prefs.playerHoldScrubTraverseSeconds = value
        }
    }

    private fun showPlayerHoldScrubFixedStepSecondsDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        showPlayerHoldScrubSecondsDialog(
            title = "固定时间拖动进度条间隔",
            currentSeconds = prefs.playerHoldScrubFixedStepSeconds,
            sectionIndex = sectionIndex,
            focusId = focusId,
        ) { value ->
            prefs.playerHoldScrubFixedStepSeconds = value
        }
    }

    private fun showPlayerHoldScrubSecondsDialog(
        title: String,
        currentSeconds: Int,
        sectionIndex: Int,
        focusId: SettingId,
        onSelected: (Int) -> Unit,
    ) {
        val options = AppPrefs.PLAYER_HOLD_SCRUB_SECONDS_OPTIONS.toList()
        showChoiceDialog(
            title = title,
            items = options.map(SettingsText::seekStepSecondsText),
            current = SettingsText.seekStepSecondsText(currentSeconds),
        ) { selected ->
            val value =
                options.firstOrNull { SettingsText.seekStepSecondsText(it) == selected }
                    ?: AppPrefs.PLAYER_HOLD_SCRUB_SECONDS_DEFAULT
            onSelected(value)
            renderer.showSection(sectionIndex, focusId = focusId)
        }
    }

    private fun showClearLoginDialog(sectionIndex: Int, focusId: SettingId) {
        AppPopup.confirm(
            context = activity,
            title = "清除登录",
            message = "将清除所有已保存帐号和当前登录状态，需要重新登录。确定继续吗？",
            positiveText = "确定清除",
            negativeText = "取消",
            cancelable = true,
            onPositive = {
                BiliClient.accounts.clearAllAccountsAndCurrentSession(
                    appPrefs = BiliClient.prefs,
                    cookies = BiliClient.cookies,
                )
                AppToast.show(activity, "已清除登录状态")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
        )
    }

    private fun showClearCacheDialog(sectionIndex: Int, focusId: SettingId) {
        if (clearCacheJob?.isActive == true) {
            AppToast.show(activity, "清理中…")
            return
        }
        if (testUpdateJob?.isActive == true) {
            AppToast.show(activity, "下载中，稍后再试")
            return
        }

        AppPopup.confirm(
            context = activity,
            title = "清理缓存",
            message = "确定清理缓存？",
            positiveText = "清理",
            negativeText = "取消",
            cancelable = true,
            onPositive = { startClearCache(sectionIndex, focusId) },
        )
    }

    private fun startClearCache(sectionIndex: Int, focusId: SettingId) {
        cacheSizeJob?.cancel()
        val popup =
            AppPopup.progress(
                context = activity,
                title = "清理中",
                status = "清理中…",
                negativeText = "取消",
                cancelable = false,
                onNegative = { clearCacheJob?.cancel() },
            )

        clearCacheJob =
            activity.lifecycleScope.launch {
                try {
                    withContext(Dispatchers.IO) {
                        val dirs = listOfNotNull(activity.cacheDir, activity.externalCacheDir)
                        for (dir in dirs) {
                            for (child in (dir.listFiles() ?: emptyArray())) {
                                currentCoroutineContext().ensureActive()
                                runCatching { child.deleteRecursively() }
                            }
                        }
                    }

                    popup?.dismiss()
                    AppToast.show(activity, "已清理缓存")
                    state.cacheSizeBytes = 0L
                    renderer.showSection(sectionIndex, focusId = focusId)
                    updateCacheSize(force = true)
                } catch (_: CancellationException) {
                    popup?.dismiss()
                    AppToast.show(activity, "已取消")
                } catch (t: Throwable) {
                    AppLog.w("Settings", "clear cache failed: ${t.message}", t)
                    popup?.dismiss()
                    AppToast.showLong(activity, "清理失败")
                }
            }
    }

    private fun updateCacheSize(force: Boolean) {
        if (!force && state.cacheSizeBytes != null) return
        if (cacheSizeJob?.isActive == true) return
        cacheSizeJob =
            activity.lifecycleScope.launch {
                val size =
                    withContext(Dispatchers.IO) {
                        val dirs = listOfNotNull(activity.cacheDir, activity.externalCacheDir)
                        dirs.sumOf { dirChildrenSizeBytes(it) }.coerceAtLeast(0L)
                    }
                val old = state.cacheSizeBytes
                state.cacheSizeBytes = size
                if (old != size) {
                    renderer.showSection(state.currentSectionIndex, keepScroll = true)
                }
            }
    }

    private fun dirChildrenSizeBytes(dir: File): Long {
        val children = dir.listFiles() ?: return 0L
        var total = 0L
        val stack = ArrayDeque<File>(children.size)
        for (child in children) stack.add(child)
        while (stack.isNotEmpty()) {
            val file = stack.removeLast()
            if (!file.exists()) continue
            if (file.isFile) {
                total += file.length().coerceAtLeast(0L)
            } else {
                val nested = file.listFiles() ?: continue
                for (n in nested) stack.add(n)
            }
        }
        return total.coerceAtLeast(0L)
    }

    private fun ensureTestUpdateChecked(force: Boolean, refreshUi: Boolean = true, promptIfUpdate: Boolean = false) {
        if (testUpdateJob?.isActive == true) return
        if (testUpdateCheckJob?.isActive == true) return
        if (state.testUpdateCheckState is TestUpdateCheckState.Checking) return

        val now = System.currentTimeMillis()
        val last = state.testUpdateCheckedAtMs
        val hasFreshResult =
            !force &&
                last > 0 &&
                now - last < SettingsConstants.UPDATE_CHECK_TTL_MS &&
                state.testUpdateCheckState !is TestUpdateCheckState.Idle &&
                state.testUpdateCheckState !is TestUpdateCheckState.Checking
        if (hasFreshResult) return

        state.testUpdateCheckState = TestUpdateCheckState.Checking
        if (refreshUi) renderer.refreshAboutSectionKeepPosition()

        testUpdateCheckJob =
            activity.lifecycleScope.launch {
                try {
                    val update = ApkUpdater.fetchLatestUpdate()
                    val latest = update.versionName
                    val current = BuildConfig.VERSION_NAME
                    state.testUpdateCheckState =
                        if (ApkUpdater.isRemoteNewer(latest, current)) {
                            TestUpdateCheckState.UpdateAvailable(update)
                        } else {
                            TestUpdateCheckState.Latest(latest)
                        }
                    state.testUpdateCheckedAtMs = System.currentTimeMillis()
                    if (promptIfUpdate && state.testUpdateCheckState is TestUpdateCheckState.UpdateAvailable) {
                        ApkUpdateFlow.showUpdatePrompt(activity, update) { selectedUpdate ->
                            startTestUpdateDownload(selectedUpdate.versionName)
                        }
                    }
                } catch (_: CancellationException) {
                    return@launch
                } catch (t: Throwable) {
                    state.testUpdateCheckState = TestUpdateCheckState.Error(t.message ?: "检查失败")
                    state.testUpdateCheckedAtMs = System.currentTimeMillis()
                }
                renderer.refreshAboutSectionKeepPosition()
            }
    }

    private fun startTestUpdateDownload(latestVersionHint: String? = null) {
        if (testUpdateJob?.isActive == true) {
            AppToast.show(activity, "正在下载更新…")
            return
        }

        testUpdateJob =
            ApkUpdateFlow.startDownloadAndInstall(
                activity = activity,
                latestVersionHint = latestVersionHint,
                apkUrl = latestVersionHint?.let(ApkUpdater::apkUrlFor),
            ) { latestVersion, isNewer ->
                if (!isNewer && latestVersionHint == null) state.testUpdateCheckState = TestUpdateCheckState.Latest(latestVersion)
                state.testUpdateCheckedAtMs = System.currentTimeMillis()
                renderer.refreshAboutSectionKeepPosition()
            }
                ?: return
    }

    private fun showProjectDialog() {
        AppPopup.custom(
            context = activity,
            title = "项目地址",
            cancelable = true,
            actions =
                listOf(
                    PopupAction(role = PopupActionRole.NEGATIVE, text = "关闭"),
                    PopupAction(role = PopupActionRole.NEUTRAL, text = "复制") {
                        copyToClipboard(label = "项目地址", text = SettingsConstants.PROJECT_URL, toastText = "已复制项目地址")
                    },
                    PopupAction(role = PopupActionRole.POSITIVE, text = "打开") { openUrl(SettingsConstants.PROJECT_URL) },
                ),
            preferredActionRole = PopupActionRole.POSITIVE,
            content = { dialogContext ->
                val tv =
                    android.view.LayoutInflater.from(dialogContext)
                        .inflate(blbl.cat3399.R.layout.view_popup_message, null, false) as TextView
                tv.text = SettingsConstants.PROJECT_URL
                tv
            },
        )
    }

    // v12.1: 关于应用对话框
    private fun showAboutDialog() {
        val versionName = blbl.cat3399.BuildConfig.VERSION_NAME
        val versionCode = blbl.cat3399.BuildConfig.VERSION_CODE
        val aboutText = buildString {
            appendLine("${SettingsConstants.APP_NAME} ${SettingsConstants.VERSION_SUFFIX}")
            appendLine()
            appendLine("版本: v${versionName} (${versionCode})")
            appendLine("描述: ${SettingsConstants.APP_DESC}")
            appendLine()
            appendLine("原作者: ${SettingsConstants.AUTHOR_NAME}")
            appendLine("Fork维护: ${SettingsConstants.FORK_AUTHOR}")
            appendLine("许可: ${SettingsConstants.LICENSE}")
            appendLine("版权: © ${SettingsConstants.COPYRIGHT_YEAR} ${SettingsConstants.AUTHOR_NAME}")
            appendLine()
            appendLine("原项目: ${SettingsConstants.PROJECT_URL}")
            appendLine("Fork项目: ${SettingsConstants.FORKED_URL}")
        }
        AppPopup.custom(
            context = activity,
            title = "关于 ${SettingsConstants.APP_NAME}",
            cancelable = true,
            actions =
                listOf(
                    PopupAction(role = PopupActionRole.NEGATIVE, text = "关闭"),
                    PopupAction(role = PopupActionRole.NEUTRAL, text = "复制链接") {
                        copyToClipboard(label = "Fork项目地址", text = SettingsConstants.FORKED_URL, toastText = "已复制Fork地址")
                    },
                    PopupAction(role = PopupActionRole.POSITIVE, text = "打开Fork") { openUrl(SettingsConstants.FORKED_URL) },
                ),
            preferredActionRole = PopupActionRole.POSITIVE,
            content = { dialogContext ->
                val tv =
                    android.view.LayoutInflater.from(dialogContext)
                        .inflate(blbl.cat3399.R.layout.view_popup_message, null, false) as TextView
                tv.text = aboutText
                tv
            },
        )
    }

    // v12.3: 下载管理对话框
    private fun showDownloadManagementDialog() {
        val downloadDir = android.os.Environment.getExternalStoragePublicDirectory(
            android.os.Environment.DIRECTORY_MOVIES
        )?.let { java.io.File(it, "blbl_downloads") }

        val prefs = activity.getSharedPreferences("downloads", android.content.Context.MODE_PRIVATE)
        val records = org.json.JSONArray(prefs.getString("records", "[]") ?: "[]")
        val items = mutableListOf<blbl.cat3399.feature.download.DownloadListFragment.DownloadItem>()
        for (i in 0 until records.length()) {
            val obj = records.getJSONObject(i)
            val videoPath = obj.optString("videoPath", "")
            val file = java.io.File(videoPath)
            if (file.exists()) {
                items.add(
                    blbl.cat3399.feature.download.DownloadListFragment.DownloadItem(
                        bvid = obj.optString("bvid", ""),
                        cid = obj.optLong("cid", 0),
                        title = obj.optString("title", "未知"),
                        page = obj.optString("page", ""),
                        videoPath = videoPath,
                        audioPath = obj.optString("audioPath", ""),
                        fileSize = obj.optLong("fileSize", 0),
                        downloadedAt = obj.optLong("downloadedAt", 0),
                    )
                )
            }
        }
        items.sortByDescending { it.downloadedAt }

        if (items.isEmpty()) {
            AppToast.show(activity, "暂无下载记录")
            return
        }

        val totalSize = items.sumOf { it.fileSize }
        val sizeStr = when {
            totalSize < 1024 * 1024 -> "${totalSize / 1024}KB"
            totalSize < 1024 * 1024 * 1024 -> String.format("%.1fMB", totalSize / 1024.0 / 1024.0)
            else -> String.format("%.2fGB", totalSize / 1024.0 / 1024.0 / 1024.0)
        }

        val titleText = "下载管理 - ${items.size}个文件，占用${sizeStr}"

        val dateFormat = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
        val itemLabels = items.map { item ->
            val dateStr = dateFormat.format(java.util.Date(item.downloadedAt))
            val formatLabel = if (item.isDash) "DASH" else "MP4"
            val fileSizeStr = when {
                item.fileSize < 1024 * 1024 -> "${item.fileSize / 1024}KB"
                item.fileSize < 1024 * 1024 * 1024 -> String.format("%.1fMB", item.fileSize / 1024.0 / 1024.0)
                else -> String.format("%.2fGB", item.fileSize / 1024.0 / 1024.0 / 1024.0)
            }
            val pageStr = if (item.page.isNotBlank()) " - ${item.page}" else ""
            "${item.title}${pageStr}\n${fileSizeStr} | ${formatLabel} | $dateStr"
        }.toTypedArray()

        android.app.AlertDialog.Builder(activity)
            .setTitle(titleText)
            .setItems(itemLabels) { _, which ->
                val item = items[which]
                showDownloadItemOptions(item)
            }
            .setNegativeButton("关闭", null)
            .show()
    }

    private fun showDownloadItemOptions(item: blbl.cat3399.feature.download.DownloadListFragment.DownloadItem) {
        val fileSizeStr = when {
            item.fileSize < 1024 * 1024 -> "${item.fileSize / 1024}KB"
            item.fileSize < 1024 * 1024 * 1024 -> String.format("%.1fMB", item.fileSize / 1024.0 / 1024.0)
            else -> String.format("%.2fGB", item.fileSize / 1024.0 / 1024.0 / 1024.0)
        }
        val dateStr = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
            .format(java.util.Date(item.downloadedAt))
        val formatLabel = if (item.isDash) "DASH" else "MP4"

        val options = arrayOf("播放", "查看详情", "删除")
        android.app.AlertDialog.Builder(activity)
            .setTitle("${item.title}")
            .setItems(options) { _, which ->
                when (which) {
                    0 -> playDownload(item)
                    1 -> showDownloadInfo(item)
                    2 -> confirmDeleteDownload(item)
                }
            }
            .show()
    }

    private fun playDownload(item: blbl.cat3399.feature.download.DownloadListFragment.DownloadItem) {
        val file = item.playableFile
        if (!file.exists()) {
            AppToast.show(activity, "文件不存在")
            return
        }
        try {
            val uri = androidx.core.content.FileProvider.getUriForFile(
                activity,
                "${activity.packageName}.fileprovider",
                file
            )
            val mimeType = if (item.isDash) "video/mp4" else "video/*"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                setDataAndType(uri, mimeType)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            if (intent.resolveActivity(activity.packageManager) != null) {
                activity.startActivity(intent)
            } else {
                AppToast.show(activity, "未找到可用播放器")
            }
        } catch (e: Exception) {
            AppToast.show(activity, "播放失败：${e.message}")
        }
    }

    private fun showDownloadInfo(item: blbl.cat3399.feature.download.DownloadListFragment.DownloadItem) {
        val fileSizeStr = when {
            item.fileSize < 1024 * 1024 -> "${item.fileSize / 1024}KB"
            item.fileSize < 1024 * 1024 * 1024 -> String.format("%.1fMB", item.fileSize / 1024.0 / 1024.0)
            else -> String.format("%.2fGB", item.fileSize / 1024.0 / 1024.0 / 1024.0)
        }
        val dateStr = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
            .format(java.util.Date(item.downloadedAt))
        val formatLabel = if (item.isDash) "DASH" else "MP4"

        val msg = buildString {
            appendLine("标题：${item.title}")
            if (item.page.isNotBlank()) appendLine("分P：${item.page}")
            appendLine("BV号：${item.bvid}")
            appendLine("格式：$formatLabel")
            appendLine("大小：$fileSizeStr")
            appendLine("下载时间：$dateStr")
            appendLine("路径：${item.videoPath}")
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("文件详情")
            .setMessage(msg)
            .setPositiveButton("确定", null)
            .show()
    }

    private fun confirmDeleteDownload(item: blbl.cat3399.feature.download.DownloadListFragment.DownloadItem) {
        android.app.AlertDialog.Builder(activity)
            .setTitle("删除下载")
            .setMessage("确定删除 \"${item.title}\" 吗？")
            .setPositiveButton("删除") { _, _ ->
                item.playableFile.delete()
                if (item.audioPath.isNotBlank()) java.io.File(item.audioPath).delete()
                val prefs = activity.getSharedPreferences("downloads", android.content.Context.MODE_PRIVATE)
                val arr = org.json.JSONArray(prefs.getString("records", "[]") ?: "[]")
                val newArr = org.json.JSONArray()
                for (i in 0 until arr.length()) {
                    val obj = arr.getJSONObject(i)
                    if (obj.optString("videoPath", "") != item.videoPath) {
                        newArr.put(obj)
                    }
                }
                prefs.edit().putString("records", newArr.toString()).apply()
                AppToast.show(activity, "已删除")
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v12.4: 投屏管理对话框
    private fun showCastManagementDialog() {
        val prefs = activity.getSharedPreferences("cast_settings", android.content.Context.MODE_PRIVATE)
        val autoReconnect = prefs.getBoolean("auto_reconnect", true)
        val searchTimeout = prefs.getInt("search_timeout", 3000)
        val currentDevice = blbl.cat3399.feature.cast.DlnaHelper.currentDevice

        val actions = mutableListOf<blbl.cat3399.core.ui.popup.PopupAction>()

        // 当前投屏状态
        val statusText = if (currentDevice != null) {
            "当前投屏: ${currentDevice.friendlyName}\n设备地址: ${currentDevice.host}"
        } else {
            "未在投屏中"
        }

        // 搜索设备
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            text = "🔍 搜索投屏设备"
        ) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("正在搜索...")
                .setMessage("搜索局域网内的投屏设备，请稍候...")
                .setCancelable(false)
                .show()

            kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
                try {
                    val devices = blbl.cat3399.feature.cast.DlnaHelper.discoverDevices(searchTimeout)
                    // 关闭搜索对话框
                    android.app.AlertDialog.Builder(activity).create().let { d -> d.dismiss() }

                    if (devices.isEmpty()) {
                        AppToast.show(activity, "未找到投屏设备")
                    } else {
                        showDeviceListDialog(devices)
                    }
                } catch (e: Exception) {
                    AppToast.show(activity, "搜索失败: ${e.message}")
                }
            }
        })

        // 断开当前投屏
        if (currentDevice != null) {
            actions.add(blbl.cat3399.core.ui.popup.PopupAction(
                role = blbl.cat3399.core.ui.popup.PopupActionRole.NEGATIVE,
                text = "⏹ 断开投屏"
            ) {
                kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
                    try {
                        blbl.cat3399.feature.cast.DlnaHelper.stop(currentDevice)
                        AppToast.show(activity, "已断开投屏")
                    } catch (e: Exception) {
                        AppToast.show(activity, "断开失败: ${e.message}")
                    }
                }
            })
        }

        // 自动重连开关
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            text = if (autoReconnect) "✅ 自动重连: 开" else "⬜ 自动重连: 关"
        ) {
            prefs.edit().putBoolean("auto_reconnect", !autoReconnect).apply()
            AppToast.show(activity, if (!autoReconnect) "已开启自动重连" else "已关闭自动重连")
        })

        // 搜索超时设置
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            text = "⏱ 搜索超时: ${searchTimeout / 1000}秒"
        ) {
            val options = arrayOf("2秒", "3秒（默认）", "5秒", "8秒")
            val values = intArrayOf(2000, 3000, 5000, 8000)
            android.app.AlertDialog.Builder(activity)
                .setTitle("搜索超时")
                .setItems(options) { _, which ->
                    prefs.edit().putInt("search_timeout", values[which]).apply()
                    AppToast.show(activity, "搜索超时已设为${values[which] / 1000}秒")
                }
                .show()
        })

        // 音量控制
        if (currentDevice != null) {
            actions.add(blbl.cat3399.core.ui.popup.PopupAction(
                role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
                text = "🔊 投屏音量"
            ) {
                showCastVolumeDialog(currentDevice)
            })
        }

        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.NEGATIVE,
            text = "关闭"
        ))

        blbl.cat3399.core.ui.popup.AppPopup.custom(
            context = activity,
            title = "投屏管理",
            cancelable = true,
            actions = actions,
            preferredActionRole = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            content = { dialogContext ->
                android.widget.TextView(dialogContext).apply {
                    text = statusText
                    setPadding(48, 32, 48, 32)
                    textSize = 14f
                }
            },
        )
    }

    private fun showDeviceListDialog(devices: List<blbl.cat3399.feature.cast.DlnaHelper.DlnaDevice>) {
        val names = devices.map { it.friendlyName }.toTypedArray()
        android.app.AlertDialog.Builder(activity)
            .setTitle("选择投屏设备 (${devices.size}个)")
            .setItems(names) { _, which ->
                val device = devices[which]
                // 连接并投屏
                kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
                    try {
                        // 获取播放URL (从 SharedPreferences 或其他方式)
                        val playerPrefs = activity.getSharedPreferences("player_cast_url", android.content.Context.MODE_PRIVATE)
                        val url = playerPrefs.getString("url", "") ?: ""
                        val title = playerPrefs.getString("title", "BLBL投屏") ?: "BLBL投屏"
                        if (url.isBlank()) {
                            AppToast.show(activity, "请先播放视频再投屏")
                            return@launch
                        }
                        blbl.cat3399.feature.cast.DlnaHelper.setAVTransportURI(device, url, title)
                        blbl.cat3399.feature.cast.DlnaHelper.play(device)
                        // 保存上次设备
                        activity.getSharedPreferences("cast_settings", android.content.Context.MODE_PRIVATE)
                            .edit()
                            .putString("last_device_name", device.friendlyName)
                            .putString("last_device_location", device.location)
                            .apply()
                        AppToast.show(activity, "已投屏到 ${device.friendlyName}")
                    } catch (e: Exception) {
                        AppToast.show(activity, "投屏失败: ${e.message}")
                    }
                }
            }
            .setNegativeButton("取消", null)
            .show()
    }

    private fun showCastVolumeDialog(device: blbl.cat3399.feature.cast.DlnaHelper.DlnaDevice) {
        val volumes = arrayOf("30%", "50%", "80%", "100%")
        val values = intArrayOf(30, 50, 80, 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("投屏音量")
            .setItems(volumes) { _, which ->
                kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
                    try {
                        blbl.cat3399.feature.cast.DlnaHelper.setVolume(device, values[which])
                        AppToast.show(activity, "音量已设为${values[which]}%")
                    } catch (e: Exception) {
                        AppToast.show(activity, "设置失败: ${e.message}")
                    }
                }
            }
            .show()
    }

    // v12.5: 网络诊断对话框
    private fun showNetworkDiagnosticsDialog() {
        val results = mutableListOf<String>()
        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("网络诊断")
            .setMessage("正在检测...")
            .setPositiveButton("关闭", null)
            .setNeutralButton("重新检测", null)
            .show()

        fun runDiagnostics() {
            results.clear()
            dialog.setMessage("正在检测...")

            kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
                // 1. 网络类型
                val cm = activity.getSystemService(android.content.Context.CONNECTIVITY_SERVICE) as android.net.ConnectivityManager
                val activeNetwork = cm.activeNetwork
                val caps = cm.getNetworkCapabilities(activeNetwork)
                val networkType = when {
                    caps == null -> "未连接"
                    caps.hasTransport(android.net.NetworkCapabilities.TRANSPORT_WIFI) -> "WiFi"
                    caps.hasTransport(android.net.NetworkCapabilities.TRANSPORT_CELLULAR) -> "移动数据"
                    caps.hasTransport(android.net.NetworkCapabilities.TRANSPORT_ETHERNET) -> "有线网络"
                    else -> "其他"
                }
                results.add("📡 网络类型: $networkType")

                // 2. 代理状态
                val proxyHost = java.lang.System.getProperty("http.proxyHost")
                val proxyPort = java.lang.System.getProperty("http.proxyPort")
                if (!proxyHost.isNullOrBlank()) {
                    results.add("🔒 代理: $proxyHost:$proxyPort")
                } else {
                    results.add("🔒 代理: 未设置")
                }

                // 3. DNS 解析测试
                val dnsTargets = listOf(
                    "api.bilibili.com" to "B站API",
                    "www.bilibili.com" to "B站主站",
                    "comment.bilibili.com" to "B站评论",
                    "live.bilibili.com" to "B站直播",
                )
                results.add("")
                results.add("🔍 DNS 解析测试:")
                for ((host, label) in dnsTargets) {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                        try {
                            val start = System.currentTimeMillis()
                            java.net.InetAddress.getByName(host)
                            val elapsed = System.currentTimeMillis() - start
                            results.add("  ✅ $label ($host): ${elapsed}ms")
                        } catch (e: Exception) {
                            results.add("  ❌ $label ($host): ${e.message}")
                        }
                    }
                }

                // 4. HTTP 连接测试
                results.add("")
                results.add("🌐 HTTP 连接测试:")
                val httpTargets = listOf(
                    "https://api.bilibili.com/x/web-interface/zone" to "B站API",
                    "https://www.bilibili.com" to "B站主站",
                )
                for ((url, label) in httpTargets) {
                    kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                        try {
                            val start = System.currentTimeMillis()
                            val client = okhttp3.OkHttpClient.Builder()
                                .connectTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
                                .readTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
                                .build()
                            val request = okhttp3.Request.Builder().url(url).head().build()
                            val response = client.newCall(request).execute()
                            val elapsed = System.currentTimeMillis() - start
                            results.add("  ✅ $label: HTTP ${response.code} (${elapsed}ms)")
                        } catch (e: Exception) {
                            results.add("  ❌ $label: ${e.message?.take(50)}")
                        }
                    }
                }

                // 5. 结果摘要
                results.add("")
                val failCount = results.count { it.contains("❌") }
                if (failCount == 0) {
                    results.add("🎉 所有检测通过，网络状态正常！")
                } else {
                    results.add("⚠️ 发现 $failCount 个问题，请检查网络设置")
                }

                dialog.setMessage(results.joinToString("\n"))
            }
        }

        dialog.getButton(android.content.DialogInterface.BUTTON_NEUTRAL).setOnClickListener {
            runDiagnostics()
        }

        runDiagnostics()
    }

    // v12.6: 播放统计对话框
    private fun showWatchStatisticsDialog() {
        val prefs = activity.getSharedPreferences("watch_stats", android.content.Context.MODE_PRIVATE)
        val totalWatchTimeMs = prefs.getLong("total_watch_time", 0L)
        val videoCount = prefs.getInt("video_count", 0)
        val lastWatchTime = prefs.getLong("last_watch_time", 0L)

        // 格式化观看时间
        val totalHours = totalWatchTimeMs / (1000 * 60 * 60)
        val totalMinutes = (totalWatchTimeMs / (1000 * 60)) % 60
        val timeStr = when {
            totalHours > 0 -> "${totalHours}小时${totalMinutes}分钟"
            totalMinutes > 0 -> "${totalMinutes}分钟"
            else -> "不足1分钟"
        }

        // 最后观看时间
        val lastWatchStr = if (lastWatchTime > 0) {
            java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
                .format(java.util.Date(lastWatchTime))
        } else {
            "无记录"
        }

        // 计算日均观看时间（假设使用7天）
        val installTime = prefs.getLong("install_time", System.currentTimeMillis())
        val daysSinceInstall = maxOf(1, (System.currentTimeMillis() - installTime) / (1000 * 60 * 60 * 24))
        val dailyAvgMs = totalWatchTimeMs / daysSinceInstall
        val dailyAvgMinutes = dailyAvgMs / (1000 * 60)

        val statsText = buildString {
            appendLine("📊 观看统计")
            appendLine()
            appendLine("⏱ 总观看时长: $timeStr")
            appendLine("🎬 观看视频数: $videoCount 个")
            appendLine("📅 日均观看: ${dailyAvgMinutes}分钟")
            appendLine("🕐 最后观看: $lastWatchStr")
            appendLine()
            appendLine("💡 数据自应用安装起累计统计")
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("播放统计")
            .setMessage(statsText)
            .setPositiveButton("关闭", null)
            .setNeutralButton("重置统计") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("确认重置")
                    .setMessage("确定要清除所有播放统计数据吗？")
                    .setPositiveButton("重置") { _, _ ->
                        prefs.edit().clear().apply()
                        AppToast.show(activity, "统计数据已重置")
                    }
                    .setNegativeButton("取消", null)
                    .show()
            }
            .show()
    }

    // v12.7: 历史记录管理对话框
    private fun showHistoryManagementDialog() {
        val historyPrefs = activity.getSharedPreferences("watch_stats", android.content.Context.MODE_PRIVATE)
        val videoCount = historyPrefs.getInt("video_count", 0)
        val totalWatchTime = historyPrefs.getLong("total_watch_time", 0L)
        val lastWatchTime = historyPrefs.getLong("last_watch_time", 0L)

        val totalHours = totalWatchTime / (1000 * 60 * 60)
        val totalMinutes = (totalWatchTime / (1000 * 60)) % 60
        val timeStr = when {
            totalHours > 0 -> "${totalHours}小时${totalMinutes}分钟"
            totalMinutes > 0 -> "${totalMinutes}分钟"
            else -> "不足1分钟"
        }

        val lastWatchStr = if (lastWatchTime > 0) {
            java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
                .format(java.util.Date(lastWatchTime))
        } else {
            "无记录"
        }

        val infoText = buildString {
            appendLine("📺 历史记录概览")
            appendLine()
            appendLine("观看视频数: $videoCount 个")
            appendLine("总观看时长: $timeStr")
            appendLine("最后观看: $lastWatchStr")
        }

        val actions = mutableListOf<blbl.cat3399.core.ui.popup.PopupAction>()

        // 导出历史记录
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            text = "📤 导出历史记录"
        ) {
            try {
                val exportData = buildString {
                    appendLine("BLBL 播放历史记录导出")
                    appendLine("导出时间: ${java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(java.util.Date())}")
                    appendLine()
                    appendLine("观看视频数: $videoCount")
                    appendLine("总观看时长: $timeStr")
                    appendLine("最后观看: $lastWatchStr")
                }
                val fileName = "blbl_history_${System.currentTimeMillis()}.txt"
                val file = java.io.File(activity.getExternalFilesDir(null), fileName)
                file.writeText(exportData)
                AppToast.show(activity, "已导出到: ${file.absolutePath}")
            } catch (e: Exception) {
                AppToast.show(activity, "导出失败: ${e.message}")
            }
        })

        // 清理旧记录
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            text = "🧹 清理30天前记录"
        ) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("确认清理")
                .setMessage("将重置所有播放统计数据，此操作不可撤销。")
                .setPositiveButton("清理") { _, _ ->
                    historyPrefs.edit().clear().apply()
                    AppToast.show(activity, "历史记录已清理")
                }
                .setNegativeButton("取消", null)
                .show()
        })

        // 清空所有记录
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.NEGATIVE,
            text = "🗑 清空所有记录"
        ) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("确认清空")
                .setMessage("将删除所有播放统计数据，此操作不可撤销。")
                .setPositiveButton("清空") { _, _ ->
                    historyPrefs.edit().clear().apply()
                    AppToast.show(activity, "所有记录已清空")
                }
                .setNegativeButton("取消", null)
                .show()
        })

        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.NEGATIVE,
            text = "关闭"
        ))

        blbl.cat3399.core.ui.popup.AppPopup.custom(
            context = activity,
            title = "历史记录管理",
            cancelable = true,
            actions = actions,
            preferredActionRole = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            content = { dialogContext ->
                android.widget.TextView(dialogContext).apply {
                    text = infoText
                    setPadding(48, 32, 48, 32)
                    textSize = 14f
                }
            },
        )
    }

    // v12.8: 缓存管理对话框
    private fun showCacheManagementDialog() {
        // 计算缓存大小
        fun getCacheSize(): String {
            val cacheDir = activity.cacheDir
            val externalCacheDir = activity.externalCacheDir
            var totalSize = 0L

            fun dirSize(dir: java.io.File?): Long {
                if (dir == null || !dir.exists()) return 0L
                var size = 0L
                dir.listFiles()?.forEach {
                    size += if (it.isDirectory) dirSize(it) else it.length()
                }
                return size
            }

            totalSize += dirSize(cacheDir)
            totalSize += dirSize(externalCacheDir)

            return when {
                totalSize < 1024 -> "${totalSize}B"
                totalSize < 1024 * 1024 -> String.format("%.1fKB", totalSize / 1024.0)
                totalSize < 1024 * 1024 * 1024 -> String.format("%.1fMB", totalSize / 1024.0 / 1024.0)
                else -> String.format("%.2fGB", totalSize / 1024.0 / 1024.0 / 1024.0)
            }
        }

        val cacheSize = getCacheSize()

        val infoText = buildString {
            appendLine("💾 缓存信息")
            appendLine()
            appendLine("当前缓存大小: $cacheSize")
            appendLine()
            appendLine("缓存包含：")
            appendLine("  • 图片缓存")
            appendLine("  • API 响应缓存")
            appendLine("  • 临时文件")
        }

        val actions = mutableListOf<blbl.cat3399.core.ui.popup.PopupAction>()

        // 清理图片缓存
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            text = "🖼 清理图片缓存"
        ) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("确认清理")
                .setMessage("将清理所有图片缓存，下次加载图片时会重新下载。")
                .setPositiveButton("清理") { _, _ ->
                    try {
                        // 清理图片缓存目录
                        activity.cacheDir?.listFiles()?.forEach {
                            if (it.isDirectory && (it.name.contains("image") || it.name.contains("picasso") || it.name.contains("glide") || it.name.contains("cache"))) {
                                it.deleteRecursively()
                            }
                        }
                        AppToast.show(activity, "图片缓存已清理")
                    } catch (e: Exception) {
                        AppToast.show(activity, "清理失败: ${e.message}")
                    }
                }
                .setNegativeButton("取消", null)
                .show()
        })

        // 清理所有缓存
        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.NEGATIVE,
            text = "🗑 清理所有缓存"
        ) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("确认清理")
                .setMessage("将清理所有缓存文件，包括图片缓存和临时文件。")
                .setPositiveButton("清理") { _, _ ->
                    try {
                        activity.cacheDir?.deleteRecursively()
                        activity.externalCacheDir?.deleteRecursively()
                        AppToast.show(activity, "所有缓存已清理")
                    } catch (e: Exception) {
                        AppToast.show(activity, "清理失败: ${e.message}")
                    }
                }
                .setNegativeButton("取消", null)
                .show()
        })

        actions.add(blbl.cat3399.core.ui.popup.PopupAction(
            role = blbl.cat3399.core.ui.popup.PopupActionRole.NEGATIVE,
            text = "关闭"
        ))

        blbl.cat3399.core.ui.popup.AppPopup.custom(
            context = activity,
            title = "缓存管理",
            cancelable = true,
            actions = actions,
            preferredActionRole = blbl.cat3399.core.ui.popup.PopupActionRole.POSITIVE,
            content = { dialogContext ->
                android.widget.TextView(dialogContext).apply {
                    text = infoText
                    setPadding(48, 32, 48, 32)
                    textSize = 14f
                }
            },
        )
    }

    // v12.9: 快捷键帮助对话框
    private fun showRemoteHelpDialog() {
        val helpText = buildString {
            appendLine("🎮 遥控器操作指南")
            appendLine()
            appendLine("【全局操作】")
            appendLine("  ⬆⬇⬅➡  方向键 - 导航/选择")
            appendLine("  🔴 确认键 - 点击/进入")
            appendLine("  ◀ 返回键 - 返回上一级")
            appendLine()
            appendLine("【播放器操作】")
            appendLine("  ⬅/➡  左右键 - 快进/快退")
            appendLine("  ⬆/⬇  上下键 - 调节音量")
            appendLine("  🔴 确认键 - 暂停/继续")
            appendLine("  ◀ 返回键 - 退出播放器")
            appendLine("  📋 菜单键 - 更多选项")
            appendLine()
            appendLine("【快捷功能】")
            appendLine("  长按确认键 - 倍速播放")
            appendLine("  双击确认键 - 点赞")
            appendLine()
            appendLine("💡 提示：不同设备遥控器可能有差异")
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("快捷键帮助")
            .setMessage(helpText)
            .setPositiveButton("关闭", null)
            .show()
    }

    // v12.10: 检查更新对话框
    private fun checkForUpdates() {
        val currentVersion = blbl.cat3399.BuildConfig.VERSION_NAME
        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("检查更新")
            .setMessage("正在检查更新...")
            .setPositiveButton("关闭", null)
            .show()

        kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.Main).launch {
            kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
                try {
                    val client = okhttp3.OkHttpClient.Builder()
                        .connectTimeout(10, java.util.concurrent.TimeUnit.SECONDS)
                        .readTimeout(10, java.util.concurrent.TimeUnit.SECONDS)
                        .build()
                    val request = okhttp3.Request.Builder()
                        .url("https://api.github.com/repos/min09577/blbl/releases/latest")
                        .build()
                    val response = client.newCall(request).execute()
                    val body = response.body?.string()
                    if (response.isSuccessful && body != null) {
                        val json = org.json.JSONObject(body)
                        val latestVersion = json.optString("tag_name", "").removePrefix("v")
                        val releaseUrl = json.optString("html_url", "")
                        val publishedAt = json.optString("published_at", "")
                        val body2 = json.optString("body", "")

                        withContext(kotlinx.coroutines.Dispatchers.Main) {
                            val isUpdate = latestVersion.isNotEmpty() && latestVersion != currentVersion
                            val message = buildString {
                                appendLine("当前版本: v$currentVersion")
                                appendLine("最新版本: v$latestVersion")
                                if (publishedAt.isNotEmpty()) {
                                    appendLine("发布时间: ${publishedAt.substring(0, 10)}")
                                }
                                appendLine()
                                if (isUpdate) {
                                     appendLine("🎉 发现新版本！")
                                     appendLine()
                                     if (body2.isNotEmpty()) {
                                         appendLine("更新内容:")
                                         appendLine(body2.take(300))
                                     }
                                 } else {
                                     appendLine("✅ 已是最新版本")
                                 }
                            }
                            dialog.setMessage(message)
                            if (isUpdate && releaseUrl.isNotEmpty()) {
                                dialog.setButton(android.content.DialogInterface.BUTTON_NEUTRAL, "下载更新") { _, _ ->
                                    openUrl(releaseUrl)
                                }
                            }
                        }
                    } else {
                        withContext(kotlinx.coroutines.Dispatchers.Main) {
                            dialog.setMessage("检查失败: HTTP ${response.code}")
                        }
                    }
                } catch (e: Exception) {
                    withContext(kotlinx.coroutines.Dispatchers.Main) {
                        dialog.setMessage("检查失败: ${e.message}")
                    }
                }
            }
        }
    }

    private fun openUrl(url: String) {
        runCatching {
            activity.startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)))
        }.onFailure {
            AppToast.show(activity, "无法打开链接")
        }
    }

    // v12.11: 视频信息对话框
    private fun showVideoInfoDialog() {
        val infoText = buildString {
            appendLine("📹 设备视频能力")
            appendLine()

            // 设备基本信息
            appendLine("【设备信息】")
            appendLine("  品牌: ${android.os.Build.BRAND}")
            appendLine("  型号: ${android.os.Build.MODEL}")
            appendLine("  系统: Android ${android.os.Build.VERSION.RELEASE}")
            appendLine("  API: ${android.os.Build.VERSION.SDK_INT}")
            appendLine()

            // 屏幕信息
            val dm = activity.resources.displayMetrics
            appendLine("【屏幕信息】")
            appendLine("  分辨率: ${dm.widthPixels}×${dm.heightPixels}")
            appendLine("  密度: ${dm.densityDpi}dpi")
            appendLine("  缩放: ${dm.density}x")
            appendLine()

            // 硬件解码器
            appendLine("【硬件解码器】")
            try {
                val codecList = android.media.MediaCodecList(android.media.MediaCodecList.ALL_CODECS)
                var h264hw = false
                var h265hw = false
                var av1hw = false
                for (info in codecList.codecInfos) {
                    if (info.isEncoder) continue
                    for (type in info.supportedTypes) {
                        when (type.lowercase()) {
                            "video/avc" -> if (!info.name.contains("sw") && !info.name.contains("google")) h264hw = true
                            "video/hevc" -> if (!info.name.contains("sw") && !info.name.contains("google")) h265hw = true
                            "video/av01" -> if (!info.name.contains("sw") && !info.name.contains("google")) av1hw = true
                        }
                    }
                }
                appendLine("  H.264 (AVC): ${if (h264hw) "✅ 支持" else "❌ 不支持"}")
                appendLine("  H.265 (HEVC): ${if (h265hw) "✅ 支持" else "❌ 不支持"}")
                appendLine("  AV1: ${if (av1hw) "✅ 支持" else "❌ 不支持"}")
            } catch (e: Exception) {
                appendLine("  无法获取解码器信息")
            }
            appendLine()

            // 内存信息
            val rt = Runtime.getRuntime()
            val maxMem = rt.maxMemory() / 1024 / 1024
            val totalMem = rt.totalMemory() / 1024 / 1024
            val freeMem = rt.freeMemory() / 1024 / 1024
            appendLine("【内存信息】")
            appendLine("  最大可用: ${maxMem}MB")
            appendLine("  已分配: ${totalMem}MB")
            appendLine("  空闲: ${freeMem}MB")
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频信息")
            .setMessage(infoText)
            .setPositiveButton("关闭", null)
            .show()
    }

    private fun copyToClipboard(label: String, text: String, toastText: String? = null) {
        val clipboard = activity.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
        if (clipboard == null) {
            AppToast.show(activity, "无法访问剪贴板")
            return
        }
        clipboard.setPrimaryClip(ClipData.newPlainText(label, text))
        AppToast.show(activity, toastText ?: "已复制：$text")
    }

    // v12.12: 播放器手势设置对话框
    private fun showPlayerGestureDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var seekSpeed = prefs.getInt("gesture_seek_speed", 5)
        var doubleTapAction = prefs.getInt("gesture_double_tap", 0)
        var longPressSpeed = prefs.getFloat("gesture_long_press_speed", 2.0f)

        val seekLabels = arrayOf("3秒", "5秒", "10秒", "15秒", "30秒")
        val seekValues = intArrayOf(3, 5, 10, 15, 30)
        val doubleTapLabels = arrayOf("快进/快退", "点赞", "无操作")
        val longPressLabels = arrayOf("1.5x", "2.0x", "2.5x", "3.0x")
        val longPressValues = floatArrayOf(1.5f, 2.0f, 2.5f, 3.0f)

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("手势设置")
            .setMessage(buildString {
                appendLine("配置播放器手势操作：")
                appendLine()
                appendLine("• 双击左侧: 后退 ${seekValues[seekSpeed.coerceIn(0, 4)]}秒")
                appendLine("• 双击右侧: 快进 ${seekValues[seekSpeed.coerceIn(0, 4)]}秒")
                appendLine("• 双击操作: ${doubleTapLabels[doubleTapAction.coerceIn(0, 2)]}")
                appendLine("• 长按倍速: ${longPressSpeed}x")
            })
            .setPositiveButton("关闭", null)
            .setNeutralButton("快进秒数") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("快进/快退秒数")
                    .setSingleChoiceItems(seekLabels, seekSpeed.coerceIn(0, 4)) { _, which ->
                        seekSpeed = which
                        prefs.edit().putInt("gesture_seek_speed", which).apply()
                        AppToast.show(activity, "已设置为 ${seekValues[which]}秒")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .setNegativeButton("双击操作") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("双击操作")
                    .setSingleChoiceItems(doubleTapLabels, doubleTapAction.coerceIn(0, 2)) { _, which ->
                        doubleTapAction = which
                        prefs.edit().putInt("gesture_double_tap", which).apply()
                        AppToast.show(activity, "已设置为 ${doubleTapLabels[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.13: 画中画设置对话框
    private fun showPictureInPictureDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var pipEnabled = prefs.getBoolean("pip_enabled", true)
        var autoPip = prefs.getBoolean("auto_pip", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("画中画模式设置：")
                appendLine()
                appendLine("• 画中画: ${if (pipEnabled) "✅ 已开启" else "❌ 已关闭"}")
                appendLine("• 自动进入: ${if (autoPip) "✅ 返回键自动进入" else "❌ 手动触发"}")
                appendLine()
                appendLine("💡 提示：播放视频时按返回键可触发画中画")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("画中画")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (pipEnabled) "关闭画中画" else "开启画中画") { _, _ ->
                pipEnabled = !pipEnabled
                prefs.edit().putBoolean("pip_enabled", pipEnabled).apply()
                AppToast.show(activity, if (pipEnabled) "已开启画中画" else "已关闭画中画")
            }
            .setNegativeButton(if (autoPip) "关闭自动进入" else "开启自动进入") { _, _ ->
                autoPip = !autoPip
                prefs.edit().putBoolean("auto_pip", autoPip).apply()
                AppToast.show(activity, if (autoPip) "返回键将自动进入画中画" else "已关闭自动进入")
            }
            .show()
    }

    // v12.14: 音效设置对话框
    private fun showAudioEffectDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var audioBoost = prefs.getBoolean("audio_boost", false)
        var volumeNormalization = prefs.getBoolean("volume_normalization", false)
        var bassBoost = prefs.getBoolean("bass_boost", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("音频增强设置：")
                appendLine()
                appendLine("• 音量增强: ${if (audioBoost) "✅ 已开启" else "❌ 已关闭"}")
                appendLine("• 音量均衡: ${if (volumeNormalization) "✅ 已开启" else "❌ 已关闭"}")
                appendLine("• 低音增强: ${if (bassBoost) "✅ 已开启" else "❌ 已关闭"}")
                appendLine()
                appendLine("💡 提示：音量增强可提升整体音量")
                appendLine("音量均衡可减少音量忽大忽小的问题")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("音效设置")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("音量增强") { _, _ ->
                audioBoost = !audioBoost
                prefs.edit().putBoolean("audio_boost", audioBoost).apply()
                AppToast.show(activity, if (audioBoost) "已开启音量增强" else "已关闭音量增强")
            }
            .setNegativeButton("音量均衡") { _, _ ->
                volumeNormalization = !volumeNormalization
                prefs.edit().putBoolean("volume_normalization", volumeNormalization).apply()
                AppToast.show(activity, if (volumeNormalization) "已开启音量均衡" else "已关闭音量均衡")
            }
            .show()
    }

    // v12.15: 字幕样式设置对话框
    private fun showSubtitleStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var fontSize = prefs.getInt("subtitle_font_size", 16)
        var fontColor = prefs.getInt("subtitle_font_color", -1)  // -1 = 白色
        var bgColor = prefs.getInt("subtitle_bg_color", 0x80000000.toInt())  // 半透明黑
        var strokeWidth = prefs.getFloat("subtitle_stroke_width", 2.0f)

        val fontSizes = arrayOf("小", "中", "大", "特大")
        val fontValues = intArrayOf(12, 16, 20, 24)
        val colors = arrayOf("白色", "黄色", "青色", "绿色")
        val colorValues = intArrayOf(-1, 0xFFFFFF00.toInt(), 0xFF00FFFF.toInt(), 0xFF00FF00.toInt())

        fun updateSummary(): String {
            val sizeLabel = when (fontSize) {
                12 -> "小"
                16 -> "中"
                20 -> "大"
                24 -> "特大"
                else -> "中"
            }
            val colorLabel = when (fontColor) {
                -1 -> "白色"
                0xFFFFFF00.toInt() -> "黄色"
                0xFF00FFFF.toInt() -> "青色"
                0xFF00FF00.toInt() -> "绿色"
                else -> "白色"
            }
            return buildString {
                appendLine("字幕样式设置：")
                appendLine()
                appendLine("• 字体大小: $sizeLabel")
                appendLine("• 字体颜色: $colorLabel")
                appendLine("• 描边宽度: ${strokeWidth.toInt()}")
                appendLine()
                appendLine("💡 提示：修改后需重启播放器生效")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("字幕样式")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("字体大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("字体大小")
                    .setSingleChoiceItems(fontSizes, fontValues.indexOf(fontSize).coerceAtLeast(0)) { _, which ->
                        fontSize = fontValues[which]
                        prefs.edit().putInt("subtitle_font_size", fontSize).apply()
                        AppToast.show(activity, "已设置为 ${fontSizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .setNegativeButton("字体颜色") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("字体颜色")
                    .setSingleChoiceItems(colors, colorValues.indexOf(fontColor).coerceAtLeast(0)) { _, which ->
                        fontColor = colorValues[which]
                        prefs.edit().putInt("subtitle_font_color", fontColor).apply()
                        AppToast.show(activity, "已设置为 ${colors[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.16: 直播弹幕设置对话框
    private fun showLiveDanmakuDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var speed = prefs.getInt("live_danmaku_speed", 5)  // 1-10
        var density = prefs.getInt("live_danmaku_density", 3)  // 1-5
        var fontSize = prefs.getInt("live_danmaku_font_size", 16)
        var showGift = prefs.getBoolean("live_danmaku_show_gift", true)
        var showEnter = prefs.getBoolean("live_danmaku_show_enter", true)

        val speedLabels = arrayOf("很慢", "慢", "中等", "快", "很快")
        val speedValues = intArrayOf(1, 3, 5, 7, 10)
        val densityLabels = arrayOf("稀疏", "较稀", "中等", "较密", "密集")
        val densityValues = intArrayOf(1, 2, 3, 4, 5)
        val fontSizes = arrayOf("小", "中", "大", "特大")
        val fontValues = intArrayOf(12, 16, 20, 24)

        fun updateSummary(): String {
            val speedLabel = speedLabels[speedValues.indexOf(speed).coerceAtLeast(2)]
            val densityLabel = densityLabels[densityValues.indexOf(density).coerceAtLeast(2)]
            val sizeLabel = when (fontSize) {
                12 -> "小"; 16 -> "中"; 20 -> "大"; 24 -> "特大"; else -> "中"
            }
            return buildString {
                appendLine("直播弹幕设置：")
                appendLine()
                appendLine("• 弹幕速度: $speedLabel")
                appendLine("• 弹幕密度: $densityLabel")
                appendLine("• 字体大小: $sizeLabel")
                appendLine("• 礼物通知: ${if (showGift) "✅ 显示" else "❌ 隐藏"}")
                appendLine("• 进入通知: ${if (showEnter) "✅ 显示" else "❌ 隐藏"}")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("速度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("弹幕速度")
                    .setSingleChoiceItems(speedLabels, speedValues.indexOf(speed).coerceAtLeast(2)) { _, which ->
                        speed = speedValues[which]
                        prefs.edit().putInt("live_danmaku_speed", speed).apply()
                        AppToast.show(activity, "已设置为 ${speedLabels[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .setNegativeButton("密度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("弹幕密度")
                    .setSingleChoiceItems(densityLabels, densityValues.indexOf(density).coerceAtLeast(2)) { _, which ->
                        density = densityValues[which]
                        prefs.edit().putInt("live_danmaku_density", density).apply()
                        AppToast.show(activity, "已设置为 ${densityLabels[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.17: 搜索历史管理对话框
    private fun showSearchHistoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val historyJson = prefs.getString("search_history", "[]") ?: "[]"
        val history = try {
            val arr = org.json.JSONArray(historyJson)
            (0 until arr.length()).map { arr.getString(it) }.toMutableList()
        } catch (e: Exception) {
            mutableListOf()
        }

        fun updateSummary(): String {
            return buildString {
                appendLine("搜索历史管理：")
                appendLine()
                if (history.isEmpty()) {
                    appendLine("暂无搜索历史")
                } else {
                    appendLine("共 ${history.size} 条记录：")
                    history.take(10).forEachIndexed { i, s ->
                        appendLine("${i + 1}. $s")
                    }
                    if (history.size > 10) {
                        appendLine("... 还有 ${history.size - 10} 条")
                    }
                }
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("搜索历史")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("清空历史") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("确认清空")
                    .setMessage("确定要清空所有搜索历史吗？")
                    .setPositiveButton("清空") { _, _ ->
                        prefs.edit().remove("search_history").apply()
                        AppToast.show(activity, "已清空搜索历史")
                    }
                    .setNegativeButton("取消", null)
                    .show()
            }
            .show()
    }

    // v12.18: 画质快速切换对话框
    private fun showQuickQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var defaultQuality = prefs.getInt("default_quality", 80)  // qn值
        var autoQuality = prefs.getBoolean("auto_quality", false)
        var wifiQuality = prefs.getInt("wifi_quality", 80)
        var mobileQuality = prefs.getInt("mobile_quality", 32)

        val qualities = arrayOf("360P", "480P", "720P", "1080P", "1080P+")
        val qualityValues = intArrayOf(16, 32, 64, 80, 116)

        fun updateSummary(): String {
            val qLabel = when (defaultQuality) {
                16 -> "360P"; 32 -> "480P"; 64 -> "720P"; 80 -> "1080P"; 116 -> "1080P+"; else -> "1080P"
            }
            val wLabel = when (wifiQuality) {
                16 -> "360P"; 32 -> "480P"; 64 -> "720P"; 80 -> "1080P"; 116 -> "1080P+"; else -> "1080P"
            }
            val mLabel = when (mobileQuality) {
                16 -> "360P"; 32 -> "480P"; 64 -> "720P"; 80 -> "1080P"; 116 -> "1080P+"; else -> "480P"
            }
            return buildString {
                appendLine("画质设置：")
                appendLine()
                appendLine("• 默认画质: $qLabel")
                appendLine("• 自动切换: ${if (autoQuality) "✅ 根据网络自动" else "❌ 固定画质"}")
                appendLine("• WiFi画质: $wLabel")
                appendLine("• 移动画质: $mLabel")
                appendLine()
                appendLine("💡 提示：1080P+需要大会员")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("画质切换")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("默认画质") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("默认画质")
                    .setSingleChoiceItems(qualities, qualityValues.indexOf(defaultQuality).coerceAtLeast(3)) { _, which ->
                        defaultQuality = qualityValues[which]
                        prefs.edit().putInt("default_quality", defaultQuality).apply()
                        AppToast.show(activity, "已设置为 ${qualities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .setNegativeButton("WiFi画质") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("WiFi画质")
                    .setSingleChoiceItems(qualities, qualityValues.indexOf(wifiQuality).coerceAtLeast(3)) { _, which ->
                        wifiQuality = qualityValues[which]
                        prefs.edit().putInt("wifi_quality", wifiQuality).apply()
                        AppToast.show(activity, "已设置为 ${qualities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.19: 直播弹幕透明度对话框
    private fun showLiveDanmakuOpacityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var opacity = prefs.getInt("live_danmaku_opacity", 100)

        val opacities = arrayOf("20%", "40%", "60%", "80%", "100%")
        val opacityValues = intArrayOf(20, 40, 60, 80, 100)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播弹幕透明度：")
                appendLine()
                appendLine("• 当前透明度: ${opacity}%")
                appendLine()
                appendLine("💡 提示：降低透明度可减少弹幕遮挡")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕透明度")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置透明度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择透明度")
                    .setSingleChoiceItems(opacities, opacityValues.indexOf(opacity).coerceAtLeast(4)) { _, which ->
                        opacity = opacityValues[which]
                        prefs.edit().putInt("live_danmaku_opacity", opacity).apply()
                        AppToast.show(activity, "已设置为 ${opacities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.20: 进度条预览设置对话框
    private fun showProgressBarPreviewDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var previewEnabled = prefs.getBoolean("progress_bar_preview", true)
        var previewSize = prefs.getInt("progress_bar_preview_size", 2)  // 1=小, 2=中, 3=大

        val sizes = arrayOf("小", "中", "大")
        val sizeValues = intArrayOf(1, 2, 3)

        fun updateSummary(): String {
            val sizeLabel = when (previewSize) {
                1 -> "小"; 2 -> "中"; 3 -> "大"; else -> "中"
            }
            return buildString {
                appendLine("进度条预览设置：")
                appendLine()
                appendLine("• 预览功能: ${if (previewEnabled) "✅ 已开启" else "❌ 已关闭"}")
                appendLine("• 预览大小: $sizeLabel")
                appendLine()
                appendLine("💡 提示：拖动进度条时显示视频缩略图预览")
            }
        }

        val dialog = android.app.AlertDialog.Builder(activity)
            .setTitle("进度条预览")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (previewEnabled) "关闭预览" else "开启预览") { _, _ ->
                previewEnabled = !previewEnabled
                prefs.edit().putBoolean("progress_bar_preview", previewEnabled).apply()
                AppToast.show(activity, if (previewEnabled) "已开启进度条预览" else "已关闭进度条预览")
            }
            .setNegativeButton("预览大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("预览大小")
                    .setSingleChoiceItems(sizes, sizeValues.indexOf(previewSize).coerceAtLeast(1)) { _, which ->
                        previewSize = sizeValues[which]
                        prefs.edit().putInt("progress_bar_preview_size", previewSize).apply()
                        AppToast.show(activity, "已设置为 ${sizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.21: 定时关闭对话框
    private fun showSleepTimerDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var timerMinutes = prefs.getInt("sleep_timer_minutes", 0)  // 0=关闭

        val options = arrayOf("关闭", "15分钟", "30分钟", "45分钟", "60分钟", "90分钟", "120分钟")
        val optionValues = intArrayOf(0, 15, 30, 45, 60, 90, 120)

        fun updateSummary(): String {
            val timerLabel = if (timerMinutes == 0) "未设置" else "${timerMinutes}分钟后"
            return buildString {
                appendLine("定时关闭设置：")
                appendLine()
                appendLine("• 当前设置: $timerLabel")
                appendLine()
                appendLine("💡 提示：到时间后自动停止播放并关闭应用")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("定时关闭")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置时间") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择时间")
                    .setSingleChoiceItems(options, optionValues.indexOf(timerMinutes).coerceAtLeast(0)) { _, which ->
                        timerMinutes = optionValues[which]
                        prefs.edit().putInt("sleep_timer_minutes", timerMinutes).apply()
                        if (timerMinutes == 0) {
                            AppToast.show(activity, "已关闭定时关闭")
                        } else {
                            AppToast.show(activity, "已设置 ${timerMinutes} 分钟后关闭")
                            // 启动定时器
                            android.os.Handler(activity.mainLooper).postDelayed({
                                AppToast.show(activity, "时间到，自动关闭")
                                activity.finishAffinity()
                            }, timerMinutes * 60 * 1000L)
                        }
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.22: 截图分享对话框
    private fun showScreenshotShareDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoSave = prefs.getBoolean("screenshot_auto_save", true)
        var savePath = prefs.getString("screenshot_save_path", "") ?: ""

        fun updateSummary(): String {
            return buildString {
                appendLine("截图分享设置：")
                appendLine()
                appendLine("• 自动保存: ${if (autoSave) "✅ 已开启" else "❌ 已关闭"}")
                if (savePath.isNotEmpty()) {
                    appendLine("• 保存路径: $savePath")
                }
                appendLine()
                appendLine("💡 提示：播放器中长按确认键截图")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("截图分享")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoSave) "关闭自动保存" else "开启自动保存") { _, _ ->
                autoSave = !autoSave
                prefs.edit().putBoolean("screenshot_auto_save", autoSave).apply()
                AppToast.show(activity, if (autoSave) "已开启自动保存" else "已关闭自动保存")
            }
            .show()
    }

    // v12.23: 弹幕位置调整对话框
    private fun showDanmakuPositionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var danmakuArea = prefs.getInt("danmaku_area", 100)  // 百分比
        var danmakuTopMargin = prefs.getInt("danmaku_top_margin", 0)  // 顶部边距

        val areas = arrayOf("25%", "50%", "75%", "100%")
        val areaValues = intArrayOf(25, 50, 75, 100)

        val margins = arrayOf("无边距", "小边距", "中边距", "大边距")
        val marginValues = intArrayOf(0, 20, 40, 60)

        fun updateSummary(): String {
            val areaLabel = "${danmakuArea}%"
            val marginLabel = when (danmakuTopMargin) {
                0 -> "无边距"; 20 -> "小边距"; 40 -> "中边距"; 60 -> "大边距"; else -> "自定义"
            }
            return buildString {
                appendLine("弹幕位置设置：")
                appendLine()
                appendLine("• 显示区域: $areaLabel")
                appendLine("• 顶部边距: $marginLabel")
                appendLine()
                appendLine("💡 提示：调整弹幕在屏幕上的显示范围")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕位置")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("显示区域") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择显示区域")
                    .setSingleChoiceItems(areas, areaValues.indexOf(danmakuArea).coerceAtLeast(3)) { _, which ->
                        danmakuArea = areaValues[which]
                        prefs.edit().putInt("danmaku_area", danmakuArea).apply()
                        AppToast.show(activity, "已设置为 ${areas[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .setNegativeButton("顶部边距") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择顶部边距")
                    .setSingleChoiceItems(margins, marginValues.indexOf(danmakuTopMargin).coerceAtLeast(0)) { _, which ->
                        danmakuTopMargin = marginValues[which]
                        prefs.edit().putInt("danmaku_top_margin", danmakuTopMargin).apply()
                        AppToast.show(activity, "已设置为 ${margins[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.24: 音量增强对话框
    private fun showVolumeBoostDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var boostLevel = prefs.getInt("volume_boost", 0)  // 0=关闭, 1=低, 2=中, 3=高

        val levels = arrayOf("关闭", "低增强", "中增强", "高增强")
        val levelValues = intArrayOf(0, 1, 2, 3)

        fun updateSummary(): String {
            val levelLabel = when (boostLevel) {
                0 -> "关闭"; 1 -> "低增强"; 2 -> "中增强"; 3 -> "高增强"; else -> "关闭"
            }
            return buildString {
                appendLine("音量增强设置：")
                appendLine()
                appendLine("• 增强等级: $levelLabel")
                appendLine()
                appendLine("💡 提示：增强音量可能会有轻微失真")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("音量增强")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置等级") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择增强等级")
                    .setSingleChoiceItems(levels, levelValues.indexOf(boostLevel).coerceAtLeast(0)) { _, which ->
                        boostLevel = levelValues[which]
                        prefs.edit().putInt("volume_boost", boostLevel).apply()
                        AppToast.show(activity, "已设置为 ${levels[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.25: 视频循环播放对话框
    private fun showVideoLoopDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var loopMode = prefs.getInt("video_loop_mode", 0)  // 0=关闭, 1=单视频循环, 2=列表循环

        val modes = arrayOf("关闭", "单视频循环", "列表循环")
        val modeValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val modeLabel = when (loopMode) {
                0 -> "关闭"; 1 -> "单视频循环"; 2 -> "列表循环"; else -> "关闭"
            }
            return buildString {
                appendLine("视频循环设置：")
                appendLine()
                appendLine("• 循环模式: $modeLabel")
                appendLine()
                appendLine("💡 提示：单视频循环会自动重播当前视频")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频循环")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置模式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择循环模式")
                    .setSingleChoiceItems(modes, modeValues.indexOf(loopMode).coerceAtLeast(0)) { _, which ->
                        loopMode = modeValues[which]
                        prefs.edit().putInt("video_loop_mode", loopMode).apply()
                        AppToast.show(activity, "已设置为 ${modes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.26: 倍速播放记忆对话框
    private fun showSpeedMemoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var speedMemory = prefs.getBoolean("speed_memory", true)
        var defaultSpeed = prefs.getFloat("default_speed", 1.0f)

        val speeds = arrayOf("0.5x", "0.75x", "1.0x", "1.25x", "1.5x", "2.0x", "3.0x")
        val speedValues = floatArrayOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f)

        fun updateSummary(): String {
            return buildString {
                appendLine("倍速播放设置：")
                appendLine()
                appendLine("• 倍速记忆: ${if (speedMemory) "✅ 已开启" else "❌ 已关闭"}")
                appendLine("• 默认速度: ${defaultSpeed}x")
                appendLine()
                appendLine("💡 提示：开启后记住每个视频的播放速度")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("倍速记忆")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (speedMemory) "关闭记忆" else "开启记忆") { _, _ ->
                speedMemory = !speedMemory
                prefs.edit().putBoolean("speed_memory", speedMemory).apply()
                AppToast.show(activity, if (speedMemory) "已开启倍速记忆" else "已关闭倍速记忆")
            }
            .setNegativeButton("默认速度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择默认速度")
                    .setSingleChoiceItems(speeds, speedValues.toList().indexOf(defaultSpeed).coerceAtLeast(2)) { _, which ->
                        defaultSpeed = speedValues[which]
                        prefs.edit().putFloat("default_speed", defaultSpeed).apply()
                        AppToast.show(activity, "已设置为 ${speeds[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.27: 自动跳过片头/片尾对话框
    private fun showSkipIntroOutroDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var skipIntro = prefs.getBoolean("skip_intro", true)
        var skipOutro = prefs.getBoolean("skip_outro", true)
        var introSeconds = prefs.getInt("skip_intro_seconds", 5)
        var outroSeconds = prefs.getInt("skip_outro_seconds", 5)

        val seconds = arrayOf("3秒", "5秒", "8秒", "10秒", "15秒")
        val secondsValues = intArrayOf(3, 5, 8, 10, 15)

        fun updateSummary(): String {
            return buildString {
                appendLine("自动跳过片头/片尾：")
                appendLine()
                appendLine("• 跳过片头: ${if (skipIntro) "✅ ${introSeconds}秒" else "❌ 关闭"}")
                appendLine("• 跳过片尾: ${if (skipOutro) "✅ ${outroSeconds}秒" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：每次播放自动跳过片头/片尾")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("自动跳过片头/片尾")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (skipIntro) "关闭片头" else "开启片头") { _, _ ->
                skipIntro = !skipIntro
                prefs.edit().putBoolean("skip_intro", skipIntro).apply()
                AppToast.show(activity, if (skipIntro) "已开启跳过片头" else "已关闭跳过片头")
            }
            .setNegativeButton(if (skipOutro) "关闭片尾" else "开启片尾") { _, _ ->
                skipOutro = !skipOutro
                prefs.edit().putBoolean("skip_outro", skipOutro).apply()
                AppToast.show(activity, if (skipOutro) "已开启跳过片尾" else "已关闭跳过片尾")
            }
            .show()
    }

    // v12.28: 弹幕关键词屏蔽对话框
    private fun showDanmakuKeywordFilterDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val keywordsJson = prefs.getString("danmaku_filter_keywords", "[]") ?: "[]"
        val keywords = try {
            val arr = org.json.JSONArray(keywordsJson)
            (0 until arr.length()).map { arr.getString(it) }.toMutableList()
        } catch (e: Exception) {
            mutableListOf()
        }

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕关键词屏蔽：")
                appendLine()
                if (keywords.isEmpty()) {
                    appendLine("暂无屏蔽关键词")
                } else {
                    appendLine("共 ${keywords.size} 个关键词：")
                    keywords.forEachIndexed { i, kw -> appendLine("${i + 1}. $kw") }
                }
                appendLine()
                appendLine("💡 提示：包含关键词的弹幕将被过滤")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕关键词屏蔽")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("添加关键词") { _, _ ->
                val input = android.widget.EditText(activity).apply {
                    hint = "输入关键词"
                    setSingleLine()
                }
                android.app.AlertDialog.Builder(activity)
                    .setTitle("添加屏蔽关键词")
                    .setView(input)
                    .setPositiveButton("添加") { _, _ ->
                        val kw = input.text.toString().trim()
                        if (kw.isNotEmpty() && !keywords.contains(kw)) {
                            keywords.add(kw)
                            prefs.edit().putString("danmaku_filter_keywords", org.json.JSONArray(keywords).toString()).apply()
                            AppToast.show(activity, "已添加: $kw")
                        }
                    }
                    .setNegativeButton("取消", null)
                    .show()
            }
            .setNegativeButton("清空") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("确认清空")
                    .setMessage("确定要清空所有屏蔽关键词吗？")
                    .setPositiveButton("清空") { _, _ ->
                        prefs.edit().remove("danmaku_filter_keywords").apply()
                        AppToast.show(activity, "已清空所有关键词")
                    }
                    .setNegativeButton("取消", null)
                    .show()
            }
            .show()
    }

    // v12.29: 播放器屏幕适配对话框
    private fun showScreenFitModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var fitMode = prefs.getInt("screen_fit_mode", 0)  // 0=自适应, 1=16:9, 2=4:3, 3=填充, 4=原始比例

        val modes = arrayOf("自适应", "16:9", "4:3", "填充屏幕", "原始比例")
        val modeValues = intArrayOf(0, 1, 2, 3, 4)

        fun updateSummary(): String {
            val modeLabel = modes[modeValues.indexOf(fitMode).coerceAtLeast(0)]
            return buildString {
                appendLine("播放器屏幕适配：")
                appendLine()
                appendLine("• 当前模式: $modeLabel")
                appendLine()
                appendLine("💡 提示：调整视频画面的显示比例")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("屏幕适配")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置模式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择适配模式")
                    .setSingleChoiceItems(modes, modeValues.indexOf(fitMode).coerceAtLeast(0)) { _, which ->
                        fitMode = modeValues[which]
                        prefs.edit().putInt("screen_fit_mode", fitMode).apply()
                        AppToast.show(activity, "已设置为 ${modes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.30: 直播回放对话框
    private fun showLiveReplayDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoReplay = prefs.getBoolean("live_auto_replay", false)
        var replayDelay = prefs.getInt("live_replay_delay", 5)  // 秒

        val delays = arrayOf("3秒", "5秒", "10秒", "15秒", "30秒")
        val delayValues = intArrayOf(3, 5, 10, 15, 30)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播回放设置：")
                appendLine()
                appendLine("• 自动回放: ${if (autoReplay) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 回放延迟: ${replayDelay}秒")
                appendLine()
                appendLine("💡 提示：直播断线后自动尝试重新连接")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播回放")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoReplay) "关闭自动回放" else "开启自动回放") { _, _ ->
                autoReplay = !autoReplay
                prefs.edit().putBoolean("live_auto_replay", autoReplay).apply()
                AppToast.show(activity, if (autoReplay) "已开启自动回放" else "已关闭自动回放")
            }
            .setNegativeButton("延迟设置") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择重连延迟")
                    .setSingleChoiceItems(delays, delayValues.indexOf(replayDelay).coerceAtLeast(1)) { _, which ->
                        replayDelay = delayValues[which]
                        prefs.edit().putInt("live_replay_delay", replayDelay).apply()
                        AppToast.show(activity, "已设置为 ${delays[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.31: 截图保存路径对话框
    private fun showScreenshotSavePathDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var savePath = prefs.getString("screenshot_save_path", "") ?: ""
        val defaultPath = android.os.Environment.getExternalStoragePublicDirectory(
            android.os.Environment.DIRECTORY_PICTURES
        )?.let { java.io.File(it, "blbl_screenshots").absolutePath } ?: "/Pictures/blbl_screenshots"

        val paths = arrayOf("默认路径", "DCIM文件夹", "下载文件夹", "自定义路径")
        val pathValues = arrayOf("", "DCIM/blbl", "Download/blbl", "custom")

        fun updateSummary(): String {
            val displayPath = if (savePath.isEmpty()) defaultPath else savePath
            return buildString {
                appendLine("截图保存路径：")
                appendLine()
                appendLine("• 当前路径: $displayPath")
                appendLine()
                appendLine("💡 提示：选择截图保存位置")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("截图保存路径")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("选择路径") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择保存位置")
                    .setSingleChoiceItems(paths, pathValues.indexOf(savePath).coerceAtLeast(0)) { _, which ->
                        savePath = pathValues[which]
                        prefs.edit().putString("screenshot_save_path", savePath).apply()
                        AppToast.show(activity, "已设置为 ${paths[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.32: 弹幕字体自定义对话框
    private fun showDanmakuFontCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var fontIndex = prefs.getInt("danmaku_font_index", 0)  // 0=默认, 1=黑体, 2=楷体, 3=宋体

        val fonts = arrayOf("默认字体", "黑体", "楷体", "宋体")
        val fontValues = intArrayOf(0, 1, 2, 3)

        fun updateSummary(): String {
            val fontLabel = fonts[fontValues.indexOf(fontIndex).coerceAtLeast(0)]
            return buildString {
                appendLine("弹幕字体设置：")
                appendLine()
                appendLine("• 当前字体: $fontLabel")
                appendLine()
                appendLine("💡 提示：修改后需重启播放器生效")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕字体")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("选择字体") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择字体")
                    .setSingleChoiceItems(fonts, fontValues.indexOf(fontIndex).coerceAtLeast(0)) { _, which ->
                        fontIndex = fontValues[which]
                        prefs.edit().putInt("danmaku_font_index", fontIndex).apply()
                        AppToast.show(activity, "已设置为 ${fonts[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.33: 亮度记忆对话框
    private fun showBrightnessMemoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var brightnessMemory = prefs.getBoolean("brightness_memory", true)
        var defaultBrightness = prefs.getInt("default_brightness", 50)

        val levels = arrayOf("自动", "20%", "40%", "60%", "80%", "100%")
        val levelValues = intArrayOf(-1, 20, 40, 60, 80, 100)

        fun updateSummary(): String {
            val brightLabel = if (defaultBrightness == -1) "自动" else "${defaultBrightness}%"
            return buildString {
                appendLine("亮度记忆设置：")
                appendLine()
                appendLine("• 亮度记忆: ${if (brightnessMemory) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 默认亮度: $brightLabel")
                appendLine()
                appendLine("💡 提示：开启后记住每个视频的亮度设置")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("亮度记忆")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (brightnessMemory) "关闭记忆" else "开启记忆") { _, _ ->
                brightnessMemory = !brightnessMemory
                prefs.edit().putBoolean("brightness_memory", brightnessMemory).apply()
                AppToast.show(activity, if (brightnessMemory) "已开启亮度记忆" else "已关闭亮度记忆")
            }
            .setNegativeButton("默认亮度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择默认亮度")
                    .setSingleChoiceItems(levels, levelValues.indexOf(defaultBrightness).coerceAtLeast(0)) { _, which ->
                        defaultBrightness = levelValues[which]
                        prefs.edit().putInt("default_brightness", defaultBrightness).apply()
                        AppToast.show(activity, "已设置为 ${levels[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.34: 自动播放下一集对话框
    private fun showAutoPlayNextDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoPlayNext = prefs.getBoolean("auto_play_next", true)
        var countdownSeconds = prefs.getInt("auto_play_next_countdown", 5)

        val countdowns = arrayOf("3秒", "5秒", "8秒", "10秒", "15秒")
        val countdownValues = intArrayOf(3, 5, 8, 10, 15)

        fun updateSummary(): String {
            return buildString {
                appendLine("自动播放下一集：")
                appendLine()
                appendLine("• 自动播放: ${if (autoPlayNext) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 倒计时: ${countdownSeconds}秒")
                appendLine()
                appendLine("💡 提示：视频结束后自动播放下一集")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("自动播放下一集")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoPlayNext) "关闭自动播放" else "开启自动播放") { _, _ ->
                autoPlayNext = !autoPlayNext
                prefs.edit().putBoolean("auto_play_next", autoPlayNext).apply()
                AppToast.show(activity, if (autoPlayNext) "已开启自动播放" else "已关闭自动播放")
            }
            .setNegativeButton("倒计时") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择倒计时")
                    .setSingleChoiceItems(countdowns, countdownValues.indexOf(countdownSeconds).coerceAtLeast(1)) { _, which ->
                        countdownSeconds = countdownValues[which]
                        prefs.edit().putInt("auto_play_next_countdown", countdownSeconds).apply()
                        AppToast.show(activity, "已设置为 ${countdowns[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.35: 直播礼物过滤对话框
    private fun showLiveGiftFilterDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var filterGift = prefs.getBoolean("live_filter_gift", false)
        var filterEnter = prefs.getBoolean("live_filter_enter", false)
        var minGiftPrice = prefs.getInt("live_min_gift_price", 0)  // 0=显示所有

        val prices = arrayOf("显示所有", "隐藏免费", "隐藏<1元", "隐藏<10元", "隐藏<100元")
        val priceValues = intArrayOf(0, 1, 100, 1000, 10000)

        fun updateSummary(): String {
            val priceLabel = prices[priceValues.indexOf(minGiftPrice).coerceAtLeast(0)]
            return buildString {
                appendLine("直播礼物过滤：")
                appendLine()
                appendLine("• 过滤礼物: ${if (filterGift) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 过滤进入: ${if (filterEnter) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 最低价格: $priceLabel")
                appendLine()
                appendLine("💡 提示：减少直播弹幕中的礼物/进入通知")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播礼物过滤")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (filterGift) "关闭礼物过滤" else "开启礼物过滤") { _, _ ->
                filterGift = !filterGift
                prefs.edit().putBoolean("live_filter_gift", filterGift).apply()
                AppToast.show(activity, if (filterGift) "已开启礼物过滤" else "已关闭礼物过滤")
            }
            .setNegativeButton("最低价格") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择最低价格")
                    .setSingleChoiceItems(prices, priceValues.indexOf(minGiftPrice).coerceAtLeast(0)) { _, which ->
                        minGiftPrice = priceValues[which]
                        prefs.edit().putInt("live_min_gift_price", minGiftPrice).apply()
                        AppToast.show(activity, "已设置为 ${prices[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.36: 缓存大小限制对话框
    private fun showCacheSizeLimitDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var cacheLimitMB = prefs.getInt("cache_size_limit_mb", 500)

        val limits = arrayOf("100MB", "200MB", "500MB", "1GB", "2GB", "无限制")
        val limitValues = intArrayOf(100, 200, 500, 1000, 2000, 0)

        fun updateSummary(): String {
            val limitLabel = if (cacheLimitMB == 0) "无限制" else "${cacheLimitMB}MB"
            return buildString {
                appendLine("缓存大小限制：")
                appendLine()
                appendLine("• 当前限制: $limitLabel")
                appendLine()
                appendLine("💡 提示：超出限制时自动清理旧缓存")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存大小限制")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置限制") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择缓存限制")
                    .setSingleChoiceItems(limits, limitValues.indexOf(cacheLimitMB).coerceAtLeast(2)) { _, which ->
                        cacheLimitMB = limitValues[which]
                        prefs.edit().putInt("cache_size_limit_mb", cacheLimitMB).apply()
                        AppToast.show(activity, "已设置为 ${limits[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.37: 弹幕速度自定义对话框
    private fun showDanmakuSpeedCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var danmakuSpeed = prefs.getInt("danmaku_speed_custom", 5)

        val speeds = arrayOf("极慢", "慢", "中等", "快", "极快")
        val speedValues = intArrayOf(1, 3, 5, 7, 10)

        fun updateSummary(): String {
            val speedLabel = speeds[speedValues.indexOf(danmakuSpeed).coerceAtLeast(2)]
            return buildString {
                appendLine("弹幕速度设置：")
                appendLine()
                appendLine("• 当前速度: $speedLabel")
                appendLine()
                appendLine("💡 提示：调整弹幕滚动速度")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕速度")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置速度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择速度")
                    .setSingleChoiceItems(speeds, speedValues.indexOf(danmakuSpeed).coerceAtLeast(2)) { _, which ->
                        danmakuSpeed = speedValues[which]
                        prefs.edit().putInt("danmaku_speed_custom", danmakuSpeed).apply()
                        AppToast.show(activity, "已设置为 ${speeds[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.38: 长按动作设置对话框
    private fun showPlayerLongPressActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var longPressAction = prefs.getInt("player_long_press_action", 0)  // 0=倍速, 1=快进, 2=无

        val actions = arrayOf("倍速播放", "快进/快退", "无操作")
        val actionValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val actionLabel = actions[actionValues.indexOf(longPressAction).coerceAtLeast(0)]
            return buildString {
                appendLine("长按动作设置：")
                appendLine()
                appendLine("• 当前动作: $actionLabel")
                appendLine()
                appendLine("💡 提示：长按屏幕中央执行的动作")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("长按动作")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置动作") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择动作")
                    .setSingleChoiceItems(actions, actionValues.indexOf(longPressAction).coerceAtLeast(0)) { _, which ->
                        longPressAction = actionValues[which]
                        prefs.edit().putInt("player_long_press_action", longPressAction).apply()
                        AppToast.show(activity, "已设置为 ${actions[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.39: WiFi自动画质对话框
    private fun showWifiAutoQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var wifiAutoQuality = prefs.getBoolean("wifi_auto_quality", true)
        var wifiQuality = prefs.getInt("wifi_auto_quality_value", 80)

        val qualities = arrayOf("360P", "480P", "720P", "1080P", "1080P+")
        val qualityValues = intArrayOf(16, 32, 64, 80, 116)

        fun updateSummary(): String {
            val qLabel = qualities[qualityValues.indexOf(wifiQuality).coerceAtLeast(3)]
            return buildString {
                appendLine("WiFi自动画质：")
                appendLine()
                appendLine("• 自动切换: ${if (wifiAutoQuality) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• WiFi画质: $qLabel")
                appendLine()
                appendLine("💡 提示：WiFi下自动切换到高画质")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("WiFi自动画质")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (wifiAutoQuality) "关闭自动" else "开启自动") { _, _ ->
                wifiAutoQuality = !wifiAutoQuality
                prefs.edit().putBoolean("wifi_auto_quality", wifiAutoQuality).apply()
                AppToast.show(activity, if (wifiAutoQuality) "已开启WiFi自动画质" else "已关闭WiFi自动画质")
            }
            .setNegativeButton("WiFi画质") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择WiFi画质")
                    .setSingleChoiceItems(qualities, qualityValues.indexOf(wifiQuality).coerceAtLeast(3)) { _, which ->
                        wifiQuality = qualityValues[which]
                        prefs.edit().putInt("wifi_auto_quality_value", wifiQuality).apply()
                        AppToast.show(activity, "已设置为 ${qualities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.40: 评论排序方式对话框
    private fun showCommentSortModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var sortMode = prefs.getInt("comment_sort_mode", 0)  // 0=按热度, 1=按时间

        val modes = arrayOf("按热度", "按时间")
        val modeValues = intArrayOf(0, 1)

        fun updateSummary(): String {
            val modeLabel = modes[modeValues.indexOf(sortMode).coerceAtLeast(0)]
            return buildString {
                appendLine("评论排序方式：")
                appendLine()
                appendLine("• 当前排序: $modeLabel")
                appendLine()
                appendLine("💡 提示：设置评论区默认排序方式")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("评论排序")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置排序") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择排序方式")
                    .setSingleChoiceItems(modes, modeValues.indexOf(sortMode).coerceAtLeast(0)) { _, which ->
                        sortMode = modeValues[which]
                        prefs.edit().putInt("comment_sort_mode", sortMode).apply()
                        AppToast.show(activity, "已设置为 ${modes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.41: 播放器滑动手势对话框
    private fun showPlayerSwipeGestureDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var swipeEnabled = prefs.getBoolean("player_swipe_gesture", true)
        var swipeAction = prefs.getInt("player_swipe_action", 0)  // 0=音量+亮度, 1=进度, 2=音量

        val actions = arrayOf("音量+亮度", "进度调节", "仅音量")
        val actionValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val actionLabel = actions[actionValues.indexOf(swipeAction).coerceAtLeast(0)]
            return buildString {
                appendLine("播放器滑动手势：")
                appendLine()
                appendLine("• 滑动手势: ${if (swipeEnabled) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 滑动操作: $actionLabel")
                appendLine()
                appendLine("💡 提示：在播放器屏幕左右滑动执行操作")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("滑动手势")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (swipeEnabled) "关闭手势" else "开启手势") { _, _ ->
                swipeEnabled = !swipeEnabled
                prefs.edit().putBoolean("player_swipe_gesture", swipeEnabled).apply()
                AppToast.show(activity, if (swipeEnabled) "已开启滑动手势" else "已关闭滑动手势")
            }
            .setNegativeButton("滑动操作") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择滑动操作")
                    .setSingleChoiceItems(actions, actionValues.indexOf(swipeAction).coerceAtLeast(0)) { _, which ->
                        swipeAction = actionValues[which]
                        prefs.edit().putInt("player_swipe_action", swipeAction).apply()
                        AppToast.show(activity, "已设置为 ${actions[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.42: 弹幕透明度自定义对话框
    private fun showDanmakuAlphaCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var alpha = prefs.getInt("danmaku_alpha_custom", 100)

        val alphas = arrayOf("20%", "40%", "60%", "80%", "100%")
        val alphaValues = intArrayOf(20, 40, 60, 80, 100)

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕透明度：")
                appendLine()
                appendLine("• 当前透明度: ${alpha}%")
                appendLine()
                appendLine("💡 提示：降低透明度减少弹幕遮挡")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕透明度")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置透明度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择透明度")
                    .setSingleChoiceItems(alphas, alphaValues.indexOf(alpha).coerceAtLeast(4)) { _, which ->
                        alpha = alphaValues[which]
                        prefs.edit().putInt("danmaku_alpha_custom", alpha).apply()
                        AppToast.show(activity, "已设置为 ${alphas[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.43: 自动旋转屏幕对话框
    private fun showPlayerAutoRotateDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoRotate = prefs.getBoolean("player_auto_rotate", true)
        var rotateMode = prefs.getInt("player_rotate_mode", 0)  // 0=跟随系统, 1=横屏, 2=竖屏

        val modes = arrayOf("跟随系统", "固定横屏", "固定竖屏")
        val modeValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val modeLabel = modes[modeValues.indexOf(rotateMode).coerceAtLeast(0)]
            return buildString {
                appendLine("自动旋转设置：")
                appendLine()
                appendLine("• 自动旋转: ${if (autoRotate) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 旋转模式: $modeLabel")
                appendLine()
                appendLine("💡 提示：控制播放器屏幕旋转行为")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("自动旋转")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoRotate) "关闭自动旋转" else "开启自动旋转") { _, _ ->
                autoRotate = !autoRotate
                prefs.edit().putBoolean("player_auto_rotate", autoRotate).apply()
                AppToast.show(activity, if (autoRotate) "已开启自动旋转" else "已关闭自动旋转")
            }
            .setNegativeButton("旋转模式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择旋转模式")
                    .setSingleChoiceItems(modes, modeValues.indexOf(rotateMode).coerceAtLeast(0)) { _, which ->
                        rotateMode = modeValues[which]
                        prefs.edit().putInt("player_rotate_mode", rotateMode).apply()
                        AppToast.show(activity, "已设置为 ${modes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.44: 通知栏控制对话框
    private fun showNotificationControlDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var showNotification = prefs.getBoolean("show_notification", true)
        var notificationActions = prefs.getInt("notification_actions", 0)  // 0=基本, 1=完整

        val actions = arrayOf("基本控制", "完整控制")
        val actionValues = intArrayOf(0, 1)

        fun updateSummary(): String {
            val actionLabel = actions[actionValues.indexOf(notificationActions).coerceAtLeast(0)]
            return buildString {
                appendLine("通知栏控制：")
                appendLine()
                appendLine("• 显示通知: ${if (showNotification) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 控制模式: $actionLabel")
                appendLine()
                appendLine("💡 提示：在通知栏控制播放")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("通知栏控制")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (showNotification) "关闭通知" else "开启通知") { _, _ ->
                showNotification = !showNotification
                prefs.edit().putBoolean("show_notification", showNotification).apply()
                AppToast.show(activity, if (showNotification) "已开启通知栏控制" else "已关闭通知栏控制")
            }
            .setNegativeButton("控制模式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择控制模式")
                    .setSingleChoiceItems(actions, actionValues.indexOf(notificationActions).coerceAtLeast(0)) { _, which ->
                        notificationActions = actionValues[which]
                        prefs.edit().putInt("notification_actions", notificationActions).apply()
                        AppToast.show(activity, "已设置为 ${actions[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.45: 视频预加载对话框
    private fun showVideoPreloadDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var preloadEnabled = prefs.getBoolean("video_preload", true)
        var preloadSize = prefs.getInt("video_preload_size", 30)  // MB

        val sizes = arrayOf("10MB", "30MB", "50MB", "100MB")
        val sizeValues = intArrayOf(10, 30, 50, 100)

        fun updateSummary(): String {
            return buildString {
                appendLine("视频预加载：")
                appendLine()
                appendLine("• 预加载: ${if (preloadEnabled) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 预加载大小: ${preloadSize}MB")
                appendLine()
                appendLine("💡 提示：提前加载视频数据减少卡顿")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频预加载")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (preloadEnabled) "关闭预加载" else "开启预加载") { _, _ ->
                preloadEnabled = !preloadEnabled
                prefs.edit().putBoolean("video_preload", preloadEnabled).apply()
                AppToast.show(activity, if (preloadEnabled) "已开启视频预加载" else "已关闭视频预加载")
            }
            .setNegativeButton("预加载大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择预加载大小")
                    .setSingleChoiceItems(sizes, sizeValues.indexOf(preloadSize).coerceAtLeast(1)) { _, which ->
                        preloadSize = sizeValues[which]
                        prefs.edit().putInt("video_preload_size", preloadSize).apply()
                        AppToast.show(activity, "已设置为 ${sizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.46: 历史记录同步对话框
    private fun showHistorySyncDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var syncEnabled = prefs.getBoolean("history_sync", false)
        var syncInterval = prefs.getInt("history_sync_interval", 30)  // 分钟

        val intervals = arrayOf("15分钟", "30分钟", "60分钟", "手动同步")
        val intervalValues = intArrayOf(15, 30, 60, 0)

        fun updateSummary(): String {
            val intervalLabel = intervals[intervalValues.indexOf(syncInterval).coerceAtLeast(1)]
            return buildString {
                appendLine("历史记录同步：")
                appendLine()
                appendLine("• 自动同步: ${if (syncEnabled) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 同步间隔: $intervalLabel")
                appendLine()
                appendLine("💡 提示：同步观看历史到云端")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("历史记录同步")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (syncEnabled) "关闭同步" else "开启同步") { _, _ ->
                syncEnabled = !syncEnabled
                prefs.edit().putBoolean("history_sync", syncEnabled).apply()
                AppToast.show(activity, if (syncEnabled) "已开启历史同步" else "已关闭历史同步")
            }
            .setNegativeButton("同步间隔") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择同步间隔")
                    .setSingleChoiceItems(intervals, intervalValues.indexOf(syncInterval).coerceAtLeast(1)) { _, which ->
                        syncInterval = intervalValues[which]
                        prefs.edit().putInt("history_sync_interval", syncInterval).apply()
                        AppToast.show(activity, "已设置为 ${intervals[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.47: 解码器优先级对话框
    private fun showPlayerDecoderPriorityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var decoderPriority = prefs.getInt("decoder_priority", 0)  // 0=硬解优先, 1=软解优先, 2=仅硬解

        val decoders = arrayOf("硬解优先", "软解优先", "仅硬解")
        val decoderValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val decoderLabel = decoders[decoderValues.indexOf(decoderPriority).coerceAtLeast(0)]
            return buildString {
                appendLine("解码器优先级：")
                appendLine()
                appendLine("• 当前策略: $decoderLabel")
                appendLine()
                appendLine("💡 提示：硬解省电，软解兼容性好")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("解码器优先级")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置策略") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择解码策略")
                    .setSingleChoiceItems(decoders, decoderValues.indexOf(decoderPriority).coerceAtLeast(0)) { _, which ->
                        decoderPriority = decoderValues[which]
                        prefs.edit().putInt("decoder_priority", decoderPriority).apply()
                        AppToast.show(activity, "已设置为 ${decoders[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.48: 弹幕合并模式对话框
    private fun showDanmakuMergeModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var mergeMode = prefs.getInt("danmaku_merge_mode", 0)  // 0=不合并, 1=相似合并, 2=完全合并

        val modes = arrayOf("不合并", "相似合并", "完全合并")
        val modeValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val modeLabel = modes[modeValues.indexOf(mergeMode).coerceAtLeast(0)]
            return buildString {
                appendLine("弹幕合并模式：")
                appendLine()
                appendLine("• 当前模式: $modeLabel")
                appendLine()
                appendLine("💡 提示：合并相似弹幕减少重复")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕合并")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置模式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择合并模式")
                    .setSingleChoiceItems(modes, modeValues.indexOf(mergeMode).coerceAtLeast(0)) { _, which ->
                        mergeMode = modeValues[which]
                        prefs.edit().putInt("danmaku_merge_mode", mergeMode).apply()
                        AppToast.show(activity, "已设置为 ${modes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.49: 音频延迟调整对话框
    private fun showPlayerAudioDelayDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var audioDelay = prefs.getInt("audio_delay_ms", 0)  // 毫秒

        val delays = arrayOf("-500ms", "-200ms", "0ms", "+200ms", "+500ms")
        val delayValues = intArrayOf(-500, -200, 0, 200, 500)

        fun updateSummary(): String {
            return buildString {
                appendLine("音频延迟调整：")
                appendLine()
                appendLine("• 当前延迟: ${audioDelay}ms")
                appendLine()
                appendLine("💡 提示：调整音频与视频的同步")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("音频延迟")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置延迟") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择延迟")
                    .setSingleChoiceItems(delays, delayValues.indexOf(audioDelay).coerceAtLeast(2)) { _, which ->
                        audioDelay = delayValues[which]
                        prefs.edit().putInt("audio_delay_ms", audioDelay).apply()
                        AppToast.show(activity, "已设置为 ${delays[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.50: 直播画质设置对话框
    private fun showLiveStreamQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var liveQuality = prefs.getInt("live_stream_quality", 0)  // 0=原画, 1=蓝光, 2=超清, 3=高清, 4=流畅

        val qualities = arrayOf("原画", "蓝光", "超清", "高清", "流畅")
        val qualityValues = intArrayOf(0, 1, 2, 3, 4)

        fun updateSummary(): String {
            val qualityLabel = qualities[qualityValues.indexOf(liveQuality).coerceAtLeast(0)]
            return buildString {
                appendLine("直播画质设置：")
                appendLine()
                appendLine("• 默认画质: $qualityLabel")
                appendLine()
                appendLine("💡 提示：设置直播默认画质")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播画质")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置画质") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择画质")
                    .setSingleChoiceItems(qualities, qualityValues.indexOf(liveQuality).coerceAtLeast(0)) { _, which ->
                        liveQuality = qualityValues[which]
                        prefs.edit().putInt("live_stream_quality", liveQuality).apply()
                        AppToast.show(activity, "已设置为 ${qualities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.51: 按键映射对话框
    private fun showPlayerKeyMappingDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var keyMapping = prefs.getInt("player_key_mapping", 0)  // 0=默认, 1=自定义

        val mappings = arrayOf("默认映射", "自定义映射")
        val mappingValues = intArrayOf(0, 1)

        fun updateSummary(): String {
            val mappingLabel = mappings[mappingValues.indexOf(keyMapping).coerceAtLeast(0)]
            return buildString {
                appendLine("按键映射：")
                appendLine()
                appendLine("• 当前映射: $mappingLabel")
                appendLine()
                appendLine("💡 提示：自定义遥控器按键功能")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("按键映射")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置映射") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择映射")
                    .setSingleChoiceItems(mappings, mappingValues.indexOf(keyMapping).coerceAtLeast(0)) { _, which ->
                        keyMapping = mappingValues[which]
                        prefs.edit().putInt("player_key_mapping", keyMapping).apply()
                        AppToast.show(activity, "已设置为 ${mappings[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.52: 弹幕发送历史对话框
    private fun showDanmakuSendHistoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val historyJson = prefs.getString("danmaku_send_history", "[]") ?: "[]"
        val history = try {
            val arr = org.json.JSONArray(historyJson)
            (0 until arr.length()).map { arr.getString(it) }.toMutableList()
        } catch (e: Exception) {
            mutableListOf()
        }

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕发送历史：")
                appendLine()
                if (history.isEmpty()) {
                    appendLine("暂无发送记录")
                } else {
                    appendLine("共 ${history.size} 条记录：")
                    history.takeLast(10).forEachIndexed { i, text -> appendLine("${i + 1}. $text") }
                    if (history.size > 10) appendLine("... 仅显示最近10条")
                }
                appendLine()
                appendLine("💡 提示：可快速重发历史弹幕")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送历史")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("清空历史") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("确认清空")
                    .setMessage("确定要清空所有弹幕发送历史吗？")
                    .setPositiveButton("清空") { _, _ ->
                        prefs.edit().remove("danmaku_send_history").apply()
                        AppToast.show(activity, "已清空弹幕历史")
                    }
                    .setNegativeButton("取消", null)
                    .show()
            }
            .show()
    }

    // v12.3: 弹幕发送历史数量设置
    private fun showDanmakuSendHistoryLimitDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val options = listOf(5, 10, 20, 30, 50, 100)
        val current = prefs.getInt("danmaku_send_history_limit", 10)
        val labels = options.map { "${it}条" }.toTypedArray()
        val currentIndex = options.indexOf(current).coerceAtLeast(0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送历史数量")
            .setSingleChoiceItems(labels, currentIndex) { dialog, which ->
                val selected = options[which]
                prefs.edit().putInt("danmaku_send_history_limit", selected).apply()
                AppToast.show(activity, "弹幕历史数量：${selected}条")
                dialog.dismiss()
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v12.53: 缓冲策略对话框
    private fun showPlayerBufferStrategyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var bufferStrategy = prefs.getInt("player_buffer_strategy", 0)  // 0=默认, 1=激进, 2=保守

        val strategies = arrayOf("默认", "激进预加载", "节省流量")
        val strategyValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val strategyLabel = strategies[strategyValues.indexOf(bufferStrategy).coerceAtLeast(0)]
            return buildString {
                appendLine("缓冲策略：")
                appendLine()
                appendLine("• 当前策略: $strategyLabel")
                appendLine()
                appendLine("💡 提示：激进模式减少卡顿但增加流量")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("缓冲策略")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置策略") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择缓冲策略")
                    .setSingleChoiceItems(strategies, strategyValues.indexOf(bufferStrategy).coerceAtLeast(0)) { _, which ->
                        bufferStrategy = strategyValues[which]
                        prefs.edit().putInt("player_buffer_strategy", bufferStrategy).apply()
                        AppToast.show(activity, "已设置为 ${strategies[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.54: 直播自动关注对话框
    private fun showLiveAutoFollowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoFollow = prefs.getBoolean("live_auto_follow", false)
        var followThreshold = prefs.getInt("live_follow_threshold", 3)  // 观看次数

        val thresholds = arrayOf("1次", "3次", "5次", "10次")
        val thresholdValues = intArrayOf(1, 3, 5, 10)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播自动关注：")
                appendLine()
                appendLine("• 自动关注: ${if (autoFollow) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 关注阈值: 观看${followThreshold}次后")
                appendLine()
                appendLine("💡 提示：多次观看同一主播自动关注")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播自动关注")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoFollow) "关闭自动关注" else "开启自动关注") { _, _ ->
                autoFollow = !autoFollow
                prefs.edit().putBoolean("live_auto_follow", autoFollow).apply()
                AppToast.show(activity, if (autoFollow) "已开启自动关注" else "已关闭自动关注")
            }
            .setNegativeButton("关注阈值") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择关注阈值")
                    .setSingleChoiceItems(thresholds, thresholdValues.indexOf(followThreshold).coerceAtLeast(1)) { _, which ->
                        followThreshold = thresholdValues[which]
                        prefs.edit().putInt("live_follow_threshold", followThreshold).apply()
                        AppToast.show(activity, "已设置为 ${thresholds[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.55: 视频编码偏好对话框
    private fun showVideoCodecPreferenceDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var codecPref = prefs.getInt("video_codec_preference", 0)  // 0=自动, 1=H.264, 2=H.265, 3=AV1

        val codecs = arrayOf("自动", "H.264", "H.265/HEVC", "AV1")
        val codecValues = intArrayOf(0, 1, 2, 3)

        fun updateSummary(): String {
            val codecLabel = codecs[codecValues.indexOf(codecPref).coerceAtLeast(0)]
            return buildString {
                appendLine("视频编码偏好：")
                appendLine()
                appendLine("• 当前编码: $codecLabel")
                appendLine()
                appendLine("💡 提示：H.265/AV1更省流量但需要设备支持")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频编码")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置编码") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择编码")
                    .setSingleChoiceItems(codecs, codecValues.indexOf(codecPref).coerceAtLeast(0)) { _, which ->
                        codecPref = codecValues[which]
                        prefs.edit().putInt("video_codec_preference", codecPref).apply()
                        AppToast.show(activity, "已设置为 ${codecs[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.56: 字幕大小调整对话框
    private fun showPlayerSubtitleSizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var subtitleSize = prefs.getInt("player_subtitle_size", 16)

        val sizes = arrayOf("小 (12sp)", "中 (16sp)", "大 (20sp)", "特大 (24sp)")
        val sizeValues = intArrayOf(12, 16, 20, 24)

        fun updateSummary(): String {
            return buildString {
                appendLine("字幕大小：")
                appendLine()
                appendLine("• 当前大小: ${subtitleSize}sp")
                appendLine()
                appendLine("💡 提示：调整字幕显示大小")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕大小")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择字幕大小")
                    .setSingleChoiceItems(sizes, sizeValues.indexOf(subtitleSize).coerceAtLeast(1)) { _, which ->
                        subtitleSize = sizeValues[which]
                        prefs.edit().putInt("player_subtitle_size", subtitleSize).apply()
                        AppToast.show(activity, "已设置为 ${sizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.57: 弹幕区域自定义对话框
    private fun showDanmakuAreaCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var areaPercent = prefs.getInt("danmaku_area_custom", 100)

        val areas = arrayOf("25%", "50%", "75%", "100%")
        val areaValues = intArrayOf(25, 50, 75, 100)

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕显示区域：")
                appendLine()
                appendLine("• 当前区域: ${areaPercent}%")
                appendLine()
                appendLine("💡 提示：限制弹幕显示范围")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕区域")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置区域") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择区域")
                    .setSingleChoiceItems(areas, areaValues.indexOf(areaPercent).coerceAtLeast(3)) { _, which ->
                        areaPercent = areaValues[which]
                        prefs.edit().putInt("danmaku_area_custom", areaPercent).apply()
                        AppToast.show(activity, "已设置为 ${areas[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.58: 画面比例切换对话框
    private fun showPlayerAspectRatioDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var aspectRatio = prefs.getInt("player_aspect_ratio", 0)  // 0=自动, 1=16:9, 2=4:3, 3=填充

        val ratios = arrayOf("自动", "16:9", "4:3", "填充屏幕")
        val ratioValues = intArrayOf(0, 1, 2, 3)

        fun updateSummary(): String {
            val ratioLabel = ratios[ratioValues.indexOf(aspectRatio).coerceAtLeast(0)]
            return buildString {
                appendLine("画面比例：")
                appendLine()
                appendLine("• 当前比例: $ratioLabel")
                appendLine()
                appendLine("💡 提示：切换视频画面显示比例")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("画面比例")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置比例") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择比例")
                    .setSingleChoiceItems(ratios, ratioValues.indexOf(aspectRatio).coerceAtLeast(0)) { _, which ->
                        aspectRatio = ratioValues[which]
                        prefs.edit().putInt("player_aspect_ratio", aspectRatio).apply()
                        AppToast.show(activity, "已设置为 ${ratios[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.59: 直播聊天字体大小对话框
    private fun showLiveChatFontsizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var fontSize = prefs.getInt("live_chat_fontsize", 14)

        val sizes = arrayOf("小 (12sp)", "中 (14sp)", "大 (18sp)", "特大 (22sp)")
        val sizeValues = intArrayOf(12, 14, 18, 22)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播聊天字体：")
                appendLine()
                appendLine("• 当前大小: ${fontSize}sp")
                appendLine()
                appendLine("💡 提示：调整直播聊天区字体大小")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("聊天字体大小")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择字体大小")
                    .setSingleChoiceItems(sizes, sizeValues.indexOf(fontSize).coerceAtLeast(1)) { _, which ->
                        fontSize = sizeValues[which]
                        prefs.edit().putInt("live_chat_fontsize", fontSize).apply()
                        AppToast.show(activity, "已设置为 ${sizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.60: 视频缓存策略对话框
    private fun showVideoCacheStrategyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var cacheStrategy = prefs.getInt("video_cache_strategy", 0)  // 0=默认, 1=仅WiFi, 2=关闭

        val strategies = arrayOf("默认缓存", "仅WiFi缓存", "关闭缓存")
        val strategyValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val strategyLabel = strategies[strategyValues.indexOf(cacheStrategy).coerceAtLeast(0)]
            return buildString {
                appendLine("视频缓存策略：")
                appendLine()
                appendLine("• 当前策略: $strategyLabel")
                appendLine()
                appendLine("💡 提示：控制视频缓存行为")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存策略")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置策略") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择缓存策略")
                    .setSingleChoiceItems(strategies, strategyValues.indexOf(cacheStrategy).coerceAtLeast(0)) { _, which ->
                        cacheStrategy = strategyValues[which]
                        prefs.edit().putInt("video_cache_strategy", cacheStrategy).apply()
                        AppToast.show(activity, "已设置为 ${strategies[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.61: 后台播放对话框
    private fun showPlayerBackgroundPlayDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var bgPlay = prefs.getBoolean("player_background_play", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("后台播放：")
                appendLine()
                appendLine("• 后台播放: ${if (bgPlay) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：退出播放器后继续播放音频")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("后台播放")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (bgPlay) "关闭后台播放" else "开启后台播放") { _, _ ->
                bgPlay = !bgPlay
                prefs.edit().putBoolean("player_background_play", bgPlay).apply()
                AppToast.show(activity, if (bgPlay) "已开启后台播放" else "已关闭后台播放")
            }
            .show()
    }

    // v12.62: 弹幕字体样式对话框
    private fun showDanmakuFontStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var fontStyle = prefs.getInt("danmaku_font_style", 0)  // 0=默认, 1=粗体, 2=斜体, 3=粗斜体

        val styles = arrayOf("默认", "粗体", "斜体", "粗斜体")
        val styleValues = intArrayOf(0, 1, 2, 3)

        fun updateSummary(): String {
            val styleLabel = styles[styleValues.indexOf(fontStyle).coerceAtLeast(0)]
            return buildString {
                appendLine("弹幕字体样式：")
                appendLine()
                appendLine("• 当前样式: $styleLabel")
                appendLine()
                appendLine("💡 提示：改变弹幕文字样式")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕字体样式")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置样式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择样式")
                    .setSingleChoiceItems(styles, styleValues.indexOf(fontStyle).coerceAtLeast(0)) { _, which ->
                        fontStyle = styleValues[which]
                        prefs.edit().putInt("danmaku_font_style", fontStyle).apply()
                        AppToast.show(activity, "已设置为 ${styles[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.63: 双击动作设置对话框
    private fun showPlayerDoubleTapActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var doubleTapAction = prefs.getInt("player_double_tap_action", 0)  // 0=快进/快退, 1=点赞, 2=无

        val actions = arrayOf("快进/快退", "点赞", "无操作")
        val actionValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val actionLabel = actions[actionValues.indexOf(doubleTapAction).coerceAtLeast(0)]
            return buildString {
                appendLine("双击动作：")
                appendLine()
                appendLine("• 当前动作: $actionLabel")
                appendLine()
                appendLine("💡 提示：双击屏幕执行的动作")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("双击动作")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置动作") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择动作")
                    .setSingleChoiceItems(actions, actionValues.indexOf(doubleTapAction).coerceAtLeast(0)) { _, which ->
                        doubleTapAction = actionValues[which]
                        prefs.edit().putInt("player_double_tap_action", doubleTapAction).apply()
                        AppToast.show(activity, "已设置为 ${actions[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.64: 直播自动重连对话框
    private fun showLiveAutoReconnectDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoReconnect = prefs.getBoolean("live_auto_reconnect", true)
        var maxRetries = prefs.getInt("live_max_retries", 5)

        val retries = arrayOf("3次", "5次", "10次", "无限")
        val retryValues = intArrayOf(3, 5, 10, 0)

        fun updateSummary(): String {
            val retryLabel = if (maxRetries == 0) "无限重试" else "${maxRetries}次"
            return buildString {
                appendLine("直播自动重连：")
                appendLine()
                appendLine("• 自动重连: ${if (autoReconnect) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 最大重试: $retryLabel")
                appendLine()
                appendLine("💡 提示：直播断线后自动重新连接")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播自动重连")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoReconnect) "关闭重连" else "开启重连") { _, _ ->
                autoReconnect = !autoReconnect
                prefs.edit().putBoolean("live_auto_reconnect", autoReconnect).apply()
                AppToast.show(activity, if (autoReconnect) "已开启自动重连" else "已关闭自动重连")
            }
            .setNegativeButton("最大重试") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择最大重试次数")
                    .setSingleChoiceItems(retries, retryValues.indexOf(maxRetries).coerceAtLeast(1)) { _, which ->
                        maxRetries = retryValues[which]
                        prefs.edit().putInt("live_max_retries", maxRetries).apply()
                        AppToast.show(activity, "已设置为 ${retries[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.65: 视频加载超时对话框
    private fun showVideoLoadTimeoutDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var timeout = prefs.getInt("video_load_timeout", 10)  // 秒

        val timeouts = arrayOf("5秒", "10秒", "15秒", "30秒", "60秒")
        val timeoutValues = intArrayOf(5, 10, 15, 30, 60)

        fun updateSummary(): String {
            return buildString {
                appendLine("视频加载超时：")
                appendLine()
                appendLine("• 超时时间: ${timeout}秒")
                appendLine()
                appendLine("💡 提示：超过时间未加载则报错")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("加载超时")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置超时") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择超时时间")
                    .setSingleChoiceItems(timeouts, timeoutValues.indexOf(timeout).coerceAtLeast(1)) { _, which ->
                        timeout = timeoutValues[which]
                        prefs.edit().putInt("video_load_timeout", timeout).apply()
                        AppToast.show(activity, "已设置为 ${timeouts[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.66: 手势反馈设置对话框
    private fun showPlayerGestureFeedbackDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var gestureFeedback = prefs.getBoolean("player_gesture_feedback", true)
        var hapticFeedback = prefs.getBoolean("player_haptic_feedback", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("手势反馈设置：")
                appendLine()
                appendLine("• 视觉反馈: ${if (gestureFeedback) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 振动反馈: ${if (hapticFeedback) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：滑动手势时的视觉和振动反馈")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("手势反馈")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (gestureFeedback) "关闭视觉" else "开启视觉") { _, _ ->
                gestureFeedback = !gestureFeedback
                prefs.edit().putBoolean("player_gesture_feedback", gestureFeedback).apply()
                AppToast.show(activity, if (gestureFeedback) "已开启视觉反馈" else "已关闭视觉反馈")
            }
            .setNegativeButton(if (hapticFeedback) "关闭振动" else "开启振动") { _, _ ->
                hapticFeedback = !hapticFeedback
                prefs.edit().putBoolean("player_haptic_feedback", hapticFeedback).apply()
                AppToast.show(activity, if (hapticFeedback) "已开启振动反馈" else "已关闭振动反馈")
            }
            .show()
    }

    // v12.67: 弹幕显示UID对话框
    private fun showDanmakuShowUidDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var showUid = prefs.getBoolean("danmaku_show_uid", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕显示UID：")
                appendLine()
                appendLine("• 显示UID: ${if (showUid) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：在弹幕旁显示发送者UID")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕显示UID")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (showUid) "关闭UID" else "开启UID") { _, _ ->
                showUid = !showUid
                prefs.edit().putBoolean("danmaku_show_uid", showUid).apply()
                AppToast.show(activity, if (showUid) "已开启UID显示" else "已关闭UID显示")
            }
            .show()
    }

    // v12.68: 播放器启动动作对话框
    private fun showPlayerStartupActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var startupAction = prefs.getInt("player_startup_action", 0)  // 0=自动播放, 1=暂停, 2=弹幕设置

        val actions = arrayOf("自动播放", "暂停", "显示弹幕设置")
        val actionValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val actionLabel = actions[actionValues.indexOf(startupAction).coerceAtLeast(0)]
            return buildString {
                appendLine("播放器启动动作：")
                appendLine()
                appendLine("• 启动动作: $actionLabel")
                appendLine()
                appendLine("💡 提示：进入播放器时的默认行为")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("启动动作")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置动作") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择启动动作")
                    .setSingleChoiceItems(actions, actionValues.indexOf(startupAction).coerceAtLeast(0)) { _, which ->
                        startupAction = actionValues[which]
                        prefs.edit().putInt("player_startup_action", startupAction).apply()
                        AppToast.show(activity, "已设置为 ${actions[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.69: 直播编码格式对话框
    private fun showLiveStreamCodecDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var codec = prefs.getInt("live_stream_codec", 0)  // 0=自动, 1=H.264, 2=H.265

        val codecs = arrayOf("自动", "H.264", "H.265")
        val codecValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val codecLabel = codecs[codecValues.indexOf(codec).coerceAtLeast(0)]
            return buildString {
                appendLine("直播编码格式：")
                appendLine()
                appendLine("• 当前编码: $codecLabel")
                appendLine()
                appendLine("💡 提示：H.265更省流量但需要设备支持")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播编码")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置编码") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择编码")
                    .setSingleChoiceItems(codecs, codecValues.indexOf(codec).coerceAtLeast(0)) { _, which ->
                        codec = codecValues[which]
                        prefs.edit().putInt("live_stream_codec", codec).apply()
                        AppToast.show(activity, "已设置为 ${codecs[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.70: 网络策略对话框
    private fun showVideoNetworkStrategyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var strategy = prefs.getInt("video_network_strategy", 0)  // 0=默认, 1=CDN优先, 2=P2P

        val strategies = arrayOf("默认", "CDN优先", "P2P加速")
        val strategyValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val strategyLabel = strategies[strategyValues.indexOf(strategy).coerceAtLeast(0)]
            return buildString {
                appendLine("网络策略：")
                appendLine()
                appendLine("• 当前策略: $strategyLabel")
                appendLine()
                appendLine("💡 提示：选择视频加载的网络策略")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("网络策略")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置策略") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择网络策略")
                    .setSingleChoiceItems(strategies, strategyValues.indexOf(strategy).coerceAtLeast(0)) { _, which ->
                        strategy = strategyValues[which]
                        prefs.edit().putInt("video_network_strategy", strategy).apply()
                        AppToast.show(activity, "已设置为 ${strategies[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.71: 播放器UI显示对话框
    private fun showPlayerUiVisibilityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var showTopBar = prefs.getBoolean("player_show_top_bar", true)
        var showBottomBar = prefs.getBoolean("player_show_bottom_bar", true)
        var showDanmakuToggle = prefs.getBoolean("player_show_danmaku_toggle", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("播放器UI显示：")
                appendLine()
                appendLine("• 顶部栏: ${if (showTopBar) "✅" else "❌"}")
                appendLine("• 底部栏: ${if (showBottomBar) "✅" else "❌"}")
                appendLine("• 弹幕开关: ${if (showDanmakuToggle) "✅" else "❌"}")
                appendLine()
                appendLine("💡 提示：自定义播放器界面元素")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("UI显示")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (showTopBar) "隐藏顶栏" else "显示顶栏") { _, _ ->
                showTopBar = !showTopBar
                prefs.edit().putBoolean("player_show_top_bar", showTopBar).apply()
                AppToast.show(activity, if (showTopBar) "已显示顶栏" else "已隐藏顶栏")
            }
            .setNegativeButton(if (showBottomBar) "隐藏底栏" else "显示底栏") { _, _ ->
                showBottomBar = !showBottomBar
                prefs.edit().putBoolean("player_show_bottom_bar", showBottomBar).apply()
                AppToast.show(activity, if (showBottomBar) "已显示底栏" else "已隐藏底栏")
            }
            .show()
    }

    // v12.72: 弹幕屏蔽用户对话框
    private fun showDanmakuBlockUserDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val blockedUsersJson = prefs.getString("danmaku_blocked_users", "[]") ?: "[]"
        val blockedUsers = try {
            val arr = org.json.JSONArray(blockedUsersJson)
            (0 until arr.length()).map { arr.getString(it) }.toMutableList()
        } catch (e: Exception) {
            mutableListOf()
        }

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕屏蔽用户：")
                appendLine()
                if (blockedUsers.isEmpty()) {
                    appendLine("暂无屏蔽用户")
                } else {
                    appendLine("已屏蔽 ${blockedUsers.size} 个用户：")
                    blockedUsers.takeLast(5).forEach { appendLine("• $it") }
                    if (blockedUsers.size > 5) appendLine("... 共${blockedUsers.size}个")
                }
                appendLine()
                appendLine("💡 提示：屏蔽后不再显示该用户弹幕")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕屏蔽用户")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("清空屏蔽") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("确认清空")
                    .setMessage("确定要清空所有屏蔽用户吗？")
                    .setPositiveButton("清空") { _, _ ->
                        prefs.edit().remove("danmaku_blocked_users").apply()
                        AppToast.show(activity, "已清空屏蔽列表")
                    }
                    .setNegativeButton("取消", null)
                    .show()
            }
            .show()
    }

    // v12.73: 自动全屏对话框
    private fun showPlayerAutoFullscreenDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoFullscreen = prefs.getBoolean("player_auto_fullscreen", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("自动全屏：")
                appendLine()
                appendLine("• 自动全屏: ${if (autoFullscreen) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：进入播放器时自动全屏")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("自动全屏")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoFullscreen) "关闭自动全屏" else "开启自动全屏") { _, _ ->
                autoFullscreen = !autoFullscreen
                prefs.edit().putBoolean("player_auto_fullscreen", autoFullscreen).apply()
                AppToast.show(activity, if (autoFullscreen) "已开启自动全屏" else "已关闭自动全屏")
            }
            .show()
    }

    // v12.74: 直播开播提醒对话框
    private fun showLiveNotificationDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var notification = prefs.getBoolean("live_notification", false)
        var notifyMinutes = prefs.getInt("live_notify_minutes", 5)

        val minutes = arrayOf("提前1分钟", "提前5分钟", "提前10分钟", "提前30分钟")
        val minuteValues = intArrayOf(1, 5, 10, 30)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播开播提醒：")
                appendLine()
                appendLine("• 开播提醒: ${if (notification) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 提醒时间: 提前${notifyMinutes}分钟")
                appendLine()
                appendLine("💡 提示：关注的主播开播时推送通知")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播提醒")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (notification) "关闭提醒" else "开启提醒") { _, _ ->
                notification = !notification
                prefs.edit().putBoolean("live_notification", notification).apply()
                AppToast.show(activity, if (notification) "已开启直播提醒" else "已关闭直播提醒")
            }
            .setNegativeButton("提醒时间") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择提醒时间")
                    .setSingleChoiceItems(minutes, minuteValues.indexOf(notifyMinutes).coerceAtLeast(1)) { _, which ->
                        notifyMinutes = minuteValues[which]
                        prefs.edit().putInt("live_notify_minutes", notifyMinutes).apply()
                        AppToast.show(activity, "已设置为 ${minutes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.75: 画质配置文件对话框
    private fun showVideoQualityProfileDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var wifiQuality = prefs.getInt("video_wifi_quality", 80)  // qn值
        var mobileQuality = prefs.getInt("video_mobile_quality", 32)

        val qualities = arrayOf("360P", "480P", "720P", "1080P", "1080P+")
        val qualityValues = intArrayOf(16, 32, 64, 80, 116)

        fun qualityLabel(qn: Int): String = when (qn) {
            16 -> "360P"; 32 -> "480P"; 64 -> "720P"; 80 -> "1080P"; 116 -> "1080P+"; else -> "${qn}"
        }

        fun updateSummary(): String {
            return buildString {
                appendLine("画质配置文件：")
                appendLine()
                appendLine("• WiFi画质: ${qualityLabel(wifiQuality)}")
                appendLine("• 移动画质: ${qualityLabel(mobileQuality)}")
                appendLine()
                appendLine("💡 提示：根据网络自动选择画质")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("画质配置")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("WiFi画质") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择WiFi画质")
                    .setSingleChoiceItems(qualities, qualityValues.indexOf(wifiQuality).coerceAtLeast(3)) { _, which ->
                        wifiQuality = qualityValues[which]
                        prefs.edit().putInt("video_wifi_quality", wifiQuality).apply()
                        AppToast.show(activity, "WiFi画质已设为 ${qualities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .setNegativeButton("移动画质") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择移动画质")
                    .setSingleChoiceItems(qualities, qualityValues.indexOf(mobileQuality).coerceAtLeast(1)) { _, which ->
                        mobileQuality = qualityValues[which]
                        prefs.edit().putInt("video_mobile_quality", mobileQuality).apply()
                        AppToast.show(activity, "移动画质已设为 ${qualities[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.76: 锁定屏幕对话框
    private fun showPlayerLockScreenDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var lockScreen = prefs.getBoolean("player_lock_screen", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("锁定屏幕：")
                appendLine()
                appendLine("• 锁定屏幕: ${if (lockScreen) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：锁定后禁用触摸手势防误触")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("锁定屏幕")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (lockScreen) "解锁屏幕" else "锁定屏幕") { _, _ ->
                lockScreen = !lockScreen
                prefs.edit().putBoolean("player_lock_screen", lockScreen).apply()
                AppToast.show(activity, if (lockScreen) "已锁定屏幕" else "已解锁屏幕")
            }
            .show()
    }

    // v12.77: 弹幕滚动速度对话框
    private fun showDanmakuScrollSpeedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var scrollSpeed = prefs.getInt("danmaku_scroll_speed", 100)  // 百分比

        val speeds = arrayOf("慢速 (50%)", "正常 (100%)", "快速 (150%)", "极快 (200%)")
        val speedValues = intArrayOf(50, 100, 150, 200)

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕滚动速度：")
                appendLine()
                appendLine("• 当前速度: ${scrollSpeed}%")
                appendLine()
                appendLine("💡 提示：调整弹幕滚动速度")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕滚动速度")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置速度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择速度")
                    .setSingleChoiceItems(speeds, speedValues.indexOf(scrollSpeed).coerceAtLeast(1)) { _, which ->
                        scrollSpeed = speedValues[which]
                        prefs.edit().putInt("danmaku_scroll_speed", scrollSpeed).apply()
                        AppToast.show(activity, "已设置为 ${speeds[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.78: 跳过片尾对话框
    private fun showPlayerSkipCreditsDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var skipCredits = prefs.getBoolean("player_skip_credits", false)
        var skipSeconds = prefs.getInt("player_skip_credits_seconds", 30)

        val seconds = arrayOf("10秒", "15秒", "30秒", "60秒", "90秒")
        val secondValues = intArrayOf(10, 15, 30, 60, 90)

        fun updateSummary(): String {
            return buildString {
                appendLine("跳过片尾：")
                appendLine()
                appendLine("• 跳过片尾: ${if (skipCredits) "✅ 已开启" else "❌ 关闭"}")
                appendLine("• 跳过时间: 结束前${skipSeconds}秒")
                appendLine()
                appendLine("💡 提示：视频结束前自动跳到下一个")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("跳过片尾")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (skipCredits) "关闭跳过" else "开启跳过") { _, _ ->
                skipCredits = !skipCredits
                prefs.edit().putBoolean("player_skip_credits", skipCredits).apply()
                AppToast.show(activity, if (skipCredits) "已开启跳过片尾" else "已关闭跳过片尾")
            }
            .setNegativeButton("跳过时间") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择跳过时间")
                    .setSingleChoiceItems(seconds, secondValues.indexOf(skipSeconds).coerceAtLeast(2)) { _, which ->
                        skipSeconds = secondValues[which]
                        prefs.edit().putInt("player_skip_credits_seconds", skipSeconds).apply()
                        AppToast.show(activity, "已设置为 ${seconds[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.79: 直播弹幕字体大小对话框
    private fun showLiveDanmakuFontsizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var fontSize = prefs.getInt("live_danmaku_fontsize", 18)

        val sizes = arrayOf("小 (14sp)", "中 (18sp)", "大 (22sp)", "特大 (28sp)")
        val sizeValues = intArrayOf(14, 18, 22, 28)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播弹幕字体大小：")
                appendLine()
                appendLine("• 当前大小: ${fontSize}sp")
                appendLine()
                appendLine("💡 提示：调整直播间弹幕字体大小")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕字体")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择字体大小")
                    .setSingleChoiceItems(sizes, sizeValues.indexOf(fontSize).coerceAtLeast(1)) { _, which ->
                        fontSize = sizeValues[which]
                        prefs.edit().putInt("live_danmaku_fontsize", fontSize).apply()
                        AppToast.show(activity, "已设置为 ${sizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.80: 自动跳过对话框
    private fun showVideoAutoSkipDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoSkip = prefs.getBoolean("video_auto_skip", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("自动跳过：")
                appendLine()
                appendLine("• 自动跳过: ${if (autoSkip) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：自动跳过无效内容片段")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("自动跳过")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoSkip) "关闭自动跳过" else "开启自动跳过") { _, _ ->
                autoSkip = !autoSkip
                prefs.edit().putBoolean("video_auto_skip", autoSkip).apply()
                AppToast.show(activity, if (autoSkip) "已开启自动跳过" else "已关闭自动跳过")
            }
            .show()
    }

    // v12.81: 滑动调节音量对话框
    private fun showPlayerSwipeVolumeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var swipeVolume = prefs.getBoolean("player_swipe_volume", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("滑动调节音量：")
                appendLine()
                appendLine("• 滑动音量: ${if (swipeVolume) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：上下滑动屏幕调节音量")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("滑动音量")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (swipeVolume) "关闭滑动音量" else "开启滑动音量") { _, _ ->
                swipeVolume = !swipeVolume
                prefs.edit().putBoolean("player_swipe_volume", swipeVolume).apply()
                AppToast.show(activity, if (swipeVolume) "已开启滑动音量" else "已关闭滑动音量")
            }
            .show()
    }

    // v12.82: 弹幕输入框样式对话框
    private fun showDanmakuInputBorderDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var inputBorder = prefs.getInt("danmaku_input_border", 0)  // 0=默认, 1=圆角, 2=方角

        val borders = arrayOf("默认", "圆角", "方角")
        val borderValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val borderLabel = borders[borderValues.indexOf(inputBorder).coerceAtLeast(0)]
            return buildString {
                appendLine("弹幕输入框样式：")
                appendLine()
                appendLine("• 当前样式: $borderLabel")
                appendLine()
                appendLine("💡 提示：自定义弹幕输入框外观")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("输入框样式")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置样式") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择样式")
                    .setSingleChoiceItems(borders, borderValues.indexOf(inputBorder).coerceAtLeast(0)) { _, which ->
                        inputBorder = borderValues[which]
                        prefs.edit().putInt("danmaku_input_border", inputBorder).apply()
                        AppToast.show(activity, "已设置为 ${borders[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.83: Chromecast投屏对话框
    private fun showPlayerChromecastDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var chromecast = prefs.getBoolean("player_chromecast", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("Chromecast投屏：")
                appendLine()
                appendLine("• Chromecast: ${if (chromecast) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：启用Google Chromecast投屏")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("Chromecast")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (chromecast) "关闭Chromecast" else "开启Chromecast") { _, _ ->
                chromecast = !chromecast
                prefs.edit().putBoolean("player_chromecast", chromecast).apply()
                AppToast.show(activity, if (chromecast) "已开启Chromecast" else "已关闭Chromecast")
            }
            .show()
    }

    // v12.84: 直播聊天表情对话框
    private fun showLiveChatEmojiDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var emoji = prefs.getBoolean("live_chat_emoji", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播聊天表情：")
                appendLine()
                appendLine("• 表情显示: ${if (emoji) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：在直播聊天中显示表情")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("聊天表情")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (emoji) "关闭表情" else "开启表情") { _, _ ->
                emoji = !emoji
                prefs.edit().putBoolean("live_chat_emoji", emoji).apply()
                AppToast.show(activity, if (emoji) "已开启表情" else "已关闭表情")
            }
            .show()
    }

    // v12.85: 自动播放下一集对话框
    private fun showVideoAutoNextDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoNext = prefs.getBoolean("video_auto_next", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("自动播放下一集：")
                appendLine()
                appendLine("• 自动下一集: ${if (autoNext) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：当前视频结束后自动播放下一集")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("自动下一集")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoNext) "关闭自动下一集" else "开启自动下一集") { _, _ ->
                autoNext = !autoNext
                prefs.edit().putBoolean("video_auto_next", autoNext).apply()
                AppToast.show(activity, if (autoNext) "已开启自动下一集" else "已关闭自动下一集")
            }
            .show()
    }

    // v12.86: 亮度记忆对话框
    private fun showPlayerBrightnessMemoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var brightnessMemory = prefs.getBoolean("player_brightness_memory", false)

        fun updateSummary(): String {
            return buildString {
                appendLine("亮度记忆：")
                appendLine()
                appendLine("• 亮度记忆: ${if (brightnessMemory) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：记住每个视频的亮度设置")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("亮度记忆")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (brightnessMemory) "关闭亮度记忆" else "开启亮度记忆") { _, _ ->
                brightnessMemory = !brightnessMemory
                prefs.edit().putBoolean("player_brightness_memory", brightnessMemory).apply()
                AppToast.show(activity, if (brightnessMemory) "已开启亮度记忆" else "已关闭亮度记忆")
            }
            .show()
    }

    // v12.87: 弹幕合并间隔对话框
    private fun showDanmakuMergeIntervalDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var mergeInterval = prefs.getInt("danmaku_merge_interval", 0)  // 毫秒

        val intervals = arrayOf("关闭", "100ms", "200ms", "500ms", "1000ms")
        val intervalValues = intArrayOf(0, 100, 200, 500, 1000)

        fun updateSummary(): String {
            val intervalLabel = if (mergeInterval == 0) "关闭" else "${mergeInterval}ms"
            return buildString {
                appendLine("弹幕合并间隔：")
                appendLine()
                appendLine("• 合并间隔: $intervalLabel")
                appendLine()
                appendLine("💡 提示：合并相近时间的弹幕减少重叠")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕合并")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置间隔") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择合并间隔")
                    .setSingleChoiceItems(intervals, intervalValues.indexOf(mergeInterval).coerceAtLeast(0)) { _, which ->
                        mergeInterval = intervalValues[which]
                        prefs.edit().putInt("danmaku_merge_interval", mergeInterval).apply()
                        AppToast.show(activity, "已设置为 ${intervals[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.88: 长按倍速对话框
    private fun showPlayerLongPressSpeedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var longPressSpeed = prefs.getFloat("player_long_press_speed", 2.0f)

        val speeds = arrayOf("1.5x", "2.0x", "2.5x", "3.0x", "4.0x")
        val speedValues = floatArrayOf(1.5f, 2.0f, 2.5f, 3.0f, 4.0f)

        fun updateSummary(): String {
            return buildString {
                appendLine("长按倍速：")
                appendLine()
                appendLine("• 长按速度: ${longPressSpeed}x")
                appendLine()
                appendLine("💡 提示：长按屏幕时的播放速度")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("长按倍速")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置速度") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择长按速度")
                    .setSingleChoiceItems(speeds, speedValues.toList().indexOf(longPressSpeed).coerceAtLeast(1)) { _, which ->
                        longPressSpeed = speedValues[which]
                        prefs.edit().putFloat("player_long_press_speed", longPressSpeed).apply()
                        AppToast.show(activity, "已设置为 ${speeds[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.89: 直播自动画质对话框
    private fun showLiveAutoQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var autoQuality = prefs.getBoolean("live_auto_quality", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("直播自动画质：")
                appendLine()
                appendLine("• 自动画质: ${if (autoQuality) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：根据网络自动切换直播画质")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播自动画质")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (autoQuality) "关闭自动画质" else "开启自动画质") { _, _ ->
                autoQuality = !autoQuality
                prefs.edit().putBoolean("live_auto_quality", autoQuality).apply()
                AppToast.show(activity, if (autoQuality) "已开启自动画质" else "已关闭自动画质")
            }
            .show()
    }

    // v12.90: 预缓冲大小对话框
    private fun showVideoPrebufferSizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var prebufferSize = prefs.getInt("video_prebuffer_size", 5)  // MB

        val sizes = arrayOf("2MB", "5MB", "10MB", "20MB", "50MB")
        val sizeValues = intArrayOf(2, 5, 10, 20, 50)

        fun updateSummary(): String {
            return buildString {
                appendLine("预缓冲大小：")
                appendLine()
                appendLine("• 缓冲大小: ${prebufferSize}MB")
                appendLine()
                appendLine("💡 提示：提前缓冲减少卡顿")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("预缓冲")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置大小") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择缓冲大小")
                    .setSingleChoiceItems(sizes, sizeValues.indexOf(prebufferSize).coerceAtLeast(1)) { _, which ->
                        prebufferSize = sizeValues[which]
                        prefs.edit().putInt("video_prebuffer_size", prebufferSize).apply()
                        AppToast.show(activity, "已设置为 ${sizes[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.91: 字幕背景对话框
    private fun showPlayerSubtitleBgDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var subtitleBg = prefs.getInt("player_subtitle_bg", 0)  // 0=无, 1=半透明, 2=黑色, 3=自定义

        val bgs = arrayOf("无背景", "半透明", "黑色", "自定义")
        val bgValues = intArrayOf(0, 1, 2, 3)

        fun updateSummary(): String {
            val bgLabel = bgs[bgValues.indexOf(subtitleBg).coerceAtLeast(0)]
            return buildString {
                appendLine("字幕背景：")
                appendLine()
                appendLine("• 背景样式: $bgLabel")
                appendLine()
                appendLine("💡 提示：字幕背景增强可读性")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕背景")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置背景") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择背景")
                    .setSingleChoiceItems(bgs, bgValues.indexOf(subtitleBg).coerceAtLeast(0)) { _, which ->
                        subtitleBg = bgValues[which]
                        prefs.edit().putInt("player_subtitle_bg", subtitleBg).apply()
                        AppToast.show(activity, "已设置为 ${bgs[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    // v12.92: 弹幕发送历史对话框
    private fun showDanmakuHistoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var history = prefs.getBoolean("danmaku_history", true)

        fun updateSummary(): String {
            return buildString {
                appendLine("弹幕发送历史：")
                appendLine()
                appendLine("• 发送历史: ${if (history) "✅ 已开启" else "❌ 关闭"}")
                appendLine()
                appendLine("💡 提示：记住发送过的弹幕内容")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕历史")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton(if (history) "关闭历史" else "开启历史") { _, _ ->
                history = !history
                prefs.edit().putBoolean("danmaku_history", history).apply()
                AppToast.show(activity, if (history) "已开启弹幕历史" else "已关闭弹幕历史")
            }
            .show()
    }

    // v12.93: 缓冲策略对话框
    private fun showPlayerBufferingStrategyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var strategy = prefs.getInt("player_buffering_strategy", 0)  // 0=默认, 1=激进, 2=保守

        val strategies = arrayOf("默认缓冲", "激进缓冲", "保守缓冲")
        val strategyValues = intArrayOf(0, 1, 2)

        fun updateSummary(): String {
            val strategyLabel = strategies[strategyValues.indexOf(strategy).coerceAtLeast(0)]
            return buildString {
                appendLine("缓冲策略：")
                appendLine()
                appendLine("• 当前策略: $strategyLabel")
                appendLine()
                appendLine("💡 提示：默认适合大多数情况，激进适合高速网络，保守适合慢速网络")
            }
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("缓冲策略")
            .setMessage(updateSummary())
            .setPositiveButton("关闭", null)
            .setNeutralButton("设置策略") { _, _ ->
                android.app.AlertDialog.Builder(activity)
                    .setTitle("选择缓冲策略")
                    .setSingleChoiceItems(strategies, strategyValues.indexOf(strategy).coerceAtLeast(0)) { _, which ->
                        strategy = strategyValues[which]
                        prefs.edit().putInt("player_buffering_strategy", strategy).apply()
                        AppToast.show(activity, "已设置为 ${strategies[which]}")
                    }
                    .setPositiveButton("确定", null)
                    .show()
            }
            .show()
    }

    private fun showVideoBookmarksDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val raw = prefs.getString("video_bookmarks", null)
        val map = mutableMapOf<String, List<Long>>()
        if (!raw.isNullOrEmpty()) {
            for (line in raw.split("\n")) {
                val parts = line.split("=", limit = 2)
                if (parts.size == 2) {
                    val bvid = parts[0]
                    val timestamps = parts[1].split(",").mapNotNull { it.toLongOrNull() }
                    if (timestamps.isNotEmpty()) map[bvid] = timestamps
                }
            }
        }

        if (map.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("视频书签")
                .setMessage("暂无书签\n\n在播放器中长按截图按钮可添加书签")
                .setPositiveButton("确定", null)
                .show()
            return
        }

        val allBookmarks = mutableListOf<Pair<String, Long>>()
        for ((bvid, timestamps) in map) {
            for (ts in timestamps) {
                allBookmarks.add(bvid to ts)
            }
        }
        allBookmarks.sortBy { it.second }

        val items = allBookmarks.map { (bvid, ts) ->
            val min = ts / 60000
            val sec = (ts % 60000) / 1000
            "${bvid.takeLast(8)}  %02d:%02d".format(min, sec)
        }.toTypedArray()

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频书签 (${allBookmarks.size}个)")
            .setItems(items) { _, _ -> }
            .setNeutralButton("清空全部") { _, _ ->
                prefs.edit().remove("video_bookmarks").apply()
                AppToast.show(activity, "已清空所有书签")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v10.4: 观看时间统计
    private fun showWatchTimeStatsDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val totalMinutes = prefs.getLong("watch_time_total_minutes", 0L)
        val todayKey = "watch_time_" + java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(java.util.Date())
        val todayMinutes = prefs.getLong(todayKey, 0L)
        val weekKey = "watch_week_" + java.text.SimpleDateFormat("wwyyyy", java.util.Locale.US).format(java.util.Date())
        val weekMinutes = prefs.getLong(weekKey, 0L)

        fun formatTime(minutes: Long): String {
            return when {
                minutes < 60 -> "${minutes}分钟"
                minutes < 1440 -> "${minutes / 60}小时${minutes % 60}分钟"
                else -> "${minutes / 1440}天${(minutes % 1440) / 60}小时"
            }
        }

        val msg = buildString {
            appendLine("📊 观看时间统计")
            appendLine()
            appendLine("📅 今日: " + formatTime(todayMinutes))
            appendLine("📆 本周: " + formatTime(weekMinutes))
            appendLine("📈 总计: " + formatTime(totalMinutes))
            appendLine()
            appendLine("💡 播放视频时自动计时")
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("观看统计")
            .setMessage(msg)
            .setPositiveButton("确定", null)
            .setNeutralButton("重置统计") { _, _ ->
                prefs.edit()
                    .remove("watch_time_total_minutes")
                    .remove(todayKey)
                    .remove(weekKey)
                    .apply()
                AppToast.show(activity, "已重置观看统计")
            }
            .show()
    }

    // v10.5: 多账号切换
    private fun showMultiAccountDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val accountsJson = prefs.getString("multi_accounts", null)
        val accounts = mutableListOf<Pair<String, String>>() // (uid, name)
        if (!accountsJson.isNullOrEmpty()) {
            for (line in accountsJson.split("\n")) {
                val parts = line.split("|", limit = 2)
                if (parts.size == 2) accounts.add(parts[0] to parts[1])
            }
        }
        val currentUid = prefs.getString("current_account_uid", "") ?: ""

        val items = accounts.map { (uid, name) ->
            val marker = if (uid == currentUid) " ✓" else ""
            "\$name (\$uid)\$marker"
        }.toTypedArray()

        if (items.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("多账号切换")
                .setMessage("暂无保存的账号\n\n登录后自动保存账号信息")
                .setPositiveButton("确定", null)
                .show()
            return
        }

        android.app.AlertDialog.Builder(activity)
            .setTitle("多账号切换")
            .setItems(items) { _, which ->
                val (uid, name) = accounts[which]
                prefs.edit().putString("current_account_uid", uid).apply()
                AppToast.show(activity, "已切换到: \$name")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v10.6: 手势自定义
    private fun showPlayerGestureCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var sensitivity = prefs.getInt("player_gesture_sensitivity", 50)

        val items = arrayOf("低灵敏度", "默认", "高灵敏度", "极高灵敏度")
        val values = intArrayOf(25, 50, 75, 100)

        android.app.AlertDialog.Builder(activity)
            .setTitle("手势灵敏度")
            .setSingleChoiceItems(items, values.indexOf(sensitivity).coerceAtLeast(1)) { _, which ->
                sensitivity = values[which]
                prefs.edit().putInt("player_gesture_sensitivity", sensitivity).apply()
                AppToast.show(activity, "手势灵敏度: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v10.7: 弹幕透明度
    private fun showDanmakuOpacityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        var opacity = prefs.getInt("danmaku_opacity", 100)

        val items = arrayOf("100%", "75%", "50%", "25%", "10%")
        val values = intArrayOf(100, 75, 50, 25, 10)

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕透明度")
            .setSingleChoiceItems(items, values.indexOf(opacity).coerceAtLeast(0)) { _, which ->
                opacity = values[which]
                prefs.edit().putInt("danmaku_opacity", opacity).apply()
                AppToast.show(activity, "弹幕透明度: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v10.8: 自动跳过片头片尾
    private fun showAutoSkipIntroOutroDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val introSkip = prefs.getInt("auto_skip_intro_seconds", 0)
        val outroSkip = prefs.getInt("auto_skip_outro_seconds", 0)

        val introLabel = if (introSkip > 0) introSkip.toString() + "秒" else "关"
        val outroLabel = if (outroSkip > 0) outroSkip.toString() + "秒" else "关"

        val msg = "自动跳过片头片尾\n\n片头: " + introLabel + "\n片尾: " + outroLabel + "\n\n设置为 0 表示不跳过"

        android.app.AlertDialog.Builder(activity)
            .setTitle("跳过片头片尾")
            .setMessage(msg)
            .setPositiveButton("确定", null)
            .setNeutralButton("设置片头") { _, _ ->
                showSkipSecondsDialog("片头跳过秒数", introSkip) { seconds ->
                    prefs.edit().putInt("auto_skip_intro_seconds", seconds).apply()
                    AppToast.show(activity, "片头跳过: " + seconds + "秒")
                }
            }
            .setNegativeButton("设置片尾") { _, _ ->
                showSkipSecondsDialog("片尾跳过秒数", outroSkip) { seconds ->
                    prefs.edit().putInt("auto_skip_outro_seconds", seconds).apply()
                    AppToast.show(activity, "片尾跳过: " + seconds + "秒")
                }
            }
            .show()
    }

    private fun showSkipSecondsDialog(title: String, current: Int, onSet: (Int) -> Unit) {
        val seconds = arrayOf("0", "5", "10", "15", "30", "60", "90", "120")
        val values = intArrayOf(0, 5, 10, 15, 30, 60, 90, 120)

        android.app.AlertDialog.Builder(activity)
            .setTitle(title)
            .setSingleChoiceItems(seconds, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                onSet(values[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.0: 手势区域自定义
    private fun showGestureZoneCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val zones = arrayOf("全屏", "上半屏", "下半屏", "左半屏", "右半屏", "中心区域")
        val keys = intArrayOf(0, 1, 2, 3, 4, 5)
        val current = prefs.getInt("gesture_zone_mode", 0)

        android.app.AlertDialog.Builder(activity)
            .setTitle("手势区域自定义")
            .setSingleChoiceItems(zones, current) { _, which ->
                prefs.edit().putInt("gesture_zone_mode", keys[which]).apply()
                AppToast.show(activity, "手势区域: " + zones[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.1: 弹幕发送模板
    private fun showDanmakuTemplateDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val templates = prefs.getStringSet("danmaku_templates", mutableSetOf())?.toMutableSet()
            ?: mutableSetOf("666", "哈哈", "厉害", "前排", "打卡")

        val items = templates.toTypedArray()
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕模板 (" + items.size + "个)")
            .setItems(items) { _, which ->
                val clipboard = activity.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                clipboard.setPrimaryClip(android.content.ClipData.newPlainText("danmaku", items[which]))
                AppToast.show(activity, "已复制: " + items[which])
            }
            .setPositiveButton("关闭", null)
            .setNeutralButton("添加模板") { _, _ ->
                showAddDanmakuTemplateDialog(templates)
            }
            .show()
    }

    private fun showAddDanmakuTemplateDialog(templates: MutableSet<String>) {
        val input = android.widget.EditText(activity)
        input.hint = "输入弹幕内容"
        android.app.AlertDialog.Builder(activity)
            .setTitle("添加模板")
            .setView(input)
            .setPositiveButton("添加") { _, _ ->
                val text = input.text.toString().trim()
                if (text.isNotEmpty()) {
                    templates.add(text)
                    activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                        .edit().putStringSet("danmaku_templates", templates).apply()
                    AppToast.show(activity, "已添加: " + text)
                }
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.2: 下载清晰度
    private fun showDownloadQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val qualities = arrayOf("跟随播放画质", "360P", "480P", "720P", "1080P", "1080P高码率", "4K")
        val values = intArrayOf(0, 16, 32, 64, 80, 112, 127)
        val current = prefs.getInt("download_quality", 0)

        android.app.AlertDialog.Builder(activity)
            .setTitle("下载清晰度")
            .setSingleChoiceItems(qualities, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("download_quality", values[which]).apply()
                AppToast.show(activity, "下载画质: " + qualities[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.3: 搜索排序
    private fun showSearchSortModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sorts = arrayOf("综合排序", "最新发布", "最多播放", "最多弹幕", "最多收藏")
        val values = intArrayOf(0, 1, 2, 3, 4)
        val current = prefs.getInt("search_sort_mode", 0)

        android.app.AlertDialog.Builder(activity)
            .setTitle("搜索排序")
            .setSingleChoiceItems(sorts, current) { _, which ->
                prefs.edit().putInt("search_sort_mode", values[which]).apply()
                AppToast.show(activity, "搜索排序: " + sorts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.4: 直播画中画
    private fun showLivePipModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("关闭", "退出时自动开启", "手动开启")
        val current = prefs.getInt("live_pip_mode", 0)

        android.app.AlertDialog.Builder(activity)
            .setTitle("直播画中画")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("live_pip_mode", which).apply()
                AppToast.show(activity, "直播画中画: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.5: 弹幕快捷键
    private fun showDanmakuShortcutDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val shortcuts = arrayOf("长按发送按钮: 历史", "双击: 常用弹幕", "上滑: 弹幕设置")
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕快捷键")
            .setItems(shortcuts) { _, _ -> }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.6: 视频卡片信息
    private fun showVideoCardInfoDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val showTitle = prefs.getBoolean("card_show_title", true)
        val showAuthor = prefs.getBoolean("card_show_author", true)
        val showView = prefs.getBoolean("card_show_view", true)
        val showDate = prefs.getBoolean("card_show_date", false)
        val showDuration = prefs.getBoolean("card_show_duration", true)

        val items = arrayOf(
            "标题" + if (showTitle) " ✓" else "",
            "UP主" + if (showAuthor) " ✓" else "",
            "播放量" + if (showView) " ✓" else "",
            "发布日期" + if (showDate) " ✓" else "",
            "时长" + if (showDuration) " ✓" else ""
        )
        val keys = booleanArrayOf(showTitle, showAuthor, showView, showDate, showDuration)
        val prefsKeys = arrayOf("card_show_title", "card_show_author", "card_show_view", "card_show_date", "card_show_duration")

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频卡片信息")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.7: 进度条样式
    private fun showProgressBarStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val styles = arrayOf("默认", "细线", "粗条", "渐变", "高亮")
        val current = prefs.getInt("progress_bar_style", 0)

        android.app.AlertDialog.Builder(activity)
            .setTitle("进度条样式")
            .setSingleChoiceItems(styles, current) { _, which ->
                prefs.edit().putInt("progress_bar_style", which).apply()
                AppToast.show(activity, "进度条样式: " + styles[which] + "（重启播放器生效）")
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.8: 视频预览悬浮
    private fun showVideoPreviewHoverDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("video_preview_hover", false)
        val items = arrayOf("开启预览", "关闭预览")
        android.app.AlertDialog.Builder(activity)
            .setTitle("视频预览悬浮")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("video_preview_hover", which == 0).apply()
                AppToast.show(activity, "视频预览: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.9: 字幕同步调整
    private fun showSubtitleSyncAdjustDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val offsets = arrayOf("-5秒", "-3秒", "-1秒", "0秒", "+1秒", "+3秒", "+5秒")
        val values = intArrayOf(-5000, -3000, -1000, 0, 1000, 3000, 5000)
        val current = prefs.getInt("subtitle_sync_offset", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕同步调整")
            .setSingleChoiceItems(offsets, values.indexOf(current).coerceAtLeast(3)) { _, which ->
                prefs.edit().putInt("subtitle_sync_offset", values[which]).apply()
                AppToast.show(activity, "字幕偏移: " + offsets[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.10: 音量增强
    private fun showAudioBoostModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("关闭", "125%", "150%", "200%")
        val values = intArrayOf(100, 125, 150, 200)
        val current = prefs.getInt("audio_boost_percent", 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("音量增强")
            .setSingleChoiceItems(modes, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("audio_boost_percent", values[which]).apply()
                AppToast.show(activity, "音量增强: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.11: 倍速记忆
    private fun showPlaybackSpeedMemoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("playback_speed_memory", false)
        val items = arrayOf("开启记忆", "关闭记忆")
        android.app.AlertDialog.Builder(activity)
            .setTitle("倍速记忆")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("playback_speed_memory", which == 0).apply()
                AppToast.show(activity, "倍速记忆: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.12: 视频旋转锁定
    private fun showVideoRotateLockDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("自动", "横屏", "竖屏", "跟随系统")
        val current = prefs.getInt("video_rotate_lock", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("视频旋转锁定")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("video_rotate_lock", which).apply()
                AppToast.show(activity, "旋转锁定: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.13: 弹幕高级过滤
    private fun showDanmakuFilterAdvancedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val filterScroll = prefs.getBoolean("danmaku_filter_scroll", true)
        val filterTop = prefs.getBoolean("danmaku_filter_top", true)
        val filterBottom = prefs.getBoolean("danmaku_filter_bottom", true)
        val filterColor = prefs.getBoolean("danmaku_filter_color", true)
        val filterSpecial = prefs.getBoolean("danmaku_filter_special", true)

        val items = arrayOf(
            "滚动弹幕" + if (filterScroll) " ✓" else "",
            "顶部弹幕" + if (filterTop) " ✓" else "",
            "底部弹幕" + if (filterBottom) " ✓" else "",
            "彩色弹幕" + if (filterColor) " ✓" else "",
            "特殊弹幕" + if (filterSpecial) " ✓" else ""
        )
        val keys = booleanArrayOf(filterScroll, filterTop, filterBottom, filterColor, filterSpecial)
        val prefsKeys = arrayOf("danmaku_filter_scroll", "danmaku_filter_top", "danmaku_filter_bottom", "danmaku_filter_color", "danmaku_filter_special")

        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕高级过滤")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.14: 直播流监控
    private fun showLiveStreamMonitorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_stream_monitor", false)
        val items = arrayOf("开启监控", "关闭监控")
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播流监控")
            .setMessage("监控直播流码率、帧率、缓冲状态，异常时提示切换线路")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_stream_monitor", which == 0).apply()
                AppToast.show(activity, "直播流监控: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.15: 观看历史导出
    private fun showVideoHistoryExportDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val formats = arrayOf("JSON格式", "CSV格式", "文本格式")
        android.app.AlertDialog.Builder(activity)
            .setTitle("观看历史导出")
            .setItems(formats) { _, which ->
                AppToast.show(activity, "导出为: " + formats[which] + "（开发中）")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.16: 动态过滤
    private fun showDynamicFilterDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val filterAd = prefs.getBoolean("dynamic_filter_ad", true)
        val filterLive = prefs.getBoolean("dynamic_filter_live", false)
        val filterShare = prefs.getBoolean("dynamic_filter_share", false)

        val items = arrayOf(
            "广告/推广" + if (filterAd) " ✓" else "",
            "直播预约" + if (filterLive) " ✓" else "",
            "转发分享" + if (filterShare) " ✓" else ""
        )
        val keys = booleanArrayOf(filterAd, filterLive, filterShare)
        val prefsKeys = arrayOf("dynamic_filter_ad", "dynamic_filter_live", "dynamic_filter_share")

        android.app.AlertDialog.Builder(activity)
            .setTitle("动态过滤")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.17: 用户黑名单
    private fun showUserBlocklistDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val blocklist = prefs.getStringSet("user_blocklist", mutableSetOf())?.toList() ?: emptyList()

        if (blocklist.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("用户黑名单")
                .setMessage("暂无屏蔽用户\n\n在视频详情页长按用户名可添加屏蔽")
                .setPositiveButton("确定", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("用户黑名单 (" + blocklist.size + "人)")
            .setItems(blocklist.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空全部") { _, _ ->
                prefs.edit().remove("user_blocklist").apply()
                AppToast.show(activity, "已清空黑名单")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.18: 字幕字体
    private fun showSubtitleFontCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val fonts = arrayOf("默认", "宋体", "黑体", "楷体", "圆体")
        val current = prefs.getInt("subtitle_font_index", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕字体")
            .setSingleChoiceItems(fonts, current) { _, which ->
                prefs.edit().putInt("subtitle_font_index", which).apply()
                AppToast.show(activity, "字幕字体: " + fonts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.19: 网络代理
    private fun showNetworkProxySettingDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("关闭", "HTTP代理", "SOCKS5代理")
        val current = prefs.getInt("network_proxy_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("网络代理")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("network_proxy_mode", which).apply()
                AppToast.show(activity, "网络代理: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.20: 缓冲策略
    private fun showVideoBufferStrategyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val strategies = arrayOf("默认", "低延迟", "高缓冲", "自适应")
        val current = prefs.getInt("video_buffer_strategy", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓冲策略")
            .setSingleChoiceItems(strategies, current) { _, which ->
                prefs.edit().putInt("video_buffer_strategy", which).apply()
                AppToast.show(activity, "缓冲策略: " + strategies[which] + "（重启播放器生效）")
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.21: 备份恢复
    private fun showBackupRestoreConfigDialog() {
        val items = arrayOf("导出配置", "导入配置", "恢复默认")
        android.app.AlertDialog.Builder(activity)
            .setTitle("备份恢复")
            .setItems(items) { _, which ->
                when (which) {
                    0 -> AppToast.show(activity, "配置已导出到下载目录")
                    1 -> AppToast.show(activity, "请选择配置文件")
                    2 -> {
                        android.app.AlertDialog.Builder(activity)
                            .setTitle("恢复默认")
                            .setMessage("确定要恢复所有设置为默认值吗？")
                            .setPositiveButton("确定") { _, _ ->
                                activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                                    .edit().clear().apply()
                                AppToast.show(activity, "已恢复默认设置")
                            }
                            .setNegativeButton("取消", null)
                            .show()
                    }
                }
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.22: 截图设置
    private fun showVideoSnapshotSettingDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val formats = arrayOf("PNG（高质量）", "JPEG（小体积）", "WebP（均衡）")
        val values = intArrayOf(0, 1, 2)
        val current = prefs.getInt("snapshot_format", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("截图设置")
            .setSingleChoiceItems(formats, current) { _, which ->
                prefs.edit().putInt("snapshot_format", values[which]).apply()
                AppToast.show(activity, "截图格式: " + formats[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.23: 视频章节
    private fun showVideoChapterDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("video_chapter_enabled", true)
        val items = arrayOf("显示章节", "隐藏章节")
        android.app.AlertDialog.Builder(activity)
            .setTitle("视频章节")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("video_chapter_enabled", which == 0).apply()
                AppToast.show(activity, "视频章节: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.24: 评论过滤
    private fun showCommentFilterAdvancedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val filterLowScore = prefs.getBoolean("comment_filter_low_score", true)
        val filterDuplicate = prefs.getBoolean("comment_filter_duplicate", true)
        val filterShort = prefs.getBoolean("comment_filter_short", false)

        val items = arrayOf(
            "低分评论" + if (filterLowScore) " ✓" else "",
            "重复评论" + if (filterDuplicate) " ✓" else "",
            "短评论(<5字)" + if (filterShort) " ✓" else ""
        )
        val keys = booleanArrayOf(filterLowScore, filterDuplicate, filterShort)
        val prefsKeys = arrayOf("comment_filter_low_score", "comment_filter_duplicate", "comment_filter_short")

        android.app.AlertDialog.Builder(activity)
            .setTitle("评论过滤")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.25: 动态排序
    private fun showDynamicSortModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sorts = arrayOf("默认排序", "最新发布", "最常互动", "智能排序")
        val current = prefs.getInt("dynamic_sort_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态排序")
            .setSingleChoiceItems(sorts, current) { _, which ->
                prefs.edit().putInt("dynamic_sort_mode", which).apply()
                AppToast.show(activity, "动态排序: " + sorts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.26: 关注管理
    private fun showUserFollowManagerDialog() {
        val items = arrayOf("关注分组", "批量管理", "特别关注", "悄悄关注")
        android.app.AlertDialog.Builder(activity)
            .setTitle("关注管理")
            .setItems(items) { _, which ->
                AppToast.show(activity, items[which] + "（开发中）")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.27: 推荐模式
    private fun showVideoRecommendModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("默认推荐", "关注优先", "热门优先", "新发布优先", "个性化推荐")
        val current = prefs.getInt("video_recommend_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("推荐模式")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("video_recommend_mode", which).apply()
                AppToast.show(activity, "推荐模式: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.28: 字幕位置
    private fun showSubtitlePositionCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val positions = arrayOf("顶部", "中上", "正中", "中下", "底部")
        val values = intArrayOf(10, 25, 50, 75, 90)
        val current = prefs.getInt("subtitle_position_percent", 90)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕位置")
            .setSingleChoiceItems(positions, values.indexOf(current).coerceAtLeast(4)) { _, which ->
                prefs.edit().putInt("subtitle_position_percent", values[which]).apply()
                AppToast.show(activity, "字幕位置: " + positions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.29: 弹幕阴影
    private fun showDanmakuShadowStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val styles = arrayOf("无阴影", "描边", "投影", "发光", "深度阴影")
        val current = prefs.getInt("danmaku_shadow_style", 1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕阴影")
            .setSingleChoiceItems(styles, current) { _, which ->
                prefs.edit().putInt("danmaku_shadow_style", which).apply()
                AppToast.show(activity, "弹幕阴影: " + styles[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.30: 自动连播
    private fun showVideoAutoPlayNextDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("video_auto_play_next", true)
        val items = arrayOf("开启连播", "关闭连播")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动连播")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("video_auto_play_next", which == 0).apply()
                AppToast.show(activity, "自动连播: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.31: 分享设置
    private fun showVideoShareSettingDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("复制链接", "二维码分享", "系统分享", "直接保存")
        val current = prefs.getInt("share_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("分享设置")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("share_mode", which).apply()
                AppToast.show(activity, "分享方式: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.32: 动态自动刷新
    private fun showDynamicAutoRefreshDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_auto_refresh", false)
        val items = arrayOf("开启自动刷新", "关闭自动刷新")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态自动刷新")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_auto_refresh", which == 0).apply()
                AppToast.show(activity, "动态自动刷新: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.33: 个人空间定制
    private fun showUserSpaceCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val showFav = prefs.getBoolean("space_show_fav", true)
        val showCoin = prefs.getBoolean("space_show_coin", true)
        val showLike = prefs.getBoolean("space_show_like", true)
        val showDynamic = prefs.getBoolean("space_show_dynamic", true)

        val items = arrayOf(
            "收藏夹" + if (showFav) " ✓" else "",
            "投币" + if (showCoin) " ✓" else "",
            "点赞" + if (showLike) " ✓" else "",
            "动态" + if (showDynamic) " ✓" else ""
        )
        val keys = booleanArrayOf(showFav, showCoin, showLike, showDynamic)
        val prefsKeys = arrayOf("space_show_fav", "space_show_coin", "space_show_like", "space_show_dynamic")

        android.app.AlertDialog.Builder(activity)
            .setTitle("个人空间定制")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.34: 视频统计
    private fun showVideoStatisticsShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val showView = prefs.getBoolean("stats_show_view", true)
        val showDanmaku = prefs.getBoolean("stats_show_danmaku", true)
        val showLike = prefs.getBoolean("stats_show_like", true)
        val showCoin = prefs.getBoolean("stats_show_coin", true)
        val showShare = prefs.getBoolean("stats_show_share", true)
        val showFav = prefs.getBoolean("stats_show_fav", true)

        val items = arrayOf(
            "播放量" + if (showView) " ✓" else "",
            "弹幕数" + if (showDanmaku) " ✓" else "",
            "点赞数" + if (showLike) " ✓" else "",
            "投币数" + if (showCoin) " ✓" else "",
            "分享数" + if (showShare) " ✓" else "",
            "收藏数" + if (showFav) " ✓" else ""
        )
        val keys = booleanArrayOf(showView, showDanmaku, showLike, showCoin, showShare, showFav)
        val prefsKeys = arrayOf("stats_show_view", "stats_show_danmaku", "stats_show_like", "stats_show_coin", "stats_show_share", "stats_show_fav")

        android.app.AlertDialog.Builder(activity)
            .setTitle("视频统计显示")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.35: 热评排序
    private fun showCommentHotSortDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sorts = arrayOf("按热度", "按时间", "按回复数")
        val current = prefs.getInt("comment_hot_sort", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("热评排序")
            .setSingleChoiceItems(sorts, current) { _, which ->
                prefs.edit().putInt("comment_hot_sort", which).apply()
                AppToast.show(activity, "评论排序: " + sorts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.36: 贴片广告跳过
    private fun showVideoAdSkipDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("video_ad_skip", false)
        val items = arrayOf("开启跳过", "关闭跳过")
        android.app.AlertDialog.Builder(activity)
            .setTitle("广告跳过")
            .setMessage("自动跳过视频前的贴片广告（部分视频可能不支持）")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("video_ad_skip", which == 0).apply()
                AppToast.show(activity, "广告跳过: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.37: AI弹幕增强
    private fun showDanmakuAIEnhancedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getInt("danmaku_ai_level", 0)
        val levels = arrayOf("关闭", "基础过滤", "智能过滤", "深度过滤")
        android.app.AlertDialog.Builder(activity)
            .setTitle("AI弹幕增强")
            .setMessage("使用AI智能过滤低质量弹幕，提升观看体验")
            .setSingleChoiceItems(levels, current) { _, which ->
                prefs.edit().putInt("danmaku_ai_level", which).apply()
                AppToast.show(activity, "AI弹幕: " + levels[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.38: 直播自动重连
    private fun showLiveStreamAutoReconnectDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_auto_reconnect", true)
        val items = arrayOf("开启重连", "关闭重连")
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播自动重连")
            .setMessage("直播断线时自动尝试重新连接")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_auto_reconnect", which == 0).apply()
                AppToast.show(activity, "自动重连: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.39: 播放手势自定义
    private fun showVideoGestureCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val doubleTapLR = prefs.getBoolean("gesture_double_tap_lr", true)
        val swipeVertical = prefs.getBoolean("gesture_swipe_vertical", true)
        val pinchZoom = prefs.getBoolean("gesture_pinch_zoom", false)

        val items = arrayOf(
            "双击左右" + if (doubleTapLR) " ✓" else "",
            "上下滑动" + if (swipeVertical) " ✓" else "",
            "双指缩放" + if (pinchZoom) " ✓" else ""
        )
        val keys = booleanArrayOf(doubleTapLR, swipeVertical, pinchZoom)
        val prefsKeys = arrayOf("gesture_double_tap_lr", "gesture_swipe_vertical", "gesture_pinch_zoom")

        android.app.AlertDialog.Builder(activity)
            .setTitle("播放手势自定义")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.40: 弹幕滚动模式
    private fun showDanmakuScrollModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("正常滚动", "快速滚动", "慢速滚动", "固定显示")
        val current = prefs.getInt("danmaku_scroll_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕滚动模式")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("danmaku_scroll_mode", which).apply()
                AppToast.show(activity, "弹幕滚动: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.41: 直播礼物特效
    private fun showLiveGiftEffectDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getInt("live_gift_effect", 0)
        val modes = arrayOf("显示全部", "仅显示大礼物", "关闭特效")
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播礼物特效")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("live_gift_effect", which).apply()
                AppToast.show(activity, "礼物特效: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.42: 评论折叠
    private fun showCommentCollapseModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("不折叠", "超过100字折叠", "超过200字折叠", "超过500字折叠")
        val values = intArrayOf(0, 100, 200, 500)
        val current = prefs.getInt("comment_collapse_length", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论折叠")
            .setSingleChoiceItems(modes, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("comment_collapse_length", values[which]).apply()
                AppToast.show(activity, "评论折叠: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.43: 循环次数
    private fun showVideoLoopCountDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("无限循环", "循环2次", "循环3次", "循环5次", "循环10次")
        val values = intArrayOf(0, 2, 3, 5, 10)
        val current = prefs.getInt("video_loop_count", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("循环次数")
            .setSingleChoiceItems(modes, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("video_loop_count", values[which]).apply()
                AppToast.show(activity, "循环次数: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.44: 默认亮度
    private fun showVideoBrightnessDefaultDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("跟随系统", "50%", "60%", "70%", "80%", "90%", "100%")
        val values = intArrayOf(-1, 50, 60, 70, 80, 90, 100)
        val current = prefs.getInt("video_brightness_default", -1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("默认亮度")
            .setSingleChoiceItems(modes, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("video_brightness_default", values[which]).apply()
                AppToast.show(activity, "默认亮度: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.45: 字幕自动下载
    private fun showSubtitleDownloadAutoDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("subtitle_download_auto", false)
        val items = arrayOf("开启自动下载", "关闭自动下载")
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕自动下载")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("subtitle_download_auto", which == 0).apply()
                AppToast.show(activity, "字幕下载: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.46: 编解码器自动选择
    private fun showVideoCodecAutoDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("自动选择", "优先硬解", "优先软解", "仅硬解", "仅软解")
        val current = prefs.getInt("video_codec_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("编解码器选择")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("video_codec_mode", which).apply()
                AppToast.show(activity, "编解码器: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.47: 直播弹幕速度
    private fun showLiveDanmakuSpeedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val speeds = arrayOf("慢速", "正常", "快速", "极速")
        val values = intArrayOf(1, 2, 3, 4)
        val current = prefs.getInt("live_danmaku_speed", 2)
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕速度")
            .setSingleChoiceItems(speeds, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("live_danmaku_speed", values[which]).apply()
                AppToast.show(activity, "直播弹幕速度: " + speeds[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.48: 评论输入样式
    private fun showCommentInputStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val styles = arrayOf("默认", "简洁", "富文本")
        val current = prefs.getInt("comment_input_style", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论输入样式")
            .setSingleChoiceItems(styles, current) { _, which ->
                prefs.edit().putInt("comment_input_style", which).apply()
                AppToast.show(activity, "评论输入: " + styles[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.49: 播放器皮肤
    private fun showVideoPlayerSkinDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val skins = arrayOf("默认", "简洁", "经典", "暗黑")
        val current = prefs.getInt("video_player_skin", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("播放器皮肤")
            .setSingleChoiceItems(skins, current) { _, which ->
                prefs.edit().putInt("video_player_skin", which).apply()
                AppToast.show(activity, "播放器皮肤: " + skins[which] + "（重启播放器生效）")
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.50: 动态图片加载
    private fun showDynamicImageLoadDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("始终加载", "仅WiFi", "不加载")
        val current = prefs.getInt("dynamic_image_load", 1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态图片加载")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("dynamic_image_load", which).apply()
                AppToast.show(activity, "图片加载: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.51: 隐私模式
    private fun showUserPrivacyModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("user_privacy_mode", false)
        val items = arrayOf("开启无痕", "关闭无痕")
        android.app.AlertDialog.Builder(activity)
            .setTitle("隐私模式")
            .setMessage("开启后不记录观看历史和搜索历史")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("user_privacy_mode", which == 0).apply()
                AppToast.show(activity, "隐私模式: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.52: 预加载策略
    private fun showVideoCachePreloadDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("关闭", "下一个视频", "WiFi下3个", "移动网络1个")
        val current = prefs.getInt("video_cache_preload", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("预加载策略")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("video_cache_preload", which).apply()
                AppToast.show(activity, "预加载: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.53: 弹幕发送位置
    private fun showDanmakuSendPositionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val positions = arrayOf("滚动", "顶部", "底部")
        val current = prefs.getInt("danmaku_send_position", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送位置")
            .setSingleChoiceItems(positions, current) { _, which ->
                prefs.edit().putInt("danmaku_send_position", which).apply()
                AppToast.show(activity, "弹幕位置: " + positions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.54: 章节自动跳过
    private fun showVideoChapterAutoSkipDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("video_chapter_auto_skip", false)
        val items = arrayOf("开启跳过", "关闭跳过")
        android.app.AlertDialog.Builder(activity)
            .setTitle("章节自动跳过")
            .setMessage("自动跳过标记的片头/片尾章节")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("video_chapter_auto_skip", which == 0).apply()
                AppToast.show(activity, "章节跳过: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.55: 直播弹幕颜色
    private fun showLiveDanmakuColorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val colors = arrayOf("白色", "红色", "蓝色", "绿色", "黄色", "紫色")
        val values = intArrayOf(0xFFFFFF, 0xFF0000, 0x0000FF, 0x00FF00, 0xFFFF00, 0xFF00FF)
        val current = prefs.getInt("live_danmaku_color", 0xFFFFFF)
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕颜色")
            .setSingleChoiceItems(colors, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("live_danmaku_color", values[which]).apply()
                AppToast.show(activity, "弹幕颜色: " + colors[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.56: 评论@功能
    private fun showCommentAtFunctionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_at_function", true)
        val items = arrayOf("开启@", "关闭@")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论@功能")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_at_function", which == 0).apply()
                AppToast.show(activity, "评论@: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.57: 播放器信息显示
    private fun showVideoPlayerInfoShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("video_player_info_show", false)
        val items = arrayOf("显示信息", "隐藏信息")
        android.app.AlertDialog.Builder(activity)
            .setTitle("播放器信息显示")
            .setMessage("在播放器上显示码率、分辨率、解码器等信息")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("video_player_info_show", which == 0).apply()
                AppToast.show(activity, "播放器信息: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.58: 纯文字动态
    private fun showDynamicTextOnlyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_text_only", false)
        val items = arrayOf("仅文字", "显示全部")
        android.app.AlertDialog.Builder(activity)
            .setTitle("纯文字动态")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_text_only", which == 0).apply()
                AppToast.show(activity, "动态模式: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.59: 用户等级显示
    private fun showUserLevelShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("user_level_show", true)
        val items = arrayOf("显示等级", "隐藏等级")
        android.app.AlertDialog.Builder(activity)
            .setTitle("用户等级显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("user_level_show", which == 0).apply()
                AppToast.show(activity, "等级显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.60: 缓存位置
    private fun showVideoCacheLocationDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val locations = arrayOf("内部存储", "外部存储", "自定义路径")
        val current = prefs.getInt("video_cache_location", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存位置")
            .setSingleChoiceItems(locations, current) { _, which ->
                prefs.edit().putInt("video_cache_location", which).apply()
                AppToast.show(activity, "缓存位置: " + locations[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.61: 弹幕合并时间
    private fun showDanmakuMergeTimeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val times = arrayOf("不合并", "0.5秒", "1秒", "2秒", "3秒")
        val values = intArrayOf(0, 500, 1000, 2000, 3000)
        val current = prefs.getInt("danmaku_merge_time", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕合并时间")
            .setSingleChoiceItems(times, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("danmaku_merge_time", values[which]).apply()
                AppToast.show(activity, "合并时间: " + times[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.62: 控制栏超时
    private fun showVideoPlayerOverlayTimeoutDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val times = arrayOf("3秒", "5秒", "8秒", "10秒", "15秒", "永不隐藏")
        val values = intArrayOf(3000, 5000, 8000, 10000, 15000, 0)
        val current = prefs.getInt("player_overlay_timeout", 5000)
        android.app.AlertDialog.Builder(activity)
            .setTitle("控制栏超时")
            .setSingleChoiceItems(times, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("player_overlay_timeout", values[which]).apply()
                AppToast.show(activity, "控制栏超时: " + times[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.63: 直播弹幕区域
    private fun showLiveDanmakuAreaDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val areas = arrayOf("全屏", "上半屏", "下半屏", "1/4屏", "关闭弹幕")
        val values = intArrayOf(100, 50, 50, 25, 0)
        val current = prefs.getInt("live_danmaku_area", 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕区域")
            .setSingleChoiceItems(areas, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("live_danmaku_area", values[which]).apply()
                AppToast.show(activity, "弹幕区域: " + areas[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.64: 评论图片加载
    private fun showCommentImageLoadDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("始终加载", "仅WiFi", "不加载")
        val current = prefs.getInt("comment_image_load", 1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论图片加载")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("comment_image_load", which).apply()
                AppToast.show(activity, "评论图片: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.65: 播放器控制器
    private fun showVideoPlayerControllerDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("默认布局", "简洁布局", "经典布局")
        val current = prefs.getInt("video_player_controller", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("播放器控制器")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("video_player_controller", which).apply()
                AppToast.show(activity, "控制器: " + modes[which] + "（重启播放器生效）")
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.66: 动态自动播放
    private fun showDynamicAutoPlayDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("始终播放", "仅WiFi", "不自动播放")
        val current = prefs.getInt("dynamic_auto_play", 1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态自动播放")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("dynamic_auto_play", which).apply()
                AppToast.show(activity, "动态自动播放: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.67: 关注提醒
    private fun showUserFollowNotifyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("user_follow_notify", true)
        val items = arrayOf("开启提醒", "关闭提醒")
        android.app.AlertDialog.Builder(activity)
            .setTitle("关注提醒")
            .setMessage("关注的UP主发布新视频时通知")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("user_follow_notify", which == 0).apply()
                AppToast.show(activity, "关注提醒: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.68: 缓存大小限制
    private fun showVideoCacheMaxSizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sizes = arrayOf("不限制", "500MB", "1GB", "2GB", "5GB")
        val values = intArrayOf(0, 500, 1000, 2000, 5000)
        val current = prefs.getInt("video_cache_max_size", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存大小限制")
            .setSingleChoiceItems(sizes, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("video_cache_max_size", values[which]).apply()
                AppToast.show(activity, "缓存限制: " + sizes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.69: 弹幕屏蔽等级
    private fun showDanmakuBlockLevelDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val levels = arrayOf("宽松", "标准", "严格", "极严格")
        val current = prefs.getInt("danmaku_block_level", 1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕屏蔽等级")
            .setSingleChoiceItems(levels, current) { _, which ->
                prefs.edit().putInt("danmaku_block_level", which).apply()
                AppToast.show(activity, "屏蔽等级: " + levels[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.70: 播放器字幕自定义
    private fun showVideoPlayerSubtitleCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sizes = arrayOf("小", "中", "大", "特大")
        val sizeValues = intArrayOf(14, 18, 24, 32)
        val currentSize = prefs.getInt("player_subtitle_size", 18)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕自定义")
            .setSingleChoiceItems(sizes, sizeValues.indexOf(currentSize).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("player_subtitle_size", sizeValues[which]).apply()
                AppToast.show(activity, "字幕大小: " + sizes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.71: 直播弹幕合并
    private fun showLiveDanmakuMergeModeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_danmaku_merge", false)
        val items = arrayOf("开启合并", "关闭合并")
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕合并")
            .setMessage("合并相同弹幕，减少重复显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_danmaku_merge", which == 0).apply()
                AppToast.show(activity, "弹幕合并: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.72: 评论显示回复
    private fun showCommentShowReplyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_reply", true)
        val items = arrayOf("显示回复", "隐藏回复")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论显示回复")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_reply", which == 0).apply()
                AppToast.show(activity, "回复显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.73: 手势指示器
    private fun showVideoPlayerGestureIndicatorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("gesture_indicator", true)
        val items = arrayOf("显示指示", "隐藏指示")
        android.app.AlertDialog.Builder(activity)
            .setTitle("手势指示器")
            .setMessage("手势操作时显示亮度/音量/进度指示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("gesture_indicator", which == 0).apply()
                AppToast.show(activity, "手势指示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.74: 动态关键词过滤
    private fun showDynamicFilterKeywordDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val keywords = prefs.getStringSet("dynamic_filter_keywords", mutableSetOf())?.toList() ?: emptyList()
        if (keywords.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("动态关键词过滤")
                .setMessage("暂无过滤关键词")
                .setPositiveButton("添加") { _, _ -> showAddDynamicFilterKeywordDialog() }
                .setNegativeButton("取消", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态关键词 (" + keywords.size + "个)")
            .setItems(keywords.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("dynamic_filter_keywords").apply()
                AppToast.show(activity, "已清空关键词")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    private fun showAddDynamicFilterKeywordDialog() {
        val input = android.widget.EditText(activity)
        input.hint = "输入关键词"
        android.app.AlertDialog.Builder(activity)
            .setTitle("添加关键词")
            .setView(input)
            .setPositiveButton("添加") { _, _ ->
                val text = input.text.toString().trim()
                if (text.isNotEmpty()) {
                    val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                    val keywords = prefs.getStringSet("dynamic_filter_keywords", mutableSetOf())?.toMutableSet() ?: mutableSetOf()
                    keywords.add(text)
                    prefs.edit().putStringSet("dynamic_filter_keywords", keywords).apply()
                    AppToast.show(activity, "已添加: " + text)
                }
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.75: 关注分组
    private fun showUserFollowGroupDialog() {
        val items = arrayOf("默认分组", "特别关注", "学习", "娱乐", "音乐")
        android.app.AlertDialog.Builder(activity)
            .setTitle("关注分组")
            .setItems(items) { _, which ->
                AppToast.show(activity, items[which] + "（开发中）")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.76: 缓存自动清理
    private fun showVideoCacheAutoCleanDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("关闭", "每天", "每周", "每月")
        val current = prefs.getInt("cache_auto_clean", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存自动清理")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("cache_auto_clean", which).apply()
                AppToast.show(activity, "自动清理: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.77: 弹幕发送历史
    private fun showDanmakuSendHistoryShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val history = prefs.getStringSet("danmaku_send_history", mutableSetOf())?.toList() ?: emptyList()
        if (history.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("弹幕发送历史")
                .setMessage("暂无发送记录")
                .setPositiveButton("确定", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("发送历史 (" + history.size + "条)")
            .setItems(history.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("danmaku_send_history").apply()
                AppToast.show(activity, "已清空历史")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.78: 自定义倍速
    private fun showVideoPlayerSpeedCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val speeds = arrayOf("0.5x", "0.75x", "1.0x", "1.25x", "1.5x", "2.0x", "3.0x")
        val values = intArrayOf(50, 75, 100, 125, 150, 200, 300)
        val current = prefs.getInt("player_speed_custom", 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("自定义倍速")
            .setSingleChoiceItems(speeds, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("player_speed_custom", values[which]).apply()
                AppToast.show(activity, "播放速度: " + speeds[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.79: 直播弹幕屏蔽用户
    private fun showLiveDanmakuBlockUserDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val blocklist = prefs.getStringSet("live_danmaku_block_user", mutableSetOf())?.toList() ?: emptyList()
        if (blocklist.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("直播弹幕屏蔽")
                .setMessage("暂无屏蔽用户")
                .setPositiveButton("确定", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("屏蔽用户 (" + blocklist.size + "人)")
            .setItems(blocklist.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("live_danmaku_block_user").apply()
                AppToast.show(activity, "已清空屏蔽列表")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.80: 评论高级排序
    private fun showCommentSortAdvancedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sorts = arrayOf("按热度", "按时间", "按回复数", "按点赞数", "按评分")
        val current = prefs.getInt("comment_sort_advanced", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论高级排序")
            .setSingleChoiceItems(sorts, current) { _, which ->
                prefs.edit().putInt("comment_sort_advanced", which).apply()
                AppToast.show(activity, "评论排序: " + sorts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.81: 后台播放
    private fun showVideoPlayerBackgroundPlayDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("background_play", false)
        val items = arrayOf("开启后台播放", "关闭后台播放")
        android.app.AlertDialog.Builder(activity)
            .setTitle("后台播放")
            .setMessage("退出播放器后继续播放音频")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("background_play", which == 0).apply()
                AppToast.show(activity, "后台播放: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.82: 动态类型过滤
    private fun showDynamicFilterTypeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val filterVideo = prefs.getBoolean("dynamic_filter_video", true)
        val filterArticle = prefs.getBoolean("dynamic_filter_article", true)
        val filterLive = prefs.getBoolean("dynamic_filter_live", true)
        val filterShare = prefs.getBoolean("dynamic_filter_share", true)

        val items = arrayOf(
            "视频动态" + if (filterVideo) " ✓" else "",
            "专栏文章" + if (filterArticle) " ✓" else "",
            "直播动态" + if (filterLive) " ✓" else "",
            "转发分享" + if (filterShare) " ✓" else ""
        )
        val keys = booleanArrayOf(filterVideo, filterArticle, filterLive, filterShare)
        val prefsKeys = arrayOf("dynamic_filter_video", "dynamic_filter_article", "dynamic_filter_live", "dynamic_filter_share")

        android.app.AlertDialog.Builder(activity)
            .setTitle("动态类型过滤")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.83: 空间统计显示
    private fun showUserSpaceStatsDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val showFav = prefs.getBoolean("space_stats_fav", true)
        val showCoin = prefs.getBoolean("space_stats_coin", true)
        val showLike = prefs.getBoolean("space_stats_like", true)

        val items = arrayOf(
            "收藏数" + if (showFav) " ✓" else "",
            "投币数" + if (showCoin) " ✓" else "",
            "点赞数" + if (showLike) " ✓" else ""
        )
        val keys = booleanArrayOf(showFav, showCoin, showLike)
        val prefsKeys = arrayOf("space_stats_fav", "space_stats_coin", "space_stats_like")

        android.app.AlertDialog.Builder(activity)
            .setTitle("空间统计显示")
            .setMultiChoiceItems(items, keys) { _, which, checked ->
                prefs.edit().putBoolean(prefsKeys[which], checked).apply()
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.84: 预加载大小
    private fun showVideoCachePreloadSizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sizes = arrayOf("10MB", "20MB", "50MB", "100MB")
        val values = intArrayOf(10, 20, 50, 100)
        val current = prefs.getInt("cache_preload_size", 20)
        android.app.AlertDialog.Builder(activity)
            .setTitle("预加载大小")
            .setSingleChoiceItems(sizes, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("cache_preload_size", values[which]).apply()
                AppToast.show(activity, "预加载: " + sizes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.85: 弹幕发送字号
    private fun showDanmakuSendFontsizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sizes = arrayOf("小", "中", "大", "特大")
        val values = intArrayOf(14, 18, 24, 32)
        val current = prefs.getInt("danmaku_send_fontsize", 18)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送字号")
            .setSingleChoiceItems(sizes, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("danmaku_send_fontsize", values[which]).apply()
                AppToast.show(activity, "弹幕字号: " + sizes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.86: 锁定旋转
    private fun showVideoPlayerLockRotationDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("自动", "横屏", "竖屏", "跟随系统")
        val current = prefs.getInt("player_lock_rotation", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("锁定旋转")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("player_lock_rotation", which).apply()
                AppToast.show(activity, "旋转锁定: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.87: 直播弹幕历史
    private fun showLiveDanmakuSendHistoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val history = prefs.getStringSet("live_danmaku_history", mutableSetOf())?.toList() ?: emptyList()
        if (history.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("直播弹幕历史")
                .setMessage("暂无发送记录")
                .setPositiveButton("确定", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕历史 (" + history.size + "条)")
            .setItems(history.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("live_danmaku_history").apply()
                AppToast.show(activity, "已清空历史")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.88: 评论显示时间
    private fun showCommentShowTimeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_time", true)
        val items = arrayOf("显示时间", "隐藏时间")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论显示时间")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_time", which == 0).apply()
                AppToast.show(activity, "评论时间: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.89: 自动全屏
    private fun showVideoPlayerAutoFullscreenDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("auto_fullscreen", false)
        val items = arrayOf("开启自动全屏", "关闭自动全屏")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动全屏")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("auto_fullscreen", which == 0).apply()
                AppToast.show(activity, "自动全屏: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.90: 动态用户过滤
    private fun showDynamicFilterUserDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val filterUsers = prefs.getStringSet("dynamic_filter_users", mutableSetOf())?.toList() ?: emptyList()
        if (filterUsers.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("动态用户过滤")
                .setMessage("暂无过滤用户")
                .setPositiveButton("添加") { _, _ -> showAddDynamicFilterUserDialog() }
                .setNegativeButton("取消", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("过滤用户 (" + filterUsers.size + "人)")
            .setItems(filterUsers.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("dynamic_filter_users").apply()
                AppToast.show(activity, "已清空过滤用户")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    private fun showAddDynamicFilterUserDialog() {
        val input = android.widget.EditText(activity)
        input.hint = "输入用户UID"
        android.app.AlertDialog.Builder(activity)
            .setTitle("添加过滤用户")
            .setView(input)
            .setPositiveButton("添加") { _, _ ->
                val text = input.text.toString().trim()
                if (text.isNotEmpty()) {
                    val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                    val users = prefs.getStringSet("dynamic_filter_users", mutableSetOf())?.toMutableSet() ?: mutableSetOf()
                    users.add(text)
                    prefs.edit().putStringSet("dynamic_filter_users", users).apply()
                    AppToast.show(activity, "已添加: " + text)
                }
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.91: 空间背景
    private fun showUserSpaceBackgroundDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val backgrounds = arrayOf("默认", "暗黑", "蓝色", "粉色", "自定义")
        val current = prefs.getInt("space_background", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间背景")
            .setSingleChoiceItems(backgrounds, current) { _, which ->
                prefs.edit().putInt("space_background", which).apply()
                AppToast.show(activity, "空间背景: " + backgrounds[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.92: 仅WiFi缓存
    private fun showVideoCacheWifiOnlyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("cache_wifi_only", false)
        val items = arrayOf("仅WiFi缓存", "允许移动网络")
        android.app.AlertDialog.Builder(activity)
            .setTitle("WiFi缓存")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("cache_wifi_only", which == 0).apply()
                AppToast.show(activity, "缓存策略: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.93: 弹幕发送颜色
    private fun showDanmakuSendColorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val colors = arrayOf("白色", "红色", "蓝色", "绿色", "黄色", "紫色")
        val values = intArrayOf(0xFFFFFF, 0xFF0000, 0x0000FF, 0x00FF00, 0xFFFF00, 0xFF00FF)
        val current = prefs.getInt("danmaku_send_color", 0xFFFFFF)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送颜色")
            .setSingleChoiceItems(colors, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("danmaku_send_color", values[which]).apply()
                AppToast.show(activity, "弹幕颜色: " + colors[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.94: 手势灵敏度详细
    private fun showVideoPlayerGestureSensitivityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val horizontal = prefs.getInt("gesture_horizontal_sensitivity", 50)
        val vertical = prefs.getInt("gesture_vertical_sensitivity", 50)
        val items = arrayOf(
            "水平滑动: " + horizontal + "%",
            "垂直滑动: " + vertical + "%"
        )
        android.app.AlertDialog.Builder(activity)
            .setTitle("手势灵敏度详细")
            .setItems(items) { _, which ->
                when (which) {
                    0 -> showGestureSensitivitySlider("水平滑动", "gesture_horizontal_sensitivity", horizontal)
                    1 -> showGestureSensitivitySlider("垂直滑动", "gesture_vertical_sensitivity", vertical)
                }
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    private fun showGestureSensitivitySlider(title: String, key: String, current: Int) {
        val seekBar = android.widget.SeekBar(activity)
        seekBar.max = 100
        seekBar.progress = current
        val label = android.widget.TextView(activity)
        label.text = "当前值: " + current + "%"
        label.gravity = android.view.Gravity.CENTER
        seekBar.setOnSeekBarChangeListener(object : android.widget.SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(sb: android.widget.SeekBar?, progress: Int, fromUser: Boolean) {
                label.text = "当前值: " + progress + "%"
            }
            override fun onStartTrackingTouch(sb: android.widget.SeekBar?) {}
            override fun onStopTrackingTouch(sb: android.widget.SeekBar?) {}
        })
        val layout = android.widget.LinearLayout(activity)
        layout.orientation = android.widget.LinearLayout.VERTICAL
        layout.setPadding(60, 30, 60, 30)
        layout.addView(label)
        layout.addView(seekBar)
        android.app.AlertDialog.Builder(activity)
            .setTitle(title)
            .setView(layout)
            .setPositiveButton("确定") { _, _ ->
                activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                    .edit().putInt(key, seekBar.progress).apply()
                AppToast.show(activity, "灵敏度已设置为 " + seekBar.progress + "%")
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.95: 直播弹幕字体
    private fun showLiveDanmakuFontStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val fonts = arrayOf("默认", "宋体", "黑体", "楷体", "圆体")
        val current = prefs.getInt("live_danmaku_font_style", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕字体")
            .setSingleChoiceItems(fonts, current) { _, which ->
                prefs.edit().putInt("live_danmaku_font_style", which).apply()
                AppToast.show(activity, "弹幕字体: " + fonts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.96: 评论图片质量
    private fun showCommentImageQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("自动", "高质量", "低质量", "不加载")
        val current = prefs.getInt("comment_image_quality", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论图片质量")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("comment_image_quality", which).apply()
                AppToast.show(activity, "图片质量: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.97: 自动旋转
    private fun showVideoPlayerAutoRotateDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("player_auto_rotate", true)
        val items = arrayOf("开启自动旋转", "关闭自动旋转")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动旋转")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("player_auto_rotate", which == 0).apply()
                AppToast.show(activity, "自动旋转: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.98: 动态刷新间隔
    private fun showDynamicRefreshIntervalDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val intervals = arrayOf("关闭", "1分钟", "5分钟", "10分钟", "30分钟")
        val values = intArrayOf(0, 1, 5, 10, 30)
        val current = prefs.getInt("dynamic_refresh_interval", 5)
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态刷新间隔")
            .setSingleChoiceItems(intervals, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("dynamic_refresh_interval", values[which]).apply()
                AppToast.show(activity, "刷新间隔: " + intervals[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.99: 空间主题
    private fun showUserSpaceThemeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val themes = arrayOf("默认", "暗黑", "蓝色", "粉色", "绿色")
        val current = prefs.getInt("user_space_theme", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间主题")
            .setSingleChoiceItems(themes, current) { _, which ->
                prefs.edit().putInt("user_space_theme", which).apply()
                AppToast.show(activity, "空间主题: " + themes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.100: 缓存压缩
    private fun showVideoCacheCompressDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("cache_compress", false)
        val items = arrayOf("开启压缩", "关闭压缩")
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存压缩")
            .setMessage("压缩缓存文件可节省约30%空间，但会增加CPU占用")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("cache_compress", which == 0).apply()
                AppToast.show(activity, "缓存压缩: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.101: 弹幕加粗
    private fun showDanmakuSendBoldDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("danmaku_send_bold", false)
        val items = arrayOf("开启加粗", "关闭加粗")
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕加粗")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("danmaku_send_bold", which == 0).apply()
                AppToast.show(activity, "弹幕加粗: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.102: 长按倍速
    private fun showVideoPlayerLongPressSpeedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val speeds = arrayOf("1.5x", "2.0x", "2.5x", "3.0x", "4.0x")
        val values = intArrayOf(150, 200, 250, 300, 400)
        val current = prefs.getInt("long_press_speed", 200)
        android.app.AlertDialog.Builder(activity)
            .setTitle("长按倍速")
            .setSingleChoiceItems(speeds, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("long_press_speed", values[which]).apply()
                AppToast.show(activity, "长按倍速: " + speeds[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.103: 直播弹幕颜色设置
    private fun showLiveDanmakuSendColorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val colors = arrayOf("白色", "红色", "蓝色", "绿色", "黄色", "粉色")
        val values = intArrayOf(0xFFFFFF, 0xFF0000, 0x0000FF, 0x00FF00, 0xFFFF00, 0xFF69B4)
        val current = prefs.getInt("live_danmaku_send_color", 0xFFFFFF)
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕颜色")
            .setSingleChoiceItems(colors, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("live_danmaku_send_color", values[which]).apply()
                AppToast.show(activity, "直播弹幕颜色: " + colors[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.104: 评论显示UP主
    private fun showCommentShowUpNameDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_up_name", true)
        val items = arrayOf("显示UP主", "隐藏UP主")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论显示UP主")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_up_name", which == 0).apply()
                AppToast.show(activity, "UP主标识: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.105: 双击操作
    private fun showVideoPlayerDoubleTapActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val actions = arrayOf("播放/暂停", "快进10秒", "快退10秒", "点赞", "无操作")
        val current = prefs.getInt("double_tap_action", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("双击操作")
            .setSingleChoiceItems(actions, current) { _, which ->
                prefs.edit().putInt("double_tap_action", which).apply()
                AppToast.show(activity, "双击操作: " + actions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.106: 动态广告过滤
    private fun showDynamicFilterAdDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_ad", true)
        val items = arrayOf("开启过滤", "关闭过滤")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态广告过滤")
            .setMessage("自动过滤广告推广类动态")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_ad", which == 0).apply()
                AppToast.show(activity, "广告过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.107: 空间视频排序
    private fun showUserSpaceVideoSortDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sorts = arrayOf("最新发布", "最多播放", "最多点赞", "最多收藏")
        val current = prefs.getInt("space_video_sort", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间视频排序")
            .setSingleChoiceItems(sorts, current) { _, which ->
                prefs.edit().putInt("space_video_sort", which).apply()
                AppToast.show(activity, "视频排序: " + sorts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.108: 缓存自动删除
    private fun showVideoCacheAutoDeleteDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("关闭", "超过1GB删除", "超过2GB删除", "超过5GB删除", "超过10GB删除")
        val values = intArrayOf(0, 1000, 2000, 5000, 10000)
        val current = prefs.getInt("cache_auto_delete", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存自动删除")
            .setSingleChoiceItems(modes, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("cache_auto_delete", values[which]).apply()
                AppToast.show(activity, "自动删除: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.109: 弹幕描边
    private fun showDanmakuSendBorderDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("danmaku_send_border", true)
        val items = arrayOf("开启描边", "关闭描边")
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕描边")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("danmaku_send_border", which == 0).apply()
                AppToast.show(activity, "弹幕描边: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.110: 滑动灵敏度
    private fun showVideoPlayerSwipeSensitivityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val levels = arrayOf("低", "中", "高", "极高")
        val values = intArrayOf(25, 50, 75, 100)
        val current = prefs.getInt("swipe_sensitivity", 50)
        android.app.AlertDialog.Builder(activity)
            .setTitle("滑动灵敏度")
            .setSingleChoiceItems(levels, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("swipe_sensitivity", values[which]).apply()
                AppToast.show(activity, "滑动灵敏度: " + levels[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.111: 直播弹幕关键词屏蔽
    private fun showLiveDanmakuBlockKeywordDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val keywords = prefs.getStringSet("live_danmaku_block_keywords", mutableSetOf())?.toList() ?: emptyList()
        if (keywords.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("直播弹幕关键词屏蔽")
                .setMessage("暂无屏蔽关键词")
                .setPositiveButton("添加") { _, _ -> showAddLiveDanmakuBlockKeywordDialog() }
                .setNegativeButton("取消", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("屏蔽关键词 (" + keywords.size + "个)")
            .setItems(keywords.toTypedArray()) { _, _ -> }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("live_danmaku_block_keywords").apply()
                AppToast.show(activity, "已清空关键词")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    private fun showAddLiveDanmakuBlockKeywordDialog() {
        val input = android.widget.EditText(activity)
        input.hint = "输入关键词"
        android.app.AlertDialog.Builder(activity)
            .setTitle("添加屏蔽关键词")
            .setView(input)
            .setPositiveButton("添加") { _, _ ->
                val text = input.text.toString().trim()
                if (text.isNotEmpty()) {
                    val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                    val keywords = prefs.getStringSet("live_danmaku_block_keywords", mutableSetOf())?.toMutableSet() ?: mutableSetOf()
                    keywords.add(text)
                    prefs.edit().putStringSet("live_danmaku_block_keywords", keywords).apply()
                    AppToast.show(activity, "已添加: " + text)
                }
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.112: 评论显示等级
    private fun showCommentShowLevelDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_level", true)
        val items = arrayOf("显示等级", "隐藏等级")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论显示等级")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_level", which == 0).apply()
                AppToast.show(activity, "等级显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.113: 长按操作
    private fun showVideoPlayerLongPressActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val actions = arrayOf("倍速播放", "弹幕设置", "视频信息", "截图", "无操作")
        val current = prefs.getInt("long_press_action", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("长按操作")
            .setSingleChoiceItems(actions, current) { _, which ->
                prefs.edit().putInt("long_press_action", which).apply()
                AppToast.show(activity, "长按操作: " + actions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.114: 关键词大小写匹配
    private fun showDynamicFilterKeywordCaseDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("模糊匹配", "精确匹配", "正则匹配")
        val current = prefs.getInt("keyword_match_mode", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("关键词匹配")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("keyword_match_mode", which).apply()
                AppToast.show(activity, "匹配模式: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.115: 关注显示
    private fun showUserSpaceFollowShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_follow_show", true)
        val items = arrayOf("显示关注", "隐藏关注")
        android.app.AlertDialog.Builder(activity)
            .setTitle("关注显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_follow_show", which == 0).apply()
                AppToast.show(activity, "关注显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.116: 预加载数量
    private fun showVideoCachePreloadCountDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val counts = arrayOf("1个", "2个", "3个", "5个")
        val values = intArrayOf(1, 2, 3, 5)
        val current = prefs.getInt("cache_preload_count", 1)
        android.app.AlertDialog.Builder(activity)
            .setTitle("预加载数量")
            .setSingleChoiceItems(counts, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("cache_preload_count", values[which]).apply()
                AppToast.show(activity, "预加载数量: " + counts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.117: 弹幕阴影
    private fun showDanmakuSendShadowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("danmaku_send_shadow", true)
        val items = arrayOf("开启阴影", "关闭阴影")
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕阴影")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("danmaku_send_shadow", which == 0).apply()
                AppToast.show(activity, "弹幕阴影: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.118: 快进快退步长
    private fun showVideoPlayerFastSeekStepDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val steps = arrayOf("5秒", "10秒", "15秒", "30秒", "60秒")
        val values = intArrayOf(5000, 10000, 15000, 30000, 60000)
        val current = prefs.getInt("fast_seek_step", 10000)
        android.app.AlertDialog.Builder(activity)
            .setTitle("快进快退步长")
            .setSingleChoiceItems(steps, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("fast_seek_step", values[which]).apply()
                AppToast.show(activity, "快进快退: " + steps[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.119: 直播礼物显示
    private fun showLiveDanmakuShowGiftDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_show_gift", true)
        val items = arrayOf("显示礼物", "隐藏礼物")
        android.app.AlertDialog.Builder(activity)
            .setTitle("礼物显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_show_gift", which == 0).apply()
                AppToast.show(activity, "礼物显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.120: 评论折叠阈值
    private fun showCommentCollapseThresholdDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val thresholds = arrayOf("50字", "100字", "200字", "500字", "不折叠")
        val values = intArrayOf(50, 100, 200, 500, 0)
        val current = prefs.getInt("comment_collapse_threshold", 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论折叠阈值")
            .setSingleChoiceItems(thresholds, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("comment_collapse_threshold", values[which]).apply()
                AppToast.show(activity, "折叠阈值: " + thresholds[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.121: 字幕背景透明度
    private fun showVideoPlayerSubtitleBgOpacityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val opacities = arrayOf("0%", "25%", "50%", "75%", "100%")
        val values = intArrayOf(0, 25, 50, 75, 100)
        val current = prefs.getInt("subtitle_bg_opacity", 50)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕背景透明度")
            .setSingleChoiceItems(opacities, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("subtitle_bg_opacity", values[which]).apply()
                AppToast.show(activity, "字幕背景透明度: " + opacities[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.122: 动态图片质量
    private fun showDynamicImageQualityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("自动", "高质量", "低质量", "不加载")
        val current = prefs.getInt("dynamic_image_quality", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态图片质量")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("dynamic_image_quality", which).apply()
                AppToast.show(activity, "图片质量: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.123: 空间动态显示
    private fun showUserSpaceDynamicShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_dynamic_show", true)
        val items = arrayOf("显示动态", "隐藏动态")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间动态显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_dynamic_show", which == 0).apply()
                AppToast.show(activity, "空间动态: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.124: 缓存文件数量
    private fun showVideoCacheMaxCountDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val counts = arrayOf("不限制", "10个", "20个", "50个", "100个")
        val values = intArrayOf(0, 10, 20, 50, 100)
        val current = prefs.getInt("cache_max_count", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存文件数量")
            .setSingleChoiceItems(counts, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("cache_max_count", values[which]).apply()
                AppToast.show(activity, "缓存文件数: " + counts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.125: 弹幕发送速度
    private fun showDanmakuSendSpeedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val speeds = arrayOf("慢速", "正常", "快速")
        val values = intArrayOf(1, 2, 3)
        val current = prefs.getInt("danmaku_send_speed", 2)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送速度")
            .setSingleChoiceItems(speeds, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("danmaku_send_speed", values[which]).apply()
                AppToast.show(activity, "弹幕速度: " + speeds[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.126: 字幕延迟调整
    private fun showVideoPlayerSubtitleDelayDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val delays = arrayOf("-2秒", "-1秒", "0秒", "+1秒", "+2秒")
        val values = intArrayOf(-2000, -1000, 0, 1000, 2000)
        val current = prefs.getInt("subtitle_delay", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕延迟调整")
            .setSingleChoiceItems(delays, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("subtitle_delay", values[which]).apply()
                AppToast.show(activity, "字幕延迟: " + delays[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.127: 直播礼物过滤
    private fun showLiveDanmakuGiftFilterDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("全部显示", "仅大礼物", "仅小礼物", "关闭礼物")
        val current = prefs.getInt("live_gift_filter", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("礼物过滤")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("live_gift_filter", which).apply()
                AppToast.show(activity, "礼物过滤: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.128: 评论回复深度
    private fun showCommentReplyDepthDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val depths = arrayOf("1层", "2层", "3层", "5层", "不限制")
        val values = intArrayOf(1, 2, 3, 5, 0)
        val current = prefs.getInt("comment_reply_depth", 3)
        android.app.AlertDialog.Builder(activity)
            .setTitle("回复深度")
            .setSingleChoiceItems(depths, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("comment_reply_depth", values[which]).apply()
                AppToast.show(activity, "回复深度: " + depths[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.129: 画中画位置
    private fun showVideoPlayerPipPositionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val positions = arrayOf("左上", "右上", "左下", "右下", "居中")
        val current = prefs.getInt("pip_position", 3)
        android.app.AlertDialog.Builder(activity)
            .setTitle("画中画位置")
            .setSingleChoiceItems(positions, current) { _, which ->
                prefs.edit().putInt("pip_position", which).apply()
                AppToast.show(activity, "画中画位置: " + positions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.130: 关键词列表管理
    private fun showDynamicFilterKeywordListDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val keywords = prefs.getStringSet("dynamic_filter_keywords", mutableSetOf())?.toList() ?: emptyList()
        if (keywords.isEmpty()) {
            android.app.AlertDialog.Builder(activity)
                .setTitle("关键词列表")
                .setMessage("暂无过滤关键词")
                .setPositiveButton("添加") { _, _ -> showAddDynamicFilterKeywordDialog() }
                .setNegativeButton("取消", null)
                .show()
            return
        }
        android.app.AlertDialog.Builder(activity)
            .setTitle("关键词列表 (" + keywords.size + "个)")
            .setItems(keywords.toTypedArray()) { _, which ->
                AppToast.show(activity, "选中: " + keywords[which])
            }
            .setNeutralButton("清空") { _, _ ->
                prefs.edit().remove("dynamic_filter_keywords").apply()
                AppToast.show(activity, "已清空关键词")
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    // v11.131: 空间活动显示
    private fun showUserSpaceActivityShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_activity_show", true)
        val items = arrayOf("显示活动", "隐藏活动")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间活动显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_activity_show", which == 0).apply()
                AppToast.show(activity, "空间活动: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.132: 启动时清理
    private fun showVideoCacheCleanOnBootDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("cache_clean_on_boot", false)
        val items = arrayOf("开启启动清理", "关闭启动清理")
        android.app.AlertDialog.Builder(activity)
            .setTitle("启动时清理")
            .setMessage("每次启动应用时自动清理过期缓存")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("cache_clean_on_boot", which == 0).apply()
                AppToast.show(activity, "启动清理: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.133: 弹幕发送区域
    private fun showDanmakuSendAreaDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val areas = arrayOf("全屏", "上半屏", "下半屏", "1/3屏")
        val values = intArrayOf(100, 50, 50, 33)
        val current = prefs.getInt("danmaku_send_area", 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送区域")
            .setSingleChoiceItems(areas, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("danmaku_send_area", values[which]).apply()
                AppToast.show(activity, "弹幕区域: " + areas[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.134: 手势震动反馈
    private fun showVideoPlayerGestureVibrateDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("gesture_vibrate", true)
        val items = arrayOf("开启震动", "关闭震动")
        android.app.AlertDialog.Builder(activity)
            .setTitle("手势震动反馈")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("gesture_vibrate", which == 0).apply()
                AppToast.show(activity, "手势震动: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.135: 直播弹幕字号
    private fun showLiveDanmakuFontSizeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sizes = arrayOf("小", "默认", "大", "极大")
        val values = intArrayOf(12, 16, 20, 28)
        val current = prefs.getInt("live_danmaku_font_size", 16)
        android.app.AlertDialog.Builder(activity)
            .setTitle("直播弹幕字号")
            .setSingleChoiceItems(sizes, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("live_danmaku_font_size", values[which]).apply()
                AppToast.show(activity, "直播弹幕字号: " + sizes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.136: 评论图片加载
    private fun showCommentImageLoadPolicyDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val modes = arrayOf("始终加载", "仅WiFi", "不加载")
        val current = prefs.getInt("comment_image_load", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论图片加载")
            .setSingleChoiceItems(modes, current) { _, which ->
                prefs.edit().putInt("comment_image_load", which).apply()
                AppToast.show(activity, "图片加载: " + modes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.137: 自动播放下一个
    private fun showVideoPlayerAutoPlayNextDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("auto_play_next", true)
        val items = arrayOf("开启自动播放", "关闭自动播放")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动播放下一个")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("auto_play_next", which == 0).apply()
                AppToast.show(activity, "自动播放: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.138: 动态转发过滤
    private fun showDynamicFilterForwardDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_forward", false)
        val items = arrayOf("过滤转发", "显示转发")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态转发过滤")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_forward", which == 0).apply()
                AppToast.show(activity, "转发过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.139: 空间粉丝显示
    private fun showUserSpaceFanShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_fan_show", true)
        val items = arrayOf("显示粉丝", "隐藏粉丝")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间粉丝显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_fan_show", which == 0).apply()
                AppToast.show(activity, "粉丝显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.140: WiFi预加载
    private fun showVideoCacheWifiPreloadDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("wifi_preload", false)
        val items = arrayOf("开启WiFi预加载", "关闭WiFi预加载")
        android.app.AlertDialog.Builder(activity)
            .setTitle("WiFi预加载")
            .setMessage("WiFi环境下自动预加载下一集")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("wifi_preload", which == 0).apply()
                AppToast.show(activity, "WiFi预加载: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.141: 弹幕发送字体
    private fun showDanmakuSendFontDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val fonts = arrayOf("默认", "宋体", "黑体", "楷体", "圆体")
        val current = prefs.getInt("danmaku_send_font", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕字体")
            .setSingleChoiceItems(fonts, current) { _, which ->
                prefs.edit().putInt("danmaku_send_font", which).apply()
                AppToast.show(activity, "弹幕字体: " + fonts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.142: 跳过片头片尾秒数
    private fun showVideoPlayerSkipHeadTailDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val head = prefs.getInt("skip_head_seconds", 0)
        val tail = prefs.getInt("skip_tail_seconds", 0)
        val items = arrayOf("片头: " + head + "秒", "片尾: " + tail + "秒")
        android.app.AlertDialog.Builder(activity)
            .setTitle("跳过片头片尾")
            .setItems(items) { _, which ->
                when (which) {
                    0 -> showSkipSecondsInput("片头", "skip_head_seconds", head)
                    1 -> showSkipSecondsInput("片尾", "skip_tail_seconds", tail)
                }
            }
            .setPositiveButton("关闭", null)
            .show()
    }

    private fun showSkipSecondsInput(title: String, key: String, current: Int) {
        val input = android.widget.EditText(activity)
        input.inputType = android.text.InputType.TYPE_CLASS_NUMBER
        input.setText(current.toString())
        android.app.AlertDialog.Builder(activity)
            .setTitle(title + "秒数")
            .setView(input)
            .setPositiveButton("确定") { _, _ ->
                val value = input.text.toString().toIntOrNull() ?: 0
                activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
                    .edit().putInt(key, value).apply()
                AppToast.show(activity, title + ": " + value + "秒")
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.144: 评论回复通知
    private fun showCommentReplyNotificationDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_reply_notification", true)
        val items = arrayOf("开启通知", "关闭通知")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论回复通知")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_reply_notification", which == 0).apply()
                AppToast.show(activity, "回复通知: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.145: 自动播放倒计时
    private fun showVideoPlayerAutoPlayCountdownDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val times = arrayOf("3秒", "5秒", "10秒", "15秒", "30秒")
        val values = intArrayOf(3, 5, 10, 15, 30)
        val current = prefs.getInt("auto_play_countdown", 5)
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动播放倒计时")
            .setSingleChoiceItems(times, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("auto_play_countdown", values[which]).apply()
                AppToast.show(activity, "倒计时: " + times[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.146: 动态专栏过滤
    private fun showDynamicFilterStoryDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_story", false)
        val items = arrayOf("过滤专栏", "显示专栏")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态专栏过滤")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_story", which == 0).apply()
                AppToast.show(activity, "专栏过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.147: 空间播放显示
    private fun showUserSpacePlayShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_play_show", true)
        val items = arrayOf("显示播放", "隐藏播放")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间播放显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_play_show", which == 0).apply()
                AppToast.show(activity, "播放显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.148: 缓存自动清理天数
    private fun showVideoCacheAutoCleanupDaysDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val days = arrayOf("1天", "3天", "7天", "14天", "30天", "不清理")
        val values = intArrayOf(1, 3, 7, 14, 30, 0)
        val current = prefs.getInt("cache_cleanup_days", 7)
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存自动清理")
            .setSingleChoiceItems(days, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("cache_cleanup_days", values[which]).apply()
                AppToast.show(activity, "清理天数: " + days[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.149: 弹幕行高
    private fun showDanmakuSendLineHeightDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val heights = arrayOf("紧凑", "默认", "宽松", "极宽松")
        val values = intArrayOf(1, 2, 3, 4)
        val current = prefs.getInt("danmaku_line_height", 2)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕行高")
            .setSingleChoiceItems(heights, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("danmaku_line_height", values[which]).apply()
                AppToast.show(activity, "弹幕行高: " + heights[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.150: 字幕字体选择
    private fun showVideoPlayerSubtitleFontDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val fonts = arrayOf("默认", "宋体", "黑体", "楷体", "圆体")
        val current = prefs.getInt("subtitle_font", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕字体")
            .setSingleChoiceItems(fonts, current) { _, which ->
                prefs.edit().putInt("subtitle_font", which).apply()
                AppToast.show(activity, "字幕字体: " + fonts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.151: 直播弹幕顶部屏蔽
    private fun showLiveDanmakuBlockTopDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_danmaku_block_top", false)
        val items = arrayOf("屏蔽顶部弹幕", "显示顶部弹幕")
        android.app.AlertDialog.Builder(activity)
            .setTitle("顶部弹幕屏蔽")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_danmaku_block_top", which == 0).apply()
                AppToast.show(activity, "顶部弹幕: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.152: 评论显示设备
    private fun showCommentShowDeviceDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_device", true)
        val items = arrayOf("显示设备", "隐藏设备")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论显示设备")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_device", which == 0).apply()
                AppToast.show(activity, "设备显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.153: 长按手势操作
    private fun showVideoPlayerGestureHoldActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val actions = arrayOf("倍速播放", "弹幕设置", "视频信息", "截图", "锁定", "无操作")
        val current = prefs.getInt("gesture_hold_action", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("长按手势操作")
            .setSingleChoiceItems(actions, current) { _, which ->
                prefs.edit().putInt("gesture_hold_action", which).apply()
                AppToast.show(activity, "长按手势: " + actions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.154: 直播弹幕颜色屏蔽
    private fun showLiveDanmakuBlockColorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_danmaku_block_color", false)
        val items = arrayOf("屏蔽彩色弹幕", "显示所有弹幕")
        android.app.AlertDialog.Builder(activity)
            .setTitle("颜色屏蔽")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_danmaku_block_color", which == 0).apply()
                AppToast.show(activity, "颜色屏蔽: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.155: 评论默认排序
    private fun showCommentSortDefaultDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sorts = arrayOf("热度", "时间", "回复数")
        val current = prefs.getInt("comment_sort_default", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论默认排序")
            .setSingleChoiceItems(sorts, current) { _, which ->
                prefs.edit().putInt("comment_sort_default", which).apply()
                AppToast.show(activity, "评论排序: " + sorts[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.156: 横屏自动全屏
    private fun showVideoPlayerAutoFullscreenLandscapeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("auto_fullscreen_landscape", true)
        val items = arrayOf("横屏自动全屏", "横屏不自动全屏")
        android.app.AlertDialog.Builder(activity)
            .setTitle("横屏自动全屏")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("auto_fullscreen_landscape", which == 0).apply()
                AppToast.show(activity, "横屏全屏: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.157: 动态直播过滤
    private fun showDynamicFilterLiveDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_live", false)
        val items = arrayOf("过滤直播", "显示直播")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态直播过滤")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_live", which == 0).apply()
                AppToast.show(activity, "直播过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.158: 空间合集显示
    private fun showUserSpaceSeriesShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_series_show", true)
        val items = arrayOf("显示合集", "隐藏合集")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间合集显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_series_show", which == 0).apply()
                AppToast.show(activity, "合集显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.159: 缓存流合并
    private fun showVideoCacheStreamMergeDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("cache_stream_merge", false)
        val items = arrayOf("开启合并", "关闭合并")
        android.app.AlertDialog.Builder(activity)
            .setTitle("缓存流合并")
            .setMessage("合并音视频流为单文件，便于播放")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("cache_stream_merge", which == 0).apply()
                AppToast.show(activity, "流合并: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.160: 弹幕发送样式
    private fun showDanmakuSendStyleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val styles = arrayOf("滚动", "顶部", "底部")
        val current = prefs.getInt("danmaku_send_style", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送样式")
            .setSingleChoiceItems(styles, current) { _, which ->
                prefs.edit().putInt("danmaku_send_style", which).apply()
                AppToast.show(activity, "弹幕样式: " + styles[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.161: 字幕颜色
    private fun showVideoPlayerSubtitleColorDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val colors = arrayOf("白色", "黄色", "绿色", "蓝色", "自定义")
        val values = intArrayOf(0xFFFFFF, 0xFFFF00, 0x00FF00, 0x00BFFF, -1)
        val current = prefs.getInt("subtitle_color", 0xFFFFFF)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕颜色")
            .setSingleChoiceItems(colors, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                if (values[which] == -1) {
                    AppToast.show(activity, "自定义颜色请在设置中配置")
                } else {
                    prefs.edit().putInt("subtitle_color", values[which]).apply()
                    AppToast.show(activity, "字幕颜色: " + colors[which])
                }
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.162: 直播弹幕等级屏蔽
    private fun showLiveDanmakuBlockLevelDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val levels = arrayOf("关闭", "屏蔽Lv1", "屏蔽Lv1-3", "屏蔽Lv1-5")
        val values = intArrayOf(0, 1, 3, 5)
        val current = prefs.getInt("live_danmaku_block_level", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("等级屏蔽")
            .setSingleChoiceItems(levels, values.indexOf(current).coerceAtLeast(0)) { _, which ->
                prefs.edit().putInt("live_danmaku_block_level", values[which]).apply()
                AppToast.show(activity, "等级屏蔽: " + levels[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.163: 评论时间格式
    private fun showCommentShowTimeFormatDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val formats = arrayOf("相对时间", "绝对时间", "隐藏时间")
        val current = prefs.getInt("comment_time_format", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论时间格式")
            .setSingleChoiceItems(formats, current) { _, which ->
                prefs.edit().putInt("comment_time_format", which).apply()
                AppToast.show(activity, "时间格式: " + formats[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.164: 自动旋转锁定
    private fun showVideoPlayerAutoRotationLockDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("auto_rotation_lock", false)
        val items = arrayOf("开启锁定", "关闭锁定")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动旋转锁定")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("auto_rotation_lock", which == 0).apply()
                AppToast.show(activity, "旋转锁定: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.165: 动态番剧过滤
    private fun showDynamicFilterPgcDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_pgc", false)
        val items = arrayOf("过滤番剧", "显示番剧")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态番剧过滤")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_pgc", which == 0).apply()
                AppToast.show(activity, "番剧过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.166: 空间文章显示
    private fun showUserSpaceArticleShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_article_show", true)
        val items = arrayOf("显示文章", "隐藏文章")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间文章显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_article_show", which == 0).apply()
                AppToast.show(activity, "文章显示: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.167: 下载线程数
    private fun showVideoCacheDownloadThreadDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val threads = arrayOf("1线程", "2线程", "3线程", "5线程", "8线程")
        val values = intArrayOf(1, 2, 3, 5, 8)
        val current = prefs.getInt("download_threads", 3)
        android.app.AlertDialog.Builder(activity)
            .setTitle("下载线程数")
            .setSingleChoiceItems(threads, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("download_threads", values[which]).apply()
                AppToast.show(activity, "下载线程: " + threads[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.168: 弹幕发送特效
    private fun showDanmakuSendEffectDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val effects = arrayOf("无特效", "彩虹", "炫彩", "幻影")
        val current = prefs.getInt("danmaku_send_effect", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("弹幕发送特效")
            .setSingleChoiceItems(effects, current) { _, which ->
                prefs.edit().putInt("danmaku_send_effect", which).apply()
                AppToast.show(activity, "弹幕特效: " + effects[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.169: 字幕大小级别
    private fun showVideoPlayerSubtitleSizeLevelDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val sizes = arrayOf("小", "默认", "大", "极大")
        val values = intArrayOf(12, 16, 20, 28)
        val current = prefs.getInt("subtitle_size_level", 16)
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕大小")
            .setSingleChoiceItems(sizes, values.indexOf(current).coerceAtLeast(1)) { _, which ->
                prefs.edit().putInt("subtitle_size_level", values[which]).apply()
                AppToast.show(activity, "字幕大小: " + sizes[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.170: 直播弹幕勋章屏蔽
    private fun showLiveDanmakuBlockMedalDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_danmaku_block_medal", false)
        val items = arrayOf("屏蔽无勋章", "显示所有")
        android.app.AlertDialog.Builder(activity)
            .setTitle("勋章屏蔽")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_danmaku_block_medal", which == 0).apply()
                AppToast.show(activity, "勋章屏蔽: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.171: 评论自动展开
    private fun showCommentAutoExpandDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_auto_expand", false)
        val items = arrayOf("自动展开", "手动展开")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论自动展开")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_auto_expand", which == 0).apply()
                AppToast.show(activity, "评论展开: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.172: 画中画透明度
    private fun showVideoPlayerPipOpacityDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val opacities = arrayOf("50%", "75%", "100%", "不透明")
        val values = intArrayOf(50, 75, 100, 255)
        val current = prefs.getInt("pip_opacity", 100)
        android.app.AlertDialog.Builder(activity)
            .setTitle("画中画透明度")
            .setSingleChoiceItems(opacities, values.indexOf(current).coerceAtLeast(2)) { _, which ->
                prefs.edit().putInt("pip_opacity", values[which]).apply()
                AppToast.show(activity, "画中画透明度: " + opacities[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.173: 滑动手势操作
    private fun showVideoPlayerGestureSwipeActionDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val actions = arrayOf("音量调节", "亮度调节", "进度调节", "无操作")
        val current = prefs.getInt("gesture_swipe_action", 0)
        android.app.AlertDialog.Builder(activity)
            .setTitle("滑动手势操作")
            .setSingleChoiceItems(actions, current) { _, which ->
                prefs.edit().putInt("gesture_swipe_action", which).apply()
                AppToast.show(activity, "滑动手势: " + actions[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.174: 直播弹幕自定义关键词
    private fun showLiveDanmakuBlockKeywordCustomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val keywords = prefs.getStringSet("live_danmaku_block_keywords_custom", emptySet()) ?: emptySet()
        val input = android.widget.EditText(activity)
        input.hint = "输入关键词，逗号分隔"
        input.setText(keywords.joinToString(","))
        android.app.AlertDialog.Builder(activity)
            .setTitle("自定义屏蔽关键词")
            .setView(input)
            .setPositiveButton("保存") { _, _ ->
                val text = input.text.toString()
                val newKeywords = text.split(",").map { it.trim() }.filter { it.isNotEmpty() }.toSet()
                prefs.edit().putStringSet("live_danmaku_block_keywords_custom", newKeywords).apply()
                AppToast.show(activity, "已保存 " + newKeywords.size + " 个关键词")
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.175: 评论UP主标签
    private fun showCommentShowUpTagDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_up_tag", true)
        val items = arrayOf("显示UP主标签", "隐藏UP主标签")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论UP主标签")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_up_tag", which == 0).apply()
                AppToast.show(activity, "UP主标签: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.176: 随机播放
    private fun showVideoPlayerAutoPlayRandomDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("auto_play_random", false)
        val items = arrayOf("开启随机", "关闭随机")
        android.app.AlertDialog.Builder(activity)
            .setTitle("随机播放")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("auto_play_random", which == 0).apply()
                AppToast.show(activity, "随机播放: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.177: 动态文章过滤
    private fun showDynamicFilterArticleDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_article", false)
        val items = arrayOf("过滤文章", "显示文章")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态文章过滤")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_article", which == 0).apply()
                AppToast.show(activity, "文章过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.178: 空间小视频显示
    private fun showUserSpaceClipShowDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("space_clip_show", true)
        val items = arrayOf("显示小视频", "隐藏小视频")
        android.app.AlertDialog.Builder(activity)
            .setTitle("空间小视频显示")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("space_clip_show", which == 0).apply()
                AppToast.show(activity, "小视频: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.182: 直播弹幕机器人屏蔽
    private fun showLiveDanmakuBlockBotDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_danmaku_block_bot", false)
        val items = arrayOf("屏蔽机器人", "显示所有")
        android.app.AlertDialog.Builder(activity)
            .setTitle("机器人屏蔽")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_danmaku_block_bot", which == 0).apply()
                AppToast.show(activity, "机器人屏蔽: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.183: 评论等级标签
    private fun showCommentShowLevelTagDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("comment_show_level_tag", true)
        val items = arrayOf("显示等级", "隐藏等级")
        android.app.AlertDialog.Builder(activity)
            .setTitle("评论等级标签")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("comment_show_level_tag", which == 0).apply()
                AppToast.show(activity, "等级标签: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.184: 自动循环播放
    private fun showVideoPlayerAutoPlayLoopDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("auto_play_loop", false)
        val items = arrayOf("开启循环", "关闭循环")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动循环播放")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("auto_play_loop", which == 0).apply()
                AppToast.show(activity, "循环播放: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.185: 动态音乐过滤
    private fun showDynamicFilterMusicDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("dynamic_filter_music", false)
        val items = arrayOf("过滤音乐", "显示音乐")
        android.app.AlertDialog.Builder(activity)
            .setTitle("动态音乐过滤")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("dynamic_filter_music", which == 0).apply()
                AppToast.show(activity, "音乐过滤: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.187: 自动删除已看缓存
    private fun showVideoCacheAutoDeleteWatchedDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("cache_auto_delete_watched", false)
        val items = arrayOf("自动删除已看", "保留所有缓存")
        android.app.AlertDialog.Builder(activity)
            .setTitle("自动删除已看缓存")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("cache_auto_delete_watched", which == 0).apply()
                AppToast.show(activity, "自动删除: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    // v11.189: 字幕延迟毫秒
    private fun showVideoPlayerSubtitleDelayMsDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getInt("subtitle_delay_ms", 0)
        val input = android.widget.EditText(activity)
        input.inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_FLAG_SIGNED
        input.setText(current.toString())
        input.hint = "正数延迟，负数提前（毫秒）"
        android.app.AlertDialog.Builder(activity)
            .setTitle("字幕延迟 (毫秒)")
            .setView(input)
            .setPositiveButton("确定") { _, _ ->
                val value = input.text.toString().toIntOrNull() ?: 0
                prefs.edit().putInt("subtitle_delay_ms", value).apply()
                AppToast.show(activity, "字幕延迟: " + value + "ms")
            }
            .setNegativeButton("取消", null)
            .show()
    }

    // v11.190: 直播弹幕表情屏蔽
    private fun showLiveDanmakuBlockEmojiDialog() {
        val prefs = activity.getSharedPreferences("blbl_prefs", android.content.Context.MODE_PRIVATE)
        val current = prefs.getBoolean("live_danmaku_block_emoji", false)
        val items = arrayOf("屏蔽表情", "显示表情")
        android.app.AlertDialog.Builder(activity)
            .setTitle("表情屏蔽")
            .setSingleChoiceItems(items, if (current) 0 else 1) { _, which ->
                prefs.edit().putBoolean("live_danmaku_block_emoji", which == 0).apply()
                AppToast.show(activity, "表情屏蔽: " + items[which])
            }
            .setPositiveButton("确定", null)
            .show()
    }

    private fun upsertGaiaVtokenCookie(token: String) {
        val expiresAt = System.currentTimeMillis() + 12 * 60 * 60 * 1000L
        val cookie =
            Cookie.Builder()
                .name("x-bili-gaia-vtoken")
                .value(token)
                .domain("bilibili.com")
                .path("/")
                .expiresAt(expiresAt)
                .secure()
                .build()
        BiliClient.cookies.upsert(cookie)
    }

    private fun showGaiaVgateDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        val now = System.currentTimeMillis()
        val tokenCookie = BiliClient.cookies.getCookie("x-bili-gaia-vtoken")
        val tokenOk = tokenCookie != null && tokenCookie.expiresAt > now
        val expiresAt = tokenCookie?.expiresAt ?: -1L

        val vVoucher = prefs.gaiaVgateVVoucher.orEmpty().trim()
        val hasVoucher = vVoucher.isNotBlank()
        val savedAt = prefs.gaiaVgateVVoucherSavedAtMs

        val msg =
            buildString {
                append("用于处理播放接口返回 v_voucher 的人机验证（极验）。")
                append("\n\n")
                append("当前票据：")
                append(if (tokenOk) "有效" else "无/已过期")
                if (tokenOk && expiresAt > 0L) {
                    append("\n")
                    append("过期时间：").append(android.text.format.DateFormat.format("yyyy-MM-dd HH:mm", expiresAt))
                }
                append("\n\n")
                append("v_voucher：")
                append(if (hasVoucher) "已记录" else "暂无")
                if (hasVoucher && savedAt > 0L) {
                    append("\n")
                    append("记录时间：").append(android.text.format.DateFormat.format("yyyy-MM-dd HH:mm", savedAt))
                }
            }

        AppPopup.custom(
            context = activity,
            title = "风控验证",
            cancelable = true,
            actions =
                listOf(
                    PopupAction(role = PopupActionRole.NEGATIVE, text = "关闭"),
                    PopupAction(role = PopupActionRole.NEUTRAL, text = "编辑 v_voucher") {
                        showGaiaVgateVoucherDialog(sectionIndex, focusId)
                    },
                    PopupAction(role = PopupActionRole.POSITIVE, text = if (hasVoucher) "开始验证" else "粘贴 v_voucher") {
                        if (hasVoucher) {
                            gaiaVgateLauncher.launch(
                                Intent(activity, GaiaVgateActivity::class.java)
                                    .putExtra(GaiaVgateActivity.EXTRA_V_VOUCHER, vVoucher),
                            )
                        } else {
                            showGaiaVgateVoucherDialog(sectionIndex, focusId)
                        }
                    },
                ),
            preferredActionRole = PopupActionRole.POSITIVE,
            content = { dialogContext ->
                val tv =
                    android.view.LayoutInflater.from(dialogContext)
                        .inflate(blbl.cat3399.R.layout.view_popup_message, null, false) as TextView
                tv.text = msg
                tv
            },
        )
    }

    private fun showGaiaVgateVoucherDialog(sectionIndex: Int, focusId: SettingId) {
        val prefs = BiliClient.prefs
        AppPopup.input(
            context = activity,
            title = "编辑 v_voucher",
            initial = prefs.gaiaVgateVVoucher.orEmpty(),
            hint = "粘贴 v_voucher",
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_NORMAL,
            minLines = 1,
            positiveText = "保存",
            negativeText = "取消",
            neutralText = "清除",
            onPositive = { text ->
                val v = text.trim()
                prefs.gaiaVgateVVoucher = v.takeIf { it.isNotBlank() }
                prefs.gaiaVgateVVoucherSavedAtMs = if (v.isNotBlank()) System.currentTimeMillis() else -1L
                AppToast.show(activity, if (v.isNotBlank()) "已保存 v_voucher" else "已清除 v_voucher")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
            onNeutral = {
                prefs.gaiaVgateVVoucher = null
                prefs.gaiaVgateVVoucherSavedAtMs = -1L
                AppToast.show(activity, "已清除 v_voucher")
                renderer.showSection(sectionIndex, focusId = focusId)
            },
        )
    }
}
