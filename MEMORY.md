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

## Current Status (2026-06-08 18:00)
- **Latest Release**: v150.15.0 (CI build succeeded)
- **Total Features**: 2100+ (v31-v150, 120 versions × 15 features)
- **README**: Updated to v141-v150 (4 languages)
- **Next**: v151-v160 script written, needs execution
- **Mode**: Loop development (user requested continuous feature batches)
