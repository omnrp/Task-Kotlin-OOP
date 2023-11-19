package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val nama_depan = "Wahyu"
    val nama_belakang = "Purnomo"
    var umur = 19
    var single_atau_tidak = true

    println("Nama : $nama_depan  $nama_belakang")
    println("Umur : $umur")
    println("Status : $single_atau_tidak")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama Grup kami adalah $groupId")
    println("Nama - nama member grup $groupMember")
    println("Sesi grup $session")
    return ""

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    var groupMember = listOf("Wahyu", "Rafi", "Shofi", "Pangeran", "Faisal", "Deri", "Serly", "Shoffiyah", "Naufal", "Tari")
    val namaku = groupMember[0]
    return listOf(namaku)
    println(namaku)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Sarief Hidayatullah", "Megy Permana")
    val countOfGroup = arrayOf<String>("Wahyu", "Rafi", "Shofi", "Pangeran", "Faisal", "Deri", "Serly", "Shoffiyah", "Naufal", "Tari")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("UMI", listOf("Wahyu", "Rafi", "Shofi", "Pangeran", "Faisal", "Deri", "Serly", "Shoffiyah", "Naufal", "Tari"), "Morning")
}