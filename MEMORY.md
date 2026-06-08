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

## Current Status (2026-06-08 21:00)
- **Latest Release**: v220.15.0 (CI build succeeded)
- **Total Features**: 2850+ (v31-v220, 190 versions × 15 features)
- **README**: Updated to v211-v220 (4 languages)
- **Next**: Continue with v221-v230 and beyond
- **Mode**: Loop development (user requested continuous feature batches)

## Session Log (2026-06-08 Evening)
- Successfully developed v151-v210 (60 versions, 900 features)
- All CI builds passed
- README updated with 4-language changelog
- Development pattern stable and efficient
