import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

// Ganti "Nama Mahasiswa" dengan nama Anda
val NAMA_MAHASISWA = "Rafly Januar Raharjo"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Mengatur tema dan permukaan aplikasi
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingApp()
                }
            }
        }
    }
}

@Composable
fun GreetingApp() {
    // Menggunakan state untuk melacak perubahan teks
    var text by remember { mutableStateOf("Silakan tekan tombol di bawah") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Teks yang akan berubah saat tombol ditekan
        Text(
            text = text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Tombol yang akan mengubah state
        Button(
            onClick = {
                text = "Halo ${NAMA_MAHASISWA}"
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Tekan Saya!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingApp()
}
