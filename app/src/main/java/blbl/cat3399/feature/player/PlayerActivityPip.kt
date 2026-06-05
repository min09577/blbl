package blbl.cat3399.feature.player

import android.app.PictureInPictureParams
import android.os.Build
import android.util.Rational
import blbl.cat3399.core.log.AppLog

/**
 * v4.6: Picture-in-Picture (画中画) support.
 * When user presses back during playback, enter PiP mode instead of finishing.
 */
internal fun PlayerActivity.tryEnterPipOnBack(): Boolean {
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return false
    val engine = player ?: return false
    if (!engine.isPlaying) return false

    return try {
        val params = PictureInPictureParams.Builder()
            .setAspectRatio(Rational(16, 9))
            .build()
        enterPictureInPictureMode(params)
        AppLog.d("PlayerActivity", "Entered PiP mode")
        true
    } catch (e: Exception) {
        AppLog.w("PlayerActivity", "Failed to enter PiP: ${e.message}")
        false
    }
}

internal fun PlayerActivity.handlePipModeChanged(isInPipMode: Boolean) {
    if (isInPipMode) {
        // Hide controls in PiP mode
        setControlsVisible(false)
        // Hide settings panel
        binding.settingsPanel.visibility = android.view.View.GONE
    }
}
