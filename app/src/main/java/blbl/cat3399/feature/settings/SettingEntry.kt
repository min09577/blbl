package blbl.cat3399.feature.settings

/**
 * Stable id for settings entries.
 *
 * Must remain stable across copy/text changes; do NOT use [SettingEntry.title] to drive behavior.
 */
enum class SettingId(
    val key: String,
) {
    // 通用设置
    ImageQuality("image_quality"),
    ThemePreset("theme_preset"),
    ApiSource("api_source"),
    UserAgent("user_agent"),
    Ipv4OnlyEnabled("ipv4_only_enabled"),
    GaiaVgate("gaia_vgate"),
    ClearCache("clear_cache"),
    ConfigTransfer("config_transfer"),
    ClearLogin("clear_login"),

    // 页面设置
    StartupPage("startup_page"),
    CustomPageEnabled("custom_page_enabled"),
    CustomPageContent("custom_page_content"),
    GridSpanCount("grid_span_count"),
    DynamicGridSpanCount("dynamic_grid_span_count"),
    PgcGridSpanCount("pgc_grid_span_count"),
    UiScaleFactor("ui_scale_factor"),
    FullscreenEnabled("fullscreen_enabled"),
    AvoidDisplayCutout("avoid_display_cutout"),
    TabSwitchFollowsFocus("tab_switch_follows_focus"),
    MainAutoHideSidebarOnEnterContent("main_auto_hide_sidebar_on_enter_content"),
    MainBackFocusScheme("main_back_focus_scheme"),
    VideoCardLongPressAction("video_card_long_press_action"),
    FollowingListOrder("following_list_order"),
    MainHomeVisibleTabs("main_home_visible_tabs"),
    MainCategoryVisibleTabs("main_category_visible_tabs"),
    MainLiveVisibleTabs("main_live_visible_tabs"),
    MainMyVisibleTabs("main_my_visible_tabs"),
    // v4.10: 侧边栏Tab隐藏
    HiddenSidebarTabs("hidden_sidebar_tabs"),
    // v5.0: 全局字体大小
    FontScaleFactor("font_scale_factor"),

    // 播放设置
    PlayerPreferredQn("player_preferred_qn"),
    PlayerPreferredQnPortrait("player_preferred_qn_portrait"),
    PlayerPreferredAudioId("player_preferred_audio_id"),
    PlayerCdnPreference("player_cdn_preference"),
    LiveHighBitrateEnabled("live_high_bitrate_enabled"),
    PlayerSpeed("player_speed"),
    PlayerShortSeekStepSeconds("player_short_seek_step_seconds"),
    PlayerHoldSeekSpeed("player_hold_seek_speed"),
    PlayerHoldSeekMode("player_hold_seek_mode"),
    PlayerHoldScrubTraverseSeconds("player_hold_scrub_traverse_seconds"),
    PlayerHoldScrubFixedStepSeconds("player_hold_scrub_fixed_step_seconds"),
    PlayerAutoResumeEnabled("player_auto_resume_enabled"),
    PlayerAutoSkipSegmentsEnabled("player_auto_skip_segments_enabled"),
    PlayerAutoSkipServerBaseUrl("player_auto_skip_server_base_url"),
    PlayerOpenDetailBeforePlay("player_open_detail_before_play"),
    PlayerPlaybackMode("player_playback_mode"),
    PlayerSettingsApplyToGlobal("player_settings_apply_to_global"),
    PlayerUpQuickCardEnabled("player_up_quick_card_enabled"),
    PlayerStyle("player_style"),
    SubtitlePreferredLang("subtitle_preferred_lang"),
    SubtitleTextSizeSp("subtitle_text_size_sp"),
    SubtitleBottomPaddingFraction("subtitle_bottom_padding_fraction"),
    SubtitleBackgroundOpacity("subtitle_background_opacity"),
    SubtitleEnabledDefault("subtitle_enabled_default"),
    PlayerPreferredCodec("player_preferred_codec"),
    PlayerRenderView("player_render_view"),
    PlayerEngineKind("player_engine_kind"),
    PlayerAudioBalance("player_audio_balance"),
    PlayerOsdButtons("player_osd_buttons"),
    PlayerCustomShortcuts("player_custom_shortcuts"),
    PlayerDebugEnabled("player_debug_enabled"),
    DynamicFollowingRecentUpdateDotEnabled("dynamic_following_recent_update_dot_enabled"),
    PlayerDoubleBackToExit("player_double_back_to_exit"),
    PlayerDownKeyOsdFocusTarget("player_down_key_osd_focus_target"),
    PlayerTogglePlayStateShowOsd("player_toggle_play_state_show_osd"),
    PlayerPersistentBottomProgressEnabled("player_persistent_bottom_progress_enabled"),
    PlayerPersistentClockEnabled("player_persistent_clock_enabled"),
    PlayerTouchGesturesEnabled("player_touch_gestures_enabled"),
    DoubleTapAction("double_tap_action"),  // v5.7
    DataSaverMode("data_saver_mode"),  // v5.8
    PlayerVideoShotPreviewSize("player_videoshot_preview_size"),
    // v11.4: 自动展开视频简介
    AutoExpandDesc("auto_expand_desc"),

    // 弹幕设置
    DanmakuEnabled("danmaku_enabled"),
    DanmakuOpacity("danmaku_opacity"),
    DanmakuTextSizeSp("danmaku_text_size_sp"),
    DanmakuLaneDensity("danmaku_lane_density"),
    DanmakuStrokeWidthPx("danmaku_stroke_width_px"),
    DanmakuFontWeight("danmaku_font_weight"),
    DanmakuArea("danmaku_area"),
    DanmakuSpeed("danmaku_speed"),
    DanmakuFollowBiliShield("danmaku_follow_bili_shield"),
    DanmakuShowHighLikeIcon("danmaku_show_high_like_icon"),
    DanmakuAiShieldEnabled("danmaku_ai_shield_enabled"),
    DanmakuAiShieldLevel("danmaku_ai_shield_level"),
    DanmakuAllowScroll("danmaku_allow_scroll"),
    DanmakuAllowTop("danmaku_allow_top"),
    DanmakuAllowBottom("danmaku_allow_bottom"),
    DanmakuAllowColor("danmaku_allow_color"),
    DanmakuAllowSpecial("danmaku_allow_special"),

    // 关于应用
    PlayerKernelCheck("player_kernel_check"),
    AppVersion("app_version"),
    ProjectUrl("project_url"),
    QqGroup("qq_group"),
    About("about"),  // v12.1: 关于页面
    DownloadManagement("download_management"),  // v12.3: 下载管理
    CastManagement("cast_management"),  // v12.4: 投屏管理
    NetworkDiagnostics("network_diagnostics"),  // v12.5: 网络诊断
    WatchStatistics("watch_statistics"),  // v12.6: 播放统计
    HistoryManagement("history_management"),  // v12.7: 历史记录管理
    CacheManagement("cache_management"),  // v12.8: 缓存管理
    RemoteHelp("remote_help"),  // v12.9: 快捷键帮助
    AutoUpdateCheck("auto_update_check"),  // v12.10: 自动更新检查
    VideoInfoEnhanced("video_info_enhanced"),  // v12.11: 视频信息增强
    PlayerGestureEnhanced("player_gesture_enhanced"),  // v12.12: 播放器手势增强
    PictureInPictureShortcut("pip_shortcut"),  // v12.13: 画中画快捷开关
    AudioEffectSettings("audio_effect_settings"),  // v12.14: 音效设置
    SubtitleStyleSettings("subtitle_style_settings"),  // v12.15: 字幕样式设置
    LiveDanmakuSettings("live_danmaku_settings"),  // v12.16: 直播弹幕设置
    SearchHistoryManagement("search_history_management"),  // v12.17: 搜索历史管理
    QuickQualitySwitch("quick_quality_switch"),  // v12.18: 画质快速切换
    LiveDanmakuOpacity("live_danmaku_opacity"),  // v12.19: 直播弹幕透明度
    ProgressBarPreview("progress_bar_preview"),  // v12.20: 进度条预览
    SleepTimer("sleep_timer"),  // v12.21: 定时关闭
    ScreenshotShare("screenshot_share"),  // v12.22: 截图分享
    DanmakuPosition("danmaku_position"),  // v12.23: 弹幕位置
    VolumeBoost("volume_boost"),  // v12.24: 音量增强
    VideoLoop("video_loop"),  // v12.25: 视频循环
    SpeedMemory("speed_memory"),  // v12.26: 倍速记忆
    SkipIntroOutro("skip_intro_outro"),  // v12.27: 自动跳过片头/片尾
    DanmakuKeywordFilter("danmaku_keyword_filter"),  // v12.28: 弹幕关键词屏蔽
    ScreenFitMode("screen_fit_mode"),  // v12.29: 播放器屏幕适配
    LiveReplay("live_replay"),  // v12.30: 直播回放
    ScreenshotSavePath("screenshot_save_path"),  // v12.31: 截图保存路径
    DanmakuFontCustom("danmaku_font_custom"),  // v12.32: 弹幕字体自定义
    BrightnessMemory("brightness_memory"),  // v12.33: 亮度记忆
    AutoPlayNext("auto_play_next"),  // v12.34: 自动播放下一集
    LiveGiftFilter("live_gift_filter"),  // v12.35: 直播礼物过滤
    CacheSizeLimit("cache_size_limit"),  // v12.36: 缓存大小限制
    DanmakuSpeedCustom("danmaku_speed_custom"),  // v12.37: 弹幕速度自定义
    PlayerLongPressAction("player_long_press_action"),  // v12.38: 长按动作设置
    WifiAutoQuality("wifi_auto_quality"),  // v12.39: WiFi自动画质
    CommentSortMode("comment_sort_mode"),  // v12.40: 评论排序方式
    PlayerSwipeGesture("player_swipe_gesture"),  // v12.41: 播放器滑动手势
    DanmakuAlphaCustom("danmaku_alpha_custom"),  // v12.42: 弹幕透明度自定义
    PlayerAutoRotate("player_auto_rotate"),  // v12.43: 自动旋转屏幕
    NotificationControl("notification_control"),  // v12.44: 通知栏控制
    VideoPreload("video_preload"),  // v12.45: 视频预加载
    HistorySync("history_sync"),  // v12.46: 历史记录同步
    PlayerDecoderPriority("player_decoder_priority"),  // v12.47: 解码器优先级
    DanmakuMergeMode("danmaku_merge_mode"),  // v12.48: 弹幕合并模式
    PlayerAudioDelay("player_audio_delay"),  // v12.49: 音频延迟调整
    LiveStreamQuality("live_stream_quality"),  // v12.50: 直播画质设置
    PlayerKeyMapping("player_key_mapping"),  // v12.51: 按键映射
    DanmakuSendHistory("danmaku_send_history"),  // v12.52: 弹幕发送历史
    DanmakuSendHistoryLimit("danmaku_send_history_limit"),  // v12.3: 弹幕发送历史数量
    PlayerBufferStrategy("player_buffer_strategy"),  // v12.53: 缓冲策略
    LiveAutoFollow("live_auto_follow"),  // v12.54: 直播自动关注
    VideoCodecPreference("video_codec_preference"),  // v12.55: 视频编码偏好
    PlayerSubtitleSize("player_subtitle_size"),  // v12.56: 字幕大小调整
    DanmakuAreaCustom("danmaku_area_custom"),  // v12.57: 弹幕区域自定义
    PlayerAspectRatio("player_aspect_ratio"),  // v12.58: 画面比例切换
    LiveChatFontsize("live_chat_fontsize"),  // v12.59: 直播聊天字体大小
    VideoCacheStrategy("video_cache_strategy"),  // v12.60: 视频缓存策略
    PlayerBackgroundPlay("player_background_play"),  // v12.61: 后台播放
    DanmakuFontStyle("danmaku_font_style"),  // v12.62: 弹幕字体样式
    PlayerDoubleTapAction("player_double_tap_action"),  // v12.63: 双击动作设置
    LiveAutoReconnect("live_auto_reconnect"),  // v12.64: 直播自动重连
    VideoLoadTimeout("video_load_timeout"),  // v12.65: 视频加载超时
    PlayerGestureFeedback("player_gesture_feedback"),  // v12.66: 手势反馈设置
    DanmakuShowUid("danmaku_show_uid"),  // v12.67: 弹幕显示UID
    PlayerStartupAction("player_startup_action"),  // v12.68: 播放器启动动作
    LiveStreamCodec("live_stream_codec"),  // v12.69: 直播编码格式
    VideoNetworkStrategy("video_network_strategy"),  // v12.70: 网络策略
    PlayerUiVisibility("player_ui_visibility"),  // v12.71: 播放器UI显示
    DanmakuBlockUser("danmaku_block_user"),  // v12.72: 弹幕屏蔽用户
    PlayerAutoFullscreen("player_auto_fullscreen"),  // v12.73: 自动全屏
    LiveNotification("live_notification"),  // v12.74: 直播开播提醒
    VideoQualityProfile("video_quality_profile"),  // v12.75: 画质配置文件
    PlayerLockScreen("player_lock_screen"),  // v12.76: 锁定屏幕
    DanmakuScrollSpeed("danmaku_scroll_speed"),  // v12.77: 弹幕滚动速度
    PlayerSkipCredits("player_skip_credits"),  // v12.78: 跳过片尾
    LiveDanmakuFontsize("live_danmaku_fontsize"),  // v12.79: 直播弹幕字体大小
    LiveDanmakuFontSizeLevel("live_danmaku_font_size_level"),  // v11.135: 直播弹幕字号级别
    VideoAutoSkip("video_auto_skip"),  // v12.80: 自动跳过
    PlayerSwipeVolume("player_swipe_volume"),  // v12.81: 滑动调节音量
    DanmakuInputBorder("danmaku_input_border"),  // v12.82: 弹幕输入框样式
    PlayerChromecast("player_chromecast"),  // v12.83: Chromecast投屏
    LiveChatEmoji("live_chat_emoji"),  // v12.84: 直播聊天表情
    VideoAutoNext("video_auto_next"),  // v12.85: 自动播放下一集
    PlayerBrightnessMemory("player_brightness_memory"),  // v12.86: 亮度记忆
    DanmakuMergeInterval("danmaku_merge_interval"),  // v12.87: 弹幕合并间隔
    PlayerLongPressSpeed("player_long_press_speed"),  // v12.88: 长按倍速
    LiveAutoQuality("live_auto_quality"),  // v12.89: 直播自动画质
    VideoPrebufferSize("video_prebuffer_size"),  // v12.90: 预缓冲大小
    PlayerSubtitleBg("player_subtitle_bg"),  // v12.91: 字幕背景
    DanmakuHistory("danmaku_history"),  // v12.92: 弹幕发送历史
    PlayerBufferingStrategy("player_buffering_strategy"),  // v12.93: 缓冲策略
    NetworkSpeedIndicator("network_speed_indicator"),  // v10.1: 网络速度指示器
    VideoBookmarks("video_bookmarks"),  // v10.2: 视频书签
    GestureZoneCustom("gesture_zone_custom"),  // v11.0: 手势区域自定义
    DanmakuTemplate("danmaku_template"),  // v11.1: 弹幕发送模板
    DownloadQuality("download_quality"),  // v11.2: 下载清晰度
    SearchSortMode("search_sort_mode"),  // v11.3: 搜索排序
    LivePipMode("live_pip_mode"),  // v11.4: 直播画中画
    DanmakuShortcut("danmaku_shortcut"),  // v11.5: 弹幕快捷键
    VideoCardInfo("video_card_info"),  // v11.6: 视频卡片信息
    ProgressBarStyle("progress_bar_style"),  // v11.7: 进度条样式
    VideoPreviewHover("video_preview_hover"),  // v11.8: 视频预览悬浮
    SubtitleSyncAdjust("subtitle_sync_adjust"),  // v11.9: 字幕同步调整
    AudioBoostMode("audio_boost_mode"),  // v11.10: 音量增强
    PlaybackSpeedMemory("playback_speed_memory"),  // v11.11: 倍速记忆
    VideoRotateLock("video_rotate_lock"),  // v11.12: 视频旋转锁定
    DanmakuFilterAdvanced("danmaku_filter_advanced"),  // v11.13: 弹幕高级过滤
    LiveStreamMonitor("live_stream_monitor"),  // v11.14: 直播流监控
    VideoHistoryExport("video_history_export"),  // v11.15: 观看历史导出
    DynamicFilter("dynamic_filter"),  // v11.16: 动态过滤
    UserBlocklist("user_blocklist"),  // v11.17: 用户黑名单
    SubtitleFontCustom("subtitle_font_custom"),  // v11.18: 字幕字体
    NetworkProxySetting("network_proxy_setting"),  // v11.19: 网络代理
    VideoBufferStrategy("video_buffer_strategy"),  // v11.20: 缓冲策略
    BackupRestoreConfig("backup_restore_config"),  // v11.21: 备份恢复
    VideoSnapshotSetting("video_snapshot_setting"),  // v11.22: 截图设置
    VideoChapter("video_chapter"),  // v11.23: 视频章节
    CommentFilterAdvanced("comment_filter_advanced"),  // v11.24: 评论过滤
    DynamicSortMode("dynamic_sort_mode"),  // v11.25: 动态排序
    UserFollowManager("user_follow_manager"),  // v11.26: 关注管理
    VideoRecommendMode("video_recommend_mode"),  // v11.27: 推荐模式
    SubtitlePositionCustom("subtitle_position_custom"),  // v11.28: 字幕位置
    DanmakuShadowStyle("danmaku_shadow_style"),  // v11.29: 弹幕阴影
    VideoAutoPlayNext("video_auto_play_next"),  // v11.30: 自动播放下一集
    VideoShareSetting("video_share_setting"),  // v11.31: 分享设置
    DynamicAutoRefresh("dynamic_auto_refresh"),  // v11.32: 动态自动刷新
    UserSpaceCustom("user_space_custom"),  // v11.33: 个人空间定制
    VideoStatisticsShow("video_statistics_show"),  // v11.34: 视频统计
    CommentHotSort("comment_hot_sort"),  // v11.35: 热评排序
    VideoAdSkip("video_ad_skip"),  // v11.36: 贴片广告跳过
    DanmakuAIEnhanced("danmaku_ai_enhanced"),  // v11.37: AI弹幕增强
    LiveStreamAutoReconnect("live_stream_auto_reconnect"),  // v11.38: 直播自动重连
    VideoGestureCustom("video_gesture_custom"),  // v11.39: 播放手势自定义
    DanmakuScrollMode("danmaku_scroll_mode"),  // v11.40: 弹幕滚动模式
    LiveGiftEffect("live_gift_effect"),  // v11.41: 直播礼物特效
    CommentCollapseMode("comment_collapse_mode"),  // v11.42: 评论折叠
    VideoLoopCount("video_loop_count"),  // v11.43: 循环次数
    VideoBrightnessDefault("video_brightness_default"),  // v11.44: 默认亮度
    SubtitleDownloadAuto("subtitle_download_auto"),  // v11.45: 字幕自动下载
    VideoCodecAuto("video_codec_auto"),  // v11.46: 编解码器自动选择
    LiveDanmakuSpeed("live_danmaku_speed"),  // v11.47: 直播弹幕速度
    CommentInputStyle("comment_input_style"),  // v11.48: 评论输入样式
    VideoPlayerSkin("video_player_skin"),  // v11.49: 播放器皮肤
    DynamicImageLoad("dynamic_image_load"),  // v11.50: 动态图片加载
    UserPrivacyMode("user_privacy_mode"),  // v11.51: 隐私模式
    VideoCachePreload("video_cache_preload"),  // v11.52: 预加载策略
    DanmakuSendPosition("danmaku_send_position"),  // v11.53: 弹幕发送位置
    VideoChapterAutoSkip("video_chapter_auto_skip"),  // v11.54: 章节自动跳过
    LiveDanmakuColor("live_danmaku_color"),  // v11.55: 直播弹幕颜色
    CommentAtFunction("comment_at_function"),  // v11.56: 评论@功能
    VideoPlayerInfoShow("video_player_info_show"),  // v11.57: 播放器信息显示
    DynamicTextOnly("dynamic_text_only"),  // v11.58: 纯文字动态
    UserLevelShow("user_level_show"),  // v11.59: 用户等级显示
    VideoCacheLocation("video_cache_location"),  // v11.60: 缓存位置
    DanmakuMergeTime("danmaku_merge_time"),  // v11.61: 弹幕合并时间
    VideoPlayerOverlayTimeout("video_player_overlay_timeout"),  // v11.62: 控制栏超时
    LiveDanmakuArea("live_danmaku_area"),  // v11.63: 直播弹幕区域
    CommentImageLoad("comment_image_load"),  // v11.64: 评论图片加载
    VideoPlayerController("video_player_controller"),  // v11.65: 播放器控制器
    DynamicAutoPlay("dynamic_auto_play"),  // v11.66: 动态自动播放
    UserFollowNotify("user_follow_notify"),  // v11.67: 关注更新提醒
    VideoCacheMaxSize("video_cache_max_size"),  // v11.68: 缓存大小限制
    DanmakuBlockLevel("danmaku_block_level"),  // v11.69: 弹幕屏蔽等级
    VideoPlayerSubtitleCustom("video_player_subtitle_custom"),  // v11.70: 播放器字幕自定义
    LiveDanmakuMergeMode("live_danmaku_merge_mode"),  // v11.71: 直播弹幕合并
    CommentShowReply("comment_show_reply"),  // v11.72: 评论显示回复
    VideoPlayerGestureIndicator("video_player_gesture_indicator"),  // v11.73: 手势指示器
    DynamicFilterKeyword("dynamic_filter_keyword"),  // v11.74: 动态关键词过滤
    UserFollowGroup("user_follow_group"),  // v11.75: 关注分组
    VideoCacheAutoClean("video_cache_auto_clean"),  // v11.76: 缓存自动清理
    DanmakuSendHistoryShow("danmaku_send_history_show"),  // v11.77: 弹幕发送历史
    VideoPlayerSpeedCustom("video_player_speed_custom"),  // v11.78: 自定义倍速
    LiveDanmakuBlockUser("live_danmaku_block_user"),  // v11.79: 直播弹幕屏蔽用户
    CommentSortAdvanced("comment_sort_advanced"),  // v11.80: 评论高级排序
    VideoPlayerBackgroundPlay("video_player_background_play"),  // v11.81: 后台播放
    DynamicFilterType("dynamic_filter_type"),  // v11.82: 动态类型过滤
    UserSpaceStats("user_space_stats"),  // v11.83: 空间统计显示
    VideoCachePreloadSize("video_cache_preload_size"),  // v11.84: 预加载大小
    DanmakuSendFontsize("danmaku_send_fontsize"),  // v11.85: 弹幕发送字号
    VideoPlayerLockRotation("video_player_lock_rotation"),  // v11.86: 锁定旋转
    LiveDanmakuSendHistory("live_danmaku_send_history"),  // v11.87: 直播弹幕历史
    CommentShowTime("comment_show_time"),  // v11.88: 评论显示时间
    VideoPlayerAutoFullscreen("video_player_auto_fullscreen"),  // v11.89: 自动全屏
    DynamicFilterUser("dynamic_filter_user"),  // v11.90: 动态用户过滤
    UserSpaceBackground("user_space_background"),  // v11.91: 空间背景
    VideoCacheWifiOnly("video_cache_wifi_only"),  // v11.92: 仅WiFi缓存
    DanmakuSendColor("danmaku_send_color"),  // v11.93: 弹幕发送颜色
    VideoPlayerGestureSensitivity("video_player_gesture_sensitivity"),  // v11.94: 手势灵敏度详细
    LiveDanmakuFontStyle("live_danmaku_font_style"),  // v11.95: 直播弹幕字体
    CommentImageQuality("comment_image_quality"),  // v11.96: 评论图片质量
    VideoPlayerAutoRotate("video_player_auto_rotate"),  // v11.97: 自动旋转
    DynamicRefreshInterval("dynamic_refresh_interval"),  // v11.98: 动态刷新间隔
    UserSpaceTheme("user_space_theme"),  // v11.99: 空间主题
    VideoCacheCompress("video_cache_compress"),  // v11.100: 缓存压缩
    DanmakuSendBold("danmaku_send_bold"),  // v11.101: 弹幕加粗
    VideoPlayerLongPressSpeed("video_player_long_press_speed"),  // v11.102: 长按倍速
    LiveDanmakuSendColor("live_danmaku_send_color"),  // v11.103: 直播弹幕颜色设置
    CommentShowUpName("comment_show_up_name"),  // v11.104: 评论显示UP主
    VideoPlayerDoubleTapAction("video_player_double_tap_action"),  // v11.105: 双击操作
    DynamicFilterAd("dynamic_filter_ad"),  // v11.106: 动态广告过滤
    UserSpaceVideoSort("user_space_video_sort"),  // v11.107: 空间视频排序
    VideoCacheAutoDelete("video_cache_auto_delete"),  // v11.108: 缓存自动删除
    DanmakuSendBorder("danmaku_send_border"),  // v11.109: 弹幕描边
    VideoPlayerSwipeSensitivity("video_player_swipe_sensitivity"),  // v11.110: 滑动灵敏度
    LiveDanmakuBlockKeyword("live_danmaku_block_keyword"),  // v11.111: 直播弹幕关键词屏蔽
    CommentShowLevel("comment_show_level"),  // v11.112: 评论显示等级
    VideoPlayerLongPressAction("video_player_long_press_action"),  // v11.113: 长按操作
    DynamicFilterKeywordCase("dynamic_filter_keyword_case"),  // v11.114: 关键词大小写
    UserSpaceFollowShow("user_space_follow_show"),  // v11.115: 空间关注显示
    VideoCachePreloadCount("video_cache_preload_count"),  // v11.116: 预加载数量
    DanmakuSendShadow("danmaku_send_shadow"),  // v11.117: 弹幕阴影
    VideoPlayerFastSeekStep("video_player_fast_seek_step"),  // v11.118: 快进快退步长
    LiveDanmakuShowGift("live_danmaku_show_gift"),  // v11.119: 直播礼物显示
    CommentCollapseThreshold("comment_collapse_threshold"),  // v11.120: 评论折叠阈值
    VideoPlayerSubtitleBgOpacity("video_player_subtitle_bg_opacity"),  // v11.121: 字幕背景透明度
    DynamicImageQuality("dynamic_image_quality"),  // v11.122: 动态图片质量
    UserSpaceDynamicShow("user_space_dynamic_show"),  // v11.123: 空间动态显示
    VideoCacheMaxCount("video_cache_max_count"),  // v11.124: 缓存文件数量
    DanmakuSendSpeed("danmaku_send_speed"),  // v11.125: 弹幕发送速度
    VideoPlayerSubtitleDelay("video_player_subtitle_delay"),  // v11.126: 字幕延迟调整
    LiveDanmakuGiftFilter("live_danmaku_gift_filter"),  // v11.127: 直播礼物过滤
    CommentReplyDepth("comment_reply_depth"),  // v11.128: 评论回复深度
    VideoPlayerPipPosition("video_player_pip_position"),  // v11.129: 画中画位置
    DynamicFilterKeywordList("dynamic_filter_keyword_list"),  // v11.130: 关键词列表管理
    UserSpaceActivityShow("user_space_activity_show"),  // v11.131: 空间活动显示
    VideoCacheCleanOnBoot("video_cache_clean_on_boot"),  // v11.132: 启动时清理
    DanmakuSendArea("danmaku_send_area"),  // v11.133: 弹幕发送区域
    VideoPlayerGestureVibrate("video_player_gesture_vibrate"),  // v11.134: 手势震动反馈
    LiveDanmakuFontSize("live_danmaku_font_size"),  // v11.135: 直播弹幕字号
    CommentImageLoadPolicy("comment_image_load_policy"),  // v11.136: 评论图片加载
    VideoPlayerAutoPlayNext("video_player_auto_play_next"),  // v11.137: 自动播放下一个
    DynamicFilterForward("dynamic_filter_forward"),  // v11.138: 动态转发过滤
    UserSpaceFanShow("user_space_fan_show"),  // v11.139: 空间粉丝显示
    VideoCacheWifiPreload("video_cache_wifi_preload"),  // v11.140: WiFi预加载
    DanmakuSendFont("danmaku_send_font"),  // v11.141: 弹幕发送字体
    VideoPlayerSkipHeadTail("video_player_skip_head_tail"),  // v11.142: 跳过片头片尾秒数
    CommentReplyNotification("comment_reply_notification"),  // v11.144: 评论回复通知
    VideoPlayerAutoPlayCountdown("video_player_auto_play_countdown"),  // v11.145: 自动播放倒计时
    DynamicFilterStory("dynamic_filter_story"),  // v11.146: 动态专栏过滤
    UserSpacePlayShow("user_space_play_show"),  // v11.147: 空间播放显示
    VideoCacheAutoCleanupDays("video_cache_auto_cleanup_days"),  // v11.148: 缓存自动清理天数
    DanmakuSendLineHeight("danmaku_send_line_height"),  // v11.149: 弹幕行高
    VideoPlayerSubtitleFont("video_player_subtitle_font"),  // v11.150: 字幕字体选择
    LiveDanmakuBlockTop("live_danmaku_block_top"),  // v11.151: 直播弹幕顶部屏蔽
    CommentShowDevice("comment_show_device"),  // v11.152: 评论显示设备
    VideoPlayerGestureHoldAction("video_player_gesture_hold_action"),  // v11.153: 长按手势操作
    LiveDanmakuBlockColor("live_danmaku_block_color"),  // v11.154: 直播弹幕颜色屏蔽
    CommentSortDefault("comment_sort_default"),  // v11.155: 评论默认排序
    VideoPlayerAutoFullscreenLandscape("video_player_auto_fullscreen_landscape"),  // v11.156: 横屏自动全屏
    DynamicFilterLive("dynamic_filter_live"),  // v11.157: 动态直播过滤
    UserSpaceSeriesShow("user_space_series_show"),  // v11.158: 空间合集显示
    VideoCacheStreamMerge("video_cache_stream_merge"),  // v11.159: 缓存流合并
    DanmakuSendStyle("danmaku_send_style"),  // v11.160: 弹幕发送样式
    VideoPlayerSubtitleColor("video_player_subtitle_color"),  // v11.161: 字幕颜色
    LiveDanmakuBlockLevel("live_danmaku_block_level"),  // v11.162: 直播弹幕等级屏蔽
    CommentShowTimeFormat("comment_show_time_format"),  // v11.163: 评论时间格式
    VideoPlayerAutoRotationLock("video_player_auto_rotation_lock"),  // v11.164: 自动旋转锁定
    DynamicFilterPgc("dynamic_filter_pgc"),  // v11.165: 动态番剧过滤
    UserSpaceArticleShow("user_space_article_show"),  // v11.166: 空间文章显示
    VideoCacheDownloadThread("video_cache_download_thread"),  // v11.167: 下载线程数
    DanmakuSendEffect("danmaku_send_effect"),  // v11.168: 弹幕发送特效
    VideoPlayerSubtitleSizeLevel("video_player_subtitle_size_level"),  // v11.169: 字幕大小级别
    LiveDanmakuBlockMedal("live_danmaku_block_medal"),  // v11.170: 直播弹幕勋章屏蔽
    CommentAutoExpand("comment_auto_expand"),  // v11.171: 评论自动展开
    VideoPlayerPipOpacity("video_player_pip_opacity"),  // v11.172: 画中画透明度
    VideoPlayerGestureSwipeAction("video_player_gesture_swipe_action"),  // v11.173: 滑动手势操作
    LiveDanmakuBlockKeywordCustom("live_danmaku_block_keyword_custom"),  // v11.174: 直播弹幕自定义关键词
    CommentShowUpTag("comment_show_up_tag"),  // v11.175: 评论UP主标签
    VideoPlayerAutoPlayRandom("video_player_auto_play_random"),  // v11.176: 随机播放
    DynamicFilterArticle("dynamic_filter_article"),  // v11.177: 动态文章过滤
    UserSpaceClipShow("user_space_clip_show"),  // v11.178: 空间小视频显示
    LiveDanmakuBlockBot("live_danmaku_block_bot"),  // v11.182: 直播弹幕机器人屏蔽
    CommentShowLevelTag("comment_show_level_tag"),  // v11.183: 评论等级标签
    VideoPlayerAutoPlayLoop("video_player_auto_play_loop"),  // v11.184: 自动循环播放
    DynamicFilterMusic("dynamic_filter_music"),  // v11.185: 动态音乐过滤
    VideoCacheAutoDeleteWatched("video_cache_auto_delete_watched"),  // v11.187: 自动删除已看缓存
    VideoPlayerSubtitleDelayMs("video_player_subtitle_delay_ms"),  // v11.189: 字幕延迟毫秒
    LiveDanmakuBlockEmoji("live_danmaku_block_emoji"),  // v11.190: 直播弹幕表情屏蔽
    QuickSettings("quick_settings"),  // v10.3: 快速设置面板
    WatchTimeStats("watch_time_stats"),  // v10.4: 观看时间统计
    MultiAccount("multi_account"),  // v10.5: 多账号切换
    PlayerGestureCustom("player_gesture_custom"),  // v10.6: 手势自定义
    AutoSkipIntroOutro("auto_skip_intro_outro"),  // v10.8: 自动跳过片头片尾
    LogTag("log_tag"),
    ExportLogs("export_logs"),
    UploadLogs("upload_logs"),
    AutoUpdateCheckEnabled("auto_update_check_enabled"),
    CheckUpdate("check_update"),

    // 设备信息
    DeviceCpu("device_cpu"),
    DeviceModel("device_model"),
    DeviceSystem("device_system"),
    DeviceDecoder("device_decoder"),
    DeviceScreen("device_screen"),
    DeviceRam("device_ram"),

}

data class SettingEntry(
    val id: SettingId,
    val title: String,
    val value: String,
    val desc: String?,
)
