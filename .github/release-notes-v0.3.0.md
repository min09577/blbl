## 🧬 v0.3.0 — AI 自主演进版

> 由 OpenClaw AI Agent 全自动迭代维护，零人工干预。从上游代码同步到工具链升级、质量门禁、多屏适配到 CI/CD 发布管道，全程自主完成。

---

### 🖥 跨设备自适应引擎

- **ScreenSizer** — 设备智能分类系统，基于 dp 宽度 + isTvDevice() 自动判定 Phone / Tablet / TV 三种形态因子
- **GridSpanPolicy** — 自适应网格布局策略，TV 模式下自动降低列密度、放大卡片尺寸以匹配 2.5–3m 观看距离
- **TV Dimens 覆盖层** — 侧边栏宽度 · 视频卡片 · 播放器控件全维度 TV 适配

### ⏱ 播放器休眠定时器

- 15 / 30 / 60 / 90 / 120 分钟预设，SharedPreferences 持久化
- 手势快捷方式系统接入，一键触发

### 📦 上游同步（464 commits）

- 同步 [cat3399/blbl](https://github.com/cat3399/blbl) 截至 2026-06-12 的全部修复与增强
- 关键修复：App 接口详情页 · 播放进度恢复 · TextureView 崩溃 · IjkPlayer 卡死
- 新能力：1.75x 倍速 · 历史记录清空 · 全局搜索

### 🏗️ 工具链全栈现代化

| 组件 | 版本 |
|------|------|
| Gradle | 8.7 → **9.4.1** |
| AGP | 8.5.2 → **9.2.0** |
| Kotlin | 1.9.24 → **2.0.21** (K2 编译器) |
| Coroutines | 1.8.1 → **1.9.0** |

- 自定义 proto 编译管线（protoc 25.3 + grpc-java 1.72.0 直取，零 Gradle 依赖）
- 12 项 Kotlin compiler deprecation warning 清零
- R8 并行 DEX 支持

### 🛡️ 代码质量自治

- ktlint 零违规 · detekt 零 Code Smell（604K LoC 基线）
- CI 自动门禁：PR / Push to Main 自动触发 ktlint + detekt

### 🚀 CI/CD 发布管线

```
Tag Push (v*)
  ├── build-debug   → 调试 APK
  ├── build-release → 签名发布 APK
  ├── build-tv      → TV 签名 APK
  └── publish       → GitHub Release + Cloudflare R2 CDN 分发
```

- Dependabot weekly 自动依赖更新（Gradle + GitHub Actions 分组）

### 🐛 上游 Bug 修复（v0.2.0 起累积）

- IjkPlayer 卡死 / seek 异常 / 进度条回弹
- 直播弹幕异常抖动
- 切换主题崩溃 · 视频时长识别异常 · 头像过大 OOM
- 续签 CDN 超时崩溃 · 评论区协程泄漏
- 3 项预存测试失败修复

---

**全部代码变更由 OpenClaw AI Agent 自主完成。** [完整变更日志](CHANGELOG.md)
