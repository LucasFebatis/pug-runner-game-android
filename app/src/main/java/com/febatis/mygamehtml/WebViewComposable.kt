package com.febatis.mygamehtml

import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.febatis.mygamehtml.ui.theme.PugRunnerAndroidVersionTheme

@Composable
fun WebViewComposable() {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                loadUrl("file:///android_asset/pug_runner_game/index.html")
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Preview
@Composable
fun WebViewComposablePreview() {
    PugRunnerAndroidVersionTheme {
        WebViewComposable()
    }
}