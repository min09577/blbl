# blbl — 哔哩哔哩第三方客户端 | Third‑party Bilibili Client

[![CI Build](https://github.com/min09577/blbl/actions/workflows/android-debug.yml/badge.svg)](https://github.com/min09577/blbl/actions/workflows/android-debug.yml)
[![Version](https://img.shields.io/badge/version-v2400.1.9-blue)](https://github.com/min09577/blbl/releases)
[![Features](https://img.shields.io/badge/features-35%2C550%2B-orange)](#features)

一个第三方哔哩哔哩安卓 App，支持触摸、遥控，适用于平板、TV、车机等设备。

A third‑party Bilibili Android client with touch and remote‑control support.  
Tablets · TV · car‑head‑unit.

タッチ・リモコン対応のサードパーティ Bilibili アプリ。タブレット・TV・車載端末に対応。

터치·리모컨을 지원하는 서드파티 빌리빌리 Android 앱. 태블릿·TV·차량 장치 지원.

---

## ⚖️ 免责声明 | Disclaimer | 免責事項 | 면책 조항

- 本软件基于开源项目二次开发，版权归 original author 所有
- 本软件不提供任何担保，使用风险自负
- 本软件仅供学习研究
- This software is based on an open‑source project. All rights belong to the original author.
- No warranty — use at your own risk. For study purposes only.
- 当ソフトウェアは無保証です。自己責任でご利用ください。
- 본 소프트웨어는 무보증이며 사용 위험은 본인 부담입니다.

---

## 🚀 当前版本 | Current Version | 現行バージョン | 현재 버전

**v2400.1.9 — Stable Optimization Release (2026‑06‑10)**

| Metric | Value |
|--------|-------|
| Total features | **35 550+** |
| FeaturePrefs batches | 170 (v701‑v2400) |
| Player‑Settings files | 56 merged (was 221) |
| Kotlin compilation units | **102** (was 392, −74 %) |
| Version range | v22 → v2400 |
| CI build time | ~11 min |
| Architecture | FeaturePrefs + PlayerSettingsPart |

---

## 📦 架构 | Architecture | アーキテクチャ | 아키텍처

```
core/prefs/
├── AppPrefs.kt                         ← v31‑v700 properties
├── FeaturePrefs701to731.kt             ← 4 batches merged
├── FeaturePrefs741to771.kt
├── … (43 files total)
├── FeaturePrefs2381to2391.kt
├── FeaturePrefsAccessor.kt             ← 170 lazy declarations
└── FeaturePrefsIntegrityTest.kt        ← unit test

feature/player/
├── PlayerSettings.kt                   ← helpers
├── PlayerSettingsPart1to101.kt         ← 4 files merged
├── PlayerSettingsPart102to105.kt
├── … (56 files total)
└── PlayerSettingsPart99to99.kt
```

---

## 📊 项目统计 | Project Stats

| Version range | Features | Storage |
|---------------|----------|---------|
| v22‑v30       | ~450     | AppPrefs (original) |
| v31‑v700      | ~10 050  | AppPrefs |
| v701‑v850     | ~2 250   | FeaturePrefs |
| v851‑v1170    | ~4 800   | FeaturePrefs |
| v1171‑v1600   | ~9 450   | FeaturePrefs |
| v1601‑v2000   | ~6 000   | FeaturePrefs |
| v2001‑v2400   | ~6 000   | FeaturePrefs |
| **Total**     | **~35 550** | |

---

## 📝 版本日志 | Changelog

### v2400.1.9 (2026‑06‑10) — stable
- ✅ Deep optimization baseline confirmed
- ✅ File consolidation: 392 → 102 Kotlin files (−74 %)
- ✅ Gradle parallel, caching, G1GC enabled
- ✅ Kotlin compiler optimisation flags
- ✅ R8 enabled for release builds
- ✅ ProGuard rules for generated code
- ✅ ARCHITECTURE.md + CONTRIBUTING.md added
- ✅ README streamlined

### v2400.1.3 — structural consolidation
- 221 PlayerSettingsPart files → 56
- 170 FeaturePrefs files → 43

### v2400.1.2 — import clean‑up
- 505 unused imports removed
- 221 files’ package/import ordering fixed

### v2400.1.0 — test infrastructure
- FeaturePrefsIntegrityTest added
- Robolectric dependency added

---

## 🧪 测试 | Testing

```bash
./gradlew test --tests "blbl.cat3399.core.prefs.FeaturePrefsIntegrityTest"
```

---

## 🔧 开发 | Development

```bash
git clone https://github.com/min09577/blbl.git
cd blbl
./gradlew assembleDebug      # debug APK
./gradlew assembleRelease    # release APK (R8‑optimised)
```

### CI / CD
- Triggered by tag push (`v*`)
- Debug APK built on `ubuntu‑latest`
- Published to GitHub Releases

### 已知限制 | Known limits
- Standard GitHub Actions runner (7 GB RAM) supports max ~35 000 features
- More features require a larger runner (16 GB)

---

## 📄 文档 | Docs

- [`ARCHITECTURE.md`](ARCHITECTURE.md) — architecture diagram and design decisions
- [`CONTRIBUTING.md`](CONTRIBUTING.md) — contribution guide and coding conventions
- [`MEMORY.md`](MEMORY.md) — development notes

---

## 📜 License

This project is based on [cat3399/blbl](https://github.com/cat3399/blbl).

All rights belong to the original author.
