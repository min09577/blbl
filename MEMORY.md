# MEMORY.md - BLBL Project

## Project Overview
- **Repository**: https://github.com/min09577/blbl.git
- **Description**: 第三方哔哩哔哩安卓客户端 (Third-party Bilibili Android Client)
- **Tech Stack**: Kotlin + Android + Media3 + IjkPlayer
- **CI**: android-debug.yml (tag push triggers Debug APK build)

## Current Stable Version
**v2400.1.8** (2026-06-10)

> Full changelog: `memory/2026-06-10.md` | Lessons: `memory/2026-06-10-reflections.md`

| Metric | Value |
|--------|-------|
| Features | ~35,550 |
| Kotlin files | 102 (-74% from 392) |
| FeaturePrefs batches | 43 merged files (170 batches) |
| PlayerSettingsPart | 56 merged files (was 221) |
| CI build time | ~11 min |
| Build status | ✅ 6 consecutive successes |

## Architecture
- **AppPrefs.kt**: v31-v700 properties (no longer modified)
- **FeaturePrefs701to731.kt ~ FeaturePrefs2381to2391.kt**: 43 files, 170 classes
- **FeaturePrefsAccessor.kt**: 170 lazy declarations
- **PlayerSettings.kt**: helper functions
- **PlayerSettingsPart1to101.kt ~ PlayerSettingsPart99to99.kt**: 56 files
- **FeaturePrefsIntegrityTest.kt**: unit test

## Build Configuration (optimized)
- Gradle: parallel + cache + configure-on-demand + G1GC
- Kotlin: `-Xno-*-assertions`, `-Xjvm-default=all`
- Release: R8 minify + shrink enabled
- ProGuard: keep rules for generated code

## Code Generation Patterns
- **AppPrefs**: properties before `companion object`, keys inside it
- **FeaturePrefs**: class with `context.getSharedPreferences(name, MODE_PRIVATE)`
- **PlayerSettingsPart**: extension functions on PlayerActivity
- **Toggle**: `BiliClient.prefs.xxx = !current` + `AppToast.show()`
- **Choice**: `showSettingsChoiceDialog()` with `options.indexOf().takeIf { it >= 0 } ?: 0`

## Common Pitfalls
1. Do NOT modify FeaturePrefs file structure (KDoc annotations can break compilation)
2. Do NOT add more skeleton features (build memory limit reached at ~35,000)
3. Key naming: version-prefixed (e.g., `v701acknowledge`)
4. Bool default: always `false`
5. Import must be after package declaration

## Build Limits
- Standard GitHub Actions runner (7GB RAM) supports max ~35,000 features
- More features require a larger runner (16GB)
- v2400 is the stable limit

## Key Documents
- [`ARCHITECTURE.md`](ARCHITECTURE.md) - architecture diagram
- [`CONTRIBUTING.md`](CONTRIBUTING.md) - contribution guide
- [`memory/2026-06-10.md`](memory/2026-06-10.md) - daily log
