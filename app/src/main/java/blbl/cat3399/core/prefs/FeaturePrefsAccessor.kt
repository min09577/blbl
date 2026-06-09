package blbl.cat3399.core.prefs

import blbl.cat3399.BlblApp

object FeaturePrefsStore {
    val batch701: FeaturePrefs701 by lazy { FeaturePrefs701(BlblApp.instance) }
    val batch711: FeaturePrefs711 by lazy { FeaturePrefs711(BlblApp.instance) }
    val batch781: FeaturePrefs781 by lazy { FeaturePrefs781(BlblApp.instance) }
    val batch791: FeaturePrefs791 by lazy { FeaturePrefs791(BlblApp.instance) }
    val batch801: FeaturePrefs801 by lazy { FeaturePrefs801(BlblApp.instance) }
    val batch811: FeaturePrefs811 by lazy { FeaturePrefs811(BlblApp.instance) }
    val batch821: FeaturePrefs821 by lazy { FeaturePrefs821(BlblApp.instance) }
    val batch831: FeaturePrefs831 by lazy { FeaturePrefs831(BlblApp.instance) }
    val batch841: FeaturePrefs841 by lazy { FeaturePrefs841(BlblApp.instance) }
}
