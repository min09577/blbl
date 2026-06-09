package blbl.cat3399.core.prefs

import blbl.cat3399.BlblApp

/**
 * Lazy accessor for feature preference batches.
 */
object FeaturePrefsStore {
    val batch701: FeaturePrefs701 by lazy { FeaturePrefs701(BlblApp.instance)     val batch711: FeaturePrefs711 by lazy { FeaturePrefs711(BlblApp.instance) }
}
    val batch711: FeaturePrefs711 by lazy { FeaturePrefs711(BlblApp.instance) }
}
