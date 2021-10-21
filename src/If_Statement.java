public class If_Statement {
    public static void main(String[] args) {
        // If statement di Java.
        // Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan.
        // Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi.
        // Hampir di semua bahasa pemrograman mendukung if expression.

        // Contoh penggunaan if statement di Java.
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        }else {
            System.out.println("Harus Tetap Semangat!");
        }


        // Contoh penggunaan if, else if, else.
        if (nilai >= 80 && absen >= 80){
            System.out.println("Nilai Anda A");
        }else if(nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda B");
        }else if(nilai >= 60 && absen >= 60){
            System.out.println("Nilai Anda C");
        }else if(nilai >= 50 && absen >= 50){
            System.out.println("Nilai Anda D");
        }else{
            System.out.println("Nilai Anda E");
        }

    }
}