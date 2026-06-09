# blbl - 哔哩哔哩第三方客户端 | Third-party Bilibili Client

[![CI Build](https://github.com/min09577/blbl/actions/workflows/android-debug.yml/badge.svg)](https://github.com/min09577/blbl/actions/workflows/android-debug.yml)
[![Version](https://img.shields.io/badge/version-v2400.1.0-blue)](https://github.com/min09577/blbl/releases)
[![Features](https://img.shields.io/badge/features-35%2C550%2B-orange)](#features)

一个第三方哔哩哔哩安卓 App，支持触摸、遥控，适用于平板、TV、车机等设备。

A third-party Bilibili Android app with touch and remote control support for tablets, TV, and car devices.

タッチ・リモコン対応のサードパーティBilibili Androidアプリ。タブレット、TV、車載デバイス対応。

터치 및 리모컨을 지원하는 서드파티 빌리빌리 Android 앱. 태블릿, TV, 차량 장치에 적합합니다.

---

## ⚖️ 免责声明

- 本软件基于开源项目二次开发，版权归 original author 所有
- 本软件不提供任何担保，使用风险自负
- 本软件仅供学习研究
- This software is based on an open-source project. All rights belong to the original author.
- No warranty provided. Use at your own risk. For study purposes only.

---

## 🚀 当前版本 | Current Version

**v2400.1.0** — Stable Release (2026-06-09)

| 指标 | 数值 |
|------|------|
| 总功能数 | **35,550+** |
| FeaturePrefs 批次 | **170** (v701-v2400) |
| PlayerSettingsPart 文件 | **221** |
| 版本范围 | v22 - v2400 |
| CI 构建时间 | ~9 分钟 |
| 架构 | FeaturePrefs + PlayerSettingsPart |

---

## 📦 架构 | Architecture

```
core/prefs/
├── AppPrefs.kt              ← v31-v700 属性 (~10,050 features)
├── FeaturePrefs701.kt       ← v701-v710 (150 features)
├── FeaturePrefs711.kt       ← v711-v720 (150 features)
├── ...                      ← 170 batches total
├── FeaturePrefs2391.kt      ← v2391-v2400 (150 features)
└── FeaturePrefsAccessor.kt  ← 170 lazy declarations

feature/player/
├── PlayerSettings.kt        ← Helper functions
├── PlayerSettingsPart1.kt   ← v31-v60 functions
├── PlayerSettingsPart2.kt   ← v61-v90 functions
├── ...                      ← 221 files total
└── PlayerSettingsPart221.kt
```

---

## 📊 项目统计 | Project Stats

| 版本范围 | 功能数 | 架构 |
|----------|--------|------|
| v22-v30 | 基础功能 (original) | AppPrefs |
| v31-v700 | ~10,050 | AppPrefs |
| v701-v850 | ~2,250 | FeaturePrefs |
| v851-v1170 | ~4,800 | FeaturePrefs |
| v1171-v1600 | ~9,450 | FeaturePrefs |
| v1601-v2000 | ~6,000 | FeaturePrefs |
| v2001-v2400 | ~6,000 | FeaturePrefs |
| **Total** | **~35,550** | |

---

## 📝 版本日志 | Changelog

### v2400.1.0 (2026-06-09)
- ✅ 添加 FeaturePrefsIntegrityTest 单元测试
- ✅ 添加 Robolectric 测试依赖
- 🎯 稳定发布点

### v2201-v2400 (3000 features)
- 功能前缀: replaced, replied, reported, restricted, restructured, resulted, ruined, sacrificed, safeguarded, segmented, selected, served, shut, signaled, simplified, specialized, specified, spelled, stayed, steered, stemmed, struggled, stuck, studied, survived, suspected, suspended 等
- 每个批次: 100 Boolean (Toggle) + 50 Int (ChoiceDialog) = 150 features

### v2001-v2200 (3000 features)
- 功能前缀: federated, filled, filtered, forecasted, forged, forgotten, fulfilled, functioned, funded, hardened, harmed, harvested, illustrated, imagined, immunized, inherited, initialized, injected, interested, interpreted, interrupted 等

### v1801-v2000 (3000 features)
- 功能前缀: aboveboard, absent, abstract, addressed, adjusted, advanced, arranged, assembled, assessed, banned, barred, batched, blocking, blooming, boiling 等

### v1601-v1800 (3000 features)
- 功能前缀: navy, neat, neck, nothing, notice, novel, odor, off, offer, opera, opinion, orange, own, oxygen, oyster, party, patient, patrol 等

### v1401-v1600 (3000 features)
- 功能前缀: duck, dumb, dune, effort, eight, either, enemy, energy, engage, event, every, exact, fair, faith, false, fever, few, fiber, flavor, flight, flock 等

### v1171-v1400 (3450 features)
- 功能前缀: accent, accept, access, adapt, adept, admit, agent, agile, aging, allow, alloy, alpha, anthem, antic, anvil, ask, asset, atlas, award, aware, awash 等

### v1101-v1170 (1050 features)
- 功能前缀: string, strip, stroke, symbol, sync, system, tick, tile, time, trade, trail, train, turn, type, unbind, usage, user, valid, walk, warm, warn 等

### v991-v1100 (1650 features)
- 功能前缀: precision, predict, prefix, produce, profile, program, query, queue, quick, recover, recycle, redirect, render, repeat, replace, return, reverse, revert 等

### v851-v990 (2100 features)
- 功能前缀: gain, gamma, gap, guard, guess, guide, hit, hold, hook, info, init, input, join, json, jump, learn, left, length, local, lock, log, mark, mask, master 等

### v701-v850 (2250 features)
- 首批 FeaturePrefs 架构版本
- 功能前缀: abstract, adaptive, agile, ambient, angular, aquatic, arcane, astral, atomic 等

### v31-v700 (~10,050 features)
- AppPrefs 架构版本
- 最早的 AI 生成功能批次

---

## 🧪 测试 | Testing

```bash
# 运行完整性测试
./gradlew test --tests "blbl.cat3399.core.prefs.FeaturePrefsIntegrityTest"
```

测试覆盖:
- 批量类型一致性 (100 Bool + 50 Int)
- 零重复属性/函数
- Accessor 声明完整性
- 函数总数合理性

---

## 🔧 开发 | Development

```bash
# 构建
git clone https://github.com/min09577/blbl.git
cd blbl
./gradlew assembleDebug
```

### CI/CD
- 通过 tag push (`v*`) 触发 GitHub Actions
- 自动构建 debug APK
- 发布到 GitHub Releases

### 已知限制
- 标准 GitHub Actions Runner (7GB RAM) 支持最大 ~35,000 功能
- 更多功能需要 Larger Runner (16GB RAM)

---

## 📜 License

本项目基于 [cat3399/blbl](https://github.com/cat3399/blbl) 二次开发。

This project is based on [cat3399/blbl](https://github.com/cat3399/blbl).
