/*
 * Copyright 2024 Bilibili
 * This code is part of the Bilibili third party development SDK
 *
 * This code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package blbl.cat3399.feature.player

import android.app.Activity
import blbl.cat3399.core.net.BiliClient

/**
 * v13.14: 亮度记忆
 * 自动记忆用户设置的屏幕亮度，在播放新视频时自动恢复上次亮度
 */
@androidx.annotation.OptIn(androidx.media3.common.util.UnstableApi::class)
object PlayerActivityBrightnessMemory {
    private var lastKnownBrightness = -1f

    /**
     * 应用记忆的亮度（在新视频开始时调用）
     */
    fun applyMemoryBrightness(activity: Activity) {
        if (!BiliClient.prefs.brightnessMemoryEnabled) return
        
        val savedBrightness = BiliClient.prefs.lastVideoBrightness
        if (savedBrightness < 0f) return

        try {
            val attrs = activity.window.attributes
            attrs.screenBrightness = savedBrightness
            activity.window.attributes = attrs
            lastKnownBrightness = savedBrightness
        } catch (e: Exception) {
            // Ignore errors
        }
    }

    /**
     * 保存当前亮度设置（当用户手动调整亮度时调用）
     */
    fun saveCurrentBrightness(activity: Activity) {
        if (!BiliClient.prefs.brightnessMemoryEnabled) return

        try {
            val attrs = activity.window.attributes
            val currentBrightness = attrs.screenBrightness
            if (currentBrightness > 0f) {
                BiliClient.prefs.lastVideoBrightness = currentBrightness
                lastKnownBrightness = currentBrightness
            }
        } catch (e: Exception) {
            // Ignore errors
        }
    }

    /**
     * 获取当前屏幕亮度
     */
    fun getCurrentBrightness(activity: Activity): Float {
        return try {
            activity.window.attributes.screenBrightness
        } catch (e: Exception) {
            -1f
        }
    }

    /**
     * 检查是否应该应用默认亮度（在defaultBrightness < 0时）
     */
    fun shouldApplyMemoryInsteadOfDefault(): Boolean {
        return BiliClient.prefs.brightnessMemoryEnabled && BiliClient.prefs.lastVideoBrightness >= 0f
    }
}
