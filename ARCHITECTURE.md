# 架构文档 | Architecture Guide

## 系统总览 | System Overview

```
┌─────────────────────────────────────────────────────────────┐
│                    blbl Android App                          │
├─────────────────────────────────────────────────────────────┤
│                                                              │
│  ┌──────────────┐    ┌──────────────────────────────────┐   │
│  │   UI Layer   │    │         Feature Layer             │   │
│  │              │    │                                   │   │
│  │  Settings    │◄──►│  PlayerSettings.kt (helpers)     │   │
│  │  Dialogs     │    │  PlayerSettingsPart1.kt (v23-v60)│   │
│  │  Toasts      │    │  PlayerSettingsPart2.kt (v61-v90)│   │
│  │              │    │  ...                              │   │
│  └──────────────┘    │  PlayerSettingsPart221.kt        │   │
│                      └─────────────┬────────────────────┘   │
│                                    │                         │
│  ┌─────────────────────────────────▼──────────────────────┐ │
│  │               Storage Layer (Prefs)                     │ │
│  │                                                         │ │
│  │  ┌─────────────┐    ┌───────────────────────────────┐  │ │
│  │  │  AppPrefs   │    │  FeaturePrefs701.kt           │  │ │
│  │  │  (v31-v700) │    │  FeaturePrefs711.kt           │  │ │
│  │  │  ~10,050    │    │  ...                          │  │ │
│  │  │  properties │    │  FeaturePrefs2391.kt          │  │ │
│  │  └──────┬──────┘    │  (v701-v2400, 170 batches)    │  │ │
│  │         │           └──────────────┬─────────────────┘  │ │
│  │         │                          │                     │ │
│  │  ┌──────▼──────────────────────────▼─────────────────┐  │ │
│  │  │         FeaturePrefsAccessor.kt                   │  │ │
│  │  │         (lazy { FeaturePrefs... } × 170)          │  │ │
│  │  └──────────────────────┬───────────────────────────┘  │ │
│  └─────────────────────────┼─────────────────────────────┘ │
│                            │                                │
│  ┌─────────────────────────▼─────────────────────────────┐ │
│  │            Android SharedPreferences                   │ │
│  │  ├── blbl_prefs.xml (AppPrefs)                        │ │
│  │  ├── feature_prefs_701.xml                            │ │
│  │  ├── feature_prefs_711.xml                            │ │
│  │  └── ... (170 files)                                  │ │
│  └───────────────────────────────────────────────────────┘ │
└─────────────────────────────────────────────────────────────┘
```

## 文件统计 | File Stats

| 类别 | 文件数 | 总行数 | 说明 |
|------|--------|--------|------|
| AppPrefs.kt | 1 | ~62K | 基础设置存储 |
| FeaturePrefs*.kt | 170 | ~30K | 扩展存储 |
| FeaturePrefsAccessor.kt | 1 | ~2K | 访问入口 |
| PlayerSettings.kt | 1 | ~4.7K | Helper 函数 |
| PlayerSettingsPart*.kt | 221 | ~344K | 功能函数 |
| **合计** | **394** | **~443K** | |

## 关键设计决策

### 1. 为什么拆分 PlayerSettings？
- 单文件 ~4.7K 行 helper + ~344K 行功能函数 → JVM 类文件过大
- 拆分为 221 个 Part 文件，每个文件独立编译
- Main file (PlayerSettings.kt) 只包含共享 helper 函数

### 2. 为什么引入 FeaturePrefs？
- AppPrefs.kt 达到 ~62K 行时，Kotlin 编译器 OOM (>8GB)
- FeaturePrefs 使用独立 SharedPreferences 存储
- v701+ 功能完全独立于 v31-v700

### 3. 编译内存限制
- GitHub Actions 标准 Runner: 7GB 总内存
- Gradle JVM: 6GB (`-Xmx6g`)
- Kotlin 守护进程: 4GB (`-Xmx4g`)
- 稳定上限: ~35,000 个功能 (v2400)

## 新增功能指南

### 添加一个新的 Toggle 功能 (Bool)
```kotlin
// 1. 在对应的 FeaturePrefs 文件中添加属性
var v2401newFeature: Boolean
    get() = prefs.getBoolean(KEY_V2401NEWFEATURE, false)
    set(value) = prefs.edit().putBoolean(KEY_V2401NEWFEATURE, value).apply()

const val KEY_V2401NEWFEATURE = "v2401newFeature"

// 2. 在 PlayerSettingsPart 文件中添加函数
internal fun PlayerActivity.showV2401newFeatureToggle() {
    val current = FeaturePrefsStore.batch2401.v2401newFeature
    FeaturePrefsStore.batch2401.v2401newFeature = !current
    AppToast.show(this, "功能：${if (!current) "开启" else "关闭"}")
}
```

### 添加一个新的 Dialog 功能 (Int)
```kotlin
// 1. 在 FeaturePrefs 中添加
var v2401newChoice: Int
    get() = prefs.getInt(KEY_V2401NEWCHOICE, 0)
    set(value) = prefs.edit().putInt(KEY_V2401NEWCHOICE, value).apply()

const val KEY_V2401NEWCHOICE = "v2401newChoice"

// 2. 在 PlayerSettingsPart 中添加函数
internal fun PlayerActivity.showV2401newChoiceDialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(FeaturePrefsStore.batch2401.v2401newChoice).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "新选择",
        options = options,
        checkedIndex = currentIndex,
        label = { v -> when(v) { 0->"选项A"; 1->"选项B"; 2->"选项C"; 3->"选项D"; else->"选项A" } }
    ) { choice ->
        FeaturePrefsStore.batch2401.v2401newChoice = choice
        AppToast.show(this, "已选择: $choice")
    }
}
```
