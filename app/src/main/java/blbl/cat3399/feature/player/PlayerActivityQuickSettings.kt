package blbl.cat3399.feature.player

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import blbl.cat3399.R
import blbl.cat3399.core.net.BiliClient

/**
 * v10.3: 播放器快速设置面板
 */

internal fun PlayerActivity.showQuickSettingsPanel() {
    val existing = binding.root.findViewById<View>(R.id.quick_settings_panel)
    if (existing != null) {
        existing.visibility = View.VISIBLE
        populateQuickSettings(existing as LinearLayout)
        return
    }
    val panel = createQuickSettingsPanel()
    populateQuickSettings(panel)
    binding.root.post {
        val container = binding.root as android.view.ViewGroup
        val params =
            android.widget.FrameLayout
                .LayoutParams(
                    android.widget.FrameLayout.LayoutParams.WRAP_CONTENT,
                    android.widget.FrameLayout.LayoutParams.WRAP_CONTENT,
                ).apply { gravity = android.view.Gravity.CENTER }
        container.addView(panel, params)
    }
}

internal fun PlayerActivity.hideQuickSettingsPanel() {
    binding.root.findViewById<View>(R.id.quick_settings_panel)?.visibility = View.GONE
}

private fun PlayerActivity.createQuickSettingsPanel(): LinearLayout =
    LinearLayout(this).apply {
        id = R.id.quick_settings_panel
        orientation = LinearLayout.VERTICAL
        setBackgroundColor(0xE61A1A2A.toInt())
        setPadding(48, 32, 48, 32)
        elevation = 16f
    }

private fun PlayerActivity.populateQuickSettings(panel: LinearLayout) {
    panel.removeAllViews()

    // Title
    panel.addView(
        TextView(this).apply {
            text = "⚡ 快速设置"
            setTextColor(0xFFFFFFFF.toInt())
            textSize = 18f
            setPadding(0, 0, 0, 20)
        },
    )

    // 1. 弹幕开关
    addToggleRow(panel, "弹幕", session.danmaku.enabled) { enabled ->
        setDanmakuEnabled(enabled)
    }

    // 2. 播放速度
    addSpeedRow(panel)

    // 3. 画质
    addQualityRow(panel)

    // 4. 循环模式
    val loopOn = BiliClient.prefs.videoLoopMode == 1
    addToggleRow(panel, "循环播放", loopOn) { enabled ->
        BiliClient.prefs.videoLoopMode = if (enabled) 1 else 0
        android.widget.Toast
            .makeText(this, if (enabled) "循环播放：开" else "循环播放：关", android.widget.Toast.LENGTH_SHORT)
            .show()
    }

    // 5. 网速指示器
    addToggleRow(panel, "网速指示器", BiliClient.prefs.networkSpeedIndicatorEnabled) { enabled ->
        BiliClient.prefs.networkSpeedIndicatorEnabled = enabled
        if (enabled) initNetworkSpeedIndicator() else releaseNetworkSpeedIndicator()
    }

    // v12.12: 电池电量指示器
    addToggleRow(panel, "电池电量", BiliClient.prefs.playerBatteryIndicatorEnabled) { enabled ->
        BiliClient.prefs.playerBatteryIndicatorEnabled = enabled
        if (enabled) initBatteryIndicator() else releaseBatteryIndicator()
    }

    // 6. 护眼模式
    val eyeOn = BiliClient.prefs.eyeProtectionMode > 0
    addToggleRow(panel, "护眼模式", eyeOn) { enabled ->
        BiliClient.prefs.eyeProtectionMode = if (enabled) 1 else 0
        android.widget.Toast
            .makeText(this, if (enabled) "护眼模式：开" else "护眼模式：关", android.widget.Toast.LENGTH_SHORT)
            .show()
    }

    // Close
    panel.addView(
        TextView(this).apply {
            text = "关闭"
            setTextColor(0xFF999999.toInt())
            textSize = 14f
            setPadding(0, 20, 0, 0)
            setOnClickListener { hideQuickSettingsPanel() }
        },
    )
}

private fun PlayerActivity.addToggleRow(
    panel: LinearLayout,
    label: String,
    initialState: Boolean,
    onToggle: (Boolean) -> Unit,
) {
    val row =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = android.view.Gravity.CENTER_VERTICAL
            setPadding(0, 14, 0, 14)
        }
    row.addView(
        TextView(this).apply {
            text = label
            setTextColor(0xFFFFFFFF.toInt())
            textSize = 15f
            layoutParams = LinearLayout.LayoutParams(0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        },
    )
    var state = initialState
    row.addView(
        TextView(this).apply {
            text = if (state) "开" else "关"
            setTextColor(if (state) 0xFF4CAF50.toInt() else 0xFF999999.toInt())
            textSize = 14f
            setPadding(16, 8, 16, 8)
            setOnClickListener {
                state = !state
                text = if (state) "开" else "关"
                setTextColor(if (state) 0xFF4CAF50.toInt() else 0xFF999999.toInt())
                onToggle(state)
            }
        },
    )
    panel.addView(row)
}

private fun PlayerActivity.addSpeedRow(panel: LinearLayout) {
    val row =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = android.view.Gravity.CENTER_VERTICAL
            setPadding(0, 14, 0, 14)
        }
    row.addView(
        TextView(this).apply {
            text = "播放速度"
            setTextColor(0xFFFFFFFF.toInt())
            textSize = 15f
            layoutParams = LinearLayout.LayoutParams(0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        },
    )
    val speeds = floatArrayOf(0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f, 3.0f)
    val labels = arrayOf("0.5x", "0.75x", "1x", "1.25x", "1.5x", "2x", "3x")
    val currentSpeed = session.playbackSpeed
    for (i in speeds.indices) {
        row.addView(
            TextView(this).apply {
                text = labels[i]
                setTextColor(if (kotlin.math.abs(speeds[i] - currentSpeed) < 0.01f) 0xFF4CAF50.toInt() else 0xFFBBBBBB.toInt())
                textSize = 12f
                setPadding(8, 6, 8, 6)
                setOnClickListener {
                    session = session.copy(playbackSpeed = speeds[i])
                    player?.setPlaybackSpeed(speeds[i])
                    BiliClient.prefs.playerSpeed = speeds[i]
                    hideQuickSettingsPanel()
                    android.widget.Toast
                        .makeText(this@addSpeedRow, "播放速度: ${labels[i]}", android.widget.Toast.LENGTH_SHORT)
                        .show()
                }
            },
        )
    }
    panel.addView(row)
}

private fun PlayerActivity.addQualityRow(panel: LinearLayout) {
    val row =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = android.view.Gravity.CENTER_VERTICAL
            setPadding(0, 14, 0, 14)
        }
    row.addView(
        TextView(this).apply {
            text = "画质"
            setTextColor(0xFFFFFFFF.toInt())
            textSize = 15f
            layoutParams = LinearLayout.LayoutParams(0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        },
    )
    val qns = intArrayOf(127, 120, 116, 112, 80, 64, 32)
    val names = arrayOf("4K", "1080P+", "1080P", "720P", "480P", "360P", "流畅")
    val currentQn = BiliClient.prefs.playerPreferredQn
    for (i in qns.indices) {
        row.addView(
            TextView(this).apply {
                text = names[i]
                setTextColor(if (qns[i] == currentQn) 0xFF4CAF50.toInt() else 0xFFBBBBBB.toInt())
                textSize = 12f
                setPadding(8, 6, 8, 6)
                setOnClickListener {
                    BiliClient.prefs.playerPreferredQn = qns[i]
                    hideQuickSettingsPanel()
                    android.widget.Toast
                        .makeText(this@addQualityRow, "画质: ${names[i]}（下次播放生效）", android.widget.Toast.LENGTH_SHORT)
                        .show()
                }
            },
        )
    }
    panel.addView(row)
}
