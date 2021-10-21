public class Ternary_Operator {
    public static void main(String[] args) {
        // Ternary Operator di Java (?).
        // Ternary Operator adalah operator sederhana dari if statement.
        // Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua yang diambil.

        // Contoh Penggunaan Ternary Operator.

        var nilai = 75;
        String ucapan;

        // contoh if statement sederhana.
        if (nilai >= 75){
            ucapan = "Selamat yaa Anda Lulus..";
        }else{
            ucapan = "Tetap Semangat!, Jangan Menyerah!";
        };
        System.out.println(ucapan);

        // contoh penggunaan ternary operator.
        ucapan = nilai >= 75 ? "Selamat dan tetap semangat!" : "Tetap semangat dan pantang menyerah, Terus Mencoba!!!"; // contoh penggunaan ternary operator di Java.
        System.out.println("");
        System.out.println("Penggunaan ternary operator di Java");
        System.out.println(ucapan);

    }
}