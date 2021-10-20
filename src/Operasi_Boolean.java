public class Operasi_Boolean {
    public static void main(String[] args) {
        // Operasi Boolean di Java (&&, ||, !).
        // Operasi boolean adalah operasi yang digunakan untuk dua data boolean.

        // Contoh Penggunaan Operasi Boolean.
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 74;

        var lulus = lulusAbsen && lulusNilaiAkhir;                  // Operator && (AND)
        var lulusTetapSemangat = lulusAbsen || lulusNilaiAkhir;     // Operator || (OR)
        System.out.println("Hasil Kelulusan: " + lulus);
        System.out.println("Hasil Kelulusan Bersyarat: " + lulusTetapSemangat);

        if (lulusTetapSemangat == true){
            System.out.println("Semangat Menggapai Mimpi!");
        }

    }
}