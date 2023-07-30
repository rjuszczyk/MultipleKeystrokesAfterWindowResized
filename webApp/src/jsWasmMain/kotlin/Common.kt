import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun ImageViewerWeb() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            var codeInput by remember { mutableStateOf("") }
            Box(Modifier.fillMaxSize()) {
                TextField(
                    value = codeInput,
                    onValueChange = {
                        codeInput = it
                    },
                    modifier = Modifier.width(200.dp).height(100.dp).align(Alignment.Center),
                )
            }
        }
    }
}
