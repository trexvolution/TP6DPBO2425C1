# Desain Program

Game Flappy Bird sederhana menggunakan Java Swing dan Timer. Pemain mengendalikan burung untuk melewati celah antar pipa dan mendapatkan skor.

🎮 Desain Program

✅ Struktur Program (MVC)

Program ini menerapkan konsep MVC (Model–View–Controller) sederhana:

## Komponen	Kelas	Fungsi
Model	Player, Pipe	Menyimpan data burung & pipa
View	View	Menampilkan gambar, skor, dan game over
Controller	Logic	Mengatur game loop, input, gravity, collision, skor
Launcher	MainMenu, App	Menampilkan menu dan menjalankan game

✅ Alur Utama Aplikasi

Program dimulai dari MainMenu

Player klik Play Game

App membuat window utama

Logic memulai:

Game loop (60 FPS ‒ Timer)

Timer spawn pipa

View menggambar objek (player, pipes, text)

Player tekan Space untuk terbang

Jika tabrakan → Game Over

Tekan R untuk restart

✅ Fitur Utama

Gerakan player dengan gravitasi

Spawn pipa otomatis

Deteksi tabrakan (collision)

Sistem skor

Restart dengan tombol R

Main Menu (Play & Exit)

🧠 Penjelasan Alur Kode

📌 MainMenu.java

## Membuat menu awal

Tombol Play → jalankan App.main()

Tombol Exit → keluar aplikasi

📌 App.java

Membuat window utama (JFrame)

Membuat objek Logic dan View

Menjalin koneksi antara logika & tampilan

Menampilkan layar game

📌 Logic.java (Controller)

Mengatur seluruh logika game:

Fungsi penting:
Fungsi	Penjelasan
placePipes()	Menambah pipa dengan gap acak
move()	Menggerakkan player & pipes, cek collision, update skor
restartGame()	Reset game saat menekan R
actionPerformed()	Dipanggil tiap frame (60 FPS) untuk update game
keyPressed()	Space = terbang, R = restart
Mekanisme game:

Player jatuh (gravity)

Tekan SPACE → velocityY = -10

Pipes bergerak ke kiri (pipeVelocityX = -2)

Skor bertambah jika player melewati pipa

📌 Player.java (Model)

Menyimpan data burung:

Posisi

Ukuran

Gambar

Kecepatan vertikal (velocityY)

📌 Pipe.java (Model)

Menyimpan data pipa:

Posisi

Ukuran

Gambar

Status sudah dilewati atau belum (untuk skor)

📌 View.java (View)

Menggambar player dan pipa

Menampilkan skor

Menampilkan teks "GAME OVER" dan "Press 'R' to Restart"

Mendengarkan event keyboard dari Logic

⌨️ Kontrol

Tombol	Fungsi
SPACE	Burung melompat
R	Restart (saat Game Over)
ESC (window)	Exit

📂 Struktur Folder
FlappyBird/

│

├─ Assets/

│   ├─ bird.png

│   ├─ lowerPipe.png

│   └─ upperPipe.png

│

├─ App.java

├─ Logic.java

├─ MainMenu.java

├─ Pipe.java

├─ Player.java

└─ View.java

# Dokumentasi

https://github.com/user-attachments/assets/74a7d637-7f98-4b8d-a0f1-26e87f6b5ee0
