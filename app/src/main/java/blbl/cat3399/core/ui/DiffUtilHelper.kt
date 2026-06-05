package blbl.cat3399.core.ui

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

/**
 * v4.1: DiffUtil 辅助工具，用于高效更新 RecyclerView
 */
object DiffUtilHelper {

    /**
     * 使用 DiffUtil 更新列表
     */
    fun <T> updateList(
        adapter: RecyclerView.Adapter<*>,
        oldList: List<T>,
        newList: List<T>,
        areItemsTheSame: (oldItem: T, newItem: T) -> Boolean,
        areContentsTheSame: (oldItem: T, newItem: T) -> Boolean = { old, new -> old == new }
    ) {
        val diffCallback = object : DiffUtil.Callback() {
            override fun getOldListSize() = oldList.size
            override fun getNewListSize() = newList.size
            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                areItemsTheSame(oldList[oldItemPosition], newList[newItemPosition])
            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
                areContentsTheSame(oldList[oldItemPosition], newList[newItemPosition])
        }
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        diffResult.dispatchUpdatesTo(adapter)
    }
}
