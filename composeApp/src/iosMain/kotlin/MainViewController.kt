import androidx.compose.ui.window.ComposeUIViewController
import io.ktor.client.engine.darwin.Darwin
import networking.InsultCensorClient
import networking.createHttpClient

fun MainViewController() = ComposeUIViewController {
    App(
        client = InsultCensorClient(createHttpClient(Darwin.create()))
    )
}