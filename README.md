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
- **v100.15** - 2026-06-07

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
- **功能特性 | Features**: 1000+ new features added