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

// v991: Structure Auto Schema991
internal fun PlayerActivity.showV991StructureAutoSchema991Toggle() {
    val current = BiliClient.prefs.v991structureAutoSchema991
    BiliClient.prefs.v991structureAutoSchema991 = !current
    AppToast.show(this, "Structure Auto Schema991: ${if (!current) "ON" else "OFF"}")
}

// v991: Style Auto Theme991
internal fun PlayerActivity.showV991StyleAutoTheme991Toggle() {
    val current = BiliClient.prefs.v991styleAutoTheme991
    BiliClient.prefs.v991styleAutoTheme991 = !current
    AppToast.show(this, "Style Auto Theme991: ${if (!current) "ON" else "OFF"}")
}

// v991: Sub Auto Title991
internal fun PlayerActivity.showV991SubAutoTitle991Toggle() {
    val current = BiliClient.prefs.v991subAutoTitle991
    BiliClient.prefs.v991subAutoTitle991 = !current
    AppToast.show(this, "Sub Auto Title991: ${if (!current) "ON" else "OFF"}")
}

// v991: Submit Auto Form991
internal fun PlayerActivity.showV991SubmitAutoForm991Toggle() {
    val current = BiliClient.prefs.v991submitAutoForm991
    BiliClient.prefs.v991submitAutoForm991 = !current
    AppToast.show(this, "Submit Auto Form991: ${if (!current) "ON" else "OFF"}")
}

// v991: Subscribe Auto Push991
internal fun PlayerActivity.showV991SubscribeAutoPush991Toggle() {
    val current = BiliClient.prefs.v991subscribeAutoPush991
    BiliClient.prefs.v991subscribeAutoPush991 = !current
    AppToast.show(this, "Subscribe Auto Push991: ${if (!current) "ON" else "OFF"}")
}

// v991: Success Auto Toast991
internal fun PlayerActivity.showV991SuccessAutoToast991Toggle() {
    val current = BiliClient.prefs.v991successAutoToast991
    BiliClient.prefs.v991successAutoToast991 = !current
    AppToast.show(this, "Success Auto Toast991: ${if (!current) "ON" else "OFF"}")
}

// v991: Suffix Auto Trim991
internal fun PlayerActivity.showV991SuffixAutoTrim991Toggle() {
    val current = BiliClient.prefs.v991suffixAutoTrim991
    BiliClient.prefs.v991suffixAutoTrim991 = !current
    AppToast.show(this, "Suffix Auto Trim991: ${if (!current) "ON" else "OFF"}")
}

// v991: Sum Auto Aggregate991
internal fun PlayerActivity.showV991SumAutoAggregate991Toggle() {
    val current = BiliClient.prefs.v991sumAutoAggregate991
    BiliClient.prefs.v991sumAutoAggregate991 = !current
    AppToast.show(this, "Sum Auto Aggregate991: ${if (!current) "ON" else "OFF"}")
}

// v991: Summary Auto Generate991
internal fun PlayerActivity.showV991SummaryAutoGenerate991Toggle() {
    val current = BiliClient.prefs.v991summaryAutoGenerate991
    BiliClient.prefs.v991summaryAutoGenerate991 = !current
    AppToast.show(this, "Summary Auto Generate991: ${if (!current) "ON" else "OFF"}")
}

// v991: Support Auto Detect991
internal fun PlayerActivity.showV991SupportAutoDetect991Toggle() {
    val current = BiliClient.prefs.v991supportAutoDetect991
    BiliClient.prefs.v991supportAutoDetect991 = !current
    AppToast.show(this, "Support Auto Detect991: ${if (!current) "ON" else "OFF"}")
}

// v991: Swap Auto Buffer991
internal fun PlayerActivity.showV991SwapAutoBuffer991Toggle() {
    val current = BiliClient.prefs.v991swapAutoBuffer991
    BiliClient.prefs.v991swapAutoBuffer991 = !current
    AppToast.show(this, "Swap Auto Buffer991: ${if (!current) "ON" else "OFF"}")
}

// v991: Switch Auto Tab991
internal fun PlayerActivity.showV991SwitchAutoTab991Toggle() {
    val current = BiliClient.prefs.v991switchAutoTab991
    BiliClient.prefs.v991switchAutoTab991 = !current
    AppToast.show(this, "Switch Auto Tab991: ${if (!current) "ON" else "OFF"}")
}

// v991: Symbol Auto Encode991
internal fun PlayerActivity.showV991SymbolAutoEncode991Toggle() {
    val current = BiliClient.prefs.v991symbolAutoEncode991
    BiliClient.prefs.v991symbolAutoEncode991 = !current
    AppToast.show(this, "Symbol Auto Encode991: ${if (!current) "ON" else "OFF"}")
}

// v991: Sync Auto Cloud991
internal fun PlayerActivity.showV991SyncAutoCloud991Toggle() {
    val current = BiliClient.prefs.v991syncAutoCloud991
    BiliClient.prefs.v991syncAutoCloud991 = !current
    AppToast.show(this, "Sync Auto Cloud991: ${if (!current) "ON" else "OFF"}")
}

// v991: System Auto Optimize991
internal fun PlayerActivity.showV991SystemAutoOptimize991Toggle() {
    val current = BiliClient.prefs.v991systemAutoOptimize991
    BiliClient.prefs.v991systemAutoOptimize991 = !current
    AppToast.show(this, "System Auto Optimize991: ${if (!current) "ON" else "OFF"}")
}

// v992: Structure Auto Schema992
internal fun PlayerActivity.showV992StructureAutoSchema992Toggle() {
    val current = BiliClient.prefs.v992structureAutoSchema992
    BiliClient.prefs.v992structureAutoSchema992 = !current
    AppToast.show(this, "Structure Auto Schema992: ${if (!current) "ON" else "OFF"}")
}

// v992: Style Auto Theme992
internal fun PlayerActivity.showV992StyleAutoTheme992Toggle() {
    val current = BiliClient.prefs.v992styleAutoTheme992
    BiliClient.prefs.v992styleAutoTheme992 = !current
    AppToast.show(this, "Style Auto Theme992: ${if (!current) "ON" else "OFF"}")
}

// v992: Sub Auto Title992
internal fun PlayerActivity.showV992SubAutoTitle992Toggle() {
    val current = BiliClient.prefs.v992subAutoTitle992
    BiliClient.prefs.v992subAutoTitle992 = !current
    AppToast.show(this, "Sub Auto Title992: ${if (!current) "ON" else "OFF"}")
}

// v992: Submit Auto Form992
internal fun PlayerActivity.showV992SubmitAutoForm992Toggle() {
    val current = BiliClient.prefs.v992submitAutoForm992
    BiliClient.prefs.v992submitAutoForm992 = !current
    AppToast.show(this, "Submit Auto Form992: ${if (!current) "ON" else "OFF"}")
}

// v992: Subscribe Auto Push992
internal fun PlayerActivity.showV992SubscribeAutoPush992Toggle() {
    val current = BiliClient.prefs.v992subscribeAutoPush992
    BiliClient.prefs.v992subscribeAutoPush992 = !current
    AppToast.show(this, "Subscribe Auto Push992: ${if (!current) "ON" else "OFF"}")
}

// v992: Success Auto Toast992
internal fun PlayerActivity.showV992SuccessAutoToast992Toggle() {
    val current = BiliClient.prefs.v992successAutoToast992
    BiliClient.prefs.v992successAutoToast992 = !current
    AppToast.show(this, "Success Auto Toast992: ${if (!current) "ON" else "OFF"}")
}

// v992: Suffix Auto Trim992
internal fun PlayerActivity.showV992SuffixAutoTrim992Toggle() {
    val current = BiliClient.prefs.v992suffixAutoTrim992
    BiliClient.prefs.v992suffixAutoTrim992 = !current
    AppToast.show(this, "Suffix Auto Trim992: ${if (!current) "ON" else "OFF"}")
}

// v992: Sum Auto Aggregate992
internal fun PlayerActivity.showV992SumAutoAggregate992Toggle() {
    val current = BiliClient.prefs.v992sumAutoAggregate992
    BiliClient.prefs.v992sumAutoAggregate992 = !current
    AppToast.show(this, "Sum Auto Aggregate992: ${if (!current) "ON" else "OFF"}")
}

// v992: Summary Auto Generate992
internal fun PlayerActivity.showV992SummaryAutoGenerate992Toggle() {
    val current = BiliClient.prefs.v992summaryAutoGenerate992
    BiliClient.prefs.v992summaryAutoGenerate992 = !current
    AppToast.show(this, "Summary Auto Generate992: ${if (!current) "ON" else "OFF"}")
}

// v992: Support Auto Detect992
internal fun PlayerActivity.showV992SupportAutoDetect992Toggle() {
    val current = BiliClient.prefs.v992supportAutoDetect992
    BiliClient.prefs.v992supportAutoDetect992 = !current
    AppToast.show(this, "Support Auto Detect992: ${if (!current) "ON" else "OFF"}")
}

// v992: Swap Auto Buffer992
internal fun PlayerActivity.showV992SwapAutoBuffer992Toggle() {
    val current = BiliClient.prefs.v992swapAutoBuffer992
    BiliClient.prefs.v992swapAutoBuffer992 = !current
    AppToast.show(this, "Swap Auto Buffer992: ${if (!current) "ON" else "OFF"}")
}

// v992: Switch Auto Tab992
internal fun PlayerActivity.showV992SwitchAutoTab992Toggle() {
    val current = BiliClient.prefs.v992switchAutoTab992
    BiliClient.prefs.v992switchAutoTab992 = !current
    AppToast.show(this, "Switch Auto Tab992: ${if (!current) "ON" else "OFF"}")
}

// v992: Symbol Auto Encode992
internal fun PlayerActivity.showV992SymbolAutoEncode992Toggle() {
    val current = BiliClient.prefs.v992symbolAutoEncode992
    BiliClient.prefs.v992symbolAutoEncode992 = !current
    AppToast.show(this, "Symbol Auto Encode992: ${if (!current) "ON" else "OFF"}")
}

// v992: Sync Auto Cloud992
internal fun PlayerActivity.showV992SyncAutoCloud992Toggle() {
    val current = BiliClient.prefs.v992syncAutoCloud992
    BiliClient.prefs.v992syncAutoCloud992 = !current
    AppToast.show(this, "Sync Auto Cloud992: ${if (!current) "ON" else "OFF"}")
}

// v992: System Auto Optimize992
internal fun PlayerActivity.showV992SystemAutoOptimize992Toggle() {
    val current = BiliClient.prefs.v992systemAutoOptimize992
    BiliClient.prefs.v992systemAutoOptimize992 = !current
    AppToast.show(this, "System Auto Optimize992: ${if (!current) "ON" else "OFF"}")
}

// v993: Structure Auto Schema993
internal fun PlayerActivity.showV993StructureAutoSchema993Toggle() {
    val current = BiliClient.prefs.v993structureAutoSchema993
    BiliClient.prefs.v993structureAutoSchema993 = !current
    AppToast.show(this, "Structure Auto Schema993: ${if (!current) "ON" else "OFF"}")
}

// v993: Style Auto Theme993
internal fun PlayerActivity.showV993StyleAutoTheme993Toggle() {
    val current = BiliClient.prefs.v993styleAutoTheme993
    BiliClient.prefs.v993styleAutoTheme993 = !current
    AppToast.show(this, "Style Auto Theme993: ${if (!current) "ON" else "OFF"}")
}

// v993: Sub Auto Title993
internal fun PlayerActivity.showV993SubAutoTitle993Toggle() {
    val current = BiliClient.prefs.v993subAutoTitle993
    BiliClient.prefs.v993subAutoTitle993 = !current
    AppToast.show(this, "Sub Auto Title993: ${if (!current) "ON" else "OFF"}")
}

// v993: Submit Auto Form993
internal fun PlayerActivity.showV993SubmitAutoForm993Toggle() {
    val current = BiliClient.prefs.v993submitAutoForm993
    BiliClient.prefs.v993submitAutoForm993 = !current
    AppToast.show(this, "Submit Auto Form993: ${if (!current) "ON" else "OFF"}")
}

// v993: Subscribe Auto Push993
internal fun PlayerActivity.showV993SubscribeAutoPush993Toggle() {
    val current = BiliClient.prefs.v993subscribeAutoPush993
    BiliClient.prefs.v993subscribeAutoPush993 = !current
    AppToast.show(this, "Subscribe Auto Push993: ${if (!current) "ON" else "OFF"}")
}

// v993: Success Auto Toast993
internal fun PlayerActivity.showV993SuccessAutoToast993Toggle() {
    val current = BiliClient.prefs.v993successAutoToast993
    BiliClient.prefs.v993successAutoToast993 = !current
    AppToast.show(this, "Success Auto Toast993: ${if (!current) "ON" else "OFF"}")
}

// v993: Suffix Auto Trim993
internal fun PlayerActivity.showV993SuffixAutoTrim993Toggle() {
    val current = BiliClient.prefs.v993suffixAutoTrim993
    BiliClient.prefs.v993suffixAutoTrim993 = !current
    AppToast.show(this, "Suffix Auto Trim993: ${if (!current) "ON" else "OFF"}")
}

// v993: Sum Auto Aggregate993
internal fun PlayerActivity.showV993SumAutoAggregate993Toggle() {
    val current = BiliClient.prefs.v993sumAutoAggregate993
    BiliClient.prefs.v993sumAutoAggregate993 = !current
    AppToast.show(this, "Sum Auto Aggregate993: ${if (!current) "ON" else "OFF"}")
}

// v993: Summary Auto Generate993
internal fun PlayerActivity.showV993SummaryAutoGenerate993Toggle() {
    val current = BiliClient.prefs.v993summaryAutoGenerate993
    BiliClient.prefs.v993summaryAutoGenerate993 = !current
    AppToast.show(this, "Summary Auto Generate993: ${if (!current) "ON" else "OFF"}")
}

// v993: Support Auto Detect993
internal fun PlayerActivity.showV993SupportAutoDetect993Toggle() {
    val current = BiliClient.prefs.v993supportAutoDetect993
    BiliClient.prefs.v993supportAutoDetect993 = !current
    AppToast.show(this, "Support Auto Detect993: ${if (!current) "ON" else "OFF"}")
}

// v993: Swap Auto Buffer993
internal fun PlayerActivity.showV993SwapAutoBuffer993Toggle() {
    val current = BiliClient.prefs.v993swapAutoBuffer993
    BiliClient.prefs.v993swapAutoBuffer993 = !current
    AppToast.show(this, "Swap Auto Buffer993: ${if (!current) "ON" else "OFF"}")
}

// v993: Switch Auto Tab993
internal fun PlayerActivity.showV993SwitchAutoTab993Toggle() {
    val current = BiliClient.prefs.v993switchAutoTab993
    BiliClient.prefs.v993switchAutoTab993 = !current
    AppToast.show(this, "Switch Auto Tab993: ${if (!current) "ON" else "OFF"}")
}

// v993: Symbol Auto Encode993
internal fun PlayerActivity.showV993SymbolAutoEncode993Toggle() {
    val current = BiliClient.prefs.v993symbolAutoEncode993
    BiliClient.prefs.v993symbolAutoEncode993 = !current
    AppToast.show(this, "Symbol Auto Encode993: ${if (!current) "ON" else "OFF"}")
}

// v993: Sync Auto Cloud993
internal fun PlayerActivity.showV993SyncAutoCloud993Toggle() {
    val current = BiliClient.prefs.v993syncAutoCloud993
    BiliClient.prefs.v993syncAutoCloud993 = !current
    AppToast.show(this, "Sync Auto Cloud993: ${if (!current) "ON" else "OFF"}")
}

// v993: System Auto Optimize993
internal fun PlayerActivity.showV993SystemAutoOptimize993Toggle() {
    val current = BiliClient.prefs.v993systemAutoOptimize993
    BiliClient.prefs.v993systemAutoOptimize993 = !current
    AppToast.show(this, "System Auto Optimize993: ${if (!current) "ON" else "OFF"}")
}

// v994: Structure Auto Schema994
internal fun PlayerActivity.showV994StructureAutoSchema994Toggle() {
    val current = BiliClient.prefs.v994structureAutoSchema994
    BiliClient.prefs.v994structureAutoSchema994 = !current
    AppToast.show(this, "Structure Auto Schema994: ${if (!current) "ON" else "OFF"}")
}

// v994: Style Auto Theme994
internal fun PlayerActivity.showV994StyleAutoTheme994Toggle() {
    val current = BiliClient.prefs.v994styleAutoTheme994
    BiliClient.prefs.v994styleAutoTheme994 = !current
    AppToast.show(this, "Style Auto Theme994: ${if (!current) "ON" else "OFF"}")
}

// v994: Sub Auto Title994
internal fun PlayerActivity.showV994SubAutoTitle994Toggle() {
    val current = BiliClient.prefs.v994subAutoTitle994
    BiliClient.prefs.v994subAutoTitle994 = !current
    AppToast.show(this, "Sub Auto Title994: ${if (!current) "ON" else "OFF"}")
}

// v994: Submit Auto Form994
internal fun PlayerActivity.showV994SubmitAutoForm994Toggle() {
    val current = BiliClient.prefs.v994submitAutoForm994
    BiliClient.prefs.v994submitAutoForm994 = !current
    AppToast.show(this, "Submit Auto Form994: ${if (!current) "ON" else "OFF"}")
}

// v994: Subscribe Auto Push994
internal fun PlayerActivity.showV994SubscribeAutoPush994Toggle() {
    val current = BiliClient.prefs.v994subscribeAutoPush994
    BiliClient.prefs.v994subscribeAutoPush994 = !current
    AppToast.show(this, "Subscribe Auto Push994: ${if (!current) "ON" else "OFF"}")
}

// v994: Success Auto Toast994
internal fun PlayerActivity.showV994SuccessAutoToast994Toggle() {
    val current = BiliClient.prefs.v994successAutoToast994
    BiliClient.prefs.v994successAutoToast994 = !current
    AppToast.show(this, "Success Auto Toast994: ${if (!current) "ON" else "OFF"}")
}

// v994: Suffix Auto Trim994
internal fun PlayerActivity.showV994SuffixAutoTrim994Toggle() {
    val current = BiliClient.prefs.v994suffixAutoTrim994
    BiliClient.prefs.v994suffixAutoTrim994 = !current
    AppToast.show(this, "Suffix Auto Trim994: ${if (!current) "ON" else "OFF"}")
}

// v994: Sum Auto Aggregate994
internal fun PlayerActivity.showV994SumAutoAggregate994Toggle() {
    val current = BiliClient.prefs.v994sumAutoAggregate994
    BiliClient.prefs.v994sumAutoAggregate994 = !current
    AppToast.show(this, "Sum Auto Aggregate994: ${if (!current) "ON" else "OFF"}")
}

// v994: Summary Auto Generate994
internal fun PlayerActivity.showV994SummaryAutoGenerate994Toggle() {
    val current = BiliClient.prefs.v994summaryAutoGenerate994
    BiliClient.prefs.v994summaryAutoGenerate994 = !current
    AppToast.show(this, "Summary Auto Generate994: ${if (!current) "ON" else "OFF"}")
}

// v994: Support Auto Detect994
internal fun PlayerActivity.showV994SupportAutoDetect994Toggle() {
    val current = BiliClient.prefs.v994supportAutoDetect994
    BiliClient.prefs.v994supportAutoDetect994 = !current
    AppToast.show(this, "Support Auto Detect994: ${if (!current) "ON" else "OFF"}")
}

// v994: Swap Auto Buffer994
internal fun PlayerActivity.showV994SwapAutoBuffer994Toggle() {
    val current = BiliClient.prefs.v994swapAutoBuffer994
    BiliClient.prefs.v994swapAutoBuffer994 = !current
    AppToast.show(this, "Swap Auto Buffer994: ${if (!current) "ON" else "OFF"}")
}

// v994: Switch Auto Tab994
internal fun PlayerActivity.showV994SwitchAutoTab994Toggle() {
    val current = BiliClient.prefs.v994switchAutoTab994
    BiliClient.prefs.v994switchAutoTab994 = !current
    AppToast.show(this, "Switch Auto Tab994: ${if (!current) "ON" else "OFF"}")
}

// v994: Symbol Auto Encode994
internal fun PlayerActivity.showV994SymbolAutoEncode994Toggle() {
    val current = BiliClient.prefs.v994symbolAutoEncode994
    BiliClient.prefs.v994symbolAutoEncode994 = !current
    AppToast.show(this, "Symbol Auto Encode994: ${if (!current) "ON" else "OFF"}")
}

// v994: Sync Auto Cloud994
internal fun PlayerActivity.showV994SyncAutoCloud994Toggle() {
    val current = BiliClient.prefs.v994syncAutoCloud994
    BiliClient.prefs.v994syncAutoCloud994 = !current
    AppToast.show(this, "Sync Auto Cloud994: ${if (!current) "ON" else "OFF"}")
}

// v994: System Auto Optimize994
internal fun PlayerActivity.showV994SystemAutoOptimize994Toggle() {
    val current = BiliClient.prefs.v994systemAutoOptimize994
    BiliClient.prefs.v994systemAutoOptimize994 = !current
    AppToast.show(this, "System Auto Optimize994: ${if (!current) "ON" else "OFF"}")
}

// v995: Structure Auto Schema995
internal fun PlayerActivity.showV995StructureAutoSchema995Toggle() {
    val current = BiliClient.prefs.v995structureAutoSchema995
    BiliClient.prefs.v995structureAutoSchema995 = !current
    AppToast.show(this, "Structure Auto Schema995: ${if (!current) "ON" else "OFF"}")
}

// v995: Style Auto Theme995
internal fun PlayerActivity.showV995StyleAutoTheme995Toggle() {
    val current = BiliClient.prefs.v995styleAutoTheme995
    BiliClient.prefs.v995styleAutoTheme995 = !current
    AppToast.show(this, "Style Auto Theme995: ${if (!current) "ON" else "OFF"}")
}

// v995: Sub Auto Title995
internal fun PlayerActivity.showV995SubAutoTitle995Toggle() {
    val current = BiliClient.prefs.v995subAutoTitle995
    BiliClient.prefs.v995subAutoTitle995 = !current
    AppToast.show(this, "Sub Auto Title995: ${if (!current) "ON" else "OFF"}")
}

// v995: Submit Auto Form995
internal fun PlayerActivity.showV995SubmitAutoForm995Toggle() {
    val current = BiliClient.prefs.v995submitAutoForm995
    BiliClient.prefs.v995submitAutoForm995 = !current
    AppToast.show(this, "Submit Auto Form995: ${if (!current) "ON" else "OFF"}")
}

// v995: Subscribe Auto Push995
internal fun PlayerActivity.showV995SubscribeAutoPush995Toggle() {
    val current = BiliClient.prefs.v995subscribeAutoPush995
    BiliClient.prefs.v995subscribeAutoPush995 = !current
    AppToast.show(this, "Subscribe Auto Push995: ${if (!current) "ON" else "OFF"}")
}

// v995: Success Auto Toast995
internal fun PlayerActivity.showV995SuccessAutoToast995Toggle() {
    val current = BiliClient.prefs.v995successAutoToast995
    BiliClient.prefs.v995successAutoToast995 = !current
    AppToast.show(this, "Success Auto Toast995: ${if (!current) "ON" else "OFF"}")
}

// v995: Suffix Auto Trim995
internal fun PlayerActivity.showV995SuffixAutoTrim995Toggle() {
    val current = BiliClient.prefs.v995suffixAutoTrim995
    BiliClient.prefs.v995suffixAutoTrim995 = !current
    AppToast.show(this, "Suffix Auto Trim995: ${if (!current) "ON" else "OFF"}")
}

// v995: Sum Auto Aggregate995
internal fun PlayerActivity.showV995SumAutoAggregate995Toggle() {
    val current = BiliClient.prefs.v995sumAutoAggregate995
    BiliClient.prefs.v995sumAutoAggregate995 = !current
    AppToast.show(this, "Sum Auto Aggregate995: ${if (!current) "ON" else "OFF"}")
}

// v995: Summary Auto Generate995
internal fun PlayerActivity.showV995SummaryAutoGenerate995Toggle() {
    val current = BiliClient.prefs.v995summaryAutoGenerate995
    BiliClient.prefs.v995summaryAutoGenerate995 = !current
    AppToast.show(this, "Summary Auto Generate995: ${if (!current) "ON" else "OFF"}")
}

// v995: Support Auto Detect995
internal fun PlayerActivity.showV995SupportAutoDetect995Toggle() {
    val current = BiliClient.prefs.v995supportAutoDetect995
    BiliClient.prefs.v995supportAutoDetect995 = !current
    AppToast.show(this, "Support Auto Detect995: ${if (!current) "ON" else "OFF"}")
}

// v995: Swap Auto Buffer995
internal fun PlayerActivity.showV995SwapAutoBuffer995Toggle() {
    val current = BiliClient.prefs.v995swapAutoBuffer995
    BiliClient.prefs.v995swapAutoBuffer995 = !current
    AppToast.show(this, "Swap Auto Buffer995: ${if (!current) "ON" else "OFF"}")
}

// v995: Switch Auto Tab995
internal fun PlayerActivity.showV995SwitchAutoTab995Toggle() {
    val current = BiliClient.prefs.v995switchAutoTab995
    BiliClient.prefs.v995switchAutoTab995 = !current
    AppToast.show(this, "Switch Auto Tab995: ${if (!current) "ON" else "OFF"}")
}

// v995: Symbol Auto Encode995
internal fun PlayerActivity.showV995SymbolAutoEncode995Toggle() {
    val current = BiliClient.prefs.v995symbolAutoEncode995
    BiliClient.prefs.v995symbolAutoEncode995 = !current
    AppToast.show(this, "Symbol Auto Encode995: ${if (!current) "ON" else "OFF"}")
}

// v995: Sync Auto Cloud995
internal fun PlayerActivity.showV995SyncAutoCloud995Toggle() {
    val current = BiliClient.prefs.v995syncAutoCloud995
    BiliClient.prefs.v995syncAutoCloud995 = !current
    AppToast.show(this, "Sync Auto Cloud995: ${if (!current) "ON" else "OFF"}")
}

// v995: System Auto Optimize995
internal fun PlayerActivity.showV995SystemAutoOptimize995Toggle() {
    val current = BiliClient.prefs.v995systemAutoOptimize995
    BiliClient.prefs.v995systemAutoOptimize995 = !current
    AppToast.show(this, "System Auto Optimize995: ${if (!current) "ON" else "OFF"}")
}

// v996: Structure Auto Schema996
internal fun PlayerActivity.showV996StructureAutoSchema996Toggle() {
    val current = BiliClient.prefs.v996structureAutoSchema996
    BiliClient.prefs.v996structureAutoSchema996 = !current
    AppToast.show(this, "Structure Auto Schema996: ${if (!current) "ON" else "OFF"}")
}

// v996: Style Auto Theme996
internal fun PlayerActivity.showV996StyleAutoTheme996Toggle() {
    val current = BiliClient.prefs.v996styleAutoTheme996
    BiliClient.prefs.v996styleAutoTheme996 = !current
    AppToast.show(this, "Style Auto Theme996: ${if (!current) "ON" else "OFF"}")
}

// v996: Sub Auto Title996
internal fun PlayerActivity.showV996SubAutoTitle996Toggle() {
    val current = BiliClient.prefs.v996subAutoTitle996
    BiliClient.prefs.v996subAutoTitle996 = !current
    AppToast.show(this, "Sub Auto Title996: ${if (!current) "ON" else "OFF"}")
}

// v996: Submit Auto Form996
internal fun PlayerActivity.showV996SubmitAutoForm996Toggle() {
    val current = BiliClient.prefs.v996submitAutoForm996
    BiliClient.prefs.v996submitAutoForm996 = !current
    AppToast.show(this, "Submit Auto Form996: ${if (!current) "ON" else "OFF"}")
}

// v996: Subscribe Auto Push996
internal fun PlayerActivity.showV996SubscribeAutoPush996Toggle() {
    val current = BiliClient.prefs.v996subscribeAutoPush996
    BiliClient.prefs.v996subscribeAutoPush996 = !current
    AppToast.show(this, "Subscribe Auto Push996: ${if (!current) "ON" else "OFF"}")
}

// v996: Success Auto Toast996
internal fun PlayerActivity.showV996SuccessAutoToast996Toggle() {
    val current = BiliClient.prefs.v996successAutoToast996
    BiliClient.prefs.v996successAutoToast996 = !current
    AppToast.show(this, "Success Auto Toast996: ${if (!current) "ON" else "OFF"}")
}

// v996: Suffix Auto Trim996
internal fun PlayerActivity.showV996SuffixAutoTrim996Toggle() {
    val current = BiliClient.prefs.v996suffixAutoTrim996
    BiliClient.prefs.v996suffixAutoTrim996 = !current
    AppToast.show(this, "Suffix Auto Trim996: ${if (!current) "ON" else "OFF"}")
}

// v996: Sum Auto Aggregate996
internal fun PlayerActivity.showV996SumAutoAggregate996Toggle() {
    val current = BiliClient.prefs.v996sumAutoAggregate996
    BiliClient.prefs.v996sumAutoAggregate996 = !current
    AppToast.show(this, "Sum Auto Aggregate996: ${if (!current) "ON" else "OFF"}")
}

// v996: Summary Auto Generate996
internal fun PlayerActivity.showV996SummaryAutoGenerate996Toggle() {
    val current = BiliClient.prefs.v996summaryAutoGenerate996
    BiliClient.prefs.v996summaryAutoGenerate996 = !current
    AppToast.show(this, "Summary Auto Generate996: ${if (!current) "ON" else "OFF"}")
}

// v996: Support Auto Detect996
internal fun PlayerActivity.showV996SupportAutoDetect996Toggle() {
    val current = BiliClient.prefs.v996supportAutoDetect996
    BiliClient.prefs.v996supportAutoDetect996 = !current
    AppToast.show(this, "Support Auto Detect996: ${if (!current) "ON" else "OFF"}")
}

// v996: Swap Auto Buffer996
internal fun PlayerActivity.showV996SwapAutoBuffer996Toggle() {
    val current = BiliClient.prefs.v996swapAutoBuffer996
    BiliClient.prefs.v996swapAutoBuffer996 = !current
    AppToast.show(this, "Swap Auto Buffer996: ${if (!current) "ON" else "OFF"}")
}

// v996: Switch Auto Tab996
internal fun PlayerActivity.showV996SwitchAutoTab996Toggle() {
    val current = BiliClient.prefs.v996switchAutoTab996
    BiliClient.prefs.v996switchAutoTab996 = !current
    AppToast.show(this, "Switch Auto Tab996: ${if (!current) "ON" else "OFF"}")
}

// v996: Symbol Auto Encode996
internal fun PlayerActivity.showV996SymbolAutoEncode996Toggle() {
    val current = BiliClient.prefs.v996symbolAutoEncode996
    BiliClient.prefs.v996symbolAutoEncode996 = !current
    AppToast.show(this, "Symbol Auto Encode996: ${if (!current) "ON" else "OFF"}")
}

// v996: Sync Auto Cloud996
internal fun PlayerActivity.showV996SyncAutoCloud996Toggle() {
    val current = BiliClient.prefs.v996syncAutoCloud996
    BiliClient.prefs.v996syncAutoCloud996 = !current
    AppToast.show(this, "Sync Auto Cloud996: ${if (!current) "ON" else "OFF"}")
}

// v996: System Auto Optimize996
internal fun PlayerActivity.showV996SystemAutoOptimize996Toggle() {
    val current = BiliClient.prefs.v996systemAutoOptimize996
    BiliClient.prefs.v996systemAutoOptimize996 = !current
    AppToast.show(this, "System Auto Optimize996: ${if (!current) "ON" else "OFF"}")
}

// v997: Structure Auto Schema997
internal fun PlayerActivity.showV997StructureAutoSchema997Toggle() {
    val current = BiliClient.prefs.v997structureAutoSchema997
    BiliClient.prefs.v997structureAutoSchema997 = !current
    AppToast.show(this, "Structure Auto Schema997: ${if (!current) "ON" else "OFF"}")
}

// v997: Style Auto Theme997
internal fun PlayerActivity.showV997StyleAutoTheme997Toggle() {
    val current = BiliClient.prefs.v997styleAutoTheme997
    BiliClient.prefs.v997styleAutoTheme997 = !current
    AppToast.show(this, "Style Auto Theme997: ${if (!current) "ON" else "OFF"}")
}

// v997: Sub Auto Title997
internal fun PlayerActivity.showV997SubAutoTitle997Toggle() {
    val current = BiliClient.prefs.v997subAutoTitle997
    BiliClient.prefs.v997subAutoTitle997 = !current
    AppToast.show(this, "Sub Auto Title997: ${if (!current) "ON" else "OFF"}")
}

// v997: Submit Auto Form997
internal fun PlayerActivity.showV997SubmitAutoForm997Toggle() {
    val current = BiliClient.prefs.v997submitAutoForm997
    BiliClient.prefs.v997submitAutoForm997 = !current
    AppToast.show(this, "Submit Auto Form997: ${if (!current) "ON" else "OFF"}")
}

// v997: Subscribe Auto Push997
internal fun PlayerActivity.showV997SubscribeAutoPush997Toggle() {
    val current = BiliClient.prefs.v997subscribeAutoPush997
    BiliClient.prefs.v997subscribeAutoPush997 = !current
    AppToast.show(this, "Subscribe Auto Push997: ${if (!current) "ON" else "OFF"}")
}

// v997: Success Auto Toast997
internal fun PlayerActivity.showV997SuccessAutoToast997Toggle() {
    val current = BiliClient.prefs.v997successAutoToast997
    BiliClient.prefs.v997successAutoToast997 = !current
    AppToast.show(this, "Success Auto Toast997: ${if (!current) "ON" else "OFF"}")
}

// v997: Suffix Auto Trim997
internal fun PlayerActivity.showV997SuffixAutoTrim997Toggle() {
    val current = BiliClient.prefs.v997suffixAutoTrim997
    BiliClient.prefs.v997suffixAutoTrim997 = !current
    AppToast.show(this, "Suffix Auto Trim997: ${if (!current) "ON" else "OFF"}")
}

// v997: Sum Auto Aggregate997
internal fun PlayerActivity.showV997SumAutoAggregate997Toggle() {
    val current = BiliClient.prefs.v997sumAutoAggregate997
    BiliClient.prefs.v997sumAutoAggregate997 = !current
    AppToast.show(this, "Sum Auto Aggregate997: ${if (!current) "ON" else "OFF"}")
}

// v997: Summary Auto Generate997
internal fun PlayerActivity.showV997SummaryAutoGenerate997Toggle() {
    val current = BiliClient.prefs.v997summaryAutoGenerate997
    BiliClient.prefs.v997summaryAutoGenerate997 = !current
    AppToast.show(this, "Summary Auto Generate997: ${if (!current) "ON" else "OFF"}")
}

// v997: Support Auto Detect997
internal fun PlayerActivity.showV997SupportAutoDetect997Toggle() {
    val current = BiliClient.prefs.v997supportAutoDetect997
    BiliClient.prefs.v997supportAutoDetect997 = !current
    AppToast.show(this, "Support Auto Detect997: ${if (!current) "ON" else "OFF"}")
}

// v997: Swap Auto Buffer997
internal fun PlayerActivity.showV997SwapAutoBuffer997Toggle() {
    val current = BiliClient.prefs.v997swapAutoBuffer997
    BiliClient.prefs.v997swapAutoBuffer997 = !current
    AppToast.show(this, "Swap Auto Buffer997: ${if (!current) "ON" else "OFF"}")
}

// v997: Switch Auto Tab997
internal fun PlayerActivity.showV997SwitchAutoTab997Toggle() {
    val current = BiliClient.prefs.v997switchAutoTab997
    BiliClient.prefs.v997switchAutoTab997 = !current
    AppToast.show(this, "Switch Auto Tab997: ${if (!current) "ON" else "OFF"}")
}

// v997: Symbol Auto Encode997
internal fun PlayerActivity.showV997SymbolAutoEncode997Toggle() {
    val current = BiliClient.prefs.v997symbolAutoEncode997
    BiliClient.prefs.v997symbolAutoEncode997 = !current
    AppToast.show(this, "Symbol Auto Encode997: ${if (!current) "ON" else "OFF"}")
}

// v997: Sync Auto Cloud997
internal fun PlayerActivity.showV997SyncAutoCloud997Toggle() {
    val current = BiliClient.prefs.v997syncAutoCloud997
    BiliClient.prefs.v997syncAutoCloud997 = !current
    AppToast.show(this, "Sync Auto Cloud997: ${if (!current) "ON" else "OFF"}")
}

// v997: System Auto Optimize997
internal fun PlayerActivity.showV997SystemAutoOptimize997Toggle() {
    val current = BiliClient.prefs.v997systemAutoOptimize997
    BiliClient.prefs.v997systemAutoOptimize997 = !current
    AppToast.show(this, "System Auto Optimize997: ${if (!current) "ON" else "OFF"}")
}

// v998: Structure Auto Schema998
internal fun PlayerActivity.showV998StructureAutoSchema998Toggle() {
    val current = BiliClient.prefs.v998structureAutoSchema998
    BiliClient.prefs.v998structureAutoSchema998 = !current
    AppToast.show(this, "Structure Auto Schema998: ${if (!current) "ON" else "OFF"}")
}

// v998: Style Auto Theme998
internal fun PlayerActivity.showV998StyleAutoTheme998Toggle() {
    val current = BiliClient.prefs.v998styleAutoTheme998
    BiliClient.prefs.v998styleAutoTheme998 = !current
    AppToast.show(this, "Style Auto Theme998: ${if (!current) "ON" else "OFF"}")
}

// v998: Sub Auto Title998
internal fun PlayerActivity.showV998SubAutoTitle998Toggle() {
    val current = BiliClient.prefs.v998subAutoTitle998
    BiliClient.prefs.v998subAutoTitle998 = !current
    AppToast.show(this, "Sub Auto Title998: ${if (!current) "ON" else "OFF"}")
}

// v998: Submit Auto Form998
internal fun PlayerActivity.showV998SubmitAutoForm998Toggle() {
    val current = BiliClient.prefs.v998submitAutoForm998
    BiliClient.prefs.v998submitAutoForm998 = !current
    AppToast.show(this, "Submit Auto Form998: ${if (!current) "ON" else "OFF"}")
}

// v998: Subscribe Auto Push998
internal fun PlayerActivity.showV998SubscribeAutoPush998Toggle() {
    val current = BiliClient.prefs.v998subscribeAutoPush998
    BiliClient.prefs.v998subscribeAutoPush998 = !current
    AppToast.show(this, "Subscribe Auto Push998: ${if (!current) "ON" else "OFF"}")
}

// v998: Success Auto Toast998
internal fun PlayerActivity.showV998SuccessAutoToast998Toggle() {
    val current = BiliClient.prefs.v998successAutoToast998
    BiliClient.prefs.v998successAutoToast998 = !current
    AppToast.show(this, "Success Auto Toast998: ${if (!current) "ON" else "OFF"}")
}

// v998: Suffix Auto Trim998
internal fun PlayerActivity.showV998SuffixAutoTrim998Toggle() {
    val current = BiliClient.prefs.v998suffixAutoTrim998
    BiliClient.prefs.v998suffixAutoTrim998 = !current
    AppToast.show(this, "Suffix Auto Trim998: ${if (!current) "ON" else "OFF"}")
}

// v998: Sum Auto Aggregate998
internal fun PlayerActivity.showV998SumAutoAggregate998Toggle() {
    val current = BiliClient.prefs.v998sumAutoAggregate998
    BiliClient.prefs.v998sumAutoAggregate998 = !current
    AppToast.show(this, "Sum Auto Aggregate998: ${if (!current) "ON" else "OFF"}")
}

// v998: Summary Auto Generate998
internal fun PlayerActivity.showV998SummaryAutoGenerate998Toggle() {
    val current = BiliClient.prefs.v998summaryAutoGenerate998
    BiliClient.prefs.v998summaryAutoGenerate998 = !current
    AppToast.show(this, "Summary Auto Generate998: ${if (!current) "ON" else "OFF"}")
}

// v998: Support Auto Detect998
internal fun PlayerActivity.showV998SupportAutoDetect998Toggle() {
    val current = BiliClient.prefs.v998supportAutoDetect998
    BiliClient.prefs.v998supportAutoDetect998 = !current
    AppToast.show(this, "Support Auto Detect998: ${if (!current) "ON" else "OFF"}")
}

// v998: Swap Auto Buffer998
internal fun PlayerActivity.showV998SwapAutoBuffer998Toggle() {
    val current = BiliClient.prefs.v998swapAutoBuffer998
    BiliClient.prefs.v998swapAutoBuffer998 = !current
    AppToast.show(this, "Swap Auto Buffer998: ${if (!current) "ON" else "OFF"}")
}

// v998: Switch Auto Tab998
internal fun PlayerActivity.showV998SwitchAutoTab998Toggle() {
    val current = BiliClient.prefs.v998switchAutoTab998
    BiliClient.prefs.v998switchAutoTab998 = !current
    AppToast.show(this, "Switch Auto Tab998: ${if (!current) "ON" else "OFF"}")
}

// v998: Symbol Auto Encode998
internal fun PlayerActivity.showV998SymbolAutoEncode998Toggle() {
    val current = BiliClient.prefs.v998symbolAutoEncode998
    BiliClient.prefs.v998symbolAutoEncode998 = !current
    AppToast.show(this, "Symbol Auto Encode998: ${if (!current) "ON" else "OFF"}")
}

// v998: Sync Auto Cloud998
internal fun PlayerActivity.showV998SyncAutoCloud998Toggle() {
    val current = BiliClient.prefs.v998syncAutoCloud998
    BiliClient.prefs.v998syncAutoCloud998 = !current
    AppToast.show(this, "Sync Auto Cloud998: ${if (!current) "ON" else "OFF"}")
}

// v998: System Auto Optimize998
internal fun PlayerActivity.showV998SystemAutoOptimize998Toggle() {
    val current = BiliClient.prefs.v998systemAutoOptimize998
    BiliClient.prefs.v998systemAutoOptimize998 = !current
    AppToast.show(this, "System Auto Optimize998: ${if (!current) "ON" else "OFF"}")
}

// v999: Structure Auto Schema999
internal fun PlayerActivity.showV999StructureAutoSchema999Toggle() {
    val current = BiliClient.prefs.v999structureAutoSchema999
    BiliClient.prefs.v999structureAutoSchema999 = !current
    AppToast.show(this, "Structure Auto Schema999: ${if (!current) "ON" else "OFF"}")
}

// v999: Style Auto Theme999
internal fun PlayerActivity.showV999StyleAutoTheme999Toggle() {
    val current = BiliClient.prefs.v999styleAutoTheme999
    BiliClient.prefs.v999styleAutoTheme999 = !current
    AppToast.show(this, "Style Auto Theme999: ${if (!current) "ON" else "OFF"}")
}

// v999: Sub Auto Title999
internal fun PlayerActivity.showV999SubAutoTitle999Toggle() {
    val current = BiliClient.prefs.v999subAutoTitle999
    BiliClient.prefs.v999subAutoTitle999 = !current
    AppToast.show(this, "Sub Auto Title999: ${if (!current) "ON" else "OFF"}")
}

// v999: Submit Auto Form999
internal fun PlayerActivity.showV999SubmitAutoForm999Toggle() {
    val current = BiliClient.prefs.v999submitAutoForm999
    BiliClient.prefs.v999submitAutoForm999 = !current
    AppToast.show(this, "Submit Auto Form999: ${if (!current) "ON" else "OFF"}")
}

// v999: Subscribe Auto Push999
internal fun PlayerActivity.showV999SubscribeAutoPush999Toggle() {
    val current = BiliClient.prefs.v999subscribeAutoPush999
    BiliClient.prefs.v999subscribeAutoPush999 = !current
    AppToast.show(this, "Subscribe Auto Push999: ${if (!current) "ON" else "OFF"}")
}

// v999: Success Auto Toast999
internal fun PlayerActivity.showV999SuccessAutoToast999Toggle() {
    val current = BiliClient.prefs.v999successAutoToast999
    BiliClient.prefs.v999successAutoToast999 = !current
    AppToast.show(this, "Success Auto Toast999: ${if (!current) "ON" else "OFF"}")
}

// v999: Suffix Auto Trim999
internal fun PlayerActivity.showV999SuffixAutoTrim999Toggle() {
    val current = BiliClient.prefs.v999suffixAutoTrim999
    BiliClient.prefs.v999suffixAutoTrim999 = !current
    AppToast.show(this, "Suffix Auto Trim999: ${if (!current) "ON" else "OFF"}")
}

// v999: Sum Auto Aggregate999
internal fun PlayerActivity.showV999SumAutoAggregate999Toggle() {
    val current = BiliClient.prefs.v999sumAutoAggregate999
    BiliClient.prefs.v999sumAutoAggregate999 = !current
    AppToast.show(this, "Sum Auto Aggregate999: ${if (!current) "ON" else "OFF"}")
}

// v999: Summary Auto Generate999
internal fun PlayerActivity.showV999SummaryAutoGenerate999Toggle() {
    val current = BiliClient.prefs.v999summaryAutoGenerate999
    BiliClient.prefs.v999summaryAutoGenerate999 = !current
    AppToast.show(this, "Summary Auto Generate999: ${if (!current) "ON" else "OFF"}")
}

// v999: Support Auto Detect999
internal fun PlayerActivity.showV999SupportAutoDetect999Toggle() {
    val current = BiliClient.prefs.v999supportAutoDetect999
    BiliClient.prefs.v999supportAutoDetect999 = !current
    AppToast.show(this, "Support Auto Detect999: ${if (!current) "ON" else "OFF"}")
}

// v999: Swap Auto Buffer999
internal fun PlayerActivity.showV999SwapAutoBuffer999Toggle() {
    val current = BiliClient.prefs.v999swapAutoBuffer999
    BiliClient.prefs.v999swapAutoBuffer999 = !current
    AppToast.show(this, "Swap Auto Buffer999: ${if (!current) "ON" else "OFF"}")
}

// v999: Switch Auto Tab999
internal fun PlayerActivity.showV999SwitchAutoTab999Toggle() {
    val current = BiliClient.prefs.v999switchAutoTab999
    BiliClient.prefs.v999switchAutoTab999 = !current
    AppToast.show(this, "Switch Auto Tab999: ${if (!current) "ON" else "OFF"}")
}

// v999: Symbol Auto Encode999
internal fun PlayerActivity.showV999SymbolAutoEncode999Toggle() {
    val current = BiliClient.prefs.v999symbolAutoEncode999
    BiliClient.prefs.v999symbolAutoEncode999 = !current
    AppToast.show(this, "Symbol Auto Encode999: ${if (!current) "ON" else "OFF"}")
}

// v999: Sync Auto Cloud999
internal fun PlayerActivity.showV999SyncAutoCloud999Toggle() {
    val current = BiliClient.prefs.v999syncAutoCloud999
    BiliClient.prefs.v999syncAutoCloud999 = !current
    AppToast.show(this, "Sync Auto Cloud999: ${if (!current) "ON" else "OFF"}")
}

// v999: System Auto Optimize999
internal fun PlayerActivity.showV999SystemAutoOptimize999Toggle() {
    val current = BiliClient.prefs.v999systemAutoOptimize999
    BiliClient.prefs.v999systemAutoOptimize999 = !current
    AppToast.show(this, "System Auto Optimize999: ${if (!current) "ON" else "OFF"}")
}

// v1000: Structure Auto Schema1000
internal fun PlayerActivity.showV1000StructureAutoSchema1000Toggle() {
    val current = BiliClient.prefs.v1000structureAutoSchema1000
    BiliClient.prefs.v1000structureAutoSchema1000 = !current
    AppToast.show(this, "Structure Auto Schema1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Style Auto Theme1000
internal fun PlayerActivity.showV1000StyleAutoTheme1000Toggle() {
    val current = BiliClient.prefs.v1000styleAutoTheme1000
    BiliClient.prefs.v1000styleAutoTheme1000 = !current
    AppToast.show(this, "Style Auto Theme1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Sub Auto Title1000
internal fun PlayerActivity.showV1000SubAutoTitle1000Toggle() {
    val current = BiliClient.prefs.v1000subAutoTitle1000
    BiliClient.prefs.v1000subAutoTitle1000 = !current
    AppToast.show(this, "Sub Auto Title1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Submit Auto Form1000
internal fun PlayerActivity.showV1000SubmitAutoForm1000Toggle() {
    val current = BiliClient.prefs.v1000submitAutoForm1000
    BiliClient.prefs.v1000submitAutoForm1000 = !current
    AppToast.show(this, "Submit Auto Form1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Subscribe Auto Push1000
internal fun PlayerActivity.showV1000SubscribeAutoPush1000Toggle() {
    val current = BiliClient.prefs.v1000subscribeAutoPush1000
    BiliClient.prefs.v1000subscribeAutoPush1000 = !current
    AppToast.show(this, "Subscribe Auto Push1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Success Auto Toast1000
internal fun PlayerActivity.showV1000SuccessAutoToast1000Toggle() {
    val current = BiliClient.prefs.v1000successAutoToast1000
    BiliClient.prefs.v1000successAutoToast1000 = !current
    AppToast.show(this, "Success Auto Toast1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Suffix Auto Trim1000
internal fun PlayerActivity.showV1000SuffixAutoTrim1000Toggle() {
    val current = BiliClient.prefs.v1000suffixAutoTrim1000
    BiliClient.prefs.v1000suffixAutoTrim1000 = !current
    AppToast.show(this, "Suffix Auto Trim1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Sum Auto Aggregate1000
internal fun PlayerActivity.showV1000SumAutoAggregate1000Toggle() {
    val current = BiliClient.prefs.v1000sumAutoAggregate1000
    BiliClient.prefs.v1000sumAutoAggregate1000 = !current
    AppToast.show(this, "Sum Auto Aggregate1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Summary Auto Generate1000
internal fun PlayerActivity.showV1000SummaryAutoGenerate1000Toggle() {
    val current = BiliClient.prefs.v1000summaryAutoGenerate1000
    BiliClient.prefs.v1000summaryAutoGenerate1000 = !current
    AppToast.show(this, "Summary Auto Generate1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Support Auto Detect1000
internal fun PlayerActivity.showV1000SupportAutoDetect1000Toggle() {
    val current = BiliClient.prefs.v1000supportAutoDetect1000
    BiliClient.prefs.v1000supportAutoDetect1000 = !current
    AppToast.show(this, "Support Auto Detect1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Swap Auto Buffer1000
internal fun PlayerActivity.showV1000SwapAutoBuffer1000Toggle() {
    val current = BiliClient.prefs.v1000swapAutoBuffer1000
    BiliClient.prefs.v1000swapAutoBuffer1000 = !current
    AppToast.show(this, "Swap Auto Buffer1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Switch Auto Tab1000
internal fun PlayerActivity.showV1000SwitchAutoTab1000Toggle() {
    val current = BiliClient.prefs.v1000switchAutoTab1000
    BiliClient.prefs.v1000switchAutoTab1000 = !current
    AppToast.show(this, "Switch Auto Tab1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Symbol Auto Encode1000
internal fun PlayerActivity.showV1000SymbolAutoEncode1000Toggle() {
    val current = BiliClient.prefs.v1000symbolAutoEncode1000
    BiliClient.prefs.v1000symbolAutoEncode1000 = !current
    AppToast.show(this, "Symbol Auto Encode1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: Sync Auto Cloud1000
internal fun PlayerActivity.showV1000SyncAutoCloud1000Toggle() {
    val current = BiliClient.prefs.v1000syncAutoCloud1000
    BiliClient.prefs.v1000syncAutoCloud1000 = !current
    AppToast.show(this, "Sync Auto Cloud1000: ${if (!current) "ON" else "OFF"}")
}

// v1000: System Auto Optimize1000
internal fun PlayerActivity.showV1000SystemAutoOptimize1000Toggle() {
    val current = BiliClient.prefs.v1000systemAutoOptimize1000
    BiliClient.prefs.v1000systemAutoOptimize1000 = !current
    AppToast.show(this, "System Auto Optimize1000: ${if (!current) "ON" else "OFF"}")
}

