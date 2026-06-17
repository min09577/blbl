# Configuration Cache 重新启用 — C2 完成 ✅

## 目标
重新启用 Gradle Configuration Cache，此前因 `checkThemeTokens` 和 `generateProto` 两任务的 lambda 实现不兼容而被禁用。

## 根因
两个任务通过 `tasks.register { ... }` lambda 方式注册在 `.gradle.kts` 文件中，其闭包捕获了 Gradle 脚本对象引用，不可序列化，导致配置缓存无法存储。

## 解决方案
将两个任务提取为 `buildSrc` 模块中的正式 Task 类：

### 新建文件
1. **`buildSrc/build.gradle.kts`** — kotlin-dsl 插件配置
2. **`buildSrc/src/main/kotlin/CheckThemeTokens.kt`** — 布局主题令牌检查任务类
   - 使用 `@InputDirectory` + `@Internal` 声明属性，避免捕获脚本对象
   - `@TaskAction` 中仅使用标准 JDK/Kotlin API（File I/O、正则匹配）
3. **`buildSrc/src/main/kotlin/GenerateProto.kt`** — Proto 代码生成任务类
   - 使用 `@InputFiles`、`@OutputDirectory`、`@Input`、`@Internal` 声明全部属性
   - `@TaskAction` 中仅使用 JDK `ZipInputStream` / `ProcessBuilder`，无 Project API
   - `windowsHost` 命名避免 `is*` 前缀与 Kotlin/Gradle managed property 冲突

### 修改文件
4. **`app/build.gradle.kts`** — 替换 `tasks.register(...)` lambda 为 `tasks.register<CheckThemeTokens>(...)`
5. **`proto/build.gradle.kts`** — 替换 `tasks.register(...)` lambda 为 `tasks.registering(GenerateProto::class) {...}`，局部变量 `protoSourceDir` → `protoSrcDir`、`protoOutputDir` → `protoGenDir` 避免与 task 属性名冲突

## 遇到的问题
| 问题 | 修复 |
|------|------|
| `java.util.zip.ZipInputStream` — `java` 被 `java {}` DSL 块遮蔽 | 在 `buildSrc` 中无此问题；但 proto/build.gradle.kts 中原代码需 `import` |
| `isWindows: Property<Boolean>` — 生成 decorated class 失败 | 重命名为 `windowsHost`（`is*` 前缀与 Kotlin boolean 属性命名冲突） |
| `protoOutputDir` 局部变量与 task 属性同名导致循环引用 | 重命名为 `protoGenDir` |
| `buildDir` 可能与 `DefaultTask.buildDir` 冲突 | 重命名为 `workDir` |

## 结果
- **首次构建（含 protoc 下载）**：6m5s，47 actionable tasks
- **配置缓存复用**：3s，44 actionable tasks（1 executed, 43 up-to-date）
- `Configuration cache entry reused.` ✅
- APK 产出正常 ✅
