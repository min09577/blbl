package blbl.cat3399

import android.app.Application
import android.os.Build
import blbl.cat3399.core.emote.ReplyEmotePanelRepository
import blbl.cat3399.core.log.AppLog
import blbl.cat3399.core.log.CrashTracker
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.net.WebCookieMaintainer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class BlblApp : Application() {
    private val appScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onCreate() {
        super.onCreate()
        instance = this
        AppLog.init(this)
        CrashTracker.install(this)
        AppLog.i(
            "Startup",
            "app=${BuildConfig.VERSION_NAME} api=${Build.VERSION.SDK_INT} device=${Build.MANUFACTURER} ${Build.MODEL} abi=${Build.SUPPORTED_ABIS.firstOrNull().orEmpty()}",
        )
        AppLog.i("BlblApp", "onCreate")
        BiliClient.init(this)
        blbl.cat3399.core.ui.GridSpanPolicy
            .init(this)
        blbl.cat3399.feature.live.LiveReminder
            .initChannel(this) // v4.14: 直播提醒通知通道
        appScope.launch {
            runCatching { WebCookieMaintainer.ensureDailyMaintenance() }
                .onFailure { AppLog.w("BlblApp", "daily maintenance failed", it) }
        }
        appScope.launch {
            runCatching { ReplyEmotePanelRepository.warmup(this@BlblApp) }
                .onFailure { AppLog.w("BlblApp", "reply emote warmup failed", it) }
        }
        blbl.cat3399.core.image.ImageLoader.init(BiliClient.cdnOkHttp)
    }

    companion object {
        @JvmStatic
        lateinit var instance: BlblApp
            private set

        fun launchIo(block: suspend CoroutineScope.() -> Unit) {
            instance.appScope.launch(block = block)
        }
    }
}
