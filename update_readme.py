# -*- coding: utf-8 -*-
"""Rebuild README with only v4-v30 + new v31-v40 changelog"""
import re

with open('README.md', 'r', encoding='utf-8') as f:
    content = f.read()

# Find the changelog section start
changelog_start = content.find('## 📋 更新日志')
if changelog_start < 0:
    print("ERROR: Cannot find changelog section")
    exit(1)

# Find the version changelog section start
ver_changelog_start = content.find('## 📊 版本更新日志')
if ver_changelog_start < 0:
    print("ERROR: Cannot find version changelog section")
    exit(1)

# Keep everything before the version changelog
header = content[:ver_changelog_start]

# Build new version changelog with v31-v40
FEATURES = {
    31: [
        ("DanmakuMergeOverlap", "弹幕重叠自动合并", "Auto-merge overlapping danmaku", "重複コメント自動マージ", "중복 댓글 자동 병합"),
        ("VideoFrameSkipSilence", "静音片段自动跳过", "Auto-skip silent segments", "無音部分自動スキップ", "무음 구간 자동 건너뛰기"),
        ("SubtitleFontSizeAuto", "字幕字号自动适配", "Auto-fit subtitle font size", "字幕フォントサイズ自動調整", "자막 글꼴 크기 자동 조정"),
        ("PlaybackBufferAheadSec", "预缓冲时长", "Pre-buffer duration", "プリバッファ時間", "사전 버퍼 시간"),
        ("DanmakuAntiSpamLevel", "弹幕防刷等级", "Danmaku anti-spam level", "コメントスパム防止レベル", "댓글 스팸 방지 레벨"),
        ("VideoDeinterlaceMode", "视频反交错模式", "Video deinterlace mode", "動画インターレース解除モード", "비디오 인터레이스 해제 모드"),
        ("AudioNightMode", "音频夜间模式", "Audio night mode", "音声ナイトモード", "오디오 나이트 모드"),
        ("DanmakuKeywordHighlight", "弹幕关键词高亮", "Danmaku keyword highlight", "コメントキーワードハイライト", "댓글 키워드 강조"),
        ("PlayerPiPSupport", "画中画模式支持", "Picture-in-Picture support", "ピクチャーインピクチャー対応", "PIP 모드 지원"),
        ("VideoABoopMode", "A-B循环播放", "A-B loop playback", "A-Bループ再生", "A-B 루프 재생"),
        ("DanmakuLayerOrder", "弹幕层级排序", "Danmaku layer order", "コメントレイヤー順序", "댓글 레이어 순서"),
        ("SubtitleSyncOffset", "字幕同步偏移", "Subtitle sync offset", "字幕同期オフセット", "자막 동기화 오프셋"),
        ("PlaybackAutoResume", "播放自动恢复", "Auto-resume playback", "再生自動再開", "재생 자동 재개"),
        ("DanmakuBlockUserLevel", "弹幕屏蔽用户等级", "Danmaku block user level", "コメントユーザーレベルブロック", "댓글 사용자 레벨 차단"),
        ("VideoCodecPriority", "视频解码优先级", "Video codec priority", "動画コーデック優先度", "비디오 코덱 우선순위"),
    ],
    32: [
        ("ScreenOffTimer", "息屏定时器", "Screen-off timer", "画面オフタイマー", "화면 끄기 타이머"),
        ("DanmakuRainMode", "弹幕雨模式", "Danmaku rain mode", "コメントレインモード", "댓글 비 모드"),
        ("AudioChannelSwap", "音频声道交换", "Audio channel swap", "音声チャンネルスワップ", "오디오 채널 스왑"),
        ("VideoZoomGesture", "视频缩放手势", "Video zoom gesture", "動画ズームジェスチャー", "비디오 줌 제스처"),
        ("DanmakuTimestampDisplay", "弹幕时间戳显示", "Danmaku timestamp display", "コメントタイムスタンプ表示", "댓글 타임스탬프 표시"),
        ("PlaylistRemovePlayed", "自动移除已播放项", "Auto-remove played items", "再生済みアイテム自動削除", "재생 항목 자동 제거"),
        ("PlayerBackgroundPlay", "后台播放", "Background playback", "バックグラウンド再生", "백그라운드 재생"),
        ("SubtitleDualLang", "双语字幕", "Dual-language subtitles", "二言語字幕", "이중 언어 자막"),
        ("DanmakuOpacityFade", "弹幕透明度渐隐", "Danmaku opacity fade-out", "コメント透明度フェードアウト", "댓글 투명도 페이드아웃"),
        ("VideoSpeedRampMode", "变速平滑过渡", "Smooth speed transition", "スムーズ速度遷移", "부드러운 속도 전환"),
        ("AudioVirtualSurround", "音频虚拟环绕声", "Audio virtual surround", "音声バーチャルサラウンド", "오디오 가상 서라운드"),
        ("DanmakuBubbleStyle", "弹幕气泡样式", "Danmaku bubble style", "コメントバブルスタイル", "댓글 버블 스타일"),
        ("PlayerLockTimeout", "播放器锁定超时", "Player lock timeout", "プレーヤーロックタイムアウト", "플레이어 잠금 시간 초과"),
        ("VideoCropPreset", "视频裁剪预设", "Video crop preset", "動画クロッププリセット", "비디오 크롭 프리셋"),
        ("DanmakuEmojiFilter", "弹幕表情过滤", "Danmaku emoji filter", "コメント絵文字フィルター", "댓글 이모지 필터"),
    ],
    33: [
        ("AudioBassBoost", "低音增强", "Bass boost", "バスブースト", "베이스 부스트"),
        ("DanmakuScrollDirection", "弹幕滚动方向", "Danmaku scroll direction", "コメントスクロール方向", "댓글 스크롤 방향"),
        ("VideoThumbnailTimeSec", "缩略图时间点", "Thumbnail time point", "サムネイル時間ポイント", "썸네일 시간 지점"),
        ("PlayerDoubleTapSeekSec", "双击快进秒数", "Double-tap seek seconds", "ダブルタップシーク秒", "더블 탭 탐색 초"),
        ("DanmakuLineNumber", "弹幕行数限制", "Danmaku line count limit", "コメント行数制限", "댓글 줄 수 제한"),
        ("SubtitleBorderWidth", "字幕描边宽度", "Subtitle border width", "字幕ボーダー幅", "자막 테두리 너비"),
        ("VideoHdrToneMap", "HDR色调映射", "HDR tone mapping", "HDRトーンマッピング", "HDR 톤 매핑"),
        ("PlaybackSkipIntroSec", "跳过片头秒数", "Skip intro seconds", "イントロスキップ秒", "인트로 건너뛰기 초"),
        ("DanmakuCustomFontPath", "弹幕自定义字体", "Danmaku custom font", "コメントカスタムフォント", "댓글 커스텀 글꼴"),
        ("AudioGainDb", "音频增益", "Audio gain", "音声ゲイン", "오디오 게인"),
        ("PlayerSeekBarChapter", "进度条章节标记", "Seekbar chapter markers", "シークバーチャプターマーク", "탐색 바 챕터 마크"),
        ("VideoRotationLock", "视频旋转锁定", "Video rotation lock", "動画回転ロック", "비디오 회전 잠금"),
        ("DanmakuRepeatFilter", "弹幕重复过滤", "Danmaku repeat filter", "コメント重複フィルター", "댓글 중복 필터"),
        ("SubtitleShadowOffset", "字幕阴影偏移", "Subtitle shadow offset", "字幕シャドウオフセット", "자막 그림자 오프셋"),
        ("PlaylistReverseOrder", "播放列表倒序", "Playlist reverse order", "プレイリスト逆順", "재생 목록 역순"),
    ],
    34: [
        ("DanmakuMaxDisplaySec", "弹幕最大显示时长", "Danmaku max display time", "コメント最大表示時間", "댓글 최대 표시 시간"),
        ("VideoBrightnessSensor", "亮度自动感应", "Auto brightness sensor", "輝度自動センサー", "밝기 자동 센서"),
        ("AudioCompressorThreshold", "音频压缩阈值", "Audio compressor threshold", "音声コンプレッサー閾値", "오디오 컴프레서 임계값"),
        ("PlayerGestureCustomMap", "自定义手势映射", "Custom gesture mapping", "カスタムジェスチャーマッピング", "커스텀 제스처 매핑"),
        ("DanmakuShieldRegex", "弹幕正则屏蔽", "Danmaku regex shield", "コメント正規表現シールド", "댓글 정규식 차단"),
        ("SubtitleKaraokeMode", "字幕卡拉OK模式", "Subtitle karaoke mode", "字幕カラオケモード", "자막 노래방 모드"),
        ("VideoScanLineFilter", "扫描线滤镜", "Scan-line filter", "スキャンラインフィルター", "스캔라인 필터"),
        ("PlaybackAutoPauseOnHeadset", "耳机断开自动暂停", "Auto-pause on headset disconnect", "イヤホン切断自動一時停止", "이어폰 분리 자동 일시정지"),
        ("DanmakuMirrorFlip", "弹幕镜像翻转", "Danmaku mirror flip", "コメントミラーフリップ", "댓글 미러 뒤집기"),
        ("AudioEqPreset", "均衡器预设", "Equalizer preset", "イコライザープリセット", "이퀄라이저 프리셋"),
        ("PlayerVolumeBoost", "播放器音量增强", "Player volume boost", "プレーヤー音量ブースト", "플레이어 볼륨 부스트"),
        ("VideoPixelArtMode", "像素风格模式", "Pixel art mode", "ピクセルアートモード", "픽셀 아트 모드"),
        ("DanmakuFontSizeMin", "弹幕最小字号", "Danmaku minimum font size", "コメント最小フォントサイズ", "댓글 최소 글꼴 크기"),
        ("SubtitleTextColorCustom", "字幕自定义颜色", "Subtitle custom text color", "字幕カスタムテキスト色", "자막 커스텀 텍스트 색상"),
        ("PlaylistRepeatSingle", "单曲循环模式", "Single item repeat mode", "シングルリピートモード", "단일 항목 반복 모드"),
    ],
    35: [
        ("VideoFrameRateOverride", "帧率覆盖", "Frame rate override", "フレームレートオーバーライド", "프레임 속도 오버라이드"),
        ("DanmakuSenderAvatar", "弹幕发送者头像", "Danmaku sender avatar", "コメント送信者アバター", "댓글 발신자 아바타"),
        ("AudioSpatialWidth", "空间音频宽度", "Spatial audio width", "空間音声幅", "공간 오디오 폭"),
        ("PlayerAutoFullscreenLandscape", "横屏自动全屏", "Auto fullscreen on landscape", "横画面自動フルスクリーン", "가로 화면 자동 전체화면"),
        ("DanmakuPinyinConvert", "弹幕拼音转换", "Danmaku pinyin conversion", "コメントピンイン変換", "댓글 병음 변환"),
        ("SubtitlePositionTop", "字幕顶部显示", "Subtitle position top", "字幕上部表示", "자막 상단 표시"),
        ("VideoVignetteEffect", "暗角效果强度", "Vignette effect strength", "ビネット効果強度", "비네트 효과 강도"),
        ("PlaybackPreloadOnWifi", "仅WiFi预加载", "Preload on WiFi only", "WiFiのみプリロード", "WiFi에서만 프리로드"),
        ("DanmakuGradientColor", "弹幕渐变色", "Danmaku gradient color", "コメントグラデーション色", "댓글 그라데이션 색상"),
        ("AudioLoudnessNormalize", "音频响度标准化", "Audio loudness normalization", "音声ラウドネス正規化", "오디오 라우드니스 정규화"),
        ("PlayerMiniWindow", "小窗播放", "Mini window playback", "ミニウィンドウ再生", "미니 창 재생"),
        ("VideoNoiseReduction", "视频降噪强度", "Video noise reduction", "動画ノイズ除去強度", "비디오 노이즈 감소 강도"),
        ("DanmakuAnimationSpeed", "弹幕动画速度", "Danmaku animation speed", "コメントアニメーション速度", "댓글 애니메이션 속도"),
        ("SubtitleLineSpacing", "字幕行间距", "Subtitle line spacing", "字幕行間", "자막 줄 간격"),
        ("PlaylistSmartShuffle", "智能随机播放", "Smart shuffle", "スマートシャッフル", "스마트 셔플"),
    ],
    36: [
        ("VideoAspectFitMode", "画面适配模式", "Aspect fit mode", "アスペクトフィットモード", "화면 맞춤 모드"),
        ("DanmakuOpacityPerType", "弹幕类型透明度", "Danmaku per-type opacity", "コメントタイプ別透明度", "댓글 유형별 투명도"),
        ("AudioVoiceIsolate", "人声隔离", "Voice isolation", "ボーカルアイソレーション", "보컬 분리"),
        ("PlayerSkipOutroSec", "跳过片尾秒数", "Skip outro seconds", "アウトロスキップ秒", "아웃트로 건너뛰기 초"),
        ("DanmakuAutoScale", "弹幕自动缩放", "Danmaku auto-scale", "コメント自動スケール", "댓글 자동 스케일"),
        ("SubtitleEdgeBlur", "字幕边缘模糊", "Subtitle edge blur", "字幕エッジぼかし", "자막 가장자리 블러"),
        ("VideoColorLutPreset", "色彩LUT预设", "Color LUT preset", "カラールックアップテーブルプリセット", "컬러 LUT 프리셋"),
        ("PlaybackSpeedPitchCorrect", "变速音调修正", "Speed pitch correction", "速度ピッチ補正", "속도 피치 보정"),
        ("DanmakuBlockLength", "弹幕长度上限", "Danmaku length limit", "コメント長さ制限", "댓글 길이 제한"),
        ("AudioDelayMs", "音频延迟", "Audio delay", "音声遅延", "오디오 지연"),
        ("PlayerSwipeBrightnessCurve", "滑动亮度曲线", "Swipe brightness curve", "スワイプ輝度カーブ", "스와이프 밝기 커브"),
        ("VideoSharpenEdgeMode", "边缘锐化模式", "Edge sharpen mode", "エッジシャープンモード", "가장자리 선명화 모드"),
        ("DanmakuFanBadge", "弹幕粉丝徽章", "Danmaku fan badge", "コメントファンバッジ", "댓글 팬 뱃지"),
        ("SubtitleFontWeightCustom", "字幕字重", "Subtitle font weight", "字幕フォントウェイト", "자막 글꼴 무게"),
        ("PlaylistAutoplayNextEpisode", "自动播放下一集", "Auto-play next episode", "次エピソード自動再生", "다음 에피소드 자동 재생"),
    ],
    37: [
        ("VideoBlackBarDetect", "黑边自动检测", "Auto black bar detection", "黒帯自動検出", "블랙바 자동 감지"),
        ("DanmakuGroupMerge", "弹幕分组合并", "Danmaku group merge", "コメントグループマージ", "댓글 그룹 병합"),
        ("AudioStereoWidth", "立体声宽度", "Stereo width", "ステレオ幅", "스테레오 폭"),
        ("PlayerResumeThreshold", "恢复播放阈值", "Resume playback threshold", "再生再開閾値", "재생 재개 임계값"),
        ("DanmakuFuriganaShow", "弹幕注音显示", "Danmaku furigana display", "コメントふりがな表示", "댓글 후리가나 표시"),
        ("SubtitleOutlineColor", "字幕外框颜色", "Subtitle outline color", "字幕アウトライン色", "자막 아웃라인 색상"),
        ("VideoFpsCounter", "帧率计数器", "FPS counter", "FPSカウンター", "FPS 카운터"),
        ("PlaybackBufferStrategy", "缓冲策略", "Buffer strategy", "バッファ戦略", "버퍼 전략"),
        ("DanmakuLevelShield", "弹幕等级屏蔽", "Danmaku level shield", "コメントレベルシールド", "댓글 레벨 차단"),
        ("AudioReverbPreset", "混响预设", "Reverb preset", "リバーブプリセット", "리버브 프리셋"),
        ("PlayerLongPressSpeed", "长按倍速值", "Long-press speed value", "長押し速度値", "길게 누르기 속도 값"),
        ("VideoInterpolationMode", "插帧模式", "Frame interpolation mode", "フレーム補間モード", "프레임 보간 모드"),
        ("DanmakuShadowOffset", "弹幕阴影偏移", "Danmaku shadow offset", "コメントシャドウオフセット", "댓글 그림자 오프셋"),
        ("SubtitleBgColorCustom", "字幕自定义背景色", "Subtitle custom background color", "字幕カスタム背景色", "자막 커스텀 배경 색상"),
        ("PlaylistFadeTransition", "淡入淡出过渡", "Fade transition", "フェードトランジション", "페이드 전환"),
    ],
    38: [
        ("VideoGammaCurve", "Gamma曲线预设", "Gamma curve preset", "ガンマカーブプリセット", "감마 커브 프리셋"),
        ("DanmakuSmartDensity", "弹幕智能密度控制", "Danmaku smart density control", "コメントスマート密度制御", "댓글 스마트 밀도 제어"),
        ("AudioHighShelfGain", "高频搁架增益", "High shelf gain", "高域シェルフゲイン", "고주파 셸프 게인"),
        ("PlayerSeekPreviewFrame", "拖动预览帧", "Seek preview frame", "シークプレビューフレーム", "탐색 미리보기 프레임"),
        ("DanmakuWrapText", "弹幕自动换行", "Danmaku auto wrap", "コメント自動折り返し", "댓글 자동 줄바꿈"),
        ("SubtitleLetterSpacing", "字幕字间距", "Subtitle letter spacing", "字幕文字間隔", "자막 글자 간격"),
        ("VideoContrastEnhance", "对比度增强", "Contrast enhancement", "コントラスト強化", "대비 강화"),
        ("PlaybackBufferMinSec", "最小缓冲秒数", "Minimum buffer seconds", "最小バッファ秒", "최소 버퍼 초"),
        ("DanmakuPriorityLevel", "弹幕优先级", "Danmaku priority level", "コメント優先度", "댓글 우선순위"),
        ("AudioLowShelfGain", "低频搁架增益", "Low shelf gain", "低域シェルフゲイン", "저주파 셸프 게인"),
        ("PlayerSpeedStep", "倍速步进值", "Speed step", "速度ステップ", "속도 스텝"),
        ("VideoSaturationBoost", "饱和度增强", "Saturation boost", "彩度ブースト", "채도 부스트"),
        ("DanmakuHoverPause", "弹幕悬停暂停", "Danmaku hover pause", "コメントホバー一時停止", "댓글 호버 일시정지"),
        ("SubtitleRomanize", "字幕罗马音化", "Subtitle romanization", "字幕ローマ字化", "자막 로마자화"),
        ("PlaylistCrossFadeMs", "交叉淡入", "Crossfade duration", "クロスフェード時間", "크로스페이드 시간"),
    ],
    39: [
        ("VideoTbnSyncMode", "时间基准同步模式", "Timebase sync mode", "タイムベース同期モード", "타임베이스 동기화 모드"),
        ("DanmakuCloudPattern", "弹幕云样式", "Danmaku cloud pattern", "コメントクラウドパターン", "댓글 클라우드 패턴"),
        ("AudioMidFreqGain", "中频增益", "Mid frequency gain", "中域ゲイン", "중주파 게인"),
        ("PlayerAutoBrightnessRange", "自动亮度范围", "Auto brightness range", "自動輝度範囲", "자동 밝기 범위"),
        ("DanmakuCompactMode", "弹幕紧凑模式", "Danmaku compact mode", "コメントコンパクトモード", "댓글 컴팩트 모드"),
        ("SubtitleAnimationType", "字幕动画类型", "Subtitle animation type", "字幕アニメーションタイプ", "자막 애니메이션 유형"),
        ("VideoDetailInfoBar", "视频详细信息栏", "Video detail info bar", "動画詳細情報バー", "비디오 상세 정보 바"),
        ("PlaybackNetworkAdapt", "网络自适应播放", "Network adaptive playback", "ネットワーク適応再生", "네트워크 적응 재생"),
        ("DanmakuGhostTrail", "弹幕拖影效果", "Danmaku ghost trail effect", "コメントゴーストトレイル", "댓글 고스트 트레일"),
        ("AudioDynamicRange", "动态范围压缩", "Dynamic range compression", "ダイナミックレンジ圧縮", "다이나믹 레인지 압축"),
        ("PlayerProgressToast", "进度提示Toast", "Progress toast", "進捗トースト", "진행 토스트"),
        ("VideoSmoothingLevel", "画面平滑等级", "Video smoothing level", "動画スムージングレベル", "비디오 스무딩 레벨"),
        ("DanmakuSenderLevelIcon", "弹幕等级图标", "Danmaku sender level icon", "コメントレベルアイコン", "댓글 레벨 아이콘"),
        ("SubtitleAutoTranslate", "字幕自动翻译", "Subtitle auto-translate", "字幕自動翻訳", "자막 자동 번역"),
        ("PlaylistLoadRelated", "加载相关视频", "Load related videos", "関連動画読み込み", "관련 영상 로드"),
    ],
    40: [
        ("VideoSnapshotInterval", "快照间隔", "Snapshot interval", "スナップショット間隔", "스냅샷 간격"),
        ("DanmakuVintageMode", "弹幕复古模式", "Danmaku vintage mode", "コメントビンテージモード", "댓글 빈티지 모드"),
        ("AudioVocalRemove", "人声消除", "Vocal removal", "ボーカル除去", "보컬 제거"),
        ("PlayerKeyShortcutMap", "快捷键自定义映射", "Custom key shortcut mapping", "カスタムショートカットマッピング", "커스텀 단축키 매핑"),
        ("DanmakuBiliEmoteParse", "B站表情解析", "Bilibili emote parsing", "Bilibili絵文字解析", "Bilibili 이모지 파싱"),
        ("SubtitleFontSerif", "字幕衬线字体", "Subtitle serif font", "字幕セリフフォント", "자막 세리프 글꼴"),
        ("VideoAiSuperRes", "AI超分辨率", "AI super resolution", "AI超解像度", "AI 초해상도"),
        ("PlaybackCacheSegment", "分段缓存大小", "Segment cache size", "セグメントキャッシュサイズ", "세그먼트 캐시 크기"),
        ("DanmakuFadeInDuration", "弹幕淡入时长", "Danmaku fade-in duration", "コメントフェードイン時間", "댓글 페이드인 시간"),
        ("AudioPreservePitch", "变速保调", "Preserve pitch on speed change", "速度変更時ピッチ保持", "속도 변경 시 피치 유지"),
        ("PlayerOsdTimeout", "OSD超时", "OSD timeout", "OSDタイムアウト", "OSD 시간 초과"),
        ("VideoDynamicToneMap", "动态色调映射", "Dynamic tone mapping", "動的トーンマッピング", "동적 톤 매핑"),
        ("DanmakuMaxPerScreen", "屏幕最大弹幕数", "Max danmaku per screen", "画面最大コメント数", "화면 최대 댓글 수"),
        ("SubtitleStrokeColor", "字幕描边颜色", "Subtitle stroke color", "字幕ストローク色", "자막 스트로크 색상"),
        ("PlaylistAutoRemoveDuplicated", "自动去重", "Auto remove duplicates", "重複自動削除", "중복 자동 제거"),
    ],
}

# Build changelog
changelog = "## 📊 版本更新日志 | Version Changelog | バージョン更新履歴 | 버전 변경 로그\n\n"

for ver in range(31, 41):
    features = FEATURES[ver]
    changelog += f"### v{ver}.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전\n"
    feat_list = ", ".join(f[1] for f in features)
    changelog += f"### v{ver}.1-v{ver}.15 功能列表\n"
    changelog += f"- ✅ {feat_list}\n\n"
    
    for idx, (name, cn, en, ja, ko) in enumerate(features, 1):
        changelog += f"### v{ver}.{idx} {cn} | {en} | {ja} | {ko}\n"
        changelog += f"- ✅ {cn}\n"
        changelog += f"- ✅ {en}\n"
        changelog += f"- ✅ {ja}\n"
        changelog += f"- ✅ {ko}\n\n"
    
    changelog += "\n"

new_readme = header + changelog

with open('README.md', 'w', encoding='utf-8') as f:
    f.write(new_readme)

print("README updated with v31-v40 changelog (4 languages)")
