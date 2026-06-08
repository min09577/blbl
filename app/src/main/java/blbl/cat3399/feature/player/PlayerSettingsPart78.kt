package blbl.cat3399.feature.player

import blbl.cat3399.core.net.BiliClient
import blbl.cat3399.core.prefs.AppPrefs
import blbl.cat3399.core.prefs.PlayerPlaybackModes
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.core.ui.popup.AppPopup
import blbl.cat3399.feature.player.danmaku.DanmakuFontWeight
import blbl.cat3399.feature.player.danmaku.DanmakuLaneDensity
import blbl.cat3399.feature.player.danmaku.DanmakuSessionSettings
import blbl.cat3399.feature.player.engine.BlblPlayerEngine
import blbl.cat3399.feature.player.engine.ExoPlayerEngine
import blbl.cat3399.feature.player.engine.IjkPlayerPluginUi
import blbl.cat3399.feature.player.engine.PlayerEngineKind

// v961: Side Auto Drawer961
internal fun PlayerActivity.showV961SideAutoDrawer961Toggle() {
    val current = BiliClient.prefs.v961sideAutoDrawer961
    BiliClient.prefs.v961sideAutoDrawer961 = !current
    AppToast.show(this, "Side Auto Drawer961: ${if (!current) "ON" else "OFF"}")
}

// v961: Sign Auto Verify961
internal fun PlayerActivity.showV961SignAutoVerify961Toggle() {
    val current = BiliClient.prefs.v961signAutoVerify961
    BiliClient.prefs.v961signAutoVerify961 = !current
    AppToast.show(this, "Sign Auto Verify961: ${if (!current) "ON" else "OFF"}")
}

// v961: Signal Auto Boost961
internal fun PlayerActivity.showV961SignalAutoBoost961Toggle() {
    val current = BiliClient.prefs.v961signalAutoBoost961
    BiliClient.prefs.v961signalAutoBoost961 = !current
    AppToast.show(this, "Signal Auto Boost961: ${if (!current) "ON" else "OFF"}")
}

// v961: Silence Auto Mute961
internal fun PlayerActivity.showV961SilenceAutoMute961Toggle() {
    val current = BiliClient.prefs.v961silenceAutoMute961
    BiliClient.prefs.v961silenceAutoMute961 = !current
    AppToast.show(this, "Silence Auto Mute961: ${if (!current) "ON" else "OFF"}")
}

// v961: Simple Auto View961
internal fun PlayerActivity.showV961SimpleAutoView961Toggle() {
    val current = BiliClient.prefs.v961simpleAutoView961
    BiliClient.prefs.v961simpleAutoView961 = !current
    AppToast.show(this, "Simple Auto View961: ${if (!current) "ON" else "OFF"}")
}

// v961: Single Auto Instance961
internal fun PlayerActivity.showV961SingleAutoInstance961Toggle() {
    val current = BiliClient.prefs.v961singleAutoInstance961
    BiliClient.prefs.v961singleAutoInstance961 = !current
    AppToast.show(this, "Single Auto Instance961: ${if (!current) "ON" else "OFF"}")
}

// v961: Site Auto Map961
internal fun PlayerActivity.showV961SiteAutoMap961Toggle() {
    val current = BiliClient.prefs.v961siteAutoMap961
    BiliClient.prefs.v961siteAutoMap961 = !current
    AppToast.show(this, "Site Auto Map961: ${if (!current) "ON" else "OFF"}")
}

// v961: Size Auto Optimize961
internal fun PlayerActivity.showV961SizeAutoOptimize961Toggle() {
    val current = BiliClient.prefs.v961sizeAutoOptimize961
    BiliClient.prefs.v961sizeAutoOptimize961 = !current
    AppToast.show(this, "Size Auto Optimize961: ${if (!current) "ON" else "OFF"}")
}

// v961: Skip Auto Intro961
internal fun PlayerActivity.showV961SkipAutoIntro961Toggle() {
    val current = BiliClient.prefs.v961skipAutoIntro961
    BiliClient.prefs.v961skipAutoIntro961 = !current
    AppToast.show(this, "Skip Auto Intro961: ${if (!current) "ON" else "OFF"}")
}

// v961: Sleep Auto Timer961
internal fun PlayerActivity.showV961SleepAutoTimer961Toggle() {
    val current = BiliClient.prefs.v961sleepAutoTimer961
    BiliClient.prefs.v961sleepAutoTimer961 = !current
    AppToast.show(this, "Sleep Auto Timer961: ${if (!current) "ON" else "OFF"}")
}

// v961: Slice Auto Array961
internal fun PlayerActivity.showV961SliceAutoArray961Toggle() {
    val current = BiliClient.prefs.v961sliceAutoArray961
    BiliClient.prefs.v961sliceAutoArray961 = !current
    AppToast.show(this, "Slice Auto Array961: ${if (!current) "ON" else "OFF"}")
}

// v961: Slide Auto Pager961
internal fun PlayerActivity.showV961SlideAutoPager961Toggle() {
    val current = BiliClient.prefs.v961slideAutoPager961
    BiliClient.prefs.v961slideAutoPager961 = !current
    AppToast.show(this, "Slide Auto Pager961: ${if (!current) "ON" else "OFF"}")
}

// v961: Slow Auto Motion961
internal fun PlayerActivity.showV961SlowAutoMotion961Toggle() {
    val current = BiliClient.prefs.v961slowAutoMotion961
    BiliClient.prefs.v961slowAutoMotion961 = !current
    AppToast.show(this, "Slow Auto Motion961: ${if (!current) "ON" else "OFF"}")
}

// v961: Small Auto Window961
internal fun PlayerActivity.showV961SmallAutoWindow961Toggle() {
    val current = BiliClient.prefs.v961smallAutoWindow961
    BiliClient.prefs.v961smallAutoWindow961 = !current
    AppToast.show(this, "Small Auto Window961: ${if (!current) "ON" else "OFF"}")
}

// v961: Smart Auto Suggest961
internal fun PlayerActivity.showV961SmartAutoSuggest961Toggle() {
    val current = BiliClient.prefs.v961smartAutoSuggest961
    BiliClient.prefs.v961smartAutoSuggest961 = !current
    AppToast.show(this, "Smart Auto Suggest961: ${if (!current) "ON" else "OFF"}")
}

// v962: Side Auto Drawer962
internal fun PlayerActivity.showV962SideAutoDrawer962Toggle() {
    val current = BiliClient.prefs.v962sideAutoDrawer962
    BiliClient.prefs.v962sideAutoDrawer962 = !current
    AppToast.show(this, "Side Auto Drawer962: ${if (!current) "ON" else "OFF"}")
}

// v962: Sign Auto Verify962
internal fun PlayerActivity.showV962SignAutoVerify962Toggle() {
    val current = BiliClient.prefs.v962signAutoVerify962
    BiliClient.prefs.v962signAutoVerify962 = !current
    AppToast.show(this, "Sign Auto Verify962: ${if (!current) "ON" else "OFF"}")
}

// v962: Signal Auto Boost962
internal fun PlayerActivity.showV962SignalAutoBoost962Toggle() {
    val current = BiliClient.prefs.v962signalAutoBoost962
    BiliClient.prefs.v962signalAutoBoost962 = !current
    AppToast.show(this, "Signal Auto Boost962: ${if (!current) "ON" else "OFF"}")
}

// v962: Silence Auto Mute962
internal fun PlayerActivity.showV962SilenceAutoMute962Toggle() {
    val current = BiliClient.prefs.v962silenceAutoMute962
    BiliClient.prefs.v962silenceAutoMute962 = !current
    AppToast.show(this, "Silence Auto Mute962: ${if (!current) "ON" else "OFF"}")
}

// v962: Simple Auto View962
internal fun PlayerActivity.showV962SimpleAutoView962Toggle() {
    val current = BiliClient.prefs.v962simpleAutoView962
    BiliClient.prefs.v962simpleAutoView962 = !current
    AppToast.show(this, "Simple Auto View962: ${if (!current) "ON" else "OFF"}")
}

// v962: Single Auto Instance962
internal fun PlayerActivity.showV962SingleAutoInstance962Toggle() {
    val current = BiliClient.prefs.v962singleAutoInstance962
    BiliClient.prefs.v962singleAutoInstance962 = !current
    AppToast.show(this, "Single Auto Instance962: ${if (!current) "ON" else "OFF"}")
}

// v962: Site Auto Map962
internal fun PlayerActivity.showV962SiteAutoMap962Toggle() {
    val current = BiliClient.prefs.v962siteAutoMap962
    BiliClient.prefs.v962siteAutoMap962 = !current
    AppToast.show(this, "Site Auto Map962: ${if (!current) "ON" else "OFF"}")
}

// v962: Size Auto Optimize962
internal fun PlayerActivity.showV962SizeAutoOptimize962Toggle() {
    val current = BiliClient.prefs.v962sizeAutoOptimize962
    BiliClient.prefs.v962sizeAutoOptimize962 = !current
    AppToast.show(this, "Size Auto Optimize962: ${if (!current) "ON" else "OFF"}")
}

// v962: Skip Auto Intro962
internal fun PlayerActivity.showV962SkipAutoIntro962Toggle() {
    val current = BiliClient.prefs.v962skipAutoIntro962
    BiliClient.prefs.v962skipAutoIntro962 = !current
    AppToast.show(this, "Skip Auto Intro962: ${if (!current) "ON" else "OFF"}")
}

// v962: Sleep Auto Timer962
internal fun PlayerActivity.showV962SleepAutoTimer962Toggle() {
    val current = BiliClient.prefs.v962sleepAutoTimer962
    BiliClient.prefs.v962sleepAutoTimer962 = !current
    AppToast.show(this, "Sleep Auto Timer962: ${if (!current) "ON" else "OFF"}")
}

// v962: Slice Auto Array962
internal fun PlayerActivity.showV962SliceAutoArray962Toggle() {
    val current = BiliClient.prefs.v962sliceAutoArray962
    BiliClient.prefs.v962sliceAutoArray962 = !current
    AppToast.show(this, "Slice Auto Array962: ${if (!current) "ON" else "OFF"}")
}

// v962: Slide Auto Pager962
internal fun PlayerActivity.showV962SlideAutoPager962Toggle() {
    val current = BiliClient.prefs.v962slideAutoPager962
    BiliClient.prefs.v962slideAutoPager962 = !current
    AppToast.show(this, "Slide Auto Pager962: ${if (!current) "ON" else "OFF"}")
}

// v962: Slow Auto Motion962
internal fun PlayerActivity.showV962SlowAutoMotion962Toggle() {
    val current = BiliClient.prefs.v962slowAutoMotion962
    BiliClient.prefs.v962slowAutoMotion962 = !current
    AppToast.show(this, "Slow Auto Motion962: ${if (!current) "ON" else "OFF"}")
}

// v962: Small Auto Window962
internal fun PlayerActivity.showV962SmallAutoWindow962Toggle() {
    val current = BiliClient.prefs.v962smallAutoWindow962
    BiliClient.prefs.v962smallAutoWindow962 = !current
    AppToast.show(this, "Small Auto Window962: ${if (!current) "ON" else "OFF"}")
}

// v962: Smart Auto Suggest962
internal fun PlayerActivity.showV962SmartAutoSuggest962Toggle() {
    val current = BiliClient.prefs.v962smartAutoSuggest962
    BiliClient.prefs.v962smartAutoSuggest962 = !current
    AppToast.show(this, "Smart Auto Suggest962: ${if (!current) "ON" else "OFF"}")
}

// v963: Side Auto Drawer963
internal fun PlayerActivity.showV963SideAutoDrawer963Toggle() {
    val current = BiliClient.prefs.v963sideAutoDrawer963
    BiliClient.prefs.v963sideAutoDrawer963 = !current
    AppToast.show(this, "Side Auto Drawer963: ${if (!current) "ON" else "OFF"}")
}

// v963: Sign Auto Verify963
internal fun PlayerActivity.showV963SignAutoVerify963Toggle() {
    val current = BiliClient.prefs.v963signAutoVerify963
    BiliClient.prefs.v963signAutoVerify963 = !current
    AppToast.show(this, "Sign Auto Verify963: ${if (!current) "ON" else "OFF"}")
}

// v963: Signal Auto Boost963
internal fun PlayerActivity.showV963SignalAutoBoost963Toggle() {
    val current = BiliClient.prefs.v963signalAutoBoost963
    BiliClient.prefs.v963signalAutoBoost963 = !current
    AppToast.show(this, "Signal Auto Boost963: ${if (!current) "ON" else "OFF"}")
}

// v963: Silence Auto Mute963
internal fun PlayerActivity.showV963SilenceAutoMute963Toggle() {
    val current = BiliClient.prefs.v963silenceAutoMute963
    BiliClient.prefs.v963silenceAutoMute963 = !current
    AppToast.show(this, "Silence Auto Mute963: ${if (!current) "ON" else "OFF"}")
}

// v963: Simple Auto View963
internal fun PlayerActivity.showV963SimpleAutoView963Toggle() {
    val current = BiliClient.prefs.v963simpleAutoView963
    BiliClient.prefs.v963simpleAutoView963 = !current
    AppToast.show(this, "Simple Auto View963: ${if (!current) "ON" else "OFF"}")
}

// v963: Single Auto Instance963
internal fun PlayerActivity.showV963SingleAutoInstance963Toggle() {
    val current = BiliClient.prefs.v963singleAutoInstance963
    BiliClient.prefs.v963singleAutoInstance963 = !current
    AppToast.show(this, "Single Auto Instance963: ${if (!current) "ON" else "OFF"}")
}

// v963: Site Auto Map963
internal fun PlayerActivity.showV963SiteAutoMap963Toggle() {
    val current = BiliClient.prefs.v963siteAutoMap963
    BiliClient.prefs.v963siteAutoMap963 = !current
    AppToast.show(this, "Site Auto Map963: ${if (!current) "ON" else "OFF"}")
}

// v963: Size Auto Optimize963
internal fun PlayerActivity.showV963SizeAutoOptimize963Toggle() {
    val current = BiliClient.prefs.v963sizeAutoOptimize963
    BiliClient.prefs.v963sizeAutoOptimize963 = !current
    AppToast.show(this, "Size Auto Optimize963: ${if (!current) "ON" else "OFF"}")
}

// v963: Skip Auto Intro963
internal fun PlayerActivity.showV963SkipAutoIntro963Toggle() {
    val current = BiliClient.prefs.v963skipAutoIntro963
    BiliClient.prefs.v963skipAutoIntro963 = !current
    AppToast.show(this, "Skip Auto Intro963: ${if (!current) "ON" else "OFF"}")
}

// v963: Sleep Auto Timer963
internal fun PlayerActivity.showV963SleepAutoTimer963Toggle() {
    val current = BiliClient.prefs.v963sleepAutoTimer963
    BiliClient.prefs.v963sleepAutoTimer963 = !current
    AppToast.show(this, "Sleep Auto Timer963: ${if (!current) "ON" else "OFF"}")
}

// v963: Slice Auto Array963
internal fun PlayerActivity.showV963SliceAutoArray963Toggle() {
    val current = BiliClient.prefs.v963sliceAutoArray963
    BiliClient.prefs.v963sliceAutoArray963 = !current
    AppToast.show(this, "Slice Auto Array963: ${if (!current) "ON" else "OFF"}")
}

// v963: Slide Auto Pager963
internal fun PlayerActivity.showV963SlideAutoPager963Toggle() {
    val current = BiliClient.prefs.v963slideAutoPager963
    BiliClient.prefs.v963slideAutoPager963 = !current
    AppToast.show(this, "Slide Auto Pager963: ${if (!current) "ON" else "OFF"}")
}

// v963: Slow Auto Motion963
internal fun PlayerActivity.showV963SlowAutoMotion963Toggle() {
    val current = BiliClient.prefs.v963slowAutoMotion963
    BiliClient.prefs.v963slowAutoMotion963 = !current
    AppToast.show(this, "Slow Auto Motion963: ${if (!current) "ON" else "OFF"}")
}

// v963: Small Auto Window963
internal fun PlayerActivity.showV963SmallAutoWindow963Toggle() {
    val current = BiliClient.prefs.v963smallAutoWindow963
    BiliClient.prefs.v963smallAutoWindow963 = !current
    AppToast.show(this, "Small Auto Window963: ${if (!current) "ON" else "OFF"}")
}

// v963: Smart Auto Suggest963
internal fun PlayerActivity.showV963SmartAutoSuggest963Toggle() {
    val current = BiliClient.prefs.v963smartAutoSuggest963
    BiliClient.prefs.v963smartAutoSuggest963 = !current
    AppToast.show(this, "Smart Auto Suggest963: ${if (!current) "ON" else "OFF"}")
}

// v964: Side Auto Drawer964
internal fun PlayerActivity.showV964SideAutoDrawer964Toggle() {
    val current = BiliClient.prefs.v964sideAutoDrawer964
    BiliClient.prefs.v964sideAutoDrawer964 = !current
    AppToast.show(this, "Side Auto Drawer964: ${if (!current) "ON" else "OFF"}")
}

// v964: Sign Auto Verify964
internal fun PlayerActivity.showV964SignAutoVerify964Toggle() {
    val current = BiliClient.prefs.v964signAutoVerify964
    BiliClient.prefs.v964signAutoVerify964 = !current
    AppToast.show(this, "Sign Auto Verify964: ${if (!current) "ON" else "OFF"}")
}

// v964: Signal Auto Boost964
internal fun PlayerActivity.showV964SignalAutoBoost964Toggle() {
    val current = BiliClient.prefs.v964signalAutoBoost964
    BiliClient.prefs.v964signalAutoBoost964 = !current
    AppToast.show(this, "Signal Auto Boost964: ${if (!current) "ON" else "OFF"}")
}

// v964: Silence Auto Mute964
internal fun PlayerActivity.showV964SilenceAutoMute964Toggle() {
    val current = BiliClient.prefs.v964silenceAutoMute964
    BiliClient.prefs.v964silenceAutoMute964 = !current
    AppToast.show(this, "Silence Auto Mute964: ${if (!current) "ON" else "OFF"}")
}

// v964: Simple Auto View964
internal fun PlayerActivity.showV964SimpleAutoView964Toggle() {
    val current = BiliClient.prefs.v964simpleAutoView964
    BiliClient.prefs.v964simpleAutoView964 = !current
    AppToast.show(this, "Simple Auto View964: ${if (!current) "ON" else "OFF"}")
}

// v964: Single Auto Instance964
internal fun PlayerActivity.showV964SingleAutoInstance964Toggle() {
    val current = BiliClient.prefs.v964singleAutoInstance964
    BiliClient.prefs.v964singleAutoInstance964 = !current
    AppToast.show(this, "Single Auto Instance964: ${if (!current) "ON" else "OFF"}")
}

// v964: Site Auto Map964
internal fun PlayerActivity.showV964SiteAutoMap964Toggle() {
    val current = BiliClient.prefs.v964siteAutoMap964
    BiliClient.prefs.v964siteAutoMap964 = !current
    AppToast.show(this, "Site Auto Map964: ${if (!current) "ON" else "OFF"}")
}

// v964: Size Auto Optimize964
internal fun PlayerActivity.showV964SizeAutoOptimize964Toggle() {
    val current = BiliClient.prefs.v964sizeAutoOptimize964
    BiliClient.prefs.v964sizeAutoOptimize964 = !current
    AppToast.show(this, "Size Auto Optimize964: ${if (!current) "ON" else "OFF"}")
}

// v964: Skip Auto Intro964
internal fun PlayerActivity.showV964SkipAutoIntro964Toggle() {
    val current = BiliClient.prefs.v964skipAutoIntro964
    BiliClient.prefs.v964skipAutoIntro964 = !current
    AppToast.show(this, "Skip Auto Intro964: ${if (!current) "ON" else "OFF"}")
}

// v964: Sleep Auto Timer964
internal fun PlayerActivity.showV964SleepAutoTimer964Toggle() {
    val current = BiliClient.prefs.v964sleepAutoTimer964
    BiliClient.prefs.v964sleepAutoTimer964 = !current
    AppToast.show(this, "Sleep Auto Timer964: ${if (!current) "ON" else "OFF"}")
}

// v964: Slice Auto Array964
internal fun PlayerActivity.showV964SliceAutoArray964Toggle() {
    val current = BiliClient.prefs.v964sliceAutoArray964
    BiliClient.prefs.v964sliceAutoArray964 = !current
    AppToast.show(this, "Slice Auto Array964: ${if (!current) "ON" else "OFF"}")
}

// v964: Slide Auto Pager964
internal fun PlayerActivity.showV964SlideAutoPager964Toggle() {
    val current = BiliClient.prefs.v964slideAutoPager964
    BiliClient.prefs.v964slideAutoPager964 = !current
    AppToast.show(this, "Slide Auto Pager964: ${if (!current) "ON" else "OFF"}")
}

// v964: Slow Auto Motion964
internal fun PlayerActivity.showV964SlowAutoMotion964Toggle() {
    val current = BiliClient.prefs.v964slowAutoMotion964
    BiliClient.prefs.v964slowAutoMotion964 = !current
    AppToast.show(this, "Slow Auto Motion964: ${if (!current) "ON" else "OFF"}")
}

// v964: Small Auto Window964
internal fun PlayerActivity.showV964SmallAutoWindow964Toggle() {
    val current = BiliClient.prefs.v964smallAutoWindow964
    BiliClient.prefs.v964smallAutoWindow964 = !current
    AppToast.show(this, "Small Auto Window964: ${if (!current) "ON" else "OFF"}")
}

// v964: Smart Auto Suggest964
internal fun PlayerActivity.showV964SmartAutoSuggest964Toggle() {
    val current = BiliClient.prefs.v964smartAutoSuggest964
    BiliClient.prefs.v964smartAutoSuggest964 = !current
    AppToast.show(this, "Smart Auto Suggest964: ${if (!current) "ON" else "OFF"}")
}

// v965: Side Auto Drawer965
internal fun PlayerActivity.showV965SideAutoDrawer965Toggle() {
    val current = BiliClient.prefs.v965sideAutoDrawer965
    BiliClient.prefs.v965sideAutoDrawer965 = !current
    AppToast.show(this, "Side Auto Drawer965: ${if (!current) "ON" else "OFF"}")
}

// v965: Sign Auto Verify965
internal fun PlayerActivity.showV965SignAutoVerify965Toggle() {
    val current = BiliClient.prefs.v965signAutoVerify965
    BiliClient.prefs.v965signAutoVerify965 = !current
    AppToast.show(this, "Sign Auto Verify965: ${if (!current) "ON" else "OFF"}")
}

// v965: Signal Auto Boost965
internal fun PlayerActivity.showV965SignalAutoBoost965Toggle() {
    val current = BiliClient.prefs.v965signalAutoBoost965
    BiliClient.prefs.v965signalAutoBoost965 = !current
    AppToast.show(this, "Signal Auto Boost965: ${if (!current) "ON" else "OFF"}")
}

// v965: Silence Auto Mute965
internal fun PlayerActivity.showV965SilenceAutoMute965Toggle() {
    val current = BiliClient.prefs.v965silenceAutoMute965
    BiliClient.prefs.v965silenceAutoMute965 = !current
    AppToast.show(this, "Silence Auto Mute965: ${if (!current) "ON" else "OFF"}")
}

// v965: Simple Auto View965
internal fun PlayerActivity.showV965SimpleAutoView965Toggle() {
    val current = BiliClient.prefs.v965simpleAutoView965
    BiliClient.prefs.v965simpleAutoView965 = !current
    AppToast.show(this, "Simple Auto View965: ${if (!current) "ON" else "OFF"}")
}

// v965: Single Auto Instance965
internal fun PlayerActivity.showV965SingleAutoInstance965Toggle() {
    val current = BiliClient.prefs.v965singleAutoInstance965
    BiliClient.prefs.v965singleAutoInstance965 = !current
    AppToast.show(this, "Single Auto Instance965: ${if (!current) "ON" else "OFF"}")
}

// v965: Site Auto Map965
internal fun PlayerActivity.showV965SiteAutoMap965Toggle() {
    val current = BiliClient.prefs.v965siteAutoMap965
    BiliClient.prefs.v965siteAutoMap965 = !current
    AppToast.show(this, "Site Auto Map965: ${if (!current) "ON" else "OFF"}")
}

// v965: Size Auto Optimize965
internal fun PlayerActivity.showV965SizeAutoOptimize965Toggle() {
    val current = BiliClient.prefs.v965sizeAutoOptimize965
    BiliClient.prefs.v965sizeAutoOptimize965 = !current
    AppToast.show(this, "Size Auto Optimize965: ${if (!current) "ON" else "OFF"}")
}

// v965: Skip Auto Intro965
internal fun PlayerActivity.showV965SkipAutoIntro965Toggle() {
    val current = BiliClient.prefs.v965skipAutoIntro965
    BiliClient.prefs.v965skipAutoIntro965 = !current
    AppToast.show(this, "Skip Auto Intro965: ${if (!current) "ON" else "OFF"}")
}

// v965: Sleep Auto Timer965
internal fun PlayerActivity.showV965SleepAutoTimer965Toggle() {
    val current = BiliClient.prefs.v965sleepAutoTimer965
    BiliClient.prefs.v965sleepAutoTimer965 = !current
    AppToast.show(this, "Sleep Auto Timer965: ${if (!current) "ON" else "OFF"}")
}

// v965: Slice Auto Array965
internal fun PlayerActivity.showV965SliceAutoArray965Toggle() {
    val current = BiliClient.prefs.v965sliceAutoArray965
    BiliClient.prefs.v965sliceAutoArray965 = !current
    AppToast.show(this, "Slice Auto Array965: ${if (!current) "ON" else "OFF"}")
}

// v965: Slide Auto Pager965
internal fun PlayerActivity.showV965SlideAutoPager965Toggle() {
    val current = BiliClient.prefs.v965slideAutoPager965
    BiliClient.prefs.v965slideAutoPager965 = !current
    AppToast.show(this, "Slide Auto Pager965: ${if (!current) "ON" else "OFF"}")
}

// v965: Slow Auto Motion965
internal fun PlayerActivity.showV965SlowAutoMotion965Toggle() {
    val current = BiliClient.prefs.v965slowAutoMotion965
    BiliClient.prefs.v965slowAutoMotion965 = !current
    AppToast.show(this, "Slow Auto Motion965: ${if (!current) "ON" else "OFF"}")
}

// v965: Small Auto Window965
internal fun PlayerActivity.showV965SmallAutoWindow965Toggle() {
    val current = BiliClient.prefs.v965smallAutoWindow965
    BiliClient.prefs.v965smallAutoWindow965 = !current
    AppToast.show(this, "Small Auto Window965: ${if (!current) "ON" else "OFF"}")
}

// v965: Smart Auto Suggest965
internal fun PlayerActivity.showV965SmartAutoSuggest965Toggle() {
    val current = BiliClient.prefs.v965smartAutoSuggest965
    BiliClient.prefs.v965smartAutoSuggest965 = !current
    AppToast.show(this, "Smart Auto Suggest965: ${if (!current) "ON" else "OFF"}")
}

// v966: Side Auto Drawer966
internal fun PlayerActivity.showV966SideAutoDrawer966Toggle() {
    val current = BiliClient.prefs.v966sideAutoDrawer966
    BiliClient.prefs.v966sideAutoDrawer966 = !current
    AppToast.show(this, "Side Auto Drawer966: ${if (!current) "ON" else "OFF"}")
}

// v966: Sign Auto Verify966
internal fun PlayerActivity.showV966SignAutoVerify966Toggle() {
    val current = BiliClient.prefs.v966signAutoVerify966
    BiliClient.prefs.v966signAutoVerify966 = !current
    AppToast.show(this, "Sign Auto Verify966: ${if (!current) "ON" else "OFF"}")
}

// v966: Signal Auto Boost966
internal fun PlayerActivity.showV966SignalAutoBoost966Toggle() {
    val current = BiliClient.prefs.v966signalAutoBoost966
    BiliClient.prefs.v966signalAutoBoost966 = !current
    AppToast.show(this, "Signal Auto Boost966: ${if (!current) "ON" else "OFF"}")
}

// v966: Silence Auto Mute966
internal fun PlayerActivity.showV966SilenceAutoMute966Toggle() {
    val current = BiliClient.prefs.v966silenceAutoMute966
    BiliClient.prefs.v966silenceAutoMute966 = !current
    AppToast.show(this, "Silence Auto Mute966: ${if (!current) "ON" else "OFF"}")
}

// v966: Simple Auto View966
internal fun PlayerActivity.showV966SimpleAutoView966Toggle() {
    val current = BiliClient.prefs.v966simpleAutoView966
    BiliClient.prefs.v966simpleAutoView966 = !current
    AppToast.show(this, "Simple Auto View966: ${if (!current) "ON" else "OFF"}")
}

// v966: Single Auto Instance966
internal fun PlayerActivity.showV966SingleAutoInstance966Toggle() {
    val current = BiliClient.prefs.v966singleAutoInstance966
    BiliClient.prefs.v966singleAutoInstance966 = !current
    AppToast.show(this, "Single Auto Instance966: ${if (!current) "ON" else "OFF"}")
}

// v966: Site Auto Map966
internal fun PlayerActivity.showV966SiteAutoMap966Toggle() {
    val current = BiliClient.prefs.v966siteAutoMap966
    BiliClient.prefs.v966siteAutoMap966 = !current
    AppToast.show(this, "Site Auto Map966: ${if (!current) "ON" else "OFF"}")
}

// v966: Size Auto Optimize966
internal fun PlayerActivity.showV966SizeAutoOptimize966Toggle() {
    val current = BiliClient.prefs.v966sizeAutoOptimize966
    BiliClient.prefs.v966sizeAutoOptimize966 = !current
    AppToast.show(this, "Size Auto Optimize966: ${if (!current) "ON" else "OFF"}")
}

// v966: Skip Auto Intro966
internal fun PlayerActivity.showV966SkipAutoIntro966Toggle() {
    val current = BiliClient.prefs.v966skipAutoIntro966
    BiliClient.prefs.v966skipAutoIntro966 = !current
    AppToast.show(this, "Skip Auto Intro966: ${if (!current) "ON" else "OFF"}")
}

// v966: Sleep Auto Timer966
internal fun PlayerActivity.showV966SleepAutoTimer966Toggle() {
    val current = BiliClient.prefs.v966sleepAutoTimer966
    BiliClient.prefs.v966sleepAutoTimer966 = !current
    AppToast.show(this, "Sleep Auto Timer966: ${if (!current) "ON" else "OFF"}")
}

// v966: Slice Auto Array966
internal fun PlayerActivity.showV966SliceAutoArray966Toggle() {
    val current = BiliClient.prefs.v966sliceAutoArray966
    BiliClient.prefs.v966sliceAutoArray966 = !current
    AppToast.show(this, "Slice Auto Array966: ${if (!current) "ON" else "OFF"}")
}

// v966: Slide Auto Pager966
internal fun PlayerActivity.showV966SlideAutoPager966Toggle() {
    val current = BiliClient.prefs.v966slideAutoPager966
    BiliClient.prefs.v966slideAutoPager966 = !current
    AppToast.show(this, "Slide Auto Pager966: ${if (!current) "ON" else "OFF"}")
}

// v966: Slow Auto Motion966
internal fun PlayerActivity.showV966SlowAutoMotion966Toggle() {
    val current = BiliClient.prefs.v966slowAutoMotion966
    BiliClient.prefs.v966slowAutoMotion966 = !current
    AppToast.show(this, "Slow Auto Motion966: ${if (!current) "ON" else "OFF"}")
}

// v966: Small Auto Window966
internal fun PlayerActivity.showV966SmallAutoWindow966Toggle() {
    val current = BiliClient.prefs.v966smallAutoWindow966
    BiliClient.prefs.v966smallAutoWindow966 = !current
    AppToast.show(this, "Small Auto Window966: ${if (!current) "ON" else "OFF"}")
}

// v966: Smart Auto Suggest966
internal fun PlayerActivity.showV966SmartAutoSuggest966Toggle() {
    val current = BiliClient.prefs.v966smartAutoSuggest966
    BiliClient.prefs.v966smartAutoSuggest966 = !current
    AppToast.show(this, "Smart Auto Suggest966: ${if (!current) "ON" else "OFF"}")
}

// v967: Side Auto Drawer967
internal fun PlayerActivity.showV967SideAutoDrawer967Toggle() {
    val current = BiliClient.prefs.v967sideAutoDrawer967
    BiliClient.prefs.v967sideAutoDrawer967 = !current
    AppToast.show(this, "Side Auto Drawer967: ${if (!current) "ON" else "OFF"}")
}

// v967: Sign Auto Verify967
internal fun PlayerActivity.showV967SignAutoVerify967Toggle() {
    val current = BiliClient.prefs.v967signAutoVerify967
    BiliClient.prefs.v967signAutoVerify967 = !current
    AppToast.show(this, "Sign Auto Verify967: ${if (!current) "ON" else "OFF"}")
}

// v967: Signal Auto Boost967
internal fun PlayerActivity.showV967SignalAutoBoost967Toggle() {
    val current = BiliClient.prefs.v967signalAutoBoost967
    BiliClient.prefs.v967signalAutoBoost967 = !current
    AppToast.show(this, "Signal Auto Boost967: ${if (!current) "ON" else "OFF"}")
}

// v967: Silence Auto Mute967
internal fun PlayerActivity.showV967SilenceAutoMute967Toggle() {
    val current = BiliClient.prefs.v967silenceAutoMute967
    BiliClient.prefs.v967silenceAutoMute967 = !current
    AppToast.show(this, "Silence Auto Mute967: ${if (!current) "ON" else "OFF"}")
}

// v967: Simple Auto View967
internal fun PlayerActivity.showV967SimpleAutoView967Toggle() {
    val current = BiliClient.prefs.v967simpleAutoView967
    BiliClient.prefs.v967simpleAutoView967 = !current
    AppToast.show(this, "Simple Auto View967: ${if (!current) "ON" else "OFF"}")
}

// v967: Single Auto Instance967
internal fun PlayerActivity.showV967SingleAutoInstance967Toggle() {
    val current = BiliClient.prefs.v967singleAutoInstance967
    BiliClient.prefs.v967singleAutoInstance967 = !current
    AppToast.show(this, "Single Auto Instance967: ${if (!current) "ON" else "OFF"}")
}

// v967: Site Auto Map967
internal fun PlayerActivity.showV967SiteAutoMap967Toggle() {
    val current = BiliClient.prefs.v967siteAutoMap967
    BiliClient.prefs.v967siteAutoMap967 = !current
    AppToast.show(this, "Site Auto Map967: ${if (!current) "ON" else "OFF"}")
}

// v967: Size Auto Optimize967
internal fun PlayerActivity.showV967SizeAutoOptimize967Toggle() {
    val current = BiliClient.prefs.v967sizeAutoOptimize967
    BiliClient.prefs.v967sizeAutoOptimize967 = !current
    AppToast.show(this, "Size Auto Optimize967: ${if (!current) "ON" else "OFF"}")
}

// v967: Skip Auto Intro967
internal fun PlayerActivity.showV967SkipAutoIntro967Toggle() {
    val current = BiliClient.prefs.v967skipAutoIntro967
    BiliClient.prefs.v967skipAutoIntro967 = !current
    AppToast.show(this, "Skip Auto Intro967: ${if (!current) "ON" else "OFF"}")
}

// v967: Sleep Auto Timer967
internal fun PlayerActivity.showV967SleepAutoTimer967Toggle() {
    val current = BiliClient.prefs.v967sleepAutoTimer967
    BiliClient.prefs.v967sleepAutoTimer967 = !current
    AppToast.show(this, "Sleep Auto Timer967: ${if (!current) "ON" else "OFF"}")
}

// v967: Slice Auto Array967
internal fun PlayerActivity.showV967SliceAutoArray967Toggle() {
    val current = BiliClient.prefs.v967sliceAutoArray967
    BiliClient.prefs.v967sliceAutoArray967 = !current
    AppToast.show(this, "Slice Auto Array967: ${if (!current) "ON" else "OFF"}")
}

// v967: Slide Auto Pager967
internal fun PlayerActivity.showV967SlideAutoPager967Toggle() {
    val current = BiliClient.prefs.v967slideAutoPager967
    BiliClient.prefs.v967slideAutoPager967 = !current
    AppToast.show(this, "Slide Auto Pager967: ${if (!current) "ON" else "OFF"}")
}

// v967: Slow Auto Motion967
internal fun PlayerActivity.showV967SlowAutoMotion967Toggle() {
    val current = BiliClient.prefs.v967slowAutoMotion967
    BiliClient.prefs.v967slowAutoMotion967 = !current
    AppToast.show(this, "Slow Auto Motion967: ${if (!current) "ON" else "OFF"}")
}

// v967: Small Auto Window967
internal fun PlayerActivity.showV967SmallAutoWindow967Toggle() {
    val current = BiliClient.prefs.v967smallAutoWindow967
    BiliClient.prefs.v967smallAutoWindow967 = !current
    AppToast.show(this, "Small Auto Window967: ${if (!current) "ON" else "OFF"}")
}

// v967: Smart Auto Suggest967
internal fun PlayerActivity.showV967SmartAutoSuggest967Toggle() {
    val current = BiliClient.prefs.v967smartAutoSuggest967
    BiliClient.prefs.v967smartAutoSuggest967 = !current
    AppToast.show(this, "Smart Auto Suggest967: ${if (!current) "ON" else "OFF"}")
}

// v968: Side Auto Drawer968
internal fun PlayerActivity.showV968SideAutoDrawer968Toggle() {
    val current = BiliClient.prefs.v968sideAutoDrawer968
    BiliClient.prefs.v968sideAutoDrawer968 = !current
    AppToast.show(this, "Side Auto Drawer968: ${if (!current) "ON" else "OFF"}")
}

// v968: Sign Auto Verify968
internal fun PlayerActivity.showV968SignAutoVerify968Toggle() {
    val current = BiliClient.prefs.v968signAutoVerify968
    BiliClient.prefs.v968signAutoVerify968 = !current
    AppToast.show(this, "Sign Auto Verify968: ${if (!current) "ON" else "OFF"}")
}

// v968: Signal Auto Boost968
internal fun PlayerActivity.showV968SignalAutoBoost968Toggle() {
    val current = BiliClient.prefs.v968signalAutoBoost968
    BiliClient.prefs.v968signalAutoBoost968 = !current
    AppToast.show(this, "Signal Auto Boost968: ${if (!current) "ON" else "OFF"}")
}

// v968: Silence Auto Mute968
internal fun PlayerActivity.showV968SilenceAutoMute968Toggle() {
    val current = BiliClient.prefs.v968silenceAutoMute968
    BiliClient.prefs.v968silenceAutoMute968 = !current
    AppToast.show(this, "Silence Auto Mute968: ${if (!current) "ON" else "OFF"}")
}

// v968: Simple Auto View968
internal fun PlayerActivity.showV968SimpleAutoView968Toggle() {
    val current = BiliClient.prefs.v968simpleAutoView968
    BiliClient.prefs.v968simpleAutoView968 = !current
    AppToast.show(this, "Simple Auto View968: ${if (!current) "ON" else "OFF"}")
}

// v968: Single Auto Instance968
internal fun PlayerActivity.showV968SingleAutoInstance968Toggle() {
    val current = BiliClient.prefs.v968singleAutoInstance968
    BiliClient.prefs.v968singleAutoInstance968 = !current
    AppToast.show(this, "Single Auto Instance968: ${if (!current) "ON" else "OFF"}")
}

// v968: Site Auto Map968
internal fun PlayerActivity.showV968SiteAutoMap968Toggle() {
    val current = BiliClient.prefs.v968siteAutoMap968
    BiliClient.prefs.v968siteAutoMap968 = !current
    AppToast.show(this, "Site Auto Map968: ${if (!current) "ON" else "OFF"}")
}

// v968: Size Auto Optimize968
internal fun PlayerActivity.showV968SizeAutoOptimize968Toggle() {
    val current = BiliClient.prefs.v968sizeAutoOptimize968
    BiliClient.prefs.v968sizeAutoOptimize968 = !current
    AppToast.show(this, "Size Auto Optimize968: ${if (!current) "ON" else "OFF"}")
}

// v968: Skip Auto Intro968
internal fun PlayerActivity.showV968SkipAutoIntro968Toggle() {
    val current = BiliClient.prefs.v968skipAutoIntro968
    BiliClient.prefs.v968skipAutoIntro968 = !current
    AppToast.show(this, "Skip Auto Intro968: ${if (!current) "ON" else "OFF"}")
}

// v968: Sleep Auto Timer968
internal fun PlayerActivity.showV968SleepAutoTimer968Toggle() {
    val current = BiliClient.prefs.v968sleepAutoTimer968
    BiliClient.prefs.v968sleepAutoTimer968 = !current
    AppToast.show(this, "Sleep Auto Timer968: ${if (!current) "ON" else "OFF"}")
}

// v968: Slice Auto Array968
internal fun PlayerActivity.showV968SliceAutoArray968Toggle() {
    val current = BiliClient.prefs.v968sliceAutoArray968
    BiliClient.prefs.v968sliceAutoArray968 = !current
    AppToast.show(this, "Slice Auto Array968: ${if (!current) "ON" else "OFF"}")
}

// v968: Slide Auto Pager968
internal fun PlayerActivity.showV968SlideAutoPager968Toggle() {
    val current = BiliClient.prefs.v968slideAutoPager968
    BiliClient.prefs.v968slideAutoPager968 = !current
    AppToast.show(this, "Slide Auto Pager968: ${if (!current) "ON" else "OFF"}")
}

// v968: Slow Auto Motion968
internal fun PlayerActivity.showV968SlowAutoMotion968Toggle() {
    val current = BiliClient.prefs.v968slowAutoMotion968
    BiliClient.prefs.v968slowAutoMotion968 = !current
    AppToast.show(this, "Slow Auto Motion968: ${if (!current) "ON" else "OFF"}")
}

// v968: Small Auto Window968
internal fun PlayerActivity.showV968SmallAutoWindow968Toggle() {
    val current = BiliClient.prefs.v968smallAutoWindow968
    BiliClient.prefs.v968smallAutoWindow968 = !current
    AppToast.show(this, "Small Auto Window968: ${if (!current) "ON" else "OFF"}")
}

// v968: Smart Auto Suggest968
internal fun PlayerActivity.showV968SmartAutoSuggest968Toggle() {
    val current = BiliClient.prefs.v968smartAutoSuggest968
    BiliClient.prefs.v968smartAutoSuggest968 = !current
    AppToast.show(this, "Smart Auto Suggest968: ${if (!current) "ON" else "OFF"}")
}

// v969: Side Auto Drawer969
internal fun PlayerActivity.showV969SideAutoDrawer969Toggle() {
    val current = BiliClient.prefs.v969sideAutoDrawer969
    BiliClient.prefs.v969sideAutoDrawer969 = !current
    AppToast.show(this, "Side Auto Drawer969: ${if (!current) "ON" else "OFF"}")
}

// v969: Sign Auto Verify969
internal fun PlayerActivity.showV969SignAutoVerify969Toggle() {
    val current = BiliClient.prefs.v969signAutoVerify969
    BiliClient.prefs.v969signAutoVerify969 = !current
    AppToast.show(this, "Sign Auto Verify969: ${if (!current) "ON" else "OFF"}")
}

// v969: Signal Auto Boost969
internal fun PlayerActivity.showV969SignalAutoBoost969Toggle() {
    val current = BiliClient.prefs.v969signalAutoBoost969
    BiliClient.prefs.v969signalAutoBoost969 = !current
    AppToast.show(this, "Signal Auto Boost969: ${if (!current) "ON" else "OFF"}")
}

// v969: Silence Auto Mute969
internal fun PlayerActivity.showV969SilenceAutoMute969Toggle() {
    val current = BiliClient.prefs.v969silenceAutoMute969
    BiliClient.prefs.v969silenceAutoMute969 = !current
    AppToast.show(this, "Silence Auto Mute969: ${if (!current) "ON" else "OFF"}")
}

// v969: Simple Auto View969
internal fun PlayerActivity.showV969SimpleAutoView969Toggle() {
    val current = BiliClient.prefs.v969simpleAutoView969
    BiliClient.prefs.v969simpleAutoView969 = !current
    AppToast.show(this, "Simple Auto View969: ${if (!current) "ON" else "OFF"}")
}

// v969: Single Auto Instance969
internal fun PlayerActivity.showV969SingleAutoInstance969Toggle() {
    val current = BiliClient.prefs.v969singleAutoInstance969
    BiliClient.prefs.v969singleAutoInstance969 = !current
    AppToast.show(this, "Single Auto Instance969: ${if (!current) "ON" else "OFF"}")
}

// v969: Site Auto Map969
internal fun PlayerActivity.showV969SiteAutoMap969Toggle() {
    val current = BiliClient.prefs.v969siteAutoMap969
    BiliClient.prefs.v969siteAutoMap969 = !current
    AppToast.show(this, "Site Auto Map969: ${if (!current) "ON" else "OFF"}")
}

// v969: Size Auto Optimize969
internal fun PlayerActivity.showV969SizeAutoOptimize969Toggle() {
    val current = BiliClient.prefs.v969sizeAutoOptimize969
    BiliClient.prefs.v969sizeAutoOptimize969 = !current
    AppToast.show(this, "Size Auto Optimize969: ${if (!current) "ON" else "OFF"}")
}

// v969: Skip Auto Intro969
internal fun PlayerActivity.showV969SkipAutoIntro969Toggle() {
    val current = BiliClient.prefs.v969skipAutoIntro969
    BiliClient.prefs.v969skipAutoIntro969 = !current
    AppToast.show(this, "Skip Auto Intro969: ${if (!current) "ON" else "OFF"}")
}

// v969: Sleep Auto Timer969
internal fun PlayerActivity.showV969SleepAutoTimer969Toggle() {
    val current = BiliClient.prefs.v969sleepAutoTimer969
    BiliClient.prefs.v969sleepAutoTimer969 = !current
    AppToast.show(this, "Sleep Auto Timer969: ${if (!current) "ON" else "OFF"}")
}

// v969: Slice Auto Array969
internal fun PlayerActivity.showV969SliceAutoArray969Toggle() {
    val current = BiliClient.prefs.v969sliceAutoArray969
    BiliClient.prefs.v969sliceAutoArray969 = !current
    AppToast.show(this, "Slice Auto Array969: ${if (!current) "ON" else "OFF"}")
}

// v969: Slide Auto Pager969
internal fun PlayerActivity.showV969SlideAutoPager969Toggle() {
    val current = BiliClient.prefs.v969slideAutoPager969
    BiliClient.prefs.v969slideAutoPager969 = !current
    AppToast.show(this, "Slide Auto Pager969: ${if (!current) "ON" else "OFF"}")
}

// v969: Slow Auto Motion969
internal fun PlayerActivity.showV969SlowAutoMotion969Toggle() {
    val current = BiliClient.prefs.v969slowAutoMotion969
    BiliClient.prefs.v969slowAutoMotion969 = !current
    AppToast.show(this, "Slow Auto Motion969: ${if (!current) "ON" else "OFF"}")
}

// v969: Small Auto Window969
internal fun PlayerActivity.showV969SmallAutoWindow969Toggle() {
    val current = BiliClient.prefs.v969smallAutoWindow969
    BiliClient.prefs.v969smallAutoWindow969 = !current
    AppToast.show(this, "Small Auto Window969: ${if (!current) "ON" else "OFF"}")
}

// v969: Smart Auto Suggest969
internal fun PlayerActivity.showV969SmartAutoSuggest969Toggle() {
    val current = BiliClient.prefs.v969smartAutoSuggest969
    BiliClient.prefs.v969smartAutoSuggest969 = !current
    AppToast.show(this, "Smart Auto Suggest969: ${if (!current) "ON" else "OFF"}")
}

// v970: Side Auto Drawer970
internal fun PlayerActivity.showV970SideAutoDrawer970Toggle() {
    val current = BiliClient.prefs.v970sideAutoDrawer970
    BiliClient.prefs.v970sideAutoDrawer970 = !current
    AppToast.show(this, "Side Auto Drawer970: ${if (!current) "ON" else "OFF"}")
}

// v970: Sign Auto Verify970
internal fun PlayerActivity.showV970SignAutoVerify970Toggle() {
    val current = BiliClient.prefs.v970signAutoVerify970
    BiliClient.prefs.v970signAutoVerify970 = !current
    AppToast.show(this, "Sign Auto Verify970: ${if (!current) "ON" else "OFF"}")
}

// v970: Signal Auto Boost970
internal fun PlayerActivity.showV970SignalAutoBoost970Toggle() {
    val current = BiliClient.prefs.v970signalAutoBoost970
    BiliClient.prefs.v970signalAutoBoost970 = !current
    AppToast.show(this, "Signal Auto Boost970: ${if (!current) "ON" else "OFF"}")
}

// v970: Silence Auto Mute970
internal fun PlayerActivity.showV970SilenceAutoMute970Toggle() {
    val current = BiliClient.prefs.v970silenceAutoMute970
    BiliClient.prefs.v970silenceAutoMute970 = !current
    AppToast.show(this, "Silence Auto Mute970: ${if (!current) "ON" else "OFF"}")
}

// v970: Simple Auto View970
internal fun PlayerActivity.showV970SimpleAutoView970Toggle() {
    val current = BiliClient.prefs.v970simpleAutoView970
    BiliClient.prefs.v970simpleAutoView970 = !current
    AppToast.show(this, "Simple Auto View970: ${if (!current) "ON" else "OFF"}")
}

// v970: Single Auto Instance970
internal fun PlayerActivity.showV970SingleAutoInstance970Toggle() {
    val current = BiliClient.prefs.v970singleAutoInstance970
    BiliClient.prefs.v970singleAutoInstance970 = !current
    AppToast.show(this, "Single Auto Instance970: ${if (!current) "ON" else "OFF"}")
}

// v970: Site Auto Map970
internal fun PlayerActivity.showV970SiteAutoMap970Toggle() {
    val current = BiliClient.prefs.v970siteAutoMap970
    BiliClient.prefs.v970siteAutoMap970 = !current
    AppToast.show(this, "Site Auto Map970: ${if (!current) "ON" else "OFF"}")
}

// v970: Size Auto Optimize970
internal fun PlayerActivity.showV970SizeAutoOptimize970Toggle() {
    val current = BiliClient.prefs.v970sizeAutoOptimize970
    BiliClient.prefs.v970sizeAutoOptimize970 = !current
    AppToast.show(this, "Size Auto Optimize970: ${if (!current) "ON" else "OFF"}")
}

// v970: Skip Auto Intro970
internal fun PlayerActivity.showV970SkipAutoIntro970Toggle() {
    val current = BiliClient.prefs.v970skipAutoIntro970
    BiliClient.prefs.v970skipAutoIntro970 = !current
    AppToast.show(this, "Skip Auto Intro970: ${if (!current) "ON" else "OFF"}")
}

// v970: Sleep Auto Timer970
internal fun PlayerActivity.showV970SleepAutoTimer970Toggle() {
    val current = BiliClient.prefs.v970sleepAutoTimer970
    BiliClient.prefs.v970sleepAutoTimer970 = !current
    AppToast.show(this, "Sleep Auto Timer970: ${if (!current) "ON" else "OFF"}")
}

// v970: Slice Auto Array970
internal fun PlayerActivity.showV970SliceAutoArray970Toggle() {
    val current = BiliClient.prefs.v970sliceAutoArray970
    BiliClient.prefs.v970sliceAutoArray970 = !current
    AppToast.show(this, "Slice Auto Array970: ${if (!current) "ON" else "OFF"}")
}

// v970: Slide Auto Pager970
internal fun PlayerActivity.showV970SlideAutoPager970Toggle() {
    val current = BiliClient.prefs.v970slideAutoPager970
    BiliClient.prefs.v970slideAutoPager970 = !current
    AppToast.show(this, "Slide Auto Pager970: ${if (!current) "ON" else "OFF"}")
}

// v970: Slow Auto Motion970
internal fun PlayerActivity.showV970SlowAutoMotion970Toggle() {
    val current = BiliClient.prefs.v970slowAutoMotion970
    BiliClient.prefs.v970slowAutoMotion970 = !current
    AppToast.show(this, "Slow Auto Motion970: ${if (!current) "ON" else "OFF"}")
}

// v970: Small Auto Window970
internal fun PlayerActivity.showV970SmallAutoWindow970Toggle() {
    val current = BiliClient.prefs.v970smallAutoWindow970
    BiliClient.prefs.v970smallAutoWindow970 = !current
    AppToast.show(this, "Small Auto Window970: ${if (!current) "ON" else "OFF"}")
}

// v970: Smart Auto Suggest970
internal fun PlayerActivity.showV970SmartAutoSuggest970Toggle() {
    val current = BiliClient.prefs.v970smartAutoSuggest970
    BiliClient.prefs.v970smartAutoSuggest970 = !current
    AppToast.show(this, "Smart Auto Suggest970: ${if (!current) "ON" else "OFF"}")
}

