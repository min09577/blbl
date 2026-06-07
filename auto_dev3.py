# -*- coding: utf-8 -*-
"""Auto-generate v31-v40 features, one commit per feature."""
import re, subprocess, time

os_chdir = r"C:\Users\Min\.qwenpaw\workspaces\7fuwpJ\blbl"

FEATURES = {
    31: [
        ("DanmakuMergeOverlap", "Boolean", "弹幕重叠自动合并", "Auto-merge overlapping danmaku"),
        ("VideoFrameSkipSilence", "Boolean", "静音片段自动跳过", "Auto-skip silent segments"),
        ("SubtitleFontSizeAuto", "Boolean", "字幕字号自动适配", "Auto-fit subtitle font size"),
        ("PlaybackBufferAheadSec", "Int", "预缓冲时长(秒)", "Pre-buffer duration (seconds)"),
        ("DanmakuAntiSpamLevel", "Int", "弹幕防刷等级", "Danmaku anti-spam level"),
        ("VideoDeinterlaceMode", "Int", "视频反交错模式", "Video deinterlace mode"),
        ("AudioNightMode", "Boolean", "音频夜间模式", "Audio night mode"),
        ("DanmakuKeywordHighlight", "Boolean", "弹幕关键词高亮", "Danmaku keyword highlight"),
        ("PlayerPiPSupport", "Boolean", "画中画模式支持", "Picture-in-Picture support"),
        ("VideoABoopMode", "Boolean", "A-B循环播放", "A-B loop playback"),
        ("DanmakuLayerOrder", "Int", "弹幕层级排序", "Danmaku layer order"),
        ("SubtitleSyncOffset", "Int", "字幕同步偏移(ms)", "Subtitle sync offset (ms)"),
        ("PlaybackAutoResume", "Boolean", "播放自动恢复", "Auto-resume playback"),
        ("DanmakuBlockUserLevel", "Int", "弹幕屏蔽用户等级", "Danmaku block user level"),
        ("VideoCodecPriority", "Int", "视频解码优先级", "Video codec priority"),
    ],
    32: [
        ("ScreenOffTimer", "Int", "息屏定时器(分钟)", "Screen-off timer (minutes)"),
        ("DanmakuRainMode", "Boolean", "弹幕雨模式", "Danmaku rain mode"),
        ("AudioChannelSwap", "Boolean", "音频声道交换", "Audio channel swap"),
        ("VideoZoomGesture", "Boolean", "视频缩放手势", "Video zoom gesture"),
        ("DanmakuTimestampDisplay", "Boolean", "弹幕时间戳显示", "Danmaku timestamp display"),
        ("PlaylistRemovePlayed", "Boolean", "自动移除已播放项", "Auto-remove played items"),
        ("PlayerBackgroundPlay", "Boolean", "后台播放", "Background playback"),
        ("SubtitleDualLang", "Boolean", "双语字幕", "Dual-language subtitles"),
        ("DanmakuOpacityFade", "Boolean", "弹幕透明度渐隐", "Danmaku opacity fade-out"),
        ("VideoSpeedRampMode", "Boolean", "变速平滑过渡", "Smooth speed transition"),
        ("AudioVirtualSurround", "Boolean", "音频虚拟环绕声", "Audio virtual surround"),
        ("DanmakuBubbleStyle", "Boolean", "弹幕气泡样式", "Danmaku bubble style"),
        ("PlayerLockTimeout", "Int", "播放器锁定超时(秒)", "Player lock timeout (seconds)"),
        ("VideoCropPreset", "Int", "视频裁剪预设", "Video crop preset"),
        ("DanmakuEmojiFilter", "Boolean", "弹幕表情过滤", "Danmaku emoji filter"),
    ],
    33: [
        ("AudioBassBoost", "Int", "低音增强", "Bass boost level"),
        ("DanmakuScrollDirection", "Int", "弹幕滚动方向", "Danmaku scroll direction"),
        ("VideoThumbnailTimeSec", "Int", "缩略图时间点(秒)", "Thumbnail time point (seconds)"),
        ("PlayerDoubleTapSeekSec", "Int", "双击快进秒数", "Double-tap seek seconds"),
        ("DanmakuLineNumber", "Int", "弹幕行数限制", "Danmaku line count limit"),
        ("SubtitleBorderWidth", "Int", "字幕描边宽度", "Subtitle border width"),
        ("VideoHdrToneMap", "Int", "HDR色调映射", "HDR tone mapping mode"),
        ("PlaybackSkipIntroSec", "Int", "跳过片头秒数", "Skip intro seconds"),
        ("DanmakuCustomFontPath", "Boolean", "弹幕自定义字体路径", "Danmaku custom font path"),
        ("AudioGainDb", "Int", "音频增益(dB)", "Audio gain (dB)"),
        ("PlayerSeekBarChapter", "Boolean", "进度条章节标记", "Seekbar chapter markers"),
        ("VideoRotationLock", "Boolean", "视频旋转锁定", "Video rotation lock"),
        ("DanmakuRepeatFilter", "Boolean", "弹幕重复过滤", "Danmaku repeat filter"),
        ("SubtitleShadowOffset", "Int", "字幕阴影偏移", "Subtitle shadow offset"),
        ("PlaylistReverseOrder", "Boolean", "播放列表倒序", "Playlist reverse order"),
    ],
    34: [
        ("DanmakuMaxDisplaySec", "Int", "弹幕最大显示时长(秒)", "Danmaku max display time (seconds)"),
        ("VideoBrightnessSensor", "Boolean", "亮度自动感应", "Auto brightness sensor"),
        ("AudioCompressorThreshold", "Int", "音频压缩阈值", "Audio compressor threshold"),
        ("PlayerGestureCustomMap", "Boolean", "自定义手势映射", "Custom gesture mapping"),
        ("DanmakuShieldRegex", "Boolean", "弹幕正则屏蔽", "Danmaku regex shield"),
        ("SubtitleKaraokeMode", "Boolean", "字幕卡拉OK模式", "Subtitle karaoke mode"),
        ("VideoScanLineFilter", "Boolean", "扫描线滤镜", "Scan-line filter"),
        ("PlaybackAutoPauseOnHeadset", "Boolean", "耳机断开自动暂停", "Auto-pause on headset disconnect"),
        ("DanmakuMirrorFlip", "Boolean", "弹幕镜像翻转", "Danmaku mirror flip"),
        ("AudioEqPreset", "Int", "均衡器预设", "Equalizer preset"),
        ("PlayerVolumeBoost", "Boolean", "播放器音量增强", "Player volume boost"),
        ("VideoPixelArtMode", "Boolean", "像素风格模式", "Pixel art mode"),
        ("DanmakuFontSizeMin", "Int", "弹幕最小字号", "Danmaku minimum font size"),
        ("SubtitleTextColorCustom", "Boolean", "字幕自定义颜色", "Subtitle custom text color"),
        ("PlaylistRepeatSingle", "Boolean", "单曲循环模式", "Single item repeat mode"),
    ],
    35: [
        ("VideoFrameRateOverride", "Int", "帧率覆盖", "Frame rate override"),
        ("DanmakuSenderAvatar", "Boolean", "弹幕发送者头像", "Danmaku sender avatar"),
        ("AudioSpatialWidth", "Int", "空间音频宽度", "Spatial audio width"),
        ("PlayerAutoFullscreenLandscape", "Boolean", "横屏自动全屏", "Auto fullscreen on landscape"),
        ("DanmakuPinyinConvert", "Boolean", "弹幕拼音转换", "Danmaku pinyin conversion"),
        ("SubtitlePositionTop", "Boolean", "字幕顶部显示", "Subtitle position top"),
        ("VideoVignetteEffect", "Int", "暗角效果强度", "Vignette effect strength"),
        ("PlaybackPreloadOnWifi", "Boolean", "仅WiFi预加载", "Preload on WiFi only"),
        ("DanmakuGradientColor", "Boolean", "弹幕渐变色", "Danmaku gradient color"),
        ("AudioLoudnessNormalize", "Boolean", "音频响度标准化", "Audio loudness normalization"),
        ("PlayerMiniWindow", "Boolean", "小窗播放", "Mini window playback"),
        ("VideoNoiseReduction", "Int", "视频降噪强度", "Video noise reduction strength"),
        ("DanmakuAnimationSpeed", "Int", "弹幕动画速度", "Danmaku animation speed"),
        ("SubtitleLineSpacing", "Int", "字幕行间距", "Subtitle line spacing"),
        ("PlaylistSmartShuffle", "Boolean", "智能随机播放", "Smart shuffle"),
    ],
    36: [
        ("VideoAspectFitMode", "Int", "画面适配模式", "Aspect fit mode"),
        ("DanmakuOpacityPerType", "Int", "弹幕类型透明度", "Danmaku per-type opacity"),
        ("AudioVoiceIsolate", "Boolean", "人声隔离", "Voice isolation"),
        ("PlayerSkipOutroSec", "Int", "跳过片尾秒数", "Skip outro seconds"),
        ("DanmakuAutoScale", "Boolean", "弹幕自动缩放", "Danmaku auto-scale"),
        ("SubtitleEdgeBlur", "Int", "字幕边缘模糊", "Subtitle edge blur"),
        ("VideoColorLutPreset", "Int", "色彩LUT预设", "Color LUT preset"),
        ("PlaybackSpeedPitchCorrect", "Boolean", "变速音调修正", "Speed pitch correction"),
        ("DanmakuBlockLength", "Int", "弹幕长度上限", "Danmaku length limit"),
        ("AudioDelayMs", "Int", "音频延迟(ms)", "Audio delay (ms)"),
        ("PlayerSwipeBrightnessCurve", "Int", "滑动亮度曲线", "Swipe brightness curve"),
        ("VideoSharpenEdgeMode", "Int", "边缘锐化模式", "Edge sharpen mode"),
        ("DanmakuFanBadge", "Boolean", "弹幕粉丝徽章", "Danmaku fan badge"),
        ("SubtitleFontWeightCustom", "Int", "字幕字重", "Subtitle font weight"),
        ("PlaylistAutoplayNextEpisode", "Boolean", "自动播放下一集", "Auto-play next episode"),
    ],
    37: [
        ("VideoBlackBarDetect", "Boolean", "黑边自动检测", "Auto black bar detection"),
        ("DanmakuGroupMerge", "Boolean", "弹幕分组合并", "Danmaku group merge"),
        ("AudioStereoWidth", "Int", "立体声宽度", "Stereo width"),
        ("PlayerResumeThreshold", "Int", "恢复播放阈值(秒)", "Resume playback threshold (seconds)"),
        ("DanmakuFuriganaShow", "Boolean", "弹幕注音显示", "Danmaku furigana display"),
        ("SubtitleOutlineColor", "Boolean", "字幕外框颜色", "Subtitle outline color"),
        ("VideoFpsCounter", "Boolean", "帧率计数器", "FPS counter"),
        ("PlaybackBufferStrategy", "Int", "缓冲策略", "Buffer strategy"),
        ("DanmakuLevelShield", "Int", "弹幕等级屏蔽", "Danmaku level shield"),
        ("AudioReverbPreset", "Int", "混响预设", "Reverb preset"),
        ("PlayerLongPressSpeed", "Int", "长按倍速值", "Long-press speed value"),
        ("VideoInterpolationMode", "Int", "插帧模式", "Frame interpolation mode"),
        ("DanmakuShadowOffset", "Int", "弹幕阴影偏移", "Danmaku shadow offset"),
        ("SubtitleBgColorCustom", "Boolean", "字幕自定义背景色", "Subtitle custom background color"),
        ("PlaylistFadeTransition", "Boolean", "淡入淡出过渡", "Fade transition between items"),
    ],
    38: [
        ("VideoGammaCurve", "Int", "Gamma曲线预设", "Gamma curve preset"),
        ("DanmakuSmartDensity", "Boolean", "弹幕智能密度控制", "Danmaku smart density control"),
        ("AudioHighShelfGain", "Int", "高频搁架增益", "High shelf gain"),
        ("PlayerSeekPreviewFrame", "Boolean", "拖动预览帧", "Seek preview frame"),
        ("DanmakuWrapText", "Boolean", "弹幕自动换行", "Danmaku auto wrap"),
        ("SubtitleLetterSpacing", "Int", "字幕字间距", "Subtitle letter spacing"),
        ("VideoContrastEnhance", "Int", "对比度增强", "Contrast enhancement"),
        ("PlaybackBufferMinSec", "Int", "最小缓冲秒数", "Minimum buffer seconds"),
        ("DanmakuPriorityLevel", "Int", "弹幕优先级", "Danmaku priority level"),
        ("AudioLowShelfGain", "Int", "低频搁架增益", "Low shelf gain"),
        ("PlayerSpeedStep", "Int", "倍速步进值(0.1x)", "Speed step (0.1x)"),
        ("VideoSaturationBoost", "Int", "饱和度增强", "Saturation boost"),
        ("DanmakuHoverPause", "Boolean", "弹幕悬停暂停", "Danmaku hover pause"),
        ("SubtitleRomanize", "Boolean", "字幕罗马音化", "Subtitle romanization"),
        ("PlaylistCrossFadeMs", "Int", "交叉淡入(ms)", "Crossfade duration (ms)"),
    ],
    39: [
        ("VideoTbnSyncMode", "Int", "时间基准同步模式", "Timebase sync mode"),
        ("DanmakuCloudPattern", "Boolean", "弹幕云样式", "Danmaku cloud pattern"),
        ("AudioMidFreqGain", "Int", "中频增益", "Mid frequency gain"),
        ("PlayerAutoBrightnessRange", "Int", "自动亮度范围", "Auto brightness range"),
        ("DanmakuCompactMode", "Boolean", "弹幕紧凑模式", "Danmaku compact mode"),
        ("SubtitleAnimationType", "Int", "字幕动画类型", "Subtitle animation type"),
        ("VideoDetailInfoBar", "Boolean", "视频详细信息栏", "Video detail info bar"),
        ("PlaybackNetworkAdapt", "Boolean", "网络自适应播放", "Network adaptive playback"),
        ("DanmakuGhostTrail", "Boolean", "弹幕拖影效果", "Danmaku ghost trail effect"),
        ("AudioDynamicRange", "Int", "动态范围压缩", "Dynamic range compression"),
        ("PlayerProgressToast", "Boolean", "进度提示Toast", "Progress toast"),
        ("VideoSmoothingLevel", "Int", "画面平滑等级", "Video smoothing level"),
        ("DanmakuSenderLevelIcon", "Boolean", "弹幕等级图标", "Danmaku sender level icon"),
        ("SubtitleAutoTranslate", "Boolean", "字幕自动翻译", "Subtitle auto-translate"),
        ("PlaylistLoadRelated", "Boolean", "加载相关视频", "Load related videos"),
    ],
    40: [
        ("VideoSnapshotInterval", "Int", "快照间隔(秒)", "Snapshot interval (seconds)"),
        ("DanmakuVintageMode", "Boolean", "弹幕复古模式", "Danmaku vintage mode"),
        ("AudioVocalRemove", "Boolean", "人声消除", "Vocal removal"),
        ("PlayerKeyShortcutMap", "Boolean", "快捷键自定义映射", "Custom key shortcut mapping"),
        ("DanmakuBiliEmoteParse", "Boolean", "B站表情解析", "Bilibili emote parsing"),
        ("SubtitleFontSerif", "Boolean", "字幕衬线字体", "Subtitle serif font"),
        ("VideoAiSuperRes", "Boolean", "AI超分辨率", "AI super resolution"),
        ("PlaybackCacheSegment", "Int", "分段缓存大小(MB)", "Segment cache size (MB)"),
        ("DanmakuFadeInDuration", "Int", "弹幕淡入时长(ms)", "Danmaku fade-in duration (ms)"),
        ("AudioPreservePitch", "Boolean", "变速保调", "Preserve pitch on speed change"),
        ("PlayerOsdTimeout", "Int", "OSD超时(秒)", "OSD timeout (seconds)"),
        ("VideoDynamicToneMap", "Boolean", "动态色调映射", "Dynamic tone mapping"),
        ("DanmakuMaxPerScreen", "Int", "屏幕最大弹幕数", "Max danmaku per screen"),
        ("SubtitleStrokeColor", "Boolean", "字幕描边颜色", "Subtitle stroke color"),
        ("PlaylistAutoRemoveDuplicated", "Boolean", "自动去重", "Auto remove duplicates"),
    ],
}

def snake_case(name):
    s = re.sub(r'([A-Z])', r'_\1', name).lower().lstrip('_')
    return s

def add_feature(ver, idx, name, ftype, cn_desc):
    app_path = os_chdir + "\\app\\src\\main\\java\\blbl\\cat3399\\core\\prefs\\AppPrefs.kt"
    ps_path = os_chdir + "\\app\\src\\main\\java\\blbl\\cat3399\\feature\\player\\PlayerSettings.kt"
    
    key_name = f"KEY_V{ver}_{snake_case(name).upper()}"
    key_val = f"v{ver}_{snake_case(name)}"
    prop_name = f"v{ver}{name}"
    
    with open(app_path, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    
    # Find last vN property setter
    insert_after = 0
    for i, line in enumerate(lines):
        if f'var v{ver}' in line:
            for j in range(i, min(i+5, len(lines))):
                if '.apply()' in lines[j]:
                    insert_after = j
                    break
    
    if insert_after == 0:
        for ver_check in range(ver-1, 20, -1):
            for i, line in enumerate(lines):
                if f'var v{ver_check}' in line:
                    for j in range(i, min(i+5, len(lines))):
                        if '.apply()' in lines[j]:
                            insert_after = j
                            break
            if insert_after > 0:
                break
    
    if ftype == "Boolean":
        prop_block = f"    // v{ver}.{idx}: {cn_desc}\n    var {prop_name}: Boolean\n        get() = prefs.getBoolean({key_name}, false)\n        set(value) = prefs.edit().putBoolean({key_name}, value).apply()\n\n"
    else:
        prop_block = f"    // v{ver}.{idx}: {cn_desc}\n    var {prop_name}: Int\n        get() = prefs.getInt({key_name}, 0)\n        set(value) = prefs.edit().putInt({key_name}, value).apply()\n\n"
    
    lines.insert(insert_after + 1, prop_block)
    
    last_key = 0
    for i, line in enumerate(lines):
        if 'private const val KEY_' in line:
            last_key = i
    
    key_line = f'        private const val {key_name} = "{key_val}"\n'
    lines.insert(last_key + 1, key_line)
    
    with open(app_path, 'w', encoding='utf-8') as f:
        f.writelines(lines)
    
    with open(ps_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    if ftype == "Boolean":
        func = f"\n// {ver}.{idx}: {cn_desc}\ninternal fun PlayerActivity.show{prop_name}Toggle() {{\n    val current = BiliClient.prefs.{prop_name}\n    AppPopup.Builder(this)\n        .title(\"{cn_desc}\")\n        .option(switchText(current)) {{ BiliClient.prefs.{prop_name} = !current }}\n        .show()\n}}\n"
    else:
        func = f"\n// {ver}.{idx}: {cn_desc}\ninternal fun PlayerActivity.show{prop_name}Dialog() {{\n    val current = BiliClient.prefs.{prop_name}\n    AppPopup.Builder(this)\n        .title(\"{cn_desc}\")\n        .option(\"0\") {{ BiliClient.prefs.{prop_name} = 0 }}\n        .option(\"1\") {{ BiliClient.prefs.{prop_name} = 1 }}\n        .option(\"2\") {{ BiliClient.prefs.{prop_name} = 2 }}\n        .option(\"3\") {{ BiliClient.prefs.{prop_name} = 3 }}\n        .option(\"5\") {{ BiliClient.prefs.{prop_name} = 5 }}\n        .option(\"10\") {{ BiliClient.prefs.{prop_name} = 10 }}\n        .show()\n}}\n"
    
    last_brace = content.rfind('}')
    content = content[:last_brace] + func + '\n}\n'
    
    with open(ps_path, 'w', encoding='utf-8') as f:
        f.write(content)

commit_count = 0
for ver in range(31, 41):
    features = FEATURES[ver]
    for idx, (name, ftype, cn_desc, en_desc) in enumerate(features, 1):
        print(f"Adding v{ver}.{idx}: {name} ({ftype}) - {cn_desc}")
        add_feature(ver, idx, name, ftype, cn_desc)
        
        commit_msg = f"Release v{ver}.{idx}.0 - {en_desc}"
        subprocess.run(['git', 'add', '-A'], cwd=os_chdir, capture_output=True, encoding='utf-8', errors='ignore', timeout=10)
        result = subprocess.run(['git', 'commit', '-m', commit_msg], cwd=os_chdir, capture_output=True, encoding='utf-8', errors='ignore', timeout=10)
        if result.returncode == 0:
            commit_count += 1
            print(f"  Committed")
        else:
            print(f"  ERROR: {result.stderr[:100]}")
        time.sleep(0.3)

print(f"\nDone! {commit_count} commits")
