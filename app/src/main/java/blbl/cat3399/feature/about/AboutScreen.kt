package blbl.cat3399.feature.about

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen() {
    val context = LocalContext.current
    val versionName =
        try {
            context.packageManager
                .getPackageInfo(context.packageName, 0)
                .versionName
        } catch (_: Exception) {
            "unknown"
        } ?: "unknown"

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "blbl",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
        )
        Text(
            text = "v$versionName",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Text(
            text = "哔哩哔哩 TV / 车机第三方客户端",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors =
                CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                SectionTitle("核心特性")
                Spacer(modifier = Modifier.height(8.dp))
                FeatureItem("📺", "TV / 大屏 / 车机三端自适应")
                FeatureItem("🎛️", "遥控器 + 触屏双操作模式")
                FeatureItem("🌐", "App 接口 / Web 接口多源切换")
                FeatureItem("🔍", "视频搜索 + 历史记录管理")
                FeatureItem("⏱️", "播放器休眠定时器")
                FeatureItem("🎨", "多主题预设动态切换")
                FeatureItem("🔐", "扫码登录哔哩哔哩账号")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors =
                CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                ),
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                SectionTitle("技术栈")
                Spacer(modifier = Modifier.height(8.dp))
                TechItem("Kotlin 2.0.21 · AGP 9.2.0 · Gradle 9.4.1")
                TechItem("Jetpack Compose + ViewBinding 混合 UI")
                TechItem("Media3 ExoPlayer · OkHttp 4 · gRPC")
                TechItem("ktlint + detekt 零违规代码门禁")
                TechItem("GitHub Actions CI/CD · Cloudflare R2")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors =
                CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                ),
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                SectionTitle("🤖 AI 自主演进")
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text =
                        "本项目由某个不知名的 AI Agent 全自动维护：\n" +
                            "• 自动同步上游代码变更\n" +
                            "• 自动升级构建工具链\n" +
                            "• 自动执行代码质量门禁\n" +
                            "• 自动发布 Release APK",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onTertiaryContainer,
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        TextButton(
            onClick = {
                context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/min09577/blbl"),
                    ),
                )
            },
        ) {
            Text("GitHub → min09577/blbl")
        }

        Text(
            text = "上游: github.com/cat3399/blbl",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )

        Spacer(modifier = Modifier.height(8.dp))

        HorizontalDivider()

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "仅供学习交流使用",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

@Composable
private fun SectionTitle(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.SemiBold,
    )
}

@Composable
private fun FeatureItem(
    emoji: String,
    text: String,
) {
    Text(
        text = "  $emoji  $text",
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(vertical = 3.dp),
    )
}

@Composable
private fun TechItem(text: String) {
    Text(
        text = "  •  $text",
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(vertical = 2.dp),
    )
}
