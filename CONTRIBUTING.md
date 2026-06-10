# 贡献指南 | Contributing Guide

感谢你对 blbl 项目的关注！以下是参与贡献的指南。

Thank you for your interest in blbl! Here's how to contribute.

## 🚀 快速开始 | Quick Start

```bash
# 1. Fork 并克隆仓库
git clone https://github.com/YOUR_USERNAME/blbl.git
cd blbl

# 2. 创建功能分支
git checkout -b feature/your-feature

# 3. 开发、测试、提交
./gradlew assembleDebug
git commit -m "feat: add your feature"

# 4. 推送并创建 PR
git push origin feature/your-feature
```

## 📋 项目结构 | Project Structure

```
app/src/main/java/blbl/cat3399/
├── core/
│   ├── prefs/
│   │   ├── AppPrefs.kt          # 基础设置存储 (v31-v700)
│   │   ├── FeaturePrefs*.kt     # 扩展功能存储 (v701-v2400)
│   │   └── FeaturePrefsAccessor.kt  # 统一访问入口
│   ├── ui/                      # UI 组件 (Toast, Popup)
│   ├── net/                     # 网络层 (BiliClient)
│   └── ...
└── feature/player/
    ├── PlayerSettings.kt        # 主设置面板
    ├── PlayerSettingsPart*.kt   # 功能函数 (56 个合并文件)
    └── ...
```

## 🏗️ 架构说明 | Architecture

### 功能存储层
- **AppPrefs**: 使用 SharedPreferences 存储 v31-v700 的设置
- **FeaturePrefs**: 独立的 SharedPreferences 存储 v701-v2400 的设置 (43 个合并文件, 170 批次)
- **FeaturePrefsAccessor**: 统一的 lazy 访问器，提供所有 FeaturePrefs 批次的访问

### UI 层
- **Toggle 功能**: `BiliClient.prefs.xxxProperty = !current` + `AppToast.show()`
- **Choice 功能**: `showSettingsChoiceDialog()` 提供选项列表

### 新功能开发流程
1. 在 `FeaturePrefs` 或 `AppPrefs` 中添加属性
2. 在 `PlayerSettingsPartX.kt` 中添加函数
3. 函数命名: `showV{N}{Description}Toggle()` 或 `showV{N}{Description}Dialog()`
4. 属性命名: `v{N}{camelCase}` (如 `v1001darkMode`)

## 🧪 测试 | Testing

```bash
# 运行 FeaturePrefs 完整性测试
./gradlew test --tests "blbl.cat3399.core.prefs.FeaturePrefsIntegrityTest"

# 构建 debug APK
./gradlew assembleDebug
```

## 📝 提交规范 | Commit Convention

```
类型(范围): 描述

feat: 新功能
fix: 修复
docs: 文档
style: 格式
refactor: 重构
test: 测试
chore: 其他

示例:
feat: add v1001 dark mode toggle
fix: fix v36 orphan property reference
docs: update architecture diagram
```

## ⚠️ 注意事项 | Notes

- **不要添加更多骨架功能**: v2400 是当前的稳定版本上限
- **优化现有代码**: 欢迎性能优化、bug 修复、文档改进
- **编译限制**: 标准 GitHub Actions Runner (7GB RAM) 只能稳定编译 ~35,000 个功能
- **新增功能**: 如果需要添加新功能，请先讨论方案

## 📖 四国语言 | Languages

README 和重要文档需要同时提供中/英/日/韩四国语言版本。
