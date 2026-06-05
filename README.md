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
- **v55.15** - 2026-06-05

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
- **功能特性 | Features**: 575+ new features added