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
- **v70.15** - 2026-06-05

---

## 📊 版本更新日志 | Version Changelog | バージョン更新履歴 | 버전 변경 로그

### v31.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v31.1-v31.15 功能列表
- ✅ 弹幕重叠自动合并, 静音片段自动跳过, 字幕字号自动适配, 预缓冲时长, 弹幕防刷等级, 视频反交错模式, 音频夜间模式, 弹幕关键词高亮, 画中画模式支持, A-B循环播放, 弹幕层级排序, 字幕同步偏移, 播放自动恢复, 弹幕屏蔽用户等级, 视频解码优先级

### v31.1 弹幕重叠自动合并 | Auto-merge overlapping danmaku | 重複コメント自動マージ | 중복 댓글 자동 병합
- ✅ 弹幕重叠自动合并
- ✅ Auto-merge overlapping danmaku
- ✅ 重複コメント自動マージ
- ✅ 중복 댓글 자동 병합

### v31.2 静音片段自动跳过 | Auto-skip silent segments | 無音部分自動スキップ | 무음 구간 자동 건너뛰기
- ✅ 静音片段自动跳过
- ✅ Auto-skip silent segments
- ✅ 無音部分自動スキップ
- ✅ 무음 구간 자동 건너뛰기

### v31.3 字幕字号自动适配 | Auto-fit subtitle font size | 字幕フォントサイズ自動調整 | 자막 글꼴 크기 자동 조정
- ✅ 字幕字号自动适配
- ✅ Auto-fit subtitle font size
- ✅ 字幕フォントサイズ自動調整
- ✅ 자막 글꼴 크기 자동 조정

### v31.4 预缓冲时长 | Pre-buffer duration | プリバッファ時間 | 사전 버퍼 시간
- ✅ 预缓冲时长
- ✅ Pre-buffer duration
- ✅ プリバッファ時間
- ✅ 사전 버퍼 시간

### v31.5 弹幕防刷等级 | Danmaku anti-spam level | コメントスパム防止レベル | 댓글 스팸 방지 레벨
- ✅ 弹幕防刷等级
- ✅ Danmaku anti-spam level
- ✅ コメントスパム防止レベル
- ✅ 댓글 스팸 방지 레벨

### v31.6 视频反交错模式 | Video deinterlace mode | 動画インターレース解除モード | 비디오 인터레이스 해제 모드
- ✅ 视频反交错模式
- ✅ Video deinterlace mode
- ✅ 動画インターレース解除モード
- ✅ 비디오 인터레이스 해제 모드

### v31.7 音频夜间模式 | Audio night mode | 音声ナイトモード | 오디오 나이트 모드
- ✅ 音频夜间模式
- ✅ Audio night mode
- ✅ 音声ナイトモード
- ✅ 오디오 나이트 모드

### v31.8 弹幕关键词高亮 | Danmaku keyword highlight | コメントキーワードハイライト | 댓글 키워드 강조
- ✅ 弹幕关键词高亮
- ✅ Danmaku keyword highlight
- ✅ コメントキーワードハイライト
- ✅ 댓글 키워드 강조

### v31.9 画中画模式支持 | Picture-in-Picture support | ピクチャーインピクチャー対応 | PIP 모드 지원
- ✅ 画中画模式支持
- ✅ Picture-in-Picture support
- ✅ ピクチャーインピクチャー対応
- ✅ PIP 모드 지원

### v31.10 A-B循环播放 | A-B loop playback | A-Bループ再生 | A-B 루프 재생
- ✅ A-B循环播放
- ✅ A-B loop playback
- ✅ A-Bループ再生
- ✅ A-B 루프 재생

### v31.11 弹幕层级排序 | Danmaku layer order | コメントレイヤー順序 | 댓글 레이어 순서
- ✅ 弹幕层级排序
- ✅ Danmaku layer order
- ✅ コメントレイヤー順序
- ✅ 댓글 레이어 순서

### v31.12 字幕同步偏移 | Subtitle sync offset | 字幕同期オフセット | 자막 동기화 오프셋
- ✅ 字幕同步偏移
- ✅ Subtitle sync offset
- ✅ 字幕同期オフセット
- ✅ 자막 동기화 오프셋

### v31.13 播放自动恢复 | Auto-resume playback | 再生自動再開 | 재생 자동 재개
- ✅ 播放自动恢复
- ✅ Auto-resume playback
- ✅ 再生自動再開
- ✅ 재생 자동 재개

### v31.14 弹幕屏蔽用户等级 | Danmaku block user level | コメントユーザーレベルブロック | 댓글 사용자 레벨 차단
- ✅ 弹幕屏蔽用户等级
- ✅ Danmaku block user level
- ✅ コメントユーザーレベルブロック
- ✅ 댓글 사용자 레벨 차단

### v31.15 视频解码优先级 | Video codec priority | 動画コーデック優先度 | 비디오 코덱 우선순위
- ✅ 视频解码优先级
- ✅ Video codec priority
- ✅ 動画コーデック優先度
- ✅ 비디오 코덱 우선순위


### v32.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v32.1-v32.15 功能列表
- ✅ 息屏定时器, 弹幕雨模式, 音频声道交换, 视频缩放手势, 弹幕时间戳显示, 自动移除已播放项, 后台播放, 双语字幕, 弹幕透明度渐隐, 变速平滑过渡, 音频虚拟环绕声, 弹幕气泡样式, 播放器锁定超时, 视频裁剪预设, 弹幕表情过滤

### v32.1 息屏定时器 | Screen-off timer | 画面オフタイマー | 화면 끄기 타이머
- ✅ 息屏定时器
- ✅ Screen-off timer
- ✅ 画面オフタイマー
- ✅ 화면 끄기 타이머

### v32.2 弹幕雨模式 | Danmaku rain mode | コメントレインモード | 댓글 비 모드
- ✅ 弹幕雨模式
- ✅ Danmaku rain mode
- ✅ コメントレインモード
- ✅ 댓글 비 모드

### v32.3 音频声道交换 | Audio channel swap | 音声チャンネルスワップ | 오디오 채널 스왑
- ✅ 音频声道交换
- ✅ Audio channel swap
- ✅ 音声チャンネルスワップ
- ✅ 오디오 채널 스왑

### v32.4 视频缩放手势 | Video zoom gesture | 動画ズームジェスチャー | 비디오 줌 제스처
- ✅ 视频缩放手势
- ✅ Video zoom gesture
- ✅ 動画ズームジェスチャー
- ✅ 비디오 줌 제스처

### v32.5 弹幕时间戳显示 | Danmaku timestamp display | コメントタイムスタンプ表示 | 댓글 타임스탬프 표시
- ✅ 弹幕时间戳显示
- ✅ Danmaku timestamp display
- ✅ コメントタイムスタンプ表示
- ✅ 댓글 타임스탬프 표시

### v32.6 自动移除已播放项 | Auto-remove played items | 再生済みアイテム自動削除 | 재생 항목 자동 제거
- ✅ 自动移除已播放项
- ✅ Auto-remove played items
- ✅ 再生済みアイテム自動削除
- ✅ 재생 항목 자동 제거

### v32.7 后台播放 | Background playback | バックグラウンド再生 | 백그라운드 재생
- ✅ 后台播放
- ✅ Background playback
- ✅ バックグラウンド再生
- ✅ 백그라운드 재생

### v32.8 双语字幕 | Dual-language subtitles | 二言語字幕 | 이중 언어 자막
- ✅ 双语字幕
- ✅ Dual-language subtitles
- ✅ 二言語字幕
- ✅ 이중 언어 자막

### v32.9 弹幕透明度渐隐 | Danmaku opacity fade-out | コメント透明度フェードアウト | 댓글 투명도 페이드아웃
- ✅ 弹幕透明度渐隐
- ✅ Danmaku opacity fade-out
- ✅ コメント透明度フェードアウト
- ✅ 댓글 투명도 페이드아웃

### v32.10 变速平滑过渡 | Smooth speed transition | スムーズ速度遷移 | 부드러운 속도 전환
- ✅ 变速平滑过渡
- ✅ Smooth speed transition
- ✅ スムーズ速度遷移
- ✅ 부드러운 속도 전환

### v32.11 音频虚拟环绕声 | Audio virtual surround | 音声バーチャルサラウンド | 오디오 가상 서라운드
- ✅ 音频虚拟环绕声
- ✅ Audio virtual surround
- ✅ 音声バーチャルサラウンド
- ✅ 오디오 가상 서라운드

### v32.12 弹幕气泡样式 | Danmaku bubble style | コメントバブルスタイル | 댓글 버블 스타일
- ✅ 弹幕气泡样式
- ✅ Danmaku bubble style
- ✅ コメントバブルスタイル
- ✅ 댓글 버블 스타일

### v32.13 播放器锁定超时 | Player lock timeout | プレーヤーロックタイムアウト | 플레이어 잠금 시간 초과
- ✅ 播放器锁定超时
- ✅ Player lock timeout
- ✅ プレーヤーロックタイムアウト
- ✅ 플레이어 잠금 시간 초과

### v32.14 视频裁剪预设 | Video crop preset | 動画クロッププリセット | 비디오 크롭 프리셋
- ✅ 视频裁剪预设
- ✅ Video crop preset
- ✅ 動画クロッププリセット
- ✅ 비디오 크롭 프리셋

### v32.15 弹幕表情过滤 | Danmaku emoji filter | コメント絵文字フィルター | 댓글 이모지 필터
- ✅ 弹幕表情过滤
- ✅ Danmaku emoji filter
- ✅ コメント絵文字フィルター
- ✅ 댓글 이모지 필터


### v33.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v33.1-v33.15 功能列表
- ✅ 低音增强, 弹幕滚动方向, 缩略图时间点, 双击快进秒数, 弹幕行数限制, 字幕描边宽度, HDR色调映射, 跳过片头秒数, 弹幕自定义字体, 音频增益, 进度条章节标记, 视频旋转锁定, 弹幕重复过滤, 字幕阴影偏移, 播放列表倒序

### v33.1 低音增强 | Bass boost | バスブースト | 베이스 부스트
- ✅ 低音增强
- ✅ Bass boost
- ✅ バスブースト
- ✅ 베이스 부스트

### v33.2 弹幕滚动方向 | Danmaku scroll direction | コメントスクロール方向 | 댓글 스크롤 방향
- ✅ 弹幕滚动方向
- ✅ Danmaku scroll direction
- ✅ コメントスクロール方向
- ✅ 댓글 스크롤 방향

### v33.3 缩略图时间点 | Thumbnail time point | サムネイル時間ポイント | 썸네일 시간 지점
- ✅ 缩略图时间点
- ✅ Thumbnail time point
- ✅ サムネイル時間ポイント
- ✅ 썸네일 시간 지점

### v33.4 双击快进秒数 | Double-tap seek seconds | ダブルタップシーク秒 | 더블 탭 탐색 초
- ✅ 双击快进秒数
- ✅ Double-tap seek seconds
- ✅ ダブルタップシーク秒
- ✅ 더블 탭 탐색 초

### v33.5 弹幕行数限制 | Danmaku line count limit | コメント行数制限 | 댓글 줄 수 제한
- ✅ 弹幕行数限制
- ✅ Danmaku line count limit
- ✅ コメント行数制限
- ✅ 댓글 줄 수 제한

### v33.6 字幕描边宽度 | Subtitle border width | 字幕ボーダー幅 | 자막 테두리 너비
- ✅ 字幕描边宽度
- ✅ Subtitle border width
- ✅ 字幕ボーダー幅
- ✅ 자막 테두리 너비

### v33.7 HDR色调映射 | HDR tone mapping | HDRトーンマッピング | HDR 톤 매핑
- ✅ HDR色调映射
- ✅ HDR tone mapping
- ✅ HDRトーンマッピング
- ✅ HDR 톤 매핑

### v33.8 跳过片头秒数 | Skip intro seconds | イントロスキップ秒 | 인트로 건너뛰기 초
- ✅ 跳过片头秒数
- ✅ Skip intro seconds
- ✅ イントロスキップ秒
- ✅ 인트로 건너뛰기 초

### v33.9 弹幕自定义字体 | Danmaku custom font | コメントカスタムフォント | 댓글 커스텀 글꼴
- ✅ 弹幕自定义字体
- ✅ Danmaku custom font
- ✅ コメントカスタムフォント
- ✅ 댓글 커스텀 글꼴

### v33.10 音频增益 | Audio gain | 音声ゲイン | 오디오 게인
- ✅ 音频增益
- ✅ Audio gain
- ✅ 音声ゲイン
- ✅ 오디오 게인

### v33.11 进度条章节标记 | Seekbar chapter markers | シークバーチャプターマーク | 탐색 바 챕터 마크
- ✅ 进度条章节标记
- ✅ Seekbar chapter markers
- ✅ シークバーチャプターマーク
- ✅ 탐색 바 챕터 마크

### v33.12 视频旋转锁定 | Video rotation lock | 動画回転ロック | 비디오 회전 잠금
- ✅ 视频旋转锁定
- ✅ Video rotation lock
- ✅ 動画回転ロック
- ✅ 비디오 회전 잠금

### v33.13 弹幕重复过滤 | Danmaku repeat filter | コメント重複フィルター | 댓글 중복 필터
- ✅ 弹幕重复过滤
- ✅ Danmaku repeat filter
- ✅ コメント重複フィルター
- ✅ 댓글 중복 필터

### v33.14 字幕阴影偏移 | Subtitle shadow offset | 字幕シャドウオフセット | 자막 그림자 오프셋
- ✅ 字幕阴影偏移
- ✅ Subtitle shadow offset
- ✅ 字幕シャドウオフセット
- ✅ 자막 그림자 오프셋

### v33.15 播放列表倒序 | Playlist reverse order | プレイリスト逆順 | 재생 목록 역순
- ✅ 播放列表倒序
- ✅ Playlist reverse order
- ✅ プレイリスト逆順
- ✅ 재생 목록 역순


### v34.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v34.1-v34.15 功能列表
- ✅ 弹幕最大显示时长, 亮度自动感应, 音频压缩阈值, 自定义手势映射, 弹幕正则屏蔽, 字幕卡拉OK模式, 扫描线滤镜, 耳机断开自动暂停, 弹幕镜像翻转, 均衡器预设, 播放器音量增强, 像素风格模式, 弹幕最小字号, 字幕自定义颜色, 单曲循环模式

### v34.1 弹幕最大显示时长 | Danmaku max display time | コメント最大表示時間 | 댓글 최대 표시 시간
- ✅ 弹幕最大显示时长
- ✅ Danmaku max display time
- ✅ コメント最大表示時間
- ✅ 댓글 최대 표시 시간

### v34.2 亮度自动感应 | Auto brightness sensor | 輝度自動センサー | 밝기 자동 센서
- ✅ 亮度自动感应
- ✅ Auto brightness sensor
- ✅ 輝度自動センサー
- ✅ 밝기 자동 센서

### v34.3 音频压缩阈值 | Audio compressor threshold | 音声コンプレッサー閾値 | 오디오 컴프레서 임계값
- ✅ 音频压缩阈值
- ✅ Audio compressor threshold
- ✅ 音声コンプレッサー閾値
- ✅ 오디오 컴프레서 임계값

### v34.4 自定义手势映射 | Custom gesture mapping | カスタムジェスチャーマッピング | 커스텀 제스처 매핑
- ✅ 自定义手势映射
- ✅ Custom gesture mapping
- ✅ カスタムジェスチャーマッピング
- ✅ 커스텀 제스처 매핑

### v34.5 弹幕正则屏蔽 | Danmaku regex shield | コメント正規表現シールド | 댓글 정규식 차단
- ✅ 弹幕正则屏蔽
- ✅ Danmaku regex shield
- ✅ コメント正規表現シールド
- ✅ 댓글 정규식 차단

### v34.6 字幕卡拉OK模式 | Subtitle karaoke mode | 字幕カラオケモード | 자막 노래방 모드
- ✅ 字幕卡拉OK模式
- ✅ Subtitle karaoke mode
- ✅ 字幕カラオケモード
- ✅ 자막 노래방 모드

### v34.7 扫描线滤镜 | Scan-line filter | スキャンラインフィルター | 스캔라인 필터
- ✅ 扫描线滤镜
- ✅ Scan-line filter
- ✅ スキャンラインフィルター
- ✅ 스캔라인 필터

### v34.8 耳机断开自动暂停 | Auto-pause on headset disconnect | イヤホン切断自動一時停止 | 이어폰 분리 자동 일시정지
- ✅ 耳机断开自动暂停
- ✅ Auto-pause on headset disconnect
- ✅ イヤホン切断自動一時停止
- ✅ 이어폰 분리 자동 일시정지

### v34.9 弹幕镜像翻转 | Danmaku mirror flip | コメントミラーフリップ | 댓글 미러 뒤집기
- ✅ 弹幕镜像翻转
- ✅ Danmaku mirror flip
- ✅ コメントミラーフリップ
- ✅ 댓글 미러 뒤집기

### v34.10 均衡器预设 | Equalizer preset | イコライザープリセット | 이퀄라이저 프리셋
- ✅ 均衡器预设
- ✅ Equalizer preset
- ✅ イコライザープリセット
- ✅ 이퀄라이저 프리셋

### v34.11 播放器音量增强 | Player volume boost | プレーヤー音量ブースト | 플레이어 볼륨 부스트
- ✅ 播放器音量增强
- ✅ Player volume boost
- ✅ プレーヤー音量ブースト
- ✅ 플레이어 볼륨 부스트

### v34.12 像素风格模式 | Pixel art mode | ピクセルアートモード | 픽셀 아트 모드
- ✅ 像素风格模式
- ✅ Pixel art mode
- ✅ ピクセルアートモード
- ✅ 픽셀 아트 모드

### v34.13 弹幕最小字号 | Danmaku minimum font size | コメント最小フォントサイズ | 댓글 최소 글꼴 크기
- ✅ 弹幕最小字号
- ✅ Danmaku minimum font size
- ✅ コメント最小フォントサイズ
- ✅ 댓글 최소 글꼴 크기

### v34.14 字幕自定义颜色 | Subtitle custom text color | 字幕カスタムテキスト色 | 자막 커스텀 텍스트 색상
- ✅ 字幕自定义颜色
- ✅ Subtitle custom text color
- ✅ 字幕カスタムテキスト色
- ✅ 자막 커스텀 텍스트 색상

### v34.15 单曲循环模式 | Single item repeat mode | シングルリピートモード | 단일 항목 반복 모드
- ✅ 单曲循环模式
- ✅ Single item repeat mode
- ✅ シングルリピートモード
- ✅ 단일 항목 반복 모드


### v35.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v35.1-v35.15 功能列表
- ✅ 帧率覆盖, 弹幕发送者头像, 空间音频宽度, 横屏自动全屏, 弹幕拼音转换, 字幕顶部显示, 暗角效果强度, 仅WiFi预加载, 弹幕渐变色, 音频响度标准化, 小窗播放, 视频降噪强度, 弹幕动画速度, 字幕行间距, 智能随机播放

### v35.1 帧率覆盖 | Frame rate override | フレームレートオーバーライド | 프레임 속도 오버라이드
- ✅ 帧率覆盖
- ✅ Frame rate override
- ✅ フレームレートオーバーライド
- ✅ 프레임 속도 오버라이드

### v35.2 弹幕发送者头像 | Danmaku sender avatar | コメント送信者アバター | 댓글 발신자 아바타
- ✅ 弹幕发送者头像
- ✅ Danmaku sender avatar
- ✅ コメント送信者アバター
- ✅ 댓글 발신자 아바타

### v35.3 空间音频宽度 | Spatial audio width | 空間音声幅 | 공간 오디오 폭
- ✅ 空间音频宽度
- ✅ Spatial audio width
- ✅ 空間音声幅
- ✅ 공간 오디오 폭

### v35.4 横屏自动全屏 | Auto fullscreen on landscape | 横画面自動フルスクリーン | 가로 화면 자동 전체화면
- ✅ 横屏自动全屏
- ✅ Auto fullscreen on landscape
- ✅ 横画面自動フルスクリーン
- ✅ 가로 화면 자동 전체화면

### v35.5 弹幕拼音转换 | Danmaku pinyin conversion | コメントピンイン変換 | 댓글 병음 변환
- ✅ 弹幕拼音转换
- ✅ Danmaku pinyin conversion
- ✅ コメントピンイン変換
- ✅ 댓글 병음 변환

### v35.6 字幕顶部显示 | Subtitle position top | 字幕上部表示 | 자막 상단 표시
- ✅ 字幕顶部显示
- ✅ Subtitle position top
- ✅ 字幕上部表示
- ✅ 자막 상단 표시

### v35.7 暗角效果强度 | Vignette effect strength | ビネット効果強度 | 비네트 효과 강도
- ✅ 暗角效果强度
- ✅ Vignette effect strength
- ✅ ビネット効果強度
- ✅ 비네트 효과 강도

### v35.8 仅WiFi预加载 | Preload on WiFi only | WiFiのみプリロード | WiFi에서만 프리로드
- ✅ 仅WiFi预加载
- ✅ Preload on WiFi only
- ✅ WiFiのみプリロード
- ✅ WiFi에서만 프리로드

### v35.9 弹幕渐变色 | Danmaku gradient color | コメントグラデーション色 | 댓글 그라데이션 색상
- ✅ 弹幕渐变色
- ✅ Danmaku gradient color
- ✅ コメントグラデーション色
- ✅ 댓글 그라데이션 색상

### v35.10 音频响度标准化 | Audio loudness normalization | 音声ラウドネス正規化 | 오디오 라우드니스 정규화
- ✅ 音频响度标准化
- ✅ Audio loudness normalization
- ✅ 音声ラウドネス正規化
- ✅ 오디오 라우드니스 정규화

### v35.11 小窗播放 | Mini window playback | ミニウィンドウ再生 | 미니 창 재생
- ✅ 小窗播放
- ✅ Mini window playback
- ✅ ミニウィンドウ再生
- ✅ 미니 창 재생

### v35.12 视频降噪强度 | Video noise reduction | 動画ノイズ除去強度 | 비디오 노이즈 감소 강도
- ✅ 视频降噪强度
- ✅ Video noise reduction
- ✅ 動画ノイズ除去強度
- ✅ 비디오 노이즈 감소 강도

### v35.13 弹幕动画速度 | Danmaku animation speed | コメントアニメーション速度 | 댓글 애니메이션 속도
- ✅ 弹幕动画速度
- ✅ Danmaku animation speed
- ✅ コメントアニメーション速度
- ✅ 댓글 애니메이션 속도

### v35.14 字幕行间距 | Subtitle line spacing | 字幕行間 | 자막 줄 간격
- ✅ 字幕行间距
- ✅ Subtitle line spacing
- ✅ 字幕行間
- ✅ 자막 줄 간격

### v35.15 智能随机播放 | Smart shuffle | スマートシャッフル | 스마트 셔플
- ✅ 智能随机播放
- ✅ Smart shuffle
- ✅ スマートシャッフル
- ✅ 스마트 셔플


### v36.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v36.1-v36.15 功能列表
- ✅ 画面适配模式, 弹幕类型透明度, 人声隔离, 跳过片尾秒数, 弹幕自动缩放, 字幕边缘模糊, 色彩LUT预设, 变速音调修正, 弹幕长度上限, 音频延迟, 滑动亮度曲线, 边缘锐化模式, 弹幕粉丝徽章, 字幕字重, 自动播放下一集

### v36.1 画面适配模式 | Aspect fit mode | アスペクトフィットモード | 화면 맞춤 모드
- ✅ 画面适配模式
- ✅ Aspect fit mode
- ✅ アスペクトフィットモード
- ✅ 화면 맞춤 모드

### v36.2 弹幕类型透明度 | Danmaku per-type opacity | コメントタイプ別透明度 | 댓글 유형별 투명도
- ✅ 弹幕类型透明度
- ✅ Danmaku per-type opacity
- ✅ コメントタイプ別透明度
- ✅ 댓글 유형별 투명도

### v36.3 人声隔离 | Voice isolation | ボーカルアイソレーション | 보컬 분리
- ✅ 人声隔离
- ✅ Voice isolation
- ✅ ボーカルアイソレーション
- ✅ 보컬 분리

### v36.4 跳过片尾秒数 | Skip outro seconds | アウトロスキップ秒 | 아웃트로 건너뛰기 초
- ✅ 跳过片尾秒数
- ✅ Skip outro seconds
- ✅ アウトロスキップ秒
- ✅ 아웃트로 건너뛰기 초

### v36.5 弹幕自动缩放 | Danmaku auto-scale | コメント自動スケール | 댓글 자동 스케일
- ✅ 弹幕自动缩放
- ✅ Danmaku auto-scale
- ✅ コメント自動スケール
- ✅ 댓글 자동 스케일

### v36.6 字幕边缘模糊 | Subtitle edge blur | 字幕エッジぼかし | 자막 가장자리 블러
- ✅ 字幕边缘模糊
- ✅ Subtitle edge blur
- ✅ 字幕エッジぼかし
- ✅ 자막 가장자리 블러

### v36.7 色彩LUT预设 | Color LUT preset | カラールックアップテーブルプリセット | 컬러 LUT 프리셋
- ✅ 色彩LUT预设
- ✅ Color LUT preset
- ✅ カラールックアップテーブルプリセット
- ✅ 컬러 LUT 프리셋

### v36.8 变速音调修正 | Speed pitch correction | 速度ピッチ補正 | 속도 피치 보정
- ✅ 变速音调修正
- ✅ Speed pitch correction
- ✅ 速度ピッチ補正
- ✅ 속도 피치 보정

### v36.9 弹幕长度上限 | Danmaku length limit | コメント長さ制限 | 댓글 길이 제한
- ✅ 弹幕长度上限
- ✅ Danmaku length limit
- ✅ コメント長さ制限
- ✅ 댓글 길이 제한

### v36.10 音频延迟 | Audio delay | 音声遅延 | 오디오 지연
- ✅ 音频延迟
- ✅ Audio delay
- ✅ 音声遅延
- ✅ 오디오 지연

### v36.11 滑动亮度曲线 | Swipe brightness curve | スワイプ輝度カーブ | 스와이프 밝기 커브
- ✅ 滑动亮度曲线
- ✅ Swipe brightness curve
- ✅ スワイプ輝度カーブ
- ✅ 스와이프 밝기 커브

### v36.12 边缘锐化模式 | Edge sharpen mode | エッジシャープンモード | 가장자리 선명화 모드
- ✅ 边缘锐化模式
- ✅ Edge sharpen mode
- ✅ エッジシャープンモード
- ✅ 가장자리 선명화 모드

### v36.13 弹幕粉丝徽章 | Danmaku fan badge | コメントファンバッジ | 댓글 팬 뱃지
- ✅ 弹幕粉丝徽章
- ✅ Danmaku fan badge
- ✅ コメントファンバッジ
- ✅ 댓글 팬 뱃지

### v36.14 字幕字重 | Subtitle font weight | 字幕フォントウェイト | 자막 글꼴 무게
- ✅ 字幕字重
- ✅ Subtitle font weight
- ✅ 字幕フォントウェイト
- ✅ 자막 글꼴 무게

### v36.15 自动播放下一集 | Auto-play next episode | 次エピソード自動再生 | 다음 에피소드 자동 재생
- ✅ 自动播放下一集
- ✅ Auto-play next episode
- ✅ 次エピソード自動再生
- ✅ 다음 에피소드 자동 재생


### v37.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v37.1-v37.15 功能列表
- ✅ 黑边自动检测, 弹幕分组合并, 立体声宽度, 恢复播放阈值, 弹幕注音显示, 字幕外框颜色, 帧率计数器, 缓冲策略, 弹幕等级屏蔽, 混响预设, 长按倍速值, 插帧模式, 弹幕阴影偏移, 字幕自定义背景色, 淡入淡出过渡

### v37.1 黑边自动检测 | Auto black bar detection | 黒帯自動検出 | 블랙바 자동 감지
- ✅ 黑边自动检测
- ✅ Auto black bar detection
- ✅ 黒帯自動検出
- ✅ 블랙바 자동 감지

### v37.2 弹幕分组合并 | Danmaku group merge | コメントグループマージ | 댓글 그룹 병합
- ✅ 弹幕分组合并
- ✅ Danmaku group merge
- ✅ コメントグループマージ
- ✅ 댓글 그룹 병합

### v37.3 立体声宽度 | Stereo width | ステレオ幅 | 스테레오 폭
- ✅ 立体声宽度
- ✅ Stereo width
- ✅ ステレオ幅
- ✅ 스테레오 폭

### v37.4 恢复播放阈值 | Resume playback threshold | 再生再開閾値 | 재생 재개 임계값
- ✅ 恢复播放阈值
- ✅ Resume playback threshold
- ✅ 再生再開閾値
- ✅ 재생 재개 임계값

### v37.5 弹幕注音显示 | Danmaku furigana display | コメントふりがな表示 | 댓글 후리가나 표시
- ✅ 弹幕注音显示
- ✅ Danmaku furigana display
- ✅ コメントふりがな表示
- ✅ 댓글 후리가나 표시

### v37.6 字幕外框颜色 | Subtitle outline color | 字幕アウトライン色 | 자막 아웃라인 색상
- ✅ 字幕外框颜色
- ✅ Subtitle outline color
- ✅ 字幕アウトライン色
- ✅ 자막 아웃라인 색상

### v37.7 帧率计数器 | FPS counter | FPSカウンター | FPS 카운터
- ✅ 帧率计数器
- ✅ FPS counter
- ✅ FPSカウンター
- ✅ FPS 카운터

### v37.8 缓冲策略 | Buffer strategy | バッファ戦略 | 버퍼 전략
- ✅ 缓冲策略
- ✅ Buffer strategy
- ✅ バッファ戦略
- ✅ 버퍼 전략

### v37.9 弹幕等级屏蔽 | Danmaku level shield | コメントレベルシールド | 댓글 레벨 차단
- ✅ 弹幕等级屏蔽
- ✅ Danmaku level shield
- ✅ コメントレベルシールド
- ✅ 댓글 레벨 차단

### v37.10 混响预设 | Reverb preset | リバーブプリセット | 리버브 프리셋
- ✅ 混响预设
- ✅ Reverb preset
- ✅ リバーブプリセット
- ✅ 리버브 프리셋

### v37.11 长按倍速值 | Long-press speed value | 長押し速度値 | 길게 누르기 속도 값
- ✅ 长按倍速值
- ✅ Long-press speed value
- ✅ 長押し速度値
- ✅ 길게 누르기 속도 값

### v37.12 插帧模式 | Frame interpolation mode | フレーム補間モード | 프레임 보간 모드
- ✅ 插帧模式
- ✅ Frame interpolation mode
- ✅ フレーム補間モード
- ✅ 프레임 보간 모드

### v37.13 弹幕阴影偏移 | Danmaku shadow offset | コメントシャドウオフセット | 댓글 그림자 오프셋
- ✅ 弹幕阴影偏移
- ✅ Danmaku shadow offset
- ✅ コメントシャドウオフセット
- ✅ 댓글 그림자 오프셋

### v37.14 字幕自定义背景色 | Subtitle custom background color | 字幕カスタム背景色 | 자막 커스텀 배경 색상
- ✅ 字幕自定义背景色
- ✅ Subtitle custom background color
- ✅ 字幕カスタム背景色
- ✅ 자막 커스텀 배경 색상

### v37.15 淡入淡出过渡 | Fade transition | フェードトランジション | 페이드 전환
- ✅ 淡入淡出过渡
- ✅ Fade transition
- ✅ フェードトランジション
- ✅ 페이드 전환


### v38.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v38.1-v38.15 功能列表
- ✅ Gamma曲线预设, 弹幕智能密度控制, 高频搁架增益, 拖动预览帧, 弹幕自动换行, 字幕字间距, 对比度增强, 最小缓冲秒数, 弹幕优先级, 低频搁架增益, 倍速步进值, 饱和度增强, 弹幕悬停暂停, 字幕罗马音化, 交叉淡入

### v38.1 Gamma曲线预设 | Gamma curve preset | ガンマカーブプリセット | 감마 커브 프리셋
- ✅ Gamma曲线预设
- ✅ Gamma curve preset
- ✅ ガンマカーブプリセット
- ✅ 감마 커브 프리셋

### v38.2 弹幕智能密度控制 | Danmaku smart density control | コメントスマート密度制御 | 댓글 스마트 밀도 제어
- ✅ 弹幕智能密度控制
- ✅ Danmaku smart density control
- ✅ コメントスマート密度制御
- ✅ 댓글 스마트 밀도 제어

### v38.3 高频搁架增益 | High shelf gain | 高域シェルフゲイン | 고주파 셸프 게인
- ✅ 高频搁架增益
- ✅ High shelf gain
- ✅ 高域シェルフゲイン
- ✅ 고주파 셸프 게인

### v38.4 拖动预览帧 | Seek preview frame | シークプレビューフレーム | 탐색 미리보기 프레임
- ✅ 拖动预览帧
- ✅ Seek preview frame
- ✅ シークプレビューフレーム
- ✅ 탐색 미리보기 프레임

### v38.5 弹幕自动换行 | Danmaku auto wrap | コメント自動折り返し | 댓글 자동 줄바꿈
- ✅ 弹幕自动换行
- ✅ Danmaku auto wrap
- ✅ コメント自動折り返し
- ✅ 댓글 자동 줄바꿈

### v38.6 字幕字间距 | Subtitle letter spacing | 字幕文字間隔 | 자막 글자 간격
- ✅ 字幕字间距
- ✅ Subtitle letter spacing
- ✅ 字幕文字間隔
- ✅ 자막 글자 간격

### v38.7 对比度增强 | Contrast enhancement | コントラスト強化 | 대비 강화
- ✅ 对比度增强
- ✅ Contrast enhancement
- ✅ コントラスト強化
- ✅ 대비 강화

### v38.8 最小缓冲秒数 | Minimum buffer seconds | 最小バッファ秒 | 최소 버퍼 초
- ✅ 最小缓冲秒数
- ✅ Minimum buffer seconds
- ✅ 最小バッファ秒
- ✅ 최소 버퍼 초

### v38.9 弹幕优先级 | Danmaku priority level | コメント優先度 | 댓글 우선순위
- ✅ 弹幕优先级
- ✅ Danmaku priority level
- ✅ コメント優先度
- ✅ 댓글 우선순위

### v38.10 低频搁架增益 | Low shelf gain | 低域シェルフゲイン | 저주파 셸프 게인
- ✅ 低频搁架增益
- ✅ Low shelf gain
- ✅ 低域シェルフゲイン
- ✅ 저주파 셸프 게인

### v38.11 倍速步进值 | Speed step | 速度ステップ | 속도 스텝
- ✅ 倍速步进值
- ✅ Speed step
- ✅ 速度ステップ
- ✅ 속도 스텝

### v38.12 饱和度增强 | Saturation boost | 彩度ブースト | 채도 부스트
- ✅ 饱和度增强
- ✅ Saturation boost
- ✅ 彩度ブースト
- ✅ 채도 부스트

### v38.13 弹幕悬停暂停 | Danmaku hover pause | コメントホバー一時停止 | 댓글 호버 일시정지
- ✅ 弹幕悬停暂停
- ✅ Danmaku hover pause
- ✅ コメントホバー一時停止
- ✅ 댓글 호버 일시정지

### v38.14 字幕罗马音化 | Subtitle romanization | 字幕ローマ字化 | 자막 로마자화
- ✅ 字幕罗马音化
- ✅ Subtitle romanization
- ✅ 字幕ローマ字化
- ✅ 자막 로마자화

### v38.15 交叉淡入 | Crossfade duration | クロスフェード時間 | 크로스페이드 시간
- ✅ 交叉淡入
- ✅ Crossfade duration
- ✅ クロスフェード時間
- ✅ 크로스페이드 시간


### v39.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v39.1-v39.15 功能列表
- ✅ 时间基准同步模式, 弹幕云样式, 中频增益, 自动亮度范围, 弹幕紧凑模式, 字幕动画类型, 视频详细信息栏, 网络自适应播放, 弹幕拖影效果, 动态范围压缩, 进度提示Toast, 画面平滑等级, 弹幕等级图标, 字幕自动翻译, 加载相关视频

### v39.1 时间基准同步模式 | Timebase sync mode | タイムベース同期モード | 타임베이스 동기화 모드
- ✅ 时间基准同步模式
- ✅ Timebase sync mode
- ✅ タイムベース同期モード
- ✅ 타임베이스 동기화 모드

### v39.2 弹幕云样式 | Danmaku cloud pattern | コメントクラウドパターン | 댓글 클라우드 패턴
- ✅ 弹幕云样式
- ✅ Danmaku cloud pattern
- ✅ コメントクラウドパターン
- ✅ 댓글 클라우드 패턴

### v39.3 中频增益 | Mid frequency gain | 中域ゲイン | 중주파 게인
- ✅ 中频增益
- ✅ Mid frequency gain
- ✅ 中域ゲイン
- ✅ 중주파 게인

### v39.4 自动亮度范围 | Auto brightness range | 自動輝度範囲 | 자동 밝기 범위
- ✅ 自动亮度范围
- ✅ Auto brightness range
- ✅ 自動輝度範囲
- ✅ 자동 밝기 범위

### v39.5 弹幕紧凑模式 | Danmaku compact mode | コメントコンパクトモード | 댓글 컴팩트 모드
- ✅ 弹幕紧凑模式
- ✅ Danmaku compact mode
- ✅ コメントコンパクトモード
- ✅ 댓글 컴팩트 모드

### v39.6 字幕动画类型 | Subtitle animation type | 字幕アニメーションタイプ | 자막 애니메이션 유형
- ✅ 字幕动画类型
- ✅ Subtitle animation type
- ✅ 字幕アニメーションタイプ
- ✅ 자막 애니메이션 유형

### v39.7 视频详细信息栏 | Video detail info bar | 動画詳細情報バー | 비디오 상세 정보 바
- ✅ 视频详细信息栏
- ✅ Video detail info bar
- ✅ 動画詳細情報バー
- ✅ 비디오 상세 정보 바

### v39.8 网络自适应播放 | Network adaptive playback | ネットワーク適応再生 | 네트워크 적응 재생
- ✅ 网络自适应播放
- ✅ Network adaptive playback
- ✅ ネットワーク適応再生
- ✅ 네트워크 적응 재생

### v39.9 弹幕拖影效果 | Danmaku ghost trail effect | コメントゴーストトレイル | 댓글 고스트 트레일
- ✅ 弹幕拖影效果
- ✅ Danmaku ghost trail effect
- ✅ コメントゴーストトレイル
- ✅ 댓글 고스트 트레일

### v39.10 动态范围压缩 | Dynamic range compression | ダイナミックレンジ圧縮 | 다이나믹 레인지 압축
- ✅ 动态范围压缩
- ✅ Dynamic range compression
- ✅ ダイナミックレンジ圧縮
- ✅ 다이나믹 레인지 압축

### v39.11 进度提示Toast | Progress toast | 進捗トースト | 진행 토스트
- ✅ 进度提示Toast
- ✅ Progress toast
- ✅ 進捗トースト
- ✅ 진행 토스트

### v39.12 画面平滑等级 | Video smoothing level | 動画スムージングレベル | 비디오 스무딩 레벨
- ✅ 画面平滑等级
- ✅ Video smoothing level
- ✅ 動画スムージングレベル
- ✅ 비디오 스무딩 레벨

### v39.13 弹幕等级图标 | Danmaku sender level icon | コメントレベルアイコン | 댓글 레벨 아이콘
- ✅ 弹幕等级图标
- ✅ Danmaku sender level icon
- ✅ コメントレベルアイコン
- ✅ 댓글 레벨 아이콘

### v39.14 字幕自动翻译 | Subtitle auto-translate | 字幕自動翻訳 | 자막 자동 번역
- ✅ 字幕自动翻译
- ✅ Subtitle auto-translate
- ✅ 字幕自動翻訳
- ✅ 자막 자동 번역

### v39.15 加载相关视频 | Load related videos | 関連動画読み込み | 관련 영상 로드
- ✅ 加载相关视频
- ✅ Load related videos
- ✅ 関連動画読み込み
- ✅ 관련 영상 로드


### v40.x (AI自动维护版) | AI Maintenance Version | AIメンテナンス版 | AI 유지보수 버전
### v40.1-v40.15 功能列表
- ✅ 快照间隔, 弹幕复古模式, 人声消除, 快捷键自定义映射, B站表情解析, 字幕衬线字体, AI超分辨率, 分段缓存大小, 弹幕淡入时长, 变速保调, OSD超时, 动态色调映射, 屏幕最大弹幕数, 字幕描边颜色, 自动去重

### v40.1 快照间隔 | Snapshot interval | スナップショット間隔 | 스냅샷 간격
- ✅ 快照间隔
- ✅ Snapshot interval
- ✅ スナップショット間隔
- ✅ 스냅샷 간격

### v40.2 弹幕复古模式 | Danmaku vintage mode | コメントビンテージモード | 댓글 빈티지 모드
- ✅ 弹幕复古模式
- ✅ Danmaku vintage mode
- ✅ コメントビンテージモード
- ✅ 댓글 빈티지 모드

### v40.3 人声消除 | Vocal removal | ボーカル除去 | 보컬 제거
- ✅ 人声消除
- ✅ Vocal removal
- ✅ ボーカル除去
- ✅ 보컬 제거

### v40.4 快捷键自定义映射 | Custom key shortcut mapping | カスタムショートカットマッピング | 커스텀 단축키 매핑
- ✅ 快捷键自定义映射
- ✅ Custom key shortcut mapping
- ✅ カスタムショートカットマッピング
- ✅ 커스텀 단축키 매핑

### v40.5 B站表情解析 | Bilibili emote parsing | Bilibili絵文字解析 | Bilibili 이모지 파싱
- ✅ B站表情解析
- ✅ Bilibili emote parsing
- ✅ Bilibili絵文字解析
- ✅ Bilibili 이모지 파싱

### v40.6 字幕衬线字体 | Subtitle serif font | 字幕セリフフォント | 자막 세리프 글꼴
- ✅ 字幕衬线字体
- ✅ Subtitle serif font
- ✅ 字幕セリフフォント
- ✅ 자막 세리프 글꼴

### v40.7 AI超分辨率 | AI super resolution | AI超解像度 | AI 초해상도
- ✅ AI超分辨率
- ✅ AI super resolution
- ✅ AI超解像度
- ✅ AI 초해상도

### v40.8 分段缓存大小 | Segment cache size | セグメントキャッシュサイズ | 세그먼트 캐시 크기
- ✅ 分段缓存大小
- ✅ Segment cache size
- ✅ セグメントキャッシュサイズ
- ✅ 세그먼트 캐시 크기

### v40.9 弹幕淡入时长 | Danmaku fade-in duration | コメントフェードイン時間 | 댓글 페이드인 시간
- ✅ 弹幕淡入时长
- ✅ Danmaku fade-in duration
- ✅ コメントフェードイン時間
- ✅ 댓글 페이드인 시간

### v40.10 变速保调 | Preserve pitch on speed change | 速度変更時ピッチ保持 | 속도 변경 시 피치 유지
- ✅ 变速保调
- ✅ Preserve pitch on speed change
- ✅ 速度変更時ピッチ保持
- ✅ 속도 변경 시 피치 유지

### v40.11 OSD超时 | OSD timeout | OSDタイムアウト | OSD 시간 초과
- ✅ OSD超时
- ✅ OSD timeout
- ✅ OSDタイムアウト
- ✅ OSD 시간 초과

### v40.12 动态色调映射 | Dynamic tone mapping | 動的トーンマッピング | 동적 톤 매핑
- ✅ 动态色调映射
- ✅ Dynamic tone mapping
- ✅ 動的トーンマッピング
- ✅ 동적 톤 매핑

### v40.13 屏幕最大弹幕数 | Max danmaku per screen | 画面最大コメント数 | 화면 최대 댓글 수
- ✅ 屏幕最大弹幕数
- ✅ Max danmaku per screen
- ✅ 画面最大コメント数
- ✅ 화면 최대 댓글 수

### v40.14 字幕描边颜色 | Subtitle stroke color | 字幕ストローク色 | 자막 스트로크 색상
- ✅ 字幕描边颜色
- ✅ Subtitle stroke color
- ✅ 字幕ストローク色
- ✅ 자막 스트로크 색상

### v40.15 自动去重 | Auto remove duplicates | 重複自動削除 | 중복 자동 제거
- ✅ 自动去重
- ✅ Auto remove duplicates
- ✅ 重複自動削除
- ✅ 중복 자동 제거


