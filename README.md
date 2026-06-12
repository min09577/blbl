# blbl — 哔哩哔哩第三方客户端 | Third‑party Bilibili Client | サードパーティ Bilibili | 서드파티 빌리빌리

[![CI Build](https://github.com/min09577/blbl/actions/workflows/android-debug.yml/badge.svg)](https://github.com/min09577/blbl/actions/workflows/android-debug.yml)
[![Code Style](https://github.com/min09577/blbl/actions/workflows/code-style.yml/badge.svg)](https://github.com/min09577/blbl/actions/workflows/code-style.yml)
[![Version](https://img.shields.io/badge/version-v2400.1.10-blue)](https://github.com/min09577/blbl/releases)
[![Gradle](https://img.shields.io/badge/Gradle-9.1.0-02303A?logo=gradle)](https://gradle.org)
[![AGP](https://img.shields.io/badge/AGP-9.0.1-3DDC84?logo=android)](https://developer.android.com/build)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-7F52FF?logo=kotlin)](https://kotlinlang.org)
[![ktlint](https://img.shields.io/badge/ktlint-14.2.0-009639)](https://pinterest.github.io/ktlint)
[![detekt](https://img.shields.io/badge/detekt-1.23.8-5A33C2)](https://detekt.dev)

一个第三方哔哩哔哩安卓 App，支持触摸、遥控，适用于平板、TV、车机等设备。

A third‑party Bilibili Android client with touch and remote‑control support.
Tablets · TV · car‑head‑unit.

タッチ・リモコン対応のサードパーティ Bilibili アプリ。タブレット・TV・車載端末に対応。

터치·리모컨을 지원하는 서드파티 빌리빌리 Android 앱. 태블릿·TV·차량 장치 지원.

---

## ⚖️ 免责声明 | Disclaimer | 免責事項 | 면책 조항

- 本软件基于开源项目二次开发，版权归 original author 所有 | This software is based on an open‑source project. All rights belong to the original author. | 当ソフトウェアはオープンソースプロジェクトに基づきます。著作権は原著作者に帰属します。 | 본 소프트웨어는 오픈소스 프로젝트를 기반으로 합니다. 모든 권리는 원저자에게 있습니다。
- 本软件不提供任何担保，使用风险自负。仅供学习研究。 | No warranty — use at your own risk. For study purposes only. | 無保証 — 自己責任で使用してください。学習目的のみ。 | 무보증 — 사용 위험은 본인 부담입니다. 학습 목적으로만 사용하세요。

---

## 🚀 当前版本 | Current Version | 現行バージョン | 현재 버전

**v2400.1.10 — Dependency Modernization Release (2026‑06‑12)**

| Metric / 指标 / 指標 / 지표 | Value / 值 / 値 / 값 |
|---|---|
| Gradle | **8.7 → 9.1.0** |
| AGP | **8.5.2 → 9.0.1** |
| Kotlin | **1.9.24 → 2.0.21** |
| Coroutines | **1.8.1 → 1.9.0** |
| protobuf | 手写 generateProto task 替代插件 / custom task replaces plugin / カスタムタスクでプラグイン代替 / 커스텀 태스크로 플러그인 대체 |
| ktlint | **14.2.0** — 零违规 / zero violations / 違反ゼロ / 위반 제로 |
| detekt | **1.23.8** — 0 异味 / 0 smells / 0 臭い / 0 스멜 |
| Total features | **35 550+** |
| CI code‑style gate | ✅ PR + push 门禁 / gate / ゲート / 게이트 |

---

## 📦 工具链 | Toolchain | ツールチェーン | 도구 체인

| Tool / 工具 / ツール / 도구 | Version / バージョン / 버전 | Notes |
|---|---|---|
| Gradle | 9.1.0 | with JVM 17 |
| AGP (Android Gradle Plugin) | 9.0.1 | — |
| Kotlin | 2.0.21 | K2 compiler |
| Kotlin Coroutines | 1.9.0 | — |
| protobuf | 3.25.3 (protoc) + 1.72.0 (grpc‑java) | 自定义 generateProto task / custom task / カスタムタスク / 커스텀 태스크 |
| ktlint | 14.2.0 | IntelliJ IDEA code style |
| detekt | 1.23.8 | baseline mode |

---

## 🧪 代码质量 | Code Quality | コード品質 | 코드 품질

```bash
# Kotlin lint (ktlint)
./gradlew ktlintCheck       # 检查 / check / チェック / 검사
./gradlew ktlintFormat      # 自动修复 / auto‑fix / 自動修正 / 자동 수정

# Static analysis (detekt)
./gradlew detekt            # 分析 / analyze / 分析 / 분석
./gradlew detektBaseline    # 生成基线 / generate baseline / ベースライン生成 / 베이스라인 생성
```

**CI 门禁 / CI Gate / CI ゲート / CI 게이트**: `push` + `pull_request` 自动运行 ktlint + detekt，零违规方可通过。
Auto‑runs on every push & PR — must pass with zero violations.
プッシュ・PR で自動実行 — 違反ゼロでなければマージ不可。
푸시·PR 시 자동 실행 — 위반 제로여야 통과.

---

## 📊 架构 | Architecture | アーキテクチャ | 아키텍처

```
core/prefs/
├── AppPrefs.kt                         ← v31‑v700 properties
├── FeaturePrefs701to731.kt
├── …
├── FeaturePrefs2381to2391.kt
├── FeaturePrefsAccessor.kt             ← 170 lazy declarations
└── FeaturePrefsIntegrityTest.kt

feature/player/
├── PlayerSettings.kt
├── PlayerSettingsPart1to101.kt
├── …
└── PlayerSettingsPart99to99.kt
```

---

## 📝 版本日志 | Changelog | 変更履歴 | 변경 로그

### v2400.1.10 (2026‑06‑12) — dependency modernization
- ✅ Gradle 8.7 → 9.1.0, AGP 8.5.2 → 9.0.1, Kotlin 1.9.24 → 2.0.21
- ✅ Coroutines 1.8.1 → 1.9.0
- ✅ Custom `generateProto` task (replaces incompatible protobuf‑gradle‑plugin)
- ✅ ktlint 14.2.0 integrated — zero violations
- ✅ detekt 1.23.8 integrated — 0 smells, baseline mode
- ✅ CI code‑style gate (ktlint + detekt on push & PR)

### v2400.1.9 (2026‑06‑10) — stable baseline
- ✅ File consolidation: 392 → 102 Kotlin files (−74％)
- ✅ Gradle parallel, caching, G1GC enabled
- ✅ R8 enabled for release builds

### v2400.1.3 — structural consolidation
- 221 PlayerSettingsPart files → 56
- 170 FeaturePrefs files → 43

### v2400.1.0 — test infrastructure
- FeaturePrefsIntegrityTest added
- Robolectric dependency added

---

## 🔧 构建 | Build | ビルド | 빌드

```bash
git clone https://github.com/min09577/blbl.git
cd blbl
./gradlew assembleDebug      # debug APK
./gradlew assembleRelease    # release APK (R8‑optimised)
```

### CI / CD
- Tag push (`v*`) 触发构建 / triggers build / ビルドトリガー / 빌드 트리거
- ubuntu‑latest + Java 17 temurin + Gradle cache
- APK 发布到 GitHub Releases / published to GitHub Releases / GitHub Releases に公開 / GitHub Releases에 게시

---

## 📄 文档 | Docs | ドキュメント | 문서

- [`ARCHITECTURE.md`](ARCHITECTURE.md) — 架构与设计决策 / architecture & design decisions
- [`CONTRIBUTING.md`](CONTRIBUTING.md) — 贡献指南 / contribution guide

---

## 📜 License

Based on [cat3399/blbl](https://github.com/cat3399/blbl). All rights belong to the original author.
