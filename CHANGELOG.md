# CHANGELOG

## v0.3.0 (2026-06-13)

### 🖥 TV/大屏适配
- ScreenSizer：设备分类（PHONE/TABLET/TV），基于 dp 宽度 + isTvDevice() 检测
- GridSpanPolicy：TV 模式自动降低列数、增大卡片
- TV 专属 dimens 覆盖：侧边栏宽度、视频卡片、播放器控件适配 2.5–3m 观看距离

### ⏱ 休眠定时器
- 播放器休眠定时器（15/30/60/90/120 分钟预设）
- 状态持久化（SharedPreferences），支持配置重载
- 可接入手势快捷方式系统

### 📦 上游同步
- 同步 [cat3399/blbl](https://github.com/cat3399/blbl) 464 个提交（截止 2026-06-12）
- 修复 app 接口详情页无法进入、进度恢复无效、TextureView 崩溃等问题
- 新增 1.75 倍速、清空历史记录、搜索功能等特性

### ⚡ 基础设施
- Gradle 配置缓存启用
- Dependabot weekly 自动更新 + 分组（Gradle / GitHub Actions）
- 统一 Release workflow（debug + release + TV 三合一 tagged 发布）
- API19 (KitKat, minSdk 19) 分支同步及 CI 修复
- Kotlin 编译器优化（precise incremental、experimental warning suppress）
- R8 并行 DEX 支持

## v0.2.0 (2026-06-13)

### 🏗️ 构建工具现代化
- Gradle 8.7 → 9.1.0
- AGP 8.5.2 → 9.0.1
- Kotlin 1.9.24 → 2.0.21 (K2 编译器)
- Coroutines 1.8.1 → 1.9.0
- 所有 Kotlin 编译器 deprecation warning 清零（12 项修复）
- 修复 3 项已有测试失败

### 🐛 上游 Bug 修复同步
- 同步上游 103 个文件修复（cherry-pick from cat3399 v46.1.0）
- IjkPlayer 卡死、seek 异常、进度条回弹修复
- 直播弹幕异常抖动修复
- 切换主题崩溃修复
- 视频时长识别、头像过大崩溃修复
- 续签 CDN 超时崩溃修复
- 评论区协程异常修复

### 🚀 CI/CD 完整体系
- 自动代码质量门禁（ktlint + detekt）
- 统一 Release workflow：tag push `v*` 自动构建 debug + release + TV 三个变体
- 自动创建 GitHub Release 并上传至 Cloudflare R2
- 支持手动 workflow_dispatch 触发，可选跳过任意构建变体
- 所有 workflow 已迁移至 Node.js 24（6 月 16 日 GitHub Actions deadline 前完成）

### ⚙️ 工程改进
- 自定义 generateProto：protoc/grpc-java 从 GitHub/Maven 直取，无需 Gradle 依赖
- CI 编译优化：Kotlin daemon 4GB、workers=1、G1GC 调优
- 配置缓存尝试后关闭（自定义 task 使用不兼容 Gradle API）

---

## 0.1.26

1. 修复0.1.25的一些问题
2. 仅允许自动更新检查在冷启动时触发
3. 切换到 App 接口前增加必要检查
4. 更新弹窗支持切换版本

## 0.1.25

1. 初步支持 Web/App 接口切换（首次切换必须重新登陆！）
2. 增加空降助手提交功能
3. 支持多账号登录与账号切换
4. 增加主动切换视频时显示标题
5. 修复直播弹幕异常抖动
6. 调整一些样式，修复一些bug
7. 其余零散修改

## 0.1.24

1. 修复 0.1.22 升级到 0.1.23 后部分设备无法启动的bug
2. 折叠过长简介

## 0.1.23

1. 修复 IjkPlayer 不定时卡死、seek 卡住和进度条回弹等问题
2. 修复视频卡片长按不显示操作按钮
3. 直播播放器增加 UP 主关注卡片
4. 自定义页来源增加搜索
5. 历史页支持显示直播内容
6. 重构搜索页
7. 增加更新日志提示
8. 修复切换主题导致应用退出的问题
9. 修复焦点框被切割的问题
10. 其余零散修改

## 0.1.22

1. 修复 IjkPlayer 播放器 seek 异常的 bug
2. 丰富视频卡片长按行为，稍后再看、详情、UP 主页或不感兴趣
3. 视频列表支持加载更多内容
4. 首页、分类、直播、我的页面自定义显示 tab
5. 评论显示点赞数，看图允许放大
6. 播放器增加更多配置项
7. 修复视频时长识别、头像过大崩溃、页面刷新位置异常等问题
8. 增加经典主题

## 0.1.21

1. 新增自定义页，支持将推荐、分类、动态、直播与"我的"中的内容按需组合到独立入口
2. 支持配置导入/导出
3. 重构播放器设置与交互：支持进度条缩略图、缓冲动画与更多触摸手势；增加更多自定义快捷键功能和弹幕配置
4. 播放器内增加 UP 主卡片和关注按钮、一键三连；历史记录与稍后再看支持显示进度
5. 完善续播、播放下一个与播放模式逻辑，支持播放完成后重新播放
6. 完善风控与弹幕兜底逻辑；修复评论区图片过大、续签 CDN、协程异常、页面恢复等导致的崩溃问题
7. 其余零散修改
