package blbl.cat3399.core.prefs

import android.content.SharedPreferences
import com.tencent.mmkv.MMKV

class MmkvSharedPrefs(
    private val mmkv: MMKV,
) : SharedPreferences {
    override fun getAll(): MutableMap<String, *>? = null

    override fun getString(
        key: String?,
        defValue: String?,
    ): String? = mmkv.getString(key, defValue)

    override fun getStringSet(
        key: String?,
        defValues: MutableSet<String>?,
    ): MutableSet<String>? = mmkv.getStringSet(key, defValues)

    override fun getInt(
        key: String?,
        defValue: Int,
    ): Int = mmkv.getInt(key, defValue)

    override fun getLong(
        key: String?,
        defValue: Long,
    ): Long = mmkv.getLong(key, defValue)

    override fun getFloat(
        key: String?,
        defValue: Float,
    ): Float = mmkv.getFloat(key, defValue)

    override fun getBoolean(
        key: String?,
        defValue: Boolean,
    ): Boolean = mmkv.getBoolean(key, defValue)

    override fun contains(key: String?): Boolean = mmkv.containsKey(key!!)

    override fun edit(): SharedPreferences.Editor = MmkvEditor(mmkv)

    override fun registerOnSharedPreferenceChangeListener(
        listener: SharedPreferences.OnSharedPreferenceChangeListener?,
    ) {}

    override fun unregisterOnSharedPreferenceChangeListener(
        listener: SharedPreferences.OnSharedPreferenceChangeListener?,
    ) {}

    private class MmkvEditor(
        private val mmkv: MMKV,
    ) : SharedPreferences.Editor {
        override fun putString(
            key: String?,
            value: String?,
        ): SharedPreferences.Editor {
            mmkv.encode(key!!, value!!)
            return this
        }

        override fun putStringSet(
            key: String?,
            values: MutableSet<String>?,
        ): SharedPreferences.Editor {
            mmkv.encode(key!!, values!!)
            return this
        }

        override fun putInt(
            key: String?,
            value: Int,
        ): SharedPreferences.Editor {
            mmkv.encode(key!!, value)
            return this
        }

        override fun putLong(
            key: String?,
            value: Long,
        ): SharedPreferences.Editor {
            mmkv.encode(key!!, value)
            return this
        }

        override fun putFloat(
            key: String?,
            value: Float,
        ): SharedPreferences.Editor {
            mmkv.encode(key!!, value)
            return this
        }

        override fun putBoolean(
            key: String?,
            value: Boolean,
        ): SharedPreferences.Editor {
            mmkv.encode(key!!, value)
            return this
        }

        override fun remove(key: String?): SharedPreferences.Editor {
            mmkv.removeValueForKey(key!!)
            return this
        }

        override fun clear(): SharedPreferences.Editor {
            mmkv.clearAll()
            return this
        }

        override fun commit(): Boolean = true

        override fun apply() {}
    }
}
