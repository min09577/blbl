package blbl.cat3399.feature.cast

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.net.DatagramPacket
import java.net.InetAddress
import java.net.MulticastSocket

/**
 * 轻量�?DLNA/UPnP 设备发现与投屏控制（无第三方依赖�? */
object DlnaHelper {
    private val okHttpClient =
        okhttp3.OkHttpClient
            .Builder()
            .connectTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
            .readTimeout(10, java.util.concurrent.TimeUnit.SECONDS)
            .build()

    private const val TAG = "DlnaHelper"
    private const val SSDP_ADDRESS = "239.255.255.250"
    private const val SSDP_PORT = 1900
    private const val SEARCH_TIMEOUT_MS = 5000

    data class DlnaDevice(
        val name: String,
        val location: String, // description XML URL
        val usn: String,
        val server: String,
        val controlUrl: String = "", // AVTransport control URL
        val friendlyName: String = name,
    ) {
        val host: String
            get() =
                try {
                    java.net.URL(location).host
                } catch (_: Exception) {
                    ""
                }
    }

    /**
     * SSDP M-SEARCH: 搜索局域网内所�?MediaRenderer 设备
     */
    suspend fun discoverDevices(timeoutMs: Int = SEARCH_TIMEOUT_MS): List<DlnaDevice> =
        withContext(Dispatchers.IO) {
            val devices = mutableListOf<DlnaDevice>()
            try {
                val searchMessage =
                    buildString {
                        append("M-SEARCH * HTTP/1.1\r\n")
                        append("HOST: $SSDP_ADDRESS:$SSDP_PORT\r\n")
                        append("MAN: \"ssdp:discover\"\r\n")
                        append("MX: ${timeoutMs / 1000}\r\n")
                        append("ST: urn:schemas-upnp-org:device:MediaRenderer:1\r\n")
                        append("\r\n")
                    }.toByteArray()

                val group = InetAddress.getByName(SSDP_ADDRESS)
                val socket = MulticastSocket(SSDP_PORT)
                socket.soTimeout = timeoutMs
                socket.joinGroup(group)

                // 发送搜索请求
                val packet = DatagramPacket(searchMessage, searchMessage.size, group, SSDP_PORT)
                socket.send(packet)

                // 接收响应
                val buffer = ByteArray(4096)
                val deadline = System.currentTimeMillis() + timeoutMs

                while (System.currentTimeMillis() < deadline) {
                    try {
                        val response = DatagramPacket(buffer, buffer.size)
                        socket.receive(response)
                        val text = String(response.data, 0, response.length)
                        val device = parseSsdpResponse(text)
                        if (device != null && devices.none { it.location == device.location }) {
                            devices.add(device)
                            Log.d(TAG, "Found device: ${device.name} @ ${device.location}")
                        }
                    } catch (_: java.net.SocketTimeoutException) {
                        break
                    }
                }

                socket.leaveGroup(group)
                socket.close()

                // 获取每个设备的详细信息和控制URL
                devices.mapNotNull { device ->
                    try {
                        fetchDeviceInfo(device)
                    } catch (e: Exception) {
                        Log.w(TAG, "Failed to fetch device info for ${device.name}: ${e.message}")
                        device
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Discovery failed: ${e.message}")
                devices
            }
        }

    private fun parseSsdpResponse(text: String): DlnaDevice? {
        val headers =
            text.lines().associate { line ->
                val idx = line.indexOf(':')
                if (idx > 0) {
                    line.substring(0, idx).trim().uppercase() to line.substring(idx + 1).trim()
                } else {
                    "" to ""
                }
            }
        val location = headers["LOCATION"] ?: return null
        val usn = headers["USN"] ?: ""
        val server = headers["SERVER"] ?: ""
        return DlnaDevice(
            name = server,
            location = location,
            usn = usn,
            server = server,
        )
    }

    /**
     * 获取设备描述XML，解�?friendlyName �?AVTransport controlURL
     */
    private suspend fun fetchDeviceInfo(device: DlnaDevice): DlnaDevice =
        withContext(Dispatchers.IO) {
            val client = okHttpClient
            val request = Request.Builder().url(device.location).build()
            val response = client.newCall(request).execute()
            val xml = response.body?.string() ?: return@withContext device

            val friendlyName = extractXmlValue(xml, "friendlyName") ?: device.name
            val controlUrl = findAvTransportControlUrl(xml) ?: ""

            device.copy(
                friendlyName = friendlyName,
                controlUrl = controlUrl,
            )
        }

    private fun extractXmlValue(
        xml: String,
        tag: String,
    ): String? {
        val regex = Regex("<$tag>(.*?)</$tag>", RegexOption.DOT_MATCHES_ALL)
        return regex
            .find(xml)
            ?.groupValues
            ?.get(1)
            ?.trim()
    }

    /**
     * 从描述XML中提�?AVTransport serviceType �?controlURL
     */
    private fun findAvTransportControlUrl(xml: String): String? {
        // 查找 AVTransport service �?controlURL
        val servicePattern =
            Regex(
                "<service>\\s*" +
                    "<serviceType>urn:schemas-upnp-org:service:AVTransport:1</serviceType>.*?" +
                    "<controlURL>(.*?)</controlURL>",
                RegexOption.DOT_MATCHES_ALL,
            )
        return servicePattern
            .find(xml)
            ?.groupValues
            ?.get(1)
            ?.trim()
    }

    /**
     * 发�?SetAVTransportURI + Play 指令�?DLNA 设备
     */
    suspend fun castUrl(
        device: DlnaDevice,
        videoUrl: String,
        title: String = "",
    ): Boolean =
        withContext(Dispatchers.IO) {
            try {
                if (device.controlUrl.isBlank()) {
                    Log.e(TAG, "No control URL for device ${device.friendlyName}")
                    return@withContext false
                }

                val controlFullUrl =
                    if (device.controlUrl.startsWith("http")) {
                        device.controlUrl
                    } else {
                        "http://${device.host}:80${if (device.controlUrl.startsWith("/")) "" else "/"}${device.controlUrl}"
                    }

                // 1. SetAVTransportURI
                val setUriSoap = buildSetAvTransportUriSoap(videoUrl, title)
                sendSoapAction(
                    controlFullUrl,
                    "urn:schemas-upnp-org:service:AVTransport:1#SetAVTransportURI",
                    setUriSoap,
                )

                // 2. Play
                val playSoap = buildPlaySoap()
                sendSoapAction(
                    controlFullUrl,
                    "urn:schemas-upnp-org:service:AVTransport:1#Play",
                    playSoap,
                )

                Log.d(TAG, "Cast started: $title -> ${device.friendlyName}")
                true
            } catch (e: Exception) {
                Log.e(TAG, "Cast failed: ${e.message}")
                false
            }
        }

    /**
     * 发�?Stop 指令
     */
    suspend fun stopCast(device: DlnaDevice): Boolean =
        withContext(Dispatchers.IO) {
            try {
                val controlFullUrl =
                    if (device.controlUrl.startsWith("http")) {
                        device.controlUrl
                    } else {
                        "http://${device.host}:80${if (device.controlUrl.startsWith("/")) "" else "/"}${device.controlUrl}"
                    }
                val stopSoap = buildStopSoap()
                sendSoapAction(
                    controlFullUrl,
                    "urn:schemas-upnp-org:service:AVTransport:1#Stop",
                    stopSoap,
                )
                true
            } catch (e: Exception) {
                Log.e(TAG, "Stop failed: ${e.message}")
                false
            }
        }

    private fun sendSoapAction(
        url: String,
        soapAction: String,
        body: String,
    ) {
        val client = okHttpClient
        val mediaType = "text/xml; charset=utf-8".toMediaType()
        val request =
            Request
                .Builder()
                .url(url)
                .post(body.toRequestBody(mediaType))
                .header("SOAPAction", "\"$soapAction\"")
                .header("Content-Type", "text/xml; charset=utf-8")
                .build()
        val response = client.newCall(request).execute()
        Log.d(TAG, "SOAP response: ${response.code} for $soapAction")
    }

    private fun buildSetAvTransportUriSoap(
        uri: String,
        title: String,
    ): String =
        """
        <?xml version="1.0" encoding="utf-8"?>
        <s:Envelope xmlns:s="http://schemas.xmlsoap.org/soap/envelope/" s:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
            <s:Body>
                <u:SetAVTransportURI xmlns:u="urn:schemas-upnp-org:service:AVTransport:1">
                    <InstanceID>0</InstanceID>
                    <CurrentURI><![CDATA[$uri]]></CurrentURI>
                    <CurrentURIMetaData>&lt;DIDL-Lite xmlns="urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/" xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:upnp="urn:schemas-upnp-org:metadata-1-0/upnp/"&gt;&lt;item id="0" parentID="-1" restricted="1"&gt;&lt;dc:title&gt;${escapeXml(
            title,
        )}&lt;/dc:title&gt;&lt;res protocolInfo="http-get:*:video/mp4:*"&gt;${escapeXml(
            uri,
        )}&lt;/res&gt;&lt;upnp:class&gt;object.item.videoItem&lt;/upnp:class&gt;&lt;/item&gt;&lt;/DIDL-Lite&gt;</CurrentURIMetaData>
                </u:SetAVTransportURI>
            </s:Body>
        </s:Envelope>
        """.trimIndent()

    private fun buildPlaySoap(): String =
        """
        <?xml version="1.0" encoding="utf-8"?>
        <s:Envelope xmlns:s="http://schemas.xmlsoap.org/soap/envelope/" s:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
            <s:Body>
                <u:Play xmlns:u="urn:schemas-upnp-org:service:AVTransport:1">
                    <InstanceID>0</InstanceID>
                    <Speed>1</Speed>
                </u:Play>
            </s:Body>
        </s:Envelope>
        """.trimIndent()

    private fun buildStopSoap(): String =
        """
        <?xml version="1.0" encoding="utf-8"?>
        <s:Envelope xmlns:s="http://schemas.xmlsoap.org/soap/envelope/" s:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
            <s:Body>
                <u:Stop xmlns:u="urn:schemas-upnp-org:service:AVTransport:1">
                    <InstanceID>0</InstanceID>
                </u:Stop>
            </s:Body>
        </s:Envelope>
        """.trimIndent()

    private fun escapeXml(s: String): String =
        s
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&apos;")

    // v5.1: 当前投屏设备
    var currentDevice: DlnaDevice? = null
        private set

    // v5.1: 设置AVTransportURI并播放
    suspend fun setAVTransportURI(
        device: DlnaDevice,
        url: String,
        title: String = "",
    ) {
        currentDevice = device
        val result = castUrl(device, url, title)
        if (!result) throw Exception("投屏失败")
    }

    // v5.1: 播放
    suspend fun play(device: DlnaDevice) {
        val controlFullUrl = buildControlUrl(device)
        val playSoap = buildPlaySoap()
        sendSoapAction(controlFullUrl, "urn:schemas-upnp-org:service:AVTransport:1#Play", playSoap)
    }

    // v5.1: 停止
    suspend fun stop(device: DlnaDevice) {
        stopCast(device)
        currentDevice = null
    }

    // v5.1: 设置音量 (0-100)
    suspend fun setVolume(
        device: DlnaDevice,
        volume: Int,
    ) = withContext(Dispatchers.IO) {
        val controlFullUrl = buildControlUrl(device)
        val v = volume.coerceIn(0, 100)
        val soap =
            """
            <?xml version="1.0" encoding="utf-8"?>
            <s:Envelope xmlns:s="http://schemas.xmlsoap.org/soap/envelope/" s:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
                <s:Body>
                    <u:SetVolume xmlns:u="urn:schemas-upnp-org:service:RenderingControl:1">
                        <InstanceID>0</InstanceID>
                        <Channel>Master</Channel>
                        <DesiredVolume>$v</DesiredVolume>
                    </u:SetVolume>
                </s:Body>
            </s:Envelope>
            """.trimIndent()
        sendSoapAction(controlFullUrl, "urn:schemas-upnp-org:service:RenderingControl:1#SetVolume", soap)
    }

    // v5.1: 获取播放进度
    data class PositionInfo(
        val currentPos: Long,
        val duration: Long,
    )

    suspend fun getPositionInfo(device: DlnaDevice): PositionInfo? =
        withContext(Dispatchers.IO) {
            try {
                val controlFullUrl = buildControlUrl(device)
                val soap =
                    """
                    <?xml version="1.0" encoding="utf-8"?>
                    <s:Envelope xmlns:s="http://schemas.xmlsoap.org/soap/envelope/" s:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">
                        <s:Body>
                            <u:GetPositionInfo xmlns:u="urn:schemas-upnp-org:service:AVTransport:1">
                                <InstanceID>0</InstanceID>
                            </u:GetPositionInfo>
                        </s:Body>
                    </s:Envelope>
                    """.trimIndent()
                val mediaType = "text/xml; charset=utf-8".toMediaType()
                val request =
                    Request
                        .Builder()
                        .url(controlFullUrl)
                        .post(soap.toRequestBody(mediaType))
                        .header("SOAPAction", "\"urn:schemas-upnp-org:service:AVTransport:1#GetPositionInfo\"")
                        .header("Content-Type", "text/xml; charset=utf-8")
                        .build()
                val response = okHttpClient.newCall(request).execute()
                val body = response.body?.string() ?: return@withContext null

                // 解析 TrackDuration 和 RelTime
                val duration = parseTimeToMs(extractXmlValue(body, "TrackDuration") ?: "0:00:00")
                val currentPos = parseTimeToMs(extractXmlValue(body, "RelTime") ?: "0:00:00")

                PositionInfo(currentPos = currentPos, duration = duration)
            } catch (e: Exception) {
                Log.w(TAG, "GetPositionInfo failed: ${e.message}")
                null
            }
        }

    private fun buildControlUrl(device: DlnaDevice): String =
        if (device.controlUrl.startsWith("http")) {
            device.controlUrl
        } else {
            "http://${device.host}:80${if (device.controlUrl.startsWith("/")) "" else "/"}${device.controlUrl}"
        }

    // 解析 HH:MM:SS 或 H:MM:SS 格式的时间为毫秒
    private fun parseTimeToMs(time: String): Long {
        val parts = time.trim().split(":")
        if (parts.size < 3) return 0L
        return try {
            val h = parts[0].toLongOrNull() ?: 0L
            val m = parts[1].toLongOrNull() ?: 0L
            val s = parts[2].toLongOrNull() ?: 0L
            (h * 3600 + m * 60 + s) * 1000
        } catch (_: Exception) {
            0L
        }
    }
}
