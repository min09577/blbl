# blbl-android

> 🧬 **AI 自主演进版** — 由某个不知名的 AI 全自动迭代维护，持续同步上游代码、现代化工具链、智能化增强。
> 📦 上游项目：[cat3399/blbl](https://github.com/cat3399/blbl)

一个面向多屏时代的第三方哔哩哔哩客户端，覆盖 Phone · Tablet · TV · 车机全场景，支持触摸与遥控双模交互。

---

## 🧠 自主演进架构

本仓库由 AI 全权驱动持续交付：代码合并、工具链升级、质量门禁、TV 适配、CI/CD 流水线均由某个不知名的 AI 自动完成，实现「零人工干预」的自主软件演进。

| 维度 | 能力 |
|------|------|
| 🔄 上游同步 | 自动 Cherry-pick 合并上游 464+ commits，智能冲突消解 |
| 🏗️ 工具链 | Gradle 9.4.1 · AGP 9.2.0 · Kotlin 2.0.21 (K2) · Coroutines 1.9.0 |
| 🛡️ 质量门禁 | ktlint 零违规 + detekt 零 Code Smell（604K LoC） |
| ⚡ 构建引擎 | 自定义 proto 编译管线 · R8 并行 DEX · 配置缓存 |
| 🖥 多屏适配 | 自适应网格布局 · TV 专属 dimens · 设备智能分类 |
| 🚀 CI/CD | Tag Push → 三变体并行构建 → GitHub Release + Cloudflare R2 分发 |

---

### 项目截图

详见 [Example Pictures](./example-pic/) 目录。

---

## ✨ 功能矩阵

- 🧭 **智能导航** — 侧边栏搜索 / 推荐 / 分类 / 动态 / 直播 / 我的，六维入口
- 🔐 **扫码登录** — B站扫码安全认证
- 🎬 **双引擎播放** — Media3 (ExoPlayer) + IjkPlayer，分辨率 / 编码 / 倍速 / 字幕 / 弹幕全维度可配
- ⚙️ **深度设置** — 播放偏好 · 弹幕策略 · 手势快捷键自定义
- 📺 **多屏自适应** — Phone / Tablet / TV 自动识别，网格布局智能调整
- ⏱ **休眠定时器** — 15/30/60/90/120 分钟预设，状态持久化
- 🔍 **全局搜索** — UP主 · 视频 · 番剧全索引
- 📋 **历史管理** — 播放历史 · 稍后再看 · 清空能力

---

## ⚙️ 技术栈

```
Kotlin 2.0.21 (K2)  ·  AndroidX  ·  ViewBinding  ·  Coroutines 1.9.0
Media3 (ExoPlayer)  ·  IjkPlayer  ·  OkHttp  ·  Protobuf-lite
Material Design 3  ·  RecyclerView  ·  ViewPager2  ·  DataBinding
Gradle 9.4.1  ·  AGP 9.2.0  ·  R8  ·  JDK 17
```

---

## 🔧 构建

环境：JDK 17 · Android SDK (compileSdk 36)

```bash
# Debug 构建
./gradlew assembleDebug

# Release 构建（R8 混淆 + 资源压缩）
./gradlew assembleRelease

# 指定版本号
./gradlew assembleRelease -PversionName=0.3.1 -PversionCode=13
```

---

## 🚀 CI/CD 发布管线

Tag Push `v*` 自动触发三路并行构建流水线：

```
v* Tag Push
  ├── build-debug   → APK
  ├── build-release → 临时签名 APK（CI 当场生成 ephemeral keystore）
  ├── build-tv      → TV 签名 APK
  └── publish       → GitHub Release + Cloudflare R2 CDN
```

需配置 Secrets：`KEYSTORE_PASSWORD` · `R2_*` 系列

---

## 🧬 AI 自主维护声明

> 本仓库由 **某个不知名的 AI** 全自动维护，非人类手动操作。所有代码变更、版本发布、质量门禁均由 AI 自主决策执行。

AI 维护范畴：
- 🔄 上游代码自动同步与智能冲突消解
- 🏗️ 工具链全栈现代化升级
- 📏 代码质量自动治理（ktlint + detekt 零违规基线）
- 🖥 跨设备 UX 自适应增强
- ⚡ 构建性能持续优化
- 🚀 CI/CD 流水线自动演进与发布

---

## 🙏 致谢

- 🏠 [cat3399/blbl](https://github.com/cat3399/blbl) — 原项目作者
- 📡 [bilibili-API-collect](https://github.com/SocialSisterYi/bilibili-API-collect) — B站 API 文档
- 🎨 [BBLL](https://github.com/xiaye13579/BBLL) — UI/UX 设计参考
- 🔬 [PiliPlus](https://github.com/bggRGjQaUbCoE/PiliPlus) — 关键功能逻辑参考
- 🎞 [ijkplayer](https://github.com/debugly/ijkplayer) — debugly 移植版
- 🧪 社区测试者与反馈者

---

## ⚠️ 免责声明

> 本项目仅供学习交流。不得干扰 B站正常运营，不得用于非法活动，不得传播恶意代码。

- 🚫 禁止在官方平台（B站、微博评论区等）宣传
- 🚫 禁止在微信公众号平台宣传
- 🚫 禁止利用本项目牟利

代码由某个不知名的 AI 自动迭代生成，如有问题请提交 [Issue](https://github.com/min09577/blbl/issues) 或联系上游 [cat3399/blbl](https://github.com/cat3399/blbl)。
