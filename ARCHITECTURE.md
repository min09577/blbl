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
│  │  Dialogs     │    │  PlayerSettingsPart1to101.kt     │   │
│  │  Toasts      │    │  PlayerSettingsPart11to112.kt    │   │
│  │              │    │  ... (56 merged files)           │   │
│  └──────────────┘    │  ~35,667 functions                │   │
│                      └─────────────┬────────────────────┘   │
│                                    │                         │
│  ┌─────────────────────────────────▼──────────────────────┐ │
│  │               Storage Layer (Prefs)                     │ │
│  │                                                         │ │
│  │  ┌─────────────┐    ┌───────────────────────────────┐  │ │
│  │  │  AppPrefs   │    │  FeaturePrefs701to731.kt      │  │ │
│  │  │  (v31-v700) │    │  FeaturePrefs741to771.kt      │  │ │
│  │  │  ~10,050    │    │  ... (43 merged files,        │  │ │
│  │  │  properties │    │   170 batches, ~25,500 props)  │  │ │
│  │  └──────┬──────┘    └──────────────┬─────────────────┘  │ │
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

| 类别 | 文件数 | 说明 |
|------|--------|------|
| AppPrefs.kt | 1 | 基础设置存储 (v31-v700) |
| FeaturePrefs*.kt | **43** | 合并存储文件 (170 批次, v701-v2400) |
| FeaturePrefsAccessor.kt | 1 | 统一 lazy 访问入口 |
| PlayerSettings.kt | 1 | Helper 函数 (~4.7K 行) |
| PlayerSettingsPart*.kt | **56** | 合并功能函数 (~35,667 函数) |
| **Kotlin 编译单元** | **102** | (-74% from 392) |

## 关键设计决策

### 1. 为什么合并文件？
- 原始拆分: 221 个 Part 文件 + 170 个 FeaturePrefs 文件 = 392 编译单元
- Kotlin 编译器在大量小文件下开销显著
- 合并为 102 个编译单元 (-74%) 显著减少编译器开销
- 功能完整性: 35,667 函数 + 25,500 属性，零丢失

### 2. 为什么引入 FeaturePrefs？
- AppPrefs.kt 达到 ~62K 行时，Kotlin 编译器 OOM (>8GB)
- FeaturePrefs 使用独立 SharedPreferences 存储
- v701+ 功能完全独立于 v31-v700

### 3. 编译内存限制
- GitHub Actions 标准 Runner: 7GB 总内存
- Gradle JVM: 6GB (`-Xmx6g`)
- Kotlin 守护进程: 4GB (`-Xmx4g`)
- 稳定上限: ~35,000 个功能 (v2400)

### 4. 构建性能优化
- Gradle 并行构建 + 缓存 + 按需配置
- G1GC 垃圾回收器
- R8 混淆 + 资源压缩 (Release)
- Kotlin 编译器优化标志

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
