package id.infinitelearning.KotlinSubmission.exercise4
import java.util.*

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        val scanner = Scanner(System.`in`)
        print("Masukkan angka: ")
        val angka = scanner.nextInt()
        println("Anda memasukkan angka: $angka")
    } catch (e: InputMismatchException) {
        println("Terjadi kesalahan: Input yang dimasukkan tidak sesuai.")
    }
}

