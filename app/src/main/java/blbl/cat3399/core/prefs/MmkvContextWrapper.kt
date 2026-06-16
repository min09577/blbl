package blbl.cat3399.core.prefs

import android.content.Context
import android.content.ContextWrapper
import android.content.SharedPreferences
import com.tencent.mmkv.MMKV

class MmkvContextWrapper(
    base: Context,
) : ContextWrapper(base) {
    init {
        val rootDir = MMKV.initialize(base)
        android.util.Log.d("MmkvContextWrapper", "MMKV initialized at: $rootDir")
    }

    override fun getSharedPreferences(
        name: String?,
        mode: Int,
    ): SharedPreferences {
        val sp = super.getSharedPreferences(name, mode)
        if (name != "blbl_prefs") return sp
        val mmkv = MMKV.mmkvWithID(name)
        if (mmkv.count() == 0L) migrateLegacyPrefs(sp, mmkv)
        return MmkvSharedPrefs(mmkv)
    }

    private fun migrateLegacyPrefs(
        sp: SharedPreferences,
        mmkv: MMKV,
    ) {
        sp.all.forEach { (key, value) ->
            when (value) {
                is String -> mmkv.encode(key, value)
                is Int -> mmkv.encode(key, value)
                is Long -> mmkv.encode(key, value)
                is Float -> mmkv.encode(key, value)
                is Boolean -> mmkv.encode(key, value)
                is Set<*> ->
                    @Suppress("UNCHECKED_CAST")
                    mmkv.encode(key, value as Set<String>)
            }
        }
    }
}
