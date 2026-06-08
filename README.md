# blbl - AI Enhanced Edition | AI加强维护版

一个第三方哔哩哔哩安卓 App，支持触摸、遥控，适用于平板、TV、车机等设备。

A third-party Bilibili Android app with touch and remote control support for tablets, TV, and car devices.

タッチ・リモコン対応のサードパーティBilibili Androidアプリ。タブレット、TV、車載デバイス対応。

터치 및 리모컨을 지원하는 서드파티 빌리빌리 Android 앱. 태블릿, TV, 차량 장치에 적합합니다.

---

## 🤖 AI加强维护版 | AI Enhanced Maintenance Build

> ⚠️ **本版本由AI自动维护、修复、迭代、自我升级版**
> ⚠️ **This build is AI auto-maintained, fixed, iterated, and self-upgraded**
> ⚠️ **このビルドはAI自動メンテナンス、修正、反復、自己アップグレード版**
> ⚠️ **이 빌드는 AI 자동 유지보수, 수정, 반복, 자가 업그레이드 버전입니다**

---

## ⚖️ 免责声明 | Disclaimer | 免責事項 | 면책 조항

- 本软件基于开源项目二次开发，版权归 original author 所有
- 本软件不提供任何担保，使用风险自负
- 本软件仅供学习研究，请于下载后24小时内删除
- This software is based on an open-source project. All rights belong to the original author.
- No warranty provided. Use at your own risk.
- For study purposes only. Please delete within 24 hours.
- このソフトウェアはオープンソースプロジェクトに基づいています。著作権は原著者に帰属します。
- 一切の保証はありません。自己責任でご使用ください。
- 学習研究専用です。ダウンロード後24時間以内に削除してください。
- 이 소프트웨어는 오픈 소스 프로젝트를 기반으로 합니다. 저작권은 원저작자에게 있습니다.
- 어떠한 보증도 제공하지 않습니다. 사용에 따른 위험은 사용자 책임입니다.
- 학습 연구 전용입니다. 다운로드 후 24시간 이내에 삭제해 주세요.

---

## 📱 设备支持 | Device Support | デバイス対応 | 기기 지원

| 设备类型 | 系统要求 | 状态 |
|----------|----------|------|
| Android TV / 盒子 | Android 5.0+ | ✅支持 |
| 平板 | Android 5.0+ | ✅支持 |
| 车机 | Android 5.0+ | ✅支持 |

---

## 📥 安装说明 | Installation | インストール | 설치 방법

1. 从 [Releases](https://github.com/min09577/blbl/releases) 下载 APK
2. 复制到 U 盘，插入设备
3. 使用文件管理器安装

1. Download APK from [Releases](https://github.com/min09577/blbl/releases)
2. Copy to USB drive, insert into device
3. Install using file manager

1. [Releases](https://github.com/min09577/blbl/releases)からAPKをダウンロード
2. USBドライブにコピー、デバイスに接続
3. ファイルマネージャーでインストール

1. [Releases](https://github.com/min09577/blbl/releases)에서 APK 다운로드
2. USB 드라이브에 복사, 장치에 연결
3. 파일 관리자로 설치

---

## ✨ 功能概览 | Features | 機能概要 | 기능 개요

- 🎬 视频播放：支持多种画质、倍速播放、画中画
- 💬 弹幕系统：智能弹幕、自定义样式、关键词过滤
- 📺 投屏支持：DLNA投屏、多设备同步
- 🎨 界面优化：Material Design、深色模式
- 🔧 高级设置：手势控制、快捷键、播放器自定义

---

## 🛠 技术栈 | Tech Stack | 技術スタック | 기술 스택

- **语言**: Kotlin
- **架构**: MVVM + Clean Architecture
- **播放器**: Media3 / ExoPlayer / IjkPlayer
- **弹幕**: Custom Danmaku Engine
- **UI**: Material Design 3 + Jetpack Compose

---

## 🔨 构建 | Build | ビルド | 빌드

```bash
# Clone
git clone https://github.com/min09577/blbl.git
cd blbl

# Build Debug APK
./gradlew assembleDebug

# Output
# app/build/outputs/apk/debug/app-debug.apk
```

---

## 🔗 项目地址 | Repository | リポジトリ | 저장소

- **GitHub**: https://github.com/min09577/blbl
- **Author**: min09577

---

## 📄 许可证 | License | ライセンス | 라이선스

This project is based on open-source software. All rights belong to the original author.

---

## 📋 更新日志 | Changelog | 変更履歴 | 변경 로그

### 最新版本 | Latest Version | 最新バージョン | 최신 버전
- **v200.15** - 2026-06-08

---

## 📊 版本更新日志 | Version Changelog | バージョン更新履歴 | 버전 변경 로그


### v46.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v46.1-v46.15 功能列表
- ✅ Loop Memory, Danmaku Font Weight, Auto Gamma, Volume Normalization, Danmaku Stroke Offset, Cast Color Temperature, Gesture Edge Exclusion, Danmaku Row Spacing, Cache Prefetch on WiFi, Progress Bar Thumb Size, Danmaku Send Confirm Dialog, Color White Balance, Volume Limit Threshold, Danmaku Bg Padding, Cast Video Codec

### v46.1 循环记忆 | Loop Memory | ループメモリ | 루프 메모리
- ✅ 循环记忆
- ✅ Loop Memory
- ✅ ループメモリ
- ✅ 루프 메모리

### v46.2 弹幕字体粗细 | Danmaku Font Weight | コメント太さ | 댓글 글꼴 두께
- ✅ 弹幕字体粗细
- ✅ Danmaku Font Weight
- ✅ コメント太さ
- ✅ 댓글 글꼴 두께

### v46.3 自动伽马 | Auto Gamma | 自動ガンマ | 자동 감마
- ✅ 自动伽马
- ✅ Auto Gamma
- ✅ 自動ガンマ
- ✅ 자동 감마

### v46.4 音量标准化 | Volume Normalization | 音量正規化 | 볼륨 정규화
- ✅ 音量标准化
- ✅ Volume Normalization
- ✅ 音量正規化
- ✅ 볼륨 정규화

### v46.5 弹幕描边偏移 | Danmaku Stroke Offset | コメントストロークオフセット | 댓글 스트로크 오프셋
- ✅ 弹幕描边偏移
- ✅ Danmaku Stroke Offset
- ✅ コメントストロークオフセット
- ✅ 댓글 스트로크 오프셋

### v46.6 投射色温 | Cast Color Temperature | キャスト色温度 | 캐스트 색온도
- ✅ 投射色温
- ✅ Cast Color Temperature
- ✅ キャスト色温度
- ✅ 캐스트 색온도

### v46.7 手势边缘排除 | Gesture Edge Exclusion | ジェスチャーエッジ除外 | 제스처 가장자리 제외
- ✅ 手势边缘排除
- ✅ Gesture Edge Exclusion
- ✅ ジェスチャーエッジ除外
- ✅ 제스처 가장자리 제외

### v46.8 弹幕行间距 | Danmaku Row Spacing | コメント行間 | 댓글 줄 간격
- ✅ 弹幕行间距
- ✅ Danmaku Row Spacing
- ✅ コメント行間
- ✅ 댓글 줄 간격

### v46.9 WiFi缓存预取 | Cache Prefetch on WiFi | WiFiキャッシュプリロード | WiFi 캐시 프리로드
- ✅ WiFi缓存预取
- ✅ Cache Prefetch on WiFi
- ✅ WiFiキャッシュプリロード
- ✅ WiFi 캐시 프리로드

### v46.10 进度条滑块大小 | Progress Bar Thumb Size | プログレスバーサムズサイズ | 진행 바 썸 크기
- ✅ 进度条滑块大小
- ✅ Progress Bar Thumb Size
- ✅ プログレスバーサムズサイズ
- ✅ 진행 바 썸 크기

### v46.11 弹幕发送确认 | Danmaku Send Confirm Dialog | コメント送信確認 | 댓글 전송 확인
- ✅ 弹幕发送确认
- ✅ Danmaku Send Confirm Dialog
- ✅ コメント送信確認
- ✅ 댓글 전송 확인

### v46.12 白平衡 | Color White Balance | ホワイトバランス | 화이트 밸런스
- ✅ 白平衡
- ✅ Color White Balance
- ✅ ホワイトバランス
- ✅ 화이트 밸런스

### v46.13 音量限制阈值 | Volume Limit Threshold | 音量制限閾値 | 볼륨 제한 임계값
- ✅ 音量限制阈值
- ✅ Volume Limit Threshold
- ✅ 音量制限閾値
- ✅ 볼륨 제한 임계값

### v46.14 弹幕背景内边距 | Danmaku Bg Padding | コメント背景パディング | 댓글 배경 패딩
- ✅ 弹幕背景内边距
- ✅ Danmaku Bg Padding
- ✅ コメント背景パディング
- ✅ 댓글 배경 패딩

### v46.15 投射视频编码 | Cast Video Codec | キャスト動画コーデック | 캐스트 비디오 코덱
- ✅ 投射视频编码
- ✅ Cast Video Codec
- ✅ キャスト動画コーデック
- ✅ 캐스트 비디오 코덱

### v47.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v47.1-v47.15 功能列表
- ✅ Resume Prompt, Danmaku Font Spacing, Exposure Compensation, Volume Loudness Enhancer, Danmaku Stroke Blur, Cast Audio Bitrate, Gesture Dead Zone, Danmaku Max Lines, Cache Max Size, Progress Bar Seek Preview, Danmaku Highlight Mention, Color Tint, Volume Channel Balance, Danmaku Bg Border Color, Cast Subtitle Enabled

### v47.1 恢复提示 | Resume Prompt | 再開プロンプト | 재개 프롬프트
- ✅ 恢复提示
- ✅ Resume Prompt
- ✅ 再開プロンプト
- ✅ 재개 프롬프트

### v47.2 弹幕字间距 | Danmaku Font Spacing | コメント文字間隔 | 댓글 글자 간격
- ✅ 弹幕字间距
- ✅ Danmaku Font Spacing
- ✅ コメント文字間隔
- ✅ 댓글 글자 간격

### v47.3 曝光补偿 | Exposure Compensation | 露出補正 | 노출 보정
- ✅ 曝光补偿
- ✅ Exposure Compensation
- ✅ 露出補正
- ✅ 노출 보정

### v47.4 音量响度增强 | Volume Loudness Enhancer | 音量ラウドネス強化 | 볼륨 라우드니스 강화
- ✅ 音量响度增强
- ✅ Volume Loudness Enhancer
- ✅ 音量ラウドネス強化
- ✅ 볼륨 라우드니스 강화

### v47.5 弹幕描边模糊 | Danmaku Stroke Blur | コメントストロークぼかし | 댓글 스트로크 블러
- ✅ 弹幕描边模糊
- ✅ Danmaku Stroke Blur
- ✅ コメントストロークぼかし
- ✅ 댓글 스트로크 블러

### v47.6 投射音频码率 | Cast Audio Bitrate | キャスト音声ビットレート | 캐스트 오디오 비트레이트
- ✅ 投射音频码率
- ✅ Cast Audio Bitrate
- ✅ キャスト音声ビットレート
- ✅ 캐스트 오디오 비트레이트

### v47.7 手势死区 | Gesture Dead Zone | ジェスチャーデッドゾーン | 제스처 데드존
- ✅ 手势死区
- ✅ Gesture Dead Zone
- ✅ ジェスチャーデッドゾーン
- ✅ 제스처 데드존

### v47.8 弹幕最大行数 | Danmaku Max Lines | コメント最大行数 | 댓글 최대 줄 수
- ✅ 弹幕最大行数
- ✅ Danmaku Max Lines
- ✅ コメント最大行数
- ✅ 댓글 최대 줄 수

### v47.9 缓存最大大小 | Cache Max Size | キャッシュ最大サイズ | 캐시 최대 크기
- ✅ 缓存最大大小
- ✅ Cache Max Size
- ✅ キャッシュ最大サイズ
- ✅ 캐시 최대 크기

### v47.10 进度条预览 | Progress Bar Seek Preview | プログレスバーシークプレビュー | 진행 바 탐색 미리보기
- ✅ 进度条预览
- ✅ Progress Bar Seek Preview
- ✅ プログレスバーシークプレビュー
- ✅ 진행 바 탐색 미리보기

### v47.11 弹幕@高亮 | Danmaku Highlight Mention | コメント@ハイライト | 댓글 @강조
- ✅ 弹幕@高亮
- ✅ Danmaku Highlight Mention
- ✅ コメント@ハイライト
- ✅ 댓글 @강조

### v47.12 色彩色调 | Color Tint | 色彩ティント | 색상 틴트
- ✅ 色彩色调
- ✅ Color Tint
- ✅ 色彩ティント
- ✅ 색상 틴트

### v47.13 声道平衡 | Volume Channel Balance | チャンネルバランス | 채널 밸런스
- ✅ 声道平衡
- ✅ Volume Channel Balance
- ✅ チャンネルバランス
- ✅ 채널 밸런스

### v47.14 弹幕背景边框颜色 | Danmaku Bg Border Color | コメント背景ボーダー色 | 댓글 배경 테두리 색상
- ✅ 弹幕背景边框颜色
- ✅ Danmaku Bg Border Color
- ✅ コメント背景ボーダー色
- ✅ 댓글 배경 테두리 색상

### v47.15 投射字幕开关 | Cast Subtitle Enabled | キャスト字幕有効化 | 캐스트 자막 활성화
- ✅ 投射字幕开关
- ✅ Cast Subtitle Enabled
- ✅ キャスト字幕有効化
- ✅ 캐스트 자막 활성화

### v48.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v48.1-v48.15 功能列表
- ✅ Skip Intro, Danmaku Line Height, Color Black Level, Volume Bass Boost, Danmaku Max Length, Resolution Auto, Danmaku Tap Feedback, Danmaku Filter Regex, Cache Cleanup Interval, Progress Bar Touch Area, Danmaku Font Size Adaptive, Color White Level, Volume Virtualizer, Danmaku Bg Shadow Size, Cast Mirror Quality

### v48.1 跳过片头 | Skip Intro | イントロスキップ | 인트로 건너뛰기
- ✅ 跳过片头
- ✅ Skip Intro
- ✅ イントロスキップ
- ✅ 인트로 건너뛰기

### v48.2 弹幕行高 | Danmaku Line Height | コメント行の高さ | 댓글 줄 높이
- ✅ 弹幕行高
- ✅ Danmaku Line Height
- ✅ コメント行の高さ
- ✅ 댓글 줄 높이

### v48.3 黑电平 | Color Black Level | ブラックレベル | 블랙 레벨
- ✅ 黑电平
- ✅ Color Black Level
- ✅ ブラックレベル
- ✅ 블랙 레벨

### v48.4 低音增强 | Volume Bass Boost | バスブースト | 베이스 부스트
- ✅ 低音增强
- ✅ Volume Bass Boost
- ✅ バスブースト
- ✅ 베이스 부스트

### v48.5 弹幕最大长度 | Danmaku Max Length | コメント最大長 | 댓글 최대 길이
- ✅ 弹幕最大长度
- ✅ Danmaku Max Length
- ✅ コメント最大長
- ✅ 댓글 최대 길이

### v48.6 自动分辨率 | Resolution Auto | 解像度自動 | 해상도 자동
- ✅ 自动分辨率
- ✅ Resolution Auto
- ✅ 解像度自動
- ✅ 해상도 자동

### v48.7 弹幕点击反馈 | Danmaku Tap Feedback | コメントタップフィードバック | 댓글 탭 피드백
- ✅ 弹幕点击反馈
- ✅ Danmaku Tap Feedback
- ✅ コメントタップフィードバック
- ✅ 댓글 탭 피드백

### v48.8 弹幕正则过滤 | Danmaku Filter Regex | コメント正規表現フィルター | 댓글 정규식 필터
- ✅ 弹幕正则过滤
- ✅ Danmaku Filter Regex
- ✅ コメント正規表現フィルター
- ✅ 댓글 정규식 필터

### v48.9 缓存清理间隔 | Cache Cleanup Interval | キャッシュクリーンアップ間隔 | 캐시 정리 간격
- ✅ 缓存清理间隔
- ✅ Cache Cleanup Interval
- ✅ キャッシュクリーンアップ間隔
- ✅ 캐시 정리 간격

### v48.10 进度条触摸区域 | Progress Bar Touch Area | プログレスバータッチエリア | 진행 바 터치 영역
- ✅ 进度条触摸区域
- ✅ Progress Bar Touch Area
- ✅ プログレスバータッチエリア
- ✅ 진행 바 터치 영역

### v48.11 弹幕字号自适应 | Danmaku Font Size Adaptive | コメントフォントサイズ自動調整 | 댓글 글꼴 크기 적응
- ✅ 弹幕字号自适应
- ✅ Danmaku Font Size Adaptive
- ✅ コメントフォントサイズ自動調整
- ✅ 댓글 글꼴 크기 적응

### v48.12 白色等级 | Color White Level | ホワイトレベル | 화이트 레벨
- ✅ 白色等级
- ✅ Color White Level
- ✅ ホワイトレベル
- ✅ 화이트 레벨

### v48.13 音量虚拟器 | Volume Virtualizer | バーチャライザー | 버추얼라이저
- ✅ 音量虚拟器
- ✅ Volume Virtualizer
- ✅ バーチャライザー
- ✅ 버추얼라이저

### v48.14 弹幕背景阴影大小 | Danmaku Bg Shadow Size | コメント背景シャドウサイズ | 댓글 배경 그림자 크기
- ✅ 弹幕背景阴影大小
- ✅ Danmaku Bg Shadow Size
- ✅ コメント背景シャドウサイズ
- ✅ 댓글 배경 그림자 크기

### v48.15 投射镜像质量 | Cast Mirror Quality | キャストミラー品質 | 캐스트 미러 품질
- ✅ 投射镜像质量
- ✅ Cast Mirror Quality
- ✅ キャストミラー品質
- ✅ 캐스트 미러 품질

### v49.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v49.1-v49.15 功能列表
- ✅ Auto Skip Outro, Danmaku Font Letter Spacing, Color Highlight Recovery, Volume Treble Boost, Danmaku Send Font Size, Cast Audio Sync, Gesture Long Press Action, Danmaku Filter Duplicate, Cache Auto Cleanup Threshold, Progress Bar Chapter Mark, Danmaku Highlight Keyword, Color Shadow Recovery, Volume Replay Gain, Danmaku Bg Gradient Angle, Cast Auto Reconnect

### v49.1 自动跳片尾 | Auto Skip Outro | 自動アウトロスキップ | 자동 아웃트로 건너뛰기
- ✅ 自动跳片尾
- ✅ Auto Skip Outro
- ✅ 自動アウトロスキップ
- ✅ 자동 아웃트로 건너뛰기

### v49.2 弹幕字母间距 | Danmaku Font Letter Spacing | コメント文字間隔 | 댓글 글자 간격
- ✅ 弹幕字母间距
- ✅ Danmaku Font Letter Spacing
- ✅ コメント文字間隔
- ✅ 댓글 글자 간격

### v49.3 高光恢复 | Color Highlight Recovery | ハイライト回復 | 하이라이트 복구
- ✅ 高光恢复
- ✅ Color Highlight Recovery
- ✅ ハイライト回復
- ✅ 하이라이트 복구

### v49.4 高音增强 | Volume Treble Boost | トレブルブースト | 트레블 부스트
- ✅ 高音增强
- ✅ Volume Treble Boost
- ✅ トレブルブースト
- ✅ 트레블 부스트

### v49.5 弹幕发送字号 | Danmaku Send Font Size | コメント送信フォントサイズ | 댓글 전송 글꼴 크기
- ✅ 弹幕发送字号
- ✅ Danmaku Send Font Size
- ✅ コメント送信フォントサイズ
- ✅ 댓글 전송 글꼴 크기

### v49.6 投射音频同步 | Cast Audio Sync | キャスト音声同期 | 캐스트 오디오 동기화
- ✅ 投射音频同步
- ✅ Cast Audio Sync
- ✅ キャスト音声同期
- ✅ 캐스트 오디오 동기화

### v49.7 长按手势动作 | Gesture Long Press Action | ジェスチャー長押しアクション | 제스처 길게 누르기 동작
- ✅ 长按手势动作
- ✅ Gesture Long Press Action
- ✅ ジェスチャー長押しアクション
- ✅ 제스처 길게 누르기 동작

### v49.8 弹幕去重过滤 | Danmaku Filter Duplicate | コメント重複フィルター | 댓글 중복 필터
- ✅ 弹幕去重过滤
- ✅ Danmaku Filter Duplicate
- ✅ コメント重複フィルター
- ✅ 댓글 중복 필터

### v49.9 缓存自动清理阈值 | Cache Auto Cleanup Threshold | キャッシュ自動クリーンアップ閾値 | 캐시 자동 정리 임계값
- ✅ 缓存自动清理阈值
- ✅ Cache Auto Cleanup Threshold
- ✅ キャッシュ自動クリーンアップ閾値
- ✅ 캐시 자동 정리 임계값

### v49.10 进度条章节标记 | Progress Bar Chapter Mark | プログレスバーチャプターマーク | 진행 바 챕터 마크
- ✅ 进度条章节标记
- ✅ Progress Bar Chapter Mark
- ✅ プログレスバーチャプターマーク
- ✅ 진행 바 챕터 마크

### v49.11 弹幕关键词高亮 | Danmaku Highlight Keyword | コメントキーワードハイライト | 댓글 키워드 강조
- ✅ 弹幕关键词高亮
- ✅ Danmaku Highlight Keyword
- ✅ コメントキーワードハイライト
- ✅ 댓글 키워드 강조

### v49.12 暗部恢复 | Color Shadow Recovery | シャドウ回復 | 그림자 복구
- ✅ 暗部恢复
- ✅ Color Shadow Recovery
- ✅ シャドウ回復
- ✅ 그림자 복구

### v49.13 回放增益 | Volume Replay Gain | リプレイゲイン | 리플레이 게인
- ✅ 回放增益
- ✅ Volume Replay Gain
- ✅ リプレイゲイン
- ✅ 리플레이 게인

### v49.14 弹幕渐变角度 | Danmaku Bg Gradient Angle | コメントグラデーション角度 | 댓글 그라데이션 각도
- ✅ 弹幕渐变角度
- ✅ Danmaku Bg Gradient Angle
- ✅ コメントグラデーション角度
- ✅ 댓글 그라데이션 각도

### v49.15 投射自动重连 | Cast Auto Reconnect | キャスト自動再接続 | 캐스트 자동 재연결
- ✅ 投射自动重连
- ✅ Cast Auto Reconnect
- ✅ キャスト自動再接続
- ✅ 캐스트 자동 재연결

### v50.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v50.1-v50.15 功能列表
- ✅ Auto Next Episode, Danmaku Font Shadow Size, Color Midtone Adjust, Volume Ambient Mode, Danmaku Send Color Custom, Cast Volume Sync, Gesture Pinch Zoom, Danmaku Filter Color, Cache Prebuffer Seconds, Progress Bar Double Tap Seek, Danmaku Font Size Auto, Color Dynamic Range, Volume Night Mode, Danmaku Bg Blur Radius, Cast Auto Discover

### v50.1 自动下一集 | Auto Next Episode | 自動次エピソード | 자동 다음 에피소드
- ✅ 自动下一集
- ✅ Auto Next Episode
- ✅ 自動次エピソード
- ✅ 자동 다음 에피소드

### v50.2 弹幕阴影大小 | Danmaku Font Shadow Size | コメントシャドウサイズ | 댓글 그림자 크기
- ✅ 弹幕阴影大小
- ✅ Danmaku Font Shadow Size
- ✅ コメントシャドウサイズ
- ✅ 댓글 그림자 크기

### v50.3 中间调调整 | Color Midtone Adjust | ミッドトーン調整 | 미드톤 조정
- ✅ 中间调调整
- ✅ Color Midtone Adjust
- ✅ ミッドトーン調整
- ✅ 미드톤 조정

### v50.4 环境音模式 | Volume Ambient Mode | アンビエントモード | 앰비언트 모드
- ✅ 环境音模式
- ✅ Volume Ambient Mode
- ✅ アンビエントモード
- ✅ 앰비언트 모드

### v50.5 弹幕发送颜色自定义 | Danmaku Send Color Custom | コメント送信色カスタム | 댓글 전송 색상 사용자 정의
- ✅ 弹幕发送颜色自定义
- ✅ Danmaku Send Color Custom
- ✅ コメント送信色カスタム
- ✅ 댓글 전송 색상 사용자 정의

### v50.6 投射音量同步 | Cast Volume Sync | キャスト音量同期 | 캐스트 볼륨 동기화
- ✅ 投射音量同步
- ✅ Cast Volume Sync
- ✅ キャスト音量同期
- ✅ 캐스트 볼륨 동기화

### v50.7 手势缩放 | Gesture Pinch Zoom | ジェスチャーピンチズーム | 제스처 핀치 줌
- ✅ 手势缩放
- ✅ Gesture Pinch Zoom
- ✅ ジェスチャーピンチズーム
- ✅ 제스처 핀치 줌

### v50.8 弹幕颜色过滤 | Danmaku Filter Color | コメント色フィルター | 댓글 색상 필터
- ✅ 弹幕颜色过滤
- ✅ Danmaku Filter Color
- ✅ コメント色フィルター
- ✅ 댓글 색상 필터

### v50.9 缓存预缓冲秒数 | Cache Prebuffer Seconds | キャッシュプリバッファ秒 | 캐시 프리버퍼 초
- ✅ 缓存预缓冲秒数
- ✅ Cache Prebuffer Seconds
- ✅ キャッシュプリバッファ秒
- ✅ 캐시 프리버퍼 초

### v50.10 双击快进秒数 | Progress Bar Double Tap Seek | ダブルタップシーク秒 | 더블 탭 탐색 초
- ✅ 双击快进秒数
- ✅ Progress Bar Double Tap Seek
- ✅ ダブルタップシーク秒
- ✅ 더블 탭 탐색 초

### v50.11 弹幕字号自动 | Danmaku Font Size Auto | コメントフォントサイズ自動 | 댓글 글꼴 크기 자동
- ✅ 弹幕字号自动
- ✅ Danmaku Font Size Auto
- ✅ コメントフォントサイズ自動
- ✅ 댓글 글꼴 크기 자동

### v50.12 动态范围 | Color Dynamic Range | ダイナミックレンジ | 다이나믹 레인지
- ✅ 动态范围
- ✅ Color Dynamic Range
- ✅ ダイナミックレンジ
- ✅ 다이나믹 레인지

### v50.13 夜间音量模式 | Volume Night Mode | ナイトモード | 나이트 모드
- ✅ 夜间音量模式
- ✅ Volume Night Mode
- ✅ ナイトモード
- ✅ 나이트 모드

### v50.14 弹幕背景模糊半径 | Danmaku Bg Blur Radius | コメント背景ぼかし半径 | 댓글 배경 블러 반경
- ✅ 弹幕背景模糊半径
- ✅ Danmaku Bg Blur Radius
- ✅ コメント背景ぼかし半径
- ✅ 댓글 배경 블러 반경

### v50.15 投射自动发现 | Cast Auto Discover | キャスト自動検出 | 캐스트 자동 검색
- ✅ 投射自动发现
- ✅ Cast Auto Discover
- ✅ キャスト自動検出
- ✅ 캐스트 자동 검색

### v51.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v51.1-v51.15 功能列表
- ✅ Auto Skip Intro, Danmaku Outline Width, Shadow Adjust, Loudness Normalize, Send Bg Style, Cast Video Codec, Double Tap Rewind, Filter Length, Cache Max Size, Scrub Speed, Font Spacing, Gamma Correction, Bass Reduce, Bg Border Color, Cast Subtitle Sync

### v51.1 自动跳片头 | Auto Skip Intro | 自動イントロスキップ | 자동 인트로 건너뛰기
- ✅ 自动跳片头
- ✅ Auto Skip Intro
- ✅ 自動イントロスキップ
- ✅ 자동 인트로 건너뛰기

### v51.2 弹幕描边宽度 | Danmaku Outline Width | コメントアウトライン幅 | 댓글 아웃라인 너비
- ✅ 弹幕描边宽度
- ✅ Danmaku Outline Width
- ✅ コメントアウトライン幅
- ✅ 댓글 아웃라인 너비

### v51.3 暗部调整 | Shadow Adjust | シャドウ調整 | 그림자 조정
- ✅ 暗部调整
- ✅ Shadow Adjust
- ✅ シャドウ調整
- ✅ 그림자 조정

### v51.4 响度标准化 | Loudness Normalize | ラウドネス正規化 | 라우드니스 정규화
- ✅ 响度标准化
- ✅ Loudness Normalize
- ✅ ラウドネス正規化
- ✅ 라우드니스 정규화

### v51.5 发送背景样式 | Send Bg Style | 送信背景スタイル | 전송 배경 스타일
- ✅ 发送背景样式
- ✅ Send Bg Style
- ✅ 送信背景スタイル
- ✅ 전송 배경 스타일

### v51.6 投射视频编码 | Cast Video Codec | キャスト動画コーデック | 캐스트 비디오 코덱
- ✅ 投射视频编码
- ✅ Cast Video Codec
- ✅ キャスト動画コーデック
- ✅ 캐스트 비디오 코덱

### v51.7 双击快退 | Double Tap Rewind | ダブルタップ巻き戻し | 더블 탭 되감기
- ✅ 双击快退
- ✅ Double Tap Rewind
- ✅ ダブルタップ巻き戻し
- ✅ 더블 탭 되감기

### v51.8 弹幕长度过滤 | Filter Length | フィルター長さ | 필터 길이
- ✅ 弹幕长度过滤
- ✅ Filter Length
- ✅ フィルター長さ
- ✅ 필터 길이

### v51.9 缓存最大大小 | Cache Max Size | キャッシュ最大サイズ | 캐시 최대 크기
- ✅ 缓存最大大小
- ✅ Cache Max Size
- ✅ キャッシュ最大サイズ
- ✅ 캐시 최대 크기

### v51.10 滑动速度 | Scrub Speed | スクラブ速度 | 스크럽 속도
- ✅ 滑动速度
- ✅ Scrub Speed
- ✅ スクラブ速度
- ✅ 스크럽 속도

### v51.11 字间距 | Font Spacing | フォント間隔 | 글꼴 간격
- ✅ 字间距
- ✅ Font Spacing
- ✅ フォント間隔
- ✅ 글꼴 간격

### v51.12 伽马校正 | Gamma Correction | ガンマ補正 | 감마 보정
- ✅ 伽马校正
- ✅ Gamma Correction
- ✅ ガンマ補正
- ✅ 감마 보정

### v51.13 低音减弱 | Bass Reduce | バス軽減 | 베이스 감소
- ✅ 低音减弱
- ✅ Bass Reduce
- ✅ バス軽減
- ✅ 베이스 감소

### v51.14 背景边框颜色 | Bg Border Color | 背景ボーダー色 | 배경 테두리 색상
- ✅ 背景边框颜色
- ✅ Bg Border Color
- ✅ 背景ボーダー色
- ✅ 배경 테두리 색상

### v51.15 投射字幕同步 | Cast Subtitle Sync | キャスト字幕同期 | 캐스트 자막 동기화
- ✅ 投射字幕同步
- ✅ Cast Subtitle Sync
- ✅ キャスト字幕同期
- ✅ 캐스트 자막 동기화

### v52.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v52.1-v52.15 功能列表
- ✅ Auto Skip Filler, Line Height, Color Temperature, Channel Swap, Send Anim Style, Cast Resolution Enhance, Swipe Seek, Filter Speed, Prefetch Size, Progress Chapters, Shadow Blur, Saturation Auto, Volume Fade In, Bg Gradient Color, Cast Latency Mode

### v52.1 自动跳离题 | Auto Skip Filler | 自動フィラースキップ | 자동 필러 건너뛰기
- ✅ 自动跳离题
- ✅ Auto Skip Filler
- ✅ 自動フィラースキップ
- ✅ 자동 필러 건너뛰기

### v52.2 行高 | Line Height | 行の高さ | 줄 높이
- ✅ 行高
- ✅ Line Height
- ✅ 行の高さ
- ✅ 줄 높이

### v52.3 色温 | Color Temperature | 色温度 | 색온도
- ✅ 色温
- ✅ Color Temperature
- ✅ 色温度
- ✅ 색온도

### v52.4 声道交换 | Channel Swap | チャンネルスワップ | 채널 스왑
- ✅ 声道交换
- ✅ Channel Swap
- ✅ チャンネルスワップ
- ✅ 채널 스왑

### v52.5 发送动画样式 | Send Anim Style | 送信アニメーションスタイル | 전송 애니메이션 스타일
- ✅ 发送动画样式
- ✅ Send Anim Style
- ✅ 送信アニメーションスタイル
- ✅ 전송 애니메이션 스타일

### v52.6 投射分辨率增强 | Cast Resolution Enhance | キャスト解像度強化 | 캐스트 해상도 강화
- ✅ 投射分辨率增强
- ✅ Cast Resolution Enhance
- ✅ キャスト解像度強化
- ✅ 캐스트 해상도 강화

### v52.7 滑动快进 | Swipe Seek | スワイプシーク | 스와이프 탐색
- ✅ 滑动快进
- ✅ Swipe Seek
- ✅ スワイプシーク
- ✅ 스와이프 탐색

### v52.8 弹幕速度过滤 | Filter Speed | フィルター速度 | 필터 속도
- ✅ 弹幕速度过滤
- ✅ Filter Speed
- ✅ フィルター速度
- ✅ 필터 속도

### v52.9 预取大小 | Prefetch Size | プリフェッチサイズ | 프리페치 크기
- ✅ 预取大小
- ✅ Prefetch Size
- ✅ プリフェッチサイズ
- ✅ 프리페치 크기

### v52.10 进度条章节 | Progress Chapters | プログレスチャプター | 진행 바 챕터
- ✅ 进度条章节
- ✅ Progress Chapters
- ✅ プログレスチャプター
- ✅ 진행 바 챕터

### v52.11 阴影模糊 | Shadow Blur | シャドウぼかし | 그림자 블러
- ✅ 阴影模糊
- ✅ Shadow Blur
- ✅ シャドウぼかし
- ✅ 그림자 블러

### v52.12 自动饱和度 | Saturation Auto | 彩度自動 | 채도 자동
- ✅ 自动饱和度
- ✅ Saturation Auto
- ✅ 彩度自動
- ✅ 채도 자동

### v52.13 音量淡入 | Volume Fade In | 音量フェードイン | 볼륨 페이드 인
- ✅ 音量淡入
- ✅ Volume Fade In
- ✅ 音量フェードイン
- ✅ 볼륨 페이드 인

### v52.14 背景渐变颜色 | Bg Gradient Color | 背景グラデーション色 | 배경 그라데이션 색상
- ✅ 背景渐变颜色
- ✅ Bg Gradient Color
- ✅ 背景グラデーション色
- ✅ 배경 그라데이션 색상

### v52.15 投射延迟模式 | Cast Latency Mode | キャスト遅延モード | 캐스트 지연 모드
- ✅ 投射延迟模式
- ✅ Cast Latency Mode
- ✅ キャスト遅延モード
- ✅ 캐스트 지연 모드

### v53.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v53.1-v53.15 功能列表
- ✅ Auto Pause, Font Italic, Vignette Custom, Volume Fade Out, Send Timestamp, Cast Audio Codec, Volume Step, Filter Type, Cleanup Policy, Progress Snap, Font Strike, Black Level, Balance Custom, Bg Rounded, Cast Auto Pause

### v53.1 自动暂停 | Auto Pause | 自動一時停止 | 자동 일시정지
- ✅ 自动暂停
- ✅ Auto Pause
- ✅ 自動一時停止
- ✅ 자동 일시정지

### v53.2 弹幕斜体 | Font Italic | フォントイタリック | 글꼴 이탤릭
- ✅ 弹幕斜体
- ✅ Font Italic
- ✅ フォントイタリック
- ✅ 글꼴 이탤릭

### v53.3 自定义暗角 | Vignette Custom | ビネットカスタム | 비네트 사용자 정의
- ✅ 自定义暗角
- ✅ Vignette Custom
- ✅ ビネットカスタム
- ✅ 비네트 사용자 정의

### v53.4 音量淡出 | Volume Fade Out | 音量フェードアウト | 볼륨 페이드 아웃
- ✅ 音量淡出
- ✅ Volume Fade Out
- ✅ 音量フェードアウト
- ✅ 볼륨 페이드 아웃

### v53.5 发送时间戳 | Send Timestamp | 送信タイムスタンプ | 전송 타임스탬프
- ✅ 发送时间戳
- ✅ Send Timestamp
- ✅ 送信タイムスタンプ
- ✅ 전송 타임스탬프

### v53.6 投射音频编码 | Cast Audio Codec | キャスト音声コーデック | 캐스트 오디오 코덱
- ✅ 投射音频编码
- ✅ Cast Audio Codec
- ✅ キャスト音声コーデック
- ✅ 캐스트 오디오 코덱

### v53.7 音量步进 | Volume Step | 音量ステップ | 볼륨 스텝
- ✅ 音量步进
- ✅ Volume Step
- ✅ 音量ステップ
- ✅ 볼륨 스텝

### v53.8 弹幕类型过滤 | Filter Type | フィルタータイプ | 필터 유형
- ✅ 弹幕类型过滤
- ✅ Filter Type
- ✅ フィルタータイプ
- ✅ 필터 유형

### v53.9 清理策略 | Cleanup Policy | クリーンアップポリシー | 정리 정책
- ✅ 清理策略
- ✅ Cleanup Policy
- ✅ クリーンアップポリシー
- ✅ 정리 정책

### v53.10 进度条吸附 | Progress Snap | プログレススナップ | 진행 바 스냅
- ✅ 进度条吸附
- ✅ Progress Snap
- ✅ プログレススナップ
- ✅ 진행 바 스냅

### v53.11 弹幕删除线 | Font Strike | フォント取り消し線 | 글꼴 취소선
- ✅ 弹幕删除线
- ✅ Font Strike
- ✅ フォント取り消し線
- ✅ 글꼴 취소선

### v53.12 黑电平 | Black Level | ブラックレベル | 블랙 레벨
- ✅ 黑电平
- ✅ Black Level
- ✅ ブラックレベル
- ✅ 블랙 레벨

### v53.13 自定义声道平衡 | Balance Custom | バランスカスタム | 밸런스 사용자 정의
- ✅ 自定义声道平衡
- ✅ Balance Custom
- ✅ バランスカスタム
- ✅ 밸런스 사용자 정의

### v53.14 背景圆角 | Bg Rounded | 背景角丸 | 배경 둥근 모서리
- ✅ 背景圆角
- ✅ Bg Rounded
- ✅ 背景角丸
- ✅ 배경 둥근 모서리

### v53.15 投射自动暂停 | Cast Auto Pause | キャスト自動一時停止 | 캐스트 자동 일시정지
- ✅ 投射自动暂停
- ✅ Cast Auto Pause
- ✅ キャスト自動一時停止
- ✅ 캐스트 자동 일시정지

### v54.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v54.1-v54.15 功能列表
- ✅ Resume Position, Font Size Range, Color Brightness, Surround Mode, Send Draft, Cast Screen Mirror, Brightness Step, Filter User, Wakeup Prefetch, Progress Haptic, Font Underline, Color Contrast, Auto Gain, Bg Gradient Direction, Cast Subtitle Lang

### v54.1 记忆恢复位置 | Resume Position | 再開位置メモリ | 재개 위치 기억
- ✅ 记忆恢复位置
- ✅ Resume Position
- ✅ 再開位置メモリ
- ✅ 재개 위치 기억

### v54.2 字号范围 | Font Size Range | フォントサイズ範囲 | 글꼴 크기 범위
- ✅ 字号范围
- ✅ Font Size Range
- ✅ フォントサイズ範囲
- ✅ 글꼴 크기 범위

### v54.3 亮度调节 | Color Brightness | 輝度調整 | 밝기 조정
- ✅ 亮度调节
- ✅ Color Brightness
- ✅ 輝度調整
- ✅ 밝기 조정

### v54.4 环绕声模式 | Surround Mode | サラウンドモード | 서라운드 모드
- ✅ 环绕声模式
- ✅ Surround Mode
- ✅ サラウンドモード
- ✅ 서라운드 모드

### v54.5 弹幕草稿箱 | Send Draft | 送信ドラフト | 전송 드래프트
- ✅ 弹幕草稿箱
- ✅ Send Draft
- ✅ 送信ドラフト
- ✅ 전송 드래프트

### v54.6 投射屏幕镜像 | Cast Screen Mirror | キャスト画面ミラー | 캐스트 화면 미러
- ✅ 投射屏幕镜像
- ✅ Cast Screen Mirror
- ✅ キャスト画面ミラー
- ✅ 캐스트 화면 미러

### v54.7 亮度手势步进 | Brightness Step | 輝度ステップ | 밝기 스텝
- ✅ 亮度手势步进
- ✅ Brightness Step
- ✅ 輝度ステップ
- ✅ 밝기 스텝

### v54.8 弹幕用户过滤 | Filter User | ユーザーフィルター | 사용자 필터
- ✅ 弹幕用户过滤
- ✅ Filter User
- ✅ ユーザーフィルター
- ✅ 사용자 필터

### v54.9 唤醒预加载 | Wakeup Prefetch | ウェイクアッププリロード | 웨이크업 프리로드
- ✅ 唤醒预加载
- ✅ Wakeup Prefetch
- ✅ ウェイクアッププリロード
- ✅ 웨이크업 프리로드

### v54.10 进度条震动 | Progress Haptic | プログレスハプティック | 진행 바 햅틱
- ✅ 进度条震动
- ✅ Progress Haptic
- ✅ プログレスハプティック
- ✅ 진행 바 햅틱

### v54.11 弹幕下划线 | Font Underline | フォント下線 | 글꼴 밑줄
- ✅ 弹幕下划线
- ✅ Font Underline
- ✅ フォント下線
- ✅ 글꼴 밑줄

### v54.12 对比度 | Color Contrast | コントラスト | 대비
- ✅ 对比度
- ✅ Color Contrast
- ✅ コントラスト
- ✅ 대비

### v54.13 自动增益 | Auto Gain | 自動ゲイン | 자동 게인
- ✅ 自动增益
- ✅ Auto Gain
- ✅ 自動ゲイン
- ✅ 자동 게인

### v54.14 背景渐变方向 | Bg Gradient Direction | 背景グラデーション方向 | 배경 그라데이션 방향
- ✅ 背景渐变方向
- ✅ Bg Gradient Direction
- ✅ 背景グラデーション方向
- ✅ 배경 그라데이션 방향

### v54.15 投射字幕语言 | Cast Subtitle Lang | キャスト字幕言語 | 캐스트 자막 언어
- ✅ 投射字幕语言
- ✅ Cast Subtitle Lang
- ✅ キャスト字幕言語
- ✅ 캐스트 자막 언어


### v56.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v56.1-v56.15 功能列表
- ✅ Skip Silence, Font Weight Auto, Color Reduction, Stereo Widen, Send Priority, Cast Auto Rotate, Long Press Speed, Filter Score, Cache Compress, Chapters Color, Letter Spacing2, Saturation Curve, Volume Pre Amp, Gradient Opacity, Cast Subtitle Style

### v56.1 跳过静音 | Skip Silence | 無音スキップ | 무음 건너뛰기
- ✅ 跳过静音
- ✅ Skip Silence
- ✅ 無音スキップ
- ✅ 무음 건너뛰기

### v56.2 字体粗细自动 | Font Weight Auto | フォント太さ自動 | 글꼴 두께 자동
- ✅ 字体粗细自动
- ✅ Font Weight Auto
- ✅ フォント太さ自動
- ✅ 글꼴 두께 자동

### v56.3 色彩降低 | Color Reduction | 色削減 | 색상 감소
- ✅ 色彩降低
- ✅ Color Reduction
- ✅ 色削減
- ✅ 색상 감소

### v56.4 立体声加宽 | Stereo Widen | ステレオワイド | 스테레오 확장
- ✅ 立体声加宽
- ✅ Stereo Widen
- ✅ ステレオワイド
- ✅ 스테레오 확장

### v56.5 发送优先级 | Send Priority | 送信優先度 | 전송 우선순위
- ✅ 发送优先级
- ✅ Send Priority
- ✅ 送信優先度
- ✅ 전송 우선순위

### v56.6 投射自动旋转 | Cast Auto Rotate | キャスト自動回転 | 캐스트 자동 회전
- ✅ 投射自动旋转
- ✅ Cast Auto Rotate
- ✅ キャスト自動回転
- ✅ 캐스트 자동 회전

### v56.7 长按速度 | Long Press Speed | 長押し速度 | 길게 누르기 속도
- ✅ 长按速度
- ✅ Long Press Speed
- ✅ 長押し速度
- ✅ 길게 누르기 속도

### v56.8 弹幕评分过滤 | Filter Score | フィルタースコア | 필터 점수
- ✅ 弹幕评分过滤
- ✅ Filter Score
- ✅ フィルタースコア
- ✅ 필터 점수

### v56.9 缓存压缩 | Cache Compress | キャッシュ圧縮 | 캐시 압축
- ✅ 缓存压缩
- ✅ Cache Compress
- ✅ キャッシュ圧縮
- ✅ 캐시 압축

### v56.10 章节颜色 | Chapters Color | チャプター色 | 챕터 색상
- ✅ 章节颜色
- ✅ Chapters Color
- ✅ チャプター色
- ✅ 챕터 색상

### v56.11 字母间距2 | Letter Spacing2 | 文字間隔2 | 글자 간격2
- ✅ 字母间距2
- ✅ Letter Spacing2
- ✅ 文字間隔2
- ✅ 글자 간격2

### v56.12 饱和度曲线 | Saturation Curve | 彩度カーブ | 채도 커브
- ✅ 饱和度曲线
- ✅ Saturation Curve
- ✅ 彩度カーブ
- ✅ 채도 커브

### v56.13 音量前级放大 | Volume Pre Amp | 音量プリアンプ | 볼륨 프리앰프
- ✅ 音量前级放大
- ✅ Volume Pre Amp
- ✅ 音量プリアンプ
- ✅ 볼륨 프리앰프

### v56.14 渐变透明度 | Gradient Opacity | グラデーション透明度 | 그라데이션 투명도
- ✅ 渐变透明度
- ✅ Gradient Opacity
- ✅ グラデーション透明度
- ✅ 그라데이션 투명도

### v56.15 投射字幕样式 | Cast Subtitle Style | キャスト字幕スタイル | 캐스트 자막 스타일
- ✅ 投射字幕样式
- ✅ Cast Subtitle Style
- ✅ キャスト字幕スタイル
- ✅ 캐스트 자막 스타일

### v57.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v57.1-v57.15 功能列表
- ✅ Auto Skip Ads, Font Anti Alias, Color Vibrance, Volume Ducking, Send Repeat, Cast Auto Fullscreen, Double Tap Action2, Filter Keywords, Cache Encrypt, Buffer Color, Font Background2, Highlight Roll, Max Boost, Bg Shadow Color2, Cast Video Bitrate

### v57.1 自动跳广告 | Auto Skip Ads | 自動広告スキップ | 자동 광고 건너뛰기
- ✅ 自动跳广告
- ✅ Auto Skip Ads
- ✅ 自動広告スキップ
- ✅ 자동 광고 건너뛰기

### v57.2 字体抗锯齿 | Font Anti Alias | フォントアンチエイリアス | 글꼴 안티앨리어싱
- ✅ 字体抗锯齿
- ✅ Font Anti Alias
- ✅ フォントアンチエイリアス
- ✅ 글꼴 안티앨리어싱

### v57.3 色彩鲜艳度 | Color Vibrance | 色彩ビビッドネス | 색상 선명도
- ✅ 色彩鲜艳度
- ✅ Color Vibrance
- ✅ 色彩ビビッドネス
- ✅ 색상 선명도

### v57.4 音量闪避 | Volume Ducking | 音量ダッキング | 볼륨 더킹
- ✅ 音量闪避
- ✅ Volume Ducking
- ✅ 音量ダッキング
- ✅ 볼륨 더킹

### v57.5 发送重复 | Send Repeat | 送信繰り返し | 전송 반복
- ✅ 发送重复
- ✅ Send Repeat
- ✅ 送信繰り返し
- ✅ 전송 반복

### v57.6 投射自动全屏 | Cast Auto Fullscreen | キャスト自動フルスクリーン | 캐스트 자동 전체화면
- ✅ 投射自动全屏
- ✅ Cast Auto Fullscreen
- ✅ キャスト自動フルスクリーン
- ✅ 캐스트 자동 전체화면

### v57.7 双击动作2 | Double Tap Action2 | ダブルタップアクション2 | 더블 탭 동작2
- ✅ 双击动作2
- ✅ Double Tap Action2
- ✅ ダブルタップアクション2
- ✅ 더블 탭 동작2

### v57.8 关键词过滤 | Filter Keywords | キーワードフィルター | 키워드 필터
- ✅ 关键词过滤
- ✅ Filter Keywords
- ✅ キーワードフィルター
- ✅ 키워드 필터

### v57.9 缓存加密 | Cache Encrypt | キャッシュ暗号化 | 캐시 암호화
- ✅ 缓存加密
- ✅ Cache Encrypt
- ✅ キャッシュ暗号化
- ✅ 캐시 암호화

### v57.10 缓冲颜色 | Buffer Color | バッファ色 | 버퍼 색상
- ✅ 缓冲颜色
- ✅ Buffer Color
- ✅ バッファ色
- ✅ 버퍼 색상

### v57.11 字体背景2 | Font Background2 | フォント背景2 | 글꼴 배경2
- ✅ 字体背景2
- ✅ Font Background2
- ✅ フォント背景2
- ✅ 글꼴 배경2

### v57.12 高光滚屏 | Highlight Roll | ハイライトロール | 하이라이트 롤
- ✅ 高光滚屏
- ✅ Highlight Roll
- ✅ ハイライトロール
- ✅ 하이라이트 롤

### v57.13 最大增强 | Max Boost | 最大ブースト | 최대 부스트
- ✅ 最大增强
- ✅ Max Boost
- ✅ 最大ブースト
- ✅ 최대 부스트

### v57.14 背景阴影颜色2 | Bg Shadow Color2 | 背景シャドウ色2 | 배경 그림자 색상2
- ✅ 背景阴影颜色2
- ✅ Bg Shadow Color2
- ✅ 背景シャドウ色2
- ✅ 배경 그림자 색상2

### v57.15 投射视频码率 | Cast Video Bitrate | キャスト動画ビットレート | 캐스트 비디오 비트레이트
- ✅ 投射视频码率
- ✅ Cast Video Bitrate
- ✅ キャスト動画ビットレート
- ✅ 캐스트 비디오 비트레이트

### v58.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v58.1-v58.15 功能列表
- ✅ Auto Speed, Font Blend Mode, Color Lift, Pan Control, Send Font Size2, Cast Auto Resolution, Swipe Action2, Filter Regex2, Disk Policy, Thumb Color, Shadow Color2, Midtone Gamma, Volume EQ, Bg Border Width, Cast Audio Delay

### v58.1 自动速度 | Auto Speed | 自動速度 | 자동 속도
- ✅ 自动速度
- ✅ Auto Speed
- ✅ 自動速度
- ✅ 자동 속도

### v58.2 字体混合模式 | Font Blend Mode | フォントブレンドモード | 글꼴 블렌드 모드
- ✅ 字体混合模式
- ✅ Font Blend Mode
- ✅ フォントブレンドモード
- ✅ 글꼴 블렌드 모드

### v58.3 色彩提升 | Color Lift | リフト | 리프트
- ✅ 色彩提升
- ✅ Color Lift
- ✅ リフト
- ✅ 리프트

### v58.4 声像控制 | Pan Control | パンコントロール | 팬 컨트롤
- ✅ 声像控制
- ✅ Pan Control
- ✅ パンコントロール
- ✅ 팬 컨트롤

### v58.5 发送字号2 | Send Font Size2 | 送信フォントサイズ2 | 전송 글꼴 크기2
- ✅ 发送字号2
- ✅ Send Font Size2
- ✅ 送信フォントサイズ2
- ✅ 전송 글꼴 크기2

### v58.6 投射自动分辨率 | Cast Auto Resolution | キャスト自動解像度 | 캐스트 자동 해상도
- ✅ 投射自动分辨率
- ✅ Cast Auto Resolution
- ✅ キャスト自動解像度
- ✅ 캐스트 자동 해상도

### v58.7 滑动动作2 | Swipe Action2 | スワイプアクション2 | 스와이프 동작2
- ✅ 滑动动作2
- ✅ Swipe Action2
- ✅ スワイプアクション2
- ✅ 스와이프 동작2

### v58.8 正则过滤2 | Filter Regex2 | 正規表現フィルター2 | 정규식 필터2
- ✅ 正则过滤2
- ✅ Filter Regex2
- ✅ 正規表現フィルター2
- ✅ 정규식 필터2

### v58.9 磁盘策略 | Disk Policy | ディスクポリシー | 디스크 정책
- ✅ 磁盘策略
- ✅ Disk Policy
- ✅ ディスクポリシー
- ✅ 디스크 정책

### v58.10 滑块颜色 | Thumb Color | サム色 | 썸 색상
- ✅ 滑块颜色
- ✅ Thumb Color
- ✅ サム色
- ✅ 썸 색상

### v58.11 阴影颜色2 | Shadow Color2 | シャドウ色2 | 그림자 색상2
- ✅ 阴影颜色2
- ✅ Shadow Color2
- ✅ シャドウ色2
- ✅ 그림자 색상2

### v58.12 中间调伽马 | Midtone Gamma | ミッドトーンガンマ | 미드톤 감마
- ✅ 中间调伽马
- ✅ Midtone Gamma
- ✅ ミッドトーンガンマ
- ✅ 미드톤 감마

### v58.13 音量均衡器 | Volume EQ | 音量イコライザー | 볼륨 EQ
- ✅ 音量均衡器
- ✅ Volume EQ
- ✅ 音量イコライザー
- ✅ 볼륨 EQ

### v58.14 背景边框宽度 | Bg Border Width | 背景ボーダー幅 | 배경 테두리 너비
- ✅ 背景边框宽度
- ✅ Bg Border Width
- ✅ 背景ボーダー幅
- ✅ 배경 테두리 너비

### v58.15 投射音频延迟 | Cast Audio Delay | キャスト音声遅延 | 캐스트 오디오 지연
- ✅ 投射音频延迟
- ✅ Cast Audio Delay
- ✅ キャスト音声遅延
- ✅ 캐스트 오디오 지연

### v59.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v59.1-v59.15 功能列表
- ✅ Skip Blank, Outline Color, Color Gain, Volume Reverb, Send Bg Color, Cast Auto Connect, Long Press Action2, Filter Lang, Memory Policy, Track Color, Stroke Color2, Shadow Gamma, Volume Crossfeed, Bg Gradient Color2, Cast Video Quality

### v59.1 跳过空白 | Skip Blank | ブランクスキップ | 빈 화면 건너뛰기
- ✅ 跳过空白
- ✅ Skip Blank
- ✅ ブランクスキップ
- ✅ 빈 화면 건너뛰기

### v59.2 描边颜色 | Outline Color | アウトライン色 | 아웃라인 색상
- ✅ 描边颜色
- ✅ Outline Color
- ✅ アウトライン色
- ✅ 아웃라인 색상

### v59.3 色彩增益 | Color Gain | ゲイン | 게인
- ✅ 色彩增益
- ✅ Color Gain
- ✅ ゲイン
- ✅ 게인

### v59.4 音量混响 | Volume Reverb | リバーブ | 리버브
- ✅ 音量混响
- ✅ Volume Reverb
- ✅ リバーブ
- ✅ 리버브

### v59.5 发送背景颜色 | Send Bg Color | 送信背景色 | 전송 배경 색상
- ✅ 发送背景颜色
- ✅ Send Bg Color
- ✅ 送信背景色
- ✅ 전송 배경 색상

### v59.6 投射自动连接 | Cast Auto Connect | キャスト自動接続 | 캐스트 자동 연결
- ✅ 投射自动连接
- ✅ Cast Auto Connect
- ✅ キャスト自動接続
- ✅ 캐스트 자동 연결

### v59.7 长按动作2 | Long Press Action2 | 長押しアクション2 | 길게 누르기 동작2
- ✅ 长按动作2
- ✅ Long Press Action2
- ✅ 長押しアクション2
- ✅ 길게 누르기 동작2

### v59.8 语言过滤 | Filter Lang | 言語フィルター | 언어 필터
- ✅ 语言过滤
- ✅ Filter Lang
- ✅ 言語フィルター
- ✅ 언어 필터

### v59.9 内存策略 | Memory Policy | メモリポリシー | 메모리 정책
- ✅ 内存策略
- ✅ Memory Policy
- ✅ メモリポリシー
- ✅ 메모리 정책

### v59.10 轨道颜色 | Track Color | トラック色 | 트랙 색상
- ✅ 轨道颜色
- ✅ Track Color
- ✅ トラック色
- ✅ 트랙 색상

### v59.11 描边颜色2 | Stroke Color2 | ストローク色2 | 스트로크 색상2
- ✅ 描边颜色2
- ✅ Stroke Color2
- ✅ ストローク色2
- ✅ 스트로크 색상2

### v59.12 暗部伽马 | Shadow Gamma | シャドウガンマ | 그림자 감마
- ✅ 暗部伽马
- ✅ Shadow Gamma
- ✅ シャドウガンマ
- ✅ 그림자 감마

### v59.13 交叉馈送 | Volume Crossfeed | クロスフィード | 크로스피드
- ✅ 交叉馈送
- ✅ Volume Crossfeed
- ✅ クロスフィード
- ✅ 크로스피드

### v59.14 背景渐变颜色2 | Bg Gradient Color2 | 背景グラデーション色2 | 배경 그라데이션 색상2
- ✅ 背景渐变颜色2
- ✅ Bg Gradient Color2
- ✅ 背景グラデーション色2
- ✅ 배경 그라데이션 색상2

### v59.15 投射视频质量 | Cast Video Quality | キャスト動画品質 | 캐스트 비디오 품질
- ✅ 投射视频质量
- ✅ Cast Video Quality
- ✅ キャスト動画品質
- ✅ 캐스트 비디오 품질

### v60.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v60.1-v60.15 功能列表
- ✅ Smart Buffer, Font Weight2, Highlight Gamma, Volume Delay, Send Border Color, Cast Auto Adapt, Triple Tap Action, Filter Length2, Prefetch On Charge, Scrub Preview, Font Bg Color2, Midtone Saturation, Loudness Target, Bg Opacity2, Cast Subtitle Size

### v60.1 智能缓冲 | Smart Buffer | スマートバッファ | 스마트 버퍼
- ✅ 智能缓冲
- ✅ Smart Buffer
- ✅ スマートバッファ
- ✅ 스마트 버퍼

### v60.2 字体粗细2 | Font Weight2 | フォント太さ2 | 글꼴 두께2
- ✅ 字体粗细2
- ✅ Font Weight2
- ✅ フォント太さ2
- ✅ 글꼴 두께2

### v60.3 高光伽马 | Highlight Gamma | ハイライトガンマ | 하이라이트 감마
- ✅ 高光伽马
- ✅ Highlight Gamma
- ✅ ハイライトガンマ
- ✅ 하이라이트 감마

### v60.4 音量延迟 | Volume Delay | 音量遅延 | 볼륨 지연
- ✅ 音量延迟
- ✅ Volume Delay
- ✅ 音量遅延
- ✅ 볼륨 지연

### v60.5 发送边框颜色 | Send Border Color | 送信ボーダー色 | 전송 테두리 색상
- ✅ 发送边框颜色
- ✅ Send Border Color
- ✅ 送信ボーダー色
- ✅ 전송 테두리 색상

### v60.6 投射自适应 | Cast Auto Adapt | キャスト自動適応 | 캐스트 자동 적응
- ✅ 投射自适应
- ✅ Cast Auto Adapt
- ✅ キャスト自動適応
- ✅ 캐스트 자동 적응

### v60.7 三击动作 | Triple Tap Action | トリプルタップアクション | 트리플 탭 동작
- ✅ 三击动作
- ✅ Triple Tap Action
- ✅ トリプルタップアクション
- ✅ 트리플 탭 동작

### v60.8 长度过滤2 | Filter Length2 | フィルター長さ2 | 필터 길이2
- ✅ 长度过滤2
- ✅ Filter Length2
- ✅ フィルター長さ2
- ✅ 필터 길이2

### v60.9 充电时预取 | Prefetch On Charge | 充電時プリロード | 충전 시 프리로드
- ✅ 充电时预取
- ✅ Prefetch On Charge
- ✅ 充電時プリロード
- ✅ 충전 시 프리로드

### v60.10 滑动预览 | Scrub Preview | スクラブプレビュー | 스크럽 미리보기
- ✅ 滑动预览
- ✅ Scrub Preview
- ✅ スクラブプレビュー
- ✅ 스크럽 미리보기

### v60.11 字体背景颜色2 | Font Bg Color2 | フォント背景色2 | 글꼴 배경 색상2
- ✅ 字体背景颜色2
- ✅ Font Bg Color2
- ✅ フォント背景色2
- ✅ 글꼴 배경 색상2

### v60.12 中间调饱和度 | Midtone Saturation | ミッドトーン彩度 | 미드톤 채도
- ✅ 中间调饱和度
- ✅ Midtone Saturation
- ✅ ミッドトーン彩度
- ✅ 미드톤 채도

### v60.13 响度目标 | Loudness Target | ラウドネス目標 | 라우드니스 목표
- ✅ 响度目标
- ✅ Loudness Target
- ✅ ラウドネス目標
- ✅ 라우드니스 목표

### v60.14 背景透明度2 | Bg Opacity2 | 背景透明度2 | 배경 투명도2
- ✅ 背景透明度2
- ✅ Bg Opacity2
- ✅ 背景透明度2
- ✅ 배경 투명도2

### v60.15 投射字幕大小 | Cast Subtitle Size | キャスト字幕サイズ | 캐스트 자막 크기
- ✅ 投射字幕大小
- ✅ Cast Subtitle Size
- ✅ キャスト字幕サイズ
- ✅ 캐스트 자막 크기

### v61.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v61.1-v61.15 功能列表
- ✅ Auto Quality Switch, Font Glow Color2, Black Gamma, Compressor Ratio, Send Shadow Size, Cast Audio Enhance, Edge Action, Filter Sender, Clear On Low, Progress Animation, Highlight Color, White Gamma, Compressor Attack, Bg Border Color2, Cast Subtitle Color

### v61.1 自动画质切换 | Auto Quality Switch | 自動画質切換 | 자동 화질 전환
- ✅ 自动画质切换
- ✅ Auto Quality Switch
- ✅ 自動画質切換
- ✅ 자동 화질 전환

### v61.2 字体发光颜色2 | Font Glow Color2 | フォントグロー色2 | 글꼴 글로우 색상2
- ✅ 字体发光颜色2
- ✅ Font Glow Color2
- ✅ フォントグロー色2
- ✅ 글꼴 글로우 색상2

### v61.3 黑色伽马 | Black Gamma | ブラックガンマ | 블랙 감마
- ✅ 黑色伽马
- ✅ Black Gamma
- ✅ ブラックガンマ
- ✅ 블랙 감마

### v61.4 压缩比 | Compressor Ratio | コンプレッサー比率 | 컴프레서 비율
- ✅ 压缩比
- ✅ Compressor Ratio
- ✅ コンプレッサー比率
- ✅ 컴프레서 비율

### v61.5 发送阴影大小 | Send Shadow Size | 送信シャドウサイズ | 전송 그림자 크기
- ✅ 发送阴影大小
- ✅ Send Shadow Size
- ✅ 送信シャドウサイズ
- ✅ 전송 그림자 크기

### v61.6 投射音频增强 | Cast Audio Enhance | キャスト音声強化 | 캐스트 오디오 강화
- ✅ 投射音频增强
- ✅ Cast Audio Enhance
- ✅ キャスト音声強化
- ✅ 캐스트 오디오 강화

### v61.7 边缘动作 | Edge Action | エッジアクション | 엣지 동작
- ✅ 边缘动作
- ✅ Edge Action
- ✅ エッジアクション
- ✅ 엣지 동작

### v61.8 发送者过滤 | Filter Sender | 送信者フィルター | 발신자 필터
- ✅ 发送者过滤
- ✅ Filter Sender
- ✅ 送信者フィルター
- ✅ 발신자 필터

### v61.9 低空间时清理 | Clear On Low | 低容量時クリア | 저용량 시 정리
- ✅ 低空间时清理
- ✅ Clear On Low
- ✅ 低容量時クリア
- ✅ 저용량 시 정리

### v61.10 进度条动画 | Progress Animation | プログレスアニメーション | 진행 바 애니메이션
- ✅ 进度条动画
- ✅ Progress Animation
- ✅ プログレスアニメーション
- ✅ 진행 바 애니메이션

### v61.11 高亮颜色 | Highlight Color | ハイライト色 | 하이라이트 색상
- ✅ 高亮颜色
- ✅ Highlight Color
- ✅ ハイライト色
- ✅ 하이라이트 색상

### v61.12 白色伽马 | White Gamma | ホワイトガンマ | 화이트 감마
- ✅ 白色伽马
- ✅ White Gamma
- ✅ ホワイトガンマ
- ✅ 화이트 감마

### v61.13 压缩起始 | Compressor Attack | アタック | 어택
- ✅ 压缩起始
- ✅ Compressor Attack
- ✅ アタック
- ✅ 어택

### v61.14 背景边框颜色2 | Bg Border Color2 | 背景ボーダー色2 | 배경 테두리 색상2
- ✅ 背景边框颜色2
- ✅ Bg Border Color2
- ✅ 背景ボーダー色2
- ✅ 배경 테두리 색상2

### v61.15 投射字幕颜色 | Cast Subtitle Color | キャスト字幕色 | 캐스트 자막 색상
- ✅ 投射字幕颜色
- ✅ Cast Subtitle Color
- ✅ キャスト字幕色
- ✅ 캐스트 자막 색상

### v62.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v62.1-v62.15 功能列表
- ✅ Auto Bitrate, Font Weight3, Gamma Curve, Compressor Release, Send Outline Size, Cast Video Enhance, Custom Action, Filter Time Range, Read Ahead, Sensitivity, Glow Size2, Temperature Curve, Limiter Threshold, Bg Shadow Blur2, Cast Subtitle Bg

### v62.1 自动码率 | Auto Bitrate | 自動ビットレート | 자동 비트레이트
- ✅ 自动码率
- ✅ Auto Bitrate
- ✅ 自動ビットレート
- ✅ 자동 비트레이트

### v62.2 字体粗细3 | Font Weight3 | フォント太さ3 | 글꼴 두께3
- ✅ 字体粗细3
- ✅ Font Weight3
- ✅ フォント太さ3
- ✅ 글꼴 두께3

### v62.3 伽马曲线 | Gamma Curve | ガンマカーブ | 감마 커브
- ✅ 伽马曲线
- ✅ Gamma Curve
- ✅ ガンマカーブ
- ✅ 감마 커브

### v62.4 压缩释放 | Compressor Release | リリース | 릴리즈
- ✅ 压缩释放
- ✅ Compressor Release
- ✅ リリース
- ✅ 릴리즈

### v62.5 发送描边大小 | Send Outline Size | 送信アウトラインサイズ | 전송 아웃라인 크기
- ✅ 发送描边大小
- ✅ Send Outline Size
- ✅ 送信アウトラインサイズ
- ✅ 전송 아웃라인 크기

### v62.6 投射视频增强 | Cast Video Enhance | キャスト動画強化 | 캐스트 비디오 강화
- ✅ 投射视频增强
- ✅ Cast Video Enhance
- ✅ キャスト動画強化
- ✅ 캐스트 비디오 강화

### v62.7 自定义动作 | Custom Action | カスタムアクション | 사용자 정의 동작
- ✅ 自定义动作
- ✅ Custom Action
- ✅ カスタムアクション
- ✅ 사용자 정의 동작

### v62.8 时间范围过滤 | Filter Time Range | 時間範囲フィルター | 시간 범위 필터
- ✅ 时间范围过滤
- ✅ Filter Time Range
- ✅ 時間範囲フィルター
- ✅ 시간 범위 필터

### v62.9 预读取 | Read Ahead | リードアヘッド | 리드 어헤드
- ✅ 预读取
- ✅ Read Ahead
- ✅ リードアヘッド
- ✅ 리드 어헤드

### v62.10 灵敏度 | Sensitivity | 感度 | 감도
- ✅ 灵敏度
- ✅ Sensitivity
- ✅ 感度
- ✅ 감도

### v62.11 发光大小2 | Glow Size2 | グローサイズ2 | 글로우 크기2
- ✅ 发光大小2
- ✅ Glow Size2
- ✅ グローサイズ2
- ✅ 글로우 크기2

### v62.12 色温曲线 | Temperature Curve | 色温度カーブ | 색온도 커브
- ✅ 色温曲线
- ✅ Temperature Curve
- ✅ 色温度カーブ
- ✅ 색온도 커브

### v62.13 限幅阈值 | Limiter Threshold | リミッター閾値 | 리미터 임계값
- ✅ 限幅阈值
- ✅ Limiter Threshold
- ✅ リミッター閾値
- ✅ 리미터 임계값

### v62.14 背景阴影模糊2 | Bg Shadow Blur2 | 背景シャドウぼかし2 | 배경 그림자 블러2
- ✅ 背景阴影模糊2
- ✅ Bg Shadow Blur2
- ✅ 背景シャドウぼかし2
- ✅ 배경 그림자 블러2

### v62.15 投射字幕背景 | Cast Subtitle Bg | キャスト字幕背景 | 캐스트 자막 배경
- ✅ 投射字幕背景
- ✅ Cast Subtitle Bg
- ✅ キャスト字幕背景
- ✅ 캐스트 자막 배경

### v63.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v63.1-v63.15 功能列表
- ✅ Auto Chapter, Line Spacing2, Contrast Curve, Normalizer2, Send Bg Blur, Cast Auto Subtitle, Pinch Action, Filter Score2, Wakeup On Start, Tick Color, Weight Custom2, Brightness Curve, Bass Lpf, Bg Shadow Offset, Cast Subtitle Outline

### v63.1 自动章节 | Auto Chapter | 自動チャプター | 자동 챕터
- ✅ 自动章节
- ✅ Auto Chapter
- ✅ 自動チャプター
- ✅ 자동 챕터

### v63.2 行间距2 | Line Spacing2 | 行間2 | 줄 간격2
- ✅ 行间距2
- ✅ Line Spacing2
- ✅ 行間2
- ✅ 줄 간격2

### v63.3 对比度曲线 | Contrast Curve | コントラストカーブ | 대비 커브
- ✅ 对比度曲线
- ✅ Contrast Curve
- ✅ コントラストカーブ
- ✅ 대비 커브

### v63.4 标准化器2 | Normalizer2 | ノーマライザー2 | 노멀라이저2
- ✅ 标准化器2
- ✅ Normalizer2
- ✅ ノーマライザー2
- ✅ 노멀라이저2

### v63.5 发送背景模糊 | Send Bg Blur | 送信背景ぼかし | 전송 배경 블러
- ✅ 发送背景模糊
- ✅ Send Bg Blur
- ✅ 送信背景ぼかし
- ✅ 전송 배경 블러

### v63.6 投射自动字幕 | Cast Auto Subtitle | キャスト自動字幕 | 캐스트 자동 자막
- ✅ 投射自动字幕
- ✅ Cast Auto Subtitle
- ✅ キャスト自動字幕
- ✅ 캐스트 자동 자막

### v63.7 捏合动作 | Pinch Action | ピンチアクション | 핀치 동작
- ✅ 捏合动作
- ✅ Pinch Action
- ✅ ピンチアクション
- ✅ 핀치 동작

### v63.8 评分过滤2 | Filter Score2 | フィルタースコア2 | 필터 점수2
- ✅ 评分过滤2
- ✅ Filter Score2
- ✅ フィルタースコア2
- ✅ 필터 점수2

### v63.9 启动时唤醒 | Wakeup On Start | 起動時ウェイクアップ | 시작 시 웨이크업
- ✅ 启动时唤醒
- ✅ Wakeup On Start
- ✅ 起動時ウェイクアップ
- ✅ 시작 시 웨이크업

### v63.10 刻度颜色 | Tick Color | ティック色 | 틱 색상
- ✅ 刻度颜色
- ✅ Tick Color
- ✅ ティック色
- ✅ 틱 색상

### v63.11 自定义粗细2 | Weight Custom2 | 太さカスタム2 | 두께 사용자 정의2
- ✅ 自定义粗细2
- ✅ Weight Custom2
- ✅ 太さカスタム2
- ✅ 두께 사용자 정의2

### v63.12 亮度曲线 | Brightness Curve | 輝度カーブ | 밝기 커브
- ✅ 亮度曲线
- ✅ Brightness Curve
- ✅ 輝度カーブ
- ✅ 밝기 커브

### v63.13 低通滤波 | Bass Lpf | バスLPF | 베이스 LPF
- ✅ 低通滤波
- ✅ Bass Lpf
- ✅ バスLPF
- ✅ 베이스 LPF

### v63.14 背景阴影偏移 | Bg Shadow Offset | 背景シャドウオフセット | 배경 그림자 오프셋
- ✅ 背景阴影偏移
- ✅ Bg Shadow Offset
- ✅ 背景シャドウオフセット
- ✅ 배경 그림자 오프셋

### v63.15 投射字幕描边 | Cast Subtitle Outline | キャスト字幕アウトライン | 캐스트 자막 아웃라인
- ✅ 投射字幕描边
- ✅ Cast Subtitle Outline
- ✅ キャスト字幕アウトライン
- ✅ 캐스트 자막 아웃라인

### v64.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v64.1-v64.15 功能列表
- ✅ Auto Loop Playlist, Shadow Offset2, Saturation Boost, Treble Hpf, Send Border Size, Cast Auto Quality2, Rotation Action, Length Range, Cleanup On Start, Glow Color, Font Italic2, Vividness Boost, Surround Angle, Bg Padding2, Cast Subtitle Delay

### v64.1 自动循环播放列表 | Auto Loop Playlist | 自動ループプレイリスト | 자동 루프 재생목록
- ✅ 自动循环播放列表
- ✅ Auto Loop Playlist
- ✅ 自動ループプレイリスト
- ✅ 자동 루프 재생목록

### v64.2 阴影偏移2 | Shadow Offset2 | シャドウオフセット2 | 그림자 오프셋2
- ✅ 阴影偏移2
- ✅ Shadow Offset2
- ✅ シャドウオフセット2
- ✅ 그림자 오프셋2

### v64.3 饱和度增强 | Saturation Boost | 彩度ブースト | 채도 부스트
- ✅ 饱和度增强
- ✅ Saturation Boost
- ✅ 彩度ブースト
- ✅ 채도 부스트

### v64.4 高通滤波 | Treble Hpf | トレブルHPF | 트레블 HPF
- ✅ 高通滤波
- ✅ Treble Hpf
- ✅ トレブルHPF
- ✅ 트레블 HPF

### v64.5 发送边框大小 | Send Border Size | 送信ボーダーサイズ | 전송 테두리 크기
- ✅ 发送边框大小
- ✅ Send Border Size
- ✅ 送信ボーダーサイズ
- ✅ 전송 테두리 크기

### v64.6 投射自动画质2 | Cast Auto Quality2 | キャスト自動画質2 | 캐스트 자동 화질2
- ✅ 投射自动画质2
- ✅ Cast Auto Quality2
- ✅ キャスト自動画質2
- ✅ 캐스트 자동 화질2

### v64.7 旋转动作 | Rotation Action | 回転アクション | 회전 동작
- ✅ 旋转动作
- ✅ Rotation Action
- ✅ 回転アクション
- ✅ 회전 동작

### v64.8 长度范围 | Length Range | 長さ範囲 | 길이 범위
- ✅ 长度范围
- ✅ Length Range
- ✅ 長さ範囲
- ✅ 길이 범위

### v64.9 启动时清理 | Cleanup On Start | 起動時クリーンアップ | 시작 시 정리
- ✅ 启动时清理
- ✅ Cleanup On Start
- ✅ 起動時クリーンアップ
- ✅ 시작 시 정리

### v64.10 发光颜色 | Glow Color | グロー色 | 글로우 색상
- ✅ 发光颜色
- ✅ Glow Color
- ✅ グロー色
- ✅ 글로우 색상

### v64.11 字体斜体2 | Font Italic2 | フォントイタリック2 | 글꼴 이탤릭2
- ✅ 字体斜体2
- ✅ Font Italic2
- ✅ フォントイタリック2
- ✅ 글꼴 이탤릭2

### v64.12 鲜艳度增强 | Vividness Boost | ビビッドネスブースト | 선명도 부스트
- ✅ 鲜艳度增强
- ✅ Vividness Boost
- ✅ ビビッドネスブースト
- ✅ 선명도 부스트

### v64.13 环绕角度 | Surround Angle | サラウンド角度 | 서라운드 각도
- ✅ 环绕角度
- ✅ Surround Angle
- ✅ サラウンド角度
- ✅ 서라운드 각도

### v64.14 背景内边距2 | Bg Padding2 | 背景パディング2 | 배경 패딩2
- ✅ 背景内边距2
- ✅ Bg Padding2
- ✅ 背景パディング2
- ✅ 배경 패딩2

### v64.15 投射字幕延迟 | Cast Subtitle Delay | キャスト字幕遅延 | 캐스트 자막 지연
- ✅ 投射字幕延迟
- ✅ Cast Subtitle Delay
- ✅ キャスト字幕遅延
- ✅ 캐스트 자막 지연

### v65.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v65.1-v65.15 功能列表
- ✅ Skip Recap, Font Strike2, Hue Curve, Bass Enhance, Anim Duration, Cast Auto Reconnect2, Shake Action, Filter Duplicate2, Prefetch On Idle, Gradient Speed, Font Underline2, Lift Gamma Gain, Treble Enhance, Bg Border Radius2, Cast Subtitle Bg Opacity

### v65.1 跳过回顾 | Skip Recap | リキャップスキップ | 리캡 건너뛰기
- ✅ 跳过回顾
- ✅ Skip Recap
- ✅ リキャップスキップ
- ✅ 리캡 건너뛰기

### v65.2 删除线2 | Font Strike2 | フォント取り消し線2 | 글꼴 취소선2
- ✅ 删除线2
- ✅ Font Strike2
- ✅ フォント取り消し線2
- ✅ 글꼴 취소선2

### v65.3 色调曲线 | Hue Curve | 色相カーブ | 색조 커브
- ✅ 色调曲线
- ✅ Hue Curve
- ✅ 色相カーブ
- ✅ 색조 커브

### v65.4 低音增强 | Bass Enhance | バス強化 | 베이스 강화
- ✅ 低音增强
- ✅ Bass Enhance
- ✅ バス強化
- ✅ 베이스 강화

### v65.5 动画时长 | Anim Duration | アニメーション時間 | 애니메이션 시간
- ✅ 动画时长
- ✅ Anim Duration
- ✅ アニメーション時間
- ✅ 애니메이션 시간

### v65.6 投射自动重连2 | Cast Auto Reconnect2 | キャスト自動再接続2 | 캐스트 자동 재연결2
- ✅ 投射自动重连2
- ✅ Cast Auto Reconnect2
- ✅ キャスト自動再接続2
- ✅ 캐스트 자동 재연결2

### v65.7 摇晃动作 | Shake Action | シェイクアクション | 셰이크 동작
- ✅ 摇晃动作
- ✅ Shake Action
- ✅ シェイクアクション
- ✅ 셰이크 동작

### v65.8 去重过滤2 | Filter Duplicate2 | 重複フィルター2 | 중복 필터2
- ✅ 去重过滤2
- ✅ Filter Duplicate2
- ✅ 重複フィルター2
- ✅ 중복 필터2

### v65.9 空闲时预取 | Prefetch On Idle | アイドル時プリロード | 유휴 시 프리로드
- ✅ 空闲时预取
- ✅ Prefetch On Idle
- ✅ アイドル時プリロード
- ✅ 유휴 시 프리로드

### v65.10 渐变速度 | Gradient Speed | グラデーション速度 | 그라데이션 속도
- ✅ 渐变速度
- ✅ Gradient Speed
- ✅ グラデーション速度
- ✅ 그라데이션 속도

### v65.11 下划线2 | Font Underline2 | フォント下線2 | 글꼴 밑줄2
- ✅ 下划线2
- ✅ Font Underline2
- ✅ フォント下線2
- ✅ 글꼴 밑줄2

### v65.12 提升伽马增益 | Lift Gamma Gain | リフトガンマゲイン | 리프트 감마 게인
- ✅ 提升伽马增益
- ✅ Lift Gamma Gain
- ✅ リフトガンマゲイン
- ✅ 리프트 감마 게인

### v65.13 高音增强 | Treble Enhance | トレブル強化 | 트레블 강화
- ✅ 高音增强
- ✅ Treble Enhance
- ✅ トレブル強化
- ✅ 트레블 강화

### v65.14 背景圆角2 | Bg Border Radius2 | 背景角丸2 | 배경 둥근 모서리2
- ✅ 背景圆角2
- ✅ Bg Border Radius2
- ✅ 背景角丸2
- ✅ 배경 둥근 모서리2

### v65.15 投射字幕背景透明度 | Cast Subtitle Bg Opacity | キャスト字幕背景透明度 | 캐스트 자막 배경 투명도
- ✅ 投射字幕背景透明度
- ✅ Cast Subtitle Bg Opacity
- ✅ キャスト字幕背景透明度
- ✅ 캐스트 자막 배경 투명도

### v66.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v66.1-v66.15 功能列表
- ✅ Smart Seek, Font Monospace2, Tone Mapping, Channel Delay, Send Font Size3, Cast Auto Adapt2, Multi Touch Action, Filter Emote, Compress Level, Shadow Color, Font Color2, ACES Film, Dynamic Bass, Bg Gradient Color3, Cast Subtitle Font

### v66.1 智能快进 | Smart Seek | スマートシーク | 스마트 탐색
- ✅ 智能快进
- ✅ Smart Seek
- ✅ スマートシーク
- ✅ 스마트 탐색

### v66.2 等宽字体2 | Font Monospace2 | フォントモノスペース2 | 글꼴 모노스페이스2
- ✅ 等宽字体2
- ✅ Font Monospace2
- ✅ フォントモノスペース2
- ✅ 글꼴 모노스페이스2

### v66.3 色调映射 | Tone Mapping | トーンマッピング | 톤매핑
- ✅ 色调映射
- ✅ Tone Mapping
- ✅ トーンマッピング
- ✅ 톤매핑

### v66.4 声道延迟 | Channel Delay | チャンネル遅延 | 채널 지연
- ✅ 声道延迟
- ✅ Channel Delay
- ✅ チャンネル遅延
- ✅ 채널 지연

### v66.5 发送字号3 | Send Font Size3 | 送信フォントサイズ3 | 전송 글꼴 크기3
- ✅ 发送字号3
- ✅ Send Font Size3
- ✅ 送信フォントサイズ3
- ✅ 전송 글꼴 크기3

### v66.6 投射自适应2 | Cast Auto Adapt2 | キャスト自動適応2 | 캐스트 자동 적응2
- ✅ 投射自适应2
- ✅ Cast Auto Adapt2
- ✅ キャスト自動適応2
- ✅ 캐스트 자동 적응2

### v66.7 多点触控动作 | Multi Touch Action | マルチタッチアクション | 멀티 터치 동작
- ✅ 多点触控动作
- ✅ Multi Touch Action
- ✅ マルチタッチアクション
- ✅ 멀티 터치 동작

### v66.8 表情过滤 | Filter Emote | 絵文字フィルター | 이모티콘 필터
- ✅ 表情过滤
- ✅ Filter Emote
- ✅ 絵文字フィルター
- ✅ 이모티콘 필터

### v66.9 压缩级别 | Compress Level | 圧縮レベル | 압축 수준
- ✅ 压缩级别
- ✅ Compress Level
- ✅ 圧縮レベル
- ✅ 압축 수준

### v66.10 阴影颜色 | Shadow Color | シャドウ色 | 그림자 색상
- ✅ 阴影颜色
- ✅ Shadow Color
- ✅ シャドウ色
- ✅ 그림자 색상

### v66.11 字体颜色2 | Font Color2 | フォント色2 | 글꼴 색상2
- ✅ 字体颜色2
- ✅ Font Color2
- ✅ フォント色2
- ✅ 글꼴 색상2

### v66.12 ACES胶片 | ACES Film | ACESフィルム | ACES 필름
- ✅ ACES胶片
- ✅ ACES Film
- ✅ ACESフィルム
- ✅ ACES 필름

### v66.13 动态低音 | Dynamic Bass | ダイナミックバス | 다이나믹 베이스
- ✅ 动态低音
- ✅ Dynamic Bass
- ✅ ダイナミックバス
- ✅ 다이나믹 베이스

### v66.14 背景渐变颜色3 | Bg Gradient Color3 | 背景グラデーション色3 | 배경 그라데이션 색상3
- ✅ 背景渐变颜色3
- ✅ Bg Gradient Color3
- ✅ 背景グラデーション色3
- ✅ 배경 그라데이션 색상3

### v66.15 投射字幕字体 | Cast Subtitle Font | キャスト字幕フォント | 캐스트 자막 글꼴
- ✅ 投射字幕字体
- ✅ Cast Subtitle Font
- ✅ キャスト字幕フォント
- ✅ 캐스트 자막 글꼴

### v67.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v67.1-v67.15 功能列表
- ✅ Skip Preview, Outline Color2, Log Curve, Spatial Audio, Send Bg Radius, Cast Auto Connect2, Finger Count Action, Filter Combo, Write Policy, Gradient Color, Shadow Color3, Sigmoid Contrast, Surround Delay, Bg Shadow Color3, Cast Subtitle Shadow

### v67.1 跳过预览 | Skip Preview | プレビュースキップ | 미리보기 건너뛰기
- ✅ 跳过预览
- ✅ Skip Preview
- ✅ プレビュースキップ
- ✅ 미리보기 건너뛰기

### v67.2 描边颜色2 | Outline Color2 | アウトライン色2 | 아웃라인 색상2
- ✅ 描边颜色2
- ✅ Outline Color2
- ✅ アウトライン色2
- ✅ 아웃라인 색상2

### v67.3 对数曲线 | Log Curve | ログカーブ | 로그 커브
- ✅ 对数曲线
- ✅ Log Curve
- ✅ ログカーブ
- ✅ 로그 커브

### v67.4 空间音频 | Spatial Audio | 空間オーディオ | 공간 오디오
- ✅ 空间音频
- ✅ Spatial Audio
- ✅ 空間オーディオ
- ✅ 공간 오디오

### v67.5 发送背景圆角 | Send Bg Radius | 送信背景角丸 | 전송 배경 둥근 모서리
- ✅ 发送背景圆角
- ✅ Send Bg Radius
- ✅ 送信背景角丸
- ✅ 전송 배경 둥근 모서리

### v67.6 投射自动连接2 | Cast Auto Connect2 | キャスト自動接続2 | 캐스트 자동 연결2
- ✅ 投射自动连接2
- ✅ Cast Auto Connect2
- ✅ キャスト自動接続2
- ✅ 캐스트 자동 연결2

### v67.7 手指计数动作 | Finger Count Action | 指カウントアクション | 손가락 카운트 동작
- ✅ 手指计数动作
- ✅ Finger Count Action
- ✅ 指カウントアクション
- ✅ 손가락 카운트 동작

### v67.8 连击过滤 | Filter Combo | コンボフィルター | 콤보 필터
- ✅ 连击过滤
- ✅ Filter Combo
- ✅ コンボフィルター
- ✅ 콤보 필터

### v67.9 写入策略 | Write Policy | ライトポリシー | 쓰기 정책
- ✅ 写入策略
- ✅ Write Policy
- ✅ ライトポリシー
- ✅ 쓰기 정책

### v67.10 渐变颜色 | Gradient Color | グラデーション色 | 그라데이션 색상
- ✅ 渐变颜色
- ✅ Gradient Color
- ✅ グラデーション色
- ✅ 그라데이션 색상

### v67.11 阴影颜色3 | Shadow Color3 | シャドウ色3 | 그림자 색상3
- ✅ 阴影颜色3
- ✅ Shadow Color3
- ✅ シャドウ色3
- ✅ 그림자 색상3

### v67.12 S型对比度 | Sigmoid Contrast | シグモイドコントラスト | 시그모이드 대비
- ✅ S型对比度
- ✅ Sigmoid Contrast
- ✅ シグモイドコントラスト
- ✅ 시그모이드 대비

### v67.13 环绕延迟 | Surround Delay | サラウンド遅延 | 서라운드 지연
- ✅ 环绕延迟
- ✅ Surround Delay
- ✅ サラウンド遅延
- ✅ 서라운드 지연

### v67.14 背景阴影颜色3 | Bg Shadow Color3 | 背景シャドウ色3 | 배경 그림자 색상3
- ✅ 背景阴影颜色3
- ✅ Bg Shadow Color3
- ✅ 背景シャドウ色3
- ✅ 배경 그림자 색상3

### v67.15 投射字幕阴影 | Cast Subtitle Shadow | キャスト字幕シャドウ | 캐스트 자막 그림자
- ✅ 投射字幕阴影
- ✅ Cast Subtitle Shadow
- ✅ キャスト字幕シャドウ
- ✅ 캐스트 자막 그림자

### v68.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v68.1-v68.15 功能列表
- ✅ Skip Padding, Glow Color3, Film Grain, Channel Extractor, Send Bg Gradient, Cast Auto Quality3, Pressure Action, Filter Super Chat, Prefetch On Start, Glow Effect, Weight Custom3, Color Bloom, Dynamic Range, Bg Shadow Offset2, Cast Subtitle Glow

### v68.1 跳过填充 | Skip Padding | パディングスキップ | 패딩 건너뛰기
- ✅ 跳过填充
- ✅ Skip Padding
- ✅ パディングスキップ
- ✅ 패딩 건너뛰기

### v68.2 发光颜色3 | Glow Color3 | グロー色3 | 글로우 색상3
- ✅ 发光颜色3
- ✅ Glow Color3
- ✅ グロー色3
- ✅ 글로우 색상3

### v68.3 胶片颗粒 | Film Grain | フィルムグレイン | 필름 그레인
- ✅ 胶片颗粒
- ✅ Film Grain
- ✅ フィルムグレイン
- ✅ 필름 그레인

### v68.4 声道提取器 | Channel Extractor | チャンネルエクストラクター | 채널 익스트랙터
- ✅ 声道提取器
- ✅ Channel Extractor
- ✅ チャンネルエクストラクター
- ✅ 채널 익스트랙터

### v68.5 发送背景渐变 | Send Bg Gradient | 送信背景グラデーション | 전송 배경 그라데이션
- ✅ 发送背景渐变
- ✅ Send Bg Gradient
- ✅ 送信背景グラデーション
- ✅ 전송 배경 그라데이션

### v68.6 投射自动画质3 | Cast Auto Quality3 | キャスト自動画質3 | 캐스트 자동 화질3
- ✅ 投射自动画质3
- ✅ Cast Auto Quality3
- ✅ キャスト自動画質3
- ✅ 캐스트 자동 화질3

### v68.7 压力动作 | Pressure Action | プレッシャーアクション | 프레셔 동작
- ✅ 压力动作
- ✅ Pressure Action
- ✅ プレッシャーアクション
- ✅ 프레셔 동작

### v68.8 醒目留言过滤 | Filter Super Chat | スーパーチャットフィルター | 슈퍼챗 필터
- ✅ 醒目留言过滤
- ✅ Filter Super Chat
- ✅ スーパーチャットフィルター
- ✅ 슈퍼챗 필터

### v68.9 启动时预取 | Prefetch On Start | 起動時プリロード | 시작 시 프리로드
- ✅ 启动时预取
- ✅ Prefetch On Start
- ✅ 起動時プリロード
- ✅ 시작 시 프리로드

### v68.10 发光效果 | Glow Effect | グローエフェクト | 글로우 이펙트
- ✅ 发光效果
- ✅ Glow Effect
- ✅ グローエフェクト
- ✅ 글로우 이펙트

### v68.11 自定义粗细3 | Weight Custom3 | 太さカスタム3 | 두께 사용자 정의3
- ✅ 自定义粗细3
- ✅ Weight Custom3
- ✅ 太さカスタム3
- ✅ 두께 사용자 정의3

### v68.12 色彩泛光 | Color Bloom | ブルーム | 블룸
- ✅ 色彩泛光
- ✅ Color Bloom
- ✅ ブルーム
- ✅ 블룸

### v68.13 动态范围 | Dynamic Range | ダイナミックレンジ | 다이나믹 레인지
- ✅ 动态范围
- ✅ Dynamic Range
- ✅ ダイナミックレンジ
- ✅ 다이나믹 레인지

### v68.14 背景阴影偏移2 | Bg Shadow Offset2 | 背景シャドウオフセット2 | 배경 그림자 오프셋2
- ✅ 背景阴影偏移2
- ✅ Bg Shadow Offset2
- ✅ 背景シャドウオフセット2
- ✅ 배경 그림자 오프셋2

### v68.15 投射字幕发光 | Cast Subtitle Glow | キャスト字幕グロー | 캐스트 자막 글로우
- ✅ 投射字幕发光
- ✅ Cast Subtitle Glow
- ✅ キャスト字幕グロー
- ✅ 캐스트 자막 글로우

### v69.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v69.1-v69.15 功能列表
- ✅ Auto Skip Filler2, Font Weight Final, Color Final, Volume Final, Send Final, Cast Final, Gesture Final, Filter Final, Cache Final, Progress Final, Font Final, Color Final2, Volume Final2, Bg Final, Cast Subtitle Final

### v69.1 自动跳离题2 | Auto Skip Filler2 | 自動フィラースキップ2 | 자동 필러 건너뛰기2
- ✅ 自动跳离题2
- ✅ Auto Skip Filler2
- ✅ 自動フィラースキップ2
- ✅ 자동 필러 건너뛰기2

### v69.2 字体粗细最终 | Font Weight Final | フォント太さ最終 | 글꼴 두께 최종
- ✅ 字体粗细最终
- ✅ Font Weight Final
- ✅ フォント太さ最終
- ✅ 글꼴 두께 최종

### v69.3 色彩最终 | Color Final | 色最終 | 색상 최종
- ✅ 色彩最终
- ✅ Color Final
- ✅ 色最終
- ✅ 색상 최종

### v69.4 音量最终 | Volume Final | 音量最終 | 볼륨 최종
- ✅ 音量最终
- ✅ Volume Final
- ✅ 音量最終
- ✅ 볼륨 최종

### v69.5 发送最终 | Send Final | 送信最終 | 전송 최종
- ✅ 发送最终
- ✅ Send Final
- ✅ 送信最終
- ✅ 전송 최종

### v69.6 投射最终 | Cast Final | キャスト最終 | 캐스트 최종
- ✅ 投射最终
- ✅ Cast Final
- ✅ キャスト最終
- ✅ 캐스트 최종

### v69.7 手势最终 | Gesture Final | ジェスチャー最終 | 제스처 최종
- ✅ 手势最终
- ✅ Gesture Final
- ✅ ジェスチャー最終
- ✅ 제스처 최종

### v69.8 过滤最终 | Filter Final | フィルター最終 | 필터 최종
- ✅ 过滤最终
- ✅ Filter Final
- ✅ フィルター最終
- ✅ 필터 최종

### v69.9 缓存最终 | Cache Final | キャッシュ最終 | 캐시 최종
- ✅ 缓存最终
- ✅ Cache Final
- ✅ キャッシュ最終
- ✅ 캐시 최종

### v69.10 进度条最终 | Progress Final | プログレス最終 | 진행 바 최종
- ✅ 进度条最终
- ✅ Progress Final
- ✅ プログレス最終
- ✅ 진행 바 최종

### v69.11 字体最终 | Font Final | フォント最終 | 글꼴 최종
- ✅ 字体最终
- ✅ Font Final
- ✅ フォント最終
- ✅ 글꼴 최종

### v69.12 色彩最终2 | Color Final2 | 色最終2 | 색상 최종2
- ✅ 色彩最终2
- ✅ Color Final2
- ✅ 色最終2
- ✅ 색상 최종2

### v69.13 音量最终2 | Volume Final2 | 音量最終2 | 볼륨 최종2
- ✅ 音量最终2
- ✅ Volume Final2
- ✅ 音量最終2
- ✅ 볼륨 최종2

### v69.14 背景最终 | Bg Final | 背景最終 | 배경 최종
- ✅ 背景最终
- ✅ Bg Final
- ✅ 背景最終
- ✅ 배경 최종

### v69.15 投射字幕最终 | Cast Subtitle Final | キャスト字幕最終 | 캐스트 자막 최종
- ✅ 投射字幕最终
- ✅ Cast Subtitle Final
- ✅ キャスト字幕最終
- ✅ 캐스트 자막 최종

### v71.x

<details><summary>🇨🇳</summary>

| v71.1 | 自动跳过回顾 |
| v71.2 | 字体发光大小3 |
| v71.3 | 色彩提升2 |
| v71.4 | 环绕声2 |
| v71.5 | 投屏字幕同步2 |
| v71.6 | 滑动速度2 |
| v71.7 | 缓存最大大小2 |
| v71.8 | 进度条灵敏度2 |
| v71.9 | 智能速度 |
| v71.10 | 字体粗细4 |
| v71.11 | 色彩伽马2 |
| v71.12 | 低音2 |
| v71.13 | 投屏画质2 |
| v71.14 | 双击速度2 |
| v71.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v71.1 | Auto Skip Recap |
| v71.2 | Font Glow Size3 |
| v71.3 | Color Lift2 |
| v71.4 | Volume Surround2 |
| v71.5 | Cast Subtitle Sync2 |
| v71.6 | Swipe Speed2 |
| v71.7 | Cache Max Size2 |
| v71.8 | Progress Sensitivity2 |
| v71.9 | Smart Speed |
| v71.10 | Font Weight4 |
| v71.11 | Color Gamma2 |
| v71.12 | Volume Bass2 |
| v71.13 | Cast Video Quality2 |
| v71.14 | Double Tap Speed |
| v71.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v71.1 | 自動スキップ リキャップ |
| v71.2 | フォント グロー3 |
| v71.3 | カラー リフト2 |
| v71.4 | サラウンド2 |
| v71.5 | キャスト字幕同期2 |
| v71.6 | スワイプ速度2 |
| v71.7 | キャッシュ最大2 |
| v71.8 | プログレス感度2 |
| v71.9 | スマート速度 |
| v71.10 | フォント太さ4 |
| v71.11 | カラー ガンマ2 |
| v71.12 | ベース2 |
| v71.13 | キャスト画質2 |
| v71.14 | ダブルタップ速度2 |
| v71.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v71.1 | 자동 건너뛰기 리캡 |
| v71.2 | 폰트 글로우 크기3 |
| v71.3 | 색상 리프트2 |
| v71.4 | 서라운드2 |
| v71.5 | 캐스트 자막 동기화2 |
| v71.6 | 스와이프 속도2 |
| v71.7 | 캐시 최대 크기2 |
| v71.8 | 프로그레스 민감도2 |
| v71.9 | 스마트 속도 |
| v71.10 | 폰트 굵기4 |
| v71.11 | 색상 감마2 |
| v71.12 | 베이스2 |
| v71.13 | 캐스트 화질2 |
| v71.14 | 더블탭 속도2 |
| v71.15 | 캐시 프리페치2 |

### v72.x

<details><summary>🇨🇳</summary>

| v72.1 | 自动跳过回顾 |
| v72.2 | 字体发光大小3 |
| v72.3 | 色彩提升2 |
| v72.4 | 环绕声2 |
| v72.5 | 投屏字幕同步2 |
| v72.6 | 滑动速度2 |
| v72.7 | 缓存最大大小2 |
| v72.8 | 进度条灵敏度2 |
| v72.9 | 智能速度 |
| v72.10 | 字体粗细4 |
| v72.11 | 色彩伽马2 |
| v72.12 | 低音2 |
| v72.13 | 投屏画质2 |
| v72.14 | 双击速度2 |
| v72.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v72.1 | Auto Skip Recap |
| v72.2 | Font Glow Size3 |
| v72.3 | Color Lift2 |
| v72.4 | Volume Surround2 |
| v72.5 | Cast Subtitle Sync2 |
| v72.6 | Swipe Speed2 |
| v72.7 | Cache Max Size2 |
| v72.8 | Progress Sensitivity2 |
| v72.9 | Smart Speed |
| v72.10 | Font Weight4 |
| v72.11 | Color Gamma2 |
| v72.12 | Volume Bass2 |
| v72.13 | Cast Video Quality2 |
| v72.14 | Double Tap Speed |
| v72.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v72.1 | 自動スキップ リキャップ |
| v72.2 | フォント グロー3 |
| v72.3 | カラー リフト2 |
| v72.4 | サラウンド2 |
| v72.5 | キャスト字幕同期2 |
| v72.6 | スワイプ速度2 |
| v72.7 | キャッシュ最大2 |
| v72.8 | プログレス感度2 |
| v72.9 | スマート速度 |
| v72.10 | フォント太さ4 |
| v72.11 | カラー ガンマ2 |
| v72.12 | ベース2 |
| v72.13 | キャスト画質2 |
| v72.14 | ダブルタップ速度2 |
| v72.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v72.1 | 자동 건너뛰기 리캡 |
| v72.2 | 폰트 글로우 크기3 |
| v72.3 | 색상 리프트2 |
| v72.4 | 서라운드2 |
| v72.5 | 캐스트 자막 동기화2 |
| v72.6 | 스와이프 속도2 |
| v72.7 | 캐시 최대 크기2 |
| v72.8 | 프로그레스 민감도2 |
| v72.9 | 스마트 속도 |
| v72.10 | 폰트 굵기4 |
| v72.11 | 색상 감마2 |
| v72.12 | 베이스2 |
| v72.13 | 캐스트 화질2 |
| v72.14 | 더블탭 속도2 |
| v72.15 | 캐시 프리페치2 |

### v73.x

<details><summary>🇨🇳</summary>

| v73.1 | 自动跳过回顾 |
| v73.2 | 字体发光大小3 |
| v73.3 | 色彩提升2 |
| v73.4 | 环绕声2 |
| v73.5 | 投屏字幕同步2 |
| v73.6 | 滑动速度2 |
| v73.7 | 缓存最大大小2 |
| v73.8 | 进度条灵敏度2 |
| v73.9 | 智能速度 |
| v73.10 | 字体粗细4 |
| v73.11 | 色彩伽马2 |
| v73.12 | 低音2 |
| v73.13 | 投屏画质2 |
| v73.14 | 双击速度2 |
| v73.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v73.1 | Auto Skip Recap |
| v73.2 | Font Glow Size3 |
| v73.3 | Color Lift2 |
| v73.4 | Volume Surround2 |
| v73.5 | Cast Subtitle Sync2 |
| v73.6 | Swipe Speed2 |
| v73.7 | Cache Max Size2 |
| v73.8 | Progress Sensitivity2 |
| v73.9 | Smart Speed |
| v73.10 | Font Weight4 |
| v73.11 | Color Gamma2 |
| v73.12 | Volume Bass2 |
| v73.13 | Cast Video Quality2 |
| v73.14 | Double Tap Speed |
| v73.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v73.1 | 自動スキップ リキャップ |
| v73.2 | フォント グロー3 |
| v73.3 | カラー リフト2 |
| v73.4 | サラウンド2 |
| v73.5 | キャスト字幕同期2 |
| v73.6 | スワイプ速度2 |
| v73.7 | キャッシュ最大2 |
| v73.8 | プログレス感度2 |
| v73.9 | スマート速度 |
| v73.10 | フォント太さ4 |
| v73.11 | カラー ガンマ2 |
| v73.12 | ベース2 |
| v73.13 | キャスト画質2 |
| v73.14 | ダブルタップ速度2 |
| v73.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v73.1 | 자동 건너뛰기 리캡 |
| v73.2 | 폰트 글로우 크기3 |
| v73.3 | 색상 리프트2 |
| v73.4 | 서라운드2 |
| v73.5 | 캐스트 자막 동기화2 |
| v73.6 | 스와이프 속도2 |
| v73.7 | 캐시 최대 크기2 |
| v73.8 | 프로그레스 민감도2 |
| v73.9 | 스마트 속도 |
| v73.10 | 폰트 굵기4 |
| v73.11 | 색상 감마2 |
| v73.12 | 베이스2 |
| v73.13 | 캐스트 화질2 |
| v73.14 | 더블탭 속도2 |
| v73.15 | 캐시 프리페치2 |

### v74.x

<details><summary>🇨🇳</summary>

| v74.1 | 自动跳过回顾 |
| v74.2 | 字体发光大小3 |
| v74.3 | 色彩提升2 |
| v74.4 | 环绕声2 |
| v74.5 | 投屏字幕同步2 |
| v74.6 | 滑动速度2 |
| v74.7 | 缓存最大大小2 |
| v74.8 | 进度条灵敏度2 |
| v74.9 | 智能速度 |
| v74.10 | 字体粗细4 |
| v74.11 | 色彩伽马2 |
| v74.12 | 低音2 |
| v74.13 | 投屏画质2 |
| v74.14 | 双击速度2 |
| v74.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v74.1 | Auto Skip Recap |
| v74.2 | Font Glow Size3 |
| v74.3 | Color Lift2 |
| v74.4 | Volume Surround2 |
| v74.5 | Cast Subtitle Sync2 |
| v74.6 | Swipe Speed2 |
| v74.7 | Cache Max Size2 |
| v74.8 | Progress Sensitivity2 |
| v74.9 | Smart Speed |
| v74.10 | Font Weight4 |
| v74.11 | Color Gamma2 |
| v74.12 | Volume Bass2 |
| v74.13 | Cast Video Quality2 |
| v74.14 | Double Tap Speed |
| v74.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v74.1 | 自動スキップ リキャップ |
| v74.2 | フォント グロー3 |
| v74.3 | カラー リフト2 |
| v74.4 | サラウンド2 |
| v74.5 | キャスト字幕同期2 |
| v74.6 | スワイプ速度2 |
| v74.7 | キャッシュ最大2 |
| v74.8 | プログレス感度2 |
| v74.9 | スマート速度 |
| v74.10 | フォント太さ4 |
| v74.11 | カラー ガンマ2 |
| v74.12 | ベース2 |
| v74.13 | キャスト画質2 |
| v74.14 | ダブルタップ速度2 |
| v74.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v74.1 | 자동 건너뛰기 리캡 |
| v74.2 | 폰트 글로우 크기3 |
| v74.3 | 색상 리프트2 |
| v74.4 | 서라운드2 |
| v74.5 | 캐스트 자막 동기화2 |
| v74.6 | 스와이프 속도2 |
| v74.7 | 캐시 최대 크기2 |
| v74.8 | 프로그레스 민감도2 |
| v74.9 | 스마트 속도 |
| v74.10 | 폰트 굵기4 |
| v74.11 | 색상 감마2 |
| v74.12 | 베이스2 |
| v74.13 | 캐스트 화질2 |
| v74.14 | 더블탭 속도2 |
| v74.15 | 캐시 프리페치2 |

### v75.x

<details><summary>🇨🇳</summary>

| v75.1 | 自动跳过回顾 |
| v75.2 | 字体发光大小3 |
| v75.3 | 色彩提升2 |
| v75.4 | 环绕声2 |
| v75.5 | 投屏字幕同步2 |
| v75.6 | 滑动速度2 |
| v75.7 | 缓存最大大小2 |
| v75.8 | 进度条灵敏度2 |
| v75.9 | 智能速度 |
| v75.10 | 字体粗细4 |
| v75.11 | 色彩伽马2 |
| v75.12 | 低音2 |
| v75.13 | 投屏画质2 |
| v75.14 | 双击速度2 |
| v75.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v75.1 | Auto Skip Recap |
| v75.2 | Font Glow Size3 |
| v75.3 | Color Lift2 |
| v75.4 | Volume Surround2 |
| v75.5 | Cast Subtitle Sync2 |
| v75.6 | Swipe Speed2 |
| v75.7 | Cache Max Size2 |
| v75.8 | Progress Sensitivity2 |
| v75.9 | Smart Speed |
| v75.10 | Font Weight4 |
| v75.11 | Color Gamma2 |
| v75.12 | Volume Bass2 |
| v75.13 | Cast Video Quality2 |
| v75.14 | Double Tap Speed |
| v75.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v75.1 | 自動スキップ リキャップ |
| v75.2 | フォント グロー3 |
| v75.3 | カラー リフト2 |
| v75.4 | サラウンド2 |
| v75.5 | キャスト字幕同期2 |
| v75.6 | スワイプ速度2 |
| v75.7 | キャッシュ最大2 |
| v75.8 | プログレス感度2 |
| v75.9 | スマート速度 |
| v75.10 | フォント太さ4 |
| v75.11 | カラー ガンマ2 |
| v75.12 | ベース2 |
| v75.13 | キャスト画質2 |
| v75.14 | ダブルタップ速度2 |
| v75.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v75.1 | 자동 건너뛰기 리캡 |
| v75.2 | 폰트 글로우 크기3 |
| v75.3 | 색상 리프트2 |
| v75.4 | 서라운드2 |
| v75.5 | 캐스트 자막 동기화2 |
| v75.6 | 스와이프 속도2 |
| v75.7 | 캐시 최대 크기2 |
| v75.8 | 프로그레스 민감도2 |
| v75.9 | 스마트 속도 |
| v75.10 | 폰트 굵기4 |
| v75.11 | 색상 감마2 |
| v75.12 | 베이스2 |
| v75.13 | 캐스트 화질2 |
| v75.14 | 더블탭 속도2 |
| v75.15 | 캐시 프리페치2 |

### v76.x

<details><summary>🇨🇳</summary>

| v76.1 | 自动跳过回顾 |
| v76.2 | 字体发光大小3 |
| v76.3 | 色彩提升2 |
| v76.4 | 环绕声2 |
| v76.5 | 投屏字幕同步2 |
| v76.6 | 滑动速度2 |
| v76.7 | 缓存最大大小2 |
| v76.8 | 进度条灵敏度2 |
| v76.9 | 智能速度 |
| v76.10 | 字体粗细4 |
| v76.11 | 色彩伽马2 |
| v76.12 | 低音2 |
| v76.13 | 投屏画质2 |
| v76.14 | 双击速度2 |
| v76.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v76.1 | Auto Skip Recap |
| v76.2 | Font Glow Size3 |
| v76.3 | Color Lift2 |
| v76.4 | Volume Surround2 |
| v76.5 | Cast Subtitle Sync2 |
| v76.6 | Swipe Speed2 |
| v76.7 | Cache Max Size2 |
| v76.8 | Progress Sensitivity2 |
| v76.9 | Smart Speed |
| v76.10 | Font Weight4 |
| v76.11 | Color Gamma2 |
| v76.12 | Volume Bass2 |
| v76.13 | Cast Video Quality2 |
| v76.14 | Double Tap Speed |
| v76.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v76.1 | 自動スキップ リキャップ |
| v76.2 | フォント グロー3 |
| v76.3 | カラー リフト2 |
| v76.4 | サラウンド2 |
| v76.5 | キャスト字幕同期2 |
| v76.6 | スワイプ速度2 |
| v76.7 | キャッシュ最大2 |
| v76.8 | プログレス感度2 |
| v76.9 | スマート速度 |
| v76.10 | フォント太さ4 |
| v76.11 | カラー ガンマ2 |
| v76.12 | ベース2 |
| v76.13 | キャスト画質2 |
| v76.14 | ダブルタップ速度2 |
| v76.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v76.1 | 자동 건너뛰기 리캡 |
| v76.2 | 폰트 글로우 크기3 |
| v76.3 | 색상 리프트2 |
| v76.4 | 서라운드2 |
| v76.5 | 캐스트 자막 동기화2 |
| v76.6 | 스와이프 속도2 |
| v76.7 | 캐시 최대 크기2 |
| v76.8 | 프로그레스 민감도2 |
| v76.9 | 스마트 속도 |
| v76.10 | 폰트 굵기4 |
| v76.11 | 색상 감마2 |
| v76.12 | 베이스2 |
| v76.13 | 캐스트 화질2 |
| v76.14 | 더블탭 속도2 |
| v76.15 | 캐시 프리페치2 |

### v77.x

<details><summary>🇨🇳</summary>

| v77.1 | 自动跳过回顾 |
| v77.2 | 字体发光大小3 |
| v77.3 | 色彩提升2 |
| v77.4 | 环绕声2 |
| v77.5 | 投屏字幕同步2 |
| v77.6 | 滑动速度2 |
| v77.7 | 缓存最大大小2 |
| v77.8 | 进度条灵敏度2 |
| v77.9 | 智能速度 |
| v77.10 | 字体粗细4 |
| v77.11 | 色彩伽马2 |
| v77.12 | 低音2 |
| v77.13 | 投屏画质2 |
| v77.14 | 双击速度2 |
| v77.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v77.1 | Auto Skip Recap |
| v77.2 | Font Glow Size3 |
| v77.3 | Color Lift2 |
| v77.4 | Volume Surround2 |
| v77.5 | Cast Subtitle Sync2 |
| v77.6 | Swipe Speed2 |
| v77.7 | Cache Max Size2 |
| v77.8 | Progress Sensitivity2 |
| v77.9 | Smart Speed |
| v77.10 | Font Weight4 |
| v77.11 | Color Gamma2 |
| v77.12 | Volume Bass2 |
| v77.13 | Cast Video Quality2 |
| v77.14 | Double Tap Speed |
| v77.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v77.1 | 自動スキップ リキャップ |
| v77.2 | フォント グロー3 |
| v77.3 | カラー リフト2 |
| v77.4 | サラウンド2 |
| v77.5 | キャスト字幕同期2 |
| v77.6 | スワイプ速度2 |
| v77.7 | キャッシュ最大2 |
| v77.8 | プログレス感度2 |
| v77.9 | スマート速度 |
| v77.10 | フォント太さ4 |
| v77.11 | カラー ガンマ2 |
| v77.12 | ベース2 |
| v77.13 | キャスト画質2 |
| v77.14 | ダブルタップ速度2 |
| v77.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v77.1 | 자동 건너뛰기 리캡 |
| v77.2 | 폰트 글로우 크기3 |
| v77.3 | 색상 리프트2 |
| v77.4 | 서라운드2 |
| v77.5 | 캐스트 자막 동기화2 |
| v77.6 | 스와이프 속도2 |
| v77.7 | 캐시 최대 크기2 |
| v77.8 | 프로그레스 민감도2 |
| v77.9 | 스마트 속도 |
| v77.10 | 폰트 굵기4 |
| v77.11 | 색상 감마2 |
| v77.12 | 베이스2 |
| v77.13 | 캐스트 화질2 |
| v77.14 | 더블탭 속도2 |
| v77.15 | 캐시 프리페치2 |

### v78.x

<details><summary>🇨🇳</summary>

| v78.1 | 自动跳过回顾 |
| v78.2 | 字体发光大小3 |
| v78.3 | 色彩提升2 |
| v78.4 | 环绕声2 |
| v78.5 | 投屏字幕同步2 |
| v78.6 | 滑动速度2 |
| v78.7 | 缓存最大大小2 |
| v78.8 | 进度条灵敏度2 |
| v78.9 | 智能速度 |
| v78.10 | 字体粗细4 |
| v78.11 | 色彩伽马2 |
| v78.12 | 低音2 |
| v78.13 | 投屏画质2 |
| v78.14 | 双击速度2 |
| v78.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v78.1 | Auto Skip Recap |
| v78.2 | Font Glow Size3 |
| v78.3 | Color Lift2 |
| v78.4 | Volume Surround2 |
| v78.5 | Cast Subtitle Sync2 |
| v78.6 | Swipe Speed2 |
| v78.7 | Cache Max Size2 |
| v78.8 | Progress Sensitivity2 |
| v78.9 | Smart Speed |
| v78.10 | Font Weight4 |
| v78.11 | Color Gamma2 |
| v78.12 | Volume Bass2 |
| v78.13 | Cast Video Quality2 |
| v78.14 | Double Tap Speed |
| v78.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v78.1 | 自動スキップ リキャップ |
| v78.2 | フォント グロー3 |
| v78.3 | カラー リフト2 |
| v78.4 | サラウンド2 |
| v78.5 | キャスト字幕同期2 |
| v78.6 | スワイプ速度2 |
| v78.7 | キャッシュ最大2 |
| v78.8 | プログレス感度2 |
| v78.9 | スマート速度 |
| v78.10 | フォント太さ4 |
| v78.11 | カラー ガンマ2 |
| v78.12 | ベース2 |
| v78.13 | キャスト画質2 |
| v78.14 | ダブルタップ速度2 |
| v78.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v78.1 | 자동 건너뛰기 리캡 |
| v78.2 | 폰트 글로우 크기3 |
| v78.3 | 색상 리프트2 |
| v78.4 | 서라운드2 |
| v78.5 | 캐스트 자막 동기화2 |
| v78.6 | 스와이프 속도2 |
| v78.7 | 캐시 최대 크기2 |
| v78.8 | 프로그레스 민감도2 |
| v78.9 | 스마트 속도 |
| v78.10 | 폰트 굵기4 |
| v78.11 | 색상 감마2 |
| v78.12 | 베이스2 |
| v78.13 | 캐스트 화질2 |
| v78.14 | 더블탭 속도2 |
| v78.15 | 캐시 프리페치2 |

### v79.x

<details><summary>🇨🇳</summary>

| v79.1 | 自动跳过回顾 |
| v79.2 | 字体发光大小3 |
| v79.3 | 色彩提升2 |
| v79.4 | 环绕声2 |
| v79.5 | 投屏字幕同步2 |
| v79.6 | 滑动速度2 |
| v79.7 | 缓存最大大小2 |
| v79.8 | 进度条灵敏度2 |
| v79.9 | 智能速度 |
| v79.10 | 字体粗细4 |
| v79.11 | 色彩伽马2 |
| v79.12 | 低音2 |
| v79.13 | 投屏画质2 |
| v79.14 | 双击速度2 |
| v79.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v79.1 | Auto Skip Recap |
| v79.2 | Font Glow Size3 |
| v79.3 | Color Lift2 |
| v79.4 | Volume Surround2 |
| v79.5 | Cast Subtitle Sync2 |
| v79.6 | Swipe Speed2 |
| v79.7 | Cache Max Size2 |
| v79.8 | Progress Sensitivity2 |
| v79.9 | Smart Speed |
| v79.10 | Font Weight4 |
| v79.11 | Color Gamma2 |
| v79.12 | Volume Bass2 |
| v79.13 | Cast Video Quality2 |
| v79.14 | Double Tap Speed |
| v79.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v79.1 | 自動スキップ リキャップ |
| v79.2 | フォント グロー3 |
| v79.3 | カラー リフト2 |
| v79.4 | サラウンド2 |
| v79.5 | キャスト字幕同期2 |
| v79.6 | スワイプ速度2 |
| v79.7 | キャッシュ最大2 |
| v79.8 | プログレス感度2 |
| v79.9 | スマート速度 |
| v79.10 | フォント太さ4 |
| v79.11 | カラー ガンマ2 |
| v79.12 | ベース2 |
| v79.13 | キャスト画質2 |
| v79.14 | ダブルタップ速度2 |
| v79.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v79.1 | 자동 건너뛰기 리캡 |
| v79.2 | 폰트 글로우 크기3 |
| v79.3 | 색상 리프트2 |
| v79.4 | 서라운드2 |
| v79.5 | 캐스트 자막 동기화2 |
| v79.6 | 스와이프 속도2 |
| v79.7 | 캐시 최대 크기2 |
| v79.8 | 프로그레스 민감도2 |
| v79.9 | 스마트 속도 |
| v79.10 | 폰트 굵기4 |
| v79.11 | 색상 감마2 |
| v79.12 | 베이스2 |
| v79.13 | 캐스트 화질2 |
| v79.14 | 더블탭 속도2 |
| v79.15 | 캐시 프리페치2 |

### v80.x

<details><summary>🇨🇳</summary>

| v80.1 | 自动跳过回顾 |
| v80.2 | 字体发光大小3 |
| v80.3 | 色彩提升2 |
| v80.4 | 环绕声2 |
| v80.5 | 投屏字幕同步2 |
| v80.6 | 滑动速度2 |
| v80.7 | 缓存最大大小2 |
| v80.8 | 进度条灵敏度2 |
| v80.9 | 智能速度 |
| v80.10 | 字体粗细4 |
| v80.11 | 色彩伽马2 |
| v80.12 | 低音2 |
| v80.13 | 投屏画质2 |
| v80.14 | 双击速度2 |
| v80.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v80.1 | Auto Skip Recap |
| v80.2 | Font Glow Size3 |
| v80.3 | Color Lift2 |
| v80.4 | Volume Surround2 |
| v80.5 | Cast Subtitle Sync2 |
| v80.6 | Swipe Speed2 |
| v80.7 | Cache Max Size2 |
| v80.8 | Progress Sensitivity2 |
| v80.9 | Smart Speed |
| v80.10 | Font Weight4 |
| v80.11 | Color Gamma2 |
| v80.12 | Volume Bass2 |
| v80.13 | Cast Video Quality2 |
| v80.14 | Double Tap Speed |
| v80.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v80.1 | 自動スキップ リキャップ |
| v80.2 | フォント グロー3 |
| v80.3 | カラー リフト2 |
| v80.4 | サラウンド2 |
| v80.5 | キャスト字幕同期2 |
| v80.6 | スワイプ速度2 |
| v80.7 | キャッシュ最大2 |
| v80.8 | プログレス感度2 |
| v80.9 | スマート速度 |
| v80.10 | フォント太さ4 |
| v80.11 | カラー ガンマ2 |
| v80.12 | ベース2 |
| v80.13 | キャスト画質2 |
| v80.14 | ダブルタップ速度2 |
| v80.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v80.1 | 자동 건너뛰기 리캡 |
| v80.2 | 폰트 글로우 크기3 |
| v80.3 | 색상 리프트2 |
| v80.4 | 서라운드2 |
| v80.5 | 캐스트 자막 동기화2 |
| v80.6 | 스와이프 속도2 |
| v80.7 | 캐시 최대 크기2 |
| v80.8 | 프로그레스 민감도2 |
| v80.9 | 스마트 속도 |
| v80.10 | 폰트 굵기4 |
| v80.11 | 색상 감마2 |
| v80.12 | 베이스2 |
| v80.13 | 캐스트 화질2 |
| v80.14 | 더블탭 속도2 |
| v80.15 | 캐시 프리페치2 |

### v81.x

<details><summary>🇨🇳</summary>

| v81.1 | 自动跳过回顾 |
| v81.2 | 字体发光大小3 |
| v81.3 | 色彩提升2 |
| v81.4 | 环绕声2 |
| v81.5 | 投屏字幕同步2 |
| v81.6 | 滑动速度2 |
| v81.7 | 缓存最大大小2 |
| v81.8 | 进度条灵敏度2 |
| v81.9 | 智能速度 |
| v81.10 | 字体粗细4 |
| v81.11 | 色彩伽马2 |
| v81.12 | 低音2 |
| v81.13 | 投屏画质2 |
| v81.14 | 双击速度2 |
| v81.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v81.1 | Auto Skip Recap |
| v81.2 | Font Glow Size3 |
| v81.3 | Color Lift2 |
| v81.4 | Volume Surround2 |
| v81.5 | Cast Subtitle Sync2 |
| v81.6 | Swipe Speed2 |
| v81.7 | Cache Max Size2 |
| v81.8 | Progress Sensitivity2 |
| v81.9 | Smart Speed |
| v81.10 | Font Weight4 |
| v81.11 | Color Gamma2 |
| v81.12 | Volume Bass2 |
| v81.13 | Cast Video Quality2 |
| v81.14 | Double Tap Speed |
| v81.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v81.1 | 自動スキップ リキャップ |
| v81.2 | フォント グロー3 |
| v81.3 | カラー リフト2 |
| v81.4 | サラウンド2 |
| v81.5 | キャスト字幕同期2 |
| v81.6 | スワイプ速度2 |
| v81.7 | キャッシュ最大2 |
| v81.8 | プログレス感度2 |
| v81.9 | スマート速度 |
| v81.10 | フォント太さ4 |
| v81.11 | カラー ガンマ2 |
| v81.12 | ベース2 |
| v81.13 | キャスト画質2 |
| v81.14 | ダブルタップ速度2 |
| v81.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v81.1 | 자동 건너뛰기 리캡 |
| v81.2 | 폰트 글로우 크기3 |
| v81.3 | 색상 리프트2 |
| v81.4 | 서라운드2 |
| v81.5 | 캐스트 자막 동기화2 |
| v81.6 | 스와이프 속도2 |
| v81.7 | 캐시 최대 크기2 |
| v81.8 | 프로그레스 민감도2 |
| v81.9 | 스마트 속도 |
| v81.10 | 폰트 굵기4 |
| v81.11 | 색상 감마2 |
| v81.12 | 베이스2 |
| v81.13 | 캐스트 화질2 |
| v81.14 | 더블탭 속도2 |
| v81.15 | 캐시 프리페치2 |

### v82.x

<details><summary>🇨🇳</summary>

| v82.1 | 自动跳过回顾 |
| v82.2 | 字体发光大小3 |
| v82.3 | 色彩提升2 |
| v82.4 | 环绕声2 |
| v82.5 | 投屏字幕同步2 |
| v82.6 | 滑动速度2 |
| v82.7 | 缓存最大大小2 |
| v82.8 | 进度条灵敏度2 |
| v82.9 | 智能速度 |
| v82.10 | 字体粗细4 |
| v82.11 | 色彩伽马2 |
| v82.12 | 低音2 |
| v82.13 | 投屏画质2 |
| v82.14 | 双击速度2 |
| v82.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v82.1 | Auto Skip Recap |
| v82.2 | Font Glow Size3 |
| v82.3 | Color Lift2 |
| v82.4 | Volume Surround2 |
| v82.5 | Cast Subtitle Sync2 |
| v82.6 | Swipe Speed2 |
| v82.7 | Cache Max Size2 |
| v82.8 | Progress Sensitivity2 |
| v82.9 | Smart Speed |
| v82.10 | Font Weight4 |
| v82.11 | Color Gamma2 |
| v82.12 | Volume Bass2 |
| v82.13 | Cast Video Quality2 |
| v82.14 | Double Tap Speed |
| v82.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v82.1 | 自動スキップ リキャップ |
| v82.2 | フォント グロー3 |
| v82.3 | カラー リフト2 |
| v82.4 | サラウンド2 |
| v82.5 | キャスト字幕同期2 |
| v82.6 | スワイプ速度2 |
| v82.7 | キャッシュ最大2 |
| v82.8 | プログレス感度2 |
| v82.9 | スマート速度 |
| v82.10 | フォント太さ4 |
| v82.11 | カラー ガンマ2 |
| v82.12 | ベース2 |
| v82.13 | キャスト画質2 |
| v82.14 | ダブルタップ速度2 |
| v82.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v82.1 | 자동 건너뛰기 리캡 |
| v82.2 | 폰트 글로우 크기3 |
| v82.3 | 색상 리프트2 |
| v82.4 | 서라운드2 |
| v82.5 | 캐스트 자막 동기화2 |
| v82.6 | 스와이프 속도2 |
| v82.7 | 캐시 최대 크기2 |
| v82.8 | 프로그레스 민감도2 |
| v82.9 | 스마트 속도 |
| v82.10 | 폰트 굵기4 |
| v82.11 | 색상 감마2 |
| v82.12 | 베이스2 |
| v82.13 | 캐스트 화질2 |
| v82.14 | 더블탭 속도2 |
| v82.15 | 캐시 프리페치2 |

### v83.x

<details><summary>🇨🇳</summary>

| v83.1 | 自动跳过回顾 |
| v83.2 | 字体发光大小3 |
| v83.3 | 色彩提升2 |
| v83.4 | 环绕声2 |
| v83.5 | 投屏字幕同步2 |
| v83.6 | 滑动速度2 |
| v83.7 | 缓存最大大小2 |
| v83.8 | 进度条灵敏度2 |
| v83.9 | 智能速度 |
| v83.10 | 字体粗细4 |
| v83.11 | 色彩伽马2 |
| v83.12 | 低音2 |
| v83.13 | 投屏画质2 |
| v83.14 | 双击速度2 |
| v83.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v83.1 | Auto Skip Recap |
| v83.2 | Font Glow Size3 |
| v83.3 | Color Lift2 |
| v83.4 | Volume Surround2 |
| v83.5 | Cast Subtitle Sync2 |
| v83.6 | Swipe Speed2 |
| v83.7 | Cache Max Size2 |
| v83.8 | Progress Sensitivity2 |
| v83.9 | Smart Speed |
| v83.10 | Font Weight4 |
| v83.11 | Color Gamma2 |
| v83.12 | Volume Bass2 |
| v83.13 | Cast Video Quality2 |
| v83.14 | Double Tap Speed |
| v83.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v83.1 | 自動スキップ リキャップ |
| v83.2 | フォント グロー3 |
| v83.3 | カラー リフト2 |
| v83.4 | サラウンド2 |
| v83.5 | キャスト字幕同期2 |
| v83.6 | スワイプ速度2 |
| v83.7 | キャッシュ最大2 |
| v83.8 | プログレス感度2 |
| v83.9 | スマート速度 |
| v83.10 | フォント太さ4 |
| v83.11 | カラー ガンマ2 |
| v83.12 | ベース2 |
| v83.13 | キャスト画質2 |
| v83.14 | ダブルタップ速度2 |
| v83.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v83.1 | 자동 건너뛰기 리캡 |
| v83.2 | 폰트 글로우 크기3 |
| v83.3 | 색상 리프트2 |
| v83.4 | 서라운드2 |
| v83.5 | 캐스트 자막 동기화2 |
| v83.6 | 스와이프 속도2 |
| v83.7 | 캐시 최대 크기2 |
| v83.8 | 프로그레스 민감도2 |
| v83.9 | 스마트 속도 |
| v83.10 | 폰트 굵기4 |
| v83.11 | 색상 감마2 |
| v83.12 | 베이스2 |
| v83.13 | 캐스트 화질2 |
| v83.14 | 더블탭 속도2 |
| v83.15 | 캐시 프리페치2 |

### v84.x

<details><summary>🇨🇳</summary>

| v84.1 | 自动跳过回顾 |
| v84.2 | 字体发光大小3 |
| v84.3 | 色彩提升2 |
| v84.4 | 环绕声2 |
| v84.5 | 投屏字幕同步2 |
| v84.6 | 滑动速度2 |
| v84.7 | 缓存最大大小2 |
| v84.8 | 进度条灵敏度2 |
| v84.9 | 智能速度 |
| v84.10 | 字体粗细4 |
| v84.11 | 色彩伽马2 |
| v84.12 | 低音2 |
| v84.13 | 投屏画质2 |
| v84.14 | 双击速度2 |
| v84.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v84.1 | Auto Skip Recap |
| v84.2 | Font Glow Size3 |
| v84.3 | Color Lift2 |
| v84.4 | Volume Surround2 |
| v84.5 | Cast Subtitle Sync2 |
| v84.6 | Swipe Speed2 |
| v84.7 | Cache Max Size2 |
| v84.8 | Progress Sensitivity2 |
| v84.9 | Smart Speed |
| v84.10 | Font Weight4 |
| v84.11 | Color Gamma2 |
| v84.12 | Volume Bass2 |
| v84.13 | Cast Video Quality2 |
| v84.14 | Double Tap Speed |
| v84.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v84.1 | 自動スキップ リキャップ |
| v84.2 | フォント グロー3 |
| v84.3 | カラー リフト2 |
| v84.4 | サラウンド2 |
| v84.5 | キャスト字幕同期2 |
| v84.6 | スワイプ速度2 |
| v84.7 | キャッシュ最大2 |
| v84.8 | プログレス感度2 |
| v84.9 | スマート速度 |
| v84.10 | フォント太さ4 |
| v84.11 | カラー ガンマ2 |
| v84.12 | ベース2 |
| v84.13 | キャスト画質2 |
| v84.14 | ダブルタップ速度2 |
| v84.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v84.1 | 자동 건너뛰기 리캡 |
| v84.2 | 폰트 글로우 크기3 |
| v84.3 | 색상 리프트2 |
| v84.4 | 서라운드2 |
| v84.5 | 캐스트 자막 동기화2 |
| v84.6 | 스와이프 속도2 |
| v84.7 | 캐시 최대 크기2 |
| v84.8 | 프로그레스 민감도2 |
| v84.9 | 스마트 속도 |
| v84.10 | 폰트 굵기4 |
| v84.11 | 색상 감마2 |
| v84.12 | 베이스2 |
| v84.13 | 캐스트 화질2 |
| v84.14 | 더블탭 속도2 |
| v84.15 | 캐시 프리페치2 |

### v85.x

<details><summary>🇨🇳</summary>

| v85.1 | 自动跳过回顾 |
| v85.2 | 字体发光大小3 |
| v85.3 | 色彩提升2 |
| v85.4 | 环绕声2 |
| v85.5 | 投屏字幕同步2 |
| v85.6 | 滑动速度2 |
| v85.7 | 缓存最大大小2 |
| v85.8 | 进度条灵敏度2 |
| v85.9 | 智能速度 |
| v85.10 | 字体粗细4 |
| v85.11 | 色彩伽马2 |
| v85.12 | 低音2 |
| v85.13 | 投屏画质2 |
| v85.14 | 双击速度2 |
| v85.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v85.1 | Auto Skip Recap |
| v85.2 | Font Glow Size3 |
| v85.3 | Color Lift2 |
| v85.4 | Volume Surround2 |
| v85.5 | Cast Subtitle Sync2 |
| v85.6 | Swipe Speed2 |
| v85.7 | Cache Max Size2 |
| v85.8 | Progress Sensitivity2 |
| v85.9 | Smart Speed |
| v85.10 | Font Weight4 |
| v85.11 | Color Gamma2 |
| v85.12 | Volume Bass2 |
| v85.13 | Cast Video Quality2 |
| v85.14 | Double Tap Speed |
| v85.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v85.1 | 自動スキップ リキャップ |
| v85.2 | フォント グロー3 |
| v85.3 | カラー リフト2 |
| v85.4 | サラウンド2 |
| v85.5 | キャスト字幕同期2 |
| v85.6 | スワイプ速度2 |
| v85.7 | キャッシュ最大2 |
| v85.8 | プログレス感度2 |
| v85.9 | スマート速度 |
| v85.10 | フォント太さ4 |
| v85.11 | カラー ガンマ2 |
| v85.12 | ベース2 |
| v85.13 | キャスト画質2 |
| v85.14 | ダブルタップ速度2 |
| v85.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v85.1 | 자동 건너뛰기 리캡 |
| v85.2 | 폰트 글로우 크기3 |
| v85.3 | 색상 리프트2 |
| v85.4 | 서라운드2 |
| v85.5 | 캐스트 자막 동기화2 |
| v85.6 | 스와이프 속도2 |
| v85.7 | 캐시 최대 크기2 |
| v85.8 | 프로그레스 민감도2 |
| v85.9 | 스마트 속도 |
| v85.10 | 폰트 굵기4 |
| v85.11 | 색상 감마2 |
| v85.12 | 베이스2 |
| v85.13 | 캐스트 화질2 |
| v85.14 | 더블탭 속도2 |
| v85.15 | 캐시 프리페치2 |

### v86.x

<details><summary>🇨🇳</summary>

| v86.1 | 自动跳过回顾 |
| v86.2 | 字体发光大小3 |
| v86.3 | 色彩提升2 |
| v86.4 | 环绕声2 |
| v86.5 | 投屏字幕同步2 |
| v86.6 | 滑动速度2 |
| v86.7 | 缓存最大大小2 |
| v86.8 | 进度条灵敏度2 |
| v86.9 | 智能速度 |
| v86.10 | 字体粗细4 |
| v86.11 | 色彩伽马2 |
| v86.12 | 低音2 |
| v86.13 | 投屏画质2 |
| v86.14 | 双击速度2 |
| v86.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v86.1 | Auto Skip Recap |
| v86.2 | Font Glow Size3 |
| v86.3 | Color Lift2 |
| v86.4 | Volume Surround2 |
| v86.5 | Cast Subtitle Sync2 |
| v86.6 | Swipe Speed2 |
| v86.7 | Cache Max Size2 |
| v86.8 | Progress Sensitivity2 |
| v86.9 | Smart Speed |
| v86.10 | Font Weight4 |
| v86.11 | Color Gamma2 |
| v86.12 | Volume Bass2 |
| v86.13 | Cast Video Quality2 |
| v86.14 | Double Tap Speed |
| v86.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v86.1 | 自動スキップ リキャップ |
| v86.2 | フォント グロー3 |
| v86.3 | カラー リフト2 |
| v86.4 | サラウンド2 |
| v86.5 | キャスト字幕同期2 |
| v86.6 | スワイプ速度2 |
| v86.7 | キャッシュ最大2 |
| v86.8 | プログレス感度2 |
| v86.9 | スマート速度 |
| v86.10 | フォント太さ4 |
| v86.11 | カラー ガンマ2 |
| v86.12 | ベース2 |
| v86.13 | キャスト画質2 |
| v86.14 | ダブルタップ速度2 |
| v86.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v86.1 | 자동 건너뛰기 리캡 |
| v86.2 | 폰트 글로우 크기3 |
| v86.3 | 색상 리프트2 |
| v86.4 | 서라운드2 |
| v86.5 | 캐스트 자막 동기화2 |
| v86.6 | 스와이프 속도2 |
| v86.7 | 캐시 최대 크기2 |
| v86.8 | 프로그레스 민감도2 |
| v86.9 | 스마트 속도 |
| v86.10 | 폰트 굵기4 |
| v86.11 | 색상 감마2 |
| v86.12 | 베이스2 |
| v86.13 | 캐스트 화질2 |
| v86.14 | 더블탭 속도2 |
| v86.15 | 캐시 프리페치2 |

### v87.x

<details><summary>🇨🇳</summary>

| v87.1 | 自动跳过回顾 |
| v87.2 | 字体发光大小3 |
| v87.3 | 色彩提升2 |
| v87.4 | 环绕声2 |
| v87.5 | 投屏字幕同步2 |
| v87.6 | 滑动速度2 |
| v87.7 | 缓存最大大小2 |
| v87.8 | 进度条灵敏度2 |
| v87.9 | 智能速度 |
| v87.10 | 字体粗细4 |
| v87.11 | 色彩伽马2 |
| v87.12 | 低音2 |
| v87.13 | 投屏画质2 |
| v87.14 | 双击速度2 |
| v87.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v87.1 | Auto Skip Recap |
| v87.2 | Font Glow Size3 |
| v87.3 | Color Lift2 |
| v87.4 | Volume Surround2 |
| v87.5 | Cast Subtitle Sync2 |
| v87.6 | Swipe Speed2 |
| v87.7 | Cache Max Size2 |
| v87.8 | Progress Sensitivity2 |
| v87.9 | Smart Speed |
| v87.10 | Font Weight4 |
| v87.11 | Color Gamma2 |
| v87.12 | Volume Bass2 |
| v87.13 | Cast Video Quality2 |
| v87.14 | Double Tap Speed |
| v87.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v87.1 | 自動スキップ リキャップ |
| v87.2 | フォント グロー3 |
| v87.3 | カラー リフト2 |
| v87.4 | サラウンド2 |
| v87.5 | キャスト字幕同期2 |
| v87.6 | スワイプ速度2 |
| v87.7 | キャッシュ最大2 |
| v87.8 | プログレス感度2 |
| v87.9 | スマート速度 |
| v87.10 | フォント太さ4 |
| v87.11 | カラー ガンマ2 |
| v87.12 | ベース2 |
| v87.13 | キャスト画質2 |
| v87.14 | ダブルタップ速度2 |
| v87.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v87.1 | 자동 건너뛰기 리캡 |
| v87.2 | 폰트 글로우 크기3 |
| v87.3 | 색상 리프트2 |
| v87.4 | 서라운드2 |
| v87.5 | 캐스트 자막 동기화2 |
| v87.6 | 스와이프 속도2 |
| v87.7 | 캐시 최대 크기2 |
| v87.8 | 프로그레스 민감도2 |
| v87.9 | 스마트 속도 |
| v87.10 | 폰트 굵기4 |
| v87.11 | 색상 감마2 |
| v87.12 | 베이스2 |
| v87.13 | 캐스트 화질2 |
| v87.14 | 더블탭 속도2 |
| v87.15 | 캐시 프리페치2 |

### v88.x

<details><summary>🇨🇳</summary>

| v88.1 | 自动跳过回顾 |
| v88.2 | 字体发光大小3 |
| v88.3 | 色彩提升2 |
| v88.4 | 环绕声2 |
| v88.5 | 投屏字幕同步2 |
| v88.6 | 滑动速度2 |
| v88.7 | 缓存最大大小2 |
| v88.8 | 进度条灵敏度2 |
| v88.9 | 智能速度 |
| v88.10 | 字体粗细4 |
| v88.11 | 色彩伽马2 |
| v88.12 | 低音2 |
| v88.13 | 投屏画质2 |
| v88.14 | 双击速度2 |
| v88.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v88.1 | Auto Skip Recap |
| v88.2 | Font Glow Size3 |
| v88.3 | Color Lift2 |
| v88.4 | Volume Surround2 |
| v88.5 | Cast Subtitle Sync2 |
| v88.6 | Swipe Speed2 |
| v88.7 | Cache Max Size2 |
| v88.8 | Progress Sensitivity2 |
| v88.9 | Smart Speed |
| v88.10 | Font Weight4 |
| v88.11 | Color Gamma2 |
| v88.12 | Volume Bass2 |
| v88.13 | Cast Video Quality2 |
| v88.14 | Double Tap Speed |
| v88.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v88.1 | 自動スキップ リキャップ |
| v88.2 | フォント グロー3 |
| v88.3 | カラー リフト2 |
| v88.4 | サラウンド2 |
| v88.5 | キャスト字幕同期2 |
| v88.6 | スワイプ速度2 |
| v88.7 | キャッシュ最大2 |
| v88.8 | プログレス感度2 |
| v88.9 | スマート速度 |
| v88.10 | フォント太さ4 |
| v88.11 | カラー ガンマ2 |
| v88.12 | ベース2 |
| v88.13 | キャスト画質2 |
| v88.14 | ダブルタップ速度2 |
| v88.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v88.1 | 자동 건너뛰기 리캡 |
| v88.2 | 폰트 글로우 크기3 |
| v88.3 | 색상 리프트2 |
| v88.4 | 서라운드2 |
| v88.5 | 캐스트 자막 동기화2 |
| v88.6 | 스와이프 속도2 |
| v88.7 | 캐시 최대 크기2 |
| v88.8 | 프로그레스 민감도2 |
| v88.9 | 스마트 속도 |
| v88.10 | 폰트 굵기4 |
| v88.11 | 색상 감마2 |
| v88.12 | 베이스2 |
| v88.13 | 캐스트 화질2 |
| v88.14 | 더블탭 속도2 |
| v88.15 | 캐시 프리페치2 |

### v89.x

<details><summary>🇨🇳</summary>

| v89.1 | 自动跳过回顾 |
| v89.2 | 字体发光大小3 |
| v89.3 | 色彩提升2 |
| v89.4 | 环绕声2 |
| v89.5 | 投屏字幕同步2 |
| v89.6 | 滑动速度2 |
| v89.7 | 缓存最大大小2 |
| v89.8 | 进度条灵敏度2 |
| v89.9 | 智能速度 |
| v89.10 | 字体粗细4 |
| v89.11 | 色彩伽马2 |
| v89.12 | 低音2 |
| v89.13 | 投屏画质2 |
| v89.14 | 双击速度2 |
| v89.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v89.1 | Auto Skip Recap |
| v89.2 | Font Glow Size3 |
| v89.3 | Color Lift2 |
| v89.4 | Volume Surround2 |
| v89.5 | Cast Subtitle Sync2 |
| v89.6 | Swipe Speed2 |
| v89.7 | Cache Max Size2 |
| v89.8 | Progress Sensitivity2 |
| v89.9 | Smart Speed |
| v89.10 | Font Weight4 |
| v89.11 | Color Gamma2 |
| v89.12 | Volume Bass2 |
| v89.13 | Cast Video Quality2 |
| v89.14 | Double Tap Speed |
| v89.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v89.1 | 自動スキップ リキャップ |
| v89.2 | フォント グロー3 |
| v89.3 | カラー リフト2 |
| v89.4 | サラウンド2 |
| v89.5 | キャスト字幕同期2 |
| v89.6 | スワイプ速度2 |
| v89.7 | キャッシュ最大2 |
| v89.8 | プログレス感度2 |
| v89.9 | スマート速度 |
| v89.10 | フォント太さ4 |
| v89.11 | カラー ガンマ2 |
| v89.12 | ベース2 |
| v89.13 | キャスト画質2 |
| v89.14 | ダブルタップ速度2 |
| v89.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v89.1 | 자동 건너뛰기 리캡 |
| v89.2 | 폰트 글로우 크기3 |
| v89.3 | 색상 리프트2 |
| v89.4 | 서라운드2 |
| v89.5 | 캐스트 자막 동기화2 |
| v89.6 | 스와이프 속도2 |
| v89.7 | 캐시 최대 크기2 |
| v89.8 | 프로그레스 민감도2 |
| v89.9 | 스마트 속도 |
| v89.10 | 폰트 굵기4 |
| v89.11 | 색상 감마2 |
| v89.12 | 베이스2 |
| v89.13 | 캐스트 화질2 |
| v89.14 | 더블탭 속도2 |
| v89.15 | 캐시 프리페치2 |

### v91.x
<details><summary>🇨🇳</summary>
| v91.1 | 智能缓冲3 |
| v91.2 | 字体透明度3 |
| v91.3 | 饱和度3 |
| v91.4 | 音量限制器3 |
| v91.5 | 投屏带宽3 |
| v91.6 | 捏合缩放3 |
| v91.7 | 缓存加密3 |
| v91.8 | 缩略图大小3 |
| v91.9 | 自动循环2 |
| v91.10 | 过滤评分4 |
| v91.11 | 色彩对比度3 |
| v91.12 | 音量EQ3 |
| v91.13 | 投屏重连4 |
| v91.14 | 旋转3 |
| v91.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v91.1 | Smart Buffer3 |
| v91.2 | Font Alpha3 |
| v91.3 | Saturation3 |
| v91.4 | Volume Limiter3 |
| v91.5 | Cast Bandwidth3 |
| v91.6 | Pinch Zoom3 |
| v91.7 | Cache Encrypt3 |
| v91.8 | Thumb Size3 |
| v91.9 | Auto Loop2 |
| v91.10 | Filter Score4 |
| v91.11 | Color Contrast3 |
| v91.12 | Volume EQ3 |
| v91.13 | Cast Reconnect4 |
| v91.14 | Rotation3 |
| v91.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v91.1 | スマートバッファ3 |
| v91.2 | フォント透明度3 |
| v91.3 | 彩度3 |
| v91.4 | 音量リミッタ3 |
| v91.5 | キャスト帯域3 |
| v91.6 | ピンチズーム3 |
| v91.7 | キャッシュ暗号化3 |
| v91.8 | サムネイルサイズ3 |
| v91.9 | 自動ループ2 |
| v91.10 | フィルタースコア4 |
| v91.11 | コントラスト3 |
| v91.12 | ボリュームEQ3 |
| v91.13 | キャスト再接続4 |
| v91.14 | 回転3 |
| v91.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v91.1 | 스마트 버퍼3 |
| v91.2 | 폰트 투명도3 |
| v91.3 | 채도3 |
| v91.4 | 볼륨 리미터3 |
| v91.5 | 캐스트 대역폭3 |
| v91.6 | 핀치 줌3 |
| v91.7 | 캐시 암호화3 |
| v91.8 | 썸네일 크기3 |
| v91.9 | 자동 반복2 |
| v91.10 | 필터 스코어4 |
| v91.11 | 색상 대비3 |
| v91.12 | 볼륨 EQ3 |
| v91.13 | 캐스트 재연결4 |
| v91.14 | 회전3 |
| v91.15 | 캐시 자동정리3 |

### v92.x
<details><summary>🇨🇳</summary>
| v92.1 | 智能缓冲3 |
| v92.2 | 字体透明度3 |
| v92.3 | 饱和度3 |
| v92.4 | 音量限制器3 |
| v92.5 | 投屏带宽3 |
| v92.6 | 捏合缩放3 |
| v92.7 | 缓存加密3 |
| v92.8 | 缩略图大小3 |
| v92.9 | 自动循环2 |
| v92.10 | 过滤评分4 |
| v92.11 | 色彩对比度3 |
| v92.12 | 音量EQ3 |
| v92.13 | 投屏重连4 |
| v92.14 | 旋转3 |
| v92.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v92.1 | Smart Buffer3 |
| v92.2 | Font Alpha3 |
| v92.3 | Saturation3 |
| v92.4 | Volume Limiter3 |
| v92.5 | Cast Bandwidth3 |
| v92.6 | Pinch Zoom3 |
| v92.7 | Cache Encrypt3 |
| v92.8 | Thumb Size3 |
| v92.9 | Auto Loop2 |
| v92.10 | Filter Score4 |
| v92.11 | Color Contrast3 |
| v92.12 | Volume EQ3 |
| v92.13 | Cast Reconnect4 |
| v92.14 | Rotation3 |
| v92.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v92.1 | スマートバッファ3 |
| v92.2 | フォント透明度3 |
| v92.3 | 彩度3 |
| v92.4 | 音量リミッタ3 |
| v92.5 | キャスト帯域3 |
| v92.6 | ピンチズーム3 |
| v92.7 | キャッシュ暗号化3 |
| v92.8 | サムネイルサイズ3 |
| v92.9 | 自動ループ2 |
| v92.10 | フィルタースコア4 |
| v92.11 | コントラスト3 |
| v92.12 | ボリュームEQ3 |
| v92.13 | キャスト再接続4 |
| v92.14 | 回転3 |
| v92.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v92.1 | 스마트 버퍼3 |
| v92.2 | 폰트 투명도3 |
| v92.3 | 채도3 |
| v92.4 | 볼륨 리미터3 |
| v92.5 | 캐스트 대역폭3 |
| v92.6 | 핀치 줌3 |
| v92.7 | 캐시 암호화3 |
| v92.8 | 썸네일 크기3 |
| v92.9 | 자동 반복2 |
| v92.10 | 필터 스코어4 |
| v92.11 | 색상 대비3 |
| v92.12 | 볼륨 EQ3 |
| v92.13 | 캐스트 재연결4 |
| v92.14 | 회전3 |
| v92.15 | 캐시 자동정리3 |

### v93.x
<details><summary>🇨🇳</summary>
| v93.1 | 智能缓冲3 |
| v93.2 | 字体透明度3 |
| v93.3 | 饱和度3 |
| v93.4 | 音量限制器3 |
| v93.5 | 投屏带宽3 |
| v93.6 | 捏合缩放3 |
| v93.7 | 缓存加密3 |
| v93.8 | 缩略图大小3 |
| v93.9 | 自动循环2 |
| v93.10 | 过滤评分4 |
| v93.11 | 色彩对比度3 |
| v93.12 | 音量EQ3 |
| v93.13 | 投屏重连4 |
| v93.14 | 旋转3 |
| v93.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v93.1 | Smart Buffer3 |
| v93.2 | Font Alpha3 |
| v93.3 | Saturation3 |
| v93.4 | Volume Limiter3 |
| v93.5 | Cast Bandwidth3 |
| v93.6 | Pinch Zoom3 |
| v93.7 | Cache Encrypt3 |
| v93.8 | Thumb Size3 |
| v93.9 | Auto Loop2 |
| v93.10 | Filter Score4 |
| v93.11 | Color Contrast3 |
| v93.12 | Volume EQ3 |
| v93.13 | Cast Reconnect4 |
| v93.14 | Rotation3 |
| v93.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v93.1 | スマートバッファ3 |
| v93.2 | フォント透明度3 |
| v93.3 | 彩度3 |
| v93.4 | 音量リミッタ3 |
| v93.5 | キャスト帯域3 |
| v93.6 | ピンチズーム3 |
| v93.7 | キャッシュ暗号化3 |
| v93.8 | サムネイルサイズ3 |
| v93.9 | 自動ループ2 |
| v93.10 | フィルタースコア4 |
| v93.11 | コントラスト3 |
| v93.12 | ボリュームEQ3 |
| v93.13 | キャスト再接続4 |
| v93.14 | 回転3 |
| v93.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v93.1 | 스마트 버퍼3 |
| v93.2 | 폰트 투명도3 |
| v93.3 | 채도3 |
| v93.4 | 볼륨 리미터3 |
| v93.5 | 캐스트 대역폭3 |
| v93.6 | 핀치 줌3 |
| v93.7 | 캐시 암호화3 |
| v93.8 | 썸네일 크기3 |
| v93.9 | 자동 반복2 |
| v93.10 | 필터 스코어4 |
| v93.11 | 색상 대비3 |
| v93.12 | 볼륨 EQ3 |
| v93.13 | 캐스트 재연결4 |
| v93.14 | 회전3 |
| v93.15 | 캐시 자동정리3 |

### v94.x
<details><summary>🇨🇳</summary>
| v94.1 | 智能缓冲3 |
| v94.2 | 字体透明度3 |
| v94.3 | 饱和度3 |
| v94.4 | 音量限制器3 |
| v94.5 | 投屏带宽3 |
| v94.6 | 捏合缩放3 |
| v94.7 | 缓存加密3 |
| v94.8 | 缩略图大小3 |
| v94.9 | 自动循环2 |
| v94.10 | 过滤评分4 |
| v94.11 | 色彩对比度3 |
| v94.12 | 音量EQ3 |
| v94.13 | 投屏重连4 |
| v94.14 | 旋转3 |
| v94.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v94.1 | Smart Buffer3 |
| v94.2 | Font Alpha3 |
| v94.3 | Saturation3 |
| v94.4 | Volume Limiter3 |
| v94.5 | Cast Bandwidth3 |
| v94.6 | Pinch Zoom3 |
| v94.7 | Cache Encrypt3 |
| v94.8 | Thumb Size3 |
| v94.9 | Auto Loop2 |
| v94.10 | Filter Score4 |
| v94.11 | Color Contrast3 |
| v94.12 | Volume EQ3 |
| v94.13 | Cast Reconnect4 |
| v94.14 | Rotation3 |
| v94.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v94.1 | スマートバッファ3 |
| v94.2 | フォント透明度3 |
| v94.3 | 彩度3 |
| v94.4 | 音量リミッタ3 |
| v94.5 | キャスト帯域3 |
| v94.6 | ピンチズーム3 |
| v94.7 | キャッシュ暗号化3 |
| v94.8 | サムネイルサイズ3 |
| v94.9 | 自動ループ2 |
| v94.10 | フィルタースコア4 |
| v94.11 | コントラスト3 |
| v94.12 | ボリュームEQ3 |
| v94.13 | キャスト再接続4 |
| v94.14 | 回転3 |
| v94.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v94.1 | 스마트 버퍼3 |
| v94.2 | 폰트 투명도3 |
| v94.3 | 채도3 |
| v94.4 | 볼륨 리미터3 |
| v94.5 | 캐스트 대역폭3 |
| v94.6 | 핀치 줌3 |
| v94.7 | 캐시 암호화3 |
| v94.8 | 썸네일 크기3 |
| v94.9 | 자동 반복2 |
| v94.10 | 필터 스코어4 |
| v94.11 | 색상 대비3 |
| v94.12 | 볼륨 EQ3 |
| v94.13 | 캐스트 재연결4 |
| v94.14 | 회전3 |
| v94.15 | 캐시 자동정리3 |

### v95.x
<details><summary>🇨🇳</summary>
| v95.1 | 智能缓冲3 |
| v95.2 | 字体透明度3 |
| v95.3 | 饱和度3 |
| v95.4 | 音量限制器3 |
| v95.5 | 投屏带宽3 |
| v95.6 | 捏合缩放3 |
| v95.7 | 缓存加密3 |
| v95.8 | 缩略图大小3 |
| v95.9 | 自动循环2 |
| v95.10 | 过滤评分4 |
| v95.11 | 色彩对比度3 |
| v95.12 | 音量EQ3 |
| v95.13 | 投屏重连4 |
| v95.14 | 旋转3 |
| v95.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v95.1 | Smart Buffer3 |
| v95.2 | Font Alpha3 |
| v95.3 | Saturation3 |
| v95.4 | Volume Limiter3 |
| v95.5 | Cast Bandwidth3 |
| v95.6 | Pinch Zoom3 |
| v95.7 | Cache Encrypt3 |
| v95.8 | Thumb Size3 |
| v95.9 | Auto Loop2 |
| v95.10 | Filter Score4 |
| v95.11 | Color Contrast3 |
| v95.12 | Volume EQ3 |
| v95.13 | Cast Reconnect4 |
| v95.14 | Rotation3 |
| v95.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v95.1 | スマートバッファ3 |
| v95.2 | フォント透明度3 |
| v95.3 | 彩度3 |
| v95.4 | 音量リミッタ3 |
| v95.5 | キャスト帯域3 |
| v95.6 | ピンチズーム3 |
| v95.7 | キャッシュ暗号化3 |
| v95.8 | サムネイルサイズ3 |
| v95.9 | 自動ループ2 |
| v95.10 | フィルタースコア4 |
| v95.11 | コントラスト3 |
| v95.12 | ボリュームEQ3 |
| v95.13 | キャスト再接続4 |
| v95.14 | 回転3 |
| v95.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v95.1 | 스마트 버퍼3 |
| v95.2 | 폰트 투명도3 |
| v95.3 | 채도3 |
| v95.4 | 볼륨 리미터3 |
| v95.5 | 캐스트 대역폭3 |
| v95.6 | 핀치 줌3 |
| v95.7 | 캐시 암호화3 |
| v95.8 | 썸네일 크기3 |
| v95.9 | 자동 반복2 |
| v95.10 | 필터 스코어4 |
| v95.11 | 색상 대비3 |
| v95.12 | 볼륨 EQ3 |
| v95.13 | 캐스트 재연결4 |
| v95.14 | 회전3 |
| v95.15 | 캐시 자동정리3 |

### v96.x
<details><summary>🇨🇳</summary>
| v96.1 | 智能缓冲3 |
| v96.2 | 字体透明度3 |
| v96.3 | 饱和度3 |
| v96.4 | 音量限制器3 |
| v96.5 | 投屏带宽3 |
| v96.6 | 捏合缩放3 |
| v96.7 | 缓存加密3 |
| v96.8 | 缩略图大小3 |
| v96.9 | 自动循环2 |
| v96.10 | 过滤评分4 |
| v96.11 | 色彩对比度3 |
| v96.12 | 音量EQ3 |
| v96.13 | 投屏重连4 |
| v96.14 | 旋转3 |
| v96.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v96.1 | Smart Buffer3 |
| v96.2 | Font Alpha3 |
| v96.3 | Saturation3 |
| v96.4 | Volume Limiter3 |
| v96.5 | Cast Bandwidth3 |
| v96.6 | Pinch Zoom3 |
| v96.7 | Cache Encrypt3 |
| v96.8 | Thumb Size3 |
| v96.9 | Auto Loop2 |
| v96.10 | Filter Score4 |
| v96.11 | Color Contrast3 |
| v96.12 | Volume EQ3 |
| v96.13 | Cast Reconnect4 |
| v96.14 | Rotation3 |
| v96.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v96.1 | スマートバッファ3 |
| v96.2 | フォント透明度3 |
| v96.3 | 彩度3 |
| v96.4 | 音量リミッタ3 |
| v96.5 | キャスト帯域3 |
| v96.6 | ピンチズーム3 |
| v96.7 | キャッシュ暗号化3 |
| v96.8 | サムネイルサイズ3 |
| v96.9 | 自動ループ2 |
| v96.10 | フィルタースコア4 |
| v96.11 | コントラスト3 |
| v96.12 | ボリュームEQ3 |
| v96.13 | キャスト再接続4 |
| v96.14 | 回転3 |
| v96.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v96.1 | 스마트 버퍼3 |
| v96.2 | 폰트 투명도3 |
| v96.3 | 채도3 |
| v96.4 | 볼륨 리미터3 |
| v96.5 | 캐스트 대역폭3 |
| v96.6 | 핀치 줌3 |
| v96.7 | 캐시 암호화3 |
| v96.8 | 썸네일 크기3 |
| v96.9 | 자동 반복2 |
| v96.10 | 필터 스코어4 |
| v96.11 | 색상 대비3 |
| v96.12 | 볼륨 EQ3 |
| v96.13 | 캐스트 재연결4 |
| v96.14 | 회전3 |
| v96.15 | 캐시 자동정리3 |

### v97.x
<details><summary>🇨🇳</summary>
| v97.1 | 智能缓冲3 |
| v97.2 | 字体透明度3 |
| v97.3 | 饱和度3 |
| v97.4 | 音量限制器3 |
| v97.5 | 投屏带宽3 |
| v97.6 | 捏合缩放3 |
| v97.7 | 缓存加密3 |
| v97.8 | 缩略图大小3 |
| v97.9 | 自动循环2 |
| v97.10 | 过滤评分4 |
| v97.11 | 色彩对比度3 |
| v97.12 | 音量EQ3 |
| v97.13 | 投屏重连4 |
| v97.14 | 旋转3 |
| v97.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v97.1 | Smart Buffer3 |
| v97.2 | Font Alpha3 |
| v97.3 | Saturation3 |
| v97.4 | Volume Limiter3 |
| v97.5 | Cast Bandwidth3 |
| v97.6 | Pinch Zoom3 |
| v97.7 | Cache Encrypt3 |
| v97.8 | Thumb Size3 |
| v97.9 | Auto Loop2 |
| v97.10 | Filter Score4 |
| v97.11 | Color Contrast3 |
| v97.12 | Volume EQ3 |
| v97.13 | Cast Reconnect4 |
| v97.14 | Rotation3 |
| v97.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v97.1 | スマートバッファ3 |
| v97.2 | フォント透明度3 |
| v97.3 | 彩度3 |
| v97.4 | 音量リミッタ3 |
| v97.5 | キャスト帯域3 |
| v97.6 | ピンチズーム3 |
| v97.7 | キャッシュ暗号化3 |
| v97.8 | サムネイルサイズ3 |
| v97.9 | 自動ループ2 |
| v97.10 | フィルタースコア4 |
| v97.11 | コントラスト3 |
| v97.12 | ボリュームEQ3 |
| v97.13 | キャスト再接続4 |
| v97.14 | 回転3 |
| v97.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v97.1 | 스마트 버퍼3 |
| v97.2 | 폰트 투명도3 |
| v97.3 | 채도3 |
| v97.4 | 볼륨 리미터3 |
| v97.5 | 캐스트 대역폭3 |
| v97.6 | 핀치 줌3 |
| v97.7 | 캐시 암호화3 |
| v97.8 | 썸네일 크기3 |
| v97.9 | 자동 반복2 |
| v97.10 | 필터 스코어4 |
| v97.11 | 색상 대비3 |
| v97.12 | 볼륨 EQ3 |
| v97.13 | 캐스트 재연결4 |
| v97.14 | 회전3 |
| v97.15 | 캐시 자동정리3 |

### v98.x
<details><summary>🇨🇳</summary>
| v98.1 | 智能缓冲3 |
| v98.2 | 字体透明度3 |
| v98.3 | 饱和度3 |
| v98.4 | 音量限制器3 |
| v98.5 | 投屏带宽3 |
| v98.6 | 捏合缩放3 |
| v98.7 | 缓存加密3 |
| v98.8 | 缩略图大小3 |
| v98.9 | 自动循环2 |
| v98.10 | 过滤评分4 |
| v98.11 | 色彩对比度3 |
| v98.12 | 音量EQ3 |
| v98.13 | 投屏重连4 |
| v98.14 | 旋转3 |
| v98.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v98.1 | Smart Buffer3 |
| v98.2 | Font Alpha3 |
| v98.3 | Saturation3 |
| v98.4 | Volume Limiter3 |
| v98.5 | Cast Bandwidth3 |
| v98.6 | Pinch Zoom3 |
| v98.7 | Cache Encrypt3 |
| v98.8 | Thumb Size3 |
| v98.9 | Auto Loop2 |
| v98.10 | Filter Score4 |
| v98.11 | Color Contrast3 |
| v98.12 | Volume EQ3 |
| v98.13 | Cast Reconnect4 |
| v98.14 | Rotation3 |
| v98.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v98.1 | スマートバッファ3 |
| v98.2 | フォント透明度3 |
| v98.3 | 彩度3 |
| v98.4 | 音量リミッタ3 |
| v98.5 | キャスト帯域3 |
| v98.6 | ピンチズーム3 |
| v98.7 | キャッシュ暗号化3 |
| v98.8 | サムネイルサイズ3 |
| v98.9 | 自動ループ2 |
| v98.10 | フィルタースコア4 |
| v98.11 | コントラスト3 |
| v98.12 | ボリュームEQ3 |
| v98.13 | キャスト再接続4 |
| v98.14 | 回転3 |
| v98.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v98.1 | 스마트 버퍼3 |
| v98.2 | 폰트 투명도3 |
| v98.3 | 채도3 |
| v98.4 | 볼륨 리미터3 |
| v98.5 | 캐스트 대역폭3 |
| v98.6 | 핀치 줌3 |
| v98.7 | 캐시 암호화3 |
| v98.8 | 썸네일 크기3 |
| v98.9 | 자동 반복2 |
| v98.10 | 필터 스코어4 |
| v98.11 | 색상 대비3 |
| v98.12 | 볼륨 EQ3 |
| v98.13 | 캐스트 재연결4 |
| v98.14 | 회전3 |
| v98.15 | 캐시 자동정리3 |

### v99.x
<details><summary>🇨🇳</summary>
| v99.1 | 智能缓冲3 |
| v99.2 | 字体透明度3 |
| v99.3 | 饱和度3 |
| v99.4 | 音量限制器3 |
| v99.5 | 投屏带宽3 |
| v99.6 | 捏合缩放3 |
| v99.7 | 缓存加密3 |
| v99.8 | 缩略图大小3 |
| v99.9 | 自动循环2 |
| v99.10 | 过滤评分4 |
| v99.11 | 色彩对比度3 |
| v99.12 | 音量EQ3 |
| v99.13 | 投屏重连4 |
| v99.14 | 旋转3 |
| v99.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v99.1 | Smart Buffer3 |
| v99.2 | Font Alpha3 |
| v99.3 | Saturation3 |
| v99.4 | Volume Limiter3 |
| v99.5 | Cast Bandwidth3 |
| v99.6 | Pinch Zoom3 |
| v99.7 | Cache Encrypt3 |
| v99.8 | Thumb Size3 |
| v99.9 | Auto Loop2 |
| v99.10 | Filter Score4 |
| v99.11 | Color Contrast3 |
| v99.12 | Volume EQ3 |
| v99.13 | Cast Reconnect4 |
| v99.14 | Rotation3 |
| v99.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v99.1 | スマートバッファ3 |
| v99.2 | フォント透明度3 |
| v99.3 | 彩度3 |
| v99.4 | 音量リミッタ3 |
| v99.5 | キャスト帯域3 |
| v99.6 | ピンチズーム3 |
| v99.7 | キャッシュ暗号化3 |
| v99.8 | サムネイルサイズ3 |
| v99.9 | 自動ループ2 |
| v99.10 | フィルタースコア4 |
| v99.11 | コントラスト3 |
| v99.12 | ボリュームEQ3 |
| v99.13 | キャスト再接続4 |
| v99.14 | 回転3 |
| v99.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v99.1 | 스마트 버퍼3 |
| v99.2 | 폰트 투명도3 |
| v99.3 | 채도3 |
| v99.4 | 볼륨 리미터3 |
| v99.5 | 캐스트 대역폭3 |
| v99.6 | 핀치 줌3 |
| v99.7 | 캐시 암호화3 |
| v99.8 | 썸네일 크기3 |
| v99.9 | 자동 반복2 |
| v99.10 | 필터 스코어4 |
| v99.11 | 색상 대비3 |
| v99.12 | 볼륨 EQ3 |
| v99.13 | 캐스트 재연결4 |
| v99.14 | 회전3 |
| v99.15 | 캐시 자동정리3 |

### v101.x
<details><summary>🇨🇳</summary>
| v101.1 | 自动恢复3 |
| v101.2 | 字体模糊3 |
| v101.3 | 中间调3 |
| v101.4 | 音量压缩3 |
| v101.5 | 投屏字幕字体3 |
| v101.6 | 边缘滑动3 |
| v101.7 | 缓存预读3 |
| v101.8 | 进度条颜色3 |
| v101.9 | 自动跳过片尾2 |
| v101.10 | 字体发光颜色4 |
| v101.11 | 高光3 |
| v101.12 | 峰值限制3 |
| v101.13 | 投屏分辨率3 |
| v101.14 | 触觉反馈3 |
| v101.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v101.1 | Auto Resume3 |
| v101.2 | Font Blur3 |
| v101.3 | Midtone3 |
| v101.4 | Volume Compressor3 |
| v101.5 | Cast Subtitle Font3 |
| v101.6 | Edge Pan3 |
| v101.7 | Cache ReadAhead3 |
| v101.8 | Progress Color3 |
| v101.9 | Auto Skip Credits2 |
| v101.10 | Font Glow Color4 |
| v101.11 | Highlight3 |
| v101.12 | Peak Limiter3 |
| v101.13 | Cast Resolution3 |
| v101.14 | Haptic3 |
| v101.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v101.1 | 自動レジューム3 |
| v101.2 | フォントぼかし3 |
| v101.3 | ミッドトーン3 |
| v101.4 | ボリュームコンプレッサ3 |
| v101.5 | キャスト字幕フォント3 |
| v101.6 | エッジパン3 |
| v101.7 | キャッシュリードアヘッド3 |
| v101.8 | プログレスカラー3 |
| v101.9 | 自動スキップ ED2 |
| v101.10 | フォントグロー色4 |
| v101.11 | ハイライト3 |
| v101.12 | ピークリミッタ3 |
| v101.13 | キャスト解像度3 |
| v101.14 | ハプティック3 |
| v101.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v101.1 | 자동 재개3 |
| v101.2 | 폰트 블러3 |
| v101.3 | 미드톤3 |
| v101.4 | 볼륨 컴프레서3 |
| v101.5 | 캐스트 자막 폰트3 |
| v101.6 | 엣지 팬3 |
| v101.7 | 캐시 리드어헤드3 |
| v101.8 | 프로그레스 색상3 |
| v101.9 | 자동 건너뛰기 ED2 |
| v101.10 | 폰트 글로우 색상4 |
| v101.11 | 하이라이트3 |
| v101.12 | 피크 리미터3 |
| v101.13 | 캐스트 해상도3 |
| v101.14 | 햅틱3 |
| v101.15 | 캐시 디스크 정책3 |

### v102.x
<details><summary>🇨🇳</summary>
| v102.1 | 自动恢复3 |
| v102.2 | 字体模糊3 |
| v102.3 | 中间调3 |
| v102.4 | 音量压缩3 |
| v102.5 | 投屏字幕字体3 |
| v102.6 | 边缘滑动3 |
| v102.7 | 缓存预读3 |
| v102.8 | 进度条颜色3 |
| v102.9 | 自动跳过片尾2 |
| v102.10 | 字体发光颜色4 |
| v102.11 | 高光3 |
| v102.12 | 峰值限制3 |
| v102.13 | 投屏分辨率3 |
| v102.14 | 触觉反馈3 |
| v102.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v102.1 | Auto Resume3 |
| v102.2 | Font Blur3 |
| v102.3 | Midtone3 |
| v102.4 | Volume Compressor3 |
| v102.5 | Cast Subtitle Font3 |
| v102.6 | Edge Pan3 |
| v102.7 | Cache ReadAhead3 |
| v102.8 | Progress Color3 |
| v102.9 | Auto Skip Credits2 |
| v102.10 | Font Glow Color4 |
| v102.11 | Highlight3 |
| v102.12 | Peak Limiter3 |
| v102.13 | Cast Resolution3 |
| v102.14 | Haptic3 |
| v102.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v102.1 | 自動レジューム3 |
| v102.2 | フォントぼかし3 |
| v102.3 | ミッドトーン3 |
| v102.4 | ボリュームコンプレッサ3 |
| v102.5 | キャスト字幕フォント3 |
| v102.6 | エッジパン3 |
| v102.7 | キャッシュリードアヘッド3 |
| v102.8 | プログレスカラー3 |
| v102.9 | 自動スキップ ED2 |
| v102.10 | フォントグロー色4 |
| v102.11 | ハイライト3 |
| v102.12 | ピークリミッタ3 |
| v102.13 | キャスト解像度3 |
| v102.14 | ハプティック3 |
| v102.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v102.1 | 자동 재개3 |
| v102.2 | 폰트 블러3 |
| v102.3 | 미드톤3 |
| v102.4 | 볼륨 컴프레서3 |
| v102.5 | 캐스트 자막 폰트3 |
| v102.6 | 엣지 팬3 |
| v102.7 | 캐시 리드어헤드3 |
| v102.8 | 프로그레스 색상3 |
| v102.9 | 자동 건너뛰기 ED2 |
| v102.10 | 폰트 글로우 색상4 |
| v102.11 | 하이라이트3 |
| v102.12 | 피크 리미터3 |
| v102.13 | 캐스트 해상도3 |
| v102.14 | 햅틱3 |
| v102.15 | 캐시 디스크 정책3 |

### v103.x
<details><summary>🇨🇳</summary>
| v103.1 | 自动恢复3 |
| v103.2 | 字体模糊3 |
| v103.3 | 中间调3 |
| v103.4 | 音量压缩3 |
| v103.5 | 投屏字幕字体3 |
| v103.6 | 边缘滑动3 |
| v103.7 | 缓存预读3 |
| v103.8 | 进度条颜色3 |
| v103.9 | 自动跳过片尾2 |
| v103.10 | 字体发光颜色4 |
| v103.11 | 高光3 |
| v103.12 | 峰值限制3 |
| v103.13 | 投屏分辨率3 |
| v103.14 | 触觉反馈3 |
| v103.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v103.1 | Auto Resume3 |
| v103.2 | Font Blur3 |
| v103.3 | Midtone3 |
| v103.4 | Volume Compressor3 |
| v103.5 | Cast Subtitle Font3 |
| v103.6 | Edge Pan3 |
| v103.7 | Cache ReadAhead3 |
| v103.8 | Progress Color3 |
| v103.9 | Auto Skip Credits2 |
| v103.10 | Font Glow Color4 |
| v103.11 | Highlight3 |
| v103.12 | Peak Limiter3 |
| v103.13 | Cast Resolution3 |
| v103.14 | Haptic3 |
| v103.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v103.1 | 自動レジューム3 |
| v103.2 | フォントぼかし3 |
| v103.3 | ミッドトーン3 |
| v103.4 | ボリュームコンプレッサ3 |
| v103.5 | キャスト字幕フォント3 |
| v103.6 | エッジパン3 |
| v103.7 | キャッシュリードアヘッド3 |
| v103.8 | プログレスカラー3 |
| v103.9 | 自動スキップ ED2 |
| v103.10 | フォントグロー色4 |
| v103.11 | ハイライト3 |
| v103.12 | ピークリミッタ3 |
| v103.13 | キャスト解像度3 |
| v103.14 | ハプティック3 |
| v103.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v103.1 | 자동 재개3 |
| v103.2 | 폰트 블러3 |
| v103.3 | 미드톤3 |
| v103.4 | 볼륨 컴프레서3 |
| v103.5 | 캐스트 자막 폰트3 |
| v103.6 | 엣지 팬3 |
| v103.7 | 캐시 리드어헤드3 |
| v103.8 | 프로그레스 색상3 |
| v103.9 | 자동 건너뛰기 ED2 |
| v103.10 | 폰트 글로우 색상4 |
| v103.11 | 하이라이트3 |
| v103.12 | 피크 리미터3 |
| v103.13 | 캐스트 해상도3 |
| v103.14 | 햅틱3 |
| v103.15 | 캐시 디스크 정책3 |

### v104.x
<details><summary>🇨🇳</summary>
| v104.1 | 自动恢复3 |
| v104.2 | 字体模糊3 |
| v104.3 | 中间调3 |
| v104.4 | 音量压缩3 |
| v104.5 | 投屏字幕字体3 |
| v104.6 | 边缘滑动3 |
| v104.7 | 缓存预读3 |
| v104.8 | 进度条颜色3 |
| v104.9 | 自动跳过片尾2 |
| v104.10 | 字体发光颜色4 |
| v104.11 | 高光3 |
| v104.12 | 峰值限制3 |
| v104.13 | 投屏分辨率3 |
| v104.14 | 触觉反馈3 |
| v104.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v104.1 | Auto Resume3 |
| v104.2 | Font Blur3 |
| v104.3 | Midtone3 |
| v104.4 | Volume Compressor3 |
| v104.5 | Cast Subtitle Font3 |
| v104.6 | Edge Pan3 |
| v104.7 | Cache ReadAhead3 |
| v104.8 | Progress Color3 |
| v104.9 | Auto Skip Credits2 |
| v104.10 | Font Glow Color4 |
| v104.11 | Highlight3 |
| v104.12 | Peak Limiter3 |
| v104.13 | Cast Resolution3 |
| v104.14 | Haptic3 |
| v104.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v104.1 | 自動レジューム3 |
| v104.2 | フォントぼかし3 |
| v104.3 | ミッドトーン3 |
| v104.4 | ボリュームコンプレッサ3 |
| v104.5 | キャスト字幕フォント3 |
| v104.6 | エッジパン3 |
| v104.7 | キャッシュリードアヘッド3 |
| v104.8 | プログレスカラー3 |
| v104.9 | 自動スキップ ED2 |
| v104.10 | フォントグロー色4 |
| v104.11 | ハイライト3 |
| v104.12 | ピークリミッタ3 |
| v104.13 | キャスト解像度3 |
| v104.14 | ハプティック3 |
| v104.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v104.1 | 자동 재개3 |
| v104.2 | 폰트 블러3 |
| v104.3 | 미드톤3 |
| v104.4 | 볼륨 컴프레서3 |
| v104.5 | 캐스트 자막 폰트3 |
| v104.6 | 엣지 팬3 |
| v104.7 | 캐시 리드어헤드3 |
| v104.8 | 프로그레스 색상3 |
| v104.9 | 자동 건너뛰기 ED2 |
| v104.10 | 폰트 글로우 색상4 |
| v104.11 | 하이라이트3 |
| v104.12 | 피크 리미터3 |
| v104.13 | 캐스트 해상도3 |
| v104.14 | 햅틱3 |
| v104.15 | 캐시 디스크 정책3 |

### v105.x
<details><summary>🇨🇳</summary>
| v105.1 | 自动恢复3 |
| v105.2 | 字体模糊3 |
| v105.3 | 中间调3 |
| v105.4 | 音量压缩3 |
| v105.5 | 投屏字幕字体3 |
| v105.6 | 边缘滑动3 |
| v105.7 | 缓存预读3 |
| v105.8 | 进度条颜色3 |
| v105.9 | 自动跳过片尾2 |
| v105.10 | 字体发光颜色4 |
| v105.11 | 高光3 |
| v105.12 | 峰值限制3 |
| v105.13 | 投屏分辨率3 |
| v105.14 | 触觉反馈3 |
| v105.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v105.1 | Auto Resume3 |
| v105.2 | Font Blur3 |
| v105.3 | Midtone3 |
| v105.4 | Volume Compressor3 |
| v105.5 | Cast Subtitle Font3 |
| v105.6 | Edge Pan3 |
| v105.7 | Cache ReadAhead3 |
| v105.8 | Progress Color3 |
| v105.9 | Auto Skip Credits2 |
| v105.10 | Font Glow Color4 |
| v105.11 | Highlight3 |
| v105.12 | Peak Limiter3 |
| v105.13 | Cast Resolution3 |
| v105.14 | Haptic3 |
| v105.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v105.1 | 自動レジューム3 |
| v105.2 | フォントぼかし3 |
| v105.3 | ミッドトーン3 |
| v105.4 | ボリュームコンプレッサ3 |
| v105.5 | キャスト字幕フォント3 |
| v105.6 | エッジパン3 |
| v105.7 | キャッシュリードアヘッド3 |
| v105.8 | プログレスカラー3 |
| v105.9 | 自動スキップ ED2 |
| v105.10 | フォントグロー色4 |
| v105.11 | ハイライト3 |
| v105.12 | ピークリミッタ3 |
| v105.13 | キャスト解像度3 |
| v105.14 | ハプティック3 |
| v105.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v105.1 | 자동 재개3 |
| v105.2 | 폰트 블러3 |
| v105.3 | 미드톤3 |
| v105.4 | 볼륨 컴프레서3 |
| v105.5 | 캐스트 자막 폰트3 |
| v105.6 | 엣지 팬3 |
| v105.7 | 캐시 리드어헤드3 |
| v105.8 | 프로그레스 색상3 |
| v105.9 | 자동 건너뛰기 ED2 |
| v105.10 | 폰트 글로우 색상4 |
| v105.11 | 하이라이트3 |
| v105.12 | 피크 리미터3 |
| v105.13 | 캐스트 해상도3 |
| v105.14 | 햅틱3 |
| v105.15 | 캐시 디스크 정책3 |

### v106.x
<details><summary>🇨🇳</summary>
| v106.1 | 自动恢复3 |
| v106.2 | 字体模糊3 |
| v106.3 | 中间调3 |
| v106.4 | 音量压缩3 |
| v106.5 | 投屏字幕字体3 |
| v106.6 | 边缘滑动3 |
| v106.7 | 缓存预读3 |
| v106.8 | 进度条颜色3 |
| v106.9 | 自动跳过片尾2 |
| v106.10 | 字体发光颜色4 |
| v106.11 | 高光3 |
| v106.12 | 峰值限制3 |
| v106.13 | 投屏分辨率3 |
| v106.14 | 触觉反馈3 |
| v106.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v106.1 | Auto Resume3 |
| v106.2 | Font Blur3 |
| v106.3 | Midtone3 |
| v106.4 | Volume Compressor3 |
| v106.5 | Cast Subtitle Font3 |
| v106.6 | Edge Pan3 |
| v106.7 | Cache ReadAhead3 |
| v106.8 | Progress Color3 |
| v106.9 | Auto Skip Credits2 |
| v106.10 | Font Glow Color4 |
| v106.11 | Highlight3 |
| v106.12 | Peak Limiter3 |
| v106.13 | Cast Resolution3 |
| v106.14 | Haptic3 |
| v106.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v106.1 | 自動レジューム3 |
| v106.2 | フォントぼかし3 |
| v106.3 | ミッドトーン3 |
| v106.4 | ボリュームコンプレッサ3 |
| v106.5 | キャスト字幕フォント3 |
| v106.6 | エッジパン3 |
| v106.7 | キャッシュリードアヘッド3 |
| v106.8 | プログレスカラー3 |
| v106.9 | 自動スキップ ED2 |
| v106.10 | フォントグロー色4 |
| v106.11 | ハイライト3 |
| v106.12 | ピークリミッタ3 |
| v106.13 | キャスト解像度3 |
| v106.14 | ハプティック3 |
| v106.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v106.1 | 자동 재개3 |
| v106.2 | 폰트 블러3 |
| v106.3 | 미드톤3 |
| v106.4 | 볼륨 컴프레서3 |
| v106.5 | 캐스트 자막 폰트3 |
| v106.6 | 엣지 팬3 |
| v106.7 | 캐시 리드어헤드3 |
| v106.8 | 프로그레스 색상3 |
| v106.9 | 자동 건너뛰기 ED2 |
| v106.10 | 폰트 글로우 색상4 |
| v106.11 | 하이라이트3 |
| v106.12 | 피크 리미터3 |
| v106.13 | 캐스트 해상도3 |
| v106.14 | 햅틱3 |
| v106.15 | 캐시 디스크 정책3 |

### v107.x
<details><summary>🇨🇳</summary>
| v107.1 | 自动恢复3 |
| v107.2 | 字体模糊3 |
| v107.3 | 中间调3 |
| v107.4 | 音量压缩3 |
| v107.5 | 投屏字幕字体3 |
| v107.6 | 边缘滑动3 |
| v107.7 | 缓存预读3 |
| v107.8 | 进度条颜色3 |
| v107.9 | 自动跳过片尾2 |
| v107.10 | 字体发光颜色4 |
| v107.11 | 高光3 |
| v107.12 | 峰值限制3 |
| v107.13 | 投屏分辨率3 |
| v107.14 | 触觉反馈3 |
| v107.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v107.1 | Auto Resume3 |
| v107.2 | Font Blur3 |
| v107.3 | Midtone3 |
| v107.4 | Volume Compressor3 |
| v107.5 | Cast Subtitle Font3 |
| v107.6 | Edge Pan3 |
| v107.7 | Cache ReadAhead3 |
| v107.8 | Progress Color3 |
| v107.9 | Auto Skip Credits2 |
| v107.10 | Font Glow Color4 |
| v107.11 | Highlight3 |
| v107.12 | Peak Limiter3 |
| v107.13 | Cast Resolution3 |
| v107.14 | Haptic3 |
| v107.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v107.1 | 自動レジューム3 |
| v107.2 | フォントぼかし3 |
| v107.3 | ミッドトーン3 |
| v107.4 | ボリュームコンプレッサ3 |
| v107.5 | キャスト字幕フォント3 |
| v107.6 | エッジパン3 |
| v107.7 | キャッシュリードアヘッド3 |
| v107.8 | プログレスカラー3 |
| v107.9 | 自動スキップ ED2 |
| v107.10 | フォントグロー色4 |
| v107.11 | ハイライト3 |
| v107.12 | ピークリミッタ3 |
| v107.13 | キャスト解像度3 |
| v107.14 | ハプティック3 |
| v107.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v107.1 | 자동 재개3 |
| v107.2 | 폰트 블러3 |
| v107.3 | 미드톤3 |
| v107.4 | 볼륨 컴프레서3 |
| v107.5 | 캐스트 자막 폰트3 |
| v107.6 | 엣지 팬3 |
| v107.7 | 캐시 리드어헤드3 |
| v107.8 | 프로그레스 색상3 |
| v107.9 | 자동 건너뛰기 ED2 |
| v107.10 | 폰트 글로우 색상4 |
| v107.11 | 하이라이트3 |
| v107.12 | 피크 리미터3 |
| v107.13 | 캐스트 해상도3 |
| v107.14 | 햅틱3 |
| v107.15 | 캐시 디스크 정책3 |

### v108.x
<details><summary>🇨🇳</summary>
| v108.1 | 自动恢复3 |
| v108.2 | 字体模糊3 |
| v108.3 | 中间调3 |
| v108.4 | 音量压缩3 |
| v108.5 | 投屏字幕字体3 |
| v108.6 | 边缘滑动3 |
| v108.7 | 缓存预读3 |
| v108.8 | 进度条颜色3 |
| v108.9 | 自动跳过片尾2 |
| v108.10 | 字体发光颜色4 |
| v108.11 | 高光3 |
| v108.12 | 峰值限制3 |
| v108.13 | 投屏分辨率3 |
| v108.14 | 触觉反馈3 |
| v108.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v108.1 | Auto Resume3 |
| v108.2 | Font Blur3 |
| v108.3 | Midtone3 |
| v108.4 | Volume Compressor3 |
| v108.5 | Cast Subtitle Font3 |
| v108.6 | Edge Pan3 |
| v108.7 | Cache ReadAhead3 |
| v108.8 | Progress Color3 |
| v108.9 | Auto Skip Credits2 |
| v108.10 | Font Glow Color4 |
| v108.11 | Highlight3 |
| v108.12 | Peak Limiter3 |
| v108.13 | Cast Resolution3 |
| v108.14 | Haptic3 |
| v108.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v108.1 | 自動レジューム3 |
| v108.2 | フォントぼかし3 |
| v108.3 | ミッドトーン3 |
| v108.4 | ボリュームコンプレッサ3 |
| v108.5 | キャスト字幕フォント3 |
| v108.6 | エッジパン3 |
| v108.7 | キャッシュリードアヘッド3 |
| v108.8 | プログレスカラー3 |
| v108.9 | 自動スキップ ED2 |
| v108.10 | フォントグロー色4 |
| v108.11 | ハイライト3 |
| v108.12 | ピークリミッタ3 |
| v108.13 | キャスト解像度3 |
| v108.14 | ハプティック3 |
| v108.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v108.1 | 자동 재개3 |
| v108.2 | 폰트 블러3 |
| v108.3 | 미드톤3 |
| v108.4 | 볼륨 컴프레서3 |
| v108.5 | 캐스트 자막 폰트3 |
| v108.6 | 엣지 팬3 |
| v108.7 | 캐시 리드어헤드3 |
| v108.8 | 프로그레스 색상3 |
| v108.9 | 자동 건너뛰기 ED2 |
| v108.10 | 폰트 글로우 색상4 |
| v108.11 | 하이라이트3 |
| v108.12 | 피크 리미터3 |
| v108.13 | 캐스트 해상도3 |
| v108.14 | 햅틱3 |
| v108.15 | 캐시 디스크 정책3 |

### v109.x
<details><summary>🇨🇳</summary>
| v109.1 | 自动恢复3 |
| v109.2 | 字体模糊3 |
| v109.3 | 中间调3 |
| v109.4 | 音量压缩3 |
| v109.5 | 投屏字幕字体3 |
| v109.6 | 边缘滑动3 |
| v109.7 | 缓存预读3 |
| v109.8 | 进度条颜色3 |
| v109.9 | 自动跳过片尾2 |
| v109.10 | 字体发光颜色4 |
| v109.11 | 高光3 |
| v109.12 | 峰值限制3 |
| v109.13 | 投屏分辨率3 |
| v109.14 | 触觉反馈3 |
| v109.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v109.1 | Auto Resume3 |
| v109.2 | Font Blur3 |
| v109.3 | Midtone3 |
| v109.4 | Volume Compressor3 |
| v109.5 | Cast Subtitle Font3 |
| v109.6 | Edge Pan3 |
| v109.7 | Cache ReadAhead3 |
| v109.8 | Progress Color3 |
| v109.9 | Auto Skip Credits2 |
| v109.10 | Font Glow Color4 |
| v109.11 | Highlight3 |
| v109.12 | Peak Limiter3 |
| v109.13 | Cast Resolution3 |
| v109.14 | Haptic3 |
| v109.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v109.1 | 自動レジューム3 |
| v109.2 | フォントぼかし3 |
| v109.3 | ミッドトーン3 |
| v109.4 | ボリュームコンプレッサ3 |
| v109.5 | キャスト字幕フォント3 |
| v109.6 | エッジパン3 |
| v109.7 | キャッシュリードアヘッド3 |
| v109.8 | プログレスカラー3 |
| v109.9 | 自動スキップ ED2 |
| v109.10 | フォントグロー色4 |
| v109.11 | ハイライト3 |
| v109.12 | ピークリミッタ3 |
| v109.13 | キャスト解像度3 |
| v109.14 | ハプティック3 |
| v109.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v109.1 | 자동 재개3 |
| v109.2 | 폰트 블러3 |
| v109.3 | 미드톤3 |
| v109.4 | 볼륨 컴프레서3 |
| v109.5 | 캐스트 자막 폰트3 |
| v109.6 | 엣지 팬3 |
| v109.7 | 캐시 리드어헤드3 |
| v109.8 | 프로그레스 색상3 |
| v109.9 | 자동 건너뛰기 ED2 |
| v109.10 | 폰트 글로우 색상4 |
| v109.11 | 하이라이트3 |
| v109.12 | 피크 리미터3 |
| v109.13 | 캐스트 해상도3 |
| v109.14 | 햅틱3 |
| v109.15 | 캐시 디스크 정책3 |

### v110.x
<details><summary>🇨🇳</summary>
| v110.1 | 自动恢复3 |
| v110.2 | 字体模糊3 |
| v110.3 | 中间调3 |
| v110.4 | 音量压缩3 |
| v110.5 | 投屏字幕字体3 |
| v110.6 | 边缘滑动3 |
| v110.7 | 缓存预读3 |
| v110.8 | 进度条颜色3 |
| v110.9 | 自动跳过片尾2 |
| v110.10 | 字体发光颜色4 |
| v110.11 | 高光3 |
| v110.12 | 峰值限制3 |
| v110.13 | 投屏分辨率3 |
| v110.14 | 触觉反馈3 |
| v110.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v110.1 | Auto Resume3 |
| v110.2 | Font Blur3 |
| v110.3 | Midtone3 |
| v110.4 | Volume Compressor3 |
| v110.5 | Cast Subtitle Font3 |
| v110.6 | Edge Pan3 |
| v110.7 | Cache ReadAhead3 |
| v110.8 | Progress Color3 |
| v110.9 | Auto Skip Credits2 |
| v110.10 | Font Glow Color4 |
| v110.11 | Highlight3 |
| v110.12 | Peak Limiter3 |
| v110.13 | Cast Resolution3 |
| v110.14 | Haptic3 |
| v110.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v110.1 | 自動レジューム3 |
| v110.2 | フォントぼかし3 |
| v110.3 | ミッドトーン3 |
| v110.4 | ボリュームコンプレッサ3 |
| v110.5 | キャスト字幕フォント3 |
| v110.6 | エッジパン3 |
| v110.7 | キャッシュリードアヘッド3 |
| v110.8 | プログレスカラー3 |
| v110.9 | 自動スキップ ED2 |
| v110.10 | フォントグロー色4 |
| v110.11 | ハイライト3 |
| v110.12 | ピークリミッタ3 |
| v110.13 | キャスト解像度3 |
| v110.14 | ハプティック3 |
| v110.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v110.1 | 자동 재개3 |
| v110.2 | 폰트 블러3 |
| v110.3 | 미드톤3 |
| v110.4 | 볼륨 컴프레서3 |
| v110.5 | 캐스트 자막 폰트3 |
| v110.6 | 엣지 팬3 |
| v110.7 | 캐시 리드어헤드3 |
| v110.8 | 프로그레스 색상3 |
| v110.9 | 자동 건너뛰기 ED2 |
| v110.10 | 폰트 글로우 색상4 |
| v110.11 | 하이라이트3 |
| v110.12 | 피크 리미터3 |
| v110.13 | 캐스트 해상도3 |
| v110.14 | 햅틱3 |
| v110.15 | 캐시 디스크 정책3 |

### v111.x
<details><summary>🇨🇳</summary>
| v111.1 | 自动恢复3 |
| v111.2 | 字体模糊3 |
| v111.3 | 中间调3 |
| v111.4 | 音量压缩3 |
| v111.5 | 投屏字幕字体3 |
| v111.6 | 边缘滑动3 |
| v111.7 | 缓存预读3 |
| v111.8 | 进度条颜色3 |
| v111.9 | 自动跳过片尾2 |
| v111.10 | 字体发光颜色4 |
| v111.11 | 高光3 |
| v111.12 | 峰值限制3 |
| v111.13 | 投屏分辨率3 |
| v111.14 | 触觉反馈3 |
| v111.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v111.1 | Auto Resume3 |
| v111.2 | Font Blur3 |
| v111.3 | Midtone3 |
| v111.4 | Volume Compressor3 |
| v111.5 | Cast Subtitle Font3 |
| v111.6 | Edge Pan3 |
| v111.7 | Cache ReadAhead3 |
| v111.8 | Progress Color3 |
| v111.9 | Auto Skip Credits2 |
| v111.10 | Font Glow Color4 |
| v111.11 | Highlight3 |
| v111.12 | Peak Limiter3 |
| v111.13 | Cast Resolution3 |
| v111.14 | Haptic3 |
| v111.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v111.1 | 自動レジューム3 |
| v111.2 | フォントぼかし3 |
| v111.3 | ミッドトーン3 |
| v111.4 | ボリュームコンプレッサ3 |
| v111.5 | キャスト字幕フォント3 |
| v111.6 | エッジパン3 |
| v111.7 | キャッシュリードアヘッド3 |
| v111.8 | プログレスカラー3 |
| v111.9 | 自動スキップ ED2 |
| v111.10 | フォントグロー色4 |
| v111.11 | ハイライト3 |
| v111.12 | ピークリミッタ3 |
| v111.13 | キャスト解像度3 |
| v111.14 | ハプティック3 |
| v111.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v111.1 | 자동 재개3 |
| v111.2 | 폰트 블러3 |
| v111.3 | 미드톤3 |
| v111.4 | 볼륨 컴프레서3 |
| v111.5 | 캐스트 자막 폰트3 |
| v111.6 | 엣지 팬3 |
| v111.7 | 캐시 리드어헤드3 |
| v111.8 | 프로그레스 색상3 |
| v111.9 | 자동 건너뛰기 ED2 |
| v111.10 | 폰트 글로우 색상4 |
| v111.11 | 하이라이트3 |
| v111.12 | 피크 리미터3 |
| v111.13 | 캐스트 해상도3 |
| v111.14 | 햅틱3 |
| v111.15 | 캐시 디스크 정책3 |

### v112.x
<details><summary>🇨🇳</summary>
| v112.1 | 自动恢复3 |
| v112.2 | 字体模糊3 |
| v112.3 | 中间调3 |
| v112.4 | 音量压缩3 |
| v112.5 | 投屏字幕字体3 |
| v112.6 | 边缘滑动3 |
| v112.7 | 缓存预读3 |
| v112.8 | 进度条颜色3 |
| v112.9 | 自动跳过片尾2 |
| v112.10 | 字体发光颜色4 |
| v112.11 | 高光3 |
| v112.12 | 峰值限制3 |
| v112.13 | 投屏分辨率3 |
| v112.14 | 触觉反馈3 |
| v112.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v112.1 | Auto Resume3 |
| v112.2 | Font Blur3 |
| v112.3 | Midtone3 |
| v112.4 | Volume Compressor3 |
| v112.5 | Cast Subtitle Font3 |
| v112.6 | Edge Pan3 |
| v112.7 | Cache ReadAhead3 |
| v112.8 | Progress Color3 |
| v112.9 | Auto Skip Credits2 |
| v112.10 | Font Glow Color4 |
| v112.11 | Highlight3 |
| v112.12 | Peak Limiter3 |
| v112.13 | Cast Resolution3 |
| v112.14 | Haptic3 |
| v112.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v112.1 | 自動レジューム3 |
| v112.2 | フォントぼかし3 |
| v112.3 | ミッドトーン3 |
| v112.4 | ボリュームコンプレッサ3 |
| v112.5 | キャスト字幕フォント3 |
| v112.6 | エッジパン3 |
| v112.7 | キャッシュリードアヘッド3 |
| v112.8 | プログレスカラー3 |
| v112.9 | 自動スキップ ED2 |
| v112.10 | フォントグロー色4 |
| v112.11 | ハイライト3 |
| v112.12 | ピークリミッタ3 |
| v112.13 | キャスト解像度3 |
| v112.14 | ハプティック3 |
| v112.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v112.1 | 자동 재개3 |
| v112.2 | 폰트 블러3 |
| v112.3 | 미드톤3 |
| v112.4 | 볼륨 컴프레서3 |
| v112.5 | 캐스트 자막 폰트3 |
| v112.6 | 엣지 팬3 |
| v112.7 | 캐시 리드어헤드3 |
| v112.8 | 프로그레스 색상3 |
| v112.9 | 자동 건너뛰기 ED2 |
| v112.10 | 폰트 글로우 색상4 |
| v112.11 | 하이라이트3 |
| v112.12 | 피크 리미터3 |
| v112.13 | 캐스트 해상도3 |
| v112.14 | 햅틱3 |
| v112.15 | 캐시 디스크 정책3 |

### v113.x
<details><summary>🇨🇳</summary>
| v113.1 | 自动恢复3 |
| v113.2 | 字体模糊3 |
| v113.3 | 中间调3 |
| v113.4 | 音量压缩3 |
| v113.5 | 投屏字幕字体3 |
| v113.6 | 边缘滑动3 |
| v113.7 | 缓存预读3 |
| v113.8 | 进度条颜色3 |
| v113.9 | 自动跳过片尾2 |
| v113.10 | 字体发光颜色4 |
| v113.11 | 高光3 |
| v113.12 | 峰值限制3 |
| v113.13 | 投屏分辨率3 |
| v113.14 | 触觉反馈3 |
| v113.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v113.1 | Auto Resume3 |
| v113.2 | Font Blur3 |
| v113.3 | Midtone3 |
| v113.4 | Volume Compressor3 |
| v113.5 | Cast Subtitle Font3 |
| v113.6 | Edge Pan3 |
| v113.7 | Cache ReadAhead3 |
| v113.8 | Progress Color3 |
| v113.9 | Auto Skip Credits2 |
| v113.10 | Font Glow Color4 |
| v113.11 | Highlight3 |
| v113.12 | Peak Limiter3 |
| v113.13 | Cast Resolution3 |
| v113.14 | Haptic3 |
| v113.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v113.1 | 自動レジューム3 |
| v113.2 | フォントぼかし3 |
| v113.3 | ミッドトーン3 |
| v113.4 | ボリュームコンプレッサ3 |
| v113.5 | キャスト字幕フォント3 |
| v113.6 | エッジパン3 |
| v113.7 | キャッシュリードアヘッド3 |
| v113.8 | プログレスカラー3 |
| v113.9 | 自動スキップ ED2 |
| v113.10 | フォントグロー色4 |
| v113.11 | ハイライト3 |
| v113.12 | ピークリミッタ3 |
| v113.13 | キャスト解像度3 |
| v113.14 | ハプティック3 |
| v113.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v113.1 | 자동 재개3 |
| v113.2 | 폰트 블러3 |
| v113.3 | 미드톤3 |
| v113.4 | 볼륨 컴프레서3 |
| v113.5 | 캐스트 자막 폰트3 |
| v113.6 | 엣지 팬3 |
| v113.7 | 캐시 리드어헤드3 |
| v113.8 | 프로그레스 색상3 |
| v113.9 | 자동 건너뛰기 ED2 |
| v113.10 | 폰트 글로우 색상4 |
| v113.11 | 하이라이트3 |
| v113.12 | 피크 리미터3 |
| v113.13 | 캐스트 해상도3 |
| v113.14 | 햅틱3 |
| v113.15 | 캐시 디스크 정책3 |

### v114.x
<details><summary>🇨🇳</summary>
| v114.1 | 自动恢复3 |
| v114.2 | 字体模糊3 |
| v114.3 | 中间调3 |
| v114.4 | 音量压缩3 |
| v114.5 | 投屏字幕字体3 |
| v114.6 | 边缘滑动3 |
| v114.7 | 缓存预读3 |
| v114.8 | 进度条颜色3 |
| v114.9 | 自动跳过片尾2 |
| v114.10 | 字体发光颜色4 |
| v114.11 | 高光3 |
| v114.12 | 峰值限制3 |
| v114.13 | 投屏分辨率3 |
| v114.14 | 触觉反馈3 |
| v114.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v114.1 | Auto Resume3 |
| v114.2 | Font Blur3 |
| v114.3 | Midtone3 |
| v114.4 | Volume Compressor3 |
| v114.5 | Cast Subtitle Font3 |
| v114.6 | Edge Pan3 |
| v114.7 | Cache ReadAhead3 |
| v114.8 | Progress Color3 |
| v114.9 | Auto Skip Credits2 |
| v114.10 | Font Glow Color4 |
| v114.11 | Highlight3 |
| v114.12 | Peak Limiter3 |
| v114.13 | Cast Resolution3 |
| v114.14 | Haptic3 |
| v114.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v114.1 | 自動レジューム3 |
| v114.2 | フォントぼかし3 |
| v114.3 | ミッドトーン3 |
| v114.4 | ボリュームコンプレッサ3 |
| v114.5 | キャスト字幕フォント3 |
| v114.6 | エッジパン3 |
| v114.7 | キャッシュリードアヘッド3 |
| v114.8 | プログレスカラー3 |
| v114.9 | 自動スキップ ED2 |
| v114.10 | フォントグロー色4 |
| v114.11 | ハイライト3 |
| v114.12 | ピークリミッタ3 |
| v114.13 | キャスト解像度3 |
| v114.14 | ハプティック3 |
| v114.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v114.1 | 자동 재개3 |
| v114.2 | 폰트 블러3 |
| v114.3 | 미드톤3 |
| v114.4 | 볼륨 컴프레서3 |
| v114.5 | 캐스트 자막 폰트3 |
| v114.6 | 엣지 팬3 |
| v114.7 | 캐시 리드어헤드3 |
| v114.8 | 프로그레스 색상3 |
| v114.9 | 자동 건너뛰기 ED2 |
| v114.10 | 폰트 글로우 색상4 |
| v114.11 | 하이라이트3 |
| v114.12 | 피크 리미터3 |
| v114.13 | 캐스트 해상도3 |
| v114.14 | 햅틱3 |
| v114.15 | 캐시 디스크 정책3 |

### v115.x
<details><summary>🇨🇳</summary>
| v115.1 | 自动恢复3 |
| v115.2 | 字体模糊3 |
| v115.3 | 中间调3 |
| v115.4 | 音量压缩3 |
| v115.5 | 投屏字幕字体3 |
| v115.6 | 边缘滑动3 |
| v115.7 | 缓存预读3 |
| v115.8 | 进度条颜色3 |
| v115.9 | 自动跳过片尾2 |
| v115.10 | 字体发光颜色4 |
| v115.11 | 高光3 |
| v115.12 | 峰值限制3 |
| v115.13 | 投屏分辨率3 |
| v115.14 | 触觉反馈3 |
| v115.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v115.1 | Auto Resume3 |
| v115.2 | Font Blur3 |
| v115.3 | Midtone3 |
| v115.4 | Volume Compressor3 |
| v115.5 | Cast Subtitle Font3 |
| v115.6 | Edge Pan3 |
| v115.7 | Cache ReadAhead3 |
| v115.8 | Progress Color3 |
| v115.9 | Auto Skip Credits2 |
| v115.10 | Font Glow Color4 |
| v115.11 | Highlight3 |
| v115.12 | Peak Limiter3 |
| v115.13 | Cast Resolution3 |
| v115.14 | Haptic3 |
| v115.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v115.1 | 自動レジューム3 |
| v115.2 | フォントぼかし3 |
| v115.3 | ミッドトーン3 |
| v115.4 | ボリュームコンプレッサ3 |
| v115.5 | キャスト字幕フォント3 |
| v115.6 | エッジパン3 |
| v115.7 | キャッシュリードアヘッド3 |
| v115.8 | プログレスカラー3 |
| v115.9 | 自動スキップ ED2 |
| v115.10 | フォントグロー色4 |
| v115.11 | ハイライト3 |
| v115.12 | ピークリミッタ3 |
| v115.13 | キャスト解像度3 |
| v115.14 | ハプティック3 |
| v115.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v115.1 | 자동 재개3 |
| v115.2 | 폰트 블러3 |
| v115.3 | 미드톤3 |
| v115.4 | 볼륨 컴프레서3 |
| v115.5 | 캐스트 자막 폰트3 |
| v115.6 | 엣지 팬3 |
| v115.7 | 캐시 리드어헤드3 |
| v115.8 | 프로그레스 색상3 |
| v115.9 | 자동 건너뛰기 ED2 |
| v115.10 | 폰트 글로우 색상4 |
| v115.11 | 하이라이트3 |
| v115.12 | 피크 리미터3 |
| v115.13 | 캐스트 해상도3 |
| v115.14 | 햅틱3 |
| v115.15 | 캐시 디스크 정책3 |

### v116.x
<details><summary>🇨🇳</summary>
| v116.1 | 自动恢复3 |
| v116.2 | 字体模糊3 |
| v116.3 | 中间调3 |
| v116.4 | 音量压缩3 |
| v116.5 | 投屏字幕字体3 |
| v116.6 | 边缘滑动3 |
| v116.7 | 缓存预读3 |
| v116.8 | 进度条颜色3 |
| v116.9 | 自动跳过片尾2 |
| v116.10 | 字体发光颜色4 |
| v116.11 | 高光3 |
| v116.12 | 峰值限制3 |
| v116.13 | 投屏分辨率3 |
| v116.14 | 触觉反馈3 |
| v116.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v116.1 | Auto Resume3 |
| v116.2 | Font Blur3 |
| v116.3 | Midtone3 |
| v116.4 | Volume Compressor3 |
| v116.5 | Cast Subtitle Font3 |
| v116.6 | Edge Pan3 |
| v116.7 | Cache ReadAhead3 |
| v116.8 | Progress Color3 |
| v116.9 | Auto Skip Credits2 |
| v116.10 | Font Glow Color4 |
| v116.11 | Highlight3 |
| v116.12 | Peak Limiter3 |
| v116.13 | Cast Resolution3 |
| v116.14 | Haptic3 |
| v116.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v116.1 | 自動レジューム3 |
| v116.2 | フォントぼかし3 |
| v116.3 | ミッドトーン3 |
| v116.4 | ボリュームコンプレッサ3 |
| v116.5 | キャスト字幕フォント3 |
| v116.6 | エッジパン3 |
| v116.7 | キャッシュリードアヘッド3 |
| v116.8 | プログレスカラー3 |
| v116.9 | 自動スキップ ED2 |
| v116.10 | フォントグロー色4 |
| v116.11 | ハイライト3 |
| v116.12 | ピークリミッタ3 |
| v116.13 | キャスト解像度3 |
| v116.14 | ハプティック3 |
| v116.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v116.1 | 자동 재개3 |
| v116.2 | 폰트 블러3 |
| v116.3 | 미드톤3 |
| v116.4 | 볼륨 컴프레서3 |
| v116.5 | 캐스트 자막 폰트3 |
| v116.6 | 엣지 팬3 |
| v116.7 | 캐시 리드어헤드3 |
| v116.8 | 프로그레스 색상3 |
| v116.9 | 자동 건너뛰기 ED2 |
| v116.10 | 폰트 글로우 색상4 |
| v116.11 | 하이라이트3 |
| v116.12 | 피크 리미터3 |
| v116.13 | 캐스트 해상도3 |
| v116.14 | 햅틱3 |
| v116.15 | 캐시 디스크 정책3 |

### v117.x
<details><summary>🇨🇳</summary>
| v117.1 | 自动恢复3 |
| v117.2 | 字体模糊3 |
| v117.3 | 中间调3 |
| v117.4 | 音量压缩3 |
| v117.5 | 投屏字幕字体3 |
| v117.6 | 边缘滑动3 |
| v117.7 | 缓存预读3 |
| v117.8 | 进度条颜色3 |
| v117.9 | 自动跳过片尾2 |
| v117.10 | 字体发光颜色4 |
| v117.11 | 高光3 |
| v117.12 | 峰值限制3 |
| v117.13 | 投屏分辨率3 |
| v117.14 | 触觉反馈3 |
| v117.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v117.1 | Auto Resume3 |
| v117.2 | Font Blur3 |
| v117.3 | Midtone3 |
| v117.4 | Volume Compressor3 |
| v117.5 | Cast Subtitle Font3 |
| v117.6 | Edge Pan3 |
| v117.7 | Cache ReadAhead3 |
| v117.8 | Progress Color3 |
| v117.9 | Auto Skip Credits2 |
| v117.10 | Font Glow Color4 |
| v117.11 | Highlight3 |
| v117.12 | Peak Limiter3 |
| v117.13 | Cast Resolution3 |
| v117.14 | Haptic3 |
| v117.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v117.1 | 自動レジューム3 |
| v117.2 | フォントぼかし3 |
| v117.3 | ミッドトーン3 |
| v117.4 | ボリュームコンプレッサ3 |
| v117.5 | キャスト字幕フォント3 |
| v117.6 | エッジパン3 |
| v117.7 | キャッシュリードアヘッド3 |
| v117.8 | プログレスカラー3 |
| v117.9 | 自動スキップ ED2 |
| v117.10 | フォントグロー色4 |
| v117.11 | ハイライト3 |
| v117.12 | ピークリミッタ3 |
| v117.13 | キャスト解像度3 |
| v117.14 | ハプティック3 |
| v117.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v117.1 | 자동 재개3 |
| v117.2 | 폰트 블러3 |
| v117.3 | 미드톤3 |
| v117.4 | 볼륨 컴프레서3 |
| v117.5 | 캐스트 자막 폰트3 |
| v117.6 | 엣지 팬3 |
| v117.7 | 캐시 리드어헤드3 |
| v117.8 | 프로그레스 색상3 |
| v117.9 | 자동 건너뛰기 ED2 |
| v117.10 | 폰트 글로우 색상4 |
| v117.11 | 하이라이트3 |
| v117.12 | 피크 리미터3 |
| v117.13 | 캐스트 해상도3 |
| v117.14 | 햅틱3 |
| v117.15 | 캐시 디스크 정책3 |

### v118.x
<details><summary>🇨🇳</summary>
| v118.1 | 自动恢复3 |
| v118.2 | 字体模糊3 |
| v118.3 | 中间调3 |
| v118.4 | 音量压缩3 |
| v118.5 | 投屏字幕字体3 |
| v118.6 | 边缘滑动3 |
| v118.7 | 缓存预读3 |
| v118.8 | 进度条颜色3 |
| v118.9 | 自动跳过片尾2 |
| v118.10 | 字体发光颜色4 |
| v118.11 | 高光3 |
| v118.12 | 峰值限制3 |
| v118.13 | 投屏分辨率3 |
| v118.14 | 触觉反馈3 |
| v118.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v118.1 | Auto Resume3 |
| v118.2 | Font Blur3 |
| v118.3 | Midtone3 |
| v118.4 | Volume Compressor3 |
| v118.5 | Cast Subtitle Font3 |
| v118.6 | Edge Pan3 |
| v118.7 | Cache ReadAhead3 |
| v118.8 | Progress Color3 |
| v118.9 | Auto Skip Credits2 |
| v118.10 | Font Glow Color4 |
| v118.11 | Highlight3 |
| v118.12 | Peak Limiter3 |
| v118.13 | Cast Resolution3 |
| v118.14 | Haptic3 |
| v118.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v118.1 | 自動レジューム3 |
| v118.2 | フォントぼかし3 |
| v118.3 | ミッドトーン3 |
| v118.4 | ボリュームコンプレッサ3 |
| v118.5 | キャスト字幕フォント3 |
| v118.6 | エッジパン3 |
| v118.7 | キャッシュリードアヘッド3 |
| v118.8 | プログレスカラー3 |
| v118.9 | 自動スキップ ED2 |
| v118.10 | フォントグロー色4 |
| v118.11 | ハイライト3 |
| v118.12 | ピークリミッタ3 |
| v118.13 | キャスト解像度3 |
| v118.14 | ハプティック3 |
| v118.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v118.1 | 자동 재개3 |
| v118.2 | 폰트 블러3 |
| v118.3 | 미드톤3 |
| v118.4 | 볼륨 컴프레서3 |
| v118.5 | 캐스트 자막 폰트3 |
| v118.6 | 엣지 팬3 |
| v118.7 | 캐시 리드어헤드3 |
| v118.8 | 프로그레스 색상3 |
| v118.9 | 자동 건너뛰기 ED2 |
| v118.10 | 폰트 글로우 색상4 |
| v118.11 | 하이라이트3 |
| v118.12 | 피크 리미터3 |
| v118.13 | 캐스트 해상도3 |
| v118.14 | 햅틱3 |
| v118.15 | 캐시 디스크 정책3 |

### v119.x
<details><summary>🇨🇳</summary>
| v119.1 | 自动恢复3 |
| v119.2 | 字体模糊3 |
| v119.3 | 中间调3 |
| v119.4 | 音量压缩3 |
| v119.5 | 投屏字幕字体3 |
| v119.6 | 边缘滑动3 |
| v119.7 | 缓存预读3 |
| v119.8 | 进度条颜色3 |
| v119.9 | 自动跳过片尾2 |
| v119.10 | 字体发光颜色4 |
| v119.11 | 高光3 |
| v119.12 | 峰值限制3 |
| v119.13 | 投屏分辨率3 |
| v119.14 | 触觉反馈3 |
| v119.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v119.1 | Auto Resume3 |
| v119.2 | Font Blur3 |
| v119.3 | Midtone3 |
| v119.4 | Volume Compressor3 |
| v119.5 | Cast Subtitle Font3 |
| v119.6 | Edge Pan3 |
| v119.7 | Cache ReadAhead3 |
| v119.8 | Progress Color3 |
| v119.9 | Auto Skip Credits2 |
| v119.10 | Font Glow Color4 |
| v119.11 | Highlight3 |
| v119.12 | Peak Limiter3 |
| v119.13 | Cast Resolution3 |
| v119.14 | Haptic3 |
| v119.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v119.1 | 自動レジューム3 |
| v119.2 | フォントぼかし3 |
| v119.3 | ミッドトーン3 |
| v119.4 | ボリュームコンプレッサ3 |
| v119.5 | キャスト字幕フォント3 |
| v119.6 | エッジパン3 |
| v119.7 | キャッシュリードアヘッド3 |
| v119.8 | プログレスカラー3 |
| v119.9 | 自動スキップ ED2 |
| v119.10 | フォントグロー色4 |
| v119.11 | ハイライト3 |
| v119.12 | ピークリミッタ3 |
| v119.13 | キャスト解像度3 |
| v119.14 | ハプティック3 |
| v119.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v119.1 | 자동 재개3 |
| v119.2 | 폰트 블러3 |
| v119.3 | 미드톤3 |
| v119.4 | 볼륨 컴프레서3 |
| v119.5 | 캐스트 자막 폰트3 |
| v119.6 | 엣지 팬3 |
| v119.7 | 캐시 리드어헤드3 |
| v119.8 | 프로그레스 색상3 |
| v119.9 | 자동 건너뛰기 ED2 |
| v119.10 | 폰트 글로우 색상4 |
| v119.11 | 하이라이트3 |
| v119.12 | 피크 리미터3 |
| v119.13 | 캐스트 해상도3 |
| v119.14 | 햅틱3 |
| v119.15 | 캐시 디스크 정책3 |

### v121.x
<details><summary>🇨🇳</summary>
| v121.1 | 跳过片头2 |
| v121.2 | 弹幕速度2 |
| v121.3 | 色彩渐变2 |
| v121.4 | 音量淡入2 |
| v121.5 | 投屏码率2 |
| v121.6 | 点击区域2 |
| v121.7 | 缓存压缩级别3 |
| v121.8 | 进度条淡出2 |
| v121.9 | 自动暂停2 |
| v121.10 | 滚动速度2 |
| v121.11 | 色彩色调2 |
| v121.12 | 音量淡出2 |
| v121.13 | 投屏编解码器2 |
| v121.14 | 双指滑动2 |
| v121.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v121.1 | Skip Intro2 |
| v121.2 | Danmaku Speed2 |
| v121.3 | Color Fade2 |
| v121.4 | Volume FadeIn2 |
| v121.5 | Cast Bitrate2 |
| v121.6 | Tap Zone2 |
| v121.7 | Cache CompLevel3 |
| v121.8 | Progress Fade2 |
| v121.9 | Auto Pause2 |
| v121.10 | Scroll Speed2 |
| v121.11 | Color Tint2 |
| v121.12 | Volume FadeOut2 |
| v121.13 | Cast Codec2 |
| v121.14 | Double Swipe2 |
| v121.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v121.1 | OPスキップ2 |
| v121.2 | 弾幕速度2 |
| v121.3 | カラーフェード2 |
| v121.4 | 音量フェードイン2 |
| v121.5 | キャストビットレート2 |
| v121.6 | タップゾーン2 |
| v121.7 | キャッシュ圧縮3 |
| v121.8 | プログレスフェード2 |
| v121.9 | 自動一時停止2 |
| v121.10 | スクロール速度2 |
| v121.11 | カラーチント2 |
| v121.12 | 音量フェードアウト2 |
| v121.13 | キャストコーデック2 |
| v121.14 | ダブルスワイプ2 |
| v121.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v121.1 | OP 건너뛰2 |
| v121.2 | 탄막 속도2 |
| v121.3 | 색상 페이드2 |
| v121.4 | 볼륨 페이드인2 |
| v121.5 | 캐스트 비트레이트2 |
| v121.6 | 탭 영역2 |
| v121.7 | 캐시 압축레벨3 |
| v121.8 | 프로그레스 페이드2 |
| v121.9 | 자동 일시정지2 |
| v121.10 | 스크롤 속도2 |
| v121.11 | 색상 틴트2 |
| v121.12 | 볼륨 페이드아웃2 |
| v121.13 | 캐스트 코덱2 |
| v121.14 | 더블 스와이프2 |
| v121.15 | 캐시 메모리2 |

### v122.x
<details><summary>🇨🇳</summary>
| v122.1 | 跳过片头2 |
| v122.2 | 弹幕速度2 |
| v122.3 | 色彩渐变2 |
| v122.4 | 音量淡入2 |
| v122.5 | 投屏码率2 |
| v122.6 | 点击区域2 |
| v122.7 | 缓存压缩级别3 |
| v122.8 | 进度条淡出2 |
| v122.9 | 自动暂停2 |
| v122.10 | 滚动速度2 |
| v122.11 | 色彩色调2 |
| v122.12 | 音量淡出2 |
| v122.13 | 投屏编解码器2 |
| v122.14 | 双指滑动2 |
| v122.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v122.1 | Skip Intro2 |
| v122.2 | Danmaku Speed2 |
| v122.3 | Color Fade2 |
| v122.4 | Volume FadeIn2 |
| v122.5 | Cast Bitrate2 |
| v122.6 | Tap Zone2 |
| v122.7 | Cache CompLevel3 |
| v122.8 | Progress Fade2 |
| v122.9 | Auto Pause2 |
| v122.10 | Scroll Speed2 |
| v122.11 | Color Tint2 |
| v122.12 | Volume FadeOut2 |
| v122.13 | Cast Codec2 |
| v122.14 | Double Swipe2 |
| v122.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v122.1 | OPスキップ2 |
| v122.2 | 弾幕速度2 |
| v122.3 | カラーフェード2 |
| v122.4 | 音量フェードイン2 |
| v122.5 | キャストビットレート2 |
| v122.6 | タップゾーン2 |
| v122.7 | キャッシュ圧縮3 |
| v122.8 | プログレスフェード2 |
| v122.9 | 自動一時停止2 |
| v122.10 | スクロール速度2 |
| v122.11 | カラーチント2 |
| v122.12 | 音量フェードアウト2 |
| v122.13 | キャストコーデック2 |
| v122.14 | ダブルスワイプ2 |
| v122.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v122.1 | OP 건너뛰2 |
| v122.2 | 탄막 속도2 |
| v122.3 | 색상 페이드2 |
| v122.4 | 볼륨 페이드인2 |
| v122.5 | 캐스트 비트레이트2 |
| v122.6 | 탭 영역2 |
| v122.7 | 캐시 압축레벨3 |
| v122.8 | 프로그레스 페이드2 |
| v122.9 | 자동 일시정지2 |
| v122.10 | 스크롤 속도2 |
| v122.11 | 색상 틴트2 |
| v122.12 | 볼륨 페이드아웃2 |
| v122.13 | 캐스트 코덱2 |
| v122.14 | 더블 스와이프2 |
| v122.15 | 캐시 메모리2 |

### v123.x
<details><summary>🇨🇳</summary>
| v123.1 | 跳过片头2 |
| v123.2 | 弹幕速度2 |
| v123.3 | 色彩渐变2 |
| v123.4 | 音量淡入2 |
| v123.5 | 投屏码率2 |
| v123.6 | 点击区域2 |
| v123.7 | 缓存压缩级别3 |
| v123.8 | 进度条淡出2 |
| v123.9 | 自动暂停2 |
| v123.10 | 滚动速度2 |
| v123.11 | 色彩色调2 |
| v123.12 | 音量淡出2 |
| v123.13 | 投屏编解码器2 |
| v123.14 | 双指滑动2 |
| v123.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v123.1 | Skip Intro2 |
| v123.2 | Danmaku Speed2 |
| v123.3 | Color Fade2 |
| v123.4 | Volume FadeIn2 |
| v123.5 | Cast Bitrate2 |
| v123.6 | Tap Zone2 |
| v123.7 | Cache CompLevel3 |
| v123.8 | Progress Fade2 |
| v123.9 | Auto Pause2 |
| v123.10 | Scroll Speed2 |
| v123.11 | Color Tint2 |
| v123.12 | Volume FadeOut2 |
| v123.13 | Cast Codec2 |
| v123.14 | Double Swipe2 |
| v123.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v123.1 | OPスキップ2 |
| v123.2 | 弾幕速度2 |
| v123.3 | カラーフェード2 |
| v123.4 | 音量フェードイン2 |
| v123.5 | キャストビットレート2 |
| v123.6 | タップゾーン2 |
| v123.7 | キャッシュ圧縮3 |
| v123.8 | プログレスフェード2 |
| v123.9 | 自動一時停止2 |
| v123.10 | スクロール速度2 |
| v123.11 | カラーチント2 |
| v123.12 | 音量フェードアウト2 |
| v123.13 | キャストコーデック2 |
| v123.14 | ダブルスワイプ2 |
| v123.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v123.1 | OP 건너뛰2 |
| v123.2 | 탄막 속도2 |
| v123.3 | 색상 페이드2 |
| v123.4 | 볼륨 페이드인2 |
| v123.5 | 캐스트 비트레이트2 |
| v123.6 | 탭 영역2 |
| v123.7 | 캐시 압축레벨3 |
| v123.8 | 프로그레스 페이드2 |
| v123.9 | 자동 일시정지2 |
| v123.10 | 스크롤 속도2 |
| v123.11 | 색상 틴트2 |
| v123.12 | 볼륨 페이드아웃2 |
| v123.13 | 캐스트 코덱2 |
| v123.14 | 더블 스와이프2 |
| v123.15 | 캐시 메모리2 |

### v124.x
<details><summary>🇨🇳</summary>
| v124.1 | 跳过片头2 |
| v124.2 | 弹幕速度2 |
| v124.3 | 色彩渐变2 |
| v124.4 | 音量淡入2 |
| v124.5 | 投屏码率2 |
| v124.6 | 点击区域2 |
| v124.7 | 缓存压缩级别3 |
| v124.8 | 进度条淡出2 |
| v124.9 | 自动暂停2 |
| v124.10 | 滚动速度2 |
| v124.11 | 色彩色调2 |
| v124.12 | 音量淡出2 |
| v124.13 | 投屏编解码器2 |
| v124.14 | 双指滑动2 |
| v124.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v124.1 | Skip Intro2 |
| v124.2 | Danmaku Speed2 |
| v124.3 | Color Fade2 |
| v124.4 | Volume FadeIn2 |
| v124.5 | Cast Bitrate2 |
| v124.6 | Tap Zone2 |
| v124.7 | Cache CompLevel3 |
| v124.8 | Progress Fade2 |
| v124.9 | Auto Pause2 |
| v124.10 | Scroll Speed2 |
| v124.11 | Color Tint2 |
| v124.12 | Volume FadeOut2 |
| v124.13 | Cast Codec2 |
| v124.14 | Double Swipe2 |
| v124.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v124.1 | OPスキップ2 |
| v124.2 | 弾幕速度2 |
| v124.3 | カラーフェード2 |
| v124.4 | 音量フェードイン2 |
| v124.5 | キャストビットレート2 |
| v124.6 | タップゾーン2 |
| v124.7 | キャッシュ圧縮3 |
| v124.8 | プログレスフェード2 |
| v124.9 | 自動一時停止2 |
| v124.10 | スクロール速度2 |
| v124.11 | カラーチント2 |
| v124.12 | 音量フェードアウト2 |
| v124.13 | キャストコーデック2 |
| v124.14 | ダブルスワイプ2 |
| v124.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v124.1 | OP 건너뛰2 |
| v124.2 | 탄막 속도2 |
| v124.3 | 색상 페이드2 |
| v124.4 | 볼륨 페이드인2 |
| v124.5 | 캐스트 비트레이트2 |
| v124.6 | 탭 영역2 |
| v124.7 | 캐시 압축레벨3 |
| v124.8 | 프로그레스 페이드2 |
| v124.9 | 자동 일시정지2 |
| v124.10 | 스크롤 속도2 |
| v124.11 | 색상 틴트2 |
| v124.12 | 볼륨 페이드아웃2 |
| v124.13 | 캐스트 코덱2 |
| v124.14 | 더블 스와이프2 |
| v124.15 | 캐시 메모리2 |

### v125.x
<details><summary>🇨🇳</summary>
| v125.1 | 跳过片头2 |
| v125.2 | 弹幕速度2 |
| v125.3 | 色彩渐变2 |
| v125.4 | 音量淡入2 |
| v125.5 | 投屏码率2 |
| v125.6 | 点击区域2 |
| v125.7 | 缓存压缩级别3 |
| v125.8 | 进度条淡出2 |
| v125.9 | 自动暂停2 |
| v125.10 | 滚动速度2 |
| v125.11 | 色彩色调2 |
| v125.12 | 音量淡出2 |
| v125.13 | 投屏编解码器2 |
| v125.14 | 双指滑动2 |
| v125.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v125.1 | Skip Intro2 |
| v125.2 | Danmaku Speed2 |
| v125.3 | Color Fade2 |
| v125.4 | Volume FadeIn2 |
| v125.5 | Cast Bitrate2 |
| v125.6 | Tap Zone2 |
| v125.7 | Cache CompLevel3 |
| v125.8 | Progress Fade2 |
| v125.9 | Auto Pause2 |
| v125.10 | Scroll Speed2 |
| v125.11 | Color Tint2 |
| v125.12 | Volume FadeOut2 |
| v125.13 | Cast Codec2 |
| v125.14 | Double Swipe2 |
| v125.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v125.1 | OPスキップ2 |
| v125.2 | 弾幕速度2 |
| v125.3 | カラーフェード2 |
| v125.4 | 音量フェードイン2 |
| v125.5 | キャストビットレート2 |
| v125.6 | タップゾーン2 |
| v125.7 | キャッシュ圧縮3 |
| v125.8 | プログレスフェード2 |
| v125.9 | 自動一時停止2 |
| v125.10 | スクロール速度2 |
| v125.11 | カラーチント2 |
| v125.12 | 音量フェードアウト2 |
| v125.13 | キャストコーデック2 |
| v125.14 | ダブルスワイプ2 |
| v125.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v125.1 | OP 건너뛰2 |
| v125.2 | 탄막 속도2 |
| v125.3 | 색상 페이드2 |
| v125.4 | 볼륨 페이드인2 |
| v125.5 | 캐스트 비트레이트2 |
| v125.6 | 탭 영역2 |
| v125.7 | 캐시 압축레벨3 |
| v125.8 | 프로그레스 페이드2 |
| v125.9 | 자동 일시정지2 |
| v125.10 | 스크롤 속도2 |
| v125.11 | 색상 틴트2 |
| v125.12 | 볼륨 페이드아웃2 |
| v125.13 | 캐스트 코덱2 |
| v125.14 | 더블 스와이프2 |
| v125.15 | 캐시 메모리2 |

### v126.x
<details><summary>🇨🇳</summary>
| v126.1 | 跳过片头2 |
| v126.2 | 弹幕速度2 |
| v126.3 | 色彩渐变2 |
| v126.4 | 音量淡入2 |
| v126.5 | 投屏码率2 |
| v126.6 | 点击区域2 |
| v126.7 | 缓存压缩级别3 |
| v126.8 | 进度条淡出2 |
| v126.9 | 自动暂停2 |
| v126.10 | 滚动速度2 |
| v126.11 | 色彩色调2 |
| v126.12 | 音量淡出2 |
| v126.13 | 投屏编解码器2 |
| v126.14 | 双指滑动2 |
| v126.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v126.1 | Skip Intro2 |
| v126.2 | Danmaku Speed2 |
| v126.3 | Color Fade2 |
| v126.4 | Volume FadeIn2 |
| v126.5 | Cast Bitrate2 |
| v126.6 | Tap Zone2 |
| v126.7 | Cache CompLevel3 |
| v126.8 | Progress Fade2 |
| v126.9 | Auto Pause2 |
| v126.10 | Scroll Speed2 |
| v126.11 | Color Tint2 |
| v126.12 | Volume FadeOut2 |
| v126.13 | Cast Codec2 |
| v126.14 | Double Swipe2 |
| v126.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v126.1 | OPスキップ2 |
| v126.2 | 弾幕速度2 |
| v126.3 | カラーフェード2 |
| v126.4 | 音量フェードイン2 |
| v126.5 | キャストビットレート2 |
| v126.6 | タップゾーン2 |
| v126.7 | キャッシュ圧縮3 |
| v126.8 | プログレスフェード2 |
| v126.9 | 自動一時停止2 |
| v126.10 | スクロール速度2 |
| v126.11 | カラーチント2 |
| v126.12 | 音量フェードアウト2 |
| v126.13 | キャストコーデック2 |
| v126.14 | ダブルスワイプ2 |
| v126.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v126.1 | OP 건너뛰2 |
| v126.2 | 탄막 속도2 |
| v126.3 | 색상 페이드2 |
| v126.4 | 볼륨 페이드인2 |
| v126.5 | 캐스트 비트레이트2 |
| v126.6 | 탭 영역2 |
| v126.7 | 캐시 압축레벨3 |
| v126.8 | 프로그레스 페이드2 |
| v126.9 | 자동 일시정지2 |
| v126.10 | 스크롤 속도2 |
| v126.11 | 색상 틴트2 |
| v126.12 | 볼륨 페이드아웃2 |
| v126.13 | 캐스트 코덱2 |
| v126.14 | 더블 스와이프2 |
| v126.15 | 캐시 메모리2 |

### v127.x
<details><summary>🇨🇳</summary>
| v127.1 | 跳过片头2 |
| v127.2 | 弹幕速度2 |
| v127.3 | 色彩渐变2 |
| v127.4 | 音量淡入2 |
| v127.5 | 投屏码率2 |
| v127.6 | 点击区域2 |
| v127.7 | 缓存压缩级别3 |
| v127.8 | 进度条淡出2 |
| v127.9 | 自动暂停2 |
| v127.10 | 滚动速度2 |
| v127.11 | 色彩色调2 |
| v127.12 | 音量淡出2 |
| v127.13 | 投屏编解码器2 |
| v127.14 | 双指滑动2 |
| v127.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v127.1 | Skip Intro2 |
| v127.2 | Danmaku Speed2 |
| v127.3 | Color Fade2 |
| v127.4 | Volume FadeIn2 |
| v127.5 | Cast Bitrate2 |
| v127.6 | Tap Zone2 |
| v127.7 | Cache CompLevel3 |
| v127.8 | Progress Fade2 |
| v127.9 | Auto Pause2 |
| v127.10 | Scroll Speed2 |
| v127.11 | Color Tint2 |
| v127.12 | Volume FadeOut2 |
| v127.13 | Cast Codec2 |
| v127.14 | Double Swipe2 |
| v127.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v127.1 | OPスキップ2 |
| v127.2 | 弾幕速度2 |
| v127.3 | カラーフェード2 |
| v127.4 | 音量フェードイン2 |
| v127.5 | キャストビットレート2 |
| v127.6 | タップゾーン2 |
| v127.7 | キャッシュ圧縮3 |
| v127.8 | プログレスフェード2 |
| v127.9 | 自動一時停止2 |
| v127.10 | スクロール速度2 |
| v127.11 | カラーチント2 |
| v127.12 | 音量フェードアウト2 |
| v127.13 | キャストコーデック2 |
| v127.14 | ダブルスワイプ2 |
| v127.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v127.1 | OP 건너뛰2 |
| v127.2 | 탄막 속도2 |
| v127.3 | 색상 페이드2 |
| v127.4 | 볼륨 페이드인2 |
| v127.5 | 캐스트 비트레이트2 |
| v127.6 | 탭 영역2 |
| v127.7 | 캐시 압축레벨3 |
| v127.8 | 프로그레스 페이드2 |
| v127.9 | 자동 일시정지2 |
| v127.10 | 스크롤 속도2 |
| v127.11 | 색상 틴트2 |
| v127.12 | 볼륨 페이드아웃2 |
| v127.13 | 캐스트 코덱2 |
| v127.14 | 더블 스와이프2 |
| v127.15 | 캐시 메모리2 |

### v128.x
<details><summary>🇨🇳</summary>
| v128.1 | 跳过片头2 |
| v128.2 | 弹幕速度2 |
| v128.3 | 色彩渐变2 |
| v128.4 | 音量淡入2 |
| v128.5 | 投屏码率2 |
| v128.6 | 点击区域2 |
| v128.7 | 缓存压缩级别3 |
| v128.8 | 进度条淡出2 |
| v128.9 | 自动暂停2 |
| v128.10 | 滚动速度2 |
| v128.11 | 色彩色调2 |
| v128.12 | 音量淡出2 |
| v128.13 | 投屏编解码器2 |
| v128.14 | 双指滑动2 |
| v128.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v128.1 | Skip Intro2 |
| v128.2 | Danmaku Speed2 |
| v128.3 | Color Fade2 |
| v128.4 | Volume FadeIn2 |
| v128.5 | Cast Bitrate2 |
| v128.6 | Tap Zone2 |
| v128.7 | Cache CompLevel3 |
| v128.8 | Progress Fade2 |
| v128.9 | Auto Pause2 |
| v128.10 | Scroll Speed2 |
| v128.11 | Color Tint2 |
| v128.12 | Volume FadeOut2 |
| v128.13 | Cast Codec2 |
| v128.14 | Double Swipe2 |
| v128.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v128.1 | OPスキップ2 |
| v128.2 | 弾幕速度2 |
| v128.3 | カラーフェード2 |
| v128.4 | 音量フェードイン2 |
| v128.5 | キャストビットレート2 |
| v128.6 | タップゾーン2 |
| v128.7 | キャッシュ圧縮3 |
| v128.8 | プログレスフェード2 |
| v128.9 | 自動一時停止2 |
| v128.10 | スクロール速度2 |
| v128.11 | カラーチント2 |
| v128.12 | 音量フェードアウト2 |
| v128.13 | キャストコーデック2 |
| v128.14 | ダブルスワイプ2 |
| v128.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v128.1 | OP 건너뛰2 |
| v128.2 | 탄막 속도2 |
| v128.3 | 색상 페이드2 |
| v128.4 | 볼륨 페이드인2 |
| v128.5 | 캐스트 비트레이트2 |
| v128.6 | 탭 영역2 |
| v128.7 | 캐시 압축레벨3 |
| v128.8 | 프로그레스 페이드2 |
| v128.9 | 자동 일시정지2 |
| v128.10 | 스크롤 속도2 |
| v128.11 | 색상 틴트2 |
| v128.12 | 볼륨 페이드아웃2 |
| v128.13 | 캐스트 코덱2 |
| v128.14 | 더블 스와이프2 |
| v128.15 | 캐시 메모리2 |

### v129.x
<details><summary>🇨🇳</summary>
| v129.1 | 跳过片头2 |
| v129.2 | 弹幕速度2 |
| v129.3 | 色彩渐变2 |
| v129.4 | 音量淡入2 |
| v129.5 | 投屏码率2 |
| v129.6 | 点击区域2 |
| v129.7 | 缓存压缩级别3 |
| v129.8 | 进度条淡出2 |
| v129.9 | 自动暂停2 |
| v129.10 | 滚动速度2 |
| v129.11 | 色彩色调2 |
| v129.12 | 音量淡出2 |
| v129.13 | 投屏编解码器2 |
| v129.14 | 双指滑动2 |
| v129.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v129.1 | Skip Intro2 |
| v129.2 | Danmaku Speed2 |
| v129.3 | Color Fade2 |
| v129.4 | Volume FadeIn2 |
| v129.5 | Cast Bitrate2 |
| v129.6 | Tap Zone2 |
| v129.7 | Cache CompLevel3 |
| v129.8 | Progress Fade2 |
| v129.9 | Auto Pause2 |
| v129.10 | Scroll Speed2 |
| v129.11 | Color Tint2 |
| v129.12 | Volume FadeOut2 |
| v129.13 | Cast Codec2 |
| v129.14 | Double Swipe2 |
| v129.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v129.1 | OPスキップ2 |
| v129.2 | 弾幕速度2 |
| v129.3 | カラーフェード2 |
| v129.4 | 音量フェードイン2 |
| v129.5 | キャストビットレート2 |
| v129.6 | タップゾーン2 |
| v129.7 | キャッシュ圧縮3 |
| v129.8 | プログレスフェード2 |
| v129.9 | 自動一時停止2 |
| v129.10 | スクロール速度2 |
| v129.11 | カラーチント2 |
| v129.12 | 音量フェードアウト2 |
| v129.13 | キャストコーデック2 |
| v129.14 | ダブルスワイプ2 |
| v129.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v129.1 | OP 건너뛰2 |
| v129.2 | 탄막 속도2 |
| v129.3 | 색상 페이드2 |
| v129.4 | 볼륨 페이드인2 |
| v129.5 | 캐스트 비트레이트2 |
| v129.6 | 탭 영역2 |
| v129.7 | 캐시 압축레벨3 |
| v129.8 | 프로그레스 페이드2 |
| v129.9 | 자동 일시정지2 |
| v129.10 | 스크롤 속도2 |
| v129.11 | 색상 틴트2 |
| v129.12 | 볼륨 페이드아웃2 |
| v129.13 | 캐스트 코덱2 |
| v129.14 | 더블 스와이프2 |
| v129.15 | 캐시 메모리2 |

### v130.x
<details><summary>🇨🇳</summary>
| v130.1 | 跳过片头2 |
| v130.2 | 弹幕速度2 |
| v130.3 | 色彩渐变2 |
| v130.4 | 音量淡入2 |
| v130.5 | 投屏码率2 |
| v130.6 | 点击区域2 |
| v130.7 | 缓存压缩级别3 |
| v130.8 | 进度条淡出2 |
| v130.9 | 自动暂停2 |
| v130.10 | 滚动速度2 |
| v130.11 | 色彩色调2 |
| v130.12 | 音量淡出2 |
| v130.13 | 投屏编解码器2 |
| v130.14 | 双指滑动2 |
| v130.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v130.1 | Skip Intro2 |
| v130.2 | Danmaku Speed2 |
| v130.3 | Color Fade2 |
| v130.4 | Volume FadeIn2 |
| v130.5 | Cast Bitrate2 |
| v130.6 | Tap Zone2 |
| v130.7 | Cache CompLevel3 |
| v130.8 | Progress Fade2 |
| v130.9 | Auto Pause2 |
| v130.10 | Scroll Speed2 |
| v130.11 | Color Tint2 |
| v130.12 | Volume FadeOut2 |
| v130.13 | Cast Codec2 |
| v130.14 | Double Swipe2 |
| v130.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v130.1 | OPスキップ2 |
| v130.2 | 弾幕速度2 |
| v130.3 | カラーフェード2 |
| v130.4 | 音量フェードイン2 |
| v130.5 | キャストビットレート2 |
| v130.6 | タップゾーン2 |
| v130.7 | キャッシュ圧縮3 |
| v130.8 | プログレスフェード2 |
| v130.9 | 自動一時停止2 |
| v130.10 | スクロール速度2 |
| v130.11 | カラーチント2 |
| v130.12 | 音量フェードアウト2 |
| v130.13 | キャストコーデック2 |
| v130.14 | ダブルスワイプ2 |
| v130.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v130.1 | OP 건너뛰2 |
| v130.2 | 탄막 속도2 |
| v130.3 | 색상 페이드2 |
| v130.4 | 볼륨 페이드인2 |
| v130.5 | 캐스트 비트레이트2 |
| v130.6 | 탭 영역2 |
| v130.7 | 캐시 압축레벨3 |
| v130.8 | 프로그레스 페이드2 |
| v130.9 | 자동 일시정지2 |
| v130.10 | 스크롤 속도2 |
| v130.11 | 색상 틴트2 |
| v130.12 | 볼륨 페이드아웃2 |
| v130.13 | 캐스트 코덱2 |
| v130.14 | 더블 스와이프2 |
| v130.15 | 캐시 메모리2 |

### v131.x
<details><summary>🇨🇳</summary>
| v131.1 | 跳过片头2 |
| v131.2 | 弹幕速度2 |
| v131.3 | 色彩渐变2 |
| v131.4 | 音量淡入2 |
| v131.5 | 投屏码率2 |
| v131.6 | 点击区域2 |
| v131.7 | 缓存压缩级别3 |
| v131.8 | 进度条淡出2 |
| v131.9 | 自动暂停2 |
| v131.10 | 滚动速度2 |
| v131.11 | 色彩色调2 |
| v131.12 | 音量淡出2 |
| v131.13 | 投屏编解码器2 |
| v131.14 | 双指滑动2 |
| v131.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v131.1 | Skip Intro2 |
| v131.2 | Danmaku Speed2 |
| v131.3 | Color Fade2 |
| v131.4 | Volume FadeIn2 |
| v131.5 | Cast Bitrate2 |
| v131.6 | Tap Zone2 |
| v131.7 | Cache CompLevel3 |
| v131.8 | Progress Fade2 |
| v131.9 | Auto Pause2 |
| v131.10 | Scroll Speed2 |
| v131.11 | Color Tint2 |
| v131.12 | Volume FadeOut2 |
| v131.13 | Cast Codec2 |
| v131.14 | Double Swipe2 |
| v131.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v131.1 | OPスキップ2 |
| v131.2 | 弾幕速度2 |
| v131.3 | カラーフェード2 |
| v131.4 | 音量フェードイン2 |
| v131.5 | キャストビットレート2 |
| v131.6 | タップゾーン2 |
| v131.7 | キャッシュ圧縮3 |
| v131.8 | プログレスフェード2 |
| v131.9 | 自動一時停止2 |
| v131.10 | スクロール速度2 |
| v131.11 | カラーチント2 |
| v131.12 | 音量フェードアウト2 |
| v131.13 | キャストコーデック2 |
| v131.14 | ダブルスワイプ2 |
| v131.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v131.1 | OP 건너뛰2 |
| v131.2 | 탄막 속도2 |
| v131.3 | 색상 페이드2 |
| v131.4 | 볼륨 페이드인2 |
| v131.5 | 캐스트 비트레이트2 |
| v131.6 | 탭 영역2 |
| v131.7 | 캐시 압축레벨3 |
| v131.8 | 프로그레스 페이드2 |
| v131.9 | 자동 일시정지2 |
| v131.10 | 스크롤 속도2 |
| v131.11 | 색상 틴트2 |
| v131.12 | 볼륨 페이드아웃2 |
| v131.13 | 캐스트 코덱2 |
| v131.14 | 더블 스와이프2 |
| v131.15 | 캐시 메모리2 |

### v132.x
<details><summary>🇨🇳</summary>
| v132.1 | 跳过片头2 |
| v132.2 | 弹幕速度2 |
| v132.3 | 色彩渐变2 |
| v132.4 | 音量淡入2 |
| v132.5 | 投屏码率2 |
| v132.6 | 点击区域2 |
| v132.7 | 缓存压缩级别3 |
| v132.8 | 进度条淡出2 |
| v132.9 | 自动暂停2 |
| v132.10 | 滚动速度2 |
| v132.11 | 色彩色调2 |
| v132.12 | 音量淡出2 |
| v132.13 | 投屏编解码器2 |
| v132.14 | 双指滑动2 |
| v132.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v132.1 | Skip Intro2 |
| v132.2 | Danmaku Speed2 |
| v132.3 | Color Fade2 |
| v132.4 | Volume FadeIn2 |
| v132.5 | Cast Bitrate2 |
| v132.6 | Tap Zone2 |
| v132.7 | Cache CompLevel3 |
| v132.8 | Progress Fade2 |
| v132.9 | Auto Pause2 |
| v132.10 | Scroll Speed2 |
| v132.11 | Color Tint2 |
| v132.12 | Volume FadeOut2 |
| v132.13 | Cast Codec2 |
| v132.14 | Double Swipe2 |
| v132.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v132.1 | OPスキップ2 |
| v132.2 | 弾幕速度2 |
| v132.3 | カラーフェード2 |
| v132.4 | 音量フェードイン2 |
| v132.5 | キャストビットレート2 |
| v132.6 | タップゾーン2 |
| v132.7 | キャッシュ圧縮3 |
| v132.8 | プログレスフェード2 |
| v132.9 | 自動一時停止2 |
| v132.10 | スクロール速度2 |
| v132.11 | カラーチント2 |
| v132.12 | 音量フェードアウト2 |
| v132.13 | キャストコーデック2 |
| v132.14 | ダブルスワイプ2 |
| v132.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v132.1 | OP 건너뛰2 |
| v132.2 | 탄막 속도2 |
| v132.3 | 색상 페이드2 |
| v132.4 | 볼륨 페이드인2 |
| v132.5 | 캐스트 비트레이트2 |
| v132.6 | 탭 영역2 |
| v132.7 | 캐시 압축레벨3 |
| v132.8 | 프로그레스 페이드2 |
| v132.9 | 자동 일시정지2 |
| v132.10 | 스크롤 속도2 |
| v132.11 | 색상 틴트2 |
| v132.12 | 볼륨 페이드아웃2 |
| v132.13 | 캐스트 코덱2 |
| v132.14 | 더블 스와이프2 |
| v132.15 | 캐시 메모리2 |

### v133.x
<details><summary>🇨🇳</summary>
| v133.1 | 跳过片头2 |
| v133.2 | 弹幕速度2 |
| v133.3 | 色彩渐变2 |
| v133.4 | 音量淡入2 |
| v133.5 | 投屏码率2 |
| v133.6 | 点击区域2 |
| v133.7 | 缓存压缩级别3 |
| v133.8 | 进度条淡出2 |
| v133.9 | 自动暂停2 |
| v133.10 | 滚动速度2 |
| v133.11 | 色彩色调2 |
| v133.12 | 音量淡出2 |
| v133.13 | 投屏编解码器2 |
| v133.14 | 双指滑动2 |
| v133.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v133.1 | Skip Intro2 |
| v133.2 | Danmaku Speed2 |
| v133.3 | Color Fade2 |
| v133.4 | Volume FadeIn2 |
| v133.5 | Cast Bitrate2 |
| v133.6 | Tap Zone2 |
| v133.7 | Cache CompLevel3 |
| v133.8 | Progress Fade2 |
| v133.9 | Auto Pause2 |
| v133.10 | Scroll Speed2 |
| v133.11 | Color Tint2 |
| v133.12 | Volume FadeOut2 |
| v133.13 | Cast Codec2 |
| v133.14 | Double Swipe2 |
| v133.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v133.1 | OPスキップ2 |
| v133.2 | 弾幕速度2 |
| v133.3 | カラーフェード2 |
| v133.4 | 音量フェードイン2 |
| v133.5 | キャストビットレート2 |
| v133.6 | タップゾーン2 |
| v133.7 | キャッシュ圧縮3 |
| v133.8 | プログレスフェード2 |
| v133.9 | 自動一時停止2 |
| v133.10 | スクロール速度2 |
| v133.11 | カラーチント2 |
| v133.12 | 音量フェードアウト2 |
| v133.13 | キャストコーデック2 |
| v133.14 | ダブルスワイプ2 |
| v133.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v133.1 | OP 건너뛰2 |
| v133.2 | 탄막 속도2 |
| v133.3 | 색상 페이드2 |
| v133.4 | 볼륨 페이드인2 |
| v133.5 | 캐스트 비트레이트2 |
| v133.6 | 탭 영역2 |
| v133.7 | 캐시 압축레벨3 |
| v133.8 | 프로그레스 페이드2 |
| v133.9 | 자동 일시정지2 |
| v133.10 | 스크롤 속도2 |
| v133.11 | 색상 틴트2 |
| v133.12 | 볼륨 페이드아웃2 |
| v133.13 | 캐스트 코덱2 |
| v133.14 | 더블 스와이프2 |
| v133.15 | 캐시 메모리2 |

### v134.x
<details><summary>🇨🇳</summary>
| v134.1 | 跳过片头2 |
| v134.2 | 弹幕速度2 |
| v134.3 | 色彩渐变2 |
| v134.4 | 音量淡入2 |
| v134.5 | 投屏码率2 |
| v134.6 | 点击区域2 |
| v134.7 | 缓存压缩级别3 |
| v134.8 | 进度条淡出2 |
| v134.9 | 自动暂停2 |
| v134.10 | 滚动速度2 |
| v134.11 | 色彩色调2 |
| v134.12 | 音量淡出2 |
| v134.13 | 投屏编解码器2 |
| v134.14 | 双指滑动2 |
| v134.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v134.1 | Skip Intro2 |
| v134.2 | Danmaku Speed2 |
| v134.3 | Color Fade2 |
| v134.4 | Volume FadeIn2 |
| v134.5 | Cast Bitrate2 |
| v134.6 | Tap Zone2 |
| v134.7 | Cache CompLevel3 |
| v134.8 | Progress Fade2 |
| v134.9 | Auto Pause2 |
| v134.10 | Scroll Speed2 |
| v134.11 | Color Tint2 |
| v134.12 | Volume FadeOut2 |
| v134.13 | Cast Codec2 |
| v134.14 | Double Swipe2 |
| v134.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v134.1 | OPスキップ2 |
| v134.2 | 弾幕速度2 |
| v134.3 | カラーフェード2 |
| v134.4 | 音量フェードイン2 |
| v134.5 | キャストビットレート2 |
| v134.6 | タップゾーン2 |
| v134.7 | キャッシュ圧縮3 |
| v134.8 | プログレスフェード2 |
| v134.9 | 自動一時停止2 |
| v134.10 | スクロール速度2 |
| v134.11 | カラーチント2 |
| v134.12 | 音量フェードアウト2 |
| v134.13 | キャストコーデック2 |
| v134.14 | ダブルスワイプ2 |
| v134.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v134.1 | OP 건너뛰2 |
| v134.2 | 탄막 속도2 |
| v134.3 | 색상 페이드2 |
| v134.4 | 볼륨 페이드인2 |
| v134.5 | 캐스트 비트레이트2 |
| v134.6 | 탭 영역2 |
| v134.7 | 캐시 압축레벨3 |
| v134.8 | 프로그레스 페이드2 |
| v134.9 | 자동 일시정지2 |
| v134.10 | 스크롤 속도2 |
| v134.11 | 색상 틴트2 |
| v134.12 | 볼륨 페이드아웃2 |
| v134.13 | 캐스트 코덱2 |
| v134.14 | 더블 스와이프2 |
| v134.15 | 캐시 메모리2 |

### v135.x
<details><summary>🇨🇳</summary>
| v135.1 | 跳过片头2 |
| v135.2 | 弹幕速度2 |
| v135.3 | 色彩渐变2 |
| v135.4 | 音量淡入2 |
| v135.5 | 投屏码率2 |
| v135.6 | 点击区域2 |
| v135.7 | 缓存压缩级别3 |
| v135.8 | 进度条淡出2 |
| v135.9 | 自动暂停2 |
| v135.10 | 滚动速度2 |
| v135.11 | 色彩色调2 |
| v135.12 | 音量淡出2 |
| v135.13 | 投屏编解码器2 |
| v135.14 | 双指滑动2 |
| v135.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v135.1 | Skip Intro2 |
| v135.2 | Danmaku Speed2 |
| v135.3 | Color Fade2 |
| v135.4 | Volume FadeIn2 |
| v135.5 | Cast Bitrate2 |
| v135.6 | Tap Zone2 |
| v135.7 | Cache CompLevel3 |
| v135.8 | Progress Fade2 |
| v135.9 | Auto Pause2 |
| v135.10 | Scroll Speed2 |
| v135.11 | Color Tint2 |
| v135.12 | Volume FadeOut2 |
| v135.13 | Cast Codec2 |
| v135.14 | Double Swipe2 |
| v135.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v135.1 | OPスキップ2 |
| v135.2 | 弾幕速度2 |
| v135.3 | カラーフェード2 |
| v135.4 | 音量フェードイン2 |
| v135.5 | キャストビットレート2 |
| v135.6 | タップゾーン2 |
| v135.7 | キャッシュ圧縮3 |
| v135.8 | プログレスフェード2 |
| v135.9 | 自動一時停止2 |
| v135.10 | スクロール速度2 |
| v135.11 | カラーチント2 |
| v135.12 | 音量フェードアウト2 |
| v135.13 | キャストコーデック2 |
| v135.14 | ダブルスワイプ2 |
| v135.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v135.1 | OP 건너뛰2 |
| v135.2 | 탄막 속도2 |
| v135.3 | 색상 페이드2 |
| v135.4 | 볼륨 페이드인2 |
| v135.5 | 캐스트 비트레이트2 |
| v135.6 | 탭 영역2 |
| v135.7 | 캐시 압축레벨3 |
| v135.8 | 프로그레스 페이드2 |
| v135.9 | 자동 일시정지2 |
| v135.10 | 스크롤 속도2 |
| v135.11 | 색상 틴트2 |
| v135.12 | 볼륨 페이드아웃2 |
| v135.13 | 캐스트 코덱2 |
| v135.14 | 더블 스와이프2 |
| v135.15 | 캐시 메모리2 |

### v136.x
<details><summary>🇨🇳</summary>
| v136.1 | 跳过片头2 |
| v136.2 | 弹幕速度2 |
| v136.3 | 色彩渐变2 |
| v136.4 | 音量淡入2 |
| v136.5 | 投屏码率2 |
| v136.6 | 点击区域2 |
| v136.7 | 缓存压缩级别3 |
| v136.8 | 进度条淡出2 |
| v136.9 | 自动暂停2 |
| v136.10 | 滚动速度2 |
| v136.11 | 色彩色调2 |
| v136.12 | 音量淡出2 |
| v136.13 | 投屏编解码器2 |
| v136.14 | 双指滑动2 |
| v136.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v136.1 | Skip Intro2 |
| v136.2 | Danmaku Speed2 |
| v136.3 | Color Fade2 |
| v136.4 | Volume FadeIn2 |
| v136.5 | Cast Bitrate2 |
| v136.6 | Tap Zone2 |
| v136.7 | Cache CompLevel3 |
| v136.8 | Progress Fade2 |
| v136.9 | Auto Pause2 |
| v136.10 | Scroll Speed2 |
| v136.11 | Color Tint2 |
| v136.12 | Volume FadeOut2 |
| v136.13 | Cast Codec2 |
| v136.14 | Double Swipe2 |
| v136.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v136.1 | OPスキップ2 |
| v136.2 | 弾幕速度2 |
| v136.3 | カラーフェード2 |
| v136.4 | 音量フェードイン2 |
| v136.5 | キャストビットレート2 |
| v136.6 | タップゾーン2 |
| v136.7 | キャッシュ圧縮3 |
| v136.8 | プログレスフェード2 |
| v136.9 | 自動一時停止2 |
| v136.10 | スクロール速度2 |
| v136.11 | カラーチント2 |
| v136.12 | 音量フェードアウト2 |
| v136.13 | キャストコーデック2 |
| v136.14 | ダブルスワイプ2 |
| v136.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v136.1 | OP 건너뛰2 |
| v136.2 | 탄막 속도2 |
| v136.3 | 색상 페이드2 |
| v136.4 | 볼륨 페이드인2 |
| v136.5 | 캐스트 비트레이트2 |
| v136.6 | 탭 영역2 |
| v136.7 | 캐시 압축레벨3 |
| v136.8 | 프로그레스 페이드2 |
| v136.9 | 자동 일시정지2 |
| v136.10 | 스크롤 속도2 |
| v136.11 | 색상 틴트2 |
| v136.12 | 볼륨 페이드아웃2 |
| v136.13 | 캐스트 코덱2 |
| v136.14 | 더블 스와이프2 |
| v136.15 | 캐시 메모리2 |

### v137.x
<details><summary>🇨🇳</summary>
| v137.1 | 跳过片头2 |
| v137.2 | 弹幕速度2 |
| v137.3 | 色彩渐变2 |
| v137.4 | 音量淡入2 |
| v137.5 | 投屏码率2 |
| v137.6 | 点击区域2 |
| v137.7 | 缓存压缩级别3 |
| v137.8 | 进度条淡出2 |
| v137.9 | 自动暂停2 |
| v137.10 | 滚动速度2 |
| v137.11 | 色彩色调2 |
| v137.12 | 音量淡出2 |
| v137.13 | 投屏编解码器2 |
| v137.14 | 双指滑动2 |
| v137.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v137.1 | Skip Intro2 |
| v137.2 | Danmaku Speed2 |
| v137.3 | Color Fade2 |
| v137.4 | Volume FadeIn2 |
| v137.5 | Cast Bitrate2 |
| v137.6 | Tap Zone2 |
| v137.7 | Cache CompLevel3 |
| v137.8 | Progress Fade2 |
| v137.9 | Auto Pause2 |
| v137.10 | Scroll Speed2 |
| v137.11 | Color Tint2 |
| v137.12 | Volume FadeOut2 |
| v137.13 | Cast Codec2 |
| v137.14 | Double Swipe2 |
| v137.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v137.1 | OPスキップ2 |
| v137.2 | 弾幕速度2 |
| v137.3 | カラーフェード2 |
| v137.4 | 音量フェードイン2 |
| v137.5 | キャストビットレート2 |
| v137.6 | タップゾーン2 |
| v137.7 | キャッシュ圧縮3 |
| v137.8 | プログレスフェード2 |
| v137.9 | 自動一時停止2 |
| v137.10 | スクロール速度2 |
| v137.11 | カラーチント2 |
| v137.12 | 音量フェードアウト2 |
| v137.13 | キャストコーデック2 |
| v137.14 | ダブルスワイプ2 |
| v137.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v137.1 | OP 건너뛰2 |
| v137.2 | 탄막 속도2 |
| v137.3 | 색상 페이드2 |
| v137.4 | 볼륨 페이드인2 |
| v137.5 | 캐스트 비트레이트2 |
| v137.6 | 탭 영역2 |
| v137.7 | 캐시 압축레벨3 |
| v137.8 | 프로그레스 페이드2 |
| v137.9 | 자동 일시정지2 |
| v137.10 | 스크롤 속도2 |
| v137.11 | 색상 틴트2 |
| v137.12 | 볼륨 페이드아웃2 |
| v137.13 | 캐스트 코덱2 |
| v137.14 | 더블 스와이프2 |
| v137.15 | 캐시 메모리2 |

### v138.x
<details><summary>🇨🇳</summary>
| v138.1 | 跳过片头2 |
| v138.2 | 弹幕速度2 |
| v138.3 | 色彩渐变2 |
| v138.4 | 音量淡入2 |
| v138.5 | 投屏码率2 |
| v138.6 | 点击区域2 |
| v138.7 | 缓存压缩级别3 |
| v138.8 | 进度条淡出2 |
| v138.9 | 自动暂停2 |
| v138.10 | 滚动速度2 |
| v138.11 | 色彩色调2 |
| v138.12 | 音量淡出2 |
| v138.13 | 投屏编解码器2 |
| v138.14 | 双指滑动2 |
| v138.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v138.1 | Skip Intro2 |
| v138.2 | Danmaku Speed2 |
| v138.3 | Color Fade2 |
| v138.4 | Volume FadeIn2 |
| v138.5 | Cast Bitrate2 |
| v138.6 | Tap Zone2 |
| v138.7 | Cache CompLevel3 |
| v138.8 | Progress Fade2 |
| v138.9 | Auto Pause2 |
| v138.10 | Scroll Speed2 |
| v138.11 | Color Tint2 |
| v138.12 | Volume FadeOut2 |
| v138.13 | Cast Codec2 |
| v138.14 | Double Swipe2 |
| v138.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v138.1 | OPスキップ2 |
| v138.2 | 弾幕速度2 |
| v138.3 | カラーフェード2 |
| v138.4 | 音量フェードイン2 |
| v138.5 | キャストビットレート2 |
| v138.6 | タップゾーン2 |
| v138.7 | キャッシュ圧縮3 |
| v138.8 | プログレスフェード2 |
| v138.9 | 自動一時停止2 |
| v138.10 | スクロール速度2 |
| v138.11 | カラーチント2 |
| v138.12 | 音量フェードアウト2 |
| v138.13 | キャストコーデック2 |
| v138.14 | ダブルスワイプ2 |
| v138.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v138.1 | OP 건너뛰2 |
| v138.2 | 탄막 속도2 |
| v138.3 | 색상 페이드2 |
| v138.4 | 볼륨 페이드인2 |
| v138.5 | 캐스트 비트레이트2 |
| v138.6 | 탭 영역2 |
| v138.7 | 캐시 압축레벨3 |
| v138.8 | 프로그레스 페이드2 |
| v138.9 | 자동 일시정지2 |
| v138.10 | 스크롤 속도2 |
| v138.11 | 색상 틴트2 |
| v138.12 | 볼륨 페이드아웃2 |
| v138.13 | 캐스트 코덱2 |
| v138.14 | 더블 스와이프2 |
| v138.15 | 캐시 메모리2 |

### v139.x
<details><summary>🇨🇳</summary>
| v139.1 | 跳过片头2 |
| v139.2 | 弹幕速度2 |
| v139.3 | 色彩渐变2 |
| v139.4 | 音量淡入2 |
| v139.5 | 投屏码率2 |
| v139.6 | 点击区域2 |
| v139.7 | 缓存压缩级别3 |
| v139.8 | 进度条淡出2 |
| v139.9 | 自动暂停2 |
| v139.10 | 滚动速度2 |
| v139.11 | 色彩色调2 |
| v139.12 | 音量淡出2 |
| v139.13 | 投屏编解码器2 |
| v139.14 | 双指滑动2 |
| v139.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v139.1 | Skip Intro2 |
| v139.2 | Danmaku Speed2 |
| v139.3 | Color Fade2 |
| v139.4 | Volume FadeIn2 |
| v139.5 | Cast Bitrate2 |
| v139.6 | Tap Zone2 |
| v139.7 | Cache CompLevel3 |
| v139.8 | Progress Fade2 |
| v139.9 | Auto Pause2 |
| v139.10 | Scroll Speed2 |
| v139.11 | Color Tint2 |
| v139.12 | Volume FadeOut2 |
| v139.13 | Cast Codec2 |
| v139.14 | Double Swipe2 |
| v139.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v139.1 | OPスキップ2 |
| v139.2 | 弾幕速度2 |
| v139.3 | カラーフェード2 |
| v139.4 | 音量フェードイン2 |
| v139.5 | キャストビットレート2 |
| v139.6 | タップゾーン2 |
| v139.7 | キャッシュ圧縮3 |
| v139.8 | プログレスフェード2 |
| v139.9 | 自動一時停止2 |
| v139.10 | スクロール速度2 |
| v139.11 | カラーチント2 |
| v139.12 | 音量フェードアウト2 |
| v139.13 | キャストコーデック2 |
| v139.14 | ダブルスワイプ2 |
| v139.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v139.1 | OP 건너뛰2 |
| v139.2 | 탄막 속도2 |
| v139.3 | 색상 페이드2 |
| v139.4 | 볼륨 페이드인2 |
| v139.5 | 캐스트 비트레이트2 |
| v139.6 | 탭 영역2 |
| v139.7 | 캐시 압축레벨3 |
| v139.8 | 프로그레스 페이드2 |
| v139.9 | 자동 일시정지2 |
| v139.10 | 스크롤 속도2 |
| v139.11 | 색상 틴트2 |
| v139.12 | 볼륨 페이드아웃2 |
| v139.13 | 캐스트 코덱2 |
| v139.14 | 더블 스와이프2 |
| v139.15 | 캐시 메모리2 |

### v140.x
<details><summary>🇨🇳</summary>
| v140.1 | 跳过片头2 |
| v140.2 | 弹幕速度2 |
| v140.3 | 色彩渐变2 |
| v140.4 | 音量淡入2 |
| v140.5 | 投屏码率2 |
| v140.6 | 点击区域2 |
| v140.7 | 缓存压缩级别3 |
| v140.8 | 进度条淡出2 |
| v140.9 | 自动暂停2 |
| v140.10 | 滚动速度2 |
| v140.11 | 色彩色调2 |
| v140.12 | 音量淡出2 |
| v140.13 | 投屏编解码器2 |
| v140.14 | 双指滑动2 |
| v140.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v140.1 | Skip Intro2 |
| v140.2 | Danmaku Speed2 |
| v140.3 | Color Fade2 |
| v140.4 | Volume FadeIn2 |
| v140.5 | Cast Bitrate2 |
| v140.6 | Tap Zone2 |
| v140.7 | Cache CompLevel3 |
| v140.8 | Progress Fade2 |
| v140.9 | Auto Pause2 |
| v140.10 | Scroll Speed2 |
| v140.11 | Color Tint2 |
| v140.12 | Volume FadeOut2 |
| v140.13 | Cast Codec2 |
| v140.14 | Double Swipe2 |
| v140.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v140.1 | OPスキップ2 |
| v140.2 | 弾幕速度2 |
| v140.3 | カラーフェード2 |
| v140.4 | 音量フェードイン2 |
| v140.5 | キャストビットレート2 |
| v140.6 | タップゾーン2 |
| v140.7 | キャッシュ圧縮3 |
| v140.8 | プログレスフェード2 |
| v140.9 | 自動一時停止2 |
| v140.10 | スクロール速度2 |
| v140.11 | カラーチント2 |
| v140.12 | 音量フェードアウト2 |
| v140.13 | キャストコーデック2 |
| v140.14 | ダブルスワイプ2 |
| v140.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v140.1 | OP 건너뛰2 |
| v140.2 | 탄막 속도2 |
| v140.3 | 색상 페이드2 |
| v140.4 | 볼륨 페이드인2 |
| v140.5 | 캐스트 비트레이트2 |
| v140.6 | 탭 영역2 |
| v140.7 | 캐시 압축레벨3 |
| v140.8 | 프로그레스 페이드2 |
| v140.9 | 자동 일시정지2 |
| v140.10 | 스크롤 속도2 |
| v140.11 | 색상 틴트2 |
| v140.12 | 볼륨 페이드아웃2 |
| v140.13 | 캐스트 코덱2 |
| v140.14 | 더블 스와이프2 |
| v140.15 | 캐시 메모리2 |

### v141.x
<details><summary>🇨🇳</summary>
| v141.1 | 跳过片头2 |
| v141.2 | 弹幕速度2 |
| v141.3 | 色彩渐变2 |
| v141.4 | 音量淡入2 |
| v141.5 | 投屏码率2 |
| v141.6 | 点击区域2 |
| v141.7 | 缓存压缩级别3 |
| v141.8 | 进度条淡出2 |
| v141.9 | 自动暂停2 |
| v141.10 | 滚动速度2 |
| v141.11 | 色彩色调2 |
| v141.12 | 音量淡出2 |
| v141.13 | 投屏编解码器2 |
| v141.14 | 双指滑动2 |
| v141.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v141.1 | Skip Intro2 |
| v141.2 | Danmaku Speed2 |
| v141.3 | Color Fade2 |
| v141.4 | Volume FadeIn2 |
| v141.5 | Cast Bitrate2 |
| v141.6 | Tap Zone2 |
| v141.7 | Cache CompLevel3 |
| v141.8 | Progress Fade2 |
| v141.9 | Auto Pause2 |
| v141.10 | Scroll Speed2 |
| v141.11 | Color Tint2 |
| v141.12 | Volume FadeOut2 |
| v141.13 | Cast Codec2 |
| v141.14 | Double Swipe2 |
| v141.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v141.1 | OPスキップ2 |
| v141.2 | 弾幕速度2 |
| v141.3 | カラーフェード2 |
| v141.4 | 音量フェードイン2 |
| v141.5 | キャストビットレート2 |
| v141.6 | タップゾーン2 |
| v141.7 | キャッシュ圧縮3 |
| v141.8 | プログレスフェード2 |
| v141.9 | 自動一時停止2 |
| v141.10 | スクロール速度2 |
| v141.11 | カラーチント2 |
| v141.12 | 音量フェードアウト2 |
| v141.13 | キャストコーデック2 |
| v141.14 | ダブルスワイプ2 |
| v141.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v141.1 | OP 건너뛰2 |
| v141.2 | 탄막 속도2 |
| v141.3 | 색상 페이드2 |
| v141.4 | 볼륨 페이드인2 |
| v141.5 | 캐스트 비트레이트2 |
| v141.6 | 탭 영역2 |
| v141.7 | 캐시 압축레벨3 |
| v141.8 | 프로그레스 페이드2 |
| v141.9 | 자동 일시정지2 |
| v141.10 | 스크롤 속도2 |
| v141.11 | 색상 틴트2 |
| v141.12 | 볼륨 페이드아웃2 |
| v141.13 | 캐스트 코덱2 |
| v141.14 | 더블 스와이프2 |
| v141.15 | 캐시 메모리2 |

### v142.x
<details><summary>🇨🇳</summary>
| v142.1 | 跳过片头2 |
| v142.2 | 弹幕速度2 |
| v142.3 | 色彩渐变2 |
| v142.4 | 音量淡入2 |
| v142.5 | 投屏码率2 |
| v142.6 | 点击区域2 |
| v142.7 | 缓存压缩级别3 |
| v142.8 | 进度条淡出2 |
| v142.9 | 自动暂停2 |
| v142.10 | 滚动速度2 |
| v142.11 | 色彩色调2 |
| v142.12 | 音量淡出2 |
| v142.13 | 投屏编解码器2 |
| v142.14 | 双指滑动2 |
| v142.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v142.1 | Skip Intro2 |
| v142.2 | Danmaku Speed2 |
| v142.3 | Color Fade2 |
| v142.4 | Volume FadeIn2 |
| v142.5 | Cast Bitrate2 |
| v142.6 | Tap Zone2 |
| v142.7 | Cache CompLevel3 |
| v142.8 | Progress Fade2 |
| v142.9 | Auto Pause2 |
| v142.10 | Scroll Speed2 |
| v142.11 | Color Tint2 |
| v142.12 | Volume FadeOut2 |
| v142.13 | Cast Codec2 |
| v142.14 | Double Swipe2 |
| v142.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v142.1 | OPスキップ2 |
| v142.2 | 弾幕速度2 |
| v142.3 | カラーフェード2 |
| v142.4 | 音量フェードイン2 |
| v142.5 | キャストビットレート2 |
| v142.6 | タップゾーン2 |
| v142.7 | キャッシュ圧縮3 |
| v142.8 | プログレスフェード2 |
| v142.9 | 自動一時停止2 |
| v142.10 | スクロール速度2 |
| v142.11 | カラーチント2 |
| v142.12 | 音量フェードアウト2 |
| v142.13 | キャストコーデック2 |
| v142.14 | ダブルスワイプ2 |
| v142.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v142.1 | OP 건너뛰2 |
| v142.2 | 탄막 속도2 |
| v142.3 | 색상 페이드2 |
| v142.4 | 볼륨 페이드인2 |
| v142.5 | 캐스트 비트레이트2 |
| v142.6 | 탭 영역2 |
| v142.7 | 캐시 압축레벨3 |
| v142.8 | 프로그레스 페이드2 |
| v142.9 | 자동 일시정지2 |
| v142.10 | 스크롤 속도2 |
| v142.11 | 색상 틴트2 |
| v142.12 | 볼륨 페이드아웃2 |
| v142.13 | 캐스트 코덱2 |
| v142.14 | 더블 스와이프2 |
| v142.15 | 캐시 메모리2 |

### v143.x
<details><summary>🇨🇳</summary>
| v143.1 | 跳过片头2 |
| v143.2 | 弹幕速度2 |
| v143.3 | 色彩渐变2 |
| v143.4 | 音量淡入2 |
| v143.5 | 投屏码率2 |
| v143.6 | 点击区域2 |
| v143.7 | 缓存压缩级别3 |
| v143.8 | 进度条淡出2 |
| v143.9 | 自动暂停2 |
| v143.10 | 滚动速度2 |
| v143.11 | 色彩色调2 |
| v143.12 | 音量淡出2 |
| v143.13 | 投屏编解码器2 |
| v143.14 | 双指滑动2 |
| v143.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v143.1 | Skip Intro2 |
| v143.2 | Danmaku Speed2 |
| v143.3 | Color Fade2 |
| v143.4 | Volume FadeIn2 |
| v143.5 | Cast Bitrate2 |
| v143.6 | Tap Zone2 |
| v143.7 | Cache CompLevel3 |
| v143.8 | Progress Fade2 |
| v143.9 | Auto Pause2 |
| v143.10 | Scroll Speed2 |
| v143.11 | Color Tint2 |
| v143.12 | Volume FadeOut2 |
| v143.13 | Cast Codec2 |
| v143.14 | Double Swipe2 |
| v143.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v143.1 | OPスキップ2 |
| v143.2 | 弾幕速度2 |
| v143.3 | カラーフェード2 |
| v143.4 | 音量フェードイン2 |
| v143.5 | キャストビットレート2 |
| v143.6 | タップゾーン2 |
| v143.7 | キャッシュ圧縮3 |
| v143.8 | プログレスフェード2 |
| v143.9 | 自動一時停止2 |
| v143.10 | スクロール速度2 |
| v143.11 | カラーチント2 |
| v143.12 | 音量フェードアウト2 |
| v143.13 | キャストコーデック2 |
| v143.14 | ダブルスワイプ2 |
| v143.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v143.1 | OP 건너뛰2 |
| v143.2 | 탄막 속도2 |
| v143.3 | 색상 페이드2 |
| v143.4 | 볼륨 페이드인2 |
| v143.5 | 캐스트 비트레이트2 |
| v143.6 | 탭 영역2 |
| v143.7 | 캐시 압축레벨3 |
| v143.8 | 프로그레스 페이드2 |
| v143.9 | 자동 일시정지2 |
| v143.10 | 스크롤 속도2 |
| v143.11 | 색상 틴트2 |
| v143.12 | 볼륨 페이드아웃2 |
| v143.13 | 캐스트 코덱2 |
| v143.14 | 더블 스와이프2 |
| v143.15 | 캐시 메모리2 |

### v144.x
<details><summary>🇨🇳</summary>
| v144.1 | 跳过片头2 |
| v144.2 | 弹幕速度2 |
| v144.3 | 色彩渐变2 |
| v144.4 | 音量淡入2 |
| v144.5 | 投屏码率2 |
| v144.6 | 点击区域2 |
| v144.7 | 缓存压缩级别3 |
| v144.8 | 进度条淡出2 |
| v144.9 | 自动暂停2 |
| v144.10 | 滚动速度2 |
| v144.11 | 色彩色调2 |
| v144.12 | 音量淡出2 |
| v144.13 | 投屏编解码器2 |
| v144.14 | 双指滑动2 |
| v144.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v144.1 | Skip Intro2 |
| v144.2 | Danmaku Speed2 |
| v144.3 | Color Fade2 |
| v144.4 | Volume FadeIn2 |
| v144.5 | Cast Bitrate2 |
| v144.6 | Tap Zone2 |
| v144.7 | Cache CompLevel3 |
| v144.8 | Progress Fade2 |
| v144.9 | Auto Pause2 |
| v144.10 | Scroll Speed2 |
| v144.11 | Color Tint2 |
| v144.12 | Volume FadeOut2 |
| v144.13 | Cast Codec2 |
| v144.14 | Double Swipe2 |
| v144.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v144.1 | OPスキップ2 |
| v144.2 | 弾幕速度2 |
| v144.3 | カラーフェード2 |
| v144.4 | 音量フェードイン2 |
| v144.5 | キャストビットレート2 |
| v144.6 | タップゾーン2 |
| v144.7 | キャッシュ圧縮3 |
| v144.8 | プログレスフェード2 |
| v144.9 | 自動一時停止2 |
| v144.10 | スクロール速度2 |
| v144.11 | カラーチント2 |
| v144.12 | 音量フェードアウト2 |
| v144.13 | キャストコーデック2 |
| v144.14 | ダブルスワイプ2 |
| v144.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v144.1 | OP 건너뛰2 |
| v144.2 | 탄막 속도2 |
| v144.3 | 색상 페이드2 |
| v144.4 | 볼륨 페이드인2 |
| v144.5 | 캐스트 비트레이트2 |
| v144.6 | 탭 영역2 |
| v144.7 | 캐시 압축레벨3 |
| v144.8 | 프로그레스 페이드2 |
| v144.9 | 자동 일시정지2 |
| v144.10 | 스크롤 속도2 |
| v144.11 | 색상 틴트2 |
| v144.12 | 볼륨 페이드아웃2 |
| v144.13 | 캐스트 코덱2 |
| v144.14 | 더블 스와이프2 |
| v144.15 | 캐시 메모리2 |

### v145.x
<details><summary>🇨🇳</summary>
| v145.1 | 跳过片头2 |
| v145.2 | 弹幕速度2 |
| v145.3 | 色彩渐变2 |
| v145.4 | 音量淡入2 |
| v145.5 | 投屏码率2 |
| v145.6 | 点击区域2 |
| v145.7 | 缓存压缩级别3 |
| v145.8 | 进度条淡出2 |
| v145.9 | 自动暂停2 |
| v145.10 | 滚动速度2 |
| v145.11 | 色彩色调2 |
| v145.12 | 音量淡出2 |
| v145.13 | 投屏编解码器2 |
| v145.14 | 双指滑动2 |
| v145.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v145.1 | Skip Intro2 |
| v145.2 | Danmaku Speed2 |
| v145.3 | Color Fade2 |
| v145.4 | Volume FadeIn2 |
| v145.5 | Cast Bitrate2 |
| v145.6 | Tap Zone2 |
| v145.7 | Cache CompLevel3 |
| v145.8 | Progress Fade2 |
| v145.9 | Auto Pause2 |
| v145.10 | Scroll Speed2 |
| v145.11 | Color Tint2 |
| v145.12 | Volume FadeOut2 |
| v145.13 | Cast Codec2 |
| v145.14 | Double Swipe2 |
| v145.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v145.1 | OPスキップ2 |
| v145.2 | 弾幕速度2 |
| v145.3 | カラーフェード2 |
| v145.4 | 音量フェードイン2 |
| v145.5 | キャストビットレート2 |
| v145.6 | タップゾーン2 |
| v145.7 | キャッシュ圧縮3 |
| v145.8 | プログレスフェード2 |
| v145.9 | 自動一時停止2 |
| v145.10 | スクロール速度2 |
| v145.11 | カラーチント2 |
| v145.12 | 音量フェードアウト2 |
| v145.13 | キャストコーデック2 |
| v145.14 | ダブルスワイプ2 |
| v145.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v145.1 | OP 건너뛰2 |
| v145.2 | 탄막 속도2 |
| v145.3 | 색상 페이드2 |
| v145.4 | 볼륨 페이드인2 |
| v145.5 | 캐스트 비트레이트2 |
| v145.6 | 탭 영역2 |
| v145.7 | 캐시 압축레벨3 |
| v145.8 | 프로그레스 페이드2 |
| v145.9 | 자동 일시정지2 |
| v145.10 | 스크롤 속도2 |
| v145.11 | 색상 틴트2 |
| v145.12 | 볼륨 페이드아웃2 |
| v145.13 | 캐스트 코덱2 |
| v145.14 | 더블 스와이프2 |
| v145.15 | 캐시 메모리2 |

### v146.x
<details><summary>🇨🇳</summary>
| v146.1 | 跳过片头2 |
| v146.2 | 弹幕速度2 |
| v146.3 | 色彩渐变2 |
| v146.4 | 音量淡入2 |
| v146.5 | 投屏码率2 |
| v146.6 | 点击区域2 |
| v146.7 | 缓存压缩级别3 |
| v146.8 | 进度条淡出2 |
| v146.9 | 自动暂停2 |
| v146.10 | 滚动速度2 |
| v146.11 | 色彩色调2 |
| v146.12 | 音量淡出2 |
| v146.13 | 投屏编解码器2 |
| v146.14 | 双指滑动2 |
| v146.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v146.1 | Skip Intro2 |
| v146.2 | Danmaku Speed2 |
| v146.3 | Color Fade2 |
| v146.4 | Volume FadeIn2 |
| v146.5 | Cast Bitrate2 |
| v146.6 | Tap Zone2 |
| v146.7 | Cache CompLevel3 |
| v146.8 | Progress Fade2 |
| v146.9 | Auto Pause2 |
| v146.10 | Scroll Speed2 |
| v146.11 | Color Tint2 |
| v146.12 | Volume FadeOut2 |
| v146.13 | Cast Codec2 |
| v146.14 | Double Swipe2 |
| v146.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v146.1 | OPスキップ2 |
| v146.2 | 弾幕速度2 |
| v146.3 | カラーフェード2 |
| v146.4 | 音量フェードイン2 |
| v146.5 | キャストビットレート2 |
| v146.6 | タップゾーン2 |
| v146.7 | キャッシュ圧縮3 |
| v146.8 | プログレスフェード2 |
| v146.9 | 自動一時停止2 |
| v146.10 | スクロール速度2 |
| v146.11 | カラーチント2 |
| v146.12 | 音量フェードアウト2 |
| v146.13 | キャストコーデック2 |
| v146.14 | ダブルスワイプ2 |
| v146.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v146.1 | OP 건너뛰2 |
| v146.2 | 탄막 속도2 |
| v146.3 | 색상 페이드2 |
| v146.4 | 볼륨 페이드인2 |
| v146.5 | 캐스트 비트레이트2 |
| v146.6 | 탭 영역2 |
| v146.7 | 캐시 압축레벨3 |
| v146.8 | 프로그레스 페이드2 |
| v146.9 | 자동 일시정지2 |
| v146.10 | 스크롤 속도2 |
| v146.11 | 색상 틴트2 |
| v146.12 | 볼륨 페이드아웃2 |
| v146.13 | 캐스트 코덱2 |
| v146.14 | 더블 스와이프2 |
| v146.15 | 캐시 메모리2 |

### v147.x
<details><summary>🇨🇳</summary>
| v147.1 | 跳过片头2 |
| v147.2 | 弹幕速度2 |
| v147.3 | 色彩渐变2 |
| v147.4 | 音量淡入2 |
| v147.5 | 投屏码率2 |
| v147.6 | 点击区域2 |
| v147.7 | 缓存压缩级别3 |
| v147.8 | 进度条淡出2 |
| v147.9 | 自动暂停2 |
| v147.10 | 滚动速度2 |
| v147.11 | 色彩色调2 |
| v147.12 | 音量淡出2 |
| v147.13 | 投屏编解码器2 |
| v147.14 | 双指滑动2 |
| v147.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v147.1 | Skip Intro2 |
| v147.2 | Danmaku Speed2 |
| v147.3 | Color Fade2 |
| v147.4 | Volume FadeIn2 |
| v147.5 | Cast Bitrate2 |
| v147.6 | Tap Zone2 |
| v147.7 | Cache CompLevel3 |
| v147.8 | Progress Fade2 |
| v147.9 | Auto Pause2 |
| v147.10 | Scroll Speed2 |
| v147.11 | Color Tint2 |
| v147.12 | Volume FadeOut2 |
| v147.13 | Cast Codec2 |
| v147.14 | Double Swipe2 |
| v147.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v147.1 | OPスキップ2 |
| v147.2 | 弾幕速度2 |
| v147.3 | カラーフェード2 |
| v147.4 | 音量フェードイン2 |
| v147.5 | キャストビットレート2 |
| v147.6 | タップゾーン2 |
| v147.7 | キャッシュ圧縮3 |
| v147.8 | プログレスフェード2 |
| v147.9 | 自動一時停止2 |
| v147.10 | スクロール速度2 |
| v147.11 | カラーチント2 |
| v147.12 | 音量フェードアウト2 |
| v147.13 | キャストコーデック2 |
| v147.14 | ダブルスワイプ2 |
| v147.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v147.1 | OP 건너뛰2 |
| v147.2 | 탄막 속도2 |
| v147.3 | 색상 페이드2 |
| v147.4 | 볼륨 페이드인2 |
| v147.5 | 캐스트 비트레이트2 |
| v147.6 | 탭 영역2 |
| v147.7 | 캐시 압축레벨3 |
| v147.8 | 프로그레스 페이드2 |
| v147.9 | 자동 일시정지2 |
| v147.10 | 스크롤 속도2 |
| v147.11 | 색상 틴트2 |
| v147.12 | 볼륨 페이드아웃2 |
| v147.13 | 캐스트 코덱2 |
| v147.14 | 더블 스와이프2 |
| v147.15 | 캐시 메모리2 |

### v148.x
<details><summary>🇨🇳</summary>
| v148.1 | 跳过片头2 |
| v148.2 | 弹幕速度2 |
| v148.3 | 色彩渐变2 |
| v148.4 | 音量淡入2 |
| v148.5 | 投屏码率2 |
| v148.6 | 点击区域2 |
| v148.7 | 缓存压缩级别3 |
| v148.8 | 进度条淡出2 |
| v148.9 | 自动暂停2 |
| v148.10 | 滚动速度2 |
| v148.11 | 色彩色调2 |
| v148.12 | 音量淡出2 |
| v148.13 | 投屏编解码器2 |
| v148.14 | 双指滑动2 |
| v148.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v148.1 | Skip Intro2 |
| v148.2 | Danmaku Speed2 |
| v148.3 | Color Fade2 |
| v148.4 | Volume FadeIn2 |
| v148.5 | Cast Bitrate2 |
| v148.6 | Tap Zone2 |
| v148.7 | Cache CompLevel3 |
| v148.8 | Progress Fade2 |
| v148.9 | Auto Pause2 |
| v148.10 | Scroll Speed2 |
| v148.11 | Color Tint2 |
| v148.12 | Volume FadeOut2 |
| v148.13 | Cast Codec2 |
| v148.14 | Double Swipe2 |
| v148.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v148.1 | OPスキップ2 |
| v148.2 | 弾幕速度2 |
| v148.3 | カラーフェード2 |
| v148.4 | 音量フェードイン2 |
| v148.5 | キャストビットレート2 |
| v148.6 | タップゾーン2 |
| v148.7 | キャッシュ圧縮3 |
| v148.8 | プログレスフェード2 |
| v148.9 | 自動一時停止2 |
| v148.10 | スクロール速度2 |
| v148.11 | カラーチント2 |
| v148.12 | 音量フェードアウト2 |
| v148.13 | キャストコーデック2 |
| v148.14 | ダブルスワイプ2 |
| v148.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v148.1 | OP 건너뛰2 |
| v148.2 | 탄막 속도2 |
| v148.3 | 색상 페이드2 |
| v148.4 | 볼륨 페이드인2 |
| v148.5 | 캐스트 비트레이트2 |
| v148.6 | 탭 영역2 |
| v148.7 | 캐시 압축레벨3 |
| v148.8 | 프로그레스 페이드2 |
| v148.9 | 자동 일시정지2 |
| v148.10 | 스크롤 속도2 |
| v148.11 | 색상 틴트2 |
| v148.12 | 볼륨 페이드아웃2 |
| v148.13 | 캐스트 코덱2 |
| v148.14 | 더블 스와이프2 |
| v148.15 | 캐시 메모리2 |

### v149.x
<details><summary>🇨🇳</summary>
| v149.1 | 跳过片头2 |
| v149.2 | 弹幕速度2 |
| v149.3 | 色彩渐变2 |
| v149.4 | 音量淡入2 |
| v149.5 | 投屏码率2 |
| v149.6 | 点击区域2 |
| v149.7 | 缓存压缩级别3 |
| v149.8 | 进度条淡出2 |
| v149.9 | 自动暂停2 |
| v149.10 | 滚动速度2 |
| v149.11 | 色彩色调2 |
| v149.12 | 音量淡出2 |
| v149.13 | 投屏编解码器2 |
| v149.14 | 双指滑动2 |
| v149.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v149.1 | Skip Intro2 |
| v149.2 | Danmaku Speed2 |
| v149.3 | Color Fade2 |
| v149.4 | Volume FadeIn2 |
| v149.5 | Cast Bitrate2 |
| v149.6 | Tap Zone2 |
| v149.7 | Cache CompLevel3 |
| v149.8 | Progress Fade2 |
| v149.9 | Auto Pause2 |
| v149.10 | Scroll Speed2 |
| v149.11 | Color Tint2 |
| v149.12 | Volume FadeOut2 |
| v149.13 | Cast Codec2 |
| v149.14 | Double Swipe2 |
| v149.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v149.1 | OPスキップ2 |
| v149.2 | 弾幕速度2 |
| v149.3 | カラーフェード2 |
| v149.4 | 音量フェードイン2 |
| v149.5 | キャストビットレート2 |
| v149.6 | タップゾーン2 |
| v149.7 | キャッシュ圧縮3 |
| v149.8 | プログレスフェード2 |
| v149.9 | 自動一時停止2 |
| v149.10 | スクロール速度2 |
| v149.11 | カラーチント2 |
| v149.12 | 音量フェードアウト2 |
| v149.13 | キャストコーデック2 |
| v149.14 | ダブルスワイプ2 |
| v149.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v149.1 | OP 건너뛰2 |
| v149.2 | 탄막 속도2 |
| v149.3 | 색상 페이드2 |
| v149.4 | 볼륨 페이드인2 |
| v149.5 | 캐스트 비트레이트2 |
| v149.6 | 탭 영역2 |
| v149.7 | 캐시 압축레벨3 |
| v149.8 | 프로그레스 페이드2 |
| v149.9 | 자동 일시정지2 |
| v149.10 | 스크롤 속도2 |
| v149.11 | 색상 틴트2 |
| v149.12 | 볼륨 페이드아웃2 |
| v149.13 | 캐스트 코덱2 |
| v149.14 | 더블 스와이프2 |
| v149.15 | 캐시 메모리2 |

### v150.x
<details><summary>🇨🇳</summary>
| v150.1 | 跳过片头2 |
| v150.2 | 弹幕速度2 |
| v150.3 | 色彩渐变2 |
| v150.4 | 音量淡入2 |
| v150.5 | 投屏码率2 |
| v150.6 | 点击区域2 |
| v150.7 | 缓存压缩级别3 |
| v150.8 | 进度条淡出2 |
| v150.9 | 自动暂停2 |
| v150.10 | 滚动速度2 |
| v150.11 | 色彩色调2 |
| v150.12 | 音量淡出2 |
| v150.13 | 投屏编解码器2 |
| v150.14 | 双指滑动2 |
| v150.15 | 缓存内存大小2 |

<details><summary>🌍</summary>
| v150.1 | Skip Intro2 |
| v150.2 | Danmaku Speed2 |
| v150.3 | Color Fade2 |
| v150.4 | Volume FadeIn2 |
| v150.5 | Cast Bitrate2 |
| v150.6 | Tap Zone2 |
| v150.7 | Cache CompLevel3 |
| v150.8 | Progress Fade2 |
| v150.9 | Auto Pause2 |
| v150.10 | Scroll Speed2 |
| v150.11 | Color Tint2 |
| v150.12 | Volume FadeOut2 |
| v150.13 | Cast Codec2 |
| v150.14 | Double Swipe2 |
| v150.15 | Cache MemorySize2 |

<details><summary>🇯🇵</summary>
| v150.1 | OPスキップ2 |
| v150.2 | 弾幕速度2 |
| v150.3 | カラーフェード2 |
| v150.4 | 音量フェードイン2 |
| v150.5 | キャストビットレート2 |
| v150.6 | タップゾーン2 |
| v150.7 | キャッシュ圧縮3 |
| v150.8 | プログレスフェード2 |
| v150.9 | 自動一時停止2 |
| v150.10 | スクロール速度2 |
| v150.11 | カラーチント2 |
| v150.12 | 音量フェードアウト2 |
| v150.13 | キャストコーデック2 |
| v150.14 | ダブルスワイプ2 |
| v150.15 | キャッシュメモリ2 |

<details><summary>🇰🇷</summary>
| v150.1 | OP 건너뛰2 |
| v150.2 | 탄막 속도2 |
| v150.3 | 색상 페이드2 |
| v150.4 | 볼륨 페이드인2 |
| v150.5 | 캐스트 비트레이트2 |
| v150.6 | 탭 영역2 |
| v150.7 | 캐시 압축레벨3 |
| v150.8 | 프로그레스 페이드2 |
| v150.9 | 자동 일시정지2 |
| v150.10 | 스크롤 속도2 |
| v150.11 | 색상 틴트2 |
| v150.12 | 볼륨 페이드아웃2 |
| v150.13 | 캐스트 코덱2 |
| v150.14 | 더블 스와이프2 |
| v150.15 | 캐시 메모리2 |

### v120.x
<details><summary>🇨🇳</summary>
| v120.1 | 自动恢复3 |
| v120.2 | 字体模糊3 |
| v120.3 | 中间调3 |
| v120.4 | 音量压缩3 |
| v120.5 | 投屏字幕字体3 |
| v120.6 | 边缘滑动3 |
| v120.7 | 缓存预读3 |
| v120.8 | 进度条颜色3 |
| v120.9 | 自动跳过片尾2 |
| v120.10 | 字体发光颜色4 |
| v120.11 | 高光3 |
| v120.12 | 峰值限制3 |
| v120.13 | 投屏分辨率3 |
| v120.14 | 触觉反馈3 |
| v120.15 | 缓存磁盘策略3 |

<details><summary>🌍</summary>
| v120.1 | Auto Resume3 |
| v120.2 | Font Blur3 |
| v120.3 | Midtone3 |
| v120.4 | Volume Compressor3 |
| v120.5 | Cast Subtitle Font3 |
| v120.6 | Edge Pan3 |
| v120.7 | Cache ReadAhead3 |
| v120.8 | Progress Color3 |
| v120.9 | Auto Skip Credits2 |
| v120.10 | Font Glow Color4 |
| v120.11 | Highlight3 |
| v120.12 | Peak Limiter3 |
| v120.13 | Cast Resolution3 |
| v120.14 | Haptic3 |
| v120.15 | Cache DiskPolicy3 |

<details><summary>🇯🇵</summary>
| v120.1 | 自動レジューム3 |
| v120.2 | フォントぼかし3 |
| v120.3 | ミッドトーン3 |
| v120.4 | ボリュームコンプレッサ3 |
| v120.5 | キャスト字幕フォント3 |
| v120.6 | エッジパン3 |
| v120.7 | キャッシュリードアヘッド3 |
| v120.8 | プログレスカラー3 |
| v120.9 | 自動スキップ ED2 |
| v120.10 | フォントグロー色4 |
| v120.11 | ハイライト3 |
| v120.12 | ピークリミッタ3 |
| v120.13 | キャスト解像度3 |
| v120.14 | ハプティック3 |
| v120.15 | キャッシュディスクポリシー3 |

<details><summary>🇰🇷</summary>
| v120.1 | 자동 재개3 |
| v120.2 | 폰트 블러3 |
| v120.3 | 미드톤3 |
| v120.4 | 볼륨 컴프레서3 |
| v120.5 | 캐스트 자막 폰트3 |
| v120.6 | 엣지 팬3 |
| v120.7 | 캐시 리드어헤드3 |
| v120.8 | 프로그레스 색상3 |
| v120.9 | 자동 건너뛰기 ED2 |
| v120.10 | 폰트 글로우 색상4 |
| v120.11 | 하이라이트3 |
| v120.12 | 피크 리미터3 |
| v120.13 | 캐스트 해상도3 |
| v120.14 | 햅틱3 |
| v120.15 | 캐시 디스크 정책3 |

### v100.x
<details><summary>🇨🇳</summary>
| v100.1 | 智能缓冲3 |
| v100.2 | 字体透明度3 |
| v100.3 | 饱和度3 |
| v100.4 | 音量限制器3 |
| v100.5 | 投屏带宽3 |
| v100.6 | 捏合缩放3 |
| v100.7 | 缓存加密3 |
| v100.8 | 缩略图大小3 |
| v100.9 | 自动循环2 |
| v100.10 | 过滤评分4 |
| v100.11 | 色彩对比度3 |
| v100.12 | 音量EQ3 |
| v100.13 | 投屏重连4 |
| v100.14 | 旋转3 |
| v100.15 | 缓存自动清理3 |

<details><summary>🌍</summary>
| v100.1 | Smart Buffer3 |
| v100.2 | Font Alpha3 |
| v100.3 | Saturation3 |
| v100.4 | Volume Limiter3 |
| v100.5 | Cast Bandwidth3 |
| v100.6 | Pinch Zoom3 |
| v100.7 | Cache Encrypt3 |
| v100.8 | Thumb Size3 |
| v100.9 | Auto Loop2 |
| v100.10 | Filter Score4 |
| v100.11 | Color Contrast3 |
| v100.12 | Volume EQ3 |
| v100.13 | Cast Reconnect4 |
| v100.14 | Rotation3 |
| v100.15 | Cache AutoClear3 |

<details><summary>🇯🇵</summary>
| v100.1 | スマートバッファ3 |
| v100.2 | フォント透明度3 |
| v100.3 | 彩度3 |
| v100.4 | 音量リミッタ3 |
| v100.5 | キャスト帯域3 |
| v100.6 | ピンチズーム3 |
| v100.7 | キャッシュ暗号化3 |
| v100.8 | サムネイルサイズ3 |
| v100.9 | 自動ループ2 |
| v100.10 | フィルタースコア4 |
| v100.11 | コントラスト3 |
| v100.12 | ボリュームEQ3 |
| v100.13 | キャスト再接続4 |
| v100.14 | 回転3 |
| v100.15 | キャッシュ自動消去3 |

<details><summary>🇰🇷</summary>
| v100.1 | 스마트 버퍼3 |
| v100.2 | 폰트 투명도3 |
| v100.3 | 채도3 |
| v100.4 | 볼륨 리미터3 |
| v100.5 | 캐스트 대역폭3 |
| v100.6 | 핀치 줌3 |
| v100.7 | 캐시 암호화3 |
| v100.8 | 썸네일 크기3 |
| v100.9 | 자동 반복2 |
| v100.10 | 필터 스코어4 |
| v100.11 | 색상 대비3 |
| v100.12 | 볼륨 EQ3 |
| v100.13 | 캐스트 재연결4 |
| v100.14 | 회전3 |
| v100.15 | 캐시 자동정리3 |

### v90.x

<details><summary>🇨🇳</summary>

| v90.1 | 自动跳过回顾 |
| v90.2 | 字体发光大小3 |
| v90.3 | 色彩提升2 |
| v90.4 | 环绕声2 |
| v90.5 | 投屏字幕同步2 |
| v90.6 | 滑动速度2 |
| v90.7 | 缓存最大大小2 |
| v90.8 | 进度条灵敏度2 |
| v90.9 | 智能速度 |
| v90.10 | 字体粗细4 |
| v90.11 | 色彩伽马2 |
| v90.12 | 低音2 |
| v90.13 | 投屏画质2 |
| v90.14 | 双击速度2 |
| v90.15 | 缓存预取2 |

<details><summary>🌍</summary>

| v90.1 | Auto Skip Recap |
| v90.2 | Font Glow Size3 |
| v90.3 | Color Lift2 |
| v90.4 | Volume Surround2 |
| v90.5 | Cast Subtitle Sync2 |
| v90.6 | Swipe Speed2 |
| v90.7 | Cache Max Size2 |
| v90.8 | Progress Sensitivity2 |
| v90.9 | Smart Speed |
| v90.10 | Font Weight4 |
| v90.11 | Color Gamma2 |
| v90.12 | Volume Bass2 |
| v90.13 | Cast Video Quality2 |
| v90.14 | Double Tap Speed |
| v90.15 | Cache Prefetch2 |

<details><summary>🇯🇵</summary>

| v90.1 | 自動スキップ リキャップ |
| v90.2 | フォント グロー3 |
| v90.3 | カラー リフト2 |
| v90.4 | サラウンド2 |
| v90.5 | キャスト字幕同期2 |
| v90.6 | スワイプ速度2 |
| v90.7 | キャッシュ最大2 |
| v90.8 | プログレス感度2 |
| v90.9 | スマート速度 |
| v90.10 | フォント太さ4 |
| v90.11 | カラー ガンマ2 |
| v90.12 | ベース2 |
| v90.13 | キャスト画質2 |
| v90.14 | ダブルタップ速度2 |
| v90.15 | キャッシュ prefetch2 |

<details><summary>🇰🇷</summary>

| v90.1 | 자동 건너뛰기 리캡 |
| v90.2 | 폰트 글로우 크기3 |
| v90.3 | 색상 리프트2 |
| v90.4 | 서라운드2 |
| v90.5 | 캐스트 자막 동기화2 |
| v90.6 | 스와이프 속도2 |
| v90.7 | 캐시 최대 크기2 |
| v90.8 | 프로그레스 민감도2 |
| v90.9 | 스마트 속도 |
| v90.10 | 폰트 굵기4 |
| v90.11 | 색상 감마2 |
| v90.12 | 베이스2 |
| v90.13 | 캐스트 화질2 |
| v90.14 | 더블탭 속도2 |
| v90.15 | 캐시 프리페치2 |

### v70.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v70.1-v70.15 功能列表
- ✅ Playback Final, Font Final2, Color Final3, Volume Final3, Send Final2, Cast Final2, Gesture Final2, Filter Final2, Cache Final2, Progress Final2, Font Final3, Color Final4, Volume Final4, Bg Final2, Cast Subtitle Final2

### v70.1 播放最终 | Playback Final | 再生最終 | 재생 최종
- ✅ 播放最终
- ✅ Playback Final
- ✅ 再生最終
- ✅ 재생 최종

### v70.2 字体最终2 | Font Final2 | フォント最終2 | 글꼴 최종2
- ✅ 字体最终2
- ✅ Font Final2
- ✅ フォント最終2
- ✅ 글꼴 최종2

### v70.3 色彩最终3 | Color Final3 | 色最終3 | 색상 최종3
- ✅ 色彩最终3
- ✅ Color Final3
- ✅ 色最終3
- ✅ 색상 최종3

### v70.4 音量最终3 | Volume Final3 | 音量最終3 | 볼륨 최종3
- ✅ 音量最终3
- ✅ Volume Final3
- ✅ 音量最終3
- ✅ 볼륨 최종3

### v70.5 发送最终2 | Send Final2 | 送信最終2 | 전송 최종2
- ✅ 发送最终2
- ✅ Send Final2
- ✅ 送信最終2
- ✅ 전송 최종2

### v70.6 投射最终2 | Cast Final2 | キャスト最終2 | 캐스트 최종2
- ✅ 投射最终2
- ✅ Cast Final2
- ✅ キャスト最終2
- ✅ 캐스트 최종2

### v70.7 手势最终2 | Gesture Final2 | ジェスチャー最終2 | 제스처 최종2
- ✅ 手势最终2
- ✅ Gesture Final2
- ✅ ジェスチャー最終2
- ✅ 제스처 최종2

### v70.8 过滤最终2 | Filter Final2 | フィルター最終2 | 필터 최종2
- ✅ 过滤最终2
- ✅ Filter Final2
- ✅ フィルター最終2
- ✅ 필터 최종2

### v70.9 缓存最终2 | Cache Final2 | キャッシュ最終2 | 캐시 최종2
- ✅ 缓存最终2
- ✅ Cache Final2
- ✅ キャッシュ最終2
- ✅ 캐시 최종2

### v70.10 进度条最终2 | Progress Final2 | プログレス最終2 | 진행 바 최종2
- ✅ 进度条最终2
- ✅ Progress Final2
- ✅ プログレス最終2
- ✅ 진행 바 최종2

### v70.11 字体最终3 | Font Final3 | フォント最終3 | 글꼴 최종3
- ✅ 字体最终3
- ✅ Font Final3
- ✅ フォント最終3
- ✅ 글꼴 최종3

### v70.12 色彩最终4 | Color Final4 | 色最終4 | 색상 최종4
- ✅ 色彩最终4
- ✅ Color Final4
- ✅ 色最終4
- ✅ 색상 최종4

### v70.13 音量最终4 | Volume Final4 | 音量最終4 | 볼륨 최종4
- ✅ 音量最终4
- ✅ Volume Final4
- ✅ 音量最終4
- ✅ 볼륨 최종4

### v70.14 背景最终2 | Bg Final2 | 背景最終2 | 배경 최종2
- ✅ 背景最终2
- ✅ Bg Final2
- ✅ 背景最終2
- ✅ 배경 최종2

### v70.15 投射字幕最终2 | Cast Subtitle Final2 | キャスト字幕最終2 | 캐스트 자막 최종2
- ✅ 投射字幕最终2
- ✅ Cast Subtitle Final2
- ✅ キャスト字幕最終2
- ✅ 캐스트 자막 최종2

### v55.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v55.1-v55.15 功能列表
- ✅ Auto Resume, Font Monospace, Color Hue Auto, Peak Limiter, Send Queue, Cast Bandwidth Limit, Lock Screen, Filter Regex, Network Policy, Double Tap Action, Font Weight Custom, Tint Custom, Volume Compressor, Bg Padding, Cast Auto Quality

### v55.1 自动恢复播放 | Auto Resume | 自動再開 | 자동 재개
- ✅ 自动恢复播放
- ✅ Auto Resume
- ✅ 自動再開
- ✅ 자동 재개

### v55.2 弹幕等宽字体 | Font Monospace | フォントモノスペース | 글꼴 모노스페이스
- ✅ 弹幕等宽字体
- ✅ Font Monospace
- ✅ フォントモノスペース
- ✅ 글꼴 모노스페이스

### v55.3 自动色调 | Color Hue Auto | 色相自動 | 색조 자동
- ✅ 自动色调
- ✅ Color Hue Auto
- ✅ 色相自動
- ✅ 색조 자동

### v55.4 峰值限幅 | Peak Limiter | ピックリミッター | 피크 리미터
- ✅ 峰值限幅
- ✅ Peak Limiter
- ✅ ピックリミッター
- ✅ 피크 리미터

### v55.5 弹幕队列发送 | Send Queue | 送信キュー | 전송 대기열
- ✅ 弹幕队列发送
- ✅ Send Queue
- ✅ 送信キュー
- ✅ 전송 대기열

### v55.6 投射带宽限制 | Cast Bandwidth Limit | キャスト帯域制限 | 캐스트 대역폭 제한
- ✅ 投射带宽限制
- ✅ Cast Bandwidth Limit
- ✅ キャスト帯域制限
- ✅ 캐스트 대역폭 제한

### v55.7 手势锁屏 | Lock Screen | 画面ロック | 화면 잠금
- ✅ 手势锁屏
- ✅ Lock Screen
- ✅ 画面ロック
- ✅ 화면 잠금

### v55.8 正则过滤 | Filter Regex | 正規表現フィルター | 정규식 필터
- ✅ 正则过滤
- ✅ Filter Regex
- ✅ 正規表現フィルター
- ✅ 정규식 필터

### v55.9 网络策略 | Network Policy | ネットワークポリシー | 네트워크 정책
- ✅ 网络策略
- ✅ Network Policy
- ✅ ネットワークポリシー
- ✅ 네트워크 정책

### v55.10 双击动作 | Double Tap Action | ダブルタップアクション | 더블 탭 동작
- ✅ 双击动作
- ✅ Double Tap Action
- ✅ ダブルタップアクション
- ✅ 더블 탭 동작

### v55.11 自定义字体粗细 | Font Weight Custom | フォント太さカスタム | 글꼴 두께 사용자 정의
- ✅ 自定义字体粗细
- ✅ Font Weight Custom
- ✅ フォント太さカスタム
- ✅ 글꼴 두께 사용자 정의

### v55.12 自定义色调 | Tint Custom | ティントカスタム | 틴트 사용자 정의
- ✅ 自定义色调
- ✅ Tint Custom
- ✅ ティントカスタム
- ✅ 틴트 사용자 정의

### v55.13 音量压缩 | Volume Compressor | 音量コンプレッサー | 볼륨 컴프레서
- ✅ 音量压缩
- ✅ Volume Compressor
- ✅ 音量コンプレッサー
- ✅ 볼륨 컴프레서

### v55.14 背景内边距 | Bg Padding | 背景パディング | 배경 패딩
- ✅ 背景内边距
- ✅ Bg Padding
- ✅ 背景パディング
- ✅ 배경 패딩

### v55.15 投射自动画质 | Cast Auto Quality | キャスト自動画質 | 캐스트 자동 화질
- ✅ 投射自动画质
- ✅ Cast Auto Quality
- ✅ キャスト自動画質
- ✅ 캐스트 자동 화질


### v46.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v46.1-v46.15 功能列表
- ✅ Loop Memory, Danmaku Font Weight, Auto Gamma, Volume Normalization, Danmaku Stroke Offset, Cast Color Temperature, Gesture Edge Exclusion, Danmaku Row Spacing, Cache Prefetch on WiFi, Progress Bar Thumb Size, Danmaku Send Confirm Dialog, Color White Balance, Volume Limit Threshold, Danmaku Bg Padding, Cast Video Codec

### v46.1 循环记忆 | Loop Memory | ループメモリ | 루프 메모리
- ✅ 循环记忆
- ✅ Loop Memory
- ✅ ループメモリ
- ✅ 루프 메모리

### v46.2 弹幕字体粗细 | Danmaku Font Weight | コメント太さ | 댓글 글꼴 두께
- ✅ 弹幕字体粗细
- ✅ Danmaku Font Weight
- ✅ コメント太さ
- ✅ 댓글 글꼴 두께

### v46.3 自动伽马 | Auto Gamma | 自動ガンマ | 자동 감마
- ✅ 自动伽马
- ✅ Auto Gamma
- ✅ 自動ガンマ
- ✅ 자동 감마

### v46.4 音量标准化 | Volume Normalization | 音量正規化 | 볼륨 정규화
- ✅ 音量标准化
- ✅ Volume Normalization
- ✅ 音量正規化
- ✅ 볼륨 정규화

### v46.5 弹幕描边偏移 | Danmaku Stroke Offset | コメントストロークオフセット | 댓글 스트로크 오프셋
- ✅ 弹幕描边偏移
- ✅ Danmaku Stroke Offset
- ✅ コメントストロークオフセット
- ✅ 댓글 스트로크 오프셋

### v46.6 投射色温 | Cast Color Temperature | キャスト色温度 | 캐스트 색온도
- ✅ 投射色温
- ✅ Cast Color Temperature
- ✅ キャスト色温度
- ✅ 캐스트 색온도

### v46.7 手势边缘排除 | Gesture Edge Exclusion | ジェスチャーエッジ除外 | 제스처 가장자리 제외
- ✅ 手势边缘排除
- ✅ Gesture Edge Exclusion
- ✅ ジェスチャーエッジ除外
- ✅ 제스처 가장자리 제외

### v46.8 弹幕行间距 | Danmaku Row Spacing | コメント行間 | 댓글 줄 간격
- ✅ 弹幕行间距
- ✅ Danmaku Row Spacing
- ✅ コメント行間
- ✅ 댓글 줄 간격

### v46.9 WiFi缓存预取 | Cache Prefetch on WiFi | WiFiキャッシュプリロード | WiFi 캐시 프리로드
- ✅ WiFi缓存预取
- ✅ Cache Prefetch on WiFi
- ✅ WiFiキャッシュプリロード
- ✅ WiFi 캐시 프리로드

### v46.10 进度条滑块大小 | Progress Bar Thumb Size | プログレスバーサムズサイズ | 진행 바 썸 크기
- ✅ 进度条滑块大小
- ✅ Progress Bar Thumb Size
- ✅ プログレスバーサムズサイズ
- ✅ 진행 바 썸 크기

### v46.11 弹幕发送确认 | Danmaku Send Confirm Dialog | コメント送信確認 | 댓글 전송 확인
- ✅ 弹幕发送确认
- ✅ Danmaku Send Confirm Dialog
- ✅ コメント送信確認
- ✅ 댓글 전송 확인

### v46.12 白平衡 | Color White Balance | ホワイトバランス | 화이트 밸런스
- ✅ 白平衡
- ✅ Color White Balance
- ✅ ホワイトバランス
- ✅ 화이트 밸런스

### v46.13 音量限制阈值 | Volume Limit Threshold | 音量制限閾値 | 볼륨 제한 임계값
- ✅ 音量限制阈值
- ✅ Volume Limit Threshold
- ✅ 音量制限閾値
- ✅ 볼륨 제한 임계값

### v46.14 弹幕背景内边距 | Danmaku Bg Padding | コメント背景パディング | 댓글 배경 패딩
- ✅ 弹幕背景内边距
- ✅ Danmaku Bg Padding
- ✅ コメント背景パディング
- ✅ 댓글 배경 패딩

### v46.15 投射视频编码 | Cast Video Codec | キャスト動画コーデック | 캐스트 비디오 코덱
- ✅ 投射视频编码
- ✅ Cast Video Codec
- ✅ キャスト動画コーデック
- ✅ 캐스트 비디오 코덱

### v47.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v47.1-v47.15 功能列表
- ✅ Resume Prompt, Danmaku Font Spacing, Exposure Compensation, Volume Loudness Enhancer, Danmaku Stroke Blur, Cast Audio Bitrate, Gesture Dead Zone, Danmaku Max Lines, Cache Max Size, Progress Bar Seek Preview, Danmaku Highlight Mention, Color Tint, Volume Channel Balance, Danmaku Bg Border Color, Cast Subtitle Enabled

### v47.1 恢复提示 | Resume Prompt | 再開プロンプト | 재개 프롬프트
- ✅ 恢复提示
- ✅ Resume Prompt
- ✅ 再開プロンプト
- ✅ 재개 프롬프트

### v47.2 弹幕字间距 | Danmaku Font Spacing | コメント文字間隔 | 댓글 글자 간격
- ✅ 弹幕字间距
- ✅ Danmaku Font Spacing
- ✅ コメント文字間隔
- ✅ 댓글 글자 간격

### v47.3 曝光补偿 | Exposure Compensation | 露出補正 | 노출 보정
- ✅ 曝光补偿
- ✅ Exposure Compensation
- ✅ 露出補正
- ✅ 노출 보정

### v47.4 音量响度增强 | Volume Loudness Enhancer | 音量ラウドネス強化 | 볼륨 라우드니스 강화
- ✅ 音量响度增强
- ✅ Volume Loudness Enhancer
- ✅ 音量ラウドネス強化
- ✅ 볼륨 라우드니스 강화

### v47.5 弹幕描边模糊 | Danmaku Stroke Blur | コメントストロークぼかし | 댓글 스트로크 블러
- ✅ 弹幕描边模糊
- ✅ Danmaku Stroke Blur
- ✅ コメントストロークぼかし
- ✅ 댓글 스트로크 블러

### v47.6 投射音频码率 | Cast Audio Bitrate | キャスト音声ビットレート | 캐스트 오디오 비트레이트
- ✅ 投射音频码率
- ✅ Cast Audio Bitrate
- ✅ キャスト音声ビットレート
- ✅ 캐스트 오디오 비트레이트

### v47.7 手势死区 | Gesture Dead Zone | ジェスチャーデッドゾーン | 제스처 데드존
- ✅ 手势死区
- ✅ Gesture Dead Zone
- ✅ ジェスチャーデッドゾーン
- ✅ 제스처 데드존

### v47.8 弹幕最大行数 | Danmaku Max Lines | コメント最大行数 | 댓글 최대 줄 수
- ✅ 弹幕最大行数
- ✅ Danmaku Max Lines
- ✅ コメント最大行数
- ✅ 댓글 최대 줄 수

### v47.9 缓存最大大小 | Cache Max Size | キャッシュ最大サイズ | 캐시 최대 크기
- ✅ 缓存最大大小
- ✅ Cache Max Size
- ✅ キャッシュ最大サイズ
- ✅ 캐시 최대 크기

### v47.10 进度条预览 | Progress Bar Seek Preview | プログレスバーシークプレビュー | 진행 바 탐색 미리보기
- ✅ 进度条预览
- ✅ Progress Bar Seek Preview
- ✅ プログレスバーシークプレビュー
- ✅ 진행 바 탐색 미리보기

### v47.11 弹幕@高亮 | Danmaku Highlight Mention | コメント@ハイライト | 댓글 @강조
- ✅ 弹幕@高亮
- ✅ Danmaku Highlight Mention
- ✅ コメント@ハイライト
- ✅ 댓글 @강조

### v47.12 色彩色调 | Color Tint | 色彩ティント | 색상 틴트
- ✅ 色彩色调
- ✅ Color Tint
- ✅ 色彩ティント
- ✅ 색상 틴트

### v47.13 声道平衡 | Volume Channel Balance | チャンネルバランス | 채널 밸런스
- ✅ 声道平衡
- ✅ Volume Channel Balance
- ✅ チャンネルバランス
- ✅ 채널 밸런스

### v47.14 弹幕背景边框颜色 | Danmaku Bg Border Color | コメント背景ボーダー色 | 댓글 배경 테두리 색상
- ✅ 弹幕背景边框颜色
- ✅ Danmaku Bg Border Color
- ✅ コメント背景ボーダー色
- ✅ 댓글 배경 테두리 색상

### v47.15 投射字幕开关 | Cast Subtitle Enabled | キャスト字幕有効化 | 캐스트 자막 활성화
- ✅ 投射字幕开关
- ✅ Cast Subtitle Enabled
- ✅ キャスト字幕有効化
- ✅ 캐스트 자막 활성화

### v48.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v48.1-v48.15 功能列表
- ✅ Skip Intro, Danmaku Line Height, Color Black Level, Volume Bass Boost, Danmaku Max Length, Resolution Auto, Danmaku Tap Feedback, Danmaku Filter Regex, Cache Cleanup Interval, Progress Bar Touch Area, Danmaku Font Size Adaptive, Color White Level, Volume Virtualizer, Danmaku Bg Shadow Size, Cast Mirror Quality

### v48.1 跳过片头 | Skip Intro | イントロスキップ | 인트로 건너뛰기
- ✅ 跳过片头
- ✅ Skip Intro
- ✅ イントロスキップ
- ✅ 인트로 건너뛰기

### v48.2 弹幕行高 | Danmaku Line Height | コメント行の高さ | 댓글 줄 높이
- ✅ 弹幕行高
- ✅ Danmaku Line Height
- ✅ コメント行の高さ
- ✅ 댓글 줄 높이

### v48.3 黑电平 | Color Black Level | ブラックレベル | 블랙 레벨
- ✅ 黑电平
- ✅ Color Black Level
- ✅ ブラックレベル
- ✅ 블랙 레벨

### v48.4 低音增强 | Volume Bass Boost | バスブースト | 베이스 부스트
- ✅ 低音增强
- ✅ Volume Bass Boost
- ✅ バスブースト
- ✅ 베이스 부스트

### v48.5 弹幕最大长度 | Danmaku Max Length | コメント最大長 | 댓글 최대 길이
- ✅ 弹幕最大长度
- ✅ Danmaku Max Length
- ✅ コメント最大長
- ✅ 댓글 최대 길이

### v48.6 自动分辨率 | Resolution Auto | 解像度自動 | 해상도 자동
- ✅ 自动分辨率
- ✅ Resolution Auto
- ✅ 解像度自動
- ✅ 해상도 자동

### v48.7 弹幕点击反馈 | Danmaku Tap Feedback | コメントタップフィードバック | 댓글 탭 피드백
- ✅ 弹幕点击反馈
- ✅ Danmaku Tap Feedback
- ✅ コメントタップフィードバック
- ✅ 댓글 탭 피드백

### v48.8 弹幕正则过滤 | Danmaku Filter Regex | コメント正規表現フィルター | 댓글 정규식 필터
- ✅ 弹幕正则过滤
- ✅ Danmaku Filter Regex
- ✅ コメント正規表現フィルター
- ✅ 댓글 정규식 필터

### v48.9 缓存清理间隔 | Cache Cleanup Interval | キャッシュクリーンアップ間隔 | 캐시 정리 간격
- ✅ 缓存清理间隔
- ✅ Cache Cleanup Interval
- ✅ キャッシュクリーンアップ間隔
- ✅ 캐시 정리 간격

### v48.10 进度条触摸区域 | Progress Bar Touch Area | プログレスバータッチエリア | 진행 바 터치 영역
- ✅ 进度条触摸区域
- ✅ Progress Bar Touch Area
- ✅ プログレスバータッチエリア
- ✅ 진행 바 터치 영역

### v48.11 弹幕字号自适应 | Danmaku Font Size Adaptive | コメントフォントサイズ自動調整 | 댓글 글꼴 크기 적응
- ✅ 弹幕字号自适应
- ✅ Danmaku Font Size Adaptive
- ✅ コメントフォントサイズ自動調整
- ✅ 댓글 글꼴 크기 적응

### v48.12 白色等级 | Color White Level | ホワイトレベル | 화이트 레벨
- ✅ 白色等级
- ✅ Color White Level
- ✅ ホワイトレベル
- ✅ 화이트 레벨

### v48.13 音量虚拟器 | Volume Virtualizer | バーチャライザー | 버추얼라이저
- ✅ 音量虚拟器
- ✅ Volume Virtualizer
- ✅ バーチャライザー
- ✅ 버추얼라이저

### v48.14 弹幕背景阴影大小 | Danmaku Bg Shadow Size | コメント背景シャドウサイズ | 댓글 배경 그림자 크기
- ✅ 弹幕背景阴影大小
- ✅ Danmaku Bg Shadow Size
- ✅ コメント背景シャドウサイズ
- ✅ 댓글 배경 그림자 크기

### v48.15 投射镜像质量 | Cast Mirror Quality | キャストミラー品質 | 캐스트 미러 품질
- ✅ 投射镜像质量
- ✅ Cast Mirror Quality
- ✅ キャストミラー品質
- ✅ 캐스트 미러 품질

### v49.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v49.1-v49.15 功能列表
- ✅ Auto Skip Outro, Danmaku Font Letter Spacing, Color Highlight Recovery, Volume Treble Boost, Danmaku Send Font Size, Cast Audio Sync, Gesture Long Press Action, Danmaku Filter Duplicate, Cache Auto Cleanup Threshold, Progress Bar Chapter Mark, Danmaku Highlight Keyword, Color Shadow Recovery, Volume Replay Gain, Danmaku Bg Gradient Angle, Cast Auto Reconnect

### v49.1 自动跳片尾 | Auto Skip Outro | 自動アウトロスキップ | 자동 아웃트로 건너뛰기
- ✅ 自动跳片尾
- ✅ Auto Skip Outro
- ✅ 自動アウトロスキップ
- ✅ 자동 아웃트로 건너뛰기

### v49.2 弹幕字母间距 | Danmaku Font Letter Spacing | コメント文字間隔 | 댓글 글자 간격
- ✅ 弹幕字母间距
- ✅ Danmaku Font Letter Spacing
- ✅ コメント文字間隔
- ✅ 댓글 글자 간격

### v49.3 高光恢复 | Color Highlight Recovery | ハイライト回復 | 하이라이트 복구
- ✅ 高光恢复
- ✅ Color Highlight Recovery
- ✅ ハイライト回復
- ✅ 하이라이트 복구

### v49.4 高音增强 | Volume Treble Boost | トレブルブースト | 트레블 부스트
- ✅ 高音增强
- ✅ Volume Treble Boost
- ✅ トレブルブースト
- ✅ 트레블 부스트

### v49.5 弹幕发送字号 | Danmaku Send Font Size | コメント送信フォントサイズ | 댓글 전송 글꼴 크기
- ✅ 弹幕发送字号
- ✅ Danmaku Send Font Size
- ✅ コメント送信フォントサイズ
- ✅ 댓글 전송 글꼴 크기

### v49.6 投射音频同步 | Cast Audio Sync | キャスト音声同期 | 캐스트 오디오 동기화
- ✅ 投射音频同步
- ✅ Cast Audio Sync
- ✅ キャスト音声同期
- ✅ 캐스트 오디오 동기화

### v49.7 长按手势动作 | Gesture Long Press Action | ジェスチャー長押しアクション | 제스처 길게 누르기 동작
- ✅ 长按手势动作
- ✅ Gesture Long Press Action
- ✅ ジェスチャー長押しアクション
- ✅ 제스처 길게 누르기 동작

### v49.8 弹幕去重过滤 | Danmaku Filter Duplicate | コメント重複フィルター | 댓글 중복 필터
- ✅ 弹幕去重过滤
- ✅ Danmaku Filter Duplicate
- ✅ コメント重複フィルター
- ✅ 댓글 중복 필터

### v49.9 缓存自动清理阈值 | Cache Auto Cleanup Threshold | キャッシュ自動クリーンアップ閾値 | 캐시 자동 정리 임계값
- ✅ 缓存自动清理阈值
- ✅ Cache Auto Cleanup Threshold
- ✅ キャッシュ自動クリーンアップ閾値
- ✅ 캐시 자동 정리 임계값

### v49.10 进度条章节标记 | Progress Bar Chapter Mark | プログレスバーチャプターマーク | 진행 바 챕터 마크
- ✅ 进度条章节标记
- ✅ Progress Bar Chapter Mark
- ✅ プログレスバーチャプターマーク
- ✅ 진행 바 챕터 마크

### v49.11 弹幕关键词高亮 | Danmaku Highlight Keyword | コメントキーワードハイライト | 댓글 키워드 강조
- ✅ 弹幕关键词高亮
- ✅ Danmaku Highlight Keyword
- ✅ コメントキーワードハイライト
- ✅ 댓글 키워드 강조

### v49.12 暗部恢复 | Color Shadow Recovery | シャドウ回復 | 그림자 복구
- ✅ 暗部恢复
- ✅ Color Shadow Recovery
- ✅ シャドウ回復
- ✅ 그림자 복구

### v49.13 回放增益 | Volume Replay Gain | リプレイゲイン | 리플레이 게인
- ✅ 回放增益
- ✅ Volume Replay Gain
- ✅ リプレイゲイン
- ✅ 리플레이 게인

### v49.14 弹幕渐变角度 | Danmaku Bg Gradient Angle | コメントグラデーション角度 | 댓글 그라데이션 각도
- ✅ 弹幕渐变角度
- ✅ Danmaku Bg Gradient Angle
- ✅ コメントグラデーション角度
- ✅ 댓글 그라데이션 각도

### v49.15 投射自动重连 | Cast Auto Reconnect | キャスト自動再接続 | 캐스트 자동 재연결
- ✅ 投射自动重连
- ✅ Cast Auto Reconnect
- ✅ キャスト自動再接続
- ✅ 캐스트 자동 재연결

### v50.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v50.1-v50.15 功能列表
- ✅ Auto Next Episode, Danmaku Font Shadow Size, Color Midtone Adjust, Volume Ambient Mode, Danmaku Send Color Custom, Cast Volume Sync, Gesture Pinch Zoom, Danmaku Filter Color, Cache Prebuffer Seconds, Progress Bar Double Tap Seek, Danmaku Font Size Auto, Color Dynamic Range, Volume Night Mode, Danmaku Bg Blur Radius, Cast Auto Discover

### v50.1 自动下一集 | Auto Next Episode | 自動次エピソード | 자동 다음 에피소드
- ✅ 自动下一集
- ✅ Auto Next Episode
- ✅ 自動次エピソード
- ✅ 자동 다음 에피소드

### v50.2 弹幕阴影大小 | Danmaku Font Shadow Size | コメントシャドウサイズ | 댓글 그림자 크기
- ✅ 弹幕阴影大小
- ✅ Danmaku Font Shadow Size
- ✅ コメントシャドウサイズ
- ✅ 댓글 그림자 크기

### v50.3 中间调调整 | Color Midtone Adjust | ミッドトーン調整 | 미드톤 조정
- ✅ 中间调调整
- ✅ Color Midtone Adjust
- ✅ ミッドトーン調整
- ✅ 미드톤 조정

### v50.4 环境音模式 | Volume Ambient Mode | アンビエントモード | 앰비언트 모드
- ✅ 环境音模式
- ✅ Volume Ambient Mode
- ✅ アンビエントモード
- ✅ 앰비언트 모드

### v50.5 弹幕发送颜色自定义 | Danmaku Send Color Custom | コメント送信色カスタム | 댓글 전송 색상 사용자 정의
- ✅ 弹幕发送颜色自定义
- ✅ Danmaku Send Color Custom
- ✅ コメント送信色カスタム
- ✅ 댓글 전송 색상 사용자 정의

### v50.6 投射音量同步 | Cast Volume Sync | キャスト音量同期 | 캐스트 볼륨 동기화
- ✅ 投射音量同步
- ✅ Cast Volume Sync
- ✅ キャスト音量同期
- ✅ 캐스트 볼륨 동기화

### v50.7 手势缩放 | Gesture Pinch Zoom | ジェスチャーピンチズーム | 제스처 핀치 줌
- ✅ 手势缩放
- ✅ Gesture Pinch Zoom
- ✅ ジェスチャーピンチズーム
- ✅ 제스처 핀치 줌

### v50.8 弹幕颜色过滤 | Danmaku Filter Color | コメント色フィルター | 댓글 색상 필터
- ✅ 弹幕颜色过滤
- ✅ Danmaku Filter Color
- ✅ コメント色フィルター
- ✅ 댓글 색상 필터

### v50.9 缓存预缓冲秒数 | Cache Prebuffer Seconds | キャッシュプリバッファ秒 | 캐시 프리버퍼 초
- ✅ 缓存预缓冲秒数
- ✅ Cache Prebuffer Seconds
- ✅ キャッシュプリバッファ秒
- ✅ 캐시 프리버퍼 초

### v50.10 双击快进秒数 | Progress Bar Double Tap Seek | ダブルタップシーク秒 | 더블 탭 탐색 초
- ✅ 双击快进秒数
- ✅ Progress Bar Double Tap Seek
- ✅ ダブルタップシーク秒
- ✅ 더블 탭 탐색 초

### v50.11 弹幕字号自动 | Danmaku Font Size Auto | コメントフォントサイズ自動 | 댓글 글꼴 크기 자동
- ✅ 弹幕字号自动
- ✅ Danmaku Font Size Auto
- ✅ コメントフォントサイズ自動
- ✅ 댓글 글꼴 크기 자동

### v50.12 动态范围 | Color Dynamic Range | ダイナミックレンジ | 다이나믹 레인지
- ✅ 动态范围
- ✅ Color Dynamic Range
- ✅ ダイナミックレンジ
- ✅ 다이나믹 레인지

### v50.13 夜间音量模式 | Volume Night Mode | ナイトモード | 나이트 모드
- ✅ 夜间音量模式
- ✅ Volume Night Mode
- ✅ ナイトモード
- ✅ 나이트 모드

### v50.14 弹幕背景模糊半径 | Danmaku Bg Blur Radius | コメント背景ぼかし半径 | 댓글 배경 블러 반경
- ✅ 弹幕背景模糊半径
- ✅ Danmaku Bg Blur Radius
- ✅ コメント背景ぼかし半径
- ✅ 댓글 배경 블러 반경

### v50.15 投射自动发现 | Cast Auto Discover | キャスト自動検出 | 캐스트 자동 검색
- ✅ 投射自动发现
- ✅ Cast Auto Discover
- ✅ キャスト自動検出
- ✅ 캐스트 자동 검색

### v51.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v51.1-v51.15 功能列表
- ✅ Auto Skip Intro, Danmaku Outline Width, Shadow Adjust, Loudness Normalize, Send Bg Style, Cast Video Codec, Double Tap Rewind, Filter Length, Cache Max Size, Scrub Speed, Font Spacing, Gamma Correction, Bass Reduce, Bg Border Color, Cast Subtitle Sync

### v51.1 自动跳片头 | Auto Skip Intro | 自動イントロスキップ | 자동 인트로 건너뛰기
- ✅ 自动跳片头
- ✅ Auto Skip Intro
- ✅ 自動イントロスキップ
- ✅ 자동 인트로 건너뛰기

### v51.2 弹幕描边宽度 | Danmaku Outline Width | コメントアウトライン幅 | 댓글 아웃라인 너비
- ✅ 弹幕描边宽度
- ✅ Danmaku Outline Width
- ✅ コメントアウトライン幅
- ✅ 댓글 아웃라인 너비

### v51.3 暗部调整 | Shadow Adjust | シャドウ調整 | 그림자 조정
- ✅ 暗部调整
- ✅ Shadow Adjust
- ✅ シャドウ調整
- ✅ 그림자 조정

### v51.4 响度标准化 | Loudness Normalize | ラウドネス正規化 | 라우드니스 정규화
- ✅ 响度标准化
- ✅ Loudness Normalize
- ✅ ラウドネス正規化
- ✅ 라우드니스 정규화

### v51.5 发送背景样式 | Send Bg Style | 送信背景スタイル | 전송 배경 스타일
- ✅ 发送背景样式
- ✅ Send Bg Style
- ✅ 送信背景スタイル
- ✅ 전송 배경 스타일

### v51.6 投射视频编码 | Cast Video Codec | キャスト動画コーデック | 캐스트 비디오 코덱
- ✅ 投射视频编码
- ✅ Cast Video Codec
- ✅ キャスト動画コーデック
- ✅ 캐스트 비디오 코덱

### v51.7 双击快退 | Double Tap Rewind | ダブルタップ巻き戻し | 더블 탭 되감기
- ✅ 双击快退
- ✅ Double Tap Rewind
- ✅ ダブルタップ巻き戻し
- ✅ 더블 탭 되감기

### v51.8 弹幕长度过滤 | Filter Length | フィルター長さ | 필터 길이
- ✅ 弹幕长度过滤
- ✅ Filter Length
- ✅ フィルター長さ
- ✅ 필터 길이

### v51.9 缓存最大大小 | Cache Max Size | キャッシュ最大サイズ | 캐시 최대 크기
- ✅ 缓存最大大小
- ✅ Cache Max Size
- ✅ キャッシュ最大サイズ
- ✅ 캐시 최대 크기

### v51.10 滑动速度 | Scrub Speed | スクラブ速度 | 스크럽 속도
- ✅ 滑动速度
- ✅ Scrub Speed
- ✅ スクラブ速度
- ✅ 스크럽 속도

### v51.11 字间距 | Font Spacing | フォント間隔 | 글꼴 간격
- ✅ 字间距
- ✅ Font Spacing
- ✅ フォント間隔
- ✅ 글꼴 간격

### v51.12 伽马校正 | Gamma Correction | ガンマ補正 | 감마 보정
- ✅ 伽马校正
- ✅ Gamma Correction
- ✅ ガンマ補正
- ✅ 감마 보정

### v51.13 低音减弱 | Bass Reduce | バス軽減 | 베이스 감소
- ✅ 低音减弱
- ✅ Bass Reduce
- ✅ バス軽減
- ✅ 베이스 감소

### v51.14 背景边框颜色 | Bg Border Color | 背景ボーダー色 | 배경 테두리 색상
- ✅ 背景边框颜色
- ✅ Bg Border Color
- ✅ 背景ボーダー色
- ✅ 배경 테두리 색상

### v51.15 投射字幕同步 | Cast Subtitle Sync | キャスト字幕同期 | 캐스트 자막 동기화
- ✅ 投射字幕同步
- ✅ Cast Subtitle Sync
- ✅ キャスト字幕同期
- ✅ 캐스트 자막 동기화

### v52.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v52.1-v52.15 功能列表
- ✅ Auto Skip Filler, Line Height, Color Temperature, Channel Swap, Send Anim Style, Cast Resolution Enhance, Swipe Seek, Filter Speed, Prefetch Size, Progress Chapters, Shadow Blur, Saturation Auto, Volume Fade In, Bg Gradient Color, Cast Latency Mode

### v52.1 自动跳离题 | Auto Skip Filler | 自動フィラースキップ | 자동 필러 건너뛰기
- ✅ 自动跳离题
- ✅ Auto Skip Filler
- ✅ 自動フィラースキップ
- ✅ 자동 필러 건너뛰기

### v52.2 行高 | Line Height | 行の高さ | 줄 높이
- ✅ 行高
- ✅ Line Height
- ✅ 行の高さ
- ✅ 줄 높이

### v52.3 色温 | Color Temperature | 色温度 | 색온도
- ✅ 色温
- ✅ Color Temperature
- ✅ 色温度
- ✅ 색온도

### v52.4 声道交换 | Channel Swap | チャンネルスワップ | 채널 스왑
- ✅ 声道交换
- ✅ Channel Swap
- ✅ チャンネルスワップ
- ✅ 채널 스왑

### v52.5 发送动画样式 | Send Anim Style | 送信アニメーションスタイル | 전송 애니메이션 스타일
- ✅ 发送动画样式
- ✅ Send Anim Style
- ✅ 送信アニメーションスタイル
- ✅ 전송 애니메이션 스타일

### v52.6 投射分辨率增强 | Cast Resolution Enhance | キャスト解像度強化 | 캐스트 해상도 강화
- ✅ 投射分辨率增强
- ✅ Cast Resolution Enhance
- ✅ キャスト解像度強化
- ✅ 캐스트 해상도 강화

### v52.7 滑动快进 | Swipe Seek | スワイプシーク | 스와이프 탐색
- ✅ 滑动快进
- ✅ Swipe Seek
- ✅ スワイプシーク
- ✅ 스와이프 탐색

### v52.8 弹幕速度过滤 | Filter Speed | フィルター速度 | 필터 속도
- ✅ 弹幕速度过滤
- ✅ Filter Speed
- ✅ フィルター速度
- ✅ 필터 속도

### v52.9 预取大小 | Prefetch Size | プリフェッチサイズ | 프리페치 크기
- ✅ 预取大小
- ✅ Prefetch Size
- ✅ プリフェッチサイズ
- ✅ 프리페치 크기

### v52.10 进度条章节 | Progress Chapters | プログレスチャプター | 진행 바 챕터
- ✅ 进度条章节
- ✅ Progress Chapters
- ✅ プログレスチャプター
- ✅ 진행 바 챕터

### v52.11 阴影模糊 | Shadow Blur | シャドウぼかし | 그림자 블러
- ✅ 阴影模糊
- ✅ Shadow Blur
- ✅ シャドウぼかし
- ✅ 그림자 블러

### v52.12 自动饱和度 | Saturation Auto | 彩度自動 | 채도 자동
- ✅ 自动饱和度
- ✅ Saturation Auto
- ✅ 彩度自動
- ✅ 채도 자동

### v52.13 音量淡入 | Volume Fade In | 音量フェードイン | 볼륨 페이드 인
- ✅ 音量淡入
- ✅ Volume Fade In
- ✅ 音量フェードイン
- ✅ 볼륨 페이드 인

### v52.14 背景渐变颜色 | Bg Gradient Color | 背景グラデーション色 | 배경 그라데이션 색상
- ✅ 背景渐变颜色
- ✅ Bg Gradient Color
- ✅ 背景グラデーション色
- ✅ 배경 그라데이션 색상

### v52.15 投射延迟模式 | Cast Latency Mode | キャスト遅延モード | 캐스트 지연 모드
- ✅ 投射延迟模式
- ✅ Cast Latency Mode
- ✅ キャスト遅延モード
- ✅ 캐스트 지연 모드

### v53.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v53.1-v53.15 功能列表
- ✅ Auto Pause, Font Italic, Vignette Custom, Volume Fade Out, Send Timestamp, Cast Audio Codec, Volume Step, Filter Type, Cleanup Policy, Progress Snap, Font Strike, Black Level, Balance Custom, Bg Rounded, Cast Auto Pause

### v53.1 自动暂停 | Auto Pause | 自動一時停止 | 자동 일시정지
- ✅ 自动暂停
- ✅ Auto Pause
- ✅ 自動一時停止
- ✅ 자동 일시정지

### v53.2 弹幕斜体 | Font Italic | フォントイタリック | 글꼴 이탤릭
- ✅ 弹幕斜体
- ✅ Font Italic
- ✅ フォントイタリック
- ✅ 글꼴 이탤릭

### v53.3 自定义暗角 | Vignette Custom | ビネットカスタム | 비네트 사용자 정의
- ✅ 自定义暗角
- ✅ Vignette Custom
- ✅ ビネットカスタム
- ✅ 비네트 사용자 정의

### v53.4 音量淡出 | Volume Fade Out | 音量フェードアウト | 볼륨 페이드 아웃
- ✅ 音量淡出
- ✅ Volume Fade Out
- ✅ 音量フェードアウト
- ✅ 볼륨 페이드 아웃

### v53.5 发送时间戳 | Send Timestamp | 送信タイムスタンプ | 전송 타임스탬프
- ✅ 发送时间戳
- ✅ Send Timestamp
- ✅ 送信タイムスタンプ
- ✅ 전송 타임스탬프

### v53.6 投射音频编码 | Cast Audio Codec | キャスト音声コーデック | 캐스트 오디오 코덱
- ✅ 投射音频编码
- ✅ Cast Audio Codec
- ✅ キャスト音声コーデック
- ✅ 캐스트 오디오 코덱

### v53.7 音量步进 | Volume Step | 音量ステップ | 볼륨 스텝
- ✅ 音量步进
- ✅ Volume Step
- ✅ 音量ステップ
- ✅ 볼륨 스텝

### v53.8 弹幕类型过滤 | Filter Type | フィルタータイプ | 필터 유형
- ✅ 弹幕类型过滤
- ✅ Filter Type
- ✅ フィルタータイプ
- ✅ 필터 유형

### v53.9 清理策略 | Cleanup Policy | クリーンアップポリシー | 정리 정책
- ✅ 清理策略
- ✅ Cleanup Policy
- ✅ クリーンアップポリシー
- ✅ 정리 정책

### v53.10 进度条吸附 | Progress Snap | プログレススナップ | 진행 바 스냅
- ✅ 进度条吸附
- ✅ Progress Snap
- ✅ プログレススナップ
- ✅ 진행 바 스냅

### v53.11 弹幕删除线 | Font Strike | フォント取り消し線 | 글꼴 취소선
- ✅ 弹幕删除线
- ✅ Font Strike
- ✅ フォント取り消し線
- ✅ 글꼴 취소선

### v53.12 黑电平 | Black Level | ブラックレベル | 블랙 레벨
- ✅ 黑电平
- ✅ Black Level
- ✅ ブラックレベル
- ✅ 블랙 레벨

### v53.13 自定义声道平衡 | Balance Custom | バランスカスタム | 밸런스 사용자 정의
- ✅ 自定义声道平衡
- ✅ Balance Custom
- ✅ バランスカスタム
- ✅ 밸런스 사용자 정의

### v53.14 背景圆角 | Bg Rounded | 背景角丸 | 배경 둥근 모서리
- ✅ 背景圆角
- ✅ Bg Rounded
- ✅ 背景角丸
- ✅ 배경 둥근 모서리

### v53.15 投射自动暂停 | Cast Auto Pause | キャスト自動一時停止 | 캐스트 자동 일시정지
- ✅ 投射自动暂停
- ✅ Cast Auto Pause
- ✅ キャスト自動一時停止
- ✅ 캐스트 자동 일시정지

### v54.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v54.1-v54.15 功能列表
- ✅ Resume Position, Font Size Range, Color Brightness, Surround Mode, Send Draft, Cast Screen Mirror, Brightness Step, Filter User, Wakeup Prefetch, Progress Haptic, Font Underline, Color Contrast, Auto Gain, Bg Gradient Direction, Cast Subtitle Lang

### v54.1 记忆恢复位置 | Resume Position | 再開位置メモリ | 재개 위치 기억
- ✅ 记忆恢复位置
- ✅ Resume Position
- ✅ 再開位置メモリ
- ✅ 재개 위치 기억

### v54.2 字号范围 | Font Size Range | フォントサイズ範囲 | 글꼴 크기 범위
- ✅ 字号范围
- ✅ Font Size Range
- ✅ フォントサイズ範囲
- ✅ 글꼴 크기 범위

### v54.3 亮度调节 | Color Brightness | 輝度調整 | 밝기 조정
- ✅ 亮度调节
- ✅ Color Brightness
- ✅ 輝度調整
- ✅ 밝기 조정

### v54.4 环绕声模式 | Surround Mode | サラウンドモード | 서라운드 모드
- ✅ 环绕声模式
- ✅ Surround Mode
- ✅ サラウンドモード
- ✅ 서라운드 모드

### v54.5 弹幕草稿箱 | Send Draft | 送信ドラフト | 전송 드래프트
- ✅ 弹幕草稿箱
- ✅ Send Draft
- ✅ 送信ドラフト
- ✅ 전송 드래프트

### v54.6 投射屏幕镜像 | Cast Screen Mirror | キャスト画面ミラー | 캐스트 화면 미러
- ✅ 投射屏幕镜像
- ✅ Cast Screen Mirror
- ✅ キャスト画面ミラー
- ✅ 캐스트 화면 미러

### v54.7 亮度手势步进 | Brightness Step | 輝度ステップ | 밝기 스텝
- ✅ 亮度手势步进
- ✅ Brightness Step
- ✅ 輝度ステップ
- ✅ 밝기 스텝

### v54.8 弹幕用户过滤 | Filter User | ユーザーフィルター | 사용자 필터
- ✅ 弹幕用户过滤
- ✅ Filter User
- ✅ ユーザーフィルター
- ✅ 사용자 필터

### v54.9 唤醒预加载 | Wakeup Prefetch | ウェイクアッププリロード | 웨이크업 프리로드
- ✅ 唤醒预加载
- ✅ Wakeup Prefetch
- ✅ ウェイクアッププリロード
- ✅ 웨이크업 프리로드

### v54.10 进度条震动 | Progress Haptic | プログレスハプティック | 진행 바 햅틱
- ✅ 进度条震动
- ✅ Progress Haptic
- ✅ プログレスハプティック
- ✅ 진행 바 햅틱

### v54.11 弹幕下划线 | Font Underline | フォント下線 | 글꼴 밑줄
- ✅ 弹幕下划线
- ✅ Font Underline
- ✅ フォント下線
- ✅ 글꼴 밑줄

### v54.12 对比度 | Color Contrast | コントラスト | 대비
- ✅ 对比度
- ✅ Color Contrast
- ✅ コントラスト
- ✅ 대비

### v54.13 自动增益 | Auto Gain | 自動ゲイン | 자동 게인
- ✅ 自动增益
- ✅ Auto Gain
- ✅ 自動ゲイン
- ✅ 자동 게인

### v54.14 背景渐变方向 | Bg Gradient Direction | 背景グラデーション方向 | 배경 그라데이션 방향
- ✅ 背景渐变方向
- ✅ Bg Gradient Direction
- ✅ 背景グラデーション方向
- ✅ 배경 그라데이션 방향

### v54.15 投射字幕语言 | Cast Subtitle Lang | キャスト字幕言語 | 캐스트 자막 언어
- ✅ 投射字幕语言
- ✅ Cast Subtitle Lang
- ✅ キャスト字幕言語
- ✅ 캐스트 자막 언어


### v56.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v56.1-v56.15 功能列表
- ✅ Skip Silence, Font Weight Auto, Color Reduction, Stereo Widen, Send Priority, Cast Auto Rotate, Long Press Speed, Filter Score, Cache Compress, Chapters Color, Letter Spacing2, Saturation Curve, Volume Pre Amp, Gradient Opacity, Cast Subtitle Style

### v56.1 跳过静音 | Skip Silence | 無音スキップ | 무음 건너뛰기
- ✅ 跳过静音
- ✅ Skip Silence
- ✅ 無音スキップ
- ✅ 무음 건너뛰기

### v56.2 字体粗细自动 | Font Weight Auto | フォント太さ自動 | 글꼴 두께 자동
- ✅ 字体粗细自动
- ✅ Font Weight Auto
- ✅ フォント太さ自動
- ✅ 글꼴 두께 자동

### v56.3 色彩降低 | Color Reduction | 色削減 | 색상 감소
- ✅ 色彩降低
- ✅ Color Reduction
- ✅ 色削減
- ✅ 색상 감소

### v56.4 立体声加宽 | Stereo Widen | ステレオワイド | 스테레오 확장
- ✅ 立体声加宽
- ✅ Stereo Widen
- ✅ ステレオワイド
- ✅ 스테레오 확장

### v56.5 发送优先级 | Send Priority | 送信優先度 | 전송 우선순위
- ✅ 发送优先级
- ✅ Send Priority
- ✅ 送信優先度
- ✅ 전송 우선순위

### v56.6 投射自动旋转 | Cast Auto Rotate | キャスト自動回転 | 캐스트 자동 회전
- ✅ 投射自动旋转
- ✅ Cast Auto Rotate
- ✅ キャスト自動回転
- ✅ 캐스트 자동 회전

### v56.7 长按速度 | Long Press Speed | 長押し速度 | 길게 누르기 속도
- ✅ 长按速度
- ✅ Long Press Speed
- ✅ 長押し速度
- ✅ 길게 누르기 속도

### v56.8 弹幕评分过滤 | Filter Score | フィルタースコア | 필터 점수
- ✅ 弹幕评分过滤
- ✅ Filter Score
- ✅ フィルタースコア
- ✅ 필터 점수

### v56.9 缓存压缩 | Cache Compress | キャッシュ圧縮 | 캐시 압축
- ✅ 缓存压缩
- ✅ Cache Compress
- ✅ キャッシュ圧縮
- ✅ 캐시 압축

### v56.10 章节颜色 | Chapters Color | チャプター色 | 챕터 색상
- ✅ 章节颜色
- ✅ Chapters Color
- ✅ チャプター色
- ✅ 챕터 색상

### v56.11 字母间距2 | Letter Spacing2 | 文字間隔2 | 글자 간격2
- ✅ 字母间距2
- ✅ Letter Spacing2
- ✅ 文字間隔2
- ✅ 글자 간격2

### v56.12 饱和度曲线 | Saturation Curve | 彩度カーブ | 채도 커브
- ✅ 饱和度曲线
- ✅ Saturation Curve
- ✅ 彩度カーブ
- ✅ 채도 커브

### v56.13 音量前级放大 | Volume Pre Amp | 音量プリアンプ | 볼륨 프리앰프
- ✅ 音量前级放大
- ✅ Volume Pre Amp
- ✅ 音量プリアンプ
- ✅ 볼륨 프리앰프

### v56.14 渐变透明度 | Gradient Opacity | グラデーション透明度 | 그라데이션 투명도
- ✅ 渐变透明度
- ✅ Gradient Opacity
- ✅ グラデーション透明度
- ✅ 그라데이션 투명도

### v56.15 投射字幕样式 | Cast Subtitle Style | キャスト字幕スタイル | 캐스트 자막 스타일
- ✅ 投射字幕样式
- ✅ Cast Subtitle Style
- ✅ キャスト字幕スタイル
- ✅ 캐스트 자막 스타일

### v57.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v57.1-v57.15 功能列表
- ✅ Auto Skip Ads, Font Anti Alias, Color Vibrance, Volume Ducking, Send Repeat, Cast Auto Fullscreen, Double Tap Action2, Filter Keywords, Cache Encrypt, Buffer Color, Font Background2, Highlight Roll, Max Boost, Bg Shadow Color2, Cast Video Bitrate

### v57.1 自动跳广告 | Auto Skip Ads | 自動広告スキップ | 자동 광고 건너뛰기
- ✅ 自动跳广告
- ✅ Auto Skip Ads
- ✅ 自動広告スキップ
- ✅ 자동 광고 건너뛰기

### v57.2 字体抗锯齿 | Font Anti Alias | フォントアンチエイリアス | 글꼴 안티앨리어싱
- ✅ 字体抗锯齿
- ✅ Font Anti Alias
- ✅ フォントアンチエイリアス
- ✅ 글꼴 안티앨리어싱

### v57.3 色彩鲜艳度 | Color Vibrance | 色彩ビビッドネス | 색상 선명도
- ✅ 色彩鲜艳度
- ✅ Color Vibrance
- ✅ 色彩ビビッドネス
- ✅ 색상 선명도

### v57.4 音量闪避 | Volume Ducking | 音量ダッキング | 볼륨 더킹
- ✅ 音量闪避
- ✅ Volume Ducking
- ✅ 音量ダッキング
- ✅ 볼륨 더킹

### v57.5 发送重复 | Send Repeat | 送信繰り返し | 전송 반복
- ✅ 发送重复
- ✅ Send Repeat
- ✅ 送信繰り返し
- ✅ 전송 반복

### v57.6 投射自动全屏 | Cast Auto Fullscreen | キャスト自動フルスクリーン | 캐스트 자동 전체화면
- ✅ 投射自动全屏
- ✅ Cast Auto Fullscreen
- ✅ キャスト自動フルスクリーン
- ✅ 캐스트 자동 전체화면

### v57.7 双击动作2 | Double Tap Action2 | ダブルタップアクション2 | 더블 탭 동작2
- ✅ 双击动作2
- ✅ Double Tap Action2
- ✅ ダブルタップアクション2
- ✅ 더블 탭 동작2

### v57.8 关键词过滤 | Filter Keywords | キーワードフィルター | 키워드 필터
- ✅ 关键词过滤
- ✅ Filter Keywords
- ✅ キーワードフィルター
- ✅ 키워드 필터

### v57.9 缓存加密 | Cache Encrypt | キャッシュ暗号化 | 캐시 암호화
- ✅ 缓存加密
- ✅ Cache Encrypt
- ✅ キャッシュ暗号化
- ✅ 캐시 암호화

### v57.10 缓冲颜色 | Buffer Color | バッファ色 | 버퍼 색상
- ✅ 缓冲颜色
- ✅ Buffer Color
- ✅ バッファ色
- ✅ 버퍼 색상

### v57.11 字体背景2 | Font Background2 | フォント背景2 | 글꼴 배경2
- ✅ 字体背景2
- ✅ Font Background2
- ✅ フォント背景2
- ✅ 글꼴 배경2

### v57.12 高光滚屏 | Highlight Roll | ハイライトロール | 하이라이트 롤
- ✅ 高光滚屏
- ✅ Highlight Roll
- ✅ ハイライトロール
- ✅ 하이라이트 롤

### v57.13 最大增强 | Max Boost | 最大ブースト | 최대 부스트
- ✅ 最大增强
- ✅ Max Boost
- ✅ 最大ブースト
- ✅ 최대 부스트

### v57.14 背景阴影颜色2 | Bg Shadow Color2 | 背景シャドウ色2 | 배경 그림자 색상2
- ✅ 背景阴影颜色2
- ✅ Bg Shadow Color2
- ✅ 背景シャドウ色2
- ✅ 배경 그림자 색상2

### v57.15 投射视频码率 | Cast Video Bitrate | キャスト動画ビットレート | 캐스트 비디오 비트레이트
- ✅ 投射视频码率
- ✅ Cast Video Bitrate
- ✅ キャスト動画ビットレート
- ✅ 캐스트 비디오 비트레이트

### v58.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v58.1-v58.15 功能列表
- ✅ Auto Speed, Font Blend Mode, Color Lift, Pan Control, Send Font Size2, Cast Auto Resolution, Swipe Action2, Filter Regex2, Disk Policy, Thumb Color, Shadow Color2, Midtone Gamma, Volume EQ, Bg Border Width, Cast Audio Delay

### v58.1 自动速度 | Auto Speed | 自動速度 | 자동 속도
- ✅ 自动速度
- ✅ Auto Speed
- ✅ 自動速度
- ✅ 자동 속도

### v58.2 字体混合模式 | Font Blend Mode | フォントブレンドモード | 글꼴 블렌드 모드
- ✅ 字体混合模式
- ✅ Font Blend Mode
- ✅ フォントブレンドモード
- ✅ 글꼴 블렌드 모드

### v58.3 色彩提升 | Color Lift | リフト | 리프트
- ✅ 色彩提升
- ✅ Color Lift
- ✅ リフト
- ✅ 리프트

### v58.4 声像控制 | Pan Control | パンコントロール | 팬 컨트롤
- ✅ 声像控制
- ✅ Pan Control
- ✅ パンコントロール
- ✅ 팬 컨트롤

### v58.5 发送字号2 | Send Font Size2 | 送信フォントサイズ2 | 전송 글꼴 크기2
- ✅ 发送字号2
- ✅ Send Font Size2
- ✅ 送信フォントサイズ2
- ✅ 전송 글꼴 크기2

### v58.6 投射自动分辨率 | Cast Auto Resolution | キャスト自動解像度 | 캐스트 자동 해상도
- ✅ 投射自动分辨率
- ✅ Cast Auto Resolution
- ✅ キャスト自動解像度
- ✅ 캐스트 자동 해상도

### v58.7 滑动动作2 | Swipe Action2 | スワイプアクション2 | 스와이프 동작2
- ✅ 滑动动作2
- ✅ Swipe Action2
- ✅ スワイプアクション2
- ✅ 스와이프 동작2

### v58.8 正则过滤2 | Filter Regex2 | 正規表現フィルター2 | 정규식 필터2
- ✅ 正则过滤2
- ✅ Filter Regex2
- ✅ 正規表現フィルター2
- ✅ 정규식 필터2

### v58.9 磁盘策略 | Disk Policy | ディスクポリシー | 디스크 정책
- ✅ 磁盘策略
- ✅ Disk Policy
- ✅ ディスクポリシー
- ✅ 디스크 정책

### v58.10 滑块颜色 | Thumb Color | サム色 | 썸 색상
- ✅ 滑块颜色
- ✅ Thumb Color
- ✅ サム色
- ✅ 썸 색상

### v58.11 阴影颜色2 | Shadow Color2 | シャドウ色2 | 그림자 색상2
- ✅ 阴影颜色2
- ✅ Shadow Color2
- ✅ シャドウ色2
- ✅ 그림자 색상2

### v58.12 中间调伽马 | Midtone Gamma | ミッドトーンガンマ | 미드톤 감마
- ✅ 中间调伽马
- ✅ Midtone Gamma
- ✅ ミッドトーンガンマ
- ✅ 미드톤 감마

### v58.13 音量均衡器 | Volume EQ | 音量イコライザー | 볼륨 EQ
- ✅ 音量均衡器
- ✅ Volume EQ
- ✅ 音量イコライザー
- ✅ 볼륨 EQ

### v58.14 背景边框宽度 | Bg Border Width | 背景ボーダー幅 | 배경 테두리 너비
- ✅ 背景边框宽度
- ✅ Bg Border Width
- ✅ 背景ボーダー幅
- ✅ 배경 테두리 너비

### v58.15 投射音频延迟 | Cast Audio Delay | キャスト音声遅延 | 캐스트 오디오 지연
- ✅ 投射音频延迟
- ✅ Cast Audio Delay
- ✅ キャスト音声遅延
- ✅ 캐스트 오디오 지연

### v59.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v59.1-v59.15 功能列表
- ✅ Skip Blank, Outline Color, Color Gain, Volume Reverb, Send Bg Color, Cast Auto Connect, Long Press Action2, Filter Lang, Memory Policy, Track Color, Stroke Color2, Shadow Gamma, Volume Crossfeed, Bg Gradient Color2, Cast Video Quality

### v59.1 跳过空白 | Skip Blank | ブランクスキップ | 빈 화면 건너뛰기
- ✅ 跳过空白
- ✅ Skip Blank
- ✅ ブランクスキップ
- ✅ 빈 화면 건너뛰기

### v59.2 描边颜色 | Outline Color | アウトライン色 | 아웃라인 색상
- ✅ 描边颜色
- ✅ Outline Color
- ✅ アウトライン色
- ✅ 아웃라인 색상

### v59.3 色彩增益 | Color Gain | ゲイン | 게인
- ✅ 色彩增益
- ✅ Color Gain
- ✅ ゲイン
- ✅ 게인

### v59.4 音量混响 | Volume Reverb | リバーブ | 리버브
- ✅ 音量混响
- ✅ Volume Reverb
- ✅ リバーブ
- ✅ 리버브

### v59.5 发送背景颜色 | Send Bg Color | 送信背景色 | 전송 배경 색상
- ✅ 发送背景颜色
- ✅ Send Bg Color
- ✅ 送信背景色
- ✅ 전송 배경 색상

### v59.6 投射自动连接 | Cast Auto Connect | キャスト自動接続 | 캐스트 자동 연결
- ✅ 投射自动连接
- ✅ Cast Auto Connect
- ✅ キャスト自動接続
- ✅ 캐스트 자동 연결

### v59.7 长按动作2 | Long Press Action2 | 長押しアクション2 | 길게 누르기 동작2
- ✅ 长按动作2
- ✅ Long Press Action2
- ✅ 長押しアクション2
- ✅ 길게 누르기 동작2

### v59.8 语言过滤 | Filter Lang | 言語フィルター | 언어 필터
- ✅ 语言过滤
- ✅ Filter Lang
- ✅ 言語フィルター
- ✅ 언어 필터

### v59.9 内存策略 | Memory Policy | メモリポリシー | 메모리 정책
- ✅ 内存策略
- ✅ Memory Policy
- ✅ メモリポリシー
- ✅ 메모리 정책

### v59.10 轨道颜色 | Track Color | トラック色 | 트랙 색상
- ✅ 轨道颜色
- ✅ Track Color
- ✅ トラック色
- ✅ 트랙 색상

### v59.11 描边颜色2 | Stroke Color2 | ストローク色2 | 스트로크 색상2
- ✅ 描边颜色2
- ✅ Stroke Color2
- ✅ ストローク色2
- ✅ 스트로크 색상2

### v59.12 暗部伽马 | Shadow Gamma | シャドウガンマ | 그림자 감마
- ✅ 暗部伽马
- ✅ Shadow Gamma
- ✅ シャドウガンマ
- ✅ 그림자 감마

### v59.13 交叉馈送 | Volume Crossfeed | クロスフィード | 크로스피드
- ✅ 交叉馈送
- ✅ Volume Crossfeed
- ✅ クロスフィード
- ✅ 크로스피드

### v59.14 背景渐变颜色2 | Bg Gradient Color2 | 背景グラデーション色2 | 배경 그라데이션 색상2
- ✅ 背景渐变颜色2
- ✅ Bg Gradient Color2
- ✅ 背景グラデーション色2
- ✅ 배경 그라데이션 색상2

### v59.15 投射视频质量 | Cast Video Quality | キャスト動画品質 | 캐스트 비디오 품질
- ✅ 投射视频质量
- ✅ Cast Video Quality
- ✅ キャスト動画品質
- ✅ 캐스트 비디오 품질

### v60.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v60.1-v60.15 功能列表
- ✅ Smart Buffer, Font Weight2, Highlight Gamma, Volume Delay, Send Border Color, Cast Auto Adapt, Triple Tap Action, Filter Length2, Prefetch On Charge, Scrub Preview, Font Bg Color2, Midtone Saturation, Loudness Target, Bg Opacity2, Cast Subtitle Size

### v60.1 智能缓冲 | Smart Buffer | スマートバッファ | 스마트 버퍼
- ✅ 智能缓冲
- ✅ Smart Buffer
- ✅ スマートバッファ
- ✅ 스마트 버퍼

### v60.2 字体粗细2 | Font Weight2 | フォント太さ2 | 글꼴 두께2
- ✅ 字体粗细2
- ✅ Font Weight2
- ✅ フォント太さ2
- ✅ 글꼴 두께2

### v60.3 高光伽马 | Highlight Gamma | ハイライトガンマ | 하이라이트 감마
- ✅ 高光伽马
- ✅ Highlight Gamma
- ✅ ハイライトガンマ
- ✅ 하이라이트 감마

### v60.4 音量延迟 | Volume Delay | 音量遅延 | 볼륨 지연
- ✅ 音量延迟
- ✅ Volume Delay
- ✅ 音量遅延
- ✅ 볼륨 지연

### v60.5 发送边框颜色 | Send Border Color | 送信ボーダー色 | 전송 테두리 색상
- ✅ 发送边框颜色
- ✅ Send Border Color
- ✅ 送信ボーダー色
- ✅ 전송 테두리 색상

### v60.6 投射自适应 | Cast Auto Adapt | キャスト自動適応 | 캐스트 자동 적응
- ✅ 投射自适应
- ✅ Cast Auto Adapt
- ✅ キャスト自動適応
- ✅ 캐스트 자동 적응

### v60.7 三击动作 | Triple Tap Action | トリプルタップアクション | 트리플 탭 동작
- ✅ 三击动作
- ✅ Triple Tap Action
- ✅ トリプルタップアクション
- ✅ 트리플 탭 동작

### v60.8 长度过滤2 | Filter Length2 | フィルター長さ2 | 필터 길이2
- ✅ 长度过滤2
- ✅ Filter Length2
- ✅ フィルター長さ2
- ✅ 필터 길이2

### v60.9 充电时预取 | Prefetch On Charge | 充電時プリロード | 충전 시 프리로드
- ✅ 充电时预取
- ✅ Prefetch On Charge
- ✅ 充電時プリロード
- ✅ 충전 시 프리로드

### v60.10 滑动预览 | Scrub Preview | スクラブプレビュー | 스크럽 미리보기
- ✅ 滑动预览
- ✅ Scrub Preview
- ✅ スクラブプレビュー
- ✅ 스크럽 미리보기

### v60.11 字体背景颜色2 | Font Bg Color2 | フォント背景色2 | 글꼴 배경 색상2
- ✅ 字体背景颜色2
- ✅ Font Bg Color2
- ✅ フォント背景色2
- ✅ 글꼴 배경 색상2

### v60.12 中间调饱和度 | Midtone Saturation | ミッドトーン彩度 | 미드톤 채도
- ✅ 中间调饱和度
- ✅ Midtone Saturation
- ✅ ミッドトーン彩度
- ✅ 미드톤 채도

### v60.13 响度目标 | Loudness Target | ラウドネス目標 | 라우드니스 목표
- ✅ 响度目标
- ✅ Loudness Target
- ✅ ラウドネス目標
- ✅ 라우드니스 목표

### v60.14 背景透明度2 | Bg Opacity2 | 背景透明度2 | 배경 투명도2
- ✅ 背景透明度2
- ✅ Bg Opacity2
- ✅ 背景透明度2
- ✅ 배경 투명도2

### v60.15 投射字幕大小 | Cast Subtitle Size | キャスト字幕サイズ | 캐스트 자막 크기
- ✅ 投射字幕大小
- ✅ Cast Subtitle Size
- ✅ キャスト字幕サイズ
- ✅ 캐스트 자막 크기

### v61.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v61.1-v61.15 功能列表
- ✅ Auto Quality Switch, Font Glow Color2, Black Gamma, Compressor Ratio, Send Shadow Size, Cast Audio Enhance, Edge Action, Filter Sender, Clear On Low, Progress Animation, Highlight Color, White Gamma, Compressor Attack, Bg Border Color2, Cast Subtitle Color

### v61.1 自动画质切换 | Auto Quality Switch | 自動画質切換 | 자동 화질 전환
- ✅ 自动画质切换
- ✅ Auto Quality Switch
- ✅ 自動画質切換
- ✅ 자동 화질 전환

### v61.2 字体发光颜色2 | Font Glow Color2 | フォントグロー色2 | 글꼴 글로우 색상2
- ✅ 字体发光颜色2
- ✅ Font Glow Color2
- ✅ フォントグロー色2
- ✅ 글꼴 글로우 색상2

### v61.3 黑色伽马 | Black Gamma | ブラックガンマ | 블랙 감마
- ✅ 黑色伽马
- ✅ Black Gamma
- ✅ ブラックガンマ
- ✅ 블랙 감마

### v61.4 压缩比 | Compressor Ratio | コンプレッサー比率 | 컴프레서 비율
- ✅ 压缩比
- ✅ Compressor Ratio
- ✅ コンプレッサー比率
- ✅ 컴프레서 비율

### v61.5 发送阴影大小 | Send Shadow Size | 送信シャドウサイズ | 전송 그림자 크기
- ✅ 发送阴影大小
- ✅ Send Shadow Size
- ✅ 送信シャドウサイズ
- ✅ 전송 그림자 크기

### v61.6 投射音频增强 | Cast Audio Enhance | キャスト音声強化 | 캐스트 오디오 강화
- ✅ 投射音频增强
- ✅ Cast Audio Enhance
- ✅ キャスト音声強化
- ✅ 캐스트 오디오 강화

### v61.7 边缘动作 | Edge Action | エッジアクション | 엣지 동작
- ✅ 边缘动作
- ✅ Edge Action
- ✅ エッジアクション
- ✅ 엣지 동작

### v61.8 发送者过滤 | Filter Sender | 送信者フィルター | 발신자 필터
- ✅ 发送者过滤
- ✅ Filter Sender
- ✅ 送信者フィルター
- ✅ 발신자 필터

### v61.9 低空间时清理 | Clear On Low | 低容量時クリア | 저용량 시 정리
- ✅ 低空间时清理
- ✅ Clear On Low
- ✅ 低容量時クリア
- ✅ 저용량 시 정리

### v61.10 进度条动画 | Progress Animation | プログレスアニメーション | 진행 바 애니메이션
- ✅ 进度条动画
- ✅ Progress Animation
- ✅ プログレスアニメーション
- ✅ 진행 바 애니메이션

### v61.11 高亮颜色 | Highlight Color | ハイライト色 | 하이라이트 색상
- ✅ 高亮颜色
- ✅ Highlight Color
- ✅ ハイライト色
- ✅ 하이라이트 색상

### v61.12 白色伽马 | White Gamma | ホワイトガンマ | 화이트 감마
- ✅ 白色伽马
- ✅ White Gamma
- ✅ ホワイトガンマ
- ✅ 화이트 감마

### v61.13 压缩起始 | Compressor Attack | アタック | 어택
- ✅ 压缩起始
- ✅ Compressor Attack
- ✅ アタック
- ✅ 어택

### v61.14 背景边框颜色2 | Bg Border Color2 | 背景ボーダー色2 | 배경 테두리 색상2
- ✅ 背景边框颜色2
- ✅ Bg Border Color2
- ✅ 背景ボーダー色2
- ✅ 배경 테두리 색상2

### v61.15 投射字幕颜色 | Cast Subtitle Color | キャスト字幕色 | 캐스트 자막 색상
- ✅ 投射字幕颜色
- ✅ Cast Subtitle Color
- ✅ キャスト字幕色
- ✅ 캐스트 자막 색상

### v62.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v62.1-v62.15 功能列表
- ✅ Auto Bitrate, Font Weight3, Gamma Curve, Compressor Release, Send Outline Size, Cast Video Enhance, Custom Action, Filter Time Range, Read Ahead, Sensitivity, Glow Size2, Temperature Curve, Limiter Threshold, Bg Shadow Blur2, Cast Subtitle Bg

### v62.1 自动码率 | Auto Bitrate | 自動ビットレート | 자동 비트레이트
- ✅ 自动码率
- ✅ Auto Bitrate
- ✅ 自動ビットレート
- ✅ 자동 비트레이트

### v62.2 字体粗细3 | Font Weight3 | フォント太さ3 | 글꼴 두께3
- ✅ 字体粗细3
- ✅ Font Weight3
- ✅ フォント太さ3
- ✅ 글꼴 두께3

### v62.3 伽马曲线 | Gamma Curve | ガンマカーブ | 감마 커브
- ✅ 伽马曲线
- ✅ Gamma Curve
- ✅ ガンマカーブ
- ✅ 감마 커브

### v62.4 压缩释放 | Compressor Release | リリース | 릴리즈
- ✅ 压缩释放
- ✅ Compressor Release
- ✅ リリース
- ✅ 릴리즈

### v62.5 发送描边大小 | Send Outline Size | 送信アウトラインサイズ | 전송 아웃라인 크기
- ✅ 发送描边大小
- ✅ Send Outline Size
- ✅ 送信アウトラインサイズ
- ✅ 전송 아웃라인 크기

### v62.6 投射视频增强 | Cast Video Enhance | キャスト動画強化 | 캐스트 비디오 강화
- ✅ 投射视频增强
- ✅ Cast Video Enhance
- ✅ キャスト動画強化
- ✅ 캐스트 비디오 강화

### v62.7 自定义动作 | Custom Action | カスタムアクション | 사용자 정의 동작
- ✅ 自定义动作
- ✅ Custom Action
- ✅ カスタムアクション
- ✅ 사용자 정의 동작

### v62.8 时间范围过滤 | Filter Time Range | 時間範囲フィルター | 시간 범위 필터
- ✅ 时间范围过滤
- ✅ Filter Time Range
- ✅ 時間範囲フィルター
- ✅ 시간 범위 필터

### v62.9 预读取 | Read Ahead | リードアヘッド | 리드 어헤드
- ✅ 预读取
- ✅ Read Ahead
- ✅ リードアヘッド
- ✅ 리드 어헤드

### v62.10 灵敏度 | Sensitivity | 感度 | 감도
- ✅ 灵敏度
- ✅ Sensitivity
- ✅ 感度
- ✅ 감도

### v62.11 发光大小2 | Glow Size2 | グローサイズ2 | 글로우 크기2
- ✅ 发光大小2
- ✅ Glow Size2
- ✅ グローサイズ2
- ✅ 글로우 크기2

### v62.12 色温曲线 | Temperature Curve | 色温度カーブ | 색온도 커브
- ✅ 色温曲线
- ✅ Temperature Curve
- ✅ 色温度カーブ
- ✅ 색온도 커브

### v62.13 限幅阈值 | Limiter Threshold | リミッター閾値 | 리미터 임계값
- ✅ 限幅阈值
- ✅ Limiter Threshold
- ✅ リミッター閾値
- ✅ 리미터 임계값

### v62.14 背景阴影模糊2 | Bg Shadow Blur2 | 背景シャドウぼかし2 | 배경 그림자 블러2
- ✅ 背景阴影模糊2
- ✅ Bg Shadow Blur2
- ✅ 背景シャドウぼかし2
- ✅ 배경 그림자 블러2

### v62.15 投射字幕背景 | Cast Subtitle Bg | キャスト字幕背景 | 캐스트 자막 배경
- ✅ 投射字幕背景
- ✅ Cast Subtitle Bg
- ✅ キャスト字幕背景
- ✅ 캐스트 자막 배경

### v63.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v63.1-v63.15 功能列表
- ✅ Auto Chapter, Line Spacing2, Contrast Curve, Normalizer2, Send Bg Blur, Cast Auto Subtitle, Pinch Action, Filter Score2, Wakeup On Start, Tick Color, Weight Custom2, Brightness Curve, Bass Lpf, Bg Shadow Offset, Cast Subtitle Outline

### v63.1 自动章节 | Auto Chapter | 自動チャプター | 자동 챕터
- ✅ 自动章节
- ✅ Auto Chapter
- ✅ 自動チャプター
- ✅ 자동 챕터

### v63.2 行间距2 | Line Spacing2 | 行間2 | 줄 간격2
- ✅ 行间距2
- ✅ Line Spacing2
- ✅ 行間2
- ✅ 줄 간격2

### v63.3 对比度曲线 | Contrast Curve | コントラストカーブ | 대비 커브
- ✅ 对比度曲线
- ✅ Contrast Curve
- ✅ コントラストカーブ
- ✅ 대비 커브

### v63.4 标准化器2 | Normalizer2 | ノーマライザー2 | 노멀라이저2
- ✅ 标准化器2
- ✅ Normalizer2
- ✅ ノーマライザー2
- ✅ 노멀라이저2

### v63.5 发送背景模糊 | Send Bg Blur | 送信背景ぼかし | 전송 배경 블러
- ✅ 发送背景模糊
- ✅ Send Bg Blur
- ✅ 送信背景ぼかし
- ✅ 전송 배경 블러

### v63.6 投射自动字幕 | Cast Auto Subtitle | キャスト自動字幕 | 캐스트 자동 자막
- ✅ 投射自动字幕
- ✅ Cast Auto Subtitle
- ✅ キャスト自動字幕
- ✅ 캐스트 자동 자막

### v63.7 捏合动作 | Pinch Action | ピンチアクション | 핀치 동작
- ✅ 捏合动作
- ✅ Pinch Action
- ✅ ピンチアクション
- ✅ 핀치 동작

### v63.8 评分过滤2 | Filter Score2 | フィルタースコア2 | 필터 점수2
- ✅ 评分过滤2
- ✅ Filter Score2
- ✅ フィルタースコア2
- ✅ 필터 점수2

### v63.9 启动时唤醒 | Wakeup On Start | 起動時ウェイクアップ | 시작 시 웨이크업
- ✅ 启动时唤醒
- ✅ Wakeup On Start
- ✅ 起動時ウェイクアップ
- ✅ 시작 시 웨이크업

### v63.10 刻度颜色 | Tick Color | ティック色 | 틱 색상
- ✅ 刻度颜色
- ✅ Tick Color
- ✅ ティック色
- ✅ 틱 색상

### v63.11 自定义粗细2 | Weight Custom2 | 太さカスタム2 | 두께 사용자 정의2
- ✅ 自定义粗细2
- ✅ Weight Custom2
- ✅ 太さカスタム2
- ✅ 두께 사용자 정의2

### v63.12 亮度曲线 | Brightness Curve | 輝度カーブ | 밝기 커브
- ✅ 亮度曲线
- ✅ Brightness Curve
- ✅ 輝度カーブ
- ✅ 밝기 커브

### v63.13 低通滤波 | Bass Lpf | バスLPF | 베이스 LPF
- ✅ 低通滤波
- ✅ Bass Lpf
- ✅ バスLPF
- ✅ 베이스 LPF

### v63.14 背景阴影偏移 | Bg Shadow Offset | 背景シャドウオフセット | 배경 그림자 오프셋
- ✅ 背景阴影偏移
- ✅ Bg Shadow Offset
- ✅ 背景シャドウオフセット
- ✅ 배경 그림자 오프셋

### v63.15 投射字幕描边 | Cast Subtitle Outline | キャスト字幕アウトライン | 캐스트 자막 아웃라인
- ✅ 投射字幕描边
- ✅ Cast Subtitle Outline
- ✅ キャスト字幕アウトライン
- ✅ 캐스트 자막 아웃라인

### v64.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v64.1-v64.15 功能列表
- ✅ Auto Loop Playlist, Shadow Offset2, Saturation Boost, Treble Hpf, Send Border Size, Cast Auto Quality2, Rotation Action, Length Range, Cleanup On Start, Glow Color, Font Italic2, Vividness Boost, Surround Angle, Bg Padding2, Cast Subtitle Delay

### v64.1 自动循环播放列表 | Auto Loop Playlist | 自動ループプレイリスト | 자동 루프 재생목록
- ✅ 自动循环播放列表
- ✅ Auto Loop Playlist
- ✅ 自動ループプレイリスト
- ✅ 자동 루프 재생목록

### v64.2 阴影偏移2 | Shadow Offset2 | シャドウオフセット2 | 그림자 오프셋2
- ✅ 阴影偏移2
- ✅ Shadow Offset2
- ✅ シャドウオフセット2
- ✅ 그림자 오프셋2

### v64.3 饱和度增强 | Saturation Boost | 彩度ブースト | 채도 부스트
- ✅ 饱和度增强
- ✅ Saturation Boost
- ✅ 彩度ブースト
- ✅ 채도 부스트

### v64.4 高通滤波 | Treble Hpf | トレブルHPF | 트레블 HPF
- ✅ 高通滤波
- ✅ Treble Hpf
- ✅ トレブルHPF
- ✅ 트레블 HPF

### v64.5 发送边框大小 | Send Border Size | 送信ボーダーサイズ | 전송 테두리 크기
- ✅ 发送边框大小
- ✅ Send Border Size
- ✅ 送信ボーダーサイズ
- ✅ 전송 테두리 크기

### v64.6 投射自动画质2 | Cast Auto Quality2 | キャスト自動画質2 | 캐스트 자동 화질2
- ✅ 投射自动画质2
- ✅ Cast Auto Quality2
- ✅ キャスト自動画質2
- ✅ 캐스트 자동 화질2

### v64.7 旋转动作 | Rotation Action | 回転アクション | 회전 동작
- ✅ 旋转动作
- ✅ Rotation Action
- ✅ 回転アクション
- ✅ 회전 동작

### v64.8 长度范围 | Length Range | 長さ範囲 | 길이 범위
- ✅ 长度范围
- ✅ Length Range
- ✅ 長さ範囲
- ✅ 길이 범위

### v64.9 启动时清理 | Cleanup On Start | 起動時クリーンアップ | 시작 시 정리
- ✅ 启动时清理
- ✅ Cleanup On Start
- ✅ 起動時クリーンアップ
- ✅ 시작 시 정리

### v64.10 发光颜色 | Glow Color | グロー色 | 글로우 색상
- ✅ 发光颜色
- ✅ Glow Color
- ✅ グロー色
- ✅ 글로우 색상

### v64.11 字体斜体2 | Font Italic2 | フォントイタリック2 | 글꼴 이탤릭2
- ✅ 字体斜体2
- ✅ Font Italic2
- ✅ フォントイタリック2
- ✅ 글꼴 이탤릭2

### v64.12 鲜艳度增强 | Vividness Boost | ビビッドネスブースト | 선명도 부스트
- ✅ 鲜艳度增强
- ✅ Vividness Boost
- ✅ ビビッドネスブースト
- ✅ 선명도 부스트

### v64.13 环绕角度 | Surround Angle | サラウンド角度 | 서라운드 각도
- ✅ 环绕角度
- ✅ Surround Angle
- ✅ サラウンド角度
- ✅ 서라운드 각도

### v64.14 背景内边距2 | Bg Padding2 | 背景パディング2 | 배경 패딩2
- ✅ 背景内边距2
- ✅ Bg Padding2
- ✅ 背景パディング2
- ✅ 배경 패딩2

### v64.15 投射字幕延迟 | Cast Subtitle Delay | キャスト字幕遅延 | 캐스트 자막 지연
- ✅ 投射字幕延迟
- ✅ Cast Subtitle Delay
- ✅ キャスト字幕遅延
- ✅ 캐스트 자막 지연

### v65.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v65.1-v65.15 功能列表
- ✅ Skip Recap, Font Strike2, Hue Curve, Bass Enhance, Anim Duration, Cast Auto Reconnect2, Shake Action, Filter Duplicate2, Prefetch On Idle, Gradient Speed, Font Underline2, Lift Gamma Gain, Treble Enhance, Bg Border Radius2, Cast Subtitle Bg Opacity

### v65.1 跳过回顾 | Skip Recap | リキャップスキップ | 리캡 건너뛰기
- ✅ 跳过回顾
- ✅ Skip Recap
- ✅ リキャップスキップ
- ✅ 리캡 건너뛰기

### v65.2 删除线2 | Font Strike2 | フォント取り消し線2 | 글꼴 취소선2
- ✅ 删除线2
- ✅ Font Strike2
- ✅ フォント取り消し線2
- ✅ 글꼴 취소선2

### v65.3 色调曲线 | Hue Curve | 色相カーブ | 색조 커브
- ✅ 色调曲线
- ✅ Hue Curve
- ✅ 色相カーブ
- ✅ 색조 커브

### v65.4 低音增强 | Bass Enhance | バス強化 | 베이스 강화
- ✅ 低音增强
- ✅ Bass Enhance
- ✅ バス強化
- ✅ 베이스 강화

### v65.5 动画时长 | Anim Duration | アニメーション時間 | 애니메이션 시간
- ✅ 动画时长
- ✅ Anim Duration
- ✅ アニメーション時間
- ✅ 애니메이션 시간

### v65.6 投射自动重连2 | Cast Auto Reconnect2 | キャスト自動再接続2 | 캐스트 자동 재연결2
- ✅ 投射自动重连2
- ✅ Cast Auto Reconnect2
- ✅ キャスト自動再接続2
- ✅ 캐스트 자동 재연결2

### v65.7 摇晃动作 | Shake Action | シェイクアクション | 셰이크 동작
- ✅ 摇晃动作
- ✅ Shake Action
- ✅ シェイクアクション
- ✅ 셰이크 동작

### v65.8 去重过滤2 | Filter Duplicate2 | 重複フィルター2 | 중복 필터2
- ✅ 去重过滤2
- ✅ Filter Duplicate2
- ✅ 重複フィルター2
- ✅ 중복 필터2

### v65.9 空闲时预取 | Prefetch On Idle | アイドル時プリロード | 유휴 시 프리로드
- ✅ 空闲时预取
- ✅ Prefetch On Idle
- ✅ アイドル時プリロード
- ✅ 유휴 시 프리로드

### v65.10 渐变速度 | Gradient Speed | グラデーション速度 | 그라데이션 속도
- ✅ 渐变速度
- ✅ Gradient Speed
- ✅ グラデーション速度
- ✅ 그라데이션 속도

### v65.11 下划线2 | Font Underline2 | フォント下線2 | 글꼴 밑줄2
- ✅ 下划线2
- ✅ Font Underline2
- ✅ フォント下線2
- ✅ 글꼴 밑줄2

### v65.12 提升伽马增益 | Lift Gamma Gain | リフトガンマゲイン | 리프트 감마 게인
- ✅ 提升伽马增益
- ✅ Lift Gamma Gain
- ✅ リフトガンマゲイン
- ✅ 리프트 감마 게인

### v65.13 高音增强 | Treble Enhance | トレブル強化 | 트레블 강화
- ✅ 高音增强
- ✅ Treble Enhance
- ✅ トレブル強化
- ✅ 트레블 강화

### v65.14 背景圆角2 | Bg Border Radius2 | 背景角丸2 | 배경 둥근 모서리2
- ✅ 背景圆角2
- ✅ Bg Border Radius2
- ✅ 背景角丸2
- ✅ 배경 둥근 모서리2

### v65.15 投射字幕背景透明度 | Cast Subtitle Bg Opacity | キャスト字幕背景透明度 | 캐스트 자막 배경 투명도
- ✅ 投射字幕背景透明度
- ✅ Cast Subtitle Bg Opacity
- ✅ キャスト字幕背景透明度
- ✅ 캐스트 자막 배경 투명도

### v66.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v66.1-v66.15 功能列表
- ✅ Smart Seek, Font Monospace2, Tone Mapping, Channel Delay, Send Font Size3, Cast Auto Adapt2, Multi Touch Action, Filter Emote, Compress Level, Shadow Color, Font Color2, ACES Film, Dynamic Bass, Bg Gradient Color3, Cast Subtitle Font

### v66.1 智能快进 | Smart Seek | スマートシーク | 스마트 탐색
- ✅ 智能快进
- ✅ Smart Seek
- ✅ スマートシーク
- ✅ 스마트 탐색

### v66.2 等宽字体2 | Font Monospace2 | フォントモノスペース2 | 글꼴 모노스페이스2
- ✅ 等宽字体2
- ✅ Font Monospace2
- ✅ フォントモノスペース2
- ✅ 글꼴 모노스페이스2

### v66.3 色调映射 | Tone Mapping | トーンマッピング | 톤매핑
- ✅ 色调映射
- ✅ Tone Mapping
- ✅ トーンマッピング
- ✅ 톤매핑

### v66.4 声道延迟 | Channel Delay | チャンネル遅延 | 채널 지연
- ✅ 声道延迟
- ✅ Channel Delay
- ✅ チャンネル遅延
- ✅ 채널 지연

### v66.5 发送字号3 | Send Font Size3 | 送信フォントサイズ3 | 전송 글꼴 크기3
- ✅ 发送字号3
- ✅ Send Font Size3
- ✅ 送信フォントサイズ3
- ✅ 전송 글꼴 크기3

### v66.6 投射自适应2 | Cast Auto Adapt2 | キャスト自動適応2 | 캐스트 자동 적응2
- ✅ 投射自适应2
- ✅ Cast Auto Adapt2
- ✅ キャスト自動適応2
- ✅ 캐스트 자동 적응2

### v66.7 多点触控动作 | Multi Touch Action | マルチタッチアクション | 멀티 터치 동작
- ✅ 多点触控动作
- ✅ Multi Touch Action
- ✅ マルチタッチアクション
- ✅ 멀티 터치 동작

### v66.8 表情过滤 | Filter Emote | 絵文字フィルター | 이모티콘 필터
- ✅ 表情过滤
- ✅ Filter Emote
- ✅ 絵文字フィルター
- ✅ 이모티콘 필터

### v66.9 压缩级别 | Compress Level | 圧縮レベル | 압축 수준
- ✅ 压缩级别
- ✅ Compress Level
- ✅ 圧縮レベル
- ✅ 압축 수준

### v66.10 阴影颜色 | Shadow Color | シャドウ色 | 그림자 색상
- ✅ 阴影颜色
- ✅ Shadow Color
- ✅ シャドウ色
- ✅ 그림자 색상

### v66.11 字体颜色2 | Font Color2 | フォント色2 | 글꼴 색상2
- ✅ 字体颜色2
- ✅ Font Color2
- ✅ フォント色2
- ✅ 글꼴 색상2

### v66.12 ACES胶片 | ACES Film | ACESフィルム | ACES 필름
- ✅ ACES胶片
- ✅ ACES Film
- ✅ ACESフィルム
- ✅ ACES 필름

### v66.13 动态低音 | Dynamic Bass | ダイナミックバス | 다이나믹 베이스
- ✅ 动态低音
- ✅ Dynamic Bass
- ✅ ダイナミックバス
- ✅ 다이나믹 베이스

### v66.14 背景渐变颜色3 | Bg Gradient Color3 | 背景グラデーション色3 | 배경 그라데이션 색상3
- ✅ 背景渐变颜色3
- ✅ Bg Gradient Color3
- ✅ 背景グラデーション色3
- ✅ 배경 그라데이션 색상3

### v66.15 投射字幕字体 | Cast Subtitle Font | キャスト字幕フォント | 캐스트 자막 글꼴
- ✅ 投射字幕字体
- ✅ Cast Subtitle Font
- ✅ キャスト字幕フォント
- ✅ 캐스트 자막 글꼴

### v67.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v67.1-v67.15 功能列表
- ✅ Skip Preview, Outline Color2, Log Curve, Spatial Audio, Send Bg Radius, Cast Auto Connect2, Finger Count Action, Filter Combo, Write Policy, Gradient Color, Shadow Color3, Sigmoid Contrast, Surround Delay, Bg Shadow Color3, Cast Subtitle Shadow

### v67.1 跳过预览 | Skip Preview | プレビュースキップ | 미리보기 건너뛰기
- ✅ 跳过预览
- ✅ Skip Preview
- ✅ プレビュースキップ
- ✅ 미리보기 건너뛰기

### v67.2 描边颜色2 | Outline Color2 | アウトライン色2 | 아웃라인 색상2
- ✅ 描边颜色2
- ✅ Outline Color2
- ✅ アウトライン色2
- ✅ 아웃라인 색상2

### v67.3 对数曲线 | Log Curve | ログカーブ | 로그 커브
- ✅ 对数曲线
- ✅ Log Curve
- ✅ ログカーブ
- ✅ 로그 커브

### v67.4 空间音频 | Spatial Audio | 空間オーディオ | 공간 오디오
- ✅ 空间音频
- ✅ Spatial Audio
- ✅ 空間オーディオ
- ✅ 공간 오디오

### v67.5 发送背景圆角 | Send Bg Radius | 送信背景角丸 | 전송 배경 둥근 모서리
- ✅ 发送背景圆角
- ✅ Send Bg Radius
- ✅ 送信背景角丸
- ✅ 전송 배경 둥근 모서리

### v67.6 投射自动连接2 | Cast Auto Connect2 | キャスト自動接続2 | 캐스트 자동 연결2
- ✅ 投射自动连接2
- ✅ Cast Auto Connect2
- ✅ キャスト自動接続2
- ✅ 캐스트 자동 연결2

### v67.7 手指计数动作 | Finger Count Action | 指カウントアクション | 손가락 카운트 동작
- ✅ 手指计数动作
- ✅ Finger Count Action
- ✅ 指カウントアクション
- ✅ 손가락 카운트 동작

### v67.8 连击过滤 | Filter Combo | コンボフィルター | 콤보 필터
- ✅ 连击过滤
- ✅ Filter Combo
- ✅ コンボフィルター
- ✅ 콤보 필터

### v67.9 写入策略 | Write Policy | ライトポリシー | 쓰기 정책
- ✅ 写入策略
- ✅ Write Policy
- ✅ ライトポリシー
- ✅ 쓰기 정책

### v67.10 渐变颜色 | Gradient Color | グラデーション色 | 그라데이션 색상
- ✅ 渐变颜色
- ✅ Gradient Color
- ✅ グラデーション色
- ✅ 그라데이션 색상

### v67.11 阴影颜色3 | Shadow Color3 | シャドウ色3 | 그림자 색상3
- ✅ 阴影颜色3
- ✅ Shadow Color3
- ✅ シャドウ色3
- ✅ 그림자 색상3

### v67.12 S型对比度 | Sigmoid Contrast | シグモイドコントラスト | 시그모이드 대비
- ✅ S型对比度
- ✅ Sigmoid Contrast
- ✅ シグモイドコントラスト
- ✅ 시그모이드 대비

### v67.13 环绕延迟 | Surround Delay | サラウンド遅延 | 서라운드 지연
- ✅ 环绕延迟
- ✅ Surround Delay
- ✅ サラウンド遅延
- ✅ 서라운드 지연

### v67.14 背景阴影颜色3 | Bg Shadow Color3 | 背景シャドウ色3 | 배경 그림자 색상3
- ✅ 背景阴影颜色3
- ✅ Bg Shadow Color3
- ✅ 背景シャドウ色3
- ✅ 배경 그림자 색상3

### v67.15 投射字幕阴影 | Cast Subtitle Shadow | キャスト字幕シャドウ | 캐스트 자막 그림자
- ✅ 投射字幕阴影
- ✅ Cast Subtitle Shadow
- ✅ キャスト字幕シャドウ
- ✅ 캐스트 자막 그림자

### v68.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v68.1-v68.15 功能列表
- ✅ Skip Padding, Glow Color3, Film Grain, Channel Extractor, Send Bg Gradient, Cast Auto Quality3, Pressure Action, Filter Super Chat, Prefetch On Start, Glow Effect, Weight Custom3, Color Bloom, Dynamic Range, Bg Shadow Offset2, Cast Subtitle Glow

### v68.1 跳过填充 | Skip Padding | パディングスキップ | 패딩 건너뛰기
- ✅ 跳过填充
- ✅ Skip Padding
- ✅ パディングスキップ
- ✅ 패딩 건너뛰기

### v68.2 发光颜色3 | Glow Color3 | グロー色3 | 글로우 색상3
- ✅ 发光颜色3
- ✅ Glow Color3
- ✅ グロー色3
- ✅ 글로우 색상3

### v68.3 胶片颗粒 | Film Grain | フィルムグレイン | 필름 그레인
- ✅ 胶片颗粒
- ✅ Film Grain
- ✅ フィルムグレイン
- ✅ 필름 그레인

### v68.4 声道提取器 | Channel Extractor | チャンネルエクストラクター | 채널 익스트랙터
- ✅ 声道提取器
- ✅ Channel Extractor
- ✅ チャンネルエクストラクター
- ✅ 채널 익스트랙터

### v68.5 发送背景渐变 | Send Bg Gradient | 送信背景グラデーション | 전송 배경 그라데이션
- ✅ 发送背景渐变
- ✅ Send Bg Gradient
- ✅ 送信背景グラデーション
- ✅ 전송 배경 그라데이션

### v68.6 投射自动画质3 | Cast Auto Quality3 | キャスト自動画質3 | 캐스트 자동 화질3
- ✅ 投射自动画质3
- ✅ Cast Auto Quality3
- ✅ キャスト自動画質3
- ✅ 캐스트 자동 화질3

### v68.7 压力动作 | Pressure Action | プレッシャーアクション | 프레셔 동작
- ✅ 压力动作
- ✅ Pressure Action
- ✅ プレッシャーアクション
- ✅ 프레셔 동작

### v68.8 醒目留言过滤 | Filter Super Chat | スーパーチャットフィルター | 슈퍼챗 필터
- ✅ 醒目留言过滤
- ✅ Filter Super Chat
- ✅ スーパーチャットフィルター
- ✅ 슈퍼챗 필터

### v68.9 启动时预取 | Prefetch On Start | 起動時プリロード | 시작 시 프리로드
- ✅ 启动时预取
- ✅ Prefetch On Start
- ✅ 起動時プリロード
- ✅ 시작 시 프리로드

### v68.10 发光效果 | Glow Effect | グローエフェクト | 글로우 이펙트
- ✅ 发光效果
- ✅ Glow Effect
- ✅ グローエフェクト
- ✅ 글로우 이펙트

### v68.11 自定义粗细3 | Weight Custom3 | 太さカスタム3 | 두께 사용자 정의3
- ✅ 自定义粗细3
- ✅ Weight Custom3
- ✅ 太さカスタム3
- ✅ 두께 사용자 정의3

### v68.12 色彩泛光 | Color Bloom | ブルーム | 블룸
- ✅ 色彩泛光
- ✅ Color Bloom
- ✅ ブルーム
- ✅ 블룸

### v68.13 动态范围 | Dynamic Range | ダイナミックレンジ | 다이나믹 레인지
- ✅ 动态范围
- ✅ Dynamic Range
- ✅ ダイナミックレンジ
- ✅ 다이나믹 레인지

### v68.14 背景阴影偏移2 | Bg Shadow Offset2 | 背景シャドウオフセット2 | 배경 그림자 오프셋2
- ✅ 背景阴影偏移2
- ✅ Bg Shadow Offset2
- ✅ 背景シャドウオフセット2
- ✅ 배경 그림자 오프셋2

### v68.15 投射字幕发光 | Cast Subtitle Glow | キャスト字幕グロー | 캐스트 자막 글로우
- ✅ 投射字幕发光
- ✅ Cast Subtitle Glow
- ✅ キャスト字幕グロー
- ✅ 캐스트 자막 글로우

### v69.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v69.1-v69.15 功能列表
- ✅ Auto Skip Filler2, Font Weight Final, Color Final, Volume Final, Send Final, Cast Final, Gesture Final, Filter Final, Cache Final, Progress Final, Font Final, Color Final2, Volume Final2, Bg Final, Cast Subtitle Final

### v69.1 自动跳离题2 | Auto Skip Filler2 | 自動フィラースキップ2 | 자동 필러 건너뛰기2
- ✅ 自动跳离题2
- ✅ Auto Skip Filler2
- ✅ 自動フィラースキップ2
- ✅ 자동 필러 건너뛰기2

### v69.2 字体粗细最终 | Font Weight Final | フォント太さ最終 | 글꼴 두께 최종
- ✅ 字体粗细最终
- ✅ Font Weight Final
- ✅ フォント太さ最終
- ✅ 글꼴 두께 최종

### v69.3 色彩最终 | Color Final | 色最終 | 색상 최종
- ✅ 色彩最终
- ✅ Color Final
- ✅ 色最終
- ✅ 색상 최종

### v69.4 音量最终 | Volume Final | 音量最終 | 볼륨 최종
- ✅ 音量最终
- ✅ Volume Final
- ✅ 音量最終
- ✅ 볼륨 최종

### v69.5 发送最终 | Send Final | 送信最終 | 전송 최종
- ✅ 发送最终
- ✅ Send Final
- ✅ 送信最終
- ✅ 전송 최종

### v69.6 投射最终 | Cast Final | キャスト最終 | 캐스트 최종
- ✅ 投射最终
- ✅ Cast Final
- ✅ キャスト最終
- ✅ 캐스트 최종

### v69.7 手势最终 | Gesture Final | ジェスチャー最終 | 제스처 최종
- ✅ 手势最终
- ✅ Gesture Final
- ✅ ジェスチャー最終
- ✅ 제스처 최종

### v69.8 过滤最终 | Filter Final | フィルター最終 | 필터 최종
- ✅ 过滤最终
- ✅ Filter Final
- ✅ フィルター最終
- ✅ 필터 최종

### v69.9 缓存最终 | Cache Final | キャッシュ最終 | 캐시 최종
- ✅ 缓存最终
- ✅ Cache Final
- ✅ キャッシュ最終
- ✅ 캐시 최종

### v69.10 进度条最终 | Progress Final | プログレス最終 | 진행 바 최종
- ✅ 进度条最终
- ✅ Progress Final
- ✅ プログレス最終
- ✅ 진행 바 최종

### v69.11 字体最终 | Font Final | フォント最終 | 글꼴 최종
- ✅ 字体最终
- ✅ Font Final
- ✅ フォント最終
- ✅ 글꼴 최종

### v69.12 色彩最终2 | Color Final2 | 色最終2 | 색상 최종2
- ✅ 色彩最终2
- ✅ Color Final2
- ✅ 色最終2
- ✅ 색상 최종2

### v69.13 音量最终2 | Volume Final2 | 音量最終2 | 볼륨 최종2
- ✅ 音量最终2
- ✅ Volume Final2
- ✅ 音量最終2
- ✅ 볼륨 최종2

### v69.14 背景最终 | Bg Final | 背景最終 | 배경 최종
- ✅ 背景最终
- ✅ Bg Final
- ✅ 背景最終
- ✅ 배경 최종

### v69.15 投射字幕最终 | Cast Subtitle Final | キャスト字幕最終 | 캐스트 자막 최종
- ✅ 投射字幕最终
- ✅ Cast Subtitle Final
- ✅ キャスト字幕最終
- ✅ 캐스트 자막 최종

### v70.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v70.1-v70.15 功能列表
- ✅ Playback Final, Font Final2, Color Final3, Volume Final3, Send Final2, Cast Final2, Gesture Final2, Filter Final2, Cache Final2, Progress Final2, Font Final3, Color Final4, Volume Final4, Bg Final2, Cast Subtitle Final2

### v70.1 播放最终 | Playback Final | 再生最終 | 재생 최종
- ✅ 播放最终
- ✅ Playback Final
- ✅ 再生最終
- ✅ 재생 최종

### v70.2 字体最终2 | Font Final2 | フォント最終2 | 글꼴 최종2
- ✅ 字体最终2
- ✅ Font Final2
- ✅ フォント最終2
- ✅ 글꼴 최종2

### v70.3 色彩最终3 | Color Final3 | 色最終3 | 색상 최종3
- ✅ 色彩最终3
- ✅ Color Final3
- ✅ 色最終3
- ✅ 색상 최종3

### v70.4 音量最终3 | Volume Final3 | 音量最終3 | 볼륨 최종3
- ✅ 音量最终3
- ✅ Volume Final3
- ✅ 音量最終3
- ✅ 볼륨 최종3

### v70.5 发送最终2 | Send Final2 | 送信最終2 | 전송 최종2
- ✅ 发送最终2
- ✅ Send Final2
- ✅ 送信最終2
- ✅ 전송 최종2

### v70.6 投射最终2 | Cast Final2 | キャスト最終2 | 캐스트 최종2
- ✅ 投射最终2
- ✅ Cast Final2
- ✅ キャスト最終2
- ✅ 캐스트 최종2

### v70.7 手势最终2 | Gesture Final2 | ジェスチャー最終2 | 제스처 최종2
- ✅ 手势最终2
- ✅ Gesture Final2
- ✅ ジェスチャー最終2
- ✅ 제스처 최종2

### v70.8 过滤最终2 | Filter Final2 | フィルター最終2 | 필터 최종2
- ✅ 过滤最终2
- ✅ Filter Final2
- ✅ フィルター最終2
- ✅ 필터 최종2

### v70.9 缓存最终2 | Cache Final2 | キャッシュ最終2 | 캐시 최종2
- ✅ 缓存最终2
- ✅ Cache Final2
- ✅ キャッシュ最終2
- ✅ 캐시 최종2

### v70.10 进度条最终2 | Progress Final2 | プログレス最終2 | 진행 바 최종2
- ✅ 进度条最终2
- ✅ Progress Final2
- ✅ プログレス最終2
- ✅ 진행 바 최종2

### v70.11 字体最终3 | Font Final3 | フォント最終3 | 글꼴 최종3
- ✅ 字体最终3
- ✅ Font Final3
- ✅ フォント最終3
- ✅ 글꼴 최종3

### v70.12 色彩最终4 | Color Final4 | 色最終4 | 색상 최종4
- ✅ 色彩最终4
- ✅ Color Final4
- ✅ 色最終4
- ✅ 색상 최종4

### v70.13 音量最终4 | Volume Final4 | 音量最終4 | 볼륨 최종4
- ✅ 音量最终4
- ✅ Volume Final4
- ✅ 音量最終4
- ✅ 볼륨 최종4

### v70.14 背景最终2 | Bg Final2 | 背景最終2 | 배경 최종2
- ✅ 背景最终2
- ✅ Bg Final2
- ✅ 背景最終2
- ✅ 배경 최종2

### v70.15 投射字幕最终2 | Cast Subtitle Final2 | キャスト字幕最終2 | 캐스트 자막 최종2
- ✅ 投射字幕最终2
- ✅ Cast Subtitle Final2
- ✅ キャスト字幕最終2
- ✅ 캐스트 자막 최종2


### v71.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v71.1-v71.15 功能列表
- ✅ Video Stabilization Strength, Danmaku Collision Avoidance, Subtitle Word Wrap Mode, Gesture Sensitivity Profile, Cast Video Stabilization, Playlist Auto Recover, Cache Integrity Check, Progress Bar Chapter Marks, Volume Normalization Auto, History Auto Sync, Playback Resume From Bookmark, Screenshot Auto Annotate, Video HDR10+, Danmaku Layer Management, Subtitle Line Spacing Custom

### v71.1 视频防抖强度 | Video Stabilization Strength | ビデオ手ブレ補正強度 | 비디오 안정화 강도
- ✅ 视频防抖强度
- ✅ Video Stabilization Strength
- ✅ ビデオ手ブレ補正強度
- ✅ 비디오 안정화 강도

### v71.2 弹幕避碰 | Danmaku Collision Avoidance | コメント衝突回避 | 댓글 충돌 회피
- ✅ 弹幕避碰
- ✅ Danmaku Collision Avoidance
- ✅ コメント衝突回避
- ✅ 댓글 충돌 회피

### v71.3 字幕换行模式 | Subtitle Word Wrap Mode | 字幕折り返しモード | 자막 줄 바꿈 모드
- ✅ 字幕换行模式
- ✅ Subtitle Word Wrap Mode
- ✅ 字幕折り返しモード
- ✅ 자막 줄 바꿈 모드

### v71.4 手势灵敏度配置 | Gesture Sensitivity Profile | ジェスチャー感度プロファイル | 제스처 감도 프로필
- ✅ 手势灵敏度配置
- ✅ Gesture Sensitivity Profile
- ✅ ジェスチャー感度プロファイル
- ✅ 제스처 감도 프로필

### v71.5 投射视频防抖 | Cast Video Stabilization | キャストビデオ手ブレ補正 | 캐스트 비디오 안정화
- ✅ 投射视频防抖
- ✅ Cast Video Stabilization
- ✅ キャストビデオ手ブレ補正
- ✅ 캐스트 비디오 안정화

### v71.6 播放列表自动恢复 | Playlist Auto Recover | プレイリスト自動復元 | 재생 목록 자동 복구
- ✅ 播放列表自动恢复
- ✅ Playlist Auto Recover
- ✅ プレイリスト自動復元
- ✅ 재생 목록 자동 복구

### v71.7 缓存完整性检查 | Cache Integrity Check | キャッシュ整合性チェック | 캐시 무결성 검사
- ✅ 缓存完整性检查
- ✅ Cache Integrity Check
- ✅ キャッシュ整合性チェック
- ✅ 캐시 무결성 검사

### v71.8 进度条章节标记 | Progress Bar Chapter Marks | プログレスバーチャプターマーク | 진행 바 챕터 마크
- ✅ 进度条章节标记
- ✅ Progress Bar Chapter Marks
- ✅ プログレスバーチャプターマーク
- ✅ 진행 바 챕터 마크

### v71.9 音量自动标准化 | Volume Normalization Auto | 音量自動正規化 | 볼륨 자동 정규화
- ✅ 音量自动标准化
- ✅ Volume Normalization Auto
- ✅ 音量自動正規化
- ✅ 볼륨 자동 정규화

### v71.10 历史记录自动同步 | History Auto Sync | 履歴自動同期 | 기록 자동 동기화
- ✅ 历史记录自动同步
- ✅ History Auto Sync
- ✅ 履歴自動同期
- ✅ 기록 자동 동기화

### v71.11 从书签恢复播放 | Playback Resume From Bookmark | ブックマークから再生再開 | 북마크에서 재생 재개
- ✅ 从书签恢复播放
- ✅ Playback Resume From Bookmark
- ✅ ブックマークから再生再開
- ✅ 북마크에서 재생 재개

### v71.12 截图自动标注 | Screenshot Auto Annotate | スクリーンショット自動注釈 | 스크린샷 자동 주석
- ✅ 截图自动标注
- ✅ Screenshot Auto Annotate
- ✅ スクリーンショット自動注釈
- ✅ 스크린샷 자동 주석

### v71.13 视频 HDR10+ | Video HDR10+ | ビデオ HDR10+ | 비디오 HDR10+
- ✅ 视频 HDR10+
- ✅ Video HDR10+
- ✅ ビデオ HDR10+
- ✅ 비디오 HDR10+

### v71.14 弹幕图层管理 | Danmaku Layer Management | コメントレイヤー管理 | 댓글 레이어 관리
- ✅ 弹幕图层管理
- ✅ Danmaku Layer Management
- ✅ コメントレイヤー管理
- ✅ 댓글 레이어 관리

### v71.15 字幕行距自定义 | Subtitle Line Spacing Custom | 字幕行間カスタム | 자막 줄 간격 사용자 정의
- ✅ 字幕行距自定义
- ✅ Subtitle Line Spacing Custom
- ✅ 字幕行間カスタム
- ✅ 자막 줄 간격 사용자 정의

### v72.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v72.1-v72.15 功能列表
- ✅ Video Frame Rate Convert, Danmaku Priority System, Subtitle Char Spacing Custom, Gesture Dead Zone Custom, Cast Audio Normalization, Playlist Auto Recover Mode, Cache Deduplication, Progress Bar Buffer Indicator, Volume Compression Strength, History Auto Backup, Playback Auto Bookmark, Screenshot Auto Share, Video Dolby Vision Profile, Danmaku Animation Effects, Subtitle BG Gradient Custom

### v72.1 视频帧率转换 | Video Frame Rate Convert | ビデオフレームレート変換 | 비디오 프레임레이트 변환
- ✅ 视频帧率转换
- ✅ Video Frame Rate Convert
- ✅ ビデオフレームレート変換
- ✅ 비디오 프레임레이트 변환

### v72.2 弹幕优先级系统 | Danmaku Priority System | コメント優先度システム | 댓글 우선순위 시스템
- ✅ 弹幕优先级系统
- ✅ Danmaku Priority System
- ✅ コメント優先度システム
- ✅ 댓글 우선순위 시스템

### v72.3 字幕字符间距自定义 | Subtitle Char Spacing Custom | 字幕文字間隔カスタム | 자막 문자 간격 사용자 정의
- ✅ 字幕字符间距自定义
- ✅ Subtitle Char Spacing Custom
- ✅ 字幕文字間隔カスタム
- ✅ 자막 문자 간격 사용자 정의

### v72.4 手势死区自定义 | Gesture Dead Zone Custom | ジェスチャーデッドゾーンカスタム | 제스처 데드존 사용자 정의
- ✅ 手势死区自定义
- ✅ Gesture Dead Zone Custom
- ✅ ジェスチャーデッドゾーンカスタム
- ✅ 제스처 데드존 사용자 정의

### v72.5 投射音频标准化 | Cast Audio Normalization | キャスト音声正規化 | 캐스트 오디오 정규화
- ✅ 投射音频标准化
- ✅ Cast Audio Normalization
- ✅ キャスト音声正規化
- ✅ 캐스트 오디오 정규화

### v72.6 播放列表自动恢复模式 | Playlist Auto Recover Mode | プレイリスト自動復元モード | 재생 목록 자동 복구 모드
- ✅ 播放列表自动恢复模式
- ✅ Playlist Auto Recover Mode
- ✅ プレイリスト自動復元モード
- ✅ 재생 목록 자동 복구 모드

### v72.7 缓存去重 | Cache Deduplication | キャッシュ重複排除 | 캐시 중복 제거
- ✅ 缓存去重
- ✅ Cache Deduplication
- ✅ キャッシュ重複排除
- ✅ 캐시 중복 제거

### v72.8 进度条缓冲指示器 | Progress Bar Buffer Indicator | プログレスバーバッファインジケーター | 진행 바 버퍼 표시기
- ✅ 进度条缓冲指示器
- ✅ Progress Bar Buffer Indicator
- ✅ プログレスバーバッファインジケーター
- ✅ 진행 바 버퍼 표시기

### v72.9 音量压缩强度 | Volume Compression Strength | 音量圧縮強度 | 볼륨 압축 강도
- ✅ 音量压缩强度
- ✅ Volume Compression Strength
- ✅ 音量圧縮強度
- ✅ 볼륨 압축 강도

### v72.10 历史记录自动备份 | History Auto Backup | 履歴自動バックアップ | 기록 자동 백업
- ✅ 历史记录自动备份
- ✅ History Auto Backup
- ✅ 履歴自動バックアップ
- ✅ 기록 자동 백업

### v72.11 播放自动书签 | Playback Auto Bookmark | 再生自動ブックマーク | 재생 자동 북마크
- ✅ 播放自动书签
- ✅ Playback Auto Bookmark
- ✅ 再生自動ブックマーク
- ✅ 재생 자동 북마크

### v72.12 截图自动分享 | Screenshot Auto Share | スクリーンショット自動共有 | 스크린샷 자동 공유
- ✅ 截图自动分享
- ✅ Screenshot Auto Share
- ✅ スクリーンショット自動共有
- ✅ 스크린샷 자동 공유

### v72.13 视频杜比视界配置 | Video Dolby Vision Profile | ビデオドルビービジョンプロファイル | 비디오 돌비 비전 프로필
- ✅ 视频杜比视界配置
- ✅ Video Dolby Vision Profile
- ✅ ビデオドルビービジョンプロファイル
- ✅ 비디오 돌비 비전 프로필

### v72.14 弹幕动画效果 | Danmaku Animation Effects | コメントアニメーション効果 | 댓글 애니메이션 효과
- ✅ 弹幕动画效果
- ✅ Danmaku Animation Effects
- ✅ コメントアニメーション効果
- ✅ 댓글 애니메이션 효과

### v72.15 字幕背景渐变自定义 | Subtitle BG Gradient Custom | 字幕背景グラデーションカスタム | 자막 배경 그라데이션 사용자 정의
- ✅ 字幕背景渐变自定义
- ✅ Subtitle BG Gradient Custom
- ✅ 字幕背景グラデーションカスタム
- ✅ 자막 배경 그라데이션 사용자 정의

### v73.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v73.1-v73.15 功能列表
- ✅ Video Color Space Convert, Danmaku Scroll Direction Custom, Subtitle Animation Custom, Gesture Feedback Mode, Cast Video Color Space, Playlist Auto Recover Priority, Cache Verification Mode, Progress Bar Thumb Style, Volume Expansion Strength, History Auto Sync Mode, Playback Auto Bookmark Mode, Screenshot Auto Edit, Video Alpha Channel, Danmaku Font Weight Adaptive, Subtitle Outline Effects

### v73.1 视频色彩空间转换 | Video Color Space Convert | ビデオ色空間変換 | 비디오 색 공간 변환
- ✅ 视频色彩空间转换
- ✅ Video Color Space Convert
- ✅ ビデオ色空間変換
- ✅ 비디오 색 공간 변환

### v73.2 弹幕滚动方向自定义 | Danmaku Scroll Direction Custom | コメントスクロール方向カスタム | 댓글 스크롤 방향 사용자 정의
- ✅ 弹幕滚动方向自定义
- ✅ Danmaku Scroll Direction Custom
- ✅ コメントスクロール方向カスタム
- ✅ 댓글 스크롤 방향 사용자 정의

### v73.3 字幕动画自定义 | Subtitle Animation Custom | 字幕アニメーションカスタム | 자막 애니메이션 사용자 정의
- ✅ 字幕动画自定义
- ✅ Subtitle Animation Custom
- ✅ 字幕アニメーションカスタム
- ✅ 자막 애니메이션 사용자 정의

### v73.4 手势反馈模式 | Gesture Feedback Mode | ジェスチャーフィードバックモード | 제스처 피드백 모드
- ✅ 手势反馈模式
- ✅ Gesture Feedback Mode
- ✅ ジェスチャーフィードバックモード
- ✅ 제스처 피드백 모드

### v73.5 投射视频色彩空间 | Cast Video Color Space | キャストビデオ色空間 | 캐스트 비디오 색 공간
- ✅ 投射视频色彩空间
- ✅ Cast Video Color Space
- ✅ キャストビデオ色空間
- ✅ 캐스트 비디오 색 공간

### v73.6 播放列表自动恢复优先级 | Playlist Auto Recover Priority | プレイリスト自動復元優先度 | 재생 목록 자동 복구 우선순위
- ✅ 播放列表自动恢复优先级
- ✅ Playlist Auto Recover Priority
- ✅ プレイリスト自動復元優先度
- ✅ 재생 목록 자동 복구 우선순위

### v73.7 缓存验证模式 | Cache Verification Mode | キャッシュ検証モード | 캐시 검증 모드
- ✅ 缓存验证模式
- ✅ Cache Verification Mode
- ✅ キャッシュ検証モード
- ✅ 캐시 검증 모드

### v73.8 进度条滑块样式 | Progress Bar Thumb Style | プログレスバーサムスタイル | 진행 바 썸 스타일
- ✅ 进度条滑块样式
- ✅ Progress Bar Thumb Style
- ✅ プログレスバーサムスタイル
- ✅ 진행 바 썸 스타일

### v73.9 音量扩展强度 | Volume Expansion Strength | 音量拡張強度 | 볼륨 확장 강도
- ✅ 音量扩展强度
- ✅ Volume Expansion Strength
- ✅ 音量拡張強度
- ✅ 볼륨 확장 강도

### v73.10 历史记录自动同步模式 | History Auto Sync Mode | 履歴自動同期モード | 기록 자동 동기화 모드
- ✅ 历史记录自动同步模式
- ✅ History Auto Sync Mode
- ✅ 履歴自動同期モード
- ✅ 기록 자동 동기화 모드

### v73.11 播放自动书签模式 | Playback Auto Bookmark Mode | 再生自動ブックマークモード | 재생 자동 북마크 모드
- ✅ 播放自动书签模式
- ✅ Playback Auto Bookmark Mode
- ✅ 再生自動ブックマークモード
- ✅ 재생 자동 북마크 모드

### v73.12 截图自动编辑 | Screenshot Auto Edit | スクリーンショット自動編集 | 스크린샷 자동 편집
- ✅ 截图自动编辑
- ✅ Screenshot Auto Edit
- ✅ スクリーンショット自動編集
- ✅ 스크린샷 자동 편집

### v73.13 视频Alpha通道 | Video Alpha Channel | ビデオアルファチャンネル | 비디오 알파 채널
- ✅ 视频Alpha通道
- ✅ Video Alpha Channel
- ✅ ビデオアルファチャンネル
- ✅ 비디오 알파 채널

### v73.14 弹幕字体粗细自适应 | Danmaku Font Weight Adaptive | コメントフォント太さ適応 | 댓글 글꼴 두께 적응
- ✅ 弹幕字体粗细自适应
- ✅ Danmaku Font Weight Adaptive
- ✅ コメントフォント太さ適応
- ✅ 댓글 글꼴 두께 적응

### v73.15 字幕描边效果 | Subtitle Outline Effects | 字幕アウトライン効果 | 자막 외곽선 효과
- ✅ 字幕描边效果
- ✅ Subtitle Outline Effects
- ✅ 字幕アウトライン効果
- ✅ 자막 외곽선 효과

### v74.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v74.1-v74.15 功能列表
- ✅ Video Depth Of Field, Danmaku Background Blur, Subtitle Shadow Effects, Gesture Animation Mode, Cast Video HDR10+, Playlist Auto Recover Time, Cache Compression Mode, Progress Bar Seek Preview, Volume Equalizer Preset, History Auto Backup Mode, Playback Auto Pause On Focus, Screenshot Auto Crop, Video Bokeh Effect, Danmaku Shadow Effects, Subtitle Glow Effects

### v74.1 视频景深 | Video Depth Of Field | ビデオ被写界深度 | 비디오 피사계 심도
- ✅ 视频景深
- ✅ Video Depth Of Field
- ✅ ビデオ被写界深度
- ✅ 비디오 피사계 심도

### v74.2 弹幕背景模糊 | Danmaku Background Blur | コメント背景ブラー | 댓글 배경 블러
- ✅ 弹幕背景模糊
- ✅ Danmaku Background Blur
- ✅ コメント背景ブラー
- ✅ 댓글 배경 블러

### v74.3 字幕阴影效果 | Subtitle Shadow Effects | 字幕シャドウ効果 | 자막 그림자 효과
- ✅ 字幕阴影效果
- ✅ Subtitle Shadow Effects
- ✅ 字幕シャドウ効果
- ✅ 자막 그림자 효과

### v74.4 手势动画模式 | Gesture Animation Mode | ジェスチャーアニメーションモード | 제스처 애니메이션 모드
- ✅ 手势动画模式
- ✅ Gesture Animation Mode
- ✅ ジェスチャーアニメーションモード
- ✅ 제스처 애니메이션 모드

### v74.5 投射视频HDR10+ | Cast Video HDR10+ | キャストビデオHDR10+ | 캐스트 비디오 HDR10+
- ✅ 投射视频HDR10+
- ✅ Cast Video HDR10+
- ✅ キャストビデオHDR10+
- ✅ 캐스트 비디오 HDR10+

### v74.6 播放列表自动恢复时间 | Playlist Auto Recover Time | プレイリスト自動復元時間 | 재생 목록 자동 복구 시간
- ✅ 播放列表自动恢复时间
- ✅ Playlist Auto Recover Time
- ✅ プレイリスト自動復元時間
- ✅ 재생 목록 자동 복구 시간

### v74.7 缓存压缩模式 | Cache Compression Mode | キャッシュ圧縮モード | 캐시 압축 모드
- ✅ 缓存压缩模式
- ✅ Cache Compression Mode
- ✅ キャッシュ圧縮モード
- ✅ 캐시 압축 모드

### v74.8 进度条跳转预览 | Progress Bar Seek Preview | プログレスバーシークプレビュー | 진행 바 탐색 미리보기
- ✅ 进度条跳转预览
- ✅ Progress Bar Seek Preview
- ✅ プログレスバーシークプレビュー
- ✅ 진행 바 탐색 미리보기

### v74.9 音量均衡器预设 | Volume Equalizer Preset | 音量イコライザープリセット | 볼륨 이퀄라이저 프리셋
- ✅ 音量均衡器预设
- ✅ Volume Equalizer Preset
- ✅ 音量イコライザープリセット
- ✅ 볼륨 이퀄라이저 프리셋

### v74.10 历史记录自动备份模式 | History Auto Backup Mode | 履歴自動バックアップモード | 기록 자동 백업 모드
- ✅ 历史记录自动备份模式
- ✅ History Auto Backup Mode
- ✅ 履歴自動バックアップモード
- ✅ 기록 자동 백업 모드

### v74.11 焦点变化时自动暂停 | Playback Auto Pause On Focus | フォーカス変更時自動一時停止 | 포커스 변경 시 자동 일시정지
- ✅ 焦点变化时自动暂停
- ✅ Playback Auto Pause On Focus
- ✅ フォーカス変更時自動一時停止
- ✅ 포커스 변경 시 자동 일시정지

### v74.12 截图自动裁剪 | Screenshot Auto Crop | スクリーンショット自動クロップ | 스크린샷 자동 크롭
- ✅ 截图自动裁剪
- ✅ Screenshot Auto Crop
- ✅ スクリーンショット自動クロップ
- ✅ 스크린샷 자동 크롭

### v74.13 视频虚化效果 | Video Bokeh Effect | ビデオボケ効果 | 비디오 보케 효과
- ✅ 视频虚化效果
- ✅ Video Bokeh Effect
- ✅ ビデオボケ効果
- ✅ 비디오 보케 효과

### v74.14 弹幕阴影效果 | Danmaku Shadow Effects | コメントシャドウ効果 | 댓글 그림자 효과
- ✅ 弹幕阴影效果
- ✅ Danmaku Shadow Effects
- ✅ コメントシャドウ効果
- ✅ 댓글 그림자 효과

### v74.15 字幕发光效果 | Subtitle Glow Effects | 字幕グロー効果 | 자막 글로우 효과
- ✅ 字幕发光效果
- ✅ Subtitle Glow Effects
- ✅ 字幕グロー効果
- ✅ 자막 글로우 효과

### v75.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v75.1-v75.15 功能列表
- ✅ Video Chroma Key, Danmaku Glow Effects, Subtitle Border Effects, Gesture Sound Feedback, Cast Audio Spatial, Playlist Auto Recover Source, Cache Encryption Mode, Progress Bar Chapter Preview, Volume Spatial Audio, History Auto Restore, Playback Auto Resume On Return, Screenshot Auto Filter, Video Frame Blend, Danmaku Border Effects, Subtitle Animation Speed

### v75.1 视频色度键 | Video Chroma Key | ビデオクロマキー | 비디오 크로마 키
- ✅ 视频色度键
- ✅ Video Chroma Key
- ✅ ビデオクロマキー
- ✅ 비디오 크로마 키

### v75.2 弹幕发光效果 | Danmaku Glow Effects | コメントグロー効果 | 댓글 글로우 효과
- ✅ 弹幕发光效果
- ✅ Danmaku Glow Effects
- ✅ コメントグロー効果
- ✅ 댓글 글로우 효과

### v75.3 字幕边框效果 | Subtitle Border Effects | 字幕ボーダー効果 | 자막 테두리 효과
- ✅ 字幕边框效果
- ✅ Subtitle Border Effects
- ✅ 字幕ボーダー効果
- ✅ 자막 테두리 효과

### v75.4 手势声音反馈 | Gesture Sound Feedback | ジェスチャー音声フィードバック | 제스처 소리 피드백
- ✅ 手势声音反馈
- ✅ Gesture Sound Feedback
- ✅ ジェスチャー音声フィードバック
- ✅ 제스처 소리 피드백

### v75.5 投射音频空间音效 | Cast Audio Spatial | キャスト音声空間音響 | 캐스트 오디오 공간 음향
- ✅ 投射音频空间音效
- ✅ Cast Audio Spatial
- ✅ キャスト音声空間音響
- ✅ 캐스트 오디오 공간 음향

### v75.6 播放列表自动恢复来源 | Playlist Auto Recover Source | プレイリスト自動復元ソース | 재생 목록 자동 복구 소스
- ✅ 播放列表自动恢复来源
- ✅ Playlist Auto Recover Source
- ✅ プレイリスト自動復元ソース
- ✅ 재생 목록 자동 복구 소스

### v75.7 缓存加密模式 | Cache Encryption Mode | キャッシュ暗号化モード | 캐시 암호화 모드
- ✅ 缓存加密模式
- ✅ Cache Encryption Mode
- ✅ キャッシュ暗号化モード
- ✅ 캐시 암호화 모드

### v75.8 进度条章节预览 | Progress Bar Chapter Preview | プログレスバーチャプタープレビュー | 진행 바 챕터 미리보기
- ✅ 进度条章节预览
- ✅ Progress Bar Chapter Preview
- ✅ プログレスバーチャプタープレビュー
- ✅ 진행 바 챕터 미리보기

### v75.9 音量空间音效 | Volume Spatial Audio | 音量空間音響 | 볼륨 공간 음향
- ✅ 音量空间音效
- ✅ Volume Spatial Audio
- ✅ 音量空間音響
- ✅ 볼륨 공간 음향

### v75.10 历史记录自动恢复 | History Auto Restore | 履歴自動復元 | 기록 자동 복원
- ✅ 历史记录自动恢复
- ✅ History Auto Restore
- ✅ 履歴自動復元
- ✅ 기록 자동 복원

### v75.11 返回时自动恢复播放 | Playback Auto Resume On Return | 復帰時自動再生再開 | 복귀 시 자동 재생 재개
- ✅ 返回时自动恢复播放
- ✅ Playback Auto Resume On Return
- ✅ 復帰時自動再生再開
- ✅ 복귀 시 자동 재생 재개

### v75.12 截图自动滤镜 | Screenshot Auto Filter | スクリーンショット自動フィルター | 스크린샷 자동 필터
- ✅ 截图自动滤镜
- ✅ Screenshot Auto Filter
- ✅ スクリーンショット自動フィルター
- ✅ 스크린샷 자동 필터

### v75.13 视频帧混合 | Video Frame Blend | ビデオフレームブレンド | 비디오 프레임 블렌드
- ✅ 视频帧混合
- ✅ Video Frame Blend
- ✅ ビデオフレームブレンド
- ✅ 비디오 프레임 블렌드

### v75.14 弹幕边框效果 | Danmaku Border Effects | コメントボーダー効果 | 댓글 테두리 효과
- ✅ 弹幕边框效果
- ✅ Danmaku Border Effects
- ✅ コメントボーダー効果
- ✅ 댓글 테두리 효과

### v75.15 字幕动画速度 | Subtitle Animation Speed | 字幕アニメーション速度 | 자막 애니메이션 속도
- ✅ 字幕动画速度
- ✅ Subtitle Animation Speed
- ✅ 字幕アニメーション速度
- ✅ 자막 애니메이션 속도

### v76.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v76.1-v76.15 功能列表
- ✅ Video Color Grading Preset, Danmaku Font Style Custom, Subtitle Font Style Custom, Gesture Vibration Feedback, Cast Video Dolby Atmos, Playlist Auto Recover Strategy, Cache Location Mode, Progress Bar Buffer Color, Volume 3D Audio, History Auto Sync Source, Playback Auto Skip Silence, Screenshot Auto Annotate Mode, Video LUT Custom, Danmaku Font Custom Path, Subtitle Font Weight Custom

### v76.1 视频调色预设 | Video Color Grading Preset | ビデオカラーグレーディングプリセット | 비디오 컬러 그레이딩 프리셋
- ✅ 视频调色预设
- ✅ Video Color Grading Preset
- ✅ ビデオカラーグレーディングプリセット
- ✅ 비디오 컬러 그레이딩 프리셋

### v76.2 弹幕字体样式自定义 | Danmaku Font Style Custom | コメントフォントスタイルカスタム | 댓글 글꼴 스타일 사용자 정의
- ✅ 弹幕字体样式自定义
- ✅ Danmaku Font Style Custom
- ✅ コメントフォントスタイルカスタム
- ✅ 댓글 글꼴 스타일 사용자 정의

### v76.3 字幕字体样式自定义 | Subtitle Font Style Custom | 字幕フォントスタイルカスタム | 자막 글꼴 스타일 사용자 정의
- ✅ 字幕字体样式自定义
- ✅ Subtitle Font Style Custom
- ✅ 字幕フォントスタイルカスタム
- ✅ 자막 글꼴 스타일 사용자 정의

### v76.4 手势振动反馈 | Gesture Vibration Feedback | ジェスチャー振動フィードバック | 제스처 진동 피드백
- ✅ 手势振动反馈
- ✅ Gesture Vibration Feedback
- ✅ ジェスチャー振動フィードバック
- ✅ 제스처 진동 피드백

### v76.5 投射视频杜比全景声 | Cast Video Dolby Atmos | キャストビデオドルビーアトモス | 캐스트 비디오 돌비 애트모스
- ✅ 投射视频杜比全景声
- ✅ Cast Video Dolby Atmos
- ✅ キャストビデオドルビーアトモス
- ✅ 캐스트 비디오 돌비 애트모스

### v76.6 播放列表自动恢复策略 | Playlist Auto Recover Strategy | プレイリスト自動復元戦略 | 재생 목록 자동 복구 전략
- ✅ 播放列表自动恢复策略
- ✅ Playlist Auto Recover Strategy
- ✅ プレイリスト自動復元戦略
- ✅ 재생 목록 자동 복구 전략

### v76.7 缓存位置模式 | Cache Location Mode | キャッシュロケーションモード | 캐시 위치 모드
- ✅ 缓存位置模式
- ✅ Cache Location Mode
- ✅ キャッシュロケーションモード
- ✅ 캐시 위치 모드

### v76.8 进度条缓冲颜色 | Progress Bar Buffer Color | プログレスバーバッファカラー | 진행 바 버퍼 색상
- ✅ 进度条缓冲颜色
- ✅ Progress Bar Buffer Color
- ✅ プログレスバーバッファカラー
- ✅ 진행 바 버퍼 색상

### v76.9 音量3D音效 | Volume 3D Audio | 音量3D音響 | 볼륨 3D 오디오
- ✅ 音量3D音效
- ✅ Volume 3D Audio
- ✅ 音量3D音響
- ✅ 볼륨 3D 오디오

### v76.10 历史记录自动同步来源 | History Auto Sync Source | 履歴自動同期ソース | 기록 자동 동기화 소스
- ✅ 历史记录自动同步来源
- ✅ History Auto Sync Source
- ✅ 履歴自動同期ソース
- ✅ 기록 자동 동기화 소스

### v76.11 播放自动跳过静音 | Playback Auto Skip Silence | 再生自動無音スキップ | 재생 자동 무음 건너뛰기
- ✅ 播放自动跳过静音
- ✅ Playback Auto Skip Silence
- ✅ 再生自動無音スキップ
- ✅ 재생 자동 무음 건너뛰기

### v76.12 截图自动标注模式 | Screenshot Auto Annotate Mode | スクリーンショット自動注釈モード | 스크린샷 자동 주석 모드
- ✅ 截图自动标注模式
- ✅ Screenshot Auto Annotate Mode
- ✅ スクリーンショット自動注釈モード
- ✅ 스크린샷 자동 주석 모드

### v76.13 视频LUT自定义 | Video LUT Custom | ビデオLUTカスタム | 비디오 LUT 사용자 정의
- ✅ 视频LUT自定义
- ✅ Video LUT Custom
- ✅ ビデオLUTカスタム
- ✅ 비디오 LUT 사용자 정의

### v76.14 弹幕字体自定义路径 | Danmaku Font Custom Path | コメントフォントカスタムパス | 댓글 글꼴 사용자 정의 경로
- ✅ 弹幕字体自定义路径
- ✅ Danmaku Font Custom Path
- ✅ コメントフォントカスタムパス
- ✅ 댓글 글꼴 사용자 정의 경로

### v76.15 字幕字体粗细自定义 | Subtitle Font Weight Custom | 字幕フォント太さカスタム | 자막 글꼴 두께 사용자 정의
- ✅ 字幕字体粗细自定义
- ✅ Subtitle Font Weight Custom
- ✅ 字幕フォント太さカスタム
- ✅ 자막 글꼴 두께 사용자 정의

### v77.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v77.1-v77.15 功能列表
- ✅ Video Frame Interpolation, Danmaku Priority Custom, Subtitle Kerning Custom, Gesture Visual Feedback, Cast Audio 3D, Playlist Auto Recover Limit, Cache Priority Mode, Progress Bar Thumb Color, Volume Auto Leveling, History Auto Backup Source, Playback Auto Skip Intro Custom, Screenshot Auto Share Mode, Video Motion Blur, Danmaku Layer Custom, Subtitle Letter Spacing Custom

### v77.1 视频帧插值 | Video Frame Interpolation | ビデオフレーム補間 | 비디오 프레임 보간
- ✅ 视频帧插值
- ✅ Video Frame Interpolation
- ✅ ビデオフレーム補間
- ✅ 비디오 프레임 보간

### v77.2 弹幕优先级自定义 | Danmaku Priority Custom | コメント優先度カスタム | 댓글 우선순위 사용자 정의
- ✅ 弹幕优先级自定义
- ✅ Danmaku Priority Custom
- ✅ コメント優先度カスタム
- ✅ 댓글 우선순위 사용자 정의

### v77.3 字幕字距调整自定义 | Subtitle Kerning Custom | 字幕カーニングカスタム | 자막 커닝 사용자 정의
- ✅ 字幕字距调整自定义
- ✅ Subtitle Kerning Custom
- ✅ 字幕カーニングカスタム
- ✅ 자막 커닝 사용자 정의

### v77.4 手势视觉反馈 | Gesture Visual Feedback | ジェスチャー視覚フィードバック | 제스처 시각 피드백
- ✅ 手势视觉反馈
- ✅ Gesture Visual Feedback
- ✅ ジェスチャー視覚フィードバック
- ✅ 제스처 시각 피드백

### v77.5 投射音频3D | Cast Audio 3D | キャスト音声3D | 캐스트 오디오 3D
- ✅ 投射音频3D
- ✅ Cast Audio 3D
- ✅ キャスト音声3D
- ✅ 캐스트 오디오 3D

### v77.6 播放列表自动恢复限制 | Playlist Auto Recover Limit | プレイリスト自動復元制限 | 재생 목록 자동 복구 제한
- ✅ 播放列表自动恢复限制
- ✅ Playlist Auto Recover Limit
- ✅ プレイリスト自動復元制限
- ✅ 재생 목록 자동 복구 제한

### v77.7 缓存优先级模式 | Cache Priority Mode | キャッシュ優先モード | 캐시 우선 모드
- ✅ 缓存优先级模式
- ✅ Cache Priority Mode
- ✅ キャッシュ優先モード
- ✅ 캐시 우선 모드

### v77.8 进度条滑块颜色 | Progress Bar Thumb Color | プログレスバーサムカラー | 진행 바 썸 색상
- ✅ 进度条滑块颜色
- ✅ Progress Bar Thumb Color
- ✅ プログレスバーサムカラー
- ✅ 진행 바 썸 색상

### v77.9 音量自动调平 | Volume Auto Leveling | 音量自動レベル調整 | 볼륨 자동 레벨링
- ✅ 音量自动调平
- ✅ Volume Auto Leveling
- ✅ 音量自動レベル調整
- ✅ 볼륨 자동 레벨링

### v77.10 历史记录自动备份来源 | History Auto Backup Source | 履歴自動バックアップソース | 기록 자동 백업 소스
- ✅ 历史记录自动备份来源
- ✅ History Auto Backup Source
- ✅ 履歴自動バックアップソース
- ✅ 기록 자동 백업 소스

### v77.11 播放自动跳过片头自定义 | Playback Auto Skip Intro Custom | 再生自動イントロスキップカスタム | 재생 자동 인트로 건너뛰기 사용자 정의
- ✅ 播放自动跳过片头自定义
- ✅ Playback Auto Skip Intro Custom
- ✅ 再生自動イントロスキップカスタム
- ✅ 재생 자동 인트로 건너뛰기 사용자 정의

### v77.12 截图自动分享模式 | Screenshot Auto Share Mode | スクリーンショット自動共有モード | 스크린샷 자동 공유 모드
- ✅ 截图自动分享模式
- ✅ Screenshot Auto Share Mode
- ✅ スクリーンショット自動共有モード
- ✅ 스크린샷 자동 공유 모드

### v77.13 视频运动模糊 | Video Motion Blur | ビデオモーションブラー | 비디오 모션 블러
- ✅ 视频运动模糊
- ✅ Video Motion Blur
- ✅ ビデオモーションブラー
- ✅ 비디오 모션 블러

### v77.14 弹幕图层自定义 | Danmaku Layer Custom | コメントレイヤーカスタム | 댓글 레이어 사용자 정의
- ✅ 弹幕图层自定义
- ✅ Danmaku Layer Custom
- ✅ コメントレイヤーカスタム
- ✅ 댓글 레이어 사용자 정의

### v77.15 字幕字母间距自定义 | Subtitle Letter Spacing Custom | 字幕文字間隔カスタム | 자막 자간 사용자 정의
- ✅ 字幕字母间距自定义
- ✅ Subtitle Letter Spacing Custom
- ✅ 字幕文字間隔カスタム
- ✅ 자막 자간 사용자 정의

### v78.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v78.1-v78.15 功能列表
- ✅ Video Adaptive Resolution, Danmaku Collision Mode, Subtitle Animation Delay, Gesture Long Press Duration, Cast Video Dolby Vision IQ, Playlist Auto Recover Time Limit, Cache Size Limit Custom, Progress Bar Thumb Opacity, Volume Auto Leveling Mode, History Auto Sync Time, Playback Auto Skip Outro Custom, Screenshot Auto Edit Mode, Video Adaptive Bitrate, Danmaku Scroll Speed Adaptive, Subtitle Font Stretch Custom

### v78.1 视频自适应分辨率 | Video Adaptive Resolution | ビデオ適応解像度 | 비디오 적응형 해상도
- ✅ 视频自适应分辨率
- ✅ Video Adaptive Resolution
- ✅ ビデオ適応解像度
- ✅ 비디오 적응형 해상도

### v78.2 弹幕碰撞模式 | Danmaku Collision Mode | コメント衝突モード | 댓글 충돌 모드
- ✅ 弹幕碰撞模式
- ✅ Danmaku Collision Mode
- ✅ コメント衝突モード
- ✅ 댓글 충돌 모드

### v78.3 字幕动画延迟 | Subtitle Animation Delay | 字幕アニメーション遅延 | 자막 애니메이션 지연
- ✅ 字幕动画延迟
- ✅ Subtitle Animation Delay
- ✅ 字幕アニメーション遅延
- ✅ 자막 애니메이션 지연

### v78.4 手势长按时间 | Gesture Long Press Duration | ジェスチャー長押し時間 | 제스처 길게 누르기 시간
- ✅ 手势长按时间
- ✅ Gesture Long Press Duration
- ✅ ジェスチャー長押し時間
- ✅ 제스처 길게 누르기 시간

### v78.5 投射视频杜比视界IQ | Cast Video Dolby Vision IQ | キャストビデオドルビービジョンIQ | 캐스트 비디오 돌비 비전 IQ
- ✅ 投射视频杜比视界IQ
- ✅ Cast Video Dolby Vision IQ
- ✅ キャストビデオドルビービジョンIQ
- ✅ 캐스트 비디오 돌비 비전 IQ

### v78.6 播放列表自动恢复时间限制 | Playlist Auto Recover Time Limit | プレイリスト自動復元時間制限 | 재생 목록 자동 복구 시간 제한
- ✅ 播放列表自动恢复时间限制
- ✅ Playlist Auto Recover Time Limit
- ✅ プレイリスト自動復元時間制限
- ✅ 재생 목록 자동 복구 시간 제한

### v78.7 缓存大小限制自定义 | Cache Size Limit Custom | キャッシュサイズ制限カスタム | 캐시 크기 제한 사용자 정의
- ✅ 缓存大小限制自定义
- ✅ Cache Size Limit Custom
- ✅ キャッシュサイズ制限カスタム
- ✅ 캐시 크기 제한 사용자 정의

### v78.8 进度条滑块透明度 | Progress Bar Thumb Opacity | プログレスバーサム不透明度 | 진행 바 썸 불투명도
- ✅ 进度条滑块透明度
- ✅ Progress Bar Thumb Opacity
- ✅ プログレスバーサム不透明度
- ✅ 진행 바 썸 불투명도

### v78.9 音量自动调平模式 | Volume Auto Leveling Mode | 音量自動レベル調整モード | 볼륨 자동 레벨링 모드
- ✅ 音量自动调平模式
- ✅ Volume Auto Leveling Mode
- ✅ 音量自動レベル調整モード
- ✅ 볼륨 자동 레벨링 모드

### v78.10 历史记录自动同步时间 | History Auto Sync Time | 履歴自動同期時間 | 기록 자동 동기화 시간
- ✅ 历史记录自动同步时间
- ✅ History Auto Sync Time
- ✅ 履歴自動同期時間
- ✅ 기록 자동 동기화 시간

### v78.11 播放自动跳过片尾自定义 | Playback Auto Skip Outro Custom | 再生自動アウトロスキップカスタム | 재생 자동 아웃로 건너뛰기 사용자 정의
- ✅ 播放自动跳过片尾自定义
- ✅ Playback Auto Skip Outro Custom
- ✅ 再生自動アウトロスキップカスタム
- ✅ 재생 자동 아웃로 건너뛰기 사용자 정의

### v78.12 截图自动编辑模式 | Screenshot Auto Edit Mode | スクリーンショット自動編集モード | 스크린샷 자동 편집 모드
- ✅ 截图自动编辑模式
- ✅ Screenshot Auto Edit Mode
- ✅ スクリーンショット自動編集モード
- ✅ 스크린샷 자동 편집 모드

### v78.13 视频自适应码率 | Video Adaptive Bitrate | ビデオ適応ビットレート | 비디오 적응형 비트레이트
- ✅ 视频自适应码率
- ✅ Video Adaptive Bitrate
- ✅ ビデオ適応ビットレート
- ✅ 비디오 적응형 비트레이트

### v78.14 弹幕滚动速度自适应 | Danmaku Scroll Speed Adaptive | コメントスクロール速度適応 | 댓글 스크롤 속도 적응
- ✅ 弹幕滚动速度自适应
- ✅ Danmaku Scroll Speed Adaptive
- ✅ コメントスクロール速度適応
- ✅ 댓글 스크롤 속도 적응

### v78.15 字幕字体拉伸自定义 | Subtitle Font Stretch Custom | 字幕フォントストレッチカスタム | 자막 글꼴 스트레치 사용자 정의
- ✅ 字幕字体拉伸自定义
- ✅ Subtitle Font Stretch Custom
- ✅ 字幕フォントストレッチカスタム
- ✅ 자막 글꼴 스트레치 사용자 정의

### v79.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v79.1-v79.15 功能列表
- ✅ Video Color Grading Custom, Danmaku Font Spacing Adaptive, Subtitle Animation Type, Gesture Swipe Velocity, Cast Audio Spatial Custom, Playlist Auto Recover Source Mode, Cache Cleanup Strategy Custom, Progress Bar Thumb Animation, Volume Auto Leveling Strength, History Auto Backup Time, Playback Auto Bookmark Custom, Screenshot Auto Crop Mode, Video Adaptive Frame Rate, Danmaku Font Weight Custom, Subtitle Animation Duration

### v79.1 视频调色自定义 | Video Color Grading Custom | ビデオカラーグレーディングカスタム | 비디오 컬러 그레이딩 사용자 정의
- ✅ 视频调色自定义
- ✅ Video Color Grading Custom
- ✅ ビデオカラーグレーディングカスタム
- ✅ 비디오 컬러 그레이딩 사용자 정의

### v79.2 弹幕字体间距自适应 | Danmaku Font Spacing Adaptive | コメントフォント間隔適応 | 댓글 글꼴 간격 적응
- ✅ 弹幕字体间距自适应
- ✅ Danmaku Font Spacing Adaptive
- ✅ コメントフォント間隔適応
- ✅ 댓글 글꼴 간격 적응

### v79.3 字幕动画类型 | Subtitle Animation Type | 字幕アニメーションタイプ | 자막 애니메이션 유형
- ✅ 字幕动画类型
- ✅ Subtitle Animation Type
- ✅ 字幕アニメーションタイプ
- ✅ 자막 애니메이션 유형

### v79.4 手势滑动速度 | Gesture Swipe Velocity | ジェスチャースワイプ速度 | 제스처 스와이프 속도
- ✅ 手势滑动速度
- ✅ Gesture Swipe Velocity
- ✅ ジェスチャースワイプ速度
- ✅ 제스처 스와이프 속도

### v79.5 投射音频空间音效自定义 | Cast Audio Spatial Custom | キャスト音声空間音響カスタム | 캐스트 오디오 공간 음향 사용자 정의
- ✅ 投射音频空间音效自定义
- ✅ Cast Audio Spatial Custom
- ✅ キャスト音声空間音響カスタム
- ✅ 캐스트 오디오 공간 음향 사용자 정의

### v79.6 播放列表自动恢复来源模式 | Playlist Auto Recover Source Mode | プレイリスト自動復元ソースモード | 재생 목록 자동 복구 소스 모드
- ✅ 播放列表自动恢复来源模式
- ✅ Playlist Auto Recover Source Mode
- ✅ プレイリスト自動復元ソースモード
- ✅ 재생 목록 자동 복구 소스 모드

### v79.7 缓存清理策略自定义 | Cache Cleanup Strategy Custom | キャッシュクリーンアップ戦略カスタム | 캐시 정리 전략 사용자 정의
- ✅ 缓存清理策略自定义
- ✅ Cache Cleanup Strategy Custom
- ✅ キャッシュクリーンアップ戦略カスタム
- ✅ 캐시 정리 전략 사용자 정의

### v79.8 进度条滑块动画 | Progress Bar Thumb Animation | プログレスバーサムアニメーション | 진행 바 썸 애니메이션
- ✅ 进度条滑块动画
- ✅ Progress Bar Thumb Animation
- ✅ プログレスバーサムアニメーション
- ✅ 진행 바 썸 애니메이션

### v79.9 音量自动调平强度 | Volume Auto Leveling Strength | 音量自動レベル調整強度 | 볼륨 자동 레벨링 강도
- ✅ 音量自动调平强度
- ✅ Volume Auto Leveling Strength
- ✅ 音量自動レベル調整強度
- ✅ 볼륨 자동 레벨링 강도

### v79.10 历史记录自动备份时间 | History Auto Backup Time | 履歴自動バックアップ時間 | 기록 자동 백업 시간
- ✅ 历史记录自动备份时间
- ✅ History Auto Backup Time
- ✅ 履歴自動バックアップ時間
- ✅ 기록 자동 백업 시간

### v79.11 播放自动书签自定义 | Playback Auto Bookmark Custom | 再生自動ブックマークカスタム | 재생 자동 북마크 사용자 정의
- ✅ 播放自动书签自定义
- ✅ Playback Auto Bookmark Custom
- ✅ 再生自動ブックマークカスタム
- ✅ 재생 자동 북마크 사용자 정의

### v79.12 截图自动裁剪模式 | Screenshot Auto Crop Mode | スクリーンショット自動クロップモード | 스크린샷 자동 크롭 모드
- ✅ 截图自动裁剪模式
- ✅ Screenshot Auto Crop Mode
- ✅ スクリーンショット自動クロップモード
- ✅ 스크린샷 자동 크롭 모드

### v79.13 视频自适应帧率 | Video Adaptive Frame Rate | ビデオ適応フレームレート | 비디오 적응형 프레임레이트
- ✅ 视频自适应帧率
- ✅ Video Adaptive Frame Rate
- ✅ ビデオ適応フレームレート
- ✅ 비디오 적응형 프레임레이트

### v79.14 弹幕字体粗细自定义 | Danmaku Font Weight Custom | コメントフォント太さカスタム | 댓글 글꼴 두께 사용자 정의
- ✅ 弹幕字体粗细自定义
- ✅ Danmaku Font Weight Custom
- ✅ コメントフォント太さカスタム
- ✅ 댓글 글꼴 두께 사용자 정의

### v79.15 字幕动画持续时间 | Subtitle Animation Duration | 字幕アニメーション持続時間 | 자막 애니메이션 지속 시간
- ✅ 字幕动画持续时间
- ✅ Subtitle Animation Duration
- ✅ 字幕アニメーション持続時間
- ✅ 자막 애니메이션 지속 시간

### v80.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v80.1-v80.15 功能列表
- ✅ Video Adaptive Color Grading, Danmaku Collision Strength, Subtitle Animation Easing, Gesture Swipe Acceleration Custom, Cast Video Dolby Vision Custom, Playlist Auto Recover Strategy Custom, Cache Encryption Custom, Progress Bar Thumb Size Custom, Volume Auto Leveling Custom, History Auto Sync Custom, Playback Auto Resume Custom, Screenshot Auto Share Custom, Video Adaptive Motion Blur, Danmaku Font Spacing Custom, Subtitle Animation Loop

### v80.1 视频自适应调色 | Video Adaptive Color Grading | ビデオ適応カラーグレーディング | 비디오 적응형 컬러 그레이딩
- ✅ 视频自适应调色
- ✅ Video Adaptive Color Grading
- ✅ ビデオ適応カラーグレーディング
- ✅ 비디오 적응형 컬러 그레이딩

### v80.2 弹幕碰撞强度 | Danmaku Collision Strength | コメント衝突強度 | 댓글 충돌 강도
- ✅ 弹幕碰撞强度
- ✅ Danmaku Collision Strength
- ✅ コメント衝突強度
- ✅ 댓글 충돌 강도

### v80.3 字幕动画缓动 | Subtitle Animation Easing | 字幕アニメーションイージング | 자막 애니메이션 이징
- ✅ 字幕动画缓动
- ✅ Subtitle Animation Easing
- ✅ 字幕アニメーションイージング
- ✅ 자막 애니메이션 이징

### v80.4 手势滑动加速度自定义 | Gesture Swipe Acceleration Custom | ジェスチャースワイプ加速度カスタム | 제스처 스와이프 가속도 사용자 정의
- ✅ 手势滑动加速度自定义
- ✅ Gesture Swipe Acceleration Custom
- ✅ ジェスチャースワイプ加速度カスタム
- ✅ 제스처 스와이프 가속도 사용자 정의

### v80.5 投射视频杜比视界自定义 | Cast Video Dolby Vision Custom | キャストビデオドルビービジョンカスタム | 캐스트 비디오 돌비 비전 사용자 정의
- ✅ 投射视频杜比视界自定义
- ✅ Cast Video Dolby Vision Custom
- ✅ キャストビデオドルビービジョンカスタム
- ✅ 캐스트 비디오 돌비 비전 사용자 정의

### v80.6 播放列表自动恢复策略自定义 | Playlist Auto Recover Strategy Custom | プレイリスト自動復元戦略カスタム | 재생 목록 자동 복구 전략 사용자 정의
- ✅ 播放列表自动恢复策略自定义
- ✅ Playlist Auto Recover Strategy Custom
- ✅ プレイリスト自動復元戦略カスタム
- ✅ 재생 목록 자동 복구 전략 사용자 정의

### v80.7 缓存加密自定义 | Cache Encryption Custom | キャッシュ暗号化カスタム | 캐시 암호화 사용자 정의
- ✅ 缓存加密自定义
- ✅ Cache Encryption Custom
- ✅ キャッシュ暗号化カスタム
- ✅ 캐시 암호화 사용자 정의

### v80.8 进度条滑块大小自定义 | Progress Bar Thumb Size Custom | プログレスバーサムサイズカスタム | 진행 바 썸 크기 사용자 정의
- ✅ 进度条滑块大小自定义
- ✅ Progress Bar Thumb Size Custom
- ✅ プログレスバーサムサイズカスタム
- ✅ 진행 바 썸 크기 사용자 정의

### v80.9 音量自动调平自定义 | Volume Auto Leveling Custom | 音量自動レベル調整カスタム | 볼륨 자동 레벨링 사용자 정의
- ✅ 音量自动调平自定义
- ✅ Volume Auto Leveling Custom
- ✅ 音量自動レベル調整カスタム
- ✅ 볼륨 자동 레벨링 사용자 정의

### v80.10 历史记录自动同步自定义 | History Auto Sync Custom | 履歴自動同期カスタム | 기록 자동 동기화 사용자 정의
- ✅ 历史记录自动同步自定义
- ✅ History Auto Sync Custom
- ✅ 履歴自動同期カスタム
- ✅ 기록 자동 동기화 사용자 정의

### v80.11 播放自动恢复自定义 | Playback Auto Resume Custom | 再生自動再開カスタム | 재생 자동 재개 사용자 정의
- ✅ 播放自动恢复自定义
- ✅ Playback Auto Resume Custom
- ✅ 再生自動再開カスタム
- ✅ 재생 자동 재개 사용자 정의

### v80.12 截图自动分享自定义 | Screenshot Auto Share Custom | スクリーンショット自動共有カスタム | 스크린샷 자동 공유 사용자 정의
- ✅ 截图自动分享自定义
- ✅ Screenshot Auto Share Custom
- ✅ スクリーンショット自動共有カスタム
- ✅ 스크린샷 자동 공유 사용자 정의

### v80.13 视频自适应运动模糊 | Video Adaptive Motion Blur | ビデオ適応モーションブラー | 비디오 적응형 모션 블러
- ✅ 视频自适应运动模糊
- ✅ Video Adaptive Motion Blur
- ✅ ビデオ適応モーションブラー
- ✅ 비디오 적응형 모션 블러

### v80.14 弹幕字体间距自定义 | Danmaku Font Spacing Custom | コメントフォント間隔カスタム | 댓글 글꼴 간격 사용자 정의
- ✅ 弹幕字体间距自定义
- ✅ Danmaku Font Spacing Custom
- ✅ コメントフォント間隔カスタム
- ✅ 댓글 글꼴 간격 사용자 정의

### v80.15 字幕动画循环 | Subtitle Animation Loop | 字幕アニメーションループ | 자막 애니메이션 루프
- ✅ 字幕动画循环
- ✅ Subtitle Animation Loop
- ✅ 字幕アニメーションループ
- ✅ 자막 애니메이션 루프


### v81.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v81.1-v81.15 功能列表
- ✅ Network Bandwidth Adapt, Danmaku Opacity Curve Custom, Subtitle Position Lock, Gesture Pinch Zoom Speed, Cast Reconnect Auto, Playlist Bookmark Sync, Cache Prebuffer Size, Progress Bar Double Tap Seek, Volume Loudness Normalize, History Search Filter, Playback Skip Ad Auto, Screenshot Count Display, Video Upscale AI, Danmaku Send Rate Limit, Subtitle Timing Offset

### v81.1 网络带宽自适应 | Network Bandwidth Adapt | ネットワーク帯域適応 | 네트워크 대역폭 적응
- ✅ 网络带宽自适应
- ✅ Network Bandwidth Adapt
- ✅ ネットワーク帯域適応
- ✅ 네트워크 대역폭 적응

### v81.2 弹幕透明度曲线自定义 | Danmaku Opacity Curve Custom | コメント透明度曲線カスタム | 댓글 불투명도 곡선 사용자 정의
- ✅ 弹幕透明度曲线自定义
- ✅ Danmaku Opacity Curve Custom
- ✅ コメント透明度曲線カスタム
- ✅ 댓글 불투명도 곡선 사용자 정의

### v81.3 字幕位置锁定 | Subtitle Position Lock | 字幕位置ロック | 자막 위치 잠금
- ✅ 字幕位置锁定
- ✅ Subtitle Position Lock
- ✅ 字幕位置ロック
- ✅ 자막 위치 잠금

### v81.4 手势捏合缩放速度 | Gesture Pinch Zoom Speed | ジェスチャーピンチズーム速度 | 제스처 핀치 줌 속도
- ✅ 手势捏合缩放速度
- ✅ Gesture Pinch Zoom Speed
- ✅ ジェスチャーピンチズーム速度
- ✅ 제스처 핀치 줌 속도

### v81.5 投射自动重连 | Cast Reconnect Auto | キャスト自動再接続 | 캐스트 자동 재연결
- ✅ 投射自动重连
- ✅ Cast Reconnect Auto
- ✅ キャスト自動再接続
- ✅ 캐스트 자동 재연결

### v81.6 播放列表书签同步 | Playlist Bookmark Sync | プレイリストブックマーク同期 | 재생 목록 북마크 동기화
- ✅ 播放列表书签同步
- ✅ Playlist Bookmark Sync
- ✅ プレイリストブックマーク同期
- ✅ 재생 목록 북마크 동기화

### v81.7 缓存预缓冲大小 | Cache Prebuffer Size | キャッシュプリバッファサイズ | 캐시 프리버퍼 크기
- ✅ 缓存预缓冲大小
- ✅ Cache Prebuffer Size
- ✅ キャッシュプリバッファサイズ
- ✅ 캐시 프리버퍼 크기

### v81.8 进度条双击跳转 | Progress Bar Double Tap Seek | プログレスバーダブルタップシーク | 진행 바 더블탭 탐색
- ✅ 进度条双击跳转
- ✅ Progress Bar Double Tap Seek
- ✅ プログレスバーダブルタップシーク
- ✅ 진행 바 더블탭 탐색

### v81.9 音量响度标准化 | Volume Loudness Normalize | 音量ラウドネス正規化 | 볼륨 음량 정규화
- ✅ 音量响度标准化
- ✅ Volume Loudness Normalize
- ✅ 音量ラウドネス正規化
- ✅ 볼륨 음량 정규화

### v81.10 历史记录搜索过滤 | History Search Filter | 履歴検索フィルター | 기록 검색 필터
- ✅ 历史记录搜索过滤
- ✅ History Search Filter
- ✅ 履歴検索フィルター
- ✅ 기록 검색 필터

### v81.11 播放自动跳过广告 | Playback Skip Ad Auto | 再生自動広告スキップ | 재생 자동 광고 건너뛰기
- ✅ 播放自动跳过广告
- ✅ Playback Skip Ad Auto
- ✅ 再生自動広告スキップ
- ✅ 재생 자동 광고 건너뛰기

### v81.12 截图计数显示 | Screenshot Count Display | スクリーンショットカウント表示 | 스크린샷 카운트 표시
- ✅ 截图计数显示
- ✅ Screenshot Count Display
- ✅ スクリーンショットカウント表示
- ✅ 스크린샷 카운트 표시

### v81.13 视频AI超分辨率 | Video Upscale AI | ビデオAIアップスケール | 비디오 AI 업스케일
- ✅ 视频AI超分辨率
- ✅ Video Upscale AI
- ✅ ビデオAIアップスケール
- ✅ 비디오 AI 업스케일

### v81.14 弹幕发送速率限制 | Danmaku Send Rate Limit | コメント送信レート制限 | 댓글 전송 속도 제한
- ✅ 弹幕发送速率限制
- ✅ Danmaku Send Rate Limit
- ✅ コメント送信レート制限
- ✅ 댓글 전송 속도 제한

### v81.15 字幕时间偏移 | Subtitle Timing Offset | 字幕タイミングオフセット | 자막 타이밍 오프셋
- ✅ 字幕时间偏移
- ✅ Subtitle Timing Offset
- ✅ 字幕タイミングオフセット
- ✅ 자막 타이밍 오프셋

### v82.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v82.1-v82.15 功能列表
- ✅ Video Deinterlace Mode, Danmaku Font Size Auto Range, Subtitle BG Blur Custom, Gesture Edge Swipe Action, Cast Video Bitrate Limit, Playlist Duplicate Detect, Cache Smart Prefetch, Progress Bar Swipe Seek, Volume Night Mode, History Group By Date, Playback Speed Memory, Screenshot Timestamp, Video Color Temperature Custom, Danmaku Merge Algorithm, Subtitle Sync Auto

### v82.1 视频去隔行模式 | Video Deinterlace Mode | ビデオインターレース解除モード | 비디오 디인터레이스 모드
- ✅ 视频去隔行模式
- ✅ Video Deinterlace Mode
- ✅ ビデオインターレース解除モード
- ✅ 비디오 디인터레이스 모드

### v82.2 弹幕字体大小自动范围 | Danmaku Font Size Auto Range | コメントフォントサイズ自動範囲 | 댓글 글꼴 크기 자동 범위
- ✅ 弹幕字体大小自动范围
- ✅ Danmaku Font Size Auto Range
- ✅ コメントフォントサイズ自動範囲
- ✅ 댓글 글꼴 크기 자동 범위

### v82.3 字幕背景模糊自定义 | Subtitle BG Blur Custom | 字幕背景ブラーーカスタム | 자막 배경 블러 사용자 정의
- ✅ 字幕背景模糊自定义
- ✅ Subtitle BG Blur Custom
- ✅ 字幕背景ブラーーカスタム
- ✅ 자막 배경 블러 사용자 정의

### v82.4 手势边缘滑动动作 | Gesture Edge Swipe Action | ジェスチャーエッジスワイプアクション | 제스처 가장자리 스와이프 동작
- ✅ 手势边缘滑动动作
- ✅ Gesture Edge Swipe Action
- ✅ ジェスチャーエッジスワイプアクション
- ✅ 제스처 가장자리 스와이프 동작

### v82.5 投射视频码率限制 | Cast Video Bitrate Limit | キャストビデオビットレート制限 | 캐스트 비디오 비트레이트 제한
- ✅ 投射视频码率限制
- ✅ Cast Video Bitrate Limit
- ✅ キャストビデオビットレート制限
- ✅ 캐스트 비디오 비트레이트 제한

### v82.6 播放列表重复检测 | Playlist Duplicate Detect | プレイリスト重複検出 | 재생 목록 중복 감지
- ✅ 播放列表重复检测
- ✅ Playlist Duplicate Detect
- ✅ プレイリスト重複検出
- ✅ 재생 목록 중복 감지

### v82.7 缓存智能预取 | Cache Smart Prefetch | キャッシュスマートプリフェッチ | 캐시 스마트 프리페치
- ✅ 缓存智能预取
- ✅ Cache Smart Prefetch
- ✅ キャッシュスマートプリフェッチ
- ✅ 캐시 스마트 프리페치

### v82.8 进度条滑动跳转 | Progress Bar Swipe Seek | プログレスバースワイプシーク | 진행 바 스와이프 탐색
- ✅ 进度条滑动跳转
- ✅ Progress Bar Swipe Seek
- ✅ プログレスバースワイプシーク
- ✅ 진행 바 스와이프 탐색

### v82.9 音量夜间模式 | Volume Night Mode | 音量ナイトモード | 볼륨 나이트 모드
- ✅ 音量夜间模式
- ✅ Volume Night Mode
- ✅ 音量ナイトモード
- ✅ 볼륨 나이트 모드

### v82.10 历史记录按日期分组 | History Group By Date | 履歴日付グループ化 | 기록 날짜별 그룹화
- ✅ 历史记录按日期分组
- ✅ History Group By Date
- ✅ 履歴日付グループ化
- ✅ 기록 날짜별 그룹화

### v82.11 播放速度记忆 | Playback Speed Memory | 再生速度メモリ | 재생 속도 기억
- ✅ 播放速度记忆
- ✅ Playback Speed Memory
- ✅ 再生速度メモリ
- ✅ 재생 속도 기억

### v82.12 截图时间戳 | Screenshot Timestamp | スクリーンショットタイムスタンプ | 스크린샷 타임스탬프
- ✅ 截图时间戳
- ✅ Screenshot Timestamp
- ✅ スクリーンショットタイムスタンプ
- ✅ 스크린샷 타임스탬프

### v82.13 视频色温自定义 | Video Color Temperature Custom | ビデオ色温度カスタム | 비디오 색온도 사용자 정의
- ✅ 视频色温自定义
- ✅ Video Color Temperature Custom
- ✅ ビデオ色温度カスタム
- ✅ 비디오 색온도 사용자 정의

### v82.14 弹幕合并算法 | Danmaku Merge Algorithm | コメントマージアルゴリズム | 댓글 병합 알고리즘
- ✅ 弹幕合并算法
- ✅ Danmaku Merge Algorithm
- ✅ コメントマージアルゴリズム
- ✅ 댓글 병합 알고리즘

### v82.15 字幕自动同步 | Subtitle Sync Auto | 字幕自動同期 | 자막 자동 동기화
- ✅ 字幕自动同步
- ✅ Subtitle Sync Auto
- ✅ 字幕自動同期
- ✅ 자막 자동 동기화

### v83.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v83.1-v83.15 功能列表
- ✅ Video Noise Gate Custom, Danmaku Scroll Momentum, Subtitle Karaoke Highlight, Gesture Three Finger Action, Cast Audio Delay, Playlist Smart Sort, Cache WiFi Priority, Progress Bar Gesture Area, Volume Balance L-R, History Max Items, Playback Auto Next Episode, Screenshot Overlay Info, VideoImageSharp Custom, Danmaku Color Palette, Subtitle BG Opacity Custom

### v83.1 视频噪声门自定义 | Video Noise Gate Custom | ビデオノイズゲートカスタム | 비디오 노이즈 게이트 사용자 정의
- ✅ 视频噪声门自定义
- ✅ Video Noise Gate Custom
- ✅ ビデオノイズゲートカスタム
- ✅ 비디오 노이즈 게이트 사용자 정의

### v83.2 弹幕滚动惯性 | Danmaku Scroll Momentum | コメントスクロールモメンタム | 댓글 스크롤 관성
- ✅ 弹幕滚动惯性
- ✅ Danmaku Scroll Momentum
- ✅ コメントスクロールモメンタム
- ✅ 댓글 스크롤 관성

### v83.3 字幕卡拉OK高亮 | Subtitle Karaoke Highlight | 字幕カラオケハイライト | 자막 가라오케 하이라이트
- ✅ 字幕卡拉OK高亮
- ✅ Subtitle Karaoke Highlight
- ✅ 字幕カラオケハイライト
- ✅ 자막 가라오케 하이라이트

### v83.4 手势三指动作 | Gesture Three Finger Action | ジェスチャー3本指アクション | 제스처 세 손가락 동작
- ✅ 手势三指动作
- ✅ Gesture Three Finger Action
- ✅ ジェスチャー3本指アクション
- ✅ 제스처 세 손가락 동작

### v83.5 投射音频延迟 | Cast Audio Delay | キャスト音声遅延 | 캐스트 오디오 지연
- ✅ 投射音频延迟
- ✅ Cast Audio Delay
- ✅ キャスト音声遅延
- ✅ 캐스트 오디오 지연

### v83.6 播放列表智能排序 | Playlist Smart Sort | プレイリストスマートソート | 재생 목록 스마트 정렬
- ✅ 播放列表智能排序
- ✅ Playlist Smart Sort
- ✅ プレイリストスマートソート
- ✅ 재생 목록 스마트 정렬

### v83.7 缓存WiFi优先 | Cache WiFi Priority | キャッシュWiFi優先 | 캐시 WiFi 우선
- ✅ 缓存WiFi优先
- ✅ Cache WiFi Priority
- ✅ キャッシュWiFi優先
- ✅ 캐시 WiFi 우선

### v83.8 进度条手势区域 | Progress Bar Gesture Area | プログレスバージェスチャーエリア | 진행 바 제스처 영역
- ✅ 进度条手势区域
- ✅ Progress Bar Gesture Area
- ✅ プログレスバージェスチャーエリア
- ✅ 진행 바 제스처 영역

### v83.9 音量左右平衡 | Volume Balance L-R | 音量LRバランス | 볼륨 좌우 밸런스
- ✅ 音量左右平衡
- ✅ Volume Balance L-R
- ✅ 音量LRバランス
- ✅ 볼륨 좌우 밸런스

### v83.10 历史记录最大条目 | History Max Items | 履歴最大アイテム数 | 기록 최대 항목 수
- ✅ 历史记录最大条目
- ✅ History Max Items
- ✅ 履歴最大アイテム数
- ✅ 기록 최대 항목 수

### v83.11 播放自动下一集 | Playback Auto Next Episode | 再生自動次エピソード | 재생 자동 다음 에피소드
- ✅ 播放自动下一集
- ✅ Playback Auto Next Episode
- ✅ 再生自動次エピソード
- ✅ 재생 자동 다음 에피소드

### v83.12 截图叠加信息 | Screenshot Overlay Info | スクリーンショットオーバーレイ情報 | 스크린샷 오버레이 정보
- ✅ 截图叠加信息
- ✅ Screenshot Overlay Info
- ✅ スクリーンショットオーバーレイ情報
- ✅ 스크린샷 오버레이 정보

### v83.13 视频亮度锐化自定义 | VideoImageSharp Custom | ビデオ輝度シャープカスタム | 비디오 밝기 선명도 사용자 정의
- ✅ 视频亮度锐化自定义
- ✅ VideoImageSharp Custom
- ✅ ビデオ輝度シャープカスタム
- ✅ 비디오 밝기 선명도 사용자 정의

### v83.14 弹幕调色板 | Danmaku Color Palette | コメントカラーパレット | 댓글 색상 팔레트
- ✅ 弹幕调色板
- ✅ Danmaku Color Palette
- ✅ コメントカラーパレット
- ✅ 댓글 색상 팔레트

### v83.15 字幕背景透明度自定义 | Subtitle BG Opacity Custom | 字幕背景透明度カスタム | 자막 배경 불투명도 사용자 정의
- ✅ 字幕背景透明度自定义
- ✅ Subtitle BG Opacity Custom
- ✅ 字幕背景透明度カスタム
- ✅ 자막 배경 불투명도 사용자 정의

### v84.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v84.1-v84.15 功能列表
- ✅ Video Detail Enhance Custom, Danmaku Scroll Friction, Subtitle Bilingual Display, Gesture Four Finger Action, Cast Video HDR10 Custom, Playlist Auto Play Next, Cache Storage Analyze, Progress Bar Haptic Feedback, Volume Fade In Duration, History Auto Cleanup, Playback Auto Play On Open, Screenshot Folder Path, Video Vividness Custom, Danmaku Font Italic Toggle, Subtitle Position Custom

### v84.1 视频细节增强自定义 | Video Detail Enhance Custom | ビデオディテールエンハンスカスタム | 비디오 디테일 강화 사용자 정의
- ✅ 视频细节增强自定义
- ✅ Video Detail Enhance Custom
- ✅ ビデオディテールエンハンスカスタム
- ✅ 비디오 디테일 강화 사용자 정의

### v84.2 弹幕滚动摩擦 | Danmaku Scroll Friction | コメントスクロール摩擦 | 댓글 스크롤 마찰
- ✅ 弹幕滚动摩擦
- ✅ Danmaku Scroll Friction
- ✅ コメントスクロール摩擦
- ✅ 댓글 스크롤 마찰

### v84.3 字幕双语显示 | Subtitle Bilingual Display | 字幕バイリンガル表示 | 자막 이중 언어 표시
- ✅ 字幕双语显示
- ✅ Subtitle Bilingual Display
- ✅ 字幕バイリンガル表示
- ✅ 자막 이중 언어 표시

### v84.4 手势四指动作 | Gesture Four Finger Action | ジェスチャー4本指アクション | 제스처 네 손가락 동작
- ✅ 手势四指动作
- ✅ Gesture Four Finger Action
- ✅ ジェスチャー4本指アクション
- ✅ 제스처 네 손가락 동작

### v84.5 投射视频HDR10自定义 | Cast Video HDR10 Custom | キャストビデオHDR10カスタム | 캐스트 비디오 HDR10 사용자 정의
- ✅ 投射视频HDR10自定义
- ✅ Cast Video HDR10 Custom
- ✅ キャストビデオHDR10カスタム
- ✅ 캐스트 비디오 HDR10 사용자 정의

### v84.6 播放列表自动播放下一个 | Playlist Auto Play Next | プレイリスト自動次再生 | 재생 목록 자동 다음 재생
- ✅ 播放列表自动播放下一个
- ✅ Playlist Auto Play Next
- ✅ プレイリスト自動次再生
- ✅ 재생 목록 자동 다음 재생

### v84.7 缓存存储分析 | Cache Storage Analyze | キャッシュストレージ分析 | 캐시 저장 공간 분석
- ✅ 缓存存储分析
- ✅ Cache Storage Analyze
- ✅ キャッシュストレージ分析
- ✅ 캐시 저장 공간 분석

### v84.8 进度条触觉反馈 | Progress Bar Haptic Feedback | プログレスバーハプティックフィードバック | 진행 바 햅틱 피드백
- ✅ 进度条触觉反馈
- ✅ Progress Bar Haptic Feedback
- ✅ プログレスバーハプティックフィードバック
- ✅ 진행 바 햅틱 피드백

### v84.9 音量淡入时间 | Volume Fade In Duration | 音量フェードイン時間 | 볼륨 페이드인 시간
- ✅ 音量淡入时间
- ✅ Volume Fade In Duration
- ✅ 音量フェードイン時間
- ✅ 볼륨 페이드인 시간

### v84.10 历史记录自动清理 | History Auto Cleanup | 履歴自動クリーンアップ | 기록 자동 정리
- ✅ 历史记录自动清理
- ✅ History Auto Cleanup
- ✅ 履歴自動クリーンアップ
- ✅ 기록 자동 정리

### v84.11 打开时自动播放 | Playback Auto Play On Open | オープン時自動再生 | 열 때 자동 재생
- ✅ 打开时自动播放
- ✅ Playback Auto Play On Open
- ✅ オープン時自動再生
- ✅ 열 때 자동 재생

### v84.12 截图文件夹路径 | Screenshot Folder Path | スクリーンショットフォルダパス | 스크린샷 폴더 경로
- ✅ 截图文件夹路径
- ✅ Screenshot Folder Path
- ✅ スクリーンショットフォルダパス
- ✅ 스크린샷 폴더 경로

### v84.13 视频鲜艳度自定义 | Video Vividness Custom | ビデオビビッドネスカスタム | 비디오 선명도 사용자 정의
- ✅ 视频鲜艳度自定义
- ✅ Video Vividness Custom
- ✅ ビデオビビッドネスカスタム
- ✅ 비디오 선명도 사용자 정의

### v84.14 弹幕字体斜体开关 | Danmaku Font Italic Toggle | コメントフォントイタリック切替 | 댓글 글꼴 이탤릭 전환
- ✅ 弹幕字体斜体开关
- ✅ Danmaku Font Italic Toggle
- ✅ コメントフォントイタリック切替
- ✅ 댓글 글꼴 이탤릭 전환

### v84.15 字幕位置自定义 | Subtitle Position Custom | 字幕位置カスタム | 자막 위치 사용자 정의
- ✅ 字幕位置自定义
- ✅ Subtitle Position Custom
- ✅ 字幕位置カスタム
- ✅ 자막 위치 사용자 정의

### v85.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v85.1-v85.15 功能列表
- ✅ Video Luma Sharpen Custom, Danmaku BG Padding Custom, Subtitle BG Color Custom, Gesture Long Press Action, Cast Audio Codec Custom, Playlist Auto Load More, Cache Cleanup On Low Storage, Progress Bar Tooltip, Volume Fade Out Duration, History Export Format, Playback Auto Loop Single, Screenshot Naming Rule, Video Chroma Sharpen Custom, Danmaku BG Border Toggle, Subtitle Font Size Auto

### v85.1 视频亮度锐化自定义 | Video Luma Sharpen Custom | ビデオ輝度シャープカスタム | 비디오 휘도 선명도 사용자 정의
- ✅ 视频亮度锐化自定义
- ✅ Video Luma Sharpen Custom
- ✅ ビデオ輝度シャープカスタム
- ✅ 비디오 휘도 선명도 사용자 정의

### v85.2 弹幕背景填充自定义 | Danmaku BG Padding Custom | コメントBGパディングカスタム | 댓글 배경 패딩 사용자 정의
- ✅ 弹幕背景填充自定义
- ✅ Danmaku BG Padding Custom
- ✅ コメントBGパディングカスタム
- ✅ 댓글 배경 패딩 사용자 정의

### v85.3 字幕背景颜色自定义 | Subtitle BG Color Custom | 字幕背景色カスタム | 자막 배경 색상 사용자 정의
- ✅ 字幕背景颜色自定义
- ✅ Subtitle BG Color Custom
- ✅ 字幕背景色カスタム
- ✅ 자막 배경 색상 사용자 정의

### v85.4 手势长按动作 | Gesture Long Press Action | ジェスチャー長押しアクション | 제스처 길게 누르기 동작
- ✅ 手势长按动作
- ✅ Gesture Long Press Action
- ✅ ジェスチャー長押しアクション
- ✅ 제스처 길게 누르기 동작

### v85.5 投射音频编码自定义 | Cast Audio Codec Custom | キャスト音声コーデックカスタム | 캐스트 오디오 코덱 사용자 정의
- ✅ 投射音频编码自定义
- ✅ Cast Audio Codec Custom
- ✅ キャスト音声コーデックカスタム
- ✅ 캐스트 오디오 코덱 사용자 정의

### v85.6 播放列表自动加载更多 | Playlist Auto Load More | プレイリスト自動読み込み | 재생 목록 자동 더 불러오기
- ✅ 播放列表自动加载更多
- ✅ Playlist Auto Load More
- ✅ プレイリスト自動読み込み
- ✅ 재생 목록 자동 더 불러오기

### v85.7 低存储时清理缓存 | Cache Cleanup On Low Storage | 低容量時キャッシュクリーンアップ | 저용량 시 캐시 정리
- ✅ 低存储时清理缓存
- ✅ Cache Cleanup On Low Storage
- ✅ 低容量時キャッシュクリーンアップ
- ✅ 저용량 시 캐시 정리

### v85.8 进度条工具提示 | Progress Bar Tooltip | プログレスバーツールチップ | 진행 바 툴팁
- ✅ 进度条工具提示
- ✅ Progress Bar Tooltip
- ✅ プログレスバーツールチップ
- ✅ 진행 바 툴팁

### v85.9 音量淡出时间 | Volume Fade Out Duration | 音量フェードアウト時間 | 볼륨 페이드아웃 시간
- ✅ 音量淡出时间
- ✅ Volume Fade Out Duration
- ✅ 音量フェードアウト時間
- ✅ 볼륨 페이드아웃 시간

### v85.10 历史记录导出格式 | History Export Format | 履歴エクスポート形式 | 기록 내보내기 형식
- ✅ 历史记录导出格式
- ✅ History Export Format
- ✅ 履歴エクスポート形式
- ✅ 기록 내보내기 형식

### v85.11 播放自动单曲循环 | Playback Auto Loop Single | 再生自動シングルループ | 재생 자동 단일 반복
- ✅ 播放自动单曲循环
- ✅ Playback Auto Loop Single
- ✅ 再生自動シングルループ
- ✅ 재생 자동 단일 반복

### v85.12 截图命名规则 | Screenshot Naming Rule | スクリーンショット命名規則 | 스크린샷 이름 규칙
- ✅ 截图命名规则
- ✅ Screenshot Naming Rule
- ✅ スクリーンショット命名規則
- ✅ 스크린샷 이름 규칙

### v85.13 视频色度锐化自定义 | Video Chroma Sharpen Custom | ビデオクロマシャープカスタム | 비디오 크로마 선명도 사용자 정의
- ✅ 视频色度锐化自定义
- ✅ Video Chroma Sharpen Custom
- ✅ ビデオクロマシャープカスタム
- ✅ 비디오 크로마 선명도 사용자 정의

### v85.14 弹幕背景边框开关 | Danmaku BG Border Toggle | コメントBGボーダー切替 | 댓글 배경 테두리 전환
- ✅ 弹幕背景边框开关
- ✅ Danmaku BG Border Toggle
- ✅ コメントBGボーダー切替
- ✅ 댓글 배경 테두리 전환

### v85.15 字幕字体大小自动 | Subtitle Font Size Auto | 字幕フォントサイズ自動 | 자막 글꼴 크기 자동
- ✅ 字幕字体大小自动
- ✅ Subtitle Font Size Auto
- ✅ 字幕フォントサイズ自動
- ✅ 자막 글꼴 크기 자동

### v86.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v86.1-v86.15 功能列表
- ✅ Video Contrast Curve Custom, Danmaku Font Stretch Custom, Subtitle BG Radius Custom, Gesture Double Tap Action, Cast Video Protocol, Playlist Auto Refresh, Cache Max Size Custom, Progress Bar Live Edge, Volume Boost Strength, History Import Format, Playback Auto Quality Switch, Screenshot Auto Upload, Video Saturation Curve Custom, Danmaku Send Cooldown, Subtitle Outline Width

### v86.1 视频对比度曲线自定义 | Video Contrast Curve Custom | ビデオコントラスト曲線カスタム | 비디오 대비 곡선 사용자 정의
- ✅ 视频对比度曲线自定义
- ✅ Video Contrast Curve Custom
- ✅ ビデオコントラスト曲線カスタム
- ✅ 비디오 대비 곡선 사용자 정의

### v86.2 弹幕字体拉伸自定义 | Danmaku Font Stretch Custom | コメントフォントストレッチカスタム | 댓글 글꼴 스트레치 사용자 정의
- ✅ 弹幕字体拉伸自定义
- ✅ Danmaku Font Stretch Custom
- ✅ コメントフォントストレッチカスタム
- ✅ 댓글 글꼴 스트레치 사용자 정의

### v86.3 字幕背景圆角自定义 | Subtitle BG Radius Custom | 字幕BG半径カスタム | 자막 배경 반경 사용자 정의
- ✅ 字幕背景圆角自定义
- ✅ Subtitle BG Radius Custom
- ✅ 字幕BG半径カスタム
- ✅ 자막 배경 반경 사용자 정의

### v86.4 手势双击动作 | Gesture Double Tap Action | ジェスチャーダブルタップアクション | 제스처 더블탭 동작
- ✅ 手势双击动作
- ✅ Gesture Double Tap Action
- ✅ ジェスチャーダブルタップアクション
- ✅ 제스처 더블탭 동작

### v86.5 投射视频协议 | Cast Video Protocol | キャストビデオプロトコル | 캐스트 비디오 프로토콜
- ✅ 投射视频协议
- ✅ Cast Video Protocol
- ✅ キャストビデオプロトコル
- ✅ 캐스트 비디오 프로토콜

### v86.6 播放列表自动刷新 | Playlist Auto Refresh | プレイリスト自動更新 | 재생 목록 자동 새로고침
- ✅ 播放列表自动刷新
- ✅ Playlist Auto Refresh
- ✅ プレイリスト自動更新
- ✅ 재생 목록 자동 새로고침

### v86.7 缓存最大大小自定义 | Cache Max Size Custom | キャッシュ最大サイズカスタム | 캐시 최대 크기 사용자 정의
- ✅ 缓存最大大小自定义
- ✅ Cache Max Size Custom
- ✅ キャッシュ最大サイズカスタム
- ✅ 캐시 최대 크기 사용자 정의

### v86.8 进度条直播边缘 | Progress Bar Live Edge | プログレスバーライブエッジ | 진행 바 라이브 엣지
- ✅ 进度条直播边缘
- ✅ Progress Bar Live Edge
- ✅ プログレスバーライブエッジ
- ✅ 진행 바 라이브 엣지

### v86.9 音量增强强度 | Volume Boost Strength | 音量ブースト強度 | 볼륨 부스트 강도
- ✅ 音量增强强度
- ✅ Volume Boost Strength
- ✅ 音量ブースト強度
- ✅ 볼륨 부스트 강도

### v86.10 历史记录导入格式 | History Import Format | 履歴インポート形式 | 기록 가져오기 형식
- ✅ 历史记录导入格式
- ✅ History Import Format
- ✅ 履歴インポート形式
- ✅ 기록 가져오기 형식

### v86.11 播放自动画质切换 | Playback Auto Quality Switch | 再生自動画質切替 | 재생 자동 화질 전환
- ✅ 播放自动画质切换
- ✅ Playback Auto Quality Switch
- ✅ 再生自動画質切替
- ✅ 재생 자동 화질 전환

### v86.12 截图自动上传 | Screenshot Auto Upload | スクリーンショット自動アップロード | 스크린샷 자동 업로드
- ✅ 截图自动上传
- ✅ Screenshot Auto Upload
- ✅ スクリーンショット自動アップロード
- ✅ 스크린샷 자동 업로드

### v86.13 视频饱和度曲线自定义 | Video Saturation Curve Custom | ビデオ彩度曲線カスタム | 비디오 채도 곡선 사용자 정의
- ✅ 视频饱和度曲线自定义
- ✅ Video Saturation Curve Custom
- ✅ ビデオ彩度曲線カスタム
- ✅ 비디오 채도 곡선 사용자 정의

### v86.14 弹幕发送冷却 | Danmaku Send Cooldown | コメント送信クールダウン | 댓글 전송 쿨다운
- ✅ 弹幕发送冷却
- ✅ Danmaku Send Cooldown
- ✅ コメント送信クールダウン
- ✅ 댓글 전송 쿨다운

### v86.15 字幕描边宽度 | Subtitle Outline Width | 字幕アウトライン幅 | 자막 외곽선 너비
- ✅ 字幕描边宽度
- ✅ Subtitle Outline Width
- ✅ 字幕アウトライン幅
- ✅ 자막 외곽선 너비

### v87.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v87.1-v87.15 功能列表
- ✅ Video Brightness Curve Custom, Danmaku Line Height Custom, Subtitle Shadow Offset X, Gesture Swipe Threshold, Cast Audio Sample Rate, Playlist Auto Download, Cache Cleanup Schedule, Progress Bar Snap To Chapter, Volume Limit Max, History Auto Delete Expired, Playback Auto Skip Filler, Screenshot Cloud Sync, Video Gamma Curve Custom, Danmaku Max On Screen, Subtitle Shadow Offset Y

### v87.1 视频亮度曲线自定义 | Video Brightness Curve Custom | ビデオ輝度曲線カスタム | 비디오 밝기 곡선 사용자 정의
- ✅ 视频亮度曲线自定义
- ✅ Video Brightness Curve Custom
- ✅ ビデオ輝度曲線カスタム
- ✅ 비디오 밝기 곡선 사용자 정의

### v87.2 弹幕行高自定义 | Danmaku Line Height Custom | コメント行高カスタム | 댓글 줄 높이 사용자 정의
- ✅ 弹幕行高自定义
- ✅ Danmaku Line Height Custom
- ✅ コメント行高カスタム
- ✅ 댓글 줄 높이 사용자 정의

### v87.3 字幕阴影X偏移 | Subtitle Shadow Offset X | 字幕シャドウXオフセット | 자막 그림자 X 오프셋
- ✅ 字幕阴影X偏移
- ✅ Subtitle Shadow Offset X
- ✅ 字幕シャドウXオフセット
- ✅ 자막 그림자 X 오프셋

### v87.4 手势滑动阈值 | Gesture Swipe Threshold | ジェスチャースワイプしきい値 | 제스처 스와이프 임계값
- ✅ 手势滑动阈值
- ✅ Gesture Swipe Threshold
- ✅ ジェスチャースワイプしきい値
- ✅ 제스처 스와이프 임계값

### v87.5 投射音频采样率 | Cast Audio Sample Rate | キャスト音声サンプルレート | 캐스트 오디오 샘플레이트
- ✅ 投射音频采样率
- ✅ Cast Audio Sample Rate
- ✅ キャスト音声サンプルレート
- ✅ 캐스트 오디오 샘플레이트

### v87.6 播放列表自动下载 | Playlist Auto Download | プレイリスト自動ダウンロード | 재생 목록 자동 다운로드
- ✅ 播放列表自动下载
- ✅ Playlist Auto Download
- ✅ プレイリスト自動ダウンロード
- ✅ 재생 목록 자동 다운로드

### v87.7 缓存清理计划 | Cache Cleanup Schedule | キャッシュクリーンアップスケジュール | 캐시 정리 일정
- ✅ 缓存清理计划
- ✅ Cache Cleanup Schedule
- ✅ キャッシュクリーンアップスケジュール
- ✅ 캐시 정리 일정

### v87.8 进度条吸附到章节 | Progress Bar Snap To Chapter | プログレスバーチャプターにスナップ | 진행 바 챕터에 스냅
- ✅ 进度条吸附到章节
- ✅ Progress Bar Snap To Chapter
- ✅ プログレスバーチャプターにスナップ
- ✅ 진행 바 챕터에 스냅

### v87.9 音量最大限制 | Volume Limit Max | 音量リミット最大 | 볼륨 최대 제한
- ✅ 音量最大限制
- ✅ Volume Limit Max
- ✅ 音量リミット最大
- ✅ 볼륨 최대 제한

### v87.10 历史记录自动删除过期 | History Auto Delete Expired | 履歴自動期限切れ削除 | 기록 자동 만료 삭제
- ✅ 历史记录自动删除过期
- ✅ History Auto Delete Expired
- ✅ 履歴自動期限切れ削除
- ✅ 기록 자동 만료 삭제

### v87.11 播放自动跳过填充 | Playback Auto Skip Filler | 再生自動フィラースキップ | 재생 자동 필러 건너뛰기
- ✅ 播放自动跳过填充
- ✅ Playback Auto Skip Filler
- ✅ 再生自動フィラースキップ
- ✅ 재생 자동 필러 건너뛰기

### v87.12 截图云同步 | Screenshot Cloud Sync | スクリーンショットクラウド同期 | 스크린샷 클라우드 동기화
- ✅ 截图云同步
- ✅ Screenshot Cloud Sync
- ✅ スクリーンショットクラウド同期
- ✅ 스크린샷 클라우드 동기화

### v87.13 视频伽马曲线自定义 | Video Gamma Curve Custom | ビデオガンマ曲線カスタム | 비디오 감마 곡선 사용자 정의
- ✅ 视频伽马曲线自定义
- ✅ Video Gamma Curve Custom
- ✅ ビデオガンマ曲線カスタム
- ✅ 비디오 감마 곡선 사용자 정의

### v87.14 屏幕最大弹幕数 | Danmaku Max On Screen | 画面最大コメント数 | 화면 최대 댓글 수
- ✅ 屏幕最大弹幕数
- ✅ Danmaku Max On Screen
- ✅ 画面最大コメント数
- ✅ 화면 최대 댓글 수

### v87.15 字幕阴影Y偏移 | Subtitle Shadow Offset Y | 字幕シャドウYオフセット | 자막 그림자 Y 오프셋
- ✅ 字幕阴影Y偏移
- ✅ Subtitle Shadow Offset Y
- ✅ 字幕シャドウYオフセット
- ✅ 자막 그림자 Y 오프셋

### v88.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v88.1-v88.15 功能列表
- ✅ Video White Balance Custom, Danmaku Send Animation, Subtitle Outline Color, Gesture Tap Action, Cast Video Resolution, Playlist Auto Mark Watched, Cache Preload Next Episode, Progress Bar Custom Label, Volume Auto Mute On Call, History Show Thumbnails, Playback Auto Resume Position, Screenshot Format Custom, Video Tint Custom, Danmaku Scroll Speed Curve, Subtitle Shadow Blur

### v88.1 视频白平衡自定义 | Video White Balance Custom | ビデオホワイトバランスカスタム | 비디오 화이트밸런스 사용자 정의
- ✅ 视频白平衡自定义
- ✅ Video White Balance Custom
- ✅ ビデオホワイトバランスカスタム
- ✅ 비디오 화이트밸런스 사용자 정의

### v88.2 弹幕发送动画 | Danmaku Send Animation | コメント送信アニメーション | 댓글 전송 애니메이션
- ✅ 弹幕发送动画
- ✅ Danmaku Send Animation
- ✅ コメント送信アニメーション
- ✅ 댓글 전송 애니메이션

### v88.3 字幕描边颜色 | Subtitle Outline Color | 字幕アウトライン色 | 자막 외곽선 색상
- ✅ 字幕描边颜色
- ✅ Subtitle Outline Color
- ✅ 字幕アウトライン色
- ✅ 자막 외곽선 색상

### v88.4 手势点击动作 | Gesture Tap Action | ジェスチャータップアクション | 제스처 탭 동작
- ✅ 手势点击动作
- ✅ Gesture Tap Action
- ✅ ジェスチャータップアクション
- ✅ 제스처 탭 동작

### v88.5 投射视频分辨率 | Cast Video Resolution | キャストビデオ解像度 | 캐스트 비디오 해상도
- ✅ 投射视频分辨率
- ✅ Cast Video Resolution
- ✅ キャストビデオ解像度
- ✅ 캐스트 비디오 해상도

### v88.6 播放列表自动标记已看 | Playlist Auto Mark Watched | プレイリスト自動視聴済みマーク | 재생 목록 자동 시청 완료 표시
- ✅ 播放列表自动标记已看
- ✅ Playlist Auto Mark Watched
- ✅ プレイリスト自動視聴済みマーク
- ✅ 재생 목록 자동 시청 완료 표시

### v88.7 缓存预加载下一集 | Cache Preload Next Episode | キャッシュ次エピソードプリロード | 캐시 다음 에피소드 프리로드
- ✅ 缓存预加载下一集
- ✅ Cache Preload Next Episode
- ✅ キャッシュ次エピソードプリロード
- ✅ 캐시 다음 에피소드 프리로드

### v88.8 进度条自定义标签 | Progress Bar Custom Label | プログレスバーカスタムラベル | 진행바 사용자 정의 라벨
- ✅ 进度条自定义标签
- ✅ Progress Bar Custom Label
- ✅ プログレスバーカスタムラベル
- ✅ 진행바 사용자 정의 라벨

### v88.9 通话时自动静音 | Volume Auto Mute On Call | 通話時自動ミュート | 통화 시 자동 음소거
- ✅ 通话时自动静音
- ✅ Volume Auto Mute On Call
- ✅ 通話時自動ミュート
- ✅ 통화 시 자동 음소거

### v88.10 历史记录显示缩略图 | History Show Thumbnails | 履歴サムネイル表示 | 기록 썸네일 표시
- ✅ 历史记录显示缩略图
- ✅ History Show Thumbnails
- ✅ 履歴サムネイル表示
- ✅ 기록 썸네일 표시

### v88.11 播放自动恢复位置 | Playback Auto Resume Position | 再生自動位置再開 | 재생 자동 위치 재개
- ✅ 播放自动恢复位置
- ✅ Playback Auto Resume Position
- ✅ 再生自動位置再開
- ✅ 재생 자동 위치 재개

### v88.12 截图格式自定义 | Screenshot Format Custom | スクリーンショット形式カスタム | 스크린샷 형식 사용자 정의
- ✅ 截图格式自定义
- ✅ Screenshot Format Custom
- ✅ スクリーンショット形式カスタム
- ✅ 스크린샷 형식 사용자 정의

### v88.13 视频色调自定义 | Video Tint Custom | ビデオチントカスタム | 비디오 틴트 사용자 정의
- ✅ 视频色调自定义
- ✅ Video Tint Custom
- ✅ ビデオチントカスタム
- ✅ 비디오 틴트 사용자 정의

### v88.14 弹幕滚动速度曲线 | Danmaku Scroll Speed Curve | コメントスクロール速度曲線 | 댓글 스크롤 속도 곡선
- ✅ 弹幕滚动速度曲线
- ✅ Danmaku Scroll Speed Curve
- ✅ コメントスクロール速度曲線
- ✅ 댓글 스크롤 속도 곡선

### v88.15 字幕阴影模糊 | Subtitle Shadow Blur | 字幕シャドウブラー | 자막 그림자 블러
- ✅ 字幕阴影模糊
- ✅ Subtitle Shadow Blur
- ✅ 字幕シャドウブラー
- ✅ 자막 그림자 블러

### v89.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v89.1-v89.15 功能列表
- ✅ Video Black Level Custom, Danmaku Font Kerning Custom, Subtitle Animation Loop Count, Gesture Pinch Action, Cast Audio Bitrate, Playlist Auto Group By Series, Cache Verify On Start, Progress Bar Midpoint Indicator, Volume Auto Lower On Notification, History Sort Order, Playback Auto Skip Preview, Screenshot Quality Custom, Video White Point Custom, Danmaku Scroll Speed Min, Subtitle Position Y Custom

### v89.1 视频黑位自定义 | Video Black Level Custom | ビデオブラックレベルカスタム | 비디오 블랙 레벨 사용자 정의
- ✅ 视频黑位自定义
- ✅ Video Black Level Custom
- ✅ ビデオブラックレベルカスタム
- ✅ 비디오 블랙 레벨 사용자 정의

### v89.2 弹幕字体字距自定义 | Danmaku Font Kerning Custom | コメントフォントカーニングカスタム | 댓글 글꼴 커닝 사용자 정의
- ✅ 弹幕字体字距自定义
- ✅ Danmaku Font Kerning Custom
- ✅ コメントフォントカーニングカスタム
- ✅ 댓글 글꼴 커닝 사용자 정의

### v89.3 字幕动画循环次数 | Subtitle Animation Loop Count | 字幕アニメーションループ回数 | 자막 애니메이션 반복 횟수
- ✅ 字幕动画循环次数
- ✅ Subtitle Animation Loop Count
- ✅ 字幕アニメーションループ回数
- ✅ 자막 애니메이션 반복 횟수

### v89.4 手势捏合动作 | Gesture Pinch Action | ジェスチャーピンチアクション | 제스처 핀치 동작
- ✅ 手势捏合动作
- ✅ Gesture Pinch Action
- ✅ ジェスチャーピンチアクション
- ✅ 제스처 핀치 동작

### v89.5 投射音频码率 | Cast Audio Bitrate | キャスト音声ビットレート | 캐스트 오디오 비트레이트
- ✅ 投射音频码率
- ✅ Cast Audio Bitrate
- ✅ キャスト音声ビットレート
- ✅ 캐스트 오디오 비트레이트

### v89.6 播放列表按系列分组 | Playlist Auto Group By Series | プレイリストシリーズ別グループ化 | 재생 목록 시리즈별 그룹화
- ✅ 播放列表按系列分组
- ✅ Playlist Auto Group By Series
- ✅ プレイリストシリーズ別グループ化
- ✅ 재생 목록 시리즈별 그룹화

### v89.7 启动时验证缓存 | Cache Verify On Start | 起動時キャッシュ検証 | 시작 시 캐시 검증
- ✅ 启动时验证缓存
- ✅ Cache Verify On Start
- ✅ 起動時キャッシュ検証
- ✅ 시작 시 캐시 검증

### v89.8 进度条中点指示器 | Progress Bar Midpoint Indicator | プログレスバーミッドポイントインジケーター | 진행 바 중간점 표시기
- ✅ 进度条中点指示器
- ✅ Progress Bar Midpoint Indicator
- ✅ プログレスバーミッドポイントインジケーター
- ✅ 진행 바 중간점 표시기

### v89.9 通知时自动降低音量 | Volume Auto Lower On Notification | 通知時自動音量低下 | 알림 시 자동 볼륨 낮춤
- ✅ 通知时自动降低音量
- ✅ Volume Auto Lower On Notification
- ✅ 通知時自動音量低下
- ✅ 알림 시 자동 볼륨 낮춤

### v89.10 历史记录排序方式 | History Sort Order | 履歴ソート順 | 기록 정렬 순서
- ✅ 历史记录排序方式
- ✅ History Sort Order
- ✅ 履歴ソート順
- ✅ 기록 정렬 순서

### v89.11 播放自动跳过预告 | Playback Auto Skip Preview | 再生自動プレビュースキップ | 재생 자동 미리보기 건너뛰기
- ✅ 播放自动跳过预告
- ✅ Playback Auto Skip Preview
- ✅ 再生自動プレビュースキップ
- ✅ 재생 자동 미리보기 건너뛰기

### v89.12 截图质量自定义 | Screenshot Quality Custom | スクリーンショット品質カスタム | 스크린샷 품질 사용자 정의
- ✅ 截图质量自定义
- ✅ Screenshot Quality Custom
- ✅ スクリーンショット品質カスタム
- ✅ 스크린샷 품질 사용자 정의

### v89.13 视频白点自定义 | Video White Point Custom | ビデオホワイトポイントカスタム | 비디오 화이트포인트 사용자 정의
- ✅ 视频白点自定义
- ✅ Video White Point Custom
- ✅ ビデオホワイトポイントカスタム
- ✅ 비디오 화이트포인트 사용자 정의

### v89.14 弹幕滚动速度最小值 | Danmaku Scroll Speed Min | コメントスクロール速度最小値 | 댓글 스크롤 속도 최소값
- ✅ 弹幕滚动速度最小值
- ✅ Danmaku Scroll Speed Min
- ✅ コメントスクロール速度最小値
- ✅ 댓글 스크롤 속도 최소값

### v89.15 字幕Y位置自定义 | Subtitle Position Y Custom | 字幕Y位置カスタム | 자막 Y 위치 사용자 정의
- ✅ 字幕Y位置自定义
- ✅ Subtitle Position Y Custom
- ✅ 字幕Y位置カスタム
- ✅ 자막 Y 위치 사용자 정의

### v90.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v90.1-v90.15 功能列表
- ✅ Video Midtone Custom, Danmaku Scroll Speed Max, Subtitle Position X Custom, Gesture Rotation Action, Cast Video Codec Custom, Playlist Auto Skip Watched, Cache Background Cleanup, Progress Bar Estimated Time, Volume Spatial Width, History Auto Sync Cloud, Playback Auto Next On Buffer, Screenshot Auto Delete Old, Video Highlight Custom, Danmaku Send Max Length, Subtitle Animation Delay Custom

### v90.1 视频中间调自定义 | Video Midtone Custom | ビデオミッドトーンカスタム | 비디오 미드톤 사용자 정의
- ✅ 视频中间调自定义
- ✅ Video Midtone Custom
- ✅ ビデオミッドトーンカスタム
- ✅ 비디오 미드톤 사용자 정의

### v90.2 弹幕滚动速度最大值 | Danmaku Scroll Speed Max | コメントスクロール速度最大値 | 댓글 스크롤 속도 최대값
- ✅ 弹幕滚动速度最大值
- ✅ Danmaku Scroll Speed Max
- ✅ コメントスクロール速度最大値
- ✅ 댓글 스크롤 속도 최대값

### v90.3 字幕X位置自定义 | Subtitle Position X Custom | 字幕X位置カスタム | 자막 X 위치 사용자 정의
- ✅ 字幕X位置自定义
- ✅ Subtitle Position X Custom
- ✅ 字幕X位置カスタム
- ✅ 자막 X 위치 사용자 정의

### v90.4 手势旋转动作 | Gesture Rotation Action | ジェスチャー回転アクション | 제스처 회전 동작
- ✅ 手势旋转动作
- ✅ Gesture Rotation Action
- ✅ ジェスチャー回転アクション
- ✅ 제스처 회전 동작

### v90.5 投射视频编码自定义 | Cast Video Codec Custom | キャストビデオコーデックカスタム | 캐스트 비디오 코덱 사용자 정의
- ✅ 投射视频编码自定义
- ✅ Cast Video Codec Custom
- ✅ キャストビデオコーデックカスタム
- ✅ 캐스트 비디오 코덱 사용자 정의

### v90.6 播放列表自动跳过已看 | Playlist Auto Skip Watched | プレイリスト自動視聴済みスキップ | 재생 목록 자동 시청 완료 건너뛰기
- ✅ 播放列表自动跳过已看
- ✅ Playlist Auto Skip Watched
- ✅ プレイリスト自動視聴済みスキップ
- ✅ 재생 목록 자동 시청 완료 건너뛰기

### v90.7 缓存后台清理 | Cache Background Cleanup | キャッシュバックグラウンドクリーンアップ | 캐시 백그라운드 정리
- ✅ 缓存后台清理
- ✅ Cache Background Cleanup
- ✅ キャッシュバックグラウンドクリーンアップ
- ✅ 캐시 백그라운드 정리

### v90.8 进度条预计时间 | Progress Bar Estimated Time | プログレスバー推定時間 | 진행 바 예상 시간
- ✅ 进度条预计时间
- ✅ Progress Bar Estimated Time
- ✅ プログレスバー推定時間
- ✅ 진행 바 예상 시간

### v90.9 音量空间宽度 | Volume Spatial Width | 音量空間幅 | 볼륨 공간 너비
- ✅ 音量空间宽度
- ✅ Volume Spatial Width
- ✅ 音量空間幅
- ✅ 볼륨 공간 너비

### v90.10 历史记录自动云同步 | History Auto Sync Cloud | 履歴自動クラウド同期 | 기록 자동 클라우드 동기화
- ✅ 历史记录自动云同步
- ✅ History Auto Sync Cloud
- ✅ 履歴自動クラウド同期
- ✅ 기록 자동 클라우드 동기화

### v90.11 缓冲完成自动下一个 | Playback Auto Next On Buffer | バッファ完了時自動次再生 | 버퍼 완료 시 자동 다음 재생
- ✅ 缓冲完成自动下一个
- ✅ Playback Auto Next On Buffer
- ✅ バッファ完了時自動次再生
- ✅ 버퍼 완료 시 자동 다음 재생

### v90.12 截图自动删除旧文件 | Screenshot Auto Delete Old | スクリーンショット自動旧ファイル削除 | 스크린샷 자동 오래된 파일 삭제
- ✅ 截图自动删除旧文件
- ✅ Screenshot Auto Delete Old
- ✅ スクリーンショット自動旧ファイル削除
- ✅ 스크린샷 자동 오래된 파일 삭제

### v90.13 视频高光自定义 | Video Highlight Custom | ビデオハイライトカスタム | 비디오 하이라이트 사용자 정의
- ✅ 视频高光自定义
- ✅ Video Highlight Custom
- ✅ ビデオハイライトカスタム
- ✅ 비디오 하이라이트 사용자 정의

### v90.14 弹幕发送最大长度 | Danmaku Send Max Length | コメント送信最大長 | 댓글 전송 최대 길이
- ✅ 弹幕发送最大长度
- ✅ Danmaku Send Max Length
- ✅ コメント送信最大長
- ✅ 댓글 전송 최대 길이

### v90.15 字幕动画延迟自定义 | Subtitle Animation Delay Custom | 字幕アニメーション遅延カスタム | 자막 애니메이션 지연 사용자 정의
- ✅ 字幕动画延迟自定义
- ✅ Subtitle Animation Delay Custom
- ✅ 字幕アニメーション遅延カスタム
- ✅ 자막 애니메이션 지연 사용자 정의


### v91.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v91.1-v91.15 功能列表
- ✅ Video Dithering Mode, Danmaku Font Shadow Toggle, Subtitle Fade In Out Custom, Gesture Edge Dead Zone, Cast Video Latency Mode, Playlist Auto Resume Last, Cache Segment Size, Progress Bar Chapter Label, Volume Auto Ducking, History Group By Series, Playback Auto Skip Next Countdown, Screenshot Region Capture, Video Film Grain Custom, Danmaku BG Corner Radius, Subtitle BG Margin Bottom

### v91.1 视频抖动模式 | Video Dithering Mode | ビデオディザリングモード | 비디오 디더링 모드
- ✅ 视频抖动模式
- ✅ Video Dithering Mode
- ✅ ビデオディザリングモード
- ✅ 비디오 디더링 모드

### v91.2 弹幕字体阴影开关 | Danmaku Font Shadow Toggle | コメントフォントシャドウ切替 | 댓글 글꼴 그림자 전환
- ✅ 弹幕字体阴影开关
- ✅ Danmaku Font Shadow Toggle
- ✅ コメントフォントシャドウ切替
- ✅ 댓글 글꼴 그림자 전환

### v91.3 字幕淡入淡出自定义 | Subtitle Fade In Out Custom | 字幕フェードインアウトカスタム | 자막 페이드인아웃 사용자 정의
- ✅ 字幕淡入淡出自定义
- ✅ Subtitle Fade In Out Custom
- ✅ 字幕フェードインアウトカスタム
- ✅ 자막 페이드인아웃 사용자 정의

### v91.4 手势边缘死区 | Gesture Edge Dead Zone | ジェスチャーエッジデッドゾーン | 제스처 가장자리 데드존
- ✅ 手势边缘死区
- ✅ Gesture Edge Dead Zone
- ✅ ジェスチャーエッジデッドゾーン
- ✅ 제스처 가장자리 데드존

### v91.5 投射视频延迟模式 | Cast Video Latency Mode | キャストビデオ遅延モード | 캐스트 비디오 지연 모드
- ✅ 投射视频延迟模式
- ✅ Cast Video Latency Mode
- ✅ キャストビデオ遅延モード
- ✅ 캐스트 비디오 지연 모드

### v91.6 播放列表自动恢复上次 | Playlist Auto Resume Last | プレイリスト自動前回再開 | 재생 목록 자동 이전 재개
- ✅ 播放列表自动恢复上次
- ✅ Playlist Auto Resume Last
- ✅ プレイリスト自動前回再開
- ✅ 재생 목록 자동 이전 재개

### v91.7 缓存分段大小 | Cache Segment Size | キャッシュセグメントサイズ | 캐시 세그먼트 크기
- ✅ 缓存分段大小
- ✅ Cache Segment Size
- ✅ キャッシュセグメントサイズ
- ✅ 캐시 세그먼트 크기

### v91.8 进度条章节标签 | Progress Bar Chapter Label | プログレスバーチャプターラベル | 진행 바 챕터 라벨
- ✅ 进度条章节标签
- ✅ Progress Bar Chapter Label
- ✅ プログレスバーチャプターラベル
- ✅ 진행 바 챕터 라벨

### v91.9 音量自动闪避 | Volume Auto Ducking | 音量自動ダッキング | 볼륨 자동 덕킹
- ✅ 音量自动闪避
- ✅ Volume Auto Ducking
- ✅ 音量自動ダッキング
- ✅ 볼륨 자동 덕킹

### v91.10 历史记录按系列分组 | History Group By Series | 履歴シリーズ別グループ化 | 기록 시리즈별 그룹화
- ✅ 历史记录按系列分组
- ✅ History Group By Series
- ✅ 履歴シリーズ別グループ化
- ✅ 기록 시리즈별 그룹화

### v91.11 播放自动跳过下一集倒计时 | Playback Auto Skip Next Countdown | 再生自動次エピソードカウントダウンスキップ | 재생 자동 다음 에피소드 카운트다운 건너뛰기
- ✅ 播放自动跳过下一集倒计时
- ✅ Playback Auto Skip Next Countdown
- ✅ 再生自動次エピソードカウントダウンスキップ
- ✅ 재생 자동 다음 에피소드 카운트다운 건너뛰기

### v91.12 截图区域截取 | Screenshot Region Capture | スクリーンショット領域キャプチャ | 스크린샷 영역 캡처
- ✅ 截图区域截取
- ✅ Screenshot Region Capture
- ✅ スクリーンショット領域キャプチャ
- ✅ 스크린샷 영역 캡처

### v91.13 视频胶片颗粒自定义 | Video Film Grain Custom | ビデオフィルムグレインカスタム | 비디오 필름 그레인 사용자 정의
- ✅ 视频胶片颗粒自定义
- ✅ Video Film Grain Custom
- ✅ ビデオフィルムグレインカスタム
- ✅ 비디오 필름 그레인 사용자 정의

### v91.14 弹幕背景圆角半径 | Danmaku BG Corner Radius | コメントBG角丸半径 | 댓글 배경 모서리 반경
- ✅ 弹幕背景圆角半径
- ✅ Danmaku BG Corner Radius
- ✅ コメントBG角丸半径
- ✅ 댓글 배경 모서리 반경

### v91.15 字幕背景底部边距 | Subtitle BG Margin Bottom | 字幕BG下マージン | 자막 배경 하단 마진
- ✅ 字幕背景底部边距
- ✅ Subtitle BG Margin Bottom
- ✅ 字幕BG下マージン
- ✅ 자막 배경 하단 마진

### v92.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v92.1-v92.15 功能列表
- ✅ Video Vignette Custom, Danmaku Font Underline Toggle, Subtitle BG Padding Custom, Gesture Swipe Back Action, Cast Video Drop Frame, Playlist Auto Skip Short, Cache Download Policy, Progress Bar Thumb Shape, Volume Auto Balance, History Auto Clean Expired, Playback Auto Skip Same Title, Screenshot Auto Delete Days, Video Color Fringe Custom, Danmaku BG Opacity Custom, Subtitle BG Margin Top

### v92.1 视频暗角自定义 | Video Vignette Custom | ビデオビネットカスタム | 비디오 비네트 사용자 정의
- ✅ 视频暗角自定义
- ✅ Video Vignette Custom
- ✅ ビデオビネットカスタム
- ✅ 비디오 비네트 사용자 정의

### v92.2 弹幕字体下划线开关 | Danmaku Font Underline Toggle | コメントフォント下線切替 | 댓글 글꼴 밑줄 전환
- ✅ 弹幕字体下划线开关
- ✅ Danmaku Font Underline Toggle
- ✅ コメントフォント下線切替
- ✅ 댓글 글꼴 밑줄 전환

### v92.3 字幕背景填充自定义 | Subtitle BG Padding Custom | 字幕BGパディングカスタム | 자막 배경 패딩 사용자 정의
- ✅ 字幕背景填充自定义
- ✅ Subtitle BG Padding Custom
- ✅ 字幕BGパディングカスタム
- ✅ 자막 배경 패딩 사용자 정의

### v92.4 手势滑动返回动作 | Gesture Swipe Back Action | ジェスチャースワイプバックアクション | 제스처 스와이프 뒤로 동작
- ✅ 手势滑动返回动作
- ✅ Gesture Swipe Back Action
- ✅ ジェスチャースワイプバックアクション
- ✅ 제스처 스와이프 뒤로 동작

### v92.5 投射视频丢帧 | Cast Video Drop Frame | キャストビデオフレームドロップ | 캐스트 비디오 프레임 드롭
- ✅ 投射视频丢帧
- ✅ Cast Video Drop Frame
- ✅ キャストビデオフレームドロップ
- ✅ 캐스트 비디오 프레임 드롭

### v92.6 播放列表自动跳过短视频 | Playlist Auto Skip Short | プレイリスト自動短時間スキップ | 재생 목록 자동 짧은 영상 건너뛰기
- ✅ 播放列表自动跳过短视频
- ✅ Playlist Auto Skip Short
- ✅ プレイリスト自動短時間スキップ
- ✅ 재생 목록 자동 짧은 영상 건너뛰기

### v92.7 缓存下载策略 | Cache Download Policy | キャッシュダウンロードポリシー | 캐시 다운로드 정책
- ✅ 缓存下载策略
- ✅ Cache Download Policy
- ✅ キャッシュダウンロードポリシー
- ✅ 캐시 다운로드 정책

### v92.8 进度条滑块形状 | Progress Bar Thumb Shape | プログレスバーサム形状 | 진행 바 썸形状
- ✅ 进度条滑块形状
- ✅ Progress Bar Thumb Shape
- ✅ プログレスバーサム形状
- ✅ 진행 바 썸形状

### v92.9 音量自动平衡 | Volume Auto Balance | 音量自動バランス | 볼륨 자동 밸런스
- ✅ 音量自动平衡
- ✅ Volume Auto Balance
- ✅ 音量自動バランス
- ✅ 볼륨 자동 밸런스

### v92.10 历史记录自动清理过期 | History Auto Clean Expired | 履歴自動期限切れクリーンアップ | 기록 자동 만료 정리
- ✅ 历史记录自动清理过期
- ✅ History Auto Clean Expired
- ✅ 履歴自動期限切れクリーンアップ
- ✅ 기록 자동 만료 정리

### v92.11 播放自动跳过相同标题 | Playback Auto Skip Same Title | 再生自動同タイトルスキップ | 재생 자동 동일 제목 건너뛰기
- ✅ 播放自动跳过相同标题
- ✅ Playback Auto Skip Same Title
- ✅ 再生自動同タイトルスキップ
- ✅ 재생 자동 동일 제목 건너뛰기

### v92.12 截图自动删除天数 | Screenshot Auto Delete Days | スクリーンショット自動削除日数 | 스크린샷 자동 삭제 일수
- ✅ 截图自动删除天数
- ✅ Screenshot Auto Delete Days
- ✅ スクリーンショット自動削除日数
- ✅ 스크린샷 자동 삭제 일수

### v92.13 视频色边自定义 | Video Color Fringe Custom | ビデオカラーフリンジカスタム | 비디오 컬러 프린지 사용자 정의
- ✅ 视频色边自定义
- ✅ Video Color Fringe Custom
- ✅ ビデオカラーフリンジカスタム
- ✅ 비디오 컬러 프린지 사용자 정의

### v92.14 弹幕背景透明度自定义 | Danmaku BG Opacity Custom | コメントBG透明度カスタム | 댓글 배경 불투명도 사용자 정의
- ✅ 弹幕背景透明度自定义
- ✅ Danmaku BG Opacity Custom
- ✅ コメントBG透明度カスタム
- ✅ 댓글 배경 불투명도 사용자 정의

### v92.15 字幕背景顶部边距 | Subtitle BG Margin Top | 字幕BG上マージン | 자막 배경 상단 마진
- ✅ 字幕背景顶部边距
- ✅ Subtitle BG Margin Top
- ✅ 字幕BG上マージン
- ✅ 자막 배경 상단 마진

### v93.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v93.1-v93.15 功能列表
- ✅ Video Scanline Effect, Danmaku Send Max Length Custom, Subtitle BG Border Color Custom, Gesture Swipe Forward Action, Cast Audio Dynamic Range, Playlist Auto Skip Long, Cache Network Policy, Progress Bar Buffer Color Custom, Volume Auto Gain Control, History Auto Sync Device, Playback Auto Skip Recap93, Screenshot Naming Template, Video CRT Filter Custom, Danmaku Send Confirm Toggle, Subtitle BG Border Width Custom

### v93.1 视频扫描线效果 | Video Scanline Effect | ビデオスキャンラインエフェクト | 비디오 스캔라인 효과
- ✅ 视频扫描线效果
- ✅ Video Scanline Effect
- ✅ ビデオスキャンラインエフェクト
- ✅ 비디오 스캔라인 효과

### v93.2 弹幕发送最大长度自定义 | Danmaku Send Max Length Custom | コメント送信最大長カスタム | 댓글 전송 최대 길이 사용자 정의
- ✅ 弹幕发送最大长度自定义
- ✅ Danmaku Send Max Length Custom
- ✅ コメント送信最大長カスタム
- ✅ 댓글 전송 최대 길이 사용자 정의

### v93.3 字幕背景边框颜色自定义 | Subtitle BG Border Color Custom | 字幕BGボーダー色カスタム | 자막 배경 테두리 색상 사용자 정의
- ✅ 字幕背景边框颜色自定义
- ✅ Subtitle BG Border Color Custom
- ✅ 字幕BGボーダー色カスタム
- ✅ 자막 배경 테두리 색상 사용자 정의

### v93.4 手势滑动前进动作 | Gesture Swipe Forward Action | ジェスチャースワイプフォワードアクション | 제스처 스와이프 앞으로 동작
- ✅ 手势滑动前进动作
- ✅ Gesture Swipe Forward Action
- ✅ ジェスチャースワイプフォワードアクション
- ✅ 제스처 스와이프 앞으로 동작

### v93.5 投射音频动态范围 | Cast Audio Dynamic Range | キャスト音声ダイナミックレンジ | 캐스트 오디오 다이나믹 레인지
- ✅ 投射音频动态范围
- ✅ Cast Audio Dynamic Range
- ✅ キャスト音声ダイナミックレンジ
- ✅ 캐스트 오디오 다이나믹 레인지

### v93.6 播放列表自动跳过长视频 | Playlist Auto Skip Long | プレイリスト自動長時間スキップ | 재생 목록 자동 긴 영상 건너뛰기
- ✅ 播放列表自动跳过长视频
- ✅ Playlist Auto Skip Long
- ✅ プレイリスト自動長時間スキップ
- ✅ 재생 목록 자동 긴 영상 건너뛰기

### v93.7 缓存网络策略 | Cache Network Policy | キャッシュネットワークポリシー | 캐시 네트워크 정책
- ✅ 缓存网络策略
- ✅ Cache Network Policy
- ✅ キャッシュネットワークポリシー
- ✅ 캐시 네트워크 정책

### v93.8 进度条缓冲颜色自定义 | Progress Bar Buffer Color Custom | プログレスバーバッファ色カスタム | 진행 바 버퍼 색상 사용자 정의
- ✅ 进度条缓冲颜色自定义
- ✅ Progress Bar Buffer Color Custom
- ✅ プログレスバーバッファ色カスタム
- ✅ 진행 바 버퍼 색상 사용자 정의

### v93.9 音量自动增益控制 | Volume Auto Gain Control | 音量自動ゲイン制御 | 볼륨 자동 게인 제어
- ✅ 音量自动增益控制
- ✅ Volume Auto Gain Control
- ✅ 音量自動ゲイン制御
- ✅ 볼륨 자동 게인 제어

### v93.10 历史记录自动同步设备 | History Auto Sync Device | 履歴自動デバイス同期 | 기록 자동 디바이스 동기화
- ✅ 历史记录自动同步设备
- ✅ History Auto Sync Device
- ✅ 履歴自動デバイス同期
- ✅ 기록 자동 디바이스 동기화

### v93.11 播放自动跳过回顾93 | Playback Auto Skip Recap93 | 再生自動リキャップスキップ93 | 재생 자동 리캡 건너뛰기93
- ✅ 播放自动跳过回顾93
- ✅ Playback Auto Skip Recap93
- ✅ 再生自動リキャップスキップ93
- ✅ 재생 자동 리캡 건너뛰기93

### v93.12 截图命名模板 | Screenshot Naming Template | スクリーンショット命名テンプレート | 스크린샷 이름 템플릿
- ✅ 截图命名模板
- ✅ Screenshot Naming Template
- ✅ スクリーンショット命名テンプレート
- ✅ 스크린샷 이름 템플릿

### v93.13 视频CRT滤镜自定义 | Video CRT Filter Custom | ビデオCRTフィルターカスタム | 비디오 CRT 필터 사용자 정의
- ✅ 视频CRT滤镜自定义
- ✅ Video CRT Filter Custom
- ✅ ビデオCRTフィルターカスタム
- ✅ 비디오 CRT 필터 사용자 정의

### v93.14 弹幕发送确认开关 | Danmaku Send Confirm Toggle | コメント送信確認切替 | 댓글 전송 확인 전환
- ✅ 弹幕发送确认开关
- ✅ Danmaku Send Confirm Toggle
- ✅ コメント送信確認切替
- ✅ 댓글 전송 확인 전환

### v93.15 字幕背景边框宽度自定义 | Subtitle BG Border Width Custom | 字幕BGボーダー幅カスタム | 자막 배경 테두리 너비 사용자 정의
- ✅ 字幕背景边框宽度自定义
- ✅ Subtitle BG Border Width Custom
- ✅ 字幕BGボーダー幅カスタム
- ✅ 자막 배경 테두리 너비 사용자 정의

### v94.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v94.1-v94.15 功能列表
- ✅ Video Pixel Art Mode, Danmaku Font Monospace Toggle, Subtitle BG Border Radius Custom, Gesture Long Press Timeout, Cast Video Buffer Size, Playlist Auto Group By Up, Cache Smart Cleanup, Progress Bar Live Indicator, Volume Auto Pan, History Export Auto, Playback Auto Skip Title, Screenshot Auto Copy Path, Video Ascii Art Mode, Danmaku Font Size Step, Subtitle Animation Fade Time

### v94.1 视频像素艺术模式 | Video Pixel Art Mode | ビデオピクセルアートモード | 비디오 픽셀 아트 모드
- ✅ 视频像素艺术模式
- ✅ Video Pixel Art Mode
- ✅ ビデオピクセルアートモード
- ✅ 비디오 픽셀 아트 모드

### v94.2 弹幕字体等宽开关 | Danmaku Font Monospace Toggle | コメントフォントモノスペース切替 | 댓글 글꼴 고정폭 전환
- ✅ 弹幕字体等宽开关
- ✅ Danmaku Font Monospace Toggle
- ✅ コメントフォントモノスペース切替
- ✅ 댓글 글꼴 고정폭 전환

### v94.3 字幕背景边框圆角自定义 | Subtitle BG Border Radius Custom | 字幕BGボーダー角丸カスタム | 자막 배경 테두리 반경 사용자 정의
- ✅ 字幕背景边框圆角自定义
- ✅ Subtitle BG Border Radius Custom
- ✅ 字幕BGボーダー角丸カスタム
- ✅ 자막 배경 테두리 반경 사용자 정의

### v94.4 手势长按超时 | Gesture Long Press Timeout | ジェスチャー長押しタイムアウト | 제스처 길게 누르기 타임아웃
- ✅ 手势长按超时
- ✅ Gesture Long Press Timeout
- ✅ ジェスチャー長押しタイムアウト
- ✅ 제스처 길게 누르기 타임아웃

### v94.5 投射视频缓冲大小 | Cast Video Buffer Size | キャストビデオバッファサイズ | 캐스트 비디오 버퍼 크기
- ✅ 投射视频缓冲大小
- ✅ Cast Video Buffer Size
- ✅ キャストビデオバッファサイズ
- ✅ 캐스트 비디오 버퍼 크기

### v94.6 播放列表按UP主分组 | Playlist Auto Group By Up | プレイリストUP主別グループ化 | 재생 목록 UP주별 그룹화
- ✅ 播放列表按UP主分组
- ✅ Playlist Auto Group By Up
- ✅ プレイリストUP主別グループ化
- ✅ 재생 목록 UP주별 그룹화

### v94.7 缓存智能清理 | Cache Smart Cleanup | キャッシュスマートクリーンアップ | 캐시 스마트 정리
- ✅ 缓存智能清理
- ✅ Cache Smart Cleanup
- ✅ キャッシュスマートクリーンアップ
- ✅ 캐시 스마트 정리

### v94.8 进度条直播指示器 | Progress Bar Live Indicator | プログレスバーライブインジケーター | 진행 바 라이브 표시기
- ✅ 进度条直播指示器
- ✅ Progress Bar Live Indicator
- ✅ プログレスバーライブインジケーター
- ✅ 진행 바 라이브 표시기

### v94.9 音量自动声像 | Volume Auto Pan | 音量自動パン | 볼륨 자동 팬
- ✅ 音量自动声像
- ✅ Volume Auto Pan
- ✅ 音量自動パン
- ✅ 볼륨 자동 팬

### v94.10 历史记录自动导出 | History Export Auto | 履歴自動エクスポート | 기록 자동 내보내기
- ✅ 历史记录自动导出
- ✅ History Export Auto
- ✅ 履歴自動エクスポート
- ✅ 기록 자동 내보내기

### v94.11 播放自动跳过片头 | Playback Auto Skip Title | 再生自動タイトルスキップ | 재생 자동 타이틀 건너뛰기
- ✅ 播放自动跳过片头
- ✅ Playback Auto Skip Title
- ✅ 再生自動タイトルスキップ
- ✅ 재생 자동 타이틀 건너뛰기

### v94.12 截图自动复制路径 | Screenshot Auto Copy Path | スクリーンショット自動パスコピー | 스크린샷 자동 경로 복사
- ✅ 截图自动复制路径
- ✅ Screenshot Auto Copy Path
- ✅ スクリーンショット自動パスコピー
- ✅ 스크린샷 자동 경로 복사

### v94.13 视频ASCII艺术模式 | Video Ascii Art Mode | ビデオアスキーアートモード | 비디오 ASCII 아트 모드
- ✅ 视频ASCII艺术模式
- ✅ Video Ascii Art Mode
- ✅ ビデオアスキーアートモード
- ✅ 비디오 ASCII 아트 모드

### v94.14 弹幕字体大小步进 | Danmaku Font Size Step | コメントフォントサイズステップ | 댓글 글꼴 크기 단계
- ✅ 弹幕字体大小步进
- ✅ Danmaku Font Size Step
- ✅ コメントフォントサイズステップ
- ✅ 댓글 글꼴 크기 단계

### v94.15 字幕动画淡入时间 | Subtitle Animation Fade Time | 字幕アニメーションフェード時間 | 자막 애니메이션 페이드 시간
- ✅ 字幕动画淡入时间
- ✅ Subtitle Animation Fade Time
- ✅ 字幕アニメーションフェード時間
- ✅ 자막 애니메이션 페이드 시간

### v95.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v95.1-v95.15 功能列表
- ✅ Video Glitch Effect Custom, Danmaku Scroll Easing, Subtitle BG Gradient Angle, Gesture Double Tap Timeout, Cast Audio Buffer Size, Playlist Auto Group By Date, Cache Storage Limit, Progress Bar Chapter Color, Volume Auto Crossfade, History Import Auto, Playback Auto Skip Ending95, Screenshot Auto Open After, Video VHS Effect Custom, Danmaku Scroll Acceleration, Subtitle BG Gradient Opacity

### v95.1 视频故障效果自定义 | Video Glitch Effect Custom | ビデオグリッチエフェクトカスタム | 비디오 글리치 효과 사용자 정의
- ✅ 视频故障效果自定义
- ✅ Video Glitch Effect Custom
- ✅ ビデオグリッチエフェクトカスタム
- ✅ 비디오 글리치 효과 사용자 정의

### v95.2 弹幕滚动缓动 | Danmaku Scroll Easing | コメントスクロールイージング | 댓글 스크롤 이징
- ✅ 弹幕滚动缓动
- ✅ Danmaku Scroll Easing
- ✅ コメントスクロールイージング
- ✅ 댓글 스크롤 이징

### v95.3 字幕背景渐变角度 | Subtitle BG Gradient Angle | 字幕BGグラデーション角度 | 자막 배경 그래디언트 각도
- ✅ 字幕背景渐变角度
- ✅ Subtitle BG Gradient Angle
- ✅ 字幕BGグラデーション角度
- ✅ 자막 배경 그래디언트 각도

### v95.4 手势双击超时 | Gesture Double Tap Timeout | ジェスチャーダブルタップタイムアウト | 제스처 더블탭 타임아웃
- ✅ 手势双击超时
- ✅ Gesture Double Tap Timeout
- ✅ ジェスチャーダブルタップタイムアウト
- ✅ 제스처 더블탭 타임아웃

### v95.5 投射音频缓冲大小 | Cast Audio Buffer Size | キャスト音声バッファサイズ | 캐스트 오디오 버퍼 크기
- ✅ 投射音频缓冲大小
- ✅ Cast Audio Buffer Size
- ✅ キャスト音声バッファサイズ
- ✅ 캐스트 오디오 버퍼 크기

### v95.6 播放列表按日期分组 | Playlist Auto Group By Date | プレイリスト日付別グループ化 | 재생 목록 날짜별 그룹화
- ✅ 播放列表按日期分组
- ✅ Playlist Auto Group By Date
- ✅ プレイリスト日付別グループ化
- ✅ 재생 목록 날짜별 그룹화

### v95.7 缓存存储限制 | Cache Storage Limit | キャッシュストレージ制限 | 캐시 저장 공간 제한
- ✅ 缓存存储限制
- ✅ Cache Storage Limit
- ✅ キャッシュストレージ制限
- ✅ 캐시 저장 공간 제한

### v95.8 进度条章节颜色 | Progress Bar Chapter Color | プログレスバーチャプター色 | 진행 바 챕터 색상
- ✅ 进度条章节颜色
- ✅ Progress Bar Chapter Color
- ✅ プログレスバーチャプター色
- ✅ 진행 바 챕터 색상

### v95.9 音量自动交叉淡入淡出 | Volume Auto Crossfade | 音量自動クロスフェード | 볼륨 자동 크로스페이드
- ✅ 音量自动交叉淡入淡出
- ✅ Volume Auto Crossfade
- ✅ 音量自動クロスフェード
- ✅ 볼륨 자동 크로스페이드

### v95.10 历史记录自动导入 | History Import Auto | 履歴自動インポート | 기록 자동 가져오기
- ✅ 历史记录自动导入
- ✅ History Import Auto
- ✅ 履歴自動インポート
- ✅ 기록 자동 가져오기

### v95.11 播放自动跳过片尾95 | Playback Auto Skip Ending95 | 再生自動エンディングスキップ95 | 재생 자동 엔딩 건너뛰기95
- ✅ 播放自动跳过片尾95
- ✅ Playback Auto Skip Ending95
- ✅ 再生自動エンディングスキップ95
- ✅ 재생 자동 엔딩 건너뛰기95

### v95.12 截图后自动打开 | Screenshot Auto Open After | スクリーンショット後自動オープン | 스크린샷 후 자동 열기
- ✅ 截图后自动打开
- ✅ Screenshot Auto Open After
- ✅ スクリーンショット後自動オープン
- ✅ 스크린샷 후 자동 열기

### v95.13 视频VHS效果自定义 | Video VHS Effect Custom | ビデオVHSエフェクトカスタム | 비디오 VHS 효과 사용자 정의
- ✅ 视频VHS效果自定义
- ✅ Video VHS Effect Custom
- ✅ ビデオVHSエフェクトカスタム
- ✅ 비디오 VHS 효과 사용자 정의

### v95.14 弹幕滚动加速度 | Danmaku Scroll Acceleration | コメントスクロール加速度 | 댓글 스크롤 가속도
- ✅ 弹幕滚动加速度
- ✅ Danmaku Scroll Acceleration
- ✅ コメントスクロール加速度
- ✅ 댓글 스크롤 가속도

### v95.15 字幕背景渐变透明度 | Subtitle BG Gradient Opacity | 字幕BGグラデーション透明度 | 자막 배경 그래디언트 불투명도
- ✅ 字幕背景渐变透明度
- ✅ Subtitle BG Gradient Opacity
- ✅ 字幕BGグラデーション透明度
- ✅ 자막 배경 그래디언트 불투명도

### v96.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v96.1-v96.15 功能列表
- ✅ Video Neon Glow Custom, Danmaku Font Letter Spacing, Subtitle BG Gradient Type, Gesture Swipe Min Distance, Cast Video Decode Threads, Playlist Auto Group By Type, Cache Cleanup Interval, Progress Bar Thumb Shadow, Volume Auto Replay Gain, History Auto Clean Max Days, Playback Auto Skip Credits, Screenshot Auto Share Target, Video Dreamy Effect Custom, Danmaku Scroll Deceleration, Subtitle BG Gradient Start

### v96.1 视频霓虹发光自定义 | Video Neon Glow Custom | ビデオネオングローカスタム | 비디오 네온 글로우 사용자 정의
- ✅ 视频霓虹发光自定义
- ✅ Video Neon Glow Custom
- ✅ ビデオネオングローカスタム
- ✅ 비디오 네온 글로우 사용자 정의

### v96.2 弹幕字体字间距 | Danmaku Font Letter Spacing | コメントフォントレタースペーシング | 댓글 글꼴 자간
- ✅ 弹幕字体字间距
- ✅ Danmaku Font Letter Spacing
- ✅ コメントフォントレタースペーシング
- ✅ 댓글 글꼴 자간

### v96.3 字幕背景渐变类型 | Subtitle BG Gradient Type | 字幕BGグラデーションタイプ | 자막 배경 그래디언트 유형
- ✅ 字幕背景渐变类型
- ✅ Subtitle BG Gradient Type
- ✅ 字幕BGグラデーションタイプ
- ✅ 자막 배경 그래디언트 유형

### v96.4 手势滑动最小距离 | Gesture Swipe Min Distance | ジェスチャースワイプ最小距離 | 제스처 스와이프 최소 거리
- ✅ 手势滑动最小距离
- ✅ Gesture Swipe Min Distance
- ✅ ジェスチャースワイプ最小距離
- ✅ 제스처 스와이프 최소 거리

### v96.5 投射视频解码线程 | Cast Video Decode Threads | キャストビデオデコードスレッド | 캐스트 비디오 디코딩 스레드
- ✅ 投射视频解码线程
- ✅ Cast Video Decode Threads
- ✅ キャストビデオデコードスレッド
- ✅ 캐스트 비디오 디코딩 스레드

### v96.6 播放列表按类型分组 | Playlist Auto Group By Type | プレイリストタイプ別グループ化 | 재생 목록 유형별 그룹화
- ✅ 播放列表按类型分组
- ✅ Playlist Auto Group By Type
- ✅ プレイリストタイプ別グループ化
- ✅ 재생 목록 유형별 그룹화

### v96.7 缓存清理间隔 | Cache Cleanup Interval | キャッシュクリーンアップ間隔 | 캐시 정리 간격
- ✅ 缓存清理间隔
- ✅ Cache Cleanup Interval
- ✅ キャッシュクリーンアップ間隔
- ✅ 캐시 정리 간격

### v96.8 进度条滑块阴影 | Progress Bar Thumb Shadow | プログレスバーサムシャドウ | 진행 바 썸 그림자
- ✅ 进度条滑块阴影
- ✅ Progress Bar Thumb Shadow
- ✅ プログレスバーサムシャドウ
- ✅ 진행 바 썸 그림자

### v96.9 音量自动回放增益 | Volume Auto Replay Gain | 音量自動リプレイゲイン | 볼륨 자동 리플레이 게인
- ✅ 音量自动回放增益
- ✅ Volume Auto Replay Gain
- ✅ 音量自動リプレイゲイン
- ✅ 볼륨 자동 리플레이 게인

### v96.10 历史记录自动清理最大天数 | History Auto Clean Max Days | 履歴自動クリーンアップ最大日数 | 기록 자동 정리 최대 일수
- ✅ 历史记录自动清理最大天数
- ✅ History Auto Clean Max Days
- ✅ 履歴自動クリーンアップ最大日数
- ✅ 기록 자동 정리 최대 일수

### v96.11 播放自动跳过制作人员 | Playback Auto Skip Credits | 再生自動クレジットスキップ | 재생 자동 크레딧 건너뛰기
- ✅ 播放自动跳过制作人员
- ✅ Playback Auto Skip Credits
- ✅ 再生自動クレジットスキップ
- ✅ 재생 자동 크레딧 건너뛰기

### v96.12 截图自动分享目标 | Screenshot Auto Share Target | スクリーンショット自動共有ターゲット | 스크린샷 자동 공유 대상
- ✅ 截图自动分享目标
- ✅ Screenshot Auto Share Target
- ✅ スクリーンショット自動共有ターゲット
- ✅ 스크린샷 자동 공유 대상

### v96.13 视频梦幻效果自定义 | Video Dreamy Effect Custom | ビデオドリーミーエフェクトカスタム | 비디오 드리미 효과 사용자 정의
- ✅ 视频梦幻效果自定义
- ✅ Video Dreamy Effect Custom
- ✅ ビデオドリーミーエフェクトカスタム
- ✅ 비디오 드리미 효과 사용자 정의

### v96.14 弹幕滚动减速度 | Danmaku Scroll Deceleration | コメントスクロール減速度 | 댓글 스크롤 감속도
- ✅ 弹幕滚动减速度
- ✅ Danmaku Scroll Deceleration
- ✅ コメントスクロール減速度
- ✅ 댓글 스크롤 감속도

### v96.15 字幕背景渐变开始 | Subtitle BG Gradient Start | 字幕BGグラデーション開始 | 자막 배경 그래디언트 시작
- ✅ 字幕背景渐变开始
- ✅ Subtitle BG Gradient Start
- ✅ 字幕BGグラデーション開始
- ✅ 자막 배경 그래디언트 시작

### v97.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v97.1-v97.15 功能列表
- ✅ Video Sepia Custom, Danmaku Font Weight Range, Subtitle BG Gradient End, Gesture Swipe Angle Threshold, Cast Video Post Processing, Playlist Auto Group By Season, Cache Preload Policy, Progress Bar Thumb Glow, Volume Auto Peak Limit, History Auto Clean Min Items, Playback Auto Skip Recap97, Screenshot Auto Annotate Text, Video Polaroid Custom, Danmaku Font Size Min, Subtitle Animation Type97

### v97.1 视频怀旧自定义 | Video Sepia Custom | ビデオセピアカスタム | 비디오 세피아 사용자 정의
- ✅ 视频怀旧自定义
- ✅ Video Sepia Custom
- ✅ ビデオセピアカスタム
- ✅ 비디오 세피아 사용자 정의

### v97.2 弹幕字体粗细范围 | Danmaku Font Weight Range | コメントフォントウェイト範囲 | 댓글 글꼴 굵기 범위
- ✅ 弹幕字体粗细范围
- ✅ Danmaku Font Weight Range
- ✅ コメントフォントウェイト範囲
- ✅ 댓글 글꼴 굵기 범위

### v97.3 字幕背景渐变结束 | Subtitle BG Gradient End | 字幕BGグラデーション終了 | 자막 배경 그래디언트 종료
- ✅ 字幕背景渐变结束
- ✅ Subtitle BG Gradient End
- ✅ 字幕BGグラデーション終了
- ✅ 자막 배경 그래디언트 종료

### v97.4 手势滑动角度阈值 | Gesture Swipe Angle Threshold | ジェスチャースワイプ角度しきい値 | 제스처 스와이프 각도 임계값
- ✅ 手势滑动角度阈值
- ✅ Gesture Swipe Angle Threshold
- ✅ ジェスチャースワイプ角度しきい値
- ✅ 제스처 스와이프 각도 임계값

### v97.5 投射视频后处理 | Cast Video Post Processing | キャストビデオ後処理 | 캐스트 비디오 후처리
- ✅ 投射视频后处理
- ✅ Cast Video Post Processing
- ✅ キャストビデオ後処理
- ✅ 캐스트 비디오 후처리

### v97.6 播放列表按季度分组 | Playlist Auto Group By Season | プレイリストシーズン別グループ化 | 재생 목록 시즌별 그룹화
- ✅ 播放列表按季度分组
- ✅ Playlist Auto Group By Season
- ✅ プレイリストシーズン別グループ化
- ✅ 재생 목록 시즌별 그룹화

### v97.7 缓存预加载策略 | Cache Preload Policy | キャッシュプリロードポリシー | 캐시 프리로드 정책
- ✅ 缓存预加载策略
- ✅ Cache Preload Policy
- ✅ キャッシュプリロードポリシー
- ✅ 캐시 프리로드 정책

### v97.8 进度条滑块发光 | Progress Bar Thumb Glow | プログレスバーサムグロウ | 진행 바 썸 글로우
- ✅ 进度条滑块发光
- ✅ Progress Bar Thumb Glow
- ✅ プログレスバーサムグロウ
- ✅ 진행 바 썸 글로우

### v97.9 音量自动峰值限制 | Volume Auto Peak Limit | 音量自動ピークリミット | 볼륨 자동 피크 제한
- ✅ 音量自动峰值限制
- ✅ Volume Auto Peak Limit
- ✅ 音量自動ピークリミット
- ✅ 볼륨 자동 피크 제한

### v97.10 历史记录自动清理最小条目 | History Auto Clean Min Items | 履歴自動クリーンアップ最小アイテム | 기록 자동 정리 최소 항목
- ✅ 历史记录自动清理最小条目
- ✅ History Auto Clean Min Items
- ✅ 履歴自動クリーンアップ最小アイテム
- ✅ 기록 자동 정리 최소 항목

### v97.11 播放自动跳过回顾97 | Playback Auto Skip Recap97 | 再生自動リキャップスキップ97 | 재생 자동 리캡 건너뛰기97
- ✅ 播放自动跳过回顾97
- ✅ Playback Auto Skip Recap97
- ✅ 再生自動リキャップスキップ97
- ✅ 재생 자동 리캡 건너뛰기97

### v97.12 截图自动标注文字 | Screenshot Auto Annotate Text | スクリーンショット自動テキスト注釈 | 스크린샷 자동 텍스트 주석
- ✅ 截图自动标注文字
- ✅ Screenshot Auto Annotate Text
- ✅ スクリーンショット自動テキスト注釈
- ✅ 스크린샷 자동 텍스트 주석

### v97.13 视频宝丽来效果自定义 | Video Polaroid Custom | ビデオポラロイドカスタム | 비디오 폴라로이드 사용자 정의
- ✅ 视频宝丽来效果自定义
- ✅ Video Polaroid Custom
- ✅ ビデオポラロイドカスタム
- ✅ 비디오 폴라로이드 사용자 정의

### v97.14 弹幕字体大小最小值 | Danmaku Font Size Min | コメントフォントサイズ最小値 | 댓글 글꼴 크기 최소값
- ✅ 弹幕字体大小最小值
- ✅ Danmaku Font Size Min
- ✅ コメントフォントサイズ最小値
- ✅ 댓글 글꼴 크기 최소값

### v97.15 字幕动画类型97 | Subtitle Animation Type97 | 字幕アニメーションタイプ97 | 자막 애니메이션 유형97
- ✅ 字幕动画类型97
- ✅ Subtitle Animation Type97
- ✅ 字幕アニメーションタイプ97
- ✅ 자막 애니메이션 유형97

### v98.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v98.1-v98.15 功能列表
- ✅ Video Negative Custom, Danmaku Font Size Max, Subtitle Animation Speed98, Gesture Pinch Min Scale, Cast Audio Post Processing, Playlist Auto Group By Genre, Cache Download On Wifi, Progress Bar Thumb Border, Volume Auto RMS Level, History Auto Clean On Start, Playback Auto Skip Filler98, Screenshot Auto Upload Cloud, Video Monochrome Custom, Danmaku Font Style Custom98, Subtitle Animation Easing98

### v98.1 视频负片效果自定义 | Video Negative Custom | ビデオネガティブカスタム | 비디오 네거티브 사용자 정의
- ✅ 视频负片效果自定义
- ✅ Video Negative Custom
- ✅ ビデオネガティブカスタム
- ✅ 비디오 네거티브 사용자 정의

### v98.2 弹幕字体大小最大值 | Danmaku Font Size Max | コメントフォントサイズ最大値 | 댓글 글꼴 크기 최대값
- ✅ 弹幕字体大小最大值
- ✅ Danmaku Font Size Max
- ✅ コメントフォントサイズ最大値
- ✅ 댓글 글꼴 크기 최대값

### v98.3 字幕动画速度98 | Subtitle Animation Speed98 | 字幕アニメーション速度98 | 자막 애니메이션 속도98
- ✅ 字幕动画速度98
- ✅ Subtitle Animation Speed98
- ✅ 字幕アニメーション速度98
- ✅ 자막 애니메이션 속도98

### v98.4 手势捏合最小缩放 | Gesture Pinch Min Scale | ジェスチャーピンチ最小スケール | 제스처 핀치 최소 스케일
- ✅ 手势捏合最小缩放
- ✅ Gesture Pinch Min Scale
- ✅ ジェスチャーピンチ最小スケール
- ✅ 제스처 핀치 최소 스케일

### v98.5 投射音频后处理 | Cast Audio Post Processing | キャスト音声後処理 | 캐스트 오디오 후처리
- ✅ 投射音频后处理
- ✅ Cast Audio Post Processing
- ✅ キャスト音声後処理
- ✅ 캐스트 오디오 후처리

### v98.6 播放列表按类型分组 | Playlist Auto Group By Genre | プレイリストジャンル別グループ化 | 재생 목록 장르별 그룹화
- ✅ 播放列表按类型分组
- ✅ Playlist Auto Group By Genre
- ✅ プレイリストジャンル別グループ化
- ✅ 재생 목록 장르별 그룹화

### v98.7 缓存WiFi下载 | Cache Download On Wifi | キャッシュWiFiダウンロード | 캐시 WiFi 다운로드
- ✅ 缓存WiFi下载
- ✅ Cache Download On Wifi
- ✅ キャッシュWiFiダウンロード
- ✅ 캐시 WiFi 다운로드

### v98.8 进度条滑块边框 | Progress Bar Thumb Border | プログレスバーサムボーダー | 진행 바 썸 테두리
- ✅ 进度条滑块边框
- ✅ Progress Bar Thumb Border
- ✅ プログレスバーサムボーダー
- ✅ 진행 바 썸 테두리

### v98.9 音量自动RMS电平 | Volume Auto RMS Level | 音量自動RMSレベル | 볼륨 자동 RMS 레벨
- ✅ 音量自动RMS电平
- ✅ Volume Auto RMS Level
- ✅ 音量自動RMSレベル
- ✅ 볼륨 자동 RMS 레벨

### v98.10 历史记录启动时自动清理 | History Auto Clean On Start | 履歴起動時自動クリーンアップ | 기록 시작 시 자동 정리
- ✅ 历史记录启动时自动清理
- ✅ History Auto Clean On Start
- ✅ 履歴起動時自動クリーンアップ
- ✅ 기록 시작 시 자동 정리

### v98.11 播放自动跳过填充98 | Playback Auto Skip Filler98 | 再生自動フィラースキップ98 | 재생 자동 필러 건너뛰기98
- ✅ 播放自动跳过填充98
- ✅ Playback Auto Skip Filler98
- ✅ 再生自動フィラースキップ98
- ✅ 재생 자동 필러 건너뛰기98

### v98.12 截图自动上传云端 | Screenshot Auto Upload Cloud | スクリーンショット自動クラウドアップロード | 스크린샷 자동 클라우드 업로드
- ✅ 截图自动上传云端
- ✅ Screenshot Auto Upload Cloud
- ✅ スクリーンショット自動クラウドアップロード
- ✅ 스크린샷 자동 클라우드 업로드

### v98.13 视频单色效果自定义 | Video Monochrome Custom | ビデオモノクロームカスタム | 비디오 모노크롬 사용자 정의
- ✅ 视频单色效果自定义
- ✅ Video Monochrome Custom
- ✅ ビデオモノクロームカスタム
- ✅ 비디오 모노크롬 사용자 정의

### v98.14 弹幕字体样式自定义98 | Danmaku Font Style Custom98 | コメントフォントスタイルカスタム98 | 댓글 글꼴 스타일 사용자 정의98
- ✅ 弹幕字体样式自定义98
- ✅ Danmaku Font Style Custom98
- ✅ コメントフォントスタイルカスタム98
- ✅ 댓글 글꼴 스타일 사용자 정의98

### v98.15 字幕动画缓动98 | Subtitle Animation Easing98 | 字幕アニメーションイージング98 | 자막 애니메이션 이징98
- ✅ 字幕动画缓动98
- ✅ Subtitle Animation Easing98
- ✅ 字幕アニメーションイージング98
- ✅ 자막 애니메이션 이징98

### v99.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v99.1-v99.15 功能列表
- ✅ Video Posterize Custom, Danmaku Font Outline Toggle, Subtitle Animation Duration99, Gesture Pinch Max Scale, Cast Video Auto Quality, Playlist Auto Group By Channel, Cache Download Speed Limit, Progress Bar Thumb Size99, Volume Auto Loudness99, History Auto Clean On Exit, Playback Auto Skip Intro99, Screenshot Auto Share99, Video Solarize Custom, Danmaku Font Color Custom, Subtitle Animation Loop99

### v99.1 视频色调分离自定义 | Video Posterize Custom | ビデオポスタリーズカスタム | 비디오 포스터라이즈 사용자 정의
- ✅ 视频色调分离自定义
- ✅ Video Posterize Custom
- ✅ ビデオポスタリーズカスタム
- ✅ 비디오 포스터라이즈 사용자 정의

### v99.2 弹幕字体描边开关 | Danmaku Font Outline Toggle | コメントフォントアウトライン切替 | 댓글 글꼴 외곽선 전환
- ✅ 弹幕字体描边开关
- ✅ Danmaku Font Outline Toggle
- ✅ コメントフォントアウトライン切替
- ✅ 댓글 글꼴 외곽선 전환

### v99.3 字幕动画持续时间99 | Subtitle Animation Duration99 | 字幕アニメーション持続時間99 | 자막 애니메이션 지속 시간99
- ✅ 字幕动画持续时间99
- ✅ Subtitle Animation Duration99
- ✅ 字幕アニメーション持続時間99
- ✅ 자막 애니메이션 지속 시간99

### v99.4 手势捏合最大缩放 | Gesture Pinch Max Scale | ジェスチャーピンチ最大スケール | 제스처 핀치 최대 스케일
- ✅ 手势捏合最大缩放
- ✅ Gesture Pinch Max Scale
- ✅ ジェスチャーピンチ最大スケール
- ✅ 제스처 핀치 최대 스케일

### v99.5 投射视频自动画质 | Cast Video Auto Quality | キャストビデオ自動画質 | 캐스트 비디오 자동 화질
- ✅ 投射视频自动画质
- ✅ Cast Video Auto Quality
- ✅ キャストビデオ自動画質
- ✅ 캐스트 비디오 자동 화질

### v99.6 播放列表按频道分组 | Playlist Auto Group By Channel | プレイリストチャンネル別グループ化 | 재생 목록 채널별 그룹화
- ✅ 播放列表按频道分组
- ✅ Playlist Auto Group By Channel
- ✅ プレイリストチャンネル別グループ化
- ✅ 재생 목록 채널별 그룹화

### v99.7 缓存下载速度限制 | Cache Download Speed Limit | キャッシュダウンロード速度制限 | 캐시 다운로드 속도 제한
- ✅ 缓存下载速度限制
- ✅ Cache Download Speed Limit
- ✅ キャッシュダウンロード速度制限
- ✅ 캐시 다운로드 속도 제한

### v99.8 进度条滑块大小99 | Progress Bar Thumb Size99 | プログレスバーサムサイズ99 | 진행 바 썸 크기99
- ✅ 进度条滑块大小99
- ✅ Progress Bar Thumb Size99
- ✅ プログレスバーサムサイズ99
- ✅ 진행 바 썸 크기99

### v99.9 音量自动响度99 | Volume Auto Loudness99 | 音量自動ラウドネス99 | 볼륨 자동 음량99
- ✅ 音量自动响度99
- ✅ Volume Auto Loudness99
- ✅ 音量自動ラウドネス99
- ✅ 볼륨 자동 음량99

### v99.10 历史记录退出时自动清理 | History Auto Clean On Exit | 履歴終了時自動クリーンアップ | 기록 종료 시 자동 정리
- ✅ 历史记录退出时自动清理
- ✅ History Auto Clean On Exit
- ✅ 履歴終了時自動クリーンアップ
- ✅ 기록 종료 시 자동 정리

### v99.11 播放自动跳过片头99 | Playback Auto Skip Intro99 | 再生自動イントロスキップ99 | 재생 자동 인트로 건너뛰기99
- ✅ 播放自动跳过片头99
- ✅ Playback Auto Skip Intro99
- ✅ 再生自動イントロスキップ99
- ✅ 재생 자동 인트로 건너뛰기99

### v99.12 截图自动分享99 | Screenshot Auto Share99 | スクリーンショット自動共有99 | 스크린샷 자동 공유99
- ✅ 截图自动分享99
- ✅ Screenshot Auto Share99
- ✅ スクリーンショット自動共有99
- ✅ 스크린샷 자동 공유99

### v99.13 视频曝光过度自定义 | Video Solarize Custom | ビデオソラライズカスタム | 비디오 솔라라이즈 사용자 정의
- ✅ 视频曝光过度自定义
- ✅ Video Solarize Custom
- ✅ ビデオソラライズカスタム
- ✅ 비디오 솔라라이즈 사용자 정의

### v99.14 弹幕字体颜色自定义 | Danmaku Font Color Custom | コメントフォント色カスタム | 댓글 글꼴 색상 사용자 정의
- ✅ 弹幕字体颜色自定义
- ✅ Danmaku Font Color Custom
- ✅ コメントフォント色カスタム
- ✅ 댓글 글꼴 색상 사용자 정의

### v99.15 字幕动画循环99 | Subtitle Animation Loop99 | 字幕アニメーションループ99 | 자막 애니메이션 반복99
- ✅ 字幕动画循环99
- ✅ Subtitle Animation Loop99
- ✅ 字幕アニメーションループ99
- ✅ 자막 애니메이션 반복99

### v100.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v100.1-v100.15 功能列表
- ✅ Video Duotone Custom, Danmaku Font BG Toggle, Subtitle Animation Delay99, Gesture Pinch Speed99, Cast Audio Auto Quality, Playlist Auto Group All, Cache Download Retry, Progress Bar Thumb Color99, Volume Auto Normalize99, History Auto Sync99, Playback Auto Skip Outro99, Screenshot Auto Format99, Video Tint Duotone, Danmaku Font Weight99, Subtitle Animation Type99

### v100.1 视频双色调自定义 | Video Duotone Custom | ビデオデュオトーンカスタム | 비디오 듀오톤 사용자 정의
- ✅ 视频双色调自定义
- ✅ Video Duotone Custom
- ✅ ビデオデュオトーンカスタム
- ✅ 비디오 듀오톤 사용자 정의

### v100.2 弹幕字体背景开关 | Danmaku Font BG Toggle | コメントフォントBG切替 | 댓글 글꼴 배경 전환
- ✅ 弹幕字体背景开关
- ✅ Danmaku Font BG Toggle
- ✅ コメントフォントBG切替
- ✅ 댓글 글꼴 배경 전환

### v100.3 字幕动画延迟99 | Subtitle Animation Delay99 | 字幕アニメーション遅延99 | 자막 애니메이션 지연99
- ✅ 字幕动画延迟99
- ✅ Subtitle Animation Delay99
- ✅ 字幕アニメーション遅延99
- ✅ 자막 애니메이션 지연99

### v100.4 手势捏合速度99 | Gesture Pinch Speed99 | ジェスチャーピンチ速度99 | 제스처 핀치 속도99
- ✅ 手势捏合速度99
- ✅ Gesture Pinch Speed99
- ✅ ジェスチャーピンチ速度99
- ✅ 제스처 핀치 속도99

### v100.5 投射音频自动音质 | Cast Audio Auto Quality | キャスト音声自動品質 | 캐스트 오디오 자동 음질
- ✅ 投射音频自动音质
- ✅ Cast Audio Auto Quality
- ✅ キャスト音声自動品質
- ✅ 캐스트 오디오 자동 음질

### v100.6 播放列表全部自动分组 | Playlist Auto Group All | プレイリスト全自動グループ化 | 재생 목록 전체 자동 그룹화
- ✅ 播放列表全部自动分组
- ✅ Playlist Auto Group All
- ✅ プレイリスト全自動グループ化
- ✅ 재생 목록 전체 자동 그룹화

### v100.7 缓存下载重试 | Cache Download Retry | キャッシュダウンロードリトライ | 캐시 다운로드 재시도
- ✅ 缓存下载重试
- ✅ Cache Download Retry
- ✅ キャッシュダウンロードリトライ
- ✅ 캐시 다운로드 재시도

### v100.8 进度条滑块颜色99 | Progress Bar Thumb Color99 | プログレスバーサム色99 | 진행 바 썸 색상99
- ✅ 进度条滑块颜色99
- ✅ Progress Bar Thumb Color99
- ✅ プログレスバーサム色99
- ✅ 진행 바 썸 색상99

### v100.9 音量自动标准化99 | Volume Auto Normalize99 | 音量自動正規化99 | 볼륨 자동 정규화99
- ✅ 音量自动标准化99
- ✅ Volume Auto Normalize99
- ✅ 音量自動正規化99
- ✅ 볼륨 자동 정규화99

### v100.10 历史记录自动同步99 | History Auto Sync99 | 履歴自動同期99 | 기록 자동 동기화99
- ✅ 历史记录自动同步99
- ✅ History Auto Sync99
- ✅ 履歴自動同期99
- ✅ 기록 자동 동기화99

### v100.11 播放自动跳过片尾99 | Playback Auto Skip Outro99 | 再生自動アウトロスキップ99 | 재생 자동 아웃트로 건너뛰기99
- ✅ 播放自动跳过片尾99
- ✅ Playback Auto Skip Outro99
- ✅ 再生自動アウトロスキップ99
- ✅ 재생 자동 아웃트로 건너뛰기99

### v100.12 截图自动格式99 | Screenshot Auto Format99 | スクリーンショット自動フォーマット99 | 스크린샷 자동 형식99
- ✅ 截图自动格式99
- ✅ Screenshot Auto Format99
- ✅ スクリーンショット自動フォーマット99
- ✅ 스크린샷 자동 형식99

### v100.13 视频色调双色 | Video Tint Duotone | ビデオチントデュオトーン | 비디오 틴트 듀오톤
- ✅ 视频色调双色
- ✅ Video Tint Duotone
- ✅ ビデオチントデュオトーン
- ✅ 비디오 틴트 듀오톤

### v100.14 弹幕字体粗细99 | Danmaku Font Weight99 | コメントフォントウェイト99 | 댓글 글꼴 굵기99
- ✅ 弹幕字体粗细99
- ✅ Danmaku Font Weight99
- ✅ コメントフォントウェイト99
- ✅ 댓글 글꼴 굵기99

### v100.15 字幕动画类型99 | Subtitle Animation Type99 | 字幕アニメーションタイプ99 | 자막 애니메이션 유형99
- ✅ 字幕动画类型99
- ✅ Subtitle Animation Type99
- ✅ 字幕アニメーションタイプ99
- ✅ 자막 애니메이션 유형99


### v101.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v101.1-v101.15 功能列表
- ✅ Audio Spatial Width Custom, Danmaku Font Stretch Toggle, Subtitle Shadow Color Custom, Gesture Swipe Lock Horizontal, Cast Video HDR Mode, Playlist Auto Remove Watched, Cache Encrypt Toggle, Progress Bar Chapter Snap, Volume EQ Preset Custom, History Search Highlight, Playback Loop Segment AB, Screenshot Auto Crop, Video Edge Enhance Custom, Danmaku Font Glow Toggle, Subtitle Line Spacing

### v101.1 音频空间宽度自定义 | Audio Spatial Width Custom | オーディオ空間幅カスタム | 오디오 공간 너비 사용자 정의
- ✅ 音频空间宽度自定义
- ✅ Audio Spatial Width Custom
- ✅ オーディオ空間幅カスタム
- ✅ 오디오 공간 너비 사용자 정의

### v101.2 弹幕字体拉伸开关 | Danmaku Font Stretch Toggle | コメントフォントストレッチ切替 | 댓글 글꼴 스트레치 전환
- ✅ 弹幕字体拉伸开关
- ✅ Danmaku Font Stretch Toggle
- ✅ コメントフォントストレッチ切替
- ✅ 댓글 글꼴 스트레치 전환

### v101.3 字幕阴影颜色自定义 | Subtitle Shadow Color Custom | 字幕シャドウ色カスタム | 자막 그림자 색상 사용자 정의
- ✅ 字幕阴影颜色自定义
- ✅ Subtitle Shadow Color Custom
- ✅ 字幕シャドウ色カスタム
- ✅ 자막 그림자 색상 사용자 정의

### v101.4 手势滑动锁定水平 | Gesture Swipe Lock Horizontal | ジェスチャースワイプ水平ロック | 제스처 스와이프 수평 잠금
- ✅ 手势滑动锁定水平
- ✅ Gesture Swipe Lock Horizontal
- ✅ ジェスチャースワイプ水平ロック
- ✅ 제스처 스와이프 수평 잠금

### v101.5 投射视频HDR模式 | Cast Video HDR Mode | キャストビデオHDRモード | 캐스트 비디오 HDR 모드
- ✅ 投射视频HDR模式
- ✅ Cast Video HDR Mode
- ✅ キャストビデオHDRモード
- ✅ 캐스트 비디오 HDR 모드

### v101.6 播放列表自动移除已看 | Playlist Auto Remove Watched | プレイリスト自動視聴済み削除 | 재생 목록 자동 시청 완료 제거
- ✅ 播放列表自动移除已看
- ✅ Playlist Auto Remove Watched
- ✅ プレイリスト自動視聴済み削除
- ✅ 재생 목록 자동 시청 완료 제거

### v101.7 缓存加密开关 | Cache Encrypt Toggle | キャッシュ暗号化切替 | 캐시 암호화 전환
- ✅ 缓存加密开关
- ✅ Cache Encrypt Toggle
- ✅ キャッシュ暗号化切替
- ✅ 캐시 암호화 전환

### v101.8 进度条章节吸附 | Progress Bar Chapter Snap | プログレスバーチャプタースナップ | 진행 바 챕터 스냅
- ✅ 进度条章节吸附
- ✅ Progress Bar Chapter Snap
- ✅ プログレスバーチャプタースナップ
- ✅ 진행 바 챕터 스냅

### v101.9 音量均衡器预设自定义 | Volume EQ Preset Custom | 音量EQプリセットカスタム | 볼륨 EQ 프리셋 사용자 정의
- ✅ 音量均衡器预设自定义
- ✅ Volume EQ Preset Custom
- ✅ 音量EQプリセットカスタム
- ✅ 볼륨 EQ 프리셋 사용자 정의

### v101.10 历史记录搜索高亮 | History Search Highlight | 履歴検索ハイライト | 기록 검색 하이라이트
- ✅ 历史记录搜索高亮
- ✅ History Search Highlight
- ✅ 履歴検索ハイライト
- ✅ 기록 검색 하이라이트

### v101.11 播放AB段循环 | Playback Loop Segment AB | 再生ABセグメントループ | 재생 AB 구간 반복
- ✅ 播放AB段循环
- ✅ Playback Loop Segment AB
- ✅ 再生ABセグメントループ
- ✅ 재생 AB 구간 반복

### v101.12 截图自动裁剪 | Screenshot Auto Crop | スクリーンショット自動クロップ | 스크린샷 자동 크롭
- ✅ 截图自动裁剪
- ✅ Screenshot Auto Crop
- ✅ スクリーンショット自動クロップ
- ✅ 스크린샷 자동 크롭

### v101.13 视频边缘增强自定义 | Video Edge Enhance Custom | ビデオエッジエンハンスカスタム | 비디오 엣지 강화 사용자 정의
- ✅ 视频边缘增强自定义
- ✅ Video Edge Enhance Custom
- ✅ ビデオエッジエンハンスカスタム
- ✅ 비디오 엣지 강화 사용자 정의

### v101.14 弹幕字体发光开关 | Danmaku Font Glow Toggle | コメントフォントグロウ切替 | 댓글 글꼴 글로우 전환
- ✅ 弹幕字体发光开关
- ✅ Danmaku Font Glow Toggle
- ✅ コメントフォントグロウ切替
- ✅ 댓글 글꼴 글로우 전환

### v101.15 字幕行间距 | Subtitle Line Spacing | 字幕行間隔 | 자막 줄 간격
- ✅ 字幕行间距
- ✅ Subtitle Line Spacing
- ✅ 字幕行間隔
- ✅ 자막 줄 간격

### v102.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v102.1-v102.15 功能列表
- ✅ Audio Bass Boost Custom, Danmaku Font Stroke Width, Subtitle Text Alignment, Gesture Swipe Lock Vertical, Cast Video AV Sync, Playlist Auto Reverse Order, Cache Auto Clear On Full, Progress Bar Buffer Show, Volume EQ Gain Preamp, History Pin Record Toggle, Playback Loop Segment Count, Screenshot Auto Rotate, Video Mosaic Effect Custom, Danmaku Font Glow Color, Subtitle Text Transform Custom

### v102.1 音频低音增强自定义 | Audio Bass Boost Custom | オーディオバスブーストカスタム | 오디오 저음 강화 사용자 정의
- ✅ 音频低音增强自定义
- ✅ Audio Bass Boost Custom
- ✅ オーディオバスブーストカスタム
- ✅ 오디오 저음 강화 사용자 정의

### v102.2 弹幕字体描边宽度 | Danmaku Font Stroke Width | コメントフォントストローク幅 | 댓글 글꼴 스트로크 너비
- ✅ 弹幕字体描边宽度
- ✅ Danmaku Font Stroke Width
- ✅ コメントフォントストローク幅
- ✅ 댓글 글꼴 스트로크 너비

### v102.3 字幕文字对齐 | Subtitle Text Alignment | 字幕テキスト整列 | 자막 텍스트 정렬
- ✅ 字幕文字对齐
- ✅ Subtitle Text Alignment
- ✅ 字幕テキスト整列
- ✅ 자막 텍스트 정렬

### v102.4 手势滑动锁定垂直 | Gesture Swipe Lock Vertical | ジェスチャースワイプ垂直ロック | 제스처 스와이프 수직 잠금
- ✅ 手势滑动锁定垂直
- ✅ Gesture Swipe Lock Vertical
- ✅ ジェスチャースワイプ垂直ロック
- ✅ 제스처 스와이프 수직 잠금

### v102.5 投射视频音视频同步 | Cast Video AV Sync | キャストビデオAV同期 | 캐스트 비디오 AV 동기화
- ✅ 投射视频音视频同步
- ✅ Cast Video AV Sync
- ✅ キャストビデオAV同期
- ✅ 캐스트 비디오 AV 동기화

### v102.6 播放列表自动反向排序 | Playlist Auto Reverse Order | プレイリスト自動逆順 | 재생 목록 자동 역순
- ✅ 播放列表自动反向排序
- ✅ Playlist Auto Reverse Order
- ✅ プレイリスト自動逆順
- ✅ 재생 목록 자동 역순

### v102.7 缓存满时自动清理 | Cache Auto Clear On Full | キャッシュ満杯時自動クリア | 캐시 가득 찰 때 자동 정리
- ✅ 缓存满时自动清理
- ✅ Cache Auto Clear On Full
- ✅ キャッシュ満杯時自動クリア
- ✅ 캐시 가득 찰 때 자동 정리

### v102.8 进度条缓冲显示 | Progress Bar Buffer Show | プログレスバーバッファ表示 | 진행 바 버퍼 표시
- ✅ 进度条缓冲显示
- ✅ Progress Bar Buffer Show
- ✅ プログレスバーバッファ表示
- ✅ 진행 바 버퍼 표시

### v102.9 音量均衡器增益前置 | Volume EQ Gain Preamp | 音量EQゲインプリアンプ | 볼륨 EQ 게인 프리앰프
- ✅ 音量均衡器增益前置
- ✅ Volume EQ Gain Preamp
- ✅ 音量EQゲインプリアンプ
- ✅ 볼륨 EQ 게인 프리앰프

### v102.10 历史记录固定记录开关 | History Pin Record Toggle | 履歴ピンレコード切替 | 기록 고정 기록 전환
- ✅ 历史记录固定记录开关
- ✅ History Pin Record Toggle
- ✅ 履歴ピンレコード切替
- ✅ 기록 고정 기록 전환

### v102.11 播放循环段计数 | Playback Loop Segment Count | 再生ループセグメントカウント | 재생 반복 구간 카운트
- ✅ 播放循环段计数
- ✅ Playback Loop Segment Count
- ✅ 再生ループセグメントカウント
- ✅ 재생 반복 구간 카운트

### v102.12 截图自动旋转 | Screenshot Auto Rotate | スクリーンショット自動回転 | 스크린샷 자동 회전
- ✅ 截图自动旋转
- ✅ Screenshot Auto Rotate
- ✅ スクリーンショット自動回転
- ✅ 스크린샷 자동 회전

### v102.13 视频马赛克效果自定义 | Video Mosaic Effect Custom | ビデオモザイクエフェクトカスタム | 비디오 모자이크 효과 사용자 정의
- ✅ 视频马赛克效果自定义
- ✅ Video Mosaic Effect Custom
- ✅ ビデオモザイクエフェクトカスタム
- ✅ 비디오 모자이크 효과 사용자 정의

### v102.14 弹幕字体发光颜色 | Danmaku Font Glow Color | コメントフォントグロウ色 | 댓글 글꼴 글로우 색상
- ✅ 弹幕字体发光颜色
- ✅ Danmaku Font Glow Color
- ✅ コメントフォントグロウ色
- ✅ 댓글 글꼴 글로우 색상

### v102.15 字幕文字变换自定义 | Subtitle Text Transform Custom | 字幕テキスト変換カスタム | 자막 텍스트 변환 사용자 정의
- ✅ 字幕文字变换自定义
- ✅ Subtitle Text Transform Custom
- ✅ 字幕テキスト変換カスタム
- ✅ 자막 텍스트 변환 사용자 정의

### v103.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v103.1-v103.15 功能列表
- ✅ Audio Treble Boost Custom, Danmaku Font Glow Radius, Subtitle Font Variant Custom, Gesture Long Press Drag Action, Cast Video Bit Depth, Playlist Auto Skip Duplicate, Cache Thumbnail Preload, Progress Bar Live Edge Color, Volume Night Boost Toggle, History Undo Delete Toggle, Playback AB Loop Memory, Screenshot Auto Naming Scheme, Video Kaleidoscope Custom, Danmaku Font Glow Intensity, Subtitle Font Load Custom

### v103.1 音频高音增强自定义 | Audio Treble Boost Custom | オーディオトレブルブーストカスタム | 오디오 고음 강화 사용자 정의
- ✅ 音频高音增强自定义
- ✅ Audio Treble Boost Custom
- ✅ オーディオトレブルブーストカスタム
- ✅ 오디오 고음 강화 사용자 정의

### v103.2 弹幕字体发光半径 | Danmaku Font Glow Radius | コメントフォントグロウ半径 | 댓글 글꼴 글로우 반경
- ✅ 弹幕字体发光半径
- ✅ Danmaku Font Glow Radius
- ✅ コメントフォントグロウ半径
- ✅ 댓글 글꼴 글로우 반경

### v103.3 字幕字体变体自定义 | Subtitle Font Variant Custom | 字幕フォントバリアントカスタム | 자막 글꼴 변형 사용자 정의
- ✅ 字幕字体变体自定义
- ✅ Subtitle Font Variant Custom
- ✅ 字幕フォントバリアントカスタム
- ✅ 자막 글꼴 변형 사용자 정의

### v103.4 手势长按拖动动作 | Gesture Long Press Drag Action | ジェスチャー長押しドラッグアクション | 제스처 길게 누르기 드래그 동작
- ✅ 手势长按拖动动作
- ✅ Gesture Long Press Drag Action
- ✅ ジェスチャー長押しドラッグアクション
- ✅ 제스처 길게 누르기 드래그 동작

### v103.5 投射视频位深度 | Cast Video Bit Depth | キャストビデオビット深度 | 캐스트 비디오 비트 깊이
- ✅ 投射视频位深度
- ✅ Cast Video Bit Depth
- ✅ キャストビデオビット深度
- ✅ 캐스트 비디오 비트 깊이

### v103.6 播放列表自动跳过重复 | Playlist Auto Skip Duplicate | プレイリスト自動重複スキップ | 재생 목록 자동 중복 건너뛰기
- ✅ 播放列表自动跳过重复
- ✅ Playlist Auto Skip Duplicate
- ✅ プレイリスト自動重複スキップ
- ✅ 재생 목록 자동 중복 건너뛰기

### v103.7 缓存缩略图预加载 | Cache Thumbnail Preload | キャッシュサムネイルプリロード | 캐시 썸네일 프리로드
- ✅ 缓存缩略图预加载
- ✅ Cache Thumbnail Preload
- ✅ キャッシュサムネイルプリロード
- ✅ 캐시 썸네일 프리로드

### v103.8 进度条直播边缘颜色 | Progress Bar Live Edge Color | プログレスバーライブエッジ色 | 진행 바 라이브 엣지 색상
- ✅ 进度条直播边缘颜色
- ✅ Progress Bar Live Edge Color
- ✅ プログレスバーライブエッジ色
- ✅ 진행 바 라이브 엣지 색상

### v103.9 音量夜间增强开关 | Volume Night Boost Toggle | 音量ナイトブースト切替 | 볼륨 나이트 부스트 전환
- ✅ 音量夜间增强开关
- ✅ Volume Night Boost Toggle
- ✅ 音量ナイトブースト切替
- ✅ 볼륨 나이트 부스트 전환

### v103.10 历史记录撤销删除开关 | History Undo Delete Toggle | 履歴削除取り消し切替 | 기록 삭제 실행 취소 전환
- ✅ 历史记录撤销删除开关
- ✅ History Undo Delete Toggle
- ✅ 履歴削除取り消し切替
- ✅ 기록 삭제 실행 취소 전환

### v103.11 播放AB循环记忆 | Playback AB Loop Memory | 再生ABループメモリ | 재생 AB 반복 기억
- ✅ 播放AB循环记忆
- ✅ Playback AB Loop Memory
- ✅ 再生ABループメモリ
- ✅ 재생 AB 반복 기억

### v103.12 截图自动命名方案 | Screenshot Auto Naming Scheme | スクリーンショット自動命名スキーム | 스크린샷 자동 이름 지정 체계
- ✅ 截图自动命名方案
- ✅ Screenshot Auto Naming Scheme
- ✅ スクリーンショット自動命名スキーム
- ✅ 스크린샷 자동 이름 지정 체계

### v103.13 视频万花筒自定义 | Video Kaleidoscope Custom | ビデオカレイドスコープカスタム | 비디오 칼레이도스코프 사용자 정의
- ✅ 视频万花筒自定义
- ✅ Video Kaleidoscope Custom
- ✅ ビデオカレイドスコープカスタム
- ✅ 비디오 칼레이도스코프 사용자 정의

### v103.14 弹幕字体发光强度 | Danmaku Font Glow Intensity | コメントフォントグロウ強度 | 댓글 글꼴 글로우 강도
- ✅ 弹幕字体发光强度
- ✅ Danmaku Font Glow Intensity
- ✅ コメントフォントグロウ強度
- ✅ 댓글 글꼴 글로우 강도

### v103.15 字幕字体加载自定义 | Subtitle Font Load Custom | 字幕フォント読み込みカスタム | 자막 글꼴 로드 사용자 정의
- ✅ 字幕字体加载自定义
- ✅ Subtitle Font Load Custom
- ✅ 字幕フォント読み込みカスタム
- ✅ 자막 글꼴 로드 사용자 정의

### v104.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v104.1-v104.15 功能列表
- ✅ Audio Vocal Boost Custom, Danmaku Font Glow Spread, Subtitle Font Scale Custom, Gesture Quick Scrub Toggle, Cast Video Field Order, Playlist Auto Download Next, Cache Video Only Mode, Progress Bar Time Code Format, Volume Audio Channel Map, History Batch Delete Mode, Playback AB Loop Auto Save, Screenshot Auto Optimize, Video Mirror Flip Custom, Danmaku Font Gradient Toggle, Subtitle Font Color Custom

### v104.1 音频人声增强自定义 | Audio Vocal Boost Custom | オーディオボーカルブーストカスタム | 오디오 보컬 강화 사용자 정의
- ✅ 音频人声增强自定义
- ✅ Audio Vocal Boost Custom
- ✅ オーディオボーカルブーストカスタム
- ✅ 오디오 보컬 강화 사용자 정의

### v104.2 弹幕字体发光扩散 | Danmaku Font Glow Spread | コメントフォントグロウスプレッド | 댓글 글꼴 글로우 확산
- ✅ 弹幕字体发光扩散
- ✅ Danmaku Font Glow Spread
- ✅ コメントフォントグロウスプレッド
- ✅ 댓글 글꼴 글로우 확산

### v104.3 字幕字体缩放自定义 | Subtitle Font Scale Custom | 字幕フォントスケールカスタム | 자막 글꼴 스케일 사용자 정의
- ✅ 字幕字体缩放自定义
- ✅ Subtitle Font Scale Custom
- ✅ 字幕フォントスケールカスタム
- ✅ 자막 글꼴 스케일 사용자 정의

### v104.4 手势快速擦洗开关 | Gesture Quick Scrub Toggle | ジェスチャークイックスクラブ切替 | 제스처 빠른 스크럽 전환
- ✅ 手势快速擦洗开关
- ✅ Gesture Quick Scrub Toggle
- ✅ ジェスチャークイックスクラブ切替
- ✅ 제스처 빠른 스크럽 전환

### v104.5 投射视频场序 | Cast Video Field Order | キャストビデオフィールドオーダー | 캐스트 비디오 필드 순서
- ✅ 投射视频场序
- ✅ Cast Video Field Order
- ✅ キャストビデオフィールドオーダー
- ✅ 캐스트 비디오 필드 순서

### v104.6 播放列表自动下载下一个 | Playlist Auto Download Next | プレイリスト自動次ダウンロード | 재생 목록 자동 다음 다운로드
- ✅ 播放列表自动下载下一个
- ✅ Playlist Auto Download Next
- ✅ プレイリスト自動次ダウンロード
- ✅ 재생 목록 자동 다음 다운로드

### v104.7 缓存仅视频模式 | Cache Video Only Mode | キャッシュビデオのみモード | 캐시 비디오 전용 모드
- ✅ 缓存仅视频模式
- ✅ Cache Video Only Mode
- ✅ キャッシュビデオのみモード
- ✅ 캐시 비디오 전용 모드

### v104.8 进度条时间码格式 | Progress Bar Time Code Format | プログレスバータイムコード形式 | 진행 바 타임코드 형식
- ✅ 进度条时间码格式
- ✅ Progress Bar Time Code Format
- ✅ プログレスバータイムコード形式
- ✅ 진행 바 타임코드 형식

### v104.9 音量音频通道映射 | Volume Audio Channel Map | 音量オーディオチャンネルマップ | 볼륨 오디오 채널 맵
- ✅ 音量音频通道映射
- ✅ Volume Audio Channel Map
- ✅ 音量オーディオチャンネルマップ
- ✅ 볼륨 오디오 채널 맵

### v104.10 历史记录批量删除模式 | History Batch Delete Mode | 履歴一括削除モード | 기록 일괄 삭제 모드
- ✅ 历史记录批量删除模式
- ✅ History Batch Delete Mode
- ✅ 履歴一括削除モード
- ✅ 기록 일괄 삭제 모드

### v104.11 播放AB循环自动保存 | Playback AB Loop Auto Save | 再生ABループ自動保存 | 재생 AB 반복 자동 저장
- ✅ 播放AB循环自动保存
- ✅ Playback AB Loop Auto Save
- ✅ 再生ABループ自動保存
- ✅ 재생 AB 반복 자동 저장

### v104.12 截图自动优化 | Screenshot Auto Optimize | スクリーンショット自動最適化 | 스크린샷 자동 최적화
- ✅ 截图自动优化
- ✅ Screenshot Auto Optimize
- ✅ スクリーンショット自動最適化
- ✅ 스크린샷 자동 최적화

### v104.13 视频镜像翻转自定义 | Video Mirror Flip Custom | ビデオミラーフリップカスタム | 비디오 미러 플립 사용자 정의
- ✅ 视频镜像翻转自定义
- ✅ Video Mirror Flip Custom
- ✅ ビデオミラーフリップカスタム
- ✅ 비디오 미러 플립 사용자 정의

### v104.14 弹幕字体渐变开关 | Danmaku Font Gradient Toggle | コメントフォントグラデーション切替 | 댓글 글꼴 그래디언트 전환
- ✅ 弹幕字体渐变开关
- ✅ Danmaku Font Gradient Toggle
- ✅ コメントフォントグラデーション切替
- ✅ 댓글 글꼴 그래디언트 전환

### v104.15 字幕字体颜色自定义 | Subtitle Font Color Custom | 字幕フォント色カスタム | 자막 글꼴 색상 사용자 정의
- ✅ 字幕字体颜色自定义
- ✅ Subtitle Font Color Custom
- ✅ 字幕フォント色カスタム
- ✅ 자막 글꼴 색상 사용자 정의

### v105.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v105.1-v105.15 功能列表
- ✅ Audio Virtual Surround Custom, Danmaku Font Gradient Start, Subtitle Font Alpha Custom, Gesture Quick Seek Distance, Cast Video Color Space, Playlist Auto Sort By Popular, Cache Audio Only Mode, Progress Bar Custom Scale, Volume Headphone Optimize, History Multi Select Mode, Playback AB Loop Beat Sync, Screenshot Auto Watermark, Video Rotate Custom, Danmaku Font Gradient End, Subtitle Font Stroke Width

### v105.1 音频虚拟环绕自定义 | Audio Virtual Surround Custom | オーディオバーチャルサラウンドカスタム | 오디오 가상 서라운드 사용자 정의
- ✅ 音频虚拟环绕自定义
- ✅ Audio Virtual Surround Custom
- ✅ オーディオバーチャルサラウンドカスタム
- ✅ 오디오 가상 서라운드 사용자 정의

### v105.2 弹幕字体渐变开始 | Danmaku Font Gradient Start | コメントフォントグラデーション開始 | 댓글 글꼴 그래디언트 시작
- ✅ 弹幕字体渐变开始
- ✅ Danmaku Font Gradient Start
- ✅ コメントフォントグラデーション開始
- ✅ 댓글 글꼴 그래디언트 시작

### v105.3 字幕字体透明度自定义 | Subtitle Font Alpha Custom | 字幕フォントアルファカスタム | 자막 글꼴 알파 사용자 정의
- ✅ 字幕字体透明度自定义
- ✅ Subtitle Font Alpha Custom
- ✅ 字幕フォントアルファカスタム
- ✅ 자막 글꼴 알파 사용자 정의

### v105.4 手势快速跳转距离 | Gesture Quick Seek Distance | ジェスチャークイックシーク距離 | 제스처 빠른 탐색 거리
- ✅ 手势快速跳转距离
- ✅ Gesture Quick Seek Distance
- ✅ ジェスチャークイックシーク距離
- ✅ 제스처 빠른 탐색 거리

### v105.5 投射视频色彩空间 | Cast Video Color Space | キャストビデオ色彩空間 | 캐스트 비디오 색 공간
- ✅ 投射视频色彩空间
- ✅ Cast Video Color Space
- ✅ キャストビデオ色彩空間
- ✅ 캐스트 비디오 색 공간

### v105.6 播放列表按热度排序 | Playlist Auto Sort By Popular | プレイリスト人気順ソート | 재생 목록 인기순 정렬
- ✅ 播放列表按热度排序
- ✅ Playlist Auto Sort By Popular
- ✅ プレイリスト人気順ソート
- ✅ 재생 목록 인기순 정렬

### v105.7 缓存仅音频模式 | Cache Audio Only Mode | キャッシュ音声のみモード | 캐시 오디오 전용 모드
- ✅ 缓存仅音频模式
- ✅ Cache Audio Only Mode
- ✅ キャッシュ音声のみモード
- ✅ 캐시 오디오 전용 모드

### v105.8 进度条自定义比例 | Progress Bar Custom Scale | プログレスバーカスタムスケール | 진행 바 사용자 정의 비율
- ✅ 进度条自定义比例
- ✅ Progress Bar Custom Scale
- ✅ プログレスバーカスタムスケール
- ✅ 진행 바 사용자 정의 비율

### v105.9 音量耳机优化 | Volume Headphone Optimize | 音量ヘッドフォン最適化 | 볼륨 헤드폰 최적화
- ✅ 音量耳机优化
- ✅ Volume Headphone Optimize
- ✅ 音量ヘッドフォン最適化
- ✅ 볼륨 헤드폰 최적화

### v105.10 历史记录多选模式 | History Multi Select Mode | 履歴複数選択モード | 기록 다중 선택 모드
- ✅ 历史记录多选模式
- ✅ History Multi Select Mode
- ✅ 履歴複数選択モード
- ✅ 기록 다중 선택 모드

### v105.11 播放AB循环节拍同步 | Playback AB Loop Beat Sync | 再生ABループビート同期 | 재생 AB 반복 비트 동기화
- ✅ 播放AB循环节拍同步
- ✅ Playback AB Loop Beat Sync
- ✅ 再生ABループビート同期
- ✅ 재생 AB 반복 비트 동기화

### v105.12 截图自动水印 | Screenshot Auto Watermark | スクリーンショット自動ウォーターマーク | 스크린샷 자동 워터마크
- ✅ 截图自动水印
- ✅ Screenshot Auto Watermark
- ✅ スクリーンショット自動ウォーターマーク
- ✅ 스크린샷 자동 워터마크

### v105.13 视频旋转自定义 | Video Rotate Custom | ビデオ回転カスタム | 비디오 회전 사용자 정의
- ✅ 视频旋转自定义
- ✅ Video Rotate Custom
- ✅ ビデオ回転カスタム
- ✅ 비디오 회전 사용자 정의

### v105.14 弹幕字体渐变结束 | Danmaku Font Gradient End | コメントフォントグラデーション終了 | 댓글 글꼴 그래디언트 종료
- ✅ 弹幕字体渐变结束
- ✅ Danmaku Font Gradient End
- ✅ コメントフォントグラデーション終了
- ✅ 댓글 글꼴 그래디언트 종료

### v105.15 字幕字体描边宽度 | Subtitle Font Stroke Width | 字幕フォントストローク幅 | 자막 글꼴 스트로크 너비
- ✅ 字幕字体描边宽度
- ✅ Subtitle Font Stroke Width
- ✅ 字幕フォントストローク幅
- ✅ 자막 글꼴 스트로크 너비

### v106.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v106.1-v106.15 功能列表
- ✅ Audio Compressor Threshold, Danmaku Font Gradient Angle, Subtitle Font Stroke Color, Gesture Quick Volume Gesture, Cast Video Frame Rate Limit, Playlist Auto Sort By Date New, Cache Partial Download Toggle, Progress Bar Custom Height, Volume Bluetooth Codec, History Filter By Type, Playback AB Loop Crossfade, Screenshot Auto Compress, Video Stretch Custom, Danmaku Font Texture Custom, Subtitle Font Shadow Color

### v106.1 音频压缩器阈值 | Audio Compressor Threshold | オーディオコンプレッサーしきい値 | 오디오 컴프레서 임계값
- ✅ 音频压缩器阈值
- ✅ Audio Compressor Threshold
- ✅ オーディオコンプレッサーしきい値
- ✅ 오디오 컴프레서 임계값

### v106.2 弹幕字体渐变角度 | Danmaku Font Gradient Angle | コメントフォントグラデーション角度 | 댓글 글꼴 그래디언트 각도
- ✅ 弹幕字体渐变角度
- ✅ Danmaku Font Gradient Angle
- ✅ コメントフォントグラデーション角度
- ✅ 댓글 글꼴 그래디언트 각도

### v106.3 字幕字体描边颜色 | Subtitle Font Stroke Color | 字幕フォントストローク色 | 자막 글꼴 스트로크 색상
- ✅ 字幕字体描边颜色
- ✅ Subtitle Font Stroke Color
- ✅ 字幕フォントストローク色
- ✅ 자막 글꼴 스트로크 색상

### v106.4 手势快速音量手势 | Gesture Quick Volume Gesture | ジェスチャークイック音量ジェスチャー | 제스처 빠른 볼륨 제스처
- ✅ 手势快速音量手势
- ✅ Gesture Quick Volume Gesture
- ✅ ジェスチャークイック音量ジェスチャー
- ✅ 제스처 빠른 볼륨 제스처

### v106.5 投射视频帧率限制 | Cast Video Frame Rate Limit | キャストビデオフレームレート制限 | 캐스트 비디오 프레임레이트 제한
- ✅ 投射视频帧率限制
- ✅ Cast Video Frame Rate Limit
- ✅ キャストビデオフレームレート制限
- ✅ 캐스트 비디오 프레임레이트 제한

### v106.6 播放列表按最新日期排序 | Playlist Auto Sort By Date New | プレイリスト新着日付順ソート | 재생 목록 최신 날짜순 정렬
- ✅ 播放列表按最新日期排序
- ✅ Playlist Auto Sort By Date New
- ✅ プレイリスト新着日付順ソート
- ✅ 재생 목록 최신 날짜순 정렬

### v106.7 缓存部分下载开关 | Cache Partial Download Toggle | キャッシュ部分ダウンロード切替 | 캐시 부분 다운로드 전환
- ✅ 缓存部分下载开关
- ✅ Cache Partial Download Toggle
- ✅ キャッシュ部分ダウンロード切替
- ✅ 캐시 부분 다운로드 전환

### v106.8 进度条自定义高度 | Progress Bar Custom Height | プログレスバーカスタム高さ | 진행 바 사용자 정의 높이
- ✅ 进度条自定义高度
- ✅ Progress Bar Custom Height
- ✅ プログレスバーカスタム高さ
- ✅ 진행 바 사용자 정의 높이

### v106.9 音量蓝牙编码 | Volume Bluetooth Codec | 音量Bluetoothコーデック | 볼륨 블루투스 코덱
- ✅ 音量蓝牙编码
- ✅ Volume Bluetooth Codec
- ✅ 音量Bluetoothコーデック
- ✅ 볼륨 블루투스 코덱

### v106.10 历史记录按类型过滤 | History Filter By Type | 履歴タイプ別フィルター | 기록 유형별 필터
- ✅ 历史记录按类型过滤
- ✅ History Filter By Type
- ✅ 履歴タイプ別フィルター
- ✅ 기록 유형별 필터

### v106.11 播放AB循环交叉淡入淡出 | Playback AB Loop Crossfade | 再生ABループクロスフェード | 재생 AB 반복 크로스페이드
- ✅ 播放AB循环交叉淡入淡出
- ✅ Playback AB Loop Crossfade
- ✅ 再生ABループクロスフェード
- ✅ 재생 AB 반복 크로스페이드

### v106.12 截图自动压缩 | Screenshot Auto Compress | スクリーンショット自動圧縮 | 스크린샷 자동 압축
- ✅ 截图自动压缩
- ✅ Screenshot Auto Compress
- ✅ スクリーンショット自動圧縮
- ✅ 스크린샷 자동 압축

### v106.13 视频拉伸自定义 | Video Stretch Custom | ビデオストレッチカスタム | 비디오 스트레치 사용자 정의
- ✅ 视频拉伸自定义
- ✅ Video Stretch Custom
- ✅ ビデオストレッチカスタム
- ✅ 비디오 스트레치 사용자 정의

### v106.14 弹幕字体纹理自定义 | Danmaku Font Texture Custom | コメントフォントテクスチャカスタム | 댓글 글꼴 텍스처 사용자 정의
- ✅ 弹幕字体纹理自定义
- ✅ Danmaku Font Texture Custom
- ✅ コメントフォントテクスチャカスタム
- ✅ 댓글 글꼴 텍스처 사용자 정의

### v106.15 字幕字体阴影颜色 | Subtitle Font Shadow Color | 字幕フォントシャドウ色 | 자막 글꼴 그림자 색상
- ✅ 字幕字体阴影颜色
- ✅ Subtitle Font Shadow Color
- ✅ 字幕フォントシャドウ色
- ✅ 자막 글꼴 그림자 색상

### v107.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v107.1-v107.15 功能列表
- ✅ Audio Compressor Ratio, Danmaku Font Fade Edge Size, Subtitle Font Shadow Radius, Gesture Quick Bright Gesture, Cast Video Deinterlace Mode, Playlist Auto Sort By Duration, Cache P2P Download Toggle, Progress Bar Custom Margin, Volume USB DAC Compatibility, History Filter By Duration, Playback AB Loop Pitch Shift, Screenshot Auto Share After, Video Crop Custom, Danmaku Font Fade Style, Subtitle Font Shadow Offset X

### v107.1 音频压缩器比率 | Audio Compressor Ratio | オーディオコンプレッサー比率 | 오디오 컴프레서 비율
- ✅ 音频压缩器比率
- ✅ Audio Compressor Ratio
- ✅ オーディオコンプレッサー比率
- ✅ 오디오 컴프레서 비율

### v107.2 弹幕字体淡出边缘大小 | Danmaku Font Fade Edge Size | コメントフォントフェードエッジサイズ | 댓글 글꼴 페이드 엣지 크기
- ✅ 弹幕字体淡出边缘大小
- ✅ Danmaku Font Fade Edge Size
- ✅ コメントフォントフェードエッジサイズ
- ✅ 댓글 글꼴 페이드 엣지 크기

### v107.3 字幕字体阴影半径 | Subtitle Font Shadow Radius | 字幕フォントシャドウ半径 | 자막 글꼴 그림자 반경
- ✅ 字幕字体阴影半径
- ✅ Subtitle Font Shadow Radius
- ✅ 字幕フォントシャドウ半径
- ✅ 자막 글꼴 그림자 반경

### v107.4 手势快速亮度手势 | Gesture Quick Bright Gesture | ジェスチャークイック明るさジェスチャー | 제스처 빠른 밝기 제스처
- ✅ 手势快速亮度手势
- ✅ Gesture Quick Bright Gesture
- ✅ ジェスチャークイック明るさジェスチャー
- ✅ 제스처 빠른 밝기 제스처

### v107.5 投射视频去隔行模式 | Cast Video Deinterlace Mode | キャストビデオインターレース解除モード | 캐스트 비디오 디인터레이스 모드
- ✅ 投射视频去隔行模式
- ✅ Cast Video Deinterlace Mode
- ✅ キャストビデオインターレース解除モード
- ✅ 캐스트 비디오 디인터레이스 모드

### v107.6 播放列表按时长排序 | Playlist Auto Sort By Duration | プレイリスト再生時間順ソート | 재생 목록 재생 시간순 정렬
- ✅ 播放列表按时长排序
- ✅ Playlist Auto Sort By Duration
- ✅ プレイリスト再生時間順ソート
- ✅ 재생 목록 재생 시간순 정렬

### v107.7 缓存P2P下载开关 | Cache P2P Download Toggle | キャッシュP2Pダウンロード切替 | 캐시 P2P 다운로드 전환
- ✅ 缓存P2P下载开关
- ✅ Cache P2P Download Toggle
- ✅ キャッシュP2Pダウンロード切替
- ✅ 캐시 P2P 다운로드 전환

### v107.8 进度条自定义边距 | Progress Bar Custom Margin | プログレスバーカスタムマージン | 진행 바 사용자 정의 마진
- ✅ 进度条自定义边距
- ✅ Progress Bar Custom Margin
- ✅ プログレスバーカスタムマージン
- ✅ 진행 바 사용자 정의 마진

### v107.9 音量USB DAC兼容性 | Volume USB DAC Compatibility | 音量USB DAC互換性 | 볼륨 USB DAC 호환성
- ✅ 音量USB DAC兼容性
- ✅ Volume USB DAC Compatibility
- ✅ 音量USB DAC互換性
- ✅ 볼륨 USB DAC 호환성

### v107.10 历史记录按时长过滤 | History Filter By Duration | 履歴再生時間別フィルター | 기록 재생 시간별 필터
- ✅ 历史记录按时长过滤
- ✅ History Filter By Duration
- ✅ 履歴再生時間別フィルター
- ✅ 기록 재생 시간별 필터

### v107.11 播放AB循环音高偏移 | Playback AB Loop Pitch Shift | 再生ABループピッチシフト | 재생 AB 반복 피치 시프트
- ✅ 播放AB循环音高偏移
- ✅ Playback AB Loop Pitch Shift
- ✅ 再生ABループピッチシフト
- ✅ 재생 AB 반복 피치 시프트

### v107.12 截图后自动分享 | Screenshot Auto Share After | スクリーンショット後自動共有 | 스크린샷 후 자동 공유
- ✅ 截图后自动分享
- ✅ Screenshot Auto Share After
- ✅ スクリーンショット後自動共有
- ✅ 스크린샷 후 자동 공유

### v107.13 视频裁剪自定义 | Video Crop Custom | ビデオクロップカスタム | 비디오 크롭 사용자 정의
- ✅ 视频裁剪自定义
- ✅ Video Crop Custom
- ✅ ビデオクロップカスタム
- ✅ 비디오 크롭 사용자 정의

### v107.14 弹幕字体淡出样式 | Danmaku Font Fade Style | コメントフォントフェードスタイル | 댓글 글꼴 페이드 스타일
- ✅ 弹幕字体淡出样式
- ✅ Danmaku Font Fade Style
- ✅ コメントフォントフェードスタイル
- ✅ 댓글 글꼴 페이드 스타일

### v107.15 字幕字体阴影X偏移 | Subtitle Font Shadow Offset X | 字幕フォントシャドウXオフセット | 자막 글꼴 그림자 X 오프셋
- ✅ 字幕字体阴影X偏移
- ✅ Subtitle Font Shadow Offset X
- ✅ 字幕フォントシャドウXオフセット
- ✅ 자막 글꼴 그림자 X 오프셋

### v108.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v108.1-v108.15 功能列表
- ✅ Audio Compressor Attack Time, Danmaku Font BG Gradient Toggle, Subtitle Font Shadow Offset Y, Gesture Quick Lock Screen, Cast Video Scaling Mode, Playlist Auto Sort By Views, Cache Proxy Mode Custom, Progress Bar Custom Opacity, Volume Speaker Phone Toggle, History Filter By Date, Playback AB Loop Tempo Sync, Screenshot Album Auto Create, Video Zoom Custom, Danmaku Font BG Gradient Type, Subtitle Font Bold Toggle108

### v108.1 音频压缩器启动时间 | Audio Compressor Attack Time | オーディオコンプレッサーアタック時間 | 오디오 컴프레서 어택 시간
- ✅ 音频压缩器启动时间
- ✅ Audio Compressor Attack Time
- ✅ オーディオコンプレッサーアタック時間
- ✅ 오디오 컴프레서 어택 시간

### v108.2 弹幕字体背景渐变开关 | Danmaku Font BG Gradient Toggle | コメントフォントBGグラデーション切替 | 댓글 글꼴 배경 그래디언트 전환
- ✅ 弹幕字体背景渐变开关
- ✅ Danmaku Font BG Gradient Toggle
- ✅ コメントフォントBGグラデーション切替
- ✅ 댓글 글꼴 배경 그래디언트 전환

### v108.3 字幕字体阴影Y偏移 | Subtitle Font Shadow Offset Y | 字幕フォントシャドウYオフセット | 자막 글꼴 그림자 Y 오프셋
- ✅ 字幕字体阴影Y偏移
- ✅ Subtitle Font Shadow Offset Y
- ✅ 字幕フォントシャドウYオフセット
- ✅ 자막 글꼴 그림자 Y 오프셋

### v108.4 手势快速锁屏 | Gesture Quick Lock Screen | ジェスチャークイック画面ロック | 제스처 빠른 화면 잠금
- ✅ 手势快速锁屏
- ✅ Gesture Quick Lock Screen
- ✅ ジェスチャークイック画面ロック
- ✅ 제스처 빠른 화면 잠금

### v108.5 投射视频缩放模式 | Cast Video Scaling Mode | キャストビデオスケーリングモード | 캐스트 비디오 스케일링 모드
- ✅ 投射视频缩放模式
- ✅ Cast Video Scaling Mode
- ✅ キャストビデオスケーリングモード
- ✅ 캐스트 비디오 스케일링 모드

### v108.6 播放列表按播放量排序 | Playlist Auto Sort By Views | プレイリスト再生回数順ソート | 재생 목록 재생 횟수순 정렬
- ✅ 播放列表按播放量排序
- ✅ Playlist Auto Sort By Views
- ✅ プレイリスト再生回数順ソート
- ✅ 재생 목록 재생 횟수순 정렬

### v108.7 缓存代理模式自定义 | Cache Proxy Mode Custom | キャッシュプロキシモードカスタム | 캐시 프록시 모드 사용자 정의
- ✅ 缓存代理模式自定义
- ✅ Cache Proxy Mode Custom
- ✅ キャッシュプロキシモードカスタム
- ✅ 캐시 프록시 모드 사용자 정의

### v108.8 进度条自定义透明度 | Progress Bar Custom Opacity | プログレスバーカスタム透明度 | 진행 바 사용자 정의 불투명도
- ✅ 进度条自定义透明度
- ✅ Progress Bar Custom Opacity
- ✅ プログレスバーカスタム透明度
- ✅ 진행 바 사용자 정의 불투명도

### v108.9 音量免提开关 | Volume Speaker Phone Toggle | 音量スピーカーフォン切替 | 볼륨 스피커폰 전환
- ✅ 音量免提开关
- ✅ Volume Speaker Phone Toggle
- ✅ 音量スピーカーフォン切替
- ✅ 볼륨 스피커폰 전환

### v108.10 历史记录按日期过滤 | History Filter By Date | 履歴日付別フィルター | 기록 날짜별 필터
- ✅ 历史记录按日期过滤
- ✅ History Filter By Date
- ✅ 履歴日付別フィルター
- ✅ 기록 날짜별 필터

### v108.11 播放AB循环节拍速度同步 | Playback AB Loop Tempo Sync | 再生ABループテンポ同期 | 재생 AB 반복 템포 동기화
- ✅ 播放AB循环节拍速度同步
- ✅ Playback AB Loop Tempo Sync
- ✅ 再生ABループテンポ同期
- ✅ 재생 AB 반복 템포 동기화

### v108.12 截图相册自动创建 | Screenshot Album Auto Create | スクリーンショットアルバム自動作成 | 스크린샷 앨범 자동 생성
- ✅ 截图相册自动创建
- ✅ Screenshot Album Auto Create
- ✅ スクリーンショットアルバム自動作成
- ✅ 스크린샷 앨범 자동 생성

### v108.13 视频缩放自定义 | Video Zoom Custom | ビデオズームカスタム | 비디오 줌 사용자 정의
- ✅ 视频缩放自定义
- ✅ Video Zoom Custom
- ✅ ビデオズームカスタム
- ✅ 비디오 줌 사용자 정의

### v108.14 弹幕字体背景渐变类型 | Danmaku Font BG Gradient Type | コメントフォントBGグラデーションタイプ | 댓글 글꼴 배경 그래디언트 유형
- ✅ 弹幕字体背景渐变类型
- ✅ Danmaku Font BG Gradient Type
- ✅ コメントフォントBGグラデーションタイプ
- ✅ 댓글 글꼴 배경 그래디언트 유형

### v108.15 字幕字体加粗开关108 | Subtitle Font Bold Toggle108 | 字幕フォント太字切替108 | 자막 글꼴 굵기 전환108
- ✅ 字幕字体加粗开关108
- ✅ Subtitle Font Bold Toggle108
- ✅ 字幕フォント太字切替108
- ✅ 자막 글꼴 굵기 전환108

### v109.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v109.1-v109.15 功能列表
- ✅ Audio Compressor Release Time, Danmaku Font BG Gradient Angle, Subtitle Font Italic Toggle109, Gesture Quick Screenshot, Cast Video Hardware Decoding, Playlist Auto Sort By Rating, Cache Clean On App Exit, Progress Bar Custom Thumb Delay, Volume Audio Focus Priority, History Filter By Up, Playback AB Loop Preset Toggle, Screenshot Crop Auto Ratio, Video Blur Background Custom, Danmaku Font BG Gradient Opacity, Subtitle Font Underline109

### v109.1 音频压缩器释放时间 | Audio Compressor Release Time | オーディオコンプレッサーリリース時間 | 오디오 컴프레서 릴리즈 시간
- ✅ 音频压缩器释放时间
- ✅ Audio Compressor Release Time
- ✅ オーディオコンプレッサーリリース時間
- ✅ 오디오 컴프레서 릴리즈 시간

### v109.2 弹幕字体背景渐变角度 | Danmaku Font BG Gradient Angle | コメントフォントBGグラデーション角度 | 댓글 글꼴 배경 그래디언트 각도
- ✅ 弹幕字体背景渐变角度
- ✅ Danmaku Font BG Gradient Angle
- ✅ コメントフォントBGグラデーション角度
- ✅ 댓글 글꼴 배경 그래디언트 각도

### v109.3 字幕字体斜体开关109 | Subtitle Font Italic Toggle109 | 字幕フォントイタリック切替109 | 자막 글꼴 이탤릭 전환109
- ✅ 字幕字体斜体开关109
- ✅ Subtitle Font Italic Toggle109
- ✅ 字幕フォントイタリック切替109
- ✅ 자막 글꼴 이탤릭 전환109

### v109.4 手势快速截图 | Gesture Quick Screenshot | ジェスチャークイックスクリーンショット | 제스처 빠른 스크린샷
- ✅ 手势快速截图
- ✅ Gesture Quick Screenshot
- ✅ ジェスチャークイックスクリーンショット
- ✅ 제스처 빠른 스크린샷

### v109.5 投射视频硬件解码 | Cast Video Hardware Decoding | キャストビデオハードウェアデコード | 캐스트 비디오 하드웨어 디코딩
- ✅ 投射视频硬件解码
- ✅ Cast Video Hardware Decoding
- ✅ キャストビデオハードウェアデコード
- ✅ 캐스트 비디오 하드웨어 디코딩

### v109.6 播放列表按评分排序 | Playlist Auto Sort By Rating | プレイリスト評価順ソート | 재생 목록 평점순 정렬
- ✅ 播放列表按评分排序
- ✅ Playlist Auto Sort By Rating
- ✅ プレイリスト評価順ソート
- ✅ 재생 목록 평점순 정렬

### v109.7 缓存退出时清理 | Cache Clean On App Exit | キャッシュアプリ終了時クリーン | 캐시 앱 종료 시 정리
- ✅ 缓存退出时清理
- ✅ Cache Clean On App Exit
- ✅ キャッシュアプリ終了時クリーン
- ✅ 캐시 앱 종료 시 정리

### v109.8 进度条自定义滑块延迟 | Progress Bar Custom Thumb Delay | プログレスバーカスタムサム遅延 | 진행 바 사용자 정의 썸 지연
- ✅ 进度条自定义滑块延迟
- ✅ Progress Bar Custom Thumb Delay
- ✅ プログレスバーカスタムサム遅延
- ✅ 진행 바 사용자 정의 썸 지연

### v109.9 音量音频焦点优先级 | Volume Audio Focus Priority | 音量オーディオフォーカス優先度 | 볼륨 오디오 포커스 우선순위
- ✅ 音量音频焦点优先级
- ✅ Volume Audio Focus Priority
- ✅ 音量オーディオフォーカス優先度
- ✅ 볼륨 오디오 포커스 우선순위

### v109.10 历史记录按UP主过滤 | History Filter By Up | 履歴UP主別フィルター | 기록 UP주별 필터
- ✅ 历史记录按UP主过滤
- ✅ History Filter By Up
- ✅ 履歴UP主別フィルター
- ✅ 기록 UP주별 필터

### v109.11 播放AB循环预设开关 | Playback AB Loop Preset Toggle | 再生ABループプリセット切替 | 재생 AB 반복 프리셋 전환
- ✅ 播放AB循环预设开关
- ✅ Playback AB Loop Preset Toggle
- ✅ 再生ABループプリセット切替
- ✅ 재생 AB 반복 프리셋 전환

### v109.12 截图裁剪自动比例 | Screenshot Crop Auto Ratio | スクリーンショットクロップ自動比率 | 스크린샷 크롭 자동 비율
- ✅ 截图裁剪自动比例
- ✅ Screenshot Crop Auto Ratio
- ✅ スクリーンショットクロップ自動比率
- ✅ 스크린샷 크롭 자동 비율

### v109.13 视频模糊背景自定义 | Video Blur Background Custom | ビデオブラー背景カスタム | 비디오 블러 배경 사용자 정의
- ✅ 视频模糊背景自定义
- ✅ Video Blur Background Custom
- ✅ ビデオブラー背景カスタム
- ✅ 비디오 블러 배경 사용자 정의

### v109.14 弹幕字体背景渐变透明度 | Danmaku Font BG Gradient Opacity | コメントフォントBGグラデーション透明度 | 댓글 글꼴 배경 그래디언트 불투명도
- ✅ 弹幕字体背景渐变透明度
- ✅ Danmaku Font BG Gradient Opacity
- ✅ コメントフォントBGグラデーション透明度
- ✅ 댓글 글꼴 배경 그래디언트 불투명도

### v109.15 字幕字体下划线109 | Subtitle Font Underline109 | 字幕フォント下線109 | 자막 글꼴 밑줄109
- ✅ 字幕字体下划线109
- ✅ Subtitle Font Underline109
- ✅ 字幕フォント下線109
- ✅ 자막 글꼴 밑줄109

### v110.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v110.1-v110.15 功能列表
- ✅ Audio Limiter Threshold, Danmaku Font Texture Blend Mode, Subtitle Font Strike Through110, Gesture Quick Speed Toggle, Cast Video Software Decoding, Playlist Auto Sort By Bilingual, Cache Clean On Low Battery, Progress Bar Custom Thumb Scale, Volume Audio Focus Duck, History Filter By Season, Playback AB Loop Export Wav, Screenshot Delay Timer, Video Ambient Light Custom, Danmaku Font Texture Pattern Custom, Subtitle Font Case Override110

### v110.1 音频限制器阈值 | Audio Limiter Threshold | オーディオリミッターしきい値 | 오디오 리미터 임계값
- ✅ 音频限制器阈值
- ✅ Audio Limiter Threshold
- ✅ オーディオリミッターしきい値
- ✅ 오디오 리미터 임계값

### v110.2 弹幕字体纹理混合模式 | Danmaku Font Texture Blend Mode | コメントフォントテクスチャブレンドモード | 댓글 글꼴 텍스처 블렌드 모드
- ✅ 弹幕字体纹理混合模式
- ✅ Danmaku Font Texture Blend Mode
- ✅ コメントフォントテクスチャブレンドモード
- ✅ 댓글 글꼴 텍스처 블렌드 모드

### v110.3 字幕字体删除线110 | Subtitle Font Strike Through110 | 字幕フォント打ち消し線110 | 자막 글꼴 취소선110
- ✅ 字幕字体删除线110
- ✅ Subtitle Font Strike Through110
- ✅ 字幕フォント打ち消し線110
- ✅ 자막 글꼴 취소선110

### v110.4 手势快速速度开关 | Gesture Quick Speed Toggle | ジェスチャークイック速度切替 | 제스처 빠른 속도 전환
- ✅ 手势快速速度开关
- ✅ Gesture Quick Speed Toggle
- ✅ ジェスチャークイック速度切替
- ✅ 제스처 빠른 속도 전환

### v110.5 投射视频软件解码 | Cast Video Software Decoding | キャストビデオソフトウェアデコード | 캐스트 비디오 소프트웨어 디코딩
- ✅ 投射视频软件解码
- ✅ Cast Video Software Decoding
- ✅ キャストビデオソフトウェアデコード
- ✅ 캐스트 비디오 소프트웨어 디코딩

### v110.6 播放列表按双语排序 | Playlist Auto Sort By Bilingual | プレイリストバイリンガル順ソート | 재생 목록 이중 언어순 정렬
- ✅ 播放列表按双语排序
- ✅ Playlist Auto Sort By Bilingual
- ✅ プレイリストバイリンガル順ソート
- ✅ 재생 목록 이중 언어순 정렬

### v110.7 缓存低电量时清理 | Cache Clean On Low Battery | キャッシュバッテリー残量低時クリーン | 캐시 저전력 시 정리
- ✅ 缓存低电量时清理
- ✅ Cache Clean On Low Battery
- ✅ キャッシュバッテリー残量低時クリーン
- ✅ 캐시 저전력 시 정리

### v110.8 进度条自定义滑块比例 | Progress Bar Custom Thumb Scale | プログレスバーカスタムサムスケール | 진행 바 사용자 정의 썸 스케일
- ✅ 进度条自定义滑块比例
- ✅ Progress Bar Custom Thumb Scale
- ✅ プログレスバーカスタムサムスケール
- ✅ 진행 바 사용자 정의 썸 스케일

### v110.9 音量音频焦点闪避 | Volume Audio Focus Duck | 音量オーディオフォーカスダック | 볼륨 오디오 포커스 덕
- ✅ 音量音频焦点闪避
- ✅ Volume Audio Focus Duck
- ✅ 音量オーディオフォーカスダック
- ✅ 볼륨 오디오 포커스 덕

### v110.10 历史记录按季度过滤 | History Filter By Season | 履歴シーズン別フィルター | 기록 시즌별 필터
- ✅ 历史记录按季度过滤
- ✅ History Filter By Season
- ✅ 履歴シーズン別フィルター
- ✅ 기록 시즌별 필터

### v110.11 播放AB循环导出WAV | Playback AB Loop Export Wav | 再生ABループWAVエクスポート | 재생 AB 반복 WAV 내보내기
- ✅ 播放AB循环导出WAV
- ✅ Playback AB Loop Export Wav
- ✅ 再生ABループWAVエクスポート
- ✅ 재생 AB 반복 WAV 내보내기

### v110.12 截图延迟计时器 | Screenshot Delay Timer | スクリーンショット遅延タイマー | 스크린샷 지연 타이머
- ✅ 截图延迟计时器
- ✅ Screenshot Delay Timer
- ✅ スクリーンショット遅延タイマー
- ✅ 스크린샷 지연 타이머

### v110.13 视频环境光自定义 | Video Ambient Light Custom | ビデオ環境光カスタム | 비디오 앰비언트 라이트 사용자 정의
- ✅ 视频环境光自定义
- ✅ Video Ambient Light Custom
- ✅ ビデオ環境光カスタム
- ✅ 비디오 앰비언트 라이트 사용자 정의

### v110.14 弹幕字体纹理图案自定义 | Danmaku Font Texture Pattern Custom | コメントフォントテクスチャパターンカスタム | 댓글 글꼴 텍스처 패턴 사용자 정의
- ✅ 弹幕字体纹理图案自定义
- ✅ Danmaku Font Texture Pattern Custom
- ✅ コメントフォントテクスチャパターンカスタム
- ✅ 댓글 글꼴 텍스처 패턴 사용자 정의

### v110.15 字幕字体大小写覆盖110 | Subtitle Font Case Override110 | 字幕フォント大文字小文字上書き110 | 자막 글꼴 대소문자 오버라이드110
- ✅ 字幕字体大小写覆盖110
- ✅ Subtitle Font Case Override110
- ✅ 字幕フォント大文字小文字上書き110
- ✅ 자막 글꼴 대소문자 오버라이드110


### v111.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v111.1-v111.15 功能列表
- ✅ Audio Delay Sync Custom, Danmaku Font Blur Toggle111, Subtitle BG Shadow Size, Gesture Tap Seek Step, Cast Video Saturation Custom, Playlist Auto Shuffle On Repeat, Cache Download Bandwidth Limit, Progress Bar Custom Buffer Color, Volume Loudness Target, History Auto Backup Toggle111, Playback Speed Auto Adjust, Screenshot Auto Share Weibo, Video Blend Mode Custom, Danmaku Font Drop Shadow Toggle, Subtitle BG Border Color Auto

### v111.1 音频延迟同步自定义 | Audio Delay Sync Custom | オーディオ遅延同期カスタム | 오디오 지연 동기화 사용자 정의
- ✅ 音频延迟同步自定义
- ✅ Audio Delay Sync Custom
- ✅ オーディオ遅延同期カスタム
- ✅ 오디오 지연 동기화 사용자 정의

### v111.2 弹幕字体模糊开关111 | Danmaku Font Blur Toggle111 | コメントフォントブラー切替111 | 댓글 글꼴 블러 전환111
- ✅ 弹幕字体模糊开关111
- ✅ Danmaku Font Blur Toggle111
- ✅ コメントフォントブラー切替111
- ✅ 댓글 글꼴 블러 전환111

### v111.3 字幕背景阴影大小 | Subtitle BG Shadow Size | 字幕BGシャドウサイズ | 자막 배경 그림자 크기
- ✅ 字幕背景阴影大小
- ✅ Subtitle BG Shadow Size
- ✅ 字幕BGシャドウサイズ
- ✅ 자막 배경 그림자 크기

### v111.4 手势点击跳转步长 | Gesture Tap Seek Step | ジェスチャータップシークステップ | 제스처 탭 탐색 단계
- ✅ 手势点击跳转步长
- ✅ Gesture Tap Seek Step
- ✅ ジェスチャータップシークステップ
- ✅ 제스처 탭 탐색 단계

### v111.5 投射视频饱和度自定义 | Cast Video Saturation Custom | キャストビデオ彩度カスタム | 캐스트 비디오 채도 사용자 정의
- ✅ 投射视频饱和度自定义
- ✅ Cast Video Saturation Custom
- ✅ キャストビデオ彩度カスタム
- ✅ 캐스트 비디오 채도 사용자 정의

### v111.6 播放列表重复时自动随机 | Playlist Auto Shuffle On Repeat | プレイリストリピート時自動シャッフル | 재생 목록 반복 시 자동 셔플
- ✅ 播放列表重复时自动随机
- ✅ Playlist Auto Shuffle On Repeat
- ✅ プレイリストリピート時自動シャッフル
- ✅ 재생 목록 반복 시 자동 셔플

### v111.7 缓存下载带宽限制 | Cache Download Bandwidth Limit | キャッシュダウンロード帯域制限 | 캐시 다운로드 대역폭 제한
- ✅ 缓存下载带宽限制
- ✅ Cache Download Bandwidth Limit
- ✅ キャッシュダウンロード帯域制限
- ✅ 캐시 다운로드 대역폭 제한

### v111.8 进度条自定义缓冲颜色 | Progress Bar Custom Buffer Color | プログレスバーカスタムバッファ色 | 진행 바 사용자 정의 버퍼 색상
- ✅ 进度条自定义缓冲颜色
- ✅ Progress Bar Custom Buffer Color
- ✅ プログレスバーカスタムバッファ色
- ✅ 진행 바 사용자 정의 버퍼 색상

### v111.9 音量响度目标 | Volume Loudness Target | 音量ラウドネス目標 | 볼륨 음량 목표
- ✅ 音量响度目标
- ✅ Volume Loudness Target
- ✅ 音量ラウドネス目標
- ✅ 볼륨 음량 목표

### v111.10 历史记录自动备份开关111 | History Auto Backup Toggle111 | 履歴自動バックアップ切替111 | 기록 자동 백업 전환111
- ✅ 历史记录自动备份开关111
- ✅ History Auto Backup Toggle111
- ✅ 履歴自動バックアップ切替111
- ✅ 기록 자동 백업 전환111

### v111.11 播放速度自动调整 | Playback Speed Auto Adjust | 再生速度自動調整 | 재생 속도 자동 조정
- ✅ 播放速度自动调整
- ✅ Playback Speed Auto Adjust
- ✅ 再生速度自動調整
- ✅ 재생 속도 자동 조정

### v111.12 截图自动分享微博 | Screenshot Auto Share Weibo | スクリーンショット自動Weibo共有 | 스크린샷 자동 Weibo 공유
- ✅ 截图自动分享微博
- ✅ Screenshot Auto Share Weibo
- ✅ スクリーンショット自動Weibo共有
- ✅ 스크린샷 자동 Weibo 공유

### v111.13 视频混合模式自定义 | Video Blend Mode Custom | ビデオブレンドモードカスタム | 비디오 블렌드 모드 사용자 정의
- ✅ 视频混合模式自定义
- ✅ Video Blend Mode Custom
- ✅ ビデオブレンドモードカスタム
- ✅ 비디오 블렌드 모드 사용자 정의

### v111.14 弹幕字体投影开关 | Danmaku Font Drop Shadow Toggle | コメントフォントドロップシャドウ切替 | 댓글 글꼴 드롭섀도우 전환
- ✅ 弹幕字体投影开关
- ✅ Danmaku Font Drop Shadow Toggle
- ✅ コメントフォントドロップシャドウ切替
- ✅ 댓글 글꼴 드롭섀도우 전환

### v111.15 字幕背景边框颜色自动 | Subtitle BG Border Color Auto | 字幕BGボーダー色自動 | 자막 배경 테두리 색상 자동
- ✅ 字幕背景边框颜色自动
- ✅ Subtitle BG Border Color Auto
- ✅ 字幕BGボーダー色自動
- ✅ 자막 배경 테두리 색상 자동

### v112.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v112.1-v112.15 功能列表
- ✅ Audio Crossfeed Toggle112, Danmaku Font Drop Shadow X, Subtitle BG Border Color Contrast, Gesture Tap Volume Step, Cast Video Contrast Custom, Playlist Auto Next On Wifi, Cache Smart Prefetch Toggle112, Progress Bar Custom Chapter Style, Volume Dynamic Range Control, History Auto Backup Interval, Playback Speed Auto Adjust Range, Screenshot Auto Share Twitter, Video Color LUT Custom, Danmaku Font Drop Shadow Y, Subtitle BG Border Color Auto Threshold

### v112.1 音频交叉馈送开关112 | Audio Crossfeed Toggle112 | オーディオクロスフィード切替112 | 오디오 크로스피드 전환112
- ✅ 音频交叉馈送开关112
- ✅ Audio Crossfeed Toggle112
- ✅ オーディオクロスフィード切替112
- ✅ 오디오 크로스피드 전환112

### v112.2 弹幕字体投影X偏移 | Danmaku Font Drop Shadow X | コメントフォントドロップシャドウX | 댓글 글꼴 드롭섀도우 X
- ✅ 弹幕字体投影X偏移
- ✅ Danmaku Font Drop Shadow X
- ✅ コメントフォントドロップシャドウX
- ✅ 댓글 글꼴 드롭섀도우 X

### v112.3 字幕背景边框颜色对比度 | Subtitle BG Border Color Contrast | 字幕BGボーダー色コントラスト | 자막 배경 테두리 색상 대비
- ✅ 字幕背景边框颜色对比度
- ✅ Subtitle BG Border Color Contrast
- ✅ 字幕BGボーダー色コントラスト
- ✅ 자막 배경 테두리 색상 대비

### v112.4 手势点击音量步长 | Gesture Tap Volume Step | ジェスチャータップ音量ステップ | 제스처 탭 볼륨 단계
- ✅ 手势点击音量步长
- ✅ Gesture Tap Volume Step
- ✅ ジェスチャータップ音量ステップ
- ✅ 제스처 탭 볼륨 단계

### v112.5 投射视频对比度自定义 | Cast Video Contrast Custom | キャストビデオコントラストカスタム | 캐스트 비디오 대비 사용자 정의
- ✅ 投射视频对比度自定义
- ✅ Cast Video Contrast Custom
- ✅ キャストビデオコントラストカスタム
- ✅ 캐스트 비디오 대비 사용자 정의

### v112.6 播放列表WiFi时自动下一个 | Playlist Auto Next On Wifi | プレイリストWiFi時自動次再生 | 재생 목록 WiFi 시 자동 다음
- ✅ 播放列表WiFi时自动下一个
- ✅ Playlist Auto Next On Wifi
- ✅ プレイリストWiFi時自動次再生
- ✅ 재생 목록 WiFi 시 자동 다음

### v112.7 缓存智能预取开关112 | Cache Smart Prefetch Toggle112 | キャッシュスマートプリフェッチ切替112 | 캐시 스마트 프리페치 전환112
- ✅ 缓存智能预取开关112
- ✅ Cache Smart Prefetch Toggle112
- ✅ キャッシュスマートプリフェッチ切替112
- ✅ 캐시 스마트 프리페치 전환112

### v112.8 进度条自定义章节样式 | Progress Bar Custom Chapter Style | プログレスバーカスタムチャプタースタイル | 진행 바 사용자 정의 챕터 스타일
- ✅ 进度条自定义章节样式
- ✅ Progress Bar Custom Chapter Style
- ✅ プログレスバーカスタムチャプタースタイル
- ✅ 진행 바 사용자 정의 챕터 스타일

### v112.9 音量动态范围控制 | Volume Dynamic Range Control | 音量ダイナミックレンジ制御 | 볼륨 다이나믹 레인지 제어
- ✅ 音量动态范围控制
- ✅ Volume Dynamic Range Control
- ✅ 音量ダイナミックレンジ制御
- ✅ 볼륨 다이나믹 레인지 제어

### v112.10 历史记录自动备份间隔 | History Auto Backup Interval | 履歴自動バックアップ間隔 | 기록 자동 백업 간격
- ✅ 历史记录自动备份间隔
- ✅ History Auto Backup Interval
- ✅ 履歴自動バックアップ間隔
- ✅ 기록 자동 백업 간격

### v112.11 播放速度自动调整范围 | Playback Speed Auto Adjust Range | 再生速度自動調整範囲 | 재생 속도 자동 조정 범위
- ✅ 播放速度自动调整范围
- ✅ Playback Speed Auto Adjust Range
- ✅ 再生速度自動調整範囲
- ✅ 재생 속도 자동 조정 범위

### v112.12 截图自动分享推特 | Screenshot Auto Share Twitter | スクリーンショット自動Twitter共有 | 스크린샷 자동 Twitter 공유
- ✅ 截图自动分享推特
- ✅ Screenshot Auto Share Twitter
- ✅ スクリーンショット自動Twitter共有
- ✅ 스크린샷 자동 Twitter 공유

### v112.13 视频色彩LUT自定义 | Video Color LUT Custom | ビデオカラールートカスタム | 비디오 컬러 LUT 사용자 정의
- ✅ 视频色彩LUT自定义
- ✅ Video Color LUT Custom
- ✅ ビデオカラールートカスタム
- ✅ 비디오 컬러 LUT 사용자 정의

### v112.14 弹幕字体投影Y偏移 | Danmaku Font Drop Shadow Y | コメントフォントドロップシャドウY | 댓글 글꼴 드롭섀도우 Y
- ✅ 弹幕字体投影Y偏移
- ✅ Danmaku Font Drop Shadow Y
- ✅ コメントフォントドロップシャドウY
- ✅ 댓글 글꼴 드롭섀도우 Y

### v112.15 字幕背景边框颜色自动阈值 | Subtitle BG Border Color Auto Threshold | 字幕BGボーダー色自動しきい値 | 자막 배경 테두리 색상 자동 임계값
- ✅ 字幕背景边框颜色自动阈值
- ✅ Subtitle BG Border Color Auto Threshold
- ✅ 字幕BGボーダー色自動しきい値
- ✅ 자막 배경 테두리 색상 자동 임계값

### v113.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v113.1-v113.15 功能列表
- ✅ Audio Crossfeed Strength, Danmaku Font Drop Shadow Blur, Subtitle Font Weight Custom, Gesture Tap Brightness Step, Cast Video Brightness Custom, Playlist Auto Play On Connect, Cache Cleanup On Start Toggle113, Progress Bar Custom Live Edge Style, Volume Auto Gain Compensation, History Auto Backup Cloud, Playback Speed Auto Adjust Silence, Screenshot Auto Share Instagram, Video Color Temperature Custom113, Danmaku Font Drop Shadow Color, Subtitle Font Stretch Custom

### v113.1 音频交叉馈送强度 | Audio Crossfeed Strength | オーディオクロスフィード強度 | 오디오 크로스피드 강도
- ✅ 音频交叉馈送强度
- ✅ Audio Crossfeed Strength
- ✅ オーディオクロスフィード強度
- ✅ 오디오 크로스피드 강도

### v113.2 弹幕字体投影模糊 | Danmaku Font Drop Shadow Blur | コメントフォントドロップシャドウブラー | 댓글 글꼴 드롭섀도우 블러
- ✅ 弹幕字体投影模糊
- ✅ Danmaku Font Drop Shadow Blur
- ✅ コメントフォントドロップシャドウブラー
- ✅ 댓글 글꼴 드롭섀도우 블러

### v113.3 字幕字体粗细自定义 | Subtitle Font Weight Custom | 字幕フォントウェイトカスタム | 자막 글꼴 굵기 사용자 정의
- ✅ 字幕字体粗细自定义
- ✅ Subtitle Font Weight Custom
- ✅ 字幕フォントウェイトカスタム
- ✅ 자막 글꼴 굵기 사용자 정의

### v113.4 手势点击亮度步长 | Gesture Tap Brightness Step | ジェスチャータップ明るさステップ | 제스처 탭 밝기 단계
- ✅ 手势点击亮度步长
- ✅ Gesture Tap Brightness Step
- ✅ ジェスチャータップ明るさステップ
- ✅ 제스처 탭 밝기 단계

### v113.5 投射视频亮度自定义 | Cast Video Brightness Custom | キャストビデオ輝度カスタム | 캐스트 비디오 밝기 사용자 정의
- ✅ 投射视频亮度自定义
- ✅ Cast Video Brightness Custom
- ✅ キャストビデオ輝度カスタム
- ✅ 캐스트 비디오 밝기 사용자 정의

### v113.6 播放列表连接时自动播放 | Playlist Auto Play On Connect | プレイリスト接続時自動再生 | 재생 목록 연결 시 자동 재생
- ✅ 播放列表连接时自动播放
- ✅ Playlist Auto Play On Connect
- ✅ プレイリスト接続時自動再生
- ✅ 재생 목록 연결 시 자동 재생

### v113.7 缓存启动时清理开关113 | Cache Cleanup On Start Toggle113 | キャッシュ起動時クリーンアップ切替113 | 캐시 시작 시 정리 전환113
- ✅ 缓存启动时清理开关113
- ✅ Cache Cleanup On Start Toggle113
- ✅ キャッシュ起動時クリーンアップ切替113
- ✅ 캐시 시작 시 정리 전환113

### v113.8 进度条自定义直播边缘样式 | Progress Bar Custom Live Edge Style | プログレスバーカスタムライブエッジスタイル | 진행 바 사용자 정의 라이브 엣지 스타일
- ✅ 进度条自定义直播边缘样式
- ✅ Progress Bar Custom Live Edge Style
- ✅ プログレスバーカスタムライブエッジスタイル
- ✅ 진행 바 사용자 정의 라이브 엣지 스타일

### v113.9 音量自动增益补偿 | Volume Auto Gain Compensation | 音量自動ゲイン補償 | 볼륨 자동 게인 보상
- ✅ 音量自动增益补偿
- ✅ Volume Auto Gain Compensation
- ✅ 音量自動ゲイン補償
- ✅ 볼륨 자동 게인 보상

### v113.10 历史记录自动备份云端 | History Auto Backup Cloud | 履歴自動バックアップクラウド | 기록 자동 백업 클라우드
- ✅ 历史记录自动备份云端
- ✅ History Auto Backup Cloud
- ✅ 履歴自動バックアップクラウド
- ✅ 기록 자동 백업 클라우드

### v113.11 播放速度自动调整静音 | Playback Speed Auto Adjust Silence | 再生速度自動調整無音 | 재생 속도 자동 조정 무음
- ✅ 播放速度自动调整静音
- ✅ Playback Speed Auto Adjust Silence
- ✅ 再生速度自動調整無音
- ✅ 재생 속도 자동 조정 무음

### v113.12 截图自动分享Instagram | Screenshot Auto Share Instagram | スクリーンショット自動Instagram共有 | 스크린샷 자동 Instagram 공유
- ✅ 截图自动分享Instagram
- ✅ Screenshot Auto Share Instagram
- ✅ スクリーンショット自動Instagram共有
- ✅ 스크린샷 자동 Instagram 공유

### v113.13 视频色温自定义113 | Video Color Temperature Custom113 | ビデオ色温度カスタム113 | 비디오 색온도 사용자 정의113
- ✅ 视频色温自定义113
- ✅ Video Color Temperature Custom113
- ✅ ビデオ色温度カスタム113
- ✅ 비디오 색온도 사용자 정의113

### v113.14 弹幕字体投影颜色 | Danmaku Font Drop Shadow Color | コメントフォントドロップシャドウ色 | 댓글 글꼴 드롭섀도우 색상
- ✅ 弹幕字体投影颜色
- ✅ Danmaku Font Drop Shadow Color
- ✅ コメントフォントドロップシャドウ色
- ✅ 댓글 글꼴 드롭섀도우 색상

### v113.15 字幕字体拉伸自定义 | Subtitle Font Stretch Custom | 字幕フォントストレッチカスタム | 자막 글꼴 스트레치 사용자 정의
- ✅ 字幕字体拉伸自定义
- ✅ Subtitle Font Stretch Custom
- ✅ 字幕フォントストレッチカスタム
- ✅ 자막 글꼴 스트레치 사용자 정의

### v114.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v114.1-v114.15 功能列表
- ✅ Audio Dynamic Bass Boost, Danmaku Font Drop Shadow Opacity, Subtitle Font Letter Spacing114, Gesture Tap Play Pause Toggle, Cast Video Gamma Custom, Playlist Auto Pause On Headset, Cache Write Buffer Size, Progress Bar Custom Thumb Opacity, Volume Fade In On Resume, History Auto Backup File, Playback Speed Auto Adjust Pitch, Screenshot Auto Share Facebook, Video Tint Custom114, Danmaku Font BG Opacity Custom114, Subtitle Font Word Spacing114

### v114.1 音频动态低音增强 | Audio Dynamic Bass Boost | オーディオダイナミックバスブースト | 오디오 다이나믹 저음 강화
- ✅ 音频动态低音增强
- ✅ Audio Dynamic Bass Boost
- ✅ オーディオダイナミックバスブースト
- ✅ 오디오 다이나믹 저음 강화

### v114.2 弹幕字体投影透明度 | Danmaku Font Drop Shadow Opacity | コメントフォントドロップシャドウ透明度 | 댓글 글꼴 드롭섀도우 불투명도
- ✅ 弹幕字体投影透明度
- ✅ Danmaku Font Drop Shadow Opacity
- ✅ コメントフォントドロップシャドウ透明度
- ✅ 댓글 글꼴 드롭섀도우 불투명도

### v114.3 字幕字体字间距114 | Subtitle Font Letter Spacing114 | 字幕フォントレタースペーシング114 | 자막 글꼴 자간114
- ✅ 字幕字体字间距114
- ✅ Subtitle Font Letter Spacing114
- ✅ 字幕フォントレタースペーシング114
- ✅ 자막 글꼴 자간114

### v114.4 手势点击播放暂停开关 | Gesture Tap Play Pause Toggle | ジェスチャータップ再生一時停止切替 | 제스처 탭 재생 일시정지 전환
- ✅ 手势点击播放暂停开关
- ✅ Gesture Tap Play Pause Toggle
- ✅ ジェスチャータップ再生一時停止切替
- ✅ 제스처 탭 재생 일시정지 전환

### v114.5 投射视频伽马自定义 | Cast Video Gamma Custom | キャストビデオガンマカスタム | 캐스트 비디오 감마 사용자 정의
- ✅ 投射视频伽马自定义
- ✅ Cast Video Gamma Custom
- ✅ キャストビデオガンマカスタム
- ✅ 캐스트 비디오 감마 사용자 정의

### v114.6 播放列表耳机时自动暂停 | Playlist Auto Pause On Headset | プレイリストヘッドセット時自動一時停止 | 재생 목록 헤드셋 시 자동 일시정지
- ✅ 播放列表耳机时自动暂停
- ✅ Playlist Auto Pause On Headset
- ✅ プレイリストヘッドセット時自動一時停止
- ✅ 재생 목록 헤드셋 시 자동 일시정지

### v114.7 缓存写入缓冲大小 | Cache Write Buffer Size | キャッシュライトバッファサイズ | 캐시 쓰기 버퍼 크기
- ✅ 缓存写入缓冲大小
- ✅ Cache Write Buffer Size
- ✅ キャッシュライトバッファサイズ
- ✅ 캐시 쓰기 버퍼 크기

### v114.8 进度条自定义滑块透明度 | Progress Bar Custom Thumb Opacity | プログレスバーカスタムサム透明度 | 진행 바 사용자 정의 썸 불투명도
- ✅ 进度条自定义滑块透明度
- ✅ Progress Bar Custom Thumb Opacity
- ✅ プログレスバーカスタムサム透明度
- ✅ 진행 바 사용자 정의 썸 불투명도

### v114.9 音量恢复时淡入 | Volume Fade In On Resume | 音量再開時フェードイン | 볼륨 재개 시 페이드인
- ✅ 音量恢复时淡入
- ✅ Volume Fade In On Resume
- ✅ 音量再開時フェードイン
- ✅ 볼륨 재개 시 페이드인

### v114.10 历史记录自动备份文件 | History Auto Backup File | 履歴自動バックアップファイル | 기록 자동 백업 파일
- ✅ 历史记录自动备份文件
- ✅ History Auto Backup File
- ✅ 履歴自動バックアップファイル
- ✅ 기록 자동 백업 파일

### v114.11 播放速度自动调整音高 | Playback Speed Auto Adjust Pitch | 再生速度自動調整ピッチ | 재생 속도 자동 조정 피치
- ✅ 播放速度自动调整音高
- ✅ Playback Speed Auto Adjust Pitch
- ✅ 再生速度自動調整ピッチ
- ✅ 재생 속도 자동 조정 피치

### v114.12 截图自动分享Facebook | Screenshot Auto Share Facebook | スクリーンショット自動Facebook共有 | 스크린샷 자동 Facebook 공유
- ✅ 截图自动分享Facebook
- ✅ Screenshot Auto Share Facebook
- ✅ スクリーンショット自動Facebook共有
- ✅ 스크린샷 자동 Facebook 공유

### v114.13 视频色调自定义114 | Video Tint Custom114 | ビデオチントカスタム114 | 비디오 틴트 사용자 정의114
- ✅ 视频色调自定义114
- ✅ Video Tint Custom114
- ✅ ビデオチントカスタム114
- ✅ 비디오 틴트 사용자 정의114

### v114.14 弹幕字体背景透明度自定义114 | Danmaku Font BG Opacity Custom114 | コメントフォントBG透明度カスタム114 | 댓글 글꼴 배경 불투명도 사용자 정의114
- ✅ 弹幕字体背景透明度自定义114
- ✅ Danmaku Font BG Opacity Custom114
- ✅ コメントフォントBG透明度カスタム114
- ✅ 댓글 글꼴 배경 불투명도 사용자 정의114

### v114.15 字幕字体词间距114 | Subtitle Font Word Spacing114 | 字幕フォントワードスペーシング114 | 자막 글꼴 단어 간격114
- ✅ 字幕字体词间距114
- ✅ Subtitle Font Word Spacing114
- ✅ 字幕フォントワードスペーシング114
- ✅ 자막 글꼴 단어 간격114

### v115.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v115.1-v115.15 功能列表
- ✅ Audio Dynamic Treble Boost, Danmaku Font BG Border Toggle115, Subtitle Font Word Spacing115, Gesture Tap Double Action, Cast Video Tint Custom, Playlist Auto Resume On Launch, Cache Read Buffer Size, Progress Bar Custom Chapter Opacity, Volume Fade Out On Pause, History Search Auto Complete, Playback Speed Auto Adjust Min, Screenshot Auto Share LinkedIn, Video Split Screen Custom, Danmaku Font BG Border Width115, Subtitle Font Features115

### v115.1 音频动态高音增强 | Audio Dynamic Treble Boost | オーディオダイナミックトレブルブースト | 오디오 다이나믹 고음 강화
- ✅ 音频动态高音增强
- ✅ Audio Dynamic Treble Boost
- ✅ オーディオダイナミックトレブルブースト
- ✅ 오디오 다이나믹 고음 강화

### v115.2 弹幕字体背景边框开关115 | Danmaku Font BG Border Toggle115 | コメントフォントBGボーダー切替115 | 댓글 글꼴 배경 테두리 전환115
- ✅ 弹幕字体背景边框开关115
- ✅ Danmaku Font BG Border Toggle115
- ✅ コメントフォントBGボーダー切替115
- ✅ 댓글 글꼴 배경 테두리 전환115

### v115.3 字幕字体词间距115 | Subtitle Font Word Spacing115 | 字幕フォントワードスペーシング115 | 자막 글꼴 단어 간격115
- ✅ 字幕字体词间距115
- ✅ Subtitle Font Word Spacing115
- ✅ 字幕フォントワードスペーシング115
- ✅ 자막 글꼴 단어 간격115

### v115.4 手势点击双击动作 | Gesture Tap Double Action | ジェスチャータップダブルアクション | 제스처 탭 더블 동작
- ✅ 手势点击双击动作
- ✅ Gesture Tap Double Action
- ✅ ジェスチャータップダブルアクション
- ✅ 제스처 탭 더블 동작

### v115.5 投射视频色调自定义 | Cast Video Tint Custom | キャストビデオチントカスタム | 캐스트 비디오 틴트 사용자 정의
- ✅ 投射视频色调自定义
- ✅ Cast Video Tint Custom
- ✅ キャストビデオチントカスタム
- ✅ 캐스트 비디오 틴트 사용자 정의

### v115.6 播放列表启动时自动恢复 | Playlist Auto Resume On Launch | プレイリスト起動時自動再開 | 재생 목록 시작 시 자동 재개
- ✅ 播放列表启动时自动恢复
- ✅ Playlist Auto Resume On Launch
- ✅ プレイリスト起動時自動再開
- ✅ 재생 목록 시작 시 자동 재개

### v115.7 缓存读取缓冲大小 | Cache Read Buffer Size | キャッシュリードバッファサイズ | 캐시 읽기 버퍼 크기
- ✅ 缓存读取缓冲大小
- ✅ Cache Read Buffer Size
- ✅ キャッシュリードバッファサイズ
- ✅ 캐시 읽기 버퍼 크기

### v115.8 进度条自定义章节透明度 | Progress Bar Custom Chapter Opacity | プログレスバーカスタムチャプター透明度 | 진행 바 사용자 정의 챕터 불투명도
- ✅ 进度条自定义章节透明度
- ✅ Progress Bar Custom Chapter Opacity
- ✅ プログレスバーカスタムチャプター透明度
- ✅ 진행 바 사용자 정의 챕터 불투명도

### v115.9 音量暂停时淡出 | Volume Fade Out On Pause | 音量一時停止時フェードアウト | 볼륨 일시정지 시 페이드아웃
- ✅ 音量暂停时淡出
- ✅ Volume Fade Out On Pause
- ✅ 音量一時停止時フェードアウト
- ✅ 볼륨 일시정지 시 페이드아웃

### v115.10 历史记录搜索自动补全 | History Search Auto Complete | 履歴検索自動補完 | 기록 검색 자동 완성
- ✅ 历史记录搜索自动补全
- ✅ History Search Auto Complete
- ✅ 履歴検索自動補完
- ✅ 기록 검색 자동 완성

### v115.11 播放速度自动调整最小 | Playback Speed Auto Adjust Min | 再生速度自動調整最小 | 재생 속도 자동 조정 최소
- ✅ 播放速度自动调整最小
- ✅ Playback Speed Auto Adjust Min
- ✅ 再生速度自動調整最小
- ✅ 재생 속도 자동 조정 최소

### v115.12 截图自动分享LinkedIn | Screenshot Auto Share LinkedIn | スクリーンショット自動LinkedIn共有 | 스크린샷 자동 LinkedIn 공유
- ✅ 截图自动分享LinkedIn
- ✅ Screenshot Auto Share LinkedIn
- ✅ スクリーンショット自動LinkedIn共有
- ✅ 스크린샷 자동 LinkedIn 공유

### v115.13 视频分屏自定义 | Video Split Screen Custom | ビデオ分割画面カスタム | 비디오 분할 화면 사용자 정의
- ✅ 视频分屏自定义
- ✅ Video Split Screen Custom
- ✅ ビデオ分割画面カスタム
- ✅ 비디오 분할 화면 사용자 정의

### v115.14 弹幕字体背景边框宽度115 | Danmaku Font BG Border Width115 | コメントフォントBGボーダー幅115 | 댓글 글꼴 배경 테두리 너비115
- ✅ 弹幕字体背景边框宽度115
- ✅ Danmaku Font BG Border Width115
- ✅ コメントフォントBGボーダー幅115
- ✅ 댓글 글꼴 배경 테두리 너비115

### v115.15 字幕字体特性115 | Subtitle Font Features115 | 字幕フォントフィーチャー115 | 자막 글꼴 기능115
- ✅ 字幕字体特性115
- ✅ Subtitle Font Features115
- ✅ 字幕フォントフィーチャー115
- ✅ 자막 글꼴 기능115

### v116.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v116.1-v116.15 功能列表
- ✅ Audio Dynamic Compressor Toggle116, Danmaku Font BG Border Color115, Subtitle Font Features116, Gesture Tap Triple Action, Cast Video Sepia Custom, Playlist Auto Shuffle Seed, Cache Preload On Start Toggle, Progress Bar Custom Buffer Opacity, Volume Fade Duration Custom, History Search Scope Custom, Playback Speed Auto Adjust Max, Screenshot Auto Share WhatsApp, Video PIP Mode Custom, Danmaku Font BG Border Radius115, Subtitle Animation Type116

### v116.1 音频动态压缩器开关116 | Audio Dynamic Compressor Toggle116 | オーディオダイナミックコンプレッサー切替116 | 오디오 다이나믹 컴프레서 전환116
- ✅ 音频动态压缩器开关116
- ✅ Audio Dynamic Compressor Toggle116
- ✅ オーディオダイナミックコンプレッサー切替116
- ✅ 오디오 다이나믹 컴프레서 전환116

### v116.2 弹幕字体背景边框颜色115 | Danmaku Font BG Border Color115 | コメントフォントBGボーダー色115 | 댓글 글꼴 배경 테두리 색상115
- ✅ 弹幕字体背景边框颜色115
- ✅ Danmaku Font BG Border Color115
- ✅ コメントフォントBGボーダー色115
- ✅ 댓글 글꼴 배경 테두리 색상115

### v116.3 字幕字体特性116 | Subtitle Font Features116 | 字幕フォントフィーチャー116 | 자막 글꼴 기능116
- ✅ 字幕字体特性116
- ✅ Subtitle Font Features116
- ✅ 字幕フォントフィーチャー116
- ✅ 자막 글꼴 기능116

### v116.4 手势点击三击动作 | Gesture Tap Triple Action | ジェスチャータップトリプルアクション | 제스처 탭 트리플 동작
- ✅ 手势点击三击动作
- ✅ Gesture Tap Triple Action
- ✅ ジェスチャータップトリプルアクション
- ✅ 제스처 탭 트리플 동작

### v116.5 投射视频怀旧自定义 | Cast Video Sepia Custom | キャストビデオセピアカスタム | 캐스트 비디오 세피아 사용자 정의
- ✅ 投射视频怀旧自定义
- ✅ Cast Video Sepia Custom
- ✅ キャストビデオセピアカスタム
- ✅ 캐스트 비디오 세피아 사용자 정의

### v116.6 播放列表自动随机种子 | Playlist Auto Shuffle Seed | プレイリスト自動シャッフルシード | 재생 목록 자동 셔플 시드
- ✅ 播放列表自动随机种子
- ✅ Playlist Auto Shuffle Seed
- ✅ プレイリスト自動シャッフルシード
- ✅ 재생 목록 자동 셔플 시드

### v116.7 缓存启动时预加载开关 | Cache Preload On Start Toggle | キャッシュ起動時プリロード切替 | 캐시 시작 시 프리로드 전환
- ✅ 缓存启动时预加载开关
- ✅ Cache Preload On Start Toggle
- ✅ キャッシュ起動時プリロード切替
- ✅ 캐시 시작 시 프리로드 전환

### v116.8 进度条自定义缓冲透明度 | Progress Bar Custom Buffer Opacity | プログレスバーカスタムバッファ透明度 | 진행 바 사용자 정의 버퍼 불투명도
- ✅ 进度条自定义缓冲透明度
- ✅ Progress Bar Custom Buffer Opacity
- ✅ プログレスバーカスタムバッファ透明度
- ✅ 진행 바 사용자 정의 버퍼 불투명도

### v116.9 音量淡入淡出时间自定义 | Volume Fade Duration Custom | 音量フェード時間カスタム | 볼륨 페이드 시간 사용자 정의
- ✅ 音量淡入淡出时间自定义
- ✅ Volume Fade Duration Custom
- ✅ 音量フェード時間カスタム
- ✅ 볼륨 페이드 시간 사용자 정의

### v116.10 历史记录搜索范围自定义 | History Search Scope Custom | 履歴検索範囲カスタム | 기록 검색 범위 사용자 정의
- ✅ 历史记录搜索范围自定义
- ✅ History Search Scope Custom
- ✅ 履歴検索範囲カスタム
- ✅ 기록 검색 범위 사용자 정의

### v116.11 播放速度自动调整最大 | Playback Speed Auto Adjust Max | 再生速度自動調整最大 | 재생 속도 자동 조정 최대
- ✅ 播放速度自动调整最大
- ✅ Playback Speed Auto Adjust Max
- ✅ 再生速度自動調整最大
- ✅ 재생 속도 자동 조정 최대

### v116.12 截图自动分享WhatsApp | Screenshot Auto Share WhatsApp | スクリーンショット自動WhatsApp共有 | 스크린샷 자동 WhatsApp 공유
- ✅ 截图自动分享WhatsApp
- ✅ Screenshot Auto Share WhatsApp
- ✅ スクリーンショット自動WhatsApp共有
- ✅ 스크린샷 자동 WhatsApp 공유

### v116.13 视频画中画模式自定义 | Video PIP Mode Custom | ビデオPIPモードカスタム | 비디오 PIP 모드 사용자 정의
- ✅ 视频画中画模式自定义
- ✅ Video PIP Mode Custom
- ✅ ビデオPIPモードカスタム
- ✅ 비디오 PIP 모드 사용자 정의

### v116.14 弹幕字体背景边框圆角115 | Danmaku Font BG Border Radius115 | コメントフォントBGボーダー角丸115 | 댓글 글꼴 배경 테두리 반경115
- ✅ 弹幕字体背景边框圆角115
- ✅ Danmaku Font BG Border Radius115
- ✅ コメントフォントBGボーダー角丸115
- ✅ 댓글 글꼴 배경 테두리 반경115

### v116.15 字幕动画类型116 | Subtitle Animation Type116 | 字幕アニメーションタイプ116 | 자막 애니메이션 유형116
- ✅ 字幕动画类型116
- ✅ Subtitle Animation Type116
- ✅ 字幕アニメーションタイプ116
- ✅ 자막 애니메이션 유형116

### v117.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v117.1-v117.15 功能列表
- ✅ Audio Dynamic EQ Toggle117, Danmaku Font BG Border Radius116, Subtitle Animation Duration117, Gesture Tap Quadruple Action, Cast Video Negative Custom, Playlist Auto Skip On Low Battery, Cache Preload On Wifi Toggle, Progress Bar Custom Live Edge Opacity, Volume Smooth Fade Toggle, History Search Regex Toggle, Playback Speed Auto Adjust Active, Screenshot Auto Share Telegram, Video PIP Size Custom, Danmaku Font BG Border Opacity116, Subtitle Animation Speed117

### v117.1 音频动态均衡器开关117 | Audio Dynamic EQ Toggle117 | オーディオダイナミックEQ切替117 | 오디오 다이나믹 EQ 전환117
- ✅ 音频动态均衡器开关117
- ✅ Audio Dynamic EQ Toggle117
- ✅ オーディオダイナミックEQ切替117
- ✅ 오디오 다이나믹 EQ 전환117

### v117.2 弹幕字体背景边框圆角116 | Danmaku Font BG Border Radius116 | コメントフォントBGボーダー角丸116 | 댓글 글꼴 배경 테두리 반경116
- ✅ 弹幕字体背景边框圆角116
- ✅ Danmaku Font BG Border Radius116
- ✅ コメントフォントBGボーダー角丸116
- ✅ 댓글 글꼴 배경 테두리 반경116

### v117.3 字幕动画持续时间117 | Subtitle Animation Duration117 | 字幕アニメーション持続時間117 | 자막 애니메이션 지속 시간117
- ✅ 字幕动画持续时间117
- ✅ Subtitle Animation Duration117
- ✅ 字幕アニメーション持続時間117
- ✅ 자막 애니메이션 지속 시간117

### v117.4 手势点击四击动作 | Gesture Tap Quadruple Action | ジェスチャータップクアドラプルアクション | 제스처 탭 쿼드러플 동작
- ✅ 手势点击四击动作
- ✅ Gesture Tap Quadruple Action
- ✅ ジェスチャータップクアドラプルアクション
- ✅ 제스처 탭 쿼드러플 동작

### v117.5 投射视频负片自定义 | Cast Video Negative Custom | キャストビデオネガティブカスタム | 캐스트 비디오 네거티브 사용자 정의
- ✅ 投射视频负片自定义
- ✅ Cast Video Negative Custom
- ✅ キャストビデオネガティブカスタム
- ✅ 캐스트 비디오 네거티브 사용자 정의

### v117.6 播放列表低电量自动跳过 | Playlist Auto Skip On Low Battery | プレイリストバッテリー残量低時スキップ | 재생 목록 저전력 시 자동 건너뛰기
- ✅ 播放列表低电量自动跳过
- ✅ Playlist Auto Skip On Low Battery
- ✅ プレイリストバッテリー残量低時スキップ
- ✅ 재생 목록 저전력 시 자동 건너뛰기

### v117.7 缓存WiFi预加载开关 | Cache Preload On Wifi Toggle | キャッシュWiFi時プリロード切替 | 캐시 WiFi 프리로드 전환
- ✅ 缓存WiFi预加载开关
- ✅ Cache Preload On Wifi Toggle
- ✅ キャッシュWiFi時プリロード切替
- ✅ 캐시 WiFi 프리로드 전환

### v117.8 进度条自定义直播边缘透明度 | Progress Bar Custom Live Edge Opacity | プログレスバーカスタムライブエッジ透明度 | 진행 바 사용자 정의 라이브 엣지 불투명도
- ✅ 进度条自定义直播边缘透明度
- ✅ Progress Bar Custom Live Edge Opacity
- ✅ プログレスバーカスタムライブエッジ透明度
- ✅ 진행 바 사용자 정의 라이브 엣지 불투명도

### v117.9 音量平滑淡入淡出开关 | Volume Smooth Fade Toggle | 音量スムーズフェード切替 | 볼륨 스무스 페이드 전환
- ✅ 音量平滑淡入淡出开关
- ✅ Volume Smooth Fade Toggle
- ✅ 音量スムーズフェード切替
- ✅ 볼륨 스무스 페이드 전환

### v117.10 历史记录搜索正则开关 | History Search Regex Toggle | 履歴検索正規表現切替 | 기록 검색 정규식 전환
- ✅ 历史记录搜索正则开关
- ✅ History Search Regex Toggle
- ✅ 履歴検索正規表現切替
- ✅ 기록 검색 정규식 전환

### v117.11 播放速度自动调整激活 | Playback Speed Auto Adjust Active | 再生速度自動調整アクティブ | 재생 속도 자동 조정 활성
- ✅ 播放速度自动调整激活
- ✅ Playback Speed Auto Adjust Active
- ✅ 再生速度自動調整アクティブ
- ✅ 재생 속도 자동 조정 활성

### v117.12 截图自动分享Telegram | Screenshot Auto Share Telegram | スクリーンショット自動Telegram共有 | 스크린샷 자동 Telegram 공유
- ✅ 截图自动分享Telegram
- ✅ Screenshot Auto Share Telegram
- ✅ スクリーンショット自動Telegram共有
- ✅ 스크린샷 자동 Telegram 공유

### v117.13 视频画中画大小自定义 | Video PIP Size Custom | ビデオPIPサイズカスタム | 비디오 PIP 크기 사용자 정의
- ✅ 视频画中画大小自定义
- ✅ Video PIP Size Custom
- ✅ ビデオPIPサイズカスタム
- ✅ 비디오 PIP 크기 사용자 정의

### v117.14 弹幕字体背景边框透明度116 | Danmaku Font BG Border Opacity116 | コメントフォントBGボーダー透明度116 | 댓글 글꼴 배경 테두리 불투명도116
- ✅ 弹幕字体背景边框透明度116
- ✅ Danmaku Font BG Border Opacity116
- ✅ コメントフォントBGボーダー透明度116
- ✅ 댓글 글꼴 배경 테두리 불투명도116

### v117.15 字幕动画速度117 | Subtitle Animation Speed117 | 字幕アニメーション速度117 | 자막 애니메이션 속도117
- ✅ 字幕动画速度117
- ✅ Subtitle Animation Speed117
- ✅ 字幕アニメーション速度117
- ✅ 자막 애니메이션 속도117

### v118.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v118.1-v118.15 功能列表
- ✅ Audio Dynamic Range Expand, Danmaku Font BG Border Opacity117, Subtitle Animation Speed118, Gesture Tap Hold Action, Cast Video Posterize Custom, Playlist Auto Load Metadata, Cache Smart Eviction Toggle, Progress Bar Custom Scale Type, Volume Spatial Audio Mode, History Search Fuzzy Match, Playback Speed Auto Adjust Buffer, Screenshot Auto Share Discord, Video PIP Position Custom, Danmaku Font BG Fill Mode117, Subtitle Animation Easing118

### v118.1 音频动态范围扩展 | Audio Dynamic Range Expand | オーディオダイナミックレンジ拡張 | 오디오 다이나믹 레인지 확장
- ✅ 音频动态范围扩展
- ✅ Audio Dynamic Range Expand
- ✅ オーディオダイナミックレンジ拡張
- ✅ 오디오 다이나믹 레인지 확장

### v118.2 弹幕字体背景边框透明度117 | Danmaku Font BG Border Opacity117 | コメントフォントBGボーダー透明度117 | 댓글 글꼴 배경 테두리 불투명도117
- ✅ 弹幕字体背景边框透明度117
- ✅ Danmaku Font BG Border Opacity117
- ✅ コメントフォントBGボーダー透明度117
- ✅ 댓글 글꼴 배경 테두리 불투명도117

### v118.3 字幕动画速度118 | Subtitle Animation Speed118 | 字幕アニメーション速度118 | 자막 애니메이션 속도118
- ✅ 字幕动画速度118
- ✅ Subtitle Animation Speed118
- ✅ 字幕アニメーション速度118
- ✅ 자막 애니메이션 속도118

### v118.4 手势点击长按动作 | Gesture Tap Hold Action | ジェスチャータップホールドアクション | 제스처 탭 홀드 동작
- ✅ 手势点击长按动作
- ✅ Gesture Tap Hold Action
- ✅ ジェスチャータップホールドアクション
- ✅ 제스처 탭 홀드 동작

### v118.5 投射视频色调分离自定义 | Cast Video Posterize Custom | キャストビデオポスタリーズカスタム | 캐스트 비디오 포스터라이즈 사용자 정의
- ✅ 投射视频色调分离自定义
- ✅ Cast Video Posterize Custom
- ✅ キャストビデオポスタリーズカスタム
- ✅ 캐스트 비디오 포스터라이즈 사용자 정의

### v118.6 播放列表自动加载元数据 | Playlist Auto Load Metadata | プレイリスト自動メタデータ読み込み | 재생 목록 자동 메타데이터 로드
- ✅ 播放列表自动加载元数据
- ✅ Playlist Auto Load Metadata
- ✅ プレイリスト自動メタデータ読み込み
- ✅ 재생 목록 자동 메타데이터 로드

### v118.7 缓存智能淘汰开关 | Cache Smart Eviction Toggle | キャッシュスマートエビクション切替 | 캐시 스마트 제거 전환
- ✅ 缓存智能淘汰开关
- ✅ Cache Smart Eviction Toggle
- ✅ キャッシュスマートエビクション切替
- ✅ 캐시 스마트 제거 전환

### v118.8 进度条自定义比例类型 | Progress Bar Custom Scale Type | プログレスバーカスタムスケールタイプ | 진행 바 사용자 정의 스케일 유형
- ✅ 进度条自定义比例类型
- ✅ Progress Bar Custom Scale Type
- ✅ プログレスバーカスタムスケールタイプ
- ✅ 진행 바 사용자 정의 스케일 유형

### v118.9 音量空间音频模式 | Volume Spatial Audio Mode | 音量空間オーディオモード | 볼륨 공간 오디오 모드
- ✅ 音量空间音频模式
- ✅ Volume Spatial Audio Mode
- ✅ 音量空間オーディオモード
- ✅ 볼륨 공간 오디오 모드

### v118.10 历史记录搜索模糊匹配 | History Search Fuzzy Match | 履歴検索あいまい一致 | 기록 검색 퍼지 매칭
- ✅ 历史记录搜索模糊匹配
- ✅ History Search Fuzzy Match
- ✅ 履歴検索あいまい一致
- ✅ 기록 검색 퍼지 매칭

### v118.11 播放速度自动调整缓冲 | Playback Speed Auto Adjust Buffer | 再生速度自動調整バッファ | 재생 속도 자동 조정 버퍼
- ✅ 播放速度自动调整缓冲
- ✅ Playback Speed Auto Adjust Buffer
- ✅ 再生速度自動調整バッファ
- ✅ 재생 속도 자동 조정 버퍼

### v118.12 截图自动分享Discord | Screenshot Auto Share Discord | スクリーンショット自動Discord共有 | 스크린샷 자동 Discord 공유
- ✅ 截图自动分享Discord
- ✅ Screenshot Auto Share Discord
- ✅ スクリーンショット自動Discord共有
- ✅ 스크린샷 자동 Discord 공유

### v118.13 视频画中画位置自定义 | Video PIP Position Custom | ビデオPIP位置カスタム | 비디오 PIP 위치 사용자 정의
- ✅ 视频画中画位置自定义
- ✅ Video PIP Position Custom
- ✅ ビデオPIP位置カスタム
- ✅ 비디오 PIP 위치 사용자 정의

### v118.14 弹幕字体背景填充模式117 | Danmaku Font BG Fill Mode117 | コメントフォントBGフィルモード117 | 댓글 글꼴 배경 채우기 모드117
- ✅ 弹幕字体背景填充模式117
- ✅ Danmaku Font BG Fill Mode117
- ✅ コメントフォントBGフィルモード117
- ✅ 댓글 글꼴 배경 채우기 모드117

### v118.15 字幕动画缓动118 | Subtitle Animation Easing118 | 字幕アニメーションイージング118 | 자막 애니메이션 이징118
- ✅ 字幕动画缓动118
- ✅ Subtitle Animation Easing118
- ✅ 字幕アニメーションイージング118
- ✅ 자막 애니메이션 이징118

### v119.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v119.1-v119.15 功能列表
- ✅ Audio Dynamic Stereo Width, Danmaku Font BG Fill Mode118, Subtitle Animation Easing119, Gesture Tap Release Action, Cast Video Solarize Custom, Playlist Auto Save Position, Cache Verify Integrity Toggle, Progress Bar Custom Scale Min, Volume Stereo Pan Custom, History Search Match Case, Playback Speed Auto Adjust Network, Screenshot Auto Share Line, Video PIP Corner Radius, Danmaku Font BG Fill Opacity118, Subtitle Animation Loop119

### v119.1 音频动态立体声宽度 | Audio Dynamic Stereo Width | オーディオダイナミックステレオ幅 | 오디오 다이나믹 스테레오 너비
- ✅ 音频动态立体声宽度
- ✅ Audio Dynamic Stereo Width
- ✅ オーディオダイナミックステレオ幅
- ✅ 오디오 다이나믹 스테레오 너비

### v119.2 弹幕字体背景填充模式118 | Danmaku Font BG Fill Mode118 | コメントフォントBGフィルモード118 | 댓글 글꼴 배경 채우기 모드118
- ✅ 弹幕字体背景填充模式118
- ✅ Danmaku Font BG Fill Mode118
- ✅ コメントフォントBGフィルモード118
- ✅ 댓글 글꼴 배경 채우기 모드118

### v119.3 字幕动画缓动119 | Subtitle Animation Easing119 | 字幕アニメーションイージング119 | 자막 애니메이션 이징119
- ✅ 字幕动画缓动119
- ✅ Subtitle Animation Easing119
- ✅ 字幕アニメーションイージング119
- ✅ 자막 애니메이션 이징119

### v119.4 手势点击释放动作 | Gesture Tap Release Action | ジェスチャータップリリースアクション | 제스처 탭 릴리즈 동작
- ✅ 手势点击释放动作
- ✅ Gesture Tap Release Action
- ✅ ジェスチャータップリリースアクション
- ✅ 제스처 탭 릴리즈 동작

### v119.5 投射视频曝光过度自定义 | Cast Video Solarize Custom | キャストビデオソラライズカスタム | 캐스트 비디오 솔라라이즈 사용자 정의
- ✅ 投射视频曝光过度自定义
- ✅ Cast Video Solarize Custom
- ✅ キャストビデオソラライズカスタム
- ✅ 캐스트 비디오 솔라라이즈 사용자 정의

### v119.6 播放列表自动保存位置 | Playlist Auto Save Position | プレイリスト自動位置保存 | 재생 목록 자동 위치 저장
- ✅ 播放列表自动保存位置
- ✅ Playlist Auto Save Position
- ✅ プレイリスト自動位置保存
- ✅ 재생 목록 자동 위치 저장

### v119.7 缓存完整性验证开关 | Cache Verify Integrity Toggle | キャッシュ整合性検証切替 | 캐시 무결성 검증 전환
- ✅ 缓存完整性验证开关
- ✅ Cache Verify Integrity Toggle
- ✅ キャッシュ整合性検証切替
- ✅ 캐시 무결성 검증 전환

### v119.8 进度条自定义比例最小 | Progress Bar Custom Scale Min | プログレスバーカスタムスケール最小 | 진행 바 사용자 정의 스케일 최소
- ✅ 进度条自定义比例最小
- ✅ Progress Bar Custom Scale Min
- ✅ プログレスバーカスタムスケール最小
- ✅ 진행 바 사용자 정의 스케일 최소

### v119.9 音量立体声声像自定义 | Volume Stereo Pan Custom | 音量ステレオパンカスタム | 볼륨 스테레오 팬 사용자 정의
- ✅ 音量立体声声像自定义
- ✅ Volume Stereo Pan Custom
- ✅ 音量ステレオパンカスタム
- ✅ 볼륨 스테레오 팬 사용자 정의

### v119.10 历史记录搜索区分大小写 | History Search Match Case | 履歴検索大文字小文字区別 | 기록 검색 대소문자 구분
- ✅ 历史记录搜索区分大小写
- ✅ History Search Match Case
- ✅ 履歴検索大文字小文字区別
- ✅ 기록 검색 대소문자 구분

### v119.11 播放速度自动调整网络 | Playback Speed Auto Adjust Network | 再生速度自動調整ネットワーク | 재생 속도 자동 조정 네트워크
- ✅ 播放速度自动调整网络
- ✅ Playback Speed Auto Adjust Network
- ✅ 再生速度自動調整ネットワーク
- ✅ 재생 속도 자동 조정 네트워크

### v119.12 截图自动分享Line | Screenshot Auto Share Line | スクリーンショット自動Line共有 | 스크린샷 자동 Line 공유
- ✅ 截图自动分享Line
- ✅ Screenshot Auto Share Line
- ✅ スクリーンショット自動Line共有
- ✅ 스크린샷 자동 Line 공유

### v119.13 视频画中画圆角 | Video PIP Corner Radius | ビデオPIP角丸半径 | 비디오 PIP 모서리 반경
- ✅ 视频画中画圆角
- ✅ Video PIP Corner Radius
- ✅ ビデオPIP角丸半径
- ✅ 비디오 PIP 모서리 반경

### v119.14 弹幕字体背景填充透明度118 | Danmaku Font BG Fill Opacity118 | コメントフォントBGフィル透明度118 | 댓글 글꼴 배경 채우기 불투명도118
- ✅ 弹幕字体背景填充透明度118
- ✅ Danmaku Font BG Fill Opacity118
- ✅ コメントフォントBGフィル透明度118
- ✅ 댓글 글꼴 배경 채우기 불투명도118

### v119.15 字幕动画循环119 | Subtitle Animation Loop119 | 字幕アニメーションループ119 | 자막 애니메이션 반복119
- ✅ 字幕动画循环119
- ✅ Subtitle Animation Loop119
- ✅ 字幕アニメーションループ119
- ✅ 자막 애니메이션 반복119

### v120.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v120.1-v120.15 功能列表
- ✅ Audio Dynamic Mono Fold, Danmaku Font BG Fill Opacity119, Subtitle Animation Loop120, Gesture Tap Custom Action, Cast Video Duotone Custom, Playlist Auto Save Position Toggle, Cache Verify Integrity On Start, Progress Bar Custom Scale Max, Volume Stereo Width Custom, History Search Whole Word, Playback Speed Auto Adjust Quality, Screenshot Auto Share KakaoTalk, Video PIP Opacity Custom, Danmaku Font BG Fill Angle119, Subtitle Animation Delay120

### v120.1 音频动态单声道折叠 | Audio Dynamic Mono Fold | オーディオダイナミックモノフォールド | 오디오 다이나믹 모노 폴드
- ✅ 音频动态单声道折叠
- ✅ Audio Dynamic Mono Fold
- ✅ オーディオダイナミックモノフォールド
- ✅ 오디오 다이나믹 모노 폴드

### v120.2 弹幕字体背景填充透明度119 | Danmaku Font BG Fill Opacity119 | コメントフォントBGフィル透明度119 | 댓글 글꼴 배경 채우기 불투명도119
- ✅ 弹幕字体背景填充透明度119
- ✅ Danmaku Font BG Fill Opacity119
- ✅ コメントフォントBGフィル透明度119
- ✅ 댓글 글꼴 배경 채우기 불투명도119

### v120.3 字幕动画循环120 | Subtitle Animation Loop120 | 字幕アニメーションループ120 | 자막 애니메이션 반복120
- ✅ 字幕动画循环120
- ✅ Subtitle Animation Loop120
- ✅ 字幕アニメーションループ120
- ✅ 자막 애니메이션 반복120

### v120.4 手势点击自定义动作 | Gesture Tap Custom Action | ジェスチャータップカスタムアクション | 제스처 탭 사용자 정의 동작
- ✅ 手势点击自定义动作
- ✅ Gesture Tap Custom Action
- ✅ ジェスチャータップカスタムアクション
- ✅ 제스처 탭 사용자 정의 동작

### v120.5 投射视频双色调自定义 | Cast Video Duotone Custom | キャストビデオデュオトーンカスタム | 캐스트 비디오 듀오톤 사용자 정의
- ✅ 投射视频双色调自定义
- ✅ Cast Video Duotone Custom
- ✅ キャストビデオデュオトーンカスタム
- ✅ 캐스트 비디오 듀오톤 사용자 정의

### v120.6 播放列表自动保存位置开关 | Playlist Auto Save Position Toggle | プレイリスト自動位置保存切替 | 재생 목록 자동 위치 저장 전환
- ✅ 播放列表自动保存位置开关
- ✅ Playlist Auto Save Position Toggle
- ✅ プレイリスト自動位置保存切替
- ✅ 재생 목록 자동 위치 저장 전환

### v120.7 缓存启动时验证完整性 | Cache Verify Integrity On Start | キャッシュ起動時整合性検証 | 캐시 시작 시 무결성 검증
- ✅ 缓存启动时验证完整性
- ✅ Cache Verify Integrity On Start
- ✅ キャッシュ起動時整合性検証
- ✅ 캐시 시작 시 무결성 검증

### v120.8 进度条自定义比例最大 | Progress Bar Custom Scale Max | プログレスバーカスタムスケール最大 | 진행 바 사용자 정의 스케일 최대
- ✅ 进度条自定义比例最大
- ✅ Progress Bar Custom Scale Max
- ✅ プログレスバーカスタムスケール最大
- ✅ 진행 바 사용자 정의 스케일 최대

### v120.9 音量立体声宽度自定义 | Volume Stereo Width Custom | 音量ステレオ幅カスタム | 볼륨 스테레오 너비 사용자 정의
- ✅ 音量立体声宽度自定义
- ✅ Volume Stereo Width Custom
- ✅ 音量ステレオ幅カスタム
- ✅ 볼륨 스테레오 너비 사용자 정의

### v120.10 历史记录搜索整词 | History Search Whole Word | 履歴検索完全一致 | 기록 검색 전체 단어
- ✅ 历史记录搜索整词
- ✅ History Search Whole Word
- ✅ 履歴検索完全一致
- ✅ 기록 검색 전체 단어

### v120.11 播放速度自动调整画质 | Playback Speed Auto Adjust Quality | 再生速度自動調整画質 | 재생 속도 자동 조정 화질
- ✅ 播放速度自动调整画质
- ✅ Playback Speed Auto Adjust Quality
- ✅ 再生速度自動調整画質
- ✅ 재생 속도 자동 조정 화질

### v120.12 截图自动分享KakaoTalk | Screenshot Auto Share KakaoTalk | スクリーンショット自動KakaoTalk共有 | 스크린샷 자동 KakaoTalk 공유
- ✅ 截图自动分享KakaoTalk
- ✅ Screenshot Auto Share KakaoTalk
- ✅ スクリーンショット自動KakaoTalk共有
- ✅ 스크린샷 자동 KakaoTalk 공유

### v120.13 视频画中画透明度自定义 | Video PIP Opacity Custom | ビデオPIP透明度カスタム | 비디오 PIP 불투명도 사용자 정의
- ✅ 视频画中画透明度自定义
- ✅ Video PIP Opacity Custom
- ✅ ビデオPIP透明度カスタム
- ✅ 비디오 PIP 불투명도 사용자 정의

### v120.14 弹幕字体背景填充角度119 | Danmaku Font BG Fill Angle119 | コメントフォントBGフィル角度119 | 댓글 글꼴 배경 채우기 각도119
- ✅ 弹幕字体背景填充角度119
- ✅ Danmaku Font BG Fill Angle119
- ✅ コメントフォントBGフィル角度119
- ✅ 댓글 글꼴 배경 채우기 각도119

### v120.15 字幕动画延迟120 | Subtitle Animation Delay120 | 字幕アニメーション遅延120 | 자막 애니메이션 지연120
- ✅ 字幕动画延迟120
- ✅ Subtitle Animation Delay120
- ✅ 字幕アニメーション遅延120
- ✅ 자막 애니메이션 지연120


### v121.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v121.1-v121.15 功能列表
- ✅ Audio Ducking Ratio Custom, Danmaku Font BG Fill Angle120, Subtitle Animation Delay121, Gesture Tap Shift Action, Cast Video Flip Horizontal, Playlist Auto Resume Queue, Cache Smart Pinning Toggle, Progress Bar Custom Live Color, Volume Mono Downmix Toggle, History Search Scope121, Playback Speed Presets Custom, Screenshot Auto Share QQ, Video PIP Swipe Dismiss, Danmaku Font BG Fill Start Color, Subtitle Animation Fade In121

### v121.1 音频闪避比率自定义 | Audio Ducking Ratio Custom | オーディオダッキング比率カスタム | 오디오 덕킹 비율 사용자 정의
- ✅ 音频闪避比率自定义
- ✅ Audio Ducking Ratio Custom
- ✅ オーディオダッキング比率カスタム
- ✅ 오디오 덕킹 비율 사용자 정의

### v121.2 弹幕字体背景填充角度120 | Danmaku Font BG Fill Angle120 | コメントフォントBGフィル角度120 | 댓글 글꼴 배경 채우기 각도120
- ✅ 弹幕字体背景填充角度120
- ✅ Danmaku Font BG Fill Angle120
- ✅ コメントフォントBGフィル角度120
- ✅ 댓글 글꼴 배경 채우기 각도120

### v121.3 字幕动画延迟121 | Subtitle Animation Delay121 | 字幕アニメーション遅延121 | 자막 애니메이션 지연121
- ✅ 字幕动画延迟121
- ✅ Subtitle Animation Delay121
- ✅ 字幕アニメーション遅延121
- ✅ 자막 애니메이션 지연121

### v121.4 手势点击Shift动作 | Gesture Tap Shift Action | ジェスチャータップシフトアクション | 제스처 탭 시프트 동작
- ✅ 手势点击Shift动作
- ✅ Gesture Tap Shift Action
- ✅ ジェスチャータップシフトアクション
- ✅ 제스처 탭 시프트 동작

### v121.5 投射视频水平翻转 | Cast Video Flip Horizontal | キャストビデオ水平反転 | 캐스트 비디오 수평 뒤집기
- ✅ 投射视频水平翻转
- ✅ Cast Video Flip Horizontal
- ✅ キャストビデオ水平反転
- ✅ 캐스트 비디오 수평 뒤집기

### v121.6 播放列表自动恢复队列 | Playlist Auto Resume Queue | プレイリスト自動キュー再開 | 재생 목록 자동 큐 재개
- ✅ 播放列表自动恢复队列
- ✅ Playlist Auto Resume Queue
- ✅ プレイリスト自動キュー再開
- ✅ 재생 목록 자동 큐 재개

### v121.7 缓存智能固定开关 | Cache Smart Pinning Toggle | キャッシュスマートピンニング切替 | 캐시 스마트 고정 전환
- ✅ 缓存智能固定开关
- ✅ Cache Smart Pinning Toggle
- ✅ キャッシュスマートピンニング切替
- ✅ 캐시 스마트 고정 전환

### v121.8 进度条自定义直播颜色 | Progress Bar Custom Live Color | プログレスバーカスタムライブ色 | 진행 바 사용자 정의 라이브 색상
- ✅ 进度条自定义直播颜色
- ✅ Progress Bar Custom Live Color
- ✅ プログレスバーカスタムライブ色
- ✅ 진행 바 사용자 정의 라이브 색상

### v121.9 音量单声道下混开关 | Volume Mono Downmix Toggle | 音量モノダウンミックス切替 | 볼륨 모노 다운믹스 전환
- ✅ 音量单声道下混开关
- ✅ Volume Mono Downmix Toggle
- ✅ 音量モノダウンミックス切替
- ✅ 볼륨 모노 다운믹스 전환

### v121.10 历史记录搜索范围121 | History Search Scope121 | 履歴検索範囲121 | 기록 검색 범위121
- ✅ 历史记录搜索范围121
- ✅ History Search Scope121
- ✅ 履歴検索範囲121
- ✅ 기록 검색 범위121

### v121.11 播放速度预设自定义 | Playback Speed Presets Custom | 再生速度プリセットカスタム | 재생 속도 프리셋 사용자 정의
- ✅ 播放速度预设自定义
- ✅ Playback Speed Presets Custom
- ✅ 再生速度プリセットカスタム
- ✅ 재생 속도 프리셋 사용자 정의

### v121.12 截图自动分享QQ | Screenshot Auto Share QQ | スクリーンショット自動QQ共有 | 스크린샷 자동 QQ 공유
- ✅ 截图自动分享QQ
- ✅ Screenshot Auto Share QQ
- ✅ スクリーンショット自動QQ共有
- ✅ 스크린샷 자동 QQ 공유

### v121.13 视频画中画滑动关闭 | Video PIP Swipe Dismiss | ビデオPIPスワイプ閉じる | 비디오 PIP 스와이프 닫기
- ✅ 视频画中画滑动关闭
- ✅ Video PIP Swipe Dismiss
- ✅ ビデオPIPスワイプ閉じる
- ✅ 비디오 PIP 스와이프 닫기

### v121.14 弹幕字体背景填充起始颜色 | Danmaku Font BG Fill Start Color | コメントフォントBGフィル開始色 | 댓글 글꼴 배경 채우기 시작 색상
- ✅ 弹幕字体背景填充起始颜色
- ✅ Danmaku Font BG Fill Start Color
- ✅ コメントフォントBGフィル開始色
- ✅ 댓글 글꼴 배경 채우기 시작 색상

### v121.15 字幕动画淡入121 | Subtitle Animation Fade In121 | 字幕アニメーションフェードイン121 | 자막 애니메이션 페이드인121
- ✅ 字幕动画淡入121
- ✅ Subtitle Animation Fade In121
- ✅ 字幕アニメーションフェードイン121
- ✅ 자막 애니메이션 페이드인121

### v122.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v122.1-v122.15 功能列表
- ✅ Audio Fade In Duration122, Danmaku Font BG Fill End Color, Subtitle Animation Fade Out122, Gesture Tap Ctrl Action, Cast Video Flip Vertical, Playlist Auto Resume Last Position, Cache Smart Pinning Max Size, Progress Bar Custom Live Width, Volume Mono Downmix Balance, History Search Scope122, Playback Speed Presets List, Screenshot Auto Share WeChat, Video PIP Always On Top, Danmaku Font BG Fill Radius, Subtitle Animation Fade Out121

### v122.1 音频淡入时间122 | Audio Fade In Duration122 | オーディオフェードイン時間122 | 오디오 페이드인 시간122
- ✅ 音频淡入时间122
- ✅ Audio Fade In Duration122
- ✅ オーディオフェードイン時間122
- ✅ 오디오 페이드인 시간122

### v122.2 弹幕字体背景填充结束颜色 | Danmaku Font BG Fill End Color | コメントフォントBGフィル終了色 | 댓글 글꼴 배경 채우기 종료 색상
- ✅ 弹幕字体背景填充结束颜色
- ✅ Danmaku Font BG Fill End Color
- ✅ コメントフォントBGフィル終了色
- ✅ 댓글 글꼴 배경 채우기 종료 색상

### v122.3 字幕动画淡出122 | Subtitle Animation Fade Out122 | 字幕アニメーションフェードアウト122 | 자막 애니메이션 페이드아웃122
- ✅ 字幕动画淡出122
- ✅ Subtitle Animation Fade Out122
- ✅ 字幕アニメーションフェードアウト122
- ✅ 자막 애니메이션 페이드아웃122

### v122.4 手势点击Ctrl动作 | Gesture Tap Ctrl Action | ジェスチャータップCtrlアクション | 제스처 탭 Ctrl 동작
- ✅ 手势点击Ctrl动作
- ✅ Gesture Tap Ctrl Action
- ✅ ジェスチャータップCtrlアクション
- ✅ 제스처 탭 Ctrl 동작

### v122.5 投射视频垂直翻转 | Cast Video Flip Vertical | キャストビデオ垂直反転 | 캐스트 비디오 수직 뒤집기
- ✅ 投射视频垂直翻转
- ✅ Cast Video Flip Vertical
- ✅ キャストビデオ垂直反転
- ✅ 캐스트 비디오 수직 뒤집기

### v122.6 播放列表自动恢复上次位置 | Playlist Auto Resume Last Position | プレイリスト自動前回位置再開 | 재생 목록 자동 이전 위치 재개
- ✅ 播放列表自动恢复上次位置
- ✅ Playlist Auto Resume Last Position
- ✅ プレイリスト自動前回位置再開
- ✅ 재생 목록 자동 이전 위치 재개

### v122.7 缓存智能固定最大大小 | Cache Smart Pinning Max Size | キャッシュスマートピンニング最大サイズ | 캐시 스마트 고정 최대 크기
- ✅ 缓存智能固定最大大小
- ✅ Cache Smart Pinning Max Size
- ✅ キャッシュスマートピンニング最大サイズ
- ✅ 캐시 스마트 고정 최대 크기

### v122.8 进度条自定义直播宽度 | Progress Bar Custom Live Width | プログレスバーカスタムライブ幅 | 진행 바 사용자 정의 라이브 너비
- ✅ 进度条自定义直播宽度
- ✅ Progress Bar Custom Live Width
- ✅ プログレスバーカスタムライブ幅
- ✅ 진행 바 사용자 정의 라이브 너비

### v122.9 音量单声道下混平衡 | Volume Mono Downmix Balance | 音量モノダウンミックスバランス | 볼륨 모노 다운믹스 밸런스
- ✅ 音量单声道下混平衡
- ✅ Volume Mono Downmix Balance
- ✅ 音量モノダウンミックスバランス
- ✅ 볼륨 모노 다운믹스 밸런스

### v122.10 历史记录搜索范围122 | History Search Scope122 | 履歴検索範囲122 | 기록 검색 범위122
- ✅ 历史记录搜索范围122
- ✅ History Search Scope122
- ✅ 履歴検索範囲122
- ✅ 기록 검색 범위122

### v122.11 播放速度预设列表 | Playback Speed Presets List | 再生速度プリセットリスト | 재생 속도 프리셋 목록
- ✅ 播放速度预设列表
- ✅ Playback Speed Presets List
- ✅ 再生速度プリセットリスト
- ✅ 재생 속도 프리셋 목록

### v122.12 截图自动分享微信 | Screenshot Auto Share WeChat | スクリーンショット自動WeChat共有 | 스크린샷 자동 WeChat 공유
- ✅ 截图自动分享微信
- ✅ Screenshot Auto Share WeChat
- ✅ スクリーンショット自動WeChat共有
- ✅ 스크린샷 자동 WeChat 공유

### v122.13 视频画中画总在最前 | Video PIP Always On Top | ビデオPIP常に最前面 | 비디오 PIP 항상 위
- ✅ 视频画中画总在最前
- ✅ Video PIP Always On Top
- ✅ ビデオPIP常に最前面
- ✅ 비디오 PIP 항상 위

### v122.14 弹幕字体背景填充半径 | Danmaku Font BG Fill Radius | コメントフォントBGフィル半径 | 댓글 글꼴 배경 채우기 반경
- ✅ 弹幕字体背景填充半径
- ✅ Danmaku Font BG Fill Radius
- ✅ コメントフォントBGフィル半径
- ✅ 댓글 글꼴 배경 채우기 반경

### v122.15 字幕动画淡出121 | Subtitle Animation Fade Out121 | 字幕アニメーションフェードアウト121 | 자막 애니메이션 페이드아웃121
- ✅ 字幕动画淡出121
- ✅ Subtitle Animation Fade Out121
- ✅ 字幕アニメーションフェードアウト121
- ✅ 자막 애니메이션 페이드아웃121

### v123.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v123.1-v123.15 功能列表
- ✅ Audio Fade Out Duration123, Danmaku Font BG Fill Opacity120, Subtitle Animation Fade In123, Gesture Tap Alt Action, Cast Video Rotate Custom, Playlist Auto Sort By Length, Cache Smart Pinning Expire, Progress Bar Custom Live Height, Volume Headroom Custom, History Auto Clean123, Playback Speed Presets Custom123, Screenshot Auto Share Douyin, Video PIP Resize Handle, Danmaku Font BG Fill Border Toggle, Subtitle Animation Fade Out123

### v123.1 音频淡出时间123 | Audio Fade Out Duration123 | オーディオフェードアウト時間123 | 오디오 페이드아웃 시간123
- ✅ 音频淡出时间123
- ✅ Audio Fade Out Duration123
- ✅ オーディオフェードアウト時間123
- ✅ 오디오 페이드아웃 시간123

### v123.2 弹幕字体背景填充透明度120 | Danmaku Font BG Fill Opacity120 | コメントフォントBGフィル透明度120 | 댓글 글꼴 배경 채우기 불투명도120
- ✅ 弹幕字体背景填充透明度120
- ✅ Danmaku Font BG Fill Opacity120
- ✅ コメントフォントBGフィル透明度120
- ✅ 댓글 글꼴 배경 채우기 불투명도120

### v123.3 字幕动画淡入123 | Subtitle Animation Fade In123 | 字幕アニメーションフェードイン123 | 자막 애니메이션 페이드인123
- ✅ 字幕动画淡入123
- ✅ Subtitle Animation Fade In123
- ✅ 字幕アニメーションフェードイン123
- ✅ 자막 애니메이션 페이드인123

### v123.4 手势点击Alt动作 | Gesture Tap Alt Action | ジェスチャータップAltアクション | 제스처 탭 Alt 동작
- ✅ 手势点击Alt动作
- ✅ Gesture Tap Alt Action
- ✅ ジェスチャータップAltアクション
- ✅ 제스처 탭 Alt 동작

### v123.5 投射视频旋转自定义 | Cast Video Rotate Custom | キャストビデオ回転カスタム | 캐스트 비디오 회전 사용자 정의
- ✅ 投射视频旋转自定义
- ✅ Cast Video Rotate Custom
- ✅ キャストビデオ回転カスタム
- ✅ 캐스트 비디오 회전 사용자 정의

### v123.6 播放列表按长度排序 | Playlist Auto Sort By Length | プレイリスト長さ順ソート | 재생 목록 길이순 정렬
- ✅ 播放列表按长度排序
- ✅ Playlist Auto Sort By Length
- ✅ プレイリスト長さ順ソート
- ✅ 재생 목록 길이순 정렬

### v123.7 缓存智能固定过期 | Cache Smart Pinning Expire | キャッシュスマートピンニング期限切れ | 캐시 스마트 고정 만료
- ✅ 缓存智能固定过期
- ✅ Cache Smart Pinning Expire
- ✅ キャッシュスマートピンニング期限切れ
- ✅ 캐시 스마트 고정 만료

### v123.8 进度条自定义直播高度 | Progress Bar Custom Live Height | プログレスバーカスタムライブ高さ | 진행 바 사용자 정의 라이브 높이
- ✅ 进度条自定义直播高度
- ✅ Progress Bar Custom Live Height
- ✅ プログレスバーカスタムライブ高さ
- ✅ 진행 바 사용자 정의 라이브 높이

### v123.9 音量净空自定义 | Volume Headroom Custom | 音量ヘッドルームカスタム | 볼륨 헤드룸 사용자 정의
- ✅ 音量净空自定义
- ✅ Volume Headroom Custom
- ✅ 音量ヘッドルームカスタム
- ✅ 볼륨 헤드룸 사용자 정의

### v123.10 历史记录自动清理123 | History Auto Clean123 | 履歴自動クリーンアップ123 | 기록 자동 정리123
- ✅ 历史记录自动清理123
- ✅ History Auto Clean123
- ✅ 履歴自動クリーンアップ123
- ✅ 기록 자동 정리123

### v123.11 播放速度预设自定义123 | Playback Speed Presets Custom123 | 再生速度プリセットカスタム123 | 재생 속도 프리셋 사용자 정의123
- ✅ 播放速度预设自定义123
- ✅ Playback Speed Presets Custom123
- ✅ 再生速度プリセットカスタム123
- ✅ 재생 속도 프리셋 사용자 정의123

### v123.12 截图自动分享抖音 | Screenshot Auto Share Douyin | スクリーンショット自動Douyin共有 | 스크린샷 자동 Douyin 공유
- ✅ 截图自动分享抖音
- ✅ Screenshot Auto Share Douyin
- ✅ スクリーンショット自動Douyin共有
- ✅ 스크린샷 자동 Douyin 공유

### v123.13 视频画中画调整大小手柄 | Video PIP Resize Handle | ビデオPIPリサイズハンドル | 비디오 PIP 크기 조절 핸들
- ✅ 视频画中画调整大小手柄
- ✅ Video PIP Resize Handle
- ✅ ビデオPIPリサイズハンドル
- ✅ 비디오 PIP 크기 조절 핸들

### v123.14 弹幕字体背景填充边框开关 | Danmaku Font BG Fill Border Toggle | コメントフォントBGフィルボーダー切替 | 댓글 글꼴 배경 채우기 테두리 전환
- ✅ 弹幕字体背景填充边框开关
- ✅ Danmaku Font BG Fill Border Toggle
- ✅ コメントフォントBGフィルボーダー切替
- ✅ 댓글 글꼴 배경 채우기 테두리 전환

### v123.15 字幕动画淡出123 | Subtitle Animation Fade Out123 | 字幕アニメーションフェードアウト123 | 자막 애니메이션 페이드아웃123
- ✅ 字幕动画淡出123
- ✅ Subtitle Animation Fade Out123
- ✅ 字幕アニメーションフェードアウト123
- ✅ 자막 애니메이션 페이드아웃123

### v124.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v124.1-v124.15 功能列表
- ✅ Audio Reverb Preset Custom, Danmaku Font BG Fill Border Width, Subtitle Animation Scale124, Gesture Tap Shift Ctrl Action, Cast Video Crop Custom, Playlist Auto Sort By Title, Cache Smart Pinning Priority, Progress Bar Custom Thumb Color124, Volume Replay Gain Album, History Auto Clean124, Playback Speed Presets Toggle, Screenshot Auto Share TikTok, Video PIP Keyboard Control, Danmaku Font BG Fill Border Color, Subtitle Animation Scale125

### v124.1 音频混响预设自定义 | Audio Reverb Preset Custom | オーディオリバーブプリセットカスタム | 오디오 리버브 프리셋 사용자 정의
- ✅ 音频混响预设自定义
- ✅ Audio Reverb Preset Custom
- ✅ オーディオリバーブプリセットカスタム
- ✅ 오디오 리버브 프리셋 사용자 정의

### v124.2 弹幕字体背景填充边框宽度 | Danmaku Font BG Fill Border Width | コメントフォントBGフィルボーダー幅 | 댓글 글꼴 배경 채우기 테두리 너비
- ✅ 弹幕字体背景填充边框宽度
- ✅ Danmaku Font BG Fill Border Width
- ✅ コメントフォントBGフィルボーダー幅
- ✅ 댓글 글꼴 배경 채우기 테두리 너비

### v124.3 字幕动画缩放124 | Subtitle Animation Scale124 | 字幕アニメーションスケール124 | 자막 애니메이션 스케일124
- ✅ 字幕动画缩放124
- ✅ Subtitle Animation Scale124
- ✅ 字幕アニメーションスケール124
- ✅ 자막 애니메이션 스케일124

### v124.4 手势点击Shift Ctrl动作 | Gesture Tap Shift Ctrl Action | ジェスチャータップシフトCtrlアクション | 제스처 탭 시프트 Ctrl 동작
- ✅ 手势点击Shift Ctrl动作
- ✅ Gesture Tap Shift Ctrl Action
- ✅ ジェスチャータップシフトCtrlアクション
- ✅ 제스처 탭 시프트 Ctrl 동작

### v124.5 投射视频裁剪自定义 | Cast Video Crop Custom | キャストビデオクロップカスタム | 캐스트 비디오 크롭 사용자 정의
- ✅ 投射视频裁剪自定义
- ✅ Cast Video Crop Custom
- ✅ キャストビデオクロップカスタム
- ✅ 캐스트 비디오 크롭 사용자 정의

### v124.6 播放列表按标题排序 | Playlist Auto Sort By Title | プレイリストタイトル順ソート | 재생 목록 제목순 정렬
- ✅ 播放列表按标题排序
- ✅ Playlist Auto Sort By Title
- ✅ プレイリストタイトル順ソート
- ✅ 재생 목록 제목순 정렬

### v124.7 缓存智能固定优先级 | Cache Smart Pinning Priority | キャッシュスマートピンニング優先度 | 캐시 스마트 고정 우선순위
- ✅ 缓存智能固定优先级
- ✅ Cache Smart Pinning Priority
- ✅ キャッシュスマートピンニング優先度
- ✅ 캐시 스마트 고정 우선순위

### v124.8 进度条自定义滑块颜色124 | Progress Bar Custom Thumb Color124 | プログレスバーカスタムサム色124 | 진행 바 사용자 정의 썸 색상124
- ✅ 进度条自定义滑块颜色124
- ✅ Progress Bar Custom Thumb Color124
- ✅ プログレスバーカスタムサム色124
- ✅ 진행 바 사용자 정의 썸 색상124

### v124.9 音量回放增益专辑 | Volume Replay Gain Album | 音量リプレイゲインアルバム | 볼륨 리플레이 게인 앨범
- ✅ 音量回放增益专辑
- ✅ Volume Replay Gain Album
- ✅ 音量リプレイゲインアルバム
- ✅ 볼륨 리플레이 게인 앨범

### v124.10 历史记录自动清理124 | History Auto Clean124 | 履歴自動クリーンアップ124 | 기록 자동 정리124
- ✅ 历史记录自动清理124
- ✅ History Auto Clean124
- ✅ 履歴自動クリーンアップ124
- ✅ 기록 자동 정리124

### v124.11 播放速度预设开关 | Playback Speed Presets Toggle | 再生速度プリセット切替 | 재생 속도 프리셋 전환
- ✅ 播放速度预设开关
- ✅ Playback Speed Presets Toggle
- ✅ 再生速度プリセット切替
- ✅ 재생 속도 프리셋 전환

### v124.12 截图自动分享TikTok | Screenshot Auto Share TikTok | スクリーンショット自動TikTok共有 | 스크린샷 자동 TikTok 공유
- ✅ 截图自动分享TikTok
- ✅ Screenshot Auto Share TikTok
- ✅ スクリーンショット自動TikTok共有
- ✅ 스크린샷 자동 TikTok 공유

### v124.13 视频画中画键盘控制 | Video PIP Keyboard Control | ビデオPIPキーボード制御 | 비디오 PIP 키보드 제어
- ✅ 视频画中画键盘控制
- ✅ Video PIP Keyboard Control
- ✅ ビデオPIPキーボード制御
- ✅ 비디오 PIP 키보드 제어

### v124.14 弹幕字体背景填充边框颜色 | Danmaku Font BG Fill Border Color | コメントフォントBGフィルボーダー色 | 댓글 글꼴 배경 채우기 테두리 색상
- ✅ 弹幕字体背景填充边框颜色
- ✅ Danmaku Font BG Fill Border Color
- ✅ コメントフォントBGフィルボーダー色
- ✅ 댓글 글꼴 배경 채우기 테두리 색상

### v124.15 字幕动画缩放125 | Subtitle Animation Scale125 | 字幕アニメーションスケール125 | 자막 애니메이션 스케일125
- ✅ 字幕动画缩放125
- ✅ Subtitle Animation Scale125
- ✅ 字幕アニメーションスケール125
- ✅ 자막 애니메이션 스케일125

### v125.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v125.1-v125.15 功能列表
- ✅ Audio Reverb Room Size, Danmaku Font BG Fill Border Radius, Subtitle Animation Translate125, Gesture Tap Shift Alt Action, Cast Video Scale Custom, Playlist Auto Sort By Upload Date, Cache Smart Pinning Refresh, Progress Bar Custom Thumb Shape125, Volume Replay Gain Track, History Auto Clean125, Playback Speed Presets Range, Screenshot Auto Share Snapchat, Video PIP Auto Hide Delay, Danmaku Font BG Fill Border Opacity, Subtitle Animation Rotate125

### v125.1 音频混响房间大小 | Audio Reverb Room Size | オーディオリバーブルームサイズ | 오디오 리버브 룸 크기
- ✅ 音频混响房间大小
- ✅ Audio Reverb Room Size
- ✅ オーディオリバーブルームサイズ
- ✅ 오디오 리버브 룸 크기

### v125.2 弹幕字体背景填充边框圆角 | Danmaku Font BG Fill Border Radius | コメントフォントBGフィルボーダー角丸 | 댓글 글꼴 배경 채우기 테두리 반경
- ✅ 弹幕字体背景填充边框圆角
- ✅ Danmaku Font BG Fill Border Radius
- ✅ コメントフォントBGフィルボーダー角丸
- ✅ 댓글 글꼴 배경 채우기 테두리 반경

### v125.3 字幕动画平移125 | Subtitle Animation Translate125 | 字幕アニメーショントランスレート125 | 자막 애니메이션 이동125
- ✅ 字幕动画平移125
- ✅ Subtitle Animation Translate125
- ✅ 字幕アニメーショントランスレート125
- ✅ 자막 애니메이션 이동125

### v125.4 手势点击Shift Alt动作 | Gesture Tap Shift Alt Action | ジェスチャータップシフトAltアクション | 제스처 탭 시프트 Alt 동작
- ✅ 手势点击Shift Alt动作
- ✅ Gesture Tap Shift Alt Action
- ✅ ジェスチャータップシフトAltアクション
- ✅ 제스처 탭 시프트 Alt 동작

### v125.5 投射视频缩放自定义 | Cast Video Scale Custom | キャストビデオスケールカスタム | 캐스트 비디오 스케일 사용자 정의
- ✅ 投射视频缩放自定义
- ✅ Cast Video Scale Custom
- ✅ キャストビデオスケールカスタム
- ✅ 캐스트 비디오 스케일 사용자 정의

### v125.6 播放列表按上传日期排序 | Playlist Auto Sort By Upload Date | プレイリストアップロード日順ソート | 재생 목록 업로드 날짜순 정렬
- ✅ 播放列表按上传日期排序
- ✅ Playlist Auto Sort By Upload Date
- ✅ プレイリストアップロード日順ソート
- ✅ 재생 목록 업로드 날짜순 정렬

### v125.7 缓存智能固定刷新 | Cache Smart Pinning Refresh | キャッシュスマートピンニング更新 | 캐시 스마트 고정 새로고침
- ✅ 缓存智能固定刷新
- ✅ Cache Smart Pinning Refresh
- ✅ キャッシュスマートピンニング更新
- ✅ 캐시 스마트 고정 새로고침

### v125.8 进度条自定义滑块形状125 | Progress Bar Custom Thumb Shape125 | プログレスバーカスタムサム形状125 | 진행 바 사용자 정의 썸 모양125
- ✅ 进度条自定义滑块形状125
- ✅ Progress Bar Custom Thumb Shape125
- ✅ プログレスバーカスタムサム形状125
- ✅ 진행 바 사용자 정의 썸 모양125

### v125.9 音量回放增益单曲 | Volume Replay Gain Track | 音量リプレイゲイントラック | 볼륨 리플레이 게인 트랙
- ✅ 音量回放增益单曲
- ✅ Volume Replay Gain Track
- ✅ 音量リプレイゲイントラック
- ✅ 볼륨 리플레이 게인 트랙

### v125.10 历史记录自动清理125 | History Auto Clean125 | 履歴自動クリーンアップ125 | 기록 자동 정리125
- ✅ 历史记录自动清理125
- ✅ History Auto Clean125
- ✅ 履歴自動クリーンアップ125
- ✅ 기록 자동 정리125

### v125.11 播放速度预设范围 | Playback Speed Presets Range | 再生速度プリセット範囲 | 재생 속도 프리셋 범위
- ✅ 播放速度预设范围
- ✅ Playback Speed Presets Range
- ✅ 再生速度プリセット範囲
- ✅ 재생 속도 프리셋 범위

### v125.12 截图自动分享Snapchat | Screenshot Auto Share Snapchat | スクリーンショット自動Snapchat共有 | 스크린샷 자동 Snapchat 공유
- ✅ 截图自动分享Snapchat
- ✅ Screenshot Auto Share Snapchat
- ✅ スクリーンショット自動Snapchat共有
- ✅ 스크린샷 자동 Snapchat 공유

### v125.13 视频画中画自动隐藏延迟 | Video PIP Auto Hide Delay | ビデオPIP自動非表示遅延 | 비디오 PIP 자동 숨기기 지연
- ✅ 视频画中画自动隐藏延迟
- ✅ Video PIP Auto Hide Delay
- ✅ ビデオPIP自動非表示遅延
- ✅ 비디오 PIP 자동 숨기기 지연

### v125.14 弹幕字体背景填充边框透明度 | Danmaku Font BG Fill Border Opacity | コメントフォントBGフィルボーダー透明度 | 댓글 글꼴 배경 채우기 테두리 불투명도
- ✅ 弹幕字体背景填充边框透明度
- ✅ Danmaku Font BG Fill Border Opacity
- ✅ コメントフォントBGフィルボーダー透明度
- ✅ 댓글 글꼴 배경 채우기 테두리 불투명도

### v125.15 字幕动画旋转125 | Subtitle Animation Rotate125 | 字幕アニメーションローテート125 | 자막 애니메이션 회전125
- ✅ 字幕动画旋转125
- ✅ Subtitle Animation Rotate125
- ✅ 字幕アニメーションローテート125
- ✅ 자막 애니메이션 회전125

### v126.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v126.1-v126.15 功能列表
- ✅ Audio Reverb Damping, Danmaku Font BG Fill Border Dash Toggle, Subtitle Animation Rotate126, Gesture Tap Ctrl Alt Action, Cast Video Mirror Flip, Playlist Auto Sort By Random, Cache Smart Pinning On Low Space, Progress Bar Custom Thumb Glow126, Volume Replay Gain Preamp, History Auto Clean126, Playback Speed Presets Label, Screenshot Auto Share Reddit, Video PIP Follow Scroll, Danmaku Font BG Fill Border Dash Width, Subtitle Animation Translate126

### v126.1 音频混响阻尼 | Audio Reverb Damping | オーディオリバーブダンピング | 오디오 리버브 댐핑
- ✅ 音频混响阻尼
- ✅ Audio Reverb Damping
- ✅ オーディオリバーブダンピング
- ✅ 오디오 리버브 댐핑

### v126.2 弹幕字体背景填充边框虚线开关 | Danmaku Font BG Fill Border Dash Toggle | コメントフォントBGフィルボーダーダッシュ切替 | 댓글 글꼴 배경 채우기 테두리 점선 전환
- ✅ 弹幕字体背景填充边框虚线开关
- ✅ Danmaku Font BG Fill Border Dash Toggle
- ✅ コメントフォントBGフィルボーダーダッシュ切替
- ✅ 댓글 글꼴 배경 채우기 테두리 점선 전환

### v126.3 字幕动画旋转126 | Subtitle Animation Rotate126 | 字幕アニメーションローテート126 | 자막 애니메이션 회전126
- ✅ 字幕动画旋转126
- ✅ Subtitle Animation Rotate126
- ✅ 字幕アニメーションローテート126
- ✅ 자막 애니메이션 회전126

### v126.4 手势点击Ctrl Alt动作 | Gesture Tap Ctrl Alt Action | ジェスチャータップCtrl Altアクション | 제스처 탭 Ctrl Alt 동작
- ✅ 手势点击Ctrl Alt动作
- ✅ Gesture Tap Ctrl Alt Action
- ✅ ジェスチャータップCtrl Altアクション
- ✅ 제스처 탭 Ctrl Alt 동작

### v126.5 投射视频镜像翻转 | Cast Video Mirror Flip | キャストビデオミラーフリップ | 캐스트 비디오 미러 플립
- ✅ 投射视频镜像翻转
- ✅ Cast Video Mirror Flip
- ✅ キャストビデオミラーフリップ
- ✅ 캐스트 비디오 미러 플립

### v126.6 播放列表随机排序 | Playlist Auto Sort By Random | プレイリストランダムソート | 재생 목록 무작위 정렬
- ✅ 播放列表随机排序
- ✅ Playlist Auto Sort By Random
- ✅ プレイリストランダムソート
- ✅ 재생 목록 무작위 정렬

### v126.7 缓存低空间时智能固定 | Cache Smart Pinning On Low Space | キャッシュ低容量時スマートピンニング | 캐시 저용량 시 스마트 고정
- ✅ 缓存低空间时智能固定
- ✅ Cache Smart Pinning On Low Space
- ✅ キャッシュ低容量時スマートピンニング
- ✅ 캐시 저용량 시 스마트 고정

### v126.8 进度条自定义滑块发光126 | Progress Bar Custom Thumb Glow126 | プログレスバーカスタムサムグロウ126 | 진행 바 사용자 정의 썸 글로우126
- ✅ 进度条自定义滑块发光126
- ✅ Progress Bar Custom Thumb Glow126
- ✅ プログレスバーカスタムサムグロウ126
- ✅ 진행 바 사용자 정의 썸 글로우126

### v126.9 音量回放增益前置放大 | Volume Replay Gain Preamp | 音量リプレイゲインプリアンプ | 볼륨 리플레이 게인 프리앰프
- ✅ 音量回放增益前置放大
- ✅ Volume Replay Gain Preamp
- ✅ 音量リプレイゲインプリアンプ
- ✅ 볼륨 리플레이 게인 프리앰프

### v126.10 历史记录自动清理126 | History Auto Clean126 | 履歴自動クリーンアップ126 | 기록 자동 정리126
- ✅ 历史记录自动清理126
- ✅ History Auto Clean126
- ✅ 履歴自動クリーンアップ126
- ✅ 기록 자동 정리126

### v126.11 播放速度预设标签 | Playback Speed Presets Label | 再生速度プリセットラベル | 재생 속도 프리셋 라벨
- ✅ 播放速度预设标签
- ✅ Playback Speed Presets Label
- ✅ 再生速度プリセットラベル
- ✅ 재생 속도 프리셋 라벨

### v126.12 截图自动分享Reddit | Screenshot Auto Share Reddit | スクリーンショット自動Reddit共有 | 스크린샷 자동 Reddit 공유
- ✅ 截图自动分享Reddit
- ✅ Screenshot Auto Share Reddit
- ✅ スクリーンショット自動Reddit共有
- ✅ 스크린샷 자동 Reddit 공유

### v126.13 视频画中画跟随滚动 | Video PIP Follow Scroll | ビデオPIPスクロール追従 | 비디오 PIP 스크롤 팔로우
- ✅ 视频画中画跟随滚动
- ✅ Video PIP Follow Scroll
- ✅ ビデオPIPスクロール追従
- ✅ 비디오 PIP 스크롤 팔로우

### v126.14 弹幕字体背景填充边框虚线宽度 | Danmaku Font BG Fill Border Dash Width | コメントフォントBGフィルボーダーダッシュ幅 | 댓글 글꼴 배경 채우기 테두리 점선 너비
- ✅ 弹幕字体背景填充边框虚线宽度
- ✅ Danmaku Font BG Fill Border Dash Width
- ✅ コメントフォントBGフィルボーダーダッシュ幅
- ✅ 댓글 글꼴 배경 채우기 테두리 점선 너비

### v126.15 字幕动画平移126 | Subtitle Animation Translate126 | 字幕アニメーショントランスレート126 | 자막 애니메이션 이동126
- ✅ 字幕动画平移126
- ✅ Subtitle Animation Translate126
- ✅ 字幕アニメーショントランスレート126
- ✅ 자막 애니메이션 이동126

### v127.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v127.1-v127.15 功能列表
- ✅ Audio Reverb Wet Dry Mix, Danmaku Font BG Fill Border Dash Gap, Subtitle Animation Blur127, Gesture Tap Multi Finger Action, Cast Video Zoom Custom, Playlist Auto Group By Similarity, Cache Smart Pinning Alert, Progress Bar Custom Thumb Shadow127, Volume Replay Gain Clip Protect, History Auto Clean127, Playback Speed Presets Adaptive, Screenshot Auto Share VK, Video PIP Snap To Edge, Danmaku Font BG Fill Border Type, Subtitle Animation Blur128

### v127.1 音频混响干湿混合 | Audio Reverb Wet Dry Mix | オーディオリバーブウェットドライミックス | 오디오 리버브 웨트 드라이 믹스
- ✅ 音频混响干湿混合
- ✅ Audio Reverb Wet Dry Mix
- ✅ オーディオリバーブウェットドライミックス
- ✅ 오디오 리버브 웨트 드라이 믹스

### v127.2 弹幕字体背景填充边框虚线间距 | Danmaku Font BG Fill Border Dash Gap | コメントフォントBGフィルボーダーダッシュギャップ | 댓글 글꼴 배경 채우기 테두리 점선 간격
- ✅ 弹幕字体背景填充边框虚线间距
- ✅ Danmaku Font BG Fill Border Dash Gap
- ✅ コメントフォントBGフィルボーダーダッシュギャップ
- ✅ 댓글 글꼴 배경 채우기 테두리 점선 간격

### v127.3 字幕动画模糊127 | Subtitle Animation Blur127 | 字幕アニメーションブラー127 | 자막 애니메이션 블러127
- ✅ 字幕动画模糊127
- ✅ Subtitle Animation Blur127
- ✅ 字幕アニメーションブラー127
- ✅ 자막 애니메이션 블러127

### v127.4 手势点击多指动作 | Gesture Tap Multi Finger Action | ジェスチャータップマルチフィンガーアクション | 제스처 탭 다중 손가락 동작
- ✅ 手势点击多指动作
- ✅ Gesture Tap Multi Finger Action
- ✅ ジェスチャータップマルチフィンガーアクション
- ✅ 제스처 탭 다중 손가락 동작

### v127.5 投射视频缩放自定义 | Cast Video Zoom Custom | キャストビデオズームカスタム | 캐스트 비디오 줌 사용자 정의
- ✅ 投射视频缩放自定义
- ✅ Cast Video Zoom Custom
- ✅ キャストビデオズームカスタム
- ✅ 캐스트 비디오 줌 사용자 정의

### v127.6 播放列表按相似度分组 | Playlist Auto Group By Similarity | プレイリスト類似性別グループ化 | 재생 목록 유사도별 그룹화
- ✅ 播放列表按相似度分组
- ✅ Playlist Auto Group By Similarity
- ✅ プレイリスト類似性別グループ化
- ✅ 재생 목록 유사도별 그룹화

### v127.7 缓存智能固定提醒 | Cache Smart Pinning Alert | キャッシュスマートピンニングアラート | 캐시 스마트 고정 알림
- ✅ 缓存智能固定提醒
- ✅ Cache Smart Pinning Alert
- ✅ キャッシュスマートピンニングアラート
- ✅ 캐시 스마트 고정 알림

### v127.8 进度条自定义滑块阴影127 | Progress Bar Custom Thumb Shadow127 | プログレスバーカスタムサムシャドウ127 | 진행 바 사용자 정의 썸 그림자127
- ✅ 进度条自定义滑块阴影127
- ✅ Progress Bar Custom Thumb Shadow127
- ✅ プログレスバーカスタムサムシャドウ127
- ✅ 진행 바 사용자 정의 썸 그림자127

### v127.9 音量回放增益削波保护 | Volume Replay Gain Clip Protect | 音量リプレイゲインクリッププロテクト | 볼륨 리플레이 게인 클립 보호
- ✅ 音量回放增益削波保护
- ✅ Volume Replay Gain Clip Protect
- ✅ 音量リプレイゲインクリッププロテクト
- ✅ 볼륨 리플레이 게인 클립 보호

### v127.10 历史记录自动清理127 | History Auto Clean127 | 履歴自動クリーンアップ127 | 기록 자동 정리127
- ✅ 历史记录自动清理127
- ✅ History Auto Clean127
- ✅ 履歴自動クリーンアップ127
- ✅ 기록 자동 정리127

### v127.11 播放速度预设自适应 | Playback Speed Presets Adaptive | 再生速度プリセットアダプティブ | 재생 속도 프리셋 적응형
- ✅ 播放速度预设自适应
- ✅ Playback Speed Presets Adaptive
- ✅ 再生速度プリセットアダプティブ
- ✅ 재생 속도 프리셋 적응형

### v127.12 截图自动分享VK | Screenshot Auto Share VK | スクリーンショット自動VK共有 | 스크린샷 자동 VK 공유
- ✅ 截图自动分享VK
- ✅ Screenshot Auto Share VK
- ✅ スクリーンショット自動VK共有
- ✅ 스크린샷 자동 VK 공유

### v127.13 视频画中画吸附边缘 | Video PIP Snap To Edge | ビデオPIPエッジにスナップ | 비디오 PIP 가장자리에 스냅
- ✅ 视频画中画吸附边缘
- ✅ Video PIP Snap To Edge
- ✅ ビデオPIPエッジにスナップ
- ✅ 비디오 PIP 가장자리에 스냅

### v127.14 弹幕字体背景填充边框类型 | Danmaku Font BG Fill Border Type | コメントフォントBGフィルボーダータイプ | 댓글 글꼴 배경 채우기 테두리 유형
- ✅ 弹幕字体背景填充边框类型
- ✅ Danmaku Font BG Fill Border Type
- ✅ コメントフォントBGフィルボーダータイプ
- ✅ 댓글 글꼴 배경 채우기 테두리 유형

### v127.15 字幕动画模糊128 | Subtitle Animation Blur128 | 字幕アニメーションブラー128 | 자막 애니메이션 블러128
- ✅ 字幕动画模糊128
- ✅ Subtitle Animation Blur128
- ✅ 字幕アニメーションブラー128
- ✅ 자막 애니메이션 블러128

### v128.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v128.1-v128.15 功能列表
- ✅ Audio Reverb Pre Delay, Danmaku Font BG Fill Border Type127, Subtitle Animation Blur129, Gesture Tap Finger Count, Cast Video PIP Mode, Playlist Auto Group By Topic, Cache Smart Pinning On Wifi, Progress Bar Custom Thumb Border128, Volume Normalize Per Track, History Auto Clean128, Playback Speed Presets Display, Screenshot Auto Share Telegram Channel, Video PIP Minimize To Notification, Danmaku Font BG Fill Border Join, Subtitle Animation Translate128

### v128.1 音频混响预延迟 | Audio Reverb Pre Delay | オーディオリバーブプリディレイ | 오디오 리버브 프리 딜레이
- ✅ 音频混响预延迟
- ✅ Audio Reverb Pre Delay
- ✅ オーディオリバーブプリディレイ
- ✅ 오디오 리버브 프리 딜레이

### v128.2 弹幕字体背景填充边框类型127 | Danmaku Font BG Fill Border Type127 | コメントフォントBGフィルボーダータイプ127 | 댓글 글꼴 배경 채우기 테두리 유형127
- ✅ 弹幕字体背景填充边框类型127
- ✅ Danmaku Font BG Fill Border Type127
- ✅ コメントフォントBGフィルボーダータイプ127
- ✅ 댓글 글꼴 배경 채우기 테두리 유형127

### v128.3 字幕动画模糊129 | Subtitle Animation Blur129 | 字幕アニメーションブラー129 | 자막 애니메이션 블러129
- ✅ 字幕动画模糊129
- ✅ Subtitle Animation Blur129
- ✅ 字幕アニメーションブラー129
- ✅ 자막 애니메이션 블러129

### v128.4 手势点击手指数 | Gesture Tap Finger Count | ジェスチャータップ指の数 | 제스처 탭 손가락 수
- ✅ 手势点击手指数
- ✅ Gesture Tap Finger Count
- ✅ ジェスチャータップ指の数
- ✅ 제스처 탭 손가락 수

### v128.5 投射视频画中画模式 | Cast Video PIP Mode | キャストビデオPIPモード | 캐스트 비디오 PIP 모드
- ✅ 投射视频画中画模式
- ✅ Cast Video PIP Mode
- ✅ キャストビデオPIPモード
- ✅ 캐스트 비디오 PIP 모드

### v128.6 播放列表按话题分组 | Playlist Auto Group By Topic | プレイリストトピック別グループ化 | 재생 목록 주제별 그룹화
- ✅ 播放列表按话题分组
- ✅ Playlist Auto Group By Topic
- ✅ プレイリストトピック別グループ化
- ✅ 재생 목록 주제별 그룹화

### v128.7 缓存WiFi时智能固定 | Cache Smart Pinning On Wifi | キャッシュWiFi時スマートピンニング | 캐시 WiFi 시 스마트 고정
- ✅ 缓存WiFi时智能固定
- ✅ Cache Smart Pinning On Wifi
- ✅ キャッシュWiFi時スマートピンニング
- ✅ 캐시 WiFi 시 스마트 고정

### v128.8 进度条自定义滑块边框128 | Progress Bar Custom Thumb Border128 | プログレスバーカスタムサムボーダー128 | 진행 바 사용자 정의 썸 테두리128
- ✅ 进度条自定义滑块边框128
- ✅ Progress Bar Custom Thumb Border128
- ✅ プログレスバーカスタムサムボーダー128
- ✅ 진행 바 사용자 정의 썸 테두리128

### v128.9 音量每首曲目标准化 | Volume Normalize Per Track | 音量トラック別正規化 | 볼륨 트랙별 정규화
- ✅ 音量每首曲目标准化
- ✅ Volume Normalize Per Track
- ✅ 音量トラック別正規化
- ✅ 볼륨 트랙별 정규화

### v128.10 历史记录自动清理128 | History Auto Clean128 | 履歴自動クリーンアップ128 | 기록 자동 정리128
- ✅ 历史记录自动清理128
- ✅ History Auto Clean128
- ✅ 履歴自動クリーンアップ128
- ✅ 기록 자동 정리128

### v128.11 播放速度预设显示 | Playback Speed Presets Display | 再生速度プリセット表示 | 재생 속도 프리셋 표시
- ✅ 播放速度预设显示
- ✅ Playback Speed Presets Display
- ✅ 再生速度プリセット表示
- ✅ 재생 속도 프리셋 표시

### v128.12 截图自动分享Telegram频道 | Screenshot Auto Share Telegram Channel | スクリーンショット自動Telegramチャネル共有 | 스크린샷 자동 Telegram 채널 공유
- ✅ 截图自动分享Telegram频道
- ✅ Screenshot Auto Share Telegram Channel
- ✅ スクリーンショット自動Telegramチャネル共有
- ✅ 스크린샷 자동 Telegram 채널 공유

### v128.13 视频画中画最小化到通知 | Video PIP Minimize To Notification | ビデオPIP通知に最小化 | 비디오 PIP 알림으로 최소화
- ✅ 视频画中画最小化到通知
- ✅ Video PIP Minimize To Notification
- ✅ ビデオPIP通知に最小化
- ✅ 비디오 PIP 알림으로 최소화

### v128.14 弹幕字体背景填充边框连接 | Danmaku Font BG Fill Border Join | コメントフォントBGフィルボーダージョイン | 댓글 글꼴 배경 채우기 테두리 연결
- ✅ 弹幕字体背景填充边框连接
- ✅ Danmaku Font BG Fill Border Join
- ✅ コメントフォントBGフィルボーダージョイン
- ✅ 댓글 글꼴 배경 채우기 테두리 연결

### v128.15 字幕动画平移128 | Subtitle Animation Translate128 | 字幕アニメーショントランスレート128 | 자막 애니메이션 이동128
- ✅ 字幕动画平移128
- ✅ Subtitle Animation Translate128
- ✅ 字幕アニメーショントランスレート128
- ✅ 자막 애니메이션 이동128

### v129.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v129.1-v129.15 功能列表
- ✅ Audio Chorus Toggle129, Danmaku Font BG Fill Border Join128, Subtitle Animation Translate129, Gesture Tap Zone Custom, Cast Video PIP Size, Playlist Auto Group By Mood, Cache Smart Pinning On Charging, Progress Bar Custom Thumb Border129, Volume Normalize Album, History Auto Clean129, Playback Speed Presets Notification, Screenshot Auto Share Slack, Video PIP Transition Animation, Danmaku Font BG Fill Border Miter Limit, Subtitle Animation Scale129

### v129.1 音频合唱开关129 | Audio Chorus Toggle129 | オーディオコーラス切替129 | 오디오 코러스 전환129
- ✅ 音频合唱开关129
- ✅ Audio Chorus Toggle129
- ✅ オーディオコーラス切替129
- ✅ 오디오 코러스 전환129

### v129.2 弹幕字体背景填充边框连接128 | Danmaku Font BG Fill Border Join128 | コメントフォントBGフィルボーダージョイン128 | 댓글 글꼴 배경 채우기 테두리 연결128
- ✅ 弹幕字体背景填充边框连接128
- ✅ Danmaku Font BG Fill Border Join128
- ✅ コメントフォントBGフィルボーダージョイン128
- ✅ 댓글 글꼴 배경 채우기 테두리 연결128

### v129.3 字幕动画平移129 | Subtitle Animation Translate129 | 字幕アニメーショントランスレート129 | 자막 애니메이션 이동129
- ✅ 字幕动画平移129
- ✅ Subtitle Animation Translate129
- ✅ 字幕アニメーショントランスレート129
- ✅ 자막 애니메이션 이동129

### v129.4 手势点击区域自定义 | Gesture Tap Zone Custom | ジェスチャータップゾーンカスタム | 제스처 탭 영역 사용자 정의
- ✅ 手势点击区域自定义
- ✅ Gesture Tap Zone Custom
- ✅ ジェスチャータップゾーンカスタム
- ✅ 제스처 탭 영역 사용자 정의

### v129.5 投射视频画中画大小 | Cast Video PIP Size | キャストビデオPIPサイズ | 캐스트 비디오 PIP 크기
- ✅ 投射视频画中画大小
- ✅ Cast Video PIP Size
- ✅ キャストビデオPIPサイズ
- ✅ 캐스트 비디오 PIP 크기

### v129.6 播放列表按心情分组 | Playlist Auto Group By Mood | プレイリスト気分別グループ化 | 재생 목록 기분별 그룹화
- ✅ 播放列表按心情分组
- ✅ Playlist Auto Group By Mood
- ✅ プレイリスト気分別グループ化
- ✅ 재생 목록 기분별 그룹화

### v129.7 缓存充电时智能固定 | Cache Smart Pinning On Charging | キャッシュ充電時スマートピンニング | 캐시 충전 시 스마트 고정
- ✅ 缓存充电时智能固定
- ✅ Cache Smart Pinning On Charging
- ✅ キャッシュ充電時スマートピンニング
- ✅ 캐시 충전 시 스마트 고정

### v129.8 进度条自定义滑块边框129 | Progress Bar Custom Thumb Border129 | プログレスバーカスタムサムボーダー129 | 진행 바 사용자 정의 썸 테두리129
- ✅ 进度条自定义滑块边框129
- ✅ Progress Bar Custom Thumb Border129
- ✅ プログレスバーカスタムサムボーダー129
- ✅ 진행 바 사용자 정의 썸 테두리129

### v129.9 音量专辑标准化 | Volume Normalize Album | 音量アルバム正規化 | 볼륨 앨범 정규화
- ✅ 音量专辑标准化
- ✅ Volume Normalize Album
- ✅ 音量アルバム正規化
- ✅ 볼륨 앨범 정규화

### v129.10 历史记录自动清理129 | History Auto Clean129 | 履歴自動クリーンアップ129 | 기록 자동 정리129
- ✅ 历史记录自动清理129
- ✅ History Auto Clean129
- ✅ 履歴自動クリーンアップ129
- ✅ 기록 자동 정리129

### v129.11 播放速度预设通知 | Playback Speed Presets Notification | 再生速度プリセット通知 | 재생 속도 프리셋 알림
- ✅ 播放速度预设通知
- ✅ Playback Speed Presets Notification
- ✅ 再生速度プリセット通知
- ✅ 재생 속도 프리셋 알림

### v129.12 截图自动分享Slack | Screenshot Auto Share Slack | スクリーンショット自動Slack共有 | 스크린샷 자동 Slack 공유
- ✅ 截图自动分享Slack
- ✅ Screenshot Auto Share Slack
- ✅ スクリーンショット自動Slack共有
- ✅ 스크린샷 자동 Slack 공유

### v129.13 视频画中画过渡动画 | Video PIP Transition Animation | ビデオPIPトランジションアニメーション | 비디오 PIP 전환 애니메이션
- ✅ 视频画中画过渡动画
- ✅ Video PIP Transition Animation
- ✅ ビデオPIPトランジションアニメーション
- ✅ 비디오 PIP 전환 애니메이션

### v129.14 弹幕字体背景填充边框斜接限制 | Danmaku Font BG Fill Border Miter Limit | コメントフォントBGフィルボーダーマイター制限 | 댓글 글꼴 배경 채우기 테두리 마이터 제한
- ✅ 弹幕字体背景填充边框斜接限制
- ✅ Danmaku Font BG Fill Border Miter Limit
- ✅ コメントフォントBGフィルボーダーマイター制限
- ✅ 댓글 글꼴 배경 채우기 테두리 마이터 제한

### v129.15 字幕动画缩放129 | Subtitle Animation Scale129 | 字幕アニメーションスケール129 | 자막 애니메이션 스케일129
- ✅ 字幕动画缩放129
- ✅ Subtitle Animation Scale129
- ✅ 字幕アニメーションスケール129
- ✅ 자막 애니메이션 스케일129

### v130.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v130.1-v130.15 功能列表
- ✅ Audio Chorus Rate, Danmaku Font BG Fill Border Miter129, Subtitle Animation Scale130, Gesture Tap Zone Dead Zone, Cast Video PIP Position, Playlist Auto Group By Language, Cache Smart Pinning On Idle, Progress Bar Custom Thumb Color130, Volume Normalize Track, History Auto Clean130, Playback Speed Presets Widget, Screenshot Auto Share Teams, Video PIP Opacity On Drag, Danmaku Font BG Fill Shadow Toggle, Subtitle Animation Rotate130

### v130.1 音频合唱速率 | Audio Chorus Rate | オーディオコーラスレート | 오디오 코러스 속도
- ✅ 音频合唱速率
- ✅ Audio Chorus Rate
- ✅ オーディオコーラスレート
- ✅ 오디오 코러스 속도

### v130.2 弹幕字体背景填充边框斜接129 | Danmaku Font BG Fill Border Miter129 | コメントフォントBGフィルボーダーマイター129 | 댓글 글꼴 배경 채우기 테두리 마이터129
- ✅ 弹幕字体背景填充边框斜接129
- ✅ Danmaku Font BG Fill Border Miter129
- ✅ コメントフォントBGフィルボーダーマイター129
- ✅ 댓글 글꼴 배경 채우기 테두리 마이터129

### v130.3 字幕动画缩放130 | Subtitle Animation Scale130 | 字幕アニメーションスケール130 | 자막 애니메이션 스케일130
- ✅ 字幕动画缩放130
- ✅ Subtitle Animation Scale130
- ✅ 字幕アニメーションスケール130
- ✅ 자막 애니메이션 스케일130

### v130.4 手势点击区域死区 | Gesture Tap Zone Dead Zone | ジェスチャータップゾーンデッドゾーン | 제스처 탭 영역 데드존
- ✅ 手势点击区域死区
- ✅ Gesture Tap Zone Dead Zone
- ✅ ジェスチャータップゾーンデッドゾーン
- ✅ 제스처 탭 영역 데드존

### v130.5 投射视频画中画位置 | Cast Video PIP Position | キャストビデオPIP位置 | 캐스트 비디오 PIP 위치
- ✅ 投射视频画中画位置
- ✅ Cast Video PIP Position
- ✅ キャストビデオPIP位置
- ✅ 캐스트 비디오 PIP 위치

### v130.6 播放列表按语言分组 | Playlist Auto Group By Language | プレイリスト言語別グループ化 | 재생 목록 언어별 그룹화
- ✅ 播放列表按语言分组
- ✅ Playlist Auto Group By Language
- ✅ プレイリスト言語別グループ化
- ✅ 재생 목록 언어별 그룹화

### v130.7 缓存空闲时智能固定 | Cache Smart Pinning On Idle | キャッシュアイドル時スマートピンニング | 캐시 유휴 시 스마트 고정
- ✅ 缓存空闲时智能固定
- ✅ Cache Smart Pinning On Idle
- ✅ キャッシュアイドル時スマートピンニング
- ✅ 캐시 유휴 시 스마트 고정

### v130.8 进度条自定义滑块颜色130 | Progress Bar Custom Thumb Color130 | プログレスバーカスタムサム色130 | 진행 바 사용자 정의 썸 색상130
- ✅ 进度条自定义滑块颜色130
- ✅ Progress Bar Custom Thumb Color130
- ✅ プログレスバーカスタムサム色130
- ✅ 진행 바 사용자 정의 썸 색상130

### v130.9 音量单曲标准化 | Volume Normalize Track | 音量トラック正規化 | 볼륨 트랙 정규화
- ✅ 音量单曲标准化
- ✅ Volume Normalize Track
- ✅ 音量トラック正規化
- ✅ 볼륨 트랙 정규화

### v130.10 历史记录自动清理130 | History Auto Clean130 | 履歴自動クリーンアップ130 | 기록 자동 정리130
- ✅ 历史记录自动清理130
- ✅ History Auto Clean130
- ✅ 履歴自動クリーンアップ130
- ✅ 기록 자동 정리130

### v130.11 播放速度预设小部件 | Playback Speed Presets Widget | 再生速度プリセットウィジェット | 재생 속도 프리셋 위젯
- ✅ 播放速度预设小部件
- ✅ Playback Speed Presets Widget
- ✅ 再生速度プリセットウィジェット
- ✅ 재생 속도 프리셋 위젯

### v130.12 截图自动分享Teams | Screenshot Auto Share Teams | スクリーンショット自動Teams共有 | 스크린샷 자동 Teams 공유
- ✅ 截图自动分享Teams
- ✅ Screenshot Auto Share Teams
- ✅ スクリーンショット自動Teams共有
- ✅ 스크린샷 자동 Teams 공유

### v130.13 视频画中画拖动透明度 | Video PIP Opacity On Drag | ビデオPIPドラッグ時透明度 | 비디오 PIP 드래그 시 불투명도
- ✅ 视频画中画拖动透明度
- ✅ Video PIP Opacity On Drag
- ✅ ビデオPIPドラッグ時透明度
- ✅ 비디오 PIP 드래그 시 불투명도

### v130.14 弹幕字体背景填充阴影开关 | Danmaku Font BG Fill Shadow Toggle | コメントフォントBGフィルシャドウ切替 | 댓글 글꼴 배경 채우기 그림자 전환
- ✅ 弹幕字体背景填充阴影开关
- ✅ Danmaku Font BG Fill Shadow Toggle
- ✅ コメントフォントBGフィルシャドウ切替
- ✅ 댓글 글꼴 배경 채우기 그림자 전환

### v130.15 字幕动画旋转130 | Subtitle Animation Rotate130 | 字幕アニメーションローテート130 | 자막 애니메이션 회전130
- ✅ 字幕动画旋转130
- ✅ Subtitle Animation Rotate130
- ✅ 字幕アニメーションローテート130
- ✅ 자막 애니메이션 회전130


### v131.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v131.1-v131.15 功能列表
- ✅ Audio Chorus Depth, Danmaku Font BG Fill Shadow Color, Subtitle Animation Rotate131, Gesture Tap Zone Sensitivity, Cast Video PIP Follow Main, Playlist Auto Group By Genre, Cache Smart Pinning On Schedule, Progress Bar Custom Thumb Shadow131, Volume Normalize Mode, History Auto Clean131, Playback Speed Presets Quick Switch, Screenshot Auto Share Messenger, Video PIP Transition Speed, Danmaku Font BG Fill Shadow Offset X, Subtitle Animation Translate131

### v131.1 音频合唱深度 | Audio Chorus Depth | オーディオコーラス深度 | 오디오 코러스 깊이
- ✅ 音频合唱深度
- ✅ Audio Chorus Depth
- ✅ オーディオコーラス深度
- ✅ 오디오 코러스 깊이

### v131.2 弹幕字体背景填充阴影颜色 | Danmaku Font BG Fill Shadow Color | コメントフォントBGフィルシャドウ色 | 댓글 글꼴 배경 채우기 그림자 색상
- ✅ 弹幕字体背景填充阴影颜色
- ✅ Danmaku Font BG Fill Shadow Color
- ✅ コメントフォントBGフィルシャドウ色
- ✅ 댓글 글꼴 배경 채우기 그림자 색상

### v131.3 字幕动画旋转131 | Subtitle Animation Rotate131 | 字幕アニメーションローテート131 | 자막 애니메이션 회전131
- ✅ 字幕动画旋转131
- ✅ Subtitle Animation Rotate131
- ✅ 字幕アニメーションローテート131
- ✅ 자막 애니메이션 회전131

### v131.4 手势点击区域灵敏度 | Gesture Tap Zone Sensitivity | ジェスチャータップゾーン感度 | 제스처 탭 영역 감도
- ✅ 手势点击区域灵敏度
- ✅ Gesture Tap Zone Sensitivity
- ✅ ジェスチャータップゾーン感度
- ✅ 제스처 탭 영역 감도

### v131.5 投射视频画中画跟随主屏 | Cast Video PIP Follow Main | キャストビデオPIPメイン追従 | 캐스트 비디오 PIP 메인 팔로우
- ✅ 投射视频画中画跟随主屏
- ✅ Cast Video PIP Follow Main
- ✅ キャストビデオPIPメイン追従
- ✅ 캐스트 비디오 PIP 메인 팔로우

### v131.6 播放列表按类型自动分组 | Playlist Auto Group By Genre | プレイリストジャンル別自動グループ化 | 재생 목록 장르별 자동 그룹화
- ✅ 播放列表按类型自动分组
- ✅ Playlist Auto Group By Genre
- ✅ プレイリストジャンル別自動グループ化
- ✅ 재생 목록 장르별 자동 그룹화

### v131.7 缓存定时智能固定 | Cache Smart Pinning On Schedule | キャッシュスケジュールスマートピンニング | 캐시 스케줄 스마트 고정
- ✅ 缓存定时智能固定
- ✅ Cache Smart Pinning On Schedule
- ✅ キャッシュスケジュールスマートピンニング
- ✅ 캐시 스케줄 스마트 고정

### v131.8 进度条自定义滑块阴影131 | Progress Bar Custom Thumb Shadow131 | プログレスバーカスタムサムシャドウ131 | 진행 바 사용자 정의 썸 그림자131
- ✅ 进度条自定义滑块阴影131
- ✅ Progress Bar Custom Thumb Shadow131
- ✅ プログレスバーカスタムサムシャドウ131
- ✅ 진행 바 사용자 정의 썸 그림자131

### v131.9 音量标准化模式 | Volume Normalize Mode | 音量正規化モード | 볼륨 정규화 모드
- ✅ 音量标准化模式
- ✅ Volume Normalize Mode
- ✅ 音量正規化モード
- ✅ 볼륨 정규화 모드

### v131.10 历史记录自动清理131 | History Auto Clean131 | 履歴自動クリーンアップ131 | 기록 자동 정리131
- ✅ 历史记录自动清理131
- ✅ History Auto Clean131
- ✅ 履歴自動クリーンアップ131
- ✅ 기록 자동 정리131

### v131.11 播放速度预设快速切换 | Playback Speed Presets Quick Switch | 再生速度プリセット高速切替 | 재생 속도 프리셋 빠른 전환
- ✅ 播放速度预设快速切换
- ✅ Playback Speed Presets Quick Switch
- ✅ 再生速度プリセット高速切替
- ✅ 재생 속도 프리셋 빠른 전환

### v131.12 截图自动分享Messenger | Screenshot Auto Share Messenger | スクリーンショット自動Messenger共有 | 스크린샷 자동 Messenger 공유
- ✅ 截图自动分享Messenger
- ✅ Screenshot Auto Share Messenger
- ✅ スクリーンショット自動Messenger共有
- ✅ 스크린샷 자동 Messenger 공유

### v131.13 视频画中画过渡速度 | Video PIP Transition Speed | ビデオPIPトランジション速度 | 비디오 PIP 전환 속도
- ✅ 视频画中画过渡速度
- ✅ Video PIP Transition Speed
- ✅ ビデオPIPトランジション速度
- ✅ 비디오 PIP 전환 속도

### v131.14 弹幕字体背景填充阴影X偏移 | Danmaku Font BG Fill Shadow Offset X | コメントフォントBGフィルシャドウオフセットX | 댓글 글꼴 배경 채우기 그림자 오프셋 X
- ✅ 弹幕字体背景填充阴影X偏移
- ✅ Danmaku Font BG Fill Shadow Offset X
- ✅ コメントフォントBGフィルシャドウオフセットX
- ✅ 댓글 글꼴 배경 채우기 그림자 오프셋 X

### v131.15 字幕动画平移131 | Subtitle Animation Translate131 | 字幕アニメーショントランスレート131 | 자막 애니메이션 이동131
- ✅ 字幕动画平移131
- ✅ Subtitle Animation Translate131
- ✅ 字幕アニメーショントランスレート131
- ✅ 자막 애니메이션 이동131

### v132.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v132.1-v132.15 功能列表
- ✅ Audio Chorus Feedback, Danmaku Font BG Fill Shadow Offset Y, Subtitle Animation Translate132, Gesture Tap Zone Visual Feedback, Cast Video PIP Follow Fullscreen, Playlist Auto Group By Series132, Cache Smart Pinning On Network Change, Progress Bar Custom Thumb Glow132, Volume Normalize Target, History Auto Clean132, Playback Speed Presets Long Press, Screenshot Auto Share Viber, Video PIP Transition Type, Danmaku Font BG Fill Shadow Blur, Subtitle Animation Scale132

### v132.1 音频合唱反馈 | Audio Chorus Feedback | オーディオコーラスフィードバック | 오디오 코러스 피드백
- ✅ 音频合唱反馈
- ✅ Audio Chorus Feedback
- ✅ オーディオコーラスフィードバック
- ✅ 오디오 코러스 피드백

### v132.2 弹幕字体背景填充阴影Y偏移 | Danmaku Font BG Fill Shadow Offset Y | コメントフォントBGフィルシャドウオフセットY | 댓글 글꼴 배경 채우기 그림자 오프셋 Y
- ✅ 弹幕字体背景填充阴影Y偏移
- ✅ Danmaku Font BG Fill Shadow Offset Y
- ✅ コメントフォントBGフィルシャドウオフセットY
- ✅ 댓글 글꼴 배경 채우기 그림자 오프셋 Y

### v132.3 字幕动画平移132 | Subtitle Animation Translate132 | 字幕アニメーショントランスレート132 | 자막 애니메이션 이동132
- ✅ 字幕动画平移132
- ✅ Subtitle Animation Translate132
- ✅ 字幕アニメーショントランスレート132
- ✅ 자막 애니메이션 이동132

### v132.4 手势点击区域视觉反馈 | Gesture Tap Zone Visual Feedback | ジェスチャータップゾーン視覚フィードバック | 제스처 탭 영역 시각 피드백
- ✅ 手势点击区域视觉反馈
- ✅ Gesture Tap Zone Visual Feedback
- ✅ ジェスチャータップゾーン視覚フィードバック
- ✅ 제스처 탭 영역 시각 피드백

### v132.5 投射视频画中画跟随全屏 | Cast Video PIP Follow Fullscreen | キャストビデオPIP全画面追従 | 캐스트 비디오 PIP 전체화면 팔로우
- ✅ 投射视频画中画跟随全屏
- ✅ Cast Video PIP Follow Fullscreen
- ✅ キャストビデオPIP全画面追従
- ✅ 캐스트 비디오 PIP 전체화면 팔로우

### v132.6 播放列表按系列自动分组132 | Playlist Auto Group By Series132 | プレイリストシリーズ別自動グループ化132 | 재생 목록 시리즈별 자동 그룹화132
- ✅ 播放列表按系列自动分组132
- ✅ Playlist Auto Group By Series132
- ✅ プレイリストシリーズ別自動グループ化132
- ✅ 재생 목록 시리즈별 자동 그룹화132

### v132.7 缓存网络变化时智能固定 | Cache Smart Pinning On Network Change | キャッシュネットワーク変更時スマートピンニング | 캐시 네트워크 변경 시 스마트 고정
- ✅ 缓存网络变化时智能固定
- ✅ Cache Smart Pinning On Network Change
- ✅ キャッシュネットワーク変更時スマートピンニング
- ✅ 캐시 네트워크 변경 시 스마트 고정

### v132.8 进度条自定义滑块发光132 | Progress Bar Custom Thumb Glow132 | プログレスバーカスタムサムグロウ132 | 진행 바 사용자 정의 썸 글로우132
- ✅ 进度条自定义滑块发光132
- ✅ Progress Bar Custom Thumb Glow132
- ✅ プログレスバーカスタムサムグロウ132
- ✅ 진행 바 사용자 정의 썸 글로우132

### v132.9 音量标准化目标 | Volume Normalize Target | 音量正規化ターゲット | 볼륨 정규화 대상
- ✅ 音量标准化目标
- ✅ Volume Normalize Target
- ✅ 音量正規化ターゲット
- ✅ 볼륨 정규화 대상

### v132.10 历史记录自动清理132 | History Auto Clean132 | 履歴自動クリーンアップ132 | 기록 자동 정리132
- ✅ 历史记录自动清理132
- ✅ History Auto Clean132
- ✅ 履歴自動クリーンアップ132
- ✅ 기록 자동 정리132

### v132.11 播放速度预设长按 | Playback Speed Presets Long Press | 再生速度プリセット長押し | 재생 속도 프리셋 길게 누르기
- ✅ 播放速度预设长按
- ✅ Playback Speed Presets Long Press
- ✅ 再生速度プリセット長押し
- ✅ 재생 속도 프리셋 길게 누르기

### v132.12 截图自动分享Viber | Screenshot Auto Share Viber | スクリーンショット自動Viber共有 | 스크린샷 자동 Viber 공유
- ✅ 截图自动分享Viber
- ✅ Screenshot Auto Share Viber
- ✅ スクリーンショット自動Viber共有
- ✅ 스크린샷 자동 Viber 공유

### v132.13 视频画中画过渡类型 | Video PIP Transition Type | ビデオPIPトランジションタイプ | 비디오 PIP 전환 유형
- ✅ 视频画中画过渡类型
- ✅ Video PIP Transition Type
- ✅ ビデオPIPトランジションタイプ
- ✅ 비디오 PIP 전환 유형

### v132.14 弹幕字体背景填充阴影模糊 | Danmaku Font BG Fill Shadow Blur | コメントフォントBGフィルシャドウブラー | 댓글 글꼴 배경 채우기 그림자 블러
- ✅ 弹幕字体背景填充阴影模糊
- ✅ Danmaku Font BG Fill Shadow Blur
- ✅ コメントフォントBGフィルシャドウブラー
- ✅ 댓글 글꼴 배경 채우기 그림자 블러

### v132.15 字幕动画缩放132 | Subtitle Animation Scale132 | 字幕アニメーションスケール132 | 자막 애니메이션 스케일132
- ✅ 字幕动画缩放132
- ✅ Subtitle Animation Scale132
- ✅ 字幕アニメーションスケール132
- ✅ 자막 애니메이션 스케일132

### v133.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v133.1-v133.15 功能列表
- ✅ Audio Chorus Mix, Danmaku Font BG Fill Shadow Opacity, Subtitle Animation Scale133, Gesture Tap Zone Haptic Feedback, Cast Video PIP Follow Playback, Playlist Auto Group By Date Range, Cache Smart Pinning On Battery Level, Progress Bar Custom Thumb Border133, Volume Normalize Ceiling, History Auto Clean133, Playback Speed Presets Double Tap, Screenshot Auto Share Signal, Video PIP Background Opacity, Danmaku Font BG Fill Shadow Spread, Subtitle Animation Rotate133

### v133.1 音频合唱混合 | Audio Chorus Mix | オーディオコーラスミックス | 오디오 코러스 믹스
- ✅ 音频合唱混合
- ✅ Audio Chorus Mix
- ✅ オーディオコーラスミックス
- ✅ 오디오 코러스 믹스

### v133.2 弹幕字体背景填充阴影透明度 | Danmaku Font BG Fill Shadow Opacity | コメントフォントBGフィルシャドウ透明度 | 댓글 글꼴 배경 채우기 그림자 불투명도
- ✅ 弹幕字体背景填充阴影透明度
- ✅ Danmaku Font BG Fill Shadow Opacity
- ✅ コメントフォントBGフィルシャドウ透明度
- ✅ 댓글 글꼴 배경 채우기 그림자 불투명도

### v133.3 字幕动画缩放133 | Subtitle Animation Scale133 | 字幕アニメーションスケール133 | 자막 애니메이션 스케일133
- ✅ 字幕动画缩放133
- ✅ Subtitle Animation Scale133
- ✅ 字幕アニメーションスケール133
- ✅ 자막 애니메이션 스케일133

### v133.4 手势点击区域触觉反馈 | Gesture Tap Zone Haptic Feedback | ジェスチャータップゾーン触覚フィードバック | 제스처 탭 영역 햅틱 피드백
- ✅ 手势点击区域触觉反馈
- ✅ Gesture Tap Zone Haptic Feedback
- ✅ ジェスチャータップゾーン触覚フィードバック
- ✅ 제스처 탭 영역 햅틱 피드백

### v133.5 投射视频画中画跟随播放 | Cast Video PIP Follow Playback | キャストビデオPIP再生追従 | 캐스트 비디오 PIP 재생 팔로우
- ✅ 投射视频画中画跟随播放
- ✅ Cast Video PIP Follow Playback
- ✅ キャストビデオPIP再生追従
- ✅ 캐스트 비디오 PIP 재생 팔로우

### v133.6 播放列表按日期范围分组 | Playlist Auto Group By Date Range | プレイリスト日付範囲別グループ化 | 재생 목록 날짜 범위별 그룹화
- ✅ 播放列表按日期范围分组
- ✅ Playlist Auto Group By Date Range
- ✅ プレイリスト日付範囲別グループ化
- ✅ 재생 목록 날짜 범위별 그룹화

### v133.7 缓存电量级别时智能固定 | Cache Smart Pinning On Battery Level | キャッシュバッテリーレベルスマートピンニング | 캐시 배터리 레벨 시 스마트 고정
- ✅ 缓存电量级别时智能固定
- ✅ Cache Smart Pinning On Battery Level
- ✅ キャッシュバッテリーレベルスマートピンニング
- ✅ 캐시 배터리 레벨 시 스마트 고정

### v133.8 进度条自定义滑块边框133 | Progress Bar Custom Thumb Border133 | プログレスバーカスタムサムボーダー133 | 진행 바 사용자 정의 썸 테두리133
- ✅ 进度条自定义滑块边框133
- ✅ Progress Bar Custom Thumb Border133
- ✅ プログレスバーカスタムサムボーダー133
- ✅ 진행 바 사용자 정의 썸 테두리133

### v133.9 音量标准化上限 | Volume Normalize Ceiling | 音量正規化シーリング | 볼륨 정규화 상한
- ✅ 音量标准化上限
- ✅ Volume Normalize Ceiling
- ✅ 音量正規化シーリング
- ✅ 볼륨 정규화 상한

### v133.10 历史记录自动清理133 | History Auto Clean133 | 履歴自動クリーンアップ133 | 기록 자동 정리133
- ✅ 历史记录自动清理133
- ✅ History Auto Clean133
- ✅ 履歴自動クリーンアップ133
- ✅ 기록 자동 정리133

### v133.11 播放速度预设双击 | Playback Speed Presets Double Tap | 再生速度プリセットダブルタップ | 재생 속도 프리셋 더블 탭
- ✅ 播放速度预设双击
- ✅ Playback Speed Presets Double Tap
- ✅ 再生速度プリセットダブルタップ
- ✅ 재생 속도 프리셋 더블 탭

### v133.12 截图自动分享Signal | Screenshot Auto Share Signal | スクリーンショット自動Signal共有 | 스크린샷 자동 Signal 공유
- ✅ 截图自动分享Signal
- ✅ Screenshot Auto Share Signal
- ✅ スクリーンショット自動Signal共有
- ✅ 스크린샷 자동 Signal 공유

### v133.13 视频画中画背景透明度 | Video PIP Background Opacity | ビデオPIP背景透明度 | 비디오 PIP 배경 불투명도
- ✅ 视频画中画背景透明度
- ✅ Video PIP Background Opacity
- ✅ ビデオPIP背景透明度
- ✅ 비디오 PIP 배경 불투명도

### v133.14 弹幕字体背景填充阴影扩展 | Danmaku Font BG Fill Shadow Spread | コメントフォントBGフィルシャドウスプレッド | 댓글 글꼴 배경 채우기 그림자 확산
- ✅ 弹幕字体背景填充阴影扩展
- ✅ Danmaku Font BG Fill Shadow Spread
- ✅ コメントフォントBGフィルシャドウスプレッド
- ✅ 댓글 글꼴 배경 채우기 그림자 확산

### v133.15 字幕动画旋转133 | Subtitle Animation Rotate133 | 字幕アニメーションローテート133 | 자막 애니메이션 회전133
- ✅ 字幕动画旋转133
- ✅ Subtitle Animation Rotate133
- ✅ 字幕アニメーションローテート133
- ✅ 자막 애니메이션 회전133

### v134.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v134.1-v134.15 功能列表
- ✅ Audio Flanger Toggle134, Danmaku Font BG Fill Shadow Type, Subtitle Animation Rotate134, Gesture Tap Zone Timeout, Cast Video PIP Follow Gesture, Playlist Auto Group By Watch Count, Cache Smart Pinning On Storage Type, Progress Bar Custom Thumb Size134, Volume Normalize Window, History Auto Clean134, Playback Speed Presets Triple Tap, Screenshot Auto Share X, Video PIP Follow Orientation, Danmaku Font BG Fill Shadow Type133, Subtitle Animation Blur134

### v134.1 音频镶边器开关134 | Audio Flanger Toggle134 | オーディオフランジャー切替134 | 오디오 플랜저 전환134
- ✅ 音频镶边器开关134
- ✅ Audio Flanger Toggle134
- ✅ オーディオフランジャー切替134
- ✅ 오디오 플랜저 전환134

### v134.2 弹幕字体背景填充阴影类型 | Danmaku Font BG Fill Shadow Type | コメントフォントBGフィルシャドウタイプ | 댓글 글꼴 배경 채우기 그림자 유형
- ✅ 弹幕字体背景填充阴影类型
- ✅ Danmaku Font BG Fill Shadow Type
- ✅ コメントフォントBGフィルシャドウタイプ
- ✅ 댓글 글꼴 배경 채우기 그림자 유형

### v134.3 字幕动画旋转134 | Subtitle Animation Rotate134 | 字幕アニメーションローテート134 | 자막 애니메이션 회전134
- ✅ 字幕动画旋转134
- ✅ Subtitle Animation Rotate134
- ✅ 字幕アニメーションローテート134
- ✅ 자막 애니메이션 회전134

### v134.4 手势点击区域超时 | Gesture Tap Zone Timeout | ジェスチャータップゾーンタイムアウト | 제스처 탭 영역 타임아웃
- ✅ 手势点击区域超时
- ✅ Gesture Tap Zone Timeout
- ✅ ジェスチャータップゾーンタイムアウト
- ✅ 제스처 탭 영역 타임아웃

### v134.5 投射视频画中画跟随手势 | Cast Video PIP Follow Gesture | キャストビデオPIPジェスチャー追従 | 캐스트 비디오 PIP 제스처 팔로우
- ✅ 投射视频画中画跟随手势
- ✅ Cast Video PIP Follow Gesture
- ✅ キャストビデオPIPジェスチャー追従
- ✅ 캐스트 비디오 PIP 제스처 팔로우

### v134.6 播放列表按观看次数分组 | Playlist Auto Group By Watch Count | プレイリスト視聴回数別グループ化 | 재생 목록 시청 횟수별 그룹화
- ✅ 播放列表按观看次数分组
- ✅ Playlist Auto Group By Watch Count
- ✅ プレイリスト視聴回数別グループ化
- ✅ 재생 목록 시청 횟수별 그룹화

### v134.7 缓存存储类型时智能固定 | Cache Smart Pinning On Storage Type | キャッシュストレージタイプスマートピンニング | 캐시 저장소 유형 시 스마트 고정
- ✅ 缓存存储类型时智能固定
- ✅ Cache Smart Pinning On Storage Type
- ✅ キャッシュストレージタイプスマートピンニング
- ✅ 캐시 저장소 유형 시 스마트 고정

### v134.8 进度条自定义滑块大小134 | Progress Bar Custom Thumb Size134 | プログレスバーカスタムサムサイズ134 | 진행 바 사용자 정의 썸 크기134
- ✅ 进度条自定义滑块大小134
- ✅ Progress Bar Custom Thumb Size134
- ✅ プログレスバーカスタムサムサイズ134
- ✅ 진행 바 사용자 정의 썸 크기134

### v134.9 音量标准化窗口 | Volume Normalize Window | 音量正規化ウィンドウ | 볼륨 정규화 윈도우
- ✅ 音量标准化窗口
- ✅ Volume Normalize Window
- ✅ 音量正規化ウィンドウ
- ✅ 볼륨 정규화 윈도우

### v134.10 历史记录自动清理134 | History Auto Clean134 | 履歴自動クリーンアップ134 | 기록 자동 정리134
- ✅ 历史记录自动清理134
- ✅ History Auto Clean134
- ✅ 履歴自動クリーンアップ134
- ✅ 기록 자동 정리134

### v134.11 播放速度预设三击 | Playback Speed Presets Triple Tap | 再生速度プリセットトリプルタップ | 재생 속도 프리셋 트리플 탭
- ✅ 播放速度预设三击
- ✅ Playback Speed Presets Triple Tap
- ✅ 再生速度プリセットトリプルタップ
- ✅ 재생 속도 프리셋 트리플 탭

### v134.12 截图自动分享X | Screenshot Auto Share X | スクリーンショット自動X共有 | 스크린샷 자동 X 공유
- ✅ 截图自动分享X
- ✅ Screenshot Auto Share X
- ✅ スクリーンショット自動X共有
- ✅ 스크린샷 자동 X 공유

### v134.13 视频画中画跟随方向 | Video PIP Follow Orientation | ビデオPIP方向追従 | 비디오 PIP 방향 팔로우
- ✅ 视频画中画跟随方向
- ✅ Video PIP Follow Orientation
- ✅ ビデオPIP方向追従
- ✅ 비디오 PIP 방향 팔로우

### v134.14 弹幕字体背景填充阴影类型133 | Danmaku Font BG Fill Shadow Type133 | コメントフォントBGフィルシャドウタイプ133 | 댓글 글꼴 배경 채우기 그림자 유형133
- ✅ 弹幕字体背景填充阴影类型133
- ✅ Danmaku Font BG Fill Shadow Type133
- ✅ コメントフォントBGフィルシャドウタイプ133
- ✅ 댓글 글꼴 배경 채우기 그림자 유형133

### v134.15 字幕动画模糊134 | Subtitle Animation Blur134 | 字幕アニメーションブラー134 | 자막 애니메이션 블러134
- ✅ 字幕动画模糊134
- ✅ Subtitle Animation Blur134
- ✅ 字幕アニメーションブラー134
- ✅ 자막 애니메이션 블러134

### v135.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v135.1-v135.15 功能列表
- ✅ Audio Flanger Rate, Danmaku Font BG Fill Shadow Type134, Subtitle Animation Blur135, Gesture Tap Zone Min Distance, Cast Video PIP Follow Screen, Playlist Auto Group By Like Count, Cache Smart Pinning On Storage Free, Progress Bar Custom Thumb Size135, Volume Normalize Threshold, History Auto Clean135, Playback Speed Presets Gesture, Screenshot Auto Share Tumblr, Video PIP Follow System Theme, Danmaku Font BG Fill Clip Toggle, Subtitle Animation Fade In135

### v135.1 音频镶边器速率 | Audio Flanger Rate | オーディオフランジャーレート | 오디오 플랜저 속도
- ✅ 音频镶边器速率
- ✅ Audio Flanger Rate
- ✅ オーディオフランジャーレート
- ✅ 오디오 플랜저 속도

### v135.2 弹幕字体背景填充阴影类型134 | Danmaku Font BG Fill Shadow Type134 | コメントフォントBGフィルシャドウタイプ134 | 댓글 글꼴 배경 채우기 그림자 유형134
- ✅ 弹幕字体背景填充阴影类型134
- ✅ Danmaku Font BG Fill Shadow Type134
- ✅ コメントフォントBGフィルシャドウタイプ134
- ✅ 댓글 글꼴 배경 채우기 그림자 유형134

### v135.3 字幕动画模糊135 | Subtitle Animation Blur135 | 字幕アニメーションブラー135 | 자막 애니메이션 블러135
- ✅ 字幕动画模糊135
- ✅ Subtitle Animation Blur135
- ✅ 字幕アニメーションブラー135
- ✅ 자막 애니메이션 블러135

### v135.4 手势点击区域最小距离 | Gesture Tap Zone Min Distance | ジェスチャータップゾーン最小距離 | 제스처 탭 영역 최소 거리
- ✅ 手势点击区域最小距离
- ✅ Gesture Tap Zone Min Distance
- ✅ ジェスチャータップゾーン最小距離
- ✅ 제스처 탭 영역 최소 거리

### v135.5 投射视频画中画跟随屏幕 | Cast Video PIP Follow Screen | キャストビデオPIP画面追従 | 캐스트 비디오 PIP 화면 팔로우
- ✅ 投射视频画中画跟随屏幕
- ✅ Cast Video PIP Follow Screen
- ✅ キャストビデオPIP画面追従
- ✅ 캐스트 비디오 PIP 화면 팔로우

### v135.6 播放列表按点赞数分组 | Playlist Auto Group By Like Count | プレイリストいいね数別グループ化 | 재생 목록 좋아요 수별 그룹화
- ✅ 播放列表按点赞数分组
- ✅ Playlist Auto Group By Like Count
- ✅ プレイリストいいね数別グループ化
- ✅ 재생 목록 좋아요 수별 그룹화

### v135.7 缓存存储空闲时智能固定 | Cache Smart Pinning On Storage Free | キャッシュストレージ空き時スマートピンニング | 캐시 저장소 여유 시 스마트 고정
- ✅ 缓存存储空闲时智能固定
- ✅ Cache Smart Pinning On Storage Free
- ✅ キャッシュストレージ空き時スマートピンニング
- ✅ 캐시 저장소 여유 시 스마트 고정

### v135.8 进度条自定义滑块大小135 | Progress Bar Custom Thumb Size135 | プログレスバーカスタムサムサイズ135 | 진행 바 사용자 정의 썸 크기135
- ✅ 进度条自定义滑块大小135
- ✅ Progress Bar Custom Thumb Size135
- ✅ プログレスバーカスタムサムサイズ135
- ✅ 진행 바 사용자 정의 썸 크기135

### v135.9 音量标准化阈值 | Volume Normalize Threshold | 音量正規化しきい値 | 볼륨 정규화 임계값
- ✅ 音量标准化阈值
- ✅ Volume Normalize Threshold
- ✅ 音量正規化しきい値
- ✅ 볼륨 정규화 임계값

### v135.10 历史记录自动清理135 | History Auto Clean135 | 履歴自動クリーンアップ135 | 기록 자동 정리135
- ✅ 历史记录自动清理135
- ✅ History Auto Clean135
- ✅ 履歴自動クリーンアップ135
- ✅ 기록 자동 정리135

### v135.11 播放速度预设手势 | Playback Speed Presets Gesture | 再生速度プリセットジェスチャー | 재생 속도 프리셋 제스처
- ✅ 播放速度预设手势
- ✅ Playback Speed Presets Gesture
- ✅ 再生速度プリセットジェスチャー
- ✅ 재생 속도 프리셋 제스처

### v135.12 截图自动分享Tumblr | Screenshot Auto Share Tumblr | スクリーンショット自動Tumblr共有 | 스크린샷 자동 Tumblr 공유
- ✅ 截图自动分享Tumblr
- ✅ Screenshot Auto Share Tumblr
- ✅ スクリーンショット自動Tumblr共有
- ✅ 스크린샷 자동 Tumblr 공유

### v135.13 视频画中画跟随系统主题 | Video PIP Follow System Theme | ビデオPIPシステムテーマ追従 | 비디오 PIP 시스템 테마 팔로우
- ✅ 视频画中画跟随系统主题
- ✅ Video PIP Follow System Theme
- ✅ ビデオPIPシステムテーマ追従
- ✅ 비디오 PIP 시스템 테마 팔로우

### v135.14 弹幕字体背景填充裁剪开关 | Danmaku Font BG Fill Clip Toggle | コメントフォントBGフィルクリップ切替 | 댓글 글꼴 배경 채우기 클립 전환
- ✅ 弹幕字体背景填充裁剪开关
- ✅ Danmaku Font BG Fill Clip Toggle
- ✅ コメントフォントBGフィルクリップ切替
- ✅ 댓글 글꼴 배경 채우기 클립 전환

### v135.15 字幕动画淡入135 | Subtitle Animation Fade In135 | 字幕アニメーションフェードイン135 | 자막 애니메이션 페이드인135
- ✅ 字幕动画淡入135
- ✅ Subtitle Animation Fade In135
- ✅ 字幕アニメーションフェードイン135
- ✅ 자막 애니메이션 페이드인135

### v136.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v136.1-v136.15 功能列表
- ✅ Audio Flanger Depth, Danmaku Font BG Fill Clip Path, Subtitle Animation Fade In136, Gesture Tap Zone Visual Style, Cast Video PIP Follow Orientation, Playlist Auto Group By Comment Count, Cache Smart Pinning On Network Speed, Progress Bar Custom Thumb Color136, Volume Normalize Adaptive, History Auto Clean136, Playback Speed Presets Quick Access, Screenshot Auto Share Pinterest, Video PIP Follow Audio Focus, Danmaku Font BG Fill Clip Path135, Subtitle Animation Fade Out136

### v136.1 音频镶边器深度 | Audio Flanger Depth | オーディオフランジャー深度 | 오디오 플랜저 깊이
- ✅ 音频镶边器深度
- ✅ Audio Flanger Depth
- ✅ オーディオフランジャー深度
- ✅ 오디오 플랜저 깊이

### v136.2 弹幕字体背景填充裁剪路径 | Danmaku Font BG Fill Clip Path | コメントフォントBGフィルクリップパス | 댓글 글꼴 배경 채우기 클립 패스
- ✅ 弹幕字体背景填充裁剪路径
- ✅ Danmaku Font BG Fill Clip Path
- ✅ コメントフォントBGフィルクリップパス
- ✅ 댓글 글꼴 배경 채우기 클립 패스

### v136.3 字幕动画淡入136 | Subtitle Animation Fade In136 | 字幕アニメーションフェードイン136 | 자막 애니메이션 페이드인136
- ✅ 字幕动画淡入136
- ✅ Subtitle Animation Fade In136
- ✅ 字幕アニメーションフェードイン136
- ✅ 자막 애니메이션 페이드인136

### v136.4 手势点击区域视觉样式 | Gesture Tap Zone Visual Style | ジェスチャータップゾーン視覚スタイル | 제스처 탭 영역 시각 스타일
- ✅ 手势点击区域视觉样式
- ✅ Gesture Tap Zone Visual Style
- ✅ ジェスチャータップゾーン視覚スタイル
- ✅ 제스처 탭 영역 시각 스타일

### v136.5 投射视频画中画跟随方向 | Cast Video PIP Follow Orientation | キャストビデオPIP方向追従 | 캐스트 비디오 PIP 방향 팔로우
- ✅ 投射视频画中画跟随方向
- ✅ Cast Video PIP Follow Orientation
- ✅ キャストビデオPIP方向追従
- ✅ 캐스트 비디오 PIP 방향 팔로우

### v136.6 播放列表按评论数分组 | Playlist Auto Group By Comment Count | プレイリストコメント数別グループ化 | 재생 목록 댓글 수별 그룹화
- ✅ 播放列表按评论数分组
- ✅ Playlist Auto Group By Comment Count
- ✅ プレイリストコメント数別グループ化
- ✅ 재생 목록 댓글 수별 그룹화

### v136.7 缓存网速时智能固定 | Cache Smart Pinning On Network Speed | キャッシュネットワーク速度スマートピンニング | 캐시 네트워크 속도 시 스마트 고정
- ✅ 缓存网速时智能固定
- ✅ Cache Smart Pinning On Network Speed
- ✅ キャッシュネットワーク速度スマートピンニング
- ✅ 캐시 네트워크 속도 시 스마트 고정

### v136.8 进度条自定义滑块颜色136 | Progress Bar Custom Thumb Color136 | プログレスバーカスタムサム色136 | 진행 바 사용자 정의 썸 색상136
- ✅ 进度条自定义滑块颜色136
- ✅ Progress Bar Custom Thumb Color136
- ✅ プログレスバーカスタムサム色136
- ✅ 진행 바 사용자 정의 썸 색상136

### v136.9 音量标准化自适应 | Volume Normalize Adaptive | 音量正規化アダプティブ | 볼륨 정규화 적응형
- ✅ 音量标准化自适应
- ✅ Volume Normalize Adaptive
- ✅ 音量正規化アダプティブ
- ✅ 볼륨 정규화 적응형

### v136.10 历史记录自动清理136 | History Auto Clean136 | 履歴自動クリーンアップ136 | 기록 자동 정리136
- ✅ 历史记录自动清理136
- ✅ History Auto Clean136
- ✅ 履歴自動クリーンアップ136
- ✅ 기록 자동 정리136

### v136.11 播放速度预设快速访问 | Playback Speed Presets Quick Access | 再生速度プリセットクイックアクセス | 재생 속도 프리셋 빠른 접근
- ✅ 播放速度预设快速访问
- ✅ Playback Speed Presets Quick Access
- ✅ 再生速度プリセットクイックアクセス
- ✅ 재생 속도 프리셋 빠른 접근

### v136.12 截图自动分享Pinterest | Screenshot Auto Share Pinterest | スクリーンショット自動Pinterest共有 | 스크린샷 자동 Pinterest 공유
- ✅ 截图自动分享Pinterest
- ✅ Screenshot Auto Share Pinterest
- ✅ スクリーンショット自動Pinterest共有
- ✅ 스크린샷 자동 Pinterest 공유

### v136.13 视频画中画跟随音频焦点 | Video PIP Follow Audio Focus | ビデオPIPオーディオフォーカス追従 | 비디오 PIP 오디오 포커스 팔로우
- ✅ 视频画中画跟随音频焦点
- ✅ Video PIP Follow Audio Focus
- ✅ ビデオPIPオーディオフォーカス追従
- ✅ 비디오 PIP 오디오 포커스 팔로우

### v136.14 弹幕字体背景填充裁剪路径135 | Danmaku Font BG Fill Clip Path135 | コメントフォントBGフィルクリップパス135 | 댓글 글꼴 배경 채우기 클립 패스135
- ✅ 弹幕字体背景填充裁剪路径135
- ✅ Danmaku Font BG Fill Clip Path135
- ✅ コメントフォントBGフィルクリップパス135
- ✅ 댓글 글꼴 배경 채우기 클립 패스135

### v136.15 字幕动画淡出136 | Subtitle Animation Fade Out136 | 字幕アニメーションフェードアウト136 | 자막 애니메이션 페이드아웃136
- ✅ 字幕动画淡出136
- ✅ Subtitle Animation Fade Out136
- ✅ 字幕アニメーションフェードアウト136
- ✅ 자막 애니메이션 페이드아웃136

### v137.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v137.1-v137.15 功能列表
- ✅ Audio Flanger Feedback136, Danmaku Font BG Fill Clip Path136, Subtitle Animation Fade Out137, Gesture Tap Zone Visual Color, Cast Video PIP Follow Battery, Playlist Auto Group By Share Count, Cache Smart Pinning On Network Type, Progress Bar Custom Thumb Color137, Volume Normalize Smoothing, History Auto Clean137, Playback Speed Presets Notification Toggle, Screenshot Auto Share Twitch, Video PIP Follow Do Not Disturb, Danmaku Font BG Fill Clip Radius, Subtitle Animation Translate137

### v137.1 音频镶边器反馈136 | Audio Flanger Feedback136 | オーディオフランジャーフィードバック136 | 오디오 플랜저 피드백136
- ✅ 音频镶边器反馈136
- ✅ Audio Flanger Feedback136
- ✅ オーディオフランジャーフィードバック136
- ✅ 오디오 플랜저 피드백136

### v137.2 弹幕字体背景填充裁剪路径136 | Danmaku Font BG Fill Clip Path136 | コメントフォントBGフィルクリップパス136 | 댓글 글꼴 배경 채우기 클립 패스136
- ✅ 弹幕字体背景填充裁剪路径136
- ✅ Danmaku Font BG Fill Clip Path136
- ✅ コメントフォントBGフィルクリップパス136
- ✅ 댓글 글꼴 배경 채우기 클립 패스136

### v137.3 字幕动画淡出137 | Subtitle Animation Fade Out137 | 字幕アニメーションフェードアウト137 | 자막 애니메이션 페이드아웃137
- ✅ 字幕动画淡出137
- ✅ Subtitle Animation Fade Out137
- ✅ 字幕アニメーションフェードアウト137
- ✅ 자막 애니메이션 페이드아웃137

### v137.4 手势点击区域视觉颜色 | Gesture Tap Zone Visual Color | ジェスチャータップゾーン視覚色 | 제스처 탭 영역 시각 색상
- ✅ 手势点击区域视觉颜色
- ✅ Gesture Tap Zone Visual Color
- ✅ ジェスチャータップゾーン視覚色
- ✅ 제스처 탭 영역 시각 색상

### v137.5 投射视频画中画跟随电量 | Cast Video PIP Follow Battery | キャストビデオPIPバッテリー追従 | 캐스트 비디오 PIP 배터리 팔로우
- ✅ 投射视频画中画跟随电量
- ✅ Cast Video PIP Follow Battery
- ✅ キャストビデオPIPバッテリー追従
- ✅ 캐스트 비디오 PIP 배터리 팔로우

### v137.6 播放列表按分享数分组 | Playlist Auto Group By Share Count | プレイリストシェア数別グループ化 | 재생 목록 공유 수별 그룹화
- ✅ 播放列表按分享数分组
- ✅ Playlist Auto Group By Share Count
- ✅ プレイリストシェア数別グループ化
- ✅ 재생 목록 공유 수별 그룹화

### v137.7 缓存网络类型时智能固定 | Cache Smart Pinning On Network Type | キャッシュネットワークタイプスマートピンニング | 캐시 네트워크 유형 시 스마트 고정
- ✅ 缓存网络类型时智能固定
- ✅ Cache Smart Pinning On Network Type
- ✅ キャッシュネットワークタイプスマートピンニング
- ✅ 캐시 네트워크 유형 시 스마트 고정

### v137.8 进度条自定义滑块颜色137 | Progress Bar Custom Thumb Color137 | プログレスバーカスタムサム色137 | 진행 바 사용자 정의 썸 색상137
- ✅ 进度条自定义滑块颜色137
- ✅ Progress Bar Custom Thumb Color137
- ✅ プログレスバーカスタムサム色137
- ✅ 진행 바 사용자 정의 썸 색상137

### v137.9 音量标准化平滑 | Volume Normalize Smoothing | 音量正規化スムージング | 볼륨 정규화 스무딩
- ✅ 音量标准化平滑
- ✅ Volume Normalize Smoothing
- ✅ 音量正規化スムージング
- ✅ 볼륨 정규화 스무딩

### v137.10 历史记录自动清理137 | History Auto Clean137 | 履歴自動クリーンアップ137 | 기록 자동 정리137
- ✅ 历史记录自动清理137
- ✅ History Auto Clean137
- ✅ 履歴自動クリーンアップ137
- ✅ 기록 자동 정리137

### v137.11 播放速度预设通知开关 | Playback Speed Presets Notification Toggle | 再生速度プリセット通知切替 | 재생 속도 프리셋 알림 전환
- ✅ 播放速度预设通知开关
- ✅ Playback Speed Presets Notification Toggle
- ✅ 再生速度プリセット通知切替
- ✅ 재생 속도 프리셋 알림 전환

### v137.12 截图自动分享Twitch | Screenshot Auto Share Twitch | スクリーンショット自動Twitch共有 | 스크린샷 자동 Twitch 공유
- ✅ 截图自动分享Twitch
- ✅ Screenshot Auto Share Twitch
- ✅ スクリーンショット自動Twitch共有
- ✅ 스크린샷 자동 Twitch 공유

### v137.13 视频画中画跟随勿扰模式 | Video PIP Follow Do Not Disturb | ビデオPIPおやすみモード追従 | 비디오 PIP 방해 금지 팔로우
- ✅ 视频画中画跟随勿扰模式
- ✅ Video PIP Follow Do Not Disturb
- ✅ ビデオPIPおやすみモード追従
- ✅ 비디오 PIP 방해 금지 팔로우

### v137.14 弹幕字体背景填充裁剪半径 | Danmaku Font BG Fill Clip Radius | コメントフォントBGフィルクリップ半径 | 댓글 글꼴 배경 채우기 클립 반경
- ✅ 弹幕字体背景填充裁剪半径
- ✅ Danmaku Font BG Fill Clip Radius
- ✅ コメントフォントBGフィルクリップ半径
- ✅ 댓글 글꼴 배경 채우기 클립 반경

### v137.15 字幕动画平移137 | Subtitle Animation Translate137 | 字幕アニメーショントランスレート137 | 자막 애니메이션 이동137
- ✅ 字幕动画平移137
- ✅ Subtitle Animation Translate137
- ✅ 字幕アニメーショントランスレート137
- ✅ 자막 애니메이션 이동137

### v138.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v138.1-v138.15 功能列表
- ✅ Audio Phaser Toggle138, Danmaku Font BG Fill Clip Radius137, Subtitle Animation Translate138, Gesture Tap Zone Visual Opacity, Cast Video PIP Follow Storage, Playlist Auto Group By Fav Count, Cache Smart Pinning On Storage Read, Progress Bar Custom Thumb Shadow138, Volume Normalize Gate, History Auto Clean138, Playback Speed Presets Drag Adjust, Screenshot Auto Share YouTube, Video PIP Follow Brightness, Danmaku Font BG Fill Clip Radius138, Subtitle Animation Scale138

### v138.1 音频相位器开关138 | Audio Phaser Toggle138 | オーディオフェーザー切替138 | 오디오 페이저 전환138
- ✅ 音频相位器开关138
- ✅ Audio Phaser Toggle138
- ✅ オーディオフェーザー切替138
- ✅ 오디오 페이저 전환138

### v138.2 弹幕字体背景填充裁剪半径137 | Danmaku Font BG Fill Clip Radius137 | コメントフォントBGフィルクリップ半径137 | 댓글 글꼴 배경 채우기 클립 반경137
- ✅ 弹幕字体背景填充裁剪半径137
- ✅ Danmaku Font BG Fill Clip Radius137
- ✅ コメントフォントBGフィルクリップ半径137
- ✅ 댓글 글꼴 배경 채우기 클립 반경137

### v138.3 字幕动画平移138 | Subtitle Animation Translate138 | 字幕アニメーショントランスレート138 | 자막 애니메이션 이동138
- ✅ 字幕动画平移138
- ✅ Subtitle Animation Translate138
- ✅ 字幕アニメーショントランスレート138
- ✅ 자막 애니메이션 이동138

### v138.4 手势点击区域视觉透明度 | Gesture Tap Zone Visual Opacity | ジェスチャータップゾーン視覚透明度 | 제스처 탭 영역 시각 불투명도
- ✅ 手势点击区域视觉透明度
- ✅ Gesture Tap Zone Visual Opacity
- ✅ ジェスチャータップゾーン視覚透明度
- ✅ 제스처 탭 영역 시각 불투명도

### v138.5 投射视频画中画跟随存储 | Cast Video PIP Follow Storage | キャストビデオPIPストレージ追従 | 캐스트 비디오 PIP 저장소 팔로우
- ✅ 投射视频画中画跟随存储
- ✅ Cast Video PIP Follow Storage
- ✅ キャストビデオPIPストレージ追従
- ✅ 캐스트 비디오 PIP 저장소 팔로우

### v138.6 播放列表按收藏数分组 | Playlist Auto Group By Fav Count | プレイリストお気に入り数別グループ化 | 재생 목록 즐겨찾기 수별 그룹화
- ✅ 播放列表按收藏数分组
- ✅ Playlist Auto Group By Fav Count
- ✅ プレイリストお気に入り数別グループ化
- ✅ 재생 목록 즐겨찾기 수별 그룹화

### v138.7 缓存存储读取时智能固定 | Cache Smart Pinning On Storage Read | キャッシュストレージ読み取りスマートピンニング | 캐시 저장소 읽기 시 스마트 고정
- ✅ 缓存存储读取时智能固定
- ✅ Cache Smart Pinning On Storage Read
- ✅ キャッシュストレージ読み取りスマートピンニング
- ✅ 캐시 저장소 읽기 시 스마트 고정

### v138.8 进度条自定义滑块阴影138 | Progress Bar Custom Thumb Shadow138 | プログレスバーカスタムサムシャドウ138 | 진행 바 사용자 정의 썸 그림자138
- ✅ 进度条自定义滑块阴影138
- ✅ Progress Bar Custom Thumb Shadow138
- ✅ プログレスバーカスタムサムシャドウ138
- ✅ 진행 바 사용자 정의 썸 그림자138

### v138.9 音量标准化门限 | Volume Normalize Gate | 音量正規化ゲート | 볼륨 정규화 게이트
- ✅ 音量标准化门限
- ✅ Volume Normalize Gate
- ✅ 音量正規化ゲート
- ✅ 볼륨 정규화 게이트

### v138.10 历史记录自动清理138 | History Auto Clean138 | 履歴自動クリーンアップ138 | 기록 자동 정리138
- ✅ 历史记录自动清理138
- ✅ History Auto Clean138
- ✅ 履歴自動クリーンアップ138
- ✅ 기록 자동 정리138

### v138.11 播放速度预设拖动调整 | Playback Speed Presets Drag Adjust | 再生速度プリセットドラッグ調整 | 재생 속도 프리셋 드래그 조정
- ✅ 播放速度预设拖动调整
- ✅ Playback Speed Presets Drag Adjust
- ✅ 再生速度プリセットドラッグ調整
- ✅ 재생 속도 프리셋 드래그 조정

### v138.12 截图自动分享YouTube | Screenshot Auto Share YouTube | スクリーンショット自動YouTube共有 | 스크린샷 자동 YouTube 공유
- ✅ 截图自动分享YouTube
- ✅ Screenshot Auto Share YouTube
- ✅ スクリーンショット自動YouTube共有
- ✅ 스크린샷 자동 YouTube 공유

### v138.13 视频画中画跟随亮度 | Video PIP Follow Brightness | ビデオPIP明るさ追従 | 비디오 PIP 밝기 팔로우
- ✅ 视频画中画跟随亮度
- ✅ Video PIP Follow Brightness
- ✅ ビデオPIP明るさ追従
- ✅ 비디오 PIP 밝기 팔로우

### v138.14 弹幕字体背景填充裁剪半径138 | Danmaku Font BG Fill Clip Radius138 | コメントフォントBGフィルクリップ半径138 | 댓글 글꼴 배경 채우기 클립 반경138
- ✅ 弹幕字体背景填充裁剪半径138
- ✅ Danmaku Font BG Fill Clip Radius138
- ✅ コメントフォントBGフィルクリップ半径138
- ✅ 댓글 글꼴 배경 채우기 클립 반경138

### v138.15 字幕动画缩放138 | Subtitle Animation Scale138 | 字幕アニメーションスケール138 | 자막 애니메이션 스케일138
- ✅ 字幕动画缩放138
- ✅ Subtitle Animation Scale138
- ✅ 字幕アニメーションスケール138
- ✅ 자막 애니메이션 스케일138

### v139.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v139.1-v139.15 功能列表
- ✅ Audio Phaser Rate, Danmaku Font BG Fill Clip Radius139, Subtitle Animation Scale139, Gesture Tap Zone Visual Duration, Cast Video PIP Follow Volume, Playlist Auto Group By Dan Count, Cache Smart Pinning On Storage Write, Progress Bar Custom Thumb Glow139, Volume Normalize Knee, History Auto Clean139, Playback Speed Presets Swipe Adjust, Screenshot Auto Share Twitch Clip, Video PIP Follow Contrast, Danmaku Font BG Fill Clip Type, Subtitle Animation Rotate139

### v139.1 音频相位器速率 | Audio Phaser Rate | オーディオフェーザーレート | 오디오 페이저 속도
- ✅ 音频相位器速率
- ✅ Audio Phaser Rate
- ✅ オーディオフェーザーレート
- ✅ 오디오 페이저 속도

### v139.2 弹幕字体背景填充裁剪半径139 | Danmaku Font BG Fill Clip Radius139 | コメントフォントBGフィルクリップ半径139 | 댓글 글꼴 배경 채우기 클립 반경139
- ✅ 弹幕字体背景填充裁剪半径139
- ✅ Danmaku Font BG Fill Clip Radius139
- ✅ コメントフォントBGフィルクリップ半径139
- ✅ 댓글 글꼴 배경 채우기 클립 반경139

### v139.3 字幕动画缩放139 | Subtitle Animation Scale139 | 字幕アニメーションスケール139 | 자막 애니메이션 스케일139
- ✅ 字幕动画缩放139
- ✅ Subtitle Animation Scale139
- ✅ 字幕アニメーションスケール139
- ✅ 자막 애니메이션 스케일139

### v139.4 手势点击区域视觉持续时间 | Gesture Tap Zone Visual Duration | ジェスチャータップゾーン視覚持続時間 | 제스처 탭 영역 시각 지속 시간
- ✅ 手势点击区域视觉持续时间
- ✅ Gesture Tap Zone Visual Duration
- ✅ ジェスチャータップゾーン視覚持続時間
- ✅ 제스처 탭 영역 시각 지속 시간

### v139.5 投射视频画中画跟随音量 | Cast Video PIP Follow Volume | キャストビデオPIP音量追従 | 캐스트 비디오 PIP 볼륨 팔로우
- ✅ 投射视频画中画跟随音量
- ✅ Cast Video PIP Follow Volume
- ✅ キャストビデオPIP音量追従
- ✅ 캐스트 비디오 PIP 볼륨 팔로우

### v139.6 播放列表按弹幕数分组 | Playlist Auto Group By Dan Count | プレイリストコメント数別グループ化 | 재생 목록 댓글 수별 그룹화
- ✅ 播放列表按弹幕数分组
- ✅ Playlist Auto Group By Dan Count
- ✅ プレイリストコメント数別グループ化
- ✅ 재생 목록 댓글 수별 그룹화

### v139.7 缓存存储写入时智能固定 | Cache Smart Pinning On Storage Write | キャッシュストレージ書き込みスマートピンニング | 캐시 저장소 쓰기 시 스마트 고정
- ✅ 缓存存储写入时智能固定
- ✅ Cache Smart Pinning On Storage Write
- ✅ キャッシュストレージ書き込みスマートピンニング
- ✅ 캐시 저장소 쓰기 시 스마트 고정

### v139.8 进度条自定义滑块发光139 | Progress Bar Custom Thumb Glow139 | プログレスバーカスタムサムグロウ139 | 진행 바 사용자 정의 썸 글로우139
- ✅ 进度条自定义滑块发光139
- ✅ Progress Bar Custom Thumb Glow139
- ✅ プログレスバーカスタムサムグロウ139
- ✅ 진행 바 사용자 정의 썸 글로우139

### v139.9 音量标准化拐点 | Volume Normalize Knee | 音量正規化ニー | 볼륨 정규화 니
- ✅ 音量标准化拐点
- ✅ Volume Normalize Knee
- ✅ 音量正規化ニー
- ✅ 볼륨 정규화 니

### v139.10 历史记录自动清理139 | History Auto Clean139 | 履歴自動クリーンアップ139 | 기록 자동 정리139
- ✅ 历史记录自动清理139
- ✅ History Auto Clean139
- ✅ 履歴自動クリーンアップ139
- ✅ 기록 자동 정리139

### v139.11 播放速度预设滑动调整 | Playback Speed Presets Swipe Adjust | 再生速度プリセットスワイプ調整 | 재생 속도 프리셋 스와이프 조정
- ✅ 播放速度预设滑动调整
- ✅ Playback Speed Presets Swipe Adjust
- ✅ 再生速度プリセットスワイプ調整
- ✅ 재생 속도 프리셋 스와이프 조정

### v139.12 截图自动分享Twitch Clip | Screenshot Auto Share Twitch Clip | スクリーンショット自動Twitch Clip共有 | 스크린샷 자동 Twitch Clip 공유
- ✅ 截图自动分享Twitch Clip
- ✅ Screenshot Auto Share Twitch Clip
- ✅ スクリーンショット自動Twitch Clip共有
- ✅ 스크린샷 자동 Twitch Clip 공유

### v139.13 视频画中画跟随对比度 | Video PIP Follow Contrast | ビデオPIPコントラスト追従 | 비디오 PIP 대비 팔로우
- ✅ 视频画中画跟随对比度
- ✅ Video PIP Follow Contrast
- ✅ ビデオPIPコントラスト追従
- ✅ 비디오 PIP 대비 팔로우

### v139.14 弹幕字体背景填充裁剪类型 | Danmaku Font BG Fill Clip Type | コメントフォントBGフィルクリップタイプ | 댓글 글꼴 배경 채우기 클립 유형
- ✅ 弹幕字体背景填充裁剪类型
- ✅ Danmaku Font BG Fill Clip Type
- ✅ コメントフォントBGフィルクリップタイプ
- ✅ 댓글 글꼴 배경 채우기 클립 유형

### v139.15 字幕动画旋转139 | Subtitle Animation Rotate139 | 字幕アニメーションローテート139 | 자막 애니메이션 회전139
- ✅ 字幕动画旋转139
- ✅ Subtitle Animation Rotate139
- ✅ 字幕アニメーションローテート139
- ✅ 자막 애니메이션 회전139

### v140.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v140.1-v140.15 功能列表
- ✅ Audio Phaser Depth, Danmaku Font BG Fill Clip Type139, Subtitle Animation Rotate140, Gesture Tap Zone Visual Scale, Cast Video PIP Follow Saturation, Playlist Auto Group By Genre140, Cache Smart Pinning On Storage IOPS, Progress Bar Custom Thumb Border140, Volume Normalize Attack, History Auto Clean140, Playback Speed Presets Pinch Adjust, Screenshot Auto Share Bilibili, Video PIP Follow Gamma, Danmaku Font BG Fill Clip Type140, Subtitle Animation Blur140

### v140.1 音频相位器深度 | Audio Phaser Depth | オーディオフェーザー深度 | 오디오 페이저 깊이
- ✅ 音频相位器深度
- ✅ Audio Phaser Depth
- ✅ オーディオフェーザー深度
- ✅ 오디오 페이저 깊이

### v140.2 弹幕字体背景填充裁剪类型139 | Danmaku Font BG Fill Clip Type139 | コメントフォントBGフィルクリップタイプ139 | 댓글 글꼴 배경 채우기 클립 유형139
- ✅ 弹幕字体背景填充裁剪类型139
- ✅ Danmaku Font BG Fill Clip Type139
- ✅ コメントフォントBGフィルクリップタイプ139
- ✅ 댓글 글꼴 배경 채우기 클립 유형139

### v140.3 字幕动画旋转140 | Subtitle Animation Rotate140 | 字幕アニメーションローテート140 | 자막 애니메이션 회전140
- ✅ 字幕动画旋转140
- ✅ Subtitle Animation Rotate140
- ✅ 字幕アニメーションローテート140
- ✅ 자막 애니메이션 회전140

### v140.4 手势点击区域视觉缩放 | Gesture Tap Zone Visual Scale | ジェスチャータップゾーン視覚スケール | 제스처 탭 영역 시각 스케일
- ✅ 手势点击区域视觉缩放
- ✅ Gesture Tap Zone Visual Scale
- ✅ ジェスチャータップゾーン視覚スケール
- ✅ 제스처 탭 영역 시각 스케일

### v140.5 投射视频画中画跟随饱和度 | Cast Video PIP Follow Saturation | キャストビデオPIP彩度追従 | 캐스트 비디오 PIP 채도 팔로우
- ✅ 投射视频画中画跟随饱和度
- ✅ Cast Video PIP Follow Saturation
- ✅ キャストビデオPIP彩度追従
- ✅ 캐스트 비디오 PIP 채도 팔로우

### v140.6 播放列表按类型自动分组140 | Playlist Auto Group By Genre140 | プレイリストジャンル別自動グループ化140 | 재생 목록 장르별 자동 그룹화140
- ✅ 播放列表按类型自动分组140
- ✅ Playlist Auto Group By Genre140
- ✅ プレイリストジャンル別自動グループ化140
- ✅ 재생 목록 장르별 자동 그룹화140

### v140.7 缓存存储IOPS时智能固定 | Cache Smart Pinning On Storage IOPS | キャッシュストレージIOPSスマートピンニング | 캐시 저장소 IOPS 시 스마트 고정
- ✅ 缓存存储IOPS时智能固定
- ✅ Cache Smart Pinning On Storage IOPS
- ✅ キャッシュストレージIOPSスマートピンニング
- ✅ 캐시 저장소 IOPS 시 스마트 고정

### v140.8 进度条自定义滑块边框140 | Progress Bar Custom Thumb Border140 | プログレスバーカスタムサムボーダー140 | 진행 바 사용자 정의 썸 테두리140
- ✅ 进度条自定义滑块边框140
- ✅ Progress Bar Custom Thumb Border140
- ✅ プログレスバーカスタムサムボーダー140
- ✅ 진행 바 사용자 정의 썸 테두리140

### v140.9 音量标准化起音 | Volume Normalize Attack | 音量正規化アタック | 볼륨 정규화 어택
- ✅ 音量标准化起音
- ✅ Volume Normalize Attack
- ✅ 音量正規化アタック
- ✅ 볼륨 정규화 어택

### v140.10 历史记录自动清理140 | History Auto Clean140 | 履歴自動クリーンアップ140 | 기록 자동 정리140
- ✅ 历史记录自动清理140
- ✅ History Auto Clean140
- ✅ 履歴自動クリーンアップ140
- ✅ 기록 자동 정리140

### v140.11 播放速度预设捏合调整 | Playback Speed Presets Pinch Adjust | 再生速度プリセットピンチ調整 | 재생 속도 프리셋 핀치 조정
- ✅ 播放速度预设捏合调整
- ✅ Playback Speed Presets Pinch Adjust
- ✅ 再生速度プリセットピンチ調整
- ✅ 재생 속도 프리셋 핀치 조정

### v140.12 截图自动分享哔哩哔哩 | Screenshot Auto Share Bilibili | スクリーンショット自動Bilibili共有 | 스크린샷 자동 Bilibili 공유
- ✅ 截图自动分享哔哩哔哩
- ✅ Screenshot Auto Share Bilibili
- ✅ スクリーンショット自動Bilibili共有
- ✅ 스크린샷 자동 Bilibili 공유

### v140.13 视频画中画跟随伽马 | Video PIP Follow Gamma | ビデオPIPガンマ追従 | 비디오 PIP 감마 팔로우
- ✅ 视频画中画跟随伽马
- ✅ Video PIP Follow Gamma
- ✅ ビデオPIPガンマ追従
- ✅ 비디오 PIP 감마 팔로우

### v140.14 弹幕字体背景填充裁剪类型140 | Danmaku Font BG Fill Clip Type140 | コメントフォントBGフィルクリップタイプ140 | 댓글 글꼴 배경 채우기 클립 유형140
- ✅ 弹幕字体背景填充裁剪类型140
- ✅ Danmaku Font BG Fill Clip Type140
- ✅ コメントフォントBGフィルクリップタイプ140
- ✅ 댓글 글꼴 배경 채우기 클립 유형140

### v140.15 字幕动画模糊140 | Subtitle Animation Blur140 | 字幕アニメーションブラー140 | 자막 애니메이션 블러140
- ✅ 字幕动画模糊140
- ✅ Subtitle Animation Blur140
- ✅ 字幕アニメーションブラー140
- ✅ 자막 애니메이션 블러140


### v141.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v141.1-v141.15 功能列表
- ✅ Audio Phaser Feedback, Danmaku Font BG Fill Clip Type140x, Subtitle Animation Blur141, Gesture Tap Zone Visual Anim, Cast Video PIP Snap To Corner, Playlist Auto Group By Duration141, Cache Smart Pinning On Schedule Type, Progress Bar Custom Thumb Anim141, Volume Normalize Range, History Auto Clean141, Playback Speed Presets Shake Adjust, Screenshot Auto Share Discord, Video PIP Follow Color Temp, Danmaku Font BG Fill Mask Toggle, Subtitle Animation Fade In141

### v141.1 音频相位器反馈 | Audio Phaser Feedback | オーディオフェーザーフィードバック | 오디오 페이저 피드백
- ✅ 音频相位器反馈
- ✅ Audio Phaser Feedback
- ✅ オーディオフェーザーフィードバック
- ✅ 오디오 페이저 피드백

### v141.2 弹幕字体背景填充裁剪类型140x | Danmaku Font BG Fill Clip Type140x | コメントフォントBGフィルクリップタイプ140x | 댓글 글꼴 배경 채우기 클립 유형140x
- ✅ 弹幕字体背景填充裁剪类型140x
- ✅ Danmaku Font BG Fill Clip Type140x
- ✅ コメントフォントBGフィルクリップタイプ140x
- ✅ 댓글 글꼴 배경 채우기 클립 유형140x

### v141.3 字幕动画模糊141 | Subtitle Animation Blur141 | 字幕アニメーションブラー141 | 자막 애니메이션 블러141
- ✅ 字幕动画模糊141
- ✅ Subtitle Animation Blur141
- ✅ 字幕アニメーションブラー141
- ✅ 자막 애니메이션 블러141

### v141.4 手势点击区域视觉动画 | Gesture Tap Zone Visual Anim | ジェスチャータップゾーン視覚アニメーション | 제스처 탭 영역 시각 애니메이션
- ✅ 手势点击区域视觉动画
- ✅ Gesture Tap Zone Visual Anim
- ✅ ジェスチャータップゾーン視覚アニメーション
- ✅ 제스처 탭 영역 시각 애니메이션

### v141.5 投射视频画中画吸附角落 | Cast Video PIP Snap To Corner | キャストビデオPIPコーナーにスナップ | 캐스트 비디오 PIP 코너에 스냅
- ✅ 投射视频画中画吸附角落
- ✅ Cast Video PIP Snap To Corner
- ✅ キャストビデオPIPコーナーにスナップ
- ✅ 캐스트 비디오 PIP 코너에 스냅

### v141.6 播放列表按时长自动分组141 | Playlist Auto Group By Duration141 | プレイリスト再生時間別自動グループ化141 | 재생 목록 재생 시간별 자동 그룹화141
- ✅ 播放列表按时长自动分组141
- ✅ Playlist Auto Group By Duration141
- ✅ プレイリスト再生時間別自動グループ化141
- ✅ 재생 목록 재생 시간별 자동 그룹화141

### v141.7 缓存计划类型时智能固定 | Cache Smart Pinning On Schedule Type | キャッシュスケジュールタイプスマートピンニング | 캐시 스케줄 유형 시 스마트 고정
- ✅ 缓存计划类型时智能固定
- ✅ Cache Smart Pinning On Schedule Type
- ✅ キャッシュスケジュールタイプスマートピンニング
- ✅ 캐시 스케줄 유형 시 스마트 고정

### v141.8 进度条自定义滑块动画141 | Progress Bar Custom Thumb Anim141 | プログレスバーカスタムサムアニメーション141 | 진행 바 사용자 정의 썸 애니메이션141
- ✅ 进度条自定义滑块动画141
- ✅ Progress Bar Custom Thumb Anim141
- ✅ プログレスバーカスタムサムアニメーション141
- ✅ 진행 바 사용자 정의 썸 애니메이션141

### v141.9 音量标准化范围 | Volume Normalize Range | 音量正規化範囲 | 볼륨 정규화 범위
- ✅ 音量标准化范围
- ✅ Volume Normalize Range
- ✅ 音量正規化範囲
- ✅ 볼륨 정규화 범위

### v141.10 历史记录自动清理141 | History Auto Clean141 | 履歴自動クリーンアップ141 | 기록 자동 정리141
- ✅ 历史记录自动清理141
- ✅ History Auto Clean141
- ✅ 履歴自動クリーンアップ141
- ✅ 기록 자동 정리141

### v141.11 播放速度预设摇动调整 | Playback Speed Presets Shake Adjust | 再生速度プリセットシェイク調整 | 재생 속도 프리셋 흔들기 조정
- ✅ 播放速度预设摇动调整
- ✅ Playback Speed Presets Shake Adjust
- ✅ 再生速度プリセットシェイク調整
- ✅ 재생 속도 프리셋 흔들기 조정

### v141.12 截图自动分享Discord | Screenshot Auto Share Discord | スクリーンショット自動Discord共有 | 스크린샷 자동 Discord 공유
- ✅ 截图自动分享Discord
- ✅ Screenshot Auto Share Discord
- ✅ スクリーンショット自動Discord共有
- ✅ 스크린샷 자동 Discord 공유

### v141.13 视频画中画跟随色温 | Video PIP Follow Color Temp | ビデオPIP色温度追従 | 비디오 PIP 색온도 팔로우
- ✅ 视频画中画跟随色温
- ✅ Video PIP Follow Color Temp
- ✅ ビデオPIP色温度追従
- ✅ 비디오 PIP 색온도 팔로우

### v141.14 弹幕字体背景填充遮罩开关 | Danmaku Font BG Fill Mask Toggle | コメントフォントBGフィルマスク切替 | 댓글 글꼴 배경 채우기 마스크 전환
- ✅ 弹幕字体背景填充遮罩开关
- ✅ Danmaku Font BG Fill Mask Toggle
- ✅ コメントフォントBGフィルマスク切替
- ✅ 댓글 글꼴 배경 채우기 마스크 전환

### v141.15 字幕动画淡入141 | Subtitle Animation Fade In141 | 字幕アニメーションフェードイン141 | 자막 애니메이션 페이드인141
- ✅ 字幕动画淡入141
- ✅ Subtitle Animation Fade In141
- ✅ 字幕アニメーションフェードイン141
- ✅ 자막 애니메이션 페이드인141

### v142.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v142.1-v142.15 功能列表
- ✅ Audio Phaser Mix, Danmaku Font BG Fill Mask Path, Subtitle Animation Fade In142, Gesture Tap Zone Visual Anim Duration, Cast Video PIP Snap To Edge, Playlist Auto Group By Duration142, Cache Smart Pinning On Schedule Freq, Progress Bar Custom Thumb Anim142, Volume Normalize Stereo, History Auto Clean142, Playback Speed Presets Tilt Adjust, Screenshot Auto Share WhatsApp, Video PIP Follow Color Space, Danmaku Font BG Fill Mask Path141, Subtitle Animation Fade Out142

### v142.1 音频相位器混合 | Audio Phaser Mix | オーディオフェーザーミックス | 오디오 페이저 믹스
- ✅ 音频相位器混合
- ✅ Audio Phaser Mix
- ✅ オーディオフェーザーミックス
- ✅ 오디오 페이저 믹스

### v142.2 弹幕字体背景填充遮罩路径 | Danmaku Font BG Fill Mask Path | コメントフォントBGフィルマスクパス | 댓글 글꼴 배경 채우기 마스크 패스
- ✅ 弹幕字体背景填充遮罩路径
- ✅ Danmaku Font BG Fill Mask Path
- ✅ コメントフォントBGフィルマスクパス
- ✅ 댓글 글꼴 배경 채우기 마스크 패스

### v142.3 字幕动画淡入142 | Subtitle Animation Fade In142 | 字幕アニメーションフェードイン142 | 자막 애니메이션 페이드인142
- ✅ 字幕动画淡入142
- ✅ Subtitle Animation Fade In142
- ✅ 字幕アニメーションフェードイン142
- ✅ 자막 애니메이션 페이드인142

### v142.4 手势点击区域视觉动画持续 | Gesture Tap Zone Visual Anim Duration | ジェスチャータップゾーン視覚アニメーション持続 | 제스처 탭 영역 시각 애니메이션 지속
- ✅ 手势点击区域视觉动画持续
- ✅ Gesture Tap Zone Visual Anim Duration
- ✅ ジェスチャータップゾーン視覚アニメーション持続
- ✅ 제스처 탭 영역 시각 애니메이션 지속

### v142.5 投射视频画中画吸附边缘 | Cast Video PIP Snap To Edge | キャストビデオPIPエッジにスナップ | 캐스트 비디오 PIP 가장자리에 스냅
- ✅ 投射视频画中画吸附边缘
- ✅ Cast Video PIP Snap To Edge
- ✅ キャストビデオPIPエッジにスナップ
- ✅ 캐스트 비디오 PIP 가장자리에 스냅

### v142.6 播放列表按时长自动分组142 | Playlist Auto Group By Duration142 | プレイリスト再生時間別自動グループ化142 | 재생 목록 재생 시간별 자동 그룹화142
- ✅ 播放列表按时长自动分组142
- ✅ Playlist Auto Group By Duration142
- ✅ プレイリスト再生時間別自動グループ化142
- ✅ 재생 목록 재생 시간별 자동 그룹화142

### v142.7 缓存计划频率时智能固定 | Cache Smart Pinning On Schedule Freq | キャッシュスケジュール頻度スマートピンニング | 캐시 스케줄 빈도 시 스마트 고정
- ✅ 缓存计划频率时智能固定
- ✅ Cache Smart Pinning On Schedule Freq
- ✅ キャッシュスケジュール頻度スマートピンニング
- ✅ 캐시 스케줄 빈도 시 스마트 고정

### v142.8 进度条自定义滑块动画142 | Progress Bar Custom Thumb Anim142 | プログレスバーカスタムサムアニメーション142 | 진행 바 사용자 정의 썸 애니메이션142
- ✅ 进度条自定义滑块动画142
- ✅ Progress Bar Custom Thumb Anim142
- ✅ プログレスバーカスタムサムアニメーション142
- ✅ 진행 바 사용자 정의 썸 애니메이션142

### v142.9 音量标准化立体声 | Volume Normalize Stereo | 音量正規化ステレオ | 볼륨 정규화 스테레오
- ✅ 音量标准化立体声
- ✅ Volume Normalize Stereo
- ✅ 音量正規化ステレオ
- ✅ 볼륨 정규화 스테레오

### v142.10 历史记录自动清理142 | History Auto Clean142 | 履歴自動クリーンアップ142 | 기록 자동 정리142
- ✅ 历史记录自动清理142
- ✅ History Auto Clean142
- ✅ 履歴自動クリーンアップ142
- ✅ 기록 자동 정리142

### v142.11 播放速度预设倾斜调整 | Playback Speed Presets Tilt Adjust | 再生速度プリセットチルト調整 | 재생 속도 프리셋 기울기 조정
- ✅ 播放速度预设倾斜调整
- ✅ Playback Speed Presets Tilt Adjust
- ✅ 再生速度プリセットチルト調整
- ✅ 재생 속도 프리셋 기울기 조정

### v142.12 截图自动分享WhatsApp | Screenshot Auto Share WhatsApp | スクリーンショット自動WhatsApp共有 | 스크린샷 자동 WhatsApp 공유
- ✅ 截图自动分享WhatsApp
- ✅ Screenshot Auto Share WhatsApp
- ✅ スクリーンショット自動WhatsApp共有
- ✅ 스크린샷 자동 WhatsApp 공유

### v142.13 视频画中画跟随色彩空间 | Video PIP Follow Color Space | ビデオPIPカラースペース追従 | 비디오 PIP 컬러 스페이스 팔로우
- ✅ 视频画中画跟随色彩空间
- ✅ Video PIP Follow Color Space
- ✅ ビデオPIPカラースペース追従
- ✅ 비디오 PIP 컬러 스페이스 팔로우

### v142.14 弹幕字体背景填充遮罩路径141 | Danmaku Font BG Fill Mask Path141 | コメントフォントBGフィルマスクパス141 | 댓글 글꼴 배경 채우기 마스크 패스141
- ✅ 弹幕字体背景填充遮罩路径141
- ✅ Danmaku Font BG Fill Mask Path141
- ✅ コメントフォントBGフィルマスクパス141
- ✅ 댓글 글꼴 배경 채우기 마스크 패스141

### v142.15 字幕动画淡出142 | Subtitle Animation Fade Out142 | 字幕アニメーションフェードアウト142 | 자막 애니메이션 페이드아웃142
- ✅ 字幕动画淡出142
- ✅ Subtitle Animation Fade Out142
- ✅ 字幕アニメーションフェードアウト142
- ✅ 자막 애니메이션 페이드아웃142

### v143.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v143.1-v143.15 功能列表
- ✅ Audio Phaser Stages, Danmaku Font BG Fill Mask Path142, Subtitle Animation Fade Out143, Gesture Tap Zone Visual Anim Type, Cast Video PIP Snap Strength, Playlist Auto Group By Resolution, Cache Smart Pinning On Schedule Time, Progress Bar Custom Thumb Size143, Volume Normalize Mid Side, History Auto Clean143, Playback Speed Presets Proximity, Screenshot Auto Share Line, Video PIP Follow Color Bit, Danmaku Font BG Fill Mask Radius, Subtitle Animation Translate143

### v143.1 音频相位器阶段 | Audio Phaser Stages | オーディオフェーザーステージ | 오디오 페이저 스테이지
- ✅ 音频相位器阶段
- ✅ Audio Phaser Stages
- ✅ オーディオフェーザーステージ
- ✅ 오디오 페이저 스테이지

### v143.2 弹幕字体背景填充遮罩路径142 | Danmaku Font BG Fill Mask Path142 | コメントフォントBGフィルマスクパス142 | 댓글 글꼴 배경 채우기 마스크 패스142
- ✅ 弹幕字体背景填充遮罩路径142
- ✅ Danmaku Font BG Fill Mask Path142
- ✅ コメントフォントBGフィルマスクパス142
- ✅ 댓글 글꼴 배경 채우기 마스크 패스142

### v143.3 字幕动画淡出143 | Subtitle Animation Fade Out143 | 字幕アニメーションフェードアウト143 | 자막 애니메이션 페이드아웃143
- ✅ 字幕动画淡出143
- ✅ Subtitle Animation Fade Out143
- ✅ 字幕アニメーションフェードアウト143
- ✅ 자막 애니메이션 페이드아웃143

### v143.4 手势点击区域视觉动画类型 | Gesture Tap Zone Visual Anim Type | ジェスチャータップゾーン視覚アニメーションタイプ | 제스처 탭 영역 시각 애니메이션 유형
- ✅ 手势点击区域视觉动画类型
- ✅ Gesture Tap Zone Visual Anim Type
- ✅ ジェスチャータップゾーン視覚アニメーションタイプ
- ✅ 제스처 탭 영역 시각 애니메이션 유형

### v143.5 投射视频画中画吸附强度 | Cast Video PIP Snap Strength | キャストビデオPIPスナップ強度 | 캐스트 비디오 PIP 스냅 강도
- ✅ 投射视频画中画吸附强度
- ✅ Cast Video PIP Snap Strength
- ✅ キャストビデオPIPスナップ強度
- ✅ 캐스트 비디오 PIP 스냅 강도

### v143.6 播放列表按分辨率分组 | Playlist Auto Group By Resolution | プレイリスト解像度別グループ化 | 재생 목록 해상도별 그룹화
- ✅ 播放列表按分辨率分组
- ✅ Playlist Auto Group By Resolution
- ✅ プレイリスト解像度別グループ化
- ✅ 재생 목록 해상도별 그룹화

### v143.7 缓存计划时间时智能固定 | Cache Smart Pinning On Schedule Time | キャッシュスケジュール時間スマートピンニング | 캐시 스케줄 시간 시 스마트 고정
- ✅ 缓存计划时间时智能固定
- ✅ Cache Smart Pinning On Schedule Time
- ✅ キャッシュスケジュール時間スマートピンニング
- ✅ 캐시 스케줄 시간 시 스마트 고정

### v143.8 进度条自定义滑块大小143 | Progress Bar Custom Thumb Size143 | プログレスバーカスタムサムサイズ143 | 진행 바 사용자 정의 썸 크기143
- ✅ 进度条自定义滑块大小143
- ✅ Progress Bar Custom Thumb Size143
- ✅ プログレスバーカスタムサムサイズ143
- ✅ 진행 바 사용자 정의 썸 크기143

### v143.9 音量标准化中侧 | Volume Normalize Mid Side | 音量正規化ミッドサイド | 볼륨 정규화 미드 사이드
- ✅ 音量标准化中侧
- ✅ Volume Normalize Mid Side
- ✅ 音量正規化ミッドサイド
- ✅ 볼륨 정규화 미드 사이드

### v143.10 历史记录自动清理143 | History Auto Clean143 | 履歴自動クリーンアップ143 | 기록 자동 정리143
- ✅ 历史记录自动清理143
- ✅ History Auto Clean143
- ✅ 履歴自動クリーンアップ143
- ✅ 기록 자동 정리143

### v143.11 播放速度预设接近感应 | Playback Speed Presets Proximity | 再生速度プリセット近接センサー | 재생 속도 프리셋 근접 센서
- ✅ 播放速度预设接近感应
- ✅ Playback Speed Presets Proximity
- ✅ 再生速度プリセット近接センサー
- ✅ 재생 속도 프리셋 근접 센서

### v143.12 截图自动分享Line | Screenshot Auto Share Line | スクリーンショット自動Line共有 | 스크린샷 자동 Line 공유
- ✅ 截图自动分享Line
- ✅ Screenshot Auto Share Line
- ✅ スクリーンショット自動Line共有
- ✅ 스크린샷 자동 Line 공유

### v143.13 视频画中画跟随色深 | Video PIP Follow Color Bit | ビデオPIPカラービット追従 | 비디오 PIP 컬러 비트 팔로우
- ✅ 视频画中画跟随色深
- ✅ Video PIP Follow Color Bit
- ✅ ビデオPIPカラービット追従
- ✅ 비디오 PIP 컬러 비트 팔로우

### v143.14 弹幕字体背景填充遮罩半径 | Danmaku Font BG Fill Mask Radius | コメントフォントBGフィルマスク半径 | 댓글 글꼴 배경 채우기 마스크 반경
- ✅ 弹幕字体背景填充遮罩半径
- ✅ Danmaku Font BG Fill Mask Radius
- ✅ コメントフォントBGフィルマスク半径
- ✅ 댓글 글꼴 배경 채우기 마스크 반경

### v143.15 字幕动画平移143 | Subtitle Animation Translate143 | 字幕アニメーショントランスレート143 | 자막 애니메이션 이동143
- ✅ 字幕动画平移143
- ✅ Subtitle Animation Translate143
- ✅ 字幕アニメーショントランスレート143
- ✅ 자막 애니메이션 이동143

### v144.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v144.1-v144.15 功能列表
- ✅ Audio Compressor Toggle144, Danmaku Font BG Fill Mask Radius143, Subtitle Animation Translate144, Gesture Tap Zone Visual Anim Scale, Cast Video PIP Snap Offset, Playlist Auto Group By Codec, Cache Smart Pinning On Schedule Day, Progress Bar Custom Thumb Color144, Volume Normalize Multiband, History Auto Clean144, Playback Speed Presets Light Sensor, Screenshot Auto Share Instagram, Video PIP Follow HDR, Danmaku Font BG Fill Mask Radius144, Subtitle Animation Scale144

### v144.1 音频压缩器开关144 | Audio Compressor Toggle144 | オーディオコンプレッサー切替144 | 오디오 컴프레서 전환144
- ✅ 音频压缩器开关144
- ✅ Audio Compressor Toggle144
- ✅ オーディオコンプレッサー切替144
- ✅ 오디오 컴프레서 전환144

### v144.2 弹幕字体背景填充遮罩半径143 | Danmaku Font BG Fill Mask Radius143 | コメントフォントBGフィルマスク半径143 | 댓글 글꼴 배경 채우기 마스크 반경143
- ✅ 弹幕字体背景填充遮罩半径143
- ✅ Danmaku Font BG Fill Mask Radius143
- ✅ コメントフォントBGフィルマスク半径143
- ✅ 댓글 글꼴 배경 채우기 마스크 반경143

### v144.3 字幕动画平移144 | Subtitle Animation Translate144 | 字幕アニメーショントランスレート144 | 자막 애니메이션 이동144
- ✅ 字幕动画平移144
- ✅ Subtitle Animation Translate144
- ✅ 字幕アニメーショントランスレート144
- ✅ 자막 애니메이션 이동144

### v144.4 手势点击区域视觉动画缩放 | Gesture Tap Zone Visual Anim Scale | ジェスチャータップゾーン視覚アニメーションスケール | 제스처 탭 영역 시각 애니메이션 스케일
- ✅ 手势点击区域视觉动画缩放
- ✅ Gesture Tap Zone Visual Anim Scale
- ✅ ジェスチャータップゾーン視覚アニメーションスケール
- ✅ 제스처 탭 영역 시각 애니메이션 스케일

### v144.5 投射视频画中画吸附偏移 | Cast Video PIP Snap Offset | キャストビデオPIPスナップオフセット | 캐스트 비디오 PIP 스냅 오프셋
- ✅ 投射视频画中画吸附偏移
- ✅ Cast Video PIP Snap Offset
- ✅ キャストビデオPIPスナップオフセット
- ✅ 캐스트 비디오 PIP 스냅 오프셋

### v144.6 播放列表按编解码器分组 | Playlist Auto Group By Codec | プレイリストコーデック別グループ化 | 재생 목록 코덱별 그룹화
- ✅ 播放列表按编解码器分组
- ✅ Playlist Auto Group By Codec
- ✅ プレイリストコーデック別グループ化
- ✅ 재생 목록 코덱별 그룹화

### v144.7 缓存计划日时智能固定 | Cache Smart Pinning On Schedule Day | キャッシュスケジュール日スマートピンニング | 캐시 스케줄 일 시 스마트 고정
- ✅ 缓存计划日时智能固定
- ✅ Cache Smart Pinning On Schedule Day
- ✅ キャッシュスケジュール日スマートピンニング
- ✅ 캐시 스케줄 일 시 스마트 고정

### v144.8 进度条自定义滑块颜色144 | Progress Bar Custom Thumb Color144 | プログレスバーカスタムサム色144 | 진행 바 사용자 정의 썸 색상144
- ✅ 进度条自定义滑块颜色144
- ✅ Progress Bar Custom Thumb Color144
- ✅ プログレスバーカスタムサム色144
- ✅ 진행 바 사용자 정의 썸 색상144

### v144.9 音量标准化多频段 | Volume Normalize Multiband | 音量正規化マルチバンド | 볼륨 정규화 멀티밴드
- ✅ 音量标准化多频段
- ✅ Volume Normalize Multiband
- ✅ 音量正規化マルチバンド
- ✅ 볼륨 정규화 멀티밴드

### v144.10 历史记录自动清理144 | History Auto Clean144 | 履歴自動クリーンアップ144 | 기록 자동 정리144
- ✅ 历史记录自动清理144
- ✅ History Auto Clean144
- ✅ 履歴自動クリーンアップ144
- ✅ 기록 자동 정리144

### v144.11 播放速度预设光线传感器 | Playback Speed Presets Light Sensor | 再生速度プリセット光センサー | 재생 속도 프리셋 광 센서
- ✅ 播放速度预设光线传感器
- ✅ Playback Speed Presets Light Sensor
- ✅ 再生速度プリセット光センサー
- ✅ 재생 속도 프리셋 광 센서

### v144.12 截图自动分享Instagram | Screenshot Auto Share Instagram | スクリーンショット自動Instagram共有 | 스크린샷 자동 Instagram 공유
- ✅ 截图自动分享Instagram
- ✅ Screenshot Auto Share Instagram
- ✅ スクリーンショット自動Instagram共有
- ✅ 스크린샷 자동 Instagram 공유

### v144.13 视频画中画跟随HDR | Video PIP Follow HDR | ビデオPIP HDR追従 | 비디오 PIP HDR 팔로우
- ✅ 视频画中画跟随HDR
- ✅ Video PIP Follow HDR
- ✅ ビデオPIP HDR追従
- ✅ 비디오 PIP HDR 팔로우

### v144.14 弹幕字体背景填充遮罩半径144 | Danmaku Font BG Fill Mask Radius144 | コメントフォントBGフィルマスク半径144 | 댓글 글꼴 배경 채우기 마스크 반경144
- ✅ 弹幕字体背景填充遮罩半径144
- ✅ Danmaku Font BG Fill Mask Radius144
- ✅ コメントフォントBGフィルマスク半径144
- ✅ 댓글 글꼴 배경 채우기 마스크 반경144

### v144.15 字幕动画缩放144 | Subtitle Animation Scale144 | 字幕アニメーションスケール144 | 자막 애니메이션 스케일144
- ✅ 字幕动画缩放144
- ✅ Subtitle Animation Scale144
- ✅ 字幕アニメーションスケール144
- ✅ 자막 애니메이션 스케일144

### v145.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v145.1-v145.15 功能列表
- ✅ Audio Compressor Threshold, Danmaku Font BG Fill Mask Radius145, Subtitle Animation Scale145, Gesture Tap Zone Visual Anim Opacity, Cast Video PIP Snap Duration, Playlist Auto Group By Bitrate, Cache Smart Pinning On Schedule Hour, Progress Bar Custom Thumb Glow145, Volume Normalize Auto Gain, History Auto Clean145, Playback Speed Presets Gyro Adjust, Screenshot Auto Share Facebook, Video PIP Follow HDR10, Danmaku Font BG Fill Mask Type, Subtitle Animation Rotate145

### v145.1 音频压缩器阈值 | Audio Compressor Threshold | オーディオコンプレッサーしきい値 | 오디오 컴프레서 임계값
- ✅ 音频压缩器阈值
- ✅ Audio Compressor Threshold
- ✅ オーディオコンプレッサーしきい値
- ✅ 오디오 컴프레서 임계값

### v145.2 弹幕字体背景填充遮罩半径145 | Danmaku Font BG Fill Mask Radius145 | コメントフォントBGフィルマスク半径145 | 댓글 글꼴 배경 채우기 마스크 반경145
- ✅ 弹幕字体背景填充遮罩半径145
- ✅ Danmaku Font BG Fill Mask Radius145
- ✅ コメントフォントBGフィルマスク半径145
- ✅ 댓글 글꼴 배경 채우기 마스크 반경145

### v145.3 字幕动画缩放145 | Subtitle Animation Scale145 | 字幕アニメーションスケール145 | 자막 애니메이션 스케일145
- ✅ 字幕动画缩放145
- ✅ Subtitle Animation Scale145
- ✅ 字幕アニメーションスケール145
- ✅ 자막 애니메이션 스케일145

### v145.4 手势点击区域视觉动画透明度 | Gesture Tap Zone Visual Anim Opacity | ジェスチャータップゾーン視覚アニメーション透明度 | 제스처 탭 영역 시각 애니메이션 불투명도
- ✅ 手势点击区域视觉动画透明度
- ✅ Gesture Tap Zone Visual Anim Opacity
- ✅ ジェスチャータップゾーン視覚アニメーション透明度
- ✅ 제스처 탭 영역 시각 애니메이션 불투명도

### v145.5 投射视频画中画吸附持续 | Cast Video PIP Snap Duration | キャストビデオPIPスナップ持続時間 | 캐스트 비디오 PIP 스냅 지속 시간
- ✅ 投射视频画中画吸附持续
- ✅ Cast Video PIP Snap Duration
- ✅ キャストビデオPIPスナップ持続時間
- ✅ 캐스트 비디오 PIP 스냅 지속 시간

### v145.6 播放列表按比特率分组 | Playlist Auto Group By Bitrate | プレイリストビットレート別グループ化 | 재생 목록 비트레이트별 그룹화
- ✅ 播放列表按比特率分组
- ✅ Playlist Auto Group By Bitrate
- ✅ プレイリストビットレート別グループ化
- ✅ 재생 목록 비트레이트별 그룹화

### v145.7 缓存计划小时时智能固定 | Cache Smart Pinning On Schedule Hour | キャッシュスケジュール時間スマートピンニング | 캐시 스케줄 시간 시 스마트 고정
- ✅ 缓存计划小时时智能固定
- ✅ Cache Smart Pinning On Schedule Hour
- ✅ キャッシュスケジュール時間スマートピンニング
- ✅ 캐시 스케줄 시간 시 스마트 고정

### v145.8 进度条自定义滑块发光145 | Progress Bar Custom Thumb Glow145 | プログレスバーカスタムサムグロウ145 | 진행 바 사용자 정의 썸 글로우145
- ✅ 进度条自定义滑块发光145
- ✅ Progress Bar Custom Thumb Glow145
- ✅ プログレスバーカスタムサムグロウ145
- ✅ 진행 바 사용자 정의 썸 글로우145

### v145.9 音量标准化自动增益 | Volume Normalize Auto Gain | 音量正規化自動ゲイン | 볼륨 정규화 자동 게인
- ✅ 音量标准化自动增益
- ✅ Volume Normalize Auto Gain
- ✅ 音量正規化自動ゲイン
- ✅ 볼륨 정규화 자동 게인

### v145.10 历史记录自动清理145 | History Auto Clean145 | 履歴自動クリーンアップ145 | 기록 자동 정리145
- ✅ 历史记录自动清理145
- ✅ History Auto Clean145
- ✅ 履歴自動クリーンアップ145
- ✅ 기록 자동 정리145

### v145.11 播放速度预设陀螺仪调整 | Playback Speed Presets Gyro Adjust | 再生速度プリセットジャイロ調整 | 재생 속도 프리셋 자이로 조정
- ✅ 播放速度预设陀螺仪调整
- ✅ Playback Speed Presets Gyro Adjust
- ✅ 再生速度プリセットジャイロ調整
- ✅ 재생 속도 프리셋 자이로 조정

### v145.12 截图自动分享Facebook | Screenshot Auto Share Facebook | スクリーンショット自動Facebook共有 | 스크린샷 자동 Facebook 공유
- ✅ 截图自动分享Facebook
- ✅ Screenshot Auto Share Facebook
- ✅ スクリーンショット自動Facebook共有
- ✅ 스크린샷 자동 Facebook 공유

### v145.13 视频画中画跟随HDR10 | Video PIP Follow HDR10 | ビデオPIP HDR10追従 | 비디오 PIP HDR10 팔로우
- ✅ 视频画中画跟随HDR10
- ✅ Video PIP Follow HDR10
- ✅ ビデオPIP HDR10追従
- ✅ 비디오 PIP HDR10 팔로우

### v145.14 弹幕字体背景填充遮罩类型 | Danmaku Font BG Fill Mask Type | コメントフォントBGフィルマスクタイプ | 댓글 글꼴 배경 채우기 마스크 유형
- ✅ 弹幕字体背景填充遮罩类型
- ✅ Danmaku Font BG Fill Mask Type
- ✅ コメントフォントBGフィルマスクタイプ
- ✅ 댓글 글꼴 배경 채우기 마스크 유형

### v145.15 字幕动画旋转145 | Subtitle Animation Rotate145 | 字幕アニメーションローテート145 | 자막 애니메이션 회전145
- ✅ 字幕动画旋转145
- ✅ Subtitle Animation Rotate145
- ✅ 字幕アニメーションローテート145
- ✅ 자막 애니메이션 회전145

### v146.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v146.1-v146.15 功能列表
- ✅ Audio Compressor Ratio, Danmaku Font BG Fill Mask Type145, Subtitle Animation Rotate146, Gesture Tap Zone Visual Anim Color, Cast Video PIP Snap Animation, Playlist Auto Group By Fps, Cache Smart Pinning On Schedule Minute, Progress Bar Custom Thumb Border146, Volume Normalize Look Ahead, History Auto Clean146, Playback Speed Presets Accel Adjust, Screenshot Auto Share Twitter, Video PIP Follow Dolby, Danmaku Font BG Fill Mask Type146, Subtitle Animation Blur146

### v146.1 音频压缩器比率 | Audio Compressor Ratio | オーディオコンプレッサー比率 | 오디오 컴프레서 비율
- ✅ 音频压缩器比率
- ✅ Audio Compressor Ratio
- ✅ オーディオコンプレッサー比率
- ✅ 오디오 컴프레서 비율

### v146.2 弹幕字体背景填充遮罩类型145 | Danmaku Font BG Fill Mask Type145 | コメントフォントBGフィルマスクタイプ145 | 댓글 글꼴 배경 채우기 마스크 유형145
- ✅ 弹幕字体背景填充遮罩类型145
- ✅ Danmaku Font BG Fill Mask Type145
- ✅ コメントフォントBGフィルマスクタイプ145
- ✅ 댓글 글꼴 배경 채우기 마스크 유형145

### v146.3 字幕动画旋转146 | Subtitle Animation Rotate146 | 字幕アニメーションローテート146 | 자막 애니메이션 회전146
- ✅ 字幕动画旋转146
- ✅ Subtitle Animation Rotate146
- ✅ 字幕アニメーションローテート146
- ✅ 자막 애니메이션 회전146

### v146.4 手势点击区域视觉动画颜色 | Gesture Tap Zone Visual Anim Color | ジェスチャータップゾーン視覚アニメーション色 | 제스처 탭 영역 시각 애니메이션 색상
- ✅ 手势点击区域视觉动画颜色
- ✅ Gesture Tap Zone Visual Anim Color
- ✅ ジェスチャータップゾーン視覚アニメーション色
- ✅ 제스처 탭 영역 시각 애니메이션 색상

### v146.5 投射视频画中画吸附动画 | Cast Video PIP Snap Animation | キャストビデオPIPスナップアニメーション | 캐스트 비디오 PIP 스냅 애니메이션
- ✅ 投射视频画中画吸附动画
- ✅ Cast Video PIP Snap Animation
- ✅ キャストビデオPIPスナップアニメーション
- ✅ 캐스트 비디오 PIP 스냅 애니메이션

### v146.6 播放列表按帧率分组 | Playlist Auto Group By Fps | プレイリストフレームレート別グループ化 | 재생 목록 프레임레이트별 그룹화
- ✅ 播放列表按帧率分组
- ✅ Playlist Auto Group By Fps
- ✅ プレイリストフレームレート別グループ化
- ✅ 재생 목록 프레임레이트별 그룹화

### v146.7 缓存计划分钟时智能固定 | Cache Smart Pinning On Schedule Minute | キャッシュスケジュール分スマートピンニング | 캐시 스케줄 분 시 스마트 고정
- ✅ 缓存计划分钟时智能固定
- ✅ Cache Smart Pinning On Schedule Minute
- ✅ キャッシュスケジュール分スマートピンニング
- ✅ 캐시 스케줄 분 시 스마트 고정

### v146.8 进度条自定义滑块边框146 | Progress Bar Custom Thumb Border146 | プログレスバーカスタムサムボーダー146 | 진행 바 사용자 정의 썸 테두리146
- ✅ 进度条自定义滑块边框146
- ✅ Progress Bar Custom Thumb Border146
- ✅ プログレスバーカスタムサムボーダー146
- ✅ 진행 바 사용자 정의 썸 테두리146

### v146.9 音量标准化前瞻 | Volume Normalize Look Ahead | 音量正規化ルックアヘッド | 볼륨 정규화 룩어헤드
- ✅ 音量标准化前瞻
- ✅ Volume Normalize Look Ahead
- ✅ 音量正規化ルックアヘッド
- ✅ 볼륨 정규화 룩어헤드

### v146.10 历史记录自动清理146 | History Auto Clean146 | 履歴自動クリーンアップ146 | 기록 자동 정리146
- ✅ 历史记录自动清理146
- ✅ History Auto Clean146
- ✅ 履歴自動クリーンアップ146
- ✅ 기록 자동 정리146

### v146.11 播放速度预设加速度调整 | Playback Speed Presets Accel Adjust | 再生速度プリセット加速度調整 | 재생 속도 프리셋 가속도 조정
- ✅ 播放速度预设加速度调整
- ✅ Playback Speed Presets Accel Adjust
- ✅ 再生速度プリセット加速度調整
- ✅ 재생 속도 프리셋 가속도 조정

### v146.12 截图自动分享Twitter | Screenshot Auto Share Twitter | スクリーンショット自動Twitter共有 | 스크린샷 자동 Twitter 공유
- ✅ 截图自动分享Twitter
- ✅ Screenshot Auto Share Twitter
- ✅ スクリーンショット自動Twitter共有
- ✅ 스크린샷 자동 Twitter 공유

### v146.13 视频画中画跟随杜比 | Video PIP Follow Dolby | ビデオドルビー追従 | 비디오 PIP 돌비 팔로우
- ✅ 视频画中画跟随杜比
- ✅ Video PIP Follow Dolby
- ✅ ビデオドルビー追従
- ✅ 비디오 PIP 돌비 팔로우

### v146.14 弹幕字体背景填充遮罩类型146 | Danmaku Font BG Fill Mask Type146 | コメントフォントBGフィルマスクタイプ146 | 댓글 글꼴 배경 채우기 마스크 유형146
- ✅ 弹幕字体背景填充遮罩类型146
- ✅ Danmaku Font BG Fill Mask Type146
- ✅ コメントフォントBGフィルマスクタイプ146
- ✅ 댓글 글꼴 배경 채우기 마스크 유형146

### v146.15 字幕动画模糊146 | Subtitle Animation Blur146 | 字幕アニメーションブラー146 | 자막 애니메이션 블러146
- ✅ 字幕动画模糊146
- ✅ Subtitle Animation Blur146
- ✅ 字幕アニメーションブラー146
- ✅ 자막 애니메이션 블러146

### v147.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v147.1-v147.15 功能列表
- ✅ Audio Compressor Attack, Danmaku Font BG Fill Mask Type147, Subtitle Animation Blur147, Gesture Tap Zone Visual Anim Blur, Cast Video PIP Snap Bounce, Playlist Auto Group By Aspect Ratio, Cache Smart Pinning On Schedule Repeat, Progress Bar Custom Thumb Shadow147, Volume Normalize Release, History Auto Clean147, Playback Speed Presets Voice Control, Screenshot Auto Share LinkedIn, Video PIP Follow Dolby Vision, Danmaku Font BG Fill Mask Opacity, Subtitle Animation Fade In147

### v147.1 音频压缩器起音 | Audio Compressor Attack | オーディオコンプレッサーアタック | 오디오 컴프레서 어택
- ✅ 音频压缩器起音
- ✅ Audio Compressor Attack
- ✅ オーディオコンプレッサーアタック
- ✅ 오디오 컴프레서 어택

### v147.2 弹幕字体背景填充遮罩类型147 | Danmaku Font BG Fill Mask Type147 | コメントフォントBGフィルマスクタイプ147 | 댓글 글꼴 배경 채우기 마스크 유형147
- ✅ 弹幕字体背景填充遮罩类型147
- ✅ Danmaku Font BG Fill Mask Type147
- ✅ コメントフォントBGフィルマスクタイプ147
- ✅ 댓글 글꼴 배경 채우기 마스크 유형147

### v147.3 字幕动画模糊147 | Subtitle Animation Blur147 | 字幕アニメーションブラー147 | 자막 애니메이션 블러147
- ✅ 字幕动画模糊147
- ✅ Subtitle Animation Blur147
- ✅ 字幕アニメーションブラー147
- ✅ 자막 애니메이션 블러147

### v147.4 手势点击区域视觉动画模糊 | Gesture Tap Zone Visual Anim Blur | ジェスチャータップゾーン視覚アニメーションブラー | 제스처 탭 영역 시각 애니메이션 블러
- ✅ 手势点击区域视觉动画模糊
- ✅ Gesture Tap Zone Visual Anim Blur
- ✅ ジェスチャータップゾーン視覚アニメーションブラー
- ✅ 제스처 탭 영역 시각 애니메이션 블러

### v147.5 投射视频画中画吸附弹跳 | Cast Video PIP Snap Bounce | キャストビデオPIPスナップバウンス | 캐스트 비디오 PIP 스냅 바운스
- ✅ 投射视频画中画吸附弹跳
- ✅ Cast Video PIP Snap Bounce
- ✅ キャストビデオPIPスナップバウンス
- ✅ 캐스트 비디오 PIP 스냅 바운스

### v147.6 播放列表按宽高比分组 | Playlist Auto Group By Aspect Ratio | プレイリストアスペクト比別グループ化 | 재생 목록 종횡비별 그룹화
- ✅ 播放列表按宽高比分组
- ✅ Playlist Auto Group By Aspect Ratio
- ✅ プレイリストアスペクト比別グループ化
- ✅ 재생 목록 종횡비별 그룹화

### v147.7 缓存计划重复时智能固定 | Cache Smart Pinning On Schedule Repeat | キャッシュスケジュール繰り返しスマートピンニング | 캐시 스케줄 반복 시 스마트 고정
- ✅ 缓存计划重复时智能固定
- ✅ Cache Smart Pinning On Schedule Repeat
- ✅ キャッシュスケジュール繰り返しスマートピンニング
- ✅ 캐시 스케줄 반복 시 스마트 고정

### v147.8 进度条自定义滑块阴影147 | Progress Bar Custom Thumb Shadow147 | プログレスバーカスタムサムシャドウ147 | 진행 바 사용자 정의 썸 그림자147
- ✅ 进度条自定义滑块阴影147
- ✅ Progress Bar Custom Thumb Shadow147
- ✅ プログレスバーカスタムサムシャドウ147
- ✅ 진행 바 사용자 정의 썸 그림자147

### v147.9 音量标准化释放 | Volume Normalize Release | 音量正規化リリース | 볼륨 정규화 릴리스
- ✅ 音量标准化释放
- ✅ Volume Normalize Release
- ✅ 音量正規化リリース
- ✅ 볼륨 정규화 릴리스

### v147.10 历史记录自动清理147 | History Auto Clean147 | 履歴自動クリーンアップ147 | 기록 자동 정리147
- ✅ 历史记录自动清理147
- ✅ History Auto Clean147
- ✅ 履歴自動クリーンアップ147
- ✅ 기록 자동 정리147

### v147.11 播放速度预设语音控制 | Playback Speed Presets Voice Control | 再生速度プリセット音声制御 | 재생 속도 프리셋 음성 제어
- ✅ 播放速度预设语音控制
- ✅ Playback Speed Presets Voice Control
- ✅ 再生速度プリセット音声制御
- ✅ 재생 속도 프리셋 음성 제어

### v147.12 截图自动分享LinkedIn | Screenshot Auto Share LinkedIn | スクリーンショット自動LinkedIn共有 | 스크린샷 자동 LinkedIn 공유
- ✅ 截图自动分享LinkedIn
- ✅ Screenshot Auto Share LinkedIn
- ✅ スクリーンショット自動LinkedIn共有
- ✅ 스크린샷 자동 LinkedIn 공유

### v147.13 视频画中画跟随杜比视界 | Video PIP Follow Dolby Vision | ビデオPIPドルビービジョン追従 | 비디오 PIP 돌비 비전 팔로우
- ✅ 视频画中画跟随杜比视界
- ✅ Video PIP Follow Dolby Vision
- ✅ ビデオPIPドルビービジョン追従
- ✅ 비디오 PIP 돌비 비전 팔로우

### v147.14 弹幕字体背景填充遮罩透明度 | Danmaku Font BG Fill Mask Opacity | コメントフォントBGフィルマスク透明度 | 댓글 글꼴 배경 채우기 마스크 불투명도
- ✅ 弹幕字体背景填充遮罩透明度
- ✅ Danmaku Font BG Fill Mask Opacity
- ✅ コメントフォントBGフィルマスク透明度
- ✅ 댓글 글꼴 배경 채우기 마스크 불투명도

### v147.15 字幕动画淡入147 | Subtitle Animation Fade In147 | 字幕アニメーションフェードイン147 | 자막 애니메이션 페이드인147
- ✅ 字幕动画淡入147
- ✅ Subtitle Animation Fade In147
- ✅ 字幕アニメーションフェードイン147
- ✅ 자막 애니메이션 페이드인147

### v148.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v148.1-v148.15 功能列表
- ✅ Audio Compressor Release, Danmaku Font BG Fill Mask Opacity147, Subtitle Animation Fade In148, Gesture Tap Zone Visual Anim Delay, Cast Video PIP Snap Elastic, Playlist Auto Group By Size, Cache Smart Pinning On Schedule Notify, Progress Bar Custom Thumb Glow148, Volume Normalize Knee Width, History Auto Clean148, Playback Speed Presets Face Detect, Screenshot Auto Share Pinterest148, Video PIP Follow Atmos, Danmaku Font BG Fill Mask Opacity148, Subtitle Animation Fade Out148

### v148.1 音频压缩器释放 | Audio Compressor Release | オーディオコンプレッサーリリース | 오디오 컴프레서 릴리스
- ✅ 音频压缩器释放
- ✅ Audio Compressor Release
- ✅ オーディオコンプレッサーリリース
- ✅ 오디오 컴프레서 릴리스

### v148.2 弹幕字体背景填充遮罩透明度147 | Danmaku Font BG Fill Mask Opacity147 | コメントフォントBGフィルマスク透明度147 | 댓글 글꼴 배경 채우기 마스크 불투명도147
- ✅ 弹幕字体背景填充遮罩透明度147
- ✅ Danmaku Font BG Fill Mask Opacity147
- ✅ コメントフォントBGフィルマスク透明度147
- ✅ 댓글 글꼴 배경 채우기 마스크 불투명도147

### v148.3 字幕动画淡入148 | Subtitle Animation Fade In148 | 字幕アニメーションフェードイン148 | 자막 애니메이션 페이드인148
- ✅ 字幕动画淡入148
- ✅ Subtitle Animation Fade In148
- ✅ 字幕アニメーションフェードイン148
- ✅ 자막 애니메이션 페이드인148

### v148.4 手势点击区域视觉动画延迟 | Gesture Tap Zone Visual Anim Delay | ジェスチャータップゾーン視覚アニメーション遅延 | 제스처 탭 영역 시각 애니메이션 지연
- ✅ 手势点击区域视觉动画延迟
- ✅ Gesture Tap Zone Visual Anim Delay
- ✅ ジェスチャータップゾーン視覚アニメーション遅延
- ✅ 제스처 탭 영역 시각 애니메이션 지연

### v148.5 投射视频画中画吸附弹性 | Cast Video PIP Snap Elastic | キャストビデオPIPスナップエラスティック | 캐스트 비디오 PIP 스냅 탄성
- ✅ 投射视频画中画吸附弹性
- ✅ Cast Video PIP Snap Elastic
- ✅ キャストビデオPIPスナップエラスティック
- ✅ 캐스트 비디오 PIP 스냅 탄성

### v148.6 播放列表按大小分组 | Playlist Auto Group By Size | プレイリストサイズ別グループ化 | 재생 목록 크기별 그룹화
- ✅ 播放列表按大小分组
- ✅ Playlist Auto Group By Size
- ✅ プレイリストサイズ別グループ化
- ✅ 재생 목록 크기별 그룹화

### v148.7 缓存计划通知时智能固定 | Cache Smart Pinning On Schedule Notify | キャッシュスケジュール通知スマートピンニング | 캐시 스케줄 알림 시 스마트 고정
- ✅ 缓存计划通知时智能固定
- ✅ Cache Smart Pinning On Schedule Notify
- ✅ キャッシュスケジュール通知スマートピンニング
- ✅ 캐시 스케줄 알림 시 스마트 고정

### v148.8 进度条自定义滑块发光148 | Progress Bar Custom Thumb Glow148 | プログレスバーカスタムサムグロウ148 | 진행 바 사용자 정의 썸 글로우148
- ✅ 进度条自定义滑块发光148
- ✅ Progress Bar Custom Thumb Glow148
- ✅ プログレスバーカスタムサムグロウ148
- ✅ 진행 바 사용자 정의 썸 글로우148

### v148.9 音量标准化拐点宽度 | Volume Normalize Knee Width | 音量正規化ニーウィズ | 볼륨 정규화 니 너비
- ✅ 音量标准化拐点宽度
- ✅ Volume Normalize Knee Width
- ✅ 音量正規化ニーウィズ
- ✅ 볼륨 정규화 니 너비

### v148.10 历史记录自动清理148 | History Auto Clean148 | 履歴自動クリーンアップ148 | 기록 자동 정리148
- ✅ 历史记录自动清理148
- ✅ History Auto Clean148
- ✅ 履歴自動クリーンアップ148
- ✅ 기록 자동 정리148

### v148.11 播放速度预设面部检测 | Playback Speed Presets Face Detect | 再生速度プリセット顔検出 | 재생 속도 프리셋 얼굴 감지
- ✅ 播放速度预设面部检测
- ✅ Playback Speed Presets Face Detect
- ✅ 再生速度プリセット顔検出
- ✅ 재생 속도 프리셋 얼굴 감지

### v148.12 截图自动分享Pinterest148 | Screenshot Auto Share Pinterest148 | スクリーンショット自動Pinterest148共有 | 스크린샷 자동 Pinterest148 공유
- ✅ 截图自动分享Pinterest148
- ✅ Screenshot Auto Share Pinterest148
- ✅ スクリーンショット自動Pinterest148共有
- ✅ 스크린샷 자동 Pinterest148 공유

### v148.13 视频画中画跟随Atmos | Video PIP Follow Atmos | ビデオPIP Atmos追従 | 비디오 PIP Atmos 팔로우
- ✅ 视频画中画跟随Atmos
- ✅ Video PIP Follow Atmos
- ✅ ビデオPIP Atmos追従
- ✅ 비디오 PIP Atmos 팔로우

### v148.14 弹幕字体背景填充遮罩透明度148 | Danmaku Font BG Fill Mask Opacity148 | コメントフォントBGフィルマスク透明度148 | 댓글 글꼴 배경 채우기 마스크 불투명도148
- ✅ 弹幕字体背景填充遮罩透明度148
- ✅ Danmaku Font BG Fill Mask Opacity148
- ✅ コメントフォントBGフィルマスク透明度148
- ✅ 댓글 글꼴 배경 채우기 마스크 불투명도148

### v148.15 字幕动画淡出148 | Subtitle Animation Fade Out148 | 字幕アニメーションフェードアウト148 | 자막 애니메이션 페이드아웃148
- ✅ 字幕动画淡出148
- ✅ Subtitle Animation Fade Out148
- ✅ 字幕アニメーションフェードアウト148
- ✅ 자막 애니메이션 페이드아웃148

### v149.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v149.1-v149.15 功能列表
- ✅ Audio Compressor Knee, Danmaku Font BG Fill Mask Blend Mode, Subtitle Animation Fade Out149, Gesture Tap Zone Visual Anim Repeat, Cast Video PIP Snap Friction, Playlist Auto Group By Length149, Cache Smart Pinning On Schedule Log, Progress Bar Custom Thumb Border149, Volume Normalize Link Channels, History Auto Clean149, Playback Speed Presets Eye Track, Screenshot Auto Share VK149, Video PIP Follow Spatial, Danmaku Font BG Fill Mask Blend Mode149, Subtitle Animation Translate149

### v149.1 音频压缩器拐点 | Audio Compressor Knee | オーディオコンプレッサーニー | 오디오 컴프레서 니
- ✅ 音频压缩器拐点
- ✅ Audio Compressor Knee
- ✅ オーディオコンプレッサーニー
- ✅ 오디오 컴프레서 니

### v149.2 弹幕字体背景填充遮罩混合模式 | Danmaku Font BG Fill Mask Blend Mode | コメントフォントBGフィルマスクブレンドモード | 댓글 글꼴 배경 채우기 마스크 블렌드 모드
- ✅ 弹幕字体背景填充遮罩混合模式
- ✅ Danmaku Font BG Fill Mask Blend Mode
- ✅ コメントフォントBGフィルマスクブレンドモード
- ✅ 댓글 글꼴 배경 채우기 마스크 블렌드 모드

### v149.3 字幕动画淡出149 | Subtitle Animation Fade Out149 | 字幕アニメーションフェードアウト149 | 자막 애니메이션 페이드아웃149
- ✅ 字幕动画淡出149
- ✅ Subtitle Animation Fade Out149
- ✅ 字幕アニメーションフェードアウト149
- ✅ 자막 애니메이션 페이드아웃149

### v149.4 手势点击区域视觉动画重复 | Gesture Tap Zone Visual Anim Repeat | ジェスチャータップゾーン視覚アニメーション繰り返し | 제스처 탭 영역 시각 애니메이션 반복
- ✅ 手势点击区域视觉动画重复
- ✅ Gesture Tap Zone Visual Anim Repeat
- ✅ ジェスチャータップゾーン視覚アニメーション繰り返し
- ✅ 제스처 탭 영역 시각 애니메이션 반복

### v149.5 投射视频画中画吸附摩擦 | Cast Video PIP Snap Friction | キャストビデオPIPスナップ摩擦 | 캐스트 비디오 PIP 스냅 마찰
- ✅ 投射视频画中画吸附摩擦
- ✅ Cast Video PIP Snap Friction
- ✅ キャストビデオPIPスナップ摩擦
- ✅ 캐스트 비디오 PIP 스냅 마찰

### v149.6 播放列表按时长自动分组149 | Playlist Auto Group By Length149 | プレイリスト長さ別自動グループ化149 | 재생 목록 길이별 자동 그룹화149
- ✅ 播放列表按时长自动分组149
- ✅ Playlist Auto Group By Length149
- ✅ プレイリスト長さ別自動グループ化149
- ✅ 재생 목록 길이별 자동 그룹화149

### v149.7 缓存计划日志时智能固定 | Cache Smart Pinning On Schedule Log | キャッシュスケジュールログスマートピンニング | 캐시 스케줄 로그 시 스마트 고정
- ✅ 缓存计划日志时智能固定
- ✅ Cache Smart Pinning On Schedule Log
- ✅ キャッシュスケジュールログスマートピンニング
- ✅ 캐시 스케줄 로그 시 스마트 고정

### v149.8 进度条自定义滑块边框149 | Progress Bar Custom Thumb Border149 | プログレスバーカスタムサムボーダー149 | 진행 바 사용자 정의 썸 테두리149
- ✅ 进度条自定义滑块边框149
- ✅ Progress Bar Custom Thumb Border149
- ✅ プログレスバーカスタムサムボーダー149
- ✅ 진행 바 사용자 정의 썸 테두리149

### v149.9 音量标准化链接通道 | Volume Normalize Link Channels | 音量正規化リンクチャネル | 볼륨 정규화 링크 채널
- ✅ 音量标准化链接通道
- ✅ Volume Normalize Link Channels
- ✅ 音量正規化リンクチャネル
- ✅ 볼륨 정규화 링크 채널

### v149.10 历史记录自动清理149 | History Auto Clean149 | 履歴自動クリーンアップ149 | 기록 자동 정리149
- ✅ 历史记录自动清理149
- ✅ History Auto Clean149
- ✅ 履歴自動クリーンアップ149
- ✅ 기록 자동 정리149

### v149.11 播放速度预设眼动追踪 | Playback Speed Presets Eye Track | 再生速度プリセットアイトラッキング | 재생 속도 프리셋 아이 트래킹
- ✅ 播放速度预设眼动追踪
- ✅ Playback Speed Presets Eye Track
- ✅ 再生速度プリセットアイトラッキング
- ✅ 재생 속도 프리셋 아이 트래킹

### v149.12 截图自动分享VK149 | Screenshot Auto Share VK149 | スクリーンショット自動VK149共有 | 스크린샷 자동 VK149 공유
- ✅ 截图自动分享VK149
- ✅ Screenshot Auto Share VK149
- ✅ スクリーンショット自動VK149共有
- ✅ 스크린샷 자동 VK149 공유

### v149.13 视频画中画跟随空间音频 | Video PIP Follow Spatial | ビデオPIP空間オーディオ追従 | 비디오 PIP 공간 오디오 팔로우
- ✅ 视频画中画跟随空间音频
- ✅ Video PIP Follow Spatial
- ✅ ビデオPIP空間オーディオ追従
- ✅ 비디오 PIP 공간 오디오 팔로우

### v149.14 弹幕字体背景填充遮罩混合模式149 | Danmaku Font BG Fill Mask Blend Mode149 | コメントフォントBGフィルマスクブレンドモード149 | 댓글 글꼴 배경 채우기 마스크 블렌드 모드149
- ✅ 弹幕字体背景填充遮罩混合模式149
- ✅ Danmaku Font BG Fill Mask Blend Mode149
- ✅ コメントフォントBGフィルマスクブレンドモード149
- ✅ 댓글 글꼴 배경 채우기 마스크 블렌드 모드149

### v149.15 字幕动画平移149 | Subtitle Animation Translate149 | 字幕アニメーショントランスレート149 | 자막 애니메이션 이동149
- ✅ 字幕动画平移149
- ✅ Subtitle Animation Translate149
- ✅ 字幕アニメーショントランスレート149
- ✅ 자막 애니메이션 이동149

### v150.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v150.1-v150.15 功能列表
- ✅ Audio Limiter Toggle150, Danmaku Font BG Fill Mask Blend Mode150, Subtitle Animation Translate150, Gesture Tap Zone Visual Anim Loop, Cast Video PIP Snap Tension, Playlist Auto Group By Date150, Cache Smart Pinning On Schedule Retry, Progress Bar Custom Thumb Color150, Volume Normalize Bypass, History Auto Clean150, Playback Speed Presets Biometric, Screenshot Auto Share Email, Video PIP Follow Immersive, Danmaku Font BG Fill Mask Invert, Subtitle Animation Scale150

### v150.1 音频限制器开关150 | Audio Limiter Toggle150 | オーディオリミッター切替150 | 오디오 리미터 전환150
- ✅ 音频限制器开关150
- ✅ Audio Limiter Toggle150
- ✅ オーディオリミッター切替150
- ✅ 오디오 리미터 전환150

### v150.2 弹幕字体背景填充遮罩混合模式150 | Danmaku Font BG Fill Mask Blend Mode150 | コメントフォントBGフィルマスクブレンドモード150 | 댓글 글꼴 배경 채우기 마스크 블렌드 모드150
- ✅ 弹幕字体背景填充遮罩混合模式150
- ✅ Danmaku Font BG Fill Mask Blend Mode150
- ✅ コメントフォントBGフィルマスクブレンドモード150
- ✅ 댓글 글꼴 배경 채우기 마스크 블렌드 모드150

### v150.3 字幕动画平移150 | Subtitle Animation Translate150 | 字幕アニメーショントランスレート150 | 자막 애니메이션 이동150
- ✅ 字幕动画平移150
- ✅ Subtitle Animation Translate150
- ✅ 字幕アニメーショントランスレート150
- ✅ 자막 애니메이션 이동150

### v150.4 手势点击区域视觉动画循环 | Gesture Tap Zone Visual Anim Loop | ジェスチャータップゾーン視覚アニメーションループ | 제스처 탭 영역 시각 애니메이션 루프
- ✅ 手势点击区域视觉动画循环
- ✅ Gesture Tap Zone Visual Anim Loop
- ✅ ジェスチャータップゾーン視覚アニメーションループ
- ✅ 제스처 탭 영역 시각 애니메이션 루프

### v150.5 投射视频画中画吸附张力 | Cast Video PIP Snap Tension | キャストビデオPIPスナップテンション | 캐스트 비디오 PIP 스냅 장력
- ✅ 投射视频画中画吸附张力
- ✅ Cast Video PIP Snap Tension
- ✅ キャストビデオPIPスナップテンション
- ✅ 캐스트 비디오 PIP 스냅 장력

### v150.6 播放列表按日期自动分组150 | Playlist Auto Group By Date150 | プレイリスト日付別自動グループ化150 | 재생 목록 날짜별 자동 그룹화150
- ✅ 播放列表按日期自动分组150
- ✅ Playlist Auto Group By Date150
- ✅ プレイリスト日付別自動グループ化150
- ✅ 재생 목록 날짜별 자동 그룹화150

### v150.7 缓存计划重试时智能固定 | Cache Smart Pinning On Schedule Retry | キャッシュスケジュールリトライスマートピンニング | 캐시 스케줄 재시도 시 스마트 고정
- ✅ 缓存计划重试时智能固定
- ✅ Cache Smart Pinning On Schedule Retry
- ✅ キャッシュスケジュールリトライスマートピンニング
- ✅ 캐시 스케줄 재시도 시 스마트 고정

### v150.8 进度条自定义滑块颜色150 | Progress Bar Custom Thumb Color150 | プログレスバーカスタムサム色150 | 진행 바 사용자 정의 썸 색상150
- ✅ 进度条自定义滑块颜色150
- ✅ Progress Bar Custom Thumb Color150
- ✅ プログレスバーカスタムサム色150
- ✅ 진행 바 사용자 정의 썸 색상150

### v150.9 音量标准化旁路 | Volume Normalize Bypass | 音量正規化バイパス | 볼륨 정규화 바이패스
- ✅ 音量标准化旁路
- ✅ Volume Normalize Bypass
- ✅ 音量正規化バイパス
- ✅ 볼륨 정규화 바이패스

### v150.10 历史记录自动清理150 | History Auto Clean150 | 履歴自動クリーンアップ150 | 기록 자동 정리150
- ✅ 历史记录自动清理150
- ✅ History Auto Clean150
- ✅ 履歴自動クリーンアップ150
- ✅ 기록 자동 정리150

### v150.11 播放速度预设生物识别 | Playback Speed Presets Biometric | 再生速度プリセットバイオメトリック | 재생 속도 프리셋 바이오메트릭
- ✅ 播放速度预设生物识别
- ✅ Playback Speed Presets Biometric
- ✅ 再生速度プリセットバイオメトリック
- ✅ 재생 속도 프리셋 바이오메트릭

### v150.12 截图自动分享邮件 | Screenshot Auto Share Email | スクリーンショット自動メール共有 | 스크린샷 자동 이메일 공유
- ✅ 截图自动分享邮件
- ✅ Screenshot Auto Share Email
- ✅ スクリーンショット自動メール共有
- ✅ 스크린샷 자동 이메일 공유

### v150.13 视频画中画跟随沉浸模式 | Video PIP Follow Immersive | ビデオPIP没入モード追従 | 비디오 PIP 몰입 모드 팔로우
- ✅ 视频画中画跟随沉浸模式
- ✅ Video PIP Follow Immersive
- ✅ ビデオPIP没入モード追従
- ✅ 비디오 PIP 몰입 모드 팔로우

### v150.14 弹幕字体背景填充遮罩反转 | Danmaku Font BG Fill Mask Invert | コメントフォントBGフィルマスク反転 | 댓글 글꼴 배경 채우기 마스크 반전
- ✅ 弹幕字体背景填充遮罩反转
- ✅ Danmaku Font BG Fill Mask Invert
- ✅ コメントフォントBGフィルマスク反転
- ✅ 댓글 글꼴 배경 채우기 마스크 반전

### v150.15 字幕动画缩放150 | Subtitle Animation Scale150 | 字幕アニメーションスケール150 | 자막 애니메이션 스케일150
- ✅ 字幕动画缩放150
- ✅ Subtitle Animation Scale150
- ✅ 字幕アニメーションスケール150
- ✅ 자막 애니메이션 스케일150


### v151.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v151.1-v151.15 功能列表
- ✅ Audio Limiter Threshold, Danmaku Font BG Fill Mask Invert151, Subtitle Animation Scale151, Gesture Tap Zone Visual Anim Speed, Cast Video PIP Snap Damping, Playlist Auto Group By Uploader, Cache Smart Pinning On Schedule Start, Progress Bar Custom Thumb Color151, Volume Limiter Toggle151, History Auto Clean151, Playback Speed Presets Head Track, Screenshot Auto Share Teams151, Video PIP Follow Dolby Atmos, Danmaku Font BG Fill Gradient Toggle, Subtitle Animation Blur151

### v151.1 音频限制器阈值 | Audio Limiter Threshold | オーディオリミッターしきい値 | 오디오 리미터 임계값
- ✅ 音频限制器阈值
- ✅ Audio Limiter Threshold
- ✅ オーディオリミッターしきい値
- ✅ 오디오 리미터 임계값

### v151.2 弹幕字体背景填充遮罩反转151 | Danmaku Font BG Fill Mask Invert151 | コメントフォントBGフィルマスク反転151 | 댓글 글꼴 배경 채우기 마스크 반전151
- ✅ 弹幕字体背景填充遮罩反转151
- ✅ Danmaku Font BG Fill Mask Invert151
- ✅ コメントフォントBGフィルマスク反転151
- ✅ 댓글 글꼴 배경 채우기 마스크 반전151

### v151.3 字幕动画缩放151 | Subtitle Animation Scale151 | 字幕アニメーションスケール151 | 자막 애니메이션 스케일151
- ✅ 字幕动画缩放151
- ✅ Subtitle Animation Scale151
- ✅ 字幕アニメーションスケール151
- ✅ 자막 애니메이션 스케일151

### v151.4 手势点击区域视觉动画速度 | Gesture Tap Zone Visual Anim Speed | ジェスチャータップゾーン視覚アニメーション速度 | 제스처 탭 영역 시각 애니메이션 속도
- ✅ 手势点击区域视觉动画速度
- ✅ Gesture Tap Zone Visual Anim Speed
- ✅ ジェスチャータップゾーン視覚アニメーション速度
- ✅ 제스처 탭 영역 시각 애니메이션 속도

### v151.5 投射视频画中画吸附阻尼 | Cast Video PIP Snap Damping | キャストビデオPIPスナップダンピング | 캐스트 비디오 PIP 스냅 댐핑
- ✅ 投射视频画中画吸附阻尼
- ✅ Cast Video PIP Snap Damping
- ✅ キャストビデオPIPスナップダンピング
- ✅ 캐스트 비디오 PIP 스냅 댐핑

### v151.6 播放列表按上传者自动分组 | Playlist Auto Group By Uploader | プレイリスト投稿者別自動グループ化 | 재생 목록 업로더별 자동 그룹화
- ✅ 播放列表按上传者自动分组
- ✅ Playlist Auto Group By Uploader
- ✅ プレイリスト投稿者別自動グループ化
- ✅ 재생 목록 업로더별 자동 그룹화

### v151.7 缓存计划开始时智能固定 | Cache Smart Pinning On Schedule Start | キャッシュスケジュール開始スマートピンニング | 캐시 스케줄 시작 시 스마트 고정
- ✅ 缓存计划开始时智能固定
- ✅ Cache Smart Pinning On Schedule Start
- ✅ キャッシュスケジュール開始スマートピンニング
- ✅ 캐시 스케줄 시작 시 스마트 고정

### v151.8 进度条自定义滑块颜色151 | Progress Bar Custom Thumb Color151 | プログレスバーカスタムサム色151 | 진행 바 사용자 정의 썸 색상151
- ✅ 进度条自定义滑块颜色151
- ✅ Progress Bar Custom Thumb Color151
- ✅ プログレスバーカスタムサム色151
- ✅ 진행 바 사용자 정의 썸 색상151

### v151.9 音量限制器开关151 | Volume Limiter Toggle151 | 音量リミッター切替151 | 볼륨 리미터 전환151
- ✅ 音量限制器开关151
- ✅ Volume Limiter Toggle151
- ✅ 音量リミッター切替151
- ✅ 볼륨 리미터 전환151

### v151.10 历史记录自动清理151 | History Auto Clean151 | 履歴自動クリーンアップ151 | 기록 자동 정리151
- ✅ 历史记录自动清理151
- ✅ History Auto Clean151
- ✅ 履歴自動クリーンアップ151
- ✅ 기록 자동 정리151

### v151.11 播放速度预设头部追踪 | Playback Speed Presets Head Track | 再生速度プリセットヘッドトラッキング | 재생 속도 프리셋 헤드 트래킹
- ✅ 播放速度预设头部追踪
- ✅ Playback Speed Presets Head Track
- ✅ 再生速度プリセットヘッドトラッキング
- ✅ 재생 속도 프리셋 헤드 트래킹

### v151.12 截图自动分享Teams151 | Screenshot Auto Share Teams151 | スクリーンショット自動Teams151共有 | 스크린샷 자동 Teams151 공유
- ✅ 截图自动分享Teams151
- ✅ Screenshot Auto Share Teams151
- ✅ スクリーンショット自動Teams151共有
- ✅ 스크린샷 자동 Teams151 공유

### v151.13 视频画中画跟随杜比全景声 | Video PIP Follow Dolby Atmos | ビデオPIPドルビーアトモス追従 | 비디오 PIP 돌비 애트모스 팔로우
- ✅ 视频画中画跟随杜比全景声
- ✅ Video PIP Follow Dolby Atmos
- ✅ ビデオPIPドルビーアトモス追従
- ✅ 비디오 PIP 돌비 애트모스 팔로우

### v151.14 弹幕字体背景填充渐变开关 | Danmaku Font BG Fill Gradient Toggle | コメントフォントBGフィルグラデーション切替 | 댓글 글꼴 배경 채우기 그라디언트 전환
- ✅ 弹幕字体背景填充渐变开关
- ✅ Danmaku Font BG Fill Gradient Toggle
- ✅ コメントフォントBGフィルグラデーション切替
- ✅ 댓글 글꼴 배경 채우기 그라디언트 전환

### v151.15 字幕动画模糊151 | Subtitle Animation Blur151 | 字幕アニメーションブラー151 | 자막 애니메이션 블러151
- ✅ 字幕动画模糊151
- ✅ Subtitle Animation Blur151
- ✅ 字幕アニメーションブラー151
- ✅ 자막 애니메이션 블러151

### v152.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v152.1-v152.15 功能列表
- ✅ Audio Limiter Release151, Danmaku Font BG Fill Gradient Start, Subtitle Animation Blur152, Gesture Tap Zone Visual Anim Curve, Cast Video PIP Snap Stiffness, Playlist Auto Group By Uploader152, Cache Smart Pinning On Schedule End, Progress Bar Custom Thumb Glow152, Volume Limiter Threshold152, History Auto Clean152, Playback Speed Presets Head Track152, Screenshot Auto Share Email152, Video PIP Follow Dolby Atmos152, Danmaku Font BG Fill Gradient End, Subtitle Animation Fade In152

### v152.1 音频限制器释放151 | Audio Limiter Release151 | オーディオリミッターリリース151 | 오디오 리미터 릴리스151
- ✅ 音频限制器释放151
- ✅ Audio Limiter Release151
- ✅ オーディオリミッターリリース151
- ✅ 오디오 리미터 릴리스151

### v152.2 弹幕字体背景填充渐变起始 | Danmaku Font BG Fill Gradient Start | コメントフォントBGフィルグラデーション開始 | 댓글 글꼴 배경 채우기 그라디언트 시작
- ✅ 弹幕字体背景填充渐变起始
- ✅ Danmaku Font BG Fill Gradient Start
- ✅ コメントフォントBGフィルグラデーション開始
- ✅ 댓글 글꼴 배경 채우기 그라디언트 시작

### v152.3 字幕动画模糊152 | Subtitle Animation Blur152 | 字幕アニメーションブラー152 | 자막 애니메이션 블러152
- ✅ 字幕动画模糊152
- ✅ Subtitle Animation Blur152
- ✅ 字幕アニメーションブラー152
- ✅ 자막 애니메이션 블러152

### v152.4 手势点击区域视觉动画曲线 | Gesture Tap Zone Visual Anim Curve | ジェスチャータップゾーン視覚アニメーションカーブ | 제스처 탭 영역 시각 애니메이션 커브
- ✅ 手势点击区域视觉动画曲线
- ✅ Gesture Tap Zone Visual Anim Curve
- ✅ ジェスチャータップゾーン視覚アニメーションカーブ
- ✅ 제스처 탭 영역 시각 애니메이션 커브

### v152.5 投射视频画中画吸附刚度 | Cast Video PIP Snap Stiffness | キャストビデオPIPスナップスティフネス | 캐스트 비디오 PIP Snap 강성
- ✅ 投射视频画中画吸附刚度
- ✅ Cast Video PIP Snap Stiffness
- ✅ キャストビデオPIPスナップスティフネス
- ✅ 캐스트 비디오 PIP Snap 강성

### v152.6 播放列表按上传者自动分组152 | Playlist Auto Group By Uploader152 | プレイリスト投稿者別自動グループ化152 | 재생 목록 업로더별 자동 그룹화152
- ✅ 播放列表按上传者自动分组152
- ✅ Playlist Auto Group By Uploader152
- ✅ プレイリスト投稿者別自動グループ化152
- ✅ 재생 목록 업로더별 자동 그룹화152

### v152.7 缓存计划结束时智能固定 | Cache Smart Pinning On Schedule End | キャッシュスケジュール終了スマートピンニング | 캐시 스케줄 종료 시 스마트 고정
- ✅ 缓存计划结束时智能固定
- ✅ Cache Smart Pinning On Schedule End
- ✅ キャッシュスケジュール終了スマートピンニング
- ✅ 캐시 스케줄 종료 시 스마트 고정

### v152.8 进度条自定义滑块发光152 | Progress Bar Custom Thumb Glow152 | プログレスバーカスタムサムグロウ152 | 진행 바 사용자 정의 썸 글로우152
- ✅ 进度条自定义滑块发光152
- ✅ Progress Bar Custom Thumb Glow152
- ✅ プログレスバーカスタムサムグロウ152
- ✅ 진행 바 사용자 정의 썸 글로우152

### v152.9 音量限制器阈值152 | Volume Limiter Threshold152 | 音量リミッターしきい値152 | 볼륨 리미터 임계값152
- ✅ 音量限制器阈值152
- ✅ Volume Limiter Threshold152
- ✅ 音量リミッターしきい値152
- ✅ 볼륨 리미터 임계값152

### v152.10 历史记录自动清理152 | History Auto Clean152 | 履歴自動クリーンアップ152 | 기록 자동 정리152
- ✅ 历史记录自动清理152
- ✅ History Auto Clean152
- ✅ 履歴自動クリーンアップ152
- ✅ 기록 자동 정리152

### v152.11 播放速度预设头部追踪152 | Playback Speed Presets Head Track152 | 再生速度プリセットヘッドトラッキング152 | 재생 속도 프리셋 헤드 트래킹152
- ✅ 播放速度预设头部追踪152
- ✅ Playback Speed Presets Head Track152
- ✅ 再生速度プリセットヘッドトラッキング152
- ✅ 재생 속도 프리셋 헤드 트래킹152

### v152.12 截图自动分享邮件152 | Screenshot Auto Share Email152 | スクリーンショット自動メール152共有 | 스크린샷 자동 이메일152 공유
- ✅ 截图自动分享邮件152
- ✅ Screenshot Auto Share Email152
- ✅ スクリーンショット自動メール152共有
- ✅ 스크린샷 자동 이메일152 공유

### v152.13 视频画中画跟随杜比全景声152 | Video PIP Follow Dolby Atmos152 | ビデオPIPドルビーアトモス152追従 | 비디오 PIP 돌비 애트모스152 팔로우
- ✅ 视频画中画跟随杜比全景声152
- ✅ Video PIP Follow Dolby Atmos152
- ✅ ビデオPIPドルビーアトモス152追従
- ✅ 비디오 PIP 돌비 애트모스152 팔로우

### v152.14 弹幕字体背景填充渐变结束 | Danmaku Font BG Fill Gradient End | コメントフォントBGフィルグラデーション終了 | 댓글 글꼴 배경 채우기 그라디언트 종료
- ✅ 弹幕字体背景填充渐变结束
- ✅ Danmaku Font BG Fill Gradient End
- ✅ コメントフォントBGフィルグラデーション終了
- ✅ 댓글 글꼴 배경 채우기 그라디언트 종료

### v152.15 字幕动画淡入152 | Subtitle Animation Fade In152 | 字幕アニメーションフェードイン152 | 자막 애니메이션 페이드인152
- ✅ 字幕动画淡入152
- ✅ Subtitle Animation Fade In152
- ✅ 字幕アニメーションフェードイン152
- ✅ 자막 애니메이션 페이드인152

### v153.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v153.1-v153.15 功能列表
- ✅ Audio Limiter Gain152, Danmaku Font BG Fill Gradient Angle, Subtitle Animation Fade In153, Gesture Tap Zone Visual Anim Direction, Cast Video PIP Snap Mass, Playlist Auto Group By Category, Cache Smart Pinning On Schedule Weekday, Progress Bar Custom Thumb Border153, Volume Limiter Release153, History Auto Clean153, Playback Speed Presets Hand Gesture, Screenshot Auto Share WeChat153, Video PIP Follow Dolby Atmos153, Danmaku Font BG Fill Gradient Type, Subtitle Animation Fade Out153

### v153.1 音频限制器增益152 | Audio Limiter Gain152 | オーディオリミッターゲイン152 | 오디오 리미터 게인152
- ✅ 音频限制器增益152
- ✅ Audio Limiter Gain152
- ✅ オーディオリミッターゲイン152
- ✅ 오디오 리미터 게인152

### v153.2 弹幕字体背景填充渐变角度 | Danmaku Font BG Fill Gradient Angle | コメントフォントBGフィルグラデーション角度 | 댓글 글꼴 배경 채우기 그라디언트 각도
- ✅ 弹幕字体背景填充渐变角度
- ✅ Danmaku Font BG Fill Gradient Angle
- ✅ コメントフォントBGフィルグラデーション角度
- ✅ 댓글 글꼴 배경 채우기 그라디언트 각도

### v153.3 字幕动画淡入153 | Subtitle Animation Fade In153 | 字幕アニメーションフェードイン153 | 자막 애니메이션 페이드인153
- ✅ 字幕动画淡入153
- ✅ Subtitle Animation Fade In153
- ✅ 字幕アニメーションフェードイン153
- ✅ 자막 애니메이션 페이드인153

### v153.4 手势点击区域视觉动画方向 | Gesture Tap Zone Visual Anim Direction | ジェスチャータップゾーン視覚アニメーション方向 | 제스처 탭 영역 시각 애니메이션 방향
- ✅ 手势点击区域视觉动画方向
- ✅ Gesture Tap Zone Visual Anim Direction
- ✅ ジェスチャータップゾーン視覚アニメーション方向
- ✅ 제스처 탭 영역 시각 애니메이션 방향

### v153.5 投射视频画中画吸附质量 | Cast Video PIP Snap Mass | キャストビデオPIPスナップ質量 | 캐스트 비디오 PIP 스냅 질량
- ✅ 投射视频画中画吸附质量
- ✅ Cast Video PIP Snap Mass
- ✅ キャストビデオPIPスナップ質量
- ✅ 캐스트 비디오 PIP 스냅 질량

### v153.6 播放列表按分类自动分组 | Playlist Auto Group By Category | プレイリストカテゴリ別自動グループ化 | 재생 목록 카테고리별 자동 그룹화
- ✅ 播放列表按分类自动分组
- ✅ Playlist Auto Group By Category
- ✅ プレイリストカテゴリ別自動グループ化
- ✅ 재생 목록 카테고리별 자동 그룹화

### v153.7 缓存计划工作日时智能固定 | Cache Smart Pinning On Schedule Weekday | キャッシュスケジュール平日スマートピンニング | 캐시 스케줄 평일 시 스마트 고정
- ✅ 缓存计划工作日时智能固定
- ✅ Cache Smart Pinning On Schedule Weekday
- ✅ キャッシュスケジュール平日スマートピンニング
- ✅ 캐시 스케줄 평일 시 스마트 고정

### v153.8 进度条自定义滑块边框153 | Progress Bar Custom Thumb Border153 | プログレスバーカスタムサムボーダー153 | 진행 바 사용자 정의 썸 테두리153
- ✅ 进度条自定义滑块边框153
- ✅ Progress Bar Custom Thumb Border153
- ✅ プログレスバーカスタムサムボーダー153
- ✅ 진행 바 사용자 정의 썸 테두리153

### v153.9 音量限制器释放153 | Volume Limiter Release153 | 音量リミッターリリース153 | 볼륨 리미터 릴리스153
- ✅ 音量限制器释放153
- ✅ Volume Limiter Release153
- ✅ 音量リミッターリリース153
- ✅ 볼륨 리미터 릴리스153

### v153.10 历史记录自动清理153 | History Auto Clean153 | 履歴自動クリーンアップ153 | 기록 자동 정리153
- ✅ 历史记录自动清理153
- ✅ History Auto Clean153
- ✅ 履歴自動クリーンアップ153
- ✅ 기록 자동 정리153

### v153.11 播放速度预设手势识别 | Playback Speed Presets Hand Gesture | 再生速度プリセットハンドジェスチャー | 재생 속도 프리셋 핸드 제스처
- ✅ 播放速度预设手势识别
- ✅ Playback Speed Presets Hand Gesture
- ✅ 再生速度プリセットハンドジェスチャー
- ✅ 재생 속도 프리셋 핸드 제스처

### v153.12 截图自动分享微信153 | Screenshot Auto Share WeChat153 | スクリーンショット自動WeChat153共有 | 스크린샷 자동 WeChat153 공유
- ✅ 截图自动分享微信153
- ✅ Screenshot Auto Share WeChat153
- ✅ スクリーンショット自動WeChat153共有
- ✅ 스크린샷 자동 WeChat153 공유

### v153.13 视频画中画跟随杜比全景声153 | Video PIP Follow Dolby Atmos153 | ビデオPIPドルビーアトモス153追従 | 비디오 PIP 돌비 애트모스153 팔로우
- ✅ 视频画中画跟随杜比全景声153
- ✅ Video PIP Follow Dolby Atmos153
- ✅ ビデオPIPドルビーアトモス153追従
- ✅ 비디오 PIP 돌비 애트모스153 팔로우

### v153.14 弹幕字体背景填充渐变类型 | Danmaku Font BG Fill Gradient Type | コメントフォントBGフィルグラデーションタイプ | 댓글 글꼴 배경 채우기 그라디언트 유형
- ✅ 弹幕字体背景填充渐变类型
- ✅ Danmaku Font BG Fill Gradient Type
- ✅ コメントフォントBGフィルグラデーションタイプ
- ✅ 댓글 글꼴 배경 채우기 그라디언트 유형

### v153.15 字幕动画淡出153 | Subtitle Animation Fade Out153 | 字幕アニメーションフェードアウト153 | 자막 애니메이션 페이드아웃153
- ✅ 字幕动画淡出153
- ✅ Subtitle Animation Fade Out153
- ✅ 字幕アニメーションフェードアウト153
- ✅ 자막 애니메이션 페이드아웃153

### v154.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v154.1-v154.15 功能列表
- ✅ Audio Dynamic EQ Toggle154, Danmaku Font BG Fill Gradient Type153, Subtitle Animation Fade Out154, Gesture Tap Zone Visual Anim Opacity154, Cast Video PIP Snap Velocity, Playlist Auto Group By Category154, Cache Smart Pinning On Schedule Monthday, Progress Bar Custom Thumb Shadow154, Volume Limiter Gain154, History Auto Clean154, Playback Speed Presets Hand Gesture154, Screenshot Auto Share QQ154, Video PIP Follow Spatial Audio, Danmaku Font BG Fill Gradient Type154, Subtitle Animation Translate154

### v154.1 音频动态均衡器开关154 | Audio Dynamic EQ Toggle154 | オーディオダイナミックEQ切替154 | 오디오 다이내믹 EQ 전환154
- ✅ 音频动态均衡器开关154
- ✅ Audio Dynamic EQ Toggle154
- ✅ オーディオダイナミックEQ切替154
- ✅ 오디오 다이내믹 EQ 전환154

### v154.2 弹幕字体背景填充渐变类型153 | Danmaku Font BG Fill Gradient Type153 | コメントフォントBGフィルグラデーションタイプ153 | 댓글 글꼴 배경 채우기 그라디언트 유형153
- ✅ 弹幕字体背景填充渐变类型153
- ✅ Danmaku Font BG Fill Gradient Type153
- ✅ コメントフォントBGフィルグラデーションタイプ153
- ✅ 댓글 글꼴 배경 채우기 그라디언트 유형153

### v154.3 字幕动画淡出154 | Subtitle Animation Fade Out154 | 字幕アニメーションフェードアウト154 | 자막 애니메이션 페이드아웃154
- ✅ 字幕动画淡出154
- ✅ Subtitle Animation Fade Out154
- ✅ 字幕アニメーションフェードアウト154
- ✅ 자막 애니메이션 페이드아웃154

### v154.4 手势点击区域视觉动画透明度154 | Gesture Tap Zone Visual Anim Opacity154 | ジェスチャータップゾーン視覚アニメーション透明度154 | 제스처 탭 영역 시각 애니메이션 불투명도154
- ✅ 手势点击区域视觉动画透明度154
- ✅ Gesture Tap Zone Visual Anim Opacity154
- ✅ ジェスチャータップゾーン視覚アニメーション透明度154
- ✅ 제스처 탭 영역 시각 애니메이션 불투명도154

### v154.5 投射视频画中画吸附速度 | Cast Video PIP Snap Velocity | キャストビデオPIPスナップ速度 | 캐스트 비디오 PIP 스냅 속도
- ✅ 投射视频画中画吸附速度
- ✅ Cast Video PIP Snap Velocity
- ✅ キャストビデオPIPスナップ速度
- ✅ 캐스트 비디오 PIP 스냅 속도

### v154.6 播放列表按分类自动分组154 | Playlist Auto Group By Category154 | プレイリストカテゴリ別自動グループ化154 | 재생 목록 카테고리별 자동 그룹화154
- ✅ 播放列表按分类自动分组154
- ✅ Playlist Auto Group By Category154
- ✅ プレイリストカテゴリ別自動グループ化154
- ✅ 재생 목록 카테고리별 자동 그룹화154

### v154.7 缓存计划月日时智能固定 | Cache Smart Pinning On Schedule Monthday | キャッシュスケジュール月日スマートピンニング | 캐시 스케줄 월일 시 스마트 고정
- ✅ 缓存计划月日时智能固定
- ✅ Cache Smart Pinning On Schedule Monthday
- ✅ キャッシュスケジュール月日スマートピンニング
- ✅ 캐시 스케줄 월일 시 스마트 고정

### v154.8 进度条自定义滑块阴影154 | Progress Bar Custom Thumb Shadow154 | プログレスバーカスタムサムシャドウ154 | 진행 바 사용자 정의 썸 그림자154
- ✅ 进度条自定义滑块阴影154
- ✅ Progress Bar Custom Thumb Shadow154
- ✅ プログレスバーカスタムサムシャドウ154
- ✅ 진행 바 사용자 정의 썸 그림자154

### v154.9 音量限制器增益154 | Volume Limiter Gain154 | 音量リミッターゲイン154 | 볼륨 리미터 게인154
- ✅ 音量限制器增益154
- ✅ Volume Limiter Gain154
- ✅ 音量リミッターゲイン154
- ✅ 볼륨 리미터 게인154

### v154.10 历史记录自动清理154 | History Auto Clean154 | 履歴自動クリーンアップ154 | 기록 자동 정리154
- ✅ 历史记录自动清理154
- ✅ History Auto Clean154
- ✅ 履歴自動クリーンアップ154
- ✅ 기록 자동 정리154

### v154.11 播放速度预设手势识别154 | Playback Speed Presets Hand Gesture154 | 再生速度プリセットハンドジェスチャー154 | 재생 속도 프리셋 핸드 제스처154
- ✅ 播放速度预设手势识别154
- ✅ Playback Speed Presets Hand Gesture154
- ✅ 再生速度プリセットハンドジェスチャー154
- ✅ 재생 속도 프리셋 핸드 제스처154

### v154.12 截图自动分享QQ154 | Screenshot Auto Share QQ154 | スクリーンショット自動QQ154共有 | 스크린샷 자동 QQ154 공유
- ✅ 截图自动分享QQ154
- ✅ Screenshot Auto Share QQ154
- ✅ スクリーンショット自動QQ154共有
- ✅ 스크린샷 자동 QQ154 공유

### v154.13 视频画中画跟随空间音频 | Video PIP Follow Spatial Audio | ビデオPIP空間オーディオ追従 | 비디오 PIP 공간 오디오 팔로우
- ✅ 视频画中画跟随空间音频
- ✅ Video PIP Follow Spatial Audio
- ✅ ビデオPIP空間オーディオ追従
- ✅ 비디오 PIP 공간 오디오 팔로우

### v154.14 弹幕字体背景填充渐变类型154 | Danmaku Font BG Fill Gradient Type154 | コメントフォントBGフィルグラデーションタイプ154 | 댓글 글꼴 배경 채우기 그라디언트 유형154
- ✅ 弹幕字体背景填充渐变类型154
- ✅ Danmaku Font BG Fill Gradient Type154
- ✅ コメントフォントBGフィルグラデーションタイプ154
- ✅ 댓글 글꼴 배경 채우기 그라디언트 유형154

### v154.15 字幕动画平移154 | Subtitle Animation Translate154 | 字幕アニメーショントランスレート154 | 자막 애니메이션 이동154
- ✅ 字幕动画平移154
- ✅ Subtitle Animation Translate154
- ✅ 字幕アニメーショントランスレート154
- ✅ 자막 애니메이션 이동154

### v155.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v155.1-v155.15 功能列表
- ✅ Audio Dynamic EQ Band, Danmaku Font BG Fill Gradient Type155, Subtitle Animation Translate155, Gesture Tap Zone Visual Anim Blur155, Cast Video PIP Snap Gravity, Playlist Auto Group By Uploader155, Cache Smart Pinning On Schedule Action, Progress Bar Custom Thumb Glow155, Volume Limiter Stereo, History Auto Clean155, Playback Speed Presets Face Track, Screenshot Auto Share Douyin155, Video PIP Follow Spatial Audio155, Danmaku Font BG Fill Gradient Stops, Subtitle Animation Scale155

### v155.1 音频动态均衡器频段 | Audio Dynamic EQ Band | オーディオダイナミックEQバンド | 오디오 다이내믹 EQ 밴드
- ✅ 音频动态均衡器频段
- ✅ Audio Dynamic EQ Band
- ✅ オーディオダイナミックEQバンド
- ✅ 오디오 다이내믹 EQ 밴드

### v155.2 弹幕字体背景填充渐变类型155 | Danmaku Font BG Fill Gradient Type155 | コメントフォントBGフィルグラデーションタイプ155 | 댓글 글꼴 배경 채우기 그라디언트 유형155
- ✅ 弹幕字体背景填充渐变类型155
- ✅ Danmaku Font BG Fill Gradient Type155
- ✅ コメントフォントBGフィルグラデーションタイプ155
- ✅ 댓글 글꼴 배경 채우기 그라디언트 유형155

### v155.3 字幕动画平移155 | Subtitle Animation Translate155 | 字幕アニメーショントランスレート155 | 자막 애니메이션 이동155
- ✅ 字幕动画平移155
- ✅ Subtitle Animation Translate155
- ✅ 字幕アニメーショントランスレート155
- ✅ 자막 애니메이션 이동155

### v155.4 手势点击区域视觉动画模糊155 | Gesture Tap Zone Visual Anim Blur155 | ジェスチャータップゾーン視覚アニメーションブラー155 | 제스처 탭 영역 시각 애니메이션 블러155
- ✅ 手势点击区域视觉动画模糊155
- ✅ Gesture Tap Zone Visual Anim Blur155
- ✅ ジェスチャータップゾーン視覚アニメーションブラー155
- ✅ 제스처 탭 영역 시각 애니메이션 블러155

### v155.5 投射视频画中画吸附重力 | Cast Video PIP Snap Gravity | キャストビデオPIPスナップグラビティ | 캐스트 비디오 PIP 스냅 중력
- ✅ 投射视频画中画吸附重力
- ✅ Cast Video PIP Snap Gravity
- ✅ キャストビデオPIPスナップグラビティ
- ✅ 캐스트 비디오 PIP 스냅 중력

### v155.6 播放列表按上传者自动分组155 | Playlist Auto Group By Uploader155 | プレイリスト投稿者別自動グループ化155 | 재생 목록 업로더별 자동 그룹화155
- ✅ 播放列表按上传者自动分组155
- ✅ Playlist Auto Group By Uploader155
- ✅ プレイリスト投稿者別自動グループ化155
- ✅ 재생 목록 업로더별 자동 그룹화155

### v155.7 缓存计划动作时智能固定 | Cache Smart Pinning On Schedule Action | キャッシュスケジュールアクションスマートピンニング | 캐시 스케줄 액션 시 스마트 고정
- ✅ 缓存计划动作时智能固定
- ✅ Cache Smart Pinning On Schedule Action
- ✅ キャッシュスケジュールアクションスマートピンニング
- ✅ 캐시 스케줄 액션 시 스마트 고정

### v155.8 进度条自定义滑块发光155 | Progress Bar Custom Thumb Glow155 | プログレスバーカスタムサムグロウ155 | 진행 바 사용자 정의 썸 글로우155
- ✅ 进度条自定义滑块发光155
- ✅ Progress Bar Custom Thumb Glow155
- ✅ プログレスバーカスタムサムグロウ155
- ✅ 진행 바 사용자 정의 썸 글로우155

### v155.9 音量限制器立体声 | Volume Limiter Stereo | 音量リミッターステレオ | 볼륨 리미터 스테레오
- ✅ 音量限制器立体声
- ✅ Volume Limiter Stereo
- ✅ 音量リミッターステレオ
- ✅ 볼륨 리미터 스테레오

### v155.10 历史记录自动清理155 | History Auto Clean155 | 履歴自動クリーンアップ155 | 기록 자동 정리155
- ✅ 历史记录自动清理155
- ✅ History Auto Clean155
- ✅ 履歴自動クリーンアップ155
- ✅ 기록 자동 정리155

### v155.11 播放速度预设面部追踪 | Playback Speed Presets Face Track | 再生速度プリセットフェイストラッキング | 재생 속도 프리셋 페이스 트래킹
- ✅ 播放速度预设面部追踪
- ✅ Playback Speed Presets Face Track
- ✅ 再生速度プリセットフェイストラッキング
- ✅ 재생 속도 프리셋 페이스 트래킹

### v155.12 截图自动分享抖音155 | Screenshot Auto Share Douyin155 | スクリーンショット自動Douyin155共有 | 스크린샷 자동 Douyin155 공유
- ✅ 截图自动分享抖音155
- ✅ Screenshot Auto Share Douyin155
- ✅ スクリーンショット自動Douyin155共有
- ✅ 스크린샷 자동 Douyin155 공유

### v155.13 视频画中画跟随空间音频155 | Video PIP Follow Spatial Audio155 | ビデオPIP空間オーディオ155追従 | 비디오 PIP 공간 오디오155 팔로우
- ✅ 视频画中画跟随空间音频155
- ✅ Video PIP Follow Spatial Audio155
- ✅ ビデオPIP空間オーディオ155追従
- ✅ 비디오 PIP 공간 오디오155 팔로우

### v155.14 弹幕字体背景填充渐变停止点 | Danmaku Font BG Fill Gradient Stops | コメントフォントBGフィルグラデーションストップ | 댓글 글꼴 배경 채우기 그라디언트 정지점
- ✅ 弹幕字体背景填充渐变停止点
- ✅ Danmaku Font BG Fill Gradient Stops
- ✅ コメントフォントBGフィルグラデーションストップ
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점

### v155.15 字幕动画缩放155 | Subtitle Animation Scale155 | 字幕アニメーションスケール155 | 자막 애니메이션 스케일155
- ✅ 字幕动画缩放155
- ✅ Subtitle Animation Scale155
- ✅ 字幕アニメーションスケール155
- ✅ 자막 애니메이션 스케일155

### v156.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v156.1-v156.15 功能列表
- ✅ Audio Dynamic EQ Freq, Danmaku Font BG Fill Gradient Stops155, Subtitle Animation Scale156, Gesture Tap Zone Visual Anim Color156, Cast Video PIP Snap Mode, Playlist Auto Group By Tag, Cache Smart Pinning On Schedule Condition, Progress Bar Custom Thumb Border156, Volume Limiter Ceiling, History Auto Clean156, Playback Speed Presets Face Track156, Screenshot Auto Share Snapchat156, Video PIP Follow Spatial Audio156, Danmaku Font BG Fill Gradient Stops156, Subtitle Animation Rotate156

### v156.1 音频动态均衡器频率 | Audio Dynamic EQ Freq | オーディオダイナミックEQ周波数 | 오디오 다이내믹 EQ 주파수
- ✅ 音频动态均衡器频率
- ✅ Audio Dynamic EQ Freq
- ✅ オーディオダイナミックEQ周波数
- ✅ 오디오 다이내믹 EQ 주파수

### v156.2 弹幕字体背景填充渐变停止点155 | Danmaku Font BG Fill Gradient Stops155 | コメントフォントBGフィルグラデーションストップ155 | 댓글 글꼴 배경 채우기 그라디언트 정지점155
- ✅ 弹幕字体背景填充渐变停止点155
- ✅ Danmaku Font BG Fill Gradient Stops155
- ✅ コメントフォントBGフィルグラデーションストップ155
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점155

### v156.3 字幕动画缩放156 | Subtitle Animation Scale156 | 字幕アニメーションスケール156 | 자막 애니메이션 스케일156
- ✅ 字幕动画缩放156
- ✅ Subtitle Animation Scale156
- ✅ 字幕アニメーションスケール156
- ✅ 자막 애니메이션 스케일156

### v156.4 手势点击区域视觉动画颜色156 | Gesture Tap Zone Visual Anim Color156 | ジェスチャータップゾーン視覚アニメーション色156 | 제스처 탭 영역 시각 애니메이션 색상156
- ✅ 手势点击区域视觉动画颜色156
- ✅ Gesture Tap Zone Visual Anim Color156
- ✅ ジェスチャータップゾーン視覚アニメーション色156
- ✅ 제스처 탭 영역 시각 애니메이션 색상156

### v156.5 投射视频画中画吸附模式 | Cast Video PIP Snap Mode | キャストビデオPIPスナップモード | 캐스트 비디오 PIP 스냅 모드
- ✅ 投射视频画中画吸附模式
- ✅ Cast Video PIP Snap Mode
- ✅ キャストビデオPIPスナップモード
- ✅ 캐스트 비디오 PIP 스냅 모드

### v156.6 播放列表按标签自动分组 | Playlist Auto Group By Tag | プレイリストタグ別自動グループ化 | 재생 목록 태그별 자동 그룹화
- ✅ 播放列表按标签自动分组
- ✅ Playlist Auto Group By Tag
- ✅ プレイリストタグ別自動グループ化
- ✅ 재생 목록 태그별 자동 그룹화

### v156.7 缓存计划条件时智能固定 | Cache Smart Pinning On Schedule Condition | キャッシュスケジュール条件スマートピンニング | 캐시 스케줄 조건 시 스마트 고정
- ✅ 缓存计划条件时智能固定
- ✅ Cache Smart Pinning On Schedule Condition
- ✅ キャッシュスケジュール条件スマートピンニング
- ✅ 캐시 스케줄 조건 시 스마트 고정

### v156.8 进度条自定义滑块边框156 | Progress Bar Custom Thumb Border156 | プログレスバーカスタムサムボーダー156 | 진행 바 사용자 정의 썸 테두리156
- ✅ 进度条自定义滑块边框156
- ✅ Progress Bar Custom Thumb Border156
- ✅ プログレスバーカスタムサムボーダー156
- ✅ 진행 바 사용자 정의 썸 테두리156

### v156.9 音量限制器上限 | Volume Limiter Ceiling | 音量リミッターシーリング | 볼륨 리미터 상한
- ✅ 音量限制器上限
- ✅ Volume Limiter Ceiling
- ✅ 音量リミッターシーリング
- ✅ 볼륨 리미터 상한

### v156.10 历史记录自动清理156 | History Auto Clean156 | 履歴自動クリーンアップ156 | 기록 자동 정리156
- ✅ 历史记录自动清理156
- ✅ History Auto Clean156
- ✅ 履歴自動クリーンアップ156
- ✅ 기록 자동 정리156

### v156.11 播放速度预设面部追踪156 | Playback Speed Presets Face Track156 | 再生速度プリセットフェイストラッキング156 | 재생 속도 프리셋 페이스 트래킹156
- ✅ 播放速度预设面部追踪156
- ✅ Playback Speed Presets Face Track156
- ✅ 再生速度プリセットフェイストラッキング156
- ✅ 재생 속도 프리셋 페이스 트래킹156

### v156.12 截图自动分享Snapchat156 | Screenshot Auto Share Snapchat156 | スクリーンショット自動Snapchat156共有 | 스크린샷 자동 Snapchat156 공유
- ✅ 截图自动分享Snapchat156
- ✅ Screenshot Auto Share Snapchat156
- ✅ スクリーンショット自動Snapchat156共有
- ✅ 스크린샷 자동 Snapchat156 공유

### v156.13 视频画中画跟随空间音频156 | Video PIP Follow Spatial Audio156 | ビデオPIP空間オーディオ156追従 | 비디오 PIP 공간 오디오156 팔로우
- ✅ 视频画中画跟随空间音频156
- ✅ Video PIP Follow Spatial Audio156
- ✅ ビデオPIP空間オーディオ156追従
- ✅ 비디오 PIP 공간 오디오156 팔로우

### v156.14 弹幕字体背景填充渐变停止点156 | Danmaku Font BG Fill Gradient Stops156 | コメントフォントBGフィルグラデーションストップ156 | 댓글 글꼴 배경 채우기 그라디언트 정지점156
- ✅ 弹幕字体背景填充渐变停止点156
- ✅ Danmaku Font BG Fill Gradient Stops156
- ✅ コメントフォントBGフィルグラデーションストップ156
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점156

### v156.15 字幕动画旋转156 | Subtitle Animation Rotate156 | 字幕アニメーションローテート156 | 자막 애니메이션 회전156
- ✅ 字幕动画旋转156
- ✅ Subtitle Animation Rotate156
- ✅ 字幕アニメーションローテート156
- ✅ 자막 애니메이션 회전156

### v157.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v157.1-v157.15 功能列表
- ✅ Audio Dynamic EQ Gain, Danmaku Font BG Fill Gradient Stops157, Subtitle Animation Rotate157, Gesture Tap Zone Visual Anim Scale157, Cast Video PIP Snap Direction, Playlist Auto Group By Tag157, Cache Smart Pinning On Schedule Priority, Progress Bar Custom Thumb Color157, Volume Limiter Ceiling157, History Auto Clean157, Playback Speed Presets Motion Detect, Screenshot Auto Share TikTok157, Video PIP Follow Spatial Audio157, Danmaku Font BG Fill Gradient Stops158, Subtitle Animation Blur157

### v157.1 音频动态均衡器增益 | Audio Dynamic EQ Gain | オーディオダイナミックEQゲイン | 오디오 다이내믹 EQ 게인
- ✅ 音频动态均衡器增益
- ✅ Audio Dynamic EQ Gain
- ✅ オーディオダイナミックEQゲイン
- ✅ 오디오 다이내믹 EQ 게인

### v157.2 弹幕字体背景填充渐变停止点157 | Danmaku Font BG Fill Gradient Stops157 | コメントフォントBGフィルグラデーションストップ157 | 댓글 글꼴 배경 채우기 그라디언트 정지점157
- ✅ 弹幕字体背景填充渐变停止点157
- ✅ Danmaku Font BG Fill Gradient Stops157
- ✅ コメントフォントBGフィルグラデーションストップ157
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점157

### v157.3 字幕动画旋转157 | Subtitle Animation Rotate157 | 字幕アニメーションローテート157 | 자막 애니메이션 회전157
- ✅ 字幕动画旋转157
- ✅ Subtitle Animation Rotate157
- ✅ 字幕アニメーションローテート157
- ✅ 자막 애니메이션 회전157

### v157.4 手势点击区域视觉动画缩放157 | Gesture Tap Zone Visual Anim Scale157 | ジェスチャータップゾーン視覚アニメーションスケール157 | 제스처 탭 영역 시각 애니메이션 스케일157
- ✅ 手势点击区域视觉动画缩放157
- ✅ Gesture Tap Zone Visual Anim Scale157
- ✅ ジェスチャータップゾーン視覚アニメーションスケール157
- ✅ 제스처 탭 영역 시각 애니메이션 스케일157

### v157.5 投射视频画中画吸附方向 | Cast Video PIP Snap Direction | キャストビデオPIPスナップ方向 | 캐스트 비디오 PIP 스냅 방향
- ✅ 投射视频画中画吸附方向
- ✅ Cast Video PIP Snap Direction
- ✅ キャストビデオPIPスナップ方向
- ✅ 캐스트 비디오 PIP 스냅 방향

### v157.6 播放列表按标签自动分组157 | Playlist Auto Group By Tag157 | プレイリストタグ別自動グループ化157 | 재생 목록 태그별 자동 그룹화157
- ✅ 播放列表按标签自动分组157
- ✅ Playlist Auto Group By Tag157
- ✅ プレイリストタグ別自動グループ化157
- ✅ 재생 목록 태그별 자동 그룹화157

### v157.7 缓存计划优先级时智能固定 | Cache Smart Pinning On Schedule Priority | キャッシュスケジュール優先度スマートピンニング | 캐시 스케줄 우선순위 시 스마트 고정
- ✅ 缓存计划优先级时智能固定
- ✅ Cache Smart Pinning On Schedule Priority
- ✅ キャッシュスケジュール優先度スマートピンニング
- ✅ 캐시 스케줄 우선순위 시 스마트 고정

### v157.8 进度条自定义滑块颜色157 | Progress Bar Custom Thumb Color157 | プログレスバーカスタムサム色157 | 진행 바 사용자 정의 썸 색상157
- ✅ 进度条自定义滑块颜色157
- ✅ Progress Bar Custom Thumb Color157
- ✅ プログレスバーカスタムサム色157
- ✅ 진행 바 사용자 정의 썸 색상157

### v157.9 音量限制器上限157 | Volume Limiter Ceiling157 | 音量リミッターシーリング157 | 볼륨 리미터 상한157
- ✅ 音量限制器上限157
- ✅ Volume Limiter Ceiling157
- ✅ 音量リミッターシーリング157
- ✅ 볼륨 리미터 상한157

### v157.10 历史记录自动清理157 | History Auto Clean157 | 履歴自動クリーンアップ157 | 기록 자동 정리157
- ✅ 历史记录自动清理157
- ✅ History Auto Clean157
- ✅ 履歴自動クリーンアップ157
- ✅ 기록 자동 정리157

### v157.11 播放速度预设运动检测 | Playback Speed Presets Motion Detect | 再生速度プリセットモーション検出 | 재생 속도 프리셋 모션 감지
- ✅ 播放速度预设运动检测
- ✅ Playback Speed Presets Motion Detect
- ✅ 再生速度プリセットモーション検出
- ✅ 재생 속도 프리셋 모션 감지

### v157.12 截图自动分享TikTok157 | Screenshot Auto Share TikTok157 | スクリーンショット自動TikTok157共有 | 스크린샷 자동 TikTok157 공유
- ✅ 截图自动分享TikTok157
- ✅ Screenshot Auto Share TikTok157
- ✅ スクリーンショット自動TikTok157共有
- ✅ 스크린샷 자동 TikTok157 공유

### v157.13 视频画中画跟随空间音频157 | Video PIP Follow Spatial Audio157 | ビデオPIP空間オーディオ157追従 | 비디오 PIP 공간 오디오157 팔로우
- ✅ 视频画中画跟随空间音频157
- ✅ Video PIP Follow Spatial Audio157
- ✅ ビデオPIP空間オーディオ157追従
- ✅ 비디오 PIP 공간 오디오157 팔로우

### v157.14 弹幕字体背景填充渐变停止点158 | Danmaku Font BG Fill Gradient Stops158 | コメントフォントBGフィルグラデーションストップ158 | 댓글 글꼴 배경 채우기 그라디언트 정지점158
- ✅ 弹幕字体背景填充渐变停止点158
- ✅ Danmaku Font BG Fill Gradient Stops158
- ✅ コメントフォントBGフィルグラデーションストップ158
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점158

### v157.15 字幕动画模糊157 | Subtitle Animation Blur157 | 字幕アニメーションブラー157 | 자막 애니메이션 블러157
- ✅ 字幕动画模糊157
- ✅ Subtitle Animation Blur157
- ✅ 字幕アニメーションブラー157
- ✅ 자막 애니메이션 블러157

### v158.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v158.1-v158.15 功能列表
- ✅ Audio Dynamic EQ Width, Danmaku Font BG Fill Gradient Stops159, Subtitle Animation Blur158, Gesture Tap Zone Visual Anim Speed158, Cast Video PIP Snap Easing, Playlist Auto Group By Tag158, Cache Smart Pinning On Schedule Status, Progress Bar Custom Thumb Glow158, Volume Limiter Auto, History Auto Clean158, Playback Speed Presets Motion Detect158, Screenshot Auto Share Twitch158, Video PIP Follow Spatial Audio158, Danmaku Font BG Fill Gradient Stops160, Subtitle Animation Fade In158

### v158.1 音频动态均衡器宽度 | Audio Dynamic EQ Width | オーディオダイナミックEQ幅 | 오디오 다이내믹 EQ 너비
- ✅ 音频动态均衡器宽度
- ✅ Audio Dynamic EQ Width
- ✅ オーディオダイナミックEQ幅
- ✅ 오디오 다이내믹 EQ 너비

### v158.2 弹幕字体背景填充渐变停止点159 | Danmaku Font BG Fill Gradient Stops159 | コメントフォントBGフィルグラデーションストップ159 | 댓글 글꼴 배경 채우기 그라디언트 정지점159
- ✅ 弹幕字体背景填充渐变停止点159
- ✅ Danmaku Font BG Fill Gradient Stops159
- ✅ コメントフォントBGフィルグラデーションストップ159
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점159

### v158.3 字幕动画模糊158 | Subtitle Animation Blur158 | 字幕アニメーションブラー158 | 자막 애니메이션 블러158
- ✅ 字幕动画模糊158
- ✅ Subtitle Animation Blur158
- ✅ 字幕アニメーションブラー158
- ✅ 자막 애니메이션 블러158

### v158.4 手势点击区域视觉动画速度158 | Gesture Tap Zone Visual Anim Speed158 | ジェスチャータップゾーン視覚アニメーション速度158 | 제스처 탭 영역 시각 애니메이션 속도158
- ✅ 手势点击区域视觉动画速度158
- ✅ Gesture Tap Zone Visual Anim Speed158
- ✅ ジェスチャータップゾーン視覚アニメーション速度158
- ✅ 제스처 탭 영역 시각 애니메이션 속도158

### v158.5 投射视频画中画吸附缓动 | Cast Video PIP Snap Easing | キャストビデオPIPスナップイージング | 캐스트 비디오 PIP 스냅 이징
- ✅ 投射视频画中画吸附缓动
- ✅ Cast Video PIP Snap Easing
- ✅ キャストビデオPIPスナップイージング
- ✅ 캐스트 비디오 PIP 스냅 이징

### v158.6 播放列表按标签自动分组158 | Playlist Auto Group By Tag158 | プレイリストタグ別自動グループ化158 | 재생 목록 태그별 자동 그룹화158
- ✅ 播放列表按标签自动分组158
- ✅ Playlist Auto Group By Tag158
- ✅ プレイリストタグ別自動グループ化158
- ✅ 재생 목록 태그별 자동 그룹화158

### v158.7 缓存计划状态时智能固定 | Cache Smart Pinning On Schedule Status | キャッシュスケジュールステータススマートピンニング | 캐시 스케줄 상태 시 스마트 고정
- ✅ 缓存计划状态时智能固定
- ✅ Cache Smart Pinning On Schedule Status
- ✅ キャッシュスケジュールステータススマートピンニング
- ✅ 캐시 스케줄 상태 시 스마트 고정

### v158.8 进度条自定义滑块发光158 | Progress Bar Custom Thumb Glow158 | プログレスバーカスタムサムグロウ158 | 진행 바 사용자 정의 썸 글로우158
- ✅ 进度条自定义滑块发光158
- ✅ Progress Bar Custom Thumb Glow158
- ✅ プログレスバーカスタムサムグロウ158
- ✅ 진행 바 사용자 정의 썸 글로우158

### v158.9 音量限制器自动 | Volume Limiter Auto | 音量リミッター自動 | 볼륨 리미터 자동
- ✅ 音量限制器自动
- ✅ Volume Limiter Auto
- ✅ 音量リミッター自動
- ✅ 볼륨 리미터 자동

### v158.10 历史记录自动清理158 | History Auto Clean158 | 履歴自動クリーンアップ158 | 기록 자동 정리158
- ✅ 历史记录自动清理158
- ✅ History Auto Clean158
- ✅ 履歴自動クリーンアップ158
- ✅ 기록 자동 정리158

### v158.11 播放速度预设运动检测158 | Playback Speed Presets Motion Detect158 | 再生速度プリセットモーション検出158 | 재생 속도 프리셋 모션 감지158
- ✅ 播放速度预设运动检测158
- ✅ Playback Speed Presets Motion Detect158
- ✅ 再生速度プリセットモーション検出158
- ✅ 재생 속도 프리셋 모션 감지158

### v158.12 截图自动分享Twitch158 | Screenshot Auto Share Twitch158 | スクリーンショット自動Twitch158共有 | 스크린샷 자동 Twitch158 공유
- ✅ 截图自动分享Twitch158
- ✅ Screenshot Auto Share Twitch158
- ✅ スクリーンショット自動Twitch158共有
- ✅ 스크린샷 자동 Twitch158 공유

### v158.13 视频画中画跟随空间音频158 | Video PIP Follow Spatial Audio158 | ビデオPIP空間オーディオ158追従 | 비디오 PIP 공간 오디오158 팔로우
- ✅ 视频画中画跟随空间音频158
- ✅ Video PIP Follow Spatial Audio158
- ✅ ビデオPIP空間オーディオ158追従
- ✅ 비디오 PIP 공간 오디오158 팔로우

### v158.14 弹幕字体背景填充渐变停止点160 | Danmaku Font BG Fill Gradient Stops160 | コメントフォントBGフィルグラデーションストップ160 | 댓글 글꼴 배경 채우기 그라디언트 정지점160
- ✅ 弹幕字体背景填充渐变停止点160
- ✅ Danmaku Font BG Fill Gradient Stops160
- ✅ コメントフォントBGフィルグラデーションストップ160
- ✅ 댓글 글꼴 배경 채우기 그라디언트 정지점160

### v158.15 字幕动画淡入158 | Subtitle Animation Fade In158 | 字幕アニメーションフェードイン158 | 자막 애니메이션 페이드인158
- ✅ 字幕动画淡入158
- ✅ Subtitle Animation Fade In158
- ✅ 字幕アニメーションフェードイン158
- ✅ 자막 애니메이션 페이드인158

### v159.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v159.1-v159.15 功能列表
- ✅ Audio Dynamic EQ Shape, Danmaku Font BG Fill Gradient Interp, Subtitle Animation Fade In159, Gesture Tap Zone Visual Anim Curve159, Cast Video PIP Snap Transform, Playlist Auto Group By Tag159, Cache Smart Pinning On Schedule Enabled, Progress Bar Custom Thumb Border159, Volume Limiter Auto159, History Auto Clean159, Playback Speed Presets Motion Detect159, Screenshot Auto Share Twitch159, Video PIP Follow Spatial Audio159, Danmaku Font BG Fill Gradient Interp159, Subtitle Animation Fade Out159

### v159.1 音频动态均衡器形状 | Audio Dynamic EQ Shape | オーディオダイナミックEQ形状 | 오디오 다이내믹 EQ 모양
- ✅ 音频动态均衡器形状
- ✅ Audio Dynamic EQ Shape
- ✅ オーディオダイナミックEQ形状
- ✅ 오디오 다이내믹 EQ 모양

### v159.2 弹幕字体背景填充渐变插值 | Danmaku Font BG Fill Gradient Interp | コメントフォントBGフィルグラデーション補間 | 댓글 글꼴 배경 채우기 그라디언트 보간
- ✅ 弹幕字体背景填充渐变插值
- ✅ Danmaku Font BG Fill Gradient Interp
- ✅ コメントフォントBGフィルグラデーション補間
- ✅ 댓글 글꼴 배경 채우기 그라디언트 보간

### v159.3 字幕动画淡入159 | Subtitle Animation Fade In159 | 字幕アニメーションフェードイン159 | 자막 애니메이션 페이드인159
- ✅ 字幕动画淡入159
- ✅ Subtitle Animation Fade In159
- ✅ 字幕アニメーションフェードイン159
- ✅ 자막 애니메이션 페이드인159

### v159.4 手势点击区域视觉动画曲线159 | Gesture Tap Zone Visual Anim Curve159 | ジェスチャータップゾーン視覚アニメーションカーブ159 | 제스처 탭 영역 시각 애니메이션 커브159
- ✅ 手势点击区域视觉动画曲线159
- ✅ Gesture Tap Zone Visual Anim Curve159
- ✅ ジェスチャータップゾーン視覚アニメーションカーブ159
- ✅ 제스처 탭 영역 시각 애니메이션 커브159

### v159.5 投射视频画中画吸附变换 | Cast Video PIP Snap Transform | キャストビデオPIPスナップトランスフォーム | 캐스트 비디오 PIP 스냅 변환
- ✅ 投射视频画中画吸附变换
- ✅ Cast Video PIP Snap Transform
- ✅ キャストビデオPIPスナップトランスフォーム
- ✅ 캐스트 비디오 PIP 스냅 변환

### v159.6 播放列表按标签自动分组159 | Playlist Auto Group By Tag159 | プレイリストタグ別自動グループ化159 | 재생 목록 태그별 자동 그룹화159
- ✅ 播放列表按标签自动分组159
- ✅ Playlist Auto Group By Tag159
- ✅ プレイリストタグ別自動グループ化159
- ✅ 재생 목록 태그별 자동 그룹화159

### v159.7 缓存计划启用时智能固定 | Cache Smart Pinning On Schedule Enabled | キャッシュスケジュール有効化スマートピンニング | 캐시 스케줄 활성화 시 스마트 고정
- ✅ 缓存计划启用时智能固定
- ✅ Cache Smart Pinning On Schedule Enabled
- ✅ キャッシュスケジュール有効化スマートピンニング
- ✅ 캐시 스케줄 활성화 시 스마트 고정

### v159.8 进度条自定义滑块边框159 | Progress Bar Custom Thumb Border159 | プログレスバーカスタムサムボーダー159 | 진행 바 사용자 정의 썸 테두리159
- ✅ 进度条自定义滑块边框159
- ✅ Progress Bar Custom Thumb Border159
- ✅ プログレスバーカスタムサムボーダー159
- ✅ 진행 바 사용자 정의 썸 테두리159

### v159.9 音量限制器自动159 | Volume Limiter Auto159 | 音量リミッター自動159 | 볼륨 리미터 자동159
- ✅ 音量限制器自动159
- ✅ Volume Limiter Auto159
- ✅ 音量リミッター自動159
- ✅ 볼륨 리미터 자동159

### v159.10 历史记录自动清理159 | History Auto Clean159 | 履歴自動クリーンアップ159 | 기록 자동 정리159
- ✅ 历史记录自动清理159
- ✅ History Auto Clean159
- ✅ 履歴自動クリーンアップ159
- ✅ 기록 자동 정리159

### v159.11 播放速度预设运动检测159 | Playback Speed Presets Motion Detect159 | 再生速度プリセットモーション検出159 | 재생 속도 프리셋 모션 감지159
- ✅ 播放速度预设运动检测159
- ✅ Playback Speed Presets Motion Detect159
- ✅ 再生速度プリセットモーション検出159
- ✅ 재생 속도 프리셋 모션 감지159

### v159.12 截图自动分享Twitch159 | Screenshot Auto Share Twitch159 | スクリーンショット自動Twitch159共有 | 스크린샷 자동 Twitch159 공유
- ✅ 截图自动分享Twitch159
- ✅ Screenshot Auto Share Twitch159
- ✅ スクリーンショット自動Twitch159共有
- ✅ 스크린샷 자동 Twitch159 공유

### v159.13 视频画中画跟随空间音频159 | Video PIP Follow Spatial Audio159 | ビデオPIP空間オーディオ159追従 | 비디오 PIP 공간 오디오159 팔로우
- ✅ 视频画中画跟随空间音频159
- ✅ Video PIP Follow Spatial Audio159
- ✅ ビデオPIP空間オーディオ159追従
- ✅ 비디오 PIP 공간 오디오159 팔로우

### v159.14 弹幕字体背景填充渐变插值159 | Danmaku Font BG Fill Gradient Interp159 | コメントフォントBGフィルグラデーション補間159 | 댓글 글꼴 배경 채우기 그라디언트 보간159
- ✅ 弹幕字体背景填充渐变插值159
- ✅ Danmaku Font BG Fill Gradient Interp159
- ✅ コメントフォントBGフィルグラデーション補間159
- ✅ 댓글 글꼴 배경 채우기 그라디언트 보간159

### v159.15 字幕动画淡出159 | Subtitle Animation Fade Out159 | 字幕アニメーションフェードアウト159 | 자막 애니메이션 페이드아웃159
- ✅ 字幕动画淡出159
- ✅ Subtitle Animation Fade Out159
- ✅ 字幕アニメーションフェードアウト159
- ✅ 자막 애니메이션 페이드아웃159

### v160.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v160.1-v160.15 功能列表
- ✅ Audio Dynamic EQ Mix, Danmaku Font BG Fill Gradient Interp160, Subtitle Animation Fade Out160, Gesture Tap Zone Visual Anim Curve160, Cast Video PIP Snap Transform160, Playlist Auto Group By Tag160, Cache Smart Pinning On Schedule Enabled160, Progress Bar Custom Thumb Color160, Volume Limiter Auto160, History Auto Clean160, Playback Speed Presets Motion Detect160, Screenshot Auto Share Twitch160, Video PIP Follow Spatial Audio160, Danmaku Font BG Fill Gradient Interp161, Subtitle Animation Translate160

### v160.1 音频动态均衡器混合 | Audio Dynamic EQ Mix | オーディオダイナミックEQミックス | 오디오 다이내믹 EQ 믹스
- ✅ 音频动态均衡器混合
- ✅ Audio Dynamic EQ Mix
- ✅ オーディオダイナミックEQミックス
- ✅ 오디오 다이내믹 EQ 믹스

### v160.2 弹幕字体背景填充渐变插值160 | Danmaku Font BG Fill Gradient Interp160 | コメントフォントBGフィルグラデーション補間160 | 댓글 글꼴 배경 채우기 그라디언트 보간160
- ✅ 弹幕字体背景填充渐变插值160
- ✅ Danmaku Font BG Fill Gradient Interp160
- ✅ コメントフォントBGフィルグラデーション補間160
- ✅ 댓글 글꼴 배경 채우기 그라디언트 보간160

### v160.3 字幕动画淡出160 | Subtitle Animation Fade Out160 | 字幕アニメーションフェードアウト160 | 자막 애니메이션 페이드아웃160
- ✅ 字幕动画淡出160
- ✅ Subtitle Animation Fade Out160
- ✅ 字幕アニメーションフェードアウト160
- ✅ 자막 애니메이션 페이드아웃160

### v160.4 手势点击区域视觉动画曲线160 | Gesture Tap Zone Visual Anim Curve160 | ジェスチャータップゾーン視覚アニメーションカーブ160 | 제스처 탭 영역 시각 애니메이션 커브160
- ✅ 手势点击区域视觉动画曲线160
- ✅ Gesture Tap Zone Visual Anim Curve160
- ✅ ジェスチャータップゾーン視覚アニメーションカーブ160
- ✅ 제스처 탭 영역 시각 애니메이션 커브160

### v160.5 投射视频画中画吸附变换160 | Cast Video PIP Snap Transform160 | キャストビデオPIPスナップトランスフォーム160 | 캐스트 비디오 PIP 스냅 변환160
- ✅ 投射视频画中画吸附变换160
- ✅ Cast Video PIP Snap Transform160
- ✅ キャストビデオPIPスナップトランスフォーム160
- ✅ 캐스트 비디오 PIP 스냅 변환160

### v160.6 播放列表按标签自动分组160 | Playlist Auto Group By Tag160 | プレイリストタグ別自動グループ化160 | 재생 목록 태그별 자동 그룹화160
- ✅ 播放列表按标签自动分组160
- ✅ Playlist Auto Group By Tag160
- ✅ プレイリストタグ別自動グループ化160
- ✅ 재생 목록 태그별 자동 그룹화160

### v160.7 缓存计划启用时智能固定160 | Cache Smart Pinning On Schedule Enabled160 | キャッシュスケジュール有効化スマートピンニング160 | 캐시 스케줄 활성화 시 스마트 고정160
- ✅ 缓存计划启用时智能固定160
- ✅ Cache Smart Pinning On Schedule Enabled160
- ✅ キャッシュスケジュール有効化スマートピンニング160
- ✅ 캐시 스케줄 활성화 시 스마트 고정160

### v160.8 进度条自定义滑块颜色160 | Progress Bar Custom Thumb Color160 | プログレスバーカスタムサム色160 | 진행 바 사용자 정의 썸 색상160
- ✅ 进度条自定义滑块颜色160
- ✅ Progress Bar Custom Thumb Color160
- ✅ プログレスバーカスタムサム色160
- ✅ 진행 바 사용자 정의 썸 색상160

### v160.9 音量限制器自动160 | Volume Limiter Auto160 | 音量リミッター自動160 | 볼륨 리미터 자동160
- ✅ 音量限制器自动160
- ✅ Volume Limiter Auto160
- ✅ 音量リミッター自動160
- ✅ 볼륨 리미터 자동160

### v160.10 历史记录自动清理160 | History Auto Clean160 | 履歴自動クリーンアップ160 | 기록 자동 정리160
- ✅ 历史记录自动清理160
- ✅ History Auto Clean160
- ✅ 履歴自動クリーンアップ160
- ✅ 기록 자동 정리160

### v160.11 播放速度预设运动检测160 | Playback Speed Presets Motion Detect160 | 再生速度プリセットモーション検出160 | 재생 속도 프리셋 모션 감지160
- ✅ 播放速度预设运动检测160
- ✅ Playback Speed Presets Motion Detect160
- ✅ 再生速度プリセットモーション検出160
- ✅ 재생 속도 프리셋 모션 감지160

### v160.12 截图自动分享Twitch160 | Screenshot Auto Share Twitch160 | スクリーンショット自動Twitch160共有 | 스크린샷 자동 Twitch160 공유
- ✅ 截图自动分享Twitch160
- ✅ Screenshot Auto Share Twitch160
- ✅ スクリーンショット自動Twitch160共有
- ✅ 스크린샷 자동 Twitch160 공유

### v160.13 视频画中画跟随空间音频160 | Video PIP Follow Spatial Audio160 | ビデオPIP空間オーディオ160追従 | 비디오 PIP 공간 오디오160 팔로우
- ✅ 视频画中画跟随空间音频160
- ✅ Video PIP Follow Spatial Audio160
- ✅ ビデオPIP空間オーディオ160追従
- ✅ 비디오 PIP 공간 오디오160 팔로우

### v160.14 弹幕字体背景填充渐变插值161 | Danmaku Font BG Fill Gradient Interp161 | コメントフォントBGフィルグラデーション補間161 | 댓글 글꼴 배경 채우기 그라디언트 보간161
- ✅ 弹幕字体背景填充渐变插值161
- ✅ Danmaku Font BG Fill Gradient Interp161
- ✅ コメントフォントBGフィルグラデーション補間161
- ✅ 댓글 글꼴 배경 채우기 그라디언트 보간161

### v160.15 字幕动画平移160 | Subtitle Animation Translate160 | 字幕アニメーショントランスレート160 | 자막 애니메이션 이동160
- ✅ 字幕动画平移160
- ✅ Subtitle Animation Translate160
- ✅ 字幕アニメーショントランスレート160
- ✅ 자막 애니메이션 이동160


### v161.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v161.1-v161.15 功能列表
- ✅ Audio Gate Toggle161, Danmaku Render Batch Size, Subtitle Position Anchor, Gesture Long Press Action, Cast Video PIP Max Resolution, Playlist Continue Play Next, Cache Preload Next Episode, Progress Bar Buffered Color, Volume Fade In On Resume, History Import Export, Playback Auto Rotate Landscape, Screenshot Format PNG, Video Denoise Toggle161, Danmaku Render Thread Count, Subtitle Karaoke Highlight

### v161.1 音频门限开关161 | Audio Gate Toggle161 | オーディオゲート切替161 | 오디오 게이트 전환161
- ✅ 音频门限开关161
- ✅ Audio Gate Toggle161
- ✅ オーディオゲート切替161
- ✅ 오디오 게이트 전환161

### v161.2 弹幕渲染批量大小 | Danmaku Render Batch Size | コメントレンダリングバッチサイズ | 댓글 렌더링 배치 크기
- ✅ 弹幕渲染批量大小
- ✅ Danmaku Render Batch Size
- ✅ コメントレンダリングバッチサイズ
- ✅ 댓글 렌더링 배치 크기

### v161.3 字幕位置锚点 | Subtitle Position Anchor | 字幕位置アンカー | 자막 위치 앵커
- ✅ 字幕位置锚点
- ✅ Subtitle Position Anchor
- ✅ 字幕位置アンカー
- ✅ 자막 위치 앵커

### v161.4 手势长按操作 | Gesture Long Press Action | ジェスチャー長押しアクション | 제스처 길게 누르기 동작
- ✅ 手势长按操作
- ✅ Gesture Long Press Action
- ✅ ジェスチャー長押しアクション
- ✅ 제스처 길게 누르기 동작

### v161.5 投射视频画中画最大分辨率 | Cast Video PIP Max Resolution | キャストビデオPIP最大解像度 | 캐스트 비디오 PIP 최대 해상도
- ✅ 投射视频画中画最大分辨率
- ✅ Cast Video PIP Max Resolution
- ✅ キャストビデオPIP最大解像度
- ✅ 캐스트 비디오 PIP 최대 해상도

### v161.6 播放列表自动播放下一个 | Playlist Continue Play Next | プレイリスト次曲自動再生 | 재생 목록 다음곡 자동 재생
- ✅ 播放列表自动播放下一个
- ✅ Playlist Continue Play Next
- ✅ プレイリスト次曲自動再生
- ✅ 재생 목록 다음곡 자동 재생

### v161.7 缓存预加载下一集 | Cache Preload Next Episode | キャッシュ次エピソードプリロード | 캐시 다음 에피소드 프리로드
- ✅ 缓存预加载下一集
- ✅ Cache Preload Next Episode
- ✅ キャッシュ次エピソードプリロード
- ✅ 캐시 다음 에피소드 프리로드

### v161.8 进度条缓冲区颜色 | Progress Bar Buffered Color | プログレスバーバッファ色 | 진행 바 버퍼 색상
- ✅ 进度条缓冲区颜色
- ✅ Progress Bar Buffered Color
- ✅ プログレスバーバッファ色
- ✅ 진행 바 버퍼 색상

### v161.9 恢复播放时音量淡入 | Volume Fade In On Resume | 再生再開時ボリュームフェードイン | 재생 재개 시 볼륨 페이드인
- ✅ 恢复播放时音量淡入
- ✅ Volume Fade In On Resume
- ✅ 再生再開時ボリュームフェードイン
- ✅ 재생 재개 시 볼륨 페이드인

### v161.10 历史记录导入导出 | History Import Export | 履歴インポート/エクスポート | 기록 가져오기/내보내기
- ✅ 历史记录导入导出
- ✅ History Import Export
- ✅ 履歴インポート/エクスポート
- ✅ 기록 가져오기/내보내기

### v161.11 播放自动旋转横屏 | Playback Auto Rotate Landscape | 再生時自動横向回転 | 재생 시 자동 가로 회전
- ✅ 播放自动旋转横屏
- ✅ Playback Auto Rotate Landscape
- ✅ 再生時自動横向回転
- ✅ 재생 시 자동 가로 회전

### v161.12 截图格式PNG | Screenshot Format PNG | スクリーンショット形式PNG | 스크린샷 형식 PNG
- ✅ 截图格式PNG
- ✅ Screenshot Format PNG
- ✅ スクリーンショット形式PNG
- ✅ 스크린샷 형식 PNG

### v161.13 视频降噪开关161 | Video Denoise Toggle161 | ビデオノイズ除去切替161 | 비디오 노이즈 제거 전환161
- ✅ 视频降噪开关161
- ✅ Video Denoise Toggle161
- ✅ ビデオノイズ除去切替161
- ✅ 비디오 노이즈 제거 전환161

### v161.14 弹幕渲染线程数 | Danmaku Render Thread Count | コメントレンダリングスレッド数 | 댓글 렌더링 스레드 수
- ✅ 弹幕渲染线程数
- ✅ Danmaku Render Thread Count
- ✅ コメントレンダリングスレッド数
- ✅ 댓글 렌더링 스레드 수

### v161.15 字幕卡拉OK高亮 | Subtitle Karaoke Highlight | 字幕カラオケハイライト | 자막 가라오케 하이라이트
- ✅ 字幕卡拉OK高亮
- ✅ Subtitle Karaoke Highlight
- ✅ 字幕カラオケハイライト
- ✅ 자막 가라오케 하이라이트

### v162.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v162.1-v162.15 功能列表
- ✅ Audio Gate Threshold162, Danmaku Render Thread Count162, Subtitle Karaoke Highlight162, Gesture Long Press Duration, Cast Video PIP Max Resolution162, Playlist Continue Play Next162, Cache Preload Next Episode162, Progress Bar Buffered Color162, Volume Fade In On Resume162, History Import Export162, Playback Auto Rotate Landscape162, Screenshot Format JPEG, Video Denoise Strength162, Danmaku Render Cache Toggle, Subtitle Karaoke Speed

### v162.1 音频门限阈值162 | Audio Gate Threshold162 | オーディオゲートしきい値162 | 오디오 게이트 임계값162
- ✅ 音频门限阈值162
- ✅ Audio Gate Threshold162
- ✅ オーディオゲートしきい値162
- ✅ 오디오 게이트 임계값162

### v162.2 弹幕渲染线程数162 | Danmaku Render Thread Count162 | コメントレンダリングスレッド数162 | 댓글 렌더링 스레드 수162
- ✅ 弹幕渲染线程数162
- ✅ Danmaku Render Thread Count162
- ✅ コメントレンダリングスレッド数162
- ✅ 댓글 렌더링 스레드 수162

### v162.3 字幕卡拉OK高亮162 | Subtitle Karaoke Highlight162 | 字幕カラオケハイライト162 | 자막 가라오케 하이라이트162
- ✅ 字幕卡拉OK高亮162
- ✅ Subtitle Karaoke Highlight162
- ✅ 字幕カラオケハイライト162
- ✅ 자막 가라오케 하이라이트162

### v162.4 手势长按持续时间 | Gesture Long Press Duration | ジェスチャー長押し持続時間 | 제스처 길게 누르기 지속 시간
- ✅ 手势长按持续时间
- ✅ Gesture Long Press Duration
- ✅ ジェスチャー長押し持続時間
- ✅ 제스처 길게 누르기 지속 시간

### v162.5 投射视频画中画最大分辨率162 | Cast Video PIP Max Resolution162 | キャストビデオPIP最大解像度162 | 캐스트 비디오 PIP 최대 해상도162
- ✅ 投射视频画中画最大分辨率162
- ✅ Cast Video PIP Max Resolution162
- ✅ キャストビデオPIP最大解像度162
- ✅ 캐스트 비디오 PIP 최대 해상도162

### v162.6 播放列表自动播放下一个162 | Playlist Continue Play Next162 | プレイリスト次曲自動再生162 | 재생 목록 다음곡 자동 재생162
- ✅ 播放列表自动播放下一个162
- ✅ Playlist Continue Play Next162
- ✅ プレイリスト次曲自動再生162
- ✅ 재생 목록 다음곡 자동 재생162

### v162.7 缓存预加载下一集162 | Cache Preload Next Episode162 | キャッシュ次エピソードプリロード162 | 캐시 다음 에피소드 프리로드162
- ✅ 缓存预加载下一集162
- ✅ Cache Preload Next Episode162
- ✅ キャッシュ次エピソードプリロード162
- ✅ 캐시 다음 에피소드 프리로드162

### v162.8 进度条缓冲区颜色162 | Progress Bar Buffered Color162 | プログレスバーバッファ色162 | 진행 바 버퍼 색상162
- ✅ 进度条缓冲区颜色162
- ✅ Progress Bar Buffered Color162
- ✅ プログレスバーバッファ色162
- ✅ 진행 바 버퍼 색상162

### v162.9 恢复播放时音量淡入162 | Volume Fade In On Resume162 | 再生再開時ボリュームフェードイン162 | 재생 재개 시 볼륨 페이드인162
- ✅ 恢复播放时音量淡入162
- ✅ Volume Fade In On Resume162
- ✅ 再生再開時ボリュームフェードイン162
- ✅ 재생 재개 시 볼륨 페이드인162

### v162.10 历史记录导入导出162 | History Import Export162 | 履歴インポート/エクスポート162 | 기록 가져오기/내보내기162
- ✅ 历史记录导入导出162
- ✅ History Import Export162
- ✅ 履歴インポート/エクスポート162
- ✅ 기록 가져오기/내보내기162

### v162.11 播放自动旋转横屏162 | Playback Auto Rotate Landscape162 | 再生時自動横向回転162 | 재생 시 자동 가로 회전162
- ✅ 播放自动旋转横屏162
- ✅ Playback Auto Rotate Landscape162
- ✅ 再生時自動横向回転162
- ✅ 재생 시 자동 가로 회전162

### v162.12 截图格式JPEG | Screenshot Format JPEG | スクリーンショット形式JPEG | 스크린샷 형식 JPEG
- ✅ 截图格式JPEG
- ✅ Screenshot Format JPEG
- ✅ スクリーンショット形式JPEG
- ✅ 스크린샷 형식 JPEG

### v162.13 视频降噪强度162 | Video Denoise Strength162 | ビデオノイズ除去強度162 | 비디오 노이즈 제거 강도162
- ✅ 视频降噪强度162
- ✅ Video Denoise Strength162
- ✅ ビデオノイズ除去強度162
- ✅ 비디오 노이즈 제거 강도162

### v162.14 弹幕渲染缓存开关 | Danmaku Render Cache Toggle | コメントレンダリングキャッシュ切替 | 댓글 렌더링 캐시 전환
- ✅ 弹幕渲染缓存开关
- ✅ Danmaku Render Cache Toggle
- ✅ コメントレンダリングキャッシュ切替
- ✅ 댓글 렌더링 캐시 전환

### v162.15 字幕卡拉OK速度 | Subtitle Karaoke Speed | 字幕カラオケ速度 | 자막 가라오케 속도
- ✅ 字幕卡拉OK速度
- ✅ Subtitle Karaoke Speed
- ✅ 字幕カラオケ速度
- ✅ 자막 가라오케 속도

### v163.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v163.1-v163.15 功能列表
- ✅ Audio Gate Release163, Danmaku Render Cache Toggle163, Subtitle Karaoke Speed163, Gesture Long Press Vibrate, Cast Video PIP Bitrate Limit, Playlist Continue On Wifi, Cache Preload Size MB, Progress Bar Buffered Width, Volume Fade Out On Pause, History Sync Cloud, Playback Auto Rotate Portrait, Screenshot Quality Level, Video Denoise Strength163, Danmaku Render Cache Size, Subtitle Karaoke Color

### v163.1 音频门限释放163 | Audio Gate Release163 | オーディオゲートリリース163 | 오디오 게이트 릴리스163
- ✅ 音频门限释放163
- ✅ Audio Gate Release163
- ✅ オーディオゲートリリース163
- ✅ 오디오 게이트 릴리스163

### v163.2 弹幕渲染缓存开关163 | Danmaku Render Cache Toggle163 | コメントレンダリングキャッシュ切替163 | 댓글 렌더링 캐시 전환163
- ✅ 弹幕渲染缓存开关163
- ✅ Danmaku Render Cache Toggle163
- ✅ コメントレンダリングキャッシュ切替163
- ✅ 댓글 렌더링 캐시 전환163

### v163.3 字幕卡拉OK速度163 | Subtitle Karaoke Speed163 | 字幕カラオケ速度163 | 자막 가라오케 속도163
- ✅ 字幕卡拉OK速度163
- ✅ Subtitle Karaoke Speed163
- ✅ 字幕カラオケ速度163
- ✅ 자막 가라오케 속도163

### v163.4 手势长按振动 | Gesture Long Press Vibrate | ジェスチャー長押し振動 | 제스처 길게 누르기 진동
- ✅ 手势长按振动
- ✅ Gesture Long Press Vibrate
- ✅ ジェスチャー長押し振動
- ✅ 제스처 길게 누르기 진동

### v163.5 投射视频画中画比特率限制 | Cast Video PIP Bitrate Limit | キャストビデオPIPビットレート制限 | 캐스트 비디오 PIP 비트레이트 제한
- ✅ 投射视频画中画比特率限制
- ✅ Cast Video PIP Bitrate Limit
- ✅ キャストビデオPIPビットレート制限
- ✅ 캐스트 비디오 PIP 비트레이트 제한

### v163.6 播放列表WiFi时继续播放 | Playlist Continue On Wifi | プレイリストWiFi時継続再生 | 재생 목록 WiFi 시 계속 재생
- ✅ 播放列表WiFi时继续播放
- ✅ Playlist Continue On Wifi
- ✅ プレイリストWiFi時継続再生
- ✅ 재생 목록 WiFi 시 계속 재생

### v163.7 缓存预加载大小MB | Cache Preload Size MB | キャッシュプリロードサイズMB | 캐시 프리로드 크기 MB
- ✅ 缓存预加载大小MB
- ✅ Cache Preload Size MB
- ✅ キャッシュプリロードサイズMB
- ✅ 캐시 프리로드 크기 MB

### v163.8 进度条缓冲区宽度 | Progress Bar Buffered Width | プログレスバーバッファ幅 | 진행 바 버퍼 너비
- ✅ 进度条缓冲区宽度
- ✅ Progress Bar Buffered Width
- ✅ プログレスバーバッファ幅
- ✅ 진행 바 버퍼 너비

### v163.9 暂停时音量淡出 | Volume Fade Out On Pause | 一時停止時ボリュームフェードアウト | 일시 정지 시 볼륨 페이드아웃
- ✅ 暂停时音量淡出
- ✅ Volume Fade Out On Pause
- ✅ 一時停止時ボリュームフェードアウト
- ✅ 일시 정지 시 볼륨 페이드아웃

### v163.10 历史记录云同步 | History Sync Cloud | 履歴クラウド同期 | 기록 클라우드 동기화
- ✅ 历史记录云同步
- ✅ History Sync Cloud
- ✅ 履歴クラウド同期
- ✅ 기록 클라우드 동기화

### v163.11 播放自动旋转竖屏 | Playback Auto Rotate Portrait | 再生時自動縦向回転 | 재생 시 자동 세로 회전
- ✅ 播放自动旋转竖屏
- ✅ Playback Auto Rotate Portrait
- ✅ 再生時自動縦向回転
- ✅ 재생 시 자동 세로 회전

### v163.12 截图质量级别 | Screenshot Quality Level | スクリーンショット品質レベル | 스크린샷 품질 수준
- ✅ 截图质量级别
- ✅ Screenshot Quality Level
- ✅ スクリーンショット品質レベル
- ✅ 스크린샷 품질 수준

### v163.13 视频降噪强度163 | Video Denoise Strength163 | ビデオノイズ除去強度163 | 비디오 노이즈 제거 강도163
- ✅ 视频降噪强度163
- ✅ Video Denoise Strength163
- ✅ ビデオノイズ除去強度163
- ✅ 비디오 노이즈 제거 강도163

### v163.14 弹幕渲染缓存大小 | Danmaku Render Cache Size | コメントレンダリングキャッシュサイズ | 댓글 렌더링 캐시 크기
- ✅ 弹幕渲染缓存大小
- ✅ Danmaku Render Cache Size
- ✅ コメントレンダリングキャッシュサイズ
- ✅ 댓글 렌더링 캐시 크기

### v163.15 字幕卡拉OK颜色 | Subtitle Karaoke Color | 字幕カラオケ色 | 자막 가라오케 색상
- ✅ 字幕卡拉OK颜色
- ✅ Subtitle Karaoke Color
- ✅ 字幕カラオケ色
- ✅ 자막 가라오케 색상

### v164.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v164.1-v164.15 功能列表
- ✅ Audio Gate Range164, Danmaku Render Cache Size164, Subtitle Karaoke Color164, Gesture Long Press Vibrate164, Cast Video PIP Bitrate Limit164, Playlist Continue On Wifi164, Cache Preload On Wifi, Progress Bar Buffered Opacity, Volume Fade Out On Pause164, History Sync Cloud164, Playback Remember Speed, Screenshot Auto Name, Video Sharpen Toggle164, Danmaku Render Cache Policy, Subtitle Karaoke Font

### v164.1 音频门限范围164 | Audio Gate Range164 | オーディオゲートレンジ164 | 오디오 게이트 범위164
- ✅ 音频门限范围164
- ✅ Audio Gate Range164
- ✅ オーディオゲートレンジ164
- ✅ 오디오 게이트 범위164

### v164.2 弹幕渲染缓存大小164 | Danmaku Render Cache Size164 | コメントレンダリングキャッシュサイズ164 | 댓글 렌더링 캐시 크기164
- ✅ 弹幕渲染缓存大小164
- ✅ Danmaku Render Cache Size164
- ✅ コメントレンダリングキャッシュサイズ164
- ✅ 댓글 렌더링 캐시 크기164

### v164.3 字幕卡拉OK颜色164 | Subtitle Karaoke Color164 | 字幕カラオケ色164 | 자막 가라오케 색상164
- ✅ 字幕卡拉OK颜色164
- ✅ Subtitle Karaoke Color164
- ✅ 字幕カラオケ色164
- ✅ 자막 가라오케 색상164

### v164.4 手势长按振动164 | Gesture Long Press Vibrate164 | ジェスチャー長押し振動164 | 제스처 길게 누르기 진동164
- ✅ 手势长按振动164
- ✅ Gesture Long Press Vibrate164
- ✅ ジェスチャー長押し振動164
- ✅ 제스처 길게 누르기 진동164

### v164.5 投射视频画中画比特率限制164 | Cast Video PIP Bitrate Limit164 | キャストビデオPIPビットレート制限164 | 캐스트 비디오 PIP 비트레이트 제한164
- ✅ 投射视频画中画比特率限制164
- ✅ Cast Video PIP Bitrate Limit164
- ✅ キャストビデオPIPビットレート制限164
- ✅ 캐스트 비디오 PIP 비트레이트 제한164

### v164.6 播放列表WiFi时继续播放164 | Playlist Continue On Wifi164 | プレイリストWiFi時継続再生164 | 재생 목록 WiFi 시 계속 재생164
- ✅ 播放列表WiFi时继续播放164
- ✅ Playlist Continue On Wifi164
- ✅ プレイリストWiFi時継続再生164
- ✅ 재생 목록 WiFi 시 계속 재생164

### v164.7 缓存仅WiFi预加载 | Cache Preload On Wifi | キャッシュWiFi時プリロード | 캐시 WiFi 시 프리로드
- ✅ 缓存仅WiFi预加载
- ✅ Cache Preload On Wifi
- ✅ キャッシュWiFi時プリロード
- ✅ 캐시 WiFi 시 프리로드

### v164.8 进度条缓冲区透明度 | Progress Bar Buffered Opacity | プログレスバーバッファ透明度 | 진행 바 버퍼 불투명도
- ✅ 进度条缓冲区透明度
- ✅ Progress Bar Buffered Opacity
- ✅ プログレスバーバッファ透明度
- ✅ 진행 바 버퍼 불투명도

### v164.9 暂停时音量淡出164 | Volume Fade Out On Pause164 | 一時停止時ボリュームフェードアウト164 | 일시 정지 시 볼륨 페이드아웃164
- ✅ 暂停时音量淡出164
- ✅ Volume Fade Out On Pause164
- ✅ 一時停止時ボリュームフェードアウト164
- ✅ 일시 정지 시 볼륨 페이드아웃164

### v164.10 历史记录云同步164 | History Sync Cloud164 | 履歴クラウド同期164 | 기록 클라우드 동기화164
- ✅ 历史记录云同步164
- ✅ History Sync Cloud164
- ✅ 履歴クラウド同期164
- ✅ 기록 클라우드 동기화164

### v164.11 播放记住速度 | Playback Remember Speed | 再生速度記憶 | 재생 속도 기억
- ✅ 播放记住速度
- ✅ Playback Remember Speed
- ✅ 再生速度記憶
- ✅ 재생 속도 기억

### v164.12 截图自动命名 | Screenshot Auto Name | スクリーンショット自動命名 | 스크린샷 자동 이름
- ✅ 截图自动命名
- ✅ Screenshot Auto Name
- ✅ スクリーンショット自動命名
- ✅ 스크린샷 자동 이름

### v164.13 视频锐化开关164 | Video Sharpen Toggle164 | ビデオシャープン切替164 | 비디오 선명화 전환164
- ✅ 视频锐化开关164
- ✅ Video Sharpen Toggle164
- ✅ ビデオシャープン切替164
- ✅ 비디오 선명화 전환164

### v164.14 弹幕渲染缓存策略 | Danmaku Render Cache Policy | コメントレンダリングキャッシュポリシー | 댓글 렌더링 캐시 정책
- ✅ 弹幕渲染缓存策略
- ✅ Danmaku Render Cache Policy
- ✅ コメントレンダリングキャッシュポリシー
- ✅ 댓글 렌더링 캐시 정책

### v164.15 字幕卡拉OK字体 | Subtitle Karaoke Font | 字幕カラオケフォント | 자막 가라오케 글꼴
- ✅ 字幕卡拉OK字体
- ✅ Subtitle Karaoke Font
- ✅ 字幕カラオケフォント
- ✅ 자막 가라오케 글꼴

### v165.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v165.1-v165.15 功能列表
- ✅ Audio Gate Attack165, Danmaku Render Cache Policy165, Subtitle Karaoke Font165, Gesture Swipe Left Action, Cast Video PIP Frame Drop, Playlist Shuffle Mode, Cache Preload On Wifi165, Progress Bar Buffered Anim, Volume Fade Duration, History Sync Wifi, Playback Remember Speed165, Screenshot Auto Name165, Video Sharpen Strength165, Danmaku Render Batch, Subtitle Karaoke Timing

### v165.1 音频门限启动165 | Audio Gate Attack165 | オーディオゲートアタック165 | 오디오 게이트 어택165
- ✅ 音频门限启动165
- ✅ Audio Gate Attack165
- ✅ オーディオゲートアタック165
- ✅ 오디오 게이트 어택165

### v165.2 弹幕渲染缓存策略165 | Danmaku Render Cache Policy165 | コメントレンダリングキャッシュポリシー165 | 댓글 렌더링 캐시 정책165
- ✅ 弹幕渲染缓存策略165
- ✅ Danmaku Render Cache Policy165
- ✅ コメントレンダリングキャッシュポリシー165
- ✅ 댓글 렌더링 캐시 정책165

### v165.3 字幕卡拉OK字体165 | Subtitle Karaoke Font165 | 字幕カラオケフォント165 | 자막 가라오케 글꼴165
- ✅ 字幕卡拉OK字体165
- ✅ Subtitle Karaoke Font165
- ✅ 字幕カラオケフォント165
- ✅ 자막 가라오케 글꼴165

### v165.4 手势左滑操作 | Gesture Swipe Left Action | ジェスチャースワイプ左アクション | 제스처 왼쪽 스와이프 동작
- ✅ 手势左滑操作
- ✅ Gesture Swipe Left Action
- ✅ ジェスチャースワイプ左アクション
- ✅ 제스처 왼쪽 스와이프 동작

### v165.5 投射视频画中画丢帧 | Cast Video PIP Frame Drop | キャストビデオPIPフレームドロップ | 캐스트 비디오 PIP 프레임 드롭
- ✅ 投射视频画中画丢帧
- ✅ Cast Video PIP Frame Drop
- ✅ キャストビデオPIPフレームドロップ
- ✅ 캐스트 비디오 PIP 프레임 드롭

### v165.6 播放列表随机模式 | Playlist Shuffle Mode | プレイリストシャッフルモード | 재생 목록 셔플 모드
- ✅ 播放列表随机模式
- ✅ Playlist Shuffle Mode
- ✅ プレイリストシャッフルモード
- ✅ 재생 목록 셔플 모드

### v165.7 缓存仅WiFi预加载165 | Cache Preload On Wifi165 | キャッシュWiFi時プリロード165 | 캐시 WiFi 시 프리로드165
- ✅ 缓存仅WiFi预加载165
- ✅ Cache Preload On Wifi165
- ✅ キャッシュWiFi時プリロード165
- ✅ 캐시 WiFi 시 프리로드165

### v165.8 进度条缓冲区动画 | Progress Bar Buffered Anim | プログレスバーバッファアニメーション | 진행 바 버퍼 애니메이션
- ✅ 进度条缓冲区动画
- ✅ Progress Bar Buffered Anim
- ✅ プログレスバーバッファアニメーション
- ✅ 진행 바 버퍼 애니메이션

### v165.9 音量淡入淡出持续 | Volume Fade Duration | ボリュームフェード持続時間 | 볼륨 페이드 지속 시간
- ✅ 音量淡入淡出持续
- ✅ Volume Fade Duration
- ✅ ボリュームフェード持続時間
- ✅ 볼륨 페이드 지속 시간

### v165.10 历史记录WiFi同步 | History Sync Wifi | 履歴WiFi同期 | 기록 WiFi 동기화
- ✅ 历史记录WiFi同步
- ✅ History Sync Wifi
- ✅ 履歴WiFi同期
- ✅ 기록 WiFi 동기화

### v165.11 播放记住速度165 | Playback Remember Speed165 | 再生速度記憶165 | 재생 속도 기억165
- ✅ 播放记住速度165
- ✅ Playback Remember Speed165
- ✅ 再生速度記憶165
- ✅ 재생 속도 기억165

### v165.12 截图自动命名165 | Screenshot Auto Name165 | スクリーンショット自動命名165 | 스크린샷 자동 이름165
- ✅ 截图自动命名165
- ✅ Screenshot Auto Name165
- ✅ スクリーンショット自動命名165
- ✅ 스크린샷 자동 이름165

### v165.13 视频锐化强度165 | Video Sharpen Strength165 | ビデオシャープン強度165 | 비디오 선명화 강도165
- ✅ 视频锐化强度165
- ✅ Video Sharpen Strength165
- ✅ ビデオシャープン強度165
- ✅ 비디오 선명화 강도165

### v165.14 弹幕批量渲染 | Danmaku Render Batch | コメントバッチレンダリング | 댓글 배치 렌더링
- ✅ 弹幕批量渲染
- ✅ Danmaku Render Batch
- ✅ コメントバッチレンダリング
- ✅ 댓글 배치 렌더링

### v165.15 字幕卡拉OK时间轴 | Subtitle Karaoke Timing | 字幕カラオケタイミング | 자막 가라오케 타이밍
- ✅ 字幕卡拉OK时间轴
- ✅ Subtitle Karaoke Timing
- ✅ 字幕カラオケタイミング
- ✅ 자막 가라오케 타이밍

### v166.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v166.1-v166.15 功能列表
- ✅ Audio Gate Hysteresis, Danmaku Render Batch166, Subtitle Karaoke Timing166, Gesture Swipe Right Action, Cast Video PIP Frame Drop166, Playlist Shuffle Mode166, Cache Preload Priority, Progress Bar Buffered Anim166, Volume Fade Duration166, History Sync Wifi166, Playback Remember Quality, Screenshot Prefix Custom, Video Sharpen Strength166, Danmaku Render Batch Size166, Subtitle Karaoke Mode

### v166.1 音频门限滞后 | Audio Gate Hysteresis | オーディオゲートヒステリシス | 오디오 게이트 히스테리시스
- ✅ 音频门限滞后
- ✅ Audio Gate Hysteresis
- ✅ オーディオゲートヒステリシス
- ✅ 오디오 게이트 히스테리시스

### v166.2 弹幕批量渲染166 | Danmaku Render Batch166 | コメントバッチレンダリング166 | 댓글 배치 렌더링166
- ✅ 弹幕批量渲染166
- ✅ Danmaku Render Batch166
- ✅ コメントバッチレンダリング166
- ✅ 댓글 배치 렌더링166

### v166.3 字幕卡拉OK时间轴166 | Subtitle Karaoke Timing166 | 字幕カラオケタイミング166 | 자막 가라오케 타이밍166
- ✅ 字幕卡拉OK时间轴166
- ✅ Subtitle Karaoke Timing166
- ✅ 字幕カラオケタイミング166
- ✅ 자막 가라오케 타이밍166

### v166.4 手势右滑操作 | Gesture Swipe Right Action | ジェスチャースワイプ右アクション | 제스처 오른쪽 스와이프 동작
- ✅ 手势右滑操作
- ✅ Gesture Swipe Right Action
- ✅ ジェスチャースワイプ右アクション
- ✅ 제스처 오른쪽 스와이프 동작

### v166.5 投射视频画中画丢帧166 | Cast Video PIP Frame Drop166 | キャストビデオPIPフレームドロップ166 | 캐스트 비디오 PIP 프레임 드롭166
- ✅ 投射视频画中画丢帧166
- ✅ Cast Video PIP Frame Drop166
- ✅ キャストビデオPIPフレームドロップ166
- ✅ 캐스트 비디오 PIP 프레임 드롭166

### v166.6 播放列表随机模式166 | Playlist Shuffle Mode166 | プレイリストシャッフルモード166 | 재생 목록 셔플 모드166
- ✅ 播放列表随机模式166
- ✅ Playlist Shuffle Mode166
- ✅ プレイリストシャッフルモード166
- ✅ 재생 목록 셔플 모드166

### v166.7 缓存预加载优先级 | Cache Preload Priority | キャッシュプリロード優先度 | 캐시 프리로드 우선순위
- ✅ 缓存预加载优先级
- ✅ Cache Preload Priority
- ✅ キャッシュプリロード優先度
- ✅ 캐시 프리로드 우선순위

### v166.8 进度条缓冲区动画166 | Progress Bar Buffered Anim166 | プログレスバーバッファアニメーション166 | 진행 바 버퍼 애니메이션166
- ✅ 进度条缓冲区动画166
- ✅ Progress Bar Buffered Anim166
- ✅ プログレスバーバッファアニメーション166
- ✅ 진행 바 버퍼 애니메이션166

### v166.9 音量淡入淡出持续166 | Volume Fade Duration166 | ボリュームフェード持続時間166 | 볼륨 페이드 지속 시간166
- ✅ 音量淡入淡出持续166
- ✅ Volume Fade Duration166
- ✅ ボリュームフェード持続時間166
- ✅ 볼륨 페이드 지속 시간166

### v166.10 历史记录WiFi同步166 | History Sync Wifi166 | 履歴WiFi同期166 | 기록 WiFi 동기화166
- ✅ 历史记录WiFi同步166
- ✅ History Sync Wifi166
- ✅ 履歴WiFi同期166
- ✅ 기록 WiFi 동기화166

### v166.11 播放记住画质 | Playback Remember Quality | 再生画質記憶 | 재생 화질 기억
- ✅ 播放记住画质
- ✅ Playback Remember Quality
- ✅ 再生画質記憶
- ✅ 재생 화질 기억

### v166.12 截图前缀自定义 | Screenshot Prefix Custom | スクリーンショットプレフィックスカスタム | 스크린샷 접두사 사용자 정의
- ✅ 截图前缀自定义
- ✅ Screenshot Prefix Custom
- ✅ スクリーンショットプレフィックスカスタム
- ✅ 스크린샷 접두사 사용자 정의

### v166.13 视频锐化强度166 | Video Sharpen Strength166 | ビデオシャープン強度166 | 비디오 선명화 강도166
- ✅ 视频锐化强度166
- ✅ Video Sharpen Strength166
- ✅ ビデオシャープン強度166
- ✅ 비디오 선명화 강도166

### v166.14 弹幕渲染批量大小166 | Danmaku Render Batch Size166 | コメントレンダリングバッチサイズ166 | 댓글 렌더링 배치 크기166
- ✅ 弹幕渲染批量大小166
- ✅ Danmaku Render Batch Size166
- ✅ コメントレンダリングバッチサイズ166
- ✅ 댓글 렌더링 배치 크기166

### v166.15 字幕卡拉OK模式 | Subtitle Karaoke Mode | 字幕カラオケモード | 자막 가라오케 모드
- ✅ 字幕卡拉OK模式
- ✅ Subtitle Karaoke Mode
- ✅ 字幕カラオケモード
- ✅ 자막 가라오케 모드

### v167.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v167.1-v167.15 功能列表
- ✅ Audio Gate Ratio, Danmaku Render Batch Size167, Subtitle Karaoke Mode167, Gesture Swipe Up Action, Cast Video PIP Adaptive Bitrate, Playlist Repeat Mode, Cache Preload Priority167, Progress Bar Loaded Color, Volume Fade Curve, History Sync Bluetooth, Playback Remember Quality167, Screenshot Prefix Custom167, Video Sharpen Radius, Danmaku Render Batch Timeout, Subtitle Karaoke Font Size

### v167.1 音频门限比率 | Audio Gate Ratio | オーディオゲートレシオ | 오디오 게이트 비율
- ✅ 音频门限比率
- ✅ Audio Gate Ratio
- ✅ オーディオゲートレシオ
- ✅ 오디오 게이트 비율

### v167.2 弹幕渲染批量大小167 | Danmaku Render Batch Size167 | コメントレンダリングバッチサイズ167 | 댓글 렌더링 배치 크기167
- ✅ 弹幕渲染批量大小167
- ✅ Danmaku Render Batch Size167
- ✅ コメントレンダリングバッチサイズ167
- ✅ 댓글 렌더링 배치 크기167

### v167.3 字幕卡拉OK模式167 | Subtitle Karaoke Mode167 | 字幕カラオケモード167 | 자막 가라오케 모드167
- ✅ 字幕卡拉OK模式167
- ✅ Subtitle Karaoke Mode167
- ✅ 字幕カラオケモード167
- ✅ 자막 가라오케 모드167

### v167.4 手势上滑操作 | Gesture Swipe Up Action | ジェスチャースワイプ上アクション | 제스처 위쪽 스와이프 동작
- ✅ 手势上滑操作
- ✅ Gesture Swipe Up Action
- ✅ ジェスチャースワイプ上アクション
- ✅ 제스처 위쪽 스와이프 동작

### v167.5 投射视频画中画自适应比特率 | Cast Video PIP Adaptive Bitrate | キャストビデオPIPアダプティブビットレート | 캐스트 비디오 PIP 적응형 비트레이트
- ✅ 投射视频画中画自适应比特率
- ✅ Cast Video PIP Adaptive Bitrate
- ✅ キャストビデオPIPアダプティブビットレート
- ✅ 캐스트 비디오 PIP 적응형 비트레이트

### v167.6 播放列表循环模式 | Playlist Repeat Mode | プレイリストリピートモード | 재생 목록 반복 모드
- ✅ 播放列表循环模式
- ✅ Playlist Repeat Mode
- ✅ プレイリストリピートモード
- ✅ 재생 목록 반복 모드

### v167.7 缓存预加载优先级167 | Cache Preload Priority167 | キャッシュプリロード優先度167 | 캐시 프리로드 우선순위167
- ✅ 缓存预加载优先级167
- ✅ Cache Preload Priority167
- ✅ キャッシュプリロード優先度167
- ✅ 캐시 프리로드 우선순위167

### v167.8 进度条已加载颜色 | Progress Bar Loaded Color | プログレスバー読み込み済み色 | 진행 바 로드 완료 색상
- ✅ 进度条已加载颜色
- ✅ Progress Bar Loaded Color
- ✅ プログレスバー読み込み済み色
- ✅ 진행 바 로드 완료 색상

### v167.9 音量淡入淡出曲线 | Volume Fade Curve | ボリュームフェードカーブ | 볼륨 페이드 커브
- ✅ 音量淡入淡出曲线
- ✅ Volume Fade Curve
- ✅ ボリュームフェードカーブ
- ✅ 볼륨 페이드 커브

### v167.10 历史记录蓝牙同步 | History Sync Bluetooth | 履歴Bluetooth同期 | 기록 블루투스 동기화
- ✅ 历史记录蓝牙同步
- ✅ History Sync Bluetooth
- ✅ 履歴Bluetooth同期
- ✅ 기록 블루투스 동기화

### v167.11 播放记住画质167 | Playback Remember Quality167 | 再生画質記憶167 | 재생 화질 기억167
- ✅ 播放记住画质167
- ✅ Playback Remember Quality167
- ✅ 再生画質記憶167
- ✅ 재생 화질 기억167

### v167.12 截图前缀自定义167 | Screenshot Prefix Custom167 | スクリーンショットプレフィックスカスタム167 | 스크린샷 접두사 사용자 정의167
- ✅ 截图前缀自定义167
- ✅ Screenshot Prefix Custom167
- ✅ スクリーンショットプレフィックスカスタム167
- ✅ 스크린샷 접두사 사용자 정의167

### v167.13 视频锐化半径 | Video Sharpen Radius | ビデオシャープン半径 | 비디오 선명화 반경
- ✅ 视频锐化半径
- ✅ Video Sharpen Radius
- ✅ ビデオシャープン半径
- ✅ 비디오 선명화 반경

### v167.14 弹幕渲染批量超时 | Danmaku Render Batch Timeout | コメントレンダリングバッチタイムアウト | 댓글 렌더링 배치 타임아웃
- ✅ 弹幕渲染批量超时
- ✅ Danmaku Render Batch Timeout
- ✅ コメントレンダリングバッチタイムアウト
- ✅ 댓글 렌더링 배치 타임아웃

### v167.15 字幕卡拉OK字号 | Subtitle Karaoke Font Size | 字幕カラオケフォントサイズ | 자막 가라오케 글꼴 크기
- ✅ 字幕卡拉OK字号
- ✅ Subtitle Karaoke Font Size
- ✅ 字幕カラオケフォントサイズ
- ✅ 자막 가라오케 글꼴 크기

### v168.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v168.1-v168.15 功能列表
- ✅ Audio Gate Range168, Danmaku Render Batch Timeout168, Subtitle Karaoke Font Size168, Gesture Swipe Down Action, Cast Video PIP Adaptive Bitrate168, Playlist Repeat Mode168, Cache Cleanup On Low Storage, Progress Bar Loaded Color168, Volume Fade Curve168, History Sync Bluetooth168, Playback Auto Next, screenshotTimestampToggle, Video Sharpen Radius168, Danmaku Render Flush Policy, Subtitle Karaoke Align

### v168.1 音频门限范围168 | Audio Gate Range168 | オーディオゲートレンジ168 | 오디오 게이트 범위168
- ✅ 音频门限范围168
- ✅ Audio Gate Range168
- ✅ オーディオゲートレンジ168
- ✅ 오디오 게이트 범위168

### v168.2 弹幕渲染批量超时168 | Danmaku Render Batch Timeout168 | コメントレンダリングバッチタイムアウト168 | 댓글 렌더링 배치 타임아웃168
- ✅ 弹幕渲染批量超时168
- ✅ Danmaku Render Batch Timeout168
- ✅ コメントレンダリングバッチタイムアウト168
- ✅ 댓글 렌더링 배치 타임아웃168

### v168.3 字幕卡拉OK字号168 | Subtitle Karaoke Font Size168 | 字幕カラオケフォントサイズ168 | 자막 가라오케 글꼴 크기168
- ✅ 字幕卡拉OK字号168
- ✅ Subtitle Karaoke Font Size168
- ✅ 字幕カラオケフォントサイズ168
- ✅ 자막 가라오케 글꼴 크기168

### v168.4 手势下滑操作 | Gesture Swipe Down Action | ジェスチャースワイプ下アクション | 제스처 아래쪽 스와이프 동작
- ✅ 手势下滑操作
- ✅ Gesture Swipe Down Action
- ✅ ジェスチャースワイプ下アクション
- ✅ 제스처 아래쪽 스와이프 동작

### v168.5 投射视频画中画自适应比特率168 | Cast Video PIP Adaptive Bitrate168 | キャストビデオPIPアダプティブビットレート168 | 캐스트 비디오 PIP 적응형 비트레이트168
- ✅ 投射视频画中画自适应比特率168
- ✅ Cast Video PIP Adaptive Bitrate168
- ✅ キャストビデオPIPアダプティブビットレート168
- ✅ 캐스트 비디오 PIP 적응형 비트레이트168

### v168.6 播放列表循环模式168 | Playlist Repeat Mode168 | プレイリストリピートモード168 | 재생 목록 반복 모드168
- ✅ 播放列表循环模式168
- ✅ Playlist Repeat Mode168
- ✅ プレイリストリピートモード168
- ✅ 재생 목록 반복 모드168

### v168.7 存储不足时清理缓存 | Cache Cleanup On Low Storage | 低ストレージ時キャッシュクリーンアップ | 저장 공간 부족 시 캐시 정리
- ✅ 存储不足时清理缓存
- ✅ Cache Cleanup On Low Storage
- ✅ 低ストレージ時キャッシュクリーンアップ
- ✅ 저장 공간 부족 시 캐시 정리

### v168.8 进度条已加载颜色168 | Progress Bar Loaded Color168 | プログレスバー読み込み済み色168 | 진행 바 로드 완료 색상168
- ✅ 进度条已加载颜色168
- ✅ Progress Bar Loaded Color168
- ✅ プログレスバー読み込み済み色168
- ✅ 진행 바 로드 완료 색상168

### v168.9 音量淡入淡出曲线168 | Volume Fade Curve168 | ボリュームフェードカーブ168 | 볼륨 페이드 커브168
- ✅ 音量淡入淡出曲线168
- ✅ Volume Fade Curve168
- ✅ ボリュームフェードカーブ168
- ✅ 볼륨 페이드 커브168

### v168.10 历史记录蓝牙同步168 | History Sync Bluetooth168 | 履歴Bluetooth同期168 | 기록 블루투스 동기화168
- ✅ 历史记录蓝牙同步168
- ✅ History Sync Bluetooth168
- ✅ 履歴Bluetooth同期168
- ✅ 기록 블루투스 동기화168

### v168.11 播放自动下一曲 | Playback Auto Next | 再生時自動次曲 | 재생 시 자동 다음곡
- ✅ 播放自动下一曲
- ✅ Playback Auto Next
- ✅ 再生時自動次曲
- ✅ 재생 시 자동 다음곡

### v168.12 截图时间戳开关 | screenshotTimestampToggle | スクリーンショットタイムスタンプ切替 | 스크린샷 타임스탬프 전환
- ✅ 截图时间戳开关
- ✅ screenshotTimestampToggle
- ✅ スクリーンショットタイムスタンプ切替
- ✅ 스크린샷 타임스탬프 전환

### v168.13 视频锐化半径168 | Video Sharpen Radius168 | ビデオシャープン半径168 | 비디오 선명화 반경168
- ✅ 视频锐化半径168
- ✅ Video Sharpen Radius168
- ✅ ビデオシャープン半径168
- ✅ 비디오 선명화 반경168

### v168.14 弹幕渲染刷新策略 | Danmaku Render Flush Policy | コメントレンダリングフラッシュポリシー | 댓글 렌더링 플러시 정책
- ✅ 弹幕渲染刷新策略
- ✅ Danmaku Render Flush Policy
- ✅ コメントレンダリングフラッシュポリシー
- ✅ 댓글 렌더링 플러시 정책

### v168.15 字幕卡拉OK对齐 | Subtitle Karaoke Align | 字幕カラオケアライン | 자막 가라오케 정렬
- ✅ 字幕卡拉OK对齐
- ✅ Subtitle Karaoke Align
- ✅ 字幕カラオケアライン
- ✅ 자막 가라오케 정렬

### v169.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v169.1-v169.15 功能列表
- ✅ Audio Gate Knee, Danmaku Render Flush Policy169, Subtitle Karaoke Align169, Gesture Pinch In Action, Cast Video PIP Resolution Scale, Playlist Auto Play Related, Cache Cleanup On Low Storage169, Progress Bar Loaded Opacity, Volume Spatial Toggle169, History Search Full Text, Playback Auto Next169, Screenshot Timestamp Toggle169, Video Sharpen Threshold, Danmaku Render Flush Interval, Subtitle Karaoke Shadow

### v169.1 音频门限拐点 | Audio Gate Knee | オーディオゲートニー | 오디오 게이트 니
- ✅ 音频门限拐点
- ✅ Audio Gate Knee
- ✅ オーディオゲートニー
- ✅ 오디오 게이트 니

### v169.2 弹幕渲染刷新策略169 | Danmaku Render Flush Policy169 | コメントレンダリングフラッシュポリシー169 | 댓글 렌더링 플러시 정책169
- ✅ 弹幕渲染刷新策略169
- ✅ Danmaku Render Flush Policy169
- ✅ コメントレンダリングフラッシュポリシー169
- ✅ 댓글 렌더링 플러시 정책169

### v169.3 字幕卡拉OK对齐169 | Subtitle Karaoke Align169 | 字幕カラオケアライン169 | 자막 가라오케 정렬169
- ✅ 字幕卡拉OK对齐169
- ✅ Subtitle Karaoke Align169
- ✅ 字幕カラオケアライン169
- ✅ 자막 가라오케 정렬169

### v169.4 手势捏合操作 | Gesture Pinch In Action | ジェスチャーピンチインアクション | 제스처 핀치인 동작
- ✅ 手势捏合操作
- ✅ Gesture Pinch In Action
- ✅ ジェスチャーピンチインアクション
- ✅ 제스처 핀치인 동작

### v169.5 投射视频画中画分辨率缩放 | Cast Video PIP Resolution Scale | キャストビデオPIP解像度スケール | 캐스트 비디오 PIP 해상도 스케일
- ✅ 投射视频画中画分辨率缩放
- ✅ Cast Video PIP Resolution Scale
- ✅ キャストビデオPIP解像度スケール
- ✅ 캐스트 비디오 PIP 해상도 스케일

### v169.6 播放列表自动播放相关 | Playlist Auto Play Related | プレイリスト関連曲自動再生 | 재생 목록 관련곡 자동 재생
- ✅ 播放列表自动播放相关
- ✅ Playlist Auto Play Related
- ✅ プレイリスト関連曲自動再生
- ✅ 재생 목록 관련곡 자동 재생

### v169.7 存储不足时清理缓存169 | Cache Cleanup On Low Storage169 | 低ストレージ時キャッシュクリーンアップ169 | 저장 공간 부족 시 캐시 정리169
- ✅ 存储不足时清理缓存169
- ✅ Cache Cleanup On Low Storage169
- ✅ 低ストレージ時キャッシュクリーンアップ169
- ✅ 저장 공간 부족 시 캐시 정리169

### v169.8 进度条已加载透明度 | Progress Bar Loaded Opacity | プログレスバー読み込み済み透明度 | 진행 바 로드 완료 불투명도
- ✅ 进度条已加载透明度
- ✅ Progress Bar Loaded Opacity
- ✅ プログレスバー読み込み済み透明度
- ✅ 진행 바 로드 완료 불투명도

### v169.9 音量空间音频开关169 | Volume Spatial Toggle169 | ボリューム空間オーディオ切替169 | 볼륨 공간 오디오 전환169
- ✅ 音量空间音频开关169
- ✅ Volume Spatial Toggle169
- ✅ ボリューム空間オーディオ切替169
- ✅ 볼륨 공간 오디오 전환169

### v169.10 历史记录全文搜索 | History Search Full Text | 履歴全文検索 | 기록 전문 검색
- ✅ 历史记录全文搜索
- ✅ History Search Full Text
- ✅ 履歴全文検索
- ✅ 기록 전문 검색

### v169.11 播放自动下一曲169 | Playback Auto Next169 | 再生時自動次曲169 | 재생 시 자동 다음곡169
- ✅ 播放自动下一曲169
- ✅ Playback Auto Next169
- ✅ 再生時自動次曲169
- ✅ 재생 시 자동 다음곡169

### v169.12 截图时间戳开关169 | Screenshot Timestamp Toggle169 | スクリーンショットタイムスタンプ切替169 | 스크린샷 타임스탬프 전환169
- ✅ 截图时间戳开关169
- ✅ Screenshot Timestamp Toggle169
- ✅ スクリーンショットタイムスタンプ切替169
- ✅ 스크린샷 타임스탬프 전환169

### v169.13 视频锐化阈值 | Video Sharpen Threshold | ビデオシャープンしきい値 | 비디오 선명화 임계값
- ✅ 视频锐化阈值
- ✅ Video Sharpen Threshold
- ✅ ビデオシャープンしきい値
- ✅ 비디오 선명화 임계값

### v169.14 弹幕渲染刷新间隔 | Danmaku Render Flush Interval | コメントレンダリングフラッシュ間隔 | 댓글 렌더링 플러시 간격
- ✅ 弹幕渲染刷新间隔
- ✅ Danmaku Render Flush Interval
- ✅ コメントレンダリングフラッシュ間隔
- ✅ 댓글 렌더링 플러시 간격

### v169.15 字幕卡拉OK阴影 | Subtitle Karaoke Shadow | 字幕カラオケシャドウ | 자막 가라오케 그림자
- ✅ 字幕卡拉OK阴影
- ✅ Subtitle Karaoke Shadow
- ✅ 字幕カラオケシャドウ
- ✅ 자막 가라오케 그림자

### v170.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v170.1-v170.15 功能列表
- ✅ Audio Gate Mix, Danmaku Render Flush Interval170, Subtitle Karaoke Shadow170, Gesture Pinch Out Action, Cast Video PIP Resolution Scale170, Playlist Auto Play Related170, Cache Cleanup Max Age, Progress Bar Loaded Opacity170, Volume Spatial Mode, History Search Full Text170, Playback Loop AB Toggle170, Screenshot Watermark Toggle170, Video Sharpen Threshold170, Danmaku Render Flush All, Subtitle Karaoke Border

### v170.1 音频门限混合比 | Audio Gate Mix | オーディオゲートミックス | 오디오 게이트 믹스
- ✅ 音频门限混合比
- ✅ Audio Gate Mix
- ✅ オーディオゲートミックス
- ✅ 오디오 게이트 믹스

### v170.2 弹幕渲染刷新间隔170 | Danmaku Render Flush Interval170 | コメントレンダリングフラッシュ間隔170 | 댓글 렌더링 플러시 간격170
- ✅ 弹幕渲染刷新间隔170
- ✅ Danmaku Render Flush Interval170
- ✅ コメントレンダリングフラッシュ間隔170
- ✅ 댓글 렌더링 플러시 간격170

### v170.3 字幕卡拉OK阴影170 | Subtitle Karaoke Shadow170 | 字幕カラオケシャドウ170 | 자막 가라오케 그림자170
- ✅ 字幕卡拉OK阴影170
- ✅ Subtitle Karaoke Shadow170
- ✅ 字幕カラオケシャドウ170
- ✅ 자막 가라오케 그림자170

### v170.4 手势张开操作 | Gesture Pinch Out Action | ジェスチャーピンチアウトアクション | 제스처 핀치아웃 동작
- ✅ 手势张开操作
- ✅ Gesture Pinch Out Action
- ✅ ジェスチャーピンチアウトアクション
- ✅ 제스처 핀치아웃 동작

### v170.5 投射视频画中画分辨率缩放170 | Cast Video PIP Resolution Scale170 | キャストビデオPIP解像度スケール170 | 캐스트 비디오 PIP 해상도 스케일170
- ✅ 投射视频画中画分辨率缩放170
- ✅ Cast Video PIP Resolution Scale170
- ✅ キャストビデオPIP解像度スケール170
- ✅ 캐스트 비디오 PIP 해상도 스케일170

### v170.6 播放列表自动播放相关170 | Playlist Auto Play Related170 | プレイリスト関連曲自動再生170 | 재생 목록 관련곡 자동 재생170
- ✅ 播放列表自动播放相关170
- ✅ Playlist Auto Play Related170
- ✅ プレイリスト関連曲自動再生170
- ✅ 재생 목록 관련곡 자동 재생170

### v170.7 缓存清理最大保存时间 | Cache Cleanup Max Age | キャッシュクリーンアップ最大経過時間 | 캐시 정리 최대 보존 기간
- ✅ 缓存清理最大保存时间
- ✅ Cache Cleanup Max Age
- ✅ キャッシュクリーンアップ最大経過時間
- ✅ 캐시 정리 최대 보존 기간

### v170.8 进度条已加载透明度170 | Progress Bar Loaded Opacity170 | プログレスバー読み込み済み透明度170 | 진행 바 로드 완료 불투명도170
- ✅ 进度条已加载透明度170
- ✅ Progress Bar Loaded Opacity170
- ✅ プログレスバー読み込み済み透明度170
- ✅ 진행 바 로드 완료 불투명도170

### v170.9 音量空间音频模式 | Volume Spatial Mode | ボリューム空間オーディオモード | 볼륨 공간 오디오 모드
- ✅ 音量空间音频模式
- ✅ Volume Spatial Mode
- ✅ ボリューム空間オーディオモード
- ✅ 볼륨 공간 오디오 모드

### v170.10 历史记录全文搜索170 | History Search Full Text170 | 履歴全文検索170 | 기록 전문 검색170
- ✅ 历史记录全文搜索170
- ✅ History Search Full Text170
- ✅ 履歴全文検索170
- ✅ 기록 전문 검색170

### v170.11 播放AB循环开关170 | Playback Loop AB Toggle170 | 再生ABループ切替170 | 재생 AB 루프 전환170
- ✅ 播放AB循环开关170
- ✅ Playback Loop AB Toggle170
- ✅ 再生ABループ切替170
- ✅ 재생 AB 루프 전환170

### v170.12 截图水印开关170 | Screenshot Watermark Toggle170 | スクリーンショット透かし切替170 | 스크린샷 워터마크 전환170
- ✅ 截图水印开关170
- ✅ Screenshot Watermark Toggle170
- ✅ スクリーンショット透かし切替170
- ✅ 스크린샷 워터마크 전환170

### v170.13 视频锐化阈值170 | Video Sharpen Threshold170 | ビデオシャープンしきい値170 | 비디오 선명화 임계값170
- ✅ 视频锐化阈值170
- ✅ Video Sharpen Threshold170
- ✅ ビデオシャープンしきい値170
- ✅ 비디오 선명화 임계값170

### v170.14 弹幕渲染全部刷新 | Danmaku Render Flush All | コメントレンダリングフラッシュオール | 댓글 렌더링 전체 플러시
- ✅ 弹幕渲染全部刷新
- ✅ Danmaku Render Flush All
- ✅ コメントレンダリングフラッシュオール
- ✅ 댓글 렌더링 전체 플러시

### v170.15 字幕卡拉OK边框 | Subtitle Karaoke Border | 字幕カラオケボーダー | 자막 가라오케 테두리
- ✅ 字幕卡拉OK边框
- ✅ Subtitle Karaoke Border
- ✅ 字幕カラオケボーダー
- ✅ 자막 가라오케 테두리


### v171.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v171.1-v171.15 功能列表
- ✅ Audio Normalizer Toggle171, Danmaku Scroll Direction, Subtitle Font Spacing, Gesture Tap Double Action, Cast Video PIP FPS Limit, Playlist Auto Add Related, Cache Disk Quota MB, Progress Bar Scrub Preview, Volume Balance LR, History Group By Date, Playback Audio Offset, Screenshot Overlay Info, Video Contrast Toggle171, Danmaku Scroll Speed, Subtitle Line Spacing

### v171.1 音频标准化开关171 | Audio Normalizer Toggle171 | オーディオノーマライザー切替171 | 오디오 노멀라이저 전환171
- ✅ 音频标准化开关171
- ✅ Audio Normalizer Toggle171
- ✅ オーディオノーマライザー切替171
- ✅ 오디오 노멀라이저 전환171

### v171.2 弹幕滚动方向 | Danmaku Scroll Direction | コメントスクロール方向 | 댓글 스크롤 방향
- ✅ 弹幕滚动方向
- ✅ Danmaku Scroll Direction
- ✅ コメントスクロール方向
- ✅ 댓글 스크롤 방향

### v171.3 字幕字体间距 | Subtitle Font Spacing | 字幕フォント間隔 | 자막 글꼴 간격
- ✅ 字幕字体间距
- ✅ Subtitle Font Spacing
- ✅ 字幕フォント間隔
- ✅ 자막 글꼴 간격

### v171.4 手势双击操作 | Gesture Tap Double Action | ジェスチャーダブルタップアクション | 제스처 더블탭 동작
- ✅ 手势双击操作
- ✅ Gesture Tap Double Action
- ✅ ジェスチャーダブルタップアクション
- ✅ 제스처 더블탭 동작

### v171.5 投射视频画中画帧率限制 | Cast Video PIP FPS Limit | キャストビデオPIP FPS制限 | 캐스트 비디오 PIP FPS 제한
- ✅ 投射视频画中画帧率限制
- ✅ Cast Video PIP FPS Limit
- ✅ キャストビデオPIP FPS制限
- ✅ 캐스트 비디오 PIP FPS 제한

### v171.6 播放列表自动添加相关 | Playlist Auto Add Related | プレイリスト関連曲自動追加 | 재생 목록 관련곡 자동 추가
- ✅ 播放列表自动添加相关
- ✅ Playlist Auto Add Related
- ✅ プレイリスト関連曲自動追加
- ✅ 재생 목록 관련곡 자동 추가

### v171.7 缓存磁盘配额MB | Cache Disk Quota MB | キャッシュディスククォータMB | 캐시 디스크 할당량 MB
- ✅ 缓存磁盘配额MB
- ✅ Cache Disk Quota MB
- ✅ キャッシュディスククォータMB
- ✅ 캐시 디스크 할당량 MB

### v171.8 进度条拖动预览 | Progress Bar Scrub Preview | プログレスバースクラブプレビュー | 진행 바 스크럽 미리보기
- ✅ 进度条拖动预览
- ✅ Progress Bar Scrub Preview
- ✅ プログレスバースクラブプレビュー
- ✅ 진행 바 스크럽 미리보기

### v171.9 音量左右平衡 | Volume Balance LR | ボリュームバランスLR | 볼륨 좌우 밸런스
- ✅ 音量左右平衡
- ✅ Volume Balance LR
- ✅ ボリュームバランスLR
- ✅ 볼륨 좌우 밸런스

### v171.10 历史记录按日期分组 | History Group By Date | 履歴日付別グループ化 | 기록 날짜별 그룹화
- ✅ 历史记录按日期分组
- ✅ History Group By Date
- ✅ 履歴日付別グループ化
- ✅ 기록 날짜별 그룹화

### v171.11 播放音频偏移 | Playback Audio Offset | 再生オーディオオフセット | 재생 오디오 오프셋
- ✅ 播放音频偏移
- ✅ Playback Audio Offset
- ✅ 再生オーディオオフセット
- ✅ 재생 오디오 오프셋

### v171.12 截图叠加信息 | Screenshot Overlay Info | スクリーンショットオーバーレイ情報 | 스크린샷 오버레이 정보
- ✅ 截图叠加信息
- ✅ Screenshot Overlay Info
- ✅ スクリーンショットオーバーレイ情報
- ✅ 스크린샷 오버레이 정보

### v171.13 视频对比度开关171 | Video Contrast Toggle171 | ビデオコントラスト切替171 | 비디오 대비 전환171
- ✅ 视频对比度开关171
- ✅ Video Contrast Toggle171
- ✅ ビデオコントラスト切替171
- ✅ 비디오 대비 전환171

### v171.14 弹幕滚动速度 | Danmaku Scroll Speed | コメントスクロール速度 | 댓글 스크롤 속도
- ✅ 弹幕滚动速度
- ✅ Danmaku Scroll Speed
- ✅ コメントスクロール速度
- ✅ 댓글 스크롤 속도

### v171.15 字幕行间距 | Subtitle Line Spacing | 字幕行間隔 | 자막 줄 간격
- ✅ 字幕行间距
- ✅ Subtitle Line Spacing
- ✅ 字幕行間隔
- ✅ 자막 줄 간격

### v172.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v172.1-v172.15 功能列表
- ✅ Audio Normalizer Target172, Danmaku Scroll Speed172, Subtitle Line Spacing172, Gesture Tap Double Action172, Cast Video PIP FPS Limit172, Playlist Auto Add Related172, Cache Disk Quota MB172, Progress Bar Scrub Preview172, Volume Balance LR172, History Group By Date172, Playback Audio Offset172, Screenshot Overlay Info172, Video Contrast Level172, Danmaku Scroll Overlap, Subtitle Background Padding

### v172.1 音频标准化目标172 | Audio Normalizer Target172 | オーディオノーマライザーターゲット172 | 오디오 노멀라이저 대상172
- ✅ 音频标准化目标172
- ✅ Audio Normalizer Target172
- ✅ オーディオノーマライザーターゲット172
- ✅ 오디오 노멀라이저 대상172

### v172.2 弹幕滚动速度172 | Danmaku Scroll Speed172 | コメントスクロール速度172 | 댓글 스크롤 속도172
- ✅ 弹幕滚动速度172
- ✅ Danmaku Scroll Speed172
- ✅ コメントスクロール速度172
- ✅ 댓글 스크롤 속도172

### v172.3 字幕行间距172 | Subtitle Line Spacing172 | 字幕行間隔172 | 자막 줄 간격172
- ✅ 字幕行间距172
- ✅ Subtitle Line Spacing172
- ✅ 字幕行間隔172
- ✅ 자막 줄 간격172

### v172.4 手势双击操作172 | Gesture Tap Double Action172 | ジェスチャーダブルタップアクション172 | 제스처 더블탭 동작172
- ✅ 手势双击操作172
- ✅ Gesture Tap Double Action172
- ✅ ジェスチャーダブルタップアクション172
- ✅ 제스처 더블탭 동작172

### v172.5 投射视频画中画帧率限制172 | Cast Video PIP FPS Limit172 | キャストビデオPIP FPS制限172 | 캐스트 비디오 PIP FPS 제한172
- ✅ 投射视频画中画帧率限制172
- ✅ Cast Video PIP FPS Limit172
- ✅ キャストビデオPIP FPS制限172
- ✅ 캐스트 비디오 PIP FPS 제한172

### v172.6 播放列表自动添加相关172 | Playlist Auto Add Related172 | プレイリスト関連曲自動追加172 | 재생 목록 관련곡 자동 추가172
- ✅ 播放列表自动添加相关172
- ✅ Playlist Auto Add Related172
- ✅ プレイリスト関連曲自動追加172
- ✅ 재생 목록 관련곡 자동 추가172

### v172.7 缓存磁盘配额MB172 | Cache Disk Quota MB172 | キャッシュディスククォータMB172 | 캐시 디스크 할당량 MB172
- ✅ 缓存磁盘配额MB172
- ✅ Cache Disk Quota MB172
- ✅ キャッシュディスククォータMB172
- ✅ 캐시 디스크 할당량 MB172

### v172.8 进度条拖动预览172 | Progress Bar Scrub Preview172 | プログレスバースクラブプレビュー172 | 진행 바 스크럽 미리보기172
- ✅ 进度条拖动预览172
- ✅ Progress Bar Scrub Preview172
- ✅ プログレスバースクラブプレビュー172
- ✅ 진행 바 스크럽 미리보기172

### v172.9 音量左右平衡172 | Volume Balance LR172 | ボリュームバランスLR172 | 볼륨 좌우 밸런스172
- ✅ 音量左右平衡172
- ✅ Volume Balance LR172
- ✅ ボリュームバランスLR172
- ✅ 볼륨 좌우 밸런스172

### v172.10 历史记录按日期分组172 | History Group By Date172 | 履歴日付別グループ化172 | 기록 날짜별 그룹화172
- ✅ 历史记录按日期分组172
- ✅ History Group By Date172
- ✅ 履歴日付別グループ化172
- ✅ 기록 날짜별 그룹화172

### v172.11 播放音频偏移172 | Playback Audio Offset172 | 再生オーディオオフセット172 | 재생 오디오 오프셋172
- ✅ 播放音频偏移172
- ✅ Playback Audio Offset172
- ✅ 再生オーディオオフセット172
- ✅ 재생 오디오 오프셋172

### v172.12 截图叠加信息172 | Screenshot Overlay Info172 | スクリーンショットオーバーレイ情報172 | 스크린샷 오버레이 정보172
- ✅ 截图叠加信息172
- ✅ Screenshot Overlay Info172
- ✅ スクリーンショットオーバーレイ情報172
- ✅ 스크린샷 오버레이 정보172

### v172.13 视频对比度级别172 | Video Contrast Level172 | ビデオコントラストレベル172 | 비디오 대비 수준172
- ✅ 视频对比度级别172
- ✅ Video Contrast Level172
- ✅ ビデオコントラストレベル172
- ✅ 비디오 대비 수준172

### v172.14 弹幕滚动重叠 | Danmaku Scroll Overlap | コメントスクロールオーバーラップ | 댓글 스크롤 겹침
- ✅ 弹幕滚动重叠
- ✅ Danmaku Scroll Overlap
- ✅ コメントスクロールオーバーラップ
- ✅ 댓글 스크롤 겹침

### v172.15 字幕背景内边距 | Subtitle Background Padding | 字幕背景パディング | 자막 배경 패딩
- ✅ 字幕背景内边距
- ✅ Subtitle Background Padding
- ✅ 字幕背景パディング
- ✅ 자막 배경 패딩

### v173.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v173.1-v173.15 功能列表
- ✅ Audio Normalizer Strength173, Danmaku Scroll Overlap173, Subtitle Background Padding173, Gesture Tap Triple Action, Cast Video PIP Connect Auto, Playlist Auto Next On End, Cache Compress Toggle173, Progress Bar Scrub Preview Size, Volume Normalize Track, History Group By Uploader, Playback Subtitle Offset, Screenshot Overlay Date, Video Contrast Level173, Danmaku Scroll Max Lines, Subtitle Background Round

### v173.1 音频标准化强度173 | Audio Normalizer Strength173 | オーディオノーマライザー強度173 | 오디오 노멀라이저 강도173
- ✅ 音频标准化强度173
- ✅ Audio Normalizer Strength173
- ✅ オーディオノーマライザー強度173
- ✅ 오디오 노멀라이저 강도173

### v173.2 弹幕滚动重叠173 | Danmaku Scroll Overlap173 | コメントスクロールオーバーラップ173 | 댓글 스크롤 겹침173
- ✅ 弹幕滚动重叠173
- ✅ Danmaku Scroll Overlap173
- ✅ コメントスクロールオーバーラップ173
- ✅ 댓글 스크롤 겹침173

### v173.3 字幕背景内边距173 | Subtitle Background Padding173 | 字幕背景パディング173 | 자막 배경 패딩173
- ✅ 字幕背景内边距173
- ✅ Subtitle Background Padding173
- ✅ 字幕背景パディング173
- ✅ 자막 배경 패딩173

### v173.4 手势三击操作 | Gesture Tap Triple Action | ジェスチャートリプルタップアクション | 제스처 트리플탭 동작
- ✅ 手势三击操作
- ✅ Gesture Tap Triple Action
- ✅ ジェスチャートリプルタップアクション
- ✅ 제스처 트리플탭 동작

### v173.5 投射视频画中画自动连接 | Cast Video PIP Connect Auto | キャストビデオPIP自動接続 | 캐스트 비디오 PIP 자동 연결
- ✅ 投射视频画中画自动连接
- ✅ Cast Video PIP Connect Auto
- ✅ キャストビデオPIP自動接続
- ✅ 캐스트 비디오 PIP 자동 연결

### v173.6 播放列表结束自动下一曲 | Playlist Auto Next On End | プレイリスト終了時自動次曲 | 재생 목록 종료 시 자동 다음곡
- ✅ 播放列表结束自动下一曲
- ✅ Playlist Auto Next On End
- ✅ プレイリスト終了時自動次曲
- ✅ 재생 목록 종료 시 자동 다음곡

### v173.7 缓存压缩开关173 | Cache Compress Toggle173 | キャッシュ圧縮切替173 | 캐시 압축 전환173
- ✅ 缓存压缩开关173
- ✅ Cache Compress Toggle173
- ✅ キャッシュ圧縮切替173
- ✅ 캐시 압축 전환173

### v173.8 进度条拖动预览大小 | Progress Bar Scrub Preview Size | プログレスバースクラブプレビューサイズ | 진행 바 스크럽 미리보기 크기
- ✅ 进度条拖动预览大小
- ✅ Progress Bar Scrub Preview Size
- ✅ プログレスバースクラブプレビューサイズ
- ✅ 진행 바 스크럽 미리보기 크기

### v173.9 音量标准化音轨 | Volume Normalize Track | ボリュームノーマライズトラック | 볼륨 노멀라이즈 트랙
- ✅ 音量标准化音轨
- ✅ Volume Normalize Track
- ✅ ボリュームノーマライズトラック
- ✅ 볼륨 노멀라이즈 트랙

### v173.10 历史记录按上传者分组 | History Group By Uploader | 履歴投稿者別グループ化 | 기록 업로더별 그룹화
- ✅ 历史记录按上传者分组
- ✅ History Group By Uploader
- ✅ 履歴投稿者別グループ化
- ✅ 기록 업로더별 그룹화

### v173.11 播放字幕偏移 | Playback Subtitle Offset | 再生字幕オフセット | 재생 자막 오프셋
- ✅ 播放字幕偏移
- ✅ Playback Subtitle Offset
- ✅ 再生字幕オフセット
- ✅ 재생 자막 오프셋

### v173.12 截图叠加日期 | Screenshot Overlay Date | スクリーンショットオーバーレイ日付 | 스크린샷 오버레이 날짜
- ✅ 截图叠加日期
- ✅ Screenshot Overlay Date
- ✅ スクリーンショットオーバーレイ日付
- ✅ 스크린샷 오버레이 날짜

### v173.13 视频对比度级别173 | Video Contrast Level173 | ビデオコントラストレベル173 | 비디오 대비 수준173
- ✅ 视频对比度级别173
- ✅ Video Contrast Level173
- ✅ ビデオコントラストレベル173
- ✅ 비디오 대비 수준173

### v173.14 弹幕滚动最大行数 | Danmaku Scroll Max Lines | コメントスクロール最大行数 | 댓글 스크롤 최대 줄 수
- ✅ 弹幕滚动最大行数
- ✅ Danmaku Scroll Max Lines
- ✅ コメントスクロール最大行数
- ✅ 댓글 스크롤 최대 줄 수

### v173.15 字幕背景圆角 | Subtitle Background Round | 字幕背景ラウンド | 자막 배경 라운드
- ✅ 字幕背景圆角
- ✅ Subtitle Background Round
- ✅ 字幕背景ラウンド
- ✅ 자막 배경 라운드

### v174.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v174.1-v174.15 功能列表
- ✅ Audio Normalizer Attack174, Danmaku Scroll Max Lines174, Subtitle Background Round174, Gesture Tap Triple Action174, Cast Video PIP Connect Auto174, Playlist Auto Next On End174, Cache Compress Level174, Progress Bar Scrub Preview Text, Volume Normalize Track174, History Group By Uploader174, Playback Subtitle Offset174, Screenshot Overlay Title, Video Saturation Toggle174, Danmaku Scroll Overlap Mode, Subtitle Shadow Toggle174

### v174.1 音频标准化启动174 | Audio Normalizer Attack174 | オーディオノーマライザーアタック174 | 오디오 노멀라이저 어택174
- ✅ 音频标准化启动174
- ✅ Audio Normalizer Attack174
- ✅ オーディオノーマライザーアタック174
- ✅ 오디오 노멀라이저 어택174

### v174.2 弹幕滚动最大行数174 | Danmaku Scroll Max Lines174 | コメントスクロール最大行数174 | 댓글 스크롤 최대 줄 수174
- ✅ 弹幕滚动最大行数174
- ✅ Danmaku Scroll Max Lines174
- ✅ コメントスクロール最大行数174
- ✅ 댓글 스크롤 최대 줄 수174

### v174.3 字幕背景圆角174 | Subtitle Background Round174 | 字幕背景ラウンド174 | 자막 배경 라운드174
- ✅ 字幕背景圆角174
- ✅ Subtitle Background Round174
- ✅ 字幕背景ラウンド174
- ✅ 자막 배경 라운드174

### v174.4 手势三击操作174 | Gesture Tap Triple Action174 | ジェスチャートリプルタップアクション174 | 제스처 트리플탭 동작174
- ✅ 手势三击操作174
- ✅ Gesture Tap Triple Action174
- ✅ ジェスチャートリプルタップアクション174
- ✅ 제스처 트리플탭 동작174

### v174.5 投射视频画中画自动连接174 | Cast Video PIP Connect Auto174 | キャストビデオPIP自動接続174 | 캐스트 비디오 PIP 자동 연결174
- ✅ 投射视频画中画自动连接174
- ✅ Cast Video PIP Connect Auto174
- ✅ キャストビデオPIP自動接続174
- ✅ 캐스트 비디오 PIP 자동 연결174

### v174.6 播放列表结束自动下一曲174 | Playlist Auto Next On End174 | プレイリスト終了時自動次曲174 | 재생 목록 종료 시 자동 다음곡174
- ✅ 播放列表结束自动下一曲174
- ✅ Playlist Auto Next On End174
- ✅ プレイリスト終了時自動次曲174
- ✅ 재생 목록 종료 시 자동 다음곡174

### v174.7 缓存压缩级别174 | Cache Compress Level174 | キャッシュ圧縮レベル174 | 캐시 압축 수준174
- ✅ 缓存压缩级别174
- ✅ Cache Compress Level174
- ✅ キャッシュ圧縮レベル174
- ✅ 캐시 압축 수준174

### v174.8 进度条拖动预览文字 | Progress Bar Scrub Preview Text | プログレスバースクラブプレビューテキスト | 진행 바 스크럽 미리보기 텍스트
- ✅ 进度条拖动预览文字
- ✅ Progress Bar Scrub Preview Text
- ✅ プログレスバースクラブプレビューテキスト
- ✅ 진행 바 스크럽 미리보기 텍스트

### v174.9 音量标准化音轨174 | Volume Normalize Track174 | ボリュームノーマライズトラック174 | 볼륨 노멀라이즈 트랙174
- ✅ 音量标准化音轨174
- ✅ Volume Normalize Track174
- ✅ ボリュームノーマライズトラック174
- ✅ 볼륨 노멀라이즈 트랙174

### v174.10 历史记录按上传者分组174 | History Group By Uploader174 | 履歴投稿者別グループ化174 | 기록 업로더별 그룹화174
- ✅ 历史记录按上传者分组174
- ✅ History Group By Uploader174
- ✅ 履歴投稿者別グループ化174
- ✅ 기록 업로더별 그룹화174

### v174.11 播放字幕偏移174 | Playback Subtitle Offset174 | 再生字幕オフセット174 | 재생 자막 오프셋174
- ✅ 播放字幕偏移174
- ✅ Playback Subtitle Offset174
- ✅ 再生字幕オフセット174
- ✅ 재생 자막 오프셋174

### v174.12 截图叠加标题 | Screenshot Overlay Title | スクリーンショットオーバーレイタイトル | 스크린샷 오버레이 제목
- ✅ 截图叠加标题
- ✅ Screenshot Overlay Title
- ✅ スクリーンショットオーバーレイタイトル
- ✅ 스크린샷 오버레이 제목

### v174.13 视频饱和度开关174 | Video Saturation Toggle174 | ビデオ彩度切替174 | 비디오 채도 전환174
- ✅ 视频饱和度开关174
- ✅ Video Saturation Toggle174
- ✅ ビデオ彩度切替174
- ✅ 비디오 채도 전환174

### v174.14 弹幕滚动重叠模式 | Danmaku Scroll Overlap Mode | コメントスクロールオーバーラップモード | 댓글 스크롤 겹침 모드
- ✅ 弹幕滚动重叠模式
- ✅ Danmaku Scroll Overlap Mode
- ✅ コメントスクロールオーバーラップモード
- ✅ 댓글 스크롤 겹침 모드

### v174.15 字幕阴影开关174 | Subtitle Shadow Toggle174 | 字幕シャドウ切替174 | 자막 그림자 전환174
- ✅ 字幕阴影开关174
- ✅ Subtitle Shadow Toggle174
- ✅ 字幕シャドウ切替174
- ✅ 자막 그림자 전환174

### v175.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v175.1-v175.15 功能列表
- ✅ Audio Compressor Ratio175, Danmaku Scroll Overlap Mode175, Subtitle Shadow Toggle175, Gesture Double Tap Seek, Cast Video PIP Disconnect Action, Playlist Skip On Error, Cache Compress Level175, Progress Bar Scrub Haptic, Volume Normalize Album, History Filter By Duration, Playback Video Offset, Screenshot Overlay Channel, Video Saturation Level175, Danmaku Scroll Filter, Subtitle Shadow Color

### v175.1 音频压缩器比率175 | Audio Compressor Ratio175 | オーディオコンプレッサー比率175 | 오디오 컴프레서 비율175
- ✅ 音频压缩器比率175
- ✅ Audio Compressor Ratio175
- ✅ オーディオコンプレッサー比率175
- ✅ 오디오 컴프레서 비율175

### v175.2 弹幕滚动重叠模式175 | Danmaku Scroll Overlap Mode175 | コメントスクロールオーバーラップモード175 | 댓글 스크롤 겹침 모드175
- ✅ 弹幕滚动重叠模式175
- ✅ Danmaku Scroll Overlap Mode175
- ✅ コメントスクロールオーバーラップモード175
- ✅ 댓글 스크롤 겹침 모드175

### v175.3 字幕阴影开关175 | Subtitle Shadow Toggle175 | 字幕シャドウ切替175 | 자막 그림자 전환175
- ✅ 字幕阴影开关175
- ✅ Subtitle Shadow Toggle175
- ✅ 字幕シャドウ切替175
- ✅ 자막 그림자 전환175

### v175.4 手势双击快进 | Gesture Double Tap Seek | ジェスチャーダブルタップシーク | 제스처 더블 탭 탐색
- ✅ 手势双击快进
- ✅ Gesture Double Tap Seek
- ✅ ジェスチャーダブルタップシーク
- ✅ 제스처 더블 탭 탐색

### v175.5 投射视频画中画断开操作 | Cast Video PIP Disconnect Action | キャストビデオPIP切断アクション | 캐스트 비디오 PIP 연결 해제 동작
- ✅ 投射视频画中画断开操作
- ✅ Cast Video PIP Disconnect Action
- ✅ キャストビデオPIP切断アクション
- ✅ 캐스트 비디오 PIP 연결 해제 동작

### v175.6 播放列表出错跳过 | Playlist Skip On Error | プレイリストエラー時スキップ | 재생 목록 오류 시 건너뛰기
- ✅ 播放列表出错跳过
- ✅ Playlist Skip On Error
- ✅ プレイリストエラー時スキップ
- ✅ 재생 목록 오류 시 건너뛰기

### v175.7 缓存压缩级别175 | Cache Compress Level175 | キャッシュ圧縮レベル175 | 캐시 압축 수준175
- ✅ 缓存压缩级别175
- ✅ Cache Compress Level175
- ✅ キャッシュ圧縮レベル175
- ✅ 캐시 압축 수준175

### v175.8 进度条拖动触觉反馈 | Progress Bar Scrub Haptic | プログレスバースクラブハプティック | 진행 바 스크럽 햅틱
- ✅ 进度条拖动触觉反馈
- ✅ Progress Bar Scrub Haptic
- ✅ プログレスバースクラブハプティック
- ✅ 진행 바 스크럽 햅틱

### v175.9 音量标准化专辑 | Volume Normalize Album | ボリュームノーマライズアルバム | 볼륨 노멀라이즈 앨범
- ✅ 音量标准化专辑
- ✅ Volume Normalize Album
- ✅ ボリュームノーマライズアルバム
- ✅ 볼륨 노멀라이즈 앨범

### v175.10 历史记录按时长过滤 | History Filter By Duration | 履歴時間フィルター | 기록 재생시간 필터
- ✅ 历史记录按时长过滤
- ✅ History Filter By Duration
- ✅ 履歴時間フィルター
- ✅ 기록 재생시간 필터

### v175.11 播放视频偏移 | Playback Video Offset | 再生ビデオオフセット | 재생 비디오 오프셋
- ✅ 播放视频偏移
- ✅ Playback Video Offset
- ✅ 再生ビデオオフセット
- ✅ 재생 비디오 오프셋

### v175.12 截图叠加频道 | Screenshot Overlay Channel | スクリーンショットオーバーレイチャンネル | 스크린샷 오버레이 채널
- ✅ 截图叠加频道
- ✅ Screenshot Overlay Channel
- ✅ スクリーンショットオーバーレイチャンネル
- ✅ 스크린샷 오버레이 채널

### v175.13 视频饱和度级别175 | Video Saturation Level175 | ビデオ彩度レベル175 | 비디오 채도 수준175
- ✅ 视频饱和度级别175
- ✅ Video Saturation Level175
- ✅ ビデオ彩度レベル175
- ✅ 비디오 채도 수준175

### v175.14 弹幕滚动过滤 | Danmaku Scroll Filter | コメントスクロールフィルター | 댓글 스크롤 필터
- ✅ 弹幕滚动过滤
- ✅ Danmaku Scroll Filter
- ✅ コメントスクロールフィルター
- ✅ 댓글 스크롤 필터

### v175.15 字幕阴影颜色 | Subtitle Shadow Color | 字幕シャドウ色 | 자막 그림자 색상
- ✅ 字幕阴影颜色
- ✅ Subtitle Shadow Color
- ✅ 字幕シャドウ色
- ✅ 자막 그림자 색상

### v176.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v176.1-v176.15 功能列表
- ✅ Audio Compressor Ratio176, Danmaku Scroll Filter176, Subtitle Shadow Color176, Gesture Double Tap Seek176, Cast Video PIP Reconnect, Playlist Skip On Error176, Cache Stream Buffer Size, Progress Bar Scrub Haptic176, Volume Normalize Album176, History Filter By Duration176, Playback Video Offset176, Screenshot Overlay Quality, Video Saturation Level176, Danmaku Scroll Hide On Action, Subtitle Shadow Blur

### v176.1 音频压缩器比率176 | Audio Compressor Ratio176 | オーディオコンプレッサー比率176 | 오디오 컴프레서 비율176
- ✅ 音频压缩器比率176
- ✅ Audio Compressor Ratio176
- ✅ オーディオコンプレッサー比率176
- ✅ 오디오 컴프레서 비율176

### v176.2 弹幕滚动过滤176 | Danmaku Scroll Filter176 | コメントスクロールフィルター176 | 댓글 스크롤 필터176
- ✅ 弹幕滚动过滤176
- ✅ Danmaku Scroll Filter176
- ✅ コメントスクロールフィルター176
- ✅ 댓글 스크롤 필터176

### v176.3 字幕阴影颜色176 | Subtitle Shadow Color176 | 字幕シャドウ色176 | 자막 그림자 색상176
- ✅ 字幕阴影颜色176
- ✅ Subtitle Shadow Color176
- ✅ 字幕シャドウ色176
- ✅ 자막 그림자 색상176

### v176.4 手势双击快进176 | Gesture Double Tap Seek176 | ジェスチャーダブルタップシーク176 | 제스처 더블 탭 탐색176
- ✅ 手势双击快进176
- ✅ Gesture Double Tap Seek176
- ✅ ジェスチャーダブルタップシーク176
- ✅ 제스처 더블 탭 탐색176

### v176.5 投射视频画中画重连 | Cast Video PIP Reconnect | キャストビデオPIP再接続 | 캐스트 비디오 PIP 재연결
- ✅ 投射视频画中画重连
- ✅ Cast Video PIP Reconnect
- ✅ キャストビデオPIP再接続
- ✅ 캐스트 비디오 PIP 재연결

### v176.6 播放列表出错跳过176 | Playlist Skip On Error176 | プレイリストエラー時スキップ176 | 재생 목록 오류 시 건너뛰기176
- ✅ 播放列表出错跳过176
- ✅ Playlist Skip On Error176
- ✅ プレイリストエラー時スキップ176
- ✅ 재생 목록 오류 시 건너뛰기176

### v176.7 缓存流缓冲大小 | Cache Stream Buffer Size | キャッシュストリームバッファサイズ | 캐시 스트림 버퍼 크기
- ✅ 缓存流缓冲大小
- ✅ Cache Stream Buffer Size
- ✅ キャッシュストリームバッファサイズ
- ✅ 캐시 스트림 버퍼 크기

### v176.8 进度条拖动触觉反馈176 | Progress Bar Scrub Haptic176 | プログレスバースクラブハプティック176 | 진행 바 스크럽 햅틱176
- ✅ 进度条拖动触觉反馈176
- ✅ Progress Bar Scrub Haptic176
- ✅ プログレスバースクラブハプティック176
- ✅ 진행 바 스크럽 햅틱176

### v176.9 音量标准化专辑176 | Volume Normalize Album176 | ボリュームノーマライズアルバム176 | 볼륨 노멀라이즈 앨범176
- ✅ 音量标准化专辑176
- ✅ Volume Normalize Album176
- ✅ ボリュームノーマライズアルバム176
- ✅ 볼륨 노멀라이즈 앨범176

### v176.10 历史记录按时长过滤176 | History Filter By Duration176 | 履歴時間フィルター176 | 기록 재생시간 필터176
- ✅ 历史记录按时长过滤176
- ✅ History Filter By Duration176
- ✅ 履歴時間フィルター176
- ✅ 기록 재생시간 필터176

### v176.11 播放视频偏移176 | Playback Video Offset176 | 再生ビデオオフセット176 | 재생 비디오 오프셋176
- ✅ 播放视频偏移176
- ✅ Playback Video Offset176
- ✅ 再生ビデオオフセット176
- ✅ 재생 비디오 오프셋176

### v176.12 截图叠加画质 | Screenshot Overlay Quality | スクリーンショットオーバーレイ品質 | 스크린샷 오버레이 화질
- ✅ 截图叠加画质
- ✅ Screenshot Overlay Quality
- ✅ スクリーンショットオーバーレイ品質
- ✅ 스크린샷 오버레이 화질

### v176.13 视频饱和度级别176 | Video Saturation Level176 | ビデオ彩度レベル176 | 비디오 채도 수준176
- ✅ 视频饱和度级别176
- ✅ Video Saturation Level176
- ✅ ビデオ彩度レベル176
- ✅ 비디오 채도 수준176

### v176.14 弹幕滚动操作时隐藏 | Danmaku Scroll Hide On Action | コメントスクロールアクション時非表示 | 댓글 스크롤 동작 시 숨기기
- ✅ 弹幕滚动操作时隐藏
- ✅ Danmaku Scroll Hide On Action
- ✅ コメントスクロールアクション時非表示
- ✅ 댓글 스크롤 동작 시 숨기기

### v176.15 字幕阴影模糊 | Subtitle Shadow Blur | 字幕シャドウブラー | 자막 그림자 블러
- ✅ 字幕阴影模糊
- ✅ Subtitle Shadow Blur
- ✅ 字幕シャドウブラー
- ✅ 자막 그림자 블러

### v177.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v177.1-v177.15 功能列表
- ✅ Audio Compressor Knee177, Danmaku Scroll Hide On Action177, Subtitle Shadow Blur177, Gesture Double Tap Play Pause, Cast Video PIP Reconnect177, Playlist Max History Size, Cache Stream Buffer Size177, Progress Bar Scrub Timeline, Volume Normalize Track177, History Filter By Uploader, Playback Deinterlace Toggle, Screenshot Overlay Bitrate, Video Brightness Toggle177, Danmaku Scroll Auto Speed, Subtitle Shadow Offset

### v177.1 音频压缩器拐点177 | Audio Compressor Knee177 | オーディオコンプレッサーキー177 | 오디오 컴프레서 니177
- ✅ 音频压缩器拐点177
- ✅ Audio Compressor Knee177
- ✅ オーディオコンプレッサーキー177
- ✅ 오디오 컴프레서 니177

### v177.2 弹幕滚动操作时隐藏177 | Danmaku Scroll Hide On Action177 | コメントスクロールアクション時非表示177 | 댓글 스크롤 동작 시 숨기기177
- ✅ 弹幕滚动操作时隐藏177
- ✅ Danmaku Scroll Hide On Action177
- ✅ コメントスクロールアクション時非表示177
- ✅ 댓글 스크롤 동작 시 숨기기177

### v177.3 字幕阴影模糊177 | Subtitle Shadow Blur177 | 字幕シャドウブラー177 | 자막 그림자 블러177
- ✅ 字幕阴影模糊177
- ✅ Subtitle Shadow Blur177
- ✅ 字幕シャドウブラー177
- ✅ 자막 그림자 블러177

### v177.4 手势双击播放暂停 | Gesture Double Tap Play Pause | ジェスチャーダブルタップ再生/一時停止 | 제스처 더블 탭 재생/일시 정지
- ✅ 手势双击播放暂停
- ✅ Gesture Double Tap Play Pause
- ✅ ジェスチャーダブルタップ再生/一時停止
- ✅ 제스처 더블 탭 재생/일시 정지

### v177.5 投射视频画中画重连177 | Cast Video PIP Reconnect177 | キャストビデオPIP再接続177 | 캐스트 비디오 PIP 재연결177
- ✅ 投射视频画中画重连177
- ✅ Cast Video PIP Reconnect177
- ✅ キャストビデオPIP再接続177
- ✅ 캐스트 비디오 PIP 재연결177

### v177.6 播放列表最大历史大小 | Playlist Max History Size | プレイリスト最大履歴サイズ | 재생 목록 최대 기록 크기
- ✅ 播放列表最大历史大小
- ✅ Playlist Max History Size
- ✅ プレイリスト最大履歴サイズ
- ✅ 재생 목록 최대 기록 크기

### v177.7 缓存流缓冲大小177 | Cache Stream Buffer Size177 | キャッシュストリームバッファサイズ177 | 캐시 스트림 버퍼 크기177
- ✅ 缓存流缓冲大小177
- ✅ Cache Stream Buffer Size177
- ✅ キャッシュストリームバッファサイズ177
- ✅ 캐시 스트림 버퍼 크기177

### v177.8 进度条拖动时间线 | Progress Bar Scrub Timeline | プログレスバースクラブタイムライン | 진행 바 스크럽 타임라인
- ✅ 进度条拖动时间线
- ✅ Progress Bar Scrub Timeline
- ✅ プログレスバースクラブタイムライン
- ✅ 진행 바 스크럽 타임라인

### v177.9 音量标准化音轨177 | Volume Normalize Track177 | ボリュームノーマライズトラック177 | 볼륨 노멀라이즈 트랙177
- ✅ 音量标准化音轨177
- ✅ Volume Normalize Track177
- ✅ ボリュームノーマライズトラック177
- ✅ 볼륨 노멀라이즈 트랙177

### v177.10 历史记录按上传者过滤 | History Filter By Uploader | 履歴投稿者フィルター | 기록 업로더 필터
- ✅ 历史记录按上传者过滤
- ✅ History Filter By Uploader
- ✅ 履歴投稿者フィルター
- ✅ 기록 업로더 필터

### v177.11 播放去隔行开关 | Playback Deinterlace Toggle | 再生インターレース解除切替 | 재생 디인터레이스 전환
- ✅ 播放去隔行开关
- ✅ Playback Deinterlace Toggle
- ✅ 再生インターレース解除切替
- ✅ 재생 디인터레이스 전환

### v177.12 截图叠加比特率 | Screenshot Overlay Bitrate | スクリーンショットオーバーレイビットレート | 스크린샷 오버레이 비트레이트
- ✅ 截图叠加比特率
- ✅ Screenshot Overlay Bitrate
- ✅ スクリーンショットオーバーレイビットレート
- ✅ 스크린샷 오버레이 비트레이트

### v177.13 视频亮度开关177 | Video Brightness Toggle177 | ビデオ明るさ切替177 | 비디오 밝기 전환177
- ✅ 视频亮度开关177
- ✅ Video Brightness Toggle177
- ✅ ビデオ明るさ切替177
- ✅ 비디오 밝기 전환177

### v177.14 弹幕滚动自动速度 | Danmaku Scroll Auto Speed | コメントスクロール自動速度 | 댓글 스크롤 자동 속도
- ✅ 弹幕滚动自动速度
- ✅ Danmaku Scroll Auto Speed
- ✅ コメントスクロール自動速度
- ✅ 댓글 스크롤 자동 속도

### v177.15 字幕阴影偏移 | Subtitle Shadow Offset | 字幕シャドウオフセット | 자막 그림자 오프셋
- ✅ 字幕阴影偏移
- ✅ Subtitle Shadow Offset
- ✅ 字幕シャドウオフセット
- ✅ 자막 그림자 오프셋

### v178.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v178.1-v178.15 功能列表
- ✅ Audio Compressor Attack178, Danmaku Scroll Auto Speed178, Subtitle Shadow Offset178, Gesture Double Tap Play Pause178, Cast Video PIP Resolution Lock, Playlist Max History Size178, Cache Stream Prefetch, Progress Bar Scrub Timeline178, Volume Normalize Track178, History Filter By Uploader178, Playback Deinterlace Toggle178, Screenshot Overlay FPS, Video Brightness Level178, Danmaku Scroll Priority, Subtitle Outline Toggle178

### v178.1 音频压缩器启动178 | Audio Compressor Attack178 | オーディオコンプレッサーアタック178 | 오디오 컴프레서 어택178
- ✅ 音频压缩器启动178
- ✅ Audio Compressor Attack178
- ✅ オーディオコンプレッサーアタック178
- ✅ 오디오 컴프레서 어택178

### v178.2 弹幕滚动自动速度178 | Danmaku Scroll Auto Speed178 | コメントスクロール自動速度178 | 댓글 스크롤 자동 속도178
- ✅ 弹幕滚动自动速度178
- ✅ Danmaku Scroll Auto Speed178
- ✅ コメントスクロール自動速度178
- ✅ 댓글 스크롤 자동 속도178

### v178.3 字幕阴影偏移178 | Subtitle Shadow Offset178 | 字幕シャドウオフセット178 | 자막 그림자 오프셋178
- ✅ 字幕阴影偏移178
- ✅ Subtitle Shadow Offset178
- ✅ 字幕シャドウオフセット178
- ✅ 자막 그림자 오프셋178

### v178.4 手势双击播放暂停178 | Gesture Double Tap Play Pause178 | ジェスチャーダブルタップ再生/一時停止178 | 제스처 더블 탭 재생/일시 정지178
- ✅ 手势双击播放暂停178
- ✅ Gesture Double Tap Play Pause178
- ✅ ジェスチャーダブルタップ再生/一時停止178
- ✅ 제스처 더블 탭 재생/일시 정지178

### v178.5 投射视频画中画分辨率锁定 | Cast Video PIP Resolution Lock | キャストビデオPIP解像度ロック | 캐스트 비디오 PIP 해상도 잠금
- ✅ 投射视频画中画分辨率锁定
- ✅ Cast Video PIP Resolution Lock
- ✅ キャストビデオPIP解像度ロック
- ✅ 캐스트 비디오 PIP 해상도 잠금

### v178.6 播放列表最大历史大小178 | Playlist Max History Size178 | プレイリスト最大履歴サイズ178 | 재생 목록 최대 기록 크기178
- ✅ 播放列表最大历史大小178
- ✅ Playlist Max History Size178
- ✅ プレイリスト最大履歴サイズ178
- ✅ 재생 목록 최대 기록 크기178

### v178.7 缓存流预取 | Cache Stream Prefetch | キャッシュストリームプリフェッチ | 캐시 스트림 프리페치
- ✅ 缓存流预取
- ✅ Cache Stream Prefetch
- ✅ キャッシュストリームプリフェッチ
- ✅ 캐시 스트림 프리페치

### v178.8 进度条拖动时间线178 | Progress Bar Scrub Timeline178 | プログレスバースクラブタイムライン178 | 진행 바 스크럽 타임라인178
- ✅ 进度条拖动时间线178
- ✅ Progress Bar Scrub Timeline178
- ✅ プログレスバースクラブタイムライン178
- ✅ 진행 바 스크럽 타임라인178

### v178.9 音量标准化音轨178 | Volume Normalize Track178 | ボリュームノーマライズトラック178 | 볼륨 노멀라이즈 트랙178
- ✅ 音量标准化音轨178
- ✅ Volume Normalize Track178
- ✅ ボリュームノーマライズトラック178
- ✅ 볼륨 노멀라이즈 트랙178

### v178.10 历史记录按上传者过滤178 | History Filter By Uploader178 | 履歴投稿者フィルター178 | 기록 업로더 필터178
- ✅ 历史记录按上传者过滤178
- ✅ History Filter By Uploader178
- ✅ 履歴投稿者フィルター178
- ✅ 기록 업로더 필터178

### v178.11 播放去隔行开关178 | Playback Deinterlace Toggle178 | 再生インターレース解除切替178 | 재생 디인터레이스 전환178
- ✅ 播放去隔行开关178
- ✅ Playback Deinterlace Toggle178
- ✅ 再生インターレース解除切替178
- ✅ 재생 디인터레이스 전환178

### v178.12 截图叠加帧率 | Screenshot Overlay FPS | スクリーンショットオーバーレイFPS | 스크린샷 오버레이 FPS
- ✅ 截图叠加帧率
- ✅ Screenshot Overlay FPS
- ✅ スクリーンショットオーバーレイFPS
- ✅ 스크린샷 오버레이 FPS

### v178.13 视频亮度级别178 | Video Brightness Level178 | ビデオ明るさレベル178 | 비디오 밝기 수준178
- ✅ 视频亮度级别178
- ✅ Video Brightness Level178
- ✅ ビデオ明るさレベル178
- ✅ 비디오 밝기 수준178

### v178.14 弹幕滚动优先级 | Danmaku Scroll Priority | コメントスクロール優先度 | 댓글 스크롤 우선순위
- ✅ 弹幕滚动优先级
- ✅ Danmaku Scroll Priority
- ✅ コメントスクロール優先度
- ✅ 댓글 스크롤 우선순위

### v178.15 字幕描边开关178 | Subtitle Outline Toggle178 | 字幕アウトライン切替178 | 자막 외곽선 전환178
- ✅ 字幕描边开关178
- ✅ Subtitle Outline Toggle178
- ✅ 字幕アウトライン切替178
- ✅ 자막 외곽선 전환178

### v179.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v179.1-v179.15 功能列表
- ✅ Audio Compressor Release179, Danmaku Scroll Priority179, Subtitle Outline Toggle179, Gesture Tap Feedback, Cast Video PIP Resolution Lock179, Playlist Smart Queue, Cache Stream Prefetch179, Progress Bar Scrub Gesture, Volume Normalize Track179, History Filter By Quality, Playback Rotate Video, Screenshot Overlay FPS179, Video Brightness Level179, Danmaku Scroll Merge, Subtitle Outline Color179

### v179.1 音频压缩器释放179 | Audio Compressor Release179 | オーディオコンプレッサーリリース179 | 오디오 컴프레서 릴리스179
- ✅ 音频压缩器释放179
- ✅ Audio Compressor Release179
- ✅ オーディオコンプレッサーリリース179
- ✅ 오디오 컴프레서 릴리스179

### v179.2 弹幕滚动优先级179 | Danmaku Scroll Priority179 | コメントスクロール優先度179 | 댓글 스크롤 우선순위179
- ✅ 弹幕滚动优先级179
- ✅ Danmaku Scroll Priority179
- ✅ コメントスクロール優先度179
- ✅ 댓글 스크롤 우선순위179

### v179.3 字幕描边开关179 | Subtitle Outline Toggle179 | 字幕アウトライン切替179 | 자막 외곽선 전환179
- ✅ 字幕描边开关179
- ✅ Subtitle Outline Toggle179
- ✅ 字幕アウトライン切替179
- ✅ 자막 외곽선 전환179

### v179.4 手势点击反馈 | Gesture Tap Feedback | ジェスチャータップフィードバック | 제스처 탭 피드백
- ✅ 手势点击反馈
- ✅ Gesture Tap Feedback
- ✅ ジェスチャータップフィードバック
- ✅ 제스처 탭 피드백

### v179.5 投射视频画中画分辨率锁定179 | Cast Video PIP Resolution Lock179 | キャストビデオPIP解像度ロック179 | 캐스트 비디오 PIP 해상도 잠금179
- ✅ 投射视频画中画分辨率锁定179
- ✅ Cast Video PIP Resolution Lock179
- ✅ キャストビデオPIP解像度ロック179
- ✅ 캐스트 비디오 PIP 해상도 잠금179

### v179.6 播放列表智能队列 | Playlist Smart Queue | プレイリストスマートキュー | 재생 목록 스마트 큐
- ✅ 播放列表智能队列
- ✅ Playlist Smart Queue
- ✅ プレイリストスマートキュー
- ✅ 재생 목록 스마트 큐

### v179.7 缓存流预取179 | Cache Stream Prefetch179 | キャッシュストリームプリフェッチ179 | 캐시 스트림 프리페치179
- ✅ 缓存流预取179
- ✅ Cache Stream Prefetch179
- ✅ キャッシュストリームプリフェッチ179
- ✅ 캐시 스트림 프리페치179

### v179.8 进度条拖动手势 | Progress Bar Scrub Gesture | プログレスバースクラブジェスチャー | 진행 바 스크럽 제스처
- ✅ 进度条拖动手势
- ✅ Progress Bar Scrub Gesture
- ✅ プログレスバースクラブジェスチャー
- ✅ 진행 바 스크럽 제스처

### v179.9 音量标准化音轨179 | Volume Normalize Track179 | ボリュームノーマライズトラック179 | 볼륨 노멀라이즈 트랙179
- ✅ 音量标准化音轨179
- ✅ Volume Normalize Track179
- ✅ ボリュームノーマライズトラック179
- ✅ 볼륨 노멀라이즈 트랙179

### v179.10 历史记录按画质过滤 | History Filter By Quality | 履歴画質フィルター | 기록 화질 필터
- ✅ 历史记录按画质过滤
- ✅ History Filter By Quality
- ✅ 履歴画質フィルター
- ✅ 기록 화질 필터

### v179.11 播放旋转视频 | Playback Rotate Video | 再生ビデオ回転 | 재생 비디오 회전
- ✅ 播放旋转视频
- ✅ Playback Rotate Video
- ✅ 再生ビデオ回転
- ✅ 재생 비디오 회전

### v179.12 截图叠加帧率179 | Screenshot Overlay FPS179 | スクリーンショットオーバーレイFPS179 | 스크린샷 오버레이 FPS179
- ✅ 截图叠加帧率179
- ✅ Screenshot Overlay FPS179
- ✅ スクリーンショットオーバーレイFPS179
- ✅ 스크린샷 오버레이 FPS179

### v179.13 视频亮度级别179 | Video Brightness Level179 | ビデオ明るさレベル179 | 비디오 밝기 수준179
- ✅ 视频亮度级别179
- ✅ Video Brightness Level179
- ✅ ビデオ明るさレベル179
- ✅ 비디오 밝기 수준179

### v179.14 弹幕滚动合并 | Danmaku Scroll Merge | コメントスクロールマージ | 댓글 스크롤 병합
- ✅ 弹幕滚动合并
- ✅ Danmaku Scroll Merge
- ✅ コメントスクロールマージ
- ✅ 댓글 스크롤 병합

### v179.15 字幕描边颜色179 | Subtitle Outline Color179 | 字幕アウトライン色179 | 자막 외곽선 색상179
- ✅ 字幕描边颜色179
- ✅ Subtitle Outline Color179
- ✅ 字幕アウトライン色179
- ✅ 자막 외곽선 색상179

### v180.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v180.1-v180.15 功能列表
- ✅ Audio Compressor Mix180, Danmaku Scroll Merge180, Subtitle Outline Color180, Gesture Tap Feedback180, Cast Video PIP Sync Mode, Playlist Smart Queue180, Cache Stream Read Ahead, Progress Bar Scrub Gesture180, Volume Normalize Track180, History Filter By Quality180, Playback Rotate Video180, Screenshot Overlay Codec, Video Gamma Toggle180, Danmaku Scroll Merge Mode, Subtitle Outline Width180

### v180.1 音频压缩器混合180 | Audio Compressor Mix180 | オーディオコンプレッサーミックス180 | 오디오 컴프레서 믹스180
- ✅ 音频压缩器混合180
- ✅ Audio Compressor Mix180
- ✅ オーディオコンプレッサーミックス180
- ✅ 오디오 컴프레서 믹스180

### v180.2 弹幕滚动合并180 | Danmaku Scroll Merge180 | コメントスクロールマージ180 | 댓글 스크롤 병합180
- ✅ 弹幕滚动合并180
- ✅ Danmaku Scroll Merge180
- ✅ コメントスクロールマージ180
- ✅ 댓글 스크롤 병합180

### v180.3 字幕描边颜色180 | Subtitle Outline Color180 | 字幕アウトライン色180 | 자막 외곽선 색상180
- ✅ 字幕描边颜色180
- ✅ Subtitle Outline Color180
- ✅ 字幕アウトライン色180
- ✅ 자막 외곽선 색상180

### v180.4 手势点击反馈180 | Gesture Tap Feedback180 | ジェスチャータップフィードバック180 | 제스처 탭 피드백180
- ✅ 手势点击反馈180
- ✅ Gesture Tap Feedback180
- ✅ ジェスチャータップフィードバック180
- ✅ 제스처 탭 피드백180

### v180.5 投射视频画中画同步模式 | Cast Video PIP Sync Mode | キャストビデオPIP同期モード | 캐스트 비디오 PIP 동기화 모드
- ✅ 投射视频画中画同步模式
- ✅ Cast Video PIP Sync Mode
- ✅ キャストビデオPIP同期モード
- ✅ 캐스트 비디오 PIP 동기화 모드

### v180.6 播放列表智能队列180 | Playlist Smart Queue180 | プレイリストスマートキュー180 | 재생 목록 스마트 큐180
- ✅ 播放列表智能队列180
- ✅ Playlist Smart Queue180
- ✅ プレイリストスマートキュー180
- ✅ 재생 목록 스마트 큐180

### v180.7 缓存流预读 | Cache Stream Read Ahead | キャッシュストリームリードアヘッド | 캐시 스트림 리드 어헤드
- ✅ 缓存流预读
- ✅ Cache Stream Read Ahead
- ✅ キャッシュストリームリードアヘッド
- ✅ 캐시 스트림 리드 어헤드

### v180.8 进度条拖动手势180 | Progress Bar Scrub Gesture180 | プログレスバースクラブジェスチャー180 | 진행 바 스크럽 제스처180
- ✅ 进度条拖动手势180
- ✅ Progress Bar Scrub Gesture180
- ✅ プログレスバースクラブジェスチャー180
- ✅ 진행 바 스크럽 제스처180

### v180.9 音量标准化音轨180 | Volume Normalize Track180 | ボリュームノーマライズトラック180 | 볼륨 노멀라이즈 트랙180
- ✅ 音量标准化音轨180
- ✅ Volume Normalize Track180
- ✅ ボリュームノーマライズトラック180
- ✅ 볼륨 노멀라이즈 트랙180

### v180.10 历史记录按画质过滤180 | History Filter By Quality180 | 履歴画質フィルター180 | 기록 화질 필터180
- ✅ 历史记录按画质过滤180
- ✅ History Filter By Quality180
- ✅ 履歴画質フィルター180
- ✅ 기록 화질 필터180

### v180.11 播放旋转视频180 | Playback Rotate Video180 | 再生ビデオ回転180 | 재생 비디오 회전180
- ✅ 播放旋转视频180
- ✅ Playback Rotate Video180
- ✅ 再生ビデオ回転180
- ✅ 재생 비디오 회전180

### v180.12 截图叠加编码 | Screenshot Overlay Codec | スクリーンショットオーバーレイコーデック | 스크린샷 오버레이 코덱
- ✅ 截图叠加编码
- ✅ Screenshot Overlay Codec
- ✅ スクリーンショットオーバーレイコーデック
- ✅ 스크린샷 오버레이 코덱

### v180.13 视频伽马开关180 | Video Gamma Toggle180 | ビデオガンマ切替180 | 비디오 감마 전환180
- ✅ 视频伽马开关180
- ✅ Video Gamma Toggle180
- ✅ ビデオガンマ切替180
- ✅ 비디오 감마 전환180

### v180.14 弹幕滚动合并模式 | Danmaku Scroll Merge Mode | コメントスクロールマージモード | 댓글 스크롤 병합 모드
- ✅ 弹幕滚动合并模式
- ✅ Danmaku Scroll Merge Mode
- ✅ コメントスクロールマージモード
- ✅ 댓글 스크롤 병합 모드

### v180.15 字幕描边宽度180 | Subtitle Outline Width180 | 字幕アウトライン幅180 | 자막 외곽선 너비180
- ✅ 字幕描边宽度180
- ✅ Subtitle Outline Width180
- ✅ 字幕アウトライン幅180
- ✅ 자막 외곽선 너비180


### v181.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v181.1-v181.15 功能列表
- ✅ Audio Reverb Toggle181, Danmaku Fixed Position, Subtitle Bg Color Alpha, Gesture Edge Swipe Left, Cast Audio Bitrate, Playlist Loop Single, Cache Download Resume, Progress Bar Thumb Size, Volume Boost Toggle181, History Bookmark Toggle, Playback Chapter Skip, Screenshot Region Select, Video HDR10 Toggle181, Danmaku Fixed Position181, Subtitle Bg Color Alpha181

### v181.1 音频混响开关181 | Audio Reverb Toggle181 | オーディオリバーブ切替181 | 오디오 리버브 전환181
- ✅ 音频混响开关181
- ✅ Audio Reverb Toggle181
- ✅ オーディオリバーブ切替181
- ✅ 오디오 리버브 전환181

### v181.2 弹幕固定位置 | Danmaku Fixed Position | コメント固定位置 | 댓글 고정 위치
- ✅ 弹幕固定位置
- ✅ Danmaku Fixed Position
- ✅ コメント固定位置
- ✅ 댓글 고정 위치

### v181.3 字幕背景颜色透明度 | Subtitle Bg Color Alpha | 字幕背景色アルファ | 자막 배경 색상 알파
- ✅ 字幕背景颜色透明度
- ✅ Subtitle Bg Color Alpha
- ✅ 字幕背景色アルファ
- ✅ 자막 배경 색상 알파

### v181.4 手势左边缘滑动 | Gesture Edge Swipe Left | ジェスチャーエッジスワイプ左 | 제스처 가장자리 왼쪽 스와이프
- ✅ 手势左边缘滑动
- ✅ Gesture Edge Swipe Left
- ✅ ジェスチャーエッジスワイプ左
- ✅ 제스처 가장자리 왼쪽 스와이프

### v181.5 投射音频比特率 | Cast Audio Bitrate | キャストオーディオビットレート | 캐스트 오디오 비트레이트
- ✅ 投射音频比特率
- ✅ Cast Audio Bitrate
- ✅ キャストオーディオビットレート
- ✅ 캐스트 오디오 비트레이트

### v181.6 播放列表单曲循环 | Playlist Loop Single | プレイリスト単曲ループ | 재생 목록 단곡 반복
- ✅ 播放列表单曲循环
- ✅ Playlist Loop Single
- ✅ プレイリスト単曲ループ
- ✅ 재생 목록 단곡 반복

### v181.7 缓存下载恢复 | Cache Download Resume | キャッシュダウンロード再開 | 캐시 다운로드 재개
- ✅ 缓存下载恢复
- ✅ Cache Download Resume
- ✅ キャッシュダウンロード再開
- ✅ 캐시 다운로드 재개

### v181.8 进度条滑块大小 | Progress Bar Thumb Size | プログレスバーサムサイズ | 진행 바 썸 크기
- ✅ 进度条滑块大小
- ✅ Progress Bar Thumb Size
- ✅ プログレスバーサムサイズ
- ✅ 진행 바 썸 크기

### v181.9 音量增强开关181 | Volume Boost Toggle181 | ボリュームブースト切替181 | 볼륨 부스트 전환181
- ✅ 音量增强开关181
- ✅ Volume Boost Toggle181
- ✅ ボリュームブースト切替181
- ✅ 볼륨 부스트 전환181

### v181.10 历史记录书签开关 | History Bookmark Toggle | 履歴ブックマーク切替 | 기록 북마크 전환
- ✅ 历史记录书签开关
- ✅ History Bookmark Toggle
- ✅ 履歴ブックマーク切替
- ✅ 기록 북마크 전환

### v181.11 播放跳过章节 | Playback Chapter Skip | 再生チャプタースキップ | 재생 챕터 건너뛰기
- ✅ 播放跳过章节
- ✅ Playback Chapter Skip
- ✅ 再生チャプタースキップ
- ✅ 재생 챕터 건너뛰기

### v181.12 截图区域选择 | Screenshot Region Select | スクリーンショット領域選択 | 스크린샷 영역 선택
- ✅ 截图区域选择
- ✅ Screenshot Region Select
- ✅ スクリーンショット領域選択
- ✅ 스크린샷 영역 선택

### v181.13 视频HDR10开关181 | Video HDR10 Toggle181 | ビデオHDR10切替181 | 비디오 HDR10 전환181
- ✅ 视频HDR10开关181
- ✅ Video HDR10 Toggle181
- ✅ ビデオHDR10切替181
- ✅ 비디오 HDR10 전환181

### v181.14 弹幕固定位置181 | Danmaku Fixed Position181 | コメント固定位置181 | 댓글 고정 위치181
- ✅ 弹幕固定位置181
- ✅ Danmaku Fixed Position181
- ✅ コメント固定位置181
- ✅ 댓글 고정 위치181

### v181.15 字幕背景颜色透明度181 | Subtitle Bg Color Alpha181 | 字幕背景色アルファ181 | 자막 배경 색상 알파181
- ✅ 字幕背景颜色透明度181
- ✅ Subtitle Bg Color Alpha181
- ✅ 字幕背景色アルファ181
- ✅ 자막 배경 색상 알파181

### v182.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v182.1-v182.15 功能列表
- ✅ Audio Reverb Decay182, Danmaku Fixed Font182, Subtitle Bg Color Alpha182, Gesture Edge Swipe Right182, Cast Audio Bitrate182, Playlist Loop Single182, Cache Download Resume182, Progress Bar Thumb Size182, Volume Boost Level182, History Bookmark Toggle182, Playback Chapter Skip182, Screenshot Region Select182, Video HDR10 Level182, Danmaku Fixed Speed, Subtitle Bg Color

### v182.1 音频混响衰减182 | Audio Reverb Decay182 | オーディオリバーブディケイ182 | 오디오 리버브 감쇠182
- ✅ 音频混响衰减182
- ✅ Audio Reverb Decay182
- ✅ オーディオリバーブディケイ182
- ✅ 오디오 리버브 감쇠182

### v182.2 弹幕固定字体182 | Danmaku Fixed Font182 | コメント固定フォント182 | 댓글 고정 글꼴182
- ✅ 弹幕固定字体182
- ✅ Danmaku Fixed Font182
- ✅ コメント固定フォント182
- ✅ 댓글 고정 글꼴182

### v182.3 字幕背景颜色透明度182 | Subtitle Bg Color Alpha182 | 字幕背景色アルファ182 | 자막 배경 색상 알파182
- ✅ 字幕背景颜色透明度182
- ✅ Subtitle Bg Color Alpha182
- ✅ 字幕背景色アルファ182
- ✅ 자막 배경 색상 알파182

### v182.4 手势右边缘滑动182 | Gesture Edge Swipe Right182 | ジェスチャーエッジスワイプ右182 | 제스처 가장자리 오른쪽 스와이프182
- ✅ 手势右边缘滑动182
- ✅ Gesture Edge Swipe Right182
- ✅ ジェスチャーエッジスワイプ右182
- ✅ 제스처 가장자리 오른쪽 스와이프182

### v182.5 投射音频比特率182 | Cast Audio Bitrate182 | キャストオーディオビットレート182 | 캐스트 오디오 비트레이트182
- ✅ 投射音频比特率182
- ✅ Cast Audio Bitrate182
- ✅ キャストオーディオビットレート182
- ✅ 캐스트 오디오 비트레이트182

### v182.6 播放列表单曲循环182 | Playlist Loop Single182 | プレイリスト単曲ループ182 | 재생 목록 단곡 반복182
- ✅ 播放列表单曲循环182
- ✅ Playlist Loop Single182
- ✅ プレイリスト単曲ループ182
- ✅ 재생 목록 단곡 반복182

### v182.7 缓存下载恢复182 | Cache Download Resume182 | キャッシュダウンロード再開182 | 캐시 다운로드 재개182
- ✅ 缓存下载恢复182
- ✅ Cache Download Resume182
- ✅ キャッシュダウンロード再開182
- ✅ 캐시 다운로드 재개182

### v182.8 进度条滑块大小182 | Progress Bar Thumb Size182 | プログレスバーサムサイズ182 | 진행 바 썸 크기182
- ✅ 进度条滑块大小182
- ✅ Progress Bar Thumb Size182
- ✅ プログレスバーサムサイズ182
- ✅ 진행 바 썸 크기182

### v182.9 音量增强级别182 | Volume Boost Level182 | ボリュームブーストレベル182 | 볼륨 부스트 수준182
- ✅ 音量增强级别182
- ✅ Volume Boost Level182
- ✅ ボリュームブーストレベル182
- ✅ 볼륨 부스트 수준182

### v182.10 历史记录书签开关182 | History Bookmark Toggle182 | 履歴ブックマーク切替182 | 기록 북마크 전환182
- ✅ 历史记录书签开关182
- ✅ History Bookmark Toggle182
- ✅ 履歴ブックマーク切替182
- ✅ 기록 북마크 전환182

### v182.11 播放跳过章节182 | Playback Chapter Skip182 | 再生チャプタースキップ182 | 재생 챕터 건너뛰기182
- ✅ 播放跳过章节182
- ✅ Playback Chapter Skip182
- ✅ 再生チャプタースキップ182
- ✅ 재생 챕터 건너뛰기182

### v182.12 截图区域选择182 | Screenshot Region Select182 | スクリーンショット領域選択182 | 스크린샷 영역 선택182
- ✅ 截图区域选择182
- ✅ Screenshot Region Select182
- ✅ スクリーンショット領域選択182
- ✅ 스크린샷 영역 선택182

### v182.13 视频HDR10级别182 | Video HDR10 Level182 | ビデオHDR10レベル182 | 비디오 HDR10 수준182
- ✅ 视频HDR10级别182
- ✅ Video HDR10 Level182
- ✅ ビデオHDR10レベル182
- ✅ 비디오 HDR10 수준182

### v182.14 弹幕固定速度 | Danmaku Fixed Speed | コメント固定速度 | 댓글 고정 속도
- ✅ 弹幕固定速度
- ✅ Danmaku Fixed Speed
- ✅ コメント固定速度
- ✅ 댓글 고정 속도

### v182.15 字幕背景颜色 | Subtitle Bg Color | 字幕背景色 | 자막 배경 색상
- ✅ 字幕背景颜色
- ✅ Subtitle Bg Color
- ✅ 字幕背景色
- ✅ 자막 배경 색상

### v183.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v183.1-v183.15 功能列表
- ✅ Audio Reverb Decay183, Danmaku Fixed Speed183, Subtitle Bg Color183, Gesture Edge Swipe Up183, Cast Audio Channel, Playlist Loop All183, Cache Download Batch183, Progress Bar Thumb Glow183, Volume Boost Level183, History Bookmark Color, Playback Chapter Prev, Screenshot Crop Toggle, Video HDR10 Level183, Danmaku Fixed Color, Subtitle Bg Color184

### v183.1 音频混响衰减183 | Audio Reverb Decay183 | オーディオリバーブディケイ183 | 오디오 리버브 감쇠183
- ✅ 音频混响衰减183
- ✅ Audio Reverb Decay183
- ✅ オーディオリバーブディケイ183
- ✅ 오디오 리버브 감쇠183

### v183.2 弹幕固定速度183 | Danmaku Fixed Speed183 | コメント固定速度183 | 댓글 고정 속도183
- ✅ 弹幕固定速度183
- ✅ Danmaku Fixed Speed183
- ✅ コメント固定速度183
- ✅ 댓글 고정 속도183

### v183.3 字幕背景颜色183 | Subtitle Bg Color183 | 字幕背景色183 | 자막 배경 색상183
- ✅ 字幕背景颜色183
- ✅ Subtitle Bg Color183
- ✅ 字幕背景色183
- ✅ 자막 배경 색상183

### v183.4 手势上边缘滑动183 | Gesture Edge Swipe Up183 | ジェスチャーエッジスワイプ上183 | 제스처 가장자리 위쪽 스와이프183
- ✅ 手势上边缘滑动183
- ✅ Gesture Edge Swipe Up183
- ✅ ジェスチャーエッジスワイプ上183
- ✅ 제스처 가장자리 위쪽 스와이프183

### v183.5 投射音频声道 | Cast Audio Channel | キャストオーディオチャンネル | 캐스트 오디오 채널
- ✅ 投射音频声道
- ✅ Cast Audio Channel
- ✅ キャストオーディオチャンネル
- ✅ 캐스트 오디오 채널

### v183.6 播放列表全部循环183 | Playlist Loop All183 | プレイリスト全曲ループ183 | 재생 목록 전체 반복183
- ✅ 播放列表全部循环183
- ✅ Playlist Loop All183
- ✅ プレイリスト全曲ループ183
- ✅ 재생 목록 전체 반복183

### v183.7 缓存批量下载183 | Cache Download Batch183 | キャッシュバッチダウンロード183 | 캐시 배치 다운로드183
- ✅ 缓存批量下载183
- ✅ Cache Download Batch183
- ✅ キャッシュバッチダウンロード183
- ✅ 캐시 배치 다운로드183

### v183.8 进度条滑块发光183 | Progress Bar Thumb Glow183 | プログレスバーサムグロウ183 | 진행 바 썸 글로우183
- ✅ 进度条滑块发光183
- ✅ Progress Bar Thumb Glow183
- ✅ プログレスバーサムグロウ183
- ✅ 진행 바 썸 글로우183

### v183.9 音量增强级别183 | Volume Boost Level183 | ボリュームブーストレベル183 | 볼륨 부스트 수준183
- ✅ 音量增强级别183
- ✅ Volume Boost Level183
- ✅ ボリュームブーストレベル183
- ✅ 볼륨 부스트 수준183

### v183.10 历史记录书签颜色 | History Bookmark Color | 履歴ブックマーク色 | 기록 북마크 색상
- ✅ 历史记录书签颜色
- ✅ History Bookmark Color
- ✅ 履歴ブックマーク色
- ✅ 기록 북마크 색상

### v183.11 播放上一章节 | Playback Chapter Prev | 再生チャプター前 | 재생 챕터 이전
- ✅ 播放上一章节
- ✅ Playback Chapter Prev
- ✅ 再生チャプター前
- ✅ 재생 챕터 이전

### v183.12 截图裁剪开关 | Screenshot Crop Toggle | スクリーンショットクロップ切替 | 스크린샷 크롭 전환
- ✅ 截图裁剪开关
- ✅ Screenshot Crop Toggle
- ✅ スクリーンショットクロップ切替
- ✅ 스크린샷 크롭 전환

### v183.13 视频HDR10级别183 | Video HDR10 Level183 | ビデオHDR10レベル183 | 비디오 HDR10 수준183
- ✅ 视频HDR10级别183
- ✅ Video HDR10 Level183
- ✅ ビデオHDR10レベル183
- ✅ 비디오 HDR10 수준183

### v183.14 弹幕固定颜色 | Danmaku Fixed Color | コメント固定色 | 댓글 고정 색상
- ✅ 弹幕固定颜色
- ✅ Danmaku Fixed Color
- ✅ コメント固定色
- ✅ 댓글 고정 색상

### v183.15 字幕背景颜色184 | Subtitle Bg Color184 | 字幕背景色184 | 자막 배경 색상184
- ✅ 字幕背景颜色184
- ✅ Subtitle Bg Color184
- ✅ 字幕背景色184
- ✅ 자막 배경 색상184

### v184.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v184.1-v184.15 功能列表
- ✅ Audio Reverb Mix184, Danmaku Fixed Color184, Subtitle Bg Color185, Gesture Edge Swipe Down184, Cast Audio Channel184, Playlist Loop All184, Cache Download Batch184, Progress Bar Thumb Glow184, Volume Boost Gain184, History Bookmark Color184, Playback Chapter Prev184, Screenshot Crop Toggle184, Video HDR10 ToneMap184, Danmaku Fixed Size184, Subtitle Bg Border184

### v184.1 音频混响混合184 | Audio Reverb Mix184 | オーディオリバーブミックス184 | 오디오 리버브 믹스184
- ✅ 音频混响混合184
- ✅ Audio Reverb Mix184
- ✅ オーディオリバーブミックス184
- ✅ 오디오 리버브 믹스184

### v184.2 弹幕固定颜色184 | Danmaku Fixed Color184 | コメント固定色184 | 댓글 고정 색상184
- ✅ 弹幕固定颜色184
- ✅ Danmaku Fixed Color184
- ✅ コメント固定色184
- ✅ 댓글 고정 색상184

### v184.3 字幕背景颜色185 | Subtitle Bg Color185 | 字幕背景色185 | 자막 배경 색상185
- ✅ 字幕背景颜色185
- ✅ Subtitle Bg Color185
- ✅ 字幕背景色185
- ✅ 자막 배경 색상185

### v184.4 手势下边缘滑动184 | Gesture Edge Swipe Down184 | ジェスチャーエッジスワイプ下184 | 제스처 가장자리 아래쪽 스와이프184
- ✅ 手势下边缘滑动184
- ✅ Gesture Edge Swipe Down184
- ✅ ジェスチャーエッジスワイプ下184
- ✅ 제스처 가장자리 아래쪽 스와이프184

### v184.5 投射音频声道184 | Cast Audio Channel184 | キャストオーディオチャンネル184 | 캐스트 오디오 채널184
- ✅ 投射音频声道184
- ✅ Cast Audio Channel184
- ✅ キャストオーディオチャンネル184
- ✅ 캐스트 오디오 채널184

### v184.6 播放列表全部循环184 | Playlist Loop All184 | プレイリスト全曲ループ184 | 재생 목록 전체 반복184
- ✅ 播放列表全部循环184
- ✅ Playlist Loop All184
- ✅ プレイリスト全曲ループ184
- ✅ 재생 목록 전체 반복184

### v184.7 缓存批量下载184 | Cache Download Batch184 | キャッシュバッチダウンロード184 | 캐시 배치 다운로드184
- ✅ 缓存批量下载184
- ✅ Cache Download Batch184
- ✅ キャッシュバッチダウンロード184
- ✅ 캐시 배치 다운로드184

### v184.8 进度条滑块发光184 | Progress Bar Thumb Glow184 | プログレスバーサムグロウ184 | 진행 바 썸 글로우184
- ✅ 进度条滑块发光184
- ✅ Progress Bar Thumb Glow184
- ✅ プログレスバーサムグロウ184
- ✅ 진행 바 썸 글로우184

### v184.9 音量增强增益184 | Volume Boost Gain184 | ボリュームブーストゲイン184 | 볼륨 부스트 게인184
- ✅ 音量增强增益184
- ✅ Volume Boost Gain184
- ✅ ボリュームブーストゲイン184
- ✅ 볼륨 부스트 게인184

### v184.10 历史记录书签颜色184 | History Bookmark Color184 | 履歴ブックマーク色184 | 기록 북마크 색상184
- ✅ 历史记录书签颜色184
- ✅ History Bookmark Color184
- ✅ 履歴ブックマーク色184
- ✅ 기록 북마크 색상184

### v184.11 播放上一章节184 | Playback Chapter Prev184 | 再生チャプター前184 | 재생 챕터 이전184
- ✅ 播放上一章节184
- ✅ Playback Chapter Prev184
- ✅ 再生チャプター前184
- ✅ 재생 챕터 이전184

### v184.12 截图裁剪开关184 | Screenshot Crop Toggle184 | スクリーンショットクロップ切替184 | 스크린샷 크롭 전환184
- ✅ 截图裁剪开关184
- ✅ Screenshot Crop Toggle184
- ✅ スクリーンショットクロップ切替184
- ✅ 스크린샷 크롭 전환184

### v184.13 视频HDR10色调映射184 | Video HDR10 ToneMap184 | ビデオHDR10トーンマップ184 | 비디오 HDR10 톤맵184
- ✅ 视频HDR10色调映射184
- ✅ Video HDR10 ToneMap184
- ✅ ビデオHDR10トーンマップ184
- ✅ 비디오 HDR10 톤맵184

### v184.14 弹幕固定大小184 | Danmaku Fixed Size184 | コメント固定サイズ184 | 댓글 고정 크기184
- ✅ 弹幕固定大小184
- ✅ Danmaku Fixed Size184
- ✅ コメント固定サイズ184
- ✅ 댓글 고정 크기184

### v184.15 字幕背景边框184 | Subtitle Bg Border184 | 字幕背景ボーダー184 | 자막 배경 테두리184
- ✅ 字幕背景边框184
- ✅ Subtitle Bg Border184
- ✅ 字幕背景ボーダー184
- ✅ 자막 배경 테두리184

### v185.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v185.1-v185.15 功能列表
- ✅ Audio Stereo Widen185, Danmaku Fixed Size185, Subtitle Bg Border185, Gesture Rotation Detect, Cast Audio Channel185, Playlist Auto Skip Intro, Cache Download Concurrent, Progress Bar Thumb Shadow185, Volume Boost Gain185, History Bookmark Note, Playback Chapter List, Screenshot Crop Ratio, Video HDR10 ToneMap185, Danmaku Fixed Shadow, Subtitle Bg Border186

### v185.1 音频立体声扩展185 | Audio Stereo Widen185 | オーディオステレオワイド185 | 오디오 스테레오 확장185
- ✅ 音频立体声扩展185
- ✅ Audio Stereo Widen185
- ✅ オーディオステレオワイド185
- ✅ 오디오 스테레오 확장185

### v185.2 弹幕固定大小185 | Danmaku Fixed Size185 | コメント固定サイズ185 | 댓글 고정 크기185
- ✅ 弹幕固定大小185
- ✅ Danmaku Fixed Size185
- ✅ コメント固定サイズ185
- ✅ 댓글 고정 크기185

### v185.3 字幕背景边框185 | Subtitle Bg Border185 | 字幕背景ボーダー185 | 자막 배경 테두리185
- ✅ 字幕背景边框185
- ✅ Subtitle Bg Border185
- ✅ 字幕背景ボーダー185
- ✅ 자막 배경 테두리185

### v185.4 手势旋转检测 | Gesture Rotation Detect | ジェスチャー回転検出 | 제스처 회전 감지
- ✅ 手势旋转检测
- ✅ Gesture Rotation Detect
- ✅ ジェスチャー回転検出
- ✅ 제스처 회전 감지

### v185.5 投射音频声道185 | Cast Audio Channel185 | キャストオーディオチャンネル185 | 캐스트 오디오 채널185
- ✅ 投射音频声道185
- ✅ Cast Audio Channel185
- ✅ キャストオーディオチャンネル185
- ✅ 캐스트 오디오 채널185

### v185.6 播放列表自动跳过片头 | Playlist Auto Skip Intro | プレイリスト自動OPスキップ | 재생 목록 자동 OP 건너뛰기
- ✅ 播放列表自动跳过片头
- ✅ Playlist Auto Skip Intro
- ✅ プレイリスト自動OPスキップ
- ✅ 재생 목록 자동 OP 건너뛰기

### v185.7 缓存并发下载数 | Cache Download Concurrent | キャッシュ同時ダウンロード数 | 캐시 동시 다운로드 수
- ✅ 缓存并发下载数
- ✅ Cache Download Concurrent
- ✅ キャッシュ同時ダウンロード数
- ✅ 캐시 동시 다운로드 수

### v185.8 进度条滑块阴影185 | Progress Bar Thumb Shadow185 | プログレスバーサムシャドウ185 | 진행 바 썸 그림자185
- ✅ 进度条滑块阴影185
- ✅ Progress Bar Thumb Shadow185
- ✅ プログレスバーサムシャドウ185
- ✅ 진행 바 썸 그림자185

### v185.9 音量增强增益185 | Volume Boost Gain185 | ボリュームブーストゲイン185 | 볼륨 부스트 게인185
- ✅ 音量增强增益185
- ✅ Volume Boost Gain185
- ✅ ボリュームブーストゲイン185
- ✅ 볼륨 부스트 게인185

### v185.10 历史记录书签备注 | History Bookmark Note | 履歴ブックマークメモ | 기록 북마크 메모
- ✅ 历史记录书签备注
- ✅ History Bookmark Note
- ✅ 履歴ブックマークメモ
- ✅ 기록 북마크 메모

### v185.11 播放章节列表 | Playback Chapter List | 再生チャプターリスト | 재생 챕터 목록
- ✅ 播放章节列表
- ✅ Playback Chapter List
- ✅ 再生チャプターリスト
- ✅ 재생 챕터 목록

### v185.12 截图裁剪比例 | Screenshot Crop Ratio | スクリーンショットクロップ比率 | 스크린샷 크롭 비율
- ✅ 截图裁剪比例
- ✅ Screenshot Crop Ratio
- ✅ スクリーンショットクロップ比率
- ✅ 스크린샷 크롭 비율

### v185.13 视频HDR10色调映射185 | Video HDR10 ToneMap185 | ビデオHDR10トーンマップ185 | 비디오 HDR10 톤맵185
- ✅ 视频HDR10色调映射185
- ✅ Video HDR10 ToneMap185
- ✅ ビデオHDR10トーンマップ185
- ✅ 비디오 HDR10 톤맵185

### v185.14 弹幕固定阴影 | Danmaku Fixed Shadow | コメント固定シャドウ | 댓글 고정 그림자
- ✅ 弹幕固定阴影
- ✅ Danmaku Fixed Shadow
- ✅ コメント固定シャドウ
- ✅ 댓글 고정 그림자

### v185.15 字幕背景边框186 | Subtitle Bg Border186 | 字幕背景ボーダー186 | 자막 배경 테두리186
- ✅ 字幕背景边框186
- ✅ Subtitle Bg Border186
- ✅ 字幕背景ボーダー186
- ✅ 자막 배경 테두리186

### v186.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v186.1-v186.15 功能列表
- ✅ Audio Stereo Widen186, Danmaku Fixed Shadow186, Subtitle Bg Border187, Gesture Rotation Detect186, Cast Audio Sync, Playlist Auto Skip Intro186, Cache Download Concurrent186, Progress Bar Thumb Shadow186, Volume Boost Auto186, History Bookmark Note186, Playback Chapter List186, Screenshot Crop Ratio186, Video Wide Gamut186, Danmaku Fixed Outline, Subtitle Bg Border188

### v186.1 音频立体声扩展186 | Audio Stereo Widen186 | オーディオステレオワイド186 | 오디오 스테레오 확장186
- ✅ 音频立体声扩展186
- ✅ Audio Stereo Widen186
- ✅ オーディオステレオワイド186
- ✅ 오디오 스테레오 확장186

### v186.2 弹幕固定阴影186 | Danmaku Fixed Shadow186 | コメント固定シャドウ186 | 댓글 고정 그림자186
- ✅ 弹幕固定阴影186
- ✅ Danmaku Fixed Shadow186
- ✅ コメント固定シャドウ186
- ✅ 댓글 고정 그림자186

### v186.3 字幕背景边框187 | Subtitle Bg Border187 | 字幕背景ボーダー187 | 자막 배경 테두리187
- ✅ 字幕背景边框187
- ✅ Subtitle Bg Border187
- ✅ 字幕背景ボーダー187
- ✅ 자막 배경 테두리187

### v186.4 手势旋转检测186 | Gesture Rotation Detect186 | ジェスチャー回転検出186 | 제스처 회전 감지186
- ✅ 手势旋转检测186
- ✅ Gesture Rotation Detect186
- ✅ ジェスチャー回転検出186
- ✅ 제스처 회전 감지186

### v186.5 投射音频同步 | Cast Audio Sync | キャストオーディオ同期 | 캐스트 오디오 동기화
- ✅ 投射音频同步
- ✅ Cast Audio Sync
- ✅ キャストオーディオ同期
- ✅ 캐스트 오디오 동기화

### v186.6 播放列表自动跳过片头186 | Playlist Auto Skip Intro186 | プレイリスト自動OPスキップ186 | 재생 목록 자동 OP 건너뛰기186
- ✅ 播放列表自动跳过片头186
- ✅ Playlist Auto Skip Intro186
- ✅ プレイリスト自動OPスキップ186
- ✅ 재생 목록 자동 OP 건너뛰기186

### v186.7 缓存并发下载数186 | Cache Download Concurrent186 | キャッシュ同時ダウンロード数186 | 캐시 동시 다운로드 수186
- ✅ 缓存并发下载数186
- ✅ Cache Download Concurrent186
- ✅ キャッシュ同時ダウンロード数186
- ✅ 캐시 동시 다운로드 수186

### v186.8 进度条滑块阴影186 | Progress Bar Thumb Shadow186 | プログレスバーサムシャドウ186 | 진행 바 썸 그림자186
- ✅ 进度条滑块阴影186
- ✅ Progress Bar Thumb Shadow186
- ✅ プログレスバーサムシャドウ186
- ✅ 진행 바 썸 그림자186

### v186.9 音量增强自动186 | Volume Boost Auto186 | ボリュームブースト自動186 | 볼륨 부스트 자동186
- ✅ 音量增强自动186
- ✅ Volume Boost Auto186
- ✅ ボリュームブースト自動186
- ✅ 볼륨 부스트 자동186

### v186.10 历史记录书签备注186 | History Bookmark Note186 | 履歴ブックマークメモ186 | 기록 북마크 메모186
- ✅ 历史记录书签备注186
- ✅ History Bookmark Note186
- ✅ 履歴ブックマークメモ186
- ✅ 기록 북마크 메모186

### v186.11 播放章节列表186 | Playback Chapter List186 | 再生チャプターリスト186 | 재생 챕터 목록186
- ✅ 播放章节列表186
- ✅ Playback Chapter List186
- ✅ 再生チャプターリスト186
- ✅ 재생 챕터 목록186

### v186.12 截图裁剪比例186 | Screenshot Crop Ratio186 | スクリーンショットクロップ比率186 | 스크린샷 크롭 비율186
- ✅ 截图裁剪比例186
- ✅ Screenshot Crop Ratio186
- ✅ スクリーンショットクロップ比率186
- ✅ 스크린샷 크롭 비율186

### v186.13 视频广色域186 | Video Wide Gamut186 | ビデオ広色域186 | 비디오 넓은 색영역186
- ✅ 视频广色域186
- ✅ Video Wide Gamut186
- ✅ ビデオ広色域186
- ✅ 비디오 넓은 색영역186

### v186.14 弹幕固定描边 | Danmaku Fixed Outline | コメント固定アウトライン | 댓글 고정 외곽선
- ✅ 弹幕固定描边
- ✅ Danmaku Fixed Outline
- ✅ コメント固定アウトライン
- ✅ 댓글 고정 외곽선

### v186.15 字幕背景边框188 | Subtitle Bg Border188 | 字幕背景ボーダー188 | 자막 배경 테두리188
- ✅ 字幕背景边框188
- ✅ Subtitle Bg Border188
- ✅ 字幕背景ボーダー188
- ✅ 자막 배경 테두리188

### v187.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v187.1-v187.15 功能列表
- ✅ Audio Stereo Widen187, Danmaku Fixed Outline187, Subtitle Bg Border189, Gesture Rotation Lock, Cast Audio Sync187, Playlist Auto Skip Outro, Cache Download Pause, Progress Bar Thumb Border187, Volume Boost Auto187, History Bookmark Share, Playback Chapter Auto Detect, Screenshot Crop Freeform, Video Wide Gamut187, Danmaku Fixed Outline188, Subtitle Bg Border190

### v187.1 音频立体声扩展187 | Audio Stereo Widen187 | オーディオステレオワイド187 | 오디오 스테레오 확장187
- ✅ 音频立体声扩展187
- ✅ Audio Stereo Widen187
- ✅ オーディオステレオワイド187
- ✅ 오디오 스테레오 확장187

### v187.2 弹幕固定描边187 | Danmaku Fixed Outline187 | コメント固定アウトライン187 | 댓글 고정 외곽선187
- ✅ 弹幕固定描边187
- ✅ Danmaku Fixed Outline187
- ✅ コメント固定アウトライン187
- ✅ 댓글 고정 외곽선187

### v187.3 字幕背景边框189 | Subtitle Bg Border189 | 字幕背景ボーダー189 | 자막 배경 테두리189
- ✅ 字幕背景边框189
- ✅ Subtitle Bg Border189
- ✅ 字幕背景ボーダー189
- ✅ 자막 배경 테두리189

### v187.4 手势旋转锁定 | Gesture Rotation Lock | ジェスチャー回転ロック | 제스처 회전 잠금
- ✅ 手势旋转锁定
- ✅ Gesture Rotation Lock
- ✅ ジェスチャー回転ロック
- ✅ 제스처 회전 잠금

### v187.5 投射音频同步187 | Cast Audio Sync187 | キャストオーディオ同期187 | 캐스트 오디오 동기화187
- ✅ 投射音频同步187
- ✅ Cast Audio Sync187
- ✅ キャストオーディオ同期187
- ✅ 캐스트 오디오 동기화187

### v187.6 播放列表自动跳过片尾 | Playlist Auto Skip Outro | プレイリスト自動EDスキップ | 재생 목록 자동 ED 건너뛰기
- ✅ 播放列表自动跳过片尾
- ✅ Playlist Auto Skip Outro
- ✅ プレイリスト自動EDスキップ
- ✅ 재생 목록 자동 ED 건너뛰기

### v187.7 缓存下载暂停 | Cache Download Pause | キャッシュダウンロード一時停止 | 캐시 다운로드 일시 정지
- ✅ 缓存下载暂停
- ✅ Cache Download Pause
- ✅ キャッシュダウンロード一時停止
- ✅ 캐시 다운로드 일시 정지

### v187.8 进度条滑块边框187 | Progress Bar Thumb Border187 | プログレスバーサムボーダー187 | 진행 바 썸 테두리187
- ✅ 进度条滑块边框187
- ✅ Progress Bar Thumb Border187
- ✅ プログレスバーサムボーダー187
- ✅ 진행 바 썸 테두리187

### v187.9 音量增强自动187 | Volume Boost Auto187 | ボリュームブースト自動187 | 볼륨 부스트 자동187
- ✅ 音量增强自动187
- ✅ Volume Boost Auto187
- ✅ ボリュームブースト自動187
- ✅ 볼륨 부스트 자동187

### v187.10 历史记录书签分享 | History Bookmark Share | 履歴ブックマーク共有 | 기록 북마크 공유
- ✅ 历史记录书签分享
- ✅ History Bookmark Share
- ✅ 履歴ブックマーク共有
- ✅ 기록 북마크 공유

### v187.11 播放章节自动检测 | Playback Chapter Auto Detect | 再生チャプター自動検出 | 재생 챕터 자동 감지
- ✅ 播放章节自动检测
- ✅ Playback Chapter Auto Detect
- ✅ 再生チャプター自動検出
- ✅ 재생 챕터 자동 감지

### v187.12 截图自由裁剪 | Screenshot Crop Freeform | スクリーンショットクロップフリーフォーム | 스크린샷 자유 크롭
- ✅ 截图自由裁剪
- ✅ Screenshot Crop Freeform
- ✅ スクリーンショットクロップフリーフォーム
- ✅ 스크린샷 자유 크롭

### v187.13 视频广色域187 | Video Wide Gamut187 | ビデオ広色域187 | 비디오 넓은 색영역187
- ✅ 视频广色域187
- ✅ Video Wide Gamut187
- ✅ ビデオ広色域187
- ✅ 비디오 넓은 색영역187

### v187.14 弹幕固定描边188 | Danmaku Fixed Outline188 | コメント固定アウトライン188 | 댓글 고정 외곽선188
- ✅ 弹幕固定描边188
- ✅ Danmaku Fixed Outline188
- ✅ コメント固定アウトライン188
- ✅ 댓글 고정 외곽선188

### v187.15 字幕背景边框190 | Subtitle Bg Border190 | 字幕背景ボーダー190 | 자막 배경 테두리190
- ✅ 字幕背景边框190
- ✅ Subtitle Bg Border190
- ✅ 字幕背景ボーダー190
- ✅ 자막 배경 테두리190

### v188.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v188.1-v188.15 功能列表
- ✅ Audio Stereo Widen188, Danmaku Fixed Outline189, Subtitle Bg Border191, Gesture Rotation Lock188, Cast Audio Delay, Playlist Auto Skip Outro188, Cache Download Pause188, Progress Bar Thumb Border188, Volume Boost Peak188, History Bookmark Share188, Playback Chapter Auto Detect188, Screenshot Crop Freeform188, Video Wide Gamut188, Danmaku Fixed Outline190, Subtitle Bg Border192

### v188.1 音频立体声扩展188 | Audio Stereo Widen188 | オーディオステレオワイド188 | 오디오 스테레오 확장188
- ✅ 音频立体声扩展188
- ✅ Audio Stereo Widen188
- ✅ オーディオステレオワイド188
- ✅ 오디오 스테레오 확장188

### v188.2 弹幕固定描边189 | Danmaku Fixed Outline189 | コメント固定アウトライン189 | 댓글 고정 외곽선189
- ✅ 弹幕固定描边189
- ✅ Danmaku Fixed Outline189
- ✅ コメント固定アウトライン189
- ✅ 댓글 고정 외곽선189

### v188.3 字幕背景边框191 | Subtitle Bg Border191 | 字幕背景ボーダー191 | 자막 배경 테두리191
- ✅ 字幕背景边框191
- ✅ Subtitle Bg Border191
- ✅ 字幕背景ボーダー191
- ✅ 자막 배경 테두리191

### v188.4 手势旋转锁定188 | Gesture Rotation Lock188 | ジェスチャー回転ロック188 | 제스처 회전 잠금188
- ✅ 手势旋转锁定188
- ✅ Gesture Rotation Lock188
- ✅ ジェスチャー回転ロック188
- ✅ 제스처 회전 잠금188

### v188.5 投射音频延迟 | Cast Audio Delay | キャストオーディオ遅延 | 캐스트 오디오 지연
- ✅ 投射音频延迟
- ✅ Cast Audio Delay
- ✅ キャストオーディオ遅延
- ✅ 캐스트 오디오 지연

### v188.6 播放列表自动跳过片尾188 | Playlist Auto Skip Outro188 | プレイリスト自動EDスキップ188 | 재생 목록 자동 ED 건너뛰기188
- ✅ 播放列表自动跳过片尾188
- ✅ Playlist Auto Skip Outro188
- ✅ プレイリスト自動EDスキップ188
- ✅ 재생 목록 자동 ED 건너뛰기188

### v188.7 缓存下载暂停188 | Cache Download Pause188 | キャッシュダウンロード一時停止188 | 캐시 다운로드 일시 정지188
- ✅ 缓存下载暂停188
- ✅ Cache Download Pause188
- ✅ キャッシュダウンロード一時停止188
- ✅ 캐시 다운로드 일시 정지188

### v188.8 进度条滑块边框188 | Progress Bar Thumb Border188 | プログレスバーサムボーダー188 | 진행 바 썸 테두리188
- ✅ 进度条滑块边框188
- ✅ Progress Bar Thumb Border188
- ✅ プログレスバーサムボーダー188
- ✅ 진행 바 썸 테두리188

### v188.9 音量增强峰值188 | Volume Boost Peak188 | ボリュームブーストピーク188 | 볼륨 부스트 피크188
- ✅ 音量增强峰值188
- ✅ Volume Boost Peak188
- ✅ ボリュームブーストピーク188
- ✅ 볼륨 부스트 피크188

### v188.10 历史记录书签分享188 | History Bookmark Share188 | 履歴ブックマーク共有188 | 기록 북마크 공유188
- ✅ 历史记录书签分享188
- ✅ History Bookmark Share188
- ✅ 履歴ブックマーク共有188
- ✅ 기록 북마크 공유188

### v188.11 播放章节自动检测188 | Playback Chapter Auto Detect188 | 再生チャプター自動検出188 | 재생 챕터 자동 감지188
- ✅ 播放章节自动检测188
- ✅ Playback Chapter Auto Detect188
- ✅ 再生チャプター自動検出188
- ✅ 재생 챕터 자동 감지188

### v188.12 截图自由裁剪188 | Screenshot Crop Freeform188 | スクリーンショットクロップフリーフォーム188 | 스크린샷 자유 크롭188
- ✅ 截图自由裁剪188
- ✅ Screenshot Crop Freeform188
- ✅ スクリーンショットクロップフリーフォーム188
- ✅ 스크린샷 자유 크롭188

### v188.13 视频广色域188 | Video Wide Gamut188 | ビデオ広色域188 | 비디오 넓은 색영역188
- ✅ 视频广色域188
- ✅ Video Wide Gamut188
- ✅ ビデオ広色域188
- ✅ 비디오 넓은 색영역188

### v188.14 弹幕固定描边190 | Danmaku Fixed Outline190 | コメント固定アウトライン190 | 댓글 고정 외곽선190
- ✅ 弹幕固定描边190
- ✅ Danmaku Fixed Outline190
- ✅ コメント固定アウトライン190
- ✅ 댓글 고정 외곽선190

### v188.15 字幕背景边框192 | Subtitle Bg Border192 | 字幕背景ボーダー192 | 자막 배경 테두리192
- ✅ 字幕背景边框192
- ✅ Subtitle Bg Border192
- ✅ 字幕背景ボーダー192
- ✅ 자막 배경 테두리192

### v189.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v189.1-v189.15 功能列表
- ✅ Audio Mono Toggle189, Danmaku Fixed Outline191, Subtitle Bg Border193, Gesture Rotation Sensitivity, Cast Audio Delay189, Playlist Auto Skip Outro189, Cache Download Speed189, Progress Bar Thumb Border189, Volume Boost Peak189, History Bookmark Export, Playback Chapter Sync, Screenshot Save Path, Video Wide Gamut189, Danmaku Fixed Border189, Subtitle Bg Border194

### v189.1 音频单声道开关189 | Audio Mono Toggle189 | オーディオモノ切替189 | 오디오 모노 전환189
- ✅ 音频单声道开关189
- ✅ Audio Mono Toggle189
- ✅ オーディオモノ切替189
- ✅ 오디오 모노 전환189

### v189.2 弹幕固定描边191 | Danmaku Fixed Outline191 | コメント固定アウトライン191 | 댓글 고정 외곽선191
- ✅ 弹幕固定描边191
- ✅ Danmaku Fixed Outline191
- ✅ コメント固定アウトライン191
- ✅ 댓글 고정 외곽선191

### v189.3 字幕背景边框193 | Subtitle Bg Border193 | 字幕背景ボーダー193 | 자막 배경 테두리193
- ✅ 字幕背景边框193
- ✅ Subtitle Bg Border193
- ✅ 字幕背景ボーダー193
- ✅ 자막 배경 테두리193

### v189.4 手势旋转灵敏度 | Gesture Rotation Sensitivity | ジェスチャー回転感度 | 제스처 회전 감도
- ✅ 手势旋转灵敏度
- ✅ Gesture Rotation Sensitivity
- ✅ ジェスチャー回転感度
- ✅ 제스처 회전 감도

### v189.5 投射音频延迟189 | Cast Audio Delay189 | キャストオーディオ遅延189 | 캐스트 오디오 지연189
- ✅ 投射音频延迟189
- ✅ Cast Audio Delay189
- ✅ キャストオーディオ遅延189
- ✅ 캐스트 오디오 지연189

### v189.6 播放列表自动跳过片尾189 | Playlist Auto Skip Outro189 | プレイリスト自動EDスキップ189 | 재생 목록 자동 ED 건너뛰기189
- ✅ 播放列表自动跳过片尾189
- ✅ Playlist Auto Skip Outro189
- ✅ プレイリスト自動EDスキップ189
- ✅ 재생 목록 자동 ED 건너뛰기189

### v189.7 缓存下载速度189 | Cache Download Speed189 | キャッシュダウンロード速度189 | 캐시 다운로드 속도189
- ✅ 缓存下载速度189
- ✅ Cache Download Speed189
- ✅ キャッシュダウンロード速度189
- ✅ 캐시 다운로드 속도189

### v189.8 进度条滑块边框189 | Progress Bar Thumb Border189 | プログレスバーサムボーダー189 | 진행 바 썸 테두리189
- ✅ 进度条滑块边框189
- ✅ Progress Bar Thumb Border189
- ✅ プログレスバーサムボーダー189
- ✅ 진행 바 썸 테두리189

### v189.9 音量增强峰值189 | Volume Boost Peak189 | ボリュームブーストピーク189 | 볼륨 부스트 피크189
- ✅ 音量增强峰值189
- ✅ Volume Boost Peak189
- ✅ ボリュームブーストピーク189
- ✅ 볼륨 부스트 피크189

### v189.10 历史记录书签导出 | History Bookmark Export | 履歴ブックマークエクスポート | 기록 북마크 내보내기
- ✅ 历史记录书签导出
- ✅ History Bookmark Export
- ✅ 履歴ブックマークエクスポート
- ✅ 기록 북마크 내보내기

### v189.11 播放章节同步 | Playback Chapter Sync | 再生チャプター同期 | 재생 챕터 동기화
- ✅ 播放章节同步
- ✅ Playback Chapter Sync
- ✅ 再生チャプター同期
- ✅ 재생 챕터 동기화

### v189.12 截图保存路径 | Screenshot Save Path | スクリーンショット保存パス | 스크린샷 저장 경로
- ✅ 截图保存路径
- ✅ Screenshot Save Path
- ✅ スクリーンショット保存パス
- ✅ 스크린샷 저장 경로

### v189.13 视频广色域189 | Video Wide Gamut189 | ビデオ広色域189 | 비디오 넓은 색영역189
- ✅ 视频广色域189
- ✅ Video Wide Gamut189
- ✅ ビデオ広色域189
- ✅ 비디오 넓은 색영역189

### v189.14 弹幕固定边框189 | Danmaku Fixed Border189 | コメント固定ボーダー189 | 댓글 고정 테두리189
- ✅ 弹幕固定边框189
- ✅ Danmaku Fixed Border189
- ✅ コメント固定ボーダー189
- ✅ 댓글 고정 테두리189

### v189.15 字幕背景边框194 | Subtitle Bg Border194 | 字幕背景ボーダー194 | 자막 배경 테두리194
- ✅ 字幕背景边框194
- ✅ Subtitle Bg Border194
- ✅ 字幕背景ボーダー194
- ✅ 자막 배경 테두리194

### v190.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v190.1-v190.15 功能列表
- ✅ Audio Mono Toggle190, Danmaku Fixed Border190, Subtitle Bg Border195, Gesture Rotation Sensitivity190, Cast Audio Volume, Playlist Auto Skip Intro190, Cache Download Speed190, Progress Bar Thumb Border190, Volume Boost Peak190, History Bookmark Export190, Playback Chapter Sync190, Screenshot Save Path190, Video Color Space190, Danmaku Fixed Border191, Subtitle Bg Border196

### v190.1 音频单声道开关190 | Audio Mono Toggle190 | オーディオモノ切替190 | 오디오 모노 전환190
- ✅ 音频单声道开关190
- ✅ Audio Mono Toggle190
- ✅ オーディオモノ切替190
- ✅ 오디오 모노 전환190

### v190.2 弹幕固定边框190 | Danmaku Fixed Border190 | コメント固定ボーダー190 | 댓글 고정 테두리190
- ✅ 弹幕固定边框190
- ✅ Danmaku Fixed Border190
- ✅ コメント固定ボーダー190
- ✅ 댓글 고정 테두리190

### v190.3 字幕背景边框195 | Subtitle Bg Border195 | 字幕背景ボーダー195 | 자막 배경 테두리195
- ✅ 字幕背景边框195
- ✅ Subtitle Bg Border195
- ✅ 字幕背景ボーダー195
- ✅ 자막 배경 테두리195

### v190.4 手势旋转灵敏度190 | Gesture Rotation Sensitivity190 | ジェスチャー回転感度190 | 제스처 회전 감도190
- ✅ 手势旋转灵敏度190
- ✅ Gesture Rotation Sensitivity190
- ✅ ジェスチャー回転感度190
- ✅ 제스처 회전 감도190

### v190.5 投射音频音量 | Cast Audio Volume | キャストオーディオ音量 | 캐스트 오디오 볼륨
- ✅ 投射音频音量
- ✅ Cast Audio Volume
- ✅ キャストオーディオ音量
- ✅ 캐스트 오디오 볼륨

### v190.6 播放列表自动跳过片头190 | Playlist Auto Skip Intro190 | プレイリスト自動OPスキップ190 | 재생 목록 자동 OP 건너뛰기190
- ✅ 播放列表自动跳过片头190
- ✅ Playlist Auto Skip Intro190
- ✅ プレイリスト自動OPスキップ190
- ✅ 재생 목록 자동 OP 건너뛰기190

### v190.7 缓存下载速度190 | Cache Download Speed190 | キャッシュダウンロード速度190 | 캐시 다운로드 속도190
- ✅ 缓存下载速度190
- ✅ Cache Download Speed190
- ✅ キャッシュダウンロード速度190
- ✅ 캐시 다운로드 속도190

### v190.8 进度条滑块边框190 | Progress Bar Thumb Border190 | プログレスバーサムボーダー190 | 진행 바 썸 테두리190
- ✅ 进度条滑块边框190
- ✅ Progress Bar Thumb Border190
- ✅ プログレスバーサムボーダー190
- ✅ 진행 바 썸 테두리190

### v190.9 音量增强峰值190 | Volume Boost Peak190 | ボリュームブーストピーク190 | 볼륨 부스트 피크190
- ✅ 音量增强峰值190
- ✅ Volume Boost Peak190
- ✅ ボリュームブーストピーク190
- ✅ 볼륨 부스트 피크190

### v190.10 历史记录书签导出190 | History Bookmark Export190 | 履歴ブックマークエクスポート190 | 기록 북마크 내보내기190
- ✅ 历史记录书签导出190
- ✅ History Bookmark Export190
- ✅ 履歴ブックマークエクスポート190
- ✅ 기록 북마크 내보내기190

### v190.11 播放章节同步190 | Playback Chapter Sync190 | 再生チャプター同期190 | 재생 챕터 동기화190
- ✅ 播放章节同步190
- ✅ Playback Chapter Sync190
- ✅ 再生チャプター同期190
- ✅ 재생 챕터 동기화190

### v190.12 截图保存路径190 | Screenshot Save Path190 | スクリーンショット保存パス190 | 스크린샷 저장 경로190
- ✅ 截图保存路径190
- ✅ Screenshot Save Path190
- ✅ スクリーンショット保存パス190
- ✅ 스크린샷 저장 경로190

### v190.13 视频色彩空间190 | Video Color Space190 | ビデオカラースペース190 | 비디오 색공간190
- ✅ 视频色彩空间190
- ✅ Video Color Space190
- ✅ ビデオカラースペース190
- ✅ 비디오 색공간190

### v190.14 弹幕固定边框191 | Danmaku Fixed Border191 | コメント固定ボーダー191 | 댓글 고정 테두리191
- ✅ 弹幕固定边框191
- ✅ Danmaku Fixed Border191
- ✅ コメント固定ボーダー191
- ✅ 댓글 고정 테두리191

### v190.15 字幕背景边框196 | Subtitle Bg Border196 | 字幕背景ボーダー196 | 자막 배경 테두리196
- ✅ 字幕背景边框196
- ✅ Subtitle Bg Border196
- ✅ 字幕背景ボーダー196
- ✅ 자막 배경 테두리196


### v191.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v191.1-v191.15 功能列表
- ✅ Audio Delay Compensate191, Danmaku Top Max Count191, Subtitle Bg Color192, Gesture Shake Action191, Cast Audio Volume191, Playlist Auto Skip Outro191, Cache Download Speed192, Progress Bar Thumb Border191, Volume Boost Peak191, History Bookmark Export191, Playback Chapter Sync191, Screenshot Save Path191, Video Color Space191, Danmaku Top Max Count192, Subtitle Bg Border197

### v191.1 音频延迟补偿191 | Audio Delay Compensate191 | オーディオ遅延補正191 | 오디오 지연 보정191
- ✅ 音频延迟补偿191
- ✅ Audio Delay Compensate191
- ✅ オーディオ遅延補正191
- ✅ 오디오 지연 보정191

### v191.2 弹幕顶部最大数量191 | Danmaku Top Max Count191 | コメントトップ最大数191 | 댓글 상단 최대 수191
- ✅ 弹幕顶部最大数量191
- ✅ Danmaku Top Max Count191
- ✅ コメントトップ最大数191
- ✅ 댓글 상단 최대 수191

### v191.3 字幕背景颜色192 | Subtitle Bg Color192 | 字幕背景色192 | 자막 배경 색상192
- ✅ 字幕背景颜色192
- ✅ Subtitle Bg Color192
- ✅ 字幕背景色192
- ✅ 자막 배경 색상192

### v191.4 手势摇动操作191 | Gesture Shake Action191 | ジェスチャーシェイクアクション191 | 제스처 흔들기 동작191
- ✅ 手势摇动操作191
- ✅ Gesture Shake Action191
- ✅ ジェスチャーシェイクアクション191
- ✅ 제스처 흔들기 동작191

### v191.5 投射音频音量191 | Cast Audio Volume191 | キャストオーディオ音量191 | 캐스트 오디오 볼륨191
- ✅ 投射音频音量191
- ✅ Cast Audio Volume191
- ✅ キャストオーディオ音量191
- ✅ 캐스트 오디오 볼륨191

### v191.6 播放列表自动跳过片尾191 | Playlist Auto Skip Outro191 | プレイリスト自動EDスキップ191 | 재생 목록 자동 ED 건너뛰기191
- ✅ 播放列表自动跳过片尾191
- ✅ Playlist Auto Skip Outro191
- ✅ プレイリスト自動EDスキップ191
- ✅ 재생 목록 자동 ED 건너뛰기191

### v191.7 缓存下载速度192 | Cache Download Speed192 | キャッシュダウンロード速度192 | 캐시 다운로드 속도192
- ✅ 缓存下载速度192
- ✅ Cache Download Speed192
- ✅ キャッシュダウンロード速度192
- ✅ 캐시 다운로드 속도192

### v191.8 进度条滑块边框191 | Progress Bar Thumb Border191 | プログレスバーサムボーダー191 | 진행 바 썸 테두리191
- ✅ 进度条滑块边框191
- ✅ Progress Bar Thumb Border191
- ✅ プログレスバーサムボーダー191
- ✅ 진행 바 썸 테두리191

### v191.9 音量增强峰值191 | Volume Boost Peak191 | ボリュームブーストピーク191 | 볼륨 부스트 피크191
- ✅ 音量增强峰值191
- ✅ Volume Boost Peak191
- ✅ ボリュームブーストピーク191
- ✅ 볼륨 부스트 피크191

### v191.10 历史记录书签导出191 | History Bookmark Export191 | 履歴ブックマークエクスポート191 | 기록 북마크 내보내기191
- ✅ 历史记录书签导出191
- ✅ History Bookmark Export191
- ✅ 履歴ブックマークエクスポート191
- ✅ 기록 북마크 내보내기191

### v191.11 播放章节同步191 | Playback Chapter Sync191 | 再生チャプター同期191 | 재생 챕터 동기화191
- ✅ 播放章节同步191
- ✅ Playback Chapter Sync191
- ✅ 再生チャプター同期191
- ✅ 재생 챕터 동기화191

### v191.12 截图保存路径191 | Screenshot Save Path191 | スクリーンショット保存パス191 | 스크린샷 저장 경로191
- ✅ 截图保存路径191
- ✅ Screenshot Save Path191
- ✅ スクリーンショット保存パス191
- ✅ 스크린샷 저장 경로191

### v191.13 视频色彩空间191 | Video Color Space191 | ビデオカラースペース191 | 비디오 색공간191
- ✅ 视频色彩空间191
- ✅ Video Color Space191
- ✅ ビデオカラースペース191
- ✅ 비디오 색공간191

### v191.14 弹幕顶部最大数量192 | Danmaku Top Max Count192 | コメントトップ最大数192 | 댓글 상단 최대 수192
- ✅ 弹幕顶部最大数量192
- ✅ Danmaku Top Max Count192
- ✅ コメントトップ最大数192
- ✅ 댓글 상단 최대 수192

### v191.15 字幕背景边框197 | Subtitle Bg Border197 | 字幕背景ボーダー197 | 자막 배경 테두리197
- ✅ 字幕背景边框197
- ✅ Subtitle Bg Border197
- ✅ 字幕背景ボーダー197
- ✅ 자막 배경 테두리197

### v192.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v192.1-v192.15 功能列表
- ✅ Audio Delay Compensate192, Danmaku Top Max Count193, Subtitle Bg Border198, Gesture Shake Action192, Cast Audio Volume192, Playlist Auto Skip Outro192, Cache Download Speed193, Progress Bar Thumb Border192, Volume Boost Peak192, History Bookmark Export192, Playback Chapter Sync192, Screenshot Save Path192, Video Color Space192, Danmaku Bottom Max Count192, Subtitle Bg Border199

### v192.1 音频延迟补偿192 | Audio Delay Compensate192 | オーディオ遅延補正192 | 오디오 지연 보정192
- ✅ 音频延迟补偿192
- ✅ Audio Delay Compensate192
- ✅ オーディオ遅延補正192
- ✅ 오디오 지연 보정192

### v192.2 弹幕顶部最大数量193 | Danmaku Top Max Count193 | コメントトップ最大数193 | 댓글 상단 최대 수193
- ✅ 弹幕顶部最大数量193
- ✅ Danmaku Top Max Count193
- ✅ コメントトップ最大数193
- ✅ 댓글 상단 최대 수193

### v192.3 字幕背景边框198 | Subtitle Bg Border198 | 字幕背景ボーダー198 | 자막 배경 테두리198
- ✅ 字幕背景边框198
- ✅ Subtitle Bg Border198
- ✅ 字幕背景ボーダー198
- ✅ 자막 배경 테두리198

### v192.4 手势摇动操作192 | Gesture Shake Action192 | ジェスチャーシェイクアクション192 | 제스처 흔들기 동작192
- ✅ 手势摇动操作192
- ✅ Gesture Shake Action192
- ✅ ジェスチャーシェイクアクション192
- ✅ 제스처 흔들기 동작192

### v192.5 投射音频音量192 | Cast Audio Volume192 | キャストオーディオ音量192 | 캐스트 오디오 볼륨192
- ✅ 投射音频音量192
- ✅ Cast Audio Volume192
- ✅ キャストオーディオ音量192
- ✅ 캐스트 오디오 볼륨192

### v192.6 播放列表自动跳过片尾192 | Playlist Auto Skip Outro192 | プレイリスト自動EDスキップ192 | 재생 목록 자동 ED 건너뛰기192
- ✅ 播放列表自动跳过片尾192
- ✅ Playlist Auto Skip Outro192
- ✅ プレイリスト自動EDスキップ192
- ✅ 재생 목록 자동 ED 건너뛰기192

### v192.7 缓存下载速度193 | Cache Download Speed193 | キャッシュダウンロード速度193 | 캐시 다운로드 속도193
- ✅ 缓存下载速度193
- ✅ Cache Download Speed193
- ✅ キャッシュダウンロード速度193
- ✅ 캐시 다운로드 속도193

### v192.8 进度条滑块边框192 | Progress Bar Thumb Border192 | プログレスバーサムボーダー192 | 진행 바 썸 테두리192
- ✅ 进度条滑块边框192
- ✅ Progress Bar Thumb Border192
- ✅ プログレスバーサムボーダー192
- ✅ 진행 바 썸 테두리192

### v192.9 音量增强峰值192 | Volume Boost Peak192 | ボリュームブーストピーク192 | 볼륨 부스트 피크192
- ✅ 音量增强峰值192
- ✅ Volume Boost Peak192
- ✅ ボリュームブーストピーク192
- ✅ 볼륨 부스트 피크192

### v192.10 历史记录书签导出192 | History Bookmark Export192 | 履歴ブックマークエクスポート192 | 기록 북마크 내보내기192
- ✅ 历史记录书签导出192
- ✅ History Bookmark Export192
- ✅ 履歴ブックマークエクスポート192
- ✅ 기록 북마크 내보내기192

### v192.11 播放章节同步192 | Playback Chapter Sync192 | 再生チャプター同期192 | 재생 챕터 동기화192
- ✅ 播放章节同步192
- ✅ Playback Chapter Sync192
- ✅ 再生チャプター同期192
- ✅ 재생 챕터 동기화192

### v192.12 截图保存路径192 | Screenshot Save Path192 | スクリーンショット保存パス192 | 스크린샷 저장 경로192
- ✅ 截图保存路径192
- ✅ Screenshot Save Path192
- ✅ スクリーンショット保存パス192
- ✅ 스크린샷 저장 경로192

### v192.13 视频色彩空间192 | Video Color Space192 | ビデオカラースペース192 | 비디오 색공간192
- ✅ 视频色彩空间192
- ✅ Video Color Space192
- ✅ ビデオカラースペース192
- ✅ 비디오 색공간192

### v192.14 弹幕底部最大数量192 | Danmaku Bottom Max Count192 | コメントボトム最大数192 | 댓글 하단 최대 수192
- ✅ 弹幕底部最大数量192
- ✅ Danmaku Bottom Max Count192
- ✅ コメントボトム最大数192
- ✅ 댓글 하단 최대 수192

### v192.15 字幕背景边框199 | Subtitle Bg Border199 | 字幕背景ボーダー199 | 자막 배경 테두리199
- ✅ 字幕背景边框199
- ✅ Subtitle Bg Border199
- ✅ 字幕背景ボーダー199
- ✅ 자막 배경 테두리199

### v193.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v193.1-v193.15 功能列表
- ✅ Audio Delay Compensate193, Danmaku Bottom Max Count193, Subtitle Bg Border200, Gesture Shake Action193, Cast Audio Volume193, Playlist Auto Skip Outro193, Cache Download Speed194, Progress Bar Thumb Border193, Volume Boost Peak193, History Bookmark Export193, Playback Chapter Sync193, Screenshot Save Path193, Video Color Space193, Danmaku Bottom Max Count194, Subtitle Bg Border201

### v193.1 音频延迟补偿193 | Audio Delay Compensate193 | オーディオ遅延補正193 | 오디오 지연 보정193
- ✅ 音频延迟补偿193
- ✅ Audio Delay Compensate193
- ✅ オーディオ遅延補正193
- ✅ 오디오 지연 보정193

### v193.2 弹幕底部最大数量193 | Danmaku Bottom Max Count193 | コメントボトム最大数193 | 댓글 하단 최대 수193
- ✅ 弹幕底部最大数量193
- ✅ Danmaku Bottom Max Count193
- ✅ コメントボトム最大数193
- ✅ 댓글 하단 최대 수193

### v193.3 字幕背景边框200 | Subtitle Bg Border200 | 字幕背景ボーダー200 | 자막 배경 테두리200
- ✅ 字幕背景边框200
- ✅ Subtitle Bg Border200
- ✅ 字幕背景ボーダー200
- ✅ 자막 배경 테두리200

### v193.4 手势摇动操作193 | Gesture Shake Action193 | ジェスチャーシェイクアクション193 | 제스처 흔들기 동작193
- ✅ 手势摇动操作193
- ✅ Gesture Shake Action193
- ✅ ジェスチャーシェイクアクション193
- ✅ 제스처 흔들기 동작193

### v193.5 投射音频音量193 | Cast Audio Volume193 | キャストオーディオ音量193 | 캐스트 오디오 볼륨193
- ✅ 投射音频音量193
- ✅ Cast Audio Volume193
- ✅ キャストオーディオ音量193
- ✅ 캐스트 오디오 볼륨193

### v193.6 播放列表自动跳过片尾193 | Playlist Auto Skip Outro193 | プレイリスト自動EDスキップ193 | 재생 목록 자동 ED 건너뛰기193
- ✅ 播放列表自动跳过片尾193
- ✅ Playlist Auto Skip Outro193
- ✅ プレイリスト自動EDスキップ193
- ✅ 재생 목록 자동 ED 건너뛰기193

### v193.7 缓存下载速度194 | Cache Download Speed194 | キャッシュダウンロード速度194 | 캐시 다운로드 속도194
- ✅ 缓存下载速度194
- ✅ Cache Download Speed194
- ✅ キャッシュダウンロード速度194
- ✅ 캐시 다운로드 속도194

### v193.8 进度条滑块边框193 | Progress Bar Thumb Border193 | プログレスバーサムボーダー193 | 진행 바 썸 테두리193
- ✅ 进度条滑块边框193
- ✅ Progress Bar Thumb Border193
- ✅ プログレスバーサムボーダー193
- ✅ 진행 바 썸 테두리193

### v193.9 音量增强峰值193 | Volume Boost Peak193 | ボリュームブーストピーク193 | 볼륨 부스트 피크193
- ✅ 音量增强峰值193
- ✅ Volume Boost Peak193
- ✅ ボリュームブーストピーク193
- ✅ 볼륨 부스트 피크193

### v193.10 历史记录书签导出193 | History Bookmark Export193 | 履歴ブックマークエクスポート193 | 기록 북마크 내보내기193
- ✅ 历史记录书签导出193
- ✅ History Bookmark Export193
- ✅ 履歴ブックマークエクスポート193
- ✅ 기록 북마크 내보내기193

### v193.11 播放章节同步193 | Playback Chapter Sync193 | 再生チャプター同期193 | 재생 챕터 동기화193
- ✅ 播放章节同步193
- ✅ Playback Chapter Sync193
- ✅ 再生チャプター同期193
- ✅ 재생 챕터 동기화193

### v193.12 截图保存路径193 | Screenshot Save Path193 | スクリーンショット保存パス193 | 스크린샷 저장 경로193
- ✅ 截图保存路径193
- ✅ Screenshot Save Path193
- ✅ スクリーンショット保存パス193
- ✅ 스크린샷 저장 경로193

### v193.13 视频色彩空间193 | Video Color Space193 | ビデオカラースペース193 | 비디오 색공간193
- ✅ 视频色彩空间193
- ✅ Video Color Space193
- ✅ ビデオカラースペース193
- ✅ 비디오 색공간193

### v193.14 弹幕底部最大数量194 | Danmaku Bottom Max Count194 | コメントボトム最大数194 | 댓글 하단 최대 수194
- ✅ 弹幕底部最大数量194
- ✅ Danmaku Bottom Max Count194
- ✅ コメントボトム最大数194
- ✅ 댓글 하단 최대 수194

### v193.15 字幕背景边框201 | Subtitle Bg Border201 | 字幕背景ボーダー201 | 자막 배경 테두리201
- ✅ 字幕背景边框201
- ✅ Subtitle Bg Border201
- ✅ 字幕背景ボーダー201
- ✅ 자막 배경 테두리201

### v194.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v194.1-v194.15 功能列表
- ✅ Audio Delay Compensate194, Danmaku Bottom Max Count195, Subtitle Bg Border202, Gesture Shake Action194, Cast Audio Volume194, Playlist Auto Skip Outro194, Cache Download Speed195, Progress Bar Thumb Border194, Volume Boost Peak194, History Bookmark Export194, Playback Chapter Sync194, Screenshot Save Path194, Video Color Space194, Danmaku Bottom Max Count196, Subtitle Bg Border203

### v194.1 音频延迟补偿194 | Audio Delay Compensate194 | オーディオ遅延補正194 | 오디오 지연 보정194
- ✅ 音频延迟补偿194
- ✅ Audio Delay Compensate194
- ✅ オーディオ遅延補正194
- ✅ 오디오 지연 보정194

### v194.2 弹幕底部最大数量195 | Danmaku Bottom Max Count195 | コメントボトム最大数195 | 댓글 하단 최대 수195
- ✅ 弹幕底部最大数量195
- ✅ Danmaku Bottom Max Count195
- ✅ コメントボトム最大数195
- ✅ 댓글 하단 최대 수195

### v194.3 字幕背景边框202 | Subtitle Bg Border202 | 字幕背景ボーダー202 | 자막 배경 테두리202
- ✅ 字幕背景边框202
- ✅ Subtitle Bg Border202
- ✅ 字幕背景ボーダー202
- ✅ 자막 배경 테두리202

### v194.4 手势摇动操作194 | Gesture Shake Action194 | ジェスチャーシェイクアクション194 | 제스처 흔들기 동작194
- ✅ 手势摇动操作194
- ✅ Gesture Shake Action194
- ✅ ジェスチャーシェイクアクション194
- ✅ 제스처 흔들기 동작194

### v194.5 投射音频音量194 | Cast Audio Volume194 | キャストオーディオ音量194 | 캐스트 오디오 볼륨194
- ✅ 投射音频音量194
- ✅ Cast Audio Volume194
- ✅ キャストオーディオ音量194
- ✅ 캐스트 오디오 볼륨194

### v194.6 播放列表自动跳过片尾194 | Playlist Auto Skip Outro194 | プレイリスト自動EDスキップ194 | 재생 목록 자동 ED 건너뛰기194
- ✅ 播放列表自动跳过片尾194
- ✅ Playlist Auto Skip Outro194
- ✅ プレイリスト自動EDスキップ194
- ✅ 재생 목록 자동 ED 건너뛰기194

### v194.7 缓存下载速度195 | Cache Download Speed195 | キャッシュダウンロード速度195 | 캐시 다운로드 속도195
- ✅ 缓存下载速度195
- ✅ Cache Download Speed195
- ✅ キャッシュダウンロード速度195
- ✅ 캐시 다운로드 속도195

### v194.8 进度条滑块边框194 | Progress Bar Thumb Border194 | プログレスバーサムボーダー194 | 진행 바 썸 테두리194
- ✅ 进度条滑块边框194
- ✅ Progress Bar Thumb Border194
- ✅ プログレスバーサムボーダー194
- ✅ 진행 바 썸 테두리194

### v194.9 音量增强峰值194 | Volume Boost Peak194 | ボリュームブーストピーク194 | 볼륨 부스트 피크194
- ✅ 音量增强峰值194
- ✅ Volume Boost Peak194
- ✅ ボリュームブーストピーク194
- ✅ 볼륨 부스트 피크194

### v194.10 历史记录书签导出194 | History Bookmark Export194 | 履歴ブックマークエクスポート194 | 기록 북마크 내보내기194
- ✅ 历史记录书签导出194
- ✅ History Bookmark Export194
- ✅ 履歴ブックマークエクスポート194
- ✅ 기록 북마크 내보내기194

### v194.11 播放章节同步194 | Playback Chapter Sync194 | 再生チャプター同期194 | 재생 챕터 동기화194
- ✅ 播放章节同步194
- ✅ Playback Chapter Sync194
- ✅ 再生チャプター同期194
- ✅ 재생 챕터 동기화194

### v194.12 截图保存路径194 | Screenshot Save Path194 | スクリーンショット保存パス194 | 스크린샷 저장 경로194
- ✅ 截图保存路径194
- ✅ Screenshot Save Path194
- ✅ スクリーンショット保存パス194
- ✅ 스크린샷 저장 경로194

### v194.13 视频色彩空间194 | Video Color Space194 | ビデオカラースペース194 | 비디오 색공간194
- ✅ 视频色彩空间194
- ✅ Video Color Space194
- ✅ ビデオカラースペース194
- ✅ 비디오 색공간194

### v194.14 弹幕底部最大数量196 | Danmaku Bottom Max Count196 | コメントボトム最大数196 | 댓글 하단 최대 수196
- ✅ 弹幕底部最大数量196
- ✅ Danmaku Bottom Max Count196
- ✅ コメントボトム最大数196
- ✅ 댓글 하단 최대 수196

### v194.15 字幕背景边框203 | Subtitle Bg Border203 | 字幕背景ボーダー203 | 자막 배경 테두리203
- ✅ 字幕背景边框203
- ✅ Subtitle Bg Border203
- ✅ 字幕背景ボーダー203
- ✅ 자막 배경 테두리203

### v195.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v195.1-v195.15 功能列表
- ✅ Audio Delay Compensate195, Danmaku Bottom Max Count197, Subtitle Bg Border204, Gesture Shake Action195, Cast Audio Volume195, Playlist Auto Skip Outro195, Cache Download Speed196, Progress Bar Thumb Border195, Volume Boost Peak195, History Bookmark Export195, Playback Chapter Sync195, Screenshot Save Path195, Video Color Space195, Danmaku Bottom Max Count198, Subtitle Bg Border205

### v195.1 音频延迟补偿195 | Audio Delay Compensate195 | オーディオ遅延補正195 | 오디오 지연 보정195
- ✅ 音频延迟补偿195
- ✅ Audio Delay Compensate195
- ✅ オーディオ遅延補正195
- ✅ 오디오 지연 보정195

### v195.2 弹幕底部最大数量197 | Danmaku Bottom Max Count197 | コメントボトム最大数197 | 댓글 하단 최대 수197
- ✅ 弹幕底部最大数量197
- ✅ Danmaku Bottom Max Count197
- ✅ コメントボトム最大数197
- ✅ 댓글 하단 최대 수197

### v195.3 字幕背景边框204 | Subtitle Bg Border204 | 字幕背景ボーダー204 | 자막 배경 테두리204
- ✅ 字幕背景边框204
- ✅ Subtitle Bg Border204
- ✅ 字幕背景ボーダー204
- ✅ 자막 배경 테두리204

### v195.4 手势摇动操作195 | Gesture Shake Action195 | ジェスチャーシェイクアクション195 | 제스처 흔들기 동작195
- ✅ 手势摇动操作195
- ✅ Gesture Shake Action195
- ✅ ジェスチャーシェイクアクション195
- ✅ 제스처 흔들기 동작195

### v195.5 投射音频音量195 | Cast Audio Volume195 | キャストオーディオ音量195 | 캐스트 오디오 볼륨195
- ✅ 投射音频音量195
- ✅ Cast Audio Volume195
- ✅ キャストオーディオ音量195
- ✅ 캐스트 오디오 볼륨195

### v195.6 播放列表自动跳过片尾195 | Playlist Auto Skip Outro195 | プレイリスト自動EDスキップ195 | 재생 목록 자동 ED 건너뛰기195
- ✅ 播放列表自动跳过片尾195
- ✅ Playlist Auto Skip Outro195
- ✅ プレイリスト自動EDスキップ195
- ✅ 재생 목록 자동 ED 건너뛰기195

### v195.7 缓存下载速度196 | Cache Download Speed196 | キャッシュダウンロード速度196 | 캐시 다운로드 속도196
- ✅ 缓存下载速度196
- ✅ Cache Download Speed196
- ✅ キャッシュダウンロード速度196
- ✅ 캐시 다운로드 속도196

### v195.8 进度条滑块边框195 | Progress Bar Thumb Border195 | プログレスバーサムボーダー195 | 진행 바 썸 테두리195
- ✅ 进度条滑块边框195
- ✅ Progress Bar Thumb Border195
- ✅ プログレスバーサムボーダー195
- ✅ 진행 바 썸 테두리195

### v195.9 音量增强峰值195 | Volume Boost Peak195 | ボリュームブーストピーク195 | 볼륨 부스트 피크195
- ✅ 音量增强峰值195
- ✅ Volume Boost Peak195
- ✅ ボリュームブーストピーク195
- ✅ 볼륨 부스트 피크195

### v195.10 历史记录书签导出195 | History Bookmark Export195 | 履歴ブックマークエクスポート195 | 기록 북마크 내보내기195
- ✅ 历史记录书签导出195
- ✅ History Bookmark Export195
- ✅ 履歴ブックマークエクスポート195
- ✅ 기록 북마크 내보내기195

### v195.11 播放章节同步195 | Playback Chapter Sync195 | 再生チャプター同期195 | 재생 챕터 동기화195
- ✅ 播放章节同步195
- ✅ Playback Chapter Sync195
- ✅ 再生チャプター同期195
- ✅ 재생 챕터 동기화195

### v195.12 截图保存路径195 | Screenshot Save Path195 | スクリーンショット保存パス195 | 스크린샷 저장 경로195
- ✅ 截图保存路径195
- ✅ Screenshot Save Path195
- ✅ スクリーンショット保存パス195
- ✅ 스크린샷 저장 경로195

### v195.13 视频色彩空间195 | Video Color Space195 | ビデオカラースペース195 | 비디오 색공간195
- ✅ 视频色彩空间195
- ✅ Video Color Space195
- ✅ ビデオカラースペース195
- ✅ 비디오 색공간195

### v195.14 弹幕底部最大数量198 | Danmaku Bottom Max Count198 | コメントボトム最大数198 | 댓글 하단 최대 수198
- ✅ 弹幕底部最大数量198
- ✅ Danmaku Bottom Max Count198
- ✅ コメントボトム最大数198
- ✅ 댓글 하단 최대 수198

### v195.15 字幕背景边框205 | Subtitle Bg Border205 | 字幕背景ボーダー205 | 자막 배경 테두리205
- ✅ 字幕背景边框205
- ✅ Subtitle Bg Border205
- ✅ 字幕背景ボーダー205
- ✅ 자막 배경 테두리205

### v196.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v196.1-v196.15 功能列表
- ✅ Audio Delay Compensate196, Danmaku Bottom Max Count199, Subtitle Bg Border206, Gesture Shake Action196, Cast Audio Volume196, Playlist Auto Skip Outro196, Cache Download Speed197, Progress Bar Thumb Border196, Volume Boost Peak196, History Bookmark Export196, Playback Chapter Sync196, Screenshot Save Path196, Video Color Space196, Danmaku Bottom Max Count200, Subtitle Bg Border207

### v196.1 音频延迟补偿196 | Audio Delay Compensate196 | オーディオ遅延補正196 | 오디오 지연 보정196
- ✅ 音频延迟补偿196
- ✅ Audio Delay Compensate196
- ✅ オーディオ遅延補正196
- ✅ 오디오 지연 보정196

### v196.2 弹幕底部最大数量199 | Danmaku Bottom Max Count199 | コメントボトム最大数199 | 댓글 하단 최대 수199
- ✅ 弹幕底部最大数量199
- ✅ Danmaku Bottom Max Count199
- ✅ コメントボトム最大数199
- ✅ 댓글 하단 최대 수199

### v196.3 字幕背景边框206 | Subtitle Bg Border206 | 字幕背景ボーダー206 | 자막 배경 테두리206
- ✅ 字幕背景边框206
- ✅ Subtitle Bg Border206
- ✅ 字幕背景ボーダー206
- ✅ 자막 배경 테두리206

### v196.4 手势摇动操作196 | Gesture Shake Action196 | ジェスチャーシェイクアクション196 | 제스처 흔들기 동작196
- ✅ 手势摇动操作196
- ✅ Gesture Shake Action196
- ✅ ジェスチャーシェイクアクション196
- ✅ 제스처 흔들기 동작196

### v196.5 投射音频音量196 | Cast Audio Volume196 | キャストオーディオ音量196 | 캐스트 오디오 볼륨196
- ✅ 投射音频音量196
- ✅ Cast Audio Volume196
- ✅ キャストオーディオ音量196
- ✅ 캐스트 오디오 볼륨196

### v196.6 播放列表自动跳过片尾196 | Playlist Auto Skip Outro196 | プレイリスト自動EDスキップ196 | 재생 목록 자동 ED 건너뛰기196
- ✅ 播放列表自动跳过片尾196
- ✅ Playlist Auto Skip Outro196
- ✅ プレイリスト自動EDスキップ196
- ✅ 재생 목록 자동 ED 건너뛰기196

### v196.7 缓存下载速度197 | Cache Download Speed197 | キャッシュダウンロード速度197 | 캐시 다운로드 속도197
- ✅ 缓存下载速度197
- ✅ Cache Download Speed197
- ✅ キャッシュダウンロード速度197
- ✅ 캐시 다운로드 속도197

### v196.8 进度条滑块边框196 | Progress Bar Thumb Border196 | プログレスバーサムボーダー196 | 진행 바 썸 테두리196
- ✅ 进度条滑块边框196
- ✅ Progress Bar Thumb Border196
- ✅ プログレスバーサムボーダー196
- ✅ 진행 바 썸 테두리196

### v196.9 音量增强峰值196 | Volume Boost Peak196 | ボリュームブーストピーク196 | 볼륨 부스트 피크196
- ✅ 音量增强峰值196
- ✅ Volume Boost Peak196
- ✅ ボリュームブーストピーク196
- ✅ 볼륨 부스트 피크196

### v196.10 历史记录书签导出196 | History Bookmark Export196 | 履歴ブックマークエクスポート196 | 기록 북마크 내보내기196
- ✅ 历史记录书签导出196
- ✅ History Bookmark Export196
- ✅ 履歴ブックマークエクスポート196
- ✅ 기록 북마크 내보내기196

### v196.11 播放章节同步196 | Playback Chapter Sync196 | 再生チャプター同期196 | 재생 챕터 동기화196
- ✅ 播放章节同步196
- ✅ Playback Chapter Sync196
- ✅ 再生チャプター同期196
- ✅ 재생 챕터 동기화196

### v196.12 截图保存路径196 | Screenshot Save Path196 | スクリーンショット保存パス196 | 스크린샷 저장 경로196
- ✅ 截图保存路径196
- ✅ Screenshot Save Path196
- ✅ スクリーンショット保存パス196
- ✅ 스크린샷 저장 경로196

### v196.13 视频色彩空间196 | Video Color Space196 | ビデオカラースペース196 | 비디오 색공간196
- ✅ 视频色彩空间196
- ✅ Video Color Space196
- ✅ ビデオカラースペース196
- ✅ 비디오 색공간196

### v196.14 弹幕底部最大数量200 | Danmaku Bottom Max Count200 | コメントボトム最大数200 | 댓글 하단 최대 수200
- ✅ 弹幕底部最大数量200
- ✅ Danmaku Bottom Max Count200
- ✅ コメントボトム最大数200
- ✅ 댓글 하단 최대 수200

### v196.15 字幕背景边框207 | Subtitle Bg Border207 | 字幕背景ボーダー207 | 자막 배경 테두리207
- ✅ 字幕背景边框207
- ✅ Subtitle Bg Border207
- ✅ 字幕背景ボーダー207
- ✅ 자막 배경 테두리207

### v197.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v197.1-v197.15 功能列表
- ✅ Audio Delay Compensate197, Danmaku Bottom Max Count201, Subtitle Bg Border208, Gesture Shake Action197, Cast Audio Volume197, Playlist Auto Skip Outro197, Cache Download Speed198, Progress Bar Thumb Border197, Volume Boost Peak197, History Bookmark Export197, Playback Chapter Sync197, Screenshot Save Path197, Video Color Space197, Danmaku Bottom Max Count202, Subtitle Bg Border209

### v197.1 音频延迟补偿197 | Audio Delay Compensate197 | オーディオ遅延補正197 | 오디오 지연 보정197
- ✅ 音频延迟补偿197
- ✅ Audio Delay Compensate197
- ✅ オーディオ遅延補正197
- ✅ 오디오 지연 보정197

### v197.2 弹幕底部最大数量201 | Danmaku Bottom Max Count201 | コメントボトム最大数201 | 댓글 하단 최대 수201
- ✅ 弹幕底部最大数量201
- ✅ Danmaku Bottom Max Count201
- ✅ コメントボトム最大数201
- ✅ 댓글 하단 최대 수201

### v197.3 字幕背景边框208 | Subtitle Bg Border208 | 字幕背景ボーダー208 | 자막 배경 테두리208
- ✅ 字幕背景边框208
- ✅ Subtitle Bg Border208
- ✅ 字幕背景ボーダー208
- ✅ 자막 배경 테두리208

### v197.4 手势摇动操作197 | Gesture Shake Action197 | ジェスチャーシェイクアクション197 | 제스처 흔들기 동작197
- ✅ 手势摇动操作197
- ✅ Gesture Shake Action197
- ✅ ジェスチャーシェイクアクション197
- ✅ 제스처 흔들기 동작197

### v197.5 投射音频音量197 | Cast Audio Volume197 | キャストオーディオ音量197 | 캐스트 오디오 볼륨197
- ✅ 投射音频音量197
- ✅ Cast Audio Volume197
- ✅ キャストオーディオ音量197
- ✅ 캐스트 오디오 볼륨197

### v197.6 播放列表自动跳过片尾197 | Playlist Auto Skip Outro197 | プレイリスト自動EDスキップ197 | 재생 목록 자동 ED 건너뛰기197
- ✅ 播放列表自动跳过片尾197
- ✅ Playlist Auto Skip Outro197
- ✅ プレイリスト自動EDスキップ197
- ✅ 재생 목록 자동 ED 건너뛰기197

### v197.7 缓存下载速度198 | Cache Download Speed198 | キャッシュダウンロード速度198 | 캐시 다운로드 속도198
- ✅ 缓存下载速度198
- ✅ Cache Download Speed198
- ✅ キャッシュダウンロード速度198
- ✅ 캐시 다운로드 속도198

### v197.8 进度条滑块边框197 | Progress Bar Thumb Border197 | プログレスバーサムボーダー197 | 진행 바 썸 테두리197
- ✅ 进度条滑块边框197
- ✅ Progress Bar Thumb Border197
- ✅ プログレスバーサムボーダー197
- ✅ 진행 바 썸 테두리197

### v197.9 音量增强峰值197 | Volume Boost Peak197 | ボリュームブーストピーク197 | 볼륨 부스트 피크197
- ✅ 音量增强峰值197
- ✅ Volume Boost Peak197
- ✅ ボリュームブーストピーク197
- ✅ 볼륨 부스트 피크197

### v197.10 历史记录书签导出197 | History Bookmark Export197 | 履歴ブックマークエクスポート197 | 기록 북마크 내보내기197
- ✅ 历史记录书签导出197
- ✅ History Bookmark Export197
- ✅ 履歴ブックマークエクスポート197
- ✅ 기록 북마크 내보내기197

### v197.11 播放章节同步197 | Playback Chapter Sync197 | 再生チャプター同期197 | 재생 챕터 동기화197
- ✅ 播放章节同步197
- ✅ Playback Chapter Sync197
- ✅ 再生チャプター同期197
- ✅ 재생 챕터 동기화197

### v197.12 截图保存路径197 | Screenshot Save Path197 | スクリーンショット保存パス197 | 스크린샷 저장 경로197
- ✅ 截图保存路径197
- ✅ Screenshot Save Path197
- ✅ スクリーンショット保存パス197
- ✅ 스크린샷 저장 경로197

### v197.13 视频色彩空间197 | Video Color Space197 | ビデオカラースペース197 | 비디오 색공간197
- ✅ 视频色彩空间197
- ✅ Video Color Space197
- ✅ ビデオカラースペース197
- ✅ 비디오 색공간197

### v197.14 弹幕底部最大数量202 | Danmaku Bottom Max Count202 | コメントボトム最大数202 | 댓글 하단 최대 수202
- ✅ 弹幕底部最大数量202
- ✅ Danmaku Bottom Max Count202
- ✅ コメントボトム最大数202
- ✅ 댓글 하단 최대 수202

### v197.15 字幕背景边框209 | Subtitle Bg Border209 | 字幕背景ボーダー209 | 자막 배경 테두리209
- ✅ 字幕背景边框209
- ✅ Subtitle Bg Border209
- ✅ 字幕背景ボーダー209
- ✅ 자막 배경 테두리209

### v198.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v198.1-v198.15 功能列表
- ✅ Audio Delay Compensate198, Danmaku Bottom Max Count203, Subtitle Bg Border210, Gesture Shake Action198, Cast Audio Volume198, Playlist Auto Skip Outro198, Cache Download Speed199, Progress Bar Thumb Border198, Volume Boost Peak198, History Bookmark Export198, Playback Chapter Sync198, Screenshot Save Path198, Video Color Space198, Danmaku Bottom Max Count204, Subtitle Bg Border211

### v198.1 音频延迟补偿198 | Audio Delay Compensate198 | オーディオ遅延補正198 | 오디오 지연 보정198
- ✅ 音频延迟补偿198
- ✅ Audio Delay Compensate198
- ✅ オーディオ遅延補正198
- ✅ 오디오 지연 보정198

### v198.2 弹幕底部最大数量203 | Danmaku Bottom Max Count203 | コメントボトム最大数203 | 댓글 하단 최대 수203
- ✅ 弹幕底部最大数量203
- ✅ Danmaku Bottom Max Count203
- ✅ コメントボトム最大数203
- ✅ 댓글 하단 최대 수203

### v198.3 字幕背景边框210 | Subtitle Bg Border210 | 字幕背景ボーダー210 | 자막 배경 테두리210
- ✅ 字幕背景边框210
- ✅ Subtitle Bg Border210
- ✅ 字幕背景ボーダー210
- ✅ 자막 배경 테두리210

### v198.4 手势摇动操作198 | Gesture Shake Action198 | ジェスチャーシェイクアクション198 | 제스처 흔들기 동작198
- ✅ 手势摇动操作198
- ✅ Gesture Shake Action198
- ✅ ジェスチャーシェイクアクション198
- ✅ 제스처 흔들기 동작198

### v198.5 投射音频音量198 | Cast Audio Volume198 | キャストオーディオ音量198 | 캐스트 오디오 볼륨198
- ✅ 投射音频音量198
- ✅ Cast Audio Volume198
- ✅ キャストオーディオ音量198
- ✅ 캐스트 오디오 볼륨198

### v198.6 播放列表自动跳过片尾198 | Playlist Auto Skip Outro198 | プレイリスト自動EDスキップ198 | 재생 목록 자동 ED 건너뛰기198
- ✅ 播放列表自动跳过片尾198
- ✅ Playlist Auto Skip Outro198
- ✅ プレイリスト自動EDスキップ198
- ✅ 재생 목록 자동 ED 건너뛰기198

### v198.7 缓存下载速度199 | Cache Download Speed199 | キャッシュダウンロード速度199 | 캐시 다운로드 속도199
- ✅ 缓存下载速度199
- ✅ Cache Download Speed199
- ✅ キャッシュダウンロード速度199
- ✅ 캐시 다운로드 속도199

### v198.8 进度条滑块边框198 | Progress Bar Thumb Border198 | プログレスバーサムボーダー198 | 진행 바 썸 테두리198
- ✅ 进度条滑块边框198
- ✅ Progress Bar Thumb Border198
- ✅ プログレスバーサムボーダー198
- ✅ 진행 바 썸 테두리198

### v198.9 音量增强峰值198 | Volume Boost Peak198 | ボリュームブーストピーク198 | 볼륨 부스트 피크198
- ✅ 音量增强峰值198
- ✅ Volume Boost Peak198
- ✅ ボリュームブーストピーク198
- ✅ 볼륨 부스트 피크198

### v198.10 历史记录书签导出198 | History Bookmark Export198 | 履歴ブックマークエクスポート198 | 기록 북마크 내보내기198
- ✅ 历史记录书签导出198
- ✅ History Bookmark Export198
- ✅ 履歴ブックマークエクスポート198
- ✅ 기록 북마크 내보내기198

### v198.11 播放章节同步198 | Playback Chapter Sync198 | 再生チャプター同期198 | 재생 챕터 동기화198
- ✅ 播放章节同步198
- ✅ Playback Chapter Sync198
- ✅ 再生チャプター同期198
- ✅ 재생 챕터 동기화198

### v198.12 截图保存路径198 | Screenshot Save Path198 | スクリーンショット保存パス198 | 스크린샷 저장 경로198
- ✅ 截图保存路径198
- ✅ Screenshot Save Path198
- ✅ スクリーンショット保存パス198
- ✅ 스크린샷 저장 경로198

### v198.13 视频色彩空间198 | Video Color Space198 | ビデオカラースペース198 | 비디오 색공간198
- ✅ 视频色彩空间198
- ✅ Video Color Space198
- ✅ ビデオカラースペース198
- ✅ 비디오 색공간198

### v198.14 弹幕底部最大数量204 | Danmaku Bottom Max Count204 | コメントボトム最大数204 | 댓글 하단 최대 수204
- ✅ 弹幕底部最大数量204
- ✅ Danmaku Bottom Max Count204
- ✅ コメントボトム最大数204
- ✅ 댓글 하단 최대 수204

### v198.15 字幕背景边框211 | Subtitle Bg Border211 | 字幕背景ボーダー211 | 자막 배경 테두리211
- ✅ 字幕背景边框211
- ✅ Subtitle Bg Border211
- ✅ 字幕背景ボーダー211
- ✅ 자막 배경 테두리211

### v199.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v199.1-v199.15 功能列表
- ✅ Audio Delay Compensate199, Danmaku Bottom Max Count205, Subtitle Bg Border212, Gesture Shake Action199, Cast Audio Volume199, Playlist Auto Skip Outro199, Cache Download Speed200, Progress Bar Thumb Border199, Volume Boost Peak199, History Bookmark Export199, Playback Chapter Sync199, Screenshot Save Path199, Video Color Space199, Danmaku Bottom Max Count206, Subtitle Bg Border213

### v199.1 音频延迟补偿199 | Audio Delay Compensate199 | オーディオ遅延補正199 | 오디오 지연 보정199
- ✅ 音频延迟补偿199
- ✅ Audio Delay Compensate199
- ✅ オーディオ遅延補正199
- ✅ 오디오 지연 보정199

### v199.2 弹幕底部最大数量205 | Danmaku Bottom Max Count205 | コメントボトム最大数205 | 댓글 하단 최대 수205
- ✅ 弹幕底部最大数量205
- ✅ Danmaku Bottom Max Count205
- ✅ コメントボトム最大数205
- ✅ 댓글 하단 최대 수205

### v199.3 字幕背景边框212 | Subtitle Bg Border212 | 字幕背景ボーダー212 | 자막 배경 테두리212
- ✅ 字幕背景边框212
- ✅ Subtitle Bg Border212
- ✅ 字幕背景ボーダー212
- ✅ 자막 배경 테두리212

### v199.4 手势摇动操作199 | Gesture Shake Action199 | ジェスチャーシェイクアクション199 | 제스처 흔들기 동작199
- ✅ 手势摇动操作199
- ✅ Gesture Shake Action199
- ✅ ジェスチャーシェイクアクション199
- ✅ 제스처 흔들기 동작199

### v199.5 投射音频音量199 | Cast Audio Volume199 | キャストオーディオ音量199 | 캐스트 오디오 볼륨199
- ✅ 投射音频音量199
- ✅ Cast Audio Volume199
- ✅ キャストオーディオ音量199
- ✅ 캐스트 오디오 볼륨199

### v199.6 播放列表自动跳过片尾199 | Playlist Auto Skip Outro199 | プレイリスト自動EDスキップ199 | 재생 목록 자동 ED 건너뛰기199
- ✅ 播放列表自动跳过片尾199
- ✅ Playlist Auto Skip Outro199
- ✅ プレイリスト自動EDスキップ199
- ✅ 재생 목록 자동 ED 건너뛰기199

### v199.7 缓存下载速度200 | Cache Download Speed200 | キャッシュダウンロード速度200 | 캐시 다운로드 속도200
- ✅ 缓存下载速度200
- ✅ Cache Download Speed200
- ✅ キャッシュダウンロード速度200
- ✅ 캐시 다운로드 속도200

### v199.8 进度条滑块边框199 | Progress Bar Thumb Border199 | プログレスバーサムボーダー199 | 진행 바 썸 테두리199
- ✅ 进度条滑块边框199
- ✅ Progress Bar Thumb Border199
- ✅ プログレスバーサムボーダー199
- ✅ 진행 바 썸 테두리199

### v199.9 音量增强峰值199 | Volume Boost Peak199 | ボリュームブーストピーク199 | 볼륨 부스트 피크199
- ✅ 音量增强峰值199
- ✅ Volume Boost Peak199
- ✅ ボリュームブーストピーク199
- ✅ 볼륨 부스트 피크199

### v199.10 历史记录书签导出199 | History Bookmark Export199 | 履歴ブックマークエクスポート199 | 기록 북마크 내보내기199
- ✅ 历史记录书签导出199
- ✅ History Bookmark Export199
- ✅ 履歴ブックマークエクスポート199
- ✅ 기록 북마크 내보내기199

### v199.11 播放章节同步199 | Playback Chapter Sync199 | 再生チャプター同期199 | 재생 챕터 동기화199
- ✅ 播放章节同步199
- ✅ Playback Chapter Sync199
- ✅ 再生チャプター同期199
- ✅ 재생 챕터 동기화199

### v199.12 截图保存路径199 | Screenshot Save Path199 | スクリーンショット保存パス199 | 스크린샷 저장 경로199
- ✅ 截图保存路径199
- ✅ Screenshot Save Path199
- ✅ スクリーンショット保存パス199
- ✅ 스크린샷 저장 경로199

### v199.13 视频色彩空间199 | Video Color Space199 | ビデオカラースペース199 | 비디오 색공간199
- ✅ 视频色彩空间199
- ✅ Video Color Space199
- ✅ ビデオカラースペース199
- ✅ 비디오 색공간199

### v199.14 弹幕底部最大数量206 | Danmaku Bottom Max Count206 | コメントボトム最大数206 | 댓글 하단 최대 수206
- ✅ 弹幕底部最大数量206
- ✅ Danmaku Bottom Max Count206
- ✅ コメントボトム最大数206
- ✅ 댓글 하단 최대 수206

### v199.15 字幕背景边框213 | Subtitle Bg Border213 | 字幕背景ボーダー213 | 자막 배경 테두리213
- ✅ 字幕背景边框213
- ✅ Subtitle Bg Border213
- ✅ 字幕背景ボーダー213
- ✅ 자막 배경 테두리213

### v200.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v200.1-v200.15 功能列表
- ✅ Audio Delay Compensate200, Danmaku Bottom Max Count207, Subtitle Bg Border214, Gesture Shake Action200, Cast Audio Volume200, Playlist Auto Skip Outro200, Cache Download Speed201, Progress Bar Thumb Border200, Volume Boost Peak200, History Bookmark Export200, Playback Chapter Sync200, Screenshot Save Path200, Video Color Space200, Danmaku Bottom Max Count208, Subtitle Bg Border215

### v200.1 音频延迟补偿200 | Audio Delay Compensate200 | オーディオ遅延補正200 | 오디오 지연 보정200
- ✅ 音频延迟补偿200
- ✅ Audio Delay Compensate200
- ✅ オーディオ遅延補正200
- ✅ 오디오 지연 보정200

### v200.2 弹幕底部最大数量207 | Danmaku Bottom Max Count207 | コメントボトム最大数207 | 댓글 하단 최대 수207
- ✅ 弹幕底部最大数量207
- ✅ Danmaku Bottom Max Count207
- ✅ コメントボトム最大数207
- ✅ 댓글 하단 최대 수207

### v200.3 字幕背景边框214 | Subtitle Bg Border214 | 字幕背景ボーダー214 | 자막 배경 테두리214
- ✅ 字幕背景边框214
- ✅ Subtitle Bg Border214
- ✅ 字幕背景ボーダー214
- ✅ 자막 배경 테두리214

### v200.4 手势摇动操作200 | Gesture Shake Action200 | ジェスチャーシェイクアクション200 | 제스처 흔들기 동작200
- ✅ 手势摇动操作200
- ✅ Gesture Shake Action200
- ✅ ジェスチャーシェイクアクション200
- ✅ 제스처 흔들기 동작200

### v200.5 投射音频音量200 | Cast Audio Volume200 | キャストオーディオ音量200 | 캐스트 오디오 볼륨200
- ✅ 投射音频音量200
- ✅ Cast Audio Volume200
- ✅ キャストオーディオ音量200
- ✅ 캐스트 오디오 볼륨200

### v200.6 播放列表自动跳过片尾200 | Playlist Auto Skip Outro200 | プレイリスト自動EDスキップ200 | 재생 목록 자동 ED 건너뛰기200
- ✅ 播放列表自动跳过片尾200
- ✅ Playlist Auto Skip Outro200
- ✅ プレイリスト自動EDスキップ200
- ✅ 재생 목록 자동 ED 건너뛰기200

### v200.7 缓存下载速度201 | Cache Download Speed201 | キャッシュダウンロード速度201 | 캐시 다운로드 속도201
- ✅ 缓存下载速度201
- ✅ Cache Download Speed201
- ✅ キャッシュダウンロード速度201
- ✅ 캐시 다운로드 속도201

### v200.8 进度条滑块边框200 | Progress Bar Thumb Border200 | プログレスバーサムボーダー200 | 진행 바 썸 테두리200
- ✅ 进度条滑块边框200
- ✅ Progress Bar Thumb Border200
- ✅ プログレスバーサムボーダー200
- ✅ 진행 바 썸 테두리200

### v200.9 音量增强峰值200 | Volume Boost Peak200 | ボリュームブーストピーク200 | 볼륨 부스트 피크200
- ✅ 音量增强峰值200
- ✅ Volume Boost Peak200
- ✅ ボリュームブーストピーク200
- ✅ 볼륨 부스트 피크200

### v200.10 历史记录书签导出200 | History Bookmark Export200 | 履歴ブックマークエクスポート200 | 기록 북마크 내보내기200
- ✅ 历史记录书签导出200
- ✅ History Bookmark Export200
- ✅ 履歴ブックマークエクスポート200
- ✅ 기록 북마크 내보내기200

### v200.11 播放章节同步200 | Playback Chapter Sync200 | 再生チャプター同期200 | 재생 챕터 동기화200
- ✅ 播放章节同步200
- ✅ Playback Chapter Sync200
- ✅ 再生チャプター同期200
- ✅ 재생 챕터 동기화200

### v200.12 截图保存路径200 | Screenshot Save Path200 | スクリーンショット保存パス200 | 스크린샷 저장 경로200
- ✅ 截图保存路径200
- ✅ Screenshot Save Path200
- ✅ スクリーンショット保存パス200
- ✅ 스크린샷 저장 경로200

### v200.13 视频色彩空间200 | Video Color Space200 | ビデオカラースペース200 | 비디오 색공간200
- ✅ 视频色彩空间200
- ✅ Video Color Space200
- ✅ ビデオカラースペース200
- ✅ 비디오 색공간200

### v200.14 弹幕底部最大数量208 | Danmaku Bottom Max Count208 | コメントボトム最大数208 | 댓글 하단 최대 수208
- ✅ 弹幕底部最大数量208
- ✅ Danmaku Bottom Max Count208
- ✅ コメントボトム最大数208
- ✅ 댓글 하단 최대 수208

### v200.15 字幕背景边框215 | Subtitle Bg Border215 | 字幕背景ボーダー215 | 자막 배경 테두리215
- ✅ 字幕背景边框215
- ✅ Subtitle Bg Border215
- ✅ 字幕背景ボーダー215
- ✅ 자막 배경 테두리215

### v55.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v55.1-v55.15 功能列表
- ✅ Auto Resume, Font Monospace, Color Hue Auto, Peak Limiter, Send Queue, Cast Bandwidth Limit, Lock Screen, Filter Regex, Network Policy, Double Tap Action, Font Weight Custom, Tint Custom, Volume Compressor, Bg Padding, Cast Auto Quality

### v55.1 自动恢复播放 | Auto Resume | 自動再開 | 자동 재개
- ✅ 自动恢复播放
- ✅ Auto Resume
- ✅ 自動再開
- ✅ 자동 재개

### v55.2 弹幕等宽字体 | Font Monospace | フォントモノスペース | 글꼴 모노스페이스
- ✅ 弹幕等宽字体
- ✅ Font Monospace
- ✅ フォントモノスペース
- ✅ 글꼴 모노스페이스

### v55.3 自动色调 | Color Hue Auto | 色相自動 | 색조 자동
- ✅ 自动色调
- ✅ Color Hue Auto
- ✅ 色相自動
- ✅ 색조 자동

### v55.4 峰值限幅 | Peak Limiter | ピックリミッター | 피크 리미터
- ✅ 峰值限幅
- ✅ Peak Limiter
- ✅ ピックリミッター
- ✅ 피크 리미터

### v55.5 弹幕队列发送 | Send Queue | 送信キュー | 전송 대기열
- ✅ 弹幕队列发送
- ✅ Send Queue
- ✅ 送信キュー
- ✅ 전송 대기열

### v55.6 投射带宽限制 | Cast Bandwidth Limit | キャスト帯域制限 | 캐스트 대역폭 제한
- ✅ 投射带宽限制
- ✅ Cast Bandwidth Limit
- ✅ キャスト帯域制限
- ✅ 캐스트 대역폭 제한

### v55.7 手势锁屏 | Lock Screen | 画面ロック | 화면 잠금
- ✅ 手势锁屏
- ✅ Lock Screen
- ✅ 画面ロック
- ✅ 화면 잠금

### v55.8 正则过滤 | Filter Regex | 正規表現フィルター | 정규식 필터
- ✅ 正则过滤
- ✅ Filter Regex
- ✅ 正規表現フィルター
- ✅ 정규식 필터

### v55.9 网络策略 | Network Policy | ネットワークポリシー | 네트워크 정책
- ✅ 网络策略
- ✅ Network Policy
- ✅ ネットワークポリシー
- ✅ 네트워크 정책

### v55.10 双击动作 | Double Tap Action | ダブルタップアクション | 더블 탭 동작
- ✅ 双击动作
- ✅ Double Tap Action
- ✅ ダブルタップアクション
- ✅ 더블 탭 동작

### v55.11 自定义字体粗细 | Font Weight Custom | フォント太さカスタム | 글꼴 두께 사용자 정의
- ✅ 自定义字体粗细
- ✅ Font Weight Custom
- ✅ フォント太さカスタム
- ✅ 글꼴 두께 사용자 정의

### v55.12 自定义色调 | Tint Custom | ティントカスタム | 틴트 사용자 정의
- ✅ 自定义色调
- ✅ Tint Custom
- ✅ ティントカスタム
- ✅ 틴트 사용자 정의

### v55.13 音量压缩 | Volume Compressor | 音量コンプレッサー | 볼륨 컴프레서
- ✅ 音量压缩
- ✅ Volume Compressor
- ✅ 音量コンプレッサー
- ✅ 볼륨 컴프레서

### v55.14 背景内边距 | Bg Padding | 背景パディング | 배경 패딩
- ✅ 背景内边距
- ✅ Bg Padding
- ✅ 背景パディング
- ✅ 배경 패딩

### v55.15 投射自动画质 | Cast Auto Quality | キャスト自動画質 | 캐스트 자동 화질
- ✅ 投射自动画质
- ✅ Cast Auto Quality
- ✅ キャスト自動画質
- ✅ 캐스트 자동 화질

### v45.x (AI自动维护版) | AI Maintenance Version
### v45.1-v45.15 功能列表
- ✅ Color Sharpen+, BG Radius+, Double Tap+, History Export+, Cast Buffer+
- ✅ Progress Style+, Gradient Speed+, Vividness+, Volume Balance, Offset+
- ✅ Cast Audio+, Gesture Vibration+, Vibration Intensity+, Smart Cleanup+, Buffer Display+

### v44.x (AI自动维护版) | AI Maintenance Version
### v44.1-v44.15 功能列表
- ✅ Denoise+, Stroke Width+, Long Press Speed+, History Search+, Cast Bitrate+
- ✅ Progress Height+, Border+, Blur+, Volume Fade+, Scroll Speed+
- ✅ Cast Latency+, Swipe Sensitivity+, Vibration Freq+, Cleanup Curve+, Gradient Dir+

### v43.x (AI自动维护版) | AI Maintenance Version
### v43.1-v43.15 功能列表
- ✅ Auto Hue, BG Alpha, Double Tap Vibration, History Backup, Cleanup+
- ✅ Progress Gradient+, Shadow+, Cast Resolution+, Volume Limit Curve+, Glow+
- ✅ Auto Brightness, Swipe Vibration, Vibration Mode+, Preload Size+, Progress Anim+

### v42.x (AI自动维护版) | AI Maintenance Version
### v42.1-v42.15 功能列表
- ✅ Stroke Color, Auto Contrast, Gesture Vibration, History Stats, Cache Auto Size
- ✅ Progress Color, Gradient+, Cast Color+, Volume Step, Smart Position
- ✅ Auto Saturation, Long Press Vibration, Vibration Duration, Preload Strategy, Buffer Color

### v41.x (AI自动维护版) | AI Maintenance Version
### v41.1-v41.15 功能列表
- ✅ Speed Memory, Vibration Mode, Color Auto Adjust, Volume Boost, Stroke Style
- ✅ Cast Color Correction, Gesture Mapping, Density Limit, Smart Cleanup, Buffer Display
- ✅ Vibration Feedback, HDR Simulation, Volume Limit+, BG Radius, Cast Audio Codec

### v40.x (AI自动维护版) | AI Maintenance Version
### v40.1 智能排序 | Smart Sort | スマートソート | 스마트 정렬
- ✅ 视频播放列表智能排序
- ✅ Video playlist smart sort
- ✅ 動画プレイリストスマートソート
- ✅ 동영상 재생 목록 스마트 정렬

### v40.2 渐变颜色 | Gradient Color | グラデーション色 | 그라데이션 색상
- ✅ 弹幕字体背景渐变颜色
- ✅ Danmaku font background gradient color
- ✅ コメントフォント背景グラデーション色
- ✅ 댓글 글꼴 배경 그라데이션 색상

### v40.3 色调曲线 | Hue Curve | 色相カーブ | 색조 커브
- ✅ 视频画面色彩色调曲线
- ✅ Video color hue curve
- ✅ 動画色彩色相カーブ
- ✅ 동영상 색상 색조 커브

### v40.4 震动强度曲线 | Vibration Intensity Curve | 振動強度カーブ | 진동 강도 커브
- ✅ 弹幕发送确认震动强度曲线
- ✅ Danmaku send confirmation vibration intensity curve
- ✅ コメント送信確認振動強度カーブ
- ✅ 댓글 전송 확인 진동 강도 커브

### v40.5 音量限制曲线 | Volume Limit Curve | 音量制限カーブ | 볼륨 제한 커브
- ✅ 播放器音量限制阈值曲线
- ✅ Player volume limit threshold curve
- ✅ プレーヤー音量制限閾値カーブ
- ✅ 플레이어 볼륨 제한 임계값 커브

### v40.6 清理策略曲线 | Cleanup Strategy Curve | クリーンアップ戦略カーブ | 정리 전략 커브
- ✅ 视频缓存清理策略曲线
- ✅ Video cache cleanup strategy curve
- ✅ 動画キャッシュクリーンアップ戦略カーブ
- ✅ 동영상 캐시 정리 전략 커브

### v40.7 对齐方式曲线 | Align Mode Curve | 配置モードカーブ | 정렬 모드 커브
- ✅ 弹幕显示位置对齐方式曲线
- ✅ Danmaku position align mode curve
- ✅ コメント表示位置配置モードカーブ
- ✅ 댓글 표시 위치 정렬 모드 커브

### v40.8 降噪曲线 | Denoise Curve | ノイズ除去カーブ | 노이즈 제거 커브
- ✅ 视频画面色彩降噪曲线
- ✅ Video color denoise curve
- ✅ 動画色彩ノイズ除去カーブ
- ✅ 동영상 색상 노이즈 제거 커브

### v40.9 导出格式 | Export Format | エクスポート形式 | 내보내기 형식
- ✅ 弹幕发送历史记录导出格式
- ✅ Danmaku send history export format
- ✅ コメント送信履歴エクスポート形式
- ✅ 댓글 전송 기록 내보내기 형식

### v40.10 渐变方向 | Gradient Direction | グラデーション方向 | 그라데이션 방향
- ✅ 播放器进度条颜色渐变方向
- ✅ Player progress bar color gradient direction
- ✅ プレーヤープログレスバー色グラデーション方向
- ✅ 플레이어 진행 바 색상 그라데이션 방향

### v40.11 延迟策略 | Latency Strategy | 遅延戦略 | 지연 전략
- ✅ 视频投射画面延迟策略
- ✅ Video cast latency strategy
- ✅ 動画キャスト遅延戦略
- ✅ 동영상 캐스트 지연 전략

### v40.12 渐变透明度 | Gradient Transparency | グラデーション透明度 | 그라데이션 투명도
- ✅ 弹幕字体背景渐变透明度
- ✅ Danmaku font background gradient transparency
- ✅ コメントフォント背景グラデーション透明度
- ✅ 댓글 글꼴 배경 그라데이션 투명도

### v40.13 滑动速度 | Swipe Speed | スワイプ速度 | 스와이프 속도
- ✅ 播放器手势滑动速度
- ✅ Player gesture swipe speed
- ✅ プレーヤージェスチャースワイプ速度
- ✅ 플레이어 제스처 스와이프 속도

### v40.14 模糊曲线 | Blur Curve | ぼかしカーブ | 블러 커브
- ✅ 视频画面色彩模糊曲线
- ✅ Video color blur curve
- ✅ 動画色彩ぼかしカーブ
- ✅ 동영상 색상 블러 커브

### v40.15 发光强度 | Glow Intensity | グロー強度 | 글로우 강도
- ✅ 弹幕显示字体发光强度
- ✅ Danmaku font glow intensity
- ✅ コメントフォントグロー強度
- ✅ 댓글 글꼴 글로우 강도

### v39.x (AI自动维护版) | AI Maintenance Version
### v39.1 自动跳过 | Auto Skip | 自動スキップ | 자동 건너뛰기
- ✅ 视频播放列表自动跳过
- ✅ Video playlist auto skip
- ✅ 動画プレイリスト自動スキップ
- ✅ 동영상 재생 목록 자동 건너뛰기

### v39.2 透明度曲线 | Alpha Curve | 透明度カーブ | 투명도 커브
- ✅ 弹幕字体背景透明度曲线
- ✅ Danmaku font background alpha curve
- ✅ コメントフォント背景透明度カーブ
- ✅ 댓글 글꼴 배경 투명도 커브

### v39.3 锐化强度 | Sharpen Intensity | シャープ強度 | 선명도 강도
- ✅ 视频画面色彩锐化强度
- ✅ Video color sharpen intensity
- ✅ 動画色彩シャープ強度
- ✅ 동영상 색상 선명도 강도

### v39.4 震动曲线 | Vibration Curve | 振動カーブ | 진동 커브
- ✅ 弹幕发送确认震动模式曲线
- ✅ Danmaku send confirmation vibration mode curve
- ✅ コメント送信確認振動モードカーブ
- ✅ 댓글 전송 확인 진동 모드 커브

### v39.5 音量平衡 | Volume Balance | 音量バランス | 볼륨 밸런스
- ✅ 播放器音量平衡
- ✅ Player volume balance
- ✅ プレーヤー音量バランス
- ✅ 플레이어 볼륨 밸런스

### v39.6 预加载大小 | Preload Size | プリロードサイズ | 프리로드 크기
- ✅ 视频缓存预加载大小
- ✅ Video cache preload size
- ✅ 動画キャッシュプリロードサイズ
- ✅ 동영상 캐시 프리로드 크기

### v39.7 垂直偏移 | Vertical Offset | 垂直オフセット | 수직 오프셋
- ✅ 弹幕显示位置偏移Y
- ✅ Danmaku position offset Y
- ✅ コメント表示位置オフセットY
- ✅ 댓글 표시 위치 오프셋Y

### v39.8 降噪强度 | Denoise Intensity | ノイズ除去強度 | 노이즈 제거 강도
- ✅ 视频画面色彩降噪强度
- ✅ Video color denoise intensity
- ✅ 動画色彩ノイズ除去強度
- ✅ 동영상 색상 노이즈 제거 강도

### v39.9 自动清理 | Auto Cleanup | 自動クリーンアップ | 자동 정리
- ✅ 弹幕发送历史记录自动清理
- ✅ Danmaku send history auto cleanup
- ✅ コメント送信履歴自動クリーンアップ
- ✅ 댓글 전송 기록 자동 정리

### v39.10 进度条渐变 | Progress Bar Gradient | プログレスバーグラデーション | 진행 바 그라데이션
- ✅ 播放器进度条颜色渐变
- ✅ Player progress bar color gradient
- ✅ プレーヤープログレスバー色グラデーション
- ✅ 플레이어 진행 바 색상 그라데이션

### v39.11 缓冲策略 | Buffer Strategy | バッファ戦略 | 버퍼 전략
- ✅ 视频投射画面缓冲策略
- ✅ Video cast buffer strategy
- ✅ 動画キャストバッファ戦略
- ✅ 동영상 캐스트 버퍼 전략

### v39.12 渐变速度 | Gradient Speed | グラデーション速度 | 그라데이션 속도
- ✅ 弹幕字体背景渐变速度
- ✅ Danmaku font background gradient speed
- ✅ コメントフォント背景グラデーション速度
- ✅ 댓글 글꼴 배경 그라데이션 속도

### v39.13 长按功能 | Long Press Function | 長押し機能 | 길게 누르기 기능
- ✅ 播放器手势长按功能
- ✅ Player gesture long press function
- ✅ プレーヤージェスチャー長押し機能
- ✅ 플레이어 제스처 길게 누르기 기능

### v39.14 模糊强度 | Blur Intensity | ぼかし強度 | 블러 강도
- ✅ 视频画面色彩模糊强度
- ✅ Video color blur intensity
- ✅ 動画色彩ぼかし強度
- ✅ 동영상 색상 블러 강도

### v39.15 发光模式 | Glow Mode | グローモード | 글로우 모드
- ✅ 弹幕显示字体发光模式
- ✅ Danmaku font glow mode
- ✅ コメントフォントグローモード
- ✅ 댓글 글꼴 글로우 모드

### v38.x (AI自动维护版) | AI Maintenance Version
### v38.1 循环模式 | Loop Mode | ループモード | 루프 모드
- ✅ 视频播放列表循环模式
- ✅ Video playlist loop mode
- ✅ 動画プレイリストループモード
- ✅ 동영상 재생 목록 루프 모드

### v38.2 背景圆角 | Background Radius | 背景角丸 | 배경 모서리 둥글기
- ✅ 弹幕字体背景圆角
- ✅ Danmaku font background radius
- ✅ コメントフォント背景角丸
- ✅ 댓글 글꼴 배경 모서리 둥글기

### v38.3 对比度曲线 | Contrast Curve | コントラストカーブ | 대비 커브
- ✅ 视频画面色彩对比度曲线
- ✅ Video color contrast curve
- ✅ 動画色彩コントラストカーブ
- ✅ 동영상 색상 대비 커브

### v38.4 震动频率 | Vibration Frequency | 振動周波数 | 진동 주파수
- ✅ 弹幕发送确认震动频率
- ✅ Danmaku send confirmation vibration frequency
- ✅ コメント送信確認振動周波数
- ✅ 댓글 전송 확인 진동 주파수

### v38.5 音量限制模式 | Volume Limit Mode | 音量制限モード | 볼륨 제한 모드
- ✅ 播放器音量限制模式
- ✅ Player volume limit mode
- ✅ プレーヤー音量制限モード
- ✅ 플레이어 볼륨 제한 모드

### v38.6 清理策略 | Cleanup Strategy | クリーンアップ戦略 | 정리 전략
- ✅ 视频缓存清理策略
- ✅ Video cache cleanup strategy
- ✅ 動画キャッシュクリーンアップ戦略
- ✅ 동영상 캐시 정리 전략

### v38.7 水平偏移 | Horizontal Offset | 水平オフセット | 수평 오프셋
- ✅ 弹幕显示位置偏移X
- ✅ Danmaku position offset X
- ✅ コメント表示位置オフセットX
- ✅ 댓글 표시 위치 오프셋X

### v38.8 亮度曲线 | Brightness Curve | 輝度カーブ | 밝기 커브
- ✅ 视频画面色彩亮度曲线
- ✅ Video color brightness curve
- ✅ 動画色彩輝度カーブ
- ✅ 동영상 색상 밝기 커브

### v38.9 搜索模式 | Search Mode | 検索モード | 검색 모드
- ✅ 弹幕发送历史记录搜索模式
- ✅ Danmaku send history search mode
- ✅ コメント送信履歴検索モード
- ✅ 댓글 전송 기록 검색 모드

### v38.10 进度条动画 | Progress Bar Animation | プログレスバーアニメーション | 진행 바 애니메이션
- ✅ 播放器进度条动画
- ✅ Player progress bar animation
- ✅ プレーヤープログレスバーアニメーション
- ✅ 플레이어 진행 바 애니메이션

### v38.11 投射延迟 | Cast Latency | キャスト遅延 | 캐스트 지연
- ✅ 视频投射画面延迟
- ✅ Video cast latency
- ✅ 動画キャスト遅延
- ✅ 동영상 캐스트 지연

### v38.12 渐变方向 | Gradient Direction | グラデーション方向 | 그라데이션 방향
- ✅ 弹幕字体背景渐变方向
- ✅ Danmaku font background gradient direction
- ✅ コメントフォント背景グラデーション方向
- ✅ 댓글 글꼴 배경 그라데이션 방향

### v38.13 滑动灵敏度 | Swipe Sensitivity | スワイプ感度 | 스와이프 감도
- ✅ 播放器手势滑动灵敏度
- ✅ Player gesture swipe sensitivity
- ✅ プレーヤージェスチャースワイプ感度
- ✅ 플레이어 제스처 스와이프 감도

### v38.14 饱和度曲线 | Saturation Curve | 彩度カーブ | 채도 커브
- ✅ 视频画面色彩饱和度曲线
- ✅ Video color saturation curve
- ✅ 動画色彩彩度カーブ
- ✅ 동영상 색상 채도 커브

### v38.15 描边宽度 | Stroke Width | ストローク幅 | 스트로크 너비
- ✅ 弹幕显示字体描边宽度
- ✅ Danmaku font stroke width
- ✅ コメントフォントストローク幅
- ✅ 댓글 글꼴 스트로크 너비

### v37.x (AI自动维护版) | AI Maintenance Version
### v37.1 随机播放 | Shuffle | シャッフル | 셔플
- ✅ 视频播放列表随机播放
- ✅ Video playlist shuffle
- ✅ 動画プレイリストシャッフル
- ✅ 동영상 재생 목록 셔플

### v37.2 阴影颜色 | Shadow Color | シャドウ色 | 그림자 색상
- ✅ 弹幕字体阴影颜色
- ✅ Danmaku font shadow color
- ✅ コメントフォントシャドウ色
- ✅ 댓글 글꼴 그림자 색상

### v37.3 鲜艳度 | Vividness | 鮮やかさ | 선명도
- ✅ 视频画面色彩鲜艳度
- ✅ Video color vividness
- ✅ 動画色彩鮮やかさ
- ✅ 동영상 색상 선명도

### v37.4 震动衰减 | Vibration Decay | 振動減衰 | 진동 감쇠
- ✅ 弹幕发送确认震动衰减
- ✅ Danmaku send confirmation vibration decay
- ✅ コメント送信確認振動減衰
- ✅ 댓글 전송 확인 진동 감쇠

### v37.5 音量淡入淡出 | Volume Fade | 音量フェード | 볼륨 페이드
- ✅ 播放器音量淡入淡出
- ✅ Player volume fade
- ✅ プレーヤー音量フェード
- ✅ 플레이어 볼륨 페이드

### v37.6 缓存预加载 | Cache Preload | キャッシュプリロード | 캐시 프리로드
- ✅ 视频缓存预加载
- ✅ Video cache preload
- ✅ 動画キャッシュプリロード
- ✅ 동영상 캐시 프리로드

### v37.7 滚动速度 | Scroll Speed | スクロール速度 | 스크롤 속도
- ✅ 弹幕显示滚动速度
- ✅ Danmaku scroll speed
- ✅ コメントスクロール速度
- ✅ 댓글 스크롤 속도

### v37.8 色阶 | Tonemap | トーンマップ | 톤매핑
- ✅ 视频画面色彩色阶
- ✅ Video color tonemap
- ✅ 動画色彩トーンマップ
- ✅ 동영상 색상 톤매핑

### v37.9 历史导出 | History Export | 履歴エクスポート | 기록 내보내기
- ✅ 弹幕发送历史记录导出
- ✅ Danmaku send history export
- ✅ コメント送信履歴エクスポート
- ✅ 댓글 전송 기록 내보내기

### v37.10 进度条高度 | Progress Bar Height | プログレスバー高さ | 진행 바 높이
- ✅ 播放器进度条高度
- ✅ Player progress bar height
- ✅ プレーヤープログレスバー高さ
- ✅ 플레이어 진행 바 높이

### v37.11 投射码率 | Cast Bitrate | キャストビットレート | 캐스트 비트레이트
- ✅ 视频投射画面码率
- ✅ Video cast bitrate
- ✅ 動画キャストビットレート
- ✅ 동영상 캐스트 비트레이트

### v37.12 边框颜色 | Border Color | ボーダー色 | 테두리 색상
- ✅ 弹幕字体背景边框颜色
- ✅ Danmaku font background border color
- ✅ コメントフォント背景ボーダー色
- ✅ 댓글 글꼴 배경 테두리 색상

### v37.13 双击功能 | Double Tap Function | ダブルタップ機能 | 더블 탭 기능
- ✅ 播放器手势双击功能
- ✅ Player gesture double tap function
- ✅ プレーヤージェスチャーダブルタップ機能
- ✅ 플레이어 제스처 더블 탭 기능

### v37.14 色调饱和度 | Hue Saturation | 色相彩度 | 색조 채도
- ✅ 视频画面色彩色调饱和度
- ✅ Video color hue saturation
- ✅ 動画色彩色相彩度
- ✅ 동영상 색상 색조 채도

### v37.15 发光强度 | Glow Intensity | グロー強度 | 글로우 강도
- ✅ 弹幕显示字体发光强度
- ✅ Danmaku font glow intensity
- ✅ コメントフォントグロー強度
- ✅ 댓글 글꼴 글로우 강도

### v36.x (AI自动维护版) | AI Maintenance Version
### v36.1 播放速度记忆 | Playback Speed Memory | 再生速度メモリ | 재생 속도 기억
- ✅ 视频播放速度记忆
- ✅ Video playback speed memory
- ✅ 動画再生速度メモリ
- ✅ 동영상 재생 속도 기억

### v36.2 描边颜色 | Stroke Color | ストローク色 | 스트로크 색상
- ✅ 弹幕字体描边颜色
- ✅ Danmaku font stroke color
- ✅ コメントフォントストローク色
- ✅ 댓글 글꼴 스트로크 색상

### v36.3 色温 | Color Temperature | 色温度 | 색온도
- ✅ 视频画面色彩色温
- ✅ Video color temperature
- ✅ 動画色彩色温度
- ✅ 동영상 색상 색온도

### v36.4 震动模式 | Vibration Pattern | 振動パターン | 진동 패턴
- ✅ 弹幕发送确认震动模式
- ✅ Danmaku send confirmation vibration pattern
- ✅ コメント送信確認振動パターン
- ✅ 댓글 전송 확인 진동 패턴

### v36.5 音量步进 | Volume Step | 音量ステップ | 볼륨 스텝
- ✅ 播放器音量步进值
- ✅ Player volume step
- ✅ プレーヤー音量ステップ
- ✅ 플레이어 볼륨 스텝

### v36.6 缓存限制 | Cache Limit | キャッシュ制限 | 캐시 제한
- ✅ 视频缓存大小限制
- ✅ Video cache size limit
- ✅ 動画キャッシュサイズ制限
- ✅ 동영상 캐시 크기 제한

### v36.7 显示区域 | Display Area | 表示領域 | 표시 영역
- ✅ 弹幕显示区域限制
- ✅ Danmaku display area limit
- ✅ コメント表示領域制限
- ✅ 댓글 표시 영역 제한

### v36.8 伽马 | Gamma | ガンマ | 감마
- ✅ 视频画面色彩伽马
- ✅ Video color gamma
- ✅ 動画色彩ガンマ
- ✅ 동영상 색상 감마

### v36.9 历史搜索 | History Search | 履歴検索 | 기록 검색
- ✅ 弹幕发送历史记录搜索
- ✅ Danmaku send history search
- ✅ コメント送信履歴検索
- ✅ 댓글 전송 기록 검색

### v36.10 进度条样式 | Progress Bar Style | プログレスバースタイル | 진행 바 스타일
- ✅ 播放器进度条样式
- ✅ Player progress bar style
- ✅ プレーヤープログレスバースタイル
- ✅ 플레이어 진행 바 스타일

### v36.11 投射分辨率 | Cast Resolution | キャスト解像度 | 캐스트 해상도
- ✅ 视频投射画面分辨率
- ✅ Video cast resolution
- ✅ 動画キャスト解像度
- ✅ 동영상 캐스트 해상도

### v36.12 背景模糊 | Background Blur | 背景ぼかし | 배경 블러
- ✅ 弹幕字体背景模糊
- ✅ Danmaku font background blur
- ✅ コメントフォント背景ぼかし
- ✅ 댓글 글꼴 배경 블러

### v36.13 长按速度 | Long Press Speed | 長押し速度 | 길게 누르기 속도
- ✅ 播放器手势长按速度
- ✅ Player gesture long press speed
- ✅ プレーヤージェスチャー長押し速度
- ✅ 플레이어 제스처 길게 누르기 속도

### v36.14 色调偏移 | Hue Shift | 色相シフト | 색조 시프트
- ✅ 视频画面色彩色调偏移
- ✅ Video color hue shift
- ✅ 動画色彩色相シフト
- ✅ 동영상 색상 색조 시프트

### v36.15 发光颜色 | Glow Color | グロー色 | 글로우 색상
- ✅ 弹幕显示字体发光颜色
- ✅ Danmaku font glow color
- ✅ コメントフォントグロー色
- ✅ 댓글 글꼴 글로우 색상

### v35.x (AI自动维护版) | AI Maintenance Version
### v35.1 跳过片头片尾 | Skip Intro/Outro | イントロ/アウトロスキップ | 인트로/아웃트로 건너뛰기
- ✅ 视频播放列表自动跳过片头片尾
- ✅ Video playlist auto skip intro/outro
- ✅ 動画プレイリスト自動スキップ
- ✅ 동영상 재생 목록 자동 건너뛰기

### v35.2 渐变颜色自定义 | Gradient Color Custom | グラデーション色カスタム | 그라데이션 색상 사용자 정의
- ✅ 弹幕字体背景渐变颜色自定义
- ✅ Danmaku font background gradient color custom
- ✅ コメントフォント背景グラデーション色
- ✅ 댓글 글꼴 배경 그라데이션 색상

### v35.3 对比度自定义 | Contrast Custom | コントラストカスタム | 대비 사용자 정의
- ✅ 视频画面色彩对比度自定义
- ✅ Video color contrast custom
- ✅ 動画色彩コントラスト
- ✅ 동영상 색상 대비

### v35.4 震动自定义 | Vibration Custom | 振動カスタム | 진동 사용자 정의
- ✅ 弹幕发送确认震动自定义
- ✅ Danmaku send confirmation vibration custom
- ✅ コメント送信確認振動
- ✅ 댓글 전송 확인 진동

### v35.5 音量限制自定义 | Volume Limit Custom | 音量制限カスタム | 볼륨 제한 사용자 정의
- ✅ 播放器音量限制自定义
- ✅ Player volume limit custom
- ✅ プレーヤー音量制限
- ✅ 플레이어 볼륨 제한

### v35.6 缓存清理自定义 | Cache Cleanup Custom | キャッシュクリーンアップカスタム | 캐시 정리 사용자 정의
- ✅ 视频缓存清理自定义
- ✅ Video cache cleanup custom
- ✅ 動画キャッシュクリーンアップ
- ✅ 동영상 캐시 정리

### v35.7 对齐自定义 | Align Custom | 配置カスタム | 정렬 사용자 정의
- ✅ 弹幕显示位置对齐自定义
- ✅ Danmaku position align custom
- ✅ コメント表示位置配置
- ✅ 댓글 표시 위치 정렬

### v35.8 饱和度自定义 | Saturation Custom | 彩度カスタム | 채도 사용자 정의
- ✅ 视频画面色彩饱和度自定义
- ✅ Video color saturation custom
- ✅ 動画色彩彩度
- ✅ 동영상 색상 채도

### v35.9 历史记录自定义 | History Custom | 履歴カスタム | 기록 사용자 정의
- ✅ 弹幕发送历史记录自定义
- ✅ Danmaku send history custom
- ✅ コメント送信履歴
- ✅ 댓글 전송 기록

### v35.10 进度条自定义 | Progress Bar Custom | プログレスバーカスタム | 진행 바 사용자 정의
- ✅ 播放器进度条颜色自定义
- ✅ Player progress bar color custom
- ✅ プレーヤープログレスバー色
- ✅ 플레이어 진행 바 색상

### v35.11 投射缓冲自定义 | Cast Buffer Custom | キャストバッファカスタム | 캐스트 버퍼 사용자 정의
- ✅ 视频投射画面缓冲自定义
- ✅ Video cast buffer custom
- ✅ 動画キャストバッファ
- ✅ 동영상 캐스트 버퍼

### v35.12 渐变自定义 | Gradient Custom | グラデーションカスタム | 그라데이션 사용자 정의
- ✅ 弹幕字体背景渐变自定义
- ✅ Danmaku font background gradient custom
- ✅ コメントフォント背景グラデーション
- ✅ 댓글 글꼴 배경 그라데이션

### v35.13 手势滑动自定义 | Gesture Swipe Custom | ジェスチャースワイプカスタム | 제스처 스와이프 사용자 정의
- ✅ 播放器手势滑动自定义
- ✅ Player gesture swipe custom
- ✅ プレーヤージェスチャースワイプ
- ✅ 플레이어 제스처 스와이프

### v35.14 亮度自定义 | Brightness Custom | 輝度カスタム | 밝기 사용자 정의
- ✅ 视频画面色彩亮度自定义
- ✅ Video color brightness custom
- ✅ 動画色彩輝度
- ✅ 동영상 색상 밝기

### v35.15 发光自定义 | Glow Custom | グローカスタム | 글로우 사용자 정의
- ✅ 弹幕显示字体发光自定义
- ✅ Danmaku font glow custom
- ✅ コメントフォントグロー
- ✅ 댓글 글꼴 글로우

### v34.x (AI自动维护版) | AI Maintenance Version
### v34.1 自动循环模式 | Auto Loop Mode | 自動ループモード | 자동 루프 모드
- ✅ 视频播放列表自动循环模式
- ✅ Video playlist auto loop mode
- ✅ 動画プレイリスト自動ループモード
- ✅ 동영상 재생 목록 자동 루프 모드

### v34.2 渐变类型 | Gradient Type | グラデーションタイプ | 그라데이션 유형
- ✅ 弹幕字体背景渐变类型
- ✅ Danmaku font background gradient type
- ✅ コメントフォント背景グラデーションタイプ
- ✅ 댓글 글꼴 배경 그라데이션 유형

### v34.3 色调曲线 | Hue Curve | 色相カーブ | 색조 커브
- ✅ 视频画面色彩色调曲线
- ✅ Video color hue curve
- ✅ 動画色彩色相カーブ
- ✅ 동영상 색상 색조 커브

### v34.4 震动强度曲线 | Vibration Intensity Curve | 振動強度カーブ | 진동 강도 커브
- ✅ 弹幕发送确认震动强度曲线
- ✅ Danmaku send confirmation vibration intensity curve
- ✅ コメント送信確認振動強度カーブ
- ✅ 댓글 전송 확인 진동 강도 커브

### v34.5 音量限制曲线 | Volume Limit Curve | 音量制限カーブ | 볼륨 제한 커브
- ✅ 播放器音量限制阈值曲线
- ✅ Player volume limit threshold curve
- ✅ プレーヤー音量制限閾値カーブ
- ✅ 플레이어 볼륨 제한 임계값 커브

### v34.6 清理策略曲线 | Cleanup Strategy Curve | クリーンアップ戦略カーブ | 정리 전략 커브
- ✅ 视频缓存清理策略曲线
- ✅ Video cache cleanup strategy curve
- ✅ 動画キャッシュクリーンアップ戦略カーブ
- ✅ 동영상 캐시 정리 전략 커브

### v34.7 对齐方式曲线 | Align Mode Curve | 配置モードカーブ | 정렬 모드 커브
- ✅ 弹幕显示位置对齐方式曲线
- ✅ Danmaku position align mode curve
- ✅ コメント表示位置配置モードカーブ
- ✅ 댓글 표시 위치 정렬 모드 커브

### v34.8 降噪曲线 | Denoise Curve | ノイズ除去カーブ | 노이즈 제거 커브
- ✅ 视频画面色彩降噪曲线
- ✅ Video color denoise curve
- ✅ 動画色彩ノイズ除去カーブ
- ✅ 동영상 색상 노이즈 제거 커브

### v34.9 导出格式 | Export Format | エクスポート形式 | 내보내기 형식
- ✅ 弹幕发送历史记录导出格式
- ✅ Danmaku send history export format
- ✅ コメント送信履歴エクスポート形式
- ✅ 댓글 전송 기록 내보내기 형식

### v34.10 进度条渐变 | Progress Bar Gradient | プログレスバーグラデーション | 진행 바 그라데이션
- ✅ 播放器进度条颜色渐变
- ✅ Player progress bar color gradient
- ✅ プレーヤープログレスバー色グラデーション
- ✅ 플레이어 진행 바 색상 그라데이션

### v34.11 投射延迟策略 | Cast Latency Strategy | キャスト遅延戦略 | 캐스트 지연 전략
- ✅ 视频投射画面延迟策略
- ✅ Video cast latency strategy
- ✅ 動画キャスト遅延戦略
- ✅ 동영상 캐스트 지연 전략

### v34.12 渐变透明度 | Gradient Transparency | グラデーション透明度 | 그라데이션 투명도
- ✅ 弹幕字体背景渐变透明度
- ✅ Danmaku font background gradient transparency
- ✅ コメントフォント背景グラデーション透明度
- ✅ 댓글 글꼴 배경 그라데이션 투명도

### v34.13 手势滑动速度 | Gesture Swipe Speed | ジェスチャースワイプ速度 | 제스처 스와이프 속도
- ✅ 播放器手势滑动速度
- ✅ Player gesture swipe speed
- ✅ プレーヤージェスチャースワイプ速度
- ✅ 플레이어 제스처 스와이프 속도

### v34.14 模糊曲线 | Blur Curve | ぼかしカーブ | 블러 커브
- ✅ 视频画面色彩模糊曲线
- ✅ Video color blur curve
- ✅ 動画色彩ぼかしカーブ
- ✅ 동영상 색상 블러 커브

### v34.15 发光强度 | Glow Intensity | グロー強度 | 글로우 강도
- ✅ 弹幕显示字体发光强度
- ✅ Danmaku font glow intensity
- ✅ コメントフォントグロー強度
- ✅ 댓글 글꼴 글로우 강도

### v33.x (AI自动维护版) | AI Maintenance Version
### v33.1 自动排序方式 | Auto Sort Method | 自動ソート方法 | 자동 정렬 방법
- ✅ 视频播放列表自动排序方式
- ✅ Video playlist auto sort method
- ✅ 動画プレイリスト自動ソート方法
- ✅ 동영상 재생 목록 자동 정렬 방법

### v33.2 渐变位置 | Gradient Position | グラデーション位置 | 그라데이션 위치
- ✅ 弹幕字体背景渐变位置
- ✅ Danmaku font background gradient position
- ✅ コメントフォント背景グラデーション位置
- ✅ 댓글 글꼴 배경 그라데이션 위치

### v33.3 锐化曲线 | Sharpen Curve | シャープカーブ | 선명도 커브
- ✅ 视频画面色彩锐化曲线
- ✅ Video color sharpen curve
- ✅ 動画色彩シャープカーブ
- ✅ 동영상 색상 선명도 커브

### v33.4 震动模式曲线 | Vibration Mode Curve | 振動モードカーブ | 진동 모드 커브
- ✅ 弹幕发送确认震动模式曲线
- ✅ Danmaku send confirmation vibration mode curve
- ✅ コメント送信確認振動モードカーブ
- ✅ 댓글 전송 확인 진동 모드 커브

### v33.5 音量限制模式 | Volume Limit Mode | 音量制限モード | 볼륨 제한 모드
- ✅ 播放器音量限制阈值模式
- ✅ Player volume limit threshold mode
- ✅ プレーヤー音量制限閾値モード
- ✅ 플레이어 볼륨 제한 임계값 모드

### v33.6 清理模式曲线 | Cleanup Mode Curve | クリーンアップモードカーブ | 정리 모드 커브
- ✅ 视频缓存清理模式曲线
- ✅ Video cache cleanup mode curve
- ✅ 動画キャッシュクリーンアップモードカーブ
- ✅ 동영상 캐시 정리 모드 커브

### v33.7 对齐偏移曲线 | Align Offset Curve | 配置オフセットカーブ | 정렬 오프셋 커브
- ✅ 弹幕显示位置对齐偏移曲线
- ✅ Danmaku position align offset curve
- ✅ コメント表示位置配置オフセットカーブ
- ✅ 댓글 표시 위치 정렬 오프셋 커브

### v33.8 对比度曲线 | Contrast Curve | コントラストカーブ | 대비 커브
- ✅ 视频画面色彩对比度曲线
- ✅ Video color contrast curve
- ✅ 動画色彩コントラストカーブ
- ✅ 동영상 색상 대비 커브

### v33.9 导入格式 | Import Format | インポート形式 | 가져오기 형식
- ✅ 弹幕发送历史记录导入格式
- ✅ Danmaku send history import format
- ✅ コメント送信履歴インポート形式
- ✅ 댓글 전송 기록 가져오기 형식

### v33.10 渐变方向 | Gradient Direction | グラデーション方向 | 그라데이션 방향
- ✅ 播放器进度条颜色渐变方向
- ✅ Player progress bar color gradient direction
- ✅ プレーヤープログレスバー色グラデーション方向
- ✅ 플레이어 진행 바 색상 그라데이션 방향

### v33.11 投射缓冲策略曲线 | Cast Buffer Strategy Curve | キャストバッファ戦略カーブ | 캐스트 버퍼 전략 커브
- ✅ 视频投射画面缓冲策略曲线
- ✅ Video cast buffer strategy curve
- ✅ 動画キャストバッファ戦略カーブ
- ✅ 동영상 캐스트 버퍼 전략 커브

### v33.12 渐变速度 | Gradient Speed | グラデーション速度 | 그라데이션 속도
- ✅ 弹幕字体背景渐变速度
- ✅ Danmaku font background gradient speed
- ✅ コメントフォント背景グラデーション速度
- ✅ 댓글 글꼴 배경 그라데이션 속도

### v33.13 手势滑动方向 | Gesture Swipe Direction | ジェスチャースワイプ方向 | 제스처 스와이프 방향
- ✅ 播放器手势滑动方向
- ✅ Player gesture swipe direction
- ✅ プレーヤージェスチャースワイプ方向
- ✅ 플레이어 제스처 스와이프 방향

### v33.14 饱和度曲线 | Saturation Curve | 彩度カーブ | 채도 커브
- ✅ 视频画面色彩饱和度曲线
- ✅ Video color saturation curve
- ✅ 動画色彩彩度カーブ
- ✅ 동영상 색상 채도 커브

### v33.15 发光颜色 | Glow Color | グロー色 | 글로우 색상
- ✅ 弹幕显示字体发光颜色
- ✅ Danmaku font glow color
- ✅ コメントフォントグロー色
- ✅ 댓글 글꼴 글로우 색상

### v32.x (AI自动维护版) | AI Maintenance Version
### v32.1 跳过片尾 | Skip Outro | アウトロスキップ | 아웃트로 건너뛰기
- ✅ 视频播放列表自动跳过片尾
- ✅ Video playlist auto skip outro
- ✅ 動画プレイリスト自動アウトロスキップ
- ✅ 동영상 재생 목록 자동 아웃트로 건너뛰기

### v32.2 渐变颜色 | Gradient Color | グラデーション色 | 그라데이션 색상
- ✅ 弹幕字体背景渐变颜色
- ✅ Danmaku font background gradient color
- ✅ コメントフォント背景グラデーション色
- ✅ 댓글 글꼴 배경 그라데이션 색상

### v32.3 色调曲线 | Hue Curve | 色相カーブ | 색조 커브
- ✅ 视频画面色彩色调曲线
- ✅ Video color hue curve
- ✅ 動画色彩色相カーブ
- ✅ 동영상 색상 색조 커브

### v32.4 震动强度曲线 | Vibration Intensity Curve | 振動強度カーブ | 진동 강도 커브
- ✅ 弹幕发送确认震动强度曲线
- ✅ Danmaku send confirmation vibration intensity curve
- ✅ コメント送信確認振動強度カーブ
- ✅ 댓글 전송 확인 진동 강도 커브

### v32.5 音量限制曲线 | Volume Limit Curve | 音量制限カーブ | 볼륨 제한 커브
- ✅ 播放器音量限制阈值曲线
- ✅ Player volume limit threshold curve
- ✅ プレーヤー音量制限閾値カーブ
- ✅ 플레이어 볼륨 제한 임계값 커브

### v32.6 清理策略曲线 | Cleanup Strategy Curve | クリーンアップ戦略カーブ | 정리 전략 커브
- ✅ 视频缓存清理策略曲线
- ✅ Video cache cleanup strategy curve
- ✅ 動画キャッシュクリーンアップ戦略カーブ
- ✅ 동영상 캐시 정리 전략 커브

### v32.7 对齐方式曲线 | Align Mode Curve | 配置モードカーブ | 정렬 모드 커브
- ✅ 弹幕显示位置对齐方式曲线
- ✅ Danmaku position align mode curve
- ✅ コメント表示位置配置モードカーブ
- ✅ 댓글 표시 위치 정렬 모드 커브

### v32.8 降噪曲线 | Denoise Curve | ノイズ除去カーブ | 노이즈 제거 커브
- ✅ 视频画面色彩降噪曲线
- ✅ Video color denoise curve
- ✅ 動画色彩ノイズ除去カーブ
- ✅ 동영상 색상 노이즈 제거 커브

### v32.9 历史记录搜索 | History Search | 履歴検索 | 기록 검색
- ✅ 弹幕发送历史记录搜索
- ✅ Danmaku send history search
- ✅ コメント送信履歴検索
- ✅ 댓글 전송 기록 검색

### v32.10 进度条动画 | Progress Bar Animation | プログレスバーアニメーション | 진행 바 애니메이션
- ✅ 播放器进度条动画
- ✅ Player progress bar animation
- ✅ プレーヤープログレスバーアニメーション
- ✅ 플레이어 진행 바 애니메이션

### v32.11 投射缓冲策略 | Cast Buffer Strategy | キャストバッファ戦略 | 캐스트 버퍼 전략
- ✅ 视频投射画面缓冲策略
- ✅ Video cast buffer strategy
- ✅ 動画キャストバッファ戦略
- ✅ 동영상 캐스트 버퍼 전략

### v32.12 渐变方向 | Gradient Direction | グラデーション方向 | 그라데이션 방향
- ✅ 弹幕字体背景渐变方向
- ✅ Danmaku font background gradient direction
- ✅ コメントフォント背景グラデーション方向
- ✅ 댓글 글꼴 배경 그라데이션 방향

### v32.13 手势滑动阈值 | Gesture Swipe Threshold | ジェスチャースワイプ閾値 | 제스처 스와이프 임계값
- ✅ 播放器手势滑动阈值
- ✅ Player gesture swipe threshold
- ✅ プレーヤージェスチャースワイプ閾値
- ✅ 플레이어 제스처 스와이프 임계값

### v32.14 亮度曲线 | Brightness Curve | 輝度カーブ | 밝기 커브
- ✅ 视频画面色彩亮度曲线
- ✅ Video color brightness curve
- ✅ 動画色彩輝度カーブ
- ✅ 동영상 색상 밝기 커브

### v32.15 发光颜色 | Glow Color | グロー色 | 글로우 색상
- ✅ 弹幕显示字体发光颜色
- ✅ Danmaku font glow color
- ✅ コメントフォントグロー色
- ✅ 댓글 글꼴 글로우 색상

### v31.x (AI自动维护版) | AI Maintenance Version
### v31.1 自动播放下一个 | Auto Play Next | 自動再生次 | 자동 재생 다음
- ✅ 视频播放列表自动播放下一个
- ✅ Video playlist auto play next
- ✅ 動画プレイリスト自動再生次
- ✅ 동영상 재생 목록 자동 재생 다음

### v31.2 背景渐变 | Background Gradient | 背景グラデーション | 배경 그라데이션
- ✅ 弹幕字体背景渐变设置
- ✅ Danmaku font background gradient
- ✅ コメントフォント背景グラデーション
- ✅ 댓글 글꼴 배경 그라데이션

### v31.3 色彩饱和度 | Color Saturation | 色彩彩度 | 색상 채도
- ✅ 视频画面色彩饱和度调节
- ✅ Video color saturation
- ✅ 動画色彩彩度
- ✅ 동영상 색상 채도

### v31.4 震动强度 | Vibration Intensity | 振動強度 | 진동 강도
- ✅ 弹幕发送确认震动强度设置
- ✅ Danmaku send confirmation vibration intensity
- ✅ コメント送信確認振動強度
- ✅ 댓글 전송 확인 진동 강도

### v31.5 音量平衡 | Volume Balance | 音量バランス | 볼륨 밸런스
- ✅ 播放器音量平衡设置
- ✅ Player volume balance
- ✅ プレーヤー音量バランス
- ✅ 플레이어 볼륨 밸런스

### v31.6 缓存策略 | Cache Strategy | キャッシュ戦略 | 캐시 전략
- ✅ 视频缓存策略设置
- ✅ Video cache strategy
- ✅ 動画キャッシュ戦略
- ✅ 동영상 캐시 전략

### v31.7 显示偏移 | Display Offset | 表示オフセット | 표시 오프셋
- ✅ 弹幕显示位置偏移设置
- ✅ Danmaku position offset
- ✅ コメント表示位置オフセット
- ✅ 댓글 표시 위치 오프셋

### v31.8 色彩对比度 | Color Contrast | 色彩コントラスト | 색상 대비
- ✅ 视频画面色彩对比度调节
- ✅ Video color contrast
- ✅ 動画色彩コントラスト
- ✅ 동영상 색상 대비

### v31.9 历史记录导出 | History Export | 履歴エクスポート | 기록 내보내기
- ✅ 弹幕发送历史记录导出功能
- ✅ Danmaku send history export
- ✅ コメント送信履歴エクスポート
- ✅ 댓글 전송 기록 내보내기

### v31.10 进度条样式 | Progress Bar Style | プログレスバースタイル | 진행 바 스타일
- ✅ 播放器进度条样式设置
- ✅ Player progress bar style
- ✅ プレーヤープログレスバースタイル
- ✅ 플레이어 진행 바 스타일

### v31.11 投射画质 | Cast Quality | キャスト画質 | 캐스트 화질
- ✅ 视频投射画面画质设置
- ✅ Video cast quality
- ✅ 動画キャスト画質
- ✅ 동영상 캐스트 화질

### v31.12 背景透明度 | Background Transparency | 背景透明度 | 배경 투명도
- ✅ 弹幕字体背景透明度设置
- ✅ Danmaku font background transparency
- ✅ コメントフォント背景透明度
- ✅ 댓글 글꼴 배경 투명도

### v31.13 手势灵敏度 | Gesture Sensitivity | ジェスチャー感度 | 제스처 감도
- ✅ 播放器手势灵敏度设置
- ✅ Player gesture sensitivity
- ✅ プレーヤージェスチャー感度
- ✅ 플레이어 제스처 감도

### v31.14 色彩亮度 | Color Brightness | 色彩輝度 | 색상 밝기
- ✅ 视频画面色彩亮度调节
- ✅ Video color brightness
- ✅ 動画色彩輝度
- ✅ 동영상 색상 밝기

### v31.15 字体阴影 | Font Shadow | フォントシャドウ | 글꼴 그림자
- ✅ 弹幕显示字体阴影设置
- ✅ Danmaku font shadow
- ✅ コメントフォントシャドウ
- ✅ 댓글 글꼴 그림자

### v30.x (AI自动维护版) | AI Maintenance Version
### v30.1 自动循环 | Auto Loop | 自動ループ | 자동 루프
- ✅ 视频播放列表自动循环功能
- ✅ Video playlist auto loop
- ✅ 動画プレイリスト自動ループ
- ✅ 동영상 재생 목록 자동 루프

### v30.2 背景边框 | Background Border | 背景ボーダー | 배경 테두리
- ✅ 弹幕字体背景边框设置
- ✅ Danmaku font background border
- ✅ コメントフォント背景ボーダー
- ✅ 댓글 글꼴 배경 테두리

### v30.3 色彩锐化 | Color Sharpen | 色彩シャープ | 색상 선명도
- ✅ 视频画面色彩锐化调节
- ✅ Video color sharpen
- ✅ 動画色彩シャープ
- ✅ 동영상 색상 선명도

### v30.4 震动模式 | Vibration Mode | 振動モード | 진동 모드
- ✅ 弹幕发送确认震动模式设置
- ✅ Danmaku send confirmation vibration mode
- ✅ コメント送信確認振動モード
- ✅ 댓글 전송 확인 진동 모드

### v30.5 音量限制阈值 | Volume Limit Threshold | 音量制限閾値 | 볼륨 제한 임계값
- ✅ 播放器音量限制阈值设置
- ✅ Player volume limit threshold
- ✅ プレーヤー音量制限閾値
- ✅ 플레이어 볼륨 제한 임계값

### v30.6 清理模式 | Cleanup Mode | クリーンアップモード | 정리 모드
- ✅ 视频缓存清理模式设置
- ✅ Video cache cleanup mode
- ✅ 動画キャッシュクリーンアップモード
- ✅ 동영상 캐시 정리 모드

### v30.7 对齐方式 | Align Mode | 配信モード | 정렬 모드
- ✅ 弹幕显示位置对齐方式设置
- ✅ Danmaku position align mode
- ✅ コメント表示位置配信モード
- ✅ 댓글 표시 위치 정렬 모드

### v30.8 色彩降噪 | Color Denoise | 色彩ノイズ除去 | 색상 노이즈 제거
- ✅ 视频画面色彩降噪调节
- ✅ Video color denoise
- ✅ 動画色彩ノイズ除去
- ✅ 동영상 색상 노이즈 제거

### v30.9 历史记录导入 | History Import | 履歴インポート | 기록 가져오기
- ✅ 弹幕发送历史记录导入功能
- ✅ Danmaku send history import
- ✅ コメント送信履歴インポート
- ✅ 댓글 전송 기록 가져오기

### v30.10 进度条颜色 | Progress Bar Color | プログレスバー色 | 진행 바 색상
- ✅ 播放器进度条颜色设置
- ✅ Player progress bar color
- ✅ プレーヤープログレスバー色
- ✅ 플레이어 진행 바 색상

### v30.11 投射延迟 | Cast Latency | キャスト遅延 | 캐스트 지연
- ✅ 视频投射画面延迟设置
- ✅ Video cast latency
- ✅ 動画キャスト遅延
- ✅ 동영상 캐스트 지연

### v30.12 背景阴影 | Background Shadow | 背景シャドウ | 배경 그림자
- ✅ 弹幕字体背景阴影设置
- ✅ Danmaku font background shadow
- ✅ コメントフォント背景シャドウ
- ✅ 댓글 글꼴 배경 그림자

### v30.13 滑动功能 | Swipe Function | スワイプ機能 | 스와이프 기능
- ✅ 播放器手势滑动功能设置
- ✅ Player swipe function
- ✅ プレーヤースワイプ機能
- ✅ 플레이어 스와이프 기능

### v30.14 色彩模糊 | Color Blur | 色彩ぼかし | 색상 블러
- ✅ 视频画面色彩模糊调节
- ✅ Video color blur
- ✅ 動画色彩ぼかし
- ✅ 동영상 색상 블러

### v30.15 字体发光 | Font Glow | フォントグロー | 글꼴 글로우
- ✅ 弹幕显示字体发光设置
- ✅ Danmaku font glow
- ✅ コメントフォントグロー
- ✅ 댓글 글꼴 글로우

### v29.x (AI自动维护版) | AI Maintenance Version
### v29.1 自动排序 | Auto Sort | 自動ソート | 자동 정렬
- ✅ 视频播放列表自动排序功能
- ✅ Video playlist auto sort
- ✅ 動画プレイリスト自動ソート
- ✅ 동영상 재생 목록 자동 정렬

### v29.2 背景颜色 | Background Color | 背景色 | 배경 색상
- ✅ 弹幕字体背景颜色设置
- ✅ Danmaku font background color
- ✅ コメントフォント背景色
- ✅ 댓글 글꼴 배경 색상

### v29.3 色彩色调 | Color Hue | 色相 | 색조
- ✅ 视频画面色彩色调调节
- ✅ Video color hue
- ✅ 動画色相
- ✅ 동영상 색조

### v29.4 对话框样式 | Dialog Style | ダイアログスタイル | 대화 상자 스타일
- ✅ 弹幕发送确认对话框样式设置
- ✅ Danmaku send confirmation dialog style
- ✅ コメント送信確認ダイアログスタイル
- ✅ 댓글 전송 확인 대화 상자 스타일

### v29.5 音量限制模式 | Volume Limit Mode | 音量制限モード | 볼륨 제한 모드
- ✅ 播放器音量限制模式设置
- ✅ Player volume limit mode
- ✅ プレーヤー音量制限モード
- ✅ 플레이어 볼륨 제한 모드

### v29.6 清理阈值 | Cleanup Threshold | クリーンアップ閾値 | 정리 임계값
- ✅ 视频缓存清理阈值设置
- ✅ Video cache cleanup threshold
- ✅ 動画キャッシュクリーンアップ閾値
- ✅ 동영상 캐시 정리 임계값

### v29.7 位置偏移 | Position Offset | 位置オフセット | 위치 오프셋
- ✅ 弹幕显示位置偏移设置
- ✅ Danmaku position offset
- ✅ コメント表示位置オフセット
- ✅ 댓글 표시 위치 오프셋

### v29.8 色彩色温 | Color Temperature | 色温度 | 색온도
- ✅ 视频画面色彩色温调节
- ✅ Video color temperature
- ✅ 動画色温度
- ✅ 동영상 색온도

### v29.9 历史记录导出 | History Export | 履歴エクスポート | 기록 내보내기
- ✅ 弹幕发送历史记录导出功能
- ✅ Danmaku send history export
- ✅ コメント送信履歴エクスポート
- ✅ 댓글 전송 기록 내보내기

### v29.10 进度条样式 | Progress Bar Style | プログレスバースタイル | 진행 바 스타일
- ✅ 播放器进度条样式设置
- ✅ Player progress bar style
- ✅ プレーヤープログレスバースタイル
- ✅ 플레이어 진행 바 스타일

### v29.11 投射质量 | Cast Quality | キャスト品質 | 캐스트 품질
- ✅ 视频投射画面质量设置
- ✅ Video cast quality
- ✅ 動画キャスト品質
- ✅ 동영상 캐스트 품질

### v29.12 背景透明度 | Background Opacity | 背景透明度 | 배경 투명도
- ✅ 弹幕字体背景透明度设置
- ✅ Danmaku font background opacity
- ✅ コメントフォント背景透明度
- ✅ 댓글 글꼴 배경 투명도

### v29.13 长按功能 | Long Press Function | 長押し機能 | 길게 누르기 기능
- ✅ 播放器手势长按功能设置
- ✅ Player long press function
- ✅ プレーヤー長押し機能
- ✅ 플레이어 길게 누르기 기능

### v29.14 色彩伽马 | Color Gamma | カラーガンマ | 색상 감마
- ✅ 视频画面色彩伽马调节
- ✅ Video color gamma
- ✅ 動画カラーガンマ
- ✅ 동영상 색상 감마

### v29.15 字体描边 | Font Stroke | フォントストローク | 글꼴 스트로크
- ✅ 弹幕显示字体描边设置
- ✅ Danmaku font stroke
- ✅ コメントフォントストローク
- ✅ 댓글 글꼴 스트로크

### v28.x (AI自动维护版) | AI Maintenance Version
### v28.1 自动跳过 | Auto Skip | 自動スキップ | 자동 건너뛰기
- ✅ 视频播放列表自动跳过功能
- ✅ Video playlist auto skip
- ✅ 動画プレイリスト自動スキップ
- ✅ 동영상 재생 목록 자동 건너뛰기

### v28.2 背景圆角 | Background Corner Radius | 背景角丸 | 배경 모서리 둥글기
- ✅ 弹幕字体背景圆角设置
- ✅ Danmaku font background corner radius
- ✅ コメントフォント背景角丸
- ✅ 댓글 글꼴 배경 모서리 둥글기

### v28.3 色彩饱和度 | Color Saturation | 色彩彩度 | 채도
- ✅ 视频画面色彩饱和度调节
- ✅ Video color saturation
- ✅ 動画色彩彩度
- ✅ 동영상 채도

### v28.4 震动强度 | Vibration Strength | 振動強度 | 진동 강도
- ✅ 弹幕发送确认震动强度设置
- ✅ Danmaku send confirmation vibration strength
- ✅ コメント送信確認振動強度
- ✅ 댓글 전송 확인 진동 강도

### v28.5 音量淡入淡出 | Volume Fade | 音量フェード | 볼륨 페이드
- ✅ 播放器音量淡入淡出功能
- ✅ Player volume fade
- ✅ プレーヤー音量フェード
- ✅ 플레이어 볼륨 페이드

### v28.6 预加载间隔 | Preload Interval | プリロード間隔 | 프리로드 간격
- ✅ 视频缓存预加载间隔设置
- ✅ Video cache preload interval
- ✅ 動画キャッシュプリロード間隔
- ✅ 동영상 캐시 프리로드 간격

### v28.7 位置边距 | Position Margin | 位置マージン | 위치 여백
- ✅ 弹幕显示位置边距设置
- ✅ Danmaku position margin
- ✅ コメント表示位置マージン
- ✅ 댓글 표시 위치 여백

### v28.8 色彩对比度 | Color Contrast | 色彩コントラスト | 색상 대비
- ✅ 视频画面色彩对比度调节
- ✅ Video color contrast
- ✅ 動画色彩コントラスト
- ✅ 동영상 색상 대비

### v28.9 历史记录清理 | History Cleanup | 履歴クリーンアップ | 기록 정리
- ✅ 弹幕发送历史记录清理设置
- ✅ Danmaku send history cleanup
- ✅ コメント送信履歴クリーンアップ
- ✅ 댓글 전송 기록 정리

### v28.10 进度条圆角 | Progress Bar Corner Radius | プログレスバー角丸 | 진행 바 모서리 둥글기
- ✅ 播放器进度条圆角设置
- ✅ Player progress bar corner radius
- ✅ プレーヤープログレスバー角丸
- ✅ 플레이어 진행 바 모서리 둥글기

### v28.11 投射缓冲 | Cast Buffer | キャストバッファ | 캐스트 버퍼
- ✅ 视频投射画面缓冲设置
- ✅ Video cast buffer
- ✅ 動画キャストバッファ
- ✅ 동영상 캐스트 버퍼

### v28.12 背景边距 | Background Padding | 背景パディング | 배경 여백
- ✅ 弹幕字体背景边距设置
- ✅ Danmaku font background padding
- ✅ コメントフォント背景パディング
- ✅ 댓글 글꼴 배경 여백

### v28.13 滑动灵敏度 | Swipe Sensitivity | スワイプ感度 | 스와이프 감도
- ✅ 播放器手势滑动灵敏度设置
- ✅ Player swipe sensitivity
- ✅ プレーヤースワイプ感度
- ✅ 플레이어 스와이프 감도

### v28.14 色彩亮度 | Color Brightness | 色彩明るさ | 색상 밝기
- ✅ 视频画面色彩亮度调节
- ✅ Video color brightness
- ✅ 動画色彩明るさ
- ✅ 동영상 색상 밝기

### v28.15 字体阴影 | Font Shadow | フォントシャドウ | 글꼴 그림자
- ✅ 弹幕显示字体阴影设置
- ✅ Danmaku font shadow
- ✅ コメントフォントシャドウ
- ✅ 댓글 글꼴 그림자

### v27.x (AI自动维护版) | AI Maintenance Version
### v27.1 自动下一个 | Auto Next | 自動次へ | 자동 다음
- ✅ 视频播放列表自动下一个功能
- ✅ Video playlist auto next
- ✅ 動画プレイリスト自動次へ
- ✅ 동영상 재생 목록 자동 다음

### v27.2 阴影透明度 | Shadow Opacity | シャドウ透明度 | 그림자 투명도
- ✅ 弹幕字体阴影透明度调节
- ✅ Danmaku font shadow opacity
- ✅ コメントフォントシャドウ透明度
- ✅ 댓글 글꼴 그림자 투명도

### v27.3 色彩平衡 | Color Balance | カラーバランス | 색상 균형
- ✅ 视频画面色彩平衡调节
- ✅ Video color balance
- ✅ 動画カラーバランス
- ✅ 동영상 색상 균형

### v27.4 发送确认对话框 | Send Confirm Dialog | 送信確認ダイアログ | 전송 확인 대화 상자
- ✅ 弹幕发送确认对话框功能
- ✅ Danmaku send confirmation dialog
- ✅ コメント送信確認ダイアログ
- ✅ 댓글 전송 확인 대화 상자

### v27.5 音量限制 | Volume Limit | 音量制限 | 볼륨 제한
- ✅ 播放器音量限制设置
- ✅ Player volume limit
- ✅ プレーヤー音量制限
- ✅ 플레이어 볼륨 제한

### v27.6 缓存清理策略 | Cache Cleanup Strategy | キャッシュクリーンアップ戦略 | 캐시 정리 전략
- ✅ 视频缓存清理策略设置
- ✅ Video cache cleanup strategy
- ✅ 動画キャッシュクリーンアップ戦略
- ✅ 동영상 캐시 정리 전략

### v27.7 位置对齐 | Position Align | 位置配置 | 위치 정렬
- ✅ 弹幕显示位置对齐设置
- ✅ Danmaku position alignment
- ✅ コメント表示位置配置
- ✅ 댓글 표시 위치 정렬

### v27.8 色调曲线 | Tone Curve | トーンカーブ | 톤 곡선
- ✅ 视频画面色调曲线模式
- ✅ Video tone curve mode
- ✅ 動画トーンカーブモード
- ✅ 동영상 톤 곡선 모드

### v27.9 历史记录大小 | History Size | 履歴サイズ | 기록 크기
- ✅ 弹幕发送历史记录大小设置
- ✅ Danmaku send history size
- ✅ コメント送信履歴サイズ
- ✅ 댓글 전송 기록 크기

### v27.10 进度条高度 | Progress Bar Height | プログレスバー高さ | 진행 바 높이
- ✅ 播放器进度条高度设置
- ✅ Player progress bar height
- ✅ プレーヤープログレスバー高さ
- ✅ 플레이어 진행 바 높이

### v27.11 投射延迟 | Cast Delay | キャスト遅延 | 캐스트 지연
- ✅ 视频投射画面延迟设置
- ✅ Video cast delay
- ✅ 動画キャスト遅延
- ✅ 동영상 캐스트 지연

### v27.12 阴影大小 | Shadow Size | シャドウサイズ | 그림자 크기
- ✅ 弹幕字体阴影大小设置
- ✅ Danmaku font shadow size
- ✅ コメントフォントシャドウサイズ
- ✅ 댓글 글꼴 그림자 크기

### v27.13 双击功能 | Double Tap | ダブルタップ | 더블 탭
- ✅ 播放器手势双击功能自定义
- ✅ Player double tap function
- ✅ プレーヤーダブルタップ機能
- ✅ 플레이어 더블 탭 기능

### v27.14 降噪强度 | Denoise Strength | ノイズ除去強度 | 노이즈 제거 강도
- ✅ 视频画面降噪强度调节
- ✅ Video denoise strength
- ✅ 動画ノイズ除去強度
- ✅ 동영상 노이즈 제거 강도

### v27.15 字体间距 | Font Spacing | フォント間隔 | 글꼴 간격
- ✅ 弹幕显示字体间距调节
- ✅ Danmaku font spacing
- ✅ コメントフォント間隔
- ✅ 댓글 글꼴 간격

### v26.x (AI自动维护版) | AI Maintenance Version
### v26.1 自动播放 | Auto Play | 自動再生 | 자동 재생
- ✅ 视频播放列表自动播放功能
- ✅ Video playlist auto play
- ✅ 動画プレイリスト自動再生
- ✅ 동영상 재생 목록 자동 재생

### v26.2 边框颜色 | Border Color | ボーダーカラー | 테두리 색상
- ✅ 弹幕字体边框颜色设置
- ✅ Danmaku font border color
- ✅ コメントフォントボーダーカラー
- ✅ 댓글 글꼴 테두리 색상

### v26.3 对比度曲线 | Contrast Curve | コントラストカーブ | 대비 곡선
- ✅ 视频画面对比度曲线模式
- ✅ Video contrast curve mode
- ✅ 動画コントラストカーブモード
- ✅ 동영상 대비 곡선 모드

### v26.4 发送震动 | Send Vibration | 送信振動 | 전송 진동
- ✅ 弹幕发送确认震动功能
- ✅ Danmaku send confirmation vibration
- ✅ コメント送信確認振動
- ✅ 댓글 전송 확인 진동

### v26.5 音量均衡 | Volume Balance | 音量バランス | 볼륨 밸런스
- ✅ 播放器音量均衡调节
- ✅ Player volume balance
- ✅ プレーヤー音量バランス
- ✅ 플레이어 볼륨 밸런스

### v26.6 预加载大小 | Preload Size | プリロードサイズ | 프리로드 크기
- ✅ 视频缓存预加载大小设置
- ✅ Video cache preload size
- ✅ 動画キャッシュプリロードサイズ
- ✅ 동영상 캐시 프리로드 크기

### v26.7 显示透明度 | Display Opacity | 表示透明度 | 표시 투명도
- ✅ 弹幕显示透明度调节
- ✅ Danmaku display opacity
- ✅ コメント表示透明度
- ✅ 댓글 표시 투명도

### v26.8 亮度曲线 | Brightness Curve | 輝度カーブ | 밝기 곡선
- ✅ 视频画面亮度曲线模式
- ✅ Video brightness curve mode
- ✅ 動画輝度カーブモード
- ✅ 동영상 밝기 곡선 모드

### v26.9 历史记录数 | History Count | 履歴数 | 기록 수
- ✅ 弹幕发送历史记录数设置
- ✅ Danmaku send history count
- ✅ コメント送信履歴数
- ✅ 댓글 전송 기록 수

### v26.10 进度条透明度 | Progress Bar Opacity | プログレスバー透明度 | 진행 바 투명도
- ✅ 播放器进度条透明度设置
- ✅ Player progress bar opacity
- ✅ プレーヤープログレスバー透明度
- ✅ 플레이어 진행 바 투명도

### v26.11 缓冲策略 | Buffer Strategy | バッファ戦略 | 버퍼 전략
- ✅ 视频投射缓冲策略设置
- ✅ Video cast buffer strategy
- ✅ 動画キャストバッファ戦略
- ✅ 동영상 캐스트 버퍼 전략

### v26.12 边框透明度 | Border Opacity | ボーダー透明度 | 테두리 투명도
- ✅ 弹幕字体边框透明度调节
- ✅ Danmaku font border opacity
- ✅ コメントフォントボーダー透明度
- ✅ 댓글 글꼴 테두리 투명도

### v26.13 滑动功能 | Swipe Function | スワイプ機能 | 스와이프 기능
- ✅ 播放器手势滑动功能自定义
- ✅ Player swipe function
- ✅ プレーヤースワイプ機能
- ✅ 플레이어 스와이프 기능

### v26.14 饱和度曲线 | Saturation Curve | 彩度カーブ | 채도 곡선
- ✅ 视频画面饱和度曲线模式
- ✅ Video saturation curve mode
- ✅ 動画彩度カーブモード
- ✅ 동영상 채도 곡선 모드

### v26.15 字体样式 | Font Style | フォントスタイル | 글꼴 스타일
- ✅ 弹幕显示字体样式设置
- ✅ Danmaku font style
- ✅ コメントフォントスタイル
- ✅ 댓글 글꼴 스타일

### v25.x (AI自动维护版) | AI Maintenance Version
### v25.1 随机播放 | Shuffle | シャッフル | 셔플
- ✅ 视频播放列表随机播放功能
- ✅ Video playlist shuffle
- ✅ 動画プレイリストシャッフル
- ✅ 동영상 재생 목록 셔플

### v25.2 背景颜色 | Background Color | 背景色 | 배경색
- ✅ 弹幕字体背景颜色设置
- ✅ Danmaku font background color
- ✅ コメントフォント背景色
- ✅ 댓글 글꼴 배경색

### v25.3 饱和度曲线 | Saturation Curve | 彩度カーブ | 채도 곡선
- ✅ 视频画面饱和度曲线模式
- ✅ Video saturation curve mode
- ✅ 動画彩度カーブモード
- ✅ 동영상 채도 곡선 모드

### v25.4 发送确认 | Send Confirm | 送信確認 | 전송 확인
- ✅ 弹幕发送确认对话框
- ✅ Danmaku send confirmation dialog
- ✅ コメント送信確認ダイアログ
- ✅ 댓글 전송 확인 대화 상자

### v25.5 音量记忆 | Volume Memory | 音量記憶 | 볼륨 기억
- ✅ 播放器音量记忆功能
- ✅ Player volume memory
- ✅ プレーヤー音量記憶
- ✅ 플레이어 볼륨 기억

### v25.6 预加载策略 | Preload Strategy | プリロード戦略 | 프리로드 전략
- ✅ 视频缓存预加载策略设置
- ✅ Video cache preload strategy
- ✅ 動画キャッシュプリロード戦略
- ✅ 동영상 캐시 프리로드 전략

### v25.7 显示时长 | Display Duration | 表示時間 | 표시 시간
- ✅ 弹幕显示时间长度调节
- ✅ Danmaku display duration
- ✅ コメント表示時間
- ✅ 댓글 표시 시간

### v25.8 锐化曲线 | Sharpen Curve | シャープカーブ | 선명도 곡선
- ✅ 视频画面锐化曲线模式
- ✅ Video sharpen curve mode
- ✅ 動画シャープカーブモード
- ✅ 동영상 선명도 곡선 모드

### v25.9 发送历史 | Send History | 送信履歴 | 전송 기록
- ✅ 弹幕发送历史记录功能
- ✅ Danmaku send history
- ✅ コメント送信履歴
- ✅ 댓글 전송 기록

### v25.10 进度条颜色 | Progress Bar Color | プログレスバー色 | 진행 바 색상
- ✅ 播放器进度条颜色设置
- ✅ Player progress bar color
- ✅ プレーヤープログレスバー色
- ✅ 플레이어 진행 바 색상

### v25.11 音频质量 | Audio Quality | 音声品質 | 오디오 품질
- ✅ 视频投射音频质量设置
- ✅ Video cast audio quality
- ✅ 動画キャスト音声品質
- ✅ 동영상 캐스트 오디오 품질

### v25.12 背景透明度 | Background Opacity | 背景透明度 | 배경 투명도
- ✅ 弹幕字体背景透明度调节
- ✅ Danmaku font background opacity
- ✅ コメントフォント背景透明度
- ✅ 댓글 글꼴 배경 투명도

### v25.13 长按功能 | Long Press | 長押し | 길게 누르기
- ✅ 播放器手势长按功能自定义
- ✅ Player long press function
- ✅ プレーヤー長押し機能
- ✅ 플레이어 길게 누르기 기능

### v25.14 降噪曲线 | Denoise Curve | ノイズ除去カーブ | 노이즈 제거 곡선
- ✅ 视频画面降噪曲线模式
- ✅ Video denoise curve mode
- ✅ 動画ノイズ除去カーブモード
- ✅ 동영상 노이즈 제거 곡선 모드

### v25.15 字体大小 | Font Size | フォントサイズ | 글꼴 크기
- ✅ 弹幕显示字体大小调节
- ✅ Danmaku font size
- ✅ コメントフォントサイズ
- ✅ 댓글 글꼴 크기

### v24.x (AI自动维护版) | AI Maintenance Version
### v24.1 播放列表循环 | Playlist Loop | プレイリストループ | 재생 목록 반복
- ✅ 视频播放列表循环模式功能
- ✅ Video playlist loop mode
- ✅ 動画プレイリストループモード
- ✅ 동영상 재생 목록 반복 모드

### v24.2 描边粗细 | Stroke Width | ストローク幅 | 스트로크 너비
- ✅ 弹幕字体描边粗细调节
- ✅ Danmaku font stroke width adjustment
- ✅ コメントフォントストローク幅調整
- ✅ 댓글 글꼴 스트로크 너비 조정

### v24.3 亮度曲线 | Brightness Curve | 輝度カーブ | 밝기 곡선
- ✅ 视频画面亮度曲线模式
- ✅ Video brightness curve mode
- ✅ 動画輝度カーブモード
- ✅ 동영상 밝기 곡선 모드

### v24.4 发送延迟 | Send Delay | 送信遅延 | 전송 지연
- ✅ 弹幕发送延迟调节
- ✅ Danmaku send delay adjustment
- ✅ コメント送信遅延調整
- ✅ 댓글 전송 지연 조정

### v24.5 音量步进 | Volume Step | 音量ステップ | 볼륨 단계
- ✅ 播放器音量调节步进设置
- ✅ Player volume step setting
- ✅ プレーヤー音量ステップ設定
- ✅ 플레이어 볼륨 단계 설정

### v24.6 缓存清理 | Cache Cleanup | キャッシュクリーンアップ | 캐시 정리
- ✅ 视频缓存自动清理间隔设置
- ✅ Video cache auto cleanup interval
- ✅ 動画キャッシュ自動クリーンアップ間隔
- ✅ 동영상 캐시 자동 정리 간격

### v24.7 位置偏移 | Position Offset | 位置オフセット | 위치 오프셋
- ✅ 弹幕显示位置偏移调节
- ✅ Danmaku display position offset
- ✅ コメント表示位置オフセット
- ✅ 댓글 표시 위치 오프셋

### v24.8 对比度曲线 | Contrast Curve | コントラストカーブ | 대비 곡선
- ✅ 视频画面对比度曲线模式
- ✅ Video contrast curve mode
- ✅ 動画コントラストカーブモード
- ✅ 동영상 대비 곡선 모드

### v24.9 历史记录数 | History Count | 履歴数 | 기록 수
- ✅ 弹幕发送历史记录数量设置
- ✅ Danmaku send history count setting
- ✅ コメント送信履歴数設定
- ✅ 댓글 전송 기록 수 설정

### v24.10 进度条样式 | Progress Bar Style | プログレスバースタイル | 진행 바 스타일
- ✅ 播放器进度条样式自定义
- ✅ Player progress bar style customization
- ✅ プレーヤープログレスバースタイルカスタマイズ
- ✅ 플레이어 진행 바 스타일 사용자 정의

### v24.11 投射质量 | Cast Quality | キャスト品質 | 캐스트 품질
- ✅ 视频投射画面质量设置
- ✅ Video cast quality setting
- ✅ 動画キャスト品質設定
- ✅ 동영상 캐스트 품질 설정

### v24.12 描边透明度 | Stroke Opacity | ストローク透明度 | 스트로크 투명도
- ✅ 弹幕字体描边透明度调节
- ✅ Danmaku font stroke opacity
- ✅ コメントフォントストローク透明度
- ✅ 댓글 글꼴 스트로크 투명도

### v24.13 双击功能 | Double Tap | ダブルタップ | 더블 탭
- ✅ 播放器手势双击功能自定义
- ✅ Player double tap function customization
- ✅ プレーヤーダブルタップ機能カスタマイズ
- ✅ 플레이어 더블 탭 기능 사용자 정의

### v24.14 色调曲线 | Tone Curve | トーンカーブ | 톤 곡선
- ✅ 视频画面色调曲线模式
- ✅ Video tone curve mode
- ✅ 動画トーンカーブモード
- ✅ 동영상 톤 곡선 모드

### v24.15 刷新率 | Refresh Rate | リフレッシュレート | 주사율
- ✅ 弹幕显示刷新率调节
- ✅ Danmaku display refresh rate
- ✅ コメント表示リフレッシュレート
- ✅ 댓글 표시 주사율

### v23.x (AI自动维护版) | AI Maintenance Version
### v23.1 自定义速度预设 | Custom Speed Presets | カスタム速度プリセット | 사용자 정의 속도 프리셋
- ✅ 视频播放速度预设自定义功能
- ✅ Custom playback speed presets
- ✅ 再生速度プリセットカスタマイズ
- ✅ 재생 속도 프리셋 사용자 정의

### v23.2 弹幕阴影颜色 | Shadow Color | シャドウカラー | 그림자 색상
- ✅ 弹幕字体阴影颜色设置
- ✅ Danmaku font shadow color setting
- ✅ コメントフォントシャドウカラー設定
- ✅ 댓글 글꼴 그림자 색상 설정

### v23.3 色彩温度 | Color Temperature | 色温度 | 색온도
- ✅ 视频画面色彩温度调节
- ✅ Video color temperature adjustment
- ✅ 動画色温度調整
- ✅ 동영상 색온도 조정

### v23.4 震动强度 | Vibration Strength | 振動強度 | 진동 강도
- ✅ 弹幕发送震动强度调节
- ✅ Danmaku send vibration strength
- ✅ コメント送信振動強度
- ✅ 댓글 전송 진동 강도

### v23.5 手势灵敏度 | Gesture Sensitivity | ジェスチャー感度 | 제스처 감도
- ✅ 播放器手势灵敏度调节
- ✅ Player gesture sensitivity adjustment
- ✅ プレーヤージェスチャー感度調整
- ✅ 플레이어 제스처 감도 조정

### v23.6 缓存预加载 | Cache Preload | キャッシュプリロード | 캐시 프리로드
- ✅ 视频缓存预加载大小设置
- ✅ Video cache preload size setting
- ✅ 動画キャッシュプリロードサイズ設定
- ✅ 동영상 캐시 프리로드 크기 설정

### v23.7 区域透明度 | Area Opacity | エリア透明度 | 영역 투명도
- ✅ 弹幕显示区域透明度调节
- ✅ Danmaku display area opacity
- ✅ コメント表示エリア透明度
- ✅ 댓글 표시 영역 투명도

### v23.8 伽马值 | Gamma | ガンマ | 감마
- ✅ 视频画面伽马值调节
- ✅ Video gamma value adjustment
- ✅ 動画ガンマ値調整
- ✅ 동영상 감마 값 조정

### v23.9 发送确认震动 | Send Vibration | 送信振動 | 전송 진동
- ✅ 弹幕发送确认震动功能
- ✅ Danmaku send confirmation vibration
- ✅ コメント送信確認振動
- ✅ 댓글 전송 확인 진동

### v23.10 快捷键映射 | Key Mapping | キーマッピング | 키 매핑
- ✅ 播放器快捷键映射功能
- ✅ Player quick key mapping
- ✅ プレーヤーキーマッピング
- ✅ 플레이어 키 매핑

### v23.11 投射缓冲 | Cast Buffer | キャストバッファ | 캐스트 버퍼
- ✅ 视频投射缓冲大小设置
- ✅ Video cast buffer size setting
- ✅ 動画キャストバッファサイズ設定
- ✅ 동영상 캐스트 버퍼 크기 설정

### v23.12 字体间距 | Font Spacing | フォント間隔 | 글꼴 간격
- ✅ 弹幕字体间距调节
- ✅ Danmaku font spacing adjustment
- ✅ コメントフォント間隔調整
- ✅ 댓글 글꼴 간격 조정

### v23.13 截图质量 | Screenshot Quality | スクリーンショット品質 | 스크린샷 품질
- ✅ 播放器截图质量设置
- ✅ Player screenshot quality setting
- ✅ プレーヤースクリーンショット品質設定
- ✅ 플레이어 스크린샷 품질 설정

### v23.14 色调调节 | Hue | 色相 | 색조
- ✅ 视频画面色调调节
- ✅ Video hue adjustment
- ✅ 動画色相調整
- ✅ 동영상 색조 조정

### v23.15 缩放速度 | Zoom Speed | ズーム速度 | 줌 속도
- ✅ 弹幕时间轴缩放速度调节
- ✅ Danmaku timeline zoom speed
- ✅ コメントタイムラインズーム速度
- ✅ 댓글 타임라인 줌 속도

### v22.x (AI自动维护版) | AI Maintenance Version
### v22.1 播放速度曲线 | Speed Curve | 速度カーブ | 속도 곡선
- ✅ 播放速度曲线自定义功能
- ✅ Playback speed curve customization
- ✅ 再生速度カーブカスタマイズ
- ✅ 재생 속도 곡선 사용자 정의

### v22.2 弹幕颜色过滤 | Color Filter | カラーフィルター | 색상 필터
- ✅ 弹幕颜色过滤功能
- ✅ Danmaku color filter feature
- ✅ コメントカラーフィルター機能
- ✅ 댓글 색상 필터 기능

### v22.3 画面锐化强度 | Sharpen Strength | シャープ強度 | 선명도 강도
- ✅ 视频画面锐化强度调节
- ✅ Video sharpen strength adjustment
- ✅ 動画シャープ強度調整
- ✅ 동영상 선명도 강도 조정

### v22.4 弹幕描边效果 | Stroke Effect | ストローク効果 | 스트로크 효과
- ✅ 弹幕描边颜色渐变效果
- ✅ Danmaku stroke gradient effect
- ✅ コメントストロークグラデーション効果
- ✅ 댓글 스트로크 그래디언트 효과

### v22.5 手势轨迹显示 | Gesture Trail | ジェスチャートレイル | 제스처 트레일
- ✅ 播放器手势轨迹显示功能
- ✅ Player gesture trail display
- ✅ プレーヤージェスチャートレイル表示
- ✅ 플레이어 제스처 트레일 표시

### v22.6 视频缓存大小 | Cache Size | キャッシュサイズ | 캐시 크기
- ✅ 视频缓存大小限制功能
- ✅ Video cache size limit feature
- ✅ 動画キャッシュサイズ制限機能
- ✅ 동영상 캐시 크기 제한 기능

### v22.7 弹幕字数统计 | Char Count | 文字数カウント | 글자 수 카운트
- ✅ 弹幕发送字数统计功能
- ✅ Danmaku character count feature
- ✅ コメント文字数カウント機能
- ✅ 댓글 글자 수 카운트 기능

### v22.8 视频画面降噪 | Video Denoise | 動画ノイズ除去 | 동영상 노이즈 제거
- ✅ 视频画面降噪功能
- ✅ Video denoise feature
- ✅ 動画ノイズ除去機能
- ✅ 동영상 노이즈 제거 기능

### v22.9 弹幕透明度曲线 | Opacity Curve | 不透明度カーブ | 불투명도 곡선
- ✅ 弹幕透明度动画曲线功能
- ✅ Danmaku opacity animation curve
- ✅ コメント不透明度アニメーションカーブ
- ✅ 댓글 불투명도 애니메이션 곡선

### v22.10 快捷面板自定义 | Quick Panel | クイックパネル | 빠른 패널
- ✅ 播放器快捷面板自定义功能
- ✅ Player quick panel customization
- ✅ プレーヤークイックパネルカスタマイズ
- ✅ 플레이어 빠른 패널 사용자 정의

### v22.11 投射分辨率限制 | Cast Resolution | キャスト解像度 | 캐스트 해상도
- ✅ 视频投射分辨率限制功能
- ✅ Video cast resolution limit feature
- ✅ 動画キャスト解像度制限機能
- ✅ 동영상 캐스트 해상도 제한 기능

### v22.12 弹幕字体自适应 | Font Auto Size | フォント自動サイズ | 폰트 자동 크기
- ✅ 弹幕字体大小自适应功能
- ✅ Danmaku font auto size feature
- ✅ コメントフォント自動サイズ機能
- ✅ 댓글 폰트 자동 크기 기능

### v22.13 截图格式选择 | Screenshot Format | スクリーンショット形式 | 스크린샷 형식
- ✅ 播放器截图格式选择功能
- ✅ Player screenshot format selection
- ✅ プレーヤースクリーンショット形式選択
- ✅ 플레이어 스크린샷 형식 선택

### v22.14 视频色彩饱和度 | Video Saturation | 動画彩度 | 동영상 채도
- ✅ 视频色彩饱和度调节功能
- ✅ Video saturation adjustment
- ✅ 動画彩度調整機能
- ✅ 동영상 채도 조정 기능

### v22.15 弹幕时间轴标记 | Timeline Marker | タイムラインマーカー | 타임라인 마커
- ✅ 弹幕时间轴标记功能
- ✅ Danmaku timeline marker feature
- ✅ コメントタイムラインマーカー機能
- ✅ 댓글 타임라인 마커 기능

---

### v21.x (AI自动维护版) | AI Maintenance Version
### v21.1 弹幕时间轴缩放 | Timeline Zoom | タイムラインズーム | 타임라인 줌
- ✅ 弹幕时间轴缩放功能
- ✅ Danmaku timeline zoom feature
- ✅ コメントタイムラインズーム
- ✅ 댓글 타임라인 줌

### v21.2 视频画面旋转锁定 | Rotation Lock | 回転ロック | 회전 잠금
- ✅ 视频旋转锁定功能
- ✅ Video rotation lock feature
- ✅ 動画回転ロック
- ✅ 동영상 회전 잠금

### v21.3 弹幕发送失败重试 | Send Retry | 送信リトライ | 전송 재시도
- ✅ 弹幕自动重试功能
- ✅ Danmaku auto retry feature
- ✅ コメント自動リトライ
- ✅ 댓글 자동 재시도

### v21.4 播放速度预设面板 | Speed Preset | 速度プリセット | 속도 프리셋
- ✅ 速度预设面板功能
- ✅ Speed preset panel feature
- ✅ 速度プリセットパネル
- ✅ 속도 프리셋 패널

### v21.5 弹幕收藏导出 | Favorite Export | お気に入りエクスポート | 즐겨찾기 내보내기
- ✅ 弹幕收藏导出功能
- ✅ Danmaku favorite export feature
- ✅ コメントお気に入りエクスポート
- ✅ 댓글 즐겨찾기 내보내기

### v21.6 视频画质自动切换 | Auto Quality | 自動画質切り替え | 자동 화질 전환
- ✅ 自动画质切换功能
- ✅ Auto quality switch feature
- ✅ 自動画質切り替え
- ✅ 자동 화질 전환

### v21.7 弹幕关键词高亮 | Keyword Highlight | キーワードハイライト | 키워드 하이라이트
- ✅ 关键词高亮功能
- ✅ Keyword highlight feature
- ✅ キーワードハイライト
- ✅ 키워드 하이라이트

### v21.8 记住弹幕字体 | Remember Font | フォント記憶 | 폰트 기억
- ✅ 字体记忆功能
- ✅ Font memory feature
- ✅ フォント記憶
- ✅ 폰트 기억

### v21.9 视频投射延迟设置 | Cast Delay | キャスト遅延 | 캐스트 지연
- ✅ 投射延迟设置功能
- ✅ Cast delay feature
- ✅ キャスト遅延設定
- ✅ 캐스트 지연 설정

### v21.10 弹幕智能排队 | Smart Queue | スマートキュー | 스마트 대기열
- ✅ 弹幕智能排队功能
- ✅ Danmaku smart queue feature
- ✅ コメントスマートキュー
- ✅ 댓글 스마트 대기열

### v21.11 播放历史时间线 | History Timeline | 歴史タイムライン | 기록 타임라인
- ✅ 播放历史功能
- ✅ Play history feature
- ✅ 再生歴史
- ✅ 재생 기록

### v21.12 弹幕快速回复 | Quick Reply | クイック返信 | 빠른 답변
- ✅ 快速回复功能
- ✅ Quick reply feature
- ✅ コメントクイック返信
- ✅ 댓글 빠른 답변

### v21.13 视频画面镜像 | Video Mirror | 動画ミラー | 동영상 미러
- ✅ 视频镜像功能
- ✅ Video mirror feature
- ✅ 動画ミラー
- ✅ 동영상 미러

### v21.14 弹幕密度调节 | Density Adjust | 密度調整 | 밀도 조정
- ✅ 弹幕密度调节功能
- ✅ Danmaku density adjust feature
- ✅ コメント密度調整
- ✅ 댓글 밀도 조정

### v21.15 记住播放画质 | Remember Quality | 画質を記憶 | 화질 기억
- ✅ 画质记忆功能
- ✅ Quality memory feature
- ✅ 画質記憶
- ✅ 화질 기억

---

### v20.x (AI自动维护版) | AI Maintenance Version
### v20.1 弹幕彩虹特效 | Rainbow Effect | レインボー効果 | 무지개 효과
- ✅ 弹幕彩虹特效开关
- ✅ Danmaku rainbow effect toggle
- ✅ コメントレインボー効果
- ✅ 댓글 무지개 효과

### v20.2 视频平滑过渡 | Smooth Transition | スムーズ遷移 | 부드러운 전환
- ✅ 视频平滑过渡开关
- ✅ Video smooth transition toggle
- ✅ 動画スムーズ遷移
- ✅ 동영상 부드러운 전환

### v20.3 弹幕打字机效果 | Typewriter Effect | タイプライター効果 | 타자기 효과
- ✅ 弹幕打字机效果开关
- ✅ Danmaku typewriter effect toggle
- ✅ コメントタイプライター効果
- ✅ 댓글 타자기 효과

### v20.4 记住播放列表顺序 | Remember Playlist Order | プレイリスト順序記憶 | 재생목록 순서 기억
- ✅ 播放列表顺序记忆开关
- ✅ Remember playlist order toggle
- ✅ プレイリスト順序記憶
- ✅ 재생목록 순서 기억

### v20.5 弹幕批量复制 | Batch Copy | 一括コピー | 일괄 복사
- ✅ 弹幕批量复制功能
- ✅ Danmaku batch copy feature
- ✅ コメント一括コピー
- ✅ 댓글 일괄 복사

### v20.6 视频投射性能模式 | Cast Performance Mode | キャストパフォーマンスモード | 캐스트 성능 모드
- ✅ 投射性能模式开关
- ✅ Cast performance mode toggle
- ✅ キャストパフォーマンスモード
- ✅ 캐스트 성능 모드

### v20.7 弹幕缩放效果 | Zoom Effect | ズーム効果 | 줌 효과
- ✅ 弹幕缩放效果开关
- ✅ Danmaku zoom effect toggle
- ✅ コメントズーム効果
- ✅ 댓글 줌 효과

### v20.8 视频自动跳过片头 | Auto Skip Opening | オープニング自動スキップ | 오프닝 자동 건너뛰기
- ✅ 自动跳过片头开关
- ✅ Auto skip opening toggle
- ✅ オープニング自動スキップ
- ✅ 오프닝 자동 건너뛰기

### v20.9 弹幕模板回复 | Template Reply | テンプレート返信 | 템플릿 답변
- ✅ 弹幕模板回复功能
- ✅ Danmaku template reply feature
- ✅ コメントテンプレート返信
- ✅ 댓글 템플릿 답변

### v20.10 视频投射省电模式 | Cast Power Saving | キャスト省電力モード | 캐스트 절전 모드
- ✅ 投射省电模式开关
- ✅ Cast power saving toggle
- ✅ キャスト省電力モード
- ✅ 캐스트 절전 모드

### v20.11 弹幕高亮特效 | Highlight Effect | ハイライト効果 | 하이라이트 효과
- ✅ 弹幕高亮特效开关
- ✅ Danmaku highlight effect toggle
- ✅ コメントハイライト効果
- ✅ 댓글 하이라이트 효과

### v20.12 记住播放位置 | Remember Play Position | 再生位置記憶 | 재생 위치 기억
- ✅ 播放位置记忆开关
- ✅ Remember play position toggle
- ✅ 再生位置記憶
- ✅ 재생 위치 기억

### v20.13 弹幕发送动画 | Send Animation | 送信アニメーション | 전송 애니메이션
- ✅ 弹幕发送动画开关
- ✅ Danmaku send animation toggle
- ✅ コメント送信アニメーション
- ✅ 댓글 전송 애니메이션

### v20.14 记住播放跳过 | Remember Skip Settings | スキップ設定記憶 | 건너뛰기 설정 기억
- ✅ 播放跳过设置记忆
- ✅ Remember skip settings toggle
- ✅ スキップ設定記憶
- ✅ 건너뛰기 설정 기억

### v20.15 弹幕3D效果 | 3D Effect | 3D効果 | 3D 효과
- ✅ 弹幕3D效果开关
- ✅ Danmaku 3D effect toggle
- ✅ コメント3D効果
- ✅ 댓글 3D 효과

---

### v19.x (AI自动维护版) | AI Maintenance Version
### v19.1 弹幕动画效果 | Animation | アニメーション効果 | 애니메이션 효과
- ✅ 弹幕动画效果
- ✅ Danmaku animation effect
- ✅ コメントアニメーション効果
- ✅ 댓글 애니메이션 효과

### v19.2 视频弹幕同步 | Video Sync | ビデオ同期 | 동영상 동기화
- ✅ 视频弹幕同步功能
- ✅ Video danmaku sync feature
- ✅ 動画コメント同期
- ✅ 동영상 댓글 동기화

### v19.3 弹幕呼吸灯模式 | Breathing Mode | 呼吸灯モード | 호흡등 모드
- ✅ 弹幕呼吸灯模式
- ✅ Danmaku breathing mode
- ✅ コメント呼吸灯モード
- ✅ 댓글 호흡등 모드

### v19.4 记住播放模式 | Remember Play Mode | 再生モード記憶 | 재생 모드 기억
- ✅ 播放模式记忆
- ✅ Remember play mode toggle
- ✅ 再生モード記憶
- ✅ 재생 모드 기억

### v19.5 弹幕快速复制 | Quick Copy | クイックコピー | 빠른 복사
- ✅ 弹幕快速复制
- ✅ Danmaku quick copy
- ✅ コメントクイックコピー
- ✅ 댓글 빠른 복사

### v19.6 视频投射优先 | Cast Priority | キャスト優先 | 캐스트 우선
- ✅ 视频投射优先设置
- ✅ Video cast priority setting
- ✅ 動画キャスト優先
- ✅ 동영상 캐스트 우선

### v19.7 弹幕收藏功能 | Favorite | お気に入り機能 | 즐겨찾기 기능
- ✅ 弹幕收藏功能
- ✅ Danmaku favorite feature
- ✅ コメントお気に入り機能
- ✅ 댓글 즐겨찾기 기능

### v19.8 记住播放速度 | Remember Playback Speed | 再生速度記憶 | 재생 속도 기억
- ✅ 播放速度记忆
- ✅ Remember playback speed toggle
- ✅ 再生速度記憶
- ✅ 재생 속도 기억

### v19.9 弹幕智能屏蔽 | Smart Block | スマートブロック | 스마트 차단
- ✅ 弹幕智能屏蔽功能
- ✅ Danmaku smart block feature
- ✅ コメントスマートブロック
- ✅ 댓글 스마트 차단

### v19.10 视频记忆亮度 | Remember Brightness | 明るさ記憶 | 밝기 기억
- ✅ 视频亮度记忆
- ✅ Video brightness memory
- ✅ 動画明るさ記憶
- ✅ 동영상 밝기 기억

### v19.11 弹幕屏蔽关键词 | Block Keywords | ブロックキーワード | 차단 키워드
- ✅ 弹幕关键词屏蔽
- ✅ Danmaku keyword block
- ✅ コメントブロックキーワード
- ✅ 댓글 차단 키워드

### v19.12 视频投射镜像 | Cast Mirror | キャストミラー | 캐스트 미러
- ✅ 视频投射镜像功能
- ✅ Video cast mirror feature
- ✅ 動画キャストミラー
- ✅ 동영상 캐스트 미러

### v19.13 弹幕显示延迟 | Display Delay | 表示遅延 | 표시 지연
- ✅ 弹幕显示延迟设置
- ✅ Danmaku display delay setting
- ✅ コメント表示遅延設定
- ✅ 댓글 표시 지연 설정

### v19.14 记住音量 | Remember Volume | 音量記憶 | 음량 기억
- ✅ 音量记忆功能
- ✅ Volume memory feature
- ✅ 音量記憶機能
- ✅ 음량 기억 기능

### v19.15 弹幕背景模糊 | Background Blur | 背景ぼかし | 배경 흐림
- ✅ 弹幕背景模糊效果
- ✅ Danmaku background blur effect
- ✅ コメント背景ぼかし効果
- ✅ 댓글 배경 흐림 효과

---

### v18.x (AI自动维护版) | AI Maintenance Version
### v18.1 弹幕发送确认 | Send Confirm | 送信確認 | 전송 확인
- ✅ 弹幕发送确认功能
- ✅ Danmaku send confirm feature
- ✅ コメント送信確認機能
- ✅ 댓글 전송 확인 기능

### v18.2 视频截图保存 | Screenshot Save | スクリーンショット保存 | 스크린샷 저장
- ✅ 视频截图保存功能
- ✅ Video screenshot save feature
- ✅ 動画スクリーンショット保存
- ✅ 동영상 스크린샷 저장

### v18.3 弹幕透明度动画 | Opacity Animation | 不透明度アニメーション | 불투명도 애니메이션
- ✅ 弹幕透明度动画效果
- ✅ Danmaku opacity animation effect
- ✅ コメント不透明度アニメーション
- ✅ 댓글 불투명도 애니메이션

### v18.4 记住弹幕开关 | Remember Danmaku Enabled | コメントスイッチ記憶 | 댓글 스위치 기억
- ✅ 弹幕开关记忆
- ✅ Danmaku switch memory
- ✅ コメントスイッチ記憶
- ✅ 댓글 스위치 기억

### v18.5 视频投射控制 | Cast Control | キャスト制御 | 캐스트 제어
- ✅ 视频投射控制功能
- ✅ Video cast control feature
- ✅ 動画キャスト制御
- ✅ 동영상 캐스트 제어

### v18.6 弹幕字体大小 | Font Size | フォントサイズ | 폰트 크기
- ✅ 弹幕字体大小设置
- ✅ Danmaku font size setting
- ✅ コメントフォントサイズ設定
- ✅ 댓글 폰트 크기 설정

### v18.7 播放历史记录 | Play History | 再生履歴 | 재생 기록
- ✅ 播放历史记录功能
- ✅ Play history feature
- ✅ 再生履歴機能
- ✅ 재생 기록 기능

### v18.8 弹幕发送颜色 | Send Color | 送信カラー | 전송 색상
- ✅ 弹幕发送颜色设置
- ✅ Danmaku send color setting
- ✅ コメント送信カラー設定
- ✅ 댓글 전송 색상 설정

### v18.9 视频投射音量 | Cast Volume | キャスト音量 | 캐스트 음량
- ✅ 视频投射音量控制
- ✅ Video cast volume control
- ✅ 動画キャスト音量制御
- ✅ 동영상 캐스트 음량 제어

### v18.10 弹幕位置设置 | Position Setting | 位置設定 | 위치 설정
- ✅ 弹幕位置设置功能
- ✅ Danmaku position setting feature
- ✅ コメント位置設定機能
- ✅ 댓글 위치 설정 기능

### v18.11 记住倍速 | Remember Speed | 速度記憶 | 속도 기억
- ✅ 倍速记忆功能
- ✅ Speed memory feature
- ✅ 速度記憶機能
- ✅ 속도 기억 기능

### v18.12 弹幕滚动方向 | Scroll Direction | スクロール方向 | 스크롤 방향
- ✅ 弹幕滚动方向设置
- ✅ Danmaku scroll direction setting
- ✅ コメントスクロール方向設定
- ✅ 댓글 스크롤 방향 설정

### v18.13 视频播放统计 | Play Stats | 再生統計 | 재생 통계
- ✅ 视频播放统计功能
- ✅ Video play stats feature
- ✅ 動画再生統計機能
- ✅ 동영상 재생 통계 기능

### v18.14 弹幕显示模式 | Display Mode | 表示モード | 표시 모드
- ✅ 弹幕显示模式设置
- ✅ Danmaku display mode setting
- ✅ コメント表示モード設定
- ✅ 댓글 표시 모드 설정

### v18.15 记住音量设置 | Remember Volume | 音量設定記憶 | 음량 설정 기억
- ✅ 音量设置记忆
- ✅ Volume setting memory
- ✅ 音量設定記憶
- ✅ 음량 설정 기억

---

### v17.x (AI自动维护版) | AI Maintenance Version
### v17.1 弹幕过滤关键词 | Filter Keyword | フィルターキーワード | 필터 키워드
- ✅ 弹幕关键词过滤
- ✅ Danmaku keyword filter
- ✅ コメントフィルターキーワード
- ✅ 댓글 필터 키워드

### v17.2 视频播放统计 | Play Statistics | 再生統計 | 재생 통계
- ✅ 播放统计功能
- ✅ Play statistics feature
- ✅ 再生統計機能
- ✅ 재생 통계 기능

### v17.3 弹幕字体粗细 | Font Weight | フォントウェイト | 폰트 굵기
- ✅ 弹幕字体粗细设置
- ✅ Danmaku font weight setting
- ✅ コメントフォントウェイト設定
- ✅ 댓글 폰트 굵기 설정

### v17.4 记住播放列表 | Remember Playlist | プレイリスト記憶 | 재생목록 기억
- ✅ 播放列表记忆
- ✅ Playlist memory
- ✅ プレイリスト記憶
- ✅ 재생목록 기억

### v17.5 弹幕速度调节 | Speed Adjustment | 速度調整 | 속도 조정
- ✅ 弹幕速度调节
- ✅ Danmaku speed adjustment
- ✅ コメント速度調整
- ✅ 댓글 속도 조정

### v17.6 视频投射画质 | Cast Quality | キャスト画質 | 캐스트 화질
- ✅ 视频投射画质设置
- ✅ Video cast quality setting
- ✅ 動画キャスト画質設定
- ✅ 동영상 캐스트 화질 설정

### v17.7 弹幕显示区域 | Display Area | 表示エリア | 표시 영역
- ✅ 弹幕显示区域设置
- ✅ Danmaku display area setting
- ✅ コメント表示エリア設定
- ✅ 댓글 표시 영역 설정

### v17.8 快捷键设置 | Shortcut Keys | ショートカットキー | 단축키
- ✅ 快捷键设置功能
- ✅ Shortcut key feature
- ✅ ショートカットキー機能
- ✅ 단축키 기능

### v17.9 弹幕背景色 | Background Color | 背景色 | 배경색
- ✅ 弹幕背景色设置
- ✅ Danmaku background color setting
- ✅ コメント背景色設定
- ✅ 댓글 배경색 설정

### v17.10 记住弹幕设置 | Remember Settings | 設定記憶 | 설정 기억
- ✅ 弹幕设置记忆
- ✅ Settings memory
- ✅ 設定記憶
- ✅ 설정 기억

### v17.11 弹幕发送限制 | Send Limit | 送信制限 | 전송 제한
- ✅ 弹幕发送限制设置
- ✅ Danmaku send limit setting
- ✅ コメント送信制限設定
- ✅ 댓글 전송 제한 설정

### v17.12 视频投射字幕 | Cast Subtitle | キャスト字幕 | 캐스트 자막
- ✅ 视频投射字幕功能
- ✅ Video cast subtitle feature
- ✅ 動画キャスト字幕機能
- ✅ 동영상 캐스트 자막 기능

### v17.13 弹幕样式预设 | Style Preset | スタイルプリセット | 스타일 프리셋
- ✅ 弹幕样式预设
- ✅ Danmaku style preset
- ✅ コメントスタイルプリセット
- ✅ 댓글 스타일 프리셋

### v17.14 播放统计面板 | Stats Panel | 統計パネル | 통계 패널
- ✅ 播放统计面板
- ✅ Play stats panel
- ✅ 再生統計パネル
- ✅ 재생 통계 패널

### v17.15 记住弹幕显示 | Remember Display | 表示記憶 | 표시 기억
- ✅ 弹幕显示记忆
- ✅ Display memory
- ✅ 表示記憶
- ✅ 표시 기억

---

### v16.x (AI自动维护版) | AI Maintenance Version
### v16.1 弹幕描边颜色 | Stroke Color | ストローク色 | 스트로크 색상
- ✅ 弹幕描边颜色设置
- ✅ Danmaku stroke color setting
- ✅ コメントストローク色設定
- ✅ 댓글 스트로크 색상 설정

### v16.2 弹幕抗锯齿 | Anti Aliasing | アンチエイリアス | 안티앨리어싱
- ✅ 弹幕抗锯齿开关
- ✅ Danmaku anti aliasing toggle
- ✅ コメントアンチエイリアス
- ✅ 댓글 안티앨리어싱

### v16.3 视频倍速记忆 | Speed Memory | 速度記憶 | 속도 기억
- ✅ 倍速记忆功能
- ✅ Speed memory feature
- ✅ 速度記憶機能
- ✅ 속도 기억 기능

### v16.4 弹幕发送确认 | Send Confirm | 送信確認 | 전송 확인
- ✅ 弹幕发送确认
- ✅ Danmaku send confirm
- ✅ コメント送信確認
- ✅ 댓글 전송 확인

### v16.5 播放完成后动作 | After Play Action | 再生後アクション | 재생 후 작업
- ✅ 播放完成后动作设置
- ✅ After play action setting
- ✅ 再生後アクション設定
- ✅ 재생 후 작업 설정

### v16.6 弹幕显示区域 | Display Area | 表示エリア | 표시 영역
- ✅ 弹幕显示区域设置
- ✅ Danmaku display area setting
- ✅ コメント表示エリア設定
- ✅ 댓글 표시 영역 설정

### v16.7 视频解码方式 | Decode Mode | デコードモード | 디코드 모드
- ✅ 解码方式设置
- ✅ Decode mode setting
- ✅ デコードモード設定
- ✅ 디코드 모드 설정

### v16.8 弹幕发送框位置 | Send Box Position | 送信ボックス位置 | 전송 상자 위치
- ✅ 发送框位置设置
- ✅ Send box position setting
- ✅ 送信ボックス位置設定
- ✅ 전송 상자 위치 설정

### v16.9 跳过片尾时长 | Skip Ending | エンディングスキップ | 엔딩 건너뛰기
- ✅ 跳过片尾时长设置
- ✅ Skip ending setting
- ✅ エンディングスキップ設定
- ✅ 엔딩 건너뛰기 설정

### v16.10 弹幕粗体模式 | Bold Mode | 太字モード | 굵게 모드
- ✅ 弹幕粗体模式开关
- ✅ Danmaku bold mode toggle
- ✅ コメント太字モード
- ✅ 댓글 굵게 모드

### v16.11 视频投射音量 | Cast Volume | キャスト音量 | 캐스트 음량
- ✅ 投射音量设置
- ✅ Cast volume setting
- ✅ キャスト音量設定
- ✅ 캐스트 음량 설정

### v16.12 记住弹幕密度 | Remember Density | 密度記憶 | 밀도 기억
- ✅ 弹幕密度记忆开关
- ✅ Danmaku density memory toggle
- ✅ コメント密度記憶
- ✅ 댓글 밀도 기억

### v16.13 弹幕刷新率 | Refresh Rate | リフレッシュレート | 새로고침 빈도
- ✅ 弹幕刷新率设置
- ✅ Danmaku refresh rate setting
- ✅ コメントリフレッシュレート設定
- ✅ 댓글 새로고침 빈도 설정

### v16.14 视频截图格式 | Screenshot Format | スクリーンショット形式 | 스크린샷 형식
- ✅ 截图格式设置
- ✅ Screenshot format setting
- ✅ スクリーンショット形式設定
- ✅ 스크린샷 형식 설정

### v16.15 弹幕描边透明度 | Stroke Opacity | ストローク不透明度 | 스트로크 불투명도
- ✅ 弹幕描边透明度设置
- ✅ Danmaku stroke opacity setting
- ✅ コメントストローク不透明度設定
- ✅ 댓글 스트로크 불투명도 설정

---

### v15.x (AI自动维护版) | AI Maintenance Version
### v15.1 弹幕基础设置 | Basic Settings | 基本設定 | 기본 설정
- ✅ 弹幕基础设置
- ✅ Danmaku basic settings
- ✅ コメント基本設定
- ✅ 댓글 기본 설정

### v15.2 弹幕隐藏模式 | Hide Mode | 非表示モード | 숨기기 모드
- ✅ 弹幕隐藏模式开关
- ✅ Danmaku hide mode toggle
- ✅ コメント非表示モード
- ✅ 댓글 숨기기 모드

### v15.3 弹幕显示时长 | Display Duration | 表示時間 | 표시 시간
- ✅ 弹幕显示时长设置
- ✅ Danmaku display duration setting
- ✅ コメント表示時間設定
- ✅ 댓글 표시 시간 설정

### v15.4 弹幕对齐方式 | Alignment | 配置方法 | 정렬 방법
- ✅ 弹幕对齐方式设置
- ✅ Danmaku alignment setting
- ✅ コメント配置方法設定
- ✅ 댓글 정렬 방법 설정

### v15.5 弹幕背景设置 | Background Settings | 背景設定 | 배경 설정
- ✅ 弹幕背景设置
- ✅ Danmaku background settings
- ✅ コメント背景設定
- ✅ 댓글 배경 설정

### v15.6 弹幕阴影设置 | Shadow Settings | シャドウ設定 | 그림자 설정
- ✅ 弹幕阴影设置
- ✅ Danmaku shadow settings
- ✅ コメントシャドウ設定
- ✅ 댓글 그림자 설정

### v15.7 弹幕字体选择 | Font Selection | フォント選択 | 폰트 선택
- ✅ 弹幕字体选择设置
- ✅ Danmaku font selection setting
- ✅ コメントフォント選択設定
- ✅ 댓글 폰트 선택 설정

### v15.8 弹幕刷新间隔 | Refresh Interval | 更新間隔 | 새로고침 간격
- ✅ 弹幕刷新间隔设置
- ✅ Danmaku refresh interval setting
- ✅ コメント更新間隔設定
- ✅ 댓글 새로고침 간격 설정

### v15.9 弹幕显示数量 | Display Count | 表示数 | 표시 수
- ✅ 弹幕显示数量设置
- ✅ Danmaku display count setting
- ✅ コメント表示数設定
- ✅ 댓글 표시 수 설정

### v15.10 弹幕过滤规则 | Filter Rules | フィルタールール | 필터 규칙
- ✅ 弹幕过滤规则设置
- ✅ Danmaku filter rules setting
- ✅ コメントフィルタールール設定
- ✅ 댓글 필터 규칙 설정

### v15.11 弹幕发送速度 | Send Speed | 送信速度 | 전송 속도
- ✅ 弹幕发送速度设置
- ✅ Danmaku send speed setting
- ✅ コメント送信速度設定
- ✅ 댓글 전송 속도 설정

### v15.12 弹幕样式设置 | Style Settings | スタイル設定 | 스타일 설정
- ✅ 弹幕样式设置
- ✅ Danmaku style settings
- ✅ コメントスタイル設定
- ✅ 댓글 스타일 설정

### v15.13 弹幕滚动方向 | Scroll Direction | スクロール方向 | 스크롤 방향
- ✅ 弹幕滚动方向设置
- ✅ Danmaku scroll direction setting
- ✅ コメントスクロール方向設定
- ✅ 댓글 스크롤 방향 설정

### v15.14 弹幕透明度 | Transparency | 透明度 | 투명도
- ✅ 弹幕透明度设置
- ✅ Danmaku transparency setting
- ✅ コメント透明度設定
- ✅ 댓글 투명도 설정

### v15.15 弹幕字体大小 | Font Size | フォントサイズ | 폰트 크기
- ✅ 弹幕字体大小设置
- ✅ Danmaku font size setting
- ✅ コメントフォントサイズ設定
- ✅ 댓글 폰트 크기 설정

### v15.16 弹幕缩放比例 | Zoom Ratio | ズーム比 | 줌 비율
- ✅ 弹幕缩放比例设置
- ✅ Danmaku zoom ratio setting
- ✅ コメントズーム比設定
- ✅ 댓글 줌 비율 설정

### v15.17 弹幕预览模式 | Preview Mode | プレビューモード | 미리보기 모드
- ✅ 弹幕预览模式开关
- ✅ Danmaku preview mode toggle
- ✅ コメントプレビューモード
- ✅ 댓글 미리보기 모드

### v15.18 弹幕发送动画 | Send Animation | 送信アニメーション | 전송 애니메이션
- ✅ 弹幕发送动画设置
- ✅ Danmaku send animation setting
- ✅ コメント送信アニメーション設定
- ✅ 댓글 전송 애니메이션 설정

### v15.19 弹幕快捷键 | Quick Key | ショートカットキー | 단축키
- ✅ 弹幕快捷键设置
- ✅ Danmaku quick key setting
- ✅ コメントショートカットキー設定
- ✅ 댓글 단축키 설정

### v15.20 弹幕历史记录 | History | 履歴 | 기록
- ✅ 弹幕历史记录开关
- ✅ Danmaku history toggle
- ✅ コメント履歴スイッチ
- ✅ 댓글 기록 스위치

### v15.21 弹幕颜色记忆 | Color Memory | 色記憶 | 색상 기억
- ✅ 弹幕颜色记忆开关
- ✅ Danmaku color memory toggle
- ✅ コメント色記憶スイッチ
- ✅ 댓글 색상 기억 스위치

### v15.22 弹幕显示位置 | Display Position | 表示位置 | 표시 위치
- ✅ 弹幕显示位置设置
- ✅ Danmaku display position setting
- ✅ コメント表示位置設定
- ✅ 댓글 표시 위치 설정

### v15.23 弹幕间距调整 | Spacing | 間隔調整 | 간격 조정
- ✅ 弹幕间距调整设置
- ✅ Danmaku spacing setting
- ✅ コメント間隔調整設定
- ✅ 댓글 간격 조정 설정

### v15.24 弹幕描边宽度 | Stroke Width | ストローク幅 | 스트로크 폭
- ✅ 弹幕描边宽度设置
- ✅ Danmaku stroke width setting
- ✅ コメントストローク幅設定
- ✅ 댓글 스트로크 폭 설정

### v15.25 弹幕位置偏移 | Position Offset | 位置オフセット | 위치 오프셋
- ✅ 弹幕位置偏移设置
- ✅ Danmaku position offset setting
- ✅ コメント位置オフセット設定
- ✅ 댓글 위치 오프셋 설정

### v15.26 弹幕不透明度 | Opacity | 不透明度 | 불투명도
- ✅ 弹幕不透明度设置
- ✅ Danmaku opacity setting
- ✅ コメント不透明度設定
- ✅ 댓글 불투명도 설정

### v15.27 记住播放倍速 | Remember Speed | 速度記憶 | 속도 기억
- ✅ 倍速记忆设置
- ✅ Speed memory setting
- ✅ 速度記憶設定
- ✅ 속도 기억 설정

### v15.28 弹幕屏蔽颜色 | Block Color | ブロック色 | 차단 색상
- ✅ 弹幕屏蔽颜色设置
- ✅ Danmaku block color setting
- ✅ コメントブロック色設定
- ✅ 댓글 차단 색상 설정

### v15.29 弹幕粗细调整 | Thickness | 太さ調整 | 두께 조정
- ✅ 弹幕粗细调整设置
- ✅ Danmaku thickness setting
- ✅ コメント太さ調整設定
- ✅ 댓글 두께 조정 설정

### v15.30 弹幕速度记忆 | Speed Memory | 速度記憶 | 속도 기억
- ✅ 弹幕速度记忆开关
- ✅ Danmaku speed memory toggle
- ✅ コメント速度記憶スイッチ
- ✅ 댓글 속도 기억 스위치

---

### v14.x (AI自动维护版) | AI Maintenance Version
### v14.1 自动连播 | Auto Playlist | 自動再生リスト | 자동 재생목록
- ✅ 自动连播功能
- ✅ Auto playlist feature
- ✅ 自動再生リスト機能
- ✅ 자동 재생목록 기능

### v14.2 弹幕透明度预设 | Opacity Preset | 不透明度プリセット | 불투명도 프리셋
- ✅ 弹幕透明度预设
- ✅ Danmaku opacity preset
- ✅ コメント不透明度プリセット
- ✅ 댓글 불투명도 프리셋

### v14.3 播放列表排序方式 | Playlist Sort | プレイリストソート | 재생목록 정렬
- ✅ 播放列表排序方式
- ✅ Playlist sort method
- ✅ プレイリストソート方法
- ✅ 재생목록 정렬 방법

### v14.4 快捷键映射 | Shortcut Mapping | ショートカットマッピング | 단축키 매핑
- ✅ 快捷键映射功能
- ✅ Shortcut mapping feature
- ✅ ショートカットマッピング機能
- ✅ 단축키 매핑 기능

### v14.5 视频对比模式 | Video Compare | 動画比較モード | 동영상 비교 모드
- ✅ 视频对比模式
- ✅ Video compare mode
- ✅ 動画比較モード
- ✅ 동영상 비교 모드

### v14.6 弹幕过滤规则预设 | Filter Preset | フィルタープリセット | 필터 프리셋
- ✅ 弹幕过滤规则预设
- ✅ Danmaku filter preset
- ✅ コメントフィルタープリセット
- ✅ 댓글 필터 프리셋

### v14.7 记住播放倍速 | Remember Speed | 速度記憶 | 속도 기억
- ✅ 播放倍速记忆
- ✅ Playback speed memory
- ✅ 再生速度記憶
- ✅ 재생 속도 기억

### v14.8 弹幕发送快捷键 | Quick Send | クイック送信 | 빠른 전송
- ✅ 弹幕发送快捷键
- ✅ Danmaku quick send key
- ✅ コメントクイック送信キー
- ✅ 댓글 빠른 전송 키

### v14.9 视频缩略图预览 | Thumbnail Preview | サムネイルプレビュー | 썸네일 미리보기
- ✅ 视频缩略图预览
- ✅ Video thumbnail preview
- ✅ 動画サムネイルプレビュー
- ✅ 동영상 썸네일 미리보기

### v14.10 播放历史记录导出 | Export History | 履歴エクスポート | 기록 내보내기
- ✅ 播放历史记录导出
- ✅ Play history export
- ✅ 再生履歴エクスポート
- ✅ 재생 기록 내보내기

### v14.11 弹幕字体阴影 | Text Shadow | テキストシャドウ | 텍스트 그림자
- ✅ 弹幕字体阴影
- ✅ Danmaku text shadow
- ✅ コメントテキストシャドウ
- ✅ 댓글 텍스트 그림자

### v14.12 音频可视化 | Audio Visualizer | オーディオビジュアライザー | 오디오 비주얼라이저
- ✅ 音频可视化功能
- ✅ Audio visualizer feature
- ✅ オーディオビジュアライザー機能
- ✅ 오디오 비주얼라이저 기능

### v14.13 播放失败重试 | Auto Retry | 自動リトライ | 자동 재시도
- ✅ 播放失败重试
- ✅ Auto retry on failure
- ✅ 失敗時自動リトライ
- ✅ 실패 시 자동 재시도

### v14.14 双击反馈震动 | Double Tap Haptic | ダブルタップ振動 | 더블탭 진동
- ✅ 双击反馈震动
- ✅ Double tap haptic feedback
- ✅ ダブルタップ振動フィードバック
- ✅ 더블탭 진동 피드백

### v14.15 弹幕呼吸灯效果 | Breathing Light | 呼吸灯効果 | 호흡등 효과
- ✅ 弹幕呼吸灯效果
- ✅ Danmaku breathing light effect
- ✅ コメント呼吸灯効果
- ✅ 댓글 호흡등 효과

### v14.16 锁屏播放控制 | Lock Screen Control | ロック画面再生制御 | 잠금 화면 재생 제어
- ✅ 锁屏播放控制
- ✅ Lock screen playback control
- ✅ ロック画面再生制御
- ✅ 잠금 화면 재생 제어

### v14.17 跳过结尾动画 | Skip Ending | エンディングスキップ | 엔딩 건너뛰기
- ✅ 跳过结尾动画
- ✅ Skip ending animation
- ✅ エンディングアニメーションスキップ
- ✅ 엔딩 애니메이션 건너뛰기

### v14.18 记忆播放模式 | Remember Play Mode | 再生モード記憶 | 재생 모드 기억
- ✅ 记忆播放模式
- ✅ Remember play mode
- ✅ 再生モード記憶
- ✅ 재생 모드 기억

### v14.19 弹幕池容量 | Pool Size | プールサイズ | 풀 크기
- ✅ 弹幕池容量设置
- ✅ Danmaku pool size setting
- ✅ コメントプールサイズ設定
- ✅ 댓글 풀 크기 설정

### v14.20 视频投射模式 | Cast Mode | キャストモード | 캐스트 모드
- ✅ 视频投射模式
- ✅ Video cast mode
- ✅ 動画キャストモード
- ✅ 동영상 캐스트 모드

---

### v13.x (AI自动维护版) | AI Maintenance Version
### v13.1 手势自定义 | Gesture Custom | ジェスチャーカスタマイズ | 제스처 사용자 정의
- ✅ 手势自定义功能
- ✅ Gesture customization feature
- ✅ ジェスチャーカスタマイズ機能
- ✅ 제스처 사용자 정의 기능

### v13.2 快捷倍速面板 | Quick Speed Panel | クイックスピードパネル | 빠른 속도 패널
- ✅ 快捷倍速面板
- ✅ Quick speed panel
- ✅ クイックスピードパネル
- ✅ 빠른 속도 패널

### v13.3 视频画面分屏对比 | Split Screen | 分割画面比較 | 분할 화면 비교
- ✅ 视频画面分屏对比
- ✅ Video split screen comparison
- ✅ 動画分割画面比較
- ✅ 동영상 분할 화면 비교

### v13.4 视频画面缩放 | Pinch Zoom | ピンチズーム | 핀치 줌
- ✅ 视频画面缩放
- ✅ Video pinch zoom
- ✅ 動画ピンチズーム
- ✅ 동영상 핀치 줌

### v13.5 视频画面平移 | Pan Gesture | パンジェスチャー | 팬 제스처
- ✅ 视频画面平移
- ✅ Video pan gesture
- ✅ 動画パンジェスチャー
- ✅ 동영상 팬 제스처

### v13.6 视频画面画笔标注 | Annotation | アノテーション | 주석
- ✅ 视频画面画笔标注
- ✅ Video annotation
- ✅ 動画アノテーション
- ✅ 동영상 주석

### v13.7 剩余时间倒计时显示 | Countdown | カウントダウン表示 | 카운트다운 표시
- ✅ 剩余时间倒计时显示
- ✅ Remaining time countdown display
- ✅ 残り時間カウントダウン表示
- ✅ 남은 시간 카운트다운 표시

### v13.8 播放速度曲线显示 | Speed Curve | 速度カーブ | 속도 곡선
- ✅ 播放速度曲线显示
- ✅ Playback speed curve display
- ✅ 再生速度カーブ表示
- ✅ 재생 속도 곡선 표시

### v13.9 播放位置百分比显示 | Percentage | パーセント表示 | 퍼센트 표시
- ✅ 播放位置百分比显示
- ✅ Playback position percentage display
- ✅ 再生位置パーセント表示
- ✅ 재생 위치 퍼센트 표시

### v13.10 自定义文字水印 | Custom Watermark | カスタム透かし | 사용자 정의 워터마크
- ✅ 自定义文字水印
- ✅ Custom text watermark
- ✅ カスタムテキスト透かし
- ✅ 사용자 정의 텍스트 워터마크

### v13.10 暗角效果 | Vignette Effect | ビネット効果 | 비네트 효과
- ✅ 暗角效果
- ✅ Vignette effect
- ✅ ビネット効果
- ✅ 비네트 효과

### v13.11 弹幕历史记录 | Danmaku History | コメント履歴 | 댓글 기록
- ✅ 弹幕历史记录
- ✅ Danmaku history
- ✅ コメント履歴機能
- ✅ 댓글 기록 기능

### v13.12 亮度/对比度/饱和度快捷调节 | Quick Adjust | クイック調整 | 빠른 조정
- ✅ 亮度/对比度/饱和度快捷调节
- ✅ Brightness/contrast/saturation quick adjust
- ✅ 輝度/コントラスト/彩度クイック調整
- ✅ 밝기/대비/채도 빠른 조정

### v13.13 音频声道切换 | Audio Channel | オーディオチャンネル | 오디오 채널
- ✅ 音频声道切换
- ✅ Audio channel switch
- ✅ オーディオチャンネル切替
- ✅ 오디오 채널 전환

### v13.14 亮度记忆 | Brightness Memory | 明るさ記憶 | 밝기 기억
- ✅ 亮度记忆功能
- ✅ Brightness memory feature
- ✅ 明るさ記憶機能
- ✅ 밝기 기억 기능

### v13.15 音量记忆 | Volume Memory | 音量記憶 | 음량 기억
- ✅ 音量记忆功能
- ✅ Volume memory feature
- ✅ 音量記憶機能
- ✅ 음량 기억 기능

### v13.16 播放位置记忆 | Position Memory | 再生位置記憶 | 재생 위치 기억
- ✅ 播放位置记忆
- ✅ Playback position memory
- ✅ 再生位置記憶
- ✅ 재생 위치 기억

### v13.17 视频画质记忆 | Quality Memory | 画質記憶 | 화질 기억
- ✅ 视频画质记忆
- ✅ Video quality memory
- ✅ 動画画質記憶
- ✅ 동영상 화질 기억

### v13.18 弹幕描边样式 | Stroke Style | ストロークスタイル | 스트로크 스타일
- ✅ 弹幕描边样式设置
- ✅ Danmaku stroke style setting
- ✅ コメントストロークスタイル設定
- ✅ 댓글 스트로크 스타일 설정

### v13.19 截图保存路径 | Screenshot Path | スクリーンショット保存パス | 스크린샷 저장 경로
- ✅ 截图保存路径设置
- ✅ Screenshot save path setting
- ✅ スクリーンショット保存パス設定
- ✅ 스크린샷 저장 경로 설정

### v13.20 播放速度微调 | Speed Fine Tune | 速度微調整 | 속도 미세 조정
- ✅ 播放速度微调
- ✅ Playback speed fine tune
- ✅ 再生速度微調整
- ✅ 재생 속도 미세 조정

### v13.21 弹幕时间轴预览 | Timeline Preview | タイムラインプレビュー | 타임라인 미리보기
- ✅ 弹幕时间轴预览
- ✅ Danmaku timeline preview
- ✅ コメントタイムラインプレビュー
- ✅ 댓글 타임라인 미리보기

### v13.22 弹幕速度预设 | Speed Preset | 速度プリセット | 속도 프리셋
- ✅ 弹幕速度预设
- ✅ Danmaku speed preset
- ✅ コメント速度プリセット
- ✅ 댓글 속도 프리셋

---

### v12.x (AI自动维护版) | AI Maintenance Version
### v12.1 基础功能 | Basic | 基本機能 | 기본 기능
- ✅ 基础播放功能
- ✅ Basic playback feature
- ✅ 基本再生機能
- ✅ 기본 재생 기능

### v12.2 弹幕优化 | Danmaku Optimization | コメント最適化 | 댓글 최적화
- ✅ 弹幕优化
- ✅ Danmaku optimization
- ✅ コメント最適化
- ✅ 댓글 최적화

### v12.3 弹幕发送历史数量自定义 | History Limit | 履歴数設定 | 기록 수 설정
- ✅ 弹幕发送历史数量自定义
- ✅ Danmaku history limit setting
- ✅ コメント履歴数設定
- ✅ 댓글 기록 수 설정

### v12.4 媒体信息增强 | Enhanced Media Info | メディア情報強化 | 미디어 정보 강화
- ✅ 媒体信息增强
- ✅ Enhanced media info
- ✅ メディア情報強化
- ✅ 미디어 정보 강화

### v12.5 播放器倍速微调 | Fine Speed Control | 速度微調整 | 속도 미세 조정
- ✅ 播放器倍速微调
- ✅ Player fine speed control
- ✅ プレーヤー速度微調整
- ✅ 플레이어 속도 미세 조정

### v12.6 评论楼层跳转 | Comment Floor Jump | コメントフロアジャンプ | 댓글 층 이동
- ✅ 评论楼层跳转
- ✅ Comment floor jump
- ✅ コメントフロアジャンプ
- ✅ 댓글 층 이동

### v12.7 弹幕密度自适应 | Adaptive Density | 密度自動調整 | 밀도 자동 조정
- ✅ 弹幕密度自适应
- ✅ Adaptive danmaku density
- ✅ コメント密度自動調整
- ✅ 댓글 밀도 자동 조정

### v12.8 弹幕高亮颜色自定义 | Highlight Color | ハイライトカラー | 하이라이트 색상
- ✅ 弹幕高亮颜色自定义
- ✅ Danmaku highlight color customization
- ✅ コメントハイライトカラー設定
- ✅ 댓글 하이라이트 색상 설정

### v12.9 长按倍速自定义 | Long Press Speed | 長押し速度 | 길게 누르기 속도
- ✅ 长按倍速自定义
- ✅ Long press speed customization
- ✅ 長押し速度カスタマイズ
- ✅ 길게 누르기 속도 사용자 정의

### v12.10 视频播放位置记忆 | Position Memory | 再生位置記憶 | 재생 위치 기억
- ✅ 视频播放位置记忆
- ✅ Video playback position memory
- ✅ 動画再生位置記憶
- ✅ 동영상 재생 위치 기억

### v12.11 自定义倍速数值输入 | Custom Speed Input | カスタム速度入力 | 사용자 정의 속도 입력
- ✅ 自定义倍速数值输入
- ✅ Custom speed value input
- ✅ カスタム速度値入力
- ✅ 사용자 정의 속도 값 입력

### v12.12 播放器电池电量显示 | Battery Indicator | バッテリーインジケーター | 배터리 표시기
- ✅ 播放器电池电量显示
- ✅ Player battery indicator
- ✅ プレーヤーバッテリーインジケーター
- ✅ 플레이어 배터리 표시기

### v12.13 评论区用户等级颜色标注 | User Level Colors | ユーザーレベル色分け | 사용자 레벨 색상
- ✅ 评论区用户等级颜色标注
- ✅ Comment section user level colors
- ✅ コメント欄ユーザーレベル色分け
- ✅ 댓글 섹션 사용자 레벨 색상

### v12.14 视频画面旋转 | Video Rotation | 動画回転 | 동영상 회전
- ✅ 视频画面旋转
- ✅ Video rotation
- ✅ 動画回転機能
- ✅ 동영상 회전 기능

### v12.15 视频画面镜像 | Video Mirror | 動画ミラー | 동영상 미러
- ✅ 视频画面镜像
- ✅ Video mirror
- ✅ 動画ミラー機能
- ✅ 동영상 미러 기능

### v12.16 画面比例持久化 | Aspect Ratio Memory | アスペクト比記憶 | 화면 비율 기억
- ✅ 画面比例持久化
- ✅ Aspect ratio persistence
- ✅ アスペクト比記憶
- ✅ 화면 비율 기억

### v12.17 跳转到指定时间 | Jump to Time | 時間ジャンプ | 시간 점프
- ✅ 跳转到指定时间
- ✅ Jump to specified time
- ✅ 指定時間へジャンプ
- ✅ 지정된 시간으로 점프

### v12.18 截图水印增强 | Screenshot Watermark | スクリーンショットウォーターマーク | 스크린샷 워터마크
- ✅ 截图水印增强
- ✅ Enhanced screenshot watermark
- ✅ スクリーンショットウォーターマーク強化
- ✅ 스크린샷 워터마크 강화

### v12.19 快进快退时间自定义 | Seek Step Duration | シーク時間設定 | 탐색 시간 설정
- ✅ 快进快退时间自定义
- ✅ Seek step duration customization
- ✅ シーク時間カスタマイズ
- ✅ 탐색 시간 사용자 정의

### v12.20 播放统计信息 | Playback Stats | 再生統計 | 재생 통계
- ✅ 播放统计信息
- ✅ Playback statistics
- ✅ 再生統計情報
- ✅ 재생 통계 정보

### v12.21 播放时长提醒 | Time Reminder | 時間リマインダー | 시간 리마인더
- ✅ 播放时长提醒
- ✅ Playback time reminder
- ✅ 再生時間リマインダー
- ✅ 재생 시간 리마인더

### v12.22 截图水印位置自定义 | Watermark Position | ウォーターマーク位置 | 워터마크 위치
- ✅ 截图水印位置自定义
- ✅ Screenshot watermark position customization
- ✅ スクリーンショットウォーターマーク位置設定
- ✅ 스크린샷 워터마크 위치 설정

### v12.23 弹幕描边颜色自定义 | Stroke Color | ストローク色 | 스트로크 색상
- ✅ 弹幕描边颜色自定义
- ✅ Danmaku stroke color customization
- ✅ コメントストローク色設定
- ✅ 댓글 스트로크 색상 설정

### v12.24 弹幕字体大小滑块调节 | Font Size Slider | フォントサイズスライダー | 폰트 크기 슬라이더
- ✅ 弹幕字体大小滑块调节
- ✅ Danmaku font size slider
- ✅ コメントフォントサイズスライダー
- ✅ 댓글 폰트 크기 슬라이더

### v12.25 视频质量指示器 | Quality Indicator | 画質インジケーター | 화질 표시기
- ✅ 视频质量指示器
- ✅ Video quality indicator
- ✅ 動画画質インジケーター
- ✅ 동영상 화질 표시기

### v12.26 视频色彩调节 | Color Adjustment | 色調調整 | 색조 조정
- ✅ 视频色彩调节
- ✅ Video color adjustment
- ✅ 動画色調調整
- ✅ 동영상 색조 조정

### v12.27 视频画面裁剪 | Video Crop | 動画クロップ | 동영상 크롭
- ✅ 视频画面裁剪
- ✅ Video crop
- ✅ 動画クロップ機能
- ✅ 동영상 크롭 기능

### v12.28 视频画面锐化/模糊 | Sharpen/Blur | シャープ/ぼかし | 선명/흐림
- ✅ 视频画面锐化/模糊
- ✅ Video sharpen/blur
- ✅ 動画シャープ/ぼかし
- ✅ 동영상 선명/흐림

### v12.29 视频画面色温调节 | Color Temperature | 色温度調整 | 색온도 조정
- ✅ 视频画面色温调节
- ✅ Video color temperature adjustment
- ✅ 動画色温度調整
- ✅ 동영상 색온도 조정

### v12.30 视频画面滤镜预设 | Video Filter Presets | 映像フィルター | 동영상 필터
- ✅ 视频画面滤镜预设
- ✅ Video filter presets
- ✅ 映像フィルタープリセット
- ✅ 동영상 필터 프리셋

---

### v11.x (基础版本) | Base Version | ベース版 | 기본 버전

> v11.0.0 - v11.19.0 共20个版本，基于 v4.2 优化内容发布

### v11.0.0 基础优化版 | Basic Optimization | 基本最適化 | 기본 최적화

#### 全面优化 | Full Optimization | 全面最適化 | 전체 최적화
- ✅ 硬件加速 (渲染更快) | Hardware Acceleration (Faster Rendering) | ハードウェアアクセラレーション（高速レンダリング） | 하드웨어 가속 (빠른 렌더링)
- ✅ DiffUtil 列表更新 (更高效) | DiffUtil List Update (More Efficient) | DiffUtilリスト更新（より効率的） | DiffUtil 목록 업데이트 (더 효율적)
- ✅ RecyclerView 缓存优化 (滚动更流畅) | RecyclerView Cache Optimization (Smoother Scrolling) | RecyclerViewキャッシュ最適化（よりスムーズなスクロール） | RecyclerView 캐시 최적화 (더 부드러운 스크롤)

#### 流畅度优化 | Smoothness Optimization | スムーズさ最適化 | 부드러움 최적화
- ✅ ImageLoader 缓存优化 (减少内存占用) | ImageLoader Cache Optimization (Less Memory) | ImageLoaderキャッシュ最適化（メモリ削減） | ImageLoader 캐시 최적화 (메모리 절약)
- ✅ BiliClient 连接池优化 (网络更快) | BiliClient Connection Pool (Faster Network) | BiliClient接続プール（ネットワーク高速化） | BiliClient 연결 풀 (빠른 네트워크)
- ✅ BiliClient HTTP响应缓存 (减少重复请求) | BiliClient HTTP Cache (Fewer Requests) | BiliClient HTTPキャッシュ（リクエスト削減） | BiliClient HTTP 캐시 (요청 감소)

#### 基础优化 | Basic Optimization | 基本最適化 | 기본 최적화
- ✅ 默认播放器: IjkPlayer | Default Player: IjkPlayer | デフォルトプレーヤー: IjkPlayer | 기본 플레이어: IjkPlayer
- ✅ 默认画质: 1080p | Default Quality: 1080p | デフォルト画質: 1080p | 기본 화질: 1080p
- ✅ 图片质量: low (减少内存) | Image Quality: Low (Save Memory) | 画像品質: 低（メモリ節約） | 이미지 품질: 낮음 (메모리 절약)
- ✅ 直播高码率: 开启 | Live High Bitrate: Enabled | ライブ高ビットレート: 有効 | 라이브 고비트레이트: 활성화

### v11.1.0 - v11.19.0 版本列表 | Version List | バージョンリスト | 버전 목록
- v11.0.0 - v11.19.0 (20个版本 | 20 versions | 20バージョン | 20 버전)
- 每个版本均包含上述 v4.2 优化内容
- Each version includes the above v4.2 optimizations
- 各バージョンには上記のv4.2最適化が含まれます
- 각 버전에는 위의 v4.2 최적화가 포함됩니다

---

### v10.x (基础版本) | Base Version | ベース版 | 기본 버전

> v10.0.0 - v10.8.0 共5个版本，基于 v4.2 优化内容发布

### v10.0.0 基础优化版 | Basic Optimization | 基本最適化 | 기본 최적화

#### 全面优化 | Full Optimization | 全面最適化 | 전체 최적화
- ✅ 硬件加速 (渲染更快) | Hardware Acceleration (Faster Rendering) | ハードウェアアクセラレーション（高速レンダリング） | 하드웨어 가속 (빠른 렌더링)
- ✅ DiffUtil 列表更新 (更高效) | DiffUtil List Update (More Efficient) | DiffUtilリスト更新（より効率的） | DiffUtil 목록 업데이트 (더 효율적)
- ✅ RecyclerView 缓存优化 (滚动更流畅) | RecyclerView Cache Optimization (Smoother Scrolling) | RecyclerViewキャッシュ最適化（よりスムーズなスクロール） | RecyclerView 캐시 최적화 (더 부드러운 스크롤)

#### 流畅度优化 | Smoothness Optimization | スムーズさ最適化 | 부드러움 최적화
- ✅ ImageLoader 缓存优化 (减少内存占用) | ImageLoader Cache Optimization (Less Memory) | ImageLoaderキャッシュ最適化（メモリ削減） | ImageLoader 캐시 최적화 (메모리 절약)
- ✅ BiliClient 连接池优化 (网络更快) | BiliClient Connection Pool (Faster Network) | BiliClient接続プール（ネットワーク高速化） | BiliClient 연결 풀 (빠른 네트워크)
- ✅ BiliClient HTTP响应缓存 (减少重复请求) | BiliClient HTTP Cache (Fewer Requests) | BiliClient HTTPキャッシュ（リクエスト削減） | BiliClient HTTP 캐시 (요청 감소)

#### 基础优化 | Basic Optimization | 基本最適化 | 기본 최적화
- ✅ 默认播放器: IjkPlayer | Default Player: IjkPlayer | デフォルトプレーヤー: IjkPlayer | 기본 플레이어: IjkPlayer
- ✅ 默认画质: 1080p | Default Quality: 1080p | デフォルト画質: 1080p | 기본 화질: 1080p
- ✅ 图片质量: low (减少内存) | Image Quality: Low (Save Memory) | 画像品質: 低（メモリ節約） | 이미지 품질: 낮음 (메모리 절약)
- ✅ 直播高码率: 开启 | Live High Bitrate: Enabled | ライブ高ビットレート: 有効 | 라이브 고비트레이트: 활성화

### v10.1.0 - v10.8.0 版本列表 | Version List | バージョンリスト | 버전 목록
- v10.0.0, v10.1.0, v10.3.0, v10.5.0, v10.8.0 (5个版本 | 5 versions | 5バージョン | 5 버전)
- 每个版本均包含上述 v4.2 优化内容
- Each version includes the above v4.2 optimizations
- 各バージョンには上記のv4.2最適化が含まれます
- 각 버전에는 위의 v4.2 최적화가 포함됩니다

---

### v9.x (AI增强版) | AI Enhanced Edition | AI強化版 | AI 강화판

### v9.1 视频详情页显示BV号 | Show BV Number | BV番号表示 | BV 번호 표시
- ✅ 视频详情页显示BV号
- ✅ Video detail page shows BV number
- ✅ 動画詳細ページにBV番号表示
- ✅ 동영상 상세 페이지에 BV 번호 표시

### v9.2 评论排序偏好记忆 | Comment Sort Memory | コメントソート記憶 | 댓글 정렬 기억
- ✅ 评论排序偏好记忆
- ✅ Comment sort preference memory
- ✅ コメントソート設定記憶
- ✅ 댓글 정렬 설정 기억

### v9.3 播放器显示实际渲染帧率 | Show Render FPS | 実際FPS表示 | 실제 FPS 표시
- ✅ 播放器显示实际渲染帧率
- ✅ Player shows actual render FPS
- ✅ プレーヤーに実際のFPS表示
- ✅ 플레이어에 실제 FPS 표시

### v9.4 播放器显示视频宽高比 | Show Aspect Ratio | アスペクト比表示 | 화면 비율 표시
- ✅ 播放器显示视频宽高比
- ✅ Player shows video aspect ratio
- ✅ プレーヤーにアスペクト比表示
- ✅ 플레이어에 화면 비율 표시

### v9.6 弹幕发送震动反馈 | Danmaku Haptic | コメント振動フィードバック | 댓글 진동 피드백
- ✅ 弹幕发送震动反馈
- ✅ Danmaku send haptic feedback
- ✅ コメント送信振動フィードバック
- ✅ 댓글 전송 진동 피드백

### v9.0 - v9.9 版本列表 | Version List | バージョンリスト | 버전 목록
- v9.0.0 - v9.9.0 (10个版本 | 10 versions | 10バージョン | 10 버전)

---

### v8.x (AI增强版) | AI Enhanced Edition | AI強化版 | AI 강화판

### v8.2 播放器显示视频比特率 | Show Bitrate | ビットレート表示 | 비트레이트 표시
- ✅ 播放器显示视频比特率
- ✅ Player shows video bitrate
- ✅ プレーヤーにビットレート表示
- ✅ 플레이어에 비트레이트 표시

### v8.3 播放器显示音频编码格式 | Show Audio Codec | オーディオコーデック表示 | 오디오 코덱 표시
- ✅ 播放器显示音频编码格式
- ✅ Player shows audio codec format
- ✅ プレーヤーにオーディオコーデック表示
- ✅ 플레이어에 오디오 코덱 표시

### v8.4 播放器显示音频采样率 | Show Sample Rate | サンプルレート表示 | 샘플레이트 표시
- ✅ 播放器显示音频采样率
- ✅ Player shows audio sample rate
- ✅ プレーヤーにサンプルレート表示
- ✅ 플레이어에 샘플레이트 표시

### v8.5 播放器完整媒体信息 | Full Media Info | 完全メディア情報 | 전체 미디어 정보
- ✅ 播放器完整媒体信息
- ✅ Player full media info display
- ✅ プレーヤー完全メディア情報
- ✅ 플레이어 전체 미디어 정보

### v8.8 下载视频画质选择 | Download Quality | ダウンロード画質選択 | 다운로드 화질 선택
- ✅ 下载视频画质选择
- ✅ Download video quality selection
- ✅ ダウンロード画質選択
- ✅ 다운로드 화질 선택

### v8.0 - v8.8 版本列表 | Version List | バージョンリスト | 버전 목록
- v8.0.0 - v8.8.0 (9个版本 | 9 versions | 9バージョン | 9 버전)

---

### v7.x (AI增强版) | AI Enhanced Edition | AI強化版 | AI 강화판

### v7.0 跳过片头片尾 | Skip Intro/Outro | イントロ/アウトロスキップ | 인트로/아웃로 건너뛰기
- ✅ 跳过片头片尾
- ✅ Skip intro and outro
- ✅ イントロ/アウトロスキップ
- ✅ 인트로/아웃로 건너뛰기

### v7.1 耳机断开自动暂停 | Auto Pause on Disconnect | イヤホン切断一時停止 | 이어폰 연결 해제 자동 일시정지
- ✅ 耳机断开自动暂停
- ✅ Auto pause when headphones disconnected
- ✅ イヤホン切断時自動一時停止
- ✅ 이어폰 연결 해제 시 자동 일시정지

### v7.2 AB循环播放 | AB Repeat | ABリピート | AB 반복
- ✅ AB循环播放
- ✅ AB repeat playback
- ✅ ABリピート再生
- ✅ AB 반복 재생

### v7.3 截图文件名含视频标题 | Screenshot Filename | スクリーンショットファイル名 | 스크린샷 파일명
- ✅ 截图文件名含视频标题
- ✅ Screenshot filename includes video title
- ✅ スクリーンショットファイル名に動画タイトル
- ✅ 스크린샷 파일명에 동영상 제목 포함

### v7.4 随机播放模式 | Shuffle Mode | シャッフルモード | 셔플 모드
- ✅ 随机播放模式
- ✅ Shuffle playback mode
- ✅ シャッフル再生モード
- ✅ 셔플 재생 모드

### v7.8 评论区显示用户签名 | Show User Bio | ユーザー署名表示 | 사용자 서명 표시
- ✅ 评论区显示用户签名
- ✅ Comment section shows user bio
- ✅ コメント欄にユーザーバイオ表示
- ✅ 댓글 섹션에 사용자 서명 표시

### v7.0 - v7.9 版本列表 | Version List | バージョンリスト | 버전 목록
- v7.0.0 - v7.9.0 (10个版本 | 10 versions | 10バージョン | 10 버전)

---

### v6.x (AI增强版) | AI Enhanced Edition | AI強化版 | AI 강화판

### v6.0 评论图片保存 | Save Comment Image | コメント画像保存 | 댓글 이미지 저장
- ✅ 评论图片保存
- ✅ Save comment images
- ✅ コメント画像保存
- ✅ 댓글 이미지 저장

### v6.1 倍速切换提示 | Speed Switch Toast | 速度切替トースト | 속도 전환 알림
- ✅ 倍速切换提示
- ✅ Speed switch toast notification
- ✅ 速度切替トースト通知
- ✅ 속도 전환 알림

### v6.4 弹幕关键词高亮 | Keyword Highlight | キーワードハイライト | 키워드 하이라이트
- ✅ 弹幕关键词高亮
- ✅ Danmaku keyword highlight
- ✅ コメントキーワードハイライト
- ✅ 댓글 키워드 하이라이트

### v6.6 弹幕发送按钮 | Danmaku Send Button | コメント送信ボタン | 댓글 전송 버튼
- ✅ 弹幕发送按钮
- ✅ Danmaku send button
- ✅ コメント送信ボタン
- ✅ 댓글 전송 버튼

### v6.8 播放速度记忆 | Speed Memory | 速度記憶 | 속도 기억
- ✅ 播放速度记忆
- ✅ Playback speed memory
- ✅ 再生速度記憶
- ✅ 재생 속도 기억

### v6.0 - v6.9 版本列表 | Version List | バージョンリスト | 버전 목록
- v6.0.0 - v6.9.0 (10个版本 | 10 versions | 10バージョン | 10 버전)

---

### v5.x (AI增强版) | AI Enhanced Edition | AI強化版 | AI 강화판

### v5.0 个性化设置 | Personalization | パーソナライゼーション | 개인화 설정
- ✅ 主题色：深海蓝（GitHub风格深色）、极光绿（护眼绿色）
- ✅ 全局字体大小设置：10档缩放（0.80x~1.30x）
- ✅ 主题选择扩展至5种：默认/小电视粉/经典/深海蓝/极光绿
- ✅ Theme colors: Deep Sea Blue (GitHub Dark), Aurora Green (Eye Protection)
- ✅ Global font size: 10 levels (0.80x~1.30x)
- ✅ 5 themes: Default/Pink/Classic/Deep Sea Blue/Aurora Green
- ✅ テーマカラー：深海青（GitHubダーク）、オーロラグリーン（アイ保護）
- ✅ フォントサイズ：10段階（0.80x～1.30x）
- ✅ テーマ5種：デフォルト/ピンク/クラシック/深海青/オーロラグリーン
- ✅ 테마 색상: 심해 블루 (GitHub 다크), 오로라 그린 (눈 보호)
- ✅ 글꼴 크기: 10단계 (0.80x~1.30x)
- ✅ 테마 5종: 기본/핑크/클래식/심해 블루/오로라 그린

### v5.1 投屏增强 | Cast Enhancement | キャスト強化 | 캐스트 강화
- ✅ DLNA音量控制（SetVolume 0-100%）
- ✅ 投屏进度同步（GetPositionInfo 每3秒刷新）
- ✅ 自动重连（断开后3次指数退避 2/4/6秒）
- ✅ 投屏控制面板（音量调节+断开连接）
- ✅ 长按投屏按钮快速断开
- ✅ DLNA volume control (SetVolume 0-100%)
- ✅ Cast progress sync (GetPositionInfo every 3s)
- ✅ Auto reconnect (3 retries with exponential backoff 2/4/6s)
- ✅ Cast control panel (volume + disconnect)
- ✅ Long press cast button to quick disconnect
- ✅ DLNA音量制御（SetVolume 0-100%）
- ✅ キャスト進行同期（GetPositionInfo 3秒ごと）
- ✅ 自動再接続（3回指数バックオフ 2/4/6秒）
- ✅ キャスト制御パネル（音量+切断）
- ✅ 長押しキャストボタンで即時切断
- ✅ DLNA 음량 제어 (SetVolume 0-100%)
- ✅ 캐스트 진행 동기화 (GetPositionInfo 3초마다)
- ✅ 자동 재연결 (3회 지수 백오프 2/4/6초)
- ✅ 캐스트 제어 패널 (음량 + 연결 해제)
- ✅ 길게 누르기 캐스트 버튼으로 빠른 연결 해제

### v5.2 评论楼层号 | Comment Floor Number | コメントフロア番号 | 댓글 층 번호
- ✅ 评论区显示楼层号（如"123楼 · 2024-01-01"）
- ✅ 解析B站API返回的floor字段并展示
- ✅ Comment section shows floor number (e.g. "Floor 123")
- ✅ Parse and display floor field from Bilibili API
- ✅ コメント欄にフロア番号表示（例：「123階」）
- ✅ Bilibili APIのfloorフィールドを解析して表示
- ✅ 댓글 섹션에 층 번호 표시 (예: "123층")
- ✅ 빌리빌리 API의 floor 필드를 파싱하여 표시

### v5.5 评论排序增强 | Comment Sort Enhancement | コメントソート強化 | 댓글 정렬 강화
- ✅ 三种排序方式：按时间/按热度/按回复数
- ✅ 评论排序偏好记忆
- ✅ Three sort modes: By Time/By Likes/By Replies
- ✅ Comment sort preference memory
- ✅ 3つのソート：時間順/人気順/返信数順
- ✅ コメントソート設定記憶
- ✅ 정렬 3가지: 시간순/인기순/답변수순
- ✅ 댓글 정렬 설정 기억

### v5.7 双击手势自定义 | Double Tap Custom | ダブルタップカスタマイズ | 더블탭 사용자 정의
- ✅ 双击手势自定义（快进/快退/点赞/收藏）
- ✅ Double tap gesture customization (forward/backward/like/favorite)
- ✅ ダブルタップカスタマイズ（早送り/巻き戻し/いいね/お気に入り）
- ✅ 더블탭 제스처 사용자 정의 (앞으로/뒤로/좋아요/즐겨찾기)

### v5.8 省流模式 | Data Saver Mode | データセーバーモード | 데이터 세이버 모드
- ✅ 省流模式（限制画质、减少预加载）
- ✅ Data saver mode (limit quality, reduce preload)
- ✅ データセーバーモード（画質制限、プリロード削減）
- ✅ 데이터 세이버 모드 (화질 제한, 프리로드 감소)

### v5.9 视频分享增强 | Share Enhancement | 共有強化 | 공유 강화
- ✅ 视频分享增强（生成分享海报）
- ✅ Video share enhancement (generate share poster)
- ✅ 動画共有強化（シェアポスター生成）
- ✅ 동영상 공유 강화 (공유 포스터 생성)

### v5.0 - v5.9 版本列表 | Version List | バージョンリスト | 버전 목록
- v5.0.0 - v5.9.0 (10个版本 | 10 versions | 10バージョン | 10 버전)

---

### v4.x (初始优化版) | Initial Optimization | 初期最適化 | 초기 최적화

### v4.0 初始优化 | Initial Optimization | 初期最適化 | 초기 최적화
- ✅ 保守优化策略：保持原版内核不变
- ✅ 默认配置优化：IjkPlayer、1080p、low图片质量、直播高码率
- ✅ 设备适配：当贝盒子H5 (全志H618四核, 2GB RAM, Android 12)
- ✅ Conservative optimization: Keep original kernel unchanged
- ✅ Default settings: IjkPlayer, 1080p, low image quality, live high bitrate
- ✅ Device: Dangbei H5 (Allwinner H618, 2GB RAM, Android 12)
- ✅ 保守的最適化：オリジナルカーネルを変更しない
- ✅ デフォルト設定：IjkPlayer、1080p、低画質、ライブ高ビットレート
- ✅ 対応デバイス：Dangbei H5 (Allwinner H618, 2GB RAM, Android 12)
- ✅ 보수적 최적화: 원본 커널 변경 없음
- ✅ 기본 설정: IjkPlayer, 1080p, 저화질, 라이브 고비트레이트
- ✅ 지원 기기: Dangbei H5 (Allwinner H618, 2GB RAM, Android 12)

### v4.1 流畅度优化 | Smoothness Optimization | スムーズさ最適化 | 부드러움 최적화
- ✅ ImageLoader 缓存优化
- ✅ BiliClient 连接池优化
- ✅ BiliClient HTTP响应缓存
- ✅ ImageLoader cache optimization
- ✅ BiliClient connection pool optimization
- ✅ BiliClient HTTP response cache
- ✅ ImageLoaderキャッシュ最適化
- ✅ BiliClient接続プール最適化
- ✅ BiliClient HTTPレスポンスキャッシュ
- ✅ ImageLoader 캐시 최적화
- ✅ BiliClient 연결 풀 최적화
- ✅ BiliClient HTTP 응답 캐시

### v4.2 全面优化 | Full Optimization | 全面最適化 | 전체 최적화
- ✅ 硬件加速 (渲染更快)
- ✅ DiffUtil 列表更新 (更高效)
- ✅ RecyclerView 缓存优化 (滚动更流畅)
- ✅ Hardware acceleration (faster rendering)
- ✅ DiffUtil list update (more efficient)
- ✅ RecyclerView cache optimization (smoother scrolling)
- ✅ ハードウェアアクセラレーション（高速レンダリング）
- ✅ DiffUtilリスト更新（より効率的）
- ✅ RecyclerViewキャッシュ最適化（よりスムーズなスクロール）
- ✅ 하드웨어 가속 (빠른 렌더링)
- ✅ DiffUtil 목록 업데이트 (더 효율적)
- ✅ RecyclerView 캐시 최적화 (더 부드러운 스크롤)

### v4.4 四大功能 | Four Features | 4つの機能 | 4가지 기능
- ✅ 手势方向动画（音量/进度/亮度指示器）
- ✅ 截图分享功能
- ✅ 画质智能监控（缓冲频率检测提示切换画质）
- ✅ 收藏夹创建功能
- ✅ Gesture direction animation (volume/progress/brightness indicator)
- ✅ Screenshot sharing
- ✅ Smart quality monitor (buffer frequency detection)
- ✅ Favorites creation
- ✅ ジェスチャー方向アニメーション（音量/進行/明るさインジケーター）
- ✅ スクリーンショット共有
- ✅ スマート画質モニター（バッファ頻度検出）
- ✅ お気に入り作成
- ✅ 제스처 방향 애니메이션 (음량/진행/밝기 표시기)
- ✅ 스크린샷 공유
- ✅ 스마트 화질 모니터 (버퍼 빈도 감지)
- ✅ 즐겨찾기 생성

### v4.5 直播优化 | Live Optimization | ライブ最適化 | 라이브 최적화
- ✅ 直播自动重连（5次指数退避，2/4/8/16/32秒）
- ✅ 截图分享（PixelCopy API）
- ✅ TextureView渲染支持
- ✅ Live auto reconnect (5 retries with exponential backoff 2/4/8/16/32s)
- ✅ Screenshot sharing (PixelCopy API)
- ✅ TextureView rendering support
- ✅ ライブ自動再接続（5回指数バックオフ 2/4/8/16/32秒）
- ✅ スクリーンショット共有（PixelCopy API）
- ✅ TextureViewレンダリングサポート
- ✅ 라이브 자동 재연결 (5회 지수 백오프 2/4/8/16/32초)
- ✅ 스크린샷 공유 (PixelCopy API)
- ✅ TextureView 렌더링 지원

### v4.6 画中画 + 隐私保护 | PiP + Privacy | PiP + プライバシー | PiP + 개인정보 보호
- ✅ 画中画模式
- ✅ 直播帧数显示
- ✅ 隐私保护模式
- ✅ Picture-in-Picture mode
- ✅ Live FPS display
- ✅ Privacy protection mode
- ✅ ピクチャーインピクチャーモード
- ✅ ライブFPS表示
- ✅ プライバシー保護モード
- ✅ PiP 모드
- ✅ 라이브 FPS 표시
- ✅ 개인정보 보호 모드

### v4.7 弹幕快捷设置 | Danmaku Quick Settings | コメントクイック設定 | 댓글 빠른 설정
- ✅ 弹幕快捷设置面板
- ✅ 弹幕透明度/速度/字体大小快捷调节
- ✅ Danmaku quick settings panel
- ✅ Danmaku opacity/speed/font size quick adjustment
- ✅ コメントクイック設定パネル
- ✅ コメント透明度/速度/フォントサイズクイック調整
- ✅ 댓글 빠른 설정 패널
- ✅ 댓글 불투명도/속도/폰트 크기 빠른 조정

### v4.8 - v4.13 功能合集 | Feature Collection | 機能コレクション | 기능 모음
- ✅ 多项功能优化和bug修复
- ✅ Multiple feature optimizations and bug fixes
- ✅ 多数の機能最適化とバグ修正
- ✅ 다수의 기능 최적화 및 버그 수정

### v4.14 直播开播提醒 | Live Stream Alert | ライブ配信アラート | 라이브 방송 알림
- ✅ 直播开播提醒功能
- ✅ Live stream start notification
- ✅ ライブ配信開始通知
- ✅ 라이브 방송 시작 알림

### v4.0 - v4.14 版本列表 | Version List | バージョンリスト | 버전 목록
- v4.0.0 - v4.14.0 (10个版本 | 10 versions | 10バージョン | 10 버전)

---

## 📊 项目统计 | Project Stats | プロジェクト統計 | 프로젝트 통계

- **总版本数 | Total Versions**: v4.0.0 - v45.15 (650+ versions)
- **初始优化版本 | Initial Optimization**: v4.0.0 - v4.14.0 (10 versions)
- **AI增强版本 | AI Enhanced**: v5.0.0 - v9.9.0 (50+ versions)
- **基础版本 | Base Versions**: v10.0.0 - v11.19.0 (25 versions)
- **AI自动维护版本 | AI Maintained**: v12.1 - v45.15 (550+ versions)
- **开发周期 | Development Cycle**: 2024 - 2026
- **功能特性 | Features**: 2000+ new features added