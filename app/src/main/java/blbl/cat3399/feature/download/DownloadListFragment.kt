package blbl.cat3399.feature.download

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import blbl.cat3399.R
import blbl.cat3399.core.ui.AppToast
import blbl.cat3399.databinding.ItemDownloadBinding
import org.json.JSONArray
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DownloadListFragment : Fragment() {
    private var _binding: blbl.cat3399.databinding.FragmentDownloadListBinding? = null
    private val binding get() = _binding!!
    private var adapter: DownloadAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding =
            blbl.cat3399.databinding.FragmentDownloadListBinding
                .inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupHeader()
        refreshList()
    }

    private fun setupRecyclerView() {
        adapter =
            DownloadAdapter(
                onPlay = ::onPlayDownload,
                onDelete = ::onDeleteDownload,
                onInfo = ::onShowInfo,
            )
        binding.recyclerDownloads.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerDownloads.adapter = adapter
    }

    private fun setupHeader() {
        binding.tvDownloadTitle.text = getString(R.string.download_management_title)
        binding.btnDeleteAll.setOnClickListener {
            val items = adapter?.currentItems ?: return@setOnClickListener
            if (items.isEmpty()) {
                AppToast.show(requireContext(), getString(R.string.download_empty))
                return@setOnClickListener
            }
            AlertDialog
                .Builder(requireContext())
                .setTitle(R.string.download_delete_all_title)
                .setMessage(getString(R.string.download_delete_all_msg, items.size))
                .setPositiveButton(R.string.download_delete_confirm) { _, _ -> deleteAllDownloads() }
                .setNegativeButton(android.R.string.cancel, null)
                .show()
        }
    }

    private fun refreshList() {
        val items = loadDownloads()
        adapter?.updateItems(items)
        binding.tvEmptyHint.visibility = if (items.isEmpty()) View.VISIBLE else View.GONE
        binding.recyclerDownloads.visibility = if (items.isEmpty()) View.GONE else View.VISIBLE
        binding.tvStorageInfo.text = formatStorageInfo(items)
    }

    private fun loadDownloads(): List<DownloadItem> {
        val prefs = requireContext().getSharedPreferences("downloads", android.content.Context.MODE_PRIVATE)
        val records = prefs.getString("records", "[]") ?: "[]"
        val arr = JSONArray(records)
        val items = mutableListOf<DownloadItem>()
        for (i in 0 until arr.length()) {
            val obj = arr.getJSONObject(i)
            val videoPath = obj.optString("videoPath", "")
            val file = File(videoPath)
            if (file.exists()) {
                items.add(
                    DownloadItem(
                        bvid = obj.optString("bvid", ""),
                        cid = obj.optLong("cid", 0),
                        title = obj.optString("title", "未知"),
                        page = obj.optString("page", ""),
                        videoPath = videoPath,
                        audioPath = obj.optString("audioPath", ""),
                        fileSize = obj.optLong("fileSize", 0),
                        downloadedAt = obj.optLong("downloadedAt", 0),
                    ),
                )
            }
        }
        return items.sortedByDescending { it.downloadedAt }
    }

    data class DownloadItem(
        val bvid: String,
        val cid: Long,
        val title: String,
        val page: String,
        val videoPath: String,
        val audioPath: String,
        val fileSize: Long,
        val downloadedAt: Long,
    ) {
        val isDash: Boolean get() = videoPath.endsWith(".m4s")
        val playableFile: File get() = File(videoPath)
        val formatLabel: String get() = if (isDash) "DASH" else "MP4"
    }

    // --- 操作 ---

    private fun onPlayDownload(item: DownloadItem) {
        val file = item.playableFile
        if (!file.exists()) {
            AppToast.show(requireContext(), getString(R.string.download_file_missing))
            return
        }
        try {
            val uri =
                FileProvider.getUriForFile(
                    requireContext(),
                    "${requireContext().packageName}.fileprovider",
                    file,
                )
            val mimeType = if (item.isDash) "video/mp4" else "video/*"
            val intent =
                Intent(Intent.ACTION_VIEW).apply {
                    setDataAndType(uri, mimeType)
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
            if (intent.resolveActivity(requireContext().packageManager) != null) {
                startActivity(intent)
                if (item.isDash) {
                    AppToast.show(requireContext(), getString(R.string.download_dash_no_audio))
                }
            } else {
                AppToast.show(requireContext(), getString(R.string.download_no_player))
            }
        } catch (e: Exception) {
            AppToast.show(requireContext(), getString(R.string.download_play_failed, e.localizedMessage))
        }
    }

    private fun onDeleteDownload(item: DownloadItem) {
        AlertDialog
            .Builder(requireContext())
            .setTitle(R.string.download_delete_title)
            .setMessage(getString(R.string.download_delete_msg_single, item.title))
            .setPositiveButton(R.string.download_delete_confirm) { _, _ ->
                deleteDownload(item)
            }.setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun onShowInfo(item: DownloadItem) {
        val sizeStr = formatSize(item.fileSize)
        val dateStr = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Date(item.downloadedAt))
        val audioSize =
            if (item.audioPath.isNotBlank()) {
                val audioFile = File(item.audioPath)
                if (audioFile.exists()) formatSize(audioFile.length()) else "N/A"
            } else {
                "N/A"
            }
        val videoSize =
            if (item.audioPath.isNotBlank()) {
                formatSize(item.playableFile.length())
            } else {
                sizeStr
            }

        val msg =
            buildString {
                appendLine("标题：${item.title}")
                if (item.page.isNotBlank()) appendLine("分P：${item.page}")
                appendLine("BV号：${item.bvid}")
                appendLine("格式：${item.formatLabel}")
                appendLine("视频大小：$videoSize")
                if (item.isDash) appendLine("音频大小：$audioSize")
                appendLine("总大小：$sizeStr")
                appendLine("下载时间：$dateStr")
                appendLine("路径：${item.videoPath}")
            }
        AlertDialog
            .Builder(requireContext())
            .setTitle(R.string.download_info_title)
            .setMessage(msg)
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }

    private fun deleteDownload(item: DownloadItem) {
        item.playableFile.delete()
        if (item.audioPath.isNotBlank()) File(item.audioPath).delete()
        removeRecord(item.videoPath)
        AppToast.show(requireContext(), getString(R.string.download_deleted))
        refreshList()
    }

    private fun deleteAllDownloads() {
        val items = adapter?.currentItems ?: return
        for (item in items) {
            item.playableFile.delete()
            if (item.audioPath.isNotBlank()) File(item.audioPath).delete()
        }
        val prefs = requireContext().getSharedPreferences("downloads", android.content.Context.MODE_PRIVATE)
        prefs.edit().putString("records", "[]").apply()
        AppToast.show(requireContext(), getString(R.string.download_deleted_all, items.size))
        refreshList()
    }

    private fun removeRecord(videoPath: String) {
        val prefs = requireContext().getSharedPreferences("downloads", android.content.Context.MODE_PRIVATE)
        val arr = JSONArray(prefs.getString("records", "[]") ?: "[]")
        val newArr = JSONArray()
        for (i in 0 until arr.length()) {
            val obj = arr.getJSONObject(i)
            if (obj.optString("videoPath", "") != videoPath) {
                newArr.put(obj)
            }
        }
        prefs.edit().putString("records", newArr.toString()).apply()
    }

    private fun formatStorageInfo(items: List<DownloadItem>): String {
        val totalSize = items.sumOf { it.fileSize }
        return "共 ${items.size} 个文件，占用 ${formatSize(totalSize)}"
    }

    private fun formatSize(bytes: Long): String =
        when {
            bytes < 1024 -> "${bytes}B"
            bytes < 1024 * 1024 -> "${bytes / 1024}KB"
            bytes < 1024 * 1024 * 1024 -> String.format("%.1fMB", bytes / 1024.0 / 1024.0)
            else -> String.format("%.2fGB", bytes / 1024.0 / 1024.0 / 1024.0)
        }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    // --- Adapter ---

    inner class DownloadAdapter(
        private val onPlay: (DownloadItem) -> Unit,
        private val onDelete: (DownloadItem) -> Unit,
        private val onInfo: (DownloadItem) -> Unit,
    ) : RecyclerView.Adapter<DownloadAdapter.VH>() {
        private var items: List<DownloadItem> = emptyList()
        val currentItems: List<DownloadItem> get() = items

        inner class VH(
            val binding: ItemDownloadBinding,
        ) : RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int,
        ): VH {
            val binding = ItemDownloadBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return VH(binding)
        }

        override fun getItemCount() = items.size

        override fun onBindViewHolder(
            holder: VH,
            position: Int,
        ) {
            val item = items[position]
            val ctx = holder.binding.root.context
            val dateStr = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Date(item.downloadedAt))

            holder.binding.tvTitle.text =
                buildString {
                    append(item.title)
                    if (item.page.isNotBlank()) append(" - ${item.page}")
                }
            holder.binding.tvMeta.text = "${formatSize(item.fileSize)} | ${item.formatLabel} | $dateStr"

            // 格式图标
            holder.binding.ivDownloadIcon.setImageResource(
                if (item.isDash) R.drawable.ic_download else R.drawable.ic_download,
            )

            // 播放按钮
            holder.binding.btnPlay.setOnClickListener { onPlay(item) }
            holder.binding.btnPlay.setOnFocusChangeListener { v, hasFocus ->
                v.alpha = if (hasFocus) 1.0f else 0.7f
            }

            // 删除按钮
            holder.binding.btnDelete.setOnClickListener { onDelete(item) }
            holder.binding.btnDelete.setOnFocusChangeListener { v, hasFocus ->
                v.alpha = if (hasFocus) 1.0f else 0.7f
            }

            // 根项点击 = 播放
            holder.binding.root.setOnClickListener { onPlay(item) }
            // 根项长按 = 详情
            holder.binding.root.setOnLongClickListener {
                onInfo(item)
                true
            }
        }

        fun updateItems(newItems: List<DownloadItem>) {
            items = newItems.sortedByDescending { it.downloadedAt }
            notifyDataSetChanged()
        }
    }
}
