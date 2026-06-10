# MEMORY.md - BLBL Project

## Project Overview
- **Repository**: https://github.com/min09577/blbl.git
- **Description**: 第三方哔哩哔哩安卓客户端 (Third-party Bilibili Android Client)
- **Tech Stack**: Kotlin + Android + Media3 + IjkPlayer
- **CI**: android-debug.yml (tag push triggers Debug APK build)

## Development Patterns

### Code Generation for Features
- **AppPrefs.kt structure**: properties before `companion object`, keys inside it
- **SharedPreferences variable**: `prefs` (NOT `mSharedPreferences`)
- **Property naming**: version-prefixed like `v131audioChorusDepth`
- **Key naming**: `KEY_V131AUDIOCHORUSDEPTH`
- **KEY value**: same as property name (e.g., `"v131audioChorusDepth"`)
- **Bool default**: `false` (Kotlin literal, not Python `False`)
- **PlayerSettings functions**: `BiliClient.prefs.v{ver}{name_lower}` for both get/set
- **Line-based insertion**: no more placeholder markers; use line counting

### Tag/Release Management
- Delete remote tag first: `git push origin :refs/tags/vXXX`
- Delete local tag: `git tag -d vXXX`
- Create new tag: `git tag vXXX`
- Push: `git push origin vXXX`

### Common Pitfalls
1. Simple `str.replace()` doesn't respect word boundaries - use version-prefixed names
2. Brace counting must iterate ALL characters, not just stripped lines
3. `const val` must be inside `companion object`
4. Properties must be between class body and `companion object`

## Current Status (2026-06-10)
- **Latest Release**: v2400.1.2 ✅
- **Total Features**: ~35,550 (v31-v2400)
- **CI Builds**: 14 consecutive successes
- **Architecture**: FeaturePrefs (170 batches) + PlayerSettingsPart (221 files)
- **Mode**: Optimization phase (no new features, focus on quality)
- **Key Docs**: README (152 lines) + ARCHITECTURE.md + CONTRIBUTING.md
- **Test**: FeaturePrefsIntegrityTest

## Build Limit
- GitHub Actions standard runner (7GB RAM) caps at ~35,000 features
- Gradle: `-Xmx6g`, Kotlin daemon: `-Xmx4g`
- v2400 is the last stable version (9-10 min build)

## Optimization Log (2026-06-10)
- v2400.1.0: Added unit test + Robolectric
- v2400.1.1: README 73K→152 lines
- v2400.1.2: Cleaned 505 unused imports, fixed package ordering, added architecture docs
