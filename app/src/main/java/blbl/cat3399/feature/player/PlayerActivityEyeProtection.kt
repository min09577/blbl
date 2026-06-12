package blbl.cat3399.feature.player

import android.app.Activity
import android.graphics.Color
import android.view.View
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient

/**
 * v4.9: Eye protection mode (护眼模式).
 * Applies a semi-transparent dark overlay to reduce screen brightness.
 * Works for both PlayerActivity and LivePlayerActivity.
 */
internal fun PlayerActivity.applyEyeProtectionMode() {
    applyEyeProtection(this)
}

internal fun blbl.cat3399.feature.live.LivePlayerActivity.applyEyeProtectionMode() {
    applyEyeProtection(this)
}

private fun applyEyeProtection(activity: Activity) {
    val level = BiliClient.prefs.eyeProtectionMode
    val overlay = activity.findViewById<View?>(R.id.eye_protection_overlay) ?: return
    if (level <= 0) {
        overlay.visibility = View.GONE
        return
    }
    // Alpha values: 1=light(0x22), 2=medium(0x44), 3=heavy(0x66)
    val alpha =
        when (level) {
            1 -> 0x22
            2 -> 0x44
            3 -> 0x66
            else -> 0x00
        }
    overlay.setBackgroundColor(Color.argb(alpha, 0, 0, 0))
    overlay.visibility = View.VISIBLE
    overlay.isClickable = false
    overlay.isFocusable = false
}
