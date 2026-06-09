package blbl.cat3399.core.prefs

// Auto-generated extension properties for AppPrefs

var AppPrefs.v55DanmakuSendQueue: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKU_SEND_QUEUE, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_DANMAKU_SEND_QUEUE, value).apply()

var AppPrefs.v55CastBandwidthLimit: Int
        get() = prefs.getInt(KEY_V55_CAST_BANDWIDTH_LIMIT, 0)
        set(value) = prefs.edit().putInt(KEY_V55_CAST_BANDWIDTH_LIMIT, value.coerceIn(0, 5)).apply()

var AppPrefs.v55GestureLockScreen: Boolean
        get() = prefs.getBoolean(KEY_V55_GESTURE_LOCK_SCREEN, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_GESTURE_LOCK_SCREEN, value).apply()

var AppPrefs.v55DanmakuFilterRegex: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKU_FILTER_REGEX, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_DANMAKU_FILTER_REGEX, value).apply()

var AppPrefs.v55CacheNetworkPolicy: Int
        get() = prefs.getInt(KEY_V55_CACHE_NETWORK_POLICY, 0)
        set(value) = prefs.edit().putInt(KEY_V55_CACHE_NETWORK_POLICY, value.coerceIn(0, 3)).apply()

var AppPrefs.v55ProgressBarDoubleTapAction: Int
        get() = prefs.getInt(KEY_V55_PROGRESS_BAR_DOUBLE_TAP_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V55_PROGRESS_BAR_DOUBLE_TAP_ACTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v55DanmakuFontWeightCustom: Int
        get() = prefs.getInt(KEY_V55_DANMAKU_FONT_WEIGHT_CUSTOM, 400)
        set(value) = prefs.edit().putInt(KEY_V55_DANMAKU_FONT_WEIGHT_CUSTOM, value.coerceIn(100, 900)).apply()

var AppPrefs.v55ColorTintCustom: Int
        get() = prefs.getInt(KEY_V55_COLOR_TINT_CUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V55_COLOR_TINT_CUSTOM, value.coerceIn(0, 10)).apply()

var AppPrefs.v55VolumeCompressor: Boolean
        get() = prefs.getBoolean(KEY_V55_VOLUME_COMPRESSOR, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_VOLUME_COMPRESSOR, value).apply()

var AppPrefs.v55DanmakuBgPadding: Int
        get() = prefs.getInt(KEY_V55_DANMAKU_BG_PADDING, 0)
        set(value) = prefs.edit().putInt(KEY_V55_DANMAKU_BG_PADDING, value.coerceIn(0, 10)).apply()

var AppPrefs.v55CastAutoQuality: Boolean
        get() = prefs.getBoolean(KEY_V55_CAST_AUTO_QUALITY, false)
        set(value) = prefs.edit().putBoolean(KEY_V55_CAST_AUTO_QUALITY, value).apply()



var AppPrefs.v56PlaybackSkipSilence: Boolean
        get() = prefs.getBoolean(KEY_V56_PLAYBACK_SKIP_SILENCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V56_PLAYBACK_SKIP_SILENCE, value).apply()

var AppPrefs.v56DanmakuFontWeightAuto: Boolean
        get() = prefs.getBoolean(KEY_V56_DANMAKU_FONT_WEIGHT_AUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V56_DANMAKU_FONT_WEIGHT_AUTO, value).apply()

var AppPrefs.v56ColorReduction: Int
        get() = prefs.getInt(KEY_V56_COLOR_REDUCTION, 0)
        set(value) = prefs.edit().putInt(KEY_V56_COLOR_REDUCTION, value.coerceIn(0, 100)).apply()

var AppPrefs.v56VolumeStereoWiden: Int
        get() = prefs.getInt(KEY_V56_VOLUME_STEREO_WIDEN, 0)
        set(value) = prefs.edit().putInt(KEY_V56_VOLUME_STEREO_WIDEN, value.coerceIn(0, 5)).apply()

var AppPrefs.v56DanmakuSendPriority: Boolean
        get() = prefs.getBoolean(KEY_V56_DANMAKU_SEND_PRIORITY, false)
        set(value) = prefs.edit().putBoolean(KEY_V56_DANMAKU_SEND_PRIORITY, value).apply()

var AppPrefs.v56CastAutoRotate: Boolean
        get() = prefs.getBoolean(KEY_V56_CAST_AUTO_ROTATE, false)
        set(value) = prefs.edit().putBoolean(KEY_V56_CAST_AUTO_ROTATE, value).apply()

var AppPrefs.v56GestureLongPressSpeed: Int
        get() = prefs.getInt(KEY_V56_GESTURE_LONG_PRESS_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V56_GESTURE_LONG_PRESS_SPEED, value.coerceIn(0, 5)).apply()

var AppPrefs.v56DanmakuFilterScore: Int
        get() = prefs.getInt(KEY_V56_DANMAKU_FILTER_SCORE, 0)
        set(value) = prefs.edit().putInt(KEY_V56_DANMAKU_FILTER_SCORE, value.coerceIn(0, 5)).apply()

var AppPrefs.v56CacheCompressEnabled: Boolean
        get() = prefs.getBoolean(KEY_V56_CACHE_COMPRESS_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V56_CACHE_COMPRESS_ENABLED, value).apply()

var AppPrefs.v56ProgressBarChaptersColor: Int
        get() = prefs.getInt(KEY_V56_PROGRESS_BAR_CHAPTERS_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V56_PROGRESS_BAR_CHAPTERS_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v56DanmakuFontLetterSpacing2: Int
        get() = prefs.getInt(KEY_V56_DANMAKU_FONT_LETTER_SPACING2, 0)
        set(value) = prefs.edit().putInt(KEY_V56_DANMAKU_FONT_LETTER_SPACING2, value.coerceIn(0, 10)).apply()

var AppPrefs.v56ColorSaturationCurve: Int
        get() = prefs.getInt(KEY_V56_COLOR_SATURATION_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V56_COLOR_SATURATION_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v56VolumePreAmp: Int
        get() = prefs.getInt(KEY_V56_VOLUME_PRE_AMP, 0)
        set(value) = prefs.edit().putInt(KEY_V56_VOLUME_PRE_AMP, value.coerceIn(-20, 20)).apply()

var AppPrefs.v56DanmakuBgGradientOpacity: Int
        get() = prefs.getInt(KEY_V56_DANMAKU_BG_GRADIENT_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V56_DANMAKU_BG_GRADIENT_OPACITY, value.coerceIn(0, 100)).apply()

var AppPrefs.v56CastSubtitleStyle: Int
        get() = prefs.getInt(KEY_V56_CAST_SUBTITLE_STYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V56_CAST_SUBTITLE_STYLE, value.coerceIn(0, 3)).apply()

var AppPrefs.v57PlaybackAutoSkipAds: Boolean
        get() = prefs.getBoolean(KEY_V57_PLAYBACK_AUTO_SKIP_ADS, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_PLAYBACK_AUTO_SKIP_ADS, value).apply()

var AppPrefs.v57DanmakuFontAntiAlias: Boolean
        get() = prefs.getBoolean(KEY_V57_DANMAKU_FONT_ANTI_ALIAS, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_DANMAKU_FONT_ANTI_ALIAS, value).apply()

var AppPrefs.v57ColorVibrance: Int
        get() = prefs.getInt(KEY_V57_COLOR_VIBRANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V57_COLOR_VIBRANCE, value.coerceIn(0, 100)).apply()

var AppPrefs.v57VolumeDucking: Boolean
        get() = prefs.getBoolean(KEY_V57_VOLUME_DUCKING, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_VOLUME_DUCKING, value).apply()

var AppPrefs.v57DanmakuSendRepeat: Boolean
        get() = prefs.getBoolean(KEY_V57_DANMAKU_SEND_REPEAT, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_DANMAKU_SEND_REPEAT, value).apply()

var AppPrefs.v57CastAutoFullscreen: Boolean
        get() = prefs.getBoolean(KEY_V57_CAST_AUTO_FULLSCREEN, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_CAST_AUTO_FULLSCREEN, value).apply()

var AppPrefs.v57GestureDoubleTapAction2: Int
        get() = prefs.getInt(KEY_V57_GESTURE_DOUBLE_TAP_ACTION2, 0)
        set(value) = prefs.edit().putInt(KEY_V57_GESTURE_DOUBLE_TAP_ACTION2, value.coerceIn(0, 5)).apply()

var AppPrefs.v57DanmakuFilterKeywords: Boolean
        get() = prefs.getBoolean(KEY_V57_DANMAKU_FILTER_KEYWORDS, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_DANMAKU_FILTER_KEYWORDS, value).apply()

var AppPrefs.v57CacheEncryptEnabled: Boolean
        get() = prefs.getBoolean(KEY_V57_CACHE_ENCRYPT_ENABLED, false)
        set(value) = prefs.edit().putBoolean(KEY_V57_CACHE_ENCRYPT_ENABLED, value).apply()

var AppPrefs.v57ProgressBarBufferColor: Int
        get() = prefs.getInt(KEY_V57_PROGRESS_BAR_BUFFER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V57_PROGRESS_BAR_BUFFER_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v57DanmakuFontBackground2: Int
        get() = prefs.getInt(KEY_V57_DANMAKU_FONT_BACKGROUND2, 0)
        set(value) = prefs.edit().putInt(KEY_V57_DANMAKU_FONT_BACKGROUND2, value.coerceIn(0, 10)).apply()

var AppPrefs.v57ColorHighlightRoll: Int
        get() = prefs.getInt(KEY_V57_COLOR_HIGHLIGHT_ROLL, 0)
        set(value) = prefs.edit().putInt(KEY_V57_COLOR_HIGHLIGHT_ROLL, value.coerceIn(0, 5)).apply()

var AppPrefs.v57VolumeMaxBoost: Int
        get() = prefs.getInt(KEY_V57_VOLUME_MAX_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V57_VOLUME_MAX_BOOST, value.coerceIn(0, 10)).apply()

var AppPrefs.v57DanmakuBgShadowColor2: Int
        get() = prefs.getInt(KEY_V57_DANMAKU_BG_SHADOW_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V57_DANMAKU_BG_SHADOW_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v57CastVideoBitrate: Int
        get() = prefs.getInt(KEY_V57_CAST_VIDEO_BITRATE, 0)
        set(value) = prefs.edit().putInt(KEY_V57_CAST_VIDEO_BITRATE, value.coerceIn(0, 5)).apply()

var AppPrefs.v58PlaybackAutoSpeed: Boolean
        get() = prefs.getBoolean(KEY_V58_PLAYBACK_AUTO_SPEED, false)
        set(value) = prefs.edit().putBoolean(KEY_V58_PLAYBACK_AUTO_SPEED, value).apply()

var AppPrefs.v58DanmakuFontBlendMode: Int
        get() = prefs.getInt(KEY_V58_DANMAKU_FONT_BLEND_MODE, 0)
        set(value) = prefs.edit().putInt(KEY_V58_DANMAKU_FONT_BLEND_MODE, value.coerceIn(0, 3)).apply()

var AppPrefs.v58ColorLift: Int
        get() = prefs.getInt(KEY_V58_COLOR_LIFT, 0)
        set(value) = prefs.edit().putInt(KEY_V58_COLOR_LIFT, value.coerceIn(0, 100)).apply()

var AppPrefs.v58VolumePanControl: Int
        get() = prefs.getInt(KEY_V58_VOLUME_PAN_CONTROL, 5)
        set(value) = prefs.edit().putInt(KEY_V58_VOLUME_PAN_CONTROL, value.coerceIn(0, 10)).apply()

var AppPrefs.v58DanmakuSendFontSize2: Int
        get() = prefs.getInt(KEY_V58_DANMAKU_SEND_FONT_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V58_DANMAKU_SEND_FONT_SIZE2, value.coerceIn(0, 10)).apply()

var AppPrefs.v58CastAutoResolution: Boolean
        get() = prefs.getBoolean(KEY_V58_CAST_AUTO_RESOLUTION, false)
        set(value) = prefs.edit().putBoolean(KEY_V58_CAST_AUTO_RESOLUTION, value).apply()

var AppPrefs.v58GestureSwipeAction2: Int
        get() = prefs.getInt(KEY_V58_GESTURE_SWIPE_ACTION2, 0)
        set(value) = prefs.edit().putInt(KEY_V58_GESTURE_SWIPE_ACTION2, value.coerceIn(0, 5)).apply()

var AppPrefs.v58DanmakuFilterRegex2: Boolean
        get() = prefs.getBoolean(KEY_V58_DANMAKU_FILTER_REGEX2, false)
        set(value) = prefs.edit().putBoolean(KEY_V58_DANMAKU_FILTER_REGEX2, value).apply()

var AppPrefs.v58CacheDiskPolicy: Int
        get() = prefs.getInt(KEY_V58_CACHE_DISK_POLICY, 0)
        set(value) = prefs.edit().putInt(KEY_V58_CACHE_DISK_POLICY, value.coerceIn(0, 3)).apply()

var AppPrefs.v58ProgressBarThumbColor: Int
        get() = prefs.getInt(KEY_V58_PROGRESS_BAR_THUMB_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V58_PROGRESS_BAR_THUMB_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v58DanmakuFontShadowColor2: Int
        get() = prefs.getInt(KEY_V58_DANMAKU_FONT_SHADOW_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V58_DANMAKU_FONT_SHADOW_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v58ColorMidtoneGamma: Int
        get() = prefs.getInt(KEY_V58_COLOR_MIDTONE_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V58_COLOR_MIDTONE_GAMMA, value.coerceIn(0, 5)).apply()

var AppPrefs.v58VolumeEQ: Int
        get() = prefs.getInt(KEY_V58_VOLUME_EQ, 0)
        set(value) = prefs.edit().putInt(KEY_V58_VOLUME_EQ, value.coerceIn(0, 5)).apply()

var AppPrefs.v58DanmakuBgBorderWidth: Int
        get() = prefs.getInt(KEY_V58_DANMAKU_BG_BORDER_WIDTH, 0)
        set(value) = prefs.edit().putInt(KEY_V58_DANMAKU_BG_BORDER_WIDTH, value.coerceIn(0, 10)).apply()

var AppPrefs.v58CastAudioDelay: Int
        get() = prefs.getInt(KEY_V58_CAST_AUDIO_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V58_CAST_AUDIO_DELAY, value.coerceIn(0, 10)).apply()

var AppPrefs.v59PlaybackSkipBlank: Boolean
        get() = prefs.getBoolean(KEY_V59_PLAYBACK_SKIP_BLANK, false)
        set(value) = prefs.edit().putBoolean(KEY_V59_PLAYBACK_SKIP_BLANK, value).apply()

var AppPrefs.v59DanmakuFontOutlineColor: Int
        get() = prefs.getInt(KEY_V59_DANMAKU_FONT_OUTLINE_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V59_DANMAKU_FONT_OUTLINE_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v59ColorGain: Int
        get() = prefs.getInt(KEY_V59_COLOR_GAIN, 0)
        set(value) = prefs.edit().putInt(KEY_V59_COLOR_GAIN, value.coerceIn(0, 100)).apply()

var AppPrefs.v59VolumeReverb: Int
        get() = prefs.getInt(KEY_V59_VOLUME_REVERB, 0)
        set(value) = prefs.edit().putInt(KEY_V59_VOLUME_REVERB, value.coerceIn(0, 5)).apply()

var AppPrefs.v59DanmakuSendBgColor: Int
        get() = prefs.getInt(KEY_V59_DANMAKU_SEND_BG_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V59_DANMAKU_SEND_BG_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v59CastAutoConnect: Boolean
        get() = prefs.getBoolean(KEY_V59_CAST_AUTO_CONNECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V59_CAST_AUTO_CONNECT, value).apply()

var AppPrefs.v59GestureLongPressAction2: Int
        get() = prefs.getInt(KEY_V59_GESTURE_LONG_PRESS_ACTION2, 0)
        set(value) = prefs.edit().putInt(KEY_V59_GESTURE_LONG_PRESS_ACTION2, value.coerceIn(0, 5)).apply()

var AppPrefs.v59DanmakuFilterLang: Int
        get() = prefs.getInt(KEY_V59_DANMAKU_FILTER_LANG, 0)
        set(value) = prefs.edit().putInt(KEY_V59_DANMAKU_FILTER_LANG, value.coerceIn(0, 3)).apply()

var AppPrefs.v59CacheMemoryPolicy: Int
        get() = prefs.getInt(KEY_V59_CACHE_MEMORY_POLICY, 0)
        set(value) = prefs.edit().putInt(KEY_V59_CACHE_MEMORY_POLICY, value.coerceIn(0, 3)).apply()

var AppPrefs.v59ProgressBarTrackColor: Int
        get() = prefs.getInt(KEY_V59_PROGRESS_BAR_TRACK_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V59_PROGRESS_BAR_TRACK_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v59DanmakuFontStrokeColor2: Int
        get() = prefs.getInt(KEY_V59_DANMAKU_FONT_STROKE_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V59_DANMAKU_FONT_STROKE_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v59ColorShadowGamma: Int
        get() = prefs.getInt(KEY_V59_COLOR_SHADOW_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V59_COLOR_SHADOW_GAMMA, value.coerceIn(0, 5)).apply()

var AppPrefs.v59VolumeCrossfeed: Int
        get() = prefs.getInt(KEY_V59_VOLUME_CROSSFEED, 0)
        set(value) = prefs.edit().putInt(KEY_V59_VOLUME_CROSSFEED, value.coerceIn(0, 5)).apply()

var AppPrefs.v59DanmakuBgGradientColor2: Int
        get() = prefs.getInt(KEY_V59_DANMAKU_BG_GRADIENT_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V59_DANMAKU_BG_GRADIENT_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v59CastVideoQuality: Int
        get() = prefs.getInt(KEY_V59_CAST_VIDEO_QUALITY, 0)
        set(value) = prefs.edit().putInt(KEY_V59_CAST_VIDEO_QUALITY, value.coerceIn(0, 5)).apply()

var AppPrefs.v60PlaybackSmartBuffer: Boolean
        get() = prefs.getBoolean(KEY_V60_PLAYBACK_SMART_BUFFER, false)
        set(value) = prefs.edit().putBoolean(KEY_V60_PLAYBACK_SMART_BUFFER, value).apply()

var AppPrefs.v60DanmakuFontWeight2: Int
        get() = prefs.getInt(KEY_V60_DANMAKU_FONT_WEIGHT2, 400)
        set(value) = prefs.edit().putInt(KEY_V60_DANMAKU_FONT_WEIGHT2, value.coerceIn(100, 900)).apply()

var AppPrefs.v60ColorHighlightGamma: Int
        get() = prefs.getInt(KEY_V60_COLOR_HIGHLIGHT_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V60_COLOR_HIGHLIGHT_GAMMA, value.coerceIn(0, 5)).apply()

var AppPrefs.v60VolumeDelay: Int
        get() = prefs.getInt(KEY_V60_VOLUME_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V60_VOLUME_DELAY, value.coerceIn(0, 5)).apply()

var AppPrefs.v60DanmakuSendBorderColor: Int
        get() = prefs.getInt(KEY_V60_DANMAKU_SEND_BORDER_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V60_DANMAKU_SEND_BORDER_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v60CastAutoAdapt: Boolean
        get() = prefs.getBoolean(KEY_V60_CAST_AUTO_ADAPT, false)
        set(value) = prefs.edit().putBoolean(KEY_V60_CAST_AUTO_ADAPT, value).apply()

var AppPrefs.v60GestureTripleTapAction: Int
        get() = prefs.getInt(KEY_V60_GESTURE_TRIPLE_TAP_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V60_GESTURE_TRIPLE_TAP_ACTION, value.coerceIn(0, 5)).apply()

var AppPrefs.v60DanmakuFilterLength2: Int
        get() = prefs.getInt(KEY_V60_DANMAKU_FILTER_LENGTH2, 0)
        set(value) = prefs.edit().putInt(KEY_V60_DANMAKU_FILTER_LENGTH2, value.coerceIn(0, 5)).apply()

var AppPrefs.v60CachePrefetchOnCharge: Boolean
        get() = prefs.getBoolean(KEY_V60_CACHE_PREFETCH_ON_CHARGE, false)
        set(value) = prefs.edit().putBoolean(KEY_V60_CACHE_PREFETCH_ON_CHARGE, value).apply()

var AppPrefs.v60ProgressBarScrubPreview: Boolean
        get() = prefs.getBoolean(KEY_V60_PROGRESS_BAR_SCRUB_PREVIEW, false)
        set(value) = prefs.edit().putBoolean(KEY_V60_PROGRESS_BAR_SCRUB_PREVIEW, value).apply()

var AppPrefs.v60DanmakuFontBgColor2: Int
        get() = prefs.getInt(KEY_V60_DANMAKU_FONT_BG_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V60_DANMAKU_FONT_BG_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v60ColorMidtoneSaturation: Int
        get() = prefs.getInt(KEY_V60_COLOR_MIDTONE_SATURATION, 0)
        set(value) = prefs.edit().putInt(KEY_V60_COLOR_MIDTONE_SATURATION, value.coerceIn(0, 5)).apply()

var AppPrefs.v60VolumeLoudnessTarget: Int
        get() = prefs.getInt(KEY_V60_VOLUME_LOUDNESS_TARGET, 0)
        set(value) = prefs.edit().putInt(KEY_V60_VOLUME_LOUDNESS_TARGET, value.coerceIn(0, 10)).apply()

var AppPrefs.v60DanmakuBgOpacity2: Int
        get() = prefs.getInt(KEY_V60_DANMAKU_BG_OPACITY2, 0)
        set(value) = prefs.edit().putInt(KEY_V60_DANMAKU_BG_OPACITY2, value.coerceIn(0, 100)).apply()

var AppPrefs.v60CastSubtitleSize: Int
        get() = prefs.getInt(KEY_V60_CAST_SUBTITLE_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V60_CAST_SUBTITLE_SIZE, value.coerceIn(0, 5)).apply()

var AppPrefs.v61PlaybackAutoQualitySwitch: Boolean
        get() = prefs.getBoolean(KEY_V61_PLAYBACK_AUTO_QUALITY_SWITCH, false)
        set(value) = prefs.edit().putBoolean(KEY_V61_PLAYBACK_AUTO_QUALITY_SWITCH, value).apply()

var AppPrefs.v61DanmakuFontGlowColor2: Int
        get() = prefs.getInt(KEY_V61_DANMAKU_FONT_GLOW_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V61_DANMAKU_FONT_GLOW_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v61ColorBlackGamma: Int
        get() = prefs.getInt(KEY_V61_COLOR_BLACK_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V61_COLOR_BLACK_GAMMA, value.coerceIn(0, 5)).apply()

var AppPrefs.v61VolumeCompressorRatio: Int
        get() = prefs.getInt(KEY_V61_VOLUME_COMPRESSOR_RATIO, 0)
        set(value) = prefs.edit().putInt(KEY_V61_VOLUME_COMPRESSOR_RATIO, value.coerceIn(0, 10)).apply()

var AppPrefs.v61DanmakuSendShadowSize: Int
        get() = prefs.getInt(KEY_V61_DANMAKU_SEND_SHADOW_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V61_DANMAKU_SEND_SHADOW_SIZE, value.coerceIn(0, 10)).apply()

var AppPrefs.v61CastAudioEnhance: Boolean
        get() = prefs.getBoolean(KEY_V61_CAST_AUDIO_ENHANCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V61_CAST_AUDIO_ENHANCE, value).apply()

var AppPrefs.v61GestureEdgeAction: Int
        get() = prefs.getInt(KEY_V61_GESTURE_EDGE_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V61_GESTURE_EDGE_ACTION, value.coerceIn(0, 5)).apply()

var AppPrefs.v61DanmakuFilterSender: Boolean
        get() = prefs.getBoolean(KEY_V61_DANMAKU_FILTER_SENDER, false)
        set(value) = prefs.edit().putBoolean(KEY_V61_DANMAKU_FILTER_SENDER, value).apply()

var AppPrefs.v61CacheAutoClearOnLow: Boolean
        get() = prefs.getBoolean(KEY_V61_CACHE_AUTO_CLEAR_ON_LOW, false)
        set(value) = prefs.edit().putBoolean(KEY_V61_CACHE_AUTO_CLEAR_ON_LOW, value).apply()

var AppPrefs.v61ProgressBarAnimation: Boolean
        get() = prefs.getBoolean(KEY_V61_PROGRESS_BAR_ANIMATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V61_PROGRESS_BAR_ANIMATION, value).apply()

var AppPrefs.v61DanmakuFontHighlightColor: Int
        get() = prefs.getInt(KEY_V61_DANMAKU_FONT_HIGHLIGHT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V61_DANMAKU_FONT_HIGHLIGHT_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v61ColorWhiteGamma: Int
        get() = prefs.getInt(KEY_V61_COLOR_WHITE_GAMMA, 0)
        set(value) = prefs.edit().putInt(KEY_V61_COLOR_WHITE_GAMMA, value.coerceIn(0, 5)).apply()

var AppPrefs.v61VolumeCompressorAttack: Int
        get() = prefs.getInt(KEY_V61_VOLUME_COMPRESSOR_ATTACK, 0)
        set(value) = prefs.edit().putInt(KEY_V61_VOLUME_COMPRESSOR_ATTACK, value.coerceIn(0, 5)).apply()

var AppPrefs.v61DanmakuBgBorderColor2: Int
        get() = prefs.getInt(KEY_V61_DANMAKU_BG_BORDER_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V61_DANMAKU_BG_BORDER_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v61CastSubtitleColor: Int
        get() = prefs.getInt(KEY_V61_CAST_SUBTITLE_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V61_CAST_SUBTITLE_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v62PlaybackAutoBitrate: Boolean
        get() = prefs.getBoolean(KEY_V62_PLAYBACK_AUTO_BITRATE, false)
        set(value) = prefs.edit().putBoolean(KEY_V62_PLAYBACK_AUTO_BITRATE, value).apply()

var AppPrefs.v62DanmakuFontWeight3: Int
        get() = prefs.getInt(KEY_V62_DANMAKU_FONT_WEIGHT3, 400)
        set(value) = prefs.edit().putInt(KEY_V62_DANMAKU_FONT_WEIGHT3, value.coerceIn(100, 900)).apply()

var AppPrefs.v62ColorGammaCurve: Int
        get() = prefs.getInt(KEY_V62_COLOR_GAMMA_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V62_COLOR_GAMMA_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v62VolumeCompressorRelease: Int
        get() = prefs.getInt(KEY_V62_VOLUME_COMPRESSOR_RELEASE, 0)
        set(value) = prefs.edit().putInt(KEY_V62_VOLUME_COMPRESSOR_RELEASE, value.coerceIn(0, 5)).apply()

var AppPrefs.v62DanmakuSendOutlineSize: Int
        get() = prefs.getInt(KEY_V62_DANMAKU_SEND_OUTLINE_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V62_DANMAKU_SEND_OUTLINE_SIZE, value.coerceIn(0, 10)).apply()

var AppPrefs.v62CastVideoEnhance: Boolean
        get() = prefs.getBoolean(KEY_V62_CAST_VIDEO_ENHANCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V62_CAST_VIDEO_ENHANCE, value).apply()

var AppPrefs.v62GestureCustomAction: Int
        get() = prefs.getInt(KEY_V62_GESTURE_CUSTOM_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V62_GESTURE_CUSTOM_ACTION, value.coerceIn(0, 5)).apply()

var AppPrefs.v62DanmakuFilterTimeRange: Boolean
        get() = prefs.getBoolean(KEY_V62_DANMAKU_FILTER_TIME_RANGE, false)
        set(value) = prefs.edit().putBoolean(KEY_V62_DANMAKU_FILTER_TIME_RANGE, value).apply()

var AppPrefs.v62CacheReadAhead: Int
        get() = prefs.getInt(KEY_V62_CACHE_READ_AHEAD, 0)
        set(value) = prefs.edit().putInt(KEY_V62_CACHE_READ_AHEAD, value.coerceIn(0, 5)).apply()

var AppPrefs.v62ProgressBarSensitivity: Int
        get() = prefs.getInt(KEY_V62_PROGRESS_BAR_SENSITIVITY, 0)
        set(value) = prefs.edit().putInt(KEY_V62_PROGRESS_BAR_SENSITIVITY, value.coerceIn(0, 5)).apply()

var AppPrefs.v62DanmakuFontGlowSize2: Int
        get() = prefs.getInt(KEY_V62_DANMAKU_FONT_GLOW_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V62_DANMAKU_FONT_GLOW_SIZE2, value.coerceIn(0, 10)).apply()

var AppPrefs.v62ColorTemperatureCurve: Int
        get() = prefs.getInt(KEY_V62_COLOR_TEMPERATURE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V62_COLOR_TEMPERATURE_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v62VolumeLimiterThreshold: Int
        get() = prefs.getInt(KEY_V62_VOLUME_LIMITER_THRESHOLD, 0)
        set(value) = prefs.edit().putInt(KEY_V62_VOLUME_LIMITER_THRESHOLD, value.coerceIn(0, 10)).apply()

var AppPrefs.v62DanmakuBgShadowBlur2: Int
        get() = prefs.getInt(KEY_V62_DANMAKU_BG_SHADOW_BLUR2, 0)
        set(value) = prefs.edit().putInt(KEY_V62_DANMAKU_BG_SHADOW_BLUR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v62CastSubtitleBgColor: Int
        get() = prefs.getInt(KEY_V62_CAST_SUBTITLE_BG_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V62_CAST_SUBTITLE_BG_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v63PlaybackAutoChapter: Boolean
        get() = prefs.getBoolean(KEY_V63_PLAYBACK_AUTO_CHAPTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V63_PLAYBACK_AUTO_CHAPTER, value).apply()

var AppPrefs.v63DanmakuFontLineSpacing2: Int
        get() = prefs.getInt(KEY_V63_DANMAKU_FONT_LINE_SPACING2, 0)
        set(value) = prefs.edit().putInt(KEY_V63_DANMAKU_FONT_LINE_SPACING2, value.coerceIn(0, 20)).apply()

var AppPrefs.v63ColorContrastCurve: Int
        get() = prefs.getInt(KEY_V63_COLOR_CONTRAST_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V63_COLOR_CONTRAST_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v63VolumeNormalizer2: Int
        get() = prefs.getInt(KEY_V63_VOLUME_NORMALIZER2, 0)
        set(value) = prefs.edit().putInt(KEY_V63_VOLUME_NORMALIZER2, value.coerceIn(0, 5)).apply()

var AppPrefs.v63DanmakuSendBgBlur: Int
        get() = prefs.getInt(KEY_V63_DANMAKU_SEND_BG_BLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V63_DANMAKU_SEND_BG_BLUR, value.coerceIn(0, 10)).apply()

var AppPrefs.v63CastAutoSubtitle: Boolean
        get() = prefs.getBoolean(KEY_V63_CAST_AUTO_SUBTITLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V63_CAST_AUTO_SUBTITLE, value).apply()

var AppPrefs.v63GesturePinchAction: Int
        get() = prefs.getInt(KEY_V63_GESTURE_PINCH_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V63_GESTURE_PINCH_ACTION, value.coerceIn(0, 5)).apply()

var AppPrefs.v63DanmakuFilterScore2: Int
        get() = prefs.getInt(KEY_V63_DANMAKU_FILTER_SCORE2, 0)
        set(value) = prefs.edit().putInt(KEY_V63_DANMAKU_FILTER_SCORE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v63CacheWakeupOnStart: Boolean
        get() = prefs.getBoolean(KEY_V63_CACHE_WAKEUP_ON_START, false)
        set(value) = prefs.edit().putBoolean(KEY_V63_CACHE_WAKEUP_ON_START, value).apply()

var AppPrefs.v63ProgressBarTickColor: Int
        get() = prefs.getInt(KEY_V63_PROGRESS_BAR_TICK_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V63_PROGRESS_BAR_TICK_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v63DanmakuFontWeightCustom2: Int
        get() = prefs.getInt(KEY_V63_DANMAKU_FONT_WEIGHT_CUSTOM2, 400)
        set(value) = prefs.edit().putInt(KEY_V63_DANMAKU_FONT_WEIGHT_CUSTOM2, value.coerceIn(100, 900)).apply()

var AppPrefs.v63ColorBrightnessCurve: Int
        get() = prefs.getInt(KEY_V63_COLOR_BRIGHTNESS_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V63_COLOR_BRIGHTNESS_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v63VolumeBassLpf: Int
        get() = prefs.getInt(KEY_V63_VOLUME_BASS_LPF, 0)
        set(value) = prefs.edit().putInt(KEY_V63_VOLUME_BASS_LPF, value.coerceIn(0, 5)).apply()

var AppPrefs.v63DanmakuBgShadowOffset: Int
        get() = prefs.getInt(KEY_V63_DANMAKU_BG_SHADOW_OFFSET, 0)
        set(value) = prefs.edit().putInt(KEY_V63_DANMAKU_BG_SHADOW_OFFSET, value.coerceIn(0, 10)).apply()

var AppPrefs.v63CastSubtitleOutline: Int
        get() = prefs.getInt(KEY_V63_CAST_SUBTITLE_OUTLINE, 0)
        set(value) = prefs.edit().putInt(KEY_V63_CAST_SUBTITLE_OUTLINE, value.coerceIn(0, 5)).apply()

var AppPrefs.v64PlaybackAutoLoopPlaylist: Boolean
        get() = prefs.getBoolean(KEY_V64_PLAYBACK_AUTO_LOOP_PLAYLIST, false)
        set(value) = prefs.edit().putBoolean(KEY_V64_PLAYBACK_AUTO_LOOP_PLAYLIST, value).apply()

var AppPrefs.v64DanmakuFontShadowOffset2: Int
        get() = prefs.getInt(KEY_V64_DANMAKU_FONT_SHADOW_OFFSET2, 0)
        set(value) = prefs.edit().putInt(KEY_V64_DANMAKU_FONT_SHADOW_OFFSET2, value.coerceIn(0, 10)).apply()

var AppPrefs.v64ColorSaturationBoost: Int
        get() = prefs.getInt(KEY_V64_COLOR_SATURATION_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V64_COLOR_SATURATION_BOOST, value.coerceIn(0, 100)).apply()

var AppPrefs.v64VolumeTrebleHpf: Int
        get() = prefs.getInt(KEY_V64_VOLUME_TREBLE_HPF, 0)
        set(value) = prefs.edit().putInt(KEY_V64_VOLUME_TREBLE_HPF, value.coerceIn(0, 5)).apply()

var AppPrefs.v64DanmakuSendBorderSize: Int
        get() = prefs.getInt(KEY_V64_DANMAKU_SEND_BORDER_SIZE, 0)
        set(value) = prefs.edit().putInt(KEY_V64_DANMAKU_SEND_BORDER_SIZE, value.coerceIn(0, 10)).apply()

var AppPrefs.v64CastAutoQuality2: Boolean
        get() = prefs.getBoolean(KEY_V64_CAST_AUTO_QUALITY2, false)
        set(value) = prefs.edit().putBoolean(KEY_V64_CAST_AUTO_QUALITY2, value).apply()

var AppPrefs.v64GestureRotationAction: Int
        get() = prefs.getInt(KEY_V64_GESTURE_ROTATION_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V64_GESTURE_ROTATION_ACTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v64DanmakuFilterLengthRange: Int
        get() = prefs.getInt(KEY_V64_DANMAKU_FILTER_LENGTH_RANGE, 0)
        set(value) = prefs.edit().putInt(KEY_V64_DANMAKU_FILTER_LENGTH_RANGE, value.coerceIn(0, 5)).apply()

var AppPrefs.v64CacheCleanupOnStart: Boolean
        get() = prefs.getBoolean(KEY_V64_CACHE_CLEANUP_ON_START, false)
        set(value) = prefs.edit().putBoolean(KEY_V64_CACHE_CLEANUP_ON_START, value).apply()

var AppPrefs.v64ProgressBarGlowColor: Int
        get() = prefs.getInt(KEY_V64_PROGRESS_BAR_GLOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V64_PROGRESS_BAR_GLOW_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v64DanmakuFontItalic2: Boolean
        get() = prefs.getBoolean(KEY_V64_DANMAKU_FONT_ITALIC2, false)
        set(value) = prefs.edit().putBoolean(KEY_V64_DANMAKU_FONT_ITALIC2, value).apply()

var AppPrefs.v64ColorVividnessBoost: Int
        get() = prefs.getInt(KEY_V64_COLOR_VIVIDNESS_BOOST, 0)
        set(value) = prefs.edit().putInt(KEY_V64_COLOR_VIVIDNESS_BOOST, value.coerceIn(0, 100)).apply()

var AppPrefs.v64VolumeSurroundAngle: Int
        get() = prefs.getInt(KEY_V64_VOLUME_SURROUND_ANGLE, 0)
        set(value) = prefs.edit().putInt(KEY_V64_VOLUME_SURROUND_ANGLE, value.coerceIn(0, 10)).apply()

var AppPrefs.v64DanmakuBgPadding2: Int
        get() = prefs.getInt(KEY_V64_DANMAKU_BG_PADDING2, 0)
        set(value) = prefs.edit().putInt(KEY_V64_DANMAKU_BG_PADDING2, value.coerceIn(0, 20)).apply()

var AppPrefs.v64CastSubtitleDelay: Int
        get() = prefs.getInt(KEY_V64_CAST_SUBTITLE_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V64_CAST_SUBTITLE_DELAY, value.coerceIn(0, 10)).apply()

var AppPrefs.v65PlaybackAutoSkipRecap: Boolean
        get() = prefs.getBoolean(KEY_V65_PLAYBACK_AUTO_SKIP_RECAP, false)
        set(value) = prefs.edit().putBoolean(KEY_V65_PLAYBACK_AUTO_SKIP_RECAP, value).apply()

var AppPrefs.v65DanmakuFontStrike2: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKU_FONT_STRIKE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V65_DANMAKU_FONT_STRIKE2, value).apply()

var AppPrefs.v65ColorHueCurve: Int
        get() = prefs.getInt(KEY_V65_COLOR_HUE_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V65_COLOR_HUE_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v65VolumeBassEnhance: Int
        get() = prefs.getInt(KEY_V65_VOLUME_BASS_ENHANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V65_VOLUME_BASS_ENHANCE, value.coerceIn(0, 5)).apply()

var AppPrefs.v65DanmakuSendAnimDuration: Int
        get() = prefs.getInt(KEY_V65_DANMAKU_SEND_ANIM_DURATION, 0)
        set(value) = prefs.edit().putInt(KEY_V65_DANMAKU_SEND_ANIM_DURATION, value.coerceIn(0, 5)).apply()

var AppPrefs.v65CastAutoReconnect2: Boolean
        get() = prefs.getBoolean(KEY_V65_CAST_AUTO_RECONNECT2, false)
        set(value) = prefs.edit().putBoolean(KEY_V65_CAST_AUTO_RECONNECT2, value).apply()

var AppPrefs.v65GestureShakeAction: Int
        get() = prefs.getInt(KEY_V65_GESTURE_SHAKE_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V65_GESTURE_SHAKE_ACTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v65DanmakuFilterDuplicate2: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKU_FILTER_DUPLICATE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V65_DANMAKU_FILTER_DUPLICATE2, value).apply()

var AppPrefs.v65CachePrefetchOnIdle: Boolean
        get() = prefs.getBoolean(KEY_V65_CACHE_PREFETCH_ON_IDLE, false)
        set(value) = prefs.edit().putBoolean(KEY_V65_CACHE_PREFETCH_ON_IDLE, value).apply()

var AppPrefs.v65ProgressBarGradientSpeed: Int
        get() = prefs.getInt(KEY_V65_PROGRESS_BAR_GRADIENT_SPEED, 0)
        set(value) = prefs.edit().putInt(KEY_V65_PROGRESS_BAR_GRADIENT_SPEED, value.coerceIn(0, 5)).apply()

var AppPrefs.v65DanmakuFontUnderline2: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKU_FONT_UNDERLINE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V65_DANMAKU_FONT_UNDERLINE2, value).apply()

var AppPrefs.v65ColorLiftGammaGain: Int
        get() = prefs.getInt(KEY_V65_COLOR_LIFT_GAMMA_GAIN, 0)
        set(value) = prefs.edit().putInt(KEY_V65_COLOR_LIFT_GAMMA_GAIN, value.coerceIn(0, 5)).apply()

var AppPrefs.v65VolumeTrebleEnhance: Int
        get() = prefs.getInt(KEY_V65_VOLUME_TREBLE_ENHANCE, 0)
        set(value) = prefs.edit().putInt(KEY_V65_VOLUME_TREBLE_ENHANCE, value.coerceIn(0, 5)).apply()

var AppPrefs.v65DanmakuBgBorderRadius2: Int
        get() = prefs.getInt(KEY_V65_DANMAKU_BG_BORDER_RADIUS2, 0)
        set(value) = prefs.edit().putInt(KEY_V65_DANMAKU_BG_BORDER_RADIUS2, value.coerceIn(0, 20)).apply()

var AppPrefs.v65CastSubtitleBgOpacity: Int
        get() = prefs.getInt(KEY_V65_CAST_SUBTITLE_BG_OPACITY, 0)
        set(value) = prefs.edit().putInt(KEY_V65_CAST_SUBTITLE_BG_OPACITY, value.coerceIn(0, 100)).apply()

var AppPrefs.v66PlaybackSmartSeek: Boolean
        get() = prefs.getBoolean(KEY_V66_PLAYBACK_SMART_SEEK, false)
        set(value) = prefs.edit().putBoolean(KEY_V66_PLAYBACK_SMART_SEEK, value).apply()

var AppPrefs.v66DanmakuFontMonospace2: Boolean
        get() = prefs.getBoolean(KEY_V66_DANMAKU_FONT_MONOSPACE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V66_DANMAKU_FONT_MONOSPACE2, value).apply()

var AppPrefs.v66ColorToneMapping: Int
        get() = prefs.getInt(KEY_V66_COLOR_TONE_MAPPING, 0)
        set(value) = prefs.edit().putInt(KEY_V66_COLOR_TONE_MAPPING, value.coerceIn(0, 5)).apply()

var AppPrefs.v66VolumeChannelDelay: Int
        get() = prefs.getInt(KEY_V66_VOLUME_CHANNEL_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V66_VOLUME_CHANNEL_DELAY, value.coerceIn(0, 5)).apply()

var AppPrefs.v66DanmakuSendFontSize3: Int
        get() = prefs.getInt(KEY_V66_DANMAKU_SEND_FONT_SIZE3, 0)
        set(value) = prefs.edit().putInt(KEY_V66_DANMAKU_SEND_FONT_SIZE3, value.coerceIn(0, 10)).apply()

var AppPrefs.v66CastAutoAdapt2: Boolean
        get() = prefs.getBoolean(KEY_V66_CAST_AUTO_ADAPT2, false)
        set(value) = prefs.edit().putBoolean(KEY_V66_CAST_AUTO_ADAPT2, value).apply()

var AppPrefs.v66GestureMultiTouchAction: Int
        get() = prefs.getInt(KEY_V66_GESTURE_MULTI_TOUCH_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V66_GESTURE_MULTI_TOUCH_ACTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v66DanmakuFilterEmote: Boolean
        get() = prefs.getBoolean(KEY_V66_DANMAKU_FILTER_EMOTE, false)
        set(value) = prefs.edit().putBoolean(KEY_V66_DANMAKU_FILTER_EMOTE, value).apply()

var AppPrefs.v66CacheCompressLevel: Int
        get() = prefs.getInt(KEY_V66_CACHE_COMPRESS_LEVEL, 0)
        set(value) = prefs.edit().putInt(KEY_V66_CACHE_COMPRESS_LEVEL, value.coerceIn(0, 5)).apply()

var AppPrefs.v66ProgressBarShadowColor: Int
        get() = prefs.getInt(KEY_V66_PROGRESS_BAR_SHADOW_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V66_PROGRESS_BAR_SHADOW_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v66DanmakuFontColor2: Int
        get() = prefs.getInt(KEY_V66_DANMAKU_FONT_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V66_DANMAKU_FONT_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v66ColorACESFilm: Int
        get() = prefs.getInt(KEY_V66_COLOR_ACES_FILM, 0)
        set(value) = prefs.edit().putInt(KEY_V66_COLOR_ACES_FILM, value.coerceIn(0, 5)).apply()

var AppPrefs.v66VolumeDynamicBass: Int
        get() = prefs.getInt(KEY_V66_VOLUME_DYNAMIC_BASS, 0)
        set(value) = prefs.edit().putInt(KEY_V66_VOLUME_DYNAMIC_BASS, value.coerceIn(0, 5)).apply()

var AppPrefs.v66DanmakuBgGradientColor3: Int
        get() = prefs.getInt(KEY_V66_DANMAKU_BG_GRADIENT_COLOR3, 0)
        set(value) = prefs.edit().putInt(KEY_V66_DANMAKU_BG_GRADIENT_COLOR3, value.coerceIn(0, 10)).apply()

var AppPrefs.v66CastSubtitleFont: Int
        get() = prefs.getInt(KEY_V66_CAST_SUBTITLE_FONT, 0)
        set(value) = prefs.edit().putInt(KEY_V66_CAST_SUBTITLE_FONT, value.coerceIn(0, 3)).apply()

var AppPrefs.v67PlaybackAutoSkipPreview: Boolean
        get() = prefs.getBoolean(KEY_V67_PLAYBACK_AUTO_SKIP_PREVIEW, false)
        set(value) = prefs.edit().putBoolean(KEY_V67_PLAYBACK_AUTO_SKIP_PREVIEW, value).apply()

var AppPrefs.v67DanmakuFontOutlineColor2: Int
        get() = prefs.getInt(KEY_V67_DANMAKU_FONT_OUTLINE_COLOR2, 0)
        set(value) = prefs.edit().putInt(KEY_V67_DANMAKU_FONT_OUTLINE_COLOR2, value.coerceIn(0, 10)).apply()

var AppPrefs.v67ColorLogCurve: Int
        get() = prefs.getInt(KEY_V67_COLOR_LOG_CURVE, 0)
        set(value) = prefs.edit().putInt(KEY_V67_COLOR_LOG_CURVE, value.coerceIn(0, 5)).apply()

var AppPrefs.v67VolumeSpatialAudio: Int
        get() = prefs.getInt(KEY_V67_VOLUME_SPATIAL_AUDIO, 0)
        set(value) = prefs.edit().putInt(KEY_V67_VOLUME_SPATIAL_AUDIO, value.coerceIn(0, 5)).apply()

var AppPrefs.v67DanmakuSendBgRadius: Int
        get() = prefs.getInt(KEY_V67_DANMAKU_SEND_BG_RADIUS, 0)
        set(value) = prefs.edit().putInt(KEY_V67_DANMAKU_SEND_BG_RADIUS, value.coerceIn(0, 10)).apply()

var AppPrefs.v67CastAutoConnect2: Boolean
        get() = prefs.getBoolean(KEY_V67_CAST_AUTO_CONNECT2, false)
        set(value) = prefs.edit().putBoolean(KEY_V67_CAST_AUTO_CONNECT2, value).apply()

var AppPrefs.v67GestureFingerCountAction: Int
        get() = prefs.getInt(KEY_V67_GESTURE_FINGER_COUNT_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V67_GESTURE_FINGER_COUNT_ACTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v67DanmakuFilterCombo: Boolean
        get() = prefs.getBoolean(KEY_V67_DANMAKU_FILTER_COMBO, false)
        set(value) = prefs.edit().putBoolean(KEY_V67_DANMAKU_FILTER_COMBO, value).apply()

var AppPrefs.v67CacheWritePolicy: Int
        get() = prefs.getInt(KEY_V67_CACHE_WRITE_POLICY, 0)
        set(value) = prefs.edit().putInt(KEY_V67_CACHE_WRITE_POLICY, value.coerceIn(0, 3)).apply()

var AppPrefs.v67ProgressBarGradientColor: Int
        get() = prefs.getInt(KEY_V67_PROGRESS_BAR_GRADIENT_COLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V67_PROGRESS_BAR_GRADIENT_COLOR, value.coerceIn(0, 10)).apply()

var AppPrefs.v67DanmakuFontShadowColor3: Int
        get() = prefs.getInt(KEY_V67_DANMAKU_FONT_SHADOW_COLOR3, 0)
        set(value) = prefs.edit().putInt(KEY_V67_DANMAKU_FONT_SHADOW_COLOR3, value.coerceIn(0, 10)).apply()

var AppPrefs.v67ColorSigmoidContrast: Int
        get() = prefs.getInt(KEY_V67_COLOR_SIGMOID_CONTRAST, 0)
        set(value) = prefs.edit().putInt(KEY_V67_COLOR_SIGMOID_CONTRAST, value.coerceIn(0, 5)).apply()

var AppPrefs.v67VolumeSurroundDelay: Int
        get() = prefs.getInt(KEY_V67_VOLUME_SURROUND_DELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V67_VOLUME_SURROUND_DELAY, value.coerceIn(0, 5)).apply()

var AppPrefs.v67DanmakuBgShadowColor3: Int
        get() = prefs.getInt(KEY_V67_DANMAKU_BG_SHADOW_COLOR3, 0)
        set(value) = prefs.edit().putInt(KEY_V67_DANMAKU_BG_SHADOW_COLOR3, value.coerceIn(0, 10)).apply()

var AppPrefs.v67CastSubtitleShadow: Int
        get() = prefs.getInt(KEY_V67_CAST_SUBTITLE_SHADOW, 0)
        set(value) = prefs.edit().putInt(KEY_V67_CAST_SUBTITLE_SHADOW, value.coerceIn(0, 5)).apply()

var AppPrefs.v68PlaybackAutoSkipPadding: Boolean
        get() = prefs.getBoolean(KEY_V68_PLAYBACK_AUTO_SKIP_PADDING, false)
        set(value) = prefs.edit().putBoolean(KEY_V68_PLAYBACK_AUTO_SKIP_PADDING, value).apply()

var AppPrefs.v68DanmakuFontGlowColor3: Int
        get() = prefs.getInt(KEY_V68_DANMAKU_FONT_GLOW_COLOR3, 0)
        set(value) = prefs.edit().putInt(KEY_V68_DANMAKU_FONT_GLOW_COLOR3, value.coerceIn(0, 10)).apply()

var AppPrefs.v68ColorFilmGrain: Int
        get() = prefs.getInt(KEY_V68_COLOR_FILM_GRAIN, 0)
        set(value) = prefs.edit().putInt(KEY_V68_COLOR_FILM_GRAIN, value.coerceIn(0, 100)).apply()

var AppPrefs.v68VolumeChannelExtractor: Int
        get() = prefs.getInt(KEY_V68_VOLUME_CHANNEL_EXTRACTOR, 0)
        set(value) = prefs.edit().putInt(KEY_V68_VOLUME_CHANNEL_EXTRACTOR, value.coerceIn(0, 3)).apply()

var AppPrefs.v68DanmakuSendBgGradient: Int
        get() = prefs.getInt(KEY_V68_DANMAKU_SEND_BG_GRADIENT, 0)
        set(value) = prefs.edit().putInt(KEY_V68_DANMAKU_SEND_BG_GRADIENT, value.coerceIn(0, 5)).apply()

var AppPrefs.v68CastAutoQuality3: Boolean
        get() = prefs.getBoolean(KEY_V68_CAST_AUTO_QUALITY3, false)
        set(value) = prefs.edit().putBoolean(KEY_V68_CAST_AUTO_QUALITY3, value).apply()

var AppPrefs.v68GesturePressureAction: Int
        get() = prefs.getInt(KEY_V68_GESTURE_PRESSURE_ACTION, 0)
        set(value) = prefs.edit().putInt(KEY_V68_GESTURE_PRESSURE_ACTION, value.coerceIn(0, 3)).apply()

var AppPrefs.v68DanmakuFilterSuperChat: Boolean
        get() = prefs.getBoolean(KEY_V68_DANMAKU_FILTER_SUPER_CHAT, false)
        set(value) = prefs.edit().putBoolean(KEY_V68_DANMAKU_FILTER_SUPER_CHAT, value).apply()

var AppPrefs.v68CachePrefetchOnStart: Boolean
        get() = prefs.getBoolean(KEY_V68_CACHE_PREFETCH_ON_START, false)
        set(value) = prefs.edit().putBoolean(KEY_V68_CACHE_PREFETCH_ON_START, value).apply()

var AppPrefs.v68ProgressBarGlowEffect: Boolean
        get() = prefs.getBoolean(KEY_V68_PROGRESS_BAR_GLOW_EFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V68_PROGRESS_BAR_GLOW_EFFECT, value).apply()

var AppPrefs.v68DanmakuFontWeightCustom3: Int
        get() = prefs.getInt(KEY_V68_DANMAKU_FONT_WEIGHT_CUSTOM3, 400)
        set(value) = prefs.edit().putInt(KEY_V68_DANMAKU_FONT_WEIGHT_CUSTOM3, value.coerceIn(100, 900)).apply()

var AppPrefs.v68ColorBloom: Int
        get() = prefs.getInt(KEY_V68_COLOR_BLOOM, 0)
        set(value) = prefs.edit().putInt(KEY_V68_COLOR_BLOOM, value.coerceIn(0, 100)).apply()

var AppPrefs.v68VolumeDynamicRange: Int
        get() = prefs.getInt(KEY_V68_VOLUME_DYNAMIC_RANGE, 0)
        set(value) = prefs.edit().putInt(KEY_V68_VOLUME_DYNAMIC_RANGE, value.coerceIn(0, 5)).apply()

var AppPrefs.v68DanmakuBgShadowOffset2: Int
        get() = prefs.getInt(KEY_V68_DANMAKU_BG_SHADOW_OFFSET2, 0)
        set(value) = prefs.edit().putInt(KEY_V68_DANMAKU_BG_SHADOW_OFFSET2, value.coerceIn(0, 10)).apply()

var AppPrefs.v68CastSubtitleGlow: Int
        get() = prefs.getInt(KEY_V68_CAST_SUBTITLE_GLOW, 0)
        set(value) = prefs.edit().putInt(KEY_V68_CAST_SUBTITLE_GLOW, value.coerceIn(0, 5)).apply()

var AppPrefs.v69PlaybackAutoSkipFiller2: Boolean
        get() = prefs.getBoolean(KEY_V69_PLAYBACK_AUTO_SKIP_FILLER2, false)
        set(value) = prefs.edit().putBoolean(KEY_V69_PLAYBACK_AUTO_SKIP_FILLER2, value).apply()

var AppPrefs.v69DanmakuFontWeightFinal: Int
        get() = prefs.getInt(KEY_V69_DANMAKU_FONT_WEIGHT_FINAL, 400)
        set(value) = prefs.edit().putInt(KEY_V69_DANMAKU_FONT_WEIGHT_FINAL, value.coerceIn(100, 900)).apply()

var AppPrefs.v69ColorFinal: Int
        get() = prefs.getInt(KEY_V69_COLOR_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_COLOR_FINAL, value.coerceIn(0, 10)).apply()

var AppPrefs.v69VolumeFinal: Int
        get() = prefs.getInt(KEY_V69_VOLUME_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_VOLUME_FINAL, value.coerceIn(0, 5)).apply()

var AppPrefs.v69DanmakuSendFinal: Int
        get() = prefs.getInt(KEY_V69_DANMAKU_SEND_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_DANMAKU_SEND_FINAL, value.coerceIn(0, 5)).apply()

var AppPrefs.v69CastFinal: Boolean
        get() = prefs.getBoolean(KEY_V69_CAST_FINAL, false)
        set(value) = prefs.edit().putBoolean(KEY_V69_CAST_FINAL, value).apply()

var AppPrefs.v69GestureFinal: Int
        get() = prefs.getInt(KEY_V69_GESTURE_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_GESTURE_FINAL, value.coerceIn(0, 5)).apply()

var AppPrefs.v69DanmakuFilterFinal: Boolean
        get() = prefs.getBoolean(KEY_V69_DANMAKU_FILTER_FINAL, false)
        set(value) = prefs.edit().putBoolean(KEY_V69_DANMAKU_FILTER_FINAL, value).apply()

var AppPrefs.v69CacheFinal: Boolean
        get() = prefs.getBoolean(KEY_V69_CACHE_FINAL, false)
        set(value) = prefs.edit().putBoolean(KEY_V69_CACHE_FINAL, value).apply()

var AppPrefs.v69ProgressBarFinal: Int
        get() = prefs.getInt(KEY_V69_PROGRESS_BAR_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_PROGRESS_BAR_FINAL, value.coerceIn(0, 10)).apply()

var AppPrefs.v69DanmakuFontFinal: Int
        get() = prefs.getInt(KEY_V69_DANMAKU_FONT_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_DANMAKU_FONT_FINAL, value.coerceIn(0, 10)).apply()

var AppPrefs.v69ColorFinal2: Int
        get() = prefs.getInt(KEY_V69_COLOR_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V69_COLOR_FINAL2, value.coerceIn(0, 10)).apply()

var AppPrefs.v69VolumeFinal2: Int
        get() = prefs.getInt(KEY_V69_VOLUME_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V69_VOLUME_FINAL2, value.coerceIn(0, 5)).apply()

var AppPrefs.v69DanmakuBgFinal: Int
        get() = prefs.getInt(KEY_V69_DANMAKU_BG_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_DANMAKU_BG_FINAL, value.coerceIn(0, 10)).apply()

var AppPrefs.v69CastSubtitleFinal: Int
        get() = prefs.getInt(KEY_V69_CAST_SUBTITLE_FINAL, 0)
        set(value) = prefs.edit().putInt(KEY_V69_CAST_SUBTITLE_FINAL, value.coerceIn(0, 5)).apply()

var AppPrefs.v70PlaybackFinal: Boolean
        get() = prefs.getBoolean(KEY_V70_PLAYBACK_FINAL, false)
        set(value) = prefs.edit().putBoolean(KEY_V70_PLAYBACK_FINAL, value).apply()

var AppPrefs.v70DanmakuFontFinal2: Int
        get() = prefs.getInt(KEY_V70_DANMAKU_FONT_FINAL2, 400)
        set(value) = prefs.edit().putInt(KEY_V70_DANMAKU_FONT_FINAL2, value.coerceIn(100, 900)).apply()

var AppPrefs.v70ColorFinal3: Int
        get() = prefs.getInt(KEY_V70_COLOR_FINAL3, 0)
        set(value) = prefs.edit().putInt(KEY_V70_COLOR_FINAL3, value.coerceIn(0, 10)).apply()

var AppPrefs.v70VolumeFinal3: Int
        get() = prefs.getInt(KEY_V70_VOLUME_FINAL3, 0)
        set(value) = prefs.edit().putInt(KEY_V70_VOLUME_FINAL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v70DanmakuSendFinal2: Int
        get() = prefs.getInt(KEY_V70_DANMAKU_SEND_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V70_DANMAKU_SEND_FINAL2, value.coerceIn(0, 5)).apply()

var AppPrefs.v70CastFinal2: Boolean
        get() = prefs.getBoolean(KEY_V70_CAST_FINAL2, false)
        set(value) = prefs.edit().putBoolean(KEY_V70_CAST_FINAL2, value).apply()

var AppPrefs.v70GestureFinal2: Int
        get() = prefs.getInt(KEY_V70_GESTURE_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V70_GESTURE_FINAL2, value.coerceIn(0, 5)).apply()

var AppPrefs.v70DanmakuFilterFinal2: Boolean
        get() = prefs.getBoolean(KEY_V70_DANMAKU_FILTER_FINAL2, false)
        set(value) = prefs.edit().putBoolean(KEY_V70_DANMAKU_FILTER_FINAL2, value).apply()

var AppPrefs.v70CacheFinal2: Boolean
        get() = prefs.getBoolean(KEY_V70_CACHE_FINAL2, false)
        set(value) = prefs.edit().putBoolean(KEY_V70_CACHE_FINAL2, value).apply()

var AppPrefs.v70ProgressBarFinal2: Int
        get() = prefs.getInt(KEY_V70_PROGRESS_BAR_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V70_PROGRESS_BAR_FINAL2, value.coerceIn(0, 10)).apply()

var AppPrefs.v70DanmakuFontFinal3: Int
        get() = prefs.getInt(KEY_V70_DANMAKU_FONT_FINAL3, 0)
        set(value) = prefs.edit().putInt(KEY_V70_DANMAKU_FONT_FINAL3, value.coerceIn(0, 10)).apply()

var AppPrefs.v70ColorFinal4: Int
        get() = prefs.getInt(KEY_V70_COLOR_FINAL4, 0)
        set(value) = prefs.edit().putInt(KEY_V70_COLOR_FINAL4, value.coerceIn(0, 10)).apply()

var AppPrefs.v70VolumeFinal4: Int
        get() = prefs.getInt(KEY_V70_VOLUME_FINAL4, 0)
        set(value) = prefs.edit().putInt(KEY_V70_VOLUME_FINAL4, value.coerceIn(0, 5)).apply()

var AppPrefs.v70DanmakuBgFinal2: Int
        get() = prefs.getInt(KEY_V70_DANMAKU_BG_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V70_DANMAKU_BG_FINAL2, value.coerceIn(0, 10)).apply()

var AppPrefs.v70CastSubtitleFinal2: Int
        get() = prefs.getInt(KEY_V70_CAST_SUBTITLE_FINAL2, 0)
        set(value) = prefs.edit().putInt(KEY_V70_CAST_SUBTITLE_FINAL2, value.coerceIn(0, 5)).apply()





    // ===== v121.x =====

var AppPrefs.v121PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V121_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V121_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v121DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V121_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v121ColorFade2: Int
        get() = prefs.getInt(KEY_V121_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v121VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V121_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v121CastBitrate2: Int
        get() = prefs.getInt(KEY_V121_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v121GestureTapZone2: Int
        get() = prefs.getInt(KEY_V121_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v121CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V121_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V121_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v121ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V121_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V121_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v121PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V121_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V121_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v121DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V121_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v121ColorTint2: Int
        get() = prefs.getInt(KEY_V121_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v121VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V121_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v121CastCodec2: Int
        get() = prefs.getInt(KEY_V121_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v121GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V121_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V121_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v121CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V121_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V121_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v122.x =====

var AppPrefs.v122PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V122_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V122_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v122DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V122_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v122ColorFade2: Int
        get() = prefs.getInt(KEY_V122_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v122VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V122_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v122CastBitrate2: Int
        get() = prefs.getInt(KEY_V122_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v122GestureTapZone2: Int
        get() = prefs.getInt(KEY_V122_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v122CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V122_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V122_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v122ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V122_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V122_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v122PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V122_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V122_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v122DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V122_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v122ColorTint2: Int
        get() = prefs.getInt(KEY_V122_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v122VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V122_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v122CastCodec2: Int
        get() = prefs.getInt(KEY_V122_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v122GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V122_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V122_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v122CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V122_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V122_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v123.x =====

var AppPrefs.v123PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V123_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V123_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v123DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V123_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v123ColorFade2: Int
        get() = prefs.getInt(KEY_V123_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v123VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V123_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v123CastBitrate2: Int
        get() = prefs.getInt(KEY_V123_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v123GestureTapZone2: Int
        get() = prefs.getInt(KEY_V123_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v123CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V123_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V123_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v123ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V123_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V123_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v123PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V123_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V123_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v123DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V123_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v123ColorTint2: Int
        get() = prefs.getInt(KEY_V123_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v123VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V123_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v123CastCodec2: Int
        get() = prefs.getInt(KEY_V123_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v123GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V123_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V123_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v123CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V123_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V123_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v124.x =====

var AppPrefs.v124PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V124_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V124_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v124DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V124_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v124ColorFade2: Int
        get() = prefs.getInt(KEY_V124_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v124VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V124_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v124CastBitrate2: Int
        get() = prefs.getInt(KEY_V124_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v124GestureTapZone2: Int
        get() = prefs.getInt(KEY_V124_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v124CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V124_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V124_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v124ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V124_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V124_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v124PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V124_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V124_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v124DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V124_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v124ColorTint2: Int
        get() = prefs.getInt(KEY_V124_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v124VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V124_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v124CastCodec2: Int
        get() = prefs.getInt(KEY_V124_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v124GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V124_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V124_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v124CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V124_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V124_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v125.x =====

var AppPrefs.v125PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V125_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V125_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v125DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V125_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v125ColorFade2: Int
        get() = prefs.getInt(KEY_V125_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v125VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V125_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v125CastBitrate2: Int
        get() = prefs.getInt(KEY_V125_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v125GestureTapZone2: Int
        get() = prefs.getInt(KEY_V125_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v125CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V125_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V125_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v125ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V125_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V125_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v125PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V125_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V125_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v125DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V125_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v125ColorTint2: Int
        get() = prefs.getInt(KEY_V125_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v125VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V125_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v125CastCodec2: Int
        get() = prefs.getInt(KEY_V125_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v125GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V125_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V125_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v125CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V125_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V125_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v126.x =====

var AppPrefs.v126PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V126_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V126_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v126DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V126_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v126ColorFade2: Int
        get() = prefs.getInt(KEY_V126_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v126VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V126_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v126CastBitrate2: Int
        get() = prefs.getInt(KEY_V126_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v126GestureTapZone2: Int
        get() = prefs.getInt(KEY_V126_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v126CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V126_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V126_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v126ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V126_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V126_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v126PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V126_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V126_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v126DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V126_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v126ColorTint2: Int
        get() = prefs.getInt(KEY_V126_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v126VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V126_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v126CastCodec2: Int
        get() = prefs.getInt(KEY_V126_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v126GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V126_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V126_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v126CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V126_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V126_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v127.x =====

var AppPrefs.v127PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V127_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V127_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v127DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V127_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v127ColorFade2: Int
        get() = prefs.getInt(KEY_V127_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v127VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V127_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v127CastBitrate2: Int
        get() = prefs.getInt(KEY_V127_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v127GestureTapZone2: Int
        get() = prefs.getInt(KEY_V127_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v127CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V127_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V127_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v127ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V127_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V127_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v127PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V127_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V127_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v127DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V127_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v127ColorTint2: Int
        get() = prefs.getInt(KEY_V127_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v127VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V127_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v127CastCodec2: Int
        get() = prefs.getInt(KEY_V127_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v127GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V127_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V127_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v127CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V127_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V127_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v128.x =====

var AppPrefs.v128PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V128_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V128_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v128DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V128_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v128ColorFade2: Int
        get() = prefs.getInt(KEY_V128_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v128VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V128_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v128CastBitrate2: Int
        get() = prefs.getInt(KEY_V128_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v128GestureTapZone2: Int
        get() = prefs.getInt(KEY_V128_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v128CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V128_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V128_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v128ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V128_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V128_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v128PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V128_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V128_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v128DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V128_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v128ColorTint2: Int
        get() = prefs.getInt(KEY_V128_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v128VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V128_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v128CastCodec2: Int
        get() = prefs.getInt(KEY_V128_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v128GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V128_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V128_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v128CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V128_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V128_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v129.x =====

var AppPrefs.v129PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V129_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V129_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v129DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V129_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v129ColorFade2: Int
        get() = prefs.getInt(KEY_V129_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v129VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V129_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v129CastBitrate2: Int
        get() = prefs.getInt(KEY_V129_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v129GestureTapZone2: Int
        get() = prefs.getInt(KEY_V129_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v129CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V129_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V129_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v129ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V129_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V129_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v129PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V129_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V129_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v129DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V129_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v129ColorTint2: Int
        get() = prefs.getInt(KEY_V129_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v129VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V129_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v129CastCodec2: Int
        get() = prefs.getInt(KEY_V129_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v129GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V129_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V129_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v129CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V129_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V129_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v130.x =====

var AppPrefs.v130PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V130_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V130_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v130DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V130_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v130ColorFade2: Int
        get() = prefs.getInt(KEY_V130_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v130VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V130_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v130CastBitrate2: Int
        get() = prefs.getInt(KEY_V130_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v130GestureTapZone2: Int
        get() = prefs.getInt(KEY_V130_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v130CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V130_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V130_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v130ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V130_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V130_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v130PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V130_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V130_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v130DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V130_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v130ColorTint2: Int
        get() = prefs.getInt(KEY_V130_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v130VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V130_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v130CastCodec2: Int
        get() = prefs.getInt(KEY_V130_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v130GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V130_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V130_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v130CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V130_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V130_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v131.x =====

var AppPrefs.v131PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V131_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V131_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v131DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V131_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v131ColorFade2: Int
        get() = prefs.getInt(KEY_V131_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v131VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V131_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v131CastBitrate2: Int
        get() = prefs.getInt(KEY_V131_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v131GestureTapZone2: Int
        get() = prefs.getInt(KEY_V131_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v131CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V131_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V131_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v131ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V131_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V131_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v131PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V131_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V131_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v131DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V131_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v131ColorTint2: Int
        get() = prefs.getInt(KEY_V131_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v131VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V131_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v131CastCodec2: Int
        get() = prefs.getInt(KEY_V131_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v131GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V131_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V131_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v131CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V131_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V131_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v132.x =====

var AppPrefs.v132PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V132_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V132_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v132DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V132_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v132ColorFade2: Int
        get() = prefs.getInt(KEY_V132_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v132VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V132_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v132CastBitrate2: Int
        get() = prefs.getInt(KEY_V132_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v132GestureTapZone2: Int
        get() = prefs.getInt(KEY_V132_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v132CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V132_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V132_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v132ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V132_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V132_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v132PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V132_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V132_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v132DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V132_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v132ColorTint2: Int
        get() = prefs.getInt(KEY_V132_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v132VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V132_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v132CastCodec2: Int
        get() = prefs.getInt(KEY_V132_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v132GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V132_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V132_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v132CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V132_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V132_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v133.x =====

var AppPrefs.v133PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V133_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V133_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v133DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V133_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v133ColorFade2: Int
        get() = prefs.getInt(KEY_V133_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v133VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V133_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v133CastBitrate2: Int
        get() = prefs.getInt(KEY_V133_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v133GestureTapZone2: Int
        get() = prefs.getInt(KEY_V133_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v133CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V133_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V133_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v133ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V133_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V133_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v133PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V133_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V133_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v133DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V133_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v133ColorTint2: Int
        get() = prefs.getInt(KEY_V133_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v133VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V133_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v133CastCodec2: Int
        get() = prefs.getInt(KEY_V133_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v133GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V133_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V133_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v133CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V133_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V133_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v134.x =====

var AppPrefs.v134PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V134_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V134_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v134DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V134_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v134ColorFade2: Int
        get() = prefs.getInt(KEY_V134_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v134VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V134_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v134CastBitrate2: Int
        get() = prefs.getInt(KEY_V134_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v134GestureTapZone2: Int
        get() = prefs.getInt(KEY_V134_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v134CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V134_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V134_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v134ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V134_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V134_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v134PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V134_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V134_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v134DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V134_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v134ColorTint2: Int
        get() = prefs.getInt(KEY_V134_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v134VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V134_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v134CastCodec2: Int
        get() = prefs.getInt(KEY_V134_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v134GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V134_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V134_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v134CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V134_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V134_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v135.x =====

var AppPrefs.v135PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V135_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V135_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v135DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V135_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v135ColorFade2: Int
        get() = prefs.getInt(KEY_V135_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v135VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V135_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v135CastBitrate2: Int
        get() = prefs.getInt(KEY_V135_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v135GestureTapZone2: Int
        get() = prefs.getInt(KEY_V135_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v135CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V135_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V135_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v135ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V135_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V135_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v135PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V135_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V135_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v135DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V135_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v135ColorTint2: Int
        get() = prefs.getInt(KEY_V135_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v135VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V135_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v135CastCodec2: Int
        get() = prefs.getInt(KEY_V135_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v135GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V135_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V135_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v135CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V135_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V135_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v136.x =====

var AppPrefs.v136PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V136_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V136_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v136DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V136_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v136ColorFade2: Int
        get() = prefs.getInt(KEY_V136_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v136VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V136_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v136CastBitrate2: Int
        get() = prefs.getInt(KEY_V136_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v136GestureTapZone2: Int
        get() = prefs.getInt(KEY_V136_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v136CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V136_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V136_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v136ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V136_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V136_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v136PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V136_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V136_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v136DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V136_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v136ColorTint2: Int
        get() = prefs.getInt(KEY_V136_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v136VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V136_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v136CastCodec2: Int
        get() = prefs.getInt(KEY_V136_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v136GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V136_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V136_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v136CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V136_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V136_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v137.x =====

var AppPrefs.v137PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V137_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V137_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v137DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V137_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v137ColorFade2: Int
        get() = prefs.getInt(KEY_V137_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v137VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V137_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v137CastBitrate2: Int
        get() = prefs.getInt(KEY_V137_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v137GestureTapZone2: Int
        get() = prefs.getInt(KEY_V137_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v137CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V137_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V137_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v137ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V137_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V137_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v137PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V137_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V137_PLAYBACK_AUTO_PAUSE2, value).apply()

var AppPrefs.v137DanmakuScrollSpeed2: Int
        get() = prefs.getInt(KEY_V137_DANMAKU_SCROLL_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_DANMAKU_SCROLL_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v137ColorTint2: Int
        get() = prefs.getInt(KEY_V137_COLOR_TINT2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_COLOR_TINT2, value.coerceIn(0, 100)).apply()

var AppPrefs.v137VolumeFadeOut2: Int
        get() = prefs.getInt(KEY_V137_VOLUME_FADE_OUT2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_VOLUME_FADE_OUT2, value.coerceIn(0, 5)).apply()

var AppPrefs.v137CastCodec2: Int
        get() = prefs.getInt(KEY_V137_CAST_CODEC2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_CAST_CODEC2, value.coerceIn(0, 3)).apply()

var AppPrefs.v137GestureDoubleSwipe2: Boolean
        get() = prefs.getBoolean(KEY_V137_GESTURE_DOUBLE_SWIPE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V137_GESTURE_DOUBLE_SWIPE2, value).apply()

var AppPrefs.v137CacheMemorySize2: Int
        get() = prefs.getInt(KEY_V137_CACHE_MEMORY_SIZE2, 0)
        set(value) = prefs.edit().putInt(KEY_V137_CACHE_MEMORY_SIZE2, value.coerceIn(0, 10)).apply()

    // ===== v138.x =====

var AppPrefs.v138PlaybackSkipIntro2: Boolean
        get() = prefs.getBoolean(KEY_V138_PLAYBACK_SKIP_INTRO2, false)
        set(value) = prefs.edit().putBoolean(KEY_V138_PLAYBACK_SKIP_INTRO2, value).apply()

var AppPrefs.v138DanmakuSpeed2: Int
        get() = prefs.getInt(KEY_V138_DANMAKU_SPEED2, 0)
        set(value) = prefs.edit().putInt(KEY_V138_DANMAKU_SPEED2, value.coerceIn(0, 10)).apply()

var AppPrefs.v138ColorFade2: Int
        get() = prefs.getInt(KEY_V138_COLOR_FADE2, 0)
        set(value) = prefs.edit().putInt(KEY_V138_COLOR_FADE2, value.coerceIn(0, 100)).apply()

var AppPrefs.v138VolumeFadeIn2: Int
        get() = prefs.getInt(KEY_V138_VOLUME_FADE_IN2, 0)
        set(value) = prefs.edit().putInt(KEY_V138_VOLUME_FADE_IN2, value.coerceIn(0, 5)).apply()

var AppPrefs.v138CastBitrate2: Int
        get() = prefs.getInt(KEY_V138_CAST_BITRATE2, 0)
        set(value) = prefs.edit().putInt(KEY_V138_CAST_BITRATE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v138GestureTapZone2: Int
        get() = prefs.getInt(KEY_V138_GESTURE_TAP_ZONE2, 0)
        set(value) = prefs.edit().putInt(KEY_V138_GESTURE_TAP_ZONE2, value.coerceIn(0, 5)).apply()

var AppPrefs.v138CacheCompLevel3: Int
        get() = prefs.getInt(KEY_V138_CACHE_COMP_LEVEL3, 0)
        set(value) = prefs.edit().putInt(KEY_V138_CACHE_COMP_LEVEL3, value.coerceIn(0, 5)).apply()

var AppPrefs.v138ProgressBarFade2: Boolean
        get() = prefs.getBoolean(KEY_V138_PROGRESS_BAR_FADE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V138_PROGRESS_BAR_FADE2, value).apply()

var AppPrefs.v138PlaybackAutoPause2: Boolean
        get() = prefs.getBoolean(KEY_V138_PLAYBACK_AUTO_PAUSE2, false)
        set(value) = prefs.edit().putBoolean(KEY_V138_PLAYBACK_AUTO_PAUSE2, value).apply()

