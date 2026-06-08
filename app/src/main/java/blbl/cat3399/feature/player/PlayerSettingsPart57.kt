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

// v751: Guard Auto Protect751
internal fun PlayerActivity.showV751GuardAutoProtect751Toggle() {
    val current = BiliClient.prefs.v751guardAutoProtect751
    BiliClient.prefs.v751guardAutoProtect751 = !current
    AppToast.show(this, "Guard Auto Protect751: ${if (!current) "ON" else "OFF"}")
}

// v751: Guide Auto Overlay751
internal fun PlayerActivity.showV751GuideAutoOverlay751Toggle() {
    val current = BiliClient.prefs.v751guideAutoOverlay751
    BiliClient.prefs.v751guideAutoOverlay751 = !current
    AppToast.show(this, "Guide Auto Overlay751: ${if (!current) "ON" else "OFF"}")
}

// v751: Handle Auto Process751
internal fun PlayerActivity.showV751HandleAutoProcess751Toggle() {
    val current = BiliClient.prefs.v751handleAutoProcess751
    BiliClient.prefs.v751handleAutoProcess751 = !current
    AppToast.show(this, "Handle Auto Process751: ${if (!current) "ON" else "OFF"}")
}

// v751: Handler Auto Dispatch751
internal fun PlayerActivity.showV751HandlerAutoDispatch751Toggle() {
    val current = BiliClient.prefs.v751handlerAutoDispatch751
    BiliClient.prefs.v751handlerAutoDispatch751 = !current
    AppToast.show(this, "Handler Auto Dispatch751: ${if (!current) "ON" else "OFF"}")
}

// v751: Hash Auto Verify751
internal fun PlayerActivity.showV751HashAutoVerify751Toggle() {
    val current = BiliClient.prefs.v751hashAutoVerify751
    BiliClient.prefs.v751hashAutoVerify751 = !current
    AppToast.show(this, "Hash Auto Verify751: ${if (!current) "ON" else "OFF"}")
}

// v751: Head Auto Detect751
internal fun PlayerActivity.showV751HeadAutoDetect751Toggle() {
    val current = BiliClient.prefs.v751headAutoDetect751
    BiliClient.prefs.v751headAutoDetect751 = !current
    AppToast.show(this, "Head Auto Detect751: ${if (!current) "ON" else "OFF"}")
}

// v751: Header Auto Pin751
internal fun PlayerActivity.showV751HeaderAutoPin751Toggle() {
    val current = BiliClient.prefs.v751headerAutoPin751
    BiliClient.prefs.v751headerAutoPin751 = !current
    AppToast.show(this, "Header Auto Pin751: ${if (!current) "ON" else "OFF"}")
}

// v751: Heap Auto Compact751
internal fun PlayerActivity.showV751HeapAutoCompact751Toggle() {
    val current = BiliClient.prefs.v751heapAutoCompact751
    BiliClient.prefs.v751heapAutoCompact751 = !current
    AppToast.show(this, "Heap Auto Compact751: ${if (!current) "ON" else "OFF"}")
}

// v751: Height Auto Adjust751
internal fun PlayerActivity.showV751HeightAutoAdjust751Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v751heightAutoAdjust751).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust751",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v751heightAutoAdjust751 = value
        AppToast.show(this, "Height Auto Adjust751: $value")
    }
}

// v751: Help Auto Tooltip751
internal fun PlayerActivity.showV751HelpAutoTooltip751Toggle() {
    val current = BiliClient.prefs.v751helpAutoTooltip751
    BiliClient.prefs.v751helpAutoTooltip751 = !current
    AppToast.show(this, "Help Auto Tooltip751: ${if (!current) "ON" else "OFF"}")
}

// v751: Hidden Auto Reveal751
internal fun PlayerActivity.showV751HiddenAutoReveal751Toggle() {
    val current = BiliClient.prefs.v751hiddenAutoReveal751
    BiliClient.prefs.v751hiddenAutoReveal751 = !current
    AppToast.show(this, "Hidden Auto Reveal751: ${if (!current) "ON" else "OFF"}")
}

// v751: Hide Auto OnScroll751
internal fun PlayerActivity.showV751HideAutoOnScroll751Toggle() {
    val current = BiliClient.prefs.v751hideAutoOnScroll751
    BiliClient.prefs.v751hideAutoOnScroll751 = !current
    AppToast.show(this, "Hide Auto OnScroll751: ${if (!current) "ON" else "OFF"}")
}

// v751: Highlight Auto Mark751
internal fun PlayerActivity.showV751HighlightAutoMark751Toggle() {
    val current = BiliClient.prefs.v751highlightAutoMark751
    BiliClient.prefs.v751highlightAutoMark751 = !current
    AppToast.show(this, "Highlight Auto Mark751: ${if (!current) "ON" else "OFF"}")
}

// v751: Hint Auto Display751
internal fun PlayerActivity.showV751HintAutoDisplay751Toggle() {
    val current = BiliClient.prefs.v751hintAutoDisplay751
    BiliClient.prefs.v751hintAutoDisplay751 = !current
    AppToast.show(this, "Hint Auto Display751: ${if (!current) "ON" else "OFF"}")
}

// v751: History Auto Record751
internal fun PlayerActivity.showV751HistoryAutoRecord751Toggle() {
    val current = BiliClient.prefs.v751historyAutoRecord751
    BiliClient.prefs.v751historyAutoRecord751 = !current
    AppToast.show(this, "History Auto Record751: ${if (!current) "ON" else "OFF"}")
}

// v752: Guard Auto Protect752
internal fun PlayerActivity.showV752GuardAutoProtect752Toggle() {
    val current = BiliClient.prefs.v752guardAutoProtect752
    BiliClient.prefs.v752guardAutoProtect752 = !current
    AppToast.show(this, "Guard Auto Protect752: ${if (!current) "ON" else "OFF"}")
}

// v752: Guide Auto Overlay752
internal fun PlayerActivity.showV752GuideAutoOverlay752Toggle() {
    val current = BiliClient.prefs.v752guideAutoOverlay752
    BiliClient.prefs.v752guideAutoOverlay752 = !current
    AppToast.show(this, "Guide Auto Overlay752: ${if (!current) "ON" else "OFF"}")
}

// v752: Handle Auto Process752
internal fun PlayerActivity.showV752HandleAutoProcess752Toggle() {
    val current = BiliClient.prefs.v752handleAutoProcess752
    BiliClient.prefs.v752handleAutoProcess752 = !current
    AppToast.show(this, "Handle Auto Process752: ${if (!current) "ON" else "OFF"}")
}

// v752: Handler Auto Dispatch752
internal fun PlayerActivity.showV752HandlerAutoDispatch752Toggle() {
    val current = BiliClient.prefs.v752handlerAutoDispatch752
    BiliClient.prefs.v752handlerAutoDispatch752 = !current
    AppToast.show(this, "Handler Auto Dispatch752: ${if (!current) "ON" else "OFF"}")
}

// v752: Hash Auto Verify752
internal fun PlayerActivity.showV752HashAutoVerify752Toggle() {
    val current = BiliClient.prefs.v752hashAutoVerify752
    BiliClient.prefs.v752hashAutoVerify752 = !current
    AppToast.show(this, "Hash Auto Verify752: ${if (!current) "ON" else "OFF"}")
}

// v752: Head Auto Detect752
internal fun PlayerActivity.showV752HeadAutoDetect752Toggle() {
    val current = BiliClient.prefs.v752headAutoDetect752
    BiliClient.prefs.v752headAutoDetect752 = !current
    AppToast.show(this, "Head Auto Detect752: ${if (!current) "ON" else "OFF"}")
}

// v752: Header Auto Pin752
internal fun PlayerActivity.showV752HeaderAutoPin752Toggle() {
    val current = BiliClient.prefs.v752headerAutoPin752
    BiliClient.prefs.v752headerAutoPin752 = !current
    AppToast.show(this, "Header Auto Pin752: ${if (!current) "ON" else "OFF"}")
}

// v752: Heap Auto Compact752
internal fun PlayerActivity.showV752HeapAutoCompact752Toggle() {
    val current = BiliClient.prefs.v752heapAutoCompact752
    BiliClient.prefs.v752heapAutoCompact752 = !current
    AppToast.show(this, "Heap Auto Compact752: ${if (!current) "ON" else "OFF"}")
}

// v752: Height Auto Adjust752
internal fun PlayerActivity.showV752HeightAutoAdjust752Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v752heightAutoAdjust752).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust752",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v752heightAutoAdjust752 = value
        AppToast.show(this, "Height Auto Adjust752: $value")
    }
}

// v752: Help Auto Tooltip752
internal fun PlayerActivity.showV752HelpAutoTooltip752Toggle() {
    val current = BiliClient.prefs.v752helpAutoTooltip752
    BiliClient.prefs.v752helpAutoTooltip752 = !current
    AppToast.show(this, "Help Auto Tooltip752: ${if (!current) "ON" else "OFF"}")
}

// v752: Hidden Auto Reveal752
internal fun PlayerActivity.showV752HiddenAutoReveal752Toggle() {
    val current = BiliClient.prefs.v752hiddenAutoReveal752
    BiliClient.prefs.v752hiddenAutoReveal752 = !current
    AppToast.show(this, "Hidden Auto Reveal752: ${if (!current) "ON" else "OFF"}")
}

// v752: Hide Auto OnScroll752
internal fun PlayerActivity.showV752HideAutoOnScroll752Toggle() {
    val current = BiliClient.prefs.v752hideAutoOnScroll752
    BiliClient.prefs.v752hideAutoOnScroll752 = !current
    AppToast.show(this, "Hide Auto OnScroll752: ${if (!current) "ON" else "OFF"}")
}

// v752: Highlight Auto Mark752
internal fun PlayerActivity.showV752HighlightAutoMark752Toggle() {
    val current = BiliClient.prefs.v752highlightAutoMark752
    BiliClient.prefs.v752highlightAutoMark752 = !current
    AppToast.show(this, "Highlight Auto Mark752: ${if (!current) "ON" else "OFF"}")
}

// v752: Hint Auto Display752
internal fun PlayerActivity.showV752HintAutoDisplay752Toggle() {
    val current = BiliClient.prefs.v752hintAutoDisplay752
    BiliClient.prefs.v752hintAutoDisplay752 = !current
    AppToast.show(this, "Hint Auto Display752: ${if (!current) "ON" else "OFF"}")
}

// v752: History Auto Record752
internal fun PlayerActivity.showV752HistoryAutoRecord752Toggle() {
    val current = BiliClient.prefs.v752historyAutoRecord752
    BiliClient.prefs.v752historyAutoRecord752 = !current
    AppToast.show(this, "History Auto Record752: ${if (!current) "ON" else "OFF"}")
}

// v753: Guard Auto Protect753
internal fun PlayerActivity.showV753GuardAutoProtect753Toggle() {
    val current = BiliClient.prefs.v753guardAutoProtect753
    BiliClient.prefs.v753guardAutoProtect753 = !current
    AppToast.show(this, "Guard Auto Protect753: ${if (!current) "ON" else "OFF"}")
}

// v753: Guide Auto Overlay753
internal fun PlayerActivity.showV753GuideAutoOverlay753Toggle() {
    val current = BiliClient.prefs.v753guideAutoOverlay753
    BiliClient.prefs.v753guideAutoOverlay753 = !current
    AppToast.show(this, "Guide Auto Overlay753: ${if (!current) "ON" else "OFF"}")
}

// v753: Handle Auto Process753
internal fun PlayerActivity.showV753HandleAutoProcess753Toggle() {
    val current = BiliClient.prefs.v753handleAutoProcess753
    BiliClient.prefs.v753handleAutoProcess753 = !current
    AppToast.show(this, "Handle Auto Process753: ${if (!current) "ON" else "OFF"}")
}

// v753: Handler Auto Dispatch753
internal fun PlayerActivity.showV753HandlerAutoDispatch753Toggle() {
    val current = BiliClient.prefs.v753handlerAutoDispatch753
    BiliClient.prefs.v753handlerAutoDispatch753 = !current
    AppToast.show(this, "Handler Auto Dispatch753: ${if (!current) "ON" else "OFF"}")
}

// v753: Hash Auto Verify753
internal fun PlayerActivity.showV753HashAutoVerify753Toggle() {
    val current = BiliClient.prefs.v753hashAutoVerify753
    BiliClient.prefs.v753hashAutoVerify753 = !current
    AppToast.show(this, "Hash Auto Verify753: ${if (!current) "ON" else "OFF"}")
}

// v753: Head Auto Detect753
internal fun PlayerActivity.showV753HeadAutoDetect753Toggle() {
    val current = BiliClient.prefs.v753headAutoDetect753
    BiliClient.prefs.v753headAutoDetect753 = !current
    AppToast.show(this, "Head Auto Detect753: ${if (!current) "ON" else "OFF"}")
}

// v753: Header Auto Pin753
internal fun PlayerActivity.showV753HeaderAutoPin753Toggle() {
    val current = BiliClient.prefs.v753headerAutoPin753
    BiliClient.prefs.v753headerAutoPin753 = !current
    AppToast.show(this, "Header Auto Pin753: ${if (!current) "ON" else "OFF"}")
}

// v753: Heap Auto Compact753
internal fun PlayerActivity.showV753HeapAutoCompact753Toggle() {
    val current = BiliClient.prefs.v753heapAutoCompact753
    BiliClient.prefs.v753heapAutoCompact753 = !current
    AppToast.show(this, "Heap Auto Compact753: ${if (!current) "ON" else "OFF"}")
}

// v753: Height Auto Adjust753
internal fun PlayerActivity.showV753HeightAutoAdjust753Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v753heightAutoAdjust753).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust753",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v753heightAutoAdjust753 = value
        AppToast.show(this, "Height Auto Adjust753: $value")
    }
}

// v753: Help Auto Tooltip753
internal fun PlayerActivity.showV753HelpAutoTooltip753Toggle() {
    val current = BiliClient.prefs.v753helpAutoTooltip753
    BiliClient.prefs.v753helpAutoTooltip753 = !current
    AppToast.show(this, "Help Auto Tooltip753: ${if (!current) "ON" else "OFF"}")
}

// v753: Hidden Auto Reveal753
internal fun PlayerActivity.showV753HiddenAutoReveal753Toggle() {
    val current = BiliClient.prefs.v753hiddenAutoReveal753
    BiliClient.prefs.v753hiddenAutoReveal753 = !current
    AppToast.show(this, "Hidden Auto Reveal753: ${if (!current) "ON" else "OFF"}")
}

// v753: Hide Auto OnScroll753
internal fun PlayerActivity.showV753HideAutoOnScroll753Toggle() {
    val current = BiliClient.prefs.v753hideAutoOnScroll753
    BiliClient.prefs.v753hideAutoOnScroll753 = !current
    AppToast.show(this, "Hide Auto OnScroll753: ${if (!current) "ON" else "OFF"}")
}

// v753: Highlight Auto Mark753
internal fun PlayerActivity.showV753HighlightAutoMark753Toggle() {
    val current = BiliClient.prefs.v753highlightAutoMark753
    BiliClient.prefs.v753highlightAutoMark753 = !current
    AppToast.show(this, "Highlight Auto Mark753: ${if (!current) "ON" else "OFF"}")
}

// v753: Hint Auto Display753
internal fun PlayerActivity.showV753HintAutoDisplay753Toggle() {
    val current = BiliClient.prefs.v753hintAutoDisplay753
    BiliClient.prefs.v753hintAutoDisplay753 = !current
    AppToast.show(this, "Hint Auto Display753: ${if (!current) "ON" else "OFF"}")
}

// v753: History Auto Record753
internal fun PlayerActivity.showV753HistoryAutoRecord753Toggle() {
    val current = BiliClient.prefs.v753historyAutoRecord753
    BiliClient.prefs.v753historyAutoRecord753 = !current
    AppToast.show(this, "History Auto Record753: ${if (!current) "ON" else "OFF"}")
}

// v754: Guard Auto Protect754
internal fun PlayerActivity.showV754GuardAutoProtect754Toggle() {
    val current = BiliClient.prefs.v754guardAutoProtect754
    BiliClient.prefs.v754guardAutoProtect754 = !current
    AppToast.show(this, "Guard Auto Protect754: ${if (!current) "ON" else "OFF"}")
}

// v754: Guide Auto Overlay754
internal fun PlayerActivity.showV754GuideAutoOverlay754Toggle() {
    val current = BiliClient.prefs.v754guideAutoOverlay754
    BiliClient.prefs.v754guideAutoOverlay754 = !current
    AppToast.show(this, "Guide Auto Overlay754: ${if (!current) "ON" else "OFF"}")
}

// v754: Handle Auto Process754
internal fun PlayerActivity.showV754HandleAutoProcess754Toggle() {
    val current = BiliClient.prefs.v754handleAutoProcess754
    BiliClient.prefs.v754handleAutoProcess754 = !current
    AppToast.show(this, "Handle Auto Process754: ${if (!current) "ON" else "OFF"}")
}

// v754: Handler Auto Dispatch754
internal fun PlayerActivity.showV754HandlerAutoDispatch754Toggle() {
    val current = BiliClient.prefs.v754handlerAutoDispatch754
    BiliClient.prefs.v754handlerAutoDispatch754 = !current
    AppToast.show(this, "Handler Auto Dispatch754: ${if (!current) "ON" else "OFF"}")
}

// v754: Hash Auto Verify754
internal fun PlayerActivity.showV754HashAutoVerify754Toggle() {
    val current = BiliClient.prefs.v754hashAutoVerify754
    BiliClient.prefs.v754hashAutoVerify754 = !current
    AppToast.show(this, "Hash Auto Verify754: ${if (!current) "ON" else "OFF"}")
}

// v754: Head Auto Detect754
internal fun PlayerActivity.showV754HeadAutoDetect754Toggle() {
    val current = BiliClient.prefs.v754headAutoDetect754
    BiliClient.prefs.v754headAutoDetect754 = !current
    AppToast.show(this, "Head Auto Detect754: ${if (!current) "ON" else "OFF"}")
}

// v754: Header Auto Pin754
internal fun PlayerActivity.showV754HeaderAutoPin754Toggle() {
    val current = BiliClient.prefs.v754headerAutoPin754
    BiliClient.prefs.v754headerAutoPin754 = !current
    AppToast.show(this, "Header Auto Pin754: ${if (!current) "ON" else "OFF"}")
}

// v754: Heap Auto Compact754
internal fun PlayerActivity.showV754HeapAutoCompact754Toggle() {
    val current = BiliClient.prefs.v754heapAutoCompact754
    BiliClient.prefs.v754heapAutoCompact754 = !current
    AppToast.show(this, "Heap Auto Compact754: ${if (!current) "ON" else "OFF"}")
}

// v754: Height Auto Adjust754
internal fun PlayerActivity.showV754HeightAutoAdjust754Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v754heightAutoAdjust754).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust754",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v754heightAutoAdjust754 = value
        AppToast.show(this, "Height Auto Adjust754: $value")
    }
}

// v754: Help Auto Tooltip754
internal fun PlayerActivity.showV754HelpAutoTooltip754Toggle() {
    val current = BiliClient.prefs.v754helpAutoTooltip754
    BiliClient.prefs.v754helpAutoTooltip754 = !current
    AppToast.show(this, "Help Auto Tooltip754: ${if (!current) "ON" else "OFF"}")
}

// v754: Hidden Auto Reveal754
internal fun PlayerActivity.showV754HiddenAutoReveal754Toggle() {
    val current = BiliClient.prefs.v754hiddenAutoReveal754
    BiliClient.prefs.v754hiddenAutoReveal754 = !current
    AppToast.show(this, "Hidden Auto Reveal754: ${if (!current) "ON" else "OFF"}")
}

// v754: Hide Auto OnScroll754
internal fun PlayerActivity.showV754HideAutoOnScroll754Toggle() {
    val current = BiliClient.prefs.v754hideAutoOnScroll754
    BiliClient.prefs.v754hideAutoOnScroll754 = !current
    AppToast.show(this, "Hide Auto OnScroll754: ${if (!current) "ON" else "OFF"}")
}

// v754: Highlight Auto Mark754
internal fun PlayerActivity.showV754HighlightAutoMark754Toggle() {
    val current = BiliClient.prefs.v754highlightAutoMark754
    BiliClient.prefs.v754highlightAutoMark754 = !current
    AppToast.show(this, "Highlight Auto Mark754: ${if (!current) "ON" else "OFF"}")
}

// v754: Hint Auto Display754
internal fun PlayerActivity.showV754HintAutoDisplay754Toggle() {
    val current = BiliClient.prefs.v754hintAutoDisplay754
    BiliClient.prefs.v754hintAutoDisplay754 = !current
    AppToast.show(this, "Hint Auto Display754: ${if (!current) "ON" else "OFF"}")
}

// v754: History Auto Record754
internal fun PlayerActivity.showV754HistoryAutoRecord754Toggle() {
    val current = BiliClient.prefs.v754historyAutoRecord754
    BiliClient.prefs.v754historyAutoRecord754 = !current
    AppToast.show(this, "History Auto Record754: ${if (!current) "ON" else "OFF"}")
}

// v755: Guard Auto Protect755
internal fun PlayerActivity.showV755GuardAutoProtect755Toggle() {
    val current = BiliClient.prefs.v755guardAutoProtect755
    BiliClient.prefs.v755guardAutoProtect755 = !current
    AppToast.show(this, "Guard Auto Protect755: ${if (!current) "ON" else "OFF"}")
}

// v755: Guide Auto Overlay755
internal fun PlayerActivity.showV755GuideAutoOverlay755Toggle() {
    val current = BiliClient.prefs.v755guideAutoOverlay755
    BiliClient.prefs.v755guideAutoOverlay755 = !current
    AppToast.show(this, "Guide Auto Overlay755: ${if (!current) "ON" else "OFF"}")
}

// v755: Handle Auto Process755
internal fun PlayerActivity.showV755HandleAutoProcess755Toggle() {
    val current = BiliClient.prefs.v755handleAutoProcess755
    BiliClient.prefs.v755handleAutoProcess755 = !current
    AppToast.show(this, "Handle Auto Process755: ${if (!current) "ON" else "OFF"}")
}

// v755: Handler Auto Dispatch755
internal fun PlayerActivity.showV755HandlerAutoDispatch755Toggle() {
    val current = BiliClient.prefs.v755handlerAutoDispatch755
    BiliClient.prefs.v755handlerAutoDispatch755 = !current
    AppToast.show(this, "Handler Auto Dispatch755: ${if (!current) "ON" else "OFF"}")
}

// v755: Hash Auto Verify755
internal fun PlayerActivity.showV755HashAutoVerify755Toggle() {
    val current = BiliClient.prefs.v755hashAutoVerify755
    BiliClient.prefs.v755hashAutoVerify755 = !current
    AppToast.show(this, "Hash Auto Verify755: ${if (!current) "ON" else "OFF"}")
}

// v755: Head Auto Detect755
internal fun PlayerActivity.showV755HeadAutoDetect755Toggle() {
    val current = BiliClient.prefs.v755headAutoDetect755
    BiliClient.prefs.v755headAutoDetect755 = !current
    AppToast.show(this, "Head Auto Detect755: ${if (!current) "ON" else "OFF"}")
}

// v755: Header Auto Pin755
internal fun PlayerActivity.showV755HeaderAutoPin755Toggle() {
    val current = BiliClient.prefs.v755headerAutoPin755
    BiliClient.prefs.v755headerAutoPin755 = !current
    AppToast.show(this, "Header Auto Pin755: ${if (!current) "ON" else "OFF"}")
}

// v755: Heap Auto Compact755
internal fun PlayerActivity.showV755HeapAutoCompact755Toggle() {
    val current = BiliClient.prefs.v755heapAutoCompact755
    BiliClient.prefs.v755heapAutoCompact755 = !current
    AppToast.show(this, "Heap Auto Compact755: ${if (!current) "ON" else "OFF"}")
}

// v755: Height Auto Adjust755
internal fun PlayerActivity.showV755HeightAutoAdjust755Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v755heightAutoAdjust755).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust755",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v755heightAutoAdjust755 = value
        AppToast.show(this, "Height Auto Adjust755: $value")
    }
}

// v755: Help Auto Tooltip755
internal fun PlayerActivity.showV755HelpAutoTooltip755Toggle() {
    val current = BiliClient.prefs.v755helpAutoTooltip755
    BiliClient.prefs.v755helpAutoTooltip755 = !current
    AppToast.show(this, "Help Auto Tooltip755: ${if (!current) "ON" else "OFF"}")
}

// v755: Hidden Auto Reveal755
internal fun PlayerActivity.showV755HiddenAutoReveal755Toggle() {
    val current = BiliClient.prefs.v755hiddenAutoReveal755
    BiliClient.prefs.v755hiddenAutoReveal755 = !current
    AppToast.show(this, "Hidden Auto Reveal755: ${if (!current) "ON" else "OFF"}")
}

// v755: Hide Auto OnScroll755
internal fun PlayerActivity.showV755HideAutoOnScroll755Toggle() {
    val current = BiliClient.prefs.v755hideAutoOnScroll755
    BiliClient.prefs.v755hideAutoOnScroll755 = !current
    AppToast.show(this, "Hide Auto OnScroll755: ${if (!current) "ON" else "OFF"}")
}

// v755: Highlight Auto Mark755
internal fun PlayerActivity.showV755HighlightAutoMark755Toggle() {
    val current = BiliClient.prefs.v755highlightAutoMark755
    BiliClient.prefs.v755highlightAutoMark755 = !current
    AppToast.show(this, "Highlight Auto Mark755: ${if (!current) "ON" else "OFF"}")
}

// v755: Hint Auto Display755
internal fun PlayerActivity.showV755HintAutoDisplay755Toggle() {
    val current = BiliClient.prefs.v755hintAutoDisplay755
    BiliClient.prefs.v755hintAutoDisplay755 = !current
    AppToast.show(this, "Hint Auto Display755: ${if (!current) "ON" else "OFF"}")
}

// v755: History Auto Record755
internal fun PlayerActivity.showV755HistoryAutoRecord755Toggle() {
    val current = BiliClient.prefs.v755historyAutoRecord755
    BiliClient.prefs.v755historyAutoRecord755 = !current
    AppToast.show(this, "History Auto Record755: ${if (!current) "ON" else "OFF"}")
}

// v756: Guard Auto Protect756
internal fun PlayerActivity.showV756GuardAutoProtect756Toggle() {
    val current = BiliClient.prefs.v756guardAutoProtect756
    BiliClient.prefs.v756guardAutoProtect756 = !current
    AppToast.show(this, "Guard Auto Protect756: ${if (!current) "ON" else "OFF"}")
}

// v756: Guide Auto Overlay756
internal fun PlayerActivity.showV756GuideAutoOverlay756Toggle() {
    val current = BiliClient.prefs.v756guideAutoOverlay756
    BiliClient.prefs.v756guideAutoOverlay756 = !current
    AppToast.show(this, "Guide Auto Overlay756: ${if (!current) "ON" else "OFF"}")
}

// v756: Handle Auto Process756
internal fun PlayerActivity.showV756HandleAutoProcess756Toggle() {
    val current = BiliClient.prefs.v756handleAutoProcess756
    BiliClient.prefs.v756handleAutoProcess756 = !current
    AppToast.show(this, "Handle Auto Process756: ${if (!current) "ON" else "OFF"}")
}

// v756: Handler Auto Dispatch756
internal fun PlayerActivity.showV756HandlerAutoDispatch756Toggle() {
    val current = BiliClient.prefs.v756handlerAutoDispatch756
    BiliClient.prefs.v756handlerAutoDispatch756 = !current
    AppToast.show(this, "Handler Auto Dispatch756: ${if (!current) "ON" else "OFF"}")
}

// v756: Hash Auto Verify756
internal fun PlayerActivity.showV756HashAutoVerify756Toggle() {
    val current = BiliClient.prefs.v756hashAutoVerify756
    BiliClient.prefs.v756hashAutoVerify756 = !current
    AppToast.show(this, "Hash Auto Verify756: ${if (!current) "ON" else "OFF"}")
}

// v756: Head Auto Detect756
internal fun PlayerActivity.showV756HeadAutoDetect756Toggle() {
    val current = BiliClient.prefs.v756headAutoDetect756
    BiliClient.prefs.v756headAutoDetect756 = !current
    AppToast.show(this, "Head Auto Detect756: ${if (!current) "ON" else "OFF"}")
}

// v756: Header Auto Pin756
internal fun PlayerActivity.showV756HeaderAutoPin756Toggle() {
    val current = BiliClient.prefs.v756headerAutoPin756
    BiliClient.prefs.v756headerAutoPin756 = !current
    AppToast.show(this, "Header Auto Pin756: ${if (!current) "ON" else "OFF"}")
}

// v756: Heap Auto Compact756
internal fun PlayerActivity.showV756HeapAutoCompact756Toggle() {
    val current = BiliClient.prefs.v756heapAutoCompact756
    BiliClient.prefs.v756heapAutoCompact756 = !current
    AppToast.show(this, "Heap Auto Compact756: ${if (!current) "ON" else "OFF"}")
}

// v756: Height Auto Adjust756
internal fun PlayerActivity.showV756HeightAutoAdjust756Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v756heightAutoAdjust756).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust756",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v756heightAutoAdjust756 = value
        AppToast.show(this, "Height Auto Adjust756: $value")
    }
}

// v756: Help Auto Tooltip756
internal fun PlayerActivity.showV756HelpAutoTooltip756Toggle() {
    val current = BiliClient.prefs.v756helpAutoTooltip756
    BiliClient.prefs.v756helpAutoTooltip756 = !current
    AppToast.show(this, "Help Auto Tooltip756: ${if (!current) "ON" else "OFF"}")
}

// v756: Hidden Auto Reveal756
internal fun PlayerActivity.showV756HiddenAutoReveal756Toggle() {
    val current = BiliClient.prefs.v756hiddenAutoReveal756
    BiliClient.prefs.v756hiddenAutoReveal756 = !current
    AppToast.show(this, "Hidden Auto Reveal756: ${if (!current) "ON" else "OFF"}")
}

// v756: Hide Auto OnScroll756
internal fun PlayerActivity.showV756HideAutoOnScroll756Toggle() {
    val current = BiliClient.prefs.v756hideAutoOnScroll756
    BiliClient.prefs.v756hideAutoOnScroll756 = !current
    AppToast.show(this, "Hide Auto OnScroll756: ${if (!current) "ON" else "OFF"}")
}

// v756: Highlight Auto Mark756
internal fun PlayerActivity.showV756HighlightAutoMark756Toggle() {
    val current = BiliClient.prefs.v756highlightAutoMark756
    BiliClient.prefs.v756highlightAutoMark756 = !current
    AppToast.show(this, "Highlight Auto Mark756: ${if (!current) "ON" else "OFF"}")
}

// v756: Hint Auto Display756
internal fun PlayerActivity.showV756HintAutoDisplay756Toggle() {
    val current = BiliClient.prefs.v756hintAutoDisplay756
    BiliClient.prefs.v756hintAutoDisplay756 = !current
    AppToast.show(this, "Hint Auto Display756: ${if (!current) "ON" else "OFF"}")
}

// v756: History Auto Record756
internal fun PlayerActivity.showV756HistoryAutoRecord756Toggle() {
    val current = BiliClient.prefs.v756historyAutoRecord756
    BiliClient.prefs.v756historyAutoRecord756 = !current
    AppToast.show(this, "History Auto Record756: ${if (!current) "ON" else "OFF"}")
}

// v757: Guard Auto Protect757
internal fun PlayerActivity.showV757GuardAutoProtect757Toggle() {
    val current = BiliClient.prefs.v757guardAutoProtect757
    BiliClient.prefs.v757guardAutoProtect757 = !current
    AppToast.show(this, "Guard Auto Protect757: ${if (!current) "ON" else "OFF"}")
}

// v757: Guide Auto Overlay757
internal fun PlayerActivity.showV757GuideAutoOverlay757Toggle() {
    val current = BiliClient.prefs.v757guideAutoOverlay757
    BiliClient.prefs.v757guideAutoOverlay757 = !current
    AppToast.show(this, "Guide Auto Overlay757: ${if (!current) "ON" else "OFF"}")
}

// v757: Handle Auto Process757
internal fun PlayerActivity.showV757HandleAutoProcess757Toggle() {
    val current = BiliClient.prefs.v757handleAutoProcess757
    BiliClient.prefs.v757handleAutoProcess757 = !current
    AppToast.show(this, "Handle Auto Process757: ${if (!current) "ON" else "OFF"}")
}

// v757: Handler Auto Dispatch757
internal fun PlayerActivity.showV757HandlerAutoDispatch757Toggle() {
    val current = BiliClient.prefs.v757handlerAutoDispatch757
    BiliClient.prefs.v757handlerAutoDispatch757 = !current
    AppToast.show(this, "Handler Auto Dispatch757: ${if (!current) "ON" else "OFF"}")
}

// v757: Hash Auto Verify757
internal fun PlayerActivity.showV757HashAutoVerify757Toggle() {
    val current = BiliClient.prefs.v757hashAutoVerify757
    BiliClient.prefs.v757hashAutoVerify757 = !current
    AppToast.show(this, "Hash Auto Verify757: ${if (!current) "ON" else "OFF"}")
}

// v757: Head Auto Detect757
internal fun PlayerActivity.showV757HeadAutoDetect757Toggle() {
    val current = BiliClient.prefs.v757headAutoDetect757
    BiliClient.prefs.v757headAutoDetect757 = !current
    AppToast.show(this, "Head Auto Detect757: ${if (!current) "ON" else "OFF"}")
}

// v757: Header Auto Pin757
internal fun PlayerActivity.showV757HeaderAutoPin757Toggle() {
    val current = BiliClient.prefs.v757headerAutoPin757
    BiliClient.prefs.v757headerAutoPin757 = !current
    AppToast.show(this, "Header Auto Pin757: ${if (!current) "ON" else "OFF"}")
}

// v757: Heap Auto Compact757
internal fun PlayerActivity.showV757HeapAutoCompact757Toggle() {
    val current = BiliClient.prefs.v757heapAutoCompact757
    BiliClient.prefs.v757heapAutoCompact757 = !current
    AppToast.show(this, "Heap Auto Compact757: ${if (!current) "ON" else "OFF"}")
}

// v757: Height Auto Adjust757
internal fun PlayerActivity.showV757HeightAutoAdjust757Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v757heightAutoAdjust757).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust757",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v757heightAutoAdjust757 = value
        AppToast.show(this, "Height Auto Adjust757: $value")
    }
}

// v757: Help Auto Tooltip757
internal fun PlayerActivity.showV757HelpAutoTooltip757Toggle() {
    val current = BiliClient.prefs.v757helpAutoTooltip757
    BiliClient.prefs.v757helpAutoTooltip757 = !current
    AppToast.show(this, "Help Auto Tooltip757: ${if (!current) "ON" else "OFF"}")
}

// v757: Hidden Auto Reveal757
internal fun PlayerActivity.showV757HiddenAutoReveal757Toggle() {
    val current = BiliClient.prefs.v757hiddenAutoReveal757
    BiliClient.prefs.v757hiddenAutoReveal757 = !current
    AppToast.show(this, "Hidden Auto Reveal757: ${if (!current) "ON" else "OFF"}")
}

// v757: Hide Auto OnScroll757
internal fun PlayerActivity.showV757HideAutoOnScroll757Toggle() {
    val current = BiliClient.prefs.v757hideAutoOnScroll757
    BiliClient.prefs.v757hideAutoOnScroll757 = !current
    AppToast.show(this, "Hide Auto OnScroll757: ${if (!current) "ON" else "OFF"}")
}

// v757: Highlight Auto Mark757
internal fun PlayerActivity.showV757HighlightAutoMark757Toggle() {
    val current = BiliClient.prefs.v757highlightAutoMark757
    BiliClient.prefs.v757highlightAutoMark757 = !current
    AppToast.show(this, "Highlight Auto Mark757: ${if (!current) "ON" else "OFF"}")
}

// v757: Hint Auto Display757
internal fun PlayerActivity.showV757HintAutoDisplay757Toggle() {
    val current = BiliClient.prefs.v757hintAutoDisplay757
    BiliClient.prefs.v757hintAutoDisplay757 = !current
    AppToast.show(this, "Hint Auto Display757: ${if (!current) "ON" else "OFF"}")
}

// v757: History Auto Record757
internal fun PlayerActivity.showV757HistoryAutoRecord757Toggle() {
    val current = BiliClient.prefs.v757historyAutoRecord757
    BiliClient.prefs.v757historyAutoRecord757 = !current
    AppToast.show(this, "History Auto Record757: ${if (!current) "ON" else "OFF"}")
}

// v758: Guard Auto Protect758
internal fun PlayerActivity.showV758GuardAutoProtect758Toggle() {
    val current = BiliClient.prefs.v758guardAutoProtect758
    BiliClient.prefs.v758guardAutoProtect758 = !current
    AppToast.show(this, "Guard Auto Protect758: ${if (!current) "ON" else "OFF"}")
}

// v758: Guide Auto Overlay758
internal fun PlayerActivity.showV758GuideAutoOverlay758Toggle() {
    val current = BiliClient.prefs.v758guideAutoOverlay758
    BiliClient.prefs.v758guideAutoOverlay758 = !current
    AppToast.show(this, "Guide Auto Overlay758: ${if (!current) "ON" else "OFF"}")
}

// v758: Handle Auto Process758
internal fun PlayerActivity.showV758HandleAutoProcess758Toggle() {
    val current = BiliClient.prefs.v758handleAutoProcess758
    BiliClient.prefs.v758handleAutoProcess758 = !current
    AppToast.show(this, "Handle Auto Process758: ${if (!current) "ON" else "OFF"}")
}

// v758: Handler Auto Dispatch758
internal fun PlayerActivity.showV758HandlerAutoDispatch758Toggle() {
    val current = BiliClient.prefs.v758handlerAutoDispatch758
    BiliClient.prefs.v758handlerAutoDispatch758 = !current
    AppToast.show(this, "Handler Auto Dispatch758: ${if (!current) "ON" else "OFF"}")
}

// v758: Hash Auto Verify758
internal fun PlayerActivity.showV758HashAutoVerify758Toggle() {
    val current = BiliClient.prefs.v758hashAutoVerify758
    BiliClient.prefs.v758hashAutoVerify758 = !current
    AppToast.show(this, "Hash Auto Verify758: ${if (!current) "ON" else "OFF"}")
}

// v758: Head Auto Detect758
internal fun PlayerActivity.showV758HeadAutoDetect758Toggle() {
    val current = BiliClient.prefs.v758headAutoDetect758
    BiliClient.prefs.v758headAutoDetect758 = !current
    AppToast.show(this, "Head Auto Detect758: ${if (!current) "ON" else "OFF"}")
}

// v758: Header Auto Pin758
internal fun PlayerActivity.showV758HeaderAutoPin758Toggle() {
    val current = BiliClient.prefs.v758headerAutoPin758
    BiliClient.prefs.v758headerAutoPin758 = !current
    AppToast.show(this, "Header Auto Pin758: ${if (!current) "ON" else "OFF"}")
}

// v758: Heap Auto Compact758
internal fun PlayerActivity.showV758HeapAutoCompact758Toggle() {
    val current = BiliClient.prefs.v758heapAutoCompact758
    BiliClient.prefs.v758heapAutoCompact758 = !current
    AppToast.show(this, "Heap Auto Compact758: ${if (!current) "ON" else "OFF"}")
}

// v758: Height Auto Adjust758
internal fun PlayerActivity.showV758HeightAutoAdjust758Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v758heightAutoAdjust758).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust758",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v758heightAutoAdjust758 = value
        AppToast.show(this, "Height Auto Adjust758: $value")
    }
}

// v758: Help Auto Tooltip758
internal fun PlayerActivity.showV758HelpAutoTooltip758Toggle() {
    val current = BiliClient.prefs.v758helpAutoTooltip758
    BiliClient.prefs.v758helpAutoTooltip758 = !current
    AppToast.show(this, "Help Auto Tooltip758: ${if (!current) "ON" else "OFF"}")
}

// v758: Hidden Auto Reveal758
internal fun PlayerActivity.showV758HiddenAutoReveal758Toggle() {
    val current = BiliClient.prefs.v758hiddenAutoReveal758
    BiliClient.prefs.v758hiddenAutoReveal758 = !current
    AppToast.show(this, "Hidden Auto Reveal758: ${if (!current) "ON" else "OFF"}")
}

// v758: Hide Auto OnScroll758
internal fun PlayerActivity.showV758HideAutoOnScroll758Toggle() {
    val current = BiliClient.prefs.v758hideAutoOnScroll758
    BiliClient.prefs.v758hideAutoOnScroll758 = !current
    AppToast.show(this, "Hide Auto OnScroll758: ${if (!current) "ON" else "OFF"}")
}

// v758: Highlight Auto Mark758
internal fun PlayerActivity.showV758HighlightAutoMark758Toggle() {
    val current = BiliClient.prefs.v758highlightAutoMark758
    BiliClient.prefs.v758highlightAutoMark758 = !current
    AppToast.show(this, "Highlight Auto Mark758: ${if (!current) "ON" else "OFF"}")
}

// v758: Hint Auto Display758
internal fun PlayerActivity.showV758HintAutoDisplay758Toggle() {
    val current = BiliClient.prefs.v758hintAutoDisplay758
    BiliClient.prefs.v758hintAutoDisplay758 = !current
    AppToast.show(this, "Hint Auto Display758: ${if (!current) "ON" else "OFF"}")
}

// v758: History Auto Record758
internal fun PlayerActivity.showV758HistoryAutoRecord758Toggle() {
    val current = BiliClient.prefs.v758historyAutoRecord758
    BiliClient.prefs.v758historyAutoRecord758 = !current
    AppToast.show(this, "History Auto Record758: ${if (!current) "ON" else "OFF"}")
}

// v759: Guard Auto Protect759
internal fun PlayerActivity.showV759GuardAutoProtect759Toggle() {
    val current = BiliClient.prefs.v759guardAutoProtect759
    BiliClient.prefs.v759guardAutoProtect759 = !current
    AppToast.show(this, "Guard Auto Protect759: ${if (!current) "ON" else "OFF"}")
}

// v759: Guide Auto Overlay759
internal fun PlayerActivity.showV759GuideAutoOverlay759Toggle() {
    val current = BiliClient.prefs.v759guideAutoOverlay759
    BiliClient.prefs.v759guideAutoOverlay759 = !current
    AppToast.show(this, "Guide Auto Overlay759: ${if (!current) "ON" else "OFF"}")
}

// v759: Handle Auto Process759
internal fun PlayerActivity.showV759HandleAutoProcess759Toggle() {
    val current = BiliClient.prefs.v759handleAutoProcess759
    BiliClient.prefs.v759handleAutoProcess759 = !current
    AppToast.show(this, "Handle Auto Process759: ${if (!current) "ON" else "OFF"}")
}

// v759: Handler Auto Dispatch759
internal fun PlayerActivity.showV759HandlerAutoDispatch759Toggle() {
    val current = BiliClient.prefs.v759handlerAutoDispatch759
    BiliClient.prefs.v759handlerAutoDispatch759 = !current
    AppToast.show(this, "Handler Auto Dispatch759: ${if (!current) "ON" else "OFF"}")
}

// v759: Hash Auto Verify759
internal fun PlayerActivity.showV759HashAutoVerify759Toggle() {
    val current = BiliClient.prefs.v759hashAutoVerify759
    BiliClient.prefs.v759hashAutoVerify759 = !current
    AppToast.show(this, "Hash Auto Verify759: ${if (!current) "ON" else "OFF"}")
}

// v759: Head Auto Detect759
internal fun PlayerActivity.showV759HeadAutoDetect759Toggle() {
    val current = BiliClient.prefs.v759headAutoDetect759
    BiliClient.prefs.v759headAutoDetect759 = !current
    AppToast.show(this, "Head Auto Detect759: ${if (!current) "ON" else "OFF"}")
}

// v759: Header Auto Pin759
internal fun PlayerActivity.showV759HeaderAutoPin759Toggle() {
    val current = BiliClient.prefs.v759headerAutoPin759
    BiliClient.prefs.v759headerAutoPin759 = !current
    AppToast.show(this, "Header Auto Pin759: ${if (!current) "ON" else "OFF"}")
}

// v759: Heap Auto Compact759
internal fun PlayerActivity.showV759HeapAutoCompact759Toggle() {
    val current = BiliClient.prefs.v759heapAutoCompact759
    BiliClient.prefs.v759heapAutoCompact759 = !current
    AppToast.show(this, "Heap Auto Compact759: ${if (!current) "ON" else "OFF"}")
}

// v759: Height Auto Adjust759
internal fun PlayerActivity.showV759HeightAutoAdjust759Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v759heightAutoAdjust759).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust759",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v759heightAutoAdjust759 = value
        AppToast.show(this, "Height Auto Adjust759: $value")
    }
}

// v759: Help Auto Tooltip759
internal fun PlayerActivity.showV759HelpAutoTooltip759Toggle() {
    val current = BiliClient.prefs.v759helpAutoTooltip759
    BiliClient.prefs.v759helpAutoTooltip759 = !current
    AppToast.show(this, "Help Auto Tooltip759: ${if (!current) "ON" else "OFF"}")
}

// v759: Hidden Auto Reveal759
internal fun PlayerActivity.showV759HiddenAutoReveal759Toggle() {
    val current = BiliClient.prefs.v759hiddenAutoReveal759
    BiliClient.prefs.v759hiddenAutoReveal759 = !current
    AppToast.show(this, "Hidden Auto Reveal759: ${if (!current) "ON" else "OFF"}")
}

// v759: Hide Auto OnScroll759
internal fun PlayerActivity.showV759HideAutoOnScroll759Toggle() {
    val current = BiliClient.prefs.v759hideAutoOnScroll759
    BiliClient.prefs.v759hideAutoOnScroll759 = !current
    AppToast.show(this, "Hide Auto OnScroll759: ${if (!current) "ON" else "OFF"}")
}

// v759: Highlight Auto Mark759
internal fun PlayerActivity.showV759HighlightAutoMark759Toggle() {
    val current = BiliClient.prefs.v759highlightAutoMark759
    BiliClient.prefs.v759highlightAutoMark759 = !current
    AppToast.show(this, "Highlight Auto Mark759: ${if (!current) "ON" else "OFF"}")
}

// v759: Hint Auto Display759
internal fun PlayerActivity.showV759HintAutoDisplay759Toggle() {
    val current = BiliClient.prefs.v759hintAutoDisplay759
    BiliClient.prefs.v759hintAutoDisplay759 = !current
    AppToast.show(this, "Hint Auto Display759: ${if (!current) "ON" else "OFF"}")
}

// v759: History Auto Record759
internal fun PlayerActivity.showV759HistoryAutoRecord759Toggle() {
    val current = BiliClient.prefs.v759historyAutoRecord759
    BiliClient.prefs.v759historyAutoRecord759 = !current
    AppToast.show(this, "History Auto Record759: ${if (!current) "ON" else "OFF"}")
}

// v760: Guard Auto Protect760
internal fun PlayerActivity.showV760GuardAutoProtect760Toggle() {
    val current = BiliClient.prefs.v760guardAutoProtect760
    BiliClient.prefs.v760guardAutoProtect760 = !current
    AppToast.show(this, "Guard Auto Protect760: ${if (!current) "ON" else "OFF"}")
}

// v760: Guide Auto Overlay760
internal fun PlayerActivity.showV760GuideAutoOverlay760Toggle() {
    val current = BiliClient.prefs.v760guideAutoOverlay760
    BiliClient.prefs.v760guideAutoOverlay760 = !current
    AppToast.show(this, "Guide Auto Overlay760: ${if (!current) "ON" else "OFF"}")
}

// v760: Handle Auto Process760
internal fun PlayerActivity.showV760HandleAutoProcess760Toggle() {
    val current = BiliClient.prefs.v760handleAutoProcess760
    BiliClient.prefs.v760handleAutoProcess760 = !current
    AppToast.show(this, "Handle Auto Process760: ${if (!current) "ON" else "OFF"}")
}

// v760: Handler Auto Dispatch760
internal fun PlayerActivity.showV760HandlerAutoDispatch760Toggle() {
    val current = BiliClient.prefs.v760handlerAutoDispatch760
    BiliClient.prefs.v760handlerAutoDispatch760 = !current
    AppToast.show(this, "Handler Auto Dispatch760: ${if (!current) "ON" else "OFF"}")
}

// v760: Hash Auto Verify760
internal fun PlayerActivity.showV760HashAutoVerify760Toggle() {
    val current = BiliClient.prefs.v760hashAutoVerify760
    BiliClient.prefs.v760hashAutoVerify760 = !current
    AppToast.show(this, "Hash Auto Verify760: ${if (!current) "ON" else "OFF"}")
}

// v760: Head Auto Detect760
internal fun PlayerActivity.showV760HeadAutoDetect760Toggle() {
    val current = BiliClient.prefs.v760headAutoDetect760
    BiliClient.prefs.v760headAutoDetect760 = !current
    AppToast.show(this, "Head Auto Detect760: ${if (!current) "ON" else "OFF"}")
}

// v760: Header Auto Pin760
internal fun PlayerActivity.showV760HeaderAutoPin760Toggle() {
    val current = BiliClient.prefs.v760headerAutoPin760
    BiliClient.prefs.v760headerAutoPin760 = !current
    AppToast.show(this, "Header Auto Pin760: ${if (!current) "ON" else "OFF"}")
}

// v760: Heap Auto Compact760
internal fun PlayerActivity.showV760HeapAutoCompact760Toggle() {
    val current = BiliClient.prefs.v760heapAutoCompact760
    BiliClient.prefs.v760heapAutoCompact760 = !current
    AppToast.show(this, "Heap Auto Compact760: ${if (!current) "ON" else "OFF"}")
}

// v760: Height Auto Adjust760
internal fun PlayerActivity.showV760HeightAutoAdjust760Dialog() {
    val options = listOf(0, 1, 2, 3)
    val currentIndex = options.indexOf(BiliClient.prefs.v760heightAutoAdjust760).takeIf { it >= 0 } ?: 0
    showSettingsChoiceDialog(
        title = "Height Auto Adjust760",
        options = options,
        checkedIndex = currentIndex,
        label = { "$it" },
    ) { value ->
        BiliClient.prefs.v760heightAutoAdjust760 = value
        AppToast.show(this, "Height Auto Adjust760: $value")
    }
}

// v760: Help Auto Tooltip760
internal fun PlayerActivity.showV760HelpAutoTooltip760Toggle() {
    val current = BiliClient.prefs.v760helpAutoTooltip760
    BiliClient.prefs.v760helpAutoTooltip760 = !current
    AppToast.show(this, "Help Auto Tooltip760: ${if (!current) "ON" else "OFF"}")
}

// v760: Hidden Auto Reveal760
internal fun PlayerActivity.showV760HiddenAutoReveal760Toggle() {
    val current = BiliClient.prefs.v760hiddenAutoReveal760
    BiliClient.prefs.v760hiddenAutoReveal760 = !current
    AppToast.show(this, "Hidden Auto Reveal760: ${if (!current) "ON" else "OFF"}")
}

// v760: Hide Auto OnScroll760
internal fun PlayerActivity.showV760HideAutoOnScroll760Toggle() {
    val current = BiliClient.prefs.v760hideAutoOnScroll760
    BiliClient.prefs.v760hideAutoOnScroll760 = !current
    AppToast.show(this, "Hide Auto OnScroll760: ${if (!current) "ON" else "OFF"}")
}

// v760: Highlight Auto Mark760
internal fun PlayerActivity.showV760HighlightAutoMark760Toggle() {
    val current = BiliClient.prefs.v760highlightAutoMark760
    BiliClient.prefs.v760highlightAutoMark760 = !current
    AppToast.show(this, "Highlight Auto Mark760: ${if (!current) "ON" else "OFF"}")
}

// v760: Hint Auto Display760
internal fun PlayerActivity.showV760HintAutoDisplay760Toggle() {
    val current = BiliClient.prefs.v760hintAutoDisplay760
    BiliClient.prefs.v760hintAutoDisplay760 = !current
    AppToast.show(this, "Hint Auto Display760: ${if (!current) "ON" else "OFF"}")
}

// v760: History Auto Record760
internal fun PlayerActivity.showV760HistoryAutoRecord760Toggle() {
    val current = BiliClient.prefs.v760historyAutoRecord760
    BiliClient.prefs.v760historyAutoRecord760 = !current
    AppToast.show(this, "History Auto Record760: ${if (!current) "ON" else "OFF"}")
}

