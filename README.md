# Tugas1PAPB
 
Penjelasan dan Alur Kerja
Aplikasi ini mengikuti alur kerja yang sederhana:

Deklarasi State: Variabel text dideklarasikan menggunakan mutableStateOf dan remember. Ini adalah inti dari Jetpack Compose untuk mengelola data yang dapat berubah.

Pengaturan UI: UI diatur dalam Column untuk menempatkan Text dan Button secara vertikal di tengah layar.

Interaksi: Saat pengguna mengklik Button, fungsi onClick akan mengubah nilai dari variabel text.

Re-komposisi: Ketika nilai text berubah, Jetpack Compose secara otomatis mendeteksi perubahan state tersebut dan melakukan re-komposisi (menggambar ulang) hanya bagian Text yang terpengaruh, bukan seluruh UI.
