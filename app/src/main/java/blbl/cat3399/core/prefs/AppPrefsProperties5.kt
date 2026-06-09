package blbl.cat3399.core.prefs

// Auto-generated extension properties for AppPrefs

var AppPrefs.v35VideoHighlightRecovery: Boolean
        get() = prefs.getBoolean(KEY_V35_VIDEOHIGHLIGHTRECOVERY, false)
        set(v) = prefs.edit().putBoolean(KEY_V35_VIDEOHIGHLIGHTRECOVERY, v).apply()

    // v35b.6: Danmaku Persist Across Episodes

var AppPrefs.v35DanmakuPersistAcrossEp: Boolean
        get() = prefs.getBoolean(KEY_V35_DANMAKUPERSISTACROSSEP, false)
        set(v) = prefs.edit().putBoolean(KEY_V35_DANMAKUPERSISTACROSSEP, v).apply()

    // v35b.7: Cast Subtitle Enabled

var AppPrefs.v35CastSubtitleEnabled: Boolean
        get() = prefs.getBoolean(KEY_V35_CASTSUBTITLEENABLED, true)
        set(v) = prefs.edit().putBoolean(KEY_V35_CASTSUBTITLEENABLED, v).apply()

    // v35b.8: Subtitle Shadow Offset

var AppPrefs.v35SubtitleShadowOffset: Int
        get() = prefs.getInt(KEY_V35_SUBTITLESHADOWOFFSET, 1)
        set(v) = prefs.edit().putInt(KEY_V35_SUBTITLESHADOWOFFSET, v).apply()

    // v35b.9: Video Color Gradient

var AppPrefs.v35VideoColorGradient: Int
        get() = prefs.getInt(KEY_V35_VIDEOCOLORGRADIENT, 0)
        set(v) = prefs.edit().putInt(KEY_V35_VIDEOCOLORGRADIENT, v).apply()

    // v35b.10: Danmaku Scroll Direction

var AppPrefs.v35DanmakuScrollDirection: Int
        get() = prefs.getInt(KEY_V35_DANMAKUSCROLLDIRECTION, 0)
        set(v) = prefs.edit().putInt(KEY_V35_DANMAKUSCROLLDIRECTION, v).apply()

    // v35b.11: Playlist Auto Play Next

var AppPrefs.v35PlaylistAutoPlayNext: Boolean
        get() = prefs.getBoolean(KEY_V35_PLAYLISTAUTOPLAYNEXT, true)
        set(v) = prefs.edit().putBoolean(KEY_V35_PLAYLISTAUTOPLAYNEXT, v).apply()

    // v35b.12: Gesture Brightness Sensitivity

var AppPrefs.v35GestureBrightnessSensitivity: Int
        get() = prefs.getInt(KEY_V35_GESTUREBRIGHTNESSSENSITIVITY, 50)
        set(v) = prefs.edit().putInt(KEY_V35_GESTUREBRIGHTNESSSENSITIVITY, v).apply()

    // v35b.13: Video Black Level Adj

var AppPrefs.v35VideoBlackLevelAdj: Int
        get() = prefs.getInt(KEY_V35_VIDEOBLACKLEVELADJ, 0)
        set(v) = prefs.edit().putInt(KEY_V35_VIDEOBLACKLEVELADJ, v).apply()

    // v35b.14: Danmaku Border Color

var AppPrefs.v35DanmakuBorderColor: Int
        get() = prefs.getInt(KEY_V35_DANMAKUBORDERCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V35_DANMAKUBORDERCOLOR, v).apply()

    // v35b.15: Cast Audio Delay (ms)

var AppPrefs.v35CastAudioDelay: Int
        get() = prefs.getInt(KEY_V35_CASTAUDIODELAY, 0)
        set(v) = prefs.edit().putInt(KEY_V35_CASTAUDIODELAY, v).apply()

    // === v36b.x ===
    // v36b.1: Video White Balance (K)

var AppPrefs.v36VideoWhiteBalance: Int
        get() = prefs.getInt(KEY_V36_VIDEOWHITEBALANCE, 6500)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOWHITEBALANCE, v).apply()

    // v36b.2: Danmaku Font Stretch

var AppPrefs.v36DanmakuFontStretch: Int
        get() = prefs.getInt(KEY_V36_DANMAKUFONTSTRETCH, 100)
        set(v) = prefs.edit().putInt(KEY_V36_DANMAKUFONTSTRETCH, v).apply()

    // v36b.3: Subtitle Encoding

var AppPrefs.v36SubtitleEncoding: Int
        get() = prefs.getInt(KEY_V36_SUBTITLEENCODING, 0)
        set(v) = prefs.edit().putInt(KEY_V36_SUBTITLEENCODING, v).apply()

    // v36b.4: Gesture Seek Step (s)

var AppPrefs.v36GestureSeekStep: Int
        get() = prefs.getInt(KEY_V36_GESTURESEEKSTEP, 5)
        set(v) = prefs.edit().putInt(KEY_V36_GESTURESEEKSTEP, v).apply()

    // v36b.5: Video Color Tint

var AppPrefs.v36VideoColorTint: Int
        get() = prefs.getInt(KEY_V36_VIDEOCOLORTINT, 0)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOCOLORTINT, v).apply()

    // v36b.6: Danmaku Fade In

var AppPrefs.v36DanmakuFadeIn: Boolean
        get() = prefs.getBoolean(KEY_V36_DANMAKUFADEIN, false)
        set(v) = prefs.edit().putBoolean(KEY_V36_DANMAKUFADEIN, v).apply()

    // v36b.7: Cast Screen Mirror

var AppPrefs.v36CastScreenMirror: Boolean
        get() = prefs.getBoolean(KEY_V36_CASTSCREENMIRROR, false)
        set(v) = prefs.edit().putBoolean(KEY_V36_CASTSCREENMIRROR, v).apply()

    // v36b.8: Subtitle Line Spacing

var AppPrefs.v36SubtitleLineSpacing: Int
        get() = prefs.getInt(KEY_V36_SUBTITLELINESPACING, 120)
        set(v) = prefs.edit().putInt(KEY_V36_SUBTITLELINESPACING, v).apply()

    // v36b.9: Video Gamma Tone Map

var AppPrefs.v36VideoGammaToneMap: Int
        get() = prefs.getInt(KEY_V36_VIDEOGAMMATONEMAP, 0)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOGAMMATONEMAP, v).apply()

    // v36b.10: Danmaku History Depth

var AppPrefs.v36DanmakuHistoryDepth: Int
        get() = prefs.getInt(KEY_V36_DANMAKUHISTORYDEPTH, 0)
        set(v) = prefs.edit().putInt(KEY_V36_DANMAKUHISTORYDEPTH, v).apply()

    // v36b.11: Playlist Resume Last

var AppPrefs.v36PlaylistResumeLast: Boolean
        get() = prefs.getBoolean(KEY_V36_PLAYLISTRESUMELAST, true)
        set(v) = prefs.edit().putBoolean(KEY_V36_PLAYLISTRESUMELAST, v).apply()

    // v36b.12: Gesture Double Swipe

var AppPrefs.v36GestureDoubleSwipeAction: Int
        get() = prefs.getInt(KEY_V36_GESTUREDOUBLESWIPEACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V36_GESTUREDOUBLESWIPEACTION, v).apply()

    // v36b.13: Video Contrast Ratio

var AppPrefs.v36VideoContrastRatio: Int
        get() = prefs.getInt(KEY_V36_VIDEOCONTRASTRATIO, 100)
        set(v) = prefs.edit().putInt(KEY_V36_VIDEOCONTRASTRATIO, v).apply()

    // v36b.14: Danmaku Speed Multiplier

var AppPrefs.v36DanmakuSpeedMultiplier: Int
        get() = prefs.getInt(KEY_V36_DANMAKUSPEEDMULTIPLIER, 100)
        set(v) = prefs.edit().putInt(KEY_V36_DANMAKUSPEEDMULTIPLIER, v).apply()

    // v36b.15: Cast Auto Quality

var AppPrefs.v36CastAutoQuality: Boolean
        get() = prefs.getBoolean(KEY_V36_CASTAUTOQUALITY, true)
        set(v) = prefs.edit().putBoolean(KEY_V36_CASTAUTOQUALITY, v).apply()

    // === v37b.x ===
    // v37b.1: Video Dynamic Range

var AppPrefs.v37VideoDynamicRange: Int
        get() = prefs.getInt(KEY_V37_VIDEODYNAMICRANGE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEODYNAMICRANGE, v).apply()

    // v37b.2: Danmaku Blend Mode

var AppPrefs.v37DanmakuBlendMode: Int
        get() = prefs.getInt(KEY_V37_DANMAKUBLENDMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_DANMAKUBLENDMODE, v).apply()

    // v37b.3: Subtitle Karaoke Mode

var AppPrefs.v37SubtitleKaraokeMode: Boolean
        get() = prefs.getBoolean(KEY_V37_SUBTITLEKARAOKEMODE, false)
        set(v) = prefs.edit().putBoolean(KEY_V37_SUBTITLEKARAOKEMODE, v).apply()

    // v37b.4: Gesture Rotate Action

var AppPrefs.v37GestureRotateAction: Int
        get() = prefs.getInt(KEY_V37_GESTUREROTATEACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V37_GESTUREROTATEACTION, v).apply()

    // v37b.5: Video Color Depth

var AppPrefs.v37VideoColorDepth: Int
        get() = prefs.getInt(KEY_V37_VIDEOCOLORDEPTH, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEOCOLORDEPTH, v).apply()

    // v37b.6: Danmaku Preview Mode

var AppPrefs.v37DanmakuPreviewMode: Boolean
        get() = prefs.getBoolean(KEY_V37_DANMAKUPREVIEWMODE, false)
        set(v) = prefs.edit().putBoolean(KEY_V37_DANMAKUPREVIEWMODE, v).apply()

    // v37b.7: Cast Audio Channel

var AppPrefs.v37CastAudioChannel: Int
        get() = prefs.getInt(KEY_V37_CASTAUDIOCHANNEL, 0)
        set(v) = prefs.edit().putInt(KEY_V37_CASTAUDIOCHANNEL, v).apply()

    // v37b.8: Subtitle Font Size Auto

var AppPrefs.v37SubtitleFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V37_SUBTITLEFONTSIZEAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V37_SUBTITLEFONTSIZEAUTO, v).apply()

    // v37b.9: Video Edge Enhancement

var AppPrefs.v37VideoEdgeEnhance: Int
        get() = prefs.getInt(KEY_V37_VIDEOEDGEENHANCE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEOEDGEENHANCE, v).apply()

    // v37b.10: Danmaku Send Font

var AppPrefs.v37DanmakuSendFont: Int
        get() = prefs.getInt(KEY_V37_DANMAKUSENDFONT, 0)
        set(v) = prefs.edit().putInt(KEY_V37_DANMAKUSENDFONT, v).apply()

    // v37b.11: Playlist Repeat Mode

var AppPrefs.v37PlaylistRepeatMode: Int
        get() = prefs.getInt(KEY_V37_PLAYLISTREPEATMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_PLAYLISTREPEATMODE, v).apply()

    // v37b.12: Gesture Triple Tap

var AppPrefs.v37GestureTripleTapAction: Int
        get() = prefs.getInt(KEY_V37_GESTURETRIPLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V37_GESTURETRIPLETAPACTION, v).apply()

    // v37b.13: Video Color Curve

var AppPrefs.v37VideoColorCurve: Int
        get() = prefs.getInt(KEY_V37_VIDEOCOLORCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V37_VIDEOCOLORCURVE, v).apply()

    // v37b.14: Danmaku Shadow Color Custom

var AppPrefs.v37DanmakuShadowColorCustom: Int
        get() = prefs.getInt(KEY_V37_DANMAKUSHADOWCOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V37_DANMAKUSHADOWCOLORCUSTOM, v).apply()

    // v37b.15: Cast Keep Alive

var AppPrefs.v37CastKeepAlive: Boolean
        get() = prefs.getBoolean(KEY_V37_CASTKEEPALIVE, true)
        set(v) = prefs.edit().putBoolean(KEY_V37_CASTKEEPALIVE, v).apply()

    // === v38b.x ===
    // v38b.1: Video Chroma Upsampling

var AppPrefs.v38VideoChromaUpsampling: Int
        get() = prefs.getInt(KEY_V38_VIDEOCHROMAUPSAMPLING, 0)
        set(v) = prefs.edit().putInt(KEY_V38_VIDEOCHROMAUPSAMPLING, v).apply()

    // v38b.2: Danmaku Preset Slots

var AppPrefs.v38DanmakuPresetSlots: Int
        get() = prefs.getInt(KEY_V38_DANMAKUPRESETSLOTS, 3)
        set(v) = prefs.edit().putInt(KEY_V38_DANMAKUPRESETSLOTS, v).apply()

    // v38b.3: Subtitle BG Blur

var AppPrefs.v38SubtitleBgBlur: Int
        get() = prefs.getInt(KEY_V38_SUBTITLEBGBLUR, 0)
        set(v) = prefs.edit().putInt(KEY_V38_SUBTITLEBGBLUR, v).apply()

    // v38b.4: Gesture Edge Zone Width

var AppPrefs.v38GestureEdgeZoneWidth: Int
        get() = prefs.getInt(KEY_V38_GESTUREEDGEZONEWIDTH, 10)
        set(v) = prefs.edit().putInt(KEY_V38_GESTUREEDGEZONEWIDTH, v).apply()

    // v38b.5: Video Deinterlace

var AppPrefs.v38VideoDeinterlace: Boolean
        get() = prefs.getBoolean(KEY_V38_VIDEODEINTERLACE, true)
        set(v) = prefs.edit().putBoolean(KEY_V38_VIDEODEINTERLACE, v).apply()

    // v38b.6: Danmaku Keyboard Send

var AppPrefs.v38DanmakuKeyboardSend: Boolean
        get() = prefs.getBoolean(KEY_V38_DANMAKUKEYBOARDSEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_DANMAKUKEYBOARDSEND, v).apply()

    // v38b.7: Cast Video HDR

var AppPrefs.v38CastVideoHDR: Boolean
        get() = prefs.getBoolean(KEY_V38_CASTVIDEOHDR, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_CASTVIDEOHDR, v).apply()

    // v38b.8: Subtitle Font Outline

var AppPrefs.v38SubtitleFontOutline: Boolean
        get() = prefs.getBoolean(KEY_V38_SUBTITLEFONTOUTLINE, true)
        set(v) = prefs.edit().putBoolean(KEY_V38_SUBTITLEFONTOUTLINE, v).apply()

    // v38b.9: Video Banding Fix

var AppPrefs.v38VideoBandingFix: Boolean
        get() = prefs.getBoolean(KEY_V38_VIDEOBANDINGFIX, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_VIDEOBANDINGFIX, v).apply()

    // v38b.10: Danmaku Lane Count

var AppPrefs.v38DanmakuLaneCount: Int
        get() = prefs.getInt(KEY_V38_DANMAKULANECOUNT, 0)
        set(v) = prefs.edit().putInt(KEY_V38_DANMAKULANECOUNT, v).apply()

    // v38b.11: Playlist Smart Sort

var AppPrefs.v38PlaylistSmartSort: Boolean
        get() = prefs.getBoolean(KEY_V38_PLAYLISTSMARTSORT, false)
        set(v) = prefs.edit().putBoolean(KEY_V38_PLAYLISTSMARTSORT, v).apply()

    // v38b.12: Gesture Dead Zone

var AppPrefs.v38GestureDeadZone: Int
        get() = prefs.getInt(KEY_V38_GESTUREDEADZONE, 20)
        set(v) = prefs.edit().putInt(KEY_V38_GESTUREDEADZONE, v).apply()

    // v38b.13: Video Overscan Crop

var AppPrefs.v38VideoOverscan: Int
        get() = prefs.getInt(KEY_V38_VIDEOOVERSCAN, 0)
        set(v) = prefs.edit().putInt(KEY_V38_VIDEOOVERSCAN, v).apply()

    // v38b.14: Danmaku Merge Threshold

var AppPrefs.v38DanmakuMergeThreshold: Int
        get() = prefs.getInt(KEY_V38_DANMAKUMERGETHRESHOLD, 80)
        set(v) = prefs.edit().putInt(KEY_V38_DANMAKUMERGETHRESHOLD, v).apply()

    // v38b.15: Cast Volume Control

var AppPrefs.v38CastVolumeControl: Boolean
        get() = prefs.getBoolean(KEY_V38_CASTVOLUMECONTROL, true)
        set(v) = prefs.edit().putBoolean(KEY_V38_CASTVOLUMECONTROL, v).apply()

    // === v39b.x ===
    // v39b.1: Video Temporal Denoise

var AppPrefs.v39VideoTemporalDenoise: Int
        get() = prefs.getInt(KEY_V39_VIDEOTEMPORALDENOISE, 0)
        set(v) = prefs.edit().putInt(KEY_V39_VIDEOTEMPORALDENOISE, v).apply()

    // v39b.2: Danmaku Font Family

var AppPrefs.v39DanmakuFontFamily: Int
        get() = prefs.getInt(KEY_V39_DANMAKUFONTFAMILY, 0)
        set(v) = prefs.edit().putInt(KEY_V39_DANMAKUFONTFAMILY, v).apply()

    // v39b.3: Subtitle BG Color

var AppPrefs.v39SubtitleBgColor: Int
        get() = prefs.getInt(KEY_V39_SUBTITLEBGCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V39_SUBTITLEBGCOLOR, v).apply()

    // v39b.4: Gesture Scroll Action

var AppPrefs.v39GestureScrollAction: Int
        get() = prefs.getInt(KEY_V39_GESTURESCROLLACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V39_GESTURESCROLLACTION, v).apply()

    // v39b.5: Video Adaptive Sharpen

var AppPrefs.v39VideoAdaptiveSharpen: Boolean
        get() = prefs.getBoolean(KEY_V39_VIDEOADAPTIVESHARPEN, false)
        set(v) = prefs.edit().putBoolean(KEY_V39_VIDEOADAPTIVESHARPEN, v).apply()

    // v39b.6: Danmaku Send Privilege

var AppPrefs.v39DanmakuSendPrivilege: Boolean
        get() = prefs.getBoolean(KEY_V39_DANMAKUSENDPRIVILEGE, false)
        set(v) = prefs.edit().putBoolean(KEY_V39_DANMAKUSENDPRIVILEGE, v).apply()

    // v39b.7: Cast Subtitle Track

var AppPrefs.v39CastSubtitles: Int
        get() = prefs.getInt(KEY_V39_CASTSUBTITLES, 0)
        set(v) = prefs.edit().putInt(KEY_V39_CASTSUBTITLES, v).apply()

    // v39b.8: Subtitle BG Padding

var AppPrefs.v39SubtitleBgPadding: Int
        get() = prefs.getInt(KEY_V39_SUBTITLEBGPADDING, 4)
        set(v) = prefs.edit().putInt(KEY_V39_SUBTITLEBGPADDING, v).apply()

    // v39b.9: Video Color Temp Fine

var AppPrefs.v39VideoColorTemperatureFine: Int
        get() = prefs.getInt(KEY_V39_VIDEOCOLORTEMPERATUREFINE, 50)
        set(v) = prefs.edit().putInt(KEY_V39_VIDEOCOLORTEMPERATUREFINE, v).apply()

    // v39b.10: Danmaku Max Per Screen

var AppPrefs.v39DanmakuMaxPerScreen: Int
        get() = prefs.getInt(KEY_V39_DANMAKUMAXPERSCREEN, 3)
        set(v) = prefs.edit().putInt(KEY_V39_DANMAKUMAXPERSCREEN, v).apply()

    // v39b.11: Playlist Load Related

var AppPrefs.v39PlaylistLoadRelated: Boolean
        get() = prefs.getBoolean(KEY_V39_PLAYLISTLOADRELATED, true)
        set(v) = prefs.edit().putBoolean(KEY_V39_PLAYLISTLOADRELATED, v).apply()

    // v39b.12: Video Smoothing Level

var AppPrefs.v39VideoSmoothingLevel: Int
        get() = prefs.getInt(KEY_V39_VIDEOSMOOTHINGLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V39_VIDEOSMOOTHINGLEVEL, v).apply()

    // v39b.13: Danmaku Sender Level Icon

var AppPrefs.v39DanmakuSenderLevelIcon: Boolean
        get() = prefs.getBoolean(KEY_V39_DANMAKUSENDERLEVELICON, true)
        set(v) = prefs.edit().putBoolean(KEY_V39_DANMAKUSENDERLEVELICON, v).apply()

    // v39b.14: Subtitle Auto Translate

var AppPrefs.v39SubtitleAutoTranslate: Boolean
        get() = prefs.getBoolean(KEY_V39_SUBTITLEAUTOTRANSLATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V39_SUBTITLEAUTOTRANSLATE, v).apply()

    // v39b.15: Cast Audio Quality

var AppPrefs.v39CastAudioQuality: Int
        get() = prefs.getInt(KEY_V39_CASTAUDIOQUALITY, 0)
        set(v) = prefs.edit().putInt(KEY_V39_CASTAUDIOQUALITY, v).apply()

    // === v40b.x ===
    // v40b.1: Video Spatial Denoise

var AppPrefs.v40VideoSpatialDenoise: Int
        get() = prefs.getInt(KEY_V40_VIDEOSPATIALDENOISE, 0)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEOSPATIALDENOISE, v).apply()

    // v40b.2: Danmaku Preview Size

var AppPrefs.v40DanmakuPreviewSize: Int
        get() = prefs.getInt(KEY_V40_DANMAKUPREVIEWSIZE, 14)
        set(v) = prefs.edit().putInt(KEY_V40_DANMAKUPREVIEWSIZE, v).apply()

    // v40b.3: Subtitle Stroke Color Custom

var AppPrefs.v40SubtitleStrokeColor: Boolean
        get() = prefs.getBoolean(KEY_V40_SUBTITLESTROKECOLOR, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_SUBTITLESTROKECOLOR, v).apply()

    // v40b.4: Gesture Invert Scroll

var AppPrefs.v40GestureInvertScroll: Boolean
        get() = prefs.getBoolean(KEY_V40_GESTUREINVERTSCROLL, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_GESTUREINVERTSCROLL, v).apply()

    // v40b.5: Video Motion Blur

var AppPrefs.v40VideoMotionBlur: Int
        get() = prefs.getInt(KEY_V40_VIDEOMOTIONBLUR, 0)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEOMOTIONBLUR, v).apply()

    // v40b.6: Danmaku Report Button

var AppPrefs.v40DanmakuReportEnabled: Boolean
        get() = prefs.getBoolean(KEY_V40_DANMAKUREPORTENABLED, true)
        set(v) = prefs.edit().putBoolean(KEY_V40_DANMAKUREPORTENABLED, v).apply()

    // v40b.7: Cast Auto Pause

var AppPrefs.v40CastAutoPause: Boolean
        get() = prefs.getBoolean(KEY_V40_CASTAUTOPAUSE, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_CASTAUTOPAUSE, v).apply()

    // v40b.8: Subtitle Stroke Width

var AppPrefs.v40SubtitleStrokeWidth: Int
        get() = prefs.getInt(KEY_V40_SUBTITLESTROKEWIDTH, 1)
        set(v) = prefs.edit().putInt(KEY_V40_SUBTITLESTROKEWIDTH, v).apply()

    // v40b.9: Video Detail Enhancement

var AppPrefs.v40VideoDetailEnhance: Int
        get() = prefs.getInt(KEY_V40_VIDEODETAILENHANCE, 0)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEODETAILENHANCE, v).apply()

    // v40b.10: Danmaku Block Level

var AppPrefs.v40DanmakuBlockLevel: Int
        get() = prefs.getInt(KEY_V40_DANMAKUBLOCKLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V40_DANMAKUBLOCKLEVEL, v).apply()

    // v40b.11: Playlist Next Episode

var AppPrefs.v40PlaylistNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V40_PLAYLISTNEXTEPISODE, true)
        set(v) = prefs.edit().putBoolean(KEY_V40_PLAYLISTNEXTEPISODE, v).apply()

    // v40b.12: Gesture Custom Mapping

var AppPrefs.v40GestureCustomMapping: Boolean
        get() = prefs.getBoolean(KEY_V40_GESTURECUSTOMMAPPING, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_GESTURECUSTOMMAPPING, v).apply()

    // v40b.13: Video Color Boost

var AppPrefs.v40VideoColorBoost: Int
        get() = prefs.getInt(KEY_V40_VIDEOCOLORBOOST, 100)
        set(v) = prefs.edit().putInt(KEY_V40_VIDEOCOLORBOOST, v).apply()

    // v40b.14: Danmaku Font Size Override

var AppPrefs.v40DanmakuFontSizeOverride: Int
        get() = prefs.getInt(KEY_V40_DANMAKUFONTSIZEOVERRIDE, 0)
        set(v) = prefs.edit().putInt(KEY_V40_DANMAKUFONTSIZEOVERRIDE, v).apply()

    // v40b.15: Cast Audio Normalization

var AppPrefs.v40CastAudioNormalization: Boolean
        get() = prefs.getBoolean(KEY_V40_CASTAUDIONORMALIZATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V40_CASTAUDIONORMALIZATION, v).apply()


    // ==================== v51-v60 New Unique Features ====================

    // === v51.x ===
    // v51.1: Playback Auto Next Episode

var AppPrefs.v51PlaybackAutoNextEpisode: Boolean
        get() = prefs.getBoolean(KEY_V51_PLAYBACKAUTONEXTEPISODE, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_PLAYBACKAUTONEXTEPISODE, v).apply()

    // v51.2: Danmaku Font Shadow Size

var AppPrefs.v51DanmakuFontShadowSize: Int
        get() = prefs.getInt(KEY_V51_DANMAKUFONTSHADOWSIZE, 0)
        set(v) = prefs.edit().putInt(KEY_V51_DANMAKUFONTSHADOWSIZE, v).apply()

    // v51.3: Color Midtone Adjust

var AppPrefs.v51ColorMidtoneAdjust: Int
        get() = prefs.getInt(KEY_V51_COLORMIDTONEADJUST, 0)
        set(v) = prefs.edit().putInt(KEY_V51_COLORMIDTONEADJUST, v).apply()

    // v51.4: Gesture Custom Action 3

var AppPrefs.v51GestureCustomAction3: Int
        get() = prefs.getInt(KEY_V51_GESTURECUSTOMACTION3, 0)
        set(v) = prefs.edit().putInt(KEY_V51_GESTURECUSTOMACTION3, v).apply()

    // v51.5: Subtitle Font Italic

var AppPrefs.v51SubtitleFontItalic: Boolean
        get() = prefs.getBoolean(KEY_V51_SUBTITLEFONTITALIC, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_SUBTITLEFONTITALIC, v).apply()

    // v51.6: Video Adaptive Contrast Enhanced

var AppPrefs.v51VideoAdaptiveContrastEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V51_VIDEOADAPTIVECONTRASTENHANCED, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_VIDEOADAPTIVECONTRASTENHANCED, v).apply()

    // v51.7: Danmaku Filter Muted Users

var AppPrefs.v51DanmakuFilterMutedUsers: Boolean
        get() = prefs.getBoolean(KEY_V51_DANMAKUFILTERMUTEDUSERS, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_DANMAKUFILTERMUTEDUSERS, v).apply()

    // v51.8: Cast Video Upscale Mode

var AppPrefs.v51CastVideoUpscaleMode: Int
        get() = prefs.getInt(KEY_V51_CASTVIDEOUPSCALEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V51_CASTVIDEOUPSCALEMODE, v).apply()

    // v51.9: Playlist Auto Continue

var AppPrefs.v51PlaylistAutoContinue: Boolean
        get() = prefs.getBoolean(KEY_V51_PLAYLISTAUTOCONTINUE, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_PLAYLISTAUTOCONTINUE, v).apply()

    // v51.10: Video Luma Adaptive

var AppPrefs.v51VideoLumaAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V51_VIDEOLUMAADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_VIDEOLUMAADAPTIVE, v).apply()

    // v51.11: Danmaku Font Spacing Custom

var AppPrefs.v51DanmakuFontSpacingCustom: Int
        get() = prefs.getInt(KEY_V51_DANMAKUFONTSPACINGCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V51_DANMAKUFONTSPACINGCUSTOM, v).apply()

    // v51.12: Subtitle Font Color Custom

var AppPrefs.v51SubtitleFontColorCustom: Int
        get() = prefs.getInt(KEY_V51_SUBTITLEFONTCOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V51_SUBTITLEFONTCOLORCUSTOM, v).apply()

    // v51.13: Gesture Long Press Action

var AppPrefs.v51GestureLongPressAction: Int
        get() = prefs.getInt(KEY_V51_GESTURELONGPRESSACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V51_GESTURELONGPRESSACTION, v).apply()

    // v51.14: Video Chroma Adaptive

var AppPrefs.v51VideoChromaAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V51_VIDEOCHROMAADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V51_VIDEOCHROMAADAPTIVE, v).apply()

    // v51.15: Cast Audio Sync

var AppPrefs.v51CastAudioSync: Boolean
        get() = prefs.getBoolean(KEY_V51_CASTAUDIOSYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V51_CASTAUDIOSYNC, v).apply()

    // === v52.x ===
    // v52.1: Video Temporal Noise Reduce

var AppPrefs.v52VideoTemporalNoiseReduce: Boolean
        get() = prefs.getBoolean(KEY_V52_VIDEOTEMPORALNOISEREDUCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_VIDEOTEMPORALNOISEREDUCE, v).apply()

    // v52.2: Danmaku BG Color Custom

var AppPrefs.v52DanmakuBgColorCustom: Int
        get() = prefs.getInt(KEY_V52_DANMAKUBGCOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V52_DANMAKUBGCOLORCUSTOM, v).apply()

    // v52.3: Subtitle Font Size Auto

var AppPrefs.v52SubtitleFontSizeAuto: Boolean
        get() = prefs.getBoolean(KEY_V52_SUBTITLEFONTSIZEAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_SUBTITLEFONTSIZEAUTO, v).apply()

    // v52.4: Gesture Swipe Feedback

var AppPrefs.v52GestureSwipeFeedback: Int
        get() = prefs.getInt(KEY_V52_GESTURESWIPEFEEDBACK, 0)
        set(v) = prefs.edit().putInt(KEY_V52_GESTURESWIPEFEEDBACK, v).apply()

    // v52.5: Video Color Highlight Recovery

var AppPrefs.v52VideoColorHighlightRecovery: Boolean
        get() = prefs.getBoolean(KEY_V52_VIDEOCOLORHIGHLIGHTRECOVERY, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_VIDEOCOLORHIGHLIGHTRECOVERY, v).apply()

    // v52.6: Danmaku Send Preview

var AppPrefs.v52DanmakuSendPreview: Boolean
        get() = prefs.getBoolean(KEY_V52_DANMAKUSENDPREVIEW, true)
        set(v) = prefs.edit().putBoolean(KEY_V52_DANMAKUSENDPREVIEW, v).apply()

    // v52.7: Cast Video Auto Quality

var AppPrefs.v52CastVideoAutoQuality: Boolean
        get() = prefs.getBoolean(KEY_V52_CASTVIDEOAUTOQUALITY, true)
        set(v) = prefs.edit().putBoolean(KEY_V52_CASTVIDEOAUTOQUALITY, v).apply()

    // v52.8: Subtitle BG Padding Custom

var AppPrefs.v52SubtitleBgPaddingCustom: Int
        get() = prefs.getInt(KEY_V52_SUBTITLEBGPADDINGCUSTOM, 2)
        set(v) = prefs.edit().putInt(KEY_V52_SUBTITLEBGPADDINGCUSTOM, v).apply()

    // v52.9: Video Frame Interpolation

var AppPrefs.v52VideoFrameInterpolation: Boolean
        get() = prefs.getBoolean(KEY_V52_VIDEOFRAMEINTERPOLATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_VIDEOFRAMEINTERPOLATION, v).apply()

    // v52.10: Danmaku Merge Algorithm

var AppPrefs.v52DanmakuMergeAlgorithm: Int
        get() = prefs.getInt(KEY_V52_DANMAKUMERGEALGORITHM, 0)
        set(v) = prefs.edit().putInt(KEY_V52_DANMAKUMERGEALGORITHM, v).apply()

    // v52.11: Playlist Shuffle Weighted

var AppPrefs.v52PlaylistShuffleWeighted: Boolean
        get() = prefs.getBoolean(KEY_V52_PLAYLISTSHUFFLEWEIGHTED, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_PLAYLISTSHUFFLEWEIGHTED, v).apply()

    // v52.12: Gesture Pinch Action

var AppPrefs.v52GesturePinchAction: Int
        get() = prefs.getInt(KEY_V52_GESTUREPINCHACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V52_GESTUREPINCHACTION, v).apply()

    // v52.13: Video Color Temperature

var AppPrefs.v52VideoColorTemperature: Int
        get() = prefs.getInt(KEY_V52_VIDEOCOLORTEMPERATURE, 0)
        set(v) = prefs.edit().putInt(KEY_V52_VIDEOCOLORTEMPERATURE, v).apply()

    // v52.14: Danmaku Font Weight Adaptive

var AppPrefs.v52DanmakuFontWeightAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V52_DANMAKUFONTWEIGHTADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V52_DANMAKUFONTWEIGHTADAPTIVE, v).apply()

    // v52.15: Cast Screen Mirror Mode

var AppPrefs.v52CastScreenMirrorMode: Int
        get() = prefs.getInt(KEY_V52_CASTSCREENMIRRORMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V52_CASTSCREENMIRRORMODE, v).apply()

    // === v53.x ===
    // v53.1: Video Spatial Noise Reduce

var AppPrefs.v53VideoSpatialNoiseReduce: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEOSPATIALNOISEREDUCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEOSPATIALNOISEREDUCE, v).apply()

    // v53.2: Danmaku Opacity Adaptive

var AppPrefs.v53DanmakuOpacityAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKUOPACITYADAPTIVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_DANMAKUOPACITYADAPTIVE, v).apply()

    // v53.3: Subtitle Sync Auto Detect

var AppPrefs.v53SubtitleSyncAutoDetect: Boolean
        get() = prefs.getBoolean(KEY_V53_SUBTITLESYNCAUTODETECT, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_SUBTITLESYNCAUTODETECT, v).apply()

    // v53.4: Gesture Triple Tap Action

var AppPrefs.v53GestureTripleTapAction: Int
        get() = prefs.getInt(KEY_V53_GESTURETRIPLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V53_GESTURETRIPLETAPACTION, v).apply()

    // v53.5: Video Color Highlight Compress

var AppPrefs.v53VideoColorHighlightCompress: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEOCOLORHIGHLIGHTCOMPRESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEOCOLORHIGHLIGHTCOMPRESS, v).apply()

    // v53.6: Danmaku Send Timer

var AppPrefs.v53DanmakuSendTimer: Boolean
        get() = prefs.getBoolean(KEY_V53_DANMAKUSENDTIMER, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_DANMAKUSENDTIMER, v).apply()

    // v53.7: Cast Video Latency Mode

var AppPrefs.v53CastVideoLatencyMode: Int
        get() = prefs.getInt(KEY_V53_CASTVIDEOLATENCYMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V53_CASTVIDEOLATENCYMODE, v).apply()

    // v53.8: Subtitle BG Radius Custom

var AppPrefs.v53SubtitleBgRadiusCustom: Int
        get() = prefs.getInt(KEY_V53_SUBTITLEBGRADIUSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V53_SUBTITLEBGRADIUSCUSTOM, v).apply()

    // v53.9: Video Detail Enhance

var AppPrefs.v53VideoDetailEnhance: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEODETAILENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEODETAILENHANCE, v).apply()

    // v53.10: Danmaku Font Size Curve

var AppPrefs.v53DanmakuFontSizeCurve: Int
        get() = prefs.getInt(KEY_V53_DANMAKUFONTSIZECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V53_DANMAKUFONTSIZECURVE, v).apply()

    // v53.11: Playlist Auto Download Quality

var AppPrefs.v53PlaylistAutoDownloadQuality: Int
        get() = prefs.getInt(KEY_V53_PLAYLISTAUTODOWNLOADQUALITY, 0)
        set(v) = prefs.edit().putInt(KEY_V53_PLAYLISTAUTODOWNLOADQUALITY, v).apply()

    // v53.12: Gesture Swipe Threshold

var AppPrefs.v53GestureSwipeThreshold: Int
        get() = prefs.getInt(KEY_V53_GESTURESWIPETHRESHOLD, 50)
        set(v) = prefs.edit().putInt(KEY_V53_GESTURESWIPETHRESHOLD, v).apply()

    // v53.13: Video Color Shadow Compress

var AppPrefs.v53VideoColorShadowCompress: Boolean
        get() = prefs.getBoolean(KEY_V53_VIDEOCOLORSHADOWCOMPRESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V53_VIDEOCOLORSHADOWCOMPRESS, v).apply()

    // v53.14: Danmaku Stroke Color Custom

var AppPrefs.v53DanmakuStrokeColorCustom: Int
        get() = prefs.getInt(KEY_V53_DANMAKUSTROKECOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V53_DANMAKUSTROKECOLORCUSTOM, v).apply()

    // v53.15: Cast Audio Fade Mode

var AppPrefs.v53CastAudioFadeMode: Int
        get() = prefs.getInt(KEY_V53_CASTAUDIOFADEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V53_CASTAUDIOFADEMODE, v).apply()

    // === v54.x ===
    // v54.1: Video Color Grading Custom

var AppPrefs.v54VideoColorGradingCustom: Boolean
        get() = prefs.getBoolean(KEY_V54_VIDEOCOLORGRADINGCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_VIDEOCOLORGRADINGCUSTOM, v).apply()

    // v54.2: Danmaku Border Weight

var AppPrefs.v54DanmakuBorderWeight: Int
        get() = prefs.getInt(KEY_V54_DANMAKUBORDERWEIGHT, 1)
        set(v) = prefs.edit().putInt(KEY_V54_DANMAKUBORDERWEIGHT, v).apply()

    // v54.3: Subtitle Font Weight

var AppPrefs.v54SubtitleFontWeight: Int
        get() = prefs.getInt(KEY_V54_SUBTITLEFONTWEIGHT, 400)
        set(v) = prefs.edit().putInt(KEY_V54_SUBTITLEFONTWEIGHT, v).apply()

    // v54.4: Gesture Edge Swipe Speed

var AppPrefs.v54GestureEdgeSwipeSpeed: Int
        get() = prefs.getInt(KEY_V54_GESTUREEDGESWIPESPEED, 50)
        set(v) = prefs.edit().putInt(KEY_V54_GESTUREEDGESWIPESPEED, v).apply()

    // v54.5: Video Adaptive Saturation

var AppPrefs.v54VideoAdaptiveSaturation: Boolean
        get() = prefs.getBoolean(KEY_V54_VIDEOADAPTIVESATURATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_VIDEOADAPTIVESATURATION, v).apply()

    // v54.6: Danmaku Send Max Length Custom

var AppPrefs.v54DanmakuSendMaxLengthCustom: Int
        get() = prefs.getInt(KEY_V54_DANMAKUSENDMAXLENGTHCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_DANMAKUSENDMAXLENGTHCUSTOM, v).apply()

    // v54.7: Cast Video Frame Rate Sync

var AppPrefs.v54CastVideoFrameRateSync: Boolean
        get() = prefs.getBoolean(KEY_V54_CASTVIDEOFRAMERATESYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V54_CASTVIDEOFRAMERATESYNC, v).apply()

    // v54.8: Subtitle Outline Color Custom

var AppPrefs.v54SubtitleOutlineColorCustom: Int
        get() = prefs.getInt(KEY_V54_SUBTITLEOUTLINECOLORCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_SUBTITLEOUTLINECOLORCUSTOM, v).apply()

    // v54.9: Video Luma Curve Custom

var AppPrefs.v54VideoLumaCurveCustom: Int
        get() = prefs.getInt(KEY_V54_VIDEOLUMACURVECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_VIDEOLUMACURVECUSTOM, v).apply()

    // v54.10: Danmaku History Filter

var AppPrefs.v54DanmakuHistoryFilter: Boolean
        get() = prefs.getBoolean(KEY_V54_DANMAKUHISTORYFILTER, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_DANMAKUHISTORYFILTER, v).apply()

    // v54.11: Playlist Auto Skip Watched

var AppPrefs.v54PlaylistAutoSkipWatched: Boolean
        get() = prefs.getBoolean(KEY_V54_PLAYLISTAUTOSKIPWATCHED, false)
        set(v) = prefs.edit().putBoolean(KEY_V54_PLAYLISTAUTOSKIPWATCHED, v).apply()

    // v54.12: Gesture Double Tap Action

var AppPrefs.v54GestureDoubleTapAction: Int
        get() = prefs.getInt(KEY_V54_GESTUREDOUBLETAPACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V54_GESTUREDOUBLETAPACTION, v).apply()

    // v54.13: Video Chroma Curve Custom

var AppPrefs.v54VideoChromaCurveCustom: Int
        get() = prefs.getInt(KEY_V54_VIDEOCHROMACURVECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_VIDEOCHROMACURVECUSTOM, v).apply()

    // v54.14: Danmaku BG Opacity Custom

var AppPrefs.v54DanmakuBgOpacityCustom: Int
        get() = prefs.getInt(KEY_V54_DANMAKUBGOPACITYCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_DANMAKUBGOPACITYCUSTOM, v).apply()

    // v54.15: Cast Audio Codec Custom

var AppPrefs.v54CastAudioCodecCustom: Int
        get() = prefs.getInt(KEY_V54_CASTAUDIOCODECCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V54_CASTAUDIOCODECCUSTOM, v).apply()

    // === v55.x ===
    // v55.1: Video Color Fade

var AppPrefs.v55VideoColorFade: Int
        get() = prefs.getInt(KEY_V55_VIDEOCOLORFADE, 0)
        set(v) = prefs.edit().putInt(KEY_V55_VIDEOCOLORFADE, v).apply()

    // v55.2: Danmaku Text Glow Custom

var AppPrefs.v55DanmakuTextGlowCustom: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKUTEXTGLOWCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_DANMAKUTEXTGLOWCUSTOM, v).apply()

    // v55.3: Subtitle Animation Speed

var AppPrefs.v55SubtitleAnimationSpeed: Int
        get() = prefs.getInt(KEY_V55_SUBTITLEANIMATIONSPEED, 50)
        set(v) = prefs.edit().putInt(KEY_V55_SUBTITLEANIMATIONSPEED, v).apply()

    // v55.4: Gesture Pinch Zoom Mode

var AppPrefs.v55GesturePinchZoomMode: Int
        get() = prefs.getInt(KEY_V55_GESTUREPINCHZOOMMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V55_GESTUREPINCHZOOMMODE, v).apply()

    // v55.5: Video Adaptive Gamma

var AppPrefs.v55VideoAdaptiveGamma: Boolean
        get() = prefs.getBoolean(KEY_V55_VIDEOADAPTIVEGAMMA, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_VIDEOADAPTIVEGAMMA, v).apply()

    // v55.6: Danmaku Send Rate Custom

var AppPrefs.v55DanmakuSendRateCustom: Int
        get() = prefs.getInt(KEY_V55_DANMAKUSENDRATECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V55_DANMAKUSENDRATECUSTOM, v).apply()

    // v55.7: Cast Video Bitrate Adaptive

var AppPrefs.v55CastVideoBitrateAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V55_CASTVIDEOBITRATEADAPTIVE, true)
        set(v) = prefs.edit().putBoolean(KEY_V55_CASTVIDEOBITRATEADAPTIVE, v).apply()

    // v55.8: Subtitle BG Opacity Custom

var AppPrefs.v55SubtitleBgOpacityCustom: Int
        get() = prefs.getInt(KEY_V55_SUBTITLEBGOPACITYCUSTOM, 80)
        set(v) = prefs.edit().putInt(KEY_V55_SUBTITLEBGOPACITYCUSTOM, v).apply()

    // v55.9: Video Frame Blend

var AppPrefs.v55VideoFrameBlend: Boolean
        get() = prefs.getBoolean(KEY_V55_VIDEOFRAMEBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_VIDEOFRAMEBLEND, v).apply()

    // v55.10: Danmaku Lane Count

var AppPrefs.v55DanmakuLaneCount: Int
        get() = prefs.getInt(KEY_V55_DANMAKULANECOUNT, 0)
        set(v) = prefs.edit().putInt(KEY_V55_DANMAKULANECOUNT, v).apply()

    // v55.11: Playlist Auto Sync

var AppPrefs.v55PlaylistAutoSync: Boolean
        get() = prefs.getBoolean(KEY_V55_PLAYLISTAUTOSYNC, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_PLAYLISTAUTOSYNC, v).apply()

    // v55.12: Gesture Rotate Action

var AppPrefs.v55GestureRotateAction: Int
        get() = prefs.getInt(KEY_V55_GESTUREROTATEACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V55_GESTUREROTATEACTION, v).apply()

    // v55.13: Video Color Tint Enhanced

var AppPrefs.v55VideoColorTintEnhanced: Boolean
        get() = prefs.getBoolean(KEY_V55_VIDEOCOLORTINTENHANCED, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_VIDEOCOLORTINTENHANCED, v).apply()

    // v55.14: Danmaku Font Custom Path

var AppPrefs.v55DanmakuFontCustomPath: Boolean
        get() = prefs.getBoolean(KEY_V55_DANMAKUFONTCUSTOMPATH, false)
        set(v) = prefs.edit().putBoolean(KEY_V55_DANMAKUFONTCUSTOMPATH, v).apply()

    // v55.15: Cast Audio Latency Auto

var AppPrefs.v55CastAudioLatencyAuto: Boolean
        get() = prefs.getBoolean(KEY_V55_CASTAUDIOLATENCYAUTO, true)
        set(v) = prefs.edit().putBoolean(KEY_V55_CASTAUDIOLATENCYAUTO, v).apply()

    // === v56.x ===
    // v56.1: Video Adaptive Detail

var AppPrefs.v56VideoAdaptiveDetail: Boolean
        get() = prefs.getBoolean(KEY_V56_VIDEOADAPTIVEDETAIL, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_VIDEOADAPTIVEDETAIL, v).apply()

    // v56.2: Danmaku Stroke Blur

var AppPrefs.v56DanmakuStrokeBlur: Int
        get() = prefs.getInt(KEY_V56_DANMAKUSTROKEBLUR, 0)
        set(v) = prefs.edit().putInt(KEY_V56_DANMAKUSTROKEBLUR, v).apply()

    // v56.3: Subtitle Word Spacing

var AppPrefs.v56SubtitleWordSpacing: Int
        get() = prefs.getInt(KEY_V56_SUBTITLEWORDSPACING, 0)
        set(v) = prefs.edit().putInt(KEY_V56_SUBTITLEWORDSPACING, v).apply()

    // v56.4: Gesture Multi Finger Action

var AppPrefs.v56GestureMultiFingerAction: Int
        get() = prefs.getInt(KEY_V56_GESTUREMULTIFINGERACTION, 0)
        set(v) = prefs.edit().putInt(KEY_V56_GESTUREMULTIFINGERACTION, v).apply()

    // v56.5: Video Color Black Level Custom

var AppPrefs.v56VideoColorBlackLevelCustom: Int
        get() = prefs.getInt(KEY_V56_VIDEOCOLORBLACKLEVELCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_VIDEOCOLORBLACKLEVELCUSTOM, v).apply()

    // v56.6: Danmaku Send Font Custom

var AppPrefs.v56DanmakuSendFontCustom: Boolean
        get() = prefs.getBoolean(KEY_V56_DANMAKUSENDFONTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_DANMAKUSENDFONTCUSTOM, v).apply()

    // v56.7: Cast Video Resolution Custom

var AppPrefs.v56CastVideoResolutionCustom: Int
        get() = prefs.getInt(KEY_V56_CASTVIDEORESOLUTIONCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_CASTVIDEORESOLUTIONCUSTOM, v).apply()

    // v56.8: Subtitle Font Stretch Custom

var AppPrefs.v56SubtitleFontStretchCustom: Int
        get() = prefs.getInt(KEY_V56_SUBTITLEFONTSTRETCHCUSTOM, 100)
        set(v) = prefs.edit().putInt(KEY_V56_SUBTITLEFONTSTRETCHCUSTOM, v).apply()

    // v56.9: Video Color White Level Custom

var AppPrefs.v56VideoColorWhiteLevelCustom: Int
        get() = prefs.getInt(KEY_V56_VIDEOCOLORWHITELEVELCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_VIDEOCOLORWHITELEVELCUSTOM, v).apply()

    // v56.10: Danmaku Filter By Color

var AppPrefs.v56DanmakuFilterByColor: Boolean
        get() = prefs.getBoolean(KEY_V56_DANMAKUFILTERBYCOLOR, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_DANMAKUFILTERBYCOLOR, v).apply()

    // v56.11: Playlist Auto Delete Expired

var AppPrefs.v56PlaylistAutoDeleteExpired: Boolean
        get() = prefs.getBoolean(KEY_V56_PLAYLISTAUTODELETEEXPIRED, false)
        set(v) = prefs.edit().putBoolean(KEY_V56_PLAYLISTAUTODELETEEXPIRED, v).apply()

    // v56.12: Gesture Swipe Direction Lock

var AppPrefs.v56GestureSwipeDirectionLock: Int
        get() = prefs.getInt(KEY_V56_GESTURESWIPEDIRECTIONLOCK, 0)
        set(v) = prefs.edit().putInt(KEY_V56_GESTURESWIPEDIRECTIONLOCK, v).apply()

    // v56.13: Video Color Midtone Custom

var AppPrefs.v56VideoColorMidtoneCustom: Int
        get() = prefs.getInt(KEY_V56_VIDEOCOLORMIDTONECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V56_VIDEOCOLORMIDTONECUSTOM, v).apply()

    // v56.14: Danmaku BG Padding Custom

var AppPrefs.v56DanmakuBgPaddingCustom: Int
        get() = prefs.getInt(KEY_V56_DANMAKUBGPADDINGCUSTOM, 2)
        set(v) = prefs.edit().putInt(KEY_V56_DANMAKUBGPADDINGCUSTOM, v).apply()

    // v56.15: Cast Audio Volume Sync

var AppPrefs.v56CastAudioVolumeSync: Boolean
        get() = prefs.getBoolean(KEY_V56_CASTAUDIOVOLUMESYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V56_CASTAUDIOVOLUMESYNC, v).apply()

    // === v57.x ===
    // v57.1: Video Temporal Enhance

var AppPrefs.v57VideoTemporalEnhance: Boolean
        get() = prefs.getBoolean(KEY_V57_VIDEOTEMPORALENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_VIDEOTEMPORALENHANCE, v).apply()

    // v57.2: Danmaku Font Line Height Custom

var AppPrefs.v57DanmakuFontLineHeightCustom: Int
        get() = prefs.getInt(KEY_V57_DANMAKUFONTLINEHEIGHTCUSTOM, 120)
        set(v) = prefs.edit().putInt(KEY_V57_DANMAKUFONTLINEHEIGHTCUSTOM, v).apply()

    // v57.3: Subtitle Outline Width Custom

var AppPrefs.v57SubtitleOutlineWidthCustom: Int
        get() = prefs.getInt(KEY_V57_SUBTITLEOUTLINEWIDTHCUSTOM, 1)
        set(v) = prefs.edit().putInt(KEY_V57_SUBTITLEOUTLINEWIDTHCUSTOM, v).apply()

    // v57.4: Gesture Long Press Feedback

var AppPrefs.v57GestureLongPressFeedback: Int
        get() = prefs.getInt(KEY_V57_GESTURELONGPRESSFEEDBACK, 0)
        set(v) = prefs.edit().putInt(KEY_V57_GESTURELONGPRESSFEEDBACK, v).apply()

    // v57.5: Video Color Highlight Custom

var AppPrefs.v57VideoColorHighlightCustom: Int
        get() = prefs.getInt(KEY_V57_VIDEOCOLORHIGHLIGHTCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_VIDEOCOLORHIGHLIGHTCUSTOM, v).apply()

    // v57.6: Danmaku Send Effect Custom

var AppPrefs.v57DanmakuSendEffectCustom: Boolean
        get() = prefs.getBoolean(KEY_V57_DANMAKUSENDEFFECTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_DANMAKUSENDEFFECTCUSTOM, v).apply()

    // v57.7: Cast Video Color Profile

var AppPrefs.v57CastVideoColorProfile: Int
        get() = prefs.getInt(KEY_V57_CASTVIDEOCOLORPROFILE, 0)
        set(v) = prefs.edit().putInt(KEY_V57_CASTVIDEOCOLORPROFILE, v).apply()

    // v57.8: Subtitle BG Blur Mode

var AppPrefs.v57SubtitleBgBlurMode: Int
        get() = prefs.getInt(KEY_V57_SUBTITLEBGBLURMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V57_SUBTITLEBGBLURMODE, v).apply()

    // v57.9: Video Color Shadow Custom

var AppPrefs.v57VideoColorShadowCustom: Int
        get() = prefs.getInt(KEY_V57_VIDEOCOLORSHADOWCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_VIDEOCOLORSHADOWCUSTOM, v).apply()

    // v57.10: Danmaku History Export Format

var AppPrefs.v57DanmakuHistoryExportFormat: Int
        get() = prefs.getInt(KEY_V57_DANMAKUHISTORYEXPORTFORMAT, 0)
        set(v) = prefs.edit().putInt(KEY_V57_DANMAKUHISTORYEXPORTFORMAT, v).apply()

    // v57.11: Playlist Auto Sort By Rating

var AppPrefs.v57PlaylistAutoSortByRating: Boolean
        get() = prefs.getBoolean(KEY_V57_PLAYLISTAUTOSORTBYRATING, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_PLAYLISTAUTOSORTBYRATING, v).apply()

    // v57.12: Gesture Dead Zone Mode

var AppPrefs.v57GestureDeadZoneMode: Int
        get() = prefs.getInt(KEY_V57_GESTUREDEADZONEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V57_GESTUREDEADZONEMODE, v).apply()

    // v57.13: Video Color Gamma Custom

var AppPrefs.v57VideoColorGammaCustom: Int
        get() = prefs.getInt(KEY_V57_VIDEOCOLORGAMMACUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_VIDEOCOLORGAMMACUSTOM, v).apply()

    // v57.14: Danmaku Border Radius Custom

var AppPrefs.v57DanmakuBorderRadiusCustom: Int
        get() = prefs.getInt(KEY_V57_DANMAKUBORDERRADIUSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V57_DANMAKUBORDERRADIUSCUSTOM, v).apply()

    // v57.15: Cast Audio Normalization Auto

var AppPrefs.v57CastAudioNormalizationAuto: Boolean
        get() = prefs.getBoolean(KEY_V57_CASTAUDIONORMALIZATIONAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V57_CASTAUDIONORMALIZATIONAUTO, v).apply()

    // === v58.x ===
    // v58.1: Video Spatial Enhance

var AppPrefs.v58VideoSpatialEnhance: Boolean
        get() = prefs.getBoolean(KEY_V58_VIDEOSPATIALENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_VIDEOSPATIALENHANCE, v).apply()

    // v58.2: Danmaku Font Size Adaptive Custom

var AppPrefs.v58DanmakuFontSizeAdaptiveCustom: Boolean
        get() = prefs.getBoolean(KEY_V58_DANMAKUFONTSIZEADAPTIVECUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_DANMAKUFONTSIZEADAPTIVECUSTOM, v).apply()

    // v58.3: Subtitle Font Kerning Custom

var AppPrefs.v58SubtitleFontKerningCustom: Boolean
        get() = prefs.getBoolean(KEY_V58_SUBTITLEFONTKERNINGCUSTOM, true)
        set(v) = prefs.edit().putBoolean(KEY_V58_SUBTITLEFONTKERNINGCUSTOM, v).apply()

    // v58.4: Gesture Custom Action 4

var AppPrefs.v58GestureCustomAction4: Int
        get() = prefs.getInt(KEY_V58_GESTURECUSTOMACTION4, 0)
        set(v) = prefs.edit().putInt(KEY_V58_GESTURECUSTOMACTION4, v).apply()

    // v58.5: Video Color Saturation Custom

var AppPrefs.v58VideoColorSaturationCustom: Int
        get() = prefs.getInt(KEY_V58_VIDEOCOLORSATURATIONCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_VIDEOCOLORSATURATIONCUSTOM, v).apply()

    // v58.6: Danmaku Send Color Preset

var AppPrefs.v58DanmakuSendColorPreset: Int
        get() = prefs.getInt(KEY_V58_DANMAKUSENDCOLORPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V58_DANMAKUSENDCOLORPRESET, v).apply()

    // v58.7: Cast Video Upscale Mode Custom

var AppPrefs.v58CastVideoUpscaleModeCustom: Int
        get() = prefs.getInt(KEY_V58_CASTVIDEOUPSCALEMODECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_CASTVIDEOUPSCALEMODECUSTOM, v).apply()

    // v58.8: Subtitle Font Letter Spacing Custom

var AppPrefs.v58SubtitleFontLetterSpacingCustom: Int
        get() = prefs.getInt(KEY_V58_SUBTITLEFONTLETTERSPACINGCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_SUBTITLEFONTLETTERSPACINGCUSTOM, v).apply()

    // v58.9: Video Color Contrast Custom

var AppPrefs.v58VideoColorContrastCustom: Int
        get() = prefs.getInt(KEY_V58_VIDEOCOLORCONTRASTCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_VIDEOCOLORCONTRASTCUSTOM, v).apply()

    // v58.10: Danmaku Merge Window Auto

var AppPrefs.v58DanmakuMergeWindowAuto: Boolean
        get() = prefs.getBoolean(KEY_V58_DANMAKUMERGEWINDOWAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_DANMAKUMERGEWINDOWAUTO, v).apply()

    // v58.11: Playlist Auto Mark Expired

var AppPrefs.v58PlaylistAutoMarkExpired: Boolean
        get() = prefs.getBoolean(KEY_V58_PLAYLISTAUTOMARKEXPIRED, false)
        set(v) = prefs.edit().putBoolean(KEY_V58_PLAYLISTAUTOMARKEXPIRED, v).apply()

    // v58.12: Gesture Swipe Velocity Custom

var AppPrefs.v58GestureSwipeVelocityCustom: Int
        get() = prefs.getInt(KEY_V58_GESTURESWIPEVELOCITYCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V58_GESTURESWIPEVELOCITYCUSTOM, v).apply()

    // v58.13: Video Color Brightness Custom

var AppPrefs.v58VideoColorBrightnessCustom: Int
        get() = prefs.getInt(KEY_V58_VIDEOCOLORBRIGHTNESSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_VIDEOCOLORBRIGHTNESSCUSTOM, v).apply()

    // v58.14: Danmaku BG Radius Custom

var AppPrefs.v58DanmakuBgRadiusCustom: Int
        get() = prefs.getInt(KEY_V58_DANMAKUBGRADIUSCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_DANMAKUBGRADIUSCUSTOM, v).apply()

    // v58.15: Cast Audio Delay Custom (ms)

var AppPrefs.v58CastAudioDelayCustom: Int
        get() = prefs.getInt(KEY_V58_CASTAUDIODELAYCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V58_CASTAUDIODELAYCUSTOM, v).apply()

    // === v59.x ===
    // v59.1: Video Color Matrix Custom

var AppPrefs.v59VideoColorMatrixCustom: Boolean
        get() = prefs.getBoolean(KEY_V59_VIDEOCOLORMATRIXCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_VIDEOCOLORMATRIXCUSTOM, v).apply()

    // v59.2: Danmaku Text Shadow Custom

var AppPrefs.v59DanmakuTextShadowCustom: Int
        get() = prefs.getInt(KEY_V59_DANMAKUTEXTSHADOWCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_DANMAKUTEXTSHADOWCUSTOM, v).apply()

    // v59.3: Subtitle Animation Delay

var AppPrefs.v59SubtitleAnimationDelay: Int
        get() = prefs.getInt(KEY_V59_SUBTITLEANIMATIONDELAY, 0)
        set(v) = prefs.edit().putInt(KEY_V59_SUBTITLEANIMATIONDELAY, v).apply()

    // v59.4: Gesture Edge Swipe Custom

var AppPrefs.v59GestureEdgeSwipeCustom: Int
        get() = prefs.getInt(KEY_V59_GESTUREEDGESWIPECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_GESTUREEDGESWIPECUSTOM, v).apply()

    // v59.5: Video Color Denoise Strength

var AppPrefs.v59VideoColorDenoiseStrength: Int
        get() = prefs.getInt(KEY_V59_VIDEOCOLORDENOISESTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V59_VIDEOCOLORDENOISESTRENGTH, v).apply()

    // v59.6: Danmaku Send Effect Preview

var AppPrefs.v59DanmakuSendEffectPreview: Boolean
        get() = prefs.getBoolean(KEY_V59_DANMAKUSENDEFFECTPREVIEW, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_DANMAKUSENDEFFECTPREVIEW, v).apply()

    // v59.7: Cast Video Color Space

var AppPrefs.v59CastVideoColorSpace: Int
        get() = prefs.getInt(KEY_V59_CASTVIDEOCOLORSPACE, 0)
        set(v) = prefs.edit().putInt(KEY_V59_CASTVIDEOCOLORSPACE, v).apply()

    // v59.8: Subtitle BG Gradient Custom

var AppPrefs.v59SubtitleBgGradientCustom: Boolean
        get() = prefs.getBoolean(KEY_V59_SUBTITLEBGGRADIENTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_SUBTITLEBGGRADIENTCUSTOM, v).apply()

    // v59.9: Video Color Vibrance Custom

var AppPrefs.v59VideoColorVibranceCustom: Int
        get() = prefs.getInt(KEY_V59_VIDEOCOLORVIBRANCECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_VIDEOCOLORVIBRANCECUSTOM, v).apply()

    // v59.10: Danmaku History Search Custom

var AppPrefs.v59DanmakuHistorySearchCustom: Boolean
        get() = prefs.getBoolean(KEY_V59_DANMAKUHISTORYSEARCHCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_DANMAKUHISTORYSEARCHCUSTOM, v).apply()

    // v59.11: Playlist Auto Backup

var AppPrefs.v59PlaylistAutoBackup: Boolean
        get() = prefs.getBoolean(KEY_V59_PLAYLISTAUTOBACKUP, false)
        set(v) = prefs.edit().putBoolean(KEY_V59_PLAYLISTAUTOBACKUP, v).apply()

    // v59.12: Gesture Pinch Sensitivity Custom

var AppPrefs.v59GesturePinchSensitivityCustom: Int
        get() = prefs.getInt(KEY_V59_GESTUREPINCHSENSITIVITYCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V59_GESTUREPINCHSENSITIVITYCUSTOM, v).apply()

    // v59.13: Video Color Temperature Custom

var AppPrefs.v59VideoColorTemperatureCustom: Int
        get() = prefs.getInt(KEY_V59_VIDEOCOLORTEMPERATURECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V59_VIDEOCOLORTEMPERATURECUSTOM, v).apply()

    // v59.14: Danmaku Font Weight Custom

var AppPrefs.v59DanmakuFontWeightCustom: Int
        get() = prefs.getInt(KEY_V59_DANMAKUFONTWEIGHTCUSTOM, 400)
        set(v) = prefs.edit().putInt(KEY_V59_DANMAKUFONTWEIGHTCUSTOM, v).apply()

    // v59.15: Cast Audio Channel Sync

var AppPrefs.v59CastAudioChannelSync: Boolean
        get() = prefs.getBoolean(KEY_V59_CASTAUDIOCHANNELSYNC, true)
        set(v) = prefs.edit().putBoolean(KEY_V59_CASTAUDIOCHANNELSYNC, v).apply()

    // === v60.x ===
    // v60.1: Video Adaptive Color Enhance

var AppPrefs.v60VideoAdaptiveColorEnhance: Boolean
        get() = prefs.getBoolean(KEY_V60_VIDEOADAPTIVECOLORENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V60_VIDEOADAPTIVECOLORENHANCE, v).apply()

    // v60.2: Danmaku Border Weight Custom

var AppPrefs.v60DanmakuBorderWeightCustom: Int
        get() = prefs.getInt(KEY_V60_DANMAKUBORDERWEIGHTCUSTOM, 1)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUBORDERWEIGHTCUSTOM, v).apply()

    // v60.3: Subtitle Font Shadow Custom

var AppPrefs.v60SubtitleFontShadowCustom: Int
        get() = prefs.getInt(KEY_V60_SUBTITLEFONTSHADOWCUSTOM, 1)
        set(v) = prefs.edit().putInt(KEY_V60_SUBTITLEFONTSHADOWCUSTOM, v).apply()

    // v60.4: Gesture Multi Touch Custom

var AppPrefs.v60GestureMultiTouchCustom: Int
        get() = prefs.getInt(KEY_V60_GESTUREMULTITOUCHCUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V60_GESTUREMULTITOUCHCUSTOM, v).apply()

    // v60.5: Video Color Tint Preset

var AppPrefs.v60VideoColorTintPreset: Int
        get() = prefs.getInt(KEY_V60_VIDEOCOLORTINTPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_VIDEOCOLORTINTPRESET, v).apply()

    // v60.6: Danmaku Send Max Length Enhanced

var AppPrefs.v60DanmakuSendMaxLengthEnhanced: Int
        get() = prefs.getInt(KEY_V60_DANMAKUSENDMAXLENGTHENHANCED, 0)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUSENDMAXLENGTHENHANCED, v).apply()

    // v60.7: Cast Video Auto Resolution

var AppPrefs.v60CastVideoAutoResolution: Boolean
        get() = prefs.getBoolean(KEY_V60_CASTVIDEOAUTORESOLUTION, true)
        set(v) = prefs.edit().putBoolean(KEY_V60_CASTVIDEOAUTORESOLUTION, v).apply()

    // v60.8: Subtitle BG Color Preset

var AppPrefs.v60SubtitleBgColorPreset: Int
        get() = prefs.getInt(KEY_V60_SUBTITLEBGCOLORPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_SUBTITLEBGCOLORPRESET, v).apply()

    // v60.9: Video Color LUT Custom

var AppPrefs.v60VideoColorLUTCustom: Boolean
        get() = prefs.getBoolean(KEY_V60_VIDEOCOLORLUTCUSTOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V60_VIDEOCOLORLUTCUSTOM, v).apply()

    // v60.10: Danmaku Font Size Preset

var AppPrefs.v60DanmakuFontSizePreset: Int
        get() = prefs.getInt(KEY_V60_DANMAKUFONTSIZEPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUFONTSIZEPRESET, v).apply()

    // v60.11: Playlist Auto Restore

var AppPrefs.v60PlaylistAutoRestore: Boolean
        get() = prefs.getBoolean(KEY_V60_PLAYLISTAUTORESTORE, false)
        set(v) = prefs.edit().putBoolean(KEY_V60_PLAYLISTAUTORESTORE, v).apply()

    // v60.12: Gesture Custom Sensitivity Enhanced

var AppPrefs.v60GestureCustomSensitivityEnhanced: Int
        get() = prefs.getInt(KEY_V60_GESTURECUSTOMSENSITIVITYENHANCED, 50)
        set(v) = prefs.edit().putInt(KEY_V60_GESTURECUSTOMSENSITIVITYENHANCED, v).apply()

    // v60.13: Video Color Grading Preset

var AppPrefs.v60VideoColorGradingPreset: Int
        get() = prefs.getInt(KEY_V60_VIDEOCOLORGRADINGPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_VIDEOCOLORGRADINGPRESET, v).apply()

    // v60.14: Danmaku BG Color Preset

var AppPrefs.v60DanmakuBgColorPreset: Int
        get() = prefs.getInt(KEY_V60_DANMAKUBGCOLORPRESET, 0)
        set(v) = prefs.edit().putInt(KEY_V60_DANMAKUBGCOLORPRESET, v).apply()

    // v60.15: Cast Audio Fade Mode Custom

var AppPrefs.v60CastAudioFadeModeCustom: Int
        get() = prefs.getInt(KEY_V60_CASTAUDIOFADEMODECUSTOM, 0)
        set(v) = prefs.edit().putInt(KEY_V60_CASTAUDIOFADEMODECUSTOM, v).apply()


    // ==================== v61-v70 New Unique Features ====================

    // === v61.x ===
    // v61.1: Video Edge Enhance Strength

var AppPrefs.v61VideoEdgeEnhanceStrength: Boolean
        get() = prefs.getBoolean(KEY_V61_VIDEOEDGEENHANCESTRENGTH, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_VIDEOEDGEENHANCESTRENGTH, v).apply()

    // v61.2: Danmaku Collision Detection

var AppPrefs.v61DanmakuCollisionDetection: Boolean
        get() = prefs.getBoolean(KEY_V61_DANMAKUCOLLISIONDETECTION, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_DANMAKUCOLLISIONDETECTION, v).apply()

    // v61.3: Subtitle Position Offset X

var AppPrefs.v61SubtitlePositionOffsetX: Int
        get() = prefs.getInt(KEY_V61_SUBTITLEPOSITIONOFFSETX, 0)
        set(v) = prefs.edit().putInt(KEY_V61_SUBTITLEPOSITIONOFFSETX, v).apply()

    // v61.4: Gesture Fling Velocity

var AppPrefs.v61GestureFlingVelocity: Int
        get() = prefs.getInt(KEY_V61_GESTUREFLINGVELOCITY, 50)
        set(v) = prefs.edit().putInt(KEY_V61_GESTUREFLINGVELOCITY, v).apply()

    // v61.5: Video Motion Compensation

var AppPrefs.v61VideoMotionCompensation: Boolean
        get() = prefs.getBoolean(KEY_V61_VIDEOMOTIONCOMPENSATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_VIDEOMOTIONCOMPENSATION, v).apply()

    // v61.6: Danmaku Animation Type

var AppPrefs.v61DanmakuAnimationType: Int
        get() = prefs.getInt(KEY_V61_DANMAKUANIMATIONTYPE, 0)
        set(v) = prefs.edit().putInt(KEY_V61_DANMAKUANIMATIONTYPE, v).apply()

    // v61.7: Cast Video Buffer (ms)

var AppPrefs.v61CastVideoBufferMs: Int
        get() = prefs.getInt(KEY_V61_CASTVIDEOBUFFERMS, 0)
        set(v) = prefs.edit().putInt(KEY_V61_CASTVIDEOBUFFERMS, v).apply()

    // v61.8: Subtitle Font Size Min

var AppPrefs.v61SubtitleFontSizeMin: Int
        get() = prefs.getInt(KEY_V61_SUBTITLEFONTSIZEMIN, 12)
        set(v) = prefs.edit().putInt(KEY_V61_SUBTITLEFONTSIZEMIN, v).apply()

    // v61.9: Video Adaptive Sharpness

var AppPrefs.v61VideoAdaptiveSharpness: Boolean
        get() = prefs.getBoolean(KEY_V61_VIDEOADAPTIVESHARPNESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_VIDEOADAPTIVESHARPNESS, v).apply()

    // v61.10: Danmaku Filter By Length

var AppPrefs.v61DanmakuFilterByLength: Int
        get() = prefs.getInt(KEY_V61_DANMAKUFILTERBYLENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V61_DANMAKUFILTERBYLENGTH, v).apply()

    // v61.11: Playlist Smart Filter

var AppPrefs.v61PlaylistSmartFilter: Boolean
        get() = prefs.getBoolean(KEY_V61_PLAYLISTSMARTFILTER, false)
        set(v) = prefs.edit().putBoolean(KEY_V61_PLAYLISTSMARTFILTER, v).apply()

    // v61.12: Gesture Swipe Curve

var AppPrefs.v61GestureSwipeCurve: Int
        get() = prefs.getInt(KEY_V61_GESTURESWIPECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V61_GESTURESWIPECURVE, v).apply()

    // v61.13: Video Color Balance RGB

var AppPrefs.v61VideoColorBalanceRGB: Int
        get() = prefs.getInt(KEY_V61_VIDEOCOLORBALANCERGB, 0)
        set(v) = prefs.edit().putInt(KEY_V61_VIDEOCOLORBALANCERGB, v).apply()

    // v61.14: Danmaku Font Size Auto Min

var AppPrefs.v61DanmakuFontSizeAutoMin: Int
        get() = prefs.getInt(KEY_V61_DANMAKUFONTSIZEAUTOMIN, 12)
        set(v) = prefs.edit().putInt(KEY_V61_DANMAKUFONTSIZEAUTOMIN, v).apply()

    // v61.15: Cast Audio Buffer (ms)

var AppPrefs.v61CastAudioBufferMs: Int
        get() = prefs.getInt(KEY_V61_CASTAUDIOBUFFERMS, 0)
        set(v) = prefs.edit().putInt(KEY_V61_CASTAUDIOBUFFERMS, v).apply()

    // === v62.x ===
    // v62.1: Video Temporal Denoise

var AppPrefs.v62VideoTemporalDenoise: Boolean
        get() = prefs.getBoolean(KEY_V62_VIDEOTEMPORALDENOISE, false)
        set(v) = prefs.edit().putBoolean(KEY_V62_VIDEOTEMPORALDENOISE, v).apply()

    // v62.2: Danmaku Scroll Speed Custom

var AppPrefs.v62DanmakuScrollSpeedCustom: Int
        get() = prefs.getInt(KEY_V62_DANMAKUSCROLLSPEEDCUSTOM, 100)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUSCROLLSPEEDCUSTOM, v).apply()

    // v62.3: Subtitle Position Offset Y

var AppPrefs.v62SubtitlePositionOffsetY: Int
        get() = prefs.getInt(KEY_V62_SUBTITLEPOSITIONOFFSETY, 0)
        set(v) = prefs.edit().putInt(KEY_V62_SUBTITLEPOSITIONOFFSETY, v).apply()

    // v62.4: Gesture Tap Feedback

var AppPrefs.v62GestureTapFeedback: Int
        get() = prefs.getInt(KEY_V62_GESTURETAPFEEDBACK, 0)
        set(v) = prefs.edit().putInt(KEY_V62_GESTURETAPFEEDBACK, v).apply()

    // v62.5: Video Adaptive Noise Gate

var AppPrefs.v62VideoAdaptiveNoiseGate: Boolean
        get() = prefs.getBoolean(KEY_V62_VIDEOADAPTIVENOISEGATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V62_VIDEOADAPTIVENOISEGATE, v).apply()

    // v62.6: Danmaku Merge Distance Custom

var AppPrefs.v62DanmakuMergeDistanceCustom: Int
        get() = prefs.getInt(KEY_V62_DANMAKUMERGEDISTANCECUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUMERGEDISTANCECUSTOM, v).apply()

    // v62.7: Cast Video Decode Mode

var AppPrefs.v62CastVideoDecodeMode: Int
        get() = prefs.getInt(KEY_V62_CASTVIDEODECODEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_CASTVIDEODECODEMODE, v).apply()

    // v62.8: Subtitle Font Size Max

var AppPrefs.v62SubtitleFontSizeMax: Int
        get() = prefs.getInt(KEY_V62_SUBTITLEFONTSIZEMAX, 48)
        set(v) = prefs.edit().putInt(KEY_V62_SUBTITLEFONTSIZEMAX, v).apply()

    // v62.9: Video Adaptive Contrast Curve

var AppPrefs.v62VideoAdaptiveContrastCurve: Int
        get() = prefs.getInt(KEY_V62_VIDEOADAPTIVECONTRASTCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_VIDEOADAPTIVECONTRASTCURVE, v).apply()

    // v62.10: Danmaku Filter By Speed

var AppPrefs.v62DanmakuFilterBySpeed: Int
        get() = prefs.getInt(KEY_V62_DANMAKUFILTERBYSPEED, 0)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUFILTERBYSPEED, v).apply()

    // v62.11: Playlist Auto Group

var AppPrefs.v62PlaylistAutoGroup: Boolean
        get() = prefs.getBoolean(KEY_V62_PLAYLISTAUTOGROUP, false)
        set(v) = prefs.edit().putBoolean(KEY_V62_PLAYLISTAUTOGROUP, v).apply()

    // v62.12: Gesture Swipe Acceleration

var AppPrefs.v62GestureSwipeAcceleration: Int
        get() = prefs.getInt(KEY_V62_GESTURESWIPEACCELERATION, 50)
        set(v) = prefs.edit().putInt(KEY_V62_GESTURESWIPEACCELERATION, v).apply()

    // v62.13: Video Color Hue Rotate

var AppPrefs.v62VideoColorHueRotate: Int
        get() = prefs.getInt(KEY_V62_VIDEOCOLORHUEROTATE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_VIDEOCOLORHUEROTATE, v).apply()

    // v62.14: Danmaku Font Size Auto Max

var AppPrefs.v62DanmakuFontSizeAutoMax: Int
        get() = prefs.getInt(KEY_V62_DANMAKUFONTSIZEAUTOMAX, 36)
        set(v) = prefs.edit().putInt(KEY_V62_DANMAKUFONTSIZEAUTOMAX, v).apply()

    // v62.15: Cast Audio Decode Mode

var AppPrefs.v62CastAudioDecodeMode: Int
        get() = prefs.getInt(KEY_V62_CASTAUDIODECODEMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V62_CASTAUDIODECODEMODE, v).apply()

    // === v63.x ===
    // v63.1: Video Spatial Denoise

var AppPrefs.v63VideoSpatialDenoise: Boolean
        get() = prefs.getBoolean(KEY_V63_VIDEOSPATIALDENOISE, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_VIDEOSPATIALDENOISE, v).apply()

    // v63.2: Danmaku Top Bottom Margin

var AppPrefs.v63DanmakuTopBottomMargin: Int
        get() = prefs.getInt(KEY_V63_DANMAKUTOPBOTTOMMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUTOPBOTTOMMARGIN, v).apply()

    // v63.3: Subtitle Animation Fade In

var AppPrefs.v63SubtitleAnimationFadeIn: Boolean
        get() = prefs.getBoolean(KEY_V63_SUBTITLEANIMATIONFADEIN, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_SUBTITLEANIMATIONFADEIN, v).apply()

    // v63.4: Gesture Long Press Vibration

var AppPrefs.v63GestureLongPressVibration: Boolean
        get() = prefs.getBoolean(KEY_V63_GESTURELONGPRESSVIBRATION, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_GESTURELONGPRESSVIBRATION, v).apply()

    // v63.5: Video Adaptive Saturation Curve

var AppPrefs.v63VideoAdaptiveSaturationCurve: Int
        get() = prefs.getInt(KEY_V63_VIDEOADAPTIVESATURATIONCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_VIDEOADAPTIVESATURATIONCURVE, v).apply()

    // v63.6: Danmaku Send Queue Size

var AppPrefs.v63DanmakuSendQueueSize: Int
        get() = prefs.getInt(KEY_V63_DANMAKUSENDQUEUESIZE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUSENDQUEUESIZE, v).apply()

    // v63.7: Cast Video Render Mode

var AppPrefs.v63CastVideoRenderMode: Int
        get() = prefs.getInt(KEY_V63_CASTVIDEORENDERMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_CASTVIDEORENDERMODE, v).apply()

    // v63.8: Subtitle BG Border Width

var AppPrefs.v63SubtitleBgBorderWidth: Int
        get() = prefs.getInt(KEY_V63_SUBTITLEBGBORDERWIDTH, 0)
        set(v) = prefs.edit().putInt(KEY_V63_SUBTITLEBGBORDERWIDTH, v).apply()

    // v63.9: Video Adaptive Gamma Curve

var AppPrefs.v63VideoAdaptiveGammaCurve: Int
        get() = prefs.getInt(KEY_V63_VIDEOADAPTIVEGAMMACURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_VIDEOADAPTIVEGAMMACURVE, v).apply()

    // v63.10: Danmaku Filter By Type

var AppPrefs.v63DanmakuFilterByType: Int
        get() = prefs.getInt(KEY_V63_DANMAKUFILTERBYTYPE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUFILTERBYTYPE, v).apply()

    // v63.11: Playlist Auto Merge

var AppPrefs.v63PlaylistAutoMerge: Boolean
        get() = prefs.getBoolean(KEY_V63_PLAYLISTAUTOMERGE, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_PLAYLISTAUTOMERGE, v).apply()

    // v63.12: Gesture Swipe Deceleration Custom

var AppPrefs.v63GestureSwipeDecelerationCustom: Int
        get() = prefs.getInt(KEY_V63_GESTURESWIPEDECELERATIONCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V63_GESTURESWIPEDECELERATIONCUSTOM, v).apply()

    // v63.13: Video Color Invert

var AppPrefs.v63VideoColorInvert: Boolean
        get() = prefs.getBoolean(KEY_V63_VIDEOCOLORINVERT, false)
        set(v) = prefs.edit().putBoolean(KEY_V63_VIDEOCOLORINVERT, v).apply()

    // v63.14: Danmaku History Sort Order

var AppPrefs.v63DanmakuHistorySortOrder: Int
        get() = prefs.getInt(KEY_V63_DANMAKUHISTORYSORTORDER, 0)
        set(v) = prefs.edit().putInt(KEY_V63_DANMAKUHISTORYSORTORDER, v).apply()

    // v63.15: Cast Audio Render Mode

var AppPrefs.v63CastAudioRenderMode: Int
        get() = prefs.getInt(KEY_V63_CASTAUDIORENDERMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V63_CASTAUDIORENDERMODE, v).apply()

    // === v64.x ===
    // v64.1: Video Adaptive Edge Preserve

var AppPrefs.v64VideoAdaptiveEdgePreserve: Boolean
        get() = prefs.getBoolean(KEY_V64_VIDEOADAPTIVEEDGEPRESERVE, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_VIDEOADAPTIVEEDGEPRESERVE, v).apply()

    // v64.2: Danmaku Fixed Position

var AppPrefs.v64DanmakuFixedPosition: Int
        get() = prefs.getInt(KEY_V64_DANMAKUFIXEDPOSITION, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUFIXEDPOSITION, v).apply()

    // v64.3: Subtitle Animation Fade Out

var AppPrefs.v64SubtitleAnimationFadeOut: Boolean
        get() = prefs.getBoolean(KEY_V64_SUBTITLEANIMATIONFADEOUT, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_SUBTITLEANIMATIONFADEOUT, v).apply()

    // v64.4: Gesture Multi Finger Gesture

var AppPrefs.v64GestureMultiFingerGesture: Int
        get() = prefs.getInt(KEY_V64_GESTUREMULTIFINGERGESTURE, 0)
        set(v) = prefs.edit().putInt(KEY_V64_GESTUREMULTIFINGERGESTURE, v).apply()

    // v64.5: Video Color Grayscale

var AppPrefs.v64VideoColorGrayscale: Boolean
        get() = prefs.getBoolean(KEY_V64_VIDEOCOLORGRAYSCALE, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_VIDEOCOLORGRAYSCALE, v).apply()

    // v64.6: Danmaku Send Delay

var AppPrefs.v64DanmakuSendDelay: Int
        get() = prefs.getInt(KEY_V64_DANMAKUSENDDELAY, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUSENDDELAY, v).apply()

    // v64.7: Cast Video Post Process

var AppPrefs.v64CastVideoPostProcess: Boolean
        get() = prefs.getBoolean(KEY_V64_CASTVIDEOPOSTPROCESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_CASTVIDEOPOSTPROCESS, v).apply()

    // v64.8: Subtitle BG Border Color

var AppPrefs.v64SubtitleBgBorderColor: Int
        get() = prefs.getInt(KEY_V64_SUBTITLEBGBORDERCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V64_SUBTITLEBGBORDERCOLOR, v).apply()

    // v64.9: Video Adaptive Detail Curve

var AppPrefs.v64VideoAdaptiveDetailCurve: Int
        get() = prefs.getInt(KEY_V64_VIDEOADAPTIVEDETAILCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V64_VIDEOADAPTIVEDETAILCURVE, v).apply()

    // v64.10: Danmaku Filter By User Level

var AppPrefs.v64DanmakuFilterByUserLevel: Int
        get() = prefs.getInt(KEY_V64_DANMAKUFILTERBYUSERLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUFILTERBYUSERLEVEL, v).apply()

    // v64.11: Playlist Auto Split

var AppPrefs.v64PlaylistAutoSplit: Boolean
        get() = prefs.getBoolean(KEY_V64_PLAYLISTAUTOSPLIT, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_PLAYLISTAUTOSPLIT, v).apply()

    // v64.12: Gesture Swipe Friction

var AppPrefs.v64GestureSwipeFriction: Int
        get() = prefs.getInt(KEY_V64_GESTURESWIPEFRICTION, 50)
        set(v) = prefs.edit().putInt(KEY_V64_GESTURESWIPEFRICTION, v).apply()

    // v64.13: Video Color Sepia Strength

var AppPrefs.v64VideoColorSepiaStrength: Int
        get() = prefs.getInt(KEY_V64_VIDEOCOLORSEPIASTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V64_VIDEOCOLORSEPIASTRENGTH, v).apply()

    // v64.14: Danmaku History Max Items

var AppPrefs.v64DanmakuHistoryMaxItems: Int
        get() = prefs.getInt(KEY_V64_DANMAKUHISTORYMAXITEMS, 0)
        set(v) = prefs.edit().putInt(KEY_V64_DANMAKUHISTORYMAXITEMS, v).apply()

    // v64.15: Cast Audio Post Process

var AppPrefs.v64CastAudioPostProcess: Boolean
        get() = prefs.getBoolean(KEY_V64_CASTAUDIOPOSTPROCESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V64_CASTAUDIOPOSTPROCESS, v).apply()

    // === v65.x ===
    // v65.1: Video Adaptive Motion Blur

var AppPrefs.v65VideoAdaptiveMotionBlur: Boolean
        get() = prefs.getBoolean(KEY_V65_VIDEOADAPTIVEMOTIONBLUR, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_VIDEOADAPTIVEMOTIONBLUR, v).apply()

    // v65.2: Danmaku Scroll Direction

var AppPrefs.v65DanmakuScrollDirection: Int
        get() = prefs.getInt(KEY_V65_DANMAKUSCROLLDIRECTION, 0)
        set(v) = prefs.edit().putInt(KEY_V65_DANMAKUSCROLLDIRECTION, v).apply()

    // v65.3: Subtitle Animation Slide

var AppPrefs.v65SubtitleAnimationSlide: Int
        get() = prefs.getInt(KEY_V65_SUBTITLEANIMATIONSLIDE, 0)
        set(v) = prefs.edit().putInt(KEY_V65_SUBTITLEANIMATIONSLIDE, v).apply()

    // v65.4: Gesture Custom Gesture 1

var AppPrefs.v65GestureCustomGesture1: Int
        get() = prefs.getInt(KEY_V65_GESTURECUSTOMGESTURE1, 0)
        set(v) = prefs.edit().putInt(KEY_V65_GESTURECUSTOMGESTURE1, v).apply()

    // v65.5: Video Color Posterize Level

var AppPrefs.v65VideoColorPosterizeLevel: Int
        get() = prefs.getInt(KEY_V65_VIDEOCOLORPOSTERIZELEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V65_VIDEOCOLORPOSTERIZELEVEL, v).apply()

    // v65.6: Danmaku Send Priority Level

var AppPrefs.v65DanmakuSendPriorityLevel: Int
        get() = prefs.getInt(KEY_V65_DANMAKUSENDPRIORITYLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V65_DANMAKUSENDPRIORITYLEVEL, v).apply()

    // v65.7: Cast Video HDR

var AppPrefs.v65CastVideoHDR: Boolean
        get() = prefs.getBoolean(KEY_V65_CASTVIDEOHDR, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_CASTVIDEOHDR, v).apply()

    // v65.8: Subtitle BG Blur Strength

var AppPrefs.v65SubtitleBgBlurStrength: Int
        get() = prefs.getInt(KEY_V65_SUBTITLEBGBLURSTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V65_SUBTITLEBGBLURSTRENGTH, v).apply()

    // v65.9: Video Adaptive Luma Curve

var AppPrefs.v65VideoAdaptiveLumaCurve: Int
        get() = prefs.getInt(KEY_V65_VIDEOADAPTIVELUMACURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V65_VIDEOADAPTIVELUMACURVE, v).apply()

    // v65.10: Danmaku Filter By Badge

var AppPrefs.v65DanmakuFilterByBadge: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKUFILTERBYBADGE, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_DANMAKUFILTERBYBADGE, v).apply()

    // v65.11: Playlist Auto Deduplicate

var AppPrefs.v65PlaylistAutoDeduplicate: Boolean
        get() = prefs.getBoolean(KEY_V65_PLAYLISTAUTODEDUPLICATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_PLAYLISTAUTODEDUPLICATE, v).apply()

    // v65.12: Gesture Swipe Sensitivity Custom

var AppPrefs.v65GestureSwipeSensitivityCustom: Int
        get() = prefs.getInt(KEY_V65_GESTURESWIPESENSITIVITYCUSTOM, 50)
        set(v) = prefs.edit().putInt(KEY_V65_GESTURESWIPESENSITIVITYCUSTOM, v).apply()

    // v65.13: Video Color Solarize Strength

var AppPrefs.v65VideoColorSolarizeStrength: Int
        get() = prefs.getInt(KEY_V65_VIDEOCOLORSOLARIZESTRENGTH, 0)
        set(v) = prefs.edit().putInt(KEY_V65_VIDEOCOLORSOLARIZESTRENGTH, v).apply()

    // v65.14: Danmaku History Auto Export

var AppPrefs.v65DanmakuHistoryAutoExport: Boolean
        get() = prefs.getBoolean(KEY_V65_DANMAKUHISTORYAUTOEXPORT, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_DANMAKUHISTORYAUTOEXPORT, v).apply()

    // v65.15: Cast Audio HDR

var AppPrefs.v65CastAudioHDR: Boolean
        get() = prefs.getBoolean(KEY_V65_CASTAUDIOHDR, false)
        set(v) = prefs.edit().putBoolean(KEY_V65_CASTAUDIOHDR, v).apply()

    // === v66.x ===
    // v66.1: Video Adaptive Frame Blend

var AppPrefs.v66VideoAdaptiveFrameBlend: Boolean
        get() = prefs.getBoolean(KEY_V66_VIDEOADAPTIVEFRAMEBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_VIDEOADAPTIVEFRAMEBLEND, v).apply()

    // v66.2: Danmaku Top Margin

var AppPrefs.v66DanmakuTopMargin: Int
        get() = prefs.getInt(KEY_V66_DANMAKUTOPMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V66_DANMAKUTOPMARGIN, v).apply()

    // v66.3: Subtitle Animation Bounce

var AppPrefs.v66SubtitleAnimationBounce: Boolean
        get() = prefs.getBoolean(KEY_V66_SUBTITLEANIMATIONBOUNCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_SUBTITLEANIMATIONBOUNCE, v).apply()

    // v66.4: Gesture Custom Gesture 2

var AppPrefs.v66GestureCustomGesture2: Int
        get() = prefs.getInt(KEY_V66_GESTURECUSTOMGESTURE2, 0)
        set(v) = prefs.edit().putInt(KEY_V66_GESTURECUSTOMGESTURE2, v).apply()

    // v66.5: Video Color Vignette

var AppPrefs.v66VideoColorVignette: Int
        get() = prefs.getInt(KEY_V66_VIDEOCOLORVIGNETTE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_VIDEOCOLORVIGNETTE, v).apply()

    // v66.6: Danmaku Send Max Length Per Second

var AppPrefs.v66DanmakuSendMaxLengthPerSecond: Int
        get() = prefs.getInt(KEY_V66_DANMAKUSENDMAXLENGTHPERSECOND, 0)
        set(v) = prefs.edit().putInt(KEY_V66_DANMAKUSENDMAXLENGTHPERSECOND, v).apply()

    // v66.7: Cast Video Dolby Vision

var AppPrefs.v66CastVideoDolbyVision: Boolean
        get() = prefs.getBoolean(KEY_V66_CASTVIDEODOLBYVISION, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_CASTVIDEODOLBYVISION, v).apply()

    // v66.8: Subtitle BG Border Radius

var AppPrefs.v66SubtitleBgBorderRadius: Int
        get() = prefs.getInt(KEY_V66_SUBTITLEBGBORDERRADIUS, 0)
        set(v) = prefs.edit().putInt(KEY_V66_SUBTITLEBGBORDERRADIUS, v).apply()

    // v66.9: Video Adaptive Color Curve

var AppPrefs.v66VideoAdaptiveColorCurve: Int
        get() = prefs.getInt(KEY_V66_VIDEOADAPTIVECOLORCURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_VIDEOADAPTIVECOLORCURVE, v).apply()

    // v66.10: Danmaku Filter By Medal

var AppPrefs.v66DanmakuFilterByMedal: Boolean
        get() = prefs.getBoolean(KEY_V66_DANMAKUFILTERBYMEDAL, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_DANMAKUFILTERBYMEDAL, v).apply()

    // v66.11: Playlist Auto Shuffle On Start

var AppPrefs.v66PlaylistAutoShuffleOnStart: Boolean
        get() = prefs.getBoolean(KEY_V66_PLAYLISTAUTOSHUFFLEONSTART, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_PLAYLISTAUTOSHUFFLEONSTART, v).apply()

    // v66.12: Gesture Swipe Momentum

var AppPrefs.v66GestureSwipeMomentum: Int
        get() = prefs.getInt(KEY_V66_GESTURESWIPEMOMENTUM, 50)
        set(v) = prefs.edit().putInt(KEY_V66_GESTURESWIPEMOMENTUM, v).apply()

    // v66.13: Video Color Duotone

var AppPrefs.v66VideoColorDuotone: Int
        get() = prefs.getInt(KEY_V66_VIDEOCOLORDUOTONE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_VIDEOCOLORDUOTONE, v).apply()

    // v66.14: Danmaku History Search Mode

var AppPrefs.v66DanmakuHistorySearchMode: Int
        get() = prefs.getInt(KEY_V66_DANMAKUHISTORYSEARCHMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V66_DANMAKUHISTORYSEARCHMODE, v).apply()

    // v66.15: Cast Audio Dolby Atmos

var AppPrefs.v66CastAudioDolbyAtmos: Boolean
        get() = prefs.getBoolean(KEY_V66_CASTAUDIODOLBYATMOS, false)
        set(v) = prefs.edit().putBoolean(KEY_V66_CASTAUDIODOLBYATMOS, v).apply()

    // === v67.x ===
    // v67.1: Video Adaptive Temporal Blend

var AppPrefs.v67VideoAdaptiveTemporalBlend: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOADAPTIVETEMPORALBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOADAPTIVETEMPORALBLEND, v).apply()

    // v67.2: Danmaku Bottom Margin

var AppPrefs.v67DanmakuBottomMargin: Int
        get() = prefs.getInt(KEY_V67_DANMAKUBOTTOMMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V67_DANMAKUBOTTOMMARGIN, v).apply()

    // v67.3: Subtitle Animation Zoom

var AppPrefs.v67SubtitleAnimationZoom: Boolean
        get() = prefs.getBoolean(KEY_V67_SUBTITLEANIMATIONZOOM, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_SUBTITLEANIMATIONZOOM, v).apply()

    // v67.4: Gesture Custom Gesture 3

var AppPrefs.v67GestureCustomGesture3: Int
        get() = prefs.getInt(KEY_V67_GESTURECUSTOMGESTURE3, 0)
        set(v) = prefs.edit().putInt(KEY_V67_GESTURECUSTOMGESTURE3, v).apply()

    // v67.5: Video Color Tilt Shift

var AppPrefs.v67VideoColorTiltShift: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOCOLORTILTSHIFT, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOCOLORTILTSHIFT, v).apply()

    // v67.6: Danmaku Send Rate Per User

var AppPrefs.v67DanmakuSendRatePerUser: Int
        get() = prefs.getInt(KEY_V67_DANMAKUSENDRATEPERUSER, 0)
        set(v) = prefs.edit().putInt(KEY_V67_DANMAKUSENDRATEPERUSER, v).apply()

    // v67.7: Cast Video 3D

var AppPrefs.v67CastVideo3D: Boolean
        get() = prefs.getBoolean(KEY_V67_CASTVIDEO3D, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_CASTVIDEO3D, v).apply()

    // v67.8: Subtitle BG Gradient Direction

var AppPrefs.v67SubtitleBgGradientDirection: Int
        get() = prefs.getInt(KEY_V67_SUBTITLEBGGRADIENTDIRECTION, 0)
        set(v) = prefs.edit().putInt(KEY_V67_SUBTITLEBGGRADIENTDIRECTION, v).apply()

    // v67.9: Video Adaptive Spatial Blend

var AppPrefs.v67VideoAdaptiveSpatialBlend: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOADAPTIVESPATIALBLEND, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOADAPTIVESPATIALBLEND, v).apply()

    // v67.10: Danmaku Filter By Level

var AppPrefs.v67DanmakuFilterByLevel: Int
        get() = prefs.getInt(KEY_V67_DANMAKUFILTERBYLEVEL, 0)
        set(v) = prefs.edit().putInt(KEY_V67_DANMAKUFILTERBYLEVEL, v).apply()

    // v67.11: Playlist Auto Repeat Mode

var AppPrefs.v67PlaylistAutoRepeatMode: Int
        get() = prefs.getInt(KEY_V67_PLAYLISTAUTOREPEATMODE, 0)
        set(v) = prefs.edit().putInt(KEY_V67_PLAYLISTAUTOREPEATMODE, v).apply()

    // v67.12: Gesture Swipe Bounce

var AppPrefs.v67GestureSwipeBounce: Int
        get() = prefs.getInt(KEY_V67_GESTURESWIPEBOUNCE, 50)
        set(v) = prefs.edit().putInt(KEY_V67_GESTURESWIPEBOUNCE, v).apply()

    // v67.13: Video Color Cross Process

var AppPrefs.v67VideoColorCrossProcess: Boolean
        get() = prefs.getBoolean(KEY_V67_VIDEOCOLORCROSSPROCESS, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_VIDEOCOLORCROSSPROCESS, v).apply()

    // v67.14: Danmaku History Export Auto

var AppPrefs.v67DanmakuHistoryExportAuto: Boolean
        get() = prefs.getBoolean(KEY_V67_DANMAKUHISTORYEXPORTAUTO, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_DANMAKUHISTORYEXPORTAUTO, v).apply()

    // v67.15: Cast Audio Spatial

var AppPrefs.v67CastAudioSpatial: Boolean
        get() = prefs.getBoolean(KEY_V67_CASTAUDIOSPATIAL, false)
        set(v) = prefs.edit().putBoolean(KEY_V67_CASTAUDIOSPATIAL, v).apply()

    // === v68.x ===
    // v68.1: Video Adaptive Color Balance

var AppPrefs.v68VideoAdaptiveColorBalance: Boolean
        get() = prefs.getBoolean(KEY_V68_VIDEOADAPTIVECOLORBALANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_VIDEOADAPTIVECOLORBALANCE, v).apply()

    // v68.2: Danmaku Left Right Margin

var AppPrefs.v68DanmakuLeftRightMargin: Int
        get() = prefs.getInt(KEY_V68_DANMAKULEFTRIGHTMARGIN, 10)
        set(v) = prefs.edit().putInt(KEY_V68_DANMAKULEFTRIGHTMARGIN, v).apply()

    // v68.3: Subtitle Animation Rotate

var AppPrefs.v68SubtitleAnimationRotate: Boolean
        get() = prefs.getBoolean(KEY_V68_SUBTITLEANIMATIONROTATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_SUBTITLEANIMATIONROTATE, v).apply()

    // v68.4: Gesture Custom Gesture 4

var AppPrefs.v68GestureCustomGesture4: Int
        get() = prefs.getInt(KEY_V68_GESTURECUSTOMGESTURE4, 0)
        set(v) = prefs.edit().putInt(KEY_V68_GESTURECUSTOMGESTURE4, v).apply()

    // v68.5: Video Color Fisheye

var AppPrefs.v68VideoColorFisheye: Int
        get() = prefs.getInt(KEY_V68_VIDEOCOLORFISHEYE, 0)
        set(v) = prefs.edit().putInt(KEY_V68_VIDEOCOLORFISHEYE, v).apply()

    // v68.6: Danmaku Send Max Length Per Minute

var AppPrefs.v68DanmakuSendMaxLengthPerMinute: Int
        get() = prefs.getInt(KEY_V68_DANMAKUSENDMAXLENGTHPERMINUTE, 0)
        set(v) = prefs.edit().putInt(KEY_V68_DANMAKUSENDMAXLENGTHPERMINUTE, v).apply()

    // v68.7: Cast Video Surround

var AppPrefs.v68CastVideoSurround: Boolean
        get() = prefs.getBoolean(KEY_V68_CASTVIDEOSURROUND, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_CASTVIDEOSURROUND, v).apply()

    // v68.8: Subtitle BG Gradient Color

var AppPrefs.v68SubtitleBgGradientColor: Int
        get() = prefs.getInt(KEY_V68_SUBTITLEBGGRADIENTCOLOR, 0)
        set(v) = prefs.edit().putInt(KEY_V68_SUBTITLEBGGRADIENTCOLOR, v).apply()

    // v68.9: Video Adaptive Noise Reduce

var AppPrefs.v68VideoAdaptiveNoiseReduce: Boolean
        get() = prefs.getBoolean(KEY_V68_VIDEOADAPTIVENOISEREDUCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_VIDEOADAPTIVENOISEREDUCE, v).apply()

    // v68.10: Danmaku Filter By Title

var AppPrefs.v68DanmakuFilterByTitle: Boolean
        get() = prefs.getBoolean(KEY_V68_DANMAKUFILTERBYTITLE, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_DANMAKUFILTERBYTITLE, v).apply()

    // v68.11: Playlist Auto Next On End

var AppPrefs.v68PlaylistAutoNextOnEnd: Boolean
        get() = prefs.getBoolean(KEY_V68_PLAYLISTAUTONEXTONEND, true)
        set(v) = prefs.edit().putBoolean(KEY_V68_PLAYLISTAUTONEXTONEND, v).apply()

    // v68.12: Gesture Swipe Elastic

var AppPrefs.v68GestureSwipeElastic: Int
        get() = prefs.getInt(KEY_V68_GESTURESWIPEELASTIC, 50)
        set(v) = prefs.edit().putInt(KEY_V68_GESTURESWIPEELASTIC, v).apply()

    // v68.13: Video Color Chromatic Aberration

var AppPrefs.v68VideoColorChromaticAberration: Int
        get() = prefs.getInt(KEY_V68_VIDEOCOLORCHROMATICABERRATION, 0)
        set(v) = prefs.edit().putInt(KEY_V68_VIDEOCOLORCHROMATICABERRATION, v).apply()

    // v68.14: Danmaku History Import

var AppPrefs.v68DanmakuHistoryImport: Boolean
        get() = prefs.getBoolean(KEY_V68_DANMAKUHISTORYIMPORT, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_DANMAKUHISTORYIMPORT, v).apply()

    // v68.15: Cast Audio Surround

var AppPrefs.v68CastAudioSurround: Boolean
        get() = prefs.getBoolean(KEY_V68_CASTAUDIOSURROUND, false)
        set(v) = prefs.edit().putBoolean(KEY_V68_CASTAUDIOSURROUND, v).apply()

    // === v69.x ===
    // v69.1: Video Adaptive Detail Enhance

var AppPrefs.v69VideoAdaptiveDetailEnhance: Boolean
        get() = prefs.getBoolean(KEY_V69_VIDEOADAPTIVEDETAILENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_VIDEOADAPTIVEDETAILENHANCE, v).apply()

    // v69.2: Danmaku Line Spacing

var AppPrefs.v69DanmakuLineSpacing: Int
        get() = prefs.getInt(KEY_V69_DANMAKULINESPACING, 100)
        set(v) = prefs.edit().putInt(KEY_V69_DANMAKULINESPACING, v).apply()

    // v69.3: Subtitle Animation Typewriter

var AppPrefs.v69SubtitleAnimationTypewriter: Boolean
        get() = prefs.getBoolean(KEY_V69_SUBTITLEANIMATIONTYPEWRITER, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_SUBTITLEANIMATIONTYPEWRITER, v).apply()

    // v69.4: Gesture Custom Action 5

var AppPrefs.v69GestureCustomAction5: Int
        get() = prefs.getInt(KEY_V69_GESTURECUSTOMACTION5, 0)
        set(v) = prefs.edit().putInt(KEY_V69_GESTURECUSTOMACTION5, v).apply()

    // v69.5: Video Color Barrel Distortion

var AppPrefs.v69VideoColorBarrelDistortion: Int
        get() = prefs.getInt(KEY_V69_VIDEOCOLORBARRELDISTORTION, 0)
        set(v) = prefs.edit().putInt(KEY_V69_VIDEOCOLORBARRELDISTORTION, v).apply()

    // v69.6: Danmaku Send Max Length Total

var AppPrefs.v69DanmakuSendMaxLengthTotal: Int
        get() = prefs.getInt(KEY_V69_DANMAKUSENDMAXLENGTHTOTAL, 0)
        set(v) = prefs.edit().putInt(KEY_V69_DANMAKUSENDMAXLENGTHTOTAL, v).apply()

    // v69.7: Cast Video Multi View

var AppPrefs.v69CastVideoMultiView: Boolean
        get() = prefs.getBoolean(KEY_V69_CASTVIDEOMULTIVIEW, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_CASTVIDEOMULTIVIEW, v).apply()

    // v69.8: Subtitle BG Padding X

var AppPrefs.v69SubtitleBgPaddingX: Int
        get() = prefs.getInt(KEY_V69_SUBTITLEBGPADDINGX, 4)
        set(v) = prefs.edit().putInt(KEY_V69_SUBTITLEBGPADDINGX, v).apply()

    // v69.9: Video Adaptive Chroma Enhance

var AppPrefs.v69VideoAdaptiveChromaEnhance: Boolean
        get() = prefs.getBoolean(KEY_V69_VIDEOADAPTIVECHROMAENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_VIDEOADAPTIVECHROMAENHANCE, v).apply()

    // v69.10: Danmaku Filter By Content

var AppPrefs.v69DanmakuFilterByContent: Boolean
        get() = prefs.getBoolean(KEY_V69_DANMAKUFILTERBYCONTENT, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_DANMAKUFILTERBYCONTENT, v).apply()

    // v69.11: Playlist Auto Resume

var AppPrefs.v69PlaylistAutoResume: Boolean
        get() = prefs.getBoolean(KEY_V69_PLAYLISTAUTORESUME, true)
        set(v) = prefs.edit().putBoolean(KEY_V69_PLAYLISTAUTORESUME, v).apply()

    // v69.12: Gesture Swipe Rubber Band

var AppPrefs.v69GestureSwipeRubberBand: Int
        get() = prefs.getInt(KEY_V69_GESTURESWIPERUBBERBAND, 50)
        set(v) = prefs.edit().putInt(KEY_V69_GESTURESWIPERUBBERBAND, v).apply()

    // v69.13: Video Color Pincushion

var AppPrefs.v69VideoColorPincushion: Int
        get() = prefs.getInt(KEY_V69_VIDEOCOLORPINCUSHION, 0)
        set(v) = prefs.edit().putInt(KEY_V69_VIDEOCOLORPINCUSHION, v).apply()

    // v69.14: Danmaku History Clear

var AppPrefs.v69DanmakuHistoryClear: Boolean
        get() = prefs.getBoolean(KEY_V69_DANMAKUHISTORYCLEAR, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_DANMAKUHISTORYCLEAR, v).apply()

    // v69.15: Cast Audio Multi View

var AppPrefs.v69CastAudioMultiView: Boolean
        get() = prefs.getBoolean(KEY_V69_CASTAUDIOMULTIVIEW, false)
        set(v) = prefs.edit().putBoolean(KEY_V69_CASTAUDIOMULTIVIEW, v).apply()

    // === v70.x ===
    // v70.1: Video Adaptive Luma Enhance

var AppPrefs.v70VideoAdaptiveLumaEnhance: Boolean
        get() = prefs.getBoolean(KEY_V70_VIDEOADAPTIVELUMAENHANCE, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_VIDEOADAPTIVELUMAENHANCE, v).apply()

    // v70.2: Danmaku Character Spacing

var AppPrefs.v70DanmakuCharacterSpacing: Int
        get() = prefs.getInt(KEY_V70_DANMAKUCHARACTERSPACING, 0)
        set(v) = prefs.edit().putInt(KEY_V70_DANMAKUCHARACTERSPACING, v).apply()

    // v70.3: Subtitle Animation Highlight

var AppPrefs.v70SubtitleAnimationHighlight: Boolean
        get() = prefs.getBoolean(KEY_V70_SUBTITLEANIMATIONHIGHLIGHT, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_SUBTITLEANIMATIONHIGHLIGHT, v).apply()

    // v70.4: Gesture Custom Action 6

var AppPrefs.v70GestureCustomAction6: Int
        get() = prefs.getInt(KEY_V70_GESTURECUSTOMACTION6, 0)
        set(v) = prefs.edit().putInt(KEY_V70_GESTURECUSTOMACTION6, v).apply()

    // v70.5: Video Color Wave Distortion

var AppPrefs.v70VideoColorWaveDistortion: Int
        get() = prefs.getInt(KEY_V70_VIDEOCOLORWAVEDISTORTION, 0)
        set(v) = prefs.edit().putInt(KEY_V70_VIDEOCOLORWAVEDISTORTION, v).apply()

    // v70.6: Danmaku Send Max Length VIP

var AppPrefs.v70DanmakuSendMaxLengthVIP: Int
        get() = prefs.getInt(KEY_V70_DANMAKUSENDMAXLENGTHVIP, 0)
        set(v) = prefs.edit().putInt(KEY_V70_DANMAKUSENDMAXLENGTHVIP, v).apply()

    // v70.7: Cast Video Multi Screen

var AppPrefs.v70CastVideoMultiScreen: Boolean
        get() = prefs.getBoolean(KEY_V70_CASTVIDEOMULTISCREEN, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_CASTVIDEOMULTISCREEN, v).apply()

    // v70.8: Subtitle BG Padding Y

var AppPrefs.v70SubtitleBgPaddingY: Int
        get() = prefs.getInt(KEY_V70_SUBTITLEBGPADDINGY, 2)
        set(v) = prefs.edit().putInt(KEY_V70_SUBTITLEBGPADDINGY, v).apply()

    // v70.9: Video Adaptive Color Enhance Curve

var AppPrefs.v70VideoAdaptiveColorEnhanceCurve: Int
        get() = prefs.getInt(KEY_V70_VIDEOADAPTIVECOLORENHANCECURVE, 0)
        set(v) = prefs.edit().putInt(KEY_V70_VIDEOADAPTIVECOLORENHANCECURVE, v).apply()

    // v70.10: Danmaku Filter By Gift

var AppPrefs.v70DanmakuFilterByGift: Boolean
        get() = prefs.getBoolean(KEY_V70_DANMAKUFILTERBYGIFT, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_DANMAKUFILTERBYGIFT, v).apply()

    // v70.11: Playlist Auto Create

var AppPrefs.v70PlaylistAutoCreate: Boolean
        get() = prefs.getBoolean(KEY_V70_PLAYLISTAUTOCREATE, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_PLAYLISTAUTOCREATE, v).apply()

    // v70.12: Gesture Swipe Spring

var AppPrefs.v70GestureSwipeSpring: Int
        get() = prefs.getInt(KEY_V70_GESTURESWIPESPRING, 50)
        set(v) = prefs.edit().putInt(KEY_V70_GESTURESWIPESPRING, v).apply()

    // v70.13: Video Color Glitch

var AppPrefs.v70VideoColorGlitch: Int
        get() = prefs.getInt(KEY_V70_VIDEOCOLORGLITCH, 0)
        set(v) = prefs.edit().putInt(KEY_V70_VIDEOCOLORGLITCH, v).apply()

    // v70.14: Danmaku History Stats

var AppPrefs.v70DanmakuHistoryStats: Boolean
        get() = prefs.getBoolean(KEY_V70_DANMAKUHISTORYSTATS, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_DANMAKUHISTORYSTATS, v).apply()

    // v70.15: Cast Audio Multi Screen

var AppPrefs.v70CastAudioMultiScreen: Boolean
        get() = prefs.getBoolean(KEY_V70_CASTAUDIOMULTISCREEN, false)
        set(v) = prefs.edit().putBoolean(KEY_V70_CASTAUDIOMULTISCREEN, v).apply()


// ==================== v71-v80 New Unique Features ====================


var AppPrefs.v71VideoStabilizationStrength: Int
        get() = prefs.getInt(KEY_V71VIDEOSTABILIZATIONSTRENGTH, 50)
        set(value) = prefs.edit().putInt(KEY_V71VIDEOSTABILIZATIONSTRENGTH, value).apply()


var AppPrefs.v71DanmakuCollisionAvoidance: Boolean
        get() = prefs.getBoolean(KEY_V71DANMAKUCOLLISIONAVOIDANCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V71DANMAKUCOLLISIONAVOIDANCE, value).apply()


var AppPrefs.v71SubtitleWordWrapMode: Int
        get() = prefs.getInt(KEY_V71SUBTITLEWORDWRAPMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V71SUBTITLEWORDWRAPMODE, value).apply()


var AppPrefs.v71GestureSensitivityProfile: Int
        get() = prefs.getInt(KEY_V71GESTURESENSITIVITYPROFILE, 0)
        set(value) = prefs.edit().putInt(KEY_V71GESTURESENSITIVITYPROFILE, value).apply()


var AppPrefs.v71CastVideoStabilization: Boolean
        get() = prefs.getBoolean(KEY_V71CASTVIDEOSTABILIZATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V71CASTVIDEOSTABILIZATION, value).apply()


var AppPrefs.v71PlaylistAutoRecover: Boolean
        get() = prefs.getBoolean(KEY_V71PLAYLISTAUTORECOVER, true)
        set(value) = prefs.edit().putBoolean(KEY_V71PLAYLISTAUTORECOVER, value).apply()


var AppPrefs.v71CacheIntegrityCheck: Boolean
        get() = prefs.getBoolean(KEY_V71CACHEINTEGRITYCHECK, false)
        set(value) = prefs.edit().putBoolean(KEY_V71CACHEINTEGRITYCHECK, value).apply()


var AppPrefs.v71ProgressBarChapterMarks: Boolean
        get() = prefs.getBoolean(KEY_V71PROGRESSBARCHAPTERMARKS, true)
        set(value) = prefs.edit().putBoolean(KEY_V71PROGRESSBARCHAPTERMARKS, value).apply()


var AppPrefs.v71VolumeNormalizationAuto: Boolean
        get() = prefs.getBoolean(KEY_V71VOLUMENORMALIZATIONAUTO, false)
        set(value) = prefs.edit().putBoolean(KEY_V71VOLUMENORMALIZATIONAUTO, value).apply()


var AppPrefs.v71HistoryAutoSync: Boolean
        get() = prefs.getBoolean(KEY_V71HISTORYAUTOSYNC, false)
        set(value) = prefs.edit().putBoolean(KEY_V71HISTORYAUTOSYNC, value).apply()


var AppPrefs.v71PlaybackResumeFromBookmark: Boolean
        get() = prefs.getBoolean(KEY_V71PLAYBACKRESUMEFROMBOOKMARK, false)
        set(value) = prefs.edit().putBoolean(KEY_V71PLAYBACKRESUMEFROMBOOKMARK, value).apply()


var AppPrefs.v71ScreenshotAutoAnnotate: Boolean
        get() = prefs.getBoolean(KEY_V71SCREENSHOTAUTOANNOTATE, false)
        set(value) = prefs.edit().putBoolean(KEY_V71SCREENSHOTAUTOANNOTATE, value).apply()


var AppPrefs.v71VideoHDR10Plus: Boolean
        get() = prefs.getBoolean(KEY_V71VIDEOHDR10PLUS, false)
        set(value) = prefs.edit().putBoolean(KEY_V71VIDEOHDR10PLUS, value).apply()


var AppPrefs.v71DanmakuLayerManagement: Int
        get() = prefs.getInt(KEY_V71DANMAKULAYERMANAGEMENT, 0)
        set(value) = prefs.edit().putInt(KEY_V71DANMAKULAYERMANAGEMENT, value).apply()


var AppPrefs.v71SubtitleLineSpacingCustom: Int
        get() = prefs.getInt(KEY_V71SUBTITLELINESPACINGCUSTOM, 100)
        set(value) = prefs.edit().putInt(KEY_V71SUBTITLELINESPACINGCUSTOM, value).apply()


var AppPrefs.v72VideoFrameRateConvert: Int
        get() = prefs.getInt(KEY_V72VIDEOFRAMERATECONVERT, 0)
        set(value) = prefs.edit().putInt(KEY_V72VIDEOFRAMERATECONVERT, value).apply()


var AppPrefs.v72DanmakuPrioritySystem: Int
        get() = prefs.getInt(KEY_V72DANMAKUPRIORITYSYSTEM, 0)
        set(value) = prefs.edit().putInt(KEY_V72DANMAKUPRIORITYSYSTEM, value).apply()


var AppPrefs.v72SubtitleCharSpacingCustom: Int
        get() = prefs.getInt(KEY_V72SUBTITLECHARSPACINGCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V72SUBTITLECHARSPACINGCUSTOM, value).apply()


var AppPrefs.v72GestureDeadZoneCustom: Int
        get() = prefs.getInt(KEY_V72GESTUREDEADZONECUSTOM, 10)
        set(value) = prefs.edit().putInt(KEY_V72GESTUREDEADZONECUSTOM, value).apply()


var AppPrefs.v72CastAudioNormalization: Boolean
        get() = prefs.getBoolean(KEY_V72CASTAUDIONORMALIZATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V72CASTAUDIONORMALIZATION, value).apply()


var AppPrefs.v72PlaylistAutoRecoverMode: Int
        get() = prefs.getInt(KEY_V72PLAYLISTAUTORECOVERMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V72PLAYLISTAUTORECOVERMODE, value).apply()


var AppPrefs.v72CacheDeduplication: Boolean
        get() = prefs.getBoolean(KEY_V72CACHEDEDUPLICATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V72CACHEDEDUPLICATION, value).apply()


var AppPrefs.v72ProgressBarBufferIndicator: Boolean
        get() = prefs.getBoolean(KEY_V72PROGRESSBARBUFFERINDICATOR, true)
        set(value) = prefs.edit().putBoolean(KEY_V72PROGRESSBARBUFFERINDICATOR, value).apply()


var AppPrefs.v72VolumeCompressionStrength: Int
        get() = prefs.getInt(KEY_V72VOLUMECOMPRESSIONSTRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V72VOLUMECOMPRESSIONSTRENGTH, value).apply()


var AppPrefs.v72HistoryAutoBackup: Boolean
        get() = prefs.getBoolean(KEY_V72HISTORYAUTOBACKUP, false)
        set(value) = prefs.edit().putBoolean(KEY_V72HISTORYAUTOBACKUP, value).apply()


var AppPrefs.v72PlaybackAutoBookmark: Boolean
        get() = prefs.getBoolean(KEY_V72PLAYBACKAUTOBOOKMARK, false)
        set(value) = prefs.edit().putBoolean(KEY_V72PLAYBACKAUTOBOOKMARK, value).apply()


var AppPrefs.v72ScreenshotAutoShare: Boolean
        get() = prefs.getBoolean(KEY_V72SCREENSHOTAUTOSHARE, false)
        set(value) = prefs.edit().putBoolean(KEY_V72SCREENSHOTAUTOSHARE, value).apply()


var AppPrefs.v72VideoDolbyVisionProfile: Int
        get() = prefs.getInt(KEY_V72VIDEODOLBYVISIONPROFILE, 0)
        set(value) = prefs.edit().putInt(KEY_V72VIDEODOLBYVISIONPROFILE, value).apply()


var AppPrefs.v72DanmakuAnimationEffects: Int
        get() = prefs.getInt(KEY_V72DANMAKUANIMATIONEFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V72DANMAKUANIMATIONEFFECTS, value).apply()


var AppPrefs.v72SubtitleBgGradientCustom: Boolean
        get() = prefs.getBoolean(KEY_V72SUBTITLEBGGRADIENTCUSTOM, false)
        set(value) = prefs.edit().putBoolean(KEY_V72SUBTITLEBGGRADIENTCUSTOM, value).apply()


var AppPrefs.v73VideoColorSpaceConvert: Int
        get() = prefs.getInt(KEY_V73VIDEOCOLORSPACECONVERT, 0)
        set(value) = prefs.edit().putInt(KEY_V73VIDEOCOLORSPACECONVERT, value).apply()


var AppPrefs.v73DanmakuScrollDirectionCustom: Int
        get() = prefs.getInt(KEY_V73DANMAKUSCROLLDIRECTIONCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V73DANMAKUSCROLLDIRECTIONCUSTOM, value).apply()


var AppPrefs.v73SubtitleAnimationCustom: Int
        get() = prefs.getInt(KEY_V73SUBTITLEANIMATIONCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V73SUBTITLEANIMATIONCUSTOM, value).apply()


var AppPrefs.v73GestureFeedbackMode: Int
        get() = prefs.getInt(KEY_V73GESTUREFEEDBACKMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V73GESTUREFEEDBACKMODE, value).apply()


var AppPrefs.v73CastVideoColorSpace: Int
        get() = prefs.getInt(KEY_V73CASTVIDEOCOLORSPACE, 0)
        set(value) = prefs.edit().putInt(KEY_V73CASTVIDEOCOLORSPACE, value).apply()


var AppPrefs.v73PlaylistAutoRecoverPriority: Int
        get() = prefs.getInt(KEY_V73PLAYLISTAUTORECOVERPRIORITY, 0)
        set(value) = prefs.edit().putInt(KEY_V73PLAYLISTAUTORECOVERPRIORITY, value).apply()


var AppPrefs.v73CacheVerificationMode: Int
        get() = prefs.getInt(KEY_V73CACHEVERIFICATIONMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V73CACHEVERIFICATIONMODE, value).apply()


var AppPrefs.v73ProgressBarThumbStyle: Int
        get() = prefs.getInt(KEY_V73PROGRESSBARTHUMBSTYLE, 0)
        set(value) = prefs.edit().putInt(KEY_V73PROGRESSBARTHUMBSTYLE, value).apply()


var AppPrefs.v73VolumeExpansionStrength: Int
        get() = prefs.getInt(KEY_V73VOLUMEEXPANSIONSTRENGTH, 0)
        set(value) = prefs.edit().putInt(KEY_V73VOLUMEEXPANSIONSTRENGTH, value).apply()


var AppPrefs.v73HistoryAutoSyncMode: Int
        get() = prefs.getInt(KEY_V73HISTORYAUTOSYNCMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V73HISTORYAUTOSYNCMODE, value).apply()


var AppPrefs.v73PlaybackAutoBookmarkMode: Int
        get() = prefs.getInt(KEY_V73PLAYBACKAUTOBOOKMARKMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V73PLAYBACKAUTOBOOKMARKMODE, value).apply()


var AppPrefs.v73ScreenshotAutoEdit: Boolean
        get() = prefs.getBoolean(KEY_V73SCREENSHOTAUTOEDIT, false)
        set(value) = prefs.edit().putBoolean(KEY_V73SCREENSHOTAUTOEDIT, value).apply()


var AppPrefs.v73VideoAlphaChannel: Boolean
        get() = prefs.getBoolean(KEY_V73VIDEOALPHACHANNEL, false)
        set(value) = prefs.edit().putBoolean(KEY_V73VIDEOALPHACHANNEL, value).apply()


var AppPrefs.v73DanmakuFontWeightAdaptive: Boolean
        get() = prefs.getBoolean(KEY_V73DANMAKUFONTWEIGHTADAPTIVE, false)
        set(value) = prefs.edit().putBoolean(KEY_V73DANMAKUFONTWEIGHTADAPTIVE, value).apply()


var AppPrefs.v73SubtitleOutlineEffects: Int
        get() = prefs.getInt(KEY_V73SUBTITLEOUTLINEEFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V73SUBTITLEOUTLINEEFFECTS, value).apply()


var AppPrefs.v74VideoDepthOfField: Boolean
        get() = prefs.getBoolean(KEY_V74VIDEODEPTHOFFIELD, false)
        set(value) = prefs.edit().putBoolean(KEY_V74VIDEODEPTHOFFIELD, value).apply()


var AppPrefs.v74DanmakuBackgroundBlur: Int
        get() = prefs.getInt(KEY_V74DANMAKUBACKGROUNDBLUR, 0)
        set(value) = prefs.edit().putInt(KEY_V74DANMAKUBACKGROUNDBLUR, value).apply()


var AppPrefs.v74SubtitleShadowEffects: Int
        get() = prefs.getInt(KEY_V74SUBTITLESHADOWEFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V74SUBTITLESHADOWEFFECTS, value).apply()


var AppPrefs.v74GestureAnimationMode: Int
        get() = prefs.getInt(KEY_V74GESTUREANIMATIONMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V74GESTUREANIMATIONMODE, value).apply()


var AppPrefs.v74CastVideoHDR10Plus: Boolean
        get() = prefs.getBoolean(KEY_V74CASTVIDEOHDR10PLUS, false)
        set(value) = prefs.edit().putBoolean(KEY_V74CASTVIDEOHDR10PLUS, value).apply()


var AppPrefs.v74PlaylistAutoRecoverTime: Int
        get() = prefs.getInt(KEY_V74PLAYLISTAUTORECOVERTIME, 0)
        set(value) = prefs.edit().putInt(KEY_V74PLAYLISTAUTORECOVERTIME, value).apply()


var AppPrefs.v74CacheCompressionMode: Int
        get() = prefs.getInt(KEY_V74CACHECOMPRESSIONMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V74CACHECOMPRESSIONMODE, value).apply()


var AppPrefs.v74ProgressBarSeekPreview: Boolean
        get() = prefs.getBoolean(KEY_V74PROGRESSBARSEEKPREVIEW, true)
        set(value) = prefs.edit().putBoolean(KEY_V74PROGRESSBARSEEKPREVIEW, value).apply()


var AppPrefs.v74VolumeEqualizerPreset: Int
        get() = prefs.getInt(KEY_V74VOLUMEEQUALIZERPRESET, 0)
        set(value) = prefs.edit().putInt(KEY_V74VOLUMEEQUALIZERPRESET, value).apply()


var AppPrefs.v74HistoryAutoBackupMode: Int
        get() = prefs.getInt(KEY_V74HISTORYAUTOBACKUPMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V74HISTORYAUTOBACKUPMODE, value).apply()


var AppPrefs.v74PlaybackAutoPauseOnFocus: Boolean
        get() = prefs.getBoolean(KEY_V74PLAYBACKAUTOPAUSEONFOCUS, false)
        set(value) = prefs.edit().putBoolean(KEY_V74PLAYBACKAUTOPAUSEONFOCUS, value).apply()


var AppPrefs.v74ScreenshotAutoCrop: Boolean
        get() = prefs.getBoolean(KEY_V74SCREENSHOTAUTOCROP, false)
        set(value) = prefs.edit().putBoolean(KEY_V74SCREENSHOTAUTOCROP, value).apply()


var AppPrefs.v74VideoBokehEffect: Boolean
        get() = prefs.getBoolean(KEY_V74VIDEOBOKEHEFFECT, false)
        set(value) = prefs.edit().putBoolean(KEY_V74VIDEOBOKEHEFFECT, value).apply()


var AppPrefs.v74DanmakuShadowEffects: Int
        get() = prefs.getInt(KEY_V74DANMAKUSHADOWEFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V74DANMAKUSHADOWEFFECTS, value).apply()


var AppPrefs.v74SubtitleGlowEffects: Int
        get() = prefs.getInt(KEY_V74SUBTITLEGLOWEFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V74SUBTITLEGLOWEFFECTS, value).apply()


var AppPrefs.v75VideoChromaKey: Boolean
        get() = prefs.getBoolean(KEY_V75VIDEOCHROMAKEY, false)
        set(value) = prefs.edit().putBoolean(KEY_V75VIDEOCHROMAKEY, value).apply()


var AppPrefs.v75DanmakuGlowEffects: Int
        get() = prefs.getInt(KEY_V75DANMAKUGLOWEFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V75DANMAKUGLOWEFFECTS, value).apply()


var AppPrefs.v75SubtitleBorderEffects: Int
        get() = prefs.getInt(KEY_V75SUBTITLEBORDEREFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V75SUBTITLEBORDEREFFECTS, value).apply()


var AppPrefs.v75GestureSoundFeedback: Boolean
        get() = prefs.getBoolean(KEY_V75GESTURESOUNDFEEDBACK, false)
        set(value) = prefs.edit().putBoolean(KEY_V75GESTURESOUNDFEEDBACK, value).apply()


var AppPrefs.v75CastAudioSpatial: Boolean
        get() = prefs.getBoolean(KEY_V75CASTAUDIOSPATIAL, false)
        set(value) = prefs.edit().putBoolean(KEY_V75CASTAUDIOSPATIAL, value).apply()


var AppPrefs.v75PlaylistAutoRecoverSource: Int
        get() = prefs.getInt(KEY_V75PLAYLISTAUTORECOVERSOURCE, 0)
        set(value) = prefs.edit().putInt(KEY_V75PLAYLISTAUTORECOVERSOURCE, value).apply()


var AppPrefs.v75CacheEncryptionMode: Int
        get() = prefs.getInt(KEY_V75CACHEENCRYPTIONMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V75CACHEENCRYPTIONMODE, value).apply()


var AppPrefs.v75ProgressBarChapterPreview: Boolean
        get() = prefs.getBoolean(KEY_V75PROGRESSBARCHAPTERPREVIEW, true)
        set(value) = prefs.edit().putBoolean(KEY_V75PROGRESSBARCHAPTERPREVIEW, value).apply()


var AppPrefs.v75VolumeSpatialAudio: Boolean
        get() = prefs.getBoolean(KEY_V75VOLUMESPATIALAUDIO, false)
        set(value) = prefs.edit().putBoolean(KEY_V75VOLUMESPATIALAUDIO, value).apply()


var AppPrefs.v75HistoryAutoRestore: Boolean
        get() = prefs.getBoolean(KEY_V75HISTORYAUTORESTORE, false)
        set(value) = prefs.edit().putBoolean(KEY_V75HISTORYAUTORESTORE, value).apply()


var AppPrefs.v75PlaybackAutoResumeOnReturn: Boolean
        get() = prefs.getBoolean(KEY_V75PLAYBACKAUTORESUMEONRETURN, true)
        set(value) = prefs.edit().putBoolean(KEY_V75PLAYBACKAUTORESUMEONRETURN, value).apply()


var AppPrefs.v75ScreenshotAutoFilter: Boolean
        get() = prefs.getBoolean(KEY_V75SCREENSHOTAUTOFILTER, false)
        set(value) = prefs.edit().putBoolean(KEY_V75SCREENSHOTAUTOFILTER, value).apply()


var AppPrefs.v75VideoFrameBlend: Boolean
        get() = prefs.getBoolean(KEY_V75VIDEOFRAMEBLEND, false)
        set(value) = prefs.edit().putBoolean(KEY_V75VIDEOFRAMEBLEND, value).apply()


var AppPrefs.v75DanmakuBorderEffects: Int
        get() = prefs.getInt(KEY_V75DANMAKUBORDEREFFECTS, 0)
        set(value) = prefs.edit().putInt(KEY_V75DANMAKUBORDEREFFECTS, value).apply()


var AppPrefs.v75SubtitleAnimationSpeed: Int
        get() = prefs.getInt(KEY_V75SUBTITLEANIMATIONSPEED, 100)
        set(value) = prefs.edit().putInt(KEY_V75SUBTITLEANIMATIONSPEED, value).apply()


var AppPrefs.v76VideoColorGradingPreset: Int
        get() = prefs.getInt(KEY_V76VIDEOCOLORGRADINGPRESET, 0)
        set(value) = prefs.edit().putInt(KEY_V76VIDEOCOLORGRADINGPRESET, value).apply()


var AppPrefs.v76DanmakuFontStyleCustom: Int
        get() = prefs.getInt(KEY_V76DANMAKUFONTSTYLECUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V76DANMAKUFONTSTYLECUSTOM, value).apply()


var AppPrefs.v76SubtitleFontStyleCustom: Int
        get() = prefs.getInt(KEY_V76SUBTITLEFONTSTYLECUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V76SUBTITLEFONTSTYLECUSTOM, value).apply()


var AppPrefs.v76GestureVibrationFeedback: Boolean
        get() = prefs.getBoolean(KEY_V76GESTUREVIBRATIONFEEDBACK, true)
        set(value) = prefs.edit().putBoolean(KEY_V76GESTUREVIBRATIONFEEDBACK, value).apply()


var AppPrefs.v76CastVideoDolbyAtmos: Boolean
        get() = prefs.getBoolean(KEY_V76CASTVIDEODOLBYATMOS, false)
        set(value) = prefs.edit().putBoolean(KEY_V76CASTVIDEODOLBYATMOS, value).apply()


var AppPrefs.v76PlaylistAutoRecoverStrategy: Int
        get() = prefs.getInt(KEY_V76PLAYLISTAUTORECOVERSTRATEGY, 0)
        set(value) = prefs.edit().putInt(KEY_V76PLAYLISTAUTORECOVERSTRATEGY, value).apply()


var AppPrefs.v76CacheLocationMode: Int
        get() = prefs.getInt(KEY_V76CACHELOCATIONMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V76CACHELOCATIONMODE, value).apply()


var AppPrefs.v76ProgressBarBufferColor: Int
        get() = prefs.getInt(KEY_V76PROGRESSBARBUFFERCOLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V76PROGRESSBARBUFFERCOLOR, value).apply()


var AppPrefs.v76Volume3DAudio: Boolean
        get() = prefs.getBoolean(KEY_V76VOLUME3DAUDIO, false)
        set(value) = prefs.edit().putBoolean(KEY_V76VOLUME3DAUDIO, value).apply()


var AppPrefs.v76HistoryAutoSyncSource: Int
        get() = prefs.getInt(KEY_V76HISTORYAUTOSYNCSOURCE, 0)
        set(value) = prefs.edit().putInt(KEY_V76HISTORYAUTOSYNCSOURCE, value).apply()


var AppPrefs.v76PlaybackAutoSkipSilence: Boolean
        get() = prefs.getBoolean(KEY_V76PLAYBACKAUTOSKIPSILENCE, false)
        set(value) = prefs.edit().putBoolean(KEY_V76PLAYBACKAUTOSKIPSILENCE, value).apply()


var AppPrefs.v76ScreenshotAutoAnnotateMode: Int
        get() = prefs.getInt(KEY_V76SCREENSHOTAUTOANNOTATEMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V76SCREENSHOTAUTOANNOTATEMODE, value).apply()


var AppPrefs.v76VideoLUTCustom: Boolean
        get() = prefs.getBoolean(KEY_V76VIDEOLUTCUSTOM, false)
        set(value) = prefs.edit().putBoolean(KEY_V76VIDEOLUTCUSTOM, value).apply()


var AppPrefs.v76DanmakuFontCustomPath: Boolean
        get() = prefs.getBoolean(KEY_V76DANMAKUFONTCUSTOMPATH, false)
        set(value) = prefs.edit().putBoolean(KEY_V76DANMAKUFONTCUSTOMPATH, value).apply()


var AppPrefs.v76SubtitleFontWeightCustom: Int
        get() = prefs.getInt(KEY_V76SUBTITLEFONTWEIGHTCUSTOM, 400)
        set(value) = prefs.edit().putInt(KEY_V76SUBTITLEFONTWEIGHTCUSTOM, value).apply()


var AppPrefs.v77VideoFrameInterpolation: Boolean
        get() = prefs.getBoolean(KEY_V77VIDEOFRAMEINTERPOLATION, false)
        set(value) = prefs.edit().putBoolean(KEY_V77VIDEOFRAMEINTERPOLATION, value).apply()


var AppPrefs.v77DanmakuPriorityCustom: Int
        get() = prefs.getInt(KEY_V77DANMAKUPRIORITYCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V77DANMAKUPRIORITYCUSTOM, value).apply()


var AppPrefs.v77SubtitleKerningCustom: Int
        get() = prefs.getInt(KEY_V77SUBTITLEKERNINGCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V77SUBTITLEKERNINGCUSTOM, value).apply()


var AppPrefs.v77GestureVisualFeedback: Boolean
        get() = prefs.getBoolean(KEY_V77GESTUREVISUALFEEDBACK, true)
        set(value) = prefs.edit().putBoolean(KEY_V77GESTUREVISUALFEEDBACK, value).apply()


var AppPrefs.v77CastAudio3D: Boolean
        get() = prefs.getBoolean(KEY_V77CASTAUDIO3D, false)
        set(value) = prefs.edit().putBoolean(KEY_V77CASTAUDIO3D, value).apply()


var AppPrefs.v77PlaylistAutoRecoverLimit: Int
        get() = prefs.getInt(KEY_V77PLAYLISTAUTORECOVERLIMIT, 10)
        set(value) = prefs.edit().putInt(KEY_V77PLAYLISTAUTORECOVERLIMIT, value).apply()


var AppPrefs.v77CachePriorityMode: Int
        get() = prefs.getInt(KEY_V77CACHEPRIORITYMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V77CACHEPRIORITYMODE, value).apply()


var AppPrefs.v77ProgressBarThumbColor: Int
        get() = prefs.getInt(KEY_V77PROGRESSBARTHUMBCOLOR, 0)
        set(value) = prefs.edit().putInt(KEY_V77PROGRESSBARTHUMBCOLOR, value).apply()


var AppPrefs.v77VolumeAutoLeveling: Boolean
        get() = prefs.getBoolean(KEY_V77VOLUMEAUTOLEVELING, false)
        set(value) = prefs.edit().putBoolean(KEY_V77VOLUMEAUTOLEVELING, value).apply()


var AppPrefs.v77HistoryAutoBackupSource: Int
        get() = prefs.getInt(KEY_V77HISTORYAUTOBACKUPSOURCE, 0)
        set(value) = prefs.edit().putInt(KEY_V77HISTORYAUTOBACKUPSOURCE, value).apply()


var AppPrefs.v77PlaybackAutoSkipIntroCustom: Int
        get() = prefs.getInt(KEY_V77PLAYBACKAUTOSKIPINTROCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V77PLAYBACKAUTOSKIPINTROCUSTOM, value).apply()


var AppPrefs.v77ScreenshotAutoShareMode: Int
        get() = prefs.getInt(KEY_V77SCREENSHOTAUTOSHAREMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V77SCREENSHOTAUTOSHAREMODE, value).apply()


var AppPrefs.v77VideoMotionBlur: Boolean
        get() = prefs.getBoolean(KEY_V77VIDEOMOTIONBLUR, false)
        set(value) = prefs.edit().putBoolean(KEY_V77VIDEOMOTIONBLUR, value).apply()


var AppPrefs.v77DanmakuLayerCustom: Int
        get() = prefs.getInt(KEY_V77DANMAKULAYERCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V77DANMAKULAYERCUSTOM, value).apply()


var AppPrefs.v77SubtitleLetterSpacingCustom: Int
        get() = prefs.getInt(KEY_V77SUBTITLELETTERSPACINGCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V77SUBTITLELETTERSPACINGCUSTOM, value).apply()


var AppPrefs.v78VideoAdaptiveResolution: Boolean
        get() = prefs.getBoolean(KEY_V78VIDEOADAPTIVERESOLUTION, false)
        set(value) = prefs.edit().putBoolean(KEY_V78VIDEOADAPTIVERESOLUTION, value).apply()


var AppPrefs.v78DanmakuCollisionMode: Int
        get() = prefs.getInt(KEY_V78DANMAKUCOLLISIONMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V78DANMAKUCOLLISIONMODE, value).apply()


var AppPrefs.v78SubtitleAnimationDelay: Int
        get() = prefs.getInt(KEY_V78SUBTITLEANIMATIONDELAY, 0)
        set(value) = prefs.edit().putInt(KEY_V78SUBTITLEANIMATIONDELAY, value).apply()


var AppPrefs.v78GestureLongPressDuration: Int
        get() = prefs.getInt(KEY_V78GESTURELONGPRESSDURATION, 500)
        set(value) = prefs.edit().putInt(KEY_V78GESTURELONGPRESSDURATION, value).apply()


var AppPrefs.v78CastVideoDolbyVisionIQ: Boolean
        get() = prefs.getBoolean(KEY_V78CASTVIDEODOLBYVISIONIQ, false)
        set(value) = prefs.edit().putBoolean(KEY_V78CASTVIDEODOLBYVISIONIQ, value).apply()


var AppPrefs.v78PlaylistAutoRecoverTimeLimit: Int
        get() = prefs.getInt(KEY_V78PLAYLISTAUTORECOVERTIMELIMIT, 0)
        set(value) = prefs.edit().putInt(KEY_V78PLAYLISTAUTORECOVERTIMELIMIT, value).apply()


var AppPrefs.v78CacheSizeLimitCustom: Int
        get() = prefs.getInt(KEY_V78CACHESIZELIMITCUSTOM, 0)
        set(value) = prefs.edit().putInt(KEY_V78CACHESIZELIMITCUSTOM, value).apply()


var AppPrefs.v78ProgressBarThumbOpacity: Int
        get() = prefs.getInt(KEY_V78PROGRESSBARTHUMBOPACITY, 100)
        set(value) = prefs.edit().putInt(KEY_V78PROGRESSBARTHUMBOPACITY, value).apply()


var AppPrefs.v78VolumeAutoLevelingMode: Int
        get() = prefs.getInt(KEY_V78VOLUMEAUTOLEVELINGMODE, 0)
        set(value) = prefs.edit().putInt(KEY_V78VOLUMEAUTOLEVELINGMODE, value).apply()


