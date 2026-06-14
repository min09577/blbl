package blbl.cat3399.feature.about

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlblAboutTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AboutScreen()
                }
            }
        }
    }
}

@Composable
private fun BlblAboutTheme(content: @Composable () -> Unit) {
    val context = LocalContext.current
    val darkTheme = isSystemInDarkTheme()
    val colorScheme =
        when {
            android.os.Build.VERSION.SDK_INT >= 31 && darkTheme ->
                dynamicDarkColorScheme(context)
            android.os.Build.VERSION.SDK_INT >= 31 ->
                dynamicLightColorScheme(context)
            darkTheme ->
                darkColorScheme()
            else ->
                lightColorScheme()
        }
    MaterialTheme(colorScheme = colorScheme, content = content)
}
