package blbl.cat3399.core.prefs

import blbl.cat3399.BlblApp

/**
 * Lazy accessor for feature preference batches.
 */
object FeaturePrefsStore {
    val batch701: FeaturePrefs701 by lazy { FeaturePrefs701(BlblApp.instance) }
}
