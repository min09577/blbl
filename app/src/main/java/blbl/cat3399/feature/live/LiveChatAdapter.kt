package blbl.cat3399.feature.live

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import blbl.cat3399.core.ui.cloneInUserScale
import blbl.cat3399.databinding.ItemLiveChatBinding

class LiveChatAdapter : ListAdapter<LiveChatAdapter.Item, LiveChatAdapter.Vh>(DiffCallback) {
    data class Item(
        val title: String,
        val body: String,
    )

    fun submit(list: List<Item>) {
        submitList(list)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): Vh {
        val binding =
            ItemLiveChatBinding.inflate(
                LayoutInflater.from(parent.context).cloneInUserScale(parent.context),
                parent,
                false,
            )
        return Vh(binding)
    }

    override fun onBindViewHolder(
        holder: Vh,
        position: Int,
    ) = holder.bind(getItem(position))

    class Vh(
        private val binding: ItemLiveChatBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.tvTitle.text = item.title
            binding.tvBody.text = item.body
        }
    }

    companion object {
        private val DiffCallback =
            object : DiffUtil.ItemCallback<Item>() {
                override fun areItemsTheSame(
                    oldItem: Item,
                    newItem: Item,
                ): Boolean = oldItem.title == newItem.title

                override fun areContentsTheSame(
                    oldItem: Item,
                    newItem: Item,
                ): Boolean = oldItem == newItem
            }
    }
}
