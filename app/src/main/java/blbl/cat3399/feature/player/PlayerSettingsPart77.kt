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

// v951: Sequence Auto Order951
internal fun PlayerActivity.showV951SequenceAutoOrder951Toggle() {
    val current = BiliClient.prefs.v951sequenceAutoOrder951
    BiliClient.prefs.v951sequenceAutoOrder951 = !current
    AppToast.show(this, "Sequence Auto Order951: ${if (!current) "ON" else "OFF"}")
}

// v951: Serial Auto Port951
internal fun PlayerActivity.showV951SerialAutoPort951Toggle() {
    val current = BiliClient.prefs.v951serialAutoPort951
    BiliClient.prefs.v951serialAutoPort951 = !current
    AppToast.show(this, "Serial Auto Port951: ${if (!current) "ON" else "OFF"}")
}

// v951: Server Auto Load951
internal fun PlayerActivity.showV951ServerAutoLoad951Toggle() {
    val current = BiliClient.prefs.v951serverAutoLoad951
    BiliClient.prefs.v951serverAutoLoad951 = !current
    AppToast.show(this, "Server Auto Load951: ${if (!current) "ON" else "OFF"}")
}

// v951: Service Auto Bind951
internal fun PlayerActivity.showV951ServiceAutoBind951Toggle() {
    val current = BiliClient.prefs.v951serviceAutoBind951
    BiliClient.prefs.v951serviceAutoBind951 = !current
    AppToast.show(this, "Service Auto Bind951: ${if (!current) "ON" else "OFF"}")
}

// v951: Session Auto Restore951
internal fun PlayerActivity.showV951SessionAutoRestore951Toggle() {
    val current = BiliClient.prefs.v951sessionAutoRestore951
    BiliClient.prefs.v951sessionAutoRestore951 = !current
    AppToast.show(this, "Session Auto Restore951: ${if (!current) "ON" else "OFF"}")
}

// v951: Set Auto Default951
internal fun PlayerActivity.showV951SetAutoDefault951Toggle() {
    val current = BiliClient.prefs.v951setAutoDefault951
    BiliClient.prefs.v951setAutoDefault951 = !current
    AppToast.show(this, "Set Auto Default951: ${if (!current) "ON" else "OFF"}")
}

// v951: Setting Auto Export951
internal fun PlayerActivity.showV951SettingAutoExport951Toggle() {
    val current = BiliClient.prefs.v951settingAutoExport951
    BiliClient.prefs.v951settingAutoExport951 = !current
    AppToast.show(this, "Setting Auto Export951: ${if (!current) "ON" else "OFF"}")
}

// v951: Setup Auto Wizard951
internal fun PlayerActivity.showV951SetupAutoWizard951Toggle() {
    val current = BiliClient.prefs.v951setupAutoWizard951
    BiliClient.prefs.v951setupAutoWizard951 = !current
    AppToast.show(this, "Setup Auto Wizard951: ${if (!current) "ON" else "OFF"}")
}

// v951: Shadow Auto Elevation951
internal fun PlayerActivity.showV951ShadowAutoElevation951Toggle() {
    val current = BiliClient.prefs.v951shadowAutoElevation951
    BiliClient.prefs.v951shadowAutoElevation951 = !current
    AppToast.show(this, "Shadow Auto Elevation951: ${if (!current) "ON" else "OFF"}")
}

// v951: Shape Auto Morph951
internal fun PlayerActivity.showV951ShapeAutoMorph951Toggle() {
    val current = BiliClient.prefs.v951shapeAutoMorph951
    BiliClient.prefs.v951shapeAutoMorph951 = !current
    AppToast.show(this, "Shape Auto Morph951: ${if (!current) "ON" else "OFF"}")
}

// v951: Share Auto Clipboard951
internal fun PlayerActivity.showV951ShareAutoClipboard951Toggle() {
    val current = BiliClient.prefs.v951shareAutoClipboard951
    BiliClient.prefs.v951shareAutoClipboard951 = !current
    AppToast.show(this, "Share Auto Clipboard951: ${if (!current) "ON" else "OFF"}")
}

// v951: Sharp Auto Contrast951
internal fun PlayerActivity.showV951SharpAutoContrast951Toggle() {
    val current = BiliClient.prefs.v951sharpAutoContrast951
    BiliClient.prefs.v951sharpAutoContrast951 = !current
    AppToast.show(this, "Sharp Auto Contrast951: ${if (!current) "ON" else "OFF"}")
}

// v951: Shift Auto Timestamp951
internal fun PlayerActivity.showV951ShiftAutoTimestamp951Toggle() {
    val current = BiliClient.prefs.v951shiftAutoTimestamp951
    BiliClient.prefs.v951shiftAutoTimestamp951 = !current
    AppToast.show(this, "Shift Auto Timestamp951: ${if (!current) "ON" else "OFF"}")
}

// v951: Show Auto Animation951
internal fun PlayerActivity.showV951ShowAutoAnimation951Toggle() {
    val current = BiliClient.prefs.v951showAutoAnimation951
    BiliClient.prefs.v951showAutoAnimation951 = !current
    AppToast.show(this, "Show Auto Animation951: ${if (!current) "ON" else "OFF"}")
}

// v951: Shrink Auto Collapse951
internal fun PlayerActivity.showV951ShrinkAutoCollapse951Toggle() {
    val current = BiliClient.prefs.v951shrinkAutoCollapse951
    BiliClient.prefs.v951shrinkAutoCollapse951 = !current
    AppToast.show(this, "Shrink Auto Collapse951: ${if (!current) "ON" else "OFF"}")
}

// v952: Sequence Auto Order952
internal fun PlayerActivity.showV952SequenceAutoOrder952Toggle() {
    val current = BiliClient.prefs.v952sequenceAutoOrder952
    BiliClient.prefs.v952sequenceAutoOrder952 = !current
    AppToast.show(this, "Sequence Auto Order952: ${if (!current) "ON" else "OFF"}")
}

// v952: Serial Auto Port952
internal fun PlayerActivity.showV952SerialAutoPort952Toggle() {
    val current = BiliClient.prefs.v952serialAutoPort952
    BiliClient.prefs.v952serialAutoPort952 = !current
    AppToast.show(this, "Serial Auto Port952: ${if (!current) "ON" else "OFF"}")
}

// v952: Server Auto Load952
internal fun PlayerActivity.showV952ServerAutoLoad952Toggle() {
    val current = BiliClient.prefs.v952serverAutoLoad952
    BiliClient.prefs.v952serverAutoLoad952 = !current
    AppToast.show(this, "Server Auto Load952: ${if (!current) "ON" else "OFF"}")
}

// v952: Service Auto Bind952
internal fun PlayerActivity.showV952ServiceAutoBind952Toggle() {
    val current = BiliClient.prefs.v952serviceAutoBind952
    BiliClient.prefs.v952serviceAutoBind952 = !current
    AppToast.show(this, "Service Auto Bind952: ${if (!current) "ON" else "OFF"}")
}

// v952: Session Auto Restore952
internal fun PlayerActivity.showV952SessionAutoRestore952Toggle() {
    val current = BiliClient.prefs.v952sessionAutoRestore952
    BiliClient.prefs.v952sessionAutoRestore952 = !current
    AppToast.show(this, "Session Auto Restore952: ${if (!current) "ON" else "OFF"}")
}

// v952: Set Auto Default952
internal fun PlayerActivity.showV952SetAutoDefault952Toggle() {
    val current = BiliClient.prefs.v952setAutoDefault952
    BiliClient.prefs.v952setAutoDefault952 = !current
    AppToast.show(this, "Set Auto Default952: ${if (!current) "ON" else "OFF"}")
}

// v952: Setting Auto Export952
internal fun PlayerActivity.showV952SettingAutoExport952Toggle() {
    val current = BiliClient.prefs.v952settingAutoExport952
    BiliClient.prefs.v952settingAutoExport952 = !current
    AppToast.show(this, "Setting Auto Export952: ${if (!current) "ON" else "OFF"}")
}

// v952: Setup Auto Wizard952
internal fun PlayerActivity.showV952SetupAutoWizard952Toggle() {
    val current = BiliClient.prefs.v952setupAutoWizard952
    BiliClient.prefs.v952setupAutoWizard952 = !current
    AppToast.show(this, "Setup Auto Wizard952: ${if (!current) "ON" else "OFF"}")
}

// v952: Shadow Auto Elevation952
internal fun PlayerActivity.showV952ShadowAutoElevation952Toggle() {
    val current = BiliClient.prefs.v952shadowAutoElevation952
    BiliClient.prefs.v952shadowAutoElevation952 = !current
    AppToast.show(this, "Shadow Auto Elevation952: ${if (!current) "ON" else "OFF"}")
}

// v952: Shape Auto Morph952
internal fun PlayerActivity.showV952ShapeAutoMorph952Toggle() {
    val current = BiliClient.prefs.v952shapeAutoMorph952
    BiliClient.prefs.v952shapeAutoMorph952 = !current
    AppToast.show(this, "Shape Auto Morph952: ${if (!current) "ON" else "OFF"}")
}

// v952: Share Auto Clipboard952
internal fun PlayerActivity.showV952ShareAutoClipboard952Toggle() {
    val current = BiliClient.prefs.v952shareAutoClipboard952
    BiliClient.prefs.v952shareAutoClipboard952 = !current
    AppToast.show(this, "Share Auto Clipboard952: ${if (!current) "ON" else "OFF"}")
}

// v952: Sharp Auto Contrast952
internal fun PlayerActivity.showV952SharpAutoContrast952Toggle() {
    val current = BiliClient.prefs.v952sharpAutoContrast952
    BiliClient.prefs.v952sharpAutoContrast952 = !current
    AppToast.show(this, "Sharp Auto Contrast952: ${if (!current) "ON" else "OFF"}")
}

// v952: Shift Auto Timestamp952
internal fun PlayerActivity.showV952ShiftAutoTimestamp952Toggle() {
    val current = BiliClient.prefs.v952shiftAutoTimestamp952
    BiliClient.prefs.v952shiftAutoTimestamp952 = !current
    AppToast.show(this, "Shift Auto Timestamp952: ${if (!current) "ON" else "OFF"}")
}

// v952: Show Auto Animation952
internal fun PlayerActivity.showV952ShowAutoAnimation952Toggle() {
    val current = BiliClient.prefs.v952showAutoAnimation952
    BiliClient.prefs.v952showAutoAnimation952 = !current
    AppToast.show(this, "Show Auto Animation952: ${if (!current) "ON" else "OFF"}")
}

// v952: Shrink Auto Collapse952
internal fun PlayerActivity.showV952ShrinkAutoCollapse952Toggle() {
    val current = BiliClient.prefs.v952shrinkAutoCollapse952
    BiliClient.prefs.v952shrinkAutoCollapse952 = !current
    AppToast.show(this, "Shrink Auto Collapse952: ${if (!current) "ON" else "OFF"}")
}

// v953: Sequence Auto Order953
internal fun PlayerActivity.showV953SequenceAutoOrder953Toggle() {
    val current = BiliClient.prefs.v953sequenceAutoOrder953
    BiliClient.prefs.v953sequenceAutoOrder953 = !current
    AppToast.show(this, "Sequence Auto Order953: ${if (!current) "ON" else "OFF"}")
}

// v953: Serial Auto Port953
internal fun PlayerActivity.showV953SerialAutoPort953Toggle() {
    val current = BiliClient.prefs.v953serialAutoPort953
    BiliClient.prefs.v953serialAutoPort953 = !current
    AppToast.show(this, "Serial Auto Port953: ${if (!current) "ON" else "OFF"}")
}

// v953: Server Auto Load953
internal fun PlayerActivity.showV953ServerAutoLoad953Toggle() {
    val current = BiliClient.prefs.v953serverAutoLoad953
    BiliClient.prefs.v953serverAutoLoad953 = !current
    AppToast.show(this, "Server Auto Load953: ${if (!current) "ON" else "OFF"}")
}

// v953: Service Auto Bind953
internal fun PlayerActivity.showV953ServiceAutoBind953Toggle() {
    val current = BiliClient.prefs.v953serviceAutoBind953
    BiliClient.prefs.v953serviceAutoBind953 = !current
    AppToast.show(this, "Service Auto Bind953: ${if (!current) "ON" else "OFF"}")
}

// v953: Session Auto Restore953
internal fun PlayerActivity.showV953SessionAutoRestore953Toggle() {
    val current = BiliClient.prefs.v953sessionAutoRestore953
    BiliClient.prefs.v953sessionAutoRestore953 = !current
    AppToast.show(this, "Session Auto Restore953: ${if (!current) "ON" else "OFF"}")
}

// v953: Set Auto Default953
internal fun PlayerActivity.showV953SetAutoDefault953Toggle() {
    val current = BiliClient.prefs.v953setAutoDefault953
    BiliClient.prefs.v953setAutoDefault953 = !current
    AppToast.show(this, "Set Auto Default953: ${if (!current) "ON" else "OFF"}")
}

// v953: Setting Auto Export953
internal fun PlayerActivity.showV953SettingAutoExport953Toggle() {
    val current = BiliClient.prefs.v953settingAutoExport953
    BiliClient.prefs.v953settingAutoExport953 = !current
    AppToast.show(this, "Setting Auto Export953: ${if (!current) "ON" else "OFF"}")
}

// v953: Setup Auto Wizard953
internal fun PlayerActivity.showV953SetupAutoWizard953Toggle() {
    val current = BiliClient.prefs.v953setupAutoWizard953
    BiliClient.prefs.v953setupAutoWizard953 = !current
    AppToast.show(this, "Setup Auto Wizard953: ${if (!current) "ON" else "OFF"}")
}

// v953: Shadow Auto Elevation953
internal fun PlayerActivity.showV953ShadowAutoElevation953Toggle() {
    val current = BiliClient.prefs.v953shadowAutoElevation953
    BiliClient.prefs.v953shadowAutoElevation953 = !current
    AppToast.show(this, "Shadow Auto Elevation953: ${if (!current) "ON" else "OFF"}")
}

// v953: Shape Auto Morph953
internal fun PlayerActivity.showV953ShapeAutoMorph953Toggle() {
    val current = BiliClient.prefs.v953shapeAutoMorph953
    BiliClient.prefs.v953shapeAutoMorph953 = !current
    AppToast.show(this, "Shape Auto Morph953: ${if (!current) "ON" else "OFF"}")
}

// v953: Share Auto Clipboard953
internal fun PlayerActivity.showV953ShareAutoClipboard953Toggle() {
    val current = BiliClient.prefs.v953shareAutoClipboard953
    BiliClient.prefs.v953shareAutoClipboard953 = !current
    AppToast.show(this, "Share Auto Clipboard953: ${if (!current) "ON" else "OFF"}")
}

// v953: Sharp Auto Contrast953
internal fun PlayerActivity.showV953SharpAutoContrast953Toggle() {
    val current = BiliClient.prefs.v953sharpAutoContrast953
    BiliClient.prefs.v953sharpAutoContrast953 = !current
    AppToast.show(this, "Sharp Auto Contrast953: ${if (!current) "ON" else "OFF"}")
}

// v953: Shift Auto Timestamp953
internal fun PlayerActivity.showV953ShiftAutoTimestamp953Toggle() {
    val current = BiliClient.prefs.v953shiftAutoTimestamp953
    BiliClient.prefs.v953shiftAutoTimestamp953 = !current
    AppToast.show(this, "Shift Auto Timestamp953: ${if (!current) "ON" else "OFF"}")
}

// v953: Show Auto Animation953
internal fun PlayerActivity.showV953ShowAutoAnimation953Toggle() {
    val current = BiliClient.prefs.v953showAutoAnimation953
    BiliClient.prefs.v953showAutoAnimation953 = !current
    AppToast.show(this, "Show Auto Animation953: ${if (!current) "ON" else "OFF"}")
}

// v953: Shrink Auto Collapse953
internal fun PlayerActivity.showV953ShrinkAutoCollapse953Toggle() {
    val current = BiliClient.prefs.v953shrinkAutoCollapse953
    BiliClient.prefs.v953shrinkAutoCollapse953 = !current
    AppToast.show(this, "Shrink Auto Collapse953: ${if (!current) "ON" else "OFF"}")
}

// v954: Sequence Auto Order954
internal fun PlayerActivity.showV954SequenceAutoOrder954Toggle() {
    val current = BiliClient.prefs.v954sequenceAutoOrder954
    BiliClient.prefs.v954sequenceAutoOrder954 = !current
    AppToast.show(this, "Sequence Auto Order954: ${if (!current) "ON" else "OFF"}")
}

// v954: Serial Auto Port954
internal fun PlayerActivity.showV954SerialAutoPort954Toggle() {
    val current = BiliClient.prefs.v954serialAutoPort954
    BiliClient.prefs.v954serialAutoPort954 = !current
    AppToast.show(this, "Serial Auto Port954: ${if (!current) "ON" else "OFF"}")
}

// v954: Server Auto Load954
internal fun PlayerActivity.showV954ServerAutoLoad954Toggle() {
    val current = BiliClient.prefs.v954serverAutoLoad954
    BiliClient.prefs.v954serverAutoLoad954 = !current
    AppToast.show(this, "Server Auto Load954: ${if (!current) "ON" else "OFF"}")
}

// v954: Service Auto Bind954
internal fun PlayerActivity.showV954ServiceAutoBind954Toggle() {
    val current = BiliClient.prefs.v954serviceAutoBind954
    BiliClient.prefs.v954serviceAutoBind954 = !current
    AppToast.show(this, "Service Auto Bind954: ${if (!current) "ON" else "OFF"}")
}

// v954: Session Auto Restore954
internal fun PlayerActivity.showV954SessionAutoRestore954Toggle() {
    val current = BiliClient.prefs.v954sessionAutoRestore954
    BiliClient.prefs.v954sessionAutoRestore954 = !current
    AppToast.show(this, "Session Auto Restore954: ${if (!current) "ON" else "OFF"}")
}

// v954: Set Auto Default954
internal fun PlayerActivity.showV954SetAutoDefault954Toggle() {
    val current = BiliClient.prefs.v954setAutoDefault954
    BiliClient.prefs.v954setAutoDefault954 = !current
    AppToast.show(this, "Set Auto Default954: ${if (!current) "ON" else "OFF"}")
}

// v954: Setting Auto Export954
internal fun PlayerActivity.showV954SettingAutoExport954Toggle() {
    val current = BiliClient.prefs.v954settingAutoExport954
    BiliClient.prefs.v954settingAutoExport954 = !current
    AppToast.show(this, "Setting Auto Export954: ${if (!current) "ON" else "OFF"}")
}

// v954: Setup Auto Wizard954
internal fun PlayerActivity.showV954SetupAutoWizard954Toggle() {
    val current = BiliClient.prefs.v954setupAutoWizard954
    BiliClient.prefs.v954setupAutoWizard954 = !current
    AppToast.show(this, "Setup Auto Wizard954: ${if (!current) "ON" else "OFF"}")
}

// v954: Shadow Auto Elevation954
internal fun PlayerActivity.showV954ShadowAutoElevation954Toggle() {
    val current = BiliClient.prefs.v954shadowAutoElevation954
    BiliClient.prefs.v954shadowAutoElevation954 = !current
    AppToast.show(this, "Shadow Auto Elevation954: ${if (!current) "ON" else "OFF"}")
}

// v954: Shape Auto Morph954
internal fun PlayerActivity.showV954ShapeAutoMorph954Toggle() {
    val current = BiliClient.prefs.v954shapeAutoMorph954
    BiliClient.prefs.v954shapeAutoMorph954 = !current
    AppToast.show(this, "Shape Auto Morph954: ${if (!current) "ON" else "OFF"}")
}

// v954: Share Auto Clipboard954
internal fun PlayerActivity.showV954ShareAutoClipboard954Toggle() {
    val current = BiliClient.prefs.v954shareAutoClipboard954
    BiliClient.prefs.v954shareAutoClipboard954 = !current
    AppToast.show(this, "Share Auto Clipboard954: ${if (!current) "ON" else "OFF"}")
}

// v954: Sharp Auto Contrast954
internal fun PlayerActivity.showV954SharpAutoContrast954Toggle() {
    val current = BiliClient.prefs.v954sharpAutoContrast954
    BiliClient.prefs.v954sharpAutoContrast954 = !current
    AppToast.show(this, "Sharp Auto Contrast954: ${if (!current) "ON" else "OFF"}")
}

// v954: Shift Auto Timestamp954
internal fun PlayerActivity.showV954ShiftAutoTimestamp954Toggle() {
    val current = BiliClient.prefs.v954shiftAutoTimestamp954
    BiliClient.prefs.v954shiftAutoTimestamp954 = !current
    AppToast.show(this, "Shift Auto Timestamp954: ${if (!current) "ON" else "OFF"}")
}

// v954: Show Auto Animation954
internal fun PlayerActivity.showV954ShowAutoAnimation954Toggle() {
    val current = BiliClient.prefs.v954showAutoAnimation954
    BiliClient.prefs.v954showAutoAnimation954 = !current
    AppToast.show(this, "Show Auto Animation954: ${if (!current) "ON" else "OFF"}")
}

// v954: Shrink Auto Collapse954
internal fun PlayerActivity.showV954ShrinkAutoCollapse954Toggle() {
    val current = BiliClient.prefs.v954shrinkAutoCollapse954
    BiliClient.prefs.v954shrinkAutoCollapse954 = !current
    AppToast.show(this, "Shrink Auto Collapse954: ${if (!current) "ON" else "OFF"}")
}

// v955: Sequence Auto Order955
internal fun PlayerActivity.showV955SequenceAutoOrder955Toggle() {
    val current = BiliClient.prefs.v955sequenceAutoOrder955
    BiliClient.prefs.v955sequenceAutoOrder955 = !current
    AppToast.show(this, "Sequence Auto Order955: ${if (!current) "ON" else "OFF"}")
}

// v955: Serial Auto Port955
internal fun PlayerActivity.showV955SerialAutoPort955Toggle() {
    val current = BiliClient.prefs.v955serialAutoPort955
    BiliClient.prefs.v955serialAutoPort955 = !current
    AppToast.show(this, "Serial Auto Port955: ${if (!current) "ON" else "OFF"}")
}

// v955: Server Auto Load955
internal fun PlayerActivity.showV955ServerAutoLoad955Toggle() {
    val current = BiliClient.prefs.v955serverAutoLoad955
    BiliClient.prefs.v955serverAutoLoad955 = !current
    AppToast.show(this, "Server Auto Load955: ${if (!current) "ON" else "OFF"}")
}

// v955: Service Auto Bind955
internal fun PlayerActivity.showV955ServiceAutoBind955Toggle() {
    val current = BiliClient.prefs.v955serviceAutoBind955
    BiliClient.prefs.v955serviceAutoBind955 = !current
    AppToast.show(this, "Service Auto Bind955: ${if (!current) "ON" else "OFF"}")
}

// v955: Session Auto Restore955
internal fun PlayerActivity.showV955SessionAutoRestore955Toggle() {
    val current = BiliClient.prefs.v955sessionAutoRestore955
    BiliClient.prefs.v955sessionAutoRestore955 = !current
    AppToast.show(this, "Session Auto Restore955: ${if (!current) "ON" else "OFF"}")
}

// v955: Set Auto Default955
internal fun PlayerActivity.showV955SetAutoDefault955Toggle() {
    val current = BiliClient.prefs.v955setAutoDefault955
    BiliClient.prefs.v955setAutoDefault955 = !current
    AppToast.show(this, "Set Auto Default955: ${if (!current) "ON" else "OFF"}")
}

// v955: Setting Auto Export955
internal fun PlayerActivity.showV955SettingAutoExport955Toggle() {
    val current = BiliClient.prefs.v955settingAutoExport955
    BiliClient.prefs.v955settingAutoExport955 = !current
    AppToast.show(this, "Setting Auto Export955: ${if (!current) "ON" else "OFF"}")
}

// v955: Setup Auto Wizard955
internal fun PlayerActivity.showV955SetupAutoWizard955Toggle() {
    val current = BiliClient.prefs.v955setupAutoWizard955
    BiliClient.prefs.v955setupAutoWizard955 = !current
    AppToast.show(this, "Setup Auto Wizard955: ${if (!current) "ON" else "OFF"}")
}

// v955: Shadow Auto Elevation955
internal fun PlayerActivity.showV955ShadowAutoElevation955Toggle() {
    val current = BiliClient.prefs.v955shadowAutoElevation955
    BiliClient.prefs.v955shadowAutoElevation955 = !current
    AppToast.show(this, "Shadow Auto Elevation955: ${if (!current) "ON" else "OFF"}")
}

// v955: Shape Auto Morph955
internal fun PlayerActivity.showV955ShapeAutoMorph955Toggle() {
    val current = BiliClient.prefs.v955shapeAutoMorph955
    BiliClient.prefs.v955shapeAutoMorph955 = !current
    AppToast.show(this, "Shape Auto Morph955: ${if (!current) "ON" else "OFF"}")
}

// v955: Share Auto Clipboard955
internal fun PlayerActivity.showV955ShareAutoClipboard955Toggle() {
    val current = BiliClient.prefs.v955shareAutoClipboard955
    BiliClient.prefs.v955shareAutoClipboard955 = !current
    AppToast.show(this, "Share Auto Clipboard955: ${if (!current) "ON" else "OFF"}")
}

// v955: Sharp Auto Contrast955
internal fun PlayerActivity.showV955SharpAutoContrast955Toggle() {
    val current = BiliClient.prefs.v955sharpAutoContrast955
    BiliClient.prefs.v955sharpAutoContrast955 = !current
    AppToast.show(this, "Sharp Auto Contrast955: ${if (!current) "ON" else "OFF"}")
}

// v955: Shift Auto Timestamp955
internal fun PlayerActivity.showV955ShiftAutoTimestamp955Toggle() {
    val current = BiliClient.prefs.v955shiftAutoTimestamp955
    BiliClient.prefs.v955shiftAutoTimestamp955 = !current
    AppToast.show(this, "Shift Auto Timestamp955: ${if (!current) "ON" else "OFF"}")
}

// v955: Show Auto Animation955
internal fun PlayerActivity.showV955ShowAutoAnimation955Toggle() {
    val current = BiliClient.prefs.v955showAutoAnimation955
    BiliClient.prefs.v955showAutoAnimation955 = !current
    AppToast.show(this, "Show Auto Animation955: ${if (!current) "ON" else "OFF"}")
}

// v955: Shrink Auto Collapse955
internal fun PlayerActivity.showV955ShrinkAutoCollapse955Toggle() {
    val current = BiliClient.prefs.v955shrinkAutoCollapse955
    BiliClient.prefs.v955shrinkAutoCollapse955 = !current
    AppToast.show(this, "Shrink Auto Collapse955: ${if (!current) "ON" else "OFF"}")
}

// v956: Sequence Auto Order956
internal fun PlayerActivity.showV956SequenceAutoOrder956Toggle() {
    val current = BiliClient.prefs.v956sequenceAutoOrder956
    BiliClient.prefs.v956sequenceAutoOrder956 = !current
    AppToast.show(this, "Sequence Auto Order956: ${if (!current) "ON" else "OFF"}")
}

// v956: Serial Auto Port956
internal fun PlayerActivity.showV956SerialAutoPort956Toggle() {
    val current = BiliClient.prefs.v956serialAutoPort956
    BiliClient.prefs.v956serialAutoPort956 = !current
    AppToast.show(this, "Serial Auto Port956: ${if (!current) "ON" else "OFF"}")
}

// v956: Server Auto Load956
internal fun PlayerActivity.showV956ServerAutoLoad956Toggle() {
    val current = BiliClient.prefs.v956serverAutoLoad956
    BiliClient.prefs.v956serverAutoLoad956 = !current
    AppToast.show(this, "Server Auto Load956: ${if (!current) "ON" else "OFF"}")
}

// v956: Service Auto Bind956
internal fun PlayerActivity.showV956ServiceAutoBind956Toggle() {
    val current = BiliClient.prefs.v956serviceAutoBind956
    BiliClient.prefs.v956serviceAutoBind956 = !current
    AppToast.show(this, "Service Auto Bind956: ${if (!current) "ON" else "OFF"}")
}

// v956: Session Auto Restore956
internal fun PlayerActivity.showV956SessionAutoRestore956Toggle() {
    val current = BiliClient.prefs.v956sessionAutoRestore956
    BiliClient.prefs.v956sessionAutoRestore956 = !current
    AppToast.show(this, "Session Auto Restore956: ${if (!current) "ON" else "OFF"}")
}

// v956: Set Auto Default956
internal fun PlayerActivity.showV956SetAutoDefault956Toggle() {
    val current = BiliClient.prefs.v956setAutoDefault956
    BiliClient.prefs.v956setAutoDefault956 = !current
    AppToast.show(this, "Set Auto Default956: ${if (!current) "ON" else "OFF"}")
}

// v956: Setting Auto Export956
internal fun PlayerActivity.showV956SettingAutoExport956Toggle() {
    val current = BiliClient.prefs.v956settingAutoExport956
    BiliClient.prefs.v956settingAutoExport956 = !current
    AppToast.show(this, "Setting Auto Export956: ${if (!current) "ON" else "OFF"}")
}

// v956: Setup Auto Wizard956
internal fun PlayerActivity.showV956SetupAutoWizard956Toggle() {
    val current = BiliClient.prefs.v956setupAutoWizard956
    BiliClient.prefs.v956setupAutoWizard956 = !current
    AppToast.show(this, "Setup Auto Wizard956: ${if (!current) "ON" else "OFF"}")
}

// v956: Shadow Auto Elevation956
internal fun PlayerActivity.showV956ShadowAutoElevation956Toggle() {
    val current = BiliClient.prefs.v956shadowAutoElevation956
    BiliClient.prefs.v956shadowAutoElevation956 = !current
    AppToast.show(this, "Shadow Auto Elevation956: ${if (!current) "ON" else "OFF"}")
}

// v956: Shape Auto Morph956
internal fun PlayerActivity.showV956ShapeAutoMorph956Toggle() {
    val current = BiliClient.prefs.v956shapeAutoMorph956
    BiliClient.prefs.v956shapeAutoMorph956 = !current
    AppToast.show(this, "Shape Auto Morph956: ${if (!current) "ON" else "OFF"}")
}

// v956: Share Auto Clipboard956
internal fun PlayerActivity.showV956ShareAutoClipboard956Toggle() {
    val current = BiliClient.prefs.v956shareAutoClipboard956
    BiliClient.prefs.v956shareAutoClipboard956 = !current
    AppToast.show(this, "Share Auto Clipboard956: ${if (!current) "ON" else "OFF"}")
}

// v956: Sharp Auto Contrast956
internal fun PlayerActivity.showV956SharpAutoContrast956Toggle() {
    val current = BiliClient.prefs.v956sharpAutoContrast956
    BiliClient.prefs.v956sharpAutoContrast956 = !current
    AppToast.show(this, "Sharp Auto Contrast956: ${if (!current) "ON" else "OFF"}")
}

// v956: Shift Auto Timestamp956
internal fun PlayerActivity.showV956ShiftAutoTimestamp956Toggle() {
    val current = BiliClient.prefs.v956shiftAutoTimestamp956
    BiliClient.prefs.v956shiftAutoTimestamp956 = !current
    AppToast.show(this, "Shift Auto Timestamp956: ${if (!current) "ON" else "OFF"}")
}

// v956: Show Auto Animation956
internal fun PlayerActivity.showV956ShowAutoAnimation956Toggle() {
    val current = BiliClient.prefs.v956showAutoAnimation956
    BiliClient.prefs.v956showAutoAnimation956 = !current
    AppToast.show(this, "Show Auto Animation956: ${if (!current) "ON" else "OFF"}")
}

// v956: Shrink Auto Collapse956
internal fun PlayerActivity.showV956ShrinkAutoCollapse956Toggle() {
    val current = BiliClient.prefs.v956shrinkAutoCollapse956
    BiliClient.prefs.v956shrinkAutoCollapse956 = !current
    AppToast.show(this, "Shrink Auto Collapse956: ${if (!current) "ON" else "OFF"}")
}

// v957: Sequence Auto Order957
internal fun PlayerActivity.showV957SequenceAutoOrder957Toggle() {
    val current = BiliClient.prefs.v957sequenceAutoOrder957
    BiliClient.prefs.v957sequenceAutoOrder957 = !current
    AppToast.show(this, "Sequence Auto Order957: ${if (!current) "ON" else "OFF"}")
}

// v957: Serial Auto Port957
internal fun PlayerActivity.showV957SerialAutoPort957Toggle() {
    val current = BiliClient.prefs.v957serialAutoPort957
    BiliClient.prefs.v957serialAutoPort957 = !current
    AppToast.show(this, "Serial Auto Port957: ${if (!current) "ON" else "OFF"}")
}

// v957: Server Auto Load957
internal fun PlayerActivity.showV957ServerAutoLoad957Toggle() {
    val current = BiliClient.prefs.v957serverAutoLoad957
    BiliClient.prefs.v957serverAutoLoad957 = !current
    AppToast.show(this, "Server Auto Load957: ${if (!current) "ON" else "OFF"}")
}

// v957: Service Auto Bind957
internal fun PlayerActivity.showV957ServiceAutoBind957Toggle() {
    val current = BiliClient.prefs.v957serviceAutoBind957
    BiliClient.prefs.v957serviceAutoBind957 = !current
    AppToast.show(this, "Service Auto Bind957: ${if (!current) "ON" else "OFF"}")
}

// v957: Session Auto Restore957
internal fun PlayerActivity.showV957SessionAutoRestore957Toggle() {
    val current = BiliClient.prefs.v957sessionAutoRestore957
    BiliClient.prefs.v957sessionAutoRestore957 = !current
    AppToast.show(this, "Session Auto Restore957: ${if (!current) "ON" else "OFF"}")
}

// v957: Set Auto Default957
internal fun PlayerActivity.showV957SetAutoDefault957Toggle() {
    val current = BiliClient.prefs.v957setAutoDefault957
    BiliClient.prefs.v957setAutoDefault957 = !current
    AppToast.show(this, "Set Auto Default957: ${if (!current) "ON" else "OFF"}")
}

// v957: Setting Auto Export957
internal fun PlayerActivity.showV957SettingAutoExport957Toggle() {
    val current = BiliClient.prefs.v957settingAutoExport957
    BiliClient.prefs.v957settingAutoExport957 = !current
    AppToast.show(this, "Setting Auto Export957: ${if (!current) "ON" else "OFF"}")
}

// v957: Setup Auto Wizard957
internal fun PlayerActivity.showV957SetupAutoWizard957Toggle() {
    val current = BiliClient.prefs.v957setupAutoWizard957
    BiliClient.prefs.v957setupAutoWizard957 = !current
    AppToast.show(this, "Setup Auto Wizard957: ${if (!current) "ON" else "OFF"}")
}

// v957: Shadow Auto Elevation957
internal fun PlayerActivity.showV957ShadowAutoElevation957Toggle() {
    val current = BiliClient.prefs.v957shadowAutoElevation957
    BiliClient.prefs.v957shadowAutoElevation957 = !current
    AppToast.show(this, "Shadow Auto Elevation957: ${if (!current) "ON" else "OFF"}")
}

// v957: Shape Auto Morph957
internal fun PlayerActivity.showV957ShapeAutoMorph957Toggle() {
    val current = BiliClient.prefs.v957shapeAutoMorph957
    BiliClient.prefs.v957shapeAutoMorph957 = !current
    AppToast.show(this, "Shape Auto Morph957: ${if (!current) "ON" else "OFF"}")
}

// v957: Share Auto Clipboard957
internal fun PlayerActivity.showV957ShareAutoClipboard957Toggle() {
    val current = BiliClient.prefs.v957shareAutoClipboard957
    BiliClient.prefs.v957shareAutoClipboard957 = !current
    AppToast.show(this, "Share Auto Clipboard957: ${if (!current) "ON" else "OFF"}")
}

// v957: Sharp Auto Contrast957
internal fun PlayerActivity.showV957SharpAutoContrast957Toggle() {
    val current = BiliClient.prefs.v957sharpAutoContrast957
    BiliClient.prefs.v957sharpAutoContrast957 = !current
    AppToast.show(this, "Sharp Auto Contrast957: ${if (!current) "ON" else "OFF"}")
}

// v957: Shift Auto Timestamp957
internal fun PlayerActivity.showV957ShiftAutoTimestamp957Toggle() {
    val current = BiliClient.prefs.v957shiftAutoTimestamp957
    BiliClient.prefs.v957shiftAutoTimestamp957 = !current
    AppToast.show(this, "Shift Auto Timestamp957: ${if (!current) "ON" else "OFF"}")
}

// v957: Show Auto Animation957
internal fun PlayerActivity.showV957ShowAutoAnimation957Toggle() {
    val current = BiliClient.prefs.v957showAutoAnimation957
    BiliClient.prefs.v957showAutoAnimation957 = !current
    AppToast.show(this, "Show Auto Animation957: ${if (!current) "ON" else "OFF"}")
}

// v957: Shrink Auto Collapse957
internal fun PlayerActivity.showV957ShrinkAutoCollapse957Toggle() {
    val current = BiliClient.prefs.v957shrinkAutoCollapse957
    BiliClient.prefs.v957shrinkAutoCollapse957 = !current
    AppToast.show(this, "Shrink Auto Collapse957: ${if (!current) "ON" else "OFF"}")
}

// v958: Sequence Auto Order958
internal fun PlayerActivity.showV958SequenceAutoOrder958Toggle() {
    val current = BiliClient.prefs.v958sequenceAutoOrder958
    BiliClient.prefs.v958sequenceAutoOrder958 = !current
    AppToast.show(this, "Sequence Auto Order958: ${if (!current) "ON" else "OFF"}")
}

// v958: Serial Auto Port958
internal fun PlayerActivity.showV958SerialAutoPort958Toggle() {
    val current = BiliClient.prefs.v958serialAutoPort958
    BiliClient.prefs.v958serialAutoPort958 = !current
    AppToast.show(this, "Serial Auto Port958: ${if (!current) "ON" else "OFF"}")
}

// v958: Server Auto Load958
internal fun PlayerActivity.showV958ServerAutoLoad958Toggle() {
    val current = BiliClient.prefs.v958serverAutoLoad958
    BiliClient.prefs.v958serverAutoLoad958 = !current
    AppToast.show(this, "Server Auto Load958: ${if (!current) "ON" else "OFF"}")
}

// v958: Service Auto Bind958
internal fun PlayerActivity.showV958ServiceAutoBind958Toggle() {
    val current = BiliClient.prefs.v958serviceAutoBind958
    BiliClient.prefs.v958serviceAutoBind958 = !current
    AppToast.show(this, "Service Auto Bind958: ${if (!current) "ON" else "OFF"}")
}

// v958: Session Auto Restore958
internal fun PlayerActivity.showV958SessionAutoRestore958Toggle() {
    val current = BiliClient.prefs.v958sessionAutoRestore958
    BiliClient.prefs.v958sessionAutoRestore958 = !current
    AppToast.show(this, "Session Auto Restore958: ${if (!current) "ON" else "OFF"}")
}

// v958: Set Auto Default958
internal fun PlayerActivity.showV958SetAutoDefault958Toggle() {
    val current = BiliClient.prefs.v958setAutoDefault958
    BiliClient.prefs.v958setAutoDefault958 = !current
    AppToast.show(this, "Set Auto Default958: ${if (!current) "ON" else "OFF"}")
}

// v958: Setting Auto Export958
internal fun PlayerActivity.showV958SettingAutoExport958Toggle() {
    val current = BiliClient.prefs.v958settingAutoExport958
    BiliClient.prefs.v958settingAutoExport958 = !current
    AppToast.show(this, "Setting Auto Export958: ${if (!current) "ON" else "OFF"}")
}

// v958: Setup Auto Wizard958
internal fun PlayerActivity.showV958SetupAutoWizard958Toggle() {
    val current = BiliClient.prefs.v958setupAutoWizard958
    BiliClient.prefs.v958setupAutoWizard958 = !current
    AppToast.show(this, "Setup Auto Wizard958: ${if (!current) "ON" else "OFF"}")
}

// v958: Shadow Auto Elevation958
internal fun PlayerActivity.showV958ShadowAutoElevation958Toggle() {
    val current = BiliClient.prefs.v958shadowAutoElevation958
    BiliClient.prefs.v958shadowAutoElevation958 = !current
    AppToast.show(this, "Shadow Auto Elevation958: ${if (!current) "ON" else "OFF"}")
}

// v958: Shape Auto Morph958
internal fun PlayerActivity.showV958ShapeAutoMorph958Toggle() {
    val current = BiliClient.prefs.v958shapeAutoMorph958
    BiliClient.prefs.v958shapeAutoMorph958 = !current
    AppToast.show(this, "Shape Auto Morph958: ${if (!current) "ON" else "OFF"}")
}

// v958: Share Auto Clipboard958
internal fun PlayerActivity.showV958ShareAutoClipboard958Toggle() {
    val current = BiliClient.prefs.v958shareAutoClipboard958
    BiliClient.prefs.v958shareAutoClipboard958 = !current
    AppToast.show(this, "Share Auto Clipboard958: ${if (!current) "ON" else "OFF"}")
}

// v958: Sharp Auto Contrast958
internal fun PlayerActivity.showV958SharpAutoContrast958Toggle() {
    val current = BiliClient.prefs.v958sharpAutoContrast958
    BiliClient.prefs.v958sharpAutoContrast958 = !current
    AppToast.show(this, "Sharp Auto Contrast958: ${if (!current) "ON" else "OFF"}")
}

// v958: Shift Auto Timestamp958
internal fun PlayerActivity.showV958ShiftAutoTimestamp958Toggle() {
    val current = BiliClient.prefs.v958shiftAutoTimestamp958
    BiliClient.prefs.v958shiftAutoTimestamp958 = !current
    AppToast.show(this, "Shift Auto Timestamp958: ${if (!current) "ON" else "OFF"}")
}

// v958: Show Auto Animation958
internal fun PlayerActivity.showV958ShowAutoAnimation958Toggle() {
    val current = BiliClient.prefs.v958showAutoAnimation958
    BiliClient.prefs.v958showAutoAnimation958 = !current
    AppToast.show(this, "Show Auto Animation958: ${if (!current) "ON" else "OFF"}")
}

// v958: Shrink Auto Collapse958
internal fun PlayerActivity.showV958ShrinkAutoCollapse958Toggle() {
    val current = BiliClient.prefs.v958shrinkAutoCollapse958
    BiliClient.prefs.v958shrinkAutoCollapse958 = !current
    AppToast.show(this, "Shrink Auto Collapse958: ${if (!current) "ON" else "OFF"}")
}

// v959: Sequence Auto Order959
internal fun PlayerActivity.showV959SequenceAutoOrder959Toggle() {
    val current = BiliClient.prefs.v959sequenceAutoOrder959
    BiliClient.prefs.v959sequenceAutoOrder959 = !current
    AppToast.show(this, "Sequence Auto Order959: ${if (!current) "ON" else "OFF"}")
}

// v959: Serial Auto Port959
internal fun PlayerActivity.showV959SerialAutoPort959Toggle() {
    val current = BiliClient.prefs.v959serialAutoPort959
    BiliClient.prefs.v959serialAutoPort959 = !current
    AppToast.show(this, "Serial Auto Port959: ${if (!current) "ON" else "OFF"}")
}

// v959: Server Auto Load959
internal fun PlayerActivity.showV959ServerAutoLoad959Toggle() {
    val current = BiliClient.prefs.v959serverAutoLoad959
    BiliClient.prefs.v959serverAutoLoad959 = !current
    AppToast.show(this, "Server Auto Load959: ${if (!current) "ON" else "OFF"}")
}

// v959: Service Auto Bind959
internal fun PlayerActivity.showV959ServiceAutoBind959Toggle() {
    val current = BiliClient.prefs.v959serviceAutoBind959
    BiliClient.prefs.v959serviceAutoBind959 = !current
    AppToast.show(this, "Service Auto Bind959: ${if (!current) "ON" else "OFF"}")
}

// v959: Session Auto Restore959
internal fun PlayerActivity.showV959SessionAutoRestore959Toggle() {
    val current = BiliClient.prefs.v959sessionAutoRestore959
    BiliClient.prefs.v959sessionAutoRestore959 = !current
    AppToast.show(this, "Session Auto Restore959: ${if (!current) "ON" else "OFF"}")
}

// v959: Set Auto Default959
internal fun PlayerActivity.showV959SetAutoDefault959Toggle() {
    val current = BiliClient.prefs.v959setAutoDefault959
    BiliClient.prefs.v959setAutoDefault959 = !current
    AppToast.show(this, "Set Auto Default959: ${if (!current) "ON" else "OFF"}")
}

// v959: Setting Auto Export959
internal fun PlayerActivity.showV959SettingAutoExport959Toggle() {
    val current = BiliClient.prefs.v959settingAutoExport959
    BiliClient.prefs.v959settingAutoExport959 = !current
    AppToast.show(this, "Setting Auto Export959: ${if (!current) "ON" else "OFF"}")
}

// v959: Setup Auto Wizard959
internal fun PlayerActivity.showV959SetupAutoWizard959Toggle() {
    val current = BiliClient.prefs.v959setupAutoWizard959
    BiliClient.prefs.v959setupAutoWizard959 = !current
    AppToast.show(this, "Setup Auto Wizard959: ${if (!current) "ON" else "OFF"}")
}

// v959: Shadow Auto Elevation959
internal fun PlayerActivity.showV959ShadowAutoElevation959Toggle() {
    val current = BiliClient.prefs.v959shadowAutoElevation959
    BiliClient.prefs.v959shadowAutoElevation959 = !current
    AppToast.show(this, "Shadow Auto Elevation959: ${if (!current) "ON" else "OFF"}")
}

// v959: Shape Auto Morph959
internal fun PlayerActivity.showV959ShapeAutoMorph959Toggle() {
    val current = BiliClient.prefs.v959shapeAutoMorph959
    BiliClient.prefs.v959shapeAutoMorph959 = !current
    AppToast.show(this, "Shape Auto Morph959: ${if (!current) "ON" else "OFF"}")
}

// v959: Share Auto Clipboard959
internal fun PlayerActivity.showV959ShareAutoClipboard959Toggle() {
    val current = BiliClient.prefs.v959shareAutoClipboard959
    BiliClient.prefs.v959shareAutoClipboard959 = !current
    AppToast.show(this, "Share Auto Clipboard959: ${if (!current) "ON" else "OFF"}")
}

// v959: Sharp Auto Contrast959
internal fun PlayerActivity.showV959SharpAutoContrast959Toggle() {
    val current = BiliClient.prefs.v959sharpAutoContrast959
    BiliClient.prefs.v959sharpAutoContrast959 = !current
    AppToast.show(this, "Sharp Auto Contrast959: ${if (!current) "ON" else "OFF"}")
}

// v959: Shift Auto Timestamp959
internal fun PlayerActivity.showV959ShiftAutoTimestamp959Toggle() {
    val current = BiliClient.prefs.v959shiftAutoTimestamp959
    BiliClient.prefs.v959shiftAutoTimestamp959 = !current
    AppToast.show(this, "Shift Auto Timestamp959: ${if (!current) "ON" else "OFF"}")
}

// v959: Show Auto Animation959
internal fun PlayerActivity.showV959ShowAutoAnimation959Toggle() {
    val current = BiliClient.prefs.v959showAutoAnimation959
    BiliClient.prefs.v959showAutoAnimation959 = !current
    AppToast.show(this, "Show Auto Animation959: ${if (!current) "ON" else "OFF"}")
}

// v959: Shrink Auto Collapse959
internal fun PlayerActivity.showV959ShrinkAutoCollapse959Toggle() {
    val current = BiliClient.prefs.v959shrinkAutoCollapse959
    BiliClient.prefs.v959shrinkAutoCollapse959 = !current
    AppToast.show(this, "Shrink Auto Collapse959: ${if (!current) "ON" else "OFF"}")
}

// v960: Sequence Auto Order960
internal fun PlayerActivity.showV960SequenceAutoOrder960Toggle() {
    val current = BiliClient.prefs.v960sequenceAutoOrder960
    BiliClient.prefs.v960sequenceAutoOrder960 = !current
    AppToast.show(this, "Sequence Auto Order960: ${if (!current) "ON" else "OFF"}")
}

// v960: Serial Auto Port960
internal fun PlayerActivity.showV960SerialAutoPort960Toggle() {
    val current = BiliClient.prefs.v960serialAutoPort960
    BiliClient.prefs.v960serialAutoPort960 = !current
    AppToast.show(this, "Serial Auto Port960: ${if (!current) "ON" else "OFF"}")
}

// v960: Server Auto Load960
internal fun PlayerActivity.showV960ServerAutoLoad960Toggle() {
    val current = BiliClient.prefs.v960serverAutoLoad960
    BiliClient.prefs.v960serverAutoLoad960 = !current
    AppToast.show(this, "Server Auto Load960: ${if (!current) "ON" else "OFF"}")
}

// v960: Service Auto Bind960
internal fun PlayerActivity.showV960ServiceAutoBind960Toggle() {
    val current = BiliClient.prefs.v960serviceAutoBind960
    BiliClient.prefs.v960serviceAutoBind960 = !current
    AppToast.show(this, "Service Auto Bind960: ${if (!current) "ON" else "OFF"}")
}

// v960: Session Auto Restore960
internal fun PlayerActivity.showV960SessionAutoRestore960Toggle() {
    val current = BiliClient.prefs.v960sessionAutoRestore960
    BiliClient.prefs.v960sessionAutoRestore960 = !current
    AppToast.show(this, "Session Auto Restore960: ${if (!current) "ON" else "OFF"}")
}

// v960: Set Auto Default960
internal fun PlayerActivity.showV960SetAutoDefault960Toggle() {
    val current = BiliClient.prefs.v960setAutoDefault960
    BiliClient.prefs.v960setAutoDefault960 = !current
    AppToast.show(this, "Set Auto Default960: ${if (!current) "ON" else "OFF"}")
}

// v960: Setting Auto Export960
internal fun PlayerActivity.showV960SettingAutoExport960Toggle() {
    val current = BiliClient.prefs.v960settingAutoExport960
    BiliClient.prefs.v960settingAutoExport960 = !current
    AppToast.show(this, "Setting Auto Export960: ${if (!current) "ON" else "OFF"}")
}

// v960: Setup Auto Wizard960
internal fun PlayerActivity.showV960SetupAutoWizard960Toggle() {
    val current = BiliClient.prefs.v960setupAutoWizard960
    BiliClient.prefs.v960setupAutoWizard960 = !current
    AppToast.show(this, "Setup Auto Wizard960: ${if (!current) "ON" else "OFF"}")
}

// v960: Shadow Auto Elevation960
internal fun PlayerActivity.showV960ShadowAutoElevation960Toggle() {
    val current = BiliClient.prefs.v960shadowAutoElevation960
    BiliClient.prefs.v960shadowAutoElevation960 = !current
    AppToast.show(this, "Shadow Auto Elevation960: ${if (!current) "ON" else "OFF"}")
}

// v960: Shape Auto Morph960
internal fun PlayerActivity.showV960ShapeAutoMorph960Toggle() {
    val current = BiliClient.prefs.v960shapeAutoMorph960
    BiliClient.prefs.v960shapeAutoMorph960 = !current
    AppToast.show(this, "Shape Auto Morph960: ${if (!current) "ON" else "OFF"}")
}

// v960: Share Auto Clipboard960
internal fun PlayerActivity.showV960ShareAutoClipboard960Toggle() {
    val current = BiliClient.prefs.v960shareAutoClipboard960
    BiliClient.prefs.v960shareAutoClipboard960 = !current
    AppToast.show(this, "Share Auto Clipboard960: ${if (!current) "ON" else "OFF"}")
}

// v960: Sharp Auto Contrast960
internal fun PlayerActivity.showV960SharpAutoContrast960Toggle() {
    val current = BiliClient.prefs.v960sharpAutoContrast960
    BiliClient.prefs.v960sharpAutoContrast960 = !current
    AppToast.show(this, "Sharp Auto Contrast960: ${if (!current) "ON" else "OFF"}")
}

// v960: Shift Auto Timestamp960
internal fun PlayerActivity.showV960ShiftAutoTimestamp960Toggle() {
    val current = BiliClient.prefs.v960shiftAutoTimestamp960
    BiliClient.prefs.v960shiftAutoTimestamp960 = !current
    AppToast.show(this, "Shift Auto Timestamp960: ${if (!current) "ON" else "OFF"}")
}

// v960: Show Auto Animation960
internal fun PlayerActivity.showV960ShowAutoAnimation960Toggle() {
    val current = BiliClient.prefs.v960showAutoAnimation960
    BiliClient.prefs.v960showAutoAnimation960 = !current
    AppToast.show(this, "Show Auto Animation960: ${if (!current) "ON" else "OFF"}")
}

// v960: Shrink Auto Collapse960
internal fun PlayerActivity.showV960ShrinkAutoCollapse960Toggle() {
    val current = BiliClient.prefs.v960shrinkAutoCollapse960
    BiliClient.prefs.v960shrinkAutoCollapse960 = !current
    AppToast.show(this, "Shrink Auto Collapse960: ${if (!current) "ON" else "OFF"}")
}

