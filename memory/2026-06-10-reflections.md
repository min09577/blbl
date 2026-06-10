# 2026-06-10 经验反思 | Reflections

## 1. FeaturePrefs / 生成代码绝对不可修改 (Critical Rule)
**现象**: 对 FeaturePrefs 文件的任何结构性修改（含添加 KDoc、修改 context 属性、调整 import）均导致 CI 构建失败。
**根本原因**: 巨大代码规模（17MB, 35,550 函数）下 Kotlin 编译器极度脆弱，合法语法变更也可触发内部错误。
**行动指南**:
- 禁止批量修改 FeaturePrefs 或 PlayerSettingsPart 文件
- 禁止添加 KDoc / 注解 / import 到生成文件
- 代码改进集中于：AppPrefs.kt, PlayerSettings.kt, 构建配置, 文档
- 如确需改生成文件，先在单文件上测试 CI

## 2. 批量修改必须渐进式验证
**教训**: 一次修改 43 个 FeaturePrefs 文件 → 构建失败 → 难以定位根因。
**策略**: 修改 1 个文件 → CI → 修改 5 个 → CI → 全量。

## 3. 工具函数参数名 (反复失误)
| 函数 | 参数 |
|------|------|
| `read_file` | `file_path`, `start_line`, `end_line` |
| `write_file` | `file_path`, `content` |
| `edit_file` | `file_path`, `old_text`, `new_text` |
| `execute_shell_command` | `command`, `cwd`, `timeout` |
| `grep_search` | `pattern`, `path`, `include_pattern`, `case_sensitive` |

## 4. Python 在 Windows cmd 的限制
多行 Python 必须写入 `.py` 文件再执行，`python -c` 仅适用于单行。执行完毕即删。

## 5. Git 压缩历史流程 (可复用)
```bash
git branch backup-pre-squash
git reset --soft <base>
git commit -m "..."
git tag -f <tag>
git push --force-with-lease origin main
git push --force origin <tag>
git branch -D backup-pre-squash
```

## 6. 文件合并脚本模式
1. 读源文件 → 2. 提取 package/imports/body → 3. 按固定数分组合并 → 4. imports 去重 → 5. 写新文件 → 6. 验证。

## 7. GitHub API 网络问题
频繁 EOF / 连接错误。应对：优先本地优化，Release 删除可走 Web UI。

## 8. indexOf 安全扫描假阳性
自动扫描 452 个"不安全"调用，手工验证全部已有 `.takeIf { it >= 0 } ?: N` 保护。正则可能漏掉同行安全检查。

## 9. 项目稳定边界
**安全操作**: gradle.properties, build.gradle.kts (R8/flag), proguard, README/文档, dependabot, 文件合并, import 清理。
**危险操作**: 修改 FeaturePrefs*.kt, PlayerSettingsPart*.kt 结构, package 前 KDoc, 修改 FeaturePrefsAccessor。

## 10. 构建基线
| v2400.0.0 | ~9min | 392 文件 | 原始基线 |
| v2400.1.3 | ~11min | 102 文件 | 优化后基线 |
文件合并(-74%)未降低编译时间，但提升了可维护性。首次冷启动较慢。
