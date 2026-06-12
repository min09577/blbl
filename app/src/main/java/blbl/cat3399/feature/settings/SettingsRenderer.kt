package blbl.cat3399.feature.settings

import android.os.Build
import android.view.KeyEvent
import androidx.core.view.doOnPreDraw
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import blbl.cat3399.BuildConfig
import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.ui.FocusTreeUtils
import blbl.cat3399.databinding.ActivitySettingsBinding
import blbl.cat3399.feature.player.AudioBalanceLevel
import blbl.cat3399.feature.player.engine.IjkPlayerPlugin

class SettingsRenderer(
    private val activity: SettingsActivity,
    private val binding: ActivitySettingsBinding,
    private val state: SettingsState,
    private val sections: List<String>,
    private val leftAdapter: SettingsLeftAdapter,
    private val rightAdapter: SettingsEntryAdapter,
    private val onSectionShown: (String) -> Unit,
) {
    private var focusListener: android.view.ViewTreeObserver.OnGlobalFocusChangeListener? = null
    private val deviceCodecSupportValue: String by lazy { SettingsText.hardDecoderSupportText() }

    fun installFocusListener() {
        if (focusListener != null) return
        focusListener =
            android.view.ViewTreeObserver
                .OnGlobalFocusChangeListener { _, newFocus ->
                    if (newFocus == null) return@OnGlobalFocusChangeListener
                    when {
                        newFocus == binding.btnBack -> {
                            state.pendingRestoreBack = false
                        }

                        FocusTreeUtils.isDescendantOf(newFocus, binding.recyclerLeft) -> {
                            val holder = binding.recyclerLeft.findContainingViewHolder(newFocus) ?: return@OnGlobalFocusChangeListener
                            val pos =
                                holder.bindingAdapterPosition.takeIf { it != RecyclerView.NO_POSITION }
                                    ?: return@OnGlobalFocusChangeListener
                            state.lastFocusedLeftIndex = pos
                            if (state.pendingRestoreLeftIndex == pos) state.pendingRestoreLeftIndex = null
                        }

                        FocusTreeUtils.isDescendantOf(newFocus, binding.recyclerRight) -> {
                            val itemView = binding.recyclerRight.findContainingItemView(newFocus) ?: newFocus
                            val id = itemView.tag as? SettingId
                            if (id != null) state.lastFocusedRightId = id
                            if (state.pendingRestoreRightId == id) state.pendingRestoreRightId = null
                        }
                    }
                }.also { binding.root.viewTreeObserver.addOnGlobalFocusChangeListener(it) }
    }

    fun uninstallFocusListener() {
        focusListener?.let { binding.root.viewTreeObserver.removeOnGlobalFocusChangeListener(it) }
        focusListener = null
    }

    fun showSection(
        index: Int,
        keepScroll: Boolean = index == state.currentSectionIndex,
        focusId: SettingId? = null,
    ) {
        val lm = binding.recyclerRight.layoutManager as? LinearLayoutManager
        val scrollAnchor =
            if (keepScroll && lm != null) {
                val firstVisible = lm.findFirstVisibleItemPosition()
                if (firstVisible != RecyclerView.NO_POSITION) {
                    val anchorView = lm.findViewByPosition(firstVisible) ?: binding.recyclerRight.getChildAt(0)
                    if (anchorView != null) {
                        val anchorPos =
                            binding.recyclerRight.getChildAdapterPosition(anchorView).takeIf { it != RecyclerView.NO_POSITION }
                                ?: firstVisible
                        val anchorOffset = lm.getDecoratedTop(anchorView) - binding.recyclerRight.paddingTop
                        anchorPos to anchorOffset
                    } else {
                        null
                    }
                } else {
                    null
                }
            } else {
                null
            }

        state.currentSectionIndex = index
        if (index in 0 until leftAdapter.itemCount) {
            state.lastFocusedLeftIndex = index
            leftAdapter.setSelected(index)
        }
        val sectionName = sections.getOrNull(index)
        val entries = buildEntriesForSection(sectionName)
        rightAdapter.submit(entries)
        onSectionShown(sectionName.orEmpty())

        state.pendingRestoreRightId = focusId
        val token = ++state.focusRequestToken
        binding.recyclerRight.doOnPreDraw {
            if (token != state.focusRequestToken) return@doOnPreDraw
            if (keepScroll && lm != null) {
                scrollAnchor?.let { (position, offset) ->
                    lm.scrollToPositionWithOffset(position, offset)
                }
            }
            restorePendingFocus()
        }
    }

    fun refreshSection(focusId: SettingId? = null) {
        showSection(state.currentSectionIndex, focusId = focusId)
    }

    fun refreshAboutSectionKeepPosition() {
        if (sections.getOrNull(state.currentSectionIndex) != "关于应用") return
        showSection(state.currentSectionIndex, keepScroll = true, focusId = state.lastFocusedRightId)
    }

    fun ensureInitialFocus() {
        if (activity.currentFocus != null) return
        if (restorePendingFocus()) return
        focusLeftAt(state.lastFocusedLeftIndex.coerceAtLeast(0))
    }

    fun restorePendingFocus(): Boolean {
        if (state.pendingRestoreBack) {
            state.pendingRestoreBack = false
            binding.btnBack.requestFocus()
            return true
        }

        state.pendingRestoreRightId?.let { pendingRightId ->
            if (focusRightById(pendingRightId)) return true
            state.pendingRestoreRightId = null
        }

        val currentFocus = activity.currentFocus
        if (currentFocus?.isAttachedToWindow == true) {
            when {
                currentFocus == binding.btnBack -> return true
                FocusTreeUtils.isDescendantOf(currentFocus, binding.recyclerLeft) -> return true
                FocusTreeUtils.isDescendantOf(currentFocus, binding.recyclerRight) -> return true
            }
        }

        val rightId = state.lastFocusedRightId
        if (rightId != null) {
            if (focusRightById(rightId)) return true
        }

        val leftIndex = state.pendingRestoreLeftIndex ?: state.lastFocusedLeftIndex
        if (focusLeftAt(leftIndex)) {
            return true
        }

        binding.btnBack.requestFocus()
        return true
    }

    fun focusSectionTab(index: Int): Boolean {
        val count = leftAdapter.itemCount
        if (count <= 0) return false
        val safeIndex =
            index.takeIf { it in 0 until count }
                ?: state.lastFocusedLeftIndex.takeIf { it in 0 until count }
                ?: 0
        return focusLeftAt(safeIndex)
    }

    fun isNavKey(keyCode: Int): Boolean =
        when (keyCode) {
            KeyEvent.KEYCODE_DPAD_UP,
            KeyEvent.KEYCODE_DPAD_DOWN,
            KeyEvent.KEYCODE_DPAD_LEFT,
            KeyEvent.KEYCODE_DPAD_RIGHT,
            KeyEvent.KEYCODE_DPAD_CENTER,
            KeyEvent.KEYCODE_ENTER,
            KeyEvent.KEYCODE_NUMPAD_ENTER,
            KeyEvent.KEYCODE_TAB,
            -> true

            else -> false
        }

    private fun buildEntriesForSection(sectionName: String?): List<SettingEntry> {
        val prefs = BiliClient.prefs
        return when (sectionName) {
            "通用设置" ->
                listOf(
                    SettingEntry(SettingId.ImageQuality, "图片质量", prefs.imageQuality, null),
                    SettingEntry(SettingId.ThemePreset, "主题", SettingsText.themePresetText(prefs.themePreset), null),
                    SettingEntry(SettingId.ApiSource, "接口类别", SettingsText.apiSourceText(prefs.apiSource), null),
                    SettingEntry(SettingId.UserAgent, "User-Agent", prefs.userAgent.take(60), null),
                    SettingEntry(SettingId.Ipv4OnlyEnabled, "是否只允许使用IPV4", if (prefs.ipv4OnlyEnabled) "开" else "关", null),
                    SettingEntry(SettingId.GaiaVgate, "风控验证", gaiaVgateStatusText(), "播放被拦截后可在此手动完成人机验证"),
                    SettingEntry(SettingId.ClearCache, "清理缓存", cacheSizeText(), null),
                    SettingEntry(SettingId.ConfigTransfer, "导出/入配置", "打开", null),
                    SettingEntry(SettingId.ClearLogin, "清除登录", loginStatusText(), null),
                )

            "页面设置" ->
                listOf(
                    SettingEntry(SettingId.StartupPage, "启动默认页", SettingsText.startupPageText(activity, prefs.startupPage), null),
                    SettingEntry(SettingId.GridSpanCount, "每行卡片数量", SettingsText.gridSpanText(prefs.gridSpanCount), null),
                    SettingEntry(
                        SettingId.DynamicGridSpanCount,
                        "动态页每行卡片数量",
                        SettingsText.gridSpanText(prefs.dynamicGridSpanCount),
                        null,
                    ),
                    SettingEntry(SettingId.PgcGridSpanCount, "番剧/电视剧每行卡片数量", SettingsText.gridSpanText(prefs.pgcGridSpanCount), null),
                    SettingEntry(SettingId.UiScaleFactor, "界面大小", SettingsText.uiScaleFactorText(prefs.uiScaleFactor), null),
                    // v5.0: 字体大小
                    SettingEntry(SettingId.FontScaleFactor, "字体大小", SettingsText.fontScaleFactorText(prefs.fontScaleFactor), null),
                    SettingEntry(SettingId.FullscreenEnabled, "以全屏模式运行", if (prefs.fullscreenEnabled) "开" else "关", null),
                    SettingEntry(SettingId.AvoidDisplayCutout, "避开挖孔/圆角区域", if (prefs.avoidDisplayCutout) "开" else "关", null),
                    SettingEntry(SettingId.TabSwitchFollowsFocus, "tab跟随焦点切换", if (prefs.tabSwitchFollowsFocus) "开" else "关", null),
                    SettingEntry(
                        SettingId.MainAutoHideSidebarOnEnterContent,
                        "进入内容区后关闭侧边栏",
                        if (prefs.mainAutoHideSidebarOnEnterContent) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.MainBackFocusScheme,
                        "返回键焦点策略",
                        SettingsText.mainBackFocusSchemeText(prefs.mainBackFocusScheme),
                        null,
                    ),
                    // v4.10: 侧边栏Tab隐藏
                    SettingEntry(
                        SettingId.HiddenSidebarTabs,
                        "隐藏侧边栏页面",
                        if (prefs.hiddenSidebarTabs.isEmpty()) "无" else "${prefs.hiddenSidebarTabs.size}个已隐藏",
                        null,
                    ),
                    SettingEntry(
                        SettingId.VideoCardLongPressAction,
                        "长按视频卡片",
                        SettingsText.videoCardLongPressActionText(prefs.videoCardLongPressAction),
                        null,
                    ),
                    SettingEntry(SettingId.CustomPageEnabled, "自定义页", if (prefs.customPageConfig.enabled) "开" else "关", null),
                    SettingEntry(
                        SettingId.CustomPageContent,
                        "自定义页内容",
                        SettingsText.customPageContentText(prefs.customPageConfig),
                        null,
                    ),
                    SettingEntry(
                        SettingId.DynamicFollowingRecentUpdateDotEnabled,
                        "动态页小红点",
                        if (prefs.dynamicFollowingRecentUpdateDotEnabled) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.FollowingListOrder,
                        "关注列表排序",
                        SettingsText.followingListOrderText(prefs.followingListOrder),
                        null,
                    ),
                    SettingEntry(
                        SettingId.MainHomeVisibleTabs,
                        "主页显示页面",
                        SettingsText.mainHomeVisibleTabsText(activity, prefs.mainHomeVisibleTabs),
                        null,
                    ),
                    SettingEntry(
                        SettingId.MainCategoryVisibleTabs,
                        "分类页显示页面",
                        SettingsText.mainCategoryVisibleTabsText(prefs.mainCategoryVisibleTabs),
                        null,
                    ),
                    SettingEntry(
                        SettingId.MainLiveVisibleTabs,
                        "直播页显示页面",
                        SettingsText.mainLiveVisibleTabsText(prefs.mainLiveVisibleTabs),
                        null,
                    ),
                    SettingEntry(
                        SettingId.MainMyVisibleTabs,
                        "我的页显示页面",
                        SettingsText.mainMyVisibleTabsText(activity, prefs.mainMyVisibleTabs),
                        null,
                    ),
                )

            "播放设置" ->
                listOf(
                    SettingEntry(SettingId.PlayerPreferredQn, "默认画质", SettingsText.qnText(prefs.playerPreferredQn), null),
                    SettingEntry(
                        SettingId.PlayerPreferredQnPortrait,
                        "默认画质（竖屏）",
                        SettingsText.qnText(prefs.playerPreferredQnPortrait),
                        null,
                    ),
                    SettingEntry(SettingId.PlayerPreferredAudioId, "默认音轨", SettingsText.audioText(prefs.playerPreferredAudioId), null),
                    SettingEntry(SettingId.PlayerSpeed, "默认播放速度", String.format(java.util.Locale.US, "%.2fx", prefs.playerSpeed), null),
                    SettingEntry(
                        SettingId.PlayerShortSeekStepSeconds,
                        "点按快进秒数",
                        SettingsText.seekStepSecondsText(prefs.playerShortSeekStepSeconds),
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerHoldSeekSpeed,
                        "长按快进倍率",
                        String.format(java.util.Locale.US, "%.2fx", prefs.playerHoldSeekSpeed),
                        null,
                    ),
                    SettingEntry(SettingId.PlayerHoldSeekMode, "长按快进模式", SettingsText.holdSeekModeText(prefs.playerHoldSeekMode), null),
                    SettingEntry(
                        SettingId.PlayerHoldScrubTraverseSeconds,
                        "拖完整个视频所需时间",
                        SettingsText.seekStepSecondsText(prefs.playerHoldScrubTraverseSeconds),
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerHoldScrubFixedStepSeconds,
                        "固定时间拖动进度条间隔",
                        SettingsText.seekStepSecondsText(prefs.playerHoldScrubFixedStepSeconds),
                        null,
                    ),
                    SettingEntry(SettingId.PlayerAutoResumeEnabled, "自动跳到上次播放位置", if (prefs.playerAutoResumeEnabled) "开" else "关", null),
                    SettingEntry(
                        SettingId.PlayerAutoSkipSegmentsEnabled,
                        "自动跳过片段（空降助手）",
                        if (prefs.playerAutoSkipSegmentsEnabled) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerAutoSkipServerBaseUrl,
                        "空降助手服务器地址",
                        prefs.playerAutoSkipServerBaseUrl,
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerOpenDetailBeforePlay,
                        "播放前打开详情页",
                        if (prefs.playerOpenDetailBeforePlay) "开" else "关",
                        null,
                    ),
                    SettingEntry(SettingId.PlayerPlaybackMode, "播放模式", SettingsText.playbackModeText(prefs.playerPlaybackMode), null),
                    SettingEntry(
                        SettingId.PlayerSettingsApplyToGlobal,
                        "播放器设置应用到全局",
                        if (prefs.playerSettingsApplyToGlobal) "开" else "关",
                        null,
                    ),
                    SettingEntry(SettingId.SubtitlePreferredLang, "字幕语言", SettingsText.subtitleLangText(prefs.subtitlePreferredLang), null),
                    SettingEntry(SettingId.SubtitleTextSizeSp, "字幕字体大小", prefs.subtitleTextSizeSp.toInt().toString(), null),
                    SettingEntry(
                        SettingId.SubtitleBottomPaddingFraction,
                        "字幕底部间距",
                        SettingsText.subtitleBottomPaddingText(prefs.subtitleBottomPaddingFraction),
                        null,
                    ),
                    SettingEntry(
                        SettingId.SubtitleBackgroundOpacity,
                        "字幕背景透明度",
                        SettingsText.subtitleBackgroundOpacityText(prefs.subtitleBackgroundOpacity),
                        null,
                    ),
                    SettingEntry(SettingId.SubtitleEnabledDefault, "默认开启字幕", if (prefs.subtitleEnabledDefault) "开" else "关", null),
                    SettingEntry(SettingId.PlayerPreferredCodec, "视频编码", prefs.playerPreferredCodec, null),
                    SettingEntry(SettingId.PlayerOsdButtons, "OSD按钮显示", SettingsText.playerOsdButtonsText(prefs.playerOsdButtons), null),
                    SettingEntry(SettingId.PlayerUpQuickCardEnabled, "UP关注卡片", if (prefs.playerUpQuickCardEnabled) "开" else "关", null),
                    SettingEntry(SettingId.PlayerDoubleBackToExit, "按两次退出键才退出播放器", if (prefs.playerDoubleBackToExit) "开" else "关", null),
                    SettingEntry(
                        SettingId.PlayerDownKeyOsdFocusTarget,
                        "下键呼出OSD后焦点",
                        SettingsText.downKeyOsdFocusTargetText(prefs.playerDownKeyOsdFocusTarget),
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerTogglePlayStateShowOsd,
                        "全屏下切换播放状态是否弹出OSD",
                        if (prefs.playerTogglePlayStateShowOsd) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerPersistentBottomProgressEnabled,
                        "底部常驻进度条",
                        if (prefs.playerPersistentBottomProgressEnabled) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerPersistentClockEnabled,
                        "常驻时间显示",
                        if (prefs.playerPersistentClockEnabled) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerTouchGesturesEnabled,
                        "触摸手势",
                        if (prefs.playerTouchGesturesEnabled) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.DoubleTapAction,
                        "双击动作",
                        SettingsText.doubleTapActionText(prefs.doubleTapAction),
                        null,
                    ),
                    SettingEntry(
                        SettingId.DataSaverMode,
                        "省流模式",
                        if (prefs.dataSaverMode) "开" else "关",
                        null,
                    ),
                    SettingEntry(
                        SettingId.PlayerVideoShotPreviewSize,
                        "缩略图显示",
                        SettingsText.videoShotPreviewSizeText(prefs.playerVideoShotPreviewSize),
                        null,
                    ),
                    // v11.4: 自动展开视频简介
                    SettingEntry(
                        SettingId.AutoExpandDesc,
                        "自动展开视频简介",
                        if (prefs.autoExpandDesc) "开" else "关",
                        null,
                    ),
                )

            "其他设置" ->
                listOf(
                    SettingEntry(SettingId.PlayerRenderView, "渲染视图", SettingsText.renderViewText(prefs.playerRenderViewType), null),
                    SettingEntry(SettingId.PlayerEngineKind, "播放器内核", SettingsText.playerEngineText(prefs.playerEngineKind), null),
                    SettingEntry(
                        SettingId.PlayerCustomShortcuts,
                        "自定义播放快捷键",
                        prefs.playerCustomShortcuts.let { if (it.isEmpty()) "未设置" else "已设置 ${it.size} 个" },
                        "播放时按指定按键执行动作或切换播放设置（再按一次切回上次值）",
                    ),
                    SettingEntry(
                        SettingId.PlayerAudioBalance,
                        "音频平衡",
                        AudioBalanceLevel.fromPrefValue(prefs.playerAudioBalanceLevel).label,
                        null,
                    ),
                    SettingEntry(SettingId.PlayerCdnPreference, "CDN线路", SettingsText.cdnText(prefs.playerCdnPreference), null),
                    SettingEntry(
                        SettingId.LiveHighBitrateEnabled,
                        "提高直播码率",
                        if (prefs.liveHighBitrateEnabled) "开" else "关",
                        "如果直播遇到问题,请关闭此功能",
                    ),
                    SettingEntry(SettingId.PlayerDebugEnabled, "显示视频调试信息", if (prefs.playerDebugEnabled) "开" else "关", null),
                )

            "弹幕设置" ->
                listOf(
                    SettingEntry(SettingId.DanmakuEnabled, "弹幕开关", if (prefs.danmakuEnabled) "开" else "关", null),
                    SettingEntry(
                        SettingId.DanmakuOpacity,
                        "弹幕透明度",
                        String.format(java.util.Locale.US, "%.2f", prefs.danmakuOpacity),
                        null,
                    ),
                    SettingEntry(SettingId.DanmakuTextSizeSp, "弹幕字体大小", prefs.danmakuTextSizeSp.toInt().toString(), null),
                    SettingEntry(SettingId.DanmakuFontWeight, "字体粗细", SettingsText.danmakuFontWeightText(prefs.danmakuFontWeight), null),
                    SettingEntry(SettingId.DanmakuStrokeWidthPx, "弹幕文字描边粗细", prefs.danmakuStrokeWidthPx.toString(), null),
                    SettingEntry(SettingId.DanmakuArea, "弹幕占屏比", SettingsText.areaText(prefs.danmakuArea), null),
                    SettingEntry(SettingId.DanmakuLaneDensity, "轨道密度", SettingsText.danmakuLaneDensityText(prefs.danmakuLaneDensity), null),
                    SettingEntry(SettingId.DanmakuSpeed, "弹幕速度", prefs.danmakuSpeed.toString(), null),
                    SettingEntry(SettingId.DanmakuFollowBiliShield, "跟随B站弹幕屏蔽", if (prefs.danmakuFollowBiliShield) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuShowHighLikeIcon, "显示高赞弹幕图标", if (prefs.danmakuShowHighLikeIcon) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuAiShieldEnabled, "智能云屏蔽", if (prefs.danmakuAiShieldEnabled) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuAiShieldLevel, "智能云屏蔽等级", SettingsText.aiLevelText(prefs.danmakuAiShieldLevel), null),
                    SettingEntry(SettingId.DanmakuAllowScroll, "允许滚动弹幕", if (prefs.danmakuAllowScroll) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuAllowTop, "允许顶部悬停弹幕", if (prefs.danmakuAllowTop) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuAllowBottom, "允许底部悬停弹幕", if (prefs.danmakuAllowBottom) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuAllowColor, "允许彩色弹幕", if (prefs.danmakuAllowColor) "开" else "关", null),
                    SettingEntry(SettingId.DanmakuAllowSpecial, "允许特殊弹幕", if (prefs.danmakuAllowSpecial) "开" else "关", null),
                )

            "关于应用" ->
                listOf(
                    SettingEntry(SettingId.AppVersion, "版本", BuildConfig.VERSION_NAME, null),
                    SettingEntry(SettingId.ProjectUrl, "项目地址", SettingsConstants.PROJECT_URL, null),
                    SettingEntry(SettingId.QqGroup, "QQ交流群", SettingsConstants.QQ_GROUP, null),
                    SettingEntry(SettingId.About, "关于软件", "点击查看", null), // v12.1
                    SettingEntry(SettingId.DownloadManagement, "下载管理", "管理已下载视频", null), // v12.3
                    SettingEntry(SettingId.CastManagement, "投屏管理", "搜索设备 / 自动重连", null), // v12.4
                    SettingEntry(SettingId.NetworkDiagnostics, "网络诊断", "测试连接状态", null), // v12.5
                    SettingEntry(SettingId.WatchStatistics, "播放统计", "查看观看数据", null), // v12.6
                    SettingEntry(SettingId.HistoryManagement, "历史记录管理", "清理 / 导出历史", null), // v12.7
                    SettingEntry(SettingId.CacheManagement, "缓存管理", "查看 / 清理缓存", null), // v12.8
                    SettingEntry(SettingId.RemoteHelp, "快捷键帮助", "遥控器操作指南", null), // v12.9
                    SettingEntry(SettingId.AutoUpdateCheck, "检查更新", "查看最新版本", null), // v12.10
                    SettingEntry(SettingId.VideoInfoEnhanced, "视频信息", "显示编码/码率/分辨率", null), // v12.11
                    SettingEntry(SettingId.PlayerGestureEnhanced, "手势设置", "双击快进/快退", null), // v12.12
                    SettingEntry(SettingId.PictureInPictureShortcut, "画中画", "画中画模式开关", null), // v12.13
                    SettingEntry(SettingId.AudioEffectSettings, "音效设置", "音频增强/均衡器", null), // v12.14
                    SettingEntry(SettingId.SubtitleStyleSettings, "字幕样式", "字幕字体/大小/颜色", null), // v12.15
                    SettingEntry(SettingId.LiveDanmakuSettings, "直播弹幕", "弹幕速度/密度/字体", null), // v12.16
                    SettingEntry(SettingId.SearchHistoryManagement, "搜索历史", "查看/清理搜索记录", null), // v12.17
                    SettingEntry(SettingId.QuickQualitySwitch, "画质切换", "快速切换视频画质", null), // v12.18
                    SettingEntry(SettingId.LiveDanmakuOpacity, "弹幕透明度", "调整直播弹幕透明度", null), // v12.19
                    SettingEntry(SettingId.ProgressBarPreview, "进度条预览", "拖动进度条时显示预览", null), // v12.20
                    SettingEntry(SettingId.SleepTimer, "定时关闭", "设置自动停止播放时间", null), // v12.21
                    SettingEntry(SettingId.ScreenshotShare, "截图分享", "截取当前画面并分享", null), // v12.22
                    SettingEntry(SettingId.DanmakuPosition, "弹幕位置", "调整弹幕显示区域", null), // v12.23
                    SettingEntry(SettingId.VolumeBoost, "音量增强", "提升播放音量", null), // v12.24
                    SettingEntry(SettingId.VideoLoop, "视频循环", "单视频循环播放", null), // v12.25
                    SettingEntry(SettingId.SpeedMemory, "倍速记忆", "记住上次播放速度", null), // v12.26
                    SettingEntry(SettingId.SkipIntroOutro, "自动跳过片头/片尾", "跳过片头/片尾", null), // v12.27
                    SettingEntry(SettingId.DanmakuKeywordFilter, "弹幕关键词屏蔽", "过滤弹幕", null), // v12.28
                    SettingEntry(SettingId.ScreenFitMode, "屏幕适配", "调整画面比例", null), // v12.29
                    SettingEntry(SettingId.LiveReplay, "直播回放", "断线自动重连", null), // v12.30
                    SettingEntry(SettingId.ScreenshotSavePath, "截图保存路径", "选择保存位置", null), // v12.31
                    SettingEntry(SettingId.DanmakuFontCustom, "弹幕字体", "自定义弹幕字体", null), // v12.32
                    SettingEntry(SettingId.BrightnessMemory, "亮度记忆", "记住视频亮度", null), // v12.33
                    SettingEntry(SettingId.AutoPlayNext, "自动播放下一集", "视频结束自动播放", null), // v12.34
                    SettingEntry(SettingId.LiveGiftFilter, "直播礼物过滤", "过滤礼物/进入通知", null), // v12.35
                    SettingEntry(SettingId.CacheSizeLimit, "缓存大小限制", "限制缓存占用", null), // v12.36
                    SettingEntry(SettingId.DanmakuSpeedCustom, "弹幕速度", "自定义弹幕滚动速度", null), // v12.37
                    SettingEntry(SettingId.PlayerLongPressAction, "长按动作", "设置长按操作", null), // v12.38
                    SettingEntry(SettingId.WifiAutoQuality, "WiFi自动画质", "WiFi下自动高画质", null), // v12.39
                    SettingEntry(SettingId.CommentSortMode, "评论排序", "按热度/时间排序", null), // v12.40
                    SettingEntry(SettingId.PlayerSwipeGesture, "滑动手势", "播放器滑动操作", null), // v12.41
                    SettingEntry(SettingId.DanmakuAlphaCustom, "弹幕透明度", "自定义弹幕透明度", null), // v12.42
                    SettingEntry(SettingId.PlayerAutoRotate, "自动旋转", "屏幕旋转设置", null), // v12.43
                    SettingEntry(SettingId.NotificationControl, "通知栏控制", "通知栏播放控制", null), // v12.44
                    SettingEntry(SettingId.VideoPreload, "视频预加载", "提前加载视频数据", null), // v12.45
                    SettingEntry(SettingId.HistorySync, "历史记录同步", "同步观看历史", null), // v12.46
                    SettingEntry(SettingId.PlayerDecoderPriority, "解码器优先级", "硬解/软解策略", null), // v12.47
                    SettingEntry(SettingId.DanmakuMergeMode, "弹幕合并", "合并相似弹幕", null), // v12.48
                    SettingEntry(SettingId.PlayerAudioDelay, "音频延迟", "音视频同步调整", null), // v12.49
                    SettingEntry(SettingId.LiveStreamQuality, "直播画质", "默认直播画质", null), // v12.50
                    SettingEntry(SettingId.PlayerKeyMapping, "按键映射", "自定义遥控器按键", null), // v12.51
                    SettingEntry(SettingId.DanmakuSendHistory, "弹幕发送历史", "查看/清空历史", null), // v12.52
                    SettingEntry(SettingId.DanmakuSendHistoryLimit, "弹幕历史数量", "自定义历史记录数量", null), // v12.3
                    SettingEntry(SettingId.PlayerBufferStrategy, "缓冲策略", "预加载/节省流量", null), // v12.53
                    SettingEntry(SettingId.LiveAutoFollow, "直播自动关注", "多次观看自动关注", null), // v12.54
                    SettingEntry(SettingId.VideoCodecPreference, "视频编码", "H.264/H.265/AV1", null), // v12.55
                    SettingEntry(SettingId.PlayerSubtitleSize, "字幕大小", "调整字幕显示大小", null), // v12.56
                    SettingEntry(SettingId.DanmakuAreaCustom, "弹幕区域", "限制弹幕显示范围", null), // v12.57
                    SettingEntry(SettingId.PlayerAspectRatio, "画面比例", "切换显示比例", null), // v12.58
                    SettingEntry(SettingId.LiveChatFontsize, "聊天字体", "直播聊天字体大小", null), // v12.59
                    SettingEntry(SettingId.VideoCacheStrategy, "缓存策略", "视频缓存行为", null), // v12.60
                    SettingEntry(SettingId.PlayerBackgroundPlay, "后台播放", "退出后继续播放", null), // v12.61
                    SettingEntry(SettingId.DanmakuFontStyle, "弹幕字体样式", "默认/粗体/斜体", null), // v12.62
                    SettingEntry(SettingId.PlayerDoubleTapAction, "双击动作", "快进/点赞/无", null), // v12.63
                    SettingEntry(SettingId.LiveAutoReconnect, "直播自动重连", "断线自动重连", null), // v12.64
                    SettingEntry(SettingId.VideoLoadTimeout, "加载超时", "视频加载超时时间", null), // v12.65
                    SettingEntry(SettingId.PlayerGestureFeedback, "手势反馈", "视觉/振动反馈", null), // v12.66
                    SettingEntry(SettingId.DanmakuShowUid, "弹幕显示UID", "显示发送者UID", null), // v12.67
                    SettingEntry(SettingId.PlayerStartupAction, "启动动作", "播放器启动行为", null), // v12.68
                    SettingEntry(SettingId.LiveStreamCodec, "直播编码", "H.264/H.265选择", null), // v12.69
                    SettingEntry(SettingId.VideoNetworkStrategy, "网络策略", "CDN/P2P策略", null), // v12.70
                    SettingEntry(SettingId.PlayerUiVisibility, "UI显示", "播放器界面元素", null), // v12.71
                    SettingEntry(SettingId.DanmakuBlockUser, "弹幕屏蔽用户", "屏蔽指定用户弹幕", null), // v12.72
                    SettingEntry(SettingId.PlayerAutoFullscreen, "自动全屏", "进入播放器自动全屏", null), // v12.73
                    SettingEntry(SettingId.LiveNotification, "直播提醒", "关注主播开播提醒", null), // v12.74
                    SettingEntry(SettingId.VideoQualityProfile, "画质配置", "WiFi/移动画质设置", null), // v12.75
                    SettingEntry(SettingId.PlayerLockScreen, "锁定屏幕", "禁用触摸手势", null), // v12.76
                    SettingEntry(SettingId.DanmakuScrollSpeed, "弹幕滚动速度", "慢速/正常/快速", null), // v12.77
                    SettingEntry(SettingId.PlayerSkipCredits, "跳过片尾", "自动跳到下一集", null), // v12.78
                    SettingEntry(SettingId.LiveDanmakuFontsize, "直播弹幕字体", "调整直播弹幕大小", null), // v12.79
                    SettingEntry(SettingId.VideoAutoSkip, "自动跳过", "跳过无效内容", null), // v12.80
                    SettingEntry(SettingId.PlayerSwipeVolume, "滑动音量", "上下滑动调节音量", null), // v12.81
                    SettingEntry(SettingId.DanmakuInputBorder, "输入框样式", "弹幕输入框外观", null), // v12.82
                    SettingEntry(SettingId.PlayerChromecast, "Chromecast", "Google投屏", null), // v12.83
                    SettingEntry(SettingId.LiveChatEmoji, "聊天表情", "直播聊天表情显示", null), // v12.84
                    SettingEntry(SettingId.VideoAutoNext, "自动下一集", "自动播放下一集", null), // v12.85
                    SettingEntry(SettingId.PlayerBrightnessMemory, "亮度记忆", "记住视频亮度", null), // v12.86
                    SettingEntry(SettingId.DanmakuMergeInterval, "弹幕合并间隔", "合并重复弹幕", null), // v12.87
                    SettingEntry(SettingId.PlayerLongPressSpeed, "长按倍速", "长按加速播放", null), // v12.88
                    SettingEntry(SettingId.LiveAutoQuality, "直播自动画质", "自动选择最佳画质", null), // v12.89
                    SettingEntry(SettingId.VideoPrebufferSize, "预缓冲大小", "视频预加载量", null), // v12.90
                    SettingEntry(SettingId.PlayerSubtitleBg, "字幕背景", "字幕背景样式", null), // v12.91
                    SettingEntry(SettingId.DanmakuHistory, "弹幕发送历史", "记住发送内容", null), // v12.92
                    SettingEntry(SettingId.PlayerBufferingStrategy, "缓冲策略", "默认/激进/保守", null), // v12.93
                    SettingEntry(
                        SettingId.NetworkSpeedIndicator,
                        "网络速度",
                        if (prefs.networkSpeedIndicatorEnabled) "开" else "关",
                        "播放器显示实时网速",
                    ), // v10.1
                    SettingEntry(SettingId.VideoBookmarks, "视频书签", "管理", "标记视频关键时刻"), // v10.2
                    SettingEntry(SettingId.GestureZoneCustom, "手势区域", "自定义", "调整手势触发范围"), // v11.0
                    SettingEntry(SettingId.DanmakuTemplate, "弹幕模板", "快捷", "预设弹幕内容"), // v11.1
                    SettingEntry(SettingId.DownloadQuality, "下载清晰度", "设置", "默认下载画质"), // v11.2
                    SettingEntry(SettingId.SearchSortMode, "搜索排序", "默认", "搜索结果排序方式"), // v11.3
                    SettingEntry(SettingId.LivePipMode, "直播画中画", "关闭", "直播小窗播放"), // v11.4
                    SettingEntry(SettingId.DanmakuShortcut, "弹幕快捷键", "设置", "快速发送弹幕"), // v11.5
                    SettingEntry(SettingId.VideoCardInfo, "卡片信息", "显示", "视频卡片详情"), // v11.6
                    SettingEntry(SettingId.ProgressBarStyle, "进度条样式", "默认", "自定义进度条"), // v11.7
                    SettingEntry(SettingId.VideoPreviewHover, "视频预览", "关闭", "悬浮预览画面"), // v11.8
                    SettingEntry(SettingId.SubtitleSyncAdjust, "字幕同步", "调整", "字幕时间偏移"), // v11.9
                    SettingEntry(SettingId.AudioBoostMode, "音量增强", "关闭", "突破最大音量"), // v11.10
                    SettingEntry(SettingId.PlaybackSpeedMemory, "倍速记忆", "关闭", "记住上次播放速度"), // v11.11
                    SettingEntry(SettingId.VideoRotateLock, "旋转锁定", "自动", "锁定视频旋转方向"), // v11.12
                    SettingEntry(SettingId.DanmakuFilterAdvanced, "弹幕高级过滤", "设置", "按类型/颜色过滤"), // v11.13
                    SettingEntry(SettingId.LiveStreamMonitor, "直播流监控", "关闭", "监控直播流状态"), // v11.14
                    SettingEntry(SettingId.VideoHistoryExport, "历史导出", "导出", "导出观看历史"), // v11.15
                    SettingEntry(SettingId.DynamicFilter, "动态过滤", "设置", "过滤动态内容"), // v11.16
                    SettingEntry(SettingId.UserBlocklist, "用户黑名单", "管理", "屏蔽指定用户"), // v11.17
                    SettingEntry(SettingId.SubtitleFontCustom, "字幕字体", "默认", "自定义字幕字体"), // v11.18
                    SettingEntry(SettingId.NetworkProxySetting, "网络代理", "关闭", "HTTP代理设置"), // v11.19
                    SettingEntry(SettingId.VideoBufferStrategy, "缓冲策略", "默认", "视频缓冲策略"), // v11.20
                    SettingEntry(SettingId.BackupRestoreConfig, "备份恢复", "管理", "配置导入导出"), // v11.21
                    SettingEntry(SettingId.VideoSnapshotSetting, "截图设置", "设置", "截图格式质量"), // v11.22
                    SettingEntry(SettingId.VideoChapter, "视频章节", "显示", "章节列表导航"), // v11.23
                    SettingEntry(SettingId.CommentFilterAdvanced, "评论过滤", "设置", "过滤低分评论"), // v11.24
                    SettingEntry(SettingId.DynamicSortMode, "动态排序", "默认", "动态排序方式"), // v11.25
                    SettingEntry(SettingId.UserFollowManager, "关注管理", "管理", "批量管理关注"), // v11.26
                    SettingEntry(SettingId.VideoRecommendMode, "推荐模式", "默认", "推荐算法偏好"), // v11.27
                    SettingEntry(SettingId.SubtitlePositionCustom, "字幕位置", "底部", "调整字幕位置"), // v11.28
                    SettingEntry(SettingId.DanmakuShadowStyle, "弹幕阴影", "默认", "弹幕文字阴影"), // v11.29
                    SettingEntry(SettingId.VideoAutoPlayNext, "自动连播", "开启", "自动播放下一集"), // v11.30
                    SettingEntry(SettingId.VideoShareSetting, "分享设置", "设置", "分享方式偏好"), // v11.31
                    SettingEntry(SettingId.DynamicAutoRefresh, "动态刷新", "关闭", "自动刷新动态"), // v11.32
                    SettingEntry(SettingId.UserSpaceCustom, "空间定制", "设置", "个人主页展示"), // v11.33
                    SettingEntry(SettingId.VideoStatisticsShow, "视频统计", "显示", "播放量/弹幕数"), // v11.34
                    SettingEntry(SettingId.CommentHotSort, "热评排序", "默认", "评论排序方式"), // v11.35
                    SettingEntry(SettingId.VideoAdSkip, "广告跳过", "关闭", "跳过贴片广告"), // v11.36
                    SettingEntry(SettingId.DanmakuAIEnhanced, "AI弹幕", "关闭", "AI弹幕优化"), // v11.37
                    SettingEntry(SettingId.LiveStreamAutoReconnect, "自动重连", "开启", "直播断线重连"), // v11.38
                    SettingEntry(SettingId.VideoGestureCustom, "播放手势", "设置", "自定义播放手势"), // v11.39
                    SettingEntry(SettingId.DanmakuScrollMode, "弹幕滚动", "默认", "滚动方向速度"), // v11.40
                    SettingEntry(SettingId.LiveGiftEffect, "礼物特效", "显示", "直播礼物动画"), // v11.41
                    SettingEntry(SettingId.CommentCollapseMode, "评论折叠", "默认", "折叠长评论"), // v11.42
                    SettingEntry(SettingId.VideoLoopCount, "循环次数", "无限", "视频循环次数"), // v11.43
                    SettingEntry(SettingId.VideoBrightnessDefault, "默认亮度", "跟随", "播放器默认亮度"), // v11.44
                    SettingEntry(SettingId.SubtitleDownloadAuto, "字幕下载", "关闭", "自动下载字幕"), // v11.45
                    SettingEntry(SettingId.VideoCodecAuto, "编解码器", "自动", "自动选择最佳解码器"), // v11.46
                    SettingEntry(SettingId.LiveDanmakuSpeed, "直播弹幕速度", "正常", "直播弹幕滚动速度"), // v11.47
                    SettingEntry(SettingId.CommentInputStyle, "评论输入", "默认", "评论输入框样式"), // v11.48
                    SettingEntry(SettingId.VideoPlayerSkin, "播放器皮肤", "默认", "播放器界面风格"), // v11.49
                    SettingEntry(SettingId.DynamicImageLoad, "动态图片", "WiFi", "图片加载策略"), // v11.50
                    SettingEntry(SettingId.UserPrivacyMode, "隐私模式", "关闭", "无痕浏览模式"), // v11.51
                    SettingEntry(SettingId.VideoCachePreload, "预加载", "默认", "视频预加载策略"), // v11.52
                    SettingEntry(SettingId.DanmakuSendPosition, "弹幕位置", "滚动", "发送弹幕位置"), // v11.53
                    SettingEntry(SettingId.VideoChapterAutoSkip, "章节跳过", "关闭", "自动跳过章节"), // v11.54
                    SettingEntry(SettingId.LiveDanmakuColor, "直播弹幕颜色", "白色", "直播弹幕颜色"), // v11.55
                    SettingEntry(SettingId.CommentAtFunction, "评论@", "开启", "@用户功能"), // v11.56
                    SettingEntry(SettingId.VideoPlayerInfoShow, "播放器信息", "关闭", "显示码率/分辨率"), // v11.57
                    SettingEntry(SettingId.DynamicTextOnly, "纯文字动态", "关闭", "仅显示文字动态"), // v11.58
                    SettingEntry(SettingId.UserLevelShow, "等级显示", "显示", "用户等级标识"), // v11.59
                    SettingEntry(SettingId.VideoCacheLocation, "缓存位置", "默认", "视频缓存路径"), // v11.60
                    SettingEntry(SettingId.DanmakuMergeTime, "合并时间", "默认", "弹幕合并时间窗"), // v11.61
                    SettingEntry(SettingId.VideoPlayerOverlayTimeout, "控制栏超时", "5秒", "控制栏自动隐藏"), // v11.62
                    SettingEntry(SettingId.LiveDanmakuArea, "直播弹幕区域", "默认", "弹幕显示区域"), // v11.63
                    SettingEntry(SettingId.CommentImageLoad, "评论图片", "WiFi", "评论图片加载"), // v11.64
                    SettingEntry(SettingId.VideoPlayerController, "播放器控制", "默认", "控制栏布局"), // v11.65
                    SettingEntry(SettingId.DynamicAutoPlay, "动态自动播放", "WiFi", "动态视频自动播放"), // v11.66
                    SettingEntry(SettingId.UserFollowNotify, "关注提醒", "开启", "UP主更新提醒"), // v11.67
                    SettingEntry(SettingId.VideoCacheMaxSize, "缓存限制", "不限", "最大缓存空间"), // v11.68
                    SettingEntry(SettingId.DanmakuBlockLevel, "屏蔽等级", "默认", "弹幕过滤强度"), // v11.69
                    SettingEntry(SettingId.VideoPlayerSubtitleCustom, "字幕自定义", "设置", "字幕样式自定义"), // v11.70
                    SettingEntry(SettingId.LiveDanmakuMergeMode, "直播弹幕合并", "关闭", "合并重复弹幕"), // v11.71
                    SettingEntry(SettingId.CommentShowReply, "评论回复", "显示", "显示回复内容"), // v11.72
                    SettingEntry(SettingId.VideoPlayerGestureIndicator, "手势指示器", "开启", "手势操作反馈"), // v11.73
                    SettingEntry(SettingId.DynamicFilterKeyword, "动态关键词", "设置", "过滤关键词"), // v11.74
                    SettingEntry(SettingId.UserFollowGroup, "关注分组", "管理", "分组管理关注"), // v11.75
                    SettingEntry(SettingId.VideoCacheAutoClean, "自动清理", "关闭", "自动清理缓存"), // v11.76
                    SettingEntry(SettingId.DanmakuSendHistoryShow, "发送历史", "显示", "弹幕发送记录"), // v11.77
                    SettingEntry(SettingId.VideoPlayerSpeedCustom, "自定义倍速", "设置", "自定义播放速度"), // v11.78
                    SettingEntry(SettingId.LiveDanmakuBlockUser, "直播屏蔽", "管理", "屏蔽直播用户"), // v11.79
                    SettingEntry(SettingId.CommentSortAdvanced, "评论高级排序", "设置", "多维度排序"), // v11.80
                    SettingEntry(SettingId.VideoPlayerBackgroundPlay, "后台播放", "关闭", "后台继续播放"), // v11.81
                    SettingEntry(SettingId.DynamicFilterType, "动态类型过滤", "设置", "过滤动态类型"), // v11.82
                    SettingEntry(SettingId.UserSpaceStats, "空间统计", "显示", "显示播放/投币"), // v11.83
                    SettingEntry(SettingId.VideoCachePreloadSize, "预加载大小", "默认", "预加载数据量"), // v11.84
                    SettingEntry(SettingId.DanmakuSendFontsize, "弹幕字号", "默认", "发送弹幕字号"), // v11.85
                    SettingEntry(SettingId.VideoPlayerLockRotation, "锁定旋转", "自动", "锁定屏幕旋转"), // v11.86
                    SettingEntry(SettingId.LiveDanmakuSendHistory, "直播弹幕历史", "显示", "直播弹幕记录"), // v11.87
                    SettingEntry(SettingId.CommentShowTime, "评论时间", "显示", "显示评论时间"), // v11.88
                    SettingEntry(SettingId.VideoPlayerAutoFullscreen, "自动全屏", "关闭", "自动进入全屏"), // v11.89
                    SettingEntry(SettingId.DynamicFilterUser, "动态用户过滤", "设置", "过滤特定用户"), // v11.90
                    SettingEntry(SettingId.UserSpaceBackground, "空间背景", "默认", "个人主页背景"), // v11.91
                    SettingEntry(SettingId.VideoCacheWifiOnly, "WiFi缓存", "关闭", "仅WiFi下缓存"), // v11.92
                    SettingEntry(SettingId.DanmakuSendColor, "弹幕颜色", "白色", "发送弹幕颜色"), // v11.93
                    SettingEntry(SettingId.VideoPlayerGestureSensitivity, "手势灵敏度详细", "设置", "精确调整手势"), // v11.94
                    SettingEntry(SettingId.LiveDanmakuFontStyle, "直播弹幕字体", "默认", "直播弹幕字体"), // v11.95
                    SettingEntry(SettingId.CommentImageQuality, "评论图片质量", "自动", "评论图片清晰度"), // v11.96
                    SettingEntry(SettingId.VideoPlayerAutoRotate, "自动旋转", "开启", "传感器自动旋转"), // v11.97
                    SettingEntry(SettingId.DynamicRefreshInterval, "动态刷新", "5分钟", "自动刷新间隔"), // v11.98
                    SettingEntry(SettingId.UserSpaceTheme, "空间主题", "默认", "个人主页主题"), // v11.99
                    SettingEntry(SettingId.VideoCacheCompress, "缓存压缩", "关闭", "压缩缓存节省空间"), // v11.100
                    SettingEntry(SettingId.DanmakuSendBold, "弹幕加粗", "关闭", "发送加粗弹幕"), // v11.101
                    SettingEntry(SettingId.VideoPlayerLongPressSpeed, "长按倍速", "2.0x", "长按加速倍速"), // v11.102
                    SettingEntry(SettingId.LiveDanmakuSendColor, "直播弹幕颜色", "设置", "直播发送颜色"), // v11.103
                    SettingEntry(SettingId.CommentShowUpName, "评论UP主", "显示", "显示UP主标识"), // v11.104
                    SettingEntry(SettingId.VideoPlayerDoubleTapAction, "双击操作", "播放/暂停", "双击屏幕动作"), // v11.105
                    SettingEntry(SettingId.DynamicFilterAd, "动态广告过滤", "开启", "过滤广告动态"), // v11.106
                    SettingEntry(SettingId.UserSpaceVideoSort, "空间排序", "最新", "视频排序方式"), // v11.107
                    SettingEntry(SettingId.VideoCacheAutoDelete, "自动删除", "关闭", "自动删除旧缓存"), // v11.108
                    SettingEntry(SettingId.DanmakuSendBorder, "弹幕描边", "开启", "发送弹幕描边"), // v11.109
                    SettingEntry(SettingId.VideoPlayerSwipeSensitivity, "滑动灵敏度", "设置", "滑动手势灵敏度"), // v11.110
                    SettingEntry(SettingId.LiveDanmakuBlockKeyword, "直播关键词屏蔽", "设置", "屏蔽特定关键词"), // v11.111
                    SettingEntry(SettingId.CommentShowLevel, "评论等级", "显示", "显示用户等级"), // v11.112
                    SettingEntry(SettingId.VideoPlayerLongPressAction, "长按操作", "倍速", "长按屏幕动作"), // v11.113
                    SettingEntry(SettingId.DynamicFilterKeywordCase, "关键词匹配", "模糊", "大小写匹配方式"), // v11.114
                    SettingEntry(SettingId.UserSpaceFollowShow, "关注显示", "显示", "显示关注列表"), // v11.115
                    SettingEntry(SettingId.VideoCachePreloadCount, "预加载数量", "默认", "同时预加载数"), // v11.116
                    SettingEntry(SettingId.DanmakuSendShadow, "弹幕阴影", "开启", "发送弹幕阴影"), // v11.117
                    SettingEntry(SettingId.VideoPlayerFastSeekStep, "快进快退", "10秒", "快进快退步长"), // v11.118
                    SettingEntry(SettingId.LiveDanmakuShowGift, "礼物显示", "显示", "显示直播礼物"), // v11.119
                    SettingEntry(SettingId.CommentCollapseThreshold, "折叠阈值", "100字", "评论折叠字数"), // v11.120
                    SettingEntry(SettingId.VideoPlayerSubtitleBgOpacity, "字幕背景透明度", "50%", "字幕背景透明度"), // v11.121
                    SettingEntry(SettingId.DynamicImageQuality, "动态图片质量", "自动", "动态图片清晰度"), // v11.122
                    SettingEntry(SettingId.UserSpaceDynamicShow, "空间动态", "显示", "显示用户动态"), // v11.123
                    SettingEntry(SettingId.VideoCacheMaxCount, "缓存文件数", "不限", "最大缓存文件数"), // v11.124
                    SettingEntry(SettingId.DanmakuSendSpeed, "弹幕发送速度", "正常", "弹幕滚动速度"), // v11.125
                    SettingEntry(SettingId.VideoPlayerSubtitleDelay, "字幕延迟", "0秒", "字幕同步调整"), // v11.126
                    SettingEntry(SettingId.LiveDanmakuGiftFilter, "礼物过滤", "全部", "过滤礼物类型"), // v11.127
                    SettingEntry(SettingId.CommentReplyDepth, "回复深度", "3层", "评论嵌套深度"), // v11.128
                    SettingEntry(SettingId.VideoPlayerPipPosition, "画中画位置", "右下", "画中画窗口位置"), // v11.129
                    SettingEntry(SettingId.DynamicFilterKeywordList, "关键词列表", "管理", "管理过滤关键词"), // v11.130
                    SettingEntry(SettingId.UserSpaceActivityShow, "空间活动", "显示", "显示用户活动"), // v11.131
                    SettingEntry(SettingId.VideoCacheCleanOnBoot, "启动清理", "关闭", "启动时清理缓存"), // v11.132
                    SettingEntry(SettingId.DanmakuSendArea, "弹幕发送区域", "全屏", "弹幕显示区域"), // v11.133
                    SettingEntry(SettingId.VideoPlayerGestureVibrate, "手势震动", "开启", "手势操作震动"), // v11.134
                    SettingEntry(SettingId.LiveDanmakuFontSizeLevel, "直播弹幕字号", "默认", "直播弹幕大小"), // v11.135
                    SettingEntry(SettingId.CommentImageLoadPolicy, "评论图片加载", "WiFi", "评论图片策略"), // v11.136
                    SettingEntry(SettingId.VideoPlayerAutoPlayNext, "自动下一个", "开启", "自动播放下一集"), // v11.137
                    SettingEntry(SettingId.DynamicFilterForward, "转发过滤", "关闭", "过滤转发动态"), // v11.138
                    SettingEntry(SettingId.UserSpaceFanShow, "粉丝显示", "显示", "显示粉丝数"), // v11.139
                    SettingEntry(SettingId.VideoCacheWifiPreload, "WiFi预加载", "关闭", "WiFi自动预加载"), // v11.140
                    SettingEntry(SettingId.DanmakuSendFont, "弹幕字体", "默认", "发送弹幕字体"), // v11.141
                    SettingEntry(SettingId.VideoPlayerSkipHeadTail, "跳过秒数", "0秒", "片头片尾秒数"), // v11.142
                    SettingEntry(SettingId.CommentReplyNotification, "回复通知", "开启", "评论回复提醒"), // v11.144
                    SettingEntry(SettingId.VideoPlayerAutoPlayCountdown, "播放倒计时", "5秒", "自动播放倒计时"), // v11.145
                    SettingEntry(SettingId.DynamicFilterStory, "专栏过滤", "关闭", "过滤专栏动态"), // v11.146
                    SettingEntry(SettingId.UserSpacePlayShow, "播放显示", "显示", "显示播放记录"), // v11.147
                    SettingEntry(SettingId.VideoCacheAutoCleanupDays, "清理天数", "7天", "自动清理天数"), // v11.148
                    SettingEntry(SettingId.DanmakuSendLineHeight, "弹幕行高", "默认", "弹幕行间距"), // v11.149
                    SettingEntry(SettingId.VideoPlayerSubtitleFont, "字幕字体", "默认", "字幕字体选择"), // v11.150
                    SettingEntry(SettingId.LiveDanmakuBlockTop, "顶部屏蔽", "关闭", "屏蔽顶部弹幕"), // v11.151
                    SettingEntry(SettingId.CommentShowDevice, "评论设备", "显示", "显示用户设备"), // v11.152
                    SettingEntry(SettingId.VideoPlayerGestureHoldAction, "长按手势", "倍速", "长按屏幕动作"), // v11.153
                    SettingEntry(SettingId.LiveDanmakuBlockColor, "颜色屏蔽", "关闭", "屏蔽特定颜色"), // v11.154
                    SettingEntry(SettingId.CommentSortDefault, "评论默认排序", "热度", "评论排序方式"), // v11.155
                    SettingEntry(SettingId.VideoPlayerAutoFullscreenLandscape, "横屏自动全屏", "开启", "横屏自动全屏"), // v11.156
                    SettingEntry(SettingId.DynamicFilterLive, "直播过滤", "关闭", "过滤直播动态"), // v11.157
                    SettingEntry(SettingId.UserSpaceSeriesShow, "合集显示", "显示", "显示用户合集"), // v11.158
                    SettingEntry(SettingId.VideoCacheStreamMerge, "流合并", "关闭", "合并音视频流"), // v11.159
                    SettingEntry(SettingId.DanmakuSendStyle, "弹幕样式", "滚动", "发送弹幕样式"), // v11.160
                    SettingEntry(SettingId.VideoPlayerSubtitleColor, "字幕颜色", "白色", "字幕颜色选择"), // v11.161
                    SettingEntry(SettingId.LiveDanmakuBlockLevel, "等级屏蔽", "关闭", "屏蔽低等级弹幕"), // v11.162
                    SettingEntry(SettingId.CommentShowTimeFormat, "时间格式", "相对", "评论时间格式"), // v11.163
                    SettingEntry(SettingId.VideoPlayerAutoRotationLock, "旋转锁定", "关闭", "自动旋转锁定"), // v11.164
                    SettingEntry(SettingId.DynamicFilterPgc, "番剧过滤", "关闭", "过滤番剧动态"), // v11.165
                    SettingEntry(SettingId.UserSpaceArticleShow, "文章显示", "显示", "显示用户文章"), // v11.166
                    SettingEntry(SettingId.VideoCacheDownloadThread, "下载线程", "3", "下载并发线程"), // v11.167
                    SettingEntry(SettingId.DanmakuSendEffect, "弹幕特效", "无", "发送弹幕特效"), // v11.168
                    SettingEntry(SettingId.VideoPlayerSubtitleSizeLevel, "字幕大小", "默认", "字幕大小级别"), // v11.169
                    SettingEntry(SettingId.LiveDanmakuBlockMedal, "勋章屏蔽", "关闭", "屏蔽无勋章弹幕"), // v11.170
                    SettingEntry(SettingId.CommentAutoExpand, "评论自动展开", "关闭", "自动展开评论"), // v11.171
                    SettingEntry(SettingId.VideoPlayerPipOpacity, "画中画透明度", "100%", "画中画窗口透明度"), // v11.172
                    SettingEntry(SettingId.VideoPlayerGestureSwipeAction, "滑动手势", "音量", "滑动屏幕操作"), // v11.173
                    SettingEntry(SettingId.LiveDanmakuBlockKeywordCustom, "自定义关键词", "无", "自定义屏蔽词"), // v11.174
                    SettingEntry(SettingId.CommentShowUpTag, "UP主标签", "显示", "显示UP主标识"), // v11.175
                    SettingEntry(SettingId.VideoPlayerAutoPlayRandom, "随机播放", "关闭", "随机播放视频"), // v11.176
                    SettingEntry(SettingId.DynamicFilterArticle, "文章过滤", "关闭", "过滤文章动态"), // v11.177
                    SettingEntry(SettingId.UserSpaceClipShow, "小视频显示", "显示", "显示小视频"), // v11.178
                    SettingEntry(SettingId.LiveDanmakuBlockBot, "机器人屏蔽", "关闭", "屏蔽机器人弹幕"), // v11.182
                    SettingEntry(SettingId.CommentShowLevelTag, "等级标签", "显示", "显示用户等级"), // v11.183
                    SettingEntry(SettingId.VideoPlayerAutoPlayLoop, "自动循环", "关闭", "自动循环播放"), // v11.184
                    SettingEntry(SettingId.DynamicFilterMusic, "音乐过滤", "关闭", "过滤音乐动态"), // v11.185
                    SettingEntry(SettingId.VideoCacheAutoDeleteWatched, "自动删除已看", "关闭", "删除已看完缓存"), // v11.187
                    SettingEntry(SettingId.DanmakuSendShadow, "弹幕阴影", "关闭", "发送弹幕阴影"), // v11.188
                    SettingEntry(SettingId.VideoPlayerSubtitleDelayMs, "字幕延迟", "0ms", "字幕延迟毫秒"), // v11.189
                    SettingEntry(SettingId.LiveDanmakuBlockEmoji, "表情屏蔽", "关闭", "屏蔽表情弹幕"), // v11.190
                    SettingEntry(SettingId.QuickSettings, "快速设置", "长按详情按钮", "播放器快速设置面板"), // v10.3
                    SettingEntry(SettingId.WatchTimeStats, "观看统计", "今日: --", "观看时间统计"), // v10.4
                    SettingEntry(SettingId.MultiAccount, "多账号", "切换", "多账号切换管理"), // v10.5
                    SettingEntry(SettingId.PlayerGestureCustom, "手势自定义", "灵敏度", "播放器手势灵敏度调节"), // v10.6
                    SettingEntry(SettingId.DanmakuOpacity, "弹幕透明度", "100%", "弹幕显示透明度"), // v10.7
                    SettingEntry(SettingId.AutoSkipIntroOutro, "跳过片头片尾", "关", "自动跳过片头片尾"), // v10.8
                    SettingEntry(SettingId.LogTag, "日志标签", "BLBL", "用于 Logcat 过滤"),
                    SettingEntry(SettingId.ExportLogs, "导出日志", "保存文件", null),
                    SettingEntry(SettingId.UploadLogs, "上传日志", "点击上传", "打包并上传日志zip到开发者（含设备/版本/非登录配置元数据）"),
                    playerKernelEntry(),
                    SettingEntry(
                        SettingId.AutoUpdateCheckEnabled,
                        "自动检查更新",
                        if (prefs.autoUpdateCheckEnabled) "开" else "关",
                        "启动时后台检查，有新版本才提示",
                    ),
                    aboutUpdateEntry(),
                )

            "设备信息" ->
                listOf(
                    SettingEntry(SettingId.DeviceCpu, "CPU", Build.SUPPORTED_ABIS.firstOrNull().orEmpty(), null),
                    SettingEntry(SettingId.DeviceModel, "设备", "${Build.MANUFACTURER} ${Build.MODEL}", null),
                    SettingEntry(SettingId.DeviceSystem, "系统", "Android ${Build.VERSION.RELEASE} API${Build.VERSION.SDK_INT}", null),
                    SettingEntry(SettingId.DeviceScreen, "屏幕", SettingsText.screenText(activity.resources), null),
                    SettingEntry(SettingId.DeviceRam, "RAM", SettingsText.ramText(activity), null),
                    SettingEntry(SettingId.DeviceDecoder, "硬件解码器", deviceCodecSupportValue, null),
                )

            else -> emptyList()
        }
    }

    private fun playerKernelEntry(): SettingEntry =
        when (IjkPlayerPlugin.status(activity)) {
            IjkPlayerPlugin.InstallStatus.Unsupported ->
                SettingEntry(SettingId.PlayerKernelCheck, "播放器内核检测", "不支持", null)

            IjkPlayerPlugin.InstallStatus.NotInstalled ->
                SettingEntry(SettingId.PlayerKernelCheck, "播放器内核检测", "未安装", null)

            IjkPlayerPlugin.InstallStatus.NeedsUpdate ->
                SettingEntry(SettingId.PlayerKernelCheck, "播放器内核检测", "需要更新", null)

            IjkPlayerPlugin.InstallStatus.Installed ->
                SettingEntry(SettingId.PlayerKernelCheck, "播放器内核检测", "已就绪", null)
        }

    private fun gaiaVgateStatusText(): String {
        val now = System.currentTimeMillis()
        val tokenCookie = BiliClient.cookies.getCookie("x-bili-gaia-vtoken")
        val tokenOk = tokenCookie != null && tokenCookie.expiresAt > now
        val voucherOk = !BiliClient.prefs.gaiaVgateVVoucher.isNullOrBlank()
        return when {
            tokenOk -> "已通过"
            voucherOk -> "待验证"
            else -> "无"
        }
    }

    private fun loginStatusText(): String {
        val count = BiliClient.accounts.accounts().size
        return when {
            count > 1 -> "已登录 $count 个帐号"
            BiliClient.cookies.hasSessData() -> "已登录"
            else -> "未登录"
        }
    }

    private fun cacheSizeText(): String {
        val size = state.cacheSizeBytes ?: return "-"
        return SettingsText.formatBytes(size)
    }

    private fun aboutUpdateEntry(): SettingEntry {
        val currentVersion = BuildConfig.VERSION_NAME
        val title = "检查更新"
        val defaultDesc = "检查新版本并下载安装"
        return when (val checkState = state.testUpdateCheckState) {
            TestUpdateCheckState.Idle -> SettingEntry(SettingId.CheckUpdate, title, "点击检查", defaultDesc)
            TestUpdateCheckState.Checking -> SettingEntry(SettingId.CheckUpdate, title, "检查中…", "正在获取更新日志…")

            is TestUpdateCheckState.Latest ->
                SettingEntry(
                    SettingId.CheckUpdate,
                    title,
                    "已是最新版",
                    "当前：$currentVersion / 最新：${checkState.latestVersion}",
                )

            is TestUpdateCheckState.UpdateAvailable ->
                SettingEntry(SettingId.CheckUpdate, title, "新版本 ${checkState.latestVersion}", "当前：$currentVersion，点击更新")

            is TestUpdateCheckState.Error -> {
                val msg = checkState.message.trim().take(80)
                val desc = if (msg.isBlank()) "检查失败，点击重试" else "检查失败，点击重试（$msg）"
                SettingEntry(SettingId.CheckUpdate, title, "检查失败", desc)
            }
        }
    }

    private fun focusRightById(id: SettingId): Boolean {
        val pos = rightAdapter.indexOfId(id)
        if (pos == RecyclerView.NO_POSITION) return false
        val holder = binding.recyclerRight.findViewHolderForAdapterPosition(pos)
        if (holder?.itemView?.requestFocus() == true) return true
        return focusRightAt(pos)
    }

    private fun focusRightAt(position: Int): Boolean {
        if (position < 0 || position >= rightAdapter.itemCount) return false
        val layoutManager = binding.recyclerRight.layoutManager as? LinearLayoutManager
        return focusRecyclerItemAt(
            recyclerView = binding.recyclerRight,
            position = position,
            shouldScroll = { isPositionOutsideVisibleRange(layoutManager, position) },
            scroll = { layoutManager?.scrollToPositionWithOffset(position, 0) },
        )
    }

    private fun focusLeftAt(position: Int): Boolean {
        if (position < 0 || position >= leftAdapter.itemCount) return false
        val layoutManager = binding.recyclerLeft.layoutManager as? LinearLayoutManager
        return focusRecyclerItemAt(
            recyclerView = binding.recyclerLeft,
            position = position,
            shouldScroll = { isPositionOutsideVisibleRange(layoutManager, position) },
            scroll = { binding.recyclerLeft.scrollToPosition(position) },
        )
    }

    private fun focusRecyclerItemAt(
        recyclerView: RecyclerView,
        position: Int,
        shouldScroll: () -> Boolean,
        scroll: () -> Unit,
    ): Boolean {
        val token = ++state.focusRequestToken
        val holder = recyclerView.findViewHolderForAdapterPosition(position)
        if (holder?.itemView?.requestFocus() == true) return true
        if (shouldScroll()) {
            scroll()
        }
        recyclerView.doOnPreDraw {
            if (token != state.focusRequestToken) return@doOnPreDraw
            recyclerView.findViewHolderForAdapterPosition(position)?.itemView?.requestFocus()
        }
        return true
    }

    private fun isPositionOutsideVisibleRange(
        layoutManager: LinearLayoutManager?,
        position: Int,
    ): Boolean {
        if (layoutManager == null) return true
        val first = layoutManager.findFirstVisibleItemPosition()
        val last = layoutManager.findLastVisibleItemPosition()
        if (first == RecyclerView.NO_POSITION || last == RecyclerView.NO_POSITION) return true
        return position < first || position > last
    }
}
