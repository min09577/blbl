package blbl.cat3399.feature.player

import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import blbl.cat3399.R
import blbl.cat3399.core.emote.EmoteSpannable
import blbl.cat3399.core.image.ImageLoader
import blbl.cat3399.core.image.ImageUrl
import blbl.cat3399.core.note.NoteImageRepository
import blbl.cat3399.core.ui.cloneInUserScale
import blbl.cat3399.core.util.Format
import blbl.cat3399.databinding.ItemPlayerCommentBinding

class PlayerCommentsAdapter(
    private val expandedRpids: MutableSet<Long>,
    private val onClick: (Item) -> Unit,
    private val onLongClick: (Item) -> Boolean = { false },
    private val onReply: (Item) -> Unit = {},
    private val onLike: (rpid: Long, like: Boolean) -> Unit = { _: Long, _: Boolean -> }, // v12.2: 点赞回调
) : RecyclerView.Adapter<PlayerCommentsAdapter.Vh>() {
    data class ReplyPreview(
        val userName: String,
        val message: String,
        val emotes: Map<String, String> = emptyMap(),
    )

    data class Item(
        val key: String,
        val rpid: Long,
        val oid: Long,
        val type: Int,
        val mid: Long,
        val userName: String,
        val avatarUrl: String?,
        val message: String,
        val emotes: Map<String, String> = emptyMap(),
        val pictures: List<String> = emptyList(),
        val noteCvid: Long = 0L,
        val ctimeSec: Long,
        val likeCount: Long,
        val liked: Boolean = false, // v12.2: 点赞状态
        val replyCount: Int,
        val replyPreviews: List<ReplyPreview> = emptyList(),
        val contextTag: String? = null,
        val canOpenThread: Boolean = false,
        val isThreadRoot: Boolean = false,
        val isUp: Boolean = false,
        // v5.2: 评论楼层号
        val floor: Int = 0,
        // v7.7: 用户等级
        val userLevel: Int = 0,
        // v7.8: 用户签名
        val userSign: String = "",
        // v9.7: IP属地
        val ipLocation: String = "",
    )

    private val items = ArrayList<Item>()
    private val requestedNotePictures = HashSet<Long>()

    init {
        setHasStableIds(true)
    }

    fun invalidateSizing() {
        if (itemCount <= 0) return
        notifyItemRangeChanged(0, itemCount)
    }

    fun setItems(list: List<Item>) {
        items.clear()
        items.addAll(list)
        requestedNotePictures.clear()
        notifyDataSetChanged()
    }

    fun appendItems(list: List<Item>) {
        if (list.isEmpty()) return
        val start = items.size
        items.addAll(list)
        notifyItemRangeInserted(start, list.size)
    }

    fun updatePictures(
        rpid: Long,
        pictures: List<String>,
    ) {
        if (pictures.isEmpty()) return
        val idx = items.indexOfFirst { it.rpid == rpid }
        if (idx !in items.indices) return
        val current = items[idx]
        if (current.pictures == pictures) return
        items[idx] = current.copy(pictures = pictures)
        notifyItemChanged(idx)
    }

    override fun getItemCount(): Int = items.size

    override fun getItemId(position: Int): Long = items[position].key.hashCode().toLong()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): Vh {
        val binding =
            ItemPlayerCommentBinding.inflate(
                LayoutInflater.from(parent.context).cloneInUserScale(parent.context),
                parent,
                false,
            )
        return Vh(binding)
    }

    override fun onBindViewHolder(
        holder: Vh,
        position: Int,
    ) {
        val item = items[position]
        maybeRequestNotePictures(item)
        holder.bind(
            item = item,
            isExpanded = expandedRpids.contains(item.rpid),
            onExpand = { rpid ->
                if (!expandedRpids.add(rpid)) return@bind
                val pos =
                    holder.bindingAdapterPosition
                        .takeIf { it != RecyclerView.NO_POSITION }
                        ?: position
                notifyItemChanged(pos)
            },
            onClick = onClick,
            onLongClick = onLongClick,
            onReply = { onReply(item) },
            onLike = {
                // v12.2: 点赞回调 - Adapter层处理数据更新
                val pos = holder.bindingAdapterPosition.takeIf { p -> p != RecyclerView.NO_POSITION } ?: return@bind
                val currentItem = items.getOrNull(pos) ?: return@bind
                val newLiked = !currentItem.liked
                val newLikeCount = if (newLiked) currentItem.likeCount + 1 else maxOf(0, currentItem.likeCount - 1)
                items[pos] = currentItem.copy(liked = newLiked, likeCount = newLikeCount)
                onLike(currentItem.rpid, newLiked)
                notifyItemChanged(pos)
            },
        )
    }

    private fun maybeRequestNotePictures(item: Item) {
        if (item.pictures.isNotEmpty()) return
        if (item.noteCvid <= 0L) return
        if (!requestedNotePictures.add(item.rpid)) return
        NoteImageRepository.load(item.noteCvid) { urls ->
            updatePictures(item.rpid, urls)
        }
    }

    class Vh(
        private val binding: ItemPlayerCommentBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        private var boundRpid: Long = 0L

        fun bind(
            item: Item,
            isExpanded: Boolean,
            onExpand: (Long) -> Unit,
            onClick: (Item) -> Unit,
            onLongClick: (Item) -> Boolean,
            onReply: (Item) -> Unit,
            onLike: () -> Unit, // v12.2: 点赞回调（无参数，Adapter层处理数据）
        ) {
            boundRpid = item.rpid
            val ctx = binding.root.context
            val previewUserColor = ContextCompat.getColor(ctx, R.color.blbl_blue)
            binding.root.setCardBackgroundColor(ContextCompat.getColor(ctx, android.R.color.black))

            binding.tvContextTag.text = item.contextTag.orEmpty()
            binding.tvContextTag.visibility = if (item.contextTag.isNullOrBlank()) View.GONE else View.VISIBLE

            binding.tvUser.text = item.userName.ifBlank { "-" }
            binding.tvUpBadge.visibility = if (item.isUp) View.VISIBLE else View.GONE
            // v7.7: Show user level badge
            // v12.13: 用户等级颜色标记
            binding.tvLevel?.apply {
                if (item.userLevel > 0) {
                    text = "Lv.${item.userLevel}"
                    visibility = View.VISIBLE
                    val levelColor =
                        when {
                            item.userLevel >= 10 -> 0xFFFF8800.toInt() // 金色
                            item.userLevel >= 7 -> 0xFFE040FB.toInt() // 紫色
                            item.userLevel >= 4 -> 0xFF448AFF.toInt() // 蓝色
                            else -> 0xFF9E9E9E.toInt() // 灰色
                        }
                    setTextColor(levelColor)
                } else {
                    visibility = View.GONE
                }
            }
            binding.tvTime.text =
                if (item.floor > 0) {
                    "${item.floor}楼 · ${Format.pubDateText(item.ctimeSec)}"
                } else {
                    Format.pubDateText(item.ctimeSec)
                }
            // v12.2: 点赞UI - 总是显示点赞按钮，已点赞时着色
            binding.ivLike.visibility = View.VISIBLE
            val likedColor = ContextCompat.getColor(ctx, R.color.blbl_blue)
            val defaultColor = ContextCompat.getColor(ctx, android.R.color.darker_gray)
            if (item.liked) {
                binding.ivLike.setColorFilter(likedColor)
                binding.tvLike.setTextColor(likedColor)
            } else {
                binding.ivLike.clearColorFilter()
                binding.tvLike.setTextColor(defaultColor)
            }
            binding.tvLike.text = if (item.likeCount > 0L) Format.count(item.likeCount) else ""
            binding.tvLike.visibility = if (item.likeCount > 0L || item.liked) View.VISIBLE else View.GONE
            // v12.2: 点赞按钮点击事件
            binding.ivLike.setOnClickListener {
                onLike()
            }
            // v7.8: Show user signature
            binding.tvUserSign?.apply {
                if (item.userSign.isNotBlank()) {
                    text = item.userSign
                    visibility = View.VISIBLE
                } else {
                    visibility = View.GONE
                }
            }
            // v9.7: IP属地
            binding.tvIpLocation?.apply {
                if (item.ipLocation.isNotBlank()) {
                    text = "IP: ${item.ipLocation}"
                    visibility = View.VISIBLE
                } else {
                    visibility = View.GONE
                }
            }
            binding.tvMessage.maxLines = if (isExpanded) Int.MAX_VALUE else 6
            val blankFallback = if (item.pictures.isNotEmpty() || item.noteCvid > 0L) "" else "-"
            EmoteSpannable.setText(binding.tvMessage, item.message, item.emotes, blankFallback = blankFallback)
            updateExpandHint(itemRpid = item.rpid, isExpanded = isExpanded)
            bindPictures(item.pictures)

            run {
                val previews = item.replyPreviews.take(2)
                if (previews.isNotEmpty()) {
                    binding.rowReplyPreview.visibility = View.VISIBLE
                    bindReplyPreviewText(binding.tvReplyPreview1, previews[0], previewUserColor)
                    if (previews.size >= 2) {
                        bindReplyPreviewText(binding.tvReplyPreview2, previews[1], previewUserColor)
                        binding.tvReplyPreview2.visibility = View.VISIBLE
                    } else {
                        binding.tvReplyPreview2.text = ""
                        binding.tvReplyPreview2.visibility = View.GONE
                    }
                } else {
                    binding.rowReplyPreview.visibility = View.GONE
                    binding.tvReplyPreview1.text = ""
                    binding.tvReplyPreview2.text = ""
                    binding.tvReplyPreview2.visibility = View.GONE
                }
            }

            // v12.0: 评论回复功能 - 点击回复按钮触发回复，长按查看全部回复
            if (item.canOpenThread && item.replyCount > 0) {
                val rc = Format.count(item.replyCount.toLong())
                val hasPictures = item.pictures.isNotEmpty() || item.noteCvid > 0L
                binding.tvReply.text =
                    if (hasPictures) {
                        "长按查看全部 $rc 条回复"
                    } else {
                        "查看全部 $rc 条回复"
                    }
                binding.tvReply.visibility = View.VISIBLE
                // 长按查看回复列表
                binding.tvReply.setOnLongClickListener {
                    onReply(item)
                    true
                }
                // 单击直接回复（改动：添加点击回复功能）
                binding.tvReply.setOnClickListener {
                    onReply(item)
                }
                binding.rowMeta.visibility = View.VISIBLE
            } else {
                // 没有回复时也显示回复按钮
                binding.tvReply.text = "回复"
                binding.tvReply.visibility = View.VISIBLE
                binding.tvReply.setOnClickListener {
                    onReply(item)
                }
                binding.rowMeta.visibility = View.VISIBLE
            }

            ImageLoader.loadInto(binding.ivAvatar, ImageUrl.avatar(item.avatarUrl))

            binding.root.setOnClickListener {
                val shouldExpand = !isExpanded && isMessageEllipsized(binding.tvMessage)
                if (shouldExpand) {
                    onExpand(item.rpid)
                } else {
                    onClick(item)
                }
            }
            binding.root.setOnLongClickListener {
                onLongClick(item)
            }
        }

        private fun updateExpandHint(
            itemRpid: Long,
            isExpanded: Boolean,
        ) {
            binding.tvExpand.visibility = View.GONE
            if (isExpanded) return

            // Only show "展开" when we are actually ellipsized at runtime.
            // Use post() to wait for the layout pass to finish.
            binding.tvMessage.post {
                if (boundRpid != itemRpid) return@post
                val shouldShow = isMessageEllipsized(binding.tvMessage)
                binding.tvExpand.visibility = if (shouldShow) View.VISIBLE else View.GONE
            }
        }

        private fun isMessageEllipsized(view: TextView): Boolean {
            val layout = view.layout ?: return false
            val last = layout.lineCount - 1
            if (last < 0) return false
            return layout.getEllipsisCount(last) > 0
        }

        private fun bindPictures(pictures: List<String>) {
            val urls = pictures.take(3).filter { it.isNotBlank() }
            if (urls.isEmpty()) {
                binding.rowPictures.visibility = View.GONE
                ImageLoader.loadInto(binding.ivPicture1, null)
                ImageLoader.loadInto(binding.ivPicture2, null)
                ImageLoader.loadInto(binding.ivPicture3, null)
                binding.ivPicture1.visibility = View.GONE
                binding.ivPicture2.visibility = View.GONE
                binding.ivPicture3.visibility = View.GONE
                return
            }

            binding.rowPictures.visibility = View.VISIBLE
            val v1 = urls.getOrNull(0)
            val v2 = urls.getOrNull(1)
            val v3 = urls.getOrNull(2)

            if (v1 != null) {
                binding.ivPicture1.visibility = View.VISIBLE
                ImageLoader.loadInto(binding.ivPicture1, ImageUrl.commentThumbnail(v1))
            } else {
                binding.ivPicture1.visibility = View.GONE
                ImageLoader.loadInto(binding.ivPicture1, null)
            }

            if (v2 != null) {
                binding.ivPicture2.visibility = View.VISIBLE
                ImageLoader.loadInto(binding.ivPicture2, ImageUrl.commentThumbnail(v2))
            } else {
                binding.ivPicture2.visibility = View.GONE
                ImageLoader.loadInto(binding.ivPicture2, null)
            }

            if (v3 != null) {
                binding.ivPicture3.visibility = View.VISIBLE
                ImageLoader.loadInto(binding.ivPicture3, ImageUrl.commentThumbnail(v3))
            } else {
                binding.ivPicture3.visibility = View.GONE
                ImageLoader.loadInto(binding.ivPicture3, null)
            }
        }

        private fun bindReplyPreviewText(
            view: android.widget.TextView,
            preview: ReplyPreview,
            userColor: Int,
        ) {
            val u = preview.userName.ifBlank { "-" }
            val m = preview.message.ifBlank { "-" }
            val s = "$u：$m"
            val ssb = SpannableStringBuilder(s)
            ssb.setSpan(ForegroundColorSpan(userColor), 0, u.length.coerceAtMost(s.length), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            view.setTag(R.id.tag_emote_text_key, s)
            EmoteSpannable.applyEmotes(view, ssb, start = 0, end = ssb.length, emotes = preview.emotes)
            view.setText(ssb, android.widget.TextView.BufferType.SPANNABLE)
        }
    }
}
